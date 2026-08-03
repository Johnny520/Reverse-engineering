.class public final Lrb/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lia/t;

.field public final b:Landroid/content/Context;

.field public final c:Lrb/l;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field public final f:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field public final g:Ljava/util/ArrayDeque;

.field public final h:Ljava/util/ArrayList;

.field public final i:Ljava/util/ArrayDeque;

.field public final j:Ljava/util/concurrent/ConcurrentHashMap;

.field public volatile k:Lrb/c;

.field public volatile l:Z

.field public m:Z

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public p:I

.field public q:Lrb/h;

.field public r:J

.field public s:Z

.field public t:I

.field public u:I

.field public v:I

.field public w:I

.field public x:Landroid/os/PowerManager$WakeLock;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lia/t;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lrb/k;->a:Lia/t;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    iput-object p2, p0, Lrb/k;->b:Landroid/content/Context;

    .line 11
    .line 12
    new-instance p2, Lrb/l;

    .line 13
    .line 14
    invoke-direct {p2, p1}, Lrb/l;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Lrb/k;->c:Lrb/l;

    .line 18
    .line 19
    new-instance p1, Ljava/lang/Object;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lrb/k;->d:Ljava/lang/Object;

    .line 25
    .line 26
    new-instance p1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 27
    .line 28
    new-instance v0, Lc9/q;

    .line 29
    .line 30
    const/16 v1, 0x18

    .line 31
    .line 32
    invoke-direct {v0, v1}, Lc9/q;-><init>(I)V

    .line 33
    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    invoke-direct {p1, v1, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->setRemoveOnCancelPolicy(Z)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lrb/k;->e:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 43
    .line 44
    new-instance p1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 45
    .line 46
    new-instance v0, Lc9/q;

    .line 47
    .line 48
    const/16 v2, 0x19

    .line 49
    .line 50
    invoke-direct {v0, v2}, Lc9/q;-><init>(I)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p1, v1, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->setRemoveOnCancelPolicy(Z)V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Lrb/k;->f:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 60
    .line 61
    new-instance p1, Ljava/util/ArrayDeque;

    .line 62
    .line 63
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, Lrb/k;->g:Ljava/util/ArrayDeque;

    .line 67
    .line 68
    new-instance p1, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Lrb/k;->h:Ljava/util/ArrayList;

    .line 74
    .line 75
    new-instance p1, Ljava/util/ArrayDeque;

    .line 76
    .line 77
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object p1, p0, Lrb/k;->i:Ljava/util/ArrayDeque;

    .line 81
    .line 82
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 83
    .line 84
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 85
    .line 86
    .line 87
    iput-object p1, p0, Lrb/k;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 88
    .line 89
    const-string p1, "\u7b49\u5f85\u68c0\u6d4b"

    .line 90
    .line 91
    iput-object p1, p0, Lrb/k;->n:Ljava/lang/String;

    .line 92
    .line 93
    const-string p1, ""

    .line 94
    .line 95
    iput-object p1, p0, Lrb/k;->o:Ljava/lang/String;

    .line 96
    .line 97
    iget-object v0, p2, Lrb/l;->a:Landroid/content/SharedPreferences;

    .line 98
    .line 99
    const-string v1, "zombie_check_total_count"

    .line 100
    .line 101
    const/4 v2, 0x0

    .line 102
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-gez v0, :cond_0

    .line 107
    .line 108
    move v0, v2

    .line 109
    :cond_0
    iput v0, p0, Lrb/k;->p:I

    .line 110
    .line 111
    const-string v0, "zombie_check_pending_ids"

    .line 112
    .line 113
    invoke-virtual {p2, v0}, Lrb/l;->b(Ljava/lang/String;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_1

    .line 126
    .line 127
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    check-cast v0, Ljava/lang/String;

    .line 132
    .line 133
    iget-object v1, p0, Lrb/k;->g:Ljava/util/ArrayDeque;

    .line 134
    .line 135
    new-instance v3, Lrb/j;

    .line 136
    .line 137
    invoke-direct {v3, v0, v2}, Lrb/j;-><init>(Ljava/lang/String;I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_1
    iget-object p2, p0, Lrb/k;->h:Ljava/util/ArrayList;

    .line 145
    .line 146
    iget-object v0, p0, Lrb/k;->c:Lrb/l;

    .line 147
    .line 148
    iget-object v0, v0, Lrb/l;->a:Landroid/content/SharedPreferences;

    .line 149
    .line 150
    const-string v1, "zombie_check_results"

    .line 151
    .line 152
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 157
    .line 158
    if-eqz p1, :cond_9

    .line 159
    .line 160
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-eqz v1, :cond_2

    .line 165
    .line 166
    goto/16 :goto_7

    .line 167
    .line 168
    :cond_2
    :try_start_0
    new-instance v1, Lorg/json/JSONArray;

    .line 169
    .line 170
    invoke-direct {v1, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-static {}, La/a;->E()Luf/c;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    :goto_1
    if-lt v2, v3, :cond_3

    .line 182
    .line 183
    invoke-static {p1}, La/a;->t(Luf/c;)Luf/c;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    goto :goto_5

    .line 188
    :catchall_0
    move-exception p1

    .line 189
    goto :goto_4

    .line 190
    :cond_3
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    if-eqz v4, :cond_7

    .line 195
    .line 196
    const-string v5, "wxid"

    .line 197
    .line 198
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-static {v5}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 214
    .line 215
    .line 216
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 217
    if-nez v6, :cond_4

    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_4
    :try_start_1
    const-string v6, "type"

    .line 221
    .line 222
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-static {v6}, Lrb/e;->valueOf(Ljava/lang/String;)Lrb/e;

    .line 230
    .line 231
    .line 232
    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 233
    goto :goto_2

    .line 234
    :catchall_1
    move-exception v6

    .line 235
    :try_start_2
    new-instance v7, Lsf/f;

    .line 236
    .line 237
    invoke-direct {v7, v6}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 238
    .line 239
    .line 240
    move-object v6, v7

    .line 241
    :goto_2
    sget-object v7, Lrb/e;->i:Lrb/e;

    .line 242
    .line 243
    instance-of v8, v6, Lsf/f;

    .line 244
    .line 245
    if-eqz v8, :cond_5

    .line 246
    .line 247
    move-object v6, v7

    .line 248
    :cond_5
    check-cast v6, Lrb/e;

    .line 249
    .line 250
    const-string v7, "name"

    .line 251
    .line 252
    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 257
    .line 258
    .line 259
    move-result v8

    .line 260
    if-eqz v8, :cond_6

    .line 261
    .line 262
    move-object v7, v5

    .line 263
    :cond_6
    const-string v8, "message"

    .line 264
    .line 265
    invoke-virtual {v4, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    new-instance v8, Lrb/d;

    .line 273
    .line 274
    invoke-direct {v8, v5, v7, v6, v4}, Lrb/d;-><init>(Ljava/lang/String;Ljava/lang/String;Lrb/e;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {p1, v8}, Luf/c;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 278
    .line 279
    .line 280
    :cond_7
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 281
    .line 282
    goto :goto_1

    .line 283
    :goto_4
    new-instance v1, Lsf/f;

    .line 284
    .line 285
    invoke-direct {v1, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 286
    .line 287
    .line 288
    move-object p1, v1

    .line 289
    :goto_5
    nop

    .line 290
    instance-of v1, p1, Lsf/f;

    .line 291
    .line 292
    if-eqz v1, :cond_8

    .line 293
    .line 294
    goto :goto_6

    .line 295
    :cond_8
    move-object v0, p1

    .line 296
    :goto_6
    check-cast v0, Ljava/util/List;

    .line 297
    .line 298
    :cond_9
    :goto_7
    invoke-static {p2, v0}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 299
    .line 300
    .line 301
    iget p1, p0, Lrb/k;->p:I

    .line 302
    .line 303
    if-gtz p1, :cond_a

    .line 304
    .line 305
    iget-object p1, p0, Lrb/k;->g:Ljava/util/ArrayDeque;

    .line 306
    .line 307
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->size()I

    .line 308
    .line 309
    .line 310
    move-result p1

    .line 311
    iget-object p2, p0, Lrb/k;->h:Ljava/util/ArrayList;

    .line 312
    .line 313
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 314
    .line 315
    .line 316
    move-result p2

    .line 317
    add-int/2addr p2, p1

    .line 318
    iput p2, p0, Lrb/k;->p:I

    .line 319
    .line 320
    :cond_a
    iget-object p1, p0, Lrb/k;->g:Ljava/util/ArrayDeque;

    .line 321
    .line 322
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 323
    .line 324
    .line 325
    move-result p1

    .line 326
    if-nez p1, :cond_b

    .line 327
    .line 328
    const-string p1, "\u68c0\u6d4b\u5df2\u6682\u505c\uff0c\u53ef\u7ee7\u7eed"

    .line 329
    .line 330
    iput-object p1, p0, Lrb/k;->n:Ljava/lang/String;

    .line 331
    .line 332
    :cond_b
    return-void
.end method

.method public static g(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_3

    .line 7
    .line 8
    const-string v0, "@chatroom"

    .line 9
    .line 10
    invoke-static {p0, v0, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_3

    .line 15
    .line 16
    const-string v0, "gh_"

    .line 17
    .line 18
    invoke-static {p0, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const-string v0, "filehelper"

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    const-string v0, "weixin"

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->account()Lg8/a;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-virtual {v0}, Lg8/a;->c()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    const/4 v0, 0x0

    .line 54
    :goto_0
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    xor-int/lit8 p0, p0, 0x1

    .line 59
    .line 60
    return p0

    .line 61
    :cond_3
    :goto_1
    return v1
.end method


# virtual methods
.method public final a(J)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lrb/k;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-wide v1, p0, Lrb/k;->r:J

    .line 5
    .line 6
    cmp-long p1, p1, v1

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    monitor-exit v0

    .line 18
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    monitor-exit v0

    .line 25
    throw p1
.end method

.method public final b(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lrb/k;->i:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/16 v1, 0x50

    .line 11
    .line 12
    if-le p1, v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void
.end method

.method public final c(J)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lrb/k;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lrb/k;->d(J)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    monitor-exit v0

    .line 13
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    monitor-exit v0

    .line 20
    throw p1
.end method

.method public final d(J)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lrb/k;->s:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, p0, Lrb/k;->r:J

    .line 6
    .line 7
    cmp-long p1, p1, v0

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method

.method public final e()V
    .locals 6

    .line 1
    iget-object v0, p0, Lrb/k;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lrb/k;->m:Z

    .line 5
    .line 6
    if-eqz v1, :cond_6

    .line 7
    .line 8
    iget-object v1, p0, Lrb/k;->g:Ljava/util/ArrayDeque;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_6

    .line 15
    .line 16
    iget-object v1, p0, Lrb/k;->q:Lrb/h;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto :goto_3

    .line 21
    :cond_0
    const/4 v1, 0x0

    .line 22
    iput-boolean v1, p0, Lrb/k;->m:Z

    .line 23
    .line 24
    const-string v2, ""

    .line 25
    .line 26
    iput-object v2, p0, Lrb/k;->o:Ljava/lang/String;

    .line 27
    .line 28
    const-string v2, "\u68c0\u6d4b\u5b8c\u6210"

    .line 29
    .line 30
    iput-object v2, p0, Lrb/k;->n:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v2, p0, Lrb/k;->h:Ljava/util/ArrayList;

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :catchall_0
    move-exception v1

    .line 44
    goto :goto_4

    .line 45
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    move v3, v1

    .line 50
    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_5

    .line 55
    .line 56
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    check-cast v4, Lrb/d;

    .line 61
    .line 62
    iget-object v4, v4, Lrb/d;->c:Lrb/e;

    .line 63
    .line 64
    sget-object v5, Lrb/e;->h:Lrb/e;

    .line 65
    .line 66
    if-ne v4, v5, :cond_3

    .line 67
    .line 68
    const/4 v4, 0x1

    .line 69
    goto :goto_1

    .line 70
    :cond_3
    move v4, v1

    .line 71
    :goto_1
    if-eqz v4, :cond_2

    .line 72
    .line 73
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    if-ltz v3, :cond_4

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_4
    invoke-static {}, La/a;->P0()V

    .line 79
    .line 80
    .line 81
    const/4 v1, 0x0

    .line 82
    throw v1

    .line 83
    :cond_5
    move v1, v3

    .line 84
    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    const-string v3, "\u68c0\u6d4b\u5b8c\u6210\uff0c\u5171\u53d1\u73b0 "

    .line 90
    .line 91
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v1, " \u4f4d\u5f02\u5e38\u597d\u53cb"

    .line 98
    .line 99
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {p0, v1}, Lrb/k;->b(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Lrb/k;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    .line 111
    .line 112
    monitor-exit v0

    .line 113
    invoke-virtual {p0}, Lrb/k;->j()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Lrb/k;->m()V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_6
    :goto_3
    monitor-exit v0

    .line 121
    return-void

    .line 122
    :goto_4
    monitor-exit v0

    .line 123
    throw v1
.end method

.method public final f(Lrb/h;Ljava/lang/String;)V
    .locals 6

    .line 1
    const-string v0, "\uff0c\u51c6\u5907\u91cd\u8bd5"

    .line 2
    .line 3
    iget-object v1, p1, Lrb/h;->a:Lrb/j;

    .line 4
    .line 5
    iget v1, v1, Lrb/j;->b:I

    .line 6
    .line 7
    iget-object v2, p0, Lrb/k;->c:Lrb/l;

    .line 8
    .line 9
    iget-object v2, v2, Lrb/l;->a:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    const-string v3, "zombie_check_max_retries"

    .line 12
    .line 13
    const/4 v4, 0x2

    .line 14
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x5

    .line 20
    invoke-static {v2, v3, v4}, Lr9/e0;->r(III)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-ge v1, v2, :cond_2

    .line 25
    .line 26
    iget-object v1, p0, Lrb/k;->d:Ljava/lang/Object;

    .line 27
    .line 28
    monitor-enter v1

    .line 29
    :try_start_0
    iget-boolean v2, p0, Lrb/k;->m:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    iget-object v3, p0, Lrb/k;->g:Ljava/util/ArrayDeque;

    .line 32
    .line 33
    iget-object v4, p1, Lrb/h;->a:Lrb/j;

    .line 34
    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    :try_start_1
    invoke-virtual {v3, v4}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    iget v2, v4, Lrb/j;->b:I

    .line 44
    .line 45
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    iget-object v4, v4, Lrb/j;->a:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    new-instance v5, Lrb/j;

    .line 53
    .line 54
    invoke-direct {v5, v4, v2}, Lrb/j;-><init>(Ljava/lang/String;I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v5}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lrb/k;->n:Ljava/lang/String;

    .line 65
    .line 66
    iget-object p1, p1, Lrb/h;->a:Lrb/j;

    .line 67
    .line 68
    iget-object v0, p1, Lrb/j;->a:Ljava/lang/String;

    .line 69
    .line 70
    iget p1, p1, Lrb/j;->b:I

    .line 71
    .line 72
    add-int/lit8 p1, p1, 0x1

    .line 73
    .line 74
    new-instance v2, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v0, ": "

    .line 83
    .line 84
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string p2, "\uff0c\u7b2c "

    .line 91
    .line 92
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string p1, " \u6b21\u91cd\u8bd5"

    .line 99
    .line 100
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {p0, p1}, Lrb/k;->b(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    :goto_0
    invoke-virtual {p0}, Lrb/k;->h()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 111
    .line 112
    .line 113
    monitor-exit v1

    .line 114
    invoke-virtual {p0}, Lrb/k;->m()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Lrb/k;->l()Lrb/m;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    iget-boolean p1, p1, Lrb/m;->b:Z

    .line 122
    .line 123
    if-eqz p1, :cond_1

    .line 124
    .line 125
    const-wide/16 p1, 0x1f4

    .line 126
    .line 127
    invoke-virtual {p0, p1, p2}, Lrb/k;->k(J)V

    .line 128
    .line 129
    .line 130
    :cond_1
    return-void

    .line 131
    :goto_1
    monitor-exit v1

    .line 132
    throw p1

    .line 133
    :cond_2
    iget-object v0, p0, Lrb/k;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 134
    .line 135
    iget-object v1, p1, Lrb/h;->a:Lrb/j;

    .line 136
    .line 137
    iget-object v1, v1, Lrb/j;->a:Ljava/lang/String;

    .line 138
    .line 139
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    check-cast v0, Ljava/lang/String;

    .line 144
    .line 145
    if-nez v0, :cond_3

    .line 146
    .line 147
    const-string v0, ""

    .line 148
    .line 149
    :cond_3
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-eqz v1, :cond_4

    .line 154
    .line 155
    iget-object v0, p1, Lrb/h;->a:Lrb/j;

    .line 156
    .line 157
    iget-object v0, v0, Lrb/j;->a:Ljava/lang/String;

    .line 158
    .line 159
    :cond_4
    new-instance v1, Lrb/d;

    .line 160
    .line 161
    iget-object p1, p1, Lrb/h;->a:Lrb/j;

    .line 162
    .line 163
    iget-object p1, p1, Lrb/j;->a:Ljava/lang/String;

    .line 164
    .line 165
    sget-object v2, Lrb/e;->i:Lrb/e;

    .line 166
    .line 167
    invoke-direct {v1, p1, v0, v2, p2}, Lrb/d;-><init>(Ljava/lang/String;Ljava/lang/String;Lrb/e;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0, v1}, Lrb/k;->i(Lrb/d;)V

    .line 171
    .line 172
    .line 173
    return-void
.end method

.method public final h()V
    .locals 7

    .line 1
    invoke-static {}, La/a;->E()Luf/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lrb/k;->q:Lrb/h;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, v1, Lrb/h;->a:Lrb/j;

    .line 10
    .line 11
    iget-object v1, v1, Lrb/j;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v1, p0, Lrb/k;->g:Ljava/util/ArrayDeque;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Lrb/j;

    .line 33
    .line 34
    iget-object v2, v2, Lrb/j;->a:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-static {v0}, La/a;->t(Luf/c;)Luf/c;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget v1, p0, Lrb/k;->p:I

    .line 45
    .line 46
    iget-object v2, p0, Lrb/k;->c:Lrb/l;

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iget-object v3, p0, Lrb/k;->h:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iget-object v2, v2, Lrb/l;->a:Landroid/content/SharedPreferences;

    .line 60
    .line 61
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    const-string v4, "zombie_check_pending_ids"

    .line 66
    .line 67
    invoke-static {v0}, Lrb/l;->a(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-interface {v2, v4, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-gez v1, :cond_2

    .line 76
    .line 77
    const/4 v1, 0x0

    .line 78
    :cond_2
    const-string v2, "zombie_check_total_count"

    .line 79
    .line 80
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    new-instance v1, Lorg/json/JSONArray;

    .line 85
    .line 86
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-eqz v3, :cond_3

    .line 98
    .line 99
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    check-cast v3, Lrb/d;

    .line 104
    .line 105
    new-instance v4, Lorg/json/JSONObject;

    .line 106
    .line 107
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 108
    .line 109
    .line 110
    const-string v5, "wxid"

    .line 111
    .line 112
    iget-object v6, v3, Lrb/d;->a:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 115
    .line 116
    .line 117
    const-string v5, "name"

    .line 118
    .line 119
    iget-object v6, v3, Lrb/d;->b:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 122
    .line 123
    .line 124
    iget-object v5, v3, Lrb/d;->c:Lrb/e;

    .line 125
    .line 126
    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    const-string v6, "type"

    .line 131
    .line 132
    invoke-virtual {v4, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 133
    .line 134
    .line 135
    const-string v5, "message"

    .line 136
    .line 137
    iget-object v3, v3, Lrb/d;->d:Ljava/lang/String;

    .line 138
    .line 139
    invoke-virtual {v4, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_3
    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    const-string v2, "zombie_check_results"

    .line 154
    .line 155
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 160
    .line 161
    .line 162
    return-void
.end method

.method public final i(Lrb/d;)V
    .locals 12

    .line 1
    iget-object v0, p1, Lrb/d;->c:Lrb/e;

    .line 2
    .line 3
    sget-object v1, Lrb/e;->h:Lrb/e;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    move v0, v3

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v2

    .line 12
    :goto_0
    iget-object v1, p0, Lrb/k;->d:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v1

    .line 15
    :try_start_0
    iget-object v4, p0, Lrb/k;->h:Ljava/util/ArrayList;

    .line 16
    .line 17
    new-instance v5, Lnb/a;

    .line 18
    .line 19
    const/4 v6, 0x5

    .line 20
    invoke-direct {v5, p1, v6}, Lnb/a;-><init>(Ljava/lang/Object;I)V

    .line 21
    .line 22
    .line 23
    invoke-static {v5, v4}, Ltf/r;->i1(Lfg/l;Ljava/util/List;)Z

    .line 24
    .line 25
    .line 26
    iget-object v4, p0, Lrb/k;->h:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    iget-object v4, p1, Lrb/d;->c:Lrb/e;

    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 34
    .line 35
    .line 36
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 37
    const/4 v5, 0x2

    .line 38
    if-eqz v4, :cond_3

    .line 39
    .line 40
    if-eq v4, v3, :cond_2

    .line 41
    .line 42
    if-ne v4, v5, :cond_1

    .line 43
    .line 44
    :try_start_1
    iget-object v4, p1, Lrb/d;->b:Ljava/lang/String;

    .line 45
    .line 46
    new-instance v6, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v4, "\uff1a\u68c0\u6d4b\u5f02\u5e38"

    .line 55
    .line 56
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    goto :goto_1

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    move-object p1, v0

    .line 66
    move-object v7, p0

    .line 67
    goto/16 :goto_3

    .line 68
    .line 69
    :cond_1
    new-instance p1, Laf/d;

    .line 70
    .line 71
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 72
    .line 73
    .line 74
    throw p1

    .line 75
    :cond_2
    iget-object v4, p1, Lrb/d;->b:Ljava/lang/String;

    .line 76
    .line 77
    new-instance v6, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v4, "\uff1a\u597d\u53cb\u5173\u7cfb\u5f02\u5e38"

    .line 86
    .line 87
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    goto :goto_1

    .line 95
    :cond_3
    :try_start_2
    iget-object v4, p1, Lrb/d;->b:Ljava/lang/String;

    .line 96
    .line 97
    new-instance v6, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v4, "\uff1a\u6b63\u5e38"

    .line 106
    .line 107
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    :goto_1
    iput-object v4, p0, Lrb/k;->n:Ljava/lang/String;

    .line 115
    .line 116
    iget-object v4, p1, Lrb/d;->b:Ljava/lang/String;

    .line 117
    .line 118
    iget-object v6, p1, Lrb/d;->d:Ljava/lang/String;

    .line 119
    .line 120
    new-instance v7, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const-string v4, ": "

    .line 129
    .line 130
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    invoke-virtual {p0, v4}, Lrb/k;->b(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0}, Lrb/k;->h()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 144
    .line 145
    .line 146
    monitor-exit v1

    .line 147
    invoke-virtual {p0}, Lrb/k;->m()V

    .line 148
    .line 149
    .line 150
    if-eqz v0, :cond_4

    .line 151
    .line 152
    iget-object v1, p0, Lrb/k;->d:Ljava/lang/Object;

    .line 153
    .line 154
    monitor-enter v1

    .line 155
    :try_start_3
    iget-wide v9, p0, Lrb/k;->r:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 156
    .line 157
    monitor-exit v1

    .line 158
    iget-object v0, p0, Lrb/k;->f:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 159
    .line 160
    new-instance v6, Lca/r;

    .line 161
    .line 162
    const/4 v11, 0x5

    .line 163
    move-object v7, p0

    .line 164
    move-object v8, p1

    .line 165
    invoke-direct/range {v6 .. v11}, Lca/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;JI)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, v6}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 169
    .line 170
    .line 171
    goto :goto_2

    .line 172
    :catchall_1
    move-exception v0

    .line 173
    move-object v7, p0

    .line 174
    move-object p1, v0

    .line 175
    monitor-exit v1

    .line 176
    throw p1

    .line 177
    :cond_4
    move-object v7, p0

    .line 178
    :goto_2
    iget-object p1, v7, Lrb/k;->c:Lrb/l;

    .line 179
    .line 180
    iget-object v0, p1, Lrb/l;->a:Landroid/content/SharedPreferences;

    .line 181
    .line 182
    const-string v1, "zombie_check_min_delay_seconds"

    .line 183
    .line 184
    invoke-interface {v0, v1, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    const/16 v1, 0x3c

    .line 189
    .line 190
    invoke-static {v0, v2, v1}, Lr9/e0;->r(III)I

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    iget-object v4, p1, Lrb/l;->a:Landroid/content/SharedPreferences;

    .line 195
    .line 196
    const-string v6, "zombie_check_max_delay_seconds"

    .line 197
    .line 198
    const/4 v8, 0x4

    .line 199
    invoke-interface {v4, v6, v8}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    iget-object p1, p1, Lrb/l;->a:Landroid/content/SharedPreferences;

    .line 204
    .line 205
    const-string v6, "zombie_check_min_delay_seconds"

    .line 206
    .line 207
    invoke-interface {p1, v6, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 208
    .line 209
    .line 210
    move-result p1

    .line 211
    invoke-static {p1, v2, v1}, Lr9/e0;->r(III)I

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    const/16 v1, 0x78

    .line 216
    .line 217
    invoke-static {v4, p1, v1}, Lr9/e0;->r(III)I

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    add-int/2addr p1, v3

    .line 222
    sget-object v1, Ljg/d;->g:Ljg/a;

    .line 223
    .line 224
    invoke-virtual {v1, v0, p1}, Ljg/d;->c(II)I

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    int-to-long v0, p1

    .line 229
    const-wide/16 v2, 0x3e8

    .line 230
    .line 231
    mul-long/2addr v0, v2

    .line 232
    invoke-virtual {p0}, Lrb/k;->l()Lrb/m;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    iget-boolean p1, p1, Lrb/m;->b:Z

    .line 237
    .line 238
    if-eqz p1, :cond_5

    .line 239
    .line 240
    invoke-virtual {p0, v0, v1}, Lrb/k;->k(J)V

    .line 241
    .line 242
    .line 243
    :cond_5
    return-void

    .line 244
    :catchall_2
    move-exception v0

    .line 245
    move-object v7, p0

    .line 246
    move-object p1, v0

    .line 247
    :goto_3
    monitor-exit v1

    .line 248
    throw p1
.end method

.method public final j()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lrb/k;->x:Landroid/os/PowerManager$WakeLock;

    .line 3
    .line 4
    if-eqz v1, :cond_1

    .line 5
    .line 6
    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v1, v0

    .line 14
    :goto_0
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    :catchall_0
    :cond_1
    iput-object v0, p0, Lrb/k;->x:Landroid/os/PowerManager$WakeLock;

    .line 20
    .line 21
    return-void
.end method

.method public final k(J)V
    .locals 5

    .line 1
    iget-object v0, p0, Lrb/k;->e:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v1, La1/a;

    .line 11
    .line 12
    const/16 v2, 0x1a

    .line 13
    .line 14
    invoke-direct {v1, p0, v2}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    cmp-long v4, p1, v2

    .line 20
    .line 21
    if-gez v4, :cond_1

    .line 22
    .line 23
    move-wide p1, v2

    .line 24
    :cond_1
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 25
    .line 26
    invoke-virtual {v0, v1, p1, p2, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final l()Lrb/m;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Lrb/k;->d:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v2

    .line 6
    :try_start_0
    new-instance v3, Lrb/m;

    .line 7
    .line 8
    iget-boolean v4, v1, Lrb/k;->l:Z

    .line 9
    .line 10
    iget-boolean v5, v1, Lrb/k;->m:Z

    .line 11
    .line 12
    iget-object v6, v1, Lrb/k;->n:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v7, v1, Lrb/k;->o:Ljava/lang/String;

    .line 15
    .line 16
    iget v8, v1, Lrb/k;->p:I

    .line 17
    .line 18
    iget-object v0, v1, Lrb/k;->g:Ljava/util/ArrayDeque;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v9, v1, Lrb/k;->q:Lrb/h;

    .line 25
    .line 26
    if-eqz v9, :cond_0

    .line 27
    .line 28
    const/4 v9, 0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v9, 0x0

    .line 31
    :goto_0
    add-int/2addr v9, v0

    .line 32
    iget-object v0, v1, Lrb/k;->h:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v10

    .line 38
    iget-object v0, v1, Lrb/k;->i:Ljava/util/ArrayDeque;

    .line 39
    .line 40
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v11

    .line 44
    iget-boolean v12, v1, Lrb/k;->s:Z

    .line 45
    .line 46
    iget v13, v1, Lrb/k;->t:I

    .line 47
    .line 48
    iget v14, v1, Lrb/k;->u:I

    .line 49
    .line 50
    iget v15, v1, Lrb/k;->v:I

    .line 51
    .line 52
    iget v0, v1, Lrb/k;->w:I

    .line 53
    .line 54
    move/from16 v16, v0

    .line 55
    .line 56
    invoke-direct/range {v3 .. v16}, Lrb/m;-><init>(ZZLjava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/util/List;ZIIII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    monitor-exit v2

    .line 60
    return-object v3

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    monitor-exit v2

    .line 63
    throw v0
.end method

.method public final m()V
    .locals 13

    .line 1
    const-string v0, "\u50f5\u5c38\u7c89\u68c0\u6d4b"

    .line 2
    .line 3
    const-string v1, "hchat_zombie_check"

    .line 4
    .line 5
    iget-object v2, p0, Lrb/k;->b:Landroid/content/Context;

    .line 6
    .line 7
    const-string v3, "\u5df2\u68c0\u6d4b "

    .line 8
    .line 9
    :try_start_0
    const-string v4, "notification"

    .line 10
    .line 11
    invoke-virtual {v2, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    instance-of v5, v4, Landroid/app/NotificationManager;

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    check-cast v4, Landroid/app/NotificationManager;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto/16 :goto_2

    .line 25
    .line 26
    :cond_0
    move-object v4, v6

    .line 27
    :goto_0
    if-eqz v4, :cond_4

    .line 28
    .line 29
    new-instance v5, Landroid/app/NotificationChannel;

    .line 30
    .line 31
    const/4 v7, 0x2

    .line 32
    invoke-direct {v5, v1, v0, v7}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 33
    .line 34
    .line 35
    const-string v7, "\u663e\u793a\u597d\u53cb\u5173\u7cfb\u68c0\u6d4b\u8fdb\u5ea6"

    .line 36
    .line 37
    invoke-virtual {v5, v7}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 v7, 0x0

    .line 41
    invoke-virtual {v5, v7}, Landroid/app/NotificationChannel;->setShowBadge(Z)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, v5}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lrb/k;->l()Lrb/m;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    iget-object v8, v5, Lrb/m;->g:Ljava/util/List;

    .line 52
    .line 53
    iget v9, v5, Lrb/m;->e:I

    .line 54
    .line 55
    const v10, 0x48435a43    # 200041.05f

    .line 56
    .line 57
    .line 58
    if-gtz v9, :cond_1

    .line 59
    .line 60
    invoke-virtual {v4, v10}, Landroid/app/NotificationManager;->cancel(I)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_1
    new-instance v11, Landroid/app/Notification$Builder;

    .line 65
    .line 66
    invoke-direct {v11, v2, v1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 74
    .line 75
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    if-eqz v1, :cond_2

    .line 80
    .line 81
    move-object v6, v2

    .line 82
    :cond_2
    if-eqz v6, :cond_3

    .line 83
    .line 84
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    goto :goto_1

    .line 89
    :cond_3
    const v1, 0x108007c

    .line 90
    .line 91
    .line 92
    :goto_1
    invoke-virtual {v11, v1}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v1, v0}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    invoke-virtual {v5}, Lrb/m;->a()I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    invoke-virtual {v5}, Lrb/m;->b()I

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    new-instance v12, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v12, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v1, "/"

    .line 121
    .line 122
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const-string v1, "\uff0c\u5f02\u5e38 "

    .line 129
    .line 130
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const-string v1, "\uff0c\u5931\u8d25 "

    .line 137
    .line 138
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    invoke-virtual {v0, v9, v1, v7}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    iget-boolean v1, v5, Lrb/m;->b:Z

    .line 161
    .line 162
    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    const/4 v1, 0x1

    .line 167
    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v11}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v4, v10, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 175
    .line 176
    .line 177
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :goto_2
    new-instance v1, Lsf/f;

    .line 181
    .line 182
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 183
    .line 184
    .line 185
    move-object v0, v1

    .line 186
    :goto_3
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    if-eqz v0, :cond_4

    .line 191
    .line 192
    iget-object v1, p0, Lrb/k;->a:Lia/t;

    .line 193
    .line 194
    const-string v2, "\u66f4\u65b0\u50f5\u5c38\u7c89\u68c0\u6d4b\u901a\u77e5\u5931\u8d25"

    .line 195
    .line 196
    invoke-virtual {v1, v2, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    :cond_4
    return-void
.end method
