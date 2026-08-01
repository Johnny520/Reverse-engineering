.class public final synthetic Lhi0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lv41;


# instance fields
.field public final synthetic ε:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lhi0;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public α(Ljava/lang/String;Li0;)Lhi0;
    .locals 8

    .line 1
    iget-object p0, p0, Lhi0;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lli0;

    .line 4
    .line 5
    sget-object v0, Lwi0;->α:Lwi0;

    .line 6
    .line 7
    iget-object p0, p0, Lli0;->β:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    sget-object v0, Lwi0;->θ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    if-nez v1, :cond_6

    .line 20
    .line 21
    sget-object v1, Lwi0;->δ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 22
    .line 23
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    sget-object v1, Lci0;->α:Lci0;

    .line 30
    .line 31
    invoke-virtual {v1, p0}, Lci0;->ν(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-eqz v1, :cond_5

    .line 36
    .line 37
    const-string v3, "~794CAD4578EC442949BD7B3992FC5526A1F842EFCC67EBC28B842F17AB0A90AF5FD222611757C5C247868F98FFC52DA39A9E9A3FD8CE"

    .line 38
    .line 39
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-static {p0, v4}, Lbx;->α(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    if-eqz v4, :cond_4

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    const-string v5, "~795CFE82BF8D864C285649BA56CE33B4C18838459A84C50FE419E35FE204466F8D2561AAF8AA290694109CAA750A811D72F9"

    .line 54
    .line 55
    invoke-static {v5}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-static {p0, v5}, Lbx;->α(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 64
    .line 65
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 66
    .line 67
    .line 68
    if-eqz p0, :cond_0

    .line 69
    .line 70
    invoke-static {p0}, Lwi0;->α(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-static {v5, p0}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 75
    .line 76
    .line 77
    :cond_0
    invoke-static {v3}, Lwi0;->α(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-static {v5, p0}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 82
    .line 83
    .line 84
    new-instance p0, Lf7;

    .line 85
    .line 86
    const/4 v3, 0x1

    .line 87
    invoke-direct {p0, v3, v5}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    new-instance v5, Lt00;

    .line 91
    .line 92
    const/4 v6, 0x3

    .line 93
    invoke-direct {v5, v4, v6}, Lt00;-><init>(Ljava/lang/Class;I)V

    .line 94
    .line 95
    .line 96
    new-instance v7, Ly30;

    .line 97
    .line 98
    invoke-direct {v7, p0, v3, v5}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 99
    .line 100
    .line 101
    new-instance p0, Lsh0;

    .line 102
    .line 103
    const/16 v5, 0x19

    .line 104
    .line 105
    invoke-direct {p0, v5}, Lsh0;-><init>(I)V

    .line 106
    .line 107
    .line 108
    new-instance v5, Lt52;

    .line 109
    .line 110
    invoke-direct {v5, v7, p0}, Lt52;-><init>(Lss1;La80;)V

    .line 111
    .line 112
    .line 113
    new-instance p0, Lsh0;

    .line 114
    .line 115
    const/16 v7, 0x1a

    .line 116
    .line 117
    invoke-direct {p0, v7}, Lsh0;-><init>(I)V

    .line 118
    .line 119
    .line 120
    new-instance v7, Ly30;

    .line 121
    .line 122
    invoke-direct {v7, v5, v3, p0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 123
    .line 124
    .line 125
    new-instance p0, Luh0;

    .line 126
    .line 127
    invoke-direct {p0, v3}, Luh0;-><init>(I)V

    .line 128
    .line 129
    .line 130
    new-instance v5, Lcu;

    .line 131
    .line 132
    invoke-direct {v5, v7, v6, p0}, Lcu;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    new-instance p0, Lsh0;

    .line 136
    .line 137
    const/16 v6, 0x1b

    .line 138
    .line 139
    invoke-direct {p0, v6}, Lsh0;-><init>(I)V

    .line 140
    .line 141
    .line 142
    new-instance v6, Lt52;

    .line 143
    .line 144
    invoke-direct {v6, v5, p0}, Lt52;-><init>(Lss1;La80;)V

    .line 145
    .line 146
    .line 147
    invoke-static {v6}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    check-cast p0, Ljava/lang/reflect/Method;

    .line 152
    .line 153
    if-eqz p0, :cond_1

    .line 154
    .line 155
    invoke-virtual {p0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 156
    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_1
    move-object p0, v2

    .line 160
    :goto_0
    if-eqz p0, :cond_3

    .line 161
    .line 162
    sget-object v2, Lwi0;->η:Ljava/util/concurrent/atomic/AtomicLong;

    .line 163
    .line 164
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 165
    .line 166
    .line 167
    move-result-wide v5

    .line 168
    new-instance v2, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    const-string v7, "@"

    .line 177
    .line 178
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    new-instance v6, Lsi0;

    .line 197
    .line 198
    invoke-direct {v6, v2, p2}, Lsi0;-><init>(Ljava/lang/String;Li0;)V

    .line 199
    .line 200
    .line 201
    invoke-static {v5, v4, v6}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v2, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    :try_start_0
    invoke-virtual {p0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 212
    .line 213
    .line 214
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-virtual {p0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 219
    .line 220
    .line 221
    new-instance p0, Lhi0;

    .line 222
    .line 223
    invoke-direct {p0, v2}, Lhi0;-><init>(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    return-object p0

    .line 227
    :catchall_0
    move-exception p0

    .line 228
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    if-nez p1, :cond_2

    .line 236
    .line 237
    goto :goto_1

    .line 238
    :cond_2
    move-object p0, p1

    .line 239
    :goto_1
    throw p0

    .line 240
    :cond_3
    const-string p0, "\u672a\u627e\u5230\u7a33\u5b9a\u4f1a\u8bdd\u5220\u9664\u65b9\u6cd5"

    .line 241
    .line 242
    invoke-static {p0}, Lql1;->δ(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    return-object v2

    .line 246
    :cond_4
    new-instance p0, Ljava/lang/ClassNotFoundException;

    .line 247
    .line 248
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    invoke-direct {p0, p1}, Ljava/lang/ClassNotFoundException;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    throw p0

    .line 256
    :cond_5
    const-string p0, "\u672a\u83b7\u53d6\u5230 IConversationListModel"

    .line 257
    .line 258
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    return-object v2

    .line 262
    :cond_6
    const-string p0, "conversationId \u4e0d\u80fd\u4e3a\u7a7a"

    .line 263
    .line 264
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    return-object v2
.end method

.method public β()V
    .locals 8

    .line 1
    iget-object p0, p0, Lhi0;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Le80;

    .line 4
    .line 5
    sget-object v0, Lax1;->γ:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lax1;->θ:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/16 v3, 0xa

    .line 16
    .line 17
    invoke-static {v1, v3}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/4 v3, 0x0

    .line 29
    move v4, v3

    .line 30
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_2

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    const/4 v6, 0x1

    .line 41
    if-nez v4, :cond_1

    .line 42
    .line 43
    invoke-static {v5, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-eqz v7, :cond_1

    .line 48
    .line 49
    move v4, v6

    .line 50
    move v6, v3

    .line 51
    :cond_1
    if-eqz v6, :cond_0

    .line 52
    .line 53
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    sput-object v2, Lax1;->θ:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    monitor-exit v0

    .line 60
    return-void

    .line 61
    :catchall_0
    move-exception p0

    .line 62
    monitor-exit v0

    .line 63
    throw p0
.end method

.method public η(Landroid/view/View;Loc2;)Loc2;
    .locals 5

    .line 1
    iget-object p0, p0, Lhi0;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/core/view/insets/α;

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/core/view/insets/α;->β:Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object v0, p2, Loc2;->α:Llc2;

    .line 8
    .line 9
    const/16 v1, 0x207

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Llc2;->η(I)Lnm0;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/16 v3, 0x40

    .line 16
    .line 17
    invoke-virtual {v0, v3}, Llc2;->η(I)Lnm0;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-static {v2, v4}, Lnm0;->α(Lnm0;Lnm0;)Lnm0;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v0, v1}, Llc2;->θ(I)Lnm0;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v3}, Llc2;->θ(I)Lnm0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v1, v0}, Lnm0;->α(Lnm0;Lnm0;)Lnm0;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v1, p0, Landroidx/core/view/insets/α;->γ:Lnm0;

    .line 38
    .line 39
    invoke-virtual {v2, v1}, Lnm0;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    iget-object v1, p0, Landroidx/core/view/insets/α;->δ:Lnm0;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lnm0;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_2

    .line 52
    .line 53
    :cond_0
    iput-object v2, p0, Landroidx/core/view/insets/α;->γ:Lnm0;

    .line 54
    .line 55
    iput-object v0, p0, Landroidx/core/view/insets/α;->δ:Lnm0;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    add-int/lit8 p0, p0, -0x1

    .line 62
    .line 63
    :goto_0
    if-ltz p0, :cond_2

    .line 64
    .line 65
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, Lyj1;

    .line 70
    .line 71
    iget-object v0, v0, Lyj1;->α:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    add-int/lit8 v1, v1, -0x1

    .line 78
    .line 79
    if-gez v1, :cond_1

    .line 80
    .line 81
    add-int/lit8 p0, p0, -0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    invoke-static {v1, v0}, Llz1;->κ(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    throw p0

    .line 89
    :cond_2
    return-object p2
.end method
