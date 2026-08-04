.class public final Lyyds/ᲈᛵᛶᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 13
    iput p1, p0, Lyyds/ᲈᛵᛶᛲ;->ᲀᛲᛳᲀ:I

    iput-object p2, p0, Lyyds/ᲈᛵᛶᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    iput-object p3, p0, Lyyds/ᲈᛵᛶᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 12
    iput p2, p0, Lyyds/ᲈᛵᛶᛲ;->ᲀᛲᛳᲀ:I

    iput-object p1, p0, Lyyds/ᲈᛵᛶᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    iput-object p3, p0, Lyyds/ᲈᛵᛶᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lyyds/ᛸᲁᛲᲀ;Lyyds/ᛷᛱᛱᲈ;I)V
    .locals 0

    .line 1
    const/4 p3, 0x5

    .line 2
    iput p3, p0, Lyyds/ᲈᛵᛶᛲ;->ᲀᛲᛳᲀ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lyyds/ᲈᛵᛶᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lyyds/ᲈᛵᛶᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lyyds/ᲈᛵᛶᛲ;->ᲀᛲᛳᲀ:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v4, v1, Lyyds/ᲈᛵᛶᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, v1, Lyyds/ᲈᛵᛶᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroid/app/Activity;

    .line 14
    .line 15
    check-cast v4, Landroid/view/View;

    .line 16
    .line 17
    invoke-static {v0, v4}, Lyyds/ᛲᛸᲈᲈ;->ᛱᛳᲇ(Landroid/app/Activity;Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    check-cast v4, Lyyds/ᛸᲀᛱᛴ;

    .line 22
    .line 23
    iget-object v0, v1, Lyyds/ᲈᛵᛶᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lyyds/ᲈᲁᛱᛳ;

    .line 26
    .line 27
    invoke-virtual {v4, v0}, Lyyds/ᛸᲀᛱᛴ;->ᲀᛲᛱᛱ(Lyyds/ᛴᲇᛴᛲ;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_1
    iget-object v0, v1, Lyyds/ᲈᛵᛶᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lyyds/ᲁᛳᲈᲇ;

    .line 34
    .line 35
    invoke-virtual {v0, v4}, Lyyds/ᲁᛳᲈᲇ;->accept(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_2
    move-object v5, v4

    .line 40
    check-cast v5, Lyyds/ᛵᛷᛱᲀ;

    .line 41
    .line 42
    iget-object v6, v5, Lyyds/ᛵᛷᛱᲀ;->ᛲᛴᛳᛲ:Lyyds/ᛴᲇᛴᛲ;

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    :cond_0
    :try_start_0
    iget-object v0, v1, Lyyds/ᲈᛵᛶᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Ljava/lang/Runnable;

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    sget-object v4, Lyyds/ᲈᛱᛸᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛱᛸᛲ;

    .line 55
    .line 56
    invoke-static {v4, v0}, Lyyds/ᲀᲀᛸᛱ;->ᛶᛷᛲᲁ(Lyyds/ᲁᛴᛲ;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    invoke-virtual {v5}, Lyyds/ᛵᛷᛱᲀ;->ᛱᛸᲁᲇ()Ljava/lang/Runnable;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-nez v0, :cond_1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    iput-object v0, v1, Lyyds/ᲈᛵᛶᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 67
    .line 68
    add-int/2addr v3, v2

    .line 69
    const/16 v0, 0x10

    .line 70
    .line 71
    if-lt v3, v0, :cond_0

    .line 72
    .line 73
    invoke-virtual {v6, v5}, Lyyds/ᛴᲇᛴᛲ;->ᲈᛷᲈᛶ(Lyyds/ᲁᛴᛲ;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_0

    .line 78
    .line 79
    invoke-virtual {v6, v5, v1}, Lyyds/ᛴᲇᛴᛲ;->ᛷᲇᛲᛱ(Lyyds/ᲁᛴᛲ;Ljava/lang/Runnable;)V

    .line 80
    .line 81
    .line 82
    :goto_1
    return-void

    .line 83
    :pswitch_3
    iget-object v0, v1, Lyyds/ᲈᛵᛶᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Lyyds/ᛷᛱᛱᲈ;

    .line 86
    .line 87
    check-cast v4, Lyyds/ᛸᲁᛲᲀ;

    .line 88
    .line 89
    iget-object v2, v4, Lyyds/ᛸᲁᛲᲀ;->ᛵᛶᛲᲀ:Lyyds/ᛵᲇᛲᛱ;

    .line 90
    .line 91
    if-eqz v2, :cond_6

    .line 92
    .line 93
    iget-boolean v2, v2, Lyyds/ᛵᲇᛲᛱ;->ᛶᲈᛴᲈ:Z

    .line 94
    .line 95
    if-eqz v2, :cond_6

    .line 96
    .line 97
    iget-boolean v2, v0, Lyyds/ᛷᛱᛱᲈ;->ᛷᛲᲈᛱ:Z

    .line 98
    .line 99
    if-nez v2, :cond_6

    .line 100
    .line 101
    iget-object v0, v0, Lyyds/ᛷᛱᛱᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛸᛳᛵ;

    .line 102
    .line 103
    invoke-virtual {v0}, Lyyds/ᛱᛸᛳᛵ;->ᛵᛸᛸᛷ()I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    const/4 v2, -0x1

    .line 108
    if-eq v0, v2, :cond_6

    .line 109
    .line 110
    iget-object v0, v4, Lyyds/ᛸᲁᛲᲀ;->ᛵᛶᛲᲀ:Lyyds/ᛵᲇᛲᛱ;

    .line 111
    .line 112
    invoke-virtual {v0}, Lyyds/ᛵᲇᛲᛱ;->getItemAnimator()Lyyds/ᲇᛲᲇᲇ;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    if-eqz v0, :cond_2

    .line 117
    .line 118
    invoke-virtual {v0}, Lyyds/ᲇᛲᲇᲇ;->ᲇᲇᲇᛱ()Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-nez v0, :cond_3

    .line 123
    .line 124
    :cond_2
    iget-object v0, v4, Lyyds/ᛸᲁᛲᲀ;->ᲇᛱᛲ:Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    const/4 v3, 0x0

    .line 131
    :goto_2
    if-ge v3, v2, :cond_5

    .line 132
    .line 133
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    check-cast v5, Lyyds/ᛷᛱᛱᲈ;

    .line 138
    .line 139
    iget-boolean v5, v5, Lyyds/ᛷᛱᛱᲈ;->ᛷᛵᲇᲀ:Z

    .line 140
    .line 141
    if-nez v5, :cond_4

    .line 142
    .line 143
    :cond_3
    iget-object v0, v4, Lyyds/ᛸᲁᛲᲀ;->ᛵᛶᛲᲀ:Lyyds/ᛵᲇᛲᛱ;

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 146
    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_5
    iget-object v0, v4, Lyyds/ᛸᲁᛲᲀ;->ᛲᛲᲈᲈ:Lyyds/ᲇᛵᛷᛶ;

    .line 153
    .line 154
    invoke-virtual {v0}, Lyyds/ᲇᛵᛷᛶ;->ᛱᲈᲁ()V

    .line 155
    .line 156
    .line 157
    :cond_6
    :goto_3
    return-void

    .line 158
    :pswitch_4
    iget-object v0, v1, Lyyds/ᲈᛵᛶᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v0, Lyyds/ᛸᲀᛱᛴ;

    .line 161
    .line 162
    check-cast v4, Lyyds/ᛵᛸᛵᛱ;

    .line 163
    .line 164
    invoke-virtual {v0, v4}, Lyyds/ᛸᲀᛱᛴ;->ᲀᛲᛱᛱ(Lyyds/ᛴᲇᛴᛲ;)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :pswitch_5
    check-cast v4, Lyyds/ᲀᲇᲇᲀ;

    .line 169
    .line 170
    iget-boolean v0, v4, Lyyds/ᲀᲇᲇᲀ;->ᛵᛸᛸᛷ:Z

    .line 171
    .line 172
    if-eqz v0, :cond_7

    .line 173
    .line 174
    new-instance v0, Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 175
    .line 176
    invoke-direct {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectNetwork()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->penaltyDeath()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 192
    .line 193
    .line 194
    :cond_7
    :try_start_1
    iget-object v0, v1, Lyyds/ᲈᛵᛶᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v0, Ljava/lang/Runnable;

    .line 197
    .line 198
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 199
    .line 200
    .line 201
    goto :goto_4

    .line 202
    :catchall_1
    move-exception v0

    .line 203
    const/4 v1, 0x6

    .line 204
    const-string v2, "GlideExecutor"

    .line 205
    .line 206
    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-eqz v1, :cond_8

    .line 211
    .line 212
    const-string v1, "Request threw uncaught throwable"

    .line 213
    .line 214
    invoke-static {v2, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 215
    .line 216
    .line 217
    :cond_8
    :goto_4
    return-void

    .line 218
    :pswitch_6
    iget-object v0, v1, Lyyds/ᲈᛵᛶᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v0, Lyyds/ᲀᛵᲁᛴ;

    .line 221
    .line 222
    check-cast v4, Landroid/graphics/Typeface;

    .line 223
    .line 224
    iget-object v0, v0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v0, Lyyds/ᛸᛸᲇᲁ;

    .line 227
    .line 228
    invoke-virtual {v0, v4}, Lyyds/ᛸᛸᲇᲁ;->ᛵᛸᛸᛷ(Landroid/graphics/Typeface;)V

    .line 229
    .line 230
    .line 231
    return-void

    .line 232
    :pswitch_7
    check-cast v4, Lyyds/ᛴᛸᛴᛶ;

    .line 233
    .line 234
    iget-object v0, v4, Lyyds/ᛴᛸᛴᛶ;->ᛶᛷᛲᲁ:Lyyds/ᛲᛷᛷᲇ;

    .line 235
    .line 236
    iget v5, v0, Lyyds/ᛲᛷᛷᲇ;->ᛶᛷᛲᲁ:I

    .line 237
    .line 238
    iget v6, v4, Lyyds/ᛴᛸᛴᛶ;->ᛲᛴᛳᛲ:I

    .line 239
    .line 240
    if-ne v5, v6, :cond_16

    .line 241
    .line 242
    iget-object v5, v4, Lyyds/ᛴᛸᛴᛶ;->ᲇᲈᛵᛷ:Ljava/util/List;

    .line 243
    .line 244
    iget-object v1, v1, Lyyds/ᲈᛵᛶᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v1, Lyyds/ᲇᲇᛶᛶ;

    .line 247
    .line 248
    iget-object v4, v4, Lyyds/ᛴᛸᛴᛶ;->ᲇᲇᲇᛱ:Ljava/lang/Runnable;

    .line 249
    .line 250
    iput-object v5, v0, Lyyds/ᛲᛷᛷᲇ;->ᛲᛴᛳᛲ:Ljava/util/List;

    .line 251
    .line 252
    invoke-static {v5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    iput-object v5, v0, Lyyds/ᛲᛷᛷᲇ;->ᲇᲇᲇᛱ:Ljava/util/List;

    .line 257
    .line 258
    iget-object v5, v0, Lyyds/ᛲᛷᛷᲇ;->ᛲᲈᲁ:Lyyds/ᛱᛱᛴ;

    .line 259
    .line 260
    iget-object v6, v1, Lyyds/ᲇᲇᛶᛶ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast v6, [I

    .line 263
    .line 264
    iget-object v7, v1, Lyyds/ᲇᲇᛶᛶ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast v7, Ljava/util/ArrayList;

    .line 267
    .line 268
    iget v8, v1, Lyyds/ᲇᲇᛶᛶ;->ᛲᲈᲁ:I

    .line 269
    .line 270
    iget-object v9, v1, Lyyds/ᲇᲇᛶᛶ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v9, Lyyds/ᛱᛱᛴ;

    .line 273
    .line 274
    new-instance v10, Lyyds/ᛸᛴᛷ;

    .line 275
    .line 276
    invoke-direct {v10, v5}, Lyyds/ᛸᛴᛷ;-><init>(Lyyds/ᛱᛱᛴ;)V

    .line 277
    .line 278
    .line 279
    new-instance v5, Ljava/util/ArrayDeque;

    .line 280
    .line 281
    invoke-direct {v5}, Ljava/util/ArrayDeque;-><init>()V

    .line 282
    .line 283
    .line 284
    iget v11, v1, Lyyds/ᲇᲇᛶᛶ;->ᛵᛸᛸᛷ:I

    .line 285
    .line 286
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 287
    .line 288
    .line 289
    move-result v12

    .line 290
    sub-int/2addr v12, v2

    .line 291
    move v13, v12

    .line 292
    move v12, v11

    .line 293
    move v11, v8

    .line 294
    :goto_5
    if-ltz v13, :cond_15

    .line 295
    .line 296
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v14

    .line 300
    check-cast v14, Lyyds/ᛵᛷᛳᛶ;

    .line 301
    .line 302
    iget v15, v14, Lyyds/ᛵᛷᛳᛶ;->ᛲᲈᲁ:I

    .line 303
    .line 304
    move/from16 v16, v2

    .line 305
    .line 306
    iget v2, v14, Lyyds/ᛵᛷᛳᛶ;->ᲀᛲᛳᲀ:I

    .line 307
    .line 308
    add-int v3, v15, v2

    .line 309
    .line 310
    iget v14, v14, Lyyds/ᛵᛷᛳᛶ;->ᛵᛸᛸᛷ:I

    .line 311
    .line 312
    move-object/from16 p0, v6

    .line 313
    .line 314
    add-int v6, v14, v2

    .line 315
    .line 316
    move-object/from16 v17, v7

    .line 317
    .line 318
    :goto_6
    const/4 v7, 0x2

    .line 319
    if-le v11, v3, :cond_d

    .line 320
    .line 321
    add-int/lit8 v11, v11, -0x1

    .line 322
    .line 323
    aget v18, p0, v11

    .line 324
    .line 325
    and-int/lit8 v19, v18, 0xc

    .line 326
    .line 327
    if-eqz v19, :cond_b

    .line 328
    .line 329
    shr-int/lit8 v7, v18, 0x4

    .line 330
    .line 331
    move/from16 v19, v3

    .line 332
    .line 333
    move/from16 v20, v8

    .line 334
    .line 335
    const/4 v3, 0x0

    .line 336
    invoke-static {v5, v7, v3}, Lyyds/ᲇᲇᛶᛶ;->ᲇᲇᲇᛱ(Ljava/util/ArrayDeque;IZ)Lyyds/ᛴᛴᲇᛷ;

    .line 337
    .line 338
    .line 339
    move-result-object v8

    .line 340
    if-eqz v8, :cond_a

    .line 341
    .line 342
    iget v3, v8, Lyyds/ᛴᛴᲇᛷ;->ᛵᛸᛸᛷ:I

    .line 343
    .line 344
    sub-int v8, v20, v3

    .line 345
    .line 346
    add-int/lit8 v8, v8, -0x1

    .line 347
    .line 348
    invoke-virtual {v10, v11, v8}, Lyyds/ᛸᛴᛷ;->ᲀᛲᛳᲀ(II)V

    .line 349
    .line 350
    .line 351
    and-int/lit8 v3, v18, 0x4

    .line 352
    .line 353
    if-eqz v3, :cond_9

    .line 354
    .line 355
    invoke-virtual {v9, v11, v7}, Lyyds/ᛱᛱᛴ;->ᛶᛸᲀᲁ(II)V

    .line 356
    .line 357
    .line 358
    move/from16 v3, v16

    .line 359
    .line 360
    invoke-virtual {v10, v8, v3}, Lyyds/ᛸᛴᛷ;->ᛵᛸᛸᛷ(II)V

    .line 361
    .line 362
    .line 363
    goto :goto_7

    .line 364
    :cond_9
    move/from16 v3, v16

    .line 365
    .line 366
    goto :goto_7

    .line 367
    :cond_a
    move/from16 v3, v16

    .line 368
    .line 369
    new-instance v7, Lyyds/ᛴᛴᲇᛷ;

    .line 370
    .line 371
    sub-int v8, v20, v11

    .line 372
    .line 373
    sub-int/2addr v8, v3

    .line 374
    invoke-direct {v7, v11, v8, v3}, Lyyds/ᛴᛴᲇᛷ;-><init>(IIZ)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v5, v7}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    :goto_7
    move/from16 v8, v20

    .line 381
    .line 382
    goto :goto_9

    .line 383
    :cond_b
    move/from16 v19, v3

    .line 384
    .line 385
    move/from16 v20, v8

    .line 386
    .line 387
    iget v3, v10, Lyyds/ᛸᛴᛷ;->ᛵᛸᛸᛷ:I

    .line 388
    .line 389
    if-ne v3, v7, :cond_c

    .line 390
    .line 391
    iget v3, v10, Lyyds/ᛸᛴᛷ;->ᲀᛲᛳᲀ:I

    .line 392
    .line 393
    if-lt v3, v11, :cond_c

    .line 394
    .line 395
    add-int/lit8 v8, v11, 0x1

    .line 396
    .line 397
    if-gt v3, v8, :cond_c

    .line 398
    .line 399
    iget v3, v10, Lyyds/ᛸᛴᛷ;->ᲇᲈᛵᛷ:I

    .line 400
    .line 401
    const/4 v8, 0x1

    .line 402
    add-int/2addr v3, v8

    .line 403
    iput v3, v10, Lyyds/ᛸᛴᛷ;->ᲇᲈᛵᛷ:I

    .line 404
    .line 405
    iput v11, v10, Lyyds/ᛸᛴᛷ;->ᲀᛲᛳᲀ:I

    .line 406
    .line 407
    goto :goto_8

    .line 408
    :cond_c
    const/4 v8, 0x1

    .line 409
    invoke-virtual {v10}, Lyyds/ᛸᛴᛷ;->ᛲᲈᲁ()V

    .line 410
    .line 411
    .line 412
    iput v11, v10, Lyyds/ᛸᛴᛷ;->ᲀᛲᛳᲀ:I

    .line 413
    .line 414
    iput v8, v10, Lyyds/ᛸᛴᛷ;->ᲇᲈᛵᛷ:I

    .line 415
    .line 416
    iput v7, v10, Lyyds/ᛸᛴᛷ;->ᛵᛸᛸᛷ:I

    .line 417
    .line 418
    :goto_8
    add-int/lit8 v8, v20, -0x1

    .line 419
    .line 420
    :goto_9
    move/from16 v3, v19

    .line 421
    .line 422
    const/16 v16, 0x1

    .line 423
    .line 424
    goto :goto_6

    .line 425
    :cond_d
    move/from16 v20, v8

    .line 426
    .line 427
    :goto_a
    if-le v12, v6, :cond_12

    .line 428
    .line 429
    add-int/lit8 v12, v12, -0x1

    .line 430
    .line 431
    iget-object v3, v1, Lyyds/ᲇᲇᛶᛶ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 432
    .line 433
    check-cast v3, [I

    .line 434
    .line 435
    aget v3, v3, v12

    .line 436
    .line 437
    and-int/lit8 v18, v3, 0xc

    .line 438
    .line 439
    if-eqz v18, :cond_10

    .line 440
    .line 441
    shr-int/lit8 v7, v3, 0x4

    .line 442
    .line 443
    move-object/from16 v19, v1

    .line 444
    .line 445
    move/from16 v16, v3

    .line 446
    .line 447
    const/4 v1, 0x1

    .line 448
    invoke-static {v5, v7, v1}, Lyyds/ᲇᲇᛶᛶ;->ᲇᲇᲇᛱ(Ljava/util/ArrayDeque;IZ)Lyyds/ᛴᛴᲇᛷ;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    if-nez v3, :cond_f

    .line 453
    .line 454
    new-instance v3, Lyyds/ᛴᛴᲇᛷ;

    .line 455
    .line 456
    sub-int v7, v8, v11

    .line 457
    .line 458
    move/from16 v20, v1

    .line 459
    .line 460
    const/4 v1, 0x0

    .line 461
    invoke-direct {v3, v12, v7, v1}, Lyyds/ᛴᛴᲇᛷ;-><init>(IIZ)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v5, v3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    :cond_e
    move/from16 v1, v20

    .line 468
    .line 469
    goto :goto_c

    .line 470
    :cond_f
    move/from16 v20, v1

    .line 471
    .line 472
    iget v1, v3, Lyyds/ᛴᛴᲇᛷ;->ᛵᛸᛸᛷ:I

    .line 473
    .line 474
    sub-int v1, v8, v1

    .line 475
    .line 476
    add-int/lit8 v1, v1, -0x1

    .line 477
    .line 478
    invoke-virtual {v10, v1, v11}, Lyyds/ᛸᛴᛷ;->ᲀᛲᛳᲀ(II)V

    .line 479
    .line 480
    .line 481
    and-int/lit8 v1, v16, 0x4

    .line 482
    .line 483
    if-eqz v1, :cond_e

    .line 484
    .line 485
    invoke-virtual {v9, v7, v12}, Lyyds/ᛱᛱᛴ;->ᛶᛸᲀᲁ(II)V

    .line 486
    .line 487
    .line 488
    move/from16 v1, v20

    .line 489
    .line 490
    invoke-virtual {v10, v11, v1}, Lyyds/ᛸᛴᛷ;->ᛵᛸᛸᛷ(II)V

    .line 491
    .line 492
    .line 493
    goto :goto_c

    .line 494
    :cond_10
    move-object/from16 v19, v1

    .line 495
    .line 496
    const/4 v1, 0x1

    .line 497
    iget v3, v10, Lyyds/ᛸᛴᛷ;->ᛵᛸᛸᛷ:I

    .line 498
    .line 499
    if-ne v3, v1, :cond_11

    .line 500
    .line 501
    iget v1, v10, Lyyds/ᛸᛴᛷ;->ᲀᛲᛳᲀ:I

    .line 502
    .line 503
    if-lt v11, v1, :cond_11

    .line 504
    .line 505
    iget v3, v10, Lyyds/ᛸᛴᛷ;->ᲇᲈᛵᛷ:I

    .line 506
    .line 507
    add-int v7, v1, v3

    .line 508
    .line 509
    if-gt v11, v7, :cond_11

    .line 510
    .line 511
    add-int/lit8 v3, v3, 0x1

    .line 512
    .line 513
    iput v3, v10, Lyyds/ᛸᛴᛷ;->ᲇᲈᛵᛷ:I

    .line 514
    .line 515
    invoke-static {v11, v1}, Ljava/lang/Math;->min(II)I

    .line 516
    .line 517
    .line 518
    move-result v1

    .line 519
    iput v1, v10, Lyyds/ᛸᛴᛷ;->ᲀᛲᛳᲀ:I

    .line 520
    .line 521
    goto :goto_b

    .line 522
    :cond_11
    invoke-virtual {v10}, Lyyds/ᛸᛴᛷ;->ᛲᲈᲁ()V

    .line 523
    .line 524
    .line 525
    iput v11, v10, Lyyds/ᛸᛴᛷ;->ᲀᛲᛳᲀ:I

    .line 526
    .line 527
    const/4 v1, 0x1

    .line 528
    iput v1, v10, Lyyds/ᛸᛴᛷ;->ᲇᲈᛵᛷ:I

    .line 529
    .line 530
    iput v1, v10, Lyyds/ᛸᛴᛷ;->ᛵᛸᛸᛷ:I

    .line 531
    .line 532
    :goto_b
    add-int/lit8 v8, v8, 0x1

    .line 533
    .line 534
    :goto_c
    move-object/from16 v1, v19

    .line 535
    .line 536
    const/4 v7, 0x2

    .line 537
    goto :goto_a

    .line 538
    :cond_12
    move-object/from16 v19, v1

    .line 539
    .line 540
    move v6, v14

    .line 541
    move v1, v15

    .line 542
    const/4 v3, 0x0

    .line 543
    :goto_d
    if-ge v3, v2, :cond_14

    .line 544
    .line 545
    aget v7, p0, v1

    .line 546
    .line 547
    and-int/lit8 v7, v7, 0xf

    .line 548
    .line 549
    const/4 v11, 0x2

    .line 550
    if-ne v7, v11, :cond_13

    .line 551
    .line 552
    invoke-virtual {v9, v1, v6}, Lyyds/ᛱᛱᛴ;->ᛶᛸᲀᲁ(II)V

    .line 553
    .line 554
    .line 555
    const/4 v7, 0x1

    .line 556
    invoke-virtual {v10, v1, v7}, Lyyds/ᛸᛴᛷ;->ᛵᛸᛸᛷ(II)V

    .line 557
    .line 558
    .line 559
    goto :goto_e

    .line 560
    :cond_13
    const/4 v7, 0x1

    .line 561
    :goto_e
    add-int/lit8 v1, v1, 0x1

    .line 562
    .line 563
    add-int/lit8 v6, v6, 0x1

    .line 564
    .line 565
    add-int/lit8 v3, v3, 0x1

    .line 566
    .line 567
    goto :goto_d

    .line 568
    :cond_14
    const/4 v7, 0x1

    .line 569
    add-int/lit8 v13, v13, -0x1

    .line 570
    .line 571
    move-object/from16 v6, p0

    .line 572
    .line 573
    move v2, v7

    .line 574
    move v12, v14

    .line 575
    move v11, v15

    .line 576
    move-object/from16 v7, v17

    .line 577
    .line 578
    move-object/from16 v1, v19

    .line 579
    .line 580
    goto/16 :goto_5

    .line 581
    .line 582
    :cond_15
    invoke-virtual {v10}, Lyyds/ᛸᛴᛷ;->ᛲᲈᲁ()V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v0, v4}, Lyyds/ᛲᛷᛷᲇ;->ᛲᲈᲁ(Ljava/lang/Runnable;)V

    .line 586
    .line 587
    .line 588
    :cond_16
    return-void

    .line 589
    :pswitch_8
    iget-object v0, v1, Lyyds/ᲈᛵᛶᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 590
    .line 591
    check-cast v0, Lyyds/ᛳᛷᛶᛵ;

    .line 592
    .line 593
    check-cast v4, Lyyds/ᛶᛴᛲᛸ;

    .line 594
    .line 595
    iget-object v1, v4, Lyyds/ᛶᛴᛲᛸ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛴᛵᛸ;

    .line 596
    .line 597
    if-eqz v1, :cond_17

    .line 598
    .line 599
    iget-object v2, v1, Lyyds/ᛴᛴᛵᛸ;->ᛶᛷᛲᲁ:Lyyds/ᛷᲁᛷᲁ;

    .line 600
    .line 601
    if-eqz v2, :cond_17

    .line 602
    .line 603
    invoke-interface {v2, v1}, Lyyds/ᛷᲁᛷᲁ;->ᲇᲈᛵᛷ(Lyyds/ᛴᛴᛵᛸ;)V

    .line 604
    .line 605
    .line 606
    :cond_17
    iget-object v1, v4, Lyyds/ᛶᛴᛲᛸ;->ᛷᲈᲈᲁ:Lyyds/ᛳᲀᛱᛱ;

    .line 607
    .line 608
    check-cast v1, Landroid/view/View;

    .line 609
    .line 610
    if-eqz v1, :cond_1a

    .line 611
    .line 612
    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 613
    .line 614
    .line 615
    move-result-object v1

    .line 616
    if-eqz v1, :cond_1a

    .line 617
    .line 618
    invoke-virtual {v0}, Lyyds/ᛷᲁᲀᛸ;->ᛵᛸᛸᛷ()Z

    .line 619
    .line 620
    .line 621
    move-result v1

    .line 622
    if-eqz v1, :cond_18

    .line 623
    .line 624
    goto :goto_f

    .line 625
    :cond_18
    iget-object v1, v0, Lyyds/ᛷᲁᲀᛸ;->ᛲᛴᛳᛲ:Landroid/view/View;

    .line 626
    .line 627
    if-nez v1, :cond_19

    .line 628
    .line 629
    goto :goto_10

    .line 630
    :cond_19
    const/4 v1, 0x0

    .line 631
    invoke-virtual {v0, v1, v1, v1, v1}, Lyyds/ᛷᲁᲀᛸ;->ᲇᲈᛵᛷ(IIZZ)V

    .line 632
    .line 633
    .line 634
    :goto_f
    iput-object v0, v4, Lyyds/ᛶᛴᛲᛸ;->ᛶᲈᛴᲈ:Lyyds/ᛳᛷᛶᛵ;

    .line 635
    .line 636
    :cond_1a
    :goto_10
    const/4 v0, 0x0

    .line 637
    iput-object v0, v4, Lyyds/ᛶᛴᛲᛸ;->ᛵᲀᲈᛴ:Lyyds/ᲈᛵᛶᛲ;

    .line 638
    .line 639
    return-void

    .line 640
    nop

    .line 641
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
