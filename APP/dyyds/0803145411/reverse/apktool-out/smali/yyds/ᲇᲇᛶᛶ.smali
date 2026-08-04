.class public final Lyyds/ᲇᲇᛶᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public final ᛲᲈᲁ:I

.field public ᛵᛸᛸᛷ:I

.field public final ᛶᛷᛲᲁ:Ljava/lang/Object;

.field public final ᲀᛲᛳᲀ:Z

.field public final ᲇᲇᲇᛱ:Ljava/lang/Object;

.field public final ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lyyds/ᛱᛱᛴ;Ljava/util/ArrayList;[I[I)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lyyds/ᲇᲇᛶᛶ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p3, p0, Lyyds/ᲇᲇᛶᛶ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p4, p0, Lyyds/ᲇᲇᛶᛶ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-static {p3, v0}, Ljava/util/Arrays;->fill([II)V

    .line 12
    .line 13
    .line 14
    invoke-static {p4, v0}, Ljava/util/Arrays;->fill([II)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lyyds/ᲇᲇᛶᛶ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v1, p1, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lyyds/ᛴᛸᛴᛶ;

    .line 22
    .line 23
    iget-object v2, v1, Lyyds/ᛴᛸᛴᛶ;->ᲀᛲᛳᲀ:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iput v2, p0, Lyyds/ᲇᲇᛶᛶ;->ᛲᲈᲁ:I

    .line 30
    .line 31
    iget-object v1, v1, Lyyds/ᛴᛸᛴᛶ;->ᲇᲈᛵᛷ:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    iput v1, p0, Lyyds/ᲇᲇᛶᛶ;->ᛵᛸᛸᛷ:I

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    iput-boolean v3, p0, Lyyds/ᲇᲇᛶᛶ;->ᲀᛲᛳᲀ:Z

    .line 41
    .line 42
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_0

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, Lyyds/ᛵᛷᛳᛶ;

    .line 55
    .line 56
    :goto_0
    if-eqz v4, :cond_1

    .line 57
    .line 58
    iget v5, v4, Lyyds/ᛵᛷᛳᛶ;->ᛲᲈᲁ:I

    .line 59
    .line 60
    if-nez v5, :cond_1

    .line 61
    .line 62
    iget v4, v4, Lyyds/ᛵᛷᛳᛶ;->ᛵᛸᛸᛷ:I

    .line 63
    .line 64
    if-eqz v4, :cond_2

    .line 65
    .line 66
    :cond_1
    new-instance v4, Lyyds/ᛵᛷᛳᛶ;

    .line 67
    .line 68
    invoke-direct {v4, v0, v0, v0}, Lyyds/ᛵᛷᛳᛶ;-><init>(III)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2, v0, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    new-instance v4, Lyyds/ᛵᛷᛳᛶ;

    .line 75
    .line 76
    invoke-direct {v4, v2, v1, v0}, Lyyds/ᛵᛷᛳᛶ;-><init>(III)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eqz v2, :cond_5

    .line 91
    .line 92
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    check-cast v2, Lyyds/ᛵᛷᛳᛶ;

    .line 97
    .line 98
    move v4, v0

    .line 99
    :goto_1
    iget v5, v2, Lyyds/ᛵᛷᛳᛶ;->ᲀᛲᛳᲀ:I

    .line 100
    .line 101
    if-ge v4, v5, :cond_3

    .line 102
    .line 103
    iget v5, v2, Lyyds/ᛵᛷᛳᛶ;->ᛲᲈᲁ:I

    .line 104
    .line 105
    add-int/2addr v5, v4

    .line 106
    iget v6, v2, Lyyds/ᛵᛷᛳᛶ;->ᛵᛸᛸᛷ:I

    .line 107
    .line 108
    add-int/2addr v6, v4

    .line 109
    invoke-virtual {p1, v5, v6}, Lyyds/ᛱᛱᛴ;->ᛳᛸᛴᛶ(II)Z

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    if-eqz v7, :cond_4

    .line 114
    .line 115
    move v7, v3

    .line 116
    goto :goto_2

    .line 117
    :cond_4
    const/4 v7, 0x2

    .line 118
    :goto_2
    shl-int/lit8 v8, v6, 0x4

    .line 119
    .line 120
    or-int/2addr v8, v7

    .line 121
    aput v8, p3, v5

    .line 122
    .line 123
    shl-int/lit8 v5, v5, 0x4

    .line 124
    .line 125
    or-int/2addr v5, v7

    .line 126
    aput v5, p4, v6

    .line 127
    .line 128
    add-int/lit8 v4, v4, 0x1

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_5
    iget-boolean p0, p0, Lyyds/ᲇᲇᛶᛶ;->ᲀᛲᛳᲀ:Z

    .line 132
    .line 133
    if-eqz p0, :cond_b

    .line 134
    .line 135
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    move v1, v0

    .line 140
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    if-eqz v2, :cond_b

    .line 145
    .line 146
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    check-cast v2, Lyyds/ᛵᛷᛳᛶ;

    .line 151
    .line 152
    :goto_4
    iget v3, v2, Lyyds/ᛵᛷᛳᛶ;->ᛲᲈᲁ:I

    .line 153
    .line 154
    if-ge v1, v3, :cond_a

    .line 155
    .line 156
    aget v3, p3, v1

    .line 157
    .line 158
    if-nez v3, :cond_9

    .line 159
    .line 160
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    move v4, v0

    .line 165
    move v5, v4

    .line 166
    :goto_5
    if-ge v4, v3, :cond_9

    .line 167
    .line 168
    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    check-cast v6, Lyyds/ᛵᛷᛳᛶ;

    .line 173
    .line 174
    :goto_6
    iget v7, v6, Lyyds/ᛵᛷᛳᛶ;->ᛵᛸᛸᛷ:I

    .line 175
    .line 176
    if-ge v5, v7, :cond_8

    .line 177
    .line 178
    aget v7, p4, v5

    .line 179
    .line 180
    if-nez v7, :cond_7

    .line 181
    .line 182
    invoke-virtual {p1, v1, v5}, Lyyds/ᛱᛱᛴ;->ᛶᲈᛴᲈ(II)Z

    .line 183
    .line 184
    .line 185
    move-result v7

    .line 186
    if-eqz v7, :cond_7

    .line 187
    .line 188
    invoke-virtual {p1, v1, v5}, Lyyds/ᛱᛱᛴ;->ᛳᛸᛴᛶ(II)Z

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    if-eqz v3, :cond_6

    .line 193
    .line 194
    const/16 v3, 0x8

    .line 195
    .line 196
    goto :goto_7

    .line 197
    :cond_6
    const/4 v3, 0x4

    .line 198
    :goto_7
    shl-int/lit8 v4, v5, 0x4

    .line 199
    .line 200
    or-int/2addr v4, v3

    .line 201
    aput v4, p3, v1

    .line 202
    .line 203
    shl-int/lit8 v4, v1, 0x4

    .line 204
    .line 205
    or-int/2addr v3, v4

    .line 206
    aput v3, p4, v5

    .line 207
    .line 208
    goto :goto_8

    .line 209
    :cond_7
    add-int/lit8 v5, v5, 0x1

    .line 210
    .line 211
    goto :goto_6

    .line 212
    :cond_8
    iget v5, v6, Lyyds/ᛵᛷᛳᛶ;->ᲀᛲᛳᲀ:I

    .line 213
    .line 214
    add-int/2addr v5, v7

    .line 215
    add-int/lit8 v4, v4, 0x1

    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_9
    :goto_8
    add-int/lit8 v1, v1, 0x1

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_a
    iget v1, v2, Lyyds/ᛵᛷᛳᛶ;->ᲀᛲᛳᲀ:I

    .line 222
    .line 223
    add-int/2addr v1, v3

    .line 224
    goto :goto_3

    .line 225
    :cond_b
    return-void
.end method

.method public constructor <init>(Lyyds/ᛶᲇᛸᛱ;ZLyyds/ᲇᲇᛳᛴ;Lyyds/ᲇᲇᛶᛶ;)V
    .locals 0

    .line 226
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 227
    iput-object p1, p0, Lyyds/ᲇᲇᛶᛶ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 228
    iput-boolean p2, p0, Lyyds/ᲇᲇᛶᛶ;->ᲀᛲᛳᲀ:Z

    .line 229
    iput-object p3, p0, Lyyds/ᲇᲇᛶᛶ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 230
    iget p1, p3, Lyyds/ᲇᲇᛳᛴ;->ᲀᛲᛳᲀ:I

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, -0x2

    :goto_0
    iput p1, p0, Lyyds/ᲇᲇᛶᛶ;->ᛲᲈᲁ:I

    .line 231
    iput-object p4, p0, Lyyds/ᲇᲇᛶᛶ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    if-eqz p4, :cond_1

    .line 232
    iput-object p0, p4, Lyyds/ᲇᲇᛶᛶ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public static ᛱᲈᲁ(Lyyds/ᛶᲇᛸᛱ;Lyyds/ᲇᲇᛶᛶ;Lyyds/ᲇᲇᛶᛶ;Lyyds/ᲇᲇᛶᛶ;Lyyds/ᲇᲇᛶᛶ;Lyyds/ᲇᲇᛳᛴ;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string v0, "RuntimeVisibleAnnotations"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛳᛶᲁ(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1, v0, p5}, Lyyds/ᲇᲇᛶᛶ;->ᛶᛷᛲᲁ(ILyyds/ᲇᲇᛳᛴ;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    if-eqz p2, :cond_1

    .line 13
    .line 14
    const-string p1, "RuntimeInvisibleAnnotations"

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛳᛶᲁ(Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {p2, p1, p5}, Lyyds/ᲇᲇᛶᛶ;->ᛶᛷᛲᲁ(ILyyds/ᲇᲇᛳᛴ;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    if-eqz p3, :cond_2

    .line 24
    .line 25
    const-string p1, "RuntimeVisibleTypeAnnotations"

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛳᛶᲁ(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-virtual {p3, p1, p5}, Lyyds/ᲇᲇᛶᛶ;->ᛶᛷᛲᲁ(ILyyds/ᲇᲇᛳᛴ;)V

    .line 32
    .line 33
    .line 34
    :cond_2
    if-eqz p4, :cond_3

    .line 35
    .line 36
    const-string p1, "RuntimeInvisibleTypeAnnotations"

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛳᛶᲁ(Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    invoke-virtual {p4, p0, p5}, Lyyds/ᲇᲇᛶᛶ;->ᛶᛷᛲᲁ(ILyyds/ᲇᲇᛳᛴ;)V

    .line 43
    .line 44
    .line 45
    :cond_3
    return-void
.end method

.method public static ᛲᛳᛶᲁ(I[Lyyds/ᲇᲇᛶᛶ;ILyyds/ᲇᲇᛳᛴ;)V
    .locals 6

    .line 1
    mul-int/lit8 v0, p2, 0x2

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    const/4 v3, 0x0

    .line 8
    if-ge v2, p2, :cond_1

    .line 9
    .line 10
    aget-object v4, p1, v2

    .line 11
    .line 12
    if-nez v4, :cond_0

    .line 13
    .line 14
    move v3, v1

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-virtual {v4, v3}, Lyyds/ᲇᲇᛶᛶ;->ᛲᲈᲁ(Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    add-int/lit8 v3, v3, -0x8

    .line 21
    .line 22
    :goto_1
    add-int/2addr v0, v3

    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {p3, p0}, Lyyds/ᲇᲇᛳᛴ;->ᛷᲈᲈᲁ(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p3, v0}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛳᛶᲁ(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p3, p2}, Lyyds/ᲇᲇᛳᛴ;->ᛶᛷᛲᲁ(I)V

    .line 33
    .line 34
    .line 35
    move p0, v1

    .line 36
    :goto_2
    if-ge p0, p2, :cond_4

    .line 37
    .line 38
    aget-object v0, p1, p0

    .line 39
    .line 40
    move v2, v1

    .line 41
    move-object v4, v3

    .line 42
    :goto_3
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {v0}, Lyyds/ᲇᲇᛶᛶ;->ᛷᛵᲇᲀ()V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    iget-object v4, v0, Lyyds/ᲇᲇᛶᛶ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v4, Lyyds/ᲇᲇᛶᛶ;

    .line 52
    .line 53
    move-object v5, v4

    .line 54
    move-object v4, v0

    .line 55
    move-object v0, v5

    .line 56
    goto :goto_3

    .line 57
    :cond_2
    invoke-virtual {p3, v2}, Lyyds/ᲇᲇᛳᛴ;->ᛷᲈᲈᲁ(I)V

    .line 58
    .line 59
    .line 60
    :goto_4
    if-eqz v4, :cond_3

    .line 61
    .line 62
    iget-object v0, v4, Lyyds/ᲇᲇᛶᛶ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Lyyds/ᲇᲇᛳᛴ;

    .line 65
    .line 66
    iget-object v2, v0, Lyyds/ᲇᲇᛳᛴ;->ᛵᛸᛸᛷ:[B

    .line 67
    .line 68
    iget v0, v0, Lyyds/ᲇᲇᛳᛴ;->ᲀᛲᛳᲀ:I

    .line 69
    .line 70
    invoke-virtual {p3, v2, v1, v0}, Lyyds/ᲇᲇᛳᛴ;->ᛱᲈᲁ([BII)V

    .line 71
    .line 72
    .line 73
    iget-object v0, v4, Lyyds/ᲇᲇᛶᛶ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 74
    .line 75
    move-object v4, v0

    .line 76
    check-cast v4, Lyyds/ᲇᲇᛶᛶ;

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_3
    add-int/lit8 p0, p0, 0x1

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    return-void
.end method

.method public static ᛲᛴᛳᛲ(Lyyds/ᛶᲇᛸᛱ;Ljava/lang/String;Lyyds/ᲇᲇᛶᛶ;)Lyyds/ᲇᲇᛶᛶ;
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᲇᲇᛳᛴ;

    .line 2
    .line 3
    invoke-direct {v0}, Lyyds/ᲇᲇᛳᛴ;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛳᛶᲁ(Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-virtual {v0, p1}, Lyyds/ᲇᲇᛳᛴ;->ᛷᲈᲈᲁ(I)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-virtual {v0, p1}, Lyyds/ᲇᲇᛳᛴ;->ᛷᲈᲈᲁ(I)V

    .line 15
    .line 16
    .line 17
    new-instance p1, Lyyds/ᲇᲇᛶᛶ;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {p1, p0, v1, v0, p2}, Lyyds/ᲇᲇᛶᛶ;-><init>(Lyyds/ᛶᲇᛸᛱ;ZLyyds/ᲇᲇᛳᛴ;Lyyds/ᲇᲇᛶᛶ;)V

    .line 21
    .line 22
    .line 23
    return-object p1
.end method

.method public static ᛵᛸᛸᛷ(Lyyds/ᲇᲇᛶᛶ;Lyyds/ᲇᲇᛶᛶ;Lyyds/ᲇᲇᛶᛶ;Lyyds/ᲇᲇᛶᛶ;)I
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const-string v0, "RuntimeVisibleAnnotations"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lyyds/ᲇᲇᛶᛶ;->ᛲᲈᲁ(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-eqz p1, :cond_1

    .line 12
    .line 13
    const-string v0, "RuntimeInvisibleAnnotations"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lyyds/ᲇᲇᛶᛶ;->ᛲᲈᲁ(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    add-int/2addr p0, p1

    .line 20
    :cond_1
    if-eqz p2, :cond_2

    .line 21
    .line 22
    const-string p1, "RuntimeVisibleTypeAnnotations"

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Lyyds/ᲇᲇᛶᛶ;->ᛲᲈᲁ(Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    add-int/2addr p0, p1

    .line 29
    :cond_2
    if-eqz p3, :cond_3

    .line 30
    .line 31
    const-string p1, "RuntimeInvisibleTypeAnnotations"

    .line 32
    .line 33
    invoke-virtual {p3, p1}, Lyyds/ᲇᲇᛶᛶ;->ᛲᲈᲁ(Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    add-int/2addr p1, p0

    .line 38
    return p1

    .line 39
    :cond_3
    return p0
.end method

.method public static ᲀᛲᛳᲀ(Ljava/lang/String;[Lyyds/ᲇᲇᛶᛶ;I)I
    .locals 4

    .line 1
    mul-int/lit8 v0, p2, 0x2

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x7

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v2, p2, :cond_1

    .line 8
    .line 9
    aget-object v3, p1, v2

    .line 10
    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    move v3, v1

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-virtual {v3, p0}, Lyyds/ᲇᲇᛶᛶ;->ᛲᲈᲁ(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    add-int/lit8 v3, v3, -0x8

    .line 20
    .line 21
    :goto_1
    add-int/2addr v0, v3

    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return v0
.end method

.method public static ᲇᲇᲇᛱ(Ljava/util/ArrayDeque;IZ)Lyyds/ᛴᛴᲇᛷ;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lyyds/ᛴᛴᲇᛷ;

    .line 16
    .line 17
    iget v1, v0, Lyyds/ᛴᛴᲇᛷ;->ᛲᲈᲁ:I

    .line 18
    .line 19
    if-ne v1, p1, :cond_0

    .line 20
    .line 21
    iget-boolean v1, v0, Lyyds/ᛴᛴᲇᛷ;->ᲀᛲᛳᲀ:Z

    .line 22
    .line 23
    if-ne v1, p2, :cond_0

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v0, 0x0

    .line 30
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_3

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lyyds/ᛴᛴᲇᛷ;

    .line 41
    .line 42
    if-eqz p2, :cond_2

    .line 43
    .line 44
    iget v1, p1, Lyyds/ᛴᛴᲇᛷ;->ᛵᛸᛸᛷ:I

    .line 45
    .line 46
    add-int/lit8 v1, v1, -0x1

    .line 47
    .line 48
    iput v1, p1, Lyyds/ᛴᛴᲇᛷ;->ᛵᛸᛸᛷ:I

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    iget v1, p1, Lyyds/ᛴᛴᲇᛷ;->ᛵᛸᛸᛷ:I

    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    iput v1, p1, Lyyds/ᛴᛴᲇᛷ;->ᛵᛸᛸᛷ:I

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    return-object v0
.end method

.method public static ᲇᲈᛵᛷ(Lyyds/ᛶᲇᛸᛱ;ILyyds/ᲇᲇᛳᛴ;Ljava/lang/String;Lyyds/ᲇᲇᛶᛶ;)Lyyds/ᲇᲇᛶᛶ;
    .locals 4

    .line 1
    new-instance v0, Lyyds/ᲇᲇᛳᛴ;

    .line 2
    .line 3
    invoke-direct {v0}, Lyyds/ᲇᲇᛳᛴ;-><init>()V

    .line 4
    .line 5
    .line 6
    ushr-int/lit8 v1, p1, 0x18

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    packed-switch v1, :pswitch_data_1

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lyyds/ᛷᲈᲈᛶ;->ᛲᲈᲁ()V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :pswitch_0
    invoke-virtual {v0, p1}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛳᛶᲁ(I)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_1
    invoke-virtual {v0, v1}, Lyyds/ᲇᲇᛳᛴ;->ᛶᛷᛲᲁ(I)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :pswitch_2
    const v3, 0xffff00

    .line 33
    .line 34
    .line 35
    and-int/2addr p1, v3

    .line 36
    shr-int/lit8 p1, p1, 0x8

    .line 37
    .line 38
    invoke-virtual {v0, v1, p1}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    :pswitch_3
    ushr-int/lit8 p1, p1, 0x10

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Lyyds/ᲇᲇᛳᛴ;->ᛷᲈᲈᲁ(I)V

    .line 45
    .line 46
    .line 47
    :goto_0
    const/4 p1, 0x0

    .line 48
    if-nez p2, :cond_1

    .line 49
    .line 50
    invoke-virtual {v0, p1}, Lyyds/ᲇᲇᛳᛴ;->ᛶᛷᛲᲁ(I)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    iget-object v1, p2, Lyyds/ᲇᲇᛳᛴ;->ᛵᛸᛸᛷ:[B

    .line 55
    .line 56
    iget p2, p2, Lyyds/ᲇᲇᛳᛴ;->ᲀᛲᛳᲀ:I

    .line 57
    .line 58
    aget-byte v3, v1, p2

    .line 59
    .line 60
    mul-int/lit8 v3, v3, 0x2

    .line 61
    .line 62
    add-int/2addr v3, v2

    .line 63
    invoke-virtual {v0, v1, p2, v3}, Lyyds/ᲇᲇᛳᛴ;->ᛱᲈᲁ([BII)V

    .line 64
    .line 65
    .line 66
    :goto_1
    invoke-virtual {p0, p3}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛳᛶᲁ(Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    invoke-virtual {v0, p2}, Lyyds/ᲇᲇᛳᛴ;->ᛷᲈᲈᲁ(I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, p1}, Lyyds/ᲇᲇᛳᛴ;->ᛷᲈᲈᲁ(I)V

    .line 74
    .line 75
    .line 76
    new-instance p1, Lyyds/ᲇᲇᛶᛶ;

    .line 77
    .line 78
    invoke-direct {p1, p0, v2, v0, p4}, Lyyds/ᲇᲇᛶᛶ;-><init>(Lyyds/ᛶᲇᛸᛱ;ZLyyds/ᲇᲇᛳᛴ;Lyyds/ᲇᲇᛶᛶ;)V

    .line 79
    .line 80
    .line 81
    return-object p1

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_3
        :pswitch_2
    .end packed-switch

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    :pswitch_data_1
    .packed-switch 0x42
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public ᛲᲈᲁ(Ljava/lang/String;)I
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᲇᲇᛶᛶ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lyyds/ᛶᲇᛸᛱ;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛳᛶᲁ(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    :cond_0
    const/16 p1, 0x8

    .line 11
    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lyyds/ᲇᲇᛶᛶ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lyyds/ᲇᲇᛳᛴ;

    .line 17
    .line 18
    iget v0, v0, Lyyds/ᲇᲇᛳᛴ;->ᲀᛲᛳᲀ:I

    .line 19
    .line 20
    add-int/2addr p1, v0

    .line 21
    iget-object p0, p0, Lyyds/ᲇᲇᛶᛶ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Lyyds/ᲇᲇᛶᛶ;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    return p1
.end method

.method public ᛶᛷᛲᲁ(ILyyds/ᲇᲇᛳᛴ;)V
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    move v3, v1

    .line 5
    :goto_0
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lyyds/ᲇᲇᛶᛶ;->ᛷᛵᲇᲀ()V

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, Lyyds/ᲇᲇᛶᛶ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lyyds/ᲇᲇᛳᛴ;

    .line 13
    .line 14
    iget v2, v2, Lyyds/ᲇᲇᛳᛴ;->ᲀᛲᛳᲀ:I

    .line 15
    .line 16
    add-int/2addr v0, v2

    .line 17
    add-int/lit8 v3, v3, 0x1

    .line 18
    .line 19
    iget-object v2, p0, Lyyds/ᲇᲇᛶᛶ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Lyyds/ᲇᲇᛶᛶ;

    .line 22
    .line 23
    move-object v4, v2

    .line 24
    move-object v2, p0

    .line 25
    move-object p0, v4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p2, p1}, Lyyds/ᲇᲇᛳᛴ;->ᛷᲈᲈᲁ(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, v0}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛳᛶᲁ(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2, v3}, Lyyds/ᲇᲇᛳᛴ;->ᛷᲈᲈᲁ(I)V

    .line 34
    .line 35
    .line 36
    :goto_1
    if-eqz v2, :cond_1

    .line 37
    .line 38
    iget-object p0, v2, Lyyds/ᲇᲇᛶᛶ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Lyyds/ᲇᲇᛳᛴ;

    .line 41
    .line 42
    iget-object p1, p0, Lyyds/ᲇᲇᛳᛴ;->ᛵᛸᛸᛷ:[B

    .line 43
    .line 44
    iget p0, p0, Lyyds/ᲇᲇᛳᛴ;->ᲀᛲᛳᲀ:I

    .line 45
    .line 46
    invoke-virtual {p2, p1, v1, p0}, Lyyds/ᲇᲇᛳᛴ;->ᛱᲈᲁ([BII)V

    .line 47
    .line 48
    .line 49
    iget-object p0, v2, Lyyds/ᲇᲇᛶᛶ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 50
    .line 51
    move-object v2, p0

    .line 52
    check-cast v2, Lyyds/ᲇᲇᛶᛶ;

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    return-void
.end method

.method public ᛷᛲᲈᛱ(Ljava/lang/String;)Lyyds/ᲇᲇᛶᛶ;
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᲇᲇᛶᛶ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyyds/ᛶᲇᛸᛱ;

    .line 4
    .line 5
    iget-object v1, p0, Lyyds/ᲇᲇᛶᛶ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lyyds/ᲇᲇᛳᛴ;

    .line 8
    .line 9
    iget v2, p0, Lyyds/ᲇᲇᛶᛶ;->ᛵᛸᛸᛷ:I

    .line 10
    .line 11
    add-int/lit8 v2, v2, 0x1

    .line 12
    .line 13
    iput v2, p0, Lyyds/ᲇᲇᛶᛶ;->ᛵᛸᛸᛷ:I

    .line 14
    .line 15
    iget-boolean p0, p0, Lyyds/ᲇᲇᛶᛶ;->ᲀᛲᛳᲀ:Z

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛳᛶᲁ(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-virtual {v1, p0}, Lyyds/ᲇᲇᛳᛴ;->ᛷᲈᲈᲁ(I)V

    .line 24
    .line 25
    .line 26
    :cond_0
    const/16 p0, 0x5b

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-virtual {v1, p0, p1}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    .line 30
    .line 31
    .line 32
    new-instance p0, Lyyds/ᲇᲇᛶᛶ;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-direct {p0, v0, p1, v1, v2}, Lyyds/ᲇᲇᛶᛶ;-><init>(Lyyds/ᛶᲇᛸᛱ;ZLyyds/ᲇᲇᛳᛴ;Lyyds/ᲇᲇᛶᛶ;)V

    .line 36
    .line 37
    .line 38
    return-object p0
.end method

.method public ᛷᛵᲇᲀ()V
    .locals 3

    .line 1
    const/4 v0, -0x1

    .line 2
    iget v1, p0, Lyyds/ᲇᲇᛶᛶ;->ᛲᲈᲁ:I

    .line 3
    .line 4
    if-eq v1, v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lyyds/ᲇᲇᛶᛶ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lyyds/ᲇᲇᛳᛴ;

    .line 9
    .line 10
    iget-object v0, v0, Lyyds/ᲇᲇᛳᛴ;->ᛵᛸᛸᛷ:[B

    .line 11
    .line 12
    iget p0, p0, Lyyds/ᲇᲇᛶᛶ;->ᛵᛸᛸᛷ:I

    .line 13
    .line 14
    ushr-int/lit8 v2, p0, 0x8

    .line 15
    .line 16
    int-to-byte v2, v2

    .line 17
    aput-byte v2, v0, v1

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    int-to-byte p0, p0

    .line 22
    aput-byte p0, v0, v1

    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public ᛷᲈᲈᲁ(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lyyds/ᲇᲇᛶᛶ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyyds/ᛶᲇᛸᛱ;

    .line 4
    .line 5
    iget-object v1, p0, Lyyds/ᲇᲇᛶᛶ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lyyds/ᲇᲇᛳᛴ;

    .line 8
    .line 9
    iget v2, p0, Lyyds/ᲇᲇᛶᛶ;->ᛵᛸᛸᛷ:I

    .line 10
    .line 11
    add-int/lit8 v2, v2, 0x1

    .line 12
    .line 13
    iput v2, p0, Lyyds/ᲇᲇᛶᛶ;->ᛵᛸᛸᛷ:I

    .line 14
    .line 15
    iget-boolean p0, p0, Lyyds/ᲇᲇᛶᛶ;->ᲀᛲᛳᲀ:Z

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, p2}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛳᛶᲁ(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-virtual {v1, p0}, Lyyds/ᲇᲇᛳᛴ;->ᛷᲈᲈᲁ(I)V

    .line 24
    .line 25
    .line 26
    :cond_0
    instance-of p0, p1, Ljava/lang/String;

    .line 27
    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    check-cast p1, Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛳᛶᲁ(Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    const/16 p1, 0x73

    .line 37
    .line 38
    invoke-virtual {v1, p1, p0}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    instance-of p0, p1, Ljava/lang/Byte;

    .line 43
    .line 44
    const/16 p2, 0x42

    .line 45
    .line 46
    const/4 v2, 0x3

    .line 47
    if-eqz p0, :cond_2

    .line 48
    .line 49
    check-cast p1, Ljava/lang/Byte;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    invoke-virtual {v0, v2, p0}, Lyyds/ᛶᲇᛸᛱ;->ᲇᲈᛵᛷ(II)Lyyds/ᲇᛱ;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    iget p0, p0, Lyyds/ᲇᛱ;->ᛲᲈᲁ:I

    .line 60
    .line 61
    invoke-virtual {v1, p2, p0}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    instance-of p0, p1, Ljava/lang/Boolean;

    .line 66
    .line 67
    const/16 v3, 0x5a

    .line 68
    .line 69
    if-eqz p0, :cond_3

    .line 70
    .line 71
    check-cast p1, Ljava/lang/Boolean;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    invoke-virtual {v0, v2, p0}, Lyyds/ᛶᲇᛸᛱ;->ᲇᲈᛵᛷ(II)Lyyds/ᲇᛱ;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    iget p0, p0, Lyyds/ᲇᛱ;->ᛲᲈᲁ:I

    .line 82
    .line 83
    invoke-virtual {v1, v3, p0}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_3
    instance-of p0, p1, Ljava/lang/Character;

    .line 88
    .line 89
    const/16 v4, 0x43

    .line 90
    .line 91
    if-eqz p0, :cond_4

    .line 92
    .line 93
    check-cast p1, Ljava/lang/Character;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    invoke-virtual {v0, v2, p0}, Lyyds/ᛶᲇᛸᛱ;->ᲇᲈᛵᛷ(II)Lyyds/ᲇᛱ;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    iget p0, p0, Lyyds/ᲇᛱ;->ᛲᲈᲁ:I

    .line 104
    .line 105
    invoke-virtual {v1, v4, p0}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_4
    instance-of p0, p1, Ljava/lang/Short;

    .line 110
    .line 111
    const/16 v5, 0x53

    .line 112
    .line 113
    if-eqz p0, :cond_5

    .line 114
    .line 115
    check-cast p1, Ljava/lang/Short;

    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/Short;->shortValue()S

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    invoke-virtual {v0, v2, p0}, Lyyds/ᛶᲇᛸᛱ;->ᲇᲈᛵᛷ(II)Lyyds/ᲇᛱ;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    iget p0, p0, Lyyds/ᲇᛱ;->ᛲᲈᲁ:I

    .line 126
    .line 127
    invoke-virtual {v1, v5, p0}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :cond_5
    instance-of p0, p1, Lyyds/ᛶᛳᲇᛳ;

    .line 132
    .line 133
    if-eqz p0, :cond_6

    .line 134
    .line 135
    check-cast p1, Lyyds/ᛶᛳᲇᛳ;

    .line 136
    .line 137
    invoke-virtual {p1}, Lyyds/ᛶᛳᲇᛳ;->ᲇᲈᛵᛷ()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-virtual {v0, p0}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛳᛶᲁ(Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    move-result p0

    .line 145
    const/16 p1, 0x63

    .line 146
    .line 147
    invoke-virtual {v1, p1, p0}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :cond_6
    instance-of p0, p1, [B

    .line 152
    .line 153
    const/4 v6, 0x0

    .line 154
    const/16 v7, 0x5b

    .line 155
    .line 156
    if-eqz p0, :cond_7

    .line 157
    .line 158
    check-cast p1, [B

    .line 159
    .line 160
    array-length p0, p1

    .line 161
    invoke-virtual {v1, v7, p0}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    .line 162
    .line 163
    .line 164
    array-length p0, p1

    .line 165
    :goto_0
    if-ge v6, p0, :cond_e

    .line 166
    .line 167
    aget-byte v3, p1, v6

    .line 168
    .line 169
    invoke-virtual {v0, v2, v3}, Lyyds/ᛶᲇᛸᛱ;->ᲇᲈᛵᛷ(II)Lyyds/ᲇᛱ;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    iget v3, v3, Lyyds/ᲇᛱ;->ᛲᲈᲁ:I

    .line 174
    .line 175
    invoke-virtual {v1, p2, v3}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    .line 176
    .line 177
    .line 178
    add-int/lit8 v6, v6, 0x1

    .line 179
    .line 180
    goto :goto_0

    .line 181
    :cond_7
    instance-of p0, p1, [Z

    .line 182
    .line 183
    if-eqz p0, :cond_8

    .line 184
    .line 185
    check-cast p1, [Z

    .line 186
    .line 187
    array-length p0, p1

    .line 188
    invoke-virtual {v1, v7, p0}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    .line 189
    .line 190
    .line 191
    array-length p0, p1

    .line 192
    :goto_1
    if-ge v6, p0, :cond_e

    .line 193
    .line 194
    aget-boolean p2, p1, v6

    .line 195
    .line 196
    invoke-virtual {v0, v2, p2}, Lyyds/ᛶᲇᛸᛱ;->ᲇᲈᛵᛷ(II)Lyyds/ᲇᛱ;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    iget p2, p2, Lyyds/ᲇᛱ;->ᛲᲈᲁ:I

    .line 201
    .line 202
    invoke-virtual {v1, v3, p2}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    .line 203
    .line 204
    .line 205
    add-int/lit8 v6, v6, 0x1

    .line 206
    .line 207
    goto :goto_1

    .line 208
    :cond_8
    instance-of p0, p1, [S

    .line 209
    .line 210
    if-eqz p0, :cond_9

    .line 211
    .line 212
    check-cast p1, [S

    .line 213
    .line 214
    array-length p0, p1

    .line 215
    invoke-virtual {v1, v7, p0}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    .line 216
    .line 217
    .line 218
    array-length p0, p1

    .line 219
    :goto_2
    if-ge v6, p0, :cond_e

    .line 220
    .line 221
    aget-short p2, p1, v6

    .line 222
    .line 223
    invoke-virtual {v0, v2, p2}, Lyyds/ᛶᲇᛸᛱ;->ᲇᲈᛵᛷ(II)Lyyds/ᲇᛱ;

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    iget p2, p2, Lyyds/ᲇᛱ;->ᛲᲈᲁ:I

    .line 228
    .line 229
    invoke-virtual {v1, v5, p2}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    .line 230
    .line 231
    .line 232
    add-int/lit8 v6, v6, 0x1

    .line 233
    .line 234
    goto :goto_2

    .line 235
    :cond_9
    instance-of p0, p1, [C

    .line 236
    .line 237
    if-eqz p0, :cond_a

    .line 238
    .line 239
    check-cast p1, [C

    .line 240
    .line 241
    array-length p0, p1

    .line 242
    invoke-virtual {v1, v7, p0}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    .line 243
    .line 244
    .line 245
    array-length p0, p1

    .line 246
    :goto_3
    if-ge v6, p0, :cond_e

    .line 247
    .line 248
    aget-char p2, p1, v6

    .line 249
    .line 250
    invoke-virtual {v0, v2, p2}, Lyyds/ᛶᲇᛸᛱ;->ᲇᲈᛵᛷ(II)Lyyds/ᲇᛱ;

    .line 251
    .line 252
    .line 253
    move-result-object p2

    .line 254
    iget p2, p2, Lyyds/ᲇᛱ;->ᛲᲈᲁ:I

    .line 255
    .line 256
    invoke-virtual {v1, v4, p2}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    .line 257
    .line 258
    .line 259
    add-int/lit8 v6, v6, 0x1

    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_a
    instance-of p0, p1, [I

    .line 263
    .line 264
    if-eqz p0, :cond_b

    .line 265
    .line 266
    check-cast p1, [I

    .line 267
    .line 268
    array-length p0, p1

    .line 269
    invoke-virtual {v1, v7, p0}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    .line 270
    .line 271
    .line 272
    array-length p0, p1

    .line 273
    :goto_4
    if-ge v6, p0, :cond_e

    .line 274
    .line 275
    aget p2, p1, v6

    .line 276
    .line 277
    invoke-virtual {v0, v2, p2}, Lyyds/ᛶᲇᛸᛱ;->ᲇᲈᛵᛷ(II)Lyyds/ᲇᛱ;

    .line 278
    .line 279
    .line 280
    move-result-object p2

    .line 281
    iget p2, p2, Lyyds/ᲇᛱ;->ᛲᲈᲁ:I

    .line 282
    .line 283
    const/16 v3, 0x49

    .line 284
    .line 285
    invoke-virtual {v1, v3, p2}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    .line 286
    .line 287
    .line 288
    add-int/lit8 v6, v6, 0x1

    .line 289
    .line 290
    goto :goto_4

    .line 291
    :cond_b
    instance-of p0, p1, [J

    .line 292
    .line 293
    if-eqz p0, :cond_c

    .line 294
    .line 295
    check-cast p1, [J

    .line 296
    .line 297
    array-length p0, p1

    .line 298
    invoke-virtual {v1, v7, p0}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    .line 299
    .line 300
    .line 301
    array-length p0, p1

    .line 302
    :goto_5
    if-ge v6, p0, :cond_e

    .line 303
    .line 304
    aget-wide v2, p1, v6

    .line 305
    .line 306
    const/4 p2, 0x5

    .line 307
    invoke-virtual {v0, p2, v2, v3}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛴᛳᛲ(IJ)Lyyds/ᲇᛱ;

    .line 308
    .line 309
    .line 310
    move-result-object p2

    .line 311
    iget p2, p2, Lyyds/ᲇᛱ;->ᛲᲈᲁ:I

    .line 312
    .line 313
    const/16 v2, 0x4a

    .line 314
    .line 315
    invoke-virtual {v1, v2, p2}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    .line 316
    .line 317
    .line 318
    add-int/lit8 v6, v6, 0x1

    .line 319
    .line 320
    goto :goto_5

    .line 321
    :cond_c
    instance-of p0, p1, [F

    .line 322
    .line 323
    if-eqz p0, :cond_d

    .line 324
    .line 325
    check-cast p1, [F

    .line 326
    .line 327
    array-length p0, p1

    .line 328
    invoke-virtual {v1, v7, p0}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    .line 329
    .line 330
    .line 331
    array-length p0, p1

    .line 332
    :goto_6
    if-ge v6, p0, :cond_e

    .line 333
    .line 334
    aget p2, p1, v6

    .line 335
    .line 336
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    const/4 v2, 0x4

    .line 340
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 341
    .line 342
    .line 343
    move-result p2

    .line 344
    invoke-virtual {v0, v2, p2}, Lyyds/ᛶᲇᛸᛱ;->ᲇᲈᛵᛷ(II)Lyyds/ᲇᛱ;

    .line 345
    .line 346
    .line 347
    move-result-object p2

    .line 348
    iget p2, p2, Lyyds/ᲇᛱ;->ᛲᲈᲁ:I

    .line 349
    .line 350
    const/16 v2, 0x46

    .line 351
    .line 352
    invoke-virtual {v1, v2, p2}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    .line 353
    .line 354
    .line 355
    add-int/lit8 v6, v6, 0x1

    .line 356
    .line 357
    goto :goto_6

    .line 358
    :cond_d
    instance-of p0, p1, [D

    .line 359
    .line 360
    if-eqz p0, :cond_f

    .line 361
    .line 362
    check-cast p1, [D

    .line 363
    .line 364
    array-length p0, p1

    .line 365
    invoke-virtual {v1, v7, p0}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    .line 366
    .line 367
    .line 368
    array-length p0, p1

    .line 369
    :goto_7
    if-ge v6, p0, :cond_e

    .line 370
    .line 371
    aget-wide v2, p1, v6

    .line 372
    .line 373
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    const/4 p2, 0x6

    .line 377
    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 378
    .line 379
    .line 380
    move-result-wide v2

    .line 381
    invoke-virtual {v0, p2, v2, v3}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛴᛳᛲ(IJ)Lyyds/ᲇᛱ;

    .line 382
    .line 383
    .line 384
    move-result-object p2

    .line 385
    iget p2, p2, Lyyds/ᲇᛱ;->ᛲᲈᲁ:I

    .line 386
    .line 387
    const/16 v2, 0x44

    .line 388
    .line 389
    invoke-virtual {v1, v2, p2}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    .line 390
    .line 391
    .line 392
    add-int/lit8 v6, v6, 0x1

    .line 393
    .line 394
    goto :goto_7

    .line 395
    :cond_e
    return-void

    .line 396
    :cond_f
    invoke-virtual {v0, p1}, Lyyds/ᛶᲇᛸᛱ;->ᛵᛸᛸᛷ(Ljava/lang/Object;)Lyyds/ᲇᛱ;

    .line 397
    .line 398
    .line 399
    move-result-object p0

    .line 400
    const-string p1, ".s.IFJDCS"

    .line 401
    .line 402
    iget p2, p0, Lyyds/ᲇᛱ;->ᛵᛸᛸᛷ:I

    .line 403
    .line 404
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 405
    .line 406
    .line 407
    move-result p1

    .line 408
    iget p0, p0, Lyyds/ᲇᛱ;->ᛲᲈᲁ:I

    .line 409
    .line 410
    invoke-virtual {v1, p1, p0}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    .line 411
    .line 412
    .line 413
    return-void
.end method
