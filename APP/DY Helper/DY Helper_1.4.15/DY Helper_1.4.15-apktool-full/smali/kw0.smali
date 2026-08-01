.class public Lkw0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:I

.field public final β:Ln;

.field public final γ:Lrk0;

.field public δ:I

.field public ε:I

.field public ζ:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lkw0;->α:I

    .line 5
    .line 6
    if-lez p1, :cond_0

    .line 7
    .line 8
    new-instance p1, Ln;

    .line 9
    .line 10
    const/16 v0, 0x1c

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ln;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lkw0;->β:Ln;

    .line 16
    .line 17
    new-instance p1, Lrk0;

    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    invoke-direct {p1, v0}, Lrk0;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lkw0;->γ:Lrk0;

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const-string p0, "maxSize <= 0"

    .line 27
    .line 28
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

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
    iget-object v1, p0, Lkw0;->γ:Lrk0;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget v2, p0, Lkw0;->ε:I

    .line 7
    .line 8
    iget v3, p0, Lkw0;->ζ:I

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
    iget v0, p0, Lkw0;->α:I

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
    iget v0, p0, Lkw0;->ε:I

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
    iget p0, p0, Lkw0;->ζ:I

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

.method public final α(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lkw0;->γ:Lrk0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lkw0;->β:Ln;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v1, v1, Ln;->ζ:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lkw0;->ε:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    iput v1, p0, Lkw0;->ε:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    monitor-exit v0

    .line 26
    return-object p1

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    :try_start_1
    iget p1, p0, Lkw0;->ζ:I

    .line 30
    .line 31
    add-int/lit8 p1, p1, 0x1

    .line 32
    .line 33
    iput p1, p0, Lkw0;->ζ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    .line 35
    monitor-exit v0

    .line 36
    const/4 p0, 0x0

    .line 37
    return-object p0

    .line 38
    :goto_0
    monitor-exit v0

    .line 39
    throw p0
.end method

.method public final β(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkw0;->γ:Lrk0;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget v1, p0, Lkw0;->δ:I

    .line 8
    .line 9
    add-int/lit8 v1, v1, 0x1

    .line 10
    .line 11
    iput v1, p0, Lkw0;->δ:I

    .line 12
    .line 13
    iget-object v1, p0, Lkw0;->β:Ln;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v1, v1, Ln;->ζ:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-virtual {v1, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    iget p2, p0, Lkw0;->δ:I

    .line 29
    .line 30
    add-int/lit8 p2, p2, -0x1

    .line 31
    .line 32
    iput p2, p0, Lkw0;->δ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto/16 :goto_5

    .line 37
    .line 38
    :cond_0
    :goto_0
    monitor-exit v0

    .line 39
    iget p2, p0, Lkw0;->α:I

    .line 40
    .line 41
    :goto_1
    iget-object v0, p0, Lkw0;->γ:Lrk0;

    .line 42
    .line 43
    monitor-enter v0

    .line 44
    :try_start_1
    iget v1, p0, Lkw0;->δ:I

    .line 45
    .line 46
    if-ltz v1, :cond_5

    .line 47
    .line 48
    iget-object v1, p0, Lkw0;->β:Ln;

    .line 49
    .line 50
    iget-object v1, v1, Ln;->ζ:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    iget v1, p0, Lkw0;->δ:I

    .line 61
    .line 62
    if-nez v1, :cond_5

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :catchall_1
    move-exception p0

    .line 66
    goto :goto_4

    .line 67
    :cond_1
    :goto_2
    iget v1, p0, Lkw0;->δ:I

    .line 68
    .line 69
    if-le v1, p2, :cond_4

    .line 70
    .line 71
    iget-object v1, p0, Lkw0;->β:Ln;

    .line 72
    .line 73
    iget-object v1, v1, Ln;->ζ:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_2

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_2
    iget-object v1, p0, Lkw0;->β:Ln;

    .line 85
    .line 86
    iget-object v1, v1, Ln;->ζ:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    check-cast v1, Ljava/lang/Iterable;

    .line 98
    .line 99
    invoke-static {v1}, Lxh;->И(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, Ljava/util/Map$Entry;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 104
    .line 105
    if-nez v1, :cond_3

    .line 106
    .line 107
    monitor-exit v0

    .line 108
    return-object p1

    .line 109
    :cond_3
    :try_start_2
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    iget-object v3, p0, Lkw0;->β:Ln;

    .line 118
    .line 119
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    iget-object v3, v3, Ln;->ζ:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 128
    .line 129
    invoke-virtual {v3, v2}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    iget v2, p0, Lkw0;->δ:I

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    add-int/lit8 v2, v2, -0x1

    .line 138
    .line 139
    iput v2, p0, Lkw0;->δ:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 140
    .line 141
    monitor-exit v0

    .line 142
    goto :goto_1

    .line 143
    :cond_4
    :goto_3
    monitor-exit v0

    .line 144
    return-object p1

    .line 145
    :cond_5
    :try_start_3
    const-string p0, "LruCache.sizeOf() is reporting inconsistent results!"

    .line 146
    .line 147
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 148
    .line 149
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 153
    :goto_4
    monitor-exit v0

    .line 154
    throw p0

    .line 155
    :goto_5
    monitor-exit v0

    .line 156
    throw p0
.end method

.method public final γ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lkw0;->γ:Lrk0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lkw0;->β:Ln;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v1, v1, Ln;->ζ:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lkw0;->δ:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, -0x1

    .line 22
    .line 23
    iput v1, p0, Lkw0;->δ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    :goto_0
    monitor-exit v0

    .line 29
    return-object p1

    .line 30
    :goto_1
    monitor-exit v0

    .line 31
    throw p0
.end method
