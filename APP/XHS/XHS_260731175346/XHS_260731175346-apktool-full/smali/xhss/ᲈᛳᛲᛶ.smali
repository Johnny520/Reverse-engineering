.class public final Lxhss/ᲈᛳᛲᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/util/ListIterator;
.implements Lxhss/ᛱᛶᲈᛵ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public ᛳᲁᲇᛸ:I

.field public ᛷᛴᛷᛱ:I

.field public ᲇᛴᲇᛵ:I

.field public final ᲇᛶᛴᲀ:Lxhss/ᛸᛶᲈᛶ;


# direct methods
.method public constructor <init>(Lxhss/ᛷᲁᲇᛳ;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛱᛱᛲᲇ:I

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lxhss/ᲈᛳᛲᛶ;->ᲇᛶᛴᲀ:Lxhss/ᛸᛶᲈᛶ;

    .line 23
    iput p2, p0, Lxhss/ᲈᛳᛲᛶ;->ᛳᲁᲇᛸ:I

    const/4 p2, -0x1

    .line 24
    iput p2, p0, Lxhss/ᲈᛳᛲᛶ;->ᲇᛴᲇᛵ:I

    .line 25
    invoke-static {p1}, Lxhss/ᛷᲁᲇᛳ;->ᛳᲁᲇᛸ(Lxhss/ᛷᲁᲇᛳ;)I

    move-result p1

    iput p1, p0, Lxhss/ᲈᛳᛲᛶ;->ᛷᛴᛷᛱ:I

    return-void
.end method

.method public constructor <init>(Lxhss/ᲈᛶᲀᲈ;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛱᛱᛲᲇ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lxhss/ᲈᛳᛲᛶ;->ᲇᛶᛴᲀ:Lxhss/ᛸᛶᲈᛶ;

    .line 8
    .line 9
    iput p2, p0, Lxhss/ᲈᛳᛲᛶ;->ᛳᲁᲇᛸ:I

    .line 10
    .line 11
    const/4 p2, -0x1

    .line 12
    iput p2, p0, Lxhss/ᲈᛳᛲᛶ;->ᲇᛴᲇᛵ:I

    .line 13
    .line 14
    invoke-static {p1}, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ(Lxhss/ᲈᛶᲀᲈ;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iput p1, p0, Lxhss/ᲈᛳᛲᛶ;->ᛷᛴᛷᛱ:I

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    iget-object v2, p0, Lxhss/ᲈᛳᛲᛶ;->ᲇᛶᛴᲀ:Lxhss/ᛸᛶᲈᛶ;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lxhss/ᲈᛳᛲᛶ;->ᛱᛱᛲᲇ()V

    .line 10
    .line 11
    .line 12
    check-cast v2, Lxhss/ᲈᛶᲀᲈ;

    .line 13
    .line 14
    iget v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛳᲁᲇᛸ:I

    .line 15
    .line 16
    add-int/lit8 v3, v0, 0x1

    .line 17
    .line 18
    iput v3, p0, Lxhss/ᲈᛳᛲᛶ;->ᛳᲁᲇᛸ:I

    .line 19
    .line 20
    invoke-virtual {v2, v0, p1}, Lxhss/ᲈᛶᲀᲈ;->add(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iput v1, p0, Lxhss/ᲈᛳᛲᛶ;->ᲇᛴᲇᛵ:I

    .line 24
    .line 25
    invoke-static {v2}, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ(Lxhss/ᲈᛶᲀᲈ;)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iput p1, p0, Lxhss/ᲈᛳᛲᛶ;->ᛷᛴᛷᛱ:I

    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_0
    invoke-virtual {p0}, Lxhss/ᲈᛳᛲᛶ;->ᛷᛵᛵᲈ()V

    .line 33
    .line 34
    .line 35
    check-cast v2, Lxhss/ᛷᲁᲇᛳ;

    .line 36
    .line 37
    iget v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛳᲁᲇᛸ:I

    .line 38
    .line 39
    add-int/lit8 v3, v0, 0x1

    .line 40
    .line 41
    iput v3, p0, Lxhss/ᲈᛳᛲᛶ;->ᛳᲁᲇᛸ:I

    .line 42
    .line 43
    invoke-virtual {v2, v0, p1}, Lxhss/ᛷᲁᲇᛳ;->add(ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iput v1, p0, Lxhss/ᲈᛳᛲᛶ;->ᲇᛴᲇᛵ:I

    .line 47
    .line 48
    invoke-static {v2}, Lxhss/ᛷᲁᲇᛳ;->ᛳᲁᲇᛸ(Lxhss/ᛷᲁᲇᛳ;)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    iput p1, p0, Lxhss/ᲈᛳᛲᛶ;->ᛷᛴᛷᛱ:I

    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final hasNext()Z
    .locals 4

    .line 1
    iget v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, Lxhss/ᲈᛳᛲᛶ;->ᲇᛶᛴᲀ:Lxhss/ᛸᛶᲈᛶ;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget p0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛳᲁᲇᛸ:I

    .line 11
    .line 12
    check-cast v3, Lxhss/ᲈᛶᲀᲈ;

    .line 13
    .line 14
    iget v0, v3, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 15
    .line 16
    if-ge p0, v0, :cond_0

    .line 17
    .line 18
    move v1, v2

    .line 19
    :cond_0
    return v1

    .line 20
    :pswitch_0
    iget p0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛳᲁᲇᛸ:I

    .line 21
    .line 22
    check-cast v3, Lxhss/ᛷᲁᲇᛳ;

    .line 23
    .line 24
    iget v0, v3, Lxhss/ᛷᲁᲇᛳ;->ᲇᛴᲇᛵ:I

    .line 25
    .line 26
    if-ge p0, v0, :cond_1

    .line 27
    .line 28
    move v1, v2

    .line 29
    :cond_1
    return v1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final hasPrevious()Z
    .locals 1

    .line 1
    iget v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget p0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛳᲁᲇᛸ:I

    .line 7
    .line 8
    if-lez p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    return p0

    .line 14
    :pswitch_0
    iget p0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛳᲁᲇᛸ:I

    .line 15
    .line 16
    if-lez p0, :cond_1

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    const/4 p0, 0x0

    .line 21
    :goto_1
    return p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iget-object v1, p0, Lxhss/ᲈᛳᛲᛶ;->ᲇᛶᛴᲀ:Lxhss/ᛸᛶᲈᛶ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lxhss/ᲈᛳᛲᛶ;->ᛱᛱᛲᲇ()V

    .line 9
    .line 10
    .line 11
    iget v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛳᲁᲇᛸ:I

    .line 12
    .line 13
    check-cast v1, Lxhss/ᲈᛶᲀᲈ;

    .line 14
    .line 15
    iget v2, v1, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 16
    .line 17
    if-ge v0, v2, :cond_0

    .line 18
    .line 19
    add-int/lit8 v2, v0, 0x1

    .line 20
    .line 21
    iput v2, p0, Lxhss/ᲈᛳᛲᛶ;->ᛳᲁᲇᛸ:I

    .line 22
    .line 23
    iput v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᲇᛴᲇᛵ:I

    .line 24
    .line 25
    iget-object p0, v1, Lxhss/ᲈᛶᲀᲈ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 26
    .line 27
    aget-object p0, p0, v0

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_0
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 31
    .line 32
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 33
    .line 34
    .line 35
    throw p0

    .line 36
    :pswitch_0
    invoke-virtual {p0}, Lxhss/ᲈᛳᛲᛶ;->ᛷᛵᛵᲈ()V

    .line 37
    .line 38
    .line 39
    iget v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛳᲁᲇᛸ:I

    .line 40
    .line 41
    check-cast v1, Lxhss/ᛷᲁᲇᛳ;

    .line 42
    .line 43
    iget v2, v1, Lxhss/ᛷᲁᲇᛳ;->ᲇᛴᲇᛵ:I

    .line 44
    .line 45
    if-ge v0, v2, :cond_1

    .line 46
    .line 47
    add-int/lit8 v2, v0, 0x1

    .line 48
    .line 49
    iput v2, p0, Lxhss/ᲈᛳᛲᛶ;->ᛳᲁᲇᛸ:I

    .line 50
    .line 51
    iput v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᲇᛴᲇᛵ:I

    .line 52
    .line 53
    iget-object p0, v1, Lxhss/ᛷᲁᲇᛳ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 54
    .line 55
    iget v1, v1, Lxhss/ᛷᲁᲇᛳ;->ᛳᲁᲇᛸ:I

    .line 56
    .line 57
    add-int/2addr v1, v0

    .line 58
    aget-object p0, p0, v1

    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_1
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 62
    .line 63
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 64
    .line 65
    .line 66
    throw p0

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final nextIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget p0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛳᲁᲇᛸ:I

    .line 7
    .line 8
    return p0

    .line 9
    :pswitch_0
    iget p0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛳᲁᲇᛸ:I

    .line 10
    .line 11
    return p0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final previous()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iget-object v1, p0, Lxhss/ᲈᛳᛲᛶ;->ᲇᛶᛴᲀ:Lxhss/ᛸᛶᲈᛶ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lxhss/ᲈᛳᛲᛶ;->ᛱᛱᛲᲇ()V

    .line 9
    .line 10
    .line 11
    iget v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛳᲁᲇᛸ:I

    .line 12
    .line 13
    if-lez v0, :cond_0

    .line 14
    .line 15
    add-int/lit8 v0, v0, -0x1

    .line 16
    .line 17
    iput v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛳᲁᲇᛸ:I

    .line 18
    .line 19
    iput v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᲇᛴᲇᛵ:I

    .line 20
    .line 21
    check-cast v1, Lxhss/ᲈᛶᲀᲈ;

    .line 22
    .line 23
    iget-object p0, v1, Lxhss/ᲈᛶᲀᲈ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 24
    .line 25
    aget-object p0, p0, v0

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_0
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 29
    .line 30
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 31
    .line 32
    .line 33
    throw p0

    .line 34
    :pswitch_0
    invoke-virtual {p0}, Lxhss/ᲈᛳᛲᛶ;->ᛷᛵᛵᲈ()V

    .line 35
    .line 36
    .line 37
    iget v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛳᲁᲇᛸ:I

    .line 38
    .line 39
    if-lez v0, :cond_1

    .line 40
    .line 41
    add-int/lit8 v0, v0, -0x1

    .line 42
    .line 43
    iput v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛳᲁᲇᛸ:I

    .line 44
    .line 45
    iput v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᲇᛴᲇᛵ:I

    .line 46
    .line 47
    check-cast v1, Lxhss/ᛷᲁᲇᛳ;

    .line 48
    .line 49
    iget-object p0, v1, Lxhss/ᛷᲁᲇᛳ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 50
    .line 51
    iget v1, v1, Lxhss/ᛷᲁᲇᛳ;->ᛳᲁᲇᛸ:I

    .line 52
    .line 53
    add-int/2addr v1, v0

    .line 54
    aget-object p0, p0, v1

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_1
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 58
    .line 59
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 60
    .line 61
    .line 62
    throw p0

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final previousIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget p0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛳᲁᲇᛸ:I

    .line 7
    .line 8
    :goto_0
    add-int/lit8 p0, p0, -0x1

    .line 9
    .line 10
    return p0

    .line 11
    :pswitch_0
    iget p0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛳᲁᲇᛸ:I

    .line 12
    .line 13
    goto :goto_0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 4

    .line 1
    iget v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    const-string v1, "Call next() or previous() before removing element from the iterator."

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    iget-object v3, p0, Lxhss/ᲈᛳᛲᛶ;->ᲇᛶᛴᲀ:Lxhss/ᛸᛶᲈᛶ;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v3, Lxhss/ᲈᛶᲀᲈ;

    .line 12
    .line 13
    invoke-virtual {p0}, Lxhss/ᲈᛳᛲᛶ;->ᛱᛱᛲᲇ()V

    .line 14
    .line 15
    .line 16
    iget v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᲇᛴᲇᛵ:I

    .line 17
    .line 18
    if-eq v0, v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v3, v0}, Lxhss/ᲈᛶᲀᲈ;->ᛱᛱᛲᲇ(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    iget v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᲇᛴᲇᛵ:I

    .line 24
    .line 25
    iput v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛳᲁᲇᛸ:I

    .line 26
    .line 27
    iput v2, p0, Lxhss/ᲈᛳᛲᛶ;->ᲇᛴᲇᛵ:I

    .line 28
    .line 29
    invoke-static {v3}, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ(Lxhss/ᲈᛶᲀᲈ;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iput v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛷᛴᛷᛱ:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {v1}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    return-void

    .line 40
    :pswitch_0
    check-cast v3, Lxhss/ᛷᲁᲇᛳ;

    .line 41
    .line 42
    invoke-virtual {p0}, Lxhss/ᲈᛳᛲᛶ;->ᛷᛵᛵᲈ()V

    .line 43
    .line 44
    .line 45
    iget v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᲇᛴᲇᛵ:I

    .line 46
    .line 47
    if-eq v0, v2, :cond_1

    .line 48
    .line 49
    invoke-virtual {v3, v0}, Lxhss/ᛷᲁᲇᛳ;->ᛱᛱᛲᲇ(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    iget v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᲇᛴᲇᛵ:I

    .line 53
    .line 54
    iput v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛳᲁᲇᛸ:I

    .line 55
    .line 56
    iput v2, p0, Lxhss/ᲈᛳᛲᛶ;->ᲇᛴᲇᛵ:I

    .line 57
    .line 58
    invoke-static {v3}, Lxhss/ᛷᲁᲇᛳ;->ᛳᲁᲇᛸ(Lxhss/ᛷᲁᲇᛳ;)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iput v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛷᛴᛷᛱ:I

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    invoke-static {v1}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :goto_1
    return-void

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    const-string v1, "Call next() or previous() before replacing element from the iterator."

    .line 4
    .line 5
    iget-object v2, p0, Lxhss/ᲈᛳᛲᛶ;->ᲇᛶᛴᲀ:Lxhss/ᛸᛶᲈᛶ;

    .line 6
    .line 7
    const/4 v3, -0x1

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lxhss/ᲈᛳᛲᛶ;->ᛱᛱᛲᲇ()V

    .line 12
    .line 13
    .line 14
    iget p0, p0, Lxhss/ᲈᛳᛲᛶ;->ᲇᛴᲇᛵ:I

    .line 15
    .line 16
    if-eq p0, v3, :cond_0

    .line 17
    .line 18
    check-cast v2, Lxhss/ᲈᛶᲀᲈ;

    .line 19
    .line 20
    invoke-virtual {v2, p0, p1}, Lxhss/ᲈᛶᲀᲈ;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v1}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    return-void

    .line 28
    :pswitch_0
    invoke-virtual {p0}, Lxhss/ᲈᛳᛲᛶ;->ᛷᛵᛵᲈ()V

    .line 29
    .line 30
    .line 31
    iget p0, p0, Lxhss/ᲈᛳᛲᛶ;->ᲇᛴᲇᛵ:I

    .line 32
    .line 33
    if-eq p0, v3, :cond_1

    .line 34
    .line 35
    check-cast v2, Lxhss/ᛷᲁᲇᛳ;

    .line 36
    .line 37
    invoke-virtual {v2, p0, p1}, Lxhss/ᛷᲁᲇᛳ;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-static {v1}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :goto_1
    return-void

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public ᛱᛱᛲᲇ()V
    .locals 1

    .line 1
    iget-object v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᲇᛶᛴᲀ:Lxhss/ᛸᛶᲈᛶ;

    .line 2
    .line 3
    check-cast v0, Lxhss/ᲈᛶᲀᲈ;

    .line 4
    .line 5
    invoke-static {v0}, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ(Lxhss/ᲈᛶᲀᲈ;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget p0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛷᛴᛷᛱ:I

    .line 10
    .line 11
    if-ne v0, p0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance p0, Ljava/util/ConcurrentModificationException;

    .line 15
    .line 16
    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method public ᛷᛵᛵᲈ()V
    .locals 1

    .line 1
    iget-object v0, p0, Lxhss/ᲈᛳᛲᛶ;->ᲇᛶᛴᲀ:Lxhss/ᛸᛶᲈᛶ;

    .line 2
    .line 3
    check-cast v0, Lxhss/ᛷᲁᲇᛳ;

    .line 4
    .line 5
    iget-object v0, v0, Lxhss/ᛷᲁᲇᛳ;->ᲇᛶᛴᲀ:Lxhss/ᲈᛶᲀᲈ;

    .line 6
    .line 7
    invoke-static {v0}, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ(Lxhss/ᲈᛶᲀᲈ;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget p0, p0, Lxhss/ᲈᛳᛲᛶ;->ᛷᛴᛷᛱ:I

    .line 12
    .line 13
    if-ne v0, p0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance p0, Ljava/util/ConcurrentModificationException;

    .line 17
    .line 18
    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 19
    .line 20
    .line 21
    throw p0
.end method
