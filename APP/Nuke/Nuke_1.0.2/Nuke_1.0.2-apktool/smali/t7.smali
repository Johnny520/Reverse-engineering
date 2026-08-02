.class public final synthetic Lt7;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lt7;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Lt7;->i:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lt7;->j:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Lt7;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Lt7;->j:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lt7;->i:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lbg3;

    .line 11
    .line 12
    check-cast v1, Lba1;

    .line 13
    .line 14
    iget-boolean v0, p0, Lbg3;->j:Z

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iput-object v1, p0, Lbg3;->k:Lba1;

    .line 19
    .line 20
    invoke-virtual {v1, p0}, Lba1;->a(Lha1;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void

    .line 24
    :pswitch_0
    check-cast p0, Lra1;

    .line 25
    .line 26
    check-cast v1, Ljava/lang/Runnable;

    .line 27
    .line 28
    :try_start_0
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lra1;->a()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    invoke-virtual {p0}, Lra1;->a()V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    :pswitch_1
    check-cast p0, Landroid/app/Activity;

    .line 41
    .line 42
    move-object v3, v1

    .line 43
    check-cast v3, Lkw;

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_7

    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    goto/16 :goto_2

    .line 58
    .line 59
    :cond_1
    const v0, 0x1020002

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    move-object v5, v0

    .line 67
    check-cast v5, Landroid/view/ViewGroup;

    .line 68
    .line 69
    if-nez v5, :cond_2

    .line 70
    .line 71
    goto/16 :goto_2

    .line 72
    .line 73
    :cond_2
    new-instance v7, Ll80;

    .line 74
    .line 75
    invoke-direct {v7}, Ll80;-><init>()V

    .line 76
    .line 77
    .line 78
    iget-boolean v0, v7, Ll80;->k:Z

    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    const/4 v9, 0x1

    .line 82
    iget-object v10, v7, Ll80;->h:Lla1;

    .line 83
    .line 84
    if-eqz v0, :cond_3

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    iget-object v0, v7, Ll80;->i:Lrc2;

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Lrc2;->a(Landroid/os/Bundle;)V

    .line 90
    .line 91
    .line 92
    sget-object v0, Lz91;->ON_CREATE:Lz91;

    .line 93
    .line 94
    invoke-virtual {v10, v0}, Lla1;->e(Lz91;)V

    .line 95
    .line 96
    .line 97
    iput-boolean v9, v7, Ll80;->k:Z

    .line 98
    .line 99
    :goto_0
    new-instance v4, Lo72;

    .line 100
    .line 101
    invoke-direct {v4}, Lo72;-><init>()V

    .line 102
    .line 103
    .line 104
    new-instance v6, Ly62;

    .line 105
    .line 106
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 107
    .line 108
    .line 109
    new-instance v0, Lix;

    .line 110
    .line 111
    invoke-direct {v0, p0}, Lix;-><init>(Landroid/content/Context;)V

    .line 112
    .line 113
    .line 114
    const p0, 0x79080080

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, p0, v7}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    const p0, 0x79080083

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, p0, v7}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    const p0, 0x79080084

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, p0, v7}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    new-instance p0, Lhh1;

    .line 133
    .line 134
    const/16 v2, 0x1d

    .line 135
    .line 136
    invoke-direct {p0, v2, v10}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, p0}, Lo2;->setViewCompositionStrategy(Lya3;)V

    .line 140
    .line 141
    .line 142
    new-instance p0, Lku0;

    .line 143
    .line 144
    invoke-direct {p0, v6, v7, v4}, Lku0;-><init>(Ly62;Ll80;Lo72;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, p0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 148
    .line 149
    .line 150
    new-instance v2, Lju0;

    .line 151
    .line 152
    const/4 v8, 0x0

    .line 153
    invoke-direct/range {v2 .. v8}, Lju0;-><init>(Lkw;Lo72;Landroid/view/ViewGroup;Ly62;Ll80;I)V

    .line 154
    .line 155
    .line 156
    new-instance p0, Lkw;

    .line 157
    .line 158
    const v3, 0x3b2536aa

    .line 159
    .line 160
    .line 161
    invoke-direct {p0, v3, v9, v2}, Lkw;-><init>(IZLun0;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, p0}, Lix;->setContent(Lmn0;)V

    .line 165
    .line 166
    .line 167
    iput-object v0, v4, Lo72;->i:Ljava/lang/Object;

    .line 168
    .line 169
    :try_start_1
    new-instance p0, Landroid/view/ViewGroup$LayoutParams;

    .line 170
    .line 171
    const/4 v2, -0x1

    .line 172
    invoke-direct {p0, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v5, v0, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 176
    .line 177
    .line 178
    iget-boolean p0, v7, Ll80;->k:Z

    .line 179
    .line 180
    if-eqz p0, :cond_7

    .line 181
    .line 182
    iget-boolean p0, v7, Ll80;->l:Z

    .line 183
    .line 184
    if-eqz p0, :cond_4

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_4
    sget-object p0, Lz91;->ON_START:Lz91;

    .line 188
    .line 189
    invoke-virtual {v10, p0}, Lla1;->e(Lz91;)V

    .line 190
    .line 191
    .line 192
    sget-object p0, Lz91;->ON_RESUME:Lz91;

    .line 193
    .line 194
    invoke-virtual {v10, p0}, Lla1;->e(Lz91;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 195
    .line 196
    .line 197
    goto :goto_2

    .line 198
    :catchall_1
    move-exception v0

    .line 199
    move-object p0, v0

    .line 200
    iget-object v0, v4, Lo72;->i:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v0, Lix;

    .line 203
    .line 204
    if-eqz v0, :cond_5

    .line 205
    .line 206
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    if-ne v2, v5, :cond_5

    .line 211
    .line 212
    invoke-virtual {v5, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 213
    .line 214
    .line 215
    :cond_5
    iget-boolean v0, v6, Ly62;->h:Z

    .line 216
    .line 217
    if-eqz v0, :cond_6

    .line 218
    .line 219
    goto :goto_1

    .line 220
    :cond_6
    iput-boolean v9, v6, Ly62;->h:Z

    .line 221
    .line 222
    invoke-virtual {v7}, Ll80;->a()V

    .line 223
    .line 224
    .line 225
    iput-object v1, v4, Lo72;->i:Ljava/lang/Object;

    .line 226
    .line 227
    :goto_1
    throw p0

    .line 228
    :cond_7
    :goto_2
    return-void

    .line 229
    :pswitch_2
    check-cast p0, Lmp;

    .line 230
    .line 231
    check-cast v1, Lvr0;

    .line 232
    .line 233
    invoke-virtual {p0, v1}, Lmp;->F(Lc20;)V

    .line 234
    .line 235
    .line 236
    return-void

    .line 237
    :pswitch_3
    check-cast p0, Lbi0;

    .line 238
    .line 239
    check-cast v1, Ljava/lang/String;

    .line 240
    .line 241
    new-instance v0, Ljava/io/File;

    .line 242
    .line 243
    new-instance v2, Ljava/lang/StringBuilder;

    .line 244
    .line 245
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 246
    .line 247
    .line 248
    iget-object v3, p0, Lbi0;->a:Ljava/lang/String;

    .line 249
    .line 250
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    iget-object p0, p0, Lbi0;->b:Ljava/lang/String;

    .line 254
    .line 255
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-static {v0}, Lhg3;->b(Ljava/io/File;)V

    .line 266
    .line 267
    .line 268
    return-void

    .line 269
    :pswitch_4
    check-cast p0, Ldw;

    .line 270
    .line 271
    check-cast v1, Lot1;

    .line 272
    .line 273
    invoke-virtual {p0}, Ldw;->getLifecycle()Lba1;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    new-instance v2, Lsv;

    .line 278
    .line 279
    const/4 v3, 0x0

    .line 280
    invoke-direct {v2, v3, v1, p0}, Lsv;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v0, v2}, Lba1;->a(Lha1;)V

    .line 284
    .line 285
    .line 286
    return-void

    .line 287
    :pswitch_5
    check-cast p0, Lw7;

    .line 288
    .line 289
    check-cast v1, Landroid/util/LongSparseArray;

    .line 290
    .line 291
    invoke-static {p0, v1}, Lp7;->n(Lw7;Landroid/util/LongSparseArray;)V

    .line 292
    .line 293
    .line 294
    return-void

    .line 295
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
