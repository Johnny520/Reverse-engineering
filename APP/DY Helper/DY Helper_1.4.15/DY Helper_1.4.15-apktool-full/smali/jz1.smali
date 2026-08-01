.class public abstract Ljz1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/LinkedHashSet;

.field public static final β:Landroid/os/Handler;

.field public static γ:Lhy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ljz1;->α:Ljava/util/LinkedHashSet;

    .line 7
    .line 8
    new-instance v0, Landroid/os/Handler;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Ljz1;->β:Landroid/os/Handler;

    .line 18
    .line 19
    return-void
.end method

.method public static Α(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Ljx0;->ξ(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-virtual {p0, p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/16 v0, 0x8

    .line 21
    .line 22
    invoke-static {v0, p1, p2}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static α(Landroid/view/View;Lxx;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    instance-of v2, p0, Landroid/widget/TextView;

    .line 10
    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    if-eq v2, v3, :cond_0

    .line 19
    .line 20
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 21
    .line 22
    if-ne v0, v3, :cond_1

    .line 23
    .line 24
    :cond_0
    iget-object v0, p1, Lxx;->δ:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 31
    .line 32
    .line 33
    :cond_1
    if-eqz v1, :cond_2

    .line 34
    .line 35
    check-cast p0, Landroid/view/ViewGroup;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v1, 0x0

    .line 42
    :goto_0
    if-ge v1, v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {v2, p1}, Ljz1;->α(Landroid/view/View;Lxx;)V

    .line 52
    .line 53
    .line 54
    add-int/lit8 v1, v1, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    return-void
.end method

.method public static β(Landroid/app/Activity;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lxx;La80;)Landroid/widget/LinearLayout;
    .locals 16

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v6, p4

    .line 6
    .line 7
    new-instance v1, Lum1;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    move-object/from16 v2, p3

    .line 13
    .line 14
    iput-object v2, v1, Lum1;->ε:Ljava/lang/Object;

    .line 15
    .line 16
    new-instance v4, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-static {v7, v2}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    .line 23
    .line 24
    .line 25
    move-result-object v8

    .line 26
    const/4 v9, 0x6

    .line 27
    const/4 v10, 0x0

    .line 28
    const/high16 v11, 0x41500000    # 13.0f

    .line 29
    .line 30
    const/4 v12, 0x0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    new-instance v3, Landroid/widget/TextView;

    .line 41
    .line 42
    invoke-direct {v3, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, v11}, Landroid/widget/TextView;->setTextSize(F)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v10, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 52
    .line 53
    .line 54
    iget-object v0, v6, Lxx;->ζ:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, v12}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 64
    .line 65
    .line 66
    invoke-static {v7, v9}, Ljz1;->ζ(Landroid/content/Context;I)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-virtual {v3, v12, v12, v12, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v8, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 74
    .line 75
    .line 76
    :cond_1
    :goto_0
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v13

    .line 80
    move v0, v12

    .line 81
    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_4

    .line 86
    .line 87
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    add-int/lit8 v14, v0, 0x1

    .line 92
    .line 93
    if-ltz v0, :cond_3

    .line 94
    .line 95
    check-cast v2, Lfz1;

    .line 96
    .line 97
    new-instance v15, Landroid/widget/TextView;

    .line 98
    .line 99
    invoke-direct {v15, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 100
    .line 101
    .line 102
    iget-object v3, v2, Lfz1;->α:Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {v15, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v15, v11}, Landroid/widget/TextView;->setTextSize(F)V

    .line 108
    .line 109
    .line 110
    const/16 v3, 0x10

    .line 111
    .line 112
    invoke-virtual {v15, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 113
    .line 114
    .line 115
    const/16 v3, 0x26

    .line 116
    .line 117
    invoke-static {v7, v3}, Ljz1;->ζ(Landroid/content/Context;I)I

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    invoke-virtual {v15, v5}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 122
    .line 123
    .line 124
    const/16 v5, 0xa

    .line 125
    .line 126
    move-object/from16 p3, v10

    .line 127
    .line 128
    invoke-static {v7, v5}, Ljz1;->ζ(Landroid/content/Context;I)I

    .line 129
    .line 130
    .line 131
    move-result v10

    .line 132
    invoke-static {v7, v5}, Ljz1;->ζ(Landroid/content/Context;I)I

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    invoke-virtual {v15, v10, v12, v5, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 137
    .line 138
    .line 139
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 140
    .line 141
    const/4 v10, -0x1

    .line 142
    invoke-static {v7, v3}, Ljz1;->ζ(Landroid/content/Context;I)I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    invoke-direct {v5, v10, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 147
    .line 148
    .line 149
    if-lez v0, :cond_2

    .line 150
    .line 151
    invoke-static {v7, v9}, Ljz1;->ζ(Landroid/content/Context;I)I

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    iput v0, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 156
    .line 157
    :cond_2
    invoke-virtual {v15, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 158
    .line 159
    .line 160
    new-instance v0, Ltt1;

    .line 161
    .line 162
    move-object/from16 v5, p2

    .line 163
    .line 164
    move-object/from16 v3, p5

    .line 165
    .line 166
    invoke-direct/range {v0 .. v7}, Ltt1;-><init>(Lum1;Lfz1;La80;Ljava/util/ArrayList;Ljava/util/List;Lxx;Landroid/app/Activity;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v15, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v4, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    invoke-virtual {v8, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 176
    .line 177
    .line 178
    move-object/from16 v10, p3

    .line 179
    .line 180
    move v0, v14

    .line 181
    goto :goto_1

    .line 182
    :cond_3
    move-object/from16 p3, v10

    .line 183
    .line 184
    invoke-static {}, Lyh;->х()V

    .line 185
    .line 186
    .line 187
    throw p3

    .line 188
    :cond_4
    move-object/from16 v5, p2

    .line 189
    .line 190
    invoke-static {v4, v1, v5, v6, v7}, Ljz1;->γ(Ljava/util/ArrayList;Lum1;Ljava/util/List;Lxx;Landroid/app/Activity;)V

    .line 191
    .line 192
    .line 193
    return-object v8
.end method

.method public static final γ(Ljava/util/ArrayList;Lum1;Ljava/util/List;Lxx;Landroid/app/Activity;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_5

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroid/widget/TextView;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast v1, Ljava/lang/String;

    .line 25
    .line 26
    iget-object v2, p1, Lum1;->ε:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    const-string v3, "\u2713 "

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    const-string v3, ""

    .line 38
    .line 39
    :goto_1
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_4

    .line 48
    .line 49
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    check-cast v5, Lfz1;

    .line 54
    .line 55
    iget-object v6, v5, Lfz1;->α:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v6, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eqz v6, :cond_1

    .line 62
    .line 63
    iget-object v1, v5, Lfz1;->β:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    .line 71
    .line 72
    if-eqz v2, :cond_2

    .line 73
    .line 74
    iget-object v1, p3, Lxx;->ι:Ljava/lang/String;

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    iget-object v1, p3, Lxx;->ζ:Ljava/lang/String;

    .line 78
    .line 79
    :goto_2
    const/4 v3, 0x0

    .line 80
    invoke-static {v1, v0, v3, v2}, Llz1;->ω(Ljava/lang/String;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 81
    .line 82
    .line 83
    iget-object v1, p3, Lxx;->Α:Ljava/lang/String;

    .line 84
    .line 85
    if-eqz v2, :cond_3

    .line 86
    .line 87
    iget-object v2, p3, Lxx;->κ:Ljava/lang/String;

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_3
    iget-object v2, p3, Lxx;->γ:Ljava/lang/String;

    .line 91
    .line 92
    :goto_3
    const/16 v3, 0xa

    .line 93
    .line 94
    invoke-static {v3, p4, v1, v2}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 103
    .line 104
    const-string p1, "Collection contains no element matching the predicate."

    .line 105
    .line 106
    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw p0

    .line 110
    :cond_5
    return-void
.end method

.method public static δ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp70;)Landroid/widget/TextView;
    .locals 3

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    const/high16 p1, 0x41300000    # 11.0f

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {v0, p1, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 17
    .line 18
    .line 19
    invoke-static {p2}, Ljx0;->ξ(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 24
    .line 25
    .line 26
    const/16 p1, 0x11

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 29
    .line 30
    .line 31
    const/16 p1, 0x9

    .line 32
    .line 33
    invoke-static {p0, p1}, Ljz1;->ζ(Landroid/content/Context;I)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    const/4 v1, 0x5

    .line 38
    invoke-static {p0, v1}, Ljz1;->ζ(Landroid/content/Context;I)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-static {p0, p1}, Ljz1;->ζ(Landroid/content/Context;I)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-static {p0, v1}, Ljz1;->ζ(Landroid/content/Context;I)I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    invoke-virtual {v0, p2, v2, p1, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iget-object p1, p1, Lxx;->Α:Ljava/lang/String;

    .line 58
    .line 59
    const/16 p2, 0x63

    .line 60
    .line 61
    invoke-static {p2, p0, p1, p3}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 66
    .line 67
    .line 68
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 69
    .line 70
    const/4 p2, -0x2

    .line 71
    invoke-direct {p1, p2, p2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 72
    .line 73
    .line 74
    const/4 p2, 0x6

    .line 75
    invoke-static {p0, p2}, Ljz1;->ζ(Landroid/content/Context;I)I

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 83
    .line 84
    .line 85
    new-instance p0, Lb9;

    .line 86
    .line 87
    const/16 p1, 0x8

    .line 88
    .line 89
    invoke-direct {p0, p1, p4}, Lb9;-><init>(ILp70;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 93
    .line 94
    .line 95
    return-object v0
.end method

.method public static ε(Lip1;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_2

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq p0, v0, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-ne p0, v0, :cond_0

    .line 12
    .line 13
    const-string p0, "\u5173"

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-static {}, Lγ;->κ()V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_1
    const-string p0, "\u5f00"

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_2
    const-string p0, "\u8ddf"

    .line 25
    .line 26
    return-object p0
.end method

.method public static ζ(Landroid/content/Context;I)I
    .locals 0

    .line 1
    int-to-float p1, p1

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 11
    .line 12
    mul-float/2addr p1, p0

    .line 13
    const/high16 p0, 0x3f000000    # 0.5f

    .line 14
    .line 15
    add-float/2addr p1, p0

    .line 16
    float-to-int p0, p1

    .line 17
    return p0
.end method

.method public static η(Landroid/view/View;La80;)V
    .locals 3

    .line 1
    instance-of v0, p0, Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {p1, p0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p0, Landroid/view/ViewGroup;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    :goto_0
    if-ge v1, v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {v2, p1}, Ljz1;->η(Landroid/view/View;La80;)V

    .line 29
    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
.end method

.method public static θ(Landroid/view/View;Landroid/view/DragEvent;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Landroid/view/DragEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x4

    .line 6
    if-eq v0, v1, :cond_9

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/DragEvent;->getAction()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x3

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    goto/16 :goto_4

    .line 16
    .line 17
    :cond_0
    invoke-virtual {p1}, Landroid/view/DragEvent;->getAction()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x6

    .line 22
    const/4 v2, 0x2

    .line 23
    if-eq v0, v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/view/DragEvent;->getAction()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v3, 0x5

    .line 30
    if-eq v0, v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/view/DragEvent;->getAction()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eq v0, v1, :cond_1

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :goto_0
    instance-of v3, v0, Landroid/view/View;

    .line 44
    .line 45
    if-eqz v3, :cond_3

    .line 46
    .line 47
    instance-of v3, v0, Landroid/widget/ScrollView;

    .line 48
    .line 49
    if-eqz v3, :cond_2

    .line 50
    .line 51
    check-cast v0, Landroid/widget/ScrollView;

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    check-cast v0, Landroid/view/View;

    .line 55
    .line 56
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    goto :goto_0

    .line 61
    :cond_3
    const/4 v0, 0x0

    .line 62
    :goto_1
    if-nez v0, :cond_4

    .line 63
    .line 64
    :goto_2
    return-void

    .line 65
    :cond_4
    new-array v3, v2, [I

    .line 66
    .line 67
    new-array v2, v2, [I

    .line 68
    .line 69
    invoke-virtual {p0, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Landroid/view/DragEvent;->getY()F

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    const/4 v4, 0x1

    .line 80
    aget v3, v3, v4

    .line 81
    .line 82
    int-to-float v3, v3

    .line 83
    add-float/2addr p1, v3

    .line 84
    aget v2, v2, v4

    .line 85
    .line 86
    int-to-float v2, v2

    .line 87
    sub-float/2addr p1, v2

    .line 88
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    const/16 v3, 0x30

    .line 96
    .line 97
    invoke-static {v2, v3}, Ljz1;->ζ(Landroid/content/Context;I)I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    const/16 v3, 0x40

    .line 109
    .line 110
    invoke-static {p0, v3}, Ljz1;->ζ(Landroid/content/Context;I)I

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    sub-int/2addr v3, p0

    .line 119
    int-to-float v2, v2

    .line 120
    cmpg-float v4, p1, v2

    .line 121
    .line 122
    const/16 v5, 0x16

    .line 123
    .line 124
    const/high16 v6, 0x3f800000    # 1.0f

    .line 125
    .line 126
    const v7, 0x3e4ccccd    # 0.2f

    .line 127
    .line 128
    .line 129
    if-gez v4, :cond_5

    .line 130
    .line 131
    sub-float p0, v2, p1

    .line 132
    .line 133
    div-float/2addr p0, v2

    .line 134
    invoke-static {p0, v7, v6}, Lj81;->λ(FFF)F

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    int-to-float p1, v1

    .line 139
    int-to-float v1, v5

    .line 140
    mul-float/2addr p0, v1

    .line 141
    add-float/2addr p0, p1

    .line 142
    float-to-int p0, p0

    .line 143
    neg-int p0, p0

    .line 144
    goto :goto_3

    .line 145
    :cond_5
    int-to-float v2, v3

    .line 146
    cmpl-float v3, p1, v2

    .line 147
    .line 148
    if-lez v3, :cond_6

    .line 149
    .line 150
    sub-float/2addr p1, v2

    .line 151
    int-to-float p0, p0

    .line 152
    div-float/2addr p1, p0

    .line 153
    invoke-static {p1, v7, v6}, Lj81;->λ(FFF)F

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    int-to-float p1, v1

    .line 158
    int-to-float v1, v5

    .line 159
    mul-float/2addr p0, v1

    .line 160
    add-float/2addr p0, p1

    .line 161
    float-to-int p0, p0

    .line 162
    goto :goto_3

    .line 163
    :cond_6
    const/4 p0, 0x0

    .line 164
    :goto_3
    if-nez p0, :cond_7

    .line 165
    .line 166
    invoke-static {}, Ljz1;->ω()V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :cond_7
    sget-object p1, Ljz1;->γ:Lhy;

    .line 171
    .line 172
    sget-object v1, Ljz1;->β:Landroid/os/Handler;

    .line 173
    .line 174
    if-eqz p1, :cond_8

    .line 175
    .line 176
    invoke-virtual {v1, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 177
    .line 178
    .line 179
    :cond_8
    new-instance p1, Lhy;

    .line 180
    .line 181
    invoke-direct {p1, v0, p0}, Lhy;-><init>(Landroid/widget/ScrollView;I)V

    .line 182
    .line 183
    .line 184
    const-wide/16 v2, 0xfa

    .line 185
    .line 186
    invoke-virtual {v1, p1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 187
    .line 188
    .line 189
    sput-object p1, Ljz1;->γ:Lhy;

    .line 190
    .line 191
    return-void

    .line 192
    :cond_9
    :goto_4
    invoke-static {}, Ljz1;->ω()V

    .line 193
    .line 194
    .line 195
    return-void
.end method

.method public static ι(Lky1;Ljava/lang/String;)Z
    .locals 8

    .line 1
    invoke-static {p1}, Ljz1;->κ(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_1

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lky1;->α:Ljava/lang/String;

    .line 15
    .line 16
    iget-wide v2, p0, Lky1;->γ:J

    .line 17
    .line 18
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 27
    .line 28
    invoke-static {v0, p0, v0}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-static {v4}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v4, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    const-string v4, "cid:"

    .line 52
    .line 53
    invoke-static {p1, v4, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_1

    .line 58
    .line 59
    invoke-static {p1, v4}, Lq02;->н(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_4

    .line 76
    .line 77
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-nez v0, :cond_4

    .line 82
    .line 83
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    if-eqz p0, :cond_4

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    const-string v4, "uid:"

    .line 91
    .line 92
    invoke-static {p1, v4, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    const-wide/16 v6, 0x0

    .line 97
    .line 98
    if-eqz v5, :cond_2

    .line 99
    .line 100
    invoke-static {p1, v4}, Lq02;->н(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-nez p1, :cond_4

    .line 117
    .line 118
    cmp-long p1, v2, v6

    .line 119
    .line 120
    if-lez p1, :cond_4

    .line 121
    .line 122
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    if-eqz p0, :cond_4

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_2
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-nez v4, :cond_3

    .line 134
    .line 135
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    if-eqz p0, :cond_3

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_3
    cmp-long p0, v2, v6

    .line 143
    .line 144
    if-lez p0, :cond_4

    .line 145
    .line 146
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    if-eqz p0, :cond_4

    .line 151
    .line 152
    :goto_0
    const/4 p0, 0x1

    .line 153
    return p0

    .line 154
    :cond_4
    :goto_1
    return v1
.end method

.method public static κ(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "#"

    .line 2
    .line 3
    invoke-static {p0, v0, p0}, Lq02;->щ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :goto_0
    const-string v0, "!"

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-static {p0, v0, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    const-string v0, "-"

    .line 25
    .line 26
    invoke-static {p0, v0, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    const-string v3, "name:"

    .line 46
    .line 47
    invoke-static {v2, v3, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    const-string v1, "|"

    .line 55
    .line 56
    invoke-static {p0, v1, p0}, Lq02;->щ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    const-string v1, " "

    .line 61
    .line 62
    invoke-static {p0, v1, p0}, Lq02;->щ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    :goto_1
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_2
    :goto_2
    const/4 v0, 0x1

    .line 83
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    goto :goto_0
.end method

.method public static λ()Ljava/util/ArrayList;
    .locals 4

    .line 1
    const-string v0, "spark_custom_renew_rules"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-static {v0, v1}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "\r"

    .line 10
    .line 11
    const-string v2, "\n"

    .line 12
    .line 13
    invoke-static {v0, v1, v2}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lq02;->к(Ljava/lang/CharSequence;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Ljava/util/ArrayList;

    .line 22
    .line 23
    const/16 v2, 0xa

    .line 24
    .line 25
    invoke-static {v0, v2}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_2

    .line 74
    .line 75
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    move-object v3, v2

    .line 80
    check-cast v3, Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-nez v3, :cond_1

    .line 87
    .line 88
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_2
    return-object v0
.end method

.method public static μ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, -0x5e41b85f

    .line 6
    .line 7
    .line 8
    if-eq v0, v1, :cond_4

    .line 9
    .line 10
    const v1, 0x600e656d

    .line 11
    .line 12
    .line 13
    if-eq v0, v1, :cond_2

    .line 14
    .line 15
    const v1, 0x72f6eb17

    .line 16
    .line 17
    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string v0, "due_only"

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-nez p0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const-string p0, "\u4ec5\u5f85\u7eed"

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_2
    const-string v0, "custom_on"

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-nez p0, :cond_3

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    const-string p0, "\u6574\u7ec4\u81ea\u5b9a\u4e49"

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_4
    const-string v0, "custom_off"

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-nez p0, :cond_5

    .line 52
    .line 53
    :goto_0
    const-string p0, "\u8ddf\u968f\u9ed8\u8ba4"

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_5
    const-string p0, "\u6574\u7ec4\u6392\u9664"

    .line 57
    .line 58
    return-object p0
.end method

.method public static ν(Landroid/app/Activity;Lky1;Z)V
    .locals 11

    .line 1
    const-string v0, "spark_custom_renew_enabled"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-static {}, Lui1;->Α()Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    invoke-static {p0}, Lui1;->π(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    move-object p1, v0

    .line 16
    goto/16 :goto_7

    .line 17
    .line 18
    :cond_0
    :goto_0
    invoke-static {}, Ljz1;->λ()Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    new-instance v3, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    move-object v5, v4

    .line 42
    check-cast v5, Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {p1, v5}, Ljz1;->ι(Lky1;Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-nez v5, :cond_1

    .line 49
    .line 50
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    new-instance v2, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 57
    .line 58
    .line 59
    if-eqz p2, :cond_3

    .line 60
    .line 61
    sget-object v3, Lry1;->α:Lry1;

    .line 62
    .line 63
    invoke-static {v3, p1}, Lry1;->θ(Lry1;Lky1;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-nez v3, :cond_4

    .line 75
    .line 76
    const/4 v3, 0x1

    .line 77
    invoke-static {v0, v3}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    sget-object v0, Lry1;->α:Lry1;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-static {v0, p1}, Lry1;->θ(Lry1;Lky1;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const-string v3, "#"

    .line 91
    .line 92
    invoke-static {v0, v3, v0}, Lq02;->щ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-static {p1}, Lry1;->Π(Lky1;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    const-string v5, " "

    .line 109
    .line 110
    invoke-static {v4, v3, v5}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    const/16 v4, 0x28

    .line 115
    .line 116
    invoke-static {v3, v4}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    const-string v4, "!"

    .line 121
    .line 122
    const-string v5, " # off "

    .line 123
    .line 124
    invoke-static {v4, v0, v5, v3}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    :cond_4
    :goto_2
    sget-object v0, Lui1;->α:Ljava/lang/Object;

    .line 132
    .line 133
    const-string v0, "spark_custom_renew_rules"

    .line 134
    .line 135
    new-instance v3, Ljava/util/ArrayList;

    .line 136
    .line 137
    const/16 v4, 0xa

    .line 138
    .line 139
    invoke-static {v2, v4}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    if-eqz v4, :cond_5

    .line 155
    .line 156
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    check-cast v4, Ljava/lang/String;

    .line 161
    .line 162
    invoke-static {v4}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_5
    new-instance v2, Ljava/util/ArrayList;

    .line 175
    .line 176
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    :cond_6
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 184
    .line 185
    .line 186
    move-result v4

    .line 187
    if-eqz v4, :cond_7

    .line 188
    .line 189
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    move-object v5, v4

    .line 194
    check-cast v5, Ljava/lang/String;

    .line 195
    .line 196
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    if-nez v5, :cond_6

    .line 201
    .line 202
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_7
    new-instance v3, Ljava/util/HashSet;

    .line 207
    .line 208
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 209
    .line 210
    .line 211
    new-instance v4, Ljava/util/ArrayList;

    .line 212
    .line 213
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    :cond_8
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 221
    .line 222
    .line 223
    move-result v5

    .line 224
    if-eqz v5, :cond_a

    .line 225
    .line 226
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    move-object v6, v5

    .line 231
    check-cast v6, Ljava/lang/String;

    .line 232
    .line 233
    invoke-static {v6}, Ljz1;->κ(Ljava/lang/String;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 238
    .line 239
    .line 240
    move-result v8

    .line 241
    if-eqz v8, :cond_9

    .line 242
    .line 243
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 244
    .line 245
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v7

    .line 252
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    :cond_9
    invoke-virtual {v3, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v6

    .line 259
    if-eqz v6, :cond_8

    .line 260
    .line 261
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    goto :goto_5

    .line 265
    :cond_a
    const-string v5, "\n"

    .line 266
    .line 267
    const/4 v9, 0x0

    .line 268
    const/16 v10, 0x3e

    .line 269
    .line 270
    const/4 v6, 0x0

    .line 271
    const/4 v7, 0x0

    .line 272
    const/4 v8, 0x0

    .line 273
    invoke-static/range {v4 .. v10}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    invoke-static {v0, v2}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    if-eqz p2, :cond_b

    .line 281
    .line 282
    sget-object p2, Lry1;->α:Lry1;

    .line 283
    .line 284
    invoke-static {p1}, Lry1;->Π(Lky1;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    new-instance p2, Ljava/lang/StringBuilder;

    .line 289
    .line 290
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 291
    .line 292
    .line 293
    const-string v0, "\u5df2\u5f00\u542f "

    .line 294
    .line 295
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    const-string p1, " \u7684\u81ea\u5b9a\u4e49\u7eed\u706b"

    .line 302
    .line 303
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    goto :goto_6

    .line 311
    :cond_b
    sget-object p2, Lry1;->α:Lry1;

    .line 312
    .line 313
    invoke-static {p1}, Lry1;->Π(Lky1;)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    new-instance p2, Ljava/lang/StringBuilder;

    .line 318
    .line 319
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 320
    .line 321
    .line 322
    const-string v0, "\u5df2\u5173\u95ed "

    .line 323
    .line 324
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    const-string p1, " \u7684\u81ea\u5b9a\u4e49\u7eed\u706b\u89c4\u5219"

    .line 331
    .line 332
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    :goto_6
    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 344
    .line 345
    .line 346
    return-void

    .line 347
    :goto_7
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object p2

    .line 351
    new-instance v0, Ljava/lang/StringBuilder;

    .line 352
    .line 353
    const-string v2, "\u4fee\u6539\u81ea\u5b9a\u4e49\u7eed\u706b\u5931\u8d25: "

    .line 354
    .line 355
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object p2

    .line 365
    const-string v0, "DYHelper"

    .line 366
    .line 367
    invoke-static {v0, p2, p1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    new-instance p2, Ljava/lang/StringBuilder;

    .line 375
    .line 376
    const-string v0, "\u64cd\u4f5c\u5931\u8d25: "

    .line 377
    .line 378
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object p1

    .line 388
    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 389
    .line 390
    .line 391
    move-result-object p0

    .line 392
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 393
    .line 394
    .line 395
    return-void
.end method

.method public static ξ(Landroid/app/Activity;)V
    .locals 30

    .line 1
    move-object/from16 v4, p0

    .line 2
    .line 3
    invoke-static {v4}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v0, v1, Lxx;->Α:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, v1, Lxx;->γ:Ljava/lang/String;

    .line 10
    .line 11
    sget-object v3, Lx01;->α:Lx01;

    .line 12
    .line 13
    invoke-virtual {v3, v4}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    const v3, 0x7f0c003a

    .line 18
    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    invoke-virtual {v5, v3, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    check-cast v3, Landroid/view/ViewGroup;

    .line 29
    .line 30
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object v7, v1, Lxx;->β:Ljava/lang/String;

    .line 38
    .line 39
    const/16 v8, 0x12

    .line 40
    .line 41
    invoke-static {v8, v6, v7}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-virtual {v3, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 46
    .line 47
    .line 48
    const v6, 0x7f0902c2

    .line 49
    .line 50
    .line 51
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    const v6, 0x7f0900dd

    .line 56
    .line 57
    .line 58
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    const v6, 0x7f0900dc

    .line 63
    .line 64
    .line 65
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    const v10, 0x7f0900da

    .line 70
    .line 71
    .line 72
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v10

    .line 76
    const v11, 0x7f0900db

    .line 77
    .line 78
    .line 79
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v11

    .line 83
    const v12, 0x7f0900d9

    .line 84
    .line 85
    .line 86
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v12

    .line 90
    filled-new-array/range {v7 .. v12}, [Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    invoke-static {v7}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    :cond_0
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    if-eqz v8, :cond_1

    .line 107
    .line 108
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    check-cast v8, Ljava/lang/Number;

    .line 113
    .line 114
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    invoke-virtual {v3, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    if-eqz v8, :cond_0

    .line 123
    .line 124
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    const/16 v10, 0xe

    .line 132
    .line 133
    invoke-static {v10, v9, v2}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 134
    .line 135
    .line 136
    move-result-object v9

    .line 137
    invoke-virtual {v8, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_1
    invoke-static {v3, v1}, Ljz1;->α(Landroid/view/View;Lxx;)V

    .line 142
    .line 143
    .line 144
    new-instance v7, Lsy1;

    .line 145
    .line 146
    const/4 v8, 0x1

    .line 147
    invoke-direct {v7, v1, v8}, Lsy1;-><init>(Lxx;I)V

    .line 148
    .line 149
    .line 150
    invoke-static {v3, v7}, Ljz1;->η(Landroid/view/View;La80;)V

    .line 151
    .line 152
    .line 153
    const v7, 0x7f090359

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    check-cast v7, Landroid/widget/TextView;

    .line 161
    .line 162
    const v9, 0x7f090362

    .line 163
    .line 164
    .line 165
    invoke-virtual {v3, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 166
    .line 167
    .line 168
    move-result-object v9

    .line 169
    move-object v11, v9

    .line 170
    check-cast v11, Landroid/widget/TextView;

    .line 171
    .line 172
    const v9, 0x7f090366

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    move-object v12, v9

    .line 180
    check-cast v12, Landroid/widget/TextView;

    .line 181
    .line 182
    const v9, 0x7f09036a

    .line 183
    .line 184
    .line 185
    invoke-virtual {v3, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    move-object v13, v9

    .line 190
    check-cast v13, Landroid/widget/TextView;

    .line 191
    .line 192
    const v9, 0x7f090368

    .line 193
    .line 194
    .line 195
    invoke-virtual {v3, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 196
    .line 197
    .line 198
    move-result-object v9

    .line 199
    move-object v14, v9

    .line 200
    check-cast v14, Landroid/widget/TextView;

    .line 201
    .line 202
    invoke-virtual {v3, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    const v9, 0x7f09026d

    .line 207
    .line 208
    .line 209
    invoke-virtual {v3, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 210
    .line 211
    .line 212
    move-result-object v9

    .line 213
    const v10, 0x7f0902d1

    .line 214
    .line 215
    .line 216
    invoke-virtual {v3, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 217
    .line 218
    .line 219
    move-result-object v10

    .line 220
    check-cast v10, Landroid/widget/Switch;

    .line 221
    .line 222
    const v15, 0x7f09035b

    .line 223
    .line 224
    .line 225
    invoke-virtual {v3, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 226
    .line 227
    .line 228
    move-result-object v15

    .line 229
    check-cast v15, Landroid/widget/TextView;

    .line 230
    .line 231
    const v8, 0x7f0902be

    .line 232
    .line 233
    .line 234
    invoke-virtual {v3, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 235
    .line 236
    .line 237
    move-result-object v8

    .line 238
    check-cast v8, Landroid/widget/LinearLayout;

    .line 239
    .line 240
    move-object/from16 v17, v5

    .line 241
    .line 242
    const v5, 0x7f090270

    .line 243
    .line 244
    .line 245
    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    move-object/from16 v18, v6

    .line 250
    .line 251
    const v6, 0x7f090101

    .line 252
    .line 253
    .line 254
    invoke-virtual {v3, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 255
    .line 256
    .line 257
    move-result-object v6

    .line 258
    move-object/from16 v19, v7

    .line 259
    .line 260
    const v7, 0x7f090363

    .line 261
    .line 262
    .line 263
    invoke-virtual {v3, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 264
    .line 265
    .line 266
    move-result-object v7

    .line 267
    check-cast v7, Landroid/widget/TextView;

    .line 268
    .line 269
    move-object/from16 v20, v7

    .line 270
    .line 271
    const v7, 0x7f09026f

    .line 272
    .line 273
    .line 274
    invoke-virtual {v3, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 275
    .line 276
    .line 277
    move-result-object v7

    .line 278
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    move-object/from16 v21, v3

    .line 282
    .line 283
    const/4 v3, 0x0

    .line 284
    invoke-virtual {v10, v3}, Landroid/widget/Switch;->setShowText(Z)V

    .line 285
    .line 286
    .line 287
    new-instance v3, Landroid/content/res/ColorStateList;

    .line 288
    .line 289
    const v23, 0x10100a0

    .line 290
    .line 291
    .line 292
    move-object/from16 v24, v8

    .line 293
    .line 294
    filled-new-array/range {v23 .. v23}, [I

    .line 295
    .line 296
    .line 297
    move-result-object v8

    .line 298
    move-object/from16 v25, v11

    .line 299
    .line 300
    move-object/from16 v22, v12

    .line 301
    .line 302
    const/4 v11, 0x0

    .line 303
    new-array v12, v11, [I

    .line 304
    .line 305
    filled-new-array {v8, v12}, [[I

    .line 306
    .line 307
    .line 308
    move-result-object v8

    .line 309
    iget-object v12, v1, Lxx;->ι:Ljava/lang/String;

    .line 310
    .line 311
    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 312
    .line 313
    .line 314
    move-result v12

    .line 315
    iget-object v11, v1, Lxx;->θ:Ljava/lang/String;

    .line 316
    .line 317
    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 318
    .line 319
    .line 320
    move-result v11

    .line 321
    filled-new-array {v12, v11}, [I

    .line 322
    .line 323
    .line 324
    move-result-object v11

    .line 325
    invoke-direct {v3, v8, v11}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v10, v3}, Landroid/widget/Switch;->setThumbTintList(Landroid/content/res/ColorStateList;)V

    .line 329
    .line 330
    .line 331
    new-instance v3, Landroid/content/res/ColorStateList;

    .line 332
    .line 333
    filled-new-array/range {v23 .. v23}, [I

    .line 334
    .line 335
    .line 336
    move-result-object v8

    .line 337
    const/4 v11, 0x0

    .line 338
    new-array v12, v11, [I

    .line 339
    .line 340
    filled-new-array {v8, v12}, [[I

    .line 341
    .line 342
    .line 343
    move-result-object v8

    .line 344
    iget-object v12, v1, Lxx;->κ:Ljava/lang/String;

    .line 345
    .line 346
    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 347
    .line 348
    .line 349
    move-result v12

    .line 350
    iget-object v11, v1, Lxx;->χ:Ljava/lang/String;

    .line 351
    .line 352
    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 353
    .line 354
    .line 355
    move-result v11

    .line 356
    filled-new-array {v12, v11}, [I

    .line 357
    .line 358
    .line 359
    move-result-object v11

    .line 360
    invoke-direct {v3, v8, v11}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v10, v3}, Landroid/widget/Switch;->setTrackTintList(Landroid/content/res/ColorStateList;)V

    .line 364
    .line 365
    .line 366
    const/16 v3, 0xc

    .line 367
    .line 368
    invoke-static {v3, v4, v0, v2}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 369
    .line 370
    .line 371
    move-result-object v8

    .line 372
    invoke-virtual {v9, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 373
    .line 374
    .line 375
    invoke-static {v3, v4, v0, v2}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 376
    .line 377
    .line 378
    move-result-object v8

    .line 379
    invoke-virtual {v5, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 380
    .line 381
    .line 382
    invoke-static {v3, v4, v0, v2}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    invoke-virtual {v7, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 387
    .line 388
    .line 389
    iget-object v0, v1, Lxx;->δ:Ljava/lang/String;

    .line 390
    .line 391
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 392
    .line 393
    .line 394
    move-result v0

    .line 395
    invoke-virtual {v6, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 396
    .line 397
    .line 398
    new-instance v3, Lum1;

    .line 399
    .line 400
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 401
    .line 402
    .line 403
    new-instance v2, Lqm1;

    .line 404
    .line 405
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 406
    .line 407
    .line 408
    new-instance v0, Lbz1;

    .line 409
    .line 410
    move-object v8, v6

    .line 411
    move-object/from16 v29, v7

    .line 412
    .line 413
    move-object/from16 v28, v9

    .line 414
    .line 415
    move-object/from16 v6, v18

    .line 416
    .line 417
    move-object/from16 v27, v19

    .line 418
    .line 419
    move-object/from16 v16, v20

    .line 420
    .line 421
    move-object/from16 v26, v21

    .line 422
    .line 423
    move-object/from16 v12, v22

    .line 424
    .line 425
    move-object/from16 v9, v24

    .line 426
    .line 427
    move-object/from16 v11, v25

    .line 428
    .line 429
    move-object v7, v5

    .line 430
    move-object/from16 v5, v17

    .line 431
    .line 432
    invoke-direct/range {v0 .. v16}, Lbz1;-><init>(Lxx;Lqm1;Lum1;Landroid/app/Activity;Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/widget/LinearLayout;Landroid/widget/Switch;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v10, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 436
    .line 437
    .line 438
    new-instance v0, Lwu;

    .line 439
    .line 440
    const/4 v4, 0x5

    .line 441
    invoke-direct {v0, v10, v4}, Lwu;-><init>(Landroid/widget/Switch;I)V

    .line 442
    .line 443
    .line 444
    move-object/from16 v4, v28

    .line 445
    .line 446
    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 447
    .line 448
    .line 449
    new-instance v0, Lcz1;

    .line 450
    .line 451
    move-object/from16 v4, p0

    .line 452
    .line 453
    invoke-direct/range {v0 .. v16}, Lcz1;-><init>(Lxx;Lqm1;Lum1;Landroid/app/Activity;Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/widget/LinearLayout;Landroid/widget/Switch;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 454
    .line 455
    .line 456
    move-object v4, v0

    .line 457
    move-object/from16 v0, v29

    .line 458
    .line 459
    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 460
    .line 461
    .line 462
    new-instance v0, Lhi;

    .line 463
    .line 464
    const/16 v4, 0x8

    .line 465
    .line 466
    invoke-direct {v0, v4, v3}, Lhi;-><init>(ILjava/lang/Object;)V

    .line 467
    .line 468
    .line 469
    move-object/from16 v4, v27

    .line 470
    .line 471
    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 472
    .line 473
    .line 474
    move-object v0, v1

    .line 475
    move-object v1, v2

    .line 476
    move-object v2, v3

    .line 477
    move-object v4, v5

    .line 478
    move-object v5, v6

    .line 479
    move-object v6, v7

    .line 480
    move-object v7, v8

    .line 481
    move-object v8, v9

    .line 482
    move-object v9, v10

    .line 483
    move-object v10, v11

    .line 484
    move-object v11, v12

    .line 485
    move-object v12, v13

    .line 486
    move-object v13, v14

    .line 487
    move-object v14, v15

    .line 488
    move-object/from16 v15, v16

    .line 489
    .line 490
    move-object/from16 v3, p0

    .line 491
    .line 492
    invoke-static/range {v0 .. v15}, Ljz1;->ο(Lxx;Lqm1;Lum1;Landroid/app/Activity;Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/widget/LinearLayout;Landroid/widget/Switch;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 493
    .line 494
    .line 495
    move-object v4, v3

    .line 496
    move-object v3, v2

    .line 497
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 498
    .line 499
    invoke-direct {v0, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 500
    .line 501
    .line 502
    move-object/from16 v1, v26

    .line 503
    .line 504
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    const/4 v1, 0x1

    .line 509
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    iput-object v0, v3, Lum1;->ε:Ljava/lang/Object;

    .line 518
    .line 519
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 520
    .line 521
    .line 522
    iget-object v0, v3, Lum1;->ε:Ljava/lang/Object;

    .line 523
    .line 524
    check-cast v0, Landroid/app/AlertDialog;

    .line 525
    .line 526
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    if-eqz v0, :cond_2

    .line 531
    .line 532
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 533
    .line 534
    const/4 v11, 0x0

    .line 535
    invoke-direct {v1, v11}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 536
    .line 537
    .line 538
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 539
    .line 540
    .line 541
    const/high16 v1, 0x3f000000    # 0.5f

    .line 542
    .line 543
    invoke-virtual {v0, v1}, Landroid/view/Window;->setDimAmount(F)V

    .line 544
    .line 545
    .line 546
    const/4 v1, 0x2

    .line 547
    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 551
    .line 552
    .line 553
    move-result-object v1

    .line 554
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 555
    .line 556
    .line 557
    move-result-object v1

    .line 558
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 559
    .line 560
    int-to-float v1, v1

    .line 561
    const v2, 0x3f6b851f    # 0.92f

    .line 562
    .line 563
    .line 564
    mul-float/2addr v1, v2

    .line 565
    float-to-int v1, v1

    .line 566
    const/4 v2, -0x2

    .line 567
    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V

    .line 568
    .line 569
    .line 570
    :cond_2
    return-void
.end method

.method public static final ο(Lxx;Lqm1;Lum1;Landroid/app/Activity;Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/widget/LinearLayout;Landroid/widget/Switch;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 78

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v7, p6

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v0, p15

    .line 1
    iget-object v3, v1, Lxx;->χ:Ljava/lang/String;

    iget-object v5, v1, Lxx;->φ:Ljava/lang/String;

    iget-object v6, v1, Lxx;->μ:Ljava/lang/String;

    iget-object v8, v1, Lxx;->λ:Ljava/lang/String;

    iget-object v9, v1, Lxx;->ξ:Ljava/lang/String;

    iget-object v10, v1, Lxx;->ν:Ljava/lang/String;

    move-object/from16 v16, v3

    iget-object v3, v1, Lxx;->κ:Ljava/lang/String;

    move-object/from16 v17, v3

    iget-object v3, v1, Lxx;->ι:Ljava/lang/String;

    .line 2
    sget-object v18, Lry1;->τ:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static/range {v18 .. v18}, Lex0;->Ο(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v19

    .line 3
    invoke-interface/range {v19 .. v19}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v19

    check-cast v19, Ljava/lang/Iterable;

    move-object/from16 v20, v3

    invoke-static/range {v19 .. v19}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    .line 4
    invoke-virtual/range {v18 .. v18}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v18, Ljava/lang/Iterable;

    move-object/from16 v19, v3

    .line 5
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 6
    invoke-interface/range {v18 .. v18}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_0
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_1

    move-object/from16 v21, v5

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v22, v6

    move-object v6, v5

    check-cast v6, Lky1;

    .line 7
    iget-boolean v6, v6, Lky1;->ζ:Z

    if-eqz v6, :cond_0

    .line 8
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    move-object/from16 v5, v21

    move-object/from16 v6, v22

    goto :goto_0

    :cond_1
    move-object/from16 v21, v5

    move-object/from16 v22, v6

    .line 9
    sget-object v5, Lry1;->α:Lry1;

    invoke-static {}, Lry1;->Ξ()Ljava/util/ArrayList;

    move-result-object v5

    .line 10
    invoke-static {}, Lry1;->х()Z

    move-result v6

    move-object/from16 v18, v3

    .line 11
    const-string v3, "spark_custom_renew_enabled"

    move-object/from16 v23, v5

    const/4 v5, 0x0

    .line 12
    invoke-static {v3, v5}, Lui1;->η(Ljava/lang/String;Z)Z

    move-result v3

    .line 13
    invoke-interface/range {v19 .. v19}, Ljava/util/Collection;->isEmpty()Z

    move-result v24

    if-eqz v24, :cond_2

    const/4 v5, 0x0

    :goto_1
    move/from16 v27, v6

    const/16 v28, 0x0

    goto :goto_4

    .line 14
    :cond_2
    invoke-interface/range {v19 .. v19}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v24

    const/16 v26, 0x0

    :goto_2
    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->hasNext()Z

    move-result v27

    if-eqz v27, :cond_6

    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v27

    check-cast v27, Lky1;

    .line 15
    invoke-static {}, Lui1;->Α()Z

    move-result v28

    if-nez v28, :cond_3

    move/from16 v27, v6

    const/16 v28, 0x0

    goto :goto_3

    .line 16
    :cond_3
    sget-object v28, Lry1;->α:Lry1;

    const/16 v28, 0x0

    invoke-static/range {v27 .. v27}, Lry1;->Ο(Lky1;)Lgy1;

    move-result-object v5

    move/from16 v27, v6

    .line 17
    iget-boolean v6, v5, Lgy1;->α:Z

    if-eqz v6, :cond_4

    .line 18
    iget-boolean v5, v5, Lgy1;->β:Z

    if-eqz v5, :cond_4

    add-int/lit8 v26, v26, 0x1

    if-ltz v26, :cond_5

    :cond_4
    :goto_3
    move/from16 v6, v27

    goto :goto_2

    .line 19
    :cond_5
    invoke-static {}, Lyh;->ф()V

    throw v28

    :cond_6
    move/from16 v5, v26

    goto :goto_1

    :goto_4
    if-eqz v27, :cond_7

    .line 20
    const-string v6, "\u5df2\u5c31\u7eea"

    goto :goto_5

    :cond_7
    const-string v6, "\u672a\u6fc0\u6d3b"

    :goto_5
    invoke-virtual {v11, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz v27, :cond_8

    move-object/from16 v6, v20

    goto :goto_6

    :cond_8
    move-object v6, v10

    :goto_6
    move-object/from16 v24, v8

    if-eqz v27, :cond_9

    move-object/from16 v8, v17

    goto :goto_7

    :cond_9
    move-object v8, v9

    .line 21
    :goto_7
    invoke-static {v11, v6, v8}, Ljz1;->Α(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    move-result v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v12, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    iget-object v6, v1, Lxx;->ρ:Ljava/lang/String;

    iget-object v8, v1, Lxx;->θ:Ljava/lang/String;

    .line 24
    invoke-static/range {v24 .. v24}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    .line 25
    invoke-virtual {v12, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 26
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_a

    move-object v1, v6

    goto :goto_8

    :cond_a
    move-object v1, v8

    .line 28
    :goto_8
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    .line 29
    invoke-virtual {v13, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 30
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    invoke-static/range {v24 .. v24}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    .line 32
    invoke-virtual {v14, v1}, Landroid/widget/TextView;->setTextColor(I)V

    if-eqz v27, :cond_b

    move-object/from16 v27, v6

    const/16 v6, 0x8

    :goto_9
    move-object/from16 v1, p5

    goto :goto_a

    :cond_b
    move-object/from16 v27, v6

    const/4 v6, 0x0

    goto :goto_9

    .line 33
    :goto_a
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    const/4 v6, 0x1

    .line 34
    iput-boolean v6, v2, Lqm1;->ε:Z

    move-object/from16 v6, p9

    .line 35
    invoke-virtual {v6, v3}, Landroid/widget/Switch;->setChecked(Z)V

    const/4 v1, 0x0

    .line 36
    iput-boolean v1, v2, Lqm1;->ε:Z

    if-eqz v3, :cond_c

    .line 37
    const-string v25, "\u5df2\u5f00\u542f\uff1a\u6de1\u7eff\u8272\u4eba\u5458\u4f1a\u53c2\u4e0e\u81ea\u5b9a\u4e49\u7eed\u706b\uff1b\u957f\u6309\u4eba\u5458\u53ef\u76f4\u63a5\u5f00\u5173"

    :goto_b
    move-object/from16 v1, v25

    goto :goto_c

    .line 38
    :cond_c
    const-string v25, "\u5df2\u5173\u95ed\uff1a\u81ea\u5b9a\u4e49\u7eed\u706b\u603b\u5f00\u5173\u5173\u95ed\uff1b\u957f\u6309\u4eba\u5458\u5f00\u542f\u65f6\u4f1a\u81ea\u52a8\u6253\u5f00"

    goto :goto_b

    .line 39
    :goto_c
    invoke-virtual {v15, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    .line 41
    invoke-virtual {v15, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 42
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_d

    const/4 v1, 0x0

    goto :goto_d

    :cond_d
    const/16 v1, 0x8

    :goto_d
    invoke-virtual {v7, v1}, Landroid/view/View;->setVisibility(I)V

    .line 43
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_e

    const/4 v2, 0x0

    :goto_e
    move-object/from16 v1, p7

    goto :goto_f

    :cond_e
    const/16 v2, 0x8

    goto :goto_e

    .line 44
    :goto_f
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 45
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->size()I

    move-result v1

    move/from16 v18, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " \u4e2a\u4f1a\u8bdd\u5c06\u7eed\u706b \u00b7 \u5f85\u7eed "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " / \u81ea\u5b9a\u4e49 "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 46
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    .line 48
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 49
    new-instance v1, Ll9;

    const/16 v2, 0xe

    move-object/from16 v3, p2

    invoke-direct {v1, v4, v2, v3}, Ll9;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v7, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 50
    invoke-virtual/range {p8 .. p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    new-instance v0, Lcu1;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v5, p4

    move-object/from16 v38, v9

    move-object/from16 v39, v10

    move-object/from16 v34, v16

    move-object/from16 v30, v17

    move-object/from16 v31, v20

    move-object/from16 v35, v21

    move-object/from16 v36, v22

    move-object/from16 v37, v24

    move-object/from16 v9, p8

    move-object/from16 v16, p15

    move-object v10, v6

    move-object/from16 v17, v8

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v16}, Lcu1;-><init>(Lxx;Lqm1;Lum1;Landroid/app/Activity;Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/widget/LinearLayout;Landroid/widget/Switch;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    move-object v8, v5

    .line 52
    invoke-virtual {v9}, Landroid/view/ViewGroup;->removeAllViews()V

    const/4 v10, 0x0

    .line 53
    invoke-virtual {v9, v10}, Landroid/view/View;->setBackgroundColor(I)V

    .line 54
    const-string v2, "spark_auto_renew_enabled"

    .line 55
    invoke-static {v2, v10}, Lui1;->η(Ljava/lang/String;Z)Z

    move-result v11

    .line 56
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_f

    const v0, 0x7f0c005e

    .line 57
    invoke-virtual {v8, v0, v9, v10}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    invoke-virtual {v0, v10}, Landroid/view/View;->setBackgroundColor(I)V

    .line 60
    new-instance v2, Lsy1;

    invoke-direct {v2, v1, v10}, Lsy1;-><init>(Lxx;I)V

    invoke-static {v0, v2}, Ljz1;->η(Landroid/view/View;La80;)V

    .line 61
    invoke-virtual {v9, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void

    :cond_f
    const/16 v12, 0xa

    move-object/from16 v2, v19

    .line 62
    invoke-static {v2, v12}, Lyh;->σ(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-static {v3}, Lex0;->Κ(I)I

    move-result v3

    const/16 v13, 0x10

    if-ge v3, v13, :cond_10

    move v3, v13

    .line 63
    :cond_10
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 64
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 65
    move-object v7, v6

    check-cast v7, Lky1;

    .line 66
    sget-object v14, Lry1;->α:Lry1;

    invoke-static {v7}, Lry1;->ｐ(Lky1;)Ljava/lang/String;

    move-result-object v7

    .line 67
    invoke-interface {v5, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_10

    .line 68
    :cond_11
    invoke-static {}, Lv81;->θ()Ljava/util/Map;

    move-result-object v3

    .line 69
    invoke-static {v2, v12}, Lyh;->σ(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-static {v6}, Lex0;->Κ(I)I

    move-result v6

    if-ge v6, v13, :cond_12

    move v6, v13

    .line 70
    :cond_12
    new-instance v14, Ljava/util/LinkedHashMap;

    invoke-direct {v14, v6}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 71
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_11
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const-string v15, "\u6d47"

    const-string v13, "\u79cd"

    const-string v10, "\u6536"

    const-string v12, "\u5206\u7ec4"

    move/from16 p5, v11

    const-string v11, ""

    const-string v16, "\u5168\u5c40"

    if-eqz v7, :cond_17

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 72
    check-cast v7, Lky1;

    .line 73
    sget-object v19, Lry1;->α:Lry1;

    invoke-static {v7}, Lry1;->ｐ(Lky1;)Ljava/lang/String;

    move-result-object v19

    iget-wide v8, v7, Lky1;->β:J

    move-object/from16 v20, v2

    .line 74
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lsd;

    if-nez v2, :cond_13

    .line 75
    new-instance v2, Lsd;

    invoke-direct {v2, v8, v9}, Lsd;-><init>(J)V

    .line 76
    :cond_13
    new-instance v8, Lhz1;

    .line 77
    invoke-static {v7}, Lry1;->Π(Lky1;)Ljava/lang/String;

    move-result-object v9

    .line 78
    invoke-static {v7}, Lry1;->Ο(Lky1;)Lgy1;

    move-result-object v21

    .line 79
    invoke-static {v7}, Lry1;->е(Lky1;)Z

    move-result v22

    move-object/from16 p6, v3

    .line 80
    invoke-static {v7}, Lry1;->Ψ(Lky1;)Lmy1;

    move-result-object v3

    .line 81
    invoke-static {v3}, Lry1;->б(Lmy1;)Z

    move-result v23

    if-eqz v23, :cond_15

    .line 82
    iget-object v12, v3, Lmy1;->α:Ljava/lang/String;

    .line 83
    invoke-static {v12}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_14

    const-string v16, "\u4e2a\u4eba\u6587\u672c"

    goto :goto_12

    .line 84
    :cond_14
    iget-object v3, v3, Lmy1;->β:Ljava/lang/String;

    .line 85
    invoke-static {v3, v11}, Lry1;->я(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 86
    const-string v11, "\u4e2a\u4eba"

    invoke-virtual {v11, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    goto :goto_12

    .line 87
    :cond_15
    invoke-static {v7}, Lry1;->Τ(Lky1;)Lly1;

    move-result-object v3

    if-eqz v3, :cond_16

    .line 88
    iget-object v3, v3, Lly1;->γ:Lmy1;

    invoke-static {v3}, Lry1;->б(Lmy1;)Z

    move-result v11

    if-eqz v11, :cond_16

    .line 89
    iget-object v11, v3, Lmy1;->β:Ljava/lang/String;

    .line 90
    iget-object v3, v3, Lmy1;->α:Ljava/lang/String;

    .line 91
    invoke-static {v11, v3}, Lry1;->я(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v12, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 92
    :cond_16
    :goto_12
    invoke-static {v7, v2}, Lry1;->Ρ(Lky1;Lsd;)Lsd;

    move-result-object v2

    .line 93
    iget-object v3, v2, Lsd;->β:Lip1;

    .line 94
    iget-object v7, v2, Lsd;->γ:Lip1;

    .line 95
    iget-object v2, v2, Lsd;->δ:Lip1;

    .line 96
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    invoke-static {v3}, Ljz1;->ε(Lip1;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v10, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 98
    invoke-static {v7}, Ljz1;->ε(Lip1;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v13, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 99
    invoke-static {v2}, Ljz1;->ε(Lip1;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v15, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v3, v7, v2}, [Ljava/lang/String;

    move-result-object v2

    .line 100
    invoke-static {v2}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    const/16 v7, 0x3e

    .line 101
    const-string v10, "/"

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 p9, v2

    move-object/from16 p14, v3

    move/from16 p15, v7

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move/from16 p13, v13

    invoke-static/range {p9 .. p15}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 p15, v2

    move-object/from16 p9, v8

    move-object/from16 p11, v9

    move-object/from16 p14, v16

    move-object/from16 p10, v19

    move-object/from16 p12, v21

    move/from16 p13, v22

    .line 102
    invoke-direct/range {p9 .. p15}, Lhz1;-><init>(Ljava/lang/String;Ljava/lang/String;Lgy1;ZLjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v3, p9

    move-object/from16 v2, p10

    .line 103
    invoke-interface {v14, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v8, p4

    move/from16 v11, p5

    move-object/from16 v3, p6

    move-object/from16 v9, p8

    move-object/from16 v2, v20

    const/4 v10, 0x0

    const/16 v12, 0xa

    const/16 v13, 0x10

    goto/16 :goto_11

    :cond_17
    move-object/from16 v20, v2

    .line 104
    sget-object v2, Lry1;->α:Lry1;

    invoke-static {}, Lry1;->Υ()Ljava/util/List;

    move-result-object v2

    .line 105
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 106
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_13
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_18

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 107
    check-cast v7, Lly1;

    .line 108
    iget-object v7, v7, Lly1;->ζ:Ljava/util/List;

    .line 109
    invoke-static {v3, v7}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_13

    .line 110
    :cond_18
    invoke-static {v3}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v3

    .line 111
    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v2, v7}, Lyh;->σ(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 112
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_14
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 113
    check-cast v7, Lly1;

    .line 114
    iget-object v8, v7, Lly1;->α:Ljava/lang/String;

    .line 115
    iget-object v9, v7, Lly1;->β:Ljava/lang/String;

    move-object/from16 p6, v2

    .line 116
    iget-object v2, v7, Lly1;->γ:Lmy1;

    move-object/from16 v45, v2

    .line 117
    iget-object v2, v7, Lly1;->δ:Ljava/lang/String;

    move-object/from16 v46, v2

    .line 118
    iget-object v2, v7, Lly1;->ε:Lrd;

    .line 119
    iget-object v7, v7, Lly1;->ζ:Ljava/util/List;

    move-object/from16 v47, v2

    .line 120
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 121
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_15
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_1a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    move-object/from16 p7, v7

    .line 122
    move-object/from16 v7, v19

    check-cast v7, Ljava/lang/String;

    .line 123
    invoke-virtual {v5, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lky1;

    if-eqz v7, :cond_19

    .line 124
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_19
    move-object/from16 v7, p7

    goto :goto_15

    .line 125
    :cond_1a
    new-instance v42, Lgz1;

    const/16 v48, 0x0

    move-object/from16 v49, v2

    move-object/from16 v43, v8

    move-object/from16 v44, v9

    invoke-direct/range {v42 .. v49}, Lgz1;-><init>(Ljava/lang/String;Ljava/lang/String;Lmy1;Ljava/lang/String;Lrd;ZLjava/util/List;)V

    move-object/from16 v2, v42

    .line 126
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, p6

    goto :goto_14

    .line 127
    :cond_1b
    new-instance v2, Lmy1;

    const/16 v5, 0xff

    const/4 v8, 0x0

    invoke-direct {v2, v5, v8, v8}, Lmy1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 128
    new-instance v47, Lrd;

    invoke-direct/range {v47 .. v47}, Lrd;-><init>()V

    .line 129
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 130
    invoke-interface/range {v20 .. v20}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_16
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1d

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v19, v9

    check-cast v19, Lky1;

    .line 131
    sget-object v20, Lry1;->α:Lry1;

    invoke-static/range {v19 .. v19}, Lry1;->ｐ(Lky1;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v3, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1c

    .line 132
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1c
    const/4 v8, 0x0

    goto :goto_16

    .line 133
    :cond_1d
    new-instance v3, Lqy1;

    const/4 v8, 0x4

    .line 134
    invoke-direct {v3, v8}, Lqy1;-><init>(I)V

    .line 135
    new-instance v7, Liz1;

    const/4 v9, 0x1

    invoke-direct {v7, v3, v14, v9}, Liz1;-><init>(Ljava/util/Comparator;Ljava/util/LinkedHashMap;I)V

    .line 136
    new-instance v3, Ljd1;

    const/16 v8, 0x9

    invoke-direct {v3, v8, v7}, Ljd1;-><init>(ILjava/lang/Object;)V

    .line 137
    new-instance v7, Liz1;

    const/4 v8, 0x0

    invoke-direct {v7, v3, v14, v8}, Liz1;-><init>(Ljava/util/Comparator;Ljava/util/LinkedHashMap;I)V

    .line 138
    invoke-static {v5, v7}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v49

    .line 139
    new-instance v42, Lgz1;

    const-string v43, "__ungrouped__"

    const-string v44, "\u672a\u5206\u7ec4"

    const-string v46, "follow"

    const/16 v48, 0x1

    move-object/from16 v45, v2

    invoke-direct/range {v42 .. v49}, Lgz1;-><init>(Ljava/lang/String;Ljava/lang/String;Lmy1;Ljava/lang/String;Lrd;ZLjava/util/List;)V

    move-object/from16 v2, v42

    .line 140
    invoke-static {v2, v6}, Lxh;->Ф(Ljava/lang/Object;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v2

    .line 141
    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 142
    invoke-virtual {v3, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v5, 0x10

    .line 143
    invoke-virtual {v3, v5}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/16 v5, 0x8

    .line 144
    invoke-static {v4, v5}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v3, v8, v8, v8, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 145
    new-instance v6, Landroid/widget/TextView;

    invoke-direct {v6, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 146
    const-string v7, "\u89c4\u5219\u5206\u7ec4"

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v8, 0x41500000    # 13.0f

    .line 147
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 v7, 0x0

    .line 148
    invoke-virtual {v6, v7, v9}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 149
    iget-object v7, v1, Lxx;->ζ:Ljava/lang/String;

    iget-object v8, v1, Lxx;->Α:Ljava/lang/String;

    .line 150
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    .line 151
    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 152
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v5, -0x2

    move-object/from16 v19, v11

    const/high16 v11, 0x3f800000    # 1.0f

    move-object/from16 v20, v7

    const/4 v7, 0x0

    invoke-direct {v9, v7, v5, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v6, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 153
    invoke-virtual {v3, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 154
    new-instance v6, Lz61;

    const/16 v9, 0x8

    invoke-direct {v6, v4, v9, v0}, Lz61;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    const-string v9, "\u65b0\u589e"

    move-object/from16 v11, v36

    move-object/from16 v5, v37

    invoke-static {v4, v9, v5, v11, v6}, Ljz1;->δ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp70;)Landroid/widget/TextView;

    move-result-object v6

    invoke-virtual {v3, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 155
    new-instance v6, Lty1;

    invoke-direct {v6, v0, v7}, Lty1;-><init>(Lcu1;I)V

    const-string v7, "\u5c55\u5f00"

    move-object/from16 v23, v12

    move-object/from16 v9, v30

    move-object/from16 v12, v31

    invoke-static {v4, v7, v12, v9, v6}, Ljz1;->δ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp70;)Landroid/widget/TextView;

    move-result-object v6

    invoke-virtual {v3, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 156
    new-instance v6, Lz61;

    const/16 v7, 0x9

    invoke-direct {v6, v2, v7, v0}, Lz61;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    const-string v7, "\u6536\u8d77"

    move-object/from16 p9, v2

    move-object/from16 v2, v34

    move-object/from16 v9, v35

    invoke-static {v4, v7, v9, v2, v6}, Ljz1;->δ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp70;)Landroid/widget/TextView;

    move-result-object v6

    invoke-virtual {v3, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v6, p8

    .line 157
    invoke-virtual {v6, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 158
    invoke-virtual/range {p9 .. p9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v24

    :goto_17
    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8c

    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lgz1;

    .line 159
    iget-object v7, v3, Lgz1;->α:Ljava/lang/String;

    move-object/from16 v34, v2

    iget-boolean v2, v3, Lgz1;->ζ:Z

    move/from16 v29, v2

    iget-object v2, v3, Lgz1;->η:Ljava/util/List;

    move-object/from16 v31, v2

    iget-object v2, v3, Lgz1;->δ:Ljava/lang/String;

    move-object/from16 v35, v9

    iget-object v9, v3, Lgz1;->γ:Lmy1;

    move-object/from16 v32, v12

    .line 160
    sget-object v12, Ljz1;->α:Ljava/util/LinkedHashSet;

    move-object/from16 v37, v5

    invoke-virtual {v12, v7}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v5

    move-object/from16 v33, v2

    move-object/from16 v36, v14

    const/4 v2, 0x1

    .line 161
    invoke-static {v4, v2}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    move-result-object v14

    const/16 v2, 0xc

    move-object/from16 v40, v12

    .line 162
    invoke-static {v4, v2}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v12

    move/from16 p9, v5

    const/16 v6, 0xa

    invoke-static {v4, v6}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v5

    move-object/from16 v41, v15

    invoke-static {v4, v2}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v15

    invoke-static {v4, v6}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v14, v12, v5, v15, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 163
    iget-object v2, v1, Lxx;->γ:Ljava/lang/String;

    const/16 v5, 0xc

    .line 164
    invoke-static {v5, v4, v8, v2}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    move-result-object v2

    invoke-virtual {v14, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 165
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v5, -0x1

    const/4 v6, -0x2

    invoke-direct {v2, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v5, 0x6

    .line 166
    invoke-static {v4, v5}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v5

    iput v5, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 167
    invoke-virtual {v14, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 168
    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x0

    .line 169
    invoke-virtual {v2, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v12, 0x10

    .line 170
    invoke-virtual {v2, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 171
    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    if-eqz p9, :cond_1e

    .line 172
    const-string v6, "\u25b8"

    goto :goto_18

    :cond_1e
    const-string v6, "\u25be"

    .line 173
    :goto_18
    iget-object v15, v3, Lgz1;->β:Ljava/lang/String;

    .line 174
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " "

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v12, 0x41500000    # 13.0f

    .line 175
    invoke-virtual {v5, v12}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 v6, 0x0

    const/4 v15, 0x1

    .line 176
    invoke-virtual {v5, v6, v15}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 177
    invoke-static/range {v20 .. v20}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    .line 178
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 179
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/high16 v12, 0x3f800000    # 1.0f

    const/4 v15, 0x0

    invoke-direct {v6, v15, v1, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 180
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 181
    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 182
    invoke-interface/range {v31 .. v31}, Ljava/util/List;->size()I

    move-result v6

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "\u4eba"

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v6, 0x41200000    # 10.0f

    .line 183
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 v6, 0x0

    const/4 v15, 0x1

    .line 184
    invoke-virtual {v5, v6, v15}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 185
    invoke-static/range {v37 .. v37}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    .line 186
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v6, 0x63

    .line 187
    invoke-static {v6, v4, v11}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v6

    .line 188
    invoke-virtual {v5, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/16 v6, 0x8

    .line 189
    invoke-static {v4, v6}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v15

    const/4 v12, 0x3

    invoke-static {v4, v12}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v1

    move-object/from16 v26, v11

    invoke-static {v4, v6}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v11

    invoke-static {v4, v12}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v5, v15, v1, v11, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 190
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 191
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 192
    const-string v5, "\u8bbe\u7f6e"

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v5, 0x41300000    # 11.0f

    .line 193
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 v6, 0x0

    const/4 v15, 0x1

    .line 194
    invoke-virtual {v1, v6, v15}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 195
    invoke-static/range {v32 .. v32}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    .line 196
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v6, 0xa

    .line 197
    invoke-static {v4, v6}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v11

    invoke-static {v4, v12}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v6

    invoke-static {v4, v12}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v15

    const/4 v12, 0x0

    invoke-virtual {v1, v11, v6, v12, v15}, Landroid/widget/TextView;->setPadding(IIII)V

    if-eqz v29, :cond_1f

    const/16 v6, 0x8

    goto :goto_19

    :cond_1f
    move v6, v12

    .line 198
    :goto_19
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 199
    new-instance v6, Lvy1;

    invoke-direct {v6, v4, v3, v0, v12}, Lvy1;-><init>(Landroid/app/Activity;Lgz1;Lcu1;I)V

    invoke-virtual {v1, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 200
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 201
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 202
    const-string v6, "\u5220\u9664"

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 203
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 v6, 0x0

    const/4 v15, 0x1

    .line 204
    invoke-virtual {v1, v6, v15}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 205
    invoke-static/range {v27 .. v27}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    .line 206
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v11, 0xa

    .line 207
    invoke-static {v4, v11}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v6

    const/4 v12, 0x3

    invoke-static {v4, v12}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v15

    invoke-static {v4, v12}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v11

    const/4 v12, 0x0

    invoke-virtual {v1, v6, v15, v12, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    if-nez v29, :cond_21

    .line 208
    const-string v6, "default"

    .line 209
    invoke-virtual {v7, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_20

    goto :goto_1a

    :cond_20
    const/4 v6, 0x0

    goto :goto_1b

    :cond_21
    :goto_1a
    const/16 v6, 0x8

    .line 210
    :goto_1b
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 211
    new-instance v6, Lvy1;

    const/4 v15, 0x1

    invoke-direct {v6, v4, v3, v0, v15}, Lvy1;-><init>(Landroid/app/Activity;Lgz1;Lcu1;I)V

    invoke-virtual {v1, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 212
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 213
    invoke-virtual {v14, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 214
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 215
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 216
    iget-object v6, v9, Lmy1;->α:Ljava/lang/String;

    iget-object v11, v9, Lmy1;->η:Ljava/lang/Boolean;

    iget-object v12, v9, Lmy1;->δ:Ljava/lang/Boolean;

    iget-object v15, v9, Lmy1;->β:Ljava/lang/String;

    .line 217
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_22

    .line 218
    const-string v6, "\u56fa\u5b9a\u6587\u672c"

    goto :goto_1c

    .line 219
    :cond_22
    const-string v6, "hitokoto"

    invoke-static {v15, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_23

    .line 220
    const-string v6, "\u4e00\u8a00"

    goto :goto_1c

    .line 221
    :cond_23
    const-string v6, "jinrishici"

    invoke-static {v15, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_24

    .line 222
    const-string v6, "\u4eca\u65e5\u8bd7\u8bcd"

    goto :goto_1c

    :cond_24
    const-string v6, "\u8ddf\u968f\u5168\u5c40"

    .line 223
    :goto_1c
    const-string v15, "\u6d88\u606f:"

    invoke-virtual {v15, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    invoke-static/range {v33 .. v33}, Ljz1;->μ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v15, " \u00b7 \u7eed\u706b:"

    invoke-virtual {v15, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v12, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v45

    const-string v5, "\u7981\u56fe\u7247"

    move-object/from16 v47, v15

    const-string v15, "\u56fe\u7247"

    move-object/from16 v48, v8

    const-string v8, "\u7981\u6d88\u606f"

    move-object/from16 v49, v7

    const-string v7, "\u6d88\u606f"

    move-object/from16 p14, v0

    const-string v0, "\u4e13\u5c5e\u6587\u672c"

    move-object/from16 p10, v14

    const-string v14, "\u5f00\u542f"

    move-object/from16 v50, v14

    const-string v14, "\u6392\u9664"

    if-eqz v45, :cond_25

    move-object/from16 v51, v0

    move-object v4, v14

    move-object/from16 v45, v4

    goto/16 :goto_1f

    :cond_25
    move-object/from16 v45, v14

    .line 226
    invoke-static {}, Lyh;->χ()Lzt0;

    move-result-object v14

    .line 227
    iget-object v4, v9, Lmy1;->γ:Ljava/lang/String;

    .line 228
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_26

    invoke-virtual {v14, v0}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 229
    :cond_26
    iget-object v4, v9, Lmy1;->ε:Ljava/lang/Boolean;

    move-object/from16 v51, v0

    .line 230
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v52

    if-eqz v52, :cond_27

    invoke-virtual {v14, v7}, Lzt0;->add(Ljava/lang/Object;)Z

    goto :goto_1d

    .line 231
    :cond_27
    invoke-static {v4, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v52

    if-eqz v52, :cond_28

    invoke-virtual {v14, v8}, Lzt0;->add(Ljava/lang/Object;)Z

    goto :goto_1d

    :cond_28
    if-nez v4, :cond_8b

    .line 232
    :goto_1d
    iget-object v4, v9, Lmy1;->ζ:Ljava/lang/Boolean;

    .line 233
    invoke-static {v4, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v52

    if-eqz v52, :cond_29

    invoke-virtual {v14, v15}, Lzt0;->add(Ljava/lang/Object;)Z

    goto :goto_1e

    .line 234
    :cond_29
    invoke-static {v4, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v52

    if-eqz v52, :cond_2a

    invoke-virtual {v14, v5}, Lzt0;->add(Ljava/lang/Object;)Z

    goto :goto_1e

    :cond_2a
    if-nez v4, :cond_8a

    .line 235
    :goto_1e
    invoke-static {v14}, Lyh;->μ(Lzt0;)Lzt0;

    move-result-object v53

    const/16 v58, 0x0

    const/16 v59, 0x3e

    .line 236
    const-string v54, "+"

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    invoke-static/range {v53 .. v59}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_2c

    .line 237
    invoke-static {v12, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2b

    move-object/from16 v4, v50

    goto :goto_1f

    :cond_2b
    move-object/from16 v4, v16

    .line 238
    :cond_2c
    :goto_1f
    const-string v12, " \u00b7 \u706b\u661f:"

    invoke-virtual {v12, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    iget-object v0, v9, Lmy1;->θ:Ljava/lang/String;

    .line 240
    invoke-static {v11, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const-string v9, "#"

    const-string v14, "\u667a\u80fd\u9009\u62e9"

    const-string v6, "__smart__"

    move-object/from16 v52, v14

    const-string v14, "\u5173\u95ed"

    if-eqz v4, :cond_2d

    move-object v0, v14

    goto :goto_20

    .line 241
    :cond_2d
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2f

    .line 242
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2e

    move-object/from16 v0, v52

    goto :goto_20

    .line 243
    :cond_2e
    invoke-virtual {v9, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_20

    .line 244
    :cond_2f
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v11, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_30

    move-object/from16 v0, v50

    goto :goto_20

    :cond_30
    move-object/from16 v0, v16

    .line 245
    :goto_20
    const-string v11, " \u00b7 \u6295\u5582:"

    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    iget-object v0, v3, Lgz1;->ε:Lrd;

    .line 247
    iget-object v4, v0, Lrd;->α:Lip1;

    .line 248
    invoke-static {v4}, Ljz1;->ε(Lip1;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v10, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v53, v10

    .line 249
    iget-object v10, v0, Lrd;->β:Lip1;

    .line 250
    invoke-static {v10}, Ljz1;->ε(Lip1;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v13, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 251
    iget-object v0, v0, Lrd;->γ:Lip1;

    .line 252
    invoke-static {v0}, Ljz1;->ε(Lip1;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v54, v13

    move-object/from16 v13, v41

    invoke-virtual {v13, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v4, v10, v0}, [Ljava/lang/String;

    move-result-object v0

    .line 253
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v55

    const/16 v60, 0x0

    const/16 v61, 0x3e

    .line 254
    const-string v56, "/"

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    invoke-static/range {v55 .. v61}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    move-result-object v0

    .line 255
    const-string v10, " \u00b7 \u8425\u5730:"

    invoke-virtual {v10, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    const-string v0, " \u00b7 \u62d6\u52a8\u4eba\u5458\u5230\u8fd9\u91cc"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v0, 0x41300000    # 11.0f

    .line 258
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 259
    invoke-static/range {v17 .. v17}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    .line 260
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v0, 0x5

    move-object/from16 v4, p3

    .line 261
    invoke-static {v4, v0}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v0

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0, v2, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    move-object/from16 v0, p10

    .line 262
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 263
    new-instance v1, Lpv1;

    move/from16 v4, p9

    move-object/from16 v2, p14

    const/4 v13, 0x1

    invoke-direct {v1, v13, v3, v2, v4}, Lpv1;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 264
    new-instance v1, Lζ;

    const/4 v4, 0x3

    invoke-direct {v1, v3, v4, v0}, Lζ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 265
    new-instance v1, Ldz1;

    move-object/from16 p12, p0

    move-object/from16 p11, p3

    move-object/from16 p9, v1

    move-object/from16 p13, v3

    invoke-direct/range {p9 .. p14}, Ldz1;-><init>(Landroid/widget/LinearLayout;Landroid/app/Activity;Lxx;Lgz1;Lcu1;)V

    move-object/from16 v13, p9

    move-object/from16 v2, p10

    move-object/from16 v4, p11

    move-object/from16 v1, p12

    move-object/from16 v0, p14

    invoke-virtual {v2, v13}, Landroid/view/View;->setOnDragListener(Landroid/view/View$OnDragListener;)V

    move-object/from16 v13, p8

    .line 266
    invoke-virtual {v13, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v3, v40

    move-object/from16 v2, v49

    .line 267
    invoke-virtual {v3, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_89

    .line 268
    invoke-interface/range {v31 .. v31}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_32

    .line 269
    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    if-eqz v29, :cond_31

    .line 270
    const-string v3, "\u6682\u65e0\u672a\u5206\u7ec4\u4eba\u5458"

    goto :goto_21

    :cond_31
    const-string v3, "\u62d6\u52a8\u4eba\u5458\u5230\u6b64\u5206\u7ec4"

    :goto_21
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v3, 0x41300000    # 11.0f

    .line 271
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    const/16 v3, 0x11

    .line 272
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 273
    invoke-static/range {v17 .. v17}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    .line 274
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v5, 0xc

    .line 275
    invoke-static {v4, v5}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v3

    invoke-static {v4, v5}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v5

    const/4 v12, 0x0

    invoke-virtual {v2, v12, v3, v12, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 276
    invoke-virtual {v13, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto/16 :goto_5b

    .line 277
    :cond_32
    invoke-interface/range {v31 .. v31}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v29

    :goto_22
    invoke-interface/range {v29 .. v29}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_89

    invoke-interface/range {v29 .. v29}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lky1;

    .line 278
    sget-object v3, Lry1;->α:Lry1;

    invoke-static {v2}, Lry1;->ｐ(Lky1;)Ljava/lang/String;

    move-result-object v3

    iget v13, v2, Lky1;->ε:I

    move/from16 v31, v13

    move-object/from16 v13, v36

    invoke-static {v13, v3}, Lex0;->Θ(Ljava/util/HashMap;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lhz1;

    const v13, 0x7f0c005d

    move-object/from16 p14, v0

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v0, p4

    .line 279
    invoke-virtual {v0, v13, v10, v11}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v13

    const v10, 0x7f09026e

    .line 280
    invoke-virtual {v13, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/LinearLayout;

    const v11, 0x7f09035d

    .line 281
    invoke-virtual {v13, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Landroid/widget/TextView;

    const v0, 0x7f090360

    .line 282
    invoke-virtual {v13, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 p11, v9

    const v9, 0x7f09035f

    .line 283
    invoke-virtual {v13, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    move-object/from16 p12, v9

    const v9, 0x7f090364

    .line 284
    invoke-virtual {v13, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    move-object/from16 v40, v9

    const v9, 0x7f09035a

    .line 285
    invoke-virtual {v13, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    move-object/from16 v46, v13

    .line 286
    iget-object v13, v3, Lhz1;->γ:Lgy1;

    move-object/from16 v49, v9

    .line 287
    iget-boolean v9, v13, Lgy1;->α:Z

    iget-boolean v13, v13, Lgy1;->β:Z

    if-eqz v9, :cond_33

    if-eqz v13, :cond_33

    const/16 v55, 0x1

    goto :goto_23

    :cond_33
    const/16 v55, 0x0

    :goto_23
    if-eqz v9, :cond_34

    if-nez v13, :cond_34

    const/16 v56, 0x1

    :goto_24
    move/from16 v57, v9

    goto :goto_25

    :cond_34
    const/16 v56, 0x0

    goto :goto_24

    .line 288
    :goto_25
    iget-boolean v9, v3, Lhz1;->δ:Z

    move/from16 v58, v9

    .line 289
    iget v9, v2, Lky1;->η:I

    move/from16 v59, v13

    iget-boolean v13, v2, Lky1;->ζ:Z

    move/from16 v60, v13

    iget-object v13, v2, Lky1;->θ:Ljava/lang/String;

    move-object/from16 v61, v6

    const/4 v6, 0x3

    if-eq v9, v6, :cond_36

    .line 290
    const-string v6, "\u91cd\u71c3"

    move-object/from16 v62, v14

    const/4 v14, 0x0

    .line 291
    invoke-static {v13, v6, v14}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-nez v6, :cond_37

    .line 292
    const-string v6, "\u6d88\u5931"

    .line 293
    invoke-static {v13, v6, v14}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-eqz v6, :cond_35

    goto :goto_26

    :cond_35
    move v6, v14

    goto :goto_27

    :cond_36
    move-object/from16 v62, v14

    const/4 v14, 0x0

    :cond_37
    :goto_26
    const/4 v6, 0x1

    :goto_27
    if-eqz v58, :cond_38

    if-eqz v60, :cond_38

    const/4 v13, 0x1

    if-eq v9, v13, :cond_38

    const/4 v13, 0x1

    goto :goto_28

    :cond_38
    move v13, v14

    :goto_28
    if-eqz v13, :cond_39

    if-eqz v6, :cond_39

    const/4 v6, 0x1

    goto :goto_29

    :cond_39
    move v6, v14

    .line 294
    :goto_29
    const-string v14, "due_only"

    move/from16 v63, v6

    const-string v6, "custom_on"

    move/from16 v64, v13

    const-string v13, "custom_off"

    move-object/from16 v65, v12

    move-object/from16 v12, v33

    if-nez v56, :cond_3d

    .line 295
    invoke-virtual {v12, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_3a

    goto :goto_2a

    :cond_3a
    if-nez v55, :cond_3f

    .line 296
    invoke-virtual {v12, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_3b

    goto :goto_2b

    .line 297
    :cond_3b
    invoke-virtual {v12, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_3c

    move-object/from16 v33, v14

    goto :goto_2c

    :cond_3c
    if-eqz v18, :cond_3e

    :cond_3d
    :goto_2a
    move-object/from16 v33, v14

    const/16 v60, 0x0

    goto :goto_2c

    :cond_3e
    if-eqz p5, :cond_40

    :cond_3f
    :goto_2b
    move-object/from16 v33, v14

    const/16 v60, 0x1

    goto :goto_2c

    :cond_40
    if-eqz v58, :cond_3d

    goto :goto_2b

    .line 298
    :goto_2c
    iget-object v14, v1, Lxx;->σ:Ljava/lang/String;

    if-eqz v60, :cond_41

    move-object/from16 v1, v30

    :goto_2d
    move-object/from16 v42, v5

    move-object/from16 v5, v48

    move-object/from16 v48, v15

    const/16 v15, 0xc

    goto :goto_2e

    :cond_41
    move-object v1, v14

    goto :goto_2d

    .line 299
    :goto_2e
    invoke-static {v15, v4, v5, v1}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    move-result-object v1

    invoke-virtual {v10, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    if-nez v56, :cond_42

    .line 300
    invoke-virtual {v12, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v66

    if-eqz v66, :cond_43

    :cond_42
    move-object/from16 v1, v32

    move-object/from16 v32, v0

    move-object/from16 v0, v27

    move-object/from16 v27, v1

    move-object/from16 v1, v30

    move-object/from16 v30, v2

    move-object/from16 v2, v34

    move-object/from16 v34, v39

    move-object/from16 v39, v7

    move-object v7, v1

    move-object/from16 v1, v26

    move-object/from16 v26, v5

    move-object/from16 v5, v37

    move-object/from16 v37, v10

    move-object/from16 v10, v38

    move-object/from16 v38, v8

    move-object/from16 v8, v35

    goto/16 :goto_33

    :cond_43
    if-eqz v63, :cond_44

    .line 301
    new-instance v15, Ll91;

    move-object/from16 v1, v26

    move-object/from16 v26, v5

    move-object/from16 v5, v37

    invoke-direct {v15, v5, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v37, v32

    move-object/from16 v32, v0

    move-object/from16 v0, v27

    move-object/from16 v27, v37

    move-object/from16 v37, v30

    move-object/from16 v30, v2

    move-object/from16 v2, v34

    move-object/from16 v34, v39

    move-object/from16 v39, v7

    move-object/from16 v7, v37

    move-object/from16 v37, v10

    move-object/from16 v10, v38

    move-object/from16 v38, v8

    :goto_2f
    move-object/from16 v8, v35

    goto/16 :goto_34

    :cond_44
    move-object/from16 v1, v26

    move-object/from16 v26, v5

    move-object/from16 v5, v37

    if-eqz v64, :cond_45

    .line 302
    new-instance v15, Ll91;

    move-object/from16 v37, v10

    move-object/from16 v10, v38

    move-object/from16 v38, v8

    move-object/from16 v8, v39

    invoke-direct {v15, v8, v10}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v39, v32

    move-object/from16 v32, v0

    move-object/from16 v0, v27

    move-object/from16 v27, v39

    move-object/from16 v39, v7

    move-object/from16 v7, v30

    move-object/from16 v30, v2

    :goto_30
    move-object/from16 v2, v34

    move-object/from16 v34, v8

    goto :goto_2f

    :cond_45
    move-object/from16 v37, v10

    move-object/from16 v10, v38

    move-object/from16 v38, v8

    move-object/from16 v8, v39

    if-eqz v58, :cond_46

    .line 303
    new-instance v15, Ll91;

    move-object/from16 v39, v7

    move-object/from16 v7, v30

    move-object/from16 v30, v2

    move-object/from16 v2, v32

    invoke-direct {v15, v2, v7}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v32, v0

    move-object/from16 v0, v27

    :goto_31
    move-object/from16 v27, v2

    goto :goto_30

    :cond_46
    move-object/from16 v39, v7

    move-object/from16 v7, v30

    const/4 v15, 0x3

    move-object/from16 v30, v2

    move-object/from16 v2, v32

    if-ne v9, v15, :cond_47

    .line 304
    new-instance v15, Ll91;

    move-object/from16 v32, v0

    move-object/from16 v0, v27

    invoke-direct {v15, v0, v14}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_31

    :cond_47
    move-object/from16 v32, v0

    move-object/from16 v0, v27

    const/4 v15, 0x2

    if-ne v9, v15, :cond_48

    .line 305
    new-instance v15, Ll91;

    invoke-direct {v15, v8, v10}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_31

    :cond_48
    if-nez v55, :cond_49

    .line 306
    invoke-virtual {v12, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_4a

    :cond_49
    move-object/from16 v27, v2

    move-object/from16 v2, v34

    move-object/from16 v34, v8

    move-object/from16 v8, v35

    goto :goto_32

    :cond_4a
    const/4 v15, 0x1

    if-ne v9, v15, :cond_4b

    .line 307
    new-instance v15, Ll91;

    invoke-direct {v15, v2, v7}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_31

    .line 308
    :cond_4b
    new-instance v15, Ll91;

    move-object/from16 v27, v2

    move-object/from16 v2, v34

    move-object/from16 v34, v8

    move-object/from16 v8, v35

    invoke-direct {v15, v8, v2}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_34

    .line 309
    :goto_32
    new-instance v15, Ll91;

    invoke-direct {v15, v5, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_34

    .line 310
    :goto_33
    new-instance v15, Ll91;

    invoke-direct {v15, v0, v14}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 311
    :goto_34
    const-string v35, "\u5f85\u7eed"

    if-nez v56, :cond_4c

    .line 312
    invoke-virtual {v12, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v56

    if-eqz v56, :cond_4d

    :cond_4c
    move-object/from16 v56, v8

    goto :goto_37

    :cond_4d
    if-eqz v63, :cond_4e

    .line 313
    const-string v9, "\u91cd\u71c3\u4e2d"

    :goto_35
    move-object/from16 v56, v8

    goto :goto_38

    :cond_4e
    if-eqz v64, :cond_4f

    .line 314
    const-string v9, "\u5f85\u5bf9\u65b9"

    goto :goto_35

    :cond_4f
    if-eqz v58, :cond_50

    .line 315
    const-string v9, "\u5df2\u7eed"

    goto :goto_35

    :cond_50
    move-object/from16 v56, v8

    const/4 v8, 0x3

    if-ne v9, v8, :cond_51

    .line 316
    const-string v9, "\u7d27\u6025"

    goto :goto_38

    :cond_51
    const/4 v8, 0x2

    if-ne v9, v8, :cond_52

    move-object/from16 v9, v35

    goto :goto_38

    :cond_52
    if-nez v55, :cond_55

    .line 317
    invoke-virtual {v12, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_53

    goto :goto_36

    :cond_53
    const/4 v8, 0x1

    if-ne v9, v8, :cond_54

    .line 318
    const-string v9, "\u5065\u5eb7"

    goto :goto_38

    .line 319
    :cond_54
    const-string v9, "\u672a\u77e5"

    goto :goto_38

    .line 320
    :cond_55
    :goto_36
    const-string v9, "\u81ea\u5b9a"

    goto :goto_38

    :goto_37
    move-object/from16 v9, v45

    .line 321
    :goto_38
    invoke-static/range {v30 .. v30}, Lry1;->Σ(Lky1;)Ljava/lang/Integer;

    move-result-object v8

    if-eqz v8, :cond_56

    .line 322
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v55

    :goto_39
    move-object/from16 v67, v0

    goto :goto_3a

    :cond_56
    move/from16 v55, v31

    goto :goto_39

    :goto_3a
    invoke-static/range {v55 .. v55}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    move-object/from16 v28, v8

    const/4 v0, 0x0

    const/4 v8, 0x1

    .line 323
    invoke-virtual {v11, v0, v8}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 324
    iget-object v0, v15, Ll91;->ε:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljx0;->ξ(Ljava/lang/String;)I

    move-result v8

    invoke-virtual {v11, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 325
    iget-object v8, v15, Ll91;->ζ:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    move-object/from16 p7, v1

    const/16 v15, 0x9

    .line 326
    invoke-static {v15, v4, v8}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v1

    .line 327
    invoke-virtual {v11, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 328
    iget-object v1, v3, Lhz1;->β:Ljava/lang/String;

    move-object/from16 v11, v32

    .line 329
    invoke-virtual {v11, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 330
    invoke-static/range {v20 .. v20}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    .line 331
    invoke-virtual {v11, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 332
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v11, v30

    move-object/from16 v30, v14

    .line 333
    iget-wide v14, v11, Lky1;->γ:J

    const-wide/16 v68, 0x0

    cmp-long v68, v14, v68

    if-lez v68, :cond_57

    move-object/from16 v68, v2

    .line 334
    const-string v2, "UID: "

    .line 335
    invoke-static {v14, v15, v2}, Lnx;->ε(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_3b

    :cond_57
    move-object/from16 v68, v2

    .line 336
    const-string v2, "\u7fa4\u804a"

    :goto_3b
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v28, :cond_58

    .line 337
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_3c

    :cond_58
    move/from16 v2, v31

    :goto_3c
    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, " \u00b7 "

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " \u5929\u706b\u82b1"

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v28, :cond_59

    .line 338
    const-string v2, " \u00b7 \u5df2\u4f2a\u88c5"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    :cond_59
    iget-object v2, v3, Lhz1;->ε:Ljava/lang/String;

    .line 340
    const-string v14, " \u00b7 \u6d88\u606f:"

    invoke-virtual {v14, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v57, :cond_5a

    if-eqz v59, :cond_5a

    .line 341
    const-string v2, "\u4e2a\u4eba\u81ea\u5b9a\u4e49"

    :goto_3d
    move-object/from16 v14, v47

    goto :goto_3e

    :cond_5a
    if-eqz v57, :cond_5b

    if-nez v59, :cond_5b

    const-string v2, "\u4e2a\u4eba\u6392\u9664"

    goto :goto_3d

    .line 342
    :cond_5b
    const-string v2, "follow"

    .line 343
    invoke-virtual {v12, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5c

    .line 344
    invoke-static {v12}, Ljz1;->μ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_3d

    :cond_5c
    if-eqz v18, :cond_5d

    .line 345
    const-string v2, "\u672a\u9009\u62e9"

    goto :goto_3d

    :cond_5d
    if-eqz p5, :cond_5e

    const-string v2, "\u9ed8\u8ba4\u81ea\u52a8"

    goto :goto_3d

    :cond_5e
    const-string v2, "\u4ec5\u624b\u52a8\u5f85\u7eed"

    goto :goto_3d

    .line 346
    :goto_3e
    invoke-virtual {v14, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    invoke-static {v11}, Lry1;->Ψ(Lky1;)Lmy1;

    move-result-object v2

    .line 348
    invoke-static {v11}, Lry1;->Τ(Lky1;)Lly1;

    move-result-object v15

    if-eqz v15, :cond_5f

    .line 349
    iget-object v15, v15, Lly1;->γ:Lmy1;

    :goto_3f
    move-object/from16 v28, v5

    goto :goto_40

    :cond_5f
    const/4 v15, 0x0

    goto :goto_3f

    .line 350
    :goto_40
    iget-object v5, v2, Lmy1;->δ:Ljava/lang/Boolean;

    if-nez v5, :cond_61

    .line 351
    iget-object v5, v2, Lmy1;->ε:Ljava/lang/Boolean;

    if-nez v5, :cond_61

    .line 352
    iget-object v5, v2, Lmy1;->ζ:Ljava/lang/Boolean;

    if-nez v5, :cond_61

    .line 353
    iget-object v5, v2, Lmy1;->γ:Ljava/lang/String;

    .line 354
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_60

    goto :goto_41

    :cond_60
    const/4 v5, 0x0

    goto :goto_42

    :cond_61
    :goto_41
    const/4 v5, 0x1

    :goto_42
    move-object/from16 v31, v2

    if-eqz v15, :cond_62

    .line 355
    iget-object v2, v15, Lmy1;->δ:Ljava/lang/Boolean;

    if-nez v2, :cond_63

    .line 356
    iget-object v2, v15, Lmy1;->ε:Ljava/lang/Boolean;

    if-nez v2, :cond_63

    .line 357
    iget-object v2, v15, Lmy1;->ζ:Ljava/lang/Boolean;

    if-nez v2, :cond_63

    .line 358
    iget-object v2, v15, Lmy1;->γ:Ljava/lang/String;

    .line 359
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_62

    goto :goto_43

    :cond_62
    const/4 v2, 0x0

    goto :goto_44

    :cond_63
    :goto_43
    const/4 v2, 0x1

    .line 360
    :goto_44
    const-string v47, "Required value was null."

    if-nez v5, :cond_64

    if-nez v2, :cond_64

    move-object/from16 v31, v7

    move-object/from16 v69, v14

    move-object/from16 v2, v16

    move-object/from16 v14, v38

    move-object/from16 v4, v39

    move-object/from16 v7, v42

    move-object/from16 v70, v45

    move-object/from16 v15, v48

    move-object/from16 v45, v10

    :goto_45
    move-object/from16 v10, v65

    goto/16 :goto_4a

    :cond_64
    if-eqz v5, :cond_65

    move-object/from16 v2, v31

    goto :goto_46

    :cond_65
    if-eqz v15, :cond_88

    move-object v2, v15

    :goto_46
    if-eqz v5, :cond_66

    move-object/from16 v5, v19

    goto :goto_47

    :cond_66
    move-object/from16 v5, v23

    .line 361
    :goto_47
    iget-object v15, v2, Lmy1;->δ:Ljava/lang/Boolean;

    move-object/from16 v31, v7

    .line 362
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v15, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_67

    move-object/from16 v15, v45

    invoke-virtual {v5, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v45, v10

    move-object/from16 v69, v14

    move-object/from16 v70, v15

    move-object/from16 v14, v38

    move-object/from16 v4, v39

    move-object/from16 v7, v42

    move-object/from16 v15, v48

    goto :goto_45

    :cond_67
    move-object/from16 v15, v45

    move-object/from16 v45, v10

    .line 363
    invoke-static {}, Lyh;->χ()Lzt0;

    move-result-object v10

    move-object/from16 v69, v14

    .line 364
    iget-object v14, v2, Lmy1;->γ:Ljava/lang/String;

    .line 365
    invoke-static {v14}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_68

    move-object/from16 v14, v51

    invoke-virtual {v10, v14}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 366
    :cond_68
    iget-object v14, v2, Lmy1;->ε:Ljava/lang/Boolean;

    move-object/from16 v70, v15

    .line 367
    sget-object v15, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v14, v15}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v71

    if-eqz v71, :cond_69

    move-object/from16 v4, v39

    invoke-virtual {v10, v4}, Lzt0;->add(Ljava/lang/Object;)Z

    move-object/from16 v14, v38

    goto :goto_48

    :cond_69
    move-object/from16 v4, v39

    .line 368
    invoke-static {v14, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v39

    if-eqz v39, :cond_6a

    move-object/from16 v14, v38

    invoke-virtual {v10, v14}, Lzt0;->add(Ljava/lang/Object;)Z

    goto :goto_48

    :cond_6a
    move-object/from16 v39, v14

    move-object/from16 v14, v38

    if-nez v39, :cond_87

    .line 369
    :goto_48
    iget-object v2, v2, Lmy1;->ζ:Ljava/lang/Boolean;

    .line 370
    invoke-static {v2, v15}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_6b

    move-object/from16 v15, v48

    invoke-virtual {v10, v15}, Lzt0;->add(Ljava/lang/Object;)Z

    move-object/from16 v7, v42

    goto :goto_49

    :cond_6b
    move-object/from16 v15, v48

    .line 371
    invoke-static {v2, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6c

    move-object/from16 v7, v42

    invoke-virtual {v10, v7}, Lzt0;->add(Ljava/lang/Object;)Z

    goto :goto_49

    :cond_6c
    move-object/from16 v7, v42

    if-nez v2, :cond_86

    .line 372
    :goto_49
    invoke-static {v10}, Lyh;->μ(Lzt0;)Lzt0;

    move-result-object v71

    const/16 v76, 0x0

    const/16 v77, 0x3e

    .line 373
    const-string v72, "+"

    const/16 v73, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    invoke-static/range {v71 .. v77}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_6d

    const-string v2, "\u542f\u7528"

    :cond_6d
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_45

    .line 374
    :goto_4a
    invoke-virtual {v10, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    invoke-static {v11}, Lry1;->Ψ(Lky1;)Lmy1;

    move-result-object v2

    .line 376
    invoke-static {v11}, Lry1;->Τ(Lky1;)Lly1;

    move-result-object v5

    if-eqz v5, :cond_6e

    .line 377
    iget-object v5, v5, Lly1;->γ:Lmy1;

    :goto_4b
    move-object/from16 v39, v4

    goto :goto_4c

    :cond_6e
    const/4 v5, 0x0

    goto :goto_4b

    .line 378
    :goto_4c
    iget-object v4, v2, Lmy1;->η:Ljava/lang/Boolean;

    if-nez v4, :cond_70

    .line 379
    iget-object v4, v2, Lmy1;->θ:Ljava/lang/String;

    .line 380
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_6f

    goto :goto_4d

    :cond_6f
    const/4 v4, 0x0

    goto :goto_4e

    :cond_70
    :goto_4d
    const/4 v4, 0x1

    :goto_4e
    move-object/from16 v38, v2

    if-eqz v5, :cond_71

    .line 381
    iget-object v2, v5, Lmy1;->η:Ljava/lang/Boolean;

    if-nez v2, :cond_72

    .line 382
    iget-object v2, v5, Lmy1;->θ:Ljava/lang/String;

    .line 383
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_71

    goto :goto_4f

    :cond_71
    const/4 v2, 0x0

    goto :goto_50

    :cond_72
    :goto_4f
    const/4 v2, 0x1

    :goto_50
    if-nez v4, :cond_73

    if-nez v2, :cond_73

    move-object/from16 v42, v7

    move-object/from16 v65, v10

    move-object/from16 v4, v16

    move-object/from16 v5, v50

    move-object/from16 v2, v61

    move-object/from16 v10, p10

    move-object/from16 v7, p11

    goto/16 :goto_55

    :cond_73
    if-eqz v4, :cond_74

    move-object/from16 v2, v38

    goto :goto_51

    :cond_74
    if-eqz v5, :cond_85

    move-object v2, v5

    .line 384
    :goto_51
    iget-object v5, v2, Lmy1;->θ:Ljava/lang/String;

    if-eqz v4, :cond_75

    move-object/from16 v4, v19

    goto :goto_52

    :cond_75
    move-object/from16 v4, v23

    .line 385
    :goto_52
    iget-object v2, v2, Lmy1;->η:Ljava/lang/Boolean;

    move-object/from16 v42, v7

    .line 386
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v2, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_76

    move-object/from16 v2, v62

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v7, p11

    move-object/from16 v65, v10

    move-object/from16 v5, v50

    move-object/from16 v2, v61

    :goto_53
    move-object/from16 v10, p10

    goto :goto_55

    :cond_76
    move-object/from16 v2, v62

    .line 387
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_78

    .line 388
    invoke-static {v5}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    move-object/from16 v62, v2

    move-object/from16 v2, v61

    invoke-static {v7, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_77

    move-object/from16 v7, p11

    move-object/from16 v5, v52

    goto :goto_54

    :cond_77
    move-object/from16 v7, p11

    .line 389
    invoke-virtual {v7, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :goto_54
    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v65, v10

    move-object/from16 v5, v50

    goto :goto_53

    :cond_78
    move-object/from16 v7, p11

    move-object/from16 v62, v2

    move-object/from16 v5, v50

    move-object/from16 v2, v61

    .line 390
    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v65, v10

    goto :goto_53

    .line 391
    :goto_55
    invoke-virtual {v10, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    iget-object v3, v3, Lhz1;->ζ:Ljava/lang/String;

    move-object/from16 v4, p9

    .line 393
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v63, :cond_79

    .line 394
    const-string v3, " \u00b7 \u5df2\u53d1\u9001\uff0c\u7b49\u5f85\u91cd\u71c3\u5b8c\u6210"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_56

    :cond_79
    if-eqz v64, :cond_7a

    .line 395
    const-string v3, " \u00b7 \u5df2\u53d1\u9001\uff0c\u5f85\u5bf9\u65b9\u56de\u590d"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_56

    :cond_7a
    if-eqz v58, :cond_7b

    .line 396
    const-string v3, " \u00b7 \u4eca\u65e5\u5df2\u53d1"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    :cond_7b
    :goto_56
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v3, p12

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 398
    invoke-static/range {v17 .. v17}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    .line 399
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    move-object/from16 v1, v40

    .line 400
    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 401
    invoke-static {v1, v0, v8}, Ljz1;->Α(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v57, :cond_7c

    if-eqz v59, :cond_7c

    .line 402
    const-string v35, "\u4e2a\u4eba\u5f00"

    :goto_57
    move-object/from16 v0, v35

    move-object/from16 v9, v49

    goto :goto_58

    :cond_7c
    if-eqz v57, :cond_7d

    if-nez v59, :cond_7d

    const-string v35, "\u4e2a\u4eba\u5173"

    goto :goto_57

    .line 403
    :cond_7d
    invoke-virtual {v12, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7e

    .line 404
    const-string v35, "\u7ec4\u5f00"

    goto :goto_57

    .line 405
    :cond_7e
    invoke-virtual {v12, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7f

    .line 406
    const-string v35, "\u7ec4\u5173"

    goto :goto_57

    :cond_7f
    move-object/from16 v0, v33

    .line 407
    invoke-virtual {v12, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_80

    goto :goto_57

    :cond_80
    if-eqz v18, :cond_81

    .line 408
    const-string v35, "\u672a\u9009"

    goto :goto_57

    :cond_81
    if-eqz p5, :cond_82

    const-string v35, "\u9ed8\u8ba4"

    goto :goto_57

    :cond_82
    const-string v35, "\u624b\u52a8"

    goto :goto_57

    .line 409
    :goto_58
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz v60, :cond_83

    move-object/from16 v3, v27

    goto :goto_59

    :cond_83
    move-object/from16 v3, v67

    :goto_59
    if-eqz v60, :cond_84

    move-object/from16 v0, v31

    goto :goto_5a

    :cond_84
    move-object/from16 v0, v30

    .line 410
    :goto_5a
    invoke-static {v9, v3, v0}, Ljz1;->Α(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    .line 411
    new-instance v0, Lc9;

    move-object/from16 v1, p3

    move-object/from16 v8, p4

    move-object v3, v7

    move-object/from16 v7, p14

    invoke-direct {v0, v1, v8, v11, v7}, Lc9;-><init>(Landroid/app/Activity;Landroid/view/LayoutInflater;Lky1;Lcu1;)V

    move-object/from16 v6, v37

    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 412
    new-instance v0, Lζ;

    const/4 v9, 0x4

    invoke-direct {v0, v6, v9, v11}, Lζ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v6, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 413
    new-instance v0, Lez1;

    move-object/from16 v22, p7

    move-object/from16 v13, p8

    move-object/from16 v61, v2

    move-object v8, v4

    move-object/from16 v50, v5

    move-object/from16 v33, v12

    move-object/from16 v48, v26

    move-object/from16 v37, v28

    move-object/from16 v30, v31

    move/from16 v4, v60

    const/4 v12, -0x2

    const/16 v26, 0x8

    const/16 v28, 0x0

    const/16 v66, 0xc

    move-object/from16 v5, p13

    move-object v2, v1

    move-object v1, v6

    move-object v6, v11

    move-object/from16 v31, v27

    move-object/from16 v27, v67

    move-object v11, v3

    move-object/from16 v3, p0

    invoke-direct/range {v0 .. v7}, Lez1;-><init>(Landroid/widget/LinearLayout;Landroid/app/Activity;Lxx;ZLgz1;Lky1;Lcu1;)V

    move-object v2, v0

    move-object v3, v5

    move-object v0, v7

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnDragListener(Landroid/view/View$OnDragListener;)V

    move-object/from16 v1, v46

    .line 414
    invoke-virtual {v13, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 p13, v3

    move-object v9, v11

    move-object/from16 v26, v22

    move-object/from16 v32, v31

    move-object/from16 v7, v39

    move-object/from16 v5, v42

    move-object/from16 v38, v45

    move-object/from16 v35, v56

    move-object/from16 v6, v61

    move-object/from16 v12, v65

    move-object/from16 v47, v69

    move-object/from16 v45, v70

    move-object v11, v10

    move-object/from16 v39, v34

    move-object/from16 v34, v68

    move-object v10, v8

    move-object v8, v14

    move-object/from16 v14, v62

    goto/16 :goto_22

    .line 415
    :cond_85
    invoke-static/range {v47 .. v47}, Lγ;->ρ(Ljava/lang/String;)V

    return-void

    .line 416
    :cond_86
    invoke-static {}, Lγ;->κ()V

    return-void

    .line 417
    :cond_87
    invoke-static {}, Lγ;->κ()V

    return-void

    .line 418
    :cond_88
    invoke-static/range {v47 .. v47}, Lγ;->ρ(Ljava/lang/String;)V

    return-void

    :cond_89
    :goto_5b
    move-object/from16 v22, v26

    move-object/from16 v31, v32

    move-object/from16 v68, v34

    move-object/from16 v56, v35

    move-object/from16 v45, v38

    move-object/from16 v34, v39

    const/4 v9, 0x4

    const/4 v12, -0x2

    const/16 v26, 0x8

    const/16 v28, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object v6, v13

    move-object/from16 v11, v22

    move-object/from16 v12, v31

    move-object/from16 v39, v34

    move-object/from16 v14, v36

    move-object/from16 v5, v37

    move-object/from16 v15, v41

    move-object/from16 v38, v45

    move-object/from16 v8, v48

    move-object/from16 v10, v53

    move-object/from16 v13, v54

    move-object/from16 v9, v56

    move-object/from16 v2, v68

    goto/16 :goto_17

    .line 419
    :cond_8a
    invoke-static {}, Lγ;->κ()V

    return-void

    .line 420
    :cond_8b
    invoke-static {}, Lγ;->κ()V

    :cond_8c
    return-void
.end method

.method public static π(Landroid/widget/EditText;)V
    .locals 3

    .line 1
    new-instance v0, Lyx0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lyx0;-><init>(Landroid/widget/EditText;I)V

    .line 5
    .line 6
    .line 7
    const-wide/16 v1, 0x78

    .line 8
    .line 9
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static ρ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lmy1;Ljava/lang/String;Ljava/lang/String;Lky1;Lrd;Lqh1;Lg80;Lp70;)V
    .locals 44

    move-object/from16 v0, p0

    move-object/from16 v6, p3

    .line 1
    iget-object v1, v6, Lmy1;->β:Ljava/lang/String;

    iget-object v2, v6, Lmy1;->α:Ljava/lang/String;

    invoke-static {v0}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    move-result-object v4

    .line 2
    sget-object v3, Lx01;->α:Lx01;

    invoke-virtual {v3, v0}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    const v5, 0x7f0c003c

    const/4 v14, 0x0

    .line 3
    invoke-virtual {v3, v5, v14}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v8, v3

    check-cast v8, Landroid/widget/ScrollView;

    const v3, 0x7f0902bf

    .line 4
    invoke-virtual {v8, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Landroid/widget/LinearLayout;

    const v3, 0x7f09024e

    .line 5
    invoke-virtual {v9, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const v5, 0x7f090354

    .line 6
    invoke-virtual {v9, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    const v10, 0x7f090063

    .line 7
    invoke-virtual {v9, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TextView;

    const v11, 0x7f090352

    .line 8
    invoke-virtual {v9, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Landroid/widget/TextView;

    const v12, 0x7f0900d7

    .line 9
    invoke-virtual {v9, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Landroid/widget/LinearLayout;

    const v13, 0x7f090268

    .line 10
    invoke-virtual {v9, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Landroid/widget/RadioGroup;

    const v14, 0x7f090141

    .line 11
    invoke-virtual {v9, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Landroid/widget/EditText;

    const v15, 0x7f0900ce

    .line 12
    invoke-virtual {v9, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v15

    check-cast v15, Landroid/widget/LinearLayout;

    const v6, 0x7f090333

    .line 13
    invoke-virtual {v9, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    const v7, 0x7f090332

    .line 14
    invoke-virtual {v9, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    move-object/from16 v17, v1

    const v1, 0x7f090140

    .line 15
    invoke-virtual {v9, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    move-object/from16 v18, v2

    const v2, 0x7f09006b

    .line 16
    invoke-virtual {v9, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    move-object/from16 v19, v13

    const v13, 0x7f090057

    .line 17
    invoke-virtual {v9, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Landroid/widget/TextView;

    move-object/from16 v20, v13

    const v13, 0x7f090353

    .line 18
    invoke-virtual {v9, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Landroid/widget/TextView;

    move-object/from16 v21, v2

    .line 19
    iget-object v2, v4, Lxx;->β:Ljava/lang/String;

    move-object/from16 v22, v7

    const/16 v7, 0x10

    move-object/from16 v23, v6

    .line 20
    invoke-static {v7, v0, v2}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v6

    invoke-virtual {v8, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 21
    invoke-static {v7, v0, v2}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v2

    invoke-virtual {v9, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 22
    iget-object v6, v4, Lxx;->γ:Ljava/lang/String;

    const/16 v2, 0xc

    .line 23
    invoke-static {v2, v0, v6}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v7

    invoke-virtual {v3, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 24
    invoke-static {v2, v0, v6}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v3

    invoke-virtual {v12, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 25
    invoke-static {v2, v0, v6}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v3

    invoke-virtual {v14, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 26
    invoke-static {v2, v0, v6}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v3

    invoke-virtual {v15, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 27
    iget-object v7, v4, Lxx;->Α:Ljava/lang/String;

    .line 28
    iget-object v3, v4, Lxx;->χ:Ljava/lang/String;

    const/16 v2, 0xa

    move-object/from16 v26, v8

    .line 29
    invoke-static {v2, v0, v7, v3}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    move-result-object v8

    invoke-virtual {v1, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 30
    iget-object v8, v4, Lxx;->μ:Ljava/lang/String;

    move-object/from16 v27, v3

    .line 31
    invoke-static {v2, v0, v7, v8}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    move-result-object v3

    invoke-virtual {v10, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 32
    iget-object v3, v4, Lxx;->λ:Ljava/lang/String;

    .line 33
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    .line 34
    invoke-virtual {v10, v2}, Landroid/widget/TextView;->setTextColor(I)V

    move-object/from16 v2, p1

    .line 35
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    iget-object v2, v4, Lxx;->ζ:Ljava/lang/String;

    move-object/from16 v28, v8

    const/4 v8, 0x1

    move-object/from16 v29, v7

    const/4 v7, 0x0

    .line 37
    invoke-static {v2, v5, v7, v8}, Llz1;->ω(Ljava/lang/String;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    move-object/from16 v5, p2

    .line 38
    invoke-virtual {v11, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 39
    iget-object v7, v4, Lxx;->η:Ljava/lang/String;

    .line 40
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    .line 41
    invoke-virtual {v11, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 42
    iget-object v5, v4, Lxx;->Β:Ljava/lang/String;

    .line 43
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    .line 44
    invoke-virtual {v13, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 45
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    .line 46
    invoke-virtual {v14, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 47
    iget-object v11, v4, Lxx;->θ:Ljava/lang/String;

    .line 48
    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    .line 49
    invoke-virtual {v14, v5}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 50
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    move-object/from16 p1, v2

    move-object/from16 v2, v23

    .line 51
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v5, 0x0

    .line 52
    invoke-virtual {v2, v5, v8}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 53
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    move-object/from16 v5, v22

    .line 54
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 55
    invoke-static/range {p1 .. p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    .line 56
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 57
    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    .line 58
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 59
    iget-object v2, v4, Lxx;->ι:Ljava/lang/String;

    const/16 v5, 0xc

    .line 60
    invoke-static {v5, v0, v2}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v8

    move-object/from16 v23, v2

    move-object/from16 v2, v21

    invoke-virtual {v2, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 61
    invoke-static {v5, v0, v3}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v8

    move-object/from16 v21, v11

    move-object/from16 v11, v20

    invoke-virtual {v11, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    if-eqz p6, :cond_0

    const/4 v5, 0x0

    goto :goto_0

    :cond_0
    const/16 v5, 0x8

    .line 62
    :goto_0
    invoke-virtual {v11, v5}, Landroid/view/View;->setVisibility(I)V

    if-eqz p8, :cond_1

    const/4 v5, 0x0

    goto :goto_1

    :cond_1
    const/16 v5, 0x8

    .line 63
    :goto_1
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 64
    new-instance v5, Lfu1;

    const/4 v8, 0x1

    invoke-direct {v5, v14, v8}, Lfu1;-><init>(Landroid/widget/EditText;I)V

    invoke-virtual {v14, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 65
    new-instance v5, Lyy1;

    const/4 v8, 0x0

    invoke-direct {v5, v8}, Lyy1;-><init>(I)V

    invoke-virtual {v14, v5}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 66
    new-instance v5, Lfu1;

    const/4 v8, 0x2

    invoke-direct {v5, v1, v8}, Lfu1;-><init>(Landroid/widget/EditText;I)V

    invoke-virtual {v1, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 67
    new-instance v5, Lyy1;

    const/4 v8, 0x1

    invoke-direct {v5, v8}, Lyy1;-><init>(I)V

    invoke-virtual {v1, v5}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 68
    new-instance v5, Lma0;

    const/4 v8, 0x3

    invoke-direct {v5, v0, v8}, Lma0;-><init>(Landroid/app/Activity;I)V

    invoke-virtual {v10, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz p6, :cond_2

    .line 69
    sget-object v5, Lry1;->α:Lry1;

    invoke-static/range {p6 .. p6}, Lry1;->Σ(Lky1;)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    :goto_2
    if-eqz p6, :cond_3

    const/4 v10, 0x0

    goto :goto_3

    :cond_3
    const/16 v10, 0x8

    .line 70
    :goto_3
    invoke-virtual {v15, v10}, Landroid/view/View;->setVisibility(I)V

    if-eqz v5, :cond_4

    .line 71
    invoke-virtual {v5}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_4

    :cond_4
    const/4 v5, 0x0

    :goto_4
    if-nez v5, :cond_5

    const-string v5, ""

    :cond_5
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    move-object/from16 v5, v19

    const/16 v10, 0x8

    .line 72
    invoke-virtual {v5, v10}, Landroid/view/View;->setVisibility(I)V

    move-object/from16 v5, v18

    .line 73
    invoke-virtual {v14, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 74
    new-instance v10, Lum1;

    .line 75
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 76
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    move-result v5

    const-string v15, "default"

    const-string v8, "custom"

    const-string v0, "jinrishici"

    move-object/from16 v19, v1

    const-string v1, "hitokoto"

    if-nez v5, :cond_6

    move-object v5, v8

    goto :goto_5

    :cond_6
    move-object/from16 v5, v17

    .line 77
    invoke-static {v5, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_7

    move-object v5, v1

    goto :goto_5

    .line 78
    :cond_7
    invoke-static {v5, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    move-object v5, v0

    goto :goto_5

    :cond_8
    move-object v5, v15

    .line 79
    :goto_5
    iput-object v5, v10, Lum1;->ε:Ljava/lang/Object;

    .line 80
    const-string v17, "\u8ddf\u968f\u5168\u5c40"

    const-string v30, "\u8ddf\u968f\u5206\u7ec4/\u5168\u5c40"

    if-eqz p6, :cond_9

    move-object/from16 v5, v30

    :goto_6
    move-object/from16 v31, v2

    goto :goto_7

    :cond_9
    move-object/from16 v5, v17

    goto :goto_6

    .line 81
    :goto_7
    new-instance v2, Lfz1;

    invoke-direct {v2, v15, v5}, Lfz1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    new-instance v5, Lfz1;

    const-string v15, "\u56fa\u5b9a\u6587\u672c"

    invoke-direct {v5, v8, v15}, Lfz1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    new-instance v8, Lfz1;

    const-string v15, "\u4e00\u8a00"

    invoke-direct {v8, v1, v15}, Lfz1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    new-instance v1, Lfz1;

    const-string v15, "\u4eca\u65e5\u8bd7\u8bcd"

    invoke-direct {v1, v0, v15}, Lfz1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    filled-new-array {v2, v5, v8, v1}, [Lfz1;

    move-result-object v0

    .line 85
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 86
    iget-object v0, v10, Lum1;->ε:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 87
    new-instance v5, Lvl;

    const/4 v8, 0x6

    invoke-direct {v5, v10, v8}, Lvl;-><init>(Lum1;I)V

    const/4 v1, 0x0

    const/16 v8, 0xa

    move-object/from16 v25, p1

    move-object/from16 v15, v27

    move-object/from16 v27, v23

    move-object/from16 v23, v3

    move-object v3, v0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v5}, Ljz1;->β(Landroid/app/Activity;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lxx;La80;)Landroid/widget/LinearLayout;

    move-result-object v1

    .line 88
    invoke-virtual {v12, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 89
    new-instance v12, Lum1;

    .line 90
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 91
    const-string v0, "follow"

    if-nez p4, :cond_a

    move-object v1, v0

    goto :goto_8

    :cond_a
    move-object/from16 v1, p4

    :goto_8
    iput-object v1, v12, Lum1;->ε:Ljava/lang/Object;

    if-eqz p4, :cond_10

    .line 92
    invoke-static {}, Lyh;->χ()Lzt0;

    move-result-object v1

    .line 93
    new-instance v2, Lfz1;

    const-string v3, "\u8ddf\u968f\u9ed8\u8ba4\u89c4\u5219"

    invoke-direct {v2, v0, v3}, Lfz1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 94
    new-instance v2, Lfz1;

    .line 95
    const-string v3, "\u7ec4"

    move-object/from16 v5, p5

    const/4 v8, 0x0

    invoke-static {v5, v3, v8}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v20

    if-eqz v20, :cond_b

    .line 96
    const-string v20, "\u7ec4\u5185\u5168\u90e8\u52a0\u5165\u81ea\u5b9a\u4e49\u7eed\u706b"

    :goto_9
    move-object/from16 v32, v0

    move-object/from16 v8, v20

    goto :goto_a

    :cond_b
    const-string v20, "\u52a0\u5165\u81ea\u5b9a\u4e49\u7eed\u706b"

    goto :goto_9

    .line 97
    :goto_a
    const-string v0, "custom_on"

    invoke-direct {v2, v0, v8}, Lfz1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    invoke-virtual {v1, v2}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 99
    new-instance v0, Lfz1;

    const/4 v8, 0x0

    .line 100
    invoke-static {v5, v3, v8}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 101
    const-string v2, "\u81ea\u5b9a\u4e49\u7eed\u706b\u65f6\u6392\u9664\u6574\u7ec4"

    goto :goto_b

    :cond_c
    const-string v2, "\u81ea\u5b9a\u4e49\u7eed\u706b\u65f6\u6392\u9664"

    .line 102
    :goto_b
    const-string v8, "custom_off"

    invoke-direct {v0, v8, v2}, Lfz1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    invoke-virtual {v1, v0}, Lzt0;->add(Ljava/lang/Object;)Z

    const/4 v8, 0x0

    .line 104
    invoke-static {v5, v3, v8}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 105
    new-instance v0, Lfz1;

    const-string v2, "due_only"

    const-string v3, "\u4ec5\u5f85\u7eed\u65f6\u53d1\u9001"

    invoke-direct {v0, v2, v3}, Lfz1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 106
    :cond_d
    invoke-static {v1}, Lyh;->μ(Lzt0;)Lzt0;

    move-result-object v2

    .line 107
    iget-object v0, v12, Lum1;->ε:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 108
    new-instance v5, Lvl;

    const/4 v0, 0x7

    invoke-direct {v5, v12, v0}, Lvl;-><init>(Lum1;I)V

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    move-object/from16 v8, v32

    invoke-static/range {v0 .. v5}, Ljz1;->β(Landroid/app/Activity;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lxx;La80;)Landroid/widget/LinearLayout;

    move-result-object v1

    .line 109
    invoke-virtual {v9, v13}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v2

    if-gez v2, :cond_e

    const/4 v2, 0x0

    :cond_e
    invoke-virtual {v9, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 110
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    instance-of v2, v1, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz v2, :cond_f

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    goto :goto_c

    :cond_f
    const/4 v1, 0x0

    :goto_c
    if-eqz v1, :cond_11

    const/16 v2, 0xa

    invoke-static {v0, v2}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v3

    iput v3, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    goto :goto_d

    :cond_10
    move-object v8, v0

    move-object/from16 v0, p0

    .line 111
    :cond_11
    :goto_d
    new-instance v1, Lum1;

    .line 112
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    move-object/from16 v2, p3

    .line 113
    iget-object v3, v2, Lmy1;->δ:Ljava/lang/Boolean;

    .line 114
    invoke-static {v3}, Ljz1;->τ(Ljava/lang/Boolean;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lum1;->ε:Ljava/lang/Object;

    .line 115
    new-instance v3, Lum1;

    .line 116
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 117
    iget-object v5, v2, Lmy1;->ε:Ljava/lang/Boolean;

    .line 118
    invoke-static {v5}, Ljz1;->τ(Ljava/lang/Boolean;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Lum1;->ε:Ljava/lang/Object;

    move-object/from16 v32, v10

    .line 119
    new-instance v10, Lum1;

    .line 120
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 121
    iget-object v5, v2, Lmy1;->ζ:Ljava/lang/Boolean;

    .line 122
    invoke-static {v5}, Ljz1;->τ(Ljava/lang/Boolean;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v10, Lum1;->ε:Ljava/lang/Object;

    move-object/from16 v33, v11

    .line 123
    new-instance v11, Lum1;

    .line 124
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 125
    iget-object v5, v2, Lmy1;->η:Ljava/lang/Boolean;

    .line 126
    invoke-static {v5}, Ljz1;->τ(Ljava/lang/Boolean;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v11, Lum1;->ε:Ljava/lang/Object;

    .line 127
    new-instance v5, Lum1;

    .line 128
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    move-object/from16 p4, v3

    .line 129
    iget-object v3, v2, Lmy1;->θ:Ljava/lang/String;

    .line 130
    iput-object v3, v5, Lum1;->ε:Ljava/lang/Object;

    .line 131
    new-instance v3, Lum1;

    .line 132
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    if-nez p6, :cond_13

    if-eqz p7, :cond_12

    goto :goto_e

    :cond_12
    const/16 v34, 0x0

    goto :goto_f

    :cond_13
    :goto_e
    const/16 v34, 0x1

    :goto_f
    if-eqz p6, :cond_14

    move-object/from16 v17, v30

    :cond_14
    move-object/from16 v30, v7

    move-object/from16 v7, v17

    move-object/from16 v17, v12

    .line 133
    const-string v12, "\u5173\u95ed"

    move-object/from16 v35, v14

    const-string v14, "off"

    move-object/from16 v36, v9

    const-string v9, "\u5f00\u542f"

    move-object/from16 v37, v13

    const-string v13, "on"

    if-eqz v34, :cond_1d

    move-object/from16 p5, v11

    const/4 v2, 0x1

    .line 134
    invoke-static {v0, v2}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    move-result-object v11

    move-object/from16 v38, v3

    const/16 v2, 0xc

    .line 135
    invoke-static {v2, v0, v6}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v3

    invoke-virtual {v11, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/16 v2, 0xa

    .line 136
    invoke-static {v0, v2}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v3

    move-object/from16 v39, v4

    invoke-static {v0, v2}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v4

    move-object/from16 v40, v5

    invoke-static {v0, v2}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v5

    move-object/from16 v41, v6

    invoke-static {v0, v2}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v11, v3, v4, v5, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 137
    new-instance v2, Lfz1;

    invoke-direct {v2, v8, v7}, Lfz1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    new-instance v3, Lfz1;

    invoke-direct {v3, v13, v9}, Lfz1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    new-instance v4, Lfz1;

    invoke-direct {v4, v14, v12}, Lfz1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    filled-new-array {v2, v3, v4}, [Lfz1;

    move-result-object v2

    .line 140
    invoke-static {v2}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 141
    iget-object v3, v1, Lum1;->ε:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    .line 142
    new-instance v5, Lvl;

    const/16 v4, 0x8

    invoke-direct {v5, v1, v4}, Lvl;-><init>(Lum1;I)V

    move-object v4, v1

    const-string v1, "\u53c2\u4e0e\u6bcf\u65e5\u706b\u661f\u4efb\u52a1"

    move-object v6, v12

    move-object/from16 v12, p4

    move-object/from16 p4, v6

    move-object/from16 v6, v38

    move-object/from16 v38, v4

    move-object/from16 v4, v39

    move-object/from16 v39, v14

    move-object/from16 v14, v40

    move-object/from16 v40, v9

    move-object v9, v6

    move-object/from16 v6, p3

    invoke-static/range {v0 .. v5}, Ljz1;->β(Landroid/app/Activity;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lxx;La80;)Landroid/widget/LinearLayout;

    move-result-object v1

    .line 143
    invoke-virtual {v11, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 144
    iget-object v0, v12, Lum1;->ε:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 145
    new-instance v5, Lvl;

    const/16 v0, 0x9

    invoke-direct {v5, v12, v0}, Lvl;-><init>(Lum1;I)V

    const-string v1, "\u81ea\u52a8\u5b8c\u6210\u4e92\u53d1\u6d88\u606f"

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v5}, Ljz1;->β(Landroid/app/Activity;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lxx;La80;)Landroid/widget/LinearLayout;

    move-result-object v1

    .line 146
    invoke-virtual {v11, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 147
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 148
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "\u4e92\u53d1\u6d88\u606f\u5185\u5bb9\uff08\u7559\u7a7a"

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\uff09"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 149
    invoke-static/range {v25 .. v25}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    .line 150
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v3, 0x0

    const/4 v5, 0x1

    .line 151
    invoke-virtual {v1, v3, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    const/16 v5, 0xa

    .line 152
    invoke-static {v0, v5}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v3

    const/4 v5, 0x6

    invoke-static {v0, v5}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v5

    move-object/from16 p1, v12

    const/4 v12, 0x0

    invoke-virtual {v1, v12, v3, v12, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 153
    invoke-virtual {v11, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 154
    new-instance v1, Landroid/widget/EditText;

    invoke-direct {v1, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 155
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "\u5f53\u524d"

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\u9ed8\u8ba4\u5185\u5bb9"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 156
    iget-object v3, v6, Lmy1;->γ:Ljava/lang/String;

    .line 157
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v3, 0x2

    .line 158
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 159
    invoke-static/range {v25 .. v25}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    .line 160
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 161
    invoke-static/range {v21 .. v21}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    .line 162
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setHintTextColor(I)V

    move-object/from16 v6, v29

    const/16 v5, 0xa

    .line 163
    invoke-static {v5, v0, v6, v15}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 164
    invoke-static {v0, v5}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v3

    move-object/from16 v21, v2

    const/16 v12, 0x8

    invoke-static {v0, v12}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v2

    move-object/from16 v29, v4

    invoke-static {v0, v5}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v4

    invoke-static {v0, v12}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v1, v3, v2, v4, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 165
    new-instance v2, Lfu1;

    const/4 v3, 0x3

    invoke-direct {v2, v1, v3}, Lfu1;-><init>(Landroid/widget/EditText;I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 166
    iput-object v1, v9, Lum1;->ε:Ljava/lang/Object;

    .line 167
    invoke-virtual {v11, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 168
    iget-object v1, v10, Lum1;->ε:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    .line 169
    new-instance v5, Lvl;

    const/4 v2, 0x1

    invoke-direct {v5, v10, v2}, Lvl;-><init>(Lum1;I)V

    const-string v1, "\u81ea\u52a8\u53d1\u9001\u4efb\u52a1\u56fe\u7247"

    move-object/from16 v2, v21

    move-object/from16 v4, v29

    const/16 v16, 0x0

    invoke-static/range {v0 .. v5}, Ljz1;->β(Landroid/app/Activity;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lxx;La80;)Landroid/widget/LinearLayout;

    move-result-object v1

    .line 170
    invoke-virtual {v11, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v12, p5

    .line 171
    iget-object v0, v12, Lum1;->ε:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 172
    new-instance v5, Lvl;

    const/4 v0, 0x2

    invoke-direct {v5, v12, v0}, Lvl;-><init>(Lum1;I)V

    const-string v1, "\u81ea\u52a8\u6295\u5582\u5c0f\u706b\u4eba"

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v5}, Ljz1;->β(Landroid/app/Activity;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lxx;La80;)Landroid/widget/LinearLayout;

    move-result-object v1

    .line 173
    invoke-virtual {v11, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 174
    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 175
    invoke-static {v14, v7}, Ljz1;->ψ(Lum1;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "\u6295\u5582\u98df\u7269\uff1a"

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v1, 0x41500000    # 13.0f

    .line 176
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 177
    invoke-static/range {v25 .. v25}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    .line 178
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v2, 0xa

    .line 179
    invoke-static {v2, v0, v6, v15}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    move-result-object v3

    invoke-virtual {v5, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/16 v2, 0xc

    .line 180
    invoke-static {v0, v2}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v3

    const/16 v4, 0xb

    invoke-static {v0, v4}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v15

    invoke-static {v0, v2}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v1

    invoke-static {v0, v4}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v5, v3, v15, v1, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 181
    new-instance v0, Lg90;

    move-object v1, v6

    const/4 v6, 0x4

    move-object/from16 v3, p6

    move-object v4, v5

    move-object v5, v7

    move-object v2, v14

    move-object/from16 v14, v41

    const/high16 v15, 0x41500000    # 13.0f

    move-object v7, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v6}, Lg90;-><init>(Landroid/app/Activity;Lum1;Ljava/lang/Object;Landroid/widget/TextView;Ljava/lang/Object;I)V

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    move-object v6, v2

    invoke-virtual {v4, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 182
    invoke-virtual {v11, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 183
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    instance-of v2, v1, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz v2, :cond_15

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    goto :goto_10

    :cond_15
    move-object/from16 v1, v16

    :goto_10
    if-eqz v1, :cond_16

    const/16 v2, 0x8

    invoke-static {v0, v2}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v3

    iput v3, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    :cond_16
    if-eqz p6, :cond_17

    .line 184
    const-string v1, "\u66f4\u65b0\u8be5\u4eba\u5458\u98df\u7269\u5217\u8868"

    goto :goto_11

    .line 185
    :cond_17
    const-string v1, "\u66f4\u65b0\u98df\u7269\u5217\u8868"

    .line 186
    :goto_11
    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 187
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 v3, 0x11

    .line 188
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 189
    invoke-virtual {v2, v15}, Landroid/widget/TextView;->setTextSize(F)V

    .line 190
    invoke-static/range {v23 .. v23}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    .line 191
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    move-object/from16 v3, v28

    const/16 v15, 0xa

    .line 192
    invoke-static {v15, v0, v7, v3}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 193
    invoke-static {v0, v15}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v3

    invoke-static {v0, v15}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v7

    move-object/from16 v21, v1

    invoke-static {v0, v15}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v1

    move-object/from16 v23, v4

    invoke-static {v0, v15}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v2, v3, v7, v1, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 194
    new-instance v0, Ltt1;

    const/16 v24, 0x10

    move-object/from16 v3, p6

    move-object v1, v2

    move-object v7, v5

    move-object/from16 v4, v21

    move-object/from16 v5, v23

    move-object/from16 v2, p0

    invoke-direct/range {v0 .. v7}, Ltt1;-><init>(Landroid/widget/TextView;Landroid/app/Activity;Lky1;Ljava/lang/String;Landroid/widget/TextView;Lum1;Ljava/lang/String;)V

    move-object v4, v2

    move-object v2, v0

    move-object v0, v4

    move-object v15, v3

    move-object v4, v5

    move-object v5, v7

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 195
    invoke-virtual {v11, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 196
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    instance-of v2, v1, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz v2, :cond_18

    move-object v7, v1

    check-cast v7, Landroid/widget/LinearLayout$LayoutParams;

    goto :goto_12

    :cond_18
    move-object/from16 v7, v16

    :goto_12
    if-eqz v7, :cond_19

    const/16 v2, 0x8

    invoke-static {v0, v2}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v1

    iput v1, v7, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 197
    :cond_19
    invoke-static {}, Lgf1;->γ()Lef1;

    move-result-object v1

    .line 198
    iget-object v1, v1, Lef1;->α:Ljava/util/List;

    .line 199
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1a

    .line 200
    sget-object v1, Lpf1;->α:Ljava/lang/Object;

    new-instance v1, Lwy1;

    invoke-direct {v1, v4, v6, v5}, Lwy1;-><init>(Landroid/widget/TextView;Lum1;Ljava/lang/String;)V

    invoke-static {v0, v15, v1}, Lpf1;->δ(Landroid/app/Activity;Lky1;La80;)V

    :cond_1a
    move-object/from16 v7, v36

    move-object/from16 v1, v37

    .line 201
    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v2

    if-gez v2, :cond_1b

    const/4 v2, 0x0

    :cond_1b
    invoke-virtual {v7, v11, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 202
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    instance-of v3, v2, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz v3, :cond_1c

    check-cast v2, Landroid/widget/LinearLayout$LayoutParams;

    goto :goto_13

    :cond_1c
    move-object/from16 v2, v16

    :goto_13
    if-eqz v2, :cond_1e

    const/16 v3, 0xa

    invoke-static {v0, v3}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v4

    iput v4, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    goto :goto_14

    :cond_1d
    move-object/from16 p1, p4

    move-object/from16 v15, p6

    move-object/from16 v38, v1

    move-object/from16 v29, v4

    move-object/from16 v40, v9

    move-object/from16 p4, v12

    move-object/from16 v39, v14

    move-object/from16 v1, v37

    const/16 v16, 0x0

    const/16 v24, 0x10

    move-object v9, v3

    move-object v14, v6

    move-object v12, v11

    move-object v6, v5

    move-object v5, v7

    move-object/from16 v7, v36

    .line 203
    :cond_1e
    :goto_14
    new-instance v11, Lum1;

    .line 204
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 205
    sget-object v2, Lip1;->ε:Lip1;

    move-object/from16 v3, p7

    if-eqz p7, :cond_1f

    .line 206
    iget-object v4, v3, Lrd;->α:Lip1;

    if-nez v4, :cond_20

    :cond_1f
    move-object v4, v2

    .line 207
    :cond_20
    invoke-static {v4}, Ljz1;->σ(Lip1;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v11, Lum1;->ε:Ljava/lang/Object;

    .line 208
    new-instance v4, Lum1;

    .line 209
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    move-object/from16 v37, v1

    if-eqz v3, :cond_21

    .line 210
    iget-object v1, v3, Lrd;->β:Lip1;

    if-nez v1, :cond_22

    :cond_21
    move-object v1, v2

    .line 211
    :cond_22
    invoke-static {v1}, Ljz1;->σ(Lip1;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v4, Lum1;->ε:Ljava/lang/Object;

    .line 212
    new-instance v1, Lum1;

    .line 213
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    move-object/from16 p2, v2

    if-eqz v3, :cond_23

    .line 214
    iget-object v2, v3, Lrd;->γ:Lip1;

    if-nez v2, :cond_24

    :cond_23
    move-object/from16 v2, p2

    .line 215
    :cond_24
    invoke-static {v2}, Ljz1;->σ(Lip1;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lum1;->ε:Ljava/lang/Object;

    if-eqz v3, :cond_27

    move-object/from16 v21, v6

    const/4 v2, 0x1

    .line 216
    invoke-static {v0, v2}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    move-result-object v6

    const/16 v2, 0xc

    .line 217
    invoke-static {v2, v0, v14}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v2

    invoke-virtual {v6, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/16 v2, 0xa

    .line 218
    invoke-static {v0, v2}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v14

    move-object/from16 p2, v1

    invoke-static {v0, v2}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v1

    invoke-static {v0, v2}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v3

    move-object/from16 p3, v4

    invoke-static {v0, v2}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v6, v14, v1, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 219
    new-instance v1, Lfz1;

    invoke-direct {v1, v8, v5}, Lfz1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    new-instance v2, Lfz1;

    move-object/from16 v3, v40

    invoke-direct {v2, v13, v3}, Lfz1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    new-instance v3, Lfz1;

    move-object/from16 v4, p4

    move-object/from16 v5, v39

    invoke-direct {v3, v5, v4}, Lfz1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    filled-new-array {v1, v2, v3}, [Lfz1;

    move-result-object v1

    .line 222
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 223
    iget-object v1, v11, Lum1;->ε:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    .line 224
    new-instance v5, Lvl;

    const/4 v1, 0x3

    invoke-direct {v5, v11, v1}, Lvl;-><init>(Lum1;I)V

    const-string v1, "\u8425\u5730\u81ea\u52a8\u6536\u83b7"

    move-object/from16 v8, p2

    move-object/from16 v14, p3

    move-object/from16 v4, v29

    move-object/from16 v13, v37

    const/16 v22, 0x1

    invoke-static/range {v0 .. v5}, Ljz1;->β(Landroid/app/Activity;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lxx;La80;)Landroid/widget/LinearLayout;

    move-result-object v1

    .line 225
    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 226
    iget-object v0, v14, Lum1;->ε:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 227
    new-instance v5, Lvl;

    const/4 v0, 0x4

    invoke-direct {v5, v14, v0}, Lvl;-><init>(Lum1;I)V

    const-string v1, "\u8425\u5730\u81ea\u52a8\u79cd\u690d"

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v5}, Ljz1;->β(Landroid/app/Activity;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lxx;La80;)Landroid/widget/LinearLayout;

    move-result-object v1

    .line 228
    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 229
    iget-object v0, v8, Lum1;->ε:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 230
    new-instance v5, Lvl;

    const/4 v0, 0x5

    invoke-direct {v5, v8, v0}, Lvl;-><init>(Lum1;I)V

    const-string v1, "\u8425\u5730\u81ea\u52a8\u6d47\u6c34"

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v5}, Ljz1;->β(Landroid/app/Activity;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lxx;La80;)Landroid/widget/LinearLayout;

    move-result-object v1

    .line 231
    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 232
    invoke-virtual {v7, v13}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v1

    if-gez v1, :cond_25

    const/4 v1, 0x0

    :cond_25
    invoke-virtual {v7, v6, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 233
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    instance-of v2, v1, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz v2, :cond_26

    move-object v7, v1

    check-cast v7, Landroid/widget/LinearLayout$LayoutParams;

    goto :goto_15

    :cond_26
    move-object/from16 v7, v16

    :goto_15
    if-eqz v7, :cond_28

    const/16 v2, 0xa

    invoke-static {v0, v2}, Ljz1;->ζ(Landroid/content/Context;I)I

    move-result v1

    iput v1, v7, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    goto :goto_16

    :cond_27
    move-object v8, v1

    move-object v14, v4

    move-object/from16 v21, v6

    move-object/from16 v4, v29

    const/16 v22, 0x1

    .line 234
    :cond_28
    :goto_16
    new-instance v0, Lxy1;

    const/4 v13, 0x0

    move-object/from16 p3, v16

    move-object/from16 v16, v11

    move-object v11, v12

    move-object/from16 v12, v21

    move-object/from16 v21, p3

    move-object/from16 v3, p0

    move-object/from16 v1, p8

    move-object/from16 v42, v4

    move-object/from16 v18, v8

    move-object v7, v9

    move-object/from16 p3, v14

    move-object/from16 v14, v26

    move-object/from16 v2, v31

    move-object/from16 v4, v32

    move-object/from16 v20, v33

    move/from16 v6, v34

    move-object/from16 v5, v35

    move-object/from16 v8, v38

    move-object/from16 v9, p1

    invoke-direct/range {v0 .. v13}, Lxy1;-><init>(Ljava/lang/Object;Landroid/widget/TextView;Landroid/app/Activity;Lum1;Landroid/widget/EditText;ZLum1;Lum1;Lum1;Lum1;Lum1;Lum1;I)V

    move/from16 v22, v6

    move-object v6, v12

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 235
    new-instance v0, Lxy1;

    const/4 v13, 0x1

    move-object v1, v15

    move-object/from16 v2, v20

    move/from16 v6, v22

    invoke-direct/range {v0 .. v13}, Lxy1;-><init>(Ljava/lang/Object;Landroid/widget/TextView;Landroid/app/Activity;Lum1;Landroid/widget/EditText;ZLum1;Lum1;Lum1;Lum1;Lum1;Lum1;I)V

    move-object v1, v0

    move-object v0, v3

    move-object v6, v12

    move-object v12, v11

    move-object v11, v2

    invoke-virtual {v11, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 236
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 237
    invoke-virtual {v1, v14}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 238
    new-instance v0, Lzy1;

    move-object/from16 v2, p6

    move-object/from16 v15, p7

    move-object/from16 v43, v1

    move-object v3, v4

    move-object v14, v6

    move-object v11, v9

    move-object v13, v12

    move-object/from16 v6, v17

    move-object/from16 v1, v19

    move-object/from16 v4, p0

    move-object/from16 v17, p3

    move-object v9, v7

    move-object v12, v10

    move-object v7, v5

    move-object v10, v8

    move/from16 v8, v22

    move-object/from16 v5, p9

    invoke-direct/range {v0 .. v18}, Lzy1;-><init>(Landroid/widget/EditText;Lky1;Lum1;Landroid/app/Activity;Lg80;Lum1;Landroid/widget/EditText;ZLum1;Lum1;Lum1;Lum1;Lum1;Lum1;Lrd;Lum1;Lum1;Lum1;)V

    const-string v1, "\u4fdd\u5b58"

    move-object/from16 v2, v43

    invoke-virtual {v2, v1, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 239
    const-string v1, "\u53d6\u6d88"

    const/4 v5, 0x0

    invoke-virtual {v0, v1, v5}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 240
    new-instance v1, Lwt1;

    move-object/from16 v2, p10

    const/4 v8, 0x1

    invoke-direct {v1, v8, v2}, Lwt1;-><init>(ILp70;)V

    const-string v2, "\u6e05\u9664"

    invoke-virtual {v0, v2, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 241
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 242
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 243
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-eqz v1, :cond_29

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    const/4 v8, 0x0

    invoke-direct {v2, v8}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 244
    :cond_29
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-eqz v1, :cond_2a

    const/16 v2, 0x10

    invoke-virtual {v1, v2}, Landroid/view/Window;->setSoftInputMode(I)V

    :cond_2a
    const/4 v1, -0x1

    .line 245
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v1

    if-eqz v1, :cond_2b

    .line 246
    invoke-static/range {v27 .. v27}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    .line 247
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_2b
    const/4 v1, -0x2

    .line 248
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v1

    if-eqz v1, :cond_2c

    .line 249
    invoke-static/range {v30 .. v30}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    .line 250
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_2c
    const/4 v1, -0x3

    .line 251
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v0

    if-eqz v0, :cond_2d

    move-object/from16 v4, v42

    .line 252
    iget-object v1, v4, Lxx;->ρ:Ljava/lang/String;

    .line 253
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    .line 254
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_2d
    return-void
.end method

.method public static final σ(Lip1;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_2

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq p0, v0, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-ne p0, v0, :cond_0

    .line 12
    .line 13
    const-string p0, "off"

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-static {}, Lγ;->κ()V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_1
    const-string p0, "on"

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_2
    const-string p0, "follow"

    .line 25
    .line 26
    return-object p0
.end method

.method public static final τ(Ljava/lang/Boolean;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string p0, "on"

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const-string p0, "off"

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    if-nez p0, :cond_2

    .line 24
    .line 25
    const-string p0, "follow"

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_2
    invoke-static {}, Lγ;->κ()V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public static final υ(Ljava/lang/String;)Lip1;
    .locals 1

    .line 1
    const-string v0, "on"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lip1;->ζ:Lip1;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string v0, "off"

    .line 13
    .line 14
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    sget-object p0, Lip1;->η:Lip1;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    sget-object p0, Lip1;->ε:Lip1;

    .line 24
    .line 25
    return-object p0
.end method

.method public static final φ(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 1

    .line 1
    const-string v0, "on"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string v0, "off"

    .line 13
    .line 14
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method

.method public static final χ(Lum1;Landroid/widget/EditText;ZLum1;Lum1;Lum1;Lum1;Lum1;Lum1;)Lmy1;
    .locals 14

    .line 1
    iget-object p0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const v1, -0x5069748f

    .line 10
    .line 11
    .line 12
    const-string v2, ""

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-eq v0, v1, :cond_4

    .line 16
    .line 17
    const v1, -0x4dd6cbe5

    .line 18
    .line 19
    .line 20
    const/16 v4, 0xfd

    .line 21
    .line 22
    if-eq v0, v1, :cond_2

    .line 23
    .line 24
    const v1, -0x1e8bb1ac

    .line 25
    .line 26
    .line 27
    if-eq v0, v1, :cond_0

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_0
    const-string v0, "jinrishici"

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-nez p0, :cond_1

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_1
    new-instance p0, Lmy1;

    .line 40
    .line 41
    invoke-direct {p0, v4, v3, v0}, Lmy1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    move-object v4, p0

    .line 45
    goto :goto_3

    .line 46
    :cond_2
    const-string v0, "hitokoto"

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_3

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_3
    new-instance p0, Lmy1;

    .line 56
    .line 57
    invoke-direct {p0, v4, v3, v0}, Lmy1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_4
    const-string v0, "custom"

    .line 62
    .line 63
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-eqz p0, :cond_7

    .line 68
    .line 69
    new-instance p0, Lmy1;

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    if-eqz v1, :cond_5

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    goto :goto_1

    .line 82
    :cond_5
    move-object v1, v3

    .line 83
    :goto_1
    if-nez v1, :cond_6

    .line 84
    .line 85
    move-object v1, v2

    .line 86
    :cond_6
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    const/16 v4, 0x50

    .line 95
    .line 96
    invoke-static {v1, v4}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    const/16 v4, 0xfc

    .line 101
    .line 102
    invoke-direct {p0, v4, v1, v0}, Lmy1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_7
    :goto_2
    new-instance p0, Lmy1;

    .line 107
    .line 108
    const/16 v0, 0xff

    .line 109
    .line 110
    invoke-direct {p0, v0, v3, v3}, Lmy1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :goto_3
    if-eqz p2, :cond_a

    .line 115
    .line 116
    move-object/from16 p0, p3

    .line 117
    .line 118
    iget-object p0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p0, Landroid/widget/EditText;

    .line 121
    .line 122
    if-eqz p0, :cond_8

    .line 123
    .line 124
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    if-eqz p0, :cond_8

    .line 129
    .line 130
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    :cond_8
    if-nez v3, :cond_9

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_9
    move-object v2, v3

    .line 138
    :goto_4
    invoke-static {v2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    const/16 v0, 0x30

    .line 147
    .line 148
    invoke-static {p0, v0}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    move-object/from16 p0, p4

    .line 153
    .line 154
    iget-object p0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast p0, Ljava/lang/String;

    .line 157
    .line 158
    invoke-static {p0}, Ljz1;->φ(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 159
    .line 160
    .line 161
    move-result-object v8

    .line 162
    move-object/from16 p0, p5

    .line 163
    .line 164
    iget-object p0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast p0, Ljava/lang/String;

    .line 167
    .line 168
    invoke-static {p0}, Ljz1;->φ(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 169
    .line 170
    .line 171
    move-result-object v9

    .line 172
    move-object/from16 p0, p6

    .line 173
    .line 174
    iget-object p0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast p0, Ljava/lang/String;

    .line 177
    .line 178
    invoke-static {p0}, Ljz1;->φ(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    move-object/from16 p0, p7

    .line 183
    .line 184
    iget-object p0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast p0, Ljava/lang/String;

    .line 187
    .line 188
    invoke-static {p0}, Ljz1;->φ(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 189
    .line 190
    .line 191
    move-result-object v11

    .line 192
    move-object/from16 p0, p8

    .line 193
    .line 194
    iget-object p0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 195
    .line 196
    move-object v12, p0

    .line 197
    check-cast v12, Ljava/lang/String;

    .line 198
    .line 199
    const/4 v13, 0x3

    .line 200
    const/4 v5, 0x0

    .line 201
    const/4 v6, 0x0

    .line 202
    invoke-static/range {v4 .. v13}, Lmy1;->α(Lmy1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;I)Lmy1;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    return-object p0

    .line 207
    :cond_a
    return-object v4
.end method

.method public static final ψ(Lum1;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/CharSequence;

    .line 4
    .line 5
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string p0, "\u9ed8\u8ba4"

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    iget-object p0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p0}, Lgf1;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static ω()V
    .locals 2

    .line 1
    sget-object v0, Ljz1;->γ:Lhy;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Ljz1;->β:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    sput-object v0, Ljz1;->γ:Lhy;

    .line 12
    .line 13
    return-void
.end method
