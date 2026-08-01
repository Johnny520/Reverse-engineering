.class public Lxhss/ᲇᲀᲈᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᲇᛵᛲᲁ;

.field public final ᛳᲁᲇᛸ:Lxhss/ᛶᛵᲇᛸ;

.field public ᛷᛴᛷᛱ:I

.field public final ᛷᛵᛵᲈ:I

.field public ᲇᛴᲇᛵ:I

.field public ᲇᛶᛴᲀ:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lxhss/ᲇᲀᲈᛲ;->ᛷᛵᛵᲈ:I

    .line 5
    .line 6
    if-lez p1, :cond_0

    .line 7
    .line 8
    new-instance p1, Lxhss/ᲇᛵᛲᲁ;

    .line 9
    .line 10
    const/16 v0, 0xd

    .line 11
    .line 12
    invoke-direct {p1, v0}, Lxhss/ᲇᛵᛲᲁ;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lxhss/ᲇᲀᲈᛲ;->ᛱᛱᛲᲇ:Lxhss/ᲇᛵᛲᲁ;

    .line 16
    .line 17
    new-instance p1, Lxhss/ᛶᛵᲇᛸ;

    .line 18
    .line 19
    const/4 v0, 0x7

    .line 20
    invoke-direct {p1, v0}, Lxhss/ᛶᛵᲇᛸ;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lxhss/ᲇᲀᲈᛲ;->ᛳᲁᲇᛸ:Lxhss/ᛶᛵᲇᛸ;

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const-string p0, "maxSize <= 0"

    .line 27
    .line 28
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    throw p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "LruCache[maxSize="

    .line 2
    .line 3
    iget-object v1, p0, Lxhss/ᲇᲀᲈᛲ;->ᛳᲁᲇᛸ:Lxhss/ᛶᛵᲇᛸ;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget v2, p0, Lxhss/ᲇᲀᲈᛲ;->ᛷᛴᛷᛱ:I

    .line 7
    .line 8
    iget v3, p0, Lxhss/ᲇᲀᲈᛲ;->ᲇᛶᛴᲀ:I

    .line 9
    .line 10
    add-int/2addr v3, v2

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    mul-int/lit8 v2, v2, 0x64

    .line 14
    .line 15
    div-int/2addr v2, v3

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    const/4 v2, 0x0

    .line 20
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget v0, p0, Lxhss/ᲇᲀᲈᛲ;->ᛷᛵᛵᲈ:I

    .line 26
    .line 27
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v0, ",hits="

    .line 31
    .line 32
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget v0, p0, Lxhss/ᲇᲀᲈᛲ;->ᛷᛴᛷᛱ:I

    .line 36
    .line 37
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v0, ",misses="

    .line 41
    .line 42
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget p0, p0, Lxhss/ᲇᲀᲈᛲ;->ᲇᛶᛴᲀ:I

    .line 46
    .line 47
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p0, ",hitRate="

    .line 51
    .line 52
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string p0, "%]"

    .line 59
    .line 60
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    monitor-exit v1

    .line 68
    return-object p0

    .line 69
    :goto_1
    monitor-exit v1

    .line 70
    throw p0
.end method

.method public final ᛱᛱᛲᲇ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lxhss/ᲇᲀᲈᛲ;->ᛳᲁᲇᛸ:Lxhss/ᛶᛵᲇᛸ;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lxhss/ᲇᲀᲈᛲ;->ᲇᛴᲇᛵ:I

    .line 5
    .line 6
    add-int/lit8 v1, v1, 0x1

    .line 7
    .line 8
    iput v1, p0, Lxhss/ᲇᲀᲈᛲ;->ᲇᛴᲇᛵ:I

    .line 9
    .line 10
    iget-object v1, p0, Lxhss/ᲇᲀᲈᛲ;->ᛱᛱᛲᲇ:Lxhss/ᲇᛵᛲᲁ;

    .line 11
    .line 12
    iget-object v1, v1, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-virtual {v1, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    iget p2, p0, Lxhss/ᲇᲀᲈᛲ;->ᲇᛴᲇᛵ:I

    .line 23
    .line 24
    add-int/lit8 p2, p2, -0x1

    .line 25
    .line 26
    iput p2, p0, Lxhss/ᲇᲀᲈᛲ;->ᲇᛴᲇᛵ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto/16 :goto_6

    .line 31
    .line 32
    :cond_0
    :goto_0
    monitor-exit v0

    .line 33
    iget p2, p0, Lxhss/ᲇᲀᲈᛲ;->ᛷᛵᛵᲈ:I

    .line 34
    .line 35
    :goto_1
    iget-object v0, p0, Lxhss/ᲇᲀᲈᛲ;->ᛳᲁᲇᛸ:Lxhss/ᛶᛵᲇᛸ;

    .line 36
    .line 37
    monitor-enter v0

    .line 38
    :try_start_1
    iget v1, p0, Lxhss/ᲇᲀᲈᛲ;->ᲇᛴᲇᛵ:I

    .line 39
    .line 40
    if-ltz v1, :cond_8

    .line 41
    .line 42
    iget-object v1, p0, Lxhss/ᲇᲀᲈᛲ;->ᛱᛱᛲᲇ:Lxhss/ᲇᛵᛲᲁ;

    .line 43
    .line 44
    iget-object v1, v1, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    iget v1, p0, Lxhss/ᲇᲀᲈᛲ;->ᲇᛴᲇᛵ:I

    .line 55
    .line 56
    if-nez v1, :cond_8

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :catchall_1
    move-exception p0

    .line 60
    goto :goto_5

    .line 61
    :cond_1
    :goto_2
    iget v1, p0, Lxhss/ᲇᲀᲈᛲ;->ᲇᛴᲇᛵ:I

    .line 62
    .line 63
    if-le v1, p2, :cond_7

    .line 64
    .line 65
    iget-object v1, p0, Lxhss/ᲇᲀᲈᛲ;->ᛱᛱᛲᲇ:Lxhss/ᲇᛵᛲᲁ;

    .line 66
    .line 67
    iget-object v1, v1, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_2

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_2
    iget-object v1, p0, Lxhss/ᲇᲀᲈᛲ;->ᛱᛱᛲᲇ:Lxhss/ᲇᛵᛲᲁ;

    .line 79
    .line 80
    iget-object v1, v1, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    instance-of v2, v1, Ljava/util/List;

    .line 89
    .line 90
    const/4 v3, 0x0

    .line 91
    if-eqz v2, :cond_4

    .line 92
    .line 93
    check-cast v1, Ljava/util/List;

    .line 94
    .line 95
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_3

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_3
    const/4 v2, 0x0

    .line 103
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    goto :goto_3

    .line 108
    :cond_4
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-nez v2, :cond_5

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    :goto_3
    check-cast v3, Ljava/util/Map$Entry;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 124
    .line 125
    if-nez v3, :cond_6

    .line 126
    .line 127
    monitor-exit v0

    .line 128
    return-object p1

    .line 129
    :cond_6
    :try_start_2
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    iget-object v2, p0, Lxhss/ᲇᲀᲈᛲ;->ᛱᛱᛲᲇ:Lxhss/ᲇᛵᛲᲁ;

    .line 137
    .line 138
    iget-object v2, v2, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 141
    .line 142
    invoke-virtual {v2, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    iget v1, p0, Lxhss/ᲇᲀᲈᛲ;->ᲇᛴᲇᛵ:I

    .line 146
    .line 147
    add-int/lit8 v1, v1, -0x1

    .line 148
    .line 149
    iput v1, p0, Lxhss/ᲇᲀᲈᛲ;->ᲇᛴᲇᛵ:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 150
    .line 151
    monitor-exit v0

    .line 152
    goto :goto_1

    .line 153
    :cond_7
    :goto_4
    monitor-exit v0

    .line 154
    return-object p1

    .line 155
    :cond_8
    :try_start_3
    const-string p0, "LruCache.sizeOf() is reporting inconsistent results!"

    .line 156
    .line 157
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 158
    .line 159
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 163
    :goto_5
    monitor-exit v0

    .line 164
    throw p0

    .line 165
    :goto_6
    monitor-exit v0

    .line 166
    throw p0
.end method

.method public final ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lxhss/ᲇᲀᲈᛲ;->ᛳᲁᲇᛸ:Lxhss/ᛶᛵᲇᛸ;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lxhss/ᲇᲀᲈᛲ;->ᛱᛱᛲᲇ:Lxhss/ᲇᛵᛲᲁ;

    .line 5
    .line 6
    iget-object v1, v1, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget v1, p0, Lxhss/ᲇᲀᲈᛲ;->ᛷᛴᛷᛱ:I

    .line 17
    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    iput v1, p0, Lxhss/ᲇᲀᲈᛲ;->ᛷᛴᛷᛱ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    monitor-exit v0

    .line 23
    return-object p1

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    :try_start_1
    iget p1, p0, Lxhss/ᲇᲀᲈᛲ;->ᲇᛶᛴᲀ:I

    .line 27
    .line 28
    add-int/lit8 p1, p1, 0x1

    .line 29
    .line 30
    iput p1, p0, Lxhss/ᲇᲀᲈᛲ;->ᲇᛶᛴᲀ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    .line 32
    monitor-exit v0

    .line 33
    const/4 p0, 0x0

    .line 34
    return-object p0

    .line 35
    :goto_0
    monitor-exit v0

    .line 36
    throw p0
.end method
