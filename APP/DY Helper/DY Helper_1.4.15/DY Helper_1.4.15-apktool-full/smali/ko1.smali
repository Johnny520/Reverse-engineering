.class public final Lko1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/util/ListIterator;
.implements Llo0;


# instance fields
.field public final synthetic ε:I

.field public final ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lgx0;I)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lko1;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lko1;->η:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v0, p1, Lgx0;->ζ:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ljava/util/List;

    .line 12
    .line 13
    if-ltz p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Lgx0;->α()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-gt p2, v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Lgx0;->α()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    sub-int/2addr p1, p2

    .line 26
    invoke-interface {v0, p1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lko1;->ζ:Ljava/lang/Object;

    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 34
    .line 35
    const-string v0, "Position index "

    .line 36
    .line 37
    const-string v1, " must be in range ["

    .line 38
    .line 39
    invoke-static {p2, v0, v1}, La12;->ζ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    new-instance v0, Lxm0;

    .line 44
    .line 45
    invoke-virtual {p1}, Lgx0;->α()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    const/4 v1, 0x1

    .line 50
    const/4 v2, 0x0

    .line 51
    invoke-direct {v0, v2, p1, v1}, Lvm0;-><init>(III)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string p1, "]."

    .line 58
    .line 59
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p0
.end method

.method public constructor <init>(Lsm1;Lz02;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lko1;->ε:I

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, Lko1;->ζ:Ljava/lang/Object;

    iput-object p2, p0, Lko1;->η:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget p0, p0, Lko1;->ε:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string p1, "Cannot modify a state list through an iterator"

    .line 9
    .line 10
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p0

    .line 14
    :pswitch_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    const-string p1, "Operation is not supported for read-only collection"

    .line 17
    .line 18
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, Lko1;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lko1;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lsm1;

    .line 9
    .line 10
    iget v0, v0, Lsm1;->ε:I

    .line 11
    .line 12
    iget-object p0, p0, Lko1;->η:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lz02;

    .line 15
    .line 16
    iget p0, p0, Lz02;->θ:I

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    sub-int/2addr p0, v1

    .line 20
    if-ge v0, p0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v1, 0x0

    .line 24
    :goto_0
    return v1

    .line 25
    :pswitch_0
    iget-object p0, p0, Lko1;->ζ:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ljava/util/ListIterator;

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final hasPrevious()Z
    .locals 1

    .line 1
    iget v0, p0, Lko1;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lko1;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lsm1;

    .line 9
    .line 10
    iget p0, p0, Lsm1;->ε:I

    .line 11
    .line 12
    if-ltz p0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    :goto_0
    return p0

    .line 18
    :pswitch_0
    iget-object p0, p0, Lko1;->ζ:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Ljava/util/ListIterator;

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/ListIterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lko1;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lko1;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lsm1;

    .line 9
    .line 10
    iget v1, v0, Lsm1;->ε:I

    .line 11
    .line 12
    add-int/lit8 v1, v1, 0x1

    .line 13
    .line 14
    iget-object p0, p0, Lko1;->η:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lz02;

    .line 17
    .line 18
    iget v2, p0, Lz02;->θ:I

    .line 19
    .line 20
    invoke-static {v1, v2}, Lbd;->β(II)V

    .line 21
    .line 22
    .line 23
    iput v1, v0, Lsm1;->ε:I

    .line 24
    .line 25
    invoke-virtual {p0, v1}, Lz02;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :pswitch_0
    iget-object p0, p0, Lko1;->ζ:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Ljava/util/ListIterator;

    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final nextIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lko1;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lko1;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lsm1;

    .line 9
    .line 10
    iget p0, p0, Lsm1;->ε:I

    .line 11
    .line 12
    add-int/lit8 p0, p0, 0x1

    .line 13
    .line 14
    return p0

    .line 15
    :pswitch_0
    iget-object v0, p0, Lko1;->η:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lgx0;

    .line 18
    .line 19
    iget-object p0, p0, Lko1;->ζ:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Ljava/util/ListIterator;

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/ListIterator;->previousIndex()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    invoke-virtual {v0}, Lμ;->size()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    add-int/lit8 v0, v0, -0x1

    .line 32
    .line 33
    sub-int/2addr v0, p0

    .line 34
    return v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final previous()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lko1;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lko1;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lsm1;

    .line 9
    .line 10
    iget v1, v0, Lsm1;->ε:I

    .line 11
    .line 12
    iget-object p0, p0, Lko1;->η:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lz02;

    .line 15
    .line 16
    iget v2, p0, Lz02;->θ:I

    .line 17
    .line 18
    invoke-static {v1, v2}, Lbd;->β(II)V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v2, v1, -0x1

    .line 22
    .line 23
    iput v2, v0, Lsm1;->ε:I

    .line 24
    .line 25
    invoke-virtual {p0, v1}, Lz02;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :pswitch_0
    iget-object p0, p0, Lko1;->ζ:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Ljava/util/ListIterator;

    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final previousIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lko1;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lko1;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lsm1;

    .line 9
    .line 10
    iget p0, p0, Lsm1;->ε:I

    .line 11
    .line 12
    return p0

    .line 13
    :pswitch_0
    iget-object v0, p0, Lko1;->η:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lgx0;

    .line 16
    .line 17
    iget-object p0, p0, Lko1;->ζ:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Ljava/util/ListIterator;

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/ListIterator;->nextIndex()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-virtual {v0}, Lμ;->size()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    add-int/lit8 v0, v0, -0x1

    .line 30
    .line 31
    sub-int/2addr v0, p0

    .line 32
    return v0

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 1

    .line 1
    iget p0, p0, Lko1;->ε:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v0, "Cannot modify a state list through an iterator"

    .line 9
    .line 10
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p0

    .line 14
    :pswitch_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    const-string v0, "Operation is not supported for read-only collection"

    .line 17
    .line 18
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget p0, p0, Lko1;->ε:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string p1, "Cannot modify a state list through an iterator"

    .line 9
    .line 10
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p0

    .line 14
    :pswitch_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    const-string p1, "Operation is not supported for read-only collection"

    .line 17
    .line 18
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
