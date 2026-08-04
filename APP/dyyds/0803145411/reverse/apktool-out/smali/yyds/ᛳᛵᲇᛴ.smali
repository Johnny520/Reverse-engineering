.class public final Lyyds/ᛳᛵᲇᛴ;
.super Lyyds/ᛶᛴᛱᛲ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/util/RandomAccess;


# instance fields
.field public ᛲᛴᛳᛲ:I

.field public final ᲀᛲᛳᲀ:[Ljava/lang/Object;

.field public ᲇᲇᲇᛱ:I

.field public final ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(I[Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lyyds/ᛳᛵᲇᛴ;->ᲀᛲᛳᲀ:[Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-ltz p1, :cond_1

    .line 8
    .line 9
    array-length v1, p2

    .line 10
    if-gt p1, v1, :cond_0

    .line 11
    .line 12
    array-length p2, p2

    .line 13
    iput p2, p0, Lyyds/ᛳᛵᲇᛴ;->ᲇᲈᛵᛷ:I

    .line 14
    .line 15
    iput p1, p0, Lyyds/ᛳᛵᲇᛴ;->ᲇᲇᲇᛱ:I

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string p0, " cannot be larger than the buffer size: "

    .line 19
    .line 20
    array-length p2, p2

    .line 21
    const-string v1, "ring buffer filled size: "

    .line 22
    .line 23
    invoke-static {v1, p1, p0, p2}, Lyyds/ᛱᛸᛶᛲ;->ᛱᲈᲁ(Ljava/lang/String;ILjava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    throw v0

    .line 27
    :cond_1
    const-string p0, "ring buffer filled size should not be negative but it is "

    .line 28
    .line 29
    invoke-static {p1, p0}, Lyyds/ᛴᛷᛷᲇ;->ᛲᛳᛶᲁ(ILjava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᲈᛵᛷ(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    throw v0
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛳᛵᲇᛴ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    if-ltz p1, :cond_0

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lyyds/ᛳᛵᲇᛴ;->ᛲᛴᛳᛲ:I

    .line 8
    .line 9
    add-int/2addr v0, p1

    .line 10
    iget p1, p0, Lyyds/ᛳᛵᲇᛴ;->ᲇᲈᛵᛷ:I

    .line 11
    .line 12
    rem-int/2addr v0, p1

    .line 13
    iget-object p0, p0, Lyyds/ᛳᛵᲇᛴ;->ᲀᛲᛳᲀ:[Ljava/lang/Object;

    .line 14
    .line 15
    aget-object p0, p0, v0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 19
    .line 20
    const-string v1, "index: "

    .line 21
    .line 22
    const-string v2, ", size: "

    .line 23
    .line 24
    invoke-static {p1, v0, v1, v2}, Lyyds/ᛴᛷᛷᲇ;->ᛱᲈᲁ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᛱᛵᛴᲀ;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lyyds/ᛱᛵᛴᲀ;-><init>(Lyyds/ᛳᛵᲇᛴ;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .line 51
    invoke-virtual {p0}, Lyyds/ᛳᛵᲇᛴ;->ᛲᲈᲁ()I

    move-result v0

    .line 52
    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lyyds/ᛳᛵᲇᛴ;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 6

    .line 1
    array-length v0, p1

    .line 2
    iget v1, p0, Lyyds/ᛳᛵᲇᛴ;->ᲇᲇᲇᛱ:I

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :cond_0
    iget v0, p0, Lyyds/ᛳᛵᲇᛴ;->ᲇᲇᲇᛱ:I

    .line 11
    .line 12
    iget v1, p0, Lyyds/ᛳᛵᲇᛴ;->ᛲᛴᛳᛲ:I

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    iget-object v4, p0, Lyyds/ᛳᛵᲇᛴ;->ᲀᛲᛳᲀ:[Ljava/lang/Object;

    .line 17
    .line 18
    if-ge v3, v0, :cond_1

    .line 19
    .line 20
    iget v5, p0, Lyyds/ᛳᛵᲇᛴ;->ᲇᲈᛵᛷ:I

    .line 21
    .line 22
    if-ge v1, v5, :cond_1

    .line 23
    .line 24
    aget-object v4, v4, v1

    .line 25
    .line 26
    aput-object v4, p1, v3

    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    :goto_1
    if-ge v3, v0, :cond_2

    .line 34
    .line 35
    aget-object p0, v4, v2

    .line 36
    .line 37
    aput-object p0, p1, v3

    .line 38
    .line 39
    add-int/lit8 v3, v3, 0x1

    .line 40
    .line 41
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    array-length p0, p1

    .line 45
    if-ge v0, p0, :cond_3

    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    aput-object p0, p1, v0

    .line 49
    .line 50
    :cond_3
    return-object p1
.end method

.method public final ᛲᲈᲁ()I
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛳᛵᲇᛴ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    return p0
.end method

.method public final ᛵᛸᛸᛷ()V
    .locals 6

    .line 1
    iget v0, p0, Lyyds/ᛳᛵᲇᛴ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-gt v1, v0, :cond_1

    .line 5
    .line 6
    iget v0, p0, Lyyds/ᛳᛵᲇᛴ;->ᛲᛴᛳᛲ:I

    .line 7
    .line 8
    add-int/lit8 v2, v0, 0x2

    .line 9
    .line 10
    iget v3, p0, Lyyds/ᛳᛵᲇᛴ;->ᲇᲈᛵᛷ:I

    .line 11
    .line 12
    rem-int/2addr v2, v3

    .line 13
    iget-object v4, p0, Lyyds/ᛳᛵᲇᛴ;->ᲀᛲᛳᲀ:[Ljava/lang/Object;

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    if-le v0, v2, :cond_0

    .line 17
    .line 18
    invoke-static {v4, v0, v3, v5}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-static {v4, v0, v2, v5}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v4, v0, v2, v5}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iput v2, p0, Lyyds/ᛳᛵᲇᛴ;->ᛲᛴᛳᛲ:I

    .line 30
    .line 31
    iget v0, p0, Lyyds/ᛳᛵᲇᛴ;->ᲇᲇᲇᛱ:I

    .line 32
    .line 33
    sub-int/2addr v0, v1

    .line 34
    iput v0, p0, Lyyds/ᛳᛵᲇᛴ;->ᲇᲇᲇᛱ:I

    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    iget p0, p0, Lyyds/ᛳᛵᲇᛴ;->ᲇᲇᲇᛱ:I

    .line 38
    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v1, "n shouldn\'t be greater than the buffer size: n = 2, size = "

    .line 42
    .line 43
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v0
.end method
