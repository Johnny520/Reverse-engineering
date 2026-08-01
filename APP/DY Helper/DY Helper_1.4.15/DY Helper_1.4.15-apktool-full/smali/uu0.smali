.class public final synthetic Luu0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lz81;


# direct methods
.method public synthetic constructor <init>(Lz81;I)V
    .locals 0

    .line 1
    iput p2, p0, Luu0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Luu0;->ζ:Lz81;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final β()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object p0, p0, Luu0;->ζ:Lz81;

    .line 2
    .line 3
    sget-object v0, Lin0;->α:Landroid/os/Handler;

    .line 4
    .line 5
    :try_start_0
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 6
    .line 7
    const-string v0, "android.app.Dialog"

    .line 8
    .line 9
    iget-object v1, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 10
    .line 11
    const-string v2, "show"

    .line 12
    .line 13
    new-instance v3, Loj0;

    .line 14
    .line 15
    const/16 v4, 0xb

    .line 16
    .line 17
    invoke-direct {v3, v4}, Loj0;-><init>(I)V

    .line 18
    .line 19
    .line 20
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {v0, v1, v2, v3}, Lqe0;->ζ(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 25
    .line 26
    .line 27
    const-string v0, "DYHelper: \u5206\u4eab\u9762\u677f Hook \u5df2\u6302\u8f7d"

    .line 28
    .line 29
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "DYHelper: \u5206\u4eab\u9762\u677f Hook \u5931\u8d25: "

    .line 39
    .line 40
    invoke-static {v1, v0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object p0, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 46
    .line 47
    new-instance v0, Lhn0;

    .line 48
    .line 49
    invoke-direct {v0}, Lm01;-><init>()V

    .line 50
    .line 51
    .line 52
    const-class v1, Landroid/view/KeyEvent;

    .line 53
    .line 54
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-string v1, "android.app.Activity"

    .line 59
    .line 60
    const-string v2, "dispatchKeyEvent"

    .line 61
    .line 62
    invoke-static {v1, p0, v2, v0}, Lqe0;->ζ(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 63
    .line 64
    .line 65
    sget-object p0, Ls62;->α:Ls62;

    .line 66
    .line 67
    return-object p0
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Luu0;->ε:I

    .line 4
    .line 5
    const/16 v2, 0x17

    .line 6
    .line 7
    const/16 v3, 0x1b

    .line 8
    .line 9
    const/16 v4, 0x18

    .line 10
    .line 11
    const/16 v5, 0x19

    .line 12
    .line 13
    const/4 v6, 0x5

    .line 14
    const/16 v7, 0x14

    .line 15
    .line 16
    const/4 v8, 0x3

    .line 17
    const/4 v9, 0x0

    .line 18
    const/4 v10, 0x1

    .line 19
    const/4 v11, 0x4

    .line 20
    const/4 v12, 0x0

    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    iget-object v0, v0, Luu0;->ζ:Lz81;

    .line 25
    .line 26
    sget-object v1, Lf31;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 27
    .line 28
    const-string v1, "rd9c4a705fd7c41ec"

    .line 29
    .line 30
    :try_start_0
    sget-object v2, Lqe0;->α:Ljava/lang/Object;

    .line 31
    .line 32
    const-string v2, "okhttp3.internal.http.BridgeInterceptor"

    .line 33
    .line 34
    iget-object v3, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 35
    .line 36
    invoke-static {v3, v2}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-nez v2, :cond_0

    .line 41
    .line 42
    const-string v0, "\u88ab\u52a8Feed\u89c2\u5bdfHook\u672a\u5b89\u88c5 reason=\u5bbf\u4e3b\u7f3a\u5c11OkHttp BridgeInterceptor\uff1b\u4e3b\u52a8\u53d1\u73b0\u4ecd\u53ef\u8fd0\u884c"

    .line 43
    .line 44
    invoke-static {v1, v0, v9, v11, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const-string v3, "intercept"

    .line 51
    .line 52
    const-string v4, "okhttp3.Interceptor$Chain"

    .line 53
    .line 54
    iget-object v0, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 55
    .line 56
    invoke-static {v0, v4}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    new-instance v4, Loj0;

    .line 61
    .line 62
    invoke-direct {v4, v7}, Loj0;-><init>(I)V

    .line 63
    .line 64
    .line 65
    filled-new-array {v0, v4}, [Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {v2, v3, v0}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 70
    .line 71
    .line 72
    const-string v0, "\u88ab\u52a8Feed\u89c2\u5bdfHook\u5df2\u5b89\u88c5 target=okhttp3.internal.http.BridgeInterceptor\uff1b\u4e3b\u52a8\u53d1\u73b0\u4e0d\u4f9d\u8d56\u5f53\u524d\u9875\u9762\u6216\u6b64Hook"

    .line 73
    .line 74
    invoke-static {v1, v0, v9, v11, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :goto_0
    const-string v2, "\u88ab\u52a8Feed\u89c2\u5bdfHook\u5b89\u88c5\u5931\u8d25\uff1b\u4e3b\u52a8\u53d1\u73b0\u4ecd\u53ef\u8fd0\u884c"

    .line 79
    .line 80
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    :goto_1
    sget-object v0, Ls62;->α:Ls62;

    .line 84
    .line 85
    return-object v0

    .line 86
    :pswitch_0
    invoke-direct {v0}, Luu0;->β()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    return-object v0

    .line 91
    :pswitch_1
    iget-object v0, v0, Luu0;->ζ:Lz81;

    .line 92
    .line 93
    sget-object v1, Lxk0;->α:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 94
    .line 95
    const-string v1, "~788FC25F7FC5FF09DA0971AD3632DEDDCC2EBE576C96A2052C038D9EDEA8A00EADBEC36BDF70C6E2208BFAA886B7E665D5485848FB094D04F6B51339D7D834D75E424CDEC64B"

    .line 96
    .line 97
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    :try_start_1
    sget-object v2, Lqe0;->α:Ljava/lang/Object;

    .line 102
    .line 103
    iget-object v0, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 104
    .line 105
    invoke-static {v0, v1}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    sget-object v1, Lxq0;->α:Lxq0;

    .line 110
    .line 111
    new-instance v2, Loj0;

    .line 112
    .line 113
    invoke-direct {v2, v8}, Loj0;-><init>(I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, v0, v2}, Lxq0;->β(Ljava/lang/Class;Lm01;)Ljava/util/Set;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 117
    .line 118
    .line 119
    :try_start_2
    const-string v2, "onAttachedToWindow"

    .line 120
    .line 121
    new-instance v3, Loj0;

    .line 122
    .line 123
    invoke-direct {v3, v11}, Loj0;-><init>(I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, v0, v2, v3}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 127
    .line 128
    .line 129
    :catchall_1
    :try_start_3
    sget-object v1, Lxq0;->α:Lxq0;

    .line 130
    .line 131
    const-string v2, "onDetachedFromWindow"

    .line 132
    .line 133
    new-instance v3, Loj0;

    .line 134
    .line 135
    invoke-direct {v3, v6}, Loj0;-><init>(I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1, v0, v2, v3}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 139
    .line 140
    .line 141
    :catchall_2
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-static {v0}, Lh62;->л([Ljava/lang/Object;)Lτ;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    :catchall_3
    :cond_1
    :goto_2
    invoke-virtual {v0}, Lτ;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-eqz v1, :cond_2

    .line 154
    .line 155
    invoke-virtual {v0}, Lτ;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    check-cast v1, Ljava/lang/reflect/Method;

    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    array-length v3, v2

    .line 166
    if-ne v3, v10, :cond_1

    .line 167
    .line 168
    aget-object v2, v2, v12

    .line 169
    .line 170
    const-class v3, Landroid/graphics/Bitmap;

    .line 171
    .line 172
    invoke-static {v2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 176
    if-eqz v2, :cond_1

    .line 177
    .line 178
    :try_start_5
    sget-object v2, Lxq0;->α:Lxq0;

    .line 179
    .line 180
    new-instance v3, Loj0;

    .line 181
    .line 182
    const/4 v4, 0x6

    .line 183
    invoke-direct {v3, v4}, Loj0;-><init>(I)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2, v1, v3}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 187
    .line 188
    .line 189
    goto :goto_2

    .line 190
    :catchall_4
    move-exception v0

    .line 191
    const-string v1, "DYHelper:PhotoHook"

    .line 192
    .line 193
    new-instance v2, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    const-string v3, "install error: "

    .line 196
    .line 197
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-static {v1, v0, v9, v11, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    :cond_2
    sget-object v0, Ls62;->α:Ls62;

    .line 211
    .line 212
    return-object v0

    .line 213
    :pswitch_2
    iget-object v0, v0, Luu0;->ζ:Lz81;

    .line 214
    .line 215
    sget-object v1, Lqd0;->γ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 216
    .line 217
    iget-object v2, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 218
    .line 219
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    sget-object v1, Lbe0;->α:Lbe0;

    .line 223
    .line 224
    invoke-virtual {v1}, Lbe0;->δ()V

    .line 225
    .line 226
    .line 227
    sget-object v2, Lqd0;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 228
    .line 229
    invoke-virtual {v2, v12, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    if-nez v2, :cond_3

    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_3
    new-instance v2, Lo7;

    .line 237
    .line 238
    invoke-direct {v2, v5}, Lo7;-><init>(I)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1}, Lbe0;->ε()V

    .line 242
    .line 243
    .line 244
    sget-object v1, Lbe0;->γ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 245
    .line 246
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    :goto_3
    iget-object v0, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 250
    .line 251
    invoke-static {v0}, Lqd0;->α(Ljava/lang/ClassLoader;)Z

    .line 252
    .line 253
    .line 254
    :goto_4
    sget-object v0, Ls62;->α:Ls62;

    .line 255
    .line 256
    return-object v0

    .line 257
    :pswitch_3
    iget-object v0, v0, Luu0;->ζ:Lz81;

    .line 258
    .line 259
    sget-object v1, Lah0;->α:Landroid/os/Handler;

    .line 260
    .line 261
    sget-object v1, Lah0;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 262
    .line 263
    invoke-virtual {v1, v12, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    if-nez v1, :cond_4

    .line 268
    .line 269
    goto :goto_6

    .line 270
    :cond_4
    iget-object v1, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 271
    .line 272
    sput-object v1, Lah0;->ξ:Ljava/lang/ClassLoader;

    .line 273
    .line 274
    :try_start_6
    sget-object v1, Lqe0;->α:Ljava/lang/Object;

    .line 275
    .line 276
    const-string v1, "~7918AA8396C85B92707DC4C904CF4F6B873956D476D564A4B4FA8249966EA0F63C4AD8"

    .line 277
    .line 278
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    iget-object v0, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 283
    .line 284
    invoke-static {v0, v1}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 288
    goto :goto_5

    .line 289
    :catchall_5
    move-exception v0

    .line 290
    new-instance v1, Leo1;

    .line 291
    .line 292
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 293
    .line 294
    .line 295
    move-object v0, v1

    .line 296
    :goto_5
    instance-of v1, v0, Leo1;

    .line 297
    .line 298
    if-eqz v1, :cond_5

    .line 299
    .line 300
    move-object v0, v9

    .line 301
    :cond_5
    check-cast v0, Ljava/lang/Class;

    .line 302
    .line 303
    sput-object v0, Lah0;->π:Ljava/lang/Class;

    .line 304
    .line 305
    sget-object v0, Lah0;->ζ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 306
    .line 307
    invoke-virtual {v0, v12, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    if-eqz v0, :cond_6

    .line 312
    .line 313
    sget-object v0, Lui1;->α:Ljava/lang/Object;

    .line 314
    .line 315
    sget-object v0, Lah0;->Γ:Lzb0;

    .line 316
    .line 317
    invoke-static {v0}, Lui1;->β(La80;)V

    .line 318
    .line 319
    .line 320
    :cond_6
    sget-object v0, Lah0;->η:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 321
    .line 322
    invoke-virtual {v0, v12, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 323
    .line 324
    .line 325
    move-result v0

    .line 326
    if-eqz v0, :cond_7

    .line 327
    .line 328
    sget-object v0, Lui1;->α:Ljava/lang/Object;

    .line 329
    .line 330
    sget-object v0, Lah0;->Ε:Lzb0;

    .line 331
    .line 332
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    sget-object v1, Lui1;->ι:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 336
    .line 337
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    :cond_7
    sget-object v0, Lah0;->θ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 341
    .line 342
    invoke-virtual {v0, v12, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    if-eqz v0, :cond_8

    .line 347
    .line 348
    sget-object v0, Lsg0;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 349
    .line 350
    sget-object v0, Lah0;->Δ:Lzb0;

    .line 351
    .line 352
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    sget-object v1, Lsg0;->ε:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 356
    .line 357
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->addIfAbsent(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    :cond_8
    const-string v0, "init"

    .line 361
    .line 362
    invoke-static {v0}, Lah0;->г(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    const-string v0, "IMBubbleTimeHook init done"

    .line 366
    .line 367
    const-string v1, "r746360516c14870"

    .line 368
    .line 369
    invoke-static {v1, v0, v9, v11, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    :goto_6
    sget-object v0, Ls62;->α:Ls62;

    .line 373
    .line 374
    return-object v0

    .line 375
    :pswitch_4
    iget-object v0, v0, Luu0;->ζ:Lz81;

    .line 376
    .line 377
    sget-object v1, Lx10;->α:Lx10;

    .line 378
    .line 379
    iget-object v0, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 380
    .line 381
    invoke-virtual {v1, v0}, Lx10;->λ(Ljava/lang/ClassLoader;)V

    .line 382
    .line 383
    .line 384
    goto/16 :goto_4

    .line 385
    .line 386
    :pswitch_5
    iget-object v0, v0, Luu0;->ζ:Lz81;

    .line 387
    .line 388
    :try_start_7
    sget-object v1, Ldk1;->α:Ldk1;

    .line 389
    .line 390
    iget-object v0, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 391
    .line 392
    invoke-virtual {v1, v0}, Ldk1;->κ(Ljava/lang/ClassLoader;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 393
    .line 394
    .line 395
    goto :goto_7

    .line 396
    :catchall_6
    move-exception v0

    .line 397
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    const-string v1, "DYHelper: PublishGestureLauncher Hook \u5931\u8d25: "

    .line 402
    .line 403
    invoke-static {v1, v0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    :goto_7
    sget-object v0, Ls62;->α:Ls62;

    .line 407
    .line 408
    return-object v0

    .line 409
    :pswitch_6
    iget-object v1, v0, Luu0;->ζ:Lz81;

    .line 410
    .line 411
    sget-object v0, Lb10;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 412
    .line 413
    const-string v6, "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22A325AEF903414FAFE45A7E3E2147D4EB64C679F2AFDEF96783477651D7DF068CED"

    .line 414
    .line 415
    :try_start_8
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 416
    .line 417
    const-string v0, "~79504AF3C39B11021DAC8210F33C72EF521D7099C0A60F0CD8077C8DA07EAE738B0C72B2FBAD5996C21838D778B6E6AD93"

    .line 418
    .line 419
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    iget-object v7, v1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 424
    .line 425
    invoke-static {v7, v0}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    new-instance v7, Ljava/util/ArrayList;

    .line 437
    .line 438
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 439
    .line 440
    .line 441
    array-length v8, v0

    .line 442
    move v9, v12

    .line 443
    :goto_8
    if-ge v9, v8, :cond_a

    .line 444
    .line 445
    aget-object v11, v0, v9

    .line 446
    .line 447
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 448
    .line 449
    .line 450
    move-result v13

    .line 451
    invoke-static {v13}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 452
    .line 453
    .line 454
    move-result v13

    .line 455
    if-nez v13, :cond_9

    .line 456
    .line 457
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 458
    .line 459
    .line 460
    move-result-object v13

    .line 461
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    array-length v13, v13

    .line 465
    if-nez v13, :cond_9

    .line 466
    .line 467
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    move-result-object v13

    .line 471
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v13

    .line 475
    const-string v14, "Aweme"

    .line 476
    .line 477
    invoke-static {v13, v14, v12}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 478
    .line 479
    .line 480
    move-result v13

    .line 481
    if-eqz v13, :cond_9

    .line 482
    .line 483
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    goto :goto_9

    .line 487
    :catchall_7
    move-exception v0

    .line 488
    goto :goto_b

    .line 489
    :cond_9
    :goto_9
    add-int/lit8 v9, v9, 0x1

    .line 490
    .line 491
    goto :goto_8

    .line 492
    :cond_a
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    move v7, v12

    .line 497
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 498
    .line 499
    .line 500
    move-result v8

    .line 501
    if-eqz v8, :cond_b

    .line 502
    .line 503
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v8

    .line 507
    check-cast v8, Ljava/lang/reflect/Method;

    .line 508
    .line 509
    invoke-virtual {v8, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 510
    .line 511
    .line 512
    sget-object v9, Lxq0;->α:Lxq0;

    .line 513
    .line 514
    new-instance v11, Lxl;

    .line 515
    .line 516
    const/16 v13, 0x16

    .line 517
    .line 518
    invoke-direct {v11, v13, v12}, Lxl;-><init>(IB)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v9, v8, v11}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 522
    .line 523
    .line 524
    add-int/lit8 v7, v7, 0x1

    .line 525
    .line 526
    goto :goto_a

    .line 527
    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    .line 528
    .line 529
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 530
    .line 531
    .line 532
    const-string v8, "DYHelper: DetailActivity Aweme getter Hook \u6210\u529f ("

    .line 533
    .line 534
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 538
    .line 539
    .line 540
    const-string v7, " \u4e2a\u65b9\u6cd5)"

    .line 541
    .line 542
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 550
    .line 551
    .line 552
    goto :goto_c

    .line 553
    :goto_b
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    const-string v7, "DYHelper: DetailActivity Hook \u5931\u8d25: "

    .line 558
    .line 559
    invoke-static {v7, v0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 560
    .line 561
    .line 562
    :goto_c
    sget-object v0, Lx00;->α:Lx00;

    .line 563
    .line 564
    iget-object v7, v1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 565
    .line 566
    invoke-virtual {v0, v7}, Lx00;->δ(Ljava/lang/ClassLoader;)V

    .line 567
    .line 568
    .line 569
    invoke-static {v6}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    :try_start_9
    sget-object v7, Lqe0;->α:Ljava/lang/Object;

    .line 574
    .line 575
    iget-object v7, v1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 576
    .line 577
    invoke-static {v7, v0}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 578
    .line 579
    .line 580
    move-result-object v7

    .line 581
    const-string v8, "setUserVisibleHint"

    .line 582
    .line 583
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 584
    .line 585
    new-instance v10, Lxl;

    .line 586
    .line 587
    invoke-direct {v10, v4, v12}, Lxl;-><init>(IB)V

    .line 588
    .line 589
    .line 590
    filled-new-array {v9, v10}, [Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v4

    .line 594
    invoke-static {v7, v8, v4}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 595
    .line 596
    .line 597
    :catchall_8
    :try_start_a
    sget-object v4, Lqe0;->α:Ljava/lang/Object;

    .line 598
    .line 599
    iget-object v4, v1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 600
    .line 601
    invoke-static {v4, v0}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 602
    .line 603
    .line 604
    move-result-object v4

    .line 605
    const-string v7, "onResume"

    .line 606
    .line 607
    new-instance v8, Lxl;

    .line 608
    .line 609
    invoke-direct {v8, v5, v12}, Lxl;-><init>(IB)V

    .line 610
    .line 611
    .line 612
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v5

    .line 616
    invoke-static {v4, v7, v5}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 617
    .line 618
    .line 619
    const-string v5, "onPause"

    .line 620
    .line 621
    new-instance v7, Lxl;

    .line 622
    .line 623
    const/16 v8, 0x1a

    .line 624
    .line 625
    invoke-direct {v7, v8, v12}, Lxl;-><init>(IB)V

    .line 626
    .line 627
    .line 628
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v7

    .line 632
    invoke-static {v4, v5, v7}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 633
    .line 634
    .line 635
    const-string v5, "onDestroyView"

    .line 636
    .line 637
    new-instance v7, Lxl;

    .line 638
    .line 639
    invoke-direct {v7, v3, v12}, Lxl;-><init>(IB)V

    .line 640
    .line 641
    .line 642
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v3

    .line 646
    invoke-static {v4, v5, v3}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    .line 647
    .line 648
    .line 649
    :catchall_9
    :try_start_b
    sget-object v3, Lqe0;->α:Ljava/lang/Object;

    .line 650
    .line 651
    iget-object v3, v1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 652
    .line 653
    invoke-static {v3, v0}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    const-string v3, "clearData"

    .line 658
    .line 659
    new-instance v4, Lxl;

    .line 660
    .line 661
    const/16 v5, 0x1c

    .line 662
    .line 663
    invoke-direct {v4, v5, v12}, Lxl;-><init>(IB)V

    .line 664
    .line 665
    .line 666
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object v4

    .line 670
    invoke-static {v0, v3, v4}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_a

    .line 671
    .line 672
    .line 673
    :catchall_a
    :try_start_c
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 674
    .line 675
    invoke-static {v6}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    iget-object v3, v1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 680
    .line 681
    invoke-static {v3, v0}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    const-string v3, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"

    .line 686
    .line 687
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object v3

    .line 691
    iget-object v1, v1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 692
    .line 693
    invoke-static {v1, v3}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 694
    .line 695
    .line 696
    move-result-object v1

    .line 697
    const-string v3, "onAwemeChange"

    .line 698
    .line 699
    new-instance v4, Lxl;

    .line 700
    .line 701
    invoke-direct {v4, v2, v12}, Lxl;-><init>(IB)V

    .line 702
    .line 703
    .line 704
    filled-new-array {v1, v4}, [Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    move-result-object v1

    .line 708
    invoke-static {v0, v3, v1}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_b

    .line 709
    .line 710
    .line 711
    :catchall_b
    const-string v0, "DYHelper: FeedDataHook \u521d\u59cb\u5316\u5b8c\u6210"

    .line 712
    .line 713
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 714
    .line 715
    .line 716
    goto/16 :goto_4

    .line 717
    .line 718
    :pswitch_7
    iget-object v0, v0, Luu0;->ζ:Lz81;

    .line 719
    .line 720
    sget-object v1, Ldm;->α:Ldm;

    .line 721
    .line 722
    iget-object v2, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 723
    .line 724
    const-string v3, "rd44bdb4944a23356"

    .line 725
    .line 726
    sget-object v4, Ls62;->α:Ls62;

    .line 727
    .line 728
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 729
    .line 730
    .line 731
    sget-object v5, Ldm;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 732
    .line 733
    invoke-virtual {v5, v12, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 734
    .line 735
    .line 736
    move-result v0

    .line 737
    if-nez v0, :cond_c

    .line 738
    .line 739
    goto :goto_e

    .line 740
    :cond_c
    :try_start_d
    sget-object v0, Lui1;->α:Ljava/lang/Object;

    .line 741
    .line 742
    sget-object v0, Ldm;->ε:Lul;

    .line 743
    .line 744
    invoke-static {v0}, Lui1;->β(La80;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_c

    .line 745
    .line 746
    .line 747
    move-object v6, v4

    .line 748
    goto :goto_d

    .line 749
    :catchall_c
    move-exception v0

    .line 750
    new-instance v6, Leo1;

    .line 751
    .line 752
    invoke-direct {v6, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 753
    .line 754
    .line 755
    :goto_d
    invoke-static {v6}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 756
    .line 757
    .line 758
    move-result-object v0

    .line 759
    if-eqz v0, :cond_d

    .line 760
    .line 761
    invoke-virtual {v5, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 762
    .line 763
    .line 764
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 765
    .line 766
    .line 767
    move-result-object v0

    .line 768
    const-string v5, "config listener registration skipped: "

    .line 769
    .line 770
    invoke-static {v5, v0, v3}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 771
    .line 772
    .line 773
    :cond_d
    :goto_e
    sget-object v0, Ldm;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 774
    .line 775
    invoke-virtual {v0, v12, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 776
    .line 777
    .line 778
    move-result v0

    .line 779
    if-nez v0, :cond_e

    .line 780
    .line 781
    goto/16 :goto_13

    .line 782
    .line 783
    :cond_e
    :try_start_e
    invoke-static {v2}, Ldm;->γ(Ljava/lang/ClassLoader;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_d

    .line 784
    .line 785
    .line 786
    move-object v5, v4

    .line 787
    goto :goto_f

    .line 788
    :catchall_d
    move-exception v0

    .line 789
    new-instance v5, Leo1;

    .line 790
    .line 791
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 792
    .line 793
    .line 794
    :goto_f
    invoke-static {v5}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 795
    .line 796
    .line 797
    move-result-object v0

    .line 798
    if-eqz v0, :cond_f

    .line 799
    .line 800
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 801
    .line 802
    .line 803
    move-result-object v0

    .line 804
    const-string v5, "legacy_comment hook install failed: "

    .line 805
    .line 806
    invoke-static {v5, v0, v3}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 807
    .line 808
    .line 809
    :cond_f
    :try_start_f
    invoke-static {v2}, Ldm;->β(Ljava/lang/ClassLoader;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_e

    .line 810
    .line 811
    .line 812
    move-object v5, v4

    .line 813
    goto :goto_10

    .line 814
    :catchall_e
    move-exception v0

    .line 815
    new-instance v5, Leo1;

    .line 816
    .line 817
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 818
    .line 819
    .line 820
    :goto_10
    invoke-static {v5}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 821
    .line 822
    .line 823
    move-result-object v0

    .line 824
    if-eqz v0, :cond_10

    .line 825
    .line 826
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    const-string v5, "comment_input hook install failed: "

    .line 831
    .line 832
    invoke-static {v5, v0, v3}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 833
    .line 834
    .line 835
    :cond_10
    :try_start_10
    invoke-static {v2}, Ldm;->δ(Ljava/lang/ClassLoader;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_f

    .line 836
    .line 837
    .line 838
    move-object v2, v4

    .line 839
    goto :goto_11

    .line 840
    :catchall_f
    move-exception v0

    .line 841
    new-instance v2, Leo1;

    .line 842
    .line 843
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 844
    .line 845
    .line 846
    :goto_11
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 847
    .line 848
    .line 849
    move-result-object v0

    .line 850
    if-eqz v0, :cond_11

    .line 851
    .line 852
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 853
    .line 854
    .line 855
    move-result-object v0

    .line 856
    const-string v2, "related_search hook install failed: "

    .line 857
    .line 858
    invoke-static {v2, v0, v3}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 859
    .line 860
    .line 861
    :cond_11
    :try_start_11
    const-class v0, Landroid/view/View;

    .line 862
    .line 863
    const-string v2, "setVisibility"

    .line 864
    .line 865
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 866
    .line 867
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 868
    .line 869
    .line 870
    move-result-object v5

    .line 871
    invoke-virtual {v0, v2, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 872
    .line 873
    .line 874
    move-result-object v0

    .line 875
    invoke-virtual {v0, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 876
    .line 877
    .line 878
    new-instance v2, Lxl;

    .line 879
    .line 880
    invoke-direct {v2, v11, v12}, Lxl;-><init>(IB)V

    .line 881
    .line 882
    .line 883
    invoke-virtual {v1, v0, v2}, Ldm;->α(Ljava/lang/reflect/Method;Lm01;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_10

    .line 884
    .line 885
    .line 886
    move-object v1, v4

    .line 887
    goto :goto_12

    .line 888
    :catchall_10
    move-exception v0

    .line 889
    new-instance v1, Leo1;

    .line 890
    .line 891
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 892
    .line 893
    .line 894
    :goto_12
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 895
    .line 896
    .line 897
    move-result-object v0

    .line 898
    if-eqz v0, :cond_12

    .line 899
    .line 900
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 901
    .line 902
    .line 903
    move-result-object v0

    .line 904
    const-string v1, "visibility_guard hook install failed: "

    .line 905
    .line 906
    invoke-static {v1, v0, v3}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 907
    .line 908
    .line 909
    :cond_12
    :goto_13
    return-object v4

    .line 910
    :pswitch_8
    iget-object v0, v0, Luu0;->ζ:Lz81;

    .line 911
    .line 912
    sget-object v1, Ljm;->α:Ljm;

    .line 913
    .line 914
    iget-object v0, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 915
    .line 916
    invoke-virtual {v1, v0}, Ljm;->ε(Ljava/lang/ClassLoader;)V

    .line 917
    .line 918
    .line 919
    goto/16 :goto_4

    .line 920
    .line 921
    :pswitch_9
    iget-object v0, v0, Luu0;->ζ:Lz81;

    .line 922
    .line 923
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;

    .line 924
    .line 925
    iget-object v0, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 926
    .line 927
    invoke-virtual {v1, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->init(Ljava/lang/ClassLoader;)V

    .line 928
    .line 929
    .line 930
    goto/16 :goto_4

    .line 931
    .line 932
    :pswitch_a
    iget-object v0, v0, Luu0;->ζ:Lz81;

    .line 933
    .line 934
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;

    .line 935
    .line 936
    iget-object v0, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 937
    .line 938
    invoke-virtual {v1, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->init(Ljava/lang/ClassLoader;)V

    .line 939
    .line 940
    .line 941
    goto/16 :goto_4

    .line 942
    .line 943
    :pswitch_b
    const-string v1, "onDestroy"

    .line 944
    .line 945
    iget-object v0, v0, Luu0;->ζ:Lz81;

    .line 946
    .line 947
    sget-object v2, Ld00;->α:Ljava/util/concurrent/atomic/AtomicLong;

    .line 948
    .line 949
    iget-object v2, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 950
    .line 951
    const-string v3, "re42d48bb5ac13a6f"

    .line 952
    .line 953
    const/16 v4, 0x13

    .line 954
    .line 955
    const/16 v5, 0x12

    .line 956
    .line 957
    :try_start_12
    const-string v0, "X.C1637270shU"

    .line 958
    .line 959
    invoke-static {v2, v0}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 960
    .line 961
    .line 962
    move-result-object v0

    .line 963
    sget-object v6, Lxq0;->α:Lxq0;

    .line 964
    .line 965
    new-instance v8, Lxl;

    .line 966
    .line 967
    invoke-direct {v8, v5, v12}, Lxl;-><init>(IB)V

    .line 968
    .line 969
    .line 970
    invoke-virtual {v6, v0, v8}, Lxq0;->β(Ljava/lang/Class;Lm01;)Ljava/util/Set;

    .line 971
    .line 972
    .line 973
    new-instance v8, Lxl;

    .line 974
    .line 975
    invoke-direct {v8, v4, v12}, Lxl;-><init>(IB)V

    .line 976
    .line 977
    .line 978
    invoke-virtual {v6, v0, v1, v8}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 979
    .line 980
    .line 981
    const-string v8, "onRewardComplete"

    .line 982
    .line 983
    new-instance v13, Lxl;

    .line 984
    .line 985
    const/16 v14, 0x10

    .line 986
    .line 987
    invoke-direct {v13, v14, v12}, Lxl;-><init>(IB)V

    .line 988
    .line 989
    .line 990
    invoke-virtual {v6, v0, v8, v13}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 991
    .line 992
    .line 993
    const-string v0, "\u5c0f\u6e38\u620f\u5956\u52b1\u5b8c\u6210\u76d1\u542c\u5668 Hook \u5df2\u5b89\u88c5"

    .line 994
    .line 995
    invoke-static {v3, v0, v9, v11, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_11

    .line 996
    .line 997
    .line 998
    goto :goto_14

    .line 999
    :catchall_11
    move-exception v0

    .line 1000
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v0

    .line 1004
    const-string v6, "\u5c0f\u6e38\u620f\u5956\u52b1\u5b8c\u6210\u76d1\u542c\u5668 Hook \u8df3\u8fc7: "

    .line 1005
    .line 1006
    invoke-static {v6, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v0

    .line 1010
    invoke-static {v3, v0, v9, v11, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1011
    .line 1012
    .line 1013
    :goto_14
    :try_start_13
    const-string v0, "X.C1637260shT"

    .line 1014
    .line 1015
    invoke-static {v2, v0}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v0

    .line 1019
    sget-object v6, Lxq0;->α:Lxq0;

    .line 1020
    .line 1021
    new-instance v8, Lxl;

    .line 1022
    .line 1023
    invoke-direct {v8, v5, v12}, Lxl;-><init>(IB)V

    .line 1024
    .line 1025
    .line 1026
    invoke-virtual {v6, v0, v8}, Lxq0;->β(Ljava/lang/Class;Lm01;)Ljava/util/Set;

    .line 1027
    .line 1028
    .line 1029
    new-instance v5, Lxl;

    .line 1030
    .line 1031
    invoke-direct {v5, v4, v12}, Lxl;-><init>(IB)V

    .line 1032
    .line 1033
    .line 1034
    invoke-virtual {v6, v0, v1, v5}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 1035
    .line 1036
    .line 1037
    const-string v1, "onComplete"

    .line 1038
    .line 1039
    new-instance v4, Lxl;

    .line 1040
    .line 1041
    const/16 v5, 0x11

    .line 1042
    .line 1043
    invoke-direct {v4, v5, v12}, Lxl;-><init>(IB)V

    .line 1044
    .line 1045
    .line 1046
    invoke-virtual {v6, v0, v1, v4}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 1047
    .line 1048
    .line 1049
    const-string v0, "\u5c0f\u6e38\u620f\u65e7\u7248\u5b8c\u6210\u76d1\u542c\u5668 Hook \u5df2\u5b89\u88c5"

    .line 1050
    .line 1051
    invoke-static {v3, v0, v9, v11, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_12

    .line 1052
    .line 1053
    .line 1054
    goto :goto_15

    .line 1055
    :catchall_12
    move-exception v0

    .line 1056
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v0

    .line 1060
    const-string v1, "\u5c0f\u6e38\u620f\u65e7\u7248\u5b8c\u6210\u76d1\u542c\u5668 Hook \u8df3\u8fc7: "

    .line 1061
    .line 1062
    invoke-static {v1, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v0

    .line 1066
    invoke-static {v3, v0, v9, v11, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1067
    .line 1068
    .line 1069
    :goto_15
    :try_start_14
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 1070
    .line 1071
    const-string v0, "~794CAD4569E61E2D43B867359EB6122EF7F844E9C027EFD88B85240CAB1A95A81DF53B61150DE5FE45A19399E9DE27B8888D9234D3C8"

    .line 1072
    .line 1073
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v0

    .line 1077
    invoke-static {v2, v0}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v0

    .line 1081
    const-string v1, "createAdFragment"

    .line 1082
    .line 1083
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 1084
    .line 1085
    new-instance v5, Lbm;

    .line 1086
    .line 1087
    invoke-direct {v5, v10, v2, v12}, Lbm;-><init>(ILjava/lang/ClassLoader;Z)V

    .line 1088
    .line 1089
    .line 1090
    filled-new-array {v4, v5}, [Ljava/lang/Object;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v5

    .line 1094
    invoke-static {v0, v1, v5}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 1095
    .line 1096
    .line 1097
    const-string v1, "closeFragment"

    .line 1098
    .line 1099
    new-instance v5, Lxl;

    .line 1100
    .line 1101
    const/16 v6, 0x15

    .line 1102
    .line 1103
    invoke-direct {v5, v6, v12}, Lxl;-><init>(IB)V

    .line 1104
    .line 1105
    .line 1106
    filled-new-array {v4, v5}, [Ljava/lang/Object;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v4

    .line 1110
    invoke-static {v0, v1, v4}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_13

    .line 1111
    .line 1112
    .line 1113
    goto :goto_16

    .line 1114
    :catchall_13
    move-exception v0

    .line 1115
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v0

    .line 1119
    const-string v1, "\u5e7f\u544a Fragment Hook \u8df3\u8fc7: "

    .line 1120
    .line 1121
    invoke-static {v1, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v0

    .line 1125
    invoke-static {v3, v0, v9, v11, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1126
    .line 1127
    .line 1128
    :goto_16
    :try_start_15
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 1129
    .line 1130
    const-string v0, "~7974716F46EDCCC8AB71015994E08EAF6F57A39C325AF83C11F53535E6EDA0CAE66A416BC7680B3F9BE51C86F18C7CC82D7B22D11F2F65A2"

    .line 1131
    .line 1132
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v0

    .line 1136
    invoke-static {v2, v0}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v0

    .line 1140
    const-string v1, "~78B71E7541C477E838C50BCD302E055C5FCC453194ABB3E0BA7A9CE6CD5B94761317EE2E3E582161C3DF53EB8BE682077884EC8F7FCF3C296776231D0C6100ECD75E1B7F5B5FBC4D"

    .line 1141
    .line 1142
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v1

    .line 1146
    invoke-static {v2, v1}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v1

    .line 1150
    const-string v4, "~7918AA8387C201967A78D8C508850867CD7455DF7D8327AAA0F6C02E8B79BCE8345ED8"

    .line 1151
    .line 1152
    invoke-static {v4}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v4

    .line 1156
    invoke-static {v2, v4}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v2

    .line 1160
    const-string v4, "LJIIIIZZ"

    .line 1161
    .line 1162
    new-instance v5, Lxl;

    .line 1163
    .line 1164
    invoke-direct {v5, v7, v12}, Lxl;-><init>(IB)V

    .line 1165
    .line 1166
    .line 1167
    filled-new-array {v2, v1, v5}, [Ljava/lang/Object;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v1

    .line 1171
    invoke-static {v0, v4, v1}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_14

    .line 1172
    .line 1173
    .line 1174
    goto :goto_17

    .line 1175
    :catchall_14
    move-exception v0

    .line 1176
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v0

    .line 1180
    const-string v1, "\u4e0b\u4e00\u9636\u6bb5\u5956\u52b1 Hook \u8df3\u8fc7: "

    .line 1181
    .line 1182
    invoke-static {v1, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v0

    .line 1186
    invoke-static {v3, v0, v9, v11, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1187
    .line 1188
    .line 1189
    :goto_17
    sget-object v0, Ls62;->α:Ls62;

    .line 1190
    .line 1191
    return-object v0

    .line 1192
    :pswitch_c
    iget-object v0, v0, Luu0;->ζ:Lz81;

    .line 1193
    .line 1194
    sget-object v1, Lyl;->α:Lyl;

    .line 1195
    .line 1196
    iget-object v0, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1197
    .line 1198
    invoke-virtual {v1, v0}, Lyl;->ε(Ljava/lang/ClassLoader;)V

    .line 1199
    .line 1200
    .line 1201
    goto/16 :goto_4

    .line 1202
    .line 1203
    :pswitch_d
    iget-object v1, v0, Luu0;->ζ:Lz81;

    .line 1204
    .line 1205
    sget-object v15, Lnh0;->α:Lnh0;

    .line 1206
    .line 1207
    const-string v2, "rfae3094b732ade5a"

    .line 1208
    .line 1209
    :try_start_16
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 1210
    .line 1211
    const-string v0, "android.app.Application"

    .line 1212
    .line 1213
    iget-object v4, v1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1214
    .line 1215
    const-string v5, "attach"

    .line 1216
    .line 1217
    const-class v6, Landroid/content/Context;

    .line 1218
    .line 1219
    new-instance v7, Lf10;

    .line 1220
    .line 1221
    invoke-direct {v7, v3}, Lf10;-><init>(I)V

    .line 1222
    .line 1223
    .line 1224
    filled-new-array {v6, v7}, [Ljava/lang/Object;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v3

    .line 1228
    invoke-static {v0, v4, v5, v3}, Lqe0;->ζ(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Ll01;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_15

    .line 1229
    .line 1230
    .line 1231
    goto :goto_18

    .line 1232
    :catchall_15
    move-exception v0

    .line 1233
    const-string v3, "hook Application.attach failed"

    .line 1234
    .line 1235
    invoke-static {v2, v3, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1236
    .line 1237
    .line 1238
    :goto_18
    :try_start_17
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 1239
    .line 1240
    const-string v0, "~78A3D0A0088990942E83A71740186617157A6B7152A0CBE49DB7CBA692C85364D35CF1CB5BAAD0AE5EA1175C178FD03C3438216CB35D56B6D5EEA497B8DE2C911081F62918430B84FB04E63060"

    .line 1241
    .line 1242
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v0

    .line 1246
    iget-object v1, v1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1247
    .line 1248
    invoke-static {v1, v0}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v0

    .line 1252
    const-string v1, "onResume"

    .line 1253
    .line 1254
    new-instance v13, Lng;

    .line 1255
    .line 1256
    const-class v16, Lnh0;

    .line 1257
    .line 1258
    const-string v17, "captureLogic"

    .line 1259
    .line 1260
    const-string v18, "captureLogic(Ljava/lang/Object;)V"

    .line 1261
    .line 1262
    const/16 v19, 0x0

    .line 1263
    .line 1264
    const/16 v20, 0xf

    .line 1265
    .line 1266
    const/4 v14, 0x1

    .line 1267
    invoke-direct/range {v13 .. v20}, Lng;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 1268
    .line 1269
    .line 1270
    invoke-static {v0, v1, v13}, Lnh0;->π(Ljava/lang/Class;Ljava/lang/String;La80;)V

    .line 1271
    .line 1272
    .line 1273
    const-string v1, "onPause"

    .line 1274
    .line 1275
    new-instance v13, Lng;

    .line 1276
    .line 1277
    const-class v16, Lnh0;

    .line 1278
    .line 1279
    const-string v17, "releaseLogic"

    .line 1280
    .line 1281
    const-string v18, "releaseLogic(Ljava/lang/Object;)V"

    .line 1282
    .line 1283
    const/16 v19, 0x0

    .line 1284
    .line 1285
    const/16 v20, 0x10

    .line 1286
    .line 1287
    const/4 v14, 0x1

    .line 1288
    invoke-direct/range {v13 .. v20}, Lng;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 1289
    .line 1290
    .line 1291
    invoke-static {v0, v1, v13}, Lnh0;->π(Ljava/lang/Class;Ljava/lang/String;La80;)V

    .line 1292
    .line 1293
    .line 1294
    const-string v1, "onDestroy"

    .line 1295
    .line 1296
    new-instance v13, Lng;

    .line 1297
    .line 1298
    const-class v16, Lnh0;

    .line 1299
    .line 1300
    const-string v17, "releaseLogic"

    .line 1301
    .line 1302
    const-string v18, "releaseLogic(Ljava/lang/Object;)V"

    .line 1303
    .line 1304
    const/16 v19, 0x0

    .line 1305
    .line 1306
    const/16 v20, 0x11

    .line 1307
    .line 1308
    const/4 v14, 0x1

    .line 1309
    invoke-direct/range {v13 .. v20}, Lng;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 1310
    .line 1311
    .line 1312
    invoke-static {v0, v1, v13}, Lnh0;->π(Ljava/lang/Class;Ljava/lang/String;La80;)V

    .line 1313
    .line 1314
    .line 1315
    const-string v0, ""

    .line 1316
    .line 1317
    sput-object v0, Lnh0;->η:Ljava/lang/String;

    .line 1318
    .line 1319
    sput-boolean v10, Lnh0;->θ:Z

    .line 1320
    .line 1321
    const-string v0, "hook ChatListLogic ok"

    .line 1322
    .line 1323
    invoke-static {v2, v0, v9, v11, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_16

    .line 1324
    .line 1325
    .line 1326
    goto :goto_19

    .line 1327
    :catchall_16
    move-exception v0

    .line 1328
    sput-boolean v12, Lnh0;->θ:Z

    .line 1329
    .line 1330
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1331
    .line 1332
    .line 1333
    move-result-object v1

    .line 1334
    if-nez v1, :cond_13

    .line 1335
    .line 1336
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v1

    .line 1340
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v1

    .line 1344
    :cond_13
    sput-object v1, Lnh0;->η:Ljava/lang/String;

    .line 1345
    .line 1346
    const-string v1, "hook ChatListLogic failed"

    .line 1347
    .line 1348
    invoke-static {v2, v1, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1349
    .line 1350
    .line 1351
    :goto_19
    const-string v0, "init ok"

    .line 1352
    .line 1353
    invoke-static {v2, v0, v9, v11, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1354
    .line 1355
    .line 1356
    goto/16 :goto_4

    .line 1357
    .line 1358
    :pswitch_e
    iget-object v0, v0, Luu0;->ζ:Lz81;

    .line 1359
    .line 1360
    sget-object v1, Lht0;->α:Lht0;

    .line 1361
    .line 1362
    invoke-virtual {v1, v0}, Lht0;->γ(Lz81;)V

    .line 1363
    .line 1364
    .line 1365
    goto/16 :goto_4

    .line 1366
    .line 1367
    :pswitch_f
    iget-object v0, v0, Luu0;->ζ:Lz81;

    .line 1368
    .line 1369
    sget-object v1, Lo22;->α:Lo22;

    .line 1370
    .line 1371
    const-string v2, "r8e831fa4c336abdd"

    .line 1372
    .line 1373
    invoke-static {v2}, Lux;->ρ(Ljava/lang/String;)V

    .line 1374
    .line 1375
    .line 1376
    sput-object v0, Lo22;->Ζ:Lz81;

    .line 1377
    .line 1378
    invoke-static {v10}, Lo22;->ω(Z)Ljava/util/Set;

    .line 1379
    .line 1380
    .line 1381
    sget-boolean v0, Lo22;->Ε:Z

    .line 1382
    .line 1383
    if-nez v0, :cond_16

    .line 1384
    .line 1385
    invoke-static {}, Lui1;->Α()Z

    .line 1386
    .line 1387
    .line 1388
    move-result v0

    .line 1389
    if-nez v0, :cond_14

    .line 1390
    .line 1391
    goto :goto_1a

    .line 1392
    :cond_14
    monitor-enter v1

    .line 1393
    :try_start_18
    sget-boolean v0, Lo22;->Ε:Z
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_17

    .line 1394
    .line 1395
    if-eqz v0, :cond_15

    .line 1396
    .line 1397
    monitor-exit v1

    .line 1398
    goto :goto_1a

    .line 1399
    :cond_15
    :try_start_19
    new-instance v0, Lby1;

    .line 1400
    .line 1401
    const/16 v2, 0x8

    .line 1402
    .line 1403
    invoke-direct {v0, v2}, Lby1;-><init>(I)V

    .line 1404
    .line 1405
    .line 1406
    sget-object v2, Lui1;->κ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1407
    .line 1408
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1409
    .line 1410
    .line 1411
    sput-boolean v10, Lo22;->Ε:Z
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_17

    .line 1412
    .line 1413
    monitor-exit v1

    .line 1414
    goto :goto_1a

    .line 1415
    :catchall_17
    move-exception v0

    .line 1416
    monitor-exit v1

    .line 1417
    throw v0

    .line 1418
    :cond_16
    :goto_1a
    sget-object v1, Lo22;->ο:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1419
    .line 1420
    invoke-virtual {v1, v12, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1421
    .line 1422
    .line 1423
    move-result v0

    .line 1424
    if-nez v0, :cond_17

    .line 1425
    .line 1426
    goto :goto_1c

    .line 1427
    :cond_17
    :try_start_1a
    sget-object v0, Lxq0;->α:Lxq0;

    .line 1428
    .line 1429
    const-class v2, Landroid/app/Activity;

    .line 1430
    .line 1431
    const-string v3, "onResume"

    .line 1432
    .line 1433
    new-instance v4, Lpy1;

    .line 1434
    .line 1435
    invoke-direct {v4, v8}, Lpy1;-><init>(I)V

    .line 1436
    .line 1437
    .line 1438
    invoke-virtual {v0, v2, v3, v4}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 1439
    .line 1440
    .line 1441
    const-string v0, "r7aa0a9ca22b9e4fc"

    .line 1442
    .line 1443
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1444
    .line 1445
    .line 1446
    sget-object v0, Ls62;->α:Ls62;
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_18

    .line 1447
    .line 1448
    goto :goto_1b

    .line 1449
    :catchall_18
    move-exception v0

    .line 1450
    new-instance v2, Leo1;

    .line 1451
    .line 1452
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1453
    .line 1454
    .line 1455
    move-object v0, v2

    .line 1456
    :goto_1b
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v0

    .line 1460
    if-eqz v0, :cond_18

    .line 1461
    .line 1462
    invoke-virtual {v1, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1463
    .line 1464
    .line 1465
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1466
    .line 1467
    const-string v2, "r78d174b883b52e97"

    .line 1468
    .line 1469
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1470
    .line 1471
    .line 1472
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1473
    .line 1474
    .line 1475
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v0

    .line 1479
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1480
    .line 1481
    .line 1482
    :cond_18
    :goto_1c
    invoke-static {}, Lo22;->α()V

    .line 1483
    .line 1484
    .line 1485
    goto/16 :goto_4

    .line 1486
    .line 1487
    :pswitch_10
    iget-object v0, v0, Luu0;->ζ:Lz81;

    .line 1488
    .line 1489
    iget-object v0, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1490
    .line 1491
    invoke-static {v0}, Ls1;->ν(Ljava/lang/ClassLoader;)V

    .line 1492
    .line 1493
    .line 1494
    goto/16 :goto_4

    .line 1495
    .line 1496
    :pswitch_11
    iget-object v0, v0, Luu0;->ζ:Lz81;

    .line 1497
    .line 1498
    sget-object v1, Lmi1;->α:Lmi1;

    .line 1499
    .line 1500
    iget-object v0, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1501
    .line 1502
    invoke-virtual {v1, v0}, Lmi1;->η(Ljava/lang/ClassLoader;)V

    .line 1503
    .line 1504
    .line 1505
    goto/16 :goto_4

    .line 1506
    .line 1507
    :pswitch_12
    iget-object v0, v0, Luu0;->ζ:Lz81;

    .line 1508
    .line 1509
    sget-object v1, Lhf0;->α:Lhf0;

    .line 1510
    .line 1511
    invoke-virtual {v1, v0}, Lhf0;->α(Lz81;)V

    .line 1512
    .line 1513
    .line 1514
    goto/16 :goto_4

    .line 1515
    .line 1516
    :pswitch_13
    iget-object v0, v0, Luu0;->ζ:Lz81;

    .line 1517
    .line 1518
    sget-object v1, Lcom/example/dyhelper/hook/γ;->α:Lcom/example/dyhelper/hook/γ;

    .line 1519
    .line 1520
    const-string v3, "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22B532A4FB44494FF2F21D25346073D4A055F179F39CEFF671876F707CD1CB0C97ED"

    .line 1521
    .line 1522
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v3

    .line 1526
    sget-object v5, Lk20;->ε:Lk20;

    .line 1527
    .line 1528
    invoke-static {v0, v3, v5}, Lcom/example/dyhelper/hook/γ;->Η(Lz81;Ljava/lang/String;Lk20;)Z

    .line 1529
    .line 1530
    .line 1531
    move-result v3

    .line 1532
    const-string v7, "~7974716F46EDCCC8AB71015994E08EBF7057E4892C51F22F56F7353FACB1A1D8F47B0B30FC233A3B8CE5178DE7A241D527420FDE072775A4"

    .line 1533
    .line 1534
    invoke-static {v7}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v7

    .line 1538
    invoke-static {v0, v7, v5}, Lcom/example/dyhelper/hook/γ;->Η(Lz81;Ljava/lang/String;Lk20;)Z

    .line 1539
    .line 1540
    .line 1541
    move-result v5

    .line 1542
    if-eqz v5, :cond_19

    .line 1543
    .line 1544
    add-int/lit8 v3, v3, 0x1

    .line 1545
    .line 1546
    :cond_19
    const-string v5, "~7974716F46EDCCC8AB71015994E08EBF7057E4892C51F22F56F03474AEFAA0D9A94E4C21F0622A378CF61B87F8A576C81A592CCB282165A7"

    .line 1547
    .line 1548
    invoke-static {v5}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1549
    .line 1550
    .line 1551
    move-result-object v5

    .line 1552
    const-string v7, "~7974716F46EDCCC8AB71015994E08EBF7057E4892C51F22F56F7353FACB1B0D4A94E4C21F0622A378CF61B87F8A576C81A592CCB282165A7"

    .line 1553
    .line 1554
    invoke-static {v7}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v7

    .line 1558
    const-string v13, "~796422A8818C0EADCA9A33DA50D2E82D10279E237AB2D2E1346AFB2D829F6A162B8F10EA5EFCD9C354450AA57C40D466DA2DB8DBF07940320B959534"

    .line 1559
    .line 1560
    invoke-static {v13}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v13

    .line 1564
    const-string v14, "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA98B28E8B176FF618D47B48161BBD6802803BCEF2506F2675D8864E9F"

    .line 1565
    .line 1566
    invoke-static {v14}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1567
    .line 1568
    .line 1569
    move-result-object v14

    .line 1570
    const-string v15, "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654AAA42C9114B11FE0D3190B74083A42FC515208E40AB17E90CF782207FA32A086"

    .line 1571
    .line 1572
    invoke-static {v15}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v15

    .line 1576
    filled-new-array {v5, v7, v13, v14, v15}, [Ljava/lang/String;

    .line 1577
    .line 1578
    .line 1579
    move-result-object v5

    .line 1580
    move v7, v12

    .line 1581
    move v13, v7

    .line 1582
    :goto_1d
    if-ge v7, v6, :cond_1b

    .line 1583
    .line 1584
    aget-object v14, v5, v7

    .line 1585
    .line 1586
    sget-object v15, Lk20;->ζ:Lk20;

    .line 1587
    .line 1588
    invoke-static {v0, v14, v15}, Lcom/example/dyhelper/hook/γ;->Η(Lz81;Ljava/lang/String;Lk20;)Z

    .line 1589
    .line 1590
    .line 1591
    move-result v14

    .line 1592
    if-eqz v14, :cond_1a

    .line 1593
    .line 1594
    add-int/lit8 v13, v13, 0x1

    .line 1595
    .line 1596
    :cond_1a
    add-int/lit8 v7, v7, 0x1

    .line 1597
    .line 1598
    goto :goto_1d

    .line 1599
    :cond_1b
    :try_start_1b
    sget-object v5, Lx00;->α:Lx00;

    .line 1600
    .line 1601
    iget-object v0, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1602
    .line 1603
    invoke-virtual {v5, v0}, Lx00;->δ(Ljava/lang/ClassLoader;)V

    .line 1604
    .line 1605
    .line 1606
    sget-object v0, Ls62;->α:Ls62;
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_19

    .line 1607
    .line 1608
    goto :goto_1e

    .line 1609
    :catchall_19
    move-exception v0

    .line 1610
    new-instance v5, Leo1;

    .line 1611
    .line 1612
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1613
    .line 1614
    .line 1615
    move-object v0, v5

    .line 1616
    :goto_1e
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v0

    .line 1620
    if-eqz v0, :cond_1c

    .line 1621
    .line 1622
    const-string v5, "DYHelper_InfoBar"

    .line 1623
    .line 1624
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v0

    .line 1628
    const-string v6, "\u5f53\u524d\u4f5c\u54c1 selected \u89e3\u6790\u5668\u5b89\u88c5\u5931\u8d25\uff0c\u4fdd\u7559\u5e03\u5c40\u964d\u7ea7: "

    .line 1629
    .line 1630
    invoke-static {v6, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v0

    .line 1634
    invoke-static {v5, v0, v9, v11, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1635
    .line 1636
    .line 1637
    :cond_1c
    if-nez v3, :cond_1d

    .line 1638
    .line 1639
    if-nez v13, :cond_1d

    .line 1640
    .line 1641
    move v12, v10

    .line 1642
    :cond_1d
    sget-boolean v0, Lcom/example/dyhelper/hook/γ;->Η:Z

    .line 1643
    .line 1644
    if-eqz v0, :cond_1e

    .line 1645
    .line 1646
    goto :goto_1f

    .line 1647
    :cond_1e
    monitor-enter v1

    .line 1648
    :try_start_1c
    sget-boolean v0, Lcom/example/dyhelper/hook/γ;->Η:Z
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_1d

    .line 1649
    .line 1650
    if-eqz v0, :cond_1f

    .line 1651
    .line 1652
    monitor-exit v1

    .line 1653
    goto :goto_1f

    .line 1654
    :cond_1f
    :try_start_1d
    new-instance v0, Lq00;

    .line 1655
    .line 1656
    invoke-direct {v0, v2}, Lq00;-><init>(I)V

    .line 1657
    .line 1658
    .line 1659
    sget-object v2, Lpq;->κ:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 1660
    .line 1661
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 1662
    .line 1663
    .line 1664
    sput-boolean v10, Lcom/example/dyhelper/hook/γ;->Η:Z
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_1d

    .line 1665
    .line 1666
    monitor-exit v1

    .line 1667
    :goto_1f
    sget-boolean v0, Lcom/example/dyhelper/hook/γ;->Θ:Z

    .line 1668
    .line 1669
    if-eqz v0, :cond_20

    .line 1670
    .line 1671
    goto :goto_20

    .line 1672
    :cond_20
    monitor-enter v1

    .line 1673
    :try_start_1e
    sget-boolean v0, Lcom/example/dyhelper/hook/γ;->Θ:Z
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_1c

    .line 1674
    .line 1675
    if-eqz v0, :cond_21

    .line 1676
    .line 1677
    monitor-exit v1

    .line 1678
    goto :goto_20

    .line 1679
    :cond_21
    :try_start_1f
    new-instance v0, Lq00;

    .line 1680
    .line 1681
    invoke-direct {v0, v4}, Lq00;-><init>(I)V

    .line 1682
    .line 1683
    .line 1684
    sget-object v2, Lui1;->κ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1685
    .line 1686
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1687
    .line 1688
    .line 1689
    sput-boolean v10, Lcom/example/dyhelper/hook/γ;->Θ:Z
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_1c

    .line 1690
    .line 1691
    monitor-exit v1

    .line 1692
    :goto_20
    const-string v2, "Activity lifecycle fallback Hook \u5b89\u88c5\u5931\u8d25: "

    .line 1693
    .line 1694
    if-eqz v12, :cond_23

    .line 1695
    .line 1696
    sget-boolean v0, Lcom/example/dyhelper/hook/γ;->Ζ:Z

    .line 1697
    .line 1698
    if-nez v0, :cond_23

    .line 1699
    .line 1700
    monitor-enter v1

    .line 1701
    :try_start_20
    sget-boolean v0, Lcom/example/dyhelper/hook/γ;->Ζ:Z
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_1b

    .line 1702
    .line 1703
    if-nez v0, :cond_22

    .line 1704
    .line 1705
    :try_start_21
    sget-object v0, Lxq0;->α:Lxq0;

    .line 1706
    .line 1707
    const-class v4, Landroid/app/Activity;

    .line 1708
    .line 1709
    const-string v5, "onResume"

    .line 1710
    .line 1711
    new-instance v6, Lf10;

    .line 1712
    .line 1713
    invoke-direct {v6, v8}, Lf10;-><init>(I)V

    .line 1714
    .line 1715
    .line 1716
    invoke-virtual {v0, v4, v5, v6}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 1717
    .line 1718
    .line 1719
    const-class v4, Landroid/app/Activity;

    .line 1720
    .line 1721
    const-string v5, "onWindowFocusChanged"

    .line 1722
    .line 1723
    new-instance v6, Lf10;

    .line 1724
    .line 1725
    invoke-direct {v6, v11}, Lf10;-><init>(I)V

    .line 1726
    .line 1727
    .line 1728
    invoke-virtual {v0, v4, v5, v6}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 1729
    .line 1730
    .line 1731
    sput-boolean v10, Lcom/example/dyhelper/hook/γ;->Ζ:Z

    .line 1732
    .line 1733
    const-string v0, "DYHelper_InfoBar"

    .line 1734
    .line 1735
    const-string v4, "Activity lifecycle fallback Hook \u5b89\u88c5\u6210\u529f"

    .line 1736
    .line 1737
    invoke-static {v0, v4, v9, v11, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_1a

    .line 1738
    .line 1739
    .line 1740
    goto :goto_21

    .line 1741
    :catchall_1a
    move-exception v0

    .line 1742
    :try_start_22
    const-string v4, "DYHelper_InfoBar"

    .line 1743
    .line 1744
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v0

    .line 1748
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1749
    .line 1750
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1751
    .line 1752
    .line 1753
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1754
    .line 1755
    .line 1756
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v0

    .line 1760
    invoke-static {v4, v0, v9, v11, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_1b

    .line 1761
    .line 1762
    .line 1763
    goto :goto_21

    .line 1764
    :catchall_1b
    move-exception v0

    .line 1765
    goto :goto_22

    .line 1766
    :cond_22
    :goto_21
    monitor-exit v1

    .line 1767
    goto :goto_23

    .line 1768
    :goto_22
    monitor-exit v1

    .line 1769
    throw v0

    .line 1770
    :cond_23
    :goto_23
    sget-object v0, Lpq;->α:Lpq;

    .line 1771
    .line 1772
    invoke-static {}, Lpq;->α()Lmq;

    .line 1773
    .line 1774
    .line 1775
    move-result-object v0

    .line 1776
    if-eqz v0, :cond_24

    .line 1777
    .line 1778
    sget-object v1, Lcom/example/dyhelper/hook/γ;->α:Lcom/example/dyhelper/hook/γ;

    .line 1779
    .line 1780
    iget-wide v0, v0, Lmq;->δ:J

    .line 1781
    .line 1782
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1783
    .line 1784
    .line 1785
    move-result-object v0

    .line 1786
    invoke-static {v0}, Lcom/example/dyhelper/hook/γ;->κ(Ljava/lang/Long;)V

    .line 1787
    .line 1788
    .line 1789
    :cond_24
    const-string v0, "DYHelper_InfoBar"

    .line 1790
    .line 1791
    invoke-static {}, Lcom/example/dyhelper/hook/γ;->Κ()Z

    .line 1792
    .line 1793
    .line 1794
    move-result v1

    .line 1795
    const-string v2, "\u4fe1\u606f\u6761 Hook \u5b89\u88c5\u5b8c\u6210, descTriggerHooked="

    .line 1796
    .line 1797
    const-string v4, ", rootTriggerHooked="

    .line 1798
    .line 1799
    const-string v5, ", lifecycleFallback="

    .line 1800
    .line 1801
    invoke-static {v2, v3, v4, v13, v5}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 1802
    .line 1803
    .line 1804
    move-result-object v2

    .line 1805
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 1806
    .line 1807
    .line 1808
    const-string v3, ", touchFallback=false, enabled="

    .line 1809
    .line 1810
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1811
    .line 1812
    .line 1813
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 1814
    .line 1815
    .line 1816
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1817
    .line 1818
    .line 1819
    move-result-object v1

    .line 1820
    invoke-static {v0, v1, v9, v11, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1821
    .line 1822
    .line 1823
    goto/16 :goto_4

    .line 1824
    .line 1825
    :catchall_1c
    move-exception v0

    .line 1826
    monitor-exit v1

    .line 1827
    throw v0

    .line 1828
    :catchall_1d
    move-exception v0

    .line 1829
    monitor-exit v1

    .line 1830
    throw v0

    .line 1831
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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
