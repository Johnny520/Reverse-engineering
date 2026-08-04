.class public final Lyyds/ᛶᛷᛲᛴ;
.super Landroid/widget/BaseAdapter;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᛴᛳᛲ:Landroid/content/Context;

.field public ᛶᛷᛲᲁ:Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public ᲇᲇᲇᛱ:Lyyds/ᲇᲇᛱᲇ;

.field public ᲇᲈᛵᛷ:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛶᛷᛲᛴ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛶᛷᛲᛴ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lyyds/ᛶᛷᛲᛴ;->ᲇᲈᛵᛷ:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :pswitch_0
    iget-object p0, p0, Lyyds/ᛶᛷᛲᛴ;->ᲇᲈᛵᛷ:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛶᛷᛲᛴ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lyyds/ᛶᛷᛲᛴ;->ᲇᲈᛵᛷ:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/lang/CharSequence;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_0
    iget-object p0, p0, Lyyds/ᛶᛷᛲᛴ;->ᲇᲈᛵᛷ:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ljava/lang/CharSequence;

    .line 22
    .line 23
    return-object p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getItemId(I)J
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛶᛷᛲᛴ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    int-to-long p0, p1

    .line 7
    return-wide p0

    .line 8
    :pswitch_0
    int-to-long p0, p1

    .line 9
    return-wide p0

    .line 10
    nop

    .line 11
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lyyds/ᛶᛷᛲᛴ;->ᲀᛲᛳᲀ:I

    .line 6
    .line 7
    const/4 v11, 0x2

    .line 8
    const/high16 v12, 0x3f800000    # 1.0f

    .line 9
    .line 10
    const v13, 0x3ecccccd    # 0.4f

    .line 11
    .line 12
    .line 13
    const v14, 0x66090430

    .line 14
    .line 15
    .line 16
    const v15, 0x66090562

    .line 17
    .line 18
    .line 19
    const/high16 p3, 0x3f000000    # 0.5f

    .line 20
    .line 21
    const v3, 0x6609026b

    .line 22
    .line 23
    .line 24
    const v4, 0x6609026a

    .line 25
    .line 26
    .line 27
    const v5, 0x660c0078

    .line 28
    .line 29
    .line 30
    const/4 v7, 0x0

    .line 31
    const/16 v16, 0x1

    .line 32
    .line 33
    packed-switch v2, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    iget-object v2, v0, Lyyds/ᛶᛷᛲᛴ;->ᛲᛴᛳᛲ:Landroid/content/Context;

    .line 37
    .line 38
    iget-object v8, v0, Lyyds/ᛶᛷᛲᛴ;->ᛶᛷᛲᲁ:Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 39
    .line 40
    check-cast v8, Lyyds/ᛲᛳᛱᛲ;

    .line 41
    .line 42
    if-nez p2, :cond_0

    .line 43
    .line 44
    new-instance v9, Lyyds/ᲇᲀᛷᛷ;

    .line 45
    .line 46
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-static {v2}, Lyyds/ᛴᛶᲀᛲ;->ᛲᛳᛶᲁ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 50
    .line 51
    .line 52
    move-result-object v10

    .line 53
    iget-object v6, v8, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

    .line 54
    .line 55
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget-object v6, v8, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

    .line 59
    .line 60
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v8}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Lyyds/ᛶᛷᛲᛴ;->getCount()I

    .line 67
    .line 68
    .line 69
    invoke-virtual {v10, v5, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {v5, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Landroid/widget/ImageView;

    .line 78
    .line 79
    iput-object v4, v9, Lyyds/ᲇᲀᛷᛷ;->ᛲᲈᲁ:Landroid/widget/ImageView;

    .line 80
    .line 81
    invoke-virtual {v5, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    check-cast v3, Landroid/widget/ImageView;

    .line 86
    .line 87
    iput-object v3, v9, Lyyds/ᲇᲀᛷᛷ;->ᛵᛸᛸᛷ:Landroid/widget/ImageView;

    .line 88
    .line 89
    invoke-virtual {v5, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    check-cast v3, Landroid/widget/TextView;

    .line 94
    .line 95
    iput-object v3, v9, Lyyds/ᲇᲀᛷᛷ;->ᲀᛲᛳᲀ:Landroid/widget/TextView;

    .line 96
    .line 97
    invoke-virtual {v5, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    check-cast v3, Landroid/widget/Space;

    .line 102
    .line 103
    iput-object v3, v9, Lyyds/ᲇᲀᛷᛷ;->ᲇᲈᛵᛷ:Landroid/widget/Space;

    .line 104
    .line 105
    invoke-virtual {v5, v9}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_0
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    move-object v9, v3

    .line 114
    check-cast v9, Lyyds/ᲇᲀᛷᛷ;

    .line 115
    .line 116
    move-object/from16 v5, p2

    .line 117
    .line 118
    :goto_0
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    iget-object v3, v8, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

    .line 122
    .line 123
    iget-object v4, v8, Lyyds/ᛲᛳᛱᛲ;->ᛳᛴᲇᛶ:Ljava/util/HashMap;

    .line 124
    .line 125
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    check-cast v4, Ljava/lang/Boolean;

    .line 134
    .line 135
    if-nez v4, :cond_1

    .line 136
    .line 137
    move/from16 v4, v16

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_1
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    :goto_1
    if-nez v4, :cond_2

    .line 145
    .line 146
    invoke-virtual {v5, v13}, Landroid/view/View;->setAlpha(F)V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_2
    invoke-virtual {v5, v12}, Landroid/view/View;->setAlpha(F)V

    .line 151
    .line 152
    .line 153
    :goto_2
    iget v4, v8, Lyyds/ᛲᛳᛱᛲ;->ᛴᛵᛷᛳ:I

    .line 154
    .line 155
    if-ne v4, v11, :cond_4

    .line 156
    .line 157
    iget-object v4, v9, Lyyds/ᲇᲀᛷᛷ;->ᛵᛸᛸᛷ:Landroid/widget/ImageView;

    .line 158
    .line 159
    if-eqz v4, :cond_7

    .line 160
    .line 161
    iget v6, v8, Lyyds/ᛲᛳᛱᛲ;->ᛵᲈᲇᛵ:I

    .line 162
    .line 163
    if-ne v6, v1, :cond_3

    .line 164
    .line 165
    const/4 v6, 0x0

    .line 166
    invoke-virtual {v4, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v8}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 173
    .line 174
    .line 175
    iget-object v4, v9, Lyyds/ᲇᲀᛷᛷ;->ᛵᛸᛸᛷ:Landroid/widget/ImageView;

    .line 176
    .line 177
    const v10, 0x660d0006

    .line 178
    .line 179
    .line 180
    invoke-virtual {v4, v10}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 181
    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_3
    const/4 v6, 0x0

    .line 185
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v8}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 189
    .line 190
    .line 191
    iget-object v4, v9, Lyyds/ᲇᲀᛷᛷ;->ᛵᛸᛸᛷ:Landroid/widget/ImageView;

    .line 192
    .line 193
    invoke-virtual {v4, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 194
    .line 195
    .line 196
    iget-object v4, v9, Lyyds/ᲇᲀᛷᛷ;->ᛵᛸᛸᛷ:Landroid/widget/ImageView;

    .line 197
    .line 198
    const v6, 0x660d0005

    .line 199
    .line 200
    .line 201
    invoke-virtual {v4, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 202
    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_4
    const/4 v6, 0x3

    .line 206
    if-ne v4, v6, :cond_6

    .line 207
    .line 208
    iget-object v4, v9, Lyyds/ᲇᲀᛷᛷ;->ᛵᛸᛸᛷ:Landroid/widget/ImageView;

    .line 209
    .line 210
    if-eqz v4, :cond_7

    .line 211
    .line 212
    iget-object v4, v8, Lyyds/ᛲᛳᛱᛲ;->ᛶᛵᛸᛲ:Ljava/util/ArrayList;

    .line 213
    .line 214
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    if-eqz v4, :cond_5

    .line 223
    .line 224
    iget-object v4, v9, Lyyds/ᲇᲀᛷᛷ;->ᛵᛸᛸᛷ:Landroid/widget/ImageView;

    .line 225
    .line 226
    const/4 v6, 0x0

    .line 227
    invoke-virtual {v4, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v8}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 234
    .line 235
    .line 236
    iget-object v4, v9, Lyyds/ᲇᲀᛷᛷ;->ᛵᛸᛸᛷ:Landroid/widget/ImageView;

    .line 237
    .line 238
    const v10, 0x660d0003

    .line 239
    .line 240
    .line 241
    invoke-virtual {v4, v10}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 242
    .line 243
    .line 244
    goto :goto_3

    .line 245
    :cond_5
    const/4 v6, 0x0

    .line 246
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v8}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 250
    .line 251
    .line 252
    iget-object v4, v9, Lyyds/ᲇᲀᛷᛷ;->ᛵᛸᛸᛷ:Landroid/widget/ImageView;

    .line 253
    .line 254
    invoke-virtual {v4, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 255
    .line 256
    .line 257
    iget-object v4, v9, Lyyds/ᲇᲀᛷᛷ;->ᛵᛸᛸᛷ:Landroid/widget/ImageView;

    .line 258
    .line 259
    const v6, 0x660d0004

    .line 260
    .line 261
    .line 262
    invoke-virtual {v4, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 263
    .line 264
    .line 265
    goto :goto_3

    .line 266
    :cond_6
    iget-object v4, v9, Lyyds/ᲇᲀᛷᛷ;->ᛵᛸᛸᛷ:Landroid/widget/ImageView;

    .line 267
    .line 268
    const/16 v6, 0x8

    .line 269
    .line 270
    invoke-virtual {v4, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 271
    .line 272
    .line 273
    :cond_7
    :goto_3
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v8}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 280
    .line 281
    .line 282
    iget-object v4, v0, Lyyds/ᛶᛷᛲᛴ;->ᲇᲈᛵᛷ:Ljava/util/List;

    .line 283
    .line 284
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    check-cast v1, Ljava/lang/CharSequence;

    .line 289
    .line 290
    invoke-virtual {v8}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 291
    .line 292
    .line 293
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v8}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 300
    .line 301
    .line 302
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v8}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 306
    .line 307
    .line 308
    move-result v4

    .line 309
    if-eqz v4, :cond_8

    .line 310
    .line 311
    const v4, 0x66060036

    .line 312
    .line 313
    .line 314
    goto :goto_4

    .line 315
    :cond_8
    const v4, 0x66060132

    .line 316
    .line 317
    .line 318
    :goto_4
    if-eqz v1, :cond_c

    .line 319
    .line 320
    iget-object v6, v0, Lyyds/ᛶᛷᛲᛴ;->ᲇᲇᲇᛱ:Lyyds/ᲇᲇᛱᲇ;

    .line 321
    .line 322
    if-nez v6, :cond_a

    .line 323
    .line 324
    new-instance v6, Lyyds/ᲇᲇᛱᲇ;

    .line 325
    .line 326
    invoke-direct {v6}, Lyyds/ᲇᲇᛱᲇ;-><init>()V

    .line 327
    .line 328
    .line 329
    iget-object v10, v9, Lyyds/ᲇᲀᛷᛷ;->ᲀᛲᛳᲀ:Landroid/widget/TextView;

    .line 330
    .line 331
    invoke-virtual {v10}, Landroid/widget/TextView;->getEllipsize()Landroid/text/TextUtils$TruncateAt;

    .line 332
    .line 333
    .line 334
    move-result-object v10

    .line 335
    sget-object v11, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 336
    .line 337
    if-ne v10, v11, :cond_9

    .line 338
    .line 339
    move/from16 v10, v16

    .line 340
    .line 341
    goto :goto_5

    .line 342
    :cond_9
    const/4 v10, 0x0

    .line 343
    :goto_5
    iput-boolean v10, v6, Lyyds/ᲇᲇᛱᲇ;->ᲇᲇᲇᛱ:Z

    .line 344
    .line 345
    iget-object v10, v9, Lyyds/ᲇᲀᛷᛷ;->ᲀᛲᛳᲀ:Landroid/widget/TextView;

    .line 346
    .line 347
    invoke-virtual {v10}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    .line 348
    .line 349
    .line 350
    move-result-object v10

    .line 351
    invoke-virtual {v10}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 352
    .line 353
    .line 354
    move-result v10

    .line 355
    iput v10, v6, Lyyds/ᲇᲇᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 356
    .line 357
    iget-object v10, v9, Lyyds/ᲇᲀᛷᛷ;->ᲀᛲᛳᲀ:Landroid/widget/TextView;

    .line 358
    .line 359
    invoke-virtual {v10}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 360
    .line 361
    .line 362
    move-result-object v10

    .line 363
    invoke-virtual {v10}, Landroid/graphics/Paint;->isFakeBoldText()Z

    .line 364
    .line 365
    .line 366
    move-result v10

    .line 367
    iput-boolean v10, v6, Lyyds/ᲇᲇᛱᲇ;->ᲇᲈᛵᛷ:Z

    .line 368
    .line 369
    iget-object v10, v9, Lyyds/ᲇᲀᛷᛷ;->ᲀᛲᛳᲀ:Landroid/widget/TextView;

    .line 370
    .line 371
    invoke-virtual {v10}, Landroid/widget/TextView;->getTextSize()F

    .line 372
    .line 373
    .line 374
    move-result v10

    .line 375
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 376
    .line 377
    .line 378
    move-result-object v11

    .line 379
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 380
    .line 381
    .line 382
    move-result-object v11

    .line 383
    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    .line 384
    .line 385
    div-float/2addr v10, v11

    .line 386
    add-float v10, v10, p3

    .line 387
    .line 388
    float-to-int v10, v10

    .line 389
    iput v10, v6, Lyyds/ᲇᲇᛱᲇ;->ᛲᲈᲁ:I

    .line 390
    .line 391
    iget-object v10, v9, Lyyds/ᲇᲀᛷᛷ;->ᲀᛲᛳᲀ:Landroid/widget/TextView;

    .line 392
    .line 393
    invoke-virtual {v10}, Landroid/widget/TextView;->getGravity()I

    .line 394
    .line 395
    .line 396
    move-result v10

    .line 397
    iput v10, v6, Lyyds/ᲇᲇᛱᲇ;->ᛵᛸᛸᛷ:I

    .line 398
    .line 399
    iget-object v10, v9, Lyyds/ᲇᲀᛷᛷ;->ᲀᛲᛳᲀ:Landroid/widget/TextView;

    .line 400
    .line 401
    invoke-virtual {v10}, Landroid/widget/TextView;->getMaxLines()I

    .line 402
    .line 403
    .line 404
    move-result v10

    .line 405
    iput v10, v6, Lyyds/ᲇᲇᛱᲇ;->ᛲᛴᛳᛲ:I

    .line 406
    .line 407
    iput-object v6, v0, Lyyds/ᛶᛷᛲᛴ;->ᲇᲇᲇᛱ:Lyyds/ᲇᲇᛱᲇ;

    .line 408
    .line 409
    :cond_a
    iget-object v0, v9, Lyyds/ᲇᲀᛷᛷ;->ᲀᛲᛳᲀ:Landroid/widget/TextView;

    .line 410
    .line 411
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 412
    .line 413
    .line 414
    iget-object v0, v9, Lyyds/ᲇᲀᛷᛷ;->ᲀᛲᛳᲀ:Landroid/widget/TextView;

    .line 415
    .line 416
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getColor(I)I

    .line 421
    .line 422
    .line 423
    move-result v1

    .line 424
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 425
    .line 426
    .line 427
    sget-object v0, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 428
    .line 429
    iget-object v0, v9, Lyyds/ᲇᲀᛷᛷ;->ᛵᛸᛸᛷ:Landroid/widget/ImageView;

    .line 430
    .line 431
    if-eqz v0, :cond_b

    .line 432
    .line 433
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v8}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 440
    .line 441
    .line 442
    iget-object v0, v9, Lyyds/ᲇᲀᛷᛷ;->ᛵᛸᛸᛷ:Landroid/widget/ImageView;

    .line 443
    .line 444
    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 445
    .line 446
    .line 447
    :cond_b
    iget-object v0, v9, Lyyds/ᲇᲀᛷᛷ;->ᛲᲈᲁ:Landroid/widget/ImageView;

    .line 448
    .line 449
    const/16 v6, 0x8

    .line 450
    .line 451
    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 452
    .line 453
    .line 454
    iget-object v0, v9, Lyyds/ᲇᲀᛷᛷ;->ᲇᲈᛵᛷ:Landroid/widget/Space;

    .line 455
    .line 456
    if-eqz v0, :cond_c

    .line 457
    .line 458
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 459
    .line 460
    .line 461
    :cond_c
    return-object v5

    .line 462
    :pswitch_0
    iget-object v2, v0, Lyyds/ᛶᛷᛲᛴ;->ᛲᛴᛳᛲ:Landroid/content/Context;

    .line 463
    .line 464
    iget-object v6, v0, Lyyds/ᛶᛷᛲᛴ;->ᛶᛷᛲᲁ:Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 465
    .line 466
    check-cast v6, Lyyds/ᛵᛱᲀᛱ;

    .line 467
    .line 468
    if-nez p2, :cond_d

    .line 469
    .line 470
    new-instance v8, Lyyds/ᛴᛴᛳᛱ;

    .line 471
    .line 472
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 473
    .line 474
    .line 475
    invoke-static {v2}, Lyyds/ᛴᛶᲀᛲ;->ᛲᛳᛶᲁ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 476
    .line 477
    .line 478
    move-result-object v9

    .line 479
    iget-object v10, v6, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

    .line 480
    .line 481
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 482
    .line 483
    .line 484
    iget-object v10, v6, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

    .line 485
    .line 486
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v6}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 490
    .line 491
    .line 492
    invoke-virtual {v0}, Lyyds/ᛶᛷᛲᛴ;->getCount()I

    .line 493
    .line 494
    .line 495
    invoke-virtual {v9, v5, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 496
    .line 497
    .line 498
    move-result-object v5

    .line 499
    invoke-virtual {v5, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 500
    .line 501
    .line 502
    move-result-object v4

    .line 503
    check-cast v4, Landroid/widget/ImageView;

    .line 504
    .line 505
    iput-object v4, v8, Lyyds/ᛴᛴᛳᛱ;->ᛲᲈᲁ:Landroid/widget/ImageView;

    .line 506
    .line 507
    invoke-virtual {v5, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 508
    .line 509
    .line 510
    move-result-object v3

    .line 511
    check-cast v3, Landroid/widget/ImageView;

    .line 512
    .line 513
    iput-object v3, v8, Lyyds/ᛴᛴᛳᛱ;->ᛵᛸᛸᛷ:Landroid/widget/ImageView;

    .line 514
    .line 515
    invoke-virtual {v5, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 516
    .line 517
    .line 518
    move-result-object v3

    .line 519
    check-cast v3, Landroid/widget/TextView;

    .line 520
    .line 521
    iput-object v3, v8, Lyyds/ᛴᛴᛳᛱ;->ᲀᛲᛳᲀ:Landroid/widget/TextView;

    .line 522
    .line 523
    invoke-virtual {v5, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 524
    .line 525
    .line 526
    move-result-object v3

    .line 527
    check-cast v3, Landroid/widget/Space;

    .line 528
    .line 529
    iput-object v3, v8, Lyyds/ᛴᛴᛳᛱ;->ᲇᲈᛵᛷ:Landroid/widget/Space;

    .line 530
    .line 531
    invoke-virtual {v5, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 532
    .line 533
    .line 534
    goto :goto_6

    .line 535
    :cond_d
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v3

    .line 539
    move-object v8, v3

    .line 540
    check-cast v8, Lyyds/ᛴᛴᛳᛱ;

    .line 541
    .line 542
    move-object/from16 v5, p2

    .line 543
    .line 544
    :goto_6
    iget-object v3, v6, Lyyds/ᛵᛱᲀᛱ;->ᲀᛳᛷᛷ:Ljava/util/ArrayList;

    .line 545
    .line 546
    iget-object v4, v6, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

    .line 547
    .line 548
    if-eqz v3, :cond_e

    .line 549
    .line 550
    if-ltz v1, :cond_e

    .line 551
    .line 552
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 553
    .line 554
    .line 555
    move-result v3

    .line 556
    if-ge v1, v3, :cond_e

    .line 557
    .line 558
    iget-object v3, v6, Lyyds/ᛵᛱᲀᛱ;->ᲀᛳᛷᛷ:Ljava/util/ArrayList;

    .line 559
    .line 560
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v3

    .line 564
    check-cast v3, Ljava/lang/Integer;

    .line 565
    .line 566
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 567
    .line 568
    .line 569
    move-result v3

    .line 570
    goto :goto_7

    .line 571
    :cond_e
    move v3, v1

    .line 572
    :goto_7
    iget-object v9, v6, Lyyds/ᛵᛱᲀᛱ;->ᛳᛴᲇᛶ:Ljava/util/HashMap;

    .line 573
    .line 574
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 575
    .line 576
    .line 577
    move-result-object v10

    .line 578
    invoke-virtual {v9, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v9

    .line 582
    check-cast v9, Ljava/lang/Boolean;

    .line 583
    .line 584
    if-nez v9, :cond_f

    .line 585
    .line 586
    move/from16 v9, v16

    .line 587
    .line 588
    goto :goto_8

    .line 589
    :cond_f
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 590
    .line 591
    .line 592
    move-result v9

    .line 593
    :goto_8
    if-nez v9, :cond_10

    .line 594
    .line 595
    invoke-virtual {v5, v13}, Landroid/view/View;->setAlpha(F)V

    .line 596
    .line 597
    .line 598
    goto :goto_9

    .line 599
    :cond_10
    invoke-virtual {v5, v12}, Landroid/view/View;->setAlpha(F)V

    .line 600
    .line 601
    .line 602
    :goto_9
    iget v9, v6, Lyyds/ᛵᛱᲀᛱ;->ᛸᲇᛱᲇ:I

    .line 603
    .line 604
    if-ne v9, v11, :cond_13

    .line 605
    .line 606
    iget-object v9, v8, Lyyds/ᛴᛴᛳᛱ;->ᛵᛸᛸᛷ:Landroid/widget/ImageView;

    .line 607
    .line 608
    if-eqz v9, :cond_12

    .line 609
    .line 610
    iget v10, v6, Lyyds/ᛵᛱᲀᛱ;->ᛵᲈᲇᛵ:I

    .line 611
    .line 612
    if-ne v10, v3, :cond_11

    .line 613
    .line 614
    const/4 v3, 0x0

    .line 615
    invoke-virtual {v9, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v6}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 622
    .line 623
    .line 624
    iget-object v9, v8, Lyyds/ᛴᛴᛳᛱ;->ᛵᛸᛸᛷ:Landroid/widget/ImageView;

    .line 625
    .line 626
    const v10, 0x660d0006

    .line 627
    .line 628
    .line 629
    invoke-virtual {v9, v10}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 630
    .line 631
    .line 632
    move v9, v3

    .line 633
    goto :goto_a

    .line 634
    :cond_11
    const/4 v3, 0x0

    .line 635
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 636
    .line 637
    .line 638
    invoke-virtual {v6}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 639
    .line 640
    .line 641
    iget-object v9, v8, Lyyds/ᛴᛴᛳᛱ;->ᛵᛸᛸᛷ:Landroid/widget/ImageView;

    .line 642
    .line 643
    invoke-virtual {v9, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 644
    .line 645
    .line 646
    iget-object v3, v8, Lyyds/ᛴᛴᛳᛱ;->ᛵᛸᛸᛷ:Landroid/widget/ImageView;

    .line 647
    .line 648
    const v9, 0x660d0005

    .line 649
    .line 650
    .line 651
    invoke-virtual {v3, v9}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 652
    .line 653
    .line 654
    :cond_12
    const/4 v9, 0x0

    .line 655
    goto :goto_a

    .line 656
    :cond_13
    const/4 v10, 0x3

    .line 657
    if-ne v9, v10, :cond_15

    .line 658
    .line 659
    iget-object v9, v8, Lyyds/ᛴᛴᛳᛱ;->ᛵᛸᛸᛷ:Landroid/widget/ImageView;

    .line 660
    .line 661
    if-eqz v9, :cond_12

    .line 662
    .line 663
    iget-object v9, v6, Lyyds/ᛵᛱᲀᛱ;->ᛶᛵᛸᛲ:Ljava/util/ArrayList;

    .line 664
    .line 665
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 666
    .line 667
    .line 668
    move-result-object v3

    .line 669
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 670
    .line 671
    .line 672
    move-result v3

    .line 673
    if-eqz v3, :cond_14

    .line 674
    .line 675
    iget-object v3, v8, Lyyds/ᛴᛴᛳᛱ;->ᛵᛸᛸᛷ:Landroid/widget/ImageView;

    .line 676
    .line 677
    const/4 v9, 0x0

    .line 678
    invoke-virtual {v3, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 679
    .line 680
    .line 681
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 682
    .line 683
    .line 684
    invoke-virtual {v6}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 685
    .line 686
    .line 687
    iget-object v3, v8, Lyyds/ᛴᛴᛳᛱ;->ᛵᛸᛸᛷ:Landroid/widget/ImageView;

    .line 688
    .line 689
    const v10, 0x660d0003

    .line 690
    .line 691
    .line 692
    invoke-virtual {v3, v10}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 693
    .line 694
    .line 695
    goto :goto_a

    .line 696
    :cond_14
    const/4 v9, 0x0

    .line 697
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 698
    .line 699
    .line 700
    invoke-virtual {v6}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 701
    .line 702
    .line 703
    iget-object v3, v8, Lyyds/ᛴᛴᛳᛱ;->ᛵᛸᛸᛷ:Landroid/widget/ImageView;

    .line 704
    .line 705
    invoke-virtual {v3, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 706
    .line 707
    .line 708
    iget-object v3, v8, Lyyds/ᛴᛴᛳᛱ;->ᛵᛸᛸᛷ:Landroid/widget/ImageView;

    .line 709
    .line 710
    const v10, 0x660d0004

    .line 711
    .line 712
    .line 713
    invoke-virtual {v3, v10}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 714
    .line 715
    .line 716
    goto :goto_a

    .line 717
    :cond_15
    const/4 v9, 0x0

    .line 718
    iget-object v3, v8, Lyyds/ᛴᛴᛳᛱ;->ᛵᛸᛸᛷ:Landroid/widget/ImageView;

    .line 719
    .line 720
    const/16 v10, 0x8

    .line 721
    .line 722
    invoke-virtual {v3, v10}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 723
    .line 724
    .line 725
    :goto_a
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 726
    .line 727
    .line 728
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 729
    .line 730
    .line 731
    invoke-virtual {v6}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 732
    .line 733
    .line 734
    iget-object v3, v0, Lyyds/ᛶᛷᛲᛴ;->ᲇᲈᛵᛷ:Ljava/util/List;

    .line 735
    .line 736
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 737
    .line 738
    .line 739
    move-result-object v1

    .line 740
    check-cast v1, Ljava/lang/CharSequence;

    .line 741
    .line 742
    invoke-virtual {v6}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 743
    .line 744
    .line 745
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 746
    .line 747
    .line 748
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 749
    .line 750
    .line 751
    invoke-virtual {v6}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 752
    .line 753
    .line 754
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 755
    .line 756
    .line 757
    invoke-virtual {v6}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 758
    .line 759
    .line 760
    move-result v3

    .line 761
    if-eqz v3, :cond_16

    .line 762
    .line 763
    const v3, 0x66060036

    .line 764
    .line 765
    .line 766
    goto :goto_b

    .line 767
    :cond_16
    const v3, 0x66060132

    .line 768
    .line 769
    .line 770
    :goto_b
    if-eqz v1, :cond_1a

    .line 771
    .line 772
    iget-object v10, v0, Lyyds/ᛶᛷᛲᛴ;->ᲇᲇᲇᛱ:Lyyds/ᲇᲇᛱᲇ;

    .line 773
    .line 774
    if-nez v10, :cond_18

    .line 775
    .line 776
    new-instance v10, Lyyds/ᲇᲇᛱᲇ;

    .line 777
    .line 778
    invoke-direct {v10}, Lyyds/ᲇᲇᛱᲇ;-><init>()V

    .line 779
    .line 780
    .line 781
    iget-object v11, v8, Lyyds/ᛴᛴᛳᛱ;->ᲀᛲᛳᲀ:Landroid/widget/TextView;

    .line 782
    .line 783
    invoke-virtual {v11}, Landroid/widget/TextView;->getEllipsize()Landroid/text/TextUtils$TruncateAt;

    .line 784
    .line 785
    .line 786
    move-result-object v11

    .line 787
    sget-object v12, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 788
    .line 789
    if-ne v11, v12, :cond_17

    .line 790
    .line 791
    move/from16 v9, v16

    .line 792
    .line 793
    :cond_17
    iput-boolean v9, v10, Lyyds/ᲇᲇᛱᲇ;->ᲇᲇᲇᛱ:Z

    .line 794
    .line 795
    iget-object v9, v8, Lyyds/ᛴᛴᛳᛱ;->ᲀᛲᛳᲀ:Landroid/widget/TextView;

    .line 796
    .line 797
    invoke-virtual {v9}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    .line 798
    .line 799
    .line 800
    move-result-object v9

    .line 801
    invoke-virtual {v9}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 802
    .line 803
    .line 804
    move-result v9

    .line 805
    iput v9, v10, Lyyds/ᲇᲇᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 806
    .line 807
    iget-object v9, v8, Lyyds/ᛴᛴᛳᛱ;->ᲀᛲᛳᲀ:Landroid/widget/TextView;

    .line 808
    .line 809
    invoke-virtual {v9}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 810
    .line 811
    .line 812
    move-result-object v9

    .line 813
    invoke-virtual {v9}, Landroid/graphics/Paint;->isFakeBoldText()Z

    .line 814
    .line 815
    .line 816
    move-result v9

    .line 817
    iput-boolean v9, v10, Lyyds/ᲇᲇᛱᲇ;->ᲇᲈᛵᛷ:Z

    .line 818
    .line 819
    iget-object v9, v8, Lyyds/ᛴᛴᛳᛱ;->ᲀᛲᛳᲀ:Landroid/widget/TextView;

    .line 820
    .line 821
    invoke-virtual {v9}, Landroid/widget/TextView;->getTextSize()F

    .line 822
    .line 823
    .line 824
    move-result v9

    .line 825
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 826
    .line 827
    .line 828
    move-result-object v11

    .line 829
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 830
    .line 831
    .line 832
    move-result-object v11

    .line 833
    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    .line 834
    .line 835
    div-float/2addr v9, v11

    .line 836
    add-float v9, v9, p3

    .line 837
    .line 838
    float-to-int v9, v9

    .line 839
    iput v9, v10, Lyyds/ᲇᲇᛱᲇ;->ᛲᲈᲁ:I

    .line 840
    .line 841
    iget-object v9, v8, Lyyds/ᛴᛴᛳᛱ;->ᲀᛲᛳᲀ:Landroid/widget/TextView;

    .line 842
    .line 843
    invoke-virtual {v9}, Landroid/widget/TextView;->getGravity()I

    .line 844
    .line 845
    .line 846
    move-result v9

    .line 847
    iput v9, v10, Lyyds/ᲇᲇᛱᲇ;->ᛵᛸᛸᛷ:I

    .line 848
    .line 849
    iget-object v9, v8, Lyyds/ᛴᛴᛳᛱ;->ᲀᛲᛳᲀ:Landroid/widget/TextView;

    .line 850
    .line 851
    invoke-virtual {v9}, Landroid/widget/TextView;->getMaxLines()I

    .line 852
    .line 853
    .line 854
    move-result v9

    .line 855
    iput v9, v10, Lyyds/ᲇᲇᛱᲇ;->ᛲᛴᛳᛲ:I

    .line 856
    .line 857
    iput-object v10, v0, Lyyds/ᛶᛷᛲᛴ;->ᲇᲇᲇᛱ:Lyyds/ᲇᲇᛱᲇ;

    .line 858
    .line 859
    :cond_18
    iget-object v0, v8, Lyyds/ᛴᛴᛳᛱ;->ᲀᛲᛳᲀ:Landroid/widget/TextView;

    .line 860
    .line 861
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 862
    .line 863
    .line 864
    iget-object v0, v8, Lyyds/ᛴᛴᛳᛱ;->ᲀᛲᛳᲀ:Landroid/widget/TextView;

    .line 865
    .line 866
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 867
    .line 868
    .line 869
    move-result-object v1

    .line 870
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    .line 871
    .line 872
    .line 873
    move-result v1

    .line 874
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 875
    .line 876
    .line 877
    sget-object v0, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 878
    .line 879
    iget-object v0, v8, Lyyds/ᛴᛴᛳᛱ;->ᛵᛸᛸᛷ:Landroid/widget/ImageView;

    .line 880
    .line 881
    if-eqz v0, :cond_19

    .line 882
    .line 883
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 884
    .line 885
    .line 886
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 887
    .line 888
    .line 889
    invoke-virtual {v6}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 890
    .line 891
    .line 892
    iget-object v0, v8, Lyyds/ᛴᛴᛳᛱ;->ᛵᛸᛸᛷ:Landroid/widget/ImageView;

    .line 893
    .line 894
    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 895
    .line 896
    .line 897
    :cond_19
    iget-object v0, v8, Lyyds/ᛴᛴᛳᛱ;->ᛲᲈᲁ:Landroid/widget/ImageView;

    .line 898
    .line 899
    const/16 v6, 0x8

    .line 900
    .line 901
    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 902
    .line 903
    .line 904
    iget-object v0, v8, Lyyds/ᛴᛴᛳᛱ;->ᲇᲈᛵᛷ:Landroid/widget/Space;

    .line 905
    .line 906
    if-eqz v0, :cond_1a

    .line 907
    .line 908
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 909
    .line 910
    .line 911
    :cond_1a
    return-object v5

    .line 912
    nop

    .line 913
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
