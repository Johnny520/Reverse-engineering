.class public final Landroidx/lifecycle/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public b:Lk/a;

.field public c:Landroidx/lifecycle/n;

.field public final d:Ljava/lang/ref/WeakReference;

.field public e:I

.field public f:Z

.field public g:Z

.field public final h:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/s;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Landroidx/lifecycle/u;->a:Z

    .line 11
    .line 12
    new-instance v0, Lk/a;

    .line 13
    .line 14
    invoke-direct {v0}, Lk/a;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Landroidx/lifecycle/u;->b:Lk/a;

    .line 18
    .line 19
    sget-object v0, Landroidx/lifecycle/n;->b:Landroidx/lifecycle/n;

    .line 20
    .line 21
    iput-object v0, p0, Landroidx/lifecycle/u;->c:Landroidx/lifecycle/n;

    .line 22
    .line 23
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Landroidx/lifecycle/u;->h:Ljava/util/ArrayList;

    .line 29
    .line 30
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 31
    .line 32
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Landroidx/lifecycle/u;->d:Ljava/lang/ref/WeakReference;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/r;)V
    .locals 10

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/u;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    const-string v1, "observer"

    .line 4
    .line 5
    invoke-static {p1, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "addObserver"

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Landroidx/lifecycle/u;->c(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Landroidx/lifecycle/u;->c:Landroidx/lifecycle/n;

    .line 14
    .line 15
    sget-object v2, Landroidx/lifecycle/n;->a:Landroidx/lifecycle/n;

    .line 16
    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-object v2, Landroidx/lifecycle/n;->b:Landroidx/lifecycle/n;

    .line 21
    .line 22
    :goto_0
    new-instance v1, Landroidx/lifecycle/t;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    sget-object v3, Landroidx/lifecycle/v;->a:Ljava/util/HashMap;

    .line 28
    .line 29
    instance-of v3, p1, Landroidx/lifecycle/q;

    .line 30
    .line 31
    instance-of v4, p1, Landroidx/lifecycle/e;

    .line 32
    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x1

    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x0

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    new-instance v3, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;

    .line 42
    .line 43
    move-object v4, p1

    .line 44
    check-cast v4, Landroidx/lifecycle/e;

    .line 45
    .line 46
    move-object v9, p1

    .line 47
    check-cast v9, Landroidx/lifecycle/q;

    .line 48
    .line 49
    invoke-direct {v3, v4, v9}, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;-><init>(Landroidx/lifecycle/e;Landroidx/lifecycle/q;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    if-eqz v4, :cond_2

    .line 54
    .line 55
    new-instance v3, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;

    .line 56
    .line 57
    move-object v4, p1

    .line 58
    check-cast v4, Landroidx/lifecycle/e;

    .line 59
    .line 60
    invoke-direct {v3, v4, v7}, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;-><init>(Landroidx/lifecycle/e;Landroidx/lifecycle/q;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    if-eqz v3, :cond_3

    .line 65
    .line 66
    move-object v3, p1

    .line 67
    check-cast v3, Landroidx/lifecycle/q;

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-static {v3}, Landroidx/lifecycle/v;->b(Ljava/lang/Class;)I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-ne v4, v5, :cond_6

    .line 79
    .line 80
    sget-object v4, Landroidx/lifecycle/v;->b:Ljava/util/HashMap;

    .line 81
    .line 82
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-static {v3}, LN0/g;->b(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    check-cast v3, Ljava/util/List;

    .line 90
    .line 91
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-eq v4, v6, :cond_5

    .line 96
    .line 97
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    new-array v9, v4, [Landroidx/lifecycle/h;

    .line 102
    .line 103
    if-gtz v4, :cond_4

    .line 104
    .line 105
    new-instance v3, Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;

    .line 106
    .line 107
    invoke-direct {v3, v9}, Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;-><init>([Landroidx/lifecycle/h;)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_4
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 116
    .line 117
    invoke-static {v0, p1}, Landroidx/lifecycle/v;->a(Ljava/lang/reflect/Constructor;Landroidx/lifecycle/r;)V

    .line 118
    .line 119
    .line 120
    throw v7

    .line 121
    :cond_5
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 126
    .line 127
    invoke-static {v0, p1}, Landroidx/lifecycle/v;->a(Ljava/lang/reflect/Constructor;Landroidx/lifecycle/r;)V

    .line 128
    .line 129
    .line 130
    throw v7

    .line 131
    :cond_6
    new-instance v3, Landroidx/lifecycle/ReflectiveGenericLifecycleObserver;

    .line 132
    .line 133
    invoke-direct {v3, p1}, Landroidx/lifecycle/ReflectiveGenericLifecycleObserver;-><init>(Landroidx/lifecycle/r;)V

    .line 134
    .line 135
    .line 136
    :goto_1
    iput-object v3, v1, Landroidx/lifecycle/t;->b:Landroidx/lifecycle/q;

    .line 137
    .line 138
    iput-object v2, v1, Landroidx/lifecycle/t;->a:Landroidx/lifecycle/n;

    .line 139
    .line 140
    iget-object v2, p0, Landroidx/lifecycle/u;->b:Lk/a;

    .line 141
    .line 142
    invoke-virtual {v2, p1}, Lk/a;->a(Ljava/lang/Object;)Lk/c;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    if-eqz v3, :cond_7

    .line 147
    .line 148
    iget-object v2, v3, Lk/c;->b:Ljava/lang/Object;

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_7
    iget-object v3, v2, Lk/a;->e:Ljava/util/HashMap;

    .line 152
    .line 153
    new-instance v4, Lk/c;

    .line 154
    .line 155
    invoke-direct {v4, p1, v1}, Lk/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    iget v9, v2, Lk/f;->d:I

    .line 159
    .line 160
    add-int/2addr v9, v6

    .line 161
    iput v9, v2, Lk/f;->d:I

    .line 162
    .line 163
    iget-object v9, v2, Lk/f;->b:Lk/c;

    .line 164
    .line 165
    if-nez v9, :cond_8

    .line 166
    .line 167
    iput-object v4, v2, Lk/f;->a:Lk/c;

    .line 168
    .line 169
    iput-object v4, v2, Lk/f;->b:Lk/c;

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_8
    iput-object v4, v9, Lk/c;->c:Lk/c;

    .line 173
    .line 174
    iput-object v9, v4, Lk/c;->d:Lk/c;

    .line 175
    .line 176
    iput-object v4, v2, Lk/f;->b:Lk/c;

    .line 177
    .line 178
    :goto_2
    invoke-virtual {v3, p1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-object v2, v7

    .line 182
    :goto_3
    check-cast v2, Landroidx/lifecycle/t;

    .line 183
    .line 184
    if-eqz v2, :cond_9

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_9
    iget-object v2, p0, Landroidx/lifecycle/u;->d:Ljava/lang/ref/WeakReference;

    .line 188
    .line 189
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    check-cast v2, Landroidx/lifecycle/s;

    .line 194
    .line 195
    if-nez v2, :cond_a

    .line 196
    .line 197
    :goto_4
    return-void

    .line 198
    :cond_a
    iget v3, p0, Landroidx/lifecycle/u;->e:I

    .line 199
    .line 200
    if-nez v3, :cond_b

    .line 201
    .line 202
    iget-boolean v3, p0, Landroidx/lifecycle/u;->f:Z

    .line 203
    .line 204
    if-eqz v3, :cond_c

    .line 205
    .line 206
    :cond_b
    move v8, v6

    .line 207
    :cond_c
    invoke-virtual {p0, p1}, Landroidx/lifecycle/u;->b(Landroidx/lifecycle/r;)Landroidx/lifecycle/n;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    iget v4, p0, Landroidx/lifecycle/u;->e:I

    .line 212
    .line 213
    add-int/2addr v4, v6

    .line 214
    iput v4, p0, Landroidx/lifecycle/u;->e:I

    .line 215
    .line 216
    :goto_5
    iget-object v4, v1, Landroidx/lifecycle/t;->a:Landroidx/lifecycle/n;

    .line 217
    .line 218
    invoke-virtual {v4, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    if-gez v3, :cond_11

    .line 223
    .line 224
    iget-object v3, p0, Landroidx/lifecycle/u;->b:Lk/a;

    .line 225
    .line 226
    iget-object v3, v3, Lk/a;->e:Ljava/util/HashMap;

    .line 227
    .line 228
    invoke-virtual {v3, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    if-eqz v3, :cond_11

    .line 233
    .line 234
    iget-object v3, v1, Landroidx/lifecycle/t;->a:Landroidx/lifecycle/n;

    .line 235
    .line 236
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    sget-object v3, Landroidx/lifecycle/m;->Companion:Landroidx/lifecycle/k;

    .line 240
    .line 241
    iget-object v4, v1, Landroidx/lifecycle/t;->a:Landroidx/lifecycle/n;

    .line 242
    .line 243
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    const-string v3, "state"

    .line 247
    .line 248
    invoke-static {v4, v3}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    if-eq v3, v6, :cond_f

    .line 256
    .line 257
    if-eq v3, v5, :cond_e

    .line 258
    .line 259
    const/4 v4, 0x3

    .line 260
    if-eq v3, v4, :cond_d

    .line 261
    .line 262
    move-object v3, v7

    .line 263
    goto :goto_6

    .line 264
    :cond_d
    sget-object v3, Landroidx/lifecycle/m;->ON_RESUME:Landroidx/lifecycle/m;

    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_e
    sget-object v3, Landroidx/lifecycle/m;->ON_START:Landroidx/lifecycle/m;

    .line 268
    .line 269
    goto :goto_6

    .line 270
    :cond_f
    sget-object v3, Landroidx/lifecycle/m;->ON_CREATE:Landroidx/lifecycle/m;

    .line 271
    .line 272
    :goto_6
    if-eqz v3, :cond_10

    .line 273
    .line 274
    invoke-virtual {v1, v2, v3}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/s;Landroidx/lifecycle/m;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    sub-int/2addr v3, v6

    .line 282
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    invoke-virtual {p0, p1}, Landroidx/lifecycle/u;->b(Landroidx/lifecycle/r;)Landroidx/lifecycle/n;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    goto :goto_5

    .line 290
    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 291
    .line 292
    new-instance v0, Ljava/lang/StringBuilder;

    .line 293
    .line 294
    const-string v2, "no event up from "

    .line 295
    .line 296
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    iget-object v1, v1, Landroidx/lifecycle/t;->a:Landroidx/lifecycle/n;

    .line 300
    .line 301
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    throw p1

    .line 312
    :cond_11
    if-nez v8, :cond_12

    .line 313
    .line 314
    invoke-virtual {p0}, Landroidx/lifecycle/u;->h()V

    .line 315
    .line 316
    .line 317
    :cond_12
    iget p1, p0, Landroidx/lifecycle/u;->e:I

    .line 318
    .line 319
    add-int/lit8 p1, p1, -0x1

    .line 320
    .line 321
    iput p1, p0, Landroidx/lifecycle/u;->e:I

    .line 322
    .line 323
    return-void
.end method

.method public final b(Landroidx/lifecycle/r;)Landroidx/lifecycle/n;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/u;->b:Lk/a;

    .line 2
    .line 3
    iget-object v0, v0, Lk/a;->e:Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lk/c;

    .line 17
    .line 18
    iget-object p1, p1, Lk/c;->d:Lk/c;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object p1, v2

    .line 22
    :goto_0
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-object p1, p1, Lk/c;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Landroidx/lifecycle/t;

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    iget-object p1, p1, Landroidx/lifecycle/t;->a:Landroidx/lifecycle/n;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move-object p1, v2

    .line 34
    :goto_1
    iget-object v0, p0, Landroidx/lifecycle/u;->h:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    add-int/lit8 v1, v1, -0x1

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    move-object v2, v0

    .line 53
    check-cast v2, Landroidx/lifecycle/n;

    .line 54
    .line 55
    :cond_2
    iget-object v0, p0, Landroidx/lifecycle/u;->c:Landroidx/lifecycle/n;

    .line 56
    .line 57
    const-string v1, "state1"

    .line 58
    .line 59
    invoke-static {v0, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    if-eqz p1, :cond_3

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-gez v1, :cond_3

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    move-object p1, v0

    .line 72
    :goto_2
    if-eqz v2, :cond_4

    .line 73
    .line 74
    invoke-virtual {v2, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-gez v0, :cond_4

    .line 79
    .line 80
    return-object v2

    .line 81
    :cond_4
    return-object p1
.end method

.method public final c(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/lifecycle/u;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {}, Lj/a;->Q()Lj/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, Lj/a;->p:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lj/a;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-ne v0, v1, :cond_0

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    const-string v0, "Method "

    .line 32
    .line 33
    const-string v1, " must be called on the main thread"

    .line 34
    .line 35
    invoke-static {v0, p1, v1}, LL/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :cond_1
    return-void
.end method

.method public final d(Landroidx/lifecycle/m;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "handleLifecycleEvent"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroidx/lifecycle/u;->c(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/lifecycle/m;->a()Landroidx/lifecycle/n;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Landroidx/lifecycle/u;->e(Landroidx/lifecycle/n;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final e(Landroidx/lifecycle/n;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/u;->c:Landroidx/lifecycle/n;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    sget-object v1, Landroidx/lifecycle/n;->b:Landroidx/lifecycle/n;

    .line 7
    .line 8
    sget-object v2, Landroidx/lifecycle/n;->a:Landroidx/lifecycle/n;

    .line 9
    .line 10
    if-ne v0, v1, :cond_2

    .line 11
    .line 12
    if-eq p1, v2, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v0, "no event down from "

    .line 18
    .line 19
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Landroidx/lifecycle/u;->c:Landroidx/lifecycle/n;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, " in component "

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Landroidx/lifecycle/u;->d:Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v0

    .line 55
    :cond_2
    :goto_0
    iput-object p1, p0, Landroidx/lifecycle/u;->c:Landroidx/lifecycle/n;

    .line 56
    .line 57
    iget-boolean p1, p0, Landroidx/lifecycle/u;->f:Z

    .line 58
    .line 59
    const/4 v0, 0x1

    .line 60
    if-nez p1, :cond_5

    .line 61
    .line 62
    iget p1, p0, Landroidx/lifecycle/u;->e:I

    .line 63
    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    iput-boolean v0, p0, Landroidx/lifecycle/u;->f:Z

    .line 68
    .line 69
    invoke-virtual {p0}, Landroidx/lifecycle/u;->h()V

    .line 70
    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    iput-boolean p1, p0, Landroidx/lifecycle/u;->f:Z

    .line 74
    .line 75
    iget-object p1, p0, Landroidx/lifecycle/u;->c:Landroidx/lifecycle/n;

    .line 76
    .line 77
    if-ne p1, v2, :cond_4

    .line 78
    .line 79
    new-instance p1, Lk/a;

    .line 80
    .line 81
    invoke-direct {p1}, Lk/a;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object p1, p0, Landroidx/lifecycle/u;->b:Lk/a;

    .line 85
    .line 86
    :cond_4
    :goto_1
    return-void

    .line 87
    :cond_5
    :goto_2
    iput-boolean v0, p0, Landroidx/lifecycle/u;->g:Z

    .line 88
    .line 89
    return-void
.end method

.method public final f(Landroidx/lifecycle/r;)V
    .locals 4

    .line 1
    const-string v0, "removeObserver"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroidx/lifecycle/u;->c(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/lifecycle/u;->b:Lk/a;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lk/a;->a(Ljava/lang/Object;)Lk/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    goto :goto_3

    .line 15
    :cond_0
    iget v2, v0, Lk/f;->d:I

    .line 16
    .line 17
    add-int/lit8 v2, v2, -0x1

    .line 18
    .line 19
    iput v2, v0, Lk/f;->d:I

    .line 20
    .line 21
    iget-object v2, v0, Lk/f;->c:Ljava/util/WeakHashMap;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/util/WeakHashMap;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Lk/e;

    .line 48
    .line 49
    invoke-virtual {v3, v1}, Lk/e;->a(Lk/c;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    iget-object v2, v1, Lk/c;->d:Lk/c;

    .line 54
    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    iget-object v3, v1, Lk/c;->c:Lk/c;

    .line 58
    .line 59
    iput-object v3, v2, Lk/c;->c:Lk/c;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    iget-object v3, v1, Lk/c;->c:Lk/c;

    .line 63
    .line 64
    iput-object v3, v0, Lk/f;->a:Lk/c;

    .line 65
    .line 66
    :goto_1
    iget-object v3, v1, Lk/c;->c:Lk/c;

    .line 67
    .line 68
    if-eqz v3, :cond_3

    .line 69
    .line 70
    iput-object v2, v3, Lk/c;->d:Lk/c;

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    iput-object v2, v0, Lk/f;->b:Lk/c;

    .line 74
    .line 75
    :goto_2
    const/4 v2, 0x0

    .line 76
    iput-object v2, v1, Lk/c;->c:Lk/c;

    .line 77
    .line 78
    iput-object v2, v1, Lk/c;->d:Lk/c;

    .line 79
    .line 80
    :goto_3
    iget-object v0, v0, Lk/a;->e:Ljava/util/HashMap;

    .line 81
    .line 82
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public final g()V
    .locals 2

    .line 1
    sget-object v0, Landroidx/lifecycle/n;->c:Landroidx/lifecycle/n;

    .line 2
    .line 3
    const-string v1, "setCurrentState"

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Landroidx/lifecycle/u;->c(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroidx/lifecycle/u;->e(Landroidx/lifecycle/n;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final h()V
    .locals 12

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/u;->d:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/lifecycle/s;

    .line 8
    .line 9
    if-eqz v0, :cond_e

    .line 10
    .line 11
    :cond_0
    iget-object v1, p0, Landroidx/lifecycle/u;->b:Lk/a;

    .line 12
    .line 13
    iget v2, v1, Lk/f;->d:I

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    iget-object v1, v1, Lk/f;->a:Lk/c;

    .line 20
    .line 21
    invoke-static {v1}, LN0/g;->b(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, v1, Lk/c;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Landroidx/lifecycle/t;

    .line 27
    .line 28
    iget-object v1, v1, Landroidx/lifecycle/t;->a:Landroidx/lifecycle/n;

    .line 29
    .line 30
    iget-object v2, p0, Landroidx/lifecycle/u;->b:Lk/a;

    .line 31
    .line 32
    iget-object v2, v2, Lk/f;->b:Lk/c;

    .line 33
    .line 34
    invoke-static {v2}, LN0/g;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object v2, v2, Lk/c;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Landroidx/lifecycle/t;

    .line 40
    .line 41
    iget-object v2, v2, Landroidx/lifecycle/t;->a:Landroidx/lifecycle/n;

    .line 42
    .line 43
    if-ne v1, v2, :cond_2

    .line 44
    .line 45
    iget-object v1, p0, Landroidx/lifecycle/u;->c:Landroidx/lifecycle/n;

    .line 46
    .line 47
    if-ne v1, v2, :cond_2

    .line 48
    .line 49
    :goto_0
    iput-boolean v3, p0, Landroidx/lifecycle/u;->g:Z

    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    iput-boolean v3, p0, Landroidx/lifecycle/u;->g:Z

    .line 53
    .line 54
    iget-object v1, p0, Landroidx/lifecycle/u;->c:Landroidx/lifecycle/n;

    .line 55
    .line 56
    iget-object v2, p0, Landroidx/lifecycle/u;->b:Lk/a;

    .line 57
    .line 58
    iget-object v2, v2, Lk/f;->a:Lk/c;

    .line 59
    .line 60
    invoke-static {v2}, LN0/g;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object v2, v2, Lk/c;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v2, Landroidx/lifecycle/t;

    .line 66
    .line 67
    iget-object v2, v2, Landroidx/lifecycle/t;->a:Landroidx/lifecycle/n;

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    const/4 v2, 0x0

    .line 74
    const/4 v3, 0x3

    .line 75
    const/4 v4, 0x2

    .line 76
    const-string v5, "state"

    .line 77
    .line 78
    const/4 v6, 0x1

    .line 79
    if-gez v1, :cond_8

    .line 80
    .line 81
    iget-object v1, p0, Landroidx/lifecycle/u;->b:Lk/a;

    .line 82
    .line 83
    new-instance v7, Lk/b;

    .line 84
    .line 85
    iget-object v8, v1, Lk/f;->b:Lk/c;

    .line 86
    .line 87
    iget-object v9, v1, Lk/f;->a:Lk/c;

    .line 88
    .line 89
    const/4 v10, 0x1

    .line 90
    invoke-direct {v7, v8, v9, v10}, Lk/b;-><init>(Lk/c;Lk/c;I)V

    .line 91
    .line 92
    .line 93
    iget-object v1, v1, Lk/f;->c:Ljava/util/WeakHashMap;

    .line 94
    .line 95
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 96
    .line 97
    invoke-virtual {v1, v7, v8}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    :cond_3
    invoke-virtual {v7}, Lk/b;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_8

    .line 105
    .line 106
    iget-boolean v1, p0, Landroidx/lifecycle/u;->g:Z

    .line 107
    .line 108
    if-nez v1, :cond_8

    .line 109
    .line 110
    invoke-virtual {v7}, Lk/b;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    check-cast v1, Ljava/util/Map$Entry;

    .line 115
    .line 116
    const-string v8, "next()"

    .line 117
    .line 118
    invoke-static {v1, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    check-cast v8, Landroidx/lifecycle/r;

    .line 126
    .line 127
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    check-cast v1, Landroidx/lifecycle/t;

    .line 132
    .line 133
    :goto_1
    iget-object v9, v1, Landroidx/lifecycle/t;->a:Landroidx/lifecycle/n;

    .line 134
    .line 135
    iget-object v10, p0, Landroidx/lifecycle/u;->c:Landroidx/lifecycle/n;

    .line 136
    .line 137
    invoke-virtual {v9, v10}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 138
    .line 139
    .line 140
    move-result v9

    .line 141
    if-lez v9, :cond_3

    .line 142
    .line 143
    iget-boolean v9, p0, Landroidx/lifecycle/u;->g:Z

    .line 144
    .line 145
    if-nez v9, :cond_3

    .line 146
    .line 147
    iget-object v9, p0, Landroidx/lifecycle/u;->b:Lk/a;

    .line 148
    .line 149
    iget-object v9, v9, Lk/a;->e:Ljava/util/HashMap;

    .line 150
    .line 151
    invoke-virtual {v9, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v9

    .line 155
    if-eqz v9, :cond_3

    .line 156
    .line 157
    sget-object v9, Landroidx/lifecycle/m;->Companion:Landroidx/lifecycle/k;

    .line 158
    .line 159
    iget-object v10, v1, Landroidx/lifecycle/t;->a:Landroidx/lifecycle/n;

    .line 160
    .line 161
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-static {v10, v5}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 168
    .line 169
    .line 170
    move-result v9

    .line 171
    if-eq v9, v4, :cond_6

    .line 172
    .line 173
    if-eq v9, v3, :cond_5

    .line 174
    .line 175
    const/4 v10, 0x4

    .line 176
    if-eq v9, v10, :cond_4

    .line 177
    .line 178
    move-object v9, v2

    .line 179
    goto :goto_2

    .line 180
    :cond_4
    sget-object v9, Landroidx/lifecycle/m;->ON_PAUSE:Landroidx/lifecycle/m;

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_5
    sget-object v9, Landroidx/lifecycle/m;->ON_STOP:Landroidx/lifecycle/m;

    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_6
    sget-object v9, Landroidx/lifecycle/m;->ON_DESTROY:Landroidx/lifecycle/m;

    .line 187
    .line 188
    :goto_2
    if-eqz v9, :cond_7

    .line 189
    .line 190
    invoke-virtual {v9}, Landroidx/lifecycle/m;->a()Landroidx/lifecycle/n;

    .line 191
    .line 192
    .line 193
    move-result-object v10

    .line 194
    iget-object v11, p0, Landroidx/lifecycle/u;->h:Ljava/util/ArrayList;

    .line 195
    .line 196
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1, v0, v9}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/s;Landroidx/lifecycle/m;)V

    .line 200
    .line 201
    .line 202
    iget-object v9, p0, Landroidx/lifecycle/u;->h:Ljava/util/ArrayList;

    .line 203
    .line 204
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 205
    .line 206
    .line 207
    move-result v10

    .line 208
    sub-int/2addr v10, v6

    .line 209
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 214
    .line 215
    new-instance v2, Ljava/lang/StringBuilder;

    .line 216
    .line 217
    const-string v3, "no event down from "

    .line 218
    .line 219
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    iget-object v1, v1, Landroidx/lifecycle/t;->a:Landroidx/lifecycle/n;

    .line 223
    .line 224
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    throw v0

    .line 235
    :cond_8
    iget-object v1, p0, Landroidx/lifecycle/u;->b:Lk/a;

    .line 236
    .line 237
    iget-object v1, v1, Lk/f;->b:Lk/c;

    .line 238
    .line 239
    iget-boolean v7, p0, Landroidx/lifecycle/u;->g:Z

    .line 240
    .line 241
    if-nez v7, :cond_0

    .line 242
    .line 243
    if-eqz v1, :cond_0

    .line 244
    .line 245
    iget-object v7, p0, Landroidx/lifecycle/u;->c:Landroidx/lifecycle/n;

    .line 246
    .line 247
    iget-object v1, v1, Lk/c;->b:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v1, Landroidx/lifecycle/t;

    .line 250
    .line 251
    iget-object v1, v1, Landroidx/lifecycle/t;->a:Landroidx/lifecycle/n;

    .line 252
    .line 253
    invoke-virtual {v7, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    if-lez v1, :cond_0

    .line 258
    .line 259
    iget-object v1, p0, Landroidx/lifecycle/u;->b:Lk/a;

    .line 260
    .line 261
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    new-instance v7, Lk/d;

    .line 265
    .line 266
    invoke-direct {v7, v1}, Lk/d;-><init>(Lk/f;)V

    .line 267
    .line 268
    .line 269
    iget-object v1, v1, Lk/f;->c:Ljava/util/WeakHashMap;

    .line 270
    .line 271
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 272
    .line 273
    invoke-virtual {v1, v7, v8}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    :cond_9
    invoke-virtual {v7}, Lk/d;->hasNext()Z

    .line 277
    .line 278
    .line 279
    move-result v1

    .line 280
    if-eqz v1, :cond_0

    .line 281
    .line 282
    iget-boolean v1, p0, Landroidx/lifecycle/u;->g:Z

    .line 283
    .line 284
    if-nez v1, :cond_0

    .line 285
    .line 286
    invoke-virtual {v7}, Lk/d;->next()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    check-cast v1, Ljava/util/Map$Entry;

    .line 291
    .line 292
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v8

    .line 296
    check-cast v8, Landroidx/lifecycle/r;

    .line 297
    .line 298
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    check-cast v1, Landroidx/lifecycle/t;

    .line 303
    .line 304
    :goto_3
    iget-object v9, v1, Landroidx/lifecycle/t;->a:Landroidx/lifecycle/n;

    .line 305
    .line 306
    iget-object v10, p0, Landroidx/lifecycle/u;->c:Landroidx/lifecycle/n;

    .line 307
    .line 308
    invoke-virtual {v9, v10}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 309
    .line 310
    .line 311
    move-result v9

    .line 312
    if-gez v9, :cond_9

    .line 313
    .line 314
    iget-boolean v9, p0, Landroidx/lifecycle/u;->g:Z

    .line 315
    .line 316
    if-nez v9, :cond_9

    .line 317
    .line 318
    iget-object v9, p0, Landroidx/lifecycle/u;->b:Lk/a;

    .line 319
    .line 320
    iget-object v9, v9, Lk/a;->e:Ljava/util/HashMap;

    .line 321
    .line 322
    invoke-virtual {v9, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v9

    .line 326
    if-eqz v9, :cond_9

    .line 327
    .line 328
    iget-object v9, v1, Landroidx/lifecycle/t;->a:Landroidx/lifecycle/n;

    .line 329
    .line 330
    iget-object v10, p0, Landroidx/lifecycle/u;->h:Ljava/util/ArrayList;

    .line 331
    .line 332
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    sget-object v9, Landroidx/lifecycle/m;->Companion:Landroidx/lifecycle/k;

    .line 336
    .line 337
    iget-object v10, v1, Landroidx/lifecycle/t;->a:Landroidx/lifecycle/n;

    .line 338
    .line 339
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    invoke-static {v10, v5}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 346
    .line 347
    .line 348
    move-result v9

    .line 349
    if-eq v9, v6, :cond_c

    .line 350
    .line 351
    if-eq v9, v4, :cond_b

    .line 352
    .line 353
    if-eq v9, v3, :cond_a

    .line 354
    .line 355
    move-object v9, v2

    .line 356
    goto :goto_4

    .line 357
    :cond_a
    sget-object v9, Landroidx/lifecycle/m;->ON_RESUME:Landroidx/lifecycle/m;

    .line 358
    .line 359
    goto :goto_4

    .line 360
    :cond_b
    sget-object v9, Landroidx/lifecycle/m;->ON_START:Landroidx/lifecycle/m;

    .line 361
    .line 362
    goto :goto_4

    .line 363
    :cond_c
    sget-object v9, Landroidx/lifecycle/m;->ON_CREATE:Landroidx/lifecycle/m;

    .line 364
    .line 365
    :goto_4
    if-eqz v9, :cond_d

    .line 366
    .line 367
    invoke-virtual {v1, v0, v9}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/s;Landroidx/lifecycle/m;)V

    .line 368
    .line 369
    .line 370
    iget-object v9, p0, Landroidx/lifecycle/u;->h:Ljava/util/ArrayList;

    .line 371
    .line 372
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 373
    .line 374
    .line 375
    move-result v10

    .line 376
    sub-int/2addr v10, v6

    .line 377
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    goto :goto_3

    .line 381
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 382
    .line 383
    new-instance v2, Ljava/lang/StringBuilder;

    .line 384
    .line 385
    const-string v3, "no event up from "

    .line 386
    .line 387
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    iget-object v1, v1, Landroidx/lifecycle/t;->a:Landroidx/lifecycle/n;

    .line 391
    .line 392
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    throw v0

    .line 403
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 404
    .line 405
    const-string v1, "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."

    .line 406
    .line 407
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    throw v0
.end method
