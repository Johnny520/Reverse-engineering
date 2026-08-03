.class public final synthetic Lf0/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lf0/d;->g:I

    .line 2
    .line 3
    iput-object p3, p0, Lf0/d;->i:Ljava/lang/Object;

    .line 4
    .line 5
    iput p1, p0, Lf0/d;->h:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Lf0/d;->g:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    iget v4, p0, Lf0/d;->h:I

    .line 7
    .line 8
    iget-object v5, p0, Lf0/d;->i:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v5, Lua/k;

    .line 14
    .line 15
    if-nez v4, :cond_0

    .line 16
    .line 17
    move v2, v3

    .line 18
    :cond_0
    iput-boolean v2, v5, Lua/k;->h:Z

    .line 19
    .line 20
    iget-object v0, v5, Lua/k;->i:Ljava/util/ArrayDeque;

    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    iget-object v2, v5, Lua/k;->b:Lia/t;

    .line 25
    .line 26
    new-instance v3, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v5, "\u81ea\u52a8\u6536\u6b3e\u64ad\u62a5\u521d\u59cb\u5316\u5931\u8d25: "

    .line 29
    .line 30
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v2, v3, v1}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    iget-object v1, v5, Lua/k;->g:Landroid/speech/tts/TextToSpeech;

    .line 48
    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 52
    .line 53
    invoke-virtual {v1, v2}, Landroid/speech/tts/TextToSpeech;->setLanguage(Ljava/util/Locale;)I

    .line 54
    .line 55
    .line 56
    :cond_2
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_3

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    check-cast v1, Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v5, v1}, Lua/k;->d(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    :goto_1
    return-void

    .line 76
    :pswitch_0
    check-cast v5, Lra/c;

    .line 77
    .line 78
    iget-object v0, v5, Lra/c;->e:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, Lna/b;

    .line 81
    .line 82
    iput-boolean v2, v5, Lra/c;->b:Z

    .line 83
    .line 84
    if-nez v4, :cond_8

    .line 85
    .line 86
    iget-object v6, v5, Lra/c;->j:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v6, Landroid/speech/tts/TextToSpeech;

    .line 89
    .line 90
    if-nez v6, :cond_4

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_4
    iput-boolean v3, v5, Lra/c;->a:Z

    .line 94
    .line 95
    const-string v1, "ERROR \u7ea2\u5305\u64ad\u62a5\u4e2d\u6587\u8bed\u97f3\u4e0d\u53ef\u7528: "

    .line 96
    .line 97
    :try_start_0
    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 98
    .line 99
    invoke-virtual {v6, v2}, Landroid/speech/tts/TextToSpeech;->setLanguage(Ljava/util/Locale;)I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    const/4 v4, -0x1

    .line 104
    if-eq v2, v4, :cond_5

    .line 105
    .line 106
    const/4 v4, -0x2

    .line 107
    if-ne v2, v4, :cond_6

    .line 108
    .line 109
    :cond_5
    new-instance v4, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    if-eqz v0, :cond_6

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Lna/b;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :catchall_0
    move-exception v1

    .line 128
    new-instance v2, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    const-string v4, "ERROR \u7ea2\u5305\u64ad\u62a5\u8bed\u8a00\u8bbe\u7f6e\u5931\u8d25: "

    .line 131
    .line 132
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    if-eqz v0, :cond_6

    .line 147
    .line 148
    invoke-virtual {v0, v1}, Lna/b;->a(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    :cond_6
    :goto_2
    :try_start_1
    iget-object v1, v5, Lra/c;->j:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v1, Landroid/speech/tts/TextToSpeech;

    .line 154
    .line 155
    new-instance v2, Landroid/media/AudioAttributes$Builder;

    .line 156
    .line 157
    invoke-direct {v2}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v3}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-virtual {v2, v3}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-virtual {v2}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-virtual {v1, v2}, Landroid/speech/tts/TextToSpeech;->setAudioAttributes(Landroid/media/AudioAttributes;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 173
    .line 174
    .line 175
    goto :goto_3

    .line 176
    :catchall_1
    move-exception v1

    .line 177
    new-instance v2, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    const-string v3, "ERROR \u7ea2\u5305\u64ad\u62a5\u97f3\u9891\u901a\u9053\u8bbe\u7f6e\u5931\u8d25: "

    .line 180
    .line 181
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    if-eqz v0, :cond_7

    .line 196
    .line 197
    invoke-virtual {v0, v1}, Lna/b;->a(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    :cond_7
    :goto_3
    invoke-virtual {v5}, Lra/c;->e()V

    .line 201
    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_8
    :goto_4
    :try_start_2
    iget-object v0, v5, Lra/c;->j:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v0, Landroid/speech/tts/TextToSpeech;

    .line 207
    .line 208
    if-eqz v0, :cond_9

    .line 209
    .line 210
    invoke-virtual {v0}, Landroid/speech/tts/TextToSpeech;->shutdown()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 211
    .line 212
    .line 213
    :catchall_2
    :cond_9
    iput-object v1, v5, Lra/c;->j:Ljava/lang/Object;

    .line 214
    .line 215
    iput-boolean v2, v5, Lra/c;->a:Z

    .line 216
    .line 217
    new-instance v0, Ljava/lang/StringBuilder;

    .line 218
    .line 219
    const-string v2, "\u7ea2\u5305\u64ad\u62a5\u521d\u59cb\u5316\u5931\u8d25: status="

    .line 220
    .line 221
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {v5, v0, v1}, Lra/c;->k(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 232
    .line 233
    .line 234
    const-string v0, "\u521d\u59cb\u5316\u5931\u8d25"

    .line 235
    .line 236
    invoke-virtual {v5, v0}, Lra/c;->q(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    :goto_5
    return-void

    .line 240
    :pswitch_1
    check-cast v5, Landroid/widget/EditText;

    .line 241
    .line 242
    invoke-virtual {v5, v2, v4}, Landroid/view/View;->scrollTo(II)V

    .line 243
    .line 244
    .line 245
    return-void

    .line 246
    :pswitch_2
    check-cast v5, Lnb/w;

    .line 247
    .line 248
    sget-object v0, Lnb/w;->A:Log/k;

    .line 249
    .line 250
    invoke-virtual {v5}, Lnb/w;->y()Lnb/z;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    const-string v2, "text_speech_enable"

    .line 255
    .line 256
    invoke-virtual {v0, v2}, Lnb/z;->b(Ljava/lang/String;)Z

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    if-eqz v2, :cond_11

    .line 261
    .line 262
    const-string v2, "text_speech_volume_control"

    .line 263
    .line 264
    invoke-virtual {v0, v2}, Lnb/z;->b(Ljava/lang/String;)Z

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    if-eqz v0, :cond_11

    .line 269
    .line 270
    iget-object v0, v5, Lnb/w;->o:Lnb/l;

    .line 271
    .line 272
    if-nez v0, :cond_a

    .line 273
    .line 274
    goto :goto_7

    .line 275
    :cond_a
    if-gez v4, :cond_b

    .line 276
    .line 277
    iget-boolean v0, v5, Lnb/w;->r:Z

    .line 278
    .line 279
    if-eqz v0, :cond_b

    .line 280
    .line 281
    invoke-virtual {v5}, Lnb/w;->z()V

    .line 282
    .line 283
    .line 284
    goto :goto_8

    .line 285
    :cond_b
    if-gez v4, :cond_c

    .line 286
    .line 287
    invoke-virtual {v5}, Lnb/w;->m()V

    .line 288
    .line 289
    .line 290
    goto :goto_8

    .line 291
    :cond_c
    if-lez v4, :cond_d

    .line 292
    .line 293
    iget-boolean v0, v5, Lnb/w;->r:Z

    .line 294
    .line 295
    if-eqz v0, :cond_d

    .line 296
    .line 297
    invoke-virtual {v5}, Lnb/w;->u()V

    .line 298
    .line 299
    .line 300
    goto :goto_8

    .line 301
    :cond_d
    if-lez v4, :cond_12

    .line 302
    .line 303
    iget-object v0, v5, Lnb/w;->a:Landroid/content/Context;

    .line 304
    .line 305
    const-string v2, "audio"

    .line 306
    .line 307
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    instance-of v2, v0, Landroid/media/AudioManager;

    .line 312
    .line 313
    if-eqz v2, :cond_e

    .line 314
    .line 315
    move-object v1, v0

    .line 316
    check-cast v1, Landroid/media/AudioManager;

    .line 317
    .line 318
    :cond_e
    if-eqz v1, :cond_12

    .line 319
    .line 320
    const/4 v0, 0x3

    .line 321
    invoke-virtual {v1, v0}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    .line 322
    .line 323
    .line 324
    move-result v2

    .line 325
    if-ge v2, v3, :cond_f

    .line 326
    .line 327
    move v2, v3

    .line 328
    :cond_f
    invoke-virtual {v1, v0}, Landroid/media/AudioManager;->getStreamVolume(I)I

    .line 329
    .line 330
    .line 331
    move-result v4

    .line 332
    add-int/2addr v4, v3

    .line 333
    if-le v4, v2, :cond_10

    .line 334
    .line 335
    goto :goto_6

    .line 336
    :cond_10
    move v2, v4

    .line 337
    :goto_6
    :try_start_3
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 338
    .line 339
    .line 340
    move-result-object v4

    .line 341
    iput-object v4, v5, Lnb/w;->x:Ljava/lang/Integer;

    .line 342
    .line 343
    invoke-virtual {v1, v0, v2, v3}, Landroid/media/AudioManager;->setStreamVolume(III)V

    .line 344
    .line 345
    .line 346
    iget-object v0, v5, Lnb/w;->v:Lnb/q;

    .line 347
    .line 348
    if-eqz v0, :cond_12

    .line 349
    .line 350
    invoke-virtual {v0, v2}, Landroid/media/VolumeProvider;->setCurrentVolume(I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 351
    .line 352
    .line 353
    goto :goto_8

    .line 354
    :cond_11
    :goto_7
    invoke-virtual {v5}, Lnb/w;->o()V

    .line 355
    .line 356
    .line 357
    :catchall_3
    :cond_12
    :goto_8
    return-void

    .line 358
    :pswitch_3
    check-cast v5, Ljava/util/function/IntConsumer;

    .line 359
    .line 360
    invoke-interface {v5, v4}, Ljava/util/function/IntConsumer;->accept(I)V

    .line 361
    .line 362
    .line 363
    return-void

    .line 364
    nop

    .line 365
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
