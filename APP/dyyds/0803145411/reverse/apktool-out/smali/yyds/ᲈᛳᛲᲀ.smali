.class public final Lyyds/ᲈᛳᛲᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᲈᲁ:I

.field public final ᛲᛲᲈᲈ:Ljava/util/ArrayList;

.field public ᛲᛳᛶᲁ:I

.field public ᛲᛴᛳᛲ:Ljava/lang/CharSequence;

.field public final ᛲᲈᲁ:Landroid/content/Context;

.field public final ᛵᛸᛸᛷ:Ljava/util/ArrayList;

.field public ᛶᛷᛲᲁ:I

.field public final ᛷᛲᲈᛱ:Ljava/lang/String;

.field public final ᛷᛵᲇᲀ:Landroid/app/Notification;

.field public ᛷᲈᲈᲁ:Landroid/os/Bundle;

.field public final ᲀᛲᛳᲀ:Ljava/util/ArrayList;

.field public ᲇᲇᲇᛱ:Ljava/lang/CharSequence;

.field public final ᲇᲈᛵᛷ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

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
    iput-object v0, p0, Lyyds/ᲈᛳᛲᲀ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lyyds/ᲈᛳᛲᲀ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lyyds/ᲈᛳᛲᲀ;->ᲇᲈᛵᛷ:Ljava/util/ArrayList;

    .line 24
    .line 25
    new-instance v0, Landroid/app/Notification;

    .line 26
    .line 27
    invoke-direct {v0}, Landroid/app/Notification;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lyyds/ᲈᛳᛲᲀ;->ᛷᛵᲇᲀ:Landroid/app/Notification;

    .line 31
    .line 32
    iput-object p1, p0, Lyyds/ᲈᛳᛲᲀ;->ᛲᲈᲁ:Landroid/content/Context;

    .line 33
    .line 34
    iput-object p2, p0, Lyyds/ᲈᛳᛲᲀ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 37
    .line 38
    .line 39
    move-result-wide p1

    .line 40
    iput-wide p1, v0, Landroid/app/Notification;->when:J

    .line 41
    .line 42
    const/4 p1, -0x1

    .line 43
    iput p1, v0, Landroid/app/Notification;->audioStreamType:I

    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    iput p1, p0, Lyyds/ᲈᛳᛲᲀ;->ᛶᛷᛲᲁ:I

    .line 47
    .line 48
    new-instance p1, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lyyds/ᲈᛳᛲᲀ;->ᛲᛲᲈᲈ:Ljava/util/ArrayList;

    .line 54
    .line 55
    return-void
.end method

.method public static ᛵᛸᛸᛷ(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x1400

    .line 6
    .line 7
    if-le v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_0
    return-object p0
.end method


# virtual methods
.method public final ᛲᲈᲁ()Landroid/app/Notification;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Landroid/os/Bundle;

    .line 4
    .line 5
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Landroid/app/Notification$Builder;

    .line 9
    .line 10
    iget-object v3, v0, Lyyds/ᲈᛳᛲᲀ;->ᛲᲈᲁ:Landroid/content/Context;

    .line 11
    .line 12
    iget-object v4, v0, Lyyds/ᲈᛳᛲᲀ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 13
    .line 14
    invoke-direct {v2, v3, v4}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v3, v0, Lyyds/ᲈᛳᛲᲀ;->ᛷᛵᲇᲀ:Landroid/app/Notification;

    .line 18
    .line 19
    iget-wide v5, v3, Landroid/app/Notification;->when:J

    .line 20
    .line 21
    invoke-virtual {v2, v5, v6}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    iget v6, v3, Landroid/app/Notification;->icon:I

    .line 26
    .line 27
    iget v7, v3, Landroid/app/Notification;->iconLevel:I

    .line 28
    .line 29
    invoke-virtual {v5, v6, v7}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    iget-object v6, v3, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 34
    .line 35
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    iget-object v6, v3, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 40
    .line 41
    const/4 v7, 0x0

    .line 42
    invoke-virtual {v5, v6, v7}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    iget-object v6, v3, Landroid/app/Notification;->vibrate:[J

    .line 47
    .line 48
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    iget v6, v3, Landroid/app/Notification;->ledARGB:I

    .line 53
    .line 54
    iget v8, v3, Landroid/app/Notification;->ledOnMS:I

    .line 55
    .line 56
    iget v9, v3, Landroid/app/Notification;->ledOffMS:I

    .line 57
    .line 58
    invoke-virtual {v5, v6, v8, v9}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    iget v6, v3, Landroid/app/Notification;->flags:I

    .line 63
    .line 64
    const/4 v8, 0x2

    .line 65
    and-int/2addr v6, v8

    .line 66
    const/4 v9, 0x1

    .line 67
    const/4 v10, 0x0

    .line 68
    if-eqz v6, :cond_0

    .line 69
    .line 70
    move v6, v9

    .line 71
    goto :goto_0

    .line 72
    :cond_0
    move v6, v10

    .line 73
    :goto_0
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    iget v6, v3, Landroid/app/Notification;->flags:I

    .line 78
    .line 79
    and-int/lit8 v6, v6, 0x8

    .line 80
    .line 81
    if-eqz v6, :cond_1

    .line 82
    .line 83
    move v6, v9

    .line 84
    goto :goto_1

    .line 85
    :cond_1
    move v6, v10

    .line 86
    :goto_1
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    iget v6, v3, Landroid/app/Notification;->flags:I

    .line 91
    .line 92
    and-int/lit8 v6, v6, 0x10

    .line 93
    .line 94
    if-eqz v6, :cond_2

    .line 95
    .line 96
    move v6, v9

    .line 97
    goto :goto_2

    .line 98
    :cond_2
    move v6, v10

    .line 99
    :goto_2
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    iget v6, v3, Landroid/app/Notification;->defaults:I

    .line 104
    .line 105
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    iget-object v6, v0, Lyyds/ᲈᛳᛲᲀ;->ᛲᛴᛳᛲ:Ljava/lang/CharSequence;

    .line 110
    .line 111
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    iget-object v6, v0, Lyyds/ᲈᛳᛲᲀ;->ᲇᲇᲇᛱ:Ljava/lang/CharSequence;

    .line 116
    .line 117
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    invoke-virtual {v5, v7}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-virtual {v5, v7}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    iget-object v6, v3, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 130
    .line 131
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    iget v6, v3, Landroid/app/Notification;->flags:I

    .line 136
    .line 137
    and-int/lit16 v6, v6, 0x80

    .line 138
    .line 139
    if-eqz v6, :cond_3

    .line 140
    .line 141
    move v6, v9

    .line 142
    goto :goto_3

    .line 143
    :cond_3
    move v6, v10

    .line 144
    :goto_3
    invoke-virtual {v5, v7, v6}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    invoke-virtual {v5, v10}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    iget v6, v0, Lyyds/ᲈᛳᛲᲀ;->ᛱᲈᲁ:I

    .line 153
    .line 154
    iget v11, v0, Lyyds/ᲈᛳᛲᲀ;->ᛲᛳᛶᲁ:I

    .line 155
    .line 156
    invoke-virtual {v5, v6, v11, v10}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/drawable/Icon;)Landroid/app/Notification$Builder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setSubText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    invoke-virtual {v5, v10}, Landroid/app/Notification$Builder;->setUsesChronometer(Z)Landroid/app/Notification$Builder;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    iget v6, v0, Lyyds/ᲈᛳᛲᲀ;->ᛶᛷᛲᲁ:I

    .line 171
    .line 172
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 173
    .line 174
    .line 175
    iget-object v5, v0, Lyyds/ᲈᛳᛲᲀ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 176
    .line 177
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    const-string v11, "android.support.allowGeneratedReplies"

    .line 186
    .line 187
    if-eqz v6, :cond_11

    .line 188
    .line 189
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    check-cast v6, Lyyds/ᛳᛵᛱᲇ;

    .line 194
    .line 195
    iget-object v12, v6, Lyyds/ᛳᛵᛱᲇ;->ᛵᛸᛸᛷ:Landroidx/core/graphics/drawable/IconCompat;

    .line 196
    .line 197
    if-nez v12, :cond_4

    .line 198
    .line 199
    iget v13, v6, Lyyds/ᛳᛵᛱᲇ;->ᲇᲈᛵᛷ:I

    .line 200
    .line 201
    if-eqz v13, :cond_4

    .line 202
    .line 203
    invoke-static {v13}, Landroidx/core/graphics/drawable/IconCompat;->ᛲᲈᲁ(I)Landroidx/core/graphics/drawable/IconCompat;

    .line 204
    .line 205
    .line 206
    move-result-object v12

    .line 207
    iput-object v12, v6, Lyyds/ᛳᛵᛱᲇ;->ᛵᛸᛸᛷ:Landroidx/core/graphics/drawable/IconCompat;

    .line 208
    .line 209
    :cond_4
    iget-object v13, v6, Lyyds/ᛳᛵᛱᲇ;->ᛲᲈᲁ:Landroid/os/Bundle;

    .line 210
    .line 211
    new-instance v14, Landroid/app/Notification$Action$Builder;

    .line 212
    .line 213
    if-eqz v12, :cond_d

    .line 214
    .line 215
    iget v15, v12, Landroidx/core/graphics/drawable/IconCompat;->ᛲᲈᲁ:I

    .line 216
    .line 217
    move-object/from16 v16, v7

    .line 218
    .line 219
    const/4 v7, -0x1

    .line 220
    packed-switch v15, :pswitch_data_0

    .line 221
    .line 222
    .line 223
    :pswitch_0
    const-string v0, "Unknown type"

    .line 224
    .line 225
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    return-object v16

    .line 229
    :pswitch_1
    if-ne v15, v7, :cond_5

    .line 230
    .line 231
    iget-object v7, v12, Landroidx/core/graphics/drawable/IconCompat;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v7, Landroid/graphics/drawable/Icon;

    .line 234
    .line 235
    invoke-virtual {v7}, Landroid/graphics/drawable/Icon;->getUri()Landroid/net/Uri;

    .line 236
    .line 237
    .line 238
    move-result-object v7

    .line 239
    goto :goto_6

    .line 240
    :cond_5
    const/4 v7, 0x4

    .line 241
    if-eq v15, v7, :cond_7

    .line 242
    .line 243
    const/4 v7, 0x6

    .line 244
    if-ne v15, v7, :cond_6

    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_6
    const-string v0, "called getUri() on "

    .line 248
    .line 249
    invoke-static {v12, v0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛲᲈᛱ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    return-object v16

    .line 253
    :cond_7
    :goto_5
    iget-object v7, v12, Landroidx/core/graphics/drawable/IconCompat;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v7, Ljava/lang/String;

    .line 256
    .line 257
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    :goto_6
    invoke-static {v7}, Landroid/graphics/drawable/Icon;->createWithAdaptiveBitmapContentUri(Landroid/net/Uri;)Landroid/graphics/drawable/Icon;

    .line 262
    .line 263
    .line 264
    move-result-object v7

    .line 265
    :goto_7
    move/from16 v17, v10

    .line 266
    .line 267
    goto :goto_a

    .line 268
    :pswitch_2
    iget-object v7, v12, Landroidx/core/graphics/drawable/IconCompat;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v7, Landroid/graphics/Bitmap;

    .line 271
    .line 272
    invoke-static {v7}, Landroid/graphics/drawable/Icon;->createWithAdaptiveBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;

    .line 273
    .line 274
    .line 275
    move-result-object v7

    .line 276
    goto :goto_7

    .line 277
    :pswitch_3
    iget-object v7, v12, Landroidx/core/graphics/drawable/IconCompat;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v7, Ljava/lang/String;

    .line 280
    .line 281
    invoke-static {v7}, Landroid/graphics/drawable/Icon;->createWithContentUri(Ljava/lang/String;)Landroid/graphics/drawable/Icon;

    .line 282
    .line 283
    .line 284
    move-result-object v7

    .line 285
    goto :goto_7

    .line 286
    :pswitch_4
    iget-object v7, v12, Landroidx/core/graphics/drawable/IconCompat;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v7, [B

    .line 289
    .line 290
    iget v15, v12, Landroidx/core/graphics/drawable/IconCompat;->ᛲᛴᛳᛲ:I

    .line 291
    .line 292
    move/from16 v17, v10

    .line 293
    .line 294
    iget v10, v12, Landroidx/core/graphics/drawable/IconCompat;->ᲇᲇᲇᛱ:I

    .line 295
    .line 296
    invoke-static {v7, v15, v10}, Landroid/graphics/drawable/Icon;->createWithData([BII)Landroid/graphics/drawable/Icon;

    .line 297
    .line 298
    .line 299
    move-result-object v7

    .line 300
    goto :goto_a

    .line 301
    :pswitch_5
    move/from16 v17, v10

    .line 302
    .line 303
    if-ne v15, v7, :cond_8

    .line 304
    .line 305
    iget-object v7, v12, Landroidx/core/graphics/drawable/IconCompat;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v7, Landroid/graphics/drawable/Icon;

    .line 308
    .line 309
    invoke-virtual {v7}, Landroid/graphics/drawable/Icon;->getResPackage()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v7

    .line 313
    goto :goto_9

    .line 314
    :cond_8
    if-ne v15, v8, :cond_b

    .line 315
    .line 316
    iget-object v10, v12, Landroidx/core/graphics/drawable/IconCompat;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 317
    .line 318
    if-eqz v10, :cond_a

    .line 319
    .line 320
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 321
    .line 322
    .line 323
    move-result v10

    .line 324
    if-eqz v10, :cond_9

    .line 325
    .line 326
    goto :goto_8

    .line 327
    :cond_9
    iget-object v7, v12, Landroidx/core/graphics/drawable/IconCompat;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 328
    .line 329
    goto :goto_9

    .line 330
    :cond_a
    :goto_8
    iget-object v10, v12, Landroidx/core/graphics/drawable/IconCompat;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v10, Ljava/lang/String;

    .line 333
    .line 334
    const-string v15, ":"

    .line 335
    .line 336
    invoke-virtual {v10, v15, v7}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v7

    .line 340
    aget-object v7, v7, v17

    .line 341
    .line 342
    :goto_9
    iget v10, v12, Landroidx/core/graphics/drawable/IconCompat;->ᛲᛴᛳᛲ:I

    .line 343
    .line 344
    invoke-static {v7, v10}, Landroid/graphics/drawable/Icon;->createWithResource(Ljava/lang/String;I)Landroid/graphics/drawable/Icon;

    .line 345
    .line 346
    .line 347
    move-result-object v7

    .line 348
    goto :goto_a

    .line 349
    :cond_b
    const-string v0, "called getResPackage() on "

    .line 350
    .line 351
    invoke-static {v12, v0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛲᲈᛱ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    return-object v16

    .line 355
    :pswitch_6
    move/from16 v17, v10

    .line 356
    .line 357
    iget-object v7, v12, Landroidx/core/graphics/drawable/IconCompat;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v7, Landroid/graphics/Bitmap;

    .line 360
    .line 361
    invoke-static {v7}, Landroid/graphics/drawable/Icon;->createWithBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;

    .line 362
    .line 363
    .line 364
    move-result-object v7

    .line 365
    :goto_a
    iget-object v10, v12, Landroidx/core/graphics/drawable/IconCompat;->ᛶᛷᛲᲁ:Landroid/content/res/ColorStateList;

    .line 366
    .line 367
    if-eqz v10, :cond_c

    .line 368
    .line 369
    invoke-virtual {v7, v10}, Landroid/graphics/drawable/Icon;->setTintList(Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/Icon;

    .line 370
    .line 371
    .line 372
    :cond_c
    iget-object v10, v12, Landroidx/core/graphics/drawable/IconCompat;->ᛱᲈᲁ:Landroid/graphics/PorterDuff$Mode;

    .line 373
    .line 374
    sget-object v12, Landroidx/core/graphics/drawable/IconCompat;->ᛷᛲᲈᛱ:Landroid/graphics/PorterDuff$Mode;

    .line 375
    .line 376
    if-eq v10, v12, :cond_e

    .line 377
    .line 378
    invoke-virtual {v7, v10}, Landroid/graphics/drawable/Icon;->setTintMode(Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/drawable/Icon;

    .line 379
    .line 380
    .line 381
    goto :goto_b

    .line 382
    :pswitch_7
    move/from16 v17, v10

    .line 383
    .line 384
    iget-object v7, v12, Landroidx/core/graphics/drawable/IconCompat;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast v7, Landroid/graphics/drawable/Icon;

    .line 387
    .line 388
    goto :goto_b

    .line 389
    :cond_d
    move-object/from16 v16, v7

    .line 390
    .line 391
    move/from16 v17, v10

    .line 392
    .line 393
    :cond_e
    :goto_b
    iget-object v10, v6, Lyyds/ᛳᛵᛱᲇ;->ᛲᛴᛳᛲ:Ljava/lang/CharSequence;

    .line 394
    .line 395
    iget-object v12, v6, Lyyds/ᛳᛵᛱᲇ;->ᲇᲇᲇᛱ:Landroid/app/PendingIntent;

    .line 396
    .line 397
    invoke-direct {v14, v7, v10, v12}, Landroid/app/Notification$Action$Builder;-><init>(Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 398
    .line 399
    .line 400
    new-instance v7, Landroid/os/Bundle;

    .line 401
    .line 402
    invoke-direct {v7, v13}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v7, v11, v9}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v14, v9}, Landroid/app/Notification$Action$Builder;->setAllowGeneratedReplies(Z)Landroid/app/Notification$Action$Builder;

    .line 409
    .line 410
    .line 411
    const-string v10, "android.support.action.semanticAction"

    .line 412
    .line 413
    move/from16 v11, v17

    .line 414
    .line 415
    invoke-virtual {v7, v10, v11}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v14, v11}, Landroid/app/Notification$Action$Builder;->setSemanticAction(I)Landroid/app/Notification$Action$Builder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v14, v11}, Landroid/app/Notification$Action$Builder;->setContextual(Z)Landroid/app/Notification$Action$Builder;

    .line 422
    .line 423
    .line 424
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 425
    .line 426
    const/16 v11, 0x1f

    .line 427
    .line 428
    if-lt v10, v11, :cond_f

    .line 429
    .line 430
    invoke-static {v14}, Lyyds/ᛵᛵᛸᲇ;->ᛲᲈᲁ(Landroid/app/Notification$Action$Builder;)V

    .line 431
    .line 432
    .line 433
    :cond_f
    const/16 v11, 0x25

    .line 434
    .line 435
    if-lt v10, v11, :cond_10

    .line 436
    .line 437
    invoke-static {v14}, Lyyds/ᲁᲈᲀᛲ;->ᛲᲈᲁ(Landroid/app/Notification$Action$Builder;)V

    .line 438
    .line 439
    .line 440
    invoke-static {v14}, Lyyds/ᲁᲈᲀᛲ;->ᛵᛸᛸᛷ(Landroid/app/Notification$Action$Builder;)V

    .line 441
    .line 442
    .line 443
    :cond_10
    const-string v10, "android.support.action.showsUserInterface"

    .line 444
    .line 445
    iget-boolean v6, v6, Lyyds/ᛳᛵᛱᲇ;->ᲀᛲᛳᲀ:Z

    .line 446
    .line 447
    invoke-virtual {v7, v10, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v14, v7}, Landroid/app/Notification$Action$Builder;->addExtras(Landroid/os/Bundle;)Landroid/app/Notification$Action$Builder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v14}, Landroid/app/Notification$Action$Builder;->build()Landroid/app/Notification$Action;

    .line 454
    .line 455
    .line 456
    move-result-object v6

    .line 457
    invoke-virtual {v2, v6}, Landroid/app/Notification$Builder;->addAction(Landroid/app/Notification$Action;)Landroid/app/Notification$Builder;

    .line 458
    .line 459
    .line 460
    move-object/from16 v7, v16

    .line 461
    .line 462
    const/4 v10, 0x0

    .line 463
    goto/16 :goto_4

    .line 464
    .line 465
    :cond_11
    move-object/from16 v16, v7

    .line 466
    .line 467
    iget-object v5, v0, Lyyds/ᲈᛳᛲᲀ;->ᛷᲈᲈᲁ:Landroid/os/Bundle;

    .line 468
    .line 469
    if-eqz v5, :cond_12

    .line 470
    .line 471
    invoke-virtual {v1, v5}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 472
    .line 473
    .line 474
    :cond_12
    invoke-virtual {v2, v9}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 475
    .line 476
    .line 477
    const/4 v5, 0x0

    .line 478
    invoke-virtual {v2, v5}, Landroid/app/Notification$Builder;->setLocalOnly(Z)Landroid/app/Notification$Builder;

    .line 479
    .line 480
    .line 481
    move-object/from16 v6, v16

    .line 482
    .line 483
    invoke-virtual {v2, v6}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v2, v6}, Landroid/app/Notification$Builder;->setSortKey(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v2, v5}, Landroid/app/Notification$Builder;->setGroupSummary(Z)Landroid/app/Notification$Builder;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v2, v6}, Landroid/app/Notification$Builder;->setCategory(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v2, v5}, Landroid/app/Notification$Builder;->setColor(I)Landroid/app/Notification$Builder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v2, v5}, Landroid/app/Notification$Builder;->setVisibility(I)Landroid/app/Notification$Builder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v2, v6}, Landroid/app/Notification$Builder;->setPublicVersion(Landroid/app/Notification;)Landroid/app/Notification$Builder;

    .line 502
    .line 503
    .line 504
    iget-object v5, v3, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 505
    .line 506
    iget-object v3, v3, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    .line 507
    .line 508
    invoke-virtual {v2, v5, v3}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)Landroid/app/Notification$Builder;

    .line 509
    .line 510
    .line 511
    iget-object v3, v0, Lyyds/ᲈᛳᛲᲀ;->ᛲᛲᲈᲈ:Ljava/util/ArrayList;

    .line 512
    .line 513
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 514
    .line 515
    .line 516
    move-result v5

    .line 517
    if-nez v5, :cond_13

    .line 518
    .line 519
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 520
    .line 521
    .line 522
    move-result-object v3

    .line 523
    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 524
    .line 525
    .line 526
    move-result v5

    .line 527
    if-eqz v5, :cond_13

    .line 528
    .line 529
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v5

    .line 533
    check-cast v5, Ljava/lang/String;

    .line 534
    .line 535
    invoke-virtual {v2, v5}, Landroid/app/Notification$Builder;->addPerson(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 536
    .line 537
    .line 538
    goto :goto_c

    .line 539
    :cond_13
    iget-object v3, v0, Lyyds/ᲈᛳᛲᲀ;->ᲇᲈᛵᛷ:Ljava/util/ArrayList;

    .line 540
    .line 541
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 542
    .line 543
    .line 544
    move-result v5

    .line 545
    if-lez v5, :cond_1a

    .line 546
    .line 547
    iget-object v5, v0, Lyyds/ᲈᛳᛲᲀ;->ᛷᲈᲈᲁ:Landroid/os/Bundle;

    .line 548
    .line 549
    if-nez v5, :cond_14

    .line 550
    .line 551
    new-instance v5, Landroid/os/Bundle;

    .line 552
    .line 553
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 554
    .line 555
    .line 556
    iput-object v5, v0, Lyyds/ᲈᛳᛲᲀ;->ᛷᲈᲈᲁ:Landroid/os/Bundle;

    .line 557
    .line 558
    :cond_14
    const-string v6, "android.car.EXTENSIONS"

    .line 559
    .line 560
    invoke-virtual {v5, v6}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 561
    .line 562
    .line 563
    move-result-object v5

    .line 564
    if-nez v5, :cond_15

    .line 565
    .line 566
    new-instance v5, Landroid/os/Bundle;

    .line 567
    .line 568
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 569
    .line 570
    .line 571
    :cond_15
    new-instance v7, Landroid/os/Bundle;

    .line 572
    .line 573
    invoke-direct {v7, v5}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 574
    .line 575
    .line 576
    new-instance v8, Landroid/os/Bundle;

    .line 577
    .line 578
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 579
    .line 580
    .line 581
    const/4 v10, 0x0

    .line 582
    :goto_d
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 583
    .line 584
    .line 585
    move-result v12

    .line 586
    if-ge v10, v12, :cond_18

    .line 587
    .line 588
    invoke-static {v10}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v12

    .line 592
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v13

    .line 596
    check-cast v13, Lyyds/ᛳᛵᛱᲇ;

    .line 597
    .line 598
    new-instance v14, Landroid/os/Bundle;

    .line 599
    .line 600
    invoke-direct {v14}, Landroid/os/Bundle;-><init>()V

    .line 601
    .line 602
    .line 603
    iget-object v15, v13, Lyyds/ᛳᛵᛱᲇ;->ᛵᛸᛸᛷ:Landroidx/core/graphics/drawable/IconCompat;

    .line 604
    .line 605
    if-nez v15, :cond_16

    .line 606
    .line 607
    iget v9, v13, Lyyds/ᛳᛵᛱᲇ;->ᲇᲈᛵᛷ:I

    .line 608
    .line 609
    if-eqz v9, :cond_16

    .line 610
    .line 611
    invoke-static {v9}, Landroidx/core/graphics/drawable/IconCompat;->ᛲᲈᲁ(I)Landroidx/core/graphics/drawable/IconCompat;

    .line 612
    .line 613
    .line 614
    move-result-object v15

    .line 615
    iput-object v15, v13, Lyyds/ᛳᛵᛱᲇ;->ᛵᛸᛸᛷ:Landroidx/core/graphics/drawable/IconCompat;

    .line 616
    .line 617
    :cond_16
    iget-object v9, v13, Lyyds/ᛳᛵᛱᲇ;->ᛲᲈᲁ:Landroid/os/Bundle;

    .line 618
    .line 619
    if-eqz v15, :cond_17

    .line 620
    .line 621
    invoke-virtual {v15}, Landroidx/core/graphics/drawable/IconCompat;->ᛵᛸᛸᛷ()I

    .line 622
    .line 623
    .line 624
    move-result v15

    .line 625
    :goto_e
    move-object/from16 v18, v3

    .line 626
    .line 627
    goto :goto_f

    .line 628
    :cond_17
    const/4 v15, 0x0

    .line 629
    goto :goto_e

    .line 630
    :goto_f
    const-string v3, "icon"

    .line 631
    .line 632
    invoke-virtual {v14, v3, v15}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 633
    .line 634
    .line 635
    const-string v3, "title"

    .line 636
    .line 637
    iget-object v15, v13, Lyyds/ᛳᛵᛱᲇ;->ᛲᛴᛳᛲ:Ljava/lang/CharSequence;

    .line 638
    .line 639
    invoke-virtual {v14, v3, v15}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 640
    .line 641
    .line 642
    const-string v3, "actionIntent"

    .line 643
    .line 644
    iget-object v15, v13, Lyyds/ᛳᛵᛱᲇ;->ᲇᲇᲇᛱ:Landroid/app/PendingIntent;

    .line 645
    .line 646
    invoke-virtual {v14, v3, v15}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 647
    .line 648
    .line 649
    new-instance v3, Landroid/os/Bundle;

    .line 650
    .line 651
    invoke-direct {v3, v9}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 652
    .line 653
    .line 654
    const/4 v9, 0x1

    .line 655
    invoke-virtual {v3, v11, v9}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 656
    .line 657
    .line 658
    const-string v9, "extras"

    .line 659
    .line 660
    invoke-virtual {v14, v9, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 661
    .line 662
    .line 663
    const-string v3, "remoteInputs"

    .line 664
    .line 665
    const/4 v9, 0x0

    .line 666
    invoke-virtual {v14, v3, v9}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 667
    .line 668
    .line 669
    const-string v3, "showsUserInterface"

    .line 670
    .line 671
    iget-boolean v9, v13, Lyyds/ᛳᛵᛱᲇ;->ᲀᛲᛳᲀ:Z

    .line 672
    .line 673
    invoke-virtual {v14, v3, v9}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 674
    .line 675
    .line 676
    const-string v3, "semanticAction"

    .line 677
    .line 678
    const/4 v9, 0x0

    .line 679
    invoke-virtual {v14, v3, v9}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 680
    .line 681
    .line 682
    invoke-virtual {v8, v12, v14}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 683
    .line 684
    .line 685
    add-int/lit8 v10, v10, 0x1

    .line 686
    .line 687
    move-object/from16 v3, v18

    .line 688
    .line 689
    const/4 v9, 0x1

    .line 690
    goto :goto_d

    .line 691
    :cond_18
    const-string v3, "invisible_actions"

    .line 692
    .line 693
    invoke-virtual {v5, v3, v8}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 694
    .line 695
    .line 696
    invoke-virtual {v7, v3, v8}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 697
    .line 698
    .line 699
    iget-object v3, v0, Lyyds/ᲈᛳᛲᲀ;->ᛷᲈᲈᲁ:Landroid/os/Bundle;

    .line 700
    .line 701
    if-nez v3, :cond_19

    .line 702
    .line 703
    new-instance v3, Landroid/os/Bundle;

    .line 704
    .line 705
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 706
    .line 707
    .line 708
    iput-object v3, v0, Lyyds/ᲈᛳᛲᲀ;->ᛷᲈᲈᲁ:Landroid/os/Bundle;

    .line 709
    .line 710
    :cond_19
    invoke-virtual {v3, v6, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v1, v6, v7}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 714
    .line 715
    .line 716
    :cond_1a
    iget-object v1, v0, Lyyds/ᲈᛳᛲᲀ;->ᛷᲈᲈᲁ:Landroid/os/Bundle;

    .line 717
    .line 718
    invoke-virtual {v2, v1}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 719
    .line 720
    .line 721
    const/4 v6, 0x0

    .line 722
    invoke-virtual {v2, v6}, Landroid/app/Notification$Builder;->setRemoteInputHistory([Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 723
    .line 724
    .line 725
    const/4 v5, 0x0

    .line 726
    invoke-virtual {v2, v5}, Landroid/app/Notification$Builder;->setBadgeIconType(I)Landroid/app/Notification$Builder;

    .line 727
    .line 728
    .line 729
    invoke-virtual {v2, v6}, Landroid/app/Notification$Builder;->setSettingsText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 730
    .line 731
    .line 732
    invoke-virtual {v2, v6}, Landroid/app/Notification$Builder;->setShortcutId(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 733
    .line 734
    .line 735
    const-wide/16 v7, 0x0

    .line 736
    .line 737
    invoke-virtual {v2, v7, v8}, Landroid/app/Notification$Builder;->setTimeoutAfter(J)Landroid/app/Notification$Builder;

    .line 738
    .line 739
    .line 740
    invoke-virtual {v2, v5}, Landroid/app/Notification$Builder;->setGroupAlertBehavior(I)Landroid/app/Notification$Builder;

    .line 741
    .line 742
    .line 743
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 744
    .line 745
    .line 746
    move-result v1

    .line 747
    if-nez v1, :cond_1b

    .line 748
    .line 749
    invoke-virtual {v2, v6}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    .line 750
    .line 751
    .line 752
    move-result-object v1

    .line 753
    invoke-virtual {v1, v5}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 754
    .line 755
    .line 756
    move-result-object v1

    .line 757
    invoke-virtual {v1, v5, v5, v5}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    .line 758
    .line 759
    .line 760
    move-result-object v1

    .line 761
    invoke-virtual {v1, v6}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 762
    .line 763
    .line 764
    :cond_1b
    iget-object v0, v0, Lyyds/ᲈᛳᛲᲀ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 765
    .line 766
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 767
    .line 768
    .line 769
    move-result-object v0

    .line 770
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 771
    .line 772
    .line 773
    move-result v1

    .line 774
    if-nez v1, :cond_1d

    .line 775
    .line 776
    const/4 v9, 0x1

    .line 777
    invoke-virtual {v2, v9}, Landroid/app/Notification$Builder;->setAllowSystemGeneratedContextualActions(Z)Landroid/app/Notification$Builder;

    .line 778
    .line 779
    .line 780
    invoke-virtual {v2, v6}, Landroid/app/Notification$Builder;->setBubbleMetadata(Landroid/app/Notification$BubbleMetadata;)Landroid/app/Notification$Builder;

    .line 781
    .line 782
    .line 783
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 784
    .line 785
    const/16 v1, 0x24

    .line 786
    .line 787
    if-lt v0, v1, :cond_1c

    .line 788
    .line 789
    invoke-static {v2}, Lyyds/ᛶᛵᲁᲈ;->ᛲᛴᛳᛲ(Landroid/app/Notification$Builder;)V

    .line 790
    .line 791
    .line 792
    :cond_1c
    invoke-virtual {v2}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 793
    .line 794
    .line 795
    move-result-object v0

    .line 796
    return-object v0

    .line 797
    :cond_1d
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 802
    .line 803
    .line 804
    invoke-static {}, Lyyds/ᛱᛸᛶᛲ;->ᛲᲈᲁ()V

    .line 805
    .line 806
    .line 807
    const/16 v16, 0x0

    .line 808
    .line 809
    return-object v16

    .line 810
    nop

    .line 811
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
