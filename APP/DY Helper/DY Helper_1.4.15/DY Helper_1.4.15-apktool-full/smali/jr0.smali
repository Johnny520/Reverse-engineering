.class public final Ljr0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Z

.field public β:Lk00;

.field public γ:Lcr0;

.field public final δ:Ljava/lang/ref/WeakReference;

.field public ε:I

.field public ζ:Z

.field public η:Z

.field public final θ:Ljava/util/ArrayList;

.field public final ι:Lf02;


# direct methods
.method public constructor <init>(Lhr0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Ljr0;->α:Z

    .line 12
    .line 13
    new-instance v0, Lk00;

    .line 14
    .line 15
    invoke-direct {v0}, Lk00;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Ljr0;->β:Lk00;

    .line 19
    .line 20
    sget-object v0, Lcr0;->ζ:Lcr0;

    .line 21
    .line 22
    iput-object v0, p0, Ljr0;->γ:Lcr0;

    .line 23
    .line 24
    new-instance v1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Ljr0;->θ:Ljava/util/ArrayList;

    .line 30
    .line 31
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 32
    .line 33
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Ljr0;->δ:Ljava/lang/ref/WeakReference;

    .line 37
    .line 38
    invoke-static {v0}, Lln0;->δ(Ljava/lang/Object;)Lf02;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, Ljr0;->ι:Lf02;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final α(Lgr0;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "addObserver"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljr0;->γ(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Ljr0;->γ:Lcr0;

    .line 10
    .line 11
    sget-object v1, Lcr0;->ε:Lcr0;

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object v1, Lcr0;->ζ:Lcr0;

    .line 17
    .line 18
    :goto_0
    new-instance v0, Lir0;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    sget-object v2, Lnr0;->α:Ljava/util/HashMap;

    .line 24
    .line 25
    instance-of v2, p1, Lfr0;

    .line 26
    .line 27
    instance-of v3, p1, Lgr;

    .line 28
    .line 29
    const/4 v4, 0x2

    .line 30
    const/4 v5, 0x0

    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x1

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    new-instance v2, Lir;

    .line 38
    .line 39
    move-object v3, p1

    .line 40
    check-cast v3, Lgr;

    .line 41
    .line 42
    move-object v8, p1

    .line 43
    check-cast v8, Lfr0;

    .line 44
    .line 45
    invoke-direct {v2, v3, v8}, Lir;-><init>(Lgr;Lfr0;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    if-eqz v3, :cond_2

    .line 50
    .line 51
    new-instance v2, Lir;

    .line 52
    .line 53
    move-object v3, p1

    .line 54
    check-cast v3, Lgr;

    .line 55
    .line 56
    invoke-direct {v2, v3, v5}, Lir;-><init>(Lgr;Lfr0;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    if-eqz v2, :cond_3

    .line 61
    .line 62
    move-object v2, p1

    .line 63
    check-cast v2, Lfr0;

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-static {v2}, Lnr0;->β(Ljava/lang/Class;)I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-ne v3, v4, :cond_6

    .line 75
    .line 76
    sget-object v3, Lnr0;->β:Ljava/util/HashMap;

    .line 77
    .line 78
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    check-cast v2, Ljava/util/List;

    .line 86
    .line 87
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eq v3, v7, :cond_5

    .line 92
    .line 93
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    new-array v8, v3, [Le90;

    .line 98
    .line 99
    if-gtz v3, :cond_4

    .line 100
    .line 101
    new-instance v2, Lll1;

    .line 102
    .line 103
    invoke-direct {v2, v7, v8}, Lll1;-><init>(ILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 112
    .line 113
    invoke-static {p0, p1}, Lnr0;->α(Ljava/lang/reflect/Constructor;Lgr0;)V

    .line 114
    .line 115
    .line 116
    throw v5

    .line 117
    :cond_5
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 122
    .line 123
    invoke-static {p0, p1}, Lnr0;->α(Ljava/lang/reflect/Constructor;Lgr0;)V

    .line 124
    .line 125
    .line 126
    throw v5

    .line 127
    :cond_6
    new-instance v2, Lir;

    .line 128
    .line 129
    invoke-direct {v2, p1}, Lir;-><init>(Lgr0;)V

    .line 130
    .line 131
    .line 132
    :goto_1
    iput-object v2, v0, Lir0;->β:Lfr0;

    .line 133
    .line 134
    iput-object v1, v0, Lir0;->α:Lcr0;

    .line 135
    .line 136
    iget-object v1, p0, Ljr0;->β:Lk00;

    .line 137
    .line 138
    invoke-virtual {v1, p1}, Lk00;->α(Ljava/lang/Object;)Lrp1;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    if-eqz v2, :cond_7

    .line 143
    .line 144
    iget-object v1, v2, Lrp1;->ζ:Ljava/lang/Object;

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_7
    iget-object v2, v1, Lk00;->ι:Ljava/util/HashMap;

    .line 148
    .line 149
    new-instance v3, Lrp1;

    .line 150
    .line 151
    invoke-direct {v3, p1, v0}, Lrp1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    iget v8, v1, Lup1;->θ:I

    .line 155
    .line 156
    add-int/2addr v8, v7

    .line 157
    iput v8, v1, Lup1;->θ:I

    .line 158
    .line 159
    iget-object v8, v1, Lup1;->ζ:Lrp1;

    .line 160
    .line 161
    if-nez v8, :cond_8

    .line 162
    .line 163
    iput-object v3, v1, Lup1;->ε:Lrp1;

    .line 164
    .line 165
    iput-object v3, v1, Lup1;->ζ:Lrp1;

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_8
    iput-object v3, v8, Lrp1;->η:Lrp1;

    .line 169
    .line 170
    iput-object v8, v3, Lrp1;->θ:Lrp1;

    .line 171
    .line 172
    iput-object v3, v1, Lup1;->ζ:Lrp1;

    .line 173
    .line 174
    :goto_2
    invoke-virtual {v2, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-object v1, v5

    .line 178
    :goto_3
    check-cast v1, Lir0;

    .line 179
    .line 180
    if-eqz v1, :cond_9

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_9
    iget-object v1, p0, Ljr0;->δ:Ljava/lang/ref/WeakReference;

    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    check-cast v1, Lhr0;

    .line 190
    .line 191
    if-nez v1, :cond_a

    .line 192
    .line 193
    :goto_4
    return-void

    .line 194
    :cond_a
    iget v2, p0, Ljr0;->ε:I

    .line 195
    .line 196
    if-nez v2, :cond_b

    .line 197
    .line 198
    iget-boolean v2, p0, Ljr0;->ζ:Z

    .line 199
    .line 200
    if-eqz v2, :cond_c

    .line 201
    .line 202
    :cond_b
    move v6, v7

    .line 203
    :cond_c
    invoke-virtual {p0, p1}, Ljr0;->β(Lgr0;)Lcr0;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    iget v3, p0, Ljr0;->ε:I

    .line 208
    .line 209
    add-int/2addr v3, v7

    .line 210
    iput v3, p0, Ljr0;->ε:I

    .line 211
    .line 212
    :goto_5
    iget-object v3, v0, Lir0;->α:Lcr0;

    .line 213
    .line 214
    invoke-virtual {v3, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    if-gez v2, :cond_11

    .line 219
    .line 220
    iget-object v2, p0, Ljr0;->β:Lk00;

    .line 221
    .line 222
    iget-object v2, v2, Lk00;->ι:Ljava/util/HashMap;

    .line 223
    .line 224
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    if-eqz v2, :cond_11

    .line 229
    .line 230
    iget-object v2, v0, Lir0;->α:Lcr0;

    .line 231
    .line 232
    iget-object v3, p0, Ljr0;->θ:Ljava/util/ArrayList;

    .line 233
    .line 234
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    sget-object v2, Lbr0;->Companion:Lzq0;

    .line 238
    .line 239
    iget-object v8, v0, Lir0;->α:Lcr0;

    .line 240
    .line 241
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    if-eq v2, v7, :cond_f

    .line 252
    .line 253
    if-eq v2, v4, :cond_e

    .line 254
    .line 255
    const/4 v8, 0x3

    .line 256
    if-eq v2, v8, :cond_d

    .line 257
    .line 258
    move-object v2, v5

    .line 259
    goto :goto_6

    .line 260
    :cond_d
    sget-object v2, Lbr0;->ON_RESUME:Lbr0;

    .line 261
    .line 262
    goto :goto_6

    .line 263
    :cond_e
    sget-object v2, Lbr0;->ON_START:Lbr0;

    .line 264
    .line 265
    goto :goto_6

    .line 266
    :cond_f
    sget-object v2, Lbr0;->ON_CREATE:Lbr0;

    .line 267
    .line 268
    :goto_6
    if-eqz v2, :cond_10

    .line 269
    .line 270
    invoke-virtual {v0, v1, v2}, Lir0;->α(Lhr0;Lbr0;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    sub-int/2addr v2, v7

    .line 278
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    invoke-virtual {p0, p1}, Ljr0;->β(Lgr0;)Lcr0;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    goto :goto_5

    .line 286
    :cond_10
    const-string p0, "no event up from "

    .line 287
    .line 288
    iget-object p1, v0, Lir0;->α:Lcr0;

    .line 289
    .line 290
    invoke-static {p1, p0}, Lγ;->σ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    return-void

    .line 294
    :cond_11
    if-nez v6, :cond_12

    .line 295
    .line 296
    invoke-virtual {p0}, Ljr0;->η()V

    .line 297
    .line 298
    .line 299
    :cond_12
    iget p1, p0, Ljr0;->ε:I

    .line 300
    .line 301
    add-int/lit8 p1, p1, -0x1

    .line 302
    .line 303
    iput p1, p0, Ljr0;->ε:I

    .line 304
    .line 305
    return-void
.end method

.method public final β(Lgr0;)Lcr0;
    .locals 3

    .line 1
    iget-object v0, p0, Ljr0;->β:Lk00;

    .line 2
    .line 3
    iget-object v0, v0, Lk00;->ι:Ljava/util/HashMap;

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
    check-cast p1, Lrp1;

    .line 17
    .line 18
    iget-object p1, p1, Lrp1;->θ:Lrp1;

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
    iget-object p1, p1, Lrp1;->ζ:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lir0;

    .line 27
    .line 28
    iget-object p1, p1, Lir0;->α:Lcr0;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move-object p1, v2

    .line 32
    :goto_1
    iget-object v0, p0, Ljr0;->θ:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    add-int/lit8 v1, v1, -0x1

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    move-object v2, v0

    .line 51
    check-cast v2, Lcr0;

    .line 52
    .line 53
    :cond_2
    iget-object p0, p0, Ljr0;->γ:Lcr0;

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    invoke-virtual {p1, p0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-gez v0, :cond_3

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    move-object p1, p0

    .line 68
    :goto_2
    if-eqz v2, :cond_4

    .line 69
    .line 70
    invoke-virtual {v2, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-gez p0, :cond_4

    .line 75
    .line 76
    return-object v2

    .line 77
    :cond_4
    return-object p1
.end method

.method public final γ(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-boolean p0, p0, Ljr0;->α:Z

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    invoke-static {}, Lq6;->π()Lq6;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget-object p0, p0, Lq6;->α:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lq6;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-ne p0, v0, :cond_0

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    const-string p0, "Method "

    .line 32
    .line 33
    const-string v0, " must be called on the main thread"

    .line 34
    .line 35
    invoke-static {p0, p1, v0}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {p0}, Lγ;->λ(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method

.method public final δ(Lbr0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "handleLifecycleEvent"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljr0;->γ(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lbr0;->α()Lcr0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Ljr0;->ε(Lcr0;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final ε(Lcr0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ljr0;->γ:Lcr0;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto/16 :goto_2

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Ljr0;->δ:Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lhr0;

    .line 14
    .line 15
    iget-object v1, p0, Ljr0;->γ:Lcr0;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object v2, Lcr0;->ζ:Lcr0;

    .line 21
    .line 22
    sget-object v3, Lcr0;->ε:Lcr0;

    .line 23
    .line 24
    if-ne v1, v2, :cond_2

    .line 25
    .line 26
    if-eq p1, v3, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    new-instance v1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v2, "State must be at least \'"

    .line 34
    .line 35
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    sget-object v2, Lcr0;->η:Lcr0;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v2, "\' to be moved to \'"

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string p1, "\' in component "

    .line 52
    .line 53
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p0

    .line 71
    :cond_2
    :goto_0
    if-ne v1, v3, :cond_4

    .line 72
    .line 73
    if-ne v1, p1, :cond_3

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    new-instance v1, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    const-string v2, "State is \'"

    .line 81
    .line 82
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v2, "\' and cannot be moved to `"

    .line 89
    .line 90
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string p1, "` in component "

    .line 97
    .line 98
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p0

    .line 116
    :cond_4
    :goto_1
    iput-object p1, p0, Ljr0;->γ:Lcr0;

    .line 117
    .line 118
    iget-boolean p1, p0, Ljr0;->ζ:Z

    .line 119
    .line 120
    const/4 v0, 0x1

    .line 121
    if-nez p1, :cond_7

    .line 122
    .line 123
    iget p1, p0, Ljr0;->ε:I

    .line 124
    .line 125
    if-eqz p1, :cond_5

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_5
    iput-boolean v0, p0, Ljr0;->ζ:Z

    .line 129
    .line 130
    invoke-virtual {p0}, Ljr0;->η()V

    .line 131
    .line 132
    .line 133
    const/4 p1, 0x0

    .line 134
    iput-boolean p1, p0, Ljr0;->ζ:Z

    .line 135
    .line 136
    iget-object p1, p0, Ljr0;->γ:Lcr0;

    .line 137
    .line 138
    if-ne p1, v3, :cond_6

    .line 139
    .line 140
    new-instance p1, Lk00;

    .line 141
    .line 142
    invoke-direct {p1}, Lk00;-><init>()V

    .line 143
    .line 144
    .line 145
    iput-object p1, p0, Ljr0;->β:Lk00;

    .line 146
    .line 147
    :cond_6
    :goto_2
    return-void

    .line 148
    :cond_7
    :goto_3
    iput-boolean v0, p0, Ljr0;->η:Z

    .line 149
    .line 150
    return-void
.end method

.method public final ζ(Lgr0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "removeObserver"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljr0;->γ(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Ljr0;->β:Lk00;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lk00;->β(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final η()V
    .locals 11

    .line 1
    iget-object v0, p0, Ljr0;->δ:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lhr0;

    .line 8
    .line 9
    if-eqz v0, :cond_e

    .line 10
    .line 11
    :cond_0
    iget-object v1, p0, Ljr0;->β:Lk00;

    .line 12
    .line 13
    iget v2, v1, Lup1;->θ:I

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
    iget-object v1, v1, Lup1;->ε:Lrp1;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v1, v1, Lrp1;->ζ:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lir0;

    .line 27
    .line 28
    iget-object v1, v1, Lir0;->α:Lcr0;

    .line 29
    .line 30
    iget-object v2, p0, Ljr0;->β:Lk00;

    .line 31
    .line 32
    iget-object v2, v2, Lup1;->ζ:Lrp1;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object v2, v2, Lrp1;->ζ:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Lir0;

    .line 40
    .line 41
    iget-object v2, v2, Lir0;->α:Lcr0;

    .line 42
    .line 43
    if-ne v1, v2, :cond_2

    .line 44
    .line 45
    iget-object v1, p0, Ljr0;->γ:Lcr0;

    .line 46
    .line 47
    if-ne v1, v2, :cond_2

    .line 48
    .line 49
    :goto_0
    iput-boolean v3, p0, Ljr0;->η:Z

    .line 50
    .line 51
    iget-object v0, p0, Ljr0;->ι:Lf02;

    .line 52
    .line 53
    iget-object p0, p0, Ljr0;->γ:Lcr0;

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Lf02;->θ(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    iput-boolean v3, p0, Ljr0;->η:Z

    .line 60
    .line 61
    iget-object v1, p0, Ljr0;->γ:Lcr0;

    .line 62
    .line 63
    iget-object v2, p0, Ljr0;->β:Lk00;

    .line 64
    .line 65
    iget-object v2, v2, Lup1;->ε:Lrp1;

    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget-object v2, v2, Lrp1;->ζ:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, Lir0;

    .line 73
    .line 74
    iget-object v2, v2, Lir0;->α:Lcr0;

    .line 75
    .line 76
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    const/4 v2, 0x0

    .line 81
    const/4 v3, 0x3

    .line 82
    const/4 v4, 0x2

    .line 83
    const/4 v5, 0x1

    .line 84
    iget-object v6, p0, Ljr0;->θ:Ljava/util/ArrayList;

    .line 85
    .line 86
    if-gez v1, :cond_8

    .line 87
    .line 88
    iget-object v1, p0, Ljr0;->β:Lk00;

    .line 89
    .line 90
    new-instance v7, Lqp1;

    .line 91
    .line 92
    iget-object v8, v1, Lup1;->ζ:Lrp1;

    .line 93
    .line 94
    iget-object v9, v1, Lup1;->ε:Lrp1;

    .line 95
    .line 96
    const/4 v10, 0x1

    .line 97
    invoke-direct {v7, v8, v9, v10}, Lqp1;-><init>(Lrp1;Lrp1;I)V

    .line 98
    .line 99
    .line 100
    iget-object v1, v1, Lup1;->η:Ljava/util/WeakHashMap;

    .line 101
    .line 102
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 103
    .line 104
    invoke-virtual {v1, v7, v8}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    :cond_3
    invoke-virtual {v7}, Lqp1;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_8

    .line 112
    .line 113
    iget-boolean v1, p0, Ljr0;->η:Z

    .line 114
    .line 115
    if-nez v1, :cond_8

    .line 116
    .line 117
    invoke-virtual {v7}, Lqp1;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    check-cast v1, Ljava/util/Map$Entry;

    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    check-cast v8, Lgr0;

    .line 131
    .line 132
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    check-cast v1, Lir0;

    .line 137
    .line 138
    :goto_1
    iget-object v9, v1, Lir0;->α:Lcr0;

    .line 139
    .line 140
    iget-object v10, p0, Ljr0;->γ:Lcr0;

    .line 141
    .line 142
    invoke-virtual {v9, v10}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    if-lez v9, :cond_3

    .line 147
    .line 148
    iget-boolean v9, p0, Ljr0;->η:Z

    .line 149
    .line 150
    if-nez v9, :cond_3

    .line 151
    .line 152
    iget-object v9, p0, Ljr0;->β:Lk00;

    .line 153
    .line 154
    iget-object v9, v9, Lk00;->ι:Ljava/util/HashMap;

    .line 155
    .line 156
    invoke-virtual {v9, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v9

    .line 160
    if-eqz v9, :cond_3

    .line 161
    .line 162
    sget-object v9, Lbr0;->Companion:Lzq0;

    .line 163
    .line 164
    iget-object v10, v1, Lir0;->α:Lcr0;

    .line 165
    .line 166
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 173
    .line 174
    .line 175
    move-result v9

    .line 176
    if-eq v9, v4, :cond_6

    .line 177
    .line 178
    if-eq v9, v3, :cond_5

    .line 179
    .line 180
    const/4 v10, 0x4

    .line 181
    if-eq v9, v10, :cond_4

    .line 182
    .line 183
    move-object v9, v2

    .line 184
    goto :goto_2

    .line 185
    :cond_4
    sget-object v9, Lbr0;->ON_PAUSE:Lbr0;

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_5
    sget-object v9, Lbr0;->ON_STOP:Lbr0;

    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_6
    sget-object v9, Lbr0;->ON_DESTROY:Lbr0;

    .line 192
    .line 193
    :goto_2
    if-eqz v9, :cond_7

    .line 194
    .line 195
    invoke-virtual {v9}, Lbr0;->α()Lcr0;

    .line 196
    .line 197
    .line 198
    move-result-object v10

    .line 199
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1, v0, v9}, Lir0;->α(Lhr0;Lbr0;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 206
    .line 207
    .line 208
    move-result v9

    .line 209
    sub-int/2addr v9, v5

    .line 210
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    goto :goto_1

    .line 214
    :cond_7
    const-string p0, "no event down from "

    .line 215
    .line 216
    iget-object v0, v1, Lir0;->α:Lcr0;

    .line 217
    .line 218
    invoke-static {v0, p0}, Lγ;->σ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    return-void

    .line 222
    :cond_8
    iget-object v1, p0, Ljr0;->β:Lk00;

    .line 223
    .line 224
    iget-object v1, v1, Lup1;->ζ:Lrp1;

    .line 225
    .line 226
    iget-boolean v7, p0, Ljr0;->η:Z

    .line 227
    .line 228
    if-nez v7, :cond_0

    .line 229
    .line 230
    if-eqz v1, :cond_0

    .line 231
    .line 232
    iget-object v7, p0, Ljr0;->γ:Lcr0;

    .line 233
    .line 234
    iget-object v1, v1, Lrp1;->ζ:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v1, Lir0;

    .line 237
    .line 238
    iget-object v1, v1, Lir0;->α:Lcr0;

    .line 239
    .line 240
    invoke-virtual {v7, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    if-lez v1, :cond_0

    .line 245
    .line 246
    iget-object v1, p0, Ljr0;->β:Lk00;

    .line 247
    .line 248
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    new-instance v7, Lsp1;

    .line 252
    .line 253
    invoke-direct {v7, v1}, Lsp1;-><init>(Lup1;)V

    .line 254
    .line 255
    .line 256
    iget-object v1, v1, Lup1;->η:Ljava/util/WeakHashMap;

    .line 257
    .line 258
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 259
    .line 260
    invoke-virtual {v1, v7, v8}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    :cond_9
    invoke-virtual {v7}, Lsp1;->hasNext()Z

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    if-eqz v1, :cond_0

    .line 268
    .line 269
    iget-boolean v1, p0, Ljr0;->η:Z

    .line 270
    .line 271
    if-nez v1, :cond_0

    .line 272
    .line 273
    invoke-virtual {v7}, Lsp1;->next()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    check-cast v1, Ljava/util/Map$Entry;

    .line 278
    .line 279
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v8

    .line 283
    check-cast v8, Lgr0;

    .line 284
    .line 285
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    check-cast v1, Lir0;

    .line 290
    .line 291
    :goto_3
    iget-object v9, v1, Lir0;->α:Lcr0;

    .line 292
    .line 293
    iget-object v10, p0, Ljr0;->γ:Lcr0;

    .line 294
    .line 295
    invoke-virtual {v9, v10}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 296
    .line 297
    .line 298
    move-result v9

    .line 299
    if-gez v9, :cond_9

    .line 300
    .line 301
    iget-boolean v9, p0, Ljr0;->η:Z

    .line 302
    .line 303
    if-nez v9, :cond_9

    .line 304
    .line 305
    iget-object v9, p0, Ljr0;->β:Lk00;

    .line 306
    .line 307
    iget-object v9, v9, Lk00;->ι:Ljava/util/HashMap;

    .line 308
    .line 309
    invoke-virtual {v9, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v9

    .line 313
    if-eqz v9, :cond_9

    .line 314
    .line 315
    iget-object v9, v1, Lir0;->α:Lcr0;

    .line 316
    .line 317
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    sget-object v9, Lbr0;->Companion:Lzq0;

    .line 321
    .line 322
    iget-object v10, v1, Lir0;->α:Lcr0;

    .line 323
    .line 324
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 331
    .line 332
    .line 333
    move-result v9

    .line 334
    if-eq v9, v5, :cond_c

    .line 335
    .line 336
    if-eq v9, v4, :cond_b

    .line 337
    .line 338
    if-eq v9, v3, :cond_a

    .line 339
    .line 340
    move-object v9, v2

    .line 341
    goto :goto_4

    .line 342
    :cond_a
    sget-object v9, Lbr0;->ON_RESUME:Lbr0;

    .line 343
    .line 344
    goto :goto_4

    .line 345
    :cond_b
    sget-object v9, Lbr0;->ON_START:Lbr0;

    .line 346
    .line 347
    goto :goto_4

    .line 348
    :cond_c
    sget-object v9, Lbr0;->ON_CREATE:Lbr0;

    .line 349
    .line 350
    :goto_4
    if-eqz v9, :cond_d

    .line 351
    .line 352
    invoke-virtual {v1, v0, v9}, Lir0;->α(Lhr0;Lbr0;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 356
    .line 357
    .line 358
    move-result v9

    .line 359
    sub-int/2addr v9, v5

    .line 360
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    goto :goto_3

    .line 364
    :cond_d
    const-string p0, "no event up from "

    .line 365
    .line 366
    iget-object v0, v1, Lir0;->α:Lcr0;

    .line 367
    .line 368
    invoke-static {v0, p0}, Lγ;->σ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    return-void

    .line 372
    :cond_e
    const-string p0, "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."

    .line 373
    .line 374
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    return-void
.end method
