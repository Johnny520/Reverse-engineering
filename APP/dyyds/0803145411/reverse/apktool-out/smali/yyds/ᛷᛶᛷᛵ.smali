.class public abstract Lyyds/ᛷᛶᛷᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᲈᲁ:Lyyds/ᛲᛸᛴᛶ;

.field public static final ᛵᛸᛸᛷ:Lyyds/ᛲᛸᛴᛶ;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lyyds/ᛲᛸᛴᛶ;

    .line 2
    .line 3
    const-string v1, "REMOVED_TASK"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v1, v2}, Lyyds/ᛲᛸᛴᛶ;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lyyds/ᛷᛶᛷᛵ;->ᛲᲈᲁ:Lyyds/ᛲᛸᛴᛶ;

    .line 10
    .line 11
    new-instance v0, Lyyds/ᛲᛸᛴᛶ;

    .line 12
    .line 13
    const-string v1, "CLOSED_EMPTY"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lyyds/ᛲᛸᛴᛶ;-><init>(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lyyds/ᛷᛶᛷᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛲᛸᛴᛶ;

    .line 19
    .line 20
    return-void
.end method

.method public static ᛱᲈᲁ(Lyyds/ᲁᛶᛱᛴ;Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛴᛲ;
    .locals 1

    .line 1
    invoke-interface {p0}, Lyyds/ᲁᛶᛱᛴ;->getKey()Lyyds/ᲁᛸᛲᲁ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    sget-object p0, Lyyds/ᲈᛱᛸᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛱᛸᛲ;

    .line 12
    .line 13
    :cond_0
    return-object p0
.end method

.method public static final ᛲᛳᛶᲁ(Lyyds/ᛵᲇᛱᛸ;)Ljava/util/List;
    .locals 10

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lyyds/ᛲᛸᲈᲈ;->ᲇᲈᛵᛷ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, "seq"

    .line 8
    .line 9
    invoke-static {p0, v1}, Lyyds/ᛲᛸᲈᲈ;->ᲇᲈᛵᛷ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const-string v2, "from"

    .line 14
    .line 15
    invoke-static {p0, v2}, Lyyds/ᛲᛸᲈᲈ;->ᲇᲈᛵᛷ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const-string v3, "to"

    .line 20
    .line 21
    invoke-static {p0, v3}, Lyyds/ᛲᛸᲈᲈ;->ᲇᲈᛵᛷ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    invoke-static {}, Lyyds/ᛷᛸ;->ᛲᛴᛳᛲ()Lyyds/ᲈᛱᛱᛴ;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    :goto_0
    invoke-interface {p0}, Lyyds/ᛵᲇᛱᛸ;->ᛵᲀᛵᛸ()Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-eqz v5, :cond_0

    .line 34
    .line 35
    new-instance v5, Lyyds/ᲈᛷᲈᛲ;

    .line 36
    .line 37
    invoke-interface {p0, v0}, Lyyds/ᛵᲇᛱᛸ;->getLong(I)J

    .line 38
    .line 39
    .line 40
    move-result-wide v6

    .line 41
    long-to-int v6, v6

    .line 42
    invoke-interface {p0, v1}, Lyyds/ᛵᲇᛱᛸ;->getLong(I)J

    .line 43
    .line 44
    .line 45
    move-result-wide v7

    .line 46
    long-to-int v7, v7

    .line 47
    invoke-interface {p0, v2}, Lyyds/ᛵᲇᛱᛸ;->ᛱᲈᲁ(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    invoke-interface {p0, v3}, Lyyds/ᛵᲇᛱᛸ;->ᛱᲈᲁ(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    invoke-direct {v5, v6, v7, v8, v9}, Lyyds/ᲈᛷᲈᛲ;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4, v5}, Lyyds/ᲈᛱᛱᛴ;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    invoke-static {v4}, Lyyds/ᛷᛸ;->ᲇᲈᛵᛷ(Lyyds/ᲈᛱᛱᛴ;)Lyyds/ᲈᛱᛱᛴ;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0}, Lyyds/ᛷᛷᛶᲇ;->ᛲᲀᛲᛲ(Ljava/util/Collection;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0
.end method

.method public static final ᛲᛴᛳᛲ(Lyyds/ᲁᲇᛸᲁ;Ljava/lang/String;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛸᛸᛸᛶ;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Lyyds/ᛸᛸᛸᛶ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-interface {p0, p1, v0, p2}, Lyyds/ᲁᲇᛸᲁ;->ᲀᛲᛳᲀ(Ljava/lang/String;Lyyds/ᛷᛴᲈᲀ;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object p1, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 12
    .line 13
    if-ne p0, p1, :cond_0

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 17
    .line 18
    return-object p0
.end method

.method public static ᛲᲈᲁ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    if-eq p0, p1, :cond_2

    .line 2
    .line 3
    sget-object v0, Lyyds/ᛵᲇᲈᛵ;->ᛲᲈᲁ:Ljava/lang/Integer;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/16 v1, 0x13

    .line 12
    .line 13
    if-lt v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object v0, Lyyds/ᛷᲇᛸᛸ;->ᛲᲈᲁ:Ljava/lang/reflect/Method;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    :cond_2
    return-void
.end method

.method public static final ᛵᛸᛸᛷ(Landroid/view/View;)V
    .locals 3

    .line 1
    new-instance v0, Lyyds/ᛸᛲᲇᛶ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lyyds/ᲁᛵᲈᛸ;

    .line 7
    .line 8
    invoke-direct {v1, p0, v0}, Lyyds/ᲁᛵᲈᛸ;-><init>(Landroid/view/View;Lyyds/ᛲᛱᛶᛸ;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, v1, Lyyds/ᲁᛵᲈᛸ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object v1, v0, Lyyds/ᛸᛲᲇᛶ;->ᲇᲇᲇᛱ:Lyyds/ᛲᛱᛶᛸ;

    .line 14
    .line 15
    :goto_0
    invoke-virtual {v0}, Lyyds/ᛸᛲᲇᛶ;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_2

    .line 20
    .line 21
    invoke-virtual {v0}, Lyyds/ᛸᛲᲇᛶ;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Landroid/view/View;

    .line 26
    .line 27
    const v1, 0x6609036c

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lyyds/ᲀᛱ;

    .line 35
    .line 36
    if-nez v2, :cond_0

    .line 37
    .line 38
    new-instance v2, Lyyds/ᲀᛱ;

    .line 39
    .line 40
    invoke-direct {v2}, Lyyds/ᲀᛱ;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    iget-object p0, v2, Lyyds/ᲀᛱ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-static {p0}, Lyyds/ᲈᛸᲁᛶ;->ᛳᲁᲁᲇ(Ljava/util/List;)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    const/4 v2, -0x1

    .line 53
    if-lt v2, v1, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lyyds/ᛱᛸᛶᛲ;->ᛲᲈᲁ()V

    .line 64
    .line 65
    .line 66
    :cond_2
    return-void
.end method

.method public static ᛶᛷᛲᲁ(ILyyds/ᲁᛶᲁᲀ;)Lyyds/ᛴᛳᲈᛵ;
    .locals 2

    .line 1
    sget-object v0, Lyyds/ᛷᛶᲇᲁ;->ᛶᛷᛲᲁ:Lyyds/ᛷᛶᲇᲁ;

    .line 2
    .line 3
    invoke-static {p0}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_2

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq p0, v1, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-ne p0, v1, :cond_0

    .line 14
    .line 15
    new-instance p0, Lyyds/ᛷᲈᛴᲁ;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lyyds/ᛷᲈᛴᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛶᲁᲀ;

    .line 21
    .line 22
    iput-object v0, p0, Lyyds/ᛷᲈᛴᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    invoke-static {}, Lyyds/ᛱᛸᛶᛲ;->ᛷᲈᲈᲁ()V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0

    .line 30
    :cond_1
    new-instance p0, Lyyds/ᛸᲀᛲᛶ;

    .line 31
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lyyds/ᛸᲀᛲᛶ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛶᲁᲀ;

    .line 36
    .line 37
    iput-object v0, p0, Lyyds/ᛸᲀᛲᛶ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_2
    new-instance p0, Lyyds/ᛱᛲᛶᛱ;

    .line 41
    .line 42
    invoke-direct {p0, p1}, Lyyds/ᛱᛲᛶᛱ;-><init>(Lyyds/ᲁᛶᲁᲀ;)V

    .line 43
    .line 44
    .line 45
    return-object p0
.end method

.method public static final ᛷᲈᲈᲁ(Lyyds/ᛱᛵᛷ;Ljava/lang/String;Z)Lyyds/ᛴᛷᲇᲁ;
    .locals 13

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "PRAGMA index_xinfo(`"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, "`)"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {p0, v0}, Lyyds/ᛱᛵᛷ;->ᲀᛲᛱᛱ(Ljava/lang/String;)Lyyds/ᛵᲇᛱᛸ;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :try_start_0
    const-string v0, "seqno"

    .line 25
    .line 26
    invoke-static {p0, v0}, Lyyds/ᛲᛸᲈᲈ;->ᲇᲈᛵᛷ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const-string v1, "cid"

    .line 31
    .line 32
    invoke-static {p0, v1}, Lyyds/ᛲᛸᲈᲈ;->ᲇᲈᛵᛷ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    const-string v2, "name"

    .line 37
    .line 38
    invoke-static {p0, v2}, Lyyds/ᛲᛸᲈᲈ;->ᲇᲈᛵᛷ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const-string v3, "desc"

    .line 43
    .line 44
    invoke-static {p0, v3}, Lyyds/ᛲᛸᲈᲈ;->ᲇᲈᛵᛷ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    const/4 v4, -0x1

    .line 49
    const/4 v5, 0x0

    .line 50
    if-eq v0, v4, :cond_6

    .line 51
    .line 52
    if-eq v1, v4, :cond_6

    .line 53
    .line 54
    if-eq v2, v4, :cond_6

    .line 55
    .line 56
    if-ne v3, v4, :cond_0

    .line 57
    .line 58
    goto/16 :goto_4

    .line 59
    .line 60
    :cond_0
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 61
    .line 62
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 63
    .line 64
    .line 65
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 66
    .line 67
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 68
    .line 69
    .line 70
    :goto_0
    invoke-interface {p0}, Lyyds/ᛵᲇᛱᛸ;->ᛵᲀᛵᛸ()Z

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-eqz v7, :cond_3

    .line 75
    .line 76
    invoke-interface {p0, v1}, Lyyds/ᛵᲇᛱᛸ;->getLong(I)J

    .line 77
    .line 78
    .line 79
    move-result-wide v7

    .line 80
    long-to-int v7, v7

    .line 81
    if-gez v7, :cond_1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    invoke-interface {p0, v0}, Lyyds/ᛵᲇᛱᛸ;->getLong(I)J

    .line 85
    .line 86
    .line 87
    move-result-wide v7

    .line 88
    long-to-int v7, v7

    .line 89
    invoke-interface {p0, v2}, Lyyds/ᛵᲇᛱᛸ;->ᛱᲈᲁ(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    invoke-interface {p0, v3}, Lyyds/ᛵᲇᛱᛸ;->getLong(I)J

    .line 94
    .line 95
    .line 96
    move-result-wide v9

    .line 97
    const-wide/16 v11, 0x0

    .line 98
    .line 99
    cmp-long v9, v9, v11

    .line 100
    .line 101
    if-lez v9, :cond_2

    .line 102
    .line 103
    const-string v9, "DESC"

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :catchall_0
    move-exception p1

    .line 107
    goto/16 :goto_5

    .line 108
    .line 109
    :cond_2
    const-string v9, "ASC"

    .line 110
    .line 111
    :goto_1
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    invoke-interface {v4, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    invoke-interface {v6, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_3
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    new-instance v1, Lyyds/ᛶᛳᛶᛵ;

    .line 131
    .line 132
    const/16 v2, 0x12

    .line 133
    .line 134
    invoke-direct {v1, v2}, Lyyds/ᛶᛳᛶᛵ;-><init>(I)V

    .line 135
    .line 136
    .line 137
    invoke-static {v0, v1}, Lyyds/ᛷᛷᛶᲇ;->ᛶᛴᛱᛲ(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    new-instance v1, Ljava/util/ArrayList;

    .line 142
    .line 143
    const/16 v2, 0xa

    .line 144
    .line 145
    invoke-static {v0, v2}, Lyyds/ᛱᛱᛵᛲ;->ᛳᛸᛴᛶ(Ljava/lang/Iterable;I)I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 150
    .line 151
    .line 152
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    if-eqz v3, :cond_4

    .line 161
    .line 162
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    check-cast v3, Ljava/util/Map$Entry;

    .line 167
    .line 168
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    check-cast v3, Ljava/lang/String;

    .line 173
    .line 174
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_4
    invoke-static {v1}, Lyyds/ᛷᛷᛶᲇ;->ᛴᛸᛴᛸ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    new-instance v3, Lyyds/ᛶᛳᛶᛵ;

    .line 187
    .line 188
    const/16 v4, 0x13

    .line 189
    .line 190
    invoke-direct {v3, v4}, Lyyds/ᛶᛳᛶᛵ;-><init>(I)V

    .line 191
    .line 192
    .line 193
    invoke-static {v1, v3}, Lyyds/ᛷᛷᛶᲇ;->ᛶᛴᛱᛲ(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    new-instance v3, Ljava/util/ArrayList;

    .line 198
    .line 199
    invoke-static {v1, v2}, Lyyds/ᛱᛱᛵᛲ;->ᛳᛸᛴᛶ(Ljava/lang/Iterable;I)I

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 204
    .line 205
    .line 206
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    if-eqz v2, :cond_5

    .line 215
    .line 216
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    check-cast v2, Ljava/util/Map$Entry;

    .line 221
    .line 222
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    check-cast v2, Ljava/lang/String;

    .line 227
    .line 228
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_5
    invoke-static {v3}, Lyyds/ᛷᛷᛶᲇ;->ᛴᛸᛴᛸ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    new-instance v2, Lyyds/ᛴᛷᲇᲁ;

    .line 237
    .line 238
    invoke-direct {v2, p1, p2, v0, v1}, Lyyds/ᛴᛷᲇᲁ;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 239
    .line 240
    .line 241
    invoke-static {p0, v5}, Lyyds/ᛴᛲᛴᛲ;->ᛲᲈᲁ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/Throwable;)V

    .line 242
    .line 243
    .line 244
    return-object v2

    .line 245
    :cond_6
    :goto_4
    invoke-static {p0, v5}, Lyyds/ᛴᛲᛴᛲ;->ᛲᲈᲁ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/Throwable;)V

    .line 246
    .line 247
    .line 248
    return-object v5

    .line 249
    :goto_5
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 250
    :catchall_1
    move-exception p2

    .line 251
    invoke-static {p0, p1}, Lyyds/ᛴᛲᛴᛲ;->ᛲᲈᲁ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/Throwable;)V

    .line 252
    .line 253
    .line 254
    throw p2
.end method

.method public static final ᲀᛲᛳᲀ(C)I
    .locals 3

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    if-gt v0, p0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x3a

    .line 6
    .line 7
    if-ge p0, v1, :cond_0

    .line 8
    .line 9
    sub-int/2addr p0, v0

    .line 10
    return p0

    .line 11
    :cond_0
    const/16 v0, 0x61

    .line 12
    .line 13
    if-gt v0, p0, :cond_1

    .line 14
    .line 15
    const/16 v0, 0x67

    .line 16
    .line 17
    if-ge p0, v0, :cond_1

    .line 18
    .line 19
    add-int/lit8 p0, p0, -0x57

    .line 20
    .line 21
    return p0

    .line 22
    :cond_1
    const/16 v0, 0x41

    .line 23
    .line 24
    if-gt v0, p0, :cond_2

    .line 25
    .line 26
    const/16 v0, 0x47

    .line 27
    .line 28
    if-ge p0, v0, :cond_2

    .line 29
    .line 30
    add-int/lit8 p0, p0, -0x37

    .line 31
    .line 32
    return p0

    .line 33
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v2, "Unexpected hex digit: "

    .line 38
    .line 39
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v0
.end method

.method public static ᲇᲇᲇᛱ(Lyyds/ᲁᛶᛱᛴ;Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;
    .locals 1

    .line 1
    invoke-interface {p0}, Lyyds/ᲁᛶᛱᛴ;->getKey()Lyyds/ᲁᛸᛲᲁ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public static ᲇᲈᛵᛷ(Ljava/io/File;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 v0, 0x0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    return v0

    .line 16
    :cond_0
    array-length v2, p0

    .line 17
    move v3, v0

    .line 18
    move v4, v1

    .line 19
    :goto_0
    if-ge v3, v2, :cond_2

    .line 20
    .line 21
    aget-object v5, p0, v3

    .line 22
    .line 23
    invoke-static {v5}, Lyyds/ᛷᛶᛷᛵ;->ᲇᲈᛵᛷ(Ljava/io/File;)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_1

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    move v4, v1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v4, v0

    .line 34
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    return v4

    .line 38
    :cond_3
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 39
    .line 40
    .line 41
    return v1
.end method
