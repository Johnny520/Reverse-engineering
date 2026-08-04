.class public final Lyyds/ᛶᛶᛵᛶ;
.super Landroid/view/ViewGroup$MarginLayoutParams;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᛳᛶᛳ:I

.field public ᛱᛳᲇ:I

.field public ᛱᛵᲈᛸ:Lyyds/ᛴᲀᲈᛲ;

.field public ᛱᛸᲁᲇ:I

.field public ᛱᲀᲈᛲ:F

.field public ᛱᲈᲁ:I

.field public ᛲᛱᲁᛳ:I

.field public ᛲᛲᲈᲈ:I

.field public ᛲᛳᛴᛸ:I

.field public ᛲᛳᛵᛱ:Z

.field public ᛲᛳᛶᲁ:I

.field public ᛲᛴᛳᛲ:I

.field public ᛲᛶᛱᲈ:I

.field public ᛲᲀᛲᛲ:I

.field public ᛲᲀᛵᛷ:I

.field public ᛲᲈᲁ:I

.field public ᛳᛴᲇᛶ:Ljava/lang/String;

.field public ᛳᛷᛶᛲ:I

.field public ᛳᛸᛴᛶ:I

.field public ᛳᲁᲁᲇ:I

.field public ᛴᛵᛷᛳ:I

.field public ᛴᛸᛴᛸ:I

.field public ᛴᛸᲁᛵ:Z

.field public ᛵᛲᛵᲁ:Z

.field public ᛵᛲᛶᲁ:I

.field public ᛵᛶᛲᲀ:F

.field public ᛵᛸᛵᛶ:F

.field public ᛵᛸᛸᛷ:I

.field public ᛵᲀᛵᛸ:I

.field public ᛵᲀᲈᛴ:I

.field public ᛵᲈᲇᛵ:Z

.field public ᛶᛳᛶᛵ:I

.field public ᛶᛴᛱᛲ:F

.field public ᛶᛵᛸᛲ:Z

.field public ᛶᛵᲁᲈ:I

.field public ᛶᛷᛲᲁ:I

.field public ᛶᛸᲀᲁ:I

.field public ᛶᲀᲈᲇ:I

.field public ᛶᲈᛴᲈ:I

.field public ᛷᛲᲈᛱ:I

.field public ᛷᛴᛴᲁ:I

.field public ᛷᛵᲇᲀ:I

.field public ᛷᛶᛷᲀ:Ljava/lang/String;

.field public ᛷᛸᲇᛶ:I

.field public ᛷᲇᛲᛱ:F

.field public ᛷᲈᛳᛲ:Z

.field public ᛷᲈᲈᲁ:I

.field public ᛸᛴᛵᛶ:I

.field public ᛸᛸᛷᛱ:I

.field public ᛸᲀᛷᛲ:I

.field public ᲀᛲᛱᛱ:F

.field public ᲀᛲᛲᲇ:I

.field public ᲀᛲᛳᲀ:F

.field public ᲀᛳᛷᛷ:I

.field public ᲀᛴᲁᲈ:F

.field public ᲀᛸᲈᲁ:I

.field public ᲁᛵᲁᲁ:I

.field public ᲁᛶᛴᛸ:I

.field public ᲇᛱᛲ:I

.field public ᲇᛶᲀᲇ:I

.field public ᲇᲇᲇᛱ:I

.field public ᲇᲇᲈᲀ:I

.field public ᲇᲈᛵᛷ:Z

.field public ᲈᛲᛳᛶ:F

.field public ᲈᛳ:I

.field public ᲈᛳᛵᛴ:Z

.field public ᲈᛷᲈᛶ:F

.field public ᲈᲀᛲᲀ:I


# virtual methods
.method public final resolveLayoutDirection(I)V
    .locals 13

    .line 1
    iget v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 2
    .line 3
    iget v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->resolveLayoutDirection(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/ViewGroup$MarginLayoutParams;->getLayoutDirection()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    if-ne v3, p1, :cond_0

    .line 15
    .line 16
    move p1, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move p1, v2

    .line 19
    :goto_0
    const/4 v4, -0x1

    .line 20
    iput v4, p0, Lyyds/ᛶᛶᛵᛶ;->ᲀᛸᲈᲁ:I

    .line 21
    .line 22
    iput v4, p0, Lyyds/ᛶᛶᛵᛶ;->ᲀᛳᛷᛷ:I

    .line 23
    .line 24
    iput v4, p0, Lyyds/ᛶᛶᛵᛶ;->ᲈᛳ:I

    .line 25
    .line 26
    iput v4, p0, Lyyds/ᛶᛶᛵᛶ;->ᛸᲀᛷᛲ:I

    .line 27
    .line 28
    iget v5, p0, Lyyds/ᛶᛶᛵᛶ;->ᛵᲀᲈᛴ:I

    .line 29
    .line 30
    iput v5, p0, Lyyds/ᛶᛶᛵᛶ;->ᛴᛵᛷᛳ:I

    .line 31
    .line 32
    iget v5, p0, Lyyds/ᛶᛶᛵᛶ;->ᲈᲀᛲᲀ:I

    .line 33
    .line 34
    iput v5, p0, Lyyds/ᛶᛶᛵᛶ;->ᛵᛲᛶᲁ:I

    .line 35
    .line 36
    iget v5, p0, Lyyds/ᛶᛶᛵᛶ;->ᲀᛲᛱᛱ:F

    .line 37
    .line 38
    iput v5, p0, Lyyds/ᛶᛶᛵᛶ;->ᛵᛸᛵᛶ:F

    .line 39
    .line 40
    iget v6, p0, Lyyds/ᛶᛶᛵᛶ;->ᛲᲈᲁ:I

    .line 41
    .line 42
    iput v6, p0, Lyyds/ᛶᛶᛵᛶ;->ᲇᛶᲀᲇ:I

    .line 43
    .line 44
    iget v7, p0, Lyyds/ᛶᛶᛵᛶ;->ᛵᛸᛸᛷ:I

    .line 45
    .line 46
    iput v7, p0, Lyyds/ᛶᛶᛵᛶ;->ᛶᛵᲁᲈ:I

    .line 47
    .line 48
    iget v8, p0, Lyyds/ᛶᛶᛵᛶ;->ᲀᛲᛳᲀ:F

    .line 49
    .line 50
    iput v8, p0, Lyyds/ᛶᛶᛵᛶ;->ᲈᛲᛳᛶ:F

    .line 51
    .line 52
    iget v9, p0, Lyyds/ᛶᛶᛵᛶ;->ᲀᛲᛲᲇ:I

    .line 53
    .line 54
    const/high16 v10, -0x80000000

    .line 55
    .line 56
    if-eqz p1, :cond_a

    .line 57
    .line 58
    if-eq v9, v4, :cond_1

    .line 59
    .line 60
    iput v9, p0, Lyyds/ᛶᛶᛵᛶ;->ᲀᛸᲈᲁ:I

    .line 61
    .line 62
    :goto_1
    move v2, v3

    .line 63
    goto :goto_2

    .line 64
    :cond_1
    iget p1, p0, Lyyds/ᛶᛶᛵᛶ;->ᛳᛸᛴᛶ:I

    .line 65
    .line 66
    if-eq p1, v4, :cond_2

    .line 67
    .line 68
    iput p1, p0, Lyyds/ᛶᛶᛵᛶ;->ᲀᛳᛷᛷ:I

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    :goto_2
    iget p1, p0, Lyyds/ᛶᛶᛵᛶ;->ᛶᲈᛴᲈ:I

    .line 72
    .line 73
    if-eq p1, v4, :cond_3

    .line 74
    .line 75
    iput p1, p0, Lyyds/ᛶᛶᛵᛶ;->ᛸᲀᛷᛲ:I

    .line 76
    .line 77
    move v2, v3

    .line 78
    :cond_3
    iget v11, p0, Lyyds/ᛶᛶᛵᛶ;->ᛶᛸᲀᲁ:I

    .line 79
    .line 80
    if-eq v11, v4, :cond_4

    .line 81
    .line 82
    iput v11, p0, Lyyds/ᛶᛶᛵᛶ;->ᲈᛳ:I

    .line 83
    .line 84
    move v2, v3

    .line 85
    :cond_4
    iget v12, p0, Lyyds/ᛶᛶᛵᛶ;->ᛲᛳᛴᛸ:I

    .line 86
    .line 87
    if-eq v12, v10, :cond_5

    .line 88
    .line 89
    iput v12, p0, Lyyds/ᛶᛶᛵᛶ;->ᛵᛲᛶᲁ:I

    .line 90
    .line 91
    :cond_5
    iget v12, p0, Lyyds/ᛶᛶᛵᛶ;->ᛷᛸᲇᛶ:I

    .line 92
    .line 93
    if-eq v12, v10, :cond_6

    .line 94
    .line 95
    iput v12, p0, Lyyds/ᛶᛶᛵᛶ;->ᛴᛵᛷᛳ:I

    .line 96
    .line 97
    :cond_6
    const/high16 v10, 0x3f800000    # 1.0f

    .line 98
    .line 99
    if-eqz v2, :cond_7

    .line 100
    .line 101
    sub-float v2, v10, v5

    .line 102
    .line 103
    iput v2, p0, Lyyds/ᛶᛶᛵᛶ;->ᛵᛸᛵᛶ:F

    .line 104
    .line 105
    :cond_7
    iget-boolean v2, p0, Lyyds/ᛶᛶᛵᛶ;->ᛴᛸᲁᛵ:Z

    .line 106
    .line 107
    if-eqz v2, :cond_10

    .line 108
    .line 109
    iget v2, p0, Lyyds/ᛶᛶᛵᛶ;->ᛴᛸᛴᛸ:I

    .line 110
    .line 111
    if-ne v2, v3, :cond_10

    .line 112
    .line 113
    iget-boolean v2, p0, Lyyds/ᛶᛶᛵᛶ;->ᲇᲈᛵᛷ:Z

    .line 114
    .line 115
    if-eqz v2, :cond_10

    .line 116
    .line 117
    const/high16 v2, -0x40800000    # -1.0f

    .line 118
    .line 119
    cmpl-float v3, v8, v2

    .line 120
    .line 121
    if-eqz v3, :cond_8

    .line 122
    .line 123
    sub-float/2addr v10, v8

    .line 124
    iput v10, p0, Lyyds/ᛶᛶᛵᛶ;->ᲈᛲᛳᛶ:F

    .line 125
    .line 126
    iput v4, p0, Lyyds/ᛶᛶᛵᛶ;->ᲇᛶᲀᲇ:I

    .line 127
    .line 128
    iput v4, p0, Lyyds/ᛶᛶᛵᛶ;->ᛶᛵᲁᲈ:I

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_8
    if-eq v6, v4, :cond_9

    .line 132
    .line 133
    iput v6, p0, Lyyds/ᛶᛶᛵᛶ;->ᛶᛵᲁᲈ:I

    .line 134
    .line 135
    iput v4, p0, Lyyds/ᛶᛶᛵᛶ;->ᲇᛶᲀᲇ:I

    .line 136
    .line 137
    iput v2, p0, Lyyds/ᛶᛶᛵᛶ;->ᲈᛲᛳᛶ:F

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_9
    if-eq v7, v4, :cond_10

    .line 141
    .line 142
    iput v7, p0, Lyyds/ᛶᛶᛵᛶ;->ᲇᛶᲀᲇ:I

    .line 143
    .line 144
    iput v4, p0, Lyyds/ᛶᛶᛵᛶ;->ᛶᛵᲁᲈ:I

    .line 145
    .line 146
    iput v2, p0, Lyyds/ᛶᛶᛵᛶ;->ᲈᛲᛳᛶ:F

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_a
    if-eq v9, v4, :cond_b

    .line 150
    .line 151
    iput v9, p0, Lyyds/ᛶᛶᛵᛶ;->ᛸᲀᛷᛲ:I

    .line 152
    .line 153
    :cond_b
    iget p1, p0, Lyyds/ᛶᛶᛵᛶ;->ᛳᛸᛴᛶ:I

    .line 154
    .line 155
    if-eq p1, v4, :cond_c

    .line 156
    .line 157
    iput p1, p0, Lyyds/ᛶᛶᛵᛶ;->ᲈᛳ:I

    .line 158
    .line 159
    :cond_c
    iget p1, p0, Lyyds/ᛶᛶᛵᛶ;->ᛶᲈᛴᲈ:I

    .line 160
    .line 161
    if-eq p1, v4, :cond_d

    .line 162
    .line 163
    iput p1, p0, Lyyds/ᛶᛶᛵᛶ;->ᲀᛸᲈᲁ:I

    .line 164
    .line 165
    :cond_d
    iget v11, p0, Lyyds/ᛶᛶᛵᛶ;->ᛶᛸᲀᲁ:I

    .line 166
    .line 167
    if-eq v11, v4, :cond_e

    .line 168
    .line 169
    iput v11, p0, Lyyds/ᛶᛶᛵᛶ;->ᲀᛳᛷᛷ:I

    .line 170
    .line 171
    :cond_e
    iget v2, p0, Lyyds/ᛶᛶᛵᛶ;->ᛲᛳᛴᛸ:I

    .line 172
    .line 173
    if-eq v2, v10, :cond_f

    .line 174
    .line 175
    iput v2, p0, Lyyds/ᛶᛶᛵᛶ;->ᛴᛵᛷᛳ:I

    .line 176
    .line 177
    :cond_f
    iget v2, p0, Lyyds/ᛶᛶᛵᛶ;->ᛷᛸᲇᛶ:I

    .line 178
    .line 179
    if-eq v2, v10, :cond_10

    .line 180
    .line 181
    iput v2, p0, Lyyds/ᛶᛶᛵᛶ;->ᛵᛲᛶᲁ:I

    .line 182
    .line 183
    :cond_10
    :goto_3
    if-ne p1, v4, :cond_14

    .line 184
    .line 185
    if-ne v11, v4, :cond_14

    .line 186
    .line 187
    iget p1, p0, Lyyds/ᛶᛶᛵᛶ;->ᛳᛸᛴᛶ:I

    .line 188
    .line 189
    if-ne p1, v4, :cond_14

    .line 190
    .line 191
    if-ne v9, v4, :cond_14

    .line 192
    .line 193
    iget p1, p0, Lyyds/ᛶᛶᛵᛶ;->ᛶᛷᛲᲁ:I

    .line 194
    .line 195
    if-eq p1, v4, :cond_11

    .line 196
    .line 197
    iput p1, p0, Lyyds/ᛶᛶᛵᛶ;->ᲀᛸᲈᲁ:I

    .line 198
    .line 199
    iget p1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 200
    .line 201
    if-gtz p1, :cond_12

    .line 202
    .line 203
    if-lez v1, :cond_12

    .line 204
    .line 205
    iput v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 206
    .line 207
    goto :goto_4

    .line 208
    :cond_11
    iget p1, p0, Lyyds/ᛶᛶᛵᛶ;->ᛱᲈᲁ:I

    .line 209
    .line 210
    if-eq p1, v4, :cond_12

    .line 211
    .line 212
    iput p1, p0, Lyyds/ᛶᛶᛵᛶ;->ᲀᛳᛷᛷ:I

    .line 213
    .line 214
    iget p1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 215
    .line 216
    if-gtz p1, :cond_12

    .line 217
    .line 218
    if-lez v1, :cond_12

    .line 219
    .line 220
    iput v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 221
    .line 222
    :cond_12
    :goto_4
    iget p1, p0, Lyyds/ᛶᛶᛵᛶ;->ᛲᛴᛳᛲ:I

    .line 223
    .line 224
    if-eq p1, v4, :cond_13

    .line 225
    .line 226
    iput p1, p0, Lyyds/ᛶᛶᛵᛶ;->ᲈᛳ:I

    .line 227
    .line 228
    iget p1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 229
    .line 230
    if-gtz p1, :cond_14

    .line 231
    .line 232
    if-lez v0, :cond_14

    .line 233
    .line 234
    iput v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 235
    .line 236
    return-void

    .line 237
    :cond_13
    iget p1, p0, Lyyds/ᛶᛶᛵᛶ;->ᲇᲇᲇᛱ:I

    .line 238
    .line 239
    if-eq p1, v4, :cond_14

    .line 240
    .line 241
    iput p1, p0, Lyyds/ᛶᛶᛵᛶ;->ᛸᲀᛷᛲ:I

    .line 242
    .line 243
    iget p1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 244
    .line 245
    if-gtz p1, :cond_14

    .line 246
    .line 247
    if-lez v0, :cond_14

    .line 248
    .line 249
    iput v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 250
    .line 251
    :cond_14
    return-void
.end method

.method public final ᛲᲈᲁ()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lyyds/ᛶᛶᛵᛶ;->ᛴᛸᲁᛵ:Z

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    iput-boolean v1, p0, Lyyds/ᛶᛶᛵᛶ;->ᛵᛲᛵᲁ:Z

    .line 6
    .line 7
    iput-boolean v1, p0, Lyyds/ᛶᛶᛵᛶ;->ᲈᛳᛵᛴ:Z

    .line 8
    .line 9
    iget v2, p0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 10
    .line 11
    const/4 v3, -0x2

    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    iget-boolean v4, p0, Lyyds/ᛶᛶᛵᛶ;->ᛵᲈᲇᛵ:Z

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    iput-boolean v0, p0, Lyyds/ᛶᛶᛵᛶ;->ᛵᛲᛵᲁ:Z

    .line 19
    .line 20
    iget v4, p0, Lyyds/ᛶᛶᛵᛶ;->ᛸᛴᛵᛶ:I

    .line 21
    .line 22
    if-nez v4, :cond_0

    .line 23
    .line 24
    iput v1, p0, Lyyds/ᛶᛶᛵᛶ;->ᛸᛴᛵᛶ:I

    .line 25
    .line 26
    :cond_0
    iget v4, p0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 27
    .line 28
    if-ne v4, v3, :cond_1

    .line 29
    .line 30
    iget-boolean v5, p0, Lyyds/ᛶᛶᛵᛶ;->ᛶᛵᛸᛲ:Z

    .line 31
    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    iput-boolean v0, p0, Lyyds/ᛶᛶᛵᛶ;->ᲈᛳᛵᛴ:Z

    .line 35
    .line 36
    iget v5, p0, Lyyds/ᛶᛶᛵᛶ;->ᲁᛶᛴᛸ:I

    .line 37
    .line 38
    if-nez v5, :cond_1

    .line 39
    .line 40
    iput v1, p0, Lyyds/ᛶᛶᛵᛶ;->ᲁᛶᛴᛸ:I

    .line 41
    .line 42
    :cond_1
    const/4 v5, -0x1

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    if-ne v2, v5, :cond_3

    .line 46
    .line 47
    :cond_2
    iput-boolean v0, p0, Lyyds/ᛶᛶᛵᛶ;->ᛵᛲᛵᲁ:Z

    .line 48
    .line 49
    if-nez v2, :cond_3

    .line 50
    .line 51
    iget v2, p0, Lyyds/ᛶᛶᛵᛶ;->ᛸᛴᛵᛶ:I

    .line 52
    .line 53
    if-ne v2, v1, :cond_3

    .line 54
    .line 55
    iput v3, p0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 56
    .line 57
    iput-boolean v1, p0, Lyyds/ᛶᛶᛵᛶ;->ᛵᲈᲇᛵ:Z

    .line 58
    .line 59
    :cond_3
    if-eqz v4, :cond_4

    .line 60
    .line 61
    if-ne v4, v5, :cond_5

    .line 62
    .line 63
    :cond_4
    iput-boolean v0, p0, Lyyds/ᛶᛶᛵᛶ;->ᲈᛳᛵᛴ:Z

    .line 64
    .line 65
    if-nez v4, :cond_5

    .line 66
    .line 67
    iget v0, p0, Lyyds/ᛶᛶᛵᛶ;->ᲁᛶᛴᛸ:I

    .line 68
    .line 69
    if-ne v0, v1, :cond_5

    .line 70
    .line 71
    iput v3, p0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 72
    .line 73
    iput-boolean v1, p0, Lyyds/ᛶᛶᛵᛶ;->ᛶᛵᛸᛲ:Z

    .line 74
    .line 75
    :cond_5
    iget v0, p0, Lyyds/ᛶᛶᛵᛶ;->ᲀᛲᛳᲀ:F

    .line 76
    .line 77
    const/high16 v2, -0x40800000    # -1.0f

    .line 78
    .line 79
    cmpl-float v0, v0, v2

    .line 80
    .line 81
    if-nez v0, :cond_7

    .line 82
    .line 83
    iget v0, p0, Lyyds/ᛶᛶᛵᛶ;->ᛲᲈᲁ:I

    .line 84
    .line 85
    if-ne v0, v5, :cond_7

    .line 86
    .line 87
    iget v0, p0, Lyyds/ᛶᛶᛵᛶ;->ᛵᛸᛸᛷ:I

    .line 88
    .line 89
    if-eq v0, v5, :cond_6

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_6
    return-void

    .line 93
    :cond_7
    :goto_0
    iput-boolean v1, p0, Lyyds/ᛶᛶᛵᛶ;->ᛴᛸᲁᛵ:Z

    .line 94
    .line 95
    iput-boolean v1, p0, Lyyds/ᛶᛶᛵᛶ;->ᛵᛲᛵᲁ:Z

    .line 96
    .line 97
    iput-boolean v1, p0, Lyyds/ᛶᛶᛵᛶ;->ᲈᛳᛵᛴ:Z

    .line 98
    .line 99
    iget-object v0, p0, Lyyds/ᛶᛶᛵᛶ;->ᛱᛵᲈᛸ:Lyyds/ᛴᲀᲈᛲ;

    .line 100
    .line 101
    instance-of v1, v0, Lyyds/ᲀᲀᲁᛳ;

    .line 102
    .line 103
    if-nez v1, :cond_8

    .line 104
    .line 105
    new-instance v0, Lyyds/ᲀᲀᲁᛳ;

    .line 106
    .line 107
    invoke-direct {v0}, Lyyds/ᲀᲀᲁᛳ;-><init>()V

    .line 108
    .line 109
    .line 110
    iput-object v0, p0, Lyyds/ᛶᛶᛵᛶ;->ᛱᛵᲈᛸ:Lyyds/ᛴᲀᲈᛲ;

    .line 111
    .line 112
    :cond_8
    check-cast v0, Lyyds/ᲀᲀᲁᛳ;

    .line 113
    .line 114
    iget p0, p0, Lyyds/ᛶᛶᛵᛶ;->ᛴᛸᛴᛸ:I

    .line 115
    .line 116
    invoke-virtual {v0, p0}, Lyyds/ᲀᲀᲁᛳ;->ᛲᲀᛵᛷ(I)V

    .line 117
    .line 118
    .line 119
    return-void
.end method
