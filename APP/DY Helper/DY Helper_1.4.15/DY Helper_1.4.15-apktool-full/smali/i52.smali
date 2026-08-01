.class public final synthetic Li52;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lum1;


# direct methods
.method public synthetic constructor <init>(Lum1;I)V
    .locals 0

    .line 1
    iput p2, p0, Li52;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Li52;->ζ:Lum1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Li52;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Li52;->ζ:Lum1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroid/view/ViewGroup;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto/16 :goto_1

    .line 19
    .line 20
    :cond_0
    const/4 v1, -0x2

    .line 21
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 22
    .line 23
    instance-of v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    move-object v1, v0

    .line 29
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 30
    .line 31
    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 32
    .line 33
    move-object v1, v0

    .line 34
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 35
    .line 36
    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 37
    .line 38
    move-object v1, v0

    .line 39
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 42
    .line 43
    .line 44
    move-object v1, v0

    .line 45
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 48
    .line 49
    .line 50
    :cond_1
    instance-of v1, v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 51
    .line 52
    const/16 v3, 0x11

    .line 53
    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    move-object v1, v0

    .line 57
    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 58
    .line 59
    const/16 v4, 0x9

    .line 60
    .line 61
    invoke-virtual {v1, v4}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 62
    .line 63
    .line 64
    move-object v1, v0

    .line 65
    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 66
    .line 67
    const/16 v4, 0x14

    .line 68
    .line 69
    invoke-virtual {v1, v4}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 70
    .line 71
    .line 72
    move-object v1, v0

    .line 73
    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 74
    .line 75
    const/16 v4, 0xb

    .line 76
    .line 77
    invoke-virtual {v1, v4}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 78
    .line 79
    .line 80
    move-object v1, v0

    .line 81
    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 82
    .line 83
    const/16 v4, 0x15

    .line 84
    .line 85
    invoke-virtual {v1, v4}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 86
    .line 87
    .line 88
    move-object v1, v0

    .line 89
    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 90
    .line 91
    const/4 v4, 0x1

    .line 92
    invoke-virtual {v1, v4}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 93
    .line 94
    .line 95
    move-object v1, v0

    .line 96
    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 97
    .line 98
    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 99
    .line 100
    .line 101
    move-object v1, v0

    .line 102
    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 103
    .line 104
    invoke-virtual {v1, v3}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 105
    .line 106
    .line 107
    move-object v1, v0

    .line 108
    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 109
    .line 110
    const/16 v2, 0x10

    .line 111
    .line 112
    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 113
    .line 114
    .line 115
    move-object v1, v0

    .line 116
    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 117
    .line 118
    const/16 v2, 0xd

    .line 119
    .line 120
    const/4 v4, -0x1

    .line 121
    invoke-virtual {v1, v2, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_2
    instance-of v1, v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 126
    .line 127
    if-eqz v1, :cond_3

    .line 128
    .line 129
    move-object v1, v0

    .line 130
    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 131
    .line 132
    iput v3, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_3
    instance-of v1, v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 136
    .line 137
    if-eqz v1, :cond_4

    .line 138
    .line 139
    move-object v1, v0

    .line 140
    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 141
    .line 142
    iput v3, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 143
    .line 144
    :cond_4
    :goto_0
    iget-object v1, p0, Lum1;->ε:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v1, Landroid/view/ViewGroup;

    .line 147
    .line 148
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 149
    .line 150
    .line 151
    iget-object p0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 152
    .line 153
    instance-of v0, p0, Landroid/widget/LinearLayout;

    .line 154
    .line 155
    if-eqz v0, :cond_5

    .line 156
    .line 157
    check-cast p0, Landroid/widget/LinearLayout;

    .line 158
    .line 159
    invoke-virtual {p0, v3}, Landroid/widget/LinearLayout;->setGravity(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :catchall_0
    move-exception p0

    .line 164
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    const-string v1, "\u5c45\u4e2d\u5bf9\u9f50\u5931\u8d25 - "

    .line 169
    .line 170
    const-string v2, "ra3f49bce40b36580"

    .line 171
    .line 172
    invoke-static {v1, v0, v2, p0}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 173
    .line 174
    .line 175
    :cond_5
    :goto_1
    return-void

    .line 176
    :pswitch_0
    :try_start_1
    iget-object v0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v0, Landroid/view/ViewGroup;

    .line 179
    .line 180
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    if-nez v0, :cond_6

    .line 185
    .line 186
    goto/16 :goto_3

    .line 187
    .line 188
    :cond_6
    const/4 v1, -0x2

    .line 189
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 190
    .line 191
    instance-of v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 192
    .line 193
    const/4 v2, 0x0

    .line 194
    if-eqz v1, :cond_7

    .line 195
    .line 196
    move-object v1, v0

    .line 197
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 198
    .line 199
    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 200
    .line 201
    move-object v1, v0

    .line 202
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 203
    .line 204
    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 205
    .line 206
    move-object v1, v0

    .line 207
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 208
    .line 209
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 210
    .line 211
    .line 212
    move-object v1, v0

    .line 213
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 214
    .line 215
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 216
    .line 217
    .line 218
    :cond_7
    instance-of v1, v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 219
    .line 220
    const/16 v3, 0x11

    .line 221
    .line 222
    if-eqz v1, :cond_8

    .line 223
    .line 224
    move-object v1, v0

    .line 225
    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 226
    .line 227
    const/16 v4, 0x9

    .line 228
    .line 229
    invoke-virtual {v1, v4}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 230
    .line 231
    .line 232
    move-object v1, v0

    .line 233
    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 234
    .line 235
    const/16 v4, 0x14

    .line 236
    .line 237
    invoke-virtual {v1, v4}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 238
    .line 239
    .line 240
    move-object v1, v0

    .line 241
    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 242
    .line 243
    const/16 v4, 0xb

    .line 244
    .line 245
    invoke-virtual {v1, v4}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 246
    .line 247
    .line 248
    move-object v1, v0

    .line 249
    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 250
    .line 251
    const/16 v4, 0x15

    .line 252
    .line 253
    invoke-virtual {v1, v4}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 254
    .line 255
    .line 256
    move-object v1, v0

    .line 257
    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 258
    .line 259
    const/4 v4, 0x1

    .line 260
    invoke-virtual {v1, v4}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 261
    .line 262
    .line 263
    move-object v1, v0

    .line 264
    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 265
    .line 266
    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 267
    .line 268
    .line 269
    move-object v1, v0

    .line 270
    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 271
    .line 272
    invoke-virtual {v1, v3}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 273
    .line 274
    .line 275
    move-object v1, v0

    .line 276
    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 277
    .line 278
    const/16 v2, 0x10

    .line 279
    .line 280
    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 281
    .line 282
    .line 283
    move-object v1, v0

    .line 284
    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 285
    .line 286
    const/16 v2, 0xd

    .line 287
    .line 288
    const/4 v4, -0x1

    .line 289
    invoke-virtual {v1, v2, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 290
    .line 291
    .line 292
    goto :goto_2

    .line 293
    :cond_8
    instance-of v1, v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 294
    .line 295
    if-eqz v1, :cond_9

    .line 296
    .line 297
    move-object v1, v0

    .line 298
    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 299
    .line 300
    iput v3, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 301
    .line 302
    goto :goto_2

    .line 303
    :cond_9
    instance-of v1, v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 304
    .line 305
    if-eqz v1, :cond_a

    .line 306
    .line 307
    move-object v1, v0

    .line 308
    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 309
    .line 310
    iput v3, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 311
    .line 312
    :cond_a
    :goto_2
    iget-object v1, p0, Lum1;->ε:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v1, Landroid/view/ViewGroup;

    .line 315
    .line 316
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 317
    .line 318
    .line 319
    iget-object p0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 320
    .line 321
    instance-of v0, p0, Landroid/widget/LinearLayout;

    .line 322
    .line 323
    if-eqz v0, :cond_b

    .line 324
    .line 325
    check-cast p0, Landroid/widget/LinearLayout;

    .line 326
    .line 327
    invoke-virtual {p0, v3}, Landroid/widget/LinearLayout;->setGravity(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 328
    .line 329
    .line 330
    goto :goto_3

    .line 331
    :catchall_1
    move-exception p0

    .line 332
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    const-string v1, "\u5c45\u4e2d\u5bf9\u9f50\u5931\u8d25 - "

    .line 337
    .line 338
    const-string v2, "r14983b95b84acb5"

    .line 339
    .line 340
    invoke-static {v1, v0, v2, p0}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 341
    .line 342
    .line 343
    :cond_b
    :goto_3
    return-void

    .line 344
    nop

    .line 345
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
