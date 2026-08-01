.class public abstract Lxhss/ᛲᛷᲁᲁ;
.super Lxhss/ᛵᛶᲀᲇ;


# direct methods
.method public static ᛳᛶᛷᲀ(I[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    if-ge p0, v0, :cond_0

    .line 5
    .line 6
    aget-object p0, p1, p0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return-object p0
.end method

.method public static ᛳᲈᲈᛲ(III[Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    sub-int/2addr p2, p1

    .line 2
    invoke-static {p3, p1, p4, p0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static ᛴᲈᛱᛴ([Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length v1, p0

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_1

    .line 9
    .line 10
    aget-object v3, p0, v2

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    return-object v0
.end method

.method public static ᛶᲇᲈᛸ(III[Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 2

    .line 1
    and-int/lit8 v0, p2, 0x4

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p0, v1

    .line 7
    :cond_0
    and-int/lit8 p2, p2, 0x8

    .line 8
    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    array-length p1, p3

    .line 12
    :cond_1
    sub-int/2addr p1, p0

    .line 13
    invoke-static {p3, p0, p4, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static ᛸᛲᛷᛱ([BII)[B
    .locals 1

    .line 1
    array-length v0, p0

    .line 2
    invoke-static {p2, v0}, Lxhss/ᛵᛶᲀᲇ;->ᛱᛱᛲᲇ(II)V

    .line 3
    .line 4
    .line 5
    invoke-static {p0, p1, p2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static ᛸᛶᛴᲈ([B[BII)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    sub-int/2addr p3, p2

    .line 3
    invoke-static {p0, p2, p1, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static ᛸᛶᲈᛶ([CC)Z
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_1

    .line 5
    .line 6
    aget-char v3, p0, v2

    .line 7
    .line 8
    if-ne p1, v3, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const/4 v2, -0x1

    .line 15
    :goto_1
    if-ltz v2, :cond_2

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_2
    return v1
.end method

.method public static ᲀᛷᲁᲀ([Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    .line 1
    array-length v0, p0

    .line 2
    if-eqz v0, :cond_1

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    aget-object p0, p0, v0

    .line 19
    .line 20
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_1
    sget-object p0, Lxhss/ᛵᛷᛶᛱ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛷᛶᛱ;

    .line 26
    .line 27
    return-object p0
.end method

.method public static ᲁᛲᛴᛴ([Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_1

    .line 3
    .line 4
    array-length p1, p0

    .line 5
    :goto_0
    if-ge v0, p1, :cond_3

    .line 6
    .line 7
    aget-object v1, p0, v0

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    return v0

    .line 12
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    array-length v1, p0

    .line 16
    :goto_1
    if-ge v0, v1, :cond_3

    .line 17
    .line 18
    aget-object v2, p0, v0

    .line 19
    .line 20
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    return v0

    .line 27
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_3
    const/4 p0, -0x1

    .line 31
    return p0
.end method

.method public static ᲁᛴᲇᛲ([Ljava/lang/Object;Lxhss/ᛷᛴᛲᛲ;)Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 9
    .line 10
    .line 11
    array-length v2, p0

    .line 12
    const/4 v3, 0x0

    .line 13
    move v4, v3

    .line 14
    :goto_0
    if-ge v3, v2, :cond_1

    .line 15
    .line 16
    aget-object v5, p0, v3

    .line 17
    .line 18
    const/4 v6, 0x1

    .line 19
    add-int/2addr v4, v6

    .line 20
    if-le v4, v6, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-static {v0, v5, p1}, Lxhss/ᛶᛵᛱ;->ᛷᛵᛵᲈ(Ljava/lang/StringBuilder;Ljava/lang/Object;Lxhss/ᛷᛴᛲᛲ;)V

    .line 26
    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public static ᲇᛸᛳᲁ(III[I[I)V
    .locals 0

    .line 1
    sub-int/2addr p2, p1

    .line 2
    invoke-static {p3, p1, p4, p0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static ᲈᛲᛵᲁ([BLjava/lang/String;Lxhss/ᛷᛴᛲᛲ;)Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 9
    .line 10
    .line 11
    array-length v2, p0

    .line 12
    const/4 v3, 0x0

    .line 13
    move v4, v3

    .line 14
    :goto_0
    if-ge v3, v2, :cond_1

    .line 15
    .line 16
    aget-byte v5, p0, v3

    .line 17
    .line 18
    const/4 v6, 0x1

    .line 19
    add-int/2addr v4, v6

    .line 20
    if-le v4, v6, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-static {v5}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-interface {p2, v5}, Lxhss/ᛷᛴᛲᛲ;->ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    check-cast v5, Ljava/lang/CharSequence;

    .line 34
    .line 35
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 36
    .line 37
    .line 38
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method
