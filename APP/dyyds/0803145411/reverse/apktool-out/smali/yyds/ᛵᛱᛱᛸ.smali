.class public final Lyyds/ᛵᛱᛱᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᛳᲇ:Lyyds/ᛶᲀᛶᲀ;

.field public ᛱᲈᲁ:Lyyds/ᛳᲇᛲᲁ;

.field public ᛲᛲᲈᲈ:Z

.field public ᛲᛳᛶᲁ:Lyyds/ᛴᛳᲀᲈ;

.field public ᛲᛴᛳᛲ:I

.field public final ᛲᲈᲁ:Ljava/util/ArrayList;

.field public ᛳᲁᲁᲇ:Lyyds/ᛲᛲᲀᲈ;

.field public ᛵᛶᛲᲀ:Z

.field public final ᛵᛸᛸᛷ:Ljava/util/ArrayList;

.field public ᛶᛳᛶᛵ:Z

.field public ᛶᛷᛲᲁ:Ljava/lang/Class;

.field public ᛷᛲᲈᛱ:Ljava/lang/Class;

.field public ᛷᛵᲇᲀ:Z

.field public ᛷᲈᲈᲁ:Lyyds/ᛲᛷᲈᛴ;

.field public ᲀᛲᛳᲀ:Lyyds/ᲇᲈᲁᛷ;

.field public ᲇᛱᛲ:Lyyds/ᲁᲁᲇᛷ;

.field public ᲇᲇᲇᛱ:I

.field public ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lyyds/ᛵᛱᛱᛸ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lyyds/ᛵᛱᛱᛸ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final ᛲᛴᛳᛲ(Ljava/lang/Class;)Lyyds/ᛳᛳᛸᲁ;
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛵᛱᛱᛸ;->ᛷᲈᲈᲁ:Lyyds/ᛲᛷᲈᛴ;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lyyds/ᛴᲈᛲᛷ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lyyds/ᛳᛳᛸᲁ;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v1, p0, Lyyds/ᛵᛱᛱᛸ;->ᛷᲈᲈᲁ:Lyyds/ᛲᛷᲈᛴ;

    .line 12
    .line 13
    invoke-virtual {v1}, Lyyds/ᛷᛲᲇᲀ;->entrySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lyyds/ᛳᛷᛱᛱ;

    .line 18
    .line 19
    invoke-virtual {v1}, Lyyds/ᛳᛷᛱᛱ;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/util/Map$Entry;

    .line 34
    .line 35
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Ljava/lang/Class;

    .line 40
    .line 41
    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Lyyds/ᛳᛳᛸᲁ;

    .line 52
    .line 53
    :cond_1
    if-nez v0, :cond_4

    .line 54
    .line 55
    iget-object v0, p0, Lyyds/ᛵᛱᛱᛸ;->ᛷᲈᲈᲁ:Lyyds/ᛲᛷᲈᛴ;

    .line 56
    .line 57
    invoke-virtual {v0}, Lyyds/ᛴᲈᛲᛷ;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    iget-boolean p0, p0, Lyyds/ᛵᛱᛱᛸ;->ᛶᛳᛶᛵ:Z

    .line 64
    .line 65
    if-nez p0, :cond_2

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    const-string p0, "Missing transformation for "

    .line 69
    .line 70
    const-string v0, ". If you wish to ignore unknown resource types, use the optional transformation methods."

    .line 71
    .line 72
    invoke-static {p1, p0, v0}, Lyyds/ᛷᲈᲈᛶ;->ᲇᲇᲇᛱ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    const/4 p0, 0x0

    .line 76
    return-object p0

    .line 77
    :cond_3
    :goto_0
    sget-object p0, Lyyds/ᛸᛸᲈᛱ;->ᛵᛸᛸᛷ:Lyyds/ᛸᛸᲈᛱ;

    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_4
    return-object v0
.end method

.method public final ᛲᲈᲁ()Ljava/util/ArrayList;
    .locals 7

    .line 1
    iget-boolean v0, p0, Lyyds/ᛵᛱᛱᛸ;->ᛲᛲᲈᲈ:Z

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛵᛱᛱᛸ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 4
    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lyyds/ᛵᛱᛱᛸ;->ᛲᛲᲈᲈ:Z

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lyyds/ᛵᛱᛱᛸ;->ᛵᛸᛸᛷ()Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v2, 0x0

    .line 22
    move v3, v2

    .line 23
    :goto_0
    if-ge v3, v0, :cond_3

    .line 24
    .line 25
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Lyyds/ᛵᲁᛴᛱ;

    .line 30
    .line 31
    iget-object v5, v4, Lyyds/ᛵᲁᛴᛱ;->ᛲᲈᲁ:Lyyds/ᛶᲀᛶᲀ;

    .line 32
    .line 33
    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 34
    .line 35
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-nez v5, :cond_0

    .line 40
    .line 41
    iget-object v4, v4, Lyyds/ᛵᲁᛴᛱ;->ᛲᲈᲁ:Lyyds/ᛶᲀᛶᲀ;

    .line 42
    .line 43
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    :cond_0
    move v4, v2

    .line 47
    :goto_1
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-ge v4, v5, :cond_2

    .line 52
    .line 53
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-nez v5, :cond_1

    .line 62
    .line 63
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    check-cast v5, Lyyds/ᛶᲀᛶᲀ;

    .line 68
    .line 69
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    return-object v1
.end method

.method public final ᛵᛸᛸᛷ()Ljava/util/ArrayList;
    .locals 9

    .line 1
    iget-boolean v0, p0, Lyyds/ᛵᛱᛱᛸ;->ᛷᛵᲇᲀ:Z

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛵᛱᛱᛸ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lyyds/ᛵᛱᛱᛸ;->ᛷᛵᲇᲀ:Z

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lyyds/ᛵᛱᛱᛸ;->ᲀᛲᛳᲀ:Lyyds/ᲇᲈᲁᛷ;

    .line 14
    .line 15
    invoke-virtual {v0}, Lyyds/ᲇᲈᲁᛷ;->ᛲᲈᲁ()Lyyds/ᛷᛶᛷ;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v2, p0, Lyyds/ᛵᛱᛱᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Lyyds/ᛷᛶᛷ;->ᲇᲇᲇᛱ(Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v3, 0x0

    .line 30
    :goto_0
    if-ge v3, v2, :cond_1

    .line 31
    .line 32
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Lyyds/ᛴᛷᛷ;

    .line 37
    .line 38
    iget-object v5, p0, Lyyds/ᛵᛱᛱᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 39
    .line 40
    iget v6, p0, Lyyds/ᛵᛱᛱᛸ;->ᛲᛴᛳᛲ:I

    .line 41
    .line 42
    iget v7, p0, Lyyds/ᛵᛱᛱᛸ;->ᲇᲇᲇᛱ:I

    .line 43
    .line 44
    iget-object v8, p0, Lyyds/ᛵᛱᛱᛸ;->ᛲᛳᛶᲁ:Lyyds/ᛴᛳᲀᲈ;

    .line 45
    .line 46
    invoke-interface {v4, v5, v6, v7, v8}, Lyyds/ᛴᛷᛷ;->ᛲᲈᲁ(Ljava/lang/Object;IILyyds/ᛴᛳᲀᲈ;)Lyyds/ᛵᲁᛴᛱ;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    if-eqz v4, :cond_0

    .line 51
    .line 52
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    return-object v1
.end method

.method public final ᲀᛲᛳᲀ(Ljava/lang/Class;)Lyyds/ᛶᛶᛷᲁ;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lyyds/ᛵᛱᛱᛸ;->ᲀᛲᛳᲀ:Lyyds/ᲇᲈᲁᛷ;

    .line 6
    .line 7
    invoke-virtual {v2}, Lyyds/ᲇᲈᲁᛷ;->ᛲᲈᲁ()Lyyds/ᛷᛶᛷ;

    .line 8
    .line 9
    .line 10
    move-result-object v7

    .line 11
    iget-object v8, v0, Lyyds/ᛵᛱᛱᛸ;->ᛶᛷᛲᲁ:Ljava/lang/Class;

    .line 12
    .line 13
    iget-object v9, v0, Lyyds/ᛵᛱᛱᛸ;->ᛷᛲᲈᛱ:Ljava/lang/Class;

    .line 14
    .line 15
    iget-object v0, v7, Lyyds/ᛷᛶᛷ;->ᛲᛳᛶᲁ:Lyyds/ᛸᛳᛶᛲ;

    .line 16
    .line 17
    iget-object v2, v0, Lyyds/ᛸᛳᛶᛲ;->ᛵᛸᛸᛷ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 18
    .line 19
    const/4 v10, 0x0

    .line 20
    invoke-virtual {v2, v10}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lyyds/ᛶᲈᲇᛳ;

    .line 25
    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    new-instance v2, Lyyds/ᛶᲈᲇᛳ;

    .line 29
    .line 30
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    :cond_0
    iput-object v1, v2, Lyyds/ᛶᲈᲇᛳ;->ᛲᲈᲁ:Ljava/lang/Class;

    .line 34
    .line 35
    iput-object v8, v2, Lyyds/ᛶᲈᲇᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Class;

    .line 36
    .line 37
    iput-object v9, v2, Lyyds/ᛶᲈᲇᛳ;->ᲀᛲᛳᲀ:Ljava/lang/Class;

    .line 38
    .line 39
    iget-object v3, v0, Lyyds/ᛸᛳᛶᛲ;->ᛲᲈᲁ:Lyyds/ᛷᛲᲇᲀ;

    .line 40
    .line 41
    monitor-enter v3

    .line 42
    :try_start_0
    iget-object v4, v0, Lyyds/ᛸᛳᛶᛲ;->ᛲᲈᲁ:Lyyds/ᛷᛲᲇᲀ;

    .line 43
    .line 44
    invoke-virtual {v4, v2}, Lyyds/ᛴᲈᛲᛷ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, Lyyds/ᛶᛶᛷᲁ;

    .line 49
    .line 50
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 51
    iget-object v0, v0, Lyyds/ᛸᛳᛶᛲ;->ᛵᛸᛸᛷ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 52
    .line 53
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, v7, Lyyds/ᛷᛶᛷ;->ᛲᛳᛶᲁ:Lyyds/ᛸᛳᛶᛲ;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    sget-object v0, Lyyds/ᛸᛳᛶᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛶᛷᲁ;

    .line 62
    .line 63
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    return-object v10

    .line 70
    :cond_1
    if-nez v4, :cond_f

    .line 71
    .line 72
    new-instance v11, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    iget-object v0, v7, Lyyds/ᛷᛶᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛵᛱᛱ;

    .line 78
    .line 79
    invoke-virtual {v0, v1, v8}, Lyyds/ᛱᛵᛱᛱ;->ᛶᛸᲀᲁ(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v12

    .line 87
    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_c

    .line 92
    .line 93
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    move-object v2, v0

    .line 98
    check-cast v2, Ljava/lang/Class;

    .line 99
    .line 100
    iget-object v0, v7, Lyyds/ᛷᛶᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᛷᛷ;

    .line 101
    .line 102
    invoke-virtual {v0, v2, v9}, Lyyds/ᲀᲈᛷᛷ;->ᲀᛲᛳᲀ(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object v13

    .line 110
    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_b

    .line 115
    .line 116
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    move-object v3, v0

    .line 121
    check-cast v3, Ljava/lang/Class;

    .line 122
    .line 123
    iget-object v4, v7, Lyyds/ᛷᛶᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛵᛱᛱ;

    .line 124
    .line 125
    monitor-enter v4

    .line 126
    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 129
    .line 130
    .line 131
    iget-object v5, v4, Lyyds/ᛱᛵᛱᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v5, Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    const/4 v15, 0x1

    .line 144
    if-eqz v6, :cond_6

    .line 145
    .line 146
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    check-cast v6, Ljava/lang/String;

    .line 151
    .line 152
    iget-object v10, v4, Lyyds/ᛱᛵᛱᛱ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v10, Ljava/util/HashMap;

    .line 155
    .line 156
    invoke-virtual {v10, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    check-cast v6, Ljava/util/List;

    .line 161
    .line 162
    if-nez v6, :cond_3

    .line 163
    .line 164
    :cond_2
    const/4 v10, 0x0

    .line 165
    goto :goto_2

    .line 166
    :cond_3
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    :cond_4
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v10

    .line 174
    if-eqz v10, :cond_2

    .line 175
    .line 176
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v10

    .line 180
    check-cast v10, Lyyds/ᲇᛳᲇᛱ;

    .line 181
    .line 182
    iget-object v14, v10, Lyyds/ᲇᛳᲇᛱ;->ᛲᲈᲁ:Ljava/lang/Class;

    .line 183
    .line 184
    invoke-virtual {v14, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 185
    .line 186
    .line 187
    move-result v14

    .line 188
    if-eqz v14, :cond_5

    .line 189
    .line 190
    iget-object v14, v10, Lyyds/ᲇᛳᲇᛱ;->ᛵᛸᛸᛷ:Ljava/lang/Class;

    .line 191
    .line 192
    invoke-virtual {v2, v14}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 193
    .line 194
    .line 195
    move-result v14

    .line 196
    if-eqz v14, :cond_5

    .line 197
    .line 198
    move v14, v15

    .line 199
    goto :goto_4

    .line 200
    :cond_5
    const/4 v14, 0x0

    .line 201
    :goto_4
    if-eqz v14, :cond_4

    .line 202
    .line 203
    iget-object v10, v10, Lyyds/ᲇᛳᲇᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛲᲈᲁ;

    .line 204
    .line 205
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 206
    .line 207
    .line 208
    goto :goto_3

    .line 209
    :catchall_0
    move-exception v0

    .line 210
    goto/16 :goto_a

    .line 211
    .line 212
    :cond_6
    monitor-exit v4

    .line 213
    iget-object v5, v7, Lyyds/ᛷᛶᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᛷᛷ;

    .line 214
    .line 215
    monitor-enter v5

    .line 216
    :try_start_2
    invoke-virtual {v3, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    if-eqz v4, :cond_7

    .line 221
    .line 222
    sget-object v4, Lyyds/ᲀᛴᛱᛷ;->ᛷᲈᲈᲁ:Lyyds/ᲀᛴᛱᛷ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 223
    .line 224
    monitor-exit v5

    .line 225
    :goto_5
    move-object v5, v4

    .line 226
    move-object v4, v0

    .line 227
    goto :goto_8

    .line 228
    :catchall_1
    move-exception v0

    .line 229
    goto :goto_9

    .line 230
    :cond_7
    :try_start_3
    iget-object v4, v5, Lyyds/ᲀᲈᛷᛷ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 231
    .line 232
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 237
    .line 238
    .line 239
    move-result v6

    .line 240
    if-eqz v6, :cond_a

    .line 241
    .line 242
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    check-cast v6, Lyyds/ᛵᲁᲈᛷ;

    .line 247
    .line 248
    iget-object v10, v6, Lyyds/ᛵᲁᲈᛷ;->ᛲᲈᲁ:Ljava/lang/Class;

    .line 249
    .line 250
    invoke-virtual {v10, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 251
    .line 252
    .line 253
    move-result v10

    .line 254
    if-eqz v10, :cond_8

    .line 255
    .line 256
    iget-object v10, v6, Lyyds/ᛵᲁᲈᛷ;->ᛵᛸᛸᛷ:Ljava/lang/Class;

    .line 257
    .line 258
    invoke-virtual {v3, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 259
    .line 260
    .line 261
    move-result v10

    .line 262
    if-eqz v10, :cond_8

    .line 263
    .line 264
    move v10, v15

    .line 265
    goto :goto_7

    .line 266
    :cond_8
    const/4 v10, 0x0

    .line 267
    :goto_7
    if-eqz v10, :cond_9

    .line 268
    .line 269
    iget-object v4, v6, Lyyds/ᛵᲁᲈᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛷᲀᛵ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 270
    .line 271
    monitor-exit v5

    .line 272
    goto :goto_5

    .line 273
    :goto_8
    new-instance v0, Lyyds/ᛴᲁᛷᲀ;

    .line 274
    .line 275
    iget-object v6, v7, Lyyds/ᛷᛶᛷ;->ᛷᲈᲈᲁ:Lyyds/ᛳᛷᲀᛴ;

    .line 276
    .line 277
    invoke-direct/range {v0 .. v6}, Lyyds/ᛴᲁᛷᲀ;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;Lyyds/ᛸᛷᲀᛵ;Lyyds/ᛴᲀᲇᛱ;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-object/from16 v1, p1

    .line 284
    .line 285
    const/4 v10, 0x0

    .line 286
    goto/16 :goto_1

    .line 287
    .line 288
    :cond_9
    move-object/from16 v1, p1

    .line 289
    .line 290
    goto :goto_6

    .line 291
    :cond_a
    :try_start_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 292
    .line 293
    new-instance v1, Ljava/lang/StringBuilder;

    .line 294
    .line 295
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 296
    .line 297
    .line 298
    const-string v4, "No transcoder registered to transcode from "

    .line 299
    .line 300
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    const-string v2, " to "

    .line 307
    .line 308
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    throw v0

    .line 322
    :goto_9
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 323
    throw v0

    .line 324
    :goto_a
    :try_start_5
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 325
    throw v0

    .line 326
    :cond_b
    move-object/from16 v1, p1

    .line 327
    .line 328
    goto/16 :goto_0

    .line 329
    .line 330
    :cond_c
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    if-eqz v0, :cond_d

    .line 335
    .line 336
    move-object/from16 v1, p1

    .line 337
    .line 338
    move-object v2, v8

    .line 339
    move-object v3, v9

    .line 340
    const/4 v10, 0x0

    .line 341
    goto :goto_b

    .line 342
    :cond_d
    new-instance v0, Lyyds/ᛶᛶᛷᲁ;

    .line 343
    .line 344
    iget-object v5, v7, Lyyds/ᛷᛶᛷ;->ᛷᲈᲈᲁ:Lyyds/ᛳᛷᲀᛴ;

    .line 345
    .line 346
    move-object/from16 v1, p1

    .line 347
    .line 348
    move-object v2, v8

    .line 349
    move-object v3, v9

    .line 350
    move-object v4, v11

    .line 351
    invoke-direct/range {v0 .. v5}, Lyyds/ᛶᛶᛷᲁ;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;Lyyds/ᛴᲀᲇᛱ;)V

    .line 352
    .line 353
    .line 354
    move-object v10, v0

    .line 355
    :goto_b
    iget-object v0, v7, Lyyds/ᛷᛶᛷ;->ᛲᛳᛶᲁ:Lyyds/ᛸᛳᛶᛲ;

    .line 356
    .line 357
    iget-object v5, v0, Lyyds/ᛸᛳᛶᛲ;->ᛲᲈᲁ:Lyyds/ᛷᛲᲇᲀ;

    .line 358
    .line 359
    monitor-enter v5

    .line 360
    :try_start_6
    iget-object v0, v0, Lyyds/ᛸᛳᛶᛲ;->ᛲᲈᲁ:Lyyds/ᛷᛲᲇᲀ;

    .line 361
    .line 362
    new-instance v4, Lyyds/ᛶᲈᲇᛳ;

    .line 363
    .line 364
    invoke-direct {v4, v1, v2, v3}, Lyyds/ᛶᲈᲇᛳ;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 365
    .line 366
    .line 367
    if-eqz v10, :cond_e

    .line 368
    .line 369
    move-object v1, v10

    .line 370
    goto :goto_c

    .line 371
    :cond_e
    sget-object v1, Lyyds/ᛸᛳᛶᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛶᛷᲁ;

    .line 372
    .line 373
    :goto_c
    invoke-virtual {v0, v4, v1}, Lyyds/ᛴᲈᛲᛷ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    monitor-exit v5

    .line 377
    return-object v10

    .line 378
    :catchall_2
    move-exception v0

    .line 379
    monitor-exit v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 380
    throw v0

    .line 381
    :cond_f
    return-object v4

    .line 382
    :catchall_3
    move-exception v0

    .line 383
    :try_start_7
    monitor-exit v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 384
    throw v0
.end method

.method public final ᲇᲈᛵᛷ(Ljava/lang/Object;)Lyyds/ᛵᛴᲁᛶ;
    .locals 4

    .line 1
    iget-object p0, p0, Lyyds/ᛵᛱᛱᛸ;->ᲀᛲᛳᲀ:Lyyds/ᲇᲈᲁᛷ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᲇᲈᲁᛷ;->ᛲᲈᲁ()Lyyds/ᛷᛶᛷ;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Lyyds/ᛷᛶᛷ;->ᛵᛸᛸᛷ:Lyyds/ᲀᲈᛷᛷ;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    monitor-enter p0

    .line 14
    :try_start_0
    iget-object v1, p0, Lyyds/ᲀᲈᛷᛷ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lyyds/ᛲᛴᛲ;

    .line 31
    .line 32
    iget-object v3, v2, Lyyds/ᛲᛴᛲ;->ᛲᲈᲁ:Ljava/lang/Class;

    .line 33
    .line 34
    invoke-virtual {v3, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    iget-object v0, v2, Lyyds/ᛲᛴᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᛴᲁᛶ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    monitor-exit p0

    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    monitor-exit p0

    .line 47
    const/4 v0, 0x0

    .line 48
    :goto_0
    if-eqz v0, :cond_2

    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_2
    new-instance p0, Lyyds/ᲇᲈᛶᛲ;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string v1, "Failed to find source encoder for data class: "

    .line 60
    .line 61
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p0

    .line 75
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    throw p1
.end method
