.class public abstract LF0/q;
.super LF0/p;
.source "SourceFile"


# direct methods
.method public static e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V
    .locals 1

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Ljava/util/Collection;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Ljava/util/Collection;

    .line 11
    .line 12
    invoke-interface {p1, p0}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
.end method

.method public static f0(Ljava/util/Collection;[Ljava/lang/Object;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "elements"

    .line 7
    .line 8
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p0, p1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method

.method public static g0(Ljava/util/ArrayList;LM0/l;)V
    .locals 9

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LR0/c;

    .line 7
    .line 8
    invoke-static {p0}, LF0/l;->Y(Ljava/util/List;)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-direct {v0, v2, v1, v3}, LR0/a;-><init>(III)V

    .line 15
    .line 16
    .line 17
    iget v0, v0, LR0/a;->b:I

    .line 18
    .line 19
    if-ltz v0, :cond_0

    .line 20
    .line 21
    move v1, v3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v1, v2

    .line 24
    :goto_0
    if-eqz v1, :cond_1

    .line 25
    .line 26
    move v4, v2

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v4, v0

    .line 29
    :goto_1
    move v5, v2

    .line 30
    :goto_2
    if-eqz v1, :cond_6

    .line 31
    .line 32
    if-ne v4, v0, :cond_3

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    move v1, v2

    .line 37
    move v6, v4

    .line 38
    goto :goto_3

    .line 39
    :cond_2
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 40
    .line 41
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 42
    .line 43
    .line 44
    throw p0

    .line 45
    :cond_3
    add-int/lit8 v6, v4, 0x1

    .line 46
    .line 47
    :goto_3
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-interface {p1, v7}, LM0/l;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    check-cast v8, Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    if-ne v8, v3, :cond_4

    .line 62
    .line 63
    :goto_4
    move v4, v6

    .line 64
    goto :goto_2

    .line 65
    :cond_4
    if-eq v5, v4, :cond_5

    .line 66
    .line 67
    invoke-virtual {p0, v5, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_6
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-ge v5, p1, :cond_7

    .line 78
    .line 79
    invoke-static {p0}, LF0/l;->Y(Ljava/util/List;)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-gt v5, p1, :cond_7

    .line 84
    .line 85
    :goto_5
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    if-eq p1, v5, :cond_7

    .line 89
    .line 90
    add-int/lit8 p1, p1, -0x1

    .line 91
    .line 92
    goto :goto_5

    .line 93
    :cond_7
    return-void
.end method
