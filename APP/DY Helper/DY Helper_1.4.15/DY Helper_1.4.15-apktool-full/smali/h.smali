.class public final Lh;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 12
    iput p1, p0, Lh;->α:I

    invoke-direct {p0}, Lm01;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 11
    iput p1, p0, Lh;->α:I

    invoke-direct {p0}, Lm01;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    const/16 p1, 0x17

    .line 2
    .line 3
    iput p1, p0, Lh;->α:I

    .line 4
    .line 5
    sget-object p1, Lql;->α:Lql;

    .line 6
    .line 7
    invoke-direct {p0}, Lm01;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final α(Lk01;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 5
    .line 6
    instance-of p1, p0, Landroid/view/View;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    check-cast p0, Landroid/view/View;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object p0, v0

    .line 15
    :goto_0
    if-nez p0, :cond_1

    .line 16
    .line 17
    goto/16 :goto_6

    .line 18
    .line 19
    :cond_1
    invoke-static {}, Lfj;->δ()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    const/4 v1, 0x2

    .line 26
    if-eq p1, v1, :cond_2

    .line 27
    .line 28
    goto/16 :goto_6

    .line 29
    .line 30
    :cond_2
    sget-object p1, Lfj;->μ:Ljava/util/Map;

    .line 31
    .line 32
    monitor-enter p1

    .line 33
    :try_start_0
    invoke-interface {p1, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    monitor-exit p1

    .line 40
    move-object v0, p0

    .line 41
    goto :goto_3

    .line 42
    :cond_3
    monitor-exit p1

    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    :goto_1
    instance-of p1, p0, Landroid/view/View;

    .line 48
    .line 49
    if-eqz p1, :cond_5

    .line 50
    .line 51
    sget-object p1, Lfj;->μ:Ljava/util/Map;

    .line 52
    .line 53
    monitor-enter p1

    .line 54
    :try_start_1
    invoke-interface {p1, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_4

    .line 59
    .line 60
    move-object v0, p0

    .line 61
    check-cast v0, Landroid/view/View;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    .line 63
    monitor-exit p1

    .line 64
    goto :goto_3

    .line 65
    :catchall_0
    move-exception p0

    .line 66
    goto :goto_2

    .line 67
    :cond_4
    monitor-exit p1

    .line 68
    check-cast p0, Landroid/view/View;

    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    goto :goto_1

    .line 75
    :goto_2
    monitor-exit p1

    .line 76
    throw p0

    .line 77
    :cond_5
    :goto_3
    if-nez v0, :cond_6

    .line 78
    .line 79
    goto :goto_6

    .line 80
    :cond_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 81
    .line 82
    .line 83
    move-result-wide p0

    .line 84
    sget-object v1, Lfj;->ν:Ljava/util/Map;

    .line 85
    .line 86
    monitor-enter v1

    .line 87
    :try_start_2
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    check-cast v2, Ljava/lang/Long;

    .line 92
    .line 93
    if-eqz v2, :cond_7

    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 96
    .line 97
    .line 98
    move-result-wide v2

    .line 99
    goto :goto_4

    .line 100
    :catchall_1
    move-exception p0

    .line 101
    goto :goto_7

    .line 102
    :cond_7
    const-wide/16 v2, 0x0

    .line 103
    .line 104
    :goto_4
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 109
    .line 110
    .line 111
    monitor-exit v1

    .line 112
    sub-long/2addr p0, v2

    .line 113
    const-wide/16 v2, 0x1

    .line 114
    .line 115
    cmp-long v2, v2, p0

    .line 116
    .line 117
    if-gtz v2, :cond_b

    .line 118
    .line 119
    const-wide/16 v2, 0x169

    .line 120
    .line 121
    cmp-long p0, p0, v2

    .line 122
    .line 123
    if-gez p0, :cond_b

    .line 124
    .line 125
    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    sget-object p0, Lfj;->μ:Ljava/util/Map;

    .line 129
    .line 130
    monitor-enter p0

    .line 131
    :try_start_3
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    check-cast p1, Lcj;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 136
    .line 137
    monitor-exit p0

    .line 138
    if-nez p1, :cond_8

    .line 139
    .line 140
    goto :goto_6

    .line 141
    :cond_8
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    if-nez p0, :cond_9

    .line 146
    .line 147
    goto :goto_6

    .line 148
    :cond_9
    sget-object v0, Lfj;->κ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 149
    .line 150
    iget-object v1, p1, Lcj;->α:Ljava/lang/String;

    .line 151
    .line 152
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    check-cast v0, Lcj;

    .line 157
    .line 158
    if-nez v0, :cond_a

    .line 159
    .line 160
    goto :goto_5

    .line 161
    :cond_a
    move-object p1, v0

    .line 162
    :goto_5
    invoke-static {p0, p1}, Lfj;->Θ(Landroid/content/Context;Lcj;)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :catchall_2
    move-exception p1

    .line 167
    monitor-exit p0

    .line 168
    throw p1

    .line 169
    :cond_b
    :goto_6
    return-void

    .line 170
    :goto_7
    monitor-exit v1

    .line 171
    throw p0

    .line 172
    :catchall_3
    move-exception p0

    .line 173
    monitor-exit p1

    .line 174
    throw p0
.end method


# virtual methods
.method public afterHookedMethod(Lk01;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lh;->α:I

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x4

    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x0

    .line 12
    packed-switch v2, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    :pswitch_0
    invoke-super/range {p0 .. p1}, Lm01;->afterHookedMethod(Lk01;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    :try_start_0
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 23
    .line 24
    instance-of v2, v0, Landroid/view/View;

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    check-cast v0, Landroid/view/View;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v0, v7

    .line 32
    :goto_0
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_1
    iget-object v1, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 36
    .line 37
    if-eqz v1, :cond_5

    .line 38
    .line 39
    invoke-static {v1}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-nez v1, :cond_2

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_2
    sget-object v2, Lql;->ι:Ljava/util/Map;

    .line 47
    .line 48
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 49
    :try_start_1
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Ljava/util/List;

    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    invoke-static {v1}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    goto :goto_1

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    :goto_1
    :try_start_2
    monitor-exit v2

    .line 65
    if-nez v7, :cond_4

    .line 66
    .line 67
    sget-object v7, Ljz;->ε:Ljz;

    .line 68
    .line 69
    :cond_4
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-nez v1, :cond_5

    .line 74
    .line 75
    invoke-static {v0, v7}, Lql;->Λ(Landroid/view/View;Ljava/util/List;)V

    .line 76
    .line 77
    .line 78
    goto :goto_3

    .line 79
    :goto_2
    monitor-exit v2

    .line 80
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 81
    :catchall_1
    move-exception v0

    .line 82
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    sget v0, Lcom/example/dyhelper/MainHook;->β:I

    .line 86
    .line 87
    :cond_5
    :goto_3
    return-void

    .line 88
    :pswitch_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    sget-object v0, Lql;->α:Lql;

    .line 92
    .line 93
    :try_start_3
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 94
    .line 95
    if-nez v0, :cond_6

    .line 96
    .line 97
    goto :goto_6

    .line 98
    :cond_6
    iget-object v1, v1, Lk01;->ε:Ljava/lang/Object;

    .line 99
    .line 100
    if-nez v1, :cond_7

    .line 101
    .line 102
    goto :goto_6

    .line 103
    :cond_7
    sget-object v2, Lql;->θ:Ljava/util/Map;

    .line 104
    .line 105
    monitor-enter v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 106
    :try_start_4
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, Ljava/util/List;

    .line 111
    .line 112
    if-eqz v0, :cond_8

    .line 113
    .line 114
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 118
    goto :goto_4

    .line 119
    :catchall_2
    move-exception v0

    .line 120
    goto :goto_5

    .line 121
    :cond_8
    :goto_4
    :try_start_5
    monitor-exit v2

    .line 122
    if-nez v7, :cond_9

    .line 123
    .line 124
    sget-object v7, Ljz;->ε:Ljz;

    .line 125
    .line 126
    :cond_9
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-nez v0, :cond_a

    .line 131
    .line 132
    sget-object v2, Lql;->ι:Ljava/util/Map;

    .line 133
    .line 134
    monitor-enter v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 135
    :try_start_6
    invoke-interface {v2, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 136
    .line 137
    .line 138
    :try_start_7
    monitor-exit v2

    .line 139
    goto :goto_6

    .line 140
    :catchall_3
    move-exception v0

    .line 141
    monitor-exit v2

    .line 142
    throw v0

    .line 143
    :goto_5
    monitor-exit v2

    .line 144
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 145
    :catchall_4
    move-exception v0

    .line 146
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    sget v0, Lcom/example/dyhelper/MainHook;->β:I

    .line 150
    .line 151
    :cond_a
    :goto_6
    return-void

    .line 152
    :pswitch_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    sget-object v0, Lql;->α:Lql;

    .line 156
    .line 157
    :try_start_8
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 158
    .line 159
    if-nez v0, :cond_b

    .line 160
    .line 161
    goto :goto_8

    .line 162
    :cond_b
    iget-object v1, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 163
    .line 164
    if-eqz v1, :cond_c

    .line 165
    .line 166
    new-instance v7, Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 169
    .line 170
    .line 171
    array-length v2, v1

    .line 172
    :goto_7
    if-ge v6, v2, :cond_c

    .line 173
    .line 174
    aget-object v3, v1, v6

    .line 175
    .line 176
    invoke-static {v3}, Lql;->ξ(Ljava/lang/Object;)Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    invoke-static {v7, v3}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 181
    .line 182
    .line 183
    add-int/lit8 v6, v6, 0x1

    .line 184
    .line 185
    goto :goto_7

    .line 186
    :cond_c
    if-nez v7, :cond_d

    .line 187
    .line 188
    sget-object v7, Ljz;->ε:Ljz;

    .line 189
    .line 190
    :cond_d
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    if-nez v1, :cond_e

    .line 195
    .line 196
    invoke-static {v0, v7}, Lql;->β(Ljava/lang/Object;Ljava/util/List;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 197
    .line 198
    .line 199
    goto :goto_8

    .line 200
    :catchall_5
    move-exception v0

    .line 201
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    sget v0, Lcom/example/dyhelper/MainHook;->β:I

    .line 205
    .line 206
    :cond_e
    :goto_8
    return-void

    .line 207
    :pswitch_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    :try_start_9
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 211
    .line 212
    instance-of v2, v0, Landroid/view/View;

    .line 213
    .line 214
    if-eqz v2, :cond_f

    .line 215
    .line 216
    move-object v7, v0

    .line 217
    check-cast v7, Landroid/view/View;

    .line 218
    .line 219
    :cond_f
    if-nez v7, :cond_10

    .line 220
    .line 221
    goto :goto_9

    .line 222
    :cond_10
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 223
    .line 224
    if-eqz v0, :cond_12

    .line 225
    .line 226
    invoke-static {v0}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    if-nez v0, :cond_11

    .line 231
    .line 232
    goto :goto_9

    .line 233
    :cond_11
    invoke-static {v0}, Lql;->ξ(Ljava/lang/Object;)Ljava/util/List;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    if-nez v1, :cond_12

    .line 242
    .line 243
    invoke-static {v7, v0}, Lql;->Λ(Landroid/view/View;Ljava/util/List;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 244
    .line 245
    .line 246
    goto :goto_9

    .line 247
    :catchall_6
    move-exception v0

    .line 248
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    sget v0, Lcom/example/dyhelper/MainHook;->β:I

    .line 252
    .line 253
    :cond_12
    :goto_9
    return-void

    .line 254
    :pswitch_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    :try_start_a
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 258
    .line 259
    instance-of v2, v0, Landroid/view/View;

    .line 260
    .line 261
    if-eqz v2, :cond_13

    .line 262
    .line 263
    check-cast v0, Landroid/view/View;

    .line 264
    .line 265
    goto :goto_a

    .line 266
    :cond_13
    move-object v0, v7

    .line 267
    :goto_a
    if-nez v0, :cond_14

    .line 268
    .line 269
    goto :goto_c

    .line 270
    :cond_14
    iget-object v1, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 271
    .line 272
    if-eqz v1, :cond_19

    .line 273
    .line 274
    invoke-static {v1}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    if-nez v1, :cond_15

    .line 279
    .line 280
    goto :goto_c

    .line 281
    :cond_15
    instance-of v2, v1, Landroid/net/Uri;

    .line 282
    .line 283
    if-eqz v2, :cond_16

    .line 284
    .line 285
    check-cast v1, Landroid/net/Uri;

    .line 286
    .line 287
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v7

    .line 291
    goto :goto_b

    .line 292
    :cond_16
    instance-of v2, v1, Ljava/lang/String;

    .line 293
    .line 294
    if-eqz v2, :cond_17

    .line 295
    .line 296
    move-object v7, v1

    .line 297
    check-cast v7, Ljava/lang/String;

    .line 298
    .line 299
    :cond_17
    :goto_b
    if-nez v7, :cond_18

    .line 300
    .line 301
    goto :goto_c

    .line 302
    :cond_18
    invoke-static {v7}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    invoke-static {v0, v1}, Lql;->Λ(Landroid/view/View;Ljava/util/List;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 307
    .line 308
    .line 309
    goto :goto_c

    .line 310
    :catchall_7
    move-exception v0

    .line 311
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    sget v0, Lcom/example/dyhelper/MainHook;->β:I

    .line 315
    .line 316
    :cond_19
    :goto_c
    return-void

    .line 317
    :pswitch_6
    invoke-direct/range {p0 .. p1}, Lh;->α(Lk01;)V

    .line 318
    .line 319
    .line 320
    return-void

    .line 321
    :pswitch_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    sget-object v0, Lfj;->π:Ljava/util/concurrent/atomic/AtomicReference;

    .line 325
    .line 326
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    if-nez v2, :cond_1a

    .line 331
    .line 332
    goto/16 :goto_16

    .line 333
    .line 334
    :cond_1a
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    check-cast v0, Ldj;

    .line 339
    .line 340
    if-nez v0, :cond_1b

    .line 341
    .line 342
    goto/16 :goto_16

    .line 343
    .line 344
    :cond_1b
    iget-object v2, v1, Lk01;->ε:Ljava/lang/Object;

    .line 345
    .line 346
    instance-of v8, v2, Ljava/lang/Integer;

    .line 347
    .line 348
    if-eqz v8, :cond_1c

    .line 349
    .line 350
    check-cast v2, Ljava/lang/Integer;

    .line 351
    .line 352
    goto :goto_d

    .line 353
    :cond_1c
    move-object v2, v7

    .line 354
    :goto_d
    if-eqz v2, :cond_33

    .line 355
    .line 356
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 357
    .line 358
    .line 359
    move-result v8

    .line 360
    if-lez v8, :cond_1d

    .line 361
    .line 362
    goto :goto_e

    .line 363
    :cond_1d
    move-object v2, v7

    .line 364
    :goto_e
    if-eqz v2, :cond_33

    .line 365
    .line 366
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    iget-object v8, v1, Lk01;->β:Ljava/lang/Object;

    .line 371
    .line 372
    instance-of v9, v8, Landroid/media/AudioTrack;

    .line 373
    .line 374
    if-eqz v9, :cond_1e

    .line 375
    .line 376
    check-cast v8, Landroid/media/AudioTrack;

    .line 377
    .line 378
    goto :goto_f

    .line 379
    :cond_1e
    move-object v8, v7

    .line 380
    :goto_f
    iget-object v9, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 381
    .line 382
    if-nez v9, :cond_1f

    .line 383
    .line 384
    goto/16 :goto_16

    .line 385
    .line 386
    :cond_1f
    invoke-static {v9}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v10

    .line 390
    if-nez v10, :cond_20

    .line 391
    .line 392
    goto/16 :goto_16

    .line 393
    .line 394
    :cond_20
    instance-of v11, v10, [B

    .line 395
    .line 396
    if-eqz v11, :cond_24

    .line 397
    .line 398
    invoke-static {v5, v9}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    instance-of v3, v1, Ljava/lang/Integer;

    .line 403
    .line 404
    if-eqz v3, :cond_21

    .line 405
    .line 406
    check-cast v1, Ljava/lang/Integer;

    .line 407
    .line 408
    goto :goto_10

    .line 409
    :cond_21
    move-object v1, v7

    .line 410
    :goto_10
    if-eqz v1, :cond_22

    .line 411
    .line 412
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 413
    .line 414
    .line 415
    move-result v6

    .line 416
    :cond_22
    check-cast v10, [B

    .line 417
    .line 418
    array-length v1, v10

    .line 419
    sub-int/2addr v1, v6

    .line 420
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    .line 421
    .line 422
    .line 423
    move-result v1

    .line 424
    if-gtz v1, :cond_23

    .line 425
    .line 426
    goto/16 :goto_16

    .line 427
    .line 428
    :cond_23
    add-int/2addr v1, v6

    .line 429
    invoke-static {v10, v6, v1}, Lg7;->Ρ([BII)[B

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    invoke-static {v8, v7}, Lfj;->Δ(Landroid/media/AudioTrack;Ljava/lang/Integer;)Lej;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    invoke-static {v0, v1, v2}, Lfj;->κ(Ldj;[BLej;)V

    .line 438
    .line 439
    .line 440
    goto/16 :goto_16

    .line 441
    .line 442
    :cond_24
    instance-of v11, v10, [S

    .line 443
    .line 444
    if-eqz v11, :cond_29

    .line 445
    .line 446
    invoke-static {v5, v9}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    instance-of v4, v1, Ljava/lang/Integer;

    .line 451
    .line 452
    if-eqz v4, :cond_25

    .line 453
    .line 454
    move-object v7, v1

    .line 455
    check-cast v7, Ljava/lang/Integer;

    .line 456
    .line 457
    :cond_25
    if-eqz v7, :cond_26

    .line 458
    .line 459
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 460
    .line 461
    .line 462
    move-result v1

    .line 463
    goto :goto_11

    .line 464
    :cond_26
    move v1, v6

    .line 465
    :goto_11
    check-cast v10, [S

    .line 466
    .line 467
    array-length v4, v10

    .line 468
    sub-int/2addr v4, v1

    .line 469
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    .line 470
    .line 471
    .line 472
    move-result v2

    .line 473
    if-gtz v2, :cond_27

    .line 474
    .line 475
    goto/16 :goto_16

    .line 476
    .line 477
    :cond_27
    mul-int/lit8 v4, v2, 0x2

    .line 478
    .line 479
    new-array v4, v4, [B

    .line 480
    .line 481
    add-int/2addr v2, v1

    .line 482
    :goto_12
    if-ge v1, v2, :cond_28

    .line 483
    .line 484
    aget-short v5, v10, v1

    .line 485
    .line 486
    add-int/lit8 v7, v6, 0x1

    .line 487
    .line 488
    and-int/lit16 v9, v5, 0xff

    .line 489
    .line 490
    int-to-byte v9, v9

    .line 491
    aput-byte v9, v4, v6

    .line 492
    .line 493
    add-int/2addr v6, v3

    .line 494
    ushr-int/lit8 v5, v5, 0x8

    .line 495
    .line 496
    and-int/lit16 v5, v5, 0xff

    .line 497
    .line 498
    int-to-byte v5, v5

    .line 499
    aput-byte v5, v4, v7

    .line 500
    .line 501
    add-int/lit8 v1, v1, 0x1

    .line 502
    .line 503
    goto :goto_12

    .line 504
    :cond_28
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 505
    .line 506
    .line 507
    move-result-object v1

    .line 508
    invoke-static {v8, v1}, Lfj;->Δ(Landroid/media/AudioTrack;Ljava/lang/Integer;)Lej;

    .line 509
    .line 510
    .line 511
    move-result-object v1

    .line 512
    invoke-static {v0, v4, v1}, Lfj;->κ(Ldj;[BLej;)V

    .line 513
    .line 514
    .line 515
    goto/16 :goto_16

    .line 516
    .line 517
    :cond_29
    instance-of v3, v10, [F

    .line 518
    .line 519
    if-eqz v3, :cond_2e

    .line 520
    .line 521
    invoke-static {v5, v9}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    instance-of v3, v1, Ljava/lang/Integer;

    .line 526
    .line 527
    if-eqz v3, :cond_2a

    .line 528
    .line 529
    move-object v7, v1

    .line 530
    check-cast v7, Ljava/lang/Integer;

    .line 531
    .line 532
    :cond_2a
    if-eqz v7, :cond_2b

    .line 533
    .line 534
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 535
    .line 536
    .line 537
    move-result v6

    .line 538
    :cond_2b
    check-cast v10, [F

    .line 539
    .line 540
    array-length v1, v10

    .line 541
    sub-int/2addr v1, v6

    .line 542
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    .line 543
    .line 544
    .line 545
    move-result v1

    .line 546
    if-gtz v1, :cond_2c

    .line 547
    .line 548
    goto :goto_16

    .line 549
    :cond_2c
    mul-int/lit8 v2, v1, 0x4

    .line 550
    .line 551
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 552
    .line 553
    .line 554
    move-result-object v2

    .line 555
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 556
    .line 557
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 558
    .line 559
    .line 560
    move-result-object v2

    .line 561
    add-int/2addr v1, v6

    .line 562
    :goto_13
    if-ge v6, v1, :cond_2d

    .line 563
    .line 564
    aget v3, v10, v6

    .line 565
    .line 566
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 567
    .line 568
    .line 569
    add-int/lit8 v6, v6, 0x1

    .line 570
    .line 571
    goto :goto_13

    .line 572
    :cond_2d
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 577
    .line 578
    .line 579
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 580
    .line 581
    .line 582
    move-result-object v2

    .line 583
    invoke-static {v8, v2}, Lfj;->Δ(Landroid/media/AudioTrack;Ljava/lang/Integer;)Lej;

    .line 584
    .line 585
    .line 586
    move-result-object v2

    .line 587
    invoke-static {v0, v1, v2}, Lfj;->κ(Ldj;[BLej;)V

    .line 588
    .line 589
    .line 590
    goto :goto_16

    .line 591
    :cond_2e
    instance-of v3, v10, Ljava/nio/ByteBuffer;

    .line 592
    .line 593
    if-eqz v3, :cond_33

    .line 594
    .line 595
    const-string v3, "dy_audio_bytes"

    .line 596
    .line 597
    iget-object v1, v1, Lk01;->δ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 598
    .line 599
    invoke-virtual {v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v1

    .line 603
    instance-of v3, v1, [B

    .line 604
    .line 605
    if-eqz v3, :cond_2f

    .line 606
    .line 607
    check-cast v1, [B

    .line 608
    .line 609
    goto :goto_14

    .line 610
    :cond_2f
    move-object v1, v7

    .line 611
    :goto_14
    if-nez v1, :cond_30

    .line 612
    .line 613
    goto :goto_16

    .line 614
    :cond_30
    array-length v3, v1

    .line 615
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 616
    .line 617
    .line 618
    move-result v2

    .line 619
    if-gtz v2, :cond_31

    .line 620
    .line 621
    goto :goto_16

    .line 622
    :cond_31
    array-length v3, v1

    .line 623
    if-ne v2, v3, :cond_32

    .line 624
    .line 625
    goto :goto_15

    .line 626
    :cond_32
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 627
    .line 628
    .line 629
    move-result-object v1

    .line 630
    :goto_15
    invoke-static {v8, v7}, Lfj;->Δ(Landroid/media/AudioTrack;Ljava/lang/Integer;)Lej;

    .line 631
    .line 632
    .line 633
    move-result-object v2

    .line 634
    invoke-static {v0, v1, v2}, Lfj;->κ(Ldj;[BLej;)V

    .line 635
    .line 636
    .line 637
    :cond_33
    :goto_16
    return-void

    .line 638
    :pswitch_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 639
    .line 640
    .line 641
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 642
    .line 643
    instance-of v1, v0, Landroid/media/AudioTrack;

    .line 644
    .line 645
    if-eqz v1, :cond_34

    .line 646
    .line 647
    check-cast v0, Landroid/media/AudioTrack;

    .line 648
    .line 649
    goto :goto_17

    .line 650
    :cond_34
    move-object v0, v7

    .line 651
    :goto_17
    if-nez v0, :cond_35

    .line 652
    .line 653
    goto :goto_18

    .line 654
    :cond_35
    invoke-static {v0, v7}, Lfj;->Δ(Landroid/media/AudioTrack;Ljava/lang/Integer;)Lej;

    .line 655
    .line 656
    .line 657
    move-result-object v1

    .line 658
    sget-object v2, Lfj;->ρ:Ljava/util/Map;

    .line 659
    .line 660
    monitor-enter v2

    .line 661
    :try_start_b
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 662
    .line 663
    .line 664
    monitor-exit v2

    .line 665
    :goto_18
    return-void

    .line 666
    :catchall_8
    move-exception v0

    .line 667
    monitor-exit v2

    .line 668
    throw v0

    .line 669
    :pswitch_9
    const-string v2, "http"

    .line 670
    .line 671
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 672
    .line 673
    .line 674
    sget-object v0, Lfj;->α:Lfj;

    .line 675
    .line 676
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 677
    .line 678
    instance-of v4, v0, Landroid/view/View;

    .line 679
    .line 680
    if-eqz v4, :cond_36

    .line 681
    .line 682
    check-cast v0, Landroid/view/View;

    .line 683
    .line 684
    move-object v4, v0

    .line 685
    goto :goto_19

    .line 686
    :cond_36
    move-object v4, v7

    .line 687
    :goto_19
    if-nez v4, :cond_37

    .line 688
    .line 689
    goto/16 :goto_30

    .line 690
    .line 691
    :cond_37
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 692
    .line 693
    if-eqz v0, :cond_5d

    .line 694
    .line 695
    array-length v1, v0

    .line 696
    move v8, v6

    .line 697
    :goto_1a
    if-ge v8, v1, :cond_3a

    .line 698
    .line 699
    aget-object v9, v0, v8

    .line 700
    .line 701
    if-eqz v9, :cond_38

    .line 702
    .line 703
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 704
    .line 705
    .line 706
    move-result-object v10

    .line 707
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    move-result-object v10

    .line 711
    goto :goto_1b

    .line 712
    :cond_38
    move-object v10, v7

    .line 713
    :goto_1b
    const-string v11, "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654AFAE24985FA802AAD9131B3F256364FE597603FE0C9F429AC0783D12F128B686"

    .line 714
    .line 715
    invoke-static {v11}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 716
    .line 717
    .line 718
    move-result-object v11

    .line 719
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 720
    .line 721
    .line 722
    move-result v10

    .line 723
    if-eqz v10, :cond_39

    .line 724
    .line 725
    goto :goto_1c

    .line 726
    :cond_39
    add-int/lit8 v8, v8, 0x1

    .line 727
    .line 728
    goto :goto_1a

    .line 729
    :cond_3a
    move-object v9, v7

    .line 730
    :goto_1c
    if-nez v9, :cond_3b

    .line 731
    .line 732
    goto/16 :goto_30

    .line 733
    .line 734
    :cond_3b
    const-string v0, ""

    .line 735
    .line 736
    const-string v1, "content"

    .line 737
    .line 738
    invoke-static {v9, v1}, Lfj;->Α(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 739
    .line 740
    .line 741
    move-result-object v1

    .line 742
    instance-of v8, v1, Ljava/lang/String;

    .line 743
    .line 744
    if-eqz v8, :cond_3c

    .line 745
    .line 746
    check-cast v1, Ljava/lang/String;

    .line 747
    .line 748
    move-object v12, v1

    .line 749
    goto :goto_1d

    .line 750
    :cond_3c
    move-object v12, v7

    .line 751
    :goto_1d
    const-string v1, "vid"

    .line 752
    .line 753
    invoke-static {v9, v1}, Lfj;->Α(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 754
    .line 755
    .line 756
    move-result-object v1

    .line 757
    instance-of v8, v1, Ljava/lang/String;

    .line 758
    .line 759
    if-eqz v8, :cond_3d

    .line 760
    .line 761
    check-cast v1, Ljava/lang/String;

    .line 762
    .line 763
    goto :goto_1e

    .line 764
    :cond_3d
    move-object v1, v7

    .line 765
    :goto_1e
    if-nez v1, :cond_3e

    .line 766
    .line 767
    move-object v1, v0

    .line 768
    :cond_3e
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 769
    .line 770
    .line 771
    move-result v8

    .line 772
    if-eqz v8, :cond_42

    .line 773
    .line 774
    if-eqz v12, :cond_40

    .line 775
    .line 776
    invoke-static {v12}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 777
    .line 778
    .line 779
    move-result v1

    .line 780
    if-nez v1, :cond_3f

    .line 781
    .line 782
    move-object v1, v12

    .line 783
    goto :goto_1f

    .line 784
    :cond_3f
    move-object v1, v7

    .line 785
    :goto_1f
    if-nez v1, :cond_41

    .line 786
    .line 787
    :cond_40
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 788
    .line 789
    .line 790
    move-result-object v1

    .line 791
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v1

    .line 795
    invoke-static {v9}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 796
    .line 797
    .line 798
    move-result v8

    .line 799
    const-string v10, "@"

    .line 800
    .line 801
    invoke-static {v1, v10, v8}, Lnx;->ι(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 802
    .line 803
    .line 804
    move-result-object v1

    .line 805
    :cond_41
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 806
    .line 807
    .line 808
    move-result v1

    .line 809
    invoke-static {v1}, Ljava/lang/Integer;->toUnsignedLong(I)J

    .line 810
    .line 811
    .line 812
    move-result-wide v10

    .line 813
    const-string v1, "comment_audio_"

    .line 814
    .line 815
    invoke-static {v10, v11, v1}, Lnx;->ε(JLjava/lang/String;)Ljava/lang/String;

    .line 816
    .line 817
    .line 818
    move-result-object v1

    .line 819
    :cond_42
    move-object v11, v1

    .line 820
    invoke-static {v11}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 821
    .line 822
    .line 823
    move-result v1

    .line 824
    if-eqz v1, :cond_43

    .line 825
    .line 826
    goto/16 :goto_2c

    .line 827
    .line 828
    :cond_43
    const-string v1, "duration"

    .line 829
    .line 830
    invoke-static {v9, v1}, Lfj;->Α(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 831
    .line 832
    .line 833
    move-result-object v1

    .line 834
    instance-of v8, v1, Ljava/lang/Number;

    .line 835
    .line 836
    if-eqz v8, :cond_44

    .line 837
    .line 838
    check-cast v1, Ljava/lang/Number;

    .line 839
    .line 840
    goto :goto_20

    .line 841
    :cond_44
    move-object v1, v7

    .line 842
    :goto_20
    if-eqz v1, :cond_45

    .line 843
    .line 844
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 845
    .line 846
    .line 847
    move-result-wide v13

    .line 848
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 849
    .line 850
    .line 851
    move-result-object v1

    .line 852
    move-object v14, v1

    .line 853
    goto :goto_21

    .line 854
    :cond_45
    move-object v14, v7

    .line 855
    :goto_21
    const-string v1, "asr_text"

    .line 856
    .line 857
    invoke-static {v9, v1}, Lfj;->Α(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 858
    .line 859
    .line 860
    move-result-object v1

    .line 861
    instance-of v8, v1, Ljava/lang/String;

    .line 862
    .line 863
    if-eqz v8, :cond_46

    .line 864
    .line 865
    check-cast v1, Ljava/lang/String;

    .line 866
    .line 867
    goto :goto_22

    .line 868
    :cond_46
    move-object v1, v7

    .line 869
    :goto_22
    if-nez v1, :cond_47

    .line 870
    .line 871
    move-object v1, v0

    .line 872
    :cond_47
    const-string v8, "timbre_text"

    .line 873
    .line 874
    invoke-static {v9, v8}, Lfj;->Α(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 875
    .line 876
    .line 877
    move-result-object v8

    .line 878
    instance-of v10, v8, Ljava/lang/String;

    .line 879
    .line 880
    if-eqz v10, :cond_48

    .line 881
    .line 882
    check-cast v8, Ljava/lang/String;

    .line 883
    .line 884
    goto :goto_23

    .line 885
    :cond_48
    move-object v8, v7

    .line 886
    :goto_23
    if-nez v8, :cond_49

    .line 887
    .line 888
    move-object v8, v0

    .line 889
    :cond_49
    const-string v10, "isLocal"

    .line 890
    .line 891
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 892
    .line 893
    .line 894
    move-result-object v0

    .line 895
    move-object v13, v0

    .line 896
    :goto_24
    if-eqz v13, :cond_4f

    .line 897
    .line 898
    const-class v0, Ljava/lang/Object;

    .line 899
    .line 900
    invoke-virtual {v13, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 901
    .line 902
    .line 903
    move-result v0

    .line 904
    if-nez v0, :cond_4f

    .line 905
    .line 906
    :try_start_c
    invoke-virtual {v13, v10}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 907
    .line 908
    .line 909
    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    .line 910
    goto :goto_25

    .line 911
    :catchall_9
    move-exception v0

    .line 912
    new-instance v15, Leo1;

    .line 913
    .line 914
    invoke-direct {v15, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 915
    .line 916
    .line 917
    move-object v0, v15

    .line 918
    :goto_25
    instance-of v15, v0, Leo1;

    .line 919
    .line 920
    if-eqz v15, :cond_4a

    .line 921
    .line 922
    move-object v0, v7

    .line 923
    :cond_4a
    check-cast v0, Ljava/lang/reflect/Field;

    .line 924
    .line 925
    if-eqz v0, :cond_4e

    .line 926
    .line 927
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 928
    .line 929
    .line 930
    move-result-object v15

    .line 931
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 932
    .line 933
    invoke-static {v15, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 934
    .line 935
    .line 936
    move-result v7

    .line 937
    if-nez v7, :cond_4b

    .line 938
    .line 939
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 940
    .line 941
    .line 942
    move-result-object v7

    .line 943
    const-class v15, Ljava/lang/Boolean;

    .line 944
    .line 945
    invoke-static {v7, v15}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 946
    .line 947
    .line 948
    move-result v7

    .line 949
    if-eqz v7, :cond_4e

    .line 950
    .line 951
    :cond_4b
    :try_start_d
    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 952
    .line 953
    .line 954
    invoke-virtual {v0, v9}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 955
    .line 956
    .line 957
    move-result-object v0

    .line 958
    instance-of v7, v0, Ljava/lang/Boolean;

    .line 959
    .line 960
    if-eqz v7, :cond_4c

    .line 961
    .line 962
    check-cast v0, Ljava/lang/Boolean;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_a

    .line 963
    .line 964
    goto :goto_27

    .line 965
    :catchall_a
    move-exception v0

    .line 966
    goto :goto_26

    .line 967
    :cond_4c
    const/4 v0, 0x0

    .line 968
    goto :goto_27

    .line 969
    :goto_26
    new-instance v7, Leo1;

    .line 970
    .line 971
    invoke-direct {v7, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 972
    .line 973
    .line 974
    move-object v0, v7

    .line 975
    :goto_27
    instance-of v7, v0, Leo1;

    .line 976
    .line 977
    if-eqz v7, :cond_4d

    .line 978
    .line 979
    const/4 v0, 0x0

    .line 980
    :cond_4d
    check-cast v0, Ljava/lang/Boolean;

    .line 981
    .line 982
    goto :goto_28

    .line 983
    :cond_4e
    invoke-virtual {v13}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 984
    .line 985
    .line 986
    move-result-object v13

    .line 987
    const/4 v7, 0x0

    .line 988
    goto :goto_24

    .line 989
    :cond_4f
    const/4 v0, 0x0

    .line 990
    :goto_28
    if-eqz v0, :cond_50

    .line 991
    .line 992
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 993
    .line 994
    .line 995
    move-result v0

    .line 996
    :goto_29
    move v13, v0

    .line 997
    goto :goto_2a

    .line 998
    :cond_50
    invoke-static {v12}, Lfj;->υ(Ljava/lang/String;)Z

    .line 999
    .line 1000
    .line 1001
    move-result v0

    .line 1002
    goto :goto_29

    .line 1003
    :goto_2a
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1004
    .line 1005
    .line 1006
    move-result v0

    .line 1007
    if-eqz v0, :cond_51

    .line 1008
    .line 1009
    move-object v1, v8

    .line 1010
    :cond_51
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1011
    .line 1012
    .line 1013
    move-result v0

    .line 1014
    if-nez v0, :cond_52

    .line 1015
    .line 1016
    move-object v15, v1

    .line 1017
    goto :goto_2b

    .line 1018
    :cond_52
    const/4 v15, 0x0

    .line 1019
    :goto_2b
    new-instance v10, Lcj;

    .line 1020
    .line 1021
    invoke-direct/range {v10 .. v15}, Lcj;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/String;)V

    .line 1022
    .line 1023
    .line 1024
    move-object v7, v10

    .line 1025
    :goto_2c
    if-nez v7, :cond_53

    .line 1026
    .line 1027
    goto/16 :goto_30

    .line 1028
    .line 1029
    :cond_53
    sget-object v0, Lfj;->κ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1030
    .line 1031
    iget-object v1, v7, Lcj;->α:Ljava/lang/String;

    .line 1032
    .line 1033
    invoke-virtual {v0, v1, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1034
    .line 1035
    .line 1036
    iget-object v0, v7, Lcj;->β:Ljava/lang/String;

    .line 1037
    .line 1038
    if-nez v0, :cond_54

    .line 1039
    .line 1040
    goto :goto_2f

    .line 1041
    :cond_54
    invoke-static {v0}, Lfj;->υ(Ljava/lang/String;)Z

    .line 1042
    .line 1043
    .line 1044
    move-result v8

    .line 1045
    if-eqz v8, :cond_55

    .line 1046
    .line 1047
    goto :goto_2f

    .line 1048
    :cond_55
    invoke-static {v0}, Lfj;->ψ(Ljava/lang/String;)Ljava/lang/String;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v8

    .line 1052
    invoke-static {v8, v2, v5}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1053
    .line 1054
    .line 1055
    move-result v9

    .line 1056
    if-eqz v9, :cond_56

    .line 1057
    .line 1058
    invoke-static {v8}, Lfj;->σ(Ljava/lang/String;)Z

    .line 1059
    .line 1060
    .line 1061
    move-result v9

    .line 1062
    if-eqz v9, :cond_56

    .line 1063
    .line 1064
    goto :goto_2d

    .line 1065
    :cond_56
    invoke-static {v8}, Lfj;->ω(Ljava/lang/String;)Ljava/lang/Object;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v8

    .line 1069
    const/16 v9, 0xc

    .line 1070
    .line 1071
    invoke-static {v9, v8}, Lfj;->μ(ILjava/lang/Object;)Ljava/lang/String;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v8

    .line 1075
    :goto_2d
    if-eqz v8, :cond_58

    .line 1076
    .line 1077
    invoke-static {v8}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1078
    .line 1079
    .line 1080
    move-result v9

    .line 1081
    if-eqz v9, :cond_57

    .line 1082
    .line 1083
    goto :goto_2e

    .line 1084
    :cond_57
    invoke-static {v1, v8, v5}, Lfj;->γ(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1085
    .line 1086
    .line 1087
    :cond_58
    :goto_2e
    invoke-static {v0}, Lfj;->ψ(Ljava/lang/String;)Ljava/lang/String;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v0

    .line 1091
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1092
    .line 1093
    invoke-static {v8, v0, v8}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v8

    .line 1097
    invoke-static {v0, v2, v5}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1098
    .line 1099
    .line 1100
    move-result v2

    .line 1101
    if-eqz v2, :cond_5a

    .line 1102
    .line 1103
    const-string v2, "fplay"

    .line 1104
    .line 1105
    invoke-static {v8, v2, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1106
    .line 1107
    .line 1108
    move-result v2

    .line 1109
    if-nez v2, :cond_59

    .line 1110
    .line 1111
    const-string v2, "video_id"

    .line 1112
    .line 1113
    invoke-static {v8, v2, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1114
    .line 1115
    .line 1116
    move-result v2

    .line 1117
    if-eqz v2, :cond_5a

    .line 1118
    .line 1119
    :cond_59
    invoke-static {v1, v0, v6}, Lfj;->γ(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1120
    .line 1121
    .line 1122
    :cond_5a
    :goto_2f
    sget-object v0, Lfj;->μ:Ljava/util/Map;

    .line 1123
    .line 1124
    invoke-interface {v0, v4, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1125
    .line 1126
    .line 1127
    invoke-static {}, Lfj;->δ()I

    .line 1128
    .line 1129
    .line 1130
    move-result v0

    .line 1131
    if-eq v0, v5, :cond_5c

    .line 1132
    .line 1133
    if-eq v0, v3, :cond_5b

    .line 1134
    .line 1135
    goto :goto_30

    .line 1136
    :cond_5b
    invoke-static {v4, v7}, Lfj;->λ(Landroid/view/View;Lcj;)V

    .line 1137
    .line 1138
    .line 1139
    goto :goto_30

    .line 1140
    :cond_5c
    invoke-static {v4, v7}, Lfj;->λ(Landroid/view/View;Lcj;)V

    .line 1141
    .line 1142
    .line 1143
    :cond_5d
    :goto_30
    return-void

    .line 1144
    :pswitch_a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1145
    .line 1146
    .line 1147
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 1148
    .line 1149
    instance-of v2, v0, Landroid/view/View;

    .line 1150
    .line 1151
    if-eqz v2, :cond_5e

    .line 1152
    .line 1153
    check-cast v0, Landroid/view/View;

    .line 1154
    .line 1155
    goto :goto_31

    .line 1156
    :cond_5e
    const/4 v0, 0x0

    .line 1157
    :goto_31
    if-nez v0, :cond_5f

    .line 1158
    .line 1159
    goto :goto_33

    .line 1160
    :cond_5f
    iget-object v1, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 1161
    .line 1162
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1163
    .line 1164
    .line 1165
    invoke-static {v6, v1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v1

    .line 1169
    instance-of v2, v1, Landroid/view/MotionEvent;

    .line 1170
    .line 1171
    if-eqz v2, :cond_60

    .line 1172
    .line 1173
    move-object v7, v1

    .line 1174
    check-cast v7, Landroid/view/MotionEvent;

    .line 1175
    .line 1176
    goto :goto_32

    .line 1177
    :cond_60
    const/4 v7, 0x0

    .line 1178
    :goto_32
    if-nez v7, :cond_61

    .line 1179
    .line 1180
    goto :goto_33

    .line 1181
    :cond_61
    invoke-virtual {v7}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 1182
    .line 1183
    .line 1184
    move-result v1

    .line 1185
    if-eq v1, v5, :cond_62

    .line 1186
    .line 1187
    const/4 v2, 0x3

    .line 1188
    if-eq v1, v2, :cond_62

    .line 1189
    .line 1190
    goto :goto_33

    .line 1191
    :cond_62
    sget-object v1, Loh;->κ:Ljava/util/Set;

    .line 1192
    .line 1193
    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1194
    .line 1195
    .line 1196
    sget-object v1, Loh;->α:Loh;

    .line 1197
    .line 1198
    invoke-virtual {v1, v0}, Loh;->ζ(Landroid/view/View;)V

    .line 1199
    .line 1200
    .line 1201
    :goto_33
    return-void

    .line 1202
    :pswitch_b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1203
    .line 1204
    .line 1205
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 1206
    .line 1207
    instance-of v1, v0, Landroid/view/View;

    .line 1208
    .line 1209
    if-eqz v1, :cond_63

    .line 1210
    .line 1211
    move-object v7, v0

    .line 1212
    check-cast v7, Landroid/view/View;

    .line 1213
    .line 1214
    goto :goto_34

    .line 1215
    :cond_63
    const/4 v7, 0x0

    .line 1216
    :goto_34
    if-nez v7, :cond_64

    .line 1217
    .line 1218
    goto :goto_35

    .line 1219
    :cond_64
    sget-object v0, Loh;->α:Loh;

    .line 1220
    .line 1221
    invoke-static {v7}, Loh;->α(Landroid/view/View;)V

    .line 1222
    .line 1223
    .line 1224
    :goto_35
    return-void

    .line 1225
    :pswitch_c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1226
    .line 1227
    .line 1228
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 1229
    .line 1230
    instance-of v1, v0, Landroid/view/View;

    .line 1231
    .line 1232
    if-eqz v1, :cond_65

    .line 1233
    .line 1234
    move-object v7, v0

    .line 1235
    check-cast v7, Landroid/view/View;

    .line 1236
    .line 1237
    goto :goto_36

    .line 1238
    :cond_65
    const/4 v7, 0x0

    .line 1239
    :goto_36
    if-nez v7, :cond_66

    .line 1240
    .line 1241
    goto :goto_37

    .line 1242
    :cond_66
    sget-object v0, Loh;->α:Loh;

    .line 1243
    .line 1244
    sget-boolean v0, Loh;->η:Z

    .line 1245
    .line 1246
    if-nez v0, :cond_67

    .line 1247
    .line 1248
    goto :goto_37

    .line 1249
    :cond_67
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1250
    .line 1251
    invoke-static {v7, v0}, Loh;->β(Landroid/view/View;F)V

    .line 1252
    .line 1253
    .line 1254
    :goto_37
    return-void

    .line 1255
    :pswitch_d
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1256
    .line 1257
    .line 1258
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 1259
    .line 1260
    instance-of v1, v0, Landroid/view/View;

    .line 1261
    .line 1262
    if-eqz v1, :cond_68

    .line 1263
    .line 1264
    move-object v7, v0

    .line 1265
    check-cast v7, Landroid/view/View;

    .line 1266
    .line 1267
    goto :goto_38

    .line 1268
    :cond_68
    const/4 v7, 0x0

    .line 1269
    :goto_38
    if-nez v7, :cond_69

    .line 1270
    .line 1271
    goto :goto_39

    .line 1272
    :cond_69
    sget-object v0, Loh;->α:Loh;

    .line 1273
    .line 1274
    invoke-virtual {v0, v7}, Loh;->ζ(Landroid/view/View;)V

    .line 1275
    .line 1276
    .line 1277
    :goto_39
    return-void

    .line 1278
    :pswitch_e
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1279
    .line 1280
    .line 1281
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 1282
    .line 1283
    instance-of v1, v0, Landroid/view/View;

    .line 1284
    .line 1285
    if-eqz v1, :cond_6a

    .line 1286
    .line 1287
    move-object v7, v0

    .line 1288
    check-cast v7, Landroid/view/View;

    .line 1289
    .line 1290
    goto :goto_3a

    .line 1291
    :cond_6a
    const/4 v7, 0x0

    .line 1292
    :goto_3a
    if-nez v7, :cond_6b

    .line 1293
    .line 1294
    goto :goto_3b

    .line 1295
    :cond_6b
    const-string v0, "AwemeIntroInfoLayout attached"

    .line 1296
    .line 1297
    sget-object v1, Lug;->α:Ltg;

    .line 1298
    .line 1299
    invoke-virtual {v1, v7, v0}, Ltg;->Τ(Landroid/view/View;Ljava/lang/String;)V

    .line 1300
    .line 1301
    .line 1302
    :goto_3b
    return-void

    .line 1303
    :pswitch_f
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1304
    .line 1305
    .line 1306
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 1307
    .line 1308
    instance-of v1, v0, Landroid/view/View;

    .line 1309
    .line 1310
    if-eqz v1, :cond_6c

    .line 1311
    .line 1312
    move-object v7, v0

    .line 1313
    check-cast v7, Landroid/view/View;

    .line 1314
    .line 1315
    goto :goto_3c

    .line 1316
    :cond_6c
    const/4 v7, 0x0

    .line 1317
    :goto_3c
    if-nez v7, :cond_6d

    .line 1318
    .line 1319
    goto :goto_3d

    .line 1320
    :cond_6d
    const-string v0, "AwemeIntroInfoLayout constructor"

    .line 1321
    .line 1322
    sget-object v1, Lug;->α:Ltg;

    .line 1323
    .line 1324
    invoke-virtual {v1, v7, v0}, Ltg;->Τ(Landroid/view/View;Ljava/lang/String;)V

    .line 1325
    .line 1326
    .line 1327
    :goto_3d
    return-void

    .line 1328
    :pswitch_10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1329
    .line 1330
    .line 1331
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 1332
    .line 1333
    instance-of v1, v0, Landroid/app/Activity;

    .line 1334
    .line 1335
    if-eqz v1, :cond_6e

    .line 1336
    .line 1337
    check-cast v0, Landroid/app/Activity;

    .line 1338
    .line 1339
    goto :goto_3e

    .line 1340
    :cond_6e
    const/4 v0, 0x0

    .line 1341
    :goto_3e
    if-nez v0, :cond_6f

    .line 1342
    .line 1343
    goto :goto_40

    .line 1344
    :cond_6f
    sget-object v1, Lug;->μ:La;

    .line 1345
    .line 1346
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1347
    .line 1348
    .line 1349
    iget-object v2, v1, La;->β:Ljava/lang/Object;

    .line 1350
    .line 1351
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 1352
    .line 1353
    if-eqz v2, :cond_70

    .line 1354
    .line 1355
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v2

    .line 1359
    goto :goto_3f

    .line 1360
    :cond_70
    const/4 v2, 0x0

    .line 1361
    :goto_3f
    if-eq v2, v0, :cond_71

    .line 1362
    .line 1363
    goto :goto_40

    .line 1364
    :cond_71
    const/4 v2, 0x0

    .line 1365
    iput-object v2, v1, La;->β:Ljava/lang/Object;

    .line 1366
    .line 1367
    sget-object v0, Lug;->α:Ltg;

    .line 1368
    .line 1369
    invoke-static {}, Ltg;->η()V

    .line 1370
    .line 1371
    .line 1372
    sput-boolean v6, Lug;->φ:Z

    .line 1373
    .line 1374
    invoke-static {}, Ltg;->θ()V

    .line 1375
    .line 1376
    .line 1377
    sput-boolean v6, Lug;->ω:Z

    .line 1378
    .line 1379
    sput-object v2, Lug;->Β:Ljava/lang/Long;

    .line 1380
    .line 1381
    const-string v0, "activity pause"

    .line 1382
    .line 1383
    invoke-static {v0}, Ltg;->ζ(Ljava/lang/String;)V

    .line 1384
    .line 1385
    .line 1386
    :try_start_e
    sget-object v0, Lsb;->α:Lsb;

    .line 1387
    .line 1388
    invoke-static {v6}, Lsb;->в(Z)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_b

    .line 1389
    .line 1390
    .line 1391
    :catchall_b
    :goto_40
    return-void

    .line 1392
    :pswitch_11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1393
    .line 1394
    .line 1395
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 1396
    .line 1397
    instance-of v1, v0, Landroid/app/Activity;

    .line 1398
    .line 1399
    if-eqz v1, :cond_72

    .line 1400
    .line 1401
    move-object v7, v0

    .line 1402
    check-cast v7, Landroid/app/Activity;

    .line 1403
    .line 1404
    goto :goto_41

    .line 1405
    :cond_72
    const/4 v7, 0x0

    .line 1406
    :goto_41
    if-nez v7, :cond_73

    .line 1407
    .line 1408
    goto/16 :goto_44

    .line 1409
    .line 1410
    :cond_73
    sget-object v0, Lug;->μ:La;

    .line 1411
    .line 1412
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v1

    .line 1416
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v1

    .line 1420
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1421
    .line 1422
    .line 1423
    iget-object v2, v0, La;->α:Ljava/lang/Object;

    .line 1424
    .line 1425
    check-cast v2, Ljava/util/Set;

    .line 1426
    .line 1427
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1428
    .line 1429
    .line 1430
    move-result v1

    .line 1431
    if-nez v1, :cond_74

    .line 1432
    .line 1433
    goto/16 :goto_44

    .line 1434
    .line 1435
    :cond_74
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 1436
    .line 1437
    invoke-direct {v1, v7}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 1438
    .line 1439
    .line 1440
    iput-object v1, v0, La;->β:Ljava/lang/Object;

    .line 1441
    .line 1442
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 1443
    .line 1444
    invoke-direct {v0, v7}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 1445
    .line 1446
    .line 1447
    sput-object v0, Lug;->η:Ljava/lang/ref/WeakReference;

    .line 1448
    .line 1449
    invoke-static {}, Lui1;->Α()Z

    .line 1450
    .line 1451
    .line 1452
    move-result v0

    .line 1453
    if-nez v0, :cond_75

    .line 1454
    .line 1455
    invoke-static {v7}, Lui1;->π(Landroid/content/Context;)V

    .line 1456
    .line 1457
    .line 1458
    :cond_75
    sget-boolean v0, Lug;->Ρ:Z

    .line 1459
    .line 1460
    if-nez v0, :cond_77

    .line 1461
    .line 1462
    :try_start_f
    invoke-static {v7}, Lx9;->ο(Landroid/content/Context;)V

    .line 1463
    .line 1464
    .line 1465
    invoke-static {}, Lx9;->π()Z

    .line 1466
    .line 1467
    .line 1468
    move-result v0

    .line 1469
    if-eqz v0, :cond_76

    .line 1470
    .line 1471
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->β()Z

    .line 1472
    .line 1473
    .line 1474
    move-result v0

    .line 1475
    if-eqz v0, :cond_76

    .line 1476
    .line 1477
    move v0, v5

    .line 1478
    goto :goto_42

    .line 1479
    :cond_76
    move v0, v6

    .line 1480
    :goto_42
    sput-boolean v0, Lug;->Τ:Z

    .line 1481
    .line 1482
    sput-boolean v5, Lug;->Ρ:Z
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_c

    .line 1483
    .line 1484
    goto :goto_43

    .line 1485
    :catchall_c
    move-exception v0

    .line 1486
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v0

    .line 1490
    const-string v1, "r34e75321ec25175"

    .line 1491
    .line 1492
    invoke-static {v1, v0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 1493
    .line 1494
    .line 1495
    :cond_77
    :goto_43
    sget-object v0, Lug;->α:Ltg;

    .line 1496
    .line 1497
    invoke-static {}, Ltg;->е()V

    .line 1498
    .line 1499
    .line 1500
    invoke-static {}, Ltg;->Μ()Z

    .line 1501
    .line 1502
    .line 1503
    move-result v1

    .line 1504
    if-eqz v1, :cond_78

    .line 1505
    .line 1506
    invoke-virtual {v0}, Ltg;->ο()Z

    .line 1507
    .line 1508
    .line 1509
    :cond_78
    invoke-virtual {v0}, Ltg;->π()V

    .line 1510
    .line 1511
    .line 1512
    invoke-virtual {v0}, Ltg;->ц()V

    .line 1513
    .line 1514
    .line 1515
    sput-boolean v6, Lug;->φ:Z

    .line 1516
    .line 1517
    invoke-static {}, Ltg;->η()V

    .line 1518
    .line 1519
    .line 1520
    const-string v0, "activity resume"

    .line 1521
    .line 1522
    invoke-static {v0}, Ltg;->щ(Ljava/lang/String;)V

    .line 1523
    .line 1524
    .line 1525
    invoke-virtual {v7}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v0

    .line 1529
    if-eqz v0, :cond_79

    .line 1530
    .line 1531
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v0

    .line 1535
    if-eqz v0, :cond_79

    .line 1536
    .line 1537
    new-instance v1, Ls0;

    .line 1538
    .line 1539
    const/4 v2, 0x7

    .line 1540
    invoke-direct {v1, v2}, Ls0;-><init>(I)V

    .line 1541
    .line 1542
    .line 1543
    const-wide/16 v2, 0x1f4

    .line 1544
    .line 1545
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1546
    .line 1547
    .line 1548
    :cond_79
    :goto_44
    return-void

    .line 1549
    :pswitch_12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1550
    .line 1551
    .line 1552
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 1553
    .line 1554
    instance-of v2, v0, Landroid/view/View;

    .line 1555
    .line 1556
    if-eqz v2, :cond_7a

    .line 1557
    .line 1558
    check-cast v0, Landroid/view/View;

    .line 1559
    .line 1560
    goto :goto_45

    .line 1561
    :cond_7a
    const/4 v0, 0x0

    .line 1562
    :goto_45
    if-nez v0, :cond_7b

    .line 1563
    .line 1564
    goto :goto_48

    .line 1565
    :cond_7b
    sget-object v2, Lkf;->α:Lkf;

    .line 1566
    .line 1567
    invoke-static {v0}, Lkf;->ψ(Landroid/view/View;)Ljava/lang/Float;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v3

    .line 1571
    if-nez v3, :cond_7e

    .line 1572
    .line 1573
    iget-object v1, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 1574
    .line 1575
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1576
    .line 1577
    .line 1578
    invoke-static {v6, v1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v1

    .line 1582
    instance-of v3, v1, Ljava/lang/Number;

    .line 1583
    .line 1584
    if-eqz v3, :cond_7c

    .line 1585
    .line 1586
    check-cast v1, Ljava/lang/Number;

    .line 1587
    .line 1588
    goto :goto_46

    .line 1589
    :cond_7c
    const/4 v1, 0x0

    .line 1590
    :goto_46
    if-eqz v1, :cond_7d

    .line 1591
    .line 1592
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 1593
    .line 1594
    .line 1595
    move-result v1

    .line 1596
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1597
    .line 1598
    .line 1599
    move-result-object v7

    .line 1600
    goto :goto_47

    .line 1601
    :cond_7d
    const/4 v7, 0x0

    .line 1602
    :goto_47
    invoke-static {v7}, Lkf;->ρ(Ljava/lang/Float;)Ljava/lang/Float;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v3

    .line 1606
    :cond_7e
    invoke-static {v0}, Lkf;->α(Landroid/view/View;)V

    .line 1607
    .line 1608
    .line 1609
    invoke-virtual {v2, v0, v3}, Lkf;->δ(Landroid/view/View;Ljava/lang/Float;)V

    .line 1610
    .line 1611
    .line 1612
    :goto_48
    return-void

    .line 1613
    :pswitch_13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1614
    .line 1615
    .line 1616
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 1617
    .line 1618
    instance-of v2, v0, Landroid/view/View;

    .line 1619
    .line 1620
    if-eqz v2, :cond_7f

    .line 1621
    .line 1622
    check-cast v0, Landroid/view/View;

    .line 1623
    .line 1624
    goto :goto_49

    .line 1625
    :cond_7f
    const/4 v0, 0x0

    .line 1626
    :goto_49
    if-nez v0, :cond_80

    .line 1627
    .line 1628
    goto :goto_4c

    .line 1629
    :cond_80
    iget-object v1, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 1630
    .line 1631
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1632
    .line 1633
    .line 1634
    invoke-static {v6, v1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v1

    .line 1638
    instance-of v2, v1, Ljava/lang/Number;

    .line 1639
    .line 1640
    if-eqz v2, :cond_81

    .line 1641
    .line 1642
    check-cast v1, Ljava/lang/Number;

    .line 1643
    .line 1644
    goto :goto_4a

    .line 1645
    :cond_81
    const/4 v1, 0x0

    .line 1646
    :goto_4a
    if-eqz v1, :cond_82

    .line 1647
    .line 1648
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 1649
    .line 1650
    .line 1651
    move-result v1

    .line 1652
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v7

    .line 1656
    goto :goto_4b

    .line 1657
    :cond_82
    const/4 v7, 0x0

    .line 1658
    :goto_4b
    sget-object v1, Lkf;->α:Lkf;

    .line 1659
    .line 1660
    invoke-static {v0}, Lkf;->α(Landroid/view/View;)V

    .line 1661
    .line 1662
    .line 1663
    invoke-virtual {v1, v0, v7}, Lkf;->δ(Landroid/view/View;Ljava/lang/Float;)V

    .line 1664
    .line 1665
    .line 1666
    :goto_4c
    return-void

    .line 1667
    :pswitch_14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1668
    .line 1669
    .line 1670
    iget-object v2, v1, Lk01;->β:Ljava/lang/Object;

    .line 1671
    .line 1672
    if-nez v2, :cond_83

    .line 1673
    .line 1674
    goto/16 :goto_51

    .line 1675
    .line 1676
    :cond_83
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v0

    .line 1680
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1681
    .line 1682
    .line 1683
    move-result-object v0

    .line 1684
    const-string v3, "~78A74DB286A5B58D592E394EF41C63DE20BC788EDC43993D9FE552FEA93640AEDFE5AFE7C8A3CFD3375E6FDE1627078188FD62BAA7A10FBBFD96F951B4D213E33F2539ED5D9CE6C02C8B6F73"

    .line 1685
    .line 1686
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1687
    .line 1688
    .line 1689
    move-result-object v3

    .line 1690
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1691
    .line 1692
    .line 1693
    move-result v0

    .line 1694
    if-nez v0, :cond_84

    .line 1695
    .line 1696
    goto/16 :goto_51

    .line 1697
    .line 1698
    :cond_84
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 1699
    .line 1700
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1701
    .line 1702
    .line 1703
    invoke-static {v6, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1704
    .line 1705
    .line 1706
    move-result-object v0

    .line 1707
    if-nez v0, :cond_85

    .line 1708
    .line 1709
    goto/16 :goto_51

    .line 1710
    .line 1711
    :cond_85
    :try_start_10
    const-string v1, "getAweme"

    .line 1712
    .line 1713
    new-array v3, v6, [Ljava/lang/Object;

    .line 1714
    .line 1715
    invoke-static {v0, v1, v3}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1716
    .line 1717
    .line 1718
    move-result-object v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_d

    .line 1719
    goto :goto_4d

    .line 1720
    :catchall_d
    move-exception v0

    .line 1721
    new-instance v1, Leo1;

    .line 1722
    .line 1723
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1724
    .line 1725
    .line 1726
    move-object v0, v1

    .line 1727
    :goto_4d
    instance-of v1, v0, Leo1;

    .line 1728
    .line 1729
    if-eqz v1, :cond_86

    .line 1730
    .line 1731
    const/4 v1, 0x0

    .line 1732
    goto :goto_4e

    .line 1733
    :cond_86
    move-object v1, v0

    .line 1734
    :goto_4e
    if-nez v1, :cond_87

    .line 1735
    .line 1736
    goto/16 :goto_51

    .line 1737
    .line 1738
    :cond_87
    sget-object v0, Lkf;->α:Lkf;

    .line 1739
    .line 1740
    invoke-static {v2}, Lkf;->λ(Ljava/lang/Object;)Landroid/view/View;

    .line 1741
    .line 1742
    .line 1743
    move-result-object v3

    .line 1744
    const-wide/16 v4, 0xa0

    .line 1745
    .line 1746
    if-eqz v3, :cond_88

    .line 1747
    .line 1748
    invoke-static {v3, v1}, Lkf;->β(Landroid/view/View;Ljava/lang/Object;)V

    .line 1749
    .line 1750
    .line 1751
    :try_start_11
    new-instance v1, Lw1;

    .line 1752
    .line 1753
    const/4 v2, 0x5

    .line 1754
    invoke-direct {v1, v0, v2, v3}, Lw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1755
    .line 1756
    .line 1757
    invoke-virtual {v3, v1, v4, v5}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_e

    .line 1758
    .line 1759
    .line 1760
    :catchall_e
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1761
    .line 1762
    .line 1763
    move-result-object v0

    .line 1764
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1765
    .line 1766
    .line 1767
    move-result-object v0

    .line 1768
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 1769
    .line 1770
    .line 1771
    move-result v1

    .line 1772
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1773
    .line 1774
    const-string v3, "bind from FeedSyncPresenter#onBind view="

    .line 1775
    .line 1776
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1777
    .line 1778
    .line 1779
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1780
    .line 1781
    .line 1782
    const-string v0, "@"

    .line 1783
    .line 1784
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1785
    .line 1786
    .line 1787
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1788
    .line 1789
    .line 1790
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1791
    .line 1792
    .line 1793
    move-result-object v0

    .line 1794
    invoke-static {v0}, Lkf;->ο(Ljava/lang/String;)V

    .line 1795
    .line 1796
    .line 1797
    goto :goto_51

    .line 1798
    :cond_88
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 1799
    .line 1800
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 1801
    .line 1802
    .line 1803
    sput-object v0, Lkf;->δ:Ljava/lang/ref/WeakReference;

    .line 1804
    .line 1805
    const-string v0, "bind aweme from FeedSyncPresenter#onBind, seekbar pending"

    .line 1806
    .line 1807
    invoke-static {v0}, Lkf;->ο(Ljava/lang/String;)V

    .line 1808
    .line 1809
    .line 1810
    :try_start_12
    const-string v0, "getView"

    .line 1811
    .line 1812
    new-array v3, v6, [Ljava/lang/Object;

    .line 1813
    .line 1814
    invoke-static {v2, v0, v3}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1815
    .line 1816
    .line 1817
    move-result-object v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_f

    .line 1818
    goto :goto_4f

    .line 1819
    :catchall_f
    move-exception v0

    .line 1820
    new-instance v3, Leo1;

    .line 1821
    .line 1822
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1823
    .line 1824
    .line 1825
    move-object v0, v3

    .line 1826
    :goto_4f
    instance-of v3, v0, Leo1;

    .line 1827
    .line 1828
    if-eqz v3, :cond_89

    .line 1829
    .line 1830
    const/4 v0, 0x0

    .line 1831
    :cond_89
    instance-of v3, v0, Landroid/view/View;

    .line 1832
    .line 1833
    if-eqz v3, :cond_8a

    .line 1834
    .line 1835
    move-object v7, v0

    .line 1836
    check-cast v7, Landroid/view/View;

    .line 1837
    .line 1838
    goto :goto_50

    .line 1839
    :cond_8a
    const/4 v7, 0x0

    .line 1840
    :goto_50
    if-nez v7, :cond_8b

    .line 1841
    .line 1842
    goto :goto_51

    .line 1843
    :cond_8b
    :try_start_13
    new-instance v0, Lw1;

    .line 1844
    .line 1845
    invoke-direct {v0, v2, v1}, Lw1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1846
    .line 1847
    .line 1848
    invoke-virtual {v7, v0, v4, v5}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_10

    .line 1849
    .line 1850
    .line 1851
    :catchall_10
    :goto_51
    return-void

    .line 1852
    :pswitch_15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1853
    .line 1854
    .line 1855
    sget-object v0, Li;->α:Ljava/lang/ref/WeakReference;

    .line 1856
    .line 1857
    if-eqz v0, :cond_8c

    .line 1858
    .line 1859
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1860
    .line 1861
    .line 1862
    move-result-object v0

    .line 1863
    check-cast v0, Landroid/app/Activity;

    .line 1864
    .line 1865
    goto :goto_52

    .line 1866
    :cond_8c
    const/4 v0, 0x0

    .line 1867
    :goto_52
    iget-object v1, v1, Lk01;->β:Ljava/lang/Object;

    .line 1868
    .line 1869
    if-ne v0, v1, :cond_8d

    .line 1870
    .line 1871
    sget-object v0, Li;->α:Ljava/lang/ref/WeakReference;

    .line 1872
    .line 1873
    const/16 v16, 0x0

    .line 1874
    .line 1875
    sput-object v16, Li;->α:Ljava/lang/ref/WeakReference;

    .line 1876
    .line 1877
    :cond_8d
    return-void

    .line 1878
    :pswitch_16
    const-string v2, "r176f35f04e7b0cfb"

    .line 1879
    .line 1880
    sget-object v3, Ls62;->α:Ls62;

    .line 1881
    .line 1882
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1883
    .line 1884
    .line 1885
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 1886
    .line 1887
    instance-of v1, v0, Landroid/app/Activity;

    .line 1888
    .line 1889
    if-eqz v1, :cond_8e

    .line 1890
    .line 1891
    check-cast v0, Landroid/app/Activity;

    .line 1892
    .line 1893
    move-object v1, v0

    .line 1894
    goto :goto_53

    .line 1895
    :cond_8e
    const/4 v1, 0x0

    .line 1896
    :goto_53
    if-nez v1, :cond_8f

    .line 1897
    .line 1898
    goto/16 :goto_57

    .line 1899
    .line 1900
    :cond_8f
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1901
    .line 1902
    .line 1903
    move-result-object v0

    .line 1904
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1905
    .line 1906
    .line 1907
    move-result-object v0

    .line 1908
    const-string v7, "~79F5E25B4ED201D89B6CE77FECC600ECA88AB6F7485F4A97"

    .line 1909
    .line 1910
    invoke-static {v7}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1911
    .line 1912
    .line 1913
    move-result-object v7

    .line 1914
    invoke-static {v0, v7, v6}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1915
    .line 1916
    .line 1917
    move-result v7

    .line 1918
    if-nez v7, :cond_90

    .line 1919
    .line 1920
    const-string v7, "com.bytedance"

    .line 1921
    .line 1922
    invoke-static {v0, v7, v6}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1923
    .line 1924
    .line 1925
    move-result v0

    .line 1926
    if-eqz v0, :cond_93

    .line 1927
    .line 1928
    :cond_90
    sget-object v0, Li;->α:Ljava/lang/ref/WeakReference;

    .line 1929
    .line 1930
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 1931
    .line 1932
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 1933
    .line 1934
    .line 1935
    sput-object v0, Li;->α:Ljava/lang/ref/WeakReference;

    .line 1936
    .line 1937
    :try_start_14
    sget-object v0, Lpq;->α:Lpq;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_11

    .line 1938
    .line 1939
    :catchall_11
    sget-boolean v0, Li;->β:Z

    .line 1940
    .line 1941
    if-nez v0, :cond_91

    .line 1942
    .line 1943
    sput-boolean v5, Li;->β:Z

    .line 1944
    .line 1945
    :try_start_15
    sget-object v0, Lx9;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1946
    .line 1947
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 1948
    .line 1949
    .line 1950
    move-result-object v0

    .line 1951
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1952
    .line 1953
    .line 1954
    invoke-static {v0}, Lx9;->ο(Landroid/content/Context;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_12

    .line 1955
    .line 1956
    .line 1957
    move-object v5, v3

    .line 1958
    goto :goto_54

    .line 1959
    :catchall_12
    move-exception v0

    .line 1960
    new-instance v5, Leo1;

    .line 1961
    .line 1962
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1963
    .line 1964
    .line 1965
    :goto_54
    invoke-static {v5}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1966
    .line 1967
    .line 1968
    move-result-object v0

    .line 1969
    if-eqz v0, :cond_91

    .line 1970
    .line 1971
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1972
    .line 1973
    .line 1974
    move-result-object v0

    .line 1975
    const-string v5, "BetaVerifier \u521d\u59cb\u5316\u5931\u8d25: "

    .line 1976
    .line 1977
    invoke-static {v5, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1978
    .line 1979
    .line 1980
    move-result-object v0

    .line 1981
    const/4 v5, 0x0

    .line 1982
    invoke-static {v2, v0, v5, v4, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1983
    .line 1984
    .line 1985
    :cond_91
    sget-object v0, Li;->γ:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 1986
    .line 1987
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 1988
    .line 1989
    .line 1990
    move-result-object v5

    .line 1991
    :goto_55
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1992
    .line 1993
    .line 1994
    move-result v0

    .line 1995
    if-eqz v0, :cond_93

    .line 1996
    .line 1997
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1998
    .line 1999
    .line 2000
    move-result-object v0

    .line 2001
    move-object v6, v0

    .line 2002
    check-cast v6, Lib0;

    .line 2003
    .line 2004
    :try_start_16
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2005
    .line 2006
    .line 2007
    invoke-static {v1}, Ljb0;->α(Landroid/app/Activity;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_13

    .line 2008
    .line 2009
    .line 2010
    move-object v7, v3

    .line 2011
    goto :goto_56

    .line 2012
    :catchall_13
    move-exception v0

    .line 2013
    new-instance v7, Leo1;

    .line 2014
    .line 2015
    invoke-direct {v7, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 2016
    .line 2017
    .line 2018
    :goto_56
    invoke-static {v7}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2019
    .line 2020
    .line 2021
    move-result-object v0

    .line 2022
    if-eqz v0, :cond_92

    .line 2023
    .line 2024
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2025
    .line 2026
    .line 2027
    move-result-object v6

    .line 2028
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2029
    .line 2030
    .line 2031
    move-result-object v6

    .line 2032
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2033
    .line 2034
    .line 2035
    move-result-object v0

    .line 2036
    const-string v7, "\u5bbf\u4e3b\u6062\u590d\u76d1\u542c\u5668\u6267\u884c\u5931\u8d25: "

    .line 2037
    .line 2038
    const-string v8, ", "

    .line 2039
    .line 2040
    invoke-static {v7, v6, v8, v0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2041
    .line 2042
    .line 2043
    move-result-object v0

    .line 2044
    const/4 v6, 0x0

    .line 2045
    invoke-static {v2, v0, v6, v4, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 2046
    .line 2047
    .line 2048
    goto :goto_55

    .line 2049
    :cond_92
    const/4 v6, 0x0

    .line 2050
    goto :goto_55

    .line 2051
    :cond_93
    :goto_57
    return-void

    .line 2052
    nop

    .line 2053
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_d
        :pswitch_c
        :pswitch_0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lk01;)V
    .locals 10

    .line 1
    iget v0, p0, Lh;->α:I

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x0

    .line 9
    sparse-switch v0, :sswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-super {p0, p1}, Lm01;->beforeHookedMethod(Lk01;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :sswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 20
    .line 21
    aget-object p1, p0, v4

    .line 22
    .line 23
    instance-of v0, p1, Ljava/lang/String;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    move-object v5, p1

    .line 28
    check-cast v5, Ljava/lang/String;

    .line 29
    .line 30
    :cond_0
    if-nez v5, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    sget-object p1, Ltl;->α:Landroid/util/LruCache;

    .line 34
    .line 35
    invoke-static {v5}, Ltl;->δ(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p1, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    aput-object p1, p0, v4

    .line 46
    .line 47
    :cond_2
    :goto_0
    return-void

    .line 48
    :sswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 52
    .line 53
    aget-object p1, p0, v4

    .line 54
    .line 55
    instance-of v0, p1, Ljava/lang/String;

    .line 56
    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    move-object v5, p1

    .line 60
    check-cast v5, Ljava/lang/String;

    .line 61
    .line 62
    :cond_3
    if-nez v5, :cond_4

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_4
    sget-object p1, Ltl;->α:Landroid/util/LruCache;

    .line 66
    .line 67
    invoke-static {v5}, Ltl;->δ(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {p1, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_5

    .line 76
    .line 77
    aput-object p1, p0, v4

    .line 78
    .line 79
    :cond_5
    :goto_1
    return-void

    .line 80
    :sswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-static {v3, p0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    if-eqz v0, :cond_6

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    goto :goto_2

    .line 99
    :cond_6
    move-object v0, v5

    .line 100
    :goto_2
    if-nez v0, :cond_7

    .line 101
    .line 102
    const-string v0, ""

    .line 103
    .line 104
    :cond_7
    const-string v1, "TokenCert:bpea-comment_save_image_to_album"

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_8

    .line 111
    .line 112
    goto/16 :goto_8

    .line 113
    .line 114
    :cond_8
    invoke-static {v4, p0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    instance-of v1, v0, Ljava/lang/String;

    .line 119
    .line 120
    if-eqz v1, :cond_9

    .line 121
    .line 122
    check-cast v0, Ljava/lang/String;

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_9
    move-object v0, v5

    .line 126
    :goto_3
    if-nez v0, :cond_a

    .line 127
    .line 128
    goto/16 :goto_8

    .line 129
    .line 130
    :cond_a
    invoke-static {v2, p0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    instance-of v1, p0, Ljava/lang/String;

    .line 135
    .line 136
    if-eqz v1, :cond_b

    .line 137
    .line 138
    check-cast p0, Ljava/lang/String;

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_b
    move-object p0, v5

    .line 142
    :goto_4
    sget-object v1, Ltl;->α:Landroid/util/LruCache;

    .line 143
    .line 144
    :try_start_0
    const-string v1, "android.app.ActivityThread"

    .line 145
    .line 146
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    const-string v2, "currentApplication"

    .line 151
    .line 152
    invoke-virtual {v1, v2, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-virtual {v1, v5, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    instance-of v2, v1, Landroid/content/Context;

    .line 161
    .line 162
    if-eqz v2, :cond_c

    .line 163
    .line 164
    check-cast v1, Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    .line 166
    goto :goto_6

    .line 167
    :catchall_0
    move-exception v1

    .line 168
    goto :goto_5

    .line 169
    :cond_c
    move-object v1, v5

    .line 170
    goto :goto_6

    .line 171
    :goto_5
    new-instance v2, Leo1;

    .line 172
    .line 173
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 174
    .line 175
    .line 176
    move-object v1, v2

    .line 177
    :goto_6
    instance-of v2, v1, Leo1;

    .line 178
    .line 179
    if-eqz v2, :cond_d

    .line 180
    .line 181
    move-object v1, v5

    .line 182
    :cond_d
    check-cast v1, Landroid/content/Context;

    .line 183
    .line 184
    if-eqz v1, :cond_e

    .line 185
    .line 186
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    :cond_e
    if-nez v5, :cond_f

    .line 191
    .line 192
    goto :goto_8

    .line 193
    :cond_f
    :try_start_1
    sget-object v1, Lqy0;->α:Lqy0;

    .line 194
    .line 195
    new-instance v2, Ljava/io/File;

    .line 196
    .line 197
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1, v5, v2, p0}, Lqy0;->ц(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 204
    .line 205
    goto :goto_7

    .line 206
    :catchall_1
    move-exception p0

    .line 207
    new-instance v0, Leo1;

    .line 208
    .line 209
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 210
    .line 211
    .line 212
    move-object p0, v0

    .line 213
    :goto_7
    instance-of v0, p0, Leo1;

    .line 214
    .line 215
    const-string v1, "DYHelper_ImageWatermark"

    .line 216
    .line 217
    if-nez v0, :cond_10

    .line 218
    .line 219
    move-object v0, p0

    .line 220
    check-cast v0, Ljava/lang/Boolean;

    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-eqz v0, :cond_10

    .line 227
    .line 228
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 229
    .line 230
    invoke-virtual {p1, v0}, Lk01;->α(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    const-string p1, "\u8bc4\u8bba\u56fe\u7247\u5df2\u5199\u5165\u7528\u6237\u4e0b\u8f7d\u8def\u5f84/\u8bc4\u8bba\u533a\u56fe\u7247"

    .line 234
    .line 235
    invoke-static {v1, p1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    :cond_10
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    if-eqz p0, :cond_11

    .line 243
    .line 244
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    const-string v0, "\u63a5\u7ba1\u8bc4\u8bba\u56fe\u7247\u4fdd\u5b58\u5931\u8d25\uff0c\u964d\u7ea7\u5bbf\u4e3b\u539f\u8def\u5f84: "

    .line 249
    .line 250
    invoke-static {v0, p1, v1, p0}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 251
    .line 252
    .line 253
    :cond_11
    :goto_8
    return-void

    .line 254
    :sswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 258
    .line 259
    sget-object v0, Lfj;->π:Ljava/util/concurrent/atomic/AtomicReference;

    .line 260
    .line 261
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    if-nez v0, :cond_12

    .line 266
    .line 267
    goto :goto_c

    .line 268
    :cond_12
    if-eqz p0, :cond_13

    .line 269
    .line 270
    invoke-static {p0}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    goto :goto_9

    .line 275
    :cond_13
    move-object v0, v5

    .line 276
    :goto_9
    instance-of v1, v0, Ljava/nio/ByteBuffer;

    .line 277
    .line 278
    if-eqz v1, :cond_19

    .line 279
    .line 280
    if-eqz p0, :cond_14

    .line 281
    .line 282
    invoke-static {v2, p0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    goto :goto_a

    .line 287
    :cond_14
    move-object p0, v5

    .line 288
    :goto_a
    instance-of v1, p0, Ljava/lang/Integer;

    .line 289
    .line 290
    if-eqz v1, :cond_15

    .line 291
    .line 292
    move-object v5, p0

    .line 293
    check-cast v5, Ljava/lang/Integer;

    .line 294
    .line 295
    :cond_15
    if-eqz v5, :cond_19

    .line 296
    .line 297
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 298
    .line 299
    .line 300
    move-result p0

    .line 301
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 302
    .line 303
    if-gtz p0, :cond_16

    .line 304
    .line 305
    new-array p0, v4, [B

    .line 306
    .line 307
    goto :goto_b

    .line 308
    :cond_16
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    invoke-static {p0, v1}, Ljava/lang/Math;->min(II)I

    .line 317
    .line 318
    .line 319
    move-result p0

    .line 320
    if-gtz p0, :cond_17

    .line 321
    .line 322
    new-array p0, v4, [B

    .line 323
    .line 324
    goto :goto_b

    .line 325
    :cond_17
    new-array p0, p0, [B

    .line 326
    .line 327
    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 328
    .line 329
    .line 330
    :goto_b
    array-length v0, p0

    .line 331
    if-nez v0, :cond_18

    .line 332
    .line 333
    goto :goto_c

    .line 334
    :cond_18
    const-string v0, "dy_audio_bytes"

    .line 335
    .line 336
    iget-object p1, p1, Lk01;->δ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 337
    .line 338
    invoke-virtual {p1, v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    :cond_19
    :goto_c
    return-void

    .line 342
    :sswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 346
    .line 347
    instance-of v0, p0, Landroid/view/View;

    .line 348
    .line 349
    if-eqz v0, :cond_1a

    .line 350
    .line 351
    check-cast p0, Landroid/view/View;

    .line 352
    .line 353
    goto :goto_d

    .line 354
    :cond_1a
    move-object p0, v5

    .line 355
    :goto_d
    if-nez p0, :cond_1b

    .line 356
    .line 357
    goto :goto_e

    .line 358
    :cond_1b
    iget-object p1, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 359
    .line 360
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    invoke-static {v4, p1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object p1

    .line 367
    instance-of v0, p1, Landroid/view/MotionEvent;

    .line 368
    .line 369
    if-eqz v0, :cond_1c

    .line 370
    .line 371
    move-object v5, p1

    .line 372
    check-cast v5, Landroid/view/MotionEvent;

    .line 373
    .line 374
    :cond_1c
    if-nez v5, :cond_1d

    .line 375
    .line 376
    goto :goto_e

    .line 377
    :cond_1d
    invoke-virtual {v5}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 378
    .line 379
    .line 380
    move-result p1

    .line 381
    if-eqz p1, :cond_1e

    .line 382
    .line 383
    if-eq p1, v3, :cond_1e

    .line 384
    .line 385
    goto :goto_e

    .line 386
    :cond_1e
    sget-boolean p1, Loh;->η:Z

    .line 387
    .line 388
    if-eqz p1, :cond_1f

    .line 389
    .line 390
    sget-object p1, Loh;->α:Loh;

    .line 391
    .line 392
    invoke-static {}, Loh;->ε()Z

    .line 393
    .line 394
    .line 395
    move-result p1

    .line 396
    if-eqz p1, :cond_1f

    .line 397
    .line 398
    sget-object p1, Loh;->κ:Ljava/util/Set;

    .line 399
    .line 400
    invoke-interface {p1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    invoke-static {p0, v1}, Loh;->β(Landroid/view/View;F)V

    .line 404
    .line 405
    .line 406
    :cond_1f
    :goto_e
    return-void

    .line 407
    :sswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 411
    .line 412
    instance-of p1, p0, Landroid/view/View;

    .line 413
    .line 414
    if-eqz p1, :cond_20

    .line 415
    .line 416
    move-object v5, p0

    .line 417
    check-cast v5, Landroid/view/View;

    .line 418
    .line 419
    :cond_20
    if-nez v5, :cond_21

    .line 420
    .line 421
    goto :goto_f

    .line 422
    :cond_21
    sget-object p0, Loh;->α:Loh;

    .line 423
    .line 424
    invoke-static {v5}, Loh;->α(Landroid/view/View;)V

    .line 425
    .line 426
    .line 427
    :goto_f
    return-void

    .line 428
    :sswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 432
    .line 433
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    invoke-static {v4, p0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object p0

    .line 440
    if-nez p0, :cond_22

    .line 441
    .line 442
    goto/16 :goto_17

    .line 443
    .line 444
    :cond_22
    sget-object p1, Lkh;->α:Lkh;

    .line 445
    .line 446
    new-instance p1, Ljava/util/ArrayList;

    .line 447
    .line 448
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 449
    .line 450
    .line 451
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    :goto_10
    if-eqz v0, :cond_25

    .line 456
    .line 457
    const-class v1, Ljava/lang/Object;

    .line 458
    .line 459
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v1

    .line 463
    if-nez v1, :cond_25

    .line 464
    .line 465
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 470
    .line 471
    .line 472
    array-length v3, v1

    .line 473
    move v6, v4

    .line 474
    :goto_11
    if-ge v6, v3, :cond_24

    .line 475
    .line 476
    aget-object v7, v1, v6

    .line 477
    .line 478
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 479
    .line 480
    .line 481
    move-result-object v8

    .line 482
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 483
    .line 484
    invoke-static {v8, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    move-result v8

    .line 488
    if-eqz v8, :cond_23

    .line 489
    .line 490
    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    :cond_23
    add-int/lit8 v6, v6, 0x1

    .line 494
    .line 495
    goto :goto_11

    .line 496
    :cond_24
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    goto :goto_10

    .line 501
    :cond_25
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 502
    .line 503
    .line 504
    move-result v0

    .line 505
    if-eq v0, v2, :cond_26

    .line 506
    .line 507
    goto :goto_14

    .line 508
    :cond_26
    :try_start_2
    invoke-static {p1}, Lxh;->З(Ljava/util/List;)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object p1

    .line 512
    check-cast p1, Ljava/lang/reflect/Field;

    .line 513
    .line 514
    invoke-virtual {p1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    move-result p1

    .line 521
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 522
    .line 523
    .line 524
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 525
    goto :goto_12

    .line 526
    :catchall_2
    move-exception p1

    .line 527
    new-instance v0, Leo1;

    .line 528
    .line 529
    invoke-direct {v0, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 530
    .line 531
    .line 532
    move-object p1, v0

    .line 533
    :goto_12
    instance-of v0, p1, Leo1;

    .line 534
    .line 535
    if-eqz v0, :cond_27

    .line 536
    .line 537
    goto :goto_13

    .line 538
    :cond_27
    move-object v5, p1

    .line 539
    :goto_13
    check-cast v5, Ljava/lang/Boolean;

    .line 540
    .line 541
    :goto_14
    if-eqz v5, :cond_2a

    .line 542
    .line 543
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 544
    .line 545
    .line 546
    move-result p1

    .line 547
    sget-object v0, Lkh;->ζ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 548
    .line 549
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 550
    .line 551
    .line 552
    invoke-static {v0}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 557
    .line 558
    .line 559
    move-result-object v1

    .line 560
    invoke-virtual {v1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 561
    .line 562
    .line 563
    move-result-object v1

    .line 564
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 565
    .line 566
    .line 567
    array-length v2, v1

    .line 568
    move v3, v4

    .line 569
    :goto_15
    if-ge v3, v2, :cond_2a

    .line 570
    .line 571
    aget-object v5, v1, v3

    .line 572
    .line 573
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 574
    .line 575
    .line 576
    move-result-object v5

    .line 577
    invoke-interface {v0, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 578
    .line 579
    .line 580
    move-result v6

    .line 581
    if-nez v6, :cond_29

    .line 582
    .line 583
    const-string v6, "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22B532A4FB444E45EFE5413F312250C3EB77D079E4AFD3F67A87735342D1C21387EB"

    .line 584
    .line 585
    invoke-static {v6}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v6

    .line 589
    invoke-static {v5, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    move-result v6

    .line 593
    if-nez v6, :cond_29

    .line 594
    .line 595
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 596
    .line 597
    .line 598
    const-string v6, "FeedPlayerWrapper"

    .line 599
    .line 600
    invoke-static {v5, v6, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 601
    .line 602
    .line 603
    move-result v6

    .line 604
    if-nez v6, :cond_29

    .line 605
    .line 606
    const-string v6, ".feed.controller."

    .line 607
    .line 608
    invoke-static {v5, v6, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 609
    .line 610
    .line 611
    move-result v5

    .line 612
    if-eqz v5, :cond_28

    .line 613
    .line 614
    goto :goto_16

    .line 615
    :cond_28
    add-int/lit8 v3, v3, 0x1

    .line 616
    .line 617
    goto :goto_15

    .line 618
    :cond_29
    :goto_16
    sget-object v0, Lug;->α:Ltg;

    .line 619
    .line 620
    xor-int/lit8 v0, p1, 0x1

    .line 621
    .line 622
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 623
    .line 624
    .line 625
    move-result-object p0

    .line 626
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object p0

    .line 630
    new-instance v1, Ljava/lang/StringBuilder;

    .line 631
    .line 632
    const-string v2, "EventBusWrapper.post("

    .line 633
    .line 634
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 635
    .line 636
    .line 637
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 638
    .line 639
    .line 640
    const-string p0, ", playing="

    .line 641
    .line 642
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 643
    .line 644
    .line 645
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 646
    .line 647
    .line 648
    const-string p0, ")"

    .line 649
    .line 650
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 651
    .line 652
    .line 653
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object p0

    .line 657
    sget-object p1, Lug;->κ:Landroid/os/Handler;

    .line 658
    .line 659
    new-instance v1, Ljg;

    .line 660
    .line 661
    invoke-direct {v1, p0, v0}, Ljg;-><init>(Ljava/lang/String;Z)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 665
    .line 666
    .line 667
    :cond_2a
    :goto_17
    return-void

    .line 668
    :sswitch_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 669
    .line 670
    .line 671
    sget p0, Lug;->χ:I

    .line 672
    .line 673
    if-gtz p0, :cond_32

    .line 674
    .line 675
    invoke-static {}, Ltg;->Μ()Z

    .line 676
    .line 677
    .line 678
    move-result p0

    .line 679
    if-nez p0, :cond_2b

    .line 680
    .line 681
    goto/16 :goto_1a

    .line 682
    .line 683
    :cond_2b
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 684
    .line 685
    instance-of v0, p0, Landroid/view/View;

    .line 686
    .line 687
    if-eqz v0, :cond_2c

    .line 688
    .line 689
    check-cast p0, Landroid/view/View;

    .line 690
    .line 691
    goto :goto_18

    .line 692
    :cond_2c
    move-object p0, v5

    .line 693
    :goto_18
    if-nez p0, :cond_2d

    .line 694
    .line 695
    goto/16 :goto_1a

    .line 696
    .line 697
    :cond_2d
    invoke-static {p0}, Ltg;->а(Landroid/view/View;)Ljava/lang/Integer;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    if-eqz v0, :cond_32

    .line 702
    .line 703
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 704
    .line 705
    .line 706
    move-result v0

    .line 707
    iget-object v1, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 708
    .line 709
    aget-object v1, v1, v4

    .line 710
    .line 711
    instance-of v2, v1, Ljava/lang/Integer;

    .line 712
    .line 713
    if-eqz v2, :cond_2e

    .line 714
    .line 715
    check-cast v1, Ljava/lang/Integer;

    .line 716
    .line 717
    goto :goto_19

    .line 718
    :cond_2e
    move-object v1, v5

    .line 719
    :goto_19
    if-eqz v1, :cond_32

    .line 720
    .line 721
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 722
    .line 723
    .line 724
    move-result v1

    .line 725
    invoke-static {p0, v0}, Ltg;->κ(Landroid/view/View;I)Ljava/lang/Float;

    .line 726
    .line 727
    .line 728
    move-result-object v2

    .line 729
    if-eqz v2, :cond_32

    .line 730
    .line 731
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 732
    .line 733
    .line 734
    move-result v2

    .line 735
    invoke-static {p0, v0}, Ltg;->т(Landroid/view/View;I)Z

    .line 736
    .line 737
    .line 738
    move-result v3

    .line 739
    if-eqz v3, :cond_2f

    .line 740
    .line 741
    goto :goto_1a

    .line 742
    :cond_2f
    const/4 v3, 0x0

    .line 743
    cmpg-float v6, v2, v3

    .line 744
    .line 745
    const v7, 0x7f0dead9

    .line 746
    .line 747
    .line 748
    const v8, 0x7f0deadd

    .line 749
    .line 750
    .line 751
    if-gtz v6, :cond_30

    .line 752
    .line 753
    invoke-static {v0}, Ltg;->с(I)Z

    .line 754
    .line 755
    .line 756
    move-result v0

    .line 757
    if-eqz v0, :cond_30

    .line 758
    .line 759
    if-nez v1, :cond_30

    .line 760
    .line 761
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 762
    .line 763
    .line 764
    move-result-object v0

    .line 765
    invoke-virtual {p0, v8, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 766
    .line 767
    .line 768
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 769
    .line 770
    invoke-virtual {p0, v7, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 771
    .line 772
    .line 773
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 774
    .line 775
    const/16 p1, 0x8

    .line 776
    .line 777
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 778
    .line 779
    .line 780
    move-result-object p1

    .line 781
    aput-object p1, p0, v4

    .line 782
    .line 783
    goto :goto_1a

    .line 784
    :cond_30
    cmpl-float p1, v2, v3

    .line 785
    .line 786
    if-lez p1, :cond_31

    .line 787
    .line 788
    if-nez v1, :cond_31

    .line 789
    .line 790
    invoke-virtual {p0, v7, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 791
    .line 792
    .line 793
    invoke-virtual {p0, v8, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 794
    .line 795
    .line 796
    goto :goto_1a

    .line 797
    :cond_31
    if-eqz v1, :cond_32

    .line 798
    .line 799
    invoke-virtual {p0, v7, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 800
    .line 801
    .line 802
    invoke-virtual {p0, v8, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 803
    .line 804
    .line 805
    :cond_32
    :goto_1a
    return-void

    .line 806
    :sswitch_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 807
    .line 808
    .line 809
    sget p0, Lug;->χ:I

    .line 810
    .line 811
    if-lez p0, :cond_33

    .line 812
    .line 813
    goto :goto_1d

    .line 814
    :cond_33
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 815
    .line 816
    instance-of v0, p0, Landroid/view/View;

    .line 817
    .line 818
    if-eqz v0, :cond_34

    .line 819
    .line 820
    check-cast p0, Landroid/view/View;

    .line 821
    .line 822
    goto :goto_1b

    .line 823
    :cond_34
    move-object p0, v5

    .line 824
    :goto_1b
    if-nez p0, :cond_35

    .line 825
    .line 826
    goto :goto_1d

    .line 827
    :cond_35
    invoke-static {p0}, Ltg;->а(Landroid/view/View;)Ljava/lang/Integer;

    .line 828
    .line 829
    .line 830
    move-result-object v0

    .line 831
    if-eqz v0, :cond_3a

    .line 832
    .line 833
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 834
    .line 835
    .line 836
    move-result v0

    .line 837
    iget-object v2, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 838
    .line 839
    aget-object v2, v2, v4

    .line 840
    .line 841
    instance-of v6, v2, Ljava/lang/Float;

    .line 842
    .line 843
    if-eqz v6, :cond_36

    .line 844
    .line 845
    move-object v5, v2

    .line 846
    check-cast v5, Ljava/lang/Float;

    .line 847
    .line 848
    :cond_36
    if-eqz v5, :cond_3a

    .line 849
    .line 850
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 851
    .line 852
    .line 853
    move-result v2

    .line 854
    invoke-static {}, Ltg;->Μ()Z

    .line 855
    .line 856
    .line 857
    move-result v6

    .line 858
    if-nez v6, :cond_37

    .line 859
    .line 860
    goto :goto_1d

    .line 861
    :cond_37
    invoke-static {p0, v0}, Ltg;->κ(Landroid/view/View;I)Ljava/lang/Float;

    .line 862
    .line 863
    .line 864
    move-result-object v6

    .line 865
    if-eqz v6, :cond_3a

    .line 866
    .line 867
    invoke-static {p0, v0}, Ltg;->т(Landroid/view/View;I)Z

    .line 868
    .line 869
    .line 870
    move-result v7

    .line 871
    if-eqz v7, :cond_38

    .line 872
    .line 873
    goto :goto_1d

    .line 874
    :cond_38
    const v7, 0x7f0deadb

    .line 875
    .line 876
    .line 877
    invoke-virtual {p0, v7, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 878
    .line 879
    .line 880
    if-ne v0, v3, :cond_39

    .line 881
    .line 882
    goto :goto_1c

    .line 883
    :cond_39
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    .line 884
    .line 885
    .line 886
    move-result v1

    .line 887
    :goto_1c
    sub-float/2addr v2, v1

    .line 888
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 889
    .line 890
    .line 891
    move-result p0

    .line 892
    const v0, 0x3c23d70a    # 0.01f

    .line 893
    .line 894
    .line 895
    cmpl-float p0, p0, v0

    .line 896
    .line 897
    if-lez p0, :cond_3a

    .line 898
    .line 899
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 900
    .line 901
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 902
    .line 903
    .line 904
    move-result-object p1

    .line 905
    aput-object p1, p0, v4

    .line 906
    .line 907
    :cond_3a
    :goto_1d
    return-void

    .line 908
    nop

    .line 909
    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_8
        0xa -> :sswitch_7
        0xb -> :sswitch_6
        0xe -> :sswitch_5
        0x10 -> :sswitch_4
        0x13 -> :sswitch_3
        0x1a -> :sswitch_2
        0x1b -> :sswitch_1
        0x1c -> :sswitch_0
    .end sparse-switch
.end method
