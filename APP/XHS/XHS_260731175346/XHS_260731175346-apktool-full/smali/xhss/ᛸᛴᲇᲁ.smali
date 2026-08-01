.class public final Lxhss/ᛸᛴᲇᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/util/Iterator;
.implements Lxhss/ᛱᛴᛶᛴ;
.implements Lxhss/ᛱᛶᲈᛵ;


# instance fields
.field public ᛱᛱᛲᲇ:I

.field public ᛳᲁᲇᛸ:Ljava/lang/reflect/Field;

.field public ᲇᛴᲇᛵ:Lxhss/ᛱᛴᛶᛴ;


# virtual methods
.method public final hasNext()Z
    .locals 3

    .line 1
    :goto_0
    iget v0, p0, Lxhss/ᛸᛴᲇᲁ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-eq v0, v2, :cond_2

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    const/4 v1, 0x4

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_0
    invoke-virtual {p0}, Lxhss/ᛸᛴᲇᲁ;->ᛷᛵᛵᲈ()Ljava/lang/RuntimeException;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    throw p0

    .line 25
    :cond_1
    return v2

    .line 26
    :cond_2
    throw v1

    .line 27
    :cond_3
    const/4 v0, 0x5

    .line 28
    iput v0, p0, Lxhss/ᛸᛴᲇᲁ;->ᛱᛱᛲᲇ:I

    .line 29
    .line 30
    iget-object v0, p0, Lxhss/ᛸᛴᲇᲁ;->ᲇᛴᲇᛵ:Lxhss/ᛱᛴᛶᛴ;

    .line 31
    .line 32
    iput-object v1, p0, Lxhss/ᛸᛴᲇᲁ;->ᲇᛴᲇᛵ:Lxhss/ᛱᛴᛶᛴ;

    .line 33
    .line 34
    sget-object v1, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 35
    .line 36
    invoke-interface {v0, v1}, Lxhss/ᛱᛴᛶᛴ;->ᛸᛴᛶᛳ(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0
.end method

.method public final next()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lxhss/ᛸᛴᲇᲁ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_2

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-eq v0, v2, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput v0, p0, Lxhss/ᛸᛴᲇᲁ;->ᛱᛱᛲᲇ:I

    .line 17
    .line 18
    iget-object v0, p0, Lxhss/ᛸᛴᲇᲁ;->ᛳᲁᲇᛸ:Ljava/lang/reflect/Field;

    .line 19
    .line 20
    iput-object v3, p0, Lxhss/ᛸᛴᲇᲁ;->ᛳᲁᲇᛸ:Ljava/lang/reflect/Field;

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    invoke-virtual {p0}, Lxhss/ᛸᛴᲇᲁ;->ᛷᛵᛵᲈ()Ljava/lang/RuntimeException;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    throw p0

    .line 28
    :cond_1
    iput v1, p0, Lxhss/ᛸᛴᲇᲁ;->ᛱᛱᛲᲇ:I

    .line 29
    .line 30
    throw v3

    .line 31
    :cond_2
    invoke-virtual {p0}, Lxhss/ᛸᛴᲇᲁ;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    invoke-virtual {p0}, Lxhss/ᛸᛴᲇᲁ;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_3
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 43
    .line 44
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 45
    .line 46
    .line 47
    throw p0
.end method

.method public final remove()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final ᛷᛵᛵᲈ()Ljava/lang/RuntimeException;
    .locals 3

    .line 1
    iget v0, p0, Lxhss/ᛸᛴᲇᲁ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    const/4 v1, 0x5

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v2, "Unexpected state of the iterator: "

    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget p0, p0, Lxhss/ᛸᛴᲇᲁ;->ᛱᛱᛲᲇ:I

    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v0, "Iterator has failed."

    .line 34
    .line 35
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_1
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 40
    .line 41
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 42
    .line 43
    .line 44
    return-object p0
.end method

.method public final ᛸᛴᛶᛳ(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lxhss/ᛶᲈᛴᛲ;->ᛳᛶᛷᲀ(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x4

    .line 5
    iput p1, p0, Lxhss/ᛸᛴᲇᲁ;->ᛱᛱᛲᲇ:I

    .line 6
    .line 7
    return-void
.end method

.method public final ᲇᛶᛴᲀ()Lxhss/ᛴᛵᛳᛵ;
    .locals 0

    .line 1
    sget-object p0, Lxhss/ᲇᛷᲁᛷ;->ᛱᛱᛲᲇ:Lxhss/ᲇᛷᲁᛷ;

    .line 2
    .line 3
    return-object p0
.end method
