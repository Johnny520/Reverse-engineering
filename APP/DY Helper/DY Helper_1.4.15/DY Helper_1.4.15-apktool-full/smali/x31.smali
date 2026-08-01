.class public final Lx31;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Landroid/content/Context;

.field public final β:Ljava/util/ArrayList;

.field public final γ:Ljava/util/ArrayList;

.field public final δ:Ljava/util/ArrayList;

.field public ε:Ljava/lang/CharSequence;

.field public ζ:Ljava/lang/CharSequence;

.field public final η:Z

.field public θ:I

.field public ι:I

.field public κ:Z

.field public λ:Landroid/os/Bundle;

.field public final μ:Ljava/lang/String;

.field public final ν:Z

.field public final ξ:Landroid/app/Notification;

.field public ο:Z

.field public final π:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lx31;->β:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lx31;->γ:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lx31;->δ:Ljava/util/ArrayList;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Lx31;->η:Z

    .line 27
    .line 28
    new-instance v1, Landroid/app/Notification;

    .line 29
    .line 30
    invoke-direct {v1}, Landroid/app/Notification;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Lx31;->ξ:Landroid/app/Notification;

    .line 34
    .line 35
    iput-object p1, p0, Lx31;->α:Landroid/content/Context;

    .line 36
    .line 37
    const-string p1, "dyhelper_download"

    .line 38
    .line 39
    iput-object p1, p0, Lx31;->μ:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    iput-wide v2, v1, Landroid/app/Notification;->when:J

    .line 46
    .line 47
    const/4 p1, -0x1

    .line 48
    iput p1, v1, Landroid/app/Notification;->audioStreamType:I

    .line 49
    .line 50
    new-instance p1, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lx31;->π:Ljava/util/ArrayList;

    .line 56
    .line 57
    iput-boolean v0, p0, Lx31;->ν:Z

    .line 58
    .line 59
    return-void
.end method

.method public static β(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/16 v1, 0x1400

    .line 9
    .line 10
    if-le v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_1
    return-object p0
.end method


# virtual methods
.method public final α()Landroid/app/Notification;
    .locals 13

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Landroid/app/Notification$Builder;

    .line 12
    .line 13
    iget-object v2, p0, Lx31;->α:Landroid/content/Context;

    .line 14
    .line 15
    iget-object v3, p0, Lx31;->μ:Ljava/lang/String;

    .line 16
    .line 17
    invoke-direct {v1, v2, v3}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, Lx31;->ξ:Landroid/app/Notification;

    .line 21
    .line 22
    iget-wide v4, v2, Landroid/app/Notification;->when:J

    .line 23
    .line 24
    invoke-virtual {v1, v4, v5}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    iget v5, v2, Landroid/app/Notification;->icon:I

    .line 29
    .line 30
    iget v6, v2, Landroid/app/Notification;->iconLevel:I

    .line 31
    .line 32
    invoke-virtual {v4, v5, v6}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    iget-object v5, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 37
    .line 38
    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    iget-object v5, v2, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 43
    .line 44
    const/4 v6, 0x0

    .line 45
    invoke-virtual {v4, v5, v6}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    iget-object v5, v2, Landroid/app/Notification;->vibrate:[J

    .line 50
    .line 51
    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    iget v5, v2, Landroid/app/Notification;->ledARGB:I

    .line 56
    .line 57
    iget v7, v2, Landroid/app/Notification;->ledOnMS:I

    .line 58
    .line 59
    iget v8, v2, Landroid/app/Notification;->ledOffMS:I

    .line 60
    .line 61
    invoke-virtual {v4, v5, v7, v8}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    iget v5, v2, Landroid/app/Notification;->flags:I

    .line 66
    .line 67
    and-int/lit8 v5, v5, 0x2

    .line 68
    .line 69
    const/4 v7, 0x1

    .line 70
    const/4 v8, 0x0

    .line 71
    if-eqz v5, :cond_0

    .line 72
    .line 73
    move v5, v7

    .line 74
    goto :goto_0

    .line 75
    :cond_0
    move v5, v8

    .line 76
    :goto_0
    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    iget v5, v2, Landroid/app/Notification;->flags:I

    .line 81
    .line 82
    and-int/lit8 v5, v5, 0x8

    .line 83
    .line 84
    if-eqz v5, :cond_1

    .line 85
    .line 86
    move v5, v7

    .line 87
    goto :goto_1

    .line 88
    :cond_1
    move v5, v8

    .line 89
    :goto_1
    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    iget v5, v2, Landroid/app/Notification;->flags:I

    .line 94
    .line 95
    and-int/lit8 v5, v5, 0x10

    .line 96
    .line 97
    if-eqz v5, :cond_2

    .line 98
    .line 99
    move v5, v7

    .line 100
    goto :goto_2

    .line 101
    :cond_2
    move v5, v8

    .line 102
    :goto_2
    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    iget v5, v2, Landroid/app/Notification;->defaults:I

    .line 107
    .line 108
    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    iget-object v5, p0, Lx31;->ε:Ljava/lang/CharSequence;

    .line 113
    .line 114
    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    iget-object v5, p0, Lx31;->ζ:Ljava/lang/CharSequence;

    .line 119
    .line 120
    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    invoke-virtual {v4, v6}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-virtual {v4, v6}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    iget-object v5, v2, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 133
    .line 134
    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    iget v5, v2, Landroid/app/Notification;->flags:I

    .line 139
    .line 140
    and-int/lit16 v5, v5, 0x80

    .line 141
    .line 142
    if-eqz v5, :cond_3

    .line 143
    .line 144
    move v5, v7

    .line 145
    goto :goto_3

    .line 146
    :cond_3
    move v5, v8

    .line 147
    :goto_3
    invoke-virtual {v4, v6, v5}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    invoke-virtual {v4, v8}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    iget v5, p0, Lx31;->θ:I

    .line 156
    .line 157
    iget v9, p0, Lx31;->ι:I

    .line 158
    .line 159
    iget-boolean v10, p0, Lx31;->κ:Z

    .line 160
    .line 161
    invoke-virtual {v4, v5, v9, v10}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, v6}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/drawable/Icon;)Landroid/app/Notification$Builder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, v6}, Landroid/app/Notification$Builder;->setSubText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    invoke-virtual {v4, v8}, Landroid/app/Notification$Builder;->setUsesChronometer(Z)Landroid/app/Notification$Builder;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    invoke-virtual {v4, v8}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 176
    .line 177
    .line 178
    iget-object v4, p0, Lx31;->β:Ljava/util/ArrayList;

    .line 179
    .line 180
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 185
    .line 186
    .line 187
    move-result v5

    .line 188
    if-nez v5, :cond_11

    .line 189
    .line 190
    iget-object v4, p0, Lx31;->λ:Landroid/os/Bundle;

    .line 191
    .line 192
    if-eqz v4, :cond_4

    .line 193
    .line 194
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 195
    .line 196
    .line 197
    :cond_4
    iget-boolean v4, p0, Lx31;->η:Z

    .line 198
    .line 199
    invoke-virtual {v1, v4}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1, v8}, Landroid/app/Notification$Builder;->setLocalOnly(Z)Landroid/app/Notification$Builder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1, v6}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1, v6}, Landroid/app/Notification$Builder;->setSortKey(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1, v8}, Landroid/app/Notification$Builder;->setGroupSummary(Z)Landroid/app/Notification$Builder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v1, v6}, Landroid/app/Notification$Builder;->setCategory(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1, v8}, Landroid/app/Notification$Builder;->setColor(I)Landroid/app/Notification$Builder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1, v8}, Landroid/app/Notification$Builder;->setVisibility(I)Landroid/app/Notification$Builder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1, v6}, Landroid/app/Notification$Builder;->setPublicVersion(Landroid/app/Notification;)Landroid/app/Notification$Builder;

    .line 224
    .line 225
    .line 226
    iget-object v4, v2, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 227
    .line 228
    iget-object v5, v2, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    .line 229
    .line 230
    invoke-virtual {v1, v4, v5}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)Landroid/app/Notification$Builder;

    .line 231
    .line 232
    .line 233
    iget-object v4, p0, Lx31;->π:Ljava/util/ArrayList;

    .line 234
    .line 235
    if-eqz v4, :cond_5

    .line 236
    .line 237
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    if-nez v5, :cond_5

    .line 242
    .line 243
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 248
    .line 249
    .line 250
    move-result v5

    .line 251
    if-eqz v5, :cond_5

    .line 252
    .line 253
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v5

    .line 257
    check-cast v5, Ljava/lang/String;

    .line 258
    .line 259
    invoke-virtual {v1, v5}, Landroid/app/Notification$Builder;->addPerson(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 260
    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_5
    iget-object v4, p0, Lx31;->δ:Ljava/util/ArrayList;

    .line 264
    .line 265
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 266
    .line 267
    .line 268
    move-result v5

    .line 269
    if-lez v5, :cond_b

    .line 270
    .line 271
    iget-object v5, p0, Lx31;->λ:Landroid/os/Bundle;

    .line 272
    .line 273
    if-nez v5, :cond_6

    .line 274
    .line 275
    new-instance v5, Landroid/os/Bundle;

    .line 276
    .line 277
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 278
    .line 279
    .line 280
    iput-object v5, p0, Lx31;->λ:Landroid/os/Bundle;

    .line 281
    .line 282
    :cond_6
    iget-object v5, p0, Lx31;->λ:Landroid/os/Bundle;

    .line 283
    .line 284
    const-string v9, "android.car.EXTENSIONS"

    .line 285
    .line 286
    invoke-virtual {v5, v9}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 287
    .line 288
    .line 289
    move-result-object v5

    .line 290
    if-nez v5, :cond_7

    .line 291
    .line 292
    new-instance v5, Landroid/os/Bundle;

    .line 293
    .line 294
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 295
    .line 296
    .line 297
    :cond_7
    new-instance v10, Landroid/os/Bundle;

    .line 298
    .line 299
    invoke-direct {v10, v5}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 300
    .line 301
    .line 302
    new-instance v11, Landroid/os/Bundle;

    .line 303
    .line 304
    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 308
    .line 309
    .line 310
    move-result v12

    .line 311
    if-gtz v12, :cond_9

    .line 312
    .line 313
    const-string v4, "invisible_actions"

    .line 314
    .line 315
    invoke-virtual {v5, v4, v11}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v10, v4, v11}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 319
    .line 320
    .line 321
    iget-object v4, p0, Lx31;->λ:Landroid/os/Bundle;

    .line 322
    .line 323
    if-nez v4, :cond_8

    .line 324
    .line 325
    new-instance v4, Landroid/os/Bundle;

    .line 326
    .line 327
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 328
    .line 329
    .line 330
    iput-object v4, p0, Lx31;->λ:Landroid/os/Bundle;

    .line 331
    .line 332
    :cond_8
    iget-object v4, p0, Lx31;->λ:Landroid/os/Bundle;

    .line 333
    .line 334
    invoke-virtual {v4, v9, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0, v9, v10}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 338
    .line 339
    .line 340
    goto :goto_6

    .line 341
    :cond_9
    invoke-static {v8}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object p0

    .line 348
    if-eqz p0, :cond_a

    .line 349
    .line 350
    invoke-static {}, Lγ;->β()V

    .line 351
    .line 352
    .line 353
    :goto_5
    const/4 p0, 0x0

    .line 354
    return-object p0

    .line 355
    :cond_a
    new-instance p0, Landroid/os/Bundle;

    .line 356
    .line 357
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 358
    .line 359
    .line 360
    throw v6

    .line 361
    :cond_b
    :goto_6
    iget-object v0, p0, Lx31;->λ:Landroid/os/Bundle;

    .line 362
    .line 363
    invoke-virtual {v1, v0}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v1, v6}, Landroid/app/Notification$Builder;->setRemoteInputHistory([Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v1, v8}, Landroid/app/Notification$Builder;->setBadgeIconType(I)Landroid/app/Notification$Builder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v1, v6}, Landroid/app/Notification$Builder;->setSettingsText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v1, v6}, Landroid/app/Notification$Builder;->setShortcutId(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 376
    .line 377
    .line 378
    const-wide/16 v4, 0x0

    .line 379
    .line 380
    invoke-virtual {v1, v4, v5}, Landroid/app/Notification$Builder;->setTimeoutAfter(J)Landroid/app/Notification$Builder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v1, v8}, Landroid/app/Notification$Builder;->setGroupAlertBehavior(I)Landroid/app/Notification$Builder;

    .line 384
    .line 385
    .line 386
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 387
    .line 388
    .line 389
    move-result v0

    .line 390
    if-nez v0, :cond_c

    .line 391
    .line 392
    invoke-virtual {v1, v6}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    invoke-virtual {v0, v8}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    invoke-virtual {v0, v8, v8, v8}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    invoke-virtual {v0, v6}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 405
    .line 406
    .line 407
    :cond_c
    iget-object v0, p0, Lx31;->γ:Ljava/util/ArrayList;

    .line 408
    .line 409
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 414
    .line 415
    .line 416
    move-result v3

    .line 417
    if-nez v3, :cond_10

    .line 418
    .line 419
    iget-boolean v0, p0, Lx31;->ν:Z

    .line 420
    .line 421
    invoke-virtual {v1, v0}, Landroid/app/Notification$Builder;->setAllowSystemGeneratedContextualActions(Z)Landroid/app/Notification$Builder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v1, v6}, Landroid/app/Notification$Builder;->setBubbleMetadata(Landroid/app/Notification$BubbleMetadata;)Landroid/app/Notification$Builder;

    .line 425
    .line 426
    .line 427
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 428
    .line 429
    const/16 v3, 0x24

    .line 430
    .line 431
    if-lt v0, v3, :cond_d

    .line 432
    .line 433
    invoke-static {v1}, Lщ;->ε(Landroid/app/Notification$Builder;)V

    .line 434
    .line 435
    .line 436
    :cond_d
    iget-boolean p0, p0, Lx31;->ο:Z

    .line 437
    .line 438
    if-eqz p0, :cond_f

    .line 439
    .line 440
    invoke-virtual {v1, v6}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v1, v6}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    .line 444
    .line 445
    .line 446
    iget p0, v2, Landroid/app/Notification;->defaults:I

    .line 447
    .line 448
    and-int/lit8 p0, p0, -0x4

    .line 449
    .line 450
    iput p0, v2, Landroid/app/Notification;->defaults:I

    .line 451
    .line 452
    invoke-virtual {v1, p0}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 453
    .line 454
    .line 455
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 456
    .line 457
    .line 458
    move-result p0

    .line 459
    if-eqz p0, :cond_e

    .line 460
    .line 461
    const-string p0, "silent"

    .line 462
    .line 463
    invoke-virtual {v1, p0}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 464
    .line 465
    .line 466
    :cond_e
    invoke-virtual {v1, v7}, Landroid/app/Notification$Builder;->setGroupAlertBehavior(I)Landroid/app/Notification$Builder;

    .line 467
    .line 468
    .line 469
    :cond_f
    invoke-virtual {v1}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 470
    .line 471
    .line 472
    move-result-object p0

    .line 473
    return-object p0

    .line 474
    :cond_10
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object p0

    .line 478
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 479
    .line 480
    .line 481
    invoke-static {}, Lγ;->β()V

    .line 482
    .line 483
    .line 484
    goto/16 :goto_5

    .line 485
    .line 486
    :cond_11
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object p0

    .line 490
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    invoke-static {}, Lγ;->β()V

    .line 494
    .line 495
    .line 496
    goto/16 :goto_5
.end method

.method public final γ(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lx31;->ξ:Landroid/app/Notification;

    .line 2
    .line 3
    iget v0, p0, Landroid/app/Notification;->flags:I

    .line 4
    .line 5
    or-int/2addr p1, v0

    .line 6
    iput p1, p0, Landroid/app/Notification;->flags:I

    .line 7
    .line 8
    return-void
.end method
