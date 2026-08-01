.class public final Ls0/I;
.super Lt0/c;
.source "SourceFile"


# instance fields
.field public final synthetic h:Ls0/J;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/util/List;


# direct methods
.method public constructor <init>(Ls0/J;Ljava/lang/String;Ljava/util/List;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls0/I;->h:Ls0/J;

    .line 2
    .line 3
    iput-object p2, p0, Ls0/I;->i:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Ls0/I;->j:Ljava/util/List;

    .line 6
    .line 7
    invoke-static {p4}, LN0/g;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-direct {p0, p4, p1}, Lt0/c;-><init>(Landroid/content/Context;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final e(Lt0/c;)Landroid/view/View;
    .locals 12

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, LO/a;->i(Ls0/I;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    sget-boolean v0, Lz0/i;->a:Z

    .line 11
    .line 12
    invoke-static {}, Lz0/g;->v()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    iget-object v2, p0, Ls0/I;->h:Ls0/J;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-static {v2}, Ls0/J;->E(Ls0/J;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move v0, v1

    .line 27
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 28
    .line 29
    .line 30
    new-instance p1, Landroid/widget/LinearLayout;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-direct {p1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 40
    .line 41
    const/4 v3, -0x1

    .line 42
    const/4 v4, -0x2

    .line 43
    invoke-direct {v0, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 44
    .line 45
    .line 46
    const/4 v5, 0x1

    .line 47
    invoke-virtual {p1, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v2}, Ls0/J;->E(Ls0/J;)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Ls0/I;->i:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v2, v0, p0}, Ls0/J;->D(Ls0/J;Ljava/lang/String;Ls0/I;)Landroid/widget/FrameLayout;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    invoke-virtual {p1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 67
    .line 68
    .line 69
    new-instance v8, Landroid/widget/ScrollView;

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-direct {v8, v6}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 76
    .line 77
    .line 78
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 79
    .line 80
    invoke-direct {v6, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v8, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v2}, Ls0/J;->E(Ls0/J;)I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    invoke-virtual {v8, v6}, Landroid/view/View;->setBackgroundColor(I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v8, v1}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 94
    .line 95
    .line 96
    new-instance v9, Landroid/widget/LinearLayout;

    .line 97
    .line 98
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-direct {v9, v6}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 103
    .line 104
    .line 105
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 106
    .line 107
    invoke-direct {v6, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v9, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v9, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 114
    .line 115
    .line 116
    const/16 v3, 0x8

    .line 117
    .line 118
    invoke-static {v3}, LB0/a;->b(I)I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    const/16 v4, 0x18

    .line 123
    .line 124
    invoke-static {v4}, LB0/a;->b(I)I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    invoke-virtual {v9, v1, v3, v1, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 129
    .line 130
    .line 131
    invoke-static {v2}, Ls0/J;->E(Ls0/J;)I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    invoke-virtual {v9, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 136
    .line 137
    .line 138
    invoke-static {v2, v0}, Ls0/J;->z(Ls0/J;Ljava/lang/String;)Landroid/widget/LinearLayout;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {v9, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2, v0}, Ls0/J;->u(Ljava/lang/String;)Landroid/widget/TextView;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-virtual {v9, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2}, Ls0/J;->q()Landroid/widget/LinearLayout;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    iget-object v3, p0, Ls0/I;->j:Ljava/util/List;

    .line 157
    .line 158
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v10

    .line 162
    :cond_2
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    if-eqz v3, :cond_3

    .line 167
    .line 168
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    move-object v11, v3

    .line 173
    check-cast v11, Ls0/G;

    .line 174
    .line 175
    iget-object v3, v11, Ls0/G;->a:Ljava/lang/String;

    .line 176
    .line 177
    iget-object v4, v11, Ls0/G;->c:LM0/a;

    .line 178
    .line 179
    invoke-interface {v4}, LM0/a;->b()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    check-cast v4, Ljava/lang/Boolean;

    .line 184
    .line 185
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    new-instance v7, LC/d;

    .line 190
    .line 191
    const/16 v4, 0xc

    .line 192
    .line 193
    invoke-direct {v7, v4, v11}, LC/d;-><init>(ILjava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    iget-object v4, v11, Ls0/G;->b:Ljava/lang/String;

    .line 197
    .line 198
    iget-object v6, v11, Ls0/G;->d:LM0/a;

    .line 199
    .line 200
    invoke-static/range {v2 .. v7}, Ls0/J;->w(Ls0/J;Ljava/lang/String;Ljava/lang/String;ZLM0/a;LC/d;)Landroid/widget/LinearLayout;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 205
    .line 206
    .line 207
    const-string v3, "\u5feb\u6377\u52a0\u5165\u540d\u5355"

    .line 208
    .line 209
    iget-object v4, v11, Ls0/G;->a:Ljava/lang/String;

    .line 210
    .line 211
    invoke-static {v4, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    if-eqz v3, :cond_2

    .line 216
    .line 217
    invoke-static {v2}, Ls0/J;->A(Ls0/J;)Landroid/widget/LinearLayout;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 222
    .line 223
    .line 224
    goto :goto_1

    .line 225
    :cond_3
    const-string v3, "\u6d88\u606f\u63d0\u9192"

    .line 226
    .line 227
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    if-eqz v3, :cond_4

    .line 232
    .line 233
    invoke-static {v2}, Ls0/J;->C(Ls0/J;)Landroid/widget/LinearLayout;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 238
    .line 239
    .line 240
    :cond_4
    const-string v3, "\u5feb\u6377\u529f\u80fd"

    .line 241
    .line 242
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    if-eqz v3, :cond_5

    .line 247
    .line 248
    invoke-static {v2}, Ls0/J;->B(Ls0/J;)Landroid/widget/LinearLayout;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 253
    .line 254
    .line 255
    :cond_5
    const-string v3, "\u670b\u53cb\u5708\u9690\u85cf"

    .line 256
    .line 257
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-eqz v0, :cond_6

    .line 262
    .line 263
    const-string v0, "\u7ba1\u7406\u9690\u85cf\u5185\u5bb9"

    .line 264
    .line 265
    const-string v3, "\u6062\u590d\u6216\u6e05\u7a7a\u5df2\u9690\u85cf\u7684\u81ea\u5df1\u670b\u53cb\u5708\u5185\u5bb9"

    .line 266
    .line 267
    invoke-virtual {v2, v0, v3}, Ls0/J;->s(Ljava/lang/String;Ljava/lang/String;)Landroid/widget/FrameLayout;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    new-instance v3, Ls0/v;

    .line 272
    .line 273
    const/4 v4, 0x7

    .line 274
    invoke-direct {v3, v2, v4}, Ls0/v;-><init>(Ls0/J;I)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 281
    .line 282
    .line 283
    :cond_6
    invoke-virtual {v9, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v8, v9}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {p1, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v2, p1}, Ls0/J;->U(Landroid/widget/LinearLayout;)Landroid/view/View;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    return-object p1
.end method
