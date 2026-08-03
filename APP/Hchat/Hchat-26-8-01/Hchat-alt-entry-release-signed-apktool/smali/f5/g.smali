.class public final Lf5/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:I

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 251
    const/4 v0, 0x2

    iput v0, p0, Lf5/g;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 14

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lf5/g;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    const/16 v0, 0x100

    .line 8
    .line 9
    new-array v0, v0, [Lf5/f;

    .line 10
    .line 11
    iput-object v0, p0, Lf5/g;->d:Ljava/lang/Object;

    .line 12
    .line 13
    const/16 v0, 0x15

    .line 14
    .line 15
    const/4 v1, -0x1

    .line 16
    if-lt p1, v0, :cond_1

    .line 17
    .line 18
    iput p1, p0, Lf5/g;->b:I

    .line 19
    .line 20
    const/16 v0, 0x13

    .line 21
    .line 22
    if-ge p1, v0, :cond_0

    .line 23
    .line 24
    move p1, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    packed-switch p1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    const/16 p1, 0xb2

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :pswitch_0
    const/16 p1, 0xaa

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :pswitch_1
    const/16 p1, 0x8a

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :pswitch_2
    const/16 p1, 0x83

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :pswitch_3
    const/16 p1, 0x7c

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :pswitch_4
    const/16 p1, 0x4f

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :pswitch_5
    const/16 p1, 0x40

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :pswitch_6
    const/16 p1, 0x2d

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :pswitch_7
    const/16 p1, 0x27

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :pswitch_8
    const/4 p1, 0x7

    .line 57
    :goto_0
    iput p1, p0, Lf5/g;->c:I

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    iput p1, p0, Lf5/g;->b:I

    .line 61
    .line 62
    iput v1, p0, Lf5/g;->c:I

    .line 63
    .line 64
    :goto_1
    new-instance p1, Ljava/util/EnumMap;

    .line 65
    .line 66
    const-class v0, Lf5/f;

    .line 67
    .line 68
    invoke-direct {p1, v0}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, Lf5/g;->e:Ljava/lang/Object;

    .line 72
    .line 73
    new-instance p1, Ljava/util/HashMap;

    .line 74
    .line 75
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Lf5/g;->f:Ljava/lang/Object;

    .line 79
    .line 80
    iget p1, p0, Lf5/g;->c:I

    .line 81
    .line 82
    if-eq p1, v1, :cond_2

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_2
    iget p1, p0, Lf5/g;->b:I

    .line 86
    .line 87
    :goto_2
    invoke-static {}, Lf5/f;->values()[Lf5/f;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    array-length v2, v0

    .line 92
    const/4 v3, 0x0

    .line 93
    move v4, v3

    .line 94
    :goto_3
    if-ge v4, v2, :cond_d

    .line 95
    .line 96
    aget-object v5, v0, v4

    .line 97
    .line 98
    iget v6, p0, Lf5/g;->c:I

    .line 99
    .line 100
    if-eq v6, v1, :cond_3

    .line 101
    .line 102
    iget-object v6, v5, Lf5/f;->h:Ld6/l;

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_3
    iget-object v6, v5, Lf5/f;->g:Ld6/l;

    .line 106
    .line 107
    :goto_4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    iget-object v8, v6, Ld6/l;->a:Ljava/util/List;

    .line 112
    .line 113
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 114
    .line 115
    .line 116
    move-result v9

    .line 117
    add-int/lit8 v9, v9, -0x1

    .line 118
    .line 119
    move v10, v3

    .line 120
    :goto_5
    if-gt v10, v9, :cond_7

    .line 121
    .line 122
    add-int v11, v10, v9

    .line 123
    .line 124
    ushr-int/lit8 v11, v11, 0x1

    .line 125
    .line 126
    invoke-interface {v8, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v12

    .line 130
    check-cast v12, Ld6/i;

    .line 131
    .line 132
    invoke-virtual {v12, v7}, Ld6/i;->b(Ljava/lang/Integer;)Z

    .line 133
    .line 134
    .line 135
    move-result v13

    .line 136
    if-eqz v13, :cond_4

    .line 137
    .line 138
    goto :goto_7

    .line 139
    :cond_4
    invoke-virtual {v12}, Ld6/i;->c()Z

    .line 140
    .line 141
    .line 142
    move-result v13

    .line 143
    if-eqz v13, :cond_5

    .line 144
    .line 145
    iget-object v12, v12, Ld6/i;->a:Ljava/lang/Comparable;

    .line 146
    .line 147
    invoke-virtual {v7, v12}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 148
    .line 149
    .line 150
    move-result v12

    .line 151
    goto :goto_6

    .line 152
    :cond_5
    iget-object v12, v12, Ld6/i;->b:Ljava/lang/Comparable;

    .line 153
    .line 154
    invoke-virtual {v7, v12}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 155
    .line 156
    .line 157
    move-result v12

    .line 158
    :goto_6
    if-lez v12, :cond_6

    .line 159
    .line 160
    add-int/lit8 v10, v11, 0x1

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_6
    if-gez v12, :cond_8

    .line 164
    .line 165
    add-int/lit8 v11, v11, -0x1

    .line 166
    .line 167
    move v9, v11

    .line 168
    goto :goto_5

    .line 169
    :cond_7
    move v11, v1

    .line 170
    :cond_8
    :goto_7
    const/4 v9, 0x0

    .line 171
    if-ne v11, v1, :cond_9

    .line 172
    .line 173
    goto :goto_8

    .line 174
    :cond_9
    invoke-interface {v8, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v8

    .line 178
    check-cast v8, Ld6/i;

    .line 179
    .line 180
    invoke-virtual {v8, v7}, Ld6/i;->b(Ljava/lang/Integer;)Z

    .line 181
    .line 182
    .line 183
    move-result v7

    .line 184
    if-eqz v7, :cond_a

    .line 185
    .line 186
    iget-object v6, v6, Ld6/l;->b:Ljava/util/List;

    .line 187
    .line 188
    invoke-interface {v6, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v9

    .line 192
    :cond_a
    :goto_8
    check-cast v9, Ljava/lang/Short;

    .line 193
    .line 194
    if-eqz v9, :cond_c

    .line 195
    .line 196
    iget v6, v5, Lf5/f;->m:I

    .line 197
    .line 198
    const/4 v7, 0x1

    .line 199
    const/4 v8, 0x0

    .line 200
    packed-switch v6, :pswitch_data_1

    .line 201
    .line 202
    .line 203
    const/4 p1, 0x0

    .line 204
    throw p1

    .line 205
    :pswitch_9
    move v7, v8

    .line 206
    :pswitch_a
    if-nez v7, :cond_b

    .line 207
    .line 208
    iget-object v6, p0, Lf5/g;->d:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v6, [Lf5/f;

    .line 211
    .line 212
    invoke-virtual {v9}, Ljava/lang/Short;->shortValue()S

    .line 213
    .line 214
    .line 215
    move-result v7

    .line 216
    aput-object v5, v6, v7

    .line 217
    .line 218
    :cond_b
    iget-object v6, p0, Lf5/g;->e:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v6, Ljava/util/EnumMap;

    .line 221
    .line 222
    invoke-virtual {v6, v5, v9}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    iget-object v6, p0, Lf5/g;->f:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v6, Ljava/util/HashMap;

    .line 228
    .line 229
    iget-object v7, v5, Lf5/f;->i:Ljava/lang/String;

    .line 230
    .line 231
    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v7

    .line 235
    invoke-virtual {v6, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    :cond_c
    add-int/lit8 v4, v4, 0x1

    .line 239
    .line 240
    goto/16 :goto_3

    .line 241
    .line 242
    :cond_d
    return-void

    .line 243
    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_9
    .end packed-switch
.end method

.method public constructor <init>(Lud/r;Lqe/a0;Lbc/g;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lf5/g;->a:I

    .line 243
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 244
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v0, p0, Lf5/g;->f:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 245
    iput v0, p0, Lf5/g;->c:I

    .line 246
    iput-object p1, p0, Lf5/g;->d:Ljava/lang/Object;

    .line 247
    iput-object p2, p0, Lf5/g;->e:Ljava/lang/Object;

    .line 248
    iget p1, p1, Lud/r;->o:I

    .line 249
    iget p2, p3, Lbc/g;->I:I

    mul-int/2addr p1, p2

    .line 250
    iput p1, p0, Lf5/g;->b:I

    return-void
.end method


# virtual methods
.method public a(J)I
    .locals 7

    .line 1
    iget v0, p0, Lf5/g;->b:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iget-object v1, p0, Lf5/g;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [J

    .line 8
    .line 9
    array-length v2, v1

    .line 10
    const/16 v3, 0xe

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    if-gt v0, v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    mul-int/lit8 v2, v2, 0x2

    .line 17
    .line 18
    new-array v0, v2, [J

    .line 19
    .line 20
    new-array v2, v2, [I

    .line 21
    .line 22
    array-length v5, v1

    .line 23
    invoke-static {v1, v0, v4, v4, v5}, Ltf/l;->q0([J[JIII)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lf5/g;->e:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, [I

    .line 29
    .line 30
    invoke-static {v1, v2, v4, v4, v3}, Ltf/l;->s0([I[IIII)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lf5/g;->d:Ljava/lang/Object;

    .line 34
    .line 35
    iput-object v2, p0, Lf5/g;->e:Ljava/lang/Object;

    .line 36
    .line 37
    :goto_0
    iget v0, p0, Lf5/g;->b:I

    .line 38
    .line 39
    add-int/lit8 v1, v0, 0x1

    .line 40
    .line 41
    iput v1, p0, Lf5/g;->b:I

    .line 42
    .line 43
    iget-object v1, p0, Lf5/g;->f:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, [I

    .line 46
    .line 47
    array-length v1, v1

    .line 48
    iget v2, p0, Lf5/g;->c:I

    .line 49
    .line 50
    if-lt v2, v1, :cond_2

    .line 51
    .line 52
    mul-int/lit8 v1, v1, 0x2

    .line 53
    .line 54
    new-array v2, v1, [I

    .line 55
    .line 56
    move v5, v4

    .line 57
    :goto_1
    if-ge v5, v1, :cond_1

    .line 58
    .line 59
    add-int/lit8 v6, v5, 0x1

    .line 60
    .line 61
    aput v6, v2, v5

    .line 62
    .line 63
    move v5, v6

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    iget-object v1, p0, Lf5/g;->f:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v1, [I

    .line 68
    .line 69
    invoke-static {v1, v2, v4, v4, v3}, Ltf/l;->s0([I[IIII)V

    .line 70
    .line 71
    .line 72
    iput-object v2, p0, Lf5/g;->f:Ljava/lang/Object;

    .line 73
    .line 74
    :cond_2
    iget v1, p0, Lf5/g;->c:I

    .line 75
    .line 76
    iget-object v2, p0, Lf5/g;->f:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v2, [I

    .line 79
    .line 80
    aget v3, v2, v1

    .line 81
    .line 82
    iput v3, p0, Lf5/g;->c:I

    .line 83
    .line 84
    iget-object v3, p0, Lf5/g;->d:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v3, [J

    .line 87
    .line 88
    aput-wide p1, v3, v0

    .line 89
    .line 90
    iget-object v4, p0, Lf5/g;->e:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v4, [I

    .line 93
    .line 94
    aput v1, v4, v0

    .line 95
    .line 96
    aput v0, v2, v1

    .line 97
    .line 98
    :goto_2
    if-lez v0, :cond_3

    .line 99
    .line 100
    add-int/lit8 v2, v0, 0x1

    .line 101
    .line 102
    shr-int/lit8 v2, v2, 0x1

    .line 103
    .line 104
    add-int/lit8 v2, v2, -0x1

    .line 105
    .line 106
    aget-wide v4, v3, v2

    .line 107
    .line 108
    invoke-static {v4, v5, p1, p2}, Lgg/l;->d(JJ)I

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-lez v4, :cond_3

    .line 113
    .line 114
    invoke-virtual {p0, v2, v0}, Lf5/g;->d(II)V

    .line 115
    .line 116
    .line 117
    move v0, v2

    .line 118
    goto :goto_2

    .line 119
    :cond_3
    return v1
.end method

.method public b(Lqd/l;)Lqd/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lf5/g;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/IdentityHashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lqe/y;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object p1, v0, Lqe/y;->i:Lqd/j;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    invoke-virtual {p1}, Lqd/l;->I()Lqd/j;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public c(Lqd/l;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lf5/g;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/IdentityHashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lqe/y;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget p1, p1, Lqe/y;->g:I

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->values()Ljava/util/Collection;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Lqe/b0;

    .line 20
    .line 21
    invoke-direct {v1, p1}, Lqe/b0;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v1}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public d(II)V
    .locals 7

    .line 1
    iget-object v0, p0, Lf5/g;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [J

    .line 4
    .line 5
    iget-object v1, p0, Lf5/g;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [I

    .line 8
    .line 9
    iget-object v2, p0, Lf5/g;->f:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, [I

    .line 12
    .line 13
    aget-wide v3, v0, p1

    .line 14
    .line 15
    aget-wide v5, v0, p2

    .line 16
    .line 17
    aput-wide v5, v0, p1

    .line 18
    .line 19
    aput-wide v3, v0, p2

    .line 20
    .line 21
    aget v0, v1, p1

    .line 22
    .line 23
    aget v3, v1, p2

    .line 24
    .line 25
    aput v3, v1, p1

    .line 26
    .line 27
    aput v0, v1, p2

    .line 28
    .line 29
    aput p1, v2, v3

    .line 30
    .line 31
    aput p2, v2, v0

    .line 32
    .line 33
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, Lf5/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lf5/g;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lqe/a0;

    .line 14
    .line 15
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lf5/g;->f:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Ljava/util/IdentityHashMap;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/IdentityHashMap;->values()Ljava/util/Collection;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-interface {v1}, Ljava/util/stream/Stream;->sorted()Ljava/util/stream/Stream;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Ljava/util/List;

    .line 44
    .line 45
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-string v2, " "

    .line 50
    .line 51
    const-string v3, "}"

    .line 52
    .line 53
    const-string v4, "TypeUpdateInfo{"

    .line 54
    .line 55
    invoke-static {v4, v0, v2, v1, v3}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    return-object v0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
