.class public final Lyyds/ᛴᛶᛳᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛴᛶᛳᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛴᛶᛳᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lyyds/ᛴᛶᛳᛸ;->ᲀᛲᛳᲀ:I

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const/16 v7, 0x8

    .line 9
    .line 10
    const/4 v8, -0x1

    .line 11
    const/4 v9, 0x2

    .line 12
    const/4 v10, 0x0

    .line 13
    const/4 v11, 0x1

    .line 14
    const/4 v12, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-object v0, v1, Lyyds/ᛴᛶᛳᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lyyds/ᛸᲀᲈ;

    .line 21
    .line 22
    iget-object v0, v0, Lyyds/ᛸᲀᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲁᛲᛳ;

    .line 23
    .line 24
    iget-object v0, v0, Lyyds/ᛶᲁᛲᛳ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lyyds/ᲇᛵᲈᲈ;

    .line 27
    .line 28
    iget-object v1, v0, Lyyds/ᲇᛵᲈᲈ;->ᛷᲈᲈᲁ:Lyyds/ᛷᲀᛳᛱ;

    .line 29
    .line 30
    iget v1, v1, Lyyds/ᛷᲀᛳᛱ;->ᛷᛶᛷᲀ:I

    .line 31
    .line 32
    if-le v1, v8, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0, v10}, Lyyds/ᲇᛵᲈᲈ;->ᛲᲈᲁ(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void

    .line 38
    :pswitch_0
    iget-object v0, v1, Lyyds/ᛴᛶᛳᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Lyyds/ᲁᛲᛴᲈ;

    .line 41
    .line 42
    iget-object v0, v0, Lyyds/ᲁᛲᛴᲈ;->ᲇᲈᛵᛷ:Lyyds/ᲇᛵᲈᲈ;

    .line 43
    .line 44
    iget-object v1, v0, Lyyds/ᲇᛵᲈᲈ;->ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 45
    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    invoke-virtual {v1, v7}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    :cond_1
    iget-object v0, v0, Lyyds/ᲇᛵᲈᲈ;->ᛷᲈᲈᲁ:Lyyds/ᛷᲀᛳᛱ;

    .line 52
    .line 53
    iget-object v0, v0, Lyyds/ᛷᲀᛳᛱ;->ᛷᲇᛲᛱ:Ljava/lang/ref/WeakReference;

    .line 54
    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    move-object v10, v0

    .line 63
    check-cast v10, Landroid/view/View;

    .line 64
    .line 65
    :goto_0
    invoke-static {v10}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛶᲁ(Landroid/view/View;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_1
    iget-object v0, v1, Lyyds/ᛴᛶᛳᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Lyyds/ᛳᛵᲀᛲ;

    .line 72
    .line 73
    iget-object v0, v0, Lyyds/ᛳᛵᲀᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Lyyds/ᲇᛵᲈᲈ;

    .line 76
    .line 77
    iget-object v1, v0, Lyyds/ᲇᛵᲈᲈ;->ᛷᲈᲈᲁ:Lyyds/ᛷᲀᛳᛱ;

    .line 78
    .line 79
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    if-nez v1, :cond_3

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    iget-object v1, v0, Lyyds/ᲇᛵᲈᲈ;->ᛷᲈᲈᲁ:Lyyds/ᛷᲀᛳᛱ;

    .line 87
    .line 88
    iget-object v2, v1, Lyyds/ᛷᲀᛳᛱ;->ᛷᛸᲇᛶ:Lyyds/ᲁᛳᲀᛸ;

    .line 89
    .line 90
    if-nez v2, :cond_4

    .line 91
    .line 92
    new-instance v2, Lyyds/ᲁᛳᲀᛸ;

    .line 93
    .line 94
    invoke-direct {v2, v9, v0}, Lyyds/ᲁᛳᲀᛸ;-><init>(ILjava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iput-object v2, v1, Lyyds/ᛷᲀᛳᛱ;->ᛷᛸᲇᛶ:Lyyds/ᲁᛳᲀᛸ;

    .line 98
    .line 99
    :cond_4
    invoke-virtual {v2, v1}, Lyyds/ᲁᛳᲀᛸ;->ᛶᲈᛴᲈ(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    new-instance v1, Lyyds/ᛶᛵᲁᛵ;

    .line 103
    .line 104
    invoke-direct {v1}, Lyyds/ᛶᛵᲁᛵ;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Lyyds/ᛶᛵᲁᛵ;->ᲇᲈᛵᛷ()V

    .line 108
    .line 109
    .line 110
    iget-object v0, v0, Lyyds/ᲇᛵᲈᲈ;->ᛷᲈᲈᲁ:Lyyds/ᛷᲀᛳᛱ;

    .line 111
    .line 112
    sget-object v1, Lyyds/ᛶᲈᛷᛸ;->ᛶᛷᛲᲁ:Lyyds/ᛶᲈᛷᛸ;

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲈᛷᲈᛶ(Lyyds/ᛶᲈᛷᛸ;)V

    .line 115
    .line 116
    .line 117
    :goto_1
    return-void

    .line 118
    :pswitch_2
    iget-object v0, v1, Lyyds/ᛴᛶᛳᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 121
    .line 122
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->ᲀᛲᛳᲀ:Landroidx/appcompat/widget/ActionMenuView;

    .line 123
    .line 124
    if-eqz v0, :cond_5

    .line 125
    .line 126
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->ᛶᛸᲀᲁ:Lyyds/ᛶᛴᛲᛸ;

    .line 127
    .line 128
    if-eqz v0, :cond_5

    .line 129
    .line 130
    invoke-virtual {v0}, Lyyds/ᛶᛴᛲᛸ;->ᛷᛵᲇᲀ()Z

    .line 131
    .line 132
    .line 133
    :cond_5
    return-void

    .line 134
    :pswitch_3
    iget-object v0, v1, Lyyds/ᛴᛶᛳᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 135
    .line 136
    move-object v2, v0

    .line 137
    check-cast v2, Lyyds/ᛱᛴᛳᛱ;

    .line 138
    .line 139
    monitor-enter v2

    .line 140
    :try_start_0
    iget v0, v2, Lyyds/ᛱᛴᛳᛱ;->ᛶᛷᛲᲁ:I

    .line 141
    .line 142
    add-int/2addr v0, v11

    .line 143
    iput v0, v2, Lyyds/ᛱᛴᛳᛱ;->ᛶᛷᛲᲁ:I

    .line 144
    .line 145
    invoke-virtual {v2}, Lyyds/ᛱᛴᛳᛱ;->ᛵᛸᛸᛷ()Lyyds/ᛳᲀᛵᛸ;

    .line 146
    .line 147
    .line 148
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 149
    monitor-exit v2

    .line 150
    if-nez v0, :cond_6

    .line 151
    .line 152
    goto/16 :goto_5

    .line 153
    .line 154
    :cond_6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    :cond_7
    move-object v4, v0

    .line 163
    :try_start_1
    iget-object v0, v4, Lyyds/ᛳᲀᛵᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 164
    .line 165
    invoke-virtual {v2, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    iget-object v0, v1, Lyyds/ᛴᛶᛳᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v0, Lyyds/ᛱᛴᛳᛱ;

    .line 171
    .line 172
    iget-object v7, v0, Lyyds/ᛱᛴᛳᛱ;->ᛵᛸᛸᛷ:Ljava/util/logging/Logger;

    .line 173
    .line 174
    iget-object v8, v4, Lyyds/ᛳᲀᛵᛸ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛷᛱᛳ;

    .line 175
    .line 176
    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 177
    .line 178
    invoke-virtual {v7, v0}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 179
    .line 180
    .line 181
    move-result v9

    .line 182
    if-eqz v9, :cond_8

    .line 183
    .line 184
    iget-object v0, v8, Lyyds/ᛱᛷᛱᛳ;->ᛲᲈᲁ:Lyyds/ᛱᛴᛳᛱ;

    .line 185
    .line 186
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 187
    .line 188
    .line 189
    move-result-wide v13

    .line 190
    const-string v0, "starting"

    .line 191
    .line 192
    invoke-static {v7, v4, v8, v0}, Lyyds/ᲁᲀᲈᛸ;->ᛱᲈᲁ(Ljava/util/logging/Logger;Lyyds/ᛳᲀᛵᛸ;Lyyds/ᛱᛷᛱᛳ;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 193
    .line 194
    .line 195
    goto :goto_2

    .line 196
    :catchall_0
    move-exception v0

    .line 197
    goto :goto_4

    .line 198
    :cond_8
    const-wide/16 v13, -0x1

    .line 199
    .line 200
    :goto_2
    :try_start_2
    invoke-virtual {v4}, Lyyds/ᛳᲀᛵᛸ;->ᛲᲈᲁ()J

    .line 201
    .line 202
    .line 203
    move-result-wide v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 204
    if-eqz v9, :cond_9

    .line 205
    .line 206
    :try_start_3
    iget-object v0, v8, Lyyds/ᛱᛷᛱᛳ;->ᛲᲈᲁ:Lyyds/ᛱᛴᛳᛱ;

    .line 207
    .line 208
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 209
    .line 210
    .line 211
    move-result-wide v9

    .line 212
    sub-long/2addr v9, v13

    .line 213
    new-instance v0, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 216
    .line 217
    .line 218
    const-string v13, "finished run in "

    .line 219
    .line 220
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛵᛸᛸᛷ(J)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v9

    .line 227
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-static {v7, v4, v8, v0}, Lyyds/ᲁᲀᲈᛸ;->ᛱᲈᲁ(Ljava/util/logging/Logger;Lyyds/ᛳᲀᛵᛸ;Lyyds/ᛱᛷᛱᛳ;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    :cond_9
    iget-object v0, v1, Lyyds/ᛴᛶᛳᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 238
    .line 239
    move-object v7, v0

    .line 240
    check-cast v7, Lyyds/ᛱᛴᛳᛱ;

    .line 241
    .line 242
    monitor-enter v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 243
    :try_start_4
    invoke-virtual {v7, v4, v5, v6, v11}, Lyyds/ᛱᛴᛳᛱ;->ᛲᲈᲁ(Lyyds/ᛳᲀᛵᛸ;JZ)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v7}, Lyyds/ᛱᛴᛳᛱ;->ᛵᛸᛸᛷ()Lyyds/ᛳᲀᛵᛸ;

    .line 247
    .line 248
    .line 249
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 250
    :try_start_5
    monitor-exit v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 251
    if-nez v0, :cond_7

    .line 252
    .line 253
    :goto_3
    invoke-virtual {v2, v3}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    goto :goto_5

    .line 257
    :catchall_1
    move-exception v0

    .line 258
    :try_start_6
    monitor-exit v7

    .line 259
    throw v0

    .line 260
    :catchall_2
    move-exception v0

    .line 261
    if-eqz v9, :cond_a

    .line 262
    .line 263
    iget-object v5, v8, Lyyds/ᛱᛷᛱᛳ;->ᛲᲈᲁ:Lyyds/ᛱᛴᛳᛱ;

    .line 264
    .line 265
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 266
    .line 267
    .line 268
    move-result-wide v5

    .line 269
    sub-long/2addr v5, v13

    .line 270
    new-instance v9, Ljava/lang/StringBuilder;

    .line 271
    .line 272
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 273
    .line 274
    .line 275
    const-string v10, "failed a run in "

    .line 276
    .line 277
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛵᛸᛸᛷ(J)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v5

    .line 284
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    invoke-static {v7, v4, v8, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛱᲈᲁ(Ljava/util/logging/Logger;Lyyds/ᛳᲀᛵᛸ;Lyyds/ᛱᛷᛱᛳ;Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    :cond_a
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 295
    :goto_4
    :try_start_7
    iget-object v1, v1, Lyyds/ᛴᛶᛳᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v1, Lyyds/ᛱᛴᛳᛱ;

    .line 298
    .line 299
    monitor-enter v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 300
    const-wide/16 v5, -0x1

    .line 301
    .line 302
    :try_start_8
    invoke-virtual {v1, v4, v5, v6, v12}, Lyyds/ᛱᛴᛳᛱ;->ᛲᲈᲁ(Lyyds/ᛳᲀᛵᛸ;JZ)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 303
    .line 304
    .line 305
    :try_start_9
    monitor-exit v1

    .line 306
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 307
    .line 308
    if-eqz v1, :cond_b

    .line 309
    .line 310
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 315
    .line 316
    .line 317
    goto :goto_3

    .line 318
    :goto_5
    return-void

    .line 319
    :catchall_3
    move-exception v0

    .line 320
    goto :goto_6

    .line 321
    :cond_b
    throw v0

    .line 322
    :catchall_4
    move-exception v0

    .line 323
    monitor-exit v1

    .line 324
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 325
    :goto_6
    invoke-virtual {v2, v3}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    throw v0

    .line 329
    :catchall_5
    move-exception v0

    .line 330
    monitor-exit v2

    .line 331
    throw v0

    .line 332
    :pswitch_4
    iget-object v0, v1, Lyyds/ᛴᛶᛳᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 335
    .line 336
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ᛵᛸᲈᛷ()Z

    .line 337
    .line 338
    .line 339
    return-void

    .line 340
    :pswitch_5
    iget-object v0, v1, Lyyds/ᛴᛶᛳᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v0, Lyyds/ᲁᛷᛲ;

    .line 343
    .line 344
    iget-object v1, v0, Lyyds/ᲁᛷᛲ;->ᛲᛴᛳᛲ:Lyyds/ᲀᲇᛵ;

    .line 345
    .line 346
    invoke-interface {v1, v0}, Lyyds/ᲀᲇᛵ;->ᛵᛸᛸᛷ(Lyyds/ᛵᛱᛸᲁ;)V

    .line 347
    .line 348
    .line 349
    return-void

    .line 350
    :pswitch_6
    iget-object v0, v1, Lyyds/ᛴᛶᛳᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast v0, Lyyds/ᛲᛳᛱᛲ;

    .line 353
    .line 354
    invoke-virtual {v0}, Lyyds/ᛲᛳᛱᛲ;->ᛱᲀᲈᛲ()V

    .line 355
    .line 356
    .line 357
    return-void

    .line 358
    :pswitch_7
    iget-object v0, v1, Lyyds/ᛴᛶᛳᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v0, Lyyds/ᲁᛷᲇᛸ;

    .line 361
    .line 362
    iget-object v1, v0, Lyyds/ᲁᛷᲇᛸ;->ᛲᛴᛳᛲ:Landroid/view/View;

    .line 363
    .line 364
    check-cast v1, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 365
    .line 366
    if-eqz v1, :cond_c

    .line 367
    .line 368
    invoke-virtual {v1, v7}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->setVisibility(I)V

    .line 369
    .line 370
    .line 371
    :cond_c
    iget-object v0, v0, Lyyds/ᲁᛷᲇᛸ;->ᛵᛶᛲᲀ:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v0, Lyyds/ᛵᲀᲀᛱ;

    .line 374
    .line 375
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ()Landroid/view/View;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛶᲁ(Landroid/view/View;)V

    .line 380
    .line 381
    .line 382
    return-void

    .line 383
    :pswitch_8
    iget-object v0, v1, Lyyds/ᛴᛶᛳᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast v0, Lyyds/ᛳᛵᲀᛲ;

    .line 386
    .line 387
    iget-object v0, v0, Lyyds/ᛳᛵᲀᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v0, Lyyds/ᲁᛷᲇᛸ;

    .line 390
    .line 391
    iget-object v1, v0, Lyyds/ᲁᛷᲇᛸ;->ᲀᛲᛳᲀ:Landroid/widget/EditText;

    .line 392
    .line 393
    if-eqz v1, :cond_e

    .line 394
    .line 395
    iget-object v2, v0, Lyyds/ᲁᛷᲇᛸ;->ᛵᛶᛲᲀ:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast v2, Lyyds/ᛵᲀᲀᛱ;

    .line 398
    .line 399
    iget-object v2, v2, Lyyds/ᛵᲀᲀᛱ;->ᛷᛸᲇᛶ:Lyyds/ᛵᲀᲀᛱ;

    .line 400
    .line 401
    instance-of v2, v2, Lyyds/ᲀᛸᲇᛴ;

    .line 402
    .line 403
    if-nez v2, :cond_d

    .line 404
    .line 405
    goto :goto_7

    .line 406
    :cond_d
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 407
    .line 408
    .line 409
    iget-object v1, v0, Lyyds/ᲁᛷᲇᛸ;->ᲀᛲᛳᲀ:Landroid/widget/EditText;

    .line 410
    .line 411
    invoke-virtual {v1, v11}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 412
    .line 413
    .line 414
    iget-object v1, v0, Lyyds/ᲁᛷᲇᛸ;->ᛵᛶᛲᲀ:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast v1, Lyyds/ᛵᲀᲀᛱ;

    .line 417
    .line 418
    iget-object v2, v0, Lyyds/ᲁᛷᲇᛸ;->ᲀᛲᛳᲀ:Landroid/widget/EditText;

    .line 419
    .line 420
    invoke-virtual {v1, v2, v11}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛵᲀᲈᛴ(Landroid/widget/EditText;Z)V

    .line 421
    .line 422
    .line 423
    iget-object v1, v0, Lyyds/ᲁᛷᲇᛸ;->ᲀᛲᛳᲀ:Landroid/widget/EditText;

    .line 424
    .line 425
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 430
    .line 431
    .line 432
    move-result v2

    .line 433
    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setSelection(I)V

    .line 434
    .line 435
    .line 436
    iget-object v1, v0, Lyyds/ᲁᛷᲇᛸ;->ᛵᛶᛲᲀ:Ljava/lang/Object;

    .line 437
    .line 438
    check-cast v1, Lyyds/ᛵᲀᲀᛱ;

    .line 439
    .line 440
    iget-object v1, v1, Lyyds/ᛵᲀᲀᛱ;->ᛲᲀᛵᛷ:Lyyds/ᲈᲇᛷᲈ;

    .line 441
    .line 442
    if-eqz v1, :cond_e

    .line 443
    .line 444
    iget-object v0, v0, Lyyds/ᲁᛷᲇᛸ;->ᲀᛲᛳᲀ:Landroid/widget/EditText;

    .line 445
    .line 446
    invoke-virtual {v0}, Landroid/widget/EditText;->selectAll()V

    .line 447
    .line 448
    .line 449
    :cond_e
    :goto_7
    return-void

    .line 450
    :pswitch_9
    iget-object v0, v1, Lyyds/ᛴᛶᛳᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast v0, Lyyds/ᛸᲁᛲᲀ;

    .line 453
    .line 454
    iget-object v5, v0, Lyyds/ᛸᲁᛲᲀ;->ᛲᛲᲈᲈ:Lyyds/ᲇᛵᛷᛶ;

    .line 455
    .line 456
    iget-object v6, v0, Lyyds/ᛸᲁᛲᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛸᛳᛵ;

    .line 457
    .line 458
    if-eqz v6, :cond_1c

    .line 459
    .line 460
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 461
    .line 462
    .line 463
    move-result-wide v13

    .line 464
    iget-wide v6, v0, Lyyds/ᛸᲁᛲᲀ;->ᛷᛸᲇᛶ:J

    .line 465
    .line 466
    const-wide/high16 v8, -0x8000000000000000L

    .line 467
    .line 468
    cmp-long v10, v6, v8

    .line 469
    .line 470
    if-nez v10, :cond_f

    .line 471
    .line 472
    goto :goto_8

    .line 473
    :cond_f
    sub-long v2, v13, v6

    .line 474
    .line 475
    :goto_8
    iget-object v6, v0, Lyyds/ᛸᲁᛲᲀ;->ᛵᛶᛲᲀ:Lyyds/ᛵᲇᛲᛱ;

    .line 476
    .line 477
    invoke-virtual {v6}, Lyyds/ᛵᲇᛲᛱ;->getLayoutManager()Lyyds/ᲇᲇᛵᛲ;

    .line 478
    .line 479
    .line 480
    move-result-object v6

    .line 481
    iget-object v7, v0, Lyyds/ᛸᲁᛲᲀ;->ᛲᛳᛴᛸ:Landroid/graphics/Rect;

    .line 482
    .line 483
    if-nez v7, :cond_10

    .line 484
    .line 485
    new-instance v7, Landroid/graphics/Rect;

    .line 486
    .line 487
    invoke-direct {v7}, Landroid/graphics/Rect;-><init>()V

    .line 488
    .line 489
    .line 490
    iput-object v7, v0, Lyyds/ᛸᲁᛲᲀ;->ᛲᛳᛴᛸ:Landroid/graphics/Rect;

    .line 491
    .line 492
    :cond_10
    iget-object v10, v0, Lyyds/ᛸᲁᛲᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛸᛳᛵ;

    .line 493
    .line 494
    iget-object v10, v10, Lyyds/ᛱᛸᛳᛵ;->ᛲᲈᲁ:Landroid/view/View;

    .line 495
    .line 496
    iget-object v11, v6, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 497
    .line 498
    if-nez v11, :cond_11

    .line 499
    .line 500
    invoke-virtual {v7, v12, v12, v12, v12}, Landroid/graphics/Rect;->set(IIII)V

    .line 501
    .line 502
    .line 503
    goto :goto_9

    .line 504
    :cond_11
    invoke-virtual {v11, v10}, Lyyds/ᛵᲇᛲᛱ;->ᛶᲀᲈᲇ(Landroid/view/View;)Landroid/graphics/Rect;

    .line 505
    .line 506
    .line 507
    move-result-object v10

    .line 508
    invoke-virtual {v7, v10}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 509
    .line 510
    .line 511
    :goto_9
    invoke-virtual {v6}, Lyyds/ᲇᲇᛵᛲ;->ᲇᲈᛵᛷ()Z

    .line 512
    .line 513
    .line 514
    move-result v7

    .line 515
    if-eqz v7, :cond_13

    .line 516
    .line 517
    iget v7, v0, Lyyds/ᛸᲁᛲᲀ;->ᛷᲈᲈᲁ:F

    .line 518
    .line 519
    iget v10, v0, Lyyds/ᛸᲁᛲᲀ;->ᛱᲈᲁ:F

    .line 520
    .line 521
    add-float/2addr v7, v10

    .line 522
    float-to-int v7, v7

    .line 523
    iget-object v10, v0, Lyyds/ᛸᲁᛲᲀ;->ᛲᛳᛴᛸ:Landroid/graphics/Rect;

    .line 524
    .line 525
    iget v10, v10, Landroid/graphics/Rect;->left:I

    .line 526
    .line 527
    sub-int v10, v7, v10

    .line 528
    .line 529
    iget-object v11, v0, Lyyds/ᛸᲁᛲᲀ;->ᛵᛶᛲᲀ:Lyyds/ᛵᲇᛲᛱ;

    .line 530
    .line 531
    invoke-virtual {v11}, Landroid/view/View;->getPaddingLeft()I

    .line 532
    .line 533
    .line 534
    move-result v11

    .line 535
    sub-int/2addr v10, v11

    .line 536
    iget v11, v0, Lyyds/ᛸᲁᛲᲀ;->ᛱᲈᲁ:F

    .line 537
    .line 538
    cmpg-float v15, v11, v4

    .line 539
    .line 540
    if-gez v15, :cond_12

    .line 541
    .line 542
    if-gez v10, :cond_12

    .line 543
    .line 544
    goto :goto_a

    .line 545
    :cond_12
    cmpl-float v10, v11, v4

    .line 546
    .line 547
    if-lez v10, :cond_13

    .line 548
    .line 549
    iget-object v10, v0, Lyyds/ᛸᲁᛲᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛸᛳᛵ;

    .line 550
    .line 551
    iget-object v10, v10, Lyyds/ᛱᛸᛳᛵ;->ᛲᲈᲁ:Landroid/view/View;

    .line 552
    .line 553
    invoke-virtual {v10}, Landroid/view/View;->getWidth()I

    .line 554
    .line 555
    .line 556
    move-result v10

    .line 557
    add-int/2addr v10, v7

    .line 558
    iget-object v7, v0, Lyyds/ᛸᲁᛲᲀ;->ᛲᛳᛴᛸ:Landroid/graphics/Rect;

    .line 559
    .line 560
    iget v7, v7, Landroid/graphics/Rect;->right:I

    .line 561
    .line 562
    add-int/2addr v10, v7

    .line 563
    iget-object v7, v0, Lyyds/ᛸᲁᛲᲀ;->ᛵᛶᛲᲀ:Lyyds/ᛵᲇᛲᛱ;

    .line 564
    .line 565
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    .line 566
    .line 567
    .line 568
    move-result v7

    .line 569
    iget-object v11, v0, Lyyds/ᛸᲁᛲᲀ;->ᛵᛶᛲᲀ:Lyyds/ᛵᲇᛲᛱ;

    .line 570
    .line 571
    invoke-virtual {v11}, Landroid/view/View;->getPaddingRight()I

    .line 572
    .line 573
    .line 574
    move-result v11

    .line 575
    sub-int/2addr v7, v11

    .line 576
    sub-int/2addr v10, v7

    .line 577
    if-lez v10, :cond_13

    .line 578
    .line 579
    goto :goto_a

    .line 580
    :cond_13
    move v10, v12

    .line 581
    :goto_a
    invoke-virtual {v6}, Lyyds/ᲇᲇᛵᛲ;->ᛲᛴᛳᛲ()Z

    .line 582
    .line 583
    .line 584
    move-result v6

    .line 585
    if-eqz v6, :cond_15

    .line 586
    .line 587
    iget v6, v0, Lyyds/ᛸᲁᛲᲀ;->ᛷᛲᲈᛱ:F

    .line 588
    .line 589
    iget v7, v0, Lyyds/ᛸᲁᛲᲀ;->ᛲᛳᛶᲁ:F

    .line 590
    .line 591
    add-float/2addr v6, v7

    .line 592
    float-to-int v6, v6

    .line 593
    iget-object v7, v0, Lyyds/ᛸᲁᛲᲀ;->ᛲᛳᛴᛸ:Landroid/graphics/Rect;

    .line 594
    .line 595
    iget v7, v7, Landroid/graphics/Rect;->top:I

    .line 596
    .line 597
    sub-int v7, v6, v7

    .line 598
    .line 599
    iget-object v11, v0, Lyyds/ᛸᲁᛲᲀ;->ᛵᛶᛲᲀ:Lyyds/ᛵᲇᛲᛱ;

    .line 600
    .line 601
    invoke-virtual {v11}, Landroid/view/View;->getPaddingTop()I

    .line 602
    .line 603
    .line 604
    move-result v11

    .line 605
    sub-int/2addr v7, v11

    .line 606
    iget v11, v0, Lyyds/ᛸᲁᛲᲀ;->ᛲᛳᛶᲁ:F

    .line 607
    .line 608
    cmpg-float v15, v11, v4

    .line 609
    .line 610
    if-gez v15, :cond_14

    .line 611
    .line 612
    if-gez v7, :cond_14

    .line 613
    .line 614
    move v12, v7

    .line 615
    goto :goto_b

    .line 616
    :cond_14
    cmpl-float v4, v11, v4

    .line 617
    .line 618
    if-lez v4, :cond_15

    .line 619
    .line 620
    iget-object v4, v0, Lyyds/ᛸᲁᛲᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛸᛳᛵ;

    .line 621
    .line 622
    iget-object v4, v4, Lyyds/ᛱᛸᛳᛵ;->ᛲᲈᲁ:Landroid/view/View;

    .line 623
    .line 624
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 625
    .line 626
    .line 627
    move-result v4

    .line 628
    add-int/2addr v4, v6

    .line 629
    iget-object v6, v0, Lyyds/ᛸᲁᛲᲀ;->ᛲᛳᛴᛸ:Landroid/graphics/Rect;

    .line 630
    .line 631
    iget v6, v6, Landroid/graphics/Rect;->bottom:I

    .line 632
    .line 633
    add-int/2addr v4, v6

    .line 634
    iget-object v6, v0, Lyyds/ᛸᲁᛲᲀ;->ᛵᛶᛲᲀ:Lyyds/ᛵᲇᛲᛱ;

    .line 635
    .line 636
    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    .line 637
    .line 638
    .line 639
    move-result v6

    .line 640
    iget-object v7, v0, Lyyds/ᛸᲁᛲᲀ;->ᛵᛶᛲᲀ:Lyyds/ᛵᲇᛲᛱ;

    .line 641
    .line 642
    invoke-virtual {v7}, Landroid/view/View;->getPaddingBottom()I

    .line 643
    .line 644
    .line 645
    move-result v7

    .line 646
    sub-int/2addr v6, v7

    .line 647
    sub-int/2addr v4, v6

    .line 648
    if-lez v4, :cond_15

    .line 649
    .line 650
    move v12, v4

    .line 651
    :cond_15
    :goto_b
    if-eqz v10, :cond_16

    .line 652
    .line 653
    iget-object v6, v0, Lyyds/ᛸᲁᛲᲀ;->ᛵᛶᛲᲀ:Lyyds/ᛵᲇᛲᛱ;

    .line 654
    .line 655
    iget-object v4, v0, Lyyds/ᛸᲁᛲᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛸᛳᛵ;

    .line 656
    .line 657
    iget-object v4, v4, Lyyds/ᛱᛸᛳᛵ;->ᛲᲈᲁ:Landroid/view/View;

    .line 658
    .line 659
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 660
    .line 661
    .line 662
    move-result v7

    .line 663
    iget-object v4, v0, Lyyds/ᛸᲁᛲᲀ;->ᛵᛶᛲᲀ:Lyyds/ᛵᲇᛲᛱ;

    .line 664
    .line 665
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 666
    .line 667
    .line 668
    move-wide/from16 v21, v8

    .line 669
    .line 670
    move v8, v10

    .line 671
    move-wide v9, v2

    .line 672
    move-wide/from16 v2, v21

    .line 673
    .line 674
    invoke-virtual/range {v5 .. v10}, Lyyds/ᲇᛵᛷᛶ;->ᲇᲈᛵᛷ(Lyyds/ᛵᲇᛲᛱ;IIJ)I

    .line 675
    .line 676
    .line 677
    move-result v4

    .line 678
    goto :goto_c

    .line 679
    :cond_16
    move-wide/from16 v21, v8

    .line 680
    .line 681
    move v8, v10

    .line 682
    move-wide v9, v2

    .line 683
    move-wide/from16 v2, v21

    .line 684
    .line 685
    move v4, v8

    .line 686
    :goto_c
    if-eqz v12, :cond_17

    .line 687
    .line 688
    iget-object v6, v0, Lyyds/ᛸᲁᛲᲀ;->ᛵᛶᛲᲀ:Lyyds/ᛵᲇᛲᛱ;

    .line 689
    .line 690
    iget-object v7, v0, Lyyds/ᛸᲁᛲᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛸᛳᛵ;

    .line 691
    .line 692
    iget-object v7, v7, Lyyds/ᛱᛸᛳᛵ;->ᛲᲈᲁ:Landroid/view/View;

    .line 693
    .line 694
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    .line 695
    .line 696
    .line 697
    move-result v7

    .line 698
    iget-object v8, v0, Lyyds/ᛸᲁᛲᲀ;->ᛵᛶᛲᲀ:Lyyds/ᛵᲇᛲᛱ;

    .line 699
    .line 700
    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    .line 701
    .line 702
    .line 703
    move v8, v12

    .line 704
    invoke-virtual/range {v5 .. v10}, Lyyds/ᲇᛵᛷᛶ;->ᲇᲈᛵᛷ(Lyyds/ᛵᲇᛲᛱ;IIJ)I

    .line 705
    .line 706
    .line 707
    move-result v12

    .line 708
    goto :goto_d

    .line 709
    :cond_17
    move v8, v12

    .line 710
    :goto_d
    if-nez v4, :cond_19

    .line 711
    .line 712
    if-eqz v12, :cond_18

    .line 713
    .line 714
    goto :goto_e

    .line 715
    :cond_18
    iput-wide v2, v0, Lyyds/ᛸᲁᛲᲀ;->ᛷᛸᲇᛶ:J

    .line 716
    .line 717
    goto :goto_f

    .line 718
    :cond_19
    :goto_e
    iget-wide v5, v0, Lyyds/ᛸᲁᛲᲀ;->ᛷᛸᲇᛶ:J

    .line 719
    .line 720
    cmp-long v2, v5, v2

    .line 721
    .line 722
    if-nez v2, :cond_1a

    .line 723
    .line 724
    iput-wide v13, v0, Lyyds/ᛸᲁᛲᲀ;->ᛷᛸᲇᛶ:J

    .line 725
    .line 726
    :cond_1a
    iget-object v2, v0, Lyyds/ᛸᲁᛲᲀ;->ᛵᛶᛲᲀ:Lyyds/ᛵᲇᛲᛱ;

    .line 727
    .line 728
    invoke-virtual {v2, v4, v12}, Lyyds/ᛵᲇᛲᛱ;->scrollBy(II)V

    .line 729
    .line 730
    .line 731
    iget-object v2, v0, Lyyds/ᛸᲁᛲᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛸᛳᛵ;

    .line 732
    .line 733
    if-eqz v2, :cond_1b

    .line 734
    .line 735
    invoke-virtual {v0, v2}, Lyyds/ᛸᲁᛲᲀ;->ᛳᲁᲁᲇ(Lyyds/ᛱᛸᛳᛵ;)V

    .line 736
    .line 737
    .line 738
    :cond_1b
    iget-object v2, v0, Lyyds/ᛸᲁᛲᲀ;->ᛵᛶᛲᲀ:Lyyds/ᛵᲇᛲᛱ;

    .line 739
    .line 740
    iget-object v3, v0, Lyyds/ᛸᲁᛲᲀ;->ᲀᛲᛲᲇ:Lyyds/ᛴᛶᛳᛸ;

    .line 741
    .line 742
    invoke-virtual {v2, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 743
    .line 744
    .line 745
    iget-object v0, v0, Lyyds/ᛸᲁᛲᲀ;->ᛵᛶᛲᲀ:Lyyds/ᛵᲇᛲᛱ;

    .line 746
    .line 747
    sget-object v2, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 748
    .line 749
    invoke-virtual {v0, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 750
    .line 751
    .line 752
    :cond_1c
    :goto_f
    return-void

    .line 753
    :pswitch_a
    iget-object v0, v1, Lyyds/ᛴᛶᛳᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 754
    .line 755
    check-cast v0, Lyyds/ᲈᲇᲀᛲ;

    .line 756
    .line 757
    invoke-virtual {v0}, Lyyds/ᲈᲇᲀᛲ;->ᛲᛳᛶᲁ()V

    .line 758
    .line 759
    .line 760
    throw v10

    .line 761
    :pswitch_b
    iget-object v0, v1, Lyyds/ᛴᛶᛳᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 762
    .line 763
    check-cast v0, Lyyds/ᲇᛷᛱᛵ;

    .line 764
    .line 765
    iget-object v1, v0, Lyyds/ᲇᛷᛱᛵ;->ᛶᛷᛲᲁ:Lyyds/ᛳᛷᲀᛴ;

    .line 766
    .line 767
    if-eqz v1, :cond_1d

    .line 768
    .line 769
    iget-object v1, v0, Lyyds/ᲇᛷᛱᛵ;->ᛶᛷᛲᲁ:Lyyds/ᛳᛷᲀᛴ;

    .line 770
    .line 771
    if-nez v1, :cond_1d

    .line 772
    .line 773
    new-instance v1, Lyyds/ᛳᛷᲀᛴ;

    .line 774
    .line 775
    const/16 v2, 0x10

    .line 776
    .line 777
    invoke-direct {v1, v2, v12}, Lyyds/ᛳᛷᲀᛴ;-><init>(IZ)V

    .line 778
    .line 779
    .line 780
    sget-object v2, Lyyds/ᲇᛷᛱᛵ;->ᛲᛲᲈᲈ:Ljava/lang/Object;

    .line 781
    .line 782
    iput-object v2, v1, Lyyds/ᛳᛷᲀᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 783
    .line 784
    iput-object v2, v1, Lyyds/ᛳᛷᲀᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 785
    .line 786
    iput-object v2, v1, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 787
    .line 788
    iput-object v1, v0, Lyyds/ᲇᛷᛱᛵ;->ᛶᛷᛲᲁ:Lyyds/ᛳᛷᲀᛴ;

    .line 789
    .line 790
    :cond_1d
    return-void

    .line 791
    :pswitch_c
    iget-object v0, v1, Lyyds/ᛴᛶᛳᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 792
    .line 793
    check-cast v0, Lyyds/ᲈᲇᛲᛶ;

    .line 794
    .line 795
    iget-object v1, v0, Lyyds/ᲈᲇᛲᛶ;->ᛵᲀᛵᛸ:Landroid/animation/ValueAnimator;

    .line 796
    .line 797
    iget v2, v0, Lyyds/ᲈᲇᛲᛶ;->ᛲᛳᛴᛸ:I

    .line 798
    .line 799
    if-eq v2, v11, :cond_1e

    .line 800
    .line 801
    if-eq v2, v9, :cond_1f

    .line 802
    .line 803
    goto :goto_10

    .line 804
    :cond_1e
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 805
    .line 806
    .line 807
    :cond_1f
    const/4 v2, 0x3

    .line 808
    iput v2, v0, Lyyds/ᲈᲇᛲᛶ;->ᛲᛳᛴᛸ:I

    .line 809
    .line 810
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 811
    .line 812
    .line 813
    move-result-object v0

    .line 814
    check-cast v0, Ljava/lang/Float;

    .line 815
    .line 816
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 817
    .line 818
    .line 819
    move-result v0

    .line 820
    new-array v2, v9, [F

    .line 821
    .line 822
    aput v0, v2, v12

    .line 823
    .line 824
    aput v4, v2, v11

    .line 825
    .line 826
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 827
    .line 828
    .line 829
    const-wide/16 v2, 0x1f4

    .line 830
    .line 831
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 832
    .line 833
    .line 834
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    .line 835
    .line 836
    .line 837
    :goto_10
    return-void

    .line 838
    :pswitch_d
    iget-object v0, v1, Lyyds/ᛴᛶᛳᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 839
    .line 840
    check-cast v0, Lyyds/ᲀᛸᛲᛸ;

    .line 841
    .line 842
    iput-object v10, v0, Lyyds/ᲀᛸᛲᛸ;->ᛱᛳᲇ:Lyyds/ᛴᛶᛳᛸ;

    .line 843
    .line 844
    invoke-virtual {v0}, Lyyds/ᲀᛸᛲᛸ;->drawableStateChanged()V

    .line 845
    .line 846
    .line 847
    return-void

    .line 848
    :pswitch_e
    iget-object v0, v1, Lyyds/ᛴᛶᛳᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 849
    .line 850
    move-object v2, v0

    .line 851
    check-cast v2, Lyyds/ᛲᛲᛶᛶ;

    .line 852
    .line 853
    :goto_11
    iget-boolean v0, v2, Lyyds/ᛲᛲᛶᛶ;->ᲇᲈᛵᛷ:Z

    .line 854
    .line 855
    if-eqz v0, :cond_25

    .line 856
    .line 857
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 858
    .line 859
    .line 860
    move-result-wide v3

    .line 861
    iget-wide v5, v2, Lyyds/ᛲᛲᛶᛶ;->ᲀᛲᛳᲀ:J

    .line 862
    .line 863
    sub-long/2addr v3, v5

    .line 864
    iget-wide v5, v2, Lyyds/ᛲᛲᛶᛶ;->ᛵᛸᛸᛷ:J

    .line 865
    .line 866
    cmp-long v0, v3, v5

    .line 867
    .line 868
    if-gez v0, :cond_22

    .line 869
    .line 870
    long-to-float v0, v3

    .line 871
    long-to-float v3, v5

    .line 872
    div-float/2addr v0, v3

    .line 873
    iget-object v3, v2, Lyyds/ᛲᛲᛶᛶ;->ᲇᲇᲇᛱ:Landroid/view/animation/Interpolator;

    .line 874
    .line 875
    if-eqz v3, :cond_20

    .line 876
    .line 877
    invoke-interface {v3, v0}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 878
    .line 879
    .line 880
    move-result v0

    .line 881
    :cond_20
    iget v3, v2, Lyyds/ᛲᛲᛶᛶ;->ᛶᛷᛲᲁ:F

    .line 882
    .line 883
    iget v4, v2, Lyyds/ᛲᛲᛶᛶ;->ᛱᲈᲁ:F

    .line 884
    .line 885
    sub-float/2addr v4, v3

    .line 886
    mul-float/2addr v4, v0

    .line 887
    add-float/2addr v4, v3

    .line 888
    iget-object v0, v2, Lyyds/ᛲᛲᛶᛶ;->ᛲᛴᛳᛲ:Lyyds/ᲁᲁᛶᛸ;

    .line 889
    .line 890
    if-eqz v0, :cond_24

    .line 891
    .line 892
    iget-object v0, v2, Lyyds/ᛲᛲᛶᛶ;->ᛲᲈᲁ:Landroid/os/Handler;

    .line 893
    .line 894
    if-nez v0, :cond_21

    .line 895
    .line 896
    new-instance v0, Landroid/os/Handler;

    .line 897
    .line 898
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 899
    .line 900
    .line 901
    move-result-object v3

    .line 902
    invoke-direct {v0, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 903
    .line 904
    .line 905
    iput-object v0, v2, Lyyds/ᛲᛲᛶᛶ;->ᛲᲈᲁ:Landroid/os/Handler;

    .line 906
    .line 907
    :cond_21
    new-instance v3, Lyyds/ᲀᛸᲀᛸ;

    .line 908
    .line 909
    invoke-direct {v3, v1, v4}, Lyyds/ᲀᛸᲀᛸ;-><init>(Lyyds/ᛴᛶᛳᛸ;F)V

    .line 910
    .line 911
    .line 912
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 913
    .line 914
    .line 915
    goto :goto_12

    .line 916
    :cond_22
    iput-boolean v12, v2, Lyyds/ᛲᛲᛶᛶ;->ᲇᲈᛵᛷ:Z

    .line 917
    .line 918
    iget v0, v2, Lyyds/ᛲᛲᛶᛶ;->ᛲᛳᛶᲁ:I

    .line 919
    .line 920
    if-eq v0, v8, :cond_23

    .line 921
    .line 922
    iget v3, v2, Lyyds/ᛲᛲᛶᛶ;->ᛷᲈᲈᲁ:I

    .line 923
    .line 924
    if-ge v3, v0, :cond_24

    .line 925
    .line 926
    :cond_23
    iget v0, v2, Lyyds/ᛲᛲᛶᛶ;->ᛷᲈᲈᲁ:I

    .line 927
    .line 928
    add-int/2addr v0, v11

    .line 929
    iput v0, v2, Lyyds/ᛲᛲᛶᛶ;->ᛷᲈᲈᲁ:I

    .line 930
    .line 931
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 932
    .line 933
    .line 934
    move-result-wide v3

    .line 935
    iput-wide v3, v2, Lyyds/ᛲᛲᛶᛶ;->ᲀᛲᛳᲀ:J

    .line 936
    .line 937
    iput-boolean v11, v2, Lyyds/ᛲᛲᛶᛶ;->ᲇᲈᛵᛷ:Z

    .line 938
    .line 939
    :cond_24
    :goto_12
    :try_start_a
    iget v0, v2, Lyyds/ᛲᛲᛶᛶ;->ᛷᛲᲈᛱ:I

    .line 940
    .line 941
    int-to-long v3, v0

    .line 942
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_a
    .catch Ljava/lang/InterruptedException; {:try_start_a .. :try_end_a} :catch_0

    .line 943
    .line 944
    .line 945
    goto :goto_11

    .line 946
    :catch_0
    move-exception v0

    .line 947
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 948
    .line 949
    .line 950
    goto :goto_11

    .line 951
    :cond_25
    return-void

    .line 952
    :pswitch_f
    iget-object v0, v1, Lyyds/ᛴᛶᛳᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 953
    .line 954
    check-cast v0, Lyyds/ᲁᛵᛷᛲ;

    .line 955
    .line 956
    iget-object v0, v0, Lyyds/ᲁᛵᛷᛲ;->ᛱᛳᲇ:Lyyds/ᲈᲀᛴᛴ;

    .line 957
    .line 958
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 959
    .line 960
    .line 961
    return-void

    .line 962
    :pswitch_10
    iget-object v0, v1, Lyyds/ᛴᛶᛳᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 963
    .line 964
    check-cast v0, Lyyds/ᛵᛱᲀᛱ;

    .line 965
    .line 966
    invoke-virtual {v0}, Lyyds/ᛵᛱᲀᛱ;->ᲁᛵᲁᲁ()V

    .line 967
    .line 968
    .line 969
    return-void

    .line 970
    :pswitch_11
    iget-object v0, v1, Lyyds/ᛴᛶᛳᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 971
    .line 972
    check-cast v0, Lyyds/ᛲᛷᛱᛵ;

    .line 973
    .line 974
    iget-object v4, v0, Lyyds/ᛲᛷᛱᛵ;->ᛲᛴᛳᛲ:Lyyds/ᲀᛸᛲᛸ;

    .line 975
    .line 976
    iget-object v5, v0, Lyyds/ᛲᛷᛱᛵ;->ᲀᛲᛳᲀ:Lyyds/ᛷᲁᲁᛳ;

    .line 977
    .line 978
    iget-boolean v6, v0, Lyyds/ᛲᛷᛱᛵ;->ᲇᛱᛲ:Z

    .line 979
    .line 980
    if-nez v6, :cond_26

    .line 981
    .line 982
    goto/16 :goto_14

    .line 983
    .line 984
    :cond_26
    iget-boolean v6, v0, Lyyds/ᛲᛷᛱᛵ;->ᛱᛳᲇ:Z

    .line 985
    .line 986
    if-eqz v6, :cond_27

    .line 987
    .line 988
    iput-boolean v12, v0, Lyyds/ᛲᛷᛱᛵ;->ᛱᛳᲇ:Z

    .line 989
    .line 990
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 991
    .line 992
    .line 993
    move-result-wide v6

    .line 994
    iput-wide v6, v5, Lyyds/ᛷᲁᲁᛳ;->ᛲᛴᛳᛲ:J

    .line 995
    .line 996
    const-wide/16 v8, -0x1

    .line 997
    .line 998
    iput-wide v8, v5, Lyyds/ᛷᲁᲁᛳ;->ᛶᛷᛲᲁ:J

    .line 999
    .line 1000
    iput-wide v6, v5, Lyyds/ᛷᲁᲁᛳ;->ᲇᲇᲇᛱ:J

    .line 1001
    .line 1002
    const/high16 v6, 0x3f000000    # 0.5f

    .line 1003
    .line 1004
    iput v6, v5, Lyyds/ᛷᲁᲁᛳ;->ᛱᲈᲁ:F

    .line 1005
    .line 1006
    :cond_27
    iget-wide v6, v5, Lyyds/ᛷᲁᲁᛳ;->ᛶᛷᛲᲁ:J

    .line 1007
    .line 1008
    cmp-long v6, v6, v2

    .line 1009
    .line 1010
    if-lez v6, :cond_28

    .line 1011
    .line 1012
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1013
    .line 1014
    .line 1015
    move-result-wide v6

    .line 1016
    iget-wide v8, v5, Lyyds/ᛷᲁᲁᛳ;->ᛶᛷᛲᲁ:J

    .line 1017
    .line 1018
    iget v10, v5, Lyyds/ᛷᲁᲁᛳ;->ᛲᛳᛶᲁ:I

    .line 1019
    .line 1020
    int-to-long v10, v10

    .line 1021
    add-long/2addr v8, v10

    .line 1022
    cmp-long v6, v6, v8

    .line 1023
    .line 1024
    if-lez v6, :cond_28

    .line 1025
    .line 1026
    goto :goto_13

    .line 1027
    :cond_28
    invoke-virtual {v0}, Lyyds/ᛲᛷᛱᛵ;->ᛲᛴᛳᛲ()Z

    .line 1028
    .line 1029
    .line 1030
    move-result v6

    .line 1031
    if-nez v6, :cond_29

    .line 1032
    .line 1033
    :goto_13
    iput-boolean v12, v0, Lyyds/ᛲᛷᛱᛵ;->ᲇᛱᛲ:Z

    .line 1034
    .line 1035
    goto :goto_14

    .line 1036
    :cond_29
    iget-boolean v6, v0, Lyyds/ᛲᛷᛱᛵ;->ᛳᲁᲁᲇ:Z

    .line 1037
    .line 1038
    if-eqz v6, :cond_2a

    .line 1039
    .line 1040
    iput-boolean v12, v0, Lyyds/ᛲᛷᛱᛵ;->ᛳᲁᲁᲇ:Z

    .line 1041
    .line 1042
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1043
    .line 1044
    .line 1045
    move-result-wide v13

    .line 1046
    const/16 v19, 0x0

    .line 1047
    .line 1048
    const/16 v20, 0x0

    .line 1049
    .line 1050
    const/16 v17, 0x3

    .line 1051
    .line 1052
    const/16 v18, 0x0

    .line 1053
    .line 1054
    move-wide v15, v13

    .line 1055
    invoke-static/range {v13 .. v20}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v6

    .line 1059
    invoke-virtual {v4, v6}, Lyyds/ᲀᛸᛲᛸ;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v6}, Landroid/view/MotionEvent;->recycle()V

    .line 1063
    .line 1064
    .line 1065
    :cond_2a
    iget-wide v6, v5, Lyyds/ᛷᲁᲁᛳ;->ᲇᲇᲇᛱ:J

    .line 1066
    .line 1067
    cmp-long v2, v6, v2

    .line 1068
    .line 1069
    if-eqz v2, :cond_2b

    .line 1070
    .line 1071
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1072
    .line 1073
    .line 1074
    move-result-wide v2

    .line 1075
    invoke-virtual {v5, v2, v3}, Lyyds/ᛷᲁᲁᛳ;->ᛲᲈᲁ(J)F

    .line 1076
    .line 1077
    .line 1078
    move-result v6

    .line 1079
    const/high16 v7, -0x3f800000    # -4.0f

    .line 1080
    .line 1081
    mul-float/2addr v7, v6

    .line 1082
    mul-float/2addr v7, v6

    .line 1083
    const/high16 v8, 0x40800000    # 4.0f

    .line 1084
    .line 1085
    mul-float/2addr v6, v8

    .line 1086
    add-float/2addr v6, v7

    .line 1087
    iget-wide v7, v5, Lyyds/ᛷᲁᲁᛳ;->ᲇᲇᲇᛱ:J

    .line 1088
    .line 1089
    sub-long v7, v2, v7

    .line 1090
    .line 1091
    iput-wide v2, v5, Lyyds/ᛷᲁᲁᛳ;->ᲇᲇᲇᛱ:J

    .line 1092
    .line 1093
    long-to-float v2, v7

    .line 1094
    mul-float/2addr v2, v6

    .line 1095
    iget v3, v5, Lyyds/ᛷᲁᲁᛳ;->ᲇᲈᛵᛷ:F

    .line 1096
    .line 1097
    mul-float/2addr v2, v3

    .line 1098
    float-to-int v2, v2

    .line 1099
    iget-object v0, v0, Lyyds/ᛲᛷᛱᛵ;->ᛵᛶᛲᲀ:Lyyds/ᲀᛸᛲᛸ;

    .line 1100
    .line 1101
    invoke-virtual {v0, v2}, Landroid/widget/AbsListView;->scrollListBy(I)V

    .line 1102
    .line 1103
    .line 1104
    sget-object v0, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 1105
    .line 1106
    invoke-virtual {v4, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 1107
    .line 1108
    .line 1109
    :goto_14
    return-void

    .line 1110
    :cond_2b
    new-instance v0, Ljava/lang/RuntimeException;

    .line 1111
    .line 1112
    const-string v1, "Cannot compute scroll delta before calling start()"

    .line 1113
    .line 1114
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 1115
    .line 1116
    .line 1117
    throw v0

    .line 1118
    :pswitch_12
    iget-object v0, v1, Lyyds/ᛴᛶᛳᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 1119
    .line 1120
    check-cast v0, Lyyds/ᛳᛷᲀᛴ;

    .line 1121
    .line 1122
    :goto_15
    :try_start_b
    iget-object v1, v0, Lyyds/ᛳᛷᲀᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 1123
    .line 1124
    check-cast v1, Ljava/lang/ref/ReferenceQueue;

    .line 1125
    .line 1126
    invoke-virtual {v1}, Ljava/lang/ref/ReferenceQueue;->remove()Ljava/lang/ref/Reference;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v1

    .line 1130
    check-cast v1, Lyyds/ᛲᲈᲈ;

    .line 1131
    .line 1132
    invoke-virtual {v0, v1}, Lyyds/ᛳᛷᲀᛴ;->ᛲᛲᲈᲈ(Lyyds/ᛲᲈᲈ;)V
    :try_end_b
    .catch Ljava/lang/InterruptedException; {:try_start_b .. :try_end_b} :catch_1

    .line 1133
    .line 1134
    .line 1135
    goto :goto_15

    .line 1136
    :catch_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v1

    .line 1140
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 1141
    .line 1142
    .line 1143
    goto :goto_15

    .line 1144
    :pswitch_13
    const/16 v0, 0xa

    .line 1145
    .line 1146
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 1147
    .line 1148
    .line 1149
    iget-object v0, v1, Lyyds/ᛴᛶᛳᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 1150
    .line 1151
    check-cast v0, Ljava/lang/Runnable;

    .line 1152
    .line 1153
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 1154
    .line 1155
    .line 1156
    return-void

    .line 1157
    :pswitch_data_0
    .packed-switch 0x0
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
.end method
