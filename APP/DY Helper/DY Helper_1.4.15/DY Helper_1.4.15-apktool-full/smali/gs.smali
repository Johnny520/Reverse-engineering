.class public final synthetic Lgs;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:I

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 14
    iput p2, p0, Lgs;->ε:I

    iput-object p3, p0, Lgs;->η:Ljava/lang/Object;

    iput p1, p0, Lgs;->ζ:I

    iput-object p4, p0, Lgs;->θ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/util/concurrent/atomic/AtomicInteger;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lgs;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lgs;->η:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lgs;->θ:Ljava/lang/Object;

    .line 10
    .line 11
    iput p3, p0, Lgs;->ζ:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, Lgs;->ε:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const-string v2, "/"

    .line 5
    .line 6
    iget-object v3, p0, Lgs;->θ:Ljava/lang/Object;

    .line 7
    .line 8
    iget v4, p0, Lgs;->ζ:I

    .line 9
    .line 10
    iget-object p0, p0, Lgs;->η:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, Landroid/app/Activity;

    .line 16
    .line 17
    check-cast v3, Lrb1;

    .line 18
    .line 19
    invoke-static {p0}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {p0, v1}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const/16 v5, 0x14

    .line 28
    .line 29
    invoke-static {p0, v5}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    const/16 v7, 0x8

    .line 34
    .line 35
    invoke-static {p0, v7}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    invoke-static {p0, v5}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    const/4 v9, 0x0

    .line 44
    invoke-virtual {v2, v6, v8, v5, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 45
    .line 46
    .line 47
    const-string v5, "\u667a\u80fd\u9009\u62e9\u53ea\u4f1a\u6bd4\u8f83\u5f53\u524d\u4f1a\u8bdd\u5df2\u89e3\u9501\u3001\u4f59\u989d\u8db3\u591f\u4e14\u4ef7\u683c\u4e0d\u8d85\u8fc7\u8be5\u503c\u7684\u79cd\u5b50\u30020 \u8868\u793a\u4e0d\u9650\u5236\u3002"

    .line 48
    .line 49
    const/high16 v6, 0x41500000    # 13.0f

    .line 50
    .line 51
    invoke-static {p0, v5, v6}, Llz1;->θ(Landroid/app/Activity;Ljava/lang/String;F)Landroid/widget/TextView;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    iget-object v6, v0, Lxx;->η:Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 62
    .line 63
    .line 64
    new-instance v6, Landroid/widget/EditText;

    .line 65
    .line 66
    invoke-direct {v6, p0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 67
    .line 68
    .line 69
    const/4 v8, 0x2

    .line 70
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setInputType(I)V

    .line 71
    .line 72
    .line 73
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-virtual {v6, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setSelectAllOnFocus(Z)V

    .line 81
    .line 82
    .line 83
    const/high16 v4, 0x41800000    # 16.0f

    .line 84
    .line 85
    invoke-virtual {v6, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 86
    .line 87
    .line 88
    iget-object v4, v0, Lxx;->ζ:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    invoke-virtual {v6, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 98
    .line 99
    .line 100
    iget-object v1, v0, Lxx;->Α:Ljava/lang/String;

    .line 101
    .line 102
    iget-object v4, v0, Lxx;->χ:Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {v7, p0, v1, v4}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v6, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 109
    .line 110
    .line 111
    const/16 v1, 0xc

    .line 112
    .line 113
    invoke-static {p0, v1}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    invoke-static {p0, v1}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    invoke-virtual {v6, v4, v9, v7, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 125
    .line 126
    .line 127
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 128
    .line 129
    const/16 v5, 0x30

    .line 130
    .line 131
    invoke-static {p0, v5}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    const/4 v7, -0x1

    .line 136
    invoke-direct {v4, v7, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 137
    .line 138
    .line 139
    invoke-static {p0, v1}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    iput v1, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 144
    .line 145
    invoke-virtual {v2, v6, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 146
    .line 147
    .line 148
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 149
    .line 150
    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 151
    .line 152
    .line 153
    const-string p0, "\u667a\u80fd\u79cd\u5b50\u4ef7\u683c\u4e0a\u9650"

    .line 154
    .line 155
    invoke-virtual {v1, p0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-virtual {p0, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    const-string v1, "\u53d6\u6d88"

    .line 164
    .line 165
    const/4 v2, 0x0

    .line 166
    invoke-virtual {p0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    const-string v1, "\u4fdd\u5b58"

    .line 171
    .line 172
    invoke-virtual {p0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    new-instance v1, Lqd1;

    .line 181
    .line 182
    invoke-direct {v1, p0, v0, v6, v3}, Lqd1;-><init>(Landroid/app/AlertDialog;Lxx;Landroid/widget/EditText;Lrb1;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0, v1}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :pswitch_0
    check-cast p0, Lwb1;

    .line 193
    .line 194
    check-cast v3, Lec1;

    .line 195
    .line 196
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-virtual {p0, v0, v3}, Lwb1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :pswitch_1
    check-cast p0, Landroid/app/Activity;

    .line 205
    .line 206
    check-cast v3, Lp3;

    .line 207
    .line 208
    sget-object v0, Lq71;->α:Lq71;

    .line 209
    .line 210
    sub-int/2addr v4, v1

    .line 211
    invoke-static {p0, v4, v3}, Lq71;->Π(Landroid/app/Activity;ILp3;)V

    .line 212
    .line 213
    .line 214
    return-void

    .line 215
    :pswitch_2
    check-cast p0, Landroid/app/Activity;

    .line 216
    .line 217
    check-cast v3, Ljava/util/List;

    .line 218
    .line 219
    sget-object v0, Lqy0;->α:Lqy0;

    .line 220
    .line 221
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    const-string v1, "\u5df2\u5b8c\u6210 "

    .line 226
    .line 227
    const-string v3, " \u9879"

    .line 228
    .line 229
    invoke-static {v1, v4, v2, v0, v3}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-static {p0, v0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    return-void

    .line 237
    :pswitch_3
    check-cast p0, Landroid/app/Activity;

    .line 238
    .line 239
    check-cast v3, Ljava/util/ArrayList;

    .line 240
    .line 241
    sget-object v0, Lqy0;->α:Lqy0;

    .line 242
    .line 243
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    const-string v1, "\u5df2\u4fdd\u5b58 "

    .line 248
    .line 249
    const-string v3, " \u5f20\u56fe\u7247\u5230\u76f8\u518c"

    .line 250
    .line 251
    invoke-static {v1, v4, v2, v0, v3}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-static {p0, v0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    return-void

    .line 259
    :pswitch_4
    check-cast p0, Landroid/app/Activity;

    .line 260
    .line 261
    check-cast v3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 262
    .line 263
    sget-object v0, Lqy0;->α:Lqy0;

    .line 264
    .line 265
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    new-instance v1, Ljava/lang/StringBuilder;

    .line 270
    .line 271
    const-string v3, "\u2705 \u6279\u91cf\u4e0b\u8f7d\u5b8c\u6210: \u6210\u529f "

    .line 272
    .line 273
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-static {p0, v0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    return-void

    .line 293
    :pswitch_5
    check-cast p0, Lhs;

    .line 294
    .line 295
    iget-object p0, p0, Lhs;->β:Lhj1;

    .line 296
    .line 297
    invoke-interface {p0, v4, v3}, Lhj1;->η(ILjava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    return-void

    .line 301
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
