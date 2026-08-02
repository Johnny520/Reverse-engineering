.class public final synthetic Llb;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Llb;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Llb;->i:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Llb;->j:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Llb;->k:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Llb;->h:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    iget-object v2, p0, Llb;->k:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Llb;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p0, p0, Llb;->i:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, Lbi0;

    .line 15
    .line 16
    check-cast v3, Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

    .line 17
    .line 18
    check-cast v2, Ljava/lang/String;

    .line 19
    .line 20
    invoke-interface {v3, p0, v2}, Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;->onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    check-cast p0, Lsz0;

    .line 25
    .line 26
    check-cast v3, Ljava/lang/String;

    .line 27
    .line 28
    check-cast v2, Ljava/lang/Float;

    .line 29
    .line 30
    iget-object p0, p0, Lsz0;->j:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Lsz0;

    .line 33
    .line 34
    if-nez p0, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v0, p0, Lsz0;->i:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Lnx1;

    .line 40
    .line 41
    invoke-virtual {v0, v3}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    const/4 v1, 0x0

    .line 51
    const/high16 v2, 0x3f800000    # 1.0f

    .line 52
    .line 53
    invoke-static {v0, v1, v2}, Lci0;->C(FFF)F

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-static {v0, v1, v2}, Lci0;->C(FFF)F

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget-object p0, p0, Lsz0;->j:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p0, Ljx1;

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Ljx1;->h(F)V

    .line 66
    .line 67
    .line 68
    :cond_1
    :goto_0
    return-void

    .line 69
    :pswitch_1
    check-cast p0, [Lvj;

    .line 70
    .line 71
    check-cast v3, Lpb1;

    .line 72
    .line 73
    check-cast v2, Lvu0;

    .line 74
    .line 75
    const-string v0, "[NukeCore]"

    .line 76
    .line 77
    :try_start_0
    invoke-static {p0, v3, v2}, Lte;->e0([Lvj;Lpb1;Lvu0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    .line 80
    move-object v2, v1

    .line 81
    goto :goto_1

    .line 82
    :catchall_0
    move-exception p0

    .line 83
    new-instance v2, Lx92;

    .line 84
    .line 85
    invoke-direct {v2, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    :goto_1
    invoke-static {v2}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    if-eqz p0, :cond_3

    .line 93
    .line 94
    invoke-static {p0}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    const-string v3, "Dex analysis failed: "

    .line 99
    .line 100
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    :try_start_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-static {v0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :catchall_1
    move-exception v0

    .line 125
    new-instance v1, Lx92;

    .line 126
    .line 127
    invoke-direct {v1, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    :goto_2
    instance-of v0, v1, Lx92;

    .line 131
    .line 132
    if-eqz v0, :cond_2

    .line 133
    .line 134
    const/4 v0, 0x6

    .line 135
    const-string v1, "NukeCore"

    .line 136
    .line 137
    invoke-static {v0, v1, v2}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    .line 138
    .line 139
    .line 140
    :cond_2
    sget-object v0, Lte;->a:Lsz0;

    .line 141
    .line 142
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    const v1, 0x790b01d4

    .line 155
    .line 156
    .line 157
    invoke-static {v1, p0}, Lte;->j0(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    const/4 v1, 0x0

    .line 162
    invoke-virtual {v0, p0, v1}, Lsz0;->N(Ljava/lang/String;Ljava/lang/Float;)V

    .line 163
    .line 164
    .line 165
    :cond_3
    return-void

    .line 166
    :pswitch_2
    check-cast p0, Lsz0;

    .line 167
    .line 168
    check-cast v3, Lcp;

    .line 169
    .line 170
    check-cast v2, Ljava/lang/Throwable;

    .line 171
    .line 172
    iget-object p0, p0, Lsz0;->j:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast p0, La50;

    .line 175
    .line 176
    invoke-interface {v3, p0, v2}, Lcp;->d(Lwo;Ljava/lang/Throwable;)V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :pswitch_3
    check-cast p0, Lsz0;

    .line 181
    .line 182
    check-cast v3, Lcp;

    .line 183
    .line 184
    check-cast v2, Lq92;

    .line 185
    .line 186
    iget-object p0, p0, Lsz0;->j:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast p0, La50;

    .line 189
    .line 190
    iget-object v0, p0, La50;->i:Lwo;

    .line 191
    .line 192
    invoke-interface {v0}, Lwo;->e()Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-eqz v0, :cond_4

    .line 197
    .line 198
    new-instance v0, Ljava/io/IOException;

    .line 199
    .line 200
    const-string v1, "Canceled"

    .line 201
    .line 202
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-interface {v3, p0, v0}, Lcp;->d(Lwo;Ljava/lang/Throwable;)V

    .line 206
    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_4
    invoke-interface {v3, p0, v2}, Lcp;->b(Lwo;Lq92;)V

    .line 210
    .line 211
    .line 212
    :goto_3
    return-void

    .line 213
    :pswitch_4
    check-cast p0, Landroid/app/Activity;

    .line 214
    .line 215
    check-cast v3, Landroid/content/Intent;

    .line 216
    .line 217
    check-cast v2, Lgh;

    .line 218
    .line 219
    iget-object v0, v2, Lgh;->a:Ljava/lang/String;

    .line 220
    .line 221
    sget-object v4, Lhh;->h:Ljava/lang/String;

    .line 222
    .line 223
    sget-object v5, Lhh;->d:Lhh;

    .line 224
    .line 225
    :try_start_2
    invoke-virtual {p0, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 226
    .line 227
    .line 228
    goto :goto_4

    .line 229
    :catchall_2
    move-exception p0

    .line 230
    new-instance v1, Lx92;

    .line 231
    .line 232
    invoke-direct {v1, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 233
    .line 234
    .line 235
    :goto_4
    instance-of p0, v1, Lx92;

    .line 236
    .line 237
    if-nez p0, :cond_5

    .line 238
    .line 239
    move-object p0, v1

    .line 240
    check-cast p0, La83;

    .line 241
    .line 242
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    new-instance p0, Ljava/lang/StringBuilder;

    .line 246
    .line 247
    const-string v3, "Opened red packet receive UI: sendId="

    .line 248
    .line 249
    invoke-direct {p0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    invoke-static {v4, p0}, Lhg3;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    :cond_5
    invoke-static {v1}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    if-eqz p0, :cond_6

    .line 267
    .line 268
    sget-object v1, Lhh;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 269
    .line 270
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    invoke-static {p0}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    const-string v0, "Open red packet receive UI failed: "

    .line 281
    .line 282
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    invoke-static {v4, p0}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    :cond_6
    return-void

    .line 290
    :pswitch_5
    check-cast p0, Lnb;

    .line 291
    .line 292
    check-cast v3, Ljb;

    .line 293
    .line 294
    check-cast v2, Lkb;

    .line 295
    .line 296
    iget-object v0, p0, Lnb;->a:Landroid/view/View;

    .line 297
    .line 298
    new-instance v1, Lyj0;

    .line 299
    .line 300
    invoke-direct {v1, v3}, Lyj0;-><init>(Ljb;)V

    .line 301
    .line 302
    .line 303
    const/4 v3, 0x1

    .line 304
    invoke-virtual {v0, v1, v3}, Landroid/view/View;->startActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    iget-object p0, p0, Lnb;->h:Landroid/view/ActionMode;

    .line 309
    .line 310
    invoke-static {p0, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    if-nez v0, :cond_7

    .line 314
    .line 315
    invoke-virtual {v2}, Lkb;->close()V

    .line 316
    .line 317
    .line 318
    :cond_7
    return-void

    .line 319
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
