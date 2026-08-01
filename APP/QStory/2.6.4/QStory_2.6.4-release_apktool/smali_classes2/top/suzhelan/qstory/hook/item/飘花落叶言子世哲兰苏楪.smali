.class public final Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲兰苏楪;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世兰哲苏;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;I)V
    .locals 0

    .line 1
    iput p2, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;

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
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲苏兰世:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/16 v4, 0x7ea

    .line 9
    .line 10
    const/16 v6, 0x911

    .line 11
    .line 12
    const-wide/16 v7, 0x3e8

    .line 13
    .line 14
    const-string v9, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5"

    .line 15
    .line 16
    const/4 v10, -0x2

    .line 17
    const/16 v11, 0x7e7

    .line 18
    .line 19
    const/16 v12, 0x7e6

    .line 20
    .line 21
    sget-object v13, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 22
    .line 23
    sget-object v14, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    const/16 v15, 0x7e3

    .line 26
    .line 27
    const/16 v16, 0x7e2

    .line 28
    .line 29
    iget-object v0, v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;

    .line 30
    .line 31
    packed-switch v2, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世兰苏楪哲;

    .line 39
    .line 40
    iget v3, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰苏世:I

    .line 41
    .line 42
    invoke-static/range {v16 .. v16}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    invoke-static {v15}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-object/from16 v4, p2

    .line 49
    .line 50
    check-cast v4, Landroid/view/ViewGroup;

    .line 51
    .line 52
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    invoke-static {v4}, Llin/xposed/hook/util/qq/QQAIOTool;->hasContentMessage(Landroid/view/ViewGroup;)Z

    .line 57
    .line 58
    .line 59
    move-result v15

    .line 60
    if-nez v15, :cond_0

    .line 61
    .line 62
    goto/16 :goto_0

    .line 63
    .line 64
    :cond_0
    invoke-static {v4}, Llin/xposed/hook/util/qq/QQAIOTool;->getContentId(Landroid/view/ViewGroup;)I

    .line 65
    .line 66
    .line 67
    move-result v15

    .line 68
    invoke-static {v9}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v9

    .line 72
    invoke-static {v14, v9, v1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, Ljava/lang/Long;

    .line 77
    .line 78
    new-instance v9, Ljava/text/SimpleDateFormat;

    .line 79
    .line 80
    sget v14, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪兰世苏哲:I

    .line 81
    .line 82
    iget-object v0, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 83
    .line 84
    const/16 v14, 0xeb

    .line 85
    .line 86
    invoke-static {v14}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v14

    .line 90
    const/16 v16, 0x334

    .line 91
    .line 92
    const/16 v17, 0x7e9

    .line 93
    .line 94
    invoke-static/range {v16 .. v16}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-virtual {v0, v14, v5}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    sget-object v5, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 103
    .line 104
    invoke-direct {v9, v0, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 105
    .line 106
    .line 107
    new-instance v0, Ljava/util/Date;

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 110
    .line 111
    .line 112
    move-result-wide v18

    .line 113
    mul-long v7, v7, v18

    .line 114
    .line 115
    invoke-direct {v0, v7, v8}, Ljava/util/Date;-><init>(J)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v9, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {v4, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, Landroid/widget/TextView;

    .line 127
    .line 128
    if-eqz v1, :cond_1

    .line 129
    .line 130
    invoke-virtual {v4, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 131
    .line 132
    .line 133
    :cond_1
    new-instance v1, Landroid/widget/TextView;

    .line 134
    .line 135
    invoke-direct {v1, v10}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 136
    .line 137
    .line 138
    const/high16 v5, 0x41100000    # 9.0f

    .line 139
    .line 140
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, v3}, Landroid/view/View;->setId(I)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v12}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-static {v0}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    filled-new-array {v13, v13}, [Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    filled-new-array {v2, v2}, [Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-static {v2, v3, v0}, L飘花落叶言楪兰哲世苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏世兰楪哲([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-static {v11}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    check-cast v0, Landroid/view/ViewGroup$LayoutParams;

    .line 176
    .line 177
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    invoke-static {v0, v2, v3}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    invoke-static/range {v17 .. v17}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-static {v0, v2, v3}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    const/16 v2, 0x92d

    .line 200
    .line 201
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    const/high16 v3, 0x40400000    # 3.0f

    .line 206
    .line 207
    invoke-static {v10, v3}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世(Landroid/content/Context;F)I

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    invoke-static {v0, v2, v3}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v4, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 219
    .line 220
    .line 221
    :goto_0
    return-void

    .line 222
    :pswitch_0
    check-cast v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰哲楪;

    .line 223
    .line 224
    iget v2, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲兰世苏:I

    .line 225
    .line 226
    invoke-static/range {v16 .. v16}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    invoke-static {v15}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    const/16 v3, 0x1d2

    .line 233
    .line 234
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    invoke-static {v14, v3, v1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    check-cast v3, Ljava/lang/Long;

    .line 243
    .line 244
    move-object/from16 v5, p2

    .line 245
    .line 246
    check-cast v5, Landroid/view/ViewGroup;

    .line 247
    .line 248
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 249
    .line 250
    .line 251
    move-result-object v7

    .line 252
    invoke-static {v5}, Llin/xposed/hook/util/qq/QQAIOTool;->getContentId(Landroid/view/ViewGroup;)I

    .line 253
    .line 254
    .line 255
    move-result v8

    .line 256
    invoke-static {v5}, Llin/xposed/hook/util/qq/QQAIOTool;->hasContentMessage(Landroid/view/ViewGroup;)Z

    .line 257
    .line 258
    .line 259
    move-result v9

    .line 260
    if-eqz v9, :cond_7

    .line 261
    .line 262
    invoke-virtual {v5, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 263
    .line 264
    .line 265
    move-result-object v9

    .line 266
    if-nez v9, :cond_2

    .line 267
    .line 268
    goto/16 :goto_4

    .line 269
    .line 270
    :cond_2
    invoke-virtual {v5, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 271
    .line 272
    .line 273
    move-result-object v9

    .line 274
    check-cast v9, Landroid/widget/ImageView;

    .line 275
    .line 276
    if-eqz v9, :cond_3

    .line 277
    .line 278
    invoke-virtual {v5, v9}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 279
    .line 280
    .line 281
    :cond_3
    new-instance v9, Landroid/widget/ImageView;

    .line 282
    .line 283
    invoke-direct {v9, v7}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v9, v2}, Landroid/view/View;->setId(I)V

    .line 287
    .line 288
    .line 289
    iget-object v2, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰苏世哲:Landroid/graphics/drawable/BitmapDrawable;

    .line 290
    .line 291
    invoke-virtual {v9, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 292
    .line 293
    .line 294
    new-instance v2, Landroidx/appcompat/app/飘花落叶言子世哲苏兰楪;

    .line 295
    .line 296
    invoke-static {}, Llin/xposed/hook/util/qq/QQSessionUtils;->getCurrentContact()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v10

    .line 300
    const/16 v14, 0x910

    .line 301
    .line 302
    invoke-static {v14}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    invoke-direct {v2, v0, v1, v10}, Landroidx/appcompat/app/飘花落叶言子世哲苏兰楪;-><init>(Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰哲楪;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v9, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    iget v1, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰世苏哲:I

    .line 318
    .line 319
    if-eqz v1, :cond_4

    .line 320
    .line 321
    goto :goto_1

    .line 322
    :cond_4
    iget-object v1, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;

    .line 323
    .line 324
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    const-string v2, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c"

    .line 328
    .line 329
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    const/16 v10, 0x1a

    .line 334
    .line 335
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 336
    .line 337
    .line 338
    move-result-object v10

    .line 339
    invoke-virtual {v1, v10, v2}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    const/16 v2, 0x7b8

    .line 344
    .line 345
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    check-cast v1, Ljava/lang/Integer;

    .line 352
    .line 353
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 354
    .line 355
    .line 356
    move-result v1

    .line 357
    int-to-float v1, v1

    .line 358
    invoke-static {v7, v1}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世(Landroid/content/Context;F)I

    .line 359
    .line 360
    .line 361
    move-result v1

    .line 362
    iput v1, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰世苏哲:I

    .line 363
    .line 364
    :goto_1
    invoke-static {v12}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    invoke-static {v2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    filled-new-array {v13, v13}, [Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    move-result-object v7

    .line 376
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 377
    .line 378
    .line 379
    move-result-object v10

    .line 380
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    filled-new-array {v10, v1}, [Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    invoke-static {v1, v7, v2}, L飘花落叶言楪兰哲世苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏世兰楪哲([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v1

    .line 392
    invoke-static {v11}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 396
    .line 397
    .line 398
    check-cast v1, Landroid/view/ViewGroup$LayoutParams;

    .line 399
    .line 400
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 405
    .line 406
    .line 407
    move-result-object v4

    .line 408
    invoke-static {v1, v2, v4}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v2

    .line 415
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 416
    .line 417
    .line 418
    move-result-object v4

    .line 419
    invoke-static {v1, v2, v4}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    iget-object v3, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 427
    .line 428
    if-eqz v3, :cond_5

    .line 429
    .line 430
    goto :goto_2

    .line 431
    :cond_5
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v3

    .line 435
    iput-object v3, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 436
    .line 437
    :goto_2
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move-result v0

    .line 441
    if-eqz v0, :cond_6

    .line 442
    .line 443
    const/16 v0, 0x912

    .line 444
    .line 445
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    invoke-static {v1, v0, v2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    goto :goto_3

    .line 457
    :cond_6
    const/16 v0, 0x913

    .line 458
    .line 459
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 464
    .line 465
    .line 466
    move-result-object v2

    .line 467
    invoke-static {v1, v0, v2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    :goto_3
    invoke-virtual {v5, v9, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 471
    .line 472
    .line 473
    :cond_7
    :goto_4
    return-void

    .line 474
    :pswitch_1
    move-object v2, v0

    .line 475
    check-cast v2, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏兰哲;

    .line 476
    .line 477
    invoke-static/range {v16 .. v16}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    invoke-static {v15}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-object/from16 v4, p2

    .line 484
    .line 485
    check-cast v4, Landroid/view/ViewGroup;

    .line 486
    .line 487
    invoke-static {v4}, Llin/xposed/hook/util/qq/QQAIOTool;->hasContentMessage(Landroid/view/ViewGroup;)Z

    .line 488
    .line 489
    .line 490
    move-result v0

    .line 491
    if-nez v0, :cond_8

    .line 492
    .line 493
    goto/16 :goto_7

    .line 494
    .line 495
    :cond_8
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c"

    .line 496
    .line 497
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    const-class v5, Ljava/lang/String;

    .line 502
    .line 503
    invoke-static {v5, v0, v1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    check-cast v0, Ljava/lang/String;

    .line 508
    .line 509
    const-string v5, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c"

    .line 510
    .line 511
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v5

    .line 515
    invoke-static {v14, v5, v1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v5

    .line 519
    check-cast v5, Ljava/lang/Long;

    .line 520
    .line 521
    if-eqz v5, :cond_11

    .line 522
    .line 523
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 524
    .line 525
    .line 526
    move-result-wide v5

    .line 527
    iget v10, v2, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 528
    .line 529
    invoke-virtual {v4, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 530
    .line 531
    .line 532
    move-result-object v10

    .line 533
    if-eqz v10, :cond_9

    .line 534
    .line 535
    invoke-virtual {v4, v10}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 536
    .line 537
    .line 538
    :cond_9
    invoke-static {v9}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 539
    .line 540
    .line 541
    move-result-object v9

    .line 542
    invoke-static {v14, v9, v1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v9

    .line 546
    check-cast v9, Ljava/lang/Long;

    .line 547
    .line 548
    if-eqz v9, :cond_11

    .line 549
    .line 550
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 551
    .line 552
    .line 553
    move-result-wide v9

    .line 554
    mul-long/2addr v9, v7

    .line 555
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 556
    .line 557
    .line 558
    move-result-wide v7

    .line 559
    sub-long/2addr v7, v9

    .line 560
    const-wide/16 v9, 0x7d0

    .line 561
    .line 562
    cmp-long v7, v7, v9

    .line 563
    .line 564
    if-gez v7, :cond_a

    .line 565
    .line 566
    goto/16 :goto_7

    .line 567
    .line 568
    :cond_a
    const/16 v7, 0x74

    .line 569
    .line 570
    invoke-static {v7}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v7

    .line 574
    invoke-static {v13, v7, v1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v1

    .line 578
    check-cast v1, Ljava/lang/Integer;

    .line 579
    .line 580
    if-eqz v1, :cond_11

    .line 581
    .line 582
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 583
    .line 584
    .line 585
    move-result v1

    .line 586
    const/4 v7, 0x1

    .line 587
    const-string v8, ""

    .line 588
    .line 589
    if-eq v1, v7, :cond_e

    .line 590
    .line 591
    const/4 v9, 0x2

    .line 592
    if-eq v1, v9, :cond_b

    .line 593
    .line 594
    const/16 v9, 0x64

    .line 595
    .line 596
    if-eq v1, v9, :cond_e

    .line 597
    .line 598
    goto/16 :goto_7

    .line 599
    .line 600
    :cond_b
    iget-object v1, v2, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/database/飘花落叶言子楪苏世兰哲;

    .line 601
    .line 602
    if-eqz v1, :cond_d

    .line 603
    .line 604
    if-nez v0, :cond_c

    .line 605
    .line 606
    move-object v0, v8

    .line 607
    :cond_c
    long-to-int v5, v5

    .line 608
    invoke-virtual {v1, v5, v9, v0}, Ltop/suzhelan/qstory/database/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)L飘花落叶言苏世楪哲兰子/飘花落叶言子楪世哲苏兰;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    goto :goto_5

    .line 613
    :cond_d
    move-object v0, v3

    .line 614
    :goto_5
    if-eqz v0, :cond_11

    .line 615
    .line 616
    const-string v1, "\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c"

    .line 617
    .line 618
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    :try_start_0
    sget-object v1, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 622
    .line 623
    iget-object v0, v0, L飘花落叶言苏世楪哲兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲:[B

    .line 624
    .line 625
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 626
    .line 627
    .line 628
    sget-object v5, L飘花落叶言苏楪世兰哲子/飘花落叶言子楪世兰哲苏;->Companion:L飘花落叶言苏楪世兰哲子/飘花落叶言子楪世兰苏哲;

    .line 629
    .line 630
    invoke-virtual {v5}, L飘花落叶言苏楪世兰哲子/飘花落叶言子楪世兰苏哲;->serializer()L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;

    .line 631
    .line 632
    .line 633
    move-result-object v5

    .line 634
    check-cast v5, L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;

    .line 635
    .line 636
    invoke-virtual {v1, v5, v0}, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;[B)Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    check-cast v0, L飘花落叶言苏楪世兰哲子/飘花落叶言子楪世兰哲苏;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 641
    .line 642
    move-object v3, v0

    .line 643
    goto :goto_6

    .line 644
    :catch_0
    move-exception v0

    .line 645
    const/16 v1, 0x5f5

    .line 646
    .line 647
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v1

    .line 651
    const/16 v5, 0x5f7

    .line 652
    .line 653
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object v5

    .line 657
    invoke-static {v1, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 658
    .line 659
    .line 660
    :goto_6
    if-eqz v3, :cond_11

    .line 661
    .line 662
    new-instance v0, Ljava/lang/StringBuilder;

    .line 663
    .line 664
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 665
    .line 666
    .line 667
    const-string v1, "\u545c\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u545c\u545c\u55b5\u545c\u55b5\u545c\u545c\u545c~\u545c\u545c\u55b5\u545c\u55b5\u55b5\u55b5\u545c"

    .line 668
    .line 669
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v1

    .line 673
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 674
    .line 675
    .line 676
    iget-object v1, v3, L飘花落叶言苏楪世兰哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 677
    .line 678
    invoke-static {v1}, Llin/xposed/hook/util/qq/QQEnvTool;->getUinFromUid(Ljava/lang/String;)Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v1

    .line 682
    iget-object v3, v3, L飘花落叶言苏楪世兰哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 683
    .line 684
    invoke-static {v3, v1}, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v3

    .line 688
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 689
    .line 690
    .line 691
    const-string v3, "\u55b5\u545c\u55b5\u545c\u545c\u55b5\u545c\u545c"

    .line 692
    .line 693
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v3

    .line 697
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 698
    .line 699
    .line 700
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 701
    .line 702
    .line 703
    const-string v1, "\u55b5\u545c\u55b5\u545c\u545c\u55b5\u545c\u55b5"

    .line 704
    .line 705
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 706
    .line 707
    .line 708
    move-result-object v1

    .line 709
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 710
    .line 711
    .line 712
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    invoke-virtual {v2, v4, v0}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏哲兰世(Landroid/view/ViewGroup;Ljava/lang/String;)V

    .line 717
    .line 718
    .line 719
    goto :goto_7

    .line 720
    :cond_e
    iget-object v1, v2, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/database/飘花落叶言子楪苏世兰哲;

    .line 721
    .line 722
    if-eqz v1, :cond_10

    .line 723
    .line 724
    if-nez v0, :cond_f

    .line 725
    .line 726
    move-object v0, v8

    .line 727
    :cond_f
    long-to-int v3, v5

    .line 728
    invoke-virtual {v1, v3, v7, v0}, Ltop/suzhelan/qstory/database/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)L飘花落叶言苏世楪哲兰子/飘花落叶言子楪世哲苏兰;

    .line 729
    .line 730
    .line 731
    move-result-object v3

    .line 732
    :cond_10
    if-eqz v3, :cond_11

    .line 733
    .line 734
    invoke-virtual {v2, v4, v8}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏哲兰世(Landroid/view/ViewGroup;Ljava/lang/String;)V

    .line 735
    .line 736
    .line 737
    :cond_11
    :goto_7
    return-void

    .line 738
    :pswitch_2
    const/16 v17, 0x7e9

    .line 739
    .line 740
    invoke-static/range {v16 .. v16}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 741
    .line 742
    .line 743
    invoke-static {v15}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 744
    .line 745
    .line 746
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 747
    .line 748
    .line 749
    move-result-object v2

    .line 750
    move-object/from16 v5, p2

    .line 751
    .line 752
    check-cast v5, Landroid/view/ViewGroup;

    .line 753
    .line 754
    const-string v6, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 755
    .line 756
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 757
    .line 758
    .line 759
    move-result-object v6

    .line 760
    invoke-static {v14, v6, v1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 761
    .line 762
    .line 763
    move-result-object v1

    .line 764
    check-cast v1, Ljava/lang/Long;

    .line 765
    .line 766
    check-cast v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪苏哲;

    .line 767
    .line 768
    iget v6, v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 769
    .line 770
    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 771
    .line 772
    .line 773
    move-result-object v7

    .line 774
    if-eqz v7, :cond_12

    .line 775
    .line 776
    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 777
    .line 778
    .line 779
    :cond_12
    iget-object v0, v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/HashSet;

    .line 780
    .line 781
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 782
    .line 783
    .line 784
    move-result v0

    .line 785
    if-eqz v0, :cond_13

    .line 786
    .line 787
    new-instance v0, Landroid/widget/TextView;

    .line 788
    .line 789
    invoke-direct {v0, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 790
    .line 791
    .line 792
    const-string v1, "\u545c\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u545c\u545c\u545c\u55b5\u55b5\u55b5\u545c\u55b5~\u545c\u545c\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c~\u545c\u545c\u545c\u55b5\u55b5\u55b5\u55b5\u55b5~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c"

    .line 793
    .line 794
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v1

    .line 798
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 799
    .line 800
    .line 801
    invoke-virtual {v0, v6}, Landroid/view/View;->setId(I)V

    .line 802
    .line 803
    .line 804
    const/16 v1, 0x11

    .line 805
    .line 806
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 807
    .line 808
    .line 809
    const/high16 v1, 0x41a00000    # 20.0f

    .line 810
    .line 811
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 812
    .line 813
    .line 814
    const v1, 0x24060485

    .line 815
    .line 816
    .line 817
    invoke-virtual {v2, v1}, Landroid/content/Context;->getColor(I)I

    .line 818
    .line 819
    .line 820
    move-result v1

    .line 821
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 822
    .line 823
    .line 824
    const/4 v1, 0x0

    .line 825
    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 826
    .line 827
    .line 828
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 829
    .line 830
    .line 831
    move-result-object v1

    .line 832
    :try_start_1
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 833
    .line 834
    .line 835
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    .line 836
    .line 837
    .line 838
    move-result v2

    .line 839
    invoke-static {v5}, Llin/xposed/hook/util/qq/QQAIOTool;->getContentId(Landroid/view/ViewGroup;)I

    .line 840
    .line 841
    .line 842
    move-result v6

    .line 843
    invoke-static {v12}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 844
    .line 845
    .line 846
    move-result-object v7

    .line 847
    invoke-static {v7}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 848
    .line 849
    .line 850
    move-result-object v7

    .line 851
    filled-new-array {v13, v13}, [Ljava/lang/Class;

    .line 852
    .line 853
    .line 854
    move-result-object v8

    .line 855
    filled-new-array {v1, v1}, [Ljava/lang/Object;

    .line 856
    .line 857
    .line 858
    move-result-object v1

    .line 859
    invoke-static {v1, v8, v7}, L飘花落叶言楪兰哲世苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏世兰楪哲([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    move-result-object v1

    .line 863
    invoke-static {v11}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 864
    .line 865
    .line 866
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 867
    .line 868
    .line 869
    check-cast v1, Landroid/view/ViewGroup$LayoutParams;

    .line 870
    .line 871
    const/16 v7, 0x7e8

    .line 872
    .line 873
    invoke-static {v7}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v7

    .line 877
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 878
    .line 879
    .line 880
    move-result-object v8

    .line 881
    invoke-static {v1, v7, v8}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 882
    .line 883
    .line 884
    invoke-static/range {v17 .. v17}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 885
    .line 886
    .line 887
    move-result-object v7

    .line 888
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 889
    .line 890
    .line 891
    move-result-object v2

    .line 892
    invoke-static {v1, v7, v2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 893
    .line 894
    .line 895
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v2

    .line 899
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 900
    .line 901
    .line 902
    move-result-object v4

    .line 903
    invoke-static {v1, v2, v4}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 904
    .line 905
    .line 906
    move-object v3, v1

    .line 907
    :catch_1
    invoke-virtual {v5, v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 908
    .line 909
    .line 910
    :cond_13
    return-void

    .line 911
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
