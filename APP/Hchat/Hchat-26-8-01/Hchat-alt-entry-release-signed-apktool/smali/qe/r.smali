.class public final Lqe/r;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lud/r;

.field public final b:Landroidx/lifecycle/e0;

.field public final c:Lqe/k;

.field public final d:Lqe/x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lqe/r;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Lud/r;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqe/r;->a:Lud/r;

    .line 5
    .line 6
    new-instance v0, Landroidx/lifecycle/e0;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Landroidx/lifecycle/e0;-><init>(Lud/r;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lqe/r;->b:Landroidx/lifecycle/e0;

    .line 12
    .line 13
    iget-object p1, p1, Lud/r;->l:Lud/e;

    .line 14
    .line 15
    iget-object p1, p1, Lud/e;->k:Lud/u;

    .line 16
    .line 17
    iget-object p1, p1, Lud/u;->g:Lqe/x;

    .line 18
    .line 19
    iput-object p1, p0, Lqe/r;->d:Lqe/x;

    .line 20
    .line 21
    iget-object p1, p1, Lqe/x;->c:Lqe/k;

    .line 22
    .line 23
    iput-object p1, p0, Lqe/r;->c:Lqe/k;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;Ljava/util/LinkedHashSet;Lqd/j;)Z
    .locals 3

    .line 1
    invoke-virtual {p3}, Lqd/j;->w()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Lqe/r;->d:Lqe/x;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lqe/d;

    .line 27
    .line 28
    invoke-interface {v1}, Lqe/d;->getType()Lqd/j;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0, p3, v1, v2}, Lqe/x;->f(Lqd/j;Lqe/d;Lqd/j;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-interface {p2, p3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    invoke-interface {p2}, Ljava/util/Set;->size()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    const/16 p2, 0xa

    .line 49
    .line 50
    if-le p1, p2, :cond_2

    .line 51
    .line 52
    const/4 p1, 0x1

    .line 53
    return p1

    .line 54
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 55
    return p1
.end method

.method public final b(Ljava/util/Set;Ljava/util/LinkedHashSet;Ljava/util/Collection;)V
    .locals 1

    .line 1
    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lqd/j;

    .line 16
    .line 17
    invoke-virtual {p0, p1, p2, v0}, Lqe/r;->a(Ljava/util/Set;Ljava/util/LinkedHashSet;Lqd/j;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    :cond_1
    return-void
.end method

.method public final c(Lqd/r;)Lqe/a;
    .locals 3

    .line 1
    iget-object v0, p1, Lqd/l;->j:Lud/p;

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    invoke-virtual {p1}, Lqd/r;->P()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, v0, Lud/p;->k:Lpd/k;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x6

    .line 19
    if-eq v1, v2, :cond_2

    .line 20
    .line 21
    const/16 v2, 0x2b

    .line 22
    .line 23
    if-eq v1, v2, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    new-instance v1, Lqe/q;

    .line 27
    .line 28
    invoke-direct {v1, v0, p1}, Lqe/a;-><init>(Lud/p;Lqd/l;)V

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_2
    const/4 v1, 0x0

    .line 33
    invoke-virtual {v0, v1}, Lud/p;->S(I)Lqd/l;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    instance-of v1, v1, Lqd/r;

    .line 41
    .line 42
    if-nez v1, :cond_3

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    new-instance v1, Lqe/p;

    .line 46
    .line 47
    invoke-direct {v1, p0, v0, p1}, Lqe/p;-><init>(Lqe/r;Lud/p;Lqd/r;)V

    .line 48
    .line 49
    .line 50
    return-object v1

    .line 51
    :cond_4
    :goto_0
    const/4 p1, 0x0

    .line 52
    return-object p1
.end method

.method public final d()Z
    .locals 10

    .line 1
    iget-object v0, p0, Lqe/r;->a:Lud/r;

    .line 2
    .line 3
    iget-object v1, v0, Lud/r;->D:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, v0, Lud/r;->D:Ljava/util/List;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const/16 v4, 0x1388

    .line 13
    .line 14
    if-le v1, v4, :cond_0

    .line 15
    .line 16
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    new-instance v2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v4, "Multi-variable search skipped. Vars limit reached: "

    .line 23
    .line 24
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, " (expected less than 5000)"

    .line 31
    .line 32
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return v3

    .line 43
    :cond_0
    new-instance v1, Lqe/o;

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    invoke-direct {v1, p0, v4}, Lqe/o;-><init>(Lqe/r;I)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v2, v1}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, v0, Lud/r;->D:Ljava/util/List;

    .line 53
    .line 54
    new-instance v2, Lqe/o;

    .line 55
    .line 56
    const/4 v4, 0x1

    .line 57
    invoke-direct {v2, p0, v4}, Lqe/o;-><init>(Lqe/r;I)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v1, v2}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Lqe/r;->b:Landroidx/lifecycle/e0;

    .line 64
    .line 65
    iget-object v2, v1, Landroidx/lifecycle/e0;->a:Ljava/util/LinkedHashMap;

    .line 66
    .line 67
    iget-object v1, v1, Landroidx/lifecycle/e0;->a:Ljava/util/LinkedHashMap;

    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-interface {v2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    new-instance v4, Lce/n;

    .line 78
    .line 79
    const/16 v5, 0x17

    .line 80
    .line 81
    invoke-direct {v4, v5}, Lce/n;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-interface {v2, v4}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-interface {v2, v4}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    check-cast v2, Ljava/util/List;

    .line 97
    .line 98
    new-instance v4, Lqe/o;

    .line 99
    .line 100
    const/4 v5, 0x2

    .line 101
    invoke-direct {v4, p0, v5}, Lqe/o;-><init>(Lqe/r;I)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v2, v4}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-interface {v2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    new-instance v4, Lce/n;

    .line 116
    .line 117
    const/16 v5, 0x17

    .line 118
    .line 119
    invoke-direct {v4, v5}, Lce/n;-><init>(I)V

    .line 120
    .line 121
    .line 122
    invoke-interface {v2, v4}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-interface {v2, v4}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    check-cast v2, Ljava/util/List;

    .line 135
    .line 136
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    const/4 v5, 0x1

    .line 141
    if-eqz v4, :cond_1

    .line 142
    .line 143
    goto/16 :goto_4

    .line 144
    .line 145
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v7

    .line 157
    if-eqz v7, :cond_3

    .line 158
    .line 159
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    check-cast v7, Lqe/s;

    .line 164
    .line 165
    iget-boolean v8, v7, Lqe/s;->b:Z

    .line 166
    .line 167
    if-eqz v8, :cond_2

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_2
    iput v3, v7, Lqe/s;->e:I

    .line 171
    .line 172
    iget-object v8, v7, Lqe/s;->d:Ljava/util/List;

    .line 173
    .line 174
    invoke-interface {v8, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v8

    .line 178
    check-cast v8, Lqd/j;

    .line 179
    .line 180
    iput-object v8, v7, Lqe/s;->c:Lqd/j;

    .line 181
    .line 182
    goto :goto_0

    .line 183
    :cond_3
    move v6, v3

    .line 184
    :cond_4
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    :cond_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v8

    .line 192
    if-eqz v8, :cond_9

    .line 193
    .line 194
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    check-cast v8, Lqe/s;

    .line 199
    .line 200
    invoke-virtual {p0, v8}, Lqe/r;->e(Lqe/s;)Z

    .line 201
    .line 202
    .line 203
    move-result v8

    .line 204
    if-nez v8, :cond_5

    .line 205
    .line 206
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    check-cast v7, Lqe/s;

    .line 211
    .line 212
    invoke-virtual {v7}, Lqe/s;->a()Z

    .line 213
    .line 214
    .line 215
    move-result v7

    .line 216
    if-eqz v7, :cond_8

    .line 217
    .line 218
    if-lt v5, v4, :cond_6

    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_6
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v7

    .line 225
    check-cast v7, Lqe/s;

    .line 226
    .line 227
    move v8, v5

    .line 228
    :goto_1
    invoke-virtual {v7}, Lqe/s;->a()Z

    .line 229
    .line 230
    .line 231
    move-result v7

    .line 232
    if-eqz v7, :cond_8

    .line 233
    .line 234
    add-int/2addr v8, v5

    .line 235
    if-lt v8, v4, :cond_7

    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_7
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    check-cast v7, Lqe/s;

    .line 243
    .line 244
    goto :goto_1

    .line 245
    :cond_8
    add-int/2addr v6, v5

    .line 246
    const v7, 0xf4240

    .line 247
    .line 248
    .line 249
    if-le v6, v7, :cond_4

    .line 250
    .line 251
    :goto_2
    return v3

    .line 252
    :cond_9
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 257
    .line 258
    .line 259
    move-result v6

    .line 260
    if-eqz v6, :cond_a

    .line 261
    .line 262
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    check-cast v6, Lqe/s;

    .line 267
    .line 268
    iput-boolean v5, v6, Lqe/s;->b:Z

    .line 269
    .line 270
    goto :goto_3

    .line 271
    :cond_a
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    :cond_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 276
    .line 277
    .line 278
    move-result v4

    .line 279
    if-eqz v4, :cond_c

    .line 280
    .line 281
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    check-cast v4, Lqe/s;

    .line 286
    .line 287
    invoke-virtual {p0, v4}, Lqe/r;->e(Lqe/s;)Z

    .line 288
    .line 289
    .line 290
    move-result v4

    .line 291
    if-nez v4, :cond_b

    .line 292
    .line 293
    return v3

    .line 294
    :cond_c
    :goto_4
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    invoke-interface {v1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    new-instance v2, Lce/n;

    .line 303
    .line 304
    const/16 v4, 0x18

    .line 305
    .line 306
    invoke-direct {v2, v4}, Lce/n;-><init>(I)V

    .line 307
    .line 308
    .line 309
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    check-cast v1, Ljava/util/List;

    .line 322
    .line 323
    new-instance v2, Ljava/util/ArrayList;

    .line 324
    .line 325
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 326
    .line 327
    .line 328
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 333
    .line 334
    .line 335
    move-result v4

    .line 336
    if-eqz v4, :cond_f

    .line 337
    .line 338
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v4

    .line 342
    check-cast v4, Lqe/s;

    .line 343
    .line 344
    iget-object v6, v4, Lqe/s;->a:Lqd/s;

    .line 345
    .line 346
    iget-object v7, v4, Lqe/s;->c:Lqd/j;

    .line 347
    .line 348
    invoke-virtual {v7}, Lqd/j;->w()Z

    .line 349
    .line 350
    .line 351
    move-result v8

    .line 352
    if-nez v8, :cond_d

    .line 353
    .line 354
    goto :goto_5

    .line 355
    :cond_d
    iget-object v8, v6, Lqd/s;->l:Lp4/t;

    .line 356
    .line 357
    iget-object v8, v8, Lp4/t;->h:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v8, Lqd/j;

    .line 360
    .line 361
    invoke-virtual {v7, v8}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move-result v8

    .line 365
    if-eqz v8, :cond_e

    .line 366
    .line 367
    goto :goto_5

    .line 368
    :cond_e
    invoke-virtual {v6, v7}, Lqd/s;->n(Lqd/j;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    goto :goto_5

    .line 375
    :cond_f
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    move v2, v5

    .line 380
    :cond_10
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 381
    .line 382
    .line 383
    move-result v4

    .line 384
    if-eqz v4, :cond_11

    .line 385
    .line 386
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v4

    .line 390
    check-cast v4, Lqe/s;

    .line 391
    .line 392
    iget-object v6, v4, Lqe/s;->a:Lqd/s;

    .line 393
    .line 394
    iget-object v7, v4, Lqe/s;->c:Lqd/j;

    .line 395
    .line 396
    iget-object v8, p0, Lqe/r;->d:Lqe/x;

    .line 397
    .line 398
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    sget-object v9, Lqe/a0;->d:Lqe/a0;

    .line 402
    .line 403
    invoke-virtual {v8, v0, v6, v7, v9}, Lqe/x;->c(Lud/r;Lqd/s;Lqd/j;Lqe/a0;)I

    .line 404
    .line 405
    .line 406
    move-result v6

    .line 407
    if-ne v6, v5, :cond_10

    .line 408
    .line 409
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    const-string v4, "Multi-variable search result rejected for "

    .line 414
    .line 415
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    invoke-virtual {v0, v2}, Lnd/b0;->I(Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    move v2, v3

    .line 423
    goto :goto_6

    .line 424
    :cond_11
    return v2
.end method

.method public final e(Lqe/s;)Z
    .locals 2

    .line 1
    iget-boolean v0, p1, Lqe/s;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p1, Lqe/s;->f:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lqe/a;

    .line 23
    .line 24
    iget-object v1, p0, Lqe/r;->b:Landroidx/lifecycle/e0;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lqe/a;->a(Landroidx/lifecycle/e0;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    return p1

    .line 34
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 35
    return p1
.end method
