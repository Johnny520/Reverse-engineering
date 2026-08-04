.class public Lyyds/ᛷᛱᲈᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᛴᛳᛲ:Z

.field public ᛲᲈᲁ:Lyyds/ᛴᲇᛲᛷ;

.field public ᛵᛸᛸᛷ:F

.field public final ᲀᛲᛳᲀ:Ljava/util/ArrayList;

.field public final ᲇᲈᛵᛷ:Lyyds/ᲁᛵᲈᛵ;


# direct methods
.method public constructor <init>(Lyyds/ᛳᛷᲀᛴ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lyyds/ᛷᛱᲈᛷ;->ᛲᲈᲁ:Lyyds/ᛴᲇᛲᛷ;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lyyds/ᛷᛱᲈᛷ;->ᛵᛸᛸᛷ:F

    .line 9
    .line 10
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lyyds/ᛷᛱᲈᛷ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Lyyds/ᛷᛱᲈᛷ;->ᛲᛴᛳᛲ:Z

    .line 19
    .line 20
    new-instance v0, Lyyds/ᲁᛵᲈᛵ;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lyyds/ᲁᛵᲈᛵ;-><init>(Lyyds/ᛷᛱᲈᛷ;Lyyds/ᛳᛷᲀᛴ;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lyyds/ᛷᛱᲈᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛵᲈᛵ;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 10

    .line 1
    iget-object v0, p0, Lyyds/ᛷᛱᲈᛷ;->ᛲᲈᲁ:Lyyds/ᛴᲇᛲᛷ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "0"

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, ""

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lyyds/ᛷᛱᲈᛷ;->ᛲᲈᲁ:Lyyds/ᛴᲇᛲᛷ;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    const-string v1, " = "

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget v1, p0, Lyyds/ᛷᛱᲈᛷ;->ᛵᛸᛸᛷ:F

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    cmpl-float v1, v1, v2

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    new-instance v1, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget v0, p0, Lyyds/ᛷᛱᲈᛷ;->ᛵᛸᛸᛷ:F

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    move v1, v4

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move v1, v3

    .line 56
    :goto_1
    iget-object p0, p0, Lyyds/ᛷᛱᲈᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛵᲈᛵ;

    .line 57
    .line 58
    invoke-virtual {p0}, Lyyds/ᲁᛵᲈᛵ;->ᲇᲈᛵᛷ()I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    :goto_2
    if-ge v3, v5, :cond_8

    .line 63
    .line 64
    invoke-virtual {p0, v3}, Lyyds/ᲁᛵᲈᛵ;->ᛲᛴᛳᛲ(I)Lyyds/ᛴᲇᛲᛷ;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    if-nez v6, :cond_2

    .line 69
    .line 70
    goto :goto_6

    .line 71
    :cond_2
    invoke-virtual {p0, v3}, Lyyds/ᲁᛵᲈᛵ;->ᲇᲇᲇᛱ(I)F

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    cmpl-float v8, v7, v2

    .line 76
    .line 77
    if-nez v8, :cond_3

    .line 78
    .line 79
    goto :goto_6

    .line 80
    :cond_3
    invoke-virtual {v6}, Lyyds/ᛴᲇᛲᛷ;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    const/high16 v9, -0x40800000    # -1.0f

    .line 85
    .line 86
    if-nez v1, :cond_4

    .line 87
    .line 88
    cmpg-float v1, v7, v2

    .line 89
    .line 90
    if-gez v1, :cond_6

    .line 91
    .line 92
    const-string v1, "- "

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    :goto_3
    mul-float/2addr v7, v9

    .line 99
    goto :goto_4

    .line 100
    :cond_4
    if-lez v8, :cond_5

    .line 101
    .line 102
    const-string v1, " + "

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    goto :goto_4

    .line 109
    :cond_5
    const-string v1, " - "

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    goto :goto_3

    .line 116
    :cond_6
    :goto_4
    const/high16 v1, 0x3f800000    # 1.0f

    .line 117
    .line 118
    cmpl-float v1, v7, v1

    .line 119
    .line 120
    if-nez v1, :cond_7

    .line 121
    .line 122
    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    goto :goto_5

    .line 127
    :cond_7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string v0, " "

    .line 136
    .line 137
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    :goto_5
    move v1, v4

    .line 148
    :goto_6
    add-int/lit8 v3, v3, 0x1

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_8
    if-nez v1, :cond_9

    .line 152
    .line 153
    const-string p0, "0.0"

    .line 154
    .line 155
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    return-object p0

    .line 160
    :cond_9
    return-object v0
.end method

.method public final ᛱᲈᲁ(Lyyds/ᲁᛸᛶᲈ;Lyyds/ᛴᲇᛲᛷ;Z)V
    .locals 4

    .line 1
    iget-boolean v0, p2, Lyyds/ᛴᲇᛲᛷ;->ᛱᲈᲁ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lyyds/ᛷᛱᲈᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛵᲈᛵ;

    .line 7
    .line 8
    invoke-virtual {v0, p2}, Lyyds/ᲁᛵᲈᛵ;->ᲀᛲᛳᲀ(Lyyds/ᛴᲇᛲᛷ;)F

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    iget v2, p0, Lyyds/ᛷᛱᲈᛷ;->ᛵᛸᛸᛷ:F

    .line 13
    .line 14
    iget v3, p2, Lyyds/ᛴᲇᛲᛷ;->ᛶᛷᛲᲁ:F

    .line 15
    .line 16
    mul-float/2addr v3, v1

    .line 17
    add-float/2addr v3, v2

    .line 18
    iput v3, p0, Lyyds/ᛷᛱᲈᛷ;->ᛵᛸᛸᛷ:F

    .line 19
    .line 20
    invoke-virtual {v0, p2, p3}, Lyyds/ᲁᛵᲈᛵ;->ᛱᲈᲁ(Lyyds/ᛴᲇᛲᛷ;Z)F

    .line 21
    .line 22
    .line 23
    if-eqz p3, :cond_1

    .line 24
    .line 25
    invoke-virtual {p2, p0}, Lyyds/ᛴᲇᛲᛷ;->ᛵᛸᛸᛷ(Lyyds/ᛷᛱᲈᛷ;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-virtual {v0}, Lyyds/ᲁᛵᲈᛵ;->ᲇᲈᛵᛷ()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-nez p2, :cond_2

    .line 33
    .line 34
    const/4 p2, 0x1

    .line 35
    iput-boolean p2, p0, Lyyds/ᛷᛱᲈᛷ;->ᛲᛴᛳᛲ:Z

    .line 36
    .line 37
    iput-boolean p2, p1, Lyyds/ᲁᛸᛶᲈ;->ᛵᛸᛸᛷ:Z

    .line 38
    .line 39
    :cond_2
    :goto_0
    return-void
.end method

.method public ᛲᛳᛶᲁ(Lyyds/ᲁᛸᛶᲈ;Lyyds/ᛷᛱᲈᛷ;Z)V
    .locals 7

    .line 1
    iget-object v0, p0, Lyyds/ᛷᛱᲈᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛵᲈᛵ;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p2, Lyyds/ᛷᛱᲈᛷ;->ᛲᲈᲁ:Lyyds/ᛴᲇᛲᛷ;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lyyds/ᲁᛵᲈᛵ;->ᲀᛲᛳᲀ(Lyyds/ᛴᲇᛲᛷ;)F

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    iget-object v2, p2, Lyyds/ᛷᛱᲈᛷ;->ᛲᲈᲁ:Lyyds/ᛴᲇᛲᛷ;

    .line 13
    .line 14
    invoke-virtual {v0, v2, p3}, Lyyds/ᲁᛵᲈᛵ;->ᛱᲈᲁ(Lyyds/ᛴᲇᛲᛷ;Z)F

    .line 15
    .line 16
    .line 17
    iget-object v2, p2, Lyyds/ᛷᛱᲈᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛵᲈᛵ;

    .line 18
    .line 19
    invoke-virtual {v2}, Lyyds/ᲁᛵᲈᛵ;->ᲇᲈᛵᛷ()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v4, 0x0

    .line 24
    :goto_0
    if-ge v4, v3, :cond_0

    .line 25
    .line 26
    invoke-virtual {v2, v4}, Lyyds/ᲁᛵᲈᛵ;->ᛲᛴᛳᛲ(I)Lyyds/ᛴᲇᛲᛷ;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-virtual {v2, v5}, Lyyds/ᲁᛵᲈᛵ;->ᲀᛲᛳᲀ(Lyyds/ᛴᲇᛲᛷ;)F

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    mul-float/2addr v6, v1

    .line 35
    invoke-virtual {v0, v5, v6, p3}, Lyyds/ᲁᛵᲈᛵ;->ᛲᲈᲁ(Lyyds/ᛴᲇᛲᛷ;FZ)V

    .line 36
    .line 37
    .line 38
    add-int/lit8 v4, v4, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget v2, p0, Lyyds/ᛷᛱᲈᛷ;->ᛵᛸᛸᛷ:F

    .line 42
    .line 43
    iget v3, p2, Lyyds/ᛷᛱᲈᛷ;->ᛵᛸᛸᛷ:F

    .line 44
    .line 45
    mul-float/2addr v3, v1

    .line 46
    add-float/2addr v3, v2

    .line 47
    iput v3, p0, Lyyds/ᛷᛱᲈᛷ;->ᛵᛸᛸᛷ:F

    .line 48
    .line 49
    if-eqz p3, :cond_1

    .line 50
    .line 51
    iget-object p2, p2, Lyyds/ᛷᛱᲈᛷ;->ᛲᲈᲁ:Lyyds/ᛴᲇᛲᛷ;

    .line 52
    .line 53
    invoke-virtual {p2, p0}, Lyyds/ᛴᲇᛲᛷ;->ᛵᛸᛸᛷ(Lyyds/ᛷᛱᲈᛷ;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    iget-object p2, p0, Lyyds/ᛷᛱᲈᛷ;->ᛲᲈᲁ:Lyyds/ᛴᲇᛲᛷ;

    .line 57
    .line 58
    if-eqz p2, :cond_2

    .line 59
    .line 60
    invoke-virtual {v0}, Lyyds/ᲁᛵᲈᛵ;->ᲇᲈᛵᛷ()I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-nez p2, :cond_2

    .line 65
    .line 66
    const/4 p2, 0x1

    .line 67
    iput-boolean p2, p0, Lyyds/ᛷᛱᲈᛷ;->ᛲᛴᛳᛲ:Z

    .line 68
    .line 69
    iput-boolean p2, p1, Lyyds/ᲁᛸᛶᲈ;->ᛵᛸᛸᛷ:Z

    .line 70
    .line 71
    :cond_2
    return-void
.end method

.method public ᛲᛴᛳᛲ()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛷᛱᲈᛷ;->ᛲᲈᲁ:Lyyds/ᛴᲇᛲᛷ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lyyds/ᛷᛱᲈᛷ;->ᛵᛸᛸᛷ:F

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    cmpl-float v0, v0, v1

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lyyds/ᛷᛱᲈᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛵᲈᛵ;

    .line 13
    .line 14
    invoke-virtual {p0}, Lyyds/ᲁᛵᲈᛵ;->ᲇᲈᛵᛷ()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public final ᛲᲈᲁ(Lyyds/ᲁᛸᛶᲈ;I)V
    .locals 2

    .line 1
    invoke-virtual {p1, p2}, Lyyds/ᲁᛸᛶᲈ;->ᛷᲈᲈᲁ(I)Lyyds/ᛴᲇᛲᛷ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᛷᛱᲈᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛵᲈᛵ;

    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, Lyyds/ᲁᛵᲈᛵ;->ᛶᛷᛲᲁ(Lyyds/ᛴᲇᛲᛷ;F)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, p2}, Lyyds/ᲁᛸᛶᲈ;->ᛷᲈᲈᲁ(I)Lyyds/ᛴᲇᛲᛷ;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/high16 p2, -0x40800000    # -1.0f

    .line 17
    .line 18
    invoke-virtual {p0, p1, p2}, Lyyds/ᲁᛵᲈᛵ;->ᛶᛷᛲᲁ(Lyyds/ᛴᲇᛲᛷ;F)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final ᛵᛸᛸᛷ(Lyyds/ᛴᲇᛲᛷ;Lyyds/ᛴᲇᛲᛷ;Lyyds/ᛴᲇᛲᛷ;I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p4, :cond_1

    .line 3
    .line 4
    if-gez p4, :cond_0

    .line 5
    .line 6
    mul-int/lit8 p4, p4, -0x1

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    :cond_0
    int-to-float p4, p4

    .line 10
    iput p4, p0, Lyyds/ᛷᛱᲈᛷ;->ᛵᛸᛸᛷ:F

    .line 11
    .line 12
    :cond_1
    iget-object p0, p0, Lyyds/ᛷᛱᲈᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛵᲈᛵ;

    .line 13
    .line 14
    const/high16 p4, 0x3f800000    # 1.0f

    .line 15
    .line 16
    const/high16 v1, -0x40800000    # -1.0f

    .line 17
    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0, p1, v1}, Lyyds/ᲁᛵᲈᛵ;->ᛶᛷᛲᲁ(Lyyds/ᛴᲇᛲᛷ;F)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p2, p4}, Lyyds/ᲁᛵᲈᛵ;->ᛶᛷᛲᲁ(Lyyds/ᛴᲇᛲᛷ;F)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p3, p4}, Lyyds/ᲁᛵᲈᛵ;->ᛶᛷᛲᲁ(Lyyds/ᛴᲇᛲᛷ;F)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_2
    invoke-virtual {p0, p1, p4}, Lyyds/ᲁᛵᲈᛵ;->ᛶᛷᛲᲁ(Lyyds/ᛴᲇᛲᛷ;F)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p2, v1}, Lyyds/ᲁᛵᲈᛵ;->ᛶᛷᛲᲁ(Lyyds/ᛴᲇᛲᛷ;F)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p3, v1}, Lyyds/ᲁᛵᲈᛵ;->ᛶᛷᛲᲁ(Lyyds/ᛴᲇᛲᛷ;F)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final ᛶᛷᛲᲁ(Lyyds/ᛴᲇᛲᛷ;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lyyds/ᛷᛱᲈᛷ;->ᛲᲈᲁ:Lyyds/ᛴᲇᛲᛷ;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    iget-object v2, p0, Lyyds/ᛷᛱᲈᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛵᲈᛵ;

    .line 5
    .line 6
    const/high16 v3, -0x40800000    # -1.0f

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v2, v0, v3}, Lyyds/ᲁᛵᲈᛵ;->ᛶᛷᛲᲁ(Lyyds/ᛴᲇᛲᛷ;F)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lyyds/ᛷᛱᲈᛷ;->ᛲᲈᲁ:Lyyds/ᛴᲇᛲᛷ;

    .line 14
    .line 15
    iput v1, v0, Lyyds/ᛴᲇᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lyyds/ᛷᛱᲈᛷ;->ᛲᲈᲁ:Lyyds/ᛴᲇᛲᛷ;

    .line 19
    .line 20
    :cond_0
    const/4 v0, 0x1

    .line 21
    invoke-virtual {v2, p1, v0}, Lyyds/ᲁᛵᲈᛵ;->ᛱᲈᲁ(Lyyds/ᛴᲇᛲᛷ;Z)F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    mul-float/2addr v0, v3

    .line 26
    iput-object p1, p0, Lyyds/ᛷᛱᲈᛷ;->ᛲᲈᲁ:Lyyds/ᛴᲇᛲᛷ;

    .line 27
    .line 28
    const/high16 p1, 0x3f800000    # 1.0f

    .line 29
    .line 30
    cmpl-float p1, v0, p1

    .line 31
    .line 32
    if-nez p1, :cond_1

    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    iget p1, p0, Lyyds/ᛷᛱᲈᛷ;->ᛵᛸᛸᛷ:F

    .line 36
    .line 37
    div-float/2addr p1, v0

    .line 38
    iput p1, p0, Lyyds/ᛷᛱᲈᛷ;->ᛵᛸᛸᛷ:F

    .line 39
    .line 40
    iget p0, v2, Lyyds/ᲁᛵᲈᛵ;->ᛱᲈᲁ:I

    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    :goto_0
    if-eq p0, v1, :cond_2

    .line 44
    .line 45
    iget v3, v2, Lyyds/ᲁᛵᲈᛵ;->ᛲᲈᲁ:I

    .line 46
    .line 47
    if-ge p1, v3, :cond_2

    .line 48
    .line 49
    iget-object v3, v2, Lyyds/ᲁᛵᲈᛵ;->ᛶᛷᛲᲁ:[F

    .line 50
    .line 51
    aget v4, v3, p0

    .line 52
    .line 53
    div-float/2addr v4, v0

    .line 54
    aput v4, v3, p0

    .line 55
    .line 56
    iget-object v3, v2, Lyyds/ᲁᛵᲈᛵ;->ᲇᲇᲇᛱ:[I

    .line 57
    .line 58
    aget p0, v3, p0

    .line 59
    .line 60
    add-int/lit8 p1, p1, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    return-void
.end method

.method public final ᲀᛲᛳᲀ(Lyyds/ᛴᲇᛲᛷ;Lyyds/ᛴᲇᛲᛷ;Lyyds/ᛴᲇᛲᛷ;I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p4, :cond_1

    .line 3
    .line 4
    if-gez p4, :cond_0

    .line 5
    .line 6
    mul-int/lit8 p4, p4, -0x1

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    :cond_0
    int-to-float p4, p4

    .line 10
    iput p4, p0, Lyyds/ᛷᛱᲈᛷ;->ᛵᛸᛸᛷ:F

    .line 11
    .line 12
    :cond_1
    iget-object p0, p0, Lyyds/ᛷᛱᲈᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛵᲈᛵ;

    .line 13
    .line 14
    const/high16 p4, 0x3f800000    # 1.0f

    .line 15
    .line 16
    const/high16 v1, -0x40800000    # -1.0f

    .line 17
    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0, p1, v1}, Lyyds/ᲁᛵᲈᛵ;->ᛶᛷᛲᲁ(Lyyds/ᛴᲇᛲᛷ;F)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p2, p4}, Lyyds/ᲁᛵᲈᛵ;->ᛶᛷᛲᲁ(Lyyds/ᛴᲇᛲᛷ;F)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p3, v1}, Lyyds/ᲁᛵᲈᛵ;->ᛶᛷᛲᲁ(Lyyds/ᛴᲇᛲᛷ;F)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_2
    invoke-virtual {p0, p1, p4}, Lyyds/ᲁᛵᲈᛵ;->ᛶᛷᛲᲁ(Lyyds/ᛴᲇᛲᛷ;F)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p2, v1}, Lyyds/ᲁᛵᲈᛵ;->ᛶᛷᛲᲁ(Lyyds/ᛴᲇᛲᛷ;F)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p3, p4}, Lyyds/ᲁᛵᲈᛵ;->ᛶᛷᛲᲁ(Lyyds/ᛴᲇᛲᛷ;F)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final ᲇᲇᲇᛱ([ZLyyds/ᛴᲇᛲᛷ;)Lyyds/ᛴᲇᛲᛷ;
    .locals 9

    .line 1
    iget-object p0, p0, Lyyds/ᛷᛱᲈᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛵᲈᛵ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᲁᛵᲈᛵ;->ᲇᲈᛵᛷ()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    move v4, v1

    .line 11
    :goto_0
    if-ge v3, v0, :cond_3

    .line 12
    .line 13
    invoke-virtual {p0, v3}, Lyyds/ᲁᛵᲈᛵ;->ᲇᲇᲇᛱ(I)F

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    cmpg-float v6, v5, v1

    .line 18
    .line 19
    if-gez v6, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, v3}, Lyyds/ᲁᛵᲈᛵ;->ᛲᛴᛳᛲ(I)Lyyds/ᛴᲇᛲᛷ;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    iget v7, v6, Lyyds/ᛴᲇᛲᛷ;->ᲇᲈᛵᛷ:I

    .line 28
    .line 29
    aget-boolean v7, p1, v7

    .line 30
    .line 31
    if-nez v7, :cond_2

    .line 32
    .line 33
    :cond_0
    if-eq v6, p2, :cond_2

    .line 34
    .line 35
    iget v7, v6, Lyyds/ᛴᲇᛲᛷ;->ᛱᛳᲇ:I

    .line 36
    .line 37
    const/4 v8, 0x3

    .line 38
    if-eq v7, v8, :cond_1

    .line 39
    .line 40
    const/4 v8, 0x4

    .line 41
    if-ne v7, v8, :cond_2

    .line 42
    .line 43
    :cond_1
    cmpg-float v7, v5, v4

    .line 44
    .line 45
    if-gez v7, :cond_2

    .line 46
    .line 47
    move v4, v5

    .line 48
    move-object v2, v6

    .line 49
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    return-object v2
.end method

.method public ᲇᲈᛵᛷ([Z)Lyyds/ᛴᲇᛲᛷ;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lyyds/ᛷᛱᲈᛷ;->ᲇᲇᲇᛱ([ZLyyds/ᛴᲇᛲᛷ;)Lyyds/ᛴᲇᛲᛷ;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method
