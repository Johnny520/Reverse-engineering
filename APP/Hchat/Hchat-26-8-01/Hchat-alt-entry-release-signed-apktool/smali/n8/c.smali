.class public final Ln8/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lh/Hchat/dexkit/DexFinder;

.field public final b:Lm8/c;

.field public final c:Landroid/os/Handler;

.field public final d:Ljava/util/Map;

.field public volatile e:Z


# direct methods
.method public constructor <init>(Lh/Hchat/dexkit/DexFinder;Lm8/c;Lg1/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln8/c;->a:Lh/Hchat/dexkit/DexFinder;

    .line 5
    .line 6
    iput-object p2, p0, Ln8/c;->b:Lm8/c;

    .line 7
    .line 8
    new-instance p1, Landroid/os/Handler;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Ln8/c;->c:Landroid/os/Handler;

    .line 18
    .line 19
    new-instance p1, Ljava/util/IdentityHashMap;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Ln8/c;->d:Ljava/util/Map;

    .line 29
    .line 30
    return-void
.end method

.method public static final a(Ln8/c;Ljava/lang/reflect/Constructor;)I
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    array-length p1, p0

    .line 9
    const/4 v0, 0x0

    .line 10
    move v1, v0

    .line 11
    :goto_0
    const/4 v2, 0x2

    .line 12
    if-ge v1, p1, :cond_2

    .line 13
    .line 14
    aget-object v3, p0, v1

    .line 15
    .line 16
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 17
    .line 18
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-nez v4, :cond_1

    .line 23
    .line 24
    const-class v4, Ljava/lang/Long;

    .line 25
    .line 26
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    :goto_1
    move v0, v2

    .line 37
    :cond_2
    array-length p1, p0

    .line 38
    const/16 v1, 0xa

    .line 39
    .line 40
    if-lt p1, v1, :cond_3

    .line 41
    .line 42
    const/16 p1, 0x9

    .line 43
    .line 44
    aget-object p0, p0, p1

    .line 45
    .line 46
    const-class p1, Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {p0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_3

    .line 53
    .line 54
    add-int/2addr v0, v2

    .line 55
    :cond_3
    return v0
.end method

.method public static b([Ljava/lang/Class;Ljava/lang/String;Ln8/a;)[Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v8, v1, Ln8/a;->h:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v13, v1, Ln8/a;->k:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v15, v1, Ln8/a;->j:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v11, v1, Ln8/a;->l:Ljava/lang/String;

    .line 12
    .line 13
    iget-wide v2, v1, Ln8/a;->i:J

    .line 14
    .line 15
    iget-object v9, v1, Ln8/a;->a:Ljava/lang/String;

    .line 16
    .line 17
    iget v4, v1, Ln8/a;->g:I

    .line 18
    .line 19
    iget-object v6, v1, Ln8/a;->f:Ljava/lang/String;

    .line 20
    .line 21
    iget v5, v1, Ln8/a;->e:I

    .line 22
    .line 23
    move v7, v4

    .line 24
    iget-object v4, v1, Ln8/a;->d:Ljava/lang/String;

    .line 25
    .line 26
    iget v10, v1, Ln8/a;->c:I

    .line 27
    .line 28
    iget-object v1, v1, Ln8/a;->b:Ljava/lang/String;

    .line 29
    .line 30
    array-length v12, v0

    .line 31
    packed-switch v12, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    :pswitch_0
    const/4 v0, 0x0

    .line 35
    new-array v0, v0, [Ljava/lang/Object;

    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_1
    move-wide/from16 v16, v2

    .line 39
    .line 40
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    move-object v0, v9

    .line 49
    move-object v9, v8

    .line 50
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    const/4 v10, 0x0

    .line 55
    move-object/from16 v19, v11

    .line 56
    .line 57
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 58
    .line 59
    .line 60
    move-result-object v11

    .line 61
    move-object/from16 v3, p1

    .line 62
    .line 63
    move-object v7, v6

    .line 64
    move-object v6, v15

    .line 65
    move-object/from16 v12, v19

    .line 66
    .line 67
    filled-new-array/range {v0 .. v13}, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    return-object v0

    .line 72
    :pswitch_2
    move-wide/from16 v16, v2

    .line 73
    .line 74
    move-object/from16 v21, v6

    .line 75
    .line 76
    move-object v14, v9

    .line 77
    move-object/from16 v19, v11

    .line 78
    .line 79
    move-object v9, v8

    .line 80
    const/4 v2, 0x7

    .line 81
    invoke-static {v2, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Ljava/lang/Class;

    .line 86
    .line 87
    invoke-static {v0}, Ln8/c;->d(Ljava/lang/Class;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_0

    .line 92
    .line 93
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    move-object v8, v9

    .line 106
    const/4 v9, 0x0

    .line 107
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 108
    .line 109
    .line 110
    move-result-object v10

    .line 111
    move-object/from16 v3, p1

    .line 112
    .line 113
    move-object v0, v14

    .line 114
    move-object/from16 v11, v19

    .line 115
    .line 116
    move-object/from16 v6, v21

    .line 117
    .line 118
    filled-new-array/range {v0 .. v11}, [Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    return-object v0

    .line 123
    :cond_0
    move-object v0, v14

    .line 124
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v11

    .line 128
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v14

    .line 132
    move-wide/from16 v2, v16

    .line 133
    .line 134
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v17

    .line 138
    const/16 v18, 0x0

    .line 139
    .line 140
    move-object/from16 v20, v19

    .line 141
    .line 142
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 143
    .line 144
    .line 145
    move-result-object v19

    .line 146
    move-object/from16 v12, p1

    .line 147
    .line 148
    move-object v9, v0

    .line 149
    move-object v10, v1

    .line 150
    move-object/from16 v16, v21

    .line 151
    .line 152
    move-object/from16 v21, v13

    .line 153
    .line 154
    move-object v13, v4

    .line 155
    filled-new-array/range {v9 .. v21}, [Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    return-object v0

    .line 160
    :pswitch_3
    move-object/from16 v21, v6

    .line 161
    .line 162
    move-object v0, v9

    .line 163
    move-object/from16 v19, v11

    .line 164
    .line 165
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 166
    .line 167
    .line 168
    move-result-object v11

    .line 169
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 170
    .line 171
    .line 172
    move-result-object v14

    .line 173
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 174
    .line 175
    .line 176
    move-result-object v16

    .line 177
    const/16 v17, 0x0

    .line 178
    .line 179
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 180
    .line 181
    .line 182
    move-result-object v18

    .line 183
    move-object/from16 v12, p1

    .line 184
    .line 185
    move-object v10, v1

    .line 186
    move-object/from16 v20, v13

    .line 187
    .line 188
    move-object/from16 v15, v21

    .line 189
    .line 190
    move-object v13, v4

    .line 191
    filled-new-array/range {v9 .. v20}, [Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    return-object v0

    .line 196
    :pswitch_4
    move-object/from16 v21, v6

    .line 197
    .line 198
    move-object v0, v9

    .line 199
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 200
    .line 201
    .line 202
    move-result-object v16

    .line 203
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 204
    .line 205
    .line 206
    move-result-object v19

    .line 207
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 208
    .line 209
    .line 210
    move-result-object v22

    .line 211
    const/16 v23, 0x0

    .line 212
    .line 213
    move-object/from16 v17, p1

    .line 214
    .line 215
    move-object v14, v0

    .line 216
    move-object/from16 v18, v4

    .line 217
    .line 218
    move-object/from16 v20, v15

    .line 219
    .line 220
    move-object v15, v1

    .line 221
    filled-new-array/range {v14 .. v23}, [Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    return-object v0

    .line 226
    :pswitch_5
    move-object/from16 v21, v6

    .line 227
    .line 228
    move-object v0, v9

    .line 229
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 230
    .line 231
    .line 232
    move-result-object v18

    .line 233
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 238
    .line 239
    .line 240
    move-result-object v23

    .line 241
    const/16 v24, 0x0

    .line 242
    .line 243
    move-object/from16 v19, p1

    .line 244
    .line 245
    move-object/from16 v16, v0

    .line 246
    .line 247
    move-object/from16 v17, v1

    .line 248
    .line 249
    move-object/from16 v20, v4

    .line 250
    .line 251
    move-object/from16 v22, v21

    .line 252
    .line 253
    move-object/from16 v21, v2

    .line 254
    .line 255
    filled-new-array/range {v16 .. v24}, [Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    return-object v0

    .line 260
    nop

    .line 261
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static d(Ljava/lang/Class;)Z
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-class v0, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-static {p0, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method


# virtual methods
.method public final c()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ln8/c;->a:Lh/Hchat/dexkit/DexFinder;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh/Hchat/dexkit/DexFinder;->hasTransferOperationApi()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public final e(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "[WeChatTransferApi] "

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Li8/i;->f(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final f(Ljava/lang/String;Ln8/a;)Z
    .locals 12

    .line 1
    const-string v0, "confirm"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    const-string v0, "refuse"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string p1, "\u8f6c\u8d26\u64cd\u4f5c\u5931\u8d25: op\u65e0\u6548"

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Ln8/c;->e(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return v1

    .line 25
    :cond_1
    :goto_0
    iget-object v0, p2, Ln8/a;->a:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_b

    .line 32
    .line 33
    iget-object v0, p2, Ln8/a;->b:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_b

    .line 40
    .line 41
    iget-object v0, p2, Ln8/a;->d:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    goto/16 :goto_5

    .line 50
    .line 51
    :cond_2
    iget-object v0, p0, Ln8/c;->a:Lh/Hchat/dexkit/DexFinder;

    .line 52
    .line 53
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->transferOperationClass:Ljava/lang/Class;

    .line 54
    .line 55
    if-nez v0, :cond_3

    .line 56
    .line 57
    const-string p1, "\u8f6c\u8d26\u64cd\u4f5c\u5931\u8d25: transferOperationClass\u4e3a\u7a7a"

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Ln8/c;->e(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return v1

    .line 63
    :cond_3
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredConstructors(Ljava/lang/Class;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    new-instance v2, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    const-class v4, Ljava/lang/String;

    .line 81
    .line 82
    const/4 v5, 0x1

    .line 83
    if-eqz v3, :cond_6

    .line 84
    .line 85
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    move-object v6, v3

    .line 90
    check-cast v6, Ljava/lang/reflect/Constructor;

    .line 91
    .line 92
    invoke-virtual {v6}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    const/16 v7, 0x9

    .line 97
    .line 98
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    const/16 v8, 0xa

    .line 103
    .line 104
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    const/16 v9, 0xc

    .line 109
    .line 110
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v9

    .line 114
    const/16 v10, 0xd

    .line 115
    .line 116
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v10

    .line 120
    const/16 v11, 0xe

    .line 121
    .line 122
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    filled-new-array {v7, v8, v9, v10, v11}, [Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    invoke-static {v7}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    array-length v8, v6

    .line 135
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    invoke-interface {v7, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v7

    .line 143
    if-nez v7, :cond_5

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_5
    array-length v7, v6

    .line 147
    const/4 v8, 0x6

    .line 148
    if-lt v7, v8, :cond_4

    .line 149
    .line 150
    aget-object v7, v6, v1

    .line 151
    .line 152
    invoke-static {v7, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    if-eqz v7, :cond_4

    .line 157
    .line 158
    aget-object v5, v6, v5

    .line 159
    .line 160
    invoke-static {v5, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    if-eqz v5, :cond_4

    .line 165
    .line 166
    const/4 v5, 0x2

    .line 167
    aget-object v5, v6, v5

    .line 168
    .line 169
    invoke-static {v5}, Ln8/c;->d(Ljava/lang/Class;)Z

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    if-eqz v5, :cond_4

    .line 174
    .line 175
    const/4 v5, 0x3

    .line 176
    aget-object v5, v6, v5

    .line 177
    .line 178
    invoke-static {v5, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    if-eqz v5, :cond_4

    .line 183
    .line 184
    const/4 v5, 0x4

    .line 185
    aget-object v5, v6, v5

    .line 186
    .line 187
    invoke-static {v5, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    if-eqz v4, :cond_4

    .line 192
    .line 193
    const/4 v4, 0x5

    .line 194
    aget-object v4, v6, v4

    .line 195
    .line 196
    invoke-static {v4}, Ln8/c;->d(Ljava/lang/Class;)Z

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    if-eqz v4, :cond_4

    .line 201
    .line 202
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    goto/16 :goto_1

    .line 206
    .line 207
    :cond_6
    new-instance v0, La9/h;

    .line 208
    .line 209
    const/16 v3, 0x17

    .line 210
    .line 211
    invoke-direct {v0, v3}, La9/h;-><init>(I)V

    .line 212
    .line 213
    .line 214
    new-instance v3, Lda/g;

    .line 215
    .line 216
    const/4 v6, 0x3

    .line 217
    invoke-direct {v3, v0, p0, v6}, Lda/g;-><init>(Ljava/util/Comparator;Ljava/lang/Object;I)V

    .line 218
    .line 219
    .line 220
    invoke-static {v2, v3}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    const/4 v2, 0x0

    .line 229
    move-object v3, v2

    .line 230
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v6

    .line 234
    if-eqz v6, :cond_7

    .line 235
    .line 236
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    check-cast v3, Ljava/lang/reflect/Constructor;

    .line 241
    .line 242
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    invoke-static {v6, p1, p2}, Ln8/c;->b([Ljava/lang/Class;Ljava/lang/String;Ln8/a;)[Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    array-length v7, v6

    .line 254
    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v6

    .line 258
    invoke-static {v3, v6}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 262
    goto :goto_4

    .line 263
    :catchall_0
    move-exception v6

    .line 264
    invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    array-length v3, v3

    .line 269
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v6

    .line 273
    new-instance v7, Ljava/lang/StringBuilder;

    .line 274
    .line 275
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    const-string v3, ": "

    .line 282
    .line 283
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    goto :goto_2

    .line 294
    :cond_7
    if-eqz v3, :cond_8

    .line 295
    .line 296
    const-string p2, ", last="

    .line 297
    .line 298
    invoke-virtual {p2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object p2

    .line 302
    goto :goto_3

    .line 303
    :cond_8
    const-string p2, ""

    .line 304
    .line 305
    :goto_3
    const-string v0, "\u8f6c\u8d26\u64cd\u4f5c\u5931\u8d25: \u65e0\u5408\u9002\u6784\u9020"

    .line 306
    .line 307
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object p2

    .line 311
    invoke-virtual {p0, p2}, Ln8/c;->e(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    :goto_4
    if-eqz v2, :cond_a

    .line 315
    .line 316
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    move-result-object p2

    .line 320
    const-string v0, "setProcessName"

    .line 321
    .line 322
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    invoke-static {p2, v0, v3}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 327
    .line 328
    .line 329
    move-result-object p2

    .line 330
    const-string v0, "RemittanceProcess"

    .line 331
    .line 332
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    invoke-static {p2, v2, v0}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 337
    .line 338
    .line 339
    :catchall_1
    iget-object p2, p0, Ln8/c;->b:Lm8/c;

    .line 340
    .line 341
    invoke-virtual {p2, v2}, Lm8/c;->j(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result p2

    .line 345
    if-ne p2, v5, :cond_9

    .line 346
    .line 347
    move v1, v5

    .line 348
    :cond_9
    if-nez v1, :cond_a

    .line 349
    .line 350
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    move-result-object p2

    .line 354
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object p2

    .line 358
    new-instance v0, Ljava/lang/StringBuilder;

    .line 359
    .line 360
    const-string v2, "\u8f6c\u8d26\u64cd\u4f5c\u5931\u8d25: \u53d1\u5305\u5931\u8d25 op="

    .line 361
    .line 362
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    const-string p1, " request="

    .line 369
    .line 370
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object p1

    .line 380
    invoke-virtual {p0, p1}, Ln8/c;->e(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    :cond_a
    return v1

    .line 384
    :cond_b
    :goto_5
    const-string p1, "\u8f6c\u8d26\u64cd\u4f5c\u5931\u8d25: transactionId/transId/username\u7f3a\u5931"

    .line 385
    .line 386
    invoke-virtual {p0, p1}, Ln8/c;->e(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    return v1
.end method
