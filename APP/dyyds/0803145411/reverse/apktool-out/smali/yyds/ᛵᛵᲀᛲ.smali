.class public final Lyyds/ᛵᛵᲀᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛱᲈᲁ:[I

.field public final ᛲᛳᛶᲁ:[I

.field public final ᛲᛴᛳᛲ:[[I

.field public final ᛲᲈᲁ:[B

.field public final ᛵᛸᛸᛷ:I

.field public final ᛶᛷᛲᲁ:[I

.field public ᲀᛲᛳᲀ:I

.field public final ᲇᲇᲇᛱ:[I

.field public ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(III[B)V
    .locals 8

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x4

    .line 5
    const/16 v3, 0x100

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    packed-switch p3, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    const-wide v6, -0x61f06e68a836eL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p4, p0, Lyyds/ᛵᛵᲀᛲ;->ᛲᲈᲁ:[B

    .line 24
    .line 25
    iput p1, p0, Lyyds/ᛵᛵᲀᛲ;->ᛵᛸᛸᛷ:I

    .line 26
    .line 27
    iput p2, p0, Lyyds/ᛵᛵᲀᛲ;->ᲀᛲᛳᲀ:I

    .line 28
    .line 29
    new-array p1, v3, [[I

    .line 30
    .line 31
    move p2, v5

    .line 32
    :goto_0
    if-ge p2, v3, :cond_0

    .line 33
    .line 34
    new-array p3, v2, [I

    .line 35
    .line 36
    shl-int/lit8 p4, p2, 0xc

    .line 37
    .line 38
    div-int/2addr p4, v3

    .line 39
    aput p4, p3, v5

    .line 40
    .line 41
    aput p4, p3, v4

    .line 42
    .line 43
    aput p4, p3, v1

    .line 44
    .line 45
    aput-object p3, p1, p2

    .line 46
    .line 47
    add-int/lit8 p2, p2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    iput-object p1, p0, Lyyds/ᛵᛵᲀᛲ;->ᛲᛴᛳᛲ:[[I

    .line 51
    .line 52
    new-array p1, v3, [I

    .line 53
    .line 54
    iput-object p1, p0, Lyyds/ᛵᛵᲀᛲ;->ᲇᲇᲇᛱ:[I

    .line 55
    .line 56
    new-array p1, v3, [I

    .line 57
    .line 58
    iput-object p1, p0, Lyyds/ᛵᛵᲀᛲ;->ᛶᛷᛲᲁ:[I

    .line 59
    .line 60
    new-array p1, v3, [I

    .line 61
    .line 62
    :goto_1
    if-ge v5, v3, :cond_1

    .line 63
    .line 64
    aput v3, p1, v5

    .line 65
    .line 66
    add-int/lit8 v5, v5, 0x1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    iput-object p1, p0, Lyyds/ᛵᛵᲀᛲ;->ᛱᲈᲁ:[I

    .line 70
    .line 71
    new-array p1, v0, [I

    .line 72
    .line 73
    iput-object p1, p0, Lyyds/ᛵᛵᲀᛲ;->ᛲᛳᛶᲁ:[I

    .line 74
    .line 75
    return-void

    .line 76
    :pswitch_0
    const-wide v6, -0x62a70e68a836eL

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    .line 86
    .line 87
    iput-object p4, p0, Lyyds/ᛵᛵᲀᛲ;->ᛲᲈᲁ:[B

    .line 88
    .line 89
    iput p1, p0, Lyyds/ᛵᛵᲀᛲ;->ᛵᛸᛸᛷ:I

    .line 90
    .line 91
    iput p2, p0, Lyyds/ᛵᛵᲀᛲ;->ᲀᛲᛳᲀ:I

    .line 92
    .line 93
    new-array p1, v3, [[I

    .line 94
    .line 95
    move p2, v5

    .line 96
    :goto_2
    if-ge p2, v3, :cond_2

    .line 97
    .line 98
    new-array p3, v2, [I

    .line 99
    .line 100
    shl-int/lit8 p4, p2, 0xc

    .line 101
    .line 102
    div-int/2addr p4, v3

    .line 103
    aput p4, p3, v5

    .line 104
    .line 105
    aput p4, p3, v4

    .line 106
    .line 107
    aput p4, p3, v1

    .line 108
    .line 109
    aput-object p3, p1, p2

    .line 110
    .line 111
    add-int/lit8 p2, p2, 0x1

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_2
    iput-object p1, p0, Lyyds/ᛵᛵᲀᛲ;->ᛲᛴᛳᛲ:[[I

    .line 115
    .line 116
    new-array p1, v3, [I

    .line 117
    .line 118
    iput-object p1, p0, Lyyds/ᛵᛵᲀᛲ;->ᲇᲇᲇᛱ:[I

    .line 119
    .line 120
    new-array p1, v3, [I

    .line 121
    .line 122
    iput-object p1, p0, Lyyds/ᛵᛵᲀᛲ;->ᛶᛷᛲᲁ:[I

    .line 123
    .line 124
    new-array p1, v3, [I

    .line 125
    .line 126
    :goto_3
    if-ge v5, v3, :cond_3

    .line 127
    .line 128
    aput v3, p1, v5

    .line 129
    .line 130
    add-int/lit8 v5, v5, 0x1

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_3
    iput-object p1, p0, Lyyds/ᛵᛵᲀᛲ;->ᛱᲈᲁ:[I

    .line 134
    .line 135
    new-array p1, v0, [I

    .line 136
    .line 137
    iput-object p1, p0, Lyyds/ᛵᛵᲀᛲ;->ᛲᛳᛶᲁ:[I

    .line 138
    .line 139
    return-void

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public ᛲᲈᲁ(III)I
    .locals 13

    .line 1
    iget-object v0, p0, Lyyds/ᛵᛵᲀᛲ;->ᲇᲇᲇᛱ:[I

    .line 2
    .line 3
    aget v0, v0, p2

    .line 4
    .line 5
    add-int/lit8 v1, v0, -0x1

    .line 6
    .line 7
    const/16 v2, 0x3e8

    .line 8
    .line 9
    const/4 v3, -0x1

    .line 10
    move v4, v3

    .line 11
    :cond_0
    :goto_0
    const/16 v5, 0x100

    .line 12
    .line 13
    if-lt v0, v5, :cond_2

    .line 14
    .line 15
    if-ltz v1, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    return v4

    .line 19
    :cond_2
    :goto_1
    const/4 v6, 0x3

    .line 20
    const/4 v7, 0x2

    .line 21
    const/4 v8, 0x0

    .line 22
    iget-object v9, p0, Lyyds/ᛵᛵᲀᛲ;->ᛲᛴᛳᛲ:[[I

    .line 23
    .line 24
    const/4 v10, 0x1

    .line 25
    if-ge v0, v5, :cond_7

    .line 26
    .line 27
    aget-object v11, v9, v0

    .line 28
    .line 29
    aget v12, v11, v10

    .line 30
    .line 31
    sub-int/2addr v12, p2

    .line 32
    if-lt v12, v2, :cond_3

    .line 33
    .line 34
    move v0, v5

    .line 35
    goto :goto_2

    .line 36
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    if-gez v12, :cond_4

    .line 39
    .line 40
    neg-int v12, v12

    .line 41
    :cond_4
    aget v5, v11, v8

    .line 42
    .line 43
    sub-int/2addr v5, p1

    .line 44
    if-gez v5, :cond_5

    .line 45
    .line 46
    neg-int v5, v5

    .line 47
    :cond_5
    add-int/2addr v12, v5

    .line 48
    if-ge v12, v2, :cond_7

    .line 49
    .line 50
    aget v5, v11, v7

    .line 51
    .line 52
    sub-int v5, v5, p3

    .line 53
    .line 54
    if-gez v5, :cond_6

    .line 55
    .line 56
    neg-int v5, v5

    .line 57
    :cond_6
    add-int/2addr v12, v5

    .line 58
    if-ge v12, v2, :cond_7

    .line 59
    .line 60
    aget v4, v11, v6

    .line 61
    .line 62
    move v2, v12

    .line 63
    :cond_7
    :goto_2
    if-ltz v1, :cond_0

    .line 64
    .line 65
    aget-object v5, v9, v1

    .line 66
    .line 67
    aget v9, v5, v10

    .line 68
    .line 69
    sub-int v9, p2, v9

    .line 70
    .line 71
    if-lt v9, v2, :cond_8

    .line 72
    .line 73
    move v1, v3

    .line 74
    goto :goto_0

    .line 75
    :cond_8
    add-int/lit8 v1, v1, -0x1

    .line 76
    .line 77
    if-gez v9, :cond_9

    .line 78
    .line 79
    neg-int v9, v9

    .line 80
    :cond_9
    aget v8, v5, v8

    .line 81
    .line 82
    sub-int/2addr v8, p1

    .line 83
    if-gez v8, :cond_a

    .line 84
    .line 85
    neg-int v8, v8

    .line 86
    :cond_a
    add-int/2addr v9, v8

    .line 87
    if-ge v9, v2, :cond_0

    .line 88
    .line 89
    aget v7, v5, v7

    .line 90
    .line 91
    sub-int v7, v7, p3

    .line 92
    .line 93
    if-gez v7, :cond_b

    .line 94
    .line 95
    neg-int v7, v7

    .line 96
    :cond_b
    add-int/2addr v7, v9

    .line 97
    if-ge v7, v2, :cond_0

    .line 98
    .line 99
    aget v4, v5, v6

    .line 100
    .line 101
    move v2, v7

    .line 102
    goto :goto_0
.end method

.method public ᛵᛸᛸᛷ()[B
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget v2, v0, Lyyds/ᛵᛵᲀᛲ;->ᛵᛸᛸᛷ:I

    .line 5
    .line 6
    const/16 v3, 0x5e5

    .line 7
    .line 8
    if-ge v2, v3, :cond_0

    .line 9
    .line 10
    iput v1, v0, Lyyds/ᛵᛵᲀᛲ;->ᲀᛲᛳᲀ:I

    .line 11
    .line 12
    :cond_0
    iget v4, v0, Lyyds/ᛵᛵᲀᛲ;->ᲀᛲᛳᲀ:I

    .line 13
    .line 14
    add-int/lit8 v5, v4, -0x1

    .line 15
    .line 16
    const/4 v6, 0x3

    .line 17
    div-int/2addr v5, v6

    .line 18
    add-int/lit8 v5, v5, 0x1e

    .line 19
    .line 20
    iput v5, v0, Lyyds/ᛵᛵᲀᛲ;->ᲇᲈᛵᛷ:I

    .line 21
    .line 22
    mul-int/2addr v4, v6

    .line 23
    div-int v4, v2, v4

    .line 24
    .line 25
    div-int/lit8 v5, v4, 0x64

    .line 26
    .line 27
    const/4 v8, 0x0

    .line 28
    :goto_0
    iget-object v9, v0, Lyyds/ᛵᛵᲀᛲ;->ᛲᛳᛶᲁ:[I

    .line 29
    .line 30
    const/16 v10, 0x400

    .line 31
    .line 32
    const/16 v11, 0x100

    .line 33
    .line 34
    const/16 v12, 0x20

    .line 35
    .line 36
    if-ge v8, v12, :cond_1

    .line 37
    .line 38
    mul-int v12, v8, v8

    .line 39
    .line 40
    rsub-int v12, v12, 0x400

    .line 41
    .line 42
    mul-int/2addr v12, v11

    .line 43
    div-int/2addr v12, v10

    .line 44
    mul-int/2addr v12, v10

    .line 45
    aput v12, v9, v8

    .line 46
    .line 47
    add-int/lit8 v8, v8, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    if-ge v2, v3, :cond_2

    .line 51
    .line 52
    move v3, v6

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    rem-int/lit16 v8, v2, 0x1f3

    .line 55
    .line 56
    if-eqz v8, :cond_3

    .line 57
    .line 58
    const/16 v3, 0x5d9

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    rem-int/lit16 v8, v2, 0x1eb

    .line 62
    .line 63
    if-eqz v8, :cond_4

    .line 64
    .line 65
    const/16 v3, 0x5c1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    rem-int/lit16 v8, v2, 0x1e7

    .line 69
    .line 70
    if-eqz v8, :cond_5

    .line 71
    .line 72
    const/16 v3, 0x5b5

    .line 73
    .line 74
    :cond_5
    :goto_1
    const/16 v8, 0x800

    .line 75
    .line 76
    move/from16 v16, v6

    .line 77
    .line 78
    move v15, v10

    .line 79
    const/4 v13, 0x0

    .line 80
    const/4 v14, 0x0

    .line 81
    :goto_2
    iget-object v6, v0, Lyyds/ᛵᛵᲀᛲ;->ᛲᛴᛳᛲ:[[I

    .line 82
    .line 83
    const/16 v17, 0x0

    .line 84
    .line 85
    const/16 v18, 0x4

    .line 86
    .line 87
    const/16 v7, 0xff

    .line 88
    .line 89
    const/16 v19, 0x2

    .line 90
    .line 91
    if-ge v13, v4, :cond_16

    .line 92
    .line 93
    move/from16 v20, v1

    .line 94
    .line 95
    iget-object v1, v0, Lyyds/ᛵᛵᲀᛲ;->ᛲᲈᲁ:[B

    .line 96
    .line 97
    aget-byte v10, v1, v14

    .line 98
    .line 99
    and-int/2addr v10, v7

    .line 100
    shl-int/lit8 v10, v10, 0x4

    .line 101
    .line 102
    add-int/lit8 v22, v14, 0x1

    .line 103
    .line 104
    aget-byte v11, v1, v22

    .line 105
    .line 106
    and-int/2addr v11, v7

    .line 107
    shl-int/lit8 v11, v11, 0x4

    .line 108
    .line 109
    add-int/lit8 v22, v14, 0x2

    .line 110
    .line 111
    aget-byte v1, v1, v22

    .line 112
    .line 113
    and-int/2addr v1, v7

    .line 114
    shl-int/lit8 v1, v1, 0x4

    .line 115
    .line 116
    const v18, 0x7fffffff

    .line 117
    .line 118
    .line 119
    move/from16 v23, v3

    .line 120
    .line 121
    move/from16 v26, v4

    .line 122
    .line 123
    move/from16 v3, v17

    .line 124
    .line 125
    move/from16 v7, v18

    .line 126
    .line 127
    const/16 v24, -0x1

    .line 128
    .line 129
    const/16 v25, -0x1

    .line 130
    .line 131
    move/from16 v18, v1

    .line 132
    .line 133
    move v1, v7

    .line 134
    :goto_3
    iget-object v4, v0, Lyyds/ᛵᛵᲀᛲ;->ᛱᲈᲁ:[I

    .line 135
    .line 136
    move-object/from16 v27, v4

    .line 137
    .line 138
    iget-object v4, v0, Lyyds/ᛵᛵᲀᛲ;->ᛶᛷᛲᲁ:[I

    .line 139
    .line 140
    move-object/from16 v28, v4

    .line 141
    .line 142
    const/16 v4, 0x100

    .line 143
    .line 144
    if-ge v3, v4, :cond_b

    .line 145
    .line 146
    aget-object v4, v6, v3

    .line 147
    .line 148
    aget v29, v4, v17

    .line 149
    .line 150
    move/from16 v30, v3

    .line 151
    .line 152
    sub-int v3, v29, v10

    .line 153
    .line 154
    if-gez v3, :cond_6

    .line 155
    .line 156
    neg-int v3, v3

    .line 157
    :cond_6
    aget v29, v4, v20

    .line 158
    .line 159
    move/from16 v31, v3

    .line 160
    .line 161
    sub-int v3, v29, v11

    .line 162
    .line 163
    if-gez v3, :cond_7

    .line 164
    .line 165
    neg-int v3, v3

    .line 166
    :cond_7
    add-int v3, v31, v3

    .line 167
    .line 168
    aget v4, v4, v19

    .line 169
    .line 170
    sub-int v4, v4, v18

    .line 171
    .line 172
    if-gez v4, :cond_8

    .line 173
    .line 174
    neg-int v4, v4

    .line 175
    :cond_8
    add-int/2addr v3, v4

    .line 176
    if-ge v3, v7, :cond_9

    .line 177
    .line 178
    move v7, v3

    .line 179
    move/from16 v24, v30

    .line 180
    .line 181
    :cond_9
    aget v4, v28, v30

    .line 182
    .line 183
    shr-int/lit8 v4, v4, 0xc

    .line 184
    .line 185
    sub-int/2addr v3, v4

    .line 186
    if-ge v3, v1, :cond_a

    .line 187
    .line 188
    move v1, v3

    .line 189
    move/from16 v25, v30

    .line 190
    .line 191
    :cond_a
    aget v3, v27, v30

    .line 192
    .line 193
    shr-int/lit8 v4, v3, 0xa

    .line 194
    .line 195
    sub-int/2addr v3, v4

    .line 196
    aput v3, v27, v30

    .line 197
    .line 198
    aget v3, v28, v30

    .line 199
    .line 200
    shl-int/lit8 v4, v4, 0xa

    .line 201
    .line 202
    add-int/2addr v3, v4

    .line 203
    aput v3, v28, v30

    .line 204
    .line 205
    add-int/lit8 v3, v30, 0x1

    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_b
    aget v1, v27, v24

    .line 209
    .line 210
    add-int/lit8 v1, v1, 0x40

    .line 211
    .line 212
    aput v1, v27, v24

    .line 213
    .line 214
    aget v1, v28, v24

    .line 215
    .line 216
    const/high16 v3, 0x10000

    .line 217
    .line 218
    sub-int/2addr v1, v3

    .line 219
    aput v1, v28, v24

    .line 220
    .line 221
    aget-object v1, v6, v25

    .line 222
    .line 223
    aget v3, v1, v17

    .line 224
    .line 225
    sub-int v4, v3, v10

    .line 226
    .line 227
    mul-int/2addr v4, v15

    .line 228
    const/16 v7, 0x400

    .line 229
    .line 230
    div-int/2addr v4, v7

    .line 231
    sub-int/2addr v3, v4

    .line 232
    aput v3, v1, v17

    .line 233
    .line 234
    aget v3, v1, v20

    .line 235
    .line 236
    sub-int v4, v3, v11

    .line 237
    .line 238
    mul-int/2addr v4, v15

    .line 239
    div-int/2addr v4, v7

    .line 240
    sub-int/2addr v3, v4

    .line 241
    aput v3, v1, v20

    .line 242
    .line 243
    aget v3, v1, v19

    .line 244
    .line 245
    sub-int v4, v3, v18

    .line 246
    .line 247
    mul-int/2addr v4, v15

    .line 248
    div-int/2addr v4, v7

    .line 249
    sub-int/2addr v3, v4

    .line 250
    aput v3, v1, v19

    .line 251
    .line 252
    if-eqz v12, :cond_11

    .line 253
    .line 254
    sub-int v1, v25, v12

    .line 255
    .line 256
    const/4 v3, -0x1

    .line 257
    if-ge v1, v3, :cond_c

    .line 258
    .line 259
    move v1, v3

    .line 260
    :cond_c
    add-int v3, v25, v12

    .line 261
    .line 262
    const/16 v4, 0x100

    .line 263
    .line 264
    if-le v3, v4, :cond_d

    .line 265
    .line 266
    const/16 v3, 0x100

    .line 267
    .line 268
    :cond_d
    add-int/lit8 v4, v25, 0x1

    .line 269
    .line 270
    add-int/lit8 v25, v25, -0x1

    .line 271
    .line 272
    move/from16 v21, v20

    .line 273
    .line 274
    move/from16 v7, v25

    .line 275
    .line 276
    :goto_4
    if-lt v4, v3, :cond_e

    .line 277
    .line 278
    if-le v7, v1, :cond_11

    .line 279
    .line 280
    :cond_e
    add-int/lit8 v24, v21, 0x1

    .line 281
    .line 282
    aget v21, v9, v21

    .line 283
    .line 284
    const/high16 v25, 0x40000

    .line 285
    .line 286
    if-ge v4, v3, :cond_f

    .line 287
    .line 288
    add-int/lit8 v27, v4, 0x1

    .line 289
    .line 290
    aget-object v4, v6, v4

    .line 291
    .line 292
    :try_start_0
    aget v28, v4, v17

    .line 293
    .line 294
    sub-int v29, v28, v10

    .line 295
    .line 296
    mul-int v29, v29, v21

    .line 297
    .line 298
    div-int v29, v29, v25

    .line 299
    .line 300
    sub-int v28, v28, v29

    .line 301
    .line 302
    aput v28, v4, v17

    .line 303
    .line 304
    aget v28, v4, v20

    .line 305
    .line 306
    sub-int v29, v28, v11

    .line 307
    .line 308
    mul-int v29, v29, v21

    .line 309
    .line 310
    div-int v29, v29, v25

    .line 311
    .line 312
    sub-int v28, v28, v29

    .line 313
    .line 314
    aput v28, v4, v20

    .line 315
    .line 316
    aget v28, v4, v19

    .line 317
    .line 318
    sub-int v29, v28, v18

    .line 319
    .line 320
    mul-int v29, v29, v21

    .line 321
    .line 322
    div-int v29, v29, v25

    .line 323
    .line 324
    sub-int v28, v28, v29

    .line 325
    .line 326
    aput v28, v4, v19
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 327
    .line 328
    :catch_0
    move/from16 v4, v27

    .line 329
    .line 330
    :cond_f
    if-le v7, v1, :cond_10

    .line 331
    .line 332
    add-int/lit8 v27, v7, -0x1

    .line 333
    .line 334
    aget-object v7, v6, v7

    .line 335
    .line 336
    :try_start_1
    aget v28, v7, v17

    .line 337
    .line 338
    sub-int v29, v28, v10

    .line 339
    .line 340
    mul-int v29, v29, v21

    .line 341
    .line 342
    div-int v29, v29, v25

    .line 343
    .line 344
    sub-int v28, v28, v29

    .line 345
    .line 346
    aput v28, v7, v17

    .line 347
    .line 348
    aget v28, v7, v20

    .line 349
    .line 350
    sub-int v29, v28, v11

    .line 351
    .line 352
    mul-int v29, v29, v21

    .line 353
    .line 354
    div-int v29, v29, v25

    .line 355
    .line 356
    sub-int v28, v28, v29

    .line 357
    .line 358
    aput v28, v7, v20

    .line 359
    .line 360
    aget v28, v7, v19

    .line 361
    .line 362
    sub-int v29, v28, v18

    .line 363
    .line 364
    mul-int v29, v29, v21

    .line 365
    .line 366
    div-int v29, v29, v25

    .line 367
    .line 368
    sub-int v28, v28, v29

    .line 369
    .line 370
    aput v28, v7, v19
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 371
    .line 372
    :catch_1
    move/from16 v21, v24

    .line 373
    .line 374
    move/from16 v7, v27

    .line 375
    .line 376
    goto :goto_4

    .line 377
    :cond_10
    move/from16 v21, v24

    .line 378
    .line 379
    goto :goto_4

    .line 380
    :cond_11
    add-int v14, v14, v23

    .line 381
    .line 382
    if-lt v14, v2, :cond_12

    .line 383
    .line 384
    sub-int/2addr v14, v2

    .line 385
    :cond_12
    add-int/lit8 v13, v13, 0x1

    .line 386
    .line 387
    if-nez v5, :cond_13

    .line 388
    .line 389
    move/from16 v5, v20

    .line 390
    .line 391
    :cond_13
    rem-int v1, v13, v5

    .line 392
    .line 393
    if-nez v1, :cond_15

    .line 394
    .line 395
    iget v1, v0, Lyyds/ᛵᛵᲀᛲ;->ᲇᲈᛵᛷ:I

    .line 396
    .line 397
    div-int v1, v15, v1

    .line 398
    .line 399
    sub-int/2addr v15, v1

    .line 400
    div-int/lit8 v1, v8, 0x1e

    .line 401
    .line 402
    sub-int/2addr v8, v1

    .line 403
    shr-int/lit8 v1, v8, 0x6

    .line 404
    .line 405
    move/from16 v3, v20

    .line 406
    .line 407
    if-gt v1, v3, :cond_14

    .line 408
    .line 409
    move/from16 v12, v17

    .line 410
    .line 411
    goto :goto_5

    .line 412
    :cond_14
    move v12, v1

    .line 413
    :goto_5
    mul-int v1, v12, v12

    .line 414
    .line 415
    move/from16 v3, v17

    .line 416
    .line 417
    :goto_6
    if-ge v3, v12, :cond_15

    .line 418
    .line 419
    mul-int v4, v3, v3

    .line 420
    .line 421
    sub-int v4, v1, v4

    .line 422
    .line 423
    const/16 v10, 0x100

    .line 424
    .line 425
    mul-int/2addr v4, v10

    .line 426
    div-int/2addr v4, v1

    .line 427
    mul-int/2addr v4, v15

    .line 428
    aput v4, v9, v3

    .line 429
    .line 430
    add-int/lit8 v3, v3, 0x1

    .line 431
    .line 432
    goto :goto_6

    .line 433
    :cond_15
    move/from16 v3, v23

    .line 434
    .line 435
    move/from16 v4, v26

    .line 436
    .line 437
    const/4 v1, 0x1

    .line 438
    const/16 v10, 0x400

    .line 439
    .line 440
    const/16 v11, 0x100

    .line 441
    .line 442
    goto/16 :goto_2

    .line 443
    .line 444
    :cond_16
    move v10, v11

    .line 445
    move/from16 v1, v17

    .line 446
    .line 447
    :goto_7
    if-ge v1, v10, :cond_17

    .line 448
    .line 449
    aget-object v2, v6, v1

    .line 450
    .line 451
    aget v3, v2, v17

    .line 452
    .line 453
    shr-int/lit8 v3, v3, 0x4

    .line 454
    .line 455
    aput v3, v2, v17

    .line 456
    .line 457
    const/16 v20, 0x1

    .line 458
    .line 459
    aget v3, v2, v20

    .line 460
    .line 461
    shr-int/lit8 v3, v3, 0x4

    .line 462
    .line 463
    aput v3, v2, v20

    .line 464
    .line 465
    aget v3, v2, v19

    .line 466
    .line 467
    shr-int/lit8 v3, v3, 0x4

    .line 468
    .line 469
    aput v3, v2, v19

    .line 470
    .line 471
    aput v1, v2, v16

    .line 472
    .line 473
    add-int/lit8 v1, v1, 0x1

    .line 474
    .line 475
    const/16 v10, 0x100

    .line 476
    .line 477
    goto :goto_7

    .line 478
    :cond_17
    move/from16 v1, v17

    .line 479
    .line 480
    move v2, v1

    .line 481
    move v3, v2

    .line 482
    :goto_8
    iget-object v4, v0, Lyyds/ᛵᛵᲀᛲ;->ᲇᲇᲇᛱ:[I

    .line 483
    .line 484
    const/16 v10, 0x100

    .line 485
    .line 486
    if-ge v1, v10, :cond_1e

    .line 487
    .line 488
    aget-object v5, v6, v1

    .line 489
    .line 490
    const/16 v20, 0x1

    .line 491
    .line 492
    aget v8, v5, v20

    .line 493
    .line 494
    add-int/lit8 v9, v1, 0x1

    .line 495
    .line 496
    move v12, v1

    .line 497
    move v11, v9

    .line 498
    :goto_9
    if-ge v11, v10, :cond_19

    .line 499
    .line 500
    aget-object v10, v6, v11

    .line 501
    .line 502
    aget v10, v10, v20

    .line 503
    .line 504
    if-ge v10, v8, :cond_18

    .line 505
    .line 506
    move v8, v10

    .line 507
    move v12, v11

    .line 508
    :cond_18
    add-int/lit8 v11, v11, 0x1

    .line 509
    .line 510
    const/16 v10, 0x100

    .line 511
    .line 512
    const/16 v20, 0x1

    .line 513
    .line 514
    goto :goto_9

    .line 515
    :cond_19
    aget-object v10, v6, v12

    .line 516
    .line 517
    if-eq v1, v12, :cond_1a

    .line 518
    .line 519
    move/from16 v11, v17

    .line 520
    .line 521
    move/from16 v12, v18

    .line 522
    .line 523
    :goto_a
    if-ge v11, v12, :cond_1b

    .line 524
    .line 525
    aget v13, v10, v11

    .line 526
    .line 527
    aget v14, v5, v11

    .line 528
    .line 529
    aput v14, v10, v11

    .line 530
    .line 531
    aput v13, v5, v11

    .line 532
    .line 533
    add-int/lit8 v11, v11, 0x1

    .line 534
    .line 535
    goto :goto_a

    .line 536
    :cond_1a
    move/from16 v12, v18

    .line 537
    .line 538
    :cond_1b
    if-eq v8, v2, :cond_1d

    .line 539
    .line 540
    add-int/2addr v3, v1

    .line 541
    const/16 v20, 0x1

    .line 542
    .line 543
    shr-int/lit8 v3, v3, 0x1

    .line 544
    .line 545
    aput v3, v4, v2

    .line 546
    .line 547
    :goto_b
    add-int/lit8 v2, v2, 0x1

    .line 548
    .line 549
    if-ge v2, v8, :cond_1c

    .line 550
    .line 551
    aput v1, v4, v2

    .line 552
    .line 553
    goto :goto_b

    .line 554
    :cond_1c
    move v3, v1

    .line 555
    move v2, v8

    .line 556
    :cond_1d
    move v1, v9

    .line 557
    move/from16 v18, v12

    .line 558
    .line 559
    goto :goto_8

    .line 560
    :cond_1e
    add-int/2addr v3, v7

    .line 561
    const/16 v20, 0x1

    .line 562
    .line 563
    shr-int/lit8 v0, v3, 0x1

    .line 564
    .line 565
    aput v0, v4, v2

    .line 566
    .line 567
    add-int/lit8 v2, v2, 0x1

    .line 568
    .line 569
    const/16 v10, 0x100

    .line 570
    .line 571
    :goto_c
    if-ge v2, v10, :cond_1f

    .line 572
    .line 573
    aput v7, v4, v2

    .line 574
    .line 575
    add-int/lit8 v2, v2, 0x1

    .line 576
    .line 577
    goto :goto_c

    .line 578
    :cond_1f
    const/16 v0, 0x300

    .line 579
    .line 580
    new-array v0, v0, [B

    .line 581
    .line 582
    new-array v1, v10, [I

    .line 583
    .line 584
    move/from16 v2, v17

    .line 585
    .line 586
    :goto_d
    if-ge v2, v10, :cond_20

    .line 587
    .line 588
    aget-object v3, v6, v2

    .line 589
    .line 590
    aget v3, v3, v16

    .line 591
    .line 592
    aput v2, v1, v3

    .line 593
    .line 594
    add-int/lit8 v2, v2, 0x1

    .line 595
    .line 596
    goto :goto_d

    .line 597
    :cond_20
    move/from16 v2, v17

    .line 598
    .line 599
    move v3, v2

    .line 600
    :goto_e
    if-ge v2, v10, :cond_21

    .line 601
    .line 602
    aget v4, v1, v2

    .line 603
    .line 604
    add-int/lit8 v5, v3, 0x1

    .line 605
    .line 606
    aget-object v4, v6, v4

    .line 607
    .line 608
    aget v7, v4, v17

    .line 609
    .line 610
    int-to-byte v7, v7

    .line 611
    aput-byte v7, v0, v3

    .line 612
    .line 613
    add-int/lit8 v7, v3, 0x2

    .line 614
    .line 615
    const/16 v20, 0x1

    .line 616
    .line 617
    aget v8, v4, v20

    .line 618
    .line 619
    int-to-byte v8, v8

    .line 620
    aput-byte v8, v0, v5

    .line 621
    .line 622
    add-int/lit8 v3, v3, 0x3

    .line 623
    .line 624
    aget v4, v4, v19

    .line 625
    .line 626
    int-to-byte v4, v4

    .line 627
    aput-byte v4, v0, v7

    .line 628
    .line 629
    add-int/lit8 v2, v2, 0x1

    .line 630
    .line 631
    goto :goto_e

    .line 632
    :cond_21
    return-object v0
.end method
