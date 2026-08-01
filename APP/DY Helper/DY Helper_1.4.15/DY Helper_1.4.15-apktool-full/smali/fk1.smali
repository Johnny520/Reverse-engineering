.class public final Lfk1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lfk1;

.field public static final β:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final γ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final δ:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static final ε:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lfk1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lfk1;->α:Lfk1;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lfk1;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lfk1;->γ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lfk1;->δ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 29
    .line 30
    const-string v0, "~788FC25F6ECFA50DD00C6DA13A7899CDD863E55178DDAE176707859EDDA8AE08A7E39E76D72CD0ED2894EBA8AE89C668D958516EBA264A16F0AC0219DBF823F756466AC3C64E"

    .line 31
    .line 32
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "com.p771ss.android.ugc.aweme.im.share.sharelist.IMShareContactsListAdapter"

    .line 37
    .line 38
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Lfk1;->ε:Ljava/util/List;

    .line 47
    .line 48
    return-void
.end method

.method public static β(La80;Ljava/lang/Class;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-interface {p0, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception p0

    .line 8
    new-instance p1, Leo1;

    .line 9
    .line 10
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    move-object p0, p1

    .line 14
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string p1, "resolved listener failed: "

    .line 29
    .line 30
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const-string p1, "rccd4afae37c74879"

    .line 35
    .line 36
    invoke-static {p1, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public static γ(Ljava/util/Collection;)Ljava/util/List;
    .locals 3

    .line 1
    check-cast p0, Ljava/lang/Iterable;

    .line 2
    .line 3
    new-instance v0, Lf7;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-direct {v0, v1, p0}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    new-instance p0, Lli1;

    .line 10
    .line 11
    const/16 v1, 0xe

    .line 12
    .line 13
    invoke-direct {p0, v1}, Lli1;-><init>(I)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Ly30;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-direct {v1, v0, v2, p0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 20
    .line 21
    .line 22
    new-instance p0, Lli1;

    .line 23
    .line 24
    const/16 v0, 0xf

    .line 25
    .line 26
    invoke-direct {p0, v0}, Lli1;-><init>(I)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Lbu;

    .line 30
    .line 31
    invoke-interface {v1}, Lss1;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-direct {v0, v1, p0}, Lbu;-><init>(Ljava/util/Iterator;La80;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-nez p0, :cond_0

    .line 43
    .line 44
    sget-object p0, Ljz;->ε:Ljz;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-nez v1, :cond_1

    .line 56
    .line 57
    invoke-static {p0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    invoke-static {p0}, Llz1;->φ(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_2

    .line 71
    .line 72
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    :goto_1
    return-object p0
.end method


# virtual methods
.method public final α(Ljava/lang/ClassLoader;Z)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 5
    .line 6
    sget-object v0, Lkx;->Ж:Lkx;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lox;->π(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget-object v2, Ljz;->ε:Ljz;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    move-object v1, v2

    .line 17
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    sget-object v4, Lfk1;->ε:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eqz v5, :cond_3

    .line 33
    .line 34
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    check-cast v5, Ljava/lang/String;

    .line 39
    .line 40
    const/4 v6, 0x0

    .line 41
    :try_start_0
    invoke-static {v5, v6, p1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception v5

    .line 47
    new-instance v6, Leo1;

    .line 48
    .line 49
    invoke-direct {v6, v5}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    move-object v5, v6

    .line 53
    :goto_1
    instance-of v6, v5, Leo1;

    .line 54
    .line 55
    if-eqz v6, :cond_2

    .line 56
    .line 57
    const/4 v5, 0x0

    .line 58
    :cond_2
    check-cast v5, Ljava/lang/Class;

    .line 59
    .line 60
    if-eqz v5, :cond_1

    .line 61
    .line 62
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    invoke-static {v1}, Lfk1;->γ(Ljava/util/Collection;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-static {v3, v4}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-static {v3}, Lfk1;->γ(Ljava/util/Collection;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    const-string v6, "rccd4afae37c74879"

    .line 83
    .line 84
    if-nez v5, :cond_6

    .line 85
    .line 86
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-nez p0, :cond_5

    .line 91
    .line 92
    sget-object p0, Lox;->α:Ljava/lang/Object;

    .line 93
    .line 94
    sget-object p0, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-nez p0, :cond_4

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_4
    :try_start_1
    invoke-static {v0, v3}, Lox;->υ(Lkx;Ljava/util/List;)V

    .line 104
    .line 105
    .line 106
    sget-object p0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :catchall_1
    move-exception p0

    .line 110
    new-instance p1, Leo1;

    .line 111
    .line 112
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    move-object p0, p1

    .line 116
    :goto_2
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    if-eqz p0, :cond_5

    .line 121
    .line 122
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    const-string p1, "save class cache failed: "

    .line 131
    .line 132
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-static {v6, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    :cond_5
    :goto_3
    move-object v2, v3

    .line 140
    goto/16 :goto_6

    .line 141
    .line 142
    :cond_6
    if-eqz p2, :cond_c

    .line 143
    .line 144
    sget-object p2, Lox;->α:Ljava/lang/Object;

    .line 145
    .line 146
    sget-object p2, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 147
    .line 148
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 149
    .line 150
    .line 151
    move-result p2

    .line 152
    if-nez p2, :cond_7

    .line 153
    .line 154
    goto :goto_6

    .line 155
    :cond_7
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    invoke-static {p2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result p2

    .line 167
    if-eqz p2, :cond_8

    .line 168
    .line 169
    const-string p0, "skip DexKit scan on main thread"

    .line 170
    .line 171
    invoke-static {v6, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    goto :goto_6

    .line 175
    :cond_8
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 176
    .line 177
    .line 178
    move-result p2

    .line 179
    if-nez p2, :cond_9

    .line 180
    .line 181
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 182
    .line 183
    .line 184
    move-result p2

    .line 185
    if-eqz p2, :cond_9

    .line 186
    .line 187
    :try_start_2
    invoke-static {v0, v2}, Lox;->υ(Lkx;Ljava/util/List;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 188
    .line 189
    .line 190
    :catchall_2
    :cond_9
    :try_start_3
    sget-object p2, Lox;->α:Ljava/lang/Object;

    .line 191
    .line 192
    new-instance p2, Lt20;

    .line 193
    .line 194
    const/16 v1, 0x1c

    .line 195
    .line 196
    invoke-direct {p2, p1, p0, v1}, Lt20;-><init>(Ljava/lang/ClassLoader;Ljava/lang/Object;I)V

    .line 197
    .line 198
    .line 199
    const-string p0, "\u5b9a\u4f4d\u89c6\u9891\u5feb\u6377\u5206\u4eab\u8054\u7cfb\u4eba Adapter"

    .line 200
    .line 201
    invoke-static {v0, p1, p0, p2}, Lox;->ι(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    invoke-static {p0}, Lfk1;->γ(Ljava/util/Collection;)Ljava/util/List;

    .line 206
    .line 207
    .line 208
    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 209
    goto :goto_4

    .line 210
    :catchall_3
    move-exception p0

    .line 211
    new-instance p1, Leo1;

    .line 212
    .line 213
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 214
    .line 215
    .line 216
    move-object p0, p1

    .line 217
    :goto_4
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    if-eqz p1, :cond_a

    .line 222
    .line 223
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    const-string p2, "DexKit candidate scan failed: "

    .line 232
    .line 233
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-static {v6, p1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    :cond_a
    instance-of p1, p0, Leo1;

    .line 241
    .line 242
    if-eqz p1, :cond_b

    .line 243
    .line 244
    goto :goto_5

    .line 245
    :cond_b
    move-object v2, p0

    .line 246
    :goto_5
    check-cast v2, Ljava/util/List;

    .line 247
    .line 248
    :cond_c
    :goto_6
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    :cond_d
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 253
    .line 254
    .line 255
    move-result p1

    .line 256
    if-eqz p1, :cond_e

    .line 257
    .line 258
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    check-cast p1, Ljava/lang/Class;

    .line 263
    .line 264
    sget-object p2, Lfk1;->γ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 265
    .line 266
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    invoke-virtual {p2, v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object p2

    .line 274
    if-nez p2, :cond_d

    .line 275
    .line 276
    sget-object p2, Lfk1;->δ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 277
    .line 278
    invoke-virtual {p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 279
    .line 280
    .line 281
    move-result-object p2

    .line 282
    :goto_7
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-eqz v0, :cond_d

    .line 287
    .line 288
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    check-cast v0, La80;

    .line 293
    .line 294
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    invoke-static {v0, p1}, Lfk1;->β(La80;Ljava/lang/Class;)V

    .line 298
    .line 299
    .line 300
    goto :goto_7

    .line 301
    :cond_e
    return-void
.end method
