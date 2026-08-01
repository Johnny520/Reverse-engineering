.class public final L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲兰世;
.super L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final synthetic 飘花落叶言子楪苏哲世兰:L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰哲世;


# direct methods
.method public constructor <init>(L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰哲世;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iput-object p1, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲世兰:L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰哲世;

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
    invoke-direct {p1, p0}, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲兰世;)V

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
    .locals 11

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
    iget-object v1, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲世兰:L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰哲世;

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-object v3, v1, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰苏世:Ljava/util/HashSet;

    .line 21
    .line 22
    invoke-static {v2}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Landroid/content/Context;)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    div-int/lit8 v2, v2, 0x5

    .line 27
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
    check-cast v0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世哲兰;

    .line 50
    .line 51
    new-instance v2, Landroid/widget/ImageView;

    .line 52
    .line 53
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-direct {v2, v4}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 58
    .line 59
    .line 60
    sget-object v4, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 61
    .line 62
    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 63
    .line 64
    .line 65
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 66
    .line 67
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-static {v5}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Landroid/content/Context;)I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    div-int/lit8 v5, v5, 0x5

    .line 76
    .line 77
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-static {v6}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Landroid/content/Context;)I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    div-int/lit8 v6, v6, 0x5

    .line 86
    .line 87
    invoke-direct {v4, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-static {v5}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Landroid/content/Context;)I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    div-int/lit8 v5, v5, 0x5

    .line 99
    .line 100
    div-int/lit8 v5, v5, 0x5

    .line 101
    .line 102
    const/4 v6, 0x0

    .line 103
    const/16 v7, 0xa

    .line 104
    .line 105
    invoke-virtual {v4, v5, v7, v6, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 106
    .line 107
    .line 108
    iget v5, v0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 109
    .line 110
    const/4 v6, 0x1

    .line 111
    const/4 v7, 0x2

    .line 112
    if-ne v5, v6, :cond_0

    .line 113
    .line 114
    sget-object v5, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 115
    .line 116
    invoke-static {v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Landroid/content/Context;)Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    new-instance v6, Ljava/io/File;

    .line 121
    .line 122
    iget-object v8, v0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 123
    .line 124
    invoke-direct {v6, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/io/File;)Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-virtual {v5}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏()Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    check-cast v5, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 136
    .line 137
    invoke-virtual {v5, v2}, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪兰哲(Landroid/widget/ImageView;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v3, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    new-instance v5, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世哲兰;

    .line 144
    .line 145
    invoke-direct {v5, p0, v7, v0}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v5}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 149
    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_0
    if-ne v5, v7, :cond_2

    .line 153
    .line 154
    const/4 v5, 0x0

    .line 155
    :try_start_0
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 156
    .line 157
    .line 158
    move-result v6
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 159
    const-class v7, Landroid/graphics/drawable/Drawable;

    .line 160
    .line 161
    const v8, 0x240800d3

    .line 162
    .line 163
    .line 164
    if-eqz v6, :cond_1

    .line 165
    .line 166
    :try_start_1
    sget-object v6, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 167
    .line 168
    invoke-static {v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Landroid/content/Context;)Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    new-instance v9, Ljava/net/URL;

    .line 173
    .line 174
    iget-object v10, v0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 175
    .line 176
    invoke-direct {v9, v10}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;)Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    invoke-virtual {v6, v9}, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏兰楪哲(Ljava/lang/Object;)Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    invoke-virtual {v6, v8}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏(I)Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    check-cast v6, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 192
    .line 193
    invoke-virtual {v6}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏()Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    check-cast v6, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 198
    .line 199
    invoke-virtual {v6, v2}, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪兰哲(Landroid/widget/ImageView;)V

    .line 200
    .line 201
    .line 202
    goto :goto_1

    .line 203
    :catch_0
    move-exception v5

    .line 204
    goto :goto_2

    .line 205
    :cond_1
    sget-object v6, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 206
    .line 207
    invoke-static {v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Landroid/content/Context;)Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 208
    .line 209
    .line 210
    move-result-object v6

    .line 211
    new-instance v9, Ljava/net/URL;

    .line 212
    .line 213
    invoke-direct {v9, v5}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;)Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    invoke-virtual {v6, v9}, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏兰楪哲(Ljava/lang/Object;)Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    invoke-virtual {v6, v8}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏(I)Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 225
    .line 226
    .line 227
    move-result-object v6

    .line 228
    check-cast v6, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 229
    .line 230
    invoke-virtual {v6}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏()Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 231
    .line 232
    .line 233
    move-result-object v6

    .line 234
    check-cast v6, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 235
    .line 236
    invoke-virtual {v6, v2}, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪兰哲(Landroid/widget/ImageView;)V

    .line 237
    .line 238
    .line 239
    :goto_1
    invoke-virtual {v3, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    invoke-virtual {v2, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    :try_end_1
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_0

    .line 243
    .line 244
    .line 245
    goto :goto_3

    .line 246
    :goto_2
    invoke-virtual {v5}, Ljava/lang/Throwable;->printStackTrace()V

    .line 247
    .line 248
    .line 249
    :cond_2
    :goto_3
    invoke-virtual {p1, v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 250
    .line 251
    .line 252
    new-instance v4, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;

    .line 253
    .line 254
    const/4 v5, 0x7

    .line 255
    invoke-direct {v4, p0, v5, v0}, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 259
    .line 260
    .line 261
    goto/16 :goto_0

    .line 262
    .line 263
    :cond_3
    return-void
.end method
