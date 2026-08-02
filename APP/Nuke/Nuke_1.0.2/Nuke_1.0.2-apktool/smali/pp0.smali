.class public abstract Lpp0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lkw;

.field public static final b:Lkw;

.field public static final c:Lh70;

.field public static final d:Lqd3;

.field public static final e:Lqd3;

.field public static final f:Lqd3;

.field public static final g:Lqd3;

.field public static final h:[F

.field public static final i:Lhh1;

.field public static final j:Lhh1;

.field public static k:Lsx0; = null

.field public static l:Z = false

.field public static m:Ljava/lang/reflect/Method;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Low;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, Low;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lkw;

    .line 9
    .line 10
    const v2, -0xd98d67b

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v1, v2, v3, v0}, Lkw;-><init>(IZLun0;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lpp0;->a:Lkw;

    .line 18
    .line 19
    new-instance v0, Low;

    .line 20
    .line 21
    const/16 v1, 0x9

    .line 22
    .line 23
    invoke-direct {v0, v1}, Low;-><init>(I)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Lkw;

    .line 27
    .line 28
    const v2, 0x750a52c2

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, v2, v3, v0}, Lkw;-><init>(IZLun0;)V

    .line 32
    .line 33
    .line 34
    sput-object v1, Lpp0;->b:Lkw;

    .line 35
    .line 36
    new-instance v0, Lh70;

    .line 37
    .line 38
    const/high16 v1, 0x3f800000    # 1.0f

    .line 39
    .line 40
    invoke-direct {v0, v1, v1}, Lh70;-><init>(FF)V

    .line 41
    .line 42
    .line 43
    sput-object v0, Lpp0;->c:Lh70;

    .line 44
    .line 45
    new-instance v0, Lqd3;

    .line 46
    .line 47
    const v1, 0x3e9ec02f    # 0.31006f

    .line 48
    .line 49
    .line 50
    const v2, 0x3ea1dfb9    # 0.31616f

    .line 51
    .line 52
    .line 53
    invoke-direct {v0, v1, v2}, Lqd3;-><init>(FF)V

    .line 54
    .line 55
    .line 56
    sput-object v0, Lpp0;->d:Lqd3;

    .line 57
    .line 58
    new-instance v0, Lqd3;

    .line 59
    .line 60
    const v1, 0x3eb0fba9

    .line 61
    .line 62
    .line 63
    const v2, 0x3eb78d50    # 0.3585f

    .line 64
    .line 65
    .line 66
    invoke-direct {v0, v1, v2}, Lqd3;-><init>(FF)V

    .line 67
    .line 68
    .line 69
    sput-object v0, Lpp0;->e:Lqd3;

    .line 70
    .line 71
    new-instance v0, Lqd3;

    .line 72
    .line 73
    const v1, 0x3ea4b33e    # 0.32168f

    .line 74
    .line 75
    .line 76
    const v2, 0x3eace315    # 0.33767f

    .line 77
    .line 78
    .line 79
    invoke-direct {v0, v1, v2}, Lqd3;-><init>(FF)V

    .line 80
    .line 81
    .line 82
    sput-object v0, Lpp0;->f:Lqd3;

    .line 83
    .line 84
    new-instance v0, Lqd3;

    .line 85
    .line 86
    const v1, 0x3ea01b86

    .line 87
    .line 88
    .line 89
    const v2, 0x3ea8754f    # 0.32902f

    .line 90
    .line 91
    .line 92
    invoke-direct {v0, v1, v2}, Lqd3;-><init>(FF)V

    .line 93
    .line 94
    .line 95
    sput-object v0, Lpp0;->g:Lqd3;

    .line 96
    .line 97
    const/4 v0, 0x3

    .line 98
    new-array v0, v0, [F

    .line 99
    .line 100
    fill-array-data v0, :array_0

    .line 101
    .line 102
    .line 103
    sput-object v0, Lpp0;->h:[F

    .line 104
    .line 105
    new-instance v0, Lhh1;

    .line 106
    .line 107
    const/16 v1, 0x13

    .line 108
    .line 109
    const-string v2, "NONE"

    .line 110
    .line 111
    invoke-direct {v0, v1, v2}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    sput-object v0, Lpp0;->i:Lhh1;

    .line 115
    .line 116
    new-instance v0, Lhh1;

    .line 117
    .line 118
    const-string v2, "PENDING"

    .line 119
    .line 120
    invoke-direct {v0, v1, v2}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    sput-object v0, Lpp0;->j:Lhh1;

    .line 124
    .line 125
    return-void

    .line 126
    nop

    .line 127
    :array_0
    .array-data 4
        0x3f76d699    # 0.964212f
        0x3f800000    # 1.0f
        0x3f533f85
    .end array-data
.end method

.method public static A(Lbi0;Le9;BLjava/lang/String;I)V
    .locals 4

    .line 1
    iget-object p0, p0, Lbi0;->f:Ljava/util/HashMap;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p2, v0, :cond_3

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p2, v0, :cond_2

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-eq p2, v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x4

    .line 13
    if-eq p2, v0, :cond_0

    .line 14
    .line 15
    new-instance p2, Lsz;

    .line 16
    .line 17
    iget v0, p1, Le9;->i:I

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Le9;->i(I)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    iget v2, p1, Le9;->i:I

    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x8

    .line 26
    .line 27
    iput v2, p1, Le9;->i:I

    .line 28
    .line 29
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    iput p4, p2, Lqz;->a:I

    .line 37
    .line 38
    iput-wide v0, p2, Lsz;->b:D

    .line 39
    .line 40
    invoke-virtual {p0, p3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    new-instance p2, Lvz;

    .line 45
    .line 46
    iget v0, p1, Le9;->i:I

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Le9;->i(I)J

    .line 49
    .line 50
    .line 51
    move-result-wide v0

    .line 52
    iget v2, p1, Le9;->i:I

    .line 53
    .line 54
    add-int/lit8 v2, v2, 0x8

    .line 55
    .line 56
    iput v2, p1, Le9;->i:I

    .line 57
    .line 58
    invoke-direct {p2, v0, v1, p4}, Lvz;-><init>(JI)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, p3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_1
    new-instance p2, Ltz;

    .line 66
    .line 67
    invoke-virtual {p1}, Le9;->h()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    invoke-direct {p2, p1, p4}, Ltz;-><init>(FI)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, p3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_2
    new-instance p2, Luz;

    .line 83
    .line 84
    invoke-virtual {p1}, Le9;->h()I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    invoke-direct {p2, p4, p1}, Luz;-><init>(II)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, p3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_3
    new-instance p2, Lrz;

    .line 96
    .line 97
    iget-object v1, p1, Le9;->k:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v1, [B

    .line 100
    .line 101
    iget v2, p1, Le9;->i:I

    .line 102
    .line 103
    add-int/lit8 v3, v2, 0x1

    .line 104
    .line 105
    iput v3, p1, Le9;->i:I

    .line 106
    .line 107
    aget-byte p1, v1, v2

    .line 108
    .line 109
    if-ne p1, v0, :cond_4

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_4
    const/4 v0, 0x0

    .line 113
    :goto_0
    invoke-direct {p2, p4, v0}, Lrz;-><init>(IZ)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, p3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public static B(Lbi0;Le9;BLjava/lang/String;IIB)V
    .locals 13

    .line 1
    move v0, p2

    .line 2
    move-object/from16 v1, p3

    .line 3
    .line 4
    iget-object v2, p0, Lbi0;->f:Ljava/util/HashMap;

    .line 5
    .line 6
    const/16 v3, 0x9

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    if-eq v0, v3, :cond_1

    .line 11
    .line 12
    const/16 v3, 0xa

    .line 13
    .line 14
    if-eq v0, v3, :cond_1

    .line 15
    .line 16
    const/16 v3, 0xb

    .line 17
    .line 18
    if-ne v0, v3, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v3, v5

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    move v3, v4

    .line 24
    :goto_1
    if-eqz v3, :cond_2

    .line 25
    .line 26
    invoke-virtual {p1}, Le9;->h()I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    :goto_2
    move v11, v6

    .line 31
    goto :goto_3

    .line 32
    :cond_2
    invoke-virtual {p1}, Le9;->j()S

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    const v7, 0xffff

    .line 37
    .line 38
    .line 39
    and-int/2addr v6, v7

    .line 40
    goto :goto_2

    .line 41
    :goto_3
    if-eqz v3, :cond_3

    .line 42
    .line 43
    const/4 v3, 0x4

    .line 44
    goto :goto_4

    .line 45
    :cond_3
    const/4 v3, 0x2

    .line 46
    :goto_4
    and-int/lit8 v6, p6, 0x40

    .line 47
    .line 48
    if-eqz v6, :cond_4

    .line 49
    .line 50
    move v12, v4

    .line 51
    goto :goto_5

    .line 52
    :cond_4
    move v12, v5

    .line 53
    :goto_5
    if-eqz v12, :cond_6

    .line 54
    .line 55
    const/16 v6, 0x20

    .line 56
    .line 57
    if-ne v11, v6, :cond_5

    .line 58
    .line 59
    goto :goto_6

    .line 60
    :cond_5
    const-string p0, "name size not match"

    .line 61
    .line 62
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_6
    :goto_6
    const/4 v6, 0x6

    .line 67
    const/4 v7, 0x7

    .line 68
    packed-switch v0, :pswitch_data_0

    .line 69
    .line 70
    .line 71
    goto :goto_7

    .line 72
    :pswitch_0
    const/16 v0, 0x8

    .line 73
    .line 74
    goto :goto_7

    .line 75
    :pswitch_1
    move v0, v7

    .line 76
    goto :goto_7

    .line 77
    :pswitch_2
    move v0, v6

    .line 78
    :goto_7
    if-eq v0, v6, :cond_c

    .line 79
    .line 80
    if-eq v0, v7, :cond_a

    .line 81
    .line 82
    if-eqz v12, :cond_7

    .line 83
    .line 84
    invoke-virtual {p1, v11}, Le9;->k(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    new-instance v7, Lwz;

    .line 89
    .line 90
    add-int v9, p4, v3

    .line 91
    .line 92
    const/4 v12, 0x1

    .line 93
    move/from16 v8, p5

    .line 94
    .line 95
    invoke-direct/range {v7 .. v12}, Lyz;-><init>(IILjava/lang/Object;IZ)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2, v1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_7
    iget-object v0, p0, Lbi0;->h:Le9;

    .line 103
    .line 104
    iget-object v5, v0, Le9;->k:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v5, [B

    .line 107
    .line 108
    iget v6, v0, Le9;->i:I

    .line 109
    .line 110
    add-int/lit8 v7, v6, 0x1

    .line 111
    .line 112
    iput v7, v0, Le9;->i:I

    .line 113
    .line 114
    aget-byte v5, v5, v6

    .line 115
    .line 116
    and-int/lit16 v5, v5, 0xff

    .line 117
    .line 118
    invoke-virtual {v0, v5}, Le9;->k(I)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    iget-object v7, p0, Lbi0;->c:Ljava/util/HashMap;

    .line 123
    .line 124
    invoke-virtual {v7, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    check-cast v7, Lov2;

    .line 129
    .line 130
    add-int/2addr v5, v4

    .line 131
    sub-int v4, v11, v5

    .line 132
    .line 133
    if-ltz v4, :cond_9

    .line 134
    .line 135
    if-eqz v7, :cond_8

    .line 136
    .line 137
    :try_start_0
    iget-object v5, v0, Le9;->k:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v5, [B

    .line 140
    .line 141
    iget v0, v0, Le9;->i:I

    .line 142
    .line 143
    invoke-static {v5, v0, v4}, Lov2;->a([BII)Ljava/util/LinkedHashSet;

    .line 144
    .line 145
    .line 146
    move-result-object v10

    .line 147
    new-instance v7, Lwz;

    .line 148
    .line 149
    add-int/lit8 v9, p4, 0x2

    .line 150
    .line 151
    const/4 v12, 0x0

    .line 152
    move/from16 v8, p5

    .line 153
    .line 154
    invoke-direct/range {v7 .. v12}, Lyz;-><init>(IILjava/lang/Object;IZ)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 158
    .line 159
    .line 160
    goto :goto_8

    .line 161
    :catch_0
    move-exception v0

    .line 162
    const-string v1, "FastKV"

    .line 163
    .line 164
    iget-object p0, p0, Lbi0;->b:Ljava/lang/String;

    .line 165
    .line 166
    invoke-static {v1, p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 167
    .line 168
    .line 169
    goto :goto_8

    .line 170
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    const-string v1, "object with tag: "

    .line 173
    .line 174
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    const-string v1, " without encoder"

    .line 181
    .line 182
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-static {p0, v0}, Ls11;->I(Lbi0;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    :goto_8
    add-int p0, p4, v3

    .line 193
    .line 194
    add-int/2addr p0, v11

    .line 195
    iput p0, p1, Le9;->i:I

    .line 196
    .line 197
    return-void

    .line 198
    :cond_9
    new-instance p0, Ljava/lang/Exception;

    .line 199
    .line 200
    const-string v0, "parse dara failed"

    .line 201
    .line 202
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw p0

    .line 206
    :cond_a
    if-eqz v12, :cond_b

    .line 207
    .line 208
    invoke-virtual {p1, v11}, Le9;->k(I)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    :goto_9
    move-object v10, p0

    .line 213
    goto :goto_a

    .line 214
    :cond_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    new-array p0, v11, [B

    .line 218
    .line 219
    iget-object v0, p1, Le9;->k:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v0, [B

    .line 222
    .line 223
    iget v4, p1, Le9;->i:I

    .line 224
    .line 225
    invoke-static {v0, v4, p0, v5, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 226
    .line 227
    .line 228
    iget v0, p1, Le9;->i:I

    .line 229
    .line 230
    add-int/2addr v0, v11

    .line 231
    iput v0, p1, Le9;->i:I

    .line 232
    .line 233
    goto :goto_9

    .line 234
    :goto_a
    new-instance v7, Lpz;

    .line 235
    .line 236
    add-int v9, p4, v3

    .line 237
    .line 238
    move/from16 v8, p5

    .line 239
    .line 240
    invoke-direct/range {v7 .. v12}, Lyz;-><init>(IILjava/lang/Object;IZ)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2, v1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    return-void

    .line 247
    :cond_c
    if-eqz v12, :cond_d

    .line 248
    .line 249
    invoke-virtual {p1, v11}, Le9;->k(I)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    :goto_b
    move-object v10, p0

    .line 254
    goto :goto_c

    .line 255
    :cond_d
    invoke-virtual {p1, v11}, Le9;->k(I)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    goto :goto_b

    .line 260
    :goto_c
    new-instance v7, Lxz;

    .line 261
    .line 262
    add-int v9, p4, v3

    .line 263
    .line 264
    move/from16 v8, p5

    .line 265
    .line 266
    invoke-direct/range {v7 .. v12}, Lyz;-><init>(IILjava/lang/Object;IZ)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2, v1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    return-void

    .line 273
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static C(Lbi0;Z)Z
    .locals 11

    .line 1
    const-string v1, "FastKV"

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const-string p1, "miss cipher"

    .line 7
    .line 8
    invoke-static {p0, p1}, Ls11;->I(Lbi0;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return v2

    .line 12
    :cond_0
    iget-object v4, p0, Lbi0;->h:Le9;

    .line 13
    .line 14
    iget-object p1, p0, Lbi0;->b:Ljava/lang/String;

    .line 15
    .line 16
    const/16 v0, 0xc

    .line 17
    .line 18
    iput v0, v4, Le9;->i:I

    .line 19
    .line 20
    :goto_0
    :try_start_0
    iget v8, v4, Le9;->i:I

    .line 21
    .line 22
    iget v0, p0, Lbi0;->d:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    const-string v3, "parse dara failed"

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    if-ge v8, v0, :cond_9

    .line 28
    .line 29
    :try_start_1
    iget-object v0, v4, Le9;->k:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, [B

    .line 32
    .line 33
    add-int/lit8 v6, v8, 0x1

    .line 34
    .line 35
    iput v6, v4, Le9;->i:I

    .line 36
    .line 37
    aget-byte v9, v0, v8

    .line 38
    .line 39
    and-int/lit8 v7, v9, 0x3f

    .line 40
    .line 41
    int-to-byte v7, v7

    .line 42
    if-lt v7, v5, :cond_8

    .line 43
    .line 44
    const/16 v10, 0xb

    .line 45
    .line 46
    if-gt v7, v10, :cond_8

    .line 47
    .line 48
    add-int/lit8 v3, v8, 0x2

    .line 49
    .line 50
    iput v3, v4, Le9;->i:I

    .line 51
    .line 52
    aget-byte v0, v0, v6

    .line 53
    .line 54
    and-int/lit16 v0, v0, 0xff

    .line 55
    .line 56
    if-eqz v0, :cond_7

    .line 57
    .line 58
    const/4 v6, 0x5

    .line 59
    if-gez v9, :cond_5

    .line 60
    .line 61
    add-int/2addr v3, v0

    .line 62
    iput v3, v4, Le9;->i:I

    .line 63
    .line 64
    if-gt v7, v6, :cond_1

    .line 65
    .line 66
    sget-object v0, Lbi0;->y:[I

    .line 67
    .line 68
    aget v0, v0, v7

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :catch_0
    move-exception v0

    .line 72
    move-object p0, v0

    .line 73
    goto/16 :goto_4

    .line 74
    .line 75
    :cond_1
    const/16 v0, 0x9

    .line 76
    .line 77
    if-eq v7, v0, :cond_3

    .line 78
    .line 79
    const/16 v0, 0xa

    .line 80
    .line 81
    if-eq v7, v0, :cond_3

    .line 82
    .line 83
    if-ne v7, v10, :cond_2

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    move v5, v2

    .line 87
    :cond_3
    :goto_1
    if-eqz v5, :cond_4

    .line 88
    .line 89
    invoke-virtual {v4}, Le9;->h()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    goto :goto_2

    .line 94
    :cond_4
    invoke-virtual {v4}, Le9;->j()S

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    const v3, 0xffff

    .line 99
    .line 100
    .line 101
    and-int/2addr v0, v3

    .line 102
    :goto_2
    iget v3, v4, Le9;->i:I

    .line 103
    .line 104
    add-int/2addr v3, v0

    .line 105
    iput v3, v4, Le9;->i:I

    .line 106
    .line 107
    iget v0, p0, Lbi0;->m:I

    .line 108
    .line 109
    sub-int v5, v3, v8

    .line 110
    .line 111
    add-int/2addr v5, v0

    .line 112
    iput v5, p0, Lbi0;->m:I

    .line 113
    .line 114
    iget-object v0, p0, Lbi0;->n:Ljava/util/ArrayList;

    .line 115
    .line 116
    new-instance v5, Lnm2;

    .line 117
    .line 118
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 119
    .line 120
    .line 121
    iput v8, v5, Lnm2;->h:I

    .line 122
    .line 123
    iput v3, v5, Lnm2;->i:I

    .line 124
    .line 125
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_5
    invoke-virtual {v4, v0}, Le9;->k(I)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    move v5, v7

    .line 134
    iget v7, v4, Le9;->i:I

    .line 135
    .line 136
    if-gt v5, v6, :cond_6

    .line 137
    .line 138
    invoke-static {p0, v4, v5, v0, v7}, Lpp0;->A(Lbi0;Le9;BLjava/lang/String;I)V

    .line 139
    .line 140
    .line 141
    move-object v3, p0

    .line 142
    goto :goto_3

    .line 143
    :cond_6
    move-object v3, p0

    .line 144
    move-object v6, v0

    .line 145
    invoke-static/range {v3 .. v9}, Lpp0;->B(Lbi0;Le9;BLjava/lang/String;IIB)V

    .line 146
    .line 147
    .line 148
    :goto_3
    move-object p0, v3

    .line 149
    goto/16 :goto_0

    .line 150
    .line 151
    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 152
    .line 153
    const-string v0, "invalid key size"

    .line 154
    .line 155
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw p0

    .line 159
    :cond_8
    new-instance p0, Ljava/lang/Exception;

    .line 160
    .line 161
    invoke-direct {p0, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 165
    :cond_9
    if-eq v8, v0, :cond_a

    .line 166
    .line 167
    new-instance p0, Ljava/lang/Exception;

    .line 168
    .line 169
    invoke-direct {p0, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-static {v1, p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 173
    .line 174
    .line 175
    return v2

    .line 176
    :cond_a
    return v5

    .line 177
    :goto_4
    invoke-static {v1, p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 178
    .line 179
    .line 180
    return v2
.end method

.method public static D(Ljava/lang/String;)J
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_29

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    const/4 v5, 0x1

    .line 15
    const/16 v6, 0x2d

    .line 16
    .line 17
    const/16 v7, 0x2b

    .line 18
    .line 19
    if-eq v4, v7, :cond_1

    .line 20
    .line 21
    if-eq v4, v6, :cond_0

    .line 22
    .line 23
    move v4, v1

    .line 24
    :goto_0
    move v8, v4

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    move v4, v5

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move v8, v1

    .line 29
    move v4, v5

    .line 30
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v9

    .line 34
    if-le v9, v4, :cond_28

    .line 35
    .line 36
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 37
    .line 38
    .line 39
    move-result v9

    .line 40
    const/16 v10, 0x50

    .line 41
    .line 42
    const-string v11, ""

    .line 43
    .line 44
    if-ne v9, v10, :cond_27

    .line 45
    .line 46
    add-int/2addr v4, v5

    .line 47
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    if-eq v4, v9, :cond_26

    .line 52
    .line 53
    move v10, v1

    .line 54
    const/4 v1, 0x0

    .line 55
    const-wide/16 v12, 0x0

    .line 56
    .line 57
    const-wide/16 v14, 0x0

    .line 58
    .line 59
    const-wide/16 v16, 0x0

    .line 60
    .line 61
    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-ge v4, v2, :cond_23

    .line 66
    .line 67
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    const/16 v3, 0x54

    .line 72
    .line 73
    if-ne v2, v3, :cond_3

    .line 74
    .line 75
    if-nez v10, :cond_2

    .line 76
    .line 77
    add-int/lit8 v4, v4, 0x1

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eq v4, v2, :cond_2

    .line 84
    .line 85
    move v10, v5

    .line 86
    goto :goto_2

    .line 87
    :cond_2
    invoke-static {v11}, Ls;->j(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-wide v16

    .line 91
    :cond_3
    sget-object v3, Lxc1;->c:Lxc1;

    .line 92
    .line 93
    move/from16 v18, v5

    .line 94
    .line 95
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-eq v5, v7, :cond_5

    .line 100
    .line 101
    if-eq v5, v6, :cond_4

    .line 102
    .line 103
    move v5, v4

    .line 104
    :goto_3
    move/from16 v9, v18

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_4
    add-int/lit8 v5, v4, 0x1

    .line 108
    .line 109
    const/16 v19, -0x1

    .line 110
    .line 111
    move/from16 v9, v19

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_5
    add-int/lit8 v5, v4, 0x1

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :goto_4
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    const/16 v7, 0x30

    .line 122
    .line 123
    if-ge v5, v6, :cond_6

    .line 124
    .line 125
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    if-ne v6, v7, :cond_6

    .line 130
    .line 131
    add-int/lit8 v5, v5, 0x1

    .line 132
    .line 133
    const/16 v7, 0x2b

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_6
    move-wide/from16 v20, v16

    .line 137
    .line 138
    :goto_5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    const/16 v7, 0x3a

    .line 143
    .line 144
    if-ge v5, v6, :cond_c

    .line 145
    .line 146
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    move/from16 v23, v4

    .line 151
    .line 152
    const/16 v4, 0x30

    .line 153
    .line 154
    if-gt v4, v6, :cond_d

    .line 155
    .line 156
    if-ge v6, v7, :cond_d

    .line 157
    .line 158
    add-int/lit8 v6, v6, -0x30

    .line 159
    .line 160
    move v4, v8

    .line 161
    iget-wide v7, v3, Lxc1;->a:J

    .line 162
    .line 163
    cmp-long v7, v20, v7

    .line 164
    .line 165
    if-gtz v7, :cond_7

    .line 166
    .line 167
    if-nez v7, :cond_8

    .line 168
    .line 169
    int-to-long v7, v6

    .line 170
    move-wide/from16 v24, v7

    .line 171
    .line 172
    iget-wide v7, v3, Lxc1;->b:J

    .line 173
    .line 174
    cmp-long v7, v24, v7

    .line 175
    .line 176
    if-lez v7, :cond_8

    .line 177
    .line 178
    :cond_7
    move/from16 v25, v4

    .line 179
    .line 180
    goto :goto_6

    .line 181
    :cond_8
    const/4 v7, 0x3

    .line 182
    shl-long v7, v20, v7

    .line 183
    .line 184
    shl-long v20, v20, v18

    .line 185
    .line 186
    add-long v7, v7, v20

    .line 187
    .line 188
    move-object/from16 v24, v3

    .line 189
    .line 190
    move/from16 v25, v4

    .line 191
    .line 192
    int-to-long v3, v6

    .line 193
    add-long v20, v7, v3

    .line 194
    .line 195
    add-int/lit8 v5, v5, 0x1

    .line 196
    .line 197
    move/from16 v4, v23

    .line 198
    .line 199
    move-object/from16 v3, v24

    .line 200
    .line 201
    move/from16 v8, v25

    .line 202
    .line 203
    const/16 v7, 0x30

    .line 204
    .line 205
    goto :goto_5

    .line 206
    :goto_6
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    if-ge v5, v3, :cond_9

    .line 211
    .line 212
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    const/16 v4, 0x30

    .line 217
    .line 218
    if-gt v4, v3, :cond_9

    .line 219
    .line 220
    const/16 v4, 0x3a

    .line 221
    .line 222
    if-ge v3, v4, :cond_9

    .line 223
    .line 224
    add-int/lit8 v5, v5, 0x1

    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_9
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    if-eq v5, v3, :cond_b

    .line 232
    .line 233
    const/16 v3, 0x2b

    .line 234
    .line 235
    if-eq v2, v3, :cond_a

    .line 236
    .line 237
    const/16 v3, 0x2d

    .line 238
    .line 239
    if-eq v2, v3, :cond_a

    .line 240
    .line 241
    const/4 v2, 0x0

    .line 242
    goto :goto_7

    .line 243
    :cond_a
    move/from16 v2, v18

    .line 244
    .line 245
    :goto_7
    add-int v4, v23, v2

    .line 246
    .line 247
    if-eq v5, v4, :cond_b

    .line 248
    .line 249
    const-wide v20, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    const/16 v3, 0x2b

    .line 255
    .line 256
    const/16 v4, 0x2d

    .line 257
    .line 258
    :goto_8
    move-wide/from16 v6, v20

    .line 259
    .line 260
    goto :goto_a

    .line 261
    :cond_b
    invoke-static {v11}, Ls;->j(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    return-wide v16

    .line 265
    :cond_c
    move/from16 v23, v4

    .line 266
    .line 267
    :cond_d
    move/from16 v25, v8

    .line 268
    .line 269
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    if-eq v5, v3, :cond_22

    .line 274
    .line 275
    const/16 v3, 0x2b

    .line 276
    .line 277
    const/16 v4, 0x2d

    .line 278
    .line 279
    if-eq v2, v3, :cond_e

    .line 280
    .line 281
    if-eq v2, v4, :cond_e

    .line 282
    .line 283
    const/4 v2, 0x0

    .line 284
    goto :goto_9

    .line 285
    :cond_e
    move/from16 v2, v18

    .line 286
    .line 287
    :goto_9
    add-int v2, v23, v2

    .line 288
    .line 289
    if-eq v5, v2, :cond_22

    .line 290
    .line 291
    goto :goto_8

    .line 292
    :goto_a
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 293
    .line 294
    .line 295
    move-result v2

    .line 296
    sget-object v8, Led0;->k:Led0;

    .line 297
    .line 298
    const/16 v3, 0x2e

    .line 299
    .line 300
    if-ne v2, v3, :cond_16

    .line 301
    .line 302
    add-int/lit8 v2, v5, 0x1

    .line 303
    .line 304
    add-int/lit8 v5, v5, 0x7

    .line 305
    .line 306
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    invoke-static {v5, v3}, Ljava/lang/Math;->min(II)I

    .line 311
    .line 312
    .line 313
    move-result v3

    .line 314
    move v5, v2

    .line 315
    const/4 v14, 0x0

    .line 316
    :goto_b
    if-ge v5, v3, :cond_f

    .line 317
    .line 318
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 319
    .line 320
    .line 321
    move-result v15

    .line 322
    const/16 v4, 0x30

    .line 323
    .line 324
    if-gt v4, v15, :cond_f

    .line 325
    .line 326
    const/16 v4, 0x3a

    .line 327
    .line 328
    if-ge v15, v4, :cond_f

    .line 329
    .line 330
    shl-int/lit8 v4, v14, 0x3

    .line 331
    .line 332
    shl-int/lit8 v14, v14, 0x1

    .line 333
    .line 334
    add-int/2addr v4, v14

    .line 335
    add-int/lit8 v15, v15, -0x30

    .line 336
    .line 337
    add-int v14, v15, v4

    .line 338
    .line 339
    add-int/lit8 v5, v5, 0x1

    .line 340
    .line 341
    goto :goto_b

    .line 342
    :cond_f
    sub-int v3, v5, v2

    .line 343
    .line 344
    rsub-int/lit8 v3, v3, 0x6

    .line 345
    .line 346
    const/4 v4, 0x0

    .line 347
    :goto_c
    if-ge v4, v3, :cond_10

    .line 348
    .line 349
    shl-int/lit8 v15, v14, 0x3

    .line 350
    .line 351
    shl-int/lit8 v14, v14, 0x1

    .line 352
    .line 353
    add-int/2addr v14, v15

    .line 354
    add-int/lit8 v4, v4, 0x1

    .line 355
    .line 356
    goto :goto_c

    .line 357
    :cond_10
    add-int/lit8 v3, v5, 0x9

    .line 358
    .line 359
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 360
    .line 361
    .line 362
    move-result v4

    .line 363
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 364
    .line 365
    .line 366
    move-result v3

    .line 367
    move v4, v5

    .line 368
    const/4 v15, 0x0

    .line 369
    :goto_d
    if-ge v4, v3, :cond_11

    .line 370
    .line 371
    move/from16 v21, v3

    .line 372
    .line 373
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 374
    .line 375
    .line 376
    move-result v3

    .line 377
    move/from16 v23, v4

    .line 378
    .line 379
    const/16 v4, 0x30

    .line 380
    .line 381
    if-gt v4, v3, :cond_12

    .line 382
    .line 383
    const/16 v4, 0x3a

    .line 384
    .line 385
    if-ge v3, v4, :cond_12

    .line 386
    .line 387
    shl-int/lit8 v4, v15, 0x3

    .line 388
    .line 389
    shl-int/lit8 v15, v15, 0x1

    .line 390
    .line 391
    add-int/2addr v4, v15

    .line 392
    add-int/lit8 v3, v3, -0x30

    .line 393
    .line 394
    add-int v15, v3, v4

    .line 395
    .line 396
    add-int/lit8 v4, v23, 0x1

    .line 397
    .line 398
    move/from16 v3, v21

    .line 399
    .line 400
    goto :goto_d

    .line 401
    :cond_11
    move/from16 v23, v4

    .line 402
    .line 403
    :cond_12
    sub-int v4, v23, v5

    .line 404
    .line 405
    rsub-int/lit8 v3, v4, 0x9

    .line 406
    .line 407
    const/4 v4, 0x0

    .line 408
    :goto_e
    if-ge v4, v3, :cond_13

    .line 409
    .line 410
    shl-int/lit8 v5, v15, 0x3

    .line 411
    .line 412
    shl-int/lit8 v15, v15, 0x1

    .line 413
    .line 414
    add-int/2addr v15, v5

    .line 415
    add-int/lit8 v4, v4, 0x1

    .line 416
    .line 417
    goto :goto_e

    .line 418
    :cond_13
    move/from16 v5, v23

    .line 419
    .line 420
    :goto_f
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 421
    .line 422
    .line 423
    move-result v3

    .line 424
    if-ge v5, v3, :cond_14

    .line 425
    .line 426
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 427
    .line 428
    .line 429
    move-result v3

    .line 430
    const/16 v4, 0x30

    .line 431
    .line 432
    if-gt v4, v3, :cond_14

    .line 433
    .line 434
    const/16 v4, 0x3a

    .line 435
    .line 436
    if-ge v3, v4, :cond_14

    .line 437
    .line 438
    add-int/lit8 v5, v5, 0x1

    .line 439
    .line 440
    goto :goto_f

    .line 441
    :cond_14
    if-eq v5, v2, :cond_15

    .line 442
    .line 443
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 444
    .line 445
    .line 446
    move-result v2

    .line 447
    if-eq v5, v2, :cond_15

    .line 448
    .line 449
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 450
    .line 451
    .line 452
    move-result v2

    .line 453
    const/16 v3, 0x53

    .line 454
    .line 455
    if-ne v2, v3, :cond_15

    .line 456
    .line 457
    int-to-long v2, v14

    .line 458
    const-wide/32 v21, 0x3b9aca00

    .line 459
    .line 460
    .line 461
    mul-long v2, v2, v21

    .line 462
    .line 463
    int-to-long v14, v15

    .line 464
    add-long/2addr v2, v14

    .line 465
    int-to-long v14, v9

    .line 466
    long-to-double v2, v2

    .line 467
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 468
    .line 469
    .line 470
    move-result v4

    .line 471
    packed-switch v4, :pswitch_data_0

    .line 472
    .line 473
    .line 474
    const-string v2, "Unknown unit: "

    .line 475
    .line 476
    invoke-static {v2, v8}, Lc80;->u(Ljava/lang/String;Ljava/lang/Object;)V

    .line 477
    .line 478
    .line 479
    move-wide/from16 v2, v16

    .line 480
    .line 481
    goto :goto_11

    .line 482
    :pswitch_0
    const-wide v21, 0x3fb61e4f765fd8aeL    # 0.0864

    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    goto :goto_10

    .line 488
    :pswitch_1
    const-wide v21, 0x3f6d7dbf487fcb92L    # 0.0036

    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    goto :goto_10

    .line 494
    :pswitch_2
    const-wide v21, 0x3f0f75104d551d69L    # 6.0E-5

    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    goto :goto_10

    .line 500
    :pswitch_3
    const-wide v21, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    goto :goto_10

    .line 506
    :pswitch_4
    const-wide v21, 0x3e112e0be826d695L    # 1.0E-9

    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    goto :goto_10

    .line 512
    :pswitch_5
    const-wide v21, 0x3d719799812dea11L    # 1.0E-12

    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    goto :goto_10

    .line 518
    :pswitch_6
    const-wide v21, 0x3cd203af9ee75616L    # 1.0E-15

    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    :goto_10
    mul-double v2, v2, v21

    .line 524
    .line 525
    invoke-static {v2, v3}, Lgf1;->R(D)J

    .line 526
    .line 527
    .line 528
    move-result-wide v2

    .line 529
    :goto_11
    mul-long/2addr v2, v14

    .line 530
    move-wide v14, v2

    .line 531
    goto :goto_12

    .line 532
    :cond_15
    invoke-static {v11}, Ls;->j(Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    return-wide v16

    .line 536
    :cond_16
    :goto_12
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 537
    .line 538
    .line 539
    move-result v2

    .line 540
    const/16 v3, 0x44

    .line 541
    .line 542
    sget-object v4, Led0;->n:Led0;

    .line 543
    .line 544
    if-eq v2, v3, :cond_19

    .line 545
    .line 546
    const/16 v3, 0x48

    .line 547
    .line 548
    if-eq v2, v3, :cond_18

    .line 549
    .line 550
    const/16 v3, 0x4d

    .line 551
    .line 552
    if-eq v2, v3, :cond_17

    .line 553
    .line 554
    const/16 v3, 0x53

    .line 555
    .line 556
    if-eq v2, v3, :cond_1a

    .line 557
    .line 558
    const/4 v8, 0x0

    .line 559
    goto :goto_13

    .line 560
    :cond_17
    sget-object v8, Led0;->l:Led0;

    .line 561
    .line 562
    goto :goto_13

    .line 563
    :cond_18
    sget-object v8, Led0;->m:Led0;

    .line 564
    .line 565
    goto :goto_13

    .line 566
    :cond_19
    move-object v8, v4

    .line 567
    :cond_1a
    :goto_13
    if-eqz v8, :cond_21

    .line 568
    .line 569
    if-eqz v1, :cond_1c

    .line 570
    .line 571
    invoke-virtual {v1, v8}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 572
    .line 573
    .line 574
    move-result v1

    .line 575
    if-lez v1, :cond_1b

    .line 576
    .line 577
    goto :goto_14

    .line 578
    :cond_1b
    const-string v0, "Unexpected order of duration components"

    .line 579
    .line 580
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 581
    .line 582
    .line 583
    return-wide v16

    .line 584
    :cond_1c
    :goto_14
    if-ne v8, v4, :cond_1e

    .line 585
    .line 586
    if-nez v10, :cond_1d

    .line 587
    .line 588
    int-to-long v1, v9

    .line 589
    invoke-static {v6, v7, v8}, Lqp0;->q(JLed0;)J

    .line 590
    .line 591
    .line 592
    move-result-wide v3

    .line 593
    mul-long/2addr v3, v1

    .line 594
    move-wide v12, v3

    .line 595
    goto :goto_15

    .line 596
    :cond_1d
    invoke-static {v11}, Ls;->j(Ljava/lang/String;)V

    .line 597
    .line 598
    .line 599
    return-wide v16

    .line 600
    :cond_1e
    if-eqz v10, :cond_20

    .line 601
    .line 602
    int-to-long v1, v9

    .line 603
    invoke-static {v6, v7, v8}, Lqp0;->q(JLed0;)J

    .line 604
    .line 605
    .line 606
    move-result-wide v3

    .line 607
    mul-long/2addr v3, v1

    .line 608
    invoke-static {v12, v13, v3, v4}, Lpp0;->l(JJ)J

    .line 609
    .line 610
    .line 611
    move-result-wide v1

    .line 612
    const-wide v3, 0x7fffffffffffc0deL

    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    cmp-long v3, v1, v3

    .line 618
    .line 619
    if-eqz v3, :cond_1f

    .line 620
    .line 621
    move-wide v12, v1

    .line 622
    :goto_15
    add-int/lit8 v4, v5, 0x1

    .line 623
    .line 624
    move-object v1, v8

    .line 625
    move/from16 v5, v18

    .line 626
    .line 627
    move/from16 v8, v25

    .line 628
    .line 629
    const/16 v6, 0x2d

    .line 630
    .line 631
    const/16 v7, 0x2b

    .line 632
    .line 633
    goto/16 :goto_2

    .line 634
    .line 635
    :cond_1f
    invoke-static {v11}, Ls;->j(Ljava/lang/String;)V

    .line 636
    .line 637
    .line 638
    return-wide v16

    .line 639
    :cond_20
    invoke-static {v11}, Ls;->j(Ljava/lang/String;)V

    .line 640
    .line 641
    .line 642
    return-wide v16

    .line 643
    :cond_21
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 644
    .line 645
    .line 646
    move-result v0

    .line 647
    new-instance v1, Ljava/lang/StringBuilder;

    .line 648
    .line 649
    const-string v2, "Unknown duration unit short name: "

    .line 650
    .line 651
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 655
    .line 656
    .line 657
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 662
    .line 663
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 664
    .line 665
    .line 666
    throw v1

    .line 667
    :cond_22
    invoke-static {v11}, Ls;->j(Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    return-wide v16

    .line 671
    :cond_23
    move/from16 v25, v8

    .line 672
    .line 673
    sget-object v0, Led0;->j:Led0;

    .line 674
    .line 675
    invoke-static {v12, v13, v0}, Lpp0;->G(JLed0;)J

    .line 676
    .line 677
    .line 678
    move-result-wide v0

    .line 679
    sget-object v2, Led0;->i:Led0;

    .line 680
    .line 681
    invoke-static {v14, v15, v2}, Lpp0;->G(JLed0;)J

    .line 682
    .line 683
    .line 684
    move-result-wide v2

    .line 685
    invoke-static {v0, v1, v2, v3}, Lad0;->e(JJ)J

    .line 686
    .line 687
    .line 688
    move-result-wide v0

    .line 689
    if-eqz v25, :cond_25

    .line 690
    .line 691
    sget-wide v2, Lad0;->l:J

    .line 692
    .line 693
    cmp-long v2, v0, v2

    .line 694
    .line 695
    if-nez v2, :cond_24

    .line 696
    .line 697
    return-wide v0

    .line 698
    :cond_24
    invoke-static {v0, v1}, Lad0;->g(J)J

    .line 699
    .line 700
    .line 701
    move-result-wide v0

    .line 702
    :cond_25
    return-wide v0

    .line 703
    :cond_26
    const-wide/16 v16, 0x0

    .line 704
    .line 705
    invoke-static {v11}, Ls;->j(Ljava/lang/String;)V

    .line 706
    .line 707
    .line 708
    return-wide v16

    .line 709
    :cond_27
    const-wide/16 v16, 0x0

    .line 710
    .line 711
    invoke-static {v11}, Ls;->j(Ljava/lang/String;)V

    .line 712
    .line 713
    .line 714
    return-wide v16

    .line 715
    :cond_28
    const-wide/16 v16, 0x0

    .line 716
    .line 717
    const-string v0, "No components"

    .line 718
    .line 719
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 720
    .line 721
    .line 722
    return-wide v16

    .line 723
    :cond_29
    const-wide/16 v16, 0x0

    .line 724
    .line 725
    const-string v0, "The string is empty"

    .line 726
    .line 727
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 728
    .line 729
    .line 730
    return-wide v16

    .line 731
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final E(Luh1;F)Luh1;
    .locals 7

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    cmpg-float v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 v5, 0x0

    .line 11
    const v6, 0x7fffc

    .line 12
    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    move v3, p1

    .line 16
    move-object v1, p0

    .line 17
    move v2, p1

    .line 18
    invoke-static/range {v1 .. v6}, Lte;->N(Luh1;FFFLeq2;I)Luh1;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static final F(Lqm2;I)I
    .locals 4

    .line 1
    iget-object v0, p0, Lqm2;->m:[I

    .line 2
    .line 3
    add-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    iget-object p0, p0, Lqm2;->l:[[B

    .line 6
    .line 7
    array-length p0, p0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    add-int/lit8 p0, p0, -0x1

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    if-gt v1, p0, :cond_1

    .line 15
    .line 16
    add-int v2, v1, p0

    .line 17
    .line 18
    ushr-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    aget v3, v0, v2

    .line 21
    .line 22
    if-ge v3, p1, :cond_0

    .line 23
    .line 24
    add-int/lit8 v1, v2, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    if-le v3, p1, :cond_2

    .line 28
    .line 29
    add-int/lit8 p0, v2, -0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    neg-int p0, v1

    .line 33
    add-int/lit8 v2, p0, -0x1

    .line 34
    .line 35
    :cond_2
    if-ltz v2, :cond_3

    .line 36
    .line 37
    return v2

    .line 38
    :cond_3
    not-int p0, v2

    .line 39
    return p0
.end method

.method public static final G(JLed0;)J
    .locals 7

    .line 1
    iget-object v0, p2, Led0;->h:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    const-wide v1, 0x3ffffffffffa14bfL    # 1.9999999999138678

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    sget-object v3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    neg-long v4, v1

    .line 15
    cmp-long v4, v4, p0

    .line 16
    .line 17
    if-gtz v4, :cond_0

    .line 18
    .line 19
    cmp-long v1, p0, v1

    .line 20
    .line 21
    if-gtz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v3, p0, p1, v0}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    .line 24
    .line 25
    .line 26
    move-result-wide p0

    .line 27
    sget-object p2, Lad0;->i:Lz8;

    .line 28
    .line 29
    const/4 p2, 0x1

    .line 30
    shl-long/2addr p0, p2

    .line 31
    sget p2, Lcd0;->a:I

    .line 32
    .line 33
    return-wide p0

    .line 34
    :cond_0
    sget-object v1, Led0;->j:Led0;

    .line 35
    .line 36
    invoke-virtual {p2, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-ltz v1, :cond_2

    .line 41
    .line 42
    invoke-static {p0, p1}, Ljava/lang/Long;->signum(J)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    int-to-long v0, v0

    .line 47
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    cmp-long v4, p0, v2

    .line 53
    .line 54
    if-gez v4, :cond_1

    .line 55
    .line 56
    move-wide p0, v2

    .line 57
    :cond_1
    invoke-static {p0, p1}, Ljava/lang/Math;->abs(J)J

    .line 58
    .line 59
    .line 60
    move-result-wide p0

    .line 61
    invoke-static {p0, p1, p2}, Lqp0;->q(JLed0;)J

    .line 62
    .line 63
    .line 64
    move-result-wide p0

    .line 65
    mul-long/2addr p0, v0

    .line 66
    invoke-static {p0, p1}, Lpp0;->r(J)J

    .line 67
    .line 68
    .line 69
    move-result-wide p0

    .line 70
    return-wide p0

    .line 71
    :cond_2
    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 72
    .line 73
    invoke-virtual {p2, p0, p1, v0}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    .line 74
    .line 75
    .line 76
    move-result-wide v1

    .line 77
    const-wide v3, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    const-wide v5, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    invoke-static/range {v1 .. v6}, Lci0;->E(JJJ)J

    .line 88
    .line 89
    .line 90
    move-result-wide p0

    .line 91
    invoke-static {p0, p1}, Lpp0;->r(J)J

    .line 92
    .line 93
    .line 94
    move-result-wide p0

    .line 95
    return-wide p0
.end method

.method public static final H(Ljava/util/List;Ly9;)V
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Ly9;->a:Landroid/graphics/Path;

    .line 6
    .line 7
    iget-object v3, v1, Ly9;->a:Landroid/graphics/Path;

    .line 8
    .line 9
    invoke-virtual {v2}, Landroid/graphics/Path;->getFillType()Landroid/graphics/Path$FillType;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    sget-object v4, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 14
    .line 15
    const/4 v5, 0x1

    .line 16
    const/4 v6, 0x0

    .line 17
    if-ne v2, v4, :cond_0

    .line 18
    .line 19
    move v2, v5

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v2, v6

    .line 22
    :goto_0
    invoke-virtual {v3}, Landroid/graphics/Path;->rewind()V

    .line 23
    .line 24
    .line 25
    if-ne v2, v5, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    sget-object v4, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 29
    .line 30
    :goto_1
    invoke-virtual {v3, v4}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    sget-object v2, Lyx1;->c:Lyx1;

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Lqy1;

    .line 47
    .line 48
    :goto_2
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 49
    .line 50
    .line 51
    move-result v10

    .line 52
    const/4 v11, 0x0

    .line 53
    move v12, v6

    .line 54
    move v4, v11

    .line 55
    move v5, v4

    .line 56
    move v13, v5

    .line 57
    move v14, v13

    .line 58
    move/from16 v18, v14

    .line 59
    .line 60
    move/from16 v19, v18

    .line 61
    .line 62
    :goto_3
    if-ge v12, v10, :cond_1a

    .line 63
    .line 64
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    move-object v15, v6

    .line 69
    check-cast v15, Lqy1;

    .line 70
    .line 71
    instance-of v6, v15, Lyx1;

    .line 72
    .line 73
    if-eqz v6, :cond_3

    .line 74
    .line 75
    invoke-virtual {v3}, Landroid/graphics/Path;->close()V

    .line 76
    .line 77
    .line 78
    move-object/from16 v20, v3

    .line 79
    .line 80
    move/from16 v21, v10

    .line 81
    .line 82
    move/from16 v25, v11

    .line 83
    .line 84
    move/from16 v22, v12

    .line 85
    .line 86
    move-object/from16 v23, v15

    .line 87
    .line 88
    move/from16 v4, v18

    .line 89
    .line 90
    move v13, v4

    .line 91
    move/from16 v5, v19

    .line 92
    .line 93
    move v14, v5

    .line 94
    goto/16 :goto_d

    .line 95
    .line 96
    :cond_3
    instance-of v6, v15, Lky1;

    .line 97
    .line 98
    if-eqz v6, :cond_4

    .line 99
    .line 100
    move-object v2, v15

    .line 101
    check-cast v2, Lky1;

    .line 102
    .line 103
    iget v6, v2, Lky1;->c:F

    .line 104
    .line 105
    add-float/2addr v13, v6

    .line 106
    iget v2, v2, Lky1;->d:F

    .line 107
    .line 108
    add-float/2addr v14, v2

    .line 109
    invoke-virtual {v3, v6, v2}, Landroid/graphics/Path;->rMoveTo(FF)V

    .line 110
    .line 111
    .line 112
    move-object/from16 v20, v3

    .line 113
    .line 114
    move/from16 v21, v10

    .line 115
    .line 116
    move/from16 v25, v11

    .line 117
    .line 118
    move/from16 v22, v12

    .line 119
    .line 120
    move/from16 v18, v13

    .line 121
    .line 122
    move/from16 v19, v14

    .line 123
    .line 124
    :goto_4
    move-object/from16 v23, v15

    .line 125
    .line 126
    goto/16 :goto_d

    .line 127
    .line 128
    :cond_4
    instance-of v6, v15, Lcy1;

    .line 129
    .line 130
    if-eqz v6, :cond_5

    .line 131
    .line 132
    move-object v2, v15

    .line 133
    check-cast v2, Lcy1;

    .line 134
    .line 135
    iget v6, v2, Lcy1;->c:F

    .line 136
    .line 137
    iget v2, v2, Lcy1;->d:F

    .line 138
    .line 139
    invoke-virtual {v3, v6, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 140
    .line 141
    .line 142
    move v14, v2

    .line 143
    move/from16 v19, v14

    .line 144
    .line 145
    move-object/from16 v20, v3

    .line 146
    .line 147
    move v13, v6

    .line 148
    move/from16 v18, v13

    .line 149
    .line 150
    :goto_5
    move/from16 v21, v10

    .line 151
    .line 152
    move/from16 v25, v11

    .line 153
    .line 154
    move/from16 v22, v12

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_5
    instance-of v6, v15, Ljy1;

    .line 158
    .line 159
    if-eqz v6, :cond_6

    .line 160
    .line 161
    move-object v2, v15

    .line 162
    check-cast v2, Ljy1;

    .line 163
    .line 164
    iget v6, v2, Ljy1;->d:F

    .line 165
    .line 166
    iget v2, v2, Ljy1;->c:F

    .line 167
    .line 168
    invoke-virtual {v3, v2, v6}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 169
    .line 170
    .line 171
    add-float/2addr v13, v2

    .line 172
    add-float/2addr v14, v6

    .line 173
    :goto_6
    move-object/from16 v20, v3

    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_6
    instance-of v6, v15, Lby1;

    .line 177
    .line 178
    if-eqz v6, :cond_7

    .line 179
    .line 180
    move-object v2, v15

    .line 181
    check-cast v2, Lby1;

    .line 182
    .line 183
    iget v6, v2, Lby1;->d:F

    .line 184
    .line 185
    iget v2, v2, Lby1;->c:F

    .line 186
    .line 187
    invoke-virtual {v1, v2, v6}, Ly9;->e(FF)V

    .line 188
    .line 189
    .line 190
    move v13, v2

    .line 191
    move-object/from16 v20, v3

    .line 192
    .line 193
    move v14, v6

    .line 194
    goto :goto_5

    .line 195
    :cond_7
    instance-of v6, v15, Liy1;

    .line 196
    .line 197
    if-eqz v6, :cond_8

    .line 198
    .line 199
    move-object v2, v15

    .line 200
    check-cast v2, Liy1;

    .line 201
    .line 202
    iget v2, v2, Liy1;->c:F

    .line 203
    .line 204
    invoke-virtual {v3, v2, v11}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 205
    .line 206
    .line 207
    add-float/2addr v13, v2

    .line 208
    goto :goto_6

    .line 209
    :cond_8
    instance-of v6, v15, Lay1;

    .line 210
    .line 211
    if-eqz v6, :cond_9

    .line 212
    .line 213
    move-object v2, v15

    .line 214
    check-cast v2, Lay1;

    .line 215
    .line 216
    iget v2, v2, Lay1;->c:F

    .line 217
    .line 218
    invoke-virtual {v1, v2, v14}, Ly9;->e(FF)V

    .line 219
    .line 220
    .line 221
    move v13, v2

    .line 222
    goto :goto_6

    .line 223
    :cond_9
    instance-of v6, v15, Loy1;

    .line 224
    .line 225
    if-eqz v6, :cond_a

    .line 226
    .line 227
    move-object v2, v15

    .line 228
    check-cast v2, Loy1;

    .line 229
    .line 230
    iget v2, v2, Loy1;->c:F

    .line 231
    .line 232
    invoke-virtual {v3, v11, v2}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 233
    .line 234
    .line 235
    add-float/2addr v14, v2

    .line 236
    goto :goto_6

    .line 237
    :cond_a
    instance-of v6, v15, Lpy1;

    .line 238
    .line 239
    if-eqz v6, :cond_b

    .line 240
    .line 241
    move-object v2, v15

    .line 242
    check-cast v2, Lpy1;

    .line 243
    .line 244
    iget v2, v2, Lpy1;->c:F

    .line 245
    .line 246
    invoke-virtual {v1, v13, v2}, Ly9;->e(FF)V

    .line 247
    .line 248
    .line 249
    move v14, v2

    .line 250
    goto :goto_6

    .line 251
    :cond_b
    instance-of v6, v15, Lhy1;

    .line 252
    .line 253
    if-eqz v6, :cond_c

    .line 254
    .line 255
    move-object v2, v15

    .line 256
    check-cast v2, Lhy1;

    .line 257
    .line 258
    iget v4, v2, Lhy1;->c:F

    .line 259
    .line 260
    iget v5, v2, Lhy1;->d:F

    .line 261
    .line 262
    iget v6, v2, Lhy1;->e:F

    .line 263
    .line 264
    iget v7, v2, Lhy1;->f:F

    .line 265
    .line 266
    iget v8, v2, Lhy1;->g:F

    .line 267
    .line 268
    iget v9, v2, Lhy1;->h:F

    .line 269
    .line 270
    invoke-virtual/range {v3 .. v9}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    .line 271
    .line 272
    .line 273
    move-object v8, v3

    .line 274
    iget v3, v2, Lhy1;->e:F

    .line 275
    .line 276
    add-float/2addr v3, v13

    .line 277
    iget v4, v2, Lhy1;->f:F

    .line 278
    .line 279
    add-float/2addr v4, v14

    .line 280
    iget v5, v2, Lhy1;->g:F

    .line 281
    .line 282
    add-float/2addr v13, v5

    .line 283
    iget v2, v2, Lhy1;->h:F

    .line 284
    .line 285
    add-float/2addr v14, v2

    .line 286
    move v5, v4

    .line 287
    move-object/from16 v20, v8

    .line 288
    .line 289
    move/from16 v21, v10

    .line 290
    .line 291
    move/from16 v25, v11

    .line 292
    .line 293
    move/from16 v22, v12

    .line 294
    .line 295
    move-object/from16 v23, v15

    .line 296
    .line 297
    move v4, v3

    .line 298
    goto/16 :goto_d

    .line 299
    .line 300
    :cond_c
    move-object v8, v3

    .line 301
    instance-of v3, v15, Lzx1;

    .line 302
    .line 303
    if-eqz v3, :cond_d

    .line 304
    .line 305
    move-object v9, v15

    .line 306
    check-cast v9, Lzx1;

    .line 307
    .line 308
    iget v2, v9, Lzx1;->c:F

    .line 309
    .line 310
    iget v3, v9, Lzx1;->d:F

    .line 311
    .line 312
    iget v4, v9, Lzx1;->e:F

    .line 313
    .line 314
    iget v5, v9, Lzx1;->f:F

    .line 315
    .line 316
    iget v6, v9, Lzx1;->g:F

    .line 317
    .line 318
    iget v7, v9, Lzx1;->h:F

    .line 319
    .line 320
    invoke-virtual/range {v1 .. v7}, Ly9;->c(FFFFFF)V

    .line 321
    .line 322
    .line 323
    iget v1, v9, Lzx1;->e:F

    .line 324
    .line 325
    iget v2, v9, Lzx1;->f:F

    .line 326
    .line 327
    iget v3, v9, Lzx1;->g:F

    .line 328
    .line 329
    iget v4, v9, Lzx1;->h:F

    .line 330
    .line 331
    :goto_7
    move v5, v2

    .line 332
    move v13, v3

    .line 333
    move v14, v4

    .line 334
    :goto_8
    move-object/from16 v20, v8

    .line 335
    .line 336
    move/from16 v21, v10

    .line 337
    .line 338
    move/from16 v25, v11

    .line 339
    .line 340
    move/from16 v22, v12

    .line 341
    .line 342
    move-object/from16 v23, v15

    .line 343
    .line 344
    move v4, v1

    .line 345
    goto/16 :goto_d

    .line 346
    .line 347
    :cond_d
    instance-of v1, v15, Lmy1;

    .line 348
    .line 349
    if-eqz v1, :cond_f

    .line 350
    .line 351
    iget-boolean v1, v2, Lqy1;->a:Z

    .line 352
    .line 353
    if-eqz v1, :cond_e

    .line 354
    .line 355
    sub-float v1, v13, v4

    .line 356
    .line 357
    sub-float v2, v14, v5

    .line 358
    .line 359
    move v4, v1

    .line 360
    move v5, v2

    .line 361
    goto :goto_9

    .line 362
    :cond_e
    move v4, v11

    .line 363
    move v5, v4

    .line 364
    :goto_9
    move-object v1, v15

    .line 365
    check-cast v1, Lmy1;

    .line 366
    .line 367
    iget v6, v1, Lmy1;->c:F

    .line 368
    .line 369
    iget v7, v1, Lmy1;->d:F

    .line 370
    .line 371
    move-object v3, v8

    .line 372
    iget v8, v1, Lmy1;->e:F

    .line 373
    .line 374
    iget v9, v1, Lmy1;->f:F

    .line 375
    .line 376
    invoke-virtual/range {v3 .. v9}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    .line 377
    .line 378
    .line 379
    move-object v8, v3

    .line 380
    iget v2, v1, Lmy1;->c:F

    .line 381
    .line 382
    add-float/2addr v2, v13

    .line 383
    iget v3, v1, Lmy1;->d:F

    .line 384
    .line 385
    add-float/2addr v3, v14

    .line 386
    iget v4, v1, Lmy1;->e:F

    .line 387
    .line 388
    add-float/2addr v13, v4

    .line 389
    iget v1, v1, Lmy1;->f:F

    .line 390
    .line 391
    add-float/2addr v14, v1

    .line 392
    move v4, v2

    .line 393
    move v5, v3

    .line 394
    :goto_a
    move-object/from16 v20, v8

    .line 395
    .line 396
    goto/16 :goto_5

    .line 397
    .line 398
    :cond_f
    instance-of v1, v15, Ley1;

    .line 399
    .line 400
    const/high16 v3, 0x40000000    # 2.0f

    .line 401
    .line 402
    if-eqz v1, :cond_11

    .line 403
    .line 404
    iget-boolean v1, v2, Lqy1;->a:Z

    .line 405
    .line 406
    if-eqz v1, :cond_10

    .line 407
    .line 408
    mul-float/2addr v13, v3

    .line 409
    sub-float/2addr v13, v4

    .line 410
    mul-float/2addr v3, v14

    .line 411
    sub-float v14, v3, v5

    .line 412
    .line 413
    :cond_10
    move v2, v13

    .line 414
    move v3, v14

    .line 415
    move-object v9, v15

    .line 416
    check-cast v9, Ley1;

    .line 417
    .line 418
    iget v4, v9, Ley1;->c:F

    .line 419
    .line 420
    iget v5, v9, Ley1;->d:F

    .line 421
    .line 422
    iget v6, v9, Ley1;->e:F

    .line 423
    .line 424
    iget v7, v9, Ley1;->f:F

    .line 425
    .line 426
    move-object/from16 v1, p1

    .line 427
    .line 428
    invoke-virtual/range {v1 .. v7}, Ly9;->c(FFFFFF)V

    .line 429
    .line 430
    .line 431
    iget v1, v9, Ley1;->c:F

    .line 432
    .line 433
    iget v2, v9, Ley1;->d:F

    .line 434
    .line 435
    iget v3, v9, Ley1;->e:F

    .line 436
    .line 437
    iget v4, v9, Ley1;->f:F

    .line 438
    .line 439
    goto :goto_7

    .line 440
    :cond_11
    instance-of v1, v15, Lly1;

    .line 441
    .line 442
    if-eqz v1, :cond_12

    .line 443
    .line 444
    move-object v1, v15

    .line 445
    check-cast v1, Lly1;

    .line 446
    .line 447
    iget v2, v1, Lly1;->f:F

    .line 448
    .line 449
    iget v3, v1, Lly1;->e:F

    .line 450
    .line 451
    iget v4, v1, Lly1;->d:F

    .line 452
    .line 453
    iget v1, v1, Lly1;->c:F

    .line 454
    .line 455
    invoke-virtual {v8, v1, v4, v3, v2}, Landroid/graphics/Path;->rQuadTo(FFFF)V

    .line 456
    .line 457
    .line 458
    add-float/2addr v1, v13

    .line 459
    add-float/2addr v4, v14

    .line 460
    add-float/2addr v13, v3

    .line 461
    add-float/2addr v14, v2

    .line 462
    :goto_b
    move v5, v4

    .line 463
    goto/16 :goto_8

    .line 464
    .line 465
    :cond_12
    instance-of v1, v15, Ldy1;

    .line 466
    .line 467
    if-eqz v1, :cond_13

    .line 468
    .line 469
    move-object v1, v15

    .line 470
    check-cast v1, Ldy1;

    .line 471
    .line 472
    iget v2, v1, Ldy1;->f:F

    .line 473
    .line 474
    iget v3, v1, Ldy1;->e:F

    .line 475
    .line 476
    iget v4, v1, Ldy1;->d:F

    .line 477
    .line 478
    iget v1, v1, Ldy1;->c:F

    .line 479
    .line 480
    invoke-virtual {v8, v1, v4, v3, v2}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 481
    .line 482
    .line 483
    move v14, v2

    .line 484
    move v13, v3

    .line 485
    goto :goto_b

    .line 486
    :cond_13
    instance-of v1, v15, Lny1;

    .line 487
    .line 488
    if-eqz v1, :cond_15

    .line 489
    .line 490
    iget-boolean v1, v2, Lqy1;->b:Z

    .line 491
    .line 492
    if-eqz v1, :cond_14

    .line 493
    .line 494
    sub-float v1, v13, v4

    .line 495
    .line 496
    sub-float v2, v14, v5

    .line 497
    .line 498
    goto :goto_c

    .line 499
    :cond_14
    move v1, v11

    .line 500
    move v2, v1

    .line 501
    :goto_c
    move-object v3, v15

    .line 502
    check-cast v3, Lny1;

    .line 503
    .line 504
    iget v4, v3, Lny1;->d:F

    .line 505
    .line 506
    iget v3, v3, Lny1;->c:F

    .line 507
    .line 508
    invoke-virtual {v8, v1, v2, v3, v4}, Landroid/graphics/Path;->rQuadTo(FFFF)V

    .line 509
    .line 510
    .line 511
    add-float/2addr v1, v13

    .line 512
    add-float/2addr v2, v14

    .line 513
    add-float/2addr v13, v3

    .line 514
    add-float/2addr v14, v4

    .line 515
    move v4, v1

    .line 516
    move v5, v2

    .line 517
    goto :goto_a

    .line 518
    :cond_15
    instance-of v1, v15, Lfy1;

    .line 519
    .line 520
    if-eqz v1, :cond_17

    .line 521
    .line 522
    iget-boolean v1, v2, Lqy1;->b:Z

    .line 523
    .line 524
    if-eqz v1, :cond_16

    .line 525
    .line 526
    mul-float/2addr v13, v3

    .line 527
    sub-float/2addr v13, v4

    .line 528
    mul-float/2addr v3, v14

    .line 529
    sub-float v14, v3, v5

    .line 530
    .line 531
    :cond_16
    move-object v1, v15

    .line 532
    check-cast v1, Lfy1;

    .line 533
    .line 534
    iget v2, v1, Lfy1;->d:F

    .line 535
    .line 536
    iget v1, v1, Lfy1;->c:F

    .line 537
    .line 538
    invoke-virtual {v8, v13, v14, v1, v2}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 539
    .line 540
    .line 541
    move-object/from16 v20, v8

    .line 542
    .line 543
    move/from16 v21, v10

    .line 544
    .line 545
    move/from16 v25, v11

    .line 546
    .line 547
    move/from16 v22, v12

    .line 548
    .line 549
    move v4, v13

    .line 550
    move v5, v14

    .line 551
    move-object/from16 v23, v15

    .line 552
    .line 553
    move v13, v1

    .line 554
    move v14, v2

    .line 555
    goto/16 :goto_d

    .line 556
    .line 557
    :cond_17
    instance-of v1, v15, Lgy1;

    .line 558
    .line 559
    if-eqz v1, :cond_18

    .line 560
    .line 561
    move-object v1, v15

    .line 562
    check-cast v1, Lgy1;

    .line 563
    .line 564
    iget v2, v1, Lgy1;->h:F

    .line 565
    .line 566
    add-float/2addr v2, v13

    .line 567
    iget v3, v1, Lgy1;->i:F

    .line 568
    .line 569
    add-float/2addr v3, v14

    .line 570
    float-to-double v4, v13

    .line 571
    move-wide v6, v4

    .line 572
    float-to-double v4, v14

    .line 573
    move-wide v13, v6

    .line 574
    float-to-double v6, v2

    .line 575
    move-object/from16 v16, v8

    .line 576
    .line 577
    float-to-double v8, v3

    .line 578
    iget v11, v1, Lgy1;->c:F

    .line 579
    .line 580
    move/from16 v20, v2

    .line 581
    .line 582
    move/from16 v21, v3

    .line 583
    .line 584
    float-to-double v2, v11

    .line 585
    iget v11, v1, Lgy1;->d:F

    .line 586
    .line 587
    move-wide/from16 v22, v2

    .line 588
    .line 589
    float-to-double v2, v11

    .line 590
    iget v11, v1, Lgy1;->e:F

    .line 591
    .line 592
    move-wide/from16 v24, v2

    .line 593
    .line 594
    float-to-double v2, v11

    .line 595
    iget-boolean v11, v1, Lgy1;->f:Z

    .line 596
    .line 597
    iget-boolean v1, v1, Lgy1;->g:Z

    .line 598
    .line 599
    move/from16 v17, v1

    .line 600
    .line 601
    move-object v0, v15

    .line 602
    move-object/from16 v1, p1

    .line 603
    .line 604
    move/from16 v28, v21

    .line 605
    .line 606
    move/from16 v21, v10

    .line 607
    .line 608
    move-object/from16 v29, v16

    .line 609
    .line 610
    move/from16 v16, v11

    .line 611
    .line 612
    move-wide/from16 v10, v22

    .line 613
    .line 614
    move/from16 v22, v12

    .line 615
    .line 616
    move/from16 v23, v20

    .line 617
    .line 618
    move-object/from16 v20, v29

    .line 619
    .line 620
    move-wide/from16 v29, v24

    .line 621
    .line 622
    move/from16 v24, v28

    .line 623
    .line 624
    const/16 v25, 0x0

    .line 625
    .line 626
    move-wide/from16 v31, v13

    .line 627
    .line 628
    move-wide v14, v2

    .line 629
    move-wide/from16 v2, v31

    .line 630
    .line 631
    move-wide/from16 v12, v29

    .line 632
    .line 633
    invoke-static/range {v1 .. v17}, Lpp0;->q(Ly9;DDDDDDDZZ)V

    .line 634
    .line 635
    .line 636
    move/from16 v4, v23

    .line 637
    .line 638
    move v13, v4

    .line 639
    move/from16 v5, v24

    .line 640
    .line 641
    move v14, v5

    .line 642
    move-object/from16 v23, v0

    .line 643
    .line 644
    goto :goto_d

    .line 645
    :cond_18
    move-object/from16 v20, v8

    .line 646
    .line 647
    move/from16 v21, v10

    .line 648
    .line 649
    move/from16 v25, v11

    .line 650
    .line 651
    move/from16 v22, v12

    .line 652
    .line 653
    move-object v0, v15

    .line 654
    instance-of v1, v0, Lxx1;

    .line 655
    .line 656
    if-eqz v1, :cond_19

    .line 657
    .line 658
    float-to-double v2, v13

    .line 659
    float-to-double v4, v14

    .line 660
    move-object v15, v0

    .line 661
    check-cast v15, Lxx1;

    .line 662
    .line 663
    iget v1, v15, Lxx1;->i:F

    .line 664
    .line 665
    iget v6, v15, Lxx1;->h:F

    .line 666
    .line 667
    move v8, v6

    .line 668
    float-to-double v6, v8

    .line 669
    move v10, v8

    .line 670
    float-to-double v8, v1

    .line 671
    iget v11, v15, Lxx1;->c:F

    .line 672
    .line 673
    float-to-double v11, v11

    .line 674
    iget v13, v15, Lxx1;->d:F

    .line 675
    .line 676
    float-to-double v13, v13

    .line 677
    move-object/from16 v23, v0

    .line 678
    .line 679
    iget v0, v15, Lxx1;->e:F

    .line 680
    .line 681
    move/from16 v16, v1

    .line 682
    .line 683
    float-to-double v0, v0

    .line 684
    move-wide/from16 v26, v0

    .line 685
    .line 686
    iget-boolean v0, v15, Lxx1;->f:Z

    .line 687
    .line 688
    iget-boolean v1, v15, Lxx1;->g:Z

    .line 689
    .line 690
    move/from16 v15, v16

    .line 691
    .line 692
    move/from16 v16, v0

    .line 693
    .line 694
    move v0, v15

    .line 695
    move/from16 v17, v1

    .line 696
    .line 697
    move/from16 v24, v10

    .line 698
    .line 699
    move-wide v10, v11

    .line 700
    move-wide v12, v13

    .line 701
    move-wide/from16 v14, v26

    .line 702
    .line 703
    move-object/from16 v1, p1

    .line 704
    .line 705
    invoke-static/range {v1 .. v17}, Lpp0;->q(Ly9;DDDDDDDZZ)V

    .line 706
    .line 707
    .line 708
    move v5, v0

    .line 709
    move v14, v5

    .line 710
    move/from16 v4, v24

    .line 711
    .line 712
    move v13, v4

    .line 713
    :goto_d
    add-int/lit8 v12, v22, 0x1

    .line 714
    .line 715
    move-object/from16 v0, p0

    .line 716
    .line 717
    move-object/from16 v1, p1

    .line 718
    .line 719
    move-object/from16 v3, v20

    .line 720
    .line 721
    move/from16 v10, v21

    .line 722
    .line 723
    move-object/from16 v2, v23

    .line 724
    .line 725
    move/from16 v11, v25

    .line 726
    .line 727
    goto/16 :goto_3

    .line 728
    .line 729
    :cond_19
    invoke-static {}, Lc80;->s()V

    .line 730
    .line 731
    .line 732
    :cond_1a
    return-void
.end method

.method public static I(I)Ljava/lang/String;
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [C

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v0, :cond_0

    .line 6
    .line 7
    rsub-int/lit8 v3, v2, 0x1

    .line 8
    .line 9
    and-int/lit8 v4, p0, 0xf

    .line 10
    .line 11
    const/16 v5, 0x10

    .line 12
    .line 13
    invoke-static {v4, v5}, Ljava/lang/Character;->forDigit(II)C

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    aput-char v4, v1, v3

    .line 18
    .line 19
    shr-int/lit8 p0, p0, 0x4

    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 25
    .line 26
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 27
    .line 28
    .line 29
    return-object p0
.end method

.method public static J(I)Ljava/lang/String;
    .locals 6

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v1, v0, [C

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v0, :cond_0

    .line 6
    .line 7
    rsub-int/lit8 v3, v2, 0x3

    .line 8
    .line 9
    and-int/lit8 v4, p0, 0xf

    .line 10
    .line 11
    const/16 v5, 0x10

    .line 12
    .line 13
    invoke-static {v4, v5}, Ljava/lang/Character;->forDigit(II)C

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    aput-char v4, v1, v3

    .line 18
    .line 19
    shr-int/2addr p0, v0

    .line 20
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 24
    .line 25
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 26
    .line 27
    .line 28
    return-object p0
.end method

.method public static K(I)Ljava/lang/String;
    .locals 6

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v1, v0, [C

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :goto_0
    if-ge v2, v0, :cond_0

    .line 7
    .line 8
    rsub-int/lit8 v3, v2, 0x7

    .line 9
    .line 10
    and-int/lit8 v4, p0, 0xf

    .line 11
    .line 12
    const/16 v5, 0x10

    .line 13
    .line 14
    invoke-static {v4, v5}, Ljava/lang/Character;->forDigit(II)C

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    aput-char v4, v1, v3

    .line 19
    .line 20
    shr-int/lit8 p0, p0, 0x4

    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 26
    .line 27
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 28
    .line 29
    .line 30
    return-object p0
.end method

.method public static L(J)Ljava/lang/String;
    .locals 5

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v1, v0, [C

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :goto_0
    if-ge v2, v0, :cond_0

    .line 7
    .line 8
    rsub-int/lit8 v3, v2, 0xf

    .line 9
    .line 10
    long-to-int v4, p0

    .line 11
    and-int/lit8 v4, v4, 0xf

    .line 12
    .line 13
    invoke-static {v4, v0}, Ljava/lang/Character;->forDigit(II)C

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    aput-char v4, v1, v3

    .line 18
    .line 19
    const/4 v3, 0x4

    .line 20
    shr-long/2addr p0, v3

    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 25
    .line 26
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 27
    .line 28
    .line 29
    return-object p0
.end method

.method public static M(I)I
    .locals 1

    .line 1
    shr-int/lit8 p0, p0, 0x7

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    :goto_0
    if-eqz p0, :cond_0

    .line 5
    .line 6
    shr-int/lit8 p0, p0, 0x7

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    return v0
.end method

.method public static final N(I)I
    .locals 3

    .line 1
    const v0, 0x12492492

    .line 2
    .line 3
    .line 4
    and-int/2addr v0, p0

    .line 5
    const v1, 0x24924924

    .line 6
    .line 7
    .line 8
    and-int/2addr v1, p0

    .line 9
    const v2, -0x36db6db7

    .line 10
    .line 11
    .line 12
    and-int/2addr p0, v2

    .line 13
    shr-int/lit8 v2, v1, 0x1

    .line 14
    .line 15
    or-int/2addr v2, v0

    .line 16
    or-int/2addr p0, v2

    .line 17
    shl-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    and-int/2addr v0, v1

    .line 20
    or-int/2addr p0, v0

    .line 21
    return p0
.end method

.method public static final a(Lin0;Luh1;Lin0;Lpx;I)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v8, p2

    .line 6
    .line 7
    move/from16 v9, p4

    .line 8
    .line 9
    sget-object v10, Lv6;->v:Lv6;

    .line 10
    .line 11
    move-object/from16 v11, p3

    .line 12
    .line 13
    check-cast v11, Lgo0;

    .line 14
    .line 15
    const v0, -0xabaf393

    .line 16
    .line 17
    .line 18
    invoke-virtual {v11, v0}, Lgo0;->X(I)Lgo0;

    .line 19
    .line 20
    .line 21
    and-int/lit8 v0, v9, 0x6

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v11, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const/4 v0, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v0, 0x2

    .line 34
    :goto_0
    or-int/2addr v0, v9

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v0, v9

    .line 37
    :goto_1
    and-int/lit8 v3, v9, 0x30

    .line 38
    .line 39
    if-nez v3, :cond_3

    .line 40
    .line 41
    invoke-virtual {v11, v7}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_2

    .line 46
    .line 47
    const/16 v3, 0x20

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v3, 0x10

    .line 51
    .line 52
    :goto_2
    or-int/2addr v0, v3

    .line 53
    :cond_3
    or-int/lit16 v0, v0, 0x180

    .line 54
    .line 55
    and-int/lit16 v3, v9, 0xc00

    .line 56
    .line 57
    if-nez v3, :cond_5

    .line 58
    .line 59
    invoke-virtual {v11, v10}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_4

    .line 64
    .line 65
    const/16 v3, 0x800

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    const/16 v3, 0x400

    .line 69
    .line 70
    :goto_3
    or-int/2addr v0, v3

    .line 71
    :cond_5
    and-int/lit16 v3, v9, 0x6000

    .line 72
    .line 73
    if-nez v3, :cond_7

    .line 74
    .line 75
    invoke-virtual {v11, v8}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eqz v3, :cond_6

    .line 80
    .line 81
    const/16 v3, 0x4000

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_6
    const/16 v3, 0x2000

    .line 85
    .line 86
    :goto_4
    or-int/2addr v0, v3

    .line 87
    :cond_7
    and-int/lit16 v3, v0, 0x2493

    .line 88
    .line 89
    const/16 v4, 0x2492

    .line 90
    .line 91
    if-eq v3, v4, :cond_8

    .line 92
    .line 93
    const/4 v3, 0x1

    .line 94
    goto :goto_5

    .line 95
    :cond_8
    const/4 v3, 0x0

    .line 96
    :goto_5
    and-int/lit8 v4, v0, 0x1

    .line 97
    .line 98
    invoke-virtual {v11, v4, v3}, Lgo0;->O(IZ)Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-eqz v3, :cond_f

    .line 103
    .line 104
    iget-wide v3, v11, Lgo0;->T:J

    .line 105
    .line 106
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 107
    .line 108
    .line 109
    move-result v14

    .line 110
    sget-object v3, Lqk0;->a:Lqk0;

    .line 111
    .line 112
    invoke-interface {v7, v3}, Luh1;->c(Luh1;)Luh1;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    sget-object v4, Lol0;->a:Lol0;

    .line 117
    .line 118
    invoke-interface {v3, v4}, Luh1;->c(Luh1;)Luh1;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    sget-object v4, Lql0;->a:Lql0;

    .line 123
    .line 124
    invoke-interface {v3, v4}, Luh1;->c(Luh1;)Luh1;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    sget-object v4, Lll0;->a:Lll0;

    .line 129
    .line 130
    invoke-interface {v3, v4}, Luh1;->c(Luh1;)Luh1;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-static {v11, v3}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 135
    .line 136
    .line 137
    move-result-object v15

    .line 138
    sget-object v3, Lly;->h:Ltu2;

    .line 139
    .line 140
    invoke-virtual {v11, v3}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    check-cast v3, Le70;

    .line 145
    .line 146
    sget-object v4, Lly;->n:Ltu2;

    .line 147
    .line 148
    invoke-virtual {v11, v4}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    check-cast v4, Ld61;

    .line 153
    .line 154
    invoke-virtual {v11}, Lgo0;->l()Lyy1;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    sget-object v6, Lzb1;->a:Ltu2;

    .line 159
    .line 160
    invoke-virtual {v11, v6}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    check-cast v6, Lia1;

    .line 165
    .line 166
    sget-object v12, Lfc1;->a:Le42;

    .line 167
    .line 168
    invoke-virtual {v11, v12}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v12

    .line 172
    check-cast v12, Ltc2;

    .line 173
    .line 174
    const v13, 0x4e5ddecf    # 9.305917E8f

    .line 175
    .line 176
    .line 177
    invoke-virtual {v11, v13}, Lgo0;->W(I)V

    .line 178
    .line 179
    .line 180
    and-int/lit8 v0, v0, 0xe

    .line 181
    .line 182
    move-object/from16 v16, v3

    .line 183
    .line 184
    iget-wide v2, v11, Lgo0;->T:J

    .line 185
    .line 186
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    sget-object v3, Lr7;->b:Ltu2;

    .line 191
    .line 192
    invoke-virtual {v11, v3}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    check-cast v3, Landroid/content/Context;

    .line 197
    .line 198
    invoke-static {v11}, Lrg3;->L(Lpx;)Leo0;

    .line 199
    .line 200
    .line 201
    move-result-object v13

    .line 202
    move/from16 v17, v0

    .line 203
    .line 204
    sget-object v0, Lhc2;->a:Ltu2;

    .line 205
    .line 206
    invoke-virtual {v11, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    check-cast v0, Lfc2;

    .line 211
    .line 212
    move-object/from16 v18, v4

    .line 213
    .line 214
    sget-object v4, Lr7;->f:Ltu2;

    .line 215
    .line 216
    invoke-virtual {v11, v4}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    check-cast v4, Landroid/view/View;

    .line 221
    .line 222
    invoke-virtual {v11, v3}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v19

    .line 226
    and-int/lit8 v20, v17, 0xe

    .line 227
    .line 228
    move-object/from16 v21, v3

    .line 229
    .line 230
    xor-int/lit8 v3, v20, 0x6

    .line 231
    .line 232
    move-object/from16 v20, v5

    .line 233
    .line 234
    const/4 v5, 0x4

    .line 235
    if-le v3, v5, :cond_9

    .line 236
    .line 237
    invoke-virtual {v11, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    if-nez v3, :cond_a

    .line 242
    .line 243
    :cond_9
    and-int/lit8 v3, v17, 0x6

    .line 244
    .line 245
    if-ne v3, v5, :cond_b

    .line 246
    .line 247
    :cond_a
    const/4 v3, 0x1

    .line 248
    goto :goto_6

    .line 249
    :cond_b
    const/4 v3, 0x0

    .line 250
    :goto_6
    or-int v3, v19, v3

    .line 251
    .line 252
    invoke-virtual {v11, v13}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v5

    .line 256
    or-int/2addr v3, v5

    .line 257
    invoke-virtual {v11, v0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    or-int/2addr v3, v5

    .line 262
    invoke-virtual {v11, v2}, Lgo0;->d(I)Z

    .line 263
    .line 264
    .line 265
    move-result v5

    .line 266
    or-int/2addr v3, v5

    .line 267
    invoke-virtual {v11, v4}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v5

    .line 271
    or-int/2addr v3, v5

    .line 272
    invoke-virtual {v11}, Lgo0;->L()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    if-nez v3, :cond_c

    .line 277
    .line 278
    sget-object v3, Lnx;->a:Leb;

    .line 279
    .line 280
    if-ne v5, v3, :cond_d

    .line 281
    .line 282
    :cond_c
    move-object v3, v6

    .line 283
    move-object v6, v4

    .line 284
    move-object v4, v0

    .line 285
    goto :goto_7

    .line 286
    :cond_d
    move-object/from16 v13, v16

    .line 287
    .line 288
    move-object/from16 v7, v18

    .line 289
    .line 290
    move-object/from16 v9, v20

    .line 291
    .line 292
    move/from16 v16, v14

    .line 293
    .line 294
    move-object v14, v6

    .line 295
    goto :goto_8

    .line 296
    :goto_7
    new-instance v0, Lmc;

    .line 297
    .line 298
    move v5, v14

    .line 299
    move-object v14, v3

    .line 300
    move-object v3, v13

    .line 301
    move-object/from16 v13, v16

    .line 302
    .line 303
    move/from16 v16, v5

    .line 304
    .line 305
    move v5, v2

    .line 306
    move-object/from16 v7, v18

    .line 307
    .line 308
    move-object/from16 v9, v20

    .line 309
    .line 310
    move-object v2, v1

    .line 311
    move-object/from16 v1, v21

    .line 312
    .line 313
    invoke-direct/range {v0 .. v6}, Lmc;-><init>(Landroid/content/Context;Lin0;Leo0;Lfc2;ILandroid/view/View;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v11, v0}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    move-object v5, v0

    .line 320
    :goto_8
    check-cast v5, Lxm0;

    .line 321
    .line 322
    const/16 v0, 0x7d

    .line 323
    .line 324
    const/4 v1, 0x0

    .line 325
    const/4 v2, 0x1

    .line 326
    invoke-virtual {v11, v0, v2, v1, v1}, Lgo0;->S(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    iput-boolean v2, v11, Lgo0;->r:Z

    .line 330
    .line 331
    iget-boolean v0, v11, Lgo0;->S:Z

    .line 332
    .line 333
    if-eqz v0, :cond_e

    .line 334
    .line 335
    invoke-virtual {v11, v5}, Lgo0;->k(Lxm0;)V

    .line 336
    .line 337
    .line 338
    goto :goto_9

    .line 339
    :cond_e
    invoke-virtual {v11}, Lgo0;->i0()V

    .line 340
    .line 341
    .line 342
    :goto_9
    sget-object v0, Lhx;->c:Lgx;

    .line 343
    .line 344
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    sget-object v0, Lgx;->d:Llc;

    .line 348
    .line 349
    invoke-static {v11, v0, v9}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    sget-object v0, Llc;->l:Llc;

    .line 353
    .line 354
    invoke-static {v11, v0, v15}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    sget-object v0, Llc;->m:Llc;

    .line 358
    .line 359
    invoke-static {v11, v0, v13}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    sget-object v0, Llc;->n:Llc;

    .line 363
    .line 364
    invoke-static {v11, v0, v14}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    sget-object v0, Llc;->o:Llc;

    .line 368
    .line 369
    invoke-static {v11, v0, v12}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    sget-object v0, Llc;->p:Llc;

    .line 373
    .line 374
    invoke-static {v11, v0, v7}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    sget-object v1, Lgx;->f:Llc;

    .line 382
    .line 383
    invoke-static {v11, v1, v0}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    sget-object v0, Llc;->j:Llc;

    .line 387
    .line 388
    invoke-static {v11, v0, v8}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    sget-object v0, Llc;->k:Llc;

    .line 392
    .line 393
    invoke-static {v11, v0, v10}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    const/4 v2, 0x1

    .line 397
    invoke-virtual {v11, v2}, Lgo0;->p(Z)V

    .line 398
    .line 399
    .line 400
    const/4 v0, 0x0

    .line 401
    invoke-virtual {v11, v0}, Lgo0;->p(Z)V

    .line 402
    .line 403
    .line 404
    goto :goto_a

    .line 405
    :cond_f
    invoke-virtual {v11}, Lgo0;->R()V

    .line 406
    .line 407
    .line 408
    :goto_a
    invoke-virtual {v11}, Lgo0;->r()Lb62;

    .line 409
    .line 410
    .line 411
    move-result-object v6

    .line 412
    if-eqz v6, :cond_10

    .line 413
    .line 414
    new-instance v0, Li8;

    .line 415
    .line 416
    const/4 v5, 0x1

    .line 417
    move-object/from16 v1, p0

    .line 418
    .line 419
    move-object/from16 v2, p1

    .line 420
    .line 421
    move/from16 v4, p4

    .line 422
    .line 423
    move-object v3, v8

    .line 424
    invoke-direct/range {v0 .. v5}, Li8;-><init>(Lun0;Ljava/lang/Object;Lun0;II)V

    .line 425
    .line 426
    .line 427
    iput-object v0, v6, Lb62;->d:Lmn0;

    .line 428
    .line 429
    :cond_10
    return-void
.end method

.method public static final b(Lin0;Luh1;Lin0;Lpx;II)V
    .locals 7

    .line 1
    sget-object v0, Lv6;->v:Lv6;

    .line 2
    .line 3
    check-cast p3, Lgo0;

    .line 4
    .line 5
    const v1, -0x6a521d79

    .line 6
    .line 7
    .line 8
    invoke-virtual {p3, v1}, Lgo0;->X(I)Lgo0;

    .line 9
    .line 10
    .line 11
    and-int/lit8 v1, p4, 0x30

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p3, p1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/16 v1, 0x20

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/16 v1, 0x10

    .line 25
    .line 26
    :goto_0
    or-int/2addr v1, p4

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v1, p4

    .line 29
    :goto_1
    and-int/lit8 v2, p5, 0x4

    .line 30
    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    or-int/lit16 v1, v1, 0x180

    .line 34
    .line 35
    goto :goto_3

    .line 36
    :cond_2
    invoke-virtual {p3, p2}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_3

    .line 41
    .line 42
    const/16 v3, 0x100

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_3
    const/16 v3, 0x80

    .line 46
    .line 47
    :goto_2
    or-int/2addr v1, v3

    .line 48
    :goto_3
    and-int/lit16 v3, v1, 0x93

    .line 49
    .line 50
    const/16 v4, 0x92

    .line 51
    .line 52
    if-eq v3, v4, :cond_4

    .line 53
    .line 54
    const/4 v3, 0x1

    .line 55
    goto :goto_4

    .line 56
    :cond_4
    const/4 v3, 0x0

    .line 57
    :goto_4
    and-int/lit8 v4, v1, 0x1

    .line 58
    .line 59
    invoke-virtual {p3, v4, v3}, Lgo0;->O(IZ)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_6

    .line 64
    .line 65
    if-eqz v2, :cond_5

    .line 66
    .line 67
    move-object p2, v0

    .line 68
    :cond_5
    and-int/lit8 v0, v1, 0x70

    .line 69
    .line 70
    const/16 v2, 0xc06

    .line 71
    .line 72
    or-int/2addr v0, v2

    .line 73
    const v2, 0xe000

    .line 74
    .line 75
    .line 76
    shl-int/lit8 v1, v1, 0x6

    .line 77
    .line 78
    and-int/2addr v1, v2

    .line 79
    or-int/2addr v0, v1

    .line 80
    invoke-static {p0, p1, p2, p3, v0}, Lpp0;->a(Lin0;Luh1;Lin0;Lpx;I)V

    .line 81
    .line 82
    .line 83
    :goto_5
    move-object v4, p2

    .line 84
    goto :goto_6

    .line 85
    :cond_6
    invoke-virtual {p3}, Lgo0;->R()V

    .line 86
    .line 87
    .line 88
    goto :goto_5

    .line 89
    :goto_6
    invoke-virtual {p3}, Lgo0;->r()Lb62;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    if-eqz p2, :cond_7

    .line 94
    .line 95
    new-instance v1, Lkc;

    .line 96
    .line 97
    move-object v2, p0

    .line 98
    move-object v3, p1

    .line 99
    move v5, p4

    .line 100
    move v6, p5

    .line 101
    invoke-direct/range {v1 .. v6}, Lkc;-><init>(Lin0;Luh1;Lin0;II)V

    .line 102
    .line 103
    .line 104
    iput-object v1, p2, Lb62;->d:Lmn0;

    .line 105
    .line 106
    :cond_7
    return-void
.end method

.method public static final c(ZLxm0;Lpx;II)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    move-object/from16 v7, p2

    .line 8
    .line 9
    check-cast v7, Lgo0;

    .line 10
    .line 11
    const v3, -0x158b58d6

    .line 12
    .line 13
    .line 14
    invoke-virtual {v7, v3}, Lgo0;->X(I)Lgo0;

    .line 15
    .line 16
    .line 17
    and-int/lit8 v3, v2, 0x1

    .line 18
    .line 19
    const/4 v4, 0x4

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    or-int/lit8 v5, v1, 0x6

    .line 23
    .line 24
    move v6, v5

    .line 25
    move/from16 v5, p0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    move/from16 v5, p0

    .line 29
    .line 30
    invoke-virtual {v7, v5}, Lgo0;->g(Z)Z

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    if-eqz v6, :cond_1

    .line 35
    .line 36
    move v6, v4

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v6, 0x2

    .line 39
    :goto_0
    or-int/2addr v6, v1

    .line 40
    :goto_1
    invoke-virtual {v7, v0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    const/16 v9, 0x20

    .line 45
    .line 46
    if-eqz v8, :cond_2

    .line 47
    .line 48
    move v8, v9

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v8, 0x10

    .line 51
    .line 52
    :goto_2
    or-int/2addr v6, v8

    .line 53
    and-int/lit8 v8, v6, 0x13

    .line 54
    .line 55
    const/16 v10, 0x12

    .line 56
    .line 57
    const/4 v11, 0x0

    .line 58
    if-eq v8, v10, :cond_3

    .line 59
    .line 60
    const/4 v8, 0x1

    .line 61
    goto :goto_3

    .line 62
    :cond_3
    move v8, v11

    .line 63
    :goto_3
    and-int/lit8 v10, v6, 0x1

    .line 64
    .line 65
    invoke-virtual {v7, v10, v8}, Lgo0;->O(IZ)Z

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    if-eqz v8, :cond_17

    .line 70
    .line 71
    if-eqz v3, :cond_4

    .line 72
    .line 73
    const/4 v10, 0x1

    .line 74
    goto :goto_4

    .line 75
    :cond_4
    move v10, v5

    .line 76
    :goto_4
    invoke-static {v7}, Lcc1;->a(Lpx;)Lgm1;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    if-nez v3, :cond_5

    .line 81
    .line 82
    const v3, 0x1fe7a4b1

    .line 83
    .line 84
    .line 85
    invoke-virtual {v7, v3}, Lgo0;->W(I)V

    .line 86
    .line 87
    .line 88
    invoke-static {v7}, Ldc1;->a(Lpx;)Lpt1;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    :goto_5
    invoke-virtual {v7, v11}, Lgo0;->p(Z)V

    .line 93
    .line 94
    .line 95
    goto :goto_6

    .line 96
    :cond_5
    const v5, 0x1fe7996e

    .line 97
    .line 98
    .line 99
    invoke-virtual {v7, v5}, Lgo0;->W(I)V

    .line 100
    .line 101
    .line 102
    goto :goto_5

    .line 103
    :goto_6
    if-eqz v3, :cond_16

    .line 104
    .line 105
    invoke-virtual {v7, v3}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    invoke-virtual {v7}, Lgo0;->L()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    sget-object v13, Lnx;->a:Leb;

    .line 114
    .line 115
    if-nez v5, :cond_6

    .line 116
    .line 117
    if-ne v8, v13, :cond_b

    .line 118
    .line 119
    :cond_6
    new-instance v8, Lgj;

    .line 120
    .line 121
    instance-of v5, v3, Lgm1;

    .line 122
    .line 123
    const/4 v14, 0x0

    .line 124
    if-eqz v5, :cond_7

    .line 125
    .line 126
    move-object v5, v3

    .line 127
    check-cast v5, Lgm1;

    .line 128
    .line 129
    goto :goto_7

    .line 130
    :cond_7
    move-object v5, v14

    .line 131
    :goto_7
    if-eqz v5, :cond_8

    .line 132
    .line 133
    invoke-interface {v5}, Lgm1;->getNavigationEventDispatcher()Lfm1;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    goto :goto_8

    .line 138
    :cond_8
    move-object v5, v14

    .line 139
    :goto_8
    instance-of v15, v3, Lpt1;

    .line 140
    .line 141
    if-eqz v15, :cond_9

    .line 142
    .line 143
    move-object v15, v3

    .line 144
    check-cast v15, Lpt1;

    .line 145
    .line 146
    goto :goto_9

    .line 147
    :cond_9
    move-object v15, v14

    .line 148
    :goto_9
    if-eqz v15, :cond_a

    .line 149
    .line 150
    invoke-interface {v15}, Lpt1;->getOnBackPressedDispatcher()Lot1;

    .line 151
    .line 152
    .line 153
    move-result-object v14

    .line 154
    :cond_a
    invoke-direct {v8, v5, v14}, Lgj;-><init>(Lfm1;Lot1;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v7, v8}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    :cond_b
    move-object v14, v8

    .line 161
    check-cast v14, Lgj;

    .line 162
    .line 163
    iget-wide v11, v7, Lgo0;->T:J

    .line 164
    .line 165
    invoke-virtual {v7, v14}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    invoke-virtual {v7, v11, v12}, Lgo0;->e(J)Z

    .line 170
    .line 171
    .line 172
    move-result v15

    .line 173
    or-int/2addr v5, v15

    .line 174
    invoke-virtual {v7}, Lgo0;->L()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v15

    .line 178
    if-nez v5, :cond_c

    .line 179
    .line 180
    if-ne v15, v13, :cond_d

    .line 181
    .line 182
    :cond_c
    new-instance v15, Lsw;

    .line 183
    .line 184
    new-instance v5, Lhj;

    .line 185
    .line 186
    invoke-direct {v5, v11, v12, v3}, Lhj;-><init>(JLjava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    invoke-direct {v15, v5}, Lv3;-><init>(Lt11;)V

    .line 190
    .line 191
    .line 192
    new-instance v3, Lc0;

    .line 193
    .line 194
    const/16 v5, 0x1d

    .line 195
    .line 196
    invoke-direct {v3, v5}, Lc0;-><init>(I)V

    .line 197
    .line 198
    .line 199
    iput-object v3, v15, Lsw;->j:Lxm0;

    .line 200
    .line 201
    invoke-virtual {v7, v15}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    :cond_d
    check-cast v15, Lsw;

    .line 205
    .line 206
    const v3, -0x22e316cc

    .line 207
    .line 208
    .line 209
    invoke-virtual {v7, v3}, Lgo0;->W(I)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v7, v15}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    and-int/lit8 v5, v6, 0x70

    .line 217
    .line 218
    if-ne v5, v9, :cond_e

    .line 219
    .line 220
    const/4 v5, 0x1

    .line 221
    goto :goto_a

    .line 222
    :cond_e
    const/4 v5, 0x0

    .line 223
    :goto_a
    or-int/2addr v3, v5

    .line 224
    invoke-virtual {v7}, Lgo0;->L()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    if-nez v3, :cond_f

    .line 229
    .line 230
    if-ne v5, v13, :cond_10

    .line 231
    .line 232
    :cond_f
    new-instance v5, Lr1;

    .line 233
    .line 234
    const/4 v3, 0x7

    .line 235
    invoke-direct {v5, v3, v15, v0}, Lr1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v7, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    :cond_10
    check-cast v5, Lxm0;

    .line 242
    .line 243
    invoke-static {v5, v7}, Leu;->r(Lxm0;Lpx;)V

    .line 244
    .line 245
    .line 246
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    invoke-virtual {v7, v15}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    and-int/lit8 v6, v6, 0xe

    .line 255
    .line 256
    if-ne v6, v4, :cond_11

    .line 257
    .line 258
    const/4 v12, 0x1

    .line 259
    goto :goto_b

    .line 260
    :cond_11
    const/4 v12, 0x0

    .line 261
    :goto_b
    or-int v4, v5, v12

    .line 262
    .line 263
    invoke-virtual {v7}, Lgo0;->L()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    if-nez v4, :cond_12

    .line 268
    .line 269
    if-ne v5, v13, :cond_13

    .line 270
    .line 271
    :cond_12
    new-instance v5, Lij;

    .line 272
    .line 273
    const/4 v4, 0x0

    .line 274
    invoke-direct {v5, v15, v10, v4}, Lij;-><init>(Lv3;ZI)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v7, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    :cond_13
    check-cast v5, Lin0;

    .line 281
    .line 282
    move v8, v6

    .line 283
    move-object v6, v5

    .line 284
    const/4 v5, 0x0

    .line 285
    move-object v4, v15

    .line 286
    invoke-static/range {v3 .. v8}, Leu;->h(Ljava/lang/Boolean;Ljava/lang/Object;Lia1;Lin0;Lpx;I)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v7, v14}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v3

    .line 293
    invoke-virtual {v7, v4}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result v5

    .line 297
    or-int/2addr v3, v5

    .line 298
    invoke-virtual {v7}, Lgo0;->L()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v5

    .line 302
    if-nez v3, :cond_14

    .line 303
    .line 304
    if-ne v5, v13, :cond_15

    .line 305
    .line 306
    :cond_14
    new-instance v5, Ld2;

    .line 307
    .line 308
    const/4 v3, 0x5

    .line 309
    invoke-direct {v5, v3, v14, v4}, Ld2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v7, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    :cond_15
    check-cast v5, Lin0;

    .line 316
    .line 317
    invoke-static {v14, v4, v5, v7}, Leu;->d(Ljava/lang/Object;Ljava/lang/Object;Lin0;Lpx;)V

    .line 318
    .line 319
    .line 320
    const/4 v4, 0x0

    .line 321
    invoke-virtual {v7, v4}, Lgo0;->p(Z)V

    .line 322
    .line 323
    .line 324
    move v5, v10

    .line 325
    goto :goto_c

    .line 326
    :cond_16
    const-string v0, "No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two."

    .line 327
    .line 328
    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    return-void

    .line 332
    :cond_17
    invoke-virtual {v7}, Lgo0;->R()V

    .line 333
    .line 334
    .line 335
    :goto_c
    invoke-virtual {v7}, Lgo0;->r()Lb62;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    if-eqz v3, :cond_18

    .line 340
    .line 341
    new-instance v4, Ljj;

    .line 342
    .line 343
    invoke-direct {v4, v5, v0, v1, v2}, Ljj;-><init>(ZLxm0;II)V

    .line 344
    .line 345
    .line 346
    iput-object v4, v3, Lb62;->d:Lmn0;

    .line 347
    .line 348
    :cond_18
    return-void
.end method

.method public static final d(Lkw;Lpx;I)V
    .locals 8

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, Lgo0;

    .line 3
    .line 4
    const p1, -0x1de667f9

    .line 5
    .line 6
    .line 7
    invoke-virtual {v4, p1}, Lgo0;->X(I)Lgo0;

    .line 8
    .line 9
    .line 10
    or-int/lit8 p1, p2, 0x6

    .line 11
    .line 12
    and-int/lit8 v0, p1, 0x13

    .line 13
    .line 14
    const/16 v1, 0x12

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x1

    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    move v0, v3

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v0, v2

    .line 23
    :goto_0
    and-int/2addr p1, v3

    .line 24
    invoke-virtual {v4, p1, v0}, Lgo0;->O(IZ)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_8

    .line 29
    .line 30
    const p1, -0x7f9b7946

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4, p1}, Lgo0;->W(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4}, Lgo0;->L()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    sget-object v1, Lnx;->a:Leb;

    .line 41
    .line 42
    if-ne p1, v1, :cond_3

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    :try_start_0
    sget-object v0, Lpp1;->a:Lpp1;

    .line 46
    .line 47
    invoke-static {}, Lpp1;->c()Lop1;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v5, "ui_config"

    .line 52
    .line 53
    sget-object v6, Lc73;->Companion:Lx63;

    .line 54
    .line 55
    invoke-virtual {v6}, Lx63;->serializer()Lw41;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-static {v6}, Lse;->D(Lw41;)Lw41;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    invoke-virtual {v0, v6, p1, v5}, Lop1;->b(Lw41;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Lc73;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :catchall_0
    move-exception v0

    .line 71
    new-instance v5, Lx92;

    .line 72
    .line 73
    invoke-direct {v5, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    move-object v0, v5

    .line 77
    :goto_1
    nop

    .line 78
    instance-of v5, v0, Lx92;

    .line 79
    .line 80
    if-eqz v5, :cond_1

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_1
    move-object p1, v0

    .line 84
    :goto_2
    check-cast p1, Lc73;

    .line 85
    .line 86
    if-nez p1, :cond_2

    .line 87
    .line 88
    new-instance p1, Lc73;

    .line 89
    .line 90
    invoke-direct {p1}, Lc73;-><init>()V

    .line 91
    .line 92
    .line 93
    :cond_2
    invoke-virtual {v4, p1}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_3
    check-cast p1, Lc73;

    .line 97
    .line 98
    invoke-virtual {v4, v2}, Lgo0;->p(Z)V

    .line 99
    .line 100
    .line 101
    invoke-static {v4}, Lop0;->s(Lpx;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    iget v5, p1, Lc73;->a:I

    .line 109
    .line 110
    if-eq v5, v3, :cond_5

    .line 111
    .line 112
    const/4 v2, 0x2

    .line 113
    if-eq v5, v2, :cond_4

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_4
    move v0, v3

    .line 117
    goto :goto_3

    .line 118
    :cond_5
    move v0, v2

    .line 119
    :goto_3
    iget-object v2, p1, Lc73;->d:Lb73;

    .line 120
    .line 121
    invoke-virtual {v4, v0}, Lgo0;->g(Z)Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    invoke-virtual {v4, v2}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    or-int/2addr v3, v5

    .line 130
    invoke-virtual {v4}, Lgo0;->L()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    if-nez v3, :cond_6

    .line 135
    .line 136
    if-ne v5, v1, :cond_7

    .line 137
    .line 138
    :cond_6
    invoke-static {v2, v0}, Lp7;->L(Lb73;Z)Llp1;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-virtual {v4, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    :cond_7
    check-cast v5, Llp1;

    .line 146
    .line 147
    iget-wide v1, v5, Llp1;->g:J

    .line 148
    .line 149
    move-wide v6, v1

    .line 150
    new-instance v2, Lju;

    .line 151
    .line 152
    invoke-direct {v2, v6, v7}, Lju;-><init>(J)V

    .line 153
    .line 154
    .line 155
    new-instance v1, Ltt0;

    .line 156
    .line 157
    const/4 v3, 0x4

    .line 158
    invoke-direct {v1, v5, p1, p0, v3}, Ltt0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 159
    .line 160
    .line 161
    const p1, 0x4dc7d709    # 4.1909482E8f

    .line 162
    .line 163
    .line 164
    invoke-static {p1, v1, v4}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    const/16 v5, 0xc30

    .line 169
    .line 170
    const/4 v1, 0x0

    .line 171
    invoke-static/range {v0 .. v5}, Lz13;->a(ZZLju;Lkw;Lpx;I)V

    .line 172
    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_8
    invoke-virtual {v4}, Lgo0;->R()V

    .line 176
    .line 177
    .line 178
    :goto_4
    invoke-virtual {v4}, Lgo0;->r()Lb62;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    if-eqz p1, :cond_9

    .line 183
    .line 184
    new-instance v0, Lo0;

    .line 185
    .line 186
    const/4 v1, 0x3

    .line 187
    invoke-direct {v0, p0, p2, v1}, Lo0;-><init>(Lkw;II)V

    .line 188
    .line 189
    .line 190
    iput-object v0, p1, Lb62;->d:Lmn0;

    .line 191
    .line 192
    :cond_9
    return-void
.end method

.method public static final e(Lci1;Lxm0;Lin0;Lpx;I)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v4, p4

    .line 4
    .line 5
    iget v0, v1, Lci1;->a:I

    .line 6
    .line 7
    move-object/from16 v12, p3

    .line 8
    .line 9
    check-cast v12, Lgo0;

    .line 10
    .line 11
    const v2, 0x38bef399

    .line 12
    .line 13
    .line 14
    invoke-virtual {v12, v2}, Lgo0;->X(I)Lgo0;

    .line 15
    .line 16
    .line 17
    and-int/lit8 v2, v4, 0x6

    .line 18
    .line 19
    const/4 v3, 0x4

    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v12, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    move v2, v3

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v2, 0x2

    .line 31
    :goto_0
    or-int/2addr v2, v4

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v2, v4

    .line 34
    :goto_1
    and-int/lit8 v5, v4, 0x30

    .line 35
    .line 36
    move-object/from16 v14, p1

    .line 37
    .line 38
    if-nez v5, :cond_3

    .line 39
    .line 40
    invoke-virtual {v12, v14}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-eqz v5, :cond_2

    .line 45
    .line 46
    const/16 v5, 0x20

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v5, 0x10

    .line 50
    .line 51
    :goto_2
    or-int/2addr v2, v5

    .line 52
    :cond_3
    and-int/lit16 v5, v4, 0x180

    .line 53
    .line 54
    move-object/from16 v15, p2

    .line 55
    .line 56
    if-nez v5, :cond_5

    .line 57
    .line 58
    invoke-virtual {v12, v15}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_4

    .line 63
    .line 64
    const/16 v5, 0x100

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_4
    const/16 v5, 0x80

    .line 68
    .line 69
    :goto_3
    or-int/2addr v2, v5

    .line 70
    :cond_5
    and-int/lit16 v5, v2, 0x93

    .line 71
    .line 72
    const/16 v6, 0x92

    .line 73
    .line 74
    const/4 v7, 0x0

    .line 75
    const/4 v8, 0x1

    .line 76
    if-eq v5, v6, :cond_6

    .line 77
    .line 78
    move v5, v8

    .line 79
    goto :goto_4

    .line 80
    :cond_6
    move v5, v7

    .line 81
    :goto_4
    and-int/lit8 v6, v2, 0x1

    .line 82
    .line 83
    invoke-virtual {v12, v6, v5}, Lgo0;->O(IZ)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_12

    .line 88
    .line 89
    const/4 v5, -0x1

    .line 90
    if-ne v0, v5, :cond_7

    .line 91
    .line 92
    move v5, v8

    .line 93
    goto :goto_5

    .line 94
    :cond_7
    move v5, v7

    .line 95
    :goto_5
    and-int/lit8 v6, v2, 0xe

    .line 96
    .line 97
    if-ne v6, v3, :cond_8

    .line 98
    .line 99
    move v9, v8

    .line 100
    goto :goto_6

    .line 101
    :cond_8
    move v9, v7

    .line 102
    :goto_6
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v10

    .line 106
    sget-object v11, Lnx;->a:Leb;

    .line 107
    .line 108
    if-nez v9, :cond_9

    .line 109
    .line 110
    if-ne v10, v11, :cond_a

    .line 111
    .line 112
    :cond_9
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    invoke-static {v9}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 117
    .line 118
    .line 119
    move-result-object v10

    .line 120
    invoke-virtual {v12, v10}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    :cond_a
    move-object/from16 v16, v10

    .line 124
    .line 125
    check-cast v16, Lxk1;

    .line 126
    .line 127
    if-ne v6, v3, :cond_b

    .line 128
    .line 129
    move v3, v8

    .line 130
    goto :goto_7

    .line 131
    :cond_b
    move v3, v7

    .line 132
    :goto_7
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    if-nez v3, :cond_c

    .line 137
    .line 138
    if-ne v6, v11, :cond_f

    .line 139
    .line 140
    :cond_c
    if-eqz v5, :cond_d

    .line 141
    .line 142
    const-string v0, "10000"

    .line 143
    .line 144
    goto :goto_8

    .line 145
    :cond_d
    if-gez v0, :cond_e

    .line 146
    .line 147
    move v0, v7

    .line 148
    :cond_e
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    :goto_8
    invoke-static {v0}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    invoke-virtual {v12, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    :cond_f
    check-cast v6, Lxk1;

    .line 160
    .line 161
    invoke-interface {v6}, Lgu2;->getValue()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    check-cast v0, Ljava/lang/String;

    .line 166
    .line 167
    invoke-static {v0}, Lwv2;->e0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 168
    .line 169
    .line 170
    move-result-object v17

    .line 171
    invoke-interface/range {v16 .. v16}, Lgu2;->getValue()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    check-cast v0, Ljava/lang/Boolean;

    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-nez v0, :cond_11

    .line 182
    .line 183
    if-eqz v17, :cond_10

    .line 184
    .line 185
    goto :goto_9

    .line 186
    :cond_10
    move/from16 v18, v7

    .line 187
    .line 188
    goto :goto_a

    .line 189
    :cond_11
    :goto_9
    move/from16 v18, v8

    .line 190
    .line 191
    :goto_a
    const v0, 0x790b01c3

    .line 192
    .line 193
    .line 194
    invoke-static {v0, v12}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    new-instance v13, Lfe;

    .line 199
    .line 200
    const/16 v19, 0x1

    .line 201
    .line 202
    invoke-direct/range {v13 .. v19}, Lfe;-><init>(Lxm0;Lin0;Lxk1;Ljava/lang/Object;ZI)V

    .line 203
    .line 204
    .line 205
    move-object/from16 v10, v16

    .line 206
    .line 207
    move-object/from16 v0, v17

    .line 208
    .line 209
    const v3, 0x27a7011c

    .line 210
    .line 211
    .line 212
    invoke-static {v3, v13, v12}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    new-instance v5, Ltr;

    .line 217
    .line 218
    invoke-direct {v5, v10, v6, v0}, Ltr;-><init>(Lxk1;Lxk1;Ljava/lang/Integer;)V

    .line 219
    .line 220
    .line 221
    const v0, 0x74655ac5

    .line 222
    .line 223
    .line 224
    invoke-static {v0, v5, v12}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 225
    .line 226
    .line 227
    move-result-object v11

    .line 228
    and-int/lit8 v0, v2, 0x70

    .line 229
    .line 230
    const v2, 0x1b0006

    .line 231
    .line 232
    .line 233
    or-int v13, v0, v2

    .line 234
    .line 235
    const/16 v14, 0x14

    .line 236
    .line 237
    const/4 v5, 0x1

    .line 238
    const/4 v7, 0x0

    .line 239
    const/4 v9, 0x0

    .line 240
    move-object/from16 v6, p1

    .line 241
    .line 242
    move-object v10, v3

    .line 243
    invoke-static/range {v5 .. v14}, Lqp0;->d(ZLxm0;Luh1;Ljava/lang/String;Ln80;Lnn0;Lkw;Lpx;II)V

    .line 244
    .line 245
    .line 246
    goto :goto_b

    .line 247
    :cond_12
    invoke-virtual {v12}, Lgo0;->R()V

    .line 248
    .line 249
    .line 250
    :goto_b
    invoke-virtual {v12}, Lgo0;->r()Lb62;

    .line 251
    .line 252
    .line 253
    move-result-object v6

    .line 254
    if-eqz v6, :cond_13

    .line 255
    .line 256
    new-instance v0, Lva;

    .line 257
    .line 258
    const/16 v5, 0xb

    .line 259
    .line 260
    move-object/from16 v2, p1

    .line 261
    .line 262
    move-object/from16 v3, p2

    .line 263
    .line 264
    invoke-direct/range {v0 .. v5}, Lva;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lun0;II)V

    .line 265
    .line 266
    .line 267
    iput-object v0, v6, Lb62;->d:Lmn0;

    .line 268
    .line 269
    :cond_13
    return-void
.end method

.method public static final f(Ljava/lang/Object;)Lju2;
    .locals 1

    .line 1
    new-instance v0, Lju2;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lup0;->e:Lhh1;

    .line 6
    .line 7
    :cond_0
    invoke-direct {v0, p0}, Lju2;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static final g(Lep1;Luh1;Lkw;Lkw;Lpx;I)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v0, Lzo1;->b:Lzo1;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v2, v1, Lep1;->h:Lnx1;

    .line 9
    .line 10
    move-object/from16 v8, p4

    .line 11
    .line 12
    check-cast v8, Lgo0;

    .line 13
    .line 14
    const v3, 0x6acfd8ce

    .line 15
    .line 16
    .line 17
    invoke-virtual {v8, v3}, Lgo0;->X(I)Lgo0;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v8, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    const/4 v3, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v3, 0x2

    .line 29
    :goto_0
    or-int v3, p5, v3

    .line 30
    .line 31
    or-int/lit8 v3, v3, 0x30

    .line 32
    .line 33
    and-int/lit16 v5, v3, 0x493

    .line 34
    .line 35
    const/16 v6, 0x492

    .line 36
    .line 37
    const/4 v11, 0x0

    .line 38
    if-eq v5, v6, :cond_1

    .line 39
    .line 40
    const/4 v5, 0x1

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move v5, v11

    .line 43
    :goto_1
    and-int/lit8 v6, v3, 0x1

    .line 44
    .line 45
    invoke-virtual {v8, v6, v5}, Lgo0;->O(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_e

    .line 50
    .line 51
    invoke-virtual {v8}, Lgo0;->L()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    const-wide/16 v6, 0x0

    .line 56
    .line 57
    sget-object v9, Lnx;->a:Leb;

    .line 58
    .line 59
    if-ne v5, v9, :cond_2

    .line 60
    .line 61
    new-instance v5, Lrs1;

    .line 62
    .line 63
    invoke-direct {v5, v6, v7}, Lrs1;-><init>(J)V

    .line 64
    .line 65
    .line 66
    invoke-static {v5}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-virtual {v8, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    check-cast v5, Lxk1;

    .line 74
    .line 75
    sget-object v12, Lte;->g:Lyi0;

    .line 76
    .line 77
    invoke-virtual {v8}, Lgo0;->L()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v13

    .line 81
    if-ne v13, v9, :cond_3

    .line 82
    .line 83
    new-instance v13, Lpr;

    .line 84
    .line 85
    const/16 v14, 0xd

    .line 86
    .line 87
    invoke-direct {v13, v5, v14}, Lpr;-><init>(Lxk1;I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v8, v13}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_3
    check-cast v13, Lin0;

    .line 94
    .line 95
    invoke-static {v12, v13}, Lt11;->E(Luh1;Lin0;)Luh1;

    .line 96
    .line 97
    .line 98
    move-result-object v12

    .line 99
    sget-object v13, Lsn;->j:Lrk;

    .line 100
    .line 101
    invoke-static {v13, v11}, Ldm;->d(Lr5;Z)Lnf1;

    .line 102
    .line 103
    .line 104
    move-result-object v14

    .line 105
    move-object/from16 p1, v5

    .line 106
    .line 107
    iget-wide v4, v8, Lgo0;->T:J

    .line 108
    .line 109
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    invoke-virtual {v8}, Lgo0;->l()Lyy1;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-static {v8, v12}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 118
    .line 119
    .line 120
    move-result-object v12

    .line 121
    sget-object v15, Lhx;->c:Lgx;

    .line 122
    .line 123
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    sget-object v15, Lgx;->b:Ljy;

    .line 127
    .line 128
    invoke-virtual {v8}, Lgo0;->Z()V

    .line 129
    .line 130
    .line 131
    iget-boolean v6, v8, Lgo0;->S:Z

    .line 132
    .line 133
    if-eqz v6, :cond_4

    .line 134
    .line 135
    invoke-virtual {v8, v15}, Lgo0;->k(Lxm0;)V

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_4
    invoke-virtual {v8}, Lgo0;->i0()V

    .line 140
    .line 141
    .line 142
    :goto_2
    sget-object v6, Lgx;->e:Llc;

    .line 143
    .line 144
    invoke-static {v8, v6, v14}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    sget-object v7, Lgx;->d:Llc;

    .line 148
    .line 149
    invoke-static {v8, v7, v5}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    sget-object v5, Lgx;->f:Llc;

    .line 157
    .line 158
    invoke-static {v8, v5, v4}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    sget-object v4, Lgx;->g:Lv6;

    .line 162
    .line 163
    invoke-static {v8, v4}, Lyf3;->b(Lpx;Lin0;)V

    .line 164
    .line 165
    .line 166
    sget-object v14, Lgx;->c:Llc;

    .line 167
    .line 168
    invoke-static {v8, v14, v12}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    invoke-static {}, Lhm;->a()Luh1;

    .line 172
    .line 173
    .line 174
    move-result-object v12

    .line 175
    invoke-virtual {v1}, Lep1;->c()Z

    .line 176
    .line 177
    .line 178
    move-result v16

    .line 179
    sget-object v17, Lrh1;->a:Lrh1;

    .line 180
    .line 181
    if-eqz v16, :cond_6

    .line 182
    .line 183
    const v10, 0x60dfe729

    .line 184
    .line 185
    .line 186
    invoke-virtual {v8, v10}, Lgo0;->W(I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v8}, Lgo0;->L()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v10

    .line 193
    if-ne v10, v9, :cond_5

    .line 194
    .line 195
    new-instance v10, Lvi1;

    .line 196
    .line 197
    const/16 v11, 0x13

    .line 198
    .line 199
    invoke-direct {v10, v11}, Lvi1;-><init>(I)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v8, v10}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    :cond_5
    check-cast v10, Lin0;

    .line 206
    .line 207
    sget-object v11, Lnn2;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 208
    .line 209
    new-instance v11, Lht;

    .line 210
    .line 211
    invoke-direct {v11, v10}, Lht;-><init>(Lin0;)V

    .line 212
    .line 213
    .line 214
    const/4 v10, 0x0

    .line 215
    invoke-virtual {v8, v10}, Lgo0;->p(Z)V

    .line 216
    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_6
    move v10, v11

    .line 220
    const v11, 0x60e13542

    .line 221
    .line 222
    .line 223
    invoke-virtual {v8, v11}, Lgo0;->W(I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v8, v10}, Lgo0;->p(Z)V

    .line 227
    .line 228
    .line 229
    move-object/from16 v11, v17

    .line 230
    .line 231
    :goto_3
    invoke-interface {v12, v11}, Luh1;->c(Luh1;)Luh1;

    .line 232
    .line 233
    .line 234
    move-result-object v11

    .line 235
    invoke-static {v13, v10}, Ldm;->d(Lr5;Z)Lnf1;

    .line 236
    .line 237
    .line 238
    move-result-object v12

    .line 239
    move-object v10, v2

    .line 240
    move v13, v3

    .line 241
    iget-wide v2, v8, Lgo0;->T:J

    .line 242
    .line 243
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    invoke-virtual {v8}, Lgo0;->l()Lyy1;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    invoke-static {v8, v11}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 252
    .line 253
    .line 254
    move-result-object v11

    .line 255
    invoke-virtual {v8}, Lgo0;->Z()V

    .line 256
    .line 257
    .line 258
    move-object/from16 v18, v10

    .line 259
    .line 260
    iget-boolean v10, v8, Lgo0;->S:Z

    .line 261
    .line 262
    if-eqz v10, :cond_7

    .line 263
    .line 264
    invoke-virtual {v8, v15}, Lgo0;->k(Lxm0;)V

    .line 265
    .line 266
    .line 267
    goto :goto_4

    .line 268
    :cond_7
    invoke-virtual {v8}, Lgo0;->i0()V

    .line 269
    .line 270
    .line 271
    :goto_4
    invoke-static {v8, v6, v12}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    invoke-static {v8, v7, v3}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    invoke-static {v2, v8, v5, v8, v4}, Lvi0;->q(ILgo0;Llc;Lgo0;Lv6;)V

    .line 278
    .line 279
    .line 280
    invoke-static {v8, v14, v11}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    const/16 v2, 0x36

    .line 284
    .line 285
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    sget-object v3, Lhm;->a:Lhm;

    .line 290
    .line 291
    move-object/from16 v10, p2

    .line 292
    .line 293
    invoke-virtual {v10, v3, v8, v2}, Lkw;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    const/4 v2, 0x1

    .line 297
    invoke-virtual {v8, v2}, Lgo0;->p(Z)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v1}, Lep1;->c()Z

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    sget-object v11, La83;->a:La83;

    .line 305
    .line 306
    if-eqz v2, :cond_c

    .line 307
    .line 308
    const v2, 0x60e3ee46

    .line 309
    .line 310
    .line 311
    invoke-virtual {v8, v2}, Lgo0;->W(I)V

    .line 312
    .line 313
    .line 314
    invoke-static {}, Lhm;->a()Luh1;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    invoke-static {v2, v11, v0}, Lvw2;->a(Luh1;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Luh1;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    const/4 v3, 0x0

    .line 323
    invoke-static {v2, v8, v3}, Ldm;->a(Luh1;Lpx;I)V

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v18 .. v18}, Lnx1;->getValue()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    check-cast v2, Lrs1;

    .line 331
    .line 332
    iget-wide v2, v2, Lrs1;->a:J

    .line 333
    .line 334
    const-wide/16 v4, 0x0

    .line 335
    .line 336
    invoke-static {v2, v3, v4, v5}, Lrs1;->b(JJ)Z

    .line 337
    .line 338
    .line 339
    move-result v2

    .line 340
    if-eqz v2, :cond_8

    .line 341
    .line 342
    goto :goto_5

    .line 343
    :cond_8
    invoke-virtual/range {v18 .. v18}, Lnx1;->getValue()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    check-cast v2, Lrs1;

    .line 348
    .line 349
    iget-wide v2, v2, Lrs1;->a:J

    .line 350
    .line 351
    invoke-interface/range {p1 .. p1}, Lgu2;->getValue()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v4

    .line 355
    check-cast v4, Lrs1;

    .line 356
    .line 357
    iget-wide v4, v4, Lrs1;->a:J

    .line 358
    .line 359
    invoke-static {v2, v3, v4, v5}, Lrs1;->d(JJ)J

    .line 360
    .line 361
    .line 362
    move-result-wide v6

    .line 363
    move-wide v4, v6

    .line 364
    :goto_5
    and-int/lit8 v2, v13, 0xe

    .line 365
    .line 366
    const/4 v3, 0x4

    .line 367
    if-ne v2, v3, :cond_9

    .line 368
    .line 369
    const/4 v2, 0x1

    .line 370
    goto :goto_6

    .line 371
    :cond_9
    const/4 v2, 0x0

    .line 372
    :goto_6
    invoke-virtual {v8}, Lgo0;->L()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v3

    .line 376
    if-nez v2, :cond_a

    .line 377
    .line 378
    if-ne v3, v9, :cond_b

    .line 379
    .line 380
    :cond_a
    new-instance v3, Lta;

    .line 381
    .line 382
    const/16 v2, 0x10

    .line 383
    .line 384
    invoke-direct {v3, v2, v1}, Lta;-><init>(ILjava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v8, v3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    :cond_b
    check-cast v3, Lxm0;

    .line 391
    .line 392
    invoke-static {}, Lhm;->a()Luh1;

    .line 393
    .line 394
    .line 395
    move-result-object v6

    .line 396
    const/16 v9, 0xc00

    .line 397
    .line 398
    move-object/from16 v7, p3

    .line 399
    .line 400
    invoke-static/range {v3 .. v9}, Lpp0;->h(Lxm0;JLuh1;Lkw;Lpx;I)V

    .line 401
    .line 402
    .line 403
    const/4 v3, 0x0

    .line 404
    invoke-virtual {v8, v3}, Lgo0;->p(Z)V

    .line 405
    .line 406
    .line 407
    goto :goto_7

    .line 408
    :cond_c
    const/4 v3, 0x0

    .line 409
    const v2, 0x60ecab9a

    .line 410
    .line 411
    .line 412
    invoke-virtual {v8, v2}, Lgo0;->W(I)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v8, v3}, Lgo0;->p(Z)V

    .line 416
    .line 417
    .line 418
    :goto_7
    iget-object v2, v1, Lep1;->k:Lnx1;

    .line 419
    .line 420
    invoke-virtual {v2}, Lnx1;->getValue()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    check-cast v2, Ljava/lang/Boolean;

    .line 425
    .line 426
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 427
    .line 428
    .line 429
    move-result v2

    .line 430
    if-eqz v2, :cond_d

    .line 431
    .line 432
    const v2, 0x60ed4a3c

    .line 433
    .line 434
    .line 435
    invoke-virtual {v8, v2}, Lgo0;->W(I)V

    .line 436
    .line 437
    .line 438
    invoke-static {}, Lhm;->a()Luh1;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    invoke-static {v2, v11, v0}, Lvw2;->a(Luh1;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Luh1;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    invoke-static {v0, v8, v3}, Ldm;->a(Luh1;Lpx;I)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v8, v3}, Lgo0;->p(Z)V

    .line 450
    .line 451
    .line 452
    :goto_8
    const/4 v2, 0x1

    .line 453
    goto :goto_9

    .line 454
    :cond_d
    const v0, 0x60ef9b5a

    .line 455
    .line 456
    .line 457
    invoke-virtual {v8, v0}, Lgo0;->W(I)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v8, v3}, Lgo0;->p(Z)V

    .line 461
    .line 462
    .line 463
    goto :goto_8

    .line 464
    :goto_9
    invoke-virtual {v8, v2}, Lgo0;->p(Z)V

    .line 465
    .line 466
    .line 467
    move-object/from16 v2, v17

    .line 468
    .line 469
    goto :goto_a

    .line 470
    :cond_e
    move-object/from16 v10, p2

    .line 471
    .line 472
    invoke-virtual {v8}, Lgo0;->R()V

    .line 473
    .line 474
    .line 475
    move-object/from16 v2, p1

    .line 476
    .line 477
    :goto_a
    invoke-virtual {v8}, Lgo0;->r()Lb62;

    .line 478
    .line 479
    .line 480
    move-result-object v7

    .line 481
    if-eqz v7, :cond_f

    .line 482
    .line 483
    new-instance v0, Lv1;

    .line 484
    .line 485
    const/16 v6, 0x8

    .line 486
    .line 487
    move-object/from16 v4, p3

    .line 488
    .line 489
    move/from16 v5, p5

    .line 490
    .line 491
    move-object v3, v10

    .line 492
    invoke-direct/range {v0 .. v6}, Lv1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 493
    .line 494
    .line 495
    iput-object v0, v7, Lb62;->d:Lmn0;

    .line 496
    .line 497
    :cond_f
    return-void
.end method

.method public static final h(Lxm0;JLuh1;Lkw;Lpx;I)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v5, p4

    .line 8
    .line 9
    move/from16 v6, p6

    .line 10
    .line 11
    move-object/from16 v0, p5

    .line 12
    .line 13
    check-cast v0, Lgo0;

    .line 14
    .line 15
    const v7, -0x3753ec38

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v7}, Lgo0;->X(I)Lgo0;

    .line 19
    .line 20
    .line 21
    and-int/lit8 v7, v6, 0x6

    .line 22
    .line 23
    const/4 v8, 0x4

    .line 24
    if-nez v7, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    if-eqz v7, :cond_0

    .line 31
    .line 32
    move v7, v8

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v7, 0x2

    .line 35
    :goto_0
    or-int/2addr v7, v6

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v7, v6

    .line 38
    :goto_1
    and-int/lit8 v9, v6, 0x30

    .line 39
    .line 40
    const/16 v10, 0x20

    .line 41
    .line 42
    if-nez v9, :cond_3

    .line 43
    .line 44
    invoke-virtual {v0, v2, v3}, Lgo0;->e(J)Z

    .line 45
    .line 46
    .line 47
    move-result v9

    .line 48
    if-eqz v9, :cond_2

    .line 49
    .line 50
    move v9, v10

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    const/16 v9, 0x10

    .line 53
    .line 54
    :goto_2
    or-int/2addr v7, v9

    .line 55
    :cond_3
    and-int/lit16 v9, v6, 0x180

    .line 56
    .line 57
    if-nez v9, :cond_5

    .line 58
    .line 59
    invoke-virtual {v0, v4}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    if-eqz v9, :cond_4

    .line 64
    .line 65
    const/16 v9, 0x100

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    const/16 v9, 0x80

    .line 69
    .line 70
    :goto_3
    or-int/2addr v7, v9

    .line 71
    :cond_5
    and-int/lit16 v9, v6, 0xc00

    .line 72
    .line 73
    if-nez v9, :cond_7

    .line 74
    .line 75
    invoke-virtual {v0, v5}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    if-eqz v9, :cond_6

    .line 80
    .line 81
    const/16 v9, 0x800

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_6
    const/16 v9, 0x400

    .line 85
    .line 86
    :goto_4
    or-int/2addr v7, v9

    .line 87
    :cond_7
    and-int/lit16 v9, v7, 0x493

    .line 88
    .line 89
    const/16 v11, 0x492

    .line 90
    .line 91
    const/4 v12, 0x0

    .line 92
    if-eq v9, v11, :cond_8

    .line 93
    .line 94
    const/4 v9, 0x1

    .line 95
    goto :goto_5

    .line 96
    :cond_8
    move v9, v12

    .line 97
    :goto_5
    and-int/lit8 v11, v7, 0x1

    .line 98
    .line 99
    invoke-virtual {v0, v11, v9}, Lgo0;->O(IZ)Z

    .line 100
    .line 101
    .line 102
    move-result v9

    .line 103
    if-eqz v9, :cond_10

    .line 104
    .line 105
    invoke-virtual {v0}, Lgo0;->L()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v9

    .line 109
    sget-object v11, Lnx;->a:Leb;

    .line 110
    .line 111
    if-ne v9, v11, :cond_9

    .line 112
    .line 113
    new-instance v9, Lh11;

    .line 114
    .line 115
    const-wide/16 v14, 0x0

    .line 116
    .line 117
    invoke-direct {v9, v14, v15}, Lh11;-><init>(J)V

    .line 118
    .line 119
    .line 120
    invoke-static {v9}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    invoke-virtual {v0, v9}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    :cond_9
    check-cast v9, Lxk1;

    .line 128
    .line 129
    sget-object v14, Lte;->g:Lyi0;

    .line 130
    .line 131
    invoke-interface {v4, v14}, Luh1;->c(Luh1;)Luh1;

    .line 132
    .line 133
    .line 134
    move-result-object v14

    .line 135
    invoke-virtual {v0}, Lgo0;->L()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v15

    .line 139
    if-ne v15, v11, :cond_a

    .line 140
    .line 141
    new-instance v15, Lpr;

    .line 142
    .line 143
    const/16 v13, 0xe

    .line 144
    .line 145
    invoke-direct {v15, v9, v13}, Lpr;-><init>(Lxk1;I)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v15}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    :cond_a
    check-cast v15, Lin0;

    .line 152
    .line 153
    invoke-static {v14, v15}, Lgf1;->G(Luh1;Lin0;)Luh1;

    .line 154
    .line 155
    .line 156
    move-result-object v13

    .line 157
    and-int/lit8 v14, v7, 0x70

    .line 158
    .line 159
    if-ne v14, v10, :cond_b

    .line 160
    .line 161
    const/4 v10, 0x1

    .line 162
    goto :goto_6

    .line 163
    :cond_b
    move v10, v12

    .line 164
    :goto_6
    and-int/lit8 v14, v7, 0xe

    .line 165
    .line 166
    if-ne v14, v8, :cond_c

    .line 167
    .line 168
    const/4 v8, 0x1

    .line 169
    goto :goto_7

    .line 170
    :cond_c
    move v8, v12

    .line 171
    :goto_7
    or-int/2addr v8, v10

    .line 172
    invoke-virtual {v0}, Lgo0;->L()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v10

    .line 176
    if-nez v8, :cond_d

    .line 177
    .line 178
    if-ne v10, v11, :cond_e

    .line 179
    .line 180
    :cond_d
    new-instance v10, Lwo1;

    .line 181
    .line 182
    invoke-direct {v10, v2, v3, v1, v9}, Lwo1;-><init>(JLxm0;Lxk1;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v10}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    :cond_e
    check-cast v10, Lin0;

    .line 189
    .line 190
    invoke-static {v13, v10}, Lte;->L(Luh1;Lin0;)Luh1;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    and-int/lit16 v7, v7, 0x1c00

    .line 195
    .line 196
    sget-object v9, Lsn;->j:Lrk;

    .line 197
    .line 198
    invoke-static {v9, v12}, Ldm;->d(Lr5;Z)Lnf1;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    iget-wide v10, v0, Lgo0;->T:J

    .line 203
    .line 204
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 205
    .line 206
    .line 207
    move-result v10

    .line 208
    invoke-virtual {v0}, Lgo0;->l()Lyy1;

    .line 209
    .line 210
    .line 211
    move-result-object v11

    .line 212
    invoke-static {v0, v8}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 213
    .line 214
    .line 215
    move-result-object v8

    .line 216
    sget-object v12, Lhx;->c:Lgx;

    .line 217
    .line 218
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    sget-object v12, Lgx;->b:Ljy;

    .line 222
    .line 223
    invoke-virtual {v0}, Lgo0;->Z()V

    .line 224
    .line 225
    .line 226
    iget-boolean v13, v0, Lgo0;->S:Z

    .line 227
    .line 228
    if-eqz v13, :cond_f

    .line 229
    .line 230
    invoke-virtual {v0, v12}, Lgo0;->k(Lxm0;)V

    .line 231
    .line 232
    .line 233
    goto :goto_8

    .line 234
    :cond_f
    invoke-virtual {v0}, Lgo0;->i0()V

    .line 235
    .line 236
    .line 237
    :goto_8
    sget-object v12, Lgx;->e:Llc;

    .line 238
    .line 239
    invoke-static {v0, v12, v9}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    sget-object v9, Lgx;->d:Llc;

    .line 243
    .line 244
    invoke-static {v0, v9, v11}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 248
    .line 249
    .line 250
    move-result-object v9

    .line 251
    sget-object v10, Lgx;->f:Llc;

    .line 252
    .line 253
    invoke-static {v0, v10, v9}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    sget-object v9, Lgx;->g:Lv6;

    .line 257
    .line 258
    invoke-static {v0, v9}, Lyf3;->b(Lpx;Lin0;)V

    .line 259
    .line 260
    .line 261
    sget-object v9, Lgx;->c:Llc;

    .line 262
    .line 263
    invoke-static {v0, v9, v8}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    shr-int/lit8 v7, v7, 0x6

    .line 267
    .line 268
    and-int/lit8 v7, v7, 0x70

    .line 269
    .line 270
    or-int/lit8 v7, v7, 0x6

    .line 271
    .line 272
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 273
    .line 274
    .line 275
    move-result-object v7

    .line 276
    sget-object v8, Lhm;->a:Lhm;

    .line 277
    .line 278
    invoke-virtual {v5, v8, v0, v7}, Lkw;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    const/4 v7, 0x1

    .line 282
    invoke-virtual {v0, v7}, Lgo0;->p(Z)V

    .line 283
    .line 284
    .line 285
    goto :goto_9

    .line 286
    :cond_10
    invoke-virtual {v0}, Lgo0;->R()V

    .line 287
    .line 288
    .line 289
    :goto_9
    invoke-virtual {v0}, Lgo0;->r()Lb62;

    .line 290
    .line 291
    .line 292
    move-result-object v7

    .line 293
    if-eqz v7, :cond_11

    .line 294
    .line 295
    new-instance v0, Lxo1;

    .line 296
    .line 297
    invoke-direct/range {v0 .. v6}, Lxo1;-><init>(Lxm0;JLuh1;Lkw;I)V

    .line 298
    .line 299
    .line 300
    iput-object v0, v7, Lb62;->d:Lmn0;

    .line 301
    .line 302
    :cond_11
    return-void
.end method

.method public static final i()Lq9;
    .locals 3

    .line 1
    new-instance v0, Lq9;

    .line 2
    .line 3
    new-instance v1, Landroid/graphics/Paint;

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Lq9;-><init>(Landroid/graphics/Paint;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static final j(Lth1;)Landroid/view/View;
    .locals 1

    .line 1
    iget-object p0, p0, Lth1;->h:Lth1;

    .line 2
    .line 3
    invoke-static {p0}, Lsp0;->c0(Lt60;)Lr61;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Lr61;->v:Lab3;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lic;->getInteropView()Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p0, v0

    .line 18
    :goto_0
    if-eqz p0, :cond_1

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    const-string p0, "Could not fetch interop view"

    .line 22
    .line 23
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public static final k(Lr61;)Lab3;
    .locals 0

    .line 1
    iget-object p0, p0, Lr61;->v:Lab3;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "Required value was null."

    .line 7
    .line 8
    invoke-static {p0}, Lvi0;->e(Ljava/lang/String;)Lpv;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    throw p0
.end method

.method public static final l(JJ)J
    .locals 7

    .line 1
    const-wide v0, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v2, p0, v0

    .line 7
    .line 8
    const-wide v3, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    if-eqz v2, :cond_3

    .line 14
    .line 15
    cmp-long v2, p0, v3

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    cmp-long v0, p2, v0

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    cmp-long v0, p2, v3

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    add-long v1, p0, p2

    .line 30
    .line 31
    const-wide v3, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    const-wide v5, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    invoke-static/range {v1 .. v6}, Lci0;->E(JJJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide p0

    .line 45
    return-wide p0

    .line 46
    :cond_2
    :goto_0
    return-wide p2

    .line 47
    :cond_3
    :goto_1
    cmp-long v2, v3, p2

    .line 48
    .line 49
    if-gez v2, :cond_4

    .line 50
    .line 51
    cmp-long v0, p2, v0

    .line 52
    .line 53
    if-gez v0, :cond_4

    .line 54
    .line 55
    return-wide p0

    .line 56
    :cond_4
    xor-long/2addr p2, p0

    .line 57
    const-wide/16 v0, 0x0

    .line 58
    .line 59
    cmp-long p2, p2, v0

    .line 60
    .line 61
    if-ltz p2, :cond_5

    .line 62
    .line 63
    return-wide p0

    .line 64
    :cond_5
    const-wide p0, 0x7fffffffffffc0deL

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    return-wide p0
.end method

.method public static m(Lvu0;)Lnu0;
    .locals 7

    .line 1
    const-string v0, "Can not get PackageInfo!"

    .line 2
    .line 3
    new-instance v1, Lnu0;

    .line 4
    .line 5
    sget-object v2, Lup0;->i:Landroid/content/Context;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "hostContext"

    .line 9
    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    :try_start_0
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const/4 v6, 0x0

    .line 21
    invoke-virtual {v5, v2, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget-object v2, v2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 28
    .line 29
    .line 30
    sget-object v5, Lup0;->i:Landroid/content/Context;

    .line 31
    .line 32
    if-eqz v5, :cond_0

    .line 33
    .line 34
    :try_start_1
    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {v4, v5, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    iget v0, v4, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    .line 48
    invoke-static {p0}, Lpp0;->y(Lvu0;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    invoke-direct {v1, v2, v0, v3, p0}, Lnu0;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    :catchall_0
    invoke-static {v0}, Ls;->i(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    return-object v3

    .line 64
    :cond_0
    invoke-static {v4}, Lt11;->S(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v3

    .line 68
    :catchall_1
    invoke-static {v0}, Ls;->i(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    return-object v3

    .line 72
    :cond_1
    invoke-static {v4}, Lt11;->S(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v3
.end method

.method public static final n(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    invoke-static {p1, p0}, Lfg1;->m(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    return-void
.end method

.method public static final o(Lt60;)Lqy2;
    .locals 13

    .line 1
    new-instance v2, Loy2;

    .line 2
    .line 3
    invoke-direct {v2}, Loy2;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Le2;

    .line 7
    .line 8
    const/4 v7, 0x0

    .line 9
    const/4 v8, 0x7

    .line 10
    const/4 v1, 0x1

    .line 11
    const-class v3, Loy2;

    .line 12
    .line 13
    const-string v4, "addFilter"

    .line 14
    .line 15
    const-string v5, "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V"

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    invoke-direct/range {v0 .. v8}, Le2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Lxq2;

    .line 22
    .line 23
    const/4 v3, 0x5

    .line 24
    invoke-direct {v1, v3, v2}, Lxq2;-><init>(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance v3, Lxq2;

    .line 28
    .line 29
    invoke-direct {v3, v1, v0}, Lxq2;-><init>(Lxq2;Le2;)V

    .line 30
    .line 31
    .line 32
    sget-object v0, Lsy2;->a:Lsy2;

    .line 33
    .line 34
    invoke-static {p0, v0, v3}, Ltb3;->c(Lt60;Ljava/lang/Object;Lin0;)V

    .line 35
    .line 36
    .line 37
    new-instance p0, Llk1;

    .line 38
    .line 39
    invoke-direct {p0}, Llk1;-><init>()V

    .line 40
    .line 41
    .line 42
    iget-object v0, v2, Loy2;->a:Llk1;

    .line 43
    .line 44
    iget-object v1, v0, Llk1;->a:[Ljava/lang/Object;

    .line 45
    .line 46
    iget v0, v0, Llk1;->b:I

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    const/4 v4, 0x1

    .line 50
    const/4 v5, 0x0

    .line 51
    move v6, v3

    .line 52
    move v7, v4

    .line 53
    move-object v8, v5

    .line 54
    :goto_0
    sget-object v9, Lbz2;->b:Lbz2;

    .line 55
    .line 56
    if-ge v6, v0, :cond_6

    .line 57
    .line 58
    aget-object v10, v1, v6

    .line 59
    .line 60
    check-cast v10, Lpy2;

    .line 61
    .line 62
    if-eqz v7, :cond_0

    .line 63
    .line 64
    if-eq v10, v9, :cond_5

    .line 65
    .line 66
    :cond_0
    if-ne v10, v9, :cond_1

    .line 67
    .line 68
    if-ne v8, v9, :cond_1

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_1
    if-ne v10, v9, :cond_2

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_2
    iget-object v7, v2, Loy2;->b:Llk1;

    .line 75
    .line 76
    iget-object v9, v7, Llk1;->a:[Ljava/lang/Object;

    .line 77
    .line 78
    iget v7, v7, Llk1;->b:I

    .line 79
    .line 80
    move v11, v3

    .line 81
    :goto_1
    if-ge v11, v7, :cond_4

    .line 82
    .line 83
    aget-object v12, v9, v11

    .line 84
    .line 85
    check-cast v12, Lin0;

    .line 86
    .line 87
    invoke-interface {v12, v10}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v12

    .line 91
    check-cast v12, Ljava/lang/Boolean;

    .line 92
    .line 93
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 94
    .line 95
    .line 96
    move-result v12

    .line 97
    if-nez v12, :cond_3

    .line 98
    .line 99
    :goto_2
    move v7, v3

    .line 100
    goto :goto_4

    .line 101
    :cond_3
    add-int/lit8 v11, v11, 0x1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    :goto_3
    invoke-virtual {p0, v10}, Llk1;->a(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    move v7, v3

    .line 108
    move-object v8, v10

    .line 109
    :cond_5
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_6
    invoke-virtual {p0}, Llk1;->h()Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_7

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_7
    iget-object v0, p0, Llk1;->a:[Ljava/lang/Object;

    .line 120
    .line 121
    iget v1, p0, Llk1;->b:I

    .line 122
    .line 123
    sub-int/2addr v1, v4

    .line 124
    aget-object v5, v0, v1

    .line 125
    .line 126
    :goto_5
    check-cast v5, Lpy2;

    .line 127
    .line 128
    if-ne v5, v9, :cond_8

    .line 129
    .line 130
    iget v0, p0, Llk1;->b:I

    .line 131
    .line 132
    sub-int/2addr v0, v4

    .line 133
    invoke-virtual {p0, v0}, Llk1;->k(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    :cond_8
    new-instance v0, Lqy2;

    .line 137
    .line 138
    iget-object v1, p0, Llk1;->c:Ljk1;

    .line 139
    .line 140
    if-eqz v1, :cond_9

    .line 141
    .line 142
    goto :goto_6

    .line 143
    :cond_9
    new-instance v1, Ljk1;

    .line 144
    .line 145
    invoke-direct {v1, v3, p0}, Ljk1;-><init>(ILjava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    iput-object v1, p0, Llk1;->c:Ljk1;

    .line 149
    .line 150
    :goto_6
    invoke-direct {v0, v1}, Lqy2;-><init>(Ljava/util/List;)V

    .line 151
    .line 152
    .line 153
    return-object v0
.end method

.method public static p(Landroid/view/View;Landroid/view/KeyEvent;)Z
    .locals 4

    .line 1
    sget v0, Lwa3;->a:I

    .line 2
    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v1, 0x1c

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_1

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lva3;->d:Ljava/util/ArrayList;

    .line 13
    .line 14
    const v0, 0x7908006f

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lva3;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    new-instance v1, Lva3;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v3, v1, Lva3;->a:Ljava/util/WeakHashMap;

    .line 32
    .line 33
    iput-object v3, v1, Lva3;->b:Landroid/util/SparseArray;

    .line 34
    .line 35
    iput-object v3, v1, Lva3;->c:Ljava/lang/ref/WeakReference;

    .line 36
    .line 37
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-object p0, v1, Lva3;->c:Ljava/lang/ref/WeakReference;

    .line 41
    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    if-ne p0, p1, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    new-instance p0, Ljava/lang/ref/WeakReference;

    .line 52
    .line 53
    invoke-direct {p0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iput-object p0, v1, Lva3;->c:Ljava/lang/ref/WeakReference;

    .line 57
    .line 58
    iget-object p0, v1, Lva3;->b:Landroid/util/SparseArray;

    .line 59
    .line 60
    if-nez p0, :cond_3

    .line 61
    .line 62
    new-instance p0, Landroid/util/SparseArray;

    .line 63
    .line 64
    invoke-direct {p0}, Landroid/util/SparseArray;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object p0, v1, Lva3;->b:Landroid/util/SparseArray;

    .line 68
    .line 69
    :cond_3
    iget-object p0, v1, Lva3;->b:Landroid/util/SparseArray;

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    const/4 v1, 0x1

    .line 76
    if-ne v0, v1, :cond_4

    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-virtual {p0, v0}, Landroid/util/SparseArray;->indexOfKey(I)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-ltz v0, :cond_4

    .line 87
    .line 88
    invoke-virtual {p0, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 93
    .line 94
    invoke-virtual {p0, v0}, Landroid/util/SparseArray;->removeAt(I)V

    .line 95
    .line 96
    .line 97
    :cond_4
    if-nez v3, :cond_5

    .line 98
    .line 99
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    move-object v3, p0

    .line 108
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 109
    .line 110
    :cond_5
    if-eqz v3, :cond_8

    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, Landroid/view/View;

    .line 117
    .line 118
    if-eqz p0, :cond_7

    .line 119
    .line 120
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-eqz p1, :cond_7

    .line 125
    .line 126
    const p1, 0x79080070

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    check-cast p0, Ljava/util/ArrayList;

    .line 134
    .line 135
    if-eqz p0, :cond_7

    .line 136
    .line 137
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    sub-int/2addr p1, v1

    .line 142
    if-gez p1, :cond_6

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_6
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-static {}, Lc80;->g()V

    .line 153
    .line 154
    .line 155
    return v2

    .line 156
    :cond_7
    :goto_0
    return v1

    .line 157
    :cond_8
    :goto_1
    return v2
.end method

.method public static final q(Ly9;DDDDDDDZZ)V
    .locals 47

    .line 1
    move-wide/from16 v1, p1

    .line 2
    .line 3
    move-wide/from16 v5, p5

    .line 4
    .line 5
    move-wide/from16 v3, p9

    .line 6
    .line 7
    const-wide v7, 0x4066800000000000L    # 180.0

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    div-double v7, p13, v7

    .line 13
    .line 14
    const-wide v9, 0x400921fb54442d18L    # Math.PI

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    mul-double/2addr v7, v9

    .line 20
    invoke-static {v7, v8}, Ljava/lang/Math;->cos(D)D

    .line 21
    .line 22
    .line 23
    move-result-wide v11

    .line 24
    invoke-static {v7, v8}, Ljava/lang/Math;->sin(D)D

    .line 25
    .line 26
    .line 27
    move-result-wide v13

    .line 28
    mul-double v15, v1, v11

    .line 29
    .line 30
    mul-double v17, p3, v13

    .line 31
    .line 32
    add-double v17, v17, v15

    .line 33
    .line 34
    div-double v17, v17, v3

    .line 35
    .line 36
    move-wide v15, v9

    .line 37
    neg-double v9, v1

    .line 38
    mul-double/2addr v9, v13

    .line 39
    mul-double v19, p3, v11

    .line 40
    .line 41
    add-double v19, v19, v9

    .line 42
    .line 43
    div-double v19, v19, p11

    .line 44
    .line 45
    mul-double v9, v5, v11

    .line 46
    .line 47
    mul-double v21, p7, v13

    .line 48
    .line 49
    add-double v21, v21, v9

    .line 50
    .line 51
    div-double v21, v21, v3

    .line 52
    .line 53
    neg-double v9, v5

    .line 54
    mul-double/2addr v9, v13

    .line 55
    mul-double v23, p7, v11

    .line 56
    .line 57
    add-double v23, v23, v9

    .line 58
    .line 59
    div-double v23, v23, p11

    .line 60
    .line 61
    sub-double v9, v17, v21

    .line 62
    .line 63
    sub-double v25, v19, v23

    .line 64
    .line 65
    add-double v27, v17, v21

    .line 66
    .line 67
    const-wide/high16 v29, 0x4000000000000000L    # 2.0

    .line 68
    .line 69
    div-double v27, v27, v29

    .line 70
    .line 71
    add-double v31, v19, v23

    .line 72
    .line 73
    div-double v31, v31, v29

    .line 74
    .line 75
    mul-double v33, v9, v9

    .line 76
    .line 77
    mul-double v35, v25, v25

    .line 78
    .line 79
    add-double v35, v35, v33

    .line 80
    .line 81
    const-wide/16 v33, 0x0

    .line 82
    .line 83
    cmpg-double v0, v35, v33

    .line 84
    .line 85
    if-nez v0, :cond_0

    .line 86
    .line 87
    goto/16 :goto_4

    .line 88
    .line 89
    :cond_0
    const-wide/high16 v37, 0x3ff0000000000000L    # 1.0

    .line 90
    .line 91
    div-double v39, v37, v35

    .line 92
    .line 93
    const-wide/high16 v41, 0x3fd0000000000000L    # 0.25

    .line 94
    .line 95
    sub-double v39, v39, v41

    .line 96
    .line 97
    cmpg-double v0, v39, v33

    .line 98
    .line 99
    if-gez v0, :cond_1

    .line 100
    .line 101
    invoke-static/range {v35 .. v36}, Ljava/lang/Math;->sqrt(D)D

    .line 102
    .line 103
    .line 104
    move-result-wide v7

    .line 105
    const-wide v9, 0x3ffffff583a53b8eL    # 1.99999

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    div-double/2addr v7, v9

    .line 111
    double-to-float v0, v7

    .line 112
    float-to-double v7, v0

    .line 113
    mul-double v9, v3, v7

    .line 114
    .line 115
    mul-double v11, p11, v7

    .line 116
    .line 117
    move-object/from16 v0, p0

    .line 118
    .line 119
    move-wide/from16 v3, p3

    .line 120
    .line 121
    move-wide/from16 v7, p7

    .line 122
    .line 123
    move-wide/from16 v13, p13

    .line 124
    .line 125
    move/from16 v15, p15

    .line 126
    .line 127
    move/from16 v16, p16

    .line 128
    .line 129
    invoke-static/range {v0 .. v16}, Lpp0;->q(Ly9;DDDDDDDZZ)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_1
    move/from16 v0, p16

    .line 134
    .line 135
    invoke-static/range {v39 .. v40}, Ljava/lang/Math;->sqrt(D)D

    .line 136
    .line 137
    .line 138
    move-result-wide v1

    .line 139
    mul-double/2addr v9, v1

    .line 140
    mul-double v1, v1, v25

    .line 141
    .line 142
    move/from16 v5, p15

    .line 143
    .line 144
    if-ne v5, v0, :cond_2

    .line 145
    .line 146
    sub-double v27, v27, v1

    .line 147
    .line 148
    add-double v31, v31, v9

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_2
    add-double v27, v27, v1

    .line 152
    .line 153
    sub-double v31, v31, v9

    .line 154
    .line 155
    :goto_0
    sub-double v1, v19, v31

    .line 156
    .line 157
    sub-double v5, v17, v27

    .line 158
    .line 159
    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->atan2(DD)D

    .line 160
    .line 161
    .line 162
    move-result-wide v1

    .line 163
    sub-double v5, v23, v31

    .line 164
    .line 165
    sub-double v9, v21, v27

    .line 166
    .line 167
    invoke-static {v5, v6, v9, v10}, Ljava/lang/Math;->atan2(DD)D

    .line 168
    .line 169
    .line 170
    move-result-wide v5

    .line 171
    sub-double/2addr v5, v1

    .line 172
    cmpl-double v9, v5, v33

    .line 173
    .line 174
    if-ltz v9, :cond_3

    .line 175
    .line 176
    const/16 v17, 0x1

    .line 177
    .line 178
    move/from16 v10, v17

    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_3
    const/4 v10, 0x0

    .line 182
    :goto_1
    if-eq v0, v10, :cond_5

    .line 183
    .line 184
    const-wide v17, 0x401921fb54442d18L    # 6.283185307179586

    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    if-lez v9, :cond_4

    .line 190
    .line 191
    sub-double v5, v5, v17

    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_4
    add-double v5, v5, v17

    .line 195
    .line 196
    :cond_5
    :goto_2
    mul-double v27, v27, v3

    .line 197
    .line 198
    mul-double v31, v31, p11

    .line 199
    .line 200
    mul-double v9, v27, v11

    .line 201
    .line 202
    mul-double v17, v31, v13

    .line 203
    .line 204
    sub-double v9, v9, v17

    .line 205
    .line 206
    mul-double v27, v27, v13

    .line 207
    .line 208
    mul-double v31, v31, v11

    .line 209
    .line 210
    add-double v31, v31, v27

    .line 211
    .line 212
    const-wide/high16 v11, 0x4010000000000000L    # 4.0

    .line 213
    .line 214
    mul-double v13, v5, v11

    .line 215
    .line 216
    div-double/2addr v13, v15

    .line 217
    invoke-static {v13, v14}, Ljava/lang/Math;->abs(D)D

    .line 218
    .line 219
    .line 220
    move-result-wide v13

    .line 221
    invoke-static {v13, v14}, Ljava/lang/Math;->ceil(D)D

    .line 222
    .line 223
    .line 224
    move-result-wide v13

    .line 225
    double-to-int v0, v13

    .line 226
    invoke-static {v7, v8}, Ljava/lang/Math;->cos(D)D

    .line 227
    .line 228
    .line 229
    move-result-wide v13

    .line 230
    invoke-static {v7, v8}, Ljava/lang/Math;->sin(D)D

    .line 231
    .line 232
    .line 233
    move-result-wide v7

    .line 234
    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    .line 235
    .line 236
    .line 237
    move-result-wide v15

    .line 238
    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    .line 239
    .line 240
    .line 241
    move-result-wide v17

    .line 242
    move-wide/from16 p13, v11

    .line 243
    .line 244
    neg-double v11, v3

    .line 245
    mul-double v19, v11, v13

    .line 246
    .line 247
    mul-double v21, v19, v17

    .line 248
    .line 249
    mul-double v23, p11, v7

    .line 250
    .line 251
    mul-double v25, v23, v15

    .line 252
    .line 253
    sub-double v21, v21, v25

    .line 254
    .line 255
    mul-double/2addr v11, v7

    .line 256
    mul-double v17, v17, v11

    .line 257
    .line 258
    mul-double v25, p11, v13

    .line 259
    .line 260
    mul-double v15, v15, v25

    .line 261
    .line 262
    add-double v15, v15, v17

    .line 263
    .line 264
    move-wide/from16 p6, v1

    .line 265
    .line 266
    int-to-double v1, v0

    .line 267
    div-double/2addr v5, v1

    .line 268
    move-wide/from16 v17, p6

    .line 269
    .line 270
    move-wide/from16 v27, v21

    .line 271
    .line 272
    const/4 v1, 0x0

    .line 273
    move-wide/from16 v21, v15

    .line 274
    .line 275
    move-wide/from16 v15, p3

    .line 276
    .line 277
    :goto_3
    if-ge v1, v0, :cond_6

    .line 278
    .line 279
    add-double v33, v17, v5

    .line 280
    .line 281
    invoke-static/range {v33 .. v34}, Ljava/lang/Math;->sin(D)D

    .line 282
    .line 283
    .line 284
    move-result-wide v35

    .line 285
    invoke-static/range {v33 .. v34}, Ljava/lang/Math;->cos(D)D

    .line 286
    .line 287
    .line 288
    move-result-wide v39

    .line 289
    mul-double v41, v3, v13

    .line 290
    .line 291
    mul-double v41, v41, v39

    .line 292
    .line 293
    add-double v41, v41, v9

    .line 294
    .line 295
    mul-double v43, v23, v35

    .line 296
    .line 297
    move v2, v0

    .line 298
    move/from16 p8, v1

    .line 299
    .line 300
    sub-double v0, v41, v43

    .line 301
    .line 302
    mul-double v41, v3, v7

    .line 303
    .line 304
    mul-double v41, v41, v39

    .line 305
    .line 306
    add-double v41, v41, v31

    .line 307
    .line 308
    mul-double v43, v25, v35

    .line 309
    .line 310
    move/from16 p11, v2

    .line 311
    .line 312
    add-double v2, v43, v41

    .line 313
    .line 314
    mul-double v41, v19, v35

    .line 315
    .line 316
    mul-double v43, v23, v39

    .line 317
    .line 318
    sub-double v41, v41, v43

    .line 319
    .line 320
    mul-double v35, v35, v11

    .line 321
    .line 322
    mul-double v39, v39, v25

    .line 323
    .line 324
    add-double v35, v39, v35

    .line 325
    .line 326
    sub-double v17, v33, v17

    .line 327
    .line 328
    div-double v39, v17, v29

    .line 329
    .line 330
    invoke-static/range {v39 .. v40}, Ljava/lang/Math;->tan(D)D

    .line 331
    .line 332
    .line 333
    move-result-wide v39

    .line 334
    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->sin(D)D

    .line 335
    .line 336
    .line 337
    move-result-wide v17

    .line 338
    const-wide/high16 v43, 0x4008000000000000L    # 3.0

    .line 339
    .line 340
    mul-double v45, v39, v43

    .line 341
    .line 342
    mul-double v45, v45, v39

    .line 343
    .line 344
    add-double v45, v45, p13

    .line 345
    .line 346
    invoke-static/range {v45 .. v46}, Ljava/lang/Math;->sqrt(D)D

    .line 347
    .line 348
    .line 349
    move-result-wide v39

    .line 350
    sub-double v39, v39, v37

    .line 351
    .line 352
    mul-double v39, v39, v17

    .line 353
    .line 354
    div-double v39, v39, v43

    .line 355
    .line 356
    mul-double v27, v27, v39

    .line 357
    .line 358
    move-wide/from16 p15, v5

    .line 359
    .line 360
    add-double v4, v27, p1

    .line 361
    .line 362
    mul-double v21, v21, v39

    .line 363
    .line 364
    move-wide/from16 v17, v7

    .line 365
    .line 366
    add-double v6, v21, v15

    .line 367
    .line 368
    mul-double v15, v39, v41

    .line 369
    .line 370
    move-wide/from16 v21, v9

    .line 371
    .line 372
    sub-double v8, v0, v15

    .line 373
    .line 374
    mul-double v39, v39, v35

    .line 375
    .line 376
    move-wide v15, v11

    .line 377
    sub-double v10, v2, v39

    .line 378
    .line 379
    double-to-float v4, v4

    .line 380
    double-to-float v5, v6

    .line 381
    double-to-float v6, v8

    .line 382
    double-to-float v7, v10

    .line 383
    double-to-float v8, v0

    .line 384
    double-to-float v9, v2

    .line 385
    move-object/from16 p1, p0

    .line 386
    .line 387
    move/from16 p2, v4

    .line 388
    .line 389
    move/from16 p3, v5

    .line 390
    .line 391
    move/from16 p4, v6

    .line 392
    .line 393
    move/from16 p5, v7

    .line 394
    .line 395
    move/from16 p6, v8

    .line 396
    .line 397
    move/from16 p7, v9

    .line 398
    .line 399
    invoke-virtual/range {p1 .. p7}, Ly9;->c(FFFFFF)V

    .line 400
    .line 401
    .line 402
    add-int/lit8 v4, p8, 0x1

    .line 403
    .line 404
    move-wide/from16 v5, p15

    .line 405
    .line 406
    move-wide/from16 p1, v0

    .line 407
    .line 408
    move v1, v4

    .line 409
    move-wide v11, v15

    .line 410
    move-wide/from16 v7, v17

    .line 411
    .line 412
    move-wide/from16 v9, v21

    .line 413
    .line 414
    move-wide/from16 v17, v33

    .line 415
    .line 416
    move-wide/from16 v21, v35

    .line 417
    .line 418
    move-wide/from16 v27, v41

    .line 419
    .line 420
    move/from16 v0, p11

    .line 421
    .line 422
    move-wide v15, v2

    .line 423
    move-wide/from16 v3, p9

    .line 424
    .line 425
    goto/16 :goto_3

    .line 426
    .line 427
    :cond_6
    :goto_4
    return-void
.end method

.method public static final r(J)J
    .locals 3

    .line 1
    sget-object v0, Lad0;->i:Lz8;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    shl-long/2addr p0, v1

    .line 5
    const-wide/16 v1, 0x1

    .line 6
    .line 7
    add-long/2addr p0, v1

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget v0, Lcd0;->a:I

    .line 12
    .line 13
    return-wide p0
.end method

.method public static s(I)Lfp;
    .locals 21

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lum0;->k:Lum0;

    .line 4
    .line 5
    shr-int/lit8 v2, v0, 0x10

    .line 6
    .line 7
    and-int/lit16 v2, v2, 0xff

    .line 8
    .line 9
    invoke-static {v2}, Lrg3;->G(I)F

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    shr-int/lit8 v3, v0, 0x8

    .line 14
    .line 15
    and-int/lit16 v3, v3, 0xff

    .line 16
    .line 17
    invoke-static {v3}, Lrg3;->G(I)F

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    and-int/lit16 v0, v0, 0xff

    .line 22
    .line 23
    invoke-static {v0}, Lrg3;->G(I)F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    sget-object v4, Lrg3;->d:[[D

    .line 28
    .line 29
    float-to-double v5, v2

    .line 30
    const/4 v2, 0x0

    .line 31
    aget-object v7, v4, v2

    .line 32
    .line 33
    aget-wide v8, v7, v2

    .line 34
    .line 35
    mul-double/2addr v8, v5

    .line 36
    float-to-double v10, v3

    .line 37
    const/4 v3, 0x1

    .line 38
    aget-wide v12, v7, v3

    .line 39
    .line 40
    mul-double/2addr v12, v10

    .line 41
    add-double/2addr v12, v8

    .line 42
    float-to-double v8, v0

    .line 43
    const/4 v0, 0x2

    .line 44
    aget-wide v14, v7, v0

    .line 45
    .line 46
    mul-double/2addr v14, v8

    .line 47
    add-double/2addr v14, v12

    .line 48
    aget-object v7, v4, v3

    .line 49
    .line 50
    aget-wide v12, v7, v2

    .line 51
    .line 52
    mul-double/2addr v12, v5

    .line 53
    aget-wide v16, v7, v3

    .line 54
    .line 55
    mul-double v16, v16, v10

    .line 56
    .line 57
    add-double v16, v16, v12

    .line 58
    .line 59
    aget-wide v12, v7, v0

    .line 60
    .line 61
    mul-double/2addr v12, v8

    .line 62
    add-double v12, v12, v16

    .line 63
    .line 64
    aget-object v4, v4, v0

    .line 65
    .line 66
    aget-wide v16, v4, v2

    .line 67
    .line 68
    mul-double v5, v5, v16

    .line 69
    .line 70
    aget-wide v16, v4, v3

    .line 71
    .line 72
    mul-double v10, v10, v16

    .line 73
    .line 74
    add-double/2addr v10, v5

    .line 75
    aget-wide v5, v4, v0

    .line 76
    .line 77
    mul-double/2addr v8, v5

    .line 78
    add-double/2addr v8, v10

    .line 79
    double-to-float v4, v14

    .line 80
    double-to-float v5, v12

    .line 81
    double-to-float v6, v8

    .line 82
    const/4 v7, 0x3

    .line 83
    new-array v7, v7, [F

    .line 84
    .line 85
    aput v4, v7, v2

    .line 86
    .line 87
    aput v5, v7, v3

    .line 88
    .line 89
    aput v6, v7, v0

    .line 90
    .line 91
    sget-object v4, Lrg3;->a:[[F

    .line 92
    .line 93
    aget v5, v7, v2

    .line 94
    .line 95
    aget-object v6, v4, v2

    .line 96
    .line 97
    aget v8, v6, v2

    .line 98
    .line 99
    mul-float/2addr v8, v5

    .line 100
    aget v9, v7, v3

    .line 101
    .line 102
    aget v10, v6, v3

    .line 103
    .line 104
    mul-float/2addr v10, v9

    .line 105
    add-float/2addr v10, v8

    .line 106
    aget v7, v7, v0

    .line 107
    .line 108
    aget v6, v6, v0

    .line 109
    .line 110
    mul-float/2addr v6, v7

    .line 111
    add-float/2addr v6, v10

    .line 112
    aget-object v8, v4, v3

    .line 113
    .line 114
    aget v10, v8, v2

    .line 115
    .line 116
    mul-float/2addr v10, v5

    .line 117
    aget v11, v8, v3

    .line 118
    .line 119
    mul-float/2addr v11, v9

    .line 120
    add-float/2addr v11, v10

    .line 121
    aget v8, v8, v0

    .line 122
    .line 123
    mul-float/2addr v8, v7

    .line 124
    add-float/2addr v8, v11

    .line 125
    aget-object v4, v4, v0

    .line 126
    .line 127
    aget v10, v4, v2

    .line 128
    .line 129
    mul-float/2addr v5, v10

    .line 130
    aget v10, v4, v3

    .line 131
    .line 132
    mul-float/2addr v9, v10

    .line 133
    add-float/2addr v9, v5

    .line 134
    aget v4, v4, v0

    .line 135
    .line 136
    mul-float/2addr v7, v4

    .line 137
    add-float/2addr v7, v9

    .line 138
    iget-object v4, v1, Lum0;->g:[F

    .line 139
    .line 140
    iget v5, v1, Lum0;->e:F

    .line 141
    .line 142
    iget v9, v1, Lum0;->b:F

    .line 143
    .line 144
    aget v2, v4, v2

    .line 145
    .line 146
    mul-float/2addr v2, v6

    .line 147
    aget v3, v4, v3

    .line 148
    .line 149
    mul-float/2addr v3, v8

    .line 150
    aget v0, v4, v0

    .line 151
    .line 152
    mul-float/2addr v0, v7

    .line 153
    iget v4, v1, Lum0;->h:F

    .line 154
    .line 155
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    mul-float/2addr v6, v4

    .line 160
    const/high16 v7, 0x42c80000    # 100.0f

    .line 161
    .line 162
    div-float/2addr v6, v7

    .line 163
    float-to-double v10, v6

    .line 164
    const-wide v12, 0x3fdae147a0000000L    # 0.41999998688697815

    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 170
    .line 171
    .line 172
    move-result-wide v10

    .line 173
    double-to-float v6, v10

    .line 174
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    mul-float/2addr v8, v4

    .line 179
    div-float/2addr v8, v7

    .line 180
    float-to-double v10, v8

    .line 181
    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 182
    .line 183
    .line 184
    move-result-wide v10

    .line 185
    double-to-float v8, v10

    .line 186
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 187
    .line 188
    .line 189
    move-result v10

    .line 190
    mul-float/2addr v10, v4

    .line 191
    div-float/2addr v10, v7

    .line 192
    float-to-double v10, v10

    .line 193
    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 194
    .line 195
    .line 196
    move-result-wide v10

    .line 197
    double-to-float v4, v10

    .line 198
    invoke-static {v2}, Ljava/lang/Math;->signum(F)F

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    const/high16 v10, 0x43c80000    # 400.0f

    .line 203
    .line 204
    mul-float/2addr v2, v10

    .line 205
    mul-float/2addr v2, v6

    .line 206
    const v11, 0x41d90a3d    # 27.13f

    .line 207
    .line 208
    .line 209
    add-float/2addr v6, v11

    .line 210
    div-float/2addr v2, v6

    .line 211
    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    mul-float/2addr v3, v10

    .line 216
    mul-float/2addr v3, v8

    .line 217
    add-float/2addr v8, v11

    .line 218
    div-float/2addr v3, v8

    .line 219
    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    mul-float/2addr v0, v10

    .line 224
    mul-float/2addr v0, v4

    .line 225
    add-float/2addr v4, v11

    .line 226
    div-float/2addr v0, v4

    .line 227
    const/high16 v4, 0x41300000    # 11.0f

    .line 228
    .line 229
    mul-float v6, v2, v4

    .line 230
    .line 231
    const/high16 v8, -0x3ec00000    # -12.0f

    .line 232
    .line 233
    mul-float/2addr v8, v3

    .line 234
    add-float/2addr v8, v6

    .line 235
    add-float/2addr v8, v0

    .line 236
    div-float/2addr v8, v4

    .line 237
    add-float v4, v2, v3

    .line 238
    .line 239
    const/high16 v6, 0x40000000    # 2.0f

    .line 240
    .line 241
    mul-float v10, v0, v6

    .line 242
    .line 243
    sub-float/2addr v4, v10

    .line 244
    const/high16 v10, 0x41100000    # 9.0f

    .line 245
    .line 246
    div-float/2addr v4, v10

    .line 247
    const/high16 v10, 0x41a00000    # 20.0f

    .line 248
    .line 249
    mul-float v11, v2, v10

    .line 250
    .line 251
    mul-float/2addr v3, v10

    .line 252
    add-float/2addr v11, v3

    .line 253
    const/high16 v12, 0x41a80000    # 21.0f

    .line 254
    .line 255
    mul-float/2addr v12, v0

    .line 256
    add-float/2addr v12, v11

    .line 257
    div-float/2addr v12, v10

    .line 258
    const/high16 v11, 0x42200000    # 40.0f

    .line 259
    .line 260
    mul-float/2addr v2, v11

    .line 261
    add-float/2addr v2, v3

    .line 262
    add-float/2addr v2, v0

    .line 263
    div-float/2addr v2, v10

    .line 264
    float-to-double v10, v4

    .line 265
    float-to-double v13, v8

    .line 266
    invoke-static {v10, v11, v13, v14}, Ljava/lang/Math;->atan2(DD)D

    .line 267
    .line 268
    .line 269
    move-result-wide v10

    .line 270
    double-to-float v0, v10

    .line 271
    const/high16 v3, 0x43340000    # 180.0f

    .line 272
    .line 273
    mul-float/2addr v0, v3

    .line 274
    const v10, 0x40490fdb    # (float)Math.PI

    .line 275
    .line 276
    .line 277
    div-float/2addr v0, v10

    .line 278
    const/4 v11, 0x0

    .line 279
    cmpg-float v11, v0, v11

    .line 280
    .line 281
    const/high16 v13, 0x43b40000    # 360.0f

    .line 282
    .line 283
    if-gez v11, :cond_1

    .line 284
    .line 285
    add-float/2addr v0, v13

    .line 286
    :cond_0
    :goto_0
    move v15, v0

    .line 287
    goto :goto_1

    .line 288
    :cond_1
    cmpl-float v11, v0, v13

    .line 289
    .line 290
    if-ltz v11, :cond_0

    .line 291
    .line 292
    sub-float/2addr v0, v13

    .line 293
    goto :goto_0

    .line 294
    :goto_1
    mul-float v0, v15, v10

    .line 295
    .line 296
    div-float/2addr v0, v3

    .line 297
    iget v11, v1, Lum0;->c:F

    .line 298
    .line 299
    mul-float/2addr v2, v11

    .line 300
    div-float/2addr v2, v9

    .line 301
    move v11, v3

    .line 302
    move/from16 p0, v4

    .line 303
    .line 304
    float-to-double v3, v2

    .line 305
    iget v2, v1, Lum0;->j:F

    .line 306
    .line 307
    mul-float/2addr v2, v5

    .line 308
    move/from16 v16, v6

    .line 309
    .line 310
    move v14, v7

    .line 311
    float-to-double v6, v2

    .line 312
    invoke-static {v3, v4, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 313
    .line 314
    .line 315
    move-result-wide v2

    .line 316
    double-to-float v2, v2

    .line 317
    mul-float v17, v2, v14

    .line 318
    .line 319
    float-to-double v2, v15

    .line 320
    const-wide v6, 0x403423d70a3d70a4L    # 20.14

    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    cmpg-double v2, v2, v6

    .line 326
    .line 327
    if-gez v2, :cond_2

    .line 328
    .line 329
    add-float/2addr v13, v15

    .line 330
    goto :goto_2

    .line 331
    :cond_2
    move v13, v15

    .line 332
    :goto_2
    mul-float/2addr v13, v10

    .line 333
    div-float/2addr v13, v11

    .line 334
    add-float v13, v13, v16

    .line 335
    .line 336
    float-to-double v2, v13

    .line 337
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 338
    .line 339
    .line 340
    move-result-wide v2

    .line 341
    double-to-float v2, v2

    .line 342
    const v3, 0x40733333    # 3.8f

    .line 343
    .line 344
    .line 345
    add-float/2addr v2, v3

    .line 346
    const/high16 v3, 0x3e800000    # 0.25f

    .line 347
    .line 348
    mul-float/2addr v2, v3

    .line 349
    const v3, 0x45706276

    .line 350
    .line 351
    .line 352
    mul-float/2addr v2, v3

    .line 353
    iget v3, v1, Lum0;->f:F

    .line 354
    .line 355
    mul-float/2addr v2, v3

    .line 356
    iget v3, v1, Lum0;->d:F

    .line 357
    .line 358
    mul-float/2addr v2, v3

    .line 359
    mul-float/2addr v8, v8

    .line 360
    mul-float v4, p0, p0

    .line 361
    .line 362
    add-float/2addr v4, v8

    .line 363
    float-to-double v3, v4

    .line 364
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 365
    .line 366
    .line 367
    move-result-wide v3

    .line 368
    double-to-float v3, v3

    .line 369
    mul-float/2addr v2, v3

    .line 370
    const v3, 0x3e9c28f6    # 0.305f

    .line 371
    .line 372
    .line 373
    add-float/2addr v12, v3

    .line 374
    div-float/2addr v2, v12

    .line 375
    float-to-double v2, v2

    .line 376
    const-wide v6, 0x3fecccccc0000000L    # 0.8999999761581421

    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 382
    .line 383
    .line 384
    move-result-wide v2

    .line 385
    double-to-float v2, v2

    .line 386
    iget v3, v1, Lum0;->a:F

    .line 387
    .line 388
    float-to-double v3, v3

    .line 389
    const-wide v6, 0x3fd28f5c20000000L    # 0.28999999165534973

    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    invoke-static {v6, v7, v3, v4}, Ljava/lang/Math;->pow(DD)D

    .line 395
    .line 396
    .line 397
    move-result-wide v3

    .line 398
    double-to-float v3, v3

    .line 399
    const v4, 0x3fd1eb85    # 1.64f

    .line 400
    .line 401
    .line 402
    sub-float/2addr v4, v3

    .line 403
    float-to-double v3, v4

    .line 404
    const-wide v6, 0x3fe75c2900000000L    # 0.7300000190734863

    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    invoke-static {v3, v4, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 410
    .line 411
    .line 412
    move-result-wide v3

    .line 413
    double-to-float v3, v3

    .line 414
    mul-float/2addr v2, v3

    .line 415
    div-float v3, v17, v14

    .line 416
    .line 417
    float-to-double v3, v3

    .line 418
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 419
    .line 420
    .line 421
    move-result-wide v3

    .line 422
    double-to-float v3, v3

    .line 423
    mul-float v16, v2, v3

    .line 424
    .line 425
    iget v1, v1, Lum0;->i:F

    .line 426
    .line 427
    mul-float v1, v1, v16

    .line 428
    .line 429
    mul-float/2addr v2, v5

    .line 430
    const/high16 v3, 0x40800000    # 4.0f

    .line 431
    .line 432
    add-float/2addr v9, v3

    .line 433
    div-float/2addr v2, v9

    .line 434
    float-to-double v2, v2

    .line 435
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 436
    .line 437
    .line 438
    const v2, 0x3fd9999a    # 1.7f

    .line 439
    .line 440
    .line 441
    mul-float v2, v2, v17

    .line 442
    .line 443
    const v3, 0x3be56042    # 0.007f

    .line 444
    .line 445
    .line 446
    mul-float v3, v3, v17

    .line 447
    .line 448
    const/high16 v4, 0x3f800000    # 1.0f

    .line 449
    .line 450
    add-float/2addr v3, v4

    .line 451
    div-float v18, v2, v3

    .line 452
    .line 453
    const v2, 0x3cbac711    # 0.0228f

    .line 454
    .line 455
    .line 456
    mul-float/2addr v1, v2

    .line 457
    add-float/2addr v1, v4

    .line 458
    float-to-double v1, v1

    .line 459
    invoke-static {v1, v2}, Ljava/lang/Math;->log(D)D

    .line 460
    .line 461
    .line 462
    move-result-wide v1

    .line 463
    double-to-float v1, v1

    .line 464
    const v2, 0x422f7048

    .line 465
    .line 466
    .line 467
    mul-float/2addr v1, v2

    .line 468
    float-to-double v2, v0

    .line 469
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 470
    .line 471
    .line 472
    move-result-wide v4

    .line 473
    double-to-float v0, v4

    .line 474
    mul-float v19, v1, v0

    .line 475
    .line 476
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 477
    .line 478
    .line 479
    move-result-wide v2

    .line 480
    double-to-float v0, v2

    .line 481
    mul-float v20, v1, v0

    .line 482
    .line 483
    new-instance v14, Lfp;

    .line 484
    .line 485
    invoke-direct/range {v14 .. v20}, Lfp;-><init>(FFFFFF)V

    .line 486
    .line 487
    .line 488
    return-object v14
.end method

.method public static t(FFF)Lfp;
    .locals 11

    .line 1
    sget-object v0, Lum0;->k:Lum0;

    .line 2
    .line 3
    iget v1, v0, Lum0;->i:F

    .line 4
    .line 5
    mul-float/2addr v1, p1

    .line 6
    float-to-double v2, p0

    .line 7
    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    .line 8
    .line 9
    div-double/2addr v2, v4

    .line 10
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    double-to-float v2, v2

    .line 15
    div-float v2, p1, v2

    .line 16
    .line 17
    iget v3, v0, Lum0;->e:F

    .line 18
    .line 19
    mul-float/2addr v2, v3

    .line 20
    iget v0, v0, Lum0;->b:F

    .line 21
    .line 22
    const/high16 v3, 0x40800000    # 4.0f

    .line 23
    .line 24
    add-float/2addr v0, v3

    .line 25
    div-float/2addr v2, v0

    .line 26
    float-to-double v2, v2

    .line 27
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 28
    .line 29
    .line 30
    const v0, 0x40490fdb    # (float)Math.PI

    .line 31
    .line 32
    .line 33
    mul-float/2addr v0, p2

    .line 34
    const/high16 v2, 0x43340000    # 180.0f

    .line 35
    .line 36
    div-float/2addr v0, v2

    .line 37
    const v2, 0x3fd9999a    # 1.7f

    .line 38
    .line 39
    .line 40
    mul-float/2addr v2, p0

    .line 41
    const v3, 0x3be56042    # 0.007f

    .line 42
    .line 43
    .line 44
    mul-float/2addr v3, p0

    .line 45
    const/high16 v4, 0x3f800000    # 1.0f

    .line 46
    .line 47
    add-float/2addr v3, v4

    .line 48
    div-float v8, v2, v3

    .line 49
    .line 50
    const-wide v2, 0x3f9758e219652bd4L    # 0.0228

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    float-to-double v4, v1

    .line 56
    mul-double/2addr v4, v2

    .line 57
    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 58
    .line 59
    add-double/2addr v4, v1

    .line 60
    invoke-static {v4, v5}, Ljava/lang/Math;->log(D)D

    .line 61
    .line 62
    .line 63
    move-result-wide v1

    .line 64
    double-to-float v1, v1

    .line 65
    const v2, 0x422f7048

    .line 66
    .line 67
    .line 68
    mul-float/2addr v1, v2

    .line 69
    float-to-double v2, v0

    .line 70
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 71
    .line 72
    .line 73
    move-result-wide v4

    .line 74
    double-to-float v0, v4

    .line 75
    mul-float v9, v1, v0

    .line 76
    .line 77
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 78
    .line 79
    .line 80
    move-result-wide v2

    .line 81
    double-to-float v0, v2

    .line 82
    mul-float v10, v1, v0

    .line 83
    .line 84
    new-instance v4, Lfp;

    .line 85
    .line 86
    move v7, p0

    .line 87
    move v6, p1

    .line 88
    move v5, p2

    .line 89
    invoke-direct/range {v4 .. v10}, Lfp;-><init>(FFFFFF)V

    .line 90
    .line 91
    .line 92
    return-object v4
.end method

.method public static u(Lvu0;)Ljava/lang/String;
    .locals 11

    .line 1
    sget-object v0, Lup0;->i:Landroid/content/Context;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    new-instance v2, Ljava/io/File;

    .line 7
    .line 8
    sget-object v3, Lup0;->l:Ljava/lang/String;

    .line 9
    .line 10
    if-eqz v3, :cond_1

    .line 11
    .line 12
    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    invoke-virtual {v2}, Ljava/io/File;->lastModified()J

    .line 20
    .line 21
    .line 22
    move-result-wide v5

    .line 23
    new-instance v2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v7, "NukeModuleSign{moduleVersionName = 1.0.2(release), moduleVersionCode = 234, buildTime = 1785243782422, apkLength = "

    .line 26
    .line 27
    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v3, ", apkLastModified = "

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v3, "}"

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    sget-object v4, Lyp1;->a:[I

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    aget v4, v4, v5

    .line 57
    .line 58
    const/4 v5, 0x1

    .line 59
    const-string v6, ", versionCode = "

    .line 60
    .line 61
    const-string v7, ", versionName = "

    .line 62
    .line 63
    const-string v8, "NukeDexCacheSumSign{module = "

    .line 64
    .line 65
    const-string v9, "Can not get PackageInfo!"

    .line 66
    .line 67
    const/4 v10, 0x0

    .line 68
    if-ne v4, v5, :cond_0

    .line 69
    .line 70
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-virtual {v4, v5, v10}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    iget-object v4, v4, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 85
    .line 86
    .line 87
    :try_start_1
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v5, v0, v10}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    .line 101
    invoke-static {p0}, Lpp0;->y(Lvu0;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-static {v8, v2, v7, v4, v6}, Lvi0;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v0, ", patchId = "

    .line 113
    .line 114
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0

    .line 128
    :catchall_0
    invoke-static {v9}, Ls;->i(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    return-object v1

    .line 132
    :catchall_1
    invoke-static {v9}, Ls;->i(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    return-object v1

    .line 136
    :cond_0
    :try_start_2
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-virtual {p0, v4, v10}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 149
    .line 150
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 151
    .line 152
    .line 153
    :try_start_3
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {v4, v0, v10}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 166
    .line 167
    invoke-static {v8, v2, v7, p0, v6}, Lvi0;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    return-object p0

    .line 182
    :catchall_2
    invoke-static {v9}, Ls;->i(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    return-object v1

    .line 186
    :catchall_3
    invoke-static {v9}, Ls;->i(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    return-object v1

    .line 190
    :cond_1
    const-string p0, "moduleApkPath"

    .line 191
    .line 192
    invoke-static {p0}, Lt11;->S(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw v1

    .line 196
    :cond_2
    const-string p0, "hostContext"

    .line 197
    .line 198
    invoke-static {p0}, Lt11;->S(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw v1
.end method

.method public static final v()Lsx0;
    .locals 12

    .line 1
    sget-object v0, Lpp0;->k:Lsx0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v1, Lrx0;

    .line 7
    .line 8
    const/4 v9, 0x0

    .line 9
    const/16 v11, 0x60

    .line 10
    .line 11
    const-string v2, "Filled.Info"

    .line 12
    .line 13
    const/high16 v3, 0x41c00000    # 24.0f

    .line 14
    .line 15
    const/high16 v4, 0x41c00000    # 24.0f

    .line 16
    .line 17
    const/high16 v5, 0x41c00000    # 24.0f

    .line 18
    .line 19
    const/high16 v6, 0x41c00000    # 24.0f

    .line 20
    .line 21
    const-wide/16 v7, 0x0

    .line 22
    .line 23
    const/4 v10, 0x0

    .line 24
    invoke-direct/range {v1 .. v11}, Lrx0;-><init>(Ljava/lang/String;FFFFJIZI)V

    .line 25
    .line 26
    .line 27
    sget v0, Ls93;->a:I

    .line 28
    .line 29
    new-instance v0, Lft2;

    .line 30
    .line 31
    sget-wide v2, Lju;->b:J

    .line 32
    .line 33
    invoke-direct {v0, v2, v3}, Lft2;-><init>(J)V

    .line 34
    .line 35
    .line 36
    new-instance v4, Lye0;

    .line 37
    .line 38
    const/4 v2, 0x3

    .line 39
    invoke-direct {v4, v2}, Lye0;-><init>(I)V

    .line 40
    .line 41
    .line 42
    const/high16 v2, 0x41400000    # 12.0f

    .line 43
    .line 44
    const/high16 v3, 0x40000000    # 2.0f

    .line 45
    .line 46
    invoke-virtual {v4, v2, v3}, Lye0;->k(FF)V

    .line 47
    .line 48
    .line 49
    const/high16 v9, 0x40000000    # 2.0f

    .line 50
    .line 51
    const/high16 v10, 0x41400000    # 12.0f

    .line 52
    .line 53
    const v5, 0x40cf5c29    # 6.48f

    .line 54
    .line 55
    .line 56
    const/high16 v6, 0x40000000    # 2.0f

    .line 57
    .line 58
    const/high16 v7, 0x40000000    # 2.0f

    .line 59
    .line 60
    const v8, 0x40cf5c29    # 6.48f

    .line 61
    .line 62
    .line 63
    invoke-virtual/range {v4 .. v10}, Lye0;->d(FFFFFF)V

    .line 64
    .line 65
    .line 66
    const v5, 0x408f5c29    # 4.48f

    .line 67
    .line 68
    .line 69
    const/high16 v6, 0x41200000    # 10.0f

    .line 70
    .line 71
    invoke-virtual {v4, v5, v6, v6, v6}, Lye0;->m(FFFF)V

    .line 72
    .line 73
    .line 74
    const v5, -0x3f70a3d7    # -4.48f

    .line 75
    .line 76
    .line 77
    const/high16 v7, -0x3ee00000    # -10.0f

    .line 78
    .line 79
    invoke-virtual {v4, v6, v5, v6, v7}, Lye0;->m(FFFF)V

    .line 80
    .line 81
    .line 82
    const v5, 0x418c28f6    # 17.52f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4, v5, v3, v2, v3}, Lye0;->l(FFFF)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4}, Lye0;->c()V

    .line 89
    .line 90
    .line 91
    const/high16 v2, 0x41880000    # 17.0f

    .line 92
    .line 93
    const/high16 v5, 0x41500000    # 13.0f

    .line 94
    .line 95
    invoke-virtual {v4, v5, v2}, Lye0;->k(FF)V

    .line 96
    .line 97
    .line 98
    const/high16 v2, -0x40000000    # -2.0f

    .line 99
    .line 100
    invoke-virtual {v4, v2}, Lye0;->h(F)V

    .line 101
    .line 102
    .line 103
    const/high16 v6, -0x3f400000    # -6.0f

    .line 104
    .line 105
    invoke-virtual {v4, v6}, Lye0;->o(F)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4, v3}, Lye0;->h(F)V

    .line 109
    .line 110
    .line 111
    const/high16 v6, 0x40c00000    # 6.0f

    .line 112
    .line 113
    invoke-virtual {v4, v6}, Lye0;->o(F)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4}, Lye0;->c()V

    .line 117
    .line 118
    .line 119
    const/high16 v6, 0x41100000    # 9.0f

    .line 120
    .line 121
    invoke-virtual {v4, v5, v6}, Lye0;->k(FF)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v4, v2}, Lye0;->h(F)V

    .line 125
    .line 126
    .line 127
    const/high16 v2, 0x41300000    # 11.0f

    .line 128
    .line 129
    const/high16 v5, 0x40e00000    # 7.0f

    .line 130
    .line 131
    invoke-virtual {v4, v2, v5}, Lye0;->i(FF)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4, v3}, Lye0;->h(F)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v4, v3}, Lye0;->o(F)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4}, Lye0;->c()V

    .line 141
    .line 142
    .line 143
    iget-object v2, v4, Lye0;->a:Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-static {v1, v2, v0}, Lrx0;->a(Lrx0;Ljava/util/ArrayList;Lft2;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1}, Lrx0;->b()Lsx0;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    sput-object v0, Lpp0;->k:Lsx0;

    .line 153
    .line 154
    return-object v0
.end method

.method public static final w(Lq9;)Landroid/graphics/Paint;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received "

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Lbt;->b()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Ljz0;->a(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object p0, p0, Lq9;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Landroid/graphics/Paint;

    .line 35
    .line 36
    return-object p0
.end method

.method public static final x(Lln2;Lyn2;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lln2;->h:Lrk1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    :cond_0
    return-object p0
.end method

.method public static y(Lvu0;)Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lvu0;->i:Lvu0;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    if-eq p0, v0, :cond_0

    .line 6
    .line 7
    return-object v1

    .line 8
    :cond_0
    :try_start_0
    const-string p0, "com.tencent.mm.boot.BuildConfig"

    .line 9
    .line 10
    invoke-static {p0}, Lup0;->H(Ljava/lang/String;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ln4;->r()Lhi0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v2, "CLIENT_VERSION_ARM64"

    .line 23
    .line 24
    iput-object v2, v0, Lzf1;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0}, Lhi0;->c()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lpi0;

    .line 35
    .line 36
    invoke-virtual {v0}, Lpi0;->g0()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {p0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Ln4;->r()Lhi0;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const-string v2, "AAB_ENABLED"

    .line 53
    .line 54
    iput-object v2, p0, Lzf1;->b:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {p0}, Lhi0;->c()Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-static {p0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, Lpi0;

    .line 65
    .line 66
    invoke-virtual {p0}, Lpi0;->g0()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    check-cast p0, Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    if-eqz p0, :cond_1

    .line 80
    .line 81
    const-string p0, "traditional"

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :catchall_0
    move-exception p0

    .line 85
    goto :goto_1

    .line 86
    :cond_1
    const-string p0, "googlePlay"

    .line 87
    .line 88
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string p0, "-"

    .line 97
    .line 98
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    goto :goto_2

    .line 109
    :goto_1
    new-instance v0, Lx92;

    .line 110
    .line 111
    invoke-direct {v0, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    move-object p0, v0

    .line 115
    :goto_2
    nop

    .line 116
    instance-of v0, p0, Lx92;

    .line 117
    .line 118
    if-eqz v0, :cond_2

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_2
    move-object v1, p0

    .line 122
    :goto_3
    check-cast v1, Ljava/lang/String;

    .line 123
    .line 124
    return-object v1
.end method

.method public static z(Landroid/content/pm/PackageInfo;Ljava/io/File;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    const-string v1, "profileinstaller_profileWrittenFor_lastUpdateTime.dat"

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    new-instance p1, Ljava/io/DataOutputStream;

    .line 9
    .line 10
    new-instance v1, Ljava/io/FileOutputStream;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p1, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    :try_start_1
    iget-wide v0, p0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    .line 22
    .line 23
    :try_start_2
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    :try_start_3
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_1
    move-exception p1

    .line 33
    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    throw p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 37
    :catch_0
    return-void
.end method
