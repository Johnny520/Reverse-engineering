.class public final Lwb/up;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Landroid/content/Context;

.field public final synthetic j:Lgb/o;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lgb/o;Lwf/c;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/up;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/up;->i:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/up;->j:Lgb/o;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Lyf/i;-><init>(ILwf/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 3

    .line 1
    iget p1, p0, Lwb/up;->h:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lwb/up;

    .line 7
    .line 8
    iget-object v0, p0, Lwb/up;->j:Lgb/o;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    iget-object v2, p0, Lwb/up;->i:Landroid/content/Context;

    .line 12
    .line 13
    invoke-direct {p1, v2, v0, p2, v1}, Lwb/up;-><init>(Landroid/content/Context;Lgb/o;Lwf/c;I)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, Lwb/up;

    .line 18
    .line 19
    iget-object v0, p0, Lwb/up;->j:Lgb/o;

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    iget-object v2, p0, Lwb/up;->i:Landroid/content/Context;

    .line 23
    .line 24
    invoke-direct {p1, v2, v0, p2, v1}, Lwb/up;-><init>(Landroid/content/Context;Lgb/o;Lwf/c;I)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_1
    new-instance p1, Lwb/up;

    .line 29
    .line 30
    iget-object v0, p0, Lwb/up;->j:Lgb/o;

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    iget-object v2, p0, Lwb/up;->i:Landroid/content/Context;

    .line 34
    .line 35
    invoke-direct {p1, v2, v0, p2, v1}, Lwb/up;-><init>(Landroid/content/Context;Lgb/o;Lwf/c;I)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_2
    new-instance p1, Lwb/up;

    .line 40
    .line 41
    iget-object v0, p0, Lwb/up;->j:Lgb/o;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    iget-object v2, p0, Lwb/up;->i:Landroid/content/Context;

    .line 45
    .line 46
    invoke-direct {p1, v2, v0, p2, v1}, Lwb/up;-><init>(Landroid/content/Context;Lgb/o;Lwf/c;I)V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lwb/up;->h:I

    .line 2
    .line 3
    check-cast p1, Lqg/t;

    .line 4
    .line 5
    check-cast p2, Lwf/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lwb/up;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lwb/up;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lwb/up;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lwb/up;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lwb/up;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lwb/up;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lwb/up;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lwb/up;

    .line 41
    .line 42
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lwb/up;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lwb/up;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Lwb/up;

    .line 54
    .line 55
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 56
    .line 57
    invoke-virtual {p1, p2}, Lwb/up;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lwb/up;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, Lwb/up;->i:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v4, p0, Lwb/up;->j:Lgb/o;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget-object p1, Lgb/k;->a:Ljava/util/Set;

    .line 16
    .line 17
    invoke-static {v3, v4}, Lgb/k;->k(Landroid/content/Context;Lgb/o;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    move v1, v2

    .line 24
    :cond_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :pswitch_0
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, v4, Lgb/o;->a:Ljava/lang/String;

    .line 33
    .line 34
    :try_start_0
    invoke-static {v3, p1}, Lgb/q;->e(Landroid/content/Context;Ljava/lang/String;)Lgb/m;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-static {v3, v0}, Lgb/b;->d(Landroid/content/Context;Lgb/m;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v3, p1}, Lgb/q;->j(Landroid/content/Context;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    move-object p1, v0

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string v0, "\u8be5\u63d2\u4ef6\u4e0d\u662f\u7531\u5f53\u524d\u6a21\u5757\u5b89\u88c5\u4e0a\u4f20\u7684"

    .line 59
    .line 60
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    :goto_0
    new-instance v0, Lsf/f;

    .line 65
    .line 66
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    move-object p1, v0

    .line 70
    :goto_1
    new-instance v0, Lsf/g;

    .line 71
    .line 72
    invoke-direct {v0, p1}, Lsf/g;-><init>(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-object v0

    .line 76
    :pswitch_1
    iget-object v1, v4, Lgb/o;->a:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v3}, Lgb/q;->a(Landroid/content/Context;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    instance-of v0, p1, Lsf/f;

    .line 86
    .line 87
    if-nez v0, :cond_2

    .line 88
    .line 89
    :try_start_1
    invoke-static {v3}, Lgb/q;->a(Landroid/content/Context;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    check-cast v0, Lgb/s;

    .line 97
    .line 98
    invoke-static {v3, v1, v0}, Lgb/b;->j(Landroid/content/Context;Ljava/lang/String;Lgb/s;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {v0}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    check-cast v0, Lgb/l;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :catchall_1
    move-exception v0

    .line 109
    new-instance v2, Lsf/f;

    .line 110
    .line 111
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    move-object v0, v2

    .line 115
    :goto_2
    move-object v2, v0

    .line 116
    goto :goto_4

    .line 117
    :cond_2
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    if-eqz v0, :cond_3

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 125
    .line 126
    const-string v2, "\u5f53\u524d\u5fae\u4fe1\u8d26\u53f7\u8d44\u6599\u672a\u5c31\u7eea"

    .line 127
    .line 128
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    :goto_3
    new-instance v2, Lsf/f;

    .line 132
    .line 133
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 134
    .line 135
    .line 136
    :goto_4
    new-instance v4, Lsf/j;

    .line 137
    .line 138
    new-instance v5, Lsf/g;

    .line 139
    .line 140
    invoke-direct {v5, p1}, Lsf/g;-><init>(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :try_start_2
    invoke-static {v3}, Lgb/q;->a(Landroid/content/Context;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    instance-of v0, p1, Lsf/f;

    .line 148
    .line 149
    if-eqz v0, :cond_4

    .line 150
    .line 151
    const/4 p1, 0x0

    .line 152
    :cond_4
    check-cast p1, Lgb/s;

    .line 153
    .line 154
    invoke-static {v3, v1, p1}, Lgb/b;->b(Landroid/content/Context;Ljava/lang/String;Lgb/s;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    check-cast p1, Lgb/e;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 162
    .line 163
    goto :goto_5

    .line 164
    :catchall_2
    move-exception v0

    .line 165
    move-object p1, v0

    .line 166
    new-instance v0, Lsf/f;

    .line 167
    .line 168
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 169
    .line 170
    .line 171
    move-object p1, v0

    .line 172
    :goto_5
    new-instance v0, Lsf/g;

    .line 173
    .line 174
    invoke-direct {v0, p1}, Lsf/g;-><init>(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    new-instance p1, Lsf/g;

    .line 178
    .line 179
    invoke-direct {p1, v2}, Lsf/g;-><init>(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    invoke-direct {v4, v5, v0, p1}, Lsf/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    return-object v4

    .line 186
    :pswitch_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    iget-object v6, p0, Lwb/up;->i:Landroid/content/Context;

    .line 190
    .line 191
    iget-object p1, v4, Lgb/o;->a:Ljava/lang/String;

    .line 192
    .line 193
    :try_start_3
    invoke-static {v6, p1}, Lgb/b;->f(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-static {v0}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    check-cast v0, Lgb/o;

    .line 201
    .line 202
    invoke-static {v0}, Lgb/k;->u(Lgb/o;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    invoke-static {v3}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 207
    .line 208
    .line 209
    goto :goto_6

    .line 210
    :catchall_3
    move-exception v0

    .line 211
    new-instance v3, Lsf/f;

    .line 212
    .line 213
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 214
    .line 215
    .line 216
    move-object v0, v3

    .line 217
    :goto_6
    nop

    .line 218
    instance-of v3, v0, Lsf/f;

    .line 219
    .line 220
    if-nez v3, :cond_6

    .line 221
    .line 222
    check-cast v0, Lgb/o;

    .line 223
    .line 224
    invoke-static {v6, v0}, Lgb/k;->k(Landroid/content/Context;Lgb/o;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    if-eqz v3, :cond_5

    .line 229
    .line 230
    goto :goto_7

    .line 231
    :cond_5
    move v2, v1

    .line 232
    :goto_7
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    new-instance v3, Lsf/e;

    .line 237
    .line 238
    invoke-direct {v3, v0, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    move-object v0, v3

    .line 242
    :cond_6
    new-instance v2, Lsf/g;

    .line 243
    .line 244
    invoke-direct {v2, v0}, Lsf/g;-><init>(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    sget-object v0, Lgb/b;->a:Lokhttp3/MediaType;

    .line 248
    .line 249
    :try_start_4
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    if-nez v0, :cond_b

    .line 254
    .line 255
    sget-object v7, Lgb/a;->g:Lgb/a;

    .line 256
    .line 257
    const-string v0, "v1"

    .line 258
    .line 259
    const-string v3, "plugins"

    .line 260
    .line 261
    const-string v4, "snapshots"

    .line 262
    .line 263
    filled-new-array {v0, v3, p1, v4}, [Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    invoke-static {p1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 268
    .line 269
    .line 270
    move-result-object v8

    .line 271
    sget-object v11, Ltf/u;->g:Ltf/u;

    .line 272
    .line 273
    const/4 v9, 0x0

    .line 274
    const/4 v10, 0x0

    .line 275
    invoke-static/range {v6 .. v11}, Lgb/b;->l(Landroid/content/Context;Lgb/a;Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/Map;)Lorg/json/JSONObject;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    invoke-static {p1}, Lgb/b;->c(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    const-string v0, "items"

    .line 284
    .line 285
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    if-eqz p1, :cond_7

    .line 290
    .line 291
    goto :goto_8

    .line 292
    :cond_7
    new-instance p1, Lorg/json/JSONArray;

    .line 293
    .line 294
    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    .line 295
    .line 296
    .line 297
    :goto_8
    invoke-static {}, La/a;->E()Luf/c;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    :goto_9
    if-lt v1, v3, :cond_8

    .line 306
    .line 307
    invoke-static {v0}, La/a;->t(Luf/c;)Luf/c;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    goto :goto_b

    .line 312
    :catchall_4
    move-exception v0

    .line 313
    move-object p1, v0

    .line 314
    goto :goto_a

    .line 315
    :cond_8
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    if-eqz v4, :cond_a

    .line 320
    .line 321
    new-instance v5, Lgb/h;

    .line 322
    .line 323
    const-string v6, "versionId"

    .line 324
    .line 325
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v8

    .line 329
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    const-string v6, "versionName"

    .line 333
    .line 334
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v9

    .line 338
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    const-string v6, "contentHash"

    .line 342
    .line 343
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v10

    .line 347
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    const-string v6, "totalSize"

    .line 351
    .line 352
    const-wide/16 v11, 0x0

    .line 353
    .line 354
    invoke-virtual {v4, v6, v11, v12}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 355
    .line 356
    .line 357
    move-result-wide v6

    .line 358
    cmp-long v13, v6, v11

    .line 359
    .line 360
    if-gez v13, :cond_9

    .line 361
    .line 362
    move-wide v6, v11

    .line 363
    :cond_9
    const-string v11, "createdAt"

    .line 364
    .line 365
    invoke-virtual {v4, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v11

    .line 369
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    const-string v12, "releaseNotes"

    .line 373
    .line 374
    invoke-virtual {v4, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v12

    .line 378
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    invoke-direct/range {v5 .. v12}, Lgb/h;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v0, v5}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    :cond_a
    add-int/lit8 v1, v1, 0x1

    .line 388
    .line 389
    goto :goto_9

    .line 390
    :cond_b
    const-string p1, "\u8fdc\u7a0b\u63d2\u4ef6 ID \u4e0d\u80fd\u4e3a\u7a7a"

    .line 391
    .line 392
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 393
    .line 394
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 398
    :goto_a
    new-instance v0, Lsf/f;

    .line 399
    .line 400
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 401
    .line 402
    .line 403
    move-object p1, v0

    .line 404
    :goto_b
    new-instance v0, Lsf/g;

    .line 405
    .line 406
    invoke-direct {v0, p1}, Lsf/g;-><init>(Ljava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    new-instance p1, Lsf/e;

    .line 410
    .line 411
    invoke-direct {p1, v2, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    return-object p1

    .line 415
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
