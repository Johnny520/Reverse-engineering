.class public final Lz8;
.super Landroid/widget/BaseAdapter;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lo8;

.field public final c:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lo8;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lz8;->c:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput-object p1, p0, Lz8;->a:Landroid/content/Context;

    .line 12
    .line 13
    iput-object p2, p0, Lz8;->b:Lo8;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lz8;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lz8;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getItemId(I)J
    .locals 0

    .line 1
    int-to-long p0, p1

    .line 2
    return-wide p0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    instance-of p3, p3, Ly8;

    .line 8
    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    check-cast p3, Ly8;

    .line 16
    .line 17
    goto/16 :goto_3

    .line 18
    .line 19
    :cond_0
    new-instance p2, Landroid/widget/LinearLayout;

    .line 20
    .line 21
    iget-object p3, p0, Lz8;->a:Landroid/content/Context;

    .line 22
    .line 23
    invoke-direct {p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    const/16 v0, 0x10

    .line 27
    .line 28
    invoke-virtual {p2, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 29
    .line 30
    .line 31
    const/high16 v0, 0x42600000    # 56.0f

    .line 32
    .line 33
    invoke-static {p3, v0}, Li5;->a0(Landroid/content/Context;F)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {p2, v1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 38
    .line 39
    .line 40
    const/high16 v1, 0x41400000    # 12.0f

    .line 41
    .line 42
    invoke-static {p3, v1}, Li5;->a0(Landroid/content/Context;F)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    const/high16 v3, 0x40c00000    # 6.0f

    .line 47
    .line 48
    invoke-static {p3, v3}, Li5;->a0(Landroid/content/Context;F)I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    const/high16 v5, 0x41200000    # 10.0f

    .line 53
    .line 54
    invoke-static {p3, v5}, Li5;->a0(Landroid/content/Context;F)I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    invoke-static {p3, v3}, Li5;->a0(Landroid/content/Context;F)I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    invoke-virtual {p2, v2, v4, v5, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 63
    .line 64
    .line 65
    new-instance v2, Landroid/graphics/drawable/StateListDrawable;

    .line 66
    .line 67
    invoke-direct {v2}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 68
    .line 69
    .line 70
    const v3, 0x10100a7

    .line 71
    .line 72
    .line 73
    filled-new-array {v3}, [I

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-static {p3}, Lu9;->o(Landroid/content/Context;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_1

    .line 82
    .line 83
    const v4, -0xd4d0c8

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    const v4, -0x100e0b

    .line 88
    .line 89
    .line 90
    :goto_0
    invoke-static {p3}, Lu9;->o(Landroid/content/Context;)Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-eqz v5, :cond_2

    .line 95
    .line 96
    const v5, -0xcaad89

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_2
    const v5, -0x3b2709

    .line 101
    .line 102
    .line 103
    :goto_1
    invoke-static {p3, v4, v5, v1}, Li5;->D1(Landroid/content/Context;IIF)Landroid/graphics/drawable/GradientDrawable;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {v2, v3, v4}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 108
    .line 109
    .line 110
    const/4 v3, 0x0

    .line 111
    new-array v4, v3, [I

    .line 112
    .line 113
    invoke-static {p3}, Lu9;->y(Landroid/content/Context;)I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    invoke-static {p3}, Lu9;->o(Landroid/content/Context;)Z

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    if-eqz v6, :cond_3

    .line 122
    .line 123
    const v6, -0xb3aea2

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_3
    const v6, -0x1c1813

    .line 128
    .line 129
    .line 130
    :goto_2
    invoke-static {p3, v5, v6, v1}, Li5;->D1(Landroid/content/Context;IIF)Landroid/graphics/drawable/GradientDrawable;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v2, v4, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p2, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 138
    .line 139
    .line 140
    new-instance v1, Landroid/widget/LinearLayout;

    .line 141
    .line 142
    invoke-direct {v1, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 143
    .line 144
    .line 145
    const/4 v2, 0x1

    .line 146
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 147
    .line 148
    .line 149
    const/high16 v4, 0x41600000    # 14.0f

    .line 150
    .line 151
    invoke-static {p3}, Lu9;->G(Landroid/content/Context;)I

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    const-string v6, ""

    .line 156
    .line 157
    invoke-static {p3, v6, v4, v5, v2}, Li5;->U1(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 162
    .line 163
    .line 164
    sget-object v5, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 165
    .line 166
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 167
    .line 168
    .line 169
    invoke-static {}, Li5;->d1()Landroid/widget/LinearLayout$LayoutParams;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    invoke-virtual {v1, v4, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 174
    .line 175
    .line 176
    const/high16 v7, 0x41300000    # 11.0f

    .line 177
    .line 178
    invoke-static {p3}, Lu9;->E(Landroid/content/Context;)I

    .line 179
    .line 180
    .line 181
    move-result v8

    .line 182
    invoke-static {p3, v6, v7, v8, v3}, Li5;->U1(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 190
    .line 191
    .line 192
    invoke-static {}, Li5;->d1()Landroid/widget/LinearLayout$LayoutParams;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    invoke-virtual {v1, v6, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 197
    .line 198
    .line 199
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 200
    .line 201
    const/4 v7, -0x2

    .line 202
    const/high16 v8, 0x3f800000    # 1.0f

    .line 203
    .line 204
    invoke-direct {v5, v3, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p2, v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 208
    .line 209
    .line 210
    const-string v1, "\u4f7f\u7528"

    .line 211
    .line 212
    invoke-static {p3, v1, v3}, Li5;->t(Landroid/content/Context;Ljava/lang/String;Z)Landroid/widget/TextView;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-virtual {v1, v2}, Landroid/view/View;->setClickable(Z)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1, v3}, Landroid/view/View;->setFocusable(Z)V

    .line 220
    .line 221
    .line 222
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 223
    .line 224
    invoke-static {p3, v0}, Li5;->a0(Landroid/content/Context;F)I

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    const/high16 v3, 0x41f00000    # 30.0f

    .line 229
    .line 230
    invoke-static {p3, v3}, Li5;->a0(Landroid/content/Context;F)I

    .line 231
    .line 232
    .line 233
    move-result p3

    .line 234
    invoke-direct {v2, v0, p3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p2, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 238
    .line 239
    .line 240
    new-instance p3, Ly8;

    .line 241
    .line 242
    invoke-direct {p3, v4, v6, v1}, Ly8;-><init>(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    :goto_3
    iget-object v0, p0, Lz8;->c:Ljava/util/ArrayList;

    .line 249
    .line 250
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    check-cast p1, Lb9;

    .line 255
    .line 256
    iget-object v0, p3, Ly8;->a:Landroid/widget/TextView;

    .line 257
    .line 258
    iget-object v1, p1, Lb9;->b:Ljava/lang/String;

    .line 259
    .line 260
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 261
    .line 262
    .line 263
    iget-object v0, p3, Ly8;->b:Landroid/widget/TextView;

    .line 264
    .line 265
    iget-object v1, p1, Lb9;->c:Ljava/lang/String;

    .line 266
    .line 267
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 268
    .line 269
    .line 270
    new-instance v0, Lu1;

    .line 271
    .line 272
    const/4 v1, 0x2

    .line 273
    invoke-direct {v0, p0, p1, v1}, Lu1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 277
    .line 278
    .line 279
    iget-object p0, p3, Ly8;->c:Landroid/widget/TextView;

    .line 280
    .line 281
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 282
    .line 283
    .line 284
    return-object p2
.end method
