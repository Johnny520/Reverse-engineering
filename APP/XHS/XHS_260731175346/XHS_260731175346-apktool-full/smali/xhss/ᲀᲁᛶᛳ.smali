.class public abstract Lxhss/ᲀᲁᛶᛳ;
.super Lxhss/ᛵᛶᲀᲇ;


# direct methods
.method public static ᛸᛶᲈᛶ(Lxhss/ᲈᲇᲁᛲ;Ljava/util/Set;)Ljava/util/Set;
    .locals 3

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lxhss/ᛷᲇᛵᛳ;->ᛷᛸᛷ(Ljava/util/Collection;)Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    instance-of v0, p1, Ljava/util/Set;

    .line 13
    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lxhss/ᲈᲇᲁᛲ;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :cond_1
    :goto_0
    move-object v1, p0

    .line 26
    check-cast v1, Lxhss/ᛵᛶᛲᛵ;

    .line 27
    .line 28
    invoke-virtual {v1}, Lxhss/ᛵᛶᛲᛵ;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    move-object v1, p0

    .line 35
    check-cast v1, Lxhss/ᲈᛴᲈᛵ;

    .line 36
    .line 37
    invoke-virtual {v1}, Lxhss/ᲈᛴᲈᛵ;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    move-object v2, p1

    .line 42
    check-cast v2, Ljava/util/Set;

    .line 43
    .line 44
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_1

    .line 49
    .line 50
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    return-object v0

    .line 55
    :cond_3
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 56
    .line 57
    invoke-direct {v0, p0}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    .line 61
    .line 62
    .line 63
    return-object v0
.end method
