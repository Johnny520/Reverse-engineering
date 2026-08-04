.class public final Lyyds/ᛱᛴᲈᛸ;
.super Lyyds/ᛲᛵᲇᛳ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛵᛸᛸᛷ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 2

    .line 1
    const-wide v0, -0xb012e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lyyds/ᛲᛵᲇᛳ;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lyyds/ᛱᛴᲈᛸ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final ᛲᛴᛳᛲ(Lyyds/ᛱᛸᛳᛵ;I)V
    .locals 2

    .line 1
    check-cast p1, Lyyds/ᲈᛸᛲᲁ;

    .line 2
    .line 3
    const-wide v0, -0xb021e68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lyyds/ᛱᛴᲈᛸ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lyyds/ᛷᲇᲇᛷ;

    .line 18
    .line 19
    const-wide v0, -0xa42de68a836eL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    iget-object p2, p1, Lyyds/ᲈᛸᛲᲁ;->ᛳᛸᛴᛶ:Landroid/widget/TextView;

    .line 28
    .line 29
    iget-object v0, p0, Lyyds/ᛷᲇᲇᛷ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    sget-object p2, Lyyds/ᲈᲈᛲᲁ;->ᛲᲈᲁ:Ljava/util/List;

    .line 35
    .line 36
    sget-object p2, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᛱᛵᛳᛳ()Ljava/util/Set;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    iget-object v0, p0, Lyyds/ᛷᲇᲇᛷ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 46
    .line 47
    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    xor-int/lit8 p2, p2, 0x1

    .line 52
    .line 53
    invoke-virtual {p1, p2}, Lyyds/ᲈᛸᛲᲁ;->ᛵᛶᛲᲀ(Z)V

    .line 54
    .line 55
    .line 56
    iget-object p2, p1, Lyyds/ᲈᛸᛲᲁ;->ᛶᲈᛴᲈ:Landroid/widget/TextView;

    .line 57
    .line 58
    new-instance v0, Lyyds/ᛶᛷᛲᲁ;

    .line 59
    .line 60
    const/16 v1, 0x14

    .line 61
    .line 62
    invoke-direct {v0, p0, v1, p1}, Lyyds/ᛶᛷᛲᲁ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final ᛲᲈᲁ()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛱᛴᲈᛸ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

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

.method public final ᲇᲇᲇᛱ(Landroid/view/ViewGroup;I)Lyyds/ᛱᛸᛳᛵ;
    .locals 7

    .line 1
    const-wide v0, -0xb018e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance p1, Landroid/widget/LinearLayout;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 20
    .line 21
    .line 22
    const/16 v0, 0x10

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 25
    .line 26
    .line 27
    const/16 v0, 0xa

    .line 28
    .line 29
    invoke-static {v0}, Lyyds/ᛶᲁᛳᛴ;->ᛷᲈᲈᲁ(I)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/4 v1, 0x6

    .line 34
    invoke-static {v1}, Lyyds/ᛶᲁᛳᛴ;->ᛷᲈᲈᲁ(I)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    const/16 v3, 0x8

    .line 39
    .line 40
    invoke-static {v3}, Lyyds/ᛶᲁᛳᛴ;->ᛷᲈᲈᲁ(I)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    invoke-static {v1}, Lyyds/ᛶᲁᛳᛴ;->ᛷᲈᲈᲁ(I)I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    invoke-virtual {p1, v0, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 49
    .line 50
    .line 51
    const v0, 0x6606004a

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, Landroid/content/Context;->getColor(I)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    const/16 v2, 0xc

    .line 59
    .line 60
    invoke-static {v2}, Lyyds/ᛶᲁᛳᛴ;->ᛷᲈᲈᲁ(I)I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    const v3, 0x66060075

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v3}, Landroid/content/Context;->getColor(I)I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    .line 72
    .line 73
    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, p2}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 80
    .line 81
    .line 82
    int-to-float v0, v2

    .line 83
    invoke-virtual {v4, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 84
    .line 85
    .line 86
    const/4 v0, 0x1

    .line 87
    invoke-virtual {v4, v0, v3}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 91
    .line 92
    .line 93
    new-instance v2, Lyyds/ᲇᲁᛲᲀ;

    .line 94
    .line 95
    const/16 v3, 0x30

    .line 96
    .line 97
    invoke-static {v3}, Lyyds/ᛶᲁᛳᛴ;->ᛷᲈᲈᲁ(I)I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    const/4 v4, -0x1

    .line 102
    invoke-direct {v2, v4, v3}, Lyyds/ᲇᲁᛲᲀ;-><init>(II)V

    .line 103
    .line 104
    .line 105
    invoke-static {v1}, Lyyds/ᛶᲁᛳᛴ;->ᛷᲈᲈᲁ(I)I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    iput v1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 110
    .line 111
    invoke-virtual {p1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 112
    .line 113
    .line 114
    new-instance v1, Landroid/widget/TextView;

    .line 115
    .line 116
    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 117
    .line 118
    .line 119
    const-wide v2, -0xb01fe68a836eL

    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 129
    .line 130
    .line 131
    const/high16 v2, 0x41900000    # 18.0f

    .line 132
    .line 133
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 134
    .line 135
    .line 136
    const/16 v2, 0x11

    .line 137
    .line 138
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 139
    .line 140
    .line 141
    const v3, 0x66060102

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, v3}, Landroid/content/Context;->getColor(I)I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 149
    .line 150
    .line 151
    new-instance v3, Landroid/widget/TextView;

    .line 152
    .line 153
    invoke-direct {v3, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 154
    .line 155
    .line 156
    const/high16 v5, 0x41700000    # 15.0f

    .line 157
    .line 158
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 159
    .line 160
    .line 161
    sget-object v5, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 162
    .line 163
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 164
    .line 165
    .line 166
    const v6, 0x660600f4

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0, v6}, Landroid/content/Context;->getColor(I)I

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 174
    .line 175
    .line 176
    new-instance v6, Landroid/widget/TextView;

    .line 177
    .line 178
    invoke-direct {v6, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 179
    .line 180
    .line 181
    const/high16 p0, 0x41500000    # 13.0f

    .line 182
    .line 183
    invoke-virtual {v6, p0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v6, v0}, Landroid/view/View;->setClickable(Z)V

    .line 193
    .line 194
    .line 195
    new-instance p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 196
    .line 197
    const/16 v0, 0x24

    .line 198
    .line 199
    invoke-static {v0}, Lyyds/ᛶᲁᛳᛴ;->ᛷᲈᲈᲁ(I)I

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    invoke-direct {p0, v0, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p1, v1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 207
    .line 208
    .line 209
    new-instance p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 210
    .line 211
    const/4 v0, -0x2

    .line 212
    const/high16 v1, 0x3f800000    # 1.0f

    .line 213
    .line 214
    invoke-direct {p0, p2, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1, v3, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 218
    .line 219
    .line 220
    new-instance p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 221
    .line 222
    const/16 p2, 0x3c

    .line 223
    .line 224
    invoke-static {p2}, Lyyds/ᛶᲁᛳᛴ;->ᛷᲈᲈᲁ(I)I

    .line 225
    .line 226
    .line 227
    move-result p2

    .line 228
    const/16 v0, 0x1c

    .line 229
    .line 230
    invoke-static {v0}, Lyyds/ᛶᲁᛳᛴ;->ᛷᲈᲈᲁ(I)I

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    invoke-direct {p0, p2, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1, v6, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 238
    .line 239
    .line 240
    new-instance p0, Lyyds/ᲈᛸᛲᲁ;

    .line 241
    .line 242
    invoke-direct {p0, p1, v3, v6}, Lyyds/ᲈᛸᛲᲁ;-><init>(Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 243
    .line 244
    .line 245
    return-object p0
.end method
