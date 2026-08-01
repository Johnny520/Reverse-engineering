.class public final Lr0/M0;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/N0;


# direct methods
.method public synthetic constructor <init>(Lr0/N0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr0/M0;->a:I

    iput-object p1, p0, Lr0/M0;->b:Lr0/N0;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7

    .line 1
    const-string v0, "error new Instance, return null"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, Lr0/M0;->b:Lr0/N0;

    .line 6
    .line 7
    const-string v4, "param"

    .line 8
    .line 9
    iget v5, p0, Lr0/M0;->a:I

    .line 10
    .line 11
    invoke-static {p1, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    packed-switch v5, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v3, p1, v0}, Lr0/N0;->b(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const-string v0, "search hide"

    .line 28
    .line 29
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 41
    .line 42
    sget-object v1, Lc0/f;->b:Ld0/b;

    .line 43
    .line 44
    const-string v3, "f"

    .line 45
    .line 46
    invoke-interface {v1, v0, v3}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const-string v1, "getObjectField(...)"

    .line 51
    .line 52
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    check-cast v0, Landroid/util/SparseArray;

    .line 56
    .line 57
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_0
    return-void

    .line 65
    :pswitch_0
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    if-nez v4, :cond_1

    .line 73
    .line 74
    goto/16 :goto_5

    .line 75
    .line 76
    :cond_1
    sget-boolean v3, Lz0/i;->a:Z

    .line 77
    .line 78
    invoke-static {}, Lz0/g;->z()Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-nez v3, :cond_2

    .line 83
    .line 84
    goto/16 :goto_5

    .line 85
    .line 86
    :cond_2
    const/16 v3, 0x974

    .line 87
    .line 88
    :try_start_0
    filled-new-array {v3}, [I

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-static {v3}, Lz0/r;->s([I)Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_3

    .line 97
    .line 98
    const-string v3, "q1"

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_3
    const-string v3, "q"

    .line 102
    .line 103
    :goto_0
    sget-object v5, Lc0/f;->b:Ld0/b;

    .line 104
    .line 105
    invoke-interface {v5, v4, v3}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    check-cast v3, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :catchall_0
    move-object v3, v1

    .line 113
    :goto_1
    if-nez v3, :cond_8

    .line 114
    .line 115
    invoke-static {}, Lz0/r;->h()I

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    const/16 v6, 0x910

    .line 120
    .line 121
    if-gt v6, v5, :cond_4

    .line 122
    .line 123
    const/16 v6, 0x989

    .line 124
    .line 125
    if-gt v5, v6, :cond_4

    .line 126
    .line 127
    const/4 v5, 0x1

    .line 128
    goto :goto_2

    .line 129
    :cond_4
    move v5, v2

    .line 130
    :goto_2
    const-string v6, "e"

    .line 131
    .line 132
    if-eqz v5, :cond_6

    .line 133
    .line 134
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 135
    .line 136
    const-string v5, "p"

    .line 137
    .line 138
    invoke-interface {v3, v4, v5}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    if-nez v3, :cond_5

    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_5
    sget-object v4, Lc0/f;->b:Ld0/b;

    .line 146
    .line 147
    invoke-interface {v4, v3, v6}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    goto :goto_3

    .line 152
    :cond_6
    const/16 v5, 0x8fc

    .line 153
    .line 154
    filled-new-array {v5}, [I

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    invoke-static {v5}, Lz0/r;->s([I)Z

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    if-eqz v5, :cond_8

    .line 163
    .line 164
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 165
    .line 166
    const-string v5, "o"

    .line 167
    .line 168
    invoke-interface {v3, v4, v5}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    if-nez v3, :cond_7

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_7
    sget-object v4, Lc0/f;->b:Ld0/b;

    .line 176
    .line 177
    invoke-interface {v4, v3, v6}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    :cond_8
    :goto_3
    if-nez v3, :cond_9

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_9
    sget-boolean v4, Lz0/i;->a:Z

    .line 185
    .line 186
    move-object v4, v3

    .line 187
    check-cast v4, Ljava/lang/String;

    .line 188
    .line 189
    invoke-static {v4}, Lz0/g;->e(Ljava/lang/String;)Z

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    if-eqz v5, :cond_a

    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_a
    const-class v5, Lq0/h;

    .line 197
    .line 198
    invoke-static {v5}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    check-cast v5, Lq0/h;

    .line 203
    .line 204
    invoke-static {}, Lz0/g;->s()Z

    .line 205
    .line 206
    .line 207
    move-result v6

    .line 208
    if-nez v6, :cond_b

    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_b
    invoke-static {v4}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 212
    .line 213
    .line 214
    move-result v6

    .line 215
    if-eqz v6, :cond_c

    .line 216
    .line 217
    const-string v4, "chatUser is null or blank"

    .line 218
    .line 219
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    invoke-static {v4}, Li0/a;->d([Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    goto :goto_4

    .line 227
    :cond_c
    iget-object v2, v5, Lq0/h;->b:Ljava/util/LinkedHashSet;

    .line 228
    .line 229
    invoke-virtual {v2, v4}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    :goto_4
    if-eqz v2, :cond_d

    .line 234
    .line 235
    const-string v4, "need hide user from search result list after"

    .line 236
    .line 237
    filled-new-array {v4, v3}, [Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    invoke-static {v3}, Li0/a;->a([Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    :cond_d
    :goto_5
    if-eqz v2, :cond_f

    .line 245
    .line 246
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    invoke-static {v2}, Li0/a;->a([Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    :try_start_1
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    invoke-virtual {v2, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 273
    goto :goto_6

    .line 274
    :catchall_1
    move-exception v2

    .line 275
    new-instance v3, LE0/d;

    .line 276
    .line 277
    invoke-direct {v3, v2}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 278
    .line 279
    .line 280
    move-object v2, v3

    .line 281
    :goto_6
    invoke-static {v2}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    if-nez v3, :cond_e

    .line 286
    .line 287
    move-object v1, v2

    .line 288
    goto :goto_7

    .line 289
    :cond_e
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    :goto_7
    invoke-virtual {p1, v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    :cond_f
    return-void

    .line 300
    :pswitch_1
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    invoke-virtual {v3, p1, v2}, Lr0/N0;->b(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    if-eqz v2, :cond_10

    .line 309
    .line 310
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    invoke-static {v2}, Li0/a;->a([Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    :try_start_2
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    invoke-virtual {v2, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 337
    goto :goto_8

    .line 338
    :catchall_2
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    :goto_8
    invoke-virtual {p1, v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    :cond_10
    return-void

    .line 349
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
