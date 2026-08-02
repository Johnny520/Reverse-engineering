.class public final Lbb2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Z

.field public final b:I

.field public c:I

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    .line 236
    sget-object v0, Lfa3;->h:Lfa3;

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lbb2;-><init>(ZLfa3;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 p1, 0x1

    .line 237
    sget-object v0, Lfa3;->i:Lfa3;

    invoke-direct {p0, p1, v0}, Lbb2;-><init>(ZLfa3;)V

    return-void
.end method

.method public constructor <init>(Lb5;ILz8;)V
    .locals 11

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbb2;->d:Ljava/lang/Object;

    .line 5
    .line 6
    new-instance v0, Lb5;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lb5;-><init>(Lb5;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lbb2;->e:Ljava/lang/Object;

    .line 12
    .line 13
    iput p2, p0, Lbb2;->c:I

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lbb2;->h:Ljava/lang/Object;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    new-array v1, v0, [Z

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    aput-boolean v0, v1, v2

    .line 23
    .line 24
    iget-object p1, p1, Lb5;->i:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lbk;

    .line 27
    .line 28
    iget-object v0, p1, Lkj0;->i:[Ljava/lang/Object;

    .line 29
    .line 30
    iget v3, p1, Lbk;->k:I

    .line 31
    .line 32
    const/4 v4, -0x1

    .line 33
    if-ne v3, v4, :cond_2

    .line 34
    .line 35
    new-instance v3, Lak;

    .line 36
    .line 37
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    iput v2, v3, Lak;->h:I

    .line 41
    .line 42
    array-length v5, v0

    .line 43
    move v6, v2

    .line 44
    :goto_0
    if-ge v6, v5, :cond_1

    .line 45
    .line 46
    invoke-virtual {p1, v6}, Lkj0;->e(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    check-cast v7, Lzj;

    .line 51
    .line 52
    iget-object v7, v7, Lzj;->b:Lj01;

    .line 53
    .line 54
    iget-object v8, v7, Lkj0;->i:[Ljava/lang/Object;

    .line 55
    .line 56
    array-length v8, v8

    .line 57
    move v9, v2

    .line 58
    :goto_1
    if-ge v9, v8, :cond_0

    .line 59
    .line 60
    invoke-virtual {v7, v9}, Lkj0;->e(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v10

    .line 64
    check-cast v10, Li01;

    .line 65
    .line 66
    invoke-virtual {v10, v3}, Li01;->d(Lh01;)V

    .line 67
    .line 68
    .line 69
    add-int/lit8 v9, v9, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    iget v3, v3, Lak;->h:I

    .line 76
    .line 77
    iput v3, p1, Lbk;->k:I

    .line 78
    .line 79
    :cond_2
    iget v3, p1, Lbk;->k:I

    .line 80
    .line 81
    new-instance v5, Lko;

    .line 82
    .line 83
    invoke-direct {v5, v3, p2, v1}, Lko;-><init>(IILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    array-length v3, v0

    .line 87
    move v6, v2

    .line 88
    :goto_2
    if-ge v6, v3, :cond_4

    .line 89
    .line 90
    invoke-virtual {p1, v6}, Lkj0;->e(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    check-cast v7, Lzj;

    .line 95
    .line 96
    iget-object v7, v7, Lzj;->b:Lj01;

    .line 97
    .line 98
    iget-object v8, v7, Lkj0;->i:[Ljava/lang/Object;

    .line 99
    .line 100
    array-length v8, v8

    .line 101
    move v9, v2

    .line 102
    :goto_3
    if-ge v9, v8, :cond_3

    .line 103
    .line 104
    invoke-virtual {v7, v9}, Lkj0;->e(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    check-cast v10, Li01;

    .line 109
    .line 110
    invoke-virtual {v10, v5}, Li01;->d(Lh01;)V

    .line 111
    .line 112
    .line 113
    add-int/lit8 v9, v9, 0x1

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_4
    aget-boolean v1, v1, v2

    .line 120
    .line 121
    iput-boolean v1, p0, Lbb2;->a:Z

    .line 122
    .line 123
    array-length v1, v0

    .line 124
    mul-int/lit8 v8, v1, 0x3

    .line 125
    .line 126
    array-length v1, v0

    .line 127
    move v3, v2

    .line 128
    move v5, v3

    .line 129
    :goto_4
    if-ge v3, v1, :cond_6

    .line 130
    .line 131
    aget-object v6, v0, v3

    .line 132
    .line 133
    check-cast v6, Lzj;

    .line 134
    .line 135
    if-eqz v6, :cond_5

    .line 136
    .line 137
    iget-object v6, v6, Lzj;->b:Lj01;

    .line 138
    .line 139
    iget-object v6, v6, Lkj0;->i:[Ljava/lang/Object;

    .line 140
    .line 141
    array-length v6, v6

    .line 142
    add-int/2addr v5, v6

    .line 143
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_6
    add-int v7, v8, v5

    .line 147
    .line 148
    iget v1, p1, Lbk;->k:I

    .line 149
    .line 150
    if-ne v1, v4, :cond_9

    .line 151
    .line 152
    new-instance v1, Lak;

    .line 153
    .line 154
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 155
    .line 156
    .line 157
    iput v2, v1, Lak;->h:I

    .line 158
    .line 159
    array-length v0, v0

    .line 160
    move v3, v2

    .line 161
    :goto_5
    if-ge v3, v0, :cond_8

    .line 162
    .line 163
    invoke-virtual {p1, v3}, Lkj0;->e(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    check-cast v4, Lzj;

    .line 168
    .line 169
    iget-object v4, v4, Lzj;->b:Lj01;

    .line 170
    .line 171
    iget-object v5, v4, Lkj0;->i:[Ljava/lang/Object;

    .line 172
    .line 173
    array-length v5, v5

    .line 174
    move v6, v2

    .line 175
    :goto_6
    if-ge v6, v5, :cond_7

    .line 176
    .line 177
    invoke-virtual {v4, v6}, Lkj0;->e(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    check-cast v9, Li01;

    .line 182
    .line 183
    invoke-virtual {v9, v1}, Li01;->d(Lh01;)V

    .line 184
    .line 185
    .line 186
    add-int/lit8 v6, v6, 0x1

    .line 187
    .line 188
    goto :goto_6

    .line 189
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_8
    iget v0, v1, Lak;->h:I

    .line 193
    .line 194
    iput v0, p1, Lbk;->k:I

    .line 195
    .line 196
    :cond_9
    iget p1, p1, Lbk;->k:I

    .line 197
    .line 198
    iget-boolean v0, p0, Lbb2;->a:Z

    .line 199
    .line 200
    if-eqz v0, :cond_a

    .line 201
    .line 202
    goto :goto_7

    .line 203
    :cond_a
    iget v2, p0, Lbb2;->c:I

    .line 204
    .line 205
    :goto_7
    add-int v9, p1, v2

    .line 206
    .line 207
    iput v9, p0, Lbb2;->b:I

    .line 208
    .line 209
    new-instance v5, Ldq1;

    .line 210
    .line 211
    move v10, p2

    .line 212
    move-object v6, p3

    .line 213
    invoke-direct/range {v5 .. v10}, Ldq1;-><init>(Lz8;IIII)V

    .line 214
    .line 215
    .line 216
    iput-object v5, p0, Lbb2;->f:Ljava/lang/Object;

    .line 217
    .line 218
    new-instance p1, Lkj1;

    .line 219
    .line 220
    invoke-direct {p1, p0, v5}, Lkj1;-><init>(Lbb2;Ldq1;)V

    .line 221
    .line 222
    .line 223
    iput-object p1, p0, Lbb2;->g:Ljava/lang/Object;

    .line 224
    .line 225
    return-void
.end method

.method public constructor <init>(ZLfa3;)V
    .locals 2

    .line 226
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 227
    iput-boolean p1, p0, Lbb2;->a:Z

    .line 228
    iput-object p2, p0, Lbb2;->d:Ljava/lang/Object;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 229
    sget-object p1, Lfa3;->h:Lfa3;

    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 230
    :cond_0
    const-string p0, "Lsq2 not (yet) supported for differential axes"

    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    throw v0

    .line 231
    :cond_1
    :goto_0
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/4 p2, 0x3

    if-eqz p1, :cond_3

    const/4 v1, 0x1

    if-ne p1, v1, :cond_2

    const/4 p1, 0x2

    goto :goto_1

    :cond_2
    invoke-static {}, Lc80;->s()V

    throw v0

    :cond_3
    move p1, p2

    :goto_1
    iput p1, p0, Lbb2;->b:I

    const/16 p1, 0x14

    .line 232
    new-array v0, p1, [Li40;

    iput-object v0, p0, Lbb2;->e:Ljava/lang/Object;

    .line 233
    new-array v0, p1, [F

    iput-object v0, p0, Lbb2;->f:Ljava/lang/Object;

    .line 234
    new-array p1, p1, [F

    iput-object p1, p0, Lbb2;->g:Ljava/lang/Object;

    .line 235
    new-array p1, p2, [F

    iput-object p1, p0, Lbb2;->h:Ljava/lang/Object;

    return-void
.end method

.method public static c(Li01;Lr72;)Ls72;
    .locals 5

    .line 1
    iget-object v0, p0, Li01;->k:Ls72;

    .line 2
    .line 3
    iget-object p0, p0, Li01;->h:Lza2;

    .line 4
    .line 5
    iget p0, p0, Lza2;->a:I

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
    iget-object p0, v0, Lkj0;->i:[Ljava/lang/Object;

    .line 21
    .line 22
    array-length p0, p0

    .line 23
    const/4 v1, 0x2

    .line 24
    if-ne p0, v1, :cond_1

    .line 25
    .line 26
    iget p0, p1, Lr72;->h:I

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-virtual {v0, v1}, Lkj0;->e(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Lr72;

    .line 34
    .line 35
    iget v3, v3, Lr72;->h:I

    .line 36
    .line 37
    if-ne p0, v3, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lkj0;->e(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Lr72;

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Lkj0;->e(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Lr72;

    .line 50
    .line 51
    invoke-static {p0, v0}, Ls72;->i(Lr72;Lr72;)Ls72;

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
    iget-object p0, v0, Lkj0;->i:[Ljava/lang/Object;

    .line 59
    .line 60
    array-length p0, p0

    .line 61
    new-instance v1, Ls72;

    .line 62
    .line 63
    add-int/lit8 v3, p0, 0x1

    .line 64
    .line 65
    invoke-direct {v1, v3}, Lkj0;-><init>(I)V

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
    invoke-virtual {v0, v3}, Lkj0;->e(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {v1, v4, v3}, Lkj0;->f(ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    move v3, v4

    .line 81
    goto :goto_1

    .line 82
    :cond_3
    invoke-virtual {v1, v2, p1}, Lkj0;->f(ILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget-boolean p0, v0, Lvj1;->h:Z

    .line 86
    .line 87
    if-nez p0, :cond_4

    .line 88
    .line 89
    iput-boolean v2, v1, Lvj1;->h:Z

    .line 90
    .line 91
    :cond_4
    return-object v1

    .line 92
    nop

    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(FJ)V
    .locals 2

    .line 1
    iget v0, p0, Lbb2;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    rem-int/lit8 v0, v0, 0x14

    .line 6
    .line 7
    iput v0, p0, Lbb2;->c:I

    .line 8
    .line 9
    iget-object p0, p0, Lbb2;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, [Li40;

    .line 12
    .line 13
    aget-object v1, p0, v0

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    new-instance v1, Li40;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-wide p2, v1, Li40;->a:J

    .line 23
    .line 24
    iput p1, v1, Li40;->b:F

    .line 25
    .line 26
    aput-object v1, p0, v0

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iput-wide p2, v1, Li40;->a:J

    .line 30
    .line 31
    iput p1, v1, Li40;->b:F

    .line 32
    .line 33
    return-void
.end method

.method public b(F)F
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    cmpl-float v3, v1, v2

    .line 7
    .line 8
    if-lez v3, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v4, "maximumVelocity should be a positive value. You specified="

    .line 14
    .line 15
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-static {v3}, Lkz0;->b(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object v3, v0, Lbb2;->d:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v3, Lfa3;

    .line 31
    .line 32
    iget-object v4, v0, Lbb2;->f:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v4, [F

    .line 35
    .line 36
    iget-object v5, v0, Lbb2;->g:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v5, [F

    .line 39
    .line 40
    iget v6, v0, Lbb2;->c:I

    .line 41
    .line 42
    iget-object v7, v0, Lbb2;->e:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v7, [Li40;

    .line 45
    .line 46
    aget-object v8, v7, v6

    .line 47
    .line 48
    if-nez v8, :cond_1

    .line 49
    .line 50
    move v0, v2

    .line 51
    move v15, v0

    .line 52
    goto/16 :goto_9

    .line 53
    .line 54
    :cond_1
    const/4 v9, 0x0

    .line 55
    move-object v10, v8

    .line 56
    :goto_1
    aget-object v11, v7, v6

    .line 57
    .line 58
    iget-boolean v13, v0, Lbb2;->a:Z

    .line 59
    .line 60
    if-nez v11, :cond_2

    .line 61
    .line 62
    move v15, v2

    .line 63
    move-object v10, v3

    .line 64
    move/from16 v17, v13

    .line 65
    .line 66
    const/16 v16, 0x1

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_2
    iget-wide v14, v8, Li40;->a:J

    .line 70
    .line 71
    move/from16 v17, v13

    .line 72
    .line 73
    const/16 v16, 0x1

    .line 74
    .line 75
    iget-wide v12, v11, Li40;->a:J

    .line 76
    .line 77
    sub-long/2addr v14, v12

    .line 78
    long-to-float v14, v14

    .line 79
    move v15, v2

    .line 80
    move-object/from16 v18, v3

    .line 81
    .line 82
    iget-wide v2, v10, Li40;->a:J

    .line 83
    .line 84
    sub-long/2addr v12, v2

    .line 85
    invoke-static {v12, v13}, Ljava/lang/Math;->abs(J)J

    .line 86
    .line 87
    .line 88
    move-result-wide v2

    .line 89
    long-to-float v2, v2

    .line 90
    sget-object v3, Lfa3;->h:Lfa3;

    .line 91
    .line 92
    move-object/from16 v10, v18

    .line 93
    .line 94
    if-eq v10, v3, :cond_4

    .line 95
    .line 96
    if-eqz v17, :cond_3

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_3
    move-object v3, v8

    .line 100
    goto :goto_3

    .line 101
    :cond_4
    :goto_2
    move-object v3, v11

    .line 102
    :goto_3
    const/high16 v12, 0x42c80000    # 100.0f

    .line 103
    .line 104
    cmpl-float v12, v14, v12

    .line 105
    .line 106
    if-gtz v12, :cond_8

    .line 107
    .line 108
    const/high16 v12, 0x42200000    # 40.0f

    .line 109
    .line 110
    cmpl-float v2, v2, v12

    .line 111
    .line 112
    if-lez v2, :cond_5

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_5
    iget v2, v11, Li40;->b:F

    .line 116
    .line 117
    aput v2, v4, v9

    .line 118
    .line 119
    neg-float v2, v14

    .line 120
    aput v2, v5, v9

    .line 121
    .line 122
    const/16 v2, 0x14

    .line 123
    .line 124
    if-nez v6, :cond_6

    .line 125
    .line 126
    move v6, v2

    .line 127
    :cond_6
    add-int/lit8 v6, v6, -0x1

    .line 128
    .line 129
    add-int/lit8 v9, v9, 0x1

    .line 130
    .line 131
    if-lt v9, v2, :cond_7

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_7
    move-object v2, v10

    .line 135
    move-object v10, v3

    .line 136
    move-object v3, v2

    .line 137
    move v2, v15

    .line 138
    goto :goto_1

    .line 139
    :cond_8
    :goto_4
    iget v2, v0, Lbb2;->b:I

    .line 140
    .line 141
    if-lt v9, v2, :cond_f

    .line 142
    .line 143
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-eqz v2, :cond_e

    .line 148
    .line 149
    move/from16 v3, v16

    .line 150
    .line 151
    if-ne v2, v3, :cond_d

    .line 152
    .line 153
    sub-int/2addr v9, v3

    .line 154
    aget v0, v5, v9

    .line 155
    .line 156
    move v2, v9

    .line 157
    move v3, v15

    .line 158
    :goto_5
    const/high16 v6, 0x40000000    # 2.0f

    .line 159
    .line 160
    if-lez v2, :cond_c

    .line 161
    .line 162
    add-int/lit8 v7, v2, -0x1

    .line 163
    .line 164
    aget v8, v5, v7

    .line 165
    .line 166
    cmpg-float v10, v0, v8

    .line 167
    .line 168
    if-nez v10, :cond_9

    .line 169
    .line 170
    goto :goto_7

    .line 171
    :cond_9
    if-eqz v17, :cond_a

    .line 172
    .line 173
    aget v7, v4, v7

    .line 174
    .line 175
    neg-float v7, v7

    .line 176
    goto :goto_6

    .line 177
    :cond_a
    aget v10, v4, v2

    .line 178
    .line 179
    aget v7, v4, v7

    .line 180
    .line 181
    sub-float v7, v10, v7

    .line 182
    .line 183
    :goto_6
    sub-float/2addr v0, v8

    .line 184
    div-float/2addr v7, v0

    .line 185
    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    mul-float/2addr v10, v6

    .line 194
    float-to-double v10, v10

    .line 195
    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    .line 196
    .line 197
    .line 198
    move-result-wide v10

    .line 199
    double-to-float v6, v10

    .line 200
    mul-float/2addr v0, v6

    .line 201
    sub-float v0, v7, v0

    .line 202
    .line 203
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    mul-float/2addr v6, v0

    .line 208
    add-float/2addr v3, v6

    .line 209
    if-ne v2, v9, :cond_b

    .line 210
    .line 211
    const/high16 v0, 0x3f000000    # 0.5f

    .line 212
    .line 213
    mul-float/2addr v3, v0

    .line 214
    :cond_b
    :goto_7
    add-int/lit8 v2, v2, -0x1

    .line 215
    .line 216
    move v0, v8

    .line 217
    goto :goto_5

    .line 218
    :cond_c
    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    mul-float/2addr v2, v6

    .line 227
    float-to-double v2, v2

    .line 228
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 229
    .line 230
    .line 231
    move-result-wide v2

    .line 232
    double-to-float v2, v2

    .line 233
    mul-float/2addr v0, v2

    .line 234
    goto :goto_8

    .line 235
    :cond_d
    invoke-static {}, Lc80;->s()V

    .line 236
    .line 237
    .line 238
    return v15

    .line 239
    :cond_e
    :try_start_0
    iget-object v0, v0, Lbb2;->h:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v0, [F

    .line 242
    .line 243
    invoke-static {v5, v4, v9, v0}, Lga3;->c([F[FI[F)V

    .line 244
    .line 245
    .line 246
    const/16 v16, 0x1

    .line 247
    .line 248
    aget v0, v0, v16
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 249
    .line 250
    goto :goto_8

    .line 251
    :catch_0
    move v0, v15

    .line 252
    :goto_8
    const/high16 v2, 0x447a0000    # 1000.0f

    .line 253
    .line 254
    mul-float/2addr v0, v2

    .line 255
    goto :goto_9

    .line 256
    :cond_f
    move v0, v15

    .line 257
    :goto_9
    cmpg-float v2, v0, v15

    .line 258
    .line 259
    if-nez v2, :cond_10

    .line 260
    .line 261
    goto :goto_a

    .line 262
    :cond_10
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 263
    .line 264
    .line 265
    move-result v2

    .line 266
    if-eqz v2, :cond_11

    .line 267
    .line 268
    :goto_a
    move v2, v15

    .line 269
    goto :goto_b

    .line 270
    :cond_11
    cmpl-float v2, v0, v15

    .line 271
    .line 272
    if-lez v2, :cond_13

    .line 273
    .line 274
    cmpl-float v2, v0, v1

    .line 275
    .line 276
    if-lez v2, :cond_12

    .line 277
    .line 278
    move v0, v1

    .line 279
    :cond_12
    move v2, v0

    .line 280
    goto :goto_b

    .line 281
    :cond_13
    neg-float v1, v1

    .line 282
    cmpg-float v2, v0, v1

    .line 283
    .line 284
    if-gez v2, :cond_12

    .line 285
    .line 286
    move v2, v1

    .line 287
    :goto_b
    return v2
.end method
