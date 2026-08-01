.class public final synthetic Lxj0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:La80;


# direct methods
.method public synthetic constructor <init>(La80;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxj0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lxj0;->ζ:La80;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lxj0;->ε:I

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    const/16 v2, 0x64

    .line 6
    .line 7
    iget-object p0, p0, Lxj0;->ζ:La80;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Ljava/lang/Long;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-interface {p0, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :pswitch_0
    check-cast p1, Ljava/lang/Class;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-interface {p0, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    new-instance v0, Ll91;

    .line 32
    .line 33
    invoke-direct {v0, p1, p0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_1
    check-cast p1, Lyw1;

    .line 38
    .line 39
    invoke-interface {p0, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Ltw1;

    .line 44
    .line 45
    sget-object p1, Lax1;->γ:Ljava/lang/Object;

    .line 46
    .line 47
    monitor-enter p1

    .line 48
    :try_start_0
    sget-object v0, Lax1;->δ:Lyw1;

    .line 49
    .line 50
    invoke-virtual {p0}, Ltw1;->η()J

    .line 51
    .line 52
    .line 53
    move-result-wide v1

    .line 54
    invoke-virtual {v0, v1, v2}, Lyw1;->ε(J)Lyw1;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sput-object v0, Lax1;->δ:Lyw1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    monitor-exit p1

    .line 61
    return-object p0

    .line 62
    :catchall_0
    move-exception p0

    .line 63
    monitor-exit p1

    .line 64
    throw p0

    .line 65
    :pswitch_2
    check-cast p1, Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-static {p1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-static {p1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const-string v1, "__smart__"

    .line 90
    .line 91
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_0

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_0
    const/16 v0, 0xa

    .line 99
    .line 100
    invoke-static {p1, v0}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    const/4 v0, 0x0

    .line 105
    if-eqz p1, :cond_2

    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-lez v1, :cond_1

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_1
    move-object p1, v0

    .line 115
    :goto_0
    if-eqz p1, :cond_2

    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    move-object v1, p1

    .line 122
    goto :goto_1

    .line 123
    :cond_2
    move-object v1, v0

    .line 124
    :goto_1
    if-nez v1, :cond_3

    .line 125
    .line 126
    const-string v1, ""

    .line 127
    .line 128
    :cond_3
    :goto_2
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-eqz p1, :cond_4

    .line 133
    .line 134
    const-string v1, "204"

    .line 135
    .line 136
    :cond_4
    sget-object p1, Lbv1;->α:Lbv1;

    .line 137
    .line 138
    const-string p1, "pet_elf_auto_feed_default_food_id"

    .line 139
    .line 140
    invoke-static {p1, v1}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-static {}, Lxa1;->δ()V

    .line 144
    .line 145
    .line 146
    invoke-static {v1}, Lgf1;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-interface {p0, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    sget-object p0, Ls62;->α:Ls62;

    .line 154
    .line 155
    return-object p0

    .line 156
    :pswitch_3
    check-cast p1, Ljava/lang/Integer;

    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    sget-object v0, Lbv1;->α:Lbv1;

    .line 163
    .line 164
    const-string v0, "im_auto_read_filter_mode"

    .line 165
    .line 166
    invoke-static {v0, p1}, Lui1;->Η(Ljava/lang/String;I)V

    .line 167
    .line 168
    .line 169
    sget-object v0, Lkn0;->β:[Ljava/lang/String;

    .line 170
    .line 171
    aget-object p1, v0, p1

    .line 172
    .line 173
    invoke-interface {p0, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    sget-object p0, Ls62;->α:Ls62;

    .line 177
    .line 178
    return-object p0

    .line 179
    :pswitch_4
    check-cast p1, Ljava/lang/String;

    .line 180
    .line 181
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-nez v0, :cond_5

    .line 189
    .line 190
    sget-object v0, Lbv1;->α:Lbv1;

    .line 191
    .line 192
    const-string v0, "duration_alert_message"

    .line 193
    .line 194
    invoke-static {p1, v2}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-static {v0, v2}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-static {p1, v1}, Lbv1;->Λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-interface {p0, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    :cond_5
    sget-object p0, Ls62;->α:Ls62;

    .line 209
    .line 210
    return-object p0

    .line 211
    :pswitch_5
    check-cast p1, Lyu;

    .line 212
    .line 213
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    const-string p1, "download_path_template"

    .line 217
    .line 218
    const-string v0, ""

    .line 219
    .line 220
    invoke-static {p1, v0}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-eqz v0, :cond_6

    .line 229
    .line 230
    const-string p1, "\u7cfb\u7edf\u9ed8\u8ba4\u76ee\u5f55"

    .line 231
    .line 232
    :cond_6
    invoke-interface {p0, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    sget-object p0, Ls62;->α:Ls62;

    .line 236
    .line 237
    return-object p0

    .line 238
    :pswitch_6
    check-cast p1, Ljava/lang/String;

    .line 239
    .line 240
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-nez v0, :cond_7

    .line 248
    .line 249
    sget-object v0, Lbv1;->α:Lbv1;

    .line 250
    .line 251
    const-string v0, "video_length_alert_toast_msg"

    .line 252
    .line 253
    invoke-static {p1, v2}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    invoke-static {v0, v2}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-static {p1, v1}, Lbv1;->Λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    invoke-interface {p0, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    :cond_7
    sget-object p0, Ls62;->α:Ls62;

    .line 268
    .line 269
    return-object p0

    .line 270
    :pswitch_7
    check-cast p1, Ljava/lang/String;

    .line 271
    .line 272
    sget-object v0, Lbv1;->α:Lbv1;

    .line 273
    .line 274
    invoke-static {}, Lbv1;->Α()I

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    if-lez v0, :cond_8

    .line 279
    .line 280
    const-string p1, " \u4e2a\u97f3\u9891"

    .line 281
    .line 282
    invoke-static {p1, v0}, Llz1;->λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    goto :goto_3

    .line 287
    :cond_8
    if-nez p1, :cond_9

    .line 288
    .line 289
    const-string p1, "\u672a\u9009\u62e9"

    .line 290
    .line 291
    :cond_9
    :goto_3
    invoke-interface {p0, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    sget-object p0, Ls62;->α:Ls62;

    .line 295
    .line 296
    return-object p0

    .line 297
    :pswitch_8
    invoke-interface {p0, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    return-object p1

    .line 301
    :pswitch_9
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 302
    .line 303
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    sget-object v0, Ll41;->α:Ll41;

    .line 307
    .line 308
    invoke-interface {p0, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object p0

    .line 312
    check-cast p0, Ljava/util/List;

    .line 313
    .line 314
    invoke-static {p0}, Ll41;->β(Ljava/util/List;)Ljava/util/ArrayList;

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    return-object p0

    .line 319
    :pswitch_a
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 320
    .line 321
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    invoke-interface {p0, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    check-cast p0, Ljava/lang/Iterable;

    .line 329
    .line 330
    new-instance p1, Ljava/util/HashSet;

    .line 331
    .line 332
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 333
    .line 334
    .line 335
    new-instance v0, Ljava/util/ArrayList;

    .line 336
    .line 337
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 338
    .line 339
    .line 340
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 341
    .line 342
    .line 343
    move-result-object p0

    .line 344
    :cond_a
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 345
    .line 346
    .line 347
    move-result v1

    .line 348
    if-eqz v1, :cond_b

    .line 349
    .line 350
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    move-object v2, v1

    .line 355
    check-cast v2, Ljava/lang/reflect/Method;

    .line 356
    .line 357
    sget-object v3, Lzj0;->α:Lzj0;

    .line 358
    .line 359
    invoke-static {v2}, Lzj0;->Δ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    invoke-virtual {p1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v2

    .line 367
    if-eqz v2, :cond_a

    .line 368
    .line 369
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    goto :goto_4

    .line 373
    :cond_b
    return-object v0

    .line 374
    nop

    .line 375
    :pswitch_data_0
    .packed-switch 0x0
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
