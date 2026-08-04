.class public final Lyyds/ᲀᛳᛸᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/util/Collection;
.implements Ljava/util/Set;
.implements Lyyds/ᛷᲁᲇᛳ;
.implements Lyyds/ᛸᛴᛳᲈ;


# instance fields
.field public ᛲᛴᛳᛲ:I

.field public ᲀᛲᛳᲀ:[I

.field public ᲇᲈᛵᛷ:[Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lyyds/ᛷᛸ;->ᛲᲈᲁ:[I

    .line 5
    .line 6
    iput-object v0, p0, Lyyds/ᲀᛳᛸᛴ;->ᲀᛲᛳᲀ:[I

    .line 7
    .line 8
    sget-object v0, Lyyds/ᛷᛸ;->ᛵᛸᛸᛷ:[Ljava/lang/Object;

    .line 9
    .line 10
    iput-object v0, p0, Lyyds/ᲀᛳᛸᛴ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 9

    .line 1
    iget v0, p0, Lyyds/ᲀᛳᛸᛴ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {p0, v2, v1}, Lyyds/ᛳᛴᲁᲇ;->ᛶᛷᛲᲁ(Lyyds/ᲀᛳᛸᛴ;Ljava/lang/Object;I)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    move v3, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-static {p0, p1, v2}, Lyyds/ᛳᛴᲁᲇ;->ᛶᛷᛲᲁ(Lyyds/ᲀᛳᛸᛴ;Ljava/lang/Object;I)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    move v8, v3

    .line 22
    move v3, v2

    .line 23
    move v2, v8

    .line 24
    :goto_0
    if-ltz v2, :cond_1

    .line 25
    .line 26
    return v1

    .line 27
    :cond_1
    not-int v2, v2

    .line 28
    iget-object v4, p0, Lyyds/ᲀᛳᛸᛴ;->ᲀᛲᛳᲀ:[I

    .line 29
    .line 30
    array-length v5, v4

    .line 31
    if-lt v0, v5, :cond_6

    .line 32
    .line 33
    const/16 v5, 0x8

    .line 34
    .line 35
    if-lt v0, v5, :cond_2

    .line 36
    .line 37
    shr-int/lit8 v5, v0, 0x1

    .line 38
    .line 39
    add-int/2addr v5, v0

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    const/4 v6, 0x4

    .line 42
    if-lt v0, v6, :cond_3

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    move v5, v6

    .line 46
    :goto_1
    iget-object v6, p0, Lyyds/ᲀᛳᛸᛴ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 47
    .line 48
    new-array v7, v5, [I

    .line 49
    .line 50
    iput-object v7, p0, Lyyds/ᲀᛳᛸᛴ;->ᲀᛲᛳᲀ:[I

    .line 51
    .line 52
    new-array v5, v5, [Ljava/lang/Object;

    .line 53
    .line 54
    iput-object v5, p0, Lyyds/ᲀᛳᛸᛴ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 55
    .line 56
    iget v5, p0, Lyyds/ᲀᛳᛸᛴ;->ᛲᛴᛳᛲ:I

    .line 57
    .line 58
    if-ne v0, v5, :cond_5

    .line 59
    .line 60
    array-length v5, v7

    .line 61
    if-nez v5, :cond_4

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_4
    array-length v5, v4

    .line 65
    invoke-static {v4, v1, v7, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 66
    .line 67
    .line 68
    iget-object v4, p0, Lyyds/ᲀᛳᛸᛴ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 69
    .line 70
    array-length v5, v6

    .line 71
    const/4 v7, 0x6

    .line 72
    invoke-static {v1, v5, v7, v6, v4}, Lyyds/ᲀᲀᛷᛸ;->ᛵᲀᲈᛴ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_5
    new-instance p0, Ljava/util/ConcurrentModificationException;

    .line 77
    .line 78
    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 79
    .line 80
    .line 81
    throw p0

    .line 82
    :cond_6
    :goto_2
    if-ge v2, v0, :cond_7

    .line 83
    .line 84
    iget-object v1, p0, Lyyds/ᲀᛳᛸᛴ;->ᲀᛲᛳᲀ:[I

    .line 85
    .line 86
    add-int/lit8 v4, v2, 0x1

    .line 87
    .line 88
    invoke-static {v4, v2, v0, v1, v1}, Lyyds/ᲀᲀᛷᛸ;->ᛳᛸᛴᛶ(III[I[I)V

    .line 89
    .line 90
    .line 91
    iget-object v1, p0, Lyyds/ᲀᛳᛸᛴ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 92
    .line 93
    invoke-static {v4, v2, v0, v1, v1}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_7
    iget v1, p0, Lyyds/ᲀᛳᛸᛴ;->ᛲᛴᛳᛲ:I

    .line 97
    .line 98
    if-ne v0, v1, :cond_8

    .line 99
    .line 100
    iget-object v0, p0, Lyyds/ᲀᛳᛸᛴ;->ᲀᛲᛳᲀ:[I

    .line 101
    .line 102
    array-length v4, v0

    .line 103
    if-ge v2, v4, :cond_8

    .line 104
    .line 105
    aput v3, v0, v2

    .line 106
    .line 107
    iget-object v0, p0, Lyyds/ᲀᛳᛸᛴ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 108
    .line 109
    aput-object p1, v0, v2

    .line 110
    .line 111
    const/4 p1, 0x1

    .line 112
    add-int/2addr v1, p1

    .line 113
    iput v1, p0, Lyyds/ᲀᛳᛸᛴ;->ᛲᛴᛳᛲ:I

    .line 114
    .line 115
    return p1

    .line 116
    :cond_8
    new-instance p0, Ljava/util/ConcurrentModificationException;

    .line 117
    .line 118
    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 119
    .line 120
    .line 121
    throw p0
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 6

    .line 1
    iget v0, p0, Lyyds/ᲀᛳᛸᛴ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/2addr v1, v0

    .line 8
    iget v0, p0, Lyyds/ᲀᛳᛸᛴ;->ᛲᛴᛳᛲ:I

    .line 9
    .line 10
    iget-object v2, p0, Lyyds/ᲀᛳᛸᛴ;->ᲀᛲᛳᲀ:[I

    .line 11
    .line 12
    array-length v3, v2

    .line 13
    const/4 v4, 0x0

    .line 14
    if-ge v3, v1, :cond_0

    .line 15
    .line 16
    iget-object v3, p0, Lyyds/ᲀᛳᛸᛴ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 17
    .line 18
    new-array v5, v1, [I

    .line 19
    .line 20
    iput-object v5, p0, Lyyds/ᲀᛳᛸᛴ;->ᲀᛲᛳᲀ:[I

    .line 21
    .line 22
    new-array v1, v1, [Ljava/lang/Object;

    .line 23
    .line 24
    iput-object v1, p0, Lyyds/ᲀᛳᛸᛴ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 25
    .line 26
    if-lez v0, :cond_0

    .line 27
    .line 28
    invoke-static {v2, v4, v5, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lyyds/ᲀᛳᛸᛴ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 32
    .line 33
    iget v2, p0, Lyyds/ᲀᛳᛸᛴ;->ᛲᛴᛳᛲ:I

    .line 34
    .line 35
    const/4 v5, 0x6

    .line 36
    invoke-static {v4, v2, v5, v3, v1}, Lyyds/ᲀᲀᛷᛸ;->ᛵᲀᲈᛴ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    iget v1, p0, Lyyds/ᲀᛳᛸᛴ;->ᛲᛴᛳᛲ:I

    .line 40
    .line 41
    if-ne v1, v0, :cond_2

    .line 42
    .line 43
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p0, v0}, Lyyds/ᲀᛳᛸᛴ;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    or-int/2addr v4, v0

    .line 62
    goto :goto_0

    .line 63
    :cond_1
    return v4

    .line 64
    :cond_2
    new-instance p0, Ljava/util/ConcurrentModificationException;

    .line 65
    .line 66
    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 67
    .line 68
    .line 69
    throw p0
.end method

.method public final clear()V
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᲀᛳᛸᛴ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lyyds/ᛷᛸ;->ᛲᲈᲁ:[I

    .line 6
    .line 7
    iput-object v0, p0, Lyyds/ᲀᛳᛸᛴ;->ᲀᛲᛳᲀ:[I

    .line 8
    .line 9
    sget-object v0, Lyyds/ᛷᛸ;->ᛵᛸᛸᛷ:[Ljava/lang/Object;

    .line 10
    .line 11
    iput-object v0, p0, Lyyds/ᲀᛳᛸᛴ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput v0, p0, Lyyds/ᲀᛳᛸᛴ;->ᛲᛴᛳᛲ:I

    .line 15
    .line 16
    :cond_0
    if-nez v0, :cond_1

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

.method public final contains(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    invoke-static {p0, p1, v0}, Lyyds/ᛳᛴᲁᲇ;->ᛶᛷᛲᲁ(Lyyds/ᲀᛳᛸᛴ;Ljava/lang/Object;I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {p0, p1, v1}, Lyyds/ᛳᛴᲁᲇ;->ᛶᛷᛲᲁ(Lyyds/ᲀᛳᛸᛴ;Ljava/lang/Object;I)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    :goto_0
    if-ltz p0, :cond_1

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_1
    return v0
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0, v0}, Lyyds/ᲀᛳᛸᛴ;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :cond_1
    const/4 p0, 0x1

    .line 24
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Ljava/util/Set;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    iget v0, p0, Lyyds/ᲀᛳᛸᛴ;->ᛲᛴᛳᛲ:I

    .line 10
    .line 11
    move-object v2, p1

    .line 12
    check-cast v2, Ljava/util/Set;

    .line 13
    .line 14
    invoke-interface {v2}, Ljava/util/Set;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eq v0, v2, :cond_1

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_1
    :try_start_0
    iget v0, p0, Lyyds/ᲀᛳᛸᛴ;->ᛲᛴᛳᛲ:I

    .line 22
    .line 23
    move v2, v1

    .line 24
    :goto_0
    if-ge v2, v0, :cond_3

    .line 25
    .line 26
    iget-object v3, p0, Lyyds/ᲀᛳᛸᛴ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 27
    .line 28
    aget-object v3, v3, v2

    .line 29
    .line 30
    move-object v4, p1

    .line 31
    check-cast v4, Ljava/util/Set;

    .line 32
    .line 33
    invoke-interface {v4, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v3
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    if-nez v3, :cond_2

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 44
    return p0

    .line 45
    :catch_0
    :cond_4
    :goto_2
    return v1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᲀᛳᛸᛴ;->ᲀᛲᛳᲀ:[I

    .line 2
    .line 3
    iget p0, p0, Lyyds/ᲀᛳᛸᛴ;->ᛲᛴᛳᛲ:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v1, p0, :cond_0

    .line 8
    .line 9
    aget v3, v0, v1

    .line 10
    .line 11
    add-int/2addr v2, v3

    .line 12
    add-int/lit8 v1, v1, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return v2
.end method

.method public final isEmpty()Z
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᲀᛳᛸᛴ;->ᛲᛴᛳᛲ:I

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

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᛵᛴᛵᛴ;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lyyds/ᛵᛴᛵᛴ;-><init>(Lyyds/ᲀᛳᛸᛴ;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    invoke-static {p0, p1, v0}, Lyyds/ᛳᛴᲁᲇ;->ᛶᛷᛲᲁ(Lyyds/ᲀᛳᛸᛴ;Ljava/lang/Object;I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {p0, p1, v1}, Lyyds/ᛳᛴᲁᲇ;->ᛶᛷᛲᲁ(Lyyds/ᲀᛳᛸᛴ;Ljava/lang/Object;I)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    :goto_0
    if-ltz p1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lyyds/ᲀᛳᛸᛴ;->ᛲᲈᲁ(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_1
    return v0
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p0, v1}, Lyyds/ᲀᛳᛸᛴ;->remove(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    or-int/2addr v0, v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return v0
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 4

    .line 1
    iget v0, p0, Lyyds/ᲀᛳᛸᛴ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    sub-int/2addr v0, v1

    .line 5
    const/4 v2, 0x0

    .line 6
    :goto_0
    const/4 v3, -0x1

    .line 7
    if-ge v3, v0, :cond_1

    .line 8
    .line 9
    iget-object v3, p0, Lyyds/ᲀᛳᛸᛴ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 10
    .line 11
    aget-object v3, v3, v0

    .line 12
    .line 13
    invoke-static {p1, v3}, Lyyds/ᛷᛷᛶᲇ;->ᲈᲀᛲᲀ(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lyyds/ᲀᛳᛸᛴ;->ᛲᲈᲁ(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move v2, v1

    .line 23
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    return v2
.end method

.method public final size()I
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᲀᛳᛸᛴ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    return p0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 2

    .line 36
    iget-object v0, p0, Lyyds/ᲀᛳᛸᛴ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    iget p0, p0, Lyyds/ᲀᛳᛸᛴ;->ᛲᛴᛳᛲ:I

    .line 37
    array-length v1, v0

    invoke-static {p0, v1}, Lyyds/ᛲᲇᲁᛳ;->ᲀᛲᛳᲀ(II)V

    const/4 v1, 0x0

    .line 38
    invoke-static {v0, v1, p0}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᲀᛳᛸᛴ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    if-ge v1, v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, [Ljava/lang/Object;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    array-length v1, p1

    .line 22
    if-le v1, v0, :cond_1

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    aput-object v1, p1, v0

    .line 26
    .line 27
    :cond_1
    :goto_0
    iget-object v0, p0, Lyyds/ᲀᛳᛸᛴ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 28
    .line 29
    iget p0, p0, Lyyds/ᲀᛳᛸᛴ;->ᛲᛴᛳᛲ:I

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-static {v1, v1, p0, v0, p1}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lyyds/ᲀᛳᛸᛴ;->isEmpty()Z

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
    iget v0, p0, Lyyds/ᲀᛳᛸᛴ;->ᛲᛴᛳᛲ:I

    .line 11
    .line 12
    mul-int/lit8 v0, v0, 0xe

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
    iget v0, p0, Lyyds/ᲀᛳᛸᛴ;->ᛲᛴᛳᛲ:I

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    :goto_0
    if-ge v2, v0, :cond_3

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
    iget-object v3, p0, Lyyds/ᲀᛳᛸᛴ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 37
    .line 38
    aget-object v3, v3, v2

    .line 39
    .line 40
    if-eq v3, p0, :cond_2

    .line 41
    .line 42
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    const-string v3, "(this Set)"

    .line 47
    .line 48
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    const/16 p0, 0x7d

    .line 55
    .line 56
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method

.method public final ᛲᲈᲁ(I)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lyyds/ᲀᛳᛸᛴ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᲀᛳᛸᛴ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 4
    .line 5
    aget-object v2, v1, p1

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-gt v0, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lyyds/ᲀᛳᛸᛴ;->clear()V

    .line 11
    .line 12
    .line 13
    return-object v2

    .line 14
    :cond_0
    add-int/lit8 v3, v0, -0x1

    .line 15
    .line 16
    iget-object v4, p0, Lyyds/ᲀᛳᛸᛴ;->ᲀᛲᛳᲀ:[I

    .line 17
    .line 18
    array-length v5, v4

    .line 19
    const/16 v6, 0x8

    .line 20
    .line 21
    if-le v5, v6, :cond_3

    .line 22
    .line 23
    array-length v5, v4

    .line 24
    div-int/lit8 v5, v5, 0x3

    .line 25
    .line 26
    if-ge v0, v5, :cond_3

    .line 27
    .line 28
    if-le v0, v6, :cond_1

    .line 29
    .line 30
    shr-int/lit8 v5, v0, 0x1

    .line 31
    .line 32
    add-int v6, v0, v5

    .line 33
    .line 34
    :cond_1
    new-array v5, v6, [I

    .line 35
    .line 36
    iput-object v5, p0, Lyyds/ᲀᛳᛸᛴ;->ᲀᛲᛳᲀ:[I

    .line 37
    .line 38
    new-array v6, v6, [Ljava/lang/Object;

    .line 39
    .line 40
    iput-object v6, p0, Lyyds/ᲀᛳᛸᛴ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 41
    .line 42
    if-lez p1, :cond_2

    .line 43
    .line 44
    const/4 v6, 0x0

    .line 45
    invoke-static {v4, v6, v5, v6, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 46
    .line 47
    .line 48
    iget-object v5, p0, Lyyds/ᲀᛳᛸᛴ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 49
    .line 50
    const/4 v7, 0x6

    .line 51
    invoke-static {v6, p1, v7, v1, v5}, Lyyds/ᲀᲀᛷᛸ;->ᛵᲀᲈᛴ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    if-ge p1, v3, :cond_5

    .line 55
    .line 56
    iget-object v5, p0, Lyyds/ᲀᛳᛸᛴ;->ᲀᛲᛳᲀ:[I

    .line 57
    .line 58
    add-int/lit8 v6, p1, 0x1

    .line 59
    .line 60
    invoke-static {p1, v6, v0, v4, v5}, Lyyds/ᲀᲀᛷᛸ;->ᛳᛸᛴᛶ(III[I[I)V

    .line 61
    .line 62
    .line 63
    iget-object v4, p0, Lyyds/ᲀᛳᛸᛴ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 64
    .line 65
    invoke-static {p1, v6, v0, v1, v4}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    if-ge p1, v3, :cond_4

    .line 70
    .line 71
    add-int/lit8 v1, p1, 0x1

    .line 72
    .line 73
    invoke-static {p1, v1, v0, v4, v4}, Lyyds/ᲀᲀᛷᛸ;->ᛳᛸᛴᛶ(III[I[I)V

    .line 74
    .line 75
    .line 76
    iget-object v4, p0, Lyyds/ᲀᛳᛸᛴ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 77
    .line 78
    invoke-static {p1, v1, v0, v4, v4}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :cond_4
    iget-object p1, p0, Lyyds/ᲀᛳᛸᛴ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 82
    .line 83
    const/4 v1, 0x0

    .line 84
    aput-object v1, p1, v3

    .line 85
    .line 86
    :cond_5
    :goto_0
    iget p1, p0, Lyyds/ᲀᛳᛸᛴ;->ᛲᛴᛳᛲ:I

    .line 87
    .line 88
    if-ne v0, p1, :cond_6

    .line 89
    .line 90
    iput v3, p0, Lyyds/ᲀᛳᛸᛴ;->ᛲᛴᛳᛲ:I

    .line 91
    .line 92
    return-object v2

    .line 93
    :cond_6
    new-instance p0, Ljava/util/ConcurrentModificationException;

    .line 94
    .line 95
    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 96
    .line 97
    .line 98
    throw p0
.end method
