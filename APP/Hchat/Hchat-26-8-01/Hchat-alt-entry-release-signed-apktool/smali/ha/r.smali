.class public final Lha/r;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lha/s;


# direct methods
.method public synthetic constructor <init>(Lha/s;I)V
    .locals 0

    .line 1
    iput p2, p0, Lha/r;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lha/r;->b:Lha/s;

    .line 4
    .line 5
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 8

    .line 1
    iget v0, p0, Lha/r;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lha/r;->b:Lha/s;

    .line 14
    .line 15
    iget-object v1, v0, Lha/s;->a:Lr8/g;

    .line 16
    .line 17
    iget-object v1, v1, Lr8/g;->a:Landroid/content/Context;

    .line 18
    .line 19
    const-string v2, "Hchat_moments_bottom_detail_config"

    .line 20
    .line 21
    invoke-static {v1, v2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "moments_bottom_detail_enable"

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    instance-of v2, v1, Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    check-cast v1, Ljava/lang/String;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/4 v1, 0x0

    .line 47
    :goto_0
    if-eqz v1, :cond_2

    .line 48
    .line 49
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 50
    .line 51
    invoke-static {v0, v2, v1}, Lha/s;->a(Lha/s;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    :goto_1
    return-void

    .line 59
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lha/r;->b:Lha/s;

    .line 63
    .line 64
    iget-object v1, v0, Lha/s;->a:Lr8/g;

    .line 65
    .line 66
    iget-object v1, v1, Lr8/g;->a:Landroid/content/Context;

    .line 67
    .line 68
    const-string v2, "Hchat_moments_bottom_detail_config"

    .line 69
    .line 70
    invoke-static {v1, v2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    const-string v2, "moments_bottom_detail_enable"

    .line 75
    .line 76
    const/4 v3, 0x0

    .line 77
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-nez v1, :cond_3

    .line 82
    .line 83
    goto/16 :goto_6

    .line 84
    .line 85
    :cond_3
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 86
    .line 87
    if-eqz v1, :cond_9

    .line 88
    .line 89
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    const/4 v4, 0x2

    .line 95
    invoke-static {v4, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    instance-of v4, v2, Ljava/lang/Number;

    .line 100
    .line 101
    const/4 v5, 0x0

    .line 102
    if-eqz v4, :cond_4

    .line 103
    .line 104
    check-cast v2, Ljava/lang/Number;

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_4
    move-object v2, v5

    .line 108
    :goto_2
    if-eqz v2, :cond_9

    .line 109
    .line 110
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 111
    .line 112
    .line 113
    move-result-wide v6

    .line 114
    iget-object v2, v0, Lha/s;->h:Ljava/lang/ThreadLocal;

    .line 115
    .line 116
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    check-cast v2, Ljava/util/WeakHashMap;

    .line 121
    .line 122
    invoke-virtual {v2, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 127
    .line 128
    if-eqz v1, :cond_9

    .line 129
    .line 130
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    if-eqz v1, :cond_9

    .line 139
    .line 140
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-static {v3, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    instance-of v3, v2, Landroid/widget/TextView;

    .line 150
    .line 151
    if-eqz v3, :cond_5

    .line 152
    .line 153
    check-cast v2, Landroid/widget/TextView;

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_5
    move-object v2, v5

    .line 157
    :goto_3
    if-eqz v2, :cond_9

    .line 158
    .line 159
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 160
    .line 161
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    const/4 v3, 0x1

    .line 165
    invoke-static {v3, p1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    instance-of v3, p1, Landroid/widget/TextView;

    .line 170
    .line 171
    if-eqz v3, :cond_6

    .line 172
    .line 173
    check-cast p1, Landroid/widget/TextView;

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_6
    move-object p1, v5

    .line 177
    :goto_4
    if-eqz p1, :cond_9

    .line 178
    .line 179
    invoke-virtual {p1}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    if-eqz v3, :cond_8

    .line 184
    .line 185
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    if-eqz v3, :cond_8

    .line 190
    .line 191
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    if-nez v4, :cond_7

    .line 196
    .line 197
    move-object v5, v3

    .line 198
    :cond_7
    if-eqz v5, :cond_8

    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_8
    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    new-instance v5, Ljava/lang/StringBuilder;

    .line 210
    .line 211
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    :goto_5
    const-string v3, ""

    .line 225
    .line 226
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 227
    .line 228
    .line 229
    invoke-static {v0, v1, v5}, Lha/s;->a(Lha/s;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    invoke-virtual {p1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 241
    .line 242
    .line 243
    :cond_9
    :goto_6
    return-void

    .line 244
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    iget-object v0, p0, Lha/r;->b:Lha/s;

    .line 248
    .line 249
    iget-object v1, v0, Lha/s;->a:Lr8/g;

    .line 250
    .line 251
    iget-object v1, v1, Lr8/g;->a:Landroid/content/Context;

    .line 252
    .line 253
    const-string v2, "Hchat_moments_bottom_detail_config"

    .line 254
    .line 255
    invoke-static {v1, v2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    const-string v2, "moments_bottom_detail_enable"

    .line 260
    .line 261
    const/4 v3, 0x0

    .line 262
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    if-nez v1, :cond_a

    .line 267
    .line 268
    goto :goto_8

    .line 269
    :cond_a
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 270
    .line 271
    if-eqz v1, :cond_c

    .line 272
    .line 273
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    if-eqz p1, :cond_c

    .line 278
    .line 279
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    invoke-static {v2}, Lha/s;->c(Ljava/lang/Class;)Z

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    if-eqz v2, :cond_c

    .line 288
    .line 289
    const-string v2, "field_createTime"

    .line 290
    .line 291
    invoke-static {p1, v2}, Lha/s;->o(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Long;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    if-eqz v2, :cond_c

    .line 296
    .line 297
    iget-object v0, v0, Lha/s;->h:Ljava/lang/ThreadLocal;

    .line 298
    .line 299
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    check-cast v0, Ljava/util/Map;

    .line 307
    .line 308
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    if-nez v3, :cond_b

    .line 313
    .line 314
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 315
    .line 316
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 317
    .line 318
    .line 319
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    :cond_b
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 323
    .line 324
    invoke-interface {v3, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    :goto_7
    invoke-virtual {v3}, Ljava/util/AbstractMap;->size()I

    .line 328
    .line 329
    .line 330
    move-result p1

    .line 331
    const/16 v0, 0x20

    .line 332
    .line 333
    if-le p1, v0, :cond_c

    .line 334
    .line 335
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    check-cast p1, Ljava/lang/Iterable;

    .line 343
    .line 344
    invoke-static {p1}, Ltf/m;->u1(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object p1

    .line 348
    check-cast p1, Ljava/lang/Long;

    .line 349
    .line 350
    if-eqz p1, :cond_c

    .line 351
    .line 352
    invoke-virtual {v3, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    goto :goto_7

    .line 356
    :cond_c
    :goto_8
    return-void

    .line 357
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    iget-object v0, p0, Lha/r;->b:Lha/s;

    .line 361
    .line 362
    iget-object v1, v0, Lha/s;->a:Lr8/g;

    .line 363
    .line 364
    iget-object v1, v1, Lr8/g;->a:Landroid/content/Context;

    .line 365
    .line 366
    const-string v2, "Hchat_moments_bottom_detail_config"

    .line 367
    .line 368
    invoke-static {v1, v2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    const-string v2, "moments_bottom_detail_enable"

    .line 373
    .line 374
    const/4 v3, 0x0

    .line 375
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 376
    .line 377
    .line 378
    move-result v1

    .line 379
    if-nez v1, :cond_d

    .line 380
    .line 381
    goto :goto_9

    .line 382
    :cond_d
    iget-object v0, v0, Lha/s;->c:Landroid/content/SharedPreferences;

    .line 383
    .line 384
    const-string v1, "moments_bottom_detail_hide_group_icon"

    .line 385
    .line 386
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 387
    .line 388
    .line 389
    move-result v0

    .line 390
    if-eqz v0, :cond_e

    .line 391
    .line 392
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 393
    .line 394
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    :cond_e
    :goto_9
    return-void

    .line 398
    nop

    .line 399
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 3

    .line 1
    iget v0, p0, Lha/r;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lha/r;->b:Lha/s;

    .line 14
    .line 15
    iget-object v0, v0, Lha/s;->a:Lr8/g;

    .line 16
    .line 17
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 18
    .line 19
    const-string v1, "Hchat_moments_bottom_detail_config"

    .line 20
    .line 21
    invoke-static {v0, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "moments_bottom_detail_enable"

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
