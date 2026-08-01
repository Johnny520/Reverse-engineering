.class public final synthetic L飘花落叶言世哲苏兰楪子/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世哲苏:Ljava/lang/String;

.field public final synthetic 飘花落叶言子楪兰世苏哲:Ljava/io/File;

.field public final synthetic 飘花落叶言子楪兰苏世哲:Landroid/graphics/drawable/GradientDrawable;

.field public final synthetic 飘花落叶言子楪兰苏哲世:Landroid/graphics/drawable/GradientDrawable;

.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroid/app/Dialog;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Landroid/widget/LinearLayout;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Landroid/app/Dialog;Landroid/widget/LinearLayout;Ljava/io/File;Ljava/lang/String;Landroid/graphics/drawable/GradientDrawable;Landroid/graphics/drawable/GradientDrawable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Landroid/app/Dialog;

    .line 7
    .line 8
    iput-object p3, p0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:Landroid/widget/LinearLayout;

    .line 9
    .line 10
    iput-object p4, p0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:Ljava/io/File;

    .line 11
    .line 12
    iput-object p5, p0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲:Landroid/graphics/drawable/GradientDrawable;

    .line 15
    .line 16
    iput-object p7, p0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:Landroid/graphics/drawable/GradientDrawable;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Landroid/widget/TextView;

    .line 4
    .line 5
    iget-object v2, v0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/content/Context;

    .line 6
    .line 7
    invoke-direct {v1, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    new-instance v3, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-wide v4, -0x36a53daa051405a7L    # -2.3869936646640493E45

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    sget-object v4, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    const-wide v3, -0x36a53d97051405a7L    # -2.3870195261239353E45

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 53
    .line 54
    .line 55
    const/high16 v3, 0x41200000    # 10.0f

    .line 56
    .line 57
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 58
    .line 59
    .line 60
    new-instance v3, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;

    .line 61
    .line 62
    iget-object v4, v0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Landroid/app/Dialog;

    .line 63
    .line 64
    const/4 v5, 0x7

    .line 65
    invoke-direct {v3, v4, v5, v2}, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 69
    .line 70
    .line 71
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 72
    .line 73
    const/4 v6, -0x1

    .line 74
    const/4 v7, -0x2

    .line 75
    invoke-direct {v3, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 76
    .line 77
    .line 78
    const/16 v8, 0x1e

    .line 79
    .line 80
    const/16 v9, 0xa

    .line 81
    .line 82
    const/16 v10, 0xf

    .line 83
    .line 84
    const/4 v11, 0x5

    .line 85
    invoke-virtual {v3, v8, v9, v10, v11}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 86
    .line 87
    .line 88
    iget-object v12, v0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:Landroid/widget/LinearLayout;

    .line 89
    .line 90
    invoke-virtual {v12, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 91
    .line 92
    .line 93
    iget-object v1, v0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:Ljava/io/File;

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    new-instance v13, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪世苏哲兰;

    .line 104
    .line 105
    invoke-direct {v13, v5}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 106
    .line 107
    .line 108
    invoke-interface {v3, v13}, Ljava/util/List;->sort(Ljava/util/Comparator;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    const/4 v5, 0x1

    .line 116
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v13

    .line 120
    const/high16 v14, 0x41a00000    # 20.0f

    .line 121
    .line 122
    if-eqz v13, :cond_4

    .line 123
    .line 124
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v13

    .line 128
    check-cast v13, Ljava/io/File;

    .line 129
    .line 130
    const-wide v16, -0x36a53d9f051405a7L    # -2.387008637088194E45

    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    invoke-virtual {v13}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v15

    .line 139
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    invoke-virtual {v15, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v9

    .line 147
    if-eqz v9, :cond_0

    .line 148
    .line 149
    const/16 v9, 0xa

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_0
    new-instance v9, Landroid/widget/TextView;

    .line 153
    .line 154
    invoke-direct {v9, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v13}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v15

    .line 161
    invoke-virtual {v9, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 162
    .line 163
    .line 164
    invoke-static/range {v16 .. v17}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v15

    .line 168
    invoke-static {v15}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 169
    .line 170
    .line 171
    move-result v15

    .line 172
    invoke-virtual {v9, v15}, Landroid/widget/TextView;->setTextColor(I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v9, v8, v10, v10, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v9, v14}, Landroid/widget/TextView;->setTextSize(F)V

    .line 179
    .line 180
    .line 181
    new-instance v14, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪世哲兰苏;

    .line 182
    .line 183
    iget-object v15, v0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 184
    .line 185
    invoke-direct {v14, v13, v4, v2, v15}, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪世哲兰苏;-><init>(Ljava/io/File;Landroid/app/Dialog;Landroid/content/Context;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v9, v14}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v13}, Ljava/io/File;->isDirectory()Z

    .line 192
    .line 193
    .line 194
    move-result v14

    .line 195
    if-eqz v14, :cond_1

    .line 196
    .line 197
    iget-object v14, v0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲:Landroid/graphics/drawable/GradientDrawable;

    .line 198
    .line 199
    invoke-virtual {v9, v14}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 200
    .line 201
    .line 202
    :cond_1
    invoke-virtual {v13}, Ljava/io/File;->isFile()Z

    .line 203
    .line 204
    .line 205
    move-result v14

    .line 206
    if-eqz v14, :cond_2

    .line 207
    .line 208
    iget-object v14, v0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:Landroid/graphics/drawable/GradientDrawable;

    .line 209
    .line 210
    invoke-virtual {v9, v14}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 211
    .line 212
    .line 213
    :cond_2
    new-instance v14, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世兰哲;

    .line 214
    .line 215
    invoke-direct {v14, v13, v4, v2}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世兰哲;-><init>(Ljava/io/File;Landroid/app/Dialog;Landroid/content/Context;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v9, v14}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 219
    .line 220
    .line 221
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    .line 222
    .line 223
    invoke-direct {v13, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 224
    .line 225
    .line 226
    if-eqz v5, :cond_3

    .line 227
    .line 228
    move v5, v10

    .line 229
    :goto_1
    const/16 v15, 0xa

    .line 230
    .line 231
    goto :goto_2

    .line 232
    :cond_3
    const/16 v5, 0xa

    .line 233
    .line 234
    goto :goto_1

    .line 235
    :goto_2
    invoke-virtual {v13, v15, v5, v15, v11}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v12, v9, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 239
    .line 240
    .line 241
    const/4 v5, 0x0

    .line 242
    move v9, v15

    .line 243
    goto :goto_0

    .line 244
    :cond_4
    const-wide v16, -0x36a53d9f051405a7L    # -2.387008637088194E45

    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    if-eqz v5, :cond_5

    .line 250
    .line 251
    new-instance v0, Landroid/widget/TextView;

    .line 252
    .line 253
    invoke-direct {v0, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 254
    .line 255
    .line 256
    const-wide v1, -0x36a53d81051405a7L    # -2.3870494709722244E45

    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 266
    .line 267
    .line 268
    invoke-static/range {v16 .. v17}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0, v14}, Landroid/widget/TextView;->setTextSize(F)V

    .line 280
    .line 281
    .line 282
    const/16 v1, 0x11

    .line 283
    .line 284
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 285
    .line 286
    .line 287
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 288
    .line 289
    invoke-direct {v1, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v1, v8, v8, v10, v11}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 296
    .line 297
    .line 298
    :cond_5
    return-void
.end method
