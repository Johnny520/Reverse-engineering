.class public L۟/sa;
.super L۟/ra;
.source "SourceFile"


# direct methods
.method public static final ۥۣ۠(Ljava/lang/String;)Ljava/lang/Double;
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {v0, p0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    :try_start_0
    sget-object v1, L۟/u9;->ۥ:L۟/t8;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, v1, L۟/t8;->ۥ:Ljava/util/regex/Pattern;

    .line 13
    .line 14
    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 25
    .line 26
    .line 27
    move-result-wide v1

    .line 28
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 29
    .line 30
    .line 31
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    move-object v0, p0

    .line 33
    :catch_0
    :cond_0
    return-object v0
.end method

.method public static final ۥ۠ۤ(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 11

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {v0, p0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, L۟/g4;

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    const/16 v2, 0x24

    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, L۟/g4;-><init>(II)V

    .line 12
    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    iget v0, v0, L۟/e4;->ۥ۟:I

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    const/16 v5, 0xa

    .line 19
    .line 20
    if-gt v5, v0, :cond_0

    .line 21
    .line 22
    move v0, v4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v0, v3

    .line 25
    :goto_0
    if-eqz v0, :cond_d

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v1, 0x0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto/16 :goto_5

    .line 35
    .line 36
    :cond_1
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const/16 v6, 0x30

    .line 41
    .line 42
    if-ge v2, v6, :cond_2

    .line 43
    .line 44
    const/4 v6, -0x1

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    if-ne v2, v6, :cond_3

    .line 47
    .line 48
    move v6, v3

    .line 49
    goto :goto_1

    .line 50
    :cond_3
    move v6, v4

    .line 51
    :goto_1
    const v7, -0x7fffffff

    .line 52
    .line 53
    .line 54
    if-gez v6, :cond_6

    .line 55
    .line 56
    if-ne v0, v4, :cond_4

    .line 57
    .line 58
    goto :goto_5

    .line 59
    :cond_4
    const/16 v6, 0x2d

    .line 60
    .line 61
    if-ne v2, v6, :cond_5

    .line 62
    .line 63
    const/high16 v7, -0x80000000

    .line 64
    .line 65
    move v2, v4

    .line 66
    goto :goto_2

    .line 67
    :cond_5
    const/16 v6, 0x2b

    .line 68
    .line 69
    if-ne v2, v6, :cond_c

    .line 70
    .line 71
    move v2, v4

    .line 72
    move v4, v3

    .line 73
    goto :goto_2

    .line 74
    :cond_6
    move v2, v3

    .line 75
    move v4, v2

    .line 76
    :goto_2
    const v6, -0x38e38e3

    .line 77
    .line 78
    .line 79
    move v8, v6

    .line 80
    :goto_3
    if-ge v2, v0, :cond_a

    .line 81
    .line 82
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    invoke-static {v9, v5}, Ljava/lang/Character;->digit(II)I

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    if-gez v9, :cond_7

    .line 91
    .line 92
    goto :goto_5

    .line 93
    :cond_7
    if-ge v3, v8, :cond_8

    .line 94
    .line 95
    if-ne v8, v6, :cond_c

    .line 96
    .line 97
    div-int/lit8 v8, v7, 0xa

    .line 98
    .line 99
    if-ge v3, v8, :cond_8

    .line 100
    .line 101
    goto :goto_5

    .line 102
    :cond_8
    mul-int/lit8 v3, v3, 0xa

    .line 103
    .line 104
    add-int v10, v7, v9

    .line 105
    .line 106
    if-ge v3, v10, :cond_9

    .line 107
    .line 108
    goto :goto_5

    .line 109
    :cond_9
    sub-int/2addr v3, v9

    .line 110
    add-int/lit8 v2, v2, 0x1

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_a
    if-eqz v4, :cond_b

    .line 114
    .line 115
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    goto :goto_4

    .line 120
    :cond_b
    neg-int p0, v3

    .line 121
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    :goto_4
    move-object v1, p0

    .line 126
    :cond_c
    :goto_5
    return-object v1

    .line 127
    :cond_d
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 128
    .line 129
    new-instance v0, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 132
    .line 133
    .line 134
    const-string v3, "radix "

    .line 135
    .line 136
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    const-string v3, " was not in valid range "

    .line 143
    .line 144
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    new-instance v3, L۟/g4;

    .line 148
    .line 149
    invoke-direct {v3, v1, v2}, L۟/g4;-><init>(II)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    throw p0
.end method
