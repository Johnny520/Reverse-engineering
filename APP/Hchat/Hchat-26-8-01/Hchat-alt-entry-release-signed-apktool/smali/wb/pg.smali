.class public final synthetic Lwb/pg;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Lv8/a;


# direct methods
.method public synthetic constructor <init>(Lfg/l;Lv8/a;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/pg;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/pg;->h:Lfg/l;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/pg;->i:Lv8/a;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/pg;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-wide/16 v2, 0x0

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    cmp-long v1, v4, v2

    .line 28
    .line 29
    if-gez v1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-wide v2, v4

    .line 33
    :cond_1
    :goto_0
    move-wide v13, v2

    .line 34
    const/16 v18, 0x0

    .line 35
    .line 36
    const/16 v19, 0x3dff

    .line 37
    .line 38
    iget-object v4, v0, Lwb/pg;->i:Lv8/a;

    .line 39
    .line 40
    const/4 v5, 0x0

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v7, 0x0

    .line 43
    const/4 v8, 0x0

    .line 44
    const/4 v9, 0x0

    .line 45
    const/4 v10, 0x0

    .line 46
    const/4 v11, 0x0

    .line 47
    const/4 v12, 0x0

    .line 48
    const/4 v15, 0x0

    .line 49
    const/16 v16, 0x0

    .line 50
    .line 51
    const/16 v17, 0x0

    .line 52
    .line 53
    invoke-static/range {v4 .. v19}, Lv8/a;->a(Lv8/a;Ljava/lang/String;ZZLjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZJZLjava/lang/String;ZLjava/lang/String;I)Lv8/a;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-object v2, v0, Lwb/pg;->h:Lfg/l;

    .line 58
    .line 59
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    :goto_1
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 63
    .line 64
    return-object v1

    .line 65
    :pswitch_0
    move-object/from16 v1, p1

    .line 66
    .line 67
    check-cast v1, Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 70
    .line 71
    .line 72
    move-result v10

    .line 73
    const/16 v16, 0x0

    .line 74
    .line 75
    const/16 v17, 0x3eff

    .line 76
    .line 77
    iget-object v2, v0, Lwb/pg;->i:Lv8/a;

    .line 78
    .line 79
    const/4 v3, 0x0

    .line 80
    const/4 v4, 0x0

    .line 81
    const/4 v5, 0x0

    .line 82
    const/4 v6, 0x0

    .line 83
    const/4 v7, 0x0

    .line 84
    const/4 v8, 0x0

    .line 85
    const/4 v9, 0x0

    .line 86
    const-wide/16 v11, 0x0

    .line 87
    .line 88
    const/4 v13, 0x0

    .line 89
    const/4 v14, 0x0

    .line 90
    const/4 v15, 0x0

    .line 91
    invoke-static/range {v2 .. v17}, Lv8/a;->a(Lv8/a;Ljava/lang/String;ZZLjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZJZLjava/lang/String;ZLjava/lang/String;I)Lv8/a;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    iget-object v2, v0, Lwb/pg;->h:Lfg/l;

    .line 96
    .line 97
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :pswitch_1
    move-object/from16 v3, p1

    .line 102
    .line 103
    check-cast v3, Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    const/16 v16, 0x0

    .line 109
    .line 110
    const/16 v17, 0x3ffd

    .line 111
    .line 112
    iget-object v2, v0, Lwb/pg;->i:Lv8/a;

    .line 113
    .line 114
    const/4 v4, 0x0

    .line 115
    const/4 v5, 0x0

    .line 116
    const/4 v6, 0x0

    .line 117
    const/4 v7, 0x0

    .line 118
    const/4 v8, 0x0

    .line 119
    const/4 v9, 0x0

    .line 120
    const/4 v10, 0x0

    .line 121
    const-wide/16 v11, 0x0

    .line 122
    .line 123
    const/4 v13, 0x0

    .line 124
    const/4 v14, 0x0

    .line 125
    const/4 v15, 0x0

    .line 126
    invoke-static/range {v2 .. v17}, Lv8/a;->a(Lv8/a;Ljava/lang/String;ZZLjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZJZLjava/lang/String;ZLjava/lang/String;I)Lv8/a;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    iget-object v2, v0, Lwb/pg;->h:Lfg/l;

    .line 131
    .line 132
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :pswitch_2
    move-object/from16 v1, p1

    .line 137
    .line 138
    check-cast v1, Ljava/lang/Boolean;

    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    const/16 v16, 0x0

    .line 145
    .line 146
    const/16 v17, 0x3ff7

    .line 147
    .line 148
    iget-object v2, v0, Lwb/pg;->i:Lv8/a;

    .line 149
    .line 150
    const/4 v3, 0x0

    .line 151
    const/4 v4, 0x0

    .line 152
    const/4 v6, 0x0

    .line 153
    const/4 v7, 0x0

    .line 154
    const/4 v8, 0x0

    .line 155
    const/4 v9, 0x0

    .line 156
    const/4 v10, 0x0

    .line 157
    const-wide/16 v11, 0x0

    .line 158
    .line 159
    const/4 v13, 0x0

    .line 160
    const/4 v14, 0x0

    .line 161
    const/4 v15, 0x0

    .line 162
    invoke-static/range {v2 .. v17}, Lv8/a;->a(Lv8/a;Ljava/lang/String;ZZLjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZJZLjava/lang/String;ZLjava/lang/String;I)Lv8/a;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    iget-object v2, v0, Lwb/pg;->h:Lfg/l;

    .line 167
    .line 168
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    goto :goto_1

    .line 172
    :pswitch_3
    move-object/from16 v1, p1

    .line 173
    .line 174
    check-cast v1, Ljava/lang/Boolean;

    .line 175
    .line 176
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    const/16 v16, 0x0

    .line 181
    .line 182
    const/16 v17, 0x3ffb

    .line 183
    .line 184
    iget-object v2, v0, Lwb/pg;->i:Lv8/a;

    .line 185
    .line 186
    const/4 v3, 0x0

    .line 187
    const/4 v5, 0x0

    .line 188
    const/4 v6, 0x0

    .line 189
    const/4 v7, 0x0

    .line 190
    const/4 v8, 0x0

    .line 191
    const/4 v9, 0x0

    .line 192
    const/4 v10, 0x0

    .line 193
    const-wide/16 v11, 0x0

    .line 194
    .line 195
    const/4 v13, 0x0

    .line 196
    const/4 v14, 0x0

    .line 197
    const/4 v15, 0x0

    .line 198
    invoke-static/range {v2 .. v17}, Lv8/a;->a(Lv8/a;Ljava/lang/String;ZZLjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZJZLjava/lang/String;ZLjava/lang/String;I)Lv8/a;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    iget-object v2, v0, Lwb/pg;->h:Lfg/l;

    .line 203
    .line 204
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    goto/16 :goto_1

    .line 208
    .line 209
    :pswitch_4
    move-object/from16 v16, p1

    .line 210
    .line 211
    check-cast v16, Ljava/lang/String;

    .line 212
    .line 213
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    const/4 v15, 0x0

    .line 217
    const/16 v17, 0x1fff

    .line 218
    .line 219
    iget-object v2, v0, Lwb/pg;->i:Lv8/a;

    .line 220
    .line 221
    const/4 v3, 0x0

    .line 222
    const/4 v4, 0x0

    .line 223
    const/4 v5, 0x0

    .line 224
    const/4 v6, 0x0

    .line 225
    const/4 v7, 0x0

    .line 226
    const/4 v8, 0x0

    .line 227
    const/4 v9, 0x0

    .line 228
    const/4 v10, 0x0

    .line 229
    const-wide/16 v11, 0x0

    .line 230
    .line 231
    const/4 v13, 0x0

    .line 232
    const/4 v14, 0x0

    .line 233
    invoke-static/range {v2 .. v17}, Lv8/a;->a(Lv8/a;Ljava/lang/String;ZZLjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZJZLjava/lang/String;ZLjava/lang/String;I)Lv8/a;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    iget-object v2, v0, Lwb/pg;->h:Lfg/l;

    .line 238
    .line 239
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    goto/16 :goto_1

    .line 243
    .line 244
    :pswitch_5
    move-object/from16 v1, p1

    .line 245
    .line 246
    check-cast v1, Ljava/lang/Boolean;

    .line 247
    .line 248
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 249
    .line 250
    .line 251
    move-result v15

    .line 252
    const/16 v16, 0x0

    .line 253
    .line 254
    const/16 v17, 0x2fff

    .line 255
    .line 256
    iget-object v2, v0, Lwb/pg;->i:Lv8/a;

    .line 257
    .line 258
    const/4 v3, 0x0

    .line 259
    const/4 v4, 0x0

    .line 260
    const/4 v5, 0x0

    .line 261
    const/4 v6, 0x0

    .line 262
    const/4 v7, 0x0

    .line 263
    const/4 v8, 0x0

    .line 264
    const/4 v9, 0x0

    .line 265
    const/4 v10, 0x0

    .line 266
    const-wide/16 v11, 0x0

    .line 267
    .line 268
    const/4 v13, 0x0

    .line 269
    const/4 v14, 0x0

    .line 270
    invoke-static/range {v2 .. v17}, Lv8/a;->a(Lv8/a;Ljava/lang/String;ZZLjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZJZLjava/lang/String;ZLjava/lang/String;I)Lv8/a;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    iget-object v2, v0, Lwb/pg;->h:Lfg/l;

    .line 275
    .line 276
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    goto/16 :goto_1

    .line 280
    .line 281
    :pswitch_6
    move-object/from16 v14, p1

    .line 282
    .line 283
    check-cast v14, Ljava/lang/String;

    .line 284
    .line 285
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    const/16 v16, 0x0

    .line 289
    .line 290
    const/16 v17, 0x37ff

    .line 291
    .line 292
    iget-object v2, v0, Lwb/pg;->i:Lv8/a;

    .line 293
    .line 294
    const/4 v3, 0x0

    .line 295
    const/4 v4, 0x0

    .line 296
    const/4 v5, 0x0

    .line 297
    const/4 v6, 0x0

    .line 298
    const/4 v7, 0x0

    .line 299
    const/4 v8, 0x0

    .line 300
    const/4 v9, 0x0

    .line 301
    const/4 v10, 0x0

    .line 302
    const-wide/16 v11, 0x0

    .line 303
    .line 304
    const/4 v13, 0x0

    .line 305
    const/4 v15, 0x0

    .line 306
    invoke-static/range {v2 .. v17}, Lv8/a;->a(Lv8/a;Ljava/lang/String;ZZLjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZJZLjava/lang/String;ZLjava/lang/String;I)Lv8/a;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    iget-object v2, v0, Lwb/pg;->h:Lfg/l;

    .line 311
    .line 312
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    goto/16 :goto_1

    .line 316
    .line 317
    :pswitch_7
    move-object/from16 v1, p1

    .line 318
    .line 319
    check-cast v1, Ljava/lang/Boolean;

    .line 320
    .line 321
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 322
    .line 323
    .line 324
    move-result v13

    .line 325
    const/16 v16, 0x0

    .line 326
    .line 327
    const/16 v17, 0x3bff

    .line 328
    .line 329
    iget-object v2, v0, Lwb/pg;->i:Lv8/a;

    .line 330
    .line 331
    const/4 v3, 0x0

    .line 332
    const/4 v4, 0x0

    .line 333
    const/4 v5, 0x0

    .line 334
    const/4 v6, 0x0

    .line 335
    const/4 v7, 0x0

    .line 336
    const/4 v8, 0x0

    .line 337
    const/4 v9, 0x0

    .line 338
    const/4 v10, 0x0

    .line 339
    const-wide/16 v11, 0x0

    .line 340
    .line 341
    const/4 v14, 0x0

    .line 342
    const/4 v15, 0x0

    .line 343
    invoke-static/range {v2 .. v17}, Lv8/a;->a(Lv8/a;Ljava/lang/String;ZZLjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZJZLjava/lang/String;ZLjava/lang/String;I)Lv8/a;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    iget-object v2, v0, Lwb/pg;->h:Lfg/l;

    .line 348
    .line 349
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    goto/16 :goto_1

    .line 353
    .line 354
    nop

    .line 355
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
