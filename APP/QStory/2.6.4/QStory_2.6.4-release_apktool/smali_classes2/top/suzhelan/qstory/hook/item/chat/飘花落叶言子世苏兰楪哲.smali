.class public final synthetic Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪兰苏世哲:Landroid/view/View;

.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Landroid/view/KeyEvent$Callback;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Landroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/View;I)V
    .locals 0

    .line 1
    iput p6, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲兰苏世:Landroid/view/KeyEvent$Callback;

    .line 6
    .line 7
    iput-object p3, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p5, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 13

    .line 1
    iget p1, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iget-object v1, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 5
    .line 6
    iget-object v2, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v3, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v4, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲兰苏世:Landroid/view/KeyEvent$Callback;

    .line 11
    .line 12
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch p1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object v6, p0

    .line 18
    check-cast v6, L飘花落叶言苏哲兰楪世子/飘花落叶言子楪世哲兰苏;

    .line 19
    .line 20
    move-object v7, v4

    .line 21
    check-cast v7, Landroid/widget/TextView;

    .line 22
    .line 23
    move-object v8, v3

    .line 24
    check-cast v8, Ljava/lang/String;

    .line 25
    .line 26
    move-object v9, v2

    .line 27
    check-cast v9, Ltop/suzhelan/sticker/sdk/widget/CustomRecycleView;

    .line 28
    .line 29
    move-object v10, v1

    .line 30
    check-cast v10, Landroid/widget/ProgressBar;

    .line 31
    .line 32
    new-instance p0, Landroid/widget/PopupMenu;

    .line 33
    .line 34
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-direct {p0, p1, v7}, Landroid/widget/PopupMenu;-><init>(Landroid/content/Context;Landroid/view/View;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/widget/PopupMenu;->getMenuInflater()Landroid/view/MenuInflater;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const/high16 v1, 0x240e0000

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/widget/PopupMenu;->getMenu()Landroid/view/Menu;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {p1, v1, v2}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, v6, L飘花落叶言苏哲兰楪世子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰世哲:Ljava/lang/String;

    .line 55
    .line 56
    const-string v1, "latest"

    .line 57
    .line 58
    invoke-static {p1, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_0

    .line 63
    .line 64
    invoke-virtual {p0}, Landroid/widget/PopupMenu;->getMenu()Landroid/view/Menu;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    const v1, 0x24090206

    .line 69
    .line 70
    .line 71
    invoke-interface {p1, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-eqz p1, :cond_1

    .line 76
    .line 77
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    const-string v1, "popular"

    .line 82
    .line 83
    invoke-static {p1, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_1

    .line 88
    .line 89
    invoke-virtual {p0}, Landroid/widget/PopupMenu;->getMenu()Landroid/view/Menu;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    const v1, 0x24090207

    .line 94
    .line 95
    .line 96
    invoke-interface {p1, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    if-eqz p1, :cond_1

    .line 101
    .line 102
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 103
    .line 104
    .line 105
    :cond_1
    :goto_0
    new-instance v5, L飘花落叶言苏哲兰楪世子/飘花落叶言子楪世哲苏兰;

    .line 106
    .line 107
    invoke-direct/range {v5 .. v10}, L飘花落叶言苏哲兰楪世子/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言苏哲兰楪世子/飘花落叶言子楪世哲兰苏;Landroid/view/View;Ljava/lang/String;Ltop/suzhelan/sticker/sdk/widget/CustomRecycleView;Landroid/widget/ProgressBar;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v5}, Landroid/widget/PopupMenu;->setOnMenuItemClickListener(Landroid/widget/PopupMenu$OnMenuItemClickListener;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Landroid/widget/PopupMenu;->show()V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :pswitch_0
    move-object v7, p0

    .line 118
    check-cast v7, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏兰哲世;

    .line 119
    .line 120
    move-object v8, v4

    .line 121
    check-cast v8, Landroid/widget/TextView;

    .line 122
    .line 123
    move-object v9, v3

    .line 124
    check-cast v9, Ljava/lang/String;

    .line 125
    .line 126
    move-object v10, v2

    .line 127
    check-cast v10, Ltop/suzhelan/plugin/sdk/online/widget/CustomRecycleView;

    .line 128
    .line 129
    move-object v11, v1

    .line 130
    check-cast v11, Landroid/widget/ProgressBar;

    .line 131
    .line 132
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    const p1, 0x240c00e9

    .line 141
    .line 142
    .line 143
    const/4 v1, 0x0

    .line 144
    invoke-virtual {p0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    check-cast p0, Landroid/view/ViewGroup;

    .line 152
    .line 153
    new-instance v12, Landroid/widget/PopupWindow;

    .line 154
    .line 155
    const/4 p1, -0x2

    .line 156
    invoke-direct {v12, p0, p1, p1, v0}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v0}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 160
    .line 161
    .line 162
    const p1, 0x2409030e

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    check-cast p1, Landroid/widget/TextView;

    .line 170
    .line 171
    const v1, 0x2409030c

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    check-cast v1, Landroid/widget/TextView;

    .line 179
    .line 180
    const v2, 0x2409030b

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    check-cast v2, Landroid/widget/TextView;

    .line 188
    .line 189
    const v3, 0x2409030d

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    check-cast p0, Landroid/widget/TextView;

    .line 197
    .line 198
    iget-object v3, v7, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲兰世:Ljava/lang/String;

    .line 199
    .line 200
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    sparse-switch v4, :sswitch_data_0

    .line 205
    .line 206
    .line 207
    goto :goto_1

    .line 208
    :sswitch_0
    const-string v4, "download_asc"

    .line 209
    .line 210
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    if-nez v3, :cond_2

    .line 215
    .line 216
    goto :goto_1

    .line 217
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    invoke-static {p1, v1, v2, p0, v2}, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子世楪哲苏兰(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 221
    .line 222
    .line 223
    goto :goto_1

    .line 224
    :sswitch_1
    const-string v4, "download_desc"

    .line 225
    .line 226
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    if-nez v3, :cond_3

    .line 231
    .line 232
    goto :goto_1

    .line 233
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-static {p1, v1, v2, p0, v1}, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子世楪哲苏兰(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 237
    .line 238
    .line 239
    goto :goto_1

    .line 240
    :sswitch_2
    const-string v4, "time"

    .line 241
    .line 242
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    if-eqz v3, :cond_5

    .line 247
    .line 248
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    invoke-static {p1, v1, v2, p0, p1}, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子世楪哲苏兰(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 252
    .line 253
    .line 254
    goto :goto_1

    .line 255
    :sswitch_3
    const-string v4, "random"

    .line 256
    .line 257
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    if-nez v3, :cond_4

    .line 262
    .line 263
    goto :goto_1

    .line 264
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    invoke-static {p1, v1, v2, p0, p0}, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子世楪哲苏兰(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 268
    .line 269
    .line 270
    :cond_5
    :goto_1
    new-instance v6, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏世兰哲;

    .line 271
    .line 272
    invoke-direct/range {v6 .. v12}, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏世兰哲;-><init>(L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏兰哲世;Landroid/view/View;Ljava/lang/String;Ltop/suzhelan/plugin/sdk/online/widget/CustomRecycleView;Landroid/widget/ProgressBar;Landroid/widget/PopupWindow;)V

    .line 273
    .line 274
    .line 275
    new-instance v3, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏哲世兰;

    .line 276
    .line 277
    const/4 v4, 0x0

    .line 278
    invoke-direct {v3, v6, p1, v4}, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏哲世兰;-><init>(L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏世兰哲;Landroid/widget/TextView;I)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {p1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 282
    .line 283
    .line 284
    new-instance p1, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏哲世兰;

    .line 285
    .line 286
    invoke-direct {p1, v6, v1, v0}, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏哲世兰;-><init>(L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏世兰哲;Landroid/widget/TextView;I)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v1, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 290
    .line 291
    .line 292
    new-instance p1, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏哲世兰;

    .line 293
    .line 294
    const/4 v0, 0x2

    .line 295
    invoke-direct {p1, v6, v2, v0}, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏哲世兰;-><init>(L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏世兰哲;Landroid/widget/TextView;I)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 299
    .line 300
    .line 301
    new-instance p1, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏哲世兰;

    .line 302
    .line 303
    const/4 v0, 0x3

    .line 304
    invoke-direct {p1, v6, p0, v0}, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏哲世兰;-><init>(L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏世兰哲;Landroid/widget/TextView;I)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 308
    .line 309
    .line 310
    const/16 p0, 0x8

    .line 311
    .line 312
    const p1, 0x800005

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12, v8, v4, p0, p1}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;III)V

    .line 316
    .line 317
    .line 318
    return-void

    .line 319
    :pswitch_1
    check-cast p0, Landroid/widget/EditText;

    .line 320
    .line 321
    check-cast v4, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世苏哲兰;

    .line 322
    .line 323
    check-cast v3, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰哲楪;

    .line 324
    .line 325
    check-cast v2, Landroid/content/Context;

    .line 326
    .line 327
    check-cast v1, Landroid/widget/CheckBox;

    .line 328
    .line 329
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 330
    .line 331
    .line 332
    move-result-object p0

    .line 333
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 338
    .line 339
    .line 340
    move-result p1

    .line 341
    if-nez p1, :cond_6

    .line 342
    .line 343
    const/16 p0, 0x91a

    .line 344
    .line 345
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object p0

    .line 349
    invoke-static {p0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v4}, Landroid/app/Dialog;->dismiss()V

    .line 353
    .line 354
    .line 355
    goto :goto_2

    .line 356
    :cond_6
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 357
    .line 358
    .line 359
    move-result p0

    .line 360
    int-to-float p1, p0

    .line 361
    invoke-static {v2, p1}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世(Landroid/content/Context;F)I

    .line 362
    .line 363
    .line 364
    move-result p1

    .line 365
    iput p1, v3, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰世苏哲:I

    .line 366
    .line 367
    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 368
    .line 369
    .line 370
    move-result p1

    .line 371
    iget-object v0, v3, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;

    .line 372
    .line 373
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    const-string v1, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c"

    .line 377
    .line 378
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 383
    .line 384
    .line 385
    move-result-object p0

    .line 386
    invoke-virtual {v0, p0, v1}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    iget-object p0, v3, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;

    .line 390
    .line 391
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    const/16 v0, 0x90f

    .line 395
    .line 396
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 401
    .line 402
    .line 403
    move-result-object p1

    .line 404
    invoke-virtual {p0, p1, v0}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    iget-object p0, v3, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;

    .line 408
    .line 409
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    invoke-virtual {p0}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏()V

    .line 413
    .line 414
    .line 415
    const/16 p0, 0x1f3

    .line 416
    .line 417
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object p0

    .line 421
    invoke-static {p0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v4}, Landroid/app/Dialog;->dismiss()V

    .line 425
    .line 426
    .line 427
    :goto_2
    return-void

    .line 428
    nop

    .line 429
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    :sswitch_data_0
    .sparse-switch
        -0x37ed1b3d -> :sswitch_3
        0x3652cd -> :sswitch_2
        0x1df03e8 -> :sswitch_1
        0x421fee3a -> :sswitch_0
    .end sparse-switch
.end method
