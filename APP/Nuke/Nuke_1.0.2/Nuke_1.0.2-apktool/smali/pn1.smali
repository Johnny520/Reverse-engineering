.class public final Lpn1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Z

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:Z

.field public final e:Z


# direct methods
.method public constructor <init>(Lji2;Lpi2;)V
    .locals 10

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-boolean v2, p1, Lji2;->c:Z

    .line 12
    .line 13
    if-ne v2, v1, :cond_0

    .line 14
    .line 15
    iget-boolean v2, p2, Lpi2;->c:Z

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    move v2, v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v2, v0

    .line 22
    :goto_0
    iput-boolean v2, p0, Lpn1;->a:Z

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    iget-object v2, p1, Lji2;->a:Ljava/util/List;

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const/4 v2, 0x0

    .line 30
    :goto_1
    if-nez v2, :cond_2

    .line 31
    .line 32
    sget-object v2, Lbe0;->h:Lbe0;

    .line 33
    .line 34
    :cond_2
    new-instance v3, Ljava/util/ArrayList;

    .line 35
    .line 36
    const/16 v4, 0xa

    .line 37
    .line 38
    invoke-static {v2, v4}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_3

    .line 54
    .line 55
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    check-cast v5, Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v5}, Lxe1;->d0(Ljava/lang/String;)Lon1;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    iput-object v3, p0, Lpn1;->b:Ljava/util/ArrayList;

    .line 70
    .line 71
    iget-object v2, p2, Lpi2;->a:Ljava/util/Set;

    .line 72
    .line 73
    check-cast v2, Ljava/lang/Iterable;

    .line 74
    .line 75
    new-instance v3, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-static {v2, v4}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_4

    .line 93
    .line 94
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    check-cast v4, Ljava/lang/String;

    .line 99
    .line 100
    invoke-static {v4}, Lxe1;->d0(Ljava/lang/String;)Lon1;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_4
    iput-object v3, p0, Lpn1;->c:Ljava/util/ArrayList;

    .line 109
    .line 110
    iget-boolean v2, p0, Lpn1;->a:Z

    .line 111
    .line 112
    if-nez v2, :cond_13

    .line 113
    .line 114
    iget-object v2, p0, Lpn1;->b:Ljava/util/ArrayList;

    .line 115
    .line 116
    if-eqz v2, :cond_6

    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-eqz v3, :cond_6

    .line 123
    .line 124
    :cond_5
    move v2, v0

    .line 125
    goto/16 :goto_8

    .line 126
    .line 127
    :cond_6
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    :cond_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-eqz v3, :cond_5

    .line 136
    .line 137
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    check-cast v3, Lon1;

    .line 142
    .line 143
    iget-object v4, p0, Lpn1;->c:Ljava/util/ArrayList;

    .line 144
    .line 145
    if-eqz v4, :cond_9

    .line 146
    .line 147
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    if-eqz v5, :cond_9

    .line 152
    .line 153
    :cond_8
    move v3, v0

    .line 154
    goto/16 :goto_7

    .line 155
    .line 156
    :cond_9
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    :cond_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    if-eqz v5, :cond_8

    .line 165
    .line 166
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    check-cast v5, Lon1;

    .line 171
    .line 172
    iget-object v6, v3, Lon1;->c:Ljava/lang/String;

    .line 173
    .line 174
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    iget-object v7, v5, Lon1;->c:Ljava/lang/String;

    .line 178
    .line 179
    iget-object v8, v3, Lon1;->a:Ljava/lang/String;

    .line 180
    .line 181
    iget-object v9, v5, Lon1;->a:Ljava/lang/String;

    .line 182
    .line 183
    invoke-static {v8, v9}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v8

    .line 187
    if-eqz v8, :cond_10

    .line 188
    .line 189
    iget v8, v3, Lon1;->d:I

    .line 190
    .line 191
    iget v9, v5, Lon1;->d:I

    .line 192
    .line 193
    if-eq v8, v9, :cond_b

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_b
    iget-object v8, v3, Lon1;->b:Lnn1;

    .line 197
    .line 198
    sget-object v9, Lnn1;->h:Lnn1;

    .line 199
    .line 200
    if-eq v8, v9, :cond_11

    .line 201
    .line 202
    iget-object v5, v5, Lon1;->b:Lnn1;

    .line 203
    .line 204
    if-ne v5, v9, :cond_c

    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_c
    sget-object v9, Lnn1;->i:Lnn1;

    .line 208
    .line 209
    if-ne v8, v9, :cond_d

    .line 210
    .line 211
    if-ne v5, v9, :cond_d

    .line 212
    .line 213
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v5

    .line 217
    goto :goto_6

    .line 218
    :cond_d
    if-ne v8, v9, :cond_e

    .line 219
    .line 220
    invoke-static {v6, v7}, Lrg3;->l(Ljava/lang/String;Ljava/lang/String;)Z

    .line 221
    .line 222
    .line 223
    move-result v5

    .line 224
    goto :goto_6

    .line 225
    :cond_e
    if-ne v5, v9, :cond_f

    .line 226
    .line 227
    invoke-static {v7, v6}, Lrg3;->l(Ljava/lang/String;Ljava/lang/String;)Z

    .line 228
    .line 229
    .line 230
    move-result v5

    .line 231
    goto :goto_6

    .line 232
    :cond_f
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v5

    .line 236
    if-nez v5, :cond_11

    .line 237
    .line 238
    invoke-static {v6, v7}, Lrg3;->l(Ljava/lang/String;Ljava/lang/String;)Z

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    if-nez v5, :cond_11

    .line 243
    .line 244
    invoke-static {v7, v6}, Lrg3;->l(Ljava/lang/String;Ljava/lang/String;)Z

    .line 245
    .line 246
    .line 247
    move-result v5

    .line 248
    if-eqz v5, :cond_10

    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_10
    :goto_4
    move v5, v0

    .line 252
    goto :goto_6

    .line 253
    :cond_11
    :goto_5
    move v5, v1

    .line 254
    :goto_6
    if-eqz v5, :cond_a

    .line 255
    .line 256
    move v3, v1

    .line 257
    :goto_7
    if-eqz v3, :cond_7

    .line 258
    .line 259
    move v2, v1

    .line 260
    :goto_8
    if-eqz v2, :cond_12

    .line 261
    .line 262
    goto :goto_9

    .line 263
    :cond_12
    move v2, v0

    .line 264
    goto :goto_a

    .line 265
    :cond_13
    :goto_9
    move v2, v1

    .line 266
    :goto_a
    iput-boolean v2, p0, Lpn1;->d:Z

    .line 267
    .line 268
    if-eqz v2, :cond_18

    .line 269
    .line 270
    if-eqz p1, :cond_14

    .line 271
    .line 272
    iget-boolean v2, p1, Lji2;->c:Z

    .line 273
    .line 274
    if-ne v2, v1, :cond_14

    .line 275
    .line 276
    move v2, v1

    .line 277
    goto :goto_b

    .line 278
    :cond_14
    move v2, v0

    .line 279
    :goto_b
    if-eqz v2, :cond_15

    .line 280
    .line 281
    :goto_c
    move p1, v1

    .line 282
    goto :goto_e

    .line 283
    :cond_15
    if-eqz p1, :cond_16

    .line 284
    .line 285
    iget-boolean p1, p1, Lji2;->b:Z

    .line 286
    .line 287
    if-ne p1, v1, :cond_16

    .line 288
    .line 289
    move p1, v1

    .line 290
    goto :goto_d

    .line 291
    :cond_16
    move p1, v0

    .line 292
    :goto_d
    if-eqz p1, :cond_17

    .line 293
    .line 294
    iget-boolean p1, p2, Lpi2;->b:Z

    .line 295
    .line 296
    if-eqz p1, :cond_17

    .line 297
    .line 298
    goto :goto_c

    .line 299
    :cond_17
    move p1, v0

    .line 300
    :goto_e
    if-eqz p1, :cond_18

    .line 301
    .line 302
    move v0, v1

    .line 303
    :cond_18
    iput-boolean v0, p0, Lpn1;->e:Z

    .line 304
    .line 305
    return-void
.end method
