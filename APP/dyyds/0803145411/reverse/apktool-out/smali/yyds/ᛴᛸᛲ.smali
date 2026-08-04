.class public abstract Lyyds/ᛴᛸᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static ᛲᲈᲁ:Lyyds/ᛱᲇᛵᲁ;

.field public static ᛵᛸᛸᛷ:Z

.field public static final ᲀᛲᛳᲀ:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᛴᛸᛲ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public static ᛱᲈᲁ(Ljava/lang/CharSequence;Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-static {p1}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static ᛲᛲᲈᲈ(Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    new-instance v1, Ljava/io/StringWriter;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Ljava/io/StringWriter;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const/4 v3, 0x4

    .line 17
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 18
    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    move v5, v4

    .line 22
    move v6, v5

    .line 23
    move v7, v6

    .line 24
    :goto_0
    const/16 v8, 0x5c

    .line 25
    .line 26
    if-ge v5, v0, :cond_e

    .line 27
    .line 28
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 29
    .line 30
    .line 31
    move-result v9

    .line 32
    if-eqz v7, :cond_1

    .line 33
    .line 34
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    if-ne v8, v3, :cond_d

    .line 42
    .line 43
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    const/16 v7, 0x10

    .line 48
    .line 49
    invoke-static {v6, v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    int-to-char v6, v6

    .line 54
    invoke-virtual {v1, v6}, Ljava/io/StringWriter;->write(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->setLength(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    move v6, v4

    .line 61
    move v7, v6

    .line 62
    goto/16 :goto_2

    .line 63
    .line 64
    :catch_0
    move-exception p0

    .line 65
    new-instance v0, Lyyds/ᛸᛳᛵᛳ;

    .line 66
    .line 67
    new-instance v1, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v3, "Unable to parse unicode value: "

    .line 70
    .line 71
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-direct {v0, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    throw v0

    .line 85
    :cond_1
    const/4 v10, 0x1

    .line 86
    if-eqz v6, :cond_b

    .line 87
    .line 88
    const/16 v6, 0x22

    .line 89
    .line 90
    if-eq v9, v6, :cond_a

    .line 91
    .line 92
    const/16 v6, 0x27

    .line 93
    .line 94
    if-eq v9, v6, :cond_9

    .line 95
    .line 96
    if-eq v9, v8, :cond_8

    .line 97
    .line 98
    const/16 v6, 0x62

    .line 99
    .line 100
    if-eq v9, v6, :cond_7

    .line 101
    .line 102
    const/16 v6, 0x66

    .line 103
    .line 104
    if-eq v9, v6, :cond_6

    .line 105
    .line 106
    const/16 v6, 0x6e

    .line 107
    .line 108
    if-eq v9, v6, :cond_5

    .line 109
    .line 110
    const/16 v6, 0x72

    .line 111
    .line 112
    if-eq v9, v6, :cond_4

    .line 113
    .line 114
    const/16 v6, 0x74

    .line 115
    .line 116
    if-eq v9, v6, :cond_3

    .line 117
    .line 118
    const/16 v6, 0x75

    .line 119
    .line 120
    if-eq v9, v6, :cond_2

    .line 121
    .line 122
    invoke-virtual {v1, v9}, Ljava/io/StringWriter;->write(I)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_2
    move v6, v4

    .line 127
    move v7, v10

    .line 128
    goto :goto_2

    .line 129
    :cond_3
    const/16 v6, 0x9

    .line 130
    .line 131
    invoke-virtual {v1, v6}, Ljava/io/StringWriter;->write(I)V

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_4
    const/16 v6, 0xd

    .line 136
    .line 137
    invoke-virtual {v1, v6}, Ljava/io/StringWriter;->write(I)V

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_5
    const/16 v6, 0xa

    .line 142
    .line 143
    invoke-virtual {v1, v6}, Ljava/io/StringWriter;->write(I)V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_6
    const/16 v6, 0xc

    .line 148
    .line 149
    invoke-virtual {v1, v6}, Ljava/io/StringWriter;->write(I)V

    .line 150
    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_7
    const/16 v6, 0x8

    .line 154
    .line 155
    invoke-virtual {v1, v6}, Ljava/io/StringWriter;->write(I)V

    .line 156
    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_8
    invoke-virtual {v1, v8}, Ljava/io/StringWriter;->write(I)V

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_9
    invoke-virtual {v1, v6}, Ljava/io/StringWriter;->write(I)V

    .line 164
    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_a
    invoke-virtual {v1, v6}, Ljava/io/StringWriter;->write(I)V

    .line 168
    .line 169
    .line 170
    :goto_1
    move v6, v4

    .line 171
    goto :goto_2

    .line 172
    :cond_b
    if-ne v9, v8, :cond_c

    .line 173
    .line 174
    move v6, v10

    .line 175
    goto :goto_2

    .line 176
    :cond_c
    invoke-virtual {v1, v9}, Ljava/io/StringWriter;->write(I)V

    .line 177
    .line 178
    .line 179
    :cond_d
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 180
    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :cond_e
    if-eqz v6, :cond_f

    .line 184
    .line 185
    invoke-virtual {v1, v8}, Ljava/io/StringWriter;->write(I)V

    .line 186
    .line 187
    .line 188
    :cond_f
    invoke-virtual {v1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    return-object p0
.end method

.method public static ᛲᛳᛶᲁ(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p1}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static ᛲᛴᛳᛲ(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-static {p0, v0}, Lyyds/ᲈᲈᲈᛴ;->ᛲᛴᛳᛲ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public static ᛲᲈᲁ(Lyyds/ᲇᲁᲀᲁ;[Lyyds/ᲇᲁᲀᲁ;I)Ljava/lang/String;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Lyyds/ᲇᲁᲀᲁ;->ᛵᛸᛸᛷ()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v4, 0x0

    .line 10
    :goto_0
    if-ge v4, v2, :cond_b

    .line 11
    .line 12
    add-int v5, v4, v2

    .line 13
    .line 14
    div-int/lit8 v5, v5, 0x2

    .line 15
    .line 16
    :goto_1
    const/16 v6, 0xa

    .line 17
    .line 18
    const/4 v7, -0x1

    .line 19
    if-le v5, v7, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0, v5}, Lyyds/ᲇᲁᲀᲁ;->ᛲᛴᛳᛲ(I)B

    .line 22
    .line 23
    .line 24
    move-result v8

    .line 25
    if-eq v8, v6, :cond_0

    .line 26
    .line 27
    add-int/lit8 v5, v5, -0x1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    add-int/lit8 v8, v5, 0x1

    .line 31
    .line 32
    const/4 v9, 0x1

    .line 33
    move v10, v9

    .line 34
    :goto_2
    add-int v11, v8, v10

    .line 35
    .line 36
    invoke-virtual {v0, v11}, Lyyds/ᲇᲁᲀᲁ;->ᛲᛴᛳᛲ(I)B

    .line 37
    .line 38
    .line 39
    move-result v12

    .line 40
    if-eq v12, v6, :cond_1

    .line 41
    .line 42
    add-int/lit8 v10, v10, 0x1

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    sub-int v6, v11, v8

    .line 46
    .line 47
    move/from16 v12, p2

    .line 48
    .line 49
    const/4 v10, 0x0

    .line 50
    const/4 v13, 0x0

    .line 51
    const/4 v14, 0x0

    .line 52
    :goto_3
    if-eqz v10, :cond_2

    .line 53
    .line 54
    const/16 v10, 0x2e

    .line 55
    .line 56
    const/4 v15, 0x0

    .line 57
    goto :goto_4

    .line 58
    :cond_2
    aget-object v15, v1, v12

    .line 59
    .line 60
    invoke-virtual {v15, v13}, Lyyds/ᲇᲁᲀᲁ;->ᛲᛴᛳᛲ(I)B

    .line 61
    .line 62
    .line 63
    move-result v15

    .line 64
    sget-object v16, Lyyds/ᛶᲁᛵᛲ;->ᛲᲈᲁ:[B

    .line 65
    .line 66
    and-int/lit16 v15, v15, 0xff

    .line 67
    .line 68
    move/from16 v18, v15

    .line 69
    .line 70
    move v15, v10

    .line 71
    move/from16 v10, v18

    .line 72
    .line 73
    :goto_4
    add-int v3, v8, v14

    .line 74
    .line 75
    invoke-virtual {v0, v3}, Lyyds/ᲇᲁᲀᲁ;->ᛲᛴᛳᛲ(I)B

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    sget-object v17, Lyyds/ᛶᲁᛵᛲ;->ᛲᲈᲁ:[B

    .line 80
    .line 81
    and-int/lit16 v3, v3, 0xff

    .line 82
    .line 83
    sub-int/2addr v10, v3

    .line 84
    if-nez v10, :cond_5

    .line 85
    .line 86
    add-int/lit8 v14, v14, 0x1

    .line 87
    .line 88
    add-int/lit8 v13, v13, 0x1

    .line 89
    .line 90
    if-eq v14, v6, :cond_5

    .line 91
    .line 92
    aget-object v3, v1, v12

    .line 93
    .line 94
    invoke-virtual {v3}, Lyyds/ᲇᲁᲀᲁ;->ᛵᛸᛸᛷ()I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-ne v3, v13, :cond_4

    .line 99
    .line 100
    array-length v3, v1

    .line 101
    sub-int/2addr v3, v9

    .line 102
    if-ne v12, v3, :cond_3

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_3
    add-int/lit8 v12, v12, 0x1

    .line 106
    .line 107
    move v13, v7

    .line 108
    move v10, v9

    .line 109
    goto :goto_3

    .line 110
    :cond_4
    move v10, v15

    .line 111
    goto :goto_3

    .line 112
    :cond_5
    :goto_5
    if-gez v10, :cond_6

    .line 113
    .line 114
    :goto_6
    move v2, v5

    .line 115
    goto :goto_0

    .line 116
    :cond_6
    if-lez v10, :cond_7

    .line 117
    .line 118
    :goto_7
    add-int/lit8 v4, v11, 0x1

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_7
    sub-int v3, v6, v14

    .line 122
    .line 123
    aget-object v7, v1, v12

    .line 124
    .line 125
    invoke-virtual {v7}, Lyyds/ᲇᲁᲀᲁ;->ᛵᛸᛸᛷ()I

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    sub-int/2addr v7, v13

    .line 130
    add-int/lit8 v12, v12, 0x1

    .line 131
    .line 132
    array-length v9, v1

    .line 133
    :goto_8
    if-ge v12, v9, :cond_8

    .line 134
    .line 135
    aget-object v10, v1, v12

    .line 136
    .line 137
    invoke-virtual {v10}, Lyyds/ᲇᲁᲀᲁ;->ᛵᛸᛸᛷ()I

    .line 138
    .line 139
    .line 140
    move-result v10

    .line 141
    add-int/2addr v7, v10

    .line 142
    add-int/lit8 v12, v12, 0x1

    .line 143
    .line 144
    goto :goto_8

    .line 145
    :cond_8
    if-ge v7, v3, :cond_9

    .line 146
    .line 147
    goto :goto_6

    .line 148
    :cond_9
    if-le v7, v3, :cond_a

    .line 149
    .line 150
    goto :goto_7

    .line 151
    :cond_a
    add-int/2addr v6, v8

    .line 152
    invoke-virtual {v0, v8, v6}, Lyyds/ᲇᲁᲀᲁ;->ᛲᛳᛶᲁ(II)Lyyds/ᲇᲁᲀᲁ;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    sget-object v1, Lyyds/ᛲᛵᛴᛴ;->ᛲᲈᲁ:Ljava/nio/charset/Charset;

    .line 157
    .line 158
    invoke-virtual {v0, v1}, Lyyds/ᲇᲁᲀᲁ;->ᛱᲈᲁ(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    return-object v0

    .line 163
    :cond_b
    const/4 v0, 0x0

    .line 164
    return-object v0
.end method

.method public static varargs ᛵᛸᛸᛷ([Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 7

    .line 1
    array-length v0, p0

    .line 2
    if-nez v0, :cond_0

    .line 3
    .line 4
    goto :goto_2

    .line 5
    :cond_0
    array-length v0, p0

    .line 6
    const/4 v1, 0x1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne v0, v1, :cond_1

    .line 9
    .line 10
    aget-object p0, p0, v2

    .line 11
    .line 12
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_1
    const/4 v0, -0x1

    .line 18
    move v4, v0

    .line 19
    move v1, v2

    .line 20
    move v3, v1

    .line 21
    :goto_0
    array-length v5, p0

    .line 22
    if-ge v1, v5, :cond_4

    .line 23
    .line 24
    aget-object v5, p0, v1

    .line 25
    .line 26
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    add-int/2addr v3, v5

    .line 31
    const/4 v6, -0x2

    .line 32
    if-eq v4, v6, :cond_3

    .line 33
    .line 34
    if-lez v5, :cond_3

    .line 35
    .line 36
    if-ne v4, v0, :cond_2

    .line 37
    .line 38
    move v4, v1

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move v4, v6

    .line 41
    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    if-nez v3, :cond_5

    .line 45
    .line 46
    :goto_2
    const-string p0, ""

    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_5
    if-lez v4, :cond_6

    .line 50
    .line 51
    aget-object p0, p0, v4

    .line 52
    .line 53
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 61
    .line 62
    .line 63
    array-length v1, p0

    .line 64
    :goto_3
    if-ge v2, v1, :cond_7

    .line 65
    .line 66
    aget-object v3, p0, v2

    .line 67
    .line 68
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    add-int/lit8 v2, v2, 0x1

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_7
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
.end method

.method public static ᛶᛷᛲᲁ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Iterable;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string p0, ""

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method

.method public static ᛷᛲᲈᛱ(Lyyds/ᲀᲈᛶᲈ;F)V
    .locals 11

    .line 1
    iget-object v0, p0, Lyyds/ᲀᲈᛶᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyyds/ᛵᛴᲀᛷ;

    .line 4
    .line 5
    iget-object v1, p0, Lyyds/ᲀᲈᛶᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroidx/cardview/widget/CardView;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroidx/cardview/widget/CardView;->getUseCompatPadding()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {v1}, Landroidx/cardview/widget/CardView;->getPreventCornerOverlap()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    iget v4, v0, Lyyds/ᛵᛴᲀᛷ;->ᛲᛴᛳᛲ:F

    .line 18
    .line 19
    cmpl-float v4, p1, v4

    .line 20
    .line 21
    if-nez v4, :cond_0

    .line 22
    .line 23
    iget-boolean v4, v0, Lyyds/ᛵᛴᲀᛷ;->ᲇᲇᲇᛱ:Z

    .line 24
    .line 25
    if-ne v4, v2, :cond_0

    .line 26
    .line 27
    iget-boolean v4, v0, Lyyds/ᛵᛴᲀᛷ;->ᛶᛷᛲᲁ:Z

    .line 28
    .line 29
    if-ne v4, v3, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iput p1, v0, Lyyds/ᛵᛴᲀᛷ;->ᛲᛴᛳᛲ:F

    .line 33
    .line 34
    iput-boolean v2, v0, Lyyds/ᛵᛴᲀᛷ;->ᲇᲇᲇᛱ:Z

    .line 35
    .line 36
    iput-boolean v3, v0, Lyyds/ᛵᛴᲀᛷ;->ᛶᛷᛲᲁ:Z

    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    invoke-virtual {v0, p1}, Lyyds/ᛵᛴᲀᛷ;->ᛵᛸᛸᛷ(Landroid/graphics/Rect;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 43
    .line 44
    .line 45
    :goto_0
    invoke-virtual {v1}, Landroidx/cardview/widget/CardView;->getUseCompatPadding()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_1

    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    invoke-virtual {p0, p1, p1, p1, p1}, Lyyds/ᲀᲈᛶᲈ;->ᲈᛷᲈᛶ(IIII)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    iget-object p1, p0, Lyyds/ᲀᲈᛶᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p1, Lyyds/ᛵᛴᲀᛷ;

    .line 59
    .line 60
    iget v0, p1, Lyyds/ᛵᛴᲀᛷ;->ᛲᛴᛳᛲ:F

    .line 61
    .line 62
    iget p1, p1, Lyyds/ᛵᛴᲀᛷ;->ᛲᲈᲁ:F

    .line 63
    .line 64
    invoke-virtual {v1}, Landroidx/cardview/widget/CardView;->getPreventCornerOverlap()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    .line 69
    .line 70
    if-eqz v2, :cond_2

    .line 71
    .line 72
    float-to-double v5, v0

    .line 73
    sget-wide v7, Lyyds/ᛳᲇᛴᛴ;->ᛲᲈᲁ:D

    .line 74
    .line 75
    sub-double v7, v3, v7

    .line 76
    .line 77
    float-to-double v9, p1

    .line 78
    mul-double/2addr v7, v9

    .line 79
    add-double/2addr v7, v5

    .line 80
    double-to-float v2, v7

    .line 81
    goto :goto_1

    .line 82
    :cond_2
    sget v2, Lyyds/ᛳᲇᛴᛴ;->ᛵᛸᛸᛷ:I

    .line 83
    .line 84
    move v2, v0

    .line 85
    :goto_1
    float-to-double v5, v2

    .line 86
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    .line 87
    .line 88
    .line 89
    move-result-wide v5

    .line 90
    double-to-int v2, v5

    .line 91
    invoke-virtual {v1}, Landroidx/cardview/widget/CardView;->getPreventCornerOverlap()Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    const/high16 v5, 0x3fc00000    # 1.5f

    .line 96
    .line 97
    if-eqz v1, :cond_3

    .line 98
    .line 99
    mul-float/2addr v0, v5

    .line 100
    float-to-double v0, v0

    .line 101
    sget-wide v5, Lyyds/ᛳᲇᛴᛴ;->ᛲᲈᲁ:D

    .line 102
    .line 103
    sub-double/2addr v3, v5

    .line 104
    float-to-double v5, p1

    .line 105
    mul-double/2addr v3, v5

    .line 106
    add-double/2addr v3, v0

    .line 107
    double-to-float p1, v3

    .line 108
    goto :goto_2

    .line 109
    :cond_3
    mul-float p1, v0, v5

    .line 110
    .line 111
    :goto_2
    float-to-double v0, p1

    .line 112
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 113
    .line 114
    .line 115
    move-result-wide v0

    .line 116
    double-to-int p1, v0

    .line 117
    invoke-virtual {p0, v2, p1, v2, p1}, Lyyds/ᲀᲈᛶᲈ;->ᲈᛷᲈᛶ(IIII)V

    .line 118
    .line 119
    .line 120
    return-void
.end method

.method public static final ᛷᛵᲇᲀ(J)J
    .locals 14

    .line 1
    sget-object v0, Lyyds/ᛴᛵᛱᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛵᲈᲁ;

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    cmp-long v2, p0, v0

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-lez v2, :cond_0

    .line 9
    .line 10
    move v2, v3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ne v2, v3, :cond_b

    .line 14
    .line 15
    const-wide/32 v4, 0xf423f

    .line 16
    .line 17
    .line 18
    sget-object v2, Lyyds/ᛲᛸᲈᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛲᛸᲈᛴ;

    .line 19
    .line 20
    invoke-static {v4, v5, v2}, Lyyds/ᛶᛶᲁᲇ;->ᛶᲈᛴᲈ(JLyyds/ᛲᛸᲈᛴ;)J

    .line 21
    .line 22
    .line 23
    move-result-wide v4

    .line 24
    long-to-int v2, p0

    .line 25
    and-int/2addr v2, v3

    .line 26
    long-to-int v6, v4

    .line 27
    and-int/2addr v6, v3

    .line 28
    if-ne v2, v6, :cond_7

    .line 29
    .line 30
    const-wide/32 v6, 0xf4240

    .line 31
    .line 32
    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    shr-long/2addr p0, v3

    .line 36
    shr-long v0, v4, v3

    .line 37
    .line 38
    add-long/2addr p0, v0

    .line 39
    const-wide v0, -0x3ffffffffffa14bfL    # -2.0000000001722644

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    cmp-long v0, v0, p0

    .line 45
    .line 46
    if-gtz v0, :cond_1

    .line 47
    .line 48
    const-wide v0, 0x3ffffffffffa14c0L    # 1.999999999913868

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    cmp-long v0, p0, v0

    .line 54
    .line 55
    if-gez v0, :cond_1

    .line 56
    .line 57
    shl-long/2addr p0, v3

    .line 58
    sget v0, Lyyds/ᛳᛲᲁᲁ;->ᛲᲈᲁ:I

    .line 59
    .line 60
    goto/16 :goto_2

    .line 61
    .line 62
    :cond_1
    div-long/2addr p0, v6

    .line 63
    invoke-static {p0, p1}, Lyyds/ᛶᛶᲁᲇ;->ᛲᛴᛳᛲ(J)J

    .line 64
    .line 65
    .line 66
    move-result-wide p0

    .line 67
    goto :goto_2

    .line 68
    :cond_2
    shr-long/2addr p0, v3

    .line 69
    shr-long/2addr v4, v3

    .line 70
    invoke-static {p0, p1, v4, v5}, Lyyds/ᛶᛶᲁᲇ;->ᛲᲈᲁ(JJ)J

    .line 71
    .line 72
    .line 73
    move-result-wide v8

    .line 74
    const-wide p0, 0x7fffffffffffc0deL

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    cmp-long p0, v8, p0

    .line 80
    .line 81
    if-eqz p0, :cond_6

    .line 82
    .line 83
    const-wide p0, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    cmp-long p0, v8, p0

    .line 89
    .line 90
    if-eqz p0, :cond_5

    .line 91
    .line 92
    const-wide p0, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    cmp-long p0, v8, p0

    .line 98
    .line 99
    if-nez p0, :cond_3

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_3
    const-wide p0, -0x431bde82d7aL

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    cmp-long p0, p0, v8

    .line 108
    .line 109
    if-gtz p0, :cond_4

    .line 110
    .line 111
    const-wide p0, 0x431bde82d7bL

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    cmp-long p0, v8, p0

    .line 117
    .line 118
    if-gez p0, :cond_4

    .line 119
    .line 120
    mul-long/2addr v8, v6

    .line 121
    shl-long p0, v8, v3

    .line 122
    .line 123
    sget v0, Lyyds/ᛳᛲᲁᲁ;->ᛲᲈᲁ:I

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_4
    const-wide v10, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    const-wide v12, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    invoke-static/range {v8 .. v13}, Lyyds/ᛳᛵᲀ;->ᲇᲈᛵᛷ(JJJ)J

    .line 137
    .line 138
    .line 139
    move-result-wide p0

    .line 140
    invoke-static {p0, p1}, Lyyds/ᛶᛶᲁᲇ;->ᛲᛴᛳᛲ(J)J

    .line 141
    .line 142
    .line 143
    move-result-wide p0

    .line 144
    goto :goto_2

    .line 145
    :cond_5
    :goto_1
    invoke-static {v8, v9}, Lyyds/ᛶᛶᲁᲇ;->ᛲᛴᛳᛲ(J)J

    .line 146
    .line 147
    .line 148
    move-result-wide p0

    .line 149
    goto :goto_2

    .line 150
    :cond_6
    const-string p0, "Summing infinite durations of different signs yields an undefined result."

    .line 151
    .line 152
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    return-wide v0

    .line 156
    :cond_7
    if-ne v2, v3, :cond_8

    .line 157
    .line 158
    shr-long/2addr p0, v3

    .line 159
    shr-long v0, v4, v3

    .line 160
    .line 161
    invoke-static {p0, p1, v0, v1}, Lyyds/ᛴᛵᛱᲁ;->ᛲᲈᲁ(JJ)J

    .line 162
    .line 163
    .line 164
    move-result-wide p0

    .line 165
    goto :goto_2

    .line 166
    :cond_8
    shr-long v0, v4, v3

    .line 167
    .line 168
    shr-long/2addr p0, v3

    .line 169
    invoke-static {v0, v1, p0, p1}, Lyyds/ᛴᛵᛱᲁ;->ᛲᲈᲁ(JJ)J

    .line 170
    .line 171
    .line 172
    move-result-wide p0

    .line 173
    :goto_2
    long-to-int v0, p0

    .line 174
    and-int/2addr v0, v3

    .line 175
    if-ne v0, v3, :cond_a

    .line 176
    .line 177
    sget-wide v0, Lyyds/ᛴᛵᛱᲁ;->ᲇᲈᛵᛷ:J

    .line 178
    .line 179
    cmp-long v0, p0, v0

    .line 180
    .line 181
    if-eqz v0, :cond_a

    .line 182
    .line 183
    sget-wide v0, Lyyds/ᛴᛵᛱᲁ;->ᛲᛴᛳᛲ:J

    .line 184
    .line 185
    cmp-long v0, p0, v0

    .line 186
    .line 187
    if-nez v0, :cond_9

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_9
    shr-long/2addr p0, v3

    .line 191
    return-wide p0

    .line 192
    :cond_a
    :goto_3
    sget-object v0, Lyyds/ᛲᛸᲈᛴ;->ᛲᛴᛳᛲ:Lyyds/ᛲᛸᲈᛴ;

    .line 193
    .line 194
    invoke-static {p0, p1, v0}, Lyyds/ᛴᛵᛱᲁ;->ᛵᛸᛸᛷ(JLyyds/ᛲᛸᲈᛴ;)J

    .line 195
    .line 196
    .line 197
    move-result-wide p0

    .line 198
    return-wide p0

    .line 199
    :cond_b
    if-nez v2, :cond_c

    .line 200
    .line 201
    return-wide v0

    .line 202
    :cond_c
    invoke-static {}, Lyyds/ᛱᛸᛶᛲ;->ᛷᲈᲈᲁ()V

    .line 203
    .line 204
    .line 205
    return-wide v0
.end method

.method public static ᛷᲈᲈᲁ(Ljava/lang/String;)Lyyds/ᛷᛸᛱᲈ;
    .locals 8

    .line 1
    const-string v0, "HTTP/1."

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x4

    .line 8
    sget-object v2, Lyyds/ᛴᲀᲁᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᲁᛲ;

    .line 9
    .line 10
    sget-object v3, Lyyds/ᛴᲀᲁᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛴᲀᲁᛲ;

    .line 11
    .line 12
    const/16 v4, 0x20

    .line 13
    .line 14
    const-string v5, "Unexpected status line: "

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/16 v6, 0x9

    .line 23
    .line 24
    if-lt v0, v6, :cond_1

    .line 25
    .line 26
    const/16 v0, 0x8

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-ne v0, v4, :cond_1

    .line 33
    .line 34
    const/4 v0, 0x7

    .line 35
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    add-int/lit8 v0, v0, -0x30

    .line 40
    .line 41
    if-eqz v0, :cond_4

    .line 42
    .line 43
    const/4 v2, 0x1

    .line 44
    if-ne v0, v2, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance v0, Ljava/net/ProtocolException;

    .line 48
    .line 49
    invoke-virtual {v5, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-direct {v0, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v0

    .line 57
    :cond_1
    new-instance v0, Ljava/net/ProtocolException;

    .line 58
    .line 59
    invoke-virtual {v5, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-direct {v0, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v0

    .line 67
    :cond_2
    const-string v0, "ICY "

    .line 68
    .line 69
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    move v6, v1

    .line 76
    goto :goto_1

    .line 77
    :cond_3
    const-string v0, "SOURCETABLE "

    .line 78
    .line 79
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_9

    .line 84
    .line 85
    const/16 v6, 0xc

    .line 86
    .line 87
    :goto_0
    move-object v2, v3

    .line 88
    :cond_4
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    add-int/lit8 v3, v6, 0x3

    .line 93
    .line 94
    if-lt v0, v3, :cond_8

    .line 95
    .line 96
    invoke-virtual {p0, v6, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {v0}, Lyyds/ᛳᲇᲁᛳ;->ᛶᛳᛶᛵ(Ljava/lang/String;)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    if-eqz v0, :cond_7

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    if-le v7, v3, :cond_6

    .line 115
    .line 116
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-ne v3, v4, :cond_5

    .line 121
    .line 122
    add-int/2addr v6, v1

    .line 123
    invoke-virtual {p0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    goto :goto_2

    .line 128
    :cond_5
    new-instance v0, Ljava/net/ProtocolException;

    .line 129
    .line 130
    invoke-virtual {v5, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-direct {v0, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw v0

    .line 138
    :cond_6
    const-string p0, ""

    .line 139
    .line 140
    :goto_2
    new-instance v1, Lyyds/ᛷᛸᛱᲈ;

    .line 141
    .line 142
    invoke-direct {v1, v2, v0, p0}, Lyyds/ᛷᛸᛱᲈ;-><init>(Lyyds/ᛴᲀᲁᛲ;ILjava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return-object v1

    .line 146
    :cond_7
    new-instance v0, Ljava/net/ProtocolException;

    .line 147
    .line 148
    invoke-virtual {v5, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-direct {v0, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw v0

    .line 156
    :cond_8
    new-instance v0, Ljava/net/ProtocolException;

    .line 157
    .line 158
    invoke-virtual {v5, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-direct {v0, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw v0

    .line 166
    :cond_9
    new-instance v0, Ljava/net/ProtocolException;

    .line 167
    .line 168
    invoke-virtual {v5, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-direct {v0, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw v0
.end method

.method public static final ᲀᛲᛳᲀ(JLyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Lyyds/ᛸᲀᛱᛴ;

    .line 9
    .line 10
    invoke-static {p2}, Lyyds/ᛶᛶᲁᲇ;->ᛷᲈᲈᲁ(Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, v1, p2}, Lyyds/ᛸᲀᛱᛴ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lyyds/ᛸᲀᛱᛴ;->ᛵᲀᲈᛴ()V

    .line 19
    .line 20
    .line 21
    const-wide v1, 0x7fffffffffffffffL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    cmp-long p2, p0, v1

    .line 27
    .line 28
    if-gez p2, :cond_1

    .line 29
    .line 30
    iget-object p2, v0, Lyyds/ᛸᲀᛱᛴ;->ᛶᛷᛲᲁ:Lyyds/ᲁᛴᛲ;

    .line 31
    .line 32
    invoke-static {p2}, Lyyds/ᛴᛸᛲ;->ᲇᲇᲇᛱ(Lyyds/ᲁᛴᛲ;)Lyyds/ᲈᲈᛲᛱ;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-interface {p2, p0, p1, v0}, Lyyds/ᲈᲈᛲᛱ;->ᛳᛸᛴᛶ(JLyyds/ᛸᲀᛱᛴ;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {v0}, Lyyds/ᛸᲀᛱᛴ;->ᛶᲈᛴᲈ()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    sget-object p1, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 44
    .line 45
    if-ne p0, p1, :cond_2

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_2
    :goto_0
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 49
    .line 50
    return-object p0
.end method

.method public static final ᲇᲇᲇᛱ(Lyyds/ᲁᛴᛲ;)Lyyds/ᲈᲈᛲᛱ;
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᛱᛵᲈᲁ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲁ;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lyyds/ᲁᛴᛲ;->ᛷᛸᲇᛶ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of v0, p0, Lyyds/ᲈᲈᛲᛱ;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p0, Lyyds/ᲈᲈᛲᛱ;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    :goto_0
    if-nez p0, :cond_1

    .line 16
    .line 17
    sget-object p0, Lyyds/ᲇᛶᛵᛸ;->ᛲᲈᲁ:Lyyds/ᲈᲈᛲᛱ;

    .line 18
    .line 19
    :cond_1
    return-object p0
.end method

.method public static ᲇᲈᛵᛷ(Ljavax/net/ssl/SSLSession;)Lyyds/ᲀᲈᛴᛴ;
    .locals 6

    .line 1
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getCipherSuite()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    const-string v2, "TLS_NULL_WITH_NULL_NULL"

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_2

    .line 15
    .line 16
    const-string v2, "SSL_NULL_WITH_NULL_NULL"

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_2

    .line 23
    .line 24
    sget-object v2, Lyyds/ᛵᲈᲀᛳ;->ᛵᛸᛸᛷ:Lyyds/ᛴᛲᛷᛸ;

    .line 25
    .line 26
    invoke-virtual {v2, v0}, Lyyds/ᛴᛲᛷᛸ;->ᛶᛳᛶᛵ(Ljava/lang/String;)Lyyds/ᛵᲈᲀᛳ;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getProtocol()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    const-string v3, "NONE"

    .line 37
    .line 38
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_0

    .line 43
    .line 44
    invoke-static {v2}, Lyyds/ᛴᛲᛴᛲ;->ᛱᲈᲁ(Ljava/lang/String;)Lyyds/ᲁᲈᛵᛷ;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    :try_start_0
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getPeerCertificates()[Ljava/security/cert/Certificate;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-static {v2}, Lyyds/ᛴᛲᛲᲇ;->ᛷᛲᲈᛱ([Ljava/lang/Object;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v2
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    goto :goto_0

    .line 57
    :catch_0
    sget-object v2, Lyyds/ᛸᲀᛶᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛶᲈ;

    .line 58
    .line 59
    :goto_0
    new-instance v3, Lyyds/ᲀᲈᛴᛴ;

    .line 60
    .line 61
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getLocalCertificates()[Ljava/security/cert/Certificate;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-static {p0}, Lyyds/ᛴᛲᛲᲇ;->ᛷᛲᲈᛱ([Ljava/lang/Object;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    new-instance v4, Lyyds/ᛵᲇᛵᲇ;

    .line 70
    .line 71
    const/16 v5, 0xc

    .line 72
    .line 73
    invoke-direct {v4, v5, v2}, Lyyds/ᛵᲇᛵᲇ;-><init>(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-direct {v3, v1, v0, p0, v4}, Lyyds/ᲀᲈᛴᛴ;-><init>(Lyyds/ᲁᲈᛵᛷ;Lyyds/ᛵᲈᲀᛳ;Ljava/util/List;Lyyds/ᲁᛶᲁᲀ;)V

    .line 77
    .line 78
    .line 79
    return-object v3

    .line 80
    :cond_0
    const-string p0, "tlsVersion == NONE"

    .line 81
    .line 82
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-object v1

    .line 86
    :cond_1
    const-string p0, "tlsVersion == null"

    .line 87
    .line 88
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-object v1

    .line 92
    :cond_2
    const-string p0, "cipherSuite == "

    .line 93
    .line 94
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-object v1

    .line 102
    :cond_3
    const-string p0, "cipherSuite == null"

    .line 103
    .line 104
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-object v1
.end method
