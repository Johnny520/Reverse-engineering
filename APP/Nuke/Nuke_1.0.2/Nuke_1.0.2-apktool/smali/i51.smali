.class public Li51;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lga1;
.implements Llv1;
.implements Lm02;
.implements Ly02;
.implements Lnh2;
.implements Lhi2;
.implements Lkh1;


# instance fields
.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Li51;->h:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static k(Ljava/lang/String;Lim0;I)Landroid/graphics/Typeface;
    .locals 1

    .line 1
    if-nez p2, :cond_1

    .line 2
    .line 3
    sget-object v0, Lim0;->j:Lim0;

    .line 4
    .line 5
    invoke-static {p1, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    :cond_0
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    invoke-static {p1, p2}, Ltl;->A(Lim0;I)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p0, :cond_3

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-nez p2, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-static {p0, p1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_3
    :goto_0
    invoke-static {p1}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method

.method public static n(Ljava/lang/String;)Lc42;
    .locals 2

    .line 1
    const-string v0, "http/1.0"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lc42;->j:Lc42;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string v0, "http/1.1"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    sget-object p0, Lc42;->k:Lc42;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    const-string v0, "h2_prior_knowledge"

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    sget-object p0, Lc42;->n:Lc42;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    const-string v0, "h2"

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    sget-object p0, Lc42;->m:Lc42;

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_3
    const-string v0, "spdy/3.1"

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    sget-object p0, Lc42;->l:Lc42;

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_4
    const-string v0, "quic"

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    sget-object p0, Lc42;->o:Lc42;

    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_5
    const-string v0, "h3"

    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    invoke-static {p0, v0, v1}, Lwv2;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_6

    .line 75
    .line 76
    sget-object p0, Lc42;->p:Lc42;

    .line 77
    .line 78
    return-object p0

    .line 79
    :cond_6
    const-string v0, "Unexpected protocol: "

    .line 80
    .line 81
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-static {p0}, Lc80;->v(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    const/4 p0, 0x0

    .line 89
    return-object p0
.end method

.method public static t(Ljava/lang/String;)Luf2;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Luf2;->p:Lyf0;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v1, Lt2;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v1, v2, v0}, Lt2;-><init>(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {v1}, Lt2;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v1}, Lt2;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    move-object v3, v0

    .line 27
    check-cast v3, Luf2;

    .line 28
    .line 29
    iget-object v3, v3, Luf2;->h:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v3, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object v0, v2

    .line 39
    :goto_0
    check-cast v0, Luf2;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_2
    const-string v0, "Unsupported config type \'"

    .line 45
    .line 46
    const-string v1, "\'."

    .line 47
    .line 48
    invoke-static {v0, p0, v1}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v2
.end method

.method public static y(Ljava/lang/String;Ljava/lang/Object;)Lhg2;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static/range {p0 .. p1}, Lsp0;->e0(Ljava/lang/String;Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "area"

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Lcom/dokar/quickjs/binding/JsObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-string v3, ".area"

    .line 14
    .line 15
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-static {v3, v2}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/4 v4, 0x0

    .line 28
    sparse-switch v3, :sswitch_data_0

    .line 29
    .line 30
    .line 31
    goto/16 :goto_6

    .line 32
    .line 33
    :sswitch_0
    const-string v3, "cache"

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_a

    .line 40
    .line 41
    sget-object v2, Lfg2;->j:Lfg2;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :sswitch_1
    const-string v3, "data"

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_a

    .line 51
    .line 52
    sget-object v2, Lfg2;->i:Lfg2;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :sswitch_2
    const-string v3, "package"

    .line 56
    .line 57
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_a

    .line 62
    .line 63
    sget-object v2, Lfg2;->h:Lfg2;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :sswitch_3
    const-string v3, "external"

    .line 67
    .line 68
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_a

    .line 73
    .line 74
    sget-object v2, Lfg2;->k:Lfg2;

    .line 75
    .line 76
    :goto_0
    new-instance v3, Lhg2;

    .line 77
    .line 78
    const-string v5, "path"

    .line 79
    .line 80
    invoke-virtual {v1, v5}, Lcom/dokar/quickjs/binding/JsObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    const-string v5, ".path"

    .line 85
    .line 86
    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v0, v1}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    const/16 v5, 0x200

    .line 99
    .line 100
    if-gt v1, v5, :cond_9

    .line 101
    .line 102
    const/16 v1, 0x5c

    .line 103
    .line 104
    invoke-static {v0, v1}, Lpv2;->i0(Ljava/lang/CharSequence;C)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-nez v1, :cond_8

    .line 109
    .line 110
    const/4 v1, 0x0

    .line 111
    invoke-static {v0, v1}, Lpv2;->i0(Ljava/lang/CharSequence;C)Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-nez v5, :cond_8

    .line 116
    .line 117
    const/16 v5, 0x3a

    .line 118
    .line 119
    invoke-static {v0, v5}, Lpv2;->i0(Ljava/lang/CharSequence;C)Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-nez v5, :cond_8

    .line 124
    .line 125
    const/16 v5, 0x2f

    .line 126
    .line 127
    invoke-static {v0, v5}, Lpv2;->E0(Ljava/lang/String;C)Z

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    if-nez v6, :cond_7

    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 134
    .line 135
    .line 136
    move-result v6

    .line 137
    if-nez v6, :cond_0

    .line 138
    .line 139
    goto/16 :goto_5

    .line 140
    .line 141
    :cond_0
    const/4 v6, 0x1

    .line 142
    new-array v6, v6, [C

    .line 143
    .line 144
    aput-char v5, v6, v1

    .line 145
    .line 146
    invoke-static {v0, v6}, Lpv2;->C0(Ljava/lang/String;[C)Ljava/util/List;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_1

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_1
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    if-eqz v1, :cond_3

    .line 166
    .line 167
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    check-cast v1, Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    if-eqz v5, :cond_2

    .line 178
    .line 179
    const-string v5, "."

    .line 180
    .line 181
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v5

    .line 185
    if-nez v5, :cond_2

    .line 186
    .line 187
    const-string v5, ".."

    .line 188
    .line 189
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    if-nez v1, :cond_2

    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_2
    const/4 v12, 0x0

    .line 197
    const/16 v13, 0x1c

    .line 198
    .line 199
    const-string v8, "INVALID_ARGUMENT"

    .line 200
    .line 201
    const-string v9, "File path is not normalized."

    .line 202
    .line 203
    const/4 v10, 0x0

    .line 204
    const/4 v11, 0x0

    .line 205
    invoke-static/range {v8 .. v13}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 206
    .line 207
    .line 208
    return-object v4

    .line 209
    :cond_3
    :goto_2
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-eqz v0, :cond_4

    .line 214
    .line 215
    goto :goto_4

    .line 216
    :cond_4
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    if-eqz v1, :cond_6

    .line 225
    .line 226
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    check-cast v1, Ljava/lang/String;

    .line 231
    .line 232
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    const/16 v5, 0xff

    .line 237
    .line 238
    if-gt v1, v5, :cond_5

    .line 239
    .line 240
    goto :goto_3

    .line 241
    :cond_5
    const/4 v12, 0x0

    .line 242
    const/16 v13, 0x1c

    .line 243
    .line 244
    const-string v8, "INVALID_ARGUMENT"

    .line 245
    .line 246
    const-string v9, "File path segment is too long."

    .line 247
    .line 248
    const/4 v10, 0x0

    .line 249
    const/4 v11, 0x0

    .line 250
    invoke-static/range {v8 .. v13}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 251
    .line 252
    .line 253
    return-object v4

    .line 254
    :cond_6
    :goto_4
    const/4 v11, 0x0

    .line 255
    const/16 v12, 0x3e

    .line 256
    .line 257
    const-string v8, "/"

    .line 258
    .line 259
    const/4 v9, 0x0

    .line 260
    const/4 v10, 0x0

    .line 261
    invoke-static/range {v7 .. v12}, Ldu;->u0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    :goto_5
    invoke-direct {v3, v2, v0}, Lhg2;-><init>(Lfg2;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    return-object v3

    .line 269
    :cond_7
    const/4 v9, 0x0

    .line 270
    const/16 v10, 0x1c

    .line 271
    .line 272
    const-string v5, "INVALID_ARGUMENT"

    .line 273
    .line 274
    const-string v6, "File path must be relative."

    .line 275
    .line 276
    const/4 v7, 0x0

    .line 277
    const/4 v8, 0x0

    .line 278
    invoke-static/range {v5 .. v10}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 279
    .line 280
    .line 281
    return-object v4

    .line 282
    :cond_8
    const/4 v15, 0x0

    .line 283
    const/16 v16, 0x1c

    .line 284
    .line 285
    const-string v11, "INVALID_ARGUMENT"

    .line 286
    .line 287
    const-string v12, "File path contains unsupported characters."

    .line 288
    .line 289
    const/4 v13, 0x0

    .line 290
    const/4 v14, 0x0

    .line 291
    invoke-static/range {v11 .. v16}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 292
    .line 293
    .line 294
    return-object v4

    .line 295
    :cond_9
    const/4 v9, 0x0

    .line 296
    const/16 v10, 0x1c

    .line 297
    .line 298
    const-string v5, "INVALID_ARGUMENT"

    .line 299
    .line 300
    const-string v6, "File path is too long."

    .line 301
    .line 302
    const/4 v7, 0x0

    .line 303
    const/4 v8, 0x0

    .line 304
    invoke-static/range {v5 .. v10}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 305
    .line 306
    .line 307
    return-object v4

    .line 308
    :cond_a
    :goto_6
    const-string v1, ".area must be package, data, cache, or external."

    .line 309
    .line 310
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v6

    .line 314
    const/4 v9, 0x0

    .line 315
    const/16 v10, 0x1c

    .line 316
    .line 317
    const-string v5, "INVALID_ARGUMENT"

    .line 318
    .line 319
    const/4 v7, 0x0

    .line 320
    const/4 v8, 0x0

    .line 321
    invoke-static/range {v5 .. v10}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 322
    .line 323
    .line 324
    return-object v4

    .line 325
    :sswitch_data_0
    .sparse-switch
        -0x6c869c35 -> :sswitch_3
        -0x301acbba -> :sswitch_2
        0x2eefaa -> :sswitch_1
        0x5a0af82 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public a([BLjava/lang/Object;Ljava/security/MessageDigest;)V
    .locals 0

    .line 1
    return-void
.end method

.method public b(Llh2;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance p0, Leh2;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    const/16 v0, 0x8

    .line 5
    .line 6
    const-string v1, "HOST_ACCESS_UNAVAILABLE"

    .line 7
    .line 8
    const-string v2, "Host runtime access is unavailable in the current environment."

    .line 9
    .line 10
    invoke-direct {p0, v0, v1, v2, p1}, Leh2;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    throw p0
.end method

.method public c(Lim0;I)Landroid/graphics/Typeface;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-static {p0, p1, p2}, Li51;->k(Ljava/lang/String;Lim0;I)Landroid/graphics/Typeface;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public d(Llh2;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance p0, Leh2;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    const/16 v0, 0x8

    .line 5
    .line 6
    const-string v1, "HOST_ACCESS_UNAVAILABLE"

    .line 7
    .line 8
    const-string v2, "Host runtime access is unavailable in the current environment."

    .line 9
    .line 10
    invoke-direct {p0, v0, v1, v2, p1}, Leh2;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    throw p0
.end method

.method public e(Llh2;Ljava/lang/String;)Ljava/lang/Class;
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Leh2;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    const/16 p2, 0x8

    .line 8
    .line 9
    const-string v0, "HOST_ACCESS_UNAVAILABLE"

    .line 10
    .line 11
    const-string v1, "Host runtime access is unavailable in the current environment."

    .line 12
    .line 13
    invoke-direct {p0, p2, v0, v1, p1}, Leh2;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    throw p0
.end method

.method public h(Lso0;Lim0;I)Landroid/graphics/Typeface;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget p0, p2, Lim0;->h:I

    .line 5
    .line 6
    div-int/lit8 p0, p0, 0x64

    .line 7
    .line 8
    const-string p1, "sans-serif"

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-ltz p0, :cond_0

    .line 12
    .line 13
    if-ge p0, v0, :cond_0

    .line 14
    .line 15
    const-string p0, "sans-serif-thin"

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const/4 v1, 0x4

    .line 19
    if-gt v0, p0, :cond_1

    .line 20
    .line 21
    if-ge p0, v1, :cond_1

    .line 22
    .line 23
    const-string p0, "sans-serif-light"

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    if-ne p0, v1, :cond_3

    .line 27
    .line 28
    :cond_2
    :goto_0
    move-object p0, p1

    .line 29
    goto :goto_1

    .line 30
    :cond_3
    const/4 v0, 0x5

    .line 31
    if-ne p0, v0, :cond_4

    .line 32
    .line 33
    const-string p0, "sans-serif-medium"

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_4
    const/4 v0, 0x6

    .line 37
    const/16 v1, 0x8

    .line 38
    .line 39
    if-gt v0, p0, :cond_5

    .line 40
    .line 41
    if-ge p0, v1, :cond_5

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_5
    if-gt v1, p0, :cond_2

    .line 45
    .line 46
    const/16 v0, 0xb

    .line 47
    .line 48
    if-ge p0, v0, :cond_2

    .line 49
    .line 50
    const-string p0, "sans-serif-black"

    .line 51
    .line 52
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    const/4 v1, 0x0

    .line 57
    if-nez v0, :cond_6

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_6
    invoke-static {p0, p2, p3}, Li51;->k(Ljava/lang/String;Lim0;I)Landroid/graphics/Typeface;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 65
    .line 66
    invoke-static {p2, p3}, Ltl;->A(Lim0;I)I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-static {v0, v2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {p0, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_7

    .line 79
    .line 80
    invoke-static {v1, p2, p3}, Li51;->k(Ljava/lang/String;Lim0;I)Landroid/graphics/Typeface;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {p0, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_7

    .line 89
    .line 90
    move-object v1, p0

    .line 91
    :cond_7
    :goto_2
    if-nez v1, :cond_8

    .line 92
    .line 93
    invoke-static {p1, p2, p3}, Li51;->k(Ljava/lang/String;Lim0;I)Landroid/graphics/Typeface;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :cond_8
    return-object v1
.end method

.method public i()Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance p0, Lfi2;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/16 v1, 0x8

    .line 5
    .line 6
    const-string v2, "MESSAGING_UNAVAILABLE"

    .line 7
    .line 8
    const-string v3, "Host messaging is unavailable in the current environment."

    .line 9
    .line 10
    invoke-direct {p0, v2, v3, v1, v0}, Lfi2;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 11
    .line 12
    .line 13
    throw p0
.end method

.method public j(Lzj2;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance p0, Lfi2;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    const/16 v0, 0x8

    .line 5
    .line 6
    const-string v1, "MESSAGING_UNAVAILABLE"

    .line 7
    .line 8
    const-string v2, "Host messaging is unavailable in the current environment."

    .line 9
    .line 10
    invoke-direct {p0, v1, v2, v0, p1}, Lfi2;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 11
    .line 12
    .line 13
    throw p0
.end method

.method public l(Ljava/lang/reflect/Method;I)Ljava/lang/String;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string p1, "parameter #"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    add-int/lit8 p2, p2, 0x1

    .line 9
    .line 10
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public q(Lkj1;)Ljh1;
    .locals 3

    .line 1
    iget p0, p0, Li51;->h:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-class v1, Landroid/net/Uri;

    .line 5
    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance p0, Lkv2;

    .line 10
    .line 11
    const-class v2, Ljava/io/InputStream;

    .line 12
    .line 13
    invoke-virtual {p1, v1, v2}, Lkj1;->g(Ljava/lang/Class;Ljava/lang/Class;)Ljh1;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-direct {p0, p1, v0}, Lkv2;-><init>(Ljh1;I)V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    new-instance p0, Lkv2;

    .line 22
    .line 23
    const-class v2, Landroid/content/res/AssetFileDescriptor;

    .line 24
    .line 25
    invoke-virtual {p1, v1, v2}, Lkj1;->g(Ljava/lang/Class;Ljava/lang/Class;)Ljh1;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-direct {p0, p1, v0}, Lkv2;-><init>(Ljh1;I)V

    .line 30
    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_data_0
    .packed-switch 0x1c
        :pswitch_0
    .end packed-switch
.end method

.method public r(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/AssertionError;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public s(Ljava/lang/reflect/Method;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, Li51;->h:I

    .line 2
    .line 3
    const-string v1, ">"

    .line 4
    .line 5
    const-string v2, "<"

    .line 6
    .line 7
    const-string v3, "CreationExtras.Key@"

    .line 8
    .line 9
    const/16 v4, 0x10

    .line 10
    .line 11
    sparse-switch v0, :sswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :sswitch_0
    const-string p0, "SharingStarted.Lazily"

    .line 20
    .line 21
    return-object p0

    .line 22
    :sswitch_1
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    invoke-static {v4}, Lxe1;->j(I)V

    .line 27
    .line 28
    .line 29
    invoke-static {p0, v4}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const-class v0, Landroid/os/Bundle;

    .line 37
    .line 38
    invoke-static {v0}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Lbt;->c()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v3, p0, v2, v0, v1}, Lvi0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :sswitch_2
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    invoke-static {v4}, Lxe1;->j(I)V

    .line 56
    .line 57
    .line 58
    invoke-static {p0, v4}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    const-class v0, Ltc2;

    .line 66
    .line 67
    invoke-static {v0}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Lbt;->c()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v3, p0, v2, v0, v1}, Lvi0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    nop

    .line 81
    :sswitch_data_0
    .sparse-switch
        0x14 -> :sswitch_2
        0x15 -> :sswitch_1
        0x1b -> :sswitch_0
    .end sparse-switch
.end method

.method public x()V
    .locals 0

    .line 1
    return-void
.end method

.method public z(Lu22;Leg2;Ldf2;Lc20;Lu00;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p5, Lz42;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lz42;

    .line 7
    .line 8
    iget v1, v0, Lz42;->n:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lz42;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lz42;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, Lz42;-><init>(Li51;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, Lz42;->l:Ljava/lang/Object;

    .line 26
    .line 27
    iget p5, v0, Lz42;->n:I

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    if-eqz p5, :cond_2

    .line 31
    .line 32
    if-ne p5, v1, :cond_1

    .line 33
    .line 34
    iget-object p1, v0, Lz42;->k:Lf52;

    .line 35
    .line 36
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance p0, Lf52;

    .line 51
    .line 52
    invoke-direct {p0, p1, p2, p3, p4}, Lf52;-><init>(Lu22;Leg2;Ldf2;Lc20;)V

    .line 53
    .line 54
    .line 55
    iput-object p0, v0, Lz42;->k:Lf52;

    .line 56
    .line 57
    iput v1, v0, Lz42;->n:I

    .line 58
    .line 59
    invoke-static {p0, v0}, Lf52;->b(Lf52;Lu00;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    sget-object p2, Lk20;->h:Lk20;

    .line 64
    .line 65
    if-ne p1, p2, :cond_3

    .line 66
    .line 67
    return-object p2

    .line 68
    :cond_3
    return-object p0
.end method
