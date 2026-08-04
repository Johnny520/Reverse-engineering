.class public final Lyyds/ᛲᲇᛵᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᲈᲁ:I

.field public final ᛵᛸᛸᛷ:I

.field public final ᲀᛲᛳᲀ:[B

.field public final ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(III[B)V
    .locals 2

    .line 1
    const-wide v0, -0x62beae68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput p1, p0, Lyyds/ᛲᲇᛵᛵ;->ᛲᲈᲁ:I

    .line 13
    .line 14
    iput p2, p0, Lyyds/ᛲᲇᛵᛵ;->ᛵᛸᛸᛷ:I

    .line 15
    .line 16
    iput-object p4, p0, Lyyds/ᛲᲇᛵᛵ;->ᲀᛲᛳᲀ:[B

    .line 17
    .line 18
    iput p3, p0, Lyyds/ᛲᲇᛵᛵ;->ᲇᲈᛵᛷ:I

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lyyds/ᛲᲇᛵᛵ;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lyyds/ᛲᲇᛵᛵ;

    .line 10
    .line 11
    iget v0, p0, Lyyds/ᛲᲇᛵᛵ;->ᛲᲈᲁ:I

    .line 12
    .line 13
    iget v1, p1, Lyyds/ᛲᲇᛵᛵ;->ᛲᲈᲁ:I

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget v0, p0, Lyyds/ᛲᲇᛵᛵ;->ᛵᛸᛸᛷ:I

    .line 19
    .line 20
    iget v1, p1, Lyyds/ᛲᲇᛵᛵ;->ᛵᛸᛸᛷ:I

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget-object v0, p0, Lyyds/ᛲᲇᛵᛵ;->ᲀᛲᛳᲀ:[B

    .line 26
    .line 27
    iget-object v1, p1, Lyyds/ᛲᲇᛵᛵ;->ᲀᛲᛳᲀ:[B

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_4

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_4
    iget p0, p0, Lyyds/ᛲᲇᛵᛵ;->ᲇᲈᛵᛷ:I

    .line 37
    .line 38
    iget p1, p1, Lyyds/ᛲᲇᛵᛵ;->ᲇᲈᛵᛷ:I

    .line 39
    .line 40
    if-eq p0, p1, :cond_5

    .line 41
    .line 42
    :goto_0
    const/4 p0, 0x0

    .line 43
    return p0

    .line 44
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 45
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛲᲇᛵᛵ;->ᛲᲈᲁ:I

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
    iget v2, p0, Lyyds/ᛲᲇᛵᛵ;->ᛵᛸᛸᛷ:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛳᲀ(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lyyds/ᛲᲇᛵᛵ;->ᲀᛲᛳᲀ:[B

    .line 17
    .line 18
    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    iget p0, p0, Lyyds/ᛲᲇᛵᛵ;->ᲇᲈᛵᛷ:I

    .line 25
    .line 26
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    add-int/2addr p0, v2

    .line 31
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-wide v1, -0x62bfae68a836eL

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
    iget v1, p0, Lyyds/ᛲᲇᛵᛵ;->ᛲᲈᲁ:I

    .line 16
    .line 17
    const-wide v2, -0x62c0ce68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;IJ)V

    .line 23
    .line 24
    .line 25
    iget v1, p0, Lyyds/ᛲᲇᛵᛵ;->ᛵᛸᛸᛷ:I

    .line 26
    .line 27
    const-wide v2, -0x62c16e68a836eL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;IJ)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lyyds/ᛲᲇᛵᛵ;->ᲀᛲᛳᲀ:[B

    .line 36
    .line 37
    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-wide v1, -0x62c21e68a836eL

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget p0, p0, Lyyds/ᛲᲇᛵᛵ;->ᲇᲈᛵᛷ:I

    .line 57
    .line 58
    const/16 v1, 0x29

    .line 59
    .line 60
    invoke-static {v0, p0, v1}, Lyyds/ᛴᛷᛷᲇ;->ᛷᛲᲈᛱ(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method
