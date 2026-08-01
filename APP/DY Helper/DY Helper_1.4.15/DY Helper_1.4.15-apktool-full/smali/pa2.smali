.class public final Lpa2;
.super Landroid/widget/BaseAdapter;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final ε:Landroid/app/Activity;

.field public ζ:Ljava/util/List;

.field public final η:Lva2;

.field public final θ:Lil1;

.field public ι:Lla2;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/List;Lva2;Lil1;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lpa2;->ε:Landroid/app/Activity;

    .line 8
    .line 9
    iput-object p2, p0, Lpa2;->ζ:Ljava/util/List;

    .line 10
    .line 11
    iput-object p3, p0, Lpa2;->η:Lva2;

    .line 12
    .line 13
    iput-object p4, p0, Lpa2;->θ:Lil1;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lpa2;->ζ:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

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
    iget-object p0, p0, Lpa2;->ζ:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lqa2;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getItemId(I)J
    .locals 0

    .line 1
    iget-object p0, p0, Lpa2;->ζ:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lqa2;

    .line 8
    .line 9
    iget-object p0, p0, Lqa2;->γ:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    int-to-long p0, p0

    .line 16
    return-wide p0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iget-object v2, v0, Lpa2;->ε:Landroid/app/Activity;

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    sget-object v3, Lx01;->α:Lx01;

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const v4, 0x7f0c0060

    .line 18
    .line 19
    .line 20
    move-object/from16 v5, p3

    .line 21
    .line 22
    invoke-virtual {v3, v4, v5, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object/from16 v3, p2

    .line 28
    .line 29
    :goto_0
    iget-object v4, v0, Lpa2;->ζ:Ljava/util/List;

    .line 30
    .line 31
    move/from16 v5, p1

    .line 32
    .line 33
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    check-cast v4, Lqa2;

    .line 38
    .line 39
    invoke-static {v2}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    iget-object v6, v5, Lxx;->ρ:Ljava/lang/String;

    .line 44
    .line 45
    const v7, 0x7f09031d

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    check-cast v7, Landroid/widget/TextView;

    .line 53
    .line 54
    const v8, 0x7f09031c

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    check-cast v8, Landroid/widget/TextView;

    .line 62
    .line 63
    const v9, 0x7f090054

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    check-cast v9, Landroid/widget/Button;

    .line 71
    .line 72
    const v10, 0x7f090053

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v10

    .line 79
    check-cast v10, Landroid/widget/Button;

    .line 80
    .line 81
    iget-object v11, v4, Lqa2;->β:Ljava/lang/String;

    .line 82
    .line 83
    iget-wide v12, v4, Lqa2;->δ:J

    .line 84
    .line 85
    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 86
    .line 87
    .line 88
    new-instance v11, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    const-wide/16 v14, 0x3e8

    .line 94
    .line 95
    div-long v14, v12, v14

    .line 96
    .line 97
    const-wide/16 v16, 0x0

    .line 98
    .line 99
    cmp-long v16, v14, v16

    .line 100
    .line 101
    if-lez v16, :cond_1

    .line 102
    .line 103
    new-instance v1, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string v14, "s \u00b7 "

    .line 112
    .line 113
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    :cond_1
    const-wide/16 v14, 0x7148

    .line 124
    .line 125
    cmp-long v1, v12, v14

    .line 126
    .line 127
    if-lez v1, :cond_2

    .line 128
    .line 129
    const-string v12, "\u8d85\u8fc7 30 \u79d2\u4f1a\u88c1\u5207"

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_2
    const-string v12, "\u70b9\u51fb\u6761\u76ee\u4f7f\u7528\u6b64\u97f3\u9891"

    .line 133
    .line 134
    :goto_1
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v11

    .line 141
    invoke-virtual {v8, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 142
    .line 143
    .line 144
    iget-object v11, v5, Lxx;->ζ:Ljava/lang/String;

    .line 145
    .line 146
    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 147
    .line 148
    .line 149
    move-result v11

    .line 150
    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 151
    .line 152
    .line 153
    if-lez v1, :cond_3

    .line 154
    .line 155
    move-object v1, v6

    .line 156
    goto :goto_2

    .line 157
    :cond_3
    iget-object v1, v5, Lxx;->η:Ljava/lang/String;

    .line 158
    .line 159
    :goto_2
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    invoke-virtual {v8, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 164
    .line 165
    .line 166
    iget-object v1, v5, Lxx;->Α:Ljava/lang/String;

    .line 167
    .line 168
    iget-object v7, v5, Lxx;->γ:Ljava/lang/String;

    .line 169
    .line 170
    const/4 v8, 0x0

    .line 171
    invoke-static {v8, v2, v1, v7}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-virtual {v3, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 176
    .line 177
    .line 178
    new-instance v1, Loa2;

    .line 179
    .line 180
    invoke-direct {v1, v0, v4, v8}, Loa2;-><init>(Lpa2;Lqa2;I)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v9, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 184
    .line 185
    .line 186
    new-instance v1, Loa2;

    .line 187
    .line 188
    const/4 v2, 0x1

    .line 189
    invoke-direct {v1, v0, v4, v2}, Loa2;-><init>(Lpa2;Lqa2;I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v10, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 193
    .line 194
    .line 195
    new-instance v1, Loa2;

    .line 196
    .line 197
    const/4 v2, 0x2

    .line 198
    invoke-direct {v1, v0, v4, v2}, Loa2;-><init>(Lpa2;Lqa2;I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 202
    .line 203
    .line 204
    iget-object v1, v5, Lxx;->λ:Ljava/lang/String;

    .line 205
    .line 206
    invoke-virtual {v0, v9, v1}, Lpa2;->α(Landroid/widget/Button;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0, v10, v6}, Lpa2;->α(Landroid/widget/Button;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    return-object v3
.end method

.method public final α(Landroid/widget/Button;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lpa2;->ε:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-static {p0}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setMinWidth(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 18
    .line 19
    .line 20
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 25
    .line 26
    .line 27
    iget-object p2, v0, Lxx;->Α:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v0, v0, Lxx;->χ:Ljava/lang/String;

    .line 30
    .line 31
    const/16 v1, 0x8

    .line 32
    .line 33
    invoke-static {v1, p0, p2, v0}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method
