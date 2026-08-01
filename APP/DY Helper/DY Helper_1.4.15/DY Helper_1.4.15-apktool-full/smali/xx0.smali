.class public final synthetic Lxx0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lxx0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lxx0;->ζ:Landroid/app/Activity;

    .line 4
    .line 5
    iput-object p2, p0, Lxx0;->η:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroid/app/Activity;I)V
    .locals 0

    .line 11
    iput p3, p0, Lxx0;->ε:I

    iput-object p1, p0, Lxx0;->η:Ljava/lang/String;

    iput-object p2, p0, Lxx0;->ζ:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Lxx0;->ε:I

    .line 2
    .line 3
    const-string v1, "DYHelper"

    .line 4
    .line 5
    const-string v2, "clipboard"

    .line 6
    .line 7
    const-string v3, "\u786e\u5b9a"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    iget-object v6, p0, Lxx0;->ζ:Landroid/app/Activity;

    .line 12
    .line 13
    iget-object p0, p0, Lxx0;->η:Ljava/lang/String;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    sget-object v0, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 19
    .line 20
    sget-object v0, Lcom/example/dyhelper/ui/а;->ε:Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Ljava/lang/Runnable;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    sget-object v1, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    sget-object v0, Lcom/example/dyhelper/ui/а;->δ:Ljava/util/LinkedHashMap;

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    sget-object v1, Lcom/example/dyhelper/ui/а;->ζ:Ljava/util/LinkedHashSet;

    .line 41
    .line 42
    invoke-virtual {v1, p0}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-eqz p0, :cond_1

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->clear()V

    .line 52
    .line 53
    .line 54
    :cond_1
    invoke-static {v6, v5}, Lcom/example/dyhelper/ui/а;->ι(Landroid/app/Activity;Z)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 59
    .line 60
    invoke-direct {v0, v6}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 61
    .line 62
    .line 63
    const-string v1, "\u7eed\u671f\u7ed3\u679c"

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0, p0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p0, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :pswitch_1
    invoke-static {v6, p0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :pswitch_2
    const/4 v0, 0x1

    .line 90
    invoke-static {v6, p0, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :pswitch_3
    invoke-static {v6, p0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_4
    sget-object v0, Lwg1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 107
    .line 108
    invoke-virtual {v6}, Landroid/app/Activity;->isFinishing()Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_2

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_2
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 116
    .line 117
    invoke-direct {v0, v6}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 118
    .line 119
    .line 120
    const-string v1, "\u6587\u672c\u53d1\u9001\u6d4b\u8bd5"

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0, p0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-virtual {p0, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 135
    .line 136
    .line 137
    :goto_0
    return-void

    .line 138
    :pswitch_5
    invoke-virtual {v6}, Landroid/app/Activity;->isFinishing()Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-nez v0, :cond_3

    .line 143
    .line 144
    invoke-virtual {v6}, Landroid/app/Activity;->isDestroyed()Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-nez v0, :cond_3

    .line 149
    .line 150
    invoke-static {v6, p0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 155
    .line 156
    .line 157
    :cond_3
    return-void

    .line 158
    :pswitch_6
    invoke-virtual {v6}, Landroid/app/Activity;->isFinishing()Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-nez v0, :cond_4

    .line 163
    .line 164
    invoke-virtual {v6}, Landroid/app/Activity;->isDestroyed()Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-nez v0, :cond_4

    .line 169
    .line 170
    invoke-static {v6, p0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 175
    .line 176
    .line 177
    :cond_4
    return-void

    .line 178
    :pswitch_7
    invoke-virtual {v6}, Landroid/app/Activity;->isFinishing()Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-nez v0, :cond_5

    .line 183
    .line 184
    invoke-virtual {v6}, Landroid/app/Activity;->isDestroyed()Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-nez v0, :cond_5

    .line 189
    .line 190
    invoke-static {v6, p0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 195
    .line 196
    .line 197
    :cond_5
    return-void

    .line 198
    :pswitch_8
    sget-object v0, Lq71;->α:Lq71;

    .line 199
    .line 200
    invoke-static {v6, p0}, Lq71;->ο(Landroid/app/Activity;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :pswitch_9
    sget-object v0, Lqy0;->α:Lqy0;

    .line 205
    .line 206
    new-instance v0, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    const-string v1, "\u89c6\u9891\u5df2\u4fdd\u5b58: "

    .line 209
    .line 210
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    invoke-static {v6, p0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :pswitch_a
    sget-object v0, Lqy0;->α:Lqy0;

    .line 225
    .line 226
    new-instance v0, Ljava/lang/StringBuilder;

    .line 227
    .line 228
    const-string v1, "\u97f3\u9891\u5df2\u4fdd\u5b58: "

    .line 229
    .line 230
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    invoke-static {v6, p0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :pswitch_b
    invoke-virtual {v6, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    check-cast v0, Landroid/content/ClipboardManager;

    .line 252
    .line 253
    invoke-static {v1, p0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    invoke-virtual {v0, p0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 258
    .line 259
    .line 260
    sget-object p0, Lqy0;->α:Lqy0;

    .line 261
    .line 262
    const-string p0, "\u94fe\u63a5\u5df2\u590d\u5236"

    .line 263
    .line 264
    invoke-static {v6, p0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    return-void

    .line 268
    :pswitch_c
    sget-object v0, Lqy0;->α:Lqy0;

    .line 269
    .line 270
    if-nez p0, :cond_6

    .line 271
    .line 272
    const-string p0, "\u672a\u627e\u5230\u53ef\u590d\u5236\u7684\u4e0b\u8f7d\u76f4\u94fe"

    .line 273
    .line 274
    invoke-static {v6, p0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    goto :goto_2

    .line 278
    :cond_6
    invoke-virtual {v6, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    instance-of v2, v0, Landroid/content/ClipboardManager;

    .line 283
    .line 284
    if-eqz v2, :cond_7

    .line 285
    .line 286
    move-object v4, v0

    .line 287
    check-cast v4, Landroid/content/ClipboardManager;

    .line 288
    .line 289
    :cond_7
    if-nez v4, :cond_8

    .line 290
    .line 291
    const-string p0, "\u590d\u5236\u5931\u8d25\uff1a\u526a\u8d34\u677f\u4e0d\u53ef\u7528"

    .line 292
    .line 293
    invoke-static {v6, p0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    goto :goto_2

    .line 297
    :cond_8
    :try_start_0
    const-string v0, "DYHelper\u4e0b\u8f7d\u76f4\u94fe"

    .line 298
    .line 299
    invoke-static {v0, p0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 300
    .line 301
    .line 302
    move-result-object p0

    .line 303
    invoke-virtual {v4, p0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 304
    .line 305
    .line 306
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 307
    .line 308
    goto :goto_1

    .line 309
    :catchall_0
    move-exception p0

    .line 310
    new-instance v0, Leo1;

    .line 311
    .line 312
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 313
    .line 314
    .line 315
    move-object p0, v0

    .line 316
    :goto_1
    instance-of v0, p0, Leo1;

    .line 317
    .line 318
    if-nez v0, :cond_9

    .line 319
    .line 320
    move-object v0, p0

    .line 321
    check-cast v0, Ls62;

    .line 322
    .line 323
    const-string v0, "\u4e0b\u8f7d\u76f4\u94fe\u5df2\u590d\u5236"

    .line 324
    .line 325
    invoke-static {v6, v0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    :cond_9
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 329
    .line 330
    .line 331
    move-result-object p0

    .line 332
    if-eqz p0, :cond_a

    .line 333
    .line 334
    const-string v0, "\u590d\u5236\u4f5c\u54c1\u4e0b\u8f7d\u76f4\u94fe\u5931\u8d25"

    .line 335
    .line 336
    invoke-static {v1, v0, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 337
    .line 338
    .line 339
    const-string p0, "\u590d\u5236\u4e0b\u8f7d\u76f4\u94fe\u5931\u8d25"

    .line 340
    .line 341
    invoke-static {v6, p0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    :cond_a
    :goto_2
    return-void

    .line 345
    :pswitch_d
    sget-object v0, Lqy0;->α:Lqy0;

    .line 346
    .line 347
    new-instance v0, Ljava/lang/StringBuilder;

    .line 348
    .line 349
    const-string v1, "\u8868\u60c5\u5df2\u4fdd\u5b58: "

    .line 350
    .line 351
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object p0

    .line 361
    invoke-static {v6, p0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    return-void

    .line 365
    :pswitch_e
    sget-object v0, Lqy0;->α:Lqy0;

    .line 366
    .line 367
    new-instance v0, Ljava/lang/StringBuilder;

    .line 368
    .line 369
    const-string v1, "\u539f\u753b\u8d28\u89c6\u9891\u5df2\u4fdd\u5b58: "

    .line 370
    .line 371
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object p0

    .line 381
    invoke-static {v6, p0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    return-void

    .line 385
    :pswitch_data_0
    .packed-switch 0x0
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
