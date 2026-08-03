.class public final synthetic Lwb/al;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Ldb/g;

.field public final synthetic l:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Li0/a1;Li0/a1;Ldb/g;Li0/a1;I)V
    .locals 0

    .line 1
    iput p6, p0, Lwb/al;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/al;->h:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/al;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/al;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/al;->k:Ldb/g;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/al;->l:Li0/a1;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lwb/al;->g:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v2, v1, Lwb/al;->h:Landroid/content/Context;

    .line 9
    .line 10
    iget-object v3, v1, Lwb/al;->i:Li0/a1;

    .line 11
    .line 12
    iget-object v4, v1, Lwb/al;->j:Li0/a1;

    .line 13
    .line 14
    iget-object v5, v1, Lwb/al;->k:Ldb/g;

    .line 15
    .line 16
    iget-object v6, v1, Lwb/al;->l:Li0/a1;

    .line 17
    .line 18
    const/4 v7, 0x1

    .line 19
    invoke-static/range {v2 .. v7}, Lwb/ho;->n3(Landroid/content/Context;Li0/a1;Li0/a1;Ldb/g;Li0/a1;Z)Z

    .line 20
    .line 21
    .line 22
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_0
    const-string v0, "scheduled_task:"

    .line 26
    .line 27
    iget-object v2, v1, Lwb/al;->h:Landroid/content/Context;

    .line 28
    .line 29
    iget-object v3, v1, Lwb/al;->i:Li0/a1;

    .line 30
    .line 31
    iget-object v4, v1, Lwb/al;->j:Li0/a1;

    .line 32
    .line 33
    iget-object v5, v1, Lwb/al;->k:Ldb/g;

    .line 34
    .line 35
    iget-object v6, v1, Lwb/al;->l:Li0/a1;

    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    invoke-static/range {v2 .. v7}, Lwb/ho;->n3(Landroid/content/Context;Li0/a1;Li0/a1;Ldb/g;Li0/a1;Z)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_6

    .line 43
    .line 44
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Ldb/c;

    .line 49
    .line 50
    iget-object v3, v3, Ldb/c;->a:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    sget-object v4, Lbe/h;->a:Lcb/f;

    .line 56
    .line 57
    const/4 v5, 0x0

    .line 58
    if-eqz v4, :cond_5

    .line 59
    .line 60
    const-string v6, "Hchat-ScheduledTask-Now-"

    .line 61
    .line 62
    monitor-enter v4

    .line 63
    :try_start_0
    iget-object v7, v4, Lcb/f;->e:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v7, Ldb/g;

    .line 66
    .line 67
    invoke-virtual {v7}, Ldb/g;->c()Z

    .line 68
    .line 69
    .line 70
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    if-nez v7, :cond_0

    .line 72
    .line 73
    monitor-exit v4

    .line 74
    goto/16 :goto_3

    .line 75
    .line 76
    :cond_0
    :try_start_1
    iget-object v7, v4, Lcb/f;->e:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v7, Ldb/g;

    .line 79
    .line 80
    invoke-virtual {v7, v3}, Ldb/g;->b(Ljava/lang/String;)Ldb/c;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    if-eqz v7, :cond_4

    .line 85
    .line 86
    iget-object v8, v7, Ldb/c;->m:Ljava/lang/String;

    .line 87
    .line 88
    const-string v9, "running"

    .line 89
    .line 90
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    if-eqz v8, :cond_1

    .line 95
    .line 96
    monitor-exit v4

    .line 97
    goto/16 :goto_3

    .line 98
    .line 99
    :cond_1
    :try_start_2
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    iget-object v8, v4, Lcb/f;->f:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v8, Ljava/util/concurrent/ConcurrentHashMap;

    .line 106
    .line 107
    invoke-virtual {v8, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    invoke-static {}, Lcb/f;->u()Lo8/j;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    if-eqz v8, :cond_2

    .line 115
    .line 116
    invoke-virtual {v8, v0}, Lo8/j;->a(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    :cond_2
    invoke-static {v7}, La2/a;->r(Ldb/c;)Ldb/c;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    const-string v20, "running"

    .line 124
    .line 125
    const/16 v30, 0x0

    .line 126
    .line 127
    const v31, 0x3fefff

    .line 128
    .line 129
    .line 130
    const/4 v8, 0x0

    .line 131
    const/4 v9, 0x0

    .line 132
    const/4 v10, 0x0

    .line 133
    const/4 v11, 0x0

    .line 134
    const/4 v12, 0x0

    .line 135
    const-wide/16 v13, 0x0

    .line 136
    .line 137
    const/4 v15, 0x0

    .line 138
    const/16 v16, 0x0

    .line 139
    .line 140
    const/16 v17, 0x0

    .line 141
    .line 142
    const/16 v18, 0x0

    .line 143
    .line 144
    const/16 v19, 0x0

    .line 145
    .line 146
    const-wide/16 v21, 0x0

    .line 147
    .line 148
    const/16 v23, 0x0

    .line 149
    .line 150
    const/16 v24, 0x0

    .line 151
    .line 152
    const/16 v25, 0x0

    .line 153
    .line 154
    const/16 v26, 0x0

    .line 155
    .line 156
    const/16 v27, 0x0

    .line 157
    .line 158
    const/16 v28, 0x0

    .line 159
    .line 160
    const/16 v29, 0x0

    .line 161
    .line 162
    invoke-static/range {v7 .. v31}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    iget-object v7, v4, Lcb/f;->e:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v7, Ldb/g;

    .line 169
    .line 170
    invoke-virtual {v7, v0}, Ldb/g;->d(Ldb/c;)V

    .line 171
    .line 172
    .line 173
    new-instance v7, Ldb/d;

    .line 174
    .line 175
    const/4 v8, 0x0

    .line 176
    invoke-direct {v7, v4, v0, v8}, Ldb/d;-><init>(Lcb/f;Ldb/c;I)V

    .line 177
    .line 178
    .line 179
    invoke-static {}, Lcb/f;->u()Lo8/j;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    if-eqz v0, :cond_3

    .line 184
    .line 185
    invoke-virtual {v0, v7}, Lo8/j;->d(Ljava/lang/Runnable;)V

    .line 186
    .line 187
    .line 188
    goto :goto_1

    .line 189
    :catchall_0
    move-exception v0

    .line 190
    goto :goto_2

    .line 191
    :cond_3
    new-instance v0, Ljava/lang/Thread;

    .line 192
    .line 193
    invoke-virtual {v6, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    invoke-direct {v0, v7, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    const/4 v3, 0x1

    .line 201
    invoke-virtual {v0, v3}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 205
    .line 206
    .line 207
    :goto_1
    monitor-exit v4

    .line 208
    const-string v0, "\u4efb\u52a1\u5df2\u52a0\u5165\u7acb\u5373\u6267\u884c\u961f\u5217"

    .line 209
    .line 210
    invoke-static {v2, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 215
    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_4
    monitor-exit v4

    .line 219
    goto :goto_3

    .line 220
    :goto_2
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 221
    throw v0

    .line 222
    :cond_5
    :goto_3
    const-string v0, "\u7acb\u5373\u6267\u884c\u5931\u8d25"

    .line 223
    .line 224
    invoke-static {v2, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 229
    .line 230
    .line 231
    :cond_6
    :goto_4
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 232
    .line 233
    return-object v0

    .line 234
    :pswitch_1
    iget-object v0, v1, Lwb/al;->h:Landroid/content/Context;

    .line 235
    .line 236
    iget-object v2, v1, Lwb/al;->i:Li0/a1;

    .line 237
    .line 238
    iget-object v3, v1, Lwb/al;->j:Li0/a1;

    .line 239
    .line 240
    iget-object v4, v1, Lwb/al;->k:Ldb/g;

    .line 241
    .line 242
    iget-object v5, v1, Lwb/al;->l:Li0/a1;

    .line 243
    .line 244
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v6

    .line 248
    check-cast v6, Ljava/util/List;

    .line 249
    .line 250
    new-instance v7, Ljava/util/ArrayList;

    .line 251
    .line 252
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 253
    .line 254
    .line 255
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 256
    .line 257
    .line 258
    move-result-object v6

    .line 259
    :cond_7
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 260
    .line 261
    .line 262
    move-result v8

    .line 263
    if-eqz v8, :cond_8

    .line 264
    .line 265
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v8

    .line 269
    move-object v9, v8

    .line 270
    check-cast v9, Ldb/c;

    .line 271
    .line 272
    iget-object v9, v9, Ldb/c;->a:Ljava/lang/String;

    .line 273
    .line 274
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v10

    .line 278
    check-cast v10, Ldb/c;

    .line 279
    .line 280
    iget-object v10, v10, Ldb/c;->a:Ljava/lang/String;

    .line 281
    .line 282
    invoke-static {v9, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v9

    .line 286
    if-nez v9, :cond_7

    .line 287
    .line 288
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    goto :goto_5

    .line 292
    :cond_8
    invoke-virtual {v4, v7}, Ldb/g;->e(Ljava/util/ArrayList;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v4}, Ldb/g;->f()Ljava/util/List;

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    invoke-interface {v2, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    sget-object v2, Lbe/h;->a:Lcb/f;

    .line 303
    .line 304
    if-eqz v2, :cond_9

    .line 305
    .line 306
    invoke-virtual {v2}, Lcb/f;->r()V

    .line 307
    .line 308
    .line 309
    :cond_9
    sget-object v2, Lwb/xq;->c:Lwb/xq;

    .line 310
    .line 311
    invoke-interface {v5, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    const-string v2, "\u4efb\u52a1\u5df2\u5220\u9664"

    .line 315
    .line 316
    const/4 v3, 0x0

    .line 317
    invoke-static {v0, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 322
    .line 323
    .line 324
    goto/16 :goto_0

    .line 325
    .line 326
    nop

    .line 327
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
