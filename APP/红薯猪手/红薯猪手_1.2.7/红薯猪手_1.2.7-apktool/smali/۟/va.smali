.class public L۟/va;
.super L۟/ta;
.source "SourceFile"


# direct methods
.method public static ۥۡ۟(Ljava/lang/CharSequence;Ljava/lang/String;)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {v0, p0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "other"

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x1

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v2, v1}, L۟/va;->ۥۡۢ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result p0

    if-ltz p0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    return v0
.end method

.method public static final ۥۡ۠(Ljava/lang/CharSequence;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {v0, p0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    return p0
.end method

.method public static final ۥۡۡ(ILjava/lang/CharSequence;Ljava/lang/String;Z)I
    .locals 9

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "string"

    .line 7
    .line 8
    invoke-static {v0, p2}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    if-nez p3, :cond_1

    .line 12
    .line 13
    instance-of v0, p1, Ljava/lang/String;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    check-cast p1, Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p1, p2, p0}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    goto :goto_3

    .line 25
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v1, -0x1

    .line 30
    const/4 v2, 0x0

    .line 31
    new-instance v3, L۟/g4;

    .line 32
    .line 33
    if-gez p0, :cond_2

    .line 34
    .line 35
    move p0, v2

    .line 36
    :cond_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-le v0, v2, :cond_3

    .line 41
    .line 42
    move v0, v2

    .line 43
    :cond_3
    invoke-direct {v3, p0, v0}, L۟/g4;-><init>(II)V

    .line 44
    .line 45
    .line 46
    instance-of v0, p1, Ljava/lang/String;

    .line 47
    .line 48
    if-eqz v0, :cond_7

    .line 49
    .line 50
    iget v0, v3, L۟/e4;->ۥ۟:I

    .line 51
    .line 52
    iget v2, v3, L۟/e4;->ۥ۟۟:I

    .line 53
    .line 54
    if-lez v2, :cond_4

    .line 55
    .line 56
    if-le p0, v0, :cond_5

    .line 57
    .line 58
    :cond_4
    if-gez v2, :cond_b

    .line 59
    .line 60
    if-gt v0, p0, :cond_b

    .line 61
    .line 62
    :cond_5
    :goto_1
    const/4 v4, 0x0

    .line 63
    move-object v5, p1

    .line 64
    check-cast v5, Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    move-object v3, p2

    .line 71
    move v6, p0

    .line 72
    move v8, p3

    .line 73
    invoke-static/range {v3 .. v8}, L۟/ta;->ۥ۠ۧ(Ljava/lang/String;ILjava/lang/String;IIZ)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_6

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_6
    if-eq p0, v0, :cond_b

    .line 81
    .line 82
    add-int/2addr p0, v2

    .line 83
    goto :goto_1

    .line 84
    :cond_7
    iget v0, v3, L۟/e4;->ۥ۟:I

    .line 85
    .line 86
    iget v2, v3, L۟/e4;->ۥ۟۟:I

    .line 87
    .line 88
    if-lez v2, :cond_8

    .line 89
    .line 90
    if-le p0, v0, :cond_9

    .line 91
    .line 92
    :cond_8
    if-gez v2, :cond_b

    .line 93
    .line 94
    if-gt v0, p0, :cond_b

    .line 95
    .line 96
    :cond_9
    :goto_2
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    invoke-static {p2, p1, p0, v3, p3}, L۟/va;->ۥۣۡ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZ)Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_a

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_a
    if-eq p0, v0, :cond_b

    .line 108
    .line 109
    add-int/2addr p0, v2

    .line 110
    goto :goto_2

    .line 111
    :cond_b
    move p0, v1

    .line 112
    :goto_3
    return p0
.end method

.method public static synthetic ۥۡۢ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I
    .locals 2

    and-int/lit8 v0, p4, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move p2, v1

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move p3, v1

    :cond_1
    invoke-static {p2, p0, p1, p3}, L۟/va;->ۥۡۡ(ILjava/lang/CharSequence;Ljava/lang/String;Z)I

    move-result p0

    return p0
.end method

.method public static final ۥۣۡ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZ)Z
    .locals 5

    const-string v0, "<this>"

    invoke-static {v0, p0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "other"

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-ltz p2, :cond_7

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    sub-int/2addr v1, p3

    if-ltz v1, :cond_7

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    sub-int/2addr v1, p3

    if-le p2, v1, :cond_0

    goto :goto_3

    :cond_0
    move v1, v0

    :goto_0
    const/4 v2, 0x1

    if-ge v1, p3, :cond_6

    add-int v3, v0, v1

    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    add-int v4, p2, v1

    invoke-interface {p1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    if-ne v3, v4, :cond_1

    goto :goto_2

    :cond_1
    if-nez p4, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v3}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v3

    invoke-static {v4}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v4

    if-eq v3, v4, :cond_4

    invoke-static {v3}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v3

    invoke-static {v4}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v4

    if-ne v3, v4, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    move v2, v0

    :cond_4
    :goto_2
    if-nez v2, :cond_5

    return v0

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_6
    return v2

    :cond_7
    :goto_3
    return v0
.end method

.method public static final ۥۡۤ(I)V
    .locals 2

    if-ltz p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Limit must be non-negative, but was "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۥۡۥ(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;
    .locals 5

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {v0, p0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    array-length v0, p1

    .line 7
    const/4 v1, 0x1

    .line 8
    const/16 v2, 0xa

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-ne v0, v1, :cond_3

    .line 12
    .line 13
    aget-object v0, p1, v3

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-nez v4, :cond_0

    .line 20
    .line 21
    move v4, v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v4, v3

    .line 24
    :goto_0
    if-nez v4, :cond_3

    .line 25
    .line 26
    invoke-static {v3}, L۟/va;->ۥۡۤ(I)V

    .line 27
    .line 28
    .line 29
    invoke-static {v3, p0, v0, v3}, L۟/va;->ۥۡۡ(ILjava/lang/CharSequence;Ljava/lang/String;Z)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const/4 v1, -0x1

    .line 34
    if-eq p1, v1, :cond_2

    .line 35
    .line 36
    new-instance v4, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 39
    .line 40
    .line 41
    move v2, v3

    .line 42
    :cond_1
    invoke-interface {p0, v2, p1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    add-int/2addr v2, p1

    .line 58
    invoke-static {v2, p0, v0, v3}, L۟/va;->ۥۡۡ(ILjava/lang/CharSequence;Ljava/lang/String;Z)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-ne p1, v1, :cond_1

    .line 63
    .line 64
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    invoke-interface {p0, v2, p1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {v4, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-static {p0}, L۟/jb;->ۥ۟ۦ(Ljava/lang/Object;)Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    goto :goto_2

    .line 89
    :cond_3
    invoke-static {v3}, L۟/va;->ۥۡۤ(I)V

    .line 90
    .line 91
    .line 92
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    const-string v0, "asList(...)"

    .line 97
    .line 98
    invoke-static {v0, p1}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    new-instance v0, L۟/k1;

    .line 102
    .line 103
    new-instance v4, L۟/ua;

    .line 104
    .line 105
    invoke-direct {v4, p1, v3}, L۟/ua;-><init>(Ljava/util/List;Z)V

    .line 106
    .line 107
    .line 108
    invoke-direct {v0, p0, v3, v3, v4}, L۟/k1;-><init>(Ljava/lang/CharSequence;IIL۟/ua;)V

    .line 109
    .line 110
    .line 111
    new-instance p1, L۟/aa;

    .line 112
    .line 113
    invoke-direct {p1, v0}, L۟/aa;-><init>(L۟/k1;)V

    .line 114
    .line 115
    .line 116
    new-instance v4, Ljava/util/ArrayList;

    .line 117
    .line 118
    instance-of v0, p1, Ljava/util/Collection;

    .line 119
    .line 120
    if-eqz v0, :cond_4

    .line 121
    .line 122
    move-object v0, p1

    .line 123
    check-cast v0, Ljava/util/Collection;

    .line 124
    .line 125
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    :cond_4
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1}, L۟/aa;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_5

    .line 141
    .line 142
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    check-cast v0, L۟/g4;

    .line 147
    .line 148
    const-string v2, "range"

    .line 149
    .line 150
    invoke-static {v2, v0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    iget v2, v0, L۟/e4;->ۥ:I

    .line 154
    .line 155
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    iget v0, v0, L۟/e4;->ۥ۟:I

    .line 164
    .line 165
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    add-int/2addr v0, v1

    .line 174
    invoke-interface {p0, v2, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_5
    :goto_2
    return-object v4
.end method

.method public static final ۥۡۦ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 7

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {v0, p0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    sub-int/2addr v0, v1

    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v2

    .line 14
    move v4, v3

    .line 15
    :goto_0
    if-gt v3, v0, :cond_6

    .line 16
    .line 17
    if-nez v4, :cond_0

    .line 18
    .line 19
    move v5, v3

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    move v5, v0

    .line 22
    :goto_1
    invoke-interface {p0, v5}, Ljava/lang/CharSequence;->charAt(I)C

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    invoke-static {v5}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-nez v6, :cond_2

    .line 31
    .line 32
    invoke-static {v5}, Ljava/lang/Character;->isSpaceChar(C)Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-eqz v5, :cond_1

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_1
    move v5, v2

    .line 40
    goto :goto_3

    .line 41
    :cond_2
    :goto_2
    move v5, v1

    .line 42
    :goto_3
    if-nez v4, :cond_4

    .line 43
    .line 44
    if-nez v5, :cond_3

    .line 45
    .line 46
    move v4, v1

    .line 47
    goto :goto_0

    .line 48
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_4
    if-nez v5, :cond_5

    .line 52
    .line 53
    goto :goto_4

    .line 54
    :cond_5
    add-int/lit8 v0, v0, -0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_6
    :goto_4
    add-int/2addr v0, v1

    .line 58
    invoke-interface {p0, v3, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method
