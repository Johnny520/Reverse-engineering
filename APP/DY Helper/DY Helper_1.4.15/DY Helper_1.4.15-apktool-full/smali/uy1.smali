.class public final synthetic Luy1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lg80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Lp70;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Landroid/app/Activity;Lp70;I)V
    .locals 0

    .line 1
    iput p4, p0, Luy1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Luy1;->η:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Luy1;->ζ:Landroid/app/Activity;

    .line 6
    .line 7
    iput-object p3, p0, Luy1;->θ:Lp70;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final ε(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Luy1;->ε:I

    .line 2
    .line 3
    sget-object v1, Ls62;->α:Ls62;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, Luy1;->θ:Lp70;

    .line 7
    .line 8
    iget-object v4, p0, Luy1;->ζ:Landroid/app/Activity;

    .line 9
    .line 10
    iget-object p0, p0, Luy1;->η:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, Lly1;

    .line 16
    .line 17
    check-cast v3, Lty1;

    .line 18
    .line 19
    check-cast p1, Lmy1;

    .line 20
    .line 21
    check-cast p2, Ljava/lang/String;

    .line 22
    .line 23
    move-object v0, p3

    .line 24
    check-cast v0, Ljava/lang/Integer;

    .line 25
    .line 26
    move-object/from16 v0, p4

    .line 27
    .line 28
    check-cast v0, Lrd;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    sget-object v5, Lry1;->α:Lry1;

    .line 37
    .line 38
    iget-object v5, p0, Lly1;->α:Ljava/lang/String;

    .line 39
    .line 40
    iget-object p0, p0, Lly1;->β:Ljava/lang/String;

    .line 41
    .line 42
    if-nez v0, :cond_0

    .line 43
    .line 44
    new-instance v0, Lrd;

    .line 45
    .line 46
    invoke-direct {v0}, Lrd;-><init>()V

    .line 47
    .line 48
    .line 49
    :cond_0
    invoke-static {v5, p0, p1, p2, v0}, Lry1;->Щ(Ljava/lang/String;Ljava/lang/String;Lmy1;Ljava/lang/String;Lrd;)Ls62;

    .line 50
    .line 51
    .line 52
    invoke-static {}, Lxa1;->δ()V

    .line 53
    .line 54
    .line 55
    invoke-static {}, Ldd1;->γ()Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    invoke-static {v4, p0}, Ldd1;->ε(Landroid/app/Activity;Z)V

    .line 60
    .line 61
    .line 62
    const-string p0, "\u5206\u7ec4\u89c4\u5219\u5df2\u4fdd\u5b58"

    .line 63
    .line 64
    invoke-static {v4, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3}, Lty1;->invoke()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    return-object v1

    .line 75
    :pswitch_0
    check-cast p0, Lky1;

    .line 76
    .line 77
    check-cast v3, Lcu1;

    .line 78
    .line 79
    check-cast p1, Lmy1;

    .line 80
    .line 81
    check-cast p2, Ljava/lang/String;

    .line 82
    .line 83
    move-object v0, p3

    .line 84
    check-cast v0, Ljava/lang/Integer;

    .line 85
    .line 86
    move-object/from16 v5, p4

    .line 87
    .line 88
    check-cast v5, Lrd;

    .line 89
    .line 90
    sget-object v6, Ljz1;->α:Ljava/util/LinkedHashSet;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    sget-object v6, Lry1;->α:Lry1;

    .line 99
    .line 100
    invoke-static {p0, p1}, Lry1;->Э(Lky1;Lmy1;)V

    .line 101
    .line 102
    .line 103
    invoke-static {}, Lxa1;->δ()V

    .line 104
    .line 105
    .line 106
    if-eqz v5, :cond_2

    .line 107
    .line 108
    iget-wide v6, p0, Lky1;->β:J

    .line 109
    .line 110
    const-wide/16 v8, 0x0

    .line 111
    .line 112
    cmp-long p1, v6, v8

    .line 113
    .line 114
    if-lez p1, :cond_2

    .line 115
    .line 116
    invoke-static {}, Lv81;->θ()Ljava/util/Map;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    invoke-interface {p1, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    check-cast p1, Lsd;

    .line 129
    .line 130
    if-nez p1, :cond_1

    .line 131
    .line 132
    new-instance p1, Lsd;

    .line 133
    .line 134
    invoke-direct {p1, v6, v7}, Lsd;-><init>(J)V

    .line 135
    .line 136
    .line 137
    :cond_1
    iget-object v6, v5, Lrd;->α:Lip1;

    .line 138
    .line 139
    iget-object v7, v5, Lrd;->β:Lip1;

    .line 140
    .line 141
    iget-object v5, v5, Lrd;->γ:Lip1;

    .line 142
    .line 143
    invoke-static {p1, v6, v7, v5}, Lsd;->α(Lsd;Lip1;Lip1;Lip1;)Lsd;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-static {p1}, Lv81;->ο(Lsd;)V

    .line 148
    .line 149
    .line 150
    invoke-static {}, Ldd1;->γ()Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    invoke-static {v4, p1}, Ldd1;->ε(Landroid/app/Activity;Z)V

    .line 155
    .line 156
    .line 157
    :cond_2
    invoke-static {p0, v0}, Lry1;->Ш(Lky1;Ljava/lang/Integer;)V

    .line 158
    .line 159
    .line 160
    const-string p1, "custom_on"

    .line 161
    .line 162
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    if-eqz p1, :cond_3

    .line 167
    .line 168
    const/4 p1, 0x1

    .line 169
    invoke-static {v4, p0, p1}, Ljz1;->ν(Landroid/app/Activity;Lky1;Z)V

    .line 170
    .line 171
    .line 172
    goto/16 :goto_4

    .line 173
    .line 174
    :cond_3
    const-string p1, "custom_off"

    .line 175
    .line 176
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    if-eqz p1, :cond_4

    .line 181
    .line 182
    invoke-static {v4, p0, v2}, Ljz1;->ν(Landroid/app/Activity;Lky1;Z)V

    .line 183
    .line 184
    .line 185
    goto/16 :goto_4

    .line 186
    .line 187
    :cond_4
    invoke-static {}, Ljz1;->λ()Ljava/util/ArrayList;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    new-instance p2, Ljava/util/ArrayList;

    .line 192
    .line 193
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    :cond_5
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-eqz v0, :cond_6

    .line 205
    .line 206
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    move-object v5, v0

    .line 211
    check-cast v5, Ljava/lang/String;

    .line 212
    .line 213
    invoke-static {p0, v5}, Ljz1;->ι(Lky1;Ljava/lang/String;)Z

    .line 214
    .line 215
    .line 216
    move-result v5

    .line 217
    if-nez v5, :cond_5

    .line 218
    .line 219
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    goto :goto_0

    .line 223
    :cond_6
    sget-object p0, Lui1;->α:Ljava/lang/Object;

    .line 224
    .line 225
    new-instance p0, Ljava/util/ArrayList;

    .line 226
    .line 227
    const/16 p1, 0xa

    .line 228
    .line 229
    invoke-static {p2, p1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 230
    .line 231
    .line 232
    move-result p1

    .line 233
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 241
    .line 242
    .line 243
    move-result p2

    .line 244
    if-eqz p2, :cond_7

    .line 245
    .line 246
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object p2

    .line 250
    check-cast p2, Ljava/lang/String;

    .line 251
    .line 252
    invoke-static {p2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 253
    .line 254
    .line 255
    move-result-object p2

    .line 256
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p2

    .line 260
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    goto :goto_1

    .line 264
    :cond_7
    new-instance p1, Ljava/util/ArrayList;

    .line 265
    .line 266
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 267
    .line 268
    .line 269
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    :cond_8
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 274
    .line 275
    .line 276
    move-result p2

    .line 277
    if-eqz p2, :cond_9

    .line 278
    .line 279
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object p2

    .line 283
    move-object v0, p2

    .line 284
    check-cast v0, Ljava/lang/String;

    .line 285
    .line 286
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    if-nez v0, :cond_8

    .line 291
    .line 292
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    goto :goto_2

    .line 296
    :cond_9
    new-instance p0, Ljava/util/HashSet;

    .line 297
    .line 298
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 299
    .line 300
    .line 301
    new-instance v5, Ljava/util/ArrayList;

    .line 302
    .line 303
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 304
    .line 305
    .line 306
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    :cond_a
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 311
    .line 312
    .line 313
    move-result p2

    .line 314
    if-eqz p2, :cond_c

    .line 315
    .line 316
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object p2

    .line 320
    move-object v0, p2

    .line 321
    check-cast v0, Ljava/lang/String;

    .line 322
    .line 323
    invoke-static {v0}, Ljz1;->κ(Ljava/lang/String;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v6

    .line 327
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 328
    .line 329
    .line 330
    move-result v7

    .line 331
    if-eqz v7, :cond_b

    .line 332
    .line 333
    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 334
    .line 335
    invoke-static {v6, v0, v6}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v6

    .line 339
    :cond_b
    invoke-virtual {p0, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v0

    .line 343
    if-eqz v0, :cond_a

    .line 344
    .line 345
    invoke-virtual {v5, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    goto :goto_3

    .line 349
    :cond_c
    const/4 v10, 0x0

    .line 350
    const/16 v11, 0x3e

    .line 351
    .line 352
    const-string v6, "\n"

    .line 353
    .line 354
    const/4 v7, 0x0

    .line 355
    const/4 v8, 0x0

    .line 356
    const/4 v9, 0x0

    .line 357
    invoke-static/range {v5 .. v11}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object p0

    .line 361
    const-string p1, "spark_custom_renew_rules"

    .line 362
    .line 363
    invoke-static {p1, p0}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    :goto_4
    const-string p0, "\u4eba\u5458\u7eed\u706b\u4e0e\u5c0f\u706b\u4eba\u914d\u7f6e\u5df2\u4fdd\u5b58"

    .line 367
    .line 368
    invoke-static {v4, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 369
    .line 370
    .line 371
    move-result-object p0

    .line 372
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v3}, Lcu1;->invoke()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    return-object v1

    .line 379
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
