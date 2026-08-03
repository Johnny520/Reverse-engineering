.class public final Ltf/z;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/ListIterator;
.implements Lhg/a;


# instance fields
.field public final synthetic g:I

.field public final h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lgg/s;Lw0/x;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ltf/z;->g:I

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Ltf/z;->h:Ljava/lang/Object;

    iput-object p2, p0, Ltf/z;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Log/g;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ltf/z;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ltf/z;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v0, p1, Log/g;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ljava/util/List;

    .line 12
    .line 13
    invoke-static {p2, p1}, Ltf/m;->l1(ILjava/util/List;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-interface {v0, p1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Ltf/z;->h:Ljava/lang/Object;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Ltf/a0;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ltf/z;->g:I

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Ltf/z;->i:Ljava/lang/Object;

    .line 26
    iget-object v0, p1, Ltf/a0;->g:Ljava/util/ArrayList;

    .line 27
    invoke-static {p2, p1}, Ltf/m;->l1(ILjava/util/List;)I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    iput-object p1, p0, Ltf/z;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Ltf/z;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v0, "Cannot modify a state list through an iterator"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1

    .line 14
    :pswitch_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    const-string v0, "Operation is not supported for read-only collection"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :pswitch_1
    iget-object v0, p0, Ltf/z;->h:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ljava/util/ListIterator;

    .line 25
    .line 26
    invoke-interface {v0, p1}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final hasNext()Z
    .locals 3

    .line 1
    iget v0, p0, Ltf/z;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ltf/z;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lgg/s;

    .line 9
    .line 10
    iget v0, v0, Lgg/s;->g:I

    .line 11
    .line 12
    iget-object v1, p0, Ltf/z;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lw0/x;

    .line 15
    .line 16
    iget v1, v1, Lw0/x;->j:I

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    sub-int/2addr v1, v2

    .line 20
    if-ge v0, v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v2, 0x0

    .line 24
    :goto_0
    return v2

    .line 25
    :pswitch_0
    iget-object v0, p0, Ltf/z;->h:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/util/ListIterator;

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    return v0

    .line 34
    :pswitch_1
    iget-object v0, p0, Ltf/z;->h:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Ljava/util/ListIterator;

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    return v0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final hasPrevious()Z
    .locals 1

    .line 1
    iget v0, p0, Ltf/z;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ltf/z;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lgg/s;

    .line 9
    .line 10
    iget v0, v0, Lgg/s;->g:I

    .line 11
    .line 12
    if-ltz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    return v0

    .line 18
    :pswitch_0
    iget-object v0, p0, Ltf/z;->h:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Ljava/util/ListIterator;

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    return v0

    .line 27
    :pswitch_1
    iget-object v0, p0, Ltf/z;->h:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Ljava/util/ListIterator;

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    return v0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Ltf/z;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ltf/z;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lgg/s;

    .line 9
    .line 10
    iget v1, v0, Lgg/s;->g:I

    .line 11
    .line 12
    add-int/lit8 v1, v1, 0x1

    .line 13
    .line 14
    iget-object v2, p0, Ltf/z;->i:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lw0/x;

    .line 17
    .line 18
    iget v3, v2, Lw0/x;->j:I

    .line 19
    .line 20
    invoke-static {v1, v3}, Lw0/q;->a(II)V

    .line 21
    .line 22
    .line 23
    iput v1, v0, Lgg/s;->g:I

    .line 24
    .line 25
    invoke-virtual {v2, v1}, Lw0/x;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :pswitch_0
    iget-object v0, p0, Ltf/z;->h:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ljava/util/ListIterator;

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0

    .line 39
    :pswitch_1
    iget-object v0, p0, Ltf/z;->h:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Ljava/util/ListIterator;

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final nextIndex()I
    .locals 2

    .line 1
    iget v0, p0, Ltf/z;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ltf/z;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lgg/s;

    .line 9
    .line 10
    iget v0, v0, Lgg/s;->g:I

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    return v0

    .line 15
    :pswitch_0
    iget-object v0, p0, Ltf/z;->i:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Log/g;

    .line 18
    .line 19
    iget-object v1, p0, Ltf/z;->h:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Ljava/util/ListIterator;

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/ListIterator;->previousIndex()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    add-int/lit8 v0, v0, -0x1

    .line 32
    .line 33
    sub-int/2addr v0, v1

    .line 34
    return v0

    .line 35
    :pswitch_1
    iget-object v0, p0, Ltf/z;->i:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Ltf/a0;

    .line 38
    .line 39
    iget-object v1, p0, Ltf/z;->h:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Ljava/util/ListIterator;

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/ListIterator;->previousIndex()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-virtual {v0}, Ltf/g;->size()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    add-int/lit8 v0, v0, -0x1

    .line 52
    .line 53
    sub-int/2addr v0, v1

    .line 54
    return v0

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final previous()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Ltf/z;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ltf/z;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lgg/s;

    .line 9
    .line 10
    iget v1, v0, Lgg/s;->g:I

    .line 11
    .line 12
    iget-object v2, p0, Ltf/z;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lw0/x;

    .line 15
    .line 16
    iget v3, v2, Lw0/x;->j:I

    .line 17
    .line 18
    invoke-static {v1, v3}, Lw0/q;->a(II)V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v3, v1, -0x1

    .line 22
    .line 23
    iput v3, v0, Lgg/s;->g:I

    .line 24
    .line 25
    invoke-virtual {v2, v1}, Lw0/x;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :pswitch_0
    iget-object v0, p0, Ltf/z;->h:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ljava/util/ListIterator;

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0

    .line 39
    :pswitch_1
    iget-object v0, p0, Ltf/z;->h:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Ljava/util/ListIterator;

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final previousIndex()I
    .locals 2

    .line 1
    iget v0, p0, Ltf/z;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ltf/z;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lgg/s;

    .line 9
    .line 10
    iget v0, v0, Lgg/s;->g:I

    .line 11
    .line 12
    return v0

    .line 13
    :pswitch_0
    iget-object v0, p0, Ltf/z;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Log/g;

    .line 16
    .line 17
    iget-object v1, p0, Ltf/z;->h:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Ljava/util/ListIterator;

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/ListIterator;->nextIndex()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    add-int/lit8 v0, v0, -0x1

    .line 30
    .line 31
    sub-int/2addr v0, v1

    .line 32
    return v0

    .line 33
    :pswitch_1
    iget-object v0, p0, Ltf/z;->i:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Ltf/a0;

    .line 36
    .line 37
    iget-object v1, p0, Ltf/z;->h:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Ljava/util/ListIterator;

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/ListIterator;->nextIndex()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-virtual {v0}, Ltf/g;->size()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    add-int/lit8 v0, v0, -0x1

    .line 50
    .line 51
    sub-int/2addr v0, v1

    .line 52
    return v0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 2

    .line 1
    iget v0, p0, Ltf/z;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "Cannot modify a state list through an iterator"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0

    .line 14
    :pswitch_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    const-string v1, "Operation is not supported for read-only collection"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0

    .line 22
    :pswitch_1
    iget-object v0, p0, Ltf/z;->h:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ljava/util/ListIterator;

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/ListIterator;->remove()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Ltf/z;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v0, "Cannot modify a state list through an iterator"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1

    .line 14
    :pswitch_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    const-string v0, "Operation is not supported for read-only collection"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :pswitch_1
    iget-object v0, p0, Ltf/z;->h:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ljava/util/ListIterator;

    .line 25
    .line 26
    invoke-interface {v0, p1}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
