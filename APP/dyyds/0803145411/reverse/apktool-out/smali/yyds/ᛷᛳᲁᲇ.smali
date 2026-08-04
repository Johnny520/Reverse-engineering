.class public final Lyyds/ᛷᛳᲁᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᲈᲁ:[Ljava/lang/String;

.field public ᛲᛳᛶᲁ:I

.field public ᛲᛴᛳᛲ:[F

.field public ᛲᲈᲁ:[I

.field public ᛵᛸᛸᛷ:[I

.field public ᛶᛷᛲᲁ:[I

.field public ᛷᛲᲈᛱ:[Z

.field public ᛷᛵᲇᲀ:I

.field public ᛷᲈᲈᲁ:[I

.field public ᲀᛲᛳᲀ:I

.field public ᲇᲇᲇᛱ:I

.field public ᲇᲈᛵᛷ:[I


# virtual methods
.method public final ᛲᲈᲁ(IF)V
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛷᛳᲁᲇ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛷᛳᲁᲇ;->ᲇᲈᛵᛷ:[I

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    if-lt v0, v2, :cond_0

    .line 7
    .line 8
    array-length v0, v1

    .line 9
    mul-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lyyds/ᛷᛳᲁᲇ;->ᲇᲈᛵᛷ:[I

    .line 16
    .line 17
    iget-object v0, p0, Lyyds/ᛷᛳᲁᲇ;->ᛲᛴᛳᛲ:[F

    .line 18
    .line 19
    array-length v1, v0

    .line 20
    mul-int/lit8 v1, v1, 0x2

    .line 21
    .line 22
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([FI)[F

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lyyds/ᛷᛳᲁᲇ;->ᛲᛴᛳᛲ:[F

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lyyds/ᛷᛳᲁᲇ;->ᲇᲈᛵᛷ:[I

    .line 29
    .line 30
    iget v1, p0, Lyyds/ᛷᛳᲁᲇ;->ᲇᲇᲇᛱ:I

    .line 31
    .line 32
    aput p1, v0, v1

    .line 33
    .line 34
    iget-object p1, p0, Lyyds/ᛷᛳᲁᲇ;->ᛲᛴᛳᛲ:[F

    .line 35
    .line 36
    add-int/lit8 v0, v1, 0x1

    .line 37
    .line 38
    iput v0, p0, Lyyds/ᛷᛳᲁᲇ;->ᲇᲇᲇᛱ:I

    .line 39
    .line 40
    aput p2, p1, v1

    .line 41
    .line 42
    return-void
.end method

.method public final ᛵᛸᛸᛷ(II)V
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛷᛳᲁᲇ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛷᛳᲁᲇ;->ᛲᲈᲁ:[I

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    if-lt v0, v2, :cond_0

    .line 7
    .line 8
    array-length v0, v1

    .line 9
    mul-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lyyds/ᛷᛳᲁᲇ;->ᛲᲈᲁ:[I

    .line 16
    .line 17
    iget-object v0, p0, Lyyds/ᛷᛳᲁᲇ;->ᛵᛸᛸᛷ:[I

    .line 18
    .line 19
    array-length v1, v0

    .line 20
    mul-int/lit8 v1, v1, 0x2

    .line 21
    .line 22
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lyyds/ᛷᛳᲁᲇ;->ᛵᛸᛸᛷ:[I

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lyyds/ᛷᛳᲁᲇ;->ᛲᲈᲁ:[I

    .line 29
    .line 30
    iget v1, p0, Lyyds/ᛷᛳᲁᲇ;->ᲀᛲᛳᲀ:I

    .line 31
    .line 32
    aput p1, v0, v1

    .line 33
    .line 34
    iget-object p1, p0, Lyyds/ᛷᛳᲁᲇ;->ᛵᛸᛸᛷ:[I

    .line 35
    .line 36
    add-int/lit8 v0, v1, 0x1

    .line 37
    .line 38
    iput v0, p0, Lyyds/ᛷᛳᲁᲇ;->ᲀᛲᛳᲀ:I

    .line 39
    .line 40
    aput p2, p1, v1

    .line 41
    .line 42
    return-void
.end method

.method public final ᲀᛲᛳᲀ(ILjava/lang/String;)V
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛷᛳᲁᲇ;->ᛲᛳᛶᲁ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛷᛳᲁᲇ;->ᛶᛷᛲᲁ:[I

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    if-lt v0, v2, :cond_0

    .line 7
    .line 8
    array-length v0, v1

    .line 9
    mul-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lyyds/ᛷᛳᲁᲇ;->ᛶᛷᛲᲁ:[I

    .line 16
    .line 17
    iget-object v0, p0, Lyyds/ᛷᛳᲁᲇ;->ᛱᲈᲁ:[Ljava/lang/String;

    .line 18
    .line 19
    array-length v1, v0

    .line 20
    mul-int/lit8 v1, v1, 0x2

    .line 21
    .line 22
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, [Ljava/lang/String;

    .line 27
    .line 28
    iput-object v0, p0, Lyyds/ᛷᛳᲁᲇ;->ᛱᲈᲁ:[Ljava/lang/String;

    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Lyyds/ᛷᛳᲁᲇ;->ᛶᛷᛲᲁ:[I

    .line 31
    .line 32
    iget v1, p0, Lyyds/ᛷᛳᲁᲇ;->ᛲᛳᛶᲁ:I

    .line 33
    .line 34
    aput p1, v0, v1

    .line 35
    .line 36
    iget-object p1, p0, Lyyds/ᛷᛳᲁᲇ;->ᛱᲈᲁ:[Ljava/lang/String;

    .line 37
    .line 38
    add-int/lit8 v0, v1, 0x1

    .line 39
    .line 40
    iput v0, p0, Lyyds/ᛷᛳᲁᲇ;->ᛲᛳᛶᲁ:I

    .line 41
    .line 42
    aput-object p2, p1, v1

    .line 43
    .line 44
    return-void
.end method

.method public final ᲇᲈᛵᛷ(IZ)V
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛷᛳᲁᲇ;->ᛷᛵᲇᲀ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛷᛳᲁᲇ;->ᛷᲈᲈᲁ:[I

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    if-lt v0, v2, :cond_0

    .line 7
    .line 8
    array-length v0, v1

    .line 9
    mul-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lyyds/ᛷᛳᲁᲇ;->ᛷᲈᲈᲁ:[I

    .line 16
    .line 17
    iget-object v0, p0, Lyyds/ᛷᛳᲁᲇ;->ᛷᛲᲈᛱ:[Z

    .line 18
    .line 19
    array-length v1, v0

    .line 20
    mul-int/lit8 v1, v1, 0x2

    .line 21
    .line 22
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lyyds/ᛷᛳᲁᲇ;->ᛷᛲᲈᛱ:[Z

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lyyds/ᛷᛳᲁᲇ;->ᛷᲈᲈᲁ:[I

    .line 29
    .line 30
    iget v1, p0, Lyyds/ᛷᛳᲁᲇ;->ᛷᛵᲇᲀ:I

    .line 31
    .line 32
    aput p1, v0, v1

    .line 33
    .line 34
    iget-object p1, p0, Lyyds/ᛷᛳᲁᲇ;->ᛷᛲᲈᛱ:[Z

    .line 35
    .line 36
    add-int/lit8 v0, v1, 0x1

    .line 37
    .line 38
    iput v0, p0, Lyyds/ᛷᛳᲁᲇ;->ᛷᛵᲇᲀ:I

    .line 39
    .line 40
    aput-boolean p2, p1, v1

    .line 41
    .line 42
    return-void
.end method
