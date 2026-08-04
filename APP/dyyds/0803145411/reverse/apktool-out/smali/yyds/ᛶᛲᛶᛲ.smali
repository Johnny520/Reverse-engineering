.class public Lyyds/ᛶᛲᛶᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᛴᛳᛲ:I

.field public final synthetic ᛲᲈᲁ:I

.field public ᛵᛸᛸᛷ:I

.field public final ᛶᛷᛲᲁ:Ljava/lang/Object;

.field public ᲀᛲᛳᲀ:I

.field public final ᲇᲇᲇᛱ:Ljava/lang/Object;

.field public ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lyyds/ᛶᛲᛶᛲ;->ᛲᲈᲁ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lyyds/ᛶᛲᛶᛲ;->ᛵᛸᛸᛷ:I

    .line 8
    .line 9
    if-lez p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Lyyds/ᲁᛵᛱᲇ;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p1, v0}, Lyyds/ᲁᛵᛱᲇ;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lyyds/ᛶᛲᛶᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 18
    .line 19
    new-instance p1, Lyyds/ᛷᛶᲇᲁ;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lyyds/ᛶᛲᛶᛲ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const-string p0, "maxSize <= 0"

    .line 28
    .line 29
    invoke-static {p0}, Lyyds/ᛷᛸ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    throw p0
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lyyds/ᛶᛲᛶᛲ;->ᛲᲈᲁ:I

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyyds/ᛶᛲᛶᛲ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 35
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lyyds/ᛶᛲᛶᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    const/high16 p1, -0x80000000

    .line 36
    iput p1, p0, Lyyds/ᛶᛲᛶᛲ;->ᛵᛸᛸᛷ:I

    .line 37
    iput p1, p0, Lyyds/ᛶᛲᛶᛲ;->ᲀᛲᛳᲀ:I

    const/4 p1, 0x0

    .line 38
    iput p1, p0, Lyyds/ᛶᛲᛶᛲ;->ᲇᲈᛵᛷ:I

    .line 39
    iput p2, p0, Lyyds/ᛶᛲᛶᛲ;->ᛲᛴᛳᛲ:I

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lyyds/ᛶᛲᛶᛲ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    const-string v0, "LruCache[maxSize="

    .line 12
    .line 13
    iget-object v1, p0, Lyyds/ᛶᛲᛶᛲ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lyyds/ᛷᛶᲇᲁ;

    .line 16
    .line 17
    monitor-enter v1

    .line 18
    :try_start_0
    iget v2, p0, Lyyds/ᛶᛲᛶᛲ;->ᲇᲈᛵᛷ:I

    .line 19
    .line 20
    iget v3, p0, Lyyds/ᛶᛲᛶᛲ;->ᛲᛴᛳᛲ:I

    .line 21
    .line 22
    add-int/2addr v3, v2

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    mul-int/lit8 v2, v2, 0x64

    .line 26
    .line 27
    div-int/2addr v2, v3

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    const/4 v2, 0x0

    .line 32
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget v0, p0, Lyyds/ᛶᛲᛶᛲ;->ᛵᛸᛸᛷ:I

    .line 38
    .line 39
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v0, ",hits="

    .line 43
    .line 44
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget v0, p0, Lyyds/ᛶᛲᛶᛲ;->ᲇᲈᛵᛷ:I

    .line 48
    .line 49
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, ",misses="

    .line 53
    .line 54
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget p0, p0, Lyyds/ᛶᛲᛶᛲ;->ᛲᛴᛳᛲ:I

    .line 58
    .line 59
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string p0, ",hitRate="

    .line 63
    .line 64
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string p0, "%]"

    .line 71
    .line 72
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    monitor-exit v1

    .line 80
    return-object p0

    .line 81
    :goto_1
    monitor-exit v1

    .line 82
    throw p0

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public ᛱᲈᲁ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛶᛲᛶᛲ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyyds/ᛷᛶᲇᲁ;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lyyds/ᛶᛲᛶᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lyyds/ᲁᛵᛱᲇ;

    .line 9
    .line 10
    iget-object v1, v1, Lyyds/ᲁᛵᛱᲇ;->ᛲᲈᲁ:Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget p1, p0, Lyyds/ᛶᛲᛶᛲ;->ᲇᲈᛵᛷ:I

    .line 19
    .line 20
    add-int/lit8 p1, p1, 0x1

    .line 21
    .line 22
    iput p1, p0, Lyyds/ᛶᛲᛶᛲ;->ᲇᲈᛵᛷ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    monitor-exit v0

    .line 25
    return-object v1

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    :try_start_1
    iget v1, p0, Lyyds/ᛶᛲᛶᛲ;->ᛲᛴᛳᛲ:I

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    iput v1, p0, Lyyds/ᛶᛲᛶᛲ;->ᛲᛴᛳᛲ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    .line 34
    monitor-exit v0

    .line 35
    invoke-virtual {p0, p1}, Lyyds/ᛶᛲᛶᛲ;->ᲀᛲᛳᲀ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    return-object p0

    .line 43
    :cond_1
    iget-object v1, p0, Lyyds/ᛶᛲᛶᛲ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Lyyds/ᛷᛶᲇᲁ;

    .line 46
    .line 47
    monitor-enter v1

    .line 48
    :try_start_2
    iget-object v2, p0, Lyyds/ᛶᛲᛶᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Lyyds/ᲁᛵᛱᲇ;

    .line 51
    .line 52
    iget-object v2, v2, Lyyds/ᲁᛵᛱᲇ;->ᛲᲈᲁ:Ljava/util/LinkedHashMap;

    .line 53
    .line 54
    invoke-virtual {v2, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    if-eqz v2, :cond_2

    .line 59
    .line 60
    iget-object v3, p0, Lyyds/ᛶᛲᛶᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v3, Lyyds/ᲁᛵᛱᲇ;

    .line 63
    .line 64
    iget-object v3, v3, Lyyds/ᲁᛵᛱᲇ;->ᛲᲈᲁ:Ljava/util/LinkedHashMap;

    .line 65
    .line 66
    invoke-virtual {v3, p1, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    iget v3, p0, Lyyds/ᛶᛲᛶᛲ;->ᲀᛲᛳᲀ:I

    .line 71
    .line 72
    add-int/lit8 v3, v3, 0x1

    .line 73
    .line 74
    iput v3, p0, Lyyds/ᛶᛲᛶᛲ;->ᲀᛲᛳᲀ:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 75
    .line 76
    :goto_0
    monitor-exit v1

    .line 77
    if-eqz v2, :cond_3

    .line 78
    .line 79
    invoke-virtual {p0, p1, v0, v2}, Lyyds/ᛶᛲᛶᛲ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-object v2

    .line 83
    :cond_3
    iget p1, p0, Lyyds/ᛶᛲᛶᛲ;->ᛵᛸᛸᛷ:I

    .line 84
    .line 85
    invoke-virtual {p0, p1}, Lyyds/ᛶᛲᛶᛲ;->ᛲᛲᲈᲈ(I)V

    .line 86
    .line 87
    .line 88
    return-object v0

    .line 89
    :catchall_1
    move-exception p0

    .line 90
    monitor-exit v1

    .line 91
    throw p0

    .line 92
    :goto_1
    monitor-exit v0

    .line 93
    throw p0
.end method

.method public ᛲᛲᲈᲈ(I)V
    .locals 4

    .line 1
    :goto_0
    iget-object v0, p0, Lyyds/ᛶᛲᛶᛲ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyyds/ᛷᛶᲇᲁ;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget v1, p0, Lyyds/ᛶᛲᛶᛲ;->ᲀᛲᛳᲀ:I

    .line 7
    .line 8
    if-ltz v1, :cond_4

    .line 9
    .line 10
    iget-object v1, p0, Lyyds/ᛶᛲᛶᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lyyds/ᲁᛵᛱᲇ;

    .line 13
    .line 14
    iget-object v1, v1, Lyyds/ᲁᛵᛱᲇ;->ᛲᲈᲁ:Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iget v1, p0, Lyyds/ᛶᛲᛶᛲ;->ᲀᛲᛳᲀ:I

    .line 23
    .line 24
    if-nez v1, :cond_4

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_3

    .line 29
    :cond_0
    :goto_1
    iget v1, p0, Lyyds/ᛶᛲᛶᛲ;->ᲀᛲᛳᲀ:I

    .line 30
    .line 31
    if-le v1, p1, :cond_3

    .line 32
    .line 33
    iget-object v1, p0, Lyyds/ᛶᛲᛶᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Lyyds/ᲁᛵᛱᲇ;

    .line 36
    .line 37
    iget-object v1, v1, Lyyds/ᲁᛵᛱᲇ;->ᛲᲈᲁ:Ljava/util/LinkedHashMap;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_1
    iget-object v1, p0, Lyyds/ᛶᛲᛶᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Lyyds/ᲁᛵᛱᲇ;

    .line 49
    .line 50
    iget-object v1, v1, Lyyds/ᲁᛵᛱᲇ;->ᛲᲈᲁ:Ljava/util/LinkedHashMap;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v1}, Lyyds/ᛷᛷᛶᲇ;->ᲀᛴᲁᲈ(Ljava/util/Set;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Ljava/util/Map$Entry;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    if-nez v1, :cond_2

    .line 63
    .line 64
    monitor-exit v0

    .line 65
    return-void

    .line 66
    :cond_2
    :try_start_1
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iget-object v3, p0, Lyyds/ᛶᛲᛶᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v3, Lyyds/ᲁᛵᛱᲇ;

    .line 77
    .line 78
    iget-object v3, v3, Lyyds/ᲁᛵᛱᲇ;->ᛲᲈᲁ:Ljava/util/LinkedHashMap;

    .line 79
    .line 80
    invoke-virtual {v3, v2}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    iget v3, p0, Lyyds/ᛶᛲᛶᛲ;->ᲀᛲᛳᲀ:I

    .line 84
    .line 85
    add-int/lit8 v3, v3, -0x1

    .line 86
    .line 87
    iput v3, p0, Lyyds/ᛶᛲᛶᛲ;->ᲀᛲᛳᲀ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    .line 89
    monitor-exit v0

    .line 90
    const/4 v0, 0x0

    .line 91
    invoke-virtual {p0, v2, v1, v0}, Lyyds/ᛶᛲᛶᛲ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    :goto_2
    monitor-exit v0

    .line 96
    return-void

    .line 97
    :cond_4
    :try_start_2
    const-string p0, "LruCache.sizeOf() is reporting inconsistent results!"

    .line 98
    .line 99
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 100
    .line 101
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 105
    :goto_3
    monitor-exit v0

    .line 106
    throw p0
.end method

.method public ᛲᛳᛶᲁ(I)I
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛶᛲᛶᛲ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/high16 v1, -0x80000000

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    iget-object v0, p0, Lyyds/ᛶᛲᛶᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    return p1

    .line 19
    :cond_1
    invoke-virtual {p0}, Lyyds/ᛶᛲᛶᛲ;->ᛲᲈᲁ()V

    .line 20
    .line 21
    .line 22
    iget p0, p0, Lyyds/ᛶᛲᛶᛲ;->ᲀᛲᛳᲀ:I

    .line 23
    .line 24
    return p0
.end method

.method public ᛲᛴᛳᛲ()I
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛶᛲᛶᛲ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 4
    .line 5
    iget-boolean v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ᛵᲀᲈᛴ:Z

    .line 6
    .line 7
    iget-object v1, p0, Lyyds/ᛶᛲᛶᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    add-int/lit8 v0, v0, -0x1

    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    invoke-virtual {p0, v0, v1}, Lyyds/ᛶᛲᛶᛲ;->ᛶᛷᛲᲁ(II)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {p0, v0, v1}, Lyyds/ᛶᛲᛶᛲ;->ᛶᛷᛲᲁ(II)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
.end method

.method public ᛲᲈᲁ()V
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛶᛲᛶᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v1, v1, -0x1

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lyyds/ᛵᛲᛶᛸ;

    .line 22
    .line 23
    iget-object v2, p0, Lyyds/ᛶᛲᛶᛲ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 26
    .line 27
    iget-object v2, v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ᛵᛶᛲᲀ:Lyyds/ᛲᛵᲀᛳ;

    .line 28
    .line 29
    invoke-virtual {v2, v0}, Lyyds/ᛲᛵᲀᛳ;->ᲇᲈᛵᛷ(Landroid/view/View;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iput v0, p0, Lyyds/ᛶᛲᛶᛲ;->ᲀᛲᛳᲀ:I

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public ᛵᛸᛸᛷ()V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛶᛲᛶᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 6
    .line 7
    .line 8
    const/high16 v0, -0x80000000

    .line 9
    .line 10
    iput v0, p0, Lyyds/ᛶᛲᛶᛲ;->ᛵᛸᛸᛷ:I

    .line 11
    .line 12
    iput v0, p0, Lyyds/ᛶᛲᛶᛲ;->ᲀᛲᛳᲀ:I

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput v0, p0, Lyyds/ᛶᛲᛶᛲ;->ᲇᲈᛵᛷ:I

    .line 16
    .line 17
    return-void
.end method

.method public ᛶᛷᛲᲁ(II)I
    .locals 11

    .line 1
    iget-object v0, p0, Lyyds/ᛶᛲᛶᛲ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 4
    .line 5
    iget-object v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ᛵᛶᛲᲀ:Lyyds/ᛲᛵᲀᛳ;

    .line 6
    .line 7
    invoke-virtual {v1}, Lyyds/ᛲᛵᲀᛳ;->ᛲᛲᲈᲈ()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ᛵᛶᛲᲀ:Lyyds/ᛲᛵᲀᛳ;

    .line 12
    .line 13
    invoke-virtual {v2}, Lyyds/ᛲᛵᲀᛳ;->ᛲᛳᛶᲁ()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, -0x1

    .line 18
    const/4 v4, 0x1

    .line 19
    if-le p2, p1, :cond_0

    .line 20
    .line 21
    move v5, v4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v5, v3

    .line 24
    :goto_0
    if-eq p1, p2, :cond_5

    .line 25
    .line 26
    iget-object v6, p0, Lyyds/ᛶᛲᛶᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v6, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v6, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    check-cast v6, Landroid/view/View;

    .line 35
    .line 36
    iget-object v7, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ᛵᛶᛲᲀ:Lyyds/ᛲᛵᲀᛳ;

    .line 37
    .line 38
    invoke-virtual {v7, v6}, Lyyds/ᛲᛵᲀᛳ;->ᛶᛷᛲᲁ(Landroid/view/View;)I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    iget-object v8, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ᛵᛶᛲᲀ:Lyyds/ᛲᛵᲀᛳ;

    .line 43
    .line 44
    invoke-virtual {v8, v6}, Lyyds/ᛲᛵᲀᛳ;->ᲇᲈᛵᛷ(Landroid/view/View;)I

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    const/4 v9, 0x0

    .line 49
    if-gt v7, v2, :cond_1

    .line 50
    .line 51
    move v10, v4

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move v10, v9

    .line 54
    :goto_1
    if-lt v8, v1, :cond_2

    .line 55
    .line 56
    move v9, v4

    .line 57
    :cond_2
    if-eqz v10, :cond_4

    .line 58
    .line 59
    if-eqz v9, :cond_4

    .line 60
    .line 61
    if-lt v7, v1, :cond_3

    .line 62
    .line 63
    if-le v8, v2, :cond_4

    .line 64
    .line 65
    :cond_3
    invoke-static {v6}, Lyyds/ᲇᲇᛵᛲ;->ᲈᛷᲈᛶ(Landroid/view/View;)I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    return p0

    .line 70
    :cond_4
    add-int/2addr p1, v5

    .line 71
    goto :goto_0

    .line 72
    :cond_5
    return v3
.end method

.method public ᛷᛲᲈᛱ(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛶᛲᛶᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget v1, p0, Lyyds/ᛶᛲᛶᛲ;->ᛵᛸᛸᛷ:I

    .line 6
    .line 7
    const/high16 v2, -0x80000000

    .line 8
    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    return p1

    .line 19
    :cond_1
    const/4 p1, 0x0

    .line 20
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Landroid/view/View;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lyyds/ᛵᛲᛶᛸ;

    .line 31
    .line 32
    iget-object v1, p0, Lyyds/ᛶᛲᛶᛲ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 35
    .line 36
    iget-object v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ᛵᛶᛲᲀ:Lyyds/ᛲᛵᲀᛳ;

    .line 37
    .line 38
    invoke-virtual {v1, p1}, Lyyds/ᛲᛵᲀᛳ;->ᛶᛷᛲᲁ(Landroid/view/View;)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    iput p1, p0, Lyyds/ᛶᛲᛶᛲ;->ᛵᛸᛸᛷ:I

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget p0, p0, Lyyds/ᛶᛲᛶᛲ;->ᛵᛸᛸᛷ:I

    .line 48
    .line 49
    return p0
.end method

.method public ᛷᛵᲇᲀ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛶᛲᛶᛲ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyyds/ᛷᛶᲇᲁ;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget v1, p0, Lyyds/ᛶᛲᛶᛲ;->ᲀᛲᛳᲀ:I

    .line 7
    .line 8
    add-int/lit8 v1, v1, 0x1

    .line 9
    .line 10
    iput v1, p0, Lyyds/ᛶᛲᛶᛲ;->ᲀᛲᛳᲀ:I

    .line 11
    .line 12
    iget-object v1, p0, Lyyds/ᛶᛲᛶᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lyyds/ᲁᛵᛱᲇ;

    .line 15
    .line 16
    iget-object v1, v1, Lyyds/ᲁᛵᛱᲇ;->ᛲᲈᲁ:Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-virtual {v1, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    iget v2, p0, Lyyds/ᛶᛲᛶᛲ;->ᲀᛲᛳᲀ:I

    .line 25
    .line 26
    add-int/lit8 v2, v2, -0x1

    .line 27
    .line 28
    iput v2, p0, Lyyds/ᛶᛲᛶᛲ;->ᲀᛲᛳᲀ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    :goto_0
    monitor-exit v0

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0, p1, v1, p2}, Lyyds/ᛶᛲᛶᛲ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    iget p1, p0, Lyyds/ᛶᛲᛶᛲ;->ᛵᛸᛸᛷ:I

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Lyyds/ᛶᛲᛶᛲ;->ᛲᛲᲈᲈ(I)V

    .line 42
    .line 43
    .line 44
    return-object v1

    .line 45
    :goto_1
    monitor-exit v0

    .line 46
    throw p0
.end method

.method public ᛷᲈᲈᲁ(II)Landroid/view/View;
    .locals 5

    .line 1
    iget-object v0, p0, Lyyds/ᛶᛲᛶᛲ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛶᛲᛶᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, -0x1

    .line 11
    if-ne p2, v2, :cond_3

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    if-ge v2, p2, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Landroid/view/View;

    .line 25
    .line 26
    iget-boolean v4, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ᛵᲀᲈᛴ:Z

    .line 27
    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    invoke-static {v3}, Lyyds/ᲇᲇᛵᛲ;->ᲈᛷᲈᛶ(Landroid/view/View;)I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-le v4, p1, :cond_2

    .line 35
    .line 36
    :cond_0
    iget-boolean v4, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ᛵᲀᲈᛴ:Z

    .line 37
    .line 38
    if-nez v4, :cond_1

    .line 39
    .line 40
    invoke-static {v3}, Lyyds/ᲇᲇᛵᛲ;->ᲈᛷᲈᛶ(Landroid/view/View;)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-lt v4, p1, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {v3}, Landroid/view/View;->hasFocusable()Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_2

    .line 52
    .line 53
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    move-object v1, v3

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    :goto_1
    return-object v1

    .line 58
    :cond_3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    add-int/lit8 p2, p2, -0x1

    .line 63
    .line 64
    :goto_2
    if-ltz p2, :cond_6

    .line 65
    .line 66
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Landroid/view/View;

    .line 71
    .line 72
    iget-boolean v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ᛵᲀᲈᛴ:Z

    .line 73
    .line 74
    if-eqz v3, :cond_4

    .line 75
    .line 76
    invoke-static {v2}, Lyyds/ᲇᲇᛵᛲ;->ᲈᛷᲈᛶ(Landroid/view/View;)I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-ge v3, p1, :cond_6

    .line 81
    .line 82
    :cond_4
    iget-boolean v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ᛵᲀᲈᛴ:Z

    .line 83
    .line 84
    if-nez v3, :cond_5

    .line 85
    .line 86
    invoke-static {v2}, Lyyds/ᲇᲇᛵᛲ;->ᲈᛷᲈᛶ(Landroid/view/View;)I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-gt v3, p1, :cond_5

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_5
    invoke-virtual {v2}, Landroid/view/View;->hasFocusable()Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-eqz v3, :cond_6

    .line 98
    .line 99
    add-int/lit8 p2, p2, -0x1

    .line 100
    .line 101
    move-object v1, v2

    .line 102
    goto :goto_2

    .line 103
    :cond_6
    :goto_3
    return-object v1
.end method

.method public ᲀᛲᛳᲀ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public ᲇᲇᲇᛱ()I
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛶᛲᛶᛲ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 4
    .line 5
    iget-boolean v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ᛵᲀᲈᛴ:Z

    .line 6
    .line 7
    iget-object v1, p0, Lyyds/ᛶᛲᛶᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {p0, v0, v1}, Lyyds/ᛶᛲᛶᛲ;->ᛶᛷᛲᲁ(II)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    add-int/lit8 v0, v0, -0x1

    .line 28
    .line 29
    const/4 v1, -0x1

    .line 30
    invoke-virtual {p0, v0, v1}, Lyyds/ᛶᛲᛶᛲ;->ᛶᛷᛲᲁ(II)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
.end method

.method public ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method
