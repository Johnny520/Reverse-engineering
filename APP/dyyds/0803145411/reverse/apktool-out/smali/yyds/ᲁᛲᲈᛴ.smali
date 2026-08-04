.class public final Lyyds/ᲁᛲᲈᛴ;
.super Lyyds/ᲀᛶᲁᛵ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᲇᲇᲇᛱ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Lyyds/ᲀᛶᲁᛵ;-><init>()V

    .line 12
    iput-object p1, p0, Lyyds/ᲁᛲᲈᛴ;->ᲇᲇᲇᛱ:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lyyds/ᛵᲁᛷᲁ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lyyds/ᲀᛶᲁᛵ;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lyyds/ᲁᛲᲈᛴ;->ᲇᲇᲇᛱ:Ljava/util/List;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Ljava/lang/String;Lyyds/ᛷᛸᛸᛳ;Ljava/lang/Object;Lyyds/ᛸᛴᛷᲇ;)V
    .locals 4

    .line 1
    iget-object p2, p4, Lyyds/ᛸᛴᛷᲇ;->ᛲᲈᲁ:Lyyds/ᛴᲈᛳᛶ;

    .line 2
    .line 3
    iget-object v0, p4, Lyyds/ᛸᛴᛷᲇ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, p2, Lyyds/ᛴᲈᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛱᛱᛴ;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    instance-of v1, p3, Ljava/util/Map;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0, p3, v0, p2, p4}, Lyyds/ᲁᛲᲈᛴ;->ᛷᲈᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛴᲈᛳᛶ;Lyyds/ᛸᛴᛷᲇ;)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_4

    .line 19
    .line 20
    invoke-virtual {p0}, Lyyds/ᲀᛶᲁᛵ;->ᛲᛴᛳᛲ()Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    sget-object v0, Lyyds/ᛷᛸᛸᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲁᛷᛷ;

    .line 25
    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    invoke-virtual {p4, p1, v0, p3}, Lyyds/ᛸᛴᛷᲇ;->ᛲᲈᲁ(Ljava/lang/String;Lyyds/ᛷᛸᛸᛳ;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    invoke-virtual {p0}, Lyyds/ᲀᛶᲁᛵ;->ᛲᛳᛶᲁ()Lyyds/ᲀᛶᲁᛵ;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0, p1, v0, p3, p4}, Lyyds/ᲀᛶᲁᛵ;->ᛲᲈᲁ(Ljava/lang/String;Lyyds/ᛷᛸᛸᛳ;Ljava/lang/Object;Lyyds/ᛸᛴᛷᲇ;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    iget-object v1, p2, Lyyds/ᛴᲈᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛱᛱᛴ;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    instance-of v1, p3, Ljava/util/List;

    .line 46
    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    iget-object v1, p2, Lyyds/ᛴᲈᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛱᛱᛴ;

    .line 50
    .line 51
    invoke-virtual {v1, p3}, Lyyds/ᛱᛱᛴ;->ᛱᛳᛶᛳ(Ljava/lang/Object;)Ljava/lang/Iterable;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const/4 v2, 0x0

    .line 60
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_4

    .line 65
    .line 66
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {p0, v3, v0, p2, p4}, Lyyds/ᲁᛲᲈᛴ;->ᛷᲈᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛴᲈᛳᛶ;Lyyds/ᛸᛴᛷᲇ;)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_2

    .line 75
    .line 76
    invoke-virtual {p0, v2, p1, p3, p4}, Lyyds/ᲀᛶᲁᛵ;->ᲀᛲᛳᲀ(ILjava/lang/String;Ljava/lang/Object;Lyyds/ᛸᛴᛷᲇ;)V

    .line 77
    .line 78
    .line 79
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    invoke-virtual {p0}, Lyyds/ᲀᛶᲁᛵ;->ᛱᲈᲁ()Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-nez p1, :cond_5

    .line 87
    .line 88
    :cond_4
    return-void

    .line 89
    :cond_5
    new-instance p1, Lyyds/ᲇᲈᛸᲀ;

    .line 90
    .line 91
    invoke-virtual {p0}, Lyyds/ᲀᛶᲁᛵ;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    filled-new-array {p0, p3}, [Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    const-string p2, "Filter: %s can not be applied to primitives. Current context is: %s"

    .line 100
    .line 101
    invoke-static {p2, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw p1
.end method

.method public final ᛵᛸᛸᛷ()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    iget-object v2, p0, Lyyds/ᲁᛲᲈᛴ;->ᲇᲇᲇᛱ:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v1, v2, :cond_1

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    const-string v2, ","

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    :cond_0
    const-string v2, "?"

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const-string p0, "]"

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method public final ᛶᛷᛲᲁ()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final ᛷᲈᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛴᲈᛳᛶ;Lyyds/ᛸᛴᛷᲇ;)Z
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᛴᛵᲀᛴ;

    .line 2
    .line 3
    iget-object p4, p4, Lyyds/ᛸᛴᛷᲇ;->ᲇᲇᲇᛱ:Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-direct {v0, p1, p2, p3, p4}, Lyyds/ᛴᛵᲀᛴ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛴᲈᛳᛶ;Ljava/util/HashMap;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᲁᛲᲈᛴ;->ᲇᲇᲇᛱ:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Lyyds/ᛴᛴᲇᛸ;

    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    :try_start_0
    invoke-interface {p1, v0}, Lyyds/ᛴᛴᲇᛸ;->ᛲᲈᲁ(Lyyds/ᛴᛵᲀᛴ;)Z

    .line 28
    .line 29
    .line 30
    move-result p1
    :try_end_0
    .catch Lyyds/ᲇᲈᛸᲀ; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    :catch_0
    return p2

    .line 34
    :cond_1
    const/4 p0, 0x1

    .line 35
    return p0
.end method
