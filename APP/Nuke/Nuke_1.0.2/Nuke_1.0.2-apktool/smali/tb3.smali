.class public abstract Ltb3;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# direct methods
.method public static final a(Lu60;Ljava/lang/Object;)Ld43;
    .locals 9

    .line 1
    iget-object v0, p0, Lth1;->h:Lth1;

    .line 2
    .line 3
    iget-boolean v0, v0, Lth1;->u:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "visitAncestors called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, Lkz0;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lth1;->h:Lth1;

    .line 13
    .line 14
    iget-object v0, v0, Lth1;->l:Lth1;

    .line 15
    .line 16
    invoke-static {p0}, Lsp0;->c0(Lt60;)Lr61;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    const/4 v1, 0x0

    .line 21
    if-eqz p0, :cond_b

    .line 22
    .line 23
    iget-object v2, p0, Lr61;->M:Lvn1;

    .line 24
    .line 25
    iget-object v2, v2, Lvn1;->g:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, Lth1;

    .line 28
    .line 29
    iget v2, v2, Lth1;->k:I

    .line 30
    .line 31
    const/high16 v3, 0x40000

    .line 32
    .line 33
    and-int/2addr v2, v3

    .line 34
    if-eqz v2, :cond_9

    .line 35
    .line 36
    :goto_1
    if-eqz v0, :cond_9

    .line 37
    .line 38
    iget v2, v0, Lth1;->j:I

    .line 39
    .line 40
    and-int/2addr v2, v3

    .line 41
    if-eqz v2, :cond_8

    .line 42
    .line 43
    move-object v2, v0

    .line 44
    move-object v4, v1

    .line 45
    :goto_2
    if-eqz v2, :cond_8

    .line 46
    .line 47
    instance-of v5, v2, Ld43;

    .line 48
    .line 49
    if-eqz v5, :cond_1

    .line 50
    .line 51
    move-object v5, v2

    .line 52
    check-cast v5, Ld43;

    .line 53
    .line 54
    invoke-interface {v5}, Ld43;->r()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-virtual {p1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-eqz v6, :cond_1

    .line 63
    .line 64
    return-object v5

    .line 65
    :cond_1
    iget v5, v2, Lth1;->j:I

    .line 66
    .line 67
    and-int/2addr v5, v3

    .line 68
    if-eqz v5, :cond_7

    .line 69
    .line 70
    instance-of v5, v2, Lu60;

    .line 71
    .line 72
    if-eqz v5, :cond_7

    .line 73
    .line 74
    move-object v5, v2

    .line 75
    check-cast v5, Lu60;

    .line 76
    .line 77
    iget-object v5, v5, Lu60;->w:Lth1;

    .line 78
    .line 79
    const/4 v6, 0x0

    .line 80
    :goto_3
    const/4 v7, 0x1

    .line 81
    if-eqz v5, :cond_6

    .line 82
    .line 83
    iget v8, v5, Lth1;->j:I

    .line 84
    .line 85
    and-int/2addr v8, v3

    .line 86
    if-eqz v8, :cond_5

    .line 87
    .line 88
    add-int/lit8 v6, v6, 0x1

    .line 89
    .line 90
    if-ne v6, v7, :cond_2

    .line 91
    .line 92
    move-object v2, v5

    .line 93
    goto :goto_4

    .line 94
    :cond_2
    if-nez v4, :cond_3

    .line 95
    .line 96
    new-instance v4, Lzk1;

    .line 97
    .line 98
    const/16 v7, 0x10

    .line 99
    .line 100
    new-array v7, v7, [Lth1;

    .line 101
    .line 102
    invoke-direct {v4, v7}, Lzk1;-><init>([Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :cond_3
    if-eqz v2, :cond_4

    .line 106
    .line 107
    invoke-virtual {v4, v2}, Lzk1;->b(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    move-object v2, v1

    .line 111
    :cond_4
    invoke-virtual {v4, v5}, Lzk1;->b(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_5
    :goto_4
    iget-object v5, v5, Lth1;->m:Lth1;

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_6
    if-ne v6, v7, :cond_7

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_7
    invoke-static {v4}, Lsp0;->m(Lzk1;)Lth1;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    goto :goto_2

    .line 125
    :cond_8
    iget-object v0, v0, Lth1;->l:Lth1;

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_9
    invoke-virtual {p0}, Lr61;->u()Lr61;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    if-eqz p0, :cond_a

    .line 133
    .line 134
    iget-object v0, p0, Lr61;->M:Lvn1;

    .line 135
    .line 136
    if-eqz v0, :cond_a

    .line 137
    .line 138
    iget-object v0, v0, Lvn1;->f:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v0, Lqx2;

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_a
    move-object v0, v1

    .line 144
    goto :goto_0

    .line 145
    :cond_b
    return-object v1
.end method

.method public static final b(Landroid/view/View;)Llb3;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :goto_0
    const/4 v0, 0x0

    .line 5
    if-eqz p0, :cond_3

    .line 6
    .line 7
    const v1, 0x79080084

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    instance-of v2, v1, Llb3;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    check-cast v1, Llb3;

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    move-object v1, v0

    .line 22
    :goto_1
    if-eqz v1, :cond_1

    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_1
    invoke-static {p0}, Lpb3;->b(Landroid/view/View;)Landroid/view/ViewParent;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    instance-of v1, p0, Landroid/view/View;

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    check-cast p0, Landroid/view/View;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    move-object p0, v0

    .line 37
    goto :goto_0

    .line 38
    :cond_3
    return-object v0
.end method

.method public static final c(Lt60;Ljava/lang/Object;Lin0;)V
    .locals 10

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Lth1;

    .line 3
    .line 4
    iget-object v0, v0, Lth1;->h:Lth1;

    .line 5
    .line 6
    iget-boolean v0, v0, Lth1;->u:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "visitAncestors called on an unattached node"

    .line 11
    .line 12
    invoke-static {v0}, Lkz0;->b(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    move-object v0, p0

    .line 16
    check-cast v0, Lth1;

    .line 17
    .line 18
    iget-object v0, v0, Lth1;->h:Lth1;

    .line 19
    .line 20
    iget-object v0, v0, Lth1;->l:Lth1;

    .line 21
    .line 22
    invoke-static {p0}, Lsp0;->c0(Lt60;)Lr61;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :goto_0
    if-eqz p0, :cond_f

    .line 27
    .line 28
    iget-object v1, p0, Lr61;->M:Lvn1;

    .line 29
    .line 30
    iget-object v1, v1, Lvn1;->g:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Lth1;

    .line 33
    .line 34
    iget v1, v1, Lth1;->k:I

    .line 35
    .line 36
    const/high16 v2, 0x40000

    .line 37
    .line 38
    and-int/2addr v1, v2

    .line 39
    const/4 v3, 0x0

    .line 40
    if-eqz v1, :cond_d

    .line 41
    .line 42
    :goto_1
    if-eqz v0, :cond_d

    .line 43
    .line 44
    iget v1, v0, Lth1;->j:I

    .line 45
    .line 46
    and-int/2addr v1, v2

    .line 47
    if-eqz v1, :cond_c

    .line 48
    .line 49
    move-object v1, v0

    .line 50
    move-object v4, v3

    .line 51
    :goto_2
    if-eqz v1, :cond_c

    .line 52
    .line 53
    instance-of v5, v1, Ld43;

    .line 54
    .line 55
    const/4 v6, 0x0

    .line 56
    const/4 v7, 0x1

    .line 57
    if-eqz v5, :cond_3

    .line 58
    .line 59
    move-object v5, v1

    .line 60
    check-cast v5, Ld43;

    .line 61
    .line 62
    invoke-interface {v5}, Ld43;->r()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    invoke-virtual {p1, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    if-eqz v8, :cond_1

    .line 71
    .line 72
    invoke-interface {p2, v5}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    check-cast v5, Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    goto :goto_3

    .line 83
    :cond_1
    move v5, v7

    .line 84
    :goto_3
    if-nez v5, :cond_2

    .line 85
    .line 86
    goto/16 :goto_9

    .line 87
    .line 88
    :cond_2
    move v5, v6

    .line 89
    goto :goto_4

    .line 90
    :cond_3
    move v5, v7

    .line 91
    :goto_4
    if-eqz v5, :cond_b

    .line 92
    .line 93
    iget v5, v1, Lth1;->j:I

    .line 94
    .line 95
    and-int/2addr v5, v2

    .line 96
    if-eqz v5, :cond_4

    .line 97
    .line 98
    move v5, v7

    .line 99
    goto :goto_5

    .line 100
    :cond_4
    move v5, v6

    .line 101
    :goto_5
    if-eqz v5, :cond_b

    .line 102
    .line 103
    instance-of v5, v1, Lu60;

    .line 104
    .line 105
    if-eqz v5, :cond_b

    .line 106
    .line 107
    move-object v5, v1

    .line 108
    check-cast v5, Lu60;

    .line 109
    .line 110
    iget-object v5, v5, Lu60;->w:Lth1;

    .line 111
    .line 112
    move v8, v6

    .line 113
    :goto_6
    if-eqz v5, :cond_a

    .line 114
    .line 115
    iget v9, v5, Lth1;->j:I

    .line 116
    .line 117
    and-int/2addr v9, v2

    .line 118
    if-eqz v9, :cond_5

    .line 119
    .line 120
    move v9, v7

    .line 121
    goto :goto_7

    .line 122
    :cond_5
    move v9, v6

    .line 123
    :goto_7
    if-eqz v9, :cond_9

    .line 124
    .line 125
    add-int/lit8 v8, v8, 0x1

    .line 126
    .line 127
    if-ne v8, v7, :cond_6

    .line 128
    .line 129
    move-object v1, v5

    .line 130
    goto :goto_8

    .line 131
    :cond_6
    if-nez v4, :cond_7

    .line 132
    .line 133
    new-instance v4, Lzk1;

    .line 134
    .line 135
    const/16 v9, 0x10

    .line 136
    .line 137
    new-array v9, v9, [Lth1;

    .line 138
    .line 139
    invoke-direct {v4, v9}, Lzk1;-><init>([Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :cond_7
    if-eqz v1, :cond_8

    .line 143
    .line 144
    invoke-virtual {v4, v1}, Lzk1;->b(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    move-object v1, v3

    .line 148
    :cond_8
    invoke-virtual {v4, v5}, Lzk1;->b(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    :cond_9
    :goto_8
    iget-object v5, v5, Lth1;->m:Lth1;

    .line 152
    .line 153
    goto :goto_6

    .line 154
    :cond_a
    if-ne v8, v7, :cond_b

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_b
    invoke-static {v4}, Lsp0;->m(Lzk1;)Lth1;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    goto :goto_2

    .line 162
    :cond_c
    iget-object v0, v0, Lth1;->l:Lth1;

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_d
    invoke-virtual {p0}, Lr61;->u()Lr61;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    if-eqz p0, :cond_e

    .line 170
    .line 171
    iget-object v0, p0, Lr61;->M:Lvn1;

    .line 172
    .line 173
    if-eqz v0, :cond_e

    .line 174
    .line 175
    iget-object v0, v0, Lvn1;->f:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v0, Lqx2;

    .line 178
    .line 179
    goto/16 :goto_0

    .line 180
    .line 181
    :cond_e
    move-object v0, v3

    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :cond_f
    :goto_9
    return-void
.end method

.method public static final d(Ld43;Lin0;)V
    .locals 11

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Lth1;

    .line 3
    .line 4
    iget-object v1, v0, Lth1;->h:Lth1;

    .line 5
    .line 6
    iget-boolean v1, v1, Lth1;->u:Z

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    const-string v1, "visitAncestors called on an unattached node"

    .line 11
    .line 12
    invoke-static {v1}, Lkz0;->b(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, v0, Lth1;->h:Lth1;

    .line 16
    .line 17
    iget-object v0, v0, Lth1;->l:Lth1;

    .line 18
    .line 19
    invoke-static {p0}, Lsp0;->c0(Lt60;)Lr61;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :goto_0
    if-eqz v1, :cond_f

    .line 24
    .line 25
    iget-object v2, v1, Lr61;->M:Lvn1;

    .line 26
    .line 27
    iget-object v2, v2, Lvn1;->g:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, Lth1;

    .line 30
    .line 31
    iget v2, v2, Lth1;->k:I

    .line 32
    .line 33
    const/high16 v3, 0x40000

    .line 34
    .line 35
    and-int/2addr v2, v3

    .line 36
    const/4 v4, 0x0

    .line 37
    if-eqz v2, :cond_d

    .line 38
    .line 39
    :goto_1
    if-eqz v0, :cond_d

    .line 40
    .line 41
    iget v2, v0, Lth1;->j:I

    .line 42
    .line 43
    and-int/2addr v2, v3

    .line 44
    if-eqz v2, :cond_c

    .line 45
    .line 46
    move-object v2, v0

    .line 47
    move-object v5, v4

    .line 48
    :goto_2
    if-eqz v2, :cond_c

    .line 49
    .line 50
    instance-of v6, v2, Ld43;

    .line 51
    .line 52
    const/4 v7, 0x0

    .line 53
    const/4 v8, 0x1

    .line 54
    if-eqz v6, :cond_3

    .line 55
    .line 56
    move-object v6, v2

    .line 57
    check-cast v6, Ld43;

    .line 58
    .line 59
    invoke-interface {p0}, Ld43;->r()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v9

    .line 63
    invoke-interface {v6}, Ld43;->r()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v10

    .line 67
    invoke-static {v9, v10}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    if-eqz v9, :cond_1

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v10

    .line 81
    if-ne v9, v10, :cond_1

    .line 82
    .line 83
    invoke-interface {p1, v6}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    check-cast v6, Ljava/lang/Boolean;

    .line 88
    .line 89
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    goto :goto_3

    .line 94
    :cond_1
    move v6, v8

    .line 95
    :goto_3
    if-nez v6, :cond_2

    .line 96
    .line 97
    goto/16 :goto_9

    .line 98
    .line 99
    :cond_2
    move v6, v7

    .line 100
    goto :goto_4

    .line 101
    :cond_3
    move v6, v8

    .line 102
    :goto_4
    if-eqz v6, :cond_b

    .line 103
    .line 104
    iget v6, v2, Lth1;->j:I

    .line 105
    .line 106
    and-int/2addr v6, v3

    .line 107
    if-eqz v6, :cond_4

    .line 108
    .line 109
    move v6, v8

    .line 110
    goto :goto_5

    .line 111
    :cond_4
    move v6, v7

    .line 112
    :goto_5
    if-eqz v6, :cond_b

    .line 113
    .line 114
    instance-of v6, v2, Lu60;

    .line 115
    .line 116
    if-eqz v6, :cond_b

    .line 117
    .line 118
    move-object v6, v2

    .line 119
    check-cast v6, Lu60;

    .line 120
    .line 121
    iget-object v6, v6, Lu60;->w:Lth1;

    .line 122
    .line 123
    move v9, v7

    .line 124
    :goto_6
    if-eqz v6, :cond_a

    .line 125
    .line 126
    iget v10, v6, Lth1;->j:I

    .line 127
    .line 128
    and-int/2addr v10, v3

    .line 129
    if-eqz v10, :cond_5

    .line 130
    .line 131
    move v10, v8

    .line 132
    goto :goto_7

    .line 133
    :cond_5
    move v10, v7

    .line 134
    :goto_7
    if-eqz v10, :cond_9

    .line 135
    .line 136
    add-int/lit8 v9, v9, 0x1

    .line 137
    .line 138
    if-ne v9, v8, :cond_6

    .line 139
    .line 140
    move-object v2, v6

    .line 141
    goto :goto_8

    .line 142
    :cond_6
    if-nez v5, :cond_7

    .line 143
    .line 144
    new-instance v5, Lzk1;

    .line 145
    .line 146
    const/16 v10, 0x10

    .line 147
    .line 148
    new-array v10, v10, [Lth1;

    .line 149
    .line 150
    invoke-direct {v5, v10}, Lzk1;-><init>([Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    :cond_7
    if-eqz v2, :cond_8

    .line 154
    .line 155
    invoke-virtual {v5, v2}, Lzk1;->b(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    move-object v2, v4

    .line 159
    :cond_8
    invoke-virtual {v5, v6}, Lzk1;->b(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    :cond_9
    :goto_8
    iget-object v6, v6, Lth1;->m:Lth1;

    .line 163
    .line 164
    goto :goto_6

    .line 165
    :cond_a
    if-ne v9, v8, :cond_b

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_b
    invoke-static {v5}, Lsp0;->m(Lzk1;)Lth1;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    goto :goto_2

    .line 173
    :cond_c
    iget-object v0, v0, Lth1;->l:Lth1;

    .line 174
    .line 175
    goto/16 :goto_1

    .line 176
    .line 177
    :cond_d
    invoke-virtual {v1}, Lr61;->u()Lr61;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    if-eqz v1, :cond_e

    .line 182
    .line 183
    iget-object v0, v1, Lr61;->M:Lvn1;

    .line 184
    .line 185
    if-eqz v0, :cond_e

    .line 186
    .line 187
    iget-object v0, v0, Lvn1;->f:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v0, Lqx2;

    .line 190
    .line 191
    goto/16 :goto_0

    .line 192
    .line 193
    :cond_e
    move-object v0, v4

    .line 194
    goto/16 :goto_0

    .line 195
    .line 196
    :cond_f
    :goto_9
    return-void
.end method

.method public static final e(Lth1;Ljava/lang/String;Lin0;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lth1;->h:Lth1;

    .line 2
    .line 3
    iget-boolean v0, v0, Lth1;->u:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "visitSubtreeIf called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, Lkz0;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    new-instance v0, Lzk1;

    .line 13
    .line 14
    const/16 v1, 0x10

    .line 15
    .line 16
    new-array v2, v1, [Lth1;

    .line 17
    .line 18
    invoke-direct {v0, v2}, Lzk1;-><init>([Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Lth1;->h:Lth1;

    .line 22
    .line 23
    iget-object v2, p0, Lth1;->m:Lth1;

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    invoke-static {v0, p0}, Lsp0;->k(Lzk1;Lth1;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {v0, v2}, Lzk1;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_2
    :goto_0
    iget p0, v0, Lzk1;->j:I

    .line 35
    .line 36
    if-eqz p0, :cond_e

    .line 37
    .line 38
    add-int/lit8 p0, p0, -0x1

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Lzk1;->k(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Lth1;

    .line 45
    .line 46
    iget v2, p0, Lth1;->k:I

    .line 47
    .line 48
    const/high16 v3, 0x40000

    .line 49
    .line 50
    and-int/2addr v2, v3

    .line 51
    if-eqz v2, :cond_d

    .line 52
    .line 53
    move-object v2, p0

    .line 54
    :goto_1
    if-eqz v2, :cond_d

    .line 55
    .line 56
    iget-boolean v4, v2, Lth1;->u:Z

    .line 57
    .line 58
    if-eqz v4, :cond_d

    .line 59
    .line 60
    iget v4, v2, Lth1;->j:I

    .line 61
    .line 62
    and-int/2addr v4, v3

    .line 63
    if-eqz v4, :cond_c

    .line 64
    .line 65
    const/4 v4, 0x0

    .line 66
    move-object v5, v2

    .line 67
    move-object v6, v4

    .line 68
    :goto_2
    if-eqz v5, :cond_c

    .line 69
    .line 70
    instance-of v7, v5, Ld43;

    .line 71
    .line 72
    if-eqz v7, :cond_5

    .line 73
    .line 74
    check-cast v5, Ld43;

    .line 75
    .line 76
    invoke-interface {v5}, Ld43;->r()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    invoke-virtual {p1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-eqz v7, :cond_3

    .line 85
    .line 86
    invoke-interface {p2, v5}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    check-cast v5, Lc43;

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_3
    sget-object v5, Lc43;->h:Lc43;

    .line 94
    .line 95
    :goto_3
    sget-object v7, Lc43;->j:Lc43;

    .line 96
    .line 97
    if-ne v5, v7, :cond_4

    .line 98
    .line 99
    goto :goto_7

    .line 100
    :cond_4
    sget-object v7, Lc43;->i:Lc43;

    .line 101
    .line 102
    if-eq v5, v7, :cond_2

    .line 103
    .line 104
    goto :goto_6

    .line 105
    :cond_5
    iget v7, v5, Lth1;->j:I

    .line 106
    .line 107
    and-int/2addr v7, v3

    .line 108
    if-eqz v7, :cond_b

    .line 109
    .line 110
    instance-of v7, v5, Lu60;

    .line 111
    .line 112
    if-eqz v7, :cond_b

    .line 113
    .line 114
    move-object v7, v5

    .line 115
    check-cast v7, Lu60;

    .line 116
    .line 117
    iget-object v7, v7, Lu60;->w:Lth1;

    .line 118
    .line 119
    const/4 v8, 0x0

    .line 120
    :goto_4
    const/4 v9, 0x1

    .line 121
    if-eqz v7, :cond_a

    .line 122
    .line 123
    iget v10, v7, Lth1;->j:I

    .line 124
    .line 125
    and-int/2addr v10, v3

    .line 126
    if-eqz v10, :cond_9

    .line 127
    .line 128
    add-int/lit8 v8, v8, 0x1

    .line 129
    .line 130
    if-ne v8, v9, :cond_6

    .line 131
    .line 132
    move-object v5, v7

    .line 133
    goto :goto_5

    .line 134
    :cond_6
    if-nez v6, :cond_7

    .line 135
    .line 136
    new-instance v6, Lzk1;

    .line 137
    .line 138
    new-array v9, v1, [Lth1;

    .line 139
    .line 140
    invoke-direct {v6, v9}, Lzk1;-><init>([Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_7
    if-eqz v5, :cond_8

    .line 144
    .line 145
    invoke-virtual {v6, v5}, Lzk1;->b(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    move-object v5, v4

    .line 149
    :cond_8
    invoke-virtual {v6, v7}, Lzk1;->b(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :cond_9
    :goto_5
    iget-object v7, v7, Lth1;->m:Lth1;

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_a
    if-ne v8, v9, :cond_b

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_b
    :goto_6
    invoke-static {v6}, Lsp0;->m(Lzk1;)Lth1;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    goto :goto_2

    .line 163
    :cond_c
    iget-object v2, v2, Lth1;->m:Lth1;

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_d
    invoke-static {v0, p0}, Lsp0;->k(Lzk1;Lth1;)V

    .line 167
    .line 168
    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :cond_e
    :goto_7
    return-void
.end method

.method public static final f(Ld43;Lin0;)V
    .locals 12

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Lth1;

    .line 3
    .line 4
    iget-object v1, v0, Lth1;->h:Lth1;

    .line 5
    .line 6
    iget-boolean v1, v1, Lth1;->u:Z

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    const-string v1, "visitSubtreeIf called on an unattached node"

    .line 11
    .line 12
    invoke-static {v1}, Lkz0;->b(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    new-instance v1, Lzk1;

    .line 16
    .line 17
    const/16 v2, 0x10

    .line 18
    .line 19
    new-array v3, v2, [Lth1;

    .line 20
    .line 21
    invoke-direct {v1, v3}, Lzk1;-><init>([Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, v0, Lth1;->h:Lth1;

    .line 25
    .line 26
    iget-object v3, v0, Lth1;->m:Lth1;

    .line 27
    .line 28
    if-nez v3, :cond_1

    .line 29
    .line 30
    invoke-static {v1, v0}, Lsp0;->k(Lzk1;Lth1;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {v1, v3}, Lzk1;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    :goto_0
    iget v0, v1, Lzk1;->j:I

    .line 38
    .line 39
    if-eqz v0, :cond_e

    .line 40
    .line 41
    add-int/lit8 v0, v0, -0x1

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Lzk1;->k(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lth1;

    .line 48
    .line 49
    iget v3, v0, Lth1;->k:I

    .line 50
    .line 51
    const/high16 v4, 0x40000

    .line 52
    .line 53
    and-int/2addr v3, v4

    .line 54
    if-eqz v3, :cond_d

    .line 55
    .line 56
    move-object v3, v0

    .line 57
    :goto_1
    if-eqz v3, :cond_d

    .line 58
    .line 59
    iget-boolean v5, v3, Lth1;->u:Z

    .line 60
    .line 61
    if-eqz v5, :cond_d

    .line 62
    .line 63
    iget v5, v3, Lth1;->j:I

    .line 64
    .line 65
    and-int/2addr v5, v4

    .line 66
    if-eqz v5, :cond_c

    .line 67
    .line 68
    const/4 v5, 0x0

    .line 69
    move-object v6, v3

    .line 70
    move-object v7, v5

    .line 71
    :goto_2
    if-eqz v6, :cond_c

    .line 72
    .line 73
    instance-of v8, v6, Ld43;

    .line 74
    .line 75
    if-eqz v8, :cond_5

    .line 76
    .line 77
    check-cast v6, Ld43;

    .line 78
    .line 79
    invoke-interface {p0}, Ld43;->r()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    invoke-interface {v6}, Ld43;->r()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    invoke-static {v8, v9}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    if-eqz v8, :cond_3

    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    if-ne v8, v9, :cond_3

    .line 102
    .line 103
    invoke-interface {p1, v6}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    check-cast v6, Lc43;

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_3
    sget-object v6, Lc43;->h:Lc43;

    .line 111
    .line 112
    :goto_3
    sget-object v8, Lc43;->j:Lc43;

    .line 113
    .line 114
    if-ne v6, v8, :cond_4

    .line 115
    .line 116
    goto :goto_7

    .line 117
    :cond_4
    sget-object v8, Lc43;->i:Lc43;

    .line 118
    .line 119
    if-eq v6, v8, :cond_2

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_5
    iget v8, v6, Lth1;->j:I

    .line 123
    .line 124
    and-int/2addr v8, v4

    .line 125
    if-eqz v8, :cond_b

    .line 126
    .line 127
    instance-of v8, v6, Lu60;

    .line 128
    .line 129
    if-eqz v8, :cond_b

    .line 130
    .line 131
    move-object v8, v6

    .line 132
    check-cast v8, Lu60;

    .line 133
    .line 134
    iget-object v8, v8, Lu60;->w:Lth1;

    .line 135
    .line 136
    const/4 v9, 0x0

    .line 137
    :goto_4
    const/4 v10, 0x1

    .line 138
    if-eqz v8, :cond_a

    .line 139
    .line 140
    iget v11, v8, Lth1;->j:I

    .line 141
    .line 142
    and-int/2addr v11, v4

    .line 143
    if-eqz v11, :cond_9

    .line 144
    .line 145
    add-int/lit8 v9, v9, 0x1

    .line 146
    .line 147
    if-ne v9, v10, :cond_6

    .line 148
    .line 149
    move-object v6, v8

    .line 150
    goto :goto_5

    .line 151
    :cond_6
    if-nez v7, :cond_7

    .line 152
    .line 153
    new-instance v7, Lzk1;

    .line 154
    .line 155
    new-array v10, v2, [Lth1;

    .line 156
    .line 157
    invoke-direct {v7, v10}, Lzk1;-><init>([Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    :cond_7
    if-eqz v6, :cond_8

    .line 161
    .line 162
    invoke-virtual {v7, v6}, Lzk1;->b(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    move-object v6, v5

    .line 166
    :cond_8
    invoke-virtual {v7, v8}, Lzk1;->b(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    :cond_9
    :goto_5
    iget-object v8, v8, Lth1;->m:Lth1;

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_a
    if-ne v9, v10, :cond_b

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_b
    :goto_6
    invoke-static {v7}, Lsp0;->m(Lzk1;)Lth1;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    goto :goto_2

    .line 180
    :cond_c
    iget-object v3, v3, Lth1;->m:Lth1;

    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_d
    invoke-static {v1, v0}, Lsp0;->k(Lzk1;Lth1;)V

    .line 184
    .line 185
    .line 186
    goto/16 :goto_0

    .line 187
    .line 188
    :cond_e
    :goto_7
    return-void
.end method
