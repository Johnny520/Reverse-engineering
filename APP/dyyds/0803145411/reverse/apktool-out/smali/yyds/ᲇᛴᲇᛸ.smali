.class public final Lyyds/ᲇᛴᲇᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:Ljava/lang/Boolean;

.field public final ᛲᲈᲁ:I

.field public final ᛵᛸᛸᛷ:I

.field public final ᲀᛲᛳᲀ:I

.field public final ᲇᲈᛵᛷ:[B


# direct methods
.method public constructor <init>(III[BLjava/lang/Boolean;)V
    .locals 2

    .line 1
    const-wide v0, -0x62338e68a836eL

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
    iput p1, p0, Lyyds/ᲇᛴᲇᛸ;->ᛲᲈᲁ:I

    .line 13
    .line 14
    iput p2, p0, Lyyds/ᲇᛴᲇᛸ;->ᛵᛸᛸᛷ:I

    .line 15
    .line 16
    iput p3, p0, Lyyds/ᲇᛴᲇᛸ;->ᲀᛲᛳᲀ:I

    .line 17
    .line 18
    iput-object p4, p0, Lyyds/ᲇᛴᲇᛸ;->ᲇᲈᛵᛷ:[B

    .line 19
    .line 20
    iput-object p5, p0, Lyyds/ᲇᛴᲇᛸ;->ᛲᛴᛳᛲ:Ljava/lang/Boolean;

    .line 21
    .line 22
    return-void
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
    instance-of v1, p1, Lyyds/ᲇᛴᲇᛸ;

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
    check-cast p1, Lyyds/ᲇᛴᲇᛸ;

    .line 12
    .line 13
    iget v1, p0, Lyyds/ᲇᛴᲇᛸ;->ᛲᲈᲁ:I

    .line 14
    .line 15
    iget v3, p1, Lyyds/ᲇᛴᲇᛸ;->ᛲᲈᲁ:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget v1, p0, Lyyds/ᲇᛴᲇᛸ;->ᛵᛸᛸᛷ:I

    .line 21
    .line 22
    iget v3, p1, Lyyds/ᲇᛴᲇᛸ;->ᛵᛸᛸᛷ:I

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget v1, p0, Lyyds/ᲇᛴᲇᛸ;->ᲀᛲᛳᲀ:I

    .line 28
    .line 29
    iget v3, p1, Lyyds/ᲇᛴᲇᛸ;->ᲀᛲᛳᲀ:I

    .line 30
    .line 31
    if-eq v1, v3, :cond_4

    .line 32
    .line 33
    return v2

    .line 34
    :cond_4
    iget-object v1, p0, Lyyds/ᲇᛴᲇᛸ;->ᲇᲈᛵᛷ:[B

    .line 35
    .line 36
    iget-object v3, p1, Lyyds/ᲇᛴᲇᛸ;->ᲇᲈᛵᛷ:[B

    .line 37
    .line 38
    invoke-static {v1, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_5

    .line 43
    .line 44
    return v2

    .line 45
    :cond_5
    iget-object p0, p0, Lyyds/ᲇᛴᲇᛸ;->ᛲᛴᛳᛲ:Ljava/lang/Boolean;

    .line 46
    .line 47
    iget-object p1, p1, Lyyds/ᲇᛴᲇᛸ;->ᛲᛴᛳᛲ:Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-static {p0, p1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-nez p0, :cond_6

    .line 54
    .line 55
    return v2

    .line 56
    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᲇᛴᲇᛸ;->ᛲᲈᲁ:I

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
    iget v2, p0, Lyyds/ᲇᛴᲇᛸ;->ᛵᛸᛸᛷ:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛳᲀ(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lyyds/ᲇᛴᲇᛸ;->ᲀᛲᛳᲀ:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛳᲀ(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lyyds/ᲇᛴᲇᛸ;->ᲇᲈᛵᛷ:[B

    .line 23
    .line 24
    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, v0

    .line 29
    mul-int/2addr v2, v1

    .line 30
    iget-object p0, p0, Lyyds/ᲇᛴᲇᛸ;->ᛲᛴᛳᛲ:Ljava/lang/Boolean;

    .line 31
    .line 32
    if-nez p0, :cond_0

    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    :goto_0
    add-int/2addr v2, p0

    .line 41
    return v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-wide v1, -0x6235ce68a836eL

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
    iget v1, p0, Lyyds/ᲇᛴᲇᛸ;->ᛲᲈᲁ:I

    .line 16
    .line 17
    const-wide v2, -0x62377e68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;IJ)V

    .line 23
    .line 24
    .line 25
    iget v1, p0, Lyyds/ᲇᛴᲇᛸ;->ᛵᛸᛸᛷ:I

    .line 26
    .line 27
    const-wide v2, -0x62381e68a836eL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;IJ)V

    .line 33
    .line 34
    .line 35
    iget v1, p0, Lyyds/ᲇᛴᲇᛸ;->ᲀᛲᛳᲀ:I

    .line 36
    .line 37
    const-wide v2, -0x62392e68a836eL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;IJ)V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lyyds/ᲇᛴᲇᛸ;->ᲇᲈᛵᛷ:[B

    .line 46
    .line 47
    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-wide v1, -0x623a7e68a836eL

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-object p0, p0, Lyyds/ᲇᛴᲇᛸ;->ᛲᛴᛳᛲ:Ljava/lang/Boolean;

    .line 67
    .line 68
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const/16 p0, 0x29

    .line 72
    .line 73
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0
.end method
