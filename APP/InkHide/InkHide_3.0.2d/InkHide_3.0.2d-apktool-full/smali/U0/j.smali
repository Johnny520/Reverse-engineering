.class public abstract LU0/j;
.super LD/h;
.source "SourceFile"


# direct methods
.method public static Y(Ljava/lang/String;)Ljava/lang/String;
    .locals 13

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "\r"

    .line 7
    .line 8
    const-string v2, "\r\n"

    .line 9
    .line 10
    const-string v3, "\n"

    .line 11
    .line 12
    filled-new-array {v2, v3, v1}, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, LK0/h;

    .line 21
    .line 22
    new-instance v3, LF0/a;

    .line 23
    .line 24
    const/4 v4, 0x3

    .line 25
    invoke-direct {v3, v4, v1}, LF0/a;-><init>(ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, p0, v3}, LK0/h;-><init>(Ljava/lang/CharSequence;LM0/p;)V

    .line 29
    .line 30
    .line 31
    new-instance v1, LF0/a;

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    invoke-direct {v1, v3, p0}, LF0/a;-><init>(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    new-instance v3, LK0/h;

    .line 38
    .line 39
    invoke-direct {v3, v2, v1}, LK0/h;-><init>(LT0/h;LM0/l;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v3}, LT0/i;->Z(LT0/h;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    new-instance v2, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_1

    .line 60
    .line 61
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    move-object v5, v4

    .line 66
    check-cast v5, Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v5}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-nez v5, :cond_0

    .line 73
    .line 74
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-static {v2}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    const/4 v5, 0x0

    .line 96
    if-eqz v4, :cond_5

    .line 97
    .line 98
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    check-cast v4, Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    :goto_2
    const/4 v7, -0x1

    .line 109
    if-ge v5, v6, :cond_3

    .line 110
    .line 111
    invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    invoke-static {v8}, LD/h;->D(C)Z

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    if-nez v8, :cond_2

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_3
    move v5, v7

    .line 126
    :goto_3
    if-ne v5, v7, :cond_4

    .line 127
    .line 128
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    :cond_4
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_5
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    const/4 v4, 0x0

    .line 149
    if-nez v3, :cond_6

    .line 150
    .line 151
    move-object v3, v4

    .line 152
    goto :goto_5

    .line 153
    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    check-cast v3, Ljava/lang/Comparable;

    .line 158
    .line 159
    :cond_7
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    if-eqz v6, :cond_8

    .line 164
    .line 165
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    check-cast v6, Ljava/lang/Comparable;

    .line 170
    .line 171
    invoke-interface {v3, v6}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    if-lez v7, :cond_7

    .line 176
    .line 177
    move-object v3, v6

    .line 178
    goto :goto_4

    .line 179
    :cond_8
    :goto_5
    check-cast v3, Ljava/lang/Integer;

    .line 180
    .line 181
    if-eqz v3, :cond_9

    .line 182
    .line 183
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    goto :goto_6

    .line 188
    :cond_9
    move v2, v5

    .line 189
    :goto_6
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 190
    .line 191
    .line 192
    move-result p0

    .line 193
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 194
    .line 195
    .line 196
    invoke-static {v1}, LF0/l;->Y(Ljava/util/List;)I

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    new-instance v6, Ljava/util/ArrayList;

    .line 201
    .line 202
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 203
    .line 204
    .line 205
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v7

    .line 213
    if-eqz v7, :cond_10

    .line 214
    .line 215
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    add-int/lit8 v8, v5, 0x1

    .line 220
    .line 221
    if-ltz v5, :cond_f

    .line 222
    .line 223
    check-cast v7, Ljava/lang/String;

    .line 224
    .line 225
    if-eqz v5, :cond_a

    .line 226
    .line 227
    if-ne v5, v3, :cond_b

    .line 228
    .line 229
    :cond_a
    invoke-static {v7}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    if-eqz v5, :cond_b

    .line 234
    .line 235
    move-object v5, v4

    .line 236
    goto :goto_9

    .line 237
    :cond_b
    invoke-static {v7, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    if-ltz v2, :cond_e

    .line 241
    .line 242
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 243
    .line 244
    .line 245
    move-result v5

    .line 246
    if-le v2, v5, :cond_c

    .line 247
    .line 248
    goto :goto_8

    .line 249
    :cond_c
    move v5, v2

    .line 250
    :goto_8
    invoke-virtual {v7, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v5

    .line 254
    const-string v7, "substring(...)"

    .line 255
    .line 256
    invoke-static {v5, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    :goto_9
    if-eqz v5, :cond_d

    .line 260
    .line 261
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    :cond_d
    move v5, v8

    .line 265
    goto :goto_7

    .line 266
    :cond_e
    new-instance p0, Ljava/lang/StringBuilder;

    .line 267
    .line 268
    const-string v0, "Requested character count "

    .line 269
    .line 270
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    const-string v0, " is less than zero."

    .line 277
    .line 278
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 286
    .line 287
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    throw v0

    .line 295
    :cond_f
    invoke-static {}, LF0/l;->b0()V

    .line 296
    .line 297
    .line 298
    throw v4

    .line 299
    :cond_10
    new-instance v7, Ljava/lang/StringBuilder;

    .line 300
    .line 301
    invoke-direct {v7, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 302
    .line 303
    .line 304
    const-string v8, "\n"

    .line 305
    .line 306
    const-string v9, ""

    .line 307
    .line 308
    const-string v11, "..."

    .line 309
    .line 310
    const/4 v12, 0x0

    .line 311
    move-object v10, v9

    .line 312
    invoke-static/range {v6 .. v12}, LF0/k;->l0(Ljava/lang/Iterable;Ljava/lang/StringBuilder;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;LM0/l;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    const-string v0, "toString(...)"

    .line 320
    .line 321
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    return-object p0
.end method
