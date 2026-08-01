.class public final synthetic Lcl0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;

.field public final synthetic ι:Ljava/lang/Object;

.field public final synthetic κ:Landroid/view/KeyEvent$Callback;

.field public final synthetic λ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lt72;Landroid/widget/ProgressBar;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput v0, p0, Lcl0;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcl0;->ζ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lcl0;->η:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lcl0;->θ:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lcl0;->κ:Landroid/view/KeyEvent$Callback;

    .line 14
    .line 15
    iput-object p5, p0, Lcl0;->ι:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p6, p0, Lcl0;->λ:Ljava/lang/Object;

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/KeyEvent$Callback;Ljava/lang/Object;I)V
    .locals 0

    .line 20
    iput p7, p0, Lcl0;->ε:I

    iput-object p1, p0, Lcl0;->ζ:Ljava/lang/Object;

    iput-object p2, p0, Lcl0;->η:Ljava/lang/Object;

    iput-object p3, p0, Lcl0;->θ:Ljava/lang/Object;

    iput-object p4, p0, Lcl0;->ι:Ljava/lang/Object;

    iput-object p5, p0, Lcl0;->κ:Landroid/view/KeyEvent$Callback;

    iput-object p6, p0, Lcl0;->λ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcl0;->ε:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, v0, Lcl0;->λ:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v5, v0, Lcl0;->ι:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v6, v0, Lcl0;->κ:Landroid/view/KeyEvent$Callback;

    .line 12
    .line 13
    iget-object v7, v0, Lcl0;->θ:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v8, v0, Lcl0;->η:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v0, v0, Lcl0;->ζ:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object v11, v0

    .line 23
    check-cast v11, Landroid/app/Activity;

    .line 24
    .line 25
    move-object v10, v8

    .line 26
    check-cast v10, Lt72;

    .line 27
    .line 28
    move-object v13, v7

    .line 29
    check-cast v13, Landroid/widget/ProgressBar;

    .line 30
    .line 31
    move-object v12, v6

    .line 32
    check-cast v12, Landroid/widget/TextView;

    .line 33
    .line 34
    move-object v14, v5

    .line 35
    check-cast v14, Landroid/widget/Button;

    .line 36
    .line 37
    move-object v15, v4

    .line 38
    check-cast v15, Landroid/widget/Button;

    .line 39
    .line 40
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    sget-object v0, Lu72;->η:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 50
    .line 51
    invoke-virtual {v0, v3, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {v13, v3}, Landroid/view/View;->setVisibility(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v12, v3}, Landroid/view/View;->setVisibility(I)V

    .line 62
    .line 63
    .line 64
    const-string v0, "\u51c6\u5907\u4e0b\u8f7d..."

    .line 65
    .line 66
    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v14, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v15, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 73
    .line 74
    .line 75
    new-instance v0, Ljava/lang/Thread;

    .line 76
    .line 77
    new-instance v9, Lrt1;

    .line 78
    .line 79
    const/16 v16, 0x1

    .line 80
    .line 81
    invoke-direct/range {v9 .. v16}, Lrt1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroid/widget/TextView;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;I)V

    .line 82
    .line 83
    .line 84
    const-string v1, "DY-VersionUpdateDownload"

    .line 85
    .line 86
    invoke-direct {v0, v9, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 90
    .line 91
    .line 92
    :goto_0
    return-void

    .line 93
    :pswitch_0
    check-cast v0, Landroid/app/Activity;

    .line 94
    .line 95
    move-object v10, v8

    .line 96
    check-cast v10, Ljava/util/List;

    .line 97
    .line 98
    move-object v11, v7

    .line 99
    check-cast v11, Lzc0;

    .line 100
    .line 101
    move-object v12, v5

    .line 102
    check-cast v12, Ljava/util/LinkedHashMap;

    .line 103
    .line 104
    move-object v13, v6

    .line 105
    check-cast v13, Landroid/widget/TextView;

    .line 106
    .line 107
    move-object v14, v4

    .line 108
    check-cast v14, Landroid/widget/TextView;

    .line 109
    .line 110
    sget-object v1, Lbv1;->α:Lbv1;

    .line 111
    .line 112
    new-instance v9, Lvb0;

    .line 113
    .line 114
    const/4 v15, 0x3

    .line 115
    invoke-direct/range {v9 .. v15}, Lvb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 116
    .line 117
    .line 118
    const-string v1, "\u786e\u8ba4\u6e05\u7a7a\u7b5b\u9009"

    .line 119
    .line 120
    const-string v2, "\u5c06\u8be5\u9875\u5168\u90e8\u6062\u590d\u4e3a\u663e\u793a\u72b6\u6001\uff0c\u4e0d\u4f1a\u89e6\u53d1 DexKit \u626b\u63cf\uff0c\u4ec5\u6e05\u9664\u5f53\u524d\u8fc7\u6ee4\u914d\u7f6e\u3002"

    .line 121
    .line 122
    const-string v3, "\u6e05\u7a7a"

    .line 123
    .line 124
    invoke-static {v0, v1, v2, v3, v9}, Lbv1;->Μ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :pswitch_1
    check-cast v0, Lum1;

    .line 129
    .line 130
    check-cast v8, Ljava/lang/String;

    .line 131
    .line 132
    check-cast v7, Landroid/widget/RadioGroup;

    .line 133
    .line 134
    check-cast v5, Landroid/widget/RadioButton;

    .line 135
    .line 136
    check-cast v6, Landroid/app/Activity;

    .line 137
    .line 138
    check-cast v4, Lxx;

    .line 139
    .line 140
    iput-object v8, v0, Lum1;->ε:Ljava/lang/Object;

    .line 141
    .line 142
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    invoke-virtual {v7, v0}, Landroid/widget/RadioGroup;->check(I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    invoke-static {v7, v6, v4, v0}, Lpf1;->ι(Landroid/widget/RadioGroup;Landroid/app/Activity;Lxx;I)V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :pswitch_2
    check-cast v0, Lum1;

    .line 158
    .line 159
    check-cast v8, Lud1;

    .line 160
    .line 161
    check-cast v7, Landroid/widget/RadioGroup;

    .line 162
    .line 163
    check-cast v5, Landroid/widget/RadioButton;

    .line 164
    .line 165
    check-cast v6, Landroid/app/Activity;

    .line 166
    .line 167
    check-cast v4, Lxx;

    .line 168
    .line 169
    iget-object v1, v8, Lud1;->α:Lvd1;

    .line 170
    .line 171
    iput-object v1, v0, Lum1;->ε:Ljava/lang/Object;

    .line 172
    .line 173
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    invoke-virtual {v7, v0}, Landroid/widget/RadioGroup;->check(I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    invoke-static {v7, v6, v4, v0}, Lxd1;->π(Landroid/widget/RadioGroup;Landroid/app/Activity;Lxx;I)V

    .line 185
    .line 186
    .line 187
    iget-object v0, v1, Lvd1;->α:Ltd;

    .line 188
    .line 189
    iget-object v1, v1, Lvd1;->β:Ljava/lang/Integer;

    .line 190
    .line 191
    new-instance v2, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    const-string v3, "\u79cd\u5b50\u9009\u9879\u5df2\u9009\u62e9 mode="

    .line 194
    .line 195
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    const-string v0, " seedId="

    .line 202
    .line 203
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    const/4 v1, 0x0

    .line 214
    const/4 v2, 0x4

    .line 215
    const-string v3, "r50ae750e12c684f0"

    .line 216
    .line 217
    invoke-static {v3, v0, v1, v2, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    return-void

    .line 221
    :pswitch_3
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 222
    .line 223
    check-cast v8, Ljava/util/ArrayList;

    .line 224
    .line 225
    check-cast v7, Ljava/util/ArrayList;

    .line 226
    .line 227
    check-cast v5, Ljava/util/ArrayList;

    .line 228
    .line 229
    check-cast v6, Landroid/widget/TextView;

    .line 230
    .line 231
    check-cast v4, Landroid/widget/TextView;

    .line 232
    .line 233
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 238
    .line 239
    .line 240
    move-result v9

    .line 241
    if-eq v1, v9, :cond_1

    .line 242
    .line 243
    goto :goto_1

    .line 244
    :cond_1
    move v2, v3

    .line 245
    :goto_1
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 246
    .line 247
    .line 248
    if-eqz v2, :cond_2

    .line 249
    .line 250
    invoke-static {v8}, Lyh;->Κ(Ljava/util/Collection;)Lxm0;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    invoke-static {v0, v1}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 255
    .line 256
    .line 257
    :cond_2
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    if-eqz v1, :cond_4

    .line 266
    .line 267
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    check-cast v1, Landroid/view/View;

    .line 272
    .line 273
    if-eqz v2, :cond_3

    .line 274
    .line 275
    move v7, v3

    .line 276
    goto :goto_3

    .line 277
    :cond_3
    const/16 v7, 0x8

    .line 278
    .line 279
    :goto_3
    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 280
    .line 281
    .line 282
    goto :goto_2

    .line 283
    :cond_4
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    if-eqz v1, :cond_6

    .line 292
    .line 293
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    check-cast v1, Landroid/widget/ImageView;

    .line 298
    .line 299
    if-eqz v2, :cond_5

    .line 300
    .line 301
    const v3, 0x3f333333    # 0.7f

    .line 302
    .line 303
    .line 304
    goto :goto_5

    .line 305
    :cond_5
    const/high16 v3, 0x3f800000    # 1.0f

    .line 306
    .line 307
    :goto_5
    invoke-virtual {v1, v3}, Landroid/view/View;->setAlpha(F)V

    .line 308
    .line 309
    .line 310
    goto :goto_4

    .line 311
    :cond_6
    if-eqz v2, :cond_7

    .line 312
    .line 313
    const-string v0, "\u53d6\u6d88"

    .line 314
    .line 315
    goto :goto_6

    .line 316
    :cond_7
    const-string v0, "\u5168\u9009"

    .line 317
    .line 318
    :goto_6
    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    if-eqz v2, :cond_8

    .line 326
    .line 327
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 328
    .line 329
    .line 330
    move-result v1

    .line 331
    const-string v2, " / "

    .line 332
    .line 333
    const-string v3, " \u5f20"

    .line 334
    .line 335
    const-string v5, "\u5df2\u9009 "

    .line 336
    .line 337
    invoke-static {v5, v0, v2, v1, v3}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    goto :goto_7

    .line 342
    :cond_8
    const-string v1, "\u9009\u62e9\u56fe\u7247\uff08\u5171 "

    .line 343
    .line 344
    const-string v2, " \u5f20\uff09"

    .line 345
    .line 346
    invoke-static {v1, v0, v2}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    :goto_7
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 351
    .line 352
    .line 353
    return-void

    .line 354
    nop

    .line 355
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
