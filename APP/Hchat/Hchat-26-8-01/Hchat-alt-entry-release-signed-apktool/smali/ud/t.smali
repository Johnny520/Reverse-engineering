.class public final synthetic Lud/t;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lud/u;


# direct methods
.method public synthetic constructor <init>(Lud/u;I)V
    .locals 0

    .line 1
    iput p2, p0, Lud/t;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lud/t;->b:Lud/u;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 8

    .line 1
    iget v0, p0, Lud/t;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lud/t;->b:Lud/u;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljf/b;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    :try_start_0
    new-instance v0, Lud/e;

    .line 15
    .line 16
    invoke-direct {v0, v2, p1}, Lud/e;-><init>(Lud/u;Ljf/b;)V

    .line 17
    .line 18
    .line 19
    iget-object v3, v2, Lud/u;->n:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    iget-object v3, v2, Lud/u;->l:Ljava/util/HashMap;

    .line 25
    .line 26
    iget-object v4, v0, Lud/e;->m:Lod/a;

    .line 27
    .line 28
    invoke-virtual {v3, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    iget-object v3, v2, Lud/u;->m:Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-virtual {v0}, Lud/e;->Z()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v3, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :catch_0
    move-exception v0

    .line 42
    sget-object v3, Lud/u;->v:Lmh/b;

    .line 43
    .line 44
    const-string v4, "CLASS_"

    .line 45
    .line 46
    :try_start_1
    invoke-virtual {p1}, Ljf/b;->b()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 50
    :try_start_2
    invoke-static {v5}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-static {v2, v6}, Lod/a;->e(Lud/u;Lqd/j;)Lod/a;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    iget-object v1, v6, Lod/a;->h:Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catch_1
    move-exception v6

    .line 62
    :try_start_3
    const-string v7, "Failed to get name for class with type {}"

    .line 63
    .line 64
    invoke-interface {v3, v5, v7, v6}, Lmh/b;->n(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :goto_0
    if-eqz v1, :cond_0

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-eqz v6, :cond_1

    .line 74
    .line 75
    :cond_0
    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    :cond_1
    iget-object v4, p1, Ljf/b;->a:Lac/k;

    .line 80
    .line 81
    const/4 v5, 0x4

    .line 82
    invoke-virtual {v4, v5}, Lac/k;->B(I)V

    .line 83
    .line 84
    .line 85
    iget-object v4, v4, Lac/k;->i:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v4, Ljava/nio/ByteBuffer;

    .line 88
    .line 89
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->getInt()I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    sget-object v5, Lud/e;->F:Lmh/b;

    .line 94
    .line 95
    invoke-static {v1}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-static {v2, v5}, Lod/a;->e(Lud/u;Lqd/j;)Lod/a;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-virtual {v2, v5}, Lud/u;->f(Lod/a;)Lud/e;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    if-nez v6, :cond_2

    .line 108
    .line 109
    invoke-static {v2, v5, v4}, Lud/e;->T(Lud/u;Lod/a;I)Lud/e;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    const-string v2, "Load error"

    .line 114
    .line 115
    invoke-static {v1, v2, v0}, Lxe/h;->a(Lud/k;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_2
    new-instance v2, Laf/g;

    .line 120
    .line 121
    const-string v4, "Class already exist: "

    .line 122
    .line 123
    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 131
    :catch_2
    iget-object p1, p1, Ljf/b;->a:Lac/k;

    .line 132
    .line 133
    iget-object p1, p1, Lac/k;->j:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast p1, Lff/e;

    .line 136
    .line 137
    iget-object p1, p1, Lff/e;->b:Ljava/lang/String;

    .line 138
    .line 139
    const-string v1, "Failed to load class from file: {}"

    .line 140
    .line 141
    invoke-interface {v3, p1, v1, v0}, Lmh/b;->n(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :goto_1
    invoke-static {}, Lxe/s;->a()V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :pswitch_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 149
    .line 150
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    check-cast v0, Lod/a;

    .line 158
    .line 159
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    check-cast p1, Ljava/util/List;

    .line 164
    .line 165
    sget-object v3, Lwd/a;->a:Lmh/b;

    .line 166
    .line 167
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    const/4 v4, -0x1

    .line 172
    move v5, v4

    .line 173
    :cond_3
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result v6

    .line 177
    if-eqz v6, :cond_6

    .line 178
    .line 179
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    check-cast v6, Lud/e;

    .line 184
    .line 185
    if-nez v1, :cond_4

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_4
    iget-object v7, v6, Lud/e;->s:Ljava/lang/String;

    .line 189
    .line 190
    invoke-static {v7}, Lwd/a;->a(Ljava/lang/String;)I

    .line 191
    .line 192
    .line 193
    move-result v7

    .line 194
    if-eq v7, v4, :cond_3

    .line 195
    .line 196
    if-eq v5, v4, :cond_5

    .line 197
    .line 198
    if-ge v7, v5, :cond_3

    .line 199
    .line 200
    :cond_5
    :goto_3
    iget-object v1, v6, Lud/e;->s:Ljava/lang/String;

    .line 201
    .line 202
    invoke-static {v1}, Lwd/a;->a(Ljava/lang/String;)I

    .line 203
    .line 204
    .line 205
    move-result v5

    .line 206
    move-object v1, v6

    .line 207
    goto :goto_2

    .line 208
    :cond_6
    iget-object v3, v2, Lud/u;->l:Ljava/util/HashMap;

    .line 209
    .line 210
    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    iget-object v2, v2, Lud/u;->m:Ljava/util/HashMap;

    .line 214
    .line 215
    invoke-virtual {v1}, Lud/e;->Z()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    iget-object v2, v1, Lud/e;->s:Ljava/lang/String;

    .line 223
    .line 224
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    new-instance v4, Lme/a;

    .line 229
    .line 230
    const/16 v5, 0x10

    .line 231
    .line 232
    invoke-direct {v4, v5}, Lme/a;-><init>(I)V

    .line 233
    .line 234
    .line 235
    invoke-interface {v3, v4}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    invoke-interface {v3}, Ljava/util/stream/Stream;->sorted()Ljava/util/stream/Stream;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    const-string v4, "\n  "

    .line 244
    .line 245
    invoke-static {v4}, Ljava/util/stream/Collectors;->joining(Ljava/lang/CharSequence;)Ljava/util/stream/Collector;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    invoke-interface {v3, v4}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    check-cast v3, Ljava/lang/String;

    .line 254
    .line 255
    sget-object v4, Lud/u;->v:Lmh/b;

    .line 256
    .line 257
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 258
    .line 259
    .line 260
    move-result p1

    .line 261
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    filled-new-array {v0, p1, v3, v2}, [Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    const-string v0, "Found duplicated class: {}, count: {}, sources:\n  {}\n Keep class with source: {}, others will be removed."

    .line 270
    .line 271
    invoke-interface {v4, v0, p1}, Lmh/b;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    new-instance p1, Ljava/lang/StringBuilder;

    .line 275
    .line 276
    const-string v0, "Classes with same name are omitted, all sources:\n  "

    .line 277
    .line 278
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    const-string v0, "\n"

    .line 285
    .line 286
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    invoke-virtual {v1, p1}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    return-void

    .line 297
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
