.class public final synthetic Lyyds/ᛵᲇᛵᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᛶᲁᲀ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛵᲇᛵᲇ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛵᲇᛵᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lyyds/ᛵᲇᛵᲇ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    const/4 v3, 0x0

    .line 6
    sget-object v4, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᛵᲇᛵᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, Lyyds/ᛲᲀᛶᛲ;

    .line 14
    .line 15
    invoke-virtual {p0}, Lyyds/ᛲᲀᛶᛲ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-object v4

    .line 19
    :pswitch_0
    check-cast p0, Lcom/ss/android/ugc/awemes/WardDatabase_Impl;

    .line 20
    .line 21
    sget v0, Lcom/ss/android/ugc/awemes/WardDatabase_Impl;->ᛵᛶᛲᲀ:I

    .line 22
    .line 23
    new-instance v0, Lyyds/ᛲᛶᲀᛱ;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Lyyds/ᛲᛶᲀᛱ;-><init>(Lcom/ss/android/ugc/awemes/WardDatabase;)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_1
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    sget-object v0, Lyyds/ᛳᛷᲇᛳ;->ᛲᲈᲁ:Lyyds/ᛳᛷᲇᛳ;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-static {p0}, Lyyds/ᛳᛷᲇᛳ;->ᛵᛸᛸᛷ(Ljava/util/LinkedHashMap;)V

    .line 37
    .line 38
    .line 39
    return-object v4

    .line 40
    :pswitch_2
    return-object p0

    .line 41
    :pswitch_3
    check-cast p0, Ljava/lang/Runnable;

    .line 42
    .line 43
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 44
    .line 45
    .line 46
    return-object v4

    .line 47
    :pswitch_4
    check-cast p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;

    .line 48
    .line 49
    sget v0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛶᲈᛴᲈ:I

    .line 50
    .line 51
    new-instance v4, Landroid/graphics/RadialGradient;

    .line 52
    .line 53
    iget v7, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛲᛳᛶᲁ:F

    .line 54
    .line 55
    iget v0, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᲇᲈᛵᛷ:I

    .line 56
    .line 57
    iget v1, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛲᛴᛳᛲ:I

    .line 58
    .line 59
    iget p0, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᲇᲇᲇᛱ:I

    .line 60
    .line 61
    const/16 v5, 0xa0

    .line 62
    .line 63
    invoke-static {v5, v0, v1, p0}, Landroid/graphics/Color;->argb(IIII)I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    const/16 v6, 0x32

    .line 68
    .line 69
    invoke-static {v6, v0, v1, p0}, Landroid/graphics/Color;->argb(IIII)I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    invoke-static {v3, v0, v1, p0}, Landroid/graphics/Color;->argb(IIII)I

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    filled-new-array {v5, v6, p0}, [I

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    new-array v9, v2, [F

    .line 82
    .line 83
    fill-array-data v9, :array_0

    .line 84
    .line 85
    .line 86
    sget-object v10, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 87
    .line 88
    const/4 v5, 0x0

    .line 89
    const/4 v6, 0x0

    .line 90
    invoke-direct/range {v4 .. v10}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 91
    .line 92
    .line 93
    return-object v4

    .line 94
    :pswitch_5
    check-cast p0, Lyyds/ᛳᛸᲁᲈ;

    .line 95
    .line 96
    iget-object v0, p0, Lyyds/ᛳᛸᲁᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛲᲈᲁᛲ;

    .line 97
    .line 98
    iget-object p0, p0, Lyyds/ᛳᛸᲁᲈ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 99
    .line 100
    invoke-interface {v0, p0}, Lyyds/ᛲᲈᲁᛲ;->ᛲᲈᲁ(Ljava/lang/String;)Lyyds/ᛱᛵᛷ;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0

    .line 105
    :pswitch_6
    check-cast p0, Lyyds/ᲀᲈᲁᛷ;

    .line 106
    .line 107
    invoke-virtual {p0}, Lyyds/ᲀᲈᲁᛷ;->ᛵᛸᛸᛷ()V

    .line 108
    .line 109
    .line 110
    return-object v4

    .line 111
    :pswitch_7
    check-cast p0, Lyyds/ᛳᛱᲀᛶ;

    .line 112
    .line 113
    iget-object p0, p0, Lyyds/ᛳᛱᲀᛶ;->ᛲᲈᲁ:Lcom/ss/android/ugc/awemes/WardDatabase_Impl;

    .line 114
    .line 115
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛱᲈᲁ()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_0

    .line 120
    .line 121
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛷᛲᲈᛱ()Z

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    if-eqz p0, :cond_1

    .line 126
    .line 127
    :cond_0
    const/4 v3, 0x1

    .line 128
    :cond_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    return-object p0

    .line 133
    :pswitch_8
    check-cast p0, Lyyds/ᛴᲀᛷᛷ;

    .line 134
    .line 135
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    const/4 v1, 0x2

    .line 139
    :try_start_0
    iget-object v0, p0, Lyyds/ᛴᲀᛷᛷ;->ᲈᲀᛲᲀ:Lyyds/ᛲᛱᛷᲀ;

    .line 140
    .line 141
    invoke-virtual {v0, v1, v3, v3}, Lyyds/ᛲᛱᛷᲀ;->ᲇᛱᛲ(IIZ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :catch_0
    move-exception v0

    .line 146
    invoke-virtual {p0, v1, v1, v0}, Lyyds/ᛴᲀᛷᛷ;->ᛲᲈᲁ(IILjava/io/IOException;)V

    .line 147
    .line 148
    .line 149
    :goto_0
    return-object v4

    .line 150
    :pswitch_9
    check-cast p0, Ljava/util/List;

    .line 151
    .line 152
    return-object p0

    .line 153
    :pswitch_a
    check-cast p0, Lyyds/ᲁᛶᲁᲀ;

    .line 154
    .line 155
    :try_start_1
    invoke-interface {p0}, Lyyds/ᲁᛶᲁᲀ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    check-cast p0, Ljava/util/List;
    :try_end_1
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :catch_1
    sget-object p0, Lyyds/ᛸᲀᛶᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛶᲈ;

    .line 163
    .line 164
    :goto_1
    return-object p0

    .line 165
    :pswitch_b
    check-cast p0, Lyyds/ᲀᛳᛲᲀ;

    .line 166
    .line 167
    new-instance v0, Lyyds/ᛷᲈᲀᛸ;

    .line 168
    .line 169
    iget-object v2, p0, Lyyds/ᲀᛳᛲᲀ;->ᲀᛲᛳᲀ:Landroid/content/Context;

    .line 170
    .line 171
    iget-object v3, p0, Lyyds/ᲀᛳᛲᲀ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 172
    .line 173
    new-instance v4, Lyyds/ᛱᛱᛴ;

    .line 174
    .line 175
    const/16 v5, 0x18

    .line 176
    .line 177
    invoke-direct {v4, v5}, Lyyds/ᛱᛱᛴ;-><init>(I)V

    .line 178
    .line 179
    .line 180
    iput-object v1, v4, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 181
    .line 182
    iget-object v1, p0, Lyyds/ᲀᛳᛲᲀ;->ᛲᛴᛳᛲ:Lyyds/ᛸᛴᛷᛵ;

    .line 183
    .line 184
    invoke-direct {v0, v2, v3, v4, v1}, Lyyds/ᛷᲈᲀᛸ;-><init>(Landroid/content/Context;Ljava/lang/String;Lyyds/ᛱᛱᛴ;Lyyds/ᛸᛴᛷᛵ;)V

    .line 185
    .line 186
    .line 187
    iget-boolean p0, p0, Lyyds/ᲀᛳᛲᲀ;->ᛶᛷᛲᲁ:Z

    .line 188
    .line 189
    invoke-virtual {v0, p0}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    .line 190
    .line 191
    .line 192
    return-object v0

    .line 193
    :pswitch_c
    check-cast p0, Ljava/util/Collection;

    .line 194
    .line 195
    sget-object v0, Lyyds/ᛳᛳᲇᲀ;->ᛶᛷᛲᲁ:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 196
    .line 197
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    :catchall_0
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    if-eqz v1, :cond_2

    .line 206
    .line 207
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    check-cast v1, Lyyds/ᲁᛶᲁᲀ;

    .line 212
    .line 213
    :try_start_2
    invoke-interface {v1}, Lyyds/ᲁᛶᲁᲀ;->ᛲᲈᲁ()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 214
    .line 215
    .line 216
    goto :goto_2

    .line 217
    :cond_2
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-eqz v0, :cond_4

    .line 226
    .line 227
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    check-cast v0, Lyyds/ᛴᛵᲈᛴ;

    .line 232
    .line 233
    sget-object v1, Lyyds/ᛳᛳᲇᲀ;->ᛱᲈᲁ:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 234
    .line 235
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    :catchall_1
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    if-eqz v2, :cond_3

    .line 244
    .line 245
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    check-cast v2, Lyyds/ᛷᛴᲈᲀ;

    .line 250
    .line 251
    :try_start_3
    invoke-interface {v2, v0}, Lyyds/ᛷᛴᲈᲀ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 252
    .line 253
    .line 254
    goto :goto_3

    .line 255
    :cond_4
    return-object v4

    .line 256
    :pswitch_d
    check-cast p0, Lyyds/ᛴᛵᲈᛴ;

    .line 257
    .line 258
    sget-object v0, Lyyds/ᛳᛳᲇᲀ;->ᛶᛷᛲᲁ:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 259
    .line 260
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    :catchall_2
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    if-eqz v1, :cond_5

    .line 269
    .line 270
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    check-cast v1, Lyyds/ᲁᛶᲁᲀ;

    .line 275
    .line 276
    :try_start_4
    invoke-interface {v1}, Lyyds/ᲁᛶᲁᲀ;->ᛲᲈᲁ()Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 277
    .line 278
    .line 279
    goto :goto_4

    .line 280
    :cond_5
    sget-object v0, Lyyds/ᛳᛳᲇᲀ;->ᛱᲈᲁ:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 281
    .line 282
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    :catchall_3
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 287
    .line 288
    .line 289
    move-result v1

    .line 290
    if-eqz v1, :cond_6

    .line 291
    .line 292
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    check-cast v1, Lyyds/ᛷᛴᲈᲀ;

    .line 297
    .line 298
    :try_start_5
    invoke-interface {v1, p0}, Lyyds/ᛷᛴᲈᲀ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 299
    .line 300
    .line 301
    goto :goto_5

    .line 302
    :cond_6
    return-object v4

    .line 303
    :pswitch_e
    check-cast p0, Lyyds/ᛵᛳᛱᛷ;

    .line 304
    .line 305
    new-instance v4, Landroid/graphics/RadialGradient;

    .line 306
    .line 307
    iget v7, p0, Lyyds/ᛵᛳᛱᛷ;->ᛶᛳᛶᛵ:F

    .line 308
    .line 309
    iget v0, p0, Lyyds/ᛵᛳᛱᛷ;->ᛷᲈᲈᲁ:I

    .line 310
    .line 311
    iget v1, p0, Lyyds/ᛵᛳᛱᛷ;->ᛷᛲᲈᛱ:I

    .line 312
    .line 313
    iget p0, p0, Lyyds/ᛵᛳᛱᛷ;->ᛷᛵᲇᲀ:I

    .line 314
    .line 315
    const/16 v5, 0xbe

    .line 316
    .line 317
    invoke-static {v5, v0, v1, p0}, Landroid/graphics/Color;->argb(IIII)I

    .line 318
    .line 319
    .line 320
    move-result v5

    .line 321
    const/16 v6, 0x46

    .line 322
    .line 323
    invoke-static {v6, v0, v1, p0}, Landroid/graphics/Color;->argb(IIII)I

    .line 324
    .line 325
    .line 326
    move-result v6

    .line 327
    invoke-static {v3, v0, v1, p0}, Landroid/graphics/Color;->argb(IIII)I

    .line 328
    .line 329
    .line 330
    move-result p0

    .line 331
    filled-new-array {v5, v6, p0}, [I

    .line 332
    .line 333
    .line 334
    move-result-object v8

    .line 335
    new-array v9, v2, [F

    .line 336
    .line 337
    fill-array-data v9, :array_1

    .line 338
    .line 339
    .line 340
    sget-object v10, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 341
    .line 342
    const/4 v5, 0x0

    .line 343
    const/4 v6, 0x0

    .line 344
    invoke-direct/range {v4 .. v10}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 345
    .line 346
    .line 347
    return-object v4

    .line 348
    :pswitch_f
    check-cast p0, Lyyds/ᛳᲈᲁᲀ;

    .line 349
    .line 350
    new-instance v0, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    const-string v1, "("

    .line 353
    .line 354
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    iget-object v2, p0, Lyyds/ᛳᲈᲁᲀ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 358
    .line 359
    new-instance v6, Lyyds/ᲇᛶᛲᛱ;

    .line 360
    .line 361
    const/16 v1, 0x11

    .line 362
    .line 363
    invoke-direct {v6, v1}, Lyyds/ᲇᛶᛲᛱ;-><init>(I)V

    .line 364
    .line 365
    .line 366
    const/16 v7, 0x1e

    .line 367
    .line 368
    const-string v3, ""

    .line 369
    .line 370
    const/4 v4, 0x0

    .line 371
    const/4 v5, 0x0

    .line 372
    invoke-static/range {v2 .. v7}, Lyyds/ᛷᛷᛶᲇ;->ᲈᛷᲈᛶ(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyyds/ᛷᛴᲈᲀ;I)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    const-string v1, ")"

    .line 380
    .line 381
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    iget-object p0, p0, Lyyds/ᛳᲈᲁᲀ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 385
    .line 386
    invoke-static {p0}, Lyyds/ᲇᛳᲈᲁ;->ᲇᲈᛵᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object p0

    .line 390
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object p0

    .line 397
    return-object p0

    .line 398
    :pswitch_10
    check-cast p0, Lyyds/ᛸᛳᛸᲁ;

    .line 399
    .line 400
    iget-object p0, p0, Lyyds/ᛸᛳᛸᲁ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 401
    .line 402
    invoke-static {p0}, Lyyds/ᲇᛳᲈᲁ;->ᲇᲈᛵᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object p0

    .line 406
    return-object p0

    .line 407
    :pswitch_11
    check-cast p0, Lyyds/ᲀᲈᛶᲈ;

    .line 408
    .line 409
    const-string v0, ":memory:"

    .line 410
    .line 411
    invoke-virtual {p0, v0}, Lyyds/ᲀᲈᛶᲈ;->ᛲᲈᲁ(Ljava/lang/String;)Lyyds/ᛱᛵᛷ;

    .line 412
    .line 413
    .line 414
    move-result-object p0

    .line 415
    return-object p0

    .line 416
    :pswitch_12
    check-cast p0, Landroid/widget/TextView;

    .line 417
    .line 418
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 419
    .line 420
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    .line 422
    .line 423
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᛳᛸᛴᛶ()Z

    .line 424
    .line 425
    .line 426
    move-result v0

    .line 427
    if-eqz v0, :cond_7

    .line 428
    .line 429
    const-wide v0, -0x3db0ce68a836eL

    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    :goto_6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    goto :goto_7

    .line 439
    :cond_7
    const-wide v0, -0x3db10e68a836eL

    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    goto :goto_6

    .line 445
    :goto_7
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 446
    .line 447
    .line 448
    return-object v4

    .line 449
    :pswitch_13
    check-cast p0, Ljava/util/Set;

    .line 450
    .line 451
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 452
    .line 453
    .line 454
    move-result-object p0

    .line 455
    return-object p0

    .line 456
    :pswitch_14
    check-cast p0, Lyyds/ᛱᛶᛶᲇ;

    .line 457
    .line 458
    iget-object p0, p0, Lyyds/ᛱᛶᛶᲇ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛲᛶᛱ;

    .line 459
    .line 460
    invoke-virtual {p0}, Lyyds/ᛱᛲᛶᛱ;->getValue()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object p0

    .line 464
    check-cast p0, Lyyds/ᛲᲇᲀᲁ;

    .line 465
    .line 466
    invoke-virtual {p0}, Lyyds/ᛲᲇᲀᲁ;->getDefaultClassLoader()Ljava/lang/ClassLoader;

    .line 467
    .line 468
    .line 469
    move-result-object p0

    .line 470
    return-object p0

    .line 471
    :pswitch_15
    check-cast p0, Lyyds/ᛱᛷᛸᲈ;

    .line 472
    .line 473
    iget-object p0, p0, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 474
    .line 475
    if-nez p0, :cond_8

    .line 476
    .line 477
    const-wide v2, -0x2fb5fe68a836eL

    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    goto :goto_8

    .line 486
    :cond_8
    move-object v1, p0

    .line 487
    check-cast v1, Landroid/app/AlertDialog;

    .line 488
    .line 489
    :goto_8
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 490
    .line 491
    .line 492
    return-object v4

    .line 493
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
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

    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    :array_0
    .array-data 4
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data

    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    :array_1
    .array-data 4
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data
.end method
