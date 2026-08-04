.class public final Lyyds/ᛲᲁᛲᛴ;
.super Lyyds/ᛲᛴᲈᲈ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛶᛷᛲᲁ:I


# virtual methods
.method public final ᛵᛸᛸᛷ(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛲᛴᲈᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛷᲈᲈᲀ;

    .line 2
    .line 3
    invoke-interface {v0}, Lyyds/ᛱᛸᲇᛵ;->getArguments()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-string v1, "request_code"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    :goto_0
    if-eq p1, v0, :cond_1

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    iget v0, p0, Lyyds/ᛲᲁᛲᛴ;->ᛶᛷᛲᲁ:I

    .line 21
    .line 22
    if-lez v0, :cond_2

    .line 23
    .line 24
    add-int/lit8 v0, v0, -0x1

    .line 25
    .line 26
    iput v0, p0, Lyyds/ᛲᲁᛲᛴ;->ᛶᛷᛲᲁ:I

    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    sget-object v0, Lyyds/ᛸᲁᛵᛸ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 30
    .line 31
    const-class v0, Lyyds/ᛸᲁᛵᛸ;

    .line 32
    .line 33
    monitor-enter v0

    .line 34
    :try_start_0
    sget-object v1, Lyyds/ᛸᲁᛵᛸ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    monitor-exit v0

    .line 44
    invoke-virtual {p0}, Lyyds/ᛲᛴᲈᲈ;->ᛲᲈᲁ()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    throw p0
.end method

.method public final ᲇᲈᛵᛷ(Landroid/app/Activity;Ljava/util/ArrayList;I)V
    .locals 10

    .line 1
    iget-object v0, p0, Lyyds/ᛲᛴᲈᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛷᲈᲈᲀ;

    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Lyyds/ᛴᛲᛴᛲ;->ᛷᲈᲈᲁ(Landroid/app/Activity;)Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    goto/16 :goto_4

    .line 16
    .line 17
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-eqz v5, :cond_6

    .line 31
    .line 32
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    check-cast v5, Lyyds/ᛲᛴᛷᲁ;

    .line 37
    .line 38
    invoke-virtual {v5}, Lyyds/ᛲᛴᛷᲁ;->ᛲᛴᛳᛲ()I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 43
    .line 44
    if-le v6, v7, :cond_2

    .line 45
    .line 46
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-virtual {v5}, Lyyds/ᛲᛴᛷᲁ;->ᛶᛷᛲᲁ()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    if-eqz v6, :cond_1

    .line 55
    .line 56
    move-object v7, v6

    .line 57
    check-cast v7, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    if-nez v8, :cond_1

    .line 64
    .line 65
    invoke-virtual {v5, p1}, Lyyds/ᛲᛴᛷᲁ;->ᛱᲈᲁ(Landroid/app/Activity;)I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    const/4 v8, 0x2

    .line 70
    if-eq v5, v8, :cond_5

    .line 71
    .line 72
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eqz v5, :cond_3

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    :cond_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    if-eqz v7, :cond_1

    .line 88
    .line 89
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    check-cast v7, Lyyds/ᛲᛴᛷᲁ;

    .line 94
    .line 95
    invoke-virtual {v7, p1}, Lyyds/ᛲᛴᛷᲁ;->ᛱᲈᲁ(Landroid/app/Activity;)I

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    if-ne v7, v8, :cond_4

    .line 100
    .line 101
    :cond_5
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_6
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_7

    .line 110
    .line 111
    invoke-static {p1}, Lyyds/ᛴᛲᛴᛲ;->ᛷᲈᲈᲁ(Landroid/app/Activity;)Ljava/util/ArrayList;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    goto/16 :goto_4

    .line 116
    .line 117
    :cond_7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-ne v4, v3, :cond_8

    .line 122
    .line 123
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    check-cast v1, Lyyds/ᛲᛴᛷᲁ;

    .line 128
    .line 129
    invoke-virtual {v1, p1}, Lyyds/ᛲᛴᛷᲁ;->ᛷᛲᲈᛱ(Landroid/app/Activity;)Ljava/util/ArrayList;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    goto :goto_4

    .line 134
    :cond_8
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    check-cast v4, Lyyds/ᛲᛴᛷᲁ;

    .line 139
    .line 140
    invoke-virtual {v4, p1}, Lyyds/ᛲᛴᛷᲁ;->ᛷᛲᲈᛱ(Landroid/app/Activity;)Ljava/util/ArrayList;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    move v5, v3

    .line 145
    :goto_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    if-ge v5, v6, :cond_d

    .line 150
    .line 151
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    check-cast v6, Lyyds/ᛲᛴᛷᲁ;

    .line 156
    .line 157
    invoke-virtual {v6, p1}, Lyyds/ᛲᛴᛷᲁ;->ᛷᛲᲈᛱ(Landroid/app/Activity;)Ljava/util/ArrayList;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 162
    .line 163
    .line 164
    move-result v7

    .line 165
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 166
    .line 167
    .line 168
    move-result v8

    .line 169
    if-eq v7, v8, :cond_9

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_9
    move v7, v2

    .line 173
    :goto_2
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 174
    .line 175
    .line 176
    move-result v8

    .line 177
    if-ge v7, v8, :cond_b

    .line 178
    .line 179
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v8

    .line 183
    check-cast v8, Landroid/content/Intent;

    .line 184
    .line 185
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    check-cast v9, Landroid/content/Intent;

    .line 190
    .line 191
    invoke-virtual {v8, v9}, Landroid/content/Intent;->filterEquals(Landroid/content/Intent;)Z

    .line 192
    .line 193
    .line 194
    move-result v8

    .line 195
    if-nez v8, :cond_a

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_a
    add-int/lit8 v7, v7, 0x1

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_b
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    sub-int/2addr v4, v3

    .line 206
    if-ne v5, v4, :cond_c

    .line 207
    .line 208
    move-object v1, v6

    .line 209
    goto :goto_4

    .line 210
    :cond_c
    add-int/lit8 v5, v5, 0x1

    .line 211
    .line 212
    move-object v4, v6

    .line 213
    goto :goto_1

    .line 214
    :cond_d
    :goto_3
    invoke-static {p1}, Lyyds/ᛴᛲᛴᛲ;->ᛷᲈᲈᲁ(Landroid/app/Activity;)Ljava/util/ArrayList;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    :goto_4
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 223
    .line 224
    .line 225
    move-result v5

    .line 226
    if-eqz v5, :cond_12

    .line 227
    .line 228
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    check-cast v5, Landroid/content/Intent;

    .line 233
    .line 234
    if-nez v5, :cond_e

    .line 235
    .line 236
    :goto_6
    move v5, v2

    .line 237
    goto :goto_8

    .line 238
    :cond_e
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    if-nez v6, :cond_f

    .line 243
    .line 244
    goto :goto_6

    .line 245
    :cond_f
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 246
    .line 247
    const/16 v8, 0x21

    .line 248
    .line 249
    if-lt v7, v8, :cond_10

    .line 250
    .line 251
    invoke-static {}, Lyyds/ᛴᛵᛷᛳ;->ᲇᲈᛵᛷ()Landroid/content/pm/PackageManager$ResolveInfoFlags;

    .line 252
    .line 253
    .line 254
    move-result-object v7

    .line 255
    invoke-static {v6, v5, v7}, Lyyds/ᛴᛵᛷᛳ;->ᛷᛲᲈᛱ(Landroid/content/pm/PackageManager;Landroid/content/Intent;Landroid/content/pm/PackageManager$ResolveInfoFlags;)Ljava/util/List;

    .line 256
    .line 257
    .line 258
    move-result-object v5

    .line 259
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 260
    .line 261
    .line 262
    move-result v5

    .line 263
    :goto_7
    xor-int/2addr v5, v3

    .line 264
    goto :goto_8

    .line 265
    :cond_10
    const/high16 v7, 0x10000

    .line 266
    .line 267
    invoke-virtual {v6, v5, v7}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 268
    .line 269
    .line 270
    move-result-object v5

    .line 271
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 272
    .line 273
    .line 274
    move-result v5

    .line 275
    goto :goto_7

    .line 276
    :goto_8
    if-eqz v5, :cond_11

    .line 277
    .line 278
    goto :goto_5

    .line 279
    :cond_11
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    .line 280
    .line 281
    .line 282
    goto :goto_5

    .line 283
    :cond_12
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 284
    .line 285
    .line 286
    move-result p1

    .line 287
    if-eqz p1, :cond_13

    .line 288
    .line 289
    new-instance p1, Landroid/content/Intent;

    .line 290
    .line 291
    const-string v2, "android.settings.SETTINGS"

    .line 292
    .line 293
    invoke-direct {p1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    :cond_13
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    :cond_14
    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    if-eqz v1, :cond_16

    .line 308
    .line 309
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    check-cast v1, Landroid/content/Intent;

    .line 314
    .line 315
    if-nez v1, :cond_15

    .line 316
    .line 317
    goto :goto_9

    .line 318
    :cond_15
    :try_start_0
    invoke-interface {v0, v1, p3}, Lyyds/ᛲᲁᛴ;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 319
    .line 320
    .line 321
    goto :goto_a

    .line 322
    :catch_0
    move-exception v1

    .line 323
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 324
    .line 325
    .line 326
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    if-eqz v1, :cond_14

    .line 331
    .line 332
    iget v1, p0, Lyyds/ᛲᲁᛲᛴ;->ᛶᛷᛲᲁ:I

    .line 333
    .line 334
    add-int/2addr v1, v3

    .line 335
    iput v1, p0, Lyyds/ᛲᲁᛲᛴ;->ᛶᛷᛲᲁ:I

    .line 336
    .line 337
    goto :goto_9

    .line 338
    :cond_16
    :goto_a
    invoke-static {p2}, Lyyds/ᛲᛶᛵᛴ;->ᛲᲈᲁ(Ljava/util/ArrayList;)V

    .line 339
    .line 340
    .line 341
    return-void
.end method
