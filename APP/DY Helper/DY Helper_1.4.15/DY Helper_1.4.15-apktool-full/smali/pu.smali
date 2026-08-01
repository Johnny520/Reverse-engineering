.class public final synthetic Lpu;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Lum1;

.field public final synthetic θ:Landroid/widget/TextView;

.field public final synthetic ι:Ljava/lang/Object;

.field public final synthetic κ:Ljava/io/Serializable;

.field public final synthetic λ:Ljava/lang/Object;

.field public final synthetic μ:Ljava/lang/Object;

.field public final synthetic ν:Landroid/view/View;

.field public final synthetic ξ:Landroid/widget/TextView;

.field public final synthetic ο:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Landroid/app/AlertDialog;Lqm1;Lum1;Landroid/widget/ProgressBar;Landroid/widget/TextView;Lxx;Landroid/widget/LinearLayout;Landroid/widget/Button;Landroid/widget/Button;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lpu;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lpu;->ζ:Landroid/app/Activity;

    .line 8
    .line 9
    iput-object p2, p0, Lpu;->ι:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lpu;->κ:Ljava/io/Serializable;

    .line 12
    .line 13
    iput-object p4, p0, Lpu;->η:Lum1;

    .line 14
    .line 15
    iput-object p5, p0, Lpu;->λ:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p6, p0, Lpu;->θ:Landroid/widget/TextView;

    .line 18
    .line 19
    iput-object p7, p0, Lpu;->μ:Ljava/lang/Object;

    .line 20
    .line 21
    iput-object p8, p0, Lpu;->ν:Landroid/view/View;

    .line 22
    .line 23
    iput-object p9, p0, Lpu;->ξ:Landroid/widget/TextView;

    .line 24
    .line 25
    iput-object p10, p0, Lpu;->ο:Landroid/widget/TextView;

    .line 26
    .line 27
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/LinkedHashMap;Lzu;Ljava/util/LinkedHashMap;Lum1;Landroid/widget/EditText;Landroid/app/Activity;Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 1

    .line 28
    const/4 v0, 0x0

    iput v0, p0, Lpu;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpu;->ι:Ljava/lang/Object;

    iput-object p2, p0, Lpu;->λ:Ljava/lang/Object;

    iput-object p3, p0, Lpu;->κ:Ljava/io/Serializable;

    iput-object p4, p0, Lpu;->η:Lum1;

    iput-object p5, p0, Lpu;->μ:Ljava/lang/Object;

    iput-object p6, p0, Lpu;->ζ:Landroid/app/Activity;

    iput-object p7, p0, Lpu;->ν:Landroid/view/View;

    iput-object p8, p0, Lpu;->θ:Landroid/widget/TextView;

    iput-object p9, p0, Lpu;->ξ:Landroid/widget/TextView;

    iput-object p10, p0, Lpu;->ο:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lpu;->ε:I

    .line 4
    .line 5
    sget-object v2, Ls62;->α:Ls62;

    .line 6
    .line 7
    iget-object v3, v0, Lpu;->ν:Landroid/view/View;

    .line 8
    .line 9
    iget-object v4, v0, Lpu;->μ:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, Lpu;->λ:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, Lpu;->κ:Ljava/io/Serializable;

    .line 14
    .line 15
    iget-object v7, v0, Lpu;->ι:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v8, v0, Lpu;->ζ:Landroid/app/Activity;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object v10, v7

    .line 23
    check-cast v10, Landroid/app/AlertDialog;

    .line 24
    .line 25
    move-object v11, v6

    .line 26
    check-cast v11, Lqm1;

    .line 27
    .line 28
    move-object v14, v5

    .line 29
    check-cast v14, Landroid/widget/ProgressBar;

    .line 30
    .line 31
    move-object/from16 v16, v4

    .line 32
    .line 33
    check-cast v16, Lxx;

    .line 34
    .line 35
    move-object/from16 v17, v3

    .line 36
    .line 37
    check-cast v17, Landroid/widget/LinearLayout;

    .line 38
    .line 39
    iget-object v1, v0, Lpu;->ξ:Landroid/widget/TextView;

    .line 40
    .line 41
    move-object/from16 v18, v1

    .line 42
    .line 43
    check-cast v18, Landroid/widget/Button;

    .line 44
    .line 45
    iget-object v1, v0, Lpu;->ο:Landroid/widget/TextView;

    .line 46
    .line 47
    move-object/from16 v19, v1

    .line 48
    .line 49
    check-cast v19, Landroid/widget/Button;

    .line 50
    .line 51
    move-object/from16 v12, p1

    .line 52
    .line 53
    check-cast v12, Ljava/lang/Throwable;

    .line 54
    .line 55
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    new-instance v9, Lh90;

    .line 59
    .line 60
    iget-object v13, v0, Lpu;->η:Lum1;

    .line 61
    .line 62
    iget-object v15, v0, Lpu;->θ:Landroid/widget/TextView;

    .line 63
    .line 64
    invoke-direct/range {v9 .. v19}, Lh90;-><init>(Landroid/app/AlertDialog;Lqm1;Ljava/lang/Throwable;Lum1;Landroid/widget/ProgressBar;Landroid/widget/TextView;Lxx;Landroid/widget/LinearLayout;Landroid/widget/Button;Landroid/widget/Button;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v8, v9}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 68
    .line 69
    .line 70
    return-object v2

    .line 71
    :pswitch_0
    check-cast v7, Ljava/util/LinkedHashMap;

    .line 72
    .line 73
    check-cast v5, Lzu;

    .line 74
    .line 75
    check-cast v6, Ljava/util/LinkedHashMap;

    .line 76
    .line 77
    move-object v9, v4

    .line 78
    check-cast v9, Landroid/widget/EditText;

    .line 79
    .line 80
    move-object v11, v3

    .line 81
    check-cast v11, Landroid/widget/EditText;

    .line 82
    .line 83
    move-object/from16 v1, p1

    .line 84
    .line 85
    check-cast v1, Landroid/net/Uri;

    .line 86
    .line 87
    const-string v3, "/"

    .line 88
    .line 89
    const-string v4, "/sdcard/"

    .line 90
    .line 91
    if-nez v1, :cond_0

    .line 92
    .line 93
    goto/16 :goto_5

    .line 94
    .line 95
    :cond_0
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    invoke-interface {v7, v5, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    const/4 v7, 0x1

    .line 103
    const/4 v10, 0x0

    .line 104
    const/16 v12, 0x2f

    .line 105
    .line 106
    :try_start_0
    invoke-static {v1}, Landroid/provider/DocumentsContract;->getTreeDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v13

    .line 110
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    const-string v14, ":"

    .line 114
    .line 115
    filled-new-array {v14}, [Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v14

    .line 119
    const/4 v15, 0x2

    .line 120
    invoke-static {v13, v14, v15}, Lq02;->т(Ljava/lang/String;[Ljava/lang/String;I)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v13

    .line 124
    invoke-static {v10, v13}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v14

    .line 128
    check-cast v14, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    .line 130
    const-string v15, ""

    .line 131
    .line 132
    if-nez v14, :cond_1

    .line 133
    .line 134
    move-object v14, v15

    .line 135
    :cond_1
    :try_start_1
    invoke-static {v7, v13}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v13

    .line 139
    check-cast v13, Ljava/lang/String;

    .line 140
    .line 141
    if-nez v13, :cond_2

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_2
    move-object v15, v13

    .line 145
    :goto_0
    new-array v13, v7, [C

    .line 146
    .line 147
    aput-char v12, v13, v10

    .line 148
    .line 149
    invoke-static {v15, v13}, Lq02;->В(Ljava/lang/String;[C)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v13

    .line 153
    const-string v15, "primary"

    .line 154
    .line 155
    invoke-virtual {v14, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 156
    .line 157
    .line 158
    move-result v15

    .line 159
    if-eqz v15, :cond_4

    .line 160
    .line 161
    invoke-static {v13}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 162
    .line 163
    .line 164
    move-result v14

    .line 165
    if-eqz v14, :cond_3

    .line 166
    .line 167
    const-string v1, "/sdcard"

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_3
    invoke-virtual {v4, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    goto :goto_1

    .line 175
    :cond_4
    invoke-static {v14}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    if-nez v4, :cond_6

    .line 180
    .line 181
    invoke-static {v13}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 182
    .line 183
    .line 184
    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 185
    const-string v15, "/storage/"

    .line 186
    .line 187
    if-eqz v4, :cond_5

    .line 188
    .line 189
    :try_start_2
    invoke-virtual {v15, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    goto :goto_1

    .line 194
    :cond_5
    new-instance v4, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    invoke-direct {v4, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    goto :goto_1

    .line 213
    :cond_6
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 218
    .line 219
    .line 220
    move-object v1, v4

    .line 221
    goto :goto_1

    .line 222
    :catchall_0
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    :goto_1
    invoke-virtual {v6, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    check-cast v4, Ljava/lang/String;

    .line 234
    .line 235
    const/4 v13, 0x0

    .line 236
    if-eqz v4, :cond_8

    .line 237
    .line 238
    const/16 v14, 0x5c

    .line 239
    .line 240
    invoke-virtual {v4, v14, v12}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-static {v4, v12, v4}, Lq02;->ц(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 252
    .line 253
    .line 254
    move-result v14

    .line 255
    if-nez v14, :cond_7

    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_7
    move-object v4, v13

    .line 259
    :goto_2
    if-eqz v4, :cond_8

    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_8
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 263
    .line 264
    .line 265
    move-result v4

    .line 266
    const-string v14, "{nickname}_{currentTime}"

    .line 267
    .line 268
    packed-switch v4, :pswitch_data_1

    .line 269
    .line 270
    .line 271
    invoke-static {}, Lγ;->κ()V

    .line 272
    .line 273
    .line 274
    move-object v2, v13

    .line 275
    goto :goto_5

    .line 276
    :pswitch_1
    const-string v4, "comment_emoji_{currentTime}"

    .line 277
    .line 278
    goto :goto_3

    .line 279
    :pswitch_2
    move-object v4, v14

    .line 280
    goto :goto_3

    .line 281
    :pswitch_3
    const-string v4, "{nickname}_{currentTime}_livephoto"

    .line 282
    .line 283
    :goto_3
    new-array v7, v7, [C

    .line 284
    .line 285
    aput-char v12, v7, v10

    .line 286
    .line 287
    invoke-static {v1, v7}, Lq02;->Д(Ljava/lang/String;[C)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    new-instance v7, Ljava/lang/StringBuilder;

    .line 292
    .line 293
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    invoke-interface {v6, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    iget-object v3, v0, Lpu;->η:Lum1;

    .line 313
    .line 314
    iget-object v4, v3, Lum1;->ε:Ljava/lang/Object;

    .line 315
    .line 316
    if-ne v4, v5, :cond_a

    .line 317
    .line 318
    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v9}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    if-eqz v1, :cond_9

    .line 326
    .line 327
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 328
    .line 329
    .line 330
    move-result v1

    .line 331
    goto :goto_4

    .line 332
    :cond_9
    move v1, v10

    .line 333
    :goto_4
    invoke-virtual {v9, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v9}, Landroid/view/View;->requestFocus()Z

    .line 337
    .line 338
    .line 339
    new-instance v1, Lqu;

    .line 340
    .line 341
    invoke-direct {v1, v8, v9, v10}, Lqu;-><init>(Landroid/app/Activity;Landroid/widget/EditText;I)V

    .line 342
    .line 343
    .line 344
    const-wide/16 v4, 0x78

    .line 345
    .line 346
    invoke-virtual {v9, v1, v4, v5}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 347
    .line 348
    .line 349
    const/4 v12, 0x0

    .line 350
    iget-object v13, v0, Lpu;->θ:Landroid/widget/TextView;

    .line 351
    .line 352
    iget-object v14, v0, Lpu;->ξ:Landroid/widget/TextView;

    .line 353
    .line 354
    iget-object v15, v0, Lpu;->ο:Landroid/widget/TextView;

    .line 355
    .line 356
    move-object v10, v3

    .line 357
    invoke-static/range {v9 .. v15}, Lh62;->Е(Landroid/widget/EditText;Lum1;Landroid/widget/EditText;Lf8;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 358
    .line 359
    .line 360
    :cond_a
    :goto_5
    return-object v2

    .line 361
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
