.class public final synthetic Lwb/tk;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Landroid/content/SharedPreferences;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/tk;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/tk;->h:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/tk;->i:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/tk;->j:Li0/a1;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/tk;->k:Li0/a1;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/tk;->l:Li0/a1;

    .line 16
    .line 17
    iput-object p6, p0, Lwb/tk;->m:Li0/a1;

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 20
    const/4 v0, 0x0

    iput v0, p0, Lwb/tk;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/tk;->i:Landroid/content/SharedPreferences;

    iput-object p2, p0, Lwb/tk;->h:Landroid/content/Context;

    iput-object p3, p0, Lwb/tk;->j:Li0/a1;

    iput-object p4, p0, Lwb/tk;->k:Li0/a1;

    iput-object p5, p0, Lwb/tk;->l:Li0/a1;

    iput-object p6, p0, Lwb/tk;->m:Li0/a1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lwb/tk;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "yyyy-MM-dd HH:mm:ss"

    .line 7
    .line 8
    const-string v1, ""

    .line 9
    .line 10
    iget-object v2, p0, Lwb/tk;->j:Li0/a1;

    .line 11
    .line 12
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, Ljava/lang/String;

    .line 17
    .line 18
    :try_start_0
    new-instance v4, Ljava/text/SimpleDateFormat;

    .line 19
    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    move-object v3, v1

    .line 23
    :cond_0
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-eqz v5, :cond_1

    .line 36
    .line 37
    move-object v3, v0

    .line 38
    :cond_1
    sget-object v5, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 39
    .line 40
    invoke-direct {v4, v3, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v3

    .line 45
    new-instance v4, Lsf/f;

    .line 46
    .line 47
    invoke-direct {v4, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    instance-of v3, v4, Lsf/f;

    .line 51
    .line 52
    iget-object v4, p0, Lwb/tk;->k:Li0/a1;

    .line 53
    .line 54
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    check-cast v5, Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    iget-object v6, p0, Lwb/tk;->h:Landroid/content/Context;

    .line 65
    .line 66
    const/4 v7, 0x0

    .line 67
    if-eqz v5, :cond_2

    .line 68
    .line 69
    if-eqz v3, :cond_2

    .line 70
    .line 71
    const-string v0, "\u65f6\u95f4\u683c\u5f0f\u65e0\u6548"

    .line 72
    .line 73
    invoke-static {v6, v0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 78
    .line 79
    .line 80
    goto/16 :goto_4

    .line 81
    .line 82
    :cond_2
    iget-object v5, p0, Lwb/tk;->l:Li0/a1;

    .line 83
    .line 84
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    check-cast v8, Ljava/lang/String;

    .line 89
    .line 90
    if-nez v8, :cond_3

    .line 91
    .line 92
    move-object v8, v1

    .line 93
    :cond_3
    invoke-static {v8}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 102
    .line 103
    .line 104
    move-result v9

    .line 105
    if-eqz v9, :cond_4

    .line 106
    .line 107
    const-string v8, "${originalText} | ${time}"

    .line 108
    .line 109
    :cond_4
    iget-object v9, p0, Lwb/tk;->i:Landroid/content/SharedPreferences;

    .line 110
    .line 111
    const-string v10, "moments_bottom_detail_time_format"

    .line 112
    .line 113
    if-nez v3, :cond_7

    .line 114
    .line 115
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    check-cast v3, Ljava/lang/String;

    .line 120
    .line 121
    if-nez v3, :cond_5

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_5
    move-object v1, v3

    .line 125
    :goto_1
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-eqz v3, :cond_6

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_6
    move-object v0, v1

    .line 141
    goto :goto_3

    .line 142
    :cond_7
    invoke-interface {v9, v10, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    if-nez v3, :cond_8

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_8
    move-object v1, v3

    .line 150
    :goto_2
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    if-eqz v3, :cond_6

    .line 163
    .line 164
    :goto_3
    invoke-interface {v5, v8}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    invoke-interface {v2, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    invoke-interface {v9}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    check-cast v2, Ljava/lang/Boolean;

    .line 179
    .line 180
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    const-string v3, "moments_bottom_detail_enable"

    .line 185
    .line 186
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    const-string v2, "moments_bottom_detail_text_format"

    .line 191
    .line 192
    invoke-interface {v1, v2, v8}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-interface {v1, v10, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    iget-object v1, p0, Lwb/tk;->m:Li0/a1;

    .line 201
    .line 202
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    check-cast v1, Ljava/lang/Boolean;

    .line 207
    .line 208
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    const-string v2, "moments_bottom_detail_hide_group_icon"

    .line 213
    .line 214
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 219
    .line 220
    .line 221
    const-string v0, "\u8bbe\u7f6e\u5df2\u4fdd\u5b58"

    .line 222
    .line 223
    invoke-static {v6, v0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 228
    .line 229
    .line 230
    :goto_4
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 231
    .line 232
    return-object v0

    .line 233
    :pswitch_0
    iget-object v0, p0, Lwb/tk;->j:Li0/a1;

    .line 234
    .line 235
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    check-cast v1, Ljava/lang/String;

    .line 240
    .line 241
    invoke-static {v1}, Lac/p;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    const-string v3, "#FF000000"

    .line 250
    .line 251
    if-nez v2, :cond_9

    .line 252
    .line 253
    move-object v1, v3

    .line 254
    :cond_9
    iget-object v2, p0, Lwb/tk;->k:Li0/a1;

    .line 255
    .line 256
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    check-cast v4, Ljava/lang/String;

    .line 261
    .line 262
    invoke-static {v4}, Lac/p;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 267
    .line 268
    .line 269
    move-result v5

    .line 270
    if-nez v5, :cond_a

    .line 271
    .line 272
    move-object v4, v3

    .line 273
    :cond_a
    iget-object v5, p0, Lwb/tk;->l:Li0/a1;

    .line 274
    .line 275
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v6

    .line 279
    check-cast v6, Ljava/lang/String;

    .line 280
    .line 281
    invoke-static {v6}, Lac/p;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v6

    .line 285
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 286
    .line 287
    .line 288
    move-result v7

    .line 289
    if-nez v7, :cond_b

    .line 290
    .line 291
    const-string v6, "#FFFFFFFF"

    .line 292
    .line 293
    :cond_b
    iget-object v7, p0, Lwb/tk;->m:Li0/a1;

    .line 294
    .line 295
    invoke-interface {v7}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v8

    .line 299
    check-cast v8, Ljava/lang/String;

    .line 300
    .line 301
    invoke-static {v8}, Lac/p;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v8

    .line 305
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 306
    .line 307
    .line 308
    move-result v9

    .line 309
    if-nez v9, :cond_c

    .line 310
    .line 311
    goto :goto_5

    .line 312
    :cond_c
    move-object v3, v8

    .line 313
    :goto_5
    iget-object v8, p0, Lwb/tk;->i:Landroid/content/SharedPreferences;

    .line 314
    .line 315
    invoke-interface {v8}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 316
    .line 317
    .line 318
    move-result-object v8

    .line 319
    const-string v9, "message_text_color_left_light"

    .line 320
    .line 321
    invoke-interface {v8, v9, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 322
    .line 323
    .line 324
    move-result-object v8

    .line 325
    const-string v9, "message_text_color_right_light"

    .line 326
    .line 327
    invoke-interface {v8, v9, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 328
    .line 329
    .line 330
    move-result-object v8

    .line 331
    const-string v9, "message_text_color_left_dark"

    .line 332
    .line 333
    invoke-interface {v8, v9, v6}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 334
    .line 335
    .line 336
    move-result-object v8

    .line 337
    const-string v9, "message_text_color_right_dark"

    .line 338
    .line 339
    invoke-interface {v8, v9, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 340
    .line 341
    .line 342
    move-result-object v8

    .line 343
    invoke-interface {v8}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 344
    .line 345
    .line 346
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    invoke-interface {v2, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    invoke-interface {v5, v6}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    invoke-interface {v7, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    const-string v0, "\u8bbe\u7f6e\u5df2\u4fdd\u5b58"

    .line 359
    .line 360
    const/4 v1, 0x0

    .line 361
    iget-object v2, p0, Lwb/tk;->h:Landroid/content/Context;

    .line 362
    .line 363
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 368
    .line 369
    .line 370
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 371
    .line 372
    return-object v0

    .line 373
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
