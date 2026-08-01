.class public final Lqb;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Landroid/view/View;

.field public b:I


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqb;->a:Landroid/view/View;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    sget-object v0, Lrb;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lrb;->c:Ljava/util/WeakHashMap;

    .line 5
    .line 6
    iget-object v2, p0, Lqb;->a:Landroid/view/View;

    .line 7
    .line 8
    invoke-virtual {v1, v2}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-ne v2, p0, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, Lqb;->a:Landroid/view/View;

    .line 15
    .line 16
    invoke-virtual {v1, p0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p0
.end method

.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v2, Lrb;->a:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v2

    .line 6
    :try_start_0
    sget-object v0, Lrb;->c:Ljava/util/WeakHashMap;

    .line 7
    .line 8
    iget-object v3, v1, Lqb;->a:Landroid/view/View;

    .line 9
    .line 10
    invoke-virtual {v0, v3}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    monitor-exit v2

    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    goto/16 :goto_9

    .line 20
    .line 21
    :cond_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    const-string v0, "block_qq_show"

    .line 23
    .line 24
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1}, Lqb;->a()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    iget-object v2, v1, Lqb;->a:Landroid/view/View;

    .line 35
    .line 36
    const-string v0, "block_avatar_pendant"

    .line 37
    .line 38
    const-string v3, "block_qq_show"

    .line 39
    .line 40
    if-eqz v2, :cond_7

    .line 41
    .line 42
    const/4 v9, 0x0

    .line 43
    move-object v4, v2

    .line 44
    move v5, v9

    .line 45
    :goto_0
    if-eqz v4, :cond_4

    .line 46
    .line 47
    const/16 v6, 0xc

    .line 48
    .line 49
    if-ge v5, v6, :cond_4

    .line 50
    .line 51
    const/4 v6, 0x0

    .line 52
    :try_start_1
    invoke-virtual {v4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 56
    goto :goto_1

    .line 57
    :catchall_1
    move-object v7, v6

    .line 58
    :goto_1
    const-string v8, "ELARIS_FULL_PAGE"

    .line 59
    .line 60
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    if-nez v8, :cond_7

    .line 65
    .line 66
    const-string v8, "ELARIS_SETTINGS_VIEW"

    .line 67
    .line 68
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    if-eqz v7, :cond_2

    .line 73
    .line 74
    goto/16 :goto_6

    .line 75
    .line 76
    :cond_2
    :try_start_2
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 77
    .line 78
    .line 79
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 80
    goto :goto_2

    .line 81
    :catchall_2
    move-object v4, v6

    .line 82
    :goto_2
    instance-of v7, v4, Landroid/view/View;

    .line 83
    .line 84
    if-eqz v7, :cond_3

    .line 85
    .line 86
    check-cast v4, Landroid/view/View;

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_3
    move-object v4, v6

    .line 90
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_4
    :try_start_3
    invoke-static {v3}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-eqz v4, :cond_5

    .line 98
    .line 99
    filled-new-array {v9}, [I

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-static {v2, v9, v4}, Lrb;->b(Landroid/view/View;I[I)V

    .line 104
    .line 105
    .line 106
    goto :goto_4

    .line 107
    :catchall_3
    move-exception v0

    .line 108
    goto :goto_5

    .line 109
    :cond_5
    :goto_4
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 110
    .line 111
    .line 112
    move-result v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 113
    if-eqz v4, :cond_6

    .line 114
    .line 115
    :try_start_4
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_6

    .line 120
    .line 121
    filled-new-array {v9}, [I

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-static {v2, v9, v0}, Lu9;->l(Landroid/view/View;I[I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 126
    .line 127
    .line 128
    :catchall_4
    :cond_6
    :try_start_5
    invoke-static {v3}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_7

    .line 133
    .line 134
    filled-new-array {v9}, [I

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-static {v2, v9, v0}, Lv4;->n(Landroid/view/View;I[I)Landroid/view/View;

    .line 139
    .line 140
    .line 141
    move-result-object v10
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 142
    if-eqz v10, :cond_7

    .line 143
    .line 144
    const/4 v0, 0x1

    .line 145
    const/4 v11, 0x2

    .line 146
    :try_start_6
    new-array v3, v11, [I

    .line 147
    .line 148
    invoke-virtual {v10, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 149
    .line 150
    .line 151
    move-object v4, v3

    .line 152
    aget v3, v4, v9

    .line 153
    .line 154
    aget v4, v4, v0

    .line 155
    .line 156
    invoke-virtual {v10}, Landroid/view/View;->getWidth()I

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    invoke-virtual {v10}, Landroid/view/View;->getHeight()I

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    .line 169
    .line 170
    .line 171
    move-result v6

    .line 172
    filled-new-array {v9}, [I

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    const/4 v7, 0x0

    .line 177
    invoke-static/range {v2 .. v8}, Lu9;->m(Landroid/view/View;IIIII[I)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 178
    .line 179
    .line 180
    :catchall_5
    :try_start_7
    instance-of v2, v10, Landroid/view/ViewGroup;

    .line 181
    .line 182
    if-eqz v2, :cond_7

    .line 183
    .line 184
    new-array v2, v11, [I

    .line 185
    .line 186
    invoke-virtual {v10, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 187
    .line 188
    .line 189
    aget v11, v2, v9

    .line 190
    .line 191
    aget v12, v2, v0

    .line 192
    .line 193
    invoke-virtual {v10}, Landroid/view/View;->getWidth()I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 198
    .line 199
    .line 200
    move-result v13

    .line 201
    invoke-virtual {v10}, Landroid/view/View;->getHeight()I

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 206
    .line 207
    .line 208
    move-result v14

    .line 209
    filled-new-array {v9}, [I

    .line 210
    .line 211
    .line 212
    move-result-object v16

    .line 213
    const/4 v15, 0x0

    .line 214
    invoke-static/range {v10 .. v16}, Lu9;->m(Landroid/view/View;IIIII[I)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 215
    .line 216
    .line 217
    goto :goto_6

    .line 218
    :goto_5
    const-string v2, "cleanupQQShowAround failed: "

    .line 219
    .line 220
    invoke-static {v2, v0}, La;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 221
    .line 222
    .line 223
    :catchall_6
    :cond_7
    :goto_6
    sget-object v3, Lrb;->a:Ljava/lang/Object;

    .line 224
    .line 225
    monitor-enter v3

    .line 226
    :try_start_8
    sget-object v0, Lrb;->c:Ljava/util/WeakHashMap;

    .line 227
    .line 228
    iget-object v2, v1, Lqb;->a:Landroid/view/View;

    .line 229
    .line 230
    invoke-virtual {v0, v2}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    if-eq v2, v1, :cond_8

    .line 235
    .line 236
    monitor-exit v3

    .line 237
    goto :goto_7

    .line 238
    :catchall_7
    move-exception v0

    .line 239
    goto :goto_8

    .line 240
    :cond_8
    iget v2, v1, Lqb;->b:I

    .line 241
    .line 242
    add-int/lit8 v4, v2, 0x1

    .line 243
    .line 244
    iput v4, v1, Lqb;->b:I

    .line 245
    .line 246
    sget-object v5, Lrb;->b:[J

    .line 247
    .line 248
    const/4 v6, 0x3

    .line 249
    if-lt v4, v6, :cond_9

    .line 250
    .line 251
    iget-object v1, v1, Lqb;->a:Landroid/view/View;

    .line 252
    .line 253
    invoke-virtual {v0, v1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    monitor-exit v3

    .line 257
    goto :goto_7

    .line 258
    :cond_9
    monitor-exit v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 259
    aget-wide v3, v5, v4

    .line 260
    .line 261
    aget-wide v5, v5, v2

    .line 262
    .line 263
    sub-long/2addr v3, v5

    .line 264
    :try_start_9
    iget-object v0, v1, Lqb;->a:Landroid/view/View;

    .line 265
    .line 266
    invoke-virtual {v0, v1, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    if-nez v0, :cond_a

    .line 271
    .line 272
    invoke-virtual {v1}, Lqb;->a()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 273
    .line 274
    .line 275
    goto :goto_7

    .line 276
    :catchall_8
    move-exception v0

    .line 277
    invoke-virtual {v1}, Lqb;->a()V

    .line 278
    .line 279
    .line 280
    const-string v1, "qqshow-sidebar"

    .line 281
    .line 282
    const-string v2, "cleanup-stage"

    .line 283
    .line 284
    invoke-static {v1, v2, v0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 285
    .line 286
    .line 287
    :cond_a
    :goto_7
    return-void

    .line 288
    :goto_8
    :try_start_a
    monitor-exit v3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 289
    throw v0

    .line 290
    :goto_9
    :try_start_b
    monitor-exit v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 291
    throw v0
.end method
