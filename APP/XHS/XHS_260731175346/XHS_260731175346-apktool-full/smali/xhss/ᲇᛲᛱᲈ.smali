.class public final Lxhss/ᲇᛲᛱᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᲀᛶᛶᲀ;
.implements Ljava/io/Serializable;


# instance fields
.field public ᛱᛱᛲᲇ:Ljava/lang/String;

.field public ᛳᲁᲇᛸ:Lxhss/ᲈᛸᛷᲀ;

.field public ᲇᛴᲇᛵ:Ljava/util/concurrent/LinkedBlockingQueue;


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲇᛲᛱᲈ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final varargs ᛱᛱᛲᲇ(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0, p1, p2}, Lxhss/ᲇᛲᛱᲈ;->ᛳᲈᲈᛲ(ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final ᛳᲁᲇᛸ()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final ᛳᲈᲈᛲ(ILjava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 1
    array-length p2, p3

    .line 2
    const/4 v0, 0x0

    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    array-length p2, p3

    .line 7
    add-int/lit8 p2, p2, -0x1

    .line 8
    .line 9
    aget-object p2, p3, p2

    .line 10
    .line 11
    instance-of v1, p2, Ljava/lang/Throwable;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    move-object v0, p2

    .line 16
    check-cast v0, Ljava/lang/Throwable;

    .line 17
    .line 18
    :cond_1
    :goto_0
    if-eqz v0, :cond_4

    .line 19
    .line 20
    array-length p2, p3

    .line 21
    if-eqz p2, :cond_3

    .line 22
    .line 23
    array-length p2, p3

    .line 24
    add-int/lit8 p2, p2, -0x1

    .line 25
    .line 26
    new-array v0, p2, [Ljava/lang/Object;

    .line 27
    .line 28
    if-lez p2, :cond_2

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-static {p3, v1, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-virtual {p0, p1, v0}, Lxhss/ᲇᛲᛱᲈ;->ᛶᲇᲈᛸ(I[Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_3
    const-string p0, "non-sensical empty or null argument array"

    .line 39
    .line 40
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_4
    invoke-virtual {p0, p1, p3}, Lxhss/ᲇᛲᛱᲈ;->ᛶᲇᲈᛸ(I[Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final ᛶᲇᲈᛸ(I[Ljava/lang/Object;)V
    .locals 1

    .line 1
    new-instance v0, Lxhss/ᲀᲀᛴᛴ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    iput p1, v0, Lxhss/ᲀᲀᛴᛴ;->ᛷᛵᛵᲈ:I

    .line 10
    .line 11
    iget-object p1, p0, Lxhss/ᲇᛲᛱᲈ;->ᛳᲁᲇᛸ:Lxhss/ᲈᛸᛷᲀ;

    .line 12
    .line 13
    iput-object p1, v0, Lxhss/ᲀᲀᛴᛴ;->ᛱᛱᛲᲇ:Lxhss/ᲈᛸᛷᲀ;

    .line 14
    .line 15
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    iput-object p2, v0, Lxhss/ᲀᲀᛴᛴ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 23
    .line 24
    iget-object p0, p0, Lxhss/ᲇᛲᛱᲈ;->ᲇᛴᲇᛵ:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 25
    .line 26
    invoke-interface {p0, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final ᛷᛴᛷᛱ(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    const/4 p1, 0x2

    .line 2
    const/4 p2, 0x0

    .line 3
    invoke-virtual {p0, p1, p2}, Lxhss/ᲇᛲᛱᲈ;->ᛶᲇᲈᛸ(I[Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᛷᛵᛵᲈ(Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-virtual {p0, v0, p1}, Lxhss/ᲇᛲᛱᲈ;->ᛶᲇᲈᛸ(I[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final ᛷᲁᲁ(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 p1, 0x4

    .line 2
    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, p1, v0}, Lxhss/ᲇᛲᛱᲈ;->ᛶᲇᲈᛸ(I[Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᛸᛴᛶᛳ()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final ᛸᛶᲈᛶ()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final ᛸᛷᲈᲈ()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final varargs ᲀᲇᛳᲁ(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-virtual {p0, v0, p1, p2}, Lxhss/ᲇᛲᛱᲈ;->ᛳᲈᲈᛲ(ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final ᲇᛴᲇᛵ()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final ᲇᛶᛴᲀ(Ljava/lang/Object;Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-virtual {p0, v0, p1}, Lxhss/ᲇᛲᛱᲈ;->ᛶᲇᲈᛸ(I[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final ᲇᛸᛳᲁ(Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-virtual {p0, v0, p1}, Lxhss/ᲇᛲᛱᲈ;->ᛶᲇᲈᛸ(I[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final ᲈᛳᲀ(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 p1, 0x4

    .line 2
    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, p1, v0}, Lxhss/ᲇᛲᛱᲈ;->ᛶᲇᲈᛸ(I[Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
