.class public abstract Lrj0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Lch0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ljk0;->a:Lch0;

    .line 2
    .line 3
    new-instance v0, Lch0;

    .line 4
    .line 5
    invoke-direct {v0}, Lch0;-><init>()V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lrj0;->a:Lch0;

    .line 9
    .line 10
    return-void
.end method

.method public static final a(Loe0;II)V
    .locals 3

    .line 1
    instance-of v0, p0, Lsm;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Lsm;

    .line 7
    .line 8
    iget v1, v0, Lsm;->r:I

    .line 9
    .line 10
    and-int v2, v1, p1

    .line 11
    .line 12
    invoke-static {p0, v2, p2}, Lrj0;->b(Loe0;II)V

    .line 13
    .line 14
    .line 15
    not-int p0, v1

    .line 16
    and-int/2addr p0, p1

    .line 17
    iget-object p1, v0, Lsm;->s:Loe0;

    .line 18
    .line 19
    :goto_0
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-static {p1, p0, p2}, Lrj0;->a(Loe0;II)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p1, Loe0;->i:Loe0;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void

    .line 28
    :cond_1
    iget v0, p0, Loe0;->f:I

    .line 29
    .line 30
    and-int/2addr p1, v0

    .line 31
    invoke-static {p0, p1, p2}, Lrj0;->b(Loe0;II)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static final b(Loe0;II)V
    .locals 4

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Loe0;->l0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :cond_0
    and-int/lit8 v0, p1, 0x2

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    instance-of v0, p0, Lr50;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    move-object v0, p0

    .line 21
    check-cast v0, Lr50;

    .line 22
    .line 23
    invoke-static {v0}, Lv50;->m(Lr50;)V

    .line 24
    .line 25
    .line 26
    if-ne p2, v1, :cond_1

    .line 27
    .line 28
    invoke-static {p0, v1}, Lpf1;->O(Lrm;I)Lqj0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lqj0;->T0()V

    .line 33
    .line 34
    .line 35
    :cond_1
    and-int/lit16 v0, p1, 0x80

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    if-eq p2, v1, :cond_2

    .line 40
    .line 41
    invoke-static {p0}, Lpf1;->Q(Lrm;)Lb60;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Lb60;->E()V

    .line 46
    .line 47
    .line 48
    :cond_2
    const/high16 v0, 0x400000

    .line 49
    .line 50
    and-int/2addr v0, p1

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    if-eq p2, v1, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, Lpf1;->Q(Lrm;)Lb60;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const/4 v2, 0x0

    .line 60
    invoke-virtual {v0, v2}, Lb60;->W(Z)V

    .line 61
    .line 62
    .line 63
    :cond_3
    and-int/lit16 v0, p1, 0x100

    .line 64
    .line 65
    const/4 v2, 0x1

    .line 66
    if-eqz v0, :cond_8

    .line 67
    .line 68
    instance-of v0, p0, Lnx;

    .line 69
    .line 70
    if-eqz v0, :cond_8

    .line 71
    .line 72
    if-eq p2, v2, :cond_5

    .line 73
    .line 74
    if-eq p2, v1, :cond_4

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_4
    invoke-static {p0}, Lpf1;->Q(Lrm;)Lb60;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iget v3, v0, Lb60;->Q:I

    .line 82
    .line 83
    add-int/lit8 v3, v3, -0x1

    .line 84
    .line 85
    invoke-virtual {v0, v3}, Lb60;->c0(I)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_5
    invoke-static {p0}, Lpf1;->Q(Lrm;)Lb60;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget v3, v0, Lb60;->Q:I

    .line 94
    .line 95
    add-int/2addr v3, v2

    .line 96
    invoke-virtual {v0, v3}, Lb60;->c0(I)V

    .line 97
    .line 98
    .line 99
    :goto_0
    if-eq p2, v1, :cond_8

    .line 100
    .line 101
    invoke-static {p0}, Lpf1;->Q(Lrm;)Lb60;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    iget v0, p2, Lb60;->Q:I

    .line 106
    .line 107
    if-eqz v0, :cond_8

    .line 108
    .line 109
    invoke-virtual {p2}, Lb60;->p()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-nez v0, :cond_8

    .line 114
    .line 115
    invoke-virtual {p2}, Lb60;->r()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-nez v0, :cond_8

    .line 120
    .line 121
    iget-boolean v0, p2, Lb60;->P:Z

    .line 122
    .line 123
    if-eqz v0, :cond_6

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_6
    invoke-static {p2}, Le60;->a(Lb60;)Ldn0;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    check-cast v0, Lw3;

    .line 131
    .line 132
    iget-object v1, v0, Lw3;->V:Lud0;

    .line 133
    .line 134
    iget-object v1, v1, Lud0;->e:Ld;

    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    iget v3, p2, Lb60;->Q:I

    .line 140
    .line 141
    if-lez v3, :cond_7

    .line 142
    .line 143
    iget-object v1, v1, Ld;->e:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v1, Lsh0;

    .line 146
    .line 147
    invoke-virtual {v1, p2}, Lsh0;->b(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    iput-boolean v2, p2, Lb60;->P:Z

    .line 151
    .line 152
    :cond_7
    const/4 p2, 0x0

    .line 153
    invoke-virtual {v0, p2}, Lw3;->C(Lb60;)V

    .line 154
    .line 155
    .line 156
    :cond_8
    :goto_1
    and-int/lit8 p2, p1, 0x4

    .line 157
    .line 158
    if-eqz p2, :cond_9

    .line 159
    .line 160
    instance-of p2, p0, Ltq;

    .line 161
    .line 162
    if-eqz p2, :cond_9

    .line 163
    .line 164
    move-object p2, p0

    .line 165
    check-cast p2, Ltq;

    .line 166
    .line 167
    invoke-static {p2}, Lkl;->r(Ltq;)V

    .line 168
    .line 169
    .line 170
    :cond_9
    and-int/lit8 p2, p1, 0x8

    .line 171
    .line 172
    if-eqz p2, :cond_a

    .line 173
    .line 174
    instance-of p2, p0, Lvz0;

    .line 175
    .line 176
    if-eqz p2, :cond_a

    .line 177
    .line 178
    invoke-static {p0}, Lpf1;->Q(Lrm;)Lb60;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    iput-boolean v2, p2, Lb60;->u:Z

    .line 183
    .line 184
    :cond_a
    and-int/lit8 p2, p1, 0x40

    .line 185
    .line 186
    if-eqz p2, :cond_b

    .line 187
    .line 188
    instance-of p2, p0, Lhp0;

    .line 189
    .line 190
    if-eqz p2, :cond_b

    .line 191
    .line 192
    move-object p2, p0

    .line 193
    check-cast p2, Lhp0;

    .line 194
    .line 195
    invoke-static {p2}, Lpf1;->Q(Lrm;)Lb60;

    .line 196
    .line 197
    .line 198
    move-result-object p2

    .line 199
    iget-object p2, p2, Lb60;->J:Lf60;

    .line 200
    .line 201
    iget-object v0, p2, Lf60;->p:Lwd0;

    .line 202
    .line 203
    iput-boolean v2, v0, Lwd0;->s:Z

    .line 204
    .line 205
    iget-object p2, p2, Lf60;->q:Lec0;

    .line 206
    .line 207
    if-eqz p2, :cond_b

    .line 208
    .line 209
    iput-boolean v2, p2, Lec0;->y:Z

    .line 210
    .line 211
    :cond_b
    and-int/lit16 p2, p1, 0x800

    .line 212
    .line 213
    if-eqz p2, :cond_d

    .line 214
    .line 215
    instance-of p2, p0, Lu9;

    .line 216
    .line 217
    if-nez p2, :cond_c

    .line 218
    .line 219
    goto :goto_2

    .line 220
    :cond_c
    check-cast p0, Lu9;

    .line 221
    .line 222
    iget-object p0, p0, Lu9;->r:Lne0;

    .line 223
    .line 224
    const-string p1, "applyFocusProperties called on wrong node"

    .line 225
    .line 226
    invoke-static {p1}, Lw10;->b(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-static {}, Lxc;->d()V

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    :cond_d
    :goto_2
    and-int/lit16 p1, p1, 0x1000

    .line 237
    .line 238
    if-eqz p1, :cond_e

    .line 239
    .line 240
    instance-of p1, p0, Lu9;

    .line 241
    .line 242
    if-eqz p1, :cond_e

    .line 243
    .line 244
    check-cast p0, Lu9;

    .line 245
    .line 246
    invoke-static {p0}, Lpf1;->R(Lrm;)Ldn0;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    check-cast p1, Lw3;

    .line 251
    .line 252
    invoke-virtual {p1}, Lw3;->getFocusOwner()Lwu;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    check-cast p1, Lzu;

    .line 257
    .line 258
    iget-object p1, p1, Lzu;->d:Luu;

    .line 259
    .line 260
    iget-object p2, p1, Luu;->d:Lkh0;

    .line 261
    .line 262
    invoke-virtual {p2, p0}, Lkh0;->a(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result p0

    .line 266
    if-eqz p0, :cond_e

    .line 267
    .line 268
    invoke-virtual {p1}, Luu;->a()V

    .line 269
    .line 270
    .line 271
    :cond_e
    :goto_3
    return-void
.end method

.method public static final c(Loe0;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Loe0;->q:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "autoInvalidateUpdatedNode called on unattached node"

    .line 6
    .line 7
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, -0x1

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {p0, v0, v1}, Lrj0;->a(Loe0;II)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static final d(Loe0;)I
    .locals 4

    .line 1
    iget v0, p0, Loe0;->f:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lrj0;->a:Lch0;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lch0;->d(Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-ltz v2, :cond_1

    .line 17
    .line 18
    iget-object p0, v1, Lch0;->c:[I

    .line 19
    .line 20
    aget p0, p0, v2

    .line 21
    .line 22
    return p0

    .line 23
    :cond_1
    instance-of v2, p0, Lr50;

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    const/4 v2, 0x3

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    const/4 v2, 0x1

    .line 30
    :goto_0
    instance-of v3, p0, Ltq;

    .line 31
    .line 32
    if-eqz v3, :cond_3

    .line 33
    .line 34
    or-int/lit8 v2, v2, 0x4

    .line 35
    .line 36
    :cond_3
    instance-of v3, p0, Lvz0;

    .line 37
    .line 38
    if-eqz v3, :cond_4

    .line 39
    .line 40
    or-int/lit8 v2, v2, 0x8

    .line 41
    .line 42
    :cond_4
    instance-of v3, p0, Lqr0;

    .line 43
    .line 44
    if-eqz v3, :cond_5

    .line 45
    .line 46
    or-int/lit8 v2, v2, 0x10

    .line 47
    .line 48
    :cond_5
    instance-of v3, p0, Lre0;

    .line 49
    .line 50
    if-eqz v3, :cond_6

    .line 51
    .line 52
    or-int/lit8 v2, v2, 0x20

    .line 53
    .line 54
    :cond_6
    instance-of v3, p0, Lhp0;

    .line 55
    .line 56
    if-eqz v3, :cond_7

    .line 57
    .line 58
    or-int/lit8 v2, v2, 0x40

    .line 59
    .line 60
    :cond_7
    instance-of v3, p0, Lgl0;

    .line 61
    .line 62
    if-eqz v3, :cond_8

    .line 63
    .line 64
    or-int/lit16 v2, v2, 0x80

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_8
    instance-of v3, p0, Lg50;

    .line 68
    .line 69
    if-eqz v3, :cond_9

    .line 70
    .line 71
    const v3, 0x400080

    .line 72
    .line 73
    .line 74
    or-int/2addr v2, v3

    .line 75
    :cond_9
    :goto_1
    instance-of v3, p0, Lnx;

    .line 76
    .line 77
    if-eqz v3, :cond_a

    .line 78
    .line 79
    or-int/lit16 v2, v2, 0x100

    .line 80
    .line 81
    :cond_a
    instance-of v3, p0, Ldv;

    .line 82
    .line 83
    if-eqz v3, :cond_b

    .line 84
    .line 85
    or-int/lit16 v2, v2, 0x400

    .line 86
    .line 87
    :cond_b
    instance-of v3, p0, Lu9;

    .line 88
    .line 89
    if-eqz v3, :cond_c

    .line 90
    .line 91
    or-int/lit16 v2, v2, 0x800

    .line 92
    .line 93
    :cond_c
    if-eqz v3, :cond_d

    .line 94
    .line 95
    or-int/lit16 v2, v2, 0x1000

    .line 96
    .line 97
    :cond_d
    instance-of v3, p0, La50;

    .line 98
    .line 99
    if-eqz v3, :cond_e

    .line 100
    .line 101
    or-int/lit16 v2, v2, 0x2000

    .line 102
    .line 103
    :cond_e
    instance-of v3, p0, Lj3;

    .line 104
    .line 105
    if-eqz v3, :cond_f

    .line 106
    .line 107
    or-int/lit16 v2, v2, 0x4000

    .line 108
    .line 109
    :cond_f
    instance-of v3, p0, Lzi;

    .line 110
    .line 111
    if-eqz v3, :cond_10

    .line 112
    .line 113
    const v3, 0x8000

    .line 114
    .line 115
    .line 116
    or-int/2addr v2, v3

    .line 117
    :cond_10
    instance-of v3, p0, Lh91;

    .line 118
    .line 119
    if-eqz v3, :cond_11

    .line 120
    .line 121
    const/high16 v3, 0x40000

    .line 122
    .line 123
    or-int/2addr v2, v3

    .line 124
    :cond_11
    instance-of v3, p0, Ldb;

    .line 125
    .line 126
    if-eqz v3, :cond_12

    .line 127
    .line 128
    const/high16 v3, 0x80000

    .line 129
    .line 130
    or-int/2addr v2, v3

    .line 131
    :cond_12
    instance-of v3, p0, Lq10;

    .line 132
    .line 133
    if-eqz v3, :cond_13

    .line 134
    .line 135
    const/high16 v3, 0x200000

    .line 136
    .line 137
    or-int/2addr v2, v3

    .line 138
    :cond_13
    instance-of p0, p0, Le70;

    .line 139
    .line 140
    if-eqz p0, :cond_14

    .line 141
    .line 142
    const/high16 p0, 0x800000

    .line 143
    .line 144
    or-int/2addr v2, p0

    .line 145
    :cond_14
    invoke-virtual {v1, v2, v0}, Lch0;->g(ILjava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    return v2
.end method

.method public static final e(Loe0;)I
    .locals 2

    .line 1
    instance-of v0, p0, Lsm;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p0, Lsm;

    .line 6
    .line 7
    iget v0, p0, Lsm;->r:I

    .line 8
    .line 9
    iget-object p0, p0, Lsm;->s:Loe0;

    .line 10
    .line 11
    :goto_0
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-static {p0}, Lrj0;->e(Loe0;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    or-int/2addr v0, v1

    .line 18
    iget-object p0, p0, Loe0;->i:Loe0;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return v0

    .line 22
    :cond_1
    invoke-static {p0}, Lrj0;->d(Loe0;)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0
.end method

.method public static final f(I)Z
    .locals 4

    .line 1
    and-int/lit16 v0, p0, 0x80

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    const/high16 v3, 0x400000

    .line 11
    .line 12
    and-int/2addr p0, v3

    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    move v1, v2

    .line 16
    :cond_1
    or-int p0, v0, v1

    .line 17
    .line 18
    return p0
.end method
