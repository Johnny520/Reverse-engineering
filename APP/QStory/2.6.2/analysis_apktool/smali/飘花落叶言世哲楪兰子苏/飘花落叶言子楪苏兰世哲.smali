.class public final L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰世哲;
.super L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪苏哲世兰:L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;


# direct methods
.method public constructor <init>(L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iput-object p1, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰:L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p2}, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;-><init>(Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    const p1, 0x240c005c

    .line 10
    .line 11
    .line 12
    iput p1, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲:I

    .line 13
    .line 14
    new-instance p1, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世苏哲兰;

    .line 15
    .line 16
    invoke-direct {p1, p0}, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰世哲;)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰:L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Landroid/util/SparseArray;

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    invoke-virtual {p0, p2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰苏世哲(L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世兰苏哲;Ljava/lang/Object;)V
    .locals 12

    .line 1
    check-cast p2, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object p1, p1, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 4
    .line 5
    check-cast p1, Landroid/widget/LinearLayout;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰:L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-object v3, v1, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰苏世:Ljava/util/HashSet;

    .line 21
    .line 22
    invoke-static {v2}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Landroid/content/Context;)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v4, 0x5

    .line 27
    div-int/2addr v2, v4

    .line 28
    add-int/lit8 v2, v2, 0x14

    .line 29
    .line 30
    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;

    .line 50
    .line 51
    new-instance v2, Landroid/widget/ImageView;

    .line 52
    .line 53
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-direct {v2, v5}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 58
    .line 59
    .line 60
    sget-object v5, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 61
    .line 62
    invoke-virtual {v2, v5}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 63
    .line 64
    .line 65
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 66
    .line 67
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-static {v6}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Landroid/content/Context;)I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    div-int/2addr v6, v4

    .line 76
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    invoke-static {v7}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Landroid/content/Context;)I

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    div-int/2addr v7, v4

    .line 85
    invoke-direct {v5, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-static {v6}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Landroid/content/Context;)I

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    div-int/2addr v6, v4

    .line 97
    div-int/2addr v6, v4

    .line 98
    const/4 v7, 0x0

    .line 99
    const/16 v8, 0xa

    .line 100
    .line 101
    invoke-virtual {v5, v6, v8, v7, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 102
    .line 103
    .line 104
    iget v6, v0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 105
    .line 106
    const/4 v7, 0x1

    .line 107
    const/4 v8, 0x2

    .line 108
    if-ne v6, v7, :cond_0

    .line 109
    .line 110
    sget-object v6, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 111
    .line 112
    invoke-static {v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Landroid/content/Context;)Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    new-instance v7, Ljava/io/File;

    .line 117
    .line 118
    iget-object v9, v0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 119
    .line 120
    invoke-direct {v7, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/io/File;)Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    invoke-virtual {v6}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏()Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    check-cast v6, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 132
    .line 133
    invoke-virtual {v6, v2}, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪兰哲(Landroid/widget/ImageView;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v3, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    new-instance v6, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世哲兰;

    .line 140
    .line 141
    invoke-direct {v6, p0, v8, v0}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v6}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_0
    if-ne v6, v8, :cond_2

    .line 149
    .line 150
    const/4 v6, 0x0

    .line 151
    :try_start_0
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 152
    .line 153
    .line 154
    move-result v7
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 155
    const-class v8, Landroid/graphics/drawable/Drawable;

    .line 156
    .line 157
    const v9, 0x240800d3

    .line 158
    .line 159
    .line 160
    if-eqz v7, :cond_1

    .line 161
    .line 162
    :try_start_1
    sget-object v7, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 163
    .line 164
    invoke-static {v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Landroid/content/Context;)Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    new-instance v10, Ljava/net/URL;

    .line 169
    .line 170
    iget-object v11, v0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 171
    .line 172
    invoke-direct {v10, v11}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;)Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    invoke-virtual {v7, v10}, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏兰楪哲(Ljava/lang/Object;)Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    invoke-virtual {v7, v9}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏(I)Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    check-cast v7, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 188
    .line 189
    invoke-virtual {v7}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏()Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 190
    .line 191
    .line 192
    move-result-object v7

    .line 193
    check-cast v7, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 194
    .line 195
    invoke-virtual {v7, v2}, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪兰哲(Landroid/widget/ImageView;)V

    .line 196
    .line 197
    .line 198
    goto :goto_1

    .line 199
    :catch_0
    move-exception v6

    .line 200
    goto :goto_2

    .line 201
    :cond_1
    sget-object v7, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 202
    .line 203
    invoke-static {v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Landroid/content/Context;)Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 204
    .line 205
    .line 206
    move-result-object v7

    .line 207
    new-instance v10, Ljava/net/URL;

    .line 208
    .line 209
    invoke-direct {v10, v6}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;)Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 213
    .line 214
    .line 215
    move-result-object v7

    .line 216
    invoke-virtual {v7, v10}, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏兰楪哲(Ljava/lang/Object;)Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    invoke-virtual {v7, v9}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏(I)Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 221
    .line 222
    .line 223
    move-result-object v7

    .line 224
    check-cast v7, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 225
    .line 226
    invoke-virtual {v7}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏()Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    check-cast v7, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 231
    .line 232
    invoke-virtual {v7, v2}, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪兰哲(Landroid/widget/ImageView;)V

    .line 233
    .line 234
    .line 235
    :goto_1
    invoke-virtual {v3, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    :try_end_1
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_0

    .line 239
    .line 240
    .line 241
    goto :goto_3

    .line 242
    :goto_2
    invoke-virtual {v6}, Ljava/lang/Throwable;->printStackTrace()V

    .line 243
    .line 244
    .line 245
    :cond_2
    :goto_3
    invoke-virtual {p1, v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 246
    .line 247
    .line 248
    new-instance v5, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;

    .line 249
    .line 250
    invoke-direct {v5, p0, v4, v0}, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v2, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 254
    .line 255
    .line 256
    goto/16 :goto_0

    .line 257
    .line 258
    :cond_3
    return-void
.end method
