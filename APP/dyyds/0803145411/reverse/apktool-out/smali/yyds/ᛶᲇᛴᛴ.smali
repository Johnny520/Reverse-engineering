.class public final Lyyds/ᛶᲇᛴᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᲈᲁ:I

.field public final ᛵᛸᛸᛷ:I

.field public final ᲀᛲᛳᲀ:I

.field public final ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(IIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lyyds/ᛶᲇᛴᛴ;->ᛲᲈᲁ:I

    .line 5
    .line 6
    iput p2, p0, Lyyds/ᛶᲇᛴᛴ;->ᛵᛸᛸᛷ:I

    .line 7
    .line 8
    iput p3, p0, Lyyds/ᛶᲇᛴᛴ;->ᲀᛲᛳᲀ:I

    .line 9
    .line 10
    iput p4, p0, Lyyds/ᛶᲇᛴᛴ;->ᲇᲈᛵᛷ:I

    .line 11
    .line 12
    return-void
.end method

.method public static ᛲᲈᲁ(Lyyds/ᛶᲇᛴᛴ;IIIII)Lyyds/ᛶᲇᛴᛴ;
    .locals 1

    .line 1
    and-int/lit8 v0, p5, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget p1, p0, Lyyds/ᛶᲇᛴᛴ;->ᛲᲈᲁ:I

    .line 6
    .line 7
    :cond_0
    and-int/lit8 v0, p5, 0x2

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget p2, p0, Lyyds/ᛶᲇᛴᛴ;->ᛵᛸᛸᛷ:I

    .line 12
    .line 13
    :cond_1
    and-int/lit8 v0, p5, 0x4

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget p3, p0, Lyyds/ᛶᲇᛴᛴ;->ᲀᛲᛳᲀ:I

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p5, p5, 0x8

    .line 20
    .line 21
    if-eqz p5, :cond_3

    .line 22
    .line 23
    iget p4, p0, Lyyds/ᛶᲇᛴᛴ;->ᲇᲈᛵᛷ:I

    .line 24
    .line 25
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance p0, Lyyds/ᛶᲇᛴᛴ;

    .line 29
    .line 30
    invoke-direct {p0, p1, p2, p3, p4}, Lyyds/ᛶᲇᛴᛴ;-><init>(IIII)V

    .line 31
    .line 32
    .line 33
    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lyyds/ᛶᲇᛴᛴ;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lyyds/ᛶᲇᛴᛴ;

    .line 12
    .line 13
    iget v1, p0, Lyyds/ᛶᲇᛴᛴ;->ᛲᲈᲁ:I

    .line 14
    .line 15
    iget v3, p1, Lyyds/ᛶᲇᛴᛴ;->ᛲᲈᲁ:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget v1, p0, Lyyds/ᛶᲇᛴᛴ;->ᛵᛸᛸᛷ:I

    .line 21
    .line 22
    iget v3, p1, Lyyds/ᛶᲇᛴᛴ;->ᛵᛸᛸᛷ:I

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget v1, p0, Lyyds/ᛶᲇᛴᛴ;->ᲀᛲᛳᲀ:I

    .line 28
    .line 29
    iget v3, p1, Lyyds/ᛶᲇᛴᛴ;->ᲀᛲᛳᲀ:I

    .line 30
    .line 31
    if-eq v1, v3, :cond_4

    .line 32
    .line 33
    return v2

    .line 34
    :cond_4
    iget p0, p0, Lyyds/ᛶᲇᛴᛴ;->ᲇᲈᛵᛷ:I

    .line 35
    .line 36
    iget p1, p1, Lyyds/ᛶᲇᛴᛴ;->ᲇᲈᛵᛷ:I

    .line 37
    .line 38
    if-eq p0, p1, :cond_5

    .line 39
    .line 40
    return v2

    .line 41
    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛶᲇᛴᛴ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget v2, p0, Lyyds/ᛶᲇᛴᛴ;->ᛵᛸᛸᛷ:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛳᲀ(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lyyds/ᛶᲇᛴᛴ;->ᲀᛲᛳᲀ:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛳᲀ(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget p0, p0, Lyyds/ᛶᲇᛴᛴ;->ᲇᲈᛵᛷ:I

    .line 23
    .line 24
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/2addr p0, v0

    .line 29
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-wide v1, -0x216bae68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget v1, p0, Lyyds/ᛶᲇᛴᛴ;->ᛲᲈᲁ:I

    .line 16
    .line 17
    const-wide v2, -0x216d9e68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;IJ)V

    .line 23
    .line 24
    .line 25
    iget v1, p0, Lyyds/ᛶᲇᛴᛴ;->ᛵᛸᛸᛷ:I

    .line 26
    .line 27
    const-wide v2, -0x216e0e68a836eL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;IJ)V

    .line 33
    .line 34
    .line 35
    iget v1, p0, Lyyds/ᛶᲇᛴᛴ;->ᲀᛲᛳᲀ:I

    .line 36
    .line 37
    const-wide v2, -0x216e9e68a836eL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;IJ)V

    .line 43
    .line 44
    .line 45
    iget p0, p0, Lyyds/ᛶᲇᛴᛴ;->ᲇᲈᛵᛷ:I

    .line 46
    .line 47
    const/16 v1, 0x29

    .line 48
    .line 49
    invoke-static {v0, p0, v1}, Lyyds/ᛴᛷᛷᲇ;->ᛷᛲᲈᛱ(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method

.method public final ᛵᛸᛸᛷ()I
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛶᲇᛴᛴ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    iget p0, p0, Lyyds/ᛶᲇᛴᛴ;->ᛵᛸᛸᛷ:I

    .line 4
    .line 5
    sub-int/2addr v0, p0

    .line 6
    return v0
.end method

.method public final ᲀᛲᛳᲀ()I
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛶᲇᛴᛴ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget p0, p0, Lyyds/ᛶᲇᛴᛴ;->ᛲᲈᲁ:I

    .line 4
    .line 5
    sub-int/2addr v0, p0

    .line 6
    return v0
.end method
