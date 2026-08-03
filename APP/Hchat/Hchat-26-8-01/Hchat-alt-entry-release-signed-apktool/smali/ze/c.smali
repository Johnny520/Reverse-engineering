.class public final Lze/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final g:Lud/r;

.field public final h:Ljava/util/BitSet;


# direct methods
.method public constructor <init>(Lud/r;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lze/c;->g:Lud/r;

    .line 5
    .line 6
    new-instance v0, Ljava/util/BitSet;

    .line 7
    .line 8
    iget-object p1, p1, Lud/r;->z:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-direct {v0, p1}, Ljava/util/BitSet;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lze/c;->h:Ljava/util/BitSet;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(Lud/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lze/c;->h:Ljava/util/BitSet;

    .line 2
    .line 3
    iget p1, p1, Lud/a;->j:I

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/BitSet;->set(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final b(Lud/a;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lze/c;->h:Ljava/util/BitSet;

    .line 2
    .line 3
    iget p1, p1, Lud/a;->j:I

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/BitSet;->get(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final c()Ljava/util/List;
    .locals 5

    .line 1
    iget-object v0, p0, Lze/c;->h:Ljava/util/BitSet;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    sget-object v1, Lxe/g;->g:Lxe/g;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-virtual {v0}, Ljava/util/BitSet;->cardinality()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    iget-object v2, p0, Lze/c;->g:Lud/r;

    .line 20
    .line 21
    iget-object v2, v2, Lud/r;->z:Ljava/util/List;

    .line 22
    .line 23
    new-instance v3, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    :goto_0
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-ltz v1, :cond_2

    .line 34
    .line 35
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Lud/a;

    .line 40
    .line 41
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    return-object v3

    .line 48
    :cond_3
    :goto_1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 49
    .line 50
    return-object v0
.end method

.method public final forEach(Ljava/util/function/Consumer;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lze/c;->h:Ljava/util/BitSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/BitSet;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    iget-object v1, p0, Lze/c;->g:Lud/r;

    .line 11
    .line 12
    iget-object v1, v1, Lud/r;->z:Ljava/util/List;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    invoke-virtual {v0, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-ltz v2, :cond_1

    .line 20
    .line 21
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {p1, v3}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    :goto_1
    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 4

    .line 1
    new-instance v0, Lze/b;

    .line 2
    .line 3
    iget-object v1, p0, Lze/c;->h:Ljava/util/BitSet;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/BitSet;->cardinality()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iget-object v3, p0, Lze/c;->g:Lud/r;

    .line 10
    .line 11
    iget-object v3, v3, Lud/r;->z:Ljava/util/List;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3}, Lze/b;-><init>(Ljava/util/BitSet;ILjava/util/List;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final spliterator()Ljava/util/Spliterator;
    .locals 4

    .line 1
    iget-object v0, p0, Lze/c;->h:Ljava/util/BitSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/BitSet;->cardinality()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    new-instance v2, Lze/b;

    .line 8
    .line 9
    iget-object v3, p0, Lze/c;->g:Lud/r;

    .line 10
    .line 11
    iget-object v3, v3, Lud/r;->z:Ljava/util/List;

    .line 12
    .line 13
    invoke-direct {v2, v0, v1, v3}, Lze/b;-><init>(Ljava/util/BitSet;ILjava/util/List;)V

    .line 14
    .line 15
    .line 16
    int-to-long v0, v1

    .line 17
    const/16 v3, 0x11

    .line 18
    .line 19
    invoke-static {v2, v0, v1, v3}, Ljava/util/Spliterators;->spliterator(Ljava/util/Iterator;JI)Ljava/util/Spliterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lze/c;->c()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
