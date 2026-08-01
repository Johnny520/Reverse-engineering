.class public final Lhx;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Lz81;


# direct methods
.method public synthetic constructor <init>(Lz81;I)V
    .locals 0

    .line 1
    iput p2, p0, Lhx;->α:I

    .line 2
    .line 3
    iput-object p1, p0, Lhx;->β:Lz81;

    .line 4
    .line 5
    invoke-direct {p0}, Lm01;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lk01;)V
    .locals 12

    .line 1
    iget v0, p0, Lhx;->α:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 13
    .line 14
    instance-of v0, p1, Landroid/app/Activity;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    check-cast p1, Landroid/app/Activity;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object p1, v3

    .line 22
    :goto_0
    if-nez p1, :cond_1

    .line 23
    .line 24
    goto/16 :goto_4

    .line 25
    .line 26
    :cond_1
    sget-object v0, Lry1;->Δ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 27
    .line 28
    new-instance v4, Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    invoke-direct {v4, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sput-object v0, Lry1;->χ:Landroid/content/Context;

    .line 41
    .line 42
    invoke-static {}, Lui1;->Α()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {v0}, Lui1;->π(Landroid/content/Context;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    sget-object v0, Lry1;->φ:Ljava/lang/ClassLoader;

    .line 59
    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    iget-object p0, p0, Lhx;->β:Lz81;

    .line 63
    .line 64
    iget-object v0, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 65
    .line 66
    :cond_3
    sget-object p0, Lry1;->α:Lry1;

    .line 67
    .line 68
    invoke-static {}, Lry1;->ц()Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-eqz p0, :cond_4

    .line 73
    .line 74
    :try_start_0
    sget-object p0, Los;->α:Landroid/os/Handler;

    .line 75
    .line 76
    invoke-static {p1}, Los;->Γ(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    .line 79
    :catchall_0
    sget-object p0, Lry1;->α:Lry1;

    .line 80
    .line 81
    invoke-virtual {p0, v0, v2}, Lry1;->Γ(Ljava/lang/ClassLoader;Z)V

    .line 82
    .line 83
    .line 84
    :try_start_1
    sget p0, Lix;->α:I

    .line 85
    .line 86
    invoke-static {p1, v0}, Lix;->κ(Landroid/app/Activity;Ljava/lang/ClassLoader;)V

    .line 87
    .line 88
    .line 89
    sget-object p0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :catchall_1
    move-exception p0

    .line 93
    new-instance v0, Leo1;

    .line 94
    .line 95
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    move-object p0, v0

    .line 99
    :goto_1
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    if-eqz p0, :cond_4

    .line 104
    .line 105
    sget-object v0, Lry1;->α:Lry1;

    .line 106
    .line 107
    const-string v0, "DexKit \u9996\u626b\u8bf7\u6c42\u5931\u8d25"

    .line 108
    .line 109
    invoke-static {v0, p0}, Lry1;->э(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    :cond_4
    sget-object p0, Lry1;->α:Lry1;

    .line 113
    .line 114
    invoke-static {}, Lry1;->К()Ljy1;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    iget-boolean p0, p0, Ljy1;->γ:Z

    .line 119
    .line 120
    if-eqz p0, :cond_9

    .line 121
    .line 122
    invoke-static {}, Lui1;->Α()Z

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    if-nez p0, :cond_5

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 130
    .line 131
    .line 132
    move-result-wide v4

    .line 133
    sget-object p0, Lry1;->ж:Ljava/util/concurrent/atomic/AtomicLong;

    .line 134
    .line 135
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 136
    .line 137
    .line 138
    move-result-wide v6

    .line 139
    sub-long v8, v4, v6

    .line 140
    .line 141
    const-wide/16 v10, 0x7530

    .line 142
    .line 143
    cmp-long v0, v8, v10

    .line 144
    .line 145
    if-gez v0, :cond_6

    .line 146
    .line 147
    sget-object v0, Lry1;->з:Ljava/util/concurrent/atomic/AtomicReference;

    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-static {}, Lry1;->а()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    invoke-static {v0, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_6

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_6
    invoke-virtual {p0, v6, v7, v4, v5}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    if-nez p0, :cond_7

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_7
    sget-object p0, Lry1;->е:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 172
    .line 173
    invoke-virtual {p0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 174
    .line 175
    .line 176
    move-result p0

    .line 177
    if-nez p0, :cond_8

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_8
    new-instance p0, Ljava/lang/Thread;

    .line 181
    .line 182
    new-instance v0, Lfb0;

    .line 183
    .line 184
    const/16 v4, 0x14

    .line 185
    .line 186
    invoke-direct {v0, v4}, Lfb0;-><init>(I)V

    .line 187
    .line 188
    .line 189
    const-string v4, "SparkAutoRenew-Check"

    .line 190
    .line 191
    invoke-direct {p0, v0, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 198
    .line 199
    .line 200
    :cond_9
    :goto_2
    invoke-static {p1}, Lpg1;->ι(Landroid/app/Activity;)V

    .line 201
    .line 202
    .line 203
    sget-object p0, Lse1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 204
    .line 205
    invoke-static {p1}, Lse1;->δ(Landroid/app/Activity;)V

    .line 206
    .line 207
    .line 208
    invoke-static {p1}, Lxa1;->θ(Landroid/app/Activity;)V

    .line 209
    .line 210
    .line 211
    sget-object p0, Ldd1;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 212
    .line 213
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 214
    .line 215
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    sget-object p0, Ldd1;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 222
    .line 223
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 224
    .line 225
    .line 226
    move-result p0

    .line 227
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 228
    .line 229
    .line 230
    move-result-wide v0

    .line 231
    sget-object p1, Ldd1;->ζ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 232
    .line 233
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 234
    .line 235
    .line 236
    move-result-wide v4

    .line 237
    if-nez p0, :cond_b

    .line 238
    .line 239
    cmp-long p0, v0, v4

    .line 240
    .line 241
    if-gez p0, :cond_a

    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_a
    sget-object p0, Ldd1;->δ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 245
    .line 246
    invoke-virtual {p0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 247
    .line 248
    .line 249
    invoke-static {}, Ldd1;->γ()Z

    .line 250
    .line 251
    .line 252
    move-result p0

    .line 253
    if-eqz p0, :cond_c

    .line 254
    .line 255
    const-string p0, "pet_elf_camp_start_delay_seconds"

    .line 256
    .line 257
    const/4 p1, 0x5

    .line 258
    :try_start_2
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 263
    .line 264
    .line 265
    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 266
    :catchall_2
    const/16 p0, 0x12c

    .line 267
    .line 268
    invoke-static {p1, v2, p0}, Lj81;->μ(III)I

    .line 269
    .line 270
    .line 271
    move-result p0

    .line 272
    int-to-long p0, p0

    .line 273
    const-wide/16 v0, 0x3e8

    .line 274
    .line 275
    mul-long/2addr p0, v0

    .line 276
    invoke-static {p0, p1}, Ldd1;->η(J)V

    .line 277
    .line 278
    .line 279
    goto :goto_4

    .line 280
    :cond_b
    :goto_3
    const-string p0, "\u5ffd\u7565\u64cd\u4f5c\u83dc\u5355\u5f15\u8d77\u7684 Activity \u6062\u590d\uff0c\u4e0d\u91cd\u65b0\u89e6\u53d1\u8425\u5730\u81ea\u52a8\u4efb\u52a1"

    .line 281
    .line 282
    const/4 p1, 0x4

    .line 283
    const-string v0, "r8b18805b9e3774c8"

    .line 284
    .line 285
    invoke-static {v0, p0, v3, p1, v3}, Lux;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    :cond_c
    :goto_4
    return-void

    .line 289
    :pswitch_0
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 290
    .line 291
    instance-of v0, p1, Landroid/app/Activity;

    .line 292
    .line 293
    if-eqz v0, :cond_d

    .line 294
    .line 295
    move-object v3, p1

    .line 296
    check-cast v3, Landroid/app/Activity;

    .line 297
    .line 298
    :cond_d
    if-nez v3, :cond_e

    .line 299
    .line 300
    goto :goto_5

    .line 301
    :cond_e
    sget-object p1, Lix;->λ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 302
    .line 303
    invoke-virtual {p1, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 304
    .line 305
    .line 306
    move-result p1

    .line 307
    if-nez p1, :cond_f

    .line 308
    .line 309
    goto :goto_5

    .line 310
    :cond_f
    sget p1, Lix;->α:I

    .line 311
    .line 312
    sget-object p1, Lix;->ξ:Ljava/lang/ClassLoader;

    .line 313
    .line 314
    if-nez p1, :cond_10

    .line 315
    .line 316
    iget-object p0, p0, Lhx;->β:Lz81;

    .line 317
    .line 318
    iget-object p1, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 319
    .line 320
    :cond_10
    invoke-static {v3, p1}, Lix;->κ(Landroid/app/Activity;Ljava/lang/ClassLoader;)V

    .line 321
    .line 322
    .line 323
    :goto_5
    return-void

    .line 324
    nop

    .line 325
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
