.class public final Lyyds/ᛳᲈᛲᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᲈᲁ:F

.field public ᛲᛴᛳᛲ:F

.field public ᛲᲈᲁ:F

.field public ᛵᛸᛸᛷ:F

.field public ᛶᛷᛲᲁ:I

.field public ᲀᛲᛳᲀ:F

.field public ᲇᲇᲇᛱ:F

.field public ᲇᲈᛵᛷ:F


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
    instance-of v1, p1, Lyyds/ᛳᲈᛲᛶ;

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
    check-cast p1, Lyyds/ᛳᲈᛲᛶ;

    .line 12
    .line 13
    iget v1, p0, Lyyds/ᛳᲈᛲᛶ;->ᛲᲈᲁ:F

    .line 14
    .line 15
    iget v3, p1, Lyyds/ᛳᲈᛲᛶ;->ᛲᲈᲁ:F

    .line 16
    .line 17
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget v1, p0, Lyyds/ᛳᲈᛲᛶ;->ᛵᛸᛸᛷ:F

    .line 25
    .line 26
    iget v3, p1, Lyyds/ᛳᲈᛲᛶ;->ᛵᛸᛸᛷ:F

    .line 27
    .line 28
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget v1, p0, Lyyds/ᛳᲈᛲᛶ;->ᲀᛲᛳᲀ:F

    .line 36
    .line 37
    iget v3, p1, Lyyds/ᛳᲈᛲᛶ;->ᲀᛲᛳᲀ:F

    .line 38
    .line 39
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget v1, p0, Lyyds/ᛳᲈᛲᛶ;->ᲇᲈᛵᛷ:F

    .line 47
    .line 48
    iget v3, p1, Lyyds/ᛳᲈᛲᛶ;->ᲇᲈᛵᛷ:F

    .line 49
    .line 50
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget v1, p0, Lyyds/ᛳᲈᛲᛶ;->ᛲᛴᛳᛲ:F

    .line 58
    .line 59
    iget v3, p1, Lyyds/ᛳᲈᛲᛶ;->ᛲᛴᛳᛲ:F

    .line 60
    .line 61
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    iget v1, p0, Lyyds/ᛳᲈᛲᛶ;->ᲇᲇᲇᛱ:F

    .line 69
    .line 70
    iget v3, p1, Lyyds/ᛳᲈᛲᛶ;->ᲇᲇᲇᛱ:F

    .line 71
    .line 72
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_7

    .line 77
    .line 78
    return v2

    .line 79
    :cond_7
    iget v1, p0, Lyyds/ᛳᲈᛲᛶ;->ᛶᛷᛲᲁ:I

    .line 80
    .line 81
    iget v3, p1, Lyyds/ᛳᲈᛲᛶ;->ᛶᛷᛲᲁ:I

    .line 82
    .line 83
    if-eq v1, v3, :cond_8

    .line 84
    .line 85
    return v2

    .line 86
    :cond_8
    iget p0, p0, Lyyds/ᛳᲈᛲᛶ;->ᛱᲈᲁ:F

    .line 87
    .line 88
    iget p1, p1, Lyyds/ᛳᲈᛲᛶ;->ᛱᲈᲁ:F

    .line 89
    .line 90
    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    if-eqz p0, :cond_9

    .line 95
    .line 96
    return v2

    .line 97
    :cond_9
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛳᲈᛲᛶ;->ᛲᲈᲁ:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

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
    iget v2, p0, Lyyds/ᛳᲈᛲᛶ;->ᛵᛸᛸᛷ:F

    .line 11
    .line 12
    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget v0, p0, Lyyds/ᛳᲈᛲᛶ;->ᲀᛲᛳᲀ:F

    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    iget v2, p0, Lyyds/ᛳᲈᛲᛶ;->ᲇᲈᛵᛷ:F

    .line 27
    .line 28
    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    add-int/2addr v2, v0

    .line 33
    mul-int/2addr v2, v1

    .line 34
    iget v0, p0, Lyyds/ᛳᲈᛲᛶ;->ᛲᛴᛳᛲ:F

    .line 35
    .line 36
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    add-int/2addr v0, v2

    .line 41
    mul-int/2addr v0, v1

    .line 42
    iget v2, p0, Lyyds/ᛳᲈᛲᛶ;->ᲇᲇᲇᛱ:F

    .line 43
    .line 44
    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    add-int/2addr v2, v0

    .line 49
    mul-int/2addr v2, v1

    .line 50
    iget v0, p0, Lyyds/ᛳᲈᛲᛶ;->ᛶᛷᛲᲁ:I

    .line 51
    .line 52
    invoke-static {v0, v2, v1}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛳᲀ(III)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget p0, p0, Lyyds/ᛳᲈᛲᛶ;->ᛱᲈᲁ:F

    .line 57
    .line 58
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    add-int/2addr p0, v0

    .line 63
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-wide v1, -0x5a583e68a836eL

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
    iget v1, p0, Lyyds/ᛳᲈᛲᛶ;->ᛲᲈᲁ:F

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-wide v1, -0x5a592e68a836eL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget v1, p0, Lyyds/ᛳᲈᛲᛶ;->ᛵᛸᛸᛷ:F

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-wide v1, -0x5a598e68a836eL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget v1, p0, Lyyds/ᛳᲈᛲᛶ;->ᲀᛲᛳᲀ:F

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-wide v1, -0x5a5a2e68a836eL

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
    iget v1, p0, Lyyds/ᛳᲈᛲᛶ;->ᲇᲈᛵᛷ:F

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-wide v1, -0x5a5b2e68a836eL

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    iget v1, p0, Lyyds/ᛳᲈᛲᛶ;->ᛲᛴᛳᛲ:F

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-wide v1, -0x5a5b8e68a836eL

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    iget v1, p0, Lyyds/ᛳᲈᛲᛶ;->ᲇᲇᲇᛱ:F

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-wide v1, -0x5a5bee68a836eL

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    iget v1, p0, Lyyds/ᛳᲈᛲᛶ;->ᛶᛷᛲᲁ:I

    .line 118
    .line 119
    const-wide v2, -0x5a5c7e68a836eL

    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;IJ)V

    .line 125
    .line 126
    .line 127
    iget p0, p0, Lyyds/ᛳᲈᛲᛶ;->ᛱᲈᲁ:F

    .line 128
    .line 129
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const/16 p0, 0x29

    .line 133
    .line 134
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    return-object p0
.end method
