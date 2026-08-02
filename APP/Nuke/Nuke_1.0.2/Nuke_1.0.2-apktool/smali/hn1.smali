.class public final synthetic Lhn1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 8
    iput p1, p0, Lhn1;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lls1;)V
    .locals 0

    .line 1
    const/4 p1, 0x5

    .line 2
    iput p1, p0, Lhn1;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 14

    .line 1
    iget p0, p0, Lhn1;->h:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, Lo63;

    .line 9
    .line 10
    const/16 v0, 0x7fff

    .line 11
    .line 12
    invoke-direct {p0, v1, v0}, Lo63;-><init>(Lm13;I)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    sget-object p0, Ll60;->a:Lg13;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_1
    sget-object p0, Lr63;->a:Lm13;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_2
    sget-object p0, Laz2;->a:Lmy;

    .line 23
    .line 24
    return-object v1

    .line 25
    :pswitch_3
    const-string p0, "com.tencent.mm.pluginsdk.ui.chat.ChatFooter"

    .line 26
    .line 27
    invoke-static {p0}, Lup0;->H(Ljava/lang/String;)Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :pswitch_4
    const-string p0, "com.tencent.mm.ui.conversation.ConversationFolderItemView"

    .line 33
    .line 34
    invoke-static {p0}, Lup0;->H(Ljava/lang/String;)Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_5
    new-instance p0, Lza0;

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-direct {p0, v0}, Lza0;-><init>(F)V

    .line 43
    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_6
    sget-object p0, Lus2;->b:Lus2;

    .line 47
    .line 48
    invoke-virtual {p0}, Lv70;->e()Ljava/lang/reflect/Method;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :pswitch_7
    sget-object p0, Lws2;->b:Lws2;

    .line 54
    .line 55
    invoke-virtual {p0}, Lv70;->e()Ljava/lang/reflect/Method;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_8
    sget-object p0, Lvs2;->b:Lvs2;

    .line 61
    .line 62
    invoke-virtual {p0}, Lv70;->e()Ljava/lang/reflect/Method;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :pswitch_9
    new-instance p0, Lhq2;

    .line 68
    .line 69
    invoke-direct {p0}, Lhq2;-><init>()V

    .line 70
    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_a
    const-string p0, "com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMain"

    .line 74
    .line 75
    invoke-static {p0}, Lup0;->H(Ljava/lang/String;)Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :pswitch_b
    const-string p0, "com.tencent.mm.plugin.setting.ui.setting_new.settings.other.SettingGroupPlugin"

    .line 81
    .line 82
    invoke-static {p0}, Lup0;->H(Ljava/lang/String;)Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0

    .line 87
    :pswitch_c
    sget-object p0, Lgp2;->b:Lgp2;

    .line 88
    .line 89
    invoke-virtual {p0}, Lv70;->e()Ljava/lang/reflect/Method;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-static {p0}, Lig1;->a(Ljava/lang/reflect/Member;)Z

    .line 94
    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_d
    sget-object p0, Ljn2;->a:Lmy;

    .line 98
    .line 99
    return-object v1

    .line 100
    :pswitch_e
    new-instance p0, Lnl2;

    .line 101
    .line 102
    invoke-direct {p0, v0}, Lnl2;-><init>(I)V

    .line 103
    .line 104
    .line 105
    return-object p0

    .line 106
    :pswitch_f
    invoke-static {v1}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :pswitch_10
    sget-object p0, Lcf2;->b:Ljava/lang/String;

    .line 112
    .line 113
    new-instance v0, Low1;

    .line 114
    .line 115
    const-string v1, "nuke:runtime"

    .line 116
    .line 117
    invoke-direct {v0, v1, p0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    sget-object p0, Lcf2;->c:Ljava/lang/String;

    .line 121
    .line 122
    new-instance v1, Low1;

    .line 123
    .line 124
    const-string v2, "nuke:internal"

    .line 125
    .line 126
    invoke-direct {v1, v2, p0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    sget-object p0, Lcf2;->h:Ljava/lang/String;

    .line 130
    .line 131
    new-instance v2, Low1;

    .line 132
    .line 133
    const-string v3, "nuke:host-objects"

    .line 134
    .line 135
    invoke-direct {v2, v3, p0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    sget-object p0, Lcf2;->d:Ljava/lang/String;

    .line 139
    .line 140
    new-instance v3, Low1;

    .line 141
    .line 142
    const-string v4, "nuke:log"

    .line 143
    .line 144
    invoke-direct {v3, v4, p0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    sget-object p0, Lcf2;->j:Ljava/lang/String;

    .line 148
    .line 149
    new-instance v4, Low1;

    .line 150
    .line 151
    const-string v5, "nuke:timers"

    .line 152
    .line 153
    invoke-direct {v4, v5, p0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    sget-object p0, Lcf2;->k:Ljava/lang/String;

    .line 157
    .line 158
    new-instance v5, Low1;

    .line 159
    .line 160
    const-string v6, "nuke:encoding"

    .line 161
    .line 162
    invoke-direct {v5, v6, p0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    sget-object p0, Lcf2;->l:Ljava/lang/String;

    .line 166
    .line 167
    new-instance v6, Low1;

    .line 168
    .line 169
    const-string v7, "nuke:crypto"

    .line 170
    .line 171
    invoke-direct {v6, v7, p0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    sget-object p0, Lcf2;->m:Ljava/lang/String;

    .line 175
    .line 176
    new-instance v7, Low1;

    .line 177
    .line 178
    const-string v8, "nuke:fs"

    .line 179
    .line 180
    invoke-direct {v7, v8, p0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    sget-object p0, Lcf2;->n:Ljava/lang/String;

    .line 184
    .line 185
    new-instance v8, Low1;

    .line 186
    .line 187
    const-string v9, "nuke:http"

    .line 188
    .line 189
    invoke-direct {v8, v9, p0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    sget-object p0, Lcf2;->e:Ljava/lang/String;

    .line 193
    .line 194
    new-instance v9, Low1;

    .line 195
    .line 196
    const-string v10, "nuke:config"

    .line 197
    .line 198
    invoke-direct {v9, v10, p0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    sget-object p0, Lcf2;->f:Ljava/lang/String;

    .line 202
    .line 203
    new-instance v10, Low1;

    .line 204
    .line 205
    const-string v11, "nuke:ui"

    .line 206
    .line 207
    invoke-direct {v10, v11, p0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    sget-object p0, Lcf2;->g:Ljava/lang/String;

    .line 211
    .line 212
    new-instance v11, Low1;

    .line 213
    .line 214
    const-string v12, "nuke:messaging"

    .line 215
    .line 216
    invoke-direct {v11, v12, p0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    sget-object p0, Lcf2;->i:Ljava/lang/String;

    .line 220
    .line 221
    new-instance v12, Low1;

    .line 222
    .line 223
    const-string v13, "nuke:host"

    .line 224
    .line 225
    invoke-direct {v12, v13, p0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    filled-new-array/range {v0 .. v12}, [Low1;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 233
    .line 234
    const/16 v1, 0xd

    .line 235
    .line 236
    invoke-static {v1}, Lxe1;->U(I)I

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 241
    .line 242
    .line 243
    invoke-static {v0, p0}, Lwe1;->s0(Ljava/util/HashMap;[Low1;)V

    .line 244
    .line 245
    .line 246
    return-object v0

    .line 247
    :pswitch_11
    sget-object p0, Lhc2;->a:Ltu2;

    .line 248
    .line 249
    return-object v1

    .line 250
    :pswitch_12
    new-instance p0, Ldc2;

    .line 251
    .line 252
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 253
    .line 254
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 255
    .line 256
    .line 257
    invoke-direct {p0, v0}, Ldc2;-><init>(Ljava/util/Map;)V

    .line 258
    .line 259
    .line 260
    return-object p0

    .line 261
    :pswitch_13
    new-instance p0, Lpa2;

    .line 262
    .line 263
    invoke-direct {p0}, Lpa2;-><init>()V

    .line 264
    .line 265
    .line 266
    return-object p0

    .line 267
    :pswitch_14
    sget-object p0, Lf12;->d:Lf12;

    .line 268
    .line 269
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    invoke-static {}, Lf12;->j()V

    .line 273
    .line 274
    .line 275
    sget-object p0, La83;->a:La83;

    .line 276
    .line 277
    return-object p0

    .line 278
    :pswitch_15
    sget-object p0, Lo90;->a:Lc60;

    .line 279
    .line 280
    sget-object p0, Lt50;->j:Lt50;

    .line 281
    .line 282
    return-object p0

    .line 283
    :pswitch_16
    new-instance p0, Lvv1;

    .line 284
    .line 285
    invoke-direct {p0}, Lvv1;-><init>()V

    .line 286
    .line 287
    .line 288
    return-object p0

    .line 289
    :pswitch_17
    sget-object v2, Lyv2;->j:Lyv2;

    .line 290
    .line 291
    new-array p0, v0, [Lyo2;

    .line 292
    .line 293
    move-object v3, v1

    .line 294
    const-string v1, "kotlin.Unit"

    .line 295
    .line 296
    invoke-static {v1}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 297
    .line 298
    .line 299
    move-result v4

    .line 300
    if-nez v4, :cond_2

    .line 301
    .line 302
    sget-object v4, Lyv2;->g:Lyv2;

    .line 303
    .line 304
    if-eq v2, v4, :cond_0

    .line 305
    .line 306
    goto :goto_0

    .line 307
    :cond_0
    const/4 v0, 0x1

    .line 308
    :goto_0
    if-nez v0, :cond_1

    .line 309
    .line 310
    new-instance v5, Lct;

    .line 311
    .line 312
    invoke-direct {v5, v1}, Lct;-><init>(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    new-instance v0, Lap2;

    .line 316
    .line 317
    iget-object v3, v5, Lct;->b:Ljava/util/ArrayList;

    .line 318
    .line 319
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 320
    .line 321
    .line 322
    move-result v3

    .line 323
    invoke-static {p0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    invoke-direct/range {v0 .. v5}, Lap2;-><init>(Ljava/lang/String;Ls11;ILjava/util/List;Lct;)V

    .line 328
    .line 329
    .line 330
    move-object v1, v0

    .line 331
    goto :goto_2

    .line 332
    :cond_1
    const-string p0, "For StructureKind.CLASS please use \'buildClassSerialDescriptor\' instead"

    .line 333
    .line 334
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    :goto_1
    move-object v1, v3

    .line 338
    goto :goto_2

    .line 339
    :cond_2
    const-string p0, "Blank serial names are prohibited"

    .line 340
    .line 341
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    goto :goto_1

    .line 345
    :goto_2
    return-object v1

    .line 346
    :pswitch_18
    sget-object p0, Lur1;->a:Ltu2;

    .line 347
    .line 348
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 349
    .line 350
    return-object p0

    .line 351
    :pswitch_19
    sget-wide v0, Lpo1;->a:J

    .line 352
    .line 353
    invoke-static {v0, v1}, Lp40;->M(J)Llp1;

    .line 354
    .line 355
    .line 356
    move-result-object p0

    .line 357
    return-object p0

    .line 358
    :pswitch_1a
    invoke-static {}, Led3;->a()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object p0

    .line 362
    return-object p0

    .line 363
    :pswitch_1b
    sget-object p0, Lkn1;->b:Lkn1;

    .line 364
    .line 365
    invoke-virtual {p0}, Lv70;->d()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    move-result-object p0

    .line 369
    return-object p0

    .line 370
    :pswitch_1c
    sget-object p0, Lin1;->b:Lin1;

    .line 371
    .line 372
    invoke-virtual {p0}, Lv70;->d()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    move-result-object p0

    .line 376
    return-object p0

    .line 377
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
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
.end method
