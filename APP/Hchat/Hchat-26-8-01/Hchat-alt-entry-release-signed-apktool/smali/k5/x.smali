.class public final Lk5/x;
.super Ljava/util/AbstractSequentialList;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic g:Ljava/util/List;

.field public final synthetic h:Lk5/z;


# direct methods
.method public constructor <init>(Lk5/z;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk5/x;->h:Lk5/z;

    .line 2
    .line 3
    iput-object p2, p0, Lk5/x;->g:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/util/AbstractSequentialList;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(I)Lo5/q;
    .locals 3

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Lk5/x;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, p1, :cond_0

    .line 9
    .line 10
    move-object v2, v0

    .line 11
    check-cast v2, Lo5/q;

    .line 12
    .line 13
    invoke-virtual {v2}, Lo5/q;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    check-cast v0, Lo5/q;

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_1
    invoke-static {}, Lbsh/j;->e()V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 7

    .line 1
    new-instance v0, Lo5/q;

    .line 2
    .line 3
    iget-object v1, p0, Lk5/x;->h:Lk5/z;

    .line 4
    .line 5
    iget-object v2, v1, Lk5/z;->j:Lk5/u;

    .line 6
    .line 7
    iget v3, v1, Lk5/z;->n:I

    .line 8
    .line 9
    if-lez v3, :cond_0

    .line 10
    .line 11
    iget-object v4, v2, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 12
    .line 13
    invoke-virtual {v4, v3}, Landroidx/lifecycle/x;->N(I)I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    new-instance v5, Lk5/y;

    .line 18
    .line 19
    const/4 v6, 0x3

    .line 20
    invoke-direct {v5, v2, v3, v4, v6}, Lk5/y;-><init>(Ljava/lang/Object;III)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 25
    .line 26
    :goto_0
    invoke-virtual {v1}, Lk5/z;->i1()Lac/k;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {v1}, Lac/k;->n()Lo5/j;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Lo5/j;->a()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-static {}, Ljava/util/Collections;->emptyIterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :goto_1
    iget-object v2, p0, Lk5/x;->g:Ljava/util/List;

    .line 46
    .line 47
    invoke-direct {v0, v2, v5, v1}, Lo5/q;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/Iterator;)V

    .line 48
    .line 49
    .line 50
    return-object v0
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .locals 1

    const/4 v0, 0x0

    .line 17
    invoke-virtual {p0, v0}, Lk5/x;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lk5/x;->a(I)Lo5/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0
    :try_end_0
    .catch Ljava/util/NoSuchElementException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    new-instance v1, Ld6/a;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1, v0}, Ld6/a;-><init>(Lk5/x;ILo5/q;)V

    .line 8
    .line 9
    .line 10
    return-object v1

    .line 11
    :catch_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 14
    .line 15
    .line 16
    throw p1
.end method

.method public final size()I
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/x;->g:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
