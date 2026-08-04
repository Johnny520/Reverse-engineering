.class public final Lyyds/ᲈᲈᲁᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛱᲈᲁ:Lyyds/ᛵᲇᛲᛱ;

.field public ᛲᛴᛳᛲ:I

.field public final ᛲᲈᲁ:Ljava/util/ArrayList;

.field public ᛵᛸᛸᛷ:Ljava/util/ArrayList;

.field public ᛶᛷᛲᲁ:Lyyds/ᲈᲁᲇᛳ;

.field public final ᲀᛲᛳᲀ:Ljava/util/ArrayList;

.field public ᲇᲇᲇᛱ:I

.field public final ᲇᲈᛵᛷ:Ljava/util/List;


# direct methods
.method public constructor <init>(Lyyds/ᛵᲇᛲᛱ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲈᲈᲁᛱ;->ᛱᲈᲁ:Lyyds/ᛵᲇᛲᛱ;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lyyds/ᲈᲈᲁᛱ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lyyds/ᲈᲈᲁᛱ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lyyds/ᲈᲈᲁᛱ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lyyds/ᲈᲈᲁᛱ;->ᲇᲈᛵᛷ:Ljava/util/List;

    .line 28
    .line 29
    const/4 p1, 0x2

    .line 30
    iput p1, p0, Lyyds/ᲈᲈᲁᛱ;->ᛲᛴᛳᛲ:I

    .line 31
    .line 32
    iput p1, p0, Lyyds/ᲈᲈᲁᛱ;->ᲇᲇᲇᛱ:I

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final ᛱᲈᲁ(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lyyds/ᛵᲇᛲᛱ;->ᛸᛴᛵᛶ(Landroid/view/View;)Lyyds/ᛱᛸᛳᛵ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lyyds/ᛱᛸᛳᛵ;->ᛷᛲᲈᛱ()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lyyds/ᲈᲈᲁᛱ;->ᛱᲈᲁ:Lyyds/ᛵᲇᛲᛱ;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v2, p1, v1}, Lyyds/ᛵᲇᛲᛱ;->removeDetachedView(Landroid/view/View;Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0}, Lyyds/ᛱᛸᛳᛵ;->ᛷᲈᲈᲁ()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    iget-object p1, v0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛲᲈᲈ:Lyyds/ᲈᲈᲁᛱ;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lyyds/ᲈᲈᲁᛱ;->ᛷᛵᲇᲀ(Lyyds/ᛱᛸᛳᛵ;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {v0}, Lyyds/ᛱᛸᛳᛵ;->ᛶᛳᛶᛵ()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    iget p1, v0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 36
    .line 37
    and-int/lit8 p1, p1, -0x21

    .line 38
    .line 39
    iput p1, v0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 40
    .line 41
    :cond_2
    :goto_0
    invoke-virtual {p0, v0}, Lyyds/ᲈᲈᲁᛱ;->ᛲᛳᛶᲁ(Lyyds/ᛱᛸᛳᛵ;)V

    .line 42
    .line 43
    .line 44
    iget-object p0, v2, Lyyds/ᛵᲇᛲᛱ;->ᛲᲀᛵᛷ:Lyyds/ᲇᛲᲇᲇ;

    .line 45
    .line 46
    if-eqz p0, :cond_3

    .line 47
    .line 48
    invoke-virtual {v0}, Lyyds/ᛱᛸᛳᛵ;->ᛱᲈᲁ()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_3

    .line 53
    .line 54
    iget-object p0, v2, Lyyds/ᛵᲇᛲᛱ;->ᛲᲀᛵᛷ:Lyyds/ᲇᛲᲇᲇ;

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Lyyds/ᲇᛲᲇᲇ;->ᲇᲈᛵᛷ(Lyyds/ᛱᛸᛳᛵ;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    return-void
.end method

.method public final ᛲᛲᲈᲈ()V
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᲈᲈᲁᛱ;->ᛱᲈᲁ:Lyyds/ᛵᲇᛲᛱ;

    .line 2
    .line 3
    iget-object v0, v0, Lyyds/ᛵᲇᛲᛱ;->ᲇᛱᛲ:Lyyds/ᲇᲇᛵᛲ;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, v0, Lyyds/ᲇᲇᛵᛲ;->ᛷᲈᲈᲁ:I

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget v1, p0, Lyyds/ᲈᲈᲁᛱ;->ᛲᛴᛳᛲ:I

    .line 12
    .line 13
    add-int/2addr v1, v0

    .line 14
    iput v1, p0, Lyyds/ᲈᲈᲁᛱ;->ᲇᲇᲇᛱ:I

    .line 15
    .line 16
    iget-object v0, p0, Lyyds/ᲈᲈᲁᛱ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-int/lit8 v1, v1, -0x1

    .line 23
    .line 24
    :goto_1
    if-ltz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    iget v3, p0, Lyyds/ᲈᲈᲁᛱ;->ᲇᲇᲇᛱ:I

    .line 31
    .line 32
    if-le v2, v3, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Lyyds/ᲈᲈᲁᛱ;->ᛶᛷᛲᲁ(I)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v1, v1, -0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    return-void
.end method

.method public final ᛲᛳᛶᲁ(Lyyds/ᛱᛸᛳᛵ;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lyyds/ᲈᲈᲁᛱ;->ᛱᲈᲁ:Lyyds/ᛵᲇᛲᛱ;

    .line 2
    .line 3
    iget-object v1, v0, Lyyds/ᛵᲇᛲᛱ;->ᲈᛳ:Lyyds/ᲁᲇᛷᛳ;

    .line 4
    .line 5
    invoke-virtual {p1}, Lyyds/ᛱᛸᛳᛵ;->ᛷᲈᲈᲁ()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iget-object v3, p1, Lyyds/ᛱᛸᛳᛵ;->ᛲᲈᲁ:Landroid/view/View;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    if-nez v2, :cond_12

    .line 14
    .line 15
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    goto/16 :goto_a

    .line 22
    .line 23
    :cond_0
    invoke-virtual {p1}, Lyyds/ᛱᛸᛳᛵ;->ᛷᛲᲈᛱ()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_11

    .line 28
    .line 29
    invoke-virtual {p1}, Lyyds/ᛱᛸᛳᛵ;->ᲇᛱᛲ()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_10

    .line 34
    .line 35
    iget v2, p1, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 36
    .line 37
    and-int/lit8 v2, v2, 0x10

    .line 38
    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    sget-object v2, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 42
    .line 43
    invoke-virtual {v3}, Landroid/view/View;->hasTransientState()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    move v2, v5

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move v2, v4

    .line 52
    :goto_0
    sget-boolean v6, Lyyds/ᛵᲇᛲᛱ;->ᛶᛵᛸᛳ:Z

    .line 53
    .line 54
    iget-object v7, p0, Lyyds/ᲈᲈᲁᛱ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 55
    .line 56
    if-eqz v6, :cond_3

    .line 57
    .line 58
    invoke-virtual {v7, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-nez v6, :cond_2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v1, "cached view received recycle internal? "

    .line 68
    .line 69
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Lyyds/ᛵᲇᛲᛱ;->ᛷᛸᲇᛶ()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p0, p1}, Lyyds/ᛷᲈᲈᛶ;->ᛷᛲᲈᛱ(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_3
    :goto_1
    invoke-virtual {p1}, Lyyds/ᛱᛸᛳᛵ;->ᛱᲈᲁ()Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-eqz v6, :cond_d

    .line 88
    .line 89
    iget v6, p0, Lyyds/ᲈᲈᲁᛱ;->ᲇᲇᲇᛱ:I

    .line 90
    .line 91
    if-lez v6, :cond_b

    .line 92
    .line 93
    iget v6, p1, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 94
    .line 95
    and-int/lit16 v6, v6, 0x20e

    .line 96
    .line 97
    if-eqz v6, :cond_4

    .line 98
    .line 99
    goto :goto_6

    .line 100
    :cond_4
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    iget v8, p0, Lyyds/ᲈᲈᲁᛱ;->ᲇᲇᲇᛱ:I

    .line 105
    .line 106
    if-lt v6, v8, :cond_5

    .line 107
    .line 108
    if-lez v6, :cond_5

    .line 109
    .line 110
    invoke-virtual {p0, v4}, Lyyds/ᲈᲈᲁᛱ;->ᛶᛷᛲᲁ(I)V

    .line 111
    .line 112
    .line 113
    add-int/lit8 v6, v6, -0x1

    .line 114
    .line 115
    :cond_5
    sget-boolean v8, Lyyds/ᛵᲇᛲᛱ;->ᲁᛸᛲᲈ:Z

    .line 116
    .line 117
    if-eqz v8, :cond_a

    .line 118
    .line 119
    if-lez v6, :cond_a

    .line 120
    .line 121
    iget v8, p1, Lyyds/ᛱᛸᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 122
    .line 123
    iget-object v9, v1, Lyyds/ᲁᲇᛷᛳ;->ᛵᛸᛸᛷ:[I

    .line 124
    .line 125
    if-eqz v9, :cond_7

    .line 126
    .line 127
    iget v9, v1, Lyyds/ᲁᲇᛷᛳ;->ᲇᲈᛵᛷ:I

    .line 128
    .line 129
    mul-int/lit8 v9, v9, 0x2

    .line 130
    .line 131
    move v10, v4

    .line 132
    :goto_2
    if-ge v10, v9, :cond_7

    .line 133
    .line 134
    iget-object v11, v1, Lyyds/ᲁᲇᛷᛳ;->ᛵᛸᛸᛷ:[I

    .line 135
    .line 136
    aget v11, v11, v10

    .line 137
    .line 138
    if-ne v11, v8, :cond_6

    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_6
    add-int/lit8 v10, v10, 0x2

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_7
    add-int/lit8 v6, v6, -0x1

    .line 145
    .line 146
    :goto_3
    if-ltz v6, :cond_9

    .line 147
    .line 148
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    check-cast v8, Lyyds/ᛱᛸᛳᛵ;

    .line 153
    .line 154
    iget v8, v8, Lyyds/ᛱᛸᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 155
    .line 156
    iget-object v9, v1, Lyyds/ᲁᲇᛷᛳ;->ᛵᛸᛸᛷ:[I

    .line 157
    .line 158
    if-eqz v9, :cond_9

    .line 159
    .line 160
    iget v9, v1, Lyyds/ᲁᲇᛷᛳ;->ᲇᲈᛵᛷ:I

    .line 161
    .line 162
    mul-int/lit8 v9, v9, 0x2

    .line 163
    .line 164
    move v10, v4

    .line 165
    :goto_4
    if-ge v10, v9, :cond_9

    .line 166
    .line 167
    iget-object v11, v1, Lyyds/ᲁᲇᛷᛳ;->ᛵᛸᛸᛷ:[I

    .line 168
    .line 169
    aget v11, v11, v10

    .line 170
    .line 171
    if-ne v11, v8, :cond_8

    .line 172
    .line 173
    add-int/lit8 v6, v6, -0x1

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_8
    add-int/lit8 v10, v10, 0x2

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_9
    add-int/2addr v6, v5

    .line 180
    :cond_a
    :goto_5
    invoke-virtual {v7, v6, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    move v1, v5

    .line 184
    goto :goto_7

    .line 185
    :cond_b
    :goto_6
    move v1, v4

    .line 186
    :goto_7
    if-nez v1, :cond_c

    .line 187
    .line 188
    invoke-virtual {p0, p1, v5}, Lyyds/ᲈᲈᲁᛱ;->ᛲᲈᲁ(Lyyds/ᛱᛸᛳᛵ;Z)V

    .line 189
    .line 190
    .line 191
    :goto_8
    move v4, v1

    .line 192
    goto :goto_9

    .line 193
    :cond_c
    move v5, v4

    .line 194
    goto :goto_8

    .line 195
    :cond_d
    sget-boolean p0, Lyyds/ᛵᲇᛲᛱ;->ᛶᛷᛶᛲ:Z

    .line 196
    .line 197
    if-eqz p0, :cond_e

    .line 198
    .line 199
    invoke-virtual {v0}, Lyyds/ᛵᲇᛲᛱ;->ᛷᛸᲇᛶ()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    const-string v1, "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists"

    .line 204
    .line 205
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    const-string v1, "RecyclerView"

    .line 210
    .line 211
    invoke-static {v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 212
    .line 213
    .line 214
    :cond_e
    move v5, v4

    .line 215
    :goto_9
    iget-object p0, v0, Lyyds/ᛵᲇᛲᛱ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛵᛱᛱ;

    .line 216
    .line 217
    invoke-virtual {p0, p1}, Lyyds/ᛱᛵᛱᛱ;->ᛱᛸᲁᲇ(Lyyds/ᛱᛸᛳᛵ;)V

    .line 218
    .line 219
    .line 220
    if-nez v4, :cond_f

    .line 221
    .line 222
    if-nez v5, :cond_f

    .line 223
    .line 224
    if-eqz v2, :cond_f

    .line 225
    .line 226
    invoke-static {v3}, Lyyds/ᛷᛶᛷᛵ;->ᛵᛸᛸᛷ(Landroid/view/View;)V

    .line 227
    .line 228
    .line 229
    const/4 p0, 0x0

    .line 230
    iput-object p0, p1, Lyyds/ᛱᛸᛳᛵ;->ᛵᛶᛲᲀ:Lyyds/ᛲᛵᲇᛳ;

    .line 231
    .line 232
    iput-object p0, p1, Lyyds/ᛱᛸᛳᛵ;->ᛶᛳᛶᛵ:Lyyds/ᛵᲇᛲᛱ;

    .line 233
    .line 234
    :cond_f
    return-void

    .line 235
    :cond_10
    invoke-virtual {v0}, Lyyds/ᛵᲇᛲᛱ;->ᛷᛸᲇᛶ()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    const-string p1, "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."

    .line 240
    .line 241
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    return-void

    .line 249
    :cond_11
    new-instance p0, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    const-string v1, "Tmp detached view should be removed from RecyclerView before it can be recycled: "

    .line 252
    .line 253
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0}, Lyyds/ᛵᲇᛲᛱ;->ᛷᛸᲇᛶ()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    invoke-static {p0, p1}, Lyyds/ᛷᲈᲈᛶ;->ᛷᛲᲈᛱ(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    return-void

    .line 267
    :cond_12
    :goto_a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 268
    .line 269
    new-instance v1, Ljava/lang/StringBuilder;

    .line 270
    .line 271
    const-string v2, "Scrapped or attached views may not be recycled. isScrap:"

    .line 272
    .line 273
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {p1}, Lyyds/ᛱᛸᛳᛵ;->ᛷᲈᲈᲁ()Z

    .line 277
    .line 278
    .line 279
    move-result p1

    .line 280
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    const-string p1, " isAttached:"

    .line 284
    .line 285
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    if-eqz p1, :cond_13

    .line 293
    .line 294
    move v4, v5

    .line 295
    :cond_13
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v0}, Lyyds/ᛵᲇᛲᛱ;->ᛷᛸᲇᛶ()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    throw p0
.end method

.method public final ᛲᛴᛳᛲ(Lyyds/ᛲᛵᲇᛳ;Z)V
    .locals 3

    .line 1
    iget-object p0, p0, Lyyds/ᲈᲈᲁᛱ;->ᛶᛷᛲᲁ:Lyyds/ᲈᲁᲇᛳ;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lyyds/ᲈᲁᲇᛳ;->ᛲᲈᲁ:Landroid/util/SparseArray;

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᲈᲁᲇᛳ;->ᲀᛲᛳᲀ:Ljava/util/Set;

    .line 8
    .line 9
    invoke-interface {p0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    invoke-interface {p0}, Ljava/util/Set;->size()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    if-nez p2, :cond_1

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    move p1, p0

    .line 22
    :goto_0
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-ge p1, p2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    check-cast p2, Lyyds/ᲀᲇᲁ;

    .line 37
    .line 38
    iget-object p2, p2, Lyyds/ᲀᲇᲁ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 39
    .line 40
    move v1, p0

    .line 41
    :goto_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-ge v1, v2, :cond_0

    .line 46
    .line 47
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Lyyds/ᛱᛸᛳᛵ;

    .line 52
    .line 53
    iget-object v2, v2, Lyyds/ᛱᛸᛳᛵ;->ᛲᲈᲁ:Landroid/view/View;

    .line 54
    .line 55
    invoke-static {v2}, Lyyds/ᛷᛶᛷᛵ;->ᛵᛸᛸᛷ(Landroid/view/View;)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v1, v1, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    return-void
.end method

.method public final ᛲᲈᲁ(Lyyds/ᛱᛸᛳᛵ;Z)V
    .locals 4

    .line 1
    invoke-static {p1}, Lyyds/ᛵᲇᛲᛱ;->ᛷᛲᲈᛱ(Lyyds/ᛱᛸᛳᛵ;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lyyds/ᛱᛸᛳᛵ;->ᛲᲈᲁ:Landroid/view/View;

    .line 5
    .line 6
    iget-object v1, p0, Lyyds/ᲈᲈᲁᛱ;->ᛱᲈᲁ:Lyyds/ᛵᲇᛲᛱ;

    .line 7
    .line 8
    iget-object v2, v1, Lyyds/ᛵᲇᛲᛱ;->ᛶᛵᲁᲈ:Lyyds/ᛷᛵᲇᲁ;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    iget-object v2, v2, Lyyds/ᛷᛵᲇᲁ;->ᛲᛴᛳᛲ:Lyyds/ᛷᲇᲀᲀ;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object v2, v2, Lyyds/ᛷᲇᲀᲀ;->ᛲᛴᛳᛲ:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lyyds/ᲀᛸᲈᲁ;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v2, v3

    .line 27
    :goto_0
    invoke-static {v0, v2}, Lyyds/ᛷᲁᛵᲇ;->ᲇᲈᛵᛷ(Landroid/view/View;Lyyds/ᲀᛸᲈᲁ;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    if-eqz p2, :cond_5

    .line 31
    .line 32
    iget-object p2, v1, Lyyds/ᛵᲇᛲᛱ;->ᛶᛳᛶᛵ:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-gtz v2, :cond_4

    .line 39
    .line 40
    iget-object p2, v1, Lyyds/ᛵᲇᛲᛱ;->ᛳᲁᲁᲇ:Lyyds/ᛲᛵᲇᛳ;

    .line 41
    .line 42
    if-eqz p2, :cond_2

    .line 43
    .line 44
    invoke-virtual {p2, p1}, Lyyds/ᛲᛵᲇᛳ;->ᛶᛷᛲᲁ(Lyyds/ᛱᛸᛳᛵ;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    iget-object p2, v1, Lyyds/ᛵᲇᛲᛱ;->ᛸᲀᛷᛲ:Lyyds/ᲈᛳᲇᛲ;

    .line 48
    .line 49
    if-eqz p2, :cond_3

    .line 50
    .line 51
    iget-object p2, v1, Lyyds/ᛵᲇᛲᛱ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛵᛱᛱ;

    .line 52
    .line 53
    invoke-virtual {p2, p1}, Lyyds/ᛱᛵᛱᛱ;->ᛱᛸᲁᲇ(Lyyds/ᛱᛸᛳᛵ;)V

    .line 54
    .line 55
    .line 56
    :cond_3
    sget-boolean p2, Lyyds/ᛵᲇᛲᛱ;->ᛶᛷᛶᛲ:Z

    .line 57
    .line 58
    if-eqz p2, :cond_5

    .line 59
    .line 60
    new-instance p2, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v1, "dispatchViewRecycled: "

    .line 63
    .line 64
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    const-string v1, "RecyclerView"

    .line 75
    .line 76
    invoke-static {v1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_4
    const/4 p0, 0x0

    .line 81
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-static {}, Lyyds/ᛱᛸᛶᛲ;->ᛲᲈᲁ()V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_5
    :goto_1
    iput-object v3, p1, Lyyds/ᛱᛸᛳᛵ;->ᛵᛶᛲᲀ:Lyyds/ᛲᛵᲇᛳ;

    .line 93
    .line 94
    iput-object v3, p1, Lyyds/ᛱᛸᛳᛵ;->ᛶᛳᛶᛵ:Lyyds/ᛵᲇᛲᛱ;

    .line 95
    .line 96
    invoke-virtual {p0}, Lyyds/ᲈᲈᲁᛱ;->ᲀᛲᛳᲀ()Lyyds/ᲈᲁᲇᛳ;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    iget p2, p1, Lyyds/ᛱᛸᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 104
    .line 105
    invoke-virtual {p0, p2}, Lyyds/ᲈᲁᲇᛳ;->ᛲᲈᲁ(I)Lyyds/ᲀᲇᲁ;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    iget-object v1, v1, Lyyds/ᲀᲇᲁ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 110
    .line 111
    iget-object p0, p0, Lyyds/ᲈᲁᲇᛳ;->ᛲᲈᲁ:Landroid/util/SparseArray;

    .line 112
    .line 113
    invoke-virtual {p0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    check-cast p0, Lyyds/ᲀᲇᲁ;

    .line 118
    .line 119
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    const/4 p0, 0x5

    .line 123
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 124
    .line 125
    .line 126
    move-result p2

    .line 127
    if-gt p0, p2, :cond_6

    .line 128
    .line 129
    invoke-static {v0}, Lyyds/ᛷᛶᛷᛵ;->ᛵᛸᛸᛷ(Landroid/view/View;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_6
    sget-boolean p0, Lyyds/ᛵᲇᛲᛱ;->ᛶᛵᛸᛳ:Z

    .line 134
    .line 135
    if-eqz p0, :cond_8

    .line 136
    .line 137
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    if-nez p0, :cond_7

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_7
    const-string p0, "this scrap item already exists"

    .line 145
    .line 146
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :cond_8
    :goto_2
    invoke-virtual {p1}, Lyyds/ᛱᛸᛳᛵ;->ᛱᛳᲇ()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    return-void
.end method

.method public final ᛵᛸᛸᛷ(I)I
    .locals 4

    .line 1
    iget-object p0, p0, Lyyds/ᲈᲈᲁᛱ;->ᛱᲈᲁ:Lyyds/ᛵᲇᛲᛱ;

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᛵᲇᛲᛱ;->ᛸᲀᛷᛲ:Lyyds/ᲈᛳᲇᛲ;

    .line 4
    .line 5
    if-ltz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Lyyds/ᲈᛳᲇᛲ;->ᛵᛸᛸᛷ()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ge p1, v1, :cond_1

    .line 12
    .line 13
    iget-boolean v0, v0, Lyyds/ᲈᛳᲇᛲ;->ᛶᛷᛲᲁ:Z

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return p1

    .line 18
    :cond_0
    iget-object p0, p0, Lyyds/ᛵᲇᛲᛱ;->ᛶᛷᛲᲁ:Lyyds/ᛵᲇᛸᲇ;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p0, p1, v0}, Lyyds/ᛵᲇᛸᲇ;->ᛶᛷᛲᲁ(II)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    .line 27
    .line 28
    invoke-virtual {v0}, Lyyds/ᲈᛳᲇᛲ;->ᛵᛸᛸᛷ()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p0}, Lyyds/ᛵᲇᛲᛱ;->ᛷᛸᲇᛶ()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    new-instance v2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v3, "invalid position "

    .line 39
    .line 40
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string p1, ". State item count is "

    .line 47
    .line 48
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-direct {v1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v1
.end method

.method public final ᛶᛷᛲᲁ(I)V
    .locals 5

    .line 1
    sget-boolean v0, Lyyds/ᛵᲇᛲᛱ;->ᛶᛷᛶᛲ:Z

    .line 2
    .line 3
    const-string v1, "RecyclerView"

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "Recycling cached view at index "

    .line 10
    .line 11
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lyyds/ᲈᲈᲁᛱ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lyyds/ᛱᛸᛳᛵ;

    .line 31
    .line 32
    sget-boolean v3, Lyyds/ᛵᲇᛲᛱ;->ᛶᛷᛶᛲ:Z

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    new-instance v3, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v4, "CachedViewHolder to be recycled: "

    .line 39
    .line 40
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    :cond_1
    const/4 v1, 0x1

    .line 54
    invoke-virtual {p0, v2, v1}, Lyyds/ᲈᲈᲁᛱ;->ᛲᲈᲁ(Lyyds/ᛱᛸᛳᛵ;Z)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final ᛷᛲᲈᛱ(IJ)Lyyds/ᛱᛸᛳᛵ;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lyyds/ᲈᲈᲁᛱ;->ᛱᲈᲁ:Lyyds/ᛵᲇᛲᛱ;

    .line 6
    .line 7
    iget-object v3, v2, Lyyds/ᛵᲇᛲᛱ;->ᛸᲀᛷᛲ:Lyyds/ᲈᛳᲇᛲ;

    .line 8
    .line 9
    if-ltz v1, :cond_4c

    .line 10
    .line 11
    invoke-virtual {v3}, Lyyds/ᲈᛳᲇᛲ;->ᛵᛸᛸᛷ()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-ge v1, v4, :cond_4c

    .line 16
    .line 17
    iget-boolean v4, v3, Lyyds/ᲈᛳᲇᛲ;->ᛶᛷᛲᲁ:Z

    .line 18
    .line 19
    const/16 v5, 0x20

    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v7, 0x1

    .line 23
    const/4 v8, 0x0

    .line 24
    if-eqz v4, :cond_4

    .line 25
    .line 26
    iget-object v4, v0, Lyyds/ᲈᲈᲁᛱ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 27
    .line 28
    if-eqz v4, :cond_3

    .line 29
    .line 30
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-nez v4, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    move v9, v8

    .line 38
    :goto_0
    if-ge v9, v4, :cond_2

    .line 39
    .line 40
    iget-object v10, v0, Lyyds/ᲈᲈᲁᛱ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v10

    .line 46
    check-cast v10, Lyyds/ᛱᛸᛳᛵ;

    .line 47
    .line 48
    invoke-virtual {v10}, Lyyds/ᛱᛸᛳᛵ;->ᛶᛳᛶᛵ()Z

    .line 49
    .line 50
    .line 51
    move-result v11

    .line 52
    if-nez v11, :cond_1

    .line 53
    .line 54
    invoke-virtual {v10}, Lyyds/ᛱᛸᛳᛵ;->ᲇᲈᛵᛷ()I

    .line 55
    .line 56
    .line 57
    move-result v11

    .line 58
    if-ne v11, v1, :cond_1

    .line 59
    .line 60
    invoke-virtual {v10, v5}, Lyyds/ᛱᛸᛳᛵ;->ᛲᲈᲁ(I)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    iget-object v4, v2, Lyyds/ᛵᲇᛲᛱ;->ᛳᲁᲁᲇ:Lyyds/ᛲᛵᲇᛳ;

    .line 68
    .line 69
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    :cond_3
    :goto_1
    move-object v10, v6

    .line 73
    :goto_2
    if-eqz v10, :cond_5

    .line 74
    .line 75
    move v4, v7

    .line 76
    goto :goto_3

    .line 77
    :cond_4
    move-object v10, v6

    .line 78
    :cond_5
    move v4, v8

    .line 79
    :goto_3
    const-string v9, "RecyclerView"

    .line 80
    .line 81
    if-nez v10, :cond_1d

    .line 82
    .line 83
    iget-object v10, v0, Lyyds/ᲈᲈᲁᛱ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 86
    .line 87
    .line 88
    move-result v11

    .line 89
    move v12, v8

    .line 90
    :goto_4
    if-ge v12, v11, :cond_8

    .line 91
    .line 92
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v13

    .line 96
    check-cast v13, Lyyds/ᛱᛸᛳᛵ;

    .line 97
    .line 98
    invoke-virtual {v13}, Lyyds/ᛱᛸᛳᛵ;->ᛶᛳᛶᛵ()Z

    .line 99
    .line 100
    .line 101
    move-result v14

    .line 102
    if-nez v14, :cond_7

    .line 103
    .line 104
    invoke-virtual {v13}, Lyyds/ᛱᛸᛳᛵ;->ᲇᲈᛵᛷ()I

    .line 105
    .line 106
    .line 107
    move-result v14

    .line 108
    if-ne v14, v1, :cond_7

    .line 109
    .line 110
    invoke-virtual {v13}, Lyyds/ᛱᛸᛳᛵ;->ᛶᛷᛲᲁ()Z

    .line 111
    .line 112
    .line 113
    move-result v14

    .line 114
    if-nez v14, :cond_7

    .line 115
    .line 116
    iget-boolean v14, v3, Lyyds/ᲈᛳᲇᛲ;->ᛶᛷᛲᲁ:Z

    .line 117
    .line 118
    if-nez v14, :cond_6

    .line 119
    .line 120
    invoke-virtual {v13}, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ()Z

    .line 121
    .line 122
    .line 123
    move-result v14

    .line 124
    if-nez v14, :cond_7

    .line 125
    .line 126
    :cond_6
    invoke-virtual {v13, v5}, Lyyds/ᛱᛸᛳᛵ;->ᛲᲈᲁ(I)V

    .line 127
    .line 128
    .line 129
    move-object v10, v13

    .line 130
    goto/16 :goto_b

    .line 131
    .line 132
    :cond_7
    add-int/lit8 v12, v12, 0x1

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_8
    iget-object v5, v2, Lyyds/ᛵᲇᛲᛱ;->ᛱᲈᲁ:Lyyds/ᲈᲇᲀᛲ;

    .line 136
    .line 137
    iget-object v5, v5, Lyyds/ᲈᲇᲀᛲ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v5, Ljava/util/ArrayList;

    .line 140
    .line 141
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 142
    .line 143
    .line 144
    move-result v10

    .line 145
    move v11, v8

    .line 146
    :goto_5
    if-ge v11, v10, :cond_a

    .line 147
    .line 148
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v12

    .line 152
    check-cast v12, Landroid/view/View;

    .line 153
    .line 154
    invoke-static {v12}, Lyyds/ᛵᲇᛲᛱ;->ᛸᛴᛵᛶ(Landroid/view/View;)Lyyds/ᛱᛸᛳᛵ;

    .line 155
    .line 156
    .line 157
    move-result-object v13

    .line 158
    invoke-virtual {v13}, Lyyds/ᛱᛸᛳᛵ;->ᲇᲈᛵᛷ()I

    .line 159
    .line 160
    .line 161
    move-result v14

    .line 162
    if-ne v14, v1, :cond_9

    .line 163
    .line 164
    invoke-virtual {v13}, Lyyds/ᛱᛸᛳᛵ;->ᛶᛷᛲᲁ()Z

    .line 165
    .line 166
    .line 167
    move-result v14

    .line 168
    if-nez v14, :cond_9

    .line 169
    .line 170
    invoke-virtual {v13}, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ()Z

    .line 171
    .line 172
    .line 173
    move-result v13

    .line 174
    if-nez v13, :cond_9

    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_9
    add-int/lit8 v11, v11, 0x1

    .line 178
    .line 179
    goto :goto_5

    .line 180
    :cond_a
    move-object v12, v6

    .line 181
    :goto_6
    if-eqz v12, :cond_10

    .line 182
    .line 183
    invoke-static {v12}, Lyyds/ᛵᲇᛲᛱ;->ᛸᛴᛵᛶ(Landroid/view/View;)Lyyds/ᛱᛸᛳᛵ;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    iget-object v10, v2, Lyyds/ᛵᲇᛲᛱ;->ᛱᲈᲁ:Lyyds/ᲈᲇᲀᛲ;

    .line 188
    .line 189
    iget-object v11, v10, Lyyds/ᲈᲇᲀᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v11, Lyyds/ᛷᲁᛷᛵ;

    .line 192
    .line 193
    iget-object v13, v10, Lyyds/ᲈᲇᲀᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v13, Lyyds/ᲇᛱᛳᛵ;

    .line 196
    .line 197
    iget-object v13, v13, Lyyds/ᲇᛱᛳᛵ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛲᛱ;

    .line 198
    .line 199
    invoke-virtual {v13, v12}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 200
    .line 201
    .line 202
    move-result v13

    .line 203
    if-ltz v13, :cond_f

    .line 204
    .line 205
    invoke-virtual {v11, v13}, Lyyds/ᛷᲁᛷᛵ;->ᲇᲈᛵᛷ(I)Z

    .line 206
    .line 207
    .line 208
    move-result v14

    .line 209
    if-eqz v14, :cond_e

    .line 210
    .line 211
    invoke-virtual {v11, v13}, Lyyds/ᛷᲁᛷᛵ;->ᛲᲈᲁ(I)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v10, v12}, Lyyds/ᲈᲇᲀᛲ;->ᛵᛶᛲᲀ(Landroid/view/View;)V

    .line 215
    .line 216
    .line 217
    iget-object v10, v2, Lyyds/ᛵᲇᛲᛱ;->ᛱᲈᲁ:Lyyds/ᲈᲇᲀᛲ;

    .line 218
    .line 219
    iget-object v11, v10, Lyyds/ᲈᲇᲀᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v11, Lyyds/ᛷᲁᛷᛵ;

    .line 222
    .line 223
    iget-object v10, v10, Lyyds/ᲈᲇᲀᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v10, Lyyds/ᲇᛱᛳᛵ;

    .line 226
    .line 227
    iget-object v10, v10, Lyyds/ᲇᛱᛳᛵ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛲᛱ;

    .line 228
    .line 229
    invoke-virtual {v10, v12}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 230
    .line 231
    .line 232
    move-result v10

    .line 233
    const/4 v13, -0x1

    .line 234
    if-ne v10, v13, :cond_b

    .line 235
    .line 236
    goto :goto_7

    .line 237
    :cond_b
    invoke-virtual {v11, v10}, Lyyds/ᛷᲁᛷᛵ;->ᲇᲈᛵᛷ(I)Z

    .line 238
    .line 239
    .line 240
    move-result v14

    .line 241
    if-eqz v14, :cond_c

    .line 242
    .line 243
    :goto_7
    move v10, v13

    .line 244
    goto :goto_8

    .line 245
    :cond_c
    invoke-virtual {v11, v10}, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ(I)I

    .line 246
    .line 247
    .line 248
    move-result v11

    .line 249
    sub-int/2addr v10, v11

    .line 250
    :goto_8
    if-eq v10, v13, :cond_d

    .line 251
    .line 252
    iget-object v11, v2, Lyyds/ᛵᲇᛲᛱ;->ᛱᲈᲁ:Lyyds/ᲈᲇᲀᛲ;

    .line 253
    .line 254
    invoke-virtual {v11, v10}, Lyyds/ᲈᲇᲀᛲ;->ᲀᛲᛳᲀ(I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, v12}, Lyyds/ᲈᲈᲁᛱ;->ᛷᲈᲈᲁ(Landroid/view/View;)V

    .line 258
    .line 259
    .line 260
    const/16 v10, 0x2020

    .line 261
    .line 262
    invoke-virtual {v5, v10}, Lyyds/ᛱᛸᛳᛵ;->ᛲᲈᲁ(I)V

    .line 263
    .line 264
    .line 265
    move-object v10, v5

    .line 266
    goto/16 :goto_b

    .line 267
    .line 268
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 269
    .line 270
    new-instance v1, Ljava/lang/StringBuilder;

    .line 271
    .line 272
    const-string v3, "layout index should not be -1 after unhiding a view:"

    .line 273
    .line 274
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2}, Lyyds/ᛵᲇᛲᛱ;->ᛷᛸᲇᛶ()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    throw v0

    .line 295
    :cond_e
    new-instance v0, Ljava/lang/RuntimeException;

    .line 296
    .line 297
    new-instance v1, Ljava/lang/StringBuilder;

    .line 298
    .line 299
    const-string v2, "trying to unhide a view that was not hidden"

    .line 300
    .line 301
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    throw v0

    .line 315
    :cond_f
    const-string v0, "view is not a child, cannot hide "

    .line 316
    .line 317
    invoke-static {v12, v0}, Lyyds/ᛱᛸᛶᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    return-object v6

    .line 321
    :cond_10
    iget-object v5, v0, Lyyds/ᲈᲈᲁᛱ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 322
    .line 323
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 324
    .line 325
    .line 326
    move-result v10

    .line 327
    move v11, v8

    .line 328
    :goto_9
    if-ge v11, v10, :cond_14

    .line 329
    .line 330
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v12

    .line 334
    check-cast v12, Lyyds/ᛱᛸᛳᛵ;

    .line 335
    .line 336
    invoke-virtual {v12}, Lyyds/ᛱᛸᛳᛵ;->ᛶᛷᛲᲁ()Z

    .line 337
    .line 338
    .line 339
    move-result v13

    .line 340
    if-nez v13, :cond_13

    .line 341
    .line 342
    invoke-virtual {v12}, Lyyds/ᛱᛸᛳᛵ;->ᲇᲈᛵᛷ()I

    .line 343
    .line 344
    .line 345
    move-result v13

    .line 346
    if-ne v13, v1, :cond_13

    .line 347
    .line 348
    iget-object v13, v12, Lyyds/ᛱᛸᛳᛵ;->ᛲᲈᲁ:Landroid/view/View;

    .line 349
    .line 350
    invoke-virtual {v13}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 351
    .line 352
    .line 353
    move-result-object v14

    .line 354
    if-eqz v14, :cond_11

    .line 355
    .line 356
    invoke-virtual {v13}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 357
    .line 358
    .line 359
    move-result-object v13

    .line 360
    iget-object v14, v12, Lyyds/ᛱᛸᛳᛵ;->ᛶᛳᛶᛵ:Lyyds/ᛵᲇᛲᛱ;

    .line 361
    .line 362
    if-eq v13, v14, :cond_11

    .line 363
    .line 364
    goto :goto_a

    .line 365
    :cond_11
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    sget-boolean v5, Lyyds/ᛵᲇᛲᛱ;->ᛶᛷᛶᛲ:Z

    .line 369
    .line 370
    if-eqz v5, :cond_12

    .line 371
    .line 372
    new-instance v5, Ljava/lang/StringBuilder;

    .line 373
    .line 374
    const-string v10, "getScrapOrHiddenOrCachedHolderForPosition("

    .line 375
    .line 376
    invoke-direct {v5, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    const-string v10, ") found match in cache: "

    .line 383
    .line 384
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v5

    .line 394
    invoke-static {v9, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 395
    .line 396
    .line 397
    :cond_12
    move-object v10, v12

    .line 398
    goto :goto_b

    .line 399
    :cond_13
    :goto_a
    add-int/lit8 v11, v11, 0x1

    .line 400
    .line 401
    goto :goto_9

    .line 402
    :cond_14
    move-object v10, v6

    .line 403
    :goto_b
    if-eqz v10, :cond_1d

    .line 404
    .line 405
    invoke-virtual {v10}, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ()Z

    .line 406
    .line 407
    .line 408
    move-result v5

    .line 409
    if-eqz v5, :cond_17

    .line 410
    .line 411
    sget-boolean v5, Lyyds/ᛵᲇᛲᛱ;->ᛶᛵᛸᛳ:Z

    .line 412
    .line 413
    if-eqz v5, :cond_16

    .line 414
    .line 415
    iget-boolean v5, v3, Lyyds/ᲈᛳᲇᛲ;->ᛶᛷᛲᲁ:Z

    .line 416
    .line 417
    if-eqz v5, :cond_15

    .line 418
    .line 419
    goto :goto_c

    .line 420
    :cond_15
    invoke-virtual {v2}, Lyyds/ᛵᲇᛲᛱ;->ᛷᛸᲇᛶ()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    const-string v1, "should not receive a removed view unless it is pre layout"

    .line 425
    .line 426
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    return-object v6

    .line 434
    :cond_16
    :goto_c
    iget-boolean v5, v3, Lyyds/ᲈᛳᲇᛲ;->ᛶᛷᛲᲁ:Z

    .line 435
    .line 436
    goto :goto_d

    .line 437
    :cond_17
    iget v5, v10, Lyyds/ᛱᛸᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 438
    .line 439
    if-ltz v5, :cond_1c

    .line 440
    .line 441
    iget-object v11, v2, Lyyds/ᛵᲇᛲᛱ;->ᛳᲁᲁᲇ:Lyyds/ᛲᛵᲇᛳ;

    .line 442
    .line 443
    invoke-virtual {v11}, Lyyds/ᛲᛵᲇᛳ;->ᛲᲈᲁ()I

    .line 444
    .line 445
    .line 446
    move-result v11

    .line 447
    if-ge v5, v11, :cond_1c

    .line 448
    .line 449
    iget-boolean v5, v3, Lyyds/ᲈᛳᲇᛲ;->ᛶᛷᛲᲁ:Z

    .line 450
    .line 451
    if-nez v5, :cond_18

    .line 452
    .line 453
    iget-object v5, v2, Lyyds/ᛵᲇᛲᛱ;->ᛳᲁᲁᲇ:Lyyds/ᛲᛵᲇᛳ;

    .line 454
    .line 455
    invoke-virtual {v5}, Lyyds/ᛲᛵᲇᛳ;->ᛵᛸᛸᛷ()I

    .line 456
    .line 457
    .line 458
    move-result v5

    .line 459
    iget v11, v10, Lyyds/ᛱᛸᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 460
    .line 461
    if-eq v5, v11, :cond_18

    .line 462
    .line 463
    move v5, v8

    .line 464
    goto :goto_d

    .line 465
    :cond_18
    iget-object v5, v2, Lyyds/ᛵᲇᛲᛱ;->ᛳᲁᲁᲇ:Lyyds/ᛲᛵᲇᛳ;

    .line 466
    .line 467
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    move v5, v7

    .line 471
    :goto_d
    if-nez v5, :cond_1b

    .line 472
    .line 473
    const/4 v5, 0x4

    .line 474
    invoke-virtual {v10, v5}, Lyyds/ᛱᛸᛳᛵ;->ᛲᲈᲁ(I)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v10}, Lyyds/ᛱᛸᛳᛵ;->ᛷᲈᲈᲁ()Z

    .line 478
    .line 479
    .line 480
    move-result v5

    .line 481
    if-eqz v5, :cond_19

    .line 482
    .line 483
    iget-object v5, v10, Lyyds/ᛱᛸᛳᛵ;->ᛲᲈᲁ:Landroid/view/View;

    .line 484
    .line 485
    invoke-virtual {v2, v5, v8}, Lyyds/ᛵᲇᛲᛱ;->removeDetachedView(Landroid/view/View;Z)V

    .line 486
    .line 487
    .line 488
    iget-object v5, v10, Lyyds/ᛱᛸᛳᛵ;->ᛲᛲᲈᲈ:Lyyds/ᲈᲈᲁᛱ;

    .line 489
    .line 490
    invoke-virtual {v5, v10}, Lyyds/ᲈᲈᲁᛱ;->ᛷᛵᲇᲀ(Lyyds/ᛱᛸᛳᛵ;)V

    .line 491
    .line 492
    .line 493
    goto :goto_e

    .line 494
    :cond_19
    invoke-virtual {v10}, Lyyds/ᛱᛸᛳᛵ;->ᛶᛳᛶᛵ()Z

    .line 495
    .line 496
    .line 497
    move-result v5

    .line 498
    if-eqz v5, :cond_1a

    .line 499
    .line 500
    iget v5, v10, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 501
    .line 502
    and-int/lit8 v5, v5, -0x21

    .line 503
    .line 504
    iput v5, v10, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 505
    .line 506
    :cond_1a
    :goto_e
    invoke-virtual {v0, v10}, Lyyds/ᲈᲈᲁᛱ;->ᛲᛳᛶᲁ(Lyyds/ᛱᛸᛳᛵ;)V

    .line 507
    .line 508
    .line 509
    move-object v10, v6

    .line 510
    goto :goto_f

    .line 511
    :cond_1b
    move v4, v7

    .line 512
    goto :goto_f

    .line 513
    :cond_1c
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 514
    .line 515
    new-instance v1, Ljava/lang/StringBuilder;

    .line 516
    .line 517
    const-string v3, "Inconsistency detected. Invalid view holder adapter position"

    .line 518
    .line 519
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v2}, Lyyds/ᛵᲇᛲᛱ;->ᛷᛸᲇᛶ()Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v2

    .line 529
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 537
    .line 538
    .line 539
    throw v0

    .line 540
    :cond_1d
    :goto_f
    const-wide/16 v15, 0x0

    .line 541
    .line 542
    const-wide v17, 0x7fffffffffffffffL

    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    if-nez v10, :cond_2c

    .line 548
    .line 549
    iget-object v5, v2, Lyyds/ᛵᲇᛲᛱ;->ᛶᛷᛲᲁ:Lyyds/ᛵᲇᛸᲇ;

    .line 550
    .line 551
    invoke-virtual {v5, v1, v8}, Lyyds/ᛵᲇᛸᲇ;->ᛶᛷᛲᲁ(II)I

    .line 552
    .line 553
    .line 554
    move-result v5

    .line 555
    if-ltz v5, :cond_2b

    .line 556
    .line 557
    const-wide/16 v19, 0x3

    .line 558
    .line 559
    iget-object v11, v2, Lyyds/ᛵᲇᛲᛱ;->ᛳᲁᲁᲇ:Lyyds/ᛲᛵᲇᛳ;

    .line 560
    .line 561
    invoke-virtual {v11}, Lyyds/ᛲᛵᲇᛳ;->ᛲᲈᲁ()I

    .line 562
    .line 563
    .line 564
    move-result v11

    .line 565
    if-ge v5, v11, :cond_2b

    .line 566
    .line 567
    iget-object v5, v2, Lyyds/ᛵᲇᛲᛱ;->ᛳᲁᲁᲇ:Lyyds/ᛲᛵᲇᛳ;

    .line 568
    .line 569
    invoke-virtual {v5}, Lyyds/ᛲᛵᲇᛳ;->ᛵᛸᛸᛷ()I

    .line 570
    .line 571
    .line 572
    move-result v5

    .line 573
    iget-object v11, v2, Lyyds/ᛵᲇᛲᛱ;->ᛳᲁᲁᲇ:Lyyds/ᛲᛵᲇᛳ;

    .line 574
    .line 575
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 576
    .line 577
    .line 578
    if-nez v10, :cond_21

    .line 579
    .line 580
    sget-boolean v10, Lyyds/ᛵᲇᛲᛱ;->ᛶᛷᛶᛲ:Z

    .line 581
    .line 582
    if-eqz v10, :cond_1e

    .line 583
    .line 584
    new-instance v10, Ljava/lang/StringBuilder;

    .line 585
    .line 586
    const-string v11, "tryGetViewHolderForPositionByDeadline("

    .line 587
    .line 588
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 592
    .line 593
    .line 594
    const-string v11, ") fetching from shared pool"

    .line 595
    .line 596
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v10

    .line 603
    invoke-static {v9, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 604
    .line 605
    .line 606
    :cond_1e
    invoke-virtual {v0}, Lyyds/ᲈᲈᲁᛱ;->ᲀᛲᛳᲀ()Lyyds/ᲈᲁᲇᛳ;

    .line 607
    .line 608
    .line 609
    move-result-object v10

    .line 610
    iget-object v10, v10, Lyyds/ᲈᲁᲇᛳ;->ᛲᲈᲁ:Landroid/util/SparseArray;

    .line 611
    .line 612
    invoke-virtual {v10, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v10

    .line 616
    check-cast v10, Lyyds/ᲀᲇᲁ;

    .line 617
    .line 618
    if-eqz v10, :cond_20

    .line 619
    .line 620
    iget-object v10, v10, Lyyds/ᲀᲇᲁ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 621
    .line 622
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 623
    .line 624
    .line 625
    move-result v11

    .line 626
    if-nez v11, :cond_20

    .line 627
    .line 628
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 629
    .line 630
    .line 631
    move-result v11

    .line 632
    sub-int/2addr v11, v7

    .line 633
    :goto_10
    if-ltz v11, :cond_20

    .line 634
    .line 635
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v12

    .line 639
    check-cast v12, Lyyds/ᛱᛸᛳᛵ;

    .line 640
    .line 641
    const-wide/16 v21, 0x4

    .line 642
    .line 643
    iget-object v13, v12, Lyyds/ᛱᛸᛳᛵ;->ᛲᲈᲁ:Landroid/view/View;

    .line 644
    .line 645
    invoke-virtual {v13}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 646
    .line 647
    .line 648
    move-result-object v14

    .line 649
    if-eqz v14, :cond_1f

    .line 650
    .line 651
    invoke-virtual {v13}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 652
    .line 653
    .line 654
    move-result-object v13

    .line 655
    iget-object v12, v12, Lyyds/ᛱᛸᛳᛵ;->ᛶᛳᛶᛵ:Lyyds/ᛵᲇᛲᛱ;

    .line 656
    .line 657
    if-eq v13, v12, :cond_1f

    .line 658
    .line 659
    add-int/lit8 v11, v11, -0x1

    .line 660
    .line 661
    goto :goto_10

    .line 662
    :cond_1f
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v10

    .line 666
    check-cast v10, Lyyds/ᛱᛸᛳᛵ;

    .line 667
    .line 668
    goto :goto_11

    .line 669
    :cond_20
    const-wide/16 v21, 0x4

    .line 670
    .line 671
    move-object v10, v6

    .line 672
    :goto_11
    if-eqz v10, :cond_22

    .line 673
    .line 674
    invoke-virtual {v10}, Lyyds/ᛱᛸᛳᛵ;->ᛱᛳᲇ()V

    .line 675
    .line 676
    .line 677
    sget-boolean v11, Lyyds/ᛵᲇᛲᛱ;->ᛶᛵᛸᛳ:Z

    .line 678
    .line 679
    goto :goto_12

    .line 680
    :cond_21
    const-wide/16 v21, 0x4

    .line 681
    .line 682
    :cond_22
    :goto_12
    if-nez v10, :cond_2a

    .line 683
    .line 684
    invoke-virtual {v2}, Lyyds/ᛵᲇᛲᛱ;->getNanoTime()J

    .line 685
    .line 686
    .line 687
    move-result-wide v10

    .line 688
    cmp-long v12, p2, v17

    .line 689
    .line 690
    if-eqz v12, :cond_24

    .line 691
    .line 692
    iget-object v12, v0, Lyyds/ᲈᲈᲁᛱ;->ᛶᛷᛲᲁ:Lyyds/ᲈᲁᲇᛳ;

    .line 693
    .line 694
    invoke-virtual {v12, v5}, Lyyds/ᲈᲁᲇᛳ;->ᛲᲈᲁ(I)Lyyds/ᲀᲇᲁ;

    .line 695
    .line 696
    .line 697
    move-result-object v12

    .line 698
    iget-wide v12, v12, Lyyds/ᲀᲇᲁ;->ᛵᛸᛸᛷ:J

    .line 699
    .line 700
    cmp-long v14, v12, v15

    .line 701
    .line 702
    if-eqz v14, :cond_24

    .line 703
    .line 704
    add-long/2addr v12, v10

    .line 705
    cmp-long v12, v12, p2

    .line 706
    .line 707
    if-gez v12, :cond_23

    .line 708
    .line 709
    goto :goto_13

    .line 710
    :cond_23
    return-object v6

    .line 711
    :cond_24
    :goto_13
    iget-object v12, v2, Lyyds/ᛵᲇᛲᛱ;->ᛳᲁᲁᲇ:Lyyds/ᛲᛵᲇᛳ;

    .line 712
    .line 713
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 714
    .line 715
    .line 716
    :try_start_0
    invoke-static {}, Landroid/os/Trace;->isEnabled()Z

    .line 717
    .line 718
    .line 719
    move-result v13

    .line 720
    if-eqz v13, :cond_25

    .line 721
    .line 722
    const-string v13, "RV onCreateViewHolder type=0x%X"

    .line 723
    .line 724
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 725
    .line 726
    .line 727
    move-result-object v14

    .line 728
    filled-new-array {v14}, [Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v14

    .line 732
    invoke-static {v13, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 733
    .line 734
    .line 735
    move-result-object v13

    .line 736
    invoke-static {v13}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 737
    .line 738
    .line 739
    :cond_25
    invoke-virtual {v12, v2, v5}, Lyyds/ᛲᛵᲇᛳ;->ᲇᲇᲇᛱ(Landroid/view/ViewGroup;I)Lyyds/ᛱᛸᛳᛵ;

    .line 740
    .line 741
    .line 742
    move-result-object v12

    .line 743
    iget-object v13, v12, Lyyds/ᛱᛸᛳᛵ;->ᛲᲈᲁ:Landroid/view/View;

    .line 744
    .line 745
    invoke-virtual {v13}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 746
    .line 747
    .line 748
    move-result-object v14

    .line 749
    if-nez v14, :cond_29

    .line 750
    .line 751
    iput v5, v12, Lyyds/ᛱᛸᛳᛵ;->ᛲᛴᛳᛲ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 752
    .line 753
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 754
    .line 755
    .line 756
    sget-boolean v14, Lyyds/ᛵᲇᛲᛱ;->ᲁᛸᛲᲈ:Z

    .line 757
    .line 758
    if-eqz v14, :cond_26

    .line 759
    .line 760
    invoke-static {v13}, Lyyds/ᛵᲇᛲᛱ;->ᛷᛶᛷᲀ(Landroid/view/View;)Lyyds/ᛵᲇᛲᛱ;

    .line 761
    .line 762
    .line 763
    move-result-object v13

    .line 764
    if-eqz v13, :cond_26

    .line 765
    .line 766
    new-instance v14, Ljava/lang/ref/WeakReference;

    .line 767
    .line 768
    invoke-direct {v14, v13}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 769
    .line 770
    .line 771
    iput-object v14, v12, Lyyds/ᛱᛸᛳᛵ;->ᛵᛸᛸᛷ:Ljava/lang/ref/WeakReference;

    .line 772
    .line 773
    :cond_26
    invoke-virtual {v2}, Lyyds/ᛵᲇᛲᛱ;->getNanoTime()J

    .line 774
    .line 775
    .line 776
    move-result-wide v13

    .line 777
    move-wide/from16 v23, v15

    .line 778
    .line 779
    iget-object v15, v0, Lyyds/ᲈᲈᲁᛱ;->ᛶᛷᛲᲁ:Lyyds/ᲈᲁᲇᛳ;

    .line 780
    .line 781
    sub-long/2addr v13, v10

    .line 782
    invoke-virtual {v15, v5}, Lyyds/ᲈᲁᲇᛳ;->ᛲᲈᲁ(I)Lyyds/ᲀᲇᲁ;

    .line 783
    .line 784
    .line 785
    move-result-object v5

    .line 786
    iget-wide v10, v5, Lyyds/ᲀᲇᲁ;->ᛵᛸᛸᛷ:J

    .line 787
    .line 788
    cmp-long v15, v10, v23

    .line 789
    .line 790
    if-nez v15, :cond_27

    .line 791
    .line 792
    goto :goto_14

    .line 793
    :cond_27
    div-long v10, v10, v21

    .line 794
    .line 795
    mul-long v10, v10, v19

    .line 796
    .line 797
    div-long v13, v13, v21

    .line 798
    .line 799
    add-long/2addr v13, v10

    .line 800
    :goto_14
    iput-wide v13, v5, Lyyds/ᲀᲇᲁ;->ᛵᛸᛸᛷ:J

    .line 801
    .line 802
    sget-boolean v5, Lyyds/ᛵᲇᛲᛱ;->ᛶᛷᛶᛲ:Z

    .line 803
    .line 804
    if-eqz v5, :cond_28

    .line 805
    .line 806
    const-string v5, "tryGetViewHolderForPositionByDeadline created new ViewHolder"

    .line 807
    .line 808
    invoke-static {v9, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 809
    .line 810
    .line 811
    :cond_28
    move-object v10, v12

    .line 812
    goto :goto_15

    .line 813
    :cond_29
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 814
    .line 815
    const-string v1, "ViewHolder views must not be attached when created. Ensure that you are not passing \'true\' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"

    .line 816
    .line 817
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 818
    .line 819
    .line 820
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 821
    :catchall_0
    move-exception v0

    .line 822
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 823
    .line 824
    .line 825
    throw v0

    .line 826
    :cond_2a
    move-wide/from16 v23, v15

    .line 827
    .line 828
    goto :goto_15

    .line 829
    :cond_2b
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 830
    .line 831
    invoke-virtual {v3}, Lyyds/ᲈᛳᲇᛲ;->ᛵᛸᛸᛷ()I

    .line 832
    .line 833
    .line 834
    move-result v3

    .line 835
    invoke-virtual {v2}, Lyyds/ᛵᲇᛲᛱ;->ᛷᛸᲇᛶ()Ljava/lang/String;

    .line 836
    .line 837
    .line 838
    move-result-object v2

    .line 839
    new-instance v4, Ljava/lang/StringBuilder;

    .line 840
    .line 841
    const-string v6, "Inconsistency detected. Invalid item position "

    .line 842
    .line 843
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 844
    .line 845
    .line 846
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 847
    .line 848
    .line 849
    const-string v1, "(offset:"

    .line 850
    .line 851
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 852
    .line 853
    .line 854
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 855
    .line 856
    .line 857
    const-string v1, ").state:"

    .line 858
    .line 859
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 860
    .line 861
    .line 862
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 863
    .line 864
    .line 865
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 866
    .line 867
    .line 868
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 869
    .line 870
    .line 871
    move-result-object v1

    .line 872
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 873
    .line 874
    .line 875
    throw v0

    .line 876
    :cond_2c
    move-wide/from16 v23, v15

    .line 877
    .line 878
    const-wide/16 v19, 0x3

    .line 879
    .line 880
    const-wide/16 v21, 0x4

    .line 881
    .line 882
    :goto_15
    iget-object v5, v10, Lyyds/ᛱᛸᛳᛵ;->ᛲᲈᲁ:Landroid/view/View;

    .line 883
    .line 884
    if-eqz v4, :cond_2d

    .line 885
    .line 886
    iget-boolean v9, v3, Lyyds/ᲈᛳᲇᛲ;->ᛶᛷᛲᲁ:Z

    .line 887
    .line 888
    if-nez v9, :cond_2d

    .line 889
    .line 890
    iget v9, v10, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 891
    .line 892
    and-int/lit16 v11, v9, 0x2000

    .line 893
    .line 894
    if-eqz v11, :cond_2d

    .line 895
    .line 896
    and-int/lit16 v9, v9, -0x2001

    .line 897
    .line 898
    iput v9, v10, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 899
    .line 900
    iget-boolean v9, v3, Lyyds/ᲈᛳᲇᛲ;->ᛷᲈᲈᲁ:Z

    .line 901
    .line 902
    if-eqz v9, :cond_2d

    .line 903
    .line 904
    invoke-static {v10}, Lyyds/ᲇᛲᲇᲇ;->ᛵᛸᛸᛷ(Lyyds/ᛱᛸᛳᛵ;)V

    .line 905
    .line 906
    .line 907
    iget-object v9, v2, Lyyds/ᛵᲇᛲᛱ;->ᛲᲀᛵᛷ:Lyyds/ᲇᛲᲇᲇ;

    .line 908
    .line 909
    invoke-virtual {v10}, Lyyds/ᛱᛸᛳᛵ;->ᛲᛴᛳᛲ()Ljava/util/List;

    .line 910
    .line 911
    .line 912
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 913
    .line 914
    .line 915
    new-instance v9, Lyyds/ᲁᛸᛴᲇ;

    .line 916
    .line 917
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 918
    .line 919
    .line 920
    invoke-virtual {v9, v10}, Lyyds/ᲁᛸᛴᲇ;->ᛲᲈᲁ(Lyyds/ᛱᛸᛳᛵ;)V

    .line 921
    .line 922
    .line 923
    invoke-virtual {v2, v10, v9}, Lyyds/ᛵᲇᛲᛱ;->ᲇᲇᲈᲀ(Lyyds/ᛱᛸᛳᛵ;Lyyds/ᲁᛸᛴᲇ;)V

    .line 924
    .line 925
    .line 926
    :cond_2d
    iget-boolean v9, v3, Lyyds/ᲈᛳᲇᛲ;->ᛶᛷᛲᲁ:Z

    .line 927
    .line 928
    if-eqz v9, :cond_2e

    .line 929
    .line 930
    invoke-virtual {v10}, Lyyds/ᛱᛸᛳᛵ;->ᲇᲇᲇᛱ()Z

    .line 931
    .line 932
    .line 933
    move-result v9

    .line 934
    if-eqz v9, :cond_2e

    .line 935
    .line 936
    iput v1, v10, Lyyds/ᛱᛸᛳᛵ;->ᲇᲇᲇᛱ:I

    .line 937
    .line 938
    goto/16 :goto_20

    .line 939
    .line 940
    :cond_2e
    invoke-virtual {v10}, Lyyds/ᛱᛸᛳᛵ;->ᲇᲇᲇᛱ()Z

    .line 941
    .line 942
    .line 943
    move-result v9

    .line 944
    if-eqz v9, :cond_30

    .line 945
    .line 946
    iget v9, v10, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 947
    .line 948
    and-int/lit8 v9, v9, 0x2

    .line 949
    .line 950
    if-eqz v9, :cond_2f

    .line 951
    .line 952
    goto :goto_16

    .line 953
    :cond_2f
    invoke-virtual {v10}, Lyyds/ᛱᛸᛳᛵ;->ᛶᛷᛲᲁ()Z

    .line 954
    .line 955
    .line 956
    move-result v9

    .line 957
    if-eqz v9, :cond_48

    .line 958
    .line 959
    :cond_30
    :goto_16
    sget-boolean v9, Lyyds/ᛵᲇᛲᛱ;->ᛶᛵᛸᛳ:Z

    .line 960
    .line 961
    if-eqz v9, :cond_32

    .line 962
    .line 963
    invoke-virtual {v10}, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ()Z

    .line 964
    .line 965
    .line 966
    move-result v9

    .line 967
    if-nez v9, :cond_31

    .line 968
    .line 969
    goto :goto_17

    .line 970
    :cond_31
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 971
    .line 972
    new-instance v1, Ljava/lang/StringBuilder;

    .line 973
    .line 974
    const-string v3, "Removed holder should be bound and it should come here only in pre-layout. Holder: "

    .line 975
    .line 976
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 977
    .line 978
    .line 979
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 980
    .line 981
    .line 982
    invoke-virtual {v2}, Lyyds/ᛵᲇᛲᛱ;->ᛷᛸᲇᛶ()Ljava/lang/String;

    .line 983
    .line 984
    .line 985
    move-result-object v2

    .line 986
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 987
    .line 988
    .line 989
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 990
    .line 991
    .line 992
    move-result-object v1

    .line 993
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 994
    .line 995
    .line 996
    throw v0

    .line 997
    :cond_32
    :goto_17
    iget-object v9, v2, Lyyds/ᛵᲇᛲᛱ;->ᛶᛷᛲᲁ:Lyyds/ᛵᲇᛸᲇ;

    .line 998
    .line 999
    invoke-virtual {v9, v1, v8}, Lyyds/ᛵᲇᛸᲇ;->ᛶᛷᛲᲁ(II)I

    .line 1000
    .line 1001
    .line 1002
    move-result v9

    .line 1003
    iput-object v6, v10, Lyyds/ᛱᛸᛳᛵ;->ᛵᛶᛲᲀ:Lyyds/ᛲᛵᲇᛳ;

    .line 1004
    .line 1005
    iput-object v2, v10, Lyyds/ᛱᛸᛳᛵ;->ᛶᛳᛶᛵ:Lyyds/ᛵᲇᛲᛱ;

    .line 1006
    .line 1007
    iget v11, v10, Lyyds/ᛱᛸᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 1008
    .line 1009
    invoke-virtual {v2}, Lyyds/ᛵᲇᛲᛱ;->getNanoTime()J

    .line 1010
    .line 1011
    .line 1012
    move-result-wide v12

    .line 1013
    cmp-long v14, p2, v17

    .line 1014
    .line 1015
    if-eqz v14, :cond_33

    .line 1016
    .line 1017
    iget-object v14, v0, Lyyds/ᲈᲈᲁᛱ;->ᛶᛷᛲᲁ:Lyyds/ᲈᲁᲇᛳ;

    .line 1018
    .line 1019
    invoke-virtual {v14, v11}, Lyyds/ᲈᲁᲇᛳ;->ᛲᲈᲁ(I)Lyyds/ᲀᲇᲁ;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v11

    .line 1023
    iget-wide v14, v11, Lyyds/ᲀᲇᲁ;->ᲀᛲᛳᲀ:J

    .line 1024
    .line 1025
    cmp-long v11, v14, v23

    .line 1026
    .line 1027
    if-eqz v11, :cond_33

    .line 1028
    .line 1029
    add-long/2addr v14, v12

    .line 1030
    cmp-long v11, v14, p2

    .line 1031
    .line 1032
    if-gez v11, :cond_48

    .line 1033
    .line 1034
    :cond_33
    invoke-virtual {v10}, Lyyds/ᛱᛸᛳᛵ;->ᛷᛲᲈᛱ()Z

    .line 1035
    .line 1036
    .line 1037
    move-result v11

    .line 1038
    if-eqz v11, :cond_34

    .line 1039
    .line 1040
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 1041
    .line 1042
    .line 1043
    move-result v11

    .line 1044
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v14

    .line 1048
    invoke-static {v2, v5, v11, v14}, Lyyds/ᛵᲇᛲᛱ;->ᲇᲈᛵᛷ(Lyyds/ᛵᲇᛲᛱ;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 1049
    .line 1050
    .line 1051
    move v11, v7

    .line 1052
    goto :goto_18

    .line 1053
    :cond_34
    move v11, v8

    .line 1054
    :goto_18
    iget-object v14, v2, Lyyds/ᛵᲇᛲᛱ;->ᛳᲁᲁᲇ:Lyyds/ᛲᛵᲇᛳ;

    .line 1055
    .line 1056
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1057
    .line 1058
    .line 1059
    iget-object v15, v10, Lyyds/ᛱᛸᛳᛵ;->ᛵᛶᛲᲀ:Lyyds/ᛲᛵᲇᛳ;

    .line 1060
    .line 1061
    if-nez v15, :cond_35

    .line 1062
    .line 1063
    move v15, v7

    .line 1064
    goto :goto_19

    .line 1065
    :cond_35
    move v15, v8

    .line 1066
    :goto_19
    if-eqz v15, :cond_36

    .line 1067
    .line 1068
    iput v9, v10, Lyyds/ᛱᛸᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 1069
    .line 1070
    move-object/from16 v16, v6

    .line 1071
    .line 1072
    iget v6, v10, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 1073
    .line 1074
    and-int/lit16 v6, v6, -0x208

    .line 1075
    .line 1076
    or-int/2addr v6, v7

    .line 1077
    iput v6, v10, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 1078
    .line 1079
    invoke-static {}, Landroid/os/Trace;->isEnabled()Z

    .line 1080
    .line 1081
    .line 1082
    move-result v6

    .line 1083
    if-eqz v6, :cond_37

    .line 1084
    .line 1085
    iget v6, v10, Lyyds/ᛱᛸᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 1086
    .line 1087
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v6

    .line 1091
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v6

    .line 1095
    const-string v8, "RV onBindViewHolder type=0x%X"

    .line 1096
    .line 1097
    invoke-static {v8, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v6

    .line 1101
    invoke-static {v6}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1102
    .line 1103
    .line 1104
    goto :goto_1a

    .line 1105
    :cond_36
    move-object/from16 v16, v6

    .line 1106
    .line 1107
    :cond_37
    :goto_1a
    iput-object v14, v10, Lyyds/ᛱᛸᛳᛵ;->ᛵᛶᛲᲀ:Lyyds/ᛲᛵᲇᛳ;

    .line 1108
    .line 1109
    sget-boolean v6, Lyyds/ᛵᲇᛲᛱ;->ᛶᛵᛸᛳ:Z

    .line 1110
    .line 1111
    if-eqz v6, :cond_3b

    .line 1112
    .line 1113
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v6

    .line 1117
    if-nez v6, :cond_39

    .line 1118
    .line 1119
    invoke-virtual {v5}, Landroid/view/View;->isAttachedToWindow()Z

    .line 1120
    .line 1121
    .line 1122
    move-result v6

    .line 1123
    invoke-virtual {v10}, Lyyds/ᛱᛸᛳᛵ;->ᛷᛲᲈᛱ()Z

    .line 1124
    .line 1125
    .line 1126
    move-result v8

    .line 1127
    if-ne v6, v8, :cond_38

    .line 1128
    .line 1129
    goto :goto_1b

    .line 1130
    :cond_38
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1131
    .line 1132
    invoke-virtual {v10}, Lyyds/ᛱᛸᛳᛵ;->ᛷᛲᲈᛱ()Z

    .line 1133
    .line 1134
    .line 1135
    move-result v1

    .line 1136
    invoke-virtual {v5}, Landroid/view/View;->isAttachedToWindow()Z

    .line 1137
    .line 1138
    .line 1139
    move-result v2

    .line 1140
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1141
    .line 1142
    const-string v4, "Temp-detached state out of sync with reality. holder.isTmpDetached(): "

    .line 1143
    .line 1144
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1145
    .line 1146
    .line 1147
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 1148
    .line 1149
    .line 1150
    const-string v1, ", attached to window: "

    .line 1151
    .line 1152
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1153
    .line 1154
    .line 1155
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 1156
    .line 1157
    .line 1158
    const-string v1, ", holder: "

    .line 1159
    .line 1160
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1161
    .line 1162
    .line 1163
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1164
    .line 1165
    .line 1166
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v1

    .line 1170
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1171
    .line 1172
    .line 1173
    throw v0

    .line 1174
    :cond_39
    :goto_1b
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v6

    .line 1178
    if-nez v6, :cond_3b

    .line 1179
    .line 1180
    invoke-virtual {v5}, Landroid/view/View;->isAttachedToWindow()Z

    .line 1181
    .line 1182
    .line 1183
    move-result v6

    .line 1184
    if-nez v6, :cond_3a

    .line 1185
    .line 1186
    goto :goto_1c

    .line 1187
    :cond_3a
    const-string v0, "Attempting to bind attached holder with no parent (AKA temp detached): "

    .line 1188
    .line 1189
    invoke-static {v10, v0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛲᲈᛱ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1190
    .line 1191
    .line 1192
    return-object v16

    .line 1193
    :cond_3b
    :goto_1c
    invoke-virtual {v10}, Lyyds/ᛱᛸᛳᛵ;->ᛲᛴᛳᛲ()Ljava/util/List;

    .line 1194
    .line 1195
    .line 1196
    invoke-virtual {v14, v10, v9}, Lyyds/ᛲᛵᲇᛳ;->ᛲᛴᛳᛲ(Lyyds/ᛱᛸᛳᛵ;I)V

    .line 1197
    .line 1198
    .line 1199
    if-eqz v15, :cond_3e

    .line 1200
    .line 1201
    iget-object v6, v10, Lyyds/ᛱᛸᛳᛵ;->ᛷᲈᲈᲁ:Ljava/util/ArrayList;

    .line 1202
    .line 1203
    if-eqz v6, :cond_3c

    .line 1204
    .line 1205
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 1206
    .line 1207
    .line 1208
    :cond_3c
    iget v6, v10, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 1209
    .line 1210
    and-int/lit16 v6, v6, -0x401

    .line 1211
    .line 1212
    iput v6, v10, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 1213
    .line 1214
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v6

    .line 1218
    instance-of v8, v6, Lyyds/ᲇᲁᛲᲀ;

    .line 1219
    .line 1220
    if-eqz v8, :cond_3d

    .line 1221
    .line 1222
    check-cast v6, Lyyds/ᲇᲁᛲᲀ;

    .line 1223
    .line 1224
    iput-boolean v7, v6, Lyyds/ᲇᲁᛲᲀ;->ᲀᛲᛳᲀ:Z

    .line 1225
    .line 1226
    :cond_3d
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1227
    .line 1228
    .line 1229
    :cond_3e
    if-eqz v11, :cond_3f

    .line 1230
    .line 1231
    invoke-static {v2, v5}, Lyyds/ᛵᲇᛲᛱ;->ᛲᛴᛳᛲ(Lyyds/ᛵᲇᛲᛱ;Landroid/view/View;)V

    .line 1232
    .line 1233
    .line 1234
    :cond_3f
    invoke-virtual {v2}, Lyyds/ᛵᲇᛲᛱ;->getNanoTime()J

    .line 1235
    .line 1236
    .line 1237
    move-result-wide v8

    .line 1238
    iget-object v0, v0, Lyyds/ᲈᲈᲁᛱ;->ᛶᛷᛲᲁ:Lyyds/ᲈᲁᲇᛳ;

    .line 1239
    .line 1240
    iget v6, v10, Lyyds/ᛱᛸᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 1241
    .line 1242
    sub-long/2addr v8, v12

    .line 1243
    invoke-virtual {v0, v6}, Lyyds/ᲈᲁᲇᛳ;->ᛲᲈᲁ(I)Lyyds/ᲀᲇᲁ;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v0

    .line 1247
    iget-wide v11, v0, Lyyds/ᲀᲇᲁ;->ᲀᛲᛳᲀ:J

    .line 1248
    .line 1249
    cmp-long v6, v11, v23

    .line 1250
    .line 1251
    if-nez v6, :cond_40

    .line 1252
    .line 1253
    goto :goto_1d

    .line 1254
    :cond_40
    div-long v11, v11, v21

    .line 1255
    .line 1256
    mul-long v11, v11, v19

    .line 1257
    .line 1258
    div-long v8, v8, v21

    .line 1259
    .line 1260
    add-long/2addr v8, v11

    .line 1261
    :goto_1d
    iput-wide v8, v0, Lyyds/ᲀᲇᲁ;->ᲀᛲᛳᲀ:J

    .line 1262
    .line 1263
    iget-object v0, v2, Lyyds/ᛵᲇᛲᛱ;->ᛸᛸᛷᛱ:Landroid/view/accessibility/AccessibilityManager;

    .line 1264
    .line 1265
    if-eqz v0, :cond_46

    .line 1266
    .line 1267
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 1268
    .line 1269
    .line 1270
    move-result v0

    .line 1271
    if-eqz v0, :cond_46

    .line 1272
    .line 1273
    invoke-virtual {v5}, Landroid/view/View;->getImportantForAccessibility()I

    .line 1274
    .line 1275
    .line 1276
    move-result v0

    .line 1277
    if-nez v0, :cond_41

    .line 1278
    .line 1279
    invoke-virtual {v5, v7}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 1280
    .line 1281
    .line 1282
    :cond_41
    iget-object v0, v2, Lyyds/ᛵᲇᛲᛱ;->ᛶᛵᲁᲈ:Lyyds/ᛷᛵᲇᲁ;

    .line 1283
    .line 1284
    if-nez v0, :cond_42

    .line 1285
    .line 1286
    goto :goto_1f

    .line 1287
    :cond_42
    iget-object v0, v0, Lyyds/ᛷᛵᲇᲁ;->ᛲᛴᛳᛲ:Lyyds/ᛷᲇᲀᲀ;

    .line 1288
    .line 1289
    if-eqz v0, :cond_45

    .line 1290
    .line 1291
    sget-object v6, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 1292
    .line 1293
    invoke-static {v5}, Lyyds/ᛵᲈᲈᛸ;->ᛲᲈᲁ(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v6

    .line 1297
    if-nez v6, :cond_43

    .line 1298
    .line 1299
    move-object/from16 v6, v16

    .line 1300
    .line 1301
    goto :goto_1e

    .line 1302
    :cond_43
    instance-of v8, v6, Lyyds/ᛸᲀᛷᛲ;

    .line 1303
    .line 1304
    if-eqz v8, :cond_44

    .line 1305
    .line 1306
    check-cast v6, Lyyds/ᛸᲀᛷᛲ;

    .line 1307
    .line 1308
    iget-object v6, v6, Lyyds/ᛸᲀᛷᛲ;->ᛲᲈᲁ:Lyyds/ᲀᛸᲈᲁ;

    .line 1309
    .line 1310
    goto :goto_1e

    .line 1311
    :cond_44
    new-instance v8, Lyyds/ᲀᛸᲈᲁ;

    .line 1312
    .line 1313
    invoke-direct {v8, v6}, Lyyds/ᲀᛸᲈᲁ;-><init>(Landroid/view/View$AccessibilityDelegate;)V

    .line 1314
    .line 1315
    .line 1316
    move-object v6, v8

    .line 1317
    :goto_1e
    if-eqz v6, :cond_45

    .line 1318
    .line 1319
    if-eq v6, v0, :cond_45

    .line 1320
    .line 1321
    iget-object v8, v0, Lyyds/ᛷᲇᲀᲀ;->ᛲᛴᛳᛲ:Ljava/util/WeakHashMap;

    .line 1322
    .line 1323
    invoke-virtual {v8, v5, v6}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1324
    .line 1325
    .line 1326
    :cond_45
    invoke-static {v5, v0}, Lyyds/ᛷᲁᛵᲇ;->ᲇᲈᛵᛷ(Landroid/view/View;Lyyds/ᲀᛸᲈᲁ;)V

    .line 1327
    .line 1328
    .line 1329
    :cond_46
    :goto_1f
    iget-boolean v0, v3, Lyyds/ᲈᛳᲇᛲ;->ᛶᛷᛲᲁ:Z

    .line 1330
    .line 1331
    if-eqz v0, :cond_47

    .line 1332
    .line 1333
    iput v1, v10, Lyyds/ᛱᛸᛳᛵ;->ᲇᲇᲇᛱ:I

    .line 1334
    .line 1335
    :cond_47
    move v8, v7

    .line 1336
    :cond_48
    :goto_20
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v0

    .line 1340
    if-nez v0, :cond_49

    .line 1341
    .line 1342
    invoke-virtual {v2}, Lyyds/ᛵᲇᛲᛱ;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v0

    .line 1346
    check-cast v0, Lyyds/ᲇᲁᛲᲀ;

    .line 1347
    .line 1348
    invoke-virtual {v5, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1349
    .line 1350
    .line 1351
    goto :goto_21

    .line 1352
    :cond_49
    invoke-virtual {v2, v0}, Lyyds/ᛵᲇᛲᛱ;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    .line 1353
    .line 1354
    .line 1355
    move-result v1

    .line 1356
    if-nez v1, :cond_4a

    .line 1357
    .line 1358
    invoke-virtual {v2, v0}, Lyyds/ᛵᲇᛲᛱ;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    .line 1359
    .line 1360
    .line 1361
    move-result-object v0

    .line 1362
    check-cast v0, Lyyds/ᲇᲁᛲᲀ;

    .line 1363
    .line 1364
    invoke-virtual {v5, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1365
    .line 1366
    .line 1367
    goto :goto_21

    .line 1368
    :cond_4a
    check-cast v0, Lyyds/ᲇᲁᛲᲀ;

    .line 1369
    .line 1370
    :goto_21
    iput-object v10, v0, Lyyds/ᲇᲁᛲᲀ;->ᛲᲈᲁ:Lyyds/ᛱᛸᛳᛵ;

    .line 1371
    .line 1372
    if-eqz v4, :cond_4b

    .line 1373
    .line 1374
    if-eqz v8, :cond_4b

    .line 1375
    .line 1376
    goto :goto_22

    .line 1377
    :cond_4b
    const/4 v7, 0x0

    .line 1378
    :goto_22
    iput-boolean v7, v0, Lyyds/ᲇᲁᛲᲀ;->ᲇᲈᛵᛷ:Z

    .line 1379
    .line 1380
    return-object v10

    .line 1381
    :cond_4c
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 1382
    .line 1383
    invoke-virtual {v3}, Lyyds/ᲈᛳᲇᛲ;->ᛵᛸᛸᛷ()I

    .line 1384
    .line 1385
    .line 1386
    move-result v3

    .line 1387
    invoke-virtual {v2}, Lyyds/ᛵᲇᛲᛱ;->ᛷᛸᲇᛶ()Ljava/lang/String;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v2

    .line 1391
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1392
    .line 1393
    const-string v5, "Invalid item position "

    .line 1394
    .line 1395
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1396
    .line 1397
    .line 1398
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1399
    .line 1400
    .line 1401
    const-string v5, "("

    .line 1402
    .line 1403
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1404
    .line 1405
    .line 1406
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1407
    .line 1408
    .line 1409
    const-string v1, "). Item count:"

    .line 1410
    .line 1411
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1412
    .line 1413
    .line 1414
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1415
    .line 1416
    .line 1417
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1418
    .line 1419
    .line 1420
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v1

    .line 1424
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 1425
    .line 1426
    .line 1427
    throw v0
.end method

.method public final ᛷᛵᲇᲀ(Lyyds/ᛱᛸᛳᛵ;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Lyyds/ᛱᛸᛳᛵ;->ᛱᛳᲇ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᲈᲈᲁᛱ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object p0, p0, Lyyds/ᲈᲈᲁᛱ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    :goto_0
    const/4 p0, 0x0

    .line 17
    iput-object p0, p1, Lyyds/ᛱᛸᛳᛵ;->ᛲᛲᲈᲈ:Lyyds/ᲈᲈᲁᛱ;

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    iput-boolean p0, p1, Lyyds/ᛱᛸᛳᛵ;->ᛱᛳᲇ:Z

    .line 21
    .line 22
    iget p0, p1, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 23
    .line 24
    and-int/lit8 p0, p0, -0x21

    .line 25
    .line 26
    iput p0, p1, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 27
    .line 28
    return-void
.end method

.method public final ᛷᲈᲈᲁ(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lyyds/ᛵᲇᛲᛱ;->ᛸᛴᛵᛶ(Landroid/view/View;)Lyyds/ᛱᛸᛳᛵ;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget v0, p1, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0xc

    .line 8
    .line 9
    iget-object v1, p0, Lyyds/ᲈᲈᲁᛱ;->ᛱᲈᲁ:Lyyds/ᛵᲇᛲᛱ;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p1}, Lyyds/ᛱᛸᛳᛵ;->ᛷᛵᲇᲀ()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    iget-object v0, v1, Lyyds/ᛵᲇᛲᛱ;->ᛲᲀᛵᛷ:Lyyds/ᲇᛲᲇᲇ;

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    invoke-virtual {p1}, Lyyds/ᛱᛸᛳᛵ;->ᛲᛴᛳᛲ()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v0, Lyyds/ᲇᛴᲈᲀ;

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    iget-boolean v0, v0, Lyyds/ᲇᛴᲈᲀ;->ᛶᛷᛲᲁ:Z

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, Lyyds/ᛱᛸᛳᛵ;->ᛶᛷᛲᲁ()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-object v0, p0, Lyyds/ᲈᲈᲁᛱ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 48
    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    new-instance v0, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lyyds/ᲈᲈᲁᛱ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 57
    .line 58
    :cond_2
    iput-object p0, p1, Lyyds/ᛱᛸᛳᛵ;->ᛲᛲᲈᲈ:Lyyds/ᲈᲈᲁᛱ;

    .line 59
    .line 60
    const/4 p0, 0x1

    .line 61
    iput-boolean p0, p1, Lyyds/ᛱᛸᛳᛵ;->ᛱᛳᲇ:Z

    .line 62
    .line 63
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_3
    :goto_0
    invoke-virtual {p1}, Lyyds/ᛱᛸᛳᛵ;->ᛶᛷᛲᲁ()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    invoke-virtual {p1}, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_4

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_4
    iget-object p0, v1, Lyyds/ᛵᲇᛲᛱ;->ᛳᲁᲁᲇ:Lyyds/ᛲᛵᲇᛳ;

    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Lyyds/ᛵᲇᛲᛱ;->ᛷᛸᲇᛶ()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    const-string p1, "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."

    .line 90
    .line 91
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_5
    :goto_1
    iput-object p0, p1, Lyyds/ᛱᛸᛳᛵ;->ᛲᛲᲈᲈ:Lyyds/ᲈᲈᲁᛱ;

    .line 100
    .line 101
    const/4 v0, 0x0

    .line 102
    iput-boolean v0, p1, Lyyds/ᛱᛸᛳᛵ;->ᛱᛳᲇ:Z

    .line 103
    .line 104
    iget-object p0, p0, Lyyds/ᲈᲈᲁᛱ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public final ᲀᛲᛳᲀ()Lyyds/ᲈᲁᲇᛳ;
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᲈᲈᲁᛱ;->ᛶᛷᛲᲁ:Lyyds/ᲈᲁᲇᛳ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lyyds/ᲈᲁᲇᛳ;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v1, v0, Lyyds/ᲈᲁᲇᛳ;->ᛲᲈᲁ:Landroid/util/SparseArray;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput v1, v0, Lyyds/ᲈᲁᲇᛳ;->ᛵᛸᛸᛷ:I

    .line 19
    .line 20
    new-instance v1, Ljava/util/IdentityHashMap;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, v0, Lyyds/ᲈᲁᲇᛳ;->ᲀᛲᛳᲀ:Ljava/util/Set;

    .line 30
    .line 31
    iput-object v0, p0, Lyyds/ᲈᲈᲁᛱ;->ᛶᛷᛲᲁ:Lyyds/ᲈᲁᲇᛳ;

    .line 32
    .line 33
    invoke-virtual {p0}, Lyyds/ᲈᲈᲁᛱ;->ᲇᲈᛵᛷ()V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object p0, p0, Lyyds/ᲈᲈᲁᛱ;->ᛶᛷᛲᲁ:Lyyds/ᲈᲁᲇᛳ;

    .line 37
    .line 38
    return-object p0
.end method

.method public final ᲇᲇᲇᛱ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᲈᲈᲁᛱ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lyyds/ᲈᲈᲁᛱ;->ᛶᛷᛲᲁ(I)V

    .line 12
    .line 13
    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 18
    .line 19
    .line 20
    sget-boolean v0, Lyyds/ᛵᲇᛲᛱ;->ᲁᛸᛲᲈ:Z

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget-object p0, p0, Lyyds/ᲈᲈᲁᛱ;->ᛱᲈᲁ:Lyyds/ᛵᲇᛲᛱ;

    .line 25
    .line 26
    iget-object p0, p0, Lyyds/ᛵᲇᛲᛱ;->ᲈᛳ:Lyyds/ᲁᲇᛷᛳ;

    .line 27
    .line 28
    iget-object v0, p0, Lyyds/ᲁᲇᛷᛳ;->ᛵᛸᛸᛷ:[I

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    const/4 v1, -0x1

    .line 33
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 34
    .line 35
    .line 36
    :cond_1
    const/4 v0, 0x0

    .line 37
    iput v0, p0, Lyyds/ᲁᲇᛷᛳ;->ᲇᲈᛵᛷ:I

    .line 38
    .line 39
    :cond_2
    return-void
.end method

.method public final ᲇᲈᛵᛷ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᲈᲈᲁᛱ;->ᛶᛷᛲᲁ:Lyyds/ᲈᲁᲇᛳ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᲈᲈᲁᛱ;->ᛱᲈᲁ:Lyyds/ᛵᲇᛲᛱ;

    .line 6
    .line 7
    iget-object v1, p0, Lyyds/ᛵᲇᛲᛱ;->ᛳᲁᲁᲇ:Lyyds/ᛲᛵᲇᛳ;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-boolean p0, p0, Lyyds/ᛵᲇᛲᛱ;->ᛶᲈᛴᲈ:Z

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    iget-object p0, v0, Lyyds/ᲈᲁᲇᛳ;->ᲀᛲᛳᲀ:Ljava/util/Set;

    .line 16
    .line 17
    invoke-interface {p0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method
