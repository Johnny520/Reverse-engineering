.class public final synthetic Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 9

    .line 1
    iget v0, p0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object v4, p0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世苏哲兰;

    .line 14
    .line 15
    check-cast v4, Ltop/suzhelan/plugin/sdk/online/entity/Message;

    .line 16
    .line 17
    iget-object p0, p0, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰世哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 18
    .line 19
    check-cast p0, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 20
    .line 21
    invoke-virtual {p0, v4}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0

    .line 31
    :pswitch_0
    check-cast p0, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世苏哲兰;

    .line 32
    .line 33
    check-cast v4, Ltop/suzhelan/sticker/sdk/entity/OnlineStickerInfo;

    .line 34
    .line 35
    iget-object p0, p0, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰世哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 36
    .line 37
    if-eqz p0, :cond_0

    .line 38
    .line 39
    invoke-interface {p0, v4}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    :cond_0
    return v3

    .line 43
    :pswitch_1
    check-cast p0, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 44
    .line 45
    check-cast v4, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;

    .line 46
    .line 47
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getBindingAdapterPosition()I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    const/4 v0, -0x1

    .line 52
    if-ne p0, v0, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget-object v0, v4, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏:L飘花落叶言楪世兰子哲苏/飘花落叶言子楪世兰苏哲;

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    invoke-interface {v0, v4, p1, p0}, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;Landroid/view/View;I)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 68
    :goto_1
    return p0

    .line 69
    :pswitch_2
    check-cast p0, Landroid/app/Activity;

    .line 70
    .line 71
    check-cast v4, Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {p0, v4}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰(Landroid/content/Context;Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    const-wide p0, -0x36a5169d051405a7L    # -2.4006008759524838E45

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    return v3

    .line 89
    :pswitch_3
    check-cast p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰世哲;

    .line 90
    .line 91
    check-cast v4, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;

    .line 92
    .line 93
    new-instance p1, Landroid/widget/LinearLayout;

    .line 94
    .line 95
    iget-object v0, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰:L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;

    .line 96
    .line 97
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-direct {p1, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 102
    .line 103
    .line 104
    const/16 v5, 0x11

    .line 105
    .line 106
    invoke-virtual {p1, v5}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 107
    .line 108
    .line 109
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 110
    .line 111
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    invoke-static {v6}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Landroid/content/Context;)I

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    div-int/2addr v6, v2

    .line 120
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    invoke-static {v7}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Landroid/content/Context;)I

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    div-int/2addr v7, v2

    .line 129
    invoke-direct {v5, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 130
    .line 131
    .line 132
    new-instance v6, Landroid/widget/ImageView;

    .line 133
    .line 134
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    invoke-direct {v6, v7}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, v6, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 142
    .line 143
    .line 144
    sget-object v5, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 145
    .line 146
    invoke-static {v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Landroid/content/Context;)Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    new-instance v7, Ljava/io/File;

    .line 151
    .line 152
    iget-object v8, v4, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 153
    .line 154
    invoke-direct {v7, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v5, v7}, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/io/File;)Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    invoke-virtual {v5}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏()Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    check-cast v5, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 166
    .line 167
    invoke-virtual {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪兰哲(Landroid/widget/ImageView;)V

    .line 168
    .line 169
    .line 170
    iget-object v5, v0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰苏世:Ljava/util/HashSet;

    .line 171
    .line 172
    invoke-virtual {v5, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    new-instance v5, Landroid/app/AlertDialog$Builder;

    .line 176
    .line 177
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-static {v0}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏(Landroid/content/Context;)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-eqz v0, :cond_3

    .line 190
    .line 191
    move v1, v2

    .line 192
    :cond_3
    invoke-direct {v5, v6, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    .line 193
    .line 194
    .line 195
    const-wide v0, -0x36a52116051405a7L    # -2.3969516878496237E45

    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-virtual {v5, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    const-wide v0, -0x36a50c6f051405a7L    # -2.4041479793452677E45

    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    new-instance v1, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世哲兰苏;

    .line 222
    .line 223
    invoke-direct {v1, p0, v4}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世哲兰苏;-><init>(L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰世哲;L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 231
    .line 232
    .line 233
    return v3

    .line 234
    :pswitch_4
    check-cast p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;

    .line 235
    .line 236
    check-cast v4, Ljava/lang/String;

    .line 237
    .line 238
    new-instance p1, Landroid/widget/EditText;

    .line 239
    .line 240
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-direct {p1, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 248
    .line 249
    .line 250
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 251
    .line 252
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    invoke-direct {v0, v5, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    .line 257
    .line 258
    .line 259
    const-wide v5, -0x36a5211e051405a7L    # -2.3969407988138822E45

    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    const-wide v5, -0x36a5211b051405a7L    # -2.3969448822022852E45

    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    new-instance v5, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世兰哲苏;

    .line 286
    .line 287
    invoke-direct {v5, p0, v4, p1, v2}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0, v1, v5}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 295
    .line 296
    .line 297
    return v3

    .line 298
    :pswitch_5
    check-cast p0, Llin/xposed/hook/javaplugin/view/PluginItemView;

    .line 299
    .line 300
    check-cast v4, Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 301
    .line 302
    invoke-static {p0, v4, p1}, Llin/xposed/hook/javaplugin/view/PluginItemView;->飘花落叶言子楪世苏哲兰(Llin/xposed/hook/javaplugin/view/PluginItemView;Llin/xposed/hook/javaplugin/bean/PluginInfo;Landroid/view/View;)Z

    .line 303
    .line 304
    .line 305
    move-result p0

    .line 306
    return p0

    .line 307
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
