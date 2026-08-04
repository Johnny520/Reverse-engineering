.class public final Lyyds/ᛸᛴᲇᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:[Lyyds/ᛴᲁᛲᛵ;

.field public final ᛲᲈᲁ:I

.field public final ᛵᛸᛸᛷ:[B

.field public final ᛶᛷᛲᲁ:I

.field public final ᲀᛲᛳᲀ:[I

.field public final ᲇᲇᲇᛱ:[I

.field public final ᲇᲈᛵᛷ:[Ljava/lang/String;


# direct methods
.method public constructor <init>([B)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v1, v0, Lyyds/ᛸᛴᲇᲇ;->ᛵᛸᛸᛷ:[B

    .line 9
    .line 10
    const/16 v2, 0x8

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    new-array v4, v3, [I

    .line 17
    .line 18
    iput-object v4, v0, Lyyds/ᛸᛴᲇᲇ;->ᲀᛲᛳᲀ:[I

    .line 19
    .line 20
    new-array v4, v3, [Ljava/lang/String;

    .line 21
    .line 22
    iput-object v4, v0, Lyyds/ᛸᛴᲇᲇ;->ᲇᲈᛵᛷ:[Ljava/lang/String;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x1

    .line 26
    const/16 v6, 0xa

    .line 27
    .line 28
    move v8, v4

    .line 29
    move v9, v8

    .line 30
    move v10, v9

    .line 31
    move v7, v5

    .line 32
    :goto_0
    const/4 v11, 0x4

    .line 33
    if-ge v7, v3, :cond_1

    .line 34
    .line 35
    iget-object v12, v0, Lyyds/ᛸᛴᲇᲇ;->ᲀᛲᛳᲀ:[I

    .line 36
    .line 37
    add-int/lit8 v13, v7, 0x1

    .line 38
    .line 39
    add-int/lit8 v14, v6, 0x1

    .line 40
    .line 41
    aput v14, v12, v7

    .line 42
    .line 43
    aget-byte v12, v1, v6

    .line 44
    .line 45
    const/4 v15, 0x3

    .line 46
    const/16 v16, 0x5

    .line 47
    .line 48
    packed-switch v12, :pswitch_data_0

    .line 49
    .line 50
    .line 51
    :pswitch_0
    invoke-static {}, Lyyds/ᛷᲈᲈᛶ;->ᛲᲈᲁ()V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    throw v0

    .line 56
    :pswitch_1
    move v10, v5

    .line 57
    :goto_1
    :pswitch_2
    move v7, v13

    .line 58
    move/from16 v11, v16

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :pswitch_3
    move v9, v5

    .line 62
    move v10, v9

    .line 63
    goto :goto_1

    .line 64
    :cond_0
    :goto_2
    :pswitch_4
    move v7, v13

    .line 65
    goto :goto_3

    .line 66
    :pswitch_5
    move v7, v13

    .line 67
    move v11, v15

    .line 68
    goto :goto_3

    .line 69
    :pswitch_6
    add-int/lit8 v7, v7, 0x2

    .line 70
    .line 71
    const/16 v11, 0x9

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :pswitch_7
    invoke-virtual {v0, v14}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    add-int/lit8 v11, v7, 0x3

    .line 79
    .line 80
    if-le v11, v8, :cond_0

    .line 81
    .line 82
    move v8, v11

    .line 83
    goto :goto_2

    .line 84
    :goto_3
    add-int/2addr v6, v11

    .line 85
    goto :goto_0

    .line 86
    :cond_1
    iput v8, v0, Lyyds/ᛸᛴᲇᲇ;->ᛶᛷᛲᲁ:I

    .line 87
    .line 88
    iput v6, v0, Lyyds/ᛸᛴᲇᲇ;->ᛲᲈᲁ:I

    .line 89
    .line 90
    const/4 v1, 0x0

    .line 91
    if-eqz v9, :cond_2

    .line 92
    .line 93
    new-array v3, v3, [Lyyds/ᛴᲁᛲᛵ;

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_2
    move-object v3, v1

    .line 97
    :goto_4
    iput-object v3, v0, Lyyds/ᛸᛴᲇᲇ;->ᛲᛴᛳᛲ:[Lyyds/ᛴᲁᛲᛵ;

    .line 98
    .line 99
    if-eqz v10, :cond_6

    .line 100
    .line 101
    new-array v1, v8, [C

    .line 102
    .line 103
    invoke-virtual {v0}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛸᛸᛷ()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    add-int/lit8 v5, v3, -0x2

    .line 108
    .line 109
    invoke-virtual {v0, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    :goto_5
    if-lez v5, :cond_5

    .line 114
    .line 115
    invoke-virtual {v0, v1, v3}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    add-int/lit8 v7, v3, 0x2

    .line 120
    .line 121
    invoke-virtual {v0, v7}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    add-int/lit8 v8, v3, 0x6

    .line 126
    .line 127
    const-string v9, "BootstrapMethods"

    .line 128
    .line 129
    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    if-eqz v6, :cond_4

    .line 134
    .line 135
    invoke-virtual {v0, v8}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    new-array v5, v1, [I

    .line 140
    .line 141
    add-int/2addr v3, v2

    .line 142
    :goto_6
    if-ge v4, v1, :cond_3

    .line 143
    .line 144
    aput v3, v5, v4

    .line 145
    .line 146
    add-int/lit8 v2, v3, 0x2

    .line 147
    .line 148
    invoke-virtual {v0, v2}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    mul-int/lit8 v2, v2, 0x2

    .line 153
    .line 154
    add-int/2addr v2, v11

    .line 155
    add-int/2addr v3, v2

    .line 156
    add-int/lit8 v4, v4, 0x1

    .line 157
    .line 158
    goto :goto_6

    .line 159
    :cond_3
    move-object v1, v5

    .line 160
    goto :goto_7

    .line 161
    :cond_4
    add-int v3, v8, v7

    .line 162
    .line 163
    add-int/lit8 v5, v5, -0x1

    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_5
    invoke-static {}, Lyyds/ᛷᲈᲈᛶ;->ᛲᲈᲁ()V

    .line 167
    .line 168
    .line 169
    const/4 v0, 0x0

    .line 170
    throw v0

    .line 171
    :cond_6
    :goto_7
    iput-object v1, v0, Lyyds/ᛸᛴᲇᲇ;->ᲇᲇᲇᛱ:[I

    .line 172
    .line 173
    return-void

    .line 174
    nop

    .line 175
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_5
        :pswitch_3
        :pswitch_1
        :pswitch_5
        :pswitch_5
    .end packed-switch
.end method

.method public static ᛲᲈᲁ(I[Lyyds/ᛳᲀᛷᛸ;)Lyyds/ᛳᲀᛷᛸ;
    .locals 1

    .line 1
    aget-object v0, p1, p0

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lyyds/ᛳᲀᛷᛸ;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    aput-object v0, p1, p0

    .line 11
    .line 12
    :cond_0
    aget-object p0, p1, p0

    .line 13
    .line 14
    iget-short p1, p0, Lyyds/ᛳᲀᛷᛸ;->ᛲᲈᲁ:S

    .line 15
    .line 16
    and-int/lit8 p1, p1, -0x2

    .line 17
    .line 18
    int-to-short p1, p1

    .line 19
    iput-short p1, p0, Lyyds/ᛳᲀᛷᛸ;->ᛲᲈᲁ:S

    .line 20
    .line 21
    return-object p0
.end method


# virtual methods
.method public final ᛱᛳᲇ([CI)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛸᛴᲇᲇ;->ᲀᛲᛳᲀ:[I

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    aget p2, v0, p2

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final ᛱᲈᲁ(Lyyds/ᲇᲇᛶᛶ;ILjava/lang/String;[C)I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    const/16 v4, 0x5b

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/16 v6, 0x65

    .line 13
    .line 14
    const/16 v7, 0x40

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    const/4 v9, 0x1

    .line 18
    iget-object v10, v0, Lyyds/ᛸᛴᲇᲇ;->ᛵᛸᛸᛷ:[B

    .line 19
    .line 20
    if-nez v1, :cond_3

    .line 21
    .line 22
    aget-byte v1, v10, p2

    .line 23
    .line 24
    and-int/lit16 v1, v1, 0xff

    .line 25
    .line 26
    if-eq v1, v7, :cond_2

    .line 27
    .line 28
    if-eq v1, v4, :cond_1

    .line 29
    .line 30
    if-eq v1, v6, :cond_0

    .line 31
    .line 32
    add-int/lit8 v0, p2, 0x3

    .line 33
    .line 34
    return v0

    .line 35
    :cond_0
    add-int/lit8 v0, p2, 0x5

    .line 36
    .line 37
    return v0

    .line 38
    :cond_1
    add-int/lit8 v1, p2, 0x1

    .line 39
    .line 40
    invoke-virtual {v0, v5, v1, v8, v3}, Lyyds/ᛸᛴᲇᲇ;->ᛲᛳᛶᲁ(Lyyds/ᲇᲇᛶᛶ;IZ[C)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    return v0

    .line 45
    :cond_2
    add-int/lit8 v1, p2, 0x3

    .line 46
    .line 47
    invoke-virtual {v0, v5, v1, v9, v3}, Lyyds/ᛸᛴᲇᲇ;->ᛲᛳᛶᲁ(Lyyds/ᲇᲇᛶᛶ;IZ[C)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    return v0

    .line 52
    :cond_3
    iget-boolean v11, v1, Lyyds/ᲇᲇᛶᛶ;->ᲀᛲᛳᲀ:Z

    .line 53
    .line 54
    iget-object v12, v1, Lyyds/ᲇᲇᛶᛶ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v12, Lyyds/ᛶᲇᛸᛱ;

    .line 57
    .line 58
    iget-object v13, v1, Lyyds/ᲇᲇᛶᛶ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v13, Lyyds/ᲇᲇᛳᛴ;

    .line 61
    .line 62
    add-int/lit8 v14, p2, 0x1

    .line 63
    .line 64
    aget-byte v15, v10, p2

    .line 65
    .line 66
    and-int/lit16 v15, v15, 0xff

    .line 67
    .line 68
    if-eq v15, v7, :cond_1c

    .line 69
    .line 70
    const/16 v5, 0x46

    .line 71
    .line 72
    if-eq v15, v5, :cond_1b

    .line 73
    .line 74
    const/16 v7, 0x53

    .line 75
    .line 76
    move/from16 v16, v9

    .line 77
    .line 78
    iget-object v9, v0, Lyyds/ᛸᛴᲇᲇ;->ᲀᛲᛳᲀ:[I

    .line 79
    .line 80
    if-eq v15, v7, :cond_1a

    .line 81
    .line 82
    const/16 v7, 0x63

    .line 83
    .line 84
    if-eq v15, v7, :cond_19

    .line 85
    .line 86
    if-eq v15, v6, :cond_17

    .line 87
    .line 88
    const/16 v6, 0x73

    .line 89
    .line 90
    if-eq v15, v6, :cond_16

    .line 91
    .line 92
    const/16 v6, 0x49

    .line 93
    .line 94
    if-eq v15, v6, :cond_1b

    .line 95
    .line 96
    const/16 v7, 0x4a

    .line 97
    .line 98
    if-eq v15, v7, :cond_1b

    .line 99
    .line 100
    const/16 v11, 0x5a

    .line 101
    .line 102
    if-eq v15, v11, :cond_14

    .line 103
    .line 104
    if-eq v15, v4, :cond_4

    .line 105
    .line 106
    packed-switch v15, :pswitch_data_0

    .line 107
    .line 108
    .line 109
    invoke-static {}, Lyyds/ᛷᲈᲈᛶ;->ᛲᲈᲁ()V

    .line 110
    .line 111
    .line 112
    return v8

    .line 113
    :pswitch_0
    invoke-virtual {v0, v14}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    aget v3, v9, v3

    .line 118
    .line 119
    invoke-virtual {v0, v3}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    int-to-char v0, v0

    .line 124
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v1, v0, v2}, Lyyds/ᲇᲇᛶᛶ;->ᛷᲈᲈᲁ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    add-int/lit8 v0, p2, 0x3

    .line 132
    .line 133
    return v0

    .line 134
    :pswitch_1
    invoke-virtual {v0, v14}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    aget v3, v9, v3

    .line 139
    .line 140
    invoke-virtual {v0, v3}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    int-to-byte v0, v0

    .line 145
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {v1, v0, v2}, Lyyds/ᲇᲇᛶᛶ;->ᛷᲈᲈᲁ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    add-int/lit8 v0, p2, 0x3

    .line 153
    .line 154
    return v0

    .line 155
    :cond_4
    invoke-virtual {v0, v14}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    add-int/lit8 v12, p2, 0x3

    .line 160
    .line 161
    if-nez v4, :cond_5

    .line 162
    .line 163
    invoke-virtual {v1, v2}, Lyyds/ᲇᲇᛶᛶ;->ᛷᛲᲈᛱ(Ljava/lang/String;)Lyyds/ᲇᲇᛶᛶ;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-virtual {v0, v1, v14, v8, v3}, Lyyds/ᛸᛴᲇᲇ;->ᛲᛳᛶᲁ(Lyyds/ᲇᲇᛶᛶ;IZ[C)I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    return v0

    .line 172
    :cond_5
    aget-byte v10, v10, v12

    .line 173
    .line 174
    and-int/lit16 v10, v10, 0xff

    .line 175
    .line 176
    if-eq v10, v5, :cond_12

    .line 177
    .line 178
    const/16 v5, 0x53

    .line 179
    .line 180
    if-eq v10, v5, :cond_10

    .line 181
    .line 182
    if-eq v10, v11, :cond_d

    .line 183
    .line 184
    if-eq v10, v6, :cond_b

    .line 185
    .line 186
    if-eq v10, v7, :cond_9

    .line 187
    .line 188
    packed-switch v10, :pswitch_data_1

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1, v2}, Lyyds/ᲇᲇᛶᛶ;->ᛷᛲᲈᛱ(Ljava/lang/String;)Lyyds/ᲇᲇᛶᛶ;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-virtual {v0, v1, v14, v8, v3}, Lyyds/ᛸᛴᲇᲇ;->ᛲᛳᛶᲁ(Lyyds/ᲇᲇᛶᛶ;IZ[C)I

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    return v0

    .line 200
    :pswitch_2
    new-array v3, v4, [D

    .line 201
    .line 202
    :goto_0
    if-ge v8, v4, :cond_6

    .line 203
    .line 204
    add-int/lit8 v5, v12, 0x1

    .line 205
    .line 206
    invoke-virtual {v0, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 207
    .line 208
    .line 209
    move-result v5

    .line 210
    aget v5, v9, v5

    .line 211
    .line 212
    invoke-virtual {v0, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛷᛲᲈᛱ(I)J

    .line 213
    .line 214
    .line 215
    move-result-wide v5

    .line 216
    invoke-static {v5, v6}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 217
    .line 218
    .line 219
    move-result-wide v5

    .line 220
    aput-wide v5, v3, v8

    .line 221
    .line 222
    add-int/lit8 v12, v12, 0x3

    .line 223
    .line 224
    add-int/lit8 v8, v8, 0x1

    .line 225
    .line 226
    goto :goto_0

    .line 227
    :cond_6
    invoke-virtual {v1, v3, v2}, Lyyds/ᲇᲇᛶᛶ;->ᛷᲈᲈᲁ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    return v12

    .line 231
    :pswitch_3
    new-array v3, v4, [C

    .line 232
    .line 233
    :goto_1
    if-ge v8, v4, :cond_7

    .line 234
    .line 235
    add-int/lit8 v5, v12, 0x1

    .line 236
    .line 237
    invoke-virtual {v0, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    aget v5, v9, v5

    .line 242
    .line 243
    invoke-virtual {v0, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    .line 244
    .line 245
    .line 246
    move-result v5

    .line 247
    int-to-char v5, v5

    .line 248
    aput-char v5, v3, v8

    .line 249
    .line 250
    add-int/lit8 v12, v12, 0x3

    .line 251
    .line 252
    add-int/lit8 v8, v8, 0x1

    .line 253
    .line 254
    goto :goto_1

    .line 255
    :cond_7
    invoke-virtual {v1, v3, v2}, Lyyds/ᲇᲇᛶᛶ;->ᛷᲈᲈᲁ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    return v12

    .line 259
    :pswitch_4
    new-array v3, v4, [B

    .line 260
    .line 261
    :goto_2
    if-ge v8, v4, :cond_8

    .line 262
    .line 263
    add-int/lit8 v5, v12, 0x1

    .line 264
    .line 265
    invoke-virtual {v0, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 266
    .line 267
    .line 268
    move-result v5

    .line 269
    aget v5, v9, v5

    .line 270
    .line 271
    invoke-virtual {v0, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    .line 272
    .line 273
    .line 274
    move-result v5

    .line 275
    int-to-byte v5, v5

    .line 276
    aput-byte v5, v3, v8

    .line 277
    .line 278
    add-int/lit8 v12, v12, 0x3

    .line 279
    .line 280
    add-int/lit8 v8, v8, 0x1

    .line 281
    .line 282
    goto :goto_2

    .line 283
    :cond_8
    invoke-virtual {v1, v3, v2}, Lyyds/ᲇᲇᛶᛶ;->ᛷᲈᲈᲁ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    return v12

    .line 287
    :cond_9
    new-array v3, v4, [J

    .line 288
    .line 289
    :goto_3
    if-ge v8, v4, :cond_a

    .line 290
    .line 291
    add-int/lit8 v5, v12, 0x1

    .line 292
    .line 293
    invoke-virtual {v0, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 294
    .line 295
    .line 296
    move-result v5

    .line 297
    aget v5, v9, v5

    .line 298
    .line 299
    invoke-virtual {v0, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛷᛲᲈᛱ(I)J

    .line 300
    .line 301
    .line 302
    move-result-wide v5

    .line 303
    aput-wide v5, v3, v8

    .line 304
    .line 305
    add-int/lit8 v12, v12, 0x3

    .line 306
    .line 307
    add-int/lit8 v8, v8, 0x1

    .line 308
    .line 309
    goto :goto_3

    .line 310
    :cond_a
    invoke-virtual {v1, v3, v2}, Lyyds/ᲇᲇᛶᛶ;->ᛷᲈᲈᲁ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    return v12

    .line 314
    :cond_b
    new-array v3, v4, [I

    .line 315
    .line 316
    :goto_4
    if-ge v8, v4, :cond_c

    .line 317
    .line 318
    add-int/lit8 v5, v12, 0x1

    .line 319
    .line 320
    invoke-virtual {v0, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    aget v5, v9, v5

    .line 325
    .line 326
    invoke-virtual {v0, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    .line 327
    .line 328
    .line 329
    move-result v5

    .line 330
    aput v5, v3, v8

    .line 331
    .line 332
    add-int/lit8 v12, v12, 0x3

    .line 333
    .line 334
    add-int/lit8 v8, v8, 0x1

    .line 335
    .line 336
    goto :goto_4

    .line 337
    :cond_c
    invoke-virtual {v1, v3, v2}, Lyyds/ᲇᲇᛶᛶ;->ᛷᲈᲈᲁ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    return v12

    .line 341
    :cond_d
    new-array v3, v4, [Z

    .line 342
    .line 343
    move v5, v8

    .line 344
    :goto_5
    if-ge v5, v4, :cond_f

    .line 345
    .line 346
    add-int/lit8 v6, v12, 0x1

    .line 347
    .line 348
    invoke-virtual {v0, v6}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 349
    .line 350
    .line 351
    move-result v6

    .line 352
    aget v6, v9, v6

    .line 353
    .line 354
    invoke-virtual {v0, v6}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    .line 355
    .line 356
    .line 357
    move-result v6

    .line 358
    if-eqz v6, :cond_e

    .line 359
    .line 360
    move/from16 v6, v16

    .line 361
    .line 362
    goto :goto_6

    .line 363
    :cond_e
    move v6, v8

    .line 364
    :goto_6
    aput-boolean v6, v3, v5

    .line 365
    .line 366
    add-int/lit8 v12, v12, 0x3

    .line 367
    .line 368
    add-int/lit8 v5, v5, 0x1

    .line 369
    .line 370
    goto :goto_5

    .line 371
    :cond_f
    invoke-virtual {v1, v3, v2}, Lyyds/ᲇᲇᛶᛶ;->ᛷᲈᲈᲁ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    return v12

    .line 375
    :cond_10
    new-array v3, v4, [S

    .line 376
    .line 377
    :goto_7
    if-ge v8, v4, :cond_11

    .line 378
    .line 379
    add-int/lit8 v5, v12, 0x1

    .line 380
    .line 381
    invoke-virtual {v0, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 382
    .line 383
    .line 384
    move-result v5

    .line 385
    aget v5, v9, v5

    .line 386
    .line 387
    invoke-virtual {v0, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    .line 388
    .line 389
    .line 390
    move-result v5

    .line 391
    int-to-short v5, v5

    .line 392
    aput-short v5, v3, v8

    .line 393
    .line 394
    add-int/lit8 v12, v12, 0x3

    .line 395
    .line 396
    add-int/lit8 v8, v8, 0x1

    .line 397
    .line 398
    goto :goto_7

    .line 399
    :cond_11
    invoke-virtual {v1, v3, v2}, Lyyds/ᲇᲇᛶᛶ;->ᛷᲈᲈᲁ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    return v12

    .line 403
    :cond_12
    new-array v3, v4, [F

    .line 404
    .line 405
    :goto_8
    if-ge v8, v4, :cond_13

    .line 406
    .line 407
    add-int/lit8 v5, v12, 0x1

    .line 408
    .line 409
    invoke-virtual {v0, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 410
    .line 411
    .line 412
    move-result v5

    .line 413
    aget v5, v9, v5

    .line 414
    .line 415
    invoke-virtual {v0, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    .line 416
    .line 417
    .line 418
    move-result v5

    .line 419
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 420
    .line 421
    .line 422
    move-result v5

    .line 423
    aput v5, v3, v8

    .line 424
    .line 425
    add-int/lit8 v12, v12, 0x3

    .line 426
    .line 427
    add-int/lit8 v8, v8, 0x1

    .line 428
    .line 429
    goto :goto_8

    .line 430
    :cond_13
    invoke-virtual {v1, v3, v2}, Lyyds/ᲇᲇᛶᛶ;->ᛷᲈᲈᲁ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    return v12

    .line 434
    :cond_14
    invoke-virtual {v0, v14}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 435
    .line 436
    .line 437
    move-result v3

    .line 438
    aget v3, v9, v3

    .line 439
    .line 440
    invoke-virtual {v0, v3}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    .line 441
    .line 442
    .line 443
    move-result v0

    .line 444
    if-nez v0, :cond_15

    .line 445
    .line 446
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 447
    .line 448
    goto :goto_9

    .line 449
    :cond_15
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 450
    .line 451
    :goto_9
    invoke-virtual {v1, v0, v2}, Lyyds/ᲇᲇᛶᛶ;->ᛷᲈᲈᲁ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    add-int/lit8 v0, p2, 0x3

    .line 455
    .line 456
    return v0

    .line 457
    :cond_16
    invoke-virtual {v0, v3, v14}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    invoke-virtual {v1, v0, v2}, Lyyds/ᲇᲇᛶᛶ;->ᛷᲈᲈᲁ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    add-int/lit8 v0, p2, 0x3

    .line 465
    .line 466
    return v0

    .line 467
    :cond_17
    invoke-virtual {v0, v3, v14}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v4

    .line 471
    add-int/lit8 v5, p2, 0x3

    .line 472
    .line 473
    invoke-virtual {v0, v3, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    iget v3, v1, Lyyds/ᲇᲇᛶᛶ;->ᛵᛸᛸᛷ:I

    .line 478
    .line 479
    add-int/lit8 v3, v3, 0x1

    .line 480
    .line 481
    iput v3, v1, Lyyds/ᲇᲇᛶᛶ;->ᛵᛸᛸᛷ:I

    .line 482
    .line 483
    if-eqz v11, :cond_18

    .line 484
    .line 485
    invoke-virtual {v12, v2}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛳᛶᲁ(Ljava/lang/String;)I

    .line 486
    .line 487
    .line 488
    move-result v1

    .line 489
    invoke-virtual {v13, v1}, Lyyds/ᲇᲇᛳᛴ;->ᛷᲈᲈᲁ(I)V

    .line 490
    .line 491
    .line 492
    :cond_18
    invoke-virtual {v12, v4}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛳᛶᲁ(Ljava/lang/String;)I

    .line 493
    .line 494
    .line 495
    move-result v1

    .line 496
    invoke-virtual {v13, v6, v1}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v12, v0}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛳᛶᲁ(Ljava/lang/String;)I

    .line 500
    .line 501
    .line 502
    move-result v0

    .line 503
    invoke-virtual {v13, v0}, Lyyds/ᲇᲇᛳᛴ;->ᛷᲈᲈᲁ(I)V

    .line 504
    .line 505
    .line 506
    add-int/lit8 v0, p2, 0x5

    .line 507
    .line 508
    return v0

    .line 509
    :cond_19
    invoke-virtual {v0, v3, v14}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 514
    .line 515
    .line 516
    move-result v3

    .line 517
    invoke-static {v0, v8, v3}, Lyyds/ᛶᛳᲇᛳ;->ᛱᲈᲁ(Ljava/lang/String;II)Lyyds/ᛶᛳᲇᛳ;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    invoke-virtual {v1, v0, v2}, Lyyds/ᲇᲇᛶᛶ;->ᛷᲈᲈᲁ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    add-int/lit8 v0, p2, 0x3

    .line 525
    .line 526
    return v0

    .line 527
    :cond_1a
    invoke-virtual {v0, v14}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 528
    .line 529
    .line 530
    move-result v3

    .line 531
    aget v3, v9, v3

    .line 532
    .line 533
    invoke-virtual {v0, v3}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    .line 534
    .line 535
    .line 536
    move-result v0

    .line 537
    int-to-short v0, v0

    .line 538
    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    invoke-virtual {v1, v0, v2}, Lyyds/ᲇᲇᛶᛶ;->ᛷᲈᲈᲁ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    add-int/lit8 v0, p2, 0x3

    .line 546
    .line 547
    return v0

    .line 548
    :cond_1b
    :pswitch_5
    invoke-virtual {v0, v14}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 549
    .line 550
    .line 551
    move-result v4

    .line 552
    invoke-virtual {v0, v3, v4}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛷᛲᲁ([CI)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    invoke-virtual {v1, v0, v2}, Lyyds/ᲇᲇᛶᛶ;->ᛷᲈᲈᲁ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 557
    .line 558
    .line 559
    add-int/lit8 v0, p2, 0x3

    .line 560
    .line 561
    return v0

    .line 562
    :cond_1c
    move/from16 v16, v9

    .line 563
    .line 564
    invoke-virtual {v0, v3, v14}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v4

    .line 568
    iget v6, v1, Lyyds/ᲇᲇᛶᛶ;->ᛵᛸᛸᛷ:I

    .line 569
    .line 570
    add-int/lit8 v6, v6, 0x1

    .line 571
    .line 572
    iput v6, v1, Lyyds/ᲇᲇᛶᛶ;->ᛵᛸᛸᛷ:I

    .line 573
    .line 574
    if-eqz v11, :cond_1d

    .line 575
    .line 576
    invoke-virtual {v12, v2}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛳᛶᲁ(Ljava/lang/String;)I

    .line 577
    .line 578
    .line 579
    move-result v1

    .line 580
    invoke-virtual {v13, v1}, Lyyds/ᲇᲇᛳᛴ;->ᛷᲈᲈᲁ(I)V

    .line 581
    .line 582
    .line 583
    :cond_1d
    invoke-virtual {v12, v4}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛳᛶᲁ(Ljava/lang/String;)I

    .line 584
    .line 585
    .line 586
    move-result v1

    .line 587
    invoke-virtual {v13, v7, v1}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {v13, v8}, Lyyds/ᲇᲇᛳᛴ;->ᛷᲈᲈᲁ(I)V

    .line 591
    .line 592
    .line 593
    new-instance v1, Lyyds/ᲇᲇᛶᛶ;

    .line 594
    .line 595
    move/from16 v2, v16

    .line 596
    .line 597
    invoke-direct {v1, v12, v2, v13, v5}, Lyyds/ᲇᲇᛶᛶ;-><init>(Lyyds/ᛶᲇᛸᛱ;ZLyyds/ᲇᲇᛳᛴ;Lyyds/ᲇᲇᛶᛶ;)V

    .line 598
    .line 599
    .line 600
    add-int/lit8 v4, p2, 0x3

    .line 601
    .line 602
    invoke-virtual {v0, v1, v4, v2, v3}, Lyyds/ᛸᛴᲇᲇ;->ᛲᛳᛶᲁ(Lyyds/ᲇᲇᛶᛶ;IZ[C)I

    .line 603
    .line 604
    .line 605
    move-result v0

    .line 606
    return v0

    .line 607
    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_1
        :pswitch_0
        :pswitch_5
    .end packed-switch

    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    :pswitch_data_1
    .packed-switch 0x42
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public final ᛲᛲᲈᲈ(I)S
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᛸᛴᲇᲇ;->ᛵᛸᛸᛷ:[B

    .line 2
    .line 3
    aget-byte v0, p0, p1

    .line 4
    .line 5
    and-int/lit16 v0, v0, 0xff

    .line 6
    .line 7
    shl-int/lit8 v0, v0, 0x8

    .line 8
    .line 9
    add-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    aget-byte p0, p0, p1

    .line 12
    .line 13
    and-int/lit16 p0, p0, 0xff

    .line 14
    .line 15
    or-int/2addr p0, v0

    .line 16
    int-to-short p0, p0

    .line 17
    return p0
.end method

.method public final ᛲᛳᛶᲁ(Lyyds/ᲇᲇᛶᛶ;IZ[C)I
    .locals 1

    .line 1
    invoke-virtual {p0, p2}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 p2, p2, 0x2

    .line 6
    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    :goto_0
    add-int/lit8 p3, v0, -0x1

    .line 10
    .line 11
    if-lez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p4, p2}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    add-int/lit8 p2, p2, 0x2

    .line 18
    .line 19
    invoke-virtual {p0, p1, p2, v0, p4}, Lyyds/ᛸᛴᲇᲇ;->ᛱᲈᲁ(Lyyds/ᲇᲇᛶᛶ;ILjava/lang/String;[C)I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    move v0, p3

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    :goto_1
    add-int/lit8 p3, v0, -0x1

    .line 26
    .line 27
    if-lez v0, :cond_1

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-virtual {p0, p1, p2, v0, p4}, Lyyds/ᛸᛴᲇᲇ;->ᛱᲈᲁ(Lyyds/ᲇᲇᛶᛶ;ILjava/lang/String;[C)I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    move v0, p3

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    if-eqz p1, :cond_2

    .line 37
    .line 38
    invoke-virtual {p1}, Lyyds/ᲇᲇᛶᛶ;->ᛷᛵᲇᲀ()V

    .line 39
    .line 40
    .line 41
    :cond_2
    return p2
.end method

.method public final ᛲᛴᛳᛲ(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛸᛴᲇᲇ;->ᛵᛸᛸᛷ:[B

    .line 2
    .line 3
    aget-byte p0, p0, p1

    .line 4
    .line 5
    and-int/lit16 p0, p0, 0xff

    .line 6
    .line 7
    return p0
.end method

.method public final ᛳᛸᛴᛶ([CII)Ljava/lang/String;
    .locals 7

    .line 1
    add-int/2addr p3, p2

    .line 2
    const/4 v0, 0x0

    .line 3
    move v1, v0

    .line 4
    :goto_0
    if-ge p2, p3, :cond_2

    .line 5
    .line 6
    add-int/lit8 v2, p2, 0x1

    .line 7
    .line 8
    iget-object v3, p0, Lyyds/ᛸᛴᲇᲇ;->ᛵᛸᛸᛷ:[B

    .line 9
    .line 10
    aget-byte v4, v3, p2

    .line 11
    .line 12
    and-int/lit16 v5, v4, 0x80

    .line 13
    .line 14
    if-nez v5, :cond_0

    .line 15
    .line 16
    add-int/lit8 p2, v1, 0x1

    .line 17
    .line 18
    and-int/lit8 v3, v4, 0x7f

    .line 19
    .line 20
    int-to-char v3, v3

    .line 21
    aput-char v3, p1, v1

    .line 22
    .line 23
    move v1, p2

    .line 24
    move p2, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    and-int/lit16 v5, v4, 0xe0

    .line 27
    .line 28
    const/16 v6, 0xc0

    .line 29
    .line 30
    if-ne v5, v6, :cond_1

    .line 31
    .line 32
    add-int/lit8 v5, v1, 0x1

    .line 33
    .line 34
    and-int/lit8 v4, v4, 0x1f

    .line 35
    .line 36
    shl-int/lit8 v4, v4, 0x6

    .line 37
    .line 38
    add-int/lit8 p2, p2, 0x2

    .line 39
    .line 40
    aget-byte v2, v3, v2

    .line 41
    .line 42
    and-int/lit8 v2, v2, 0x3f

    .line 43
    .line 44
    add-int/2addr v4, v2

    .line 45
    int-to-char v2, v4

    .line 46
    aput-char v2, p1, v1

    .line 47
    .line 48
    :goto_1
    move v1, v5

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    add-int/lit8 v5, v1, 0x1

    .line 51
    .line 52
    and-int/lit8 v4, v4, 0xf

    .line 53
    .line 54
    shl-int/lit8 v4, v4, 0xc

    .line 55
    .line 56
    add-int/lit8 v6, p2, 0x2

    .line 57
    .line 58
    aget-byte v2, v3, v2

    .line 59
    .line 60
    and-int/lit8 v2, v2, 0x3f

    .line 61
    .line 62
    shl-int/lit8 v2, v2, 0x6

    .line 63
    .line 64
    add-int/2addr v4, v2

    .line 65
    add-int/lit8 p2, p2, 0x3

    .line 66
    .line 67
    aget-byte v2, v3, v6

    .line 68
    .line 69
    and-int/lit8 v2, v2, 0x3f

    .line 70
    .line 71
    add-int/2addr v4, v2

    .line 72
    int-to-char v2, v4

    .line 73
    aput-char v2, p1, v1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    new-instance p0, Ljava/lang/String;

    .line 77
    .line 78
    invoke-direct {p0, p1, v0, v1}, Ljava/lang/String;-><init>([CII)V

    .line 79
    .line 80
    .line 81
    return-object p0
.end method

.method public final ᛳᲁᲁᲇ(Lyyds/ᛵᛳᛶᲇ;I)I
    .locals 9

    .line 1
    invoke-virtual {p0, p2}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    ushr-int/lit8 v1, v0, 0x18

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    if-eq v1, v2, :cond_0

    .line 11
    .line 12
    const/high16 v3, -0x1000000

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    packed-switch v1, :pswitch_data_1

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lyyds/ᛷᲈᲈᛶ;->ᛲᲈᲁ()V

    .line 22
    .line 23
    .line 24
    return v4

    .line 25
    :pswitch_0
    const v1, -0xffff01

    .line 26
    .line 27
    .line 28
    and-int/2addr v0, v1

    .line 29
    add-int/lit8 p2, p2, 0x4

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :pswitch_1
    and-int/2addr v0, v3

    .line 33
    :goto_0
    add-int/lit8 p2, p2, 0x3

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :pswitch_2
    and-int/2addr v0, v3

    .line 37
    add-int/lit8 v1, p2, 0x1

    .line 38
    .line 39
    invoke-virtual {p0, v1}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    add-int/lit8 p2, p2, 0x3

    .line 44
    .line 45
    new-array v3, v1, [Lyyds/ᛳᲀᛷᛸ;

    .line 46
    .line 47
    iput-object v3, p1, Lyyds/ᛵᛳᛶᲇ;->ᛷᲈᲈᲁ:[Lyyds/ᛳᲀᛷᛸ;

    .line 48
    .line 49
    new-array v3, v1, [Lyyds/ᛳᲀᛷᛸ;

    .line 50
    .line 51
    iput-object v3, p1, Lyyds/ᛵᛳᛶᲇ;->ᛷᛲᲈᛱ:[Lyyds/ᛳᲀᛷᛸ;

    .line 52
    .line 53
    new-array v3, v1, [I

    .line 54
    .line 55
    iput-object v3, p1, Lyyds/ᛵᛳᛶᲇ;->ᛷᛵᲇᲀ:[I

    .line 56
    .line 57
    :goto_1
    if-ge v4, v1, :cond_1

    .line 58
    .line 59
    invoke-virtual {p0, p2}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    add-int/lit8 v5, p2, 0x2

    .line 64
    .line 65
    invoke-virtual {p0, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    add-int/lit8 v6, p2, 0x4

    .line 70
    .line 71
    invoke-virtual {p0, v6}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    add-int/lit8 p2, p2, 0x6

    .line 76
    .line 77
    iget-object v7, p1, Lyyds/ᛵᛳᛶᲇ;->ᛷᲈᲈᲁ:[Lyyds/ᛳᲀᛷᛸ;

    .line 78
    .line 79
    iget-object v8, p1, Lyyds/ᛵᛳᛶᲇ;->ᛶᛷᛲᲁ:[Lyyds/ᛳᲀᛷᛸ;

    .line 80
    .line 81
    invoke-static {v3, v8}, Lyyds/ᛸᛴᲇᲇ;->ᛲᲈᲁ(I[Lyyds/ᛳᲀᛷᛸ;)Lyyds/ᛳᲀᛷᛸ;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    aput-object v8, v7, v4

    .line 86
    .line 87
    iget-object v7, p1, Lyyds/ᛵᛳᛶᲇ;->ᛷᛲᲈᛱ:[Lyyds/ᛳᲀᛷᛸ;

    .line 88
    .line 89
    add-int/2addr v3, v5

    .line 90
    iget-object v5, p1, Lyyds/ᛵᛳᛶᲇ;->ᛶᛷᛲᲁ:[Lyyds/ᛳᲀᛷᛸ;

    .line 91
    .line 92
    invoke-static {v3, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛲᲈᲁ(I[Lyyds/ᛳᲀᛷᛸ;)Lyyds/ᛳᲀᛷᛸ;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    aput-object v3, v7, v4

    .line 97
    .line 98
    iget-object v3, p1, Lyyds/ᛵᛳᛶᲇ;->ᛷᛵᲇᲀ:[I

    .line 99
    .line 100
    aput v6, v3, v4

    .line 101
    .line 102
    add-int/lit8 v4, v4, 0x1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :pswitch_3
    and-int/2addr v0, v3

    .line 106
    add-int/2addr p2, v2

    .line 107
    goto :goto_2

    .line 108
    :pswitch_4
    and-int/lit16 v0, v0, -0x100

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_0
    :pswitch_5
    const/high16 v1, -0x10000

    .line 112
    .line 113
    and-int/2addr v0, v1

    .line 114
    add-int/lit8 p2, p2, 0x2

    .line 115
    .line 116
    :cond_1
    :goto_2
    iput v0, p1, Lyyds/ᛵᛳᛶᲇ;->ᛱᲈᲁ:I

    .line 117
    .line 118
    invoke-virtual {p0, p2}, Lyyds/ᛸᛴᲇᲇ;->ᛲᛴᛳᛲ(I)I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-nez v0, :cond_2

    .line 123
    .line 124
    const/4 p0, 0x0

    .line 125
    goto :goto_3

    .line 126
    :cond_2
    new-instance v1, Lyyds/ᲇᲇᛳᛴ;

    .line 127
    .line 128
    iget-object p0, p0, Lyyds/ᛸᛴᲇᲇ;->ᛵᛸᛸᛷ:[B

    .line 129
    .line 130
    invoke-direct {v1, p2, p0}, Lyyds/ᲇᲇᛳᛴ;-><init>(I[B)V

    .line 131
    .line 132
    .line 133
    move-object p0, v1

    .line 134
    :goto_3
    iput-object p0, p1, Lyyds/ᛵᛳᛶᲇ;->ᛲᛳᛶᲁ:Lyyds/ᲇᲇᛳᛴ;

    .line 135
    .line 136
    add-int/2addr p2, v2

    .line 137
    mul-int/lit8 v0, v0, 0x2

    .line 138
    .line 139
    add-int/2addr v0, p2

    .line 140
    return v0

    .line 141
    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_5
        :pswitch_4
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x40
        :pswitch_2
        :pswitch_2
        :pswitch_4
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛵᛶᛲᲀ(I)I
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᛸᛴᲇᲇ;->ᛵᛸᛸᛷ:[B

    .line 2
    .line 3
    aget-byte v0, p0, p1

    .line 4
    .line 5
    and-int/lit16 v0, v0, 0xff

    .line 6
    .line 7
    shl-int/lit8 v0, v0, 0x8

    .line 8
    .line 9
    add-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    aget-byte p0, p0, p1

    .line 12
    .line 13
    and-int/lit16 p0, p0, 0xff

    .line 14
    .line 15
    or-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public final ᛵᛸᛸᛷ()I
    .locals 4

    .line 1
    iget v0, p0, Lyyds/ᛸᛴᲇᲇ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x8

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x6

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    mul-int/lit8 v0, v0, 0x2

    .line 12
    .line 13
    add-int/2addr v0, v1

    .line 14
    invoke-virtual {p0, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    add-int/lit8 v0, v0, 0x2

    .line 19
    .line 20
    :goto_0
    add-int/lit8 v2, v1, -0x1

    .line 21
    .line 22
    if-lez v1, :cond_1

    .line 23
    .line 24
    add-int/lit8 v1, v0, 0x6

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    add-int/lit8 v0, v0, 0x8

    .line 31
    .line 32
    :goto_1
    add-int/lit8 v3, v1, -0x1

    .line 33
    .line 34
    if-lez v1, :cond_0

    .line 35
    .line 36
    add-int/lit8 v1, v0, 0x2

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    add-int/lit8 v1, v1, 0x6

    .line 43
    .line 44
    add-int/2addr v0, v1

    .line 45
    move v1, v3

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    move v1, v2

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {p0, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    add-int/lit8 v0, v0, 0x2

    .line 54
    .line 55
    :goto_2
    add-int/lit8 v2, v1, -0x1

    .line 56
    .line 57
    if-lez v1, :cond_3

    .line 58
    .line 59
    add-int/lit8 v1, v0, 0x6

    .line 60
    .line 61
    invoke-virtual {p0, v1}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    add-int/lit8 v0, v0, 0x8

    .line 66
    .line 67
    :goto_3
    add-int/lit8 v3, v1, -0x1

    .line 68
    .line 69
    if-lez v1, :cond_2

    .line 70
    .line 71
    add-int/lit8 v1, v0, 0x2

    .line 72
    .line 73
    invoke-virtual {p0, v1}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    add-int/lit8 v1, v1, 0x6

    .line 78
    .line 79
    add-int/2addr v0, v1

    .line 80
    move v1, v3

    .line 81
    goto :goto_3

    .line 82
    :cond_2
    move v1, v2

    .line 83
    goto :goto_2

    .line 84
    :cond_3
    add-int/lit8 v0, v0, 0x2

    .line 85
    .line 86
    return v0
.end method

.method public final ᛶᛳᛶᛵ([CI)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0, p2}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz p2, :cond_1

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0, p1, v0}, Lyyds/ᛸᛴᲇᲇ;->ᲀᛲᛲᲇ([CI)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public final ᛶᛷᛲᲁ([CI)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Lyyds/ᛸᛴᲇᲇ;->ᲀᛲᛳᲀ:[I

    .line 2
    .line 3
    aget v1, v0, p2

    .line 4
    .line 5
    add-int/lit8 v2, v1, -0x1

    .line 6
    .line 7
    iget-object v3, p0, Lyyds/ᛸᛴᲇᲇ;->ᛵᛸᛸᛷ:[B

    .line 8
    .line 9
    aget-byte v2, v3, v2

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    packed-switch v2, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    const/16 v5, 0xb

    .line 16
    .line 17
    packed-switch v2, :pswitch_data_1

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lyyds/ᛷᲈᲈᛶ;->ᛲᲈᲁ()V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0

    .line 25
    :pswitch_0
    iget-object v2, p0, Lyyds/ᛸᛴᲇᲇ;->ᛲᛴᛳᛲ:[Lyyds/ᛴᲁᛲᛵ;

    .line 26
    .line 27
    aget-object v3, v2, p2

    .line 28
    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    return-object v3

    .line 32
    :cond_0
    add-int/lit8 v3, v1, 0x2

    .line 33
    .line 34
    invoke-virtual {p0, v3}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    aget v0, v0, v3

    .line 39
    .line 40
    invoke-virtual {p0, p1, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    add-int/lit8 v0, v0, 0x2

    .line 45
    .line 46
    invoke-virtual {p0, p1, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object v5, p0, Lyyds/ᛸᛴᲇᲇ;->ᲇᲇᲇᛱ:[I

    .line 51
    .line 52
    invoke-virtual {p0, v1}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    aget v1, v5, v1

    .line 57
    .line 58
    invoke-virtual {p0, v1}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-virtual {p0, p1, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛷᛲᲁ([CI)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    check-cast v5, Lyyds/ᲈᲁᛷᲀ;

    .line 67
    .line 68
    add-int/lit8 v6, v1, 0x2

    .line 69
    .line 70
    invoke-virtual {p0, v6}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    new-array v7, v6, [Ljava/lang/Object;

    .line 75
    .line 76
    add-int/lit8 v1, v1, 0x4

    .line 77
    .line 78
    :goto_0
    if-ge v4, v6, :cond_1

    .line 79
    .line 80
    invoke-virtual {p0, v1}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    invoke-virtual {p0, p1, v8}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛷᛲᲁ([CI)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    aput-object v8, v7, v4

    .line 89
    .line 90
    add-int/lit8 v1, v1, 0x2

    .line 91
    .line 92
    add-int/lit8 v4, v4, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    new-instance p0, Lyyds/ᛴᲁᛲᛵ;

    .line 96
    .line 97
    invoke-direct {p0, v3, v0, v5, v7}, Lyyds/ᛴᲁᛲᛵ;-><init>(Ljava/lang/String;Ljava/lang/String;Lyyds/ᲈᲁᛷᲀ;[Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    aput-object p0, v2, p2

    .line 101
    .line 102
    return-object p0

    .line 103
    :pswitch_1
    invoke-virtual {p0, p1, v1}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    new-instance p1, Lyyds/ᛶᛳᲇᛳ;

    .line 108
    .line 109
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    invoke-direct {p1, v5, v4, p2, p0}, Lyyds/ᛶᛳᲇᛳ;-><init>(IIILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-object p1

    .line 117
    :pswitch_2
    invoke-virtual {p0, v1}, Lyyds/ᛸᛴᲇᲇ;->ᛲᛴᛳᛲ(I)I

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    const/4 p2, 0x1

    .line 122
    add-int/2addr v1, p2

    .line 123
    invoke-virtual {p0, v1}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    aget v1, v0, v1

    .line 128
    .line 129
    add-int/lit8 v2, v1, 0x2

    .line 130
    .line 131
    invoke-virtual {p0, v2}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    aget v0, v0, v2

    .line 136
    .line 137
    invoke-virtual {p0, p1, v1}, Lyyds/ᛸᛴᲇᲇ;->ᛱᛳᲇ([CI)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    invoke-virtual {p0, p1, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    add-int/lit8 v0, v0, 0x2

    .line 146
    .line 147
    invoke-virtual {p0, p1, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v10

    .line 151
    sub-int/2addr v1, p2

    .line 152
    aget-byte p0, v3, v1

    .line 153
    .line 154
    if-ne p0, v5, :cond_2

    .line 155
    .line 156
    move v11, p2

    .line 157
    goto :goto_1

    .line 158
    :cond_2
    move v11, v4

    .line 159
    :goto_1
    new-instance v6, Lyyds/ᲈᲁᛷᲀ;

    .line 160
    .line 161
    invoke-direct/range {v6 .. v11}, Lyyds/ᲈᲁᛷᲀ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 162
    .line 163
    .line 164
    return-object v6

    .line 165
    :pswitch_3
    invoke-virtual {p0, p1, v1}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    return-object p0

    .line 170
    :pswitch_4
    invoke-virtual {p0, p1, v1}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    new-instance p1, Lyyds/ᛶᛳᲇᛳ;

    .line 175
    .line 176
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 177
    .line 178
    .line 179
    move-result p2

    .line 180
    const/16 v0, 0x5b

    .line 181
    .line 182
    if-ne p2, v0, :cond_3

    .line 183
    .line 184
    const/16 p2, 0x9

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_3
    const/16 p2, 0xc

    .line 188
    .line 189
    :goto_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    invoke-direct {p1, p2, v4, v0, p0}, Lyyds/ᛶᛳᲇᛳ;-><init>(IIILjava/lang/String;)V

    .line 194
    .line 195
    .line 196
    return-object p1

    .line 197
    :pswitch_5
    invoke-virtual {p0, v1}, Lyyds/ᛸᛴᲇᲇ;->ᛷᛲᲈᛱ(I)J

    .line 198
    .line 199
    .line 200
    move-result-wide p0

    .line 201
    invoke-static {p0, p1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 202
    .line 203
    .line 204
    move-result-wide p0

    .line 205
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    return-object p0

    .line 210
    :pswitch_6
    invoke-virtual {p0, v1}, Lyyds/ᛸᛴᲇᲇ;->ᛷᛲᲈᛱ(I)J

    .line 211
    .line 212
    .line 213
    move-result-wide p0

    .line 214
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    return-object p0

    .line 219
    :pswitch_7
    invoke-virtual {p0, v1}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    .line 220
    .line 221
    .line 222
    move-result p0

    .line 223
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 224
    .line 225
    .line 226
    move-result p0

    .line 227
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    return-object p0

    .line 232
    :pswitch_8
    invoke-virtual {p0, v1}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    .line 233
    .line 234
    .line 235
    move-result p0

    .line 236
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    return-object p0

    .line 241
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    :pswitch_data_1
    .packed-switch 0xf
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛶᲈᛴᲈ(I[Ljava/lang/Object;I[C[Lyyds/ᛳᲀᛷᛸ;)I
    .locals 4

    .line 1
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛸᛴᲇᲇ;->ᛵᛸᛸᛷ:[B

    .line 4
    .line 5
    aget-byte v1, v1, p1

    .line 6
    .line 7
    and-int/lit16 v1, v1, 0xff

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x3

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lyyds/ᛷᲈᲈᛶ;->ᛲᲈᲁ()V

    .line 15
    .line 16
    .line 17
    return v2

    .line 18
    :pswitch_0
    invoke-virtual {p0, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-static {p0, p5}, Lyyds/ᛸᛴᲇᲇ;->ᛲᲈᲁ(I[Lyyds/ᛳᲀᛷᛸ;)Lyyds/ᛳᲀᛷᛸ;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    aput-object p0, p2, p3

    .line 27
    .line 28
    :goto_0
    add-int/2addr p1, v3

    .line 29
    return p1

    .line 30
    :pswitch_1
    invoke-virtual {p0, p4, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛱᛳᲇ([CI)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    aput-object p0, p2, p3

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :pswitch_2
    const/4 p0, 0x6

    .line 38
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    aput-object p0, p2, p3

    .line 43
    .line 44
    return v0

    .line 45
    :pswitch_3
    const/4 p0, 0x5

    .line 46
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    aput-object p0, p2, p3

    .line 51
    .line 52
    return v0

    .line 53
    :pswitch_4
    const/4 p0, 0x4

    .line 54
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    aput-object p0, p2, p3

    .line 59
    .line 60
    return v0

    .line 61
    :pswitch_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    aput-object p0, p2, p3

    .line 66
    .line 67
    return v0

    .line 68
    :pswitch_6
    const/4 p0, 0x2

    .line 69
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    aput-object p0, p2, p3

    .line 74
    .line 75
    return v0

    .line 76
    :pswitch_7
    const/4 p0, 0x1

    .line 77
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    aput-object p0, p2, p3

    .line 82
    .line 83
    return v0

    .line 84
    :pswitch_8
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    aput-object p0, p2, p3

    .line 89
    .line 90
    return v0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛷᛲᲈᛱ(I)J
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-long v0, v0

    .line 6
    add-int/lit8 p1, p1, 0x4

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    int-to-long p0, p0

    .line 13
    const-wide v2, 0xffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    and-long/2addr p0, v2

    .line 19
    const/16 v2, 0x20

    .line 20
    .line 21
    shl-long/2addr v0, v2

    .line 22
    or-long/2addr p0, v0

    .line 23
    return-wide p0
.end method

.method public final ᛷᛵᲇᲀ(Lyyds/ᛶᲀᛱᛵ;Lyyds/ᛵᛳᛶᲇ;IZ)V
    .locals 7

    .line 1
    add-int/lit8 v0, p3, 0x1

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛸᛴᲇᲇ;->ᛵᛸᛸᛷ:[B

    .line 4
    .line 5
    aget-byte p3, v1, p3

    .line 6
    .line 7
    and-int/lit16 p3, p3, 0xff

    .line 8
    .line 9
    if-eqz p4, :cond_0

    .line 10
    .line 11
    iput p3, p1, Lyyds/ᛶᲀᛱᛵ;->ᛷᛸᲇᛶ:I

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iput p3, p1, Lyyds/ᛶᲀᛱᛵ;->ᛸᛸᛷᛱ:I

    .line 15
    .line 16
    :goto_0
    iget-object p2, p2, Lyyds/ᛵᛳᛶᲇ;->ᲀᛲᛳᲀ:[C

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    :goto_1
    if-ge v1, p3, :cond_5

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    add-int/lit8 v0, v0, 0x2

    .line 26
    .line 27
    :goto_2
    add-int/lit8 v3, v2, -0x1

    .line 28
    .line 29
    if-lez v2, :cond_4

    .line 30
    .line 31
    invoke-virtual {p0, p2, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    add-int/lit8 v0, v0, 0x2

    .line 36
    .line 37
    iget-object v4, p1, Lyyds/ᛶᲀᛱᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛶᲇᛸᛱ;

    .line 38
    .line 39
    iget-object v5, p1, Lyyds/ᛶᲀᛱᛵ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 40
    .line 41
    if-eqz p4, :cond_2

    .line 42
    .line 43
    iget-object v6, p1, Lyyds/ᛶᲀᛱᛵ;->ᛱᛳᛶᛳ:[Lyyds/ᲇᲇᛶᛶ;

    .line 44
    .line 45
    if-nez v6, :cond_1

    .line 46
    .line 47
    invoke-static {v5}, Lyyds/ᛶᛳᲇᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    new-array v6, v5, [Lyyds/ᲇᲇᛶᛶ;

    .line 52
    .line 53
    iput-object v6, p1, Lyyds/ᛶᲀᛱᛵ;->ᛱᛳᛶᛳ:[Lyyds/ᲇᲇᛶᛶ;

    .line 54
    .line 55
    :cond_1
    aget-object v5, v6, v1

    .line 56
    .line 57
    invoke-static {v4, v2, v5}, Lyyds/ᲇᲇᛶᛶ;->ᛲᛴᛳᛲ(Lyyds/ᛶᲇᛸᛱ;Ljava/lang/String;Lyyds/ᲇᲇᛶᛶ;)Lyyds/ᲇᲇᛶᛶ;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    aput-object v2, v6, v1

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_2
    iget-object v6, p1, Lyyds/ᛶᲀᛱᛵ;->ᲀᛲᛱᛱ:[Lyyds/ᲇᲇᛶᛶ;

    .line 65
    .line 66
    if-nez v6, :cond_3

    .line 67
    .line 68
    invoke-static {v5}, Lyyds/ᛶᛳᲇᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    new-array v6, v5, [Lyyds/ᲇᲇᛶᛶ;

    .line 73
    .line 74
    iput-object v6, p1, Lyyds/ᛶᲀᛱᛵ;->ᲀᛲᛱᛱ:[Lyyds/ᲇᲇᛶᛶ;

    .line 75
    .line 76
    :cond_3
    aget-object v5, v6, v1

    .line 77
    .line 78
    invoke-static {v4, v2, v5}, Lyyds/ᲇᲇᛶᛶ;->ᛲᛴᛳᛲ(Lyyds/ᛶᲇᛸᛱ;Ljava/lang/String;Lyyds/ᲇᲇᛶᛶ;)Lyyds/ᲇᲇᛶᛶ;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    aput-object v2, v6, v1

    .line 83
    .line 84
    :goto_3
    const/4 v4, 0x1

    .line 85
    invoke-virtual {p0, v2, v0, v4, p2}, Lyyds/ᛸᛴᲇᲇ;->ᛲᛳᛶᲁ(Lyyds/ᲇᲇᛶᛶ;IZ[C)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    move v2, v3

    .line 90
    goto :goto_2

    .line 91
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_5
    return-void
.end method

.method public final ᛷᲈᲈᲁ(I)I
    .locals 2

    .line 1
    iget-object p0, p0, Lyyds/ᛸᛴᲇᲇ;->ᛵᛸᛸᛷ:[B

    .line 2
    .line 3
    aget-byte v0, p0, p1

    .line 4
    .line 5
    and-int/lit16 v0, v0, 0xff

    .line 6
    .line 7
    shl-int/lit8 v0, v0, 0x18

    .line 8
    .line 9
    add-int/lit8 v1, p1, 0x1

    .line 10
    .line 11
    aget-byte v1, p0, v1

    .line 12
    .line 13
    and-int/lit16 v1, v1, 0xff

    .line 14
    .line 15
    shl-int/lit8 v1, v1, 0x10

    .line 16
    .line 17
    or-int/2addr v0, v1

    .line 18
    add-int/lit8 v1, p1, 0x2

    .line 19
    .line 20
    aget-byte v1, p0, v1

    .line 21
    .line 22
    and-int/lit16 v1, v1, 0xff

    .line 23
    .line 24
    shl-int/lit8 v1, v1, 0x8

    .line 25
    .line 26
    or-int/2addr v0, v1

    .line 27
    add-int/lit8 p1, p1, 0x3

    .line 28
    .line 29
    aget-byte p0, p0, p1

    .line 30
    .line 31
    and-int/lit16 p0, p0, 0xff

    .line 32
    .line 33
    or-int/2addr p0, v0

    .line 34
    return p0
.end method

.method public final ᲀᛲᛲᲇ([CI)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛸᛴᲇᲇ;->ᲇᲈᛵᛷ:[Ljava/lang/String;

    .line 2
    .line 3
    aget-object v1, v0, p2

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-object v1

    .line 8
    :cond_0
    iget-object v1, p0, Lyyds/ᛸᛴᲇᲇ;->ᲀᛲᛳᲀ:[I

    .line 9
    .line 10
    aget v1, v1, p2

    .line 11
    .line 12
    add-int/lit8 v2, v1, 0x2

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {p0, p1, v2, v1}, Lyyds/ᛸᛴᲇᲇ;->ᛳᛸᛴᛶ([CII)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    aput-object p0, v0, p2

    .line 23
    .line 24
    return-object p0
.end method

.method public final ᲀᛲᛳᲀ([II)I
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    if-ge p2, v0, :cond_1

    .line 5
    .line 6
    aget v0, p1, p2

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛲᛴᛳᛲ(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/16 v1, 0x43

    .line 13
    .line 14
    if-ge v0, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    aget p1, p1, p2

    .line 18
    .line 19
    add-int/lit8 p1, p1, 0x1

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_1
    :goto_0
    const/4 p0, -0x1

    .line 27
    return p0
.end method

.method public final ᲇᛱᛲ(Lyyds/ᛶᲀᛱᛵ;Lyyds/ᛵᛳᛶᲇ;IZ)[I
    .locals 11

    .line 1
    iget-object v0, p2, Lyyds/ᛵᛳᛶᲇ;->ᲀᛲᛳᲀ:[C

    .line 2
    .line 3
    invoke-virtual {p0, p3}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    new-array v2, v1, [I

    .line 8
    .line 9
    add-int/lit8 p3, p3, 0x2

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    :goto_0
    if-ge v3, v1, :cond_5

    .line 13
    .line 14
    aput p3, v2, v3

    .line 15
    .line 16
    invoke-virtual {p0, p3}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    ushr-int/lit8 v5, v4, 0x18

    .line 21
    .line 22
    const/16 v6, 0x17

    .line 23
    .line 24
    const/4 v7, 0x0

    .line 25
    if-eq v5, v6, :cond_0

    .line 26
    .line 27
    packed-switch v5, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    packed-switch v5, :pswitch_data_1

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lyyds/ᛷᲈᲈᛶ;->ᛲᲈᲁ()V

    .line 34
    .line 35
    .line 36
    return-object v7

    .line 37
    :pswitch_0
    add-int/lit8 p3, p3, 0x4

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :pswitch_1
    add-int/lit8 v6, p3, 0x1

    .line 41
    .line 42
    invoke-virtual {p0, v6}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    add-int/lit8 p3, p3, 0x3

    .line 47
    .line 48
    :goto_1
    add-int/lit8 v8, v6, -0x1

    .line 49
    .line 50
    if-lez v6, :cond_1

    .line 51
    .line 52
    invoke-virtual {p0, p3}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    add-int/lit8 v9, p3, 0x2

    .line 57
    .line 58
    invoke-virtual {p0, v9}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    .line 59
    .line 60
    .line 61
    move-result v9

    .line 62
    add-int/lit8 p3, p3, 0x6

    .line 63
    .line 64
    iget-object v10, p2, Lyyds/ᛵᛳᛶᲇ;->ᛶᛷᛲᲁ:[Lyyds/ᛳᲀᛷᛸ;

    .line 65
    .line 66
    invoke-static {v6, v10}, Lyyds/ᛸᛴᲇᲇ;->ᛲᲈᲁ(I[Lyyds/ᛳᲀᛷᛸ;)Lyyds/ᛳᲀᛷᛸ;

    .line 67
    .line 68
    .line 69
    add-int/2addr v6, v9

    .line 70
    iget-object v9, p2, Lyyds/ᛵᛳᛶᲇ;->ᛶᛷᛲᲁ:[Lyyds/ᛳᲀᛷᛸ;

    .line 71
    .line 72
    invoke-static {v6, v9}, Lyyds/ᛸᛴᲇᲇ;->ᛲᲈᲁ(I[Lyyds/ᛳᲀᛷᛸ;)Lyyds/ᛳᲀᛷᛸ;

    .line 73
    .line 74
    .line 75
    move v6, v8

    .line 76
    goto :goto_1

    .line 77
    :cond_0
    :pswitch_2
    add-int/lit8 p3, p3, 0x3

    .line 78
    .line 79
    :cond_1
    :goto_2
    invoke-virtual {p0, p3}, Lyyds/ᛸᛴᲇᲇ;->ᛲᛴᛳᛲ(I)I

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    const/16 v8, 0x42

    .line 84
    .line 85
    const/4 v9, 0x1

    .line 86
    if-ne v5, v8, :cond_4

    .line 87
    .line 88
    if-nez v6, :cond_2

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_2
    new-instance v7, Lyyds/ᲇᲇᛳᛴ;

    .line 92
    .line 93
    iget-object v5, p0, Lyyds/ᛸᛴᲇᲇ;->ᛵᛸᛸᛷ:[B

    .line 94
    .line 95
    invoke-direct {v7, p3, v5}, Lyyds/ᲇᲇᛳᛴ;-><init>(I[B)V

    .line 96
    .line 97
    .line 98
    :goto_3
    mul-int/lit8 v6, v6, 0x2

    .line 99
    .line 100
    add-int/2addr v6, v9

    .line 101
    add-int/2addr v6, p3

    .line 102
    invoke-virtual {p0, v0, v6}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p3

    .line 106
    add-int/lit8 v6, v6, 0x2

    .line 107
    .line 108
    and-int/lit16 v4, v4, -0x100

    .line 109
    .line 110
    iget-object v5, p1, Lyyds/ᛶᲀᛱᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛶᲇᛸᛱ;

    .line 111
    .line 112
    if-eqz p4, :cond_3

    .line 113
    .line 114
    iget-object v8, p1, Lyyds/ᛶᲀᛱᛵ;->ᛶᲈᛴᲈ:Lyyds/ᲇᲇᛶᛶ;

    .line 115
    .line 116
    invoke-static {v5, v4, v7, p3, v8}, Lyyds/ᲇᲇᛶᛶ;->ᲇᲈᛵᛷ(Lyyds/ᛶᲇᛸᛱ;ILyyds/ᲇᲇᛳᛴ;Ljava/lang/String;Lyyds/ᲇᲇᛶᛶ;)Lyyds/ᲇᲇᛶᛶ;

    .line 117
    .line 118
    .line 119
    move-result-object p3

    .line 120
    iput-object p3, p1, Lyyds/ᛶᲀᛱᛵ;->ᛶᲈᛴᲈ:Lyyds/ᲇᲇᛶᛶ;

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_3
    iget-object v8, p1, Lyyds/ᛶᲀᛱᛵ;->ᛶᛸᲀᲁ:Lyyds/ᲇᲇᛶᛶ;

    .line 124
    .line 125
    invoke-static {v5, v4, v7, p3, v8}, Lyyds/ᲇᲇᛶᛶ;->ᲇᲈᛵᛷ(Lyyds/ᛶᲇᛸᛱ;ILyyds/ᲇᲇᛳᛴ;Ljava/lang/String;Lyyds/ᲇᲇᛶᛶ;)Lyyds/ᲇᲇᛶᛶ;

    .line 126
    .line 127
    .line 128
    move-result-object p3

    .line 129
    iput-object p3, p1, Lyyds/ᛶᲀᛱᛵ;->ᛶᛸᲀᲁ:Lyyds/ᲇᲇᛶᛶ;

    .line 130
    .line 131
    :goto_4
    invoke-virtual {p0, p3, v6, v9, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛲᛳᛶᲁ(Lyyds/ᲇᲇᛶᛶ;IZ[C)I

    .line 132
    .line 133
    .line 134
    move-result p3

    .line 135
    goto :goto_5

    .line 136
    :cond_4
    mul-int/lit8 v6, v6, 0x2

    .line 137
    .line 138
    add-int/lit8 v6, v6, 0x3

    .line 139
    .line 140
    add-int/2addr v6, p3

    .line 141
    invoke-virtual {p0, v7, v6, v9, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛲᛳᛶᲁ(Lyyds/ᲇᲇᛶᛶ;IZ[C)I

    .line 142
    .line 143
    .line 144
    move-result p3

    .line 145
    :goto_5
    add-int/lit8 v3, v3, 0x1

    .line 146
    .line 147
    goto/16 :goto_0

    .line 148
    .line 149
    :cond_5
    return-object v2

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x40
        :pswitch_1
        :pswitch_1
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

.method public final ᲇᲇᲇᛱ(Lyyds/ᛶᲀᛱᛵ;Lyyds/ᛵᛳᛶᲇ;I)V
    .locals 53

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v8, p2

    move/from16 v2, p3

    .line 1
    iget v7, v1, Lyyds/ᛶᲀᛱᛵ;->ᛸᛴᛵᛶ:I

    iget-object v9, v1, Lyyds/ᛶᲀᛱᛵ;->ᛷᲈᲈᲁ:Lyyds/ᲇᲇᛳᛴ;

    iget-object v10, v1, Lyyds/ᛶᲀᛱᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛶᲇᛸᛱ;

    .line 2
    iget-object v11, v8, Lyyds/ᛵᛳᛶᲇ;->ᲀᛲᛳᲀ:[C

    .line 3
    invoke-virtual {v0, v2}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v12

    add-int/lit8 v3, v2, 0x2

    .line 4
    invoke-virtual {v0, v3}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v3

    add-int/lit8 v4, v2, 0x4

    .line 5
    invoke-virtual {v0, v4}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    move-result v13

    const/16 v14, 0x8

    add-int/lit8 v15, v2, 0x8

    .line 6
    iget-object v2, v0, Lyyds/ᛸᛴᲇᲇ;->ᛵᛸᛸᛷ:[B

    array-length v4, v2

    sub-int/2addr v4, v15

    if-gt v13, v4, :cond_73

    add-int v4, v15, v13

    add-int/lit8 v5, v13, 0x1

    .line 7
    new-array v5, v5, [Lyyds/ᛳᲀᛷᛸ;

    iput-object v5, v8, Lyyds/ᛵᛳᛶᲇ;->ᛶᛷᛲᲁ:[Lyyds/ᛳᲀᛷᛸ;

    move v6, v15

    :goto_0
    move-object/from16 p3, v2

    move/from16 v16, v14

    const/16 v14, 0xff

    const/16 v18, 0x1

    if-ge v6, v4, :cond_3

    sub-int v19, v6, v15

    const/16 v20, 0x4

    .line 8
    aget-byte v2, p3, v6

    and-int/2addr v2, v14

    packed-switch v2, :pswitch_data_0

    .line 9
    invoke-static {}, Lyyds/ᛷᲈᲈᛶ;->ᛲᲈᲁ()V

    return-void

    :pswitch_0
    add-int/lit8 v2, v6, 0x1

    .line 10
    invoke-virtual {v0, v2}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v2

    add-int v2, v2, v19

    invoke-static {v2, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛲᲈᲁ(I[Lyyds/ᛳᲀᛷᛸ;)Lyyds/ᛳᲀᛷᛸ;

    :goto_1
    :pswitch_1
    add-int/lit8 v6, v6, 0x3

    goto/16 :goto_4

    :pswitch_2
    add-int/lit8 v2, v6, 0x1

    .line 11
    invoke-virtual {v0, v2}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    move-result v2

    add-int v2, v2, v19

    invoke-static {v2, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛲᲈᲁ(I[Lyyds/ᛳᲀᛷᛸ;)Lyyds/ᛳᲀᛷᛸ;

    :pswitch_3
    add-int/lit8 v6, v6, 0x5

    goto/16 :goto_4

    :cond_0
    :pswitch_4
    add-int/lit8 v6, v6, 0x4

    goto/16 :goto_4

    :pswitch_5
    add-int/lit8 v2, v6, 0x1

    .line 12
    aget-byte v2, p3, v2

    and-int/2addr v2, v14

    const/16 v14, 0x84

    if-eq v2, v14, :cond_1

    const/16 v14, 0xa9

    if-eq v2, v14, :cond_0

    packed-switch v2, :pswitch_data_1

    packed-switch v2, :pswitch_data_2

    .line 13
    invoke-static {}, Lyyds/ᛷᲈᲈᛶ;->ᛲᲈᲁ()V

    return-void

    :cond_1
    add-int/lit8 v6, v6, 0x6

    goto/16 :goto_4

    :pswitch_6
    and-int/lit8 v2, v19, 0x3

    rsub-int/lit8 v2, v2, 0x4

    add-int/2addr v2, v6

    .line 14
    invoke-virtual {v0, v2}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    move-result v6

    add-int v6, v6, v19

    invoke-static {v6, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛲᲈᲁ(I[Lyyds/ᛳᲀᛷᛸ;)Lyyds/ᛳᲀᛷᛸ;

    add-int/lit8 v6, v2, 0x4

    .line 15
    invoke-virtual {v0, v6}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    move-result v6

    add-int/lit8 v2, v2, 0x8

    :goto_2
    add-int/lit8 v14, v6, -0x1

    if-lez v6, :cond_2

    add-int/lit8 v6, v2, 0x4

    .line 16
    invoke-virtual {v0, v6}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    move-result v6

    add-int v6, v6, v19

    invoke-static {v6, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛲᲈᲁ(I[Lyyds/ᛳᲀᛷᛸ;)Lyyds/ᛳᲀᛷᛸ;

    add-int/lit8 v2, v2, 0x8

    move v6, v14

    goto :goto_2

    :cond_2
    move v6, v2

    goto :goto_4

    :pswitch_7
    and-int/lit8 v2, v19, 0x3

    rsub-int/lit8 v2, v2, 0x4

    add-int/2addr v2, v6

    .line 17
    invoke-virtual {v0, v2}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    move-result v6

    add-int v6, v6, v19

    invoke-static {v6, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛲᲈᲁ(I[Lyyds/ᛳᲀᛷᛸ;)Lyyds/ᛳᲀᛷᛸ;

    add-int/lit8 v6, v2, 0x8

    .line 18
    invoke-virtual {v0, v6}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    move-result v6

    add-int/lit8 v14, v2, 0x4

    invoke-virtual {v0, v14}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    move-result v14

    sub-int/2addr v6, v14

    add-int/lit8 v6, v6, 0x1

    add-int/lit8 v2, v2, 0xc

    :goto_3
    add-int/lit8 v14, v6, -0x1

    if-lez v6, :cond_2

    .line 19
    invoke-virtual {v0, v2}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    move-result v6

    add-int v6, v6, v19

    invoke-static {v6, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛲᲈᲁ(I[Lyyds/ᛳᲀᛷᛸ;)Lyyds/ᛳᲀᛷᛸ;

    add-int/lit8 v2, v2, 0x4

    move v6, v14

    goto :goto_3

    :pswitch_8
    add-int/lit8 v2, v6, 0x1

    .line 20
    invoke-virtual {v0, v2}, Lyyds/ᛸᛴᲇᲇ;->ᛲᛲᲈᲈ(I)S

    move-result v2

    add-int v2, v2, v19

    invoke-static {v2, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛲᲈᲁ(I[Lyyds/ᛳᲀᛷᛸ;)Lyyds/ᛳᲀᛷᛸ;

    goto/16 :goto_1

    :pswitch_9
    add-int/lit8 v6, v6, 0x2

    goto :goto_4

    :pswitch_a
    add-int/lit8 v6, v6, 0x1

    :goto_4
    move-object/from16 v2, p3

    move/from16 v14, v16

    goto/16 :goto_0

    :cond_3
    const/16 v17, 0x84

    const/16 v20, 0x4

    .line 21
    invoke-virtual {v0, v6}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v2

    move/from16 v19, v2

    const/4 v2, 0x2

    add-int/2addr v6, v2

    :goto_5
    add-int/lit8 v21, v19, -0x1

    move/from16 v22, v2

    const/4 v2, 0x7

    move/from16 v23, v4

    .line 22
    iget-object v4, v0, Lyyds/ᛸᛴᲇᲇ;->ᲀᛲᛳᲀ:[I

    move-object/from16 v24, v4

    if-lez v19, :cond_6

    .line 23
    invoke-virtual {v0, v6}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v14

    invoke-static {v14, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛲᲈᲁ(I[Lyyds/ᛳᲀᛷᛸ;)Lyyds/ᛳᲀᛷᛸ;

    move-result-object v26

    add-int/lit8 v14, v6, 0x2

    .line 24
    invoke-virtual {v0, v14}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v14

    invoke-static {v14, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛲᲈᲁ(I[Lyyds/ᛳᲀᛷᛸ;)Lyyds/ᛳᲀᛷᛸ;

    move-result-object v27

    add-int/lit8 v14, v6, 0x4

    .line 25
    invoke-virtual {v0, v14}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v14

    invoke-static {v14, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛲᲈᲁ(I[Lyyds/ᛳᲀᛷᛸ;)Lyyds/ᛳᲀᛷᛸ;

    move-result-object v28

    add-int/lit8 v14, v6, 0x6

    .line 26
    invoke-virtual {v0, v14}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v14

    aget v14, v24, v14

    invoke-virtual {v0, v11, v14}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    move-result-object v14

    add-int/lit8 v6, v6, 0x8

    .line 27
    new-instance v25, Lyyds/ᛵᲇᛸᲇ;

    if-eqz v14, :cond_4

    .line 28
    invoke-virtual {v10, v2, v14}, Lyyds/ᛶᲇᛸᛱ;->ᛷᲈᲈᲁ(ILjava/lang/String;)Lyyds/ᲇᛱ;

    move-result-object v2

    .line 29
    iget v4, v2, Lyyds/ᲇᛱ;->ᛲᲈᲁ:I

    move/from16 v29, v4

    :goto_6
    move-object/from16 v30, v14

    goto :goto_7

    :cond_4
    const/16 v29, 0x0

    goto :goto_6

    :goto_7
    invoke-direct/range {v25 .. v30}, Lyyds/ᛵᲇᛸᲇ;-><init>(Lyyds/ᛳᲀᛷᛸ;Lyyds/ᛳᲀᛷᛸ;Lyyds/ᛳᲀᛷᛸ;ILjava/lang/String;)V

    move-object/from16 v2, v25

    .line 30
    iget-object v4, v1, Lyyds/ᛶᲀᛱᛵ;->ᛷᛲᲈᛱ:Lyyds/ᛵᲇᛸᲇ;

    if-nez v4, :cond_5

    .line 31
    iput-object v2, v1, Lyyds/ᛶᲀᛱᛵ;->ᛷᛲᲈᛱ:Lyyds/ᛵᲇᛸᲇ;

    goto :goto_8

    .line 32
    :cond_5
    iget-object v4, v1, Lyyds/ᛶᲀᛱᛵ;->ᛷᛵᲇᲀ:Lyyds/ᛵᲇᛸᲇ;

    iput-object v2, v4, Lyyds/ᛵᲇᛸᲇ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 33
    :goto_8
    iput-object v2, v1, Lyyds/ᛶᲀᛱᛵ;->ᛷᛵᲇᲀ:Lyyds/ᛵᲇᛸᲇ;

    move/from16 v19, v21

    move/from16 v2, v22

    move/from16 v4, v23

    const/16 v14, 0xff

    goto :goto_5

    .line 34
    :cond_6
    invoke-virtual {v0, v6}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v14

    add-int/lit8 v6, v6, 0x2

    move/from16 v28, v18

    const/4 v2, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    :goto_9
    add-int/lit8 v29, v14, -0x1

    if-lez v14, :cond_1a

    .line 35
    invoke-virtual {v0, v11, v6}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    move-result-object v14

    const/16 v30, 0x0

    add-int/lit8 v4, v6, 0x2

    .line 36
    invoke-virtual {v0, v4}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    move-result v4

    move/from16 v35, v6

    add-int/lit8 v6, v35, 0x6

    move/from16 v36, v15

    .line 37
    const-string v15, "LocalVariableTable"

    invoke-virtual {v15, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_d

    .line 38
    iget v14, v8, Lyyds/ᛵᛳᛶᲇ;->ᛵᛸᛸᛷ:I

    and-int/lit8 v14, v14, 0x2

    if-nez v14, :cond_c

    .line 39
    invoke-virtual {v0, v6}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v14

    add-int/lit8 v15, v35, 0x8

    :goto_a
    add-int/lit8 v33, v14, -0x1

    if-lez v14, :cond_b

    .line 40
    invoke-virtual {v0, v15}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v14

    .line 41
    aget-object v35, v5, v14

    if-nez v35, :cond_8

    if-nez v35, :cond_7

    .line 42
    new-instance v35, Lyyds/ᛳᲀᛷᛸ;

    .line 43
    invoke-direct/range {v35 .. v35}, Ljava/lang/Object;-><init>()V

    .line 44
    aput-object v35, v5, v14

    :cond_7
    move/from16 v35, v14

    .line 45
    aget-object v14, v5, v35

    move/from16 v37, v15

    .line 46
    iget-short v15, v14, Lyyds/ᛳᲀᛷᛸ;->ᛲᲈᲁ:S

    or-int/lit8 v15, v15, 0x1

    int-to-short v15, v15

    iput-short v15, v14, Lyyds/ᛳᲀᛷᛸ;->ᛲᲈᲁ:S

    goto :goto_b

    :cond_8
    move/from16 v35, v14

    move/from16 v37, v15

    :goto_b
    add-int/lit8 v15, v37, 0x2

    .line 47
    invoke-virtual {v0, v15}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v14

    add-int v14, v14, v35

    .line 48
    aget-object v15, v5, v14

    if-nez v15, :cond_a

    if-nez v15, :cond_9

    .line 49
    new-instance v15, Lyyds/ᛳᲀᛷᛸ;

    .line 50
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 51
    aput-object v15, v5, v14

    .line 52
    :cond_9
    aget-object v14, v5, v14

    .line 53
    iget-short v15, v14, Lyyds/ᛳᲀᛷᛸ;->ᛲᲈᲁ:S

    or-int/lit8 v15, v15, 0x1

    int-to-short v15, v15

    iput-short v15, v14, Lyyds/ᛳᲀᛷᛸ;->ᛲᲈᲁ:S

    :cond_a
    add-int/lit8 v15, v37, 0xa

    move/from16 v14, v33

    goto :goto_a

    :cond_b
    move/from16 v33, v6

    :cond_c
    :goto_c
    move/from16 v39, v7

    move-object/from16 v42, v9

    move-object/from16 v37, v10

    goto/16 :goto_11

    .line 54
    :cond_d
    const-string v15, "LocalVariableTypeTable"

    invoke-virtual {v15, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_e

    move/from16 v34, v6

    goto :goto_c

    .line 55
    :cond_e
    const-string v15, "LineNumberTable"

    invoke-virtual {v15, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_14

    .line 56
    iget v14, v8, Lyyds/ᛵᛳᛶᲇ;->ᛵᛸᛸᛷ:I

    and-int/lit8 v14, v14, 0x2

    if-nez v14, :cond_c

    .line 57
    invoke-virtual {v0, v6}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v14

    add-int/lit8 v15, v35, 0x8

    :goto_d
    add-int/lit8 v35, v14, -0x1

    if-lez v14, :cond_c

    .line 58
    invoke-virtual {v0, v15}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v14

    move/from16 v37, v14

    add-int/lit8 v14, v15, 0x2

    .line 59
    invoke-virtual {v0, v14}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v14

    add-int/lit8 v15, v15, 0x4

    .line 60
    aget-object v38, v5, v37

    if-nez v38, :cond_10

    if-nez v38, :cond_f

    .line 61
    new-instance v38, Lyyds/ᛳᲀᛷᛸ;

    .line 62
    invoke-direct/range {v38 .. v38}, Ljava/lang/Object;-><init>()V

    .line 63
    aput-object v38, v5, v37

    :cond_f
    move/from16 v38, v15

    .line 64
    aget-object v15, v5, v37

    move/from16 v39, v7

    .line 65
    iget-short v7, v15, Lyyds/ᛳᲀᛷᛸ;->ᛲᲈᲁ:S

    or-int/lit8 v7, v7, 0x1

    int-to-short v7, v7

    iput-short v7, v15, Lyyds/ᛳᲀᛷᛸ;->ᛲᲈᲁ:S

    goto :goto_e

    :cond_10
    move/from16 v39, v7

    move/from16 v38, v15

    .line 66
    :goto_e
    aget-object v7, v5, v37

    .line 67
    iget-short v15, v7, Lyyds/ᛳᲀᛷᛸ;->ᛲᲈᲁ:S

    move-object/from16 v37, v10

    and-int/lit16 v10, v15, 0x80

    if-nez v10, :cond_11

    or-int/lit16 v10, v15, 0x80

    int-to-short v10, v10

    .line 68
    iput-short v10, v7, Lyyds/ᛳᲀᛷᛸ;->ᛲᲈᲁ:S

    int-to-short v10, v14

    .line 69
    iput-short v10, v7, Lyyds/ᛳᲀᛷᛸ;->ᛵᛸᛸᛷ:S

    move-object/from16 v42, v9

    goto :goto_10

    .line 70
    :cond_11
    iget-object v10, v7, Lyyds/ᛳᲀᛷᛸ;->ᲀᛲᛳᲀ:[I

    move/from16 v15, v20

    if-nez v10, :cond_12

    .line 71
    new-array v10, v15, [I

    iput-object v10, v7, Lyyds/ᛳᲀᛷᛸ;->ᲀᛲᛳᲀ:[I

    .line 72
    :cond_12
    aget v20, v10, v30

    move/from16 v40, v15

    add-int/lit8 v15, v20, 0x1

    aput v15, v10, v30

    move/from16 v41, v14

    .line 73
    array-length v14, v10

    if-lt v15, v14, :cond_13

    .line 74
    array-length v14, v10

    add-int/lit8 v14, v14, 0x4

    new-array v14, v14, [I

    move/from16 v40, v15

    .line 75
    array-length v15, v10

    move-object/from16 v42, v9

    move/from16 v9, v30

    invoke-static {v10, v9, v14, v9, v15}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 76
    iput-object v14, v7, Lyyds/ᛳᲀᛷᛸ;->ᲀᛲᛳᲀ:[I

    move-object v10, v14

    goto :goto_f

    :cond_13
    move-object/from16 v42, v9

    move/from16 v40, v15

    .line 77
    :goto_f
    aput v41, v10, v40

    :goto_10
    move/from16 v14, v35

    move-object/from16 v10, v37

    move/from16 v15, v38

    move/from16 v7, v39

    move-object/from16 v9, v42

    const/16 v20, 0x4

    const/16 v30, 0x0

    goto/16 :goto_d

    :cond_14
    move/from16 v39, v7

    move-object/from16 v42, v9

    move-object/from16 v37, v10

    .line 78
    const-string v7, "RuntimeVisibleTypeAnnotations"

    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_15

    move/from16 v7, v18

    .line 79
    invoke-virtual {v0, v1, v8, v6, v7}, Lyyds/ᛸᛴᲇᲇ;->ᲇᛱᛲ(Lyyds/ᛶᲀᛱᛵ;Lyyds/ᛵᛳᛶᲇ;IZ)[I

    move-result-object v31

    goto :goto_11

    .line 80
    :cond_15
    const-string v7, "RuntimeInvisibleTypeAnnotations"

    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_16

    const/4 v9, 0x0

    .line 81
    invoke-virtual {v0, v1, v8, v6, v9}, Lyyds/ᛸᛴᲇᲇ;->ᲇᛱᛲ(Lyyds/ᛶᲀᛱᛵ;Lyyds/ᛵᛳᛶᲇ;IZ)[I

    move-result-object v32

    goto :goto_11

    .line 82
    :cond_16
    const-string v7, "StackMapTable"

    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_17

    .line 83
    iget v7, v8, Lyyds/ᛵᛳᛶᲇ;->ᛵᛸᛸᛷ:I

    const/16 v20, 0x4

    and-int/lit8 v7, v7, 0x4

    if-nez v7, :cond_19

    add-int/lit8 v25, v35, 0x8

    add-int v7, v6, v4

    move/from16 v27, v7

    goto :goto_11

    :cond_17
    const/16 v20, 0x4

    .line 84
    const-string v7, "StackMap"

    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_18

    .line 85
    iget v7, v8, Lyyds/ᛵᛳᛶᲇ;->ᛵᛸᛸᛷ:I

    and-int/lit8 v7, v7, 0x4

    if-nez v7, :cond_19

    add-int/lit8 v25, v35, 0x8

    add-int v7, v6, v4

    move/from16 v27, v7

    const/16 v28, 0x0

    goto :goto_11

    .line 86
    :cond_18
    iget-object v7, v8, Lyyds/ᛵᛳᛶᲇ;->ᛲᲈᲁ:[Lyyds/ᛳᛷᲀᛴ;

    .line 87
    invoke-virtual {v0, v7, v14, v6, v4}, Lyyds/ᛸᛴᲇᲇ;->ᲇᲈᛵᛷ([Lyyds/ᛳᛷᲀᛴ;Ljava/lang/String;II)Lyyds/ᛳᛷᲀᛴ;

    move-result-object v7

    .line 88
    iput-object v2, v7, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    move-object v2, v7

    :cond_19
    :goto_11
    add-int/2addr v6, v4

    move/from16 v14, v29

    move/from16 v15, v36

    move-object/from16 v10, v37

    move/from16 v7, v39

    move-object/from16 v9, v42

    const/16 v18, 0x1

    const/16 v20, 0x4

    goto/16 :goto_9

    :cond_1a
    move/from16 v39, v7

    move-object/from16 v42, v9

    move-object/from16 v37, v10

    move/from16 v36, v15

    .line 89
    iget v4, v8, Lyyds/ᛵᛳᛶᲇ;->ᛵᛸᛸᛷ:I

    and-int/lit8 v4, v4, 0x8

    if-eqz v4, :cond_1b

    const/4 v9, 0x1

    goto :goto_12

    :cond_1b
    const/4 v9, 0x0

    :goto_12
    const/4 v10, -0x1

    if-eqz v25, :cond_28

    .line 90
    iput v10, v8, Lyyds/ᛵᛳᛶᲇ;->ᛲᛲᲈᲈ:I

    const/4 v4, 0x0

    .line 91
    iput v4, v8, Lyyds/ᛵᛳᛶᲇ;->ᛱᛳᲇ:I

    .line 92
    iput v4, v8, Lyyds/ᛵᛳᛶᲇ;->ᛳᲁᲁᲇ:I

    .line 93
    iput v4, v8, Lyyds/ᛵᛳᛶᲇ;->ᲇᛱᛲ:I

    .line 94
    new-array v6, v3, [Ljava/lang/Object;

    iput-object v6, v8, Lyyds/ᛵᛳᛶᲇ;->ᛶᛳᛶᛵ:[Ljava/lang/Object;

    .line 95
    iput v4, v8, Lyyds/ᛵᛳᛶᲇ;->ᛵᛶᛲᲀ:I

    .line 96
    new-array v4, v12, [Ljava/lang/Object;

    iput-object v4, v8, Lyyds/ᛵᛳᛶᲇ;->ᲀᛲᛲᲇ:[Ljava/lang/Object;

    if-eqz v9, :cond_26

    .line 97
    iget-object v4, v8, Lyyds/ᛵᛳᛶᲇ;->ᲇᲇᲇᛱ:Ljava/lang/String;

    .line 98
    iget v15, v8, Lyyds/ᛵᛳᛶᲇ;->ᲇᲈᛵᛷ:I

    and-int/lit8 v15, v15, 0x8

    if-nez v15, :cond_1d

    .line 99
    const-string v15, "<init>"

    const/16 v29, 0x3

    iget-object v14, v8, Lyyds/ᛵᛳᛶᲇ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    invoke-virtual {v15, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_1c

    const/4 v14, 0x6

    .line 100
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/16 v30, 0x0

    aput-object v14, v6, v30

    :goto_13
    const/4 v14, 0x1

    goto :goto_14

    :cond_1c
    const/16 v30, 0x0

    .line 101
    iget v14, v0, Lyyds/ᛸᛴᲇᲇ;->ᛲᲈᲁ:I

    add-int/lit8 v14, v14, 0x2

    iget-object v15, v8, Lyyds/ᛵᛳᛶᲇ;->ᲀᛲᛳᲀ:[C

    .line 102
    invoke-virtual {v0, v15, v14}, Lyyds/ᛸᛴᲇᲇ;->ᛱᛳᲇ([CI)Ljava/lang/String;

    move-result-object v14

    .line 103
    aput-object v14, v6, v30

    goto :goto_13

    :cond_1d
    const/16 v29, 0x3

    const/16 v30, 0x0

    move/from16 v14, v30

    :goto_14
    move v15, v14

    const/4 v14, 0x1

    :goto_15
    add-int/lit8 v10, v14, 0x1

    .line 104
    invoke-virtual {v4, v14}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v1, 0x46

    if-eq v7, v1, :cond_25

    const/16 v1, 0x4c

    if-eq v7, v1, :cond_23

    const/16 v1, 0x53

    if-eq v7, v1, :cond_1e

    const/16 v1, 0x49

    if-eq v7, v1, :cond_1e

    const/16 v1, 0x4a

    if-eq v7, v1, :cond_22

    const/16 v1, 0x5a

    if-eq v7, v1, :cond_1e

    const/16 v1, 0x5b

    if-eq v7, v1, :cond_1f

    packed-switch v7, :pswitch_data_3

    .line 105
    iput v15, v8, Lyyds/ᛵᛳᛶᲇ;->ᛳᲁᲁᲇ:I

    :goto_16
    const/16 v18, 0x1

    const/16 v20, 0x4

    goto/16 :goto_1e

    :pswitch_b
    add-int/lit8 v1, v15, 0x1

    .line 106
    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v15

    :goto_17
    move v15, v1

    move v14, v10

    const/16 v18, 0x1

    const/16 v20, 0x4

    goto/16 :goto_1d

    :cond_1e
    :pswitch_c
    const/16 v20, 0x4

    goto :goto_1a

    .line 107
    :cond_1f
    :goto_18
    invoke-virtual {v4, v10}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-ne v7, v1, :cond_20

    add-int/lit8 v10, v10, 0x1

    goto :goto_18

    .line 108
    :cond_20
    invoke-virtual {v4, v10}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v7, 0x4c

    if-ne v1, v7, :cond_21

    :goto_19
    add-int/lit8 v10, v10, 0x1

    .line 109
    invoke-virtual {v4, v10}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v7, 0x3b

    if-eq v1, v7, :cond_21

    goto :goto_19

    :cond_21
    add-int/lit8 v1, v15, 0x1

    const/16 v18, 0x1

    add-int/lit8 v10, v10, 0x1

    .line 110
    invoke-virtual {v4, v14, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v15

    goto :goto_17

    :cond_22
    add-int/lit8 v1, v15, 0x1

    const/16 v20, 0x4

    .line 111
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v15

    move v15, v1

    move v14, v10

    const/16 v18, 0x1

    goto :goto_1d

    :goto_1a
    add-int/lit8 v1, v15, 0x1

    const/16 v18, 0x1

    .line 112
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v15

    :goto_1b
    move v15, v1

    move v14, v10

    goto :goto_1d

    :cond_23
    const/16 v18, 0x1

    const/16 v20, 0x4

    move v1, v10

    .line 113
    :goto_1c
    invoke-virtual {v4, v1}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v14, 0x3b

    if-eq v7, v14, :cond_24

    add-int/lit8 v1, v1, 0x1

    goto :goto_1c

    :cond_24
    add-int/lit8 v7, v15, 0x1

    add-int/lit8 v14, v1, 0x1

    .line 114
    invoke-virtual {v4, v10, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v6, v15

    move v15, v7

    goto :goto_1d

    :cond_25
    const/16 v18, 0x1

    const/16 v20, 0x4

    add-int/lit8 v1, v15, 0x1

    .line 115
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v15

    goto :goto_1b

    :goto_1d
    move-object/from16 v1, p1

    const/4 v10, -0x1

    goto/16 :goto_15

    :cond_26
    const/16 v29, 0x3

    const/16 v30, 0x0

    goto/16 :goto_16

    :goto_1e
    move/from16 v1, v25

    :goto_1f
    add-int/lit8 v4, v27, -0x2

    if-ge v1, v4, :cond_29

    .line 116
    aget-byte v4, p3, v1

    move/from16 v6, v16

    if-ne v4, v6, :cond_27

    add-int/lit8 v4, v1, 0x1

    .line 117
    invoke-virtual {v0, v4}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v4

    if-ltz v4, :cond_27

    if-ge v4, v13, :cond_27

    add-int v15, v36, v4

    .line 118
    aget-byte v6, p3, v15

    const/16 v7, 0xff

    and-int/2addr v6, v7

    const/16 v7, 0xbb

    if-ne v6, v7, :cond_27

    .line 119
    invoke-static {v4, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛲᲈᲁ(I[Lyyds/ᛳᲀᛷᛸ;)Lyyds/ᛳᲀᛷᛸ;

    :cond_27
    add-int/lit8 v1, v1, 0x1

    const/16 v16, 0x8

    goto :goto_1f

    :cond_28
    const/16 v18, 0x1

    const/16 v20, 0x4

    const/16 v29, 0x3

    const/16 v30, 0x0

    :cond_29
    if-eqz v9, :cond_2a

    .line 120
    iget v1, v8, Lyyds/ᛵᛳᛶᲇ;->ᛵᛸᛸᛷ:I

    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_2a

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, v2

    const/4 v2, -0x1

    move-object v7, v5

    const/4 v5, 0x0

    move-object/from16 v17, p3

    move-object v10, v1

    move-object v14, v7

    move/from16 v7, v23

    move/from16 v43, v27

    move/from16 v15, v30

    move-object/from16 v1, p1

    .line 121
    invoke-virtual/range {v1 .. v6}, Lyyds/ᛶᲀᛱᛵ;->ᲇᲇᲇᛱ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    :goto_20
    move-object/from16 v2, v31

    goto :goto_21

    :cond_2a
    move-object/from16 v1, p1

    move-object/from16 v17, p3

    move-object v10, v2

    move-object v14, v5

    move/from16 v7, v23

    move/from16 v43, v27

    move/from16 v15, v30

    goto :goto_20

    .line 122
    :goto_21
    invoke-virtual {v0, v2, v15}, Lyyds/ᛸᛴᲇᲇ;->ᲀᛲᛳᲀ([II)I

    move-result v4

    move-object/from16 v5, v32

    .line 123
    invoke-virtual {v0, v5, v15}, Lyyds/ᛸᛴᲇᲇ;->ᲀᛲᛳᲀ([II)I

    move-result v6

    move/from16 v30, v15

    .line 124
    iget v15, v8, Lyyds/ᛵᛳᛶᲇ;->ᛵᛸᛸᛷ:I

    and-int/lit16 v15, v15, 0x100

    if-nez v15, :cond_2b

    const/16 v15, 0x21

    goto :goto_22

    :cond_2b
    move/from16 v15, v30

    :goto_22
    move/from16 v21, v4

    move/from16 v23, v6

    move/from16 p3, v9

    move/from16 v4, v30

    move/from16 v20, v4

    move/from16 v22, v20

    move/from16 v6, v36

    :goto_23
    if-ge v6, v7, :cond_5e

    sub-int v9, v6, v36

    .line 125
    aget-object v0, v14, v9

    move/from16 v31, v7

    if-eqz v0, :cond_2d

    .line 126
    iget v7, v8, Lyyds/ᛵᛳᛶᲇ;->ᛵᛸᛸᛷ:I

    move/from16 v40, v7

    const/4 v7, 0x2

    and-int/lit8 v40, v40, 0x2

    if-nez v40, :cond_2c

    const/16 v40, 0x1

    goto :goto_24

    :cond_2c
    move/from16 v40, v30

    .line 127
    :goto_24
    invoke-virtual {v1, v0}, Lyyds/ᛶᲀᛱᛵ;->ᛱᛳᲇ(Lyyds/ᛳᲀᛷᛸ;)V

    if-eqz v40, :cond_2d

    .line 128
    iget-short v7, v0, Lyyds/ᛳᲀᛷᛸ;->ᛲᲈᲁ:S

    move-object/from16 v40, v2

    const/16 v2, 0x80

    and-int/2addr v7, v2

    if-eqz v7, :cond_2e

    .line 129
    iget-short v2, v0, Lyyds/ᛳᲀᛷᛸ;->ᛵᛸᛸᛷ:S

    const v7, 0xffff

    and-int/2addr v2, v7

    invoke-virtual {v1, v2, v0}, Lyyds/ᛶᲀᛱᛵ;->ᲇᛱᛲ(ILyyds/ᛳᲀᛷᛸ;)V

    .line 130
    iget-object v2, v0, Lyyds/ᛳᲀᛷᛸ;->ᲀᛲᛳᲀ:[I

    if-eqz v2, :cond_2e

    const/4 v2, 0x1

    .line 131
    :goto_25
    iget-object v7, v0, Lyyds/ᛳᲀᛷᛸ;->ᲀᛲᛳᲀ:[I

    move/from16 v41, v3

    aget v3, v7, v30

    if-gt v2, v3, :cond_2f

    .line 132
    aget v3, v7, v2

    invoke-virtual {v1, v3, v0}, Lyyds/ᛶᲀᛱᛵ;->ᲇᛱᛲ(ILyyds/ᛳᲀᛷᛸ;)V

    add-int/lit8 v2, v2, 0x1

    move/from16 v3, v41

    goto :goto_25

    :cond_2d
    move-object/from16 v40, v2

    :cond_2e
    move/from16 v41, v3

    :cond_2f
    move/from16 v7, v25

    :goto_26
    if-eqz v7, :cond_42

    .line 133
    iget v0, v8, Lyyds/ᛵᛳᛶᲇ;->ᛲᛲᲈᲈ:I

    const/4 v2, -0x1

    if-eq v0, v9, :cond_31

    if-ne v0, v2, :cond_30

    goto :goto_28

    :cond_30
    move/from16 v47, v2

    :goto_27
    move-object v0, v5

    move/from16 v25, v6

    move-object/from16 v6, v40

    goto/16 :goto_36

    :cond_31
    :goto_28
    if-eq v0, v2, :cond_34

    if-eqz v28, :cond_32

    if-eqz p3, :cond_33

    :cond_32
    move-object v0, v5

    move/from16 v25, v6

    goto :goto_29

    .line 134
    :cond_33
    iget v2, v8, Lyyds/ᛵᛳᛶᲇ;->ᛱᛳᲇ:I

    iget v3, v8, Lyyds/ᛵᛳᛶᲇ;->ᲇᛱᛲ:I

    move-object v0, v5

    iget-object v5, v8, Lyyds/ᛵᛳᛶᲇ;->ᛶᛳᛶᛵ:[Ljava/lang/Object;

    iget v4, v8, Lyyds/ᛵᛳᛶᲇ;->ᛵᛶᛲᲀ:I

    move/from16 v25, v6

    iget-object v6, v8, Lyyds/ᛵᛳᛶᲇ;->ᲀᛲᛲᲇ:[Ljava/lang/Object;

    invoke-virtual/range {v1 .. v6}, Lyyds/ᛶᲀᛱᛵ;->ᲇᲇᲇᛱ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    goto :goto_2a

    .line 135
    :goto_29
    iget v3, v8, Lyyds/ᛵᛳᛶᲇ;->ᛳᲁᲁᲇ:I

    iget-object v5, v8, Lyyds/ᛵᛳᛶᲇ;->ᛶᛳᛶᛵ:[Ljava/lang/Object;

    iget v4, v8, Lyyds/ᛵᛳᛶᲇ;->ᛵᛶᛲᲀ:I

    iget-object v6, v8, Lyyds/ᛵᛳᛶᲇ;->ᲀᛲᛲᲇ:[Ljava/lang/Object;

    const/4 v2, -0x1

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Lyyds/ᛶᲀᛱᛵ;->ᲇᲇᲇᛱ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    :goto_2a
    move/from16 v6, v30

    :goto_2b
    move/from16 v1, v43

    goto :goto_2c

    :cond_34
    move-object v0, v5

    move/from16 v25, v6

    move v6, v4

    goto :goto_2b

    :goto_2c
    if-ge v7, v1, :cond_41

    .line 136
    iget-object v4, v8, Lyyds/ᛵᛳᛶᲇ;->ᲀᛲᛳᲀ:[C

    .line 137
    iget-object v5, v8, Lyyds/ᛵᛳᛶᲇ;->ᛶᛷᛲᲁ:[Lyyds/ᛳᲀᛷᛸ;

    if-eqz v28, :cond_35

    add-int/lit8 v2, v7, 0x1

    .line 138
    aget-byte v3, v17, v7

    const/16 v7, 0xff

    and-int/2addr v3, v7

    move v7, v2

    :goto_2d
    move/from16 v2, v30

    goto :goto_2e

    :cond_35
    const/4 v2, -0x1

    .line 139
    iput v2, v8, Lyyds/ᛵᛳᛶᲇ;->ᛲᛲᲈᲈ:I

    const/16 v3, 0xff

    goto :goto_2d

    .line 140
    :goto_2e
    iput v2, v8, Lyyds/ᛵᛳᛶᲇ;->ᲇᛱᛲ:I

    const/16 v2, 0x40

    if-ge v3, v2, :cond_36

    move/from16 v2, v29

    .line 141
    iput v2, v8, Lyyds/ᛵᛳᛶᲇ;->ᛱᛳᲇ:I

    const/4 v2, 0x0

    .line 142
    iput v2, v8, Lyyds/ᛵᛳᛶᲇ;->ᛵᛶᛲᲀ:I

    move/from16 v43, v1

    move/from16 v49, v6

    move v1, v7

    const/16 v35, 0x80

    const/16 v47, -0x1

    move-object v7, v0

    goto/16 :goto_34

    :cond_36
    const/16 v2, 0x80

    if-ge v3, v2, :cond_38

    add-int/lit8 v32, v3, -0x40

    move v3, v2

    .line 143
    iget-object v2, v8, Lyyds/ᛵᛳᛶᲇ;->ᲀᛲᛲᲇ:[Ljava/lang/Object;

    move/from16 v43, v3

    const/4 v3, 0x0

    move/from16 v35, v43

    const/16 v47, -0x1

    move/from16 v43, v1

    move v1, v7

    move-object v7, v0

    move-object/from16 v0, p0

    .line 144
    invoke-virtual/range {v0 .. v5}, Lyyds/ᛸᛴᲇᲇ;->ᛶᲈᛴᲈ(I[Ljava/lang/Object;I[C[Lyyds/ᛳᲀᛷᛸ;)I

    move-result v1

    const/4 v2, 0x4

    .line 145
    iput v2, v8, Lyyds/ᛵᛳᛶᲇ;->ᛱᛳᲇ:I

    const/4 v3, 0x1

    .line 146
    iput v3, v8, Lyyds/ᛵᛳᛶᲇ;->ᛵᛶᛲᲀ:I

    move/from16 v49, v6

    :cond_37
    :goto_2f
    move/from16 v3, v32

    goto/16 :goto_34

    :cond_38
    move/from16 v43, v1

    move/from16 v35, v2

    move v1, v7

    const/16 v47, -0x1

    move-object v7, v0

    move-object/from16 v0, p0

    const/16 v2, 0xf7

    if-lt v3, v2, :cond_40

    .line 147
    invoke-virtual {v0, v1}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v32

    move/from16 v48, v1

    add-int/lit8 v1, v48, 0x2

    if-ne v3, v2, :cond_39

    .line 148
    iget-object v2, v8, Lyyds/ᛵᛳᛶᲇ;->ᲀᛲᛲᲇ:[Ljava/lang/Object;

    const/4 v3, 0x0

    move/from16 v49, v6

    const/4 v6, 0x4

    .line 149
    invoke-virtual/range {v0 .. v5}, Lyyds/ᛸᛴᲇᲇ;->ᛶᲈᛴᲈ(I[Ljava/lang/Object;I[C[Lyyds/ᛳᲀᛷᛸ;)I

    move-result v1

    .line 150
    iput v6, v8, Lyyds/ᛵᛳᛶᲇ;->ᛱᛳᲇ:I

    const/4 v3, 0x1

    .line 151
    iput v3, v8, Lyyds/ᛵᛳᛶᲇ;->ᛵᛶᛲᲀ:I

    goto :goto_2f

    :cond_39
    move/from16 v49, v6

    const/4 v6, 0x4

    const/16 v0, 0xf8

    const/16 v2, 0xfb

    if-lt v3, v0, :cond_3a

    if-ge v3, v2, :cond_3a

    const/4 v0, 0x2

    .line 152
    iput v0, v8, Lyyds/ᛵᛳᛶᲇ;->ᛱᛳᲇ:I

    rsub-int v0, v3, 0xfb

    .line 153
    iput v0, v8, Lyyds/ᛵᛳᛶᲇ;->ᲇᛱᛲ:I

    .line 154
    iget v2, v8, Lyyds/ᛵᛳᛶᲇ;->ᛳᲁᲁᲇ:I

    sub-int/2addr v2, v0

    iput v2, v8, Lyyds/ᛵᛳᛶᲇ;->ᛳᲁᲁᲇ:I

    const/4 v0, 0x0

    .line 155
    iput v0, v8, Lyyds/ᛵᛳᛶᲇ;->ᛵᛶᛲᲀ:I

    goto :goto_2f

    :cond_3a
    const/4 v0, 0x0

    if-ne v3, v2, :cond_3b

    const/4 v2, 0x3

    .line 156
    iput v2, v8, Lyyds/ᛵᛳᛶᲇ;->ᛱᛳᲇ:I

    .line 157
    iput v0, v8, Lyyds/ᛵᛳᛶᲇ;->ᛵᛶᛲᲀ:I

    goto :goto_2f

    :cond_3b
    const/16 v0, 0xff

    if-ge v3, v0, :cond_3e

    if-eqz p3, :cond_3c

    .line 158
    iget v0, v8, Lyyds/ᛵᛳᛶᲇ;->ᛳᲁᲁᲇ:I

    goto :goto_30

    :cond_3c
    const/4 v0, 0x0

    :goto_30
    add-int/lit16 v2, v3, -0xfb

    move v3, v0

    move/from16 v46, v2

    :goto_31
    if-lez v46, :cond_3d

    move v0, v2

    .line 159
    iget-object v2, v8, Lyyds/ᛵᛳᛶᲇ;->ᛶᛳᛶᛵ:[Ljava/lang/Object;

    add-int/lit8 v48, v3, 0x1

    move v6, v0

    move-object/from16 v0, p0

    .line 160
    invoke-virtual/range {v0 .. v5}, Lyyds/ᛸᛴᲇᲇ;->ᛶᲈᛴᲈ(I[Ljava/lang/Object;I[C[Lyyds/ᛳᲀᛷᛸ;)I

    move-result v1

    add-int/lit8 v46, v46, -0x1

    move v2, v6

    move/from16 v3, v48

    const/4 v6, 0x4

    goto :goto_31

    :cond_3d
    const/4 v3, 0x1

    move-object/from16 v0, p0

    move v6, v2

    .line 161
    iput v3, v8, Lyyds/ᛵᛳᛶᲇ;->ᛱᛳᲇ:I

    .line 162
    iput v6, v8, Lyyds/ᛵᛳᛶᲇ;->ᲇᛱᛲ:I

    .line 163
    iget v2, v8, Lyyds/ᛵᛳᛶᲇ;->ᛳᲁᲁᲇ:I

    add-int/2addr v2, v6

    iput v2, v8, Lyyds/ᛵᛳᛶᲇ;->ᛳᲁᲁᲇ:I

    const/4 v2, 0x0

    .line 164
    iput v2, v8, Lyyds/ᛵᛳᛶᲇ;->ᛵᛶᛲᲀ:I

    goto/16 :goto_2f

    :cond_3e
    const/4 v2, 0x0

    move-object/from16 v0, p0

    .line 165
    invoke-virtual {v0, v1}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v6

    add-int/lit8 v1, v48, 0x4

    .line 166
    iput v2, v8, Lyyds/ᛵᛳᛶᲇ;->ᛱᛳᲇ:I

    .line 167
    iput v6, v8, Lyyds/ᛵᛳᛶᲇ;->ᲇᛱᛲ:I

    .line 168
    iput v6, v8, Lyyds/ᛵᛳᛶᲇ;->ᛳᲁᲁᲇ:I

    const/4 v3, 0x0

    :goto_32
    if-ge v3, v6, :cond_3f

    .line 169
    iget-object v2, v8, Lyyds/ᛵᛳᛶᲇ;->ᛶᛳᛶᛵ:[Ljava/lang/Object;

    .line 170
    invoke-virtual/range {v0 .. v5}, Lyyds/ᛸᛴᲇᲇ;->ᛶᲈᛴᲈ(I[Ljava/lang/Object;I[C[Lyyds/ᛳᲀᛷᛸ;)I

    move-result v1

    add-int/lit8 v3, v3, 0x1

    goto :goto_32

    .line 171
    :cond_3f
    invoke-virtual {v0, v1}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v6

    add-int/lit8 v1, v1, 0x2

    .line 172
    iput v6, v8, Lyyds/ᛵᛳᛶᲇ;->ᛵᛶᛲᲀ:I

    const/4 v3, 0x0

    :goto_33
    if-ge v3, v6, :cond_37

    .line 173
    iget-object v2, v8, Lyyds/ᛵᛳᛶᲇ;->ᲀᛲᛲᲇ:[Ljava/lang/Object;

    .line 174
    invoke-virtual/range {v0 .. v5}, Lyyds/ᛸᛴᲇᲇ;->ᛶᲈᛴᲈ(I[Ljava/lang/Object;I[C[Lyyds/ᛳᲀᛷᛸ;)I

    move-result v1

    add-int/lit8 v3, v3, 0x1

    move-object/from16 v0, p0

    goto :goto_33

    .line 175
    :goto_34
    iget v0, v8, Lyyds/ᛵᛳᛶᲇ;->ᛲᛲᲈᲈ:I

    const/16 v18, 0x1

    add-int/lit8 v3, v3, 0x1

    add-int/2addr v3, v0

    iput v3, v8, Lyyds/ᛵᛳᛶᲇ;->ᛲᛲᲈᲈ:I

    .line 176
    invoke-static {v3, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛲᲈᲁ(I[Lyyds/ᛳᲀᛷᛸ;)Lyyds/ᛳᲀᛷᛸ;

    move-object v5, v7

    move/from16 v6, v25

    move/from16 v4, v49

    const/16 v29, 0x3

    const/16 v30, 0x0

    move v7, v1

    :goto_35
    move-object/from16 v1, p1

    goto/16 :goto_26

    .line 177
    :cond_40
    invoke-static {}, Lyyds/ᛷᲈᲈᛶ;->ᛲᲈᲁ()V

    return-void

    :cond_41
    move/from16 v49, v6

    const/16 v47, -0x1

    move-object v5, v0

    move/from16 v43, v1

    move/from16 v6, v25

    move/from16 v4, v49

    const/4 v7, 0x0

    const/16 v29, 0x3

    const/16 v30, 0x0

    goto :goto_35

    :cond_42
    const/16 v47, -0x1

    goto/16 :goto_27

    :goto_36
    if-eqz v4, :cond_44

    .line 178
    iget v1, v8, Lyyds/ᛵᛳᛶᲇ;->ᛵᛸᛸᛷ:I

    const/16 v16, 0x8

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_43

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/16 v1, 0x100

    const/4 v2, 0x0

    const/4 v4, 0x0

    move/from16 v32, v7

    move-object/from16 v35, v10

    move-object/from16 v7, p0

    move-object v10, v0

    move-object/from16 v0, p1

    .line 179
    invoke-virtual/range {v0 .. v5}, Lyyds/ᛶᲀᛱᛵ;->ᲇᲇᲇᛱ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    move-object v1, v0

    goto :goto_37

    :cond_43
    move-object/from16 v1, p1

    move/from16 v32, v7

    move-object/from16 v35, v10

    move-object/from16 v7, p0

    move-object v10, v0

    :goto_37
    const/16 v27, 0x0

    goto :goto_38

    :cond_44
    move-object/from16 v1, p1

    move/from16 v32, v7

    move-object/from16 v35, v10

    move-object/from16 v7, p0

    move-object v10, v0

    move/from16 v27, v4

    .line 180
    :goto_38
    aget-byte v0, v17, v25

    const/16 v2, 0xff

    and-int/2addr v0, v2

    const/16 v2, 0xc8

    packed-switch v0, :pswitch_data_4

    .line 181
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :pswitch_d
    add-int/lit8 v0, v25, 0x1

    .line 182
    invoke-virtual {v7, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    move-result v0

    add-int/2addr v0, v9

    aget-object v0, v14, v0

    .line 183
    invoke-virtual {v1, v2, v0}, Lyyds/ᛶᲀᛱᛵ;->ᛲᛲᲈᲈ(ILyyds/ᛳᲀᛷᛸ;)V

    add-int/lit8 v0, v25, 0x5

    move-object/from16 v40, v10

    move/from16 v46, v12

    move/from16 v3, v20

    move/from16 v5, v21

    move-object/from16 v10, v37

    move-object/from16 v12, v42

    const/16 v2, 0xff

    const/4 v4, 0x1

    :goto_39
    const/16 v16, 0x8

    const/16 v44, 0x7

    const/16 v50, 0x4

    move/from16 v37, v13

    move/from16 v42, v15

    move/from16 v13, v39

    move-object/from16 v39, v14

    goto/16 :goto_54

    :pswitch_e
    const/16 v3, 0xda

    if-ge v0, v3, :cond_45

    add-int/lit8 v0, v0, -0x31

    goto :goto_3a

    :cond_45
    add-int/lit8 v0, v0, -0x14

    :goto_3a
    add-int/lit8 v3, v25, 0x1

    .line 184
    invoke-virtual {v7, v3}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v3

    add-int/2addr v3, v9

    aget-object v3, v14, v3

    const/16 v4, 0xa7

    if-eq v0, v4, :cond_48

    const/16 v5, 0xa8

    if-ne v0, v5, :cond_46

    goto :goto_3c

    :cond_46
    if-ge v0, v4, :cond_47

    add-int/lit8 v0, v0, 0x1

    const/16 v18, 0x1

    xor-int/lit8 v0, v0, 0x1

    add-int/lit8 v0, v0, -0x1

    goto :goto_3b

    :cond_47
    xor-int/lit8 v0, v0, 0x1

    :goto_3b
    add-int/lit8 v4, v9, 0x3

    .line 185
    invoke-static {v4, v14}, Lyyds/ᛸᛴᲇᲇ;->ᛲᲈᲁ(I[Lyyds/ᛳᲀᛷᛸ;)Lyyds/ᛳᲀᛷᛸ;

    move-result-object v4

    .line 186
    invoke-virtual {v1, v0, v4}, Lyyds/ᛶᲀᛱᛵ;->ᛲᛲᲈᲈ(ILyyds/ᛳᲀᛷᛸ;)V

    .line 187
    invoke-virtual {v1, v2, v3}, Lyyds/ᛶᲀᛱᛵ;->ᛲᛲᲈᲈ(ILyyds/ᛳᲀᛷᛸ;)V

    const/4 v2, 0x1

    goto :goto_3d

    :cond_48
    :goto_3c
    add-int/lit8 v0, v0, 0x21

    .line 188
    invoke-virtual {v1, v0, v3}, Lyyds/ᛶᲀᛱᛵ;->ᛲᛲᲈᲈ(ILyyds/ᛳᲀᛷᛸ;)V

    move/from16 v2, v27

    :goto_3d
    add-int/lit8 v0, v25, 0x3

    move v4, v2

    move-object/from16 v40, v10

    move/from16 v46, v12

    move/from16 v3, v20

    move/from16 v5, v21

    :goto_3e
    move-object/from16 v10, v37

    move-object/from16 v12, v42

    const/16 v2, 0xff

    goto :goto_39

    :pswitch_f
    sub-int/2addr v0, v15

    add-int/lit8 v2, v25, 0x1

    .line 189
    invoke-virtual {v7, v2}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    move-result v2

    add-int/2addr v2, v9

    aget-object v2, v14, v2

    .line 190
    invoke-virtual {v1, v0, v2}, Lyyds/ᛶᲀᛱᛵ;->ᛲᛲᲈᲈ(ILyyds/ᛳᲀᛷᛸ;)V

    add-int/lit8 v0, v25, 0x5

    move-object/from16 v40, v10

    move/from16 v46, v12

    move/from16 v3, v20

    move/from16 v5, v21

    move/from16 v4, v27

    goto :goto_3e

    :pswitch_10
    add-int/lit8 v0, v25, 0x1

    .line 191
    invoke-virtual {v7, v11, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛱᛳᲇ([CI)Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v2, v25, 0x3

    .line 192
    aget-byte v2, v17, v2

    const/16 v3, 0xff

    and-int/2addr v2, v3

    move-object/from16 v3, v42

    .line 193
    iget v4, v3, Lyyds/ᲇᲇᛳᛴ;->ᲀᛲᛳᲀ:I

    iput v4, v1, Lyyds/ᛶᲀᛱᛵ;->ᛶᛵᛸᛲ:I

    move-object/from16 v4, v37

    const/4 v5, 0x7

    .line 194
    invoke-virtual {v4, v5, v0}, Lyyds/ᛶᲇᛸᛱ;->ᛷᲈᲈᲁ(ILjava/lang/String;)Lyyds/ᲇᛱ;

    move-result-object v0

    .line 195
    iget v5, v0, Lyyds/ᲇᛱ;->ᛲᲈᲁ:I

    move/from16 v37, v13

    const/16 v13, 0xc5

    invoke-virtual {v3, v13, v5}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    invoke-virtual {v3, v2}, Lyyds/ᲇᲇᛳᛴ;->ᛶᛷᛲᲁ(I)V

    .line 196
    iget-object v5, v1, Lyyds/ᛶᲀᛱᛵ;->ᛲᲀᛵᛷ:Lyyds/ᛳᲀᛷᛸ;

    if-eqz v5, :cond_4b

    move/from16 v13, v39

    move-object/from16 v39, v14

    const/4 v14, 0x4

    if-eq v13, v14, :cond_4a

    const/4 v14, 0x3

    if-ne v13, v14, :cond_49

    goto :goto_3f

    .line 197
    :cond_49
    iget v0, v1, Lyyds/ᛶᲀᛱᛵ;->ᛷᛴᛴᲁ:I

    rsub-int/lit8 v2, v2, 0x1

    add-int/2addr v2, v0

    iput v2, v1, Lyyds/ᛶᲀᛱᛵ;->ᛷᛴᛴᲁ:I

    goto :goto_40

    .line 198
    :cond_4a
    :goto_3f
    iget-object v5, v5, Lyyds/ᛳᲀᛷᛸ;->ᛷᲈᲈᲁ:Lyyds/ᛲᲀᛴᛳ;

    const/16 v14, 0xc5

    invoke-virtual {v5, v14, v2, v0, v4}, Lyyds/ᛲᲀᛴᛳ;->ᛵᛸᛸᛷ(IILyyds/ᲇᛱ;Lyyds/ᛶᲇᛸᛱ;)V

    goto :goto_40

    :cond_4b
    move/from16 v13, v39

    move-object/from16 v39, v14

    :goto_40
    add-int/lit8 v0, v25, 0x4

    :goto_41
    move-object/from16 v40, v10

    move/from16 v46, v12

    move/from16 v42, v15

    move/from16 v5, v21

    const/16 v2, 0xff

    const/16 v16, 0x8

    const/16 v44, 0x7

    const/16 v50, 0x4

    move-object v12, v3

    move-object v10, v4

    move/from16 v3, v20

    :goto_42
    move/from16 v4, v27

    goto/16 :goto_54

    :pswitch_11
    move-object/from16 v4, v37

    move-object/from16 v3, v42

    move/from16 v37, v13

    move/from16 v13, v39

    move-object/from16 v39, v14

    add-int/lit8 v0, v25, 0x1

    .line 199
    aget-byte v0, v17, v0

    const/16 v2, 0xff

    and-int/2addr v0, v2

    const/16 v14, 0x84

    if-ne v0, v14, :cond_4c

    add-int/lit8 v0, v25, 0x2

    .line 200
    invoke-virtual {v7, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v0

    add-int/lit8 v2, v25, 0x4

    invoke-virtual {v7, v2}, Lyyds/ᛸᛴᲇᲇ;->ᛲᛲᲈᲈ(I)S

    move-result v2

    .line 201
    invoke-virtual {v1, v0, v2}, Lyyds/ᛶᲀᛱᛵ;->ᛲᛳᛶᲁ(II)V

    add-int/lit8 v0, v25, 0x6

    goto :goto_41

    :cond_4c
    add-int/lit8 v2, v25, 0x2

    .line 202
    invoke-virtual {v7, v2}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v2

    invoke-virtual {v1, v0, v2}, Lyyds/ᛶᲀᛱᛵ;->ᛵᲀᲈᛴ(II)V

    goto :goto_40

    :pswitch_12
    move-object/from16 v4, v37

    move-object/from16 v3, v42

    move/from16 v37, v13

    move/from16 v13, v39

    move-object/from16 v39, v14

    const/16 v14, 0x84

    add-int/lit8 v2, v25, 0x1

    .line 203
    invoke-virtual {v7, v11, v2}, Lyyds/ᛸᛴᲇᲇ;->ᛱᛳᲇ([CI)Ljava/lang/String;

    move-result-object v2

    .line 204
    invoke-virtual {v1, v0, v2}, Lyyds/ᛶᲀᛱᛵ;->ᛶᛸᲀᲁ(ILjava/lang/String;)V

    add-int/lit8 v0, v25, 0x3

    goto :goto_41

    :pswitch_13
    move-object/from16 v4, v37

    move-object/from16 v3, v42

    move/from16 v37, v13

    move/from16 v13, v39

    move-object/from16 v39, v14

    const/16 v14, 0x84

    add-int/lit8 v0, v25, 0x1

    .line 205
    invoke-virtual {v7, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v0

    aget v0, v24, v0

    add-int/lit8 v2, v0, 0x2

    .line 206
    invoke-virtual {v7, v2}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v2

    aget v2, v24, v2

    .line 207
    invoke-virtual {v7, v11, v2}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    move-result-object v5

    const/16 v45, 0x2

    add-int/lit8 v2, v2, 0x2

    .line 208
    invoke-virtual {v7, v11, v2}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    move-result-object v2

    .line 209
    iget-object v14, v7, Lyyds/ᛸᛴᲇᲇ;->ᲇᲇᲇᛱ:[I

    invoke-virtual {v7, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v0

    aget v0, v14, v0

    .line 210
    invoke-virtual {v7, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v14

    invoke-virtual {v7, v11, v14}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛷᛲᲁ([CI)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lyyds/ᲈᲁᛷᲀ;

    move/from16 v40, v0

    add-int/lit8 v0, v40, 0x2

    .line 211
    invoke-virtual {v7, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v0

    move/from16 v42, v15

    new-array v15, v0, [Ljava/lang/Object;

    const/16 v50, 0x4

    add-int/lit8 v40, v40, 0x4

    move/from16 v46, v40

    move-object/from16 v40, v10

    move/from16 v10, v46

    move/from16 v46, v12

    const/4 v12, 0x0

    :goto_43
    if-ge v12, v0, :cond_4d

    move/from16 v48, v0

    .line 212
    invoke-virtual {v7, v10}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v0

    invoke-virtual {v7, v11, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛷᛲᲁ([CI)Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v15, v12

    const/16 v45, 0x2

    add-int/lit8 v10, v10, 0x2

    add-int/lit8 v12, v12, 0x1

    move/from16 v0, v48

    goto :goto_43

    .line 213
    :cond_4d
    iget v0, v3, Lyyds/ᲇᲇᛳᛴ;->ᲀᛲᛳᲀ:I

    iput v0, v1, Lyyds/ᛶᲀᛱᛵ;->ᛶᛵᛸᛲ:I

    .line 214
    invoke-virtual {v4, v14, v15}, Lyyds/ᛶᲇᛸᛱ;->ᛲᲈᲁ(Lyyds/ᲈᲁᛷᲀ;[Ljava/lang/Object;)Lyyds/ᲇᛱ;

    move-result-object v0

    const/16 v10, 0x12

    .line 215
    iget v0, v0, Lyyds/ᲇᛱ;->ᛲᲈᲁ:I

    invoke-virtual {v4, v10, v0, v5, v2}, Lyyds/ᛶᲇᛸᛱ;->ᲀᛲᛳᲀ(IILjava/lang/String;Ljava/lang/String;)Lyyds/ᲇᛱ;

    move-result-object v0

    .line 216
    iget v2, v0, Lyyds/ᲇᛱ;->ᛲᲈᲁ:I

    const/16 v5, 0xba

    invoke-virtual {v3, v5, v2}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛴᛳᛲ(II)V

    const/4 v2, 0x0

    .line 217
    invoke-virtual {v3, v2}, Lyyds/ᲇᲇᛳᛴ;->ᛷᲈᲈᲁ(I)V

    .line 218
    iget-object v2, v1, Lyyds/ᛶᲀᛱᛵ;->ᛲᲀᛵᛷ:Lyyds/ᛳᲀᛷᛸ;

    if-eqz v2, :cond_52

    const/4 v14, 0x4

    if-eq v13, v14, :cond_51

    const/4 v14, 0x3

    if-ne v13, v14, :cond_4e

    goto :goto_44

    .line 219
    :cond_4e
    iget v2, v0, Lyyds/ᲇᛱ;->ᛶᛷᛲᲁ:I

    if-nez v2, :cond_4f

    .line 220
    iget-object v2, v0, Lyyds/ᲇᛱ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    invoke-static {v2}, Lyyds/ᛶᛳᲇᛳ;->ᲀᛲᛳᲀ(Ljava/lang/String;)I

    move-result v2

    iput v2, v0, Lyyds/ᲇᛱ;->ᛶᛷᛲᲁ:I

    :cond_4f
    and-int/lit8 v0, v2, 0x3

    const/16 v45, 0x2

    shr-int/lit8 v2, v2, 0x2

    sub-int/2addr v0, v2

    const/16 v18, 0x1

    add-int/lit8 v0, v0, 0x1

    .line 221
    iget v2, v1, Lyyds/ᛶᲀᛱᛵ;->ᛷᛴᛴᲁ:I

    add-int/2addr v2, v0

    .line 222
    iget v0, v1, Lyyds/ᛶᲀᛱᛵ;->ᛲᲀᛲᛲ:I

    if-le v2, v0, :cond_50

    .line 223
    iput v2, v1, Lyyds/ᛶᲀᛱᛵ;->ᛲᲀᛲᛲ:I

    .line 224
    :cond_50
    iput v2, v1, Lyyds/ᛶᲀᛱᛵ;->ᛷᛴᛴᲁ:I

    goto :goto_45

    .line 225
    :cond_51
    :goto_44
    iget-object v2, v2, Lyyds/ᛳᲀᛷᛸ;->ᛷᲈᲈᲁ:Lyyds/ᛲᲀᛴᛳ;

    const/4 v15, 0x0

    invoke-virtual {v2, v5, v15, v0, v4}, Lyyds/ᛲᲀᛴᛳ;->ᛵᛸᛸᛷ(IILyyds/ᲇᛱ;Lyyds/ᛶᲇᛸᛱ;)V

    :cond_52
    :goto_45
    add-int/lit8 v0, v25, 0x5

    move-object v12, v3

    move-object v10, v4

    move/from16 v3, v20

    move/from16 v5, v21

    move/from16 v4, v27

    const/16 v2, 0xff

    const/16 v16, 0x8

    const/16 v44, 0x7

    :goto_46
    const/16 v50, 0x4

    goto/16 :goto_54

    :pswitch_14
    move-object/from16 v40, v10

    move/from16 v46, v12

    move-object/from16 v4, v37

    move-object/from16 v3, v42

    move/from16 v37, v13

    move/from16 v42, v15

    move/from16 v13, v39

    move-object/from16 v39, v14

    add-int/lit8 v2, v25, 0x1

    .line 226
    invoke-virtual {v7, v2}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v2

    aget v2, v24, v2

    add-int/lit8 v5, v2, 0x2

    .line 227
    invoke-virtual {v7, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v5

    aget v5, v24, v5

    move v10, v2

    .line 228
    invoke-virtual {v7, v11, v10}, Lyyds/ᛸᛴᲇᲇ;->ᛱᛳᲇ([CI)Ljava/lang/String;

    move-result-object v2

    move-object v12, v3

    .line 229
    invoke-virtual {v7, v11, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    move-result-object v3

    const/16 v45, 0x2

    add-int/lit8 v5, v5, 0x2

    .line 230
    invoke-virtual {v7, v11, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    move-result-object v5

    const/16 v14, 0xb6

    if-ge v0, v14, :cond_53

    .line 231
    invoke-virtual {v1, v0, v2, v3, v5}, Lyyds/ᛶᲀᛱᛵ;->ᛲᛴᛳᛲ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v10, v4

    const/16 v44, 0x7

    goto :goto_49

    :cond_53
    add-int/lit8 v10, v10, -0x1

    .line 232
    aget-byte v10, v17, v10

    const/16 v14, 0xb

    if-ne v10, v14, :cond_54

    move-object v10, v1

    move v1, v0

    move-object v0, v10

    move-object v10, v4

    move-object v4, v5

    const/4 v5, 0x1

    :goto_47
    const/16 v44, 0x7

    goto :goto_48

    :cond_54
    move-object v10, v1

    move v1, v0

    move-object v0, v10

    move-object v10, v4

    move-object v4, v5

    const/4 v5, 0x0

    goto :goto_47

    .line 233
    :goto_48
    invoke-virtual/range {v0 .. v5}, Lyyds/ᛶᲀᛱᛵ;->ᲀᛲᛲᲇ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move/from16 v52, v1

    move-object v1, v0

    move/from16 v0, v52

    :goto_49
    const/16 v2, 0xb9

    if-ne v0, v2, :cond_55

    add-int/lit8 v0, v25, 0x5

    :goto_4a
    move/from16 v3, v20

    move/from16 v5, v21

    move/from16 v4, v27

    const/16 v2, 0xff

    const/16 v16, 0x8

    goto :goto_46

    :cond_55
    add-int/lit8 v0, v25, 0x3

    goto :goto_4a

    :pswitch_15
    move-object/from16 v40, v10

    move/from16 v46, v12

    move-object/from16 v10, v37

    move-object/from16 v12, v42

    const/16 v44, 0x7

    move/from16 v37, v13

    move/from16 v42, v15

    move/from16 v13, v39

    move-object/from16 v39, v14

    and-int/lit8 v0, v9, 0x3

    const/16 v50, 0x4

    rsub-int/lit8 v2, v0, 0x4

    add-int v2, v2, v25

    .line 234
    invoke-virtual {v7, v2}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    move-result v0

    add-int/2addr v0, v9

    aget-object v0, v39, v0

    add-int/lit8 v3, v2, 0x4

    .line 235
    invoke-virtual {v7, v3}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    move-result v3

    const/16 v16, 0x8

    add-int/lit8 v2, v2, 0x8

    .line 236
    new-array v4, v3, [I

    .line 237
    new-array v5, v3, [Lyyds/ᛳᲀᛷᛸ;

    const/4 v14, 0x0

    :goto_4b
    if-ge v14, v3, :cond_56

    .line 238
    invoke-virtual {v7, v2}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    move-result v15

    aput v15, v4, v14

    add-int/lit8 v15, v2, 0x4

    .line 239
    invoke-virtual {v7, v15}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    move-result v15

    add-int/2addr v15, v9

    aget-object v15, v39, v15

    aput-object v15, v5, v14

    add-int/lit8 v2, v2, 0x8

    add-int/lit8 v14, v14, 0x1

    goto :goto_4b

    .line 240
    :cond_56
    iget v14, v12, Lyyds/ᲇᲇᛳᛴ;->ᲀᛲᛳᲀ:I

    iput v14, v1, Lyyds/ᛶᲀᛱᛵ;->ᛶᛵᛸᛲ:I

    const/16 v14, 0xab

    .line 241
    invoke-virtual {v12, v14}, Lyyds/ᲇᲇᛳᛴ;->ᛶᛷᛲᲁ(I)V

    iget v14, v12, Lyyds/ᲇᲇᛳᛴ;->ᲀᛲᛳᲀ:I

    const/16 v50, 0x4

    rem-int/lit8 v14, v14, 0x4

    rsub-int/lit8 v14, v14, 0x4

    rem-int/lit8 v14, v14, 0x4

    move/from16 v25, v2

    const/4 v2, 0x0

    const/4 v15, 0x0

    invoke-virtual {v12, v15, v2, v14}, Lyyds/ᲇᲇᛳᛴ;->ᛱᲈᲁ([BII)V

    .line 242
    iget v2, v1, Lyyds/ᛶᲀᛱᛵ;->ᛶᛵᛸᛲ:I

    const/4 v14, 0x1

    invoke-virtual {v0, v12, v2, v14}, Lyyds/ᛳᲀᛷᛸ;->ᲇᲈᛵᛷ(Lyyds/ᲇᲇᛳᛴ;IZ)V

    .line 243
    invoke-virtual {v12, v3}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛳᛶᲁ(I)V

    const/4 v2, 0x0

    :goto_4c
    if-ge v2, v3, :cond_57

    .line 244
    aget v15, v4, v2

    invoke-virtual {v12, v15}, Lyyds/ᲇᲇᛳᛴ;->ᛲᛳᛶᲁ(I)V

    .line 245
    aget-object v15, v5, v2

    move/from16 v48, v2

    iget v2, v1, Lyyds/ᛶᲀᛱᛵ;->ᛶᛵᛸᛲ:I

    invoke-virtual {v15, v12, v2, v14}, Lyyds/ᛳᲀᛷᛸ;->ᲇᲈᛵᛷ(Lyyds/ᲇᲇᛳᛴ;IZ)V

    add-int/lit8 v2, v48, 0x1

    const/4 v14, 0x1

    const/4 v15, 0x0

    goto :goto_4c

    .line 246
    :cond_57
    invoke-virtual {v1, v0, v5}, Lyyds/ᛶᲀᛱᛵ;->ᛳᛸᛴᛶ(Lyyds/ᛳᲀᛷᛸ;[Lyyds/ᛳᲀᛷᛸ;)V

    move/from16 v3, v20

    move/from16 v5, v21

    move/from16 v0, v25

    move/from16 v4, v27

    const/16 v2, 0xff

    goto/16 :goto_46

    :pswitch_16
    move-object/from16 v40, v10

    move/from16 v46, v12

    move-object/from16 v10, v37

    move-object/from16 v12, v42

    const/16 v16, 0x8

    const/16 v44, 0x7

    move/from16 v37, v13

    move/from16 v42, v15

    move/from16 v13, v39

    move-object/from16 v39, v14

    and-int/lit8 v0, v9, 0x3

    const/16 v50, 0x4

    rsub-int/lit8 v2, v0, 0x4

    add-int v2, v2, v25

    .line 247
    invoke-virtual {v7, v2}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    move-result v0

    add-int/2addr v0, v9

    aget-object v0, v39, v0

    add-int/lit8 v3, v2, 0x4

    .line 248
    invoke-virtual {v7, v3}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    move-result v3

    add-int/lit8 v4, v2, 0x8

    .line 249
    invoke-virtual {v7, v4}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    move-result v4

    add-int/lit8 v2, v2, 0xc

    sub-int v5, v4, v3

    const/16 v18, 0x1

    add-int/lit8 v5, v5, 0x1

    .line 250
    new-array v14, v5, [Lyyds/ᛳᲀᛷᛸ;

    const/4 v15, 0x0

    :goto_4d
    if-ge v15, v5, :cond_58

    .line 251
    invoke-virtual {v7, v2}, Lyyds/ᛸᛴᲇᲇ;->ᛷᲈᲈᲁ(I)I

    move-result v25

    add-int v25, v25, v9

    aget-object v25, v39, v25

    aput-object v25, v14, v15

    add-int/lit8 v2, v2, 0x4

    add-int/lit8 v15, v15, 0x1

    goto :goto_4d

    .line 252
    :cond_58
    invoke-virtual {v1, v3, v4, v0, v14}, Lyyds/ᛶᲀᛱᛵ;->ᛶᲈᛴᲈ(IILyyds/ᛳᲀᛷᛸ;[Lyyds/ᛳᲀᛷᛸ;)V

    move v0, v2

    :goto_4e
    move/from16 v3, v20

    move/from16 v5, v21

    move/from16 v4, v27

    :goto_4f
    const/16 v2, 0xff

    goto/16 :goto_54

    :pswitch_17
    move-object/from16 v40, v10

    move/from16 v46, v12

    move-object/from16 v10, v37

    move-object/from16 v12, v42

    const/16 v16, 0x8

    const/16 v44, 0x7

    const/16 v50, 0x4

    move/from16 v37, v13

    move/from16 v42, v15

    move/from16 v13, v39

    move-object/from16 v39, v14

    add-int/lit8 v2, v25, 0x1

    .line 253
    invoke-virtual {v7, v2}, Lyyds/ᛸᛴᲇᲇ;->ᛲᛲᲈᲈ(I)S

    move-result v2

    add-int/2addr v2, v9

    aget-object v2, v39, v2

    .line 254
    invoke-virtual {v1, v0, v2}, Lyyds/ᛶᲀᛱᛵ;->ᛲᛲᲈᲈ(ILyyds/ᛳᲀᛷᛸ;)V

    :goto_50
    add-int/lit8 v0, v25, 0x3

    goto :goto_4e

    :pswitch_18
    move-object/from16 v40, v10

    move/from16 v46, v12

    move-object/from16 v10, v37

    move-object/from16 v12, v42

    const/16 v16, 0x8

    const/16 v44, 0x7

    const/16 v50, 0x4

    move/from16 v37, v13

    move/from16 v42, v15

    move/from16 v13, v39

    move-object/from16 v39, v14

    add-int/lit8 v0, v25, 0x1

    .line 255
    aget-byte v0, v17, v0

    const/16 v2, 0xff

    and-int/2addr v0, v2

    add-int/lit8 v2, v25, 0x2

    aget-byte v2, v17, v2

    invoke-virtual {v1, v0, v2}, Lyyds/ᛶᲀᛱᛵ;->ᛲᛳᛶᲁ(II)V

    goto :goto_50

    :pswitch_19
    move-object/from16 v40, v10

    move/from16 v46, v12

    move-object/from16 v10, v37

    move-object/from16 v12, v42

    const/16 v16, 0x8

    const/16 v44, 0x7

    const/16 v50, 0x4

    move/from16 v37, v13

    move/from16 v42, v15

    move/from16 v13, v39

    move-object/from16 v39, v14

    add-int/lit8 v0, v0, -0x3b

    shr-int/lit8 v2, v0, 0x2

    add-int/lit8 v2, v2, 0x36

    const/16 v29, 0x3

    and-int/lit8 v0, v0, 0x3

    .line 256
    invoke-virtual {v1, v2, v0}, Lyyds/ᛶᲀᛱᛵ;->ᛵᲀᲈᛴ(II)V

    :goto_51
    add-int/lit8 v0, v25, 0x1

    goto :goto_4e

    :pswitch_1a
    move-object/from16 v40, v10

    move/from16 v46, v12

    move-object/from16 v10, v37

    move-object/from16 v12, v42

    const/16 v16, 0x8

    const/16 v29, 0x3

    const/16 v44, 0x7

    const/16 v50, 0x4

    move/from16 v37, v13

    move/from16 v42, v15

    move/from16 v13, v39

    move-object/from16 v39, v14

    add-int/lit8 v0, v0, -0x1a

    shr-int/lit8 v2, v0, 0x2

    add-int/lit8 v2, v2, 0x15

    and-int/lit8 v0, v0, 0x3

    .line 257
    invoke-virtual {v1, v2, v0}, Lyyds/ᛶᲀᛱᛵ;->ᛵᲀᲈᛴ(II)V

    goto :goto_51

    :pswitch_1b
    move-object/from16 v40, v10

    move/from16 v46, v12

    move-object/from16 v10, v37

    move-object/from16 v12, v42

    const/16 v16, 0x8

    const/16 v44, 0x7

    const/16 v50, 0x4

    move/from16 v37, v13

    move/from16 v42, v15

    move/from16 v13, v39

    move-object/from16 v39, v14

    add-int/lit8 v2, v25, 0x1

    .line 258
    aget-byte v2, v17, v2

    const/16 v3, 0xff

    and-int/2addr v2, v3

    invoke-virtual {v1, v0, v2}, Lyyds/ᛶᲀᛱᛵ;->ᛵᲀᲈᛴ(II)V

    add-int/lit8 v0, v25, 0x2

    goto/16 :goto_4e

    :pswitch_1c
    move-object/from16 v40, v10

    move/from16 v46, v12

    move-object/from16 v10, v37

    move-object/from16 v12, v42

    const/16 v16, 0x8

    const/16 v44, 0x7

    const/16 v50, 0x4

    move/from16 v37, v13

    move/from16 v42, v15

    move/from16 v13, v39

    move-object/from16 v39, v14

    add-int/lit8 v0, v25, 0x1

    .line 259
    invoke-virtual {v7, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v0

    invoke-virtual {v7, v11, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛷᛲᲁ([CI)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Lyyds/ᛶᲀᛱᛵ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    goto/16 :goto_50

    :pswitch_1d
    move-object/from16 v40, v10

    move/from16 v46, v12

    move-object/from16 v10, v37

    move-object/from16 v12, v42

    const/16 v16, 0x8

    const/16 v44, 0x7

    const/16 v50, 0x4

    move/from16 v37, v13

    move/from16 v42, v15

    move/from16 v13, v39

    move-object/from16 v39, v14

    add-int/lit8 v0, v25, 0x1

    .line 260
    aget-byte v0, v17, v0

    const/16 v2, 0xff

    and-int/2addr v0, v2

    invoke-virtual {v7, v11, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛷᛲᲁ([CI)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Lyyds/ᛶᲀᛱᛵ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    :goto_52
    add-int/lit8 v0, v25, 0x2

    :goto_53
    move/from16 v3, v20

    move/from16 v5, v21

    goto/16 :goto_42

    :pswitch_1e
    move-object/from16 v40, v10

    move/from16 v46, v12

    move-object/from16 v10, v37

    move-object/from16 v12, v42

    const/16 v2, 0xff

    const/16 v16, 0x8

    const/16 v44, 0x7

    const/16 v50, 0x4

    move/from16 v37, v13

    move/from16 v42, v15

    move/from16 v13, v39

    move-object/from16 v39, v14

    add-int/lit8 v3, v25, 0x1

    .line 261
    invoke-virtual {v7, v3}, Lyyds/ᛸᛴᲇᲇ;->ᛲᛲᲈᲈ(I)S

    move-result v3

    invoke-virtual {v1, v0, v3}, Lyyds/ᛶᲀᛱᛵ;->ᛷᛵᲇᲀ(II)V

    add-int/lit8 v0, v25, 0x3

    goto :goto_53

    :pswitch_1f
    move-object/from16 v40, v10

    move/from16 v46, v12

    move-object/from16 v10, v37

    move-object/from16 v12, v42

    const/16 v2, 0xff

    const/16 v16, 0x8

    const/16 v44, 0x7

    const/16 v50, 0x4

    move/from16 v37, v13

    move/from16 v42, v15

    move/from16 v13, v39

    move-object/from16 v39, v14

    add-int/lit8 v3, v25, 0x1

    .line 262
    aget-byte v3, v17, v3

    invoke-virtual {v1, v0, v3}, Lyyds/ᛶᲀᛱᛵ;->ᛷᛵᲇᲀ(II)V

    goto :goto_52

    :pswitch_20
    move-object/from16 v40, v10

    move/from16 v46, v12

    move-object/from16 v10, v37

    move-object/from16 v12, v42

    const/16 v2, 0xff

    const/16 v16, 0x8

    const/16 v44, 0x7

    const/16 v50, 0x4

    move/from16 v37, v13

    move/from16 v42, v15

    move/from16 v13, v39

    move-object/from16 v39, v14

    .line 263
    invoke-virtual {v1, v0}, Lyyds/ᛶᲀᛱᛵ;->ᛷᲈᲈᲁ(I)V

    add-int/lit8 v0, v25, 0x1

    goto :goto_53

    :goto_54
    if-eqz v6, :cond_5a

    .line 264
    array-length v14, v6

    if-ge v3, v14, :cond_5a

    if-gt v5, v9, :cond_5a

    if-ne v5, v9, :cond_59

    .line 265
    aget v5, v6, v3

    .line 266
    invoke-virtual {v7, v8, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛳᲁᲁᲇ(Lyyds/ᛵᛳᛶᲇ;I)I

    move-result v5

    .line 267
    invoke-virtual {v7, v11, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    move-result-object v14

    const/16 v45, 0x2

    add-int/lit8 v5, v5, 0x2

    .line 268
    iget v15, v8, Lyyds/ᛵᛳᛶᲇ;->ᛱᲈᲁ:I

    iget-object v2, v8, Lyyds/ᛵᛳᛶᲇ;->ᛲᛳᛶᲁ:Lyyds/ᲇᲇᛳᛴ;

    move/from16 v20, v0

    const/4 v0, 0x1

    .line 269
    invoke-virtual {v1, v15, v2, v14, v0}, Lyyds/ᛶᲀᛱᛵ;->ᛷᛲᲈᛱ(ILyyds/ᲇᲇᛳᛴ;Ljava/lang/String;Z)Lyyds/ᲇᲇᛶᛶ;

    move-result-object v2

    .line 270
    invoke-virtual {v7, v2, v5, v0, v11}, Lyyds/ᛸᛴᲇᲇ;->ᛲᛳᛶᲁ(Lyyds/ᲇᲇᛶᛶ;IZ[C)I

    goto :goto_55

    :cond_59
    move/from16 v20, v0

    :goto_55
    add-int/lit8 v3, v3, 0x1

    .line 271
    invoke-virtual {v7, v6, v3}, Lyyds/ᛸᛴᲇᲇ;->ᲀᛲᛳᲀ([II)I

    move-result v5

    move/from16 v0, v20

    goto/16 :goto_4f

    :cond_5a
    move/from16 v20, v0

    move/from16 v0, v22

    move/from16 v2, v23

    :goto_56
    if-eqz v40, :cond_5d

    move-object/from16 v14, v40

    .line 272
    array-length v15, v14

    if-ge v0, v15, :cond_5c

    if-gt v2, v9, :cond_5c

    if-ne v2, v9, :cond_5b

    .line 273
    aget v2, v14, v0

    .line 274
    invoke-virtual {v7, v8, v2}, Lyyds/ᛸᛴᲇᲇ;->ᛳᲁᲁᲇ(Lyyds/ᛵᛳᛶᲇ;I)I

    move-result v2

    .line 275
    invoke-virtual {v7, v11, v2}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    move-result-object v15

    const/16 v45, 0x2

    add-int/lit8 v2, v2, 0x2

    move/from16 v21, v0

    .line 276
    iget v0, v8, Lyyds/ᛵᛳᛶᲇ;->ᛱᲈᲁ:I

    move/from16 v22, v3

    iget-object v3, v8, Lyyds/ᛵᛳᛶᲇ;->ᛲᛳᛶᲁ:Lyyds/ᲇᲇᛳᛴ;

    move/from16 v23, v4

    const/4 v4, 0x0

    .line 277
    invoke-virtual {v1, v0, v3, v15, v4}, Lyyds/ᛶᲀᛱᛵ;->ᛷᛲᲈᛱ(ILyyds/ᲇᲇᛳᛴ;Ljava/lang/String;Z)Lyyds/ᲇᲇᛶᛶ;

    move-result-object v0

    const/4 v3, 0x1

    .line 278
    invoke-virtual {v7, v0, v2, v3, v11}, Lyyds/ᛸᛴᲇᲇ;->ᛲᛳᛶᲁ(Lyyds/ᲇᲇᛶᛶ;IZ[C)I

    goto :goto_57

    :cond_5b
    move/from16 v21, v0

    move/from16 v22, v3

    move/from16 v23, v4

    :goto_57
    add-int/lit8 v0, v21, 0x1

    .line 279
    invoke-virtual {v7, v14, v0}, Lyyds/ᛸᛴᲇᲇ;->ᲀᛲᛳᲀ([II)I

    move-result v2

    move-object/from16 v40, v14

    move/from16 v3, v22

    move/from16 v4, v23

    goto :goto_56

    :cond_5c
    move/from16 v21, v0

    move/from16 v22, v3

    move/from16 v23, v4

    goto :goto_58

    :cond_5d
    move/from16 v21, v0

    move/from16 v22, v3

    move/from16 v23, v4

    move-object/from16 v14, v40

    :goto_58
    move-object v0, v7

    move/from16 v4, v23

    move/from16 v7, v31

    move/from16 v25, v32

    move/from16 v3, v41

    move/from16 v15, v42

    const/16 v29, 0x3

    const/16 v30, 0x0

    move/from16 v23, v2

    move-object v2, v6

    move-object/from16 v42, v12

    move/from16 v6, v20

    move/from16 v20, v22

    move/from16 v12, v46

    move/from16 v22, v21

    move/from16 v21, v5

    move-object v5, v14

    move-object/from16 v14, v39

    move/from16 v39, v13

    move/from16 v13, v37

    move-object/from16 v37, v10

    move-object/from16 v10, v35

    goto/16 :goto_23

    :cond_5e
    move-object v7, v0

    move-object v6, v2

    move/from16 v41, v3

    move-object/from16 v35, v10

    move/from16 v46, v12

    move-object/from16 v10, v37

    move/from16 v37, v13

    move/from16 v13, v39

    move-object/from16 v39, v14

    move-object v14, v5

    .line 280
    aget-object v0, v39, v37

    if-eqz v0, :cond_5f

    .line 281
    invoke-virtual {v1, v0}, Lyyds/ᛶᲀᛱᛵ;->ᛱᛳᲇ(Lyyds/ᛳᲀᛷᛸ;)V

    :cond_5f
    move/from16 v4, v33

    if-eqz v4, :cond_6b

    .line 282
    iget v0, v8, Lyyds/ᛵᛳᛶᲇ;->ᛵᛸᛸᛷ:I

    const/16 v45, 0x2

    and-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_6b

    move/from16 v0, v34

    if-eqz v0, :cond_61

    .line 283
    invoke-virtual {v7, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v2

    const/16 v29, 0x3

    mul-int/lit8 v2, v2, 0x3

    new-array v3, v2, [I

    add-int/lit8 v34, v0, 0x2

    move/from16 v0, v34

    :goto_59
    if-lez v2, :cond_60

    add-int/lit8 v5, v2, -0x1

    add-int/lit8 v9, v0, 0x6

    .line 284
    aput v9, v3, v5

    add-int/lit8 v5, v2, -0x2

    add-int/lit8 v9, v0, 0x8

    .line 285
    invoke-virtual {v7, v9}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v9

    aput v9, v3, v5

    add-int/lit8 v2, v2, -0x3

    .line 286
    invoke-virtual {v7, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v5

    aput v5, v3, v2

    add-int/lit8 v0, v0, 0xa

    goto :goto_59

    :cond_60
    move-object v2, v3

    goto :goto_5a

    :cond_61
    const/4 v2, 0x0

    .line 287
    :goto_5a
    invoke-virtual {v7, v4}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v0

    const/16 v45, 0x2

    add-int/lit8 v33, v4, 0x2

    move/from16 v3, v33

    :goto_5b
    add-int/lit8 v4, v0, -0x1

    if-lez v0, :cond_6b

    .line 288
    invoke-virtual {v7, v3}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v0

    add-int/lit8 v5, v3, 0x2

    .line 289
    invoke-virtual {v7, v5}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v5

    add-int/lit8 v9, v3, 0x4

    .line 290
    invoke-virtual {v7, v11, v9}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    move-result-object v9

    add-int/lit8 v12, v3, 0x6

    .line 291
    invoke-virtual {v7, v11, v12}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    move-result-object v12

    add-int/lit8 v15, v3, 0x8

    .line 292
    invoke-virtual {v7, v15}, Lyyds/ᛸᛴᲇᲇ;->ᛵᛶᛲᲀ(I)I

    move-result v15

    add-int/lit8 v3, v3, 0xa

    move/from16 p3, v3

    move/from16 v16, v4

    if-eqz v2, :cond_63

    const/4 v3, 0x0

    .line 293
    :goto_5c
    array-length v4, v2

    if-ge v3, v4, :cond_63

    .line 294
    aget v4, v2, v3

    if-ne v4, v0, :cond_62

    add-int/lit8 v4, v3, 0x1

    aget v4, v2, v4

    if-ne v4, v15, :cond_62

    add-int/lit8 v3, v3, 0x2

    .line 295
    aget v3, v2, v3

    invoke-virtual {v7, v11, v3}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    move-result-object v3

    goto :goto_5d

    :cond_62
    add-int/lit8 v3, v3, 0x3

    goto :goto_5c

    :cond_63
    const/4 v3, 0x0

    .line 296
    :goto_5d
    aget-object v4, v39, v0

    add-int/2addr v0, v5

    aget-object v0, v39, v0

    if-eqz v3, :cond_65

    .line 297
    iget-object v5, v1, Lyyds/ᛶᲀᛱᛵ;->ᛵᛶᛲᲀ:Lyyds/ᲇᲇᛳᛴ;

    if-nez v5, :cond_64

    .line 298
    new-instance v5, Lyyds/ᲇᲇᛳᛴ;

    invoke-direct {v5}, Lyyds/ᲇᲇᛳᛴ;-><init>()V

    iput-object v5, v1, Lyyds/ᛶᲀᛱᛵ;->ᛵᛶᛲᲀ:Lyyds/ᲇᲇᛳᛴ;

    :cond_64
    move-object/from16 v17, v2

    .line 299
    iget v2, v1, Lyyds/ᛶᲀᛱᛵ;->ᛶᛳᛶᛵ:I

    const/16 v18, 0x1

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lyyds/ᛶᲀᛱᛵ;->ᛶᛳᛶᛵ:I

    .line 300
    iget v2, v4, Lyyds/ᛳᲀᛷᛸ;->ᲇᲈᛵᛷ:I

    .line 301
    invoke-virtual {v5, v2}, Lyyds/ᲇᲇᛳᛴ;->ᛷᲈᲈᲁ(I)V

    iget v2, v0, Lyyds/ᛳᲀᛷᛸ;->ᲇᲈᛵᛷ:I

    move/from16 v19, v2

    iget v2, v4, Lyyds/ᛳᲀᛷᛸ;->ᲇᲈᛵᛷ:I

    sub-int v2, v19, v2

    .line 302
    invoke-virtual {v5, v2}, Lyyds/ᲇᲇᛳᛴ;->ᛷᲈᲈᲁ(I)V

    .line 303
    invoke-virtual {v10, v9}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛳᛶᲁ(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v5, v2}, Lyyds/ᲇᲇᛳᛴ;->ᛷᲈᲈᲁ(I)V

    .line 304
    invoke-virtual {v10, v3}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛳᛶᲁ(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v5, v2}, Lyyds/ᲇᲇᛳᛴ;->ᛷᲈᲈᲁ(I)V

    .line 305
    invoke-virtual {v5, v15}, Lyyds/ᲇᲇᛳᛴ;->ᛷᲈᲈᲁ(I)V

    goto :goto_5e

    :cond_65
    move-object/from16 v17, v2

    .line 306
    :goto_5e
    iget-object v2, v1, Lyyds/ᛶᲀᛱᛵ;->ᲇᛱᛲ:Lyyds/ᲇᲇᛳᛴ;

    if-nez v2, :cond_66

    .line 307
    new-instance v2, Lyyds/ᲇᲇᛳᛴ;

    invoke-direct {v2}, Lyyds/ᲇᲇᛳᛴ;-><init>()V

    iput-object v2, v1, Lyyds/ᛶᲀᛱᛵ;->ᲇᛱᛲ:Lyyds/ᲇᲇᛳᛴ;

    .line 308
    :cond_66
    iget v3, v1, Lyyds/ᛶᲀᛱᛵ;->ᛳᲁᲁᲇ:I

    const/16 v18, 0x1

    add-int/lit8 v3, v3, 0x1

    iput v3, v1, Lyyds/ᛶᲀᛱᛵ;->ᛳᲁᲁᲇ:I

    .line 309
    iget v3, v4, Lyyds/ᛳᲀᛷᛸ;->ᲇᲈᛵᛷ:I

    .line 310
    invoke-virtual {v2, v3}, Lyyds/ᲇᲇᛳᛴ;->ᛷᲈᲈᲁ(I)V

    iget v0, v0, Lyyds/ᛳᲀᛷᛸ;->ᲇᲈᛵᛷ:I

    iget v3, v4, Lyyds/ᛳᲀᛷᛸ;->ᲇᲈᛵᛷ:I

    sub-int/2addr v0, v3

    .line 311
    invoke-virtual {v2, v0}, Lyyds/ᲇᲇᛳᛴ;->ᛷᲈᲈᲁ(I)V

    .line 312
    invoke-virtual {v10, v9}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛳᛶᲁ(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lyyds/ᲇᲇᛳᛴ;->ᛷᲈᲈᲁ(I)V

    .line 313
    invoke-virtual {v10, v12}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛳᛶᲁ(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lyyds/ᲇᲇᛳᛴ;->ᛷᲈᲈᲁ(I)V

    .line 314
    invoke-virtual {v2, v15}, Lyyds/ᲇᲇᛳᛴ;->ᛷᲈᲈᲁ(I)V

    if-eqz v13, :cond_69

    const/4 v9, 0x0

    .line 315
    invoke-virtual {v12, v9}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v2, 0x4a

    if-eq v0, v2, :cond_68

    const/16 v3, 0x44

    if-ne v0, v3, :cond_67

    goto :goto_5f

    :cond_67
    const/4 v0, 0x1

    goto :goto_60

    :cond_68
    :goto_5f
    const/4 v0, 0x2

    :goto_60
    add-int/2addr v15, v0

    .line 316
    iget v0, v1, Lyyds/ᛶᲀᛱᛵ;->ᛲᛳᛶᲁ:I

    if-le v15, v0, :cond_6a

    .line 317
    iput v15, v1, Lyyds/ᛶᲀᛱᛵ;->ᛲᛳᛶᲁ:I

    goto :goto_61

    :cond_69
    const/16 v2, 0x4a

    const/4 v9, 0x0

    :cond_6a
    :goto_61
    move/from16 v3, p3

    move/from16 v0, v16

    move-object/from16 v2, v17

    goto/16 :goto_5b

    :cond_6b
    const/4 v9, 0x0

    const/16 v10, 0x41

    if-eqz v6, :cond_6e

    .line 318
    array-length v12, v6

    move v13, v9

    :goto_62
    if-ge v13, v12, :cond_6e

    aget v0, v6, v13

    .line 319
    invoke-virtual {v7, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛲᛴᛳᛲ(I)I

    move-result v2

    const/16 v3, 0x40

    if-eq v2, v3, :cond_6d

    if-ne v2, v10, :cond_6c

    goto :goto_63

    :cond_6c
    move-object/from16 v40, v6

    move-object v9, v7

    move/from16 v51, v41

    const/16 v45, 0x2

    goto :goto_64

    .line 320
    :cond_6d
    :goto_63
    invoke-virtual {v7, v8, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛳᲁᲁᲇ(Lyyds/ᛵᛳᛶᲇ;I)I

    move-result v0

    move-object/from16 v40, v6

    .line 321
    invoke-virtual {v7, v11, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    move-result-object v6

    const/16 v45, 0x2

    add-int/lit8 v15, v0, 0x2

    .line 322
    iget v1, v8, Lyyds/ᛵᛳᛶᲇ;->ᛱᲈᲁ:I

    iget-object v2, v8, Lyyds/ᛵᛳᛶᲇ;->ᛲᛳᛶᲁ:Lyyds/ᲇᲇᛳᛴ;

    iget-object v3, v8, Lyyds/ᛵᛳᛶᲇ;->ᛷᲈᲈᲁ:[Lyyds/ᛳᲀᛷᛸ;

    iget-object v4, v8, Lyyds/ᛵᛳᛶᲇ;->ᛷᛲᲈᛱ:[Lyyds/ᛳᲀᛷᛸ;

    iget-object v5, v8, Lyyds/ᛵᛳᛶᲇ;->ᛷᛵᲇᲀ:[I

    const/4 v7, 0x1

    move-object/from16 v9, p0

    move-object/from16 v0, p1

    move/from16 v51, v41

    .line 323
    invoke-virtual/range {v0 .. v7}, Lyyds/ᛶᲀᛱᛵ;->ᛶᛳᛶᛵ(ILyyds/ᲇᲇᛳᛴ;[Lyyds/ᛳᲀᛷᛸ;[Lyyds/ᛳᲀᛷᛸ;[ILjava/lang/String;Z)Lyyds/ᲇᲇᛶᛶ;

    move-result-object v1

    const/4 v3, 0x1

    .line 324
    invoke-virtual {v9, v1, v15, v3, v11}, Lyyds/ᛸᛴᲇᲇ;->ᛲᛳᛶᲁ(Lyyds/ᲇᲇᛶᛶ;IZ[C)I

    :goto_64
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v1, p1

    move-object v7, v9

    move-object/from16 v6, v40

    move/from16 v41, v51

    const/4 v9, 0x0

    goto :goto_62

    :cond_6e
    move-object v9, v7

    move/from16 v51, v41

    const/16 v45, 0x2

    if-eqz v14, :cond_71

    .line 325
    array-length v12, v14

    const/4 v13, 0x0

    :goto_65
    if-ge v13, v12, :cond_71

    aget v0, v14, v13

    .line 326
    invoke-virtual {v9, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛲᛴᛳᛲ(I)I

    move-result v1

    const/16 v15, 0x40

    if-eq v1, v15, :cond_70

    if-ne v1, v10, :cond_6f

    goto :goto_66

    :cond_6f
    move-object/from16 v0, p1

    const/4 v3, 0x1

    goto :goto_67

    .line 327
    :cond_70
    :goto_66
    invoke-virtual {v9, v8, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛳᲁᲁᲇ(Lyyds/ᛵᛳᛶᲇ;I)I

    move-result v0

    .line 328
    invoke-virtual {v9, v11, v0}, Lyyds/ᛸᛴᲇᲇ;->ᛶᛳᛶᛵ([CI)Ljava/lang/String;

    move-result-object v6

    add-int/lit8 v0, v0, 0x2

    .line 329
    iget v1, v8, Lyyds/ᛵᛳᛶᲇ;->ᛱᲈᲁ:I

    iget-object v2, v8, Lyyds/ᛵᛳᛶᲇ;->ᛲᛳᛶᲁ:Lyyds/ᲇᲇᛳᛴ;

    iget-object v3, v8, Lyyds/ᛵᛳᛶᲇ;->ᛷᲈᲈᲁ:[Lyyds/ᛳᲀᛷᛸ;

    iget-object v4, v8, Lyyds/ᛵᛳᛶᲇ;->ᛷᛲᲈᛱ:[Lyyds/ᛳᲀᛷᛸ;

    iget-object v5, v8, Lyyds/ᛵᛳᛶᲇ;->ᛷᛵᲇᲀ:[I

    const/4 v7, 0x0

    move v10, v0

    move-object/from16 v0, p1

    .line 330
    invoke-virtual/range {v0 .. v7}, Lyyds/ᛶᲀᛱᛵ;->ᛶᛳᛶᛵ(ILyyds/ᲇᲇᛳᛴ;[Lyyds/ᛳᲀᛷᛸ;[Lyyds/ᛳᲀᛷᛸ;[ILjava/lang/String;Z)Lyyds/ᲇᲇᛶᛶ;

    move-result-object v1

    const/4 v3, 0x1

    .line 331
    invoke-virtual {v9, v1, v10, v3, v11}, Lyyds/ᛸᛴᲇᲇ;->ᛲᛳᛶᲁ(Lyyds/ᲇᲇᛶᛶ;IZ[C)I

    :goto_67
    add-int/lit8 v13, v13, 0x1

    const/16 v10, 0x41

    goto :goto_65

    :cond_71
    move-object/from16 v0, p1

    move-object/from16 v2, v35

    :goto_68
    if-eqz v2, :cond_72

    .line 332
    iget-object v1, v2, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    check-cast v1, Lyyds/ᛳᛷᲀᛴ;

    .line 333
    iget-object v3, v0, Lyyds/ᛶᲀᛱᛵ;->ᛱᛸᲁᲇ:Lyyds/ᛳᛷᲀᛴ;

    iput-object v3, v2, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 334
    iput-object v2, v0, Lyyds/ᛶᲀᛱᛵ;->ᛱᛸᲁᲇ:Lyyds/ᛳᛷᲀᛴ;

    move-object v2, v1

    goto :goto_68

    :cond_72
    move/from16 v1, v46

    move/from16 v3, v51

    .line 335
    invoke-virtual {v0, v1, v3}, Lyyds/ᛶᲀᛱᛵ;->ᛵᛶᛲᲀ(II)V

    return-void

    .line 336
    :cond_73
    invoke-static {}, Lyyds/ᛷᲈᲈᛶ;->ᛲᲈᲁ()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_1
        :pswitch_9
        :pswitch_1
        :pswitch_1
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_1
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_9
        :pswitch_7
        :pswitch_6
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_3
        :pswitch_3
        :pswitch_1
        :pswitch_9
        :pswitch_1
        :pswitch_a
        :pswitch_a
        :pswitch_1
        :pswitch_1
        :pswitch_a
        :pswitch_a
        :pswitch_5
        :pswitch_4
        :pswitch_8
        :pswitch_8
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x15
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x36
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x42
        :pswitch_c
        :pswitch_c
        :pswitch_b
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1c
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_18
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_1b
        :pswitch_16
        :pswitch_15
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_1f
        :pswitch_12
        :pswitch_20
        :pswitch_20
        :pswitch_12
        :pswitch_12
        :pswitch_20
        :pswitch_20
        :pswitch_11
        :pswitch_10
        :pswitch_17
        :pswitch_17
        :pswitch_f
        :pswitch_f
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_d
    .end packed-switch
.end method

.method public final ᲇᲈᛵᛷ([Lyyds/ᛳᛷᲀᛴ;Ljava/lang/String;II)Lyyds/ᛳᛷᲀᛴ;
    .locals 6

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    iget-object v3, p0, Lyyds/ᛸᛴᲇᲇ;->ᛵᛸᛸᛷ:[B

    .line 5
    .line 6
    if-ge v2, v0, :cond_1

    .line 7
    .line 8
    aget-object v4, p1, v2

    .line 9
    .line 10
    iget-object v5, v4, Lyyds/ᛳᛷᲀᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v5, Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    new-instance p0, Lyyds/ᛳᛷᲀᛴ;

    .line 21
    .line 22
    iget-object p1, v4, Lyyds/ᛳᛷᲀᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, Ljava/lang/String;

    .line 25
    .line 26
    invoke-direct {p0, p1}, Lyyds/ᛳᛷᲀᛴ;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    new-instance p1, Lyyds/ᲇᲇᛳᛴ;

    .line 30
    .line 31
    new-array p2, p4, [B

    .line 32
    .line 33
    invoke-static {v3, p3, p2, v1, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p1, v1}, Lyyds/ᲇᲇᛳᛴ;-><init>(Z)V

    .line 37
    .line 38
    .line 39
    iput-object p2, p1, Lyyds/ᲇᲇᛳᛴ;->ᛵᛸᛸᛷ:[B

    .line 40
    .line 41
    iput p4, p1, Lyyds/ᲇᲇᛳᛴ;->ᲀᛲᛳᲀ:I

    .line 42
    .line 43
    iput-object p1, p0, Lyyds/ᛳᛷᲀᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    new-instance p0, Lyyds/ᛳᛷᲀᛴ;

    .line 50
    .line 51
    invoke-direct {p0, p2}, Lyyds/ᛳᛷᲀᛴ;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    new-instance p1, Lyyds/ᲇᲇᛳᛴ;

    .line 55
    .line 56
    new-array p2, p4, [B

    .line 57
    .line 58
    invoke-static {v3, p3, p2, v1, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 59
    .line 60
    .line 61
    invoke-direct {p1, v1}, Lyyds/ᲇᲇᛳᛴ;-><init>(Z)V

    .line 62
    .line 63
    .line 64
    iput-object p2, p1, Lyyds/ᲇᲇᛳᛴ;->ᛵᛸᛸᛷ:[B

    .line 65
    .line 66
    iput p4, p1, Lyyds/ᲇᲇᛳᛴ;->ᲀᛲᛳᲀ:I

    .line 67
    .line 68
    iput-object p1, p0, Lyyds/ᛳᛷᲀᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 69
    .line 70
    return-object p0
.end method
