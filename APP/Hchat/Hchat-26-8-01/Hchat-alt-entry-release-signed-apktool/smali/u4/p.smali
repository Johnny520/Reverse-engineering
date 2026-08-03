.class public final Lu4/p;
.super Lz4/e;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lw4/e;


# static fields
.field public static final i:Lu4/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lu4/p;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lz4/e;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lu4/p;->i:Lu4/p;

    .line 8
    .line 9
    return-void
.end method

.method public static p(Lu4/o;)Lu4/p;
    .locals 2

    .line 1
    new-instance v0, Lu4/p;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lz4/e;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1, p0}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static q(Lu4/o;Lu4/o;)Lu4/p;
    .locals 2

    .line 1
    new-instance v0, Lu4/p;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lz4/e;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1, p0}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    invoke-virtual {v0, p0, p1}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method


# virtual methods
.method public final d(Lw4/c;)Lw4/e;
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "unsupported"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public final getType(I)Lw4/c;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lu4/o;

    .line 6
    .line 7
    iget-object p1, p1, Lu4/o;->h:Lw4/d;

    .line 8
    .line 9
    invoke-interface {p1}, Lw4/d;->getType()Lw4/c;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    return-object p1
.end method

.method public final o()I
    .locals 4

    .line 1
    iget-object v0, p0, Lz4/e;->h:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    :goto_0
    if-ge v1, v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lu4/p;->getType(I)Lw4/c;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-virtual {v3}, Lw4/c;->i()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    add-int/2addr v2, v3

    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return v2
.end method

.method public final r(ZLjava/util/BitSet;)Lu4/p;
    .locals 7

    .line 1
    iget-object v0, p0, Lz4/e;->h:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    return-object p0

    .line 7
    :cond_0
    new-instance v2, Lu4/p;

    .line 8
    .line 9
    array-length v0, v0

    .line 10
    invoke-direct {v2, v0}, Lz4/e;-><init>(I)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    move v3, v0

    .line 15
    move v4, v3

    .line 16
    :goto_0
    if-ge v3, v1, :cond_3

    .line 17
    .line 18
    invoke-virtual {p0, v3}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    check-cast v5, Lu4/o;

    .line 23
    .line 24
    if-nez p2, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-virtual {p2, v3}, Ljava/util/BitSet;->get(I)Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-nez v6, :cond_2

    .line 32
    .line 33
    :goto_1
    invoke-virtual {v5, v4}, Lu4/o;->o(I)Lu4/o;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    if-nez p1, :cond_2

    .line 38
    .line 39
    invoke-virtual {v5}, Lu4/o;->j()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    add-int/2addr v4, p1

    .line 44
    :cond_2
    invoke-virtual {v2, v3, v5}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    move p1, v0

    .line 50
    goto :goto_0

    .line 51
    :cond_3
    iget-boolean p1, p0, Lz4/j;->g:Z

    .line 52
    .line 53
    if-nez p1, :cond_4

    .line 54
    .line 55
    iput-boolean v0, v2, Lz4/j;->g:Z

    .line 56
    .line 57
    :cond_4
    return-object v2
.end method

.method public final s(I)Lu4/p;
    .locals 6

    .line 1
    iget-object v0, p0, Lz4/e;->h:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object p0

    .line 7
    :cond_0
    new-instance v1, Lu4/p;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Lz4/e;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v2

    .line 14
    :goto_0
    if-ge v3, v0, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0, v3}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    check-cast v4, Lu4/o;

    .line 21
    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    iget v5, v4, Lu4/o;->g:I

    .line 26
    .line 27
    add-int/2addr v5, p1

    .line 28
    invoke-virtual {v4, v5}, Lu4/o;->o(I)Lu4/o;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    :goto_1
    invoke-virtual {v1, v3, v4}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    iget-boolean p1, p0, Lz4/j;->g:Z

    .line 39
    .line 40
    if-nez p1, :cond_3

    .line 41
    .line 42
    iput-boolean v2, v1, Lz4/j;->g:Z

    .line 43
    .line 44
    :cond_3
    return-object v1
.end method
