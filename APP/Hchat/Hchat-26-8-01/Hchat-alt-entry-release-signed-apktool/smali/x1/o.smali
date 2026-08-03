.class public final Lx1/o;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/List;
.implements Lhg/a;


# instance fields
.field public final g:I

.field public final h:I

.field public final synthetic i:Lx1/p;


# direct methods
.method public constructor <init>(Lx1/p;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx1/o;->i:Lx1/p;

    .line 5
    .line 6
    iput p2, p0, Lx1/o;->g:I

    .line 7
    .line 8
    iput p3, p0, Lx1/o;->h:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final bridge synthetic add(ILjava/lang/Object;)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p2, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public final bridge synthetic add(Ljava/lang/Object;)Z
    .locals 1

    .line 9
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p2, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    .line 9
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final clear()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Ly0/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Ly0/n;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lx1/o;->indexOf(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 v0, -0x1

    .line 14
    if-eq p1, v0, :cond_1

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    :cond_1
    return v1
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    check-cast p1, Ljava/lang/Iterable;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ly0/n;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lx1/o;->contains(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    return p1

    .line 27
    :cond_1
    const/4 p1, 0x1

    .line 28
    return p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/o;->i:Lx1/p;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/p;->g:Lf/f0;

    .line 4
    .line 5
    iget v1, p0, Lx1/o;->g:I

    .line 6
    .line 7
    add-int/2addr p1, v1

    .line 8
    invoke-virtual {v0, p1}, Lf/f0;->f(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p1, Ly0/n;

    .line 16
    .line 17
    return-object p1
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 4

    .line 1
    instance-of v0, p1, Ly0/n;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    check-cast p1, Ly0/n;

    .line 7
    .line 8
    iget v0, p0, Lx1/o;->g:I

    .line 9
    .line 10
    iget v1, p0, Lx1/o;->h:I

    .line 11
    .line 12
    if-gt v0, v1, :cond_2

    .line 13
    .line 14
    move v2, v0

    .line 15
    :goto_0
    iget-object v3, p0, Lx1/o;->i:Lx1/p;

    .line 16
    .line 17
    iget-object v3, v3, Lx1/p;->g:Lf/f0;

    .line 18
    .line 19
    invoke-virtual {v3, v2}, Lf/f0;->f(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-static {v3, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    sub-int/2addr v2, v0

    .line 30
    return v2

    .line 31
    :cond_1
    if-eq v2, v1, :cond_2

    .line 32
    .line 33
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    :goto_1
    const/4 p1, -0x1

    .line 37
    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lx1/o;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 4

    .line 1
    new-instance v0, Luf/a;

    .line 2
    .line 3
    iget v1, p0, Lx1/o;->g:I

    .line 4
    .line 5
    iget v2, p0, Lx1/o;->h:I

    .line 6
    .line 7
    iget-object v3, p0, Lx1/o;->i:Lx1/p;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v1, v2}, Luf/a;-><init>(Lx1/p;III)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final lastIndexOf(Ljava/lang/Object;)I
    .locals 3

    .line 1
    instance-of v0, p1, Ly0/n;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    check-cast p1, Ly0/n;

    .line 7
    .line 8
    iget v0, p0, Lx1/o;->h:I

    .line 9
    .line 10
    iget v1, p0, Lx1/o;->g:I

    .line 11
    .line 12
    if-gt v1, v0, :cond_2

    .line 13
    .line 14
    :goto_0
    iget-object v2, p0, Lx1/o;->i:Lx1/p;

    .line 15
    .line 16
    iget-object v2, v2, Lx1/p;->g:Lf/f0;

    .line 17
    .line 18
    invoke-virtual {v2, v0}, Lf/f0;->f(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {v2, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    sub-int/2addr v0, v1

    .line 29
    return v0

    .line 30
    :cond_1
    if-eq v0, v1, :cond_2

    .line 31
    .line 32
    add-int/lit8 v0, v0, -0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    :goto_1
    const/4 p1, -0x1

    .line 36
    return p1
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .locals 4

    .line 14
    new-instance v0, Luf/a;

    iget v1, p0, Lx1/o;->g:I

    iget v2, p0, Lx1/o;->h:I

    iget-object v3, p0, Lx1/o;->i:Lx1/p;

    invoke-direct {v0, v3, v1, v1, v2}, Luf/a;-><init>(Lx1/p;III)V

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 4

    .line 1
    new-instance v0, Luf/a;

    .line 2
    .line 3
    iget v1, p0, Lx1/o;->g:I

    .line 4
    .line 5
    add-int/2addr p1, v1

    .line 6
    iget v2, p0, Lx1/o;->h:I

    .line 7
    .line 8
    iget-object v3, p0, Lx1/o;->i:Lx1/p;

    .line 9
    .line 10
    invoke-direct {v0, v3, p1, v1, v2}, Luf/a;-><init>(Lx1/p;III)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final bridge synthetic remove(I)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    .line 9
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public final replaceAll(Ljava/util/function/UnaryOperator;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public final bridge synthetic set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p2, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public final size()I
    .locals 2

    .line 1
    iget v0, p0, Lx1/o;->h:I

    .line 2
    .line 3
    iget v1, p0, Lx1/o;->g:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    return v0
.end method

.method public final sort(Ljava/util/Comparator;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public final subList(II)Ljava/util/List;
    .locals 2

    .line 1
    new-instance v0, Lx1/o;

    .line 2
    .line 3
    iget v1, p0, Lx1/o;->g:I

    .line 4
    .line 5
    add-int/2addr p1, v1

    .line 6
    add-int/2addr v1, p2

    .line 7
    iget-object p2, p0, Lx1/o;->i:Lx1/p;

    .line 8
    .line 9
    invoke-direct {v0, p2, p1, v1}, Lx1/o;-><init>(Lx1/p;II)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p0}, Lgg/k;->a(Ljava/util/Collection;)[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0

    .line 6
    invoke-static {p0, p1}, Lgg/k;->b(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
