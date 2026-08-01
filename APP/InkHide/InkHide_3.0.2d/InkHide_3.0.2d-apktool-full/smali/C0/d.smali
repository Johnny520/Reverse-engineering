.class public final LC0/d;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LC0/d;->a:I

    iput-object p2, p0, LC0/d;->b:Ljava/lang/Object;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 8

    .line 1
    iget v0, p0, LC0/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    return-void

    .line 7
    :pswitch_1
    const-string v0, "param"

    .line 8
    .line 9
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v0, p0, LC0/d;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lr0/A1;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    goto/16 :goto_7

    .line 24
    .line 25
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    new-instance v2, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    :goto_0
    sget-object v3, LF0/s;->a:LF0/s;

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    const-class v4, Ljava/lang/Object;

    .line 39
    .line 40
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-nez v4, :cond_2

    .line 45
    .line 46
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    const-string v5, "getDeclaredFields(...)"

    .line 51
    .line 52
    invoke-static {v4, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v4}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    goto :goto_1

    .line 60
    :catchall_0
    move-exception v4

    .line 61
    new-instance v5, LE0/d;

    .line 62
    .line 63
    invoke-direct {v5, v4}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    move-object v4, v5

    .line 67
    :goto_1
    nop

    .line 68
    instance-of v5, v4, LE0/d;

    .line 69
    .line 70
    if-eqz v5, :cond_1

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_1
    move-object v3, v4

    .line 74
    :goto_2
    check-cast v3, Ljava/util/Collection;

    .line 75
    .line 76
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    goto :goto_0

    .line 84
    :cond_2
    iget-object v1, v0, Lr0/A1;->b:LA0/V;

    .line 85
    .line 86
    const/4 v4, 0x0

    .line 87
    if-eqz v1, :cond_3

    .line 88
    .line 89
    iget-object v1, v1, LA0/V;->b:Ljava/util/List;

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_3
    move-object v1, v4

    .line 93
    :goto_3
    if-nez v1, :cond_4

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_4
    move-object v3, v1

    .line 97
    :goto_4
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-eqz v3, :cond_8

    .line 106
    .line 107
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    check-cast v3, Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    :cond_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    if-eqz v6, :cond_7

    .line 122
    .line 123
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    move-object v7, v6

    .line 128
    check-cast v7, Ljava/lang/reflect/Field;

    .line 129
    .line 130
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    invoke-static {v7, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    if-eqz v7, :cond_6

    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_7
    move-object v6, v4

    .line 142
    :goto_5
    check-cast v6, Ljava/lang/reflect/Field;

    .line 143
    .line 144
    if-eqz v6, :cond_5

    .line 145
    .line 146
    invoke-static {p1, v6}, Lr0/A1;->e(Ljava/lang/Object;Ljava/lang/reflect/Field;)Landroid/widget/EditText;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    if-eqz v3, :cond_5

    .line 151
    .line 152
    move-object v4, v3

    .line 153
    goto :goto_6

    .line 154
    :cond_8
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    :cond_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    if-eqz v2, :cond_b

    .line 163
    .line 164
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    check-cast v2, Ljava/lang/reflect/Field;

    .line 169
    .line 170
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    const-class v5, Landroid/widget/EditText;

    .line 175
    .line 176
    invoke-virtual {v5, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    if-nez v3, :cond_a

    .line 181
    .line 182
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    const/4 v5, 0x0

    .line 191
    const-string v6, "ActionBarEditText"

    .line 192
    .line 193
    invoke-static {v3, v6, v5}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    if-nez v3, :cond_a

    .line 198
    .line 199
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    const-string v5, "EditText"

    .line 208
    .line 209
    invoke-virtual {v3, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    if-eqz v3, :cond_9

    .line 214
    .line 215
    :cond_a
    invoke-static {p1, v2}, Lr0/A1;->e(Ljava/lang/Object;Ljava/lang/reflect/Field;)Landroid/widget/EditText;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    if-eqz v2, :cond_9

    .line 220
    .line 221
    move-object v4, v2

    .line 222
    :cond_b
    :goto_6
    if-nez v4, :cond_c

    .line 223
    .line 224
    goto :goto_7

    .line 225
    :cond_c
    const v1, 0x4ef7cb63

    .line 226
    .line 227
    .line 228
    invoke-virtual {v4, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 233
    .line 234
    invoke-static {v2, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    if-eqz v2, :cond_d

    .line 239
    .line 240
    goto :goto_7

    .line 241
    :cond_d
    new-instance v2, Lr0/v;

    .line 242
    .line 243
    invoke-direct {v2, v0, p1, v4}, Lr0/v;-><init>(Lr0/A1;Ljava/lang/Object;Landroid/widget/EditText;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v4, v1, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    const-string v1, "search command watcher attached"

    .line 269
    .line 270
    filled-new-array {v1, p1, v0}, [Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    :goto_7
    return-void

    .line 278
    :pswitch_2
    const-string v0, "param"

    .line 279
    .line 280
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    return-void

    .line 284
    :pswitch_3
    const-string v0, "param"

    .line 285
    .line 286
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    invoke-static {v0}, LN0/o;->c(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    if-eqz v1, :cond_e

    .line 298
    .line 299
    check-cast v0, Ljava/util/Map;

    .line 300
    .line 301
    goto :goto_8

    .line 302
    :cond_e
    const/4 v0, 0x0

    .line 303
    :goto_8
    if-nez v0, :cond_f

    .line 304
    .line 305
    goto :goto_b

    .line 306
    :cond_f
    sget-object v1, LC0/e;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 307
    .line 308
    iget-object v2, p0, LC0/d;->b:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v2, Landroid/content/Context;

    .line 311
    .line 312
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    :cond_10
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 317
    .line 318
    .line 319
    move-result v3

    .line 320
    if-eqz v3, :cond_11

    .line 321
    .line 322
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    check-cast v3, Lr0/c;

    .line 327
    .line 328
    :try_start_1
    invoke-virtual {v3, v2, p1, v0}, Lr0/c;->a(Landroid/content/Context;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/util/Map;)V

    .line 329
    .line 330
    .line 331
    sget-object v4, LE0/i;->a:LE0/i;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 332
    .line 333
    goto :goto_a

    .line 334
    :catchall_1
    move-exception v4

    .line 335
    new-instance v5, LE0/d;

    .line 336
    .line 337
    invoke-direct {v5, v4}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 338
    .line 339
    .line 340
    move-object v4, v5

    .line 341
    :goto_a
    invoke-static {v4}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 342
    .line 343
    .line 344
    move-result-object v4

    .line 345
    if-eqz v4, :cond_10

    .line 346
    .line 347
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v3

    .line 355
    const-string v5, "wechat xml listener fail"

    .line 356
    .line 357
    filled-new-array {v5, v3, v4}, [Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v3

    .line 361
    invoke-static {v3}, Li0/a;->d([Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    goto :goto_9

    .line 365
    :cond_11
    :goto_b
    return-void

    .line 366
    nop

    .line 367
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, LC0/d;->b:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "param"

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget v6, v0, LC0/d;->a:I

    .line 12
    .line 13
    packed-switch v6, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    invoke-static {v1, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget-boolean v4, Lz0/i;->a:Z

    .line 21
    .line 22
    invoke-static {}, Lz0/g;->x()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-nez v4, :cond_0

    .line 27
    .line 28
    goto/16 :goto_11

    .line 29
    .line 30
    :cond_0
    iget-object v4, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 31
    .line 32
    const-string v6, "args"

    .line 33
    .line 34
    invoke-static {v4, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    array-length v6, v4

    .line 38
    move v7, v3

    .line 39
    :goto_0
    if-ge v7, v6, :cond_2

    .line 40
    .line 41
    aget-object v9, v4, v7

    .line 42
    .line 43
    instance-of v10, v9, Landroid/app/Notification;

    .line 44
    .line 45
    if-eqz v10, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    add-int/2addr v7, v5

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/4 v9, 0x0

    .line 51
    :goto_1
    instance-of v4, v9, Landroid/app/Notification;

    .line 52
    .line 53
    if-eqz v4, :cond_3

    .line 54
    .line 55
    check-cast v9, Landroid/app/Notification;

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    const/4 v9, 0x0

    .line 59
    :goto_2
    if-nez v9, :cond_4

    .line 60
    .line 61
    goto/16 :goto_11

    .line 62
    .line 63
    :cond_4
    check-cast v2, Lr0/r;

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 69
    .line 70
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 71
    .line 72
    .line 73
    iget-object v4, v9, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 74
    .line 75
    if-eqz v4, :cond_5

    .line 76
    .line 77
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    if-eqz v4, :cond_5

    .line 82
    .line 83
    invoke-virtual {v2, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    :cond_5
    iget-object v4, v9, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 87
    .line 88
    invoke-static {v4, v2, v3}, Lr0/r;->a(Landroid/os/Bundle;Ljava/util/LinkedHashSet;I)V

    .line 89
    .line 90
    .line 91
    iget-object v4, v9, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;

    .line 92
    .line 93
    invoke-static {v4, v2}, Lr0/r;->b(Landroid/app/PendingIntent;Ljava/util/LinkedHashSet;)V

    .line 94
    .line 95
    .line 96
    iget-object v4, v9, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 97
    .line 98
    invoke-static {v4, v2}, Lr0/r;->b(Landroid/app/PendingIntent;Ljava/util/LinkedHashSet;)V

    .line 99
    .line 100
    .line 101
    iget-object v4, v9, Landroid/app/Notification;->fullScreenIntent:Landroid/app/PendingIntent;

    .line 102
    .line 103
    invoke-static {v4, v2}, Lr0/r;->b(Landroid/app/PendingIntent;Ljava/util/LinkedHashSet;)V

    .line 104
    .line 105
    .line 106
    iget-object v4, v9, Landroid/app/Notification;->actions:[Landroid/app/Notification$Action;

    .line 107
    .line 108
    if-eqz v4, :cond_7

    .line 109
    .line 110
    array-length v6, v4

    .line 111
    move v7, v3

    .line 112
    :goto_3
    if-ge v7, v6, :cond_7

    .line 113
    .line 114
    aget-object v10, v4, v7

    .line 115
    .line 116
    iget-object v11, v10, Landroid/app/Notification$Action;->title:Ljava/lang/CharSequence;

    .line 117
    .line 118
    if-eqz v11, :cond_6

    .line 119
    .line 120
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v11

    .line 124
    if-eqz v11, :cond_6

    .line 125
    .line 126
    invoke-virtual {v2, v11}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    :cond_6
    iget-object v10, v10, Landroid/app/Notification$Action;->actionIntent:Landroid/app/PendingIntent;

    .line 130
    .line 131
    invoke-static {v10, v2}, Lr0/r;->b(Landroid/app/PendingIntent;Ljava/util/LinkedHashSet;)V

    .line 132
    .line 133
    .line 134
    add-int/2addr v7, v5

    .line 135
    goto :goto_3

    .line 136
    :cond_7
    iget-object v4, v9, Landroid/app/Notification;->publicVersion:Landroid/app/Notification;

    .line 137
    .line 138
    if-eqz v4, :cond_a

    .line 139
    .line 140
    if-eq v4, v9, :cond_8

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_8
    const/4 v4, 0x0

    .line 144
    :goto_4
    if-eqz v4, :cond_a

    .line 145
    .line 146
    iget-object v6, v4, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 147
    .line 148
    if-eqz v6, :cond_9

    .line 149
    .line 150
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    if-eqz v6, :cond_9

    .line 155
    .line 156
    invoke-virtual {v2, v6}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    :cond_9
    iget-object v6, v4, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 160
    .line 161
    invoke-static {v6, v2, v3}, Lr0/r;->a(Landroid/os/Bundle;Ljava/util/LinkedHashSet;I)V

    .line 162
    .line 163
    .line 164
    iget-object v4, v4, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;

    .line 165
    .line 166
    invoke-static {v4, v2}, Lr0/r;->b(Landroid/app/PendingIntent;Ljava/util/LinkedHashSet;)V

    .line 167
    .line 168
    .line 169
    :cond_a
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 170
    .line 171
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 172
    .line 173
    .line 174
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    :cond_b
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    if-eqz v6, :cond_c

    .line 183
    .line 184
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    move-object v7, v6

    .line 189
    check-cast v7, Ljava/lang/String;

    .line 190
    .line 191
    invoke-static {v7}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 192
    .line 193
    .line 194
    move-result v7

    .line 195
    if-nez v7, :cond_b

    .line 196
    .line 197
    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_c
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    if-eqz v2, :cond_d

    .line 206
    .line 207
    goto/16 :goto_f

    .line 208
    .line 209
    :cond_d
    sget-boolean v2, Lz0/i;->a:Z

    .line 210
    .line 211
    invoke-static {}, Lz0/g;->i()Ljava/util/ArrayList;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    new-instance v6, Ljava/util/ArrayList;

    .line 216
    .line 217
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    :cond_e
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result v7

    .line 228
    if-eqz v7, :cond_f

    .line 229
    .line 230
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v7

    .line 234
    move-object v9, v7

    .line 235
    check-cast v9, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 236
    .line 237
    invoke-virtual {v9}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v9

    .line 241
    invoke-static {v9}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 242
    .line 243
    .line 244
    move-result v9

    .line 245
    if-nez v9, :cond_e

    .line 246
    .line 247
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    goto :goto_6

    .line 251
    :cond_f
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 256
    .line 257
    .line 258
    move-result v7

    .line 259
    if-eqz v7, :cond_18

    .line 260
    .line 261
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v7

    .line 265
    move-object v9, v7

    .line 266
    check-cast v9, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 267
    .line 268
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 269
    .line 270
    .line 271
    move-result v10

    .line 272
    if-eqz v10, :cond_11

    .line 273
    .line 274
    :cond_10
    move/from16 v16, v5

    .line 275
    .line 276
    goto/16 :goto_b

    .line 277
    .line 278
    :cond_11
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 279
    .line 280
    .line 281
    move-result-object v10

    .line 282
    :cond_12
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 283
    .line 284
    .line 285
    move-result v11

    .line 286
    if-eqz v11, :cond_10

    .line 287
    .line 288
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v11

    .line 292
    check-cast v11, Ljava/lang/String;

    .line 293
    .line 294
    invoke-virtual {v9}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v12

    .line 298
    const/4 v13, 0x6

    .line 299
    invoke-static {v11, v12, v3, v3, v13}, LU0/i;->p0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 300
    .line 301
    .line 302
    move-result v13

    .line 303
    :goto_8
    if-ltz v13, :cond_12

    .line 304
    .line 305
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 306
    .line 307
    .line 308
    move-result v14

    .line 309
    add-int/2addr v14, v13

    .line 310
    const/16 v15, 0x2d

    .line 311
    .line 312
    move/from16 v16, v5

    .line 313
    .line 314
    const/16 v5, 0x5f

    .line 315
    .line 316
    if-eqz v13, :cond_14

    .line 317
    .line 318
    add-int/lit8 v8, v13, -0x1

    .line 319
    .line 320
    invoke-virtual {v11, v8}, Ljava/lang/String;->charAt(I)C

    .line 321
    .line 322
    .line 323
    move-result v8

    .line 324
    invoke-static {v8}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    .line 325
    .line 326
    .line 327
    move-result v17

    .line 328
    if-nez v17, :cond_13

    .line 329
    .line 330
    if-eq v8, v5, :cond_13

    .line 331
    .line 332
    if-ne v8, v15, :cond_14

    .line 333
    .line 334
    :cond_13
    move v8, v3

    .line 335
    goto :goto_9

    .line 336
    :cond_14
    move/from16 v8, v16

    .line 337
    .line 338
    :goto_9
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    if-eq v14, v3, :cond_16

    .line 343
    .line 344
    invoke-virtual {v11, v14}, Ljava/lang/String;->charAt(I)C

    .line 345
    .line 346
    .line 347
    move-result v3

    .line 348
    invoke-static {v3}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    .line 349
    .line 350
    .line 351
    move-result v14

    .line 352
    if-nez v14, :cond_15

    .line 353
    .line 354
    if-eq v3, v5, :cond_15

    .line 355
    .line 356
    if-ne v3, v15, :cond_16

    .line 357
    .line 358
    :cond_15
    const/4 v3, 0x0

    .line 359
    goto :goto_a

    .line 360
    :cond_16
    move/from16 v3, v16

    .line 361
    .line 362
    :goto_a
    if-eqz v8, :cond_17

    .line 363
    .line 364
    if-eqz v3, :cond_17

    .line 365
    .line 366
    goto :goto_c

    .line 367
    :cond_17
    add-int/lit8 v13, v13, 0x1

    .line 368
    .line 369
    const/4 v3, 0x4

    .line 370
    const/4 v5, 0x0

    .line 371
    invoke-static {v11, v12, v13, v5, v3}, LU0/i;->p0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 372
    .line 373
    .line 374
    move-result v13

    .line 375
    move v3, v5

    .line 376
    move/from16 v5, v16

    .line 377
    .line 378
    goto :goto_8

    .line 379
    :goto_b
    move/from16 v5, v16

    .line 380
    .line 381
    const/4 v3, 0x0

    .line 382
    goto :goto_7

    .line 383
    :cond_18
    const/4 v7, 0x0

    .line 384
    :goto_c
    check-cast v7, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 385
    .line 386
    if-eqz v7, :cond_19

    .line 387
    .line 388
    invoke-virtual {v7}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    goto/16 :goto_10

    .line 393
    .line 394
    :cond_19
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    :cond_1a
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 399
    .line 400
    .line 401
    move-result v3

    .line 402
    if-eqz v3, :cond_1d

    .line 403
    .line 404
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    move-object v5, v3

    .line 409
    check-cast v5, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 410
    .line 411
    invoke-virtual {v5}, Lcom/lu/wxmask/bean/MaskItemBean;->getTagName()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v5

    .line 415
    invoke-static {v5}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 416
    .line 417
    .line 418
    move-result-object v5

    .line 419
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v5

    .line 423
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 424
    .line 425
    .line 426
    move-result v6

    .line 427
    if-lez v6, :cond_1a

    .line 428
    .line 429
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 430
    .line 431
    .line 432
    move-result v6

    .line 433
    if-eqz v6, :cond_1b

    .line 434
    .line 435
    goto :goto_d

    .line 436
    :cond_1b
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 437
    .line 438
    .line 439
    move-result-object v6

    .line 440
    :cond_1c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 441
    .line 442
    .line 443
    move-result v7

    .line 444
    if-eqz v7, :cond_1a

    .line 445
    .line 446
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v7

    .line 450
    check-cast v7, Ljava/lang/String;

    .line 451
    .line 452
    invoke-static {v7}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 453
    .line 454
    .line 455
    move-result-object v7

    .line 456
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v7

    .line 460
    invoke-static {v7, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result v8

    .line 464
    if-nez v8, :cond_1e

    .line 465
    .line 466
    const-string v8, ":"

    .line 467
    .line 468
    invoke-virtual {v5, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v8

    .line 472
    const/4 v9, 0x0

    .line 473
    invoke-static {v7, v9, v8}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 474
    .line 475
    .line 476
    move-result v8

    .line 477
    if-nez v8, :cond_1e

    .line 478
    .line 479
    const-string v8, "\uff1a"

    .line 480
    .line 481
    invoke-virtual {v5, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v8

    .line 485
    invoke-static {v7, v9, v8}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 486
    .line 487
    .line 488
    move-result v8

    .line 489
    if-nez v8, :cond_1e

    .line 490
    .line 491
    const-string v8, " "

    .line 492
    .line 493
    invoke-virtual {v5, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v8

    .line 497
    invoke-static {v7, v9, v8}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 498
    .line 499
    .line 500
    move-result v7

    .line 501
    if-eqz v7, :cond_1c

    .line 502
    .line 503
    goto :goto_e

    .line 504
    :cond_1d
    const/4 v3, 0x0

    .line 505
    :cond_1e
    :goto_e
    check-cast v3, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 506
    .line 507
    if-eqz v3, :cond_1f

    .line 508
    .line 509
    invoke-virtual {v3}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v2

    .line 513
    goto :goto_10

    .line 514
    :cond_1f
    :goto_f
    const/4 v2, 0x0

    .line 515
    :goto_10
    if-nez v2, :cond_20

    .line 516
    .line 517
    goto :goto_11

    .line 518
    :cond_20
    sget-boolean v3, Lz0/i;->a:Z

    .line 519
    .line 520
    invoke-static {v2}, Lz0/g;->e(Ljava/lang/String;)Z

    .line 521
    .line 522
    .line 523
    move-result v3

    .line 524
    if-eqz v3, :cond_21

    .line 525
    .line 526
    goto :goto_11

    .line 527
    :cond_21
    const-string v3, "hide close friend push notification"

    .line 528
    .line 529
    filled-new-array {v3, v2}, [Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v2

    .line 533
    invoke-static {v2}, Li0/a;->a([Ljava/lang/Object;)V

    .line 534
    .line 535
    .line 536
    const/4 v2, 0x0

    .line 537
    invoke-virtual {v1, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 538
    .line 539
    .line 540
    :goto_11
    return-void

    .line 541
    :pswitch_1
    move/from16 v16, v5

    .line 542
    .line 543
    invoke-static {v1, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    iget-object v3, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 547
    .line 548
    sget-object v4, Lz0/z;->a:Lz0/z;

    .line 549
    .line 550
    invoke-virtual {v4, v3}, Lz0/z;->h(Ljava/lang/Object;)V

    .line 551
    .line 552
    .line 553
    iget-object v3, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 554
    .line 555
    aget-object v3, v3, v16

    .line 556
    .line 557
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v3

    .line 561
    const-class v4, Lq0/h;

    .line 562
    .line 563
    invoke-static {v4}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 564
    .line 565
    .line 566
    move-result-object v4

    .line 567
    check-cast v4, Lq0/h;

    .line 568
    .line 569
    sget-boolean v5, Lz0/i;->a:Z

    .line 570
    .line 571
    invoke-static {}, Lz0/g;->z()Z

    .line 572
    .line 573
    .line 574
    move-result v5

    .line 575
    if-nez v5, :cond_22

    .line 576
    .line 577
    goto/16 :goto_15

    .line 578
    .line 579
    :cond_22
    iget-object v4, v4, Lq0/h;->a:Ljava/util/ArrayList;

    .line 580
    .line 581
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 582
    .line 583
    .line 584
    move-result v5

    .line 585
    if-nez v5, :cond_2b

    .line 586
    .line 587
    check-cast v2, Lq0/a;

    .line 588
    .line 589
    iget-object v2, v2, Lq0/a;->b:Ljava/lang/Object;

    .line 590
    .line 591
    check-cast v2, LE0/f;

    .line 592
    .line 593
    invoke-virtual {v2}, LE0/f;->a()Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v2

    .line 597
    check-cast v2, LU0/g;

    .line 598
    .line 599
    invoke-virtual {v2, v3}, LU0/g;->a(Ljava/lang/String;)Z

    .line 600
    .line 601
    .line 602
    move-result v2

    .line 603
    if-nez v2, :cond_24

    .line 604
    .line 605
    const-string v2, "SELECT type, subtype, entity_id, aux_index, MAX(timestamp) as maxTime, count(aux_index) as msgCount, talker FROM FTS5MetaMessage"

    .line 606
    .line 607
    const/4 v5, 0x0

    .line 608
    invoke-static {v3, v5, v2}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 609
    .line 610
    .line 611
    move-result v2

    .line 612
    if-nez v2, :cond_24

    .line 613
    .line 614
    const-string v2, "SELECT FTS5MetaMessage.docid, type, subtype, entity_id, aux_index, timestamp, talker FROM FTS5MetaMessage"

    .line 615
    .line 616
    invoke-static {v3, v5, v2}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 617
    .line 618
    .line 619
    move-result v2

    .line 620
    if-eqz v2, :cond_23

    .line 621
    .line 622
    goto :goto_12

    .line 623
    :cond_23
    const-string v1, "select * from ( select * from message where talker= "

    .line 624
    .line 625
    move/from16 v2, v16

    .line 626
    .line 627
    invoke-static {v3, v2, v1}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 628
    .line 629
    .line 630
    goto/16 :goto_15

    .line 631
    .line 632
    :cond_24
    :goto_12
    invoke-static {v4}, LF0/k;->h0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 633
    .line 634
    .line 635
    move-result-object v2

    .line 636
    new-instance v4, Ljava/util/ArrayList;

    .line 637
    .line 638
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 642
    .line 643
    .line 644
    move-result-object v2

    .line 645
    :cond_25
    :goto_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 646
    .line 647
    .line 648
    move-result v5

    .line 649
    if-eqz v5, :cond_26

    .line 650
    .line 651
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object v5

    .line 655
    move-object v6, v5

    .line 656
    check-cast v6, Ljava/lang/String;

    .line 657
    .line 658
    invoke-static {v6}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 659
    .line 660
    .line 661
    move-result v6

    .line 662
    if-nez v6, :cond_25

    .line 663
    .line 664
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 665
    .line 666
    .line 667
    goto :goto_13

    .line 668
    :cond_26
    new-instance v7, Ljava/util/ArrayList;

    .line 669
    .line 670
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 671
    .line 672
    .line 673
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 674
    .line 675
    .line 676
    move-result-object v2

    .line 677
    :cond_27
    :goto_14
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 678
    .line 679
    .line 680
    move-result v4

    .line 681
    if-eqz v4, :cond_28

    .line 682
    .line 683
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v4

    .line 687
    move-object v5, v4

    .line 688
    check-cast v5, Ljava/lang/String;

    .line 689
    .line 690
    sget-boolean v6, Lz0/i;->a:Z

    .line 691
    .line 692
    invoke-static {v5}, Lz0/g;->e(Ljava/lang/String;)Z

    .line 693
    .line 694
    .line 695
    move-result v5

    .line 696
    if-nez v5, :cond_27

    .line 697
    .line 698
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 699
    .line 700
    .line 701
    goto :goto_14

    .line 702
    :cond_28
    new-instance v11, LA0/a;

    .line 703
    .line 704
    const/16 v2, 0x1c

    .line 705
    .line 706
    invoke-direct {v11, v2}, LA0/a;-><init>(I)V

    .line 707
    .line 708
    .line 709
    const/4 v9, 0x0

    .line 710
    const/4 v10, 0x0

    .line 711
    const-string v8, ","

    .line 712
    .line 713
    const/16 v12, 0x1e

    .line 714
    .line 715
    invoke-static/range {v7 .. v12}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 716
    .line 717
    .line 718
    move-result-object v2

    .line 719
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 720
    .line 721
    .line 722
    move-result v4

    .line 723
    if-eqz v4, :cond_29

    .line 724
    .line 725
    goto :goto_15

    .line 726
    :cond_29
    const-string v4, ";"

    .line 727
    .line 728
    invoke-static {v3, v4}, LU0/q;->b0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 729
    .line 730
    .line 731
    move-result v4

    .line 732
    if-eqz v4, :cond_2a

    .line 733
    .line 734
    invoke-static {v3}, LU0/i;->k0(Ljava/lang/String;)Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v3

    .line 738
    :cond_2a
    new-instance v4, Ljava/lang/StringBuilder;

    .line 739
    .line 740
    const-string v5, "SELECT * FROM ("

    .line 741
    .line 742
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 743
    .line 744
    .line 745
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 746
    .line 747
    .line 748
    const-string v3, ") AS a WHERE aux_index NOT IN ("

    .line 749
    .line 750
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 751
    .line 752
    .line 753
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 754
    .line 755
    .line 756
    const-string v2, ");"

    .line 757
    .line 758
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 759
    .line 760
    .line 761
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object v2

    .line 765
    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 766
    .line 767
    const/16 v16, 0x1

    .line 768
    .line 769
    aput-object v2, v1, v16

    .line 770
    .line 771
    const-string v1, "sql hide hit:"

    .line 772
    .line 773
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    move-result-object v1

    .line 777
    invoke-static {v1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 778
    .line 779
    .line 780
    :cond_2b
    :goto_15
    return-void

    .line 781
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
