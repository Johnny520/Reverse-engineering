.class public final Lta/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final g:[Ljava/lang/String;


# instance fields
.field public final a:Ll3/l;

.field public final b:Lna/k;

.field public final c:Lna/b;

.field public final d:Lna/b;

.field public final e:Lb5/c;

.field public final f:Ljava/util/Random;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "{@sender}"

    .line 2
    .line 3
    const-string v1, "{@\u6210\u5458}"

    .line 4
    .line 5
    const-string v2, "{@\u53d1\u7ea2\u5305\u7684\u4eba}"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lta/c;->g:[Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Ll3/l;Lna/k;Lna/b;Lna/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/Random;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lta/c;->f:Ljava/util/Random;

    .line 10
    .line 11
    iput-object p1, p0, Lta/c;->a:Ll3/l;

    .line 12
    .line 13
    iput-object p2, p0, Lta/c;->b:Lna/k;

    .line 14
    .line 15
    iput-object p3, p0, Lta/c;->c:Lna/b;

    .line 16
    .line 17
    iput-object p4, p0, Lta/c;->d:Lna/b;

    .line 18
    .line 19
    new-instance p3, Lb5/c;

    .line 20
    .line 21
    new-instance p4, Lq9/a;

    .line 22
    .line 23
    const/16 v0, 0x8

    .line 24
    .line 25
    invoke-direct {p4, p0, v0}, Lq9/a;-><init>(Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p3, p2, p1, p4}, Lb5/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iput-object p3, p0, Lta/c;->e:Lb5/c;

    .line 32
    .line 33
    return-void
.end method

.method public static f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Z
    .locals 2

    .line 1
    invoke-static {}, Lp/a;->q()Lk8/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    packed-switch p0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    :pswitch_0
    goto :goto_1

    .line 13
    :pswitch_1
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object p0, v1, Lj8/p;->f:Lj8/h;

    .line 16
    .line 17
    invoke-virtual {p0, p1, p2}, Lj8/h;->A(Ljava/lang/String;Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :pswitch_2
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0, p1, p2}, Lk8/g;->z(Ljava/lang/String;Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :pswitch_3
    if-eqz v1, :cond_0

    .line 34
    .line 35
    iget-object p0, v1, Lj8/p;->e:Landroidx/lifecycle/x;

    .line 36
    .line 37
    const-string p3, ""

    .line 38
    .line 39
    invoke-virtual {p0, p1, p2, p3}, Landroidx/lifecycle/x;->T(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :pswitch_4
    if-eqz v1, :cond_0

    .line 47
    .line 48
    iget-object p0, v1, Lj8/p;->d:Lj8/f;

    .line 49
    .line 50
    invoke-virtual {p0, p1, p2}, Lj8/f;->v(Ljava/lang/String;Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :pswitch_5
    if-eqz v1, :cond_0

    .line 58
    .line 59
    iget-object p0, v1, Lj8/p;->c:Lbb/b;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, Lbb/b;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :pswitch_6
    if-eqz v1, :cond_0

    .line 69
    .line 70
    iget-object p0, v1, Lj8/p;->b:Lj8/y;

    .line 71
    .line 72
    invoke-virtual {p0, p1, p2}, Lj8/y;->t(Ljava/lang/String;Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-eqz p0, :cond_0

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :pswitch_7
    if-eqz v1, :cond_0

    .line 80
    .line 81
    invoke-virtual {v1, p1, p2}, Lj8/p;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    if-eqz p0, :cond_0

    .line 86
    .line 87
    :goto_0
    const/4 p0, 0x1

    .line 88
    return p0

    .line 89
    :pswitch_8
    if-nez v0, :cond_1

    .line 90
    .line 91
    :cond_0
    :goto_1
    const/4 p0, 0x0

    .line 92
    return p0

    .line 93
    :cond_1
    if-eqz p4, :cond_2

    .line 94
    .line 95
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    if-nez p0, :cond_2

    .line 100
    .line 101
    new-instance p0, Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, p1, p2, p0}, Lk8/g;->y(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    return p0

    .line 114
    :cond_2
    invoke-virtual {v0, p1, p2}, Lk8/g;->x(Ljava/lang/String;Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    return p0

    .line 119
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    if-eqz p2, :cond_16

    .line 9
    .line 10
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    goto/16 :goto_d

    .line 17
    .line 18
    :cond_0
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_16

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Lna/h;

    .line 33
    .line 34
    iget-object v4, v3, Lna/h;->c:Ljava/lang/String;

    .line 35
    .line 36
    iget v5, v3, Lna/h;->b:I

    .line 37
    .line 38
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    const/4 v7, 0x0

    .line 43
    if-eqz v6, :cond_2

    .line 44
    .line 45
    const-string v4, ""

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    :try_start_0
    const-string v6, "\\|"

    .line 49
    .line 50
    invoke-virtual {v4, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    new-instance v8, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    array-length v9, v6

    .line 60
    move v10, v7

    .line 61
    :goto_1
    if-ge v10, v9, :cond_4

    .line 62
    .line 63
    aget-object v11, v6, v10

    .line 64
    .line 65
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 66
    .line 67
    .line 68
    move-result v12

    .line 69
    if-nez v12, :cond_3

    .line 70
    .line 71
    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v12

    .line 75
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 76
    .line 77
    .line 78
    move-result v12

    .line 79
    if-nez v12, :cond_3

    .line 80
    .line 81
    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v11

    .line 85
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    :cond_3
    add-int/lit8 v10, v10, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-eqz v6, :cond_5

    .line 96
    .line 97
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    goto :goto_2

    .line 102
    :cond_5
    iget-object v6, v0, Lta/c;->f:Ljava/util/Random;

    .line 103
    .line 104
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    invoke-virtual {v6, v9}, Ljava/util/Random;->nextInt(I)I

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    check-cast v6, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    .line 118
    move-object v4, v6

    .line 119
    :catchall_0
    :goto_2
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    const/4 v8, 0x1

    .line 124
    const/4 v9, 0x2

    .line 125
    if-eqz v6, :cond_6

    .line 126
    .line 127
    const/4 v4, 0x0

    .line 128
    move-object/from16 v10, p1

    .line 129
    .line 130
    move-object/from16 v11, p3

    .line 131
    .line 132
    move-object/from16 v12, p4

    .line 133
    .line 134
    goto/16 :goto_b

    .line 135
    .line 136
    :cond_6
    if-ne v5, v9, :cond_7

    .line 137
    .line 138
    move v6, v8

    .line 139
    goto :goto_3

    .line 140
    :cond_7
    move v6, v7

    .line 141
    :goto_3
    const/4 v10, 0x3

    .line 142
    sget-object v11, Lta/c;->g:[Ljava/lang/String;

    .line 143
    .line 144
    if-eqz v6, :cond_b

    .line 145
    .line 146
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 147
    .line 148
    .line 149
    move-result v12

    .line 150
    if-eqz v12, :cond_8

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_8
    move v12, v7

    .line 154
    :goto_4
    if-ge v12, v10, :cond_a

    .line 155
    .line 156
    aget-object v13, v11, v12

    .line 157
    .line 158
    invoke-virtual {v4, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 159
    .line 160
    .line 161
    move-result v13

    .line 162
    if-eqz v13, :cond_9

    .line 163
    .line 164
    goto :goto_6

    .line 165
    :cond_9
    add-int/lit8 v12, v12, 0x1

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_a
    :goto_5
    const-string v12, "{@\u53d1\u7ea2\u5305\u7684\u4eba}"

    .line 169
    .line 170
    invoke-static {v12, v4}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    :cond_b
    :goto_6
    if-eq v5, v8, :cond_c

    .line 175
    .line 176
    if-eqz v6, :cond_f

    .line 177
    .line 178
    :cond_c
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    if-eqz v6, :cond_d

    .line 183
    .line 184
    goto :goto_8

    .line 185
    :cond_d
    move v6, v7

    .line 186
    :goto_7
    if-ge v6, v10, :cond_f

    .line 187
    .line 188
    aget-object v12, v11, v6

    .line 189
    .line 190
    invoke-virtual {v4, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 191
    .line 192
    .line 193
    move-result v12

    .line 194
    if-eqz v12, :cond_e

    .line 195
    .line 196
    move v7, v8

    .line 197
    goto :goto_8

    .line 198
    :cond_e
    add-int/lit8 v6, v6, 0x1

    .line 199
    .line 200
    goto :goto_7

    .line 201
    :cond_f
    :goto_8
    if-eq v5, v8, :cond_11

    .line 202
    .line 203
    if-eq v5, v9, :cond_11

    .line 204
    .line 205
    const/16 v6, 0x8

    .line 206
    .line 207
    if-ne v5, v6, :cond_10

    .line 208
    .line 209
    goto :goto_9

    .line 210
    :cond_10
    move-object/from16 v10, p1

    .line 211
    .line 212
    move-object/from16 v11, p3

    .line 213
    .line 214
    move-object/from16 v12, p4

    .line 215
    .line 216
    goto :goto_a

    .line 217
    :cond_11
    :goto_9
    iget-object v6, v0, Lta/c;->e:Lb5/c;

    .line 218
    .line 219
    move-object/from16 v10, p1

    .line 220
    .line 221
    move-object/from16 v11, p3

    .line 222
    .line 223
    move-object/from16 v12, p4

    .line 224
    .line 225
    invoke-virtual {v6, v4, v10, v11, v12}, Lb5/c;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    :goto_a
    new-instance v6, Lfd/h;

    .line 230
    .line 231
    invoke-direct {v6, v4, v7}, Lfd/h;-><init>(Ljava/lang/Object;Z)V

    .line 232
    .line 233
    .line 234
    move-object v4, v6

    .line 235
    :goto_b
    if-eqz v4, :cond_1

    .line 236
    .line 237
    iget-object v6, v4, Lfd/h;->h:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v6, Ljava/lang/String;

    .line 240
    .line 241
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 242
    .line 243
    .line 244
    move-result v6

    .line 245
    if-eqz v6, :cond_12

    .line 246
    .line 247
    goto/16 :goto_0

    .line 248
    .line 249
    :cond_12
    new-instance v13, Lta/b;

    .line 250
    .line 251
    if-ne v5, v9, :cond_13

    .line 252
    .line 253
    move v14, v8

    .line 254
    goto :goto_c

    .line 255
    :cond_13
    move v14, v5

    .line 256
    :goto_c
    iget-object v5, v4, Lfd/h;->h:Ljava/lang/Object;

    .line 257
    .line 258
    move-object/from16 v17, v5

    .line 259
    .line 260
    check-cast v17, Ljava/lang/String;

    .line 261
    .line 262
    iget-boolean v4, v4, Lfd/h;->g:Z

    .line 263
    .line 264
    iget-wide v5, v3, Lna/h;->d:J

    .line 265
    .line 266
    const-wide/16 v7, 0x0

    .line 267
    .line 268
    cmp-long v9, v5, v7

    .line 269
    .line 270
    if-gez v9, :cond_14

    .line 271
    .line 272
    move-wide v5, v7

    .line 273
    :cond_14
    iget-boolean v3, v3, Lna/h;->e:Z

    .line 274
    .line 275
    move-object/from16 p2, v2

    .line 276
    .line 277
    if-eqz v3, :cond_15

    .line 278
    .line 279
    const-wide/16 v2, 0x7d1

    .line 280
    .line 281
    sget-object v9, Ljg/d;->g:Ljg/a;

    .line 282
    .line 283
    invoke-virtual {v9, v7, v8, v2, v3}, Ljg/d;->e(JJ)J

    .line 284
    .line 285
    .line 286
    move-result-wide v2

    .line 287
    add-long/2addr v5, v2

    .line 288
    :cond_15
    move/from16 v18, v4

    .line 289
    .line 290
    move-wide v15, v5

    .line 291
    invoke-direct/range {v13 .. v18}, Lta/b;-><init>(IJLjava/lang/String;Z)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-object/from16 v2, p2

    .line 298
    .line 299
    goto/16 :goto_0

    .line 300
    .line 301
    :cond_16
    :goto_d
    return-object v1
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lta/c;->d:Lna/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lna/b;->h:Lna/e;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lna/e;->d(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 13

    .line 1
    move-object/from16 v2, p3

    .line 2
    .line 3
    const-string v3, "\u81ea\u52a8\u56de\u590d\u8df3\u8fc7: \u5df2\u5904\u7406 "

    .line 4
    .line 5
    const-string v4, "redpacket_reply:"

    .line 6
    .line 7
    :try_start_0
    iget-object v5, p0, Lta/c;->a:Ll3/l;

    .line 8
    .line 9
    const-string v6, "hb_reply_enable"

    .line 10
    .line 11
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    :try_start_1
    invoke-virtual {v5}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 20
    .line 21
    .line 22
    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move v5, v7

    .line 25
    :goto_0
    if-nez v5, :cond_0

    .line 26
    .line 27
    goto/16 :goto_6

    .line 28
    .line 29
    :cond_0
    :try_start_2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 33
    const/4 v6, 0x0

    .line 34
    iget-object v8, p0, Lta/c;->b:Lna/k;

    .line 35
    .line 36
    if-nez v5, :cond_1

    .line 37
    .line 38
    :try_start_3
    iget-object v5, v8, Lna/k;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 39
    .line 40
    invoke-virtual {v5, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    check-cast v5, Lna/a;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :catchall_1
    move-exception v0

    .line 48
    goto/16 :goto_9

    .line 49
    .line 50
    :cond_1
    move-object v5, v6

    .line 51
    :goto_1
    if-eqz v5, :cond_2

    .line 52
    .line 53
    iget-boolean v9, v5, Lna/a;->b:Z

    .line 54
    .line 55
    if-nez v9, :cond_2

    .line 56
    .line 57
    goto/16 :goto_6

    .line 58
    .line 59
    :cond_2
    if-nez p4, :cond_12

    .line 60
    .line 61
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 65
    const-string v10, ""

    .line 66
    .line 67
    if-eqz v9, :cond_3

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_3
    :try_start_4
    iget-object v9, v8, Lna/k;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 71
    .line 72
    invoke-virtual {v9, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    check-cast v9, Ljava/lang/String;

    .line 77
    .line 78
    iget-object v11, p0, Lta/c;->c:Lna/b;

    .line 79
    .line 80
    if-eqz v11, :cond_4

    .line 81
    .line 82
    iget-object v11, v11, Lna/b;->h:Lna/e;

    .line 83
    .line 84
    invoke-virtual {v11}, Lna/e;->a()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    goto :goto_2

    .line 89
    :cond_4
    move-object v11, v10

    .line 90
    :goto_2
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 91
    .line 92
    .line 93
    move-result v12

    .line 94
    if-nez v12, :cond_5

    .line 95
    .line 96
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 97
    .line 98
    .line 99
    move-result v12

    .line 100
    if-nez v12, :cond_5

    .line 101
    .line 102
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v9

    .line 106
    if-eqz v9, :cond_5

    .line 107
    .line 108
    goto/16 :goto_8

    .line 109
    .line 110
    :cond_5
    :goto_3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    if-nez v9, :cond_6

    .line 115
    .line 116
    iget-object v6, v8, Lna/k;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 117
    .line 118
    invoke-virtual {v6, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    check-cast v6, Ljava/lang/String;

    .line 123
    .line 124
    :cond_6
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 125
    .line 126
    .line 127
    move-result v8

    .line 128
    if-eqz v8, :cond_7

    .line 129
    .line 130
    move-object v6, p2

    .line 131
    :cond_7
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 132
    .line 133
    .line 134
    move-result v8

    .line 135
    if-eqz v8, :cond_8

    .line 136
    .line 137
    goto/16 :goto_6

    .line 138
    .line 139
    :cond_8
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 140
    .line 141
    .line 142
    move-result v8

    .line 143
    if-nez v8, :cond_a

    .line 144
    .line 145
    const-string v8, "@chatroom"

    .line 146
    .line 147
    invoke-virtual {v6, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 148
    .line 149
    .line 150
    move-result v8

    .line 151
    if-nez v8, :cond_9

    .line 152
    .line 153
    const-string v8, "@im.chatroom"

    .line 154
    .line 155
    invoke-virtual {v6, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 156
    .line 157
    .line 158
    move-result v8

    .line 159
    if-eqz v8, :cond_a

    .line 160
    .line 161
    :cond_9
    const/4 v7, 0x1

    .line 162
    :cond_a
    invoke-virtual {p0, v5, v7}, Lta/c;->d(Lna/a;Z)Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    invoke-virtual {p0, v2, v5, v6, p1}, Lta/c;->a(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    if-eqz v7, :cond_b

    .line 175
    .line 176
    goto/16 :goto_6

    .line 177
    .line 178
    :cond_b
    iget-object v7, p0, Lta/c;->e:Lb5/c;

    .line 179
    .line 180
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 184
    .line 185
    .line 186
    move-result v8

    .line 187
    if-nez v8, :cond_c

    .line 188
    .line 189
    iget-object v8, v7, Lb5/c;->a:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v8, Lna/k;

    .line 192
    .line 193
    iget-object v8, v8, Lna/k;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 194
    .line 195
    invoke-virtual {v8, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v8

    .line 199
    move-object v10, v8

    .line 200
    check-cast v10, Ljava/lang/String;

    .line 201
    .line 202
    :cond_c
    invoke-virtual {v7, p1, v10}, Lb5/c;->K(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    new-instance v8, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    invoke-direct {v8, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    if-nez v4, :cond_d

    .line 216
    .line 217
    move-object v0, p1

    .line 218
    goto :goto_4

    .line 219
    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 220
    .line 221
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    const-string v4, ":"

    .line 228
    .line 229
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    :goto_4
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->runtime()Li8/e;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->p()Lo8/j;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    if-nez v2, :cond_e

    .line 258
    .line 259
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 264
    .line 265
    .line 266
    move-result v2

    .line 267
    if-eqz v2, :cond_10

    .line 268
    .line 269
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    check-cast v2, Lta/b;

    .line 274
    .line 275
    move-object v4, v6

    .line 276
    iget-object v6, v2, Lta/b;->b:Ljava/lang/String;

    .line 277
    .line 278
    iget-boolean v8, v2, Lta/b;->c:Z

    .line 279
    .line 280
    iget v3, v2, Lta/b;->a:I

    .line 281
    .line 282
    iget-wide v9, v2, Lta/b;->d:J

    .line 283
    .line 284
    move-object v1, p0

    .line 285
    move v2, v3

    .line 286
    move-object v5, v4

    .line 287
    move-wide v3, v9

    .line 288
    invoke-virtual/range {v1 .. v8}, Lta/c;->g(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 289
    .line 290
    .line 291
    move-object v4, v5

    .line 292
    move-object v6, v4

    .line 293
    goto :goto_5

    .line 294
    :cond_e
    move-object v4, v6

    .line 295
    new-instance v1, Lh/Hchat/crash/e;

    .line 296
    .line 297
    const/4 v6, 0x4

    .line 298
    invoke-direct {v1, v6}, Lh/Hchat/crash/e;-><init>(I)V

    .line 299
    .line 300
    .line 301
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 302
    .line 303
    .line 304
    move-result v6

    .line 305
    if-nez v6, :cond_11

    .line 306
    .line 307
    iget-object v6, v2, Lo8/j;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 308
    .line 309
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 310
    .line 311
    .line 312
    move-result-wide v8

    .line 313
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 314
    .line 315
    .line 316
    move-result-object v8

    .line 317
    invoke-virtual {v6, v0, v8}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v6

    .line 321
    check-cast v6, Ljava/lang/Long;

    .line 322
    .line 323
    if-eqz v6, :cond_f

    .line 324
    .line 325
    goto :goto_7

    .line 326
    :cond_f
    invoke-virtual {v2, v1}, Lo8/j;->g(Ljava/lang/Runnable;)V

    .line 327
    .line 328
    .line 329
    move-object v6, v5

    .line 330
    move-object v5, v7

    .line 331
    const/4 v7, 0x0

    .line 332
    move-object v1, p0

    .line 333
    move-object v3, v0

    .line 334
    invoke-virtual/range {v1 .. v7}, Lta/c;->e(Lo8/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;I)V

    .line 335
    .line 336
    .line 337
    :cond_10
    :goto_6
    return-void

    .line 338
    :cond_11
    :goto_7
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    invoke-virtual {p0, v0}, Lta/c;->b(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    return-void

    .line 346
    :cond_12
    :goto_8
    const-string v0, "\u81ea\u52a8\u56de\u590d\u8df3\u8fc7: \u81ea\u5df1\u53d1\u7684\u7ea2\u5305"

    .line 347
    .line 348
    invoke-virtual {p0, v0}, Lta/c;->b(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 349
    .line 350
    .line 351
    return-void

    .line 352
    :goto_9
    new-instance v2, Ljava/lang/StringBuilder;

    .line 353
    .line 354
    const-string v3, "\u81ea\u52a8\u56de\u590d\u5931\u8d25: "

    .line 355
    .line 356
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-virtual {p0, v0}, Lta/c;->b(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    return-void
.end method

.method public final d(Lna/a;Z)Ljava/util/List;
    .locals 8

    .line 1
    const-string v0, "hb_reply_random"

    .line 2
    .line 3
    const-string v1, "hb_reply_group_items_v1"

    .line 4
    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    iget-object p1, p1, Lna/a;->v:Ljava/util/List;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p1, p1, Lna/a;->u:Ljava/util/List;

    .line 13
    .line 14
    :goto_0
    if-eqz p1, :cond_1

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_2
    const-string p1, "hb_reply_enable"

    .line 24
    .line 25
    iget-object v2, p0, Lta/c;->a:Ll3/l;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    :try_start_0
    invoke-virtual {v2}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-interface {v4, p1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 36
    .line 37
    .line 38
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move p1, v3

    .line 41
    :goto_1
    if-nez p1, :cond_3

    .line 42
    .line 43
    new-instance p1, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_3
    const/4 p1, 0x1

    .line 50
    const-string v4, ""

    .line 51
    .line 52
    if-eqz p2, :cond_5

    .line 53
    .line 54
    :try_start_1
    invoke-virtual {v2}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-interface {p2, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 59
    .line 60
    .line 61
    move-result p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 62
    if-ne p2, p1, :cond_4

    .line 63
    .line 64
    move p2, p1

    .line 65
    goto :goto_2

    .line 66
    :catchall_1
    :cond_4
    move p2, v3

    .line 67
    :goto_2
    if-eqz p2, :cond_5

    .line 68
    .line 69
    invoke-virtual {v2, v1, v4}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-static {p1}, La7/a;->J(Ljava/lang/String;)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    return-object p1

    .line 78
    :cond_5
    const-string p2, "hb_reply_items_v1"

    .line 79
    .line 80
    invoke-virtual {v2, p2, v4}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-nez v1, :cond_6

    .line 89
    .line 90
    invoke-static {p2}, La7/a;->J(Ljava/lang/String;)Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    return-object p1

    .line 95
    :cond_6
    const-string p2, "hb_reply_type"

    .line 96
    .line 97
    :try_start_2
    invoke-virtual {v2}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-interface {v1, p2, p1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 102
    .line 103
    .line 104
    move-result p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 105
    goto :goto_3

    .line 106
    :catchall_2
    move p2, p1

    .line 107
    :goto_3
    const/4 v1, 0x3

    .line 108
    if-eq p2, v1, :cond_8

    .line 109
    .line 110
    const/4 v1, 0x4

    .line 111
    if-eq p2, v1, :cond_8

    .line 112
    .line 113
    const/4 v1, 0x5

    .line 114
    if-eq p2, v1, :cond_8

    .line 115
    .line 116
    const/4 v1, 0x6

    .line 117
    if-eq p2, v1, :cond_8

    .line 118
    .line 119
    const/4 v1, 0x7

    .line 120
    if-eq p2, v1, :cond_8

    .line 121
    .line 122
    const/16 v1, 0x8

    .line 123
    .line 124
    if-eq p2, v1, :cond_8

    .line 125
    .line 126
    const/16 v1, 0x9

    .line 127
    .line 128
    if-ne p2, v1, :cond_7

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_7
    const-string v1, "hb_reply_text"

    .line 132
    .line 133
    const-string v4, "\u8c22\u8c22\u8001\u677f"

    .line 134
    .line 135
    invoke-virtual {v2, v1, v4}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    const-string v4, "hb_reply_templates"

    .line 140
    .line 141
    invoke-virtual {v2, v4, v1}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    goto :goto_5

    .line 146
    :cond_8
    :goto_4
    const-string v1, "hb_reply_media_paths"

    .line 147
    .line 148
    invoke-virtual {v2, v1, v4}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    :goto_5
    const-string v4, "hb_reply_custom_enable"

    .line 153
    .line 154
    :try_start_3
    invoke-virtual {v2}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    invoke-interface {v5, v4, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 159
    .line 160
    .line 161
    move-result v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 162
    goto :goto_6

    .line 163
    :catchall_3
    move v4, v3

    .line 164
    :goto_6
    if-eqz v4, :cond_a

    .line 165
    .line 166
    const-string v4, "hb_reply_delay_value"

    .line 167
    .line 168
    :try_start_4
    invoke-virtual {v2}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    invoke-interface {v5, v4, p1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 173
    .line 174
    .line 175
    move-result v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 176
    goto :goto_7

    .line 177
    :catchall_4
    move v4, p1

    .line 178
    :goto_7
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    const-string v5, "hb_reply_delay_unit"

    .line 183
    .line 184
    :try_start_5
    invoke-virtual {v2}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    invoke-interface {v6, v5, p1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 189
    .line 190
    .line 191
    move-result v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 192
    goto :goto_8

    .line 193
    :catchall_5
    move v5, p1

    .line 194
    :goto_8
    if-ne v5, p1, :cond_9

    .line 195
    .line 196
    int-to-long v4, v4

    .line 197
    const-wide/16 v6, 0x3e8

    .line 198
    .line 199
    mul-long/2addr v4, v6

    .line 200
    goto :goto_9

    .line 201
    :cond_9
    int-to-long v4, v4

    .line 202
    goto :goto_9

    .line 203
    :cond_a
    const-wide/16 v4, 0x0

    .line 204
    .line 205
    :goto_9
    :try_start_6
    invoke-virtual {v2}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    invoke-interface {p1, v0, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 210
    .line 211
    .line 212
    move-result p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 213
    goto :goto_a

    .line 214
    :catchall_6
    move p1, v3

    .line 215
    :goto_a
    if-eqz p1, :cond_b

    .line 216
    .line 217
    iget-object p1, p0, Lta/c;->f:Ljava/util/Random;

    .line 218
    .line 219
    const/16 v6, 0x7d0

    .line 220
    .line 221
    invoke-virtual {p1, v6}, Ljava/util/Random;->nextInt(I)I

    .line 222
    .line 223
    .line 224
    move-result p1

    .line 225
    int-to-long v6, p1

    .line 226
    add-long/2addr v4, v6

    .line 227
    :cond_b
    :try_start_7
    invoke-virtual {v2}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    invoke-interface {p1, v0, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 232
    .line 233
    .line 234
    move-result v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 235
    :catchall_7
    invoke-static {p2, v4, v5, v1, v3}, La7/a;->B(IJLjava/lang/String;Z)Ljava/util/List;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    return-object p1
.end method

.method public final e(Lo8/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;I)V
    .locals 12

    .line 1
    move/from16 v8, p6

    .line 2
    .line 3
    invoke-virtual/range {p5 .. p5}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lt v8, v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual/range {p5 .. p6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    move-object v3, v0

    .line 15
    check-cast v3, Lta/b;

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, ":step:"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    iget-wide v10, v3, Lta/b;->d:J

    .line 38
    .line 39
    new-instance v0, Lta/a;

    .line 40
    .line 41
    move-object v1, p0

    .line 42
    move-object v5, p1

    .line 43
    move-object v6, p2

    .line 44
    move-object v2, p3

    .line 45
    move-object/from16 v4, p4

    .line 46
    .line 47
    move-object/from16 v7, p5

    .line 48
    .line 49
    invoke-direct/range {v0 .. v8}, Lta/a;-><init>(Lta/c;Ljava/lang/String;Lta/b;Ljava/lang/String;Lo8/j;Ljava/lang/String;Ljava/util/ArrayList;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v9, v10, v11, v0}, Lo8/j;->f(Ljava/lang/String;JLjava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final g(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 5

    .line 1
    const-string v0, " at="

    .line 2
    .line 3
    const-string v1, "\u81ea\u52a8\u56de\u590d"

    .line 4
    .line 5
    :try_start_0
    iget-object v2, p0, Lta/c;->a:Ll3/l;

    .line 6
    .line 7
    const-string v3, "hb_reply_enable"

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    :try_start_1
    invoke-virtual {v2}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 18
    .line 19
    .line 20
    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    :catchall_0
    if-nez v4, :cond_0

    .line 22
    .line 23
    :try_start_2
    const-string p1, "\u81ea\u52a8\u56de\u590d\u8df3\u8fc7: \u5168\u5c40\u5f00\u5173\u5df2\u5173\u95ed"

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lta/c;->b(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catchall_1
    move-exception p1

    .line 30
    goto :goto_3

    .line 31
    :cond_0
    invoke-static {p1, p4, p5, p6, p7}, Lta/c;->f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    new-instance v3, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    packed-switch p1, :pswitch_data_0

    .line 41
    .line 42
    .line 43
    const-string p1, "\u6587\u672c"

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :pswitch_0
    const-string p1, "\u6536\u85cf"

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :pswitch_1
    const-string p1, "XML"

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :pswitch_2
    const-string p1, "\u6587\u4ef6"

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :pswitch_3
    const-string p1, "\u8868\u60c5"

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :pswitch_4
    const-string p1, "\u89c6\u9891"

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :pswitch_5
    const-string p1, "\u8bed\u97f3"

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :pswitch_6
    const-string p1, "\u56fe\u7247"

    .line 65
    .line 66
    :goto_0
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    if-eqz v2, :cond_1

    .line 70
    .line 71
    const-string p1, "\u5df2\u53d1\u9001"

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    const-string p1, "\u53d1\u9001\u5931\u8d25"

    .line 75
    .line 76
    :goto_1
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string p1, ": "

    .line 80
    .line 81
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string p1, " -> "

    .line 88
    .line 89
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    if-eqz p7, :cond_2

    .line 96
    .line 97
    invoke-virtual {v0, p6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    goto :goto_2

    .line 102
    :cond_2
    const-string p1, ""

    .line 103
    .line 104
    :goto_2
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string p1, " delay="

    .line 108
    .line 109
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string p1, "ms"

    .line 116
    .line 117
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {p0, p1}, Lta/c;->b(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :goto_3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    const-string p3, "\u81ea\u52a8\u56de\u590d\u5f02\u5e38: "

    .line 131
    .line 132
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {p0, p1}, Lta/c;->b(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
