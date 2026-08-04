.class public Lyyds/ᛴᲈᛲᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᛴᛳᛲ:I

.field public ᲀᛲᛳᲀ:[I

.field public ᲇᲈᛵᛷ:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lyyds/ᛷᛸ;->ᛲᲈᲁ:[I

    .line 5
    .line 6
    iput-object p1, p0, Lyyds/ᛴᲈᛲᛷ;->ᲀᛲᛳᲀ:[I

    .line 7
    .line 8
    sget-object p1, Lyyds/ᛷᛸ;->ᛵᛸᛸᛷ:[Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p1, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lyyds/ᛷᛸ;->ᛲᲈᲁ:[I

    .line 6
    .line 7
    iput-object v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᲀᛲᛳᲀ:[I

    .line 8
    .line 9
    sget-object v0, Lyyds/ᛷᛸ;->ᛵᛸᛸᛷ:[Ljava/lang/Object;

    .line 10
    .line 11
    iput-object v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 15
    .line 16
    :cond_0
    if-gtz v0, :cond_1

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    new-instance p0, Ljava/util/ConcurrentModificationException;

    .line 20
    .line 21
    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 22
    .line 23
    .line 24
    throw p0
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-ltz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lyyds/ᛴᲈᛲᛷ;->ᛲᲈᲁ(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-ltz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    :try_start_0
    instance-of v2, p1, Lyyds/ᛴᲈᛲᛷ;

    .line 7
    .line 8
    if-eqz v2, :cond_6

    .line 9
    .line 10
    iget v2, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 11
    .line 12
    move-object v3, p1

    .line 13
    check-cast v3, Lyyds/ᛴᲈᛲᛷ;

    .line 14
    .line 15
    iget v3, v3, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 16
    .line 17
    if-eq v2, v3, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    check-cast p1, Lyyds/ᛴᲈᛲᛷ;

    .line 21
    .line 22
    move v3, v1

    .line 23
    :goto_0
    if-ge v3, v2, :cond_5

    .line 24
    .line 25
    invoke-virtual {p0, v3}, Lyyds/ᛴᲈᛲᛷ;->ᲇᲇᲇᛱ(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {p0, v3}, Lyyds/ᛴᲈᛲᛷ;->ᛷᲈᲈᲁ(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-virtual {p1, v4}, Lyyds/ᛴᲈᛲᛷ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    if-nez v5, :cond_3

    .line 38
    .line 39
    if-nez v6, :cond_2

    .line 40
    .line 41
    invoke-virtual {p1, v4}, Lyyds/ᛴᲈᛲᛷ;->containsKey(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-nez v4, :cond_4

    .line 46
    .line 47
    :cond_2
    return v1

    .line 48
    :cond_3
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-nez v4, :cond_4

    .line 53
    .line 54
    return v1

    .line 55
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_5
    return v0

    .line 59
    :cond_6
    instance-of v2, p1, Ljava/util/Map;

    .line 60
    .line 61
    if-eqz v2, :cond_c

    .line 62
    .line 63
    iget v2, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 64
    .line 65
    move-object v3, p1

    .line 66
    check-cast v3, Ljava/util/Map;

    .line 67
    .line 68
    invoke-interface {v3}, Ljava/util/Map;->size()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eq v2, v3, :cond_7

    .line 73
    .line 74
    return v1

    .line 75
    :cond_7
    iget v2, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 76
    .line 77
    move v3, v1

    .line 78
    :goto_1
    if-ge v3, v2, :cond_b

    .line 79
    .line 80
    invoke-virtual {p0, v3}, Lyyds/ᛴᲈᛲᛷ;->ᲇᲇᲇᛱ(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-virtual {p0, v3}, Lyyds/ᛴᲈᛲᛷ;->ᛷᲈᲈᲁ(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    move-object v6, p1

    .line 89
    check-cast v6, Ljava/util/Map;

    .line 90
    .line 91
    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    if-nez v5, :cond_9

    .line 96
    .line 97
    if-nez v6, :cond_8

    .line 98
    .line 99
    move-object v5, p1

    .line 100
    check-cast v5, Ljava/util/Map;

    .line 101
    .line 102
    invoke-interface {v5, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-nez v4, :cond_a

    .line 107
    .line 108
    :cond_8
    return v1

    .line 109
    :cond_9
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v4
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    if-nez v4, :cond_a

    .line 114
    .line 115
    return v1

    .line 116
    :cond_a
    add-int/lit8 v3, v3, 0x1

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_b
    return v0

    .line 120
    :catch_0
    :cond_c
    return v1
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 8
    .line 9
    shl-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    add-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    aget-object p0, p0, p1

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0
.end method

.method public final getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 8
    .line 9
    shl-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    add-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    aget-object p0, p0, p1

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    return-object p2
.end method

.method public hashCode()I
    .locals 8

    .line 1
    iget-object v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᲀᛲᛳᲀ:[I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 4
    .line 5
    iget p0, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    move v4, v2

    .line 10
    move v5, v4

    .line 11
    :goto_0
    if-ge v4, p0, :cond_1

    .line 12
    .line 13
    aget-object v6, v1, v3

    .line 14
    .line 15
    aget v7, v0, v4

    .line 16
    .line 17
    if-eqz v6, :cond_0

    .line 18
    .line 19
    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    move v6, v2

    .line 25
    :goto_1
    xor-int/2addr v6, v7

    .line 26
    add-int/2addr v5, v6

    .line 27
    add-int/lit8 v4, v4, 0x1

    .line 28
    .line 29
    add-int/lit8 v3, v3, 0x2

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    return v5
.end method

.method public final isEmpty()Z
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    if-gtz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, v1, p1}, Lyyds/ᛴᲈᛲᛷ;->ᲀᛲᛳᲀ(ILjava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    invoke-virtual {p0}, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    :goto_1
    if-ltz v2, :cond_2

    .line 23
    .line 24
    shl-int/lit8 p1, v2, 0x1

    .line 25
    .line 26
    add-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    iget-object p0, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 29
    .line 30
    aget-object v0, p0, p1

    .line 31
    .line 32
    aput-object p2, p0, p1

    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_2
    not-int v2, v2

    .line 36
    iget-object v3, p0, Lyyds/ᛴᲈᛲᛷ;->ᲀᛲᛳᲀ:[I

    .line 37
    .line 38
    array-length v4, v3

    .line 39
    if-lt v0, v4, :cond_6

    .line 40
    .line 41
    const/16 v4, 0x8

    .line 42
    .line 43
    if-lt v0, v4, :cond_3

    .line 44
    .line 45
    shr-int/lit8 v4, v0, 0x1

    .line 46
    .line 47
    add-int/2addr v4, v0

    .line 48
    goto :goto_2

    .line 49
    :cond_3
    const/4 v5, 0x4

    .line 50
    if-lt v0, v5, :cond_4

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_4
    move v4, v5

    .line 54
    :goto_2
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([II)[I

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    iput-object v3, p0, Lyyds/ᛴᲈᛲᛷ;->ᲀᛲᛳᲀ:[I

    .line 59
    .line 60
    iget-object v3, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 61
    .line 62
    shl-int/lit8 v4, v4, 0x1

    .line 63
    .line 64
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    iput-object v3, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 69
    .line 70
    iget v3, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 71
    .line 72
    if-ne v0, v3, :cond_5

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_5
    new-instance p0, Ljava/util/ConcurrentModificationException;

    .line 76
    .line 77
    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 78
    .line 79
    .line 80
    throw p0

    .line 81
    :cond_6
    :goto_3
    if-ge v2, v0, :cond_7

    .line 82
    .line 83
    iget-object v3, p0, Lyyds/ᛴᲈᛲᛷ;->ᲀᛲᛳᲀ:[I

    .line 84
    .line 85
    add-int/lit8 v4, v2, 0x1

    .line 86
    .line 87
    invoke-static {v4, v2, v0, v3, v3}, Lyyds/ᲀᲀᛷᛸ;->ᛳᛸᛴᛶ(III[I[I)V

    .line 88
    .line 89
    .line 90
    iget-object v3, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 91
    .line 92
    shl-int/lit8 v4, v4, 0x1

    .line 93
    .line 94
    shl-int/lit8 v5, v2, 0x1

    .line 95
    .line 96
    iget v6, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 97
    .line 98
    shl-int/lit8 v6, v6, 0x1

    .line 99
    .line 100
    invoke-static {v4, v5, v6, v3, v3}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :cond_7
    iget v3, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 104
    .line 105
    if-ne v0, v3, :cond_8

    .line 106
    .line 107
    iget-object v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᲀᛲᛳᲀ:[I

    .line 108
    .line 109
    array-length v4, v0

    .line 110
    if-ge v2, v4, :cond_8

    .line 111
    .line 112
    aput v1, v0, v2

    .line 113
    .line 114
    iget-object v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 115
    .line 116
    shl-int/lit8 v1, v2, 0x1

    .line 117
    .line 118
    aput-object p1, v0, v1

    .line 119
    .line 120
    add-int/lit8 v1, v1, 0x1

    .line 121
    .line 122
    aput-object p2, v0, v1

    .line 123
    .line 124
    add-int/lit8 v3, v3, 0x1

    .line 125
    .line 126
    iput v3, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 127
    .line 128
    const/4 p0, 0x0

    .line 129
    return-object p0

    .line 130
    :cond_8
    new-instance p0, Ljava/util/ConcurrentModificationException;

    .line 131
    .line 132
    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 133
    .line 134
    .line 135
    throw p0
.end method

.method public final putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lyyds/ᛴᲈᛲᛷ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lyyds/ᛴᲈᛲᛷ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 24
    invoke-virtual {p0, p1}, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    .line 25
    invoke-virtual {p0, p1}, Lyyds/ᛴᲈᛲᛷ;->ᛱᲈᲁ(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public final remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lyyds/ᛴᲈᛲᛷ;->ᛷᲈᲈᲁ(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p2, v0}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lyyds/ᛴᲈᛲᛷ;->ᛱᲈᲁ(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public final replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 24
    invoke-virtual {p0, p1}, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    .line 25
    invoke-virtual {p0, p1, p2}, Lyyds/ᛴᲈᛲᛷ;->ᛲᛳᛶᲁ(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public final replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lyyds/ᛴᲈᛲᛷ;->ᛷᲈᲈᲁ(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p2, v0}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, p1, p3}, Lyyds/ᛴᲈᛲᛷ;->ᛲᛳᛶᲁ(ILjava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lyyds/ᛴᲈᛲᛷ;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p0, "{}"

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    iget v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 11
    .line 12
    mul-int/lit8 v0, v0, 0x1c

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 17
    .line 18
    .line 19
    const/16 v0, 0x7b

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    :goto_0
    if-ge v2, v0, :cond_4

    .line 28
    .line 29
    if-lez v2, :cond_1

    .line 30
    .line 31
    const-string v3, ", "

    .line 32
    .line 33
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {p0, v2}, Lyyds/ᛴᲈᛲᛷ;->ᲇᲇᲇᛱ(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    const-string v4, "(this Map)"

    .line 41
    .line 42
    if-eq v3, v1, :cond_2

    .line 43
    .line 44
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    :goto_1
    const/16 v3, 0x3d

    .line 52
    .line 53
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v2}, Lyyds/ᛴᲈᛲᛷ;->ᛷᲈᲈᲁ(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    if-eq v3, v1, :cond_3

    .line 61
    .line 62
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_4
    const/16 p0, 0x7d

    .line 73
    .line 74
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0
.end method

.method public ᛱᲈᲁ(I)Ljava/lang/Object;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p1, :cond_8

    .line 3
    .line 4
    iget v1, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 5
    .line 6
    if-ge p1, v1, :cond_8

    .line 7
    .line 8
    iget-object v2, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 9
    .line 10
    shl-int/lit8 v3, p1, 0x1

    .line 11
    .line 12
    add-int/lit8 v4, v3, 0x1

    .line 13
    .line 14
    aget-object v4, v2, v4

    .line 15
    .line 16
    const/4 v5, 0x1

    .line 17
    if-gt v1, v5, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lyyds/ᛴᲈᛲᛷ;->clear()V

    .line 20
    .line 21
    .line 22
    return-object v4

    .line 23
    :cond_0
    add-int/lit8 v6, v1, -0x1

    .line 24
    .line 25
    iget-object v7, p0, Lyyds/ᛴᲈᛲᛷ;->ᲀᛲᛳᲀ:[I

    .line 26
    .line 27
    array-length v8, v7

    .line 28
    const/16 v9, 0x8

    .line 29
    .line 30
    if-le v8, v9, :cond_4

    .line 31
    .line 32
    array-length v8, v7

    .line 33
    div-int/lit8 v8, v8, 0x3

    .line 34
    .line 35
    if-ge v1, v8, :cond_4

    .line 36
    .line 37
    if-le v1, v9, :cond_1

    .line 38
    .line 39
    shr-int/lit8 v0, v1, 0x1

    .line 40
    .line 41
    add-int v9, v1, v0

    .line 42
    .line 43
    :cond_1
    invoke-static {v7, v9}, Ljava/util/Arrays;->copyOf([II)[I

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᲀᛲᛳᲀ:[I

    .line 48
    .line 49
    iget-object v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 50
    .line 51
    shl-int/lit8 v8, v9, 0x1

    .line 52
    .line 53
    invoke-static {v0, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 58
    .line 59
    iget v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 60
    .line 61
    if-ne v1, v0, :cond_3

    .line 62
    .line 63
    if-lez p1, :cond_2

    .line 64
    .line 65
    iget-object v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᲀᛲᛳᲀ:[I

    .line 66
    .line 67
    const/4 v8, 0x0

    .line 68
    invoke-static {v8, v8, p1, v7, v0}, Lyyds/ᲀᲀᛷᛸ;->ᛳᛸᛴᛶ(III[I[I)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 72
    .line 73
    invoke-static {v8, v8, v3, v2, v0}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    if-ge p1, v6, :cond_6

    .line 77
    .line 78
    iget-object v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᲀᛲᛳᲀ:[I

    .line 79
    .line 80
    add-int/lit8 v8, p1, 0x1

    .line 81
    .line 82
    invoke-static {p1, v8, v1, v7, v0}, Lyyds/ᲀᲀᛷᛸ;->ᛳᛸᛴᛶ(III[I[I)V

    .line 83
    .line 84
    .line 85
    iget-object p1, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 86
    .line 87
    shl-int/lit8 v0, v8, 0x1

    .line 88
    .line 89
    shl-int/lit8 v5, v1, 0x1

    .line 90
    .line 91
    invoke-static {v3, v0, v5, v2, p1}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    new-instance p0, Ljava/util/ConcurrentModificationException;

    .line 96
    .line 97
    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 98
    .line 99
    .line 100
    throw p0

    .line 101
    :cond_4
    if-ge p1, v6, :cond_5

    .line 102
    .line 103
    add-int/lit8 v2, p1, 0x1

    .line 104
    .line 105
    invoke-static {p1, v2, v1, v7, v7}, Lyyds/ᲀᲀᛷᛸ;->ᛳᛸᛴᛶ(III[I[I)V

    .line 106
    .line 107
    .line 108
    iget-object p1, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 109
    .line 110
    shl-int/2addr v2, v5

    .line 111
    shl-int/lit8 v7, v1, 0x1

    .line 112
    .line 113
    invoke-static {v3, v2, v7, p1, p1}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :cond_5
    iget-object p1, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 117
    .line 118
    shl-int/lit8 v2, v6, 0x1

    .line 119
    .line 120
    aput-object v0, p1, v2

    .line 121
    .line 122
    add-int/2addr v2, v5

    .line 123
    aput-object v0, p1, v2

    .line 124
    .line 125
    :cond_6
    :goto_0
    iget p1, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 126
    .line 127
    if-ne v1, p1, :cond_7

    .line 128
    .line 129
    iput v6, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 130
    .line 131
    return-object v4

    .line 132
    :cond_7
    new-instance p0, Ljava/util/ConcurrentModificationException;

    .line 133
    .line 134
    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 135
    .line 136
    .line 137
    throw p0

    .line 138
    :cond_8
    new-instance p0, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    const-string v1, "Expected index to be within 0..size()-1, but was "

    .line 141
    .line 142
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-static {p0}, Lyyds/ᛷᛸ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw v0
.end method

.method public ᛲᛳᛶᲁ(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    shl-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    add-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    iget-object p0, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 12
    .line 13
    aget-object v0, p0, p1

    .line 14
    .line 15
    aput-object p2, p0, p1

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string p2, "Expected index to be within 0..size()-1, but was "

    .line 21
    .line 22
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Lyyds/ᛷᛸ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    throw p0
.end method

.method public final ᛲᛴᛳᛲ()I
    .locals 5

    .line 1
    iget v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, -0x1

    .line 6
    return p0

    .line 7
    :cond_0
    iget-object v1, p0, Lyyds/ᛴᲈᛲᛷ;->ᲀᛲᛳᲀ:[I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-static {v0, v2, v1}, Lyyds/ᛷᛸ;->ᛵᛸᛸᛷ(II[I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-gez v1, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-object v2, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 18
    .line 19
    shl-int/lit8 v3, v1, 0x1

    .line 20
    .line 21
    aget-object v2, v2, v3

    .line 22
    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    :goto_0
    return v1

    .line 26
    :cond_2
    add-int/lit8 v2, v1, 0x1

    .line 27
    .line 28
    :goto_1
    if-ge v2, v0, :cond_4

    .line 29
    .line 30
    iget-object v3, p0, Lyyds/ᛴᲈᛲᛷ;->ᲀᛲᛳᲀ:[I

    .line 31
    .line 32
    aget v3, v3, v2

    .line 33
    .line 34
    if-nez v3, :cond_4

    .line 35
    .line 36
    iget-object v3, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 37
    .line 38
    shl-int/lit8 v4, v2, 0x1

    .line 39
    .line 40
    aget-object v3, v3, v4

    .line 41
    .line 42
    if-nez v3, :cond_3

    .line 43
    .line 44
    return v2

    .line 45
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_4
    add-int/lit8 v1, v1, -0x1

    .line 49
    .line 50
    :goto_2
    if-ltz v1, :cond_6

    .line 51
    .line 52
    iget-object v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᲀᛲᛳᲀ:[I

    .line 53
    .line 54
    aget v0, v0, v1

    .line 55
    .line 56
    if-nez v0, :cond_6

    .line 57
    .line 58
    iget-object v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 59
    .line 60
    shl-int/lit8 v3, v1, 0x1

    .line 61
    .line 62
    aget-object v0, v0, v3

    .line 63
    .line 64
    if-nez v0, :cond_5

    .line 65
    .line 66
    return v1

    .line 67
    :cond_5
    add-int/lit8 v1, v1, -0x1

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_6
    not-int p0, v2

    .line 71
    return p0
.end method

.method public final ᛲᲈᲁ(Ljava/lang/Object;)I
    .locals 4

    .line 1
    iget v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    move p1, v1

    .line 11
    :goto_0
    if-ge p1, v0, :cond_3

    .line 12
    .line 13
    aget-object v2, p0, p1

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    shr-int/lit8 p0, p1, 0x1

    .line 18
    .line 19
    return p0

    .line 20
    :cond_0
    add-int/lit8 p1, p1, 0x2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move v2, v1

    .line 24
    :goto_1
    if-ge v2, v0, :cond_3

    .line 25
    .line 26
    aget-object v3, p0, v2

    .line 27
    .line 28
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_2

    .line 33
    .line 34
    shr-int/lit8 p0, v2, 0x1

    .line 35
    .line 36
    return p0

    .line 37
    :cond_2
    add-int/lit8 v2, v2, 0x2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_3
    const/4 p0, -0x1

    .line 41
    return p0
.end method

.method public final ᛵᛸᛸᛷ(I)V
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛴᲈᛲᛷ;->ᲀᛲᛳᲀ:[I

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    if-ge v2, p1, :cond_0

    .line 7
    .line 8
    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([II)[I

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iput-object v1, p0, Lyyds/ᛴᲈᛲᛷ;->ᲀᛲᛳᲀ:[I

    .line 13
    .line 14
    iget-object v1, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 15
    .line 16
    mul-int/lit8 p1, p1, 0x2

    .line 17
    .line 18
    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 23
    .line 24
    :cond_0
    iget p0, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 25
    .line 26
    if-ne p0, v0, :cond_1

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    new-instance p0, Ljava/util/ConcurrentModificationException;

    .line 30
    .line 31
    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 32
    .line 33
    .line 34
    throw p0
.end method

.method public ᛶᛷᛲᲁ(Lyyds/ᛷᛲᲇᲀ;)V
    .locals 4

    .line 1
    iget v0, p1, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    iget v1, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 4
    .line 5
    add-int/2addr v1, v0

    .line 6
    invoke-virtual {p0, v1}, Lyyds/ᛴᲈᛲᛷ;->ᛵᛸᛸᛷ(I)V

    .line 7
    .line 8
    .line 9
    iget v1, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    if-lez v0, :cond_1

    .line 15
    .line 16
    iget-object v1, p1, Lyyds/ᛴᲈᛲᛷ;->ᲀᛲᛳᲀ:[I

    .line 17
    .line 18
    iget-object v3, p0, Lyyds/ᛴᲈᛲᛷ;->ᲀᛲᛳᲀ:[I

    .line 19
    .line 20
    invoke-static {v2, v2, v0, v1, v3}, Lyyds/ᲀᲀᛷᛸ;->ᛳᛸᛴᛶ(III[I[I)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p1, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v1, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 26
    .line 27
    shl-int/lit8 v3, v0, 0x1

    .line 28
    .line 29
    invoke-static {v2, v2, v3, p1, v1}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    :goto_0
    if-ge v2, v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1, v2}, Lyyds/ᛴᲈᛲᛷ;->ᲇᲇᲇᛱ(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {p1, v2}, Lyyds/ᛴᲈᛲᛷ;->ᛷᲈᲈᲁ(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {p0, v1, v3}, Lyyds/ᛴᲈᛲᛷ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    return-void
.end method

.method public final ᛷᲈᲈᲁ(I)Ljava/lang/Object;
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 8
    .line 9
    shl-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    add-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    aget-object p0, p0, p1

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v0, "Expected index to be within 0..size()-1, but was "

    .line 19
    .line 20
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Lyyds/ᛷᛸ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    throw p0
.end method

.method public final ᲀᛲᛳᲀ(ILjava/lang/Object;)I
    .locals 5

    .line 1
    iget v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, -0x1

    .line 6
    return p0

    .line 7
    :cond_0
    iget-object v1, p0, Lyyds/ᛴᲈᛲᛷ;->ᲀᛲᛳᲀ:[I

    .line 8
    .line 9
    invoke-static {v0, p1, v1}, Lyyds/ᛷᛸ;->ᛵᛸᛸᛷ(II[I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-gez v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    iget-object v2, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 17
    .line 18
    shl-int/lit8 v3, v1, 0x1

    .line 19
    .line 20
    aget-object v2, v2, v3

    .line 21
    .line 22
    invoke-static {p2, v2}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    :goto_0
    return v1

    .line 29
    :cond_2
    add-int/lit8 v2, v1, 0x1

    .line 30
    .line 31
    :goto_1
    if-ge v2, v0, :cond_4

    .line 32
    .line 33
    iget-object v3, p0, Lyyds/ᛴᲈᛲᛷ;->ᲀᛲᛳᲀ:[I

    .line 34
    .line 35
    aget v3, v3, v2

    .line 36
    .line 37
    if-ne v3, p1, :cond_4

    .line 38
    .line 39
    iget-object v3, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 40
    .line 41
    shl-int/lit8 v4, v2, 0x1

    .line 42
    .line 43
    aget-object v3, v3, v4

    .line 44
    .line 45
    invoke-static {p2, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_3

    .line 50
    .line 51
    return v2

    .line 52
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_4
    add-int/lit8 v1, v1, -0x1

    .line 56
    .line 57
    :goto_2
    if-ltz v1, :cond_6

    .line 58
    .line 59
    iget-object v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᲀᛲᛳᲀ:[I

    .line 60
    .line 61
    aget v0, v0, v1

    .line 62
    .line 63
    if-ne v0, p1, :cond_6

    .line 64
    .line 65
    iget-object v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 66
    .line 67
    shl-int/lit8 v3, v1, 0x1

    .line 68
    .line 69
    aget-object v0, v0, v3

    .line 70
    .line 71
    invoke-static {p2, v0}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_5

    .line 76
    .line 77
    return v1

    .line 78
    :cond_5
    add-int/lit8 v1, v1, -0x1

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_6
    not-int p0, v2

    .line 82
    return p0
.end method

.method public final ᲇᲇᲇᛱ(I)Ljava/lang/Object;
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget v0, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᛴᲈᛲᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 8
    .line 9
    shl-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    aget-object p0, p0, p1

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v0, "Expected index to be within 0..size()-1, but was "

    .line 17
    .line 18
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Lyyds/ᛷᛸ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    throw p0
.end method

.method public final ᲇᲈᛵᛷ(Ljava/lang/Object;)I
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0

    .line 8
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0, v0, p1}, Lyyds/ᛴᲈᛲᛷ;->ᲀᛲᛳᲀ(ILjava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method
