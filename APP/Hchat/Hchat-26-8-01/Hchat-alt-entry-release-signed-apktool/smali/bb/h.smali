.class public final synthetic Lbb/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:J


# direct methods
.method public synthetic constructor <init>(Lbb/k;Ljava/lang/String;Ljava/lang/String;JI)V
    .locals 0

    .line 16
    iput p6, p0, Lbb/h;->g:I

    iput-object p1, p0, Lbb/h;->h:Ljava/lang/Object;

    iput-object p2, p0, Lbb/h;->i:Ljava/lang/String;

    iput-object p3, p0, Lbb/h;->j:Ljava/lang/Object;

    iput-wide p4, p0, Lbb/h;->k:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lr9/d0;Ljava/lang/Object;Ljava/lang/String;J)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lbb/h;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lbb/h;->h:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lbb/h;->j:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lbb/h;->i:Ljava/lang/String;

    .line 12
    .line 13
    iput-wide p4, p0, Lbb/h;->k:J

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    iget v0, p0, Lbb/h;->g:I

    .line 2
    .line 3
    iget-wide v1, p0, Lbb/h;->k:J

    .line 4
    .line 5
    iget-object v3, p0, Lbb/h;->i:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v4, p0, Lbb/h;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v5, p0, Lbb/h;->h:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v5, Lr9/d0;

    .line 15
    .line 16
    invoke-virtual {v5, v4, v3}, Lr9/d0;->E0(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    invoke-virtual {v5, v4, v1, v2}, Lr9/d0;->y(Ljava/lang/Object;J)Landroid/widget/TextView;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void

    .line 29
    :pswitch_0
    check-cast v5, Lbb/k;

    .line 30
    .line 31
    check-cast v4, Ljava/lang/String;

    .line 32
    .line 33
    iget-object v0, v5, Lbb/k;->h:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 34
    .line 35
    const-wide/16 v6, 0x2ee0

    .line 36
    .line 37
    :try_start_0
    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    :catchall_0
    invoke-static {v3, v4}, Lbb/k;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-virtual {v5, v1, v2, v6}, Lbb/k;->f(JLjava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    if-eqz v7, :cond_2

    .line 49
    .line 50
    invoke-virtual {v0, v4}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    if-nez v7, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-virtual {v5, v1, v2, v6}, Lbb/k;->b(JLjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v4}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5}, Lbb/k;->l()V

    .line 64
    .line 65
    .line 66
    invoke-static {v3, v4}, Lbb/k;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget-object v1, v5, Lbb/k;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 71
    .line 72
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    iget-object v1, v5, Lbb/k;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 76
    .line 77
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 78
    .line 79
    .line 80
    move-result-wide v2

    .line 81
    const-wide/16 v6, 0x1770

    .line 82
    .line 83
    add-long/2addr v2, v6

    .line 84
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v5}, Lbb/k;->j()V

    .line 92
    .line 93
    .line 94
    :cond_2
    :goto_0
    return-void

    .line 95
    :pswitch_1
    move-object v7, v5

    .line 96
    check-cast v7, Lbb/k;

    .line 97
    .line 98
    move-object v8, v4

    .line 99
    check-cast v8, Ljava/lang/String;

    .line 100
    .line 101
    iget-object v1, v7, Lbb/k;->b:Lb9/f;

    .line 102
    .line 103
    new-instance v6, Lbb/j;

    .line 104
    .line 105
    iget-object v9, p0, Lbb/h;->i:Ljava/lang/String;

    .line 106
    .line 107
    iget-wide v10, p0, Lbb/h;->k:J

    .line 108
    .line 109
    invoke-direct/range {v6 .. v11}, Lbb/j;-><init>(Lbb/k;Ljava/lang/String;Ljava/lang/String;J)V

    .line 110
    .line 111
    .line 112
    iget-object v0, v1, Lb9/f;->b:Ljava/util/Map;

    .line 113
    .line 114
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    sget-object v2, Lbb/l;->c:Log/k;

    .line 121
    .line 122
    invoke-static {v9}, Lfb/v0;->A(Ljava/lang/String;)Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    const/4 v3, 0x1

    .line 127
    const/4 v4, 0x0

    .line 128
    if-nez v2, :cond_4

    .line 129
    .line 130
    :cond_3
    :goto_1
    move v0, v4

    .line 131
    goto :goto_7

    .line 132
    :cond_4
    invoke-virtual {v1}, Lb9/f;->c()Z

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-nez v2, :cond_5

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_5
    iget-object v2, v1, Lb9/f;->g:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v2, Ljava/lang/reflect/Constructor;

    .line 142
    .line 143
    if-eqz v2, :cond_3

    .line 144
    .line 145
    :try_start_1
    filled-new-array {v9, v8}, [Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    invoke-static {v2, v5}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    if-eqz v2, :cond_7

    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    move-object v5, v0

    .line 159
    check-cast v5, Ljava/util/Map;

    .line 160
    .line 161
    invoke-interface {v5, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->network()Lm8/a;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    if-eqz v5, :cond_6

    .line 169
    .line 170
    iget-object v5, v5, Lm8/a;->a:Lm8/c;

    .line 171
    .line 172
    invoke-virtual {v5, v2}, Lm8/c;->j(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    if-ne v5, v3, :cond_6

    .line 177
    .line 178
    move v5, v3

    .line 179
    goto :goto_2

    .line 180
    :cond_6
    move v5, v4

    .line 181
    :goto_2
    if-nez v5, :cond_8

    .line 182
    .line 183
    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    goto :goto_3

    .line 187
    :catchall_1
    move-exception v0

    .line 188
    goto :goto_4

    .line 189
    :cond_7
    move v5, v4

    .line 190
    :cond_8
    :goto_3
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 191
    .line 192
    .line 193
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 194
    goto :goto_5

    .line 195
    :goto_4
    new-instance v2, Lsf/f;

    .line 196
    .line 197
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 198
    .line 199
    .line 200
    move-object v0, v2

    .line 201
    :goto_5
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    if-nez v2, :cond_9

    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_9
    iget-object v0, v1, Lb9/f;->e:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v0, Lab/b;

    .line 211
    .line 212
    const-string v1, "\u5b9e\u540d\u67e5\u8be2\u8bf7\u6c42\u5931\u8d25"

    .line 213
    .line 214
    invoke-virtual {v0, v1, v2}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 218
    .line 219
    :goto_6
    check-cast v0, Ljava/lang/Boolean;

    .line 220
    .line 221
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    :goto_7
    if-nez v0, :cond_e

    .line 226
    .line 227
    invoke-static {v8, v9}, Lbb/k;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {v7, v10, v11, v0}, Lbb/k;->f(JLjava/lang/String;)Z

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    if-nez v1, :cond_a

    .line 236
    .line 237
    goto :goto_9

    .line 238
    :cond_a
    invoke-virtual {v7, v10, v11, v0}, Lbb/k;->b(JLjava/lang/String;)V

    .line 239
    .line 240
    .line 241
    iget-object v0, v7, Lbb/k;->h:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 242
    .line 243
    invoke-virtual {v0, v9}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    invoke-virtual {v7}, Lbb/k;->l()V

    .line 247
    .line 248
    .line 249
    iget-object v0, v7, Lbb/k;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 250
    .line 251
    move-object v10, v8

    .line 252
    invoke-static {v10, v9}, Lbb/k;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v8

    .line 256
    iget-object v1, v7, Lbb/k;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 257
    .line 258
    invoke-virtual {v1, v8}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    check-cast v2, Ljava/lang/Integer;

    .line 263
    .line 264
    if-eqz v2, :cond_b

    .line 265
    .line 266
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 267
    .line 268
    .line 269
    move-result v4

    .line 270
    :cond_b
    add-int/2addr v4, v3

    .line 271
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    invoke-virtual {v1, v8, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    if-ne v4, v3, :cond_c

    .line 279
    .line 280
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 281
    .line 282
    .line 283
    move-result-wide v1

    .line 284
    const-wide/16 v3, 0x1b58

    .line 285
    .line 286
    long-to-double v3, v3

    .line 287
    mul-double/2addr v1, v3

    .line 288
    double-to-long v1, v1

    .line 289
    const-wide/16 v3, 0x1f40

    .line 290
    .line 291
    add-long/2addr v1, v3

    .line 292
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 293
    .line 294
    .line 295
    move-result-wide v3

    .line 296
    add-long/2addr v3, v1

    .line 297
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    invoke-virtual {v0, v8, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->tasks()Lo8/j;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    if-eqz v0, :cond_d

    .line 309
    .line 310
    const-string v3, "real_tail_retry_"

    .line 311
    .line 312
    invoke-virtual {v3, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    new-instance v6, Lb9/c;

    .line 317
    .line 318
    const/4 v11, 0x2

    .line 319
    invoke-direct/range {v6 .. v11}, Lb9/c;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v0, v3, v1, v2, v6}, Lo8/j;->f(Ljava/lang/String;JLjava/lang/Runnable;)V

    .line 323
    .line 324
    .line 325
    goto :goto_8

    .line 326
    :cond_c
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 327
    .line 328
    .line 329
    move-result-wide v1

    .line 330
    const-wide/32 v3, 0xea60

    .line 331
    .line 332
    .line 333
    add-long/2addr v1, v3

    .line 334
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    invoke-virtual {v0, v8, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    :cond_d
    :goto_8
    invoke-virtual {v7}, Lbb/k;->j()V

    .line 342
    .line 343
    .line 344
    :cond_e
    :goto_9
    return-void

    .line 345
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
