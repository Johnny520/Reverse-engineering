.class public final synthetic Lny0;
.super Lp80;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    iput p7, p0, Lny0;->ε:I

    .line 2
    .line 3
    invoke-direct/range {p0 .. p6}, Lo80;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lny0;->ε:I

    .line 4
    .line 5
    const-string v2, "X.C0IIU"

    .line 6
    .line 7
    const-string v3, "\u63d0\u9192\u6587\u6848"

    .line 8
    .line 9
    const/16 v6, 0x12

    .line 10
    .line 11
    const/16 v7, 0x3c

    .line 12
    .line 13
    const/16 v8, 0x64

    .line 14
    .line 15
    const/4 v9, 0x7

    .line 16
    const/4 v10, 0x5

    .line 17
    const/16 v11, 0xf

    .line 18
    .line 19
    const/16 v12, 0x14

    .line 20
    .line 21
    const/4 v13, 0x3

    .line 22
    const/4 v14, 0x2

    .line 23
    const/4 v15, 0x4

    .line 24
    const/4 v4, 0x1

    .line 25
    const/4 v5, 0x0

    .line 26
    packed-switch v1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    move-object/from16 v1, p1

    .line 30
    .line 31
    check-cast v1, Landroid/app/Activity;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lbv1;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    sget-object v0, Lzs1;->κ:Lys1;

    .line 44
    .line 45
    const-string v2, "\u672c\u529f\u80fd\u5173\u95ed\u65f6\u4e0d\u5b89\u88c5 Hook\uff1b\u4e0e\u9996\u9875\u624b\u52bf\u5171\u7528\u540c\u4e00\u53cc\u51fb\u5165\u53e3\u3002\u5f00\u5173\u5373\u65f6\u540c\u6b65\uff0c\u672a\u547d\u4e2d\u65f6\u91cd\u542f\u6296\u97f3\u89e6\u53d1 DexKit \u9002\u914d"

    .line 46
    .line 47
    invoke-static {v1, v0, v2}, Lbv1;->σ(Landroid/content/Context;Lys1;Ljava/lang/String;)Landroid/widget/LinearLayout;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    return-object v0

    .line 52
    :pswitch_0
    move-object/from16 v1, p1

    .line 53
    .line 54
    check-cast v1, Landroid/app/Activity;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Lbv1;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-static {v1}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    sget-object v2, Lzs1;->ζ:Ljava/util/List;

    .line 71
    .line 72
    invoke-static {v0, v1, v2, v4}, Lbv1;->α(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/util/List;Z)V

    .line 73
    .line 74
    .line 75
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 80
    .line 81
    .line 82
    const-string v2, "\u4ec5\u5bf9\u5e26\u7ae0\u8282\u4e14\u5bbf\u4e3b\u5df2\u6807\u8bb0\u5e7f\u544a/\u8425\u9500\u7ae0\u8282\u7684\u89c6\u9891\u751f\u6548\uff1b\u5207\u6362\u89c6\u9891\u540e\u8bfb\u53d6\u6700\u65b0\u5f00\u5173\u72b6\u6001"

    .line 83
    .line 84
    invoke-static {v1, v2}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 89
    .line 90
    .line 91
    return-object v0

    .line 92
    :pswitch_1
    move-object/from16 v2, p1

    .line 93
    .line 94
    check-cast v2, Landroid/app/Activity;

    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, Lbv1;

    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-static {v2}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    sget-object v1, Lzs1;->ι:Lys1;

    .line 111
    .line 112
    invoke-static {v1}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-static {v0, v2, v1, v5}, Lbv1;->α(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/util/List;Z)V

    .line 117
    .line 118
    .line 119
    invoke-static {v2}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 124
    .line 125
    .line 126
    const-string v1, "host_long_press_speed"

    .line 127
    .line 128
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-interface {v3, v1, v14}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 133
    .line 134
    .line 135
    move-result v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    :catchall_0
    invoke-static {v14, v4, v10}, Lj81;->μ(III)I

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    new-instance v1, Ldt1;

    .line 141
    .line 142
    invoke-direct {v1, v9}, Ldt1;-><init>(I)V

    .line 143
    .line 144
    .line 145
    const-string v3, "\u5bbf\u4e3b\u5de6\u53f3\u4fa7\u957f\u6309\u500d\u901f"

    .line 146
    .line 147
    const/4 v5, 0x5

    .line 148
    const/4 v6, 0x1

    .line 149
    const-string v7, "\u500d"

    .line 150
    .line 151
    const-string v8, "\u4fee\u6539\u89c6\u9891\u5de6\u53f3\u4fa7\u957f\u6309\u52a0\u901f\u500d\u7387\uff1b\u4e0b\u6b21\u957f\u6309\u751f\u6548"

    .line 152
    .line 153
    move-object v9, v1

    .line 154
    invoke-static/range {v2 .. v9}, Lbv1;->π(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 159
    .line 160
    .line 161
    invoke-static {v2}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 166
    .line 167
    .line 168
    const-string v1, "\u83dc\u5355\u6269\u5c55\u5f00\u5173\u4fee\u6539\u540e\u9700\u91cd\u542f\u6296\u97f3\uff1b4 \u5230 5 \u500d\u4f1a\u81ea\u52a8\u542f\u7528\u64ad\u653e\u5668\u9ad8\u500d\u901f\u80fd\u529b"

    .line 169
    .line 170
    invoke-static {v2, v1}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 175
    .line 176
    .line 177
    return-object v0

    .line 178
    :pswitch_2
    move-object/from16 v16, p1

    .line 179
    .line 180
    check-cast v16, Landroid/app/Activity;

    .line 181
    .line 182
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v0, Lbv1;

    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-static/range {v16 .. v16}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    const-string v1, "profile_video_search_alpha"

    .line 197
    .line 198
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-interface {v2, v1, v8}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 203
    .line 204
    .line 205
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 206
    goto :goto_0

    .line 207
    :catchall_1
    move v1, v8

    .line 208
    :goto_0
    invoke-static {v1, v5, v8}, Lj81;->μ(III)I

    .line 209
    .line 210
    .line 211
    move-result v18

    .line 212
    new-instance v1, Ldt1;

    .line 213
    .line 214
    invoke-direct {v1, v13}, Ldt1;-><init>(I)V

    .line 215
    .line 216
    .line 217
    const-string v17, "\u9876\u90e8\u641c\u7d22\u6846\u900f\u660e\u5ea6"

    .line 218
    .line 219
    const/16 v19, 0x64

    .line 220
    .line 221
    const/16 v20, 0x0

    .line 222
    .line 223
    const-string v21, "%"

    .line 224
    .line 225
    const-string v22, "\u63a7\u5236\u641c\u7d22\u6846\u6574\u4f53\u5185\u5bb9\uff1b0% \u65f6\u4e0d\u53ef\u89c1\u4f46\u70b9\u51fb\u533a\u57df\u4ecd\u4fdd\u7559"

    .line 226
    .line 227
    move-object/from16 v23, v1

    .line 228
    .line 229
    invoke-static/range {v16 .. v23}, Lbv1;->π(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    move-object/from16 v2, v16

    .line 234
    .line 235
    invoke-static {v0, v1, v2}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 236
    .line 237
    .line 238
    const-string v1, "profile_video_comment_bar_alpha"

    .line 239
    .line 240
    :try_start_2
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    invoke-interface {v3, v1, v8}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 245
    .line 246
    .line 247
    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 248
    goto :goto_1

    .line 249
    :catchall_2
    move v1, v8

    .line 250
    :goto_1
    invoke-static {v1, v5, v8}, Lj81;->μ(III)I

    .line 251
    .line 252
    .line 253
    move-result v4

    .line 254
    new-instance v9, Ldt1;

    .line 255
    .line 256
    invoke-direct {v9, v15}, Ldt1;-><init>(I)V

    .line 257
    .line 258
    .line 259
    const-string v3, "\u5e95\u90e8\u8bc4\u8bba\u680f\u900f\u660e\u5ea6"

    .line 260
    .line 261
    const/16 v5, 0x64

    .line 262
    .line 263
    const/4 v6, 0x0

    .line 264
    const-string v7, "%"

    .line 265
    .line 266
    const-string v8, "\u4e0e\u5bbf\u4e3b\u906e\u7f69\u900f\u660e\u5ea6\u76f8\u4e58\uff1b0% \u65f6\u4e0d\u53ef\u89c1\u4f46\u8f93\u5165\u533a\u57df\u4ecd\u4fdd\u7559"

    .line 267
    .line 268
    invoke-static/range {v2 .. v9}, Lbv1;->π(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 273
    .line 274
    .line 275
    invoke-static {v2}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 280
    .line 281
    .line 282
    const-string v1, "\u4ec5\u4ece\u672c\u4eba\u6216\u4ed6\u4eba\u4f5c\u8005\u4e3b\u9875\u8fdb\u5165\u89c6\u9891\u8be6\u60c5\u65f6\u751f\u6548"

    .line 283
    .line 284
    invoke-static {v2, v1}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 289
    .line 290
    .line 291
    return-object v0

    .line 292
    :pswitch_3
    move-object/from16 v2, p1

    .line 293
    .line 294
    check-cast v2, Landroid/app/Activity;

    .line 295
    .line 296
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast v0, Lbv1;

    .line 302
    .line 303
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    invoke-static {v2}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    const-string v1, "seekbar_time_enabled"

    .line 311
    .line 312
    invoke-static {v1, v5}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    new-instance v3, Lhu1;

    .line 317
    .line 318
    invoke-direct {v3, v4}, Lhu1;-><init>(I)V

    .line 319
    .line 320
    .line 321
    const-string v4, "\u542f\u7528\u8fdb\u5ea6\u6761\u65f6\u95f4\u663e\u793a"

    .line 322
    .line 323
    const-string v10, "\u5728\u89c6\u9891\u8fdb\u5ea6\u6761\u4e0b\u65b9\u663e\u793a\u5f53\u524d\u65f6\u95f4/\u603b\u65f6\u957f"

    .line 324
    .line 325
    invoke-static {v2, v4, v10, v1, v3}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 330
    .line 331
    .line 332
    invoke-static {v2}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 337
    .line 338
    .line 339
    const-string v1, "seekbar_time_text_size"

    .line 340
    .line 341
    :try_start_3
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 342
    .line 343
    .line 344
    move-result-object v3

    .line 345
    invoke-interface {v3, v1, v9}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 346
    .line 347
    .line 348
    move-result v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 349
    :catchall_3
    invoke-static {v9, v15, v12}, Lj81;->μ(III)I

    .line 350
    .line 351
    .line 352
    move-result v14

    .line 353
    new-instance v1, Leu1;

    .line 354
    .line 355
    const/16 v3, 0x11

    .line 356
    .line 357
    invoke-direct {v1, v3}, Leu1;-><init>(I)V

    .line 358
    .line 359
    .line 360
    const-string v13, "\u5b57\u4f53\u5927\u5c0f"

    .line 361
    .line 362
    const/16 v15, 0x14

    .line 363
    .line 364
    const/16 v16, 0x4

    .line 365
    .line 366
    const-string v17, "sp"

    .line 367
    .line 368
    const-string v18, "\u8c03\u8282\u65f6\u95f4\u6587\u5b57\u7684\u5b57\u53f7\uff0c\u9ed8\u8ba4 7sp"

    .line 369
    .line 370
    move-object/from16 v19, v1

    .line 371
    .line 372
    move-object v12, v2

    .line 373
    invoke-static/range {v12 .. v19}, Lbv1;->π(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    invoke-static {v0, v1, v2}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 378
    .line 379
    .line 380
    const-string v1, "seekbar_time_alpha"

    .line 381
    .line 382
    :try_start_4
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 383
    .line 384
    .line 385
    move-result-object v3

    .line 386
    invoke-interface {v3, v1, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 387
    .line 388
    .line 389
    move-result v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 390
    :catchall_4
    invoke-static {v7, v5, v8}, Lj81;->μ(III)I

    .line 391
    .line 392
    .line 393
    move-result v4

    .line 394
    new-instance v9, Leu1;

    .line 395
    .line 396
    invoke-direct {v9, v6}, Leu1;-><init>(I)V

    .line 397
    .line 398
    .line 399
    const-string v3, "\u6587\u5b57\u900f\u660e\u5ea6"

    .line 400
    .line 401
    const/16 v5, 0x64

    .line 402
    .line 403
    const/4 v6, 0x0

    .line 404
    const-string v7, "%"

    .line 405
    .line 406
    const-string v8, "\u63a7\u5236\u65f6\u95f4\u6587\u5b57\u7684\u900f\u660e\u5ea6\uff080=\u5168\u900f\u660e\uff0c100=\u4e0d\u900f\u660e\uff09"

    .line 407
    .line 408
    invoke-static/range {v2 .. v9}, Lbv1;->π(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 413
    .line 414
    .line 415
    invoke-static {v2}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 420
    .line 421
    .line 422
    const-string v1, "seekbar_time_color"

    .line 423
    .line 424
    const-string v3, "#99FFFFFF"

    .line 425
    .line 426
    invoke-static {v1, v3}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    new-instance v3, Ljt1;

    .line 431
    .line 432
    invoke-direct {v3, v2, v11}, Ljt1;-><init>(Landroid/app/Activity;I)V

    .line 433
    .line 434
    .line 435
    const-string v4, "\u6587\u5b57\u989c\u8272"

    .line 436
    .line 437
    const-string v5, "\u70b9\u51fb\u9009\u62e9\u6587\u5b57\u989c\u8272"

    .line 438
    .line 439
    invoke-static {v2, v4, v1, v5, v3}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 440
    .line 441
    .line 442
    move-result-object v1

    .line 443
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 444
    .line 445
    .line 446
    invoke-static {v2}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 451
    .line 452
    .line 453
    const-string v1, "\u4fee\u6539\u540e\u91cd\u65b0\u6253\u5f00\u89c6\u9891\u9875\u9762\u751f\u6548"

    .line 454
    .line 455
    invoke-static {v2, v1}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 460
    .line 461
    .line 462
    return-object v0

    .line 463
    :pswitch_4
    move-object/from16 v1, p1

    .line 464
    .line 465
    check-cast v1, Landroid/app/Activity;

    .line 466
    .line 467
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 471
    .line 472
    check-cast v0, Lbv1;

    .line 473
    .line 474
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 475
    .line 476
    .line 477
    sget-object v0, Lzs1;->θ:Lys1;

    .line 478
    .line 479
    const-string v2, "\u6b64\u529f\u80fd\u4f1a\u5728\u89c6\u9891\u64ad\u653e\u5b8c\u6210\u540e\u81ea\u52a8\u6682\u505c\uff0c\u907f\u514d\u81ea\u52a8\u5faa\u73af\u64ad\u653e"

    .line 480
    .line 481
    invoke-static {v1, v0, v2}, Lbv1;->σ(Landroid/content/Context;Lys1;Ljava/lang/String;)Landroid/widget/LinearLayout;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    return-object v0

    .line 486
    :pswitch_5
    move-object/from16 v6, p1

    .line 487
    .line 488
    check-cast v6, Landroid/app/Activity;

    .line 489
    .line 490
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 494
    .line 495
    check-cast v0, Lbv1;

    .line 496
    .line 497
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 498
    .line 499
    .line 500
    invoke-static {v6}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    const-string v1, "auto_scroll_next_enabled"

    .line 505
    .line 506
    invoke-static {v1, v5}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 507
    .line 508
    .line 509
    move-result v1

    .line 510
    new-instance v2, Lhu1;

    .line 511
    .line 512
    invoke-direct {v2, v14}, Lhu1;-><init>(I)V

    .line 513
    .line 514
    .line 515
    const-string v3, "\u542f\u7528\u81ea\u52a8\u4e0b\u6ed1"

    .line 516
    .line 517
    const-string v4, "\u89c6\u9891\u64ad\u653e\u5b8c\u6210\uff0c\u6216\u56fe\u6587/\u6587\u7ae0\u8fbe\u5230\u8bbe\u5b9a\u505c\u7559\u65f6\u95f4\u540e\uff0c\u81ea\u52a8\u6ed1\u5230\u4e0b\u4e00\u4e2a\u4f5c\u54c1"

    .line 518
    .line 519
    invoke-static {v6, v3, v4, v1, v2}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 520
    .line 521
    .line 522
    move-result-object v1

    .line 523
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 524
    .line 525
    .line 526
    invoke-static {v6}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 527
    .line 528
    .line 529
    move-result-object v1

    .line 530
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 531
    .line 532
    .line 533
    const-string v1, "auto_scroll_delay_ms"

    .line 534
    .line 535
    const/16 v2, 0x320

    .line 536
    .line 537
    :try_start_5
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 538
    .line 539
    .line 540
    move-result-object v3

    .line 541
    invoke-interface {v3, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 542
    .line 543
    .line 544
    move-result v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 545
    :catchall_5
    const/16 v1, 0x1388

    .line 546
    .line 547
    invoke-static {v2, v5, v1}, Lj81;->μ(III)I

    .line 548
    .line 549
    .line 550
    move-result v20

    .line 551
    new-instance v1, Leu1;

    .line 552
    .line 553
    const/16 v2, 0x13

    .line 554
    .line 555
    invoke-direct {v1, v2}, Leu1;-><init>(I)V

    .line 556
    .line 557
    .line 558
    const-string v19, "\u89c6\u9891\u5b8c\u6210\u5ef6\u8fdf"

    .line 559
    .line 560
    const/16 v21, 0x1388

    .line 561
    .line 562
    const/16 v22, 0x0

    .line 563
    .line 564
    const-string v23, "ms"

    .line 565
    .line 566
    const-string v24, "\u89c6\u9891\u64ad\u653e\u5b8c\u6210\u540e\u7b49\u5f85\u591a\u5c11\u6beb\u79d2\u518d\u81ea\u52a8\u4e0b\u6ed1\uff080 = \u7acb\u5373\uff09"

    .line 567
    .line 568
    move-object/from16 v25, v1

    .line 569
    .line 570
    move-object/from16 v18, v6

    .line 571
    .line 572
    invoke-static/range {v18 .. v25}, Lbv1;->π(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 577
    .line 578
    .line 579
    invoke-static {v6}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 580
    .line 581
    .line 582
    move-result-object v1

    .line 583
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 584
    .line 585
    .line 586
    const-string v1, "auto_scroll_image_enabled"

    .line 587
    .line 588
    invoke-static {v1, v5}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 589
    .line 590
    .line 591
    move-result v1

    .line 592
    new-instance v2, Lhu1;

    .line 593
    .line 594
    invoke-direct {v2, v13}, Lhu1;-><init>(I)V

    .line 595
    .line 596
    .line 597
    const-string v3, "\u56fe\u6587\u81ea\u52a8\u4e0b\u6ed1"

    .line 598
    .line 599
    const-string v4, "\u56fe\u6587\u6216 LivePhoto \u505c\u7559\u8fbe\u5230\u8bbe\u5b9a\u65f6\u95f4\u540e\u81ea\u52a8\u5207\u6362\uff0c\u9ed8\u8ba4\u5173\u95ed"

    .line 600
    .line 601
    invoke-static {v6, v3, v4, v1, v2}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 602
    .line 603
    .line 604
    move-result-object v1

    .line 605
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 606
    .line 607
    .line 608
    invoke-static {v6}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 609
    .line 610
    .line 611
    move-result-object v1

    .line 612
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 613
    .line 614
    .line 615
    const-string v1, "auto_scroll_image_dwell_seconds"

    .line 616
    .line 617
    :try_start_6
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 618
    .line 619
    .line 620
    move-result-object v2

    .line 621
    const/16 v3, 0xa

    .line 622
    .line 623
    invoke-interface {v2, v1, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 624
    .line 625
    .line 626
    move-result v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 627
    goto :goto_2

    .line 628
    :catchall_6
    const/16 v1, 0xa

    .line 629
    .line 630
    :goto_2
    invoke-static {v1, v13, v7}, Lj81;->μ(III)I

    .line 631
    .line 632
    .line 633
    move-result v18

    .line 634
    new-instance v1, Leu1;

    .line 635
    .line 636
    invoke-direct {v1, v12}, Leu1;-><init>(I)V

    .line 637
    .line 638
    .line 639
    const-string v17, "\u56fe\u6587\u505c\u7559\u65f6\u957f"

    .line 640
    .line 641
    const/16 v19, 0x3c

    .line 642
    .line 643
    const/16 v20, 0x3

    .line 644
    .line 645
    const-string v21, "\u79d2"

    .line 646
    .line 647
    const-string v22, "\u56fe\u6587\u8fdb\u5165\u5f53\u524d\u9875\u540e\u7b49\u5f85\u591a\u4e45\u81ea\u52a8\u4e0b\u6ed1\uff0c\u9ed8\u8ba4 10 \u79d2"

    .line 648
    .line 649
    move-object/from16 v23, v1

    .line 650
    .line 651
    move-object/from16 v16, v6

    .line 652
    .line 653
    invoke-static/range {v16 .. v23}, Lbv1;->π(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 654
    .line 655
    .line 656
    move-result-object v1

    .line 657
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 658
    .line 659
    .line 660
    invoke-static {v6}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 661
    .line 662
    .line 663
    move-result-object v1

    .line 664
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 665
    .line 666
    .line 667
    const-string v1, "auto_scroll_article_enabled"

    .line 668
    .line 669
    invoke-static {v1, v5}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 670
    .line 671
    .line 672
    move-result v1

    .line 673
    new-instance v2, Lhu1;

    .line 674
    .line 675
    invoke-direct {v2, v15}, Lhu1;-><init>(I)V

    .line 676
    .line 677
    .line 678
    const-string v3, "\u6587\u7ae0\u81ea\u52a8\u4e0b\u6ed1"

    .line 679
    .line 680
    const-string v4, "\u6587\u5b57\u6216\u6587\u7ae0\u6a21\u5f0f\u505c\u7559\u8fbe\u5230\u8bbe\u5b9a\u65f6\u95f4\u540e\u81ea\u52a8\u5207\u6362\uff0c\u9ed8\u8ba4\u5173\u95ed"

    .line 681
    .line 682
    invoke-static {v6, v3, v4, v1, v2}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 683
    .line 684
    .line 685
    move-result-object v1

    .line 686
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 687
    .line 688
    .line 689
    invoke-static {v6}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 690
    .line 691
    .line 692
    move-result-object v1

    .line 693
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 694
    .line 695
    .line 696
    const-string v1, "auto_scroll_article_dwell_seconds"

    .line 697
    .line 698
    :try_start_7
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 699
    .line 700
    .line 701
    move-result-object v2

    .line 702
    invoke-interface {v2, v1, v12}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 703
    .line 704
    .line 705
    move-result v12
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 706
    :catchall_7
    const/16 v1, 0x78

    .line 707
    .line 708
    invoke-static {v12, v10, v1}, Lj81;->μ(III)I

    .line 709
    .line 710
    .line 711
    move-result v8

    .line 712
    new-instance v13, Leu1;

    .line 713
    .line 714
    const/16 v1, 0x15

    .line 715
    .line 716
    invoke-direct {v13, v1}, Leu1;-><init>(I)V

    .line 717
    .line 718
    .line 719
    const-string v7, "\u6587\u7ae0\u505c\u7559\u65f6\u957f"

    .line 720
    .line 721
    const/16 v9, 0x78

    .line 722
    .line 723
    const/4 v10, 0x5

    .line 724
    const-string v11, "\u79d2"

    .line 725
    .line 726
    const-string v12, "\u6587\u7ae0\u8fdb\u5165\u5f53\u524d\u9875\u540e\u7b49\u5f85\u591a\u4e45\u81ea\u52a8\u4e0b\u6ed1\uff0c\u9ed8\u8ba4 20 \u79d2"

    .line 727
    .line 728
    invoke-static/range {v6 .. v13}, Lbv1;->π(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 729
    .line 730
    .line 731
    move-result-object v1

    .line 732
    invoke-static {v0, v1, v6}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 733
    .line 734
    .line 735
    sget-object v1, Lzs1;->ε:Ljava/util/List;

    .line 736
    .line 737
    invoke-static {v0, v6, v1, v5}, Lbv1;->α(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/util/List;Z)V

    .line 738
    .line 739
    .line 740
    invoke-static {v6}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 741
    .line 742
    .line 743
    move-result-object v1

    .line 744
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 745
    .line 746
    .line 747
    return-object v0

    .line 748
    :pswitch_6
    move-object/from16 v1, p1

    .line 749
    .line 750
    check-cast v1, Landroid/app/Activity;

    .line 751
    .line 752
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 753
    .line 754
    .line 755
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 756
    .line 757
    check-cast v0, Lbv1;

    .line 758
    .line 759
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 760
    .line 761
    .line 762
    invoke-static {v1}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 763
    .line 764
    .line 765
    move-result-object v0

    .line 766
    const-string v2, "video_length_alert_enabled"

    .line 767
    .line 768
    invoke-static {v2, v5}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 769
    .line 770
    .line 771
    move-result v2

    .line 772
    new-instance v5, Loq1;

    .line 773
    .line 774
    const/16 v6, 0x16

    .line 775
    .line 776
    invoke-direct {v5, v6}, Loq1;-><init>(I)V

    .line 777
    .line 778
    .line 779
    const-string v6, "\u542f\u7528\u957f\u89c6\u9891\u63d0\u9192"

    .line 780
    .line 781
    const-string v7, "\u5f53\u524d\u64ad\u653e\u89c6\u9891\u603b\u65f6\u957f\u8d85\u8fc7\u8bbe\u5b9a\u503c\u65f6\u5f39\u51fa\u63d0\u9192"

    .line 782
    .line 783
    invoke-static {v1, v6, v7, v2, v5}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 784
    .line 785
    .line 786
    move-result-object v2

    .line 787
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 788
    .line 789
    .line 790
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 791
    .line 792
    .line 793
    move-result-object v2

    .line 794
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 795
    .line 796
    .line 797
    const-string v2, "video_length_alert_minutes"

    .line 798
    .line 799
    :try_start_8
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 800
    .line 801
    .line 802
    move-result-object v5
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 803
    const/16 v6, 0xa

    .line 804
    .line 805
    :try_start_9
    invoke-interface {v5, v2, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 806
    .line 807
    .line 808
    move-result v5
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 809
    :goto_3
    const/16 v2, 0xb4

    .line 810
    .line 811
    goto :goto_4

    .line 812
    :catchall_8
    const/16 v6, 0xa

    .line 813
    .line 814
    :catchall_9
    move v5, v6

    .line 815
    goto :goto_3

    .line 816
    :goto_4
    invoke-static {v5, v4, v2}, Lj81;->μ(III)I

    .line 817
    .line 818
    .line 819
    move-result v18

    .line 820
    new-instance v2, Ldt1;

    .line 821
    .line 822
    const/16 v4, 0x10

    .line 823
    .line 824
    invoke-direct {v2, v4}, Ldt1;-><init>(I)V

    .line 825
    .line 826
    .line 827
    const-string v17, "\u63d0\u9192\u9608\u503c"

    .line 828
    .line 829
    const/16 v19, 0xb4

    .line 830
    .line 831
    const/16 v20, 0x1

    .line 832
    .line 833
    const-string v21, "\u5206\u949f"

    .line 834
    .line 835
    const-string v22, "\u5f53\u89c6\u9891\u603b\u65f6\u957f\u8d85\u8fc7\u8be5\u503c\u65f6\u63d0\u9192\uff0c\u9ed8\u8ba4 10 \u5206\u949f"

    .line 836
    .line 837
    move-object/from16 v16, v1

    .line 838
    .line 839
    move-object/from16 v23, v2

    .line 840
    .line 841
    invoke-static/range {v16 .. v23}, Lbv1;->π(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 842
    .line 843
    .line 844
    move-result-object v1

    .line 845
    move-object/from16 v2, v16

    .line 846
    .line 847
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 848
    .line 849
    .line 850
    invoke-static {v2}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 851
    .line 852
    .line 853
    move-result-object v1

    .line 854
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 855
    .line 856
    .line 857
    const-string v1, "video_length_alert_toast_msg"

    .line 858
    .line 859
    const-string v4, "\u5f53\u524d\u89c6\u9891\u65f6\u957f\u8d85\u8fc7 %d \u5206\u949f"

    .line 860
    .line 861
    invoke-static {v1, v4}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 862
    .line 863
    .line 864
    move-result-object v1

    .line 865
    invoke-static {v1, v11}, Lbv1;->Λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 866
    .line 867
    .line 868
    move-result-object v1

    .line 869
    new-instance v4, Ljt1;

    .line 870
    .line 871
    invoke-direct {v4, v2, v15}, Ljt1;-><init>(Landroid/app/Activity;I)V

    .line 872
    .line 873
    .line 874
    const-string v5, "\u4f7f\u7528 %d \u4ee3\u8868\u89c6\u9891\u65f6\u957f\u5206\u949f\u6570"

    .line 875
    .line 876
    invoke-static {v2, v3, v1, v5, v4}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 877
    .line 878
    .line 879
    move-result-object v1

    .line 880
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 881
    .line 882
    .line 883
    return-object v0

    .line 884
    :pswitch_7
    move-object/from16 v1, p1

    .line 885
    .line 886
    check-cast v1, Landroid/app/Activity;

    .line 887
    .line 888
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 889
    .line 890
    .line 891
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 892
    .line 893
    check-cast v0, Lbv1;

    .line 894
    .line 895
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 896
    .line 897
    .line 898
    sget-object v0, Lzs1;->η:Lys1;

    .line 899
    .line 900
    const-string v2, "\u6b64\u529f\u80fd\u4f1a\u5c4f\u853d\u6296\u97f3\u5b98\u65b9\u7684\u9632\u6c89\u8ff7/\u65f6\u957f\u63d0\u9192\u5f39\u7a97\uff0c\u4e0e\u6a21\u5757\u81ea\u5df1\u7684\u65f6\u957f\u63d0\u9192\u529f\u80fd\u65e0\u5173"

    .line 901
    .line 902
    invoke-static {v1, v0, v2}, Lbv1;->σ(Landroid/content/Context;Lys1;Ljava/lang/String;)Landroid/widget/LinearLayout;

    .line 903
    .line 904
    .line 905
    move-result-object v0

    .line 906
    return-object v0

    .line 907
    :pswitch_8
    move-object/from16 v12, p1

    .line 908
    .line 909
    check-cast v12, Landroid/app/Activity;

    .line 910
    .line 911
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 912
    .line 913
    .line 914
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 915
    .line 916
    check-cast v0, Lbv1;

    .line 917
    .line 918
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 919
    .line 920
    .line 921
    invoke-static {v12}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    const-string v1, "duration_alert_enabled"

    .line 926
    .line 927
    invoke-static {v1, v5}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 928
    .line 929
    .line 930
    move-result v1

    .line 931
    new-instance v2, Loq1;

    .line 932
    .line 933
    invoke-direct {v2, v6}, Loq1;-><init>(I)V

    .line 934
    .line 935
    .line 936
    const-string v6, "\u542f\u7528\u65f6\u957f\u63d0\u9192"

    .line 937
    .line 938
    const-string v7, "\u5f53\u8fde\u7eed\u5237\u89c6\u9891\u8d85\u8fc7\u8bbe\u5b9a\u65f6\u95f4\u540e\u5f39\u7a97\u63d0\u9192\u4f11\u606f"

    .line 939
    .line 940
    invoke-static {v12, v6, v7, v1, v2}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 941
    .line 942
    .line 943
    move-result-object v1

    .line 944
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 945
    .line 946
    .line 947
    invoke-static {v12}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 948
    .line 949
    .line 950
    move-result-object v1

    .line 951
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 952
    .line 953
    .line 954
    const-string v1, "duration_alert_minutes"

    .line 955
    .line 956
    const/16 v2, 0x1e

    .line 957
    .line 958
    :try_start_a
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 959
    .line 960
    .line 961
    move-result-object v6

    .line 962
    invoke-interface {v6, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 963
    .line 964
    .line 965
    move-result v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 966
    :catchall_a
    const/16 v1, 0xb4

    .line 967
    .line 968
    invoke-static {v2, v4, v1}, Lj81;->μ(III)I

    .line 969
    .line 970
    .line 971
    move-result v14

    .line 972
    new-instance v1, Ldt1;

    .line 973
    .line 974
    const/16 v2, 0xe

    .line 975
    .line 976
    invoke-direct {v1, v2}, Ldt1;-><init>(I)V

    .line 977
    .line 978
    .line 979
    const-string v13, "\u63d0\u9192\u65f6\u957f"

    .line 980
    .line 981
    const/16 v15, 0xb4

    .line 982
    .line 983
    const/16 v16, 0x1

    .line 984
    .line 985
    const-string v17, "\u5206\u949f"

    .line 986
    .line 987
    const-string v18, "\u8fde\u7eed\u4f7f\u7528\u8d85\u8fc7\u6b64\u65f6\u957f\u540e\u63d0\u9192\uff0c\u63a8\u8350 20~60 \u5206\u949f"

    .line 988
    .line 989
    move-object/from16 v19, v1

    .line 990
    .line 991
    invoke-static/range {v12 .. v19}, Lbv1;->π(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 992
    .line 993
    .line 994
    move-result-object v1

    .line 995
    invoke-static {v0, v1, v12}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 996
    .line 997
    .line 998
    sget-object v1, Lzs1;->δ:Ljava/util/List;

    .line 999
    .line 1000
    invoke-static {v0, v12, v1, v5}, Lbv1;->α(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/util/List;Z)V

    .line 1001
    .line 1002
    .line 1003
    invoke-static {v12}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v1

    .line 1007
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1008
    .line 1009
    .line 1010
    const-string v1, "duration_alert_message"

    .line 1011
    .line 1012
    const-string v2, "\u4f60\u5df2\u7ecf\u5237\u4e86 %d \u5206\u949f\u4e86,\u4f11\u606f\u4e00\u4e0b\u5427~"

    .line 1013
    .line 1014
    invoke-static {v1, v2}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v1

    .line 1018
    invoke-static {v1, v11}, Lbv1;->Λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v1

    .line 1022
    new-instance v2, Ljt1;

    .line 1023
    .line 1024
    invoke-direct {v2, v12, v5}, Ljt1;-><init>(Landroid/app/Activity;I)V

    .line 1025
    .line 1026
    .line 1027
    const-string v4, "\u4f7f\u7528 %d \u4ee3\u8868\u5df2\u89c2\u770b\u5206\u949f\u6570"

    .line 1028
    .line 1029
    invoke-static {v12, v3, v1, v4, v2}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v1

    .line 1033
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1034
    .line 1035
    .line 1036
    return-object v0

    .line 1037
    :pswitch_9
    move-object/from16 v1, p1

    .line 1038
    .line 1039
    check-cast v1, Ljava/lang/reflect/Method;

    .line 1040
    .line 1041
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1042
    .line 1043
    .line 1044
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 1045
    .line 1046
    check-cast v0, Lki1;

    .line 1047
    .line 1048
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1049
    .line 1050
    .line 1051
    invoke-static {v1}, Lki1;->ζ(Ljava/lang/reflect/Method;)Z

    .line 1052
    .line 1053
    .line 1054
    move-result v0

    .line 1055
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v0

    .line 1059
    return-object v0

    .line 1060
    :pswitch_a
    sget-object v1, Lr7;->η:Lr7;

    .line 1061
    .line 1062
    sget-object v2, Lr7;->ζ:Lr7;

    .line 1063
    .line 1064
    move-object/from16 v3, p1

    .line 1065
    .line 1066
    check-cast v3, Lq7;

    .line 1067
    .line 1068
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1069
    .line 1070
    .line 1071
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 1072
    .line 1073
    check-cast v0, Lsh1;

    .line 1074
    .line 1075
    sget-object v4, Lsh1;->α:Lsh1;

    .line 1076
    .line 1077
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1078
    .line 1079
    .line 1080
    sget-object v4, Lpq;->α:Lpq;

    .line 1081
    .line 1082
    invoke-static {}, Lpq;->α()Lmq;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v4

    .line 1086
    if-eqz v4, :cond_5

    .line 1087
    .line 1088
    iget-wide v6, v4, Lmq;->δ:J

    .line 1089
    .line 1090
    iget-wide v3, v3, Lq7;->α:J

    .line 1091
    .line 1092
    cmp-long v3, v6, v3

    .line 1093
    .line 1094
    if-nez v3, :cond_5

    .line 1095
    .line 1096
    sget-object v3, Lsh1;->κ:Ljava/lang/ref/WeakReference;

    .line 1097
    .line 1098
    if-eqz v3, :cond_1

    .line 1099
    .line 1100
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v3

    .line 1104
    check-cast v3, Landroid/app/Activity;

    .line 1105
    .line 1106
    if-nez v3, :cond_0

    .line 1107
    .line 1108
    goto :goto_5

    .line 1109
    :cond_0
    invoke-static {v3}, Lsh1;->ρ(Landroid/app/Activity;)Z

    .line 1110
    .line 1111
    .line 1112
    move-result v4

    .line 1113
    const-string v6, "auto_scroll_show_toast"

    .line 1114
    .line 1115
    if-eqz v4, :cond_2

    .line 1116
    .line 1117
    invoke-static {v6, v5}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 1118
    .line 1119
    .line 1120
    move-result v0

    .line 1121
    if-eqz v0, :cond_1

    .line 1122
    .line 1123
    const-string v0, "DY Helper\uff1a\u68c0\u6d4b\u5230\u8bc4\u8bba\u533a/\u8f93\u5165\u72b6\u6001\uff0c\u5df2\u6682\u505c\u81ea\u52a8\u4e0b\u6ed1"

    .line 1124
    .line 1125
    invoke-static {v3, v0}, Lsh1;->σ(Landroid/app/Activity;Ljava/lang/String;)V

    .line 1126
    .line 1127
    .line 1128
    :cond_1
    :goto_5
    move-object v1, v2

    .line 1129
    goto :goto_7

    .line 1130
    :cond_2
    invoke-virtual {v0, v3}, Lsh1;->ε(Landroid/app/Activity;)Z

    .line 1131
    .line 1132
    .line 1133
    move-result v0

    .line 1134
    invoke-static {v6, v5}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 1135
    .line 1136
    .line 1137
    move-result v2

    .line 1138
    if-eqz v2, :cond_4

    .line 1139
    .line 1140
    if-eqz v0, :cond_3

    .line 1141
    .line 1142
    const-string v2, "DY Helper\uff1a\u5df2\u81ea\u52a8\u4e0b\u6ed1\u5230\u4e0b\u4e00\u4e2a\u4f5c\u54c1"

    .line 1143
    .line 1144
    goto :goto_6

    .line 1145
    :cond_3
    const-string v2, "DY Helper\uff1a\u672a\u627e\u5230\u53ef\u5207\u6362\u7684\u4f5c\u54c1\u5217\u8868"

    .line 1146
    .line 1147
    :goto_6
    invoke-static {v3, v2}, Lsh1;->σ(Landroid/app/Activity;Ljava/lang/String;)V

    .line 1148
    .line 1149
    .line 1150
    :cond_4
    if-eqz v0, :cond_5

    .line 1151
    .line 1152
    sget-object v1, Lr7;->ε:Lr7;

    .line 1153
    .line 1154
    :cond_5
    :goto_7
    return-object v1

    .line 1155
    :pswitch_b
    move-object/from16 v1, p1

    .line 1156
    .line 1157
    check-cast v1, Lky1;

    .line 1158
    .line 1159
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1160
    .line 1161
    .line 1162
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 1163
    .line 1164
    check-cast v0, Lgf1;

    .line 1165
    .line 1166
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1167
    .line 1168
    .line 1169
    invoke-static {v1}, Lgf1;->β(Lky1;)Z

    .line 1170
    .line 1171
    .line 1172
    move-result v0

    .line 1173
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v0

    .line 1177
    return-object v0

    .line 1178
    :pswitch_c
    move-object/from16 v1, p1

    .line 1179
    .line 1180
    check-cast v1, Ljava/lang/Number;

    .line 1181
    .line 1182
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1183
    .line 1184
    .line 1185
    move-result v1

    .line 1186
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 1187
    .line 1188
    check-cast v0, Lorg/json/JSONArray;

    .line 1189
    .line 1190
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v0

    .line 1194
    return-object v0

    .line 1195
    :pswitch_d
    move-object/from16 v1, p1

    .line 1196
    .line 1197
    check-cast v1, Lorg/json/JSONObject;

    .line 1198
    .line 1199
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1200
    .line 1201
    .line 1202
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 1203
    .line 1204
    check-cast v0, Lpe1;

    .line 1205
    .line 1206
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1207
    .line 1208
    .line 1209
    const-string v0, "behavior_id"

    .line 1210
    .line 1211
    invoke-static {v0, v1}, Lpe1;->ε(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Integer;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v0

    .line 1215
    const/4 v2, 0x0

    .line 1216
    if-eqz v0, :cond_c

    .line 1217
    .line 1218
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1219
    .line 1220
    .line 1221
    move-result v3

    .line 1222
    if-lez v3, :cond_6

    .line 1223
    .line 1224
    goto :goto_8

    .line 1225
    :cond_6
    move-object v0, v2

    .line 1226
    :goto_8
    if-eqz v0, :cond_c

    .line 1227
    .line 1228
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1229
    .line 1230
    .line 1231
    move-result v0

    .line 1232
    const-string v3, "behavior_name"

    .line 1233
    .line 1234
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v3

    .line 1238
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1239
    .line 1240
    .line 1241
    invoke-static {v3}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v3

    .line 1245
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v3

    .line 1249
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 1250
    .line 1251
    .line 1252
    move-result v6

    .line 1253
    if-lez v6, :cond_7

    .line 1254
    .line 1255
    move-object v2, v3

    .line 1256
    :cond_7
    const-string v3, "closeness"

    .line 1257
    .line 1258
    const-string v6, "delta_closeness"

    .line 1259
    .line 1260
    const-string v7, "amount"

    .line 1261
    .line 1262
    filled-new-array {v7, v3, v6}, [Ljava/lang/String;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v3

    .line 1266
    invoke-static {v3}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v3

    .line 1270
    new-instance v6, Lgd1;

    .line 1271
    .line 1272
    invoke-direct {v6, v1, v14}, Lgd1;-><init>(Lorg/json/JSONObject;I)V

    .line 1273
    .line 1274
    .line 1275
    invoke-static {v3, v6}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v3

    .line 1279
    invoke-static {v3}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v3

    .line 1283
    check-cast v3, Ljava/lang/Integer;

    .line 1284
    .line 1285
    const-string v6, "is_claimable"

    .line 1286
    .line 1287
    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v1

    .line 1291
    instance-of v6, v1, Ljava/lang/Boolean;

    .line 1292
    .line 1293
    if-eqz v6, :cond_8

    .line 1294
    .line 1295
    check-cast v1, Ljava/lang/Boolean;

    .line 1296
    .line 1297
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1298
    .line 1299
    .line 1300
    move-result v4

    .line 1301
    goto :goto_9

    .line 1302
    :cond_8
    instance-of v6, v1, Ljava/lang/Number;

    .line 1303
    .line 1304
    if-eqz v6, :cond_a

    .line 1305
    .line 1306
    check-cast v1, Ljava/lang/Number;

    .line 1307
    .line 1308
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1309
    .line 1310
    .line 1311
    move-result v1

    .line 1312
    if-eqz v1, :cond_9

    .line 1313
    .line 1314
    goto :goto_9

    .line 1315
    :cond_9
    move v4, v5

    .line 1316
    goto :goto_9

    .line 1317
    :cond_a
    instance-of v6, v1, Ljava/lang/String;

    .line 1318
    .line 1319
    if-eqz v6, :cond_9

    .line 1320
    .line 1321
    move-object v6, v1

    .line 1322
    check-cast v6, Ljava/lang/String;

    .line 1323
    .line 1324
    const-string v7, "true"

    .line 1325
    .line 1326
    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1327
    .line 1328
    .line 1329
    move-result v6

    .line 1330
    if-nez v6, :cond_b

    .line 1331
    .line 1332
    const-string v6, "1"

    .line 1333
    .line 1334
    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1335
    .line 1336
    .line 1337
    move-result v1

    .line 1338
    if-eqz v1, :cond_9

    .line 1339
    .line 1340
    :cond_b
    :goto_9
    new-instance v1, Lke1;

    .line 1341
    .line 1342
    invoke-direct {v1, v0, v2, v3, v4}, Lke1;-><init>(ILjava/lang/String;Ljava/lang/Integer;Z)V

    .line 1343
    .line 1344
    .line 1345
    move-object v2, v1

    .line 1346
    :cond_c
    return-object v2

    .line 1347
    :pswitch_e
    move-object/from16 v1, p1

    .line 1348
    .line 1349
    check-cast v1, Ljava/lang/String;

    .line 1350
    .line 1351
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1352
    .line 1353
    .line 1354
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 1355
    .line 1356
    check-cast v0, Lkd1;

    .line 1357
    .line 1358
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1359
    .line 1360
    .line 1361
    invoke-static {v1}, Lkd1;->ζ(Ljava/lang/String;)Ljava/lang/String;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v0

    .line 1365
    return-object v0

    .line 1366
    :pswitch_f
    move-object/from16 v1, p1

    .line 1367
    .line 1368
    check-cast v1, Ljava/lang/String;

    .line 1369
    .line 1370
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1371
    .line 1372
    .line 1373
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 1374
    .line 1375
    check-cast v0, Lkd1;

    .line 1376
    .line 1377
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1378
    .line 1379
    .line 1380
    invoke-static {v1}, Lkd1;->ζ(Ljava/lang/String;)Ljava/lang/String;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v0

    .line 1384
    return-object v0

    .line 1385
    :pswitch_10
    move-object/from16 v1, p1

    .line 1386
    .line 1387
    check-cast v1, Ljava/lang/Number;

    .line 1388
    .line 1389
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1390
    .line 1391
    .line 1392
    move-result v1

    .line 1393
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 1394
    .line 1395
    check-cast v0, Lorg/json/JSONArray;

    .line 1396
    .line 1397
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v0

    .line 1401
    return-object v0

    .line 1402
    :pswitch_11
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 1403
    .line 1404
    check-cast v0, Llb1;

    .line 1405
    .line 1406
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1407
    .line 1408
    .line 1409
    invoke-static/range {p1 .. p1}, Llb1;->γ(Ljava/lang/Object;)Ljava/lang/Long;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v0

    .line 1413
    return-object v0

    .line 1414
    :pswitch_12
    move-object/from16 v1, p1

    .line 1415
    .line 1416
    check-cast v1, Ljava/lang/Class;

    .line 1417
    .line 1418
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1419
    .line 1420
    .line 1421
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 1422
    .line 1423
    check-cast v0, Lp81;

    .line 1424
    .line 1425
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1426
    .line 1427
    .line 1428
    invoke-static {v1}, Lp81;->σ(Ljava/lang/Class;)I

    .line 1429
    .line 1430
    .line 1431
    move-result v0

    .line 1432
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1433
    .line 1434
    .line 1435
    move-result-object v0

    .line 1436
    return-object v0

    .line 1437
    :pswitch_13
    move-object/from16 v1, p1

    .line 1438
    .line 1439
    check-cast v1, Ljava/lang/Class;

    .line 1440
    .line 1441
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1442
    .line 1443
    .line 1444
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 1445
    .line 1446
    check-cast v0, Lp81;

    .line 1447
    .line 1448
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1449
    .line 1450
    .line 1451
    invoke-static {v1}, Lp81;->σ(Ljava/lang/Class;)I

    .line 1452
    .line 1453
    .line 1454
    move-result v0

    .line 1455
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v0

    .line 1459
    return-object v0

    .line 1460
    :pswitch_14
    move-object/from16 v1, p1

    .line 1461
    .line 1462
    check-cast v1, Ljava/lang/Class;

    .line 1463
    .line 1464
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1465
    .line 1466
    .line 1467
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 1468
    .line 1469
    check-cast v0, Lp81;

    .line 1470
    .line 1471
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1472
    .line 1473
    .line 1474
    invoke-static {v1}, Lp81;->ρ(Ljava/lang/Class;)I

    .line 1475
    .line 1476
    .line 1477
    move-result v0

    .line 1478
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v0

    .line 1482
    return-object v0

    .line 1483
    :pswitch_15
    move-object/from16 v1, p1

    .line 1484
    .line 1485
    check-cast v1, Ljava/lang/Class;

    .line 1486
    .line 1487
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1488
    .line 1489
    .line 1490
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 1491
    .line 1492
    check-cast v0, Lp81;

    .line 1493
    .line 1494
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1495
    .line 1496
    .line 1497
    invoke-static {v1}, Lp81;->ρ(Ljava/lang/Class;)I

    .line 1498
    .line 1499
    .line 1500
    move-result v0

    .line 1501
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v0

    .line 1505
    return-object v0

    .line 1506
    :pswitch_16
    move-object/from16 v1, p1

    .line 1507
    .line 1508
    check-cast v1, Ljava/lang/reflect/Method;

    .line 1509
    .line 1510
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1511
    .line 1512
    .line 1513
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 1514
    .line 1515
    check-cast v0, Ll41;

    .line 1516
    .line 1517
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1518
    .line 1519
    .line 1520
    invoke-static {v1}, Ll41;->θ(Ljava/lang/reflect/Method;)Z

    .line 1521
    .line 1522
    .line 1523
    move-result v0

    .line 1524
    if-eqz v0, :cond_d

    .line 1525
    .line 1526
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 1527
    .line 1528
    .line 1529
    move-result-object v0

    .line 1530
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v0

    .line 1534
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1535
    .line 1536
    .line 1537
    move-result v0

    .line 1538
    if-eqz v0, :cond_d

    .line 1539
    .line 1540
    sget-object v0, Ll41;->γ:Ljava/util/Set;

    .line 1541
    .line 1542
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v1

    .line 1546
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1547
    .line 1548
    .line 1549
    move-result v0

    .line 1550
    if-eqz v0, :cond_d

    .line 1551
    .line 1552
    goto :goto_a

    .line 1553
    :cond_d
    move v4, v5

    .line 1554
    :goto_a
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v0

    .line 1558
    return-object v0

    .line 1559
    :pswitch_17
    move-object/from16 v1, p1

    .line 1560
    .line 1561
    check-cast v1, Ljava/lang/reflect/Method;

    .line 1562
    .line 1563
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1564
    .line 1565
    .line 1566
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 1567
    .line 1568
    check-cast v0, Ll41;

    .line 1569
    .line 1570
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1571
    .line 1572
    .line 1573
    invoke-static {v1}, Ll41;->η(Ljava/lang/reflect/Method;)Z

    .line 1574
    .line 1575
    .line 1576
    move-result v0

    .line 1577
    if-eqz v0, :cond_e

    .line 1578
    .line 1579
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v0

    .line 1583
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1584
    .line 1585
    .line 1586
    move-result-object v0

    .line 1587
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1588
    .line 1589
    .line 1590
    move-result v0

    .line 1591
    if-eqz v0, :cond_e

    .line 1592
    .line 1593
    sget-object v0, Ll41;->β:Ljava/util/Set;

    .line 1594
    .line 1595
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1596
    .line 1597
    .line 1598
    move-result-object v1

    .line 1599
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1600
    .line 1601
    .line 1602
    move-result v0

    .line 1603
    if-eqz v0, :cond_e

    .line 1604
    .line 1605
    goto :goto_b

    .line 1606
    :cond_e
    move v4, v5

    .line 1607
    :goto_b
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v0

    .line 1611
    return-object v0

    .line 1612
    :pswitch_18
    move-object/from16 v1, p1

    .line 1613
    .line 1614
    check-cast v1, Ljava/lang/String;

    .line 1615
    .line 1616
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1617
    .line 1618
    .line 1619
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 1620
    .line 1621
    check-cast v0, Lqy0;

    .line 1622
    .line 1623
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1624
    .line 1625
    .line 1626
    invoke-static {v1}, Lqy0;->з(Ljava/lang/String;)Ljava/lang/String;

    .line 1627
    .line 1628
    .line 1629
    move-result-object v0

    .line 1630
    return-object v0

    .line 1631
    :pswitch_19
    move-object/from16 v1, p1

    .line 1632
    .line 1633
    check-cast v1, Ljava/lang/String;

    .line 1634
    .line 1635
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1636
    .line 1637
    .line 1638
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 1639
    .line 1640
    check-cast v0, Lqy0;

    .line 1641
    .line 1642
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1643
    .line 1644
    .line 1645
    invoke-static {v1}, Lqy0;->з(Ljava/lang/String;)Ljava/lang/String;

    .line 1646
    .line 1647
    .line 1648
    move-result-object v0

    .line 1649
    return-object v0

    .line 1650
    :pswitch_1a
    move-object/from16 v1, p1

    .line 1651
    .line 1652
    check-cast v1, Ljava/lang/String;

    .line 1653
    .line 1654
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1655
    .line 1656
    .line 1657
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 1658
    .line 1659
    check-cast v0, Lpu0;

    .line 1660
    .line 1661
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1662
    .line 1663
    .line 1664
    invoke-static {v1}, Lpu0;->Η(Ljava/lang/String;)Z

    .line 1665
    .line 1666
    .line 1667
    move-result v0

    .line 1668
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1669
    .line 1670
    .line 1671
    move-result-object v0

    .line 1672
    return-object v0

    .line 1673
    :pswitch_1b
    move-object/from16 v1, p1

    .line 1674
    .line 1675
    check-cast v1, Ljava/lang/String;

    .line 1676
    .line 1677
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1678
    .line 1679
    .line 1680
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 1681
    .line 1682
    check-cast v0, Lqy0;

    .line 1683
    .line 1684
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1685
    .line 1686
    .line 1687
    invoke-static {v1}, Ljx0;->Ζ(Ljava/lang/String;)Z

    .line 1688
    .line 1689
    .line 1690
    move-result v0

    .line 1691
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1692
    .line 1693
    .line 1694
    move-result-object v0

    .line 1695
    return-object v0

    .line 1696
    :pswitch_1c
    move-object/from16 v1, p1

    .line 1697
    .line 1698
    check-cast v1, Ljava/lang/String;

    .line 1699
    .line 1700
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1701
    .line 1702
    .line 1703
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 1704
    .line 1705
    check-cast v0, Lpu0;

    .line 1706
    .line 1707
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1708
    .line 1709
    .line 1710
    invoke-static {v1}, Lpu0;->Τ(Ljava/lang/String;)I

    .line 1711
    .line 1712
    .line 1713
    move-result v0

    .line 1714
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1715
    .line 1716
    .line 1717
    move-result-object v0

    .line 1718
    return-object v0

    .line 1719
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
