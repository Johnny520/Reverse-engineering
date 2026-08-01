.class public final Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世兰哲苏;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;I)V
    .locals 0

    .line 1
    iput p2, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Landroid/view/View;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 6
    .line 7
    const/16 v3, 0x77c

    .line 8
    .line 9
    const/16 v4, 0x77b

    .line 10
    .line 11
    const/16 v5, 0x8a0

    .line 12
    .line 13
    const-wide/16 v6, 0x3e8

    .line 14
    .line 15
    const-string v8, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5"

    .line 16
    .line 17
    const/4 v9, -0x2

    .line 18
    const/16 v10, 0x779

    .line 19
    .line 20
    const/16 v11, 0x778

    .line 21
    .line 22
    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    sget-object v13, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 25
    .line 26
    const/16 v14, 0x775

    .line 27
    .line 28
    const/16 v15, 0x774

    .line 29
    .line 30
    iget-object v0, v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;

    .line 31
    .line 32
    packed-switch v2, :pswitch_data_0

    .line 33
    .line 34
    .line 35
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世兰楪苏哲;

    .line 40
    .line 41
    iget v0, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 42
    .line 43
    invoke-static {v15}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    invoke-static {v14}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-object/from16 v3, p2

    .line 50
    .line 51
    check-cast v3, Landroid/view/ViewGroup;

    .line 52
    .line 53
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    invoke-static {v3}, Llin/xposed/hook/util/qq/QQAIOTool;->hasContentMessage(Landroid/view/ViewGroup;)Z

    .line 58
    .line 59
    .line 60
    move-result v14

    .line 61
    if-nez v14, :cond_0

    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :cond_0
    invoke-static {v3}, Llin/xposed/hook/util/qq/QQAIOTool;->getContentId(Landroid/view/ViewGroup;)I

    .line 66
    .line 67
    .line 68
    move-result v14

    .line 69
    invoke-static {v8}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    invoke-static {v13, v8, v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Ljava/lang/Long;

    .line 78
    .line 79
    new-instance v8, Ljava/text/SimpleDateFormat;

    .line 80
    .line 81
    const/16 v13, 0x345

    .line 82
    .line 83
    invoke-static {v13}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v13

    .line 87
    sget-object v15, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 88
    .line 89
    invoke-direct {v8, v13, v15}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 90
    .line 91
    .line 92
    new-instance v13, Ljava/util/Date;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 95
    .line 96
    .line 97
    move-result-wide v15

    .line 98
    mul-long/2addr v6, v15

    .line 99
    invoke-direct {v13, v6, v7}, Ljava/util/Date;-><init>(J)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v8, v13}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    check-cast v6, Landroid/widget/TextView;

    .line 111
    .line 112
    if-eqz v6, :cond_1

    .line 113
    .line 114
    invoke-virtual {v3, v6}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 115
    .line 116
    .line 117
    :cond_1
    new-instance v6, Landroid/widget/TextView;

    .line 118
    .line 119
    invoke-direct {v6, v9}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 120
    .line 121
    .line 122
    const/high16 v7, 0x41100000    # 9.0f

    .line 123
    .line 124
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v6, v0}, Landroid/view/View;->setId(I)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 131
    .line 132
    .line 133
    invoke-static {v11}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-static {v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    filled-new-array {v12, v12}, [Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    filled-new-array {v2, v2}, [Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-static {v2, v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子世兰楪哲苏([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-static {v10}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    check-cast v0, Landroid/view/ViewGroup$LayoutParams;

    .line 160
    .line 161
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-static {v0, v1, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-static {v0, v1, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    const/16 v1, 0x8bc

    .line 184
    .line 185
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    const/high16 v2, 0x40400000    # 3.0f

    .line 190
    .line 191
    invoke-static {v9, v2}, L飘花落叶言世兰苏哲楪子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Landroid/content/Context;F)I

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-static {v0, v1, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v3, v6, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 203
    .line 204
    .line 205
    :goto_0
    return-void

    .line 206
    :pswitch_0
    check-cast v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;

    .line 207
    .line 208
    iget v2, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲兰世苏:I

    .line 209
    .line 210
    invoke-static {v15}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    invoke-static {v14}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    const/16 v4, 0x1e3

    .line 217
    .line 218
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    invoke-static {v13, v4, v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    check-cast v4, Ljava/lang/Long;

    .line 227
    .line 228
    move-object/from16 v6, p2

    .line 229
    .line 230
    check-cast v6, Landroid/view/ViewGroup;

    .line 231
    .line 232
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    invoke-static {v6}, Llin/xposed/hook/util/qq/QQAIOTool;->getContentId(Landroid/view/ViewGroup;)I

    .line 237
    .line 238
    .line 239
    move-result v8

    .line 240
    invoke-static {v6}, Llin/xposed/hook/util/qq/QQAIOTool;->hasContentMessage(Landroid/view/ViewGroup;)Z

    .line 241
    .line 242
    .line 243
    move-result v9

    .line 244
    if-eqz v9, :cond_7

    .line 245
    .line 246
    invoke-virtual {v6, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 247
    .line 248
    .line 249
    move-result-object v9

    .line 250
    if-nez v9, :cond_2

    .line 251
    .line 252
    goto/16 :goto_4

    .line 253
    .line 254
    :cond_2
    invoke-virtual {v6, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 255
    .line 256
    .line 257
    move-result-object v9

    .line 258
    check-cast v9, Landroid/widget/ImageView;

    .line 259
    .line 260
    if-eqz v9, :cond_3

    .line 261
    .line 262
    invoke-virtual {v6, v9}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 263
    .line 264
    .line 265
    :cond_3
    new-instance v9, Landroid/widget/ImageView;

    .line 266
    .line 267
    invoke-direct {v9, v7}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v9, v2}, Landroid/view/View;->setId(I)V

    .line 271
    .line 272
    .line 273
    iget-object v2, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰苏世哲:Landroid/graphics/drawable/BitmapDrawable;

    .line 274
    .line 275
    invoke-virtual {v9, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 276
    .line 277
    .line 278
    new-instance v2, Landroidx/appcompat/app/飘花落叶言子世哲苏兰楪;

    .line 279
    .line 280
    invoke-static {}, Llin/xposed/hook/util/qq/QQSessionUtils;->getCurrentContact()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v13

    .line 284
    const/16 v14, 0x89f

    .line 285
    .line 286
    invoke-static {v14}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    invoke-direct {v2, v0, v1, v13}, Landroidx/appcompat/app/飘花落叶言子世哲苏兰楪;-><init>(Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v9, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    iget v1, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世苏哲:I

    .line 302
    .line 303
    if-eqz v1, :cond_4

    .line 304
    .line 305
    goto :goto_1

    .line 306
    :cond_4
    iget-object v1, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 307
    .line 308
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    const-string v2, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c"

    .line 312
    .line 313
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    const/16 v13, 0x1a

    .line 318
    .line 319
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 320
    .line 321
    .line 322
    move-result-object v13

    .line 323
    invoke-virtual {v1, v13, v2}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    const/16 v2, 0x74a

    .line 328
    .line 329
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    check-cast v1, Ljava/lang/Integer;

    .line 336
    .line 337
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 338
    .line 339
    .line 340
    move-result v1

    .line 341
    int-to-float v1, v1

    .line 342
    invoke-static {v7, v1}, L飘花落叶言世兰苏哲楪子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Landroid/content/Context;F)I

    .line 343
    .line 344
    .line 345
    move-result v1

    .line 346
    iput v1, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世苏哲:I

    .line 347
    .line 348
    :goto_1
    invoke-static {v11}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    invoke-static {v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    filled-new-array {v12, v12}, [Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    move-result-object v7

    .line 360
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 361
    .line 362
    .line 363
    move-result-object v11

    .line 364
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    filled-new-array {v11, v1}, [Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    invoke-static {v1, v7, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子世兰楪哲苏([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    invoke-static {v10}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    check-cast v1, Landroid/view/ViewGroup$LayoutParams;

    .line 383
    .line 384
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    invoke-static {v1, v2, v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 400
    .line 401
    .line 402
    move-result-object v3

    .line 403
    invoke-static {v1, v2, v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 404
    .line 405
    .line 406
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    iget-object v3, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 411
    .line 412
    if-eqz v3, :cond_5

    .line 413
    .line 414
    goto :goto_2

    .line 415
    :cond_5
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    iput-object v3, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 420
    .line 421
    :goto_2
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v0

    .line 425
    if-eqz v0, :cond_6

    .line 426
    .line 427
    const/16 v0, 0x8a1

    .line 428
    .line 429
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    invoke-static {v1, v0, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    goto :goto_3

    .line 441
    :cond_6
    const/16 v0, 0x8a2

    .line 442
    .line 443
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    invoke-static {v1, v0, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 452
    .line 453
    .line 454
    :goto_3
    invoke-virtual {v6, v9, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 455
    .line 456
    .line 457
    :cond_7
    :goto_4
    return-void

    .line 458
    :pswitch_1
    check-cast v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏哲兰;

    .line 459
    .line 460
    iget-object v2, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪兰世哲苏:Ljava/util/LinkedHashMap;

    .line 461
    .line 462
    invoke-static {v15}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    invoke-static {v14}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-object/from16 v3, p2

    .line 469
    .line 470
    check-cast v3, Landroid/view/ViewGroup;

    .line 471
    .line 472
    invoke-static {v3}, Llin/xposed/hook/util/qq/QQAIOTool;->hasContentMessage(Landroid/view/ViewGroup;)Z

    .line 473
    .line 474
    .line 475
    move-result v4

    .line 476
    if-nez v4, :cond_8

    .line 477
    .line 478
    goto/16 :goto_5

    .line 479
    .line 480
    :cond_8
    const-string v4, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c"

    .line 481
    .line 482
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v4

    .line 486
    const-class v5, Ljava/lang/String;

    .line 487
    .line 488
    invoke-static {v5, v4, v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v4

    .line 492
    check-cast v4, Ljava/lang/String;

    .line 493
    .line 494
    const-string v5, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c"

    .line 495
    .line 496
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v5

    .line 500
    invoke-static {v13, v5, v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v5

    .line 504
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 505
    .line 506
    .line 507
    check-cast v5, Ljava/lang/Number;

    .line 508
    .line 509
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 510
    .line 511
    .line 512
    move-result-wide v9

    .line 513
    iget v5, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲兰世苏:I

    .line 514
    .line 515
    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 516
    .line 517
    .line 518
    move-result-object v5

    .line 519
    if-eqz v5, :cond_9

    .line 520
    .line 521
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 522
    .line 523
    .line 524
    :cond_9
    invoke-static {v8}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v5

    .line 528
    invoke-static {v13, v5, v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v5

    .line 532
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    check-cast v5, Ljava/lang/Number;

    .line 536
    .line 537
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 538
    .line 539
    .line 540
    move-result-wide v13

    .line 541
    mul-long/2addr v13, v6

    .line 542
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 543
    .line 544
    .line 545
    move-result-wide v5

    .line 546
    sub-long/2addr v5, v13

    .line 547
    const-wide/16 v7, 0x7d0

    .line 548
    .line 549
    cmp-long v5, v5, v7

    .line 550
    .line 551
    if-gez v5, :cond_a

    .line 552
    .line 553
    goto/16 :goto_5

    .line 554
    .line 555
    :cond_a
    const/16 v5, 0x7d

    .line 556
    .line 557
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v5

    .line 561
    invoke-static {v12, v5, v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    const/16 v5, 0x634

    .line 566
    .line 567
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 571
    .line 572
    .line 573
    check-cast v1, Ljava/lang/Number;

    .line 574
    .line 575
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 576
    .line 577
    .line 578
    move-result v1

    .line 579
    new-instance v5, Ljava/lang/StringBuilder;

    .line 580
    .line 581
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 582
    .line 583
    .line 584
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v5, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 588
    .line 589
    .line 590
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 591
    .line 592
    .line 593
    move-result-object v4

    .line 594
    const/4 v5, 0x1

    .line 595
    if-eq v1, v5, :cond_d

    .line 596
    .line 597
    const/4 v5, 0x2

    .line 598
    if-eq v1, v5, :cond_b

    .line 599
    .line 600
    const/16 v2, 0x64

    .line 601
    .line 602
    if-eq v1, v2, :cond_d

    .line 603
    .line 604
    goto :goto_5

    .line 605
    :cond_b
    invoke-interface {v2, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 606
    .line 607
    .line 608
    move-result v1

    .line 609
    if-eqz v1, :cond_e

    .line 610
    .line 611
    invoke-virtual {v2, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v1

    .line 615
    check-cast v1, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪世兰哲苏;

    .line 616
    .line 617
    new-instance v2, Ljava/lang/StringBuilder;

    .line 618
    .line 619
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 620
    .line 621
    .line 622
    if-eqz v1, :cond_c

    .line 623
    .line 624
    const-string v4, "\u545c\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u545c\u545c\u55b5\u545c\u55b5\u545c\u545c\u545c~\u545c\u545c\u55b5\u545c\u55b5\u55b5\u55b5\u545c"

    .line 625
    .line 626
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v4

    .line 630
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 631
    .line 632
    .line 633
    iget-object v4, v1, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 634
    .line 635
    invoke-static {v4}, Llin/xposed/hook/util/qq/QQEnvTool;->getUinFromUid(Ljava/lang/String;)Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object v4

    .line 639
    iget-object v1, v1, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 640
    .line 641
    invoke-static {v1, v4}, L飘花落叶言苏哲子世楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 642
    .line 643
    .line 644
    move-result-object v1

    .line 645
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 646
    .line 647
    .line 648
    const-string v1, "\u55b5\u545c\u55b5\u545c\u545c\u55b5\u545c\u545c"

    .line 649
    .line 650
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object v1

    .line 654
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 655
    .line 656
    .line 657
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 658
    .line 659
    .line 660
    const-string v1, "\u55b5\u545c\u55b5\u545c\u545c\u55b5\u545c\u55b5"

    .line 661
    .line 662
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v1

    .line 666
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 667
    .line 668
    .line 669
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v1

    .line 673
    invoke-virtual {v0, v3, v1}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪苏哲兰世(Landroid/view/ViewGroup;Ljava/lang/String;)V

    .line 674
    .line 675
    .line 676
    goto :goto_5

    .line 677
    :cond_c
    const/16 v0, 0x585

    .line 678
    .line 679
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 684
    .line 685
    .line 686
    goto :goto_5

    .line 687
    :cond_d
    iget-object v1, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪兰世苏哲:Ljava/util/LinkedHashMap;

    .line 688
    .line 689
    invoke-interface {v1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 690
    .line 691
    .line 692
    move-result v1

    .line 693
    if-eqz v1, :cond_e

    .line 694
    .line 695
    const-string v1, ""

    .line 696
    .line 697
    invoke-virtual {v0, v3, v1}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪苏哲兰世(Landroid/view/ViewGroup;Ljava/lang/String;)V

    .line 698
    .line 699
    .line 700
    :cond_e
    :goto_5
    return-void

    .line 701
    :pswitch_2
    invoke-static {v15}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 702
    .line 703
    .line 704
    invoke-static {v14}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 705
    .line 706
    .line 707
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 708
    .line 709
    .line 710
    move-result-object v2

    .line 711
    move-object/from16 v5, p2

    .line 712
    .line 713
    check-cast v5, Landroid/view/ViewGroup;

    .line 714
    .line 715
    const-string v6, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 716
    .line 717
    invoke-static {v6}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 718
    .line 719
    .line 720
    move-result-object v6

    .line 721
    invoke-static {v13, v6, v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v1

    .line 725
    check-cast v1, Ljava/lang/Long;

    .line 726
    .line 727
    check-cast v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪哲苏;

    .line 728
    .line 729
    iget v6, v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰苏世:I

    .line 730
    .line 731
    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 732
    .line 733
    .line 734
    move-result-object v7

    .line 735
    if-eqz v7, :cond_f

    .line 736
    .line 737
    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 738
    .line 739
    .line 740
    :cond_f
    iget-object v0, v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/util/HashSet;

    .line 741
    .line 742
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 743
    .line 744
    .line 745
    move-result v0

    .line 746
    if-eqz v0, :cond_10

    .line 747
    .line 748
    new-instance v0, Landroid/widget/TextView;

    .line 749
    .line 750
    invoke-direct {v0, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 751
    .line 752
    .line 753
    const-string v1, "\u545c\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u545c\u545c\u545c\u55b5\u55b5\u55b5\u545c\u55b5~\u545c\u545c\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c~\u545c\u545c\u545c\u55b5\u55b5\u55b5\u55b5\u55b5~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c"

    .line 754
    .line 755
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 756
    .line 757
    .line 758
    move-result-object v1

    .line 759
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 760
    .line 761
    .line 762
    invoke-virtual {v0, v6}, Landroid/view/View;->setId(I)V

    .line 763
    .line 764
    .line 765
    const/16 v1, 0x11

    .line 766
    .line 767
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 768
    .line 769
    .line 770
    const/high16 v1, 0x41a00000    # 20.0f

    .line 771
    .line 772
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 773
    .line 774
    .line 775
    const v1, 0x24060485

    .line 776
    .line 777
    .line 778
    invoke-virtual {v2, v1}, Landroid/content/Context;->getColor(I)I

    .line 779
    .line 780
    .line 781
    move-result v1

    .line 782
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 783
    .line 784
    .line 785
    const/4 v1, 0x0

    .line 786
    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 787
    .line 788
    .line 789
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 790
    .line 791
    .line 792
    move-result-object v1

    .line 793
    :try_start_0
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 794
    .line 795
    .line 796
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    .line 797
    .line 798
    .line 799
    move-result v2

    .line 800
    invoke-static {v5}, Llin/xposed/hook/util/qq/QQAIOTool;->getContentId(Landroid/view/ViewGroup;)I

    .line 801
    .line 802
    .line 803
    move-result v6

    .line 804
    invoke-static {v11}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 805
    .line 806
    .line 807
    move-result-object v7

    .line 808
    invoke-static {v7}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 809
    .line 810
    .line 811
    move-result-object v7

    .line 812
    filled-new-array {v12, v12}, [Ljava/lang/Class;

    .line 813
    .line 814
    .line 815
    move-result-object v8

    .line 816
    filled-new-array {v1, v1}, [Ljava/lang/Object;

    .line 817
    .line 818
    .line 819
    move-result-object v1

    .line 820
    invoke-static {v1, v8, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子世兰楪哲苏([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    .line 821
    .line 822
    .line 823
    move-result-object v1

    .line 824
    invoke-static {v10}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 825
    .line 826
    .line 827
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 828
    .line 829
    .line 830
    check-cast v1, Landroid/view/ViewGroup$LayoutParams;

    .line 831
    .line 832
    const/16 v7, 0x77a

    .line 833
    .line 834
    invoke-static {v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 835
    .line 836
    .line 837
    move-result-object v7

    .line 838
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 839
    .line 840
    .line 841
    move-result-object v8

    .line 842
    invoke-static {v1, v7, v8}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 843
    .line 844
    .line 845
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 846
    .line 847
    .line 848
    move-result-object v4

    .line 849
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 850
    .line 851
    .line 852
    move-result-object v2

    .line 853
    invoke-static {v1, v4, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 854
    .line 855
    .line 856
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object v2

    .line 860
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 861
    .line 862
    .line 863
    move-result-object v3

    .line 864
    invoke-static {v1, v2, v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 865
    .line 866
    .line 867
    goto :goto_6

    .line 868
    :catch_0
    const/4 v1, 0x0

    .line 869
    :goto_6
    invoke-virtual {v5, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 870
    .line 871
    .line 872
    :cond_10
    return-void

    .line 873
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
