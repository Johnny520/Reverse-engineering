.class public abstract Lbl;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sput-object v0, Lbl;->α:Ljava/util/Set;

    .line 14
    .line 15
    return-void
.end method

.method public static α(Ljava/lang/reflect/Method;Ljava/lang/String;La80;La80;)V
    .locals 8

    .line 1
    const-string v0, "rc108c6a5c31674e3"

    .line 2
    .line 3
    const-string v1, "\u5df2\u5b89\u88c5 "

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v5, Lwj;

    .line 25
    .line 26
    const/16 v6, 0x12

    .line 27
    .line 28
    invoke-direct {v5, v6}, Lwj;-><init>(I)V

    .line 29
    .line 30
    .line 31
    const/16 v6, 0x1f

    .line 32
    .line 33
    const/4 v7, 0x0

    .line 34
    invoke-static {v4, v7, v7, v5, v6}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    const-string v6, "#"

    .line 47
    .line 48
    const-string v7, "("

    .line 49
    .line 50
    invoke-static {v2, v6, v3, v7, v4}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    const-string v3, "):"

    .line 55
    .line 56
    invoke-static {v2, v3, v5}, Llz1;->π(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    sget-object v3, Lbl;->α:Ljava/util/Set;

    .line 61
    .line 62
    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-nez v4, :cond_0

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_0
    :try_start_0
    sget-object v4, Lxq0;->α:Lxq0;

    .line 70
    .line 71
    new-instance v5, Lal;

    .line 72
    .line 73
    invoke-direct {v5, p2, p1, p3}, Lal;-><init>(La80;Ljava/lang/String;La80;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, p0, v5}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 77
    .line 78
    .line 79
    new-instance p0, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string p2, " -> "

    .line 88
    .line 89
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :catchall_0
    move-exception p0

    .line 106
    new-instance p2, Leo1;

    .line 107
    .line 108
    invoke-direct {p2, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    move-object p0, p2

    .line 112
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    if-eqz p0, :cond_1

    .line 117
    .line 118
    invoke-interface {v3, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    new-instance p2, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const-string p1, " Hook \u5b89\u88c5\u5931\u8d25: "

    .line 130
    .line 131
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-static {v0, p1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 142
    .line 143
    .line 144
    :cond_1
    :goto_1
    return-void
.end method

.method public static β(Ljava/lang/ClassLoader;)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lll;->α:Lll;

    .line 5
    .line 6
    invoke-static {}, Lpd2;->Β()Lhl;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lll;->ζ:Lhl;

    .line 11
    .line 12
    sget-object v0, Lll;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget-object v0, Lui1;->α:Ljava/lang/Object;

    .line 24
    .line 25
    sget-object v0, Lll;->η:Lwj;

    .line 26
    .line 27
    invoke-static {v0}, Lui1;->β(La80;)V

    .line 28
    .line 29
    .line 30
    sget-object v0, Lll;->θ:Lwj;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    sget-object v3, Lui1;->ι:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 36
    .line 37
    invoke-virtual {v3, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    :goto_0
    :try_start_0
    sget-object v0, Lkk;->α:Lkk;

    .line 41
    .line 42
    invoke-virtual {v0, p0, v1}, Lkk;->ο(Ljava/lang/ClassLoader;Z)Ljk;

    .line 43
    .line 44
    .line 45
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    goto :goto_1

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    move-object p0, v0

    .line 49
    new-instance v0, Leo1;

    .line 50
    .line 51
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    move-object p0, v0

    .line 55
    :goto_1
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const-string v3, "rc108c6a5c31674e3"

    .line 60
    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    const-string v4, "\u8bc4\u8bba\u63a7\u4ef6\u76ee\u6807\u89e3\u6790\u5931\u8d25"

    .line 64
    .line 65
    invoke-static {v3, v4, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    instance-of v0, p0, Leo1;

    .line 69
    .line 70
    const/4 v4, 0x0

    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    move-object p0, v4

    .line 74
    :cond_2
    check-cast p0, Ljk;

    .line 75
    .line 76
    if-nez p0, :cond_3

    .line 77
    .line 78
    return-void

    .line 79
    :cond_3
    iget-object v0, p0, Ljk;->α:Ljava/lang/Object;

    .line 80
    .line 81
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-eqz v5, :cond_4

    .line 90
    .line 91
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    check-cast v5, Lbk;

    .line 96
    .line 97
    iget-object v6, v5, Lbk;->γ:Ljava/lang/reflect/Method;

    .line 98
    .line 99
    iget-object v7, v5, Lbk;->α:Lzj;

    .line 100
    .line 101
    new-instance v8, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    const-string v9, "component:"

    .line 104
    .line 105
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    new-instance v8, Lzk;

    .line 116
    .line 117
    invoke-direct {v8, v5, p0, v1}, Lzk;-><init>(Lbk;Ljk;I)V

    .line 118
    .line 119
    .line 120
    new-instance v9, Lzk;

    .line 121
    .line 122
    invoke-direct {v9, v5, p0, v2}, Lzk;-><init>(Lbk;Ljk;I)V

    .line 123
    .line 124
    .line 125
    invoke-static {v6, v7, v8, v9}, Lbl;->α(Ljava/lang/reflect/Method;Ljava/lang/String;La80;La80;)V

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_4
    iget-object v0, p0, Ljk;->β:Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-eqz v5, :cond_6

    .line 140
    .line 141
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    check-cast v5, Lik;

    .line 146
    .line 147
    iget-object v6, v5, Lik;->γ:Ljava/lang/reflect/Method;

    .line 148
    .line 149
    iget-object v7, v5, Lik;->α:Lhk;

    .line 150
    .line 151
    new-instance v8, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    const-string v9, "holder-bind:"

    .line 154
    .line 155
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    new-instance v9, Lvk;

    .line 166
    .line 167
    invoke-direct {v9, v5, p0, v1}, Lvk;-><init>(Lik;Ljk;I)V

    .line 168
    .line 169
    .line 170
    new-instance v10, Lvk;

    .line 171
    .line 172
    invoke-direct {v10, v5, p0, v2}, Lvk;-><init>(Lik;Ljk;I)V

    .line 173
    .line 174
    .line 175
    invoke-static {v6, v8, v9, v10}, Lbl;->α(Ljava/lang/reflect/Method;Ljava/lang/String;La80;La80;)V

    .line 176
    .line 177
    .line 178
    iget-object v6, v5, Lik;->δ:Ljava/lang/Object;

    .line 179
    .line 180
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 185
    .line 186
    .line 187
    move-result v8

    .line 188
    if-eqz v8, :cond_5

    .line 189
    .line 190
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    check-cast v8, Ljava/lang/reflect/Method;

    .line 195
    .line 196
    new-instance v9, Ljava/lang/StringBuilder;

    .line 197
    .line 198
    const-string v10, "holder-update:"

    .line 199
    .line 200
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v9

    .line 210
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    new-instance v10, Lvk;

    .line 214
    .line 215
    invoke-direct {v10, v5, p0, v1}, Lvk;-><init>(Lik;Ljk;I)V

    .line 216
    .line 217
    .line 218
    new-instance v11, Lvk;

    .line 219
    .line 220
    invoke-direct {v11, v5, p0, v2}, Lvk;-><init>(Lik;Ljk;I)V

    .line 221
    .line 222
    .line 223
    invoke-static {v8, v9, v10, v11}, Lbl;->α(Ljava/lang/reflect/Method;Ljava/lang/String;La80;La80;)V

    .line 224
    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_6
    iget-object v0, p0, Ljk;->γ:Ljava/util/ArrayList;

    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    if-eqz v5, :cond_8

    .line 238
    .line 239
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    check-cast v5, Lfk;

    .line 244
    .line 245
    iget-object v6, v5, Lfk;->β:Ljava/util/ArrayList;

    .line 246
    .line 247
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 248
    .line 249
    .line 250
    move-result-object v6

    .line 251
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 252
    .line 253
    .line 254
    move-result v7

    .line 255
    if-eqz v7, :cond_7

    .line 256
    .line 257
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    check-cast v7, Ljava/lang/reflect/Method;

    .line 262
    .line 263
    iget-object v8, v5, Lfk;->α:Ljava/lang/Class;

    .line 264
    .line 265
    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v8

    .line 269
    const-string v9, "expand:"

    .line 270
    .line 271
    invoke-virtual {v9, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v8

    .line 275
    new-instance v9, Lxk;

    .line 276
    .line 277
    invoke-direct {v9, v5, v1}, Lxk;-><init>(Lfk;I)V

    .line 278
    .line 279
    .line 280
    new-instance v10, Lxk;

    .line 281
    .line 282
    invoke-direct {v10, v5, v2}, Lxk;-><init>(Lfk;I)V

    .line 283
    .line 284
    .line 285
    invoke-static {v7, v8, v9, v10}, Lbl;->α(Ljava/lang/reflect/Method;Ljava/lang/String;La80;La80;)V

    .line 286
    .line 287
    .line 288
    goto :goto_4

    .line 289
    :cond_8
    iget-object v0, p0, Ljk;->δ:Ljava/util/ArrayList;

    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 296
    .line 297
    .line 298
    move-result v5

    .line 299
    if-eqz v5, :cond_a

    .line 300
    .line 301
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v5

    .line 305
    check-cast v5, Ldk;

    .line 306
    .line 307
    iget-object v6, v5, Ldk;->β:Ljava/lang/reflect/Method;

    .line 308
    .line 309
    if-nez v6, :cond_9

    .line 310
    .line 311
    goto :goto_5

    .line 312
    :cond_9
    iget-object v7, v5, Ldk;->α:Ljava/lang/Class;

    .line 313
    .line 314
    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v7

    .line 318
    const-string v8, "digg-update:"

    .line 319
    .line 320
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v7

    .line 324
    new-instance v8, Lyk;

    .line 325
    .line 326
    invoke-direct {v8, v5, v1}, Lyk;-><init>(Ldk;I)V

    .line 327
    .line 328
    .line 329
    new-instance v9, Lyk;

    .line 330
    .line 331
    invoke-direct {v9, v5, v2}, Lyk;-><init>(Ldk;I)V

    .line 332
    .line 333
    .line 334
    invoke-static {v6, v7, v8, v9}, Lbl;->α(Ljava/lang/reflect/Method;Ljava/lang/String;La80;La80;)V

    .line 335
    .line 336
    .line 337
    goto :goto_5

    .line 338
    :cond_a
    iget-object v0, p0, Ljk;->ε:Ljava/util/ArrayList;

    .line 339
    .line 340
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 345
    .line 346
    .line 347
    move-result v5

    .line 348
    if-eqz v5, :cond_c

    .line 349
    .line 350
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v5

    .line 354
    check-cast v5, Lyj;

    .line 355
    .line 356
    iget-object v6, v5, Lyj;->β:Ljava/lang/reflect/Method;

    .line 357
    .line 358
    if-nez v6, :cond_b

    .line 359
    .line 360
    goto :goto_6

    .line 361
    :cond_b
    iget-object v7, v5, Lyj;->α:Ljava/lang/Class;

    .line 362
    .line 363
    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v7

    .line 367
    const-string v8, "bury-update:"

    .line 368
    .line 369
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v7

    .line 373
    new-instance v8, Lwk;

    .line 374
    .line 375
    invoke-direct {v8, v5, v1}, Lwk;-><init>(Lyj;I)V

    .line 376
    .line 377
    .line 378
    new-instance v9, Lwk;

    .line 379
    .line 380
    invoke-direct {v9, v5, v2}, Lwk;-><init>(Lyj;I)V

    .line 381
    .line 382
    .line 383
    invoke-static {v6, v7, v8, v9}, Lbl;->α(Ljava/lang/reflect/Method;Ljava/lang/String;La80;La80;)V

    .line 384
    .line 385
    .line 386
    goto :goto_6

    .line 387
    :cond_c
    iget-object v0, p0, Ljk;->α:Ljava/lang/Object;

    .line 388
    .line 389
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    iget-object v5, p0, Ljk;->β:Ljava/util/ArrayList;

    .line 394
    .line 395
    new-instance v10, Lwj;

    .line 396
    .line 397
    const/16 v1, 0x11

    .line 398
    .line 399
    invoke-direct {v10, v1}, Lwj;-><init>(I)V

    .line 400
    .line 401
    .line 402
    const/16 v11, 0x1f

    .line 403
    .line 404
    const/4 v6, 0x0

    .line 405
    const/4 v7, 0x0

    .line 406
    const/4 v8, 0x0

    .line 407
    const/4 v9, 0x0

    .line 408
    invoke-static/range {v5 .. v11}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    iget-object v5, p0, Ljk;->γ:Ljava/util/ArrayList;

    .line 413
    .line 414
    new-instance v10, Lwj;

    .line 415
    .line 416
    const/16 v2, 0x13

    .line 417
    .line 418
    invoke-direct {v10, v2}, Lwj;-><init>(I)V

    .line 419
    .line 420
    .line 421
    invoke-static/range {v5 .. v11}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    iget-object v5, p0, Ljk;->δ:Ljava/util/ArrayList;

    .line 426
    .line 427
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 428
    .line 429
    .line 430
    move-result v5

    .line 431
    iget-object p0, p0, Ljk;->ε:Ljava/util/ArrayList;

    .line 432
    .line 433
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 434
    .line 435
    .line 436
    move-result p0

    .line 437
    const-string v6, ", holders="

    .line 438
    .line 439
    const-string v7, ", expand="

    .line 440
    .line 441
    const-string v8, "\u7cbe\u51c6\u5206\u652f\u5b89\u88c5\u5b8c\u6210 components="

    .line 442
    .line 443
    invoke-static {v0, v8, v6, v1, v7}, La12;->η(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    const-string v1, ", digg="

    .line 451
    .line 452
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    .line 458
    const-string v1, ", bury="

    .line 459
    .line 460
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object p0

    .line 470
    const/4 v0, 0x4

    .line 471
    invoke-static {v3, p0, v4, v0, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    return-void
.end method
