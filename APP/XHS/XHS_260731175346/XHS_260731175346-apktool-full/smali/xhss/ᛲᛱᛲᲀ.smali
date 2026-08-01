.class public abstract Lxhss/ᛲᛱᛲᲀ;
.super Lxhss/ᛲᲈᛷᛸ;


# direct methods
.method public static final ᛱᛱᲈᲀ(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/util/List;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, v0, v0}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛷᛵᛴ(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, -0x1

    .line 7
    if-eq v1, v2, :cond_1

    .line 8
    .line 9
    new-instance v3, Ljava/util/ArrayList;

    .line 10
    .line 11
    const/16 v4, 0xa

    .line 12
    .line 13
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    move v4, v0

    .line 17
    :cond_0
    invoke-interface {p0, v4, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    add-int/2addr v4, v1

    .line 33
    invoke-static {p0, p1, v4, v0}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛷᛵᛴ(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-ne v1, v2, :cond_0

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-interface {p0, v4, p1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    return-object v3

    .line 55
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method

.method public static ᛱᛲᛸᲇ(Ljava/lang/CharSequence;C)Z
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p0, p1, v1, v0}, Lxhss/ᛲᛱᛲᲀ;->ᛷᛸᛷ(Ljava/lang/CharSequence;CII)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-ltz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    return v1
.end method

.method public static ᛱᲁᛳᛲ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z
    .locals 13

    .line 1
    instance-of v1, p1, Ljava/lang/String;

    .line 2
    .line 3
    const/4 v9, 0x0

    .line 4
    const/4 v10, 0x1

    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    check-cast v0, Ljava/lang/String;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-static {p0, v0, v9, p2, v1}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-ltz v0, :cond_b

    .line 16
    .line 17
    goto/16 :goto_4

    .line 18
    .line 19
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    new-instance v5, Lxhss/ᛱᛲᲇᲀ;

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-le v3, v6, :cond_1

    .line 30
    .line 31
    move v3, v6

    .line 32
    :cond_1
    invoke-direct {v5, v9, v3, v10}, Lxhss/ᲁᛵᛶᲁ;-><init>(III)V

    .line 33
    .line 34
    .line 35
    instance-of v3, p0, Ljava/lang/String;

    .line 36
    .line 37
    iget v11, v5, Lxhss/ᲁᛵᛶᲁ;->ᲇᛴᲇᛵ:I

    .line 38
    .line 39
    iget v12, v5, Lxhss/ᲁᛵᛶᲁ;->ᛳᲁᲇᛸ:I

    .line 40
    .line 41
    if-eqz v3, :cond_6

    .line 42
    .line 43
    if-eqz v1, :cond_6

    .line 44
    .line 45
    if-lez v11, :cond_2

    .line 46
    .line 47
    if-gez v12, :cond_3

    .line 48
    .line 49
    :cond_2
    if-gez v11, :cond_a

    .line 50
    .line 51
    if-gtz v12, :cond_a

    .line 52
    .line 53
    :cond_3
    move v7, v9

    .line 54
    :goto_0
    move-object v3, p1

    .line 55
    check-cast v3, Ljava/lang/String;

    .line 56
    .line 57
    move-object v6, p0

    .line 58
    check-cast v6, Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    const/4 v5, 0x0

    .line 65
    if-nez p2, :cond_4

    .line 66
    .line 67
    invoke-virtual {v3, v5, v6, v7, v8}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    goto :goto_1

    .line 72
    :cond_4
    move v4, p2

    .line 73
    invoke-virtual/range {v3 .. v8}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    :goto_1
    if-eqz v1, :cond_5

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_5
    if-eq v7, v12, :cond_a

    .line 81
    .line 82
    add-int/2addr v7, v11

    .line 83
    goto :goto_0

    .line 84
    :cond_6
    if-lez v11, :cond_7

    .line 85
    .line 86
    if-gez v12, :cond_8

    .line 87
    .line 88
    :cond_7
    if-gez v11, :cond_a

    .line 89
    .line 90
    if-gtz v12, :cond_a

    .line 91
    .line 92
    :cond_8
    move v3, v9

    .line 93
    :goto_2
    const/4 v1, 0x0

    .line 94
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    move-object v2, p0

    .line 99
    move-object v0, p1

    .line 100
    move v5, p2

    .line 101
    invoke-static/range {v0 .. v5}, Lxhss/ᛲᛱᛲᲀ;->ᲇᛸᛶ(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_9

    .line 106
    .line 107
    move v7, v3

    .line 108
    goto :goto_3

    .line 109
    :cond_9
    if-eq v3, v12, :cond_a

    .line 110
    .line 111
    add-int/2addr v3, v11

    .line 112
    goto :goto_2

    .line 113
    :cond_a
    const/4 v7, -0x1

    .line 114
    :goto_3
    if-ltz v7, :cond_b

    .line 115
    .line 116
    :goto_4
    return v10

    .line 117
    :cond_b
    return v9
.end method

.method public static ᛲᛵᲁᲁ(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x8

    .line 6
    .line 7
    if-gt v1, v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    sub-int/2addr v1, v2

    .line 29
    const/4 v2, 0x1

    .line 30
    if-gt v2, v1, :cond_1

    .line 31
    .line 32
    :goto_0
    const/16 v3, 0x30

    .line 33
    .line 34
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    if-eq v2, v1, :cond_1

    .line 38
    .line 39
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    move-object p0, v0

    .line 46
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method public static varargs ᛲᲀᲇᛳ(Ljava/lang/String;[C)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    sub-int/2addr v0, v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-gt v2, v0, :cond_4

    .line 10
    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    move v4, v2

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    move v4, v0

    .line 16
    :goto_1
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    invoke-static {p1, v4}, Lxhss/ᛲᛷᲁᲁ;->ᛸᛶᲈᛶ([CC)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-nez v3, :cond_2

    .line 25
    .line 26
    if-nez v4, :cond_1

    .line 27
    .line 28
    move v3, v1

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    if-nez v4, :cond_3

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_3
    add-int/lit8 v0, v0, -0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_4
    :goto_2
    add-int/2addr v0, v1

    .line 40
    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method

.method public static ᛴᛴᛲᛸ(Ljava/lang/CharSequence;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v1, v2, :cond_2

    .line 8
    .line 9
    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {v2}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    invoke-static {v2}, Ljava/lang/Character;->isSpaceChar(C)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    return v0

    .line 27
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    const/4 p0, 0x1

    .line 31
    return p0
.end method

.method public static final ᛴᛷᛵᛴ(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I
    .locals 11

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    instance-of v3, p0, Ljava/lang/String;

    .line 4
    .line 5
    if-nez v3, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move-object v2, p0

    .line 9
    check-cast v2, Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v2, p1, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0

    .line 16
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    new-instance v4, Lxhss/ᛱᛲᲇᲀ;

    .line 21
    .line 22
    if-gez p2, :cond_2

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    goto :goto_1

    .line 26
    :cond_2
    move v1, p2

    .line 27
    :goto_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-le v3, v5, :cond_3

    .line 32
    .line 33
    move v3, v5

    .line 34
    :cond_3
    const/4 v5, 0x1

    .line 35
    invoke-direct {v4, v1, v3, v5}, Lxhss/ᲁᛵᛶᲁ;-><init>(III)V

    .line 36
    .line 37
    .line 38
    instance-of v3, p0, Ljava/lang/String;

    .line 39
    .line 40
    iget v9, v4, Lxhss/ᲁᛵᛶᲁ;->ᲇᛴᲇᛵ:I

    .line 41
    .line 42
    iget v10, v4, Lxhss/ᲁᛵᛶᲁ;->ᛳᲁᲇᛸ:I

    .line 43
    .line 44
    if-eqz v3, :cond_8

    .line 45
    .line 46
    if-lez v9, :cond_4

    .line 47
    .line 48
    if-le v1, v10, :cond_5

    .line 49
    .line 50
    :cond_4
    if-gez v9, :cond_c

    .line 51
    .line 52
    if-gt v10, v1, :cond_c

    .line 53
    .line 54
    :cond_5
    move v7, v1

    .line 55
    :goto_2
    move-object v6, p0

    .line 56
    check-cast v6, Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    const/4 v5, 0x0

    .line 63
    if-nez p3, :cond_6

    .line 64
    .line 65
    invoke-virtual {p1, v5, v6, v7, v8}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    goto :goto_3

    .line 70
    :cond_6
    move-object v3, p1

    .line 71
    move v4, p3

    .line 72
    invoke-virtual/range {v3 .. v8}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    :goto_3
    if-eqz v1, :cond_7

    .line 77
    .line 78
    return v7

    .line 79
    :cond_7
    if-eq v7, v10, :cond_c

    .line 80
    .line 81
    add-int/2addr v7, v9

    .line 82
    goto :goto_2

    .line 83
    :cond_8
    if-lez v9, :cond_9

    .line 84
    .line 85
    if-le v1, v10, :cond_a

    .line 86
    .line 87
    :cond_9
    if-gez v9, :cond_c

    .line 88
    .line 89
    if-gt v10, v1, :cond_c

    .line 90
    .line 91
    :cond_a
    move v3, v1

    .line 92
    :goto_4
    const/4 v1, 0x0

    .line 93
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    move-object v2, p0

    .line 98
    move-object v0, p1

    .line 99
    move v5, p3

    .line 100
    invoke-static/range {v0 .. v5}, Lxhss/ᛲᛱᛲᲀ;->ᲇᛸᛶ(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_b

    .line 105
    .line 106
    return v3

    .line 107
    :cond_b
    if-eq v3, v10, :cond_c

    .line 108
    .line 109
    add-int/2addr v3, v9

    .line 110
    goto :goto_4

    .line 111
    :cond_c
    const/4 v0, -0x1

    .line 112
    return v0
.end method

.method public static ᛴᲈᛳᛲ(Ljava/lang/String;[C)Ljava/util/List;
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    if-ne v0, v2, :cond_0

    .line 5
    .line 6
    aget-char p1, p1, v1

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p0, p1}, Lxhss/ᛲᛱᛲᲀ;->ᛱᛱᲈᲀ(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    new-instance v0, Lxhss/ᲀᛲᲇᛲ;

    .line 18
    .line 19
    new-instance v3, Lxhss/ᛲᛷᲁᛳ;

    .line 20
    .line 21
    invoke-direct {v3, v2, p1}, Lxhss/ᛲᛷᲁᛳ;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, v3, v1}, Lxhss/ᲀᛲᲇᛲ;-><init>(Ljava/lang/Object;Lxhss/ᲁᛳᲀᛴ;I)V

    .line 25
    .line 26
    .line 27
    new-instance p1, Lxhss/ᲀᛲᛴᛴ;

    .line 28
    .line 29
    invoke-direct {p1, v0}, Lxhss/ᲀᛲᛴᛴ;-><init>(Lxhss/ᲀᛲᲇᛲ;)V

    .line 30
    .line 31
    .line 32
    new-instance v0, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-static {p1}, Lxhss/ᛳᛲᲈᲁ;->ᲁᛴᛴᛸ(Ljava/lang/Iterable;)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lxhss/ᲀᛲᛴᛴ;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    :goto_0
    move-object v1, p1

    .line 46
    check-cast v1, Lxhss/ᲀᲀᲇᛵ;

    .line 47
    .line 48
    invoke-virtual {v1}, Lxhss/ᲀᲀᲇᛵ;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_1

    .line 53
    .line 54
    invoke-virtual {v1}, Lxhss/ᲀᲀᲇᛵ;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Lxhss/ᛱᛲᲇᲀ;

    .line 59
    .line 60
    iget v3, v1, Lxhss/ᲁᛵᛶᲁ;->ᛱᛱᛲᲇ:I

    .line 61
    .line 62
    iget v1, v1, Lxhss/ᲁᛵᛶᲁ;->ᛳᲁᲇᛸ:I

    .line 63
    .line 64
    add-int/2addr v1, v2

    .line 65
    invoke-virtual {p0, v3, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    return-object v0
.end method

.method public static final ᛴᲈᲀᲀ(Ljava/lang/CharSequence;)I
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    add-int/lit8 p0, p0, -0x1

    .line 6
    .line 7
    return p0
.end method

.method public static ᛵᛳᛸᲇ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 7

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    sub-int/2addr v0, v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    move v4, v3

    .line 10
    :goto_0
    if-gt v3, v0, :cond_6

    .line 11
    .line 12
    if-nez v4, :cond_0

    .line 13
    .line 14
    move v5, v3

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    move v5, v0

    .line 17
    :goto_1
    invoke-interface {p0, v5}, Ljava/lang/CharSequence;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    invoke-static {v5}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    if-nez v6, :cond_2

    .line 26
    .line 27
    invoke-static {v5}, Ljava/lang/Character;->isSpaceChar(C)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_1

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_1
    move v5, v2

    .line 35
    goto :goto_3

    .line 36
    :cond_2
    :goto_2
    move v5, v1

    .line 37
    :goto_3
    if-nez v4, :cond_4

    .line 38
    .line 39
    if-nez v5, :cond_3

    .line 40
    .line 41
    move v4, v1

    .line 42
    goto :goto_0

    .line 43
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_4
    if-nez v5, :cond_5

    .line 47
    .line 48
    goto :goto_4

    .line 49
    :cond_5
    add-int/lit8 v0, v0, -0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_6
    :goto_4
    add-int/2addr v0, v1

    .line 53
    invoke-interface {p0, v3, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0
.end method

.method public static ᛵᛴᛲᛵ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x6

    .line 6
    if-le v1, v0, :cond_0

    .line 7
    .line 8
    move v1, v0

    .line 9
    :cond_0
    sub-int/2addr v0, v1

    .line 10
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static ᛵᛸᲁᛸ(Ljava/lang/String;I)Ljava/lang/String;
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-le p1, v0, :cond_0

    .line 8
    .line 9
    move p1, v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_1
    const-string p0, "Requested character count "

    .line 17
    .line 18
    const-string v0, " is less than zero."

    .line 19
    .line 20
    invoke-static {p0, p1, v0}, Lxhss/ᛵᲈᲁᲈ;->ᛸᛷᲈᲈ(Ljava/lang/String;ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method

.method public static ᛵᲈᛱᛳ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, v0}, Lxhss/ᛲᲈᛷᛸ;->ᛱᛱᛴᲀ(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :cond_0
    return-object p0
.end method

.method public static synthetic ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I
    .locals 2

    .line 1
    and-int/lit8 v0, p4, 0x2

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p2, v1

    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    move p3, v1

    .line 12
    :cond_1
    invoke-static {p0, p1, p2, p3}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛷᛵᛴ(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public static ᛷᛸᛷ(Ljava/lang/CharSequence;CII)I
    .locals 1

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    move p2, v0

    .line 7
    :cond_0
    instance-of p3, p0, Ljava/lang/String;

    .line 8
    .line 9
    if-nez p3, :cond_1

    .line 10
    .line 11
    const/4 p3, 0x1

    .line 12
    new-array p3, p3, [C

    .line 13
    .line 14
    aput-char p1, p3, v0

    .line 15
    .line 16
    invoke-static {p0, p3, p2, v0}, Lxhss/ᛲᛱᛲᲀ;->ᲁᛲᲈᛵ(Ljava/lang/CharSequence;[CIZ)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :cond_1
    check-cast p0, Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->indexOf(II)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0
.end method

.method public static varargs ᲀᲁᲁᛲ(Ljava/lang/String;[C)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    if-ltz v0, :cond_2

    .line 8
    .line 9
    :goto_0
    add-int/lit8 v1, v0, -0x1

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-static {p1, v2}, Lxhss/ᛲᛷᲁᲁ;->ᛸᛶᲈᛶ([CC)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    goto :goto_2

    .line 29
    :cond_0
    if-gez v1, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v0, v1

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    :goto_1
    const-string p0, ""

    .line 35
    .line 36
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public static final ᲁᛲᲈᛵ(Ljava/lang/CharSequence;[CIZ)I
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p3, :cond_2

    .line 3
    .line 4
    array-length v1, p1

    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v1, v2, :cond_2

    .line 7
    .line 8
    instance-of v1, p0, Ljava/lang/String;

    .line 9
    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    array-length p3, p1

    .line 13
    if-eqz p3, :cond_1

    .line 14
    .line 15
    if-ne p3, v2, :cond_0

    .line 16
    .line 17
    aget-char p1, p1, v0

    .line 18
    .line 19
    check-cast p0, Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->indexOf(II)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_0
    const-string p0, "Array has more than one element."

    .line 27
    .line 28
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return v0

    .line 32
    :cond_1
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 33
    .line 34
    const-string p1, "Array is empty."

    .line 35
    .line 36
    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p0

    .line 40
    :cond_2
    if-gez p2, :cond_3

    .line 41
    .line 42
    move p2, v0

    .line 43
    :cond_3
    invoke-static {p0}, Lxhss/ᛲᛱᛲᲀ;->ᛴᲈᲀᲀ(Ljava/lang/CharSequence;)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-gt p2, v1, :cond_6

    .line 48
    .line 49
    :goto_0
    invoke-interface {p0, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    array-length v3, p1

    .line 54
    move v4, v0

    .line 55
    :goto_1
    if-ge v4, v3, :cond_5

    .line 56
    .line 57
    aget-char v5, p1, v4

    .line 58
    .line 59
    invoke-static {v5, v2, p3}, Lxhss/ᲁᛵᛸᛳ;->ᛳᲁᲇᛸ(CCZ)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_4

    .line 64
    .line 65
    return p2

    .line 66
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_5
    if-eq p2, v1, :cond_6

    .line 70
    .line 71
    add-int/lit8 p2, p2, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_6
    const/4 p0, -0x1

    .line 75
    return p0
.end method

.method public static final ᲇᛸᛶ(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p3, :cond_3

    .line 3
    .line 4
    if-ltz p1, :cond_3

    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    sub-int/2addr v1, p4

    .line 11
    if-gt p1, v1, :cond_3

    .line 12
    .line 13
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    sub-int/2addr v1, p4

    .line 18
    if-le p3, v1, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    move v1, v0

    .line 22
    :goto_0
    if-ge v1, p4, :cond_2

    .line 23
    .line 24
    add-int v2, p1, v1

    .line 25
    .line 26
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    add-int v3, p3, v1

    .line 31
    .line 32
    invoke-interface {p2, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-static {v2, v3, p5}, Lxhss/ᲁᛵᛸᛳ;->ᛳᲁᲇᛸ(CCZ)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    return v0

    .line 43
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/4 p0, 0x1

    .line 47
    return p0

    .line 48
    :cond_3
    :goto_1
    return v0
.end method

.method public static ᲈᛱᛷᛵ(Ljava/lang/CharSequence;CII)I
    .locals 2

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lxhss/ᛲᛱᛲᲀ;->ᛴᲈᲀᲀ(Ljava/lang/CharSequence;)I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    :cond_0
    instance-of p3, p0, Ljava/lang/String;

    .line 10
    .line 11
    if-nez p3, :cond_5

    .line 12
    .line 13
    const/4 p3, 0x1

    .line 14
    new-array p3, p3, [C

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    aput-char p1, p3, v0

    .line 18
    .line 19
    instance-of p1, p0, Ljava/lang/String;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    aget-char p1, p3, v0

    .line 24
    .line 25
    check-cast p0, Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->lastIndexOf(II)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0

    .line 32
    :cond_1
    invoke-static {p0}, Lxhss/ᛲᛱᛲᲀ;->ᛴᲈᲀᲀ(Ljava/lang/CharSequence;)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-le p2, p1, :cond_2

    .line 37
    .line 38
    move p2, p1

    .line 39
    :cond_2
    :goto_0
    const/4 p1, -0x1

    .line 40
    if-ge p1, p2, :cond_4

    .line 41
    .line 42
    invoke-interface {p0, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    aget-char v1, p3, v0

    .line 47
    .line 48
    invoke-static {v1, p1, v0}, Lxhss/ᲁᛵᛸᛳ;->ᛳᲁᲇᛸ(CCZ)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    return p2

    .line 55
    :cond_3
    add-int/lit8 p2, p2, -0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_4
    return p1

    .line 59
    :cond_5
    check-cast p0, Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->lastIndexOf(II)I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    return p0
.end method

.method public static ᲈᲈᲈ(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    if-ne v0, v2, :cond_1

    .line 5
    .line 6
    aget-object v0, p1, v1

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {p0, v0}, Lxhss/ᛲᛱᛲᲀ;->ᛱᛱᲈᲀ(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_1
    :goto_0
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    new-instance v0, Lxhss/ᲀᛲᲇᛲ;

    .line 25
    .line 26
    new-instance v3, Lxhss/ᛲᛷᲁᛳ;

    .line 27
    .line 28
    invoke-direct {v3, v1, p1}, Lxhss/ᛲᛷᲁᛳ;-><init>(ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, p0, v3, v1}, Lxhss/ᲀᛲᲇᛲ;-><init>(Ljava/lang/Object;Lxhss/ᲁᛳᲀᛴ;I)V

    .line 32
    .line 33
    .line 34
    new-instance p1, Lxhss/ᲀᛲᛴᛴ;

    .line 35
    .line 36
    invoke-direct {p1, v0}, Lxhss/ᲀᛲᛴᛴ;-><init>(Lxhss/ᲀᛲᲇᛲ;)V

    .line 37
    .line 38
    .line 39
    new-instance v0, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-static {p1}, Lxhss/ᛳᛲᲈᲁ;->ᲁᛴᛴᛸ(Ljava/lang/Iterable;)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lxhss/ᲀᛲᛴᛴ;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :goto_1
    move-object v1, p1

    .line 53
    check-cast v1, Lxhss/ᲀᲀᲇᛵ;

    .line 54
    .line 55
    invoke-virtual {v1}, Lxhss/ᲀᲀᲇᛵ;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    invoke-virtual {v1}, Lxhss/ᲀᲀᲇᛵ;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Lxhss/ᛱᛲᲇᲀ;

    .line 66
    .line 67
    iget v3, v1, Lxhss/ᲁᛵᛶᲁ;->ᛱᛱᛲᲇ:I

    .line 68
    .line 69
    iget v1, v1, Lxhss/ᲁᛵᛶᲁ;->ᛳᲁᲇᛸ:I

    .line 70
    .line 71
    add-int/2addr v1, v2

    .line 72
    invoke-virtual {p0, v3, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    return-object v0
.end method
