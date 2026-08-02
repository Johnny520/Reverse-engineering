.class public final Lz70;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;

.field public final k:Ljava/lang/Object;

.field public final l:Ljava/lang/Object;

.field public final m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public o:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 168
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 169
    iput-object p1, p0, Lz70;->b:Ljava/lang/Object;

    .line 170
    iput-object p3, p0, Lz70;->c:Ljava/lang/Object;

    .line 171
    iput-object p4, p0, Lz70;->d:Ljava/lang/Object;

    .line 172
    iput-object p5, p0, Lz70;->e:Ljava/lang/Object;

    .line 173
    iput-object p6, p0, Lz70;->f:Ljava/lang/Object;

    .line 174
    iput-object p7, p0, Lz70;->g:Ljava/lang/Object;

    .line 175
    iput-object p8, p0, Lz70;->h:Ljava/lang/Object;

    .line 176
    iput-object p9, p0, Lz70;->i:Ljava/lang/Object;

    .line 177
    iput-object p10, p0, Lz70;->j:Ljava/lang/Object;

    .line 178
    iput-object p11, p0, Lz70;->k:Ljava/lang/Object;

    .line 179
    iput-object p12, p0, Lz70;->l:Ljava/lang/Object;

    .line 180
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lz70;->m:Ljava/lang/Object;

    const/16 p1, -0x4e20

    .line 181
    iput p1, p0, Lz70;->a:I

    return-void
.end method

.method public constructor <init>(Lz8;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lb42;

    .line 7
    .line 8
    const/4 v2, 0x3

    .line 9
    invoke-direct {v1, v2, v0}, Lb42;-><init>(ILz70;)V

    .line 10
    .line 11
    .line 12
    iput-object v1, v0, Lz70;->n:Ljava/lang/Object;

    .line 13
    .line 14
    new-instance v3, Leh1;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x4

    .line 18
    const/4 v6, 0x1

    .line 19
    invoke-direct {v3, v4, v0, v5, v6}, Leh1;-><init>(Ljava/lang/String;Lz70;II)V

    .line 20
    .line 21
    .line 22
    iput-object v3, v0, Lz70;->c:Ljava/lang/Object;

    .line 23
    .line 24
    new-instance v7, Leh1;

    .line 25
    .line 26
    const-string v8, "word_data"

    .line 27
    .line 28
    const/4 v9, 0x2

    .line 29
    invoke-direct {v7, v8, v0, v5, v9}, Leh1;-><init>(Ljava/lang/String;Lz70;II)V

    .line 30
    .line 31
    .line 32
    iput-object v7, v0, Lz70;->b:Ljava/lang/Object;

    .line 33
    .line 34
    new-instance v8, Leh1;

    .line 35
    .line 36
    const-string v10, "string_data"

    .line 37
    .line 38
    invoke-direct {v8, v10, v0, v6, v2}, Leh1;-><init>(Ljava/lang/String;Lz70;II)V

    .line 39
    .line 40
    .line 41
    iput-object v8, v0, Lz70;->e:Ljava/lang/Object;

    .line 42
    .line 43
    new-instance v10, Leh1;

    .line 44
    .line 45
    invoke-direct {v10, v4, v0, v6, v6}, Leh1;-><init>(Ljava/lang/String;Lz70;II)V

    .line 46
    .line 47
    .line 48
    iput-object v10, v0, Lz70;->f:Ljava/lang/Object;

    .line 49
    .line 50
    new-instance v4, Leh1;

    .line 51
    .line 52
    const-string v11, "byte_data"

    .line 53
    .line 54
    invoke-direct {v4, v11, v0, v6, v9}, Leh1;-><init>(Ljava/lang/String;Lz70;II)V

    .line 55
    .line 56
    .line 57
    iput-object v4, v0, Lz70;->g:Ljava/lang/Object;

    .line 58
    .line 59
    new-instance v11, Lb42;

    .line 60
    .line 61
    invoke-direct {v11, v6, v0}, Lb42;-><init>(ILz70;)V

    .line 62
    .line 63
    .line 64
    iput-object v11, v0, Lz70;->h:Ljava/lang/Object;

    .line 65
    .line 66
    new-instance v12, Lb42;

    .line 67
    .line 68
    invoke-direct {v12, v9, v0}, Lb42;-><init>(ILz70;)V

    .line 69
    .line 70
    .line 71
    iput-object v12, v0, Lz70;->i:Ljava/lang/Object;

    .line 72
    .line 73
    new-instance v13, Lb42;

    .line 74
    .line 75
    const/4 v14, 0x0

    .line 76
    invoke-direct {v13, v14, v0}, Lb42;-><init>(ILz70;)V

    .line 77
    .line 78
    .line 79
    iput-object v13, v0, Lz70;->j:Ljava/lang/Object;

    .line 80
    .line 81
    new-instance v15, Lni0;

    .line 82
    .line 83
    invoke-direct {v15, v0}, Lni0;-><init>(Lz70;)V

    .line 84
    .line 85
    .line 86
    iput-object v15, v0, Lz70;->k:Ljava/lang/Object;

    .line 87
    .line 88
    move/from16 p1, v2

    .line 89
    .line 90
    new-instance v2, Lxg1;

    .line 91
    .line 92
    invoke-direct {v2, v0}, Lxg1;-><init>(Lz70;)V

    .line 93
    .line 94
    .line 95
    iput-object v2, v0, Lz70;->l:Ljava/lang/Object;

    .line 96
    .line 97
    move/from16 v16, v9

    .line 98
    .line 99
    new-instance v9, Lys;

    .line 100
    .line 101
    invoke-direct {v9, v0}, Lys;-><init>(Lz70;)V

    .line 102
    .line 103
    .line 104
    iput-object v9, v0, Lz70;->m:Ljava/lang/Object;

    .line 105
    .line 106
    move/from16 v17, v14

    .line 107
    .line 108
    new-instance v14, Leh1;

    .line 109
    .line 110
    move-object/from16 v18, v1

    .line 111
    .line 112
    const-string v1, "map"

    .line 113
    .line 114
    invoke-direct {v14, v1, v0, v5, v6}, Leh1;-><init>(Ljava/lang/String;Lz70;II)V

    .line 115
    .line 116
    .line 117
    iput-object v14, v0, Lz70;->d:Ljava/lang/Object;

    .line 118
    .line 119
    const/16 v1, 0xd

    .line 120
    .line 121
    new-array v1, v1, [Ljm2;

    .line 122
    .line 123
    aput-object v18, v1, v17

    .line 124
    .line 125
    aput-object v11, v1, v6

    .line 126
    .line 127
    aput-object v12, v1, v16

    .line 128
    .line 129
    aput-object v13, v1, p1

    .line 130
    .line 131
    aput-object v15, v1, v5

    .line 132
    .line 133
    const/4 v5, 0x5

    .line 134
    aput-object v2, v1, v5

    .line 135
    .line 136
    const/4 v2, 0x6

    .line 137
    aput-object v9, v1, v2

    .line 138
    .line 139
    const/4 v2, 0x7

    .line 140
    aput-object v7, v1, v2

    .line 141
    .line 142
    const/16 v2, 0x8

    .line 143
    .line 144
    aput-object v3, v1, v2

    .line 145
    .line 146
    const/16 v2, 0x9

    .line 147
    .line 148
    aput-object v8, v1, v2

    .line 149
    .line 150
    const/16 v2, 0xa

    .line 151
    .line 152
    aput-object v4, v1, v2

    .line 153
    .line 154
    const/16 v2, 0xb

    .line 155
    .line 156
    aput-object v10, v1, v2

    .line 157
    .line 158
    const/16 v2, 0xc

    .line 159
    .line 160
    aput-object v14, v1, v2

    .line 161
    .line 162
    iput-object v1, v0, Lz70;->o:Ljava/io/Serializable;

    .line 163
    .line 164
    const/4 v1, -0x1

    .line 165
    iput v1, v0, Lz70;->a:I

    .line 166
    .line 167
    return-void
.end method


# virtual methods
.method public a(Ldz;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    instance-of v0, p1, Lq30;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lz70;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lb42;

    .line 10
    .line 11
    check-cast p1, Lq30;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lb42;->o(Lq30;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    instance-of v0, p1, Lr30;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object p0, p0, Lz70;->i:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Lb42;

    .line 24
    .line 25
    check-cast p1, Lr30;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lb42;->p(Lr30;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    instance-of v0, p1, Ln30;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object p0, p0, Lz70;->l:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Lxg1;

    .line 38
    .line 39
    check-cast p1, Ln30;

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Lxg1;->m(Ln30;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    instance-of v0, p1, Lc30;

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    iget-object p0, p0, Lz70;->k:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p0, Lni0;

    .line 52
    .line 53
    check-cast p1, Lc30;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Lni0;->m(Lc30;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    return-void

    .line 59
    :cond_4
    const-string p0, "cst == null"

    .line 60
    .line 61
    invoke-static {p0}, Lum2;->f(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public b()[B
    .locals 11

    .line 1
    iget-object v0, p0, Lz70;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Leh1;

    .line 4
    .line 5
    iget-object v1, p0, Lz70;->o:Ljava/io/Serializable;

    .line 6
    .line 7
    check-cast v1, [Ljm2;

    .line 8
    .line 9
    iget-object v2, p0, Lz70;->m:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lys;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljm2;->d()V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lz70;->f:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Leh1;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljm2;->d()V

    .line 21
    .line 22
    .line 23
    iget-object v2, p0, Lz70;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Leh1;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljm2;->d()V

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Lz70;->g:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Leh1;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljm2;->d()V

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Lz70;->l:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Lxg1;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljm2;->d()V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, Lz70;->k:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Lni0;

    .line 47
    .line 48
    invoke-virtual {v2}, Ljm2;->d()V

    .line 49
    .line 50
    .line 51
    iget-object v2, p0, Lz70;->j:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Lb42;

    .line 54
    .line 55
    invoke-virtual {v2}, Ljm2;->d()V

    .line 56
    .line 57
    .line 58
    iget-object v2, p0, Lz70;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Leh1;

    .line 61
    .line 62
    invoke-virtual {v2}, Ljm2;->d()V

    .line 63
    .line 64
    .line 65
    iget-object v2, p0, Lz70;->i:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, Lb42;

    .line 68
    .line 69
    invoke-virtual {v2}, Ljm2;->d()V

    .line 70
    .line 71
    .line 72
    iget-object v2, p0, Lz70;->h:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v2, Lb42;

    .line 75
    .line 76
    invoke-virtual {v2}, Ljm2;->d()V

    .line 77
    .line 78
    .line 79
    iget-object v2, p0, Lz70;->e:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v2, Leh1;

    .line 82
    .line 83
    invoke-virtual {v2}, Ljm2;->d()V

    .line 84
    .line 85
    .line 86
    iget-object v2, p0, Lz70;->n:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v2, Lb42;

    .line 89
    .line 90
    invoke-virtual {v2}, Ljm2;->d()V

    .line 91
    .line 92
    .line 93
    array-length v2, v1

    .line 94
    const/4 v3, 0x0

    .line 95
    move v4, v3

    .line 96
    move v5, v4

    .line 97
    :goto_0
    const/4 v6, 0x0

    .line 98
    const-string v7, "...while writing section "

    .line 99
    .line 100
    if-ge v4, v2, :cond_7

    .line 101
    .line 102
    aget-object v8, v1, v4

    .line 103
    .line 104
    if-eqz v8, :cond_0

    .line 105
    .line 106
    if-nez v8, :cond_1

    .line 107
    .line 108
    :cond_0
    invoke-virtual {v8}, Ljm2;->c()Ljava/util/Collection;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 113
    .line 114
    .line 115
    move-result v9

    .line 116
    if-eqz v9, :cond_1

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_1
    if-ltz v5, :cond_6

    .line 120
    .line 121
    iget v9, v8, Ljm2;->d:I

    .line 122
    .line 123
    if-gez v9, :cond_5

    .line 124
    .line 125
    iget v9, v8, Ljm2;->c:I

    .line 126
    .line 127
    add-int/lit8 v9, v9, -0x1

    .line 128
    .line 129
    add-int v10, v5, v9

    .line 130
    .line 131
    not-int v9, v9

    .line 132
    and-int/2addr v9, v10

    .line 133
    iput v9, v8, Ljm2;->d:I

    .line 134
    .line 135
    if-lt v9, v5, :cond_4

    .line 136
    .line 137
    if-ne v8, v0, :cond_2

    .line 138
    .line 139
    :try_start_0
    invoke-static {v1, v0}, Lte1;->l([Ljm2;Leh1;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Ljm2;->d()V

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :catch_0
    move-exception p0

    .line 147
    goto :goto_3

    .line 148
    :cond_2
    :goto_1
    instance-of v5, v8, Leh1;

    .line 149
    .line 150
    if-eqz v5, :cond_3

    .line 151
    .line 152
    move-object v5, v8

    .line 153
    check-cast v5, Leh1;

    .line 154
    .line 155
    invoke-virtual {v5}, Leh1;->m()V

    .line 156
    .line 157
    .line 158
    :cond_3
    invoke-virtual {v8}, Ljm2;->h()I

    .line 159
    .line 160
    .line 161
    move-result v5
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 162
    add-int/2addr v5, v9

    .line 163
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {p0, v0}, Lsg0;->a(Ljava/lang/Exception;Ljava/lang/String;)Lsg0;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    throw p0

    .line 183
    :cond_4
    const-string p0, "bogus placement for section "

    .line 184
    .line 185
    invoke-static {p0, v4}, Lvi0;->g(Ljava/lang/String;I)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    invoke-static {p0}, Lc80;->j(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    return-object v6

    .line 193
    :cond_5
    const-string p0, "fileOffset already set"

    .line 194
    .line 195
    invoke-static {p0}, Lc80;->j(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    return-object v6

    .line 199
    :cond_6
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    const-string p0, "fileOffset < 0"

    .line 203
    .line 204
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    return-object v6

    .line 208
    :cond_7
    iput v5, p0, Lz70;->a:I

    .line 209
    .line 210
    new-array v0, v5, [B

    .line 211
    .line 212
    new-instance v4, Lyn;

    .line 213
    .line 214
    invoke-direct {v4, v0, v3}, Lyn;-><init>([BZ)V

    .line 215
    .line 216
    .line 217
    :goto_4
    const/16 v5, 0xa

    .line 218
    .line 219
    if-ge v3, v2, :cond_d

    .line 220
    .line 221
    :try_start_1
    aget-object v8, v1, v3

    .line 222
    .line 223
    if-eqz v8, :cond_8

    .line 224
    .line 225
    if-nez v8, :cond_9

    .line 226
    .line 227
    :cond_8
    invoke-virtual {v8}, Ljm2;->c()Ljava/util/Collection;

    .line 228
    .line 229
    .line 230
    move-result-object v9

    .line 231
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 232
    .line 233
    .line 234
    move-result v9

    .line 235
    if-eqz v9, :cond_9

    .line 236
    .line 237
    goto :goto_5

    .line 238
    :cond_9
    invoke-virtual {v8}, Ljm2;->b()I

    .line 239
    .line 240
    .line 241
    move-result v9

    .line 242
    iget v10, v4, Lyn;->c:I

    .line 243
    .line 244
    sub-int/2addr v9, v10

    .line 245
    if-ltz v9, :cond_a

    .line 246
    .line 247
    invoke-virtual {v4, v9}, Lyn;->n(I)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v8, v4}, Ljm2;->i(Lyn;)V

    .line 251
    .line 252
    .line 253
    :goto_5
    add-int/lit8 v3, v3, 0x1

    .line 254
    .line 255
    goto :goto_4

    .line 256
    :catch_1
    move-exception p0

    .line 257
    goto :goto_6

    .line 258
    :cond_a
    new-instance p0, Lsg0;

    .line 259
    .line 260
    new-instance v0, Ljava/lang/StringBuilder;

    .line 261
    .line 262
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 263
    .line 264
    .line 265
    const-string v1, "excess write of "

    .line 266
    .line 267
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    neg-int v1, v9

    .line 271
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-direct {p0, v6, v0}, Lsg0;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    throw p0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 282
    :goto_6
    instance-of v0, p0, Lsg0;

    .line 283
    .line 284
    if-eqz v0, :cond_b

    .line 285
    .line 286
    check-cast p0, Lsg0;

    .line 287
    .line 288
    goto :goto_7

    .line 289
    :cond_b
    new-instance v0, Lsg0;

    .line 290
    .line 291
    invoke-direct {v0, p0, v6}, Lsg0;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    move-object p0, v0

    .line 295
    :goto_7
    invoke-static {v7, v3}, Lvi0;->g(Ljava/lang/String;I)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    iget-object v1, p0, Lsg0;->h:Ljava/lang/StringBuffer;

    .line 300
    .line 301
    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 302
    .line 303
    .line 304
    const-string v2, "\n"

    .line 305
    .line 306
    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-nez v0, :cond_c

    .line 311
    .line 312
    invoke-virtual {v1, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 313
    .line 314
    .line 315
    :cond_c
    throw p0

    .line 316
    :cond_d
    iget v1, v4, Lyn;->c:I

    .line 317
    .line 318
    iget p0, p0, Lz70;->a:I

    .line 319
    .line 320
    if-ne v1, p0, :cond_f

    .line 321
    .line 322
    const-string p0, "unexpected digest write: "

    .line 323
    .line 324
    :try_start_2
    const-string v2, "SHA-1"

    .line 325
    .line 326
    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 327
    .line 328
    .line 329
    move-result-object v2
    :try_end_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 .. :try_end_2} :catch_3

    .line 330
    const/16 v3, 0x20

    .line 331
    .line 332
    sub-int/2addr v1, v3

    .line 333
    invoke-virtual {v2, v0, v3, v1}, Ljava/security/MessageDigest;->update([BII)V

    .line 334
    .line 335
    .line 336
    const/16 v1, 0xc

    .line 337
    .line 338
    const/16 v3, 0x14

    .line 339
    .line 340
    :try_start_3
    invoke-virtual {v2, v0, v1, v3}, Ljava/security/MessageDigest;->digest([BII)I

    .line 341
    .line 342
    .line 343
    move-result v2
    :try_end_3
    .catch Ljava/security/DigestException; {:try_start_3 .. :try_end_3} :catch_2

    .line 344
    if-ne v2, v3, :cond_e

    .line 345
    .line 346
    iget p0, v4, Lyn;->c:I

    .line 347
    .line 348
    new-instance v2, Ljava/util/zip/Adler32;

    .line 349
    .line 350
    invoke-direct {v2}, Ljava/util/zip/Adler32;-><init>()V

    .line 351
    .line 352
    .line 353
    sub-int/2addr p0, v1

    .line 354
    invoke-virtual {v2, v0, v1, p0}, Ljava/util/zip/Adler32;->update([BII)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v2}, Ljava/util/zip/Adler32;->getValue()J

    .line 358
    .line 359
    .line 360
    move-result-wide v1

    .line 361
    long-to-int p0, v1

    .line 362
    const/16 v1, 0x8

    .line 363
    .line 364
    int-to-byte v2, p0

    .line 365
    aput-byte v2, v0, v1

    .line 366
    .line 367
    shr-int/lit8 v1, p0, 0x8

    .line 368
    .line 369
    int-to-byte v1, v1

    .line 370
    const/16 v2, 0x9

    .line 371
    .line 372
    aput-byte v1, v0, v2

    .line 373
    .line 374
    shr-int/lit8 v1, p0, 0x10

    .line 375
    .line 376
    int-to-byte v1, v1

    .line 377
    aput-byte v1, v0, v5

    .line 378
    .line 379
    shr-int/lit8 p0, p0, 0x18

    .line 380
    .line 381
    int-to-byte p0, p0

    .line 382
    const/16 v1, 0xb

    .line 383
    .line 384
    aput-byte p0, v0, v1

    .line 385
    .line 386
    iget-object p0, v4, Lyn;->b:[B

    .line 387
    .line 388
    return-object p0

    .line 389
    :cond_e
    :try_start_4
    new-instance v0, Ljava/lang/RuntimeException;

    .line 390
    .line 391
    new-instance v1, Ljava/lang/StringBuilder;

    .line 392
    .line 393
    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    const-string p0, " bytes"

    .line 400
    .line 401
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object p0

    .line 408
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    throw v0
    :try_end_4
    .catch Ljava/security/DigestException; {:try_start_4 .. :try_end_4} :catch_2

    .line 412
    :catch_2
    move-exception p0

    .line 413
    new-instance v0, Ljava/lang/RuntimeException;

    .line 414
    .line 415
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 416
    .line 417
    .line 418
    throw v0

    .line 419
    :catch_3
    move-exception p0

    .line 420
    new-instance v0, Ljava/lang/RuntimeException;

    .line 421
    .line 422
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 423
    .line 424
    .line 425
    throw v0

    .line 426
    :cond_f
    const-string p0, "foreshortened write"

    .line 427
    .line 428
    invoke-static {p0}, Lc80;->j(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    return-object v6
.end method
