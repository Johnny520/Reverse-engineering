.class public final Lyyds/ᲀᲀᲀᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᲀᲀᲀᛴ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᲀᲀᲀᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 8

    .line 1
    iget p1, p0, Lyyds/ᲀᲀᲀᛴ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 p4, 0x0

    .line 4
    const/4 p5, 0x2

    .line 5
    const/high16 v0, 0x41700000    # 15.0f

    .line 6
    .line 7
    const-wide/16 v1, 0x64

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    iget-object p0, p0, Lyyds/ᲀᲀᲀᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch p1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, Landroidx/appcompat/widget/SearchView;

    .line 16
    .line 17
    invoke-virtual {p0, p3}, Landroidx/appcompat/widget/SearchView;->ᛷᛵᲇᲀ(I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    check-cast p0, Lyyds/ᛲᛳᛱᛲ;

    .line 22
    .line 23
    iget-object p1, p0, Lyyds/ᛲᛳᛱᛲ;->ᛳᛴᲇᛶ:Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {p1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Ljava/lang/Boolean;

    .line 34
    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    move p1, v3

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    :goto_0
    if-nez p1, :cond_1

    .line 44
    .line 45
    goto/16 :goto_3

    .line 46
    .line 47
    :cond_1
    invoke-static {p2}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛸᲀᲁ(Landroid/view/View;)V

    .line 48
    .line 49
    .line 50
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 51
    .line 52
    .line 53
    move-result-wide p1

    .line 54
    iget-wide v4, p0, Lyyds/ᛲᛳᛱᛲ;->ᛸᲀᛷᛲ:J

    .line 55
    .line 56
    sub-long v4, p1, v4

    .line 57
    .line 58
    cmp-long v1, v4, v1

    .line 59
    .line 60
    if-lez v1, :cond_7

    .line 61
    .line 62
    iput-wide p1, p0, Lyyds/ᛲᛳᛱᛲ;->ᛸᲀᛷᛲ:J

    .line 63
    .line 64
    iget p1, p0, Lyyds/ᛲᛳᛱᛲ;->ᲈᛳ:F

    .line 65
    .line 66
    iget-object p2, p0, Lyyds/ᛵᲀᲀᛱ;->ᛱᲀᲈᛲ:Lyyds/ᲁᛷᲇᛸ;

    .line 67
    .line 68
    iget-object p2, p2, Lyyds/ᲁᛷᲇᛸ;->ᲇᲇᲇᛱ:Landroid/view/View;

    .line 69
    .line 70
    check-cast p2, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 71
    .line 72
    invoke-virtual {p2}, Landroid/view/View;->getY()F

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    sub-float/2addr p1, p2

    .line 77
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᲈᲁ(F)I

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    int-to-float p2, p2

    .line 86
    cmpl-float p1, p1, p2

    .line 87
    .line 88
    if-lez p1, :cond_2

    .line 89
    .line 90
    goto/16 :goto_3

    .line 91
    .line 92
    :cond_2
    iput p3, p0, Lyyds/ᛲᛳᛱᛲ;->ᛵᲈᲇᛵ:I

    .line 93
    .line 94
    iget p1, p0, Lyyds/ᛲᛳᛱᛲ;->ᛴᛵᛷᛳ:I

    .line 95
    .line 96
    invoke-static {p1}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_6

    .line 101
    .line 102
    if-eq p1, v3, :cond_5

    .line 103
    .line 104
    if-eq p1, p5, :cond_3

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_3
    iget-object p1, p0, Lyyds/ᛲᛳᛱᛲ;->ᛶᛵᛸᛲ:Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    iget-object p2, p0, Lyyds/ᛲᛳᛱᛲ;->ᛶᛵᛸᛲ:Ljava/util/ArrayList;

    .line 118
    .line 119
    if-eqz p1, :cond_4

    .line 120
    .line 121
    new-instance p1, Ljava/lang/Integer;

    .line 122
    .line 123
    invoke-direct {p1, p3}, Ljava/lang/Integer;-><init>(I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_4
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    :goto_1
    iget-object p1, p0, Lyyds/ᛲᛳᛱᛲ;->ᲈᛳᛵᛴ:Lyyds/ᛶᛷᛲᛴ;

    .line 138
    .line 139
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    .line 140
    .line 141
    .line 142
    iget-object p1, p0, Lyyds/ᛲᛳᛱᛲ;->ᛶᛵᛸᛲ:Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    new-array p1, p1, [I

    .line 149
    .line 150
    iput-object p1, p0, Lyyds/ᛲᛳᛱᛲ;->ᲀᛸᲈᲁ:[I

    .line 151
    .line 152
    iget-object p1, p0, Lyyds/ᛲᛳᛱᛲ;->ᛶᛵᛸᛲ:Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    new-array p1, p1, [Ljava/lang/CharSequence;

    .line 159
    .line 160
    iput-object p1, p0, Lyyds/ᛲᛳᛱᛲ;->ᲀᛳᛷᛷ:[Ljava/lang/CharSequence;

    .line 161
    .line 162
    :goto_2
    iget-object p1, p0, Lyyds/ᛲᛳᛱᛲ;->ᛶᛵᛸᛲ:Ljava/util/ArrayList;

    .line 163
    .line 164
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    if-ge p4, p1, :cond_7

    .line 169
    .line 170
    iget-object p1, p0, Lyyds/ᛲᛳᛱᛲ;->ᲀᛸᲈᲁ:[I

    .line 171
    .line 172
    iget-object p2, p0, Lyyds/ᛲᛳᛱᛲ;->ᛶᛵᛸᛲ:Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    check-cast p2, Ljava/lang/Integer;

    .line 179
    .line 180
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 181
    .line 182
    .line 183
    move-result p2

    .line 184
    aput p2, p1, p4

    .line 185
    .line 186
    iget-object p1, p0, Lyyds/ᛲᛳᛱᛲ;->ᲀᛳᛷᛷ:[Ljava/lang/CharSequence;

    .line 187
    .line 188
    iget-object p2, p0, Lyyds/ᛲᛳᛱᛲ;->ᛲᛳᛵᛱ:Ljava/util/List;

    .line 189
    .line 190
    iget-object p3, p0, Lyyds/ᛲᛳᛱᛲ;->ᲀᛸᲈᲁ:[I

    .line 191
    .line 192
    aget p3, p3, p4

    .line 193
    .line 194
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p2

    .line 198
    check-cast p2, Ljava/lang/CharSequence;

    .line 199
    .line 200
    aput-object p2, p1, p4

    .line 201
    .line 202
    add-int/lit8 p4, p4, 0x1

    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_5
    iget-object p0, p0, Lyyds/ᛲᛳᛱᛲ;->ᲈᛳᛵᛴ:Lyyds/ᛶᛷᛲᛴ;

    .line 206
    .line 207
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    .line 208
    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_6
    invoke-virtual {p0}, Lyyds/ᛵᲀᲀᛱ;->ᛲᲀᛵᛷ()V

    .line 212
    .line 213
    .line 214
    :cond_7
    :goto_3
    return-void

    .line 215
    :pswitch_1
    check-cast p0, Lyyds/ᛵᛱᲀᛱ;

    .line 216
    .line 217
    iget-object p1, p0, Lyyds/ᛵᛱᲀᛱ;->ᛴᛸᛴᛸ:Lyyds/ᛵᛱᲀᛱ;

    .line 218
    .line 219
    iget-object v4, p0, Lyyds/ᛵᛱᲀᛱ;->ᲀᛳᛷᛷ:Ljava/util/ArrayList;

    .line 220
    .line 221
    if-eqz v4, :cond_8

    .line 222
    .line 223
    if-ltz p3, :cond_8

    .line 224
    .line 225
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 226
    .line 227
    .line 228
    move-result v4

    .line 229
    if-ge p3, v4, :cond_8

    .line 230
    .line 231
    iget-object v4, p0, Lyyds/ᛵᛱᲀᛱ;->ᲀᛳᛷᛷ:Ljava/util/ArrayList;

    .line 232
    .line 233
    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object p3

    .line 237
    check-cast p3, Ljava/lang/Integer;

    .line 238
    .line 239
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 240
    .line 241
    .line 242
    move-result p3

    .line 243
    :cond_8
    iget-object v4, p0, Lyyds/ᛵᛱᲀᛱ;->ᛳᛴᲇᛶ:Ljava/util/HashMap;

    .line 244
    .line 245
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    check-cast v4, Ljava/lang/Boolean;

    .line 254
    .line 255
    if-nez v4, :cond_9

    .line 256
    .line 257
    move v4, v3

    .line 258
    goto :goto_4

    .line 259
    :cond_9
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    :goto_4
    if-nez v4, :cond_a

    .line 264
    .line 265
    goto/16 :goto_7

    .line 266
    .line 267
    :cond_a
    invoke-static {p2}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛸᲀᲁ(Landroid/view/View;)V

    .line 268
    .line 269
    .line 270
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 271
    .line 272
    .line 273
    move-result-wide v4

    .line 274
    iget-wide v6, p0, Lyyds/ᛵᛱᲀᛱ;->ᛱᛵᲈᛸ:J

    .line 275
    .line 276
    sub-long v6, v4, v6

    .line 277
    .line 278
    cmp-long p2, v6, v1

    .line 279
    .line 280
    if-lez p2, :cond_13

    .line 281
    .line 282
    iput-wide v4, p0, Lyyds/ᛵᛱᲀᛱ;->ᛱᛵᲈᛸ:J

    .line 283
    .line 284
    iget p2, p0, Lyyds/ᛵᛱᲀᛱ;->ᲈᛲᛳᛶ:F

    .line 285
    .line 286
    iget-object v1, p0, Lyyds/ᛴᛱᛱᛸ;->ᛱᲀᲈᛲ:Lyyds/ᲇᛵᲈᛵ;

    .line 287
    .line 288
    iget-object v1, v1, Lyyds/ᲇᛵᲈᛵ;->ᲀᛲᛳᲀ:Landroid/widget/RelativeLayout;

    .line 289
    .line 290
    invoke-virtual {v1}, Landroid/view/View;->getY()F

    .line 291
    .line 292
    .line 293
    move-result v1

    .line 294
    sub-float/2addr p2, v1

    .line 295
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 296
    .line 297
    .line 298
    move-result p2

    .line 299
    new-instance v1, Ljava/lang/StringBuilder;

    .line 300
    .line 301
    const-string v2, "#Click:deltaY= "

    .line 302
    .line 303
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    invoke-static {v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᛳᛶᛳ(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᲈᲁ(F)I

    .line 317
    .line 318
    .line 319
    move-result v0

    .line 320
    int-to-float v0, v0

    .line 321
    cmpl-float p2, p2, v0

    .line 322
    .line 323
    if-lez p2, :cond_b

    .line 324
    .line 325
    goto/16 :goto_7

    .line 326
    .line 327
    :cond_b
    iput p3, p0, Lyyds/ᛵᛱᲀᛱ;->ᛵᲈᲇᛵ:I

    .line 328
    .line 329
    new-instance p2, Ljava/lang/StringBuilder;

    .line 330
    .line 331
    const-string v0, "### onMenuItemClickListener="

    .line 332
    .line 333
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    iget-object v0, p0, Lyyds/ᛵᛱᲀᛱ;->ᲇᲇᲈᲀ:Lyyds/ᛲᛸᛲᛶ;

    .line 337
    .line 338
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object p2

    .line 345
    invoke-static {p2}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᛳᛶᛳ(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    iget p2, p0, Lyyds/ᛵᛱᲀᛱ;->ᛸᲇᛱᲇ:I

    .line 349
    .line 350
    invoke-static {p2}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 351
    .line 352
    .line 353
    move-result p2

    .line 354
    if-eqz p2, :cond_11

    .line 355
    .line 356
    if-eq p2, v3, :cond_f

    .line 357
    .line 358
    if-eq p2, p5, :cond_c

    .line 359
    .line 360
    goto/16 :goto_7

    .line 361
    .line 362
    :cond_c
    iget-object p2, p0, Lyyds/ᛵᛱᲀᛱ;->ᲇᲇᲈᲀ:Lyyds/ᛲᛸᛲᛶ;

    .line 363
    .line 364
    if-eqz p2, :cond_d

    .line 365
    .line 366
    iget-object p4, p0, Lyyds/ᛵᛱᲀᛱ;->ᛸᲀᛷᛲ:Ljava/util/List;

    .line 367
    .line 368
    invoke-interface {p4, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object p4

    .line 372
    check-cast p4, Ljava/lang/CharSequence;

    .line 373
    .line 374
    invoke-interface {p2, p3, p1}, Lyyds/ᛲᛸᛲᛶ;->ᛵᛸᛸᛷ(ILjava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {p0}, Lyyds/ᛴᛱᛱᛸ;->ᛲᲀᛵᛷ()V

    .line 378
    .line 379
    .line 380
    goto/16 :goto_7

    .line 381
    .line 382
    :cond_d
    iget-object p1, p0, Lyyds/ᛵᛱᲀᛱ;->ᛶᛵᛸᛲ:Ljava/util/ArrayList;

    .line 383
    .line 384
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 385
    .line 386
    .line 387
    move-result-object p2

    .line 388
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result p1

    .line 392
    iget-object p2, p0, Lyyds/ᛵᛱᲀᛱ;->ᛶᛵᛸᛲ:Ljava/util/ArrayList;

    .line 393
    .line 394
    if-eqz p1, :cond_e

    .line 395
    .line 396
    new-instance p1, Ljava/lang/Integer;

    .line 397
    .line 398
    invoke-direct {p1, p3}, Ljava/lang/Integer;-><init>(I)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    goto :goto_5

    .line 405
    :cond_e
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 406
    .line 407
    .line 408
    move-result-object p1

    .line 409
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    :goto_5
    iget-object p1, p0, Lyyds/ᛵᛱᲀᛱ;->ᲈᛳ:Lyyds/ᛶᛷᛲᛴ;

    .line 413
    .line 414
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    .line 415
    .line 416
    .line 417
    iget-object p1, p0, Lyyds/ᛵᛱᲀᛱ;->ᛶᛵᛸᛲ:Ljava/util/ArrayList;

    .line 418
    .line 419
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 420
    .line 421
    .line 422
    move-result p1

    .line 423
    new-array p1, p1, [I

    .line 424
    .line 425
    iput-object p1, p0, Lyyds/ᛵᛱᲀᛱ;->ᛱᛵᛳᛳ:[I

    .line 426
    .line 427
    iget-object p1, p0, Lyyds/ᛵᛱᲀᛱ;->ᛶᛵᛸᛲ:Ljava/util/ArrayList;

    .line 428
    .line 429
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 430
    .line 431
    .line 432
    move-result p1

    .line 433
    new-array p1, p1, [Ljava/lang/CharSequence;

    .line 434
    .line 435
    iput-object p1, p0, Lyyds/ᛵᛱᲀᛱ;->ᛵᛵᛷᲀ:[Ljava/lang/CharSequence;

    .line 436
    .line 437
    :goto_6
    iget-object p1, p0, Lyyds/ᛵᛱᲀᛱ;->ᛶᛵᛸᛲ:Ljava/util/ArrayList;

    .line 438
    .line 439
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 440
    .line 441
    .line 442
    move-result p1

    .line 443
    if-ge p4, p1, :cond_13

    .line 444
    .line 445
    iget-object p1, p0, Lyyds/ᛵᛱᲀᛱ;->ᛱᛵᛳᛳ:[I

    .line 446
    .line 447
    iget-object p2, p0, Lyyds/ᛵᛱᲀᛱ;->ᛶᛵᛸᛲ:Ljava/util/ArrayList;

    .line 448
    .line 449
    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object p2

    .line 453
    check-cast p2, Ljava/lang/Integer;

    .line 454
    .line 455
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 456
    .line 457
    .line 458
    move-result p2

    .line 459
    aput p2, p1, p4

    .line 460
    .line 461
    iget-object p1, p0, Lyyds/ᛵᛱᲀᛱ;->ᛵᛵᛷᲀ:[Ljava/lang/CharSequence;

    .line 462
    .line 463
    iget-object p2, p0, Lyyds/ᛵᛱᲀᛱ;->ᛸᲀᛷᛲ:Ljava/util/List;

    .line 464
    .line 465
    iget-object p3, p0, Lyyds/ᛵᛱᲀᛱ;->ᛱᛵᛳᛳ:[I

    .line 466
    .line 467
    aget p3, p3, p4

    .line 468
    .line 469
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object p2

    .line 473
    check-cast p2, Ljava/lang/CharSequence;

    .line 474
    .line 475
    aput-object p2, p1, p4

    .line 476
    .line 477
    add-int/lit8 p4, p4, 0x1

    .line 478
    .line 479
    goto :goto_6

    .line 480
    :cond_f
    iget-object p2, p0, Lyyds/ᛵᛱᲀᛱ;->ᲇᲇᲈᲀ:Lyyds/ᛲᛸᛲᛶ;

    .line 481
    .line 482
    if-eqz p2, :cond_10

    .line 483
    .line 484
    iget-object p4, p0, Lyyds/ᛵᛱᲀᛱ;->ᛸᲀᛷᛲ:Ljava/util/List;

    .line 485
    .line 486
    invoke-interface {p4, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object p4

    .line 490
    check-cast p4, Ljava/lang/CharSequence;

    .line 491
    .line 492
    invoke-interface {p2, p3, p1}, Lyyds/ᛲᛸᛲᛶ;->ᛵᛸᛸᛷ(ILjava/lang/Object;)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {p0}, Lyyds/ᛴᛱᛱᛸ;->ᛲᲀᛵᛷ()V

    .line 496
    .line 497
    .line 498
    goto :goto_7

    .line 499
    :cond_10
    iget-object p0, p0, Lyyds/ᛵᛱᲀᛱ;->ᲈᛳ:Lyyds/ᛶᛷᛲᛴ;

    .line 500
    .line 501
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    .line 502
    .line 503
    .line 504
    goto :goto_7

    .line 505
    :cond_11
    iget-object p2, p0, Lyyds/ᛵᛱᲀᛱ;->ᲇᲇᲈᲀ:Lyyds/ᛲᛸᛲᛶ;

    .line 506
    .line 507
    if-eqz p2, :cond_12

    .line 508
    .line 509
    iget-object p4, p0, Lyyds/ᛵᛱᲀᛱ;->ᛸᲀᛷᛲ:Ljava/util/List;

    .line 510
    .line 511
    invoke-interface {p4, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object p4

    .line 515
    check-cast p4, Ljava/lang/CharSequence;

    .line 516
    .line 517
    invoke-interface {p2, p3, p1}, Lyyds/ᛲᛸᛲᛶ;->ᛵᛸᛸᛷ(ILjava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    invoke-virtual {p0}, Lyyds/ᛴᛱᛱᛸ;->ᛲᲀᛵᛷ()V

    .line 521
    .line 522
    .line 523
    goto :goto_7

    .line 524
    :cond_12
    invoke-virtual {p0}, Lyyds/ᛴᛱᛱᛸ;->ᛲᲀᛵᛷ()V

    .line 525
    .line 526
    .line 527
    :cond_13
    :goto_7
    return-void

    .line 528
    :pswitch_2
    check-cast p0, Lyyds/ᲈᛱᲈᛵ;

    .line 529
    .line 530
    iget-object p1, p0, Lyyds/ᲈᛱᲈᛵ;->ᲀᛴᲁᲈ:Lyyds/ᲀᛱᛵᛶ;

    .line 531
    .line 532
    invoke-virtual {p1, p3}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 533
    .line 534
    .line 535
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    .line 536
    .line 537
    .line 538
    move-result-object p4

    .line 539
    if-eqz p4, :cond_14

    .line 540
    .line 541
    iget-object p4, p0, Lyyds/ᲈᛱᲈᛵ;->ᛱᛳᛶᛳ:Lyyds/ᛱᲁᛸᛲ;

    .line 542
    .line 543
    invoke-virtual {p4, p3}, Lyyds/ᛱᲁᛸᛲ;->getItemId(I)J

    .line 544
    .line 545
    .line 546
    move-result-wide p4

    .line 547
    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/widget/AdapterView;->performItemClick(Landroid/view/View;IJ)Z

    .line 548
    .line 549
    .line 550
    :cond_14
    invoke-virtual {p0}, Lyyds/ᲁᲇᲀᛸ;->dismiss()V

    .line 551
    .line 552
    .line 553
    return-void

    .line 554
    nop

    .line 555
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
