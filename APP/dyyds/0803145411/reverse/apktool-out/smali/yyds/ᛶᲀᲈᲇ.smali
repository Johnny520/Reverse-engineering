.class public abstract Lyyds/ᛶᲀᲈᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/util/Iterator;
.implements Lyyds/ᛳᛱᲇᛴ;


# instance fields
.field public ᲀᛲᛳᲀ:I

.field public ᲇᲈᛵᛷ:Ljava/lang/Object;


# virtual methods
.method public final hasNext()Z
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛶᲀᲈᲇ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    if-eq v0, v2, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x2

    .line 10
    if-ne v0, p0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    const-string p0, "hasNext called when the iterator is in the FAILED state."

    .line 14
    .line 15
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    return v2

    .line 21
    :cond_2
    const/4 v0, 0x3

    .line 22
    iput v0, p0, Lyyds/ᛶᲀᲈᲇ;->ᲀᛲᛳᲀ:I

    .line 23
    .line 24
    invoke-virtual {p0}, Lyyds/ᛶᲀᲈᲇ;->ᛲᲈᲁ()V

    .line 25
    .line 26
    .line 27
    iget p0, p0, Lyyds/ᛶᲀᲈᲇ;->ᲀᛲᛳᲀ:I

    .line 28
    .line 29
    if-ne p0, v2, :cond_3

    .line 30
    .line 31
    return v2

    .line 32
    :cond_3
    return v1
.end method

.method public final next()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lyyds/ᛶᲀᲈᲇ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v0, v2, :cond_0

    .line 6
    .line 7
    iput v1, p0, Lyyds/ᛶᲀᲈᲇ;->ᲀᛲᛳᲀ:I

    .line 8
    .line 9
    iget-object p0, p0, Lyyds/ᛶᲀᲈᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 v3, 0x2

    .line 13
    if-eq v0, v3, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    iput v0, p0, Lyyds/ᛶᲀᲈᲇ;->ᲀᛲᛳᲀ:I

    .line 17
    .line 18
    invoke-virtual {p0}, Lyyds/ᛶᲀᲈᲇ;->ᛲᲈᲁ()V

    .line 19
    .line 20
    .line 21
    iget v0, p0, Lyyds/ᛶᲀᲈᲇ;->ᲀᛲᛳᲀ:I

    .line 22
    .line 23
    if-ne v0, v2, :cond_1

    .line 24
    .line 25
    iput v1, p0, Lyyds/ᛶᲀᲈᲇ;->ᲀᛲᛳᲀ:I

    .line 26
    .line 27
    iget-object p0, p0, Lyyds/ᛶᲀᲈᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_1
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 31
    .line 32
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 33
    .line 34
    .line 35
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

.method public abstract ᛲᲈᲁ()V
.end method
