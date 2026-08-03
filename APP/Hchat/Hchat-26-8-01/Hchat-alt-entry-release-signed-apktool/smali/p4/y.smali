.class public final Lp4/y;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lf1/h;

.field public final b:I

.field public final c:Lb5/c;

.field public final d:Lp4/t;

.field public final e:Lhb/c;

.field public final f:I

.field public g:[I

.field public final h:I

.field public final i:Z


# direct methods
.method public constructor <init>(Lf1/h;IILn4/a;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp4/y;->a:Lf1/h;

    .line 5
    .line 6
    iput p2, p0, Lp4/y;->b:I

    .line 7
    .line 8
    new-instance p2, Lb5/c;

    .line 9
    .line 10
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p1, Lf1/h;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lu4/c;

    .line 16
    .line 17
    invoke-virtual {v0}, Lz4/i;->o()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    new-array v2, v1, [Lp4/f;

    .line 22
    .line 23
    iput-object v2, p2, Lb5/c;->a:Ljava/lang/Object;

    .line 24
    .line 25
    new-array v2, v1, [Lp4/f;

    .line 26
    .line 27
    iput-object v2, p2, Lb5/c;->b:Ljava/lang/Object;

    .line 28
    .line 29
    new-array v1, v1, [Lp4/f;

    .line 30
    .line 31
    iput-object v1, p2, Lb5/c;->c:Ljava/lang/Object;

    .line 32
    .line 33
    iget-object v1, v0, Lz4/e;->h:[Ljava/lang/Object;

    .line 34
    .line 35
    array-length v1, v1

    .line 36
    const/4 v2, 0x0

    .line 37
    move v3, v2

    .line 38
    :goto_0
    if-ge v3, v1, :cond_0

    .line 39
    .line 40
    invoke-virtual {v0, v3}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    check-cast v4, Lu4/b;

    .line 45
    .line 46
    iget-object v5, v4, Lu4/b;->b:Lh4/u;

    .line 47
    .line 48
    iget v4, v4, Lu4/b;->a:I

    .line 49
    .line 50
    invoke-virtual {v5, v2}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    check-cast v6, Lu4/i;

    .line 55
    .line 56
    iget-object v7, p2, Lb5/c;->a:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v7, [Lp4/f;

    .line 59
    .line 60
    new-instance v8, Lp4/f;

    .line 61
    .line 62
    iget-object v6, v6, Lu4/i;->h:Lu4/t;

    .line 63
    .line 64
    invoke-direct {v8, v6, v2}, Lp4/f;-><init>(Lu4/t;Z)V

    .line 65
    .line 66
    .line 67
    aput-object v8, v7, v4

    .line 68
    .line 69
    invoke-virtual {v5}, Lh4/u;->p()Lu4/i;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    iget-object v5, v5, Lu4/i;->h:Lu4/t;

    .line 74
    .line 75
    iget-object v6, p2, Lb5/c;->b:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v6, [Lp4/f;

    .line 78
    .line 79
    new-instance v7, Lp4/f;

    .line 80
    .line 81
    invoke-direct {v7, v5, v2}, Lp4/f;-><init>(Lu4/t;Z)V

    .line 82
    .line 83
    .line 84
    aput-object v7, v6, v4

    .line 85
    .line 86
    iget-object v6, p2, Lb5/c;->c:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v6, [Lp4/f;

    .line 89
    .line 90
    new-instance v7, Lp4/f;

    .line 91
    .line 92
    invoke-direct {v7, v5, v2}, Lp4/f;-><init>(Lu4/t;Z)V

    .line 93
    .line 94
    .line 95
    aput-object v7, v6, v4

    .line 96
    .line 97
    add-int/lit8 v3, v3, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    iput-object p2, p0, Lp4/y;->c:Lb5/c;

    .line 101
    .line 102
    iput p3, p0, Lp4/y;->h:I

    .line 103
    .line 104
    const/4 p2, 0x0

    .line 105
    iput-object p2, p0, Lp4/y;->g:[I

    .line 106
    .line 107
    const/4 p2, 0x1

    .line 108
    new-array v0, p2, [Z

    .line 109
    .line 110
    aput-boolean p2, v0, v2

    .line 111
    .line 112
    iget-object p1, p1, Lf1/h;->i:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast p1, Lu4/c;

    .line 115
    .line 116
    invoke-virtual {p1}, Lu4/c;->r()I

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    new-instance v1, Li/u1;

    .line 121
    .line 122
    invoke-direct {v1, v0, p2, p3}, Li/u1;-><init>([ZII)V

    .line 123
    .line 124
    .line 125
    iget-object p2, p1, Lz4/e;->h:[Ljava/lang/Object;

    .line 126
    .line 127
    array-length p2, p2

    .line 128
    move v3, v2

    .line 129
    :goto_1
    if-ge v3, p2, :cond_2

    .line 130
    .line 131
    invoke-virtual {p1, v3}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    check-cast v4, Lu4/b;

    .line 136
    .line 137
    iget-object v4, v4, Lu4/b;->b:Lh4/u;

    .line 138
    .line 139
    iget-object v5, v4, Lz4/e;->h:[Ljava/lang/Object;

    .line 140
    .line 141
    array-length v5, v5

    .line 142
    move v6, v2

    .line 143
    :goto_2
    if-ge v6, v5, :cond_1

    .line 144
    .line 145
    invoke-virtual {v4, v6}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    check-cast v7, Lu4/i;

    .line 150
    .line 151
    invoke-virtual {v7, v1}, Lu4/i;->d(Lu4/h;)V

    .line 152
    .line 153
    .line 154
    add-int/lit8 v6, v6, 0x1

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_2
    aget-boolean p2, v0, v2

    .line 161
    .line 162
    iput-boolean p2, p0, Lp4/y;->i:Z

    .line 163
    .line 164
    iget-object v0, p1, Lz4/e;->h:[Ljava/lang/Object;

    .line 165
    .line 166
    array-length v1, v0

    .line 167
    mul-int/lit8 v6, v1, 0x3

    .line 168
    .line 169
    array-length v0, v0

    .line 170
    move v1, v2

    .line 171
    move v3, v1

    .line 172
    :goto_3
    if-ge v1, v0, :cond_4

    .line 173
    .line 174
    iget-object v4, p1, Lz4/e;->h:[Ljava/lang/Object;

    .line 175
    .line 176
    aget-object v4, v4, v1

    .line 177
    .line 178
    check-cast v4, Lu4/b;

    .line 179
    .line 180
    if-eqz v4, :cond_3

    .line 181
    .line 182
    iget-object v4, v4, Lu4/b;->b:Lh4/u;

    .line 183
    .line 184
    iget-object v4, v4, Lz4/e;->h:[Ljava/lang/Object;

    .line 185
    .line 186
    array-length v4, v4

    .line 187
    add-int/2addr v3, v4

    .line 188
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_4
    add-int v5, v3, v6

    .line 192
    .line 193
    invoke-virtual {p1}, Lu4/c;->r()I

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    if-eqz p2, :cond_5

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_5
    move v2, p3

    .line 201
    :goto_4
    add-int v7, p1, v2

    .line 202
    .line 203
    iput v7, p0, Lp4/y;->f:I

    .line 204
    .line 205
    new-instance v3, Lp4/t;

    .line 206
    .line 207
    move v8, p3

    .line 208
    move-object v4, p4

    .line 209
    invoke-direct/range {v3 .. v8}, Lp4/t;-><init>(Ln4/a;IIII)V

    .line 210
    .line 211
    .line 212
    iput-object v3, p0, Lp4/y;->d:Lp4/t;

    .line 213
    .line 214
    new-instance p1, Lhb/c;

    .line 215
    .line 216
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 217
    .line 218
    .line 219
    iput-object p0, p1, Lhb/c;->j:Ljava/lang/Object;

    .line 220
    .line 221
    iput-object v3, p1, Lhb/c;->g:Ljava/lang/Object;

    .line 222
    .line 223
    iput-object p1, p0, Lp4/y;->e:Lhb/c;

    .line 224
    .line 225
    return-void
.end method

.method public static a(Lu4/i;Lu4/o;)Lu4/p;
    .locals 5

    .line 1
    iget-object v0, p0, Lu4/i;->j:Lu4/p;

    .line 2
    .line 3
    iget-object p0, p0, Lu4/i;->g:Lu4/r;

    .line 4
    .line 5
    iget p0, p0, Lu4/r;->a:I

    .line 6
    .line 7
    const/16 v1, 0xe

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eq p0, v1, :cond_0

    .line 11
    .line 12
    const/16 v1, 0x10

    .line 13
    .line 14
    if-eq p0, v1, :cond_0

    .line 15
    .line 16
    packed-switch p0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    :pswitch_0
    iget-object p0, v0, Lz4/e;->h:[Ljava/lang/Object;

    .line 21
    .line 22
    array-length p0, p0

    .line 23
    const/4 v1, 0x2

    .line 24
    if-ne p0, v1, :cond_1

    .line 25
    .line 26
    iget p0, p1, Lu4/o;->g:I

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-virtual {v0, v1}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Lu4/o;

    .line 34
    .line 35
    iget v3, v3, Lu4/o;->g:I

    .line 36
    .line 37
    if-ne p0, v3, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Lu4/o;

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Lu4/o;

    .line 50
    .line 51
    invoke-static {p0, v0}, Lu4/p;->q(Lu4/o;Lu4/o;)Lu4/p;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :cond_1
    :goto_0
    if-nez p1, :cond_2

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_2
    iget-object p0, v0, Lz4/e;->h:[Ljava/lang/Object;

    .line 59
    .line 60
    array-length p0, p0

    .line 61
    new-instance v1, Lu4/p;

    .line 62
    .line 63
    add-int/lit8 v3, p0, 0x1

    .line 64
    .line 65
    invoke-direct {v1, v3}, Lz4/e;-><init>(I)V

    .line 66
    .line 67
    .line 68
    move v3, v2

    .line 69
    :goto_1
    if-ge v3, p0, :cond_3

    .line 70
    .line 71
    add-int/lit8 v4, v3, 0x1

    .line 72
    .line 73
    invoke-virtual {v0, v3}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {v1, v4, v3}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    move v3, v4

    .line 81
    goto :goto_1

    .line 82
    :cond_3
    invoke-virtual {v1, v2, p1}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget-boolean p0, v0, Lz4/j;->g:Z

    .line 86
    .line 87
    if-nez p0, :cond_4

    .line 88
    .line 89
    iput-boolean v2, v1, Lz4/j;->g:Z

    .line 90
    .line 91
    :cond_4
    return-object v1

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static b(Lf1/h;IILn4/a;)Li4/a;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lf1/h;->h:I

    .line 4
    .line 5
    new-instance v2, Lp4/y;

    .line 6
    .line 7
    move/from16 v3, p1

    .line 8
    .line 9
    move/from16 v4, p2

    .line 10
    .line 11
    move-object/from16 v5, p3

    .line 12
    .line 13
    invoke-direct {v2, v0, v3, v4, v5}, Lp4/y;-><init>(Lf1/h;IILn4/a;)V

    .line 14
    .line 15
    .line 16
    iget-object v3, v0, Lf1/h;->i:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Lu4/c;

    .line 19
    .line 20
    iget-object v4, v3, Lz4/e;->h:[Ljava/lang/Object;

    .line 21
    .line 22
    array-length v4, v4

    .line 23
    invoke-virtual {v3}, Lz4/i;->o()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    invoke-static {v5}, Lx6/d;->L(I)[I

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-static {v5}, Lx6/d;->L(I)[I

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const/4 v8, 0x0

    .line 36
    :goto_0
    if-ge v8, v4, :cond_0

    .line 37
    .line 38
    invoke-virtual {v3, v8}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v9

    .line 42
    check-cast v9, Lu4/b;

    .line 43
    .line 44
    iget v9, v9, Lu4/b;->a:I

    .line 45
    .line 46
    invoke-static {v6, v9}, Lx6/d;->g0([II)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v8, v8, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    new-array v8, v4, [I

    .line 53
    .line 54
    move v9, v1

    .line 55
    const/4 v10, 0x0

    .line 56
    :goto_1
    const/4 v12, -0x1

    .line 57
    if-eq v9, v12, :cond_17

    .line 58
    .line 59
    :goto_2
    iget-object v14, v0, Lf1/h;->k:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v14, Lz4/g;

    .line 62
    .line 63
    if-nez v14, :cond_8

    .line 64
    .line 65
    invoke-virtual {v3}, Lz4/i;->o()I

    .line 66
    .line 67
    .line 68
    move-result v14

    .line 69
    new-array v15, v14, [Lz4/g;

    .line 70
    .line 71
    new-instance v11, Lz4/g;

    .line 72
    .line 73
    const/16 v13, 0xa

    .line 74
    .line 75
    invoke-direct {v11, v13}, Lz4/g;-><init>(I)V

    .line 76
    .line 77
    .line 78
    iget-object v12, v3, Lz4/e;->h:[Ljava/lang/Object;

    .line 79
    .line 80
    array-length v12, v12

    .line 81
    const/4 v7, 0x0

    .line 82
    :goto_3
    if-ge v7, v12, :cond_4

    .line 83
    .line 84
    invoke-virtual {v3, v7}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v16

    .line 88
    move-object/from16 v13, v16

    .line 89
    .line 90
    check-cast v13, Lu4/b;

    .line 91
    .line 92
    move/from16 v16, v1

    .line 93
    .line 94
    iget v1, v13, Lu4/b;->a:I

    .line 95
    .line 96
    iget-object v13, v13, Lu4/b;->c:Lz4/g;

    .line 97
    .line 98
    move/from16 v18, v7

    .line 99
    .line 100
    iget v7, v13, Lz4/g;->i:I

    .line 101
    .line 102
    if-nez v7, :cond_2

    .line 103
    .line 104
    invoke-virtual {v11, v1}, Lz4/g;->l(I)V

    .line 105
    .line 106
    .line 107
    move/from16 v19, v12

    .line 108
    .line 109
    :cond_1
    const/16 v12, 0xa

    .line 110
    .line 111
    goto :goto_6

    .line 112
    :cond_2
    move/from16 v19, v12

    .line 113
    .line 114
    const/4 v12, 0x0

    .line 115
    :goto_4
    if-ge v12, v7, :cond_1

    .line 116
    .line 117
    invoke-virtual {v13, v12}, Lz4/g;->n(I)I

    .line 118
    .line 119
    .line 120
    move-result v20

    .line 121
    aget-object v21, v15, v20

    .line 122
    .line 123
    move/from16 v22, v7

    .line 124
    .line 125
    if-nez v21, :cond_3

    .line 126
    .line 127
    new-instance v7, Lz4/g;

    .line 128
    .line 129
    move/from16 v23, v12

    .line 130
    .line 131
    const/16 v12, 0xa

    .line 132
    .line 133
    invoke-direct {v7, v12}, Lz4/g;-><init>(I)V

    .line 134
    .line 135
    .line 136
    aput-object v7, v15, v20

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_3
    move/from16 v23, v12

    .line 140
    .line 141
    const/16 v12, 0xa

    .line 142
    .line 143
    move-object/from16 v7, v21

    .line 144
    .line 145
    :goto_5
    invoke-virtual {v7, v1}, Lz4/g;->l(I)V

    .line 146
    .line 147
    .line 148
    add-int/lit8 v7, v23, 0x1

    .line 149
    .line 150
    move v12, v7

    .line 151
    move/from16 v7, v22

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :goto_6
    add-int/lit8 v7, v18, 0x1

    .line 155
    .line 156
    move v13, v12

    .line 157
    move/from16 v1, v16

    .line 158
    .line 159
    move/from16 v12, v19

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_4
    move/from16 v16, v1

    .line 163
    .line 164
    const/4 v1, 0x0

    .line 165
    :goto_7
    if-ge v1, v14, :cond_6

    .line 166
    .line 167
    aget-object v7, v15, v1

    .line 168
    .line 169
    if-eqz v7, :cond_5

    .line 170
    .line 171
    invoke-virtual {v7}, Lz4/g;->s()V

    .line 172
    .line 173
    .line 174
    const/4 v12, 0x0

    .line 175
    iput-boolean v12, v7, Lz4/j;->g:Z

    .line 176
    .line 177
    goto :goto_8

    .line 178
    :cond_5
    const/4 v12, 0x0

    .line 179
    :goto_8
    add-int/lit8 v1, v1, 0x1

    .line 180
    .line 181
    goto :goto_7

    .line 182
    :cond_6
    const/4 v12, 0x0

    .line 183
    invoke-virtual {v11}, Lz4/g;->s()V

    .line 184
    .line 185
    .line 186
    iput-boolean v12, v11, Lz4/j;->g:Z

    .line 187
    .line 188
    aget-object v1, v15, v16

    .line 189
    .line 190
    if-nez v1, :cond_7

    .line 191
    .line 192
    sget-object v1, Lz4/g;->k:Lz4/g;

    .line 193
    .line 194
    aput-object v1, v15, v16

    .line 195
    .line 196
    :cond_7
    iput-object v15, v0, Lf1/h;->j:Ljava/lang/Object;

    .line 197
    .line 198
    iput-object v11, v0, Lf1/h;->k:Ljava/lang/Object;

    .line 199
    .line 200
    goto :goto_9

    .line 201
    :cond_8
    move/from16 v16, v1

    .line 202
    .line 203
    :goto_9
    iget-object v1, v0, Lf1/h;->j:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v1, [Lz4/g;

    .line 206
    .line 207
    aget-object v1, v1, v9

    .line 208
    .line 209
    if-eqz v1, :cond_16

    .line 210
    .line 211
    iget v7, v1, Lz4/g;->i:I

    .line 212
    .line 213
    const/4 v11, 0x0

    .line 214
    :goto_a
    if-ge v11, v7, :cond_c

    .line 215
    .line 216
    invoke-virtual {v1, v11}, Lz4/g;->n(I)I

    .line 217
    .line 218
    .line 219
    move-result v12

    .line 220
    invoke-static {v5, v12}, Lx6/d;->z([II)Z

    .line 221
    .line 222
    .line 223
    move-result v13

    .line 224
    if-eqz v13, :cond_9

    .line 225
    .line 226
    goto :goto_c

    .line 227
    :cond_9
    invoke-static {v6, v12}, Lx6/d;->z([II)Z

    .line 228
    .line 229
    .line 230
    move-result v13

    .line 231
    if-nez v13, :cond_a

    .line 232
    .line 233
    goto :goto_b

    .line 234
    :cond_a
    invoke-virtual {v3, v12}, Lu4/c;->s(I)Lu4/b;

    .line 235
    .line 236
    .line 237
    move-result-object v13

    .line 238
    iget v13, v13, Lu4/b;->d:I

    .line 239
    .line 240
    if-ne v13, v9, :cond_b

    .line 241
    .line 242
    invoke-static {v5, v12}, Lx6/d;->g0([II)V

    .line 243
    .line 244
    .line 245
    move v9, v12

    .line 246
    move/from16 v1, v16

    .line 247
    .line 248
    const/4 v12, -0x1

    .line 249
    goto/16 :goto_2

    .line 250
    .line 251
    :cond_b
    :goto_b
    add-int/lit8 v11, v11, 0x1

    .line 252
    .line 253
    goto :goto_a

    .line 254
    :cond_c
    :goto_c
    const/4 v1, -0x1

    .line 255
    :goto_d
    if-eq v9, v1, :cond_10

    .line 256
    .line 257
    invoke-static {v6, v9}, Lx6/d;->q([II)V

    .line 258
    .line 259
    .line 260
    invoke-static {v5, v9}, Lx6/d;->q([II)V

    .line 261
    .line 262
    .line 263
    aput v9, v8, v10

    .line 264
    .line 265
    add-int/lit8 v10, v10, 0x1

    .line 266
    .line 267
    invoke-virtual {v3, v9}, Lu4/c;->s(I)Lu4/b;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    iget-object v7, v1, Lu4/b;->c:Lz4/g;

    .line 272
    .line 273
    iget v1, v1, Lu4/b;->d:I

    .line 274
    .line 275
    iget v9, v7, Lz4/g;->i:I

    .line 276
    .line 277
    if-eqz v9, :cond_f

    .line 278
    .line 279
    const/4 v11, 0x1

    .line 280
    if-eq v9, v11, :cond_e

    .line 281
    .line 282
    const/4 v9, -0x1

    .line 283
    if-eq v1, v9, :cond_d

    .line 284
    .line 285
    invoke-virtual {v3, v1}, Lu4/c;->s(I)Lu4/b;

    .line 286
    .line 287
    .line 288
    move-result-object v11

    .line 289
    goto :goto_e

    .line 290
    :cond_d
    const/4 v12, 0x0

    .line 291
    invoke-virtual {v7, v12}, Lz4/g;->n(I)I

    .line 292
    .line 293
    .line 294
    move-result v11

    .line 295
    invoke-virtual {v3, v11}, Lu4/c;->s(I)Lu4/b;

    .line 296
    .line 297
    .line 298
    move-result-object v11

    .line 299
    goto :goto_e

    .line 300
    :cond_e
    const/4 v9, -0x1

    .line 301
    const/4 v12, 0x0

    .line 302
    invoke-virtual {v7, v12}, Lz4/g;->n(I)I

    .line 303
    .line 304
    .line 305
    move-result v11

    .line 306
    invoke-virtual {v3, v11}, Lu4/c;->s(I)Lu4/b;

    .line 307
    .line 308
    .line 309
    move-result-object v11

    .line 310
    goto :goto_e

    .line 311
    :cond_f
    const/4 v9, -0x1

    .line 312
    const/4 v11, 0x0

    .line 313
    :goto_e
    if-nez v11, :cond_11

    .line 314
    .line 315
    :cond_10
    const/4 v12, 0x0

    .line 316
    goto :goto_11

    .line 317
    :cond_11
    iget v11, v11, Lu4/b;->a:I

    .line 318
    .line 319
    invoke-static {v6, v11}, Lx6/d;->z([II)Z

    .line 320
    .line 321
    .line 322
    move-result v12

    .line 323
    if-eqz v12, :cond_12

    .line 324
    .line 325
    move v12, v11

    .line 326
    goto :goto_10

    .line 327
    :cond_12
    if-eq v1, v11, :cond_13

    .line 328
    .line 329
    if-ltz v1, :cond_13

    .line 330
    .line 331
    invoke-static {v6, v1}, Lx6/d;->z([II)Z

    .line 332
    .line 333
    .line 334
    move-result v11

    .line 335
    if-eqz v11, :cond_13

    .line 336
    .line 337
    move v12, v1

    .line 338
    goto :goto_10

    .line 339
    :cond_13
    iget v1, v7, Lz4/g;->i:I

    .line 340
    .line 341
    const/4 v11, 0x0

    .line 342
    :goto_f
    if-ge v11, v1, :cond_15

    .line 343
    .line 344
    invoke-virtual {v7, v11}, Lz4/g;->n(I)I

    .line 345
    .line 346
    .line 347
    move-result v12

    .line 348
    invoke-static {v6, v12}, Lx6/d;->z([II)Z

    .line 349
    .line 350
    .line 351
    move-result v13

    .line 352
    if-eqz v13, :cond_14

    .line 353
    .line 354
    goto :goto_10

    .line 355
    :cond_14
    add-int/lit8 v11, v11, 0x1

    .line 356
    .line 357
    goto :goto_f

    .line 358
    :cond_15
    move v12, v9

    .line 359
    :goto_10
    move v1, v9

    .line 360
    move v9, v12

    .line 361
    goto :goto_d

    .line 362
    :goto_11
    invoke-static {v6, v12}, Lx6/d;->x([II)I

    .line 363
    .line 364
    .line 365
    move-result v9

    .line 366
    move/from16 v1, v16

    .line 367
    .line 368
    goto/16 :goto_1

    .line 369
    .line 370
    :cond_16
    invoke-static {v9}, La/a;->X0(I)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    const-string v1, "no such block: "

    .line 375
    .line 376
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    invoke-static {v0}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    const/4 v0, 0x0

    .line 384
    return-object v0

    .line 385
    :cond_17
    move v9, v12

    .line 386
    if-ne v10, v4, :cond_25

    .line 387
    .line 388
    iput-object v8, v2, Lp4/y;->g:[I

    .line 389
    .line 390
    const/4 v12, 0x0

    .line 391
    :goto_12
    iget-object v1, v2, Lp4/y;->d:Lp4/t;

    .line 392
    .line 393
    iget-object v5, v2, Lp4/y;->c:Lb5/c;

    .line 394
    .line 395
    if-ge v12, v4, :cond_1f

    .line 396
    .line 397
    add-int/lit8 v6, v12, 0x1

    .line 398
    .line 399
    if-ne v6, v4, :cond_18

    .line 400
    .line 401
    move v7, v9

    .line 402
    goto :goto_13

    .line 403
    :cond_18
    aget v7, v8, v6

    .line 404
    .line 405
    :goto_13
    aget v10, v8, v12

    .line 406
    .line 407
    invoke-virtual {v3, v10}, Lu4/c;->s(I)Lu4/b;

    .line 408
    .line 409
    .line 410
    move-result-object v10

    .line 411
    iget-object v11, v5, Lb5/c;->a:Ljava/lang/Object;

    .line 412
    .line 413
    check-cast v11, [Lp4/f;

    .line 414
    .line 415
    iget v12, v10, Lu4/b;->a:I

    .line 416
    .line 417
    iget v13, v10, Lu4/b;->d:I

    .line 418
    .line 419
    iget-object v14, v10, Lu4/b;->b:Lh4/u;

    .line 420
    .line 421
    aget-object v15, v11, v12

    .line 422
    .line 423
    iget-object v9, v1, Lp4/t;->h:Ljava/lang/Object;

    .line 424
    .line 425
    check-cast v9, Lp4/u;

    .line 426
    .line 427
    iget-object v1, v1, Lp4/t;->h:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast v1, Lp4/u;

    .line 430
    .line 431
    invoke-virtual {v9, v15}, Lp4/u;->a(Lp4/h;)V

    .line 432
    .line 433
    .line 434
    iget-object v9, v5, Lb5/c;->b:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast v9, [Lp4/f;

    .line 437
    .line 438
    aget-object v9, v9, v12

    .line 439
    .line 440
    iget-object v15, v2, Lp4/y;->e:Lhb/c;

    .line 441
    .line 442
    iput-object v10, v15, Lhb/c;->h:Ljava/lang/Object;

    .line 443
    .line 444
    iput-object v9, v15, Lhb/c;->i:Ljava/lang/Object;

    .line 445
    .line 446
    iget-object v9, v14, Lz4/e;->h:[Ljava/lang/Object;

    .line 447
    .line 448
    array-length v9, v9

    .line 449
    move-object/from16 v16, v3

    .line 450
    .line 451
    const/4 v3, 0x0

    .line 452
    :goto_14
    if-ge v3, v9, :cond_19

    .line 453
    .line 454
    invoke-virtual {v14, v3}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v17

    .line 458
    move/from16 v18, v3

    .line 459
    .line 460
    move-object/from16 v3, v17

    .line 461
    .line 462
    check-cast v3, Lu4/i;

    .line 463
    .line 464
    invoke-virtual {v3, v15}, Lu4/i;->d(Lu4/h;)V

    .line 465
    .line 466
    .line 467
    add-int/lit8 v3, v18, 0x1

    .line 468
    .line 469
    goto :goto_14

    .line 470
    :cond_19
    iget-object v3, v5, Lb5/c;->c:Ljava/lang/Object;

    .line 471
    .line 472
    check-cast v3, [Lp4/f;

    .line 473
    .line 474
    aget-object v3, v3, v12

    .line 475
    .line 476
    invoke-virtual {v1, v3}, Lp4/u;->a(Lp4/h;)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v14}, Lh4/u;->p()Lu4/i;

    .line 480
    .line 481
    .line 482
    move-result-object v3

    .line 483
    if-ltz v13, :cond_1e

    .line 484
    .line 485
    if-eq v13, v7, :cond_1e

    .line 486
    .line 487
    iget-object v5, v3, Lu4/i;->g:Lu4/r;

    .line 488
    .line 489
    iget v5, v5, Lu4/r;->e:I

    .line 490
    .line 491
    const/4 v9, 0x4

    .line 492
    if-ne v5, v9, :cond_1c

    .line 493
    .line 494
    iget-object v5, v10, Lu4/b;->c:Lz4/g;

    .line 495
    .line 496
    iget v9, v5, Lz4/g;->i:I

    .line 497
    .line 498
    const/4 v10, 0x2

    .line 499
    if-ne v9, v10, :cond_1b

    .line 500
    .line 501
    const/4 v12, 0x0

    .line 502
    invoke-virtual {v5, v12}, Lz4/g;->n(I)I

    .line 503
    .line 504
    .line 505
    move-result v9

    .line 506
    if-ne v9, v13, :cond_1a

    .line 507
    .line 508
    const/4 v14, 0x1

    .line 509
    invoke-virtual {v5, v14}, Lz4/g;->n(I)I

    .line 510
    .line 511
    .line 512
    move-result v9

    .line 513
    goto :goto_15

    .line 514
    :cond_1a
    const/4 v14, 0x1

    .line 515
    :goto_15
    if-ne v9, v7, :cond_1d

    .line 516
    .line 517
    aget-object v3, v11, v13

    .line 518
    .line 519
    iget-object v5, v1, Lp4/u;->c:Ljava/util/ArrayList;

    .line 520
    .line 521
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 522
    .line 523
    .line 524
    move-result v5

    .line 525
    sub-int/2addr v5, v10

    .line 526
    :try_start_0
    iget-object v7, v1, Lp4/u;->c:Ljava/util/ArrayList;

    .line 527
    .line 528
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v7

    .line 532
    check-cast v7, Lp4/b0;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 533
    .line 534
    iget-object v1, v1, Lp4/u;->c:Ljava/util/ArrayList;

    .line 535
    .line 536
    invoke-virtual {v7, v3}, Lp4/b0;->o(Lp4/f;)Lp4/b0;

    .line 537
    .line 538
    .line 539
    move-result-object v3

    .line 540
    invoke-virtual {v1, v5, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    goto :goto_16

    .line 544
    :catch_0
    const-string v0, "non-reversible instruction"

    .line 545
    .line 546
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    const/4 v0, 0x0

    .line 550
    return-object v0

    .line 551
    :catch_1
    const-string v0, "too few instructions"

    .line 552
    .line 553
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    const/4 v0, 0x0

    .line 557
    return-object v0

    .line 558
    :cond_1b
    const-string v0, "block doesn\'t have exactly two successors"

    .line 559
    .line 560
    invoke-static {v0}, Lj8/o;->w(Ljava/lang/String;)V

    .line 561
    .line 562
    .line 563
    const/4 v0, 0x0

    .line 564
    return-object v0

    .line 565
    :cond_1c
    const/4 v12, 0x0

    .line 566
    const/4 v14, 0x1

    .line 567
    :cond_1d
    new-instance v5, Lp4/b0;

    .line 568
    .line 569
    sget-object v7, Lp4/k;->I:Lp4/j;

    .line 570
    .line 571
    iget-object v3, v3, Lu4/i;->h:Lu4/t;

    .line 572
    .line 573
    sget-object v9, Lu4/p;->i:Lu4/p;

    .line 574
    .line 575
    aget-object v10, v11, v13

    .line 576
    .line 577
    invoke-direct {v5, v7, v3, v9, v10}, Lp4/b0;-><init>(Lp4/j;Lu4/t;Lu4/p;Lp4/f;)V

    .line 578
    .line 579
    .line 580
    invoke-virtual {v1, v5}, Lp4/u;->a(Lp4/h;)V

    .line 581
    .line 582
    .line 583
    goto :goto_16

    .line 584
    :cond_1e
    const/4 v12, 0x0

    .line 585
    const/4 v14, 0x1

    .line 586
    :goto_16
    move v12, v6

    .line 587
    move-object/from16 v3, v16

    .line 588
    .line 589
    const/4 v9, -0x1

    .line 590
    goto/16 :goto_12

    .line 591
    .line 592
    :cond_1f
    const/4 v12, 0x0

    .line 593
    new-instance v3, Lb5/c;

    .line 594
    .line 595
    iget-object v4, v2, Lp4/y;->g:[I

    .line 596
    .line 597
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 598
    .line 599
    .line 600
    if-eqz v4, :cond_24

    .line 601
    .line 602
    if-eqz v5, :cond_23

    .line 603
    .line 604
    iput-object v0, v3, Lb5/c;->a:Ljava/lang/Object;

    .line 605
    .line 606
    iput-object v4, v3, Lb5/c;->b:Ljava/lang/Object;

    .line 607
    .line 608
    iput-object v5, v3, Lb5/c;->c:Ljava/lang/Object;

    .line 609
    .line 610
    new-instance v0, Li4/a;

    .line 611
    .line 612
    iget-object v4, v1, Lp4/t;->h:Ljava/lang/Object;

    .line 613
    .line 614
    check-cast v4, Lp4/u;

    .line 615
    .line 616
    iget-object v5, v1, Lp4/t;->i:Ljava/lang/Object;

    .line 617
    .line 618
    check-cast v5, Ljava/util/ArrayList;

    .line 619
    .line 620
    if-eqz v5, :cond_22

    .line 621
    .line 622
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 623
    .line 624
    .line 625
    move-result v5

    .line 626
    move v7, v12

    .line 627
    :goto_17
    if-ge v7, v5, :cond_20

    .line 628
    .line 629
    iget-object v6, v1, Lp4/t;->i:Ljava/lang/Object;

    .line 630
    .line 631
    check-cast v6, Ljava/util/ArrayList;

    .line 632
    .line 633
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v6

    .line 637
    check-cast v6, Lp4/h;

    .line 638
    .line 639
    invoke-virtual {v4, v6}, Lp4/u;->a(Lp4/h;)V

    .line 640
    .line 641
    .line 642
    add-int/lit8 v7, v7, 0x1

    .line 643
    .line 644
    goto :goto_17

    .line 645
    :cond_20
    const/4 v6, 0x0

    .line 646
    iput-object v6, v1, Lp4/t;->i:Ljava/lang/Object;

    .line 647
    .line 648
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 649
    .line 650
    .line 651
    if-eqz v4, :cond_21

    .line 652
    .line 653
    iget v1, v2, Lp4/y;->b:I

    .line 654
    .line 655
    iput v1, v0, Li4/a;->g:I

    .line 656
    .line 657
    iput-object v4, v0, Li4/a;->h:Ljava/lang/Object;

    .line 658
    .line 659
    iput-object v3, v0, Li4/a;->i:Ljava/lang/Object;

    .line 660
    .line 661
    const/4 v1, 0x0

    .line 662
    iput-object v1, v0, Li4/a;->j:Ljava/lang/Object;

    .line 663
    .line 664
    iput-object v1, v0, Li4/a;->k:Ljava/lang/Object;

    .line 665
    .line 666
    iput-object v1, v0, Li4/a;->l:Ljava/lang/Object;

    .line 667
    .line 668
    iput-object v1, v0, Li4/a;->m:Ljava/lang/Object;

    .line 669
    .line 670
    return-object v0

    .line 671
    :cond_21
    const-string v0, "unprocessedInsns == null"

    .line 672
    .line 673
    invoke-static {v0}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 674
    .line 675
    .line 676
    const/4 v0, 0x0

    .line 677
    throw v0

    .line 678
    :cond_22
    const-string v0, "already processed"

    .line 679
    .line 680
    invoke-static {v0}, Lj8/o;->w(Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    const/4 v0, 0x0

    .line 684
    return-object v0

    .line 685
    :cond_23
    const-string v0, "addresses == null"

    .line 686
    .line 687
    invoke-static {v0}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 688
    .line 689
    .line 690
    const/4 v0, 0x0

    .line 691
    throw v0

    .line 692
    :cond_24
    const-string v0, "order == null"

    .line 693
    .line 694
    invoke-static {v0}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 695
    .line 696
    .line 697
    const/4 v0, 0x0

    .line 698
    throw v0

    .line 699
    :cond_25
    const-string v0, "shouldn\'t happen"

    .line 700
    .line 701
    invoke-static {v0}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 702
    .line 703
    .line 704
    const/4 v0, 0x0

    .line 705
    return-object v0
.end method
