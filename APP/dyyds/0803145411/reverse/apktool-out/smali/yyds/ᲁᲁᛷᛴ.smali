.class public final Lyyds/ᲁᲁᛷᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛱᲈᲁ:F

.field public final ᛲᛳᛶᲁ:F

.field public final ᛲᛴᛳᛲ:I

.field public final ᛲᲈᲁ:Ljava/lang/String;

.field public final ᛵᛸᛸᛷ:F

.field public final ᛶᛷᛲᲁ:F

.field public final ᛷᲈᲈᲁ:F

.field public final ᲀᛲᛳᲀ:F

.field public final ᲇᲇᲇᛱ:F

.field public final ᲇᲈᛵᛷ:F


# direct methods
.method public constructor <init>(Ljava/lang/String;FFFIFFFFF)V
    .locals 2

    .line 1
    const-wide v0, -0x617fce68a836eL

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
    iput-object p1, p0, Lyyds/ᲁᲁᛷᛴ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 13
    .line 14
    iput p2, p0, Lyyds/ᲁᲁᛷᛴ;->ᛵᛸᛸᛷ:F

    .line 15
    .line 16
    iput p3, p0, Lyyds/ᲁᲁᛷᛴ;->ᲀᛲᛳᲀ:F

    .line 17
    .line 18
    iput p4, p0, Lyyds/ᲁᲁᛷᛴ;->ᲇᲈᛵᛷ:F

    .line 19
    .line 20
    iput p5, p0, Lyyds/ᲁᲁᛷᛴ;->ᛲᛴᛳᛲ:I

    .line 21
    .line 22
    iput p6, p0, Lyyds/ᲁᲁᛷᛴ;->ᲇᲇᲇᛱ:F

    .line 23
    .line 24
    iput p7, p0, Lyyds/ᲁᲁᛷᛴ;->ᛶᛷᛲᲁ:F

    .line 25
    .line 26
    iput p8, p0, Lyyds/ᲁᲁᛷᛴ;->ᛱᲈᲁ:F

    .line 27
    .line 28
    iput p9, p0, Lyyds/ᲁᲁᛷᛴ;->ᛲᛳᛶᲁ:F

    .line 29
    .line 30
    iput p10, p0, Lyyds/ᲁᲁᛷᛴ;->ᛷᲈᲈᲁ:F

    .line 31
    .line 32
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
    instance-of v1, p1, Lyyds/ᲁᲁᛷᛴ;

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
    check-cast p1, Lyyds/ᲁᲁᛷᛴ;

    .line 12
    .line 13
    iget-object v1, p0, Lyyds/ᲁᲁᛷᛴ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lyyds/ᲁᲁᛷᛴ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget v1, p0, Lyyds/ᲁᲁᛷᛴ;->ᛵᛸᛸᛷ:F

    .line 25
    .line 26
    iget v3, p1, Lyyds/ᲁᲁᛷᛴ;->ᛵᛸᛸᛷ:F

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
    iget v1, p0, Lyyds/ᲁᲁᛷᛴ;->ᲀᛲᛳᲀ:F

    .line 36
    .line 37
    iget v3, p1, Lyyds/ᲁᲁᛷᛴ;->ᲀᛲᛳᲀ:F

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
    iget v1, p0, Lyyds/ᲁᲁᛷᛴ;->ᲇᲈᛵᛷ:F

    .line 47
    .line 48
    iget v3, p1, Lyyds/ᲁᲁᛷᛴ;->ᲇᲈᛵᛷ:F

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
    iget v1, p0, Lyyds/ᲁᲁᛷᛴ;->ᛲᛴᛳᛲ:I

    .line 58
    .line 59
    iget v3, p1, Lyyds/ᲁᲁᛷᛴ;->ᛲᛴᛳᛲ:I

    .line 60
    .line 61
    if-eq v1, v3, :cond_6

    .line 62
    .line 63
    return v2

    .line 64
    :cond_6
    iget v1, p0, Lyyds/ᲁᲁᛷᛴ;->ᲇᲇᲇᛱ:F

    .line 65
    .line 66
    iget v3, p1, Lyyds/ᲁᲁᛷᛴ;->ᲇᲇᲇᛱ:F

    .line 67
    .line 68
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_7

    .line 73
    .line 74
    return v2

    .line 75
    :cond_7
    iget v1, p0, Lyyds/ᲁᲁᛷᛴ;->ᛶᛷᛲᲁ:F

    .line 76
    .line 77
    iget v3, p1, Lyyds/ᲁᲁᛷᛴ;->ᛶᛷᛲᲁ:F

    .line 78
    .line 79
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_8

    .line 84
    .line 85
    return v2

    .line 86
    :cond_8
    iget v1, p0, Lyyds/ᲁᲁᛷᛴ;->ᛱᲈᲁ:F

    .line 87
    .line 88
    iget v3, p1, Lyyds/ᲁᲁᛷᛴ;->ᛱᲈᲁ:F

    .line 89
    .line 90
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_9

    .line 95
    .line 96
    return v2

    .line 97
    :cond_9
    iget v1, p0, Lyyds/ᲁᲁᛷᛴ;->ᛲᛳᛶᲁ:F

    .line 98
    .line 99
    iget v3, p1, Lyyds/ᲁᲁᛷᛴ;->ᛲᛳᛶᲁ:F

    .line 100
    .line 101
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_a

    .line 106
    .line 107
    return v2

    .line 108
    :cond_a
    iget p0, p0, Lyyds/ᲁᲁᛷᛴ;->ᛷᲈᲈᲁ:F

    .line 109
    .line 110
    iget p1, p1, Lyyds/ᲁᲁᛷᛴ;->ᛷᲈᲈᲁ:F

    .line 111
    .line 112
    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-eqz p0, :cond_b

    .line 117
    .line 118
    return v2

    .line 119
    :cond_b
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᲁᲁᛷᛴ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    iget v2, p0, Lyyds/ᲁᲁᛷᛴ;->ᛵᛸᛸᛷ:F

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
    iget v0, p0, Lyyds/ᲁᲁᛷᛴ;->ᲀᛲᛳᲀ:F

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
    iget v2, p0, Lyyds/ᲁᲁᛷᛴ;->ᲇᲈᛵᛷ:F

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
    iget v0, p0, Lyyds/ᲁᲁᛷᛴ;->ᛲᛴᛳᛲ:I

    .line 35
    .line 36
    invoke-static {v0, v2, v1}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛳᲀ(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, Lyyds/ᲁᲁᛷᛴ;->ᲇᲇᲇᛱ:F

    .line 41
    .line 42
    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    add-int/2addr v2, v0

    .line 47
    mul-int/2addr v2, v1

    .line 48
    iget v0, p0, Lyyds/ᲁᲁᛷᛴ;->ᛶᛷᛲᲁ:F

    .line 49
    .line 50
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    add-int/2addr v0, v2

    .line 55
    mul-int/2addr v0, v1

    .line 56
    iget v2, p0, Lyyds/ᲁᲁᛷᛴ;->ᛱᲈᲁ:F

    .line 57
    .line 58
    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    add-int/2addr v2, v0

    .line 63
    mul-int/2addr v2, v1

    .line 64
    iget v0, p0, Lyyds/ᲁᲁᛷᛴ;->ᛲᛳᛶᲁ:F

    .line 65
    .line 66
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    add-int/2addr v0, v2

    .line 71
    mul-int/2addr v0, v1

    .line 72
    iget p0, p0, Lyyds/ᲁᲁᛷᛴ;->ᛷᲈᲈᲁ:F

    .line 73
    .line 74
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    add-int/2addr p0, v0

    .line 79
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-wide v1, -0x61808e68a836eL

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
    iget-object v1, p0, Lyyds/ᲁᲁᛷᛴ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 16
    .line 17
    const-wide v2, -0x61818e68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, Lyyds/ᛴᛷᛷᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    .line 23
    .line 24
    .line 25
    iget v1, p0, Lyyds/ᲁᲁᛷᛴ;->ᛵᛸᛸᛷ:F

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-wide v1, -0x6181de68a836eL

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
    iget v1, p0, Lyyds/ᲁᲁᛷᛴ;->ᲀᛲᛳᲀ:F

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-wide v1, -0x61822e68a836eL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget v1, p0, Lyyds/ᲁᲁᛷᛴ;->ᲇᲈᛵᛷ:F

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-wide v1, -0x6182ce68a836eL

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    iget v1, p0, Lyyds/ᲁᲁᛷᛴ;->ᛲᛴᛳᛲ:I

    .line 77
    .line 78
    const-wide v2, -0x61835e68a836eL

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;IJ)V

    .line 84
    .line 85
    .line 86
    iget v1, p0, Lyyds/ᲁᲁᛷᛴ;->ᲇᲇᲇᛱ:F

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-wide v1, -0x6183ee68a836eL

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    iget v1, p0, Lyyds/ᲁᲁᛷᛴ;->ᛶᛷᛲᲁ:F

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-wide v1, -0x61847e68a836eL

    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    iget v1, p0, Lyyds/ᲁᲁᛷᛴ;->ᛱᲈᲁ:F

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const-wide v1, -0x6184fe68a836eL

    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    iget v1, p0, Lyyds/ᲁᲁᛷᛴ;->ᛲᛳᛶᲁ:F

    .line 138
    .line 139
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    const-wide v1, -0x61857e68a836eL

    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    iget p0, p0, Lyyds/ᲁᲁᛷᛴ;->ᛷᲈᲈᲁ:F

    .line 155
    .line 156
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    const/16 p0, 0x29

    .line 160
    .line 161
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    return-object p0
.end method
