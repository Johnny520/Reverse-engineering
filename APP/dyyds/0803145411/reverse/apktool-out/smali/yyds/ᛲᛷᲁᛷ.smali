.class public final Lyyds/ᛲᛷᲁᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:I

.field public final ᛲᲈᲁ:I

.field public final ᛵᛸᛸᛷ:Ljava/util/ArrayList;

.field public final ᛶᛷᛲᲁ:Ljava/lang/Boolean;

.field public final ᲀᛲᛳᲀ:I

.field public final ᲇᲇᲇᛱ:[B

.field public final ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(ILjava/util/ArrayList;III[BLjava/lang/Boolean;)V
    .locals 2

    .line 1
    const-wide v0, -0x623f4e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x623fce68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput p1, p0, Lyyds/ᛲᛷᲁᛷ;->ᛲᲈᲁ:I

    .line 21
    .line 22
    iput-object p2, p0, Lyyds/ᛲᛷᲁᛷ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 23
    .line 24
    iput p3, p0, Lyyds/ᛲᛷᲁᛷ;->ᲀᛲᛳᲀ:I

    .line 25
    .line 26
    iput p4, p0, Lyyds/ᛲᛷᲁᛷ;->ᲇᲈᛵᛷ:I

    .line 27
    .line 28
    iput p5, p0, Lyyds/ᛲᛷᲁᛷ;->ᛲᛴᛳᛲ:I

    .line 29
    .line 30
    iput-object p6, p0, Lyyds/ᛲᛷᲁᛷ;->ᲇᲇᲇᛱ:[B

    .line 31
    .line 32
    iput-object p7, p0, Lyyds/ᛲᛷᲁᛷ;->ᛶᛷᛲᲁ:Ljava/lang/Boolean;

    .line 33
    .line 34
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
    instance-of v0, p1, Lyyds/ᛲᛷᲁᛷ;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lyyds/ᛲᛷᲁᛷ;

    .line 10
    .line 11
    iget v0, p0, Lyyds/ᛲᛷᲁᛷ;->ᛲᲈᲁ:I

    .line 12
    .line 13
    iget v1, p1, Lyyds/ᛲᛷᲁᛷ;->ᛲᲈᲁ:I

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-object v0, p0, Lyyds/ᛲᛷᲁᛷ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 19
    .line 20
    iget-object v1, p1, Lyyds/ᛲᛷᲁᛷ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget v0, p0, Lyyds/ᛲᛷᲁᛷ;->ᲀᛲᛳᲀ:I

    .line 30
    .line 31
    iget v1, p1, Lyyds/ᛲᛷᲁᛷ;->ᲀᛲᛳᲀ:I

    .line 32
    .line 33
    if-eq v0, v1, :cond_4

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_4
    iget v0, p0, Lyyds/ᛲᛷᲁᛷ;->ᲇᲈᛵᛷ:I

    .line 37
    .line 38
    iget v1, p1, Lyyds/ᛲᛷᲁᛷ;->ᲇᲈᛵᛷ:I

    .line 39
    .line 40
    if-eq v0, v1, :cond_5

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_5
    iget v0, p0, Lyyds/ᛲᛷᲁᛷ;->ᛲᛴᛳᛲ:I

    .line 44
    .line 45
    iget v1, p1, Lyyds/ᛲᛷᲁᛷ;->ᛲᛴᛳᛲ:I

    .line 46
    .line 47
    if-eq v0, v1, :cond_6

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_6
    iget-object v0, p0, Lyyds/ᛲᛷᲁᛷ;->ᲇᲇᲇᛱ:[B

    .line 51
    .line 52
    iget-object v1, p1, Lyyds/ᛲᛷᲁᛷ;->ᲇᲇᲇᛱ:[B

    .line 53
    .line 54
    invoke-static {v0, v1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_7

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_7
    iget-object p0, p0, Lyyds/ᛲᛷᲁᛷ;->ᛶᛷᛲᲁ:Ljava/lang/Boolean;

    .line 62
    .line 63
    iget-object p1, p1, Lyyds/ᛲᛷᲁᛷ;->ᛶᛷᛲᲁ:Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-static {p0, p1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-nez p0, :cond_8

    .line 70
    .line 71
    :goto_0
    const/4 p0, 0x0

    .line 72
    return p0

    .line 73
    :cond_8
    :goto_1
    const/4 p0, 0x1

    .line 74
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛲᛷᲁᛷ;->ᛲᲈᲁ:I

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
    iget-object v2, p0, Lyyds/ᛲᛷᲁᛷ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget v0, p0, Lyyds/ᛲᛷᲁᛷ;->ᲀᛲᛳᲀ:I

    .line 19
    .line 20
    invoke-static {v0, v2, v1}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛳᲀ(III)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget v2, p0, Lyyds/ᛲᛷᲁᛷ;->ᲇᲈᛵᛷ:I

    .line 25
    .line 26
    invoke-static {v2, v0, v1}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛳᲀ(III)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget v2, p0, Lyyds/ᛲᛷᲁᛷ;->ᛲᛴᛳᛲ:I

    .line 31
    .line 32
    invoke-static {v2, v0, v1}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛳᲀ(III)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v2, p0, Lyyds/ᛲᛷᲁᛷ;->ᲇᲇᲇᛱ:[B

    .line 37
    .line 38
    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    add-int/2addr v2, v0

    .line 43
    mul-int/2addr v2, v1

    .line 44
    iget-object p0, p0, Lyyds/ᛲᛷᲁᛷ;->ᛶᛷᛲᲁ:Ljava/lang/Boolean;

    .line 45
    .line 46
    if-nez p0, :cond_0

    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    :goto_0
    add-int/2addr v2, p0

    .line 55
    return v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-wide v1, -0x62428e68a836eL

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
    iget v1, p0, Lyyds/ᛲᛷᲁᛷ;->ᛲᲈᲁ:I

    .line 16
    .line 17
    const-wide v2, -0x62447e68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;IJ)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lyyds/ᛲᛷᲁᛷ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-wide v1, -0x62452e68a836eL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget v1, p0, Lyyds/ᛲᛷᲁᛷ;->ᲀᛲᛳᲀ:I

    .line 43
    .line 44
    const-wide v2, -0x6245be68a836eL

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;IJ)V

    .line 50
    .line 51
    .line 52
    iget v1, p0, Lyyds/ᛲᛷᲁᛷ;->ᲇᲈᛵᛷ:I

    .line 53
    .line 54
    const-wide v2, -0x62465e68a836eL

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;IJ)V

    .line 60
    .line 61
    .line 62
    iget v1, p0, Lyyds/ᛲᛷᲁᛷ;->ᛲᛴᛳᛲ:I

    .line 63
    .line 64
    const-wide v2, -0x62476e68a836eL

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;IJ)V

    .line 70
    .line 71
    .line 72
    iget-object v1, p0, Lyyds/ᛲᛷᲁᛷ;->ᲇᲇᲇᛱ:[B

    .line 73
    .line 74
    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-wide v1, -0x6248be68a836eL

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    iget-object p0, p0, Lyyds/ᛲᛷᲁᛷ;->ᛶᛷᛲᲁ:Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const/16 p0, 0x29

    .line 99
    .line 100
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0
.end method
