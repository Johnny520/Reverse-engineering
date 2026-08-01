.class public final Lxhss/ᛴᲈᲀᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public final synthetic ᛳᲁᲇᛸ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lxhss/ᛴᲈᲀᲇ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iput-object p2, p0, Lxhss/ᛴᲈᲀᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

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
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lxhss/ᛴᲈᲀᲇ;->ᛱᛱᛲᲇ:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/16 v3, 0x8

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, -0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v0, v1, Lxhss/ᛴᲈᲀᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lxhss/ᛷᛸᲇᛸ;

    .line 17
    .line 18
    iget-object v0, v0, Lxhss/ᛷᛸᲇᛸ;->ᛳᲁᲇᛸ:Lxhss/ᛵᛶᛲᛳ;

    .line 19
    .line 20
    iget-object v0, v0, Lxhss/ᛵᛶᛲᛳ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lxhss/ᲀᲀ;

    .line 23
    .line 24
    iget-object v1, v0, Lxhss/ᲀᲀ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᛵ;

    .line 25
    .line 26
    iget v1, v1, Lxhss/ᛳᛴᛵ;->ᛳᛸᛵᲀ:I

    .line 27
    .line 28
    if-le v1, v5, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0, v4}, Lxhss/ᲀᲀ;->ᛷᛵᛵᲈ(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void

    .line 34
    :pswitch_0
    iget-object v0, v1, Lxhss/ᛴᲈᲀᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Lxhss/ᲈᛱᛳᛲ;

    .line 37
    .line 38
    iget-object v0, v0, Lxhss/ᲈᛱᛳᛲ;->ᛳᲁᲇᛸ:Lxhss/ᲀᲀ;

    .line 39
    .line 40
    iget-object v1, v0, Lxhss/ᲀᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 41
    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    invoke-virtual {v1, v3}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->setVisibility(I)V

    .line 45
    .line 46
    .line 47
    :cond_1
    iget-object v0, v0, Lxhss/ᲀᲀ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᛵ;

    .line 48
    .line 49
    iget-object v0, v0, Lxhss/ᛳᛴᛵ;->ᲁᛴᛴᛸ:Ljava/lang/ref/WeakReference;

    .line 50
    .line 51
    if-nez v0, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    move-object v4, v0

    .line 59
    check-cast v4, Landroid/view/View;

    .line 60
    .line 61
    :goto_0
    invoke-static {v4}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲀᲇᛳᲁ(Landroid/view/View;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_1
    iget-object v0, v1, Lxhss/ᛴᲈᲀᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Lxhss/ᲀᲈᛵᛸ;

    .line 68
    .line 69
    iget-object v0, v0, Lxhss/ᲀᲈᛵᛸ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Lxhss/ᲀᲀ;

    .line 72
    .line 73
    iget-object v1, v0, Lxhss/ᲀᲀ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᛵ;

    .line 74
    .line 75
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-nez v1, :cond_3

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    iget-object v1, v0, Lxhss/ᲀᲀ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᛵ;

    .line 83
    .line 84
    iget-object v2, v1, Lxhss/ᛳᛴᛵ;->ᛱᛳᲁᲈ:Lxhss/ᛶᲈᛴᛲ;

    .line 85
    .line 86
    if-nez v2, :cond_4

    .line 87
    .line 88
    new-instance v2, Lxhss/ᛶᲈᛴᛲ;

    .line 89
    .line 90
    const/4 v3, 0x2

    .line 91
    invoke-direct {v2, v3, v0}, Lxhss/ᛶᲈᛴᛲ;-><init>(ILjava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    iput-object v2, v1, Lxhss/ᛳᛴᛵ;->ᛱᛳᲁᲈ:Lxhss/ᛶᲈᛴᛲ;

    .line 95
    .line 96
    :cond_4
    invoke-virtual {v2, v1}, Lxhss/ᛶᲈᛴᛲ;->ᛱᛱᛲᲇ(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    new-instance v1, Lxhss/ᲁᛲᛸᛴ;

    .line 100
    .line 101
    invoke-direct {v1}, Lxhss/ᲁᛲᛸᛴ;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Lxhss/ᲁᛲᛸᛴ;->ᛳᲁᲇᛸ()V

    .line 105
    .line 106
    .line 107
    iget-object v0, v0, Lxhss/ᲀᲀ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᛵ;

    .line 108
    .line 109
    sget-object v1, Lxhss/ᛱᛷᛸᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛱᛷᛸᲁ;

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛵᛷᛲᛸ(Lxhss/ᛱᛷᛸᲁ;)V

    .line 112
    .line 113
    .line 114
    :goto_1
    return-void

    .line 115
    :pswitch_2
    iget-object v0, v1, Lxhss/ᛴᲈᲀᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 116
    .line 117
    move-object v3, v0

    .line 118
    check-cast v3, Lxhss/ᛸᛱᛴᛳ;

    .line 119
    .line 120
    monitor-enter v3

    .line 121
    :try_start_0
    iget v0, v3, Lxhss/ᛸᛱᛴᛳ;->ᲀᲇᛳᲁ:I

    .line 122
    .line 123
    add-int/2addr v0, v2

    .line 124
    iput v0, v3, Lxhss/ᛸᛱᛴᛳ;->ᲀᲇᛳᲁ:I

    .line 125
    .line 126
    invoke-virtual {v3}, Lxhss/ᛸᛱᛴᛳ;->ᛱᛱᛲᲇ()Lxhss/ᛵᛳᲀᛲ;

    .line 127
    .line 128
    .line 129
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 130
    monitor-exit v3

    .line 131
    if-nez v0, :cond_5

    .line 132
    .line 133
    goto/16 :goto_5

    .line 134
    .line 135
    :cond_5
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    :cond_6
    move-object v5, v0

    .line 144
    const-wide/16 v7, -0x1

    .line 145
    .line 146
    :try_start_1
    iget-object v0, v5, Lxhss/ᛵᛳᲀᛲ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {v3, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    iget-object v0, v1, Lxhss/ᛴᲈᲀᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v0, Lxhss/ᛸᛱᛴᛳ;

    .line 154
    .line 155
    iget-object v9, v0, Lxhss/ᛸᛱᛴᛳ;->ᛱᛱᛲᲇ:Ljava/util/logging/Logger;

    .line 156
    .line 157
    iget-object v10, v5, Lxhss/ᛵᛳᲀᛲ;->ᛳᲁᲇᛸ:Lxhss/ᲇᲀᲀᛷ;

    .line 158
    .line 159
    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 160
    .line 161
    invoke-virtual {v9, v0}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 162
    .line 163
    .line 164
    move-result v11

    .line 165
    if-eqz v11, :cond_7

    .line 166
    .line 167
    iget-object v0, v10, Lxhss/ᲇᲀᲀᛷ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛱᛴᛳ;

    .line 168
    .line 169
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 170
    .line 171
    .line 172
    move-result-wide v12

    .line 173
    const-string v0, "starting"

    .line 174
    .line 175
    invoke-static {v9, v5, v10, v0}, Lxhss/ᲈᲀᲀᛱ;->ᛲᛴᲀᲈ(Ljava/util/logging/Logger;Lxhss/ᛵᛳᲀᛲ;Lxhss/ᲇᲀᲀᛷ;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :catchall_0
    move-exception v0

    .line 180
    goto :goto_4

    .line 181
    :cond_7
    move-wide v12, v7

    .line 182
    :goto_2
    :try_start_2
    invoke-virtual {v5}, Lxhss/ᛵᛳᲀᛲ;->ᛷᛵᛵᲈ()J

    .line 183
    .line 184
    .line 185
    move-result-wide v14
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 186
    if-eqz v11, :cond_8

    .line 187
    .line 188
    :try_start_3
    iget-object v0, v10, Lxhss/ᲇᲀᲀᛷ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛱᛴᛳ;

    .line 189
    .line 190
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 191
    .line 192
    .line 193
    move-result-wide v16

    .line 194
    sub-long v16, v16, v12

    .line 195
    .line 196
    new-instance v0, Ljava/lang/StringBuilder;

    .line 197
    .line 198
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 199
    .line 200
    .line 201
    const-string v11, "finished run in "

    .line 202
    .line 203
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-static/range {v16 .. v17}, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ(J)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v11

    .line 210
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-static {v9, v5, v10, v0}, Lxhss/ᲈᲀᲀᛱ;->ᛲᛴᲀᲈ(Ljava/util/logging/Logger;Lxhss/ᛵᛳᲀᛲ;Lxhss/ᲇᲀᲀᛷ;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    :cond_8
    iget-object v0, v1, Lxhss/ᛴᲈᲀᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 221
    .line 222
    move-object v9, v0

    .line 223
    check-cast v9, Lxhss/ᛸᛱᛴᛳ;

    .line 224
    .line 225
    monitor-enter v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 226
    :try_start_4
    invoke-virtual {v9, v5, v14, v15, v2}, Lxhss/ᛸᛱᛴᛳ;->ᛷᛵᛵᲈ(Lxhss/ᛵᛳᲀᛲ;JZ)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v9}, Lxhss/ᛸᛱᛴᛳ;->ᛱᛱᛲᲇ()Lxhss/ᛵᛳᲀᛲ;

    .line 230
    .line 231
    .line 232
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 233
    :try_start_5
    monitor-exit v9
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 234
    if-nez v0, :cond_6

    .line 235
    .line 236
    :goto_3
    invoke-virtual {v3, v4}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    goto :goto_5

    .line 240
    :catchall_1
    move-exception v0

    .line 241
    :try_start_6
    monitor-exit v9

    .line 242
    throw v0

    .line 243
    :catchall_2
    move-exception v0

    .line 244
    if-eqz v11, :cond_9

    .line 245
    .line 246
    iget-object v2, v10, Lxhss/ᲇᲀᲀᛷ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛱᛴᛳ;

    .line 247
    .line 248
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 249
    .line 250
    .line 251
    move-result-wide v14

    .line 252
    sub-long/2addr v14, v12

    .line 253
    new-instance v2, Ljava/lang/StringBuilder;

    .line 254
    .line 255
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 256
    .line 257
    .line 258
    const-string v11, "failed a run in "

    .line 259
    .line 260
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-static {v14, v15}, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ(J)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v11

    .line 267
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    invoke-static {v9, v5, v10, v2}, Lxhss/ᲈᲀᲀᛱ;->ᛲᛴᲀᲈ(Ljava/util/logging/Logger;Lxhss/ᛵᛳᲀᛲ;Lxhss/ᲇᲀᲀᛷ;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    :cond_9
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 278
    :goto_4
    :try_start_7
    iget-object v1, v1, Lxhss/ᛴᲈᲀᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v1, Lxhss/ᛸᛱᛴᛳ;

    .line 281
    .line 282
    monitor-enter v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 283
    :try_start_8
    invoke-virtual {v1, v5, v7, v8, v6}, Lxhss/ᛸᛱᛴᛳ;->ᛷᛵᛵᲈ(Lxhss/ᛵᛳᲀᛲ;JZ)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 284
    .line 285
    .line 286
    :try_start_9
    monitor-exit v1

    .line 287
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 288
    .line 289
    if-eqz v1, :cond_a

    .line 290
    .line 291
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 296
    .line 297
    .line 298
    goto :goto_3

    .line 299
    :goto_5
    return-void

    .line 300
    :catchall_3
    move-exception v0

    .line 301
    goto :goto_6

    .line 302
    :cond_a
    throw v0

    .line 303
    :catchall_4
    move-exception v0

    .line 304
    monitor-exit v1

    .line 305
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 306
    :goto_6
    invoke-virtual {v3, v4}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    throw v0

    .line 310
    :catchall_5
    move-exception v0

    .line 311
    monitor-exit v3

    .line 312
    throw v0

    .line 313
    :pswitch_3
    iget-object v0, v1, Lxhss/ᛴᲈᲀᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 316
    .line 317
    iget-boolean v1, v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->ᲇᛶᛴᲀ:Z

    .line 318
    .line 319
    if-eqz v1, :cond_b

    .line 320
    .line 321
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    const-string v2, "input_method"

    .line 326
    .line 327
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 332
    .line 333
    invoke-virtual {v1, v0, v6}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 334
    .line 335
    .line 336
    iput-boolean v6, v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->ᲇᛶᛴᲀ:Z

    .line 337
    .line 338
    :cond_b
    return-void

    .line 339
    :pswitch_4
    iget-object v0, v1, Lxhss/ᛴᲈᲀᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast v0, Lxhss/ᲀᛸᛷᛱ;

    .line 342
    .line 343
    invoke-virtual {v0}, Lxhss/ᲀᛸᛷᛱ;->ᛴᲈᲀᲀ()V

    .line 344
    .line 345
    .line 346
    return-void

    .line 347
    :pswitch_5
    iget-object v0, v1, Lxhss/ᛴᲈᲀᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast v0, Lxhss/ᲁᛳᛵᛷ;

    .line 350
    .line 351
    iget-object v1, v0, Lxhss/ᲁᛳᛵᛷ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 352
    .line 353
    if-eqz v1, :cond_c

    .line 354
    .line 355
    invoke-virtual {v1, v3}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->setVisibility(I)V

    .line 356
    .line 357
    .line 358
    :cond_c
    iget-object v0, v0, Lxhss/ᲁᛳᛵᛷ;->ᛶᲇᲈᛸ:Lxhss/ᛱᛴᛳᛴ;

    .line 359
    .line 360
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᲈᛶ()Landroid/view/View;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲀᲇᛳᲁ(Landroid/view/View;)V

    .line 365
    .line 366
    .line 367
    return-void

    .line 368
    :pswitch_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 369
    .line 370
    const-string v1, "FragmentManager has not been attached to a host."

    .line 371
    .line 372
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    throw v0

    .line 376
    :pswitch_7
    iget-object v0, v1, Lxhss/ᛴᲈᲀᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 377
    .line 378
    move-object v3, v0

    .line 379
    check-cast v3, Lxhss/ᛵᛱᛲᛶ;

    .line 380
    .line 381
    :goto_7
    iget-boolean v0, v3, Lxhss/ᛵᛱᛲᛶ;->ᲇᛴᲇᛵ:Z

    .line 382
    .line 383
    if-eqz v0, :cond_12

    .line 384
    .line 385
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 386
    .line 387
    .line 388
    move-result-wide v7

    .line 389
    iget-wide v9, v3, Lxhss/ᛵᛱᛲᛶ;->ᛳᲁᲇᛸ:J

    .line 390
    .line 391
    sub-long/2addr v7, v9

    .line 392
    iget-wide v9, v3, Lxhss/ᛵᛱᛲᛶ;->ᛱᛱᛲᲇ:J

    .line 393
    .line 394
    cmp-long v0, v7, v9

    .line 395
    .line 396
    if-gez v0, :cond_f

    .line 397
    .line 398
    long-to-float v0, v7

    .line 399
    long-to-float v4, v9

    .line 400
    div-float/2addr v0, v4

    .line 401
    iget-object v4, v3, Lxhss/ᛵᛱᛲᛶ;->ᲇᛶᛴᲀ:Landroid/view/animation/Interpolator;

    .line 402
    .line 403
    if-eqz v4, :cond_d

    .line 404
    .line 405
    invoke-interface {v4, v0}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 406
    .line 407
    .line 408
    move-result v0

    .line 409
    :cond_d
    iget v4, v3, Lxhss/ᛵᛱᛲᛶ;->ᲀᲇᛳᲁ:F

    .line 410
    .line 411
    iget v7, v3, Lxhss/ᛵᛱᛲᛶ;->ᛸᛴᛶᛳ:F

    .line 412
    .line 413
    sub-float/2addr v7, v4

    .line 414
    mul-float/2addr v7, v0

    .line 415
    add-float/2addr v7, v4

    .line 416
    iget-object v0, v3, Lxhss/ᛵᛱᛲᛶ;->ᛷᛴᛷᛱ:Lxhss/ᲇᛲᛵ;

    .line 417
    .line 418
    if-eqz v0, :cond_11

    .line 419
    .line 420
    iget-object v0, v3, Lxhss/ᛵᛱᛲᛶ;->ᛷᛵᛵᲈ:Landroid/os/Handler;

    .line 421
    .line 422
    if-nez v0, :cond_e

    .line 423
    .line 424
    new-instance v0, Landroid/os/Handler;

    .line 425
    .line 426
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 427
    .line 428
    .line 429
    move-result-object v4

    .line 430
    invoke-direct {v0, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 431
    .line 432
    .line 433
    iput-object v0, v3, Lxhss/ᛵᛱᛲᛶ;->ᛷᛵᛵᲈ:Landroid/os/Handler;

    .line 434
    .line 435
    :cond_e
    new-instance v4, Lxhss/ᛴᛸᛲᛶ;

    .line 436
    .line 437
    invoke-direct {v4, v1, v7}, Lxhss/ᛴᛸᛲᛶ;-><init>(Lxhss/ᛴᲈᲀᲇ;F)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v0, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 441
    .line 442
    .line 443
    goto :goto_8

    .line 444
    :cond_f
    iput-boolean v6, v3, Lxhss/ᛵᛱᛲᛶ;->ᲇᛴᲇᛵ:Z

    .line 445
    .line 446
    iget v0, v3, Lxhss/ᛵᛱᛲᛶ;->ᛸᛲᲀᛵ:I

    .line 447
    .line 448
    if-eq v0, v5, :cond_10

    .line 449
    .line 450
    iget v4, v3, Lxhss/ᛵᛱᛲᛶ;->ᛸᛷᲈᲈ:I

    .line 451
    .line 452
    if-ge v4, v0, :cond_11

    .line 453
    .line 454
    :cond_10
    iget v0, v3, Lxhss/ᛵᛱᛲᛶ;->ᛸᛷᲈᲈ:I

    .line 455
    .line 456
    add-int/2addr v0, v2

    .line 457
    iput v0, v3, Lxhss/ᛵᛱᛲᛶ;->ᛸᛷᲈᲈ:I

    .line 458
    .line 459
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 460
    .line 461
    .line 462
    move-result-wide v7

    .line 463
    iput-wide v7, v3, Lxhss/ᛵᛱᛲᛶ;->ᛳᲁᲇᛸ:J

    .line 464
    .line 465
    iput-boolean v2, v3, Lxhss/ᛵᛱᛲᛶ;->ᲇᛴᲇᛵ:Z

    .line 466
    .line 467
    :cond_11
    :goto_8
    :try_start_a
    iget v0, v3, Lxhss/ᛵᛱᛲᛶ;->ᲈᛳᲀ:I

    .line 468
    .line 469
    int-to-long v7, v0

    .line 470
    invoke-static {v7, v8}, Ljava/lang/Thread;->sleep(J)V
    :try_end_a
    .catch Ljava/lang/InterruptedException; {:try_start_a .. :try_end_a} :catch_0

    .line 471
    .line 472
    .line 473
    goto :goto_7

    .line 474
    :catch_0
    move-exception v0

    .line 475
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 476
    .line 477
    .line 478
    goto :goto_7

    .line 479
    :cond_12
    return-void

    .line 480
    :pswitch_8
    iget-object v0, v1, Lxhss/ᛴᲈᲀᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 481
    .line 482
    check-cast v0, Lxhss/ᛸᛴᛴᛶ;

    .line 483
    .line 484
    iget-object v0, v0, Lxhss/ᛸᛴᛴᛶ;->ᛸᛲᲀᛵ:Lxhss/ᛳᛲᛶᛱ;

    .line 485
    .line 486
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    return-void

    .line 490
    nop

    .line 491
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
