.class public final synthetic Lr0/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM0/a;
.implements LM0/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/H0;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lr0/H0;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lr0/o0;->a:I

    iput-object p1, p0, Lr0/o0;->b:Lr0/H0;

    iput-object p2, p0, Lr0/o0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lr0/o0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr0/o0;->b:Lr0/H0;

    .line 7
    .line 8
    iget-object v1, p0, Lr0/o0;->c:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lr0/H0;->g1(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget-object v0, LE0/i;->a:LE0/i;

    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    iget-object v0, p0, Lr0/o0;->b:Lr0/H0;

    .line 17
    .line 18
    iget-object v1, p0, Lr0/o0;->c:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lr0/H0;->g1(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sget-object v0, LE0/i;->a:LE0/i;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    iget-object v0, p0, Lr0/o0;->b:Lr0/H0;

    .line 27
    .line 28
    iget-object v1, p0, Lr0/o0;->c:Ljava/lang/Object;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lr0/H0;->g1(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-object v0, LE0/i;->a:LE0/i;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_2
    iget-object v0, p0, Lr0/o0;->b:Lr0/H0;

    .line 37
    .line 38
    iget-object v1, p0, Lr0/o0;->c:Ljava/lang/Object;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lr0/H0;->g1(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    sget-object v0, LE0/i;->a:LE0/i;

    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_3
    iget-object v0, p0, Lr0/o0;->b:Lr0/H0;

    .line 47
    .line 48
    iget-object v1, p0, Lr0/o0;->c:Ljava/lang/Object;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lr0/H0;->g1(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, LE0/i;->a:LE0/i;

    .line 54
    .line 55
    return-object v0

    .line 56
    :pswitch_4
    iget-object v0, p0, Lr0/o0;->b:Lr0/H0;

    .line 57
    .line 58
    iget-object v1, v0, Lr0/H0;->g:Ljava/lang/ref/WeakReference;

    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    if-eqz v1, :cond_0

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Landroid/widget/BaseAdapter;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    move-object v1, v2

    .line 71
    :goto_0
    iget-object v3, p0, Lr0/o0;->c:Ljava/lang/Object;

    .line 72
    .line 73
    if-eqz v1, :cond_1

    .line 74
    .line 75
    invoke-virtual {v1}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    instance-of v1, v3, Landroid/widget/BaseAdapter;

    .line 80
    .line 81
    if-eqz v1, :cond_2

    .line 82
    .line 83
    move-object v1, v3

    .line 84
    check-cast v1, Landroid/widget/BaseAdapter;

    .line 85
    .line 86
    invoke-virtual {v1}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    instance-of v1, v3, Landroid/widget/HeaderViewListAdapter;

    .line 91
    .line 92
    if-eqz v1, :cond_4

    .line 93
    .line 94
    move-object v1, v3

    .line 95
    check-cast v1, Landroid/widget/HeaderViewListAdapter;

    .line 96
    .line 97
    invoke-virtual {v1}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    instance-of v4, v1, Landroid/widget/BaseAdapter;

    .line 102
    .line 103
    if-eqz v4, :cond_3

    .line 104
    .line 105
    move-object v2, v1

    .line 106
    check-cast v2, Landroid/widget/BaseAdapter;

    .line 107
    .line 108
    :cond_3
    if-eqz v2, :cond_5

    .line 109
    .line 110
    invoke-virtual {v2}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_4
    :try_start_0
    const-string v1, "notifyDataSetInvalidated"

    .line 115
    .line 116
    const/4 v2, 0x0

    .line 117
    new-array v2, v2, [Ljava/lang/Object;

    .line 118
    .line 119
    sget-object v4, Lc0/f;->b:Ld0/b;

    .line 120
    .line 121
    invoke-interface {v4, v3, v1, v2}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    .line 123
    .line 124
    :catchall_0
    :cond_5
    :goto_1
    invoke-virtual {v0, v3}, Lr0/H0;->h1(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    sget-object v0, LE0/i;->a:LE0/i;

    .line 128
    .line 129
    return-object v0

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    check-cast v2, Ljava/lang/reflect/Method;

    .line 6
    .line 7
    invoke-static {v2}, LN0/g;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, Lr0/o0;->b:Lr0/H0;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v0, v1, Lr0/o0;->c:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v4, "getDeclaredFields(...)"

    .line 26
    .line 27
    invoke-static {v0, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    new-instance v4, LE0/d;

    .line 37
    .line 38
    invoke-direct {v4, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    move-object v0, v4

    .line 42
    :goto_0
    sget-object v4, LF0/s;->a:LF0/s;

    .line 43
    .line 44
    instance-of v5, v0, LE0/d;

    .line 45
    .line 46
    if-eqz v5, :cond_0

    .line 47
    .line 48
    move-object v0, v4

    .line 49
    :cond_0
    move-object v4, v0

    .line 50
    check-cast v4, Ljava/util/List;

    .line 51
    .line 52
    const-class v0, Landroid/widget/BaseAdapter;

    .line 53
    .line 54
    invoke-virtual {v0, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    const/4 v5, 0x0

    .line 59
    const-string v6, "com.tencent.mm.storage."

    .line 60
    .line 61
    const-string v7, "MvvmList"

    .line 62
    .line 63
    if-nez v0, :cond_1

    .line 64
    .line 65
    goto/16 :goto_b

    .line 66
    .line 67
    :cond_1
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    const/4 v9, 0x1

    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    :cond_2
    move v10, v5

    .line 75
    goto :goto_1

    .line 76
    :cond_3
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    if-eqz v10, :cond_2

    .line 85
    .line 86
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v10

    .line 90
    check-cast v10, Ljava/lang/reflect/Field;

    .line 91
    .line 92
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v10

    .line 100
    invoke-static {v10, v7, v5}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 101
    .line 102
    .line 103
    move-result v10

    .line 104
    if-eqz v10, :cond_4

    .line 105
    .line 106
    move v10, v9

    .line 107
    :goto_1
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_6

    .line 112
    .line 113
    :cond_5
    move v11, v5

    .line 114
    goto :goto_2

    .line 115
    :cond_6
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v11

    .line 123
    if-eqz v11, :cond_5

    .line 124
    .line 125
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v11

    .line 129
    check-cast v11, Ljava/lang/reflect/Field;

    .line 130
    .line 131
    const-class v12, Landroid/widget/ListView;

    .line 132
    .line 133
    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object v11

    .line 137
    invoke-virtual {v12, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 138
    .line 139
    .line 140
    move-result v11

    .line 141
    if-eqz v11, :cond_7

    .line 142
    .line 143
    move v11, v9

    .line 144
    :goto_2
    :try_start_1
    invoke-virtual {v3}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    const-string v12, "getMethods(...)"

    .line 149
    .line 150
    invoke-static {v0, v12}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    array-length v12, v0

    .line 154
    move v13, v5

    .line 155
    :goto_3
    if-ge v13, v12, :cond_9

    .line 156
    .line 157
    aget-object v14, v0, v13

    .line 158
    .line 159
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v15

    .line 163
    const-string v8, "getItem"

    .line 164
    .line 165
    invoke-static {v15, v8}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v8

    .line 169
    if-eqz v8, :cond_8

    .line 170
    .line 171
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    move-result-object v8

    .line 175
    array-length v8, v8

    .line 176
    if-ne v8, v9, :cond_8

    .line 177
    .line 178
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    move-result-object v8

    .line 182
    aget-object v8, v8, v5

    .line 183
    .line 184
    sget-object v15, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 185
    .line 186
    invoke-static {v8, v15}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v8

    .line 190
    if-eqz v8, :cond_8

    .line 191
    .line 192
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    move-result-object v8

    .line 196
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v8

    .line 200
    invoke-static {v8, v5, v6}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 201
    .line 202
    .line 203
    move-result v8

    .line 204
    if-eqz v8, :cond_8

    .line 205
    .line 206
    move v0, v9

    .line 207
    goto :goto_4

    .line 208
    :catchall_1
    move-exception v0

    .line 209
    goto :goto_5

    .line 210
    :cond_8
    add-int/lit8 v13, v13, 0x1

    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_9
    move v0, v5

    .line 214
    :goto_4
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 215
    .line 216
    .line 217
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 218
    goto :goto_6

    .line 219
    :goto_5
    new-instance v8, LE0/d;

    .line 220
    .line 221
    invoke-direct {v8, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 222
    .line 223
    .line 224
    move-object v0, v8

    .line 225
    :goto_6
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 226
    .line 227
    instance-of v12, v0, LE0/d;

    .line 228
    .line 229
    if-eqz v12, :cond_a

    .line 230
    .line 231
    move-object v0, v8

    .line 232
    :cond_a
    check-cast v0, Ljava/lang/Boolean;

    .line 233
    .line 234
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-eqz v10, :cond_10

    .line 239
    .line 240
    if-eqz v11, :cond_10

    .line 241
    .line 242
    if-eqz v0, :cond_10

    .line 243
    .line 244
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    const-string v8, "getName(...)"

    .line 253
    .line 254
    const/4 v10, 0x3

    .line 255
    if-gt v0, v10, :cond_c

    .line 256
    .line 257
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-static {v0, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    move v10, v5

    .line 265
    :goto_7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 266
    .line 267
    .line 268
    move-result v11

    .line 269
    if-ge v10, v11, :cond_c

    .line 270
    .line 271
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    .line 272
    .line 273
    .line 274
    move-result v11

    .line 275
    invoke-static {v11}, Ljava/lang/Character;->isDigit(C)Z

    .line 276
    .line 277
    .line 278
    move-result v11

    .line 279
    if-eqz v11, :cond_b

    .line 280
    .line 281
    const/4 v10, 0x5

    .line 282
    goto :goto_8

    .line 283
    :cond_b
    add-int/lit8 v10, v10, 0x1

    .line 284
    .line 285
    goto :goto_7

    .line 286
    :cond_c
    const/4 v10, 0x3

    .line 287
    :goto_8
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-static {v0, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 295
    .line 296
    .line 297
    move-result v11

    .line 298
    if-nez v11, :cond_d

    .line 299
    .line 300
    const/4 v0, 0x0

    .line 301
    goto :goto_9

    .line 302
    :cond_d
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 303
    .line 304
    .line 305
    move-result v11

    .line 306
    sub-int/2addr v11, v9

    .line 307
    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    :goto_9
    if-nez v0, :cond_e

    .line 316
    .line 317
    goto :goto_a

    .line 318
    :cond_e
    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    .line 319
    .line 320
    .line 321
    move-result v0

    .line 322
    const/16 v11, 0x32

    .line 323
    .line 324
    if-ne v0, v11, :cond_f

    .line 325
    .line 326
    add-int/lit8 v10, v10, 0x2

    .line 327
    .line 328
    :cond_f
    :goto_a
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-static {v0, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    invoke-static {v0}, LU0/i;->l0(Ljava/lang/String;)Ljava/lang/Character;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    if-eqz v0, :cond_11

    .line 340
    .line 341
    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    .line 342
    .line 343
    .line 344
    move-result v0

    .line 345
    invoke-static {v0}, Ljava/lang/Character;->isLowerCase(C)Z

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    if-ne v0, v9, :cond_11

    .line 350
    .line 351
    add-int/lit8 v10, v10, 0x1

    .line 352
    .line 353
    goto :goto_c

    .line 354
    :cond_10
    :goto_b
    move v10, v5

    .line 355
    :cond_11
    :goto_c
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 356
    .line 357
    .line 358
    move-result v0

    .line 359
    if-eqz v0, :cond_12

    .line 360
    .line 361
    goto :goto_d

    .line 362
    :cond_12
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    :cond_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 367
    .line 368
    .line 369
    move-result v8

    .line 370
    if-eqz v8, :cond_15

    .line 371
    .line 372
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v8

    .line 376
    check-cast v8, Ljava/lang/reflect/Field;

    .line 377
    .line 378
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    move-result-object v9

    .line 382
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v9

    .line 386
    const-string v11, "LifecycleScope"

    .line 387
    .line 388
    invoke-static {v9, v11, v5}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 389
    .line 390
    .line 391
    move-result v9

    .line 392
    if-nez v9, :cond_14

    .line 393
    .line 394
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    move-result-object v8

    .line 398
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v8

    .line 402
    const-string v9, "Coroutine"

    .line 403
    .line 404
    invoke-static {v8, v9, v5}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 405
    .line 406
    .line 407
    move-result v8

    .line 408
    if-eqz v8, :cond_13

    .line 409
    .line 410
    :cond_14
    add-int/lit8 v10, v10, 0x2

    .line 411
    .line 412
    :cond_15
    :goto_d
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 413
    .line 414
    .line 415
    move-result v0

    .line 416
    if-eqz v0, :cond_16

    .line 417
    .line 418
    goto :goto_e

    .line 419
    :cond_16
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    :cond_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 424
    .line 425
    .line 426
    move-result v8

    .line 427
    if-eqz v8, :cond_19

    .line 428
    .line 429
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v8

    .line 433
    check-cast v8, Ljava/lang/reflect/Field;

    .line 434
    .line 435
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    move-result-object v9

    .line 439
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v9

    .line 443
    invoke-static {v9, v7, v5}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 444
    .line 445
    .line 446
    move-result v9

    .line 447
    if-nez v9, :cond_18

    .line 448
    .line 449
    const-class v9, Ljava/util/List;

    .line 450
    .line 451
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 452
    .line 453
    .line 454
    move-result-object v8

    .line 455
    invoke-virtual {v9, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 456
    .line 457
    .line 458
    move-result v8

    .line 459
    if-eqz v8, :cond_17

    .line 460
    .line 461
    :cond_18
    add-int/lit8 v10, v10, 0x1

    .line 462
    .line 463
    :cond_19
    :goto_e
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 464
    .line 465
    .line 466
    move-result v0

    .line 467
    if-eqz v0, :cond_1a

    .line 468
    .line 469
    goto :goto_f

    .line 470
    :cond_1a
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    :cond_1b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 475
    .line 476
    .line 477
    move-result v7

    .line 478
    if-eqz v7, :cond_1c

    .line 479
    .line 480
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v7

    .line 484
    check-cast v7, Ljava/lang/reflect/Field;

    .line 485
    .line 486
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    move-result-object v7

    .line 490
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v7

    .line 494
    invoke-static {v7, v5, v6}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 495
    .line 496
    .line 497
    move-result v7

    .line 498
    if-eqz v7, :cond_1b

    .line 499
    .line 500
    add-int/lit8 v10, v10, 0x1

    .line 501
    .line 502
    :cond_1c
    :goto_f
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 503
    .line 504
    .line 505
    move-result v0

    .line 506
    const-string v6, "com.tencent.mm.ui.conversation"

    .line 507
    .line 508
    const-string v7, "z15."

    .line 509
    .line 510
    if-eqz v0, :cond_1d

    .line 511
    .line 512
    goto :goto_10

    .line 513
    :cond_1d
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    :cond_1e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 518
    .line 519
    .line 520
    move-result v4

    .line 521
    if-eqz v4, :cond_20

    .line 522
    .line 523
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v4

    .line 527
    check-cast v4, Ljava/lang/reflect/Field;

    .line 528
    .line 529
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    move-result-object v8

    .line 533
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object v8

    .line 537
    invoke-static {v8, v5, v7}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 538
    .line 539
    .line 540
    move-result v8

    .line 541
    if-nez v8, :cond_1f

    .line 542
    .line 543
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    move-result-object v4

    .line 547
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v4

    .line 551
    invoke-static {v4, v5, v6}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 552
    .line 553
    .line 554
    move-result v4

    .line 555
    if-eqz v4, :cond_1e

    .line 556
    .line 557
    :cond_1f
    add-int/lit8 v10, v10, 0x1

    .line 558
    .line 559
    :cond_20
    :goto_10
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    invoke-static {v0, v5, v7}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 564
    .line 565
    .line 566
    move-result v0

    .line 567
    if-nez v0, :cond_21

    .line 568
    .line 569
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    invoke-static {v0, v5, v6}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 574
    .line 575
    .line 576
    move-result v0

    .line 577
    if-eqz v0, :cond_22

    .line 578
    .line 579
    :cond_21
    add-int/lit8 v10, v10, 0x1

    .line 580
    .line 581
    :cond_22
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 586
    .line 587
    .line 588
    move-result v0

    .line 589
    const/4 v3, 0x3

    .line 590
    if-gt v0, v3, :cond_23

    .line 591
    .line 592
    add-int/lit8 v10, v10, 0x1

    .line 593
    .line 594
    :cond_23
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    new-instance v3, LE0/c;

    .line 599
    .line 600
    invoke-direct {v3, v2, v0}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 601
    .line 602
    .line 603
    return-object v3
.end method
