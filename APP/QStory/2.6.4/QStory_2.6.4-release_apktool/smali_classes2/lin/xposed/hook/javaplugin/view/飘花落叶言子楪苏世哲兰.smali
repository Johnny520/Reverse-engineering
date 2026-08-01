.class public final synthetic Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

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
    check-cast p0, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏兰哲;

    .line 14
    .line 15
    check-cast v4, Ltop/suzhelan/sticker/sdk/entity/OnlineStickerInfo;

    .line 16
    .line 17
    iget-object p0, p0, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰世哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    invoke-interface {p0, v4}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    :cond_0
    return v3

    .line 25
    :pswitch_0
    check-cast p0, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏兰哲;

    .line 26
    .line 27
    check-cast v4, Ltop/suzhelan/plugin/sdk/online/entity/Message;

    .line 28
    .line 29
    iget-object p0, p0, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰世哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 30
    .line 31
    check-cast p0, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世哲苏兰;

    .line 32
    .line 33
    invoke-virtual {p0, v4}, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世哲苏兰;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    return p0

    .line 43
    :pswitch_1
    check-cast p0, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 44
    .line 45
    check-cast v4, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪苏世哲兰;

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
    iget-object v0, v4, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏:L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世兰苏哲;

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    invoke-interface {v0, v4, p1, p0}, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(L飘花落叶言楪世兰哲苏子/飘花落叶言子楪苏世哲兰;Landroid/view/View;I)Z

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
    check-cast p0, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏哲兰世;

    .line 70
    .line 71
    check-cast v4, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世哲兰;

    .line 72
    .line 73
    new-instance p1, Landroid/widget/LinearLayout;

    .line 74
    .line 75
    iget-object v0, p0, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲世兰:L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏兰哲世;

    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-direct {p1, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 82
    .line 83
    .line 84
    const/16 v5, 0x11

    .line 85
    .line 86
    invoke-virtual {p1, v5}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 87
    .line 88
    .line 89
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 90
    .line 91
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    invoke-static {v6}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Landroid/content/Context;)I

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    div-int/2addr v6, v2

    .line 100
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    invoke-static {v7}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Landroid/content/Context;)I

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    div-int/2addr v7, v2

    .line 109
    invoke-direct {v5, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 110
    .line 111
    .line 112
    new-instance v6, Landroid/widget/ImageView;

    .line 113
    .line 114
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    invoke-direct {v6, v7}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, v6, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 122
    .line 123
    .line 124
    sget-object v5, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 125
    .line 126
    invoke-static {v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Landroid/content/Context;)Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    new-instance v7, Ljava/io/File;

    .line 131
    .line 132
    iget-object v8, v4, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 133
    .line 134
    invoke-direct {v7, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v5, v7}, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/io/File;)Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    invoke-virtual {v5}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏()Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    check-cast v5, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 146
    .line 147
    invoke-virtual {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪兰哲(Landroid/widget/ImageView;)V

    .line 148
    .line 149
    .line 150
    iget-object v5, v0, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰苏世:Ljava/util/HashSet;

    .line 151
    .line 152
    invoke-virtual {v5, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    new-instance v5, Landroid/app/AlertDialog$Builder;

    .line 156
    .line 157
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-static {v0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏世哲(Landroid/content/Context;)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_3

    .line 170
    .line 171
    move v1, v2

    .line 172
    :cond_3
    invoke-direct {v5, v6, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    .line 173
    .line 174
    .line 175
    const/16 v0, 0x15c

    .line 176
    .line 177
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {v5, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    const-string v0, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u545c\u545c\u545c\u545c\u545c\u545c\u55b5\u545c~\u545c\u545c\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u545c\u545c\u545c\u545c\u545c\u545c\u55b5\u55b5~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u55b5"

    .line 190
    .line 191
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    new-instance v1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪世哲兰苏;

    .line 196
    .line 197
    invoke-direct {v1, p0, v4}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪世哲兰苏;-><init>(L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏哲兰世;L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世哲兰;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 205
    .line 206
    .line 207
    return v3

    .line 208
    :pswitch_3
    check-cast p0, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏兰哲世;

    .line 209
    .line 210
    check-cast v4, Ljava/lang/String;

    .line 211
    .line 212
    new-instance p1, Landroid/widget/EditText;

    .line 213
    .line 214
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-direct {p1, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 222
    .line 223
    .line 224
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 225
    .line 226
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    invoke-direct {v0, v5, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    .line 231
    .line 232
    .line 233
    const/16 v1, 0x15d

    .line 234
    .line 235
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    const-string v1, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u545c\u545c\u545c\u55b5\u55b5\u55b5\u55b5\u545c~\u545c\u545c\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c~\u545c\u545c\u545c\u545c\u55b5\u545c\u55b5\u545c~\u545c\u545c\u545c\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 248
    .line 249
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    new-instance v5, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪世兰哲苏;

    .line 254
    .line 255
    invoke-direct {v5, p0, v4, p1, v2}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0, v1, v5}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 263
    .line 264
    .line 265
    return v3

    .line 266
    :pswitch_4
    check-cast p0, Landroid/app/Activity;

    .line 267
    .line 268
    check-cast v4, Ljava/lang/String;

    .line 269
    .line 270
    invoke-static {p0, v4}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪苏哲世兰(Landroid/content/Context;Ljava/lang/String;)Z

    .line 271
    .line 272
    .line 273
    const/16 p0, 0x93

    .line 274
    .line 275
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    invoke-static {p0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    return v3

    .line 283
    :pswitch_5
    check-cast p0, Llin/xposed/hook/javaplugin/view/PluginItemView;

    .line 284
    .line 285
    check-cast v4, Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 286
    .line 287
    invoke-static {p0, v4, p1}, Llin/xposed/hook/javaplugin/view/PluginItemView;->飘花落叶言子楪世苏哲兰(Llin/xposed/hook/javaplugin/view/PluginItemView;Llin/xposed/hook/javaplugin/bean/PluginInfo;Landroid/view/View;)Z

    .line 288
    .line 289
    .line 290
    move-result p0

    .line 291
    return p0

    .line 292
    nop

    .line 293
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
