.class public final Lje2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lug;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ldq1;


# direct methods
.method public synthetic constructor <init>(Ldq1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lje2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lje2;->b:Ldq1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final c([Ljava/lang/Object;Lt00;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Lse2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lse2;

    .line 7
    .line 8
    iget v1, v0, Lse2;->m:I

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
    iput v1, v0, Lse2;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lse2;

    .line 21
    .line 22
    check-cast p2, Lu00;

    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lse2;-><init>(Lje2;Lu00;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p2, v0, Lse2;->k:Ljava/lang/Object;

    .line 28
    .line 29
    iget v1, v0, Lse2;->m:I

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v2, :cond_1

    .line 35
    .line 36
    :try_start_0
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_4

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
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, Lje2;->b:Ldq1;

    .line 51
    .line 52
    const/4 p2, 0x3

    .line 53
    :try_start_1
    invoke-static {p2, p1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    const/4 p2, 0x0

    .line 57
    aget-object v1, p1, p2

    .line 58
    .line 59
    const-string v3, "source"

    .line 60
    .line 61
    invoke-static {v3, v1}, Li51;->y(Ljava/lang/String;Ljava/lang/Object;)Lhg2;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    aget-object v3, p1, v2

    .line 66
    .line 67
    const-string v4, "target"

    .line 68
    .line 69
    invoke-static {v4, v3}, Li51;->y(Ljava/lang/String;Ljava/lang/Object;)Lhg2;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    const/4 v4, 0x2

    .line 74
    aget-object p1, p1, v4

    .line 75
    .line 76
    if-nez p1, :cond_3

    .line 77
    .line 78
    new-instance p1, Ldl2;

    .line 79
    .line 80
    invoke-direct {p1, p2, v2, p2}, Ldl2;-><init>(ZZZ)V

    .line 81
    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_3
    const-string v4, "options"

    .line 85
    .line 86
    invoke-static {v4, p1}, Lsp0;->e0(Ljava/lang/String;Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    new-instance v4, Ldl2;

    .line 91
    .line 92
    const-string v5, "overwrite"

    .line 93
    .line 94
    invoke-static {p1, v5}, Ls11;->r(Lcom/dokar/quickjs/binding/JsObject;Ljava/lang/String;)Ljava/lang/Boolean;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    if-eqz v5, :cond_4

    .line 99
    .line 100
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    goto :goto_1

    .line 105
    :cond_4
    move v5, p2

    .line 106
    :goto_1
    const-string v6, "atomic"

    .line 107
    .line 108
    invoke-static {p1, v6}, Ls11;->r(Lcom/dokar/quickjs/binding/JsObject;Ljava/lang/String;)Ljava/lang/Boolean;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    if-eqz v6, :cond_5

    .line 113
    .line 114
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    goto :goto_2

    .line 119
    :cond_5
    move v6, v2

    .line 120
    :goto_2
    const-string v7, "createParents"

    .line 121
    .line 122
    invoke-static {p1, v7}, Ls11;->r(Lcom/dokar/quickjs/binding/JsObject;Ljava/lang/String;)Ljava/lang/Boolean;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    if-eqz p1, :cond_6

    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    :cond_6
    invoke-direct {v4, v5, v6, p2}, Ldl2;-><init>(ZZZ)V

    .line 133
    .line 134
    .line 135
    move-object p1, v4

    .line 136
    :goto_3
    iput v2, v0, Lse2;->m:I

    .line 137
    .line 138
    invoke-virtual {p0, v1, v3, p1, v0}, Ldq1;->v(Lhg2;Lhg2;Ldl2;Lu00;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p2
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 142
    sget-object p0, Lk20;->h:Lk20;

    .line 143
    .line 144
    if-ne p2, p0, :cond_7

    .line 145
    .line 146
    return-object p0

    .line 147
    :cond_7
    :goto_4
    :try_start_2
    check-cast p2, Lgg2;

    .line 148
    .line 149
    invoke-virtual {p2}, Lgg2;->a()Lcom/dokar/quickjs/binding/JsObject;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-static {p0}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 154
    .line 155
    .line 156
    move-result-object p0
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 157
    return-object p0

    .line 158
    :catchall_0
    move-exception p0

    .line 159
    invoke-static {p0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    return-object p0

    .line 164
    :catch_0
    move-exception p0

    .line 165
    throw p0
.end method


# virtual methods
.method public final a([Ljava/lang/Object;Lt00;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget v3, v0, Lje2;->a:I

    .line 8
    .line 9
    sget-object v4, La83;->a:La83;

    .line 10
    .line 11
    const-string v5, "recursive"

    .line 12
    .line 13
    const-string v6, "createParents"

    .line 14
    .line 15
    const-string v7, "atomic"

    .line 16
    .line 17
    const-string v8, "overwrite"

    .line 18
    .line 19
    const-string v10, "options"

    .line 20
    .line 21
    const-string v12, "ref"

    .line 22
    .line 23
    iget-object v13, v0, Lje2;->b:Ldq1;

    .line 24
    .line 25
    const-string v15, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    sget-object v14, Lk20;->h:Lk20;

    .line 28
    .line 29
    const/16 v16, 0x2

    .line 30
    .line 31
    const/4 v11, 0x1

    .line 32
    const/high16 v17, -0x80000000

    .line 33
    .line 34
    const/4 v9, 0x0

    .line 35
    packed-switch v3, :pswitch_data_0

    .line 36
    .line 37
    .line 38
    instance-of v3, v2, Lte2;

    .line 39
    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    move-object v3, v2

    .line 43
    check-cast v3, Lte2;

    .line 44
    .line 45
    iget v4, v3, Lte2;->m:I

    .line 46
    .line 47
    and-int v5, v4, v17

    .line 48
    .line 49
    if-eqz v5, :cond_0

    .line 50
    .line 51
    sub-int v4, v4, v17

    .line 52
    .line 53
    iput v4, v3, Lte2;->m:I

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    new-instance v3, Lte2;

    .line 57
    .line 58
    check-cast v2, Lu00;

    .line 59
    .line 60
    invoke-direct {v3, v0, v2}, Lte2;-><init>(Lje2;Lu00;)V

    .line 61
    .line 62
    .line 63
    :goto_0
    iget-object v0, v3, Lte2;->k:Ljava/lang/Object;

    .line 64
    .line 65
    iget v2, v3, Lte2;->m:I

    .line 66
    .line 67
    if-eqz v2, :cond_2

    .line 68
    .line 69
    if-ne v2, v11, :cond_1

    .line 70
    .line 71
    :try_start_0
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_1
    invoke-static {v15}, Ls;->l(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const/4 v14, 0x0

    .line 79
    goto :goto_5

    .line 80
    :cond_2
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    const/4 v0, 0x3

    .line 84
    :try_start_1
    invoke-static {v0, v1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    aget-object v0, v1, v9

    .line 88
    .line 89
    const-string v2, "source"

    .line 90
    .line 91
    invoke-static {v2, v0}, Li51;->y(Ljava/lang/String;Ljava/lang/Object;)Lhg2;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    aget-object v2, v1, v11

    .line 96
    .line 97
    const-string v4, "target"

    .line 98
    .line 99
    invoke-static {v4, v2}, Li51;->y(Ljava/lang/String;Ljava/lang/Object;)Lhg2;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    aget-object v1, v1, v16

    .line 104
    .line 105
    if-nez v1, :cond_3

    .line 106
    .line 107
    new-instance v1, Ldl2;

    .line 108
    .line 109
    invoke-direct {v1, v9, v11, v9}, Ldl2;-><init>(ZZZ)V

    .line 110
    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_3
    invoke-static {v10, v1}, Lsp0;->e0(Ljava/lang/String;Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    new-instance v4, Ldl2;

    .line 118
    .line 119
    invoke-static {v1, v8}, Ls11;->r(Lcom/dokar/quickjs/binding/JsObject;Ljava/lang/String;)Ljava/lang/Boolean;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    if-eqz v5, :cond_4

    .line 124
    .line 125
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    goto :goto_1

    .line 130
    :cond_4
    move v5, v9

    .line 131
    :goto_1
    invoke-static {v1, v7}, Ls11;->r(Lcom/dokar/quickjs/binding/JsObject;Ljava/lang/String;)Ljava/lang/Boolean;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    if-eqz v7, :cond_5

    .line 136
    .line 137
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    goto :goto_2

    .line 142
    :cond_5
    move v7, v11

    .line 143
    :goto_2
    invoke-static {v1, v6}, Ls11;->r(Lcom/dokar/quickjs/binding/JsObject;Ljava/lang/String;)Ljava/lang/Boolean;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    if-eqz v1, :cond_6

    .line 148
    .line 149
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 150
    .line 151
    .line 152
    move-result v9

    .line 153
    :cond_6
    invoke-direct {v4, v5, v7, v9}, Ldl2;-><init>(ZZZ)V

    .line 154
    .line 155
    .line 156
    move-object v1, v4

    .line 157
    :goto_3
    iput v11, v3, Lte2;->m:I

    .line 158
    .line 159
    invoke-virtual {v13, v0, v2, v1, v3}, Ldq1;->I(Lhg2;Lhg2;Ldl2;Lu00;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    if-ne v0, v14, :cond_7

    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_7
    :goto_4
    check-cast v0, Lgg2;

    .line 167
    .line 168
    invoke-virtual {v0}, Lgg2;->a()Lcom/dokar/quickjs/binding/JsObject;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-static {v0}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 173
    .line 174
    .line 175
    move-result-object v14
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 176
    goto :goto_5

    .line 177
    :catchall_0
    move-exception v0

    .line 178
    invoke-static {v0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 179
    .line 180
    .line 181
    move-result-object v14

    .line 182
    :goto_5
    return-object v14

    .line 183
    :catch_0
    move-exception v0

    .line 184
    throw v0

    .line 185
    :pswitch_0
    invoke-direct/range {p0 .. p2}, Lje2;->c([Ljava/lang/Object;Lt00;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    return-object v0

    .line 190
    :pswitch_1
    instance-of v3, v2, Lre2;

    .line 191
    .line 192
    if-eqz v3, :cond_8

    .line 193
    .line 194
    move-object v3, v2

    .line 195
    check-cast v3, Lre2;

    .line 196
    .line 197
    iget v6, v3, Lre2;->m:I

    .line 198
    .line 199
    and-int v7, v6, v17

    .line 200
    .line 201
    if-eqz v7, :cond_8

    .line 202
    .line 203
    sub-int v6, v6, v17

    .line 204
    .line 205
    iput v6, v3, Lre2;->m:I

    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_8
    new-instance v3, Lre2;

    .line 209
    .line 210
    check-cast v2, Lu00;

    .line 211
    .line 212
    invoke-direct {v3, v0, v2}, Lre2;-><init>(Lje2;Lu00;)V

    .line 213
    .line 214
    .line 215
    :goto_6
    iget-object v0, v3, Lre2;->k:Ljava/lang/Object;

    .line 216
    .line 217
    iget v2, v3, Lre2;->m:I

    .line 218
    .line 219
    if-eqz v2, :cond_a

    .line 220
    .line 221
    if-ne v2, v11, :cond_9

    .line 222
    .line 223
    :try_start_2
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 224
    .line 225
    .line 226
    goto :goto_9

    .line 227
    :cond_9
    invoke-static {v15}, Ls;->l(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    const/4 v14, 0x0

    .line 231
    goto :goto_a

    .line 232
    :cond_a
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    move/from16 v0, v16

    .line 236
    .line 237
    :try_start_3
    invoke-static {v0, v1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    aget-object v0, v1, v9

    .line 241
    .line 242
    invoke-static {v12, v0}, Li51;->y(Ljava/lang/String;Ljava/lang/Object;)Lhg2;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    aget-object v1, v1, v11

    .line 247
    .line 248
    if-nez v1, :cond_b

    .line 249
    .line 250
    new-instance v1, Lui2;

    .line 251
    .line 252
    invoke-direct {v1, v9, v9}, Lui2;-><init>(ZZ)V

    .line 253
    .line 254
    .line 255
    goto :goto_8

    .line 256
    :cond_b
    invoke-static {v10, v1}, Lsp0;->e0(Ljava/lang/String;Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    new-instance v2, Lui2;

    .line 261
    .line 262
    invoke-static {v1, v5}, Ls11;->r(Lcom/dokar/quickjs/binding/JsObject;Ljava/lang/String;)Ljava/lang/Boolean;

    .line 263
    .line 264
    .line 265
    move-result-object v5

    .line 266
    if-eqz v5, :cond_c

    .line 267
    .line 268
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 269
    .line 270
    .line 271
    move-result v5

    .line 272
    goto :goto_7

    .line 273
    :cond_c
    move v5, v9

    .line 274
    :goto_7
    const-string v6, "missingOk"

    .line 275
    .line 276
    invoke-static {v1, v6}, Ls11;->r(Lcom/dokar/quickjs/binding/JsObject;Ljava/lang/String;)Ljava/lang/Boolean;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    if-eqz v1, :cond_d

    .line 281
    .line 282
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 283
    .line 284
    .line 285
    move-result v9

    .line 286
    :cond_d
    invoke-direct {v2, v5, v9}, Lui2;-><init>(ZZ)V

    .line 287
    .line 288
    .line 289
    move-object v1, v2

    .line 290
    :goto_8
    iput v11, v3, Lre2;->m:I

    .line 291
    .line 292
    invoke-virtual {v13, v0, v1, v3}, Ldq1;->R(Lhg2;Lui2;Lu00;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    if-ne v0, v14, :cond_e

    .line 297
    .line 298
    goto :goto_a

    .line 299
    :cond_e
    :goto_9
    invoke-static {v4}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 300
    .line 301
    .line 302
    move-result-object v14
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 303
    goto :goto_a

    .line 304
    :catchall_1
    move-exception v0

    .line 305
    invoke-static {v0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 306
    .line 307
    .line 308
    move-result-object v14

    .line 309
    :goto_a
    return-object v14

    .line 310
    :catch_1
    move-exception v0

    .line 311
    throw v0

    .line 312
    :pswitch_2
    instance-of v3, v2, Lqe2;

    .line 313
    .line 314
    if-eqz v3, :cond_f

    .line 315
    .line 316
    move-object v3, v2

    .line 317
    check-cast v3, Lqe2;

    .line 318
    .line 319
    iget v6, v3, Lqe2;->m:I

    .line 320
    .line 321
    and-int v7, v6, v17

    .line 322
    .line 323
    if-eqz v7, :cond_f

    .line 324
    .line 325
    sub-int v6, v6, v17

    .line 326
    .line 327
    iput v6, v3, Lqe2;->m:I

    .line 328
    .line 329
    goto :goto_b

    .line 330
    :cond_f
    new-instance v3, Lqe2;

    .line 331
    .line 332
    check-cast v2, Lu00;

    .line 333
    .line 334
    invoke-direct {v3, v0, v2}, Lqe2;-><init>(Lje2;Lu00;)V

    .line 335
    .line 336
    .line 337
    :goto_b
    iget-object v0, v3, Lqe2;->k:Ljava/lang/Object;

    .line 338
    .line 339
    iget v2, v3, Lqe2;->m:I

    .line 340
    .line 341
    if-eqz v2, :cond_11

    .line 342
    .line 343
    if-ne v2, v11, :cond_10

    .line 344
    .line 345
    :try_start_4
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 346
    .line 347
    .line 348
    goto :goto_c

    .line 349
    :cond_10
    invoke-static {v15}, Ls;->l(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    const/4 v14, 0x0

    .line 353
    goto :goto_d

    .line 354
    :cond_11
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    const/4 v0, 0x2

    .line 358
    :try_start_5
    invoke-static {v0, v1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    aget-object v0, v1, v9

    .line 362
    .line 363
    invoke-static {v12, v0}, Li51;->y(Ljava/lang/String;Ljava/lang/Object;)Lhg2;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    aget-object v1, v1, v11

    .line 368
    .line 369
    invoke-static {v5, v1}, Lsp0;->X(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v1

    .line 373
    iput v11, v3, Lqe2;->m:I

    .line 374
    .line 375
    invoke-virtual {v13, v0, v1, v3}, Ldq1;->w(Lhg2;ZLu00;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    if-ne v0, v14, :cond_12

    .line 380
    .line 381
    goto :goto_d

    .line 382
    :cond_12
    :goto_c
    invoke-static {v4}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 383
    .line 384
    .line 385
    move-result-object v14
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 386
    goto :goto_d

    .line 387
    :catchall_2
    move-exception v0

    .line 388
    invoke-static {v0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 389
    .line 390
    .line 391
    move-result-object v14

    .line 392
    :goto_d
    return-object v14

    .line 393
    :catch_2
    move-exception v0

    .line 394
    throw v0

    .line 395
    :pswitch_3
    instance-of v3, v2, Lpe2;

    .line 396
    .line 397
    if-eqz v3, :cond_13

    .line 398
    .line 399
    move-object v3, v2

    .line 400
    check-cast v3, Lpe2;

    .line 401
    .line 402
    iget v4, v3, Lpe2;->m:I

    .line 403
    .line 404
    and-int v5, v4, v17

    .line 405
    .line 406
    if-eqz v5, :cond_13

    .line 407
    .line 408
    sub-int v4, v4, v17

    .line 409
    .line 410
    iput v4, v3, Lpe2;->m:I

    .line 411
    .line 412
    goto :goto_e

    .line 413
    :cond_13
    new-instance v3, Lpe2;

    .line 414
    .line 415
    check-cast v2, Lu00;

    .line 416
    .line 417
    invoke-direct {v3, v0, v2}, Lpe2;-><init>(Lje2;Lu00;)V

    .line 418
    .line 419
    .line 420
    :goto_e
    iget-object v0, v3, Lpe2;->k:Ljava/lang/Object;

    .line 421
    .line 422
    iget v2, v3, Lpe2;->m:I

    .line 423
    .line 424
    if-eqz v2, :cond_15

    .line 425
    .line 426
    if-ne v2, v11, :cond_14

    .line 427
    .line 428
    :try_start_6
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 429
    .line 430
    .line 431
    goto :goto_12

    .line 432
    :cond_14
    invoke-static {v15}, Ls;->l(Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    const/4 v14, 0x0

    .line 436
    goto/16 :goto_13

    .line 437
    .line 438
    :cond_15
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    const/4 v0, 0x3

    .line 442
    :try_start_7
    invoke-static {v0, v1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    aget-object v0, v1, v9

    .line 446
    .line 447
    invoke-static {v12, v0}, Li51;->y(Ljava/lang/String;Ljava/lang/Object;)Lhg2;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    aget-object v2, v1, v11

    .line 452
    .line 453
    const-string v4, "text"

    .line 454
    .line 455
    invoke-static {v4, v2}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v2

    .line 459
    const/16 v16, 0x2

    .line 460
    .line 461
    aget-object v1, v1, v16

    .line 462
    .line 463
    if-nez v1, :cond_16

    .line 464
    .line 465
    new-instance v1, Ldl2;

    .line 466
    .line 467
    invoke-direct {v1, v9, v11, v9}, Ldl2;-><init>(ZZZ)V

    .line 468
    .line 469
    .line 470
    goto :goto_11

    .line 471
    :cond_16
    invoke-static {v10, v1}, Lsp0;->e0(Ljava/lang/String;Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    new-instance v4, Ldl2;

    .line 476
    .line 477
    invoke-static {v1, v8}, Ls11;->r(Lcom/dokar/quickjs/binding/JsObject;Ljava/lang/String;)Ljava/lang/Boolean;

    .line 478
    .line 479
    .line 480
    move-result-object v5

    .line 481
    if-eqz v5, :cond_17

    .line 482
    .line 483
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 484
    .line 485
    .line 486
    move-result v5

    .line 487
    goto :goto_f

    .line 488
    :cond_17
    move v5, v9

    .line 489
    :goto_f
    invoke-static {v1, v7}, Ls11;->r(Lcom/dokar/quickjs/binding/JsObject;Ljava/lang/String;)Ljava/lang/Boolean;

    .line 490
    .line 491
    .line 492
    move-result-object v7

    .line 493
    if-eqz v7, :cond_18

    .line 494
    .line 495
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 496
    .line 497
    .line 498
    move-result v7

    .line 499
    goto :goto_10

    .line 500
    :cond_18
    move v7, v11

    .line 501
    :goto_10
    invoke-static {v1, v6}, Ls11;->r(Lcom/dokar/quickjs/binding/JsObject;Ljava/lang/String;)Ljava/lang/Boolean;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    if-eqz v1, :cond_19

    .line 506
    .line 507
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 508
    .line 509
    .line 510
    move-result v9

    .line 511
    :cond_19
    invoke-direct {v4, v5, v7, v9}, Ldl2;-><init>(ZZZ)V

    .line 512
    .line 513
    .line 514
    move-object v1, v4

    .line 515
    :goto_11
    iput v11, v3, Lpe2;->m:I

    .line 516
    .line 517
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 518
    .line 519
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v2, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 523
    .line 524
    .line 525
    move-result-object v2

    .line 526
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v13, v0, v2, v1, v3}, Ldq1;->Y(Lhg2;[BLdl2;Lu00;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    if-ne v0, v14, :cond_1a

    .line 534
    .line 535
    goto :goto_13

    .line 536
    :cond_1a
    :goto_12
    check-cast v0, Lgg2;

    .line 537
    .line 538
    invoke-virtual {v0}, Lgg2;->a()Lcom/dokar/quickjs/binding/JsObject;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    invoke-static {v0}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 543
    .line 544
    .line 545
    move-result-object v14
    :try_end_7
    .catch Ljava/util/concurrent/CancellationException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 546
    goto :goto_13

    .line 547
    :catchall_3
    move-exception v0

    .line 548
    invoke-static {v0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 549
    .line 550
    .line 551
    move-result-object v14

    .line 552
    :goto_13
    return-object v14

    .line 553
    :catch_3
    move-exception v0

    .line 554
    throw v0

    .line 555
    :pswitch_4
    instance-of v3, v2, Loe2;

    .line 556
    .line 557
    if-eqz v3, :cond_1b

    .line 558
    .line 559
    move-object v3, v2

    .line 560
    check-cast v3, Loe2;

    .line 561
    .line 562
    iget v4, v3, Loe2;->m:I

    .line 563
    .line 564
    and-int v5, v4, v17

    .line 565
    .line 566
    if-eqz v5, :cond_1b

    .line 567
    .line 568
    sub-int v4, v4, v17

    .line 569
    .line 570
    iput v4, v3, Loe2;->m:I

    .line 571
    .line 572
    goto :goto_14

    .line 573
    :cond_1b
    new-instance v3, Loe2;

    .line 574
    .line 575
    check-cast v2, Lu00;

    .line 576
    .line 577
    invoke-direct {v3, v0, v2}, Loe2;-><init>(Lje2;Lu00;)V

    .line 578
    .line 579
    .line 580
    :goto_14
    iget-object v0, v3, Loe2;->k:Ljava/lang/Object;

    .line 581
    .line 582
    iget v2, v3, Loe2;->m:I

    .line 583
    .line 584
    if-eqz v2, :cond_1d

    .line 585
    .line 586
    if-ne v2, v11, :cond_1c

    .line 587
    .line 588
    :try_start_8
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/util/concurrent/CancellationException; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 589
    .line 590
    .line 591
    goto :goto_18

    .line 592
    :cond_1c
    invoke-static {v15}, Ls;->l(Ljava/lang/String;)V

    .line 593
    .line 594
    .line 595
    const/4 v14, 0x0

    .line 596
    goto :goto_19

    .line 597
    :cond_1d
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 598
    .line 599
    .line 600
    const/4 v0, 0x3

    .line 601
    :try_start_9
    invoke-static {v0, v1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 602
    .line 603
    .line 604
    aget-object v0, v1, v9

    .line 605
    .line 606
    invoke-static {v12, v0}, Li51;->y(Ljava/lang/String;Ljava/lang/Object;)Lhg2;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    aget-object v2, v1, v11

    .line 611
    .line 612
    const-string v4, "data"

    .line 613
    .line 614
    invoke-static {v4, v2}, Lsp0;->Y(Ljava/lang/String;Ljava/lang/Object;)[B

    .line 615
    .line 616
    .line 617
    move-result-object v2

    .line 618
    const/16 v16, 0x2

    .line 619
    .line 620
    aget-object v1, v1, v16

    .line 621
    .line 622
    if-nez v1, :cond_1e

    .line 623
    .line 624
    new-instance v1, Ldl2;

    .line 625
    .line 626
    invoke-direct {v1, v9, v11, v9}, Ldl2;-><init>(ZZZ)V

    .line 627
    .line 628
    .line 629
    goto :goto_17

    .line 630
    :cond_1e
    invoke-static {v10, v1}, Lsp0;->e0(Ljava/lang/String;Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 631
    .line 632
    .line 633
    move-result-object v1

    .line 634
    new-instance v4, Ldl2;

    .line 635
    .line 636
    invoke-static {v1, v8}, Ls11;->r(Lcom/dokar/quickjs/binding/JsObject;Ljava/lang/String;)Ljava/lang/Boolean;

    .line 637
    .line 638
    .line 639
    move-result-object v5

    .line 640
    if-eqz v5, :cond_1f

    .line 641
    .line 642
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 643
    .line 644
    .line 645
    move-result v5

    .line 646
    goto :goto_15

    .line 647
    :cond_1f
    move v5, v9

    .line 648
    :goto_15
    invoke-static {v1, v7}, Ls11;->r(Lcom/dokar/quickjs/binding/JsObject;Ljava/lang/String;)Ljava/lang/Boolean;

    .line 649
    .line 650
    .line 651
    move-result-object v7

    .line 652
    if-eqz v7, :cond_20

    .line 653
    .line 654
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 655
    .line 656
    .line 657
    move-result v7

    .line 658
    goto :goto_16

    .line 659
    :cond_20
    move v7, v11

    .line 660
    :goto_16
    invoke-static {v1, v6}, Ls11;->r(Lcom/dokar/quickjs/binding/JsObject;Ljava/lang/String;)Ljava/lang/Boolean;

    .line 661
    .line 662
    .line 663
    move-result-object v1

    .line 664
    if-eqz v1, :cond_21

    .line 665
    .line 666
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 667
    .line 668
    .line 669
    move-result v9

    .line 670
    :cond_21
    invoke-direct {v4, v5, v7, v9}, Ldl2;-><init>(ZZZ)V

    .line 671
    .line 672
    .line 673
    move-object v1, v4

    .line 674
    :goto_17
    iput v11, v3, Loe2;->m:I

    .line 675
    .line 676
    invoke-virtual {v13, v0, v2, v1, v3}, Ldq1;->Y(Lhg2;[BLdl2;Lu00;)Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    if-ne v0, v14, :cond_22

    .line 681
    .line 682
    goto :goto_19

    .line 683
    :cond_22
    :goto_18
    check-cast v0, Lgg2;

    .line 684
    .line 685
    invoke-virtual {v0}, Lgg2;->a()Lcom/dokar/quickjs/binding/JsObject;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    invoke-static {v0}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 690
    .line 691
    .line 692
    move-result-object v14
    :try_end_9
    .catch Ljava/util/concurrent/CancellationException; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 693
    goto :goto_19

    .line 694
    :catchall_4
    move-exception v0

    .line 695
    invoke-static {v0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 696
    .line 697
    .line 698
    move-result-object v14

    .line 699
    :goto_19
    return-object v14

    .line 700
    :catch_4
    move-exception v0

    .line 701
    throw v0

    .line 702
    :pswitch_5
    instance-of v3, v2, Lne2;

    .line 703
    .line 704
    if-eqz v3, :cond_23

    .line 705
    .line 706
    move-object v3, v2

    .line 707
    check-cast v3, Lne2;

    .line 708
    .line 709
    iget v4, v3, Lne2;->m:I

    .line 710
    .line 711
    and-int v5, v4, v17

    .line 712
    .line 713
    if-eqz v5, :cond_23

    .line 714
    .line 715
    sub-int v4, v4, v17

    .line 716
    .line 717
    iput v4, v3, Lne2;->m:I

    .line 718
    .line 719
    goto :goto_1a

    .line 720
    :cond_23
    new-instance v3, Lne2;

    .line 721
    .line 722
    check-cast v2, Lu00;

    .line 723
    .line 724
    invoke-direct {v3, v0, v2}, Lne2;-><init>(Lje2;Lu00;)V

    .line 725
    .line 726
    .line 727
    :goto_1a
    iget-object v0, v3, Lne2;->k:Ljava/lang/Object;

    .line 728
    .line 729
    iget v2, v3, Lne2;->m:I

    .line 730
    .line 731
    if-eqz v2, :cond_25

    .line 732
    .line 733
    if-ne v2, v11, :cond_24

    .line 734
    .line 735
    :try_start_a
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_a
    .catch Ljava/util/concurrent/CancellationException; {:try_start_a .. :try_end_a} :catch_5
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 736
    .line 737
    .line 738
    goto :goto_1b

    .line 739
    :cond_24
    invoke-static {v15}, Ls;->l(Ljava/lang/String;)V

    .line 740
    .line 741
    .line 742
    const/4 v14, 0x0

    .line 743
    goto :goto_1c

    .line 744
    :cond_25
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 745
    .line 746
    .line 747
    :try_start_b
    invoke-static {v11, v1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 748
    .line 749
    .line 750
    aget-object v0, v1, v9

    .line 751
    .line 752
    invoke-static {v12, v0}, Li51;->y(Ljava/lang/String;Ljava/lang/Object;)Lhg2;

    .line 753
    .line 754
    .line 755
    move-result-object v0

    .line 756
    iput v11, v3, Lne2;->m:I

    .line 757
    .line 758
    invoke-virtual {v13, v0, v3}, Ldq1;->P(Lhg2;Lu00;)Ljava/lang/Object;

    .line 759
    .line 760
    .line 761
    move-result-object v0

    .line 762
    if-ne v0, v14, :cond_26

    .line 763
    .line 764
    goto :goto_1c

    .line 765
    :cond_26
    :goto_1b
    invoke-static {v0}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 766
    .line 767
    .line 768
    move-result-object v14
    :try_end_b
    .catch Ljava/util/concurrent/CancellationException; {:try_start_b .. :try_end_b} :catch_5
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 769
    goto :goto_1c

    .line 770
    :catchall_5
    move-exception v0

    .line 771
    invoke-static {v0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 772
    .line 773
    .line 774
    move-result-object v14

    .line 775
    :goto_1c
    return-object v14

    .line 776
    :catch_5
    move-exception v0

    .line 777
    throw v0

    .line 778
    :pswitch_6
    instance-of v3, v2, Lme2;

    .line 779
    .line 780
    if-eqz v3, :cond_27

    .line 781
    .line 782
    move-object v3, v2

    .line 783
    check-cast v3, Lme2;

    .line 784
    .line 785
    iget v4, v3, Lme2;->m:I

    .line 786
    .line 787
    and-int v5, v4, v17

    .line 788
    .line 789
    if-eqz v5, :cond_27

    .line 790
    .line 791
    sub-int v4, v4, v17

    .line 792
    .line 793
    iput v4, v3, Lme2;->m:I

    .line 794
    .line 795
    goto :goto_1d

    .line 796
    :cond_27
    new-instance v3, Lme2;

    .line 797
    .line 798
    check-cast v2, Lu00;

    .line 799
    .line 800
    invoke-direct {v3, v0, v2}, Lme2;-><init>(Lje2;Lu00;)V

    .line 801
    .line 802
    .line 803
    :goto_1d
    iget-object v0, v3, Lme2;->k:Ljava/lang/Object;

    .line 804
    .line 805
    iget v2, v3, Lme2;->m:I

    .line 806
    .line 807
    if-eqz v2, :cond_29

    .line 808
    .line 809
    if-ne v2, v11, :cond_28

    .line 810
    .line 811
    :try_start_c
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_c
    .catch Ljava/util/concurrent/CancellationException; {:try_start_c .. :try_end_c} :catch_6
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 812
    .line 813
    .line 814
    goto :goto_1e

    .line 815
    :cond_28
    invoke-static {v15}, Ls;->l(Ljava/lang/String;)V

    .line 816
    .line 817
    .line 818
    const/4 v14, 0x0

    .line 819
    goto :goto_1f

    .line 820
    :cond_29
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 821
    .line 822
    .line 823
    :try_start_d
    invoke-static {v11, v1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 824
    .line 825
    .line 826
    aget-object v0, v1, v9

    .line 827
    .line 828
    invoke-static {v12, v0}, Li51;->y(Ljava/lang/String;Ljava/lang/Object;)Lhg2;

    .line 829
    .line 830
    .line 831
    move-result-object v0

    .line 832
    iput v11, v3, Lme2;->m:I

    .line 833
    .line 834
    invoke-virtual {v13, v0, v3}, Ldq1;->N(Lhg2;Lu00;)Ljava/lang/Object;

    .line 835
    .line 836
    .line 837
    move-result-object v0

    .line 838
    if-ne v0, v14, :cond_2a

    .line 839
    .line 840
    goto :goto_1f

    .line 841
    :cond_2a
    :goto_1e
    check-cast v0, [B

    .line 842
    .line 843
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 844
    .line 845
    .line 846
    array-length v1, v0

    .line 847
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 848
    .line 849
    .line 850
    move-result-object v0

    .line 851
    new-instance v1, Lkotlin/UByteArray;

    .line 852
    .line 853
    invoke-direct {v1, v0}, Lkotlin/UByteArray;-><init>([B)V

    .line 854
    .line 855
    .line 856
    invoke-static {v1}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 857
    .line 858
    .line 859
    move-result-object v14
    :try_end_d
    .catch Ljava/util/concurrent/CancellationException; {:try_start_d .. :try_end_d} :catch_6
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 860
    goto :goto_1f

    .line 861
    :catchall_6
    move-exception v0

    .line 862
    invoke-static {v0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 863
    .line 864
    .line 865
    move-result-object v14

    .line 866
    :goto_1f
    return-object v14

    .line 867
    :catch_6
    move-exception v0

    .line 868
    throw v0

    .line 869
    :pswitch_7
    instance-of v3, v2, Lle2;

    .line 870
    .line 871
    if-eqz v3, :cond_2b

    .line 872
    .line 873
    move-object v3, v2

    .line 874
    check-cast v3, Lle2;

    .line 875
    .line 876
    iget v4, v3, Lle2;->m:I

    .line 877
    .line 878
    and-int v5, v4, v17

    .line 879
    .line 880
    if-eqz v5, :cond_2b

    .line 881
    .line 882
    sub-int v4, v4, v17

    .line 883
    .line 884
    iput v4, v3, Lle2;->m:I

    .line 885
    .line 886
    goto :goto_20

    .line 887
    :cond_2b
    new-instance v3, Lle2;

    .line 888
    .line 889
    check-cast v2, Lu00;

    .line 890
    .line 891
    invoke-direct {v3, v0, v2}, Lle2;-><init>(Lje2;Lu00;)V

    .line 892
    .line 893
    .line 894
    :goto_20
    iget-object v0, v3, Lle2;->k:Ljava/lang/Object;

    .line 895
    .line 896
    iget v2, v3, Lle2;->m:I

    .line 897
    .line 898
    if-eqz v2, :cond_2d

    .line 899
    .line 900
    if-ne v2, v11, :cond_2c

    .line 901
    .line 902
    :try_start_e
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_e
    .catch Ljava/util/concurrent/CancellationException; {:try_start_e .. :try_end_e} :catch_7
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    .line 903
    .line 904
    .line 905
    goto :goto_21

    .line 906
    :cond_2c
    invoke-static {v15}, Ls;->l(Ljava/lang/String;)V

    .line 907
    .line 908
    .line 909
    const/4 v14, 0x0

    .line 910
    goto :goto_23

    .line 911
    :cond_2d
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 912
    .line 913
    .line 914
    :try_start_f
    invoke-static {v11, v1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 915
    .line 916
    .line 917
    aget-object v0, v1, v9

    .line 918
    .line 919
    invoke-static {v12, v0}, Li51;->y(Ljava/lang/String;Ljava/lang/Object;)Lhg2;

    .line 920
    .line 921
    .line 922
    move-result-object v0

    .line 923
    iput v11, v3, Lle2;->m:I

    .line 924
    .line 925
    invoke-virtual {v13, v0, v3}, Ldq1;->H(Lhg2;Lu00;)Ljava/lang/Object;

    .line 926
    .line 927
    .line 928
    move-result-object v0

    .line 929
    if-ne v0, v14, :cond_2e

    .line 930
    .line 931
    goto :goto_23

    .line 932
    :cond_2e
    :goto_21
    check-cast v0, Ljava/lang/Iterable;

    .line 933
    .line 934
    new-instance v1, Ljava/util/ArrayList;

    .line 935
    .line 936
    const/16 v2, 0xa

    .line 937
    .line 938
    invoke-static {v0, v2}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 939
    .line 940
    .line 941
    move-result v2

    .line 942
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 943
    .line 944
    .line 945
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 946
    .line 947
    .line 948
    move-result-object v0

    .line 949
    :goto_22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 950
    .line 951
    .line 952
    move-result v2

    .line 953
    if-eqz v2, :cond_2f

    .line 954
    .line 955
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 956
    .line 957
    .line 958
    move-result-object v2

    .line 959
    check-cast v2, Lgg2;

    .line 960
    .line 961
    invoke-virtual {v2}, Lgg2;->a()Lcom/dokar/quickjs/binding/JsObject;

    .line 962
    .line 963
    .line 964
    move-result-object v2

    .line 965
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 966
    .line 967
    .line 968
    goto :goto_22

    .line 969
    :cond_2f
    invoke-static {v1}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 970
    .line 971
    .line 972
    move-result-object v14
    :try_end_f
    .catch Ljava/util/concurrent/CancellationException; {:try_start_f .. :try_end_f} :catch_7
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 973
    goto :goto_23

    .line 974
    :catchall_7
    move-exception v0

    .line 975
    invoke-static {v0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 976
    .line 977
    .line 978
    move-result-object v14

    .line 979
    :goto_23
    return-object v14

    .line 980
    :catch_7
    move-exception v0

    .line 981
    throw v0

    .line 982
    :pswitch_8
    instance-of v3, v2, Lke2;

    .line 983
    .line 984
    if-eqz v3, :cond_30

    .line 985
    .line 986
    move-object v3, v2

    .line 987
    check-cast v3, Lke2;

    .line 988
    .line 989
    iget v4, v3, Lke2;->m:I

    .line 990
    .line 991
    and-int v5, v4, v17

    .line 992
    .line 993
    if-eqz v5, :cond_30

    .line 994
    .line 995
    sub-int v4, v4, v17

    .line 996
    .line 997
    iput v4, v3, Lke2;->m:I

    .line 998
    .line 999
    goto :goto_24

    .line 1000
    :cond_30
    new-instance v3, Lke2;

    .line 1001
    .line 1002
    check-cast v2, Lu00;

    .line 1003
    .line 1004
    invoke-direct {v3, v0, v2}, Lke2;-><init>(Lje2;Lu00;)V

    .line 1005
    .line 1006
    .line 1007
    :goto_24
    iget-object v0, v3, Lke2;->k:Ljava/lang/Object;

    .line 1008
    .line 1009
    iget v2, v3, Lke2;->m:I

    .line 1010
    .line 1011
    if-eqz v2, :cond_32

    .line 1012
    .line 1013
    if-ne v2, v11, :cond_31

    .line 1014
    .line 1015
    :try_start_10
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_10
    .catch Ljava/util/concurrent/CancellationException; {:try_start_10 .. :try_end_10} :catch_8
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    .line 1016
    .line 1017
    .line 1018
    goto :goto_25

    .line 1019
    :cond_31
    invoke-static {v15}, Ls;->l(Ljava/lang/String;)V

    .line 1020
    .line 1021
    .line 1022
    const/4 v14, 0x0

    .line 1023
    goto :goto_26

    .line 1024
    :cond_32
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 1025
    .line 1026
    .line 1027
    :try_start_11
    invoke-static {v11, v1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 1028
    .line 1029
    .line 1030
    aget-object v0, v1, v9

    .line 1031
    .line 1032
    invoke-static {v12, v0}, Li51;->y(Ljava/lang/String;Ljava/lang/Object;)Lhg2;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v0

    .line 1036
    iput v11, v3, Lke2;->m:I

    .line 1037
    .line 1038
    invoke-virtual {v13, v0, v3}, Ldq1;->V(Lhg2;Lu00;)Ljava/lang/Object;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v0

    .line 1042
    if-ne v0, v14, :cond_33

    .line 1043
    .line 1044
    goto :goto_26

    .line 1045
    :cond_33
    :goto_25
    check-cast v0, Lgg2;

    .line 1046
    .line 1047
    invoke-virtual {v0}, Lgg2;->a()Lcom/dokar/quickjs/binding/JsObject;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v0

    .line 1051
    invoke-static {v0}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v14
    :try_end_11
    .catch Ljava/util/concurrent/CancellationException; {:try_start_11 .. :try_end_11} :catch_8
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    .line 1055
    goto :goto_26

    .line 1056
    :catchall_8
    move-exception v0

    .line 1057
    invoke-static {v0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v14

    .line 1061
    :goto_26
    return-object v14

    .line 1062
    :catch_8
    move-exception v0

    .line 1063
    throw v0

    .line 1064
    :pswitch_9
    instance-of v3, v2, Lie2;

    .line 1065
    .line 1066
    if-eqz v3, :cond_34

    .line 1067
    .line 1068
    move-object v3, v2

    .line 1069
    check-cast v3, Lie2;

    .line 1070
    .line 1071
    iget v4, v3, Lie2;->m:I

    .line 1072
    .line 1073
    and-int v5, v4, v17

    .line 1074
    .line 1075
    if-eqz v5, :cond_34

    .line 1076
    .line 1077
    sub-int v4, v4, v17

    .line 1078
    .line 1079
    iput v4, v3, Lie2;->m:I

    .line 1080
    .line 1081
    goto :goto_27

    .line 1082
    :cond_34
    new-instance v3, Lie2;

    .line 1083
    .line 1084
    check-cast v2, Lu00;

    .line 1085
    .line 1086
    invoke-direct {v3, v0, v2}, Lie2;-><init>(Lje2;Lu00;)V

    .line 1087
    .line 1088
    .line 1089
    :goto_27
    iget-object v0, v3, Lie2;->k:Ljava/lang/Object;

    .line 1090
    .line 1091
    iget v2, v3, Lie2;->m:I

    .line 1092
    .line 1093
    if-eqz v2, :cond_36

    .line 1094
    .line 1095
    if-ne v2, v11, :cond_35

    .line 1096
    .line 1097
    :try_start_12
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_12
    .catch Ljava/util/concurrent/CancellationException; {:try_start_12 .. :try_end_12} :catch_9
    .catchall {:try_start_12 .. :try_end_12} :catchall_9

    .line 1098
    .line 1099
    .line 1100
    goto :goto_28

    .line 1101
    :cond_35
    invoke-static {v15}, Ls;->l(Ljava/lang/String;)V

    .line 1102
    .line 1103
    .line 1104
    const/4 v14, 0x0

    .line 1105
    goto :goto_29

    .line 1106
    :cond_36
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 1107
    .line 1108
    .line 1109
    :try_start_13
    invoke-static {v11, v1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 1110
    .line 1111
    .line 1112
    aget-object v0, v1, v9

    .line 1113
    .line 1114
    invoke-static {v12, v0}, Li51;->y(Ljava/lang/String;Ljava/lang/Object;)Lhg2;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v0

    .line 1118
    iput v11, v3, Lie2;->m:I

    .line 1119
    .line 1120
    invoke-virtual {v13, v0, v3}, Ldq1;->D(Lhg2;Lu00;)Ljava/lang/Object;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v0

    .line 1124
    if-ne v0, v14, :cond_37

    .line 1125
    .line 1126
    goto :goto_29

    .line 1127
    :cond_37
    :goto_28
    invoke-static {v0}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v14
    :try_end_13
    .catch Ljava/util/concurrent/CancellationException; {:try_start_13 .. :try_end_13} :catch_9
    .catchall {:try_start_13 .. :try_end_13} :catchall_9

    .line 1131
    goto :goto_29

    .line 1132
    :catchall_9
    move-exception v0

    .line 1133
    invoke-static {v0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v14

    .line 1137
    :goto_29
    return-object v14

    .line 1138
    :catch_9
    move-exception v0

    .line 1139
    throw v0

    .line 1140
    nop

    .line 1141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
