.class public final Lxhss/ᲇᛴᛵᲈ;
.super Lxhss/ᲇᛸᛳᲁ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public final ᛳᲁᲇᛸ:Lxhss/ᛷᛸᛵᛶ;


# direct methods
.method public synthetic constructor <init>(Lxhss/ᛷᛸᛵᛶ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxhss/ᲇᛴᛵᲈ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lxhss/ᲇᛴᛵᲈ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛸᛵᛶ;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget p0, p0, Lxhss/ᲇᛴᛵᲈ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 9
    .line 10
    .line 11
    throw p0

    .line 12
    :pswitch_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 13
    .line 14
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 0

    .line 1
    iget p0, p0, Lxhss/ᲇᛴᛵᲈ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 9
    .line 10
    .line 11
    throw p0

    .line 12
    :pswitch_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 15
    .line 16
    .line 17
    throw p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final clear()V
    .locals 1

    .line 1
    iget v0, p0, Lxhss/ᲇᛴᛵᲈ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᲇᛴᛵᲈ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛸᛵᛶ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lxhss/ᛷᛸᛵᛶ;->clear()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-virtual {p0}, Lxhss/ᛷᛸᛵᛶ;->clear()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget v0, p0, Lxhss/ᲇᛴᛵᲈ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᲇᛴᛵᲈ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛸᛵᛶ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lxhss/ᛷᛸᛵᛶ;->containsKey(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :pswitch_0
    instance-of v0, p1, Ljava/util/Map$Entry;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p0, v0}, Lxhss/ᛷᛸᛵᛶ;->ᛷᛴᛷᛱ(Ljava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-gez v0, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object p0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 33
    .line 34
    aget-object p0, p0, v0

    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {p0, p1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    :goto_0
    return v1

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 4

    .line 1
    iget v0, p0, Lxhss/ᲇᛴᛵᲈ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->containsAll(Ljava/util/Collection;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Lxhss/ᲇᛴᛵᲈ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛸᛵᛶ;

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/4 v1, 0x0

    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    :try_start_0
    check-cast v0, Ljava/util/Map$Entry;

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {p0, v2}, Lxhss/ᛷᛸᛵᛶ;->ᛷᛴᛷᛱ(Ljava/lang/Object;)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-gez v2, :cond_1

    .line 41
    .line 42
    move v0, v1

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iget-object v3, p0, Lxhss/ᛷᛸᛵᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 45
    .line 46
    aget-object v2, v3, v2

    .line 47
    .line 48
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v2, v0}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    :goto_0
    if-nez v0, :cond_0

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    const/4 v1, 0x1

    .line 60
    :catch_0
    :cond_3
    :goto_1
    return v1

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final isEmpty()Z
    .locals 1

    .line 1
    iget v0, p0, Lxhss/ᲇᛴᛵᲈ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᲇᛴᛵᲈ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛸᛵᛶ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lxhss/ᛷᛸᛵᛶ;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :pswitch_0
    invoke-virtual {p0}, Lxhss/ᛷᛸᛵᛶ;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget v0, p0, Lxhss/ᲇᛴᛵᲈ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᲇᛴᛵᲈ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛸᛵᛶ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lxhss/ᲈᛴᲈᛵ;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, v1}, Lxhss/ᲈᛴᲈᛵ;-><init>(Lxhss/ᛷᛸᛵᛶ;I)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, Lxhss/ᲈᛴᲈᛵ;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, v1}, Lxhss/ᲈᛴᲈᛵ;-><init>(Lxhss/ᛷᛸᛵᛶ;I)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    iget v0, p0, Lxhss/ᲇᛴᛵᲈ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, Lxhss/ᲇᛴᛵᲈ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛸᛵᛶ;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lxhss/ᛷᛸᛵᛶ;->ᛷᛴᛷᛱ(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-gez p1, :cond_0

    .line 18
    .line 19
    move v1, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p0, p1}, Lxhss/ᛷᛸᛵᛶ;->ᛸᛴᛶᛳ(I)V

    .line 22
    .line 23
    .line 24
    :goto_0
    return v1

    .line 25
    :pswitch_0
    instance-of v0, p1, Ljava/util/Map$Entry;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    check-cast p1, Ljava/util/Map$Entry;

    .line 31
    .line 32
    invoke-virtual {p0}, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ()V

    .line 33
    .line 34
    .line 35
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p0, v0}, Lxhss/ᛷᛸᛵᛶ;->ᛷᛴᛷᛱ(Ljava/lang/Object;)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-gez v0, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    iget-object v3, p0, Lxhss/ᛷᛸᛵᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 47
    .line 48
    aget-object v3, v3, v0

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {v3, p1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-nez p1, :cond_3

    .line 59
    .line 60
    :goto_1
    move v1, v2

    .line 61
    goto :goto_2

    .line 62
    :cond_3
    invoke-virtual {p0, v0}, Lxhss/ᛷᛸᛵᛶ;->ᛸᛴᛶᛳ(I)V

    .line 63
    .line 64
    .line 65
    :goto_2
    return v1

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 2

    .line 1
    iget v0, p0, Lxhss/ᲇᛴᛵᲈ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iget-object v1, p0, Lxhss/ᲇᛴᛵᲈ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛸᛵᛶ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ()V

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :pswitch_0
    invoke-virtual {v1}, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ()V

    .line 17
    .line 18
    .line 19
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 2

    .line 1
    iget v0, p0, Lxhss/ᲇᛴᛵᲈ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iget-object v1, p0, Lxhss/ᲇᛴᛵᲈ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛸᛵᛶ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ()V

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :pswitch_0
    invoke-virtual {v1}, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ()V

    .line 17
    .line 18
    .line 19
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛷᛵᛵᲈ()I
    .locals 1

    .line 1
    iget v0, p0, Lxhss/ᲇᛴᛵᲈ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᲇᛴᛵᲈ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛸᛵᛶ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget p0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛸᛷᲈᲈ:I

    .line 9
    .line 10
    return p0

    .line 11
    :pswitch_0
    iget p0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛸᛷᲈᲈ:I

    .line 12
    .line 13
    return p0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
