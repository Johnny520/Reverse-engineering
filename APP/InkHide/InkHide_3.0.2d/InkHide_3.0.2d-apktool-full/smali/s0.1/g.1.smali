.class public final Ls0/g;
.super Ln0/b;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Li/q1;)V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Ls0/g;->c:I

    iput-object p1, p0, Ls0/g;->d:Ljava/lang/Object;

    .line 28
    invoke-direct {p0}, Ln0/b;-><init>()V

    .line 29
    sget-boolean p1, Lz0/i;->a:Z

    invoke-static {}, Lz0/g;->i()Ljava/util/ArrayList;

    move-result-object p1

    .line 30
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 31
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 32
    invoke-virtual {v1}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    const-string v0, "<get-values>(...)"

    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    .line 34
    iget-object v0, p0, Ln0/b;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 35
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 36
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public constructor <init>(Li/t;)V
    .locals 10

    const/4 v0, 0x2

    iput v0, p0, Ls0/g;->c:I

    iput-object p1, p0, Ls0/g;->d:Ljava/lang/Object;

    .line 1
    invoke-direct {p0}, Ln0/b;-><init>()V

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    sget-boolean v0, Lz0/i;->a:Z

    invoke-static {}, Lz0/g;->g()Ljava/util/Map;

    move-result-object v0

    .line 4
    invoke-static {}, Lz0/g;->f()Ljava/util/Map;

    move-result-object v1

    .line 5
    invoke-static {}, Lz0/g;->h()Ljava/util/Set;

    move-result-object v2

    .line 6
    invoke-static {v2}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    .line 7
    new-instance v3, LA0/f;

    const/16 v4, 0x13

    invoke-direct {v3, v4, p1}, LA0/f;-><init>(ILjava/lang/Object;)V

    new-instance p1, LA0/f;

    const/16 v4, 0x14

    invoke-direct {p1, v4, v3}, LA0/f;-><init>(ILjava/lang/Object;)V

    invoke-static {v2, p1}, LF0/k;->r0(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    .line 8
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 10
    move-object v5, v3

    check-cast v5, Ljava/lang/String;

    .line 11
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_0

    invoke-static {v6}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_0

    goto :goto_1

    :cond_0
    move-object v6, v4

    .line 12
    :goto_1
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    if-eqz v7, :cond_1

    invoke-static {v7}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_1

    invoke-static {v7}, Li/t;->m(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_1

    move-object v4, v7

    :cond_1
    if-nez v6, :cond_3

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    move-object v5, v4

    goto :goto_2

    :cond_3
    move-object v5, v6

    .line 13
    :goto_2
    invoke-virtual {v2, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_4

    .line 14
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 15
    invoke-interface {v2, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    :cond_4
    check-cast v4, Ljava/util/List;

    .line 17
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 18
    :cond_5
    new-instance p1, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v3

    invoke-direct {p1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 20
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 21
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_7

    invoke-static {v6}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_7

    invoke-static {v6}, Li/t;->m(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_7

    goto :goto_4

    :cond_7
    move-object v6, v4

    :goto_4
    if-eqz v6, :cond_6

    goto :goto_5

    :cond_8
    move-object v6, v4

    :goto_5
    const-string v5, ""

    if-nez v6, :cond_9

    move-object v6, v5

    .line 22
    :cond_9
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-interface {v1, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    if-eqz v8, :cond_b

    invoke-static {v8}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_b

    goto :goto_6

    :cond_b
    move-object v8, v4

    :goto_6
    if-eqz v8, :cond_a

    goto :goto_7

    :cond_c
    move-object v8, v4

    :goto_7
    if-nez v8, :cond_d

    goto :goto_8

    :cond_d
    move-object v5, v8

    .line 23
    :goto_8
    new-instance v7, Ls0/o;

    invoke-direct {v7, v6, v5, v3}, Ls0/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 24
    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 25
    :cond_e
    iget-object v0, p0, Ln0/b;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 26
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 27
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public constructor <init>(Ls0/l;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ls0/g;->c:I

    iput-object p1, p0, Ls0/g;->d:Ljava/lang/Object;

    .line 37
    invoke-direct {p0}, Ln0/b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ln0/a;ILandroid/view/ViewGroup;)V
    .locals 11

    .line 1
    const/4 p3, 0x1

    .line 2
    const/4 v0, 0x0

    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x8

    .line 5
    .line 6
    const v3, -0xe95665

    .line 7
    .line 8
    .line 9
    iget-object v4, p0, Ls0/g;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, p0, Ln0/b;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    iget v6, p0, Ls0/g;->c:I

    .line 14
    .line 15
    packed-switch v6, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v5, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    check-cast p3, Ls0/o;

    .line 23
    .line 24
    instance-of v5, p1, Ls0/p;

    .line 25
    .line 26
    if-eqz v5, :cond_6

    .line 27
    .line 28
    check-cast p1, Ls0/p;

    .line 29
    .line 30
    rem-int/lit8 p2, p2, 0x2

    .line 31
    .line 32
    check-cast v4, Li/t;

    .line 33
    .line 34
    if-nez p2, :cond_0

    .line 35
    .line 36
    iget-object p2, v4, Li/t;->a:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p2, Landroid/app/Activity;

    .line 39
    .line 40
    invoke-static {p2}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 41
    .line 42
    .line 43
    const v3, -0x25a28b

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    iget-object p2, v4, Li/t;->a:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p2, Landroid/app/Activity;

    .line 50
    .line 51
    invoke-static {p2}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-static {v2}, LB0/a;->b(I)I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    invoke-static {v4, v3, p2, v0, v2}, Li/t;->o(Li/t;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    iget-object v3, p1, Ls0/p;->c:Landroid/widget/TextView;

    .line 63
    .line 64
    invoke-virtual {v3, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 65
    .line 66
    .line 67
    iget-object p2, p3, Ls0/o;->b:Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {p2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_1

    .line 74
    .line 75
    const-string p2, "\u65e0\u6587\u5b57\u5185\u5bb9"

    .line 76
    .line 77
    :cond_1
    iget-object v4, p1, Ls0/p;->e:Landroid/widget/TextView;

    .line 78
    .line 79
    invoke-virtual {v4, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    iget-object p2, p3, Ls0/o;->c:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {p2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 85
    .line 86
    .line 87
    move-result p3

    .line 88
    if-nez p3, :cond_2

    .line 89
    .line 90
    const-string p3, "\u70b9\u51fb\u67e5\u770b\u5927\u56fe\uff0c\u957f\u6309\u53ef\u6062\u590d"

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_2
    const-string p3, "\u957f\u6309\u53ef\u6062\u590d"

    .line 94
    .line 95
    :goto_1
    iget-object v4, p1, Ls0/p;->f:Landroid/widget/TextView;

    .line 96
    .line 97
    invoke-virtual {v4, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 98
    .line 99
    .line 100
    invoke-static {p2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 101
    .line 102
    .line 103
    move-result p3

    .line 104
    if-nez p3, :cond_3

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_3
    move-object p2, v0

    .line 108
    :goto_2
    if-eqz p2, :cond_4

    .line 109
    .line 110
    new-instance p3, Ljava/io/File;

    .line 111
    .line 112
    invoke-direct {p3, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_4
    move-object p3, v0

    .line 117
    :goto_3
    iget-object p1, p1, Ls0/p;->d:Landroid/widget/ImageView;

    .line 118
    .line 119
    if-eqz p3, :cond_5

    .line 120
    .line 121
    invoke-virtual {p3}, Ljava/io/File;->exists()Z

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    if-eqz p2, :cond_5

    .line 126
    .line 127
    invoke-virtual {p3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    invoke-static {p2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 142
    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_5
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 152
    .line 153
    .line 154
    :cond_6
    :goto_4
    return-void

    .line 155
    :pswitch_0
    invoke-virtual {v5, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    check-cast p2, Ls0/i;

    .line 160
    .line 161
    instance-of v5, p1, Ls0/j;

    .line 162
    .line 163
    if-eqz v5, :cond_12

    .line 164
    .line 165
    iget-object v5, p2, Ls0/i;->a:Ljava/lang/String;

    .line 166
    .line 167
    check-cast v4, Ls0/l;

    .line 168
    .line 169
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-static {v5}, Ls0/l;->f(Ljava/lang/String;)Z

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    check-cast p1, Ls0/j;

    .line 177
    .line 178
    iget-object v6, p2, Ls0/i;->b:Ljava/lang/String;

    .line 179
    .line 180
    invoke-static {p3, v6}, LU0/i;->B0(ILjava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p3

    .line 184
    invoke-static {p3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 185
    .line 186
    .line 187
    move-result v7

    .line 188
    if-eqz v7, :cond_7

    .line 189
    .line 190
    const-string p3, "#"

    .line 191
    .line 192
    :cond_7
    iget-object v7, p1, Ls0/j;->e:Landroid/widget/TextView;

    .line 193
    .line 194
    invoke-virtual {v7, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 195
    .line 196
    .line 197
    sget-object p3, Lz0/l;->a:Landroid/util/LruCache;

    .line 198
    .line 199
    iget-object p3, p2, Ls0/i;->a:Ljava/lang/String;

    .line 200
    .line 201
    invoke-static {p3}, Lz0/l;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v8

    .line 205
    if-nez v8, :cond_8

    .line 206
    .line 207
    iget-object v8, p2, Ls0/i;->i:Ljava/lang/String;

    .line 208
    .line 209
    invoke-static {v8}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v8

    .line 217
    :cond_8
    iget-object v9, p1, Ls0/j;->c:Landroid/widget/FrameLayout;

    .line 218
    .line 219
    invoke-virtual {v9, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v7, v1}, Landroid/view/View;->setVisibility(I)V

    .line 223
    .line 224
    .line 225
    iget-object v9, p1, Ls0/j;->d:Landroid/widget/ImageView;

    .line 226
    .line 227
    invoke-virtual {v9, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 228
    .line 229
    .line 230
    invoke-static {v8}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 231
    .line 232
    .line 233
    move-result v10

    .line 234
    if-eqz v10, :cond_9

    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_9
    iget-object v10, v4, Ls0/l;->g:Ls0/f;

    .line 238
    .line 239
    invoke-virtual {v10, v8}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v10

    .line 243
    check-cast v10, Landroid/graphics/Bitmap;

    .line 244
    .line 245
    if-eqz v10, :cond_a

    .line 246
    .line 247
    invoke-virtual {v9, v10}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v9, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v7, v2}, Landroid/view/View;->setVisibility(I)V

    .line 254
    .line 255
    .line 256
    goto :goto_5

    .line 257
    :cond_a
    iget-object v1, v4, Ls0/l;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 258
    .line 259
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 260
    .line 261
    .line 262
    move-result v1

    .line 263
    if-eqz v1, :cond_b

    .line 264
    .line 265
    goto :goto_5

    .line 266
    :cond_b
    new-instance v1, LA0/r;

    .line 267
    .line 268
    const/16 v2, 0xe

    .line 269
    .line 270
    invoke-direct {v1, v4, v8, p1, v2}, LA0/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 271
    .line 272
    .line 273
    iget-object v2, v4, Ls0/l;->f:Ljava/util/concurrent/ExecutorService;

    .line 274
    .line 275
    invoke-interface {v2, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 276
    .line 277
    .line 278
    :goto_5
    iget-object v1, p1, Ls0/j;->f:Landroid/widget/TextView;

    .line 279
    .line 280
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 281
    .line 282
    .line 283
    iget-object v1, p2, Ls0/i;->c:Ljava/lang/String;

    .line 284
    .line 285
    if-eqz v5, :cond_c

    .line 286
    .line 287
    const-string v2, "\u5df2\u8bbe\u7f6e\u672c\u5730\u5934\u50cf \u00b7 "

    .line 288
    .line 289
    invoke-static {v2, v1}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    :cond_c
    iget-object v2, p1, Ls0/j;->g:Landroid/widget/TextView;

    .line 294
    .line 295
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 296
    .line 297
    .line 298
    iget-object v1, v4, Ls0/l;->c:Ljava/util/LinkedHashMap;

    .line 299
    .line 300
    invoke-virtual {v1, p3}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result p3

    .line 304
    if-eqz p3, :cond_d

    .line 305
    .line 306
    const-string v1, "\u5df2\u6dfb\u52a0"

    .line 307
    .line 308
    goto :goto_6

    .line 309
    :cond_d
    const-string v1, "\u6dfb\u52a0"

    .line 310
    .line 311
    :goto_6
    iget-object p1, p1, Ls0/j;->h:Landroid/widget/TextView;

    .line 312
    .line 313
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 314
    .line 315
    .line 316
    iget-object v1, v4, Ls0/l;->n:LC/d;

    .line 317
    .line 318
    if-eqz v1, :cond_f

    .line 319
    .line 320
    if-eqz v5, :cond_e

    .line 321
    .line 322
    const-string v1, "\u7ba1\u7406"

    .line 323
    .line 324
    goto :goto_7

    .line 325
    :cond_e
    iget-object v1, v4, Ls0/l;->b:Ljava/lang/String;

    .line 326
    .line 327
    :goto_7
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 328
    .line 329
    .line 330
    :cond_f
    iget-object v1, v4, Ls0/l;->a:Landroid/app/Activity;

    .line 331
    .line 332
    if-eqz p3, :cond_10

    .line 333
    .line 334
    iget-object v2, v4, Ls0/l;->n:LC/d;

    .line 335
    .line 336
    if-nez v2, :cond_10

    .line 337
    .line 338
    invoke-static {v1}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    iget v1, v1, Ls0/K;->g:I

    .line 343
    .line 344
    goto :goto_8

    .line 345
    :cond_10
    invoke-static {v1}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 346
    .line 347
    .line 348
    move v1, v3

    .line 349
    :goto_8
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 350
    .line 351
    .line 352
    if-eqz p3, :cond_11

    .line 353
    .line 354
    iget-object p3, v4, Ls0/l;->n:LC/d;

    .line 355
    .line 356
    if-nez p3, :cond_11

    .line 357
    .line 358
    iget-object p3, v4, Ls0/l;->a:Landroid/app/Activity;

    .line 359
    .line 360
    invoke-static {p3}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 361
    .line 362
    .line 363
    move-result-object p3

    .line 364
    iget p3, p3, Ls0/K;->e:I

    .line 365
    .line 366
    goto :goto_9

    .line 367
    :cond_11
    iget-object p3, v4, Ls0/l;->a:Landroid/app/Activity;

    .line 368
    .line 369
    invoke-static {p3}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 370
    .line 371
    .line 372
    invoke-static {v3}, Landroid/graphics/Color;->red(I)I

    .line 373
    .line 374
    .line 375
    move-result p3

    .line 376
    invoke-static {v3}, Landroid/graphics/Color;->green(I)I

    .line 377
    .line 378
    .line 379
    move-result v1

    .line 380
    invoke-static {v3}, Landroid/graphics/Color;->blue(I)I

    .line 381
    .line 382
    .line 383
    move-result v2

    .line 384
    const/16 v3, 0x1e

    .line 385
    .line 386
    invoke-static {v3, p3, v1, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 387
    .line 388
    .line 389
    move-result p3

    .line 390
    :goto_9
    const/16 v1, 0x12

    .line 391
    .line 392
    invoke-static {v1}, LB0/a;->b(I)I

    .line 393
    .line 394
    .line 395
    move-result v1

    .line 396
    invoke-static {v4, p3, v1, v0}, Ls0/l;->g(Ls0/l;IILjava/lang/Integer;)Landroid/graphics/drawable/GradientDrawable;

    .line 397
    .line 398
    .line 399
    move-result-object p3

    .line 400
    invoke-virtual {p1, p3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 401
    .line 402
    .line 403
    new-instance p3, Lr0/F1;

    .line 404
    .line 405
    const/4 v0, 0x3

    .line 406
    invoke-direct {p3, v4, p2, v0}, Lr0/F1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 410
    .line 411
    .line 412
    :cond_12
    return-void

    .line 413
    :pswitch_1
    invoke-virtual {v5, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    check-cast v0, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 418
    .line 419
    instance-of v5, p1, Ls0/e;

    .line 420
    .line 421
    if-eqz v5, :cond_1c

    .line 422
    .line 423
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/MaskItemBean;->getTagName()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v5

    .line 427
    invoke-static {v5}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 428
    .line 429
    .line 430
    move-result v6

    .line 431
    if-eqz v6, :cond_13

    .line 432
    .line 433
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v5

    .line 437
    :cond_13
    check-cast v4, Li/q1;

    .line 438
    .line 439
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/MaskItemBean;->getTagName()Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v6

    .line 446
    invoke-static {v6}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 447
    .line 448
    .line 449
    move-result v6

    .line 450
    iget-object v7, v4, Li/q1;->e:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast v7, Ljava/util/concurrent/ExecutorService;

    .line 453
    .line 454
    iget-object v8, v4, Li/q1;->g:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast v8, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 457
    .line 458
    if-nez v6, :cond_14

    .line 459
    .line 460
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/MaskItemBean;->getAvatarUrl()Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v6

    .line 464
    invoke-static {v6}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 465
    .line 466
    .line 467
    move-result v6

    .line 468
    if-nez v6, :cond_14

    .line 469
    .line 470
    goto :goto_a

    .line 471
    :cond_14
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 472
    .line 473
    .line 474
    move-result v6

    .line 475
    if-eqz v6, :cond_15

    .line 476
    .line 477
    goto :goto_a

    .line 478
    :cond_15
    new-instance v6, LA0/m;

    .line 479
    .line 480
    const/16 v9, 0xb

    .line 481
    .line 482
    invoke-direct {v6, v0, v4, v9}, LA0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 483
    .line 484
    .line 485
    invoke-interface {v7, v6}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 486
    .line 487
    .line 488
    :goto_a
    check-cast p1, Ls0/e;

    .line 489
    .line 490
    sget-object v6, Lz0/l;->a:Landroid/util/LruCache;

    .line 491
    .line 492
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v6

    .line 496
    invoke-static {v6}, Lz0/l;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v6

    .line 500
    if-nez v6, :cond_16

    .line 501
    .line 502
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/MaskItemBean;->getAvatarUrl()Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v6

    .line 506
    invoke-static {v6}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 507
    .line 508
    .line 509
    move-result-object v6

    .line 510
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v6

    .line 514
    :cond_16
    iget-object v9, p1, Ls0/e;->c:Landroid/widget/FrameLayout;

    .line 515
    .line 516
    invoke-virtual {v9, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 517
    .line 518
    .line 519
    rem-int/lit8 p2, p2, 0x2

    .line 520
    .line 521
    iget-object v10, v4, Li/q1;->b:Ljava/lang/Object;

    .line 522
    .line 523
    check-cast v10, Landroid/app/Activity;

    .line 524
    .line 525
    if-nez p2, :cond_17

    .line 526
    .line 527
    invoke-static {v10}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 528
    .line 529
    .line 530
    goto :goto_b

    .line 531
    :cond_17
    invoke-static {v10}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 532
    .line 533
    .line 534
    const v3, -0xc38116

    .line 535
    .line 536
    .line 537
    :goto_b
    invoke-static {v2}, LB0/a;->b(I)I

    .line 538
    .line 539
    .line 540
    move-result p2

    .line 541
    invoke-static {v4, v3, p2}, Li/q1;->b(Li/q1;II)Landroid/graphics/drawable/GradientDrawable;

    .line 542
    .line 543
    .line 544
    move-result-object p2

    .line 545
    invoke-virtual {v9, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 546
    .line 547
    .line 548
    invoke-static {p3, v5}, LU0/i;->B0(ILjava/lang/String;)Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object p2

    .line 552
    invoke-static {p2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 553
    .line 554
    .line 555
    move-result p3

    .line 556
    if-eqz p3, :cond_18

    .line 557
    .line 558
    const-string p2, "\u53cb"

    .line 559
    .line 560
    :cond_18
    iget-object p3, p1, Ls0/e;->e:Landroid/widget/TextView;

    .line 561
    .line 562
    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 563
    .line 564
    .line 565
    invoke-virtual {p3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 566
    .line 567
    .line 568
    iget-object p2, p1, Ls0/e;->d:Landroid/widget/ImageView;

    .line 569
    .line 570
    invoke-virtual {p2, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 571
    .line 572
    .line 573
    invoke-static {v6}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 574
    .line 575
    .line 576
    move-result v3

    .line 577
    if-eqz v3, :cond_19

    .line 578
    .line 579
    goto :goto_c

    .line 580
    :cond_19
    iget-object v3, v4, Li/q1;->f:Ljava/lang/Object;

    .line 581
    .line 582
    check-cast v3, Ls0/f;

    .line 583
    .line 584
    invoke-virtual {v3, v6}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object v3

    .line 588
    check-cast v3, Landroid/graphics/Bitmap;

    .line 589
    .line 590
    if-eqz v3, :cond_1a

    .line 591
    .line 592
    invoke-virtual {p2, v3}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 596
    .line 597
    .line 598
    invoke-virtual {p3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 599
    .line 600
    .line 601
    goto :goto_c

    .line 602
    :cond_1a
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 603
    .line 604
    .line 605
    move-result p2

    .line 606
    if-eqz p2, :cond_1b

    .line 607
    .line 608
    goto :goto_c

    .line 609
    :cond_1b
    new-instance p2, LA0/r;

    .line 610
    .line 611
    const/16 p3, 0xd

    .line 612
    .line 613
    invoke-direct {p2, v4, v6, p1, p3}, LA0/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 614
    .line 615
    .line 616
    invoke-interface {v7, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 617
    .line 618
    .line 619
    :goto_c
    iget-object p2, p1, Ls0/e;->f:Landroid/widget/TextView;

    .line 620
    .line 621
    invoke-virtual {p2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 622
    .line 623
    .line 624
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object p2

    .line 628
    const-string p3, "\u5fae\u4fe1ID\uff1a"

    .line 629
    .line 630
    invoke-static {p3, p2}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object p2

    .line 634
    iget-object p1, p1, Ls0/e;->g:Landroid/widget/TextView;

    .line 635
    .line 636
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 637
    .line 638
    .line 639
    :cond_1c
    return-void

    .line 640
    nop

    .line 641
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Landroid/view/ViewGroup;)Ln0/a;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ls0/g;->c:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v3, Landroid/widget/FrameLayout;

    .line 9
    .line 10
    iget-object v1, v0, Ls0/g;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Li/t;

    .line 13
    .line 14
    iget-object v2, v1, Li/t;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Landroid/app/Activity;

    .line 17
    .line 18
    invoke-direct {v3, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 22
    .line 23
    const/4 v4, -0x1

    .line 24
    const/4 v5, -0x2

    .line 25
    invoke-direct {v2, v4, v5}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 29
    .line 30
    .line 31
    const/16 v2, 0x76

    .line 32
    .line 33
    invoke-static {v2}, LB0/a;->b(I)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-virtual {v3, v2}, Landroid/view/View;->setMinimumHeight(I)V

    .line 38
    .line 39
    .line 40
    const/16 v2, 0x18

    .line 41
    .line 42
    invoke-static {v2}, LB0/a;->b(I)I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    const/16 v7, 0xc

    .line 47
    .line 48
    invoke-static {v7}, LB0/a;->b(I)I

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    invoke-static {v2}, LB0/a;->b(I)I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    invoke-static {v7}, LB0/a;->b(I)I

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    invoke-virtual {v3, v6, v8, v2, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 61
    .line 62
    .line 63
    iget-object v2, v1, Li/t;->a:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v2, Landroid/app/Activity;

    .line 66
    .line 67
    invoke-static {v2}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    iget v6, v6, Ls0/K;->d:I

    .line 72
    .line 73
    invoke-virtual {v3, v6}, Landroid/view/View;->setBackgroundColor(I)V

    .line 74
    .line 75
    .line 76
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    .line 77
    .line 78
    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 79
    .line 80
    .line 81
    const/4 v7, 0x0

    .line 82
    int-to-float v8, v7

    .line 83
    invoke-virtual {v6, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v6, v7}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v6, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 90
    .line 91
    .line 92
    new-instance v9, Landroid/graphics/drawable/GradientDrawable;

    .line 93
    .line 94
    invoke-direct {v9}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-static {v4}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 98
    .line 99
    .line 100
    move-result-object v10

    .line 101
    invoke-virtual {v9, v10}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v9, v7}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v9, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 108
    .line 109
    .line 110
    new-instance v7, Landroid/graphics/drawable/RippleDrawable;

    .line 111
    .line 112
    const v8, 0x33aaaaaa

    .line 113
    .line 114
    .line 115
    invoke-static {v8}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    invoke-direct {v7, v8, v6, v9}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 120
    .line 121
    .line 122
    const/4 v6, 0x1

    .line 123
    invoke-virtual {v3, v6}, Landroid/view/View;->setClickable(Z)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 127
    .line 128
    .line 129
    new-instance v7, Landroid/widget/TextView;

    .line 130
    .line 131
    invoke-direct {v7, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 132
    .line 133
    .line 134
    new-instance v8, Landroid/widget/FrameLayout$LayoutParams;

    .line 135
    .line 136
    const/16 v9, 0x52

    .line 137
    .line 138
    invoke-static {v9}, LB0/a;->b(I)I

    .line 139
    .line 140
    .line 141
    move-result v10

    .line 142
    invoke-static {v9}, LB0/a;->b(I)I

    .line 143
    .line 144
    .line 145
    move-result v11

    .line 146
    invoke-direct {v8, v10, v11}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 147
    .line 148
    .line 149
    const v10, 0x800013

    .line 150
    .line 151
    .line 152
    iput v10, v8, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 153
    .line 154
    invoke-virtual {v7, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 155
    .line 156
    .line 157
    const/16 v8, 0x11

    .line 158
    .line 159
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 160
    .line 161
    .line 162
    const-string v8, "\u5708"

    .line 163
    .line 164
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v7, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 168
    .line 169
    .line 170
    sget-object v8, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 171
    .line 172
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 173
    .line 174
    .line 175
    const/4 v11, 0x2

    .line 176
    const/high16 v12, 0x41900000    # 18.0f

    .line 177
    .line 178
    invoke-virtual {v7, v11, v12}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 179
    .line 180
    .line 181
    invoke-static {v2}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 182
    .line 183
    .line 184
    const/16 v12, 0x8

    .line 185
    .line 186
    invoke-static {v12}, LB0/a;->b(I)I

    .line 187
    .line 188
    .line 189
    move-result v13

    .line 190
    const v14, -0x25a28b

    .line 191
    .line 192
    .line 193
    const/4 v15, 0x0

    .line 194
    invoke-static {v1, v14, v13, v15, v12}, Li/t;->o(Li/t;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 195
    .line 196
    .line 197
    move-result-object v13

    .line 198
    invoke-virtual {v7, v13}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 202
    .line 203
    .line 204
    new-instance v13, Landroid/widget/ImageView;

    .line 205
    .line 206
    invoke-direct {v13, v2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 207
    .line 208
    .line 209
    new-instance v14, Landroid/widget/FrameLayout$LayoutParams;

    .line 210
    .line 211
    move/from16 p1, v9

    .line 212
    .line 213
    invoke-static/range {p1 .. p1}, LB0/a;->b(I)I

    .line 214
    .line 215
    .line 216
    move-result v9

    .line 217
    invoke-static/range {p1 .. p1}, LB0/a;->b(I)I

    .line 218
    .line 219
    .line 220
    move-result v15

    .line 221
    invoke-direct {v14, v9, v15}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 222
    .line 223
    .line 224
    iput v10, v14, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 225
    .line 226
    invoke-virtual {v13, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 227
    .line 228
    .line 229
    sget-object v9, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 230
    .line 231
    invoke-virtual {v13, v9}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 232
    .line 233
    .line 234
    invoke-static {v2}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 235
    .line 236
    .line 237
    move-result-object v9

    .line 238
    invoke-static {v12}, LB0/a;->b(I)I

    .line 239
    .line 240
    .line 241
    move-result v10

    .line 242
    invoke-static {v2}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 243
    .line 244
    .line 245
    move-result-object v14

    .line 246
    iget v14, v14, Ls0/K;->i:I

    .line 247
    .line 248
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 249
    .line 250
    .line 251
    move-result-object v14

    .line 252
    iget v9, v9, Ls0/K;->e:I

    .line 253
    .line 254
    invoke-static {v1, v9, v10, v14, v12}, Li/t;->o(Li/t;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 255
    .line 256
    .line 257
    move-result-object v9

    .line 258
    invoke-virtual {v13, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v3, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 262
    .line 263
    .line 264
    new-instance v9, Landroid/widget/LinearLayout;

    .line 265
    .line 266
    invoke-direct {v9, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 267
    .line 268
    .line 269
    new-instance v10, Landroid/widget/FrameLayout$LayoutParams;

    .line 270
    .line 271
    invoke-direct {v10, v4, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 272
    .line 273
    .line 274
    const/16 v14, 0x10

    .line 275
    .line 276
    iput v14, v10, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 277
    .line 278
    const/16 v14, 0x62

    .line 279
    .line 280
    invoke-static {v14}, LB0/a;->b(I)I

    .line 281
    .line 282
    .line 283
    move-result v14

    .line 284
    invoke-virtual {v10, v14}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 285
    .line 286
    .line 287
    const/16 v14, 0x48

    .line 288
    .line 289
    invoke-static {v14}, LB0/a;->b(I)I

    .line 290
    .line 291
    .line 292
    move-result v14

    .line 293
    invoke-virtual {v10, v14}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v9, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v9, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 300
    .line 301
    .line 302
    new-instance v6, Landroid/widget/TextView;

    .line 303
    .line 304
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 305
    .line 306
    .line 307
    move-result-object v10

    .line 308
    invoke-direct {v6, v10}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 309
    .line 310
    .line 311
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 312
    .line 313
    invoke-direct {v10, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v6, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 317
    .line 318
    .line 319
    invoke-static {v2}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 320
    .line 321
    .line 322
    move-result-object v10

    .line 323
    iget v10, v10, Ls0/K;->f:I

    .line 324
    .line 325
    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 326
    .line 327
    .line 328
    const/high16 v10, 0x41480000    # 12.5f

    .line 329
    .line 330
    invoke-virtual {v6, v11, v10}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v9, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 334
    .line 335
    .line 336
    move-object v10, v7

    .line 337
    new-instance v7, Landroid/widget/TextView;

    .line 338
    .line 339
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 340
    .line 341
    .line 342
    move-result-object v14

    .line 343
    invoke-direct {v7, v14}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 344
    .line 345
    .line 346
    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    .line 347
    .line 348
    invoke-direct {v14, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 349
    .line 350
    .line 351
    const/4 v4, 0x4

    .line 352
    invoke-static {v4}, LB0/a;->b(I)I

    .line 353
    .line 354
    .line 355
    move-result v4

    .line 356
    iput v4, v14, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 357
    .line 358
    invoke-virtual {v7, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 359
    .line 360
    .line 361
    invoke-static {v2}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    iget v4, v4, Ls0/K;->g:I

    .line 366
    .line 367
    invoke-virtual {v7, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 368
    .line 369
    .line 370
    const/high16 v4, 0x41180000    # 9.5f

    .line 371
    .line 372
    invoke-virtual {v7, v11, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v9, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v3, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 382
    .line 383
    .line 384
    new-instance v4, Landroid/widget/TextView;

    .line 385
    .line 386
    invoke-direct {v4, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 387
    .line 388
    .line 389
    new-instance v9, Landroid/widget/FrameLayout$LayoutParams;

    .line 390
    .line 391
    invoke-direct {v9, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 392
    .line 393
    .line 394
    const v5, 0x800015

    .line 395
    .line 396
    .line 397
    iput v5, v9, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 398
    .line 399
    invoke-virtual {v4, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 400
    .line 401
    .line 402
    const-string v5, "\u6062\u590d"

    .line 403
    .line 404
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 408
    .line 409
    .line 410
    invoke-static {v2}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 411
    .line 412
    .line 413
    const v5, -0xe95665

    .line 414
    .line 415
    .line 416
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 417
    .line 418
    .line 419
    const/high16 v8, 0x41700000    # 15.0f

    .line 420
    .line 421
    invoke-virtual {v4, v11, v8}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 422
    .line 423
    .line 424
    const/16 v8, 0xe

    .line 425
    .line 426
    invoke-static {v8}, LB0/a;->b(I)I

    .line 427
    .line 428
    .line 429
    move-result v9

    .line 430
    invoke-static {v12}, LB0/a;->b(I)I

    .line 431
    .line 432
    .line 433
    move-result v11

    .line 434
    invoke-static {v8}, LB0/a;->b(I)I

    .line 435
    .line 436
    .line 437
    move-result v8

    .line 438
    invoke-static {v12}, LB0/a;->b(I)I

    .line 439
    .line 440
    .line 441
    move-result v14

    .line 442
    invoke-virtual {v4, v9, v11, v8, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 443
    .line 444
    .line 445
    invoke-static {v2}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 446
    .line 447
    .line 448
    invoke-static {v5}, Landroid/graphics/Color;->red(I)I

    .line 449
    .line 450
    .line 451
    move-result v2

    .line 452
    invoke-static {v5}, Landroid/graphics/Color;->green(I)I

    .line 453
    .line 454
    .line 455
    move-result v8

    .line 456
    invoke-static {v5}, Landroid/graphics/Color;->blue(I)I

    .line 457
    .line 458
    .line 459
    move-result v5

    .line 460
    const/16 v9, 0x1e

    .line 461
    .line 462
    invoke-static {v9, v2, v8, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 463
    .line 464
    .line 465
    move-result v2

    .line 466
    const/16 v5, 0x12

    .line 467
    .line 468
    invoke-static {v5}, LB0/a;->b(I)I

    .line 469
    .line 470
    .line 471
    move-result v5

    .line 472
    const/4 v8, 0x0

    .line 473
    invoke-static {v1, v2, v5, v8, v12}, Li/t;->o(Li/t;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    invoke-virtual {v4, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 478
    .line 479
    .line 480
    new-instance v2, Lr0/F1;

    .line 481
    .line 482
    const/4 v5, 0x4

    .line 483
    invoke-direct {v2, v1, v3, v5}, Lr0/F1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v4, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 487
    .line 488
    .line 489
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 490
    .line 491
    .line 492
    new-instance v2, Ls0/p;

    .line 493
    .line 494
    move-object v4, v10

    .line 495
    move-object v5, v13

    .line 496
    invoke-direct/range {v2 .. v7}, Ls0/p;-><init>(Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 497
    .line 498
    .line 499
    new-instance v4, Lr0/F1;

    .line 500
    .line 501
    const/4 v5, 0x5

    .line 502
    invoke-direct {v4, v1, v2, v5}, Lr0/F1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 506
    .line 507
    .line 508
    new-instance v4, Lr0/b0;

    .line 509
    .line 510
    const/4 v5, 0x3

    .line 511
    invoke-direct {v4, v1, v2, v5}, Lr0/b0;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 515
    .line 516
    .line 517
    return-object v2

    .line 518
    :pswitch_0
    new-instance v7, Landroid/widget/FrameLayout;

    .line 519
    .line 520
    iget-object v1, v0, Ls0/g;->d:Ljava/lang/Object;

    .line 521
    .line 522
    check-cast v1, Ls0/l;

    .line 523
    .line 524
    iget-object v2, v1, Ls0/l;->a:Landroid/app/Activity;

    .line 525
    .line 526
    invoke-direct {v7, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 527
    .line 528
    .line 529
    new-instance v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 530
    .line 531
    const/4 v3, -0x1

    .line 532
    const/4 v4, -0x2

    .line 533
    invoke-direct {v2, v3, v4}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v7, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 537
    .line 538
    .line 539
    const/16 v2, 0x4c

    .line 540
    .line 541
    invoke-static {v2}, LB0/a;->b(I)I

    .line 542
    .line 543
    .line 544
    move-result v2

    .line 545
    invoke-virtual {v7, v2}, Landroid/view/View;->setMinimumHeight(I)V

    .line 546
    .line 547
    .line 548
    const/16 v2, 0x18

    .line 549
    .line 550
    invoke-static {v2}, LB0/a;->b(I)I

    .line 551
    .line 552
    .line 553
    move-result v5

    .line 554
    const/16 v6, 0xa

    .line 555
    .line 556
    invoke-static {v6}, LB0/a;->b(I)I

    .line 557
    .line 558
    .line 559
    move-result v8

    .line 560
    invoke-static {v2}, LB0/a;->b(I)I

    .line 561
    .line 562
    .line 563
    move-result v2

    .line 564
    invoke-static {v6}, LB0/a;->b(I)I

    .line 565
    .line 566
    .line 567
    move-result v6

    .line 568
    invoke-virtual {v7, v5, v8, v2, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 569
    .line 570
    .line 571
    iget-object v2, v1, Ls0/l;->a:Landroid/app/Activity;

    .line 572
    .line 573
    invoke-static {v2}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 574
    .line 575
    .line 576
    move-result-object v5

    .line 577
    iget v5, v5, Ls0/K;->d:I

    .line 578
    .line 579
    invoke-virtual {v7, v5}, Landroid/view/View;->setBackgroundColor(I)V

    .line 580
    .line 581
    .line 582
    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    .line 583
    .line 584
    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 585
    .line 586
    .line 587
    const/4 v6, 0x0

    .line 588
    int-to-float v8, v6

    .line 589
    invoke-virtual {v5, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v5, v6}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v5, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 596
    .line 597
    .line 598
    new-instance v9, Landroid/graphics/drawable/GradientDrawable;

    .line 599
    .line 600
    invoke-direct {v9}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 601
    .line 602
    .line 603
    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 604
    .line 605
    .line 606
    move-result-object v10

    .line 607
    invoke-virtual {v9, v10}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 608
    .line 609
    .line 610
    invoke-virtual {v9, v6}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 611
    .line 612
    .line 613
    invoke-virtual {v9, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 614
    .line 615
    .line 616
    new-instance v6, Landroid/graphics/drawable/RippleDrawable;

    .line 617
    .line 618
    const v8, 0x33aaaaaa

    .line 619
    .line 620
    .line 621
    invoke-static {v8}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 622
    .line 623
    .line 624
    move-result-object v8

    .line 625
    invoke-direct {v6, v8, v5, v9}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 626
    .line 627
    .line 628
    const/4 v5, 0x1

    .line 629
    invoke-virtual {v7, v5}, Landroid/view/View;->setClickable(Z)V

    .line 630
    .line 631
    .line 632
    invoke-virtual {v7, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 633
    .line 634
    .line 635
    new-instance v8, Landroid/widget/FrameLayout;

    .line 636
    .line 637
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 638
    .line 639
    .line 640
    move-result-object v6

    .line 641
    invoke-direct {v8, v6}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 642
    .line 643
    .line 644
    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 645
    .line 646
    const/16 v9, 0x2a

    .line 647
    .line 648
    invoke-static {v9}, LB0/a;->b(I)I

    .line 649
    .line 650
    .line 651
    move-result v10

    .line 652
    invoke-static {v9}, LB0/a;->b(I)I

    .line 653
    .line 654
    .line 655
    move-result v9

    .line 656
    invoke-direct {v6, v10, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 657
    .line 658
    .line 659
    const v9, 0x800013

    .line 660
    .line 661
    .line 662
    iput v9, v6, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 663
    .line 664
    invoke-virtual {v8, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 665
    .line 666
    .line 667
    invoke-static {v2}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 668
    .line 669
    .line 670
    const/16 v6, 0x8

    .line 671
    .line 672
    invoke-static {v6}, LB0/a;->b(I)I

    .line 673
    .line 674
    .line 675
    move-result v9

    .line 676
    const v10, -0xe95665

    .line 677
    .line 678
    .line 679
    const/4 v11, 0x0

    .line 680
    invoke-static {v1, v10, v9, v11}, Ls0/l;->g(Ls0/l;IILjava/lang/Integer;)Landroid/graphics/drawable/GradientDrawable;

    .line 681
    .line 682
    .line 683
    move-result-object v9

    .line 684
    invoke-virtual {v8, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 685
    .line 686
    .line 687
    new-instance v9, Landroid/widget/ImageView;

    .line 688
    .line 689
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 690
    .line 691
    .line 692
    move-result-object v10

    .line 693
    invoke-direct {v9, v10}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 694
    .line 695
    .line 696
    new-instance v10, Landroid/widget/FrameLayout$LayoutParams;

    .line 697
    .line 698
    invoke-direct {v10, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 699
    .line 700
    .line 701
    invoke-virtual {v9, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 702
    .line 703
    .line 704
    sget-object v10, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 705
    .line 706
    invoke-virtual {v9, v10}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 707
    .line 708
    .line 709
    invoke-virtual {v9, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 710
    .line 711
    .line 712
    invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 713
    .line 714
    .line 715
    new-instance v10, Landroid/widget/TextView;

    .line 716
    .line 717
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 718
    .line 719
    .line 720
    move-result-object v6

    .line 721
    invoke-direct {v10, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 722
    .line 723
    .line 724
    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 725
    .line 726
    invoke-direct {v6, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v10, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 730
    .line 731
    .line 732
    const/16 v6, 0x11

    .line 733
    .line 734
    invoke-virtual {v10, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 735
    .line 736
    .line 737
    invoke-virtual {v10, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 738
    .line 739
    .line 740
    sget-object v11, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 741
    .line 742
    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 743
    .line 744
    .line 745
    const/4 v12, 0x2

    .line 746
    const/high16 v13, 0x41880000    # 17.0f

    .line 747
    .line 748
    invoke-virtual {v10, v12, v13}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 749
    .line 750
    .line 751
    invoke-virtual {v8, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 752
    .line 753
    .line 754
    invoke-virtual {v7, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 755
    .line 756
    .line 757
    new-instance v13, Landroid/widget/LinearLayout;

    .line 758
    .line 759
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 760
    .line 761
    .line 762
    move-result-object v14

    .line 763
    invoke-direct {v13, v14}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 764
    .line 765
    .line 766
    new-instance v14, Landroid/widget/FrameLayout$LayoutParams;

    .line 767
    .line 768
    invoke-direct {v14, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 769
    .line 770
    .line 771
    const/16 v15, 0x10

    .line 772
    .line 773
    iput v15, v14, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 774
    .line 775
    const/16 v15, 0x3a

    .line 776
    .line 777
    invoke-static {v15}, LB0/a;->b(I)I

    .line 778
    .line 779
    .line 780
    move-result v15

    .line 781
    invoke-virtual {v14, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 782
    .line 783
    .line 784
    const/16 v15, 0x52

    .line 785
    .line 786
    invoke-static {v15}, LB0/a;->b(I)I

    .line 787
    .line 788
    .line 789
    move-result v15

    .line 790
    invoke-virtual {v14, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 791
    .line 792
    .line 793
    invoke-virtual {v13, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 794
    .line 795
    .line 796
    invoke-virtual {v13, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 797
    .line 798
    .line 799
    new-instance v14, Landroid/widget/TextView;

    .line 800
    .line 801
    invoke-virtual {v13}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 802
    .line 803
    .line 804
    move-result-object v15

    .line 805
    invoke-direct {v14, v15}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 806
    .line 807
    .line 808
    new-instance v15, Landroid/widget/LinearLayout$LayoutParams;

    .line 809
    .line 810
    invoke-direct {v15, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 811
    .line 812
    .line 813
    invoke-virtual {v14, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 814
    .line 815
    .line 816
    invoke-virtual {v14, v5}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 817
    .line 818
    .line 819
    invoke-static {v2}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 820
    .line 821
    .line 822
    move-result-object v15

    .line 823
    iget v15, v15, Ls0/K;->f:I

    .line 824
    .line 825
    invoke-virtual {v14, v15}, Landroid/widget/TextView;->setTextColor(I)V

    .line 826
    .line 827
    .line 828
    const/high16 v15, 0x41600000    # 14.0f

    .line 829
    .line 830
    invoke-virtual {v14, v12, v15}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 831
    .line 832
    .line 833
    invoke-virtual {v13, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 834
    .line 835
    .line 836
    new-instance v15, Landroid/widget/TextView;

    .line 837
    .line 838
    invoke-virtual {v13}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 839
    .line 840
    .line 841
    move-result-object v6

    .line 842
    invoke-direct {v15, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 843
    .line 844
    .line 845
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 846
    .line 847
    invoke-direct {v6, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 848
    .line 849
    .line 850
    const/4 v3, 0x4

    .line 851
    invoke-static {v3}, LB0/a;->b(I)I

    .line 852
    .line 853
    .line 854
    move-result v3

    .line 855
    iput v3, v6, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 856
    .line 857
    invoke-virtual {v15, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 858
    .line 859
    .line 860
    invoke-virtual {v15, v5}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 861
    .line 862
    .line 863
    invoke-static {v2}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 864
    .line 865
    .line 866
    move-result-object v2

    .line 867
    iget v2, v2, Ls0/K;->g:I

    .line 868
    .line 869
    invoke-virtual {v15, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 870
    .line 871
    .line 872
    const/high16 v2, 0x41200000    # 10.0f

    .line 873
    .line 874
    invoke-virtual {v15, v12, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 875
    .line 876
    .line 877
    invoke-virtual {v13, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 878
    .line 879
    .line 880
    invoke-virtual {v7, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 881
    .line 882
    .line 883
    new-instance v13, Landroid/widget/TextView;

    .line 884
    .line 885
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 886
    .line 887
    .line 888
    move-result-object v2

    .line 889
    invoke-direct {v13, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 890
    .line 891
    .line 892
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 893
    .line 894
    const/16 v3, 0x48

    .line 895
    .line 896
    invoke-static {v3}, LB0/a;->b(I)I

    .line 897
    .line 898
    .line 899
    move-result v3

    .line 900
    const/16 v4, 0x24

    .line 901
    .line 902
    invoke-static {v4}, LB0/a;->b(I)I

    .line 903
    .line 904
    .line 905
    move-result v4

    .line 906
    invoke-direct {v2, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 907
    .line 908
    .line 909
    const v3, 0x800015

    .line 910
    .line 911
    .line 912
    iput v3, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 913
    .line 914
    invoke-virtual {v13, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 915
    .line 916
    .line 917
    const/16 v2, 0x11

    .line 918
    .line 919
    invoke-virtual {v13, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 920
    .line 921
    .line 922
    invoke-virtual {v13, v11}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 923
    .line 924
    .line 925
    const/high16 v2, 0x41600000    # 14.0f

    .line 926
    .line 927
    invoke-virtual {v13, v12, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 928
    .line 929
    .line 930
    invoke-virtual {v7, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 931
    .line 932
    .line 933
    new-instance v6, Ls0/j;

    .line 934
    .line 935
    move-object v11, v14

    .line 936
    move-object v12, v15

    .line 937
    invoke-direct/range {v6 .. v13}, Ls0/j;-><init>(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 938
    .line 939
    .line 940
    new-instance v2, Lr0/v0;

    .line 941
    .line 942
    const/4 v3, 0x2

    .line 943
    invoke-direct {v2, v1, v0, v6, v3}, Lr0/v0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 944
    .line 945
    .line 946
    invoke-virtual {v7, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 947
    .line 948
    .line 949
    return-object v6

    .line 950
    :pswitch_1
    new-instance v9, Landroid/widget/FrameLayout;

    .line 951
    .line 952
    iget-object v1, v0, Ls0/g;->d:Ljava/lang/Object;

    .line 953
    .line 954
    check-cast v1, Li/q1;

    .line 955
    .line 956
    iget-object v2, v1, Li/q1;->b:Ljava/lang/Object;

    .line 957
    .line 958
    check-cast v2, Landroid/app/Activity;

    .line 959
    .line 960
    invoke-direct {v9, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 961
    .line 962
    .line 963
    new-instance v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 964
    .line 965
    const/4 v3, -0x1

    .line 966
    const/4 v4, -0x2

    .line 967
    invoke-direct {v2, v3, v4}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 968
    .line 969
    .line 970
    invoke-virtual {v9, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 971
    .line 972
    .line 973
    const/16 v2, 0x58

    .line 974
    .line 975
    invoke-static {v2}, LB0/a;->b(I)I

    .line 976
    .line 977
    .line 978
    move-result v2

    .line 979
    invoke-virtual {v9, v2}, Landroid/view/View;->setMinimumHeight(I)V

    .line 980
    .line 981
    .line 982
    const/16 v2, 0x18

    .line 983
    .line 984
    invoke-static {v2}, LB0/a;->b(I)I

    .line 985
    .line 986
    .line 987
    move-result v5

    .line 988
    const/16 v6, 0xc

    .line 989
    .line 990
    invoke-static {v6}, LB0/a;->b(I)I

    .line 991
    .line 992
    .line 993
    move-result v7

    .line 994
    invoke-static {v2}, LB0/a;->b(I)I

    .line 995
    .line 996
    .line 997
    move-result v2

    .line 998
    invoke-static {v6}, LB0/a;->b(I)I

    .line 999
    .line 1000
    .line 1001
    move-result v6

    .line 1002
    invoke-virtual {v9, v5, v7, v2, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 1003
    .line 1004
    .line 1005
    iget-object v2, v1, Li/q1;->b:Ljava/lang/Object;

    .line 1006
    .line 1007
    check-cast v2, Landroid/app/Activity;

    .line 1008
    .line 1009
    invoke-static {v2}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v5

    .line 1013
    iget v5, v5, Ls0/K;->d:I

    .line 1014
    .line 1015
    invoke-virtual {v9, v5}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1016
    .line 1017
    .line 1018
    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    .line 1019
    .line 1020
    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 1021
    .line 1022
    .line 1023
    const/4 v6, 0x0

    .line 1024
    int-to-float v7, v6

    .line 1025
    invoke-virtual {v5, v7}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual {v5, v6}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v5, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 1032
    .line 1033
    .line 1034
    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    .line 1035
    .line 1036
    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 1037
    .line 1038
    .line 1039
    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v10

    .line 1043
    invoke-virtual {v8, v10}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 1044
    .line 1045
    .line 1046
    invoke-virtual {v8, v6}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 1047
    .line 1048
    .line 1049
    invoke-virtual {v8, v7}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 1050
    .line 1051
    .line 1052
    new-instance v7, Landroid/graphics/drawable/RippleDrawable;

    .line 1053
    .line 1054
    const v10, 0x33aaaaaa

    .line 1055
    .line 1056
    .line 1057
    invoke-static {v10}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v10

    .line 1061
    invoke-direct {v7, v10, v5, v8}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 1062
    .line 1063
    .line 1064
    const/4 v5, 0x1

    .line 1065
    invoke-virtual {v9, v5}, Landroid/view/View;->setClickable(Z)V

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v9, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1069
    .line 1070
    .line 1071
    new-instance v10, Landroid/widget/FrameLayout;

    .line 1072
    .line 1073
    invoke-direct {v10, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 1074
    .line 1075
    .line 1076
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    .line 1077
    .line 1078
    const/16 v8, 0x2e

    .line 1079
    .line 1080
    invoke-static {v8}, LB0/a;->b(I)I

    .line 1081
    .line 1082
    .line 1083
    move-result v11

    .line 1084
    invoke-static {v8}, LB0/a;->b(I)I

    .line 1085
    .line 1086
    .line 1087
    move-result v8

    .line 1088
    invoke-direct {v7, v11, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 1089
    .line 1090
    .line 1091
    const v8, 0x800013

    .line 1092
    .line 1093
    .line 1094
    iput v8, v7, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 1095
    .line 1096
    invoke-virtual {v10, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1097
    .line 1098
    .line 1099
    new-instance v11, Landroid/widget/ImageView;

    .line 1100
    .line 1101
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v7

    .line 1105
    invoke-direct {v11, v7}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 1106
    .line 1107
    .line 1108
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    .line 1109
    .line 1110
    invoke-direct {v7, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v11, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1114
    .line 1115
    .line 1116
    sget-object v7, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 1117
    .line 1118
    invoke-virtual {v11, v7}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 1119
    .line 1120
    .line 1121
    const/16 v7, 0x8

    .line 1122
    .line 1123
    invoke-virtual {v11, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1124
    .line 1125
    .line 1126
    invoke-virtual {v10, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1127
    .line 1128
    .line 1129
    new-instance v12, Landroid/widget/TextView;

    .line 1130
    .line 1131
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v7

    .line 1135
    invoke-direct {v12, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1136
    .line 1137
    .line 1138
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    .line 1139
    .line 1140
    invoke-direct {v7, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 1141
    .line 1142
    .line 1143
    invoke-virtual {v12, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1144
    .line 1145
    .line 1146
    const/16 v7, 0x11

    .line 1147
    .line 1148
    invoke-virtual {v12, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 1149
    .line 1150
    .line 1151
    invoke-virtual {v12, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1152
    .line 1153
    .line 1154
    sget-object v8, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 1155
    .line 1156
    invoke-virtual {v12, v8}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 1157
    .line 1158
    .line 1159
    const/4 v13, 0x2

    .line 1160
    const/high16 v14, 0x41900000    # 18.0f

    .line 1161
    .line 1162
    invoke-virtual {v12, v13, v14}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 1163
    .line 1164
    .line 1165
    invoke-virtual {v10, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1166
    .line 1167
    .line 1168
    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1169
    .line 1170
    .line 1171
    new-instance v14, Landroid/widget/LinearLayout;

    .line 1172
    .line 1173
    invoke-direct {v14, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1174
    .line 1175
    .line 1176
    new-instance v15, Landroid/widget/FrameLayout$LayoutParams;

    .line 1177
    .line 1178
    invoke-direct {v15, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 1179
    .line 1180
    .line 1181
    const/16 v7, 0x10

    .line 1182
    .line 1183
    iput v7, v15, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 1184
    .line 1185
    const/16 v16, 0x3e

    .line 1186
    .line 1187
    move/from16 v17, v7

    .line 1188
    .line 1189
    invoke-static/range {v16 .. v16}, LB0/a;->b(I)I

    .line 1190
    .line 1191
    .line 1192
    move-result v7

    .line 1193
    invoke-virtual {v15, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 1194
    .line 1195
    .line 1196
    const/16 v7, 0x48

    .line 1197
    .line 1198
    invoke-static {v7}, LB0/a;->b(I)I

    .line 1199
    .line 1200
    .line 1201
    move-result v7

    .line 1202
    invoke-virtual {v15, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 1203
    .line 1204
    .line 1205
    invoke-virtual {v14, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual {v14, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1209
    .line 1210
    .line 1211
    new-instance v5, Landroid/widget/TextView;

    .line 1212
    .line 1213
    invoke-virtual {v14}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v7

    .line 1217
    invoke-direct {v5, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1218
    .line 1219
    .line 1220
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 1221
    .line 1222
    invoke-direct {v7, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1223
    .line 1224
    .line 1225
    invoke-virtual {v5, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1226
    .line 1227
    .line 1228
    invoke-static {v2}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v7

    .line 1232
    iget v7, v7, Ls0/K;->f:I

    .line 1233
    .line 1234
    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1235
    .line 1236
    .line 1237
    const/high16 v7, 0x41480000    # 12.5f

    .line 1238
    .line 1239
    invoke-virtual {v5, v13, v7}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 1240
    .line 1241
    .line 1242
    invoke-virtual {v14, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1243
    .line 1244
    .line 1245
    new-instance v7, Landroid/widget/TextView;

    .line 1246
    .line 1247
    invoke-virtual {v14}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v15

    .line 1251
    invoke-direct {v7, v15}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1252
    .line 1253
    .line 1254
    new-instance v15, Landroid/widget/LinearLayout$LayoutParams;

    .line 1255
    .line 1256
    invoke-direct {v15, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1257
    .line 1258
    .line 1259
    const/4 v3, 0x4

    .line 1260
    invoke-static {v3}, LB0/a;->b(I)I

    .line 1261
    .line 1262
    .line 1263
    move-result v3

    .line 1264
    iput v3, v15, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1265
    .line 1266
    invoke-virtual {v7, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1267
    .line 1268
    .line 1269
    invoke-static {v2}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v3

    .line 1273
    iget v3, v3, Ls0/K;->g:I

    .line 1274
    .line 1275
    invoke-virtual {v7, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1276
    .line 1277
    .line 1278
    const/high16 v3, 0x41180000    # 9.5f

    .line 1279
    .line 1280
    invoke-virtual {v7, v13, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 1281
    .line 1282
    .line 1283
    invoke-virtual {v14, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1284
    .line 1285
    .line 1286
    invoke-virtual {v9, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1287
    .line 1288
    .line 1289
    new-instance v3, Landroid/widget/LinearLayout;

    .line 1290
    .line 1291
    invoke-direct {v3, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1292
    .line 1293
    .line 1294
    new-instance v14, Landroid/widget/FrameLayout$LayoutParams;

    .line 1295
    .line 1296
    invoke-direct {v14, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 1297
    .line 1298
    .line 1299
    const v15, 0x800015

    .line 1300
    .line 1301
    .line 1302
    iput v15, v14, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 1303
    .line 1304
    invoke-virtual {v3, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1305
    .line 1306
    .line 1307
    invoke-virtual {v3, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1308
    .line 1309
    .line 1310
    const/16 v6, 0x11

    .line 1311
    .line 1312
    invoke-virtual {v3, v6}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1313
    .line 1314
    .line 1315
    invoke-static {v2}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v6

    .line 1319
    new-instance v14, Landroid/widget/TextView;

    .line 1320
    .line 1321
    invoke-direct {v14, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1322
    .line 1323
    .line 1324
    const-string v15, "\u79fb\u9664"

    .line 1325
    .line 1326
    invoke-virtual {v14, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1327
    .line 1328
    .line 1329
    invoke-virtual {v14, v8}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 1330
    .line 1331
    .line 1332
    iget v6, v6, Ls0/K;->g:I

    .line 1333
    .line 1334
    invoke-virtual {v14, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1335
    .line 1336
    .line 1337
    const/high16 v6, 0x41500000    # 13.0f

    .line 1338
    .line 1339
    invoke-virtual {v14, v13, v6}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 1340
    .line 1341
    .line 1342
    const/16 v6, 0xa

    .line 1343
    .line 1344
    invoke-static {v6}, LB0/a;->b(I)I

    .line 1345
    .line 1346
    .line 1347
    move-result v8

    .line 1348
    const/4 v13, 0x7

    .line 1349
    invoke-static {v13}, LB0/a;->b(I)I

    .line 1350
    .line 1351
    .line 1352
    move-result v15

    .line 1353
    invoke-static {v6}, LB0/a;->b(I)I

    .line 1354
    .line 1355
    .line 1356
    move-result v6

    .line 1357
    invoke-static {v13}, LB0/a;->b(I)I

    .line 1358
    .line 1359
    .line 1360
    move-result v13

    .line 1361
    invoke-virtual {v14, v8, v15, v6, v13}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1362
    .line 1363
    .line 1364
    invoke-static {v2}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v2

    .line 1368
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 1369
    .line 1370
    .line 1371
    move-result v6

    .line 1372
    iget v2, v2, Ls0/K;->e:I

    .line 1373
    .line 1374
    invoke-static {v1, v2, v6}, Li/q1;->b(Li/q1;II)Landroid/graphics/drawable/GradientDrawable;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v2

    .line 1378
    invoke-virtual {v14, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1379
    .line 1380
    .line 1381
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 1382
    .line 1383
    invoke-direct {v2, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1384
    .line 1385
    .line 1386
    const/4 v4, 0x6

    .line 1387
    invoke-static {v4}, LB0/a;->b(I)I

    .line 1388
    .line 1389
    .line 1390
    move-result v4

    .line 1391
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 1392
    .line 1393
    .line 1394
    invoke-virtual {v14, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1395
    .line 1396
    .line 1397
    new-instance v2, Lr0/F1;

    .line 1398
    .line 1399
    const/4 v4, 0x1

    .line 1400
    invoke-direct {v2, v1, v9, v4}, Lr0/F1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1401
    .line 1402
    .line 1403
    invoke-virtual {v14, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1404
    .line 1405
    .line 1406
    invoke-virtual {v3, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1407
    .line 1408
    .line 1409
    invoke-virtual {v9, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1410
    .line 1411
    .line 1412
    new-instance v8, Ls0/e;

    .line 1413
    .line 1414
    move-object v13, v5

    .line 1415
    move-object v14, v7

    .line 1416
    invoke-direct/range {v8 .. v14}, Ls0/e;-><init>(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 1417
    .line 1418
    .line 1419
    new-instance v2, Lr0/F1;

    .line 1420
    .line 1421
    const/4 v3, 0x2

    .line 1422
    invoke-direct {v2, v8, v1, v3}, Lr0/F1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1423
    .line 1424
    .line 1425
    invoke-virtual {v9, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1426
    .line 1427
    .line 1428
    new-instance v2, Lr0/b0;

    .line 1429
    .line 1430
    invoke-direct {v2, v1, v8, v3}, Lr0/b0;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1431
    .line 1432
    .line 1433
    invoke-virtual {v9, v2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 1434
    .line 1435
    .line 1436
    return-object v8

    .line 1437
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
