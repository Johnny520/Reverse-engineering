.class public final Lyyds/ᛲᛶᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᛳᲇ:I

.field public ᛱᲈᲁ:I

.field public ᛲᛲᲈᲈ:I

.field public ᛲᛳᛶᲁ:Z

.field public ᛲᛴᛳᛲ:I

.field public final synthetic ᛲᲈᲁ:I

.field public final ᛳᲁᲁᲇ:[I

.field public final ᛵᛸᛸᛷ:[I

.field public final ᛶᛳᛶᛵ:[B

.field public final ᛶᛷᛲᲁ:[I

.field public ᛷᛲᲈᛱ:I

.field public ᛷᛵᲇᲀ:I

.field public ᛷᲈᲈᲁ:I

.field public final ᲀᛲᛳᲀ:I

.field public ᲇᛱᛲ:I

.field public final ᲇᲇᲇᛱ:[I

.field public ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(I[B)V
    .locals 8

    .line 1
    iput p1, p0, Lyyds/ᛲᛶᛵ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    const/16 v0, 0x100

    .line 4
    .line 5
    const/16 v1, 0x11

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/16 v3, 0x138b

    .line 9
    .line 10
    const/16 v4, 0x8

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    packed-switch p1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    const-wide v6, -0x61d9ae68a836eL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    array-length p1, p2

    .line 28
    new-array v6, p1, [I

    .line 29
    .line 30
    :goto_0
    if-ge v5, p1, :cond_0

    .line 31
    .line 32
    aget-byte v7, p2, v5

    .line 33
    .line 34
    and-int/lit16 v7, v7, 0xff

    .line 35
    .line 36
    aput v7, v6, v5

    .line 37
    .line 38
    add-int/lit8 v5, v5, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iput-object v6, p0, Lyyds/ᛲᛶᛵ;->ᛵᛸᛸᛷ:[I

    .line 42
    .line 43
    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    iput p1, p0, Lyyds/ᛲᛶᛵ;->ᲀᛲᛳᲀ:I

    .line 48
    .line 49
    new-array p1, v3, [I

    .line 50
    .line 51
    iput-object p1, p0, Lyyds/ᛲᛶᛵ;->ᲇᲇᲇᛱ:[I

    .line 52
    .line 53
    new-array p1, v3, [I

    .line 54
    .line 55
    iput-object p1, p0, Lyyds/ᛲᛶᛵ;->ᛶᛷᛲᲁ:[I

    .line 56
    .line 57
    new-array p1, v1, [I

    .line 58
    .line 59
    fill-array-data p1, :array_0

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, Lyyds/ᛲᛶᛵ;->ᛳᲁᲁᲇ:[I

    .line 63
    .line 64
    new-array p1, v0, [B

    .line 65
    .line 66
    iput-object p1, p0, Lyyds/ᛲᛶᛵ;->ᛶᛳᛶᛵ:[B

    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_0
    const-wide v6, -0x621d7e68a836eL

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    .line 79
    .line 80
    array-length p1, p2

    .line 81
    new-array v6, p1, [I

    .line 82
    .line 83
    :goto_1
    if-ge v5, p1, :cond_1

    .line 84
    .line 85
    aget-byte v7, p2, v5

    .line 86
    .line 87
    and-int/lit16 v7, v7, 0xff

    .line 88
    .line 89
    aput v7, v6, v5

    .line 90
    .line 91
    add-int/lit8 v5, v5, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_1
    iput-object v6, p0, Lyyds/ᛲᛶᛵ;->ᛵᛸᛸᛷ:[I

    .line 95
    .line 96
    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    iput p1, p0, Lyyds/ᛲᛶᛵ;->ᲀᛲᛳᲀ:I

    .line 101
    .line 102
    new-array p1, v3, [I

    .line 103
    .line 104
    iput-object p1, p0, Lyyds/ᛲᛶᛵ;->ᲇᲇᲇᛱ:[I

    .line 105
    .line 106
    new-array p1, v3, [I

    .line 107
    .line 108
    iput-object p1, p0, Lyyds/ᛲᛶᛵ;->ᛶᛷᛲᲁ:[I

    .line 109
    .line 110
    new-array p1, v1, [I

    .line 111
    .line 112
    fill-array-data p1, :array_1

    .line 113
    .line 114
    .line 115
    iput-object p1, p0, Lyyds/ᛲᛶᛵ;->ᛳᲁᲁᲇ:[I

    .line 116
    .line 117
    new-array p1, v0, [B

    .line 118
    .line 119
    iput-object p1, p0, Lyyds/ᛲᛶᛵ;->ᛶᛳᛶᛵ:[B

    .line 120
    .line 121
    return-void

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    :array_0
    .array-data 4
        0x0
        0x1
        0x3
        0x7
        0xf
        0x1f
        0x3f
        0x7f
        0xff
        0x1ff
        0x3ff
        0x7ff
        0xfff
        0x1fff
        0x3fff
        0x7fff
        0xffff
    .end array-data

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    :array_1
    .array-data 4
        0x0
        0x1
        0x3
        0x7
        0xf
        0x1f
        0x3f
        0x7f
        0xff
        0x1ff
        0x3ff
        0x7ff
        0xfff
        0x1fff
        0x3fff
        0x7fff
        0xffff
    .end array-data
.end method


# virtual methods
.method public final ᛲᲈᲁ(ILjava/io/BufferedOutputStream;)V
    .locals 10

    .line 1
    iget v0, p0, Lyyds/ᛲᛶᛵ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    const/16 v1, 0x1000

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    iget-object v3, p0, Lyyds/ᛲᛶᛵ;->ᛳᲁᲁᲇ:[I

    .line 8
    .line 9
    const/16 v4, 0x8

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    iget-object v7, p0, Lyyds/ᛲᛶᛵ;->ᛶᛳᛶᛵ:[B

    .line 14
    .line 15
    const/16 v8, 0xfe

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget v0, p0, Lyyds/ᛲᛶᛵ;->ᛲᛲᲈᲈ:I

    .line 21
    .line 22
    iget v9, p0, Lyyds/ᛲᛶᛵ;->ᛱᛳᲇ:I

    .line 23
    .line 24
    aget v3, v3, v9

    .line 25
    .line 26
    and-int/2addr v0, v3

    .line 27
    iput v0, p0, Lyyds/ᛲᛶᛵ;->ᛲᛲᲈᲈ:I

    .line 28
    .line 29
    if-lez v9, :cond_0

    .line 30
    .line 31
    shl-int v3, p1, v9

    .line 32
    .line 33
    or-int/2addr v0, v3

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v0, p1

    .line 36
    :goto_0
    iput v0, p0, Lyyds/ᛲᛶᛵ;->ᛲᛲᲈᲈ:I

    .line 37
    .line 38
    iget v0, p0, Lyyds/ᛲᛶᛵ;->ᲇᲈᛵᛷ:I

    .line 39
    .line 40
    add-int/2addr v9, v0

    .line 41
    iput v9, p0, Lyyds/ᛲᛶᛵ;->ᛱᛳᲇ:I

    .line 42
    .line 43
    :goto_1
    iget v0, p0, Lyyds/ᛲᛶᛵ;->ᛱᛳᲇ:I

    .line 44
    .line 45
    if-lt v0, v4, :cond_2

    .line 46
    .line 47
    iget v0, p0, Lyyds/ᛲᛶᛵ;->ᛲᛲᲈᲈ:I

    .line 48
    .line 49
    and-int/lit16 v0, v0, 0xff

    .line 50
    .line 51
    int-to-byte v0, v0

    .line 52
    iget v3, p0, Lyyds/ᛲᛶᛵ;->ᲇᛱᛲ:I

    .line 53
    .line 54
    add-int/lit8 v9, v3, 0x1

    .line 55
    .line 56
    iput v9, p0, Lyyds/ᛲᛶᛵ;->ᲇᛱᛲ:I

    .line 57
    .line 58
    aput-byte v0, v7, v3

    .line 59
    .line 60
    if-lt v9, v8, :cond_1

    .line 61
    .line 62
    if-lez v9, :cond_1

    .line 63
    .line 64
    invoke-virtual {p2, v9}, Ljava/io/OutputStream;->write(I)V

    .line 65
    .line 66
    .line 67
    iget v0, p0, Lyyds/ᛲᛶᛵ;->ᲇᛱᛲ:I

    .line 68
    .line 69
    invoke-virtual {p2, v7, v6, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 70
    .line 71
    .line 72
    iput v6, p0, Lyyds/ᛲᛶᛵ;->ᲇᛱᛲ:I

    .line 73
    .line 74
    :cond_1
    iget v0, p0, Lyyds/ᛲᛶᛵ;->ᛲᛲᲈᲈ:I

    .line 75
    .line 76
    shr-int/2addr v0, v4

    .line 77
    iput v0, p0, Lyyds/ᛲᛶᛵ;->ᛲᛲᲈᲈ:I

    .line 78
    .line 79
    iget v0, p0, Lyyds/ᛲᛶᛵ;->ᛱᛳᲇ:I

    .line 80
    .line 81
    sub-int/2addr v0, v4

    .line 82
    iput v0, p0, Lyyds/ᛲᛶᛵ;->ᛱᛳᲇ:I

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    iget v0, p0, Lyyds/ᛲᛶᛵ;->ᛱᲈᲁ:I

    .line 86
    .line 87
    iget v3, p0, Lyyds/ᛲᛶᛵ;->ᛲᛴᛳᛲ:I

    .line 88
    .line 89
    if-gt v0, v3, :cond_3

    .line 90
    .line 91
    iget-boolean v0, p0, Lyyds/ᛲᛶᛵ;->ᛲᛳᛶᲁ:Z

    .line 92
    .line 93
    if-eqz v0, :cond_6

    .line 94
    .line 95
    :cond_3
    iget-boolean v0, p0, Lyyds/ᛲᛶᛵ;->ᛲᛳᛶᲁ:Z

    .line 96
    .line 97
    if-eqz v0, :cond_4

    .line 98
    .line 99
    iget v0, p0, Lyyds/ᛲᛶᛵ;->ᛷᲈᲈᲁ:I

    .line 100
    .line 101
    iput v0, p0, Lyyds/ᛲᛶᛵ;->ᲇᲈᛵᛷ:I

    .line 102
    .line 103
    shl-int v0, v5, v0

    .line 104
    .line 105
    sub-int/2addr v0, v5

    .line 106
    iput v0, p0, Lyyds/ᛲᛶᛵ;->ᛲᛴᛳᛲ:I

    .line 107
    .line 108
    iput-boolean v6, p0, Lyyds/ᛲᛶᛵ;->ᛲᛳᛶᲁ:Z

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_4
    iget v0, p0, Lyyds/ᛲᛶᛵ;->ᲇᲈᛵᛷ:I

    .line 112
    .line 113
    add-int/2addr v0, v5

    .line 114
    iput v0, p0, Lyyds/ᛲᛶᛵ;->ᲇᲈᛵᛷ:I

    .line 115
    .line 116
    if-ne v0, v2, :cond_5

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_5
    shl-int v0, v5, v0

    .line 120
    .line 121
    add-int/lit8 v1, v0, -0x1

    .line 122
    .line 123
    :goto_2
    iput v1, p0, Lyyds/ᛲᛶᛵ;->ᛲᛴᛳᛲ:I

    .line 124
    .line 125
    :cond_6
    :goto_3
    iget v0, p0, Lyyds/ᛲᛶᛵ;->ᛷᛵᲇᲀ:I

    .line 126
    .line 127
    if-ne p1, v0, :cond_9

    .line 128
    .line 129
    :goto_4
    iget p1, p0, Lyyds/ᛲᛶᛵ;->ᛱᛳᲇ:I

    .line 130
    .line 131
    if-lez p1, :cond_8

    .line 132
    .line 133
    iget p1, p0, Lyyds/ᛲᛶᛵ;->ᛲᛲᲈᲈ:I

    .line 134
    .line 135
    and-int/lit16 p1, p1, 0xff

    .line 136
    .line 137
    int-to-byte p1, p1

    .line 138
    iget v0, p0, Lyyds/ᛲᛶᛵ;->ᲇᛱᛲ:I

    .line 139
    .line 140
    add-int/lit8 v1, v0, 0x1

    .line 141
    .line 142
    iput v1, p0, Lyyds/ᛲᛶᛵ;->ᲇᛱᛲ:I

    .line 143
    .line 144
    aput-byte p1, v7, v0

    .line 145
    .line 146
    if-lt v1, v8, :cond_7

    .line 147
    .line 148
    if-lez v1, :cond_7

    .line 149
    .line 150
    invoke-virtual {p2, v1}, Ljava/io/OutputStream;->write(I)V

    .line 151
    .line 152
    .line 153
    iget p1, p0, Lyyds/ᛲᛶᛵ;->ᲇᛱᛲ:I

    .line 154
    .line 155
    invoke-virtual {p2, v7, v6, p1}, Ljava/io/OutputStream;->write([BII)V

    .line 156
    .line 157
    .line 158
    iput v6, p0, Lyyds/ᛲᛶᛵ;->ᲇᛱᛲ:I

    .line 159
    .line 160
    :cond_7
    iget p1, p0, Lyyds/ᛲᛶᛵ;->ᛲᛲᲈᲈ:I

    .line 161
    .line 162
    shr-int/2addr p1, v4

    .line 163
    iput p1, p0, Lyyds/ᛲᛶᛵ;->ᛲᛲᲈᲈ:I

    .line 164
    .line 165
    iget p1, p0, Lyyds/ᛲᛶᛵ;->ᛱᛳᲇ:I

    .line 166
    .line 167
    sub-int/2addr p1, v4

    .line 168
    iput p1, p0, Lyyds/ᛲᛶᛵ;->ᛱᛳᲇ:I

    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_8
    iget p1, p0, Lyyds/ᛲᛶᛵ;->ᲇᛱᛲ:I

    .line 172
    .line 173
    if-lez p1, :cond_9

    .line 174
    .line 175
    invoke-virtual {p2, p1}, Ljava/io/OutputStream;->write(I)V

    .line 176
    .line 177
    .line 178
    iget p1, p0, Lyyds/ᛲᛶᛵ;->ᲇᛱᛲ:I

    .line 179
    .line 180
    invoke-virtual {p2, v7, v6, p1}, Ljava/io/OutputStream;->write([BII)V

    .line 181
    .line 182
    .line 183
    iput v6, p0, Lyyds/ᛲᛶᛵ;->ᲇᛱᛲ:I

    .line 184
    .line 185
    :cond_9
    return-void

    .line 186
    :pswitch_0
    iget v0, p0, Lyyds/ᛲᛶᛵ;->ᛲᛲᲈᲈ:I

    .line 187
    .line 188
    iget v9, p0, Lyyds/ᛲᛶᛵ;->ᛱᛳᲇ:I

    .line 189
    .line 190
    aget v3, v3, v9

    .line 191
    .line 192
    and-int/2addr v0, v3

    .line 193
    iput v0, p0, Lyyds/ᛲᛶᛵ;->ᛲᛲᲈᲈ:I

    .line 194
    .line 195
    if-lez v9, :cond_a

    .line 196
    .line 197
    shl-int v3, p1, v9

    .line 198
    .line 199
    or-int/2addr v0, v3

    .line 200
    goto :goto_5

    .line 201
    :cond_a
    move v0, p1

    .line 202
    :goto_5
    iput v0, p0, Lyyds/ᛲᛶᛵ;->ᛲᛲᲈᲈ:I

    .line 203
    .line 204
    iget v0, p0, Lyyds/ᛲᛶᛵ;->ᲇᲈᛵᛷ:I

    .line 205
    .line 206
    add-int/2addr v9, v0

    .line 207
    iput v9, p0, Lyyds/ᛲᛶᛵ;->ᛱᛳᲇ:I

    .line 208
    .line 209
    :goto_6
    iget v0, p0, Lyyds/ᛲᛶᛵ;->ᛱᛳᲇ:I

    .line 210
    .line 211
    if-lt v0, v4, :cond_c

    .line 212
    .line 213
    iget v0, p0, Lyyds/ᛲᛶᛵ;->ᛲᛲᲈᲈ:I

    .line 214
    .line 215
    and-int/lit16 v0, v0, 0xff

    .line 216
    .line 217
    int-to-byte v0, v0

    .line 218
    iget v3, p0, Lyyds/ᛲᛶᛵ;->ᲇᛱᛲ:I

    .line 219
    .line 220
    add-int/lit8 v9, v3, 0x1

    .line 221
    .line 222
    iput v9, p0, Lyyds/ᛲᛶᛵ;->ᲇᛱᛲ:I

    .line 223
    .line 224
    aput-byte v0, v7, v3

    .line 225
    .line 226
    if-lt v9, v8, :cond_b

    .line 227
    .line 228
    if-lez v9, :cond_b

    .line 229
    .line 230
    invoke-virtual {p2, v9}, Ljava/io/OutputStream;->write(I)V

    .line 231
    .line 232
    .line 233
    iget v0, p0, Lyyds/ᛲᛶᛵ;->ᲇᛱᛲ:I

    .line 234
    .line 235
    invoke-virtual {p2, v7, v6, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 236
    .line 237
    .line 238
    iput v6, p0, Lyyds/ᛲᛶᛵ;->ᲇᛱᛲ:I

    .line 239
    .line 240
    :cond_b
    iget v0, p0, Lyyds/ᛲᛶᛵ;->ᛲᛲᲈᲈ:I

    .line 241
    .line 242
    shr-int/2addr v0, v4

    .line 243
    iput v0, p0, Lyyds/ᛲᛶᛵ;->ᛲᛲᲈᲈ:I

    .line 244
    .line 245
    iget v0, p0, Lyyds/ᛲᛶᛵ;->ᛱᛳᲇ:I

    .line 246
    .line 247
    sub-int/2addr v0, v4

    .line 248
    iput v0, p0, Lyyds/ᛲᛶᛵ;->ᛱᛳᲇ:I

    .line 249
    .line 250
    goto :goto_6

    .line 251
    :cond_c
    iget v0, p0, Lyyds/ᛲᛶᛵ;->ᛱᲈᲁ:I

    .line 252
    .line 253
    iget v3, p0, Lyyds/ᛲᛶᛵ;->ᛲᛴᛳᛲ:I

    .line 254
    .line 255
    if-gt v0, v3, :cond_d

    .line 256
    .line 257
    iget-boolean v0, p0, Lyyds/ᛲᛶᛵ;->ᛲᛳᛶᲁ:Z

    .line 258
    .line 259
    if-eqz v0, :cond_10

    .line 260
    .line 261
    :cond_d
    iget-boolean v0, p0, Lyyds/ᛲᛶᛵ;->ᛲᛳᛶᲁ:Z

    .line 262
    .line 263
    if-eqz v0, :cond_e

    .line 264
    .line 265
    iget v0, p0, Lyyds/ᛲᛶᛵ;->ᛷᲈᲈᲁ:I

    .line 266
    .line 267
    iput v0, p0, Lyyds/ᛲᛶᛵ;->ᲇᲈᛵᛷ:I

    .line 268
    .line 269
    shl-int v0, v5, v0

    .line 270
    .line 271
    sub-int/2addr v0, v5

    .line 272
    iput v0, p0, Lyyds/ᛲᛶᛵ;->ᛲᛴᛳᛲ:I

    .line 273
    .line 274
    iput-boolean v6, p0, Lyyds/ᛲᛶᛵ;->ᛲᛳᛶᲁ:Z

    .line 275
    .line 276
    goto :goto_8

    .line 277
    :cond_e
    iget v0, p0, Lyyds/ᛲᛶᛵ;->ᲇᲈᛵᛷ:I

    .line 278
    .line 279
    add-int/2addr v0, v5

    .line 280
    iput v0, p0, Lyyds/ᛲᛶᛵ;->ᲇᲈᛵᛷ:I

    .line 281
    .line 282
    if-ne v0, v2, :cond_f

    .line 283
    .line 284
    goto :goto_7

    .line 285
    :cond_f
    shl-int v0, v5, v0

    .line 286
    .line 287
    add-int/lit8 v1, v0, -0x1

    .line 288
    .line 289
    :goto_7
    iput v1, p0, Lyyds/ᛲᛶᛵ;->ᛲᛴᛳᛲ:I

    .line 290
    .line 291
    :cond_10
    :goto_8
    iget v0, p0, Lyyds/ᛲᛶᛵ;->ᛷᛵᲇᲀ:I

    .line 292
    .line 293
    if-ne p1, v0, :cond_13

    .line 294
    .line 295
    :goto_9
    iget p1, p0, Lyyds/ᛲᛶᛵ;->ᛱᛳᲇ:I

    .line 296
    .line 297
    if-lez p1, :cond_12

    .line 298
    .line 299
    iget p1, p0, Lyyds/ᛲᛶᛵ;->ᛲᛲᲈᲈ:I

    .line 300
    .line 301
    and-int/lit16 p1, p1, 0xff

    .line 302
    .line 303
    int-to-byte p1, p1

    .line 304
    iget v0, p0, Lyyds/ᛲᛶᛵ;->ᲇᛱᛲ:I

    .line 305
    .line 306
    add-int/lit8 v1, v0, 0x1

    .line 307
    .line 308
    iput v1, p0, Lyyds/ᛲᛶᛵ;->ᲇᛱᛲ:I

    .line 309
    .line 310
    aput-byte p1, v7, v0

    .line 311
    .line 312
    if-lt v1, v8, :cond_11

    .line 313
    .line 314
    if-lez v1, :cond_11

    .line 315
    .line 316
    invoke-virtual {p2, v1}, Ljava/io/OutputStream;->write(I)V

    .line 317
    .line 318
    .line 319
    iget p1, p0, Lyyds/ᛲᛶᛵ;->ᲇᛱᛲ:I

    .line 320
    .line 321
    invoke-virtual {p2, v7, v6, p1}, Ljava/io/OutputStream;->write([BII)V

    .line 322
    .line 323
    .line 324
    iput v6, p0, Lyyds/ᛲᛶᛵ;->ᲇᛱᛲ:I

    .line 325
    .line 326
    :cond_11
    iget p1, p0, Lyyds/ᛲᛶᛵ;->ᛲᛲᲈᲈ:I

    .line 327
    .line 328
    shr-int/2addr p1, v4

    .line 329
    iput p1, p0, Lyyds/ᛲᛶᛵ;->ᛲᛲᲈᲈ:I

    .line 330
    .line 331
    iget p1, p0, Lyyds/ᛲᛶᛵ;->ᛱᛳᲇ:I

    .line 332
    .line 333
    sub-int/2addr p1, v4

    .line 334
    iput p1, p0, Lyyds/ᛲᛶᛵ;->ᛱᛳᲇ:I

    .line 335
    .line 336
    goto :goto_9

    .line 337
    :cond_12
    iget p1, p0, Lyyds/ᛲᛶᛵ;->ᲇᛱᛲ:I

    .line 338
    .line 339
    if-lez p1, :cond_13

    .line 340
    .line 341
    invoke-virtual {p2, p1}, Ljava/io/OutputStream;->write(I)V

    .line 342
    .line 343
    .line 344
    iget p1, p0, Lyyds/ᛲᛶᛵ;->ᲇᛱᛲ:I

    .line 345
    .line 346
    invoke-virtual {p2, v7, v6, p1}, Ljava/io/OutputStream;->write([BII)V

    .line 347
    .line 348
    .line 349
    iput v6, p0, Lyyds/ᛲᛶᛵ;->ᲇᛱᛲ:I

    .line 350
    .line 351
    :cond_13
    return-void

    .line 352
    nop

    .line 353
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
