.class public final synthetic Lth/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 12
    iput p2, p0, Lth/d;->g:I

    iput-object p3, p0, Lth/d;->i:Ljava/lang/Object;

    iput p1, p0, Lth/d;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/Collection;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lth/d;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lth/d;->h:I

    .line 8
    .line 9
    iput-object p2, p0, Lth/d;->i:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Lya/g;ILjava/util/ArrayList;)V
    .locals 0

    .line 13
    const/4 p1, 0x3

    iput p1, p0, Lth/d;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lth/d;->h:I

    iput-object p3, p0, Lth/d;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lth/d;->g:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    sget-object v2, Lsf/n;->a:Lsf/n;

    .line 5
    .line 6
    iget v3, p0, Lth/d;->h:I

    .line 7
    .line 8
    iget-object v4, p0, Lth/d;->i:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v4, Ljava/util/ArrayList;

    .line 14
    .line 15
    check-cast p1, Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    check-cast p1, Landroid/view/ViewGroup;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object p1, v5

    .line 29
    :goto_0
    if-eqz p1, :cond_7

    .line 30
    .line 31
    new-array v0, v1, [I

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 34
    .line 35
    .line 36
    const/4 v6, 0x1

    .line 37
    aget v0, v0, v6

    .line 38
    .line 39
    sget-object v6, Lya/g;->e:Log/k;

    .line 40
    .line 41
    invoke-static {p1}, Luf/d;->d(Landroid/view/View;)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    add-int/2addr v6, v0

    .line 46
    invoke-static {p1}, Luf/d;->d(Landroid/view/View;)I

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    int-to-float v0, v0

    .line 51
    int-to-float v3, v3

    .line 52
    const v8, 0x3f1eb852    # 0.62f

    .line 53
    .line 54
    .line 55
    mul-float/2addr v8, v3

    .line 56
    cmpl-float v0, v0, v8

    .line 57
    .line 58
    if-ltz v0, :cond_7

    .line 59
    .line 60
    int-to-float v0, v6

    .line 61
    const v6, 0x3f6147ae    # 0.88f

    .line 62
    .line 63
    .line 64
    mul-float/2addr v6, v3

    .line 65
    cmpl-float v0, v0, v6

    .line 66
    .line 67
    if-ltz v0, :cond_7

    .line 68
    .line 69
    int-to-float v0, v7

    .line 70
    const v6, 0x3e8f5c29    # 0.28f

    .line 71
    .line 72
    .line 73
    mul-float/2addr v3, v6

    .line 74
    cmpg-float v0, v0, v3

    .line 75
    .line 76
    if-gtz v0, :cond_7

    .line 77
    .line 78
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 79
    .line 80
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 81
    .line 82
    .line 83
    const/4 v3, 0x0

    .line 84
    invoke-static {p1, v3, v0}, Lya/g;->b(Landroid/view/View;ILjava/util/LinkedHashSet;)V

    .line 85
    .line 86
    .line 87
    sget-object v6, Lya/g;->f:Ljava/util/Set;

    .line 88
    .line 89
    check-cast v6, Ljava/lang/Iterable;

    .line 90
    .line 91
    instance-of v7, v6, Ljava/util/Collection;

    .line 92
    .line 93
    if-eqz v7, :cond_1

    .line 94
    .line 95
    move-object v7, v6

    .line 96
    check-cast v7, Ljava/util/Collection;

    .line 97
    .line 98
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    if-eqz v7, :cond_1

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_1
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    :cond_2
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    if-eqz v7, :cond_6

    .line 114
    .line 115
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    check-cast v7, Ljava/lang/String;

    .line 120
    .line 121
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    if-eqz v8, :cond_3

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    :cond_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    if-eqz v9, :cond_2

    .line 137
    .line 138
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v9

    .line 142
    check-cast v9, Ljava/lang/String;

    .line 143
    .line 144
    invoke-static {v9, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v9

    .line 148
    if-eqz v9, :cond_4

    .line 149
    .line 150
    add-int/lit8 v3, v3, 0x1

    .line 151
    .line 152
    if-ltz v3, :cond_5

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_5
    invoke-static {}, La/a;->P0()V

    .line 156
    .line 157
    .line 158
    throw v5

    .line 159
    :cond_6
    :goto_2
    if-lt v3, v1, :cond_7

    .line 160
    .line 161
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    :cond_7
    return-object v2

    .line 165
    :pswitch_0
    check-cast v4, Ljava/lang/String;

    .line 166
    .line 167
    check-cast p1, Landroid/widget/ImageView;

    .line 168
    .line 169
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1, v4}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 173
    .line 174
    .line 175
    new-instance v0, Lq8/a;

    .line 176
    .line 177
    invoke-direct {v0, v3, v1}, Lq8/a;-><init>(II)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 181
    .line 182
    .line 183
    return-object v2

    .line 184
    :pswitch_1
    check-cast v4, Ljava/util/Collection;

    .line 185
    .line 186
    check-cast p1, Ljava/util/List;

    .line 187
    .line 188
    invoke-interface {p1, v3, v4}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    return-object p1

    .line 197
    :pswitch_2
    check-cast v4, Lth/i;

    .line 198
    .line 199
    move-object v6, p1

    .line 200
    check-cast v6, Lh1/d;

    .line 201
    .line 202
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    iget-object v5, v4, Lth/i;->u:Lth/a;

    .line 206
    .line 207
    iget-object v7, v4, Lth/i;->C:Lth/g;

    .line 208
    .line 209
    iget-object p1, v4, Lth/i;->J:Li0/j1;

    .line 210
    .line 211
    invoke-virtual {p1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    move-object v8, p1

    .line 216
    check-cast v8, Lv1/t;

    .line 217
    .line 218
    iget-object v9, v4, Lth/i;->x:Lfg/l;

    .line 219
    .line 220
    iget v10, p0, Lth/d;->h:I

    .line 221
    .line 222
    invoke-interface/range {v5 .. v10}, Lth/a;->a(Lh1/d;Lu2/c;Lv1/t;Lfg/l;I)V

    .line 223
    .line 224
    .line 225
    return-object v2

    .line 226
    nop

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
