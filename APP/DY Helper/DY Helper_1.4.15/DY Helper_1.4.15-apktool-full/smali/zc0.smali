.class public final Lzc0;
.super Landroid/widget/BaseAdapter;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic ε:I

.field public final ζ:Ljava/lang/Object;

.field public η:Ljava/lang/Object;

.field public θ:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lzc0;->ε:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 23
    iput-object p1, p0, Lzc0;->ζ:Ljava/lang/Object;

    .line 24
    sget-object p1, Ljz;->ε:Ljz;

    iput-object p1, p0, Lzc0;->η:Ljava/lang/Object;

    .line 25
    sget-object p1, Lad0;->ε:Lad0;

    iput-object p1, p0, Lzc0;->θ:Ljava/io/Serializable;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lij0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lzc0;->ε:I

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lzc0;->ζ:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p2, p0, Lzc0;->η:Ljava/lang/Object;

    .line 13
    .line 14
    new-instance p1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lzc0;->θ:Ljava/io/Serializable;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Ljava/util/List;Ljava/util/LinkedHashMap;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lzc0;->ε:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 28
    iput-object p1, p0, Lzc0;->ζ:Ljava/lang/Object;

    .line 29
    iput-object p2, p0, Lzc0;->η:Ljava/lang/Object;

    .line 30
    iput-object p3, p0, Lzc0;->θ:Ljava/io/Serializable;

    return-void
.end method

.method public constructor <init>(Lum1;Landroid/view/LayoutInflater;Ljava/util/LinkedHashSet;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lzc0;->ε:I

    iput-object p1, p0, Lzc0;->ζ:Ljava/lang/Object;

    iput-object p2, p0, Lzc0;->η:Ljava/lang/Object;

    iput-object p3, p0, Lzc0;->θ:Ljava/io/Serializable;

    .line 26
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .line 1
    iget v0, p0, Lzc0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lzc0;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lum1;

    .line 9
    .line 10
    iget-object p0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :pswitch_0
    iget-object p0, p0, Lzc0;->η:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    :pswitch_1
    iget-object p0, p0, Lzc0;->θ:Ljava/io/Serializable;

    .line 29
    .line 30
    check-cast p0, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0

    .line 37
    :pswitch_2
    iget-object p0, p0, Lzc0;->η:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lzc0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lzc0;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lum1;

    .line 9
    .line 10
    iget-object p0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :pswitch_0
    iget-object p0, p0, Lzc0;->η:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :pswitch_1
    iget-object p0, p0, Lzc0;->θ:Ljava/io/Serializable;

    .line 29
    .line 30
    check-cast p0, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-static {p1, p0}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Lxi0;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_2
    iget-object p0, p0, Lzc0;->η:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Ljava/util/List;

    .line 42
    .line 43
    invoke-static {p1, p0}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Lxd0;

    .line 48
    .line 49
    return-object p0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getItemId(I)J
    .locals 1

    .line 1
    iget v0, p0, Lzc0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lzc0;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lum1;

    .line 9
    .line 10
    iget-object p0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Llu1;

    .line 19
    .line 20
    iget-object p0, p0, Llu1;->β:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    int-to-long p0, p0

    .line 27
    return-wide p0

    .line 28
    :pswitch_0
    int-to-long p0, p1

    .line 29
    return-wide p0

    .line 30
    :pswitch_1
    int-to-long p0, p1

    .line 31
    return-wide p0

    .line 32
    :pswitch_2
    int-to-long p0, p1

    .line 33
    return-wide p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 12

    .line 1
    iget v0, p0, Lzc0;->ε:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/16 v2, 0x8

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    iget-object p2, p0, Lzc0;->η:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p2, Landroid/view/LayoutInflater;

    .line 19
    .line 20
    const v0, 0x7f0c0050

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2, v0, p3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance p3, Lzu1;

    .line 31
    .line 32
    invoke-direct {p3, p2}, Lzu1;-><init>(Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    check-cast p3, Lzu1;

    .line 47
    .line 48
    :goto_0
    iget-object v0, p3, Lzu1;->γ:Landroid/widget/TextView;

    .line 49
    .line 50
    iget-object v1, p3, Lzu1;->β:Landroid/widget/TextView;

    .line 51
    .line 52
    iget-object p3, p3, Lzu1;->α:Landroid/widget/CheckBox;

    .line 53
    .line 54
    iget-object v2, p0, Lzc0;->ζ:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, Lum1;

    .line 57
    .line 58
    iget-object v2, v2, Lum1;->ε:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Ljava/util/List;

    .line 61
    .line 62
    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Llu1;

    .line 67
    .line 68
    iget-object p0, p0, Lzc0;->θ:Ljava/io/Serializable;

    .line 69
    .line 70
    check-cast p0, Ljava/util/LinkedHashSet;

    .line 71
    .line 72
    iget-object v2, p1, Llu1;->β:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {p0, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    invoke-virtual {p3, v4}, Landroid/view/View;->setClickable(Z)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p3, v4}, Landroid/view/View;->setFocusable(Z)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p3, p0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 85
    .line 86
    .line 87
    iget-object p0, p1, Llu1;->γ:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    .line 91
    .line 92
    const-string p0, "#1C2B1E"

    .line 93
    .line 94
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 99
    .line 100
    .line 101
    iget-object p0, p1, Llu1;->δ:Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    .line 105
    .line 106
    const-string p0, "#9EB09F"

    .line 107
    .line 108
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 113
    .line 114
    .line 115
    return-object p2

    .line 116
    :pswitch_0
    iget-object v0, p0, Lzc0;->ζ:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, Landroid/app/Activity;

    .line 119
    .line 120
    const-string v1, "theme"

    .line 121
    .line 122
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    if-nez p2, :cond_1

    .line 126
    .line 127
    sget-object p2, Lx01;->α:Lx01;

    .line 128
    .line 129
    invoke-virtual {p2, v0}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    const v5, 0x7f0c004d

    .line 134
    .line 135
    .line 136
    invoke-virtual {p2, v5, p3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    :cond_1
    iget-object p3, p0, Lzc0;->η:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast p3, Ljava/util/List;

    .line 143
    .line 144
    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    check-cast p1, Lku1;

    .line 149
    .line 150
    iget-object p0, p0, Lzc0;->θ:Ljava/io/Serializable;

    .line 151
    .line 152
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 153
    .line 154
    iget-object p3, p1, Lku1;->α:Ljava/lang/String;

    .line 155
    .line 156
    invoke-virtual {p0, p3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 161
    .line 162
    invoke-static {p0, p3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result p0

    .line 166
    const p3, 0x7f0901fe

    .line 167
    .line 168
    .line 169
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 170
    .line 171
    .line 172
    move-result-object p3

    .line 173
    check-cast p3, Landroid/widget/LinearLayout;

    .line 174
    .line 175
    const v5, 0x7f0900e2

    .line 176
    .line 177
    .line 178
    invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    check-cast v5, Landroid/widget/CheckBox;

    .line 183
    .line 184
    const v6, 0x7f090336

    .line 185
    .line 186
    .line 187
    invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    check-cast v6, Landroid/widget/TextView;

    .line 192
    .line 193
    invoke-virtual {v5, v4}, Landroid/view/View;->setClickable(Z)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v5, v4}, Landroid/view/View;->setFocusable(Z)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v5, p0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 200
    .line 201
    .line 202
    iget-object v4, p1, Lku1;->β:Ljava/lang/String;

    .line 203
    .line 204
    iget-object p1, p1, Lku1;->γ:Ljava/lang/String;

    .line 205
    .line 206
    new-instance v5, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    const-string v4, "\n"

    .line 215
    .line 216
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    invoke-virtual {v6, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 227
    .line 228
    .line 229
    if-eqz p0, :cond_3

    .line 230
    .line 231
    sget-object p1, Lbv1;->δ:Lqu1;

    .line 232
    .line 233
    if-eqz p1, :cond_2

    .line 234
    .line 235
    iget-object p1, p1, Lqu1;->π:Ljava/lang/String;

    .line 236
    .line 237
    :goto_1
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 238
    .line 239
    .line 240
    move-result p1

    .line 241
    goto :goto_2

    .line 242
    :cond_2
    invoke-static {v1}, Lln0;->и(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    throw v3

    .line 246
    :cond_3
    sget-object p1, Lbv1;->δ:Lqu1;

    .line 247
    .line 248
    if-eqz p1, :cond_7

    .line 249
    .line 250
    iget-object p1, p1, Lqu1;->η:Ljava/lang/String;

    .line 251
    .line 252
    goto :goto_1

    .line 253
    :goto_2
    invoke-virtual {v6, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 254
    .line 255
    .line 256
    if-eqz p0, :cond_5

    .line 257
    .line 258
    new-instance p0, Landroid/graphics/drawable/GradientDrawable;

    .line 259
    .line 260
    invoke-direct {p0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 261
    .line 262
    .line 263
    sget-object p1, Lbv1;->α:Lbv1;

    .line 264
    .line 265
    sget-object p1, Lbv1;->δ:Lqu1;

    .line 266
    .line 267
    if-eqz p1, :cond_4

    .line 268
    .line 269
    iget-object p1, p1, Lqu1;->ρ:Ljava/lang/String;

    .line 270
    .line 271
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 272
    .line 273
    .line 274
    move-result p1

    .line 275
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 276
    .line 277
    .line 278
    invoke-static {v0, v2}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 279
    .line 280
    .line 281
    move-result p1

    .line 282
    int-to-float p1, p1

    .line 283
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 284
    .line 285
    .line 286
    goto :goto_3

    .line 287
    :cond_4
    invoke-static {v1}, Lln0;->и(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    throw v3

    .line 291
    :cond_5
    new-instance p0, Landroid/graphics/drawable/GradientDrawable;

    .line 292
    .line 293
    invoke-direct {p0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 294
    .line 295
    .line 296
    sget-object p1, Lbv1;->α:Lbv1;

    .line 297
    .line 298
    sget-object p1, Lbv1;->δ:Lqu1;

    .line 299
    .line 300
    if-eqz p1, :cond_6

    .line 301
    .line 302
    iget-object p1, p1, Lqu1;->β:Ljava/lang/String;

    .line 303
    .line 304
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 305
    .line 306
    .line 307
    move-result p1

    .line 308
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 309
    .line 310
    .line 311
    invoke-static {v0, v2}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 312
    .line 313
    .line 314
    move-result p1

    .line 315
    int-to-float p1, p1

    .line 316
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 317
    .line 318
    .line 319
    :goto_3
    invoke-virtual {p3, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 320
    .line 321
    .line 322
    return-object p2

    .line 323
    :cond_6
    invoke-static {v1}, Lln0;->и(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    throw v3

    .line 327
    :cond_7
    invoke-static {v1}, Lln0;->и(Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    throw v3

    .line 331
    :pswitch_1
    if-nez p2, :cond_8

    .line 332
    .line 333
    sget-object p2, Lx01;->α:Lx01;

    .line 334
    .line 335
    iget-object v0, p0, Lzc0;->ζ:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v0, Landroid/app/Activity;

    .line 338
    .line 339
    invoke-virtual {p2, v0}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 340
    .line 341
    .line 342
    move-result-object p2

    .line 343
    const v0, 0x7f0c0051

    .line 344
    .line 345
    .line 346
    invoke-virtual {p2, v0, p3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 347
    .line 348
    .line 349
    move-result-object p2

    .line 350
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    new-instance v4, Ldi0;

    .line 354
    .line 355
    const p3, 0x7f0901c3

    .line 356
    .line 357
    .line 358
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 359
    .line 360
    .line 361
    move-result-object v5

    .line 362
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    const p3, 0x7f0901bf

    .line 366
    .line 367
    .line 368
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 369
    .line 370
    .line 371
    move-result-object p3

    .line 372
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    move-object v6, p3

    .line 376
    check-cast v6, Landroid/widget/CheckBox;

    .line 377
    .line 378
    const p3, 0x7f0901c1

    .line 379
    .line 380
    .line 381
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 382
    .line 383
    .line 384
    move-result-object p3

    .line 385
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    move-object v7, p3

    .line 389
    check-cast v7, Landroid/widget/TextView;

    .line 390
    .line 391
    const p3, 0x7f0901c2

    .line 392
    .line 393
    .line 394
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 395
    .line 396
    .line 397
    move-result-object p3

    .line 398
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    move-object v8, p3

    .line 402
    check-cast v8, Landroid/widget/TextView;

    .line 403
    .line 404
    const p3, 0x7f0901c0

    .line 405
    .line 406
    .line 407
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 408
    .line 409
    .line 410
    move-result-object p3

    .line 411
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    move-object v9, p3

    .line 415
    check-cast v9, Landroid/widget/TextView;

    .line 416
    .line 417
    invoke-direct/range {v4 .. v9}, Ldi0;-><init>(Landroid/view/View;Landroid/widget/CheckBox;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {p2, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    goto :goto_4

    .line 424
    :cond_8
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object p3

    .line 428
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    move-object v4, p3

    .line 432
    check-cast v4, Ldi0;

    .line 433
    .line 434
    :goto_4
    iget-object p3, p0, Lzc0;->θ:Ljava/io/Serializable;

    .line 435
    .line 436
    check-cast p3, Ljava/util/ArrayList;

    .line 437
    .line 438
    invoke-static {p1, p3}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object p1

    .line 442
    check-cast p1, Lxi0;

    .line 443
    .line 444
    if-nez p1, :cond_9

    .line 445
    .line 446
    :goto_5
    move-object v3, p2

    .line 447
    goto/16 :goto_9

    .line 448
    .line 449
    :cond_9
    iget-object p3, p0, Lzc0;->ζ:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast p3, Landroid/app/Activity;

    .line 452
    .line 453
    invoke-static {p3}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 454
    .line 455
    .line 456
    move-result-object p3

    .line 457
    invoke-virtual {p1}, Lxi0;->α()Z

    .line 458
    .line 459
    .line 460
    move-result v0

    .line 461
    iget-object v2, v4, Ldi0;->β:Landroid/widget/CheckBox;

    .line 462
    .line 463
    invoke-virtual {v2, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 464
    .line 465
    .line 466
    iget-object v2, v4, Ldi0;->β:Landroid/widget/CheckBox;

    .line 467
    .line 468
    iget-object v5, p0, Lzc0;->η:Ljava/lang/Object;

    .line 469
    .line 470
    check-cast v5, Lij0;

    .line 471
    .line 472
    iget-object v6, p1, Lxi0;->α:Ljava/lang/String;

    .line 473
    .line 474
    monitor-enter v5

    .line 475
    :try_start_0
    iget-object v7, v5, Lij0;->α:Ljava/util/LinkedHashSet;

    .line 476
    .line 477
    invoke-virtual {v7, v6}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 481
    monitor-exit v5

    .line 482
    invoke-virtual {v2, v6}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 483
    .line 484
    .line 485
    iget-object v2, v4, Ldi0;->γ:Landroid/widget/TextView;

    .line 486
    .line 487
    invoke-virtual {p1}, Lxi0;->β()Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v5

    .line 491
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 492
    .line 493
    .line 494
    iget-object v2, v4, Ldi0;->γ:Landroid/widget/TextView;

    .line 495
    .line 496
    iget-object v5, p3, Lxx;->ζ:Ljava/lang/String;

    .line 497
    .line 498
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 499
    .line 500
    .line 501
    move-result v5

    .line 502
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 503
    .line 504
    .line 505
    iget-object v2, v4, Ldi0;->ε:Landroid/widget/TextView;

    .line 506
    .line 507
    iget-wide v5, p1, Lxi0;->β:J

    .line 508
    .line 509
    const-wide/16 v7, 0x0

    .line 510
    .line 511
    cmp-long v7, v5, v7

    .line 512
    .line 513
    iget-object v8, p1, Lxi0;->α:Ljava/lang/String;

    .line 514
    .line 515
    if-lez v7, :cond_a

    .line 516
    .line 517
    new-instance v7, Ljava/lang/StringBuilder;

    .line 518
    .line 519
    const-string v9, "UID: "

    .line 520
    .line 521
    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    const-string v5, " \u00b7 CID: "

    .line 528
    .line 529
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v5

    .line 539
    goto :goto_6

    .line 540
    :cond_a
    const-string v5, "CID: "

    .line 541
    .line 542
    invoke-virtual {v5, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v5

    .line 546
    :goto_6
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 547
    .line 548
    .line 549
    iget-object v2, v4, Ldi0;->ε:Landroid/widget/TextView;

    .line 550
    .line 551
    iget-object v5, p3, Lxx;->η:Ljava/lang/String;

    .line 552
    .line 553
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 554
    .line 555
    .line 556
    move-result v5

    .line 557
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 558
    .line 559
    .line 560
    iget-object v2, v4, Ldi0;->δ:Landroid/widget/TextView;

    .line 561
    .line 562
    iget-object v5, p1, Lxi0;->ε:Lnj0;

    .line 563
    .line 564
    iget-object v5, v5, Lnj0;->ε:Ljava/lang/String;

    .line 565
    .line 566
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 567
    .line 568
    .line 569
    sget-object v2, Lmi0;->α:Landroid/os/Handler;

    .line 570
    .line 571
    iget-object p1, p1, Lxi0;->ε:Lnj0;

    .line 572
    .line 573
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 574
    .line 575
    .line 576
    move-result p1

    .line 577
    if-eqz p1, :cond_f

    .line 578
    .line 579
    if-eq p1, v1, :cond_e

    .line 580
    .line 581
    const/4 v1, 0x2

    .line 582
    if-eq p1, v1, :cond_d

    .line 583
    .line 584
    const/4 v1, 0x3

    .line 585
    if-eq p1, v1, :cond_c

    .line 586
    .line 587
    const/4 v1, 0x4

    .line 588
    if-ne p1, v1, :cond_b

    .line 589
    .line 590
    iget-object p1, p3, Lxx;->φ:Ljava/lang/String;

    .line 591
    .line 592
    iget-object v1, p3, Lxx;->χ:Ljava/lang/String;

    .line 593
    .line 594
    new-instance v2, Ll91;

    .line 595
    .line 596
    invoke-direct {v2, p1, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    goto :goto_7

    .line 600
    :cond_b
    invoke-static {}, Lγ;->κ()V

    .line 601
    .line 602
    .line 603
    goto :goto_9

    .line 604
    :cond_c
    iget-object p1, p3, Lxx;->ρ:Ljava/lang/String;

    .line 605
    .line 606
    iget-object v1, p3, Lxx;->σ:Ljava/lang/String;

    .line 607
    .line 608
    new-instance v2, Ll91;

    .line 609
    .line 610
    invoke-direct {v2, p1, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 611
    .line 612
    .line 613
    goto :goto_7

    .line 614
    :cond_d
    iget-object p1, p3, Lxx;->λ:Ljava/lang/String;

    .line 615
    .line 616
    iget-object v1, p3, Lxx;->μ:Ljava/lang/String;

    .line 617
    .line 618
    new-instance v2, Ll91;

    .line 619
    .line 620
    invoke-direct {v2, p1, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 621
    .line 622
    .line 623
    goto :goto_7

    .line 624
    :cond_e
    iget-object p1, p3, Lxx;->ι:Ljava/lang/String;

    .line 625
    .line 626
    iget-object v1, p3, Lxx;->κ:Ljava/lang/String;

    .line 627
    .line 628
    new-instance v2, Ll91;

    .line 629
    .line 630
    invoke-direct {v2, p1, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 631
    .line 632
    .line 633
    goto :goto_7

    .line 634
    :cond_f
    iget-object p1, p3, Lxx;->ν:Ljava/lang/String;

    .line 635
    .line 636
    iget-object v1, p3, Lxx;->ξ:Ljava/lang/String;

    .line 637
    .line 638
    new-instance v2, Ll91;

    .line 639
    .line 640
    invoke-direct {v2, p1, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 641
    .line 642
    .line 643
    :goto_7
    iget-object p1, v4, Ldi0;->δ:Landroid/widget/TextView;

    .line 644
    .line 645
    iget-object v1, v2, Ll91;->ε:Ljava/lang/Object;

    .line 646
    .line 647
    check-cast v1, Ljava/lang/String;

    .line 648
    .line 649
    invoke-static {v1}, Ljx0;->ξ(Ljava/lang/String;)I

    .line 650
    .line 651
    .line 652
    move-result v1

    .line 653
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 654
    .line 655
    .line 656
    iget-object p1, v4, Ldi0;->δ:Landroid/widget/TextView;

    .line 657
    .line 658
    iget-object p0, p0, Lzc0;->ζ:Ljava/lang/Object;

    .line 659
    .line 660
    check-cast p0, Landroid/app/Activity;

    .line 661
    .line 662
    iget-object v1, v2, Ll91;->ζ:Ljava/lang/Object;

    .line 663
    .line 664
    check-cast v1, Ljava/lang/String;

    .line 665
    .line 666
    const/4 v2, 0x6

    .line 667
    invoke-static {v2, p0, v1}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 668
    .line 669
    .line 670
    move-result-object p0

    .line 671
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 672
    .line 673
    .line 674
    iget-object p0, v4, Ldi0;->α:Landroid/view/View;

    .line 675
    .line 676
    if-eqz v0, :cond_10

    .line 677
    .line 678
    const/high16 p1, 0x3f800000    # 1.0f

    .line 679
    .line 680
    goto :goto_8

    .line 681
    :cond_10
    const p1, 0x3f051eb8    # 0.52f

    .line 682
    .line 683
    .line 684
    :goto_8
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 685
    .line 686
    .line 687
    iget-object p0, v4, Ldi0;->α:Landroid/view/View;

    .line 688
    .line 689
    iget-object p1, p3, Lxx;->Α:Ljava/lang/String;

    .line 690
    .line 691
    invoke-static {p1}, Ljx0;->Ω(Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 692
    .line 693
    .line 694
    move-result-object p1

    .line 695
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 696
    .line 697
    .line 698
    goto/16 :goto_5

    .line 699
    .line 700
    :goto_9
    return-object v3

    .line 701
    :catchall_0
    move-exception v0

    .line 702
    move-object p0, v0

    .line 703
    :try_start_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 704
    throw p0

    .line 705
    :pswitch_2
    const-string v0, "\u6296\u97f3\u53f7\uff1a"

    .line 706
    .line 707
    iget-object v3, p0, Lzc0;->ζ:Ljava/lang/Object;

    .line 708
    .line 709
    check-cast v3, Landroid/app/Activity;

    .line 710
    .line 711
    if-nez p2, :cond_11

    .line 712
    .line 713
    sget-object p2, Lx01;->α:Lx01;

    .line 714
    .line 715
    invoke-virtual {p2, v3}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 716
    .line 717
    .line 718
    move-result-object p2

    .line 719
    const v5, 0x7f0c004f

    .line 720
    .line 721
    .line 722
    invoke-virtual {p2, v5, p3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 723
    .line 724
    .line 725
    move-result-object p2

    .line 726
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 727
    .line 728
    .line 729
    new-instance p3, Lod0;

    .line 730
    .line 731
    const v5, 0x7f090173

    .line 732
    .line 733
    .line 734
    invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 735
    .line 736
    .line 737
    move-result-object v5

    .line 738
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 739
    .line 740
    .line 741
    const v6, 0x7f090172

    .line 742
    .line 743
    .line 744
    invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 745
    .line 746
    .line 747
    move-result-object v6

    .line 748
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 749
    .line 750
    .line 751
    check-cast v6, Landroid/widget/TextView;

    .line 752
    .line 753
    const v7, 0x7f090171

    .line 754
    .line 755
    .line 756
    invoke-virtual {p2, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 757
    .line 758
    .line 759
    move-result-object v7

    .line 760
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 761
    .line 762
    .line 763
    check-cast v7, Landroid/widget/TextView;

    .line 764
    .line 765
    const v8, 0x7f090170

    .line 766
    .line 767
    .line 768
    invoke-virtual {p2, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 769
    .line 770
    .line 771
    move-result-object v8

    .line 772
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 773
    .line 774
    .line 775
    check-cast v8, Landroid/widget/TextView;

    .line 776
    .line 777
    invoke-direct {p3, v5, v6, v7, v8}, Lod0;-><init>(Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 778
    .line 779
    .line 780
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 781
    .line 782
    .line 783
    goto :goto_a

    .line 784
    :cond_11
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object p3

    .line 788
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 789
    .line 790
    .line 791
    check-cast p3, Lod0;

    .line 792
    .line 793
    :goto_a
    iget-object v5, p3, Lod0;->γ:Landroid/widget/TextView;

    .line 794
    .line 795
    iget-object v6, p3, Lod0;->β:Landroid/widget/TextView;

    .line 796
    .line 797
    iget-object v7, p3, Lod0;->δ:Landroid/widget/TextView;

    .line 798
    .line 799
    iget-object v8, p0, Lzc0;->η:Ljava/lang/Object;

    .line 800
    .line 801
    check-cast v8, Ljava/util/List;

    .line 802
    .line 803
    invoke-static {p1, v8}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 804
    .line 805
    .line 806
    move-result-object p1

    .line 807
    check-cast p1, Lxd0;

    .line 808
    .line 809
    if-nez p1, :cond_12

    .line 810
    .line 811
    goto/16 :goto_11

    .line 812
    .line 813
    :cond_12
    iget-object v8, p1, Lxd0;->α:Ljava/lang/String;

    .line 814
    .line 815
    invoke-static {v3}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 816
    .line 817
    .line 818
    move-result-object v9

    .line 819
    iget-object v10, p1, Lxd0;->ε:Ljava/lang/String;

    .line 820
    .line 821
    invoke-static {v10}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 822
    .line 823
    .line 824
    move-result v11

    .line 825
    if-eqz v11, :cond_14

    .line 826
    .line 827
    invoke-static {v8}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 828
    .line 829
    .line 830
    move-result v10

    .line 831
    if-nez v10, :cond_13

    .line 832
    .line 833
    const-string v10, "UID "

    .line 834
    .line 835
    invoke-virtual {v10, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 836
    .line 837
    .line 838
    move-result-object v10

    .line 839
    goto :goto_b

    .line 840
    :cond_13
    const-string v10, "\u5df2\u8bc6\u522b\u8054\u7cfb\u4eba"

    .line 841
    .line 842
    :cond_14
    :goto_b
    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 843
    .line 844
    .line 845
    iget-object v10, v9, Lxx;->ζ:Ljava/lang/String;

    .line 846
    .line 847
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 848
    .line 849
    .line 850
    move-result v10

    .line 851
    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 852
    .line 853
    .line 854
    iget-object v6, p1, Lxd0;->γ:Ljava/lang/String;

    .line 855
    .line 856
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 857
    .line 858
    .line 859
    move-result v10

    .line 860
    if-eqz v10, :cond_15

    .line 861
    .line 862
    iget-object v6, p1, Lxd0;->δ:Ljava/lang/String;

    .line 863
    .line 864
    :cond_15
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 865
    .line 866
    .line 867
    move-result p1

    .line 868
    if-nez p1, :cond_16

    .line 869
    .line 870
    invoke-static {v8}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 871
    .line 872
    .line 873
    move-result p1

    .line 874
    if-nez p1, :cond_16

    .line 875
    .line 876
    const-string p1, " \u00b7 UID\uff1a"

    .line 877
    .line 878
    invoke-static {v0, v6, p1, v8}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 879
    .line 880
    .line 881
    move-result-object p1

    .line 882
    goto :goto_c

    .line 883
    :cond_16
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 884
    .line 885
    .line 886
    move-result p1

    .line 887
    if-nez p1, :cond_17

    .line 888
    .line 889
    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 890
    .line 891
    .line 892
    move-result-object p1

    .line 893
    goto :goto_c

    .line 894
    :cond_17
    invoke-static {v8}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 895
    .line 896
    .line 897
    move-result p1

    .line 898
    if-nez p1, :cond_18

    .line 899
    .line 900
    const-string p1, "UID\uff1a"

    .line 901
    .line 902
    invoke-virtual {p1, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 903
    .line 904
    .line 905
    move-result-object p1

    .line 906
    goto :goto_c

    .line 907
    :cond_18
    const-string p1, "SecUID \u5df2\u8bb0\u5f55"

    .line 908
    .line 909
    :goto_c
    invoke-virtual {v5, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 910
    .line 911
    .line 912
    iget-object p1, v9, Lxx;->η:Ljava/lang/String;

    .line 913
    .line 914
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 915
    .line 916
    .line 917
    move-result p1

    .line 918
    invoke-virtual {v5, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 919
    .line 920
    .line 921
    iget-object p1, p3, Lod0;->α:Landroid/view/View;

    .line 922
    .line 923
    iget-object p3, v9, Lxx;->Α:Ljava/lang/String;

    .line 924
    .line 925
    iget-object v0, v9, Lxx;->γ:Ljava/lang/String;

    .line 926
    .line 927
    invoke-static {v2, v3, p3, v0}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 928
    .line 929
    .line 930
    move-result-object p3

    .line 931
    invoke-virtual {p1, p3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 932
    .line 933
    .line 934
    iget-object p0, p0, Lzc0;->θ:Ljava/io/Serializable;

    .line 935
    .line 936
    check-cast p0, Lad0;

    .line 937
    .line 938
    sget-object p1, Lad0;->ε:Lad0;

    .line 939
    .line 940
    if-ne p0, p1, :cond_19

    .line 941
    .line 942
    goto :goto_d

    .line 943
    :cond_19
    move v1, v4

    .line 944
    :goto_d
    if-eqz v1, :cond_1a

    .line 945
    .line 946
    const-string p0, "\u6dfb\u52a0"

    .line 947
    .line 948
    goto :goto_e

    .line 949
    :cond_1a
    const-string p0, "\u6062\u590d"

    .line 950
    .line 951
    :goto_e
    invoke-virtual {v7, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 952
    .line 953
    .line 954
    if-eqz v1, :cond_1b

    .line 955
    .line 956
    iget-object p0, v9, Lxx;->ι:Ljava/lang/String;

    .line 957
    .line 958
    goto :goto_f

    .line 959
    :cond_1b
    iget-object p0, v9, Lxx;->ρ:Ljava/lang/String;

    .line 960
    .line 961
    :goto_f
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 962
    .line 963
    .line 964
    move-result p0

    .line 965
    invoke-virtual {v7, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 966
    .line 967
    .line 968
    if-eqz v1, :cond_1c

    .line 969
    .line 970
    iget-object p0, v9, Lxx;->κ:Ljava/lang/String;

    .line 971
    .line 972
    goto :goto_10

    .line 973
    :cond_1c
    iget-object p0, v9, Lxx;->σ:Ljava/lang/String;

    .line 974
    .line 975
    :goto_10
    const/16 p1, 0x63

    .line 976
    .line 977
    invoke-static {p1, v3, p0}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 978
    .line 979
    .line 980
    move-result-object p0

    .line 981
    invoke-virtual {v7, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 982
    .line 983
    .line 984
    :goto_11
    return-object p2

    .line 985
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public hasStableIds()Z
    .locals 1

    .line 1
    iget v0, p0, Lzc0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/widget/BaseAdapter;->hasStableIds()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
