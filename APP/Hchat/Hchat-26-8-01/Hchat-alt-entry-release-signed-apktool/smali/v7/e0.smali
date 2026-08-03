.class public final Lv7/e0;
.super Lv7/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# virtual methods
.method public final P()Ll7/g;
    .locals 2

    .line 1
    const-class v0, Lv7/d;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lv7/d;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-class v1, Ll7/f;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ll7/f;

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return-object v0
.end method

.method public final Y()Ljava/lang/String;
    .locals 11

    .line 1
    invoke-virtual {p0}, Lv7/e0;->a0()Lv7/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lv7/b;->h:Lv7/b;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_5

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Lv7/j0;->O()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    and-int/lit16 v0, v0, 0xff

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    const-string v0, ""

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_1
    sget-object v1, Lv7/a;->m:[Lv7/a;

    .line 24
    .line 25
    array-length v3, v1

    .line 26
    new-array v3, v3, [Lv7/a;

    .line 27
    .line 28
    array-length v4, v1

    .line 29
    const/4 v5, 0x0

    .line 30
    move v6, v5

    .line 31
    move v7, v6

    .line 32
    :goto_0
    if-ge v6, v4, :cond_5

    .line 33
    .line 34
    aget-object v8, v1, v6

    .line 35
    .line 36
    iget v9, v8, Lv7/a;->g:I

    .line 37
    .line 38
    if-ne v9, v0, :cond_2

    .line 39
    .line 40
    filled-new-array {v8}, [Lv7/a;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    sget-object v10, Lv7/a;->j:Lv7/a;

    .line 46
    .line 47
    if-ne v8, v10, :cond_3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    and-int v10, v0, v9

    .line 51
    .line 52
    if-ne v10, v9, :cond_4

    .line 53
    .line 54
    aput-object v8, v3, v7

    .line 55
    .line 56
    add-int/lit8 v7, v7, 0x1

    .line 57
    .line 58
    :cond_4
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_5
    if-nez v7, :cond_6

    .line 62
    .line 63
    move-object v0, v2

    .line 64
    goto :goto_2

    .line 65
    :cond_6
    new-array v0, v7, [Lv7/a;

    .line 66
    .line 67
    invoke-static {v3, v5, v0, v5, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 68
    .line 69
    .line 70
    :goto_2
    if-eqz v0, :cond_e

    .line 71
    .line 72
    array-length v1, v0

    .line 73
    if-nez v1, :cond_7

    .line 74
    .line 75
    goto :goto_5

    .line 76
    :cond_7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    array-length v2, v0

    .line 82
    move v3, v5

    .line 83
    move v4, v3

    .line 84
    :goto_3
    if-ge v5, v2, :cond_d

    .line 85
    .line 86
    aget-object v6, v0, v5

    .line 87
    .line 88
    sget-object v7, Lv7/a;->k:Lv7/a;

    .line 89
    .line 90
    if-eq v6, v7, :cond_c

    .line 91
    .line 92
    sget-object v7, Lv7/a;->l:Lv7/a;

    .line 93
    .line 94
    if-ne v6, v7, :cond_8

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_8
    sget-object v7, Lv7/a;->j:Lv7/a;

    .line 98
    .line 99
    if-ne v6, v7, :cond_9

    .line 100
    .line 101
    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    return-object v0

    .line 110
    :cond_9
    iget v7, v6, Lv7/a;->g:I

    .line 111
    .line 112
    and-int v8, v3, v7

    .line 113
    .line 114
    if-ne v8, v7, :cond_a

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_a
    if-eqz v4, :cond_b

    .line 118
    .line 119
    const/16 v4, 0x7c

    .line 120
    .line 121
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    :cond_b
    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    or-int/2addr v3, v7

    .line 136
    const/4 v4, 0x1

    .line 137
    :cond_c
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_d
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    return-object v0

    .line 145
    :cond_e
    :goto_5
    return-object v2
.end method

.method public final Z()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr7/b;->k:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lk7/a;->s([BI)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public final a0()Lv7/b;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lv7/e0;->Z()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lv7/b;->h:Lv7/b;

    .line 9
    .line 10
    return-object v1

    .line 11
    :cond_0
    sget-object v2, Lv7/b;->i:[Lv7/b;

    .line 12
    .line 13
    array-length v3, v2

    .line 14
    const/4 v4, 0x0

    .line 15
    :goto_0
    if-ge v4, v3, :cond_2

    .line 16
    .line 17
    aget-object v5, v2, v4

    .line 18
    .line 19
    iget v6, v5, Lv7/b;->g:I

    .line 20
    .line 21
    if-ne v6, v0, :cond_1

    .line 22
    .line 23
    return-object v5

    .line 24
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    return-object v1
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Lv7/e0;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    if-ne p1, p0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {p0}, Lv7/e0;->Z()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p1}, Lv7/e0;->Z()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-ne v0, p1, :cond_2

    .line 18
    .line 19
    :goto_0
    const/4 p1, 0x0

    .line 20
    return p1

    .line 21
    :cond_2
    if-nez v0, :cond_3

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    return p1

    .line 25
    :cond_3
    if-nez p1, :cond_4

    .line 26
    .line 27
    :goto_1
    const/4 p1, -0x1

    .line 28
    return p1

    .line 29
    :cond_4
    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lv7/e0;->Z()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const-string v2, "r0x"

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    const/high16 v3, 0xff0000

    .line 12
    .line 13
    and-int/2addr v3, v0

    .line 14
    if-eqz v3, :cond_4

    .line 15
    .line 16
    const/high16 v3, -0x1000000

    .line 17
    .line 18
    and-int/2addr v3, v0

    .line 19
    if-eqz v3, :cond_4

    .line 20
    .line 21
    invoke-virtual {p0}, Lv7/j0;->i()Ll7/f;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-virtual {v3}, Ll7/f;->Y()Ll7/l;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    if-nez v4, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-virtual {v4, v3, v0}, Ll7/l;->X(Ll7/f;I)Lt7/b;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :goto_0
    if-eqz v1, :cond_3

    .line 40
    .line 41
    iget-object v3, v1, Lt7/b;->h:Ll7/f;

    .line 42
    .line 43
    invoke-virtual {v1}, Lt7/b;->b()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    if-eqz v4, :cond_3

    .line 48
    .line 49
    invoke-virtual {v1}, Lt7/b;->b()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {p0}, Lv7/j0;->i()Ll7/f;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eq v3, v0, :cond_5

    .line 58
    .line 59
    invoke-virtual {v3}, Ll7/f;->V()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-eqz v0, :cond_5

    .line 64
    .line 65
    const-string v2, ":"

    .line 66
    .line 67
    invoke-static {v0, v2, v1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    goto :goto_2

    .line 72
    :cond_3
    sget-object v1, Ln7/g;->a:Ljava/util/HashMap;

    .line 73
    .line 74
    invoke-static {v0, v2}, Ly7/a;->p(ILjava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    goto :goto_2

    .line 79
    :cond_4
    :goto_1
    if-eqz v0, :cond_5

    .line 80
    .line 81
    invoke-virtual {p0}, Lv7/e0;->a0()Lv7/b;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    if-nez v3, :cond_5

    .line 86
    .line 87
    sget-object v1, Ln7/g;->a:Ljava/util/HashMap;

    .line 88
    .line 89
    invoke-static {v0, v2}, Ly7/a;->p(ILjava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    :cond_5
    :goto_2
    invoke-virtual {p0}, Lv7/c;->N()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    if-eqz v1, :cond_6

    .line 98
    .line 99
    if-eqz v0, :cond_6

    .line 100
    .line 101
    const-string v2, "=\""

    .line 102
    .line 103
    const-string v3, "\""

    .line 104
    .line 105
    invoke-static {v1, v2, v0, v3}, Lwb/en;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    return-object v0

    .line 110
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v1, "name="

    .line 113
    .line 114
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Lv7/e0;->Z()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    const/16 v2, 0x8

    .line 122
    .line 123
    invoke-static {v1, v2}, Ly7/a;->k(II)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v1, ", "

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-super {p0}, Lv7/j0;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    return-object v0
.end method
