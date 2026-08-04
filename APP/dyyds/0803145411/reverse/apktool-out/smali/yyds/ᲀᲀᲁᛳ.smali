.class public final Lyyds/ᲀᲀᲁᛳ;
.super Lyyds/ᛴᲀᲈᛲ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᛵᛳᛳ:I

.field public ᛱᛵᲈᛸ:F

.field public ᛵᛵᛷᲀ:I

.field public ᛸᲇᛱᲇ:Lyyds/ᲀᲈᲁᛲ;

.field public ᛸᲇᛴᲀ:Z

.field public ᲁᲀᛱᛴ:I


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lyyds/ᛴᲀᲈᛲ;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, -0x40800000    # -1.0f

    .line 5
    .line 6
    iput v0, p0, Lyyds/ᲀᲀᲁᛳ;->ᛱᛵᲈᛸ:F

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    iput v0, p0, Lyyds/ᲀᲀᲁᛳ;->ᛱᛵᛳᛳ:I

    .line 10
    .line 11
    iput v0, p0, Lyyds/ᲀᲀᲁᛳ;->ᛵᛵᛷᲀ:I

    .line 12
    .line 13
    iget-object v0, p0, Lyyds/ᛴᲀᲈᛲ;->ᲈᛷᲈᛶ:Lyyds/ᲀᲈᲁᛲ;

    .line 14
    .line 15
    iput-object v0, p0, Lyyds/ᲀᲀᲁᛳ;->ᛸᲇᛱᲇ:Lyyds/ᲀᲈᲁᛲ;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput v0, p0, Lyyds/ᲀᲀᲁᛳ;->ᲁᲀᛱᛴ:I

    .line 19
    .line 20
    iget-object v1, p0, Lyyds/ᛴᲀᲈᛲ;->ᛲᲀᛲᛲ:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lyyds/ᛴᲀᲈᛲ;->ᛲᲀᛲᛲ:Ljava/util/ArrayList;

    .line 26
    .line 27
    iget-object v2, p0, Lyyds/ᲀᲀᲁᛳ;->ᛸᲇᛱᲇ:Lyyds/ᲀᲈᲁᛲ;

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lyyds/ᛴᲀᲈᛲ;->ᛷᛴᛴᲁ:[Lyyds/ᲀᲈᲁᛲ;

    .line 33
    .line 34
    array-length v1, v1

    .line 35
    :goto_0
    if-ge v0, v1, :cond_0

    .line 36
    .line 37
    iget-object v2, p0, Lyyds/ᛴᲀᲈᛲ;->ᛷᛴᛴᲁ:[Lyyds/ᲀᲈᲁᛲ;

    .line 38
    .line 39
    iget-object v3, p0, Lyyds/ᲀᲀᲁᛳ;->ᛸᲇᛱᲇ:Lyyds/ᲀᲈᲁᛲ;

    .line 40
    .line 41
    aput-object v3, v2, v0

    .line 42
    .line 43
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    return-void
.end method


# virtual methods
.method public final ᛲᲀᛵᛷ(I)V
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᲀᲀᲁᛳ;->ᲁᲀᛱᛴ:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    iput p1, p0, Lyyds/ᲀᲀᲁᛳ;->ᲁᲀᛱᛴ:I

    .line 7
    .line 8
    iget-object p1, p0, Lyyds/ᛴᲀᲈᛲ;->ᛲᲀᛲᛲ:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 11
    .line 12
    .line 13
    iget v0, p0, Lyyds/ᲀᲀᲁᛳ;->ᲁᲀᛱᛴ:I

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lyyds/ᛴᲀᲈᛲ;->ᛷᲇᛲᛱ:Lyyds/ᲀᲈᲁᛲ;

    .line 19
    .line 20
    iput-object v0, p0, Lyyds/ᲀᲀᲁᛳ;->ᛸᲇᛱᲇ:Lyyds/ᲀᲈᲁᛲ;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-object v0, p0, Lyyds/ᛴᲀᲈᛲ;->ᲈᛷᲈᛶ:Lyyds/ᲀᲈᲁᛲ;

    .line 24
    .line 25
    iput-object v0, p0, Lyyds/ᲀᲀᲁᛳ;->ᛸᲇᛱᲇ:Lyyds/ᲀᲈᲁᛲ;

    .line 26
    .line 27
    :goto_0
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lyyds/ᛴᲀᲈᛲ;->ᛷᛴᛴᲁ:[Lyyds/ᲀᲈᲁᛲ;

    .line 31
    .line 32
    array-length v0, p1

    .line 33
    const/4 v1, 0x0

    .line 34
    :goto_1
    if-ge v1, v0, :cond_2

    .line 35
    .line 36
    iget-object v2, p0, Lyyds/ᲀᲀᲁᛳ;->ᛸᲇᛱᲇ:Lyyds/ᲀᲈᲁᛲ;

    .line 37
    .line 38
    aput-object v2, p1, v1

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_2
    return-void
.end method

.method public final ᛵᛸᛸᛷ(Lyyds/ᲁᛸᛶᲈ;Z)V
    .locals 8

    .line 1
    iget-object p2, p0, Lyyds/ᛴᲀᲈᛲ;->ᛱᲀᲈᛲ:Lyyds/ᛴᛵᛷᛴ;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto/16 :goto_3

    .line 6
    .line 7
    :cond_0
    const/4 v0, 0x2

    .line 8
    invoke-virtual {p2, v0}, Lyyds/ᛴᲀᲈᛲ;->ᛶᛷᛲᲁ(I)Lyyds/ᲀᲈᲁᛲ;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x4

    .line 13
    invoke-virtual {p2, v2}, Lyyds/ᛴᲀᲈᛲ;->ᛶᛷᛲᲁ(I)Lyyds/ᲀᲈᲁᛲ;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v3, p0, Lyyds/ᛴᲀᲈᛲ;->ᛱᲀᲈᛲ:Lyyds/ᛴᛵᛷᛴ;

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    const/4 v5, 0x0

    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    iget-object v3, v3, Lyyds/ᛴᲀᲈᛲ;->ᲈᛲᛳᛶ:[I

    .line 24
    .line 25
    aget v3, v3, v5

    .line 26
    .line 27
    if-ne v3, v0, :cond_1

    .line 28
    .line 29
    move v3, v4

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move v3, v5

    .line 32
    :goto_0
    iget v6, p0, Lyyds/ᲀᲀᲁᛳ;->ᲁᲀᛱᛴ:I

    .line 33
    .line 34
    const/4 v7, 0x5

    .line 35
    if-nez v6, :cond_3

    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    invoke-virtual {p2, v1}, Lyyds/ᛴᲀᲈᛲ;->ᛶᛷᛲᲁ(I)Lyyds/ᲀᲈᲁᛲ;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {p2, v7}, Lyyds/ᛴᲀᲈᛲ;->ᛶᛷᛲᲁ(I)Lyyds/ᲀᲈᲁᛲ;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iget-object p2, p0, Lyyds/ᛴᲀᲈᛲ;->ᛱᲀᲈᛲ:Lyyds/ᛴᛵᛷᛴ;

    .line 47
    .line 48
    if-eqz p2, :cond_2

    .line 49
    .line 50
    iget-object p2, p2, Lyyds/ᛴᲀᲈᛲ;->ᲈᛲᛳᛶ:[I

    .line 51
    .line 52
    aget p2, p2, v4

    .line 53
    .line 54
    if-ne p2, v0, :cond_2

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    move v4, v5

    .line 58
    :goto_1
    move v3, v4

    .line 59
    :cond_3
    iget-boolean p2, p0, Lyyds/ᲀᲀᲁᛳ;->ᛸᲇᛴᲀ:Z

    .line 60
    .line 61
    const/4 v0, -0x1

    .line 62
    if-eqz p2, :cond_6

    .line 63
    .line 64
    iget-object p2, p0, Lyyds/ᲀᲀᲁᛳ;->ᛸᲇᛱᲇ:Lyyds/ᲀᲈᲁᛲ;

    .line 65
    .line 66
    iget-boolean v4, p2, Lyyds/ᲀᲈᲁᛲ;->ᲀᛲᛳᲀ:Z

    .line 67
    .line 68
    if-eqz v4, :cond_6

    .line 69
    .line 70
    invoke-virtual {p1, p2}, Lyyds/ᲁᛸᛶᲈ;->ᛷᛲᲈᛱ(Ljava/lang/Object;)Lyyds/ᛴᲇᛲᛷ;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    iget-object v4, p0, Lyyds/ᲀᲀᲁᛳ;->ᛸᲇᛱᲇ:Lyyds/ᲀᲈᲁᛲ;

    .line 75
    .line 76
    invoke-virtual {v4}, Lyyds/ᲀᲈᲁᛲ;->ᲀᛲᛳᲀ()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    invoke-virtual {p1, p2, v4}, Lyyds/ᲁᛸᛶᲈ;->ᲇᲈᛵᛷ(Lyyds/ᛴᲇᛲᛷ;I)V

    .line 81
    .line 82
    .line 83
    iget v4, p0, Lyyds/ᲀᲀᲁᛳ;->ᛱᛵᛳᛳ:I

    .line 84
    .line 85
    if-eq v4, v0, :cond_4

    .line 86
    .line 87
    if-eqz v3, :cond_5

    .line 88
    .line 89
    invoke-virtual {p1, v2}, Lyyds/ᲁᛸᛶᲈ;->ᛷᛲᲈᛱ(Ljava/lang/Object;)Lyyds/ᛴᲇᛲᛷ;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {p1, v0, p2, v5, v7}, Lyyds/ᲁᛸᛶᲈ;->ᲇᲇᲇᛱ(Lyyds/ᛴᲇᛲᛷ;Lyyds/ᛴᲇᛲᛷ;II)V

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_4
    iget v4, p0, Lyyds/ᲀᲀᲁᛳ;->ᛵᛵᛷᲀ:I

    .line 98
    .line 99
    if-eq v4, v0, :cond_5

    .line 100
    .line 101
    if-eqz v3, :cond_5

    .line 102
    .line 103
    invoke-virtual {p1, v2}, Lyyds/ᲁᛸᛶᲈ;->ᛷᛲᲈᛱ(Ljava/lang/Object;)Lyyds/ᛴᲇᛲᛷ;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {p1, v1}, Lyyds/ᲁᛸᛶᲈ;->ᛷᛲᲈᛱ(Ljava/lang/Object;)Lyyds/ᛴᲇᛲᛷ;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {p1, p2, v1, v5, v7}, Lyyds/ᲁᛸᛶᲈ;->ᲇᲇᲇᛱ(Lyyds/ᛴᲇᛲᛷ;Lyyds/ᛴᲇᛲᛷ;II)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v0, p2, v5, v7}, Lyyds/ᲁᛸᛶᲈ;->ᲇᲇᲇᛱ(Lyyds/ᛴᲇᛲᛷ;Lyyds/ᛴᲇᛲᛷ;II)V

    .line 115
    .line 116
    .line 117
    :cond_5
    :goto_2
    iput-boolean v5, p0, Lyyds/ᲀᲀᲁᛳ;->ᛸᲇᛴᲀ:Z

    .line 118
    .line 119
    return-void

    .line 120
    :cond_6
    iget p2, p0, Lyyds/ᲀᲀᲁᛳ;->ᛱᛵᛳᛳ:I

    .line 121
    .line 122
    const/16 v4, 0x8

    .line 123
    .line 124
    if-eq p2, v0, :cond_7

    .line 125
    .line 126
    iget-object p2, p0, Lyyds/ᲀᲀᲁᛳ;->ᛸᲇᛱᲇ:Lyyds/ᲀᲈᲁᛲ;

    .line 127
    .line 128
    invoke-virtual {p1, p2}, Lyyds/ᲁᛸᛶᲈ;->ᛷᛲᲈᛱ(Ljava/lang/Object;)Lyyds/ᛴᲇᛲᛷ;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    invoke-virtual {p1, v1}, Lyyds/ᲁᛸᛶᲈ;->ᛷᛲᲈᛱ(Ljava/lang/Object;)Lyyds/ᛴᲇᛲᛷ;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    iget p0, p0, Lyyds/ᲀᲀᲁᛳ;->ᛱᛵᛳᛳ:I

    .line 137
    .line 138
    invoke-virtual {p1, p2, v0, p0, v4}, Lyyds/ᲁᛸᛶᲈ;->ᛲᛴᛳᛲ(Lyyds/ᛴᲇᛲᛷ;Lyyds/ᛴᲇᛲᛷ;II)V

    .line 139
    .line 140
    .line 141
    if-eqz v3, :cond_9

    .line 142
    .line 143
    invoke-virtual {p1, v2}, Lyyds/ᲁᛸᛶᲈ;->ᛷᛲᲈᛱ(Ljava/lang/Object;)Lyyds/ᛴᲇᛲᛷ;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-virtual {p1, p0, p2, v5, v7}, Lyyds/ᲁᛸᛶᲈ;->ᲇᲇᲇᛱ(Lyyds/ᛴᲇᛲᛷ;Lyyds/ᛴᲇᛲᛷ;II)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :cond_7
    iget p2, p0, Lyyds/ᲀᲀᲁᛳ;->ᛵᛵᛷᲀ:I

    .line 152
    .line 153
    if-eq p2, v0, :cond_8

    .line 154
    .line 155
    iget-object p2, p0, Lyyds/ᲀᲀᲁᛳ;->ᛸᲇᛱᲇ:Lyyds/ᲀᲈᲁᛲ;

    .line 156
    .line 157
    invoke-virtual {p1, p2}, Lyyds/ᲁᛸᛶᲈ;->ᛷᛲᲈᛱ(Ljava/lang/Object;)Lyyds/ᛴᲇᛲᛷ;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    invoke-virtual {p1, v2}, Lyyds/ᲁᛸᛶᲈ;->ᛷᛲᲈᛱ(Ljava/lang/Object;)Lyyds/ᛴᲇᛲᛷ;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    iget p0, p0, Lyyds/ᲀᲀᲁᛳ;->ᛵᛵᛷᲀ:I

    .line 166
    .line 167
    neg-int p0, p0

    .line 168
    invoke-virtual {p1, p2, v0, p0, v4}, Lyyds/ᲁᛸᛶᲈ;->ᛲᛴᛳᛲ(Lyyds/ᛴᲇᛲᛷ;Lyyds/ᛴᲇᛲᛷ;II)V

    .line 169
    .line 170
    .line 171
    if-eqz v3, :cond_9

    .line 172
    .line 173
    invoke-virtual {p1, v1}, Lyyds/ᲁᛸᛶᲈ;->ᛷᛲᲈᛱ(Ljava/lang/Object;)Lyyds/ᛴᲇᛲᛷ;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-virtual {p1, p2, p0, v5, v7}, Lyyds/ᲁᛸᛶᲈ;->ᲇᲇᲇᛱ(Lyyds/ᛴᲇᛲᛷ;Lyyds/ᛴᲇᛲᛷ;II)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1, v0, p2, v5, v7}, Lyyds/ᲁᛸᛶᲈ;->ᲇᲇᲇᛱ(Lyyds/ᛴᲇᛲᛷ;Lyyds/ᛴᲇᛲᛷ;II)V

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :cond_8
    iget p2, p0, Lyyds/ᲀᲀᲁᛳ;->ᛱᛵᲈᛸ:F

    .line 185
    .line 186
    const/high16 v0, -0x40800000    # -1.0f

    .line 187
    .line 188
    cmpl-float p2, p2, v0

    .line 189
    .line 190
    if-eqz p2, :cond_9

    .line 191
    .line 192
    iget-object p2, p0, Lyyds/ᲀᲀᲁᛳ;->ᛸᲇᛱᲇ:Lyyds/ᲀᲈᲁᛲ;

    .line 193
    .line 194
    invoke-virtual {p1, p2}, Lyyds/ᲁᛸᛶᲈ;->ᛷᛲᲈᛱ(Ljava/lang/Object;)Lyyds/ᛴᲇᛲᛷ;

    .line 195
    .line 196
    .line 197
    move-result-object p2

    .line 198
    invoke-virtual {p1, v2}, Lyyds/ᲁᛸᛶᲈ;->ᛷᛲᲈᛱ(Ljava/lang/Object;)Lyyds/ᛴᲇᛲᛷ;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    iget p0, p0, Lyyds/ᲀᲀᲁᛳ;->ᛱᛵᲈᛸ:F

    .line 203
    .line 204
    invoke-virtual {p1}, Lyyds/ᲁᛸᛶᲈ;->ᛷᛵᲇᲀ()Lyyds/ᛷᛱᲈᛷ;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    iget-object v3, v2, Lyyds/ᛷᛱᲈᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛵᲈᛵ;

    .line 209
    .line 210
    invoke-virtual {v3, p2, v0}, Lyyds/ᲁᛵᲈᛵ;->ᛶᛷᛲᲁ(Lyyds/ᛴᲇᛲᛷ;F)V

    .line 211
    .line 212
    .line 213
    iget-object p2, v2, Lyyds/ᛷᛱᲈᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛵᲈᛵ;

    .line 214
    .line 215
    invoke-virtual {p2, v1, p0}, Lyyds/ᲁᛵᲈᛵ;->ᛶᛷᛲᲁ(Lyyds/ᛴᲇᛲᛷ;F)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p1, v2}, Lyyds/ᲁᛸᛶᲈ;->ᲀᛲᛳᲀ(Lyyds/ᛷᛱᲈᛷ;)V

    .line 219
    .line 220
    .line 221
    :cond_9
    :goto_3
    return-void
.end method

.method public final ᛵᲀᛵᛸ()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lyyds/ᲀᲀᲁᛳ;->ᛸᲇᛴᲀ:Z

    .line 2
    .line 3
    return p0
.end method

.method public final ᛶᛷᛲᲁ(I)Lyyds/ᲀᲈᲁᛲ;
    .locals 2

    .line 1
    invoke-static {p1}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eq p1, v0, :cond_1

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-eq p1, v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    if-eq p1, v1, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x4

    .line 15
    if-eq p1, v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget p1, p0, Lyyds/ᲀᲀᲁᛳ;->ᲁᲀᛱᛴ:I

    .line 19
    .line 20
    if-nez p1, :cond_2

    .line 21
    .line 22
    iget-object p0, p0, Lyyds/ᲀᲀᲁᛳ;->ᛸᲇᛱᲇ:Lyyds/ᲀᲈᲁᛲ;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    iget p1, p0, Lyyds/ᲀᲀᲁᛳ;->ᲁᲀᛱᛴ:I

    .line 26
    .line 27
    if-ne p1, v0, :cond_2

    .line 28
    .line 29
    iget-object p0, p0, Lyyds/ᲀᲀᲁᛳ;->ᛸᲇᛱᲇ:Lyyds/ᲀᲈᲁᛲ;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public final ᛶᲀᲈᲇ(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᲀᲀᲁᛳ;->ᛸᲇᛱᲇ:Lyyds/ᲀᲈᲁᛲ;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lyyds/ᲀᲈᲁᛲ;->ᛲᛳᛶᲁ(I)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lyyds/ᲀᲀᲁᛳ;->ᛸᲇᛴᲀ:Z

    .line 8
    .line 9
    return-void
.end method

.method public final ᲀᛲᛳᲀ()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final ᲁᛶᛴᛸ(Lyyds/ᲁᛸᛶᲈ;Z)V
    .locals 2

    .line 1
    iget-object p2, p0, Lyyds/ᛴᲀᲈᛲ;->ᛱᲀᲈᛲ:Lyyds/ᛴᛵᛷᛴ;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object p2, p0, Lyyds/ᲀᲀᲁᛳ;->ᛸᲇᛱᲇ:Lyyds/ᲀᲈᲁᛲ;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, Lyyds/ᲁᛸᛶᲈ;->ᛱᛳᲇ(Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iget p2, p0, Lyyds/ᲀᲀᲁᛳ;->ᲁᲀᛱᛴ:I

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    const/4 v1, 0x0

    .line 19
    if-ne p2, v0, :cond_1

    .line 20
    .line 21
    iput p1, p0, Lyyds/ᛴᲀᲈᛲ;->ᛶᛵᛸᛲ:I

    .line 22
    .line 23
    iput v1, p0, Lyyds/ᛴᲀᲈᛲ;->ᛳᛴᲇᛶ:I

    .line 24
    .line 25
    iget-object p1, p0, Lyyds/ᛴᲀᲈᛲ;->ᛱᲀᲈᛲ:Lyyds/ᛴᛵᛷᛴ;

    .line 26
    .line 27
    invoke-virtual {p1}, Lyyds/ᛴᲀᲈᛲ;->ᛲᛳᛶᲁ()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-virtual {p0, p1}, Lyyds/ᛴᲀᲈᛲ;->ᛷᲇᛲᛱ(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v1}, Lyyds/ᛴᲀᲈᛲ;->ᛱᛸᲁᲇ(I)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    iput v1, p0, Lyyds/ᛴᲀᲈᛲ;->ᛶᛵᛸᛲ:I

    .line 39
    .line 40
    iput p1, p0, Lyyds/ᛴᲀᲈᛲ;->ᛳᛴᲇᛶ:I

    .line 41
    .line 42
    iget-object p1, p0, Lyyds/ᛴᲀᲈᛲ;->ᛱᲀᲈᛲ:Lyyds/ᛴᛵᛷᛴ;

    .line 43
    .line 44
    invoke-virtual {p1}, Lyyds/ᛴᲀᲈᛲ;->ᛳᲁᲁᲇ()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-virtual {p0, p1}, Lyyds/ᛴᲀᲈᛲ;->ᛱᛸᲁᲇ(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v1}, Lyyds/ᛴᲀᲈᛲ;->ᛷᲇᛲᛱ(I)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final ᲈᲀᛲᲀ()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lyyds/ᲀᲀᲁᛳ;->ᛸᲇᛴᲀ:Z

    .line 2
    .line 3
    return p0
.end method
