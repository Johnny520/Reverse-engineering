.class public final Ly4;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ly4;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Ly4;->i:Ljava/lang/Object;

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
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Ly4;->h:I

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, v1, Ly4;->i:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v2, v0

    .line 14
    check-cast v2, Liy2;

    .line 15
    .line 16
    monitor-enter v2

    .line 17
    :try_start_0
    iget v0, v2, Liy2;->g:I

    .line 18
    .line 19
    add-int/2addr v0, v3

    .line 20
    iput v0, v2, Liy2;->g:I

    .line 21
    .line 22
    invoke-virtual {v2}, Liy2;->b()Ley2;

    .line 23
    .line 24
    .line 25
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 26
    monitor-exit v2

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    goto/16 :goto_3

    .line 30
    .line 31
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    :cond_1
    move-object v5, v0

    .line 40
    const-wide/16 v6, -0x1

    .line 41
    .line 42
    :try_start_1
    iget-object v0, v5, Ley2;->a:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v2, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, v1, Ly4;->i:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Liy2;

    .line 50
    .line 51
    iget-object v8, v0, Liy2;->b:Ljava/util/logging/Logger;

    .line 52
    .line 53
    iget-object v9, v5, Ley2;->c:Lhy2;

    .line 54
    .line 55
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 59
    .line 60
    invoke-virtual {v8, v0}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 61
    .line 62
    .line 63
    move-result v10

    .line 64
    if-eqz v10, :cond_2

    .line 65
    .line 66
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 67
    .line 68
    .line 69
    move-result-wide v11

    .line 70
    const-string v0, "starting"

    .line 71
    .line 72
    invoke-static {v8, v5, v9, v0}, Lop0;->g(Ljava/util/logging/Logger;Ley2;Lhy2;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :catchall_0
    move-exception v0

    .line 77
    goto :goto_2

    .line 78
    :cond_2
    move-wide v11, v6

    .line 79
    :goto_0
    :try_start_2
    invoke-virtual {v5}, Ley2;->a()J

    .line 80
    .line 81
    .line 82
    move-result-wide v13
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 83
    if-eqz v10, :cond_3

    .line 84
    .line 85
    :try_start_3
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 86
    .line 87
    .line 88
    move-result-wide v15

    .line 89
    sub-long/2addr v15, v11

    .line 90
    new-instance v0, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 93
    .line 94
    .line 95
    const-string v10, "finished run in "

    .line 96
    .line 97
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-static/range {v15 .. v16}, Lop0;->o(J)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v10

    .line 104
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-static {v8, v5, v9, v0}, Lop0;->g(Ljava/util/logging/Logger;Ley2;Lhy2;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    :cond_3
    iget-object v0, v1, Ly4;->i:Ljava/lang/Object;

    .line 115
    .line 116
    move-object v8, v0

    .line 117
    check-cast v8, Liy2;

    .line 118
    .line 119
    monitor-enter v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 120
    :try_start_4
    invoke-static {v8, v5, v13, v14, v3}, Liy2;->a(Liy2;Ley2;JZ)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v8}, Liy2;->b()Ley2;

    .line 124
    .line 125
    .line 126
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 127
    :try_start_5
    monitor-exit v8
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 128
    if-nez v0, :cond_1

    .line 129
    .line 130
    :goto_1
    invoke-virtual {v2, v4}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    goto :goto_3

    .line 134
    :catchall_1
    move-exception v0

    .line 135
    :try_start_6
    monitor-exit v8

    .line 136
    throw v0

    .line 137
    :catchall_2
    move-exception v0

    .line 138
    if-eqz v10, :cond_4

    .line 139
    .line 140
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 141
    .line 142
    .line 143
    move-result-wide v13

    .line 144
    sub-long/2addr v13, v11

    .line 145
    new-instance v3, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    const-string v10, "failed a run in "

    .line 151
    .line 152
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-static {v13, v14}, Lop0;->o(J)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v10

    .line 159
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-static {v8, v5, v9, v3}, Lop0;->g(Ljava/util/logging/Logger;Ley2;Lhy2;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    :cond_4
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 170
    :goto_2
    :try_start_7
    iget-object v1, v1, Ly4;->i:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v1, Liy2;

    .line 173
    .line 174
    monitor-enter v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 175
    const/4 v3, 0x0

    .line 176
    :try_start_8
    invoke-static {v1, v5, v6, v7, v3}, Liy2;->a(Liy2;Ley2;JZ)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 177
    .line 178
    .line 179
    :try_start_9
    monitor-exit v1

    .line 180
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 181
    .line 182
    if-eqz v1, :cond_5

    .line 183
    .line 184
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 189
    .line 190
    .line 191
    goto :goto_1

    .line 192
    :goto_3
    return-void

    .line 193
    :catchall_3
    move-exception v0

    .line 194
    goto :goto_4

    .line 195
    :cond_5
    throw v0

    .line 196
    :catchall_4
    move-exception v0

    .line 197
    monitor-exit v1

    .line 198
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 199
    :goto_4
    invoke-virtual {v2, v4}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw v0

    .line 203
    :catchall_5
    move-exception v0

    .line 204
    monitor-exit v2

    .line 205
    throw v0

    .line 206
    :pswitch_0
    iget-object v0, v1, Ly4;->i:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v0, Lx82;

    .line 209
    .line 210
    iget-object v1, v0, Lx82;->j:Leb;

    .line 211
    .line 212
    invoke-virtual {v1, v0}, Leb;->t(Lga1;)V

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    :pswitch_1
    const-string v0, "dialog"

    .line 217
    .line 218
    iget-object v1, v1, Ly4;->i:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v1, Lo72;

    .line 221
    .line 222
    iget-object v2, v1, Lo72;->i:Ljava/lang/Object;

    .line 223
    .line 224
    const/4 v3, 0x0

    .line 225
    if-eqz v2, :cond_8

    .line 226
    .line 227
    check-cast v2, Landroid/app/AlertDialog;

    .line 228
    .line 229
    invoke-virtual {v2}, Landroid/app/Dialog;->isShowing()Z

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    if-eqz v2, :cond_7

    .line 234
    .line 235
    iget-object v1, v1, Lo72;->i:Ljava/lang/Object;

    .line 236
    .line 237
    if-eqz v1, :cond_6

    .line 238
    .line 239
    check-cast v1, Landroid/app/AlertDialog;

    .line 240
    .line 241
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 242
    .line 243
    .line 244
    goto :goto_5

    .line 245
    :cond_6
    invoke-static {v0}, Lt11;->S(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    throw v3

    .line 249
    :cond_7
    :goto_5
    return-void

    .line 250
    :cond_8
    invoke-static {v0}, Lt11;->S(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    throw v3

    .line 254
    :pswitch_2
    iget-object v0, v1, Ly4;->i:Ljava/lang/Object;

    .line 255
    .line 256
    move-object v4, v0

    .line 257
    check-cast v4, Lb7;

    .line 258
    .line 259
    invoke-virtual {v4, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 260
    .line 261
    .line 262
    iget-object v5, v4, Lb7;->D0:Landroid/view/MotionEvent;

    .line 263
    .line 264
    if-eqz v5, :cond_a

    .line 265
    .line 266
    invoke-virtual {v5}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    if-eq v0, v2, :cond_a

    .line 271
    .line 272
    if-eq v0, v3, :cond_a

    .line 273
    .line 274
    const/4 v1, 0x7

    .line 275
    if-eq v0, v1, :cond_9

    .line 276
    .line 277
    const/16 v2, 0x9

    .line 278
    .line 279
    if-eq v0, v2, :cond_9

    .line 280
    .line 281
    const/4 v1, 0x2

    .line 282
    :cond_9
    move v6, v1

    .line 283
    iget-wide v7, v4, Lb7;->E0:J

    .line 284
    .line 285
    const/4 v9, 0x0

    .line 286
    invoke-virtual/range {v4 .. v9}, Lb7;->J(Landroid/view/MotionEvent;IJZ)V

    .line 287
    .line 288
    .line 289
    :cond_a
    return-void

    .line 290
    :pswitch_3
    iget-object v0, v1, Ly4;->i:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v0, Lb5;

    .line 293
    .line 294
    :goto_6
    :try_start_a
    iget-object v1, v0, Lb5;->j:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v1, Ljava/lang/ref/ReferenceQueue;

    .line 297
    .line 298
    invoke-virtual {v1}, Ljava/lang/ref/ReferenceQueue;->remove()Ljava/lang/ref/Reference;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    check-cast v1, La5;

    .line 303
    .line 304
    invoke-virtual {v0, v1}, Lb5;->k(La5;)V
    :try_end_a
    .catch Ljava/lang/InterruptedException; {:try_start_a .. :try_end_a} :catch_0

    .line 305
    .line 306
    .line 307
    goto :goto_6

    .line 308
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 313
    .line 314
    .line 315
    goto :goto_6

    .line 316
    :pswitch_4
    invoke-static {v2}, Landroid/os/Process;->setThreadPriority(I)V

    .line 317
    .line 318
    .line 319
    iget-object v0, v1, Ly4;->i:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v0, Ljava/lang/Runnable;

    .line 322
    .line 323
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 324
    .line 325
    .line 326
    return-void

    .line 327
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
