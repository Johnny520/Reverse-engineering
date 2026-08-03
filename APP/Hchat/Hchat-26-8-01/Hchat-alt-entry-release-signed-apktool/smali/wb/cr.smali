.class public final synthetic Lwb/cr;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwb/cr;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/cr;->h:Ljava/lang/Object;

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
    .locals 7

    .line 1
    iget v0, p0, Lwb/cr;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/cr;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lya/a;

    .line 9
    .line 10
    invoke-virtual {v0}, Lya/a;->a()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Lwb/cr;->h:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ly1/z;

    .line 17
    .line 18
    const-string v1, "measureAndLayout"

    .line 19
    .line 20
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :try_start_0
    iget-object v1, v0, Ly1/z;->j:Ly1/t;

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-virtual {v1, v2}, Ly1/t;->x(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 27
    .line 28
    .line 29
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 30
    .line 31
    .line 32
    const-string v1, "checkForSemanticsChanges"

    .line 33
    .line 34
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :try_start_1
    invoke-virtual {v0}, Ly1/z;->g()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    .line 39
    .line 40
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 41
    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    iput-boolean v1, v0, Ly1/z;->O:Z

    .line 45
    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 49
    .line 50
    .line 51
    throw v0

    .line 52
    :catchall_1
    move-exception v0

    .line 53
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 54
    .line 55
    .line 56
    throw v0

    .line 57
    :pswitch_1
    iget-object v0, p0, Lwb/cr;->h:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Ly1/a;

    .line 60
    .line 61
    invoke-virtual {v0}, Ly1/a;->b()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_2
    iget-object v0, p0, Lwb/cr;->h:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Lxa/m;

    .line 68
    .line 69
    iget-object v1, v0, Lxa/m;->i:Ljava/util/Map;

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    monitor-enter v1

    .line 75
    :try_start_2
    iget-object v2, v0, Lxa/m;->i:Ljava/util/Map;

    .line 76
    .line 77
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, Ljava/lang/Iterable;

    .line 82
    .line 83
    new-instance v3, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-static {v2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 90
    .line 91
    .line 92
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-eqz v4, :cond_0

    .line 101
    .line 102
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    check-cast v4, Ljava/util/Map$Entry;

    .line 107
    .line 108
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    new-instance v6, Lsf/e;

    .line 117
    .line 118
    invoke-direct {v6, v5, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :catchall_2
    move-exception v0

    .line 126
    goto :goto_2

    .line 127
    :cond_0
    iget-object v0, v0, Lxa/m;->i:Ljava/util/Map;

    .line 128
    .line 129
    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 130
    .line 131
    .line 132
    monitor-exit v1

    .line 133
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    :catchall_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-eqz v1, :cond_1

    .line 142
    .line 143
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    check-cast v1, Lsf/e;

    .line 148
    .line 149
    iget-object v2, v1, Lsf/e;->g:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v2, Landroid/view/View;

    .line 152
    .line 153
    iget-object v1, v1, Lsf/e;->h:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v1, Lxa/h;

    .line 156
    .line 157
    :try_start_3
    iget-object v3, v1, Lxa/h;->c:Landroid/view/View$OnLongClickListener;

    .line 158
    .line 159
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 160
    .line 161
    .line 162
    iget-boolean v1, v1, Lxa/h;->d:Z

    .line 163
    .line 164
    invoke-virtual {v2, v1}, Landroid/view/View;->setLongClickable(Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 165
    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_1
    return-void

    .line 169
    :goto_2
    monitor-exit v1

    .line 170
    throw v0

    .line 171
    :pswitch_3
    iget-object v0, p0, Lwb/cr;->h:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v0, Lx8/n;

    .line 174
    .line 175
    iget-object v1, v0, Lx8/n;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 176
    .line 177
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-eqz v1, :cond_2

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_2
    iget-object v1, v0, Lx8/n;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    if-eqz v1, :cond_3

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 194
    .line 195
    .line 196
    move-result-wide v1

    .line 197
    iget-object v3, v0, Lx8/n;->i:Ljava/util/concurrent/atomic/AtomicLong;

    .line 198
    .line 199
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 200
    .line 201
    .line 202
    move-result-wide v3

    .line 203
    sub-long/2addr v1, v3

    .line 204
    const-wide/32 v3, 0x15f90

    .line 205
    .line 206
    .line 207
    cmp-long v1, v1, v3

    .line 208
    .line 209
    if-gez v1, :cond_4

    .line 210
    .line 211
    goto :goto_3

    .line 212
    :cond_4
    const-string v1, "idle timeout"

    .line 213
    .line 214
    invoke-virtual {v0, v1}, Lx8/n;->a(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    :goto_3
    return-void

    .line 218
    :pswitch_4
    iget-object v0, p0, Lwb/cr;->h:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v0, Lx8/k;

    .line 221
    .line 222
    const-wide/16 v1, 0x7530

    .line 223
    .line 224
    :try_start_4
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    .line 225
    .line 226
    .line 227
    iget-object v1, v0, Lx8/k;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 228
    .line 229
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    if-nez v1, :cond_5

    .line 234
    .line 235
    invoke-virtual {v0}, Lx8/k;->c()V

    .line 236
    .line 237
    .line 238
    goto :goto_4

    .line 239
    :catchall_4
    move-exception v1

    .line 240
    goto :goto_5

    .line 241
    :cond_5
    :goto_4
    sget-object v1, Lsf/n;->a:Lsf/n;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 242
    .line 243
    goto :goto_6

    .line 244
    :goto_5
    new-instance v2, Lsf/f;

    .line 245
    .line 246
    invoke-direct {v2, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 247
    .line 248
    .line 249
    move-object v1, v2

    .line 250
    :goto_6
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    if-eqz v1, :cond_6

    .line 255
    .line 256
    iget-object v0, v0, Lx8/k;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 257
    .line 258
    const/4 v2, 0x0

    .line 259
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    const-string v2, "[Hchat:AutoReply] \u5c0f\u667aMCP\u6865\u63a5\u91cd\u8fde\u5931\u8d25: "

    .line 267
    .line 268
    invoke-static {v2, v0, v1}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 269
    .line 270
    .line 271
    :cond_6
    return-void

    .line 272
    :pswitch_5
    iget-object v0, p0, Lwb/cr;->h:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v0, Lc9/r0;

    .line 275
    .line 276
    invoke-virtual {v0}, Lc9/r0;->invoke()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    return-void

    .line 280
    :pswitch_6
    iget-object v0, p0, Lwb/cr;->h:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v0, Lwb/wt;

    .line 283
    .line 284
    const/4 v1, 0x0

    .line 285
    iput-boolean v1, v0, Lwb/wt;->d:Z

    .line 286
    .line 287
    invoke-virtual {v0}, Lwb/wt;->a()V

    .line 288
    .line 289
    .line 290
    return-void

    .line 291
    :pswitch_7
    iget-object v0, p0, Lwb/cr;->h:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v0, Lwb/dr;

    .line 294
    .line 295
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v0}, Lwb/dr;->a()V

    .line 299
    .line 300
    .line 301
    return-void

    .line 302
    nop

    .line 303
    :pswitch_data_0
    .packed-switch 0x0
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
