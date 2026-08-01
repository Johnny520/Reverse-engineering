.class public final Lm0/f;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/lu/wxmask/MainHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lm0/f;->a:I

    .line 2
    iput-object p1, p0, Lm0/f;->c:Ljava/lang/Object;

    iput-object p2, p0, Lm0/f;->b:Ljava/lang/Object;

    .line 3
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Le0/a;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lm0/f;->a:I

    iput-object p1, p0, Lm0/f;->b:Ljava/lang/Object;

    iput-object p2, p0, Lm0/f;->c:Ljava/lang/Object;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 9

    .line 1
    const-string v0, "args"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const-string v3, "param"

    .line 6
    .line 7
    iget-object v4, p0, Lm0/f;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v5, p0, Lm0/f;->b:Ljava/lang/Object;

    .line 10
    .line 11
    iget v6, p0, Lm0/f;->a:I

    .line 12
    .line 13
    packed-switch v6, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    :pswitch_0
    return-void

    .line 17
    :pswitch_1
    invoke-static {p1, v3}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v5, Lr0/H0;

    .line 23
    .line 24
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 28
    .line 29
    .line 30
    move-result-wide v6

    .line 31
    sget-boolean v1, Lz0/i;->a:Z

    .line 32
    .line 33
    invoke-static {}, Lz0/g;->F()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    check-cast v4, Ljava/lang/String;

    .line 38
    .line 39
    if-nez v1, :cond_0

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    invoke-virtual {v5, v0}, Lr0/H0;->U(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    instance-of v3, v1, Landroid/view/ContextMenu;

    .line 47
    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    check-cast v1, Landroid/view/ContextMenu;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move-object v1, v2

    .line 54
    :goto_0
    if-nez v1, :cond_2

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    invoke-static {v0}, Lr0/H0;->W(Ljava/lang/Object;)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-static {v3}, Lr0/H0;->X(Landroid/view/View;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    if-nez v8, :cond_3

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-virtual {v5, v3, v2, v8}, Lr0/H0;->q1(Landroid/view/View;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v5, v8, v2, v0}, Lr0/H0;->l1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5, v1, v8, v2}, Lr0/H0;->o(Landroid/view/ContextMenu;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const-string v0, "conversation append popup"

    .line 79
    .line 80
    invoke-static {v0, v6, v7, v4}, Lr0/H0;->b1(Ljava/lang/String;JLjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :goto_1
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 84
    .line 85
    invoke-static {v5, p1, v4}, Lr0/H0;->b(Lr0/H0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :pswitch_2
    invoke-static {p1, v3}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 93
    .line 94
    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v1, p1}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    if-nez p1, :cond_4

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_4
    :try_start_0
    const-string v0, "itemView"

    .line 105
    .line 106
    sget-object v1, Lc0/f;->b:Ld0/b;

    .line 107
    .line 108
    invoke-interface {v1, p1, v0}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    check-cast p1, Landroid/view/View;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :catchall_0
    move-exception p1

    .line 116
    new-instance v0, LE0/d;

    .line 117
    .line 118
    invoke-direct {v0, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    move-object p1, v0

    .line 122
    :goto_2
    nop

    .line 123
    instance-of v0, p1, LE0/d;

    .line 124
    .line 125
    if-eqz v0, :cond_5

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_5
    move-object v2, p1

    .line 129
    :goto_3
    check-cast v2, Landroid/view/View;

    .line 130
    .line 131
    if-nez v2, :cond_6

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_6
    check-cast v4, Ljava/lang/Class;

    .line 135
    .line 136
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    const-string v1, "tag page onBind"

    .line 149
    .line 150
    filled-new-array {v1, p1, v0}, [Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    check-cast v5, Lr0/g0;

    .line 155
    .line 156
    invoke-virtual {v5, p1}, Lr0/g0;->e([Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v5, v2}, Lr0/g0;->s(Landroid/view/View;)V

    .line 160
    .line 161
    .line 162
    :goto_4
    return-void

    .line 163
    :pswitch_3
    invoke-static {p1, v3}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    iget-object v3, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 167
    .line 168
    instance-of v6, v3, Landroid/widget/ListView;

    .line 169
    .line 170
    if-eqz v6, :cond_7

    .line 171
    .line 172
    check-cast v3, Landroid/widget/ListView;

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_7
    move-object v3, v2

    .line 176
    :goto_5
    if-nez v3, :cond_8

    .line 177
    .line 178
    goto/16 :goto_9

    .line 179
    .line 180
    :cond_8
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 181
    .line 182
    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-static {v1, p1}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    if-nez p1, :cond_9

    .line 190
    .line 191
    goto/16 :goto_9

    .line 192
    .line 193
    :cond_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    check-cast v5, Lr0/E;

    .line 198
    .line 199
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    :goto_6
    if-eqz v0, :cond_b

    .line 203
    .line 204
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    const-string v7, "kc5.v0"

    .line 209
    .line 210
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v7

    .line 214
    if-nez v7, :cond_f

    .line 215
    .line 216
    const-string v7, "va5.v0"

    .line 217
    .line 218
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v7

    .line 222
    if-nez v7, :cond_f

    .line 223
    .line 224
    const-string v7, "sd5.x0"

    .line 225
    .line 226
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v7

    .line 230
    if-nez v7, :cond_f

    .line 231
    .line 232
    const-string v7, "yf5.w0"

    .line 233
    .line 234
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v7

    .line 238
    if-nez v7, :cond_f

    .line 239
    .line 240
    const-string v7, "com.tencent.mm.ui.k3"

    .line 241
    .line 242
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v7

    .line 246
    if-nez v7, :cond_f

    .line 247
    .line 248
    const-string v7, "com.tencent.mm.ui.i3"

    .line 249
    .line 250
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v7

    .line 254
    if-nez v7, :cond_f

    .line 255
    .line 256
    const-string v7, "com.tencent.mm.ui.conversation"

    .line 257
    .line 258
    invoke-static {v6, v1, v7}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 259
    .line 260
    .line 261
    move-result v6

    .line 262
    if-eqz v6, :cond_a

    .line 263
    .line 264
    goto :goto_8

    .line 265
    :cond_a
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    goto :goto_6

    .line 270
    :cond_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-static {}, Lz0/r;->g()Lz0/A;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    if-nez v6, :cond_e

    .line 279
    .line 280
    const/16 v6, 0xbf4

    .line 281
    .line 282
    invoke-static {v6}, Lz0/r;->r(I)Z

    .line 283
    .line 284
    .line 285
    move-result v6

    .line 286
    if-nez v6, :cond_c

    .line 287
    .line 288
    goto :goto_7

    .line 289
    :cond_c
    check-cast v4, Landroid/content/Context;

    .line 290
    .line 291
    invoke-static {v4}, LA0/l;->h(Landroid/content/Context;)LA0/M;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    if-eqz v1, :cond_d

    .line 296
    .line 297
    iget-object v2, v1, LA0/M;->a:Ljava/lang/String;

    .line 298
    .line 299
    :cond_d
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-static {v2, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    :cond_e
    :goto_7
    if-nez v1, :cond_f

    .line 308
    .line 309
    goto :goto_9

    .line 310
    :cond_f
    :goto_8
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 311
    .line 312
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    iput-object v0, v5, Lr0/E;->b:Ljava/lang/ref/WeakReference;

    .line 316
    .line 317
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 318
    .line 319
    invoke-direct {v0, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    iput-object v0, v5, Lr0/E;->a:Ljava/lang/ref/WeakReference;

    .line 323
    .line 324
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    const-string v0, "hide close friend list adapter bind"

    .line 333
    .line 334
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object p1

    .line 338
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    :goto_9
    return-void

    .line 342
    :pswitch_4
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 343
    .line 344
    aget-object p1, p1, v1

    .line 345
    .line 346
    check-cast p1, Landroid/content/Context;

    .line 347
    .line 348
    check-cast v5, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    .line 349
    .line 350
    check-cast v4, Lcom/lu/wxmask/MainHook;

    .line 351
    .line 352
    invoke-static {v4, p1, v5}, Lcom/lu/wxmask/MainHook;->c(Lcom/lu/wxmask/MainHook;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    .line 353
    .line 354
    .line 355
    return-void

    .line 356
    nop

    .line 357
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 13

    .line 1
    iget v0, p0, Lm0/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    const-string v0, "param"

    .line 8
    .line 9
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 13
    .line 14
    const-string v1, "args"

    .line 15
    .line 16
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-static {v2, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    instance-of v3, v0, Ljava/lang/Integer;

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    check-cast v0, Ljava/lang/Integer;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-object v0, v4

    .line 33
    :goto_0
    if-eqz v0, :cond_12

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/16 v3, 0x5721

    .line 40
    .line 41
    if-eq v0, v3, :cond_1

    .line 42
    .line 43
    goto/16 :goto_a

    .line 44
    .line 45
    :cond_1
    iget-object v5, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 46
    .line 47
    instance-of v6, v5, Landroid/app/Activity;

    .line 48
    .line 49
    if-eqz v6, :cond_2

    .line 50
    .line 51
    check-cast v5, Landroid/app/Activity;

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    move-object v5, v4

    .line 55
    :goto_1
    if-nez v5, :cond_3

    .line 56
    .line 57
    goto/16 :goto_a

    .line 58
    .line 59
    :cond_3
    iget-object v6, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 60
    .line 61
    invoke-static {v6, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 v7, 0x1

    .line 65
    invoke-static {v7, v6}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    instance-of v8, v6, Ljava/lang/Integer;

    .line 70
    .line 71
    if-eqz v8, :cond_4

    .line 72
    .line 73
    check-cast v6, Ljava/lang/Integer;

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    move-object v6, v4

    .line 77
    :goto_2
    if-eqz v6, :cond_5

    .line 78
    .line 79
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    goto :goto_3

    .line 84
    :cond_5
    move v6, v2

    .line 85
    :goto_3
    iget-object v8, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 86
    .line 87
    invoke-static {v8, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const/4 v1, 0x2

    .line 91
    invoke-static {v1, v8}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    instance-of v8, v1, Landroid/content/Intent;

    .line 96
    .line 97
    if-eqz v8, :cond_6

    .line 98
    .line 99
    check-cast v1, Landroid/content/Intent;

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_6
    move-object v1, v4

    .line 103
    :goto_4
    sget-object v8, Lz0/l;->a:Landroid/util/LruCache;

    .line 104
    .line 105
    if-eq v0, v3, :cond_7

    .line 106
    .line 107
    goto/16 :goto_9

    .line 108
    .line 109
    :cond_7
    sget-boolean v0, Lz0/i;->a:Z

    .line 110
    .line 111
    invoke-static {}, Lz0/g;->n()Landroid/content/SharedPreferences;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    const-string v3, "custom_local_avatar_pending_wxid"

    .line 116
    .line 117
    const-string v8, ""

    .line 118
    .line 119
    invoke-interface {v0, v3, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    if-nez v0, :cond_8

    .line 124
    .line 125
    move-object v0, v8

    .line 126
    :cond_8
    invoke-static {v8}, Lz0/l;->g(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    const/4 v3, -0x1

    .line 130
    if-ne v6, v3, :cond_10

    .line 131
    .line 132
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-eqz v3, :cond_9

    .line 137
    .line 138
    goto/16 :goto_8

    .line 139
    .line 140
    :cond_9
    if-eqz v1, :cond_10

    .line 141
    .line 142
    invoke-virtual {v1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    if-nez v1, :cond_a

    .line 147
    .line 148
    goto/16 :goto_8

    .line 149
    .line 150
    :cond_a
    const-string v3, "_"

    .line 151
    .line 152
    :try_start_0
    invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    invoke-virtual {v6, v1, v7}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    .line 158
    .line 159
    :catchall_0
    :try_start_1
    new-instance v6, Ljava/io/File;

    .line 160
    .line 161
    invoke-virtual {v5}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    const-string v9, "custom_local_avatars"

    .line 166
    .line 167
    invoke-direct {v6, v8, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    if-nez v8, :cond_b

    .line 175
    .line 176
    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    .line 177
    .line 178
    .line 179
    goto :goto_5

    .line 180
    :catchall_1
    move-exception v1

    .line 181
    goto/16 :goto_6

    .line 182
    .line 183
    :cond_b
    :goto_5
    new-instance v8, Ljava/io/File;

    .line 184
    .line 185
    const-string v9, "[^A-Za-z0-9_@.-]"

    .line 186
    .line 187
    invoke-static {v9}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    const-string v10, "compile(...)"

    .line 192
    .line 193
    invoke-static {v9, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v9, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 197
    .line 198
    .line 199
    move-result-object v9

    .line 200
    invoke-virtual {v9, v3}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v9

    .line 204
    const-string v10, "replaceAll(...)"

    .line 205
    .line 206
    invoke-static {v9, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 210
    .line 211
    .line 212
    move-result-wide v10

    .line 213
    new-instance v12, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v12, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    const-string v3, ".img"

    .line 228
    .line 229
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    invoke-direct {v8, v6, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    invoke-virtual {v3, v1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 244
    .line 245
    .line 246
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 247
    if-eqz v1, :cond_e

    .line 248
    .line 249
    :try_start_2
    new-instance v2, Ljava/io/FileOutputStream;

    .line 250
    .line 251
    invoke-direct {v2, v8}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 252
    .line 253
    .line 254
    :try_start_3
    invoke-static {v1, v2}, LD/h;->i(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 255
    .line 256
    .line 257
    :try_start_4
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 258
    .line 259
    .line 260
    :try_start_5
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    .line 261
    .line 262
    .line 263
    invoke-static {}, Lz0/l;->c()Ljava/util/Map;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    invoke-static {v1}, LF0/v;->d0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    sget-object v2, Lz0/l;->a:Landroid/util/LruCache;

    .line 279
    .line 280
    invoke-virtual {v2}, Landroid/util/LruCache;->evictAll()V

    .line 281
    .line 282
    .line 283
    invoke-static {v1}, Lz0/l;->f(Ljava/util/LinkedHashMap;)Z

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 288
    .line 289
    .line 290
    move-result-object v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 291
    goto :goto_7

    .line 292
    :catchall_2
    move-exception v3

    .line 293
    :try_start_6
    throw v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 294
    :catchall_3
    move-exception v6

    .line 295
    :try_start_7
    invoke-static {v2, v3}, LD/h;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 296
    .line 297
    .line 298
    throw v6
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 299
    :catchall_4
    move-exception v2

    .line 300
    :try_start_8
    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 301
    :catchall_5
    move-exception v3

    .line 302
    :try_start_9
    invoke-static {v1, v2}, LD/h;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 303
    .line 304
    .line 305
    throw v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 306
    :goto_6
    new-instance v2, LE0/d;

    .line 307
    .line 308
    invoke-direct {v2, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 309
    .line 310
    .line 311
    move-object v1, v2

    .line 312
    :goto_7
    invoke-static {v1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    if-eqz v2, :cond_c

    .line 317
    .line 318
    const-string v3, "save custom avatar fail"

    .line 319
    .line 320
    filled-new-array {v3, v0, v2}, [Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    :cond_c
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 328
    .line 329
    instance-of v2, v1, LE0/d;

    .line 330
    .line 331
    if-eqz v2, :cond_d

    .line 332
    .line 333
    move-object v1, v0

    .line 334
    :cond_d
    check-cast v1, Ljava/lang/Boolean;

    .line 335
    .line 336
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 337
    .line 338
    .line 339
    move-result v2

    .line 340
    :cond_e
    if-eqz v2, :cond_f

    .line 341
    .line 342
    const-string v0, "\u672c\u5730\u5934\u50cf\u5df2\u8bbe\u7f6e\uff0c\u91cd\u65b0\u8fdb\u5165\u9875\u9762\u540e\u751f\u6548"

    .line 343
    .line 344
    invoke-static {v0}, Lb1/h;->P(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    goto :goto_8

    .line 348
    :cond_f
    const-string v0, "\u672c\u5730\u5934\u50cf\u4fdd\u5b58\u5931\u8d25"

    .line 349
    .line 350
    invoke-static {v0}, Lb1/h;->P(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    :cond_10
    :goto_8
    move v2, v7

    .line 354
    :goto_9
    if-eqz v2, :cond_12

    .line 355
    .line 356
    iget-object v0, p0, Lm0/f;->b:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast v0, Lr0/q;

    .line 359
    .line 360
    iget-object v1, v0, Lr0/q;->a:Landroid/util/LruCache;

    .line 361
    .line 362
    invoke-virtual {v1}, Landroid/util/LruCache;->evictAll()V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    if-nez v1, :cond_11

    .line 370
    .line 371
    iget-object v1, p0, Lm0/f;->c:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v1, Landroid/content/Context;

    .line 374
    .line 375
    :cond_11
    invoke-virtual {v0, v1}, Lr0/q;->g(Landroid/content/Context;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {p1, v4}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    :cond_12
    :goto_a
    return-void

    .line 382
    nop

    .line 383
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
