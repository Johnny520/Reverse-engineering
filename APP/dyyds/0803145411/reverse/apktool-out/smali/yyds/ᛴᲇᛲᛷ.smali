.class public final Lyyds/ᛴᲇᛲᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public ᛱᛳᲇ:I

.field public ᛱᲈᲁ:Z

.field public ᛲᛲᲈᲈ:I

.field public final ᛲᛳᛶᲁ:[F

.field public ᛲᛴᛳᛲ:I

.field public ᛶᛷᛲᲁ:F

.field public ᛷᛲᲈᛱ:[Lyyds/ᛷᛱᲈᛷ;

.field public ᛷᛵᲇᲀ:I

.field public final ᛷᲈᲈᲁ:[F

.field public ᲀᛲᛳᲀ:Z

.field public ᲇᲇᲇᛱ:I

.field public ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lyyds/ᛴᲇᛲᛷ;->ᲇᲈᛵᛷ:I

    .line 6
    .line 7
    iput v0, p0, Lyyds/ᛴᲇᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lyyds/ᛴᲇᛲᛷ;->ᲇᲇᲇᛱ:I

    .line 11
    .line 12
    iput-boolean v0, p0, Lyyds/ᛴᲇᛲᛷ;->ᛱᲈᲁ:Z

    .line 13
    .line 14
    const/16 v1, 0x9

    .line 15
    .line 16
    new-array v2, v1, [F

    .line 17
    .line 18
    iput-object v2, p0, Lyyds/ᛴᲇᛲᛷ;->ᛲᛳᛶᲁ:[F

    .line 19
    .line 20
    new-array v1, v1, [F

    .line 21
    .line 22
    iput-object v1, p0, Lyyds/ᛴᲇᛲᛷ;->ᛷᲈᲈᲁ:[F

    .line 23
    .line 24
    const/16 v1, 0x10

    .line 25
    .line 26
    new-array v1, v1, [Lyyds/ᛷᛱᲈᛷ;

    .line 27
    .line 28
    iput-object v1, p0, Lyyds/ᛴᲇᛲᛷ;->ᛷᛲᲈᛱ:[Lyyds/ᛷᛱᲈᛷ;

    .line 29
    .line 30
    iput v0, p0, Lyyds/ᛴᲇᛲᛷ;->ᛷᛵᲇᲀ:I

    .line 31
    .line 32
    iput v0, p0, Lyyds/ᛴᲇᛲᛷ;->ᛲᛲᲈᲈ:I

    .line 33
    .line 34
    iput p1, p0, Lyyds/ᛴᲇᛲᛷ;->ᛱᛳᲇ:I

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lyyds/ᛴᲇᛲᛷ;

    .line 2
    .line 3
    iget p0, p0, Lyyds/ᛴᲇᛲᛷ;->ᲇᲈᛵᛷ:I

    .line 4
    .line 5
    iget p1, p1, Lyyds/ᛴᲇᛲᛷ;->ᲇᲈᛵᛷ:I

    .line 6
    .line 7
    sub-int/2addr p0, p1

    .line 8
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget p0, p0, Lyyds/ᛴᲇᛲᛷ;->ᲇᲈᛵᛷ:I

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final ᛲᛴᛳᛲ(Lyyds/ᲁᛸᛶᲈ;Lyyds/ᛷᛱᲈᛷ;)V
    .locals 4

    .line 1
    iget v0, p0, Lyyds/ᛴᲇᛲᛷ;->ᛷᛵᲇᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    if-ge v2, v0, :cond_0

    .line 6
    .line 7
    iget-object v3, p0, Lyyds/ᛴᲇᛲᛷ;->ᛷᛲᲈᛱ:[Lyyds/ᛷᛱᲈᛷ;

    .line 8
    .line 9
    aget-object v3, v3, v2

    .line 10
    .line 11
    invoke-virtual {v3, p1, p2, v1}, Lyyds/ᛷᛱᲈᛷ;->ᛲᛳᛶᲁ(Lyyds/ᲁᛸᛶᲈ;Lyyds/ᛷᛱᲈᛷ;Z)V

    .line 12
    .line 13
    .line 14
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iput v1, p0, Lyyds/ᛴᲇᛲᛷ;->ᛷᛵᲇᲀ:I

    .line 18
    .line 19
    return-void
.end method

.method public final ᛲᲈᲁ(Lyyds/ᛷᛱᲈᛷ;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget v1, p0, Lyyds/ᛴᲇᛲᛷ;->ᛷᛵᲇᲀ:I

    .line 3
    .line 4
    iget-object v2, p0, Lyyds/ᛴᲇᛲᛷ;->ᛷᛲᲈᛱ:[Lyyds/ᛷᛱᲈᛷ;

    .line 5
    .line 6
    if-ge v0, v1, :cond_1

    .line 7
    .line 8
    aget-object v1, v2, v0

    .line 9
    .line 10
    if-ne v1, p1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    array-length v0, v2

    .line 17
    if-lt v1, v0, :cond_2

    .line 18
    .line 19
    array-length v0, v2

    .line 20
    mul-int/lit8 v0, v0, 0x2

    .line 21
    .line 22
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    move-object v2, v0

    .line 27
    check-cast v2, [Lyyds/ᛷᛱᲈᛷ;

    .line 28
    .line 29
    iput-object v2, p0, Lyyds/ᛴᲇᛲᛷ;->ᛷᛲᲈᛱ:[Lyyds/ᛷᛱᲈᛷ;

    .line 30
    .line 31
    :cond_2
    iget v0, p0, Lyyds/ᛴᲇᛲᛷ;->ᛷᛵᲇᲀ:I

    .line 32
    .line 33
    aput-object p1, v2, v0

    .line 34
    .line 35
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    iput v0, p0, Lyyds/ᛴᲇᛲᛷ;->ᛷᛵᲇᲀ:I

    .line 38
    .line 39
    return-void
.end method

.method public final ᛵᛸᛸᛷ(Lyyds/ᛷᛱᲈᛷ;)V
    .locals 4

    .line 1
    iget v0, p0, Lyyds/ᛴᲇᛲᛷ;->ᛷᛵᲇᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_0
    if-ge v1, v0, :cond_2

    .line 5
    .line 6
    iget-object v2, p0, Lyyds/ᛴᲇᛲᛷ;->ᛷᛲᲈᛱ:[Lyyds/ᛷᛱᲈᛷ;

    .line 7
    .line 8
    aget-object v2, v2, v1

    .line 9
    .line 10
    if-ne v2, p1, :cond_1

    .line 11
    .line 12
    :goto_1
    add-int/lit8 p1, v0, -0x1

    .line 13
    .line 14
    if-ge v1, p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Lyyds/ᛴᲇᛲᛷ;->ᛷᛲᲈᛱ:[Lyyds/ᛷᛱᲈᛷ;

    .line 17
    .line 18
    add-int/lit8 v2, v1, 0x1

    .line 19
    .line 20
    aget-object v3, p1, v2

    .line 21
    .line 22
    aput-object v3, p1, v1

    .line 23
    .line 24
    move v1, v2

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget p1, p0, Lyyds/ᛴᲇᛲᛷ;->ᛷᛵᲇᲀ:I

    .line 27
    .line 28
    add-int/lit8 p1, p1, -0x1

    .line 29
    .line 30
    iput p1, p0, Lyyds/ᛴᲇᛲᛷ;->ᛷᛵᲇᲀ:I

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    return-void
.end method

.method public final ᲀᛲᛳᲀ()V
    .locals 6

    .line 1
    const/4 v0, 0x5

    .line 2
    iput v0, p0, Lyyds/ᛴᲇᛲᛷ;->ᛱᛳᲇ:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lyyds/ᛴᲇᛲᛷ;->ᲇᲇᲇᛱ:I

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    iput v1, p0, Lyyds/ᛴᲇᛲᛷ;->ᲇᲈᛵᛷ:I

    .line 9
    .line 10
    iput v1, p0, Lyyds/ᛴᲇᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput v1, p0, Lyyds/ᛴᲇᛲᛷ;->ᛶᛷᛲᲁ:F

    .line 14
    .line 15
    iput-boolean v0, p0, Lyyds/ᛴᲇᛲᛷ;->ᛱᲈᲁ:Z

    .line 16
    .line 17
    iget v2, p0, Lyyds/ᛴᲇᛲᛷ;->ᛷᛵᲇᲀ:I

    .line 18
    .line 19
    move v3, v0

    .line 20
    :goto_0
    if-ge v3, v2, :cond_0

    .line 21
    .line 22
    iget-object v4, p0, Lyyds/ᛴᲇᛲᛷ;->ᛷᛲᲈᛱ:[Lyyds/ᛷᛱᲈᛷ;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    aput-object v5, v4, v3

    .line 26
    .line 27
    add-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iput v0, p0, Lyyds/ᛴᲇᛲᛷ;->ᛷᛵᲇᲀ:I

    .line 31
    .line 32
    iput v0, p0, Lyyds/ᛴᲇᛲᛷ;->ᛲᛲᲈᲈ:I

    .line 33
    .line 34
    iput-boolean v0, p0, Lyyds/ᛴᲇᛲᛷ;->ᲀᛲᛳᲀ:Z

    .line 35
    .line 36
    iget-object p0, p0, Lyyds/ᛴᲇᛲᛷ;->ᛷᲈᲈᲁ:[F

    .line 37
    .line 38
    invoke-static {p0, v1}, Ljava/util/Arrays;->fill([FF)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final ᲇᲈᛵᛷ(Lyyds/ᲁᛸᛶᲈ;F)V
    .locals 3

    .line 1
    iput p2, p0, Lyyds/ᛴᲇᛲᛷ;->ᛶᛷᛲᲁ:F

    .line 2
    .line 3
    const/4 p2, 0x1

    .line 4
    iput-boolean p2, p0, Lyyds/ᛴᲇᛲᛷ;->ᛱᲈᲁ:Z

    .line 5
    .line 6
    iget p2, p0, Lyyds/ᛴᲇᛲᛷ;->ᛷᛵᲇᲀ:I

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    iput v0, p0, Lyyds/ᛴᲇᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    move v1, v0

    .line 13
    :goto_0
    if-ge v1, p2, :cond_0

    .line 14
    .line 15
    iget-object v2, p0, Lyyds/ᛴᲇᛲᛷ;->ᛷᛲᲈᛱ:[Lyyds/ᛷᛱᲈᛷ;

    .line 16
    .line 17
    aget-object v2, v2, v1

    .line 18
    .line 19
    invoke-virtual {v2, p1, p0, v0}, Lyyds/ᛷᛱᲈᛷ;->ᛱᲈᲁ(Lyyds/ᲁᛸᛶᲈ;Lyyds/ᛴᲇᛲᛷ;Z)V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iput v0, p0, Lyyds/ᛴᲇᛲᛷ;->ᛷᛵᲇᲀ:I

    .line 26
    .line 27
    return-void
.end method
