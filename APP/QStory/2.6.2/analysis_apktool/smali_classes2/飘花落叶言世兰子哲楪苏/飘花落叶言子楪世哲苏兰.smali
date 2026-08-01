.class public final L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言楪世兰子哲苏/飘花落叶言子楪世苏兰哲;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲世兰;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲世兰;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲世兰;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;ILjava/lang/Object;)V
    .locals 8

    .line 1
    iget v0, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲世兰;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const-wide v2, -0x36a57cd3051405a7L    # -2.3649855623010707E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世哲兰;

    .line 15
    .line 16
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object p1, p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;

    .line 23
    .line 24
    instance-of v0, p3, Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    move-object v1, p3

    .line 29
    check-cast v1, Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;

    .line 30
    .line 31
    :cond_0
    if-nez v1, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object p3, p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 35
    .line 36
    invoke-static {p0, p3, p2, v1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子世楪哲苏兰(L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲世兰;Landroid/view/View;ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object p0, p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏:Landroid/widget/TextView;

    .line 40
    .line 41
    if-eqz p0, :cond_2

    .line 42
    .line 43
    invoke-virtual {v1}, Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;->getLeftText()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    iget-object p0, p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰:Landroid/widget/TextView;

    .line 51
    .line 52
    if-eqz p0, :cond_3

    .line 53
    .line 54
    invoke-virtual {v1}, Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;->getTips()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    iget-object p0, p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 62
    .line 63
    invoke-virtual {v1}, Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;->getOnClick()Landroid/view/View$OnClickListener;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 68
    .line 69
    .line 70
    :goto_0
    return-void

    .line 71
    :pswitch_0
    check-cast p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世兰哲苏;

    .line 72
    .line 73
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    iget-object p1, p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;

    .line 80
    .line 81
    instance-of v0, p3, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;

    .line 82
    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    move-object v1, p3

    .line 86
    check-cast v1, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;

    .line 87
    .line 88
    :cond_4
    if-nez v1, :cond_5

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_5
    iget-object p3, p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 92
    .line 93
    invoke-static {p0, p3, p2, v1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子世楪哲苏兰(L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲世兰;Landroid/view/View;ILjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iget-object p0, p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:Landroid/widget/TextView;

    .line 97
    .line 98
    if-eqz p0, :cond_6

    .line 99
    .line 100
    invoke-virtual {v1}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;->getGroupName()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 105
    .line 106
    .line 107
    :cond_6
    :goto_1
    return-void

    .line 108
    :pswitch_1
    check-cast p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世哲兰苏;

    .line 109
    .line 110
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    iget-object p1, p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;

    .line 117
    .line 118
    instance-of v0, p3, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;

    .line 119
    .line 120
    if-eqz v0, :cond_7

    .line 121
    .line 122
    move-object v1, p3

    .line 123
    check-cast v1, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;

    .line 124
    .line 125
    :cond_7
    if-nez v1, :cond_8

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_8
    iget-object p3, p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 129
    .line 130
    invoke-static {p0, p3, p2, v1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子世楪哲苏兰(L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲世兰;Landroid/view/View;ILjava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    iget-object p0, p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲:Landroid/widget/TextView;

    .line 134
    .line 135
    if-eqz p0, :cond_9

    .line 136
    .line 137
    invoke-virtual {v1}, Llin/xposed/hook/view/main/itemview/info/BaseItemUiInfo;->getItemName()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 142
    .line 143
    .line 144
    :cond_9
    iget-object p0, p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 145
    .line 146
    new-instance p1, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;

    .line 147
    .line 148
    const/16 p2, 0x9

    .line 149
    .line 150
    invoke-direct {p1, v1, p2}, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 154
    .line 155
    .line 156
    :goto_2
    return-void

    .line 157
    :pswitch_2
    check-cast p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世兰苏哲;

    .line 158
    .line 159
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    iget-object p1, p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;

    .line 166
    .line 167
    instance-of v0, p3, Llin/xposed/hook/view/main/itemview/info/ItemUiInfo;

    .line 168
    .line 169
    if-eqz v0, :cond_a

    .line 170
    .line 171
    check-cast p3, Llin/xposed/hook/view/main/itemview/info/ItemUiInfo;

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_a
    move-object p3, v1

    .line 175
    :goto_3
    if-nez p3, :cond_b

    .line 176
    .line 177
    goto/16 :goto_7

    .line 178
    .line 179
    :cond_b
    iget-object v0, p3, Llin/xposed/hook/view/main/itemview/info/ItemUiInfo;->item:L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;

    .line 180
    .line 181
    instance-of v2, v0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;

    .line 182
    .line 183
    if-eqz v2, :cond_c

    .line 184
    .line 185
    check-cast v0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_c
    move-object v0, v1

    .line 189
    :goto_4
    if-nez v0, :cond_d

    .line 190
    .line 191
    goto/16 :goto_7

    .line 192
    .line 193
    :cond_d
    iget-object v2, p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 194
    .line 195
    iget-object v3, p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Landroid/widget/TextView;

    .line 196
    .line 197
    iget-object v4, p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Landroid/widget/Switch;

    .line 198
    .line 199
    invoke-static {p0, v2, p2, p3}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子世楪哲苏兰(L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲世兰;Landroid/view/View;ILjava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    if-eqz v3, :cond_e

    .line 203
    .line 204
    invoke-virtual {p3}, Llin/xposed/hook/view/main/itemview/info/BaseItemUiInfo;->getItemName()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    invoke-virtual {v3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 209
    .line 210
    .line 211
    :cond_e
    iget-object p2, p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroid/widget/TextView;

    .line 212
    .line 213
    const/16 p3, 0x8

    .line 214
    .line 215
    const/4 v5, 0x0

    .line 216
    if-eqz p2, :cond_10

    .line 217
    .line 218
    invoke-virtual {v0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    if-eqz v6, :cond_f

    .line 223
    .line 224
    invoke-virtual {p2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 228
    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_f
    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    .line 232
    .line 233
    .line 234
    :cond_10
    :goto_5
    if-eqz v3, :cond_11

    .line 235
    .line 236
    invoke-virtual {p0}, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲()Landroid/content/Context;

    .line 237
    .line 238
    .line 239
    move-result-object p2

    .line 240
    const v6, 0x2406045f

    .line 241
    .line 242
    .line 243
    invoke-virtual {p2, v6}, Landroid/content/Context;->getColor(I)I

    .line 244
    .line 245
    .line 246
    move-result p2

    .line 247
    invoke-virtual {v3, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 248
    .line 249
    .line 250
    :cond_11
    if-eqz v4, :cond_12

    .line 251
    .line 252
    invoke-virtual {v4, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 253
    .line 254
    .line 255
    :cond_12
    if-eqz v4, :cond_13

    .line 256
    .line 257
    iget-object p2, v0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 258
    .line 259
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 260
    .line 261
    .line 262
    move-result p2

    .line 263
    invoke-virtual {v4, p2}, Landroid/widget/Switch;->setChecked(Z)V

    .line 264
    .line 265
    .line 266
    :cond_13
    const/4 p2, 0x1

    .line 267
    if-eqz v4, :cond_14

    .line 268
    .line 269
    invoke-virtual {v4, p2}, Landroid/view/View;->setClickable(Z)V

    .line 270
    .line 271
    .line 272
    :cond_14
    instance-of v6, v0, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;

    .line 273
    .line 274
    if-eqz v6, :cond_1b

    .line 275
    .line 276
    move-object v6, v0

    .line 277
    check-cast v6, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;

    .line 278
    .line 279
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世()L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 280
    .line 281
    .line 282
    move-result-object v7

    .line 283
    invoke-virtual {v6, v7}, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰世哲(L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;)Z

    .line 284
    .line 285
    .line 286
    move-result v7

    .line 287
    if-nez v7, :cond_15

    .line 288
    .line 289
    invoke-virtual {v2, p3}, Landroid/view/View;->setVisibility(I)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    const-wide p1, -0x36a57c71051405a7L    # -2.3651189529889037E45

    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    invoke-static {p1, p2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    check-cast p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;

    .line 308
    .line 309
    iput v5, p0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 310
    .line 311
    iput v5, p0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 312
    .line 313
    invoke-virtual {v2, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 314
    .line 315
    .line 316
    goto/16 :goto_7

    .line 317
    .line 318
    :cond_15
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世()L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 319
    .line 320
    .line 321
    move-result-object v7

    .line 322
    invoke-virtual {v6, v7}, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;)Z

    .line 323
    .line 324
    .line 325
    move-result v6

    .line 326
    iget-object v7, p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲兰世:Landroid/view/View;

    .line 327
    .line 328
    if-nez v6, :cond_1a

    .line 329
    .line 330
    if-nez v7, :cond_17

    .line 331
    .line 332
    iget-object p2, p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:Landroid/view/ViewStub;

    .line 333
    .line 334
    if-eqz p2, :cond_16

    .line 335
    .line 336
    invoke-virtual {p2}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    :cond_16
    iput-object v1, p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲兰世:Landroid/view/View;

    .line 341
    .line 342
    :cond_17
    iget-object p1, p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲兰世:Landroid/view/View;

    .line 343
    .line 344
    if-eqz p1, :cond_18

    .line 345
    .line 346
    const p2, 0x240901ce

    .line 347
    .line 348
    .line 349
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 350
    .line 351
    .line 352
    move-result-object p1

    .line 353
    check-cast p1, Landroid/widget/TextView;

    .line 354
    .line 355
    const-wide p2, -0x36a56e5d051405a7L    # -2.370024463590436E45

    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    invoke-static {p2, p3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object p2

    .line 364
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 365
    .line 366
    .line 367
    :cond_18
    if-eqz v4, :cond_19

    .line 368
    .line 369
    invoke-virtual {v4, v5}, Landroid/view/View;->setClickable(Z)V

    .line 370
    .line 371
    .line 372
    :cond_19
    new-instance p1, Landroid/graphics/drawable/GradientDrawable;

    .line 373
    .line 374
    invoke-direct {p1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 375
    .line 376
    .line 377
    invoke-virtual {p0}, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲()Landroid/content/Context;

    .line 378
    .line 379
    .line 380
    move-result-object p0

    .line 381
    const p2, 0x2406048c

    .line 382
    .line 383
    .line 384
    invoke-virtual {p0, p2}, Landroid/content/Context;->getColor(I)I

    .line 385
    .line 386
    .line 387
    move-result p0

    .line 388
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 389
    .line 390
    .line 391
    const/16 p0, 0x82

    .line 392
    .line 393
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/GradientDrawable;->setAlpha(I)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v2, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 397
    .line 398
    .line 399
    goto :goto_7

    .line 400
    :cond_1a
    if-eqz v7, :cond_1b

    .line 401
    .line 402
    invoke-virtual {v7, p3}, Landroid/view/View;->setVisibility(I)V

    .line 403
    .line 404
    .line 405
    :cond_1b
    iput-object v0, p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏兰世哲:L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;

    .line 406
    .line 407
    invoke-virtual {v0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->getExceptionCollectionToolInstance()L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;

    .line 408
    .line 409
    .line 410
    move-result-object p3

    .line 411
    iget-object p3, p3, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 412
    .line 413
    if-nez p3, :cond_1c

    .line 414
    .line 415
    goto :goto_6

    .line 416
    :cond_1c
    invoke-virtual {p3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 417
    .line 418
    .line 419
    move-result p3

    .line 420
    xor-int/lit8 v5, p3, 0x1

    .line 421
    .line 422
    :goto_6
    if-eqz v5, :cond_1d

    .line 423
    .line 424
    if-eqz v3, :cond_1d

    .line 425
    .line 426
    invoke-virtual {p0}, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲()Landroid/content/Context;

    .line 427
    .line 428
    .line 429
    move-result-object p2

    .line 430
    const p3, 0x2406048a

    .line 431
    .line 432
    .line 433
    invoke-virtual {p2, p3}, Landroid/content/Context;->getColor(I)I

    .line 434
    .line 435
    .line 436
    move-result p2

    .line 437
    invoke-virtual {v3, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 438
    .line 439
    .line 440
    :cond_1d
    if-eqz v4, :cond_1e

    .line 441
    .line 442
    new-instance p2, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世苏兰哲;

    .line 443
    .line 444
    invoke-direct {p2, v0, p1, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世苏兰哲;-><init>(L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲世兰;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v4, p2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 448
    .line 449
    .line 450
    :cond_1e
    :goto_7
    return-void

    .line 451
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪世苏兰哲(Landroid/content/Context;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;
    .locals 5

    .line 1
    iget p0, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-wide v1, -0x36a57cd4051405a7L    # -2.364984201171603E45

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    const-wide v3, -0x36a538e5051405a7L    # -2.3886556037440912E45

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    packed-switch p0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const p1, 0x240c00a9

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    new-instance p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世哲兰;

    .line 35
    .line 36
    new-instance p2, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-direct {p2, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;-><init>(Landroid/view/View;)V

    .line 42
    .line 43
    .line 44
    invoke-direct {p1, p2}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世哲兰;-><init>(L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;)V

    .line 45
    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_0
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    const p1, 0x240c0060

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, p1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    new-instance p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世兰哲苏;

    .line 66
    .line 67
    new-instance p2, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;

    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-direct {p2, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;-><init>(Landroid/view/View;)V

    .line 73
    .line 74
    .line 75
    invoke-direct {p1, p2}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世兰哲苏;-><init>(L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;)V

    .line 76
    .line 77
    .line 78
    return-object p1

    .line 79
    :pswitch_1
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    const p1, 0x240c0058

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, p1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    new-instance p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世哲兰苏;

    .line 97
    .line 98
    new-instance p2, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;

    .line 99
    .line 100
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-direct {p2, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;-><init>(Landroid/view/View;)V

    .line 104
    .line 105
    .line 106
    invoke-direct {p1, p2}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世哲兰苏;-><init>(L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;)V

    .line 107
    .line 108
    .line 109
    return-object p1

    .line 110
    :pswitch_2
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    const p1, 0x240c007c

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, p1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    new-instance p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;

    .line 128
    .line 129
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-direct {p1, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;-><init>(Landroid/view/View;)V

    .line 133
    .line 134
    .line 135
    new-instance p2, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;

    .line 136
    .line 137
    const/16 v0, 0x8

    .line 138
    .line 139
    invoke-direct {p2, p1, v0}, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 143
    .line 144
    .line 145
    new-instance p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世兰苏哲;

    .line 146
    .line 147
    invoke-direct {p0, p1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世兰苏哲;-><init>(L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;)V

    .line 148
    .line 149
    .line 150
    return-object p0

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge 飘花落叶言子楪世苏哲兰(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;ILjava/lang/Object;Ljava/util/List;)V
    .locals 1

    .line 1
    iget v0, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世哲兰;

    .line 7
    .line 8
    invoke-super {p0, p1, p2, p3, p4}, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;ILjava/lang/Object;Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    check-cast p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世兰哲苏;

    .line 13
    .line 14
    invoke-super {p0, p1, p2, p3, p4}, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;ILjava/lang/Object;Ljava/util/List;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_1
    check-cast p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世哲兰苏;

    .line 19
    .line 20
    invoke-super {p0, p1, p2, p3, p4}, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;ILjava/lang/Object;Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_2
    check-cast p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世兰苏哲;

    .line 25
    .line 26
    invoke-super {p0, p1, p2, p3, p4}, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;ILjava/lang/Object;Ljava/util/List;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
