.class public final synthetic Lsy1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lxx;


# direct methods
.method public synthetic constructor <init>(Lxx;I)V
    .locals 0

    .line 1
    iput p2, p0, Lsy1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lsy1;->ζ:Lxx;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lsy1;->ε:I

    .line 2
    .line 3
    sget-object v1, Ls62;->α:Ls62;

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object p0, p0, Lsy1;->ζ:Lxx;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lxx;->θ:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v5, p0, Lxx;->λ:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v6, p0, Lxx;->ρ:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v7, p0, Lxx;->ζ:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v8, p0, Lxx;->η:Ljava/lang/String;

    .line 23
    .line 24
    check-cast p1, Landroid/widget/TextView;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 30
    .line 31
    .line 32
    move-result v9

    .line 33
    const v10, 0x7f090359

    .line 34
    .line 35
    .line 36
    if-ne v9, v10, :cond_0

    .line 37
    .line 38
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_5

    .line 46
    .line 47
    :cond_0
    const v10, 0x7f090365

    .line 48
    .line 49
    .line 50
    if-ne v9, v10, :cond_2

    .line 51
    .line 52
    :cond_1
    :goto_0
    invoke-static {v7, p1, v3, v4}, Llz1;->ω(Ljava/lang/String;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_5

    .line 56
    .line 57
    :cond_2
    const v10, 0x7f090362

    .line 58
    .line 59
    .line 60
    if-eq v9, v10, :cond_f

    .line 61
    .line 62
    const v10, 0x7f090366

    .line 63
    .line 64
    .line 65
    if-eq v9, v10, :cond_e

    .line 66
    .line 67
    const v10, 0x7f090368

    .line 68
    .line 69
    .line 70
    if-ne v9, v10, :cond_3

    .line 71
    .line 72
    goto/16 :goto_4

    .line 73
    .line 74
    :cond_3
    const v10, 0x7f09036a

    .line 75
    .line 76
    .line 77
    if-ne v9, v10, :cond_4

    .line 78
    .line 79
    invoke-static {v6, p1, v3, v4}, Llz1;->ω(Ljava/lang/String;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 80
    .line 81
    .line 82
    goto/16 :goto_5

    .line 83
    .line 84
    :cond_4
    const v10, 0x7f090361

    .line 85
    .line 86
    .line 87
    if-ne v9, v10, :cond_5

    .line 88
    .line 89
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 94
    .line 95
    .line 96
    goto/16 :goto_5

    .line 97
    .line 98
    :cond_5
    const v8, 0x7f09035b

    .line 99
    .line 100
    .line 101
    if-eq v9, v8, :cond_d

    .line 102
    .line 103
    const v8, 0x7f090363

    .line 104
    .line 105
    .line 106
    if-ne v9, v8, :cond_6

    .line 107
    .line 108
    goto/16 :goto_3

    .line 109
    .line 110
    :cond_6
    const v8, 0x7f09035e

    .line 111
    .line 112
    .line 113
    if-ne v9, v8, :cond_7

    .line 114
    .line 115
    iget-object p0, p0, Lxx;->Β:Ljava/lang/String;

    .line 116
    .line 117
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 122
    .line 123
    .line 124
    goto/16 :goto_5

    .line 125
    .line 126
    :cond_7
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    if-eqz p0, :cond_8

    .line 131
    .line 132
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    goto :goto_1

    .line 137
    :cond_8
    move-object p0, v3

    .line 138
    :goto_1
    if-nez p0, :cond_9

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_9
    move-object v2, p0

    .line 142
    :goto_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    sparse-switch p0, :sswitch_data_0

    .line 147
    .line 148
    .line 149
    goto/16 :goto_5

    .line 150
    .line 151
    :sswitch_0
    const-string p0, "\u706b\u82b1\u597d\u53cb"

    .line 152
    .line 153
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    if-nez p0, :cond_c

    .line 158
    .line 159
    goto/16 :goto_5

    .line 160
    .line 161
    :sswitch_1
    const-string p0, "\u5237\u65b0\u6570\u636e"

    .line 162
    .line 163
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result p0

    .line 167
    if-eqz p0, :cond_f

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :sswitch_2
    const-string p0, "\u81ea\u5b9a\u4e49\u4eba\u5458\u7eed\u706b"

    .line 171
    .line 172
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result p0

    .line 176
    if-nez p0, :cond_1

    .line 177
    .line 178
    goto/16 :goto_5

    .line 179
    .line 180
    :sswitch_3
    const-string p0, "\u81ea\u5b9a\u4e49"

    .line 181
    .line 182
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result p0

    .line 186
    if-nez p0, :cond_c

    .line 187
    .line 188
    goto :goto_5

    .line 189
    :sswitch_4
    const-string p0, "\u5f85\u7eed\u671f"

    .line 190
    .line 191
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result p0

    .line 195
    if-nez p0, :cond_c

    .line 196
    .line 197
    goto :goto_5

    .line 198
    :sswitch_5
    const-string p0, "\u2726"

    .line 199
    .line 200
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result p0

    .line 204
    if-nez p0, :cond_a

    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_a
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 208
    .line 209
    .line 210
    move-result p0

    .line 211
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 212
    .line 213
    .line 214
    goto :goto_5

    .line 215
    :sswitch_6
    const-string p0, "\u21bb"

    .line 216
    .line 217
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result p0

    .line 221
    if-nez p0, :cond_b

    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_b
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 225
    .line 226
    .line 227
    move-result p0

    .line 228
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 229
    .line 230
    .line 231
    goto :goto_5

    .line 232
    :sswitch_7
    const-string p0, "\u529f\u80fd\u672a\u6fc0\u6d3b"

    .line 233
    .line 234
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result p0

    .line 238
    if-nez p0, :cond_1

    .line 239
    .line 240
    goto :goto_5

    .line 241
    :sswitch_8
    const-string p0, "\u8fd4\u56de\u6d88\u606f\u5217\u8868\u5e76\u91cd\u65b0\u8fdb\u5165"

    .line 242
    .line 243
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result p0

    .line 247
    if-nez p0, :cond_c

    .line 248
    .line 249
    goto :goto_5

    .line 250
    :cond_c
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 251
    .line 252
    .line 253
    move-result p0

    .line 254
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 255
    .line 256
    .line 257
    goto :goto_5

    .line 258
    :sswitch_9
    const-string p0, "\u4e00\u952e\u7eed\u706b\u82b1"

    .line 259
    .line 260
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result p0

    .line 264
    if-nez p0, :cond_1

    .line 265
    .line 266
    goto :goto_5

    .line 267
    :cond_d
    :goto_3
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 268
    .line 269
    .line 270
    move-result p0

    .line 271
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 272
    .line 273
    .line 274
    goto :goto_5

    .line 275
    :cond_e
    :goto_4
    invoke-static {v5, p1, v3, v4}, Llz1;->ω(Ljava/lang/String;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 276
    .line 277
    .line 278
    :cond_f
    :goto_5
    return-object v1

    .line 279
    :pswitch_0
    check-cast p1, Landroid/widget/TextView;

    .line 280
    .line 281
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    if-eqz v0, :cond_10

    .line 289
    .line 290
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    goto :goto_6

    .line 295
    :cond_10
    move-object v0, v3

    .line 296
    :goto_6
    if-nez v0, :cond_11

    .line 297
    .line 298
    goto :goto_7

    .line 299
    :cond_11
    move-object v2, v0

    .line 300
    :goto_7
    const-string v0, "\u6682\u65e0\u706b\u82b1\u6570\u636e"

    .line 301
    .line 302
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    if-eqz v0, :cond_12

    .line 307
    .line 308
    iget-object p0, p0, Lxx;->ζ:Ljava/lang/String;

    .line 309
    .line 310
    invoke-static {p0, p1, v3, v4}, Llz1;->ω(Ljava/lang/String;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 311
    .line 312
    .line 313
    goto :goto_8

    .line 314
    :cond_12
    const-string v0, "\u8bf7\u5148\u8fdb\u5165\u6d88\u606f\u9875\u9762\u6d4f\u89c8\u597d\u53cb\u5217\u8868"

    .line 315
    .line 316
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v0

    .line 320
    if-eqz v0, :cond_13

    .line 321
    .line 322
    iget-object p0, p0, Lxx;->θ:Ljava/lang/String;

    .line 323
    .line 324
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 325
    .line 326
    .line 327
    move-result p0

    .line 328
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 329
    .line 330
    .line 331
    goto :goto_8

    .line 332
    :cond_13
    iget-object p0, p0, Lxx;->η:Ljava/lang/String;

    .line 333
    .line 334
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 335
    .line 336
    .line 337
    move-result p0

    .line 338
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 339
    .line 340
    .line 341
    :goto_8
    return-object v1

    .line 342
    nop

    .line 343
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    :sswitch_data_0
    .sparse-switch
        -0x6f1be69b -> :sswitch_9
        -0x50cfe57f -> :sswitch_8
        -0x378458d9 -> :sswitch_7
        0x21bb -> :sswitch_6
        0x2726 -> :sswitch_5
        0x1765817 -> :sswitch_4
        0x1f31559 -> :sswitch_3
        0x225cad55 -> :sswitch_2
        0x26e9d417 -> :sswitch_1
        0x350ff814 -> :sswitch_0
    .end sparse-switch
.end method
