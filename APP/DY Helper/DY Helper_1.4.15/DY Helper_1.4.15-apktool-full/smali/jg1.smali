.class public final synthetic Ljg1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La80;Landroid/app/Activity;Lv9;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Ljg1;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ljg1;->η:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Ljg1;->ζ:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Ljg1;->θ:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Landroid/widget/TextView;Landroid/app/Activity;Ljava/lang/Comparable;I)V
    .locals 0

    .line 14
    iput p4, p0, Ljg1;->ε:I

    iput-object p1, p0, Ljg1;->θ:Ljava/lang/Object;

    iput-object p2, p0, Ljg1;->ζ:Ljava/lang/Object;

    iput-object p3, p0, Ljg1;->η:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 15
    iput p4, p0, Ljg1;->ε:I

    iput-object p1, p0, Ljg1;->ζ:Ljava/lang/Object;

    iput-object p2, p0, Ljg1;->θ:Ljava/lang/Object;

    iput-object p3, p0, Ljg1;->η:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lum1;Landroid/app/Activity;)V
    .locals 1

    .line 16
    const/4 v0, 0x5

    iput v0, p0, Ljg1;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljg1;->θ:Ljava/lang/Object;

    iput-object p2, p0, Ljg1;->η:Ljava/lang/Object;

    iput-object p3, p0, Ljg1;->ζ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Ljg1;->ε:I

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v5, p0, Ljg1;->η:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v6, p0, Ljg1;->θ:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object p0, p0, Ljg1;->ζ:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p0, Landroid/net/Uri;

    .line 18
    .line 19
    check-cast v6, Lqh1;

    .line 20
    .line 21
    check-cast v5, Ljava/lang/String;

    .line 22
    .line 23
    if-nez p0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v6, v4}, Lqh1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    goto/16 :goto_5

    .line 29
    .line 30
    :cond_0
    if-eqz v5, :cond_2

    .line 31
    .line 32
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    move-object v4, v5

    .line 39
    :cond_1
    if-nez v4, :cond_3

    .line 40
    .line 41
    :cond_2
    invoke-virtual {p0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    if-nez v4, :cond_3

    .line 46
    .line 47
    const-string v4, "\u5df2\u9009\u62e9 MP3"

    .line 48
    .line 49
    :cond_3
    sget-object v0, Lui1;->α:Ljava/lang/Object;

    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    const-string v2, "voice_replace_mp3_uri"

    .line 59
    .line 60
    invoke-static {v2, v0}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-string v0, "voice_replace_mp3_name"

    .line 64
    .line 65
    invoke-static {v0, v4}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    const-string v0, "uri"

    .line 76
    .line 77
    const-string v2, "voice_replace_audio_list"

    .line 78
    .line 79
    :try_start_0
    invoke-static {v2, v1}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_4

    .line 88
    .line 89
    new-instance v1, Lorg/json/JSONArray;

    .line 90
    .line 91
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :catchall_0
    move-exception p0

    .line 96
    goto :goto_3

    .line 97
    :cond_4
    new-instance v5, Lorg/json/JSONArray;

    .line 98
    .line 99
    invoke-direct {v5, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    move-object v1, v5

    .line 103
    :goto_0
    new-instance v5, Lorg/json/JSONArray;

    .line 104
    .line 105
    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 106
    .line 107
    .line 108
    new-instance v7, Lorg/json/JSONObject;

    .line 109
    .line 110
    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 111
    .line 112
    .line 113
    const-string v8, "id"

    .line 114
    .line 115
    invoke-virtual {v7, v8, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 116
    .line 117
    .line 118
    const-string v8, "name"

    .line 119
    .line 120
    invoke-virtual {v7, v8, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v7, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 124
    .line 125
    .line 126
    const-string v8, "durationMs"

    .line 127
    .line 128
    const-wide/16 v9, 0x0

    .line 129
    .line 130
    invoke-virtual {v7, v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5, v7}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 137
    .line 138
    .line 139
    move-result v7

    .line 140
    :goto_1
    if-ge v3, v7, :cond_7

    .line 141
    .line 142
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 143
    .line 144
    .line 145
    move-result-object v8

    .line 146
    if-nez v8, :cond_5

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_5
    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    invoke-static {v9, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v9

    .line 157
    if-nez v9, :cond_6

    .line 158
    .line 159
    invoke-virtual {v5, v8}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 160
    .line 161
    .line 162
    :cond_6
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_7
    sget-object p0, Lui1;->α:Ljava/lang/Object;

    .line 166
    .line 167
    invoke-virtual {v5}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-static {v2, p0}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :goto_3
    new-instance v0, Leo1;

    .line 181
    .line 182
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 183
    .line 184
    .line 185
    move-object p0, v0

    .line 186
    :goto_4
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    if-eqz p0, :cond_8

    .line 191
    .line 192
    const-string v0, "DYHelper"

    .line 193
    .line 194
    const-string v1, "\u4fdd\u5b58\u8bed\u97f3\u66ff\u6362\u97f3\u9891\u5217\u8868\u5931\u8d25"

    .line 195
    .line 196
    invoke-static {v0, v1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 197
    .line 198
    .line 199
    :cond_8
    invoke-virtual {v6, v4}, Lqh1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    :goto_5
    return-void

    .line 203
    :pswitch_0
    check-cast v6, Landroid/widget/TextView;

    .line 204
    .line 205
    check-cast p0, Landroid/app/Activity;

    .line 206
    .line 207
    check-cast v5, Landroid/net/Uri;

    .line 208
    .line 209
    const-string v0, "\u4e0b\u8f7d\u5b8c\u6210\uff0c\u6b63\u5728\u6253\u5f00\u5b89\u88c5\u5668"

    .line 210
    .line 211
    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 212
    .line 213
    .line 214
    new-instance v0, Landroid/content/Intent;

    .line 215
    .line 216
    const-string v1, "android.intent.action.VIEW"

    .line 217
    .line 218
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    const-string v1, "application/vnd.android.package-archive"

    .line 222
    .line 223
    invoke-virtual {v0, v5, v1}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 224
    .line 225
    .line 226
    const/high16 v1, 0x10000000

    .line 227
    .line 228
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 232
    .line 233
    .line 234
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 235
    .line 236
    .line 237
    return-void

    .line 238
    :pswitch_1
    check-cast p0, Landroid/view/View;

    .line 239
    .line 240
    check-cast v6, Ljava/lang/String;

    .line 241
    .line 242
    check-cast v5, Ljava/lang/String;

    .line 243
    .line 244
    sget-object v0, Lo22;->α:Lo22;

    .line 245
    .line 246
    invoke-virtual {v0, p0, v6, v5}, Lo22;->Α(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    return-void

    .line 250
    :pswitch_2
    check-cast v6, Landroid/widget/TextView;

    .line 251
    .line 252
    check-cast p0, Landroid/app/Activity;

    .line 253
    .line 254
    check-cast v5, Ljava/lang/String;

    .line 255
    .line 256
    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    if-nez v0, :cond_9

    .line 264
    .line 265
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    if-nez v0, :cond_9

    .line 270
    .line 271
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 272
    .line 273
    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 274
    .line 275
    .line 276
    const-string p0, "\u6d4b\u8bd5\u53d1\u9001\u7ed3\u679c"

    .line 277
    .line 278
    invoke-virtual {v0, p0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    invoke-virtual {p0, v5}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    const-string v0, "\u786e\u5b9a"

    .line 287
    .line 288
    invoke-virtual {p0, v0, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 293
    .line 294
    .line 295
    :cond_9
    return-void

    .line 296
    :pswitch_3
    check-cast v6, Ljava/lang/String;

    .line 297
    .line 298
    check-cast v5, Lum1;

    .line 299
    .line 300
    check-cast p0, Landroid/app/Activity;

    .line 301
    .line 302
    if-eqz v6, :cond_b

    .line 303
    .line 304
    sget-object v0, Lbv1;->α:Lbv1;

    .line 305
    .line 306
    const-string v0, "comment_bg_cropped_uri"

    .line 307
    .line 308
    invoke-static {v0, v6}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    const-string v0, "comment_bg_image_uri"

    .line 312
    .line 313
    invoke-static {v0, v1}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    iget-object v0, v5, Lum1;->ε:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v0, La80;

    .line 319
    .line 320
    if-eqz v0, :cond_a

    .line 321
    .line 322
    const-string v1, "\u5df2\u9009\u62e9\u5e76\u88c1\u526a"

    .line 323
    .line 324
    invoke-interface {v0, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    :cond_a
    const-string v0, "\u80cc\u666f\u56fe\u7247\u5df2\u4fdd\u5b58\uff0c\u91cd\u65b0\u6253\u5f00\u8bc4\u8bba\u533a\u751f\u6548"

    .line 328
    .line 329
    invoke-static {p0, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 330
    .line 331
    .line 332
    move-result-object p0

    .line 333
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 334
    .line 335
    .line 336
    goto :goto_6

    .line 337
    :cond_b
    const-string v0, "\u4fdd\u5b58\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5"

    .line 338
    .line 339
    invoke-static {p0, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 340
    .line 341
    .line 342
    move-result-object p0

    .line 343
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 344
    .line 345
    .line 346
    :goto_6
    return-void

    .line 347
    :pswitch_4
    check-cast p0, Landroid/app/Activity;

    .line 348
    .line 349
    check-cast v6, Landroid/net/Uri;

    .line 350
    .line 351
    check-cast v5, Lum1;

    .line 352
    .line 353
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-virtual {v0, v6}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 358
    .line 359
    .line 360
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 361
    if-eqz v0, :cond_c

    .line 362
    .line 363
    :try_start_2
    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    .line 364
    .line 365
    .line 366
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 367
    :try_start_3
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 368
    .line 369
    .line 370
    move-object v4, v1

    .line 371
    goto :goto_7

    .line 372
    :catchall_1
    move-exception v1

    .line 373
    :try_start_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 374
    :catchall_2
    move-exception v2

    .line 375
    :try_start_5
    invoke-static {v0, v1}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 376
    .line 377
    .line 378
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 379
    :catchall_3
    :cond_c
    :goto_7
    new-instance v0, Lcom/example/dyhelper/ui/υ;

    .line 380
    .line 381
    invoke-direct {v0, v4, p0, v5}, Lcom/example/dyhelper/ui/υ;-><init>(Landroid/graphics/Bitmap;Landroid/app/Activity;Lum1;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 385
    .line 386
    .line 387
    return-void

    .line 388
    :pswitch_5
    check-cast v5, La80;

    .line 389
    .line 390
    check-cast p0, Landroid/app/Activity;

    .line 391
    .line 392
    check-cast v6, Lv9;

    .line 393
    .line 394
    invoke-static {}, Lx9;->κ()Z

    .line 395
    .line 396
    .line 397
    move-result v0

    .line 398
    if-eqz v0, :cond_d

    .line 399
    .line 400
    const-string v1, "\u5df2\u901a\u8fc7"

    .line 401
    .line 402
    goto :goto_8

    .line 403
    :cond_d
    const-string v1, "\u672a\u901a\u8fc7"

    .line 404
    .line 405
    :goto_8
    invoke-interface {v5, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    iget-object v1, v6, Lv9;->β:Ljava/lang/String;

    .line 409
    .line 410
    invoke-static {p0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 415
    .line 416
    .line 417
    if-eqz v0, :cond_e

    .line 418
    .line 419
    const-string v0, "\u5185\u6d4b\u72b6\u6001\u5df2\u66f4\u65b0\uff0c\u91cd\u65b0\u6253\u5f00\u8bbe\u7f6e\u53ef\u5237\u65b0\u5168\u90e8\u5f00\u5173"

    .line 420
    .line 421
    invoke-static {p0, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 422
    .line 423
    .line 424
    move-result-object p0

    .line 425
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 426
    .line 427
    .line 428
    :cond_e
    return-void

    .line 429
    :pswitch_6
    check-cast p0, Landroid/view/View;

    .line 430
    .line 431
    check-cast v6, Landroid/view/ViewGroup;

    .line 432
    .line 433
    check-cast v5, Landroid/widget/FrameLayout;

    .line 434
    .line 435
    const-string v0, "PublishGestureLauncher"

    .line 436
    .line 437
    const-string v1, "[\u964d\u7ea7\u65b9\u6848] \u4e34\u65f6 PublishButton \u5ef6\u8fdf\u89e6\u53d1\u5f02\u5e38: "

    .line 438
    .line 439
    const/4 v2, 0x4

    .line 440
    :try_start_6
    sget-object v3, Ldk1;->α:Ldk1;

    .line 441
    .line 442
    const-string v3, "transient-attached"

    .line 443
    .line 444
    invoke-static {p0, v3}, Ldk1;->σ(Landroid/view/View;Ljava/lang/String;)Z

    .line 445
    .line 446
    .line 447
    move-result p0

    .line 448
    if-eqz p0, :cond_f

    .line 449
    .line 450
    const-string p0, "[\u964d\u7ea7\u65b9\u6848] \u4e34\u65f6 PublishButton \u89e6\u53d1\u6210\u529f\uff08\u7f55\u89c1\u60c5\u51b5\uff09"

    .line 451
    .line 452
    invoke-static {v0, p0, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    goto :goto_9

    .line 456
    :catchall_4
    move-exception p0

    .line 457
    goto :goto_a

    .line 458
    :cond_f
    const-string p0, "[\u964d\u7ea7\u65b9\u6848] \u4e34\u65f6 PublishButton \u672a\u89e6\u53d1\uff08\u9884\u671f\u884c\u4e3a\uff09\uff0c\u5efa\u8bae\u68c0\u67e5\u524d\u5e8f\u65b9\u6848\u662f\u5426\u6b63\u5e38\u5de5\u4f5c"

    .line 459
    .line 460
    invoke-static {v0, p0, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 461
    .line 462
    .line 463
    :goto_9
    :try_start_7
    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 464
    .line 465
    .line 466
    goto :goto_b

    .line 467
    :goto_a
    :try_start_8
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object p0

    .line 471
    new-instance v3, Ljava/lang/StringBuilder;

    .line 472
    .line 473
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object p0

    .line 483
    invoke-static {v0, p0, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 484
    .line 485
    .line 486
    goto :goto_9

    .line 487
    :catchall_5
    :goto_b
    return-void

    .line 488
    :catchall_6
    move-exception p0

    .line 489
    :try_start_9
    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 490
    .line 491
    .line 492
    :catchall_7
    throw p0

    .line 493
    :pswitch_7
    check-cast p0, Landroid/app/Activity;

    .line 494
    .line 495
    check-cast v6, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;

    .line 496
    .line 497
    check-cast v5, La80;

    .line 498
    .line 499
    invoke-static {p0, v6, v5}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;->δ(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;La80;)V

    .line 500
    .line 501
    .line 502
    return-void

    .line 503
    :pswitch_8
    check-cast p0, Landroid/app/Activity;

    .line 504
    .line 505
    check-cast v6, Llg1;

    .line 506
    .line 507
    check-cast v5, La80;

    .line 508
    .line 509
    sget-object v0, Lpg1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 510
    .line 511
    const-string v1, "\u706b\u661f\u4efb\u52a1\u5931\u8d25: "

    .line 512
    .line 513
    const-string v4, "\u706b\u661f\u751f\u4ea7\u4efb\u52a1\u5f02\u5e38 mode="

    .line 514
    .line 515
    :try_start_a
    invoke-static {p0, v6}, Lpg1;->γ(Landroid/app/Activity;Llg1;)Lmg1;

    .line 516
    .line 517
    .line 518
    move-result-object v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 519
    :goto_c
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 520
    .line 521
    .line 522
    goto :goto_e

    .line 523
    :catchall_8
    move-exception v7

    .line 524
    :try_start_b
    const-string v8, "r86c859e3375e752"

    .line 525
    .line 526
    iget-object v6, v6, Llg1;->α:Lkg1;

    .line 527
    .line 528
    new-instance v9, Ljava/lang/StringBuilder;

    .line 529
    .line 530
    invoke-direct {v9, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v4

    .line 540
    invoke-static {v8, v4, v7}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 541
    .line 542
    .line 543
    invoke-virtual {v7}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v4

    .line 547
    if-nez v4, :cond_10

    .line 548
    .line 549
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 550
    .line 551
    .line 552
    move-result-object v4

    .line 553
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v4

    .line 557
    goto :goto_d

    .line 558
    :catchall_9
    move-exception p0

    .line 559
    goto :goto_f

    .line 560
    :cond_10
    :goto_d
    invoke-virtual {v1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v1

    .line 564
    invoke-static {v1, v2}, Lpg1;->β(Ljava/lang/String;I)Lmg1;

    .line 565
    .line 566
    .line 567
    move-result-object v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    .line 568
    goto :goto_c

    .line 569
    :goto_e
    :try_start_c
    new-instance v0, Lii0;

    .line 570
    .line 571
    const/16 v2, 0x10

    .line 572
    .line 573
    invoke-direct {v0, v5, v2, v1}, Lii0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_a

    .line 577
    .line 578
    .line 579
    :catchall_a
    return-void

    .line 580
    :goto_f
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 581
    .line 582
    .line 583
    throw p0

    .line 584
    nop

    .line 585
    :pswitch_data_0
    .packed-switch 0x0
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
