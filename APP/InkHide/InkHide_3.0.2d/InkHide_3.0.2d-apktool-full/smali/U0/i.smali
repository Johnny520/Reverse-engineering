.class public abstract LU0/i;
.super LU0/q;


# direct methods
.method public static A0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, LU0/i;->m0(Ljava/lang/CharSequence;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "-"

    .line 6
    .line 7
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x1

    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string p1, "substring(...)"

    .line 21
    .line 22
    invoke-static {p0, p1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object p0
.end method

.method public static B0(ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-ltz p0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-le p0, v0, :cond_0

    .line 13
    .line 14
    move p0, v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p1, v0, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string p1, "substring(...)"

    .line 21
    .line 22
    invoke-static {p0, p1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v0, "Requested character count "

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string p0, " is less than zero."

    .line 37
    .line 38
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1
.end method

.method public static C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 5

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

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
    :goto_0
    if-gt v2, v0, :cond_4

    .line 15
    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    move v4, v2

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    move v4, v0

    .line 21
    :goto_1
    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-static {v4}, LD/h;->D(C)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-nez v3, :cond_2

    .line 30
    .line 31
    if-nez v4, :cond_1

    .line 32
    .line 33
    move v3, v1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    if-nez v4, :cond_3

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_3
    add-int/lit8 v0, v0, -0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    :goto_2
    add-int/2addr v0, v1

    .line 45
    invoke-interface {p0, v2, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

.method public static D0(Ljava/lang/String;)Ljava/lang/CharSequence;
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
    invoke-static {v2}, LD/h;->D(C)Z

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
    const/4 v1, 0x0

    .line 24
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

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
    return-object p0
.end method

.method public static varargs E0(Ljava/lang/String;[C)Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, -0x1

    .line 11
    add-int/2addr v0, v1

    .line 12
    if-ltz v0, :cond_5

    .line 13
    .line 14
    :goto_0
    add-int/lit8 v2, v0, -0x1

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    array-length v4, p1

    .line 21
    const/4 v5, 0x0

    .line 22
    move v6, v5

    .line 23
    :goto_1
    if-ge v6, v4, :cond_1

    .line 24
    .line 25
    aget-char v7, p1, v6

    .line 26
    .line 27
    if-ne v3, v7, :cond_0

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v6, v1

    .line 34
    :goto_2
    const/4 v3, 0x1

    .line 35
    if-ltz v6, :cond_2

    .line 36
    .line 37
    move v4, v3

    .line 38
    goto :goto_3

    .line 39
    :cond_2
    move v4, v5

    .line 40
    :goto_3
    if-nez v4, :cond_3

    .line 41
    .line 42
    add-int/2addr v0, v3

    .line 43
    invoke-virtual {p0, v5, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    goto :goto_5

    .line 48
    :cond_3
    if-gez v2, :cond_4

    .line 49
    .line 50
    goto :goto_4

    .line 51
    :cond_4
    move v0, v2

    .line 52
    goto :goto_0

    .line 53
    :cond_5
    :goto_4
    const-string p0, ""

    .line 54
    .line 55
    :goto_5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method

.method public static F0(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-static {v2}, LD/h;->D(C)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const-string p0, ""

    .line 31
    .line 32
    return-object p0
.end method

.method public static i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "other"

    .line 7
    .line 8
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-static {p0, p1, v1, p2, v0}, LU0/i;->p0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-ltz p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    return v1
.end method

.method public static j0(Ljava/lang/String;C)Z
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p0, p1, v1, v0}, LU0/i;->o0(Ljava/lang/CharSequence;CII)I

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

.method public static k0(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

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
    if-gez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    :cond_0
    invoke-static {v0, p0}, LU0/i;->B0(ILjava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static l0(Ljava/lang/String;)Ljava/lang/Character;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public static final m0(Ljava/lang/CharSequence;)I
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    add-int/lit8 p0, p0, -0x1

    .line 11
    .line 12
    return p0
.end method

.method public static final n0(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I
    .locals 12

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "string"

    .line 7
    .line 8
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-nez p3, :cond_1

    .line 12
    .line 13
    instance-of v0, p0, Ljava/lang/String;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    check-cast p0, Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0

    .line 25
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v1, -0x1

    .line 30
    const/4 v2, 0x0

    .line 31
    new-instance v3, LR0/c;

    .line 32
    .line 33
    if-gez p2, :cond_2

    .line 34
    .line 35
    move p2, v2

    .line 36
    :cond_2
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

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
    const/4 v2, 0x1

    .line 44
    invoke-direct {v3, p2, v0, v2}, LR0/a;-><init>(III)V

    .line 45
    .line 46
    .line 47
    instance-of p2, p0, Ljava/lang/String;

    .line 48
    .line 49
    iget v0, v3, LR0/a;->c:I

    .line 50
    .line 51
    iget v2, v3, LR0/a;->b:I

    .line 52
    .line 53
    iget v3, v3, LR0/a;->a:I

    .line 54
    .line 55
    if-eqz p2, :cond_7

    .line 56
    .line 57
    if-eqz p1, :cond_7

    .line 58
    .line 59
    if-lez v0, :cond_4

    .line 60
    .line 61
    if-le v3, v2, :cond_5

    .line 62
    .line 63
    :cond_4
    if-gez v0, :cond_b

    .line 64
    .line 65
    if-gt v2, v3, :cond_b

    .line 66
    .line 67
    :cond_5
    move v5, v3

    .line 68
    :goto_1
    move-object v8, p0

    .line 69
    check-cast v8, Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    const/4 v4, 0x0

    .line 76
    move-object v7, p1

    .line 77
    move v9, p3

    .line 78
    invoke-static/range {v4 .. v9}, LU0/q;->e0(IIILjava/lang/String;Ljava/lang/String;Z)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    move-object v6, v7

    .line 83
    if-eqz p1, :cond_6

    .line 84
    .line 85
    move v1, v5

    .line 86
    goto :goto_3

    .line 87
    :cond_6
    if-eq v5, v2, :cond_b

    .line 88
    .line 89
    add-int/2addr v5, v0

    .line 90
    move-object p1, v6

    .line 91
    move p3, v9

    .line 92
    goto :goto_1

    .line 93
    :cond_7
    move-object v6, p1

    .line 94
    move v9, p3

    .line 95
    if-lez v0, :cond_8

    .line 96
    .line 97
    if-le v3, v2, :cond_9

    .line 98
    .line 99
    :cond_8
    if-gez v0, :cond_b

    .line 100
    .line 101
    if-gt v2, v3, :cond_b

    .line 102
    .line 103
    :cond_9
    :goto_2
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 104
    .line 105
    .line 106
    move-result v10

    .line 107
    const/4 v7, 0x0

    .line 108
    move-object v8, p0

    .line 109
    move v11, v9

    .line 110
    move v9, v3

    .line 111
    invoke-static/range {v6 .. v11}, LU0/i;->s0(Ljava/lang/String;ILjava/lang/CharSequence;IIZ)Z

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    move v9, v11

    .line 116
    if-eqz p0, :cond_a

    .line 117
    .line 118
    move v1, v3

    .line 119
    goto :goto_3

    .line 120
    :cond_a
    if-eq v3, v2, :cond_b

    .line 121
    .line 122
    add-int/2addr v3, v0

    .line 123
    move-object p0, v8

    .line 124
    goto :goto_2

    .line 125
    :cond_b
    :goto_3
    return v1
.end method

.method public static o0(Ljava/lang/CharSequence;CII)I
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
    const-string p3, "<this>"

    .line 8
    .line 9
    invoke-static {p0, p3}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    instance-of p3, p0, Ljava/lang/String;

    .line 13
    .line 14
    if-nez p3, :cond_1

    .line 15
    .line 16
    const/4 p3, 0x1

    .line 17
    new-array p3, p3, [C

    .line 18
    .line 19
    aput-char p1, p3, v0

    .line 20
    .line 21
    invoke-static {p0, p3, p2, v0}, LU0/i;->q0(Ljava/lang/CharSequence;[CIZ)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_1
    check-cast p0, Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->indexOf(II)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0
.end method

.method public static synthetic p0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I
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
    invoke-static {p0, p1, p2, p3}, LU0/i;->n0(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public static final q0(Ljava/lang/CharSequence;[CIZ)I
    .locals 8

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    if-nez p3, :cond_2

    .line 8
    .line 9
    array-length v1, p1

    .line 10
    if-ne v1, v0, :cond_2

    .line 11
    .line 12
    instance-of v1, p0, Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    array-length p3, p1

    .line 17
    if-eqz p3, :cond_1

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    if-ne p3, v0, :cond_0

    .line 21
    .line 22
    const/4 p3, 0x0

    .line 23
    aget-char p1, p1, p3

    .line 24
    .line 25
    check-cast p0, Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->indexOf(II)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0

    .line 32
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    const-string p1, "Array has more than one element."

    .line 35
    .line 36
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p0

    .line 40
    :cond_1
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 41
    .line 42
    const-string p1, "Array is empty."

    .line 43
    .line 44
    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p0

    .line 48
    :cond_2
    new-instance v1, LR0/c;

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    if-gez p2, :cond_3

    .line 52
    .line 53
    move p2, v2

    .line 54
    :cond_3
    invoke-static {p0}, LU0/i;->m0(Ljava/lang/CharSequence;)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    invoke-direct {v1, p2, v3, v0}, LR0/a;-><init>(III)V

    .line 59
    .line 60
    .line 61
    iget v1, v1, LR0/a;->b:I

    .line 62
    .line 63
    if-gt p2, v1, :cond_4

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_4
    move v0, v2

    .line 67
    :goto_0
    if-eqz v0, :cond_5

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_5
    move p2, v1

    .line 71
    :goto_1
    if-eqz v0, :cond_a

    .line 72
    .line 73
    if-ne p2, v1, :cond_7

    .line 74
    .line 75
    if-eqz v0, :cond_6

    .line 76
    .line 77
    move v3, p2

    .line 78
    move v0, v2

    .line 79
    goto :goto_2

    .line 80
    :cond_6
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 81
    .line 82
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 83
    .line 84
    .line 85
    throw p0

    .line 86
    :cond_7
    add-int/lit8 v3, p2, 0x1

    .line 87
    .line 88
    :goto_2
    invoke-interface {p0, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    array-length v5, p1

    .line 93
    move v6, v2

    .line 94
    :goto_3
    if-ge v6, v5, :cond_9

    .line 95
    .line 96
    aget-char v7, p1, v6

    .line 97
    .line 98
    invoke-static {v7, v4, p3}, LD/h;->k(CCZ)Z

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    if-eqz v7, :cond_8

    .line 103
    .line 104
    return p2

    .line 105
    :cond_8
    add-int/lit8 v6, v6, 0x1

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_9
    move p2, v3

    .line 109
    goto :goto_1

    .line 110
    :cond_a
    const/4 p0, -0x1

    .line 111
    return p0
.end method

.method public static r0(Ljava/lang/String;)I
    .locals 2

    .line 1
    invoke-static {p0}, LU0/i;->m0(Ljava/lang/CharSequence;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "<this>"

    .line 6
    .line 7
    invoke-static {p0, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/16 v1, 0x2e

    .line 11
    .line 12
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->lastIndexOf(II)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public static final s0(Ljava/lang/String;ILjava/lang/CharSequence;IIZ)Z
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "other"

    .line 7
    .line 8
    invoke-static {p2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-ltz p3, :cond_3

    .line 13
    .line 14
    if-ltz p1, :cond_3

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    sub-int/2addr v1, p4

    .line 21
    if-gt p1, v1, :cond_3

    .line 22
    .line 23
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    sub-int/2addr v1, p4

    .line 28
    if-le p3, v1, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    move v1, v0

    .line 32
    :goto_0
    if-ge v1, p4, :cond_2

    .line 33
    .line 34
    add-int v2, p1, v1

    .line 35
    .line 36
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int v3, p3, v1

    .line 41
    .line 42
    invoke-interface {p2, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    invoke-static {v2, v3, p5}, LD/h;->k(CCZ)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    const/4 p0, 0x1

    .line 57
    return p0

    .line 58
    :cond_3
    :goto_1
    return v0
.end method

.method public static t0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-static {p0, v0, p1}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "substring(...)"

    .line 22
    .line 23
    invoke-static {p0, p1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-object p0
.end method

.method public static u0(Ljava/lang/String;[C)Ljava/util/List;
    .locals 5

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    array-length v0, p1

    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, v1, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    aget-char p1, p1, v0

    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p0, p1, v0, v0}, LU0/i;->n0(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, -0x1

    .line 22
    if-eq v1, v2, :cond_1

    .line 23
    .line 24
    new-instance v3, Ljava/util/ArrayList;

    .line 25
    .line 26
    const/16 v4, 0xa

    .line 27
    .line 28
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    move v4, v0

    .line 32
    :cond_0
    invoke-virtual {p0, v4, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    add-int/2addr v4, v1

    .line 48
    invoke-static {p0, p1, v4, v0}, LU0/i;->n0(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-ne v1, v2, :cond_0

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    invoke-virtual {p0, v4, p1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    return-object v3

    .line 70
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-static {p0}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0

    .line 79
    :cond_2
    new-instance v0, LK0/h;

    .line 80
    .line 81
    new-instance v2, LF0/a;

    .line 82
    .line 83
    const/4 v3, 0x2

    .line 84
    invoke-direct {v2, v3, p1}, LF0/a;-><init>(ILjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-direct {v0, p0, v2}, LK0/h;-><init>(Ljava/lang/CharSequence;LM0/p;)V

    .line 88
    .line 89
    .line 90
    new-instance p1, LF0/i;

    .line 91
    .line 92
    const/4 v2, 0x1

    .line 93
    invoke-direct {p1, v2, v0}, LF0/i;-><init>(ILjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    new-instance v0, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-static {p1}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, LF0/i;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    :goto_0
    move-object v2, p1

    .line 110
    check-cast v2, LU0/b;

    .line 111
    .line 112
    invoke-virtual {v2}, LU0/b;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-eqz v3, :cond_3

    .line 117
    .line 118
    invoke-virtual {v2}, LU0/b;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    check-cast v2, LR0/c;

    .line 123
    .line 124
    const-string v3, "range"

    .line 125
    .line 126
    invoke-static {v2, v3}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    iget v3, v2, LR0/a;->b:I

    .line 130
    .line 131
    add-int/2addr v3, v1

    .line 132
    iget v2, v2, LR0/a;->a:I

    .line 133
    .line 134
    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_3
    return-object v0
.end method

.method public static v0(Ljava/lang/String;C)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "missingDelimiterValue"

    .line 7
    .line 8
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v1, 0x6

    .line 13
    invoke-static {p0, p1, v0, v1}, LU0/i;->o0(Ljava/lang/CharSequence;CII)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 v0, -0x1

    .line 18
    if-ne p1, v0, :cond_0

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const-string p1, "substring(...)"

    .line 32
    .line 33
    invoke-static {p0, p1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object p0
.end method

.method public static w0(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "missingDelimiterValue"

    .line 7
    .line 8
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, LU0/i;->r0(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, -0x1

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string v0, "substring(...)"

    .line 30
    .line 31
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object p0
.end method

.method public static x0(Ljava/lang/String;C)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x6

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p0, p1, v1, v0}, LU0/i;->o0(Ljava/lang/CharSequence;CII)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, -0x1

    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    invoke-virtual {p0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string p1, "substring(...)"

    .line 16
    .line 17
    invoke-static {p0, p1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public static y0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x6

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p0, p1, v1, v1, v0}, LU0/i;->p0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, -0x1

    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    invoke-virtual {p0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string p1, "substring(...)"

    .line 16
    .line 17
    invoke-static {p0, p1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public static z0(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, LU0/i;->r0(Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, -0x1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    const-string p0, ""

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string v0, "substring(...)"

    .line 22
    .line 23
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object p0
.end method
