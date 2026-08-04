.class public abstract Lyyds/ᛷᛴᛳᛶ;
.super Lyyds/ᛴᛲᲁᛲ;


# direct methods
.method public static ᛱᛳᛶᛳ(Lyyds/ᛵᲈᛴᛷ;)Ljava/util/Set;
    .locals 2

    .line 1
    invoke-interface {p0}, Lyyds/ᛵᲈᛴᛷ;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget-object p0, Lyyds/ᛶᲁᛲᛶ;->ᲀᛲᛳᲀ:Lyyds/ᛶᲁᛲᛶ;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    return-object v1
.end method

.method public static ᛲᛳᛴᛸ(Lyyds/ᛵᲈᛴᛷ;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-interface {p0}, Lyyds/ᛵᲈᛴᛷ;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget-object p0, Lyyds/ᛸᲀᛶᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛶᲈ;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    return-object v1
.end method

.method public static ᛲᛶᛱᲈ(Lyyds/ᛵᲈᛴᛷ;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

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
    invoke-interface {p0}, Lyyds/ᛵᲈᛴᛷ;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const/4 v4, 0x1

    .line 27
    add-int/2addr v2, v4

    .line 28
    if-le v2, v4, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 31
    .line 32
    .line 33
    :cond_0
    const/4 v4, 0x0

    .line 34
    invoke-static {v0, v3, v4}, Lyyds/ᛳᛵᲀ;->ᛲᲈᲁ(Ljava/lang/StringBuilder;Ljava/lang/Object;Lyyds/ᛷᛴᲈᲀ;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method

.method public static ᛳᛸᛴᛶ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛷᛴᲈᲀ;)Lyyds/ᛲᲈᲁᛱ;
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛲᲈᲁᛱ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1, p1}, Lyyds/ᛲᲈᲁᛱ;-><init>(Lyyds/ᛵᲈᛴᛷ;ZLyyds/ᛷᛴᲈᲀ;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public static ᛵᲀᛵᛸ(Lyyds/ᛵᲈᛴᛷ;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-interface {p0}, Lyyds/ᛵᲈᛴᛷ;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    :goto_0
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :cond_1
    return-object v0
.end method

.method public static ᛵᲀᲈᛴ(Ljava/lang/Object;Lyyds/ᛷᛴᲈᲀ;)Lyyds/ᛵᲈᛴᛷ;
    .locals 3

    .line 1
    new-instance v0, Lyyds/ᲈᛸᲀᛱ;

    .line 2
    .line 3
    new-instance v1, Lyyds/ᛵᲇᛵᲇ;

    .line 4
    .line 5
    const/16 v2, 0x13

    .line 6
    .line 7
    invoke-direct {v1, v2, p0}, Lyyds/ᛵᲇᛵᲇ;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    invoke-direct {v0, v1, p1, p0}, Lyyds/ᲈᛸᲀᛱ;-><init>(Ljava/lang/Object;Lyyds/ᛷᛴᲈᲀ;I)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static ᛶᛸᲀᲁ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛷᛴᲈᲀ;)Lyyds/ᛲᛶᛷᲇ;
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛲᛶᛷᲇ;

    .line 2
    .line 3
    sget-object v1, Lyyds/ᛸᲈᲀᛷ;->ᛷᲈᲈᲁ:Lyyds/ᛸᲈᲀᛷ;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, v1}, Lyyds/ᛲᛶᛷᲇ;-><init>(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛷᛴᲈᲀ;Lyyds/ᛷᛴᲈᲀ;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static ᛶᲈᛴᲈ(Lyyds/ᛲᲈᲁᛱ;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᛵᛶᛷᛸ;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lyyds/ᛵᛶᛷᛸ;-><init>(Lyyds/ᛲᲈᲁᛱ;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lyyds/ᛵᛶᛷᛸ;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-virtual {v0}, Lyyds/ᛵᛶᛷᛸ;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public static ᛷᛸᲇᛶ(Lyyds/ᛵᲈᛴᛷ;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lyyds/ᛵᲈᛴᛷ;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-object v0
.end method

.method public static ᲀᛲᛲᲇ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛷᛴᲈᲀ;)Lyyds/ᛲᲈᲁᛱ;
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛲᲈᲁᛱ;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1, p1}, Lyyds/ᛲᲈᲁᛱ;-><init>(Lyyds/ᛵᲈᛴᛷ;ZLyyds/ᛷᛴᲈᲀ;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public static ᲈᲀᛲᲀ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛷᛴᲈᲀ;)Lyyds/ᛲᲈᲁᛱ;
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᛵᛶᲀᛶ;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lyyds/ᛵᛶᲀᛶ;-><init>(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛷᛴᲈᲀ;)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Lyyds/ᛳᛱᛶᛲ;

    .line 7
    .line 8
    const/16 p1, 0x10

    .line 9
    .line 10
    invoke-direct {p0, p1}, Lyyds/ᛳᛱᛶᛲ;-><init>(I)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, p0}, Lyyds/ᛷᛴᛳᛶ;->ᛳᛸᛴᛶ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛷᛴᲈᲀ;)Lyyds/ᛲᲈᲁᛱ;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
