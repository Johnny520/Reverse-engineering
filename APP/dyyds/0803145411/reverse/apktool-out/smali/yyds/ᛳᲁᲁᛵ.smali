.class public final Lyyds/ᛳᲁᲁᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛵᛸᛸᛷ:Lyyds/ᛳᲇᲀᲀ;


# instance fields
.field public ᛲᲈᲁ:Lyyds/ᛲᛷᛴᛵ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lyyds/ᛳᲁᲁᛵ;

    .line 2
    .line 3
    invoke-static {v0}, Lyyds/ᛵᛵᛲᲈ;->ᛵᛸᛸᛷ(Ljava/lang/Class;)Lyyds/ᛳᲇᲀᲀ;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lyyds/ᛳᲁᲁᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛳᲇᲀᲀ;

    .line 8
    .line 9
    return-void
.end method

.method public static ᛲᲈᲁ(C)Z
    .locals 1

    .line 1
    const/16 v0, 0x3c

    .line 2
    .line 3
    if-eq p0, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0x3e

    .line 6
    .line 7
    if-eq p0, v0, :cond_1

    .line 8
    .line 9
    const/16 v0, 0x3d

    .line 10
    .line 11
    if-eq p0, v0, :cond_1

    .line 12
    .line 13
    const/16 v0, 0x7e

    .line 14
    .line 15
    if-eq p0, v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x21

    .line 18
    .line 19
    if-ne p0, v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0

    .line 24
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 25
    return p0
.end method


# virtual methods
.method public final ᛱᲈᲁ()Lyyds/ᛳᲁᛲ;
    .locals 11

    .line 1
    iget-object p0, p0, Lyyds/ᛳᲁᲁᛵ;->ᛲᲈᲁ:Lyyds/ᛲᛷᛴᛵ;

    .line 2
    .line 3
    iget v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 4
    .line 5
    iget-object v1, p0, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/CharSequence;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lyyds/ᛲᛷᛴᛵ;->ᛲᛳᛶᲁ(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v2, 0x20

    .line 14
    .line 15
    const/4 v3, -0x1

    .line 16
    if-ne v0, v3, :cond_0

    .line 17
    .line 18
    move v0, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    :goto_0
    iget v4, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    invoke-virtual {p0, v5}, Lyyds/ᛲᛷᛴᛵ;->ᲇᲇᲇᛱ(I)V

    .line 28
    .line 29
    .line 30
    :goto_1
    iget v6, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 31
    .line 32
    invoke-virtual {p0, v6}, Lyyds/ᛲᛷᛴᛵ;->ᛲᛴᛳᛲ(I)Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    const/4 v7, 0x0

    .line 37
    if-eqz v6, :cond_8

    .line 38
    .line 39
    invoke-virtual {p0}, Lyyds/ᛲᛷᛴᛵ;->ᛲᲈᲁ()C

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    const/16 v8, 0x5b

    .line 44
    .line 45
    if-ne v6, v8, :cond_2

    .line 46
    .line 47
    iget v6, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 48
    .line 49
    const/16 v9, 0x5d

    .line 50
    .line 51
    invoke-virtual {p0, v6, v8, v9, v7}, Lyyds/ᛲᛷᛴᛵ;->ᛶᛷᛲᲁ(ICCZ)I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eq v6, v3, :cond_1

    .line 56
    .line 57
    add-int/lit8 v6, v6, 0x1

    .line 58
    .line 59
    iput v6, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_1
    const-string v0, "Square brackets does not match in filter "

    .line 63
    .line 64
    invoke-static {p0, v0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᲇᲇᛱ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/4 p0, 0x0

    .line 68
    return-object p0

    .line 69
    :cond_2
    :goto_2
    invoke-virtual {p0}, Lyyds/ᛲᛷᛴᛵ;->ᛲᲈᲁ()C

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    const/16 v8, 0x29

    .line 74
    .line 75
    if-ne v6, v8, :cond_5

    .line 76
    .line 77
    invoke-virtual {p0}, Lyyds/ᛲᛷᛴᛵ;->ᛲᲈᲁ()C

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-eq v6, v8, :cond_3

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_3
    iget v6, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 85
    .line 86
    invoke-virtual {p0, v6}, Lyyds/ᛲᛷᛴᛵ;->ᛲᛳᛶᲁ(I)I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-eq v6, v3, :cond_5

    .line 91
    .line 92
    invoke-interface {v1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    const/16 v10, 0x28

    .line 97
    .line 98
    if-eq v9, v10, :cond_4

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_4
    add-int/lit8 v6, v6, -0x1

    .line 102
    .line 103
    invoke-virtual {p0, v6}, Lyyds/ᛲᛷᛴᛵ;->ᛲᛴᛳᛲ(I)Z

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    if-eqz v9, :cond_5

    .line 108
    .line 109
    if-le v6, v4, :cond_5

    .line 110
    .line 111
    invoke-interface {v1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    .line 112
    .line 113
    .line 114
    move-result v9

    .line 115
    const/16 v10, 0x2e

    .line 116
    .line 117
    if-ne v9, v10, :cond_4

    .line 118
    .line 119
    move v6, v5

    .line 120
    goto :goto_4

    .line 121
    :cond_5
    :goto_3
    move v6, v7

    .line 122
    :goto_4
    invoke-virtual {p0}, Lyyds/ᛲᛷᛴᛵ;->ᛲᲈᲁ()C

    .line 123
    .line 124
    .line 125
    move-result v9

    .line 126
    if-ne v9, v8, :cond_6

    .line 127
    .line 128
    if-nez v6, :cond_6

    .line 129
    .line 130
    move v6, v5

    .line 131
    goto :goto_5

    .line 132
    :cond_6
    move v6, v7

    .line 133
    :goto_5
    iget v8, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 134
    .line 135
    invoke-virtual {p0, v8}, Lyyds/ᛲᛷᛴᛵ;->ᛲᛴᛳᛲ(I)Z

    .line 136
    .line 137
    .line 138
    move-result v8

    .line 139
    if-eqz v8, :cond_8

    .line 140
    .line 141
    invoke-virtual {p0}, Lyyds/ᛲᛷᛴᛵ;->ᛲᲈᲁ()C

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    invoke-static {v8}, Lyyds/ᛳᲁᲁᛵ;->ᛲᲈᲁ(C)Z

    .line 146
    .line 147
    .line 148
    move-result v8

    .line 149
    if-nez v8, :cond_8

    .line 150
    .line 151
    invoke-virtual {p0}, Lyyds/ᛲᛷᛴᛵ;->ᛲᲈᲁ()C

    .line 152
    .line 153
    .line 154
    move-result v8

    .line 155
    if-eq v8, v2, :cond_8

    .line 156
    .line 157
    if-eqz v6, :cond_7

    .line 158
    .line 159
    goto :goto_6

    .line 160
    :cond_7
    invoke-virtual {p0, v5}, Lyyds/ᛲᛷᛴᛵ;->ᲇᲇᲇᛱ(I)V

    .line 161
    .line 162
    .line 163
    goto/16 :goto_1

    .line 164
    .line 165
    :cond_8
    :goto_6
    const/16 v2, 0x21

    .line 166
    .line 167
    if-eq v0, v2, :cond_9

    .line 168
    .line 169
    goto :goto_7

    .line 170
    :cond_9
    move v5, v7

    .line 171
    :goto_7
    iget p0, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 172
    .line 173
    invoke-interface {v1, v4, p0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    new-instance v0, Lyyds/ᛳᲁᛲ;

    .line 178
    .line 179
    invoke-direct {v0, p0, v5}, Lyyds/ᛳᲁᛲ;-><init>(Ljava/lang/CharSequence;Z)V

    .line 180
    .line 181
    .line 182
    return-object v0
.end method

.method public final ᛲᛳᛶᲁ()Lyyds/ᛶᲇᛸᛶ;
    .locals 6

    .line 1
    iget-object p0, p0, Lyyds/ᛳᲁᲁᛵ;->ᛲᲈᲁ:Lyyds/ᛲᛷᛴᛵ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛲᛷᛴᛵ;->ᲇᛱᛲ()V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 7
    .line 8
    invoke-virtual {p0}, Lyyds/ᛲᛷᛴᛵ;->ᛲᲈᲁ()C

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v1}, Lyyds/ᛳᲁᲁᛵ;->ᛲᲈᲁ(C)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    :goto_0
    iget v1, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Lyyds/ᛲᛷᛴᛵ;->ᛲᛴᛳᛲ(I)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Lyyds/ᛲᛷᛴᛵ;->ᛲᲈᲁ()C

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static {v1}, Lyyds/ᛳᲁᲁᛵ;->ᛲᲈᲁ(C)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0, v2}, Lyyds/ᛲᛷᛴᛵ;->ᲇᲇᲇᛱ(I)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    :goto_1
    iget v1, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 42
    .line 43
    invoke-virtual {p0, v1}, Lyyds/ᛲᛷᛴᛵ;->ᛲᛴᛳᛲ(I)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    invoke-virtual {p0}, Lyyds/ᛲᛷᛴᛵ;->ᛲᲈᲁ()C

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    const/16 v3, 0x20

    .line 54
    .line 55
    if-eq v1, v3, :cond_1

    .line 56
    .line 57
    invoke-virtual {p0, v2}, Lyyds/ᛲᛷᛴᛵ;->ᲇᲇᲇᛱ(I)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    iget v1, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 62
    .line 63
    iget-object v3, p0, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v3, Ljava/lang/CharSequence;

    .line 66
    .line 67
    invoke-interface {v3, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget p0, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 76
    .line 77
    sub-int/2addr p0, v2

    .line 78
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    filled-new-array {v0, p0, v1}, [Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    sget-object v0, Lyyds/ᛳᲁᲁᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛳᲇᲀᲀ;

    .line 87
    .line 88
    const-string v2, "Operator from {} to {} -> [{}]"

    .line 89
    .line 90
    invoke-interface {v0, v2, p0}, Lyyds/ᛳᲇᲀᲀ;->ᛶᛷᛲᲁ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 98
    .line 99
    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {}, Lyyds/ᛶᲇᛸᛶ;->values()[Lyyds/ᛶᲇᛸᛶ;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    array-length v2, v1

    .line 108
    const/4 v3, 0x0

    .line 109
    :goto_2
    if-ge v3, v2, :cond_3

    .line 110
    .line 111
    aget-object v4, v1, v3

    .line 112
    .line 113
    iget-object v5, v4, Lyyds/ᛶᲇᛸᛶ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-eqz v5, :cond_2

    .line 120
    .line 121
    return-object v4

    .line 122
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_3
    new-instance v0, Lyyds/ᲇᲈᛸᲀ;

    .line 126
    .line 127
    const-string v1, "Filter operator "

    .line 128
    .line 129
    const-string v2, " is not supported!"

    .line 130
    .line 131
    invoke-static {v1, p0, v2}, Lyyds/ᲀᲁᲈᲇ;->ᛷᛲᲈᛱ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw v0
.end method

.method public final ᛲᛴᛳᛲ()Lyyds/ᲈᛷᛶᛶ;
    .locals 5

    .line 1
    iget-object v0, p0, Lyyds/ᛳᲁᲁᛵ;->ᛲᲈᲁ:Lyyds/ᛲᛷᛴᛵ;

    .line 2
    .line 3
    invoke-virtual {v0}, Lyyds/ᛲᛷᛴᛵ;->ᲇᛱᛲ()V

    .line 4
    .line 5
    .line 6
    iget v1, v0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 7
    .line 8
    invoke-virtual {v0}, Lyyds/ᛲᛷᛴᛵ;->ᲇᛱᛲ()V

    .line 9
    .line 10
    .line 11
    const/16 v2, 0x21

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ(C)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Lyyds/ᛲᛷᛴᛵ;->ᛳᲁᲁᲇ(C)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lyyds/ᛲᛷᛴᛵ;->ᲇᛱᛲ()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lyyds/ᛲᛷᛴᛵ;->ᛲᲈᲁ()C

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/16 v3, 0x24

    .line 30
    .line 31
    if-eq v2, v3, :cond_0

    .line 32
    .line 33
    const/16 v3, 0x40

    .line 34
    .line 35
    if-eq v2, v3, :cond_0

    .line 36
    .line 37
    invoke-virtual {p0}, Lyyds/ᛳᲁᲁᛵ;->ᛲᛴᛳᛲ()Lyyds/ᲈᛷᛶᛶ;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    new-instance v0, Lyyds/ᛷᛳᲀ;

    .line 42
    .line 43
    invoke-direct {v0, p0}, Lyyds/ᛷᛳᲀ;-><init>(Lyyds/ᲈᛷᛶᛶ;)V

    .line 44
    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_0
    iput v1, v0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 48
    .line 49
    :cond_1
    invoke-virtual {v0}, Lyyds/ᛲᛷᛴᛵ;->ᲇᛱᛲ()V

    .line 50
    .line 51
    .line 52
    const/16 v1, 0x28

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ(C)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_2

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Lyyds/ᛲᛷᛴᛵ;->ᛳᲁᲁᲇ(C)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lyyds/ᛳᲁᲁᛵ;->ᲇᲇᲇᛱ()Lyyds/ᲈᛷᛶᛶ;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    const/16 v1, 0x29

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Lyyds/ᛲᛷᛴᛵ;->ᛳᲁᲁᲇ(C)V

    .line 70
    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_2
    invoke-virtual {p0}, Lyyds/ᛳᲁᲁᛵ;->ᛷᛲᲈᛱ()Lyyds/ᲀᛶᛵᲁ;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iget v2, v0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 78
    .line 79
    :try_start_0
    invoke-virtual {p0}, Lyyds/ᛳᲁᲁᛵ;->ᛲᛳᛶᲁ()Lyyds/ᛶᲇᛸᛶ;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {p0}, Lyyds/ᛳᲁᲁᛵ;->ᛷᛲᲈᛱ()Lyyds/ᲀᛶᛵᲁ;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    new-instance v4, Lyyds/ᲇᛶᛳᛴ;

    .line 88
    .line 89
    invoke-direct {v4, v1, v3, p0}, Lyyds/ᲇᛶᛳᛴ;-><init>(Lyyds/ᲀᛶᛵᲁ;Lyyds/ᛶᲇᛸᛶ;Lyyds/ᲀᛶᛵᲁ;)V
    :try_end_0
    .catch Lyyds/ᲇᲈᛸᲀ; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    .line 91
    .line 92
    return-object v4

    .line 93
    :catch_0
    iput v2, v0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 94
    .line 95
    invoke-virtual {v1}, Lyyds/ᲀᛶᛵᲁ;->ᲇᲇᲇᛱ()Lyyds/ᛳᲁᛲ;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    iget-boolean v0, p0, Lyyds/ᛳᲁᛲ;->ᛲᛴᛳᛲ:Z

    .line 100
    .line 101
    new-instance v1, Lyyds/ᛳᲁᛲ;

    .line 102
    .line 103
    iget-object p0, p0, Lyyds/ᛳᲁᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛳᛵᲇ;

    .line 104
    .line 105
    const/4 v2, 0x1

    .line 106
    invoke-direct {v1, p0, v2, v0}, Lyyds/ᛳᲁᛲ;-><init>(Lyyds/ᲈᛳᛵᲇ;ZZ)V

    .line 107
    .line 108
    .line 109
    if-eqz v0, :cond_3

    .line 110
    .line 111
    sget-object p0, Lyyds/ᛳᛲᲀᛲ;->ᛵᛸᛸᛷ:Lyyds/ᲀᛲᛱᛵ;

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_3
    sget-object p0, Lyyds/ᛳᛲᲀᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲀᛲᛱᛵ;

    .line 115
    .line 116
    :goto_0
    new-instance v0, Lyyds/ᲇᛶᛳᛴ;

    .line 117
    .line 118
    sget-object v2, Lyyds/ᛶᲇᛸᛶ;->ᛵᛶᛲᲀ:Lyyds/ᛶᲇᛸᛶ;

    .line 119
    .line 120
    invoke-direct {v0, v1, v2, p0}, Lyyds/ᲇᛶᛳᛴ;-><init>(Lyyds/ᲀᛶᛵᲁ;Lyyds/ᛶᲇᛸᛶ;Lyyds/ᲀᛶᛵᲁ;)V

    .line 121
    .line 122
    .line 123
    return-object v0
.end method

.method public final ᛵᛸᛸᛷ()Lyyds/ᲀᛲᛱᛵ;
    .locals 5

    .line 1
    iget-object p0, p0, Lyyds/ᛳᲁᲁᛵ;->ᛲᲈᲁ:Lyyds/ᛲᛷᛴᛵ;

    .line 2
    .line 3
    iget v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛲᛷᛴᛵ;->ᛲᲈᲁ()C

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget v2, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 10
    .line 11
    const/16 v3, 0x74

    .line 12
    .line 13
    if-ne v1, v3, :cond_0

    .line 14
    .line 15
    add-int/lit8 v2, v2, 0x3

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    add-int/lit8 v2, v2, 0x4

    .line 19
    .line 20
    :goto_0
    invoke-virtual {p0, v2}, Lyyds/ᛲᛷᛴᛵ;->ᛲᛴᛳᛲ(I)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const-string v3, "Expected boolean literal"

    .line 25
    .line 26
    if-eqz v1, :cond_4

    .line 27
    .line 28
    add-int/lit8 v1, v2, 0x1

    .line 29
    .line 30
    iget-object v4, p0, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v4, Ljava/lang/CharSequence;

    .line 33
    .line 34
    invoke-interface {v4, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v4, "true"

    .line 39
    .line 40
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-nez v4, :cond_2

    .line 45
    .line 46
    const-string v4, "false"

    .line 47
    .line 48
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    new-instance p0, Lyyds/ᲇᲈᛸᲀ;

    .line 56
    .line 57
    invoke-direct {p0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p0

    .line 61
    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    invoke-virtual {p0, v3}, Lyyds/ᛲᛷᛴᛵ;->ᲇᲇᲇᛱ(I)V

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    filled-new-array {p0, v0, v1}, [Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    sget-object v0, Lyyds/ᛳᲁᲁᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛳᲇᲀᲀ;

    .line 81
    .line 82
    const-string v2, "BooleanLiteral from {} to {} -> [{}]"

    .line 83
    .line 84
    invoke-interface {v0, v2, p0}, Lyyds/ᛳᲇᲀᲀ;->ᛶᛷᛲᲁ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {p0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-eqz p0, :cond_3

    .line 96
    .line 97
    sget-object p0, Lyyds/ᛳᛲᲀᛲ;->ᛵᛸᛸᛷ:Lyyds/ᲀᛲᛱᛵ;

    .line 98
    .line 99
    return-object p0

    .line 100
    :cond_3
    sget-object p0, Lyyds/ᛳᛲᲀᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲀᛲᛱᛵ;

    .line 101
    .line 102
    return-object p0

    .line 103
    :cond_4
    new-instance p0, Lyyds/ᲇᲈᛸᲀ;

    .line 104
    .line 105
    invoke-direct {p0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw p0
.end method

.method public final ᛶᛷᛲᲁ()Lyyds/ᛸᛱᛷᲇ;
    .locals 4

    .line 1
    iget-object p0, p0, Lyyds/ᛳᲁᲁᛵ;->ᛲᲈᲁ:Lyyds/ᛲᛷᛴᛵ;

    .line 2
    .line 3
    iget v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 4
    .line 5
    iget-object v1, p0, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/CharSequence;

    .line 8
    .line 9
    :goto_0
    iget v2, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 10
    .line 11
    invoke-virtual {p0, v2}, Lyyds/ᛲᛷᛴᛵ;->ᛲᛴᛳᛲ(I)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    iget v2, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 18
    .line 19
    invoke-interface {v1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-static {v2}, Ljava/lang/Character;->isDigit(C)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    const/16 v3, 0x2d

    .line 30
    .line 31
    if-eq v2, v3, :cond_0

    .line 32
    .line 33
    const/16 v3, 0x2e

    .line 34
    .line 35
    if-eq v2, v3, :cond_0

    .line 36
    .line 37
    const/16 v3, 0x45

    .line 38
    .line 39
    if-eq v2, v3, :cond_0

    .line 40
    .line 41
    const/16 v3, 0x65

    .line 42
    .line 43
    if-ne v2, v3, :cond_1

    .line 44
    .line 45
    :cond_0
    const/4 v2, 0x1

    .line 46
    invoke-virtual {p0, v2}, Lyyds/ᛲᛷᛴᛵ;->ᲇᲇᲇᛱ(I)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    iget v2, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 51
    .line 52
    invoke-interface {v1, v0, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget p0, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 61
    .line 62
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    filled-new-array {v0, p0, v1}, [Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    sget-object v0, Lyyds/ᛳᲁᲁᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛳᲇᲀᲀ;

    .line 71
    .line 72
    const-string v2, "NumberLiteral from {} to {} -> [{}]"

    .line 73
    .line 74
    invoke-interface {v0, v2, p0}, Lyyds/ᛳᲇᲀᲀ;->ᛶᛷᛲᲁ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    new-instance p0, Lyyds/ᛸᛱᛷᲇ;

    .line 78
    .line 79
    invoke-direct {p0, v1}, Lyyds/ᛸᛱᛷᲇ;-><init>(Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    return-object p0
.end method

.method public final ᛷᛲᲈᛱ()Lyyds/ᲀᛶᛵᲁ;
    .locals 10

    .line 1
    iget-object v0, p0, Lyyds/ᛳᲁᲁᛵ;->ᛲᲈᲁ:Lyyds/ᛲᛷᛴᛵ;

    .line 2
    .line 3
    invoke-virtual {v0}, Lyyds/ᛲᛷᛴᛵ;->ᲇᛱᛲ()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lyyds/ᛲᛷᛴᛵ;->ᛲᲈᲁ()C

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    const/16 v3, 0x40

    .line 12
    .line 13
    const/16 v4, 0x24

    .line 14
    .line 15
    const/16 v5, 0x21

    .line 16
    .line 17
    if-eq v1, v5, :cond_f

    .line 18
    .line 19
    if-eq v1, v4, :cond_e

    .line 20
    .line 21
    if-eq v1, v3, :cond_d

    .line 22
    .line 23
    invoke-virtual {v0}, Lyyds/ᛲᛷᛴᛵ;->ᲇᛱᛲ()V

    .line 24
    .line 25
    .line 26
    iget-object v1, v0, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Ljava/lang/CharSequence;

    .line 29
    .line 30
    invoke-virtual {v0}, Lyyds/ᛲᛷᛴᛵ;->ᛲᲈᲁ()C

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const/16 v4, 0x22

    .line 35
    .line 36
    if-eq v3, v4, :cond_c

    .line 37
    .line 38
    const/16 v4, 0x27

    .line 39
    .line 40
    if-eq v3, v4, :cond_b

    .line 41
    .line 42
    const/16 v4, 0x2d

    .line 43
    .line 44
    if-eq v3, v4, :cond_a

    .line 45
    .line 46
    sget-object v4, Lyyds/ᛳᲁᲁᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛳᲇᲀᲀ;

    .line 47
    .line 48
    const/16 v5, 0x2f

    .line 49
    .line 50
    if-eq v3, v5, :cond_6

    .line 51
    .line 52
    const/16 v2, 0x5b

    .line 53
    .line 54
    if-eq v3, v2, :cond_5

    .line 55
    .line 56
    const/16 v2, 0x66

    .line 57
    .line 58
    if-eq v3, v2, :cond_4

    .line 59
    .line 60
    const/16 v2, 0x6e

    .line 61
    .line 62
    if-eq v3, v2, :cond_2

    .line 63
    .line 64
    const/16 v0, 0x74

    .line 65
    .line 66
    if-eq v3, v0, :cond_1

    .line 67
    .line 68
    const/16 v0, 0x7b

    .line 69
    .line 70
    if-eq v3, v0, :cond_0

    .line 71
    .line 72
    invoke-virtual {p0}, Lyyds/ᛳᲁᲁᛵ;->ᛶᛷᛲᲁ()Lyyds/ᛸᛱᛷᲇ;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :cond_0
    invoke-virtual {p0}, Lyyds/ᛳᲁᲁᛵ;->ᲀᛲᛳᲀ()Lyyds/ᛶᛴᛲᲇ;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :cond_1
    invoke-virtual {p0}, Lyyds/ᛳᲁᲁᛵ;->ᛵᛸᛸᛷ()Lyyds/ᲀᛲᛱᛵ;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0

    .line 87
    :cond_2
    iget p0, v0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 88
    .line 89
    invoke-virtual {v0}, Lyyds/ᛲᛷᛴᛵ;->ᛲᲈᲁ()C

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-ne v3, v2, :cond_3

    .line 94
    .line 95
    iget v2, v0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 96
    .line 97
    add-int/lit8 v2, v2, 0x3

    .line 98
    .line 99
    invoke-virtual {v0, v2}, Lyyds/ᛲᛷᛴᛵ;->ᛲᛴᛳᛲ(I)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-eqz v2, :cond_3

    .line 104
    .line 105
    iget v2, v0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 106
    .line 107
    add-int/lit8 v3, v2, 0x4

    .line 108
    .line 109
    invoke-interface {v1, v2, v3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    const-string v2, "null"

    .line 114
    .line 115
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_3

    .line 124
    .line 125
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    iget v2, v0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 130
    .line 131
    add-int/lit8 v2, v2, 0x3

    .line 132
    .line 133
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    filled-new-array {p0, v2, v1}, [Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    const-string v2, "NullLiteral from {} to {} -> [{}]"

    .line 142
    .line 143
    invoke-interface {v4, v2, p0}, Lyyds/ᛳᲇᲀᲀ;->ᛶᛷᛲᲁ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    invoke-virtual {v0, p0}, Lyyds/ᛲᛷᛴᛵ;->ᲇᲇᲇᛱ(I)V

    .line 151
    .line 152
    .line 153
    sget-object p0, Lyyds/ᛳᛲᲀᛲ;->ᛲᲈᲁ:Lyyds/ᛷᛲᛴᲇ;

    .line 154
    .line 155
    return-object p0

    .line 156
    :cond_3
    new-instance p0, Lyyds/ᲇᲈᛸᲀ;

    .line 157
    .line 158
    const-string v0, "Expected <null> value"

    .line 159
    .line 160
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw p0

    .line 164
    :cond_4
    invoke-virtual {p0}, Lyyds/ᛳᲁᲁᛵ;->ᛵᛸᛸᛷ()Lyyds/ᲀᛲᛱᛵ;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    return-object p0

    .line 169
    :cond_5
    invoke-virtual {p0}, Lyyds/ᛳᲁᲁᛵ;->ᲀᛲᛳᲀ()Lyyds/ᛶᛴᛲᲇ;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    return-object p0

    .line 174
    :cond_6
    iget p0, v0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 175
    .line 176
    invoke-virtual {v0, v5, p0}, Lyyds/ᛲᛷᛴᛵ;->ᛷᛵᲇᲀ(CI)I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    const/4 v5, -0x1

    .line 181
    if-eq v3, v5, :cond_9

    .line 182
    .line 183
    add-int/lit8 v5, v3, 0x1

    .line 184
    .line 185
    invoke-virtual {v0, v5}, Lyyds/ᛲᛷᛴᛵ;->ᛲᛴᛳᛲ(I)Z

    .line 186
    .line 187
    .line 188
    move-result v6

    .line 189
    if-eqz v6, :cond_8

    .line 190
    .line 191
    move v6, v5

    .line 192
    :goto_0
    invoke-virtual {v0, v6}, Lyyds/ᛲᛷᛴᛵ;->ᛲᛴᛳᛲ(I)Z

    .line 193
    .line 194
    .line 195
    move-result v7

    .line 196
    if-eqz v7, :cond_7

    .line 197
    .line 198
    invoke-interface {v1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    .line 199
    .line 200
    .line 201
    move-result v7

    .line 202
    new-array v8, v2, [C

    .line 203
    .line 204
    const/4 v9, 0x0

    .line 205
    aput-char v7, v8, v9

    .line 206
    .line 207
    invoke-static {v8}, Lyyds/ᛴᛷᛷᲇ;->ᲀᛲᛳᲀ([C)I

    .line 208
    .line 209
    .line 210
    move-result v7

    .line 211
    if-lez v7, :cond_7

    .line 212
    .line 213
    add-int/lit8 v6, v6, 0x1

    .line 214
    .line 215
    goto :goto_0

    .line 216
    :cond_7
    if-le v6, v3, :cond_8

    .line 217
    .line 218
    invoke-interface {v1, v5, v6}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 223
    .line 224
    .line 225
    move-result v5

    .line 226
    add-int/2addr v3, v5

    .line 227
    :cond_8
    add-int/2addr v3, v2

    .line 228
    iput v3, v0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 229
    .line 230
    invoke-interface {v1, p0, v3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    iget v0, v0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 239
    .line 240
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    filled-new-array {p0, v0, v1}, [Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    const-string v0, "PatternNode from {} to {} -> [{}]"

    .line 249
    .line 250
    invoke-interface {v4, v0, p0}, Lyyds/ᛳᲇᲀᲀ;->ᛶᛷᛲᲁ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    new-instance p0, Lyyds/ᛴᛸᛶᲈ;

    .line 254
    .line 255
    invoke-direct {p0, v1}, Lyyds/ᛴᛸᛶᲈ;-><init>(Ljava/lang/CharSequence;)V

    .line 256
    .line 257
    .line 258
    return-object p0

    .line 259
    :cond_9
    const-string p0, "Pattern not closed. Expected / in "

    .line 260
    .line 261
    invoke-static {v0, p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᲇᲇᛱ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    const/4 p0, 0x0

    .line 265
    return-object p0

    .line 266
    :cond_a
    invoke-virtual {p0}, Lyyds/ᛳᲁᲁᛵ;->ᛶᛷᛲᲁ()Lyyds/ᛸᛱᛷᲇ;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    return-object p0

    .line 271
    :cond_b
    invoke-virtual {p0, v4}, Lyyds/ᛳᲁᲁᛵ;->ᛷᲈᲈᲁ(C)Lyyds/ᲀᲇᛵᲁ;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    return-object p0

    .line 276
    :cond_c
    invoke-virtual {p0, v4}, Lyyds/ᛳᲁᲁᛵ;->ᛷᲈᲈᲁ(C)Lyyds/ᲀᲇᛵᲁ;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    return-object p0

    .line 281
    :cond_d
    invoke-virtual {p0}, Lyyds/ᛳᲁᲁᛵ;->ᛱᲈᲁ()Lyyds/ᛳᲁᛲ;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    return-object p0

    .line 286
    :cond_e
    invoke-virtual {p0}, Lyyds/ᛳᲁᲁᛵ;->ᛱᲈᲁ()Lyyds/ᛳᲁᛲ;

    .line 287
    .line 288
    .line 289
    move-result-object p0

    .line 290
    return-object p0

    .line 291
    :cond_f
    invoke-virtual {v0, v2}, Lyyds/ᛲᛷᛴᛵ;->ᲇᲇᲇᛱ(I)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0}, Lyyds/ᛲᛷᛴᛵ;->ᲇᛱᛲ()V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0}, Lyyds/ᛲᛷᛴᛵ;->ᛲᲈᲁ()C

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-eq v0, v4, :cond_11

    .line 302
    .line 303
    if-ne v0, v3, :cond_10

    .line 304
    .line 305
    invoke-virtual {p0}, Lyyds/ᛳᲁᲁᛵ;->ᛱᲈᲁ()Lyyds/ᛳᲁᛲ;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    return-object p0

    .line 310
    :cond_10
    new-instance p0, Lyyds/ᲇᲈᛸᲀ;

    .line 311
    .line 312
    invoke-static {v5}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    const-string v1, "Unexpected character: %c"

    .line 321
    .line 322
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    throw p0

    .line 330
    :cond_11
    invoke-virtual {p0}, Lyyds/ᛳᲁᲁᛵ;->ᛱᲈᲁ()Lyyds/ᛳᲁᛲ;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    return-object p0
.end method

.method public final ᛷᲈᲈᲁ(C)Lyyds/ᲀᲇᛵᲁ;
    .locals 3

    .line 1
    iget-object p0, p0, Lyyds/ᛳᲁᲁᛵ;->ᛲᲈᲁ:Lyyds/ᛲᛷᛴᛵ;

    .line 2
    .line 3
    iget v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, Lyyds/ᛲᛷᛴᛵ;->ᛷᛵᲇᲀ(CI)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, -0x1

    .line 10
    if-eq v1, v2, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    add-int/2addr v1, p1

    .line 14
    iput v1, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 15
    .line 16
    iget-object v2, p0, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Ljava/lang/CharSequence;

    .line 19
    .line 20
    invoke-interface {v2, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget p0, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 29
    .line 30
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    filled-new-array {v0, p0, v1}, [Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    sget-object v0, Lyyds/ᛳᲁᲁᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛳᲇᲀᲀ;

    .line 39
    .line 40
    const-string v2, "StringLiteral from {} to {} -> [{}]"

    .line 41
    .line 42
    invoke-interface {v0, v2, p0}, Lyyds/ᛳᲇᲀᲀ;->ᛶᛷᛲᲁ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    new-instance p0, Lyyds/ᲀᲇᛵᲁ;

    .line 46
    .line 47
    invoke-direct {p0, v1, p1}, Lyyds/ᲀᲇᛵᲁ;-><init>(Ljava/lang/CharSequence;Z)V

    .line 48
    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_0
    new-instance v0, Lyyds/ᲇᲈᛸᲀ;

    .line 52
    .line 53
    new-instance v1, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v2, "String literal does not have matching quotes. Expected "

    .line 56
    .line 57
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string p1, " in "

    .line 64
    .line 65
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v0
.end method

.method public final ᲀᛲᛳᲀ()Lyyds/ᛶᛴᛲᲇ;
    .locals 5

    .line 1
    iget-object p0, p0, Lyyds/ᛳᲁᲁᛵ;->ᛲᲈᲁ:Lyyds/ᛲᛷᛴᛵ;

    .line 2
    .line 3
    iget v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛲᛷᛴᛵ;->ᛲᲈᲁ()C

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/16 v2, 0x5b

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    const/16 v2, 0x5d

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/16 v2, 0x7d

    .line 17
    .line 18
    :goto_0
    iget v3, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    invoke-virtual {p0, v3, v1, v2, v4}, Lyyds/ᛲᛷᛴᛵ;->ᛶᛷᛲᲁ(ICCZ)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, -0x1

    .line 26
    if-eq v1, v2, :cond_1

    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    iput v1, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 31
    .line 32
    iget-object v2, p0, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Ljava/lang/CharSequence;

    .line 35
    .line 36
    invoke-interface {v2, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget p0, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 45
    .line 46
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    filled-new-array {v0, p0, v1}, [Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    sget-object v0, Lyyds/ᛳᲁᲁᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛳᲇᲀᲀ;

    .line 55
    .line 56
    const-string v2, "JsonLiteral from {} to {} -> [{}]"

    .line 57
    .line 58
    invoke-interface {v0, v2, p0}, Lyyds/ᛳᲇᲀᲀ;->ᛶᛷᛲᲁ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    new-instance p0, Lyyds/ᛶᛴᛲᲇ;

    .line 62
    .line 63
    invoke-direct {p0, v1}, Lyyds/ᛶᛴᛲᲇ;-><init>(Ljava/lang/CharSequence;)V

    .line 64
    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_1
    const-string v0, "String not closed. Expected \' in "

    .line 68
    .line 69
    invoke-static {p0, v0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᲇᲇᛱ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const/4 p0, 0x0

    .line 73
    return-object p0
.end method

.method public final ᲇᲇᲇᛱ()Lyyds/ᲈᛷᛶᛶ;
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛳᲁᲁᛵ;->ᛲᲈᲁ:Lyyds/ᛲᛷᛴᛵ;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lyyds/ᛳᲁᲁᛵ;->ᲇᲈᛵᛷ()Lyyds/ᲈᛷᛶᛶ;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    :goto_0
    iget v2, v0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 16
    .line 17
    const-string v3, "||"

    .line 18
    .line 19
    invoke-virtual {v0, v3}, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Lyyds/ᛳᲁᲁᛵ;->ᲇᲈᛵᛷ()Lyyds/ᲈᛷᛶᛶ;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iput v2, v0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 34
    .line 35
    const/4 p0, 0x1

    .line 36
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-ne p0, v0, :cond_1

    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Lyyds/ᲈᛷᛶᛶ;

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_1
    new-instance p0, Lyyds/ᛷᛳᲀ;

    .line 51
    .line 52
    const/4 v0, 0x3

    .line 53
    invoke-direct {p0, v0, v1}, Lyyds/ᛷᛳᲀ;-><init>(ILjava/util/ArrayList;)V

    .line 54
    .line 55
    .line 56
    return-object p0
.end method

.method public final ᲇᲈᛵᛷ()Lyyds/ᲈᛷᛶᛶ;
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛳᲁᲁᛵ;->ᛲᲈᲁ:Lyyds/ᛲᛷᛴᛵ;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lyyds/ᛳᲁᲁᛵ;->ᛲᛴᛳᛲ()Lyyds/ᲈᛷᛶᛶ;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    :goto_0
    iget v2, v0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 16
    .line 17
    const-string v3, "&&"

    .line 18
    .line 19
    invoke-virtual {v0, v3}, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Lyyds/ᛳᲁᲁᛵ;->ᛲᛴᛳᛲ()Lyyds/ᲈᛷᛶᛶ;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iput v2, v0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    const/4 v0, 0x1

    .line 40
    if-ne v0, p0, :cond_1

    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Lyyds/ᲈᛷᛶᛶ;

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_1
    new-instance p0, Lyyds/ᛷᛳᲀ;

    .line 51
    .line 52
    invoke-direct {p0, v0, v1}, Lyyds/ᛷᛳᲀ;-><init>(ILjava/util/ArrayList;)V

    .line 53
    .line 54
    .line 55
    return-object p0
.end method
