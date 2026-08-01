.class public final synthetic Lr0/n1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM0/l;
.implements Lx/b;
.implements LM0/a;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lr0/n1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iget v1, p0, Lr0/n1;->a:I

    .line 3
    .line 4
    packed-switch v1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    :pswitch_0
    const/4 v0, 0x4

    .line 8
    const-string v1, "mask_wechat_config"

    .line 9
    .line 10
    const-string v2, "getSharedPreferences(...)"

    .line 11
    .line 12
    invoke-static {v1, v0, v2}, LL/d;->f(Ljava/lang/String;ILjava/lang/String;)Landroid/content/SharedPreferences;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Lz0/i;->h:Lz0/f;

    .line 17
    .line 18
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    sget-boolean v1, Lz0/i;->a:Z

    .line 23
    .line 24
    invoke-static {}, Lz0/g;->k()Lcom/lu/wxmask/bean/OptionData;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Lcom/lu/wxmask/bean/OptionData;->getQuickDisplayClickCount()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/4 v2, 0x2

    .line 33
    const/16 v3, 0x8

    .line 34
    .line 35
    invoke-static {v1, v2, v3}, LD/h;->g(III)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    sub-int/2addr v1, v0

    .line 40
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0

    .line 45
    :pswitch_2
    sget-boolean v0, Lz0/i;->a:Z

    .line 46
    .line 47
    invoke-static {}, Lz0/g;->E()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0

    .line 56
    :pswitch_3
    sget-boolean v1, Lz0/i;->a:Z

    .line 57
    .line 58
    invoke-static {}, Lz0/g;->s()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_0

    .line 63
    .line 64
    invoke-static {}, Lz0/g;->k()Lcom/lu/wxmask/bean/OptionData;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1}, Lcom/lu/wxmask/bean/OptionData;->getEnableSearchCommand()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_0

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    const/4 v0, 0x0

    .line 76
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    return-object v0

    .line 81
    :pswitch_4
    sget-boolean v0, Lz0/i;->a:Z

    .line 82
    .line 83
    invoke-static {}, Lz0/g;->G()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    return-object v0

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lr0/n1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    check-cast p1, LD0/c;

    .line 7
    .line 8
    const-string v0, "it"

    .line 9
    .line 10
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sget-object p1, LE0/i;->a:LE0/i;

    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 17
    .line 18
    const-string v0, "it"

    .line 19
    .line 20
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :pswitch_2
    check-cast p1, Ljava/lang/reflect/Method;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {p1}, Lz0/r;->w(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1

    .line 54
    :pswitch_3
    check-cast p1, Ljava/lang/Class;

    .line 55
    .line 56
    invoke-static {p1}, LN0/g;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-static {p1}, Lz0/r;->F(Ljava/lang/Class;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    return-object p1

    .line 64
    :pswitch_4
    check-cast p1, Ljava/lang/Byte;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    .line 67
    .line 68
    .line 69
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const/4 v0, 0x1

    .line 74
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    const-string v0, "%02X"

    .line 79
    .line 80
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    return-object p1

    .line 85
    :pswitch_5
    check-cast p1, Ljava/lang/Byte;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    and-int/lit16 p1, p1, 0xff

    .line 92
    .line 93
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    const/4 v0, 0x1

    .line 102
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    const-string v0, "%02x"

    .line 107
    .line 108
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    return-object p1

    .line 113
    :pswitch_6
    check-cast p1, Lz0/b;

    .line 114
    .line 115
    const-string v0, "it"

    .line 116
    .line 117
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    sget-object p1, LE0/i;->a:LE0/i;

    .line 121
    .line 122
    return-object p1

    .line 123
    :pswitch_7
    check-cast p1, Lz0/b;

    .line 124
    .line 125
    const-string v0, "it"

    .line 126
    .line 127
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    sget-object p1, LE0/i;->a:LE0/i;

    .line 131
    .line 132
    return-object p1

    .line 133
    :pswitch_8
    check-cast p1, Lz0/b;

    .line 134
    .line 135
    const-string v0, "it"

    .line 136
    .line 137
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    sget-object p1, LE0/i;->a:LE0/i;

    .line 141
    .line 142
    return-object p1

    .line 143
    :pswitch_9
    check-cast p1, Ljava/lang/Byte;

    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    .line 146
    .line 147
    .line 148
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    const/4 v0, 0x1

    .line 153
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    const-string v0, "%02X"

    .line 158
    .line 159
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    return-object p1

    .line 164
    :pswitch_a
    check-cast p1, Ljava/lang/Throwable;

    .line 165
    .line 166
    const-string v0, "e"

    .line 167
    .line 168
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    const-string v0, "\u4e0b\u8f7d\u94fe\u63a5\u6253\u5f00\u5931\u8d25"

    .line 172
    .line 173
    invoke-static {v0}, Lb1/h;->P(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    sget-object p1, LE0/i;->a:LE0/i;

    .line 184
    .line 185
    return-object p1

    .line 186
    :pswitch_b
    check-cast p1, Ljava/lang/Throwable;

    .line 187
    .line 188
    const-string v0, "it"

    .line 189
    .line 190
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    throw p1

    .line 194
    :pswitch_c
    check-cast p1, Ljava/lang/Throwable;

    .line 195
    .line 196
    const-string v0, "it"

    .line 197
    .line 198
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    const-string p1, "\u94fe\u63a5\u6253\u5f00\u5931\u8d25"

    .line 202
    .line 203
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    sget-object p1, LE0/i;->a:LE0/i;

    .line 207
    .line 208
    return-object p1

    .line 209
    :pswitch_d
    check-cast p1, Ljava/lang/Throwable;

    .line 210
    .line 211
    const-string v0, "it"

    .line 212
    .line 213
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    const-string p1, "\u4e0b\u8f7d\u94fe\u63a5\u6253\u5f00\u5931\u8d25"

    .line 217
    .line 218
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    sget-object p1, LE0/i;->a:LE0/i;

    .line 222
    .line 223
    return-object p1

    .line 224
    :pswitch_e
    check-cast p1, Landroid/content/Context;

    .line 225
    .line 226
    const-string v0, "appContext"

    .line 227
    .line 228
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    const-string p1, "text_status_scan_status_v1"

    .line 232
    .line 233
    const/4 v0, 0x1

    .line 234
    invoke-static {p1, v0}, LA0/l;->s(Ljava/lang/String;Z)V

    .line 235
    .line 236
    .line 237
    sget-object p1, LE0/i;->a:LE0/i;

    .line 238
    .line 239
    return-object p1

    .line 240
    :pswitch_f
    check-cast p1, Landroid/content/Context;

    .line 241
    .line 242
    const-string v0, "appContext"

    .line 243
    .line 244
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    invoke-static {}, LA0/k;->a()Z

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    const/4 v1, 0x0

    .line 252
    if-nez v0, :cond_0

    .line 253
    .line 254
    goto :goto_4

    .line 255
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    if-eqz v0, :cond_1

    .line 260
    .line 261
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 262
    .line 263
    goto :goto_0

    .line 264
    :cond_1
    move-object v0, v1

    .line 265
    :goto_0
    if-eqz v0, :cond_5

    .line 266
    .line 267
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    if-eqz v2, :cond_2

    .line 272
    .line 273
    goto :goto_3

    .line 274
    :cond_2
    :try_start_0
    new-instance v2, LA0/h;

    .line 275
    .line 276
    const/4 v3, 0x6

    .line 277
    invoke-direct {v2, p1, v3}, LA0/h;-><init>(Landroid/content/Context;I)V

    .line 278
    .line 279
    .line 280
    invoke-static {v0, v2}, LA0/l;->B(Ljava/lang/String;LM0/l;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    check-cast p1, LA0/V;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 285
    .line 286
    goto :goto_1

    .line 287
    :catchall_0
    move-exception p1

    .line 288
    new-instance v0, LE0/d;

    .line 289
    .line 290
    invoke-direct {v0, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 291
    .line 292
    .line 293
    move-object p1, v0

    .line 294
    :goto_1
    invoke-static {p1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    if-eqz v0, :cond_3

    .line 299
    .line 300
    const-string v2, "search command dexkit resolve fail"

    .line 301
    .line 302
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    :cond_3
    instance-of v0, p1, LE0/d;

    .line 310
    .line 311
    if-eqz v0, :cond_4

    .line 312
    .line 313
    goto :goto_2

    .line 314
    :cond_4
    move-object v1, p1

    .line 315
    :goto_2
    check-cast v1, LA0/V;

    .line 316
    .line 317
    goto :goto_4

    .line 318
    :cond_5
    :goto_3
    const-string p1, "search command dexkit apk path empty"

    .line 319
    .line 320
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    :goto_4
    const/4 p1, 0x0

    .line 328
    const/4 v0, 0x1

    .line 329
    if-eqz v1, :cond_6

    .line 330
    .line 331
    new-instance v2, Lorg/json/JSONObject;

    .line 332
    .line 333
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 334
    .line 335
    .line 336
    iget-object v3, v1, LA0/V;->a:Ljava/util/List;

    .line 337
    .line 338
    invoke-static {v3}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 339
    .line 340
    .line 341
    move-result-object v3

    .line 342
    const-string v4, "searchViewClassNames"

    .line 343
    .line 344
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    iget-object v1, v1, LA0/V;->b:Ljava/util/List;

    .line 349
    .line 350
    invoke-static {v1}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    const-string v3, "editTextFieldNames"

    .line 355
    .line 356
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    const-string v2, "put(...)"

    .line 361
    .line 362
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    const/4 v2, 0x2

    .line 366
    invoke-static {v1, v2}, LA0/l;->v(Lorg/json/JSONObject;I)Lorg/json/JSONObject;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    const-string v3, "hook_point_cache"

    .line 375
    .line 376
    invoke-virtual {v2, v3, p1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 377
    .line 378
    .line 379
    move-result-object p1

    .line 380
    const-string v2, "getSharedPreferences(...)"

    .line 381
    .line 382
    invoke-static {p1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 386
    .line 387
    .line 388
    move-result-object p1

    .line 389
    const-string v2, "search_command_v1"

    .line 390
    .line 391
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    invoke-interface {p1, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 396
    .line 397
    .line 398
    move-result-object p1

    .line 399
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 400
    .line 401
    .line 402
    new-instance p1, LA0/t;

    .line 403
    .line 404
    const-string v1, "\u5df2\u627e\u5230\u641c\u7d22\u6846\u7ed3\u6784"

    .line 405
    .line 406
    invoke-direct {p1, v0, v1, v0}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 407
    .line 408
    .line 409
    goto :goto_5

    .line 410
    :cond_6
    new-instance v1, LA0/t;

    .line 411
    .line 412
    const-string v2, "\u672a\u627e\u5230\u641c\u7d22\u6846\u7ed3\u6784"

    .line 413
    .line 414
    invoke-direct {v1, p1, v2, v0}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 415
    .line 416
    .line 417
    move-object p1, v1

    .line 418
    :goto_5
    return-object p1

    .line 419
    :pswitch_10
    check-cast p1, Ljava/lang/StackTraceElement;

    .line 420
    .line 421
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    .line 430
    .line 431
    .line 432
    move-result p1

    .line 433
    new-instance v2, Ljava/lang/StringBuilder;

    .line 434
    .line 435
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 439
    .line 440
    .line 441
    const-string v0, "."

    .line 442
    .line 443
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    const-string v0, ":"

    .line 450
    .line 451
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object p1

    .line 461
    return-object p1

    .line 462
    :pswitch_11
    check-cast p1, Ljava/lang/Class;

    .line 463
    .line 464
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object p1

    .line 468
    return-object p1

    .line 469
    :pswitch_12
    check-cast p1, Ljava/lang/ref/WeakReference;

    .line 470
    .line 471
    const-string v0, "it"

    .line 472
    .line 473
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object p1

    .line 480
    if-nez p1, :cond_7

    .line 481
    .line 482
    const/4 p1, 0x1

    .line 483
    goto :goto_6

    .line 484
    :cond_7
    const/4 p1, 0x0

    .line 485
    :goto_6
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 486
    .line 487
    .line 488
    move-result-object p1

    .line 489
    return-object p1

    .line 490
    :pswitch_13
    check-cast p1, Ljava/lang/Class;

    .line 491
    .line 492
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object p1

    .line 496
    return-object p1

    .line 497
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_f
        :pswitch_0
        :pswitch_e
        :pswitch_0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_0
        :pswitch_0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public test(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget v0, p0, Lr0/n1;->a:I

    .line 2
    .line 3
    check-cast p1, Landroid/view/View;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    instance-of p1, p1, Landroid/widget/EditText;

    .line 9
    .line 10
    return p1

    .line 11
    :pswitch_0
    instance-of v0, p1, Landroid/widget/Button;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p1, Landroid/widget/Button;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-lez p1, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    :goto_0
    return p1

    .line 27
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method
