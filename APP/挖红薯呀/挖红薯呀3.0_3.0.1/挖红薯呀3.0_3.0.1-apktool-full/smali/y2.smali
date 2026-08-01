.class public final Ly2;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Li9;
.implements Lpb1;


# instance fields
.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 223
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 224
    new-instance v0, Li7;

    const/4 v1, 0x6

    invoke-direct {v0, v1, p0}, Li7;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Ly2;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Typeface;Lge0;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly2;->g:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Ly2;->d:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance p1, Lhe0;

    .line 9
    .line 10
    const/16 v0, 0x400

    .line 11
    .line 12
    invoke-direct {p1, v0}, Lhe0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Ly2;->f:Ljava/lang/Object;

    .line 16
    .line 17
    const/4 p1, 0x6

    .line 18
    invoke-virtual {p2, p1}, Led0;->a(I)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget v2, p2, Led0;->d:I

    .line 26
    .line 27
    add-int/2addr v0, v2

    .line 28
    iget-object v2, p2, Led0;->g:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    add-int/2addr v2, v0

    .line 37
    iget-object v0, p2, Led0;->g:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move v0, v1

    .line 47
    :goto_0
    mul-int/lit8 v0, v0, 0x2

    .line 48
    .line 49
    new-array v0, v0, [C

    .line 50
    .line 51
    iput-object v0, p0, Ly2;->e:Ljava/lang/Object;

    .line 52
    .line 53
    invoke-virtual {p2, p1}, Led0;->a(I)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_1

    .line 58
    .line 59
    iget v0, p2, Led0;->d:I

    .line 60
    .line 61
    add-int/2addr p1, v0

    .line 62
    iget-object v0, p2, Led0;->g:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    add-int/2addr v0, p1

    .line 71
    iget-object p1, p2, Led0;->g:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    goto :goto_1

    .line 80
    :cond_1
    move p1, v1

    .line 81
    :goto_1
    move p2, v1

    .line 82
    :goto_2
    if-ge p2, p1, :cond_7

    .line 83
    .line 84
    new-instance v0, Ly91;

    .line 85
    .line 86
    invoke-direct {v0, p0, p2}, Ly91;-><init>(Ly2;I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ly91;->b()Lfe0;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    const/4 v3, 0x4

    .line 94
    invoke-virtual {v2, v3}, Led0;->a(I)I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-eqz v3, :cond_2

    .line 99
    .line 100
    iget-object v4, v2, Led0;->g:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v4, Ljava/nio/ByteBuffer;

    .line 103
    .line 104
    iget v2, v2, Led0;->d:I

    .line 105
    .line 106
    add-int/2addr v3, v2

    .line 107
    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    goto :goto_3

    .line 112
    :cond_2
    move v2, v1

    .line 113
    :goto_3
    iget-object v3, p0, Ly2;->e:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v3, [C

    .line 116
    .line 117
    mul-int/lit8 v4, p2, 0x2

    .line 118
    .line 119
    invoke-static {v2, v3, v4}, Ljava/lang/Character;->toChars(I[CI)I

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Ly91;->b()Lfe0;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    const/16 v3, 0x10

    .line 127
    .line 128
    invoke-virtual {v2, v3}, Led0;->a(I)I

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-eqz v4, :cond_3

    .line 133
    .line 134
    iget v5, v2, Led0;->d:I

    .line 135
    .line 136
    add-int/2addr v4, v5

    .line 137
    iget-object v5, v2, Led0;->g:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v5, Ljava/nio/ByteBuffer;

    .line 140
    .line 141
    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    add-int/2addr v5, v4

    .line 146
    iget-object v2, v2, Led0;->g:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v2, Ljava/nio/ByteBuffer;

    .line 149
    .line 150
    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    goto :goto_4

    .line 155
    :cond_3
    move v2, v1

    .line 156
    :goto_4
    const/4 v4, 0x1

    .line 157
    if-lez v2, :cond_4

    .line 158
    .line 159
    move v2, v4

    .line 160
    goto :goto_5

    .line 161
    :cond_4
    move v2, v1

    .line 162
    :goto_5
    if-eqz v2, :cond_6

    .line 163
    .line 164
    iget-object v2, p0, Ly2;->f:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v2, Lhe0;

    .line 167
    .line 168
    invoke-virtual {v0}, Ly91;->b()Lfe0;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    invoke-virtual {v5, v3}, Led0;->a(I)I

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-eqz v3, :cond_5

    .line 177
    .line 178
    iget v6, v5, Led0;->d:I

    .line 179
    .line 180
    add-int/2addr v3, v6

    .line 181
    iget-object v6, v5, Led0;->g:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v6, Ljava/nio/ByteBuffer;

    .line 184
    .line 185
    invoke-virtual {v6, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 186
    .line 187
    .line 188
    move-result v6

    .line 189
    add-int/2addr v6, v3

    .line 190
    iget-object v3, v5, Led0;->g:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v3, Ljava/nio/ByteBuffer;

    .line 193
    .line 194
    invoke-virtual {v3, v6}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    goto :goto_6

    .line 199
    :cond_5
    move v3, v1

    .line 200
    :goto_6
    sub-int/2addr v3, v4

    .line 201
    invoke-virtual {v2, v0, v1, v3}, Lhe0;->a(Ly91;II)V

    .line 202
    .line 203
    .line 204
    add-int/lit8 p2, p2, 0x1

    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_6
    const-string p0, "invalid metadata codepoint length"

    .line 208
    .line 209
    invoke-static {p0}, Lxc;->l(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    const/4 p0, 0x0

    .line 213
    throw p0

    .line 214
    :cond_7
    return-void
.end method

.method public constructor <init>(Leu;)V
    .locals 1

    .line 225
    new-instance v0, Lqb1;

    invoke-direct {v0, p1}, Lqb1;-><init>(Ljava/lang/Object;)V

    .line 226
    invoke-direct {p0, v0}, Ly2;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 222
    iput-object p1, p0, Ly2;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lvc1;Ltc1;Lel;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 216
    iput-object p1, p0, Ly2;->d:Ljava/lang/Object;

    .line 217
    iput-object p2, p0, Ly2;->e:Ljava/lang/Object;

    .line 218
    iput-object p3, p0, Ly2;->f:Ljava/lang/Object;

    .line 219
    new-instance p1, Ljo0;

    const/16 p2, 0x13

    .line 220
    invoke-direct {p1, p2}, Ljo0;-><init>(I)V

    .line 221
    iput-object p1, p0, Ly2;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public b(Lb8;Lb8;Lb8;)J
    .locals 8

    .line 1
    invoke-virtual {p1}, Lb8;->b()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    :goto_0
    if-ge v3, v0, :cond_0

    .line 9
    .line 10
    iget-object v4, p0, Ly2;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v4, Lc8;

    .line 13
    .line 14
    invoke-interface {v4, v3}, Lc8;->get(I)Leu;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-virtual {p1, v3}, Lb8;->a(I)F

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    invoke-virtual {p2, v3}, Lb8;->a(I)F

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    invoke-virtual {p3, v3}, Lb8;->a(I)F

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    invoke-interface {v4, v5, v6, v7}, Leu;->d(FFF)J

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 35
    .line 36
    .line 37
    move-result-wide v1

    .line 38
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    return-wide v1
.end method

.method public d(JJLjk;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    instance-of v2, v1, Lbj0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lbj0;

    .line 11
    .line 12
    iget v3, v2, Lbj0;->i:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lbj0;->i:I

    .line 22
    .line 23
    :goto_0
    move-object v8, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lbj0;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Lbj0;-><init>(Ly2;Ljk;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v8, Lbj0;->g:Ljava/lang/Object;

    .line 32
    .line 33
    iget v2, v8, Lbj0;->i:I

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x2

    .line 37
    const/4 v5, 0x1

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    if-eq v2, v5, :cond_2

    .line 41
    .line 42
    if-ne v2, v4, :cond_1

    .line 43
    .line 44
    invoke-static {v1}, Lw60;->M(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto/16 :goto_16

    .line 48
    .line 49
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {v0}, Lxc;->o(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v3

    .line 55
    :cond_2
    invoke-static {v1}, Lw60;->M(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_d

    .line 59
    .line 60
    :cond_3
    invoke-static {v1}, Lw60;->M(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object v1, v0, Ly2;->d:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Lgj0;

    .line 66
    .line 67
    const/16 v2, 0x10

    .line 68
    .line 69
    const-class v6, Lgj0;

    .line 70
    .line 71
    const-string v7, "visitAncestors called on an unattached node"

    .line 72
    .line 73
    const/high16 v9, 0x40000

    .line 74
    .line 75
    if-eqz v1, :cond_11

    .line 76
    .line 77
    iget-boolean v11, v1, Loe0;->q:Z

    .line 78
    .line 79
    if-eqz v11, :cond_11

    .line 80
    .line 81
    iget-object v11, v1, Loe0;->d:Loe0;

    .line 82
    .line 83
    iget-boolean v11, v11, Loe0;->q:Z

    .line 84
    .line 85
    if-nez v11, :cond_4

    .line 86
    .line 87
    invoke-static {v7}, Lw10;->b(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :cond_4
    iget-object v11, v1, Loe0;->d:Loe0;

    .line 91
    .line 92
    iget-object v11, v11, Loe0;->h:Loe0;

    .line 93
    .line 94
    invoke-static {v1}, Lpf1;->Q(Lrm;)Lb60;

    .line 95
    .line 96
    .line 97
    move-result-object v12

    .line 98
    :goto_2
    if-eqz v12, :cond_10

    .line 99
    .line 100
    iget-object v13, v12, Lb60;->I:Lmj0;

    .line 101
    .line 102
    iget-object v13, v13, Lmj0;->f:Loe0;

    .line 103
    .line 104
    iget v13, v13, Loe0;->g:I

    .line 105
    .line 106
    and-int/2addr v13, v9

    .line 107
    if-eqz v13, :cond_e

    .line 108
    .line 109
    :goto_3
    if-eqz v11, :cond_e

    .line 110
    .line 111
    iget v13, v11, Loe0;->f:I

    .line 112
    .line 113
    and-int/2addr v13, v9

    .line 114
    if-eqz v13, :cond_d

    .line 115
    .line 116
    move-object v14, v3

    .line 117
    move-object v13, v11

    .line 118
    :goto_4
    if-eqz v13, :cond_d

    .line 119
    .line 120
    instance-of v15, v13, Lh91;

    .line 121
    .line 122
    if-eqz v15, :cond_6

    .line 123
    .line 124
    check-cast v13, Lh91;

    .line 125
    .line 126
    invoke-virtual {v1}, Lgj0;->k()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v15

    .line 130
    invoke-interface {v13}, Lh91;->k()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-static {v15, v3}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    if-eqz v3, :cond_5

    .line 139
    .line 140
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    if-ne v6, v3, :cond_5

    .line 145
    .line 146
    :goto_5
    move/from16 v16, v9

    .line 147
    .line 148
    goto/16 :goto_b

    .line 149
    .line 150
    :cond_5
    move/from16 v16, v9

    .line 151
    .line 152
    goto :goto_9

    .line 153
    :cond_6
    iget v3, v13, Loe0;->f:I

    .line 154
    .line 155
    and-int/2addr v3, v9

    .line 156
    if-eqz v3, :cond_5

    .line 157
    .line 158
    instance-of v3, v13, Lsm;

    .line 159
    .line 160
    if-eqz v3, :cond_5

    .line 161
    .line 162
    move-object v3, v13

    .line 163
    check-cast v3, Lsm;

    .line 164
    .line 165
    iget-object v3, v3, Lsm;->s:Loe0;

    .line 166
    .line 167
    const/4 v15, 0x0

    .line 168
    :goto_6
    if-eqz v3, :cond_b

    .line 169
    .line 170
    move/from16 v16, v9

    .line 171
    .line 172
    iget v9, v3, Loe0;->f:I

    .line 173
    .line 174
    and-int v9, v9, v16

    .line 175
    .line 176
    if-eqz v9, :cond_a

    .line 177
    .line 178
    add-int/lit8 v15, v15, 0x1

    .line 179
    .line 180
    if-ne v15, v5, :cond_7

    .line 181
    .line 182
    move-object v13, v3

    .line 183
    goto :goto_7

    .line 184
    :cond_7
    if-nez v14, :cond_8

    .line 185
    .line 186
    new-instance v14, Lsh0;

    .line 187
    .line 188
    new-array v9, v2, [Loe0;

    .line 189
    .line 190
    invoke-direct {v14, v9}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    :cond_8
    if-eqz v13, :cond_9

    .line 194
    .line 195
    invoke-virtual {v14, v13}, Lsh0;->b(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    const/4 v13, 0x0

    .line 199
    :cond_9
    invoke-virtual {v14, v3}, Lsh0;->b(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    :cond_a
    :goto_7
    iget-object v3, v3, Loe0;->i:Loe0;

    .line 203
    .line 204
    move/from16 v9, v16

    .line 205
    .line 206
    goto :goto_6

    .line 207
    :cond_b
    move/from16 v16, v9

    .line 208
    .line 209
    if-ne v15, v5, :cond_c

    .line 210
    .line 211
    :goto_8
    move/from16 v9, v16

    .line 212
    .line 213
    const/4 v3, 0x0

    .line 214
    goto :goto_4

    .line 215
    :cond_c
    :goto_9
    invoke-static {v14}, Lpf1;->f(Lsh0;)Loe0;

    .line 216
    .line 217
    .line 218
    move-result-object v13

    .line 219
    goto :goto_8

    .line 220
    :cond_d
    move/from16 v16, v9

    .line 221
    .line 222
    iget-object v11, v11, Loe0;->h:Loe0;

    .line 223
    .line 224
    move/from16 v9, v16

    .line 225
    .line 226
    const/4 v3, 0x0

    .line 227
    goto :goto_3

    .line 228
    :cond_e
    move/from16 v16, v9

    .line 229
    .line 230
    invoke-virtual {v12}, Lb60;->v()Lb60;

    .line 231
    .line 232
    .line 233
    move-result-object v12

    .line 234
    if-eqz v12, :cond_f

    .line 235
    .line 236
    iget-object v3, v12, Lb60;->I:Lmj0;

    .line 237
    .line 238
    if-eqz v3, :cond_f

    .line 239
    .line 240
    iget-object v3, v3, Lmj0;->e:Ld61;

    .line 241
    .line 242
    move-object v11, v3

    .line 243
    goto :goto_a

    .line 244
    :cond_f
    const/4 v11, 0x0

    .line 245
    :goto_a
    move/from16 v9, v16

    .line 246
    .line 247
    const/4 v3, 0x0

    .line 248
    goto/16 :goto_2

    .line 249
    .line 250
    :cond_10
    const/4 v13, 0x0

    .line 251
    goto :goto_5

    .line 252
    :goto_b
    check-cast v13, Lgj0;

    .line 253
    .line 254
    goto :goto_c

    .line 255
    :cond_11
    move/from16 v16, v9

    .line 256
    .line 257
    const/4 v13, 0x0

    .line 258
    :goto_c
    const-wide/16 v11, 0x0

    .line 259
    .line 260
    sget-object v1, Lzk;->d:Lzk;

    .line 261
    .line 262
    if-nez v13, :cond_13

    .line 263
    .line 264
    iget-object v0, v0, Ly2;->e:Ljava/lang/Object;

    .line 265
    .line 266
    move-object v3, v0

    .line 267
    check-cast v3, Lgj0;

    .line 268
    .line 269
    if-eqz v3, :cond_22

    .line 270
    .line 271
    iput v5, v8, Lbj0;->i:I

    .line 272
    .line 273
    move-wide/from16 v4, p1

    .line 274
    .line 275
    move-wide/from16 v6, p3

    .line 276
    .line 277
    invoke-virtual/range {v3 .. v8}, Lgj0;->R(JJLik;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    if-ne v0, v1, :cond_12

    .line 282
    .line 283
    goto/16 :goto_15

    .line 284
    .line 285
    :cond_12
    move-object v1, v0

    .line 286
    :goto_d
    check-cast v1, Lrb1;

    .line 287
    .line 288
    iget-wide v11, v1, Lrb1;->a:J

    .line 289
    .line 290
    goto/16 :goto_17

    .line 291
    .line 292
    :cond_13
    iget-object v0, v0, Ly2;->d:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v0, Lgj0;

    .line 295
    .line 296
    if-eqz v0, :cond_20

    .line 297
    .line 298
    iget-boolean v3, v0, Loe0;->q:Z

    .line 299
    .line 300
    if-eqz v3, :cond_20

    .line 301
    .line 302
    iget-object v3, v0, Loe0;->d:Loe0;

    .line 303
    .line 304
    iget-boolean v3, v3, Loe0;->q:Z

    .line 305
    .line 306
    if-nez v3, :cond_14

    .line 307
    .line 308
    invoke-static {v7}, Lw10;->b(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    :cond_14
    iget-object v3, v0, Loe0;->d:Loe0;

    .line 312
    .line 313
    iget-object v3, v3, Loe0;->h:Loe0;

    .line 314
    .line 315
    invoke-static {v0}, Lpf1;->Q(Lrm;)Lb60;

    .line 316
    .line 317
    .line 318
    move-result-object v7

    .line 319
    :goto_e
    if-eqz v7, :cond_1f

    .line 320
    .line 321
    iget-object v9, v7, Lb60;->I:Lmj0;

    .line 322
    .line 323
    iget-object v9, v9, Lmj0;->f:Loe0;

    .line 324
    .line 325
    iget v9, v9, Loe0;->g:I

    .line 326
    .line 327
    and-int v9, v9, v16

    .line 328
    .line 329
    if-eqz v9, :cond_1d

    .line 330
    .line 331
    :goto_f
    if-eqz v3, :cond_1d

    .line 332
    .line 333
    iget v9, v3, Loe0;->f:I

    .line 334
    .line 335
    and-int v9, v9, v16

    .line 336
    .line 337
    if-eqz v9, :cond_1c

    .line 338
    .line 339
    move-object v9, v3

    .line 340
    const/4 v13, 0x0

    .line 341
    :goto_10
    if-eqz v9, :cond_1c

    .line 342
    .line 343
    instance-of v14, v9, Lh91;

    .line 344
    .line 345
    if-eqz v14, :cond_15

    .line 346
    .line 347
    check-cast v9, Lh91;

    .line 348
    .line 349
    invoke-virtual {v0}, Lgj0;->k()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v14

    .line 353
    invoke-interface {v9}, Lh91;->k()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v15

    .line 357
    invoke-static {v14, v15}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v14

    .line 361
    if-eqz v14, :cond_1b

    .line 362
    .line 363
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    move-result-object v14

    .line 367
    if-ne v6, v14, :cond_1b

    .line 368
    .line 369
    move-object v3, v9

    .line 370
    goto :goto_13

    .line 371
    :cond_15
    iget v14, v9, Loe0;->f:I

    .line 372
    .line 373
    and-int v14, v14, v16

    .line 374
    .line 375
    if-eqz v14, :cond_1b

    .line 376
    .line 377
    instance-of v14, v9, Lsm;

    .line 378
    .line 379
    if-eqz v14, :cond_1b

    .line 380
    .line 381
    move-object v14, v9

    .line 382
    check-cast v14, Lsm;

    .line 383
    .line 384
    iget-object v14, v14, Lsm;->s:Loe0;

    .line 385
    .line 386
    const/4 v15, 0x0

    .line 387
    :goto_11
    if-eqz v14, :cond_1a

    .line 388
    .line 389
    iget v10, v14, Loe0;->f:I

    .line 390
    .line 391
    and-int v10, v10, v16

    .line 392
    .line 393
    if-eqz v10, :cond_19

    .line 394
    .line 395
    add-int/lit8 v15, v15, 0x1

    .line 396
    .line 397
    if-ne v15, v5, :cond_16

    .line 398
    .line 399
    move-object v9, v14

    .line 400
    goto :goto_12

    .line 401
    :cond_16
    if-nez v13, :cond_17

    .line 402
    .line 403
    new-instance v13, Lsh0;

    .line 404
    .line 405
    new-array v10, v2, [Loe0;

    .line 406
    .line 407
    invoke-direct {v13, v10}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 408
    .line 409
    .line 410
    :cond_17
    if-eqz v9, :cond_18

    .line 411
    .line 412
    invoke-virtual {v13, v9}, Lsh0;->b(Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    const/4 v9, 0x0

    .line 416
    :cond_18
    invoke-virtual {v13, v14}, Lsh0;->b(Ljava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    :cond_19
    :goto_12
    iget-object v14, v14, Loe0;->i:Loe0;

    .line 420
    .line 421
    goto :goto_11

    .line 422
    :cond_1a
    if-ne v15, v5, :cond_1b

    .line 423
    .line 424
    goto :goto_10

    .line 425
    :cond_1b
    invoke-static {v13}, Lpf1;->f(Lsh0;)Loe0;

    .line 426
    .line 427
    .line 428
    move-result-object v9

    .line 429
    goto :goto_10

    .line 430
    :cond_1c
    iget-object v3, v3, Loe0;->h:Loe0;

    .line 431
    .line 432
    goto :goto_f

    .line 433
    :cond_1d
    invoke-virtual {v7}, Lb60;->v()Lb60;

    .line 434
    .line 435
    .line 436
    move-result-object v7

    .line 437
    if-eqz v7, :cond_1e

    .line 438
    .line 439
    iget-object v3, v7, Lb60;->I:Lmj0;

    .line 440
    .line 441
    if-eqz v3, :cond_1e

    .line 442
    .line 443
    iget-object v3, v3, Lmj0;->e:Ld61;

    .line 444
    .line 445
    goto :goto_e

    .line 446
    :cond_1e
    const/4 v3, 0x0

    .line 447
    goto/16 :goto_e

    .line 448
    .line 449
    :cond_1f
    const/4 v3, 0x0

    .line 450
    :goto_13
    check-cast v3, Lgj0;

    .line 451
    .line 452
    goto :goto_14

    .line 453
    :cond_20
    const/4 v3, 0x0

    .line 454
    :goto_14
    if-eqz v3, :cond_22

    .line 455
    .line 456
    iput v4, v8, Lbj0;->i:I

    .line 457
    .line 458
    move-wide/from16 v4, p1

    .line 459
    .line 460
    move-wide/from16 v6, p3

    .line 461
    .line 462
    invoke-virtual/range {v3 .. v8}, Lgj0;->R(JJLik;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    if-ne v0, v1, :cond_21

    .line 467
    .line 468
    :goto_15
    return-object v1

    .line 469
    :cond_21
    move-object v1, v0

    .line 470
    :goto_16
    check-cast v1, Lrb1;

    .line 471
    .line 472
    iget-wide v11, v1, Lrb1;->a:J

    .line 473
    .line 474
    :cond_22
    :goto_17
    new-instance v0, Lrb1;

    .line 475
    .line 476
    invoke-direct {v0, v11, v12}, Lrb1;-><init>(J)V

    .line 477
    .line 478
    .line 479
    return-object v0
.end method

.method public e(JLb8;Lb8;Lb8;)Lb8;
    .locals 14

    .line 1
    iget-object v0, p0, Ly2;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb8;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual/range {p5 .. p5}, Lb8;->c()Lb8;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Ly2;->f:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Ly2;->f:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lb8;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const-string v2, "velocityVector"

    .line 19
    .line 20
    if-eqz v0, :cond_4

    .line 21
    .line 22
    invoke-virtual {v0}, Lb8;->b()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v3, 0x0

    .line 27
    :goto_0
    iget-object v4, p0, Ly2;->f:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Lb8;

    .line 30
    .line 31
    if-ge v3, v0, :cond_2

    .line 32
    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    iget-object v5, p0, Ly2;->d:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, Lc8;

    .line 38
    .line 39
    invoke-interface {v5, v3}, Lc8;->get(I)Leu;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    move-object/from16 v5, p3

    .line 44
    .line 45
    invoke-virtual {v5, v3}, Lb8;->a(I)F

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    move-object/from16 v12, p4

    .line 50
    .line 51
    invoke-virtual {v12, v3}, Lb8;->a(I)F

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    move-object/from16 v13, p5

    .line 56
    .line 57
    invoke-virtual {v13, v3}, Lb8;->a(I)F

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    move-wide v7, p1

    .line 62
    invoke-interface/range {v6 .. v11}, Leu;->c(JFFF)F

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    invoke-virtual {v4, v6, v3}, Lb8;->e(FI)V

    .line 67
    .line 68
    .line 69
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    invoke-static {v2}, Lp30;->V(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v1

    .line 76
    :cond_2
    if-eqz v4, :cond_3

    .line 77
    .line 78
    return-object v4

    .line 79
    :cond_3
    invoke-static {v2}, Lp30;->V(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v1

    .line 83
    :cond_4
    invoke-static {v2}, Lp30;->V(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v1
.end method

.method public f(JLjk;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, Lcj0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcj0;

    .line 7
    .line 8
    iget v1, v0, Lcj0;->i:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcj0;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcj0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcj0;-><init>(Ly2;Ljk;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcj0;->g:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lcj0;->i:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    invoke-static {p3}, Lw60;->M(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto/16 :goto_7

    .line 39
    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-object v2

    .line 46
    :cond_2
    invoke-static {p3}, Lw60;->M(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, Ly2;->d:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p0, Lgj0;

    .line 52
    .line 53
    if-eqz p0, :cond_f

    .line 54
    .line 55
    iget-boolean p3, p0, Loe0;->q:Z

    .line 56
    .line 57
    if-eqz p3, :cond_f

    .line 58
    .line 59
    iget-object p3, p0, Loe0;->d:Loe0;

    .line 60
    .line 61
    iget-boolean p3, p3, Loe0;->q:Z

    .line 62
    .line 63
    if-nez p3, :cond_3

    .line 64
    .line 65
    const-string p3, "visitAncestors called on an unattached node"

    .line 66
    .line 67
    invoke-static {p3}, Lw10;->b(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_3
    iget-object p3, p0, Loe0;->d:Loe0;

    .line 71
    .line 72
    iget-object p3, p3, Loe0;->h:Loe0;

    .line 73
    .line 74
    invoke-static {p0}, Lpf1;->Q(Lrm;)Lb60;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    :goto_1
    if-eqz v1, :cond_e

    .line 79
    .line 80
    iget-object v4, v1, Lb60;->I:Lmj0;

    .line 81
    .line 82
    iget-object v4, v4, Lmj0;->f:Loe0;

    .line 83
    .line 84
    iget v4, v4, Loe0;->g:I

    .line 85
    .line 86
    const/high16 v5, 0x40000

    .line 87
    .line 88
    and-int/2addr v4, v5

    .line 89
    if-eqz v4, :cond_c

    .line 90
    .line 91
    :goto_2
    if-eqz p3, :cond_c

    .line 92
    .line 93
    iget v4, p3, Loe0;->f:I

    .line 94
    .line 95
    and-int/2addr v4, v5

    .line 96
    if-eqz v4, :cond_b

    .line 97
    .line 98
    move-object v4, p3

    .line 99
    move-object v6, v2

    .line 100
    :goto_3
    if-eqz v4, :cond_b

    .line 101
    .line 102
    instance-of v7, v4, Lh91;

    .line 103
    .line 104
    if-eqz v7, :cond_4

    .line 105
    .line 106
    check-cast v4, Lh91;

    .line 107
    .line 108
    invoke-virtual {p0}, Lgj0;->k()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    invoke-interface {v4}, Lh91;->k()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    invoke-static {v7, v8}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-eqz v7, :cond_a

    .line 121
    .line 122
    const-class v7, Lgj0;

    .line 123
    .line 124
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    if-ne v7, v8, :cond_a

    .line 129
    .line 130
    move-object v2, v4

    .line 131
    goto :goto_6

    .line 132
    :cond_4
    iget v7, v4, Loe0;->f:I

    .line 133
    .line 134
    and-int/2addr v7, v5

    .line 135
    if-eqz v7, :cond_a

    .line 136
    .line 137
    instance-of v7, v4, Lsm;

    .line 138
    .line 139
    if-eqz v7, :cond_a

    .line 140
    .line 141
    move-object v7, v4

    .line 142
    check-cast v7, Lsm;

    .line 143
    .line 144
    iget-object v7, v7, Lsm;->s:Loe0;

    .line 145
    .line 146
    const/4 v8, 0x0

    .line 147
    :goto_4
    if-eqz v7, :cond_9

    .line 148
    .line 149
    iget v9, v7, Loe0;->f:I

    .line 150
    .line 151
    and-int/2addr v9, v5

    .line 152
    if-eqz v9, :cond_8

    .line 153
    .line 154
    add-int/lit8 v8, v8, 0x1

    .line 155
    .line 156
    if-ne v8, v3, :cond_5

    .line 157
    .line 158
    move-object v4, v7

    .line 159
    goto :goto_5

    .line 160
    :cond_5
    if-nez v6, :cond_6

    .line 161
    .line 162
    new-instance v6, Lsh0;

    .line 163
    .line 164
    const/16 v9, 0x10

    .line 165
    .line 166
    new-array v9, v9, [Loe0;

    .line 167
    .line 168
    invoke-direct {v6, v9}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    :cond_6
    if-eqz v4, :cond_7

    .line 172
    .line 173
    invoke-virtual {v6, v4}, Lsh0;->b(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    move-object v4, v2

    .line 177
    :cond_7
    invoke-virtual {v6, v7}, Lsh0;->b(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    :cond_8
    :goto_5
    iget-object v7, v7, Loe0;->i:Loe0;

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_9
    if-ne v8, v3, :cond_a

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_a
    invoke-static {v6}, Lpf1;->f(Lsh0;)Loe0;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    goto :goto_3

    .line 191
    :cond_b
    iget-object p3, p3, Loe0;->h:Loe0;

    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_c
    invoke-virtual {v1}, Lb60;->v()Lb60;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    if-eqz v1, :cond_d

    .line 199
    .line 200
    iget-object p3, v1, Lb60;->I:Lmj0;

    .line 201
    .line 202
    if-eqz p3, :cond_d

    .line 203
    .line 204
    iget-object p3, p3, Lmj0;->e:Ld61;

    .line 205
    .line 206
    goto/16 :goto_1

    .line 207
    .line 208
    :cond_d
    move-object p3, v2

    .line 209
    goto/16 :goto_1

    .line 210
    .line 211
    :cond_e
    :goto_6
    check-cast v2, Lgj0;

    .line 212
    .line 213
    :cond_f
    if-eqz v2, :cond_11

    .line 214
    .line 215
    iput v3, v0, Lcj0;->i:I

    .line 216
    .line 217
    invoke-virtual {v2, p1, p2, v0}, Lgj0;->O(JLik;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p3

    .line 221
    sget-object p0, Lzk;->d:Lzk;

    .line 222
    .line 223
    if-ne p3, p0, :cond_10

    .line 224
    .line 225
    return-object p0

    .line 226
    :cond_10
    :goto_7
    check-cast p3, Lrb1;

    .line 227
    .line 228
    iget-wide p0, p3, Lrb1;->a:J

    .line 229
    .line 230
    goto :goto_8

    .line 231
    :cond_11
    const-wide/16 p0, 0x0

    .line 232
    .line 233
    :goto_8
    new-instance p2, Lrb1;

    .line 234
    .line 235
    invoke-direct {p2, p0, p1}, Lrb1;-><init>(J)V

    .line 236
    .line 237
    .line 238
    return-object p2
.end method

.method public h(JLb8;Lb8;Lb8;)Lb8;
    .locals 14

    .line 1
    iget-object v0, p0, Ly2;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb8;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual/range {p3 .. p3}, Lb8;->c()Lb8;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Ly2;->e:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Ly2;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lb8;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const-string v2, "valueVector"

    .line 19
    .line 20
    if-eqz v0, :cond_4

    .line 21
    .line 22
    invoke-virtual {v0}, Lb8;->b()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v3, 0x0

    .line 27
    :goto_0
    iget-object v4, p0, Ly2;->e:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Lb8;

    .line 30
    .line 31
    if-ge v3, v0, :cond_2

    .line 32
    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    iget-object v5, p0, Ly2;->d:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, Lc8;

    .line 38
    .line 39
    invoke-interface {v5, v3}, Lc8;->get(I)Leu;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    move-object/from16 v5, p3

    .line 44
    .line 45
    invoke-virtual {v5, v3}, Lb8;->a(I)F

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    move-object/from16 v12, p4

    .line 50
    .line 51
    invoke-virtual {v12, v3}, Lb8;->a(I)F

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    move-object/from16 v13, p5

    .line 56
    .line 57
    invoke-virtual {v13, v3}, Lb8;->a(I)F

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    move-wide v7, p1

    .line 62
    invoke-interface/range {v6 .. v11}, Leu;->b(JFFF)F

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    invoke-virtual {v4, v6, v3}, Lb8;->e(FI)V

    .line 67
    .line 68
    .line 69
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    invoke-static {v2}, Lp30;->V(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v1

    .line 76
    :cond_2
    if-eqz v4, :cond_3

    .line 77
    .line 78
    return-object v4

    .line 79
    :cond_3
    invoke-static {v2}, Lp30;->V(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v1

    .line 83
    :cond_4
    invoke-static {v2}, Lp30;->V(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v1
.end method

.method public i(Lb8;Lb8;Lb8;)Lb8;
    .locals 9

    .line 1
    iget-object v0, p0, Ly2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb8;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p3}, Lb8;->c()Lb8;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Ly2;->g:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Ly2;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lb8;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const-string v2, "endVelocityVector"

    .line 19
    .line 20
    if-eqz v0, :cond_4

    .line 21
    .line 22
    invoke-virtual {v0}, Lb8;->b()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v3, 0x0

    .line 27
    :goto_0
    iget-object v4, p0, Ly2;->g:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Lb8;

    .line 30
    .line 31
    if-ge v3, v0, :cond_2

    .line 32
    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    iget-object v5, p0, Ly2;->d:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, Lc8;

    .line 38
    .line 39
    invoke-interface {v5, v3}, Lc8;->get(I)Leu;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {p1, v3}, Lb8;->a(I)F

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    invoke-virtual {p2, v3}, Lb8;->a(I)F

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    invoke-virtual {p3, v3}, Lb8;->a(I)F

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    invoke-interface {v5, v6, v7, v8}, Leu;->e(FFF)F

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    invoke-virtual {v4, v5, v3}, Lb8;->e(FI)V

    .line 60
    .line 61
    .line 62
    add-int/lit8 v3, v3, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    invoke-static {v2}, Lp30;->V(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v1

    .line 69
    :cond_2
    if-eqz v4, :cond_3

    .line 70
    .line 71
    return-object v4

    .line 72
    :cond_3
    invoke-static {v2}, Lp30;->V(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v1

    .line 76
    :cond_4
    invoke-static {v2}, Lp30;->V(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v1
.end method

.method public j(Lb8;Lb8;)Lb8;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ly2;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lb8;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual/range {p1 .. p1}, Lb8;->c()Lb8;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, v0, Ly2;->g:Ljava/lang/Object;

    .line 14
    .line 15
    :cond_0
    iget-object v1, v0, Ly2;->g:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lb8;

    .line 18
    .line 19
    const-string v3, "targetVector"

    .line 20
    .line 21
    if-eqz v1, :cond_4

    .line 22
    .line 23
    invoke-virtual {v1}, Lb8;->b()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v4, 0x0

    .line 28
    :goto_0
    iget-object v5, v0, Ly2;->g:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v5, Lb8;

    .line 31
    .line 32
    if-ge v4, v1, :cond_2

    .line 33
    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    iget-object v6, v0, Ly2;->d:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v6, Lx1;

    .line 39
    .line 40
    move-object/from16 v7, p1

    .line 41
    .line 42
    invoke-virtual {v7, v4}, Lb8;->a(I)F

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    move-object/from16 v9, p2

    .line 47
    .line 48
    invoke-virtual {v9, v4}, Lb8;->a(I)F

    .line 49
    .line 50
    .line 51
    move-result v10

    .line 52
    iget-object v6, v6, Lx1;->e:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v6, Lau;

    .line 55
    .line 56
    invoke-virtual {v6, v10}, Lau;->b(F)D

    .line 57
    .line 58
    .line 59
    move-result-wide v11

    .line 60
    sget v13, Lbu;->a:F

    .line 61
    .line 62
    float-to-double v13, v13

    .line 63
    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    .line 64
    .line 65
    sub-double v15, v13, v15

    .line 66
    .line 67
    const/16 v17, 0x0

    .line 68
    .line 69
    iget v2, v6, Lau;->a:F

    .line 70
    .line 71
    iget v6, v6, Lau;->b:F

    .line 72
    .line 73
    mul-float/2addr v2, v6

    .line 74
    move v6, v1

    .line 75
    float-to-double v0, v2

    .line 76
    div-double/2addr v13, v15

    .line 77
    mul-double/2addr v13, v11

    .line 78
    invoke-static {v13, v14}, Ljava/lang/Math;->exp(D)D

    .line 79
    .line 80
    .line 81
    move-result-wide v11

    .line 82
    mul-double/2addr v11, v0

    .line 83
    double-to-float v0, v11

    .line 84
    invoke-static {v10}, Ljava/lang/Math;->signum(F)F

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    mul-float/2addr v1, v0

    .line 89
    add-float/2addr v1, v8

    .line 90
    invoke-virtual {v5, v1, v4}, Lb8;->e(FI)V

    .line 91
    .line 92
    .line 93
    add-int/lit8 v4, v4, 0x1

    .line 94
    .line 95
    move-object/from16 v0, p0

    .line 96
    .line 97
    move v1, v6

    .line 98
    goto :goto_0

    .line 99
    :cond_1
    const/16 v17, 0x0

    .line 100
    .line 101
    invoke-static {v3}, Lp30;->V(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw v17

    .line 105
    :cond_2
    const/16 v17, 0x0

    .line 106
    .line 107
    if-eqz v5, :cond_3

    .line 108
    .line 109
    return-object v5

    .line 110
    :cond_3
    invoke-static {v3}, Lp30;->V(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw v17

    .line 114
    :cond_4
    const/16 v17, 0x0

    .line 115
    .line 116
    invoke-static {v3}, Lp30;->V(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw v17
.end method

.method public k(JLb8;Lb8;)Lb8;
    .locals 14

    .line 1
    iget-object v0, p0, Ly2;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb8;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual/range {p3 .. p3}, Lb8;->c()Lb8;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Ly2;->f:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Ly2;->f:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lb8;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const-string v2, "velocityVector"

    .line 19
    .line 20
    if-eqz v0, :cond_5

    .line 21
    .line 22
    invoke-virtual {v0}, Lb8;->b()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v3, 0x0

    .line 27
    :goto_0
    iget-object v4, p0, Ly2;->f:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Lb8;

    .line 30
    .line 31
    if-ge v3, v0, :cond_3

    .line 32
    .line 33
    if-eqz v4, :cond_2

    .line 34
    .line 35
    iget-object v5, p0, Ly2;->d:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, Lx1;

    .line 38
    .line 39
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-object/from16 v6, p4

    .line 43
    .line 44
    invoke-virtual {v6, v3}, Lb8;->a(I)F

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    const-wide/32 v8, 0xf4240

    .line 49
    .line 50
    .line 51
    div-long v8, p1, v8

    .line 52
    .line 53
    iget-object v5, v5, Lx1;->e:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v5, Lau;

    .line 56
    .line 57
    invoke-virtual {v5, v7}, Lau;->a(F)Lzt;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    iget-wide v10, v5, Lzt;->c:J

    .line 62
    .line 63
    const-wide/16 v12, 0x0

    .line 64
    .line 65
    cmp-long v7, v10, v12

    .line 66
    .line 67
    if-lez v7, :cond_1

    .line 68
    .line 69
    long-to-float v7, v8

    .line 70
    long-to-float v8, v10

    .line 71
    div-float/2addr v7, v8

    .line 72
    goto :goto_1

    .line 73
    :cond_1
    const/high16 v7, 0x3f800000    # 1.0f

    .line 74
    .line 75
    :goto_1
    invoke-static {v7}, Lo5;->a(F)Ln5;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    iget v7, v7, Ln5;->b:F

    .line 80
    .line 81
    iget v8, v5, Lzt;->a:F

    .line 82
    .line 83
    invoke-static {v8}, Ljava/lang/Math;->signum(F)F

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    mul-float/2addr v8, v7

    .line 88
    iget v5, v5, Lzt;->b:F

    .line 89
    .line 90
    mul-float/2addr v8, v5

    .line 91
    long-to-float v5, v10

    .line 92
    div-float/2addr v8, v5

    .line 93
    const/high16 v5, 0x447a0000    # 1000.0f

    .line 94
    .line 95
    mul-float/2addr v8, v5

    .line 96
    invoke-virtual {v4, v8, v3}, Lb8;->e(FI)V

    .line 97
    .line 98
    .line 99
    add-int/lit8 v3, v3, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    invoke-static {v2}, Lp30;->V(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw v1

    .line 106
    :cond_3
    if-eqz v4, :cond_4

    .line 107
    .line 108
    return-object v4

    .line 109
    :cond_4
    invoke-static {v2}, Lp30;->V(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v1

    .line 113
    :cond_5
    invoke-static {v2}, Lp30;->V(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v1
.end method

.method public l(Lje;Ljava/lang/String;)Lqc1;
    .locals 4

    .line 1
    iget-object v0, p0, Ly2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljo0;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Ly2;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lvc1;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v1, v1, Lvc1;->a:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-virtual {v1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lqc1;

    .line 20
    .line 21
    iget-object v2, p1, Lje;->d:Ljava/lang/Class;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    sget-object v3, Lje;->e:Ljava/util/Map;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Ljava/lang/Integer;

    .line 36
    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-static {v2, v1}, Ls91;->C(ILjava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_1

    .line 53
    .line 54
    invoke-static {v2}, Lau0;->a(Ljava/lang/Class;)Lje;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {v2}, Lkl;->n(Lje;)Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    :cond_1
    invoke-virtual {v2, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    :goto_0
    if-eqz v2, :cond_3

    .line 67
    .line 68
    iget-object p0, p0, Ly2;->e:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p0, Ltc1;

    .line 71
    .line 72
    instance-of p1, p0, Lox0;

    .line 73
    .line 74
    if-eqz p1, :cond_2

    .line 75
    .line 76
    check-cast p0, Lox0;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, Lox0;->d:Ls90;

    .line 82
    .line 83
    if-eqz p1, :cond_2

    .line 84
    .line 85
    iget-object p0, p0, Lox0;->e:Lkx0;

    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-static {v1, p0, p1}, Lg60;->f(Lqc1;Lkx0;Ls90;)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :catchall_0
    move-exception p0

    .line 95
    goto :goto_5

    .line 96
    :cond_2
    :goto_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_3
    new-instance v1, Lrg0;

    .line 101
    .line 102
    iget-object v2, p0, Ly2;->f:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v2, Lel;

    .line 105
    .line 106
    invoke-direct {v1, v2}, Lrg0;-><init>(Lel;)V

    .line 107
    .line 108
    .line 109
    sget-object v2, Lo30;->P:Ljo0;

    .line 110
    .line 111
    iget-object v3, v1, Lel;->a:Ljava/util/LinkedHashMap;

    .line 112
    .line 113
    invoke-interface {v3, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    iget-object v2, p0, Ly2;->e:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v2, Ltc1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    .line 120
    :try_start_1
    invoke-interface {v2, p1, v1}, Ltc1;->c(Lje;Lrg0;)Lqc1;

    .line 121
    .line 122
    .line 123
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/AbstractMethodError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 124
    :goto_2
    move-object v1, p1

    .line 125
    goto :goto_3

    .line 126
    :catch_0
    :try_start_2
    iget-object v3, p1, Lje;->d:Ljava/lang/Class;

    .line 127
    .line 128
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-interface {v2, v3, v1}, Ltc1;->b(Ljava/lang/Class;Lrg0;)Lqc1;

    .line 132
    .line 133
    .line 134
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/AbstractMethodError; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 135
    goto :goto_2

    .line 136
    :catch_1
    :try_start_3
    iget-object p1, p1, Lje;->d:Ljava/lang/Class;

    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-interface {v2, p1}, Ltc1;->a(Ljava/lang/Class;)Lqc1;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    goto :goto_2

    .line 146
    :goto_3
    iget-object p0, p0, Ly2;->d:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast p0, Lvc1;

    .line 149
    .line 150
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    iget-object p0, p0, Lvc1;->a:Ljava/util/LinkedHashMap;

    .line 157
    .line 158
    invoke-interface {p0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    check-cast p0, Lqc1;

    .line 163
    .line 164
    if-eqz p0, :cond_4

    .line 165
    .line 166
    invoke-virtual {p0}, Lqc1;->a()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 167
    .line 168
    .line 169
    :cond_4
    :goto_4
    monitor-exit v0

    .line 170
    return-object v1

    .line 171
    :goto_5
    monitor-exit v0

    .line 172
    throw p0
.end method
