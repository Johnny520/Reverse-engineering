.class public Lo7/b;
.super Lk7/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lk7/e;


# instance fields
.field public k:Lz7/c;

.field public l:Lk7/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lo7/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lo7/b;-><init>(Lk7/f;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(Lk7/f;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lk7/a;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lz7/c;->o:Lz7/b;

    .line 5
    .line 6
    iput-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 7
    .line 8
    iput-object p1, p0, Lo7/b;->l:Lk7/f;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final C(Ljava/io/ByteArrayOutputStream;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lo7/b;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v1, v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lo7/b;->Q(I)Lk7/a;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-virtual {v3, p1}, Lk7/a;->K(Ljava/io/ByteArrayOutputStream;)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    add-int/2addr v3, v2

    .line 21
    move v2, v3

    .line 22
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return v2
.end method

.method public L(ILk7/a;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p0}, Lo7/b;->g0()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p1}, Lk7/a;->H(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2, p0}, Lk7/a;->J(Lk7/a;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Lz7/c;->add(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lo7/b;->h0(I)Z

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lo7/b;->U()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public M(Lk7/a;)Z
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    invoke-virtual {p0}, Lo7/b;->g0()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lo7/b;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p1, v0}, Lk7/a;->H(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p0}, Lk7/a;->J(Lk7/a;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lz7/c;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-virtual {p0}, Lo7/b;->U()V

    .line 25
    .line 26
    .line 27
    return p1
.end method

.method public final N()V
    .locals 4

    .line 1
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz7/c;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0}, Lo7/b;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    if-ge v1, v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, Lo7/b;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    add-int/lit8 v2, v2, -0x1

    .line 22
    .line 23
    iget-object v3, p0, Lo7/b;->k:Lz7/c;

    .line 24
    .line 25
    invoke-virtual {v3, v2}, Lz7/c;->remove(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lk7/a;

    .line 30
    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const/4 v3, 0x0

    .line 35
    invoke-virtual {v2, v3}, Lk7/a;->J(Lk7/a;)V

    .line 36
    .line 37
    .line 38
    const/4 v3, -0x1

    .line 39
    invoke-virtual {v2, v3}, Lk7/a;->H(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lo7/b;->U()V

    .line 43
    .line 44
    .line 45
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-virtual {p0}, Lo7/b;->S()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lo7/b;->U()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final O(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lo7/b;->l:Lk7/f;

    .line 2
    .line 3
    invoke-virtual {p0}, Lo7/b;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-le p1, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lo7/b;->c0(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-interface {v0}, Lk7/d;->n()Lk7/a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0, p1, v0}, Lo7/b;->L(ILk7/a;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final P()Lk7/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lo7/b;->l:Lk7/f;

    .line 2
    .line 3
    invoke-virtual {p0}, Lo7/b;->size()I

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, Lk7/d;->n()Lk7/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0, v0}, Lo7/b;->M(Lk7/a;)Z

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final Q(I)Lk7/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ge p1, v0, :cond_1

    .line 8
    .line 9
    if-gez p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 13
    .line 14
    iget-object v0, v0, Lz7/c;->g:[Ljava/lang/Object;

    .line 15
    .line 16
    aget-object p1, v0, p1

    .line 17
    .line 18
    check-cast p1, Lk7/a;

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 22
    return-object p1
.end method

.method public R()Z
    .locals 1

    .line 1
    instance-of v0, p0, Ls7/f;

    .line 2
    .line 3
    return v0
.end method

.method public final S()V
    .locals 1

    .line 1
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    instance-of v0, v0, Lz7/b;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    sget-object v0, Lz7/c;->o:Lz7/b;

    .line 12
    .line 13
    iput-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 14
    .line 15
    return-void
.end method

.method public final T(ILk7/a;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-gez p1, :cond_0

    .line 3
    .line 4
    move p1, v0

    .line 5
    :cond_0
    iget-object v1, p0, Lo7/b;->k:Lz7/c;

    .line 6
    .line 7
    iget v2, p2, Lk7/a;->g:I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    invoke-virtual {v1, p2, v3, v2}, Lz7/c;->f(Ljava/lang/Object;ZI)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget-object v2, p0, Lo7/b;->k:Lz7/c;

    .line 15
    .line 16
    invoke-virtual {v2, p2, v0, v0}, Lz7/c;->f(Ljava/lang/Object;ZI)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-ltz p2, :cond_5

    .line 21
    .line 22
    if-eq p2, p1, :cond_5

    .line 23
    .line 24
    if-gez p1, :cond_1

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_1
    add-int/lit8 v4, p1, 0x1

    .line 28
    .line 29
    invoke-virtual {v2}, Lz7/c;->size()I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-le v4, v5, :cond_2

    .line 34
    .line 35
    invoke-virtual {v2, v4, v0}, Lz7/c;->h(IZ)V

    .line 36
    .line 37
    .line 38
    :cond_2
    iget-boolean v4, v2, Lz7/c;->l:Z

    .line 39
    .line 40
    iput-boolean v3, v2, Lz7/c;->l:Z

    .line 41
    .line 42
    iget-object v3, v2, Lz7/c;->g:[Ljava/lang/Object;

    .line 43
    .line 44
    aget-object v5, v3, p2

    .line 45
    .line 46
    if-le p2, p1, :cond_3

    .line 47
    .line 48
    :goto_0
    if-le p2, p1, :cond_4

    .line 49
    .line 50
    add-int/lit8 v6, p2, -0x1

    .line 51
    .line 52
    aget-object v6, v3, v6

    .line 53
    .line 54
    aput-object v6, v3, p2

    .line 55
    .line 56
    add-int/lit8 p2, p2, -0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    :goto_1
    if-ge p2, p1, :cond_4

    .line 60
    .line 61
    add-int/lit8 v6, p2, 0x1

    .line 62
    .line 63
    aget-object v7, v3, v6

    .line 64
    .line 65
    aput-object v7, v3, p2

    .line 66
    .line 67
    move p2, v6

    .line 68
    goto :goto_1

    .line 69
    :cond_4
    aput-object v5, v3, p1

    .line 70
    .line 71
    iput-object v3, v2, Lz7/c;->g:[Ljava/lang/Object;

    .line 72
    .line 73
    iput-boolean v4, v2, Lz7/c;->l:Z

    .line 74
    .line 75
    iput v0, v2, Lz7/c;->k:I

    .line 76
    .line 77
    :cond_5
    :goto_2
    invoke-virtual {p0, v1, p1}, Lo7/b;->i0(II)Z

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public U()V
    .locals 2

    .line 1
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput v1, v0, Lz7/c;->k:I

    .line 5
    .line 6
    return-void
.end method

.method public V()V
    .locals 0

    .line 1
    return-void
.end method

.method public W(Lk7/a;)V
    .locals 0

    .line 1
    return-void
.end method

.method public X()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lo7/b;->U()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public Y(Lq7/b;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lo7/b;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lo7/b;->Q(I)Lk7/a;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2, p1}, Lk7/a;->G(Lq7/b;)V

    .line 13
    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Lo7/b;->U()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public Z()V
    .locals 3

    .line 1
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    instance-of v2, v1, Lk7/e;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    check-cast v1, Lk7/e;

    .line 22
    .line 23
    invoke-interface {v1}, Lk7/e;->c()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    return-void
.end method

.method public final a0(Lk7/a;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 5
    .line 6
    iget v1, p1, Lk7/a;->g:I

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-virtual {v0, p1, v2, v1}, Lz7/c;->f(Ljava/lang/Object;ZI)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-gez v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {v0, p1, v2, v1}, Lz7/c;->f(Ljava/lang/Object;ZI)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    :cond_1
    if-gez v0, :cond_2

    .line 23
    .line 24
    :goto_0
    return-void

    .line 25
    :cond_2
    iget-object v1, p0, Lo7/b;->k:Lz7/c;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Lz7/c;->remove(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lo7/b;->h0(I)Z

    .line 34
    .line 35
    .line 36
    const/4 v0, -0x1

    .line 37
    invoke-virtual {p1, v0}, Lk7/a;->H(I)V

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    invoke-virtual {p1, v0}, Lk7/a;->J(Lk7/a;)V

    .line 42
    .line 43
    .line 44
    :cond_3
    invoke-virtual {p0}, Lo7/b;->U()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final b0(Lk7/f;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lo7/b;->l:Lk7/f;

    .line 2
    .line 3
    iget-object p1, p0, Lo7/b;->k:Lz7/c;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    instance-of p1, p1, Lz7/b;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object p1, p0, Lo7/b;->l:Lk7/f;

    .line 14
    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, Lo7/b;->k:Lz7/c;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-object v0, p1, Lz7/c;->h:Le9/a;

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    new-instance v0, Le9/a;

    .line 24
    .line 25
    const/4 v1, 0x3

    .line 26
    invoke-direct {v0, p0, v1, p1}, Le9/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lo7/b;->k:Lz7/c;

    .line 30
    .line 31
    iput-object v0, p1, Lz7/c;->h:Le9/a;

    .line 32
    .line 33
    return-void
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk7/a;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 7
    .line 8
    invoke-virtual {v0}, Lz7/c;->m()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 12
    .line 13
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Lo7/b;->S()V

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-virtual {p0}, Lo7/b;->V()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lo7/b;->Z()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lo7/b;->X()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lo7/b;->U()V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public c0(I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lo7/b;->d0(IZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public d0(IZ)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lo7/b;->S()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lo7/b;->l:Lk7/f;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lo7/b;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-ge p1, v0, :cond_2

    .line 18
    .line 19
    :cond_1
    invoke-virtual {p0}, Lo7/b;->g0()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 23
    .line 24
    invoke-virtual {v0, p1, p2}, Lz7/c;->h(IZ)V

    .line 25
    .line 26
    .line 27
    if-nez p1, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Lo7/b;->S()V

    .line 30
    .line 31
    .line 32
    :cond_2
    return-void
.end method

.method public e0()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lo7/b;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x0

    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    return v2

    .line 10
    :cond_0
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 11
    .line 12
    new-instance v1, Lke/h;

    .line 13
    .line 14
    const/16 v3, 0x1b

    .line 15
    .line 16
    invoke-direct {v1, p0, v3}, Lke/h;-><init>(Ljava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lz7/c;->k(Lz7/t;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0, v2}, Lo7/b;->h0(I)Z

    .line 26
    .line 27
    .line 28
    :cond_1
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    if-eqz p1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    check-cast p1, Lo7/b;

    .line 19
    .line 20
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 21
    .line 22
    iget-object p1, p1, Lo7/b;->k:Lz7/c;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lz7/c;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1

    .line 29
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 30
    return p1
.end method

.method public final f0(Ljava/util/function/Predicate;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lo7/b;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    iget-object v1, p0, Lo7/b;->k:Lz7/c;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/lit8 v2, v2, -0x1

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    :goto_0
    if-ltz v2, :cond_0

    .line 20
    .line 21
    iget-object v4, v1, Lz7/c;->g:[Ljava/lang/Object;

    .line 22
    .line 23
    aget-object v4, v4, v2

    .line 24
    .line 25
    invoke-interface {p1, v4}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    add-int/lit8 v2, v2, -0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    sub-int p1, v0, v3

    .line 37
    .line 38
    :goto_1
    if-le v0, p1, :cond_2

    .line 39
    .line 40
    iget-object v1, p0, Lo7/b;->k:Lz7/c;

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Lz7/c;->remove(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Lk7/a;

    .line 47
    .line 48
    if-nez v1, :cond_1

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_1
    const/4 v2, 0x0

    .line 52
    invoke-virtual {v1, v2}, Lk7/a;->J(Lk7/a;)V

    .line 53
    .line 54
    .line 55
    const/4 v2, -0x1

    .line 56
    invoke-virtual {v1, v2}, Lk7/a;->H(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v0}, Lo7/b;->h0(I)Z

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lo7/b;->U()V

    .line 63
    .line 64
    .line 65
    :goto_2
    add-int/lit8 v0, v0, -0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    return-void
.end method

.method public final g0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    instance-of v0, v0, Lz7/b;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance v0, Lz7/c;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, v1}, Lz7/c;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 18
    .line 19
    iget-object v1, p0, Lo7/b;->l:Lk7/f;

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    iput-object v1, v0, Lz7/c;->h:Le9/a;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    new-instance v2, Le9/a;

    .line 28
    .line 29
    const/4 v3, 0x3

    .line 30
    invoke-direct {v2, p0, v3, v1}, Le9/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-object v2, v0, Lz7/c;->h:Le9/a;

    .line 34
    .line 35
    :goto_0
    new-instance v1, Lm/a;

    .line 36
    .line 37
    const/16 v2, 0x9

    .line 38
    .line 39
    invoke-direct {v1, p0, v2}, Lm/a;-><init>(Ljava/lang/Object;I)V

    .line 40
    .line 41
    .line 42
    iput-object v1, v0, Lz7/c;->m:Lm/a;

    .line 43
    .line 44
    return-void
.end method

.method public final h0(I)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lo7/b;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, p1, v0}, Lo7/b;->i0(II)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz7/c;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final i0(II)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-gez p1, :cond_0

    .line 3
    .line 4
    move p1, v0

    .line 5
    :cond_0
    if-le p1, p2, :cond_1

    .line 6
    .line 7
    move v5, p2

    .line 8
    move p2, p1

    .line 9
    move p1, v5

    .line 10
    :cond_1
    const/4 v1, 0x1

    .line 11
    add-int/2addr p2, v1

    .line 12
    invoke-virtual {p0}, Lo7/b;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-le p2, v2, :cond_2

    .line 17
    .line 18
    move p2, v2

    .line 19
    :cond_2
    iget-object v2, p0, Lo7/b;->k:Lz7/c;

    .line 20
    .line 21
    :goto_0
    if-ge p1, p2, :cond_4

    .line 22
    .line 23
    iget-object v3, v2, Lz7/c;->g:[Ljava/lang/Object;

    .line 24
    .line 25
    aget-object v3, v3, p1

    .line 26
    .line 27
    check-cast v3, Lk7/a;

    .line 28
    .line 29
    iget v4, v3, Lk7/a;->g:I

    .line 30
    .line 31
    if-eq v4, p1, :cond_3

    .line 32
    .line 33
    invoke-virtual {v3, p1}, Lk7/a;->H(I)V

    .line 34
    .line 35
    .line 36
    move v0, v1

    .line 37
    :cond_3
    add-int/lit8 p1, p1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public p()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lo7/b;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0}, Lo7/b;->R()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Lo7/b;->Q(I)Lk7/a;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Lk7/a;->p()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    mul-int/2addr v1, v0

    .line 23
    return v1

    .line 24
    :cond_0
    move v2, v1

    .line 25
    :goto_0
    if-ge v1, v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Lo7/b;->Q(I)Lk7/a;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3}, Lk7/a;->p()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    add-int/2addr v2, v3

    .line 36
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    return v2

    .line 40
    :cond_2
    return v1
.end method

.method public final r()[B
    .locals 3

    .line 1
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lk7/a;

    .line 19
    .line 20
    invoke-virtual {v2}, Lk7/a;->r()[B

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v1, v2}, Lk7/a;->o([B[B)[B

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-object v1
.end method

.method public final removeIf(Ljava/util/function/Predicate;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lz7/c;->removeIf(Ljava/util/function/Predicate;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0}, Lo7/b;->h0(I)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    return p1
.end method

.method public size()I
    .locals 1

    .line 1
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final toString()Ljava/lang/String;
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
    invoke-virtual {p0}, Lo7/b;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public z(Lf6/b;)V
    .locals 3

    .line 1
    iget-boolean v0, p1, Lf6/b;->b:Z

    .line 2
    .line 3
    iget-object v1, p1, Lf6/b;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lk7/a;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_4

    .line 10
    :cond_0
    if-ne v1, p0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p1, Lf6/b;->b:Z

    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    invoke-virtual {p0}, Lo7/b;->size()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    if-nez v1, :cond_3

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_3
    invoke-virtual {p0}, Lo7/b;->R()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v2, 0x0

    .line 31
    if-nez v0, :cond_4

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_4
    invoke-virtual {p0, v2}, Lo7/b;->Q(I)Lk7/a;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-eq v0, v1, :cond_6

    .line 47
    .line 48
    :goto_0
    invoke-virtual {p0}, Lo7/b;->p()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean v1, p1, Lf6/b;->b:Z

    .line 53
    .line 54
    if-nez v1, :cond_8

    .line 55
    .line 56
    if-nez v0, :cond_5

    .line 57
    .line 58
    goto :goto_4

    .line 59
    :cond_5
    iget v1, p1, Lf6/b;->c:I

    .line 60
    .line 61
    add-int/2addr v1, v0

    .line 62
    iput v1, p1, Lf6/b;->c:I

    .line 63
    .line 64
    return-void

    .line 65
    :cond_6
    :goto_1
    invoke-virtual {p0}, Lo7/b;->size()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    :goto_2
    if-ge v2, v0, :cond_8

    .line 70
    .line 71
    iget-boolean v1, p1, Lf6/b;->b:Z

    .line 72
    .line 73
    if-nez v1, :cond_8

    .line 74
    .line 75
    invoke-virtual {p0, v2}, Lo7/b;->Q(I)Lk7/a;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-nez v1, :cond_7

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_7
    invoke-virtual {v1, p1}, Lk7/a;->z(Lf6/b;)V

    .line 83
    .line 84
    .line 85
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_8
    :goto_4
    return-void
.end method
