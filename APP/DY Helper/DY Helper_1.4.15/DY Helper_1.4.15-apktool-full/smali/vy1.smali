.class public final synthetic Lvy1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Lgz1;

.field public final synthetic θ:Lcu1;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lgz1;Lcu1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lvy1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lvy1;->ζ:Landroid/app/Activity;

    .line 4
    .line 5
    iput-object p2, p0, Lvy1;->η:Lgz1;

    .line 6
    .line 7
    iput-object p3, p0, Lvy1;->θ:Lcu1;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lvy1;->ε:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, v0, Lvy1;->θ:Lcu1;

    .line 7
    .line 8
    iget-object v4, v0, Lvy1;->η:Lgz1;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v1, Ljz1;->α:Ljava/util/LinkedHashSet;

    .line 14
    .line 15
    iget-object v0, v0, Lvy1;->ζ:Landroid/app/Activity;

    .line 16
    .line 17
    invoke-static {v0}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v0, v2}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    const/16 v6, 0xe

    .line 26
    .line 27
    invoke-static {v0, v6}, Ljz1;->ζ(Landroid/content/Context;I)I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    invoke-static {v0, v6}, Ljz1;->ζ(Landroid/content/Context;I)I

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    invoke-static {v0, v6}, Ljz1;->ζ(Landroid/content/Context;I)I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    const/4 v9, 0x4

    .line 40
    invoke-static {v0, v9}, Ljz1;->ζ(Landroid/content/Context;I)I

    .line 41
    .line 42
    .line 43
    move-result v10

    .line 44
    invoke-virtual {v5, v7, v8, v6, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 45
    .line 46
    .line 47
    iget-object v6, v1, Lxx;->β:Ljava/lang/String;

    .line 48
    .line 49
    const/16 v7, 0x10

    .line 50
    .line 51
    invoke-static {v7, v0, v6}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-virtual {v5, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 56
    .line 57
    .line 58
    new-instance v6, Landroid/widget/TextView;

    .line 59
    .line 60
    invoke-direct {v6, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 61
    .line 62
    .line 63
    iget-object v7, v4, Lgz1;->β:Ljava/lang/String;

    .line 64
    .line 65
    const-string v8, "\u5220\u9664 "

    .line 66
    .line 67
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 72
    .line 73
    .line 74
    const/high16 v7, 0x41700000    # 15.0f

    .line 75
    .line 76
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 77
    .line 78
    .line 79
    const/4 v7, 0x0

    .line 80
    invoke-virtual {v6, v7, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 81
    .line 82
    .line 83
    iget-object v2, v1, Lxx;->ζ:Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 90
    .line 91
    .line 92
    const/4 v2, 0x0

    .line 93
    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 97
    .line 98
    .line 99
    new-instance v6, Landroid/widget/TextView;

    .line 100
    .line 101
    invoke-direct {v6, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 102
    .line 103
    .line 104
    iget-object v8, v4, Lgz1;->η:Ljava/util/List;

    .line 105
    .line 106
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    new-instance v10, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v11, "\u7ec4\u5185 "

    .line 113
    .line 114
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v8, " \u4eba\u4f1a\u56de\u5230\u672a\u5206\u7ec4\uff0c\u4e2a\u4eba\u6d88\u606f\u914d\u7f6e\u4e0d\u4f1a\u5220\u9664\u3002"

    .line 121
    .line 122
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 130
    .line 131
    .line 132
    const/high16 v8, 0x41400000    # 12.0f

    .line 133
    .line 134
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 135
    .line 136
    .line 137
    iget-object v8, v1, Lxx;->η:Ljava/lang/String;

    .line 138
    .line 139
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    move-result v10

    .line 143
    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 144
    .line 145
    .line 146
    const/16 v10, 0x8

    .line 147
    .line 148
    invoke-static {v0, v10}, Ljz1;->ζ(Landroid/content/Context;I)I

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    invoke-virtual {v6, v2, v10, v2, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 156
    .line 157
    .line 158
    new-instance v6, Landroid/app/AlertDialog$Builder;

    .line 159
    .line 160
    invoke-direct {v6, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v6, v5}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    new-instance v6, Ldd0;

    .line 168
    .line 169
    invoke-direct {v6, v4, v0, v3, v9}, Ldd0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 170
    .line 171
    .line 172
    const-string v0, "\u5220\u9664"

    .line 173
    .line 174
    invoke-virtual {v5, v0, v6}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    const-string v3, "\u53d6\u6d88"

    .line 179
    .line 180
    invoke-virtual {v0, v3, v7}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    if-eqz v3, :cond_0

    .line 196
    .line 197
    new-instance v4, Landroid/graphics/drawable/ColorDrawable;

    .line 198
    .line 199
    invoke-direct {v4, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v3, v4}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 203
    .line 204
    .line 205
    :cond_0
    const/4 v2, -0x1

    .line 206
    invoke-virtual {v0, v2}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    if-eqz v2, :cond_1

    .line 211
    .line 212
    iget-object v1, v1, Lxx;->ρ:Ljava/lang/String;

    .line 213
    .line 214
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 219
    .line 220
    .line 221
    :cond_1
    const/4 v1, -0x2

    .line 222
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    if-eqz v0, :cond_2

    .line 227
    .line 228
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 233
    .line 234
    .line 235
    :cond_2
    return-void

    .line 236
    :pswitch_0
    sget-object v1, Ljz1;->α:Ljava/util/LinkedHashSet;

    .line 237
    .line 238
    iget-object v6, v4, Lgz1;->α:Ljava/lang/String;

    .line 239
    .line 240
    iget-object v7, v4, Lgz1;->β:Ljava/lang/String;

    .line 241
    .line 242
    iget-object v8, v4, Lgz1;->γ:Lmy1;

    .line 243
    .line 244
    iget-object v9, v4, Lgz1;->δ:Ljava/lang/String;

    .line 245
    .line 246
    iget-object v15, v4, Lgz1;->ε:Lrd;

    .line 247
    .line 248
    iget-object v1, v4, Lgz1;->η:Ljava/util/List;

    .line 249
    .line 250
    new-instance v11, Ljava/util/ArrayList;

    .line 251
    .line 252
    const/16 v4, 0xa

    .line 253
    .line 254
    invoke-static {v1, v4}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 255
    .line 256
    .line 257
    move-result v4

    .line 258
    invoke-direct {v11, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 259
    .line 260
    .line 261
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 266
    .line 267
    .line 268
    move-result v4

    .line 269
    if-eqz v4, :cond_3

    .line 270
    .line 271
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    check-cast v4, Lky1;

    .line 276
    .line 277
    sget-object v5, Lry1;->α:Lry1;

    .line 278
    .line 279
    invoke-static {v4}, Lry1;->ｐ(Lky1;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    goto :goto_0

    .line 287
    :cond_3
    new-instance v5, Lly1;

    .line 288
    .line 289
    move-object v10, v15

    .line 290
    invoke-direct/range {v5 .. v11}, Lly1;-><init>(Ljava/lang/String;Ljava/lang/String;Lmy1;Ljava/lang/String;Lrd;Ljava/util/List;)V

    .line 291
    .line 292
    .line 293
    new-instance v1, Lty1;

    .line 294
    .line 295
    const/4 v4, 0x2

    .line 296
    invoke-direct {v1, v3, v4}, Lty1;-><init>(Lcu1;I)V

    .line 297
    .line 298
    .line 299
    const-string v3, " \u7684\u9ed8\u8ba4\u89c4\u5219"

    .line 300
    .line 301
    invoke-virtual {v7, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    new-instance v4, Luy1;

    .line 306
    .line 307
    iget-object v0, v0, Lvy1;->ζ:Landroid/app/Activity;

    .line 308
    .line 309
    invoke-direct {v4, v5, v0, v1, v2}, Luy1;-><init>(Ljava/lang/Object;Landroid/app/Activity;Lp70;I)V

    .line 310
    .line 311
    .line 312
    new-instance v2, Lz7;

    .line 313
    .line 314
    const/16 v6, 0xf

    .line 315
    .line 316
    invoke-direct {v2, v5, v0, v1, v6}, Lz7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 317
    .line 318
    .line 319
    const-string v10, "\u7ec4\u5185\u4eba\u5458\u672a\u8bbe\u7f6e\u4e2a\u4eba\u8986\u76d6\u65f6\uff0c\u4f1a\u6309\u8be5\u5206\u7ec4\u89c4\u5219\u6267\u884c"

    .line 320
    .line 321
    const-string v13, "\u7ec4\u7eed\u706b\u7b56\u7565"

    .line 322
    .line 323
    const/4 v14, 0x0

    .line 324
    const/16 v16, 0x0

    .line 325
    .line 326
    move-object/from16 v18, v2

    .line 327
    .line 328
    move-object/from16 v17, v4

    .line 329
    .line 330
    move-object v11, v8

    .line 331
    move-object v12, v9

    .line 332
    move-object v8, v0

    .line 333
    move-object v9, v3

    .line 334
    invoke-static/range {v8 .. v18}, Ljz1;->ρ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lmy1;Ljava/lang/String;Ljava/lang/String;Lky1;Lrd;Lqh1;Lg80;Lp70;)V

    .line 335
    .line 336
    .line 337
    return-void

    .line 338
    nop

    .line 339
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
