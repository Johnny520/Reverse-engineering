.class public final Lr0/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/a;


# instance fields
.field public final a:Ljava/util/WeakHashMap;

.field public final b:Ljava/util/Set;

.field public final c:Ljava/util/Set;

.field public final d:Ljava/util/Set;

.field public final e:Ljava/util/Set;

.field public final f:Ljava/util/IdentityHashMap;

.field public final g:Ljava/util/IdentityHashMap;

.field public final h:Ljava/util/LinkedHashSet;

.field public final i:Ljava/util/IdentityHashMap;

.field public final j:Ljava/util/IdentityHashMap;

.field public final k:Ljava/util/WeakHashMap;

.field public l:LA0/z;

.field public m:Landroid/content/Context;

.field public n:I

.field public o:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/WeakHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lr0/j0;->a:Ljava/util/WeakHashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lr0/j0;->b:Ljava/util/Set;

    .line 21
    .line 22
    new-instance v0, Ljava/util/WeakHashMap;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lr0/j0;->c:Ljava/util/Set;

    .line 32
    .line 33
    new-instance v0, Ljava/util/WeakHashMap;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lr0/j0;->d:Ljava/util/Set;

    .line 43
    .line 44
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Lr0/j0;->e:Ljava/util/Set;

    .line 54
    .line 55
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Lr0/j0;->f:Ljava/util/IdentityHashMap;

    .line 61
    .line 62
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 63
    .line 64
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, Lr0/j0;->g:Ljava/util/IdentityHashMap;

    .line 68
    .line 69
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 70
    .line 71
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 72
    .line 73
    .line 74
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 75
    .line 76
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, Lr0/j0;->h:Ljava/util/LinkedHashSet;

    .line 80
    .line 81
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 82
    .line 83
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 84
    .line 85
    .line 86
    iput-object v0, p0, Lr0/j0;->i:Ljava/util/IdentityHashMap;

    .line 87
    .line 88
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 89
    .line 90
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 91
    .line 92
    .line 93
    iput-object v0, p0, Lr0/j0;->j:Ljava/util/IdentityHashMap;

    .line 94
    .line 95
    new-instance v0, Ljava/util/WeakHashMap;

    .line 96
    .line 97
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 98
    .line 99
    .line 100
    iput-object v0, p0, Lr0/j0;->k:Ljava/util/WeakHashMap;

    .line 101
    .line 102
    return-void
.end method

.method public static varargs a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 3
    .line 4
    array-length v2, p2

    .line 5
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 6
    .line 7
    .line 8
    array-length v2, p2

    .line 9
    const/4 v3, 0x0

    .line 10
    move v4, v3

    .line 11
    :goto_0
    if-ge v4, v2, :cond_1

    .line 12
    .line 13
    aget-object v5, p2, v4

    .line 14
    .line 15
    if-eqz v5, :cond_0

    .line 16
    .line 17
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    goto :goto_1

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    goto/16 :goto_8

    .line 24
    .line 25
    :cond_0
    const-class v5, Ljava/lang/Object;

    .line 26
    .line 27
    :goto_1
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    add-int/lit8 v4, v4, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    new-array v2, v3, [Ljava/lang/Class;

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, [Ljava/lang/Class;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-string v2, "getMethods(...)"

    .line 50
    .line 51
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    array-length v2, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    move v4, v3

    .line 56
    :goto_2
    const-string v5, "getParameterTypes(...)"

    .line 57
    .line 58
    if-ge v4, v2, :cond_5

    .line 59
    .line 60
    :try_start_1
    aget-object v6, v1, v4

    .line 61
    .line 62
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-static {v7, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-eqz v7, :cond_4

    .line 71
    .line 72
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    array-length v7, v7

    .line 77
    array-length v8, p2

    .line 78
    if-ne v7, v8, :cond_4

    .line 79
    .line 80
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    invoke-static {v7, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v7}, LF0/h;->d0([Ljava/lang/Object;)LR0/c;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    instance-of v8, v7, Ljava/util/Collection;

    .line 92
    .line 93
    if-eqz v8, :cond_2

    .line 94
    .line 95
    move-object v8, v7

    .line 96
    check-cast v8, Ljava/util/Collection;

    .line 97
    .line 98
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    if-eqz v8, :cond_2

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_2
    invoke-virtual {v7}, LR0/a;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    :cond_3
    :goto_3
    move-object v8, v7

    .line 110
    check-cast v8, LR0/b;

    .line 111
    .line 112
    iget-boolean v8, v8, LR0/b;->c:Z

    .line 113
    .line 114
    if-eqz v8, :cond_6

    .line 115
    .line 116
    move-object v8, v7

    .line 117
    check-cast v8, LR0/b;

    .line 118
    .line 119
    invoke-virtual {v8}, LR0/b;->a()I

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    aget-object v9, p2, v8

    .line 124
    .line 125
    if-eqz v9, :cond_3

    .line 126
    .line 127
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-result-object v9

    .line 131
    aget-object v9, v9, v8

    .line 132
    .line 133
    aget-object v8, p2, v8

    .line 134
    .line 135
    invoke-static {v8}, LN0/g;->b(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    invoke-virtual {v9, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    if-eqz v8, :cond_4

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_5
    move-object v6, v0

    .line 153
    :cond_6
    :goto_4
    if-eqz v6, :cond_7

    .line 154
    .line 155
    array-length v1, p2

    .line 156
    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v6, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    if-eqz v1, :cond_7

    .line 165
    .line 166
    goto/16 :goto_9

    .line 167
    .line 168
    :cond_7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    const-string v2, "getDeclaredMethods(...)"

    .line 177
    .line 178
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    array-length v2, v1

    .line 182
    :goto_5
    if-ge v3, v2, :cond_b

    .line 183
    .line 184
    aget-object v4, v1, v3

    .line 185
    .line 186
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    invoke-static {v6, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    if-eqz v6, :cond_a

    .line 195
    .line 196
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    array-length v6, v6

    .line 201
    array-length v7, p2

    .line 202
    if-ne v6, v7, :cond_a

    .line 203
    .line 204
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    invoke-static {v6, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-static {v6}, LF0/h;->d0([Ljava/lang/Object;)LR0/c;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    instance-of v7, v6, Ljava/util/Collection;

    .line 216
    .line 217
    if-eqz v7, :cond_8

    .line 218
    .line 219
    move-object v7, v6

    .line 220
    check-cast v7, Ljava/util/Collection;

    .line 221
    .line 222
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 223
    .line 224
    .line 225
    move-result v7

    .line 226
    if-eqz v7, :cond_8

    .line 227
    .line 228
    goto :goto_7

    .line 229
    :cond_8
    invoke-virtual {v6}, LR0/a;->iterator()Ljava/util/Iterator;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    :cond_9
    :goto_6
    move-object v7, v6

    .line 234
    check-cast v7, LR0/b;

    .line 235
    .line 236
    iget-boolean v7, v7, LR0/b;->c:Z

    .line 237
    .line 238
    if-eqz v7, :cond_c

    .line 239
    .line 240
    move-object v7, v6

    .line 241
    check-cast v7, LR0/b;

    .line 242
    .line 243
    invoke-virtual {v7}, LR0/b;->a()I

    .line 244
    .line 245
    .line 246
    move-result v7

    .line 247
    aget-object v8, p2, v7

    .line 248
    .line 249
    if-eqz v8, :cond_9

    .line 250
    .line 251
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    move-result-object v8

    .line 255
    aget-object v8, v8, v7

    .line 256
    .line 257
    aget-object v7, p2, v7

    .line 258
    .line 259
    invoke-static {v7}, LN0/g;->b(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    move-result-object v7

    .line 266
    invoke-virtual {v8, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 267
    .line 268
    .line 269
    move-result v7

    .line 270
    if-eqz v7, :cond_a

    .line 271
    .line 272
    goto :goto_6

    .line 273
    :cond_a
    add-int/lit8 v3, v3, 0x1

    .line 274
    .line 275
    goto :goto_5

    .line 276
    :cond_b
    move-object v4, v0

    .line 277
    :cond_c
    :goto_7
    if-eqz v4, :cond_d

    .line 278
    .line 279
    const/4 p1, 0x1

    .line 280
    invoke-virtual {v4, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 281
    .line 282
    .line 283
    array-length p1, p2

    .line 284
    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    invoke-virtual {v4, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 292
    goto :goto_9

    .line 293
    :cond_d
    move-object v1, v0

    .line 294
    goto :goto_9

    .line 295
    :goto_8
    new-instance v1, LE0/d;

    .line 296
    .line 297
    invoke-direct {v1, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 298
    .line 299
    .line 300
    :goto_9
    instance-of p0, v1, LE0/d;

    .line 301
    .line 302
    if-eqz p0, :cond_e

    .line 303
    .line 304
    goto :goto_a

    .line 305
    :cond_e
    move-object v0, v1

    .line 306
    :goto_a
    return-object v0
.end method

.method public static b(Ljava/lang/Object;ILjava/util/Set;)Ljava/util/Set;
    .locals 6

    .line 1
    sget-object v0, LF0/u;->a:LF0/u;

    .line 2
    .line 3
    if-eqz p0, :cond_8

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    if-le p1, v1, :cond_0

    .line 7
    .line 8
    goto/16 :goto_3

    .line 9
    .line 10
    :cond_0
    instance-of v1, p0, Ljava/lang/CharSequence;

    .line 11
    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    goto/16 :goto_3

    .line 33
    .line 34
    :cond_1
    invoke-static {p0}, LD/h;->T(Ljava/lang/Object;)Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_2
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_3

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    const-string v3, "java."

    .line 55
    .line 56
    const/4 v4, 0x0

    .line 57
    invoke-static {v2, v4, v3}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-nez v2, :cond_8

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    const-string v3, "android."

    .line 68
    .line 69
    invoke-static {v2, v4, v3}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_4

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_4
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 77
    .line 78
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    const-string v2, "getDeclaredFields(...)"

    .line 86
    .line 87
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    array-length v2, v1

    .line 91
    :goto_0
    if-ge v4, v2, :cond_8

    .line 92
    .line 93
    aget-object v3, v1, v4

    .line 94
    .line 95
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    if-eqz v5, :cond_5

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_5
    const/4 v5, 0x1

    .line 107
    :try_start_0
    invoke-virtual {v3, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    add-int/2addr v5, p1

    .line 115
    invoke-static {v3, v5, p2}, Lr0/j0;->b(Ljava/lang/Object;ILjava/util/Set;)Ljava/util/Set;

    .line 116
    .line 117
    .line 118
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    goto :goto_1

    .line 120
    :catchall_0
    move-exception v3

    .line 121
    new-instance v5, LE0/d;

    .line 122
    .line 123
    invoke-direct {v5, v3}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    move-object v3, v5

    .line 127
    :goto_1
    nop

    .line 128
    instance-of v5, v3, LE0/d;

    .line 129
    .line 130
    if-eqz v5, :cond_6

    .line 131
    .line 132
    const/4 v3, 0x0

    .line 133
    :cond_6
    check-cast v3, Ljava/util/Set;

    .line 134
    .line 135
    if-eqz v3, :cond_7

    .line 136
    .line 137
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 138
    .line 139
    .line 140
    :cond_7
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_8
    :goto_3
    return-object v0
.end method

.method public static final c(Ljava/util/ArrayList;Landroid/view/View;)V
    .locals 4

    .line 1
    instance-of v0, p1, Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-static {v0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    :goto_0
    if-nez v0, :cond_1

    .line 31
    .line 32
    const-string v0, ""

    .line 33
    .line 34
    :cond_1
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_2
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    check-cast p1, Landroid/view/ViewGroup;

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v1, 0x0

    .line 54
    :goto_1
    if-ge v1, v0, :cond_3

    .line 55
    .line 56
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const-string v3, "getChildAt(...)"

    .line 61
    .line 62
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {p0, v2}, Lr0/j0;->c(Ljava/util/ArrayList;Landroid/view/View;)V

    .line 66
    .line 67
    .line 68
    add-int/lit8 v1, v1, 0x1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    return-void
.end method

.method public static e(Landroid/view/View;Ljava/lang/String;)Z
    .locals 5

    .line 1
    invoke-static {p0}, Lr0/j0;->o(Landroid/view/View;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    check-cast p0, Landroid/view/ViewGroup;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    move v2, v1

    .line 24
    :goto_0
    if-ge v2, v0, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const-string v4, "getChildAt(...)"

    .line 31
    .line 32
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v3, p1}, Lr0/j0;->e(Landroid/view/View;Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    :goto_1
    const/4 p0, 0x1

    .line 42
    return p0

    .line 43
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    return v1
.end method

.method public static f(Ljava/util/Set;)Ljava/util/Set;
    .locals 6

    .line 1
    sget-boolean v0, Lz0/i;->a:Z

    .line 2
    .line 3
    invoke-static {}, Lz0/g;->i()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const-string v3, ""

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    if-eqz v2, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    move-object v5, v2

    .line 30
    check-cast v5, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 31
    .line 32
    invoke-virtual {v5}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    if-eqz v5, :cond_1

    .line 37
    .line 38
    invoke-static {v5}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    :cond_1
    if-nez v4, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move-object v3, v4

    .line 50
    :goto_1
    invoke-interface {p0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_0

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    new-instance p0, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_8

    .line 74
    .line 75
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 80
    .line 81
    invoke-virtual {v1}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    if-eqz v2, :cond_4

    .line 86
    .line 87
    invoke-static {v2}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    goto :goto_3

    .line 96
    :cond_4
    move-object v2, v4

    .line 97
    :goto_3
    if-nez v2, :cond_5

    .line 98
    .line 99
    move-object v2, v3

    .line 100
    :cond_5
    invoke-virtual {v1}, Lcom/lu/wxmask/bean/MaskItemBean;->getTagName()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    if-eqz v1, :cond_6

    .line 105
    .line 106
    invoke-static {v1}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    goto :goto_4

    .line 115
    :cond_6
    move-object v1, v4

    .line 116
    :goto_4
    if-nez v1, :cond_7

    .line 117
    .line 118
    move-object v1, v3

    .line 119
    :cond_7
    filled-new-array {v2, v1}, [Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-static {v1}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-static {v1, p0}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_8
    new-instance v0, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    :cond_9
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-eqz v1, :cond_a

    .line 145
    .line 146
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    move-object v2, v1

    .line 151
    check-cast v2, Ljava/lang/String;

    .line 152
    .line 153
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-nez v2, :cond_9

    .line 158
    .line 159
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_a
    invoke-static {v0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    return-object p0
.end method

.method public static g()Ljava/util/Set;
    .locals 5

    .line 1
    const-class v0, Lq0/h;

    .line 2
    .line 3
    invoke-static {v0}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lq0/h;

    .line 8
    .line 9
    invoke-virtual {v1}, Lq0/h;->c()V

    .line 10
    .line 11
    .line 12
    sget-boolean v1, Lz0/i;->a:Z

    .line 13
    .line 14
    invoke-static {}, Lz0/g;->s()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    sget-object v0, LF0/s;->a:LF0/s;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {v0}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lq0/h;

    .line 28
    .line 29
    new-instance v1, Ljava/util/ArrayList;

    .line 30
    .line 31
    iget-object v0, v0, Lq0/h;->a:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 34
    .line 35
    .line 36
    move-object v0, v1

    .line 37
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Ljava/lang/String;

    .line 57
    .line 58
    if-eqz v2, :cond_2

    .line 59
    .line 60
    invoke-static {v2}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    goto :goto_2

    .line 69
    :cond_2
    const/4 v2, 0x0

    .line 70
    :goto_2
    if-eqz v2, :cond_1

    .line 71
    .line 72
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    :cond_4
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_5

    .line 90
    .line 91
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    move-object v3, v2

    .line 96
    check-cast v3, Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-nez v4, :cond_4

    .line 103
    .line 104
    sget-boolean v4, Lz0/i;->a:Z

    .line 105
    .line 106
    invoke-static {v3}, Lz0/g;->e(Ljava/lang/String;)Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-nez v3, :cond_4

    .line 111
    .line 112
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_5
    invoke-static {v0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    return-object v0
.end method

.method public static h(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_9

    .line 3
    .line 4
    const/4 v1, 0x3

    .line 5
    if-le p1, v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_4

    .line 8
    .line 9
    :cond_0
    instance-of v1, p0, Ljava/lang/String;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    move-object p1, p0

    .line 16
    check-cast p1, Ljava/lang/String;

    .line 17
    .line 18
    const-string p2, "wxid_"

    .line 19
    .line 20
    invoke-static {p1, v3, p2}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-nez p2, :cond_2

    .line 25
    .line 26
    const-string p2, "@chatroom"

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-nez p2, :cond_2

    .line 33
    .line 34
    const-string p2, "gh_"

    .line 35
    .line 36
    invoke-static {p1, v3, p2}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-nez p2, :cond_2

    .line 41
    .line 42
    const-string p2, "@openim"

    .line 43
    .line 44
    invoke-static {p1, p2, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move-object p0, v0

    .line 52
    :cond_2
    :goto_0
    check-cast p0, Ljava/lang/String;

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_3
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_4

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    const-string v5, "java."

    .line 71
    .line 72
    invoke-static {v4, v3, v5}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-nez v4, :cond_9

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    const-string v5, "android."

    .line 83
    .line 84
    invoke-static {v4, v3, v5}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-eqz v4, :cond_5

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    const-string v4, "getDeclaredFields(...)"

    .line 96
    .line 97
    invoke-static {v1, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    array-length v4, v1

    .line 101
    :goto_1
    if-ge v3, v4, :cond_9

    .line 102
    .line 103
    aget-object v5, v1, v3

    .line 104
    .line 105
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    if-eqz v6, :cond_6

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_6
    :try_start_0
    invoke-virtual {v5, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    add-int/lit8 v6, p1, 0x1

    .line 124
    .line 125
    invoke-static {v5, v6, p2}, Lr0/j0;->h(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    goto :goto_2

    .line 130
    :catchall_0
    move-exception v5

    .line 131
    new-instance v6, LE0/d;

    .line 132
    .line 133
    invoke-direct {v6, v5}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 134
    .line 135
    .line 136
    move-object v5, v6

    .line 137
    :goto_2
    nop

    .line 138
    instance-of v6, v5, LE0/d;

    .line 139
    .line 140
    if-eqz v6, :cond_7

    .line 141
    .line 142
    move-object v5, v0

    .line 143
    :cond_7
    check-cast v5, Ljava/lang/String;

    .line 144
    .line 145
    if-eqz v5, :cond_8

    .line 146
    .line 147
    return-object v5

    .line 148
    :cond_8
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_9
    :goto_4
    return-object v0
.end method

.method public static synthetic i(Lr0/j0;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    invoke-static {p1, p0, v0}, Lr0/j0;->h(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public static j(Landroid/content/Context;)Landroid/app/Activity;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/16 v1, 0xc

    .line 3
    .line 4
    if-ge v0, v1, :cond_1

    .line 5
    .line 6
    instance-of v1, p0, Landroid/app/Activity;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast p0, Landroid/app/Activity;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    instance-of v1, p0, Landroid/content/ContextWrapper;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    check-cast p0, Landroid/content/ContextWrapper;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public static k(Landroid/view/View;)Landroid/widget/ListView;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Landroid/view/View;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Landroid/view/View;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p0, v1

    .line 14
    :goto_0
    if-eqz p0, :cond_2

    .line 15
    .line 16
    instance-of v0, p0, Landroid/widget/ListView;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    check-cast p0, Landroid/widget/ListView;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    instance-of v0, p0, Landroid/view/View;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    check-cast p0, Landroid/view/View;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    return-object v1
.end method

.method public static l(Landroid/view/View;Ljava/lang/String;)Z
    .locals 5

    .line 1
    instance-of v0, p0, Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    invoke-static {v0, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_1
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    check-cast p0, Landroid/view/ViewGroup;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    move v2, v1

    .line 39
    :goto_1
    if-ge v2, v0, :cond_3

    .line 40
    .line 41
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const-string v4, "getChildAt(...)"

    .line 46
    .line 47
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v3, p1}, Lr0/j0;->l(Landroid/view/View;Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    :goto_2
    const/4 p0, 0x1

    .line 57
    return p0

    .line 58
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    return v1
.end method

.method public static n(Landroid/view/View;)Ljava/lang/Object;
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "getAdapter"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 7
    .line 8
    invoke-interface {v2, p0, v0, v1}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    new-instance v0, LE0/d;

    .line 15
    .line 16
    invoke-direct {v0, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    move-object p0, v0

    .line 20
    :goto_0
    nop

    .line 21
    instance-of v0, p0, LE0/d;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    :cond_0
    return-object p0
.end method

.method public static o(Landroid/view/View;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    return-object v2

    .line 10
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    new-instance v0, LE0/d;

    .line 21
    .line 22
    invoke-direct {v0, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    move-object p0, v0

    .line 26
    :goto_0
    nop

    .line 27
    instance-of v0, p0, LE0/d;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move-object v2, p0

    .line 33
    :goto_1
    check-cast v2, Ljava/lang/String;

    .line 34
    .line 35
    return-object v2
.end method

.method public static t(Landroid/view/View;)Z
    .locals 2

    .line 1
    const-string v0, "mie"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lr0/j0;->e(Landroid/view/View;Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const-string v1, "kbq"

    .line 10
    .line 11
    invoke-static {p0, v1}, Lr0/j0;->e(Landroid/view/View;Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_2

    .line 16
    .line 17
    :cond_0
    invoke-static {p0, v0}, Lr0/j0;->e(Landroid/view/View;Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    const-string v0, "odf"

    .line 24
    .line 25
    invoke-static {p0, v0}, Lr0/j0;->e(Landroid/view/View;Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    :cond_1
    const-string v0, "pzy"

    .line 32
    .line 33
    invoke-static {p0, v0}, Lr0/j0;->e(Landroid/view/View;Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    const-string v0, "n5b"

    .line 40
    .line 41
    invoke-static {p0, v0}, Lr0/j0;->e(Landroid/view/View;Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eqz p0, :cond_3

    .line 46
    .line 47
    :cond_2
    const/4 p0, 0x1

    .line 48
    return p0

    .line 49
    :cond_3
    const/4 p0, 0x0

    .line 50
    return p0
.end method

.method public static x(Landroid/view/View;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    if-eqz p0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "androidx.recyclerview.widget.RecyclerView"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "android.support.v7.widget.RecyclerView"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, ".RecyclerView"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, ".WxRecyclerView"

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    :goto_1
    const/4 p0, 0x1

    .line 62
    return p0

    .line 63
    :cond_2
    const/4 p0, 0x0

    .line 64
    return p0
.end method

.method public static z(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v2, "getParameterTypes(...)"

    .line 18
    .line 19
    invoke-static {p0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v2, Lr0/P;

    .line 23
    .line 24
    const/4 v3, 0x7

    .line 25
    invoke-direct {v2, v3}, Lr0/P;-><init>(I)V

    .line 26
    .line 27
    .line 28
    const/16 v3, 0x1e

    .line 29
    .line 30
    const-string v4, ","

    .line 31
    .line 32
    invoke-static {p0, v4, v2, v3}, LF0/h;->h0([Ljava/lang/Object;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    new-instance v2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v0, "#"

    .line 45
    .line 46
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, "("

    .line 53
    .line 54
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string p0, ")"

    .line 61
    .line 62
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method


# virtual methods
.method public final varargs A([Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Lr0/j0;->n:I

    .line 2
    .line 3
    const/16 v1, 0x50

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    iput v0, p0, Lr0/j0;->n:I

    .line 11
    .line 12
    new-instance v0, Lr0/P;

    .line 13
    .line 14
    const/4 v1, 0x5

    .line 15
    invoke-direct {v0, v1}, Lr0/P;-><init>(I)V

    .line 16
    .line 17
    .line 18
    const/16 v1, 0x1e

    .line 19
    .line 20
    const-string v2, " | "

    .line 21
    .line 22
    invoke-static {p1, v2, v0, v1}, LF0/h;->h0([Ljava/lang/Object;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string v0, "MaskContactSelectProbe(group): "

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final B(Landroid/widget/ListView;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lr0/j0;->e:Ljava/util/Set;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lr0/j0;->i:Ljava/util/IdentityHashMap;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    instance-of v2, p1, Landroid/widget/HeaderViewListAdapter;

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    check-cast p1, Landroid/widget/HeaderViewListAdapter;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Ljava/util/List;

    .line 38
    .line 39
    :cond_1
    :goto_0
    return-void
.end method

.method public final C(Landroid/view/View;)V
    .locals 14

    .line 1
    invoke-static {p1}, Lr0/j0;->k(Landroid/view/View;)Landroid/widget/ListView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_8

    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    goto/16 :goto_8

    .line 16
    .line 17
    :cond_1
    :try_start_0
    invoke-virtual {v0, p1}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    new-instance v2, LE0/d;

    .line 28
    .line 29
    invoke-direct {v2, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    move-object p1, v2

    .line 33
    :goto_0
    const/4 v2, -0x1

    .line 34
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    instance-of v3, p1, LE0/d;

    .line 39
    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    move-object p1, v2

    .line 43
    :cond_2
    check-cast p1, Ljava/lang/Number;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-gez p1, :cond_3

    .line 50
    .line 51
    goto/16 :goto_8

    .line 52
    .line 53
    :cond_3
    iget-object v2, p0, Lr0/j0;->e:Ljava/util/Set;

    .line 54
    .line 55
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    iget-object v3, p0, Lr0/j0;->j:Ljava/util/IdentityHashMap;

    .line 60
    .line 61
    iget-object v4, p0, Lr0/j0;->i:Ljava/util/IdentityHashMap;

    .line 62
    .line 63
    if-eqz v2, :cond_11

    .line 64
    .line 65
    invoke-virtual {v4, v1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Ljava/util/List;

    .line 70
    .line 71
    if-eqz v2, :cond_4

    .line 72
    .line 73
    goto/16 :goto_7

    .line 74
    .line 75
    :cond_4
    invoke-static {}, Lr0/j0;->g()Ljava/util/Set;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-static {v2}, Lr0/j0;->f(Ljava/util/Set;)Ljava/util/Set;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    iget-object v6, p0, Lr0/j0;->g:Ljava/util/IdentityHashMap;

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-virtual {v6, v7}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    check-cast v6, Ljava/lang/reflect/Method;

    .line 94
    .line 95
    const/4 v7, 0x0

    .line 96
    const/4 v8, 0x0

    .line 97
    if-nez v6, :cond_5

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_5
    :try_start_1
    new-array v9, v7, [Ljava/lang/Object;

    .line 101
    .line 102
    invoke-static {v6, v1, v9}, Lde/robv/android/xposed/XposedBridge;->invokeOriginalMethod(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 106
    goto :goto_1

    .line 107
    :catchall_1
    move-exception v6

    .line 108
    new-instance v9, LE0/d;

    .line 109
    .line 110
    invoke-direct {v9, v6}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    move-object v6, v9

    .line 114
    :goto_1
    nop

    .line 115
    instance-of v9, v6, LE0/d;

    .line 116
    .line 117
    if-eqz v9, :cond_6

    .line 118
    .line 119
    move-object v6, v8

    .line 120
    :cond_6
    instance-of v9, v6, Ljava/lang/Integer;

    .line 121
    .line 122
    if-eqz v9, :cond_7

    .line 123
    .line 124
    move-object v8, v6

    .line 125
    check-cast v8, Ljava/lang/Integer;

    .line 126
    .line 127
    :cond_7
    :goto_2
    if-eqz v8, :cond_10

    .line 128
    .line 129
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    new-instance v8, Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3, v1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v9

    .line 142
    check-cast v9, Ljava/util/Set;

    .line 143
    .line 144
    if-nez v9, :cond_8

    .line 145
    .line 146
    sget-object v9, LF0/u;->a:LF0/u;

    .line 147
    .line 148
    :cond_8
    move v10, v7

    .line 149
    :goto_3
    if-ge v10, v6, :cond_f

    .line 150
    .line 151
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object v11

    .line 155
    invoke-interface {v9, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v11

    .line 159
    if-eqz v11, :cond_9

    .line 160
    .line 161
    goto :goto_6

    .line 162
    :cond_9
    invoke-virtual {p0, v1, v10}, Lr0/j0;->s(Landroid/widget/ListAdapter;I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v11

    .line 166
    invoke-static {p0, v11}, Lr0/j0;->i(Lr0/j0;Ljava/lang/Object;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v12

    .line 170
    if-eqz v12, :cond_b

    .line 171
    .line 172
    invoke-static {v12}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 173
    .line 174
    .line 175
    move-result v13

    .line 176
    if-eqz v13, :cond_a

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_a
    invoke-interface {v2, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v12

    .line 183
    if-eqz v12, :cond_b

    .line 184
    .line 185
    goto :goto_6

    .line 186
    :cond_b
    :goto_4
    new-instance v12, Ljava/util/IdentityHashMap;

    .line 187
    .line 188
    invoke-direct {v12}, Ljava/util/IdentityHashMap;-><init>()V

    .line 189
    .line 190
    .line 191
    invoke-static {v12}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 192
    .line 193
    .line 194
    move-result-object v12

    .line 195
    invoke-static {v11, v7, v12}, Lr0/j0;->b(Ljava/lang/Object;ILjava/util/Set;)Ljava/util/Set;

    .line 196
    .line 197
    .line 198
    move-result-object v11

    .line 199
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 200
    .line 201
    .line 202
    move-result v12

    .line 203
    if-eqz v12, :cond_c

    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_c
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 207
    .line 208
    .line 209
    move-result-object v11

    .line 210
    :cond_d
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result v12

    .line 214
    if-eqz v12, :cond_e

    .line 215
    .line 216
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v12

    .line 220
    check-cast v12, Ljava/lang/String;

    .line 221
    .line 222
    invoke-interface {v5, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v12

    .line 226
    if-eqz v12, :cond_d

    .line 227
    .line 228
    goto :goto_6

    .line 229
    :cond_e
    :goto_5
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 230
    .line 231
    .line 232
    move-result-object v11

    .line 233
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    :goto_6
    add-int/lit8 v10, v10, 0x1

    .line 237
    .line 238
    goto :goto_3

    .line 239
    :cond_f
    invoke-virtual {v4, v1, v8}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-object v2, v8

    .line 243
    goto :goto_7

    .line 244
    :cond_10
    sget-object v2, LF0/s;->a:LF0/s;

    .line 245
    .line 246
    :goto_7
    invoke-static {v2, p1}, LF0/k;->k0(Ljava/util/List;I)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    check-cast v2, Ljava/lang/Integer;

    .line 251
    .line 252
    if-eqz v2, :cond_11

    .line 253
    .line 254
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 255
    .line 256
    .line 257
    move-result p1

    .line 258
    :cond_11
    invoke-virtual {v3, v1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    if-nez v2, :cond_12

    .line 263
    .line 264
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 265
    .line 266
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v3, v1, v2}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    :cond_12
    check-cast v2, Ljava/util/Set;

    .line 273
    .line 274
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    invoke-interface {v2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result p1

    .line 282
    if-eqz p1, :cond_13

    .line 283
    .line 284
    invoke-virtual {v4, v1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    :try_start_2
    new-instance p1, Landroidx/activity/b;

    .line 288
    .line 289
    const/4 v1, 0x6

    .line 290
    invoke-direct {p1, v1, v0}, Landroidx/activity/b;-><init>(ILjava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 294
    .line 295
    .line 296
    :catchall_2
    :cond_13
    :goto_8
    return-void
.end method

.method public final D(Landroid/view/View;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lr0/j0;->a:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lr0/h0;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x1

    .line 18
    iget v4, v0, Lr0/h0;->a:I

    .line 19
    .line 20
    if-eq v2, v4, :cond_1

    .line 21
    .line 22
    move v2, v3

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move v2, v1

    .line 25
    :goto_0
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    if-eqz v4, :cond_5

    .line 33
    .line 34
    iget-object v5, v0, Lr0/h0;->b:Ljava/lang/Integer;

    .line 35
    .line 36
    if-eqz v5, :cond_2

    .line 37
    .line 38
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    iget v6, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 43
    .line 44
    if-eq v6, v5, :cond_2

    .line 45
    .line 46
    iput v5, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 47
    .line 48
    move v1, v3

    .line 49
    :cond_2
    iget-object v0, v0, Lr0/h0;->c:Ljava/lang/Integer;

    .line 50
    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iget v5, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 58
    .line 59
    if-eq v5, v0, :cond_3

    .line 60
    .line 61
    iput v0, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 62
    .line 63
    move v1, v3

    .line 64
    :cond_3
    if-eqz v1, :cond_4

    .line 65
    .line 66
    invoke-virtual {p1, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_4
    move v3, v2

    .line 71
    :goto_1
    move v2, v3

    .line 72
    :cond_5
    if-eqz v2, :cond_6

    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 75
    .line 76
    .line 77
    :cond_6
    return v2
.end method

.method public final E(Landroid/view/View;)Z
    .locals 13

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p1}, Lr0/j0;->k(Landroid/view/View;)Landroid/widget/ListView;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    move-object v4, p1

    .line 10
    goto :goto_3

    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    instance-of v4, v3, Landroid/view/View;

    .line 16
    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    check-cast v3, Landroid/view/View;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move-object v3, v2

    .line 23
    :goto_0
    move-object v4, p1

    .line 24
    :goto_1
    if-eqz v3, :cond_3

    .line 25
    .line 26
    if-eq v3, v1, :cond_3

    .line 27
    .line 28
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    instance-of v5, v4, Landroid/view/View;

    .line 33
    .line 34
    if-eqz v5, :cond_2

    .line 35
    .line 36
    check-cast v4, Landroid/view/View;

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    move-object v4, v2

    .line 40
    :goto_2
    move-object v12, v4

    .line 41
    move-object v4, v3

    .line 42
    move-object v3, v12

    .line 43
    goto :goto_1

    .line 44
    :cond_3
    :goto_3
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {p0, v1}, Lr0/j0;->w(Landroid/view/View;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_4

    .line 53
    .line 54
    invoke-virtual {p0, v4}, Lr0/j0;->D(Landroid/view/View;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    return p1

    .line 59
    :cond_4
    invoke-static {p1}, Lr0/j0;->t(Landroid/view/View;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-nez v1, :cond_5

    .line 64
    .line 65
    invoke-virtual {p0, v4}, Lr0/j0;->D(Landroid/view/View;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    return p1

    .line 70
    :cond_5
    sget-boolean v1, Lz0/i;->a:Z

    .line 71
    .line 72
    invoke-static {}, Lz0/g;->x()Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_6

    .line 77
    .line 78
    invoke-virtual {p0, v4}, Lr0/j0;->D(Landroid/view/View;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    return p1

    .line 83
    :cond_6
    invoke-static {}, Lr0/j0;->g()Ljava/util/Set;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_7

    .line 92
    .line 93
    invoke-virtual {p0, v4}, Lr0/j0;->D(Landroid/view/View;)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    return p1

    .line 98
    :cond_7
    invoke-virtual {p0, p1}, Lr0/j0;->m(Landroid/view/View;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    if-eqz v3, :cond_8

    .line 103
    .line 104
    :goto_4
    move-object v2, v3

    .line 105
    goto/16 :goto_17

    .line 106
    .line 107
    :cond_8
    invoke-static {p1}, Lr0/j0;->k(Landroid/view/View;)Landroid/widget/ListView;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    if-eqz v3, :cond_d

    .line 112
    .line 113
    invoke-virtual {v3, p1}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-ltz v5, :cond_d

    .line 118
    .line 119
    if-gez v5, :cond_9

    .line 120
    .line 121
    :goto_5
    move-object v6, v2

    .line 122
    goto :goto_7

    .line 123
    :cond_9
    invoke-virtual {v3}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    if-nez v3, :cond_a

    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_a
    invoke-virtual {p0, v3, v5}, Lr0/j0;->s(Landroid/widget/ListAdapter;I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    if-nez v6, :cond_c

    .line 135
    .line 136
    :try_start_0
    invoke-interface {v3, v5}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    goto :goto_6

    .line 141
    :catchall_0
    move-exception v3

    .line 142
    new-instance v5, LE0/d;

    .line 143
    .line 144
    invoke-direct {v5, v3}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    move-object v3, v5

    .line 148
    :goto_6
    nop

    .line 149
    instance-of v5, v3, LE0/d;

    .line 150
    .line 151
    if-eqz v5, :cond_b

    .line 152
    .line 153
    goto :goto_5

    .line 154
    :cond_b
    move-object v6, v3

    .line 155
    :cond_c
    :goto_7
    invoke-static {p0, v6}, Lr0/j0;->i(Lr0/j0;Ljava/lang/Object;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    if-eqz v3, :cond_d

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_d
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    instance-of v5, v3, Landroid/view/View;

    .line 167
    .line 168
    if-eqz v5, :cond_e

    .line 169
    .line 170
    check-cast v3, Landroid/view/View;

    .line 171
    .line 172
    goto :goto_8

    .line 173
    :cond_e
    move-object v3, v2

    .line 174
    :goto_8
    if-eqz v3, :cond_10

    .line 175
    .line 176
    invoke-static {v3}, Lr0/j0;->x(Landroid/view/View;)Z

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    if-eqz v5, :cond_f

    .line 181
    .line 182
    goto :goto_9

    .line 183
    :cond_f
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    instance-of v5, v3, Landroid/view/View;

    .line 188
    .line 189
    if-eqz v5, :cond_e

    .line 190
    .line 191
    check-cast v3, Landroid/view/View;

    .line 192
    .line 193
    goto :goto_8

    .line 194
    :cond_10
    move-object v3, v2

    .line 195
    :goto_9
    if-nez v3, :cond_11

    .line 196
    .line 197
    goto/16 :goto_17

    .line 198
    .line 199
    :cond_11
    const-string v5, "getChildAdapterPosition"

    .line 200
    .line 201
    const-string v6, "getChildLayoutPosition"

    .line 202
    .line 203
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    const/4 v6, 0x0

    .line 208
    move v7, v6

    .line 209
    :goto_a
    const/4 v8, 0x2

    .line 210
    if-ge v7, v8, :cond_14

    .line 211
    .line 212
    aget-object v8, v5, v7

    .line 213
    .line 214
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v9

    .line 218
    invoke-static {v3, v8, v9}, Lr0/j0;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v8

    .line 222
    instance-of v9, v8, Ljava/lang/Number;

    .line 223
    .line 224
    if-eqz v9, :cond_12

    .line 225
    .line 226
    check-cast v8, Ljava/lang/Number;

    .line 227
    .line 228
    goto :goto_b

    .line 229
    :cond_12
    move-object v8, v2

    .line 230
    :goto_b
    if-eqz v8, :cond_13

    .line 231
    .line 232
    goto :goto_e

    .line 233
    :cond_13
    add-int/2addr v7, v0

    .line 234
    goto :goto_a

    .line 235
    :cond_14
    const-string v5, "findContainingViewHolder"

    .line 236
    .line 237
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v7

    .line 241
    invoke-static {v3, v5, v7}, Lr0/j0;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v5

    .line 245
    if-nez v5, :cond_16

    .line 246
    .line 247
    const-string v5, "getChildViewHolder"

    .line 248
    .line 249
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v7

    .line 253
    invoke-static {v3, v5, v7}, Lr0/j0;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v5

    .line 257
    if-nez v5, :cond_16

    .line 258
    .line 259
    :cond_15
    move-object v8, v2

    .line 260
    goto :goto_e

    .line 261
    :cond_16
    const-string v7, "getBindingAdapterPosition"

    .line 262
    .line 263
    const-string v8, "getAbsoluteAdapterPosition"

    .line 264
    .line 265
    const-string v9, "getAdapterPosition"

    .line 266
    .line 267
    const-string v10, "getLayoutPosition"

    .line 268
    .line 269
    filled-new-array {v7, v8, v9, v10}, [Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    move v8, v6

    .line 274
    :goto_c
    const/4 v9, 0x4

    .line 275
    if-ge v8, v9, :cond_15

    .line 276
    .line 277
    aget-object v9, v7, v8

    .line 278
    .line 279
    new-array v10, v6, [Ljava/lang/Object;

    .line 280
    .line 281
    invoke-static {v5, v9, v10}, Lr0/j0;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v9

    .line 285
    instance-of v10, v9, Ljava/lang/Number;

    .line 286
    .line 287
    if-eqz v10, :cond_17

    .line 288
    .line 289
    check-cast v9, Ljava/lang/Number;

    .line 290
    .line 291
    goto :goto_d

    .line 292
    :cond_17
    move-object v9, v2

    .line 293
    :goto_d
    if-eqz v9, :cond_18

    .line 294
    .line 295
    move-object v8, v9

    .line 296
    goto :goto_e

    .line 297
    :cond_18
    add-int/2addr v8, v0

    .line 298
    goto :goto_c

    .line 299
    :goto_e
    if-nez v8, :cond_19

    .line 300
    .line 301
    goto/16 :goto_17

    .line 302
    .line 303
    :cond_19
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 304
    .line 305
    .line 306
    move-result v5

    .line 307
    if-gez v5, :cond_1b

    .line 308
    .line 309
    :cond_1a
    :goto_f
    move-object v9, v2

    .line 310
    goto/16 :goto_16

    .line 311
    .line 312
    :cond_1b
    invoke-static {v3}, Lr0/j0;->n(Landroid/view/View;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    if-nez v3, :cond_1c

    .line 317
    .line 318
    goto :goto_f

    .line 319
    :cond_1c
    const-string v7, "getItemAt"

    .line 320
    .line 321
    const-string v8, "getItemByPosition"

    .line 322
    .line 323
    const-string v9, "getItem"

    .line 324
    .line 325
    filled-new-array {v9, v7, v8}, [Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v7

    .line 329
    move v8, v6

    .line 330
    :goto_10
    const/4 v9, 0x3

    .line 331
    if-ge v8, v9, :cond_1f

    .line 332
    .line 333
    aget-object v9, v7, v8

    .line 334
    .line 335
    :try_start_1
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 336
    .line 337
    .line 338
    move-result-object v10

    .line 339
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v10

    .line 343
    sget-object v11, Lc0/f;->b:Ld0/b;

    .line 344
    .line 345
    invoke-interface {v11, v3, v9, v10}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 349
    goto :goto_11

    .line 350
    :catchall_1
    move-exception v9

    .line 351
    new-instance v10, LE0/d;

    .line 352
    .line 353
    invoke-direct {v10, v9}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 354
    .line 355
    .line 356
    move-object v9, v10

    .line 357
    :goto_11
    nop

    .line 358
    instance-of v10, v9, LE0/d;

    .line 359
    .line 360
    if-eqz v10, :cond_1d

    .line 361
    .line 362
    move-object v9, v2

    .line 363
    :cond_1d
    if-eqz v9, :cond_1e

    .line 364
    .line 365
    goto :goto_16

    .line 366
    :cond_1e
    add-int/2addr v8, v0

    .line 367
    goto :goto_10

    .line 368
    :cond_1f
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    move-result-object v7

    .line 372
    invoke-virtual {v7}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 373
    .line 374
    .line 375
    move-result-object v7

    .line 376
    const-string v8, "getDeclaredFields(...)"

    .line 377
    .line 378
    invoke-static {v7, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    array-length v8, v7

    .line 382
    :goto_12
    if-ge v6, v8, :cond_1a

    .line 383
    .line 384
    aget-object v9, v7, v6

    .line 385
    .line 386
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 387
    .line 388
    .line 389
    move-result v10

    .line 390
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 391
    .line 392
    .line 393
    move-result v10

    .line 394
    if-eqz v10, :cond_20

    .line 395
    .line 396
    goto :goto_15

    .line 397
    :cond_20
    :try_start_2
    invoke-virtual {v9, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v9, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v9

    .line 404
    instance-of v10, v9, Ljava/util/List;

    .line 405
    .line 406
    if-eqz v10, :cond_21

    .line 407
    .line 408
    move-object v10, v9

    .line 409
    check-cast v10, Ljava/util/List;

    .line 410
    .line 411
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 412
    .line 413
    .line 414
    move-result v10

    .line 415
    if-ge v5, v10, :cond_21

    .line 416
    .line 417
    check-cast v9, Ljava/util/List;

    .line 418
    .line 419
    invoke-interface {v9, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 423
    goto :goto_14

    .line 424
    :catchall_2
    move-exception v9

    .line 425
    goto :goto_13

    .line 426
    :cond_21
    move-object v9, v2

    .line 427
    goto :goto_14

    .line 428
    :goto_13
    new-instance v10, LE0/d;

    .line 429
    .line 430
    invoke-direct {v10, v9}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 431
    .line 432
    .line 433
    move-object v9, v10

    .line 434
    :goto_14
    nop

    .line 435
    instance-of v10, v9, LE0/d;

    .line 436
    .line 437
    if-eqz v10, :cond_22

    .line 438
    .line 439
    move-object v9, v2

    .line 440
    :cond_22
    if-eqz v9, :cond_23

    .line 441
    .line 442
    goto :goto_16

    .line 443
    :cond_23
    :goto_15
    add-int/2addr v6, v0

    .line 444
    goto :goto_12

    .line 445
    :goto_16
    if-nez v9, :cond_24

    .line 446
    .line 447
    goto :goto_17

    .line 448
    :cond_24
    invoke-static {p0, v9}, Lr0/j0;->i(Lr0/j0;Ljava/lang/Object;)Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v2

    .line 452
    :goto_17
    if-eqz v2, :cond_26

    .line 453
    .line 454
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 455
    .line 456
    .line 457
    move-result v0

    .line 458
    if-eqz v0, :cond_25

    .line 459
    .line 460
    goto :goto_18

    .line 461
    :cond_25
    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    move-result v0

    .line 465
    if-eqz v0, :cond_26

    .line 466
    .line 467
    invoke-virtual {p0, p1}, Lr0/j0;->C(Landroid/view/View;)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {p0, v4}, Lr0/j0;->p(Landroid/view/View;)Z

    .line 471
    .line 472
    .line 473
    move-result p1

    .line 474
    return p1

    .line 475
    :cond_26
    :goto_18
    invoke-static {v1}, Lr0/j0;->f(Ljava/util/Set;)Ljava/util/Set;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    new-instance v1, Ljava/util/ArrayList;

    .line 480
    .line 481
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 482
    .line 483
    .line 484
    invoke-static {v1, p1}, Lr0/j0;->c(Ljava/util/ArrayList;Landroid/view/View;)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 488
    .line 489
    .line 490
    move-result v2

    .line 491
    if-eqz v2, :cond_27

    .line 492
    .line 493
    goto :goto_19

    .line 494
    :cond_27
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    :cond_28
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 499
    .line 500
    .line 501
    move-result v2

    .line 502
    if-eqz v2, :cond_29

    .line 503
    .line 504
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v2

    .line 508
    check-cast v2, Ljava/lang/String;

    .line 509
    .line 510
    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    move-result v2

    .line 514
    if-eqz v2, :cond_28

    .line 515
    .line 516
    invoke-virtual {p0, p1}, Lr0/j0;->C(Landroid/view/View;)V

    .line 517
    .line 518
    .line 519
    invoke-virtual {p0, v4}, Lr0/j0;->p(Landroid/view/View;)Z

    .line 520
    .line 521
    .line 522
    move-result p1

    .line 523
    goto :goto_1a

    .line 524
    :cond_29
    :goto_19
    invoke-virtual {p0, v4}, Lr0/j0;->D(Landroid/view/View;)Z

    .line 525
    .line 526
    .line 527
    move-result p1

    .line 528
    :goto_1a
    return p1
.end method

.method public final F(Landroid/view/View;)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Landroid/widget/ListView;

    .line 5
    .line 6
    iget-object v1, p0, Lr0/j0;->k:Ljava/util/WeakHashMap;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    move-object v0, p1

    .line 11
    check-cast v0, Landroid/widget/ListView;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lr0/j0;->u(Landroid/widget/ListView;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-object v2, p0, Lr0/j0;->d:Ljava/util/Set;

    .line 20
    .line 21
    invoke-interface {v2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v1, p1, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0}, Lr0/j0;->G(Landroid/widget/ListView;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    invoke-virtual {p0, p1}, Lr0/j0;->v(Landroid/view/View;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    iget-object v0, p0, Lr0/j0;->c:Ljava/util/Set;

    .line 46
    .line 47
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v1, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    invoke-static {p1}, Lr0/j0;->n(Landroid/view/View;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {p0, v0}, Lr0/j0;->q(Ljava/lang/Class;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-virtual {p0, p1}, Lr0/j0;->H(Landroid/view/View;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_3
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 79
    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    check-cast p1, Landroid/view/ViewGroup;

    .line 83
    .line 84
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    const/4 v1, 0x0

    .line 89
    :goto_0
    if-ge v1, v0, :cond_4

    .line 90
    .line 91
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {p0, v2}, Lr0/j0;->F(Landroid/view/View;)V

    .line 96
    .line 97
    .line 98
    add-int/lit8 v1, v1, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_4
    :goto_1
    return-void
.end method

.method public final G(Landroid/widget/ListView;)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lr0/j0;->B(Landroid/widget/ListView;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, "getChildAt(...)"

    .line 16
    .line 17
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v2}, Lr0/j0;->E(Landroid/view/View;)Z

    .line 21
    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public final H(Landroid/view/View;)V
    .locals 4

    .line 1
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    check-cast p1, Landroid/view/ViewGroup;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "getChildAt(...)"

    .line 20
    .line 21
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v2}, Lr0/j0;->E(Landroid/view/View;)Z

    .line 25
    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    :goto_1
    return-void
.end method

.method public final d(Landroid/view/ViewGroup;)Z
    .locals 7

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, Lr0/j0;->k:Ljava/util/WeakHashMap;

    .line 6
    .line 7
    invoke-virtual {v2, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    check-cast v3, Ljava/lang/Long;

    .line 12
    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-wide/16 v3, 0x0

    .line 21
    .line 22
    :goto_0
    sub-long v3, v0, v3

    .line 23
    .line 24
    const-wide/16 v5, 0x78

    .line 25
    .line 26
    cmp-long v3, v3, v5

    .line 27
    .line 28
    if-gez v3, :cond_1

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    return p1

    .line 32
    :cond_1
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v2, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    return p1
.end method

.method public final handleHook(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x6

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    move-object v2, p1

    .line 10
    :cond_0
    iput-object v2, p0, Lr0/j0;->m:Landroid/content/Context;

    .line 11
    .line 12
    invoke-static {p1}, LA0/l;->g(Landroid/content/Context;)LA0/z;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iput-object v2, p0, Lr0/j0;->l:LA0/z;

    .line 17
    .line 18
    sget-object v2, LA0/y;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 19
    .line 20
    new-instance v3, LA0/u;

    .line 21
    .line 22
    new-instance v6, Lr0/P;

    .line 23
    .line 24
    invoke-direct {v6, v1}, Lr0/P;-><init>(I)V

    .line 25
    .line 26
    .line 27
    new-instance v7, LA0/h;

    .line 28
    .line 29
    const/16 v2, 0xe

    .line 30
    .line 31
    invoke-direct {v7, p1, v2}, LA0/h;-><init>(Landroid/content/Context;I)V

    .line 32
    .line 33
    .line 34
    new-instance v8, LC/d;

    .line 35
    .line 36
    const/4 v2, 0x2

    .line 37
    invoke-direct {v8, v2, p0}, LC/d;-><init>(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    new-instance v9, LA0/a;

    .line 41
    .line 42
    const/16 v2, 0x10

    .line 43
    .line 44
    invoke-direct {v9, v2}, LA0/a;-><init>(I)V

    .line 45
    .line 46
    .line 47
    const-string v4, "group-create-contact"

    .line 48
    .line 49
    const-string v5, "\u9009\u62e9\u8054\u7cfb\u4eba\u5bc6\u53cb\u9690\u85cf"

    .line 50
    .line 51
    invoke-direct/range {v3 .. v9}, LA0/u;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;LM0/l;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p1, v3}, LA0/y;->c(Landroid/content/Context;LA0/u;)V

    .line 55
    .line 56
    .line 57
    const-class p1, Landroid/widget/ListAdapter;

    .line 58
    .line 59
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 64
    .line 65
    const-class v3, Landroid/widget/ListView;

    .line 66
    .line 67
    const-string v4, "setAdapter"

    .line 68
    .line 69
    invoke-interface {v2, v3, v4, p1}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-eqz p1, :cond_1

    .line 74
    .line 75
    new-instance v2, Lr0/i0;

    .line 76
    .line 77
    const/4 v3, 0x3

    .line 78
    invoke-direct {v2, p0, v3}, Lr0/i0;-><init>(Lr0/j0;I)V

    .line 79
    .line 80
    .line 81
    invoke-static {p1, v2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 82
    .line 83
    .line 84
    :cond_1
    iget-object p1, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 85
    .line 86
    const-string v2, "classLoader"

    .line 87
    .line 88
    invoke-static {p1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 92
    .line 93
    const-string v5, "androidx.recyclerview.widget.RecyclerView"

    .line 94
    .line 95
    invoke-interface {v3, p1, v5}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    const-string v3, "android.support.v7.widget.RecyclerView"

    .line 100
    .line 101
    if-nez p1, :cond_2

    .line 102
    .line 103
    iget-object p1, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 104
    .line 105
    invoke-static {p1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    sget-object v6, Lc0/f;->b:Ld0/b;

    .line 109
    .line 110
    invoke-interface {v6, p1, v3}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-nez p1, :cond_2

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_2
    iget-object v6, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 118
    .line 119
    invoke-static {v6, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 123
    .line 124
    const-string v8, "androidx.recyclerview.widget.RecyclerView$Adapter"

    .line 125
    .line 126
    invoke-interface {v7, v6, v8}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    if-nez v6, :cond_3

    .line 131
    .line 132
    iget-object v6, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 133
    .line 134
    invoke-static {v6, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 138
    .line 139
    const-string v8, "android.support.v7.widget.RecyclerView$Adapter"

    .line 140
    .line 141
    invoke-interface {v7, v6, v8}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    if-nez v6, :cond_3

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_3
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 153
    .line 154
    invoke-interface {v7, p1, v4, v6}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    if-eqz p1, :cond_4

    .line 159
    .line 160
    new-instance v4, Lr0/i0;

    .line 161
    .line 162
    invoke-direct {v4, p0, v1}, Lr0/i0;-><init>(Lr0/j0;I)V

    .line 163
    .line 164
    .line 165
    invoke-static {p1, v4}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 166
    .line 167
    .line 168
    :cond_4
    :goto_0
    iget-object p1, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 169
    .line 170
    invoke-static {p1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    sget-object v1, Lc0/f;->b:Ld0/b;

    .line 174
    .line 175
    invoke-interface {v1, p1, v5}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    const-string v1, "dispatchDraw"

    .line 180
    .line 181
    const-class v4, Landroid/graphics/Canvas;

    .line 182
    .line 183
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 184
    .line 185
    if-nez p1, :cond_5

    .line 186
    .line 187
    iget-object p1, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 188
    .line 189
    invoke-static {p1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    sget-object p2, Lc0/f;->b:Ld0/b;

    .line 193
    .line 194
    invoke-interface {p2, p1, v3}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    if-nez p1, :cond_5

    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_5
    new-instance p2, Lr0/i0;

    .line 202
    .line 203
    const/4 v2, 0x5

    .line 204
    invoke-direct {p2, p0, v2}, Lr0/i0;-><init>(Lr0/j0;I)V

    .line 205
    .line 206
    .line 207
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 208
    .line 209
    filled-new-array {v5, v2, v2, v2, v2}, [Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 214
    .line 215
    const-string v6, "onLayout"

    .line 216
    .line 217
    invoke-interface {v3, p1, v6, v2}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    if-eqz v2, :cond_6

    .line 222
    .line 223
    invoke-static {v2, p2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 224
    .line 225
    .line 226
    :cond_6
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 231
    .line 232
    invoke-interface {v3, p1, v1, v2}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    if-eqz p1, :cond_7

    .line 237
    .line 238
    invoke-static {p1, p2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 239
    .line 240
    .line 241
    :cond_7
    :goto_1
    const-string p1, "startActivityForResult"

    .line 242
    .line 243
    const-string p2, "startActivity"

    .line 244
    .line 245
    const-string v2, "startActivities"

    .line 246
    .line 247
    filled-new-array {p2, v2, p1}, [Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    const-class v3, Landroid/app/Activity;

    .line 252
    .line 253
    invoke-virtual {p0, v3, p1}, Lr0/j0;->r(Ljava/lang/Class;[Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    const-class p1, Landroid/content/ContextWrapper;

    .line 257
    .line 258
    filled-new-array {p2, v2}, [Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p2

    .line 262
    invoke-virtual {p0, p1, p2}, Lr0/j0;->r(Ljava/lang/Class;[Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    new-array p1, v0, [Ljava/lang/Object;

    .line 266
    .line 267
    sget-object p2, Lc0/f;->b:Ld0/b;

    .line 268
    .line 269
    const-string v2, "onResume"

    .line 270
    .line 271
    invoke-interface {p2, v3, v2, p1}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    if-eqz p1, :cond_8

    .line 276
    .line 277
    new-instance p2, Lr0/i0;

    .line 278
    .line 279
    const/4 v2, 0x4

    .line 280
    invoke-direct {p2, p0, v2}, Lr0/i0;-><init>(Lr0/j0;I)V

    .line 281
    .line 282
    .line 283
    invoke-static {p1, p2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 284
    .line 285
    .line 286
    :cond_8
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    sget-object p2, Lc0/f;->b:Ld0/b;

    .line 291
    .line 292
    const-string v2, "onWindowFocusChanged"

    .line 293
    .line 294
    invoke-interface {p2, v3, v2, p1}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    if-eqz p1, :cond_9

    .line 299
    .line 300
    new-instance p2, Lr0/i0;

    .line 301
    .line 302
    invoke-direct {p2, p0, v0}, Lr0/i0;-><init>(Lr0/j0;I)V

    .line 303
    .line 304
    .line 305
    invoke-static {p1, p2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 306
    .line 307
    .line 308
    :cond_9
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    sget-object p2, Lc0/f;->b:Ld0/b;

    .line 313
    .line 314
    const-class v0, Landroid/view/ViewGroup;

    .line 315
    .line 316
    invoke-interface {p2, v0, v1, p1}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 317
    .line 318
    .line 319
    move-result-object p1

    .line 320
    if-eqz p1, :cond_a

    .line 321
    .line 322
    new-instance p2, Lr0/i0;

    .line 323
    .line 324
    const/4 v0, 0x7

    .line 325
    invoke-direct {p2, p0, v0}, Lr0/i0;-><init>(Lr0/j0;I)V

    .line 326
    .line 327
    .line 328
    invoke-static {p1, p2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 329
    .line 330
    .line 331
    :cond_a
    return-void
.end method

.method public final m(Landroid/view/View;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, v0}, Lr0/j0;->i(Lr0/j0;Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    check-cast p1, Landroid/view/ViewGroup;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    :goto_0
    if-ge v1, v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v3, "getChildAt(...)"

    .line 30
    .line 31
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v2}, Lr0/j0;->m(Landroid/view/View;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    return-object v2

    .line 41
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 p1, 0x0

    .line 45
    return-object p1
.end method

.method public final p(Landroid/view/View;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lr0/j0;->a:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/16 v2, 0x8

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    return v3

    .line 19
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_3

    .line 24
    .line 25
    new-instance v1, Lr0/h0;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const/4 v6, 0x0

    .line 36
    if-eqz v5, :cond_1

    .line 37
    .line 38
    iget v5, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 39
    .line 40
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move-object v5, v6

    .line 46
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    if-eqz v7, :cond_2

    .line 51
    .line 52
    iget v6, v7, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 53
    .line 54
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    :cond_2
    invoke-direct {v1, v4, v5, v6}, Lr0/h0;-><init>(ILjava/lang/Integer;Ljava/lang/Integer;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    const/4 v1, 0x1

    .line 69
    if-eq v0, v2, :cond_4

    .line 70
    .line 71
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 72
    .line 73
    .line 74
    move v0, v1

    .line 75
    goto :goto_1

    .line 76
    :cond_4
    move v0, v3

    .line 77
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    if-eqz v2, :cond_8

    .line 82
    .line 83
    iget v4, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 84
    .line 85
    if-eqz v4, :cond_5

    .line 86
    .line 87
    iput v3, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 88
    .line 89
    move v0, v1

    .line 90
    :cond_5
    iget v4, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 91
    .line 92
    if-eqz v4, :cond_6

    .line 93
    .line 94
    iput v3, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_6
    move v1, v0

    .line 98
    :goto_2
    if-eqz v1, :cond_7

    .line 99
    .line 100
    invoke-virtual {p1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 101
    .line 102
    .line 103
    :cond_7
    move v0, v1

    .line 104
    :cond_8
    if-eqz v0, :cond_9

    .line 105
    .line 106
    invoke-virtual {p1, v3}, Landroid/view/View;->setMinimumHeight(I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 110
    .line 111
    .line 112
    :cond_9
    return v0
.end method

.method public final q(Ljava/lang/Class;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lr0/j0;->b:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v0, "getMethods(...)"

    .line 15
    .line 16
    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    array-length v1, p1

    .line 25
    const/4 v2, 0x0

    .line 26
    :goto_0
    if-ge v2, v1, :cond_2

    .line 27
    .line 28
    aget-object v3, p1, v2

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    const-string v5, "onBindViewHolder"

    .line 35
    .line 36
    invoke-static {v4, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_1

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    array-length v4, v4

    .line 47
    const/4 v5, 0x2

    .line 48
    if-lt v4, v5, :cond_1

    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    const/4 v5, 0x1

    .line 55
    aget-object v4, v4, v5

    .line 56
    .line 57
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 58
    .line 59
    invoke-static {v4, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_1

    .line 64
    .line 65
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_3

    .line 80
    .line 81
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Ljava/lang/reflect/Method;

    .line 86
    .line 87
    new-instance v1, Lr0/i0;

    .line 88
    .line 89
    const/4 v2, 0x1

    .line 90
    invoke-direct {v1, p0, v2}, Lr0/i0;-><init>(Lr0/j0;I)V

    .line 91
    .line 92
    .line 93
    invoke-static {v0, v1}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    :goto_2
    return-void
.end method

.method public final varargs r(Ljava/lang/Class;[Ljava/lang/String;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getMethods(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v1, "getDeclaredMethods(...)"

    .line 19
    .line 20
    invoke-static {p1, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {v0, p1}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const/4 v2, 0x1

    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    move-object v3, v1

    .line 52
    check-cast v3, Ljava/lang/reflect/Method;

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-static {p2, v4}, LF0/h;->b0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_0

    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    const-string v4, "getParameterTypes(...)"

    .line 69
    .line 70
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    array-length v4, v3

    .line 74
    const/4 v5, 0x0

    .line 75
    :goto_1
    if-ge v5, v4, :cond_0

    .line 76
    .line 77
    aget-object v6, v3, v5

    .line 78
    .line 79
    const-class v7, Landroid/content/Intent;

    .line 80
    .line 81
    invoke-virtual {v7, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    if-nez v8, :cond_2

    .line 86
    .line 87
    invoke-virtual {v6}, Ljava/lang/Class;->isArray()Z

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    if-eqz v8, :cond_1

    .line 92
    .line 93
    invoke-virtual {v6}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    if-eqz v6, :cond_1

    .line 98
    .line 99
    invoke-virtual {v7, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-ne v6, v2, :cond_1

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_2
    :goto_2
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_3
    new-instance p1, Ljava/util/HashSet;

    .line 114
    .line 115
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 116
    .line 117
    .line 118
    new-instance p2, Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    :cond_4
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-eqz v1, :cond_5

    .line 132
    .line 133
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    move-object v3, v1

    .line 138
    check-cast v3, Ljava/lang/reflect/Method;

    .line 139
    .line 140
    invoke-static {v3}, LN0/g;->b(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v3}, Lr0/j0;->z(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-virtual {p1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    if-eqz v3, :cond_4

    .line 152
    .line 153
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_5
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    :cond_6
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result p2

    .line 165
    if-eqz p2, :cond_8

    .line 166
    .line 167
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    check-cast p2, Ljava/lang/reflect/Method;

    .line 172
    .line 173
    iget-object v0, p0, Lr0/j0;->h:Ljava/util/LinkedHashSet;

    .line 174
    .line 175
    invoke-static {p2}, LN0/g;->b(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    invoke-static {p2}, Lr0/j0;->z(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-nez v1, :cond_7

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_7
    :try_start_0
    invoke-virtual {p2, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 190
    .line 191
    .line 192
    new-instance v1, Lr0/i0;

    .line 193
    .line 194
    const/4 v3, 0x2

    .line 195
    invoke-direct {v1, p0, v3}, Lr0/i0;-><init>(Lr0/j0;I)V

    .line 196
    .line 197
    .line 198
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 199
    .line 200
    invoke-interface {v3, p2, v1}, Ld0/a;->e(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 201
    .line 202
    .line 203
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 204
    goto :goto_5

    .line 205
    :catchall_0
    move-exception v1

    .line 206
    new-instance v3, LE0/d;

    .line 207
    .line 208
    invoke-direct {v3, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 209
    .line 210
    .line 211
    move-object v1, v3

    .line 212
    :goto_5
    invoke-static {v1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    if-eqz v1, :cond_6

    .line 217
    .line 218
    invoke-static {p2}, Lr0/j0;->z(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p2

    .line 222
    invoke-virtual {v0, p2}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_8
    return-void
.end method

.method public final s(Landroid/widget/ListAdapter;I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lr0/j0;->f:Ljava/util/IdentityHashMap;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/reflect/Method;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_0
    :try_start_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    filled-new-array {p2}, [Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-static {v0, p1, p2}, Lde/robv/android/xposed/XposedBridge;->invokeOriginalMethod(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    new-instance p2, LE0/d;

    .line 32
    .line 33
    invoke-direct {p2, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object p1, p2

    .line 37
    :goto_0
    nop

    .line 38
    instance-of p2, p1, LE0/d;

    .line 39
    .line 40
    if-eqz p2, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move-object v1, p1

    .line 44
    :goto_1
    return-object v1
.end method

.method public final u(Landroid/widget/ListView;)Z
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lr0/j0;->w(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    invoke-static {p1}, Lr0/j0;->o(Landroid/view/View;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v2, p0, Lr0/j0;->l:LA0/z;

    .line 18
    .line 19
    const-string v3, "mil"

    .line 20
    .line 21
    if-nez v2, :cond_2

    .line 22
    .line 23
    iget-object v2, p0, Lr0/j0;->m:Landroid/content/Context;

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    invoke-static {v3}, LD/h;->T(Ljava/lang/Object;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    goto :goto_2

    .line 32
    :cond_1
    invoke-static {v2}, LA0/l;->g(Landroid/content/Context;)LA0/z;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    :cond_2
    if-eqz v2, :cond_3

    .line 37
    .line 38
    iget-object v2, v2, LA0/z;->c:Ljava/util/List;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_3
    const/4 v2, 0x0

    .line 42
    :goto_0
    if-nez v2, :cond_4

    .line 43
    .line 44
    sget-object v2, LF0/s;->a:LF0/s;

    .line 45
    .line 46
    :cond_4
    new-instance v4, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    :cond_5
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-eqz v5, :cond_6

    .line 60
    .line 61
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    move-object v6, v5

    .line 66
    check-cast v6, Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v6}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    if-nez v6, :cond_5

    .line 73
    .line 74
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_6
    invoke-static {v3}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-static {v4, v2}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-static {v2}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    :goto_2
    invoke-interface {v2, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    const/4 v2, 0x1

    .line 95
    if-eqz v0, :cond_7

    .line 96
    .line 97
    return v2

    .line 98
    :cond_7
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    move v3, v1

    .line 103
    :goto_3
    if-ge v3, v0, :cond_9

    .line 104
    .line 105
    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    const-string v5, "getChildAt(...)"

    .line 110
    .line 111
    invoke-static {v4, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v4}, Lr0/j0;->t(Landroid/view/View;)Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-eqz v4, :cond_8

    .line 119
    .line 120
    return v2

    .line 121
    :cond_8
    add-int/lit8 v3, v3, 0x1

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_9
    return v1
.end method

.method public final v(Landroid/view/View;)Z
    .locals 6

    .line 1
    invoke-static {p1}, Lr0/j0;->x(Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0, v0}, Lr0/j0;->w(Landroid/view/View;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-static {p1}, Lr0/j0;->o(Landroid/view/View;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "mim"

    .line 25
    .line 26
    invoke-static {v0, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/4 v3, 0x1

    .line 31
    if-nez v2, :cond_5

    .line 32
    .line 33
    const-string v2, "q0l"

    .line 34
    .line 35
    invoke-static {v0, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 43
    .line 44
    if-eqz v0, :cond_4

    .line 45
    .line 46
    check-cast p1, Landroid/view/ViewGroup;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    move v2, v1

    .line 53
    :goto_0
    if-ge v2, v0, :cond_4

    .line 54
    .line 55
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    const-string v5, "getChildAt(...)"

    .line 60
    .line 61
    invoke-static {v4, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v4}, Lr0/j0;->t(Landroid/view/View;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_3

    .line 69
    .line 70
    return v3

    .line 71
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_4
    :goto_1
    return v1

    .line 75
    :cond_5
    :goto_2
    return v3
.end method

.method public final w(Landroid/view/View;)Z
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lr0/j0;->j(Landroid/content/Context;)Landroid/app/Activity;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move-object v0, v1

    .line 26
    :goto_0
    const-string v2, "com.tencent.mm.ui.transmit.SelectConversationUI"

    .line 27
    .line 28
    invoke-static {v0, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    goto/16 :goto_1

    .line 35
    .line 36
    :cond_2
    const-string v0, "mil"

    .line 37
    .line 38
    invoke-static {p1, v0}, Lr0/j0;->e(Landroid/view/View;Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_3

    .line 43
    .line 44
    const-string v3, "gz0"

    .line 45
    .line 46
    invoke-static {p1, v3}, Lr0/j0;->e(Landroid/view/View;Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_3

    .line 51
    .line 52
    const-string v3, "m7g"

    .line 53
    .line 54
    invoke-static {p1, v3}, Lr0/j0;->e(Landroid/view/View;Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    const-string v3, "gze"

    .line 61
    .line 62
    invoke-static {p1, v3}, Lr0/j0;->e(Landroid/view/View;Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_3

    .line 67
    .line 68
    goto/16 :goto_1

    .line 69
    .line 70
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-static {v3}, Lr0/j0;->j(Landroid/content/Context;)Landroid/app/Activity;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    if-nez v3, :cond_4

    .line 79
    .line 80
    iget-object v3, p0, Lr0/j0;->o:Ljava/lang/ref/WeakReference;

    .line 81
    .line 82
    if-eqz v3, :cond_5

    .line 83
    .line 84
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    check-cast v3, Landroid/app/Activity;

    .line 89
    .line 90
    if-eqz v3, :cond_5

    .line 91
    .line 92
    invoke-virtual {v3}, Landroid/app/Activity;->isFinishing()Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-nez v4, :cond_5

    .line 97
    .line 98
    :cond_4
    move-object v1, v3

    .line 99
    :cond_5
    if-eqz v1, :cond_8

    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-eqz p1, :cond_6

    .line 114
    .line 115
    goto/16 :goto_1

    .line 116
    .line 117
    :cond_6
    invoke-static {v1}, Lb1/h;->F(Landroid/app/Activity;)Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-eqz p1, :cond_7

    .line 122
    .line 123
    goto/16 :goto_1

    .line 124
    .line 125
    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p0, p1}, Lr0/j0;->y(Ljava/lang/String;)Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-eqz p1, :cond_f

    .line 138
    .line 139
    goto/16 :goto_2

    .line 140
    .line 141
    :cond_8
    invoke-static {p1, v0}, Lr0/j0;->e(Landroid/view/View;Ljava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-eqz v1, :cond_9

    .line 146
    .line 147
    goto/16 :goto_1

    .line 148
    .line 149
    :cond_9
    const-string v1, "mjt"

    .line 150
    .line 151
    invoke-static {p1, v1}, Lr0/j0;->e(Landroid/view/View;Ljava/lang/String;)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-eqz v1, :cond_a

    .line 156
    .line 157
    const-string v1, "g6_"

    .line 158
    .line 159
    invoke-static {p1, v1}, Lr0/j0;->e(Landroid/view/View;Ljava/lang/String;)Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-eqz v1, :cond_a

    .line 164
    .line 165
    goto/16 :goto_2

    .line 166
    .line 167
    :cond_a
    const-string v1, "k13"

    .line 168
    .line 169
    invoke-static {p1, v1}, Lr0/j0;->e(Landroid/view/View;Ljava/lang/String;)Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    if-eqz v2, :cond_b

    .line 174
    .line 175
    const-string v2, "oom"

    .line 176
    .line 177
    invoke-static {p1, v2}, Lr0/j0;->e(Landroid/view/View;Ljava/lang/String;)Z

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    if-nez v2, :cond_f

    .line 182
    .line 183
    const-string v2, "q0d"

    .line 184
    .line 185
    invoke-static {p1, v2}, Lr0/j0;->e(Landroid/view/View;Ljava/lang/String;)Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-eqz v2, :cond_b

    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_b
    const-string v2, "r2d"

    .line 193
    .line 194
    invoke-static {p1, v2}, Lr0/j0;->e(Landroid/view/View;Ljava/lang/String;)Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-eqz v2, :cond_c

    .line 199
    .line 200
    invoke-static {p1, v1}, Lr0/j0;->e(Landroid/view/View;Ljava/lang/String;)Z

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    if-eqz v2, :cond_c

    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_c
    const-string v2, "cek"

    .line 208
    .line 209
    invoke-static {p1, v2}, Lr0/j0;->e(Landroid/view/View;Ljava/lang/String;)Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    if-eqz v2, :cond_d

    .line 214
    .line 215
    invoke-static {p1, v1}, Lr0/j0;->e(Landroid/view/View;Ljava/lang/String;)Z

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    if-eqz v1, :cond_d

    .line 220
    .line 221
    const-string v1, "mim"

    .line 222
    .line 223
    invoke-static {p1, v1}, Lr0/j0;->e(Landroid/view/View;Ljava/lang/String;)Z

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    if-eqz v1, :cond_d

    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_d
    invoke-static {p1, v0}, Lr0/j0;->e(Landroid/view/View;Ljava/lang/String;)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_e

    .line 235
    .line 236
    const-string v0, "fp"

    .line 237
    .line 238
    invoke-static {p1, v0}, Lr0/j0;->e(Landroid/view/View;Ljava/lang/String;)Z

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    if-eqz v0, :cond_e

    .line 243
    .line 244
    goto :goto_2

    .line 245
    :cond_e
    const-string v0, "\u9359\u6223\u6363\u7f07\u3088\u4eb0"

    .line 246
    .line 247
    invoke-static {p1, v0}, Lr0/j0;->l(Landroid/view/View;Ljava/lang/String;)Z

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-nez v0, :cond_10

    .line 252
    .line 253
    const-string v0, "\u95ab\u590b\u5ae8\u9471\u65c2\u90f4\u6d5c?"

    .line 254
    .line 255
    invoke-static {p1, v0}, Lr0/j0;->l(Landroid/view/View;Ljava/lang/String;)Z

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    if-nez v0, :cond_10

    .line 260
    .line 261
    const-string v0, "\u95ab\u590b\u5ae8\u93c8\u5b2a\u5f38"

    .line 262
    .line 263
    invoke-static {p1, v0}, Lr0/j0;->l(Landroid/view/View;Ljava/lang/String;)Z

    .line 264
    .line 265
    .line 266
    move-result p1

    .line 267
    if-eqz p1, :cond_f

    .line 268
    .line 269
    goto :goto_2

    .line 270
    :cond_f
    :goto_1
    const/4 p1, 0x0

    .line 271
    return p1

    .line 272
    :cond_10
    :goto_2
    const/4 p1, 0x1

    .line 273
    return p1
.end method

.method public final y(Ljava/lang/String;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lr0/j0;->l:LA0/z;

    .line 2
    .line 3
    const-string v1, "com.tencent.mm.ui.contact.OnlyChatContactMgrUI"

    .line 4
    .line 5
    const-string v2, "com.tencent.mm.ui.contact.SelectContactUI"

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lr0/j0;->m:Landroid/content/Context;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, LF0/u;->a:LF0/u;

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    invoke-static {v0}, LA0/l;->g(Landroid/content/Context;)LA0/z;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :cond_1
    if-eqz v0, :cond_2

    .line 21
    .line 22
    iget-object v0, v0, LA0/z;->a:Ljava/util/List;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    const/4 v0, 0x0

    .line 26
    :goto_0
    if-nez v0, :cond_3

    .line 27
    .line 28
    sget-object v0, LF0/s;->a:LF0/s;

    .line 29
    .line 30
    :cond_3
    new-instance v3, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_5

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    move-object v5, v4

    .line 50
    check-cast v5, Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v5}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-nez v5, :cond_4

    .line 57
    .line 58
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_5
    filled-new-array {v2, v1}, [Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v3, v0}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {v0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    :goto_2
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_6

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_6
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_8

    .line 90
    .line 91
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_8

    .line 96
    .line 97
    const-string v0, "com.tencent.mm.ui.mvvm.MvvmContactListUI"

    .line 98
    .line 99
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_7

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_7
    const/4 p1, 0x0

    .line 107
    return p1

    .line 108
    :cond_8
    :goto_3
    const/4 p1, 0x1

    .line 109
    return p1
.end method
