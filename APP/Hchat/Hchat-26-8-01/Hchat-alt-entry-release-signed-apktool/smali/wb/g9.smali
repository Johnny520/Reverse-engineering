.class public final synthetic Lwb/g9;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Landroid/content/SharedPreferences;

.field public final synthetic j:Z

.field public final synthetic k:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;ZLi0/a1;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwb/g9;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/g9;->i:Landroid/content/SharedPreferences;

    .line 8
    .line 9
    iput-boolean p2, p0, Lwb/g9;->j:Z

    .line 10
    .line 11
    iput-object p3, p0, Lwb/g9;->h:Li0/a1;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/g9;->k:Li0/a1;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Li0/a1;Landroid/content/SharedPreferences;ZLi0/a1;)V
    .locals 1

    .line 16
    const/4 v0, 0x1

    iput v0, p0, Lwb/g9;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/g9;->h:Li0/a1;

    iput-object p2, p0, Lwb/g9;->i:Landroid/content/SharedPreferences;

    iput-boolean p3, p0, Lwb/g9;->j:Z

    iput-object p4, p0, Lwb/g9;->k:Li0/a1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lwb/g9;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v6, p1

    .line 7
    check-cast v6, Li0/h0;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    and-int/lit8 p2, p1, 0x3

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v10, 0x1

    .line 20
    if-eq p2, v0, :cond_0

    .line 21
    .line 22
    move p2, v10

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p2, v9

    .line 25
    :goto_0
    and-int/2addr p1, v10

    .line 26
    invoke-virtual {v6, p1, p2}, Li0/h0;->S(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_7

    .line 31
    .line 32
    iget-object p1, p0, Lwb/g9;->h:Li0/a1;

    .line 33
    .line 34
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    check-cast p2, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {v6, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    iget-object v0, p0, Lwb/g9;->i:Landroid/content/SharedPreferences;

    .line 49
    .line 50
    invoke-virtual {v6, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    or-int/2addr p2, v2

    .line 55
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    sget-object v11, Li0/l;->a:Li0/e;

    .line 60
    .line 61
    if-nez p2, :cond_1

    .line 62
    .line 63
    if-ne v2, v11, :cond_2

    .line 64
    .line 65
    :cond_1
    new-instance v2, Lwb/me;

    .line 66
    .line 67
    const/4 p2, 0x1

    .line 68
    invoke-direct {v2, v0, p1, p2}, Lwb/me;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v6, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    move-object v5, v2

    .line 75
    check-cast v5, Lfg/l;

    .line 76
    .line 77
    const/16 v7, 0x1b0

    .line 78
    .line 79
    const/16 v8, 0x8

    .line 80
    .line 81
    const-string v2, "\u60ac\u6d6e\u5e95\u680f"

    .line 82
    .line 83
    const-string v3, "\u4f7f\u7528\u60ac\u6d6e\u6837\u5f0f\u7684\u5e95\u90e8\u5bfc\u822a\u680f"

    .line 84
    .line 85
    const/4 v4, 0x0

    .line 86
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 87
    .line 88
    .line 89
    const/4 p1, 0x0

    .line 90
    invoke-static {p1, v6, v9, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 91
    .line 92
    .line 93
    iget-boolean v4, p0, Lwb/g9;->j:Z

    .line 94
    .line 95
    iget-object p1, p0, Lwb/g9;->k:Li0/a1;

    .line 96
    .line 97
    if-eqz v4, :cond_3

    .line 98
    .line 99
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    check-cast p2, Ljava/lang/Boolean;

    .line 104
    .line 105
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    if-eqz p2, :cond_3

    .line 110
    .line 111
    move v1, v10

    .line 112
    goto :goto_1

    .line 113
    :cond_3
    move v1, v9

    .line 114
    :goto_1
    if-eqz v4, :cond_4

    .line 115
    .line 116
    const-string p2, "\u542f\u7528\u60ac\u6d6e\u5e95\u680f\u7684\u6db2\u6001\u73bb\u7483\u6548\u679c"

    .line 117
    .line 118
    :goto_2
    move-object v3, p2

    .line 119
    goto :goto_3

    .line 120
    :cond_4
    const-string p2, "Android 13 \u4ee5\u4e0b\u4e0d\u652f\u6301\u6db2\u6001\u73bb\u7483\u6548\u679c"

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :goto_3
    invoke-virtual {v6, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result p2

    .line 127
    invoke-virtual {v6, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    or-int/2addr p2, v2

    .line 132
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    if-nez p2, :cond_5

    .line 137
    .line 138
    if-ne v2, v11, :cond_6

    .line 139
    .line 140
    :cond_5
    new-instance v2, Lc9/x;

    .line 141
    .line 142
    invoke-direct {v2, v4, v0, p1}, Lc9/x;-><init>(ZLandroid/content/SharedPreferences;Li0/a1;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v6, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :cond_6
    move-object v5, v2

    .line 149
    check-cast v5, Lfg/l;

    .line 150
    .line 151
    const/16 v7, 0xc30

    .line 152
    .line 153
    const/4 v8, 0x0

    .line 154
    const-string v2, "\u6db2\u6001\u73bb\u7483"

    .line 155
    .line 156
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 157
    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_7
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 161
    .line 162
    .line 163
    :goto_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 164
    .line 165
    return-object p1

    .line 166
    :pswitch_0
    move-object v5, p1

    .line 167
    check-cast v5, Li0/h0;

    .line 168
    .line 169
    check-cast p2, Ljava/lang/Integer;

    .line 170
    .line 171
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    and-int/lit8 p2, p1, 0x3

    .line 176
    .line 177
    const/4 v0, 0x2

    .line 178
    const/4 v9, 0x1

    .line 179
    const/4 v10, 0x0

    .line 180
    if-eq p2, v0, :cond_8

    .line 181
    .line 182
    move p2, v9

    .line 183
    goto :goto_5

    .line 184
    :cond_8
    move p2, v10

    .line 185
    :goto_5
    and-int/2addr p1, v9

    .line 186
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    if-eqz p1, :cond_c

    .line 191
    .line 192
    const/4 v4, 0x0

    .line 193
    const/16 v6, 0x6db0

    .line 194
    .line 195
    iget-object v0, p0, Lwb/g9;->i:Landroid/content/SharedPreferences;

    .line 196
    .line 197
    const-string v1, "anti_recall_enable"

    .line 198
    .line 199
    const-string v2, "\u9632\u64a4\u56de"

    .line 200
    .line 201
    const-string v3, "\u4fdd\u7559\u88ab\u64a4\u56de\u7684\u6d88\u606f\uff0c\u5e76\u5728\u4e0b\u65b9\u63d2\u5165\u63d0\u793a"

    .line 202
    .line 203
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 204
    .line 205
    .line 206
    const/4 p1, 0x0

    .line 207
    invoke-static {p1, v5, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 208
    .line 209
    .line 210
    const-string v1, "anti_recall_keep_self"

    .line 211
    .line 212
    const-string v2, "\u4fdd\u7559\u81ea\u5df1\u64a4\u56de"

    .line 213
    .line 214
    const-string v3, "\u5f00\u542f\u540e\u81ea\u5df1\u64a4\u56de\u7684\u6d88\u606f\u4e5f\u4f1a\u4fdd\u7559"

    .line 215
    .line 216
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 217
    .line 218
    .line 219
    invoke-static {p1, v5, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 220
    .line 221
    .line 222
    const/4 v4, 0x1

    .line 223
    const-string v1, "anti_recall_show_notice"

    .line 224
    .line 225
    const-string v2, "\u663e\u793a\u64a4\u56de\u63d0\u793a"

    .line 226
    .line 227
    const-string v3, "\u5728\u88ab\u64a4\u56de\u6d88\u606f\u4e0b\u65b9\u63d2\u5165\u63d0\u793a"

    .line 228
    .line 229
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 230
    .line 231
    .line 232
    invoke-static {p1, v5, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 233
    .line 234
    .line 235
    iget-object p2, p0, Lwb/g9;->h:Li0/a1;

    .line 236
    .line 237
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    move-object v2, v0

    .line 242
    check-cast v2, Ljava/lang/String;

    .line 243
    .line 244
    sget-object v3, Lwb/ho;->h:Ljava/util/List;

    .line 245
    .line 246
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    sget-object v11, Li0/l;->a:Li0/e;

    .line 251
    .line 252
    if-ne v0, v11, :cond_9

    .line 253
    .line 254
    new-instance v0, Lwb/ab;

    .line 255
    .line 256
    const/16 v1, 0x1b

    .line 257
    .line 258
    invoke-direct {v0, p2, v1}, Lwb/ab;-><init>(Li0/a1;I)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v5, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    :cond_9
    check-cast v0, Lfg/l;

    .line 265
    .line 266
    const v7, 0x30036

    .line 267
    .line 268
    .line 269
    const/16 v8, 0x10

    .line 270
    .line 271
    move-object v6, v5

    .line 272
    move-object v5, v0

    .line 273
    const-string v0, "\u63d0\u793a\u6587\u6848"

    .line 274
    .line 275
    const-string v1, "\u70b9\u51fb\u4e0b\u65b9\u53d8\u91cf\u63d2\u5165\u5230\u5149\u6807\u4f4d\u7f6e"

    .line 276
    .line 277
    const/4 v4, 0x0

    .line 278
    invoke-static/range {v0 .. v8}, Lwb/ho;->i4(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILfg/l;Li0/h0;II)V

    .line 279
    .line 280
    .line 281
    move-object v5, v6

    .line 282
    iget-boolean p2, p0, Lwb/g9;->j:Z

    .line 283
    .line 284
    if-eqz p2, :cond_b

    .line 285
    .line 286
    const p2, 0x70b81247

    .line 287
    .line 288
    .line 289
    invoke-virtual {v5, p2}, Li0/h0;->a0(I)V

    .line 290
    .line 291
    .line 292
    invoke-static {p1, v5, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 293
    .line 294
    .line 295
    iget-object p1, p0, Lwb/g9;->k:Li0/a1;

    .line 296
    .line 297
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object p2

    .line 301
    move-object v2, p2

    .line 302
    check-cast v2, Ljava/lang/String;

    .line 303
    .line 304
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object p2

    .line 308
    if-ne p2, v11, :cond_a

    .line 309
    .line 310
    new-instance p2, Lwb/ab;

    .line 311
    .line 312
    const/16 v0, 0x1c

    .line 313
    .line 314
    invoke-direct {p2, p1, v0}, Lwb/ab;-><init>(Li0/a1;I)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v5, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    :cond_a
    move-object v4, p2

    .line 321
    check-cast v4, Lfg/l;

    .line 322
    .line 323
    const/16 v6, 0x6036

    .line 324
    .line 325
    const/16 v7, 0x8

    .line 326
    .line 327
    const-string v0, "\u65f6\u95f4\u683c\u5f0f"

    .line 328
    .line 329
    const-string v1, "\u4f7f\u7528\u65e5\u671f\u683c\u5f0f\uff0c\u4f8b\u5982 yyyy-MM-dd HH:mm:ss"

    .line 330
    .line 331
    const/4 v3, 0x0

    .line 332
    invoke-static/range {v0 .. v7}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v5, v10}, Li0/h0;->p(Z)V

    .line 336
    .line 337
    .line 338
    goto :goto_6

    .line 339
    :cond_b
    const p1, 0x70bc52e9

    .line 340
    .line 341
    .line 342
    invoke-virtual {v5, p1}, Li0/h0;->a0(I)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v5, v10}, Li0/h0;->p(Z)V

    .line 346
    .line 347
    .line 348
    goto :goto_6

    .line 349
    :cond_c
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 350
    .line 351
    .line 352
    :goto_6
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 353
    .line 354
    return-object p1

    .line 355
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
