.class public abstract Lx1/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lx1/o1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lx1/o1;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lx1/o1;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lx1/k;->a:Lx1/o1;

    .line 8
    .line 9
    return-void
.end method

.method public static final A(Lx1/e2;Lfg/l;)V
    .locals 11

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Ly0/n;

    .line 3
    .line 4
    iget-object v1, v0, Ly0/n;->g:Ly0/n;

    .line 5
    .line 6
    iget-boolean v1, v1, Ly0/n;->t:Z

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    const-string v1, "visitAncestors called on an unattached node"

    .line 11
    .line 12
    invoke-static {v1}, Lu1/a;->b(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, v0, Ly0/n;->g:Ly0/n;

    .line 16
    .line 17
    iget-object v0, v0, Ly0/n;->k:Ly0/n;

    .line 18
    .line 19
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :goto_0
    if-eqz v1, :cond_f

    .line 24
    .line 25
    iget-object v2, v1, Lx1/f0;->L:Lx1/b1;

    .line 26
    .line 27
    iget-object v2, v2, Lx1/b1;->f:Ly0/n;

    .line 28
    .line 29
    iget v2, v2, Ly0/n;->j:I

    .line 30
    .line 31
    const/high16 v3, 0x40000

    .line 32
    .line 33
    and-int/2addr v2, v3

    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz v2, :cond_d

    .line 36
    .line 37
    :goto_1
    if-eqz v0, :cond_d

    .line 38
    .line 39
    iget v2, v0, Ly0/n;->i:I

    .line 40
    .line 41
    and-int/2addr v2, v3

    .line 42
    if-eqz v2, :cond_c

    .line 43
    .line 44
    move-object v2, v0

    .line 45
    move-object v5, v4

    .line 46
    :goto_2
    if-eqz v2, :cond_c

    .line 47
    .line 48
    instance-of v6, v2, Lx1/e2;

    .line 49
    .line 50
    const/4 v7, 0x0

    .line 51
    const/4 v8, 0x1

    .line 52
    if-eqz v6, :cond_3

    .line 53
    .line 54
    move-object v6, v2

    .line 55
    check-cast v6, Lx1/e2;

    .line 56
    .line 57
    invoke-interface {p0}, Lx1/e2;->F()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    invoke-interface {v6}, Lx1/e2;->F()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    invoke-static {v9, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v9

    .line 69
    if-eqz v9, :cond_1

    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v10

    .line 79
    if-ne v9, v10, :cond_1

    .line 80
    .line 81
    invoke-interface {p1, v6}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    check-cast v6, Ljava/lang/Boolean;

    .line 86
    .line 87
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    goto :goto_3

    .line 92
    :cond_1
    move v6, v8

    .line 93
    :goto_3
    if-nez v6, :cond_2

    .line 94
    .line 95
    goto/16 :goto_9

    .line 96
    .line 97
    :cond_2
    move v6, v7

    .line 98
    goto :goto_4

    .line 99
    :cond_3
    move v6, v8

    .line 100
    :goto_4
    if-eqz v6, :cond_b

    .line 101
    .line 102
    iget v6, v2, Ly0/n;->i:I

    .line 103
    .line 104
    and-int/2addr v6, v3

    .line 105
    if-eqz v6, :cond_4

    .line 106
    .line 107
    move v6, v8

    .line 108
    goto :goto_5

    .line 109
    :cond_4
    move v6, v7

    .line 110
    :goto_5
    if-eqz v6, :cond_b

    .line 111
    .line 112
    instance-of v6, v2, Lx1/j;

    .line 113
    .line 114
    if-eqz v6, :cond_b

    .line 115
    .line 116
    move-object v6, v2

    .line 117
    check-cast v6, Lx1/j;

    .line 118
    .line 119
    iget-object v6, v6, Lx1/j;->v:Ly0/n;

    .line 120
    .line 121
    move v9, v7

    .line 122
    :goto_6
    if-eqz v6, :cond_a

    .line 123
    .line 124
    iget v10, v6, Ly0/n;->i:I

    .line 125
    .line 126
    and-int/2addr v10, v3

    .line 127
    if-eqz v10, :cond_5

    .line 128
    .line 129
    move v10, v8

    .line 130
    goto :goto_7

    .line 131
    :cond_5
    move v10, v7

    .line 132
    :goto_7
    if-eqz v10, :cond_9

    .line 133
    .line 134
    add-int/lit8 v9, v9, 0x1

    .line 135
    .line 136
    if-ne v9, v8, :cond_6

    .line 137
    .line 138
    move-object v2, v6

    .line 139
    goto :goto_8

    .line 140
    :cond_6
    if-nez v5, :cond_7

    .line 141
    .line 142
    new-instance v5, Lj0/b;

    .line 143
    .line 144
    const/16 v10, 0x10

    .line 145
    .line 146
    new-array v10, v10, [Ly0/n;

    .line 147
    .line 148
    invoke-direct {v5, v10}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    :cond_7
    if-eqz v2, :cond_8

    .line 152
    .line 153
    invoke-virtual {v5, v2}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    move-object v2, v4

    .line 157
    :cond_8
    invoke-virtual {v5, v6}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    :cond_9
    :goto_8
    iget-object v6, v6, Ly0/n;->l:Ly0/n;

    .line 161
    .line 162
    goto :goto_6

    .line 163
    :cond_a
    if-ne v9, v8, :cond_b

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_b
    invoke-static {v5}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    goto :goto_2

    .line 171
    :cond_c
    iget-object v0, v0, Ly0/n;->k:Ly0/n;

    .line 172
    .line 173
    goto/16 :goto_1

    .line 174
    .line 175
    :cond_d
    invoke-virtual {v1}, Lx1/f0;->u()Lx1/f0;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    if-eqz v1, :cond_e

    .line 180
    .line 181
    iget-object v0, v1, Lx1/f0;->L:Lx1/b1;

    .line 182
    .line 183
    if-eqz v0, :cond_e

    .line 184
    .line 185
    iget-object v0, v0, Lx1/b1;->e:Lx1/b2;

    .line 186
    .line 187
    goto/16 :goto_0

    .line 188
    .line 189
    :cond_e
    move-object v0, v4

    .line 190
    goto/16 :goto_0

    .line 191
    .line 192
    :cond_f
    :goto_9
    return-void
.end method

.method public static final B(Lx1/e2;Lfg/l;)V
    .locals 12

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Ly0/n;

    .line 3
    .line 4
    iget-object v1, v0, Ly0/n;->g:Ly0/n;

    .line 5
    .line 6
    iget-boolean v1, v1, Ly0/n;->t:Z

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    const-string v1, "visitSubtreeIf called on an unattached node"

    .line 11
    .line 12
    invoke-static {v1}, Lu1/a;->b(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    new-instance v1, Lj0/b;

    .line 16
    .line 17
    const/16 v2, 0x10

    .line 18
    .line 19
    new-array v3, v2, [Ly0/n;

    .line 20
    .line 21
    invoke-direct {v1, v3}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, v0, Ly0/n;->g:Ly0/n;

    .line 25
    .line 26
    iget-object v3, v0, Ly0/n;->l:Ly0/n;

    .line 27
    .line 28
    if-nez v3, :cond_1

    .line 29
    .line 30
    invoke-static {v1, v0}, Lx1/k;->b(Lj0/b;Ly0/n;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {v1, v3}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    :goto_0
    iget v0, v1, Lj0/b;->i:I

    .line 38
    .line 39
    if-eqz v0, :cond_e

    .line 40
    .line 41
    add-int/lit8 v0, v0, -0x1

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Lj0/b;->k(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Ly0/n;

    .line 48
    .line 49
    iget v3, v0, Ly0/n;->j:I

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
    iget-boolean v5, v3, Ly0/n;->t:Z

    .line 60
    .line 61
    if-eqz v5, :cond_d

    .line 62
    .line 63
    iget v5, v3, Ly0/n;->i:I

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
    instance-of v8, v6, Lx1/e2;

    .line 74
    .line 75
    if-eqz v8, :cond_5

    .line 76
    .line 77
    check-cast v6, Lx1/e2;

    .line 78
    .line 79
    invoke-interface {p0}, Lx1/e2;->F()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    invoke-interface {v6}, Lx1/e2;->F()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    invoke-static {v8, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    invoke-interface {p1, v6}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    check-cast v6, Lx1/d2;

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_3
    sget-object v6, Lx1/d2;->g:Lx1/d2;

    .line 111
    .line 112
    :goto_3
    sget-object v8, Lx1/d2;->i:Lx1/d2;

    .line 113
    .line 114
    if-ne v6, v8, :cond_4

    .line 115
    .line 116
    goto :goto_7

    .line 117
    :cond_4
    sget-object v8, Lx1/d2;->h:Lx1/d2;

    .line 118
    .line 119
    if-eq v6, v8, :cond_2

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_5
    iget v8, v6, Ly0/n;->i:I

    .line 123
    .line 124
    and-int/2addr v8, v4

    .line 125
    if-eqz v8, :cond_b

    .line 126
    .line 127
    instance-of v8, v6, Lx1/j;

    .line 128
    .line 129
    if-eqz v8, :cond_b

    .line 130
    .line 131
    move-object v8, v6

    .line 132
    check-cast v8, Lx1/j;

    .line 133
    .line 134
    iget-object v8, v8, Lx1/j;->v:Ly0/n;

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
    iget v11, v8, Ly0/n;->i:I

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
    new-instance v7, Lj0/b;

    .line 154
    .line 155
    new-array v10, v2, [Ly0/n;

    .line 156
    .line 157
    invoke-direct {v7, v10}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    :cond_7
    if-eqz v6, :cond_8

    .line 161
    .line 162
    invoke-virtual {v7, v6}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    move-object v6, v5

    .line 166
    :cond_8
    invoke-virtual {v7, v8}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    :cond_9
    :goto_5
    iget-object v8, v8, Ly0/n;->l:Ly0/n;

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
    invoke-static {v7}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    goto :goto_2

    .line 180
    :cond_c
    iget-object v3, v3, Ly0/n;->l:Ly0/n;

    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_d
    invoke-static {v1, v0}, Lx1/k;->b(Lj0/b;Ly0/n;)V

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

.method public static final C(Ly0/n;Ljava/lang/String;Lfg/l;)V
    .locals 11

    .line 1
    iget-object v0, p0, Ly0/n;->g:Ly0/n;

    .line 2
    .line 3
    iget-boolean v0, v0, Ly0/n;->t:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "visitSubtreeIf called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    new-instance v0, Lj0/b;

    .line 13
    .line 14
    const/16 v1, 0x10

    .line 15
    .line 16
    new-array v2, v1, [Ly0/n;

    .line 17
    .line 18
    invoke-direct {v0, v2}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Ly0/n;->g:Ly0/n;

    .line 22
    .line 23
    iget-object v2, p0, Ly0/n;->l:Ly0/n;

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    invoke-static {v0, p0}, Lx1/k;->b(Lj0/b;Ly0/n;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {v0, v2}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_2
    :goto_0
    iget p0, v0, Lj0/b;->i:I

    .line 35
    .line 36
    if-eqz p0, :cond_e

    .line 37
    .line 38
    add-int/lit8 p0, p0, -0x1

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Lj0/b;->k(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Ly0/n;

    .line 45
    .line 46
    iget v2, p0, Ly0/n;->j:I

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
    iget-boolean v4, v2, Ly0/n;->t:Z

    .line 57
    .line 58
    if-eqz v4, :cond_d

    .line 59
    .line 60
    iget v4, v2, Ly0/n;->i:I

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
    instance-of v7, v5, Lx1/e2;

    .line 71
    .line 72
    if-eqz v7, :cond_5

    .line 73
    .line 74
    check-cast v5, Lx1/e2;

    .line 75
    .line 76
    invoke-interface {v5}, Lx1/e2;->F()Ljava/lang/Object;

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
    invoke-interface {p2, v5}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    check-cast v5, Lx1/d2;

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_3
    sget-object v5, Lx1/d2;->g:Lx1/d2;

    .line 94
    .line 95
    :goto_3
    sget-object v7, Lx1/d2;->i:Lx1/d2;

    .line 96
    .line 97
    if-ne v5, v7, :cond_4

    .line 98
    .line 99
    goto :goto_7

    .line 100
    :cond_4
    sget-object v7, Lx1/d2;->h:Lx1/d2;

    .line 101
    .line 102
    if-eq v5, v7, :cond_2

    .line 103
    .line 104
    goto :goto_6

    .line 105
    :cond_5
    iget v7, v5, Ly0/n;->i:I

    .line 106
    .line 107
    and-int/2addr v7, v3

    .line 108
    if-eqz v7, :cond_b

    .line 109
    .line 110
    instance-of v7, v5, Lx1/j;

    .line 111
    .line 112
    if-eqz v7, :cond_b

    .line 113
    .line 114
    move-object v7, v5

    .line 115
    check-cast v7, Lx1/j;

    .line 116
    .line 117
    iget-object v7, v7, Lx1/j;->v:Ly0/n;

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
    iget v10, v7, Ly0/n;->i:I

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
    new-instance v6, Lj0/b;

    .line 137
    .line 138
    new-array v9, v1, [Ly0/n;

    .line 139
    .line 140
    invoke-direct {v6, v9}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_7
    if-eqz v5, :cond_8

    .line 144
    .line 145
    invoke-virtual {v6, v5}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    move-object v5, v4

    .line 149
    :cond_8
    invoke-virtual {v6, v7}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :cond_9
    :goto_5
    iget-object v7, v7, Ly0/n;->l:Ly0/n;

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
    invoke-static {v6}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    goto :goto_2

    .line 163
    :cond_c
    iget-object v2, v2, Ly0/n;->l:Ly0/n;

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_d
    invoke-static {v0, p0}, Lx1/k;->b(Lj0/b;Ly0/n;)V

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

.method public static final a(FZZ)J
    .locals 4

    .line 1
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    int-to-long v0, p0

    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const-wide/16 p0, 0x1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-wide p0, v2

    .line 14
    :goto_0
    if-eqz p2, :cond_1

    .line 15
    .line 16
    const-wide/16 v2, 0x2

    .line 17
    .line 18
    :cond_1
    or-long/2addr p0, v2

    .line 19
    const/16 p2, 0x20

    .line 20
    .line 21
    shl-long/2addr v0, p2

    .line 22
    const-wide v2, 0xffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    and-long/2addr p0, v2

    .line 28
    or-long/2addr p0, v0

    .line 29
    return-wide p0
.end method

.method public static final b(Lj0/b;Ly0/n;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lx1/f0;->y()Lj0/b;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget v0, p1, Lj0/b;->i:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    iget-object p1, p1, Lj0/b;->g:[Ljava/lang/Object;

    .line 14
    .line 15
    array-length v1, p1

    .line 16
    if-ge v0, v1, :cond_0

    .line 17
    .line 18
    :goto_0
    if-ltz v0, :cond_0

    .line 19
    .line 20
    aget-object v1, p1, v0

    .line 21
    .line 22
    check-cast v1, Lx1/f0;

    .line 23
    .line 24
    iget-object v1, v1, Lx1/f0;->L:Lx1/b1;

    .line 25
    .line 26
    iget-object v1, v1, Lx1/b1;->f:Ly0/n;

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    add-int/lit8 v0, v0, -0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-void
.end method

.method public static final c(Lx1/n0;Lv1/j;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lx1/n0;->S0()Lx1/n0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v2, "Child of "

    .line 11
    .line 12
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v2, " cannot be null when calculating alignment line"

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v1}, Lu1/a;->b(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-virtual {p0}, Lx1/n0;->Z0()Lv1/o0;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, Lv1/o0;->e()Ljava/util/Map;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/high16 v2, -0x80000000

    .line 43
    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0}, Lx1/n0;->Z0()Lv1/o0;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-interface {p0}, Lv1/o0;->e()Ljava/util/Map;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, Ljava/lang/Integer;

    .line 59
    .line 60
    if-eqz p0, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    return p0

    .line 67
    :cond_1
    invoke-virtual {v0, p1}, Lx1/n0;->R0(Lv1/j;)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-ne v1, v2, :cond_3

    .line 72
    .line 73
    :cond_2
    return v2

    .line 74
    :cond_3
    const/4 v2, 0x1

    .line 75
    iput-boolean v2, v0, Lx1/n0;->p:Z

    .line 76
    .line 77
    iput-boolean v2, p0, Lx1/n0;->q:Z

    .line 78
    .line 79
    invoke-virtual {p0}, Lx1/n0;->f1()V

    .line 80
    .line 81
    .line 82
    const/4 v2, 0x0

    .line 83
    iput-boolean v2, v0, Lx1/n0;->p:Z

    .line 84
    .line 85
    iput-boolean v2, p0, Lx1/n0;->q:Z

    .line 86
    .line 87
    instance-of p0, p1, Lv1/j;

    .line 88
    .line 89
    if-eqz p0, :cond_4

    .line 90
    .line 91
    invoke-virtual {v0}, Lx1/n0;->b1()J

    .line 92
    .line 93
    .line 94
    move-result-wide p0

    .line 95
    const-wide v2, 0xffffffffL

    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    and-long/2addr p0, v2

    .line 101
    :goto_1
    long-to-int p0, p0

    .line 102
    add-int/2addr v1, p0

    .line 103
    return v1

    .line 104
    :cond_4
    invoke-virtual {v0}, Lx1/n0;->b1()J

    .line 105
    .line 106
    .line 107
    move-result-wide p0

    .line 108
    const/16 v0, 0x20

    .line 109
    .line 110
    shr-long/2addr p0, v0

    .line 111
    goto :goto_1
.end method

.method public static final d(Lx1/i;I)Ly0/n;
    .locals 2

    .line 1
    check-cast p0, Ly0/n;

    .line 2
    .line 3
    iget-object p0, p0, Ly0/n;->g:Ly0/n;

    .line 4
    .line 5
    iget-object p0, p0, Ly0/n;->l:Ly0/n;

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    iget v0, p0, Ly0/n;->j:I

    .line 11
    .line 12
    and-int/2addr v0, p1

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    if-eqz p0, :cond_4

    .line 17
    .line 18
    iget v0, p0, Ly0/n;->i:I

    .line 19
    .line 20
    and-int/lit8 v1, v0, 0x2

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    and-int/2addr v0, p1

    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_3
    iget-object p0, p0, Ly0/n;->l:Ly0/n;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public static final e(Lj0/b;)Ly0/n;
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget v0, p0, Lj0/b;->i:I

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lj0/b;->k(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Ly0/n;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public static final f(Ly0/n;)Lx1/v;
    .locals 2

    .line 1
    iget v0, p0, Ly0/n;->i:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    instance-of v0, p0, Lx1/v;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p0, Lx1/v;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    instance-of v0, p0, Lx1/j;

    .line 16
    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    check-cast p0, Lx1/j;

    .line 20
    .line 21
    iget-object p0, p0, Lx1/j;->v:Ly0/n;

    .line 22
    .line 23
    :goto_0
    if-eqz p0, :cond_3

    .line 24
    .line 25
    instance-of v0, p0, Lx1/v;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    check-cast p0, Lx1/v;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_1
    instance-of v0, p0, Lx1/j;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    iget v0, p0, Ly0/n;->i:I

    .line 37
    .line 38
    and-int/lit8 v0, v0, 0x2

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    check-cast p0, Lx1/j;

    .line 43
    .line 44
    iget-object p0, p0, Lx1/j;->v:Ly0/n;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    iget-object p0, p0, Ly0/n;->l:Ly0/n;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    return-object v1
.end method

.method public static final g(JJ)I
    .locals 5

    .line 1
    invoke-static {p0, p1}, Lx1/k;->p(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p2, p3}, Lx1/k;->p(J)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, -0x1

    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return v3

    .line 16
    :cond_0
    return v2

    .line 17
    :cond_1
    invoke-static {p0, p1}, Lx1/k;->k(J)F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {p2, p3}, Lx1/k;->k(J)F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    sub-float/2addr v0, v1

    .line 26
    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    float-to-int v0, v0

    .line 31
    invoke-static {p0, p1}, Lx1/k;->k(J)F

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-static {p2, p3}, Lx1/k;->k(J)F

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    invoke-static {v1, v4}, Ljava/lang/Math;->min(FF)F

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v4, 0x0

    .line 44
    cmpg-float v1, v1, v4

    .line 45
    .line 46
    if-gez v1, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-static {p0, p1}, Lx1/k;->o(J)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-static {p2, p3}, Lx1/k;->o(J)Z

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    if-eq v1, p2, :cond_4

    .line 58
    .line 59
    invoke-static {p0, p1}, Lx1/k;->o(J)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_3

    .line 64
    .line 65
    return v3

    .line 66
    :cond_3
    return v2

    .line 67
    :cond_4
    :goto_0
    return v0
.end method

.method public static final h(Lx1/h;Li0/p1;)Ljava/lang/Object;
    .locals 1

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Ly0/n;

    .line 3
    .line 4
    iget-object v0, v0, Ly0/n;->g:Ly0/n;

    .line 5
    .line 6
    iget-boolean v0, v0, Ly0/n;->t:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "Cannot read CompositionLocal because the Modifier node is not currently attached."

    .line 11
    .line 12
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p0, p0, Lx1/f0;->H:Li0/t;

    .line 20
    .line 21
    check-cast p0, Ls0/h;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {p0, p1}, Li0/r;->v(Ls0/h;Li0/p1;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public static final i(Ly0/n;ZZ)Le1/c;
    .locals 1

    .line 1
    iget-object v0, p0, Ly0/n;->g:Ly0/n;

    .line 2
    .line 3
    iget-boolean v0, v0, Ly0/n;->t:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Le1/c;->e:Le1/c;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/16 v0, 0x8

    .line 11
    .line 12
    if-nez p1, :cond_1

    .line 13
    .line 14
    invoke-static {p0, v0}, Lx1/k;->t(Lx1/i;I)Lx1/i1;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Lv1/w;->h(Lv1/t;)Lv1/t;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1, p0, p2}, Lv1/t;->k0(Lv1/t;Z)Le1/c;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_1
    invoke-static {p0, v0}, Lx1/k;->t(Lx1/i;I)Lx1/i1;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Lx1/i1;->N1()Le1/c;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public static final j(Lx1/j;Ljava/lang/Object;)Lx1/e2;
    .locals 9

    .line 1
    iget-object v0, p0, Ly0/n;->g:Ly0/n;

    .line 2
    .line 3
    iget-boolean v0, v0, Ly0/n;->t:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "visitAncestors called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Ly0/n;->g:Ly0/n;

    .line 13
    .line 14
    iget-object v0, v0, Ly0/n;->k:Ly0/n;

    .line 15
    .line 16
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

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
    iget-object v2, p0, Lx1/f0;->L:Lx1/b1;

    .line 24
    .line 25
    iget-object v2, v2, Lx1/b1;->f:Ly0/n;

    .line 26
    .line 27
    iget v2, v2, Ly0/n;->j:I

    .line 28
    .line 29
    const/high16 v3, 0x40000

    .line 30
    .line 31
    and-int/2addr v2, v3

    .line 32
    if-eqz v2, :cond_9

    .line 33
    .line 34
    :goto_1
    if-eqz v0, :cond_9

    .line 35
    .line 36
    iget v2, v0, Ly0/n;->i:I

    .line 37
    .line 38
    and-int/2addr v2, v3

    .line 39
    if-eqz v2, :cond_8

    .line 40
    .line 41
    move-object v2, v0

    .line 42
    move-object v4, v1

    .line 43
    :goto_2
    if-eqz v2, :cond_8

    .line 44
    .line 45
    instance-of v5, v2, Lx1/e2;

    .line 46
    .line 47
    if-eqz v5, :cond_1

    .line 48
    .line 49
    move-object v5, v2

    .line 50
    check-cast v5, Lx1/e2;

    .line 51
    .line 52
    invoke-interface {v5}, Lx1/e2;->F()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    invoke-virtual {p1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-eqz v6, :cond_1

    .line 61
    .line 62
    return-object v5

    .line 63
    :cond_1
    iget v5, v2, Ly0/n;->i:I

    .line 64
    .line 65
    and-int/2addr v5, v3

    .line 66
    if-eqz v5, :cond_7

    .line 67
    .line 68
    instance-of v5, v2, Lx1/j;

    .line 69
    .line 70
    if-eqz v5, :cond_7

    .line 71
    .line 72
    move-object v5, v2

    .line 73
    check-cast v5, Lx1/j;

    .line 74
    .line 75
    iget-object v5, v5, Lx1/j;->v:Ly0/n;

    .line 76
    .line 77
    const/4 v6, 0x0

    .line 78
    :goto_3
    const/4 v7, 0x1

    .line 79
    if-eqz v5, :cond_6

    .line 80
    .line 81
    iget v8, v5, Ly0/n;->i:I

    .line 82
    .line 83
    and-int/2addr v8, v3

    .line 84
    if-eqz v8, :cond_5

    .line 85
    .line 86
    add-int/lit8 v6, v6, 0x1

    .line 87
    .line 88
    if-ne v6, v7, :cond_2

    .line 89
    .line 90
    move-object v2, v5

    .line 91
    goto :goto_4

    .line 92
    :cond_2
    if-nez v4, :cond_3

    .line 93
    .line 94
    new-instance v4, Lj0/b;

    .line 95
    .line 96
    const/16 v7, 0x10

    .line 97
    .line 98
    new-array v7, v7, [Ly0/n;

    .line 99
    .line 100
    invoke-direct {v4, v7}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :cond_3
    if-eqz v2, :cond_4

    .line 104
    .line 105
    invoke-virtual {v4, v2}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    move-object v2, v1

    .line 109
    :cond_4
    invoke-virtual {v4, v5}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    :cond_5
    :goto_4
    iget-object v5, v5, Ly0/n;->l:Ly0/n;

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_6
    if-ne v6, v7, :cond_7

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_7
    invoke-static {v4}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    goto :goto_2

    .line 123
    :cond_8
    iget-object v0, v0, Ly0/n;->k:Ly0/n;

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_9
    invoke-virtual {p0}, Lx1/f0;->u()Lx1/f0;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    if-eqz p0, :cond_a

    .line 131
    .line 132
    iget-object v0, p0, Lx1/f0;->L:Lx1/b1;

    .line 133
    .line 134
    if-eqz v0, :cond_a

    .line 135
    .line 136
    iget-object v0, v0, Lx1/b1;->e:Lx1/b2;

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_a
    move-object v0, v1

    .line 140
    goto :goto_0

    .line 141
    :cond_b
    return-object v1
.end method

.method public static final k(J)F
    .locals 1

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long/2addr p0, v0

    .line 4
    long-to-int p0, p0

    .line 5
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public static final l(Lx1/m;)V
    .locals 1

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Ly0/n;

    .line 3
    .line 4
    iget-object v0, v0, Ly0/n;->g:Ly0/n;

    .line 5
    .line 6
    iget-boolean v0, v0, Ly0/n;->t:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-static {p0, v0}, Lx1/k;->t(Lx1/i;I)Lx1/i1;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Lx1/i1;->y1()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public static final m(Lx1/v;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lx1/f0;->D()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final n(Lx1/z1;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lx1/f0;->E()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final o(J)Z
    .locals 2

    .line 1
    const-wide/16 v0, 0x2

    .line 2
    .line 3
    and-long/2addr p0, v0

    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long p0, p0, v0

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public static final p(J)Z
    .locals 2

    .line 1
    const-wide/16 v0, 0x1

    .line 2
    .line 3
    and-long/2addr p0, v0

    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long p0, p0, v0

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public static final q(Lx1/f0;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/f0;->n:Lx1/f0;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p0}, Lx1/f0;->u()Lx1/f0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lx1/f0;->n:Lx1/f0;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object p0, p0, Lx1/f0;->M:Lx1/j0;

    .line 18
    .line 19
    iget-boolean p0, p0, Lx1/j0;->b:Z

    .line 20
    .line 21
    if-eqz p0, :cond_2

    .line 22
    .line 23
    :cond_1
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_2
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public static final r(Ly0/n;Lfg/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ly0/n;->m:Lx1/n1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lx1/n1;

    .line 6
    .line 7
    move-object v1, p0

    .line 8
    check-cast v1, Lx1/m1;

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lx1/n1;-><init>(Lx1/m1;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Ly0/n;->m:Lx1/n1;

    .line 14
    .line 15
    :cond_0
    invoke-static {p0}, Lx1/k;->x(Lx1/i;)Lx1/r1;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ly1/t;

    .line 20
    .line 21
    invoke-virtual {p0}, Ly1/t;->getSnapshotObserver()Lx1/t1;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    sget-object v1, Lx1/d;->l:Lx1/d;

    .line 26
    .line 27
    iget-object p0, p0, Lx1/t1;->a:Lw0/s;

    .line 28
    .line 29
    invoke-virtual {p0, v0, v1, p1}, Lw0/s;->c(Ljava/lang/Object;Lfg/l;Lfg/a;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public static final s(Lx1/i;)V
    .locals 4

    .line 1
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-boolean v0, p0, Lx1/f0;->z:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p0}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ly1/t;

    .line 15
    .line 16
    iget-object v0, v0, Ly1/t;->T:Lz0/c;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v1, v0, Lz0/c;->j:Lg2/b;

    .line 21
    .line 22
    iget-object v1, v1, Lg2/b;->b:Lac/k;

    .line 23
    .line 24
    iget v2, p0, Lx1/f0;->h:I

    .line 25
    .line 26
    new-instance v3, Lz0/b;

    .line 27
    .line 28
    invoke-direct {v3, v0, p0}, Lz0/b;-><init>(Lz0/c;Lx1/f0;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2, v3}, Lac/k;->P(ILfg/r;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    return-void
.end method

.method public static final t(Lx1/i;I)Lx1/i1;
    .locals 2

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Ly0/n;

    .line 3
    .line 4
    iget-object v0, v0, Ly0/n;->g:Ly0/n;

    .line 5
    .line 6
    iget-object v0, v0, Ly0/n;->n:Lx1/i1;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lx1/i1;->r1()Ly0/n;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eq v1, p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static {p1}, Lx1/j1;->g(I)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    iget-object p0, v0, Lx1/i1;->v:Lx1/i1;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_1
    :goto_0
    return-object v0
.end method

.method public static final u(Ly0/n;)Lf1/z;
    .locals 0

    .line 1
    invoke-static {p0}, Lx1/k;->x(Lx1/i;)Lx1/r1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ly1/t;

    .line 6
    .line 7
    invoke-virtual {p0}, Ly1/t;->getGraphicsContext()Lf1/z;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static final v(Lx1/i;)Lx1/i1;
    .locals 1

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Ly0/n;

    .line 3
    .line 4
    iget-object v0, v0, Ly0/n;->g:Ly0/n;

    .line 5
    .line 6
    iget-boolean v0, v0, Ly0/n;->t:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "Cannot get LayoutCoordinates, Modifier.Node is not attached."

    .line 11
    .line 12
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    const/4 v0, 0x2

    .line 16
    invoke-static {p0, v0}, Lx1/k;->t(Lx1/i;I)Lx1/i1;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Lx1/i1;->r1()Ly0/n;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-boolean v0, v0, Ly0/n;->t:Z

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    const-string v0, "LayoutCoordinates is not attached."

    .line 29
    .line 30
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-object p0
.end method

.method public static final w(Lx1/i;)Lx1/f0;
    .locals 0

    .line 1
    check-cast p0, Ly0/n;

    .line 2
    .line 3
    iget-object p0, p0, Ly0/n;->g:Ly0/n;

    .line 4
    .line 5
    iget-object p0, p0, Ly0/n;->n:Lx1/i1;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lx1/i1;->u:Lx1/f0;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "Cannot obtain node coordinator. Is the Modifier.Node attached?"

    .line 13
    .line 14
    invoke-static {p0}, Lwb/en;->a(Ljava/lang/String;)Laf/d;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    throw p0
.end method

.method public static final x(Lx1/i;)Lx1/r1;
    .locals 0

    .line 1
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Lx1/f0;->t:Lx1/r1;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-string p0, "This node does not have an owner."

    .line 11
    .line 12
    invoke-static {p0}, Lwb/en;->a(Ljava/lang/String;)Laf/d;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    throw p0
.end method

.method public static final y(Lx1/i;)Landroid/view/View;
    .locals 1

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Ly0/n;

    .line 3
    .line 4
    iget-object v0, v0, Ly0/n;->g:Ly0/n;

    .line 5
    .line 6
    iget-boolean v0, v0, Ly0/n;->t:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "Cannot get View because the Modifier node is not currently attached."

    .line 11
    .line 12
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Landroid/view/View;

    .line 24
    .line 25
    return-object p0
.end method

.method public static final z(Lx1/i;Ljava/lang/Object;Lfg/l;)V
    .locals 10

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Ly0/n;

    .line 3
    .line 4
    iget-object v1, v0, Ly0/n;->g:Ly0/n;

    .line 5
    .line 6
    iget-boolean v1, v1, Ly0/n;->t:Z

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    const-string v1, "visitAncestors called on an unattached node"

    .line 11
    .line 12
    invoke-static {v1}, Lu1/a;->b(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, v0, Ly0/n;->g:Ly0/n;

    .line 16
    .line 17
    iget-object v0, v0, Ly0/n;->k:Ly0/n;

    .line 18
    .line 19
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :goto_0
    if-eqz p0, :cond_f

    .line 24
    .line 25
    iget-object v1, p0, Lx1/f0;->L:Lx1/b1;

    .line 26
    .line 27
    iget-object v1, v1, Lx1/b1;->f:Ly0/n;

    .line 28
    .line 29
    iget v1, v1, Ly0/n;->j:I

    .line 30
    .line 31
    const/high16 v2, 0x40000

    .line 32
    .line 33
    and-int/2addr v1, v2

    .line 34
    const/4 v3, 0x0

    .line 35
    if-eqz v1, :cond_d

    .line 36
    .line 37
    :goto_1
    if-eqz v0, :cond_d

    .line 38
    .line 39
    iget v1, v0, Ly0/n;->i:I

    .line 40
    .line 41
    and-int/2addr v1, v2

    .line 42
    if-eqz v1, :cond_c

    .line 43
    .line 44
    move-object v1, v0

    .line 45
    move-object v4, v3

    .line 46
    :goto_2
    if-eqz v1, :cond_c

    .line 47
    .line 48
    instance-of v5, v1, Lx1/e2;

    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    const/4 v7, 0x1

    .line 52
    if-eqz v5, :cond_3

    .line 53
    .line 54
    move-object v5, v1

    .line 55
    check-cast v5, Lx1/e2;

    .line 56
    .line 57
    invoke-interface {v5}, Lx1/e2;->F()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    invoke-virtual {p1, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    if-eqz v8, :cond_1

    .line 66
    .line 67
    invoke-interface {p2, v5}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    check-cast v5, Ljava/lang/Boolean;

    .line 72
    .line 73
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    goto :goto_3

    .line 78
    :cond_1
    move v5, v7

    .line 79
    :goto_3
    if-nez v5, :cond_2

    .line 80
    .line 81
    goto/16 :goto_9

    .line 82
    .line 83
    :cond_2
    move v5, v6

    .line 84
    goto :goto_4

    .line 85
    :cond_3
    move v5, v7

    .line 86
    :goto_4
    if-eqz v5, :cond_b

    .line 87
    .line 88
    iget v5, v1, Ly0/n;->i:I

    .line 89
    .line 90
    and-int/2addr v5, v2

    .line 91
    if-eqz v5, :cond_4

    .line 92
    .line 93
    move v5, v7

    .line 94
    goto :goto_5

    .line 95
    :cond_4
    move v5, v6

    .line 96
    :goto_5
    if-eqz v5, :cond_b

    .line 97
    .line 98
    instance-of v5, v1, Lx1/j;

    .line 99
    .line 100
    if-eqz v5, :cond_b

    .line 101
    .line 102
    move-object v5, v1

    .line 103
    check-cast v5, Lx1/j;

    .line 104
    .line 105
    iget-object v5, v5, Lx1/j;->v:Ly0/n;

    .line 106
    .line 107
    move v8, v6

    .line 108
    :goto_6
    if-eqz v5, :cond_a

    .line 109
    .line 110
    iget v9, v5, Ly0/n;->i:I

    .line 111
    .line 112
    and-int/2addr v9, v2

    .line 113
    if-eqz v9, :cond_5

    .line 114
    .line 115
    move v9, v7

    .line 116
    goto :goto_7

    .line 117
    :cond_5
    move v9, v6

    .line 118
    :goto_7
    if-eqz v9, :cond_9

    .line 119
    .line 120
    add-int/lit8 v8, v8, 0x1

    .line 121
    .line 122
    if-ne v8, v7, :cond_6

    .line 123
    .line 124
    move-object v1, v5

    .line 125
    goto :goto_8

    .line 126
    :cond_6
    if-nez v4, :cond_7

    .line 127
    .line 128
    new-instance v4, Lj0/b;

    .line 129
    .line 130
    const/16 v9, 0x10

    .line 131
    .line 132
    new-array v9, v9, [Ly0/n;

    .line 133
    .line 134
    invoke-direct {v4, v9}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    :cond_7
    if-eqz v1, :cond_8

    .line 138
    .line 139
    invoke-virtual {v4, v1}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    move-object v1, v3

    .line 143
    :cond_8
    invoke-virtual {v4, v5}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :cond_9
    :goto_8
    iget-object v5, v5, Ly0/n;->l:Ly0/n;

    .line 147
    .line 148
    goto :goto_6

    .line 149
    :cond_a
    if-ne v8, v7, :cond_b

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_b
    invoke-static {v4}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    goto :goto_2

    .line 157
    :cond_c
    iget-object v0, v0, Ly0/n;->k:Ly0/n;

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_d
    invoke-virtual {p0}, Lx1/f0;->u()Lx1/f0;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    if-eqz p0, :cond_e

    .line 165
    .line 166
    iget-object v0, p0, Lx1/f0;->L:Lx1/b1;

    .line 167
    .line 168
    if-eqz v0, :cond_e

    .line 169
    .line 170
    iget-object v0, v0, Lx1/b1;->e:Lx1/b2;

    .line 171
    .line 172
    goto/16 :goto_0

    .line 173
    .line 174
    :cond_e
    move-object v0, v3

    .line 175
    goto/16 :goto_0

    .line 176
    .line 177
    :cond_f
    :goto_9
    return-void
.end method
