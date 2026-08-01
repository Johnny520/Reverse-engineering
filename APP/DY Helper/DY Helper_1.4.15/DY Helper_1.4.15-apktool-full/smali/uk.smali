.class public final Luk;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public Α:Lb8;

.field public final α:Landroid/app/Activity;

.field public final β:Lxx;

.field public γ:Lnk;

.field public δ:Lmk;

.field public ε:Z

.field public ζ:Z

.field public η:Landroid/app/AlertDialog;

.field public θ:Landroid/widget/TextView;

.field public ι:Landroid/widget/TextView;

.field public κ:Landroid/widget/TextView;

.field public λ:Landroid/widget/LinearLayout;

.field public μ:Landroid/widget/LinearLayout;

.field public ν:Landroid/widget/LinearLayout;

.field public ξ:Landroid/widget/LinearLayout;

.field public ο:Landroid/widget/LinearLayout;

.field public π:Landroid/widget/TextView;

.field public ρ:Landroid/widget/SeekBar;

.field public σ:Landroid/widget/LinearLayout;

.field public τ:Landroid/widget/Switch;

.field public υ:Landroid/view/View;

.field public φ:Landroid/widget/TextView;

.field public χ:Landroid/widget/LinearLayout;

.field public ψ:Landroid/widget/Switch;

.field public ω:Landroid/widget/Switch;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Luk;->α:Landroid/app/Activity;

    .line 8
    .line 9
    invoke-static {p1}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Luk;->β:Lxx;

    .line 14
    .line 15
    sget-object p1, Lnk;->ε:Lnk;

    .line 16
    .line 17
    iput-object p1, p0, Luk;->γ:Lnk;

    .line 18
    .line 19
    sget-object p1, Llk;->α:Ljava/util/List;

    .line 20
    .line 21
    invoke-static {p1}, Lxh;->З(Ljava/util/List;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lmk;

    .line 26
    .line 27
    iput-object p1, p0, Luk;->δ:Lmk;

    .line 28
    .line 29
    return-void
.end method

.method public static δ(Lmk;)I
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, Lui1;->α:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object p0, p0, Lmk;->α:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {p0}, Lui1;->ι(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    new-instance v0, Leo1;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    move-object p0, v0

    .line 25
    :goto_0
    const/4 v0, -0x1

    .line 26
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    instance-of v1, p0, Leo1;

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    move-object p0, v0

    .line 35
    :cond_0
    check-cast p0, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0
.end method

.method public static ε()Ljava/util/ArrayList;
    .locals 5

    .line 1
    sget-object v0, Llk;->α:Ljava/util/List;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    move-object v3, v2

    .line 23
    check-cast v3, Lmk;

    .line 24
    .line 25
    iget-boolean v4, v3, Lmk;->γ:Z

    .line 26
    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    sget-object v4, Lui1;->α:Ljava/lang/Object;

    .line 30
    .line 31
    iget-object v3, v3, Lmk;->α:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v3}, Lui1;->χ(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-nez v3, :cond_0

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    return-object v1
.end method

.method public static ζ()Z
    .locals 2

    .line 1
    const-string v0, "comment_content_color_skip_mention"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method


# virtual methods
.method public final α(Landroid/widget/TextView;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Luk;->β:Lxx;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object v1, v0, Lxx;->ι:Ljava/lang/String;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v1, v0, Lxx;->η:Ljava/lang/String;

    .line 9
    .line 10
    :goto_0
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 15
    .line 16
    .line 17
    if-eqz p2, :cond_1

    .line 18
    .line 19
    sget-object v1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 23
    .line 24
    :goto_1
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 25
    .line 26
    .line 27
    if-eqz p2, :cond_2

    .line 28
    .line 29
    iget-object p2, v0, Lxx;->γ:Ljava/lang/String;

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    const/4 p2, 0x0

    .line 33
    invoke-static {p2}, Lh62;->δ(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    :goto_2
    const/4 v0, 0x4

    .line 38
    iget-object p0, p0, Luk;->α:Landroid/app/Activity;

    .line 39
    .line 40
    invoke-static {v0, p0, p2}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final β(Ljava/lang/String;Lp70;)Landroid/widget/TextView;
    .locals 3

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    iget-object p0, p0, Luk;->α:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    const/high16 p0, 0x41500000    # 13.0f

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 14
    .line 15
    .line 16
    const/16 p0, 0x11

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setGravity(I)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    new-instance p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 29
    .line 30
    const/4 p1, -0x1

    .line 31
    const/high16 v1, 0x3f800000    # 1.0f

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-direct {p0, v2, p1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 38
    .line 39
    .line 40
    new-instance p0, Lb9;

    .line 41
    .line 42
    const/4 p1, 0x4

    .line 43
    invoke-direct {p0, p1, p2}, Lb9;-><init>(ILp70;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 47
    .line 48
    .line 49
    return-object v0
.end method

.method public final γ()Landroid/widget/TextView;
    .locals 4

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    iget-object v1, p0, Luk;->α:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    const/16 v2, 0x11

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 11
    .line 12
    .line 13
    const/high16 v2, 0x41500000    # 13.0f

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 16
    .line 17
    .line 18
    sget-object v2, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Luk;->β:Lxx;

    .line 24
    .line 25
    iget-object v2, p0, Lxx;->ι:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 32
    .line 33
    .line 34
    iget-object v2, p0, Lxx;->Α:Ljava/lang/String;

    .line 35
    .line 36
    iget-object p0, p0, Lxx;->κ:Ljava/lang/String;

    .line 37
    .line 38
    const/4 v3, 0x6

    .line 39
    invoke-static {v3, v1, v2, p0}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 44
    .line 45
    .line 46
    return-object v0
.end method

.method public final η()V
    .locals 14

    .line 1
    iget-object v0, p0, Luk;->ν:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "hiddenList"

    .line 5
    .line 6
    if-eqz v0, :cond_7

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Luk;->ε()Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    iget-object v4, p0, Luk;->β:Lxx;

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    iget-object v6, p0, Luk;->α:Landroid/app/Activity;

    .line 23
    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    iget-object p0, p0, Luk;->ν:Landroid/widget/LinearLayout;

    .line 27
    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    new-instance v0, Landroid/widget/TextView;

    .line 31
    .line 32
    invoke-direct {v0, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    const-string v1, "\u5f53\u524d\u6ca1\u6709\u9690\u85cf\u63a7\u4ef6"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    const/high16 v1, 0x41500000    # 13.0f

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 43
    .line 44
    .line 45
    const/16 v1, 0x11

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 48
    .line 49
    .line 50
    iget-object v1, v4, Lxx;->θ:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 57
    .line 58
    .line 59
    const/16 v1, 0x14

    .line 60
    .line 61
    invoke-static {v6, v1}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    invoke-static {v6, v1}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-virtual {v0, v5, v2, v5, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_0
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v1

    .line 80
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    move v3, v5

    .line 85
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    if-eqz v7, :cond_6

    .line 90
    .line 91
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    add-int/lit8 v8, v3, 0x1

    .line 96
    .line 97
    if-ltz v3, :cond_5

    .line 98
    .line 99
    check-cast v7, Lmk;

    .line 100
    .line 101
    if-lez v3, :cond_3

    .line 102
    .line 103
    iget-object v3, p0, Luk;->ν:Landroid/widget/LinearLayout;

    .line 104
    .line 105
    if-eqz v3, :cond_2

    .line 106
    .line 107
    new-instance v9, Landroid/view/View;

    .line 108
    .line 109
    invoke-direct {v9, v6}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 110
    .line 111
    .line 112
    iget-object v10, v4, Lxx;->δ:Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v10

    .line 118
    invoke-virtual {v9, v10}, Landroid/view/View;->setBackgroundColor(I)V

    .line 119
    .line 120
    .line 121
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 122
    .line 123
    const/4 v11, -0x1

    .line 124
    const/4 v12, 0x1

    .line 125
    invoke-static {v6, v12}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 126
    .line 127
    .line 128
    move-result v12

    .line 129
    invoke-direct {v10, v11, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v9, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_2
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw v1

    .line 143
    :cond_3
    :goto_1
    iget-object v3, p0, Luk;->ν:Landroid/widget/LinearLayout;

    .line 144
    .line 145
    if-eqz v3, :cond_4

    .line 146
    .line 147
    new-instance v9, Landroid/widget/LinearLayout;

    .line 148
    .line 149
    invoke-direct {v9, v6}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v9, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 153
    .line 154
    .line 155
    const/16 v10, 0x10

    .line 156
    .line 157
    invoke-virtual {v9, v10}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 158
    .line 159
    .line 160
    const/4 v10, 0x4

    .line 161
    invoke-static {v6, v10}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 162
    .line 163
    .line 164
    move-result v11

    .line 165
    const/16 v12, 0xa

    .line 166
    .line 167
    invoke-static {v6, v12}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 168
    .line 169
    .line 170
    move-result v13

    .line 171
    invoke-static {v6, v10}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    invoke-static {v6, v12}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 176
    .line 177
    .line 178
    move-result v12

    .line 179
    invoke-virtual {v9, v11, v13, v10, v12}, Landroid/view/View;->setPadding(IIII)V

    .line 180
    .line 181
    .line 182
    new-instance v10, Landroid/widget/TextView;

    .line 183
    .line 184
    invoke-direct {v10, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 185
    .line 186
    .line 187
    iget-object v11, v7, Lmk;->β:Ljava/lang/String;

    .line 188
    .line 189
    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 190
    .line 191
    .line 192
    const/high16 v11, 0x41600000    # 14.0f

    .line 193
    .line 194
    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setTextSize(F)V

    .line 195
    .line 196
    .line 197
    iget-object v11, v4, Lxx;->ζ:Ljava/lang/String;

    .line 198
    .line 199
    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 200
    .line 201
    .line 202
    move-result v11

    .line 203
    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 204
    .line 205
    .line 206
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    .line 207
    .line 208
    const/high16 v12, 0x3f800000    # 1.0f

    .line 209
    .line 210
    const/4 v13, -0x2

    .line 211
    invoke-direct {v11, v5, v13, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v10, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 215
    .line 216
    .line 217
    new-instance v11, Lrk;

    .line 218
    .line 219
    invoke-direct {v11, p0, v7}, Lrk;-><init>(Luk;Lmk;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v10, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0}, Luk;->γ()Landroid/widget/TextView;

    .line 229
    .line 230
    .line 231
    move-result-object v10

    .line 232
    const-string v11, "\u6062\u590d\u663e\u793a"

    .line 233
    .line 234
    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 235
    .line 236
    .line 237
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    .line 238
    .line 239
    const/16 v12, 0x22

    .line 240
    .line 241
    invoke-static {v6, v12}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 242
    .line 243
    .line 244
    move-result v12

    .line 245
    invoke-direct {v11, v13, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v10, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 249
    .line 250
    .line 251
    const/16 v11, 0xc

    .line 252
    .line 253
    invoke-static {v6, v11}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 254
    .line 255
    .line 256
    move-result v12

    .line 257
    invoke-static {v6, v11}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 258
    .line 259
    .line 260
    move-result v11

    .line 261
    invoke-virtual {v10, v12, v5, v11, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 262
    .line 263
    .line 264
    new-instance v11, Lrk;

    .line 265
    .line 266
    invoke-direct {v11, v7, p0}, Lrk;-><init>(Lmk;Luk;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v10, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v3, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 276
    .line 277
    .line 278
    move v3, v8

    .line 279
    goto/16 :goto_0

    .line 280
    .line 281
    :cond_4
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    throw v1

    .line 285
    :cond_5
    invoke-static {}, Lyh;->х()V

    .line 286
    .line 287
    .line 288
    throw v1

    .line 289
    :cond_6
    return-void

    .line 290
    :cond_7
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    throw v1
.end method

.method public final θ()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Luk;->ζ:Z

    .line 3
    .line 4
    iget-object v0, p0, Luk;->ω:Landroid/widget/Switch;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-static {}, Lui1;->φ()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {v0, v2}, Landroid/widget/Switch;->setChecked(Z)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-boolean v0, p0, Luk;->ζ:Z

    .line 18
    .line 19
    invoke-virtual {p0}, Luk;->ι()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Luk;->κ()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Luk;->η()V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Luk;->Α:Lb8;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    iget-object p0, p0, Luk;->δ:Lmk;

    .line 33
    .line 34
    invoke-static {}, Lui1;->φ()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-static {}, Luk;->ζ()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-virtual {v0, p0, v1, v2}, Lb8;->ξ(Lmk;ZZ)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    const-string p0, "preview"

    .line 47
    .line 48
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v1

    .line 52
    :cond_1
    const-string p0, "masterSwitch"

    .line 53
    .line 54
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v1
.end method

.method public final ι()V
    .locals 10

    .line 1
    iget-object v0, p0, Luk;->θ:Landroid/widget/TextView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1e

    .line 5
    .line 6
    iget-object v2, p0, Luk;->δ:Lmk;

    .line 7
    .line 8
    iget-object v2, v2, Lmk;->β:Ljava/lang/String;

    .line 9
    .line 10
    const-string v3, "\u8bc4\u8bba\u533a\u63a7\u4ef6\u7ba1\u7406 \u00b7 "

    .line 11
    .line 12
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, Luk;->ε:Z

    .line 21
    .line 22
    iget-object v2, p0, Luk;->δ:Lmk;

    .line 23
    .line 24
    sget-object v3, Lui1;->α:Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v2, v2, Lmk;->α:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v2}, Lui1;->θ(Ljava/lang/String;)F

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const/high16 v3, 0x42c80000    # 100.0f

    .line 33
    .line 34
    mul-float/2addr v2, v3

    .line 35
    invoke-static {v2}, Ljx0;->в(F)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    const/4 v3, 0x0

    .line 40
    const/16 v4, 0x64

    .line 41
    .line 42
    invoke-static {v2, v3, v4}, Lj81;->μ(III)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    iget-object v5, p0, Luk;->ο:Landroid/widget/LinearLayout;

    .line 47
    .line 48
    const-string v6, "alphaSection"

    .line 49
    .line 50
    if-eqz v5, :cond_1d

    .line 51
    .line 52
    invoke-virtual {v5, v3}, Landroid/view/View;->setVisibility(I)V

    .line 53
    .line 54
    .line 55
    iget-object v5, p0, Luk;->ο:Landroid/widget/LinearLayout;

    .line 56
    .line 57
    if-eqz v5, :cond_1c

    .line 58
    .line 59
    iget-object v6, p0, Luk;->δ:Lmk;

    .line 60
    .line 61
    iget-boolean v6, v6, Lmk;->δ:Z

    .line 62
    .line 63
    const v7, 0x3eeb851f    # 0.46f

    .line 64
    .line 65
    .line 66
    const/high16 v8, 0x3f800000    # 1.0f

    .line 67
    .line 68
    if-eqz v6, :cond_0

    .line 69
    .line 70
    move v6, v8

    .line 71
    goto :goto_0

    .line 72
    :cond_0
    move v6, v7

    .line 73
    :goto_0
    invoke-virtual {v5, v6}, Landroid/view/View;->setAlpha(F)V

    .line 74
    .line 75
    .line 76
    iget-object v5, p0, Luk;->ρ:Landroid/widget/SeekBar;

    .line 77
    .line 78
    const-string v6, "alphaSeekBar"

    .line 79
    .line 80
    if-eqz v5, :cond_1b

    .line 81
    .line 82
    iget-object v9, p0, Luk;->δ:Lmk;

    .line 83
    .line 84
    iget-boolean v9, v9, Lmk;->δ:Z

    .line 85
    .line 86
    invoke-virtual {v5, v9}, Landroid/view/View;->setEnabled(Z)V

    .line 87
    .line 88
    .line 89
    iget-object v5, p0, Luk;->ρ:Landroid/widget/SeekBar;

    .line 90
    .line 91
    if-eqz v5, :cond_1a

    .line 92
    .line 93
    iget-object v6, p0, Luk;->δ:Lmk;

    .line 94
    .line 95
    iget-boolean v6, v6, Lmk;->δ:Z

    .line 96
    .line 97
    if-eqz v6, :cond_1

    .line 98
    .line 99
    move v4, v2

    .line 100
    :cond_1
    invoke-virtual {v5, v4}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 101
    .line 102
    .line 103
    iget-object v4, p0, Luk;->π:Landroid/widget/TextView;

    .line 104
    .line 105
    if-eqz v4, :cond_19

    .line 106
    .line 107
    iget-object v5, p0, Luk;->δ:Lmk;

    .line 108
    .line 109
    iget-boolean v5, v5, Lmk;->δ:Z

    .line 110
    .line 111
    if-eqz v5, :cond_2

    .line 112
    .line 113
    const-string v5, "%"

    .line 114
    .line 115
    invoke-static {v5, v2}, Llz1;->λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    goto :goto_1

    .line 120
    :cond_2
    const-string v2, "\u4e0d\u652f\u6301"

    .line 121
    .line 122
    :goto_1
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 123
    .line 124
    .line 125
    iget-object v2, p0, Luk;->σ:Landroid/widget/LinearLayout;

    .line 126
    .line 127
    const-string v4, "colorSection"

    .line 128
    .line 129
    if-eqz v2, :cond_18

    .line 130
    .line 131
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 132
    .line 133
    .line 134
    iget-object v2, p0, Luk;->σ:Landroid/widget/LinearLayout;

    .line 135
    .line 136
    if-eqz v2, :cond_17

    .line 137
    .line 138
    iget-object v4, p0, Luk;->δ:Lmk;

    .line 139
    .line 140
    iget-boolean v4, v4, Lmk;->ε:Z

    .line 141
    .line 142
    if-eqz v4, :cond_3

    .line 143
    .line 144
    move v4, v8

    .line 145
    goto :goto_2

    .line 146
    :cond_3
    move v4, v7

    .line 147
    :goto_2
    invoke-virtual {v2, v4}, Landroid/view/View;->setAlpha(F)V

    .line 148
    .line 149
    .line 150
    iget-object v2, p0, Luk;->υ:Landroid/view/View;

    .line 151
    .line 152
    const-string v4, "colorSwatch"

    .line 153
    .line 154
    if-eqz v2, :cond_16

    .line 155
    .line 156
    iget-object v5, p0, Luk;->δ:Lmk;

    .line 157
    .line 158
    iget-boolean v5, v5, Lmk;->ε:Z

    .line 159
    .line 160
    invoke-virtual {v2, v5}, Landroid/view/View;->setEnabled(Z)V

    .line 161
    .line 162
    .line 163
    iget-object v2, p0, Luk;->τ:Landroid/widget/Switch;

    .line 164
    .line 165
    const-string v5, "colorSwitch"

    .line 166
    .line 167
    if-eqz v2, :cond_15

    .line 168
    .line 169
    iget-object v6, p0, Luk;->δ:Lmk;

    .line 170
    .line 171
    iget-boolean v6, v6, Lmk;->ε:Z

    .line 172
    .line 173
    invoke-virtual {v2, v6}, Landroid/view/View;->setEnabled(Z)V

    .line 174
    .line 175
    .line 176
    iget-object v2, p0, Luk;->τ:Landroid/widget/Switch;

    .line 177
    .line 178
    if-eqz v2, :cond_14

    .line 179
    .line 180
    iget-object v5, p0, Luk;->δ:Lmk;

    .line 181
    .line 182
    iget-boolean v6, v5, Lmk;->ε:Z

    .line 183
    .line 184
    if-eqz v6, :cond_4

    .line 185
    .line 186
    iget-object v5, v5, Lmk;->α:Ljava/lang/String;

    .line 187
    .line 188
    invoke-static {v5}, Lui1;->υ(Ljava/lang/String;)Z

    .line 189
    .line 190
    .line 191
    move-result v5

    .line 192
    if-eqz v5, :cond_4

    .line 193
    .line 194
    move v5, v0

    .line 195
    goto :goto_3

    .line 196
    :cond_4
    move v5, v3

    .line 197
    :goto_3
    invoke-virtual {v2, v5}, Landroid/widget/Switch;->setChecked(Z)V

    .line 198
    .line 199
    .line 200
    iget-object v2, p0, Luk;->δ:Lmk;

    .line 201
    .line 202
    invoke-static {v2}, Luk;->δ(Lmk;)I

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    iget-object v5, p0, Luk;->υ:Landroid/view/View;

    .line 207
    .line 208
    if-eqz v5, :cond_13

    .line 209
    .line 210
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    .line 211
    .line 212
    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v4, v0}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v4, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 219
    .line 220
    .line 221
    iget-object v2, p0, Luk;->α:Landroid/app/Activity;

    .line 222
    .line 223
    invoke-static {v2, v0}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    iget-object v6, p0, Luk;->β:Lxx;

    .line 228
    .line 229
    iget-object v6, v6, Lxx;->δ:Ljava/lang/String;

    .line 230
    .line 231
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 232
    .line 233
    .line 234
    move-result v6

    .line 235
    invoke-virtual {v4, v2, v6}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v5, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 239
    .line 240
    .line 241
    iget-object v2, p0, Luk;->δ:Lmk;

    .line 242
    .line 243
    iget-object v2, v2, Lmk;->α:Ljava/lang/String;

    .line 244
    .line 245
    const-string v4, "content"

    .line 246
    .line 247
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    iget-object v4, p0, Luk;->χ:Landroid/widget/LinearLayout;

    .line 252
    .line 253
    const-string v5, "mentionSection"

    .line 254
    .line 255
    if-eqz v4, :cond_12

    .line 256
    .line 257
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 258
    .line 259
    .line 260
    iget-object v4, p0, Luk;->χ:Landroid/widget/LinearLayout;

    .line 261
    .line 262
    if-eqz v4, :cond_11

    .line 263
    .line 264
    if-eqz v2, :cond_5

    .line 265
    .line 266
    move v5, v8

    .line 267
    goto :goto_4

    .line 268
    :cond_5
    move v5, v7

    .line 269
    :goto_4
    invoke-virtual {v4, v5}, Landroid/view/View;->setAlpha(F)V

    .line 270
    .line 271
    .line 272
    iget-object v4, p0, Luk;->ψ:Landroid/widget/Switch;

    .line 273
    .line 274
    const-string v5, "mentionSwitch"

    .line 275
    .line 276
    if-eqz v4, :cond_10

    .line 277
    .line 278
    invoke-virtual {v4, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 279
    .line 280
    .line 281
    iget-object v4, p0, Luk;->ψ:Landroid/widget/Switch;

    .line 282
    .line 283
    if-eqz v4, :cond_f

    .line 284
    .line 285
    if-eqz v2, :cond_6

    .line 286
    .line 287
    invoke-static {}, Luk;->ζ()Z

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    if-eqz v2, :cond_6

    .line 292
    .line 293
    goto :goto_5

    .line 294
    :cond_6
    move v0, v3

    .line 295
    :goto_5
    invoke-virtual {v4, v0}, Landroid/widget/Switch;->setChecked(Z)V

    .line 296
    .line 297
    .line 298
    iget-object v0, p0, Luk;->φ:Landroid/widget/TextView;

    .line 299
    .line 300
    const-string v2, "visibilityButton"

    .line 301
    .line 302
    if-eqz v0, :cond_e

    .line 303
    .line 304
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 305
    .line 306
    .line 307
    iget-object v0, p0, Luk;->φ:Landroid/widget/TextView;

    .line 308
    .line 309
    if-eqz v0, :cond_d

    .line 310
    .line 311
    iget-object v4, p0, Luk;->δ:Lmk;

    .line 312
    .line 313
    iget-boolean v4, v4, Lmk;->γ:Z

    .line 314
    .line 315
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 316
    .line 317
    .line 318
    iget-object v0, p0, Luk;->φ:Landroid/widget/TextView;

    .line 319
    .line 320
    if-eqz v0, :cond_c

    .line 321
    .line 322
    iget-object v4, p0, Luk;->δ:Lmk;

    .line 323
    .line 324
    iget-boolean v4, v4, Lmk;->γ:Z

    .line 325
    .line 326
    if-eqz v4, :cond_7

    .line 327
    .line 328
    move v7, v8

    .line 329
    :cond_7
    invoke-virtual {v0, v7}, Landroid/view/View;->setAlpha(F)V

    .line 330
    .line 331
    .line 332
    iget-object v0, p0, Luk;->δ:Lmk;

    .line 333
    .line 334
    iget-boolean v4, v0, Lmk;->γ:Z

    .line 335
    .line 336
    iget-object v5, p0, Luk;->φ:Landroid/widget/TextView;

    .line 337
    .line 338
    if-eqz v4, :cond_a

    .line 339
    .line 340
    if-eqz v5, :cond_9

    .line 341
    .line 342
    iget-object v0, v0, Lmk;->α:Ljava/lang/String;

    .line 343
    .line 344
    invoke-static {v0}, Lui1;->χ(Ljava/lang/String;)Z

    .line 345
    .line 346
    .line 347
    move-result v0

    .line 348
    iget-object v1, p0, Luk;->δ:Lmk;

    .line 349
    .line 350
    if-eqz v0, :cond_8

    .line 351
    .line 352
    iget-object v0, v1, Lmk;->β:Ljava/lang/String;

    .line 353
    .line 354
    const-string v1, "\u9690\u85cf"

    .line 355
    .line 356
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    goto :goto_6

    .line 361
    :cond_8
    iget-object v0, v1, Lmk;->β:Ljava/lang/String;

    .line 362
    .line 363
    const-string v1, "\u6062\u590d\u663e\u793a"

    .line 364
    .line 365
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    :goto_6
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 370
    .line 371
    .line 372
    goto :goto_7

    .line 373
    :cond_9
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    throw v1

    .line 377
    :cond_a
    if-eqz v5, :cond_b

    .line 378
    .line 379
    const-string v0, "\u5f53\u524d\u63a7\u4ef6\u4e0d\u652f\u6301\u9690\u85cf"

    .line 380
    .line 381
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 382
    .line 383
    .line 384
    :goto_7
    iput-boolean v3, p0, Luk;->ε:Z

    .line 385
    .line 386
    return-void

    .line 387
    :cond_b
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    throw v1

    .line 391
    :cond_c
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    throw v1

    .line 395
    :cond_d
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    throw v1

    .line 399
    :cond_e
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    throw v1

    .line 403
    :cond_f
    invoke-static {v5}, Lln0;->и(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    throw v1

    .line 407
    :cond_10
    invoke-static {v5}, Lln0;->и(Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    throw v1

    .line 411
    :cond_11
    invoke-static {v5}, Lln0;->и(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    throw v1

    .line 415
    :cond_12
    invoke-static {v5}, Lln0;->и(Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    throw v1

    .line 419
    :cond_13
    invoke-static {v4}, Lln0;->и(Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    throw v1

    .line 423
    :cond_14
    invoke-static {v5}, Lln0;->и(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    throw v1

    .line 427
    :cond_15
    invoke-static {v5}, Lln0;->и(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    throw v1

    .line 431
    :cond_16
    invoke-static {v4}, Lln0;->и(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    throw v1

    .line 435
    :cond_17
    invoke-static {v4}, Lln0;->и(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    throw v1

    .line 439
    :cond_18
    invoke-static {v4}, Lln0;->и(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    throw v1

    .line 443
    :cond_19
    const-string p0, "alphaValue"

    .line 444
    .line 445
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    throw v1

    .line 449
    :cond_1a
    invoke-static {v6}, Lln0;->и(Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    throw v1

    .line 453
    :cond_1b
    invoke-static {v6}, Lln0;->и(Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    throw v1

    .line 457
    :cond_1c
    invoke-static {v6}, Lln0;->и(Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    throw v1

    .line 461
    :cond_1d
    invoke-static {v6}, Lln0;->и(Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    throw v1

    .line 465
    :cond_1e
    const-string p0, "titleView"

    .line 466
    .line 467
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    throw v1
.end method

.method public final κ()V
    .locals 7

    .line 1
    iget-object v0, p0, Luk;->κ:Landroid/widget/TextView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "hiddenTab"

    .line 5
    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    invoke-static {}, Luk;->ε()Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    new-instance v4, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v5, "\u5df2\u9690\u85cf ("

    .line 19
    .line 20
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v3, ")"

    .line 27
    .line 28
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Luk;->ι:Landroid/widget/TextView;

    .line 39
    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    iget-object v3, p0, Luk;->γ:Lnk;

    .line 43
    .line 44
    sget-object v4, Lnk;->ε:Lnk;

    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    const/4 v6, 0x1

    .line 48
    if-ne v3, v4, :cond_0

    .line 49
    .line 50
    move v3, v6

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move v3, v5

    .line 53
    :goto_0
    invoke-virtual {p0, v0, v3}, Luk;->α(Landroid/widget/TextView;Z)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Luk;->κ:Landroid/widget/TextView;

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    iget-object v1, p0, Luk;->γ:Lnk;

    .line 61
    .line 62
    sget-object v2, Lnk;->ζ:Lnk;

    .line 63
    .line 64
    if-ne v1, v2, :cond_1

    .line 65
    .line 66
    move v5, v6

    .line 67
    :cond_1
    invoke-virtual {p0, v0, v5}, Luk;->α(Landroid/widget/TextView;Z)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_2
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v1

    .line 75
    :cond_3
    const-string p0, "previewTab"

    .line 76
    .line 77
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v1

    .line 81
    :cond_4
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v1
.end method

.method public final λ(Lmk;)V
    .locals 2

    .line 1
    iput-object p1, p0, Luk;->δ:Lmk;

    .line 2
    .line 3
    invoke-virtual {p0}, Luk;->ι()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Luk;->Α:Lb8;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Luk;->δ:Lmk;

    .line 11
    .line 12
    invoke-static {}, Lui1;->φ()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-static {}, Luk;->ζ()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p1, p0, v0, v1}, Lb8;->ξ(Lmk;ZZ)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string p0, "preview"

    .line 25
    .line 26
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    throw p0
.end method

.method public final μ()V
    .locals 26

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    new-instance v8, Landroid/widget/ScrollView;

    .line 4
    .line 5
    iget-object v9, v2, Luk;->α:Landroid/app/Activity;

    .line 6
    .line 7
    invoke-direct {v8, v9}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    const/4 v10, 0x1

    .line 11
    invoke-virtual {v8, v10}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    .line 12
    .line 13
    .line 14
    const/4 v11, 0x2

    .line 15
    invoke-virtual {v8, v11}, Landroid/view/View;->setOverScrollMode(I)V

    .line 16
    .line 17
    .line 18
    const/4 v12, 0x0

    .line 19
    invoke-virtual {v8, v12}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 20
    .line 21
    .line 22
    new-instance v13, Landroid/widget/LinearLayout;

    .line 23
    .line 24
    invoke-direct {v13, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v13, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 28
    .line 29
    .line 30
    const/16 v14, 0x10

    .line 31
    .line 32
    invoke-static {v9, v14}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const/16 v15, 0xc

    .line 37
    .line 38
    invoke-static {v9, v15}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-static {v9, v14}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    invoke-static {v9, v14}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    invoke-virtual {v13, v0, v1, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 51
    .line 52
    .line 53
    iget-object v0, v2, Luk;->β:Lxx;

    .line 54
    .line 55
    iget-object v1, v0, Lxx;->γ:Ljava/lang/String;

    .line 56
    .line 57
    const/16 v3, 0x8

    .line 58
    .line 59
    invoke-static {v3, v9, v1}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v13, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 64
    .line 65
    .line 66
    new-instance v1, Landroid/widget/FrameLayout;

    .line 67
    .line 68
    invoke-direct {v1, v9}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 69
    .line 70
    .line 71
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 72
    .line 73
    const/16 v5, 0x2a

    .line 74
    .line 75
    invoke-static {v9, v5}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    const/4 v7, -0x1

    .line 80
    invoke-direct {v4, v7, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 84
    .line 85
    .line 86
    new-instance v4, Landroid/widget/TextView;

    .line 87
    .line 88
    invoke-direct {v4, v9}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4, v14}, Landroid/widget/TextView;->setGravity(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v11}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 95
    .line 96
    .line 97
    const/high16 v6, 0x41880000    # 17.0f

    .line 98
    .line 99
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextSize(F)V

    .line 100
    .line 101
    .line 102
    sget-object v6, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 103
    .line 104
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 105
    .line 106
    .line 107
    iget-object v3, v0, Lxx;->ζ:Ljava/lang/String;

    .line 108
    .line 109
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result v10

    .line 113
    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 114
    .line 115
    .line 116
    new-instance v10, Landroid/widget/FrameLayout$LayoutParams;

    .line 117
    .line 118
    invoke-direct {v10, v7, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 119
    .line 120
    .line 121
    invoke-static {v9, v5}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 122
    .line 123
    .line 124
    move-result v15

    .line 125
    invoke-virtual {v10, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v4, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 129
    .line 130
    .line 131
    iput-object v4, v2, Luk;->θ:Landroid/widget/TextView;

    .line 132
    .line 133
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 134
    .line 135
    .line 136
    new-instance v4, Landroid/widget/TextView;

    .line 137
    .line 138
    invoke-direct {v4, v9}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 139
    .line 140
    .line 141
    const-string v10, "\u00d7"

    .line 142
    .line 143
    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 144
    .line 145
    .line 146
    const/high16 v10, 0x41b00000    # 22.0f

    .line 147
    .line 148
    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 149
    .line 150
    .line 151
    const/16 v10, 0x11

    .line 152
    .line 153
    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setGravity(I)V

    .line 154
    .line 155
    .line 156
    const-string v15, "\u5173\u95ed"

    .line 157
    .line 158
    invoke-virtual {v4, v15}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 159
    .line 160
    .line 161
    iget-object v15, v0, Lxx;->η:Ljava/lang/String;

    .line 162
    .line 163
    invoke-static {v15}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 168
    .line 169
    .line 170
    iget-object v7, v0, Lxx;->Α:Ljava/lang/String;

    .line 171
    .line 172
    invoke-static {v12}, Lh62;->δ(I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    const/4 v10, 0x6

    .line 177
    invoke-static {v10, v9, v7, v5}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    invoke-virtual {v4, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 182
    .line 183
    .line 184
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    .line 185
    .line 186
    const/16 v7, 0x24

    .line 187
    .line 188
    invoke-static {v9, v7}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 189
    .line 190
    .line 191
    move-result v10

    .line 192
    invoke-static {v9, v7}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 193
    .line 194
    .line 195
    move-result v7

    .line 196
    const v11, 0x800015

    .line 197
    .line 198
    .line 199
    invoke-direct {v5, v10, v7, v11}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 203
    .line 204
    .line 205
    new-instance v5, Lpk;

    .line 206
    .line 207
    invoke-direct {v5, v2, v12}, Lpk;-><init>(Luk;I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v13, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 217
    .line 218
    .line 219
    new-instance v1, Landroid/widget/LinearLayout;

    .line 220
    .line 221
    invoke-direct {v1, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1, v14}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 228
    .line 229
    .line 230
    const/4 v4, 0x2

    .line 231
    invoke-static {v9, v4}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 232
    .line 233
    .line 234
    move-result v5

    .line 235
    const/16 v10, 0xa

    .line 236
    .line 237
    invoke-static {v9, v10}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    invoke-virtual {v1, v12, v5, v12, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 242
    .line 243
    .line 244
    const-string v4, "\u542f\u7528\u8bc4\u8bba\u533a\u63a7\u4ef6\u7ba1\u7406"

    .line 245
    .line 246
    const/high16 v11, 0x41600000    # 14.0f

    .line 247
    .line 248
    invoke-static {v9, v4, v11}, Llz1;->θ(Landroid/app/Activity;Ljava/lang/String;F)Landroid/widget/TextView;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 253
    .line 254
    .line 255
    move-result v5

    .line 256
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 257
    .line 258
    .line 259
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 260
    .line 261
    const/4 v7, -0x2

    .line 262
    const/high16 v11, 0x3f800000    # 1.0f

    .line 263
    .line 264
    invoke-direct {v5, v12, v7, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2}, Luk;->ξ()Landroid/widget/Switch;

    .line 274
    .line 275
    .line 276
    move-result-object v4

    .line 277
    new-instance v5, Lqk;

    .line 278
    .line 279
    invoke-direct {v5, v2, v12}, Lqk;-><init>(Luk;I)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v4, v5}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 283
    .line 284
    .line 285
    iput-object v4, v2, Luk;->ω:Landroid/widget/Switch;

    .line 286
    .line 287
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v13, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 291
    .line 292
    .line 293
    new-instance v1, Landroid/widget/LinearLayout;

    .line 294
    .line 295
    invoke-direct {v1, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v1, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 299
    .line 300
    .line 301
    const/16 v4, 0x11

    .line 302
    .line 303
    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 304
    .line 305
    .line 306
    iget-object v4, v0, Lxx;->ε:Ljava/lang/String;

    .line 307
    .line 308
    const/4 v5, 0x6

    .line 309
    invoke-static {v5, v9, v4}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    invoke-virtual {v1, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 314
    .line 315
    .line 316
    const/4 v4, 0x3

    .line 317
    invoke-static {v9, v4}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 318
    .line 319
    .line 320
    move-result v5

    .line 321
    invoke-static {v9, v4}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 322
    .line 323
    .line 324
    move-result v11

    .line 325
    invoke-static {v9, v4}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 326
    .line 327
    .line 328
    move-result v14

    .line 329
    invoke-static {v9, v4}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 330
    .line 331
    .line 332
    move-result v7

    .line 333
    invoke-virtual {v1, v5, v11, v14, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 334
    .line 335
    .line 336
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 337
    .line 338
    const/16 v7, 0x2a

    .line 339
    .line 340
    invoke-static {v9, v7}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 341
    .line 342
    .line 343
    move-result v7

    .line 344
    const/4 v11, -0x1

    .line 345
    invoke-direct {v5, v11, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 346
    .line 347
    .line 348
    const/16 v7, 0xc

    .line 349
    .line 350
    invoke-static {v9, v7}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 351
    .line 352
    .line 353
    move-result v11

    .line 354
    iput v11, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 355
    .line 356
    invoke-virtual {v1, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 357
    .line 358
    .line 359
    new-instance v5, Lsk;

    .line 360
    .line 361
    invoke-direct {v5, v2, v12}, Lsk;-><init>(Luk;I)V

    .line 362
    .line 363
    .line 364
    const-string v7, "\u63a7\u4ef6\u9884\u89c8"

    .line 365
    .line 366
    invoke-virtual {v2, v7, v5}, Luk;->β(Ljava/lang/String;Lp70;)Landroid/widget/TextView;

    .line 367
    .line 368
    .line 369
    move-result-object v5

    .line 370
    iput-object v5, v2, Luk;->ι:Landroid/widget/TextView;

    .line 371
    .line 372
    new-instance v5, Lsk;

    .line 373
    .line 374
    const/4 v7, 0x1

    .line 375
    invoke-direct {v5, v2, v7}, Lsk;-><init>(Luk;I)V

    .line 376
    .line 377
    .line 378
    const-string v7, "\u5df2\u9690\u85cf"

    .line 379
    .line 380
    invoke-virtual {v2, v7, v5}, Luk;->β(Ljava/lang/String;Lp70;)Landroid/widget/TextView;

    .line 381
    .line 382
    .line 383
    move-result-object v5

    .line 384
    iput-object v5, v2, Luk;->κ:Landroid/widget/TextView;

    .line 385
    .line 386
    iget-object v5, v2, Luk;->ι:Landroid/widget/TextView;

    .line 387
    .line 388
    if-eqz v5, :cond_a

    .line 389
    .line 390
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 391
    .line 392
    .line 393
    iget-object v5, v2, Luk;->κ:Landroid/widget/TextView;

    .line 394
    .line 395
    if-eqz v5, :cond_9

    .line 396
    .line 397
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v13, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 401
    .line 402
    .line 403
    new-instance v1, Landroid/widget/LinearLayout;

    .line 404
    .line 405
    invoke-direct {v1, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 406
    .line 407
    .line 408
    const/4 v7, 0x1

    .line 409
    invoke-virtual {v1, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 410
    .line 411
    .line 412
    iput-object v1, v2, Luk;->ξ:Landroid/widget/LinearLayout;

    .line 413
    .line 414
    iget-object v5, v0, Lxx;->β:Ljava/lang/String;

    .line 415
    .line 416
    const/4 v7, 0x6

    .line 417
    invoke-static {v7, v9, v5}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 418
    .line 419
    .line 420
    move-result-object v5

    .line 421
    invoke-virtual {v1, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 422
    .line 423
    .line 424
    const/16 v7, 0xc

    .line 425
    .line 426
    invoke-static {v9, v7}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 427
    .line 428
    .line 429
    move-result v5

    .line 430
    invoke-static {v9, v10}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 431
    .line 432
    .line 433
    move-result v14

    .line 434
    invoke-static {v9, v7}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 435
    .line 436
    .line 437
    move-result v4

    .line 438
    const/16 v23, 0x0

    .line 439
    .line 440
    invoke-static {v9, v10}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 441
    .line 442
    .line 443
    move-result v11

    .line 444
    invoke-virtual {v1, v5, v14, v4, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 445
    .line 446
    .line 447
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 448
    .line 449
    const/4 v5, -0x2

    .line 450
    const/4 v11, -0x1

    .line 451
    invoke-direct {v4, v11, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 452
    .line 453
    .line 454
    invoke-static {v9, v7}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 455
    .line 456
    .line 457
    move-result v14

    .line 458
    iput v14, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 459
    .line 460
    invoke-virtual {v1, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 461
    .line 462
    .line 463
    new-instance v4, Landroid/widget/LinearLayout;

    .line 464
    .line 465
    invoke-direct {v4, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 466
    .line 467
    .line 468
    const/4 v7, 0x1

    .line 469
    invoke-virtual {v4, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 470
    .line 471
    .line 472
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 473
    .line 474
    invoke-direct {v7, v11, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 475
    .line 476
    .line 477
    const/16 v5, 0x8

    .line 478
    .line 479
    invoke-static {v9, v5}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 480
    .line 481
    .line 482
    move-result v11

    .line 483
    iput v11, v7, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 484
    .line 485
    invoke-virtual {v4, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 486
    .line 487
    .line 488
    new-instance v5, Landroid/widget/LinearLayout;

    .line 489
    .line 490
    invoke-direct {v5, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v5, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 494
    .line 495
    .line 496
    const/16 v7, 0x10

    .line 497
    .line 498
    invoke-virtual {v5, v7}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 499
    .line 500
    .line 501
    const-string v7, "\u900f\u660e\u5ea6"

    .line 502
    .line 503
    const/high16 v11, 0x41500000    # 13.0f

    .line 504
    .line 505
    invoke-static {v9, v7, v11}, Llz1;->θ(Landroid/app/Activity;Ljava/lang/String;F)Landroid/widget/TextView;

    .line 506
    .line 507
    .line 508
    move-result-object v7

    .line 509
    invoke-static {v15}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 510
    .line 511
    .line 512
    move-result v14

    .line 513
    invoke-virtual {v7, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 514
    .line 515
    .line 516
    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    .line 517
    .line 518
    const/4 v10, -0x2

    .line 519
    const/high16 v11, 0x3f800000    # 1.0f

    .line 520
    .line 521
    invoke-direct {v14, v12, v10, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v7, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 528
    .line 529
    .line 530
    new-instance v7, Landroid/widget/TextView;

    .line 531
    .line 532
    invoke-direct {v7, v9}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 533
    .line 534
    .line 535
    const/high16 v10, 0x41500000    # 13.0f

    .line 536
    .line 537
    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 541
    .line 542
    .line 543
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 544
    .line 545
    .line 546
    move-result v3

    .line 547
    invoke-virtual {v7, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 548
    .line 549
    .line 550
    iput-object v7, v2, Luk;->π:Landroid/widget/TextView;

    .line 551
    .line 552
    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 556
    .line 557
    .line 558
    new-instance v3, Landroid/widget/SeekBar;

    .line 559
    .line 560
    invoke-direct {v3, v9}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;)V

    .line 561
    .line 562
    .line 563
    const/16 v5, 0x64

    .line 564
    .line 565
    invoke-virtual {v3, v5}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 566
    .line 567
    .line 568
    const/16 v5, 0x1e

    .line 569
    .line 570
    invoke-static {v9, v5}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 571
    .line 572
    .line 573
    move-result v5

    .line 574
    invoke-virtual {v3, v5}, Landroid/widget/ProgressBar;->setMinHeight(I)V

    .line 575
    .line 576
    .line 577
    iget-object v5, v0, Lxx;->ι:Ljava/lang/String;

    .line 578
    .line 579
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 580
    .line 581
    .line 582
    move-result v6

    .line 583
    invoke-static {v6}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 584
    .line 585
    .line 586
    move-result-object v6

    .line 587
    invoke-virtual {v3, v6}, Landroid/widget/ProgressBar;->setProgressTintList(Landroid/content/res/ColorStateList;)V

    .line 588
    .line 589
    .line 590
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 591
    .line 592
    .line 593
    move-result v5

    .line 594
    invoke-static {v5}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 595
    .line 596
    .line 597
    move-result-object v5

    .line 598
    invoke-virtual {v3, v5}, Landroid/widget/AbsSeekBar;->setThumbTintList(Landroid/content/res/ColorStateList;)V

    .line 599
    .line 600
    .line 601
    new-instance v5, Ltk;

    .line 602
    .line 603
    invoke-direct {v5, v12, v2}, Ltk;-><init>(ILjava/lang/Object;)V

    .line 604
    .line 605
    .line 606
    invoke-virtual {v3, v5}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 607
    .line 608
    .line 609
    iput-object v3, v2, Luk;->ρ:Landroid/widget/SeekBar;

    .line 610
    .line 611
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 612
    .line 613
    .line 614
    iput-object v4, v2, Luk;->ο:Landroid/widget/LinearLayout;

    .line 615
    .line 616
    new-instance v3, Landroid/widget/LinearLayout;

    .line 617
    .line 618
    invoke-direct {v3, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 619
    .line 620
    .line 621
    invoke-virtual {v3, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 622
    .line 623
    .line 624
    const/16 v7, 0x10

    .line 625
    .line 626
    invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 627
    .line 628
    .line 629
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 630
    .line 631
    const/4 v5, -0x2

    .line 632
    const/4 v11, -0x1

    .line 633
    invoke-direct {v4, v11, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 634
    .line 635
    .line 636
    const/16 v5, 0x8

    .line 637
    .line 638
    invoke-static {v9, v5}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 639
    .line 640
    .line 641
    move-result v6

    .line 642
    iput v6, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 643
    .line 644
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 645
    .line 646
    .line 647
    new-instance v4, Landroid/widget/TextView;

    .line 648
    .line 649
    invoke-direct {v4, v9}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 650
    .line 651
    .line 652
    const-string v5, "\u81ea\u5b9a\u4e49\u989c\u8272"

    .line 653
    .line 654
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 655
    .line 656
    .line 657
    const/high16 v10, 0x41500000    # 13.0f

    .line 658
    .line 659
    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 660
    .line 661
    .line 662
    invoke-static {v15}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 663
    .line 664
    .line 665
    move-result v5

    .line 666
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 667
    .line 668
    .line 669
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 670
    .line 671
    const/4 v10, -0x2

    .line 672
    const/high16 v11, 0x3f800000    # 1.0f

    .line 673
    .line 674
    invoke-direct {v5, v12, v10, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 681
    .line 682
    .line 683
    new-instance v4, Landroid/view/View;

    .line 684
    .line 685
    invoke-direct {v4, v9}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 686
    .line 687
    .line 688
    const-string v5, "\u9009\u62e9\u989c\u8272"

    .line 689
    .line 690
    invoke-virtual {v4, v5}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 691
    .line 692
    .line 693
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 694
    .line 695
    const/16 v6, 0x20

    .line 696
    .line 697
    invoke-static {v9, v6}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 698
    .line 699
    .line 700
    move-result v7

    .line 701
    invoke-static {v9, v6}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 702
    .line 703
    .line 704
    move-result v6

    .line 705
    invoke-direct {v5, v7, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 706
    .line 707
    .line 708
    const/16 v6, 0x8

    .line 709
    .line 710
    invoke-static {v9, v6}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 711
    .line 712
    .line 713
    move-result v7

    .line 714
    invoke-virtual {v5, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 715
    .line 716
    .line 717
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 718
    .line 719
    .line 720
    new-instance v5, Lpk;

    .line 721
    .line 722
    const/4 v7, 0x1

    .line 723
    invoke-direct {v5, v2, v7}, Lpk;-><init>(Luk;I)V

    .line 724
    .line 725
    .line 726
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 727
    .line 728
    .line 729
    iput-object v4, v2, Luk;->υ:Landroid/view/View;

    .line 730
    .line 731
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 732
    .line 733
    .line 734
    invoke-virtual {v2}, Luk;->ξ()Landroid/widget/Switch;

    .line 735
    .line 736
    .line 737
    move-result-object v4

    .line 738
    new-instance v5, Lqk;

    .line 739
    .line 740
    invoke-direct {v5, v2, v7}, Lqk;-><init>(Luk;I)V

    .line 741
    .line 742
    .line 743
    invoke-virtual {v4, v5}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 744
    .line 745
    .line 746
    iput-object v4, v2, Luk;->τ:Landroid/widget/Switch;

    .line 747
    .line 748
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 749
    .line 750
    .line 751
    iput-object v3, v2, Luk;->σ:Landroid/widget/LinearLayout;

    .line 752
    .line 753
    new-instance v3, Landroid/widget/LinearLayout;

    .line 754
    .line 755
    invoke-direct {v3, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 756
    .line 757
    .line 758
    invoke-virtual {v3, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 759
    .line 760
    .line 761
    const/16 v7, 0x10

    .line 762
    .line 763
    invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 764
    .line 765
    .line 766
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 767
    .line 768
    const/4 v5, -0x2

    .line 769
    const/4 v11, -0x1

    .line 770
    invoke-direct {v4, v11, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 771
    .line 772
    .line 773
    const/16 v5, 0x8

    .line 774
    .line 775
    invoke-static {v9, v5}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 776
    .line 777
    .line 778
    move-result v6

    .line 779
    iput v6, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 780
    .line 781
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 782
    .line 783
    .line 784
    new-instance v4, Landroid/widget/TextView;

    .line 785
    .line 786
    invoke-direct {v4, v9}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 787
    .line 788
    .line 789
    const-string v6, "\u5185\u5bb9\u67d3\u8272\u8df3\u8fc7 @\u7528\u6237"

    .line 790
    .line 791
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 792
    .line 793
    .line 794
    const/high16 v10, 0x41500000    # 13.0f

    .line 795
    .line 796
    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 797
    .line 798
    .line 799
    invoke-static {v15}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 800
    .line 801
    .line 802
    move-result v6

    .line 803
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 804
    .line 805
    .line 806
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 807
    .line 808
    const/4 v10, -0x2

    .line 809
    const/high16 v11, 0x3f800000    # 1.0f

    .line 810
    .line 811
    invoke-direct {v6, v12, v10, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 812
    .line 813
    .line 814
    invoke-virtual {v4, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 815
    .line 816
    .line 817
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 818
    .line 819
    .line 820
    invoke-virtual {v2}, Luk;->ξ()Landroid/widget/Switch;

    .line 821
    .line 822
    .line 823
    move-result-object v4

    .line 824
    new-instance v6, Lqk;

    .line 825
    .line 826
    const/4 v7, 0x2

    .line 827
    invoke-direct {v6, v2, v7}, Lqk;-><init>(Luk;I)V

    .line 828
    .line 829
    .line 830
    invoke-virtual {v4, v6}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 831
    .line 832
    .line 833
    iput-object v4, v2, Luk;->ψ:Landroid/widget/Switch;

    .line 834
    .line 835
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 836
    .line 837
    .line 838
    iput-object v3, v2, Luk;->χ:Landroid/widget/LinearLayout;

    .line 839
    .line 840
    invoke-virtual {v2}, Luk;->γ()Landroid/widget/TextView;

    .line 841
    .line 842
    .line 843
    move-result-object v3

    .line 844
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 845
    .line 846
    const/16 v10, 0x26

    .line 847
    .line 848
    invoke-static {v9, v10}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 849
    .line 850
    .line 851
    move-result v6

    .line 852
    const/4 v11, -0x1

    .line 853
    invoke-direct {v4, v11, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 857
    .line 858
    .line 859
    new-instance v4, Lpk;

    .line 860
    .line 861
    const/4 v7, 0x2

    .line 862
    invoke-direct {v4, v2, v7}, Lpk;-><init>(Luk;I)V

    .line 863
    .line 864
    .line 865
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 866
    .line 867
    .line 868
    iput-object v3, v2, Luk;->φ:Landroid/widget/TextView;

    .line 869
    .line 870
    iget-object v3, v2, Luk;->ο:Landroid/widget/LinearLayout;

    .line 871
    .line 872
    if-eqz v3, :cond_8

    .line 873
    .line 874
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 875
    .line 876
    .line 877
    iget-object v3, v2, Luk;->σ:Landroid/widget/LinearLayout;

    .line 878
    .line 879
    if-eqz v3, :cond_7

    .line 880
    .line 881
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 882
    .line 883
    .line 884
    iget-object v3, v2, Luk;->χ:Landroid/widget/LinearLayout;

    .line 885
    .line 886
    if-eqz v3, :cond_6

    .line 887
    .line 888
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 889
    .line 890
    .line 891
    iget-object v3, v2, Luk;->φ:Landroid/widget/TextView;

    .line 892
    .line 893
    if-eqz v3, :cond_5

    .line 894
    .line 895
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 896
    .line 897
    .line 898
    invoke-virtual {v13, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 899
    .line 900
    .line 901
    new-instance v11, Landroid/widget/FrameLayout;

    .line 902
    .line 903
    invoke-direct {v11, v9}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 904
    .line 905
    .line 906
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 907
    .line 908
    const/4 v3, -0x1

    .line 909
    const/4 v4, -0x2

    .line 910
    invoke-direct {v1, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 911
    .line 912
    .line 913
    invoke-virtual {v11, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 914
    .line 915
    .line 916
    new-instance v14, Lb8;

    .line 917
    .line 918
    move-object v1, v0

    .line 919
    new-instance v0, Lng;

    .line 920
    .line 921
    const/4 v6, 0x0

    .line 922
    const/4 v7, 0x2

    .line 923
    move-object v15, v1

    .line 924
    const/4 v1, 0x1

    .line 925
    move/from16 v17, v3

    .line 926
    .line 927
    const-class v3, Luk;

    .line 928
    .line 929
    move/from16 v22, v4

    .line 930
    .line 931
    const-string v4, "selectControl"

    .line 932
    .line 933
    move/from16 v16, v5

    .line 934
    .line 935
    const-string v5, "selectControl(Lcom/example/dyhelper/ui/CommentControlMenuControl;)V"

    .line 936
    .line 937
    move/from16 v10, v16

    .line 938
    .line 939
    invoke-direct/range {v0 .. v7}, Lng;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 940
    .line 941
    .line 942
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 943
    .line 944
    .line 945
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 946
    .line 947
    .line 948
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 949
    .line 950
    .line 951
    iput-object v9, v14, Lb8;->α:Ljava/lang/Object;

    .line 952
    .line 953
    iput-object v15, v14, Lb8;->β:Ljava/lang/Object;

    .line 954
    .line 955
    iput-object v0, v14, Lb8;->γ:Ljava/lang/Object;

    .line 956
    .line 957
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 958
    .line 959
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 960
    .line 961
    .line 962
    iput-object v0, v14, Lb8;->δ:Ljava/lang/Object;

    .line 963
    .line 964
    new-instance v0, Landroid/widget/LinearLayout;

    .line 965
    .line 966
    invoke-direct {v0, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 967
    .line 968
    .line 969
    const/4 v7, 0x1

    .line 970
    invoke-virtual {v0, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 971
    .line 972
    .line 973
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 974
    .line 975
    .line 976
    move-result-object v1

    .line 977
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 978
    .line 979
    .line 980
    iget-object v3, v15, Lxx;->β:Ljava/lang/String;

    .line 981
    .line 982
    invoke-static {v10, v1, v3}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 983
    .line 984
    .line 985
    move-result-object v1

    .line 986
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 987
    .line 988
    .line 989
    const/4 v7, 0x2

    .line 990
    invoke-static {v9, v7}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 991
    .line 992
    .line 993
    move-result v1

    .line 994
    invoke-static {v9, v10}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 995
    .line 996
    .line 997
    move-result v3

    .line 998
    invoke-virtual {v0, v12, v1, v12, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 999
    .line 1000
    .line 1001
    new-instance v1, Landroid/widget/LinearLayout;

    .line 1002
    .line 1003
    invoke-direct {v1, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v1, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1007
    .line 1008
    .line 1009
    const/16 v7, 0x10

    .line 1010
    .line 1011
    invoke-virtual {v1, v7}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1012
    .line 1013
    .line 1014
    const/16 v3, 0xe

    .line 1015
    .line 1016
    invoke-static {v9, v3}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1017
    .line 1018
    .line 1019
    move-result v4

    .line 1020
    const/16 v5, 0xa

    .line 1021
    .line 1022
    invoke-static {v9, v5}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1023
    .line 1024
    .line 1025
    move-result v6

    .line 1026
    const/16 v7, 0xc

    .line 1027
    .line 1028
    invoke-static {v9, v7}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1029
    .line 1030
    .line 1031
    move-result v5

    .line 1032
    const/4 v7, 0x5

    .line 1033
    invoke-static {v9, v7}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1034
    .line 1035
    .line 1036
    move-result v3

    .line 1037
    invoke-virtual {v1, v4, v6, v5, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 1038
    .line 1039
    .line 1040
    iget-object v3, v15, Lxx;->θ:Ljava/lang/String;

    .line 1041
    .line 1042
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1043
    .line 1044
    .line 1045
    move-result v4

    .line 1046
    const-string v5, "\u5927\u5bb6\u90fd\u5728\u641c\uff1a"

    .line 1047
    .line 1048
    const/high16 v6, 0x41500000    # 13.0f

    .line 1049
    .line 1050
    invoke-static {v14, v5, v6, v4}, Lb8;->ο(Lb8;Ljava/lang/String;FI)Landroid/widget/TextView;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v4

    .line 1054
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1055
    .line 1056
    .line 1057
    iget-object v4, v15, Lxx;->λ:Ljava/lang/String;

    .line 1058
    .line 1059
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1060
    .line 1061
    .line 1062
    move-result v4

    .line 1063
    const-string v5, "\u6c83\u5c14\u739b\u624b\u5199\u6536\u636e\u6076\u641e"

    .line 1064
    .line 1065
    invoke-static {v14, v5, v6, v4}, Lb8;->ο(Lb8;Ljava/lang/String;FI)Landroid/widget/TextView;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v4

    .line 1069
    const/4 v5, 0x1

    .line 1070
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 1071
    .line 1072
    .line 1073
    sget-object v5, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 1074
    .line 1075
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 1076
    .line 1077
    .line 1078
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 1079
    .line 1080
    const/4 v6, -0x2

    .line 1081
    const/high16 v7, 0x3f800000    # 1.0f

    .line 1082
    .line 1083
    invoke-direct {v5, v12, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1084
    .line 1085
    .line 1086
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1090
    .line 1091
    .line 1092
    const/high16 v4, 0x41900000    # 18.0f

    .line 1093
    .line 1094
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1095
    .line 1096
    .line 1097
    move-result v5

    .line 1098
    const-string v7, "\u2315"

    .line 1099
    .line 1100
    invoke-static {v14, v7, v4, v5}, Lb8;->ο(Lb8;Ljava/lang/String;FI)Landroid/widget/TextView;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v4

    .line 1104
    const/16 v5, 0x11

    .line 1105
    .line 1106
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setGravity(I)V

    .line 1107
    .line 1108
    .line 1109
    invoke-static {v9, v10}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1110
    .line 1111
    .line 1112
    move-result v5

    .line 1113
    invoke-virtual {v4, v5, v12, v12, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1114
    .line 1115
    .line 1116
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1117
    .line 1118
    .line 1119
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1120
    .line 1121
    .line 1122
    new-instance v1, Landroid/widget/LinearLayout;

    .line 1123
    .line 1124
    invoke-direct {v1, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1125
    .line 1126
    .line 1127
    const/4 v7, 0x1

    .line 1128
    invoke-virtual {v1, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1129
    .line 1130
    .line 1131
    new-instance v4, Landroid/widget/LinearLayout;

    .line 1132
    .line 1133
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v5

    .line 1137
    invoke-direct {v4, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1138
    .line 1139
    .line 1140
    invoke-virtual {v4, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1141
    .line 1142
    .line 1143
    const/16 v7, 0x10

    .line 1144
    .line 1145
    invoke-virtual {v4, v7}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1146
    .line 1147
    .line 1148
    const/16 v5, 0xe

    .line 1149
    .line 1150
    invoke-static {v9, v5}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1151
    .line 1152
    .line 1153
    move-result v7

    .line 1154
    invoke-virtual {v4, v7, v12, v12, v12}, Landroid/view/View;->setPadding(IIII)V

    .line 1155
    .line 1156
    .line 1157
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 1158
    .line 1159
    const/16 v7, 0x26

    .line 1160
    .line 1161
    invoke-static {v9, v7}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1162
    .line 1163
    .line 1164
    move-result v7

    .line 1165
    const/4 v10, -0x1

    .line 1166
    invoke-direct {v5, v10, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1167
    .line 1168
    .line 1169
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1170
    .line 1171
    .line 1172
    iget-object v5, v15, Lxx;->ζ:Ljava/lang/String;

    .line 1173
    .line 1174
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1175
    .line 1176
    .line 1177
    move-result v7

    .line 1178
    sget-object v6, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 1179
    .line 1180
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1181
    .line 1182
    .line 1183
    new-instance v10, Landroid/widget/TextView;

    .line 1184
    .line 1185
    invoke-direct {v10, v9}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1186
    .line 1187
    .line 1188
    const-string v12, "\u8bc4\u8bba 70"

    .line 1189
    .line 1190
    invoke-virtual {v10, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1191
    .line 1192
    .line 1193
    const/high16 v12, 0x41800000    # 16.0f

    .line 1194
    .line 1195
    invoke-virtual {v10, v12}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1196
    .line 1197
    .line 1198
    invoke-virtual {v10, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 1199
    .line 1200
    .line 1201
    invoke-virtual {v10, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1202
    .line 1203
    .line 1204
    const/4 v7, 0x0

    .line 1205
    invoke-virtual {v10, v7}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 1206
    .line 1207
    .line 1208
    const/16 v12, 0x10

    .line 1209
    .line 1210
    invoke-virtual {v10, v12}, Landroid/widget/TextView;->setGravity(I)V

    .line 1211
    .line 1212
    .line 1213
    const/16 v12, 0x1c

    .line 1214
    .line 1215
    invoke-static {v9, v12}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1216
    .line 1217
    .line 1218
    move-result v12

    .line 1219
    invoke-virtual {v10, v7, v7, v12, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1220
    .line 1221
    .line 1222
    invoke-virtual {v4, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1223
    .line 1224
    .line 1225
    iget-object v7, v15, Lxx;->η:Ljava/lang/String;

    .line 1226
    .line 1227
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1228
    .line 1229
    .line 1230
    move-result v10

    .line 1231
    const-string v12, "AI \u89e3\u6790"

    .line 1232
    .line 1233
    move-object/from16 v24, v3

    .line 1234
    .line 1235
    const/high16 v3, 0x41800000    # 16.0f

    .line 1236
    .line 1237
    invoke-static {v14, v12, v3, v10}, Lb8;->ο(Lb8;Ljava/lang/String;FI)Landroid/widget/TextView;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v10

    .line 1241
    const/16 v12, 0x10

    .line 1242
    .line 1243
    invoke-virtual {v10, v12}, Landroid/widget/TextView;->setGravity(I)V

    .line 1244
    .line 1245
    .line 1246
    invoke-virtual {v4, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1247
    .line 1248
    .line 1249
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1250
    .line 1251
    .line 1252
    new-instance v3, Landroid/view/View;

    .line 1253
    .line 1254
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v4

    .line 1258
    invoke-direct {v3, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 1259
    .line 1260
    .line 1261
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1262
    .line 1263
    .line 1264
    move-result v4

    .line 1265
    invoke-virtual {v3, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1266
    .line 1267
    .line 1268
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 1269
    .line 1270
    const/16 v10, 0x3e

    .line 1271
    .line 1272
    invoke-static {v9, v10}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1273
    .line 1274
    .line 1275
    move-result v10

    .line 1276
    move-object/from16 v25, v5

    .line 1277
    .line 1278
    const/4 v12, 0x2

    .line 1279
    invoke-static {v9, v12}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1280
    .line 1281
    .line 1282
    move-result v5

    .line 1283
    invoke-direct {v4, v10, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1284
    .line 1285
    .line 1286
    const/16 v5, 0xe

    .line 1287
    .line 1288
    invoke-static {v9, v5}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1289
    .line 1290
    .line 1291
    move-result v10

    .line 1292
    invoke-virtual {v4, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 1293
    .line 1294
    .line 1295
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1296
    .line 1297
    .line 1298
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1299
    .line 1300
    .line 1301
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1302
    .line 1303
    .line 1304
    new-instance v1, Landroid/view/View;

    .line 1305
    .line 1306
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v3

    .line 1310
    invoke-direct {v1, v3}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 1311
    .line 1312
    .line 1313
    iget-object v3, v15, Lxx;->δ:Ljava/lang/String;

    .line 1314
    .line 1315
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1316
    .line 1317
    .line 1318
    move-result v3

    .line 1319
    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1320
    .line 1321
    .line 1322
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 1323
    .line 1324
    const/4 v5, 0x1

    .line 1325
    invoke-static {v9, v5}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1326
    .line 1327
    .line 1328
    move-result v4

    .line 1329
    const/4 v10, -0x1

    .line 1330
    invoke-direct {v3, v10, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1331
    .line 1332
    .line 1333
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1334
    .line 1335
    .line 1336
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1337
    .line 1338
    .line 1339
    new-instance v1, Landroid/widget/LinearLayout;

    .line 1340
    .line 1341
    invoke-direct {v1, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1342
    .line 1343
    .line 1344
    const/4 v3, 0x0

    .line 1345
    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1346
    .line 1347
    .line 1348
    const/16 v3, 0x30

    .line 1349
    .line 1350
    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1351
    .line 1352
    .line 1353
    const/16 v5, 0xe

    .line 1354
    .line 1355
    invoke-static {v9, v5}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1356
    .line 1357
    .line 1358
    move-result v3

    .line 1359
    invoke-static {v9, v5}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1360
    .line 1361
    .line 1362
    move-result v4

    .line 1363
    invoke-static {v9, v5}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1364
    .line 1365
    .line 1366
    move-result v5

    .line 1367
    const/16 v10, 0xa

    .line 1368
    .line 1369
    invoke-static {v9, v10}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1370
    .line 1371
    .line 1372
    move-result v12

    .line 1373
    invoke-virtual {v1, v3, v4, v5, v12}, Landroid/view/View;->setPadding(IIII)V

    .line 1374
    .line 1375
    .line 1376
    new-instance v3, Landroid/widget/TextView;

    .line 1377
    .line 1378
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v4

    .line 1382
    invoke-direct {v3, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1383
    .line 1384
    .line 1385
    const-string v4, "\u7231"

    .line 1386
    .line 1387
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1388
    .line 1389
    .line 1390
    const/16 v4, 0x11

    .line 1391
    .line 1392
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 1393
    .line 1394
    .line 1395
    const/high16 v4, 0x41700000    # 15.0f

    .line 1396
    .line 1397
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1398
    .line 1399
    .line 1400
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 1401
    .line 1402
    .line 1403
    const/4 v10, -0x1

    .line 1404
    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1405
    .line 1406
    .line 1407
    iget-object v4, v15, Lxx;->τ:Ljava/lang/String;

    .line 1408
    .line 1409
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1410
    .line 1411
    .line 1412
    move-result v4

    .line 1413
    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    .line 1414
    .line 1415
    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 1416
    .line 1417
    .line 1418
    const/4 v6, 0x1

    .line 1419
    invoke-virtual {v5, v6}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 1420
    .line 1421
    .line 1422
    invoke-virtual {v5, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 1423
    .line 1424
    .line 1425
    invoke-virtual {v3, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1426
    .line 1427
    .line 1428
    const-string v4, "avatar"

    .line 1429
    .line 1430
    invoke-static {v4}, Lb8;->ε(Ljava/lang/String;)Lmk;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v4

    .line 1434
    const/16 v5, 0x38

    .line 1435
    .line 1436
    invoke-static {v14, v4, v3, v10, v5}, Lb8;->ν(Lb8;Lmk;Landroid/view/View;II)Landroid/widget/FrameLayout;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v3

    .line 1440
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 1441
    .line 1442
    const/16 v6, 0x28

    .line 1443
    .line 1444
    invoke-static {v9, v6}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1445
    .line 1446
    .line 1447
    move-result v10

    .line 1448
    invoke-static {v9, v6}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1449
    .line 1450
    .line 1451
    move-result v6

    .line 1452
    invoke-direct {v4, v10, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1453
    .line 1454
    .line 1455
    const/16 v6, 0xb

    .line 1456
    .line 1457
    invoke-static {v9, v6}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1458
    .line 1459
    .line 1460
    move-result v6

    .line 1461
    invoke-virtual {v4, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 1462
    .line 1463
    .line 1464
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1465
    .line 1466
    .line 1467
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1468
    .line 1469
    .line 1470
    new-instance v3, Landroid/widget/LinearLayout;

    .line 1471
    .line 1472
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1473
    .line 1474
    .line 1475
    move-result-object v4

    .line 1476
    invoke-direct {v3, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1477
    .line 1478
    .line 1479
    const/4 v6, 0x1

    .line 1480
    invoke-virtual {v3, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1481
    .line 1482
    .line 1483
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 1484
    .line 1485
    const/4 v6, 0x0

    .line 1486
    const/4 v10, -0x2

    .line 1487
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1488
    .line 1489
    invoke-direct {v4, v6, v10, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1490
    .line 1491
    .line 1492
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1493
    .line 1494
    .line 1495
    const-string v4, "name"

    .line 1496
    .line 1497
    invoke-static {v4}, Lb8;->ε(Ljava/lang/String;)Lmk;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v4

    .line 1501
    const-string v6, "\u7231\u5676\u65af\u5766"

    .line 1502
    .line 1503
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1504
    .line 1505
    .line 1506
    move-result v12

    .line 1507
    const/high16 v5, 0x41600000    # 14.0f

    .line 1508
    .line 1509
    invoke-static {v14, v6, v5, v12}, Lb8;->ο(Lb8;Ljava/lang/String;FI)Landroid/widget/TextView;

    .line 1510
    .line 1511
    .line 1512
    move-result-object v5

    .line 1513
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1514
    .line 1515
    .line 1516
    move-result v6

    .line 1517
    const/16 v12, 0x78

    .line 1518
    .line 1519
    invoke-static {v14, v4, v5, v6, v12}, Lb8;->ν(Lb8;Lmk;Landroid/view/View;II)Landroid/widget/FrameLayout;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v4

    .line 1523
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 1524
    .line 1525
    const/4 v6, -0x1

    .line 1526
    invoke-direct {v5, v6, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1527
    .line 1528
    .line 1529
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1530
    .line 1531
    .line 1532
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1533
    .line 1534
    .line 1535
    const-string v4, "content"

    .line 1536
    .line 1537
    invoke-static {v4}, Lb8;->ε(Ljava/lang/String;)Lmk;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v4

    .line 1541
    invoke-static/range {v25 .. v25}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1542
    .line 1543
    .line 1544
    move-result v5

    .line 1545
    const-string v6, "\u8ba9\u6c83\u5c14\u739b\u4fdd\u6301\u6df7\u4e71\uff0c@\u5c0f\u52a9\u624b \u8bf4\u5f97\u5f88\u5bf9"

    .line 1546
    .line 1547
    const/high16 v10, 0x41800000    # 16.0f

    .line 1548
    .line 1549
    invoke-static {v14, v6, v10, v5}, Lb8;->ο(Lb8;Ljava/lang/String;FI)Landroid/widget/TextView;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v5

    .line 1553
    const/4 v6, 0x2

    .line 1554
    invoke-static {v9, v6}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1555
    .line 1556
    .line 1557
    move-result v10

    .line 1558
    int-to-float v6, v10

    .line 1559
    const/high16 v10, 0x3f800000    # 1.0f

    .line 1560
    .line 1561
    invoke-virtual {v5, v6, v10}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 1562
    .line 1563
    .line 1564
    invoke-static/range {v25 .. v25}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1565
    .line 1566
    .line 1567
    move-result v6

    .line 1568
    const/16 v10, 0x58

    .line 1569
    .line 1570
    invoke-static {v14, v4, v5, v6, v10}, Lb8;->ν(Lb8;Lmk;Landroid/view/View;II)Landroid/widget/FrameLayout;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v4

    .line 1574
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 1575
    .line 1576
    const/4 v6, -0x2

    .line 1577
    const/4 v10, -0x1

    .line 1578
    invoke-direct {v5, v10, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1579
    .line 1580
    .line 1581
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1582
    .line 1583
    .line 1584
    const/4 v5, 0x5

    .line 1585
    invoke-static {v9, v5}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1586
    .line 1587
    .line 1588
    move-result v5

    .line 1589
    const/4 v6, 0x0

    .line 1590
    invoke-virtual {v4, v6, v5, v6, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 1591
    .line 1592
    .line 1593
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1594
    .line 1595
    .line 1596
    new-instance v4, Landroid/widget/LinearLayout;

    .line 1597
    .line 1598
    invoke-direct {v4, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1599
    .line 1600
    .line 1601
    invoke-virtual {v4, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1602
    .line 1603
    .line 1604
    const/16 v5, 0x10

    .line 1605
    .line 1606
    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1607
    .line 1608
    .line 1609
    const/16 v10, 0x8

    .line 1610
    .line 1611
    invoke-static {v9, v10}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1612
    .line 1613
    .line 1614
    move-result v12

    .line 1615
    invoke-virtual {v4, v6, v12, v6, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 1616
    .line 1617
    .line 1618
    new-instance v10, Landroid/widget/LinearLayout;

    .line 1619
    .line 1620
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v12

    .line 1624
    invoke-direct {v10, v12}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1625
    .line 1626
    .line 1627
    invoke-virtual {v10, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1628
    .line 1629
    .line 1630
    invoke-virtual {v10, v5}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1631
    .line 1632
    .line 1633
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 1634
    .line 1635
    move-object/from16 v20, v7

    .line 1636
    .line 1637
    const/high16 v7, 0x3f800000    # 1.0f

    .line 1638
    .line 1639
    const/4 v12, -0x2

    .line 1640
    invoke-direct {v5, v6, v12, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1641
    .line 1642
    .line 1643
    invoke-virtual {v10, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1644
    .line 1645
    .line 1646
    const-string v5, "time"

    .line 1647
    .line 1648
    invoke-static {v5}, Lb8;->ε(Ljava/lang/String;)Lmk;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v5

    .line 1652
    const-string v6, "07-01"

    .line 1653
    .line 1654
    invoke-static/range {v24 .. v24}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1655
    .line 1656
    .line 1657
    move-result v7

    .line 1658
    const/high16 v12, 0x41400000    # 12.0f

    .line 1659
    .line 1660
    invoke-static {v14, v6, v12, v7}, Lb8;->ο(Lb8;Ljava/lang/String;FI)Landroid/widget/TextView;

    .line 1661
    .line 1662
    .line 1663
    move-result-object v6

    .line 1664
    invoke-static/range {v24 .. v24}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1665
    .line 1666
    .line 1667
    move-result v7

    .line 1668
    const/16 v12, 0x78

    .line 1669
    .line 1670
    invoke-static {v14, v5, v6, v7, v12}, Lb8;->ν(Lb8;Lmk;Landroid/view/View;II)Landroid/widget/FrameLayout;

    .line 1671
    .line 1672
    .line 1673
    move-result-object v5

    .line 1674
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 1675
    .line 1676
    const/4 v12, -0x2

    .line 1677
    invoke-direct {v6, v12, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1678
    .line 1679
    .line 1680
    const/4 v7, 0x6

    .line 1681
    invoke-static {v9, v7}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1682
    .line 1683
    .line 1684
    move-result v7

    .line 1685
    invoke-virtual {v6, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 1686
    .line 1687
    .line 1688
    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1689
    .line 1690
    .line 1691
    invoke-virtual {v10, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1692
    .line 1693
    .line 1694
    const-string v5, "ip_region"

    .line 1695
    .line 1696
    invoke-static {v5}, Lb8;->ε(Ljava/lang/String;)Lmk;

    .line 1697
    .line 1698
    .line 1699
    move-result-object v5

    .line 1700
    iget-object v6, v15, Lxx;->ι:Ljava/lang/String;

    .line 1701
    .line 1702
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1703
    .line 1704
    .line 1705
    move-result v7

    .line 1706
    const-string v12, "\u00b7 \u9a6c\u6765\u897f\u4e9a"

    .line 1707
    .line 1708
    move-object/from16 v18, v6

    .line 1709
    .line 1710
    const/high16 v6, 0x41400000    # 12.0f

    .line 1711
    .line 1712
    invoke-static {v14, v12, v6, v7}, Lb8;->ο(Lb8;Ljava/lang/String;FI)Landroid/widget/TextView;

    .line 1713
    .line 1714
    .line 1715
    move-result-object v7

    .line 1716
    invoke-static/range {v18 .. v18}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1717
    .line 1718
    .line 1719
    move-result v6

    .line 1720
    const/16 v12, 0x78

    .line 1721
    .line 1722
    invoke-static {v14, v5, v7, v6, v12}, Lb8;->ν(Lb8;Lmk;Landroid/view/View;II)Landroid/widget/FrameLayout;

    .line 1723
    .line 1724
    .line 1725
    move-result-object v5

    .line 1726
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 1727
    .line 1728
    const/4 v12, -0x2

    .line 1729
    invoke-direct {v6, v12, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1730
    .line 1731
    .line 1732
    const/16 v7, 0x9

    .line 1733
    .line 1734
    invoke-static {v9, v7}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1735
    .line 1736
    .line 1737
    move-result v12

    .line 1738
    invoke-virtual {v6, v12}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 1739
    .line 1740
    .line 1741
    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1742
    .line 1743
    .line 1744
    invoke-virtual {v10, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1745
    .line 1746
    .line 1747
    const-string v5, "reply"

    .line 1748
    .line 1749
    invoke-static {v5}, Lb8;->ε(Ljava/lang/String;)Lmk;

    .line 1750
    .line 1751
    .line 1752
    move-result-object v5

    .line 1753
    const-string v6, "\u56de\u590d"

    .line 1754
    .line 1755
    invoke-static/range {v24 .. v24}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1756
    .line 1757
    .line 1758
    move-result v12

    .line 1759
    const/high16 v7, 0x41400000    # 12.0f

    .line 1760
    .line 1761
    invoke-static {v14, v6, v7, v12}, Lb8;->ο(Lb8;Ljava/lang/String;FI)Landroid/widget/TextView;

    .line 1762
    .line 1763
    .line 1764
    move-result-object v6

    .line 1765
    invoke-static/range {v24 .. v24}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1766
    .line 1767
    .line 1768
    move-result v7

    .line 1769
    const/16 v12, 0x78

    .line 1770
    .line 1771
    invoke-static {v14, v5, v6, v7, v12}, Lb8;->ν(Lb8;Lmk;Landroid/view/View;II)Landroid/widget/FrameLayout;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v5

    .line 1775
    invoke-virtual {v10, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1776
    .line 1777
    .line 1778
    invoke-virtual {v4, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1779
    .line 1780
    .line 1781
    new-instance v5, Landroid/widget/LinearLayout;

    .line 1782
    .line 1783
    invoke-direct {v5, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1784
    .line 1785
    .line 1786
    const/4 v6, 0x0

    .line 1787
    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1788
    .line 1789
    .line 1790
    const/16 v7, 0x10

    .line 1791
    .line 1792
    invoke-virtual {v5, v7}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1793
    .line 1794
    .line 1795
    new-instance v10, Landroid/widget/LinearLayout;

    .line 1796
    .line 1797
    invoke-direct {v10, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1798
    .line 1799
    .line 1800
    invoke-virtual {v10, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1801
    .line 1802
    .line 1803
    invoke-virtual {v10, v7}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1804
    .line 1805
    .line 1806
    const/4 v7, 0x2

    .line 1807
    invoke-static {v9, v7}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1808
    .line 1809
    .line 1810
    move-result v12

    .line 1811
    invoke-static {v9, v7}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1812
    .line 1813
    .line 1814
    move-result v7

    .line 1815
    invoke-virtual {v10, v12, v6, v7, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 1816
    .line 1817
    .line 1818
    const-string v6, "like_icon"

    .line 1819
    .line 1820
    invoke-static {v6}, Lb8;->ε(Ljava/lang/String;)Lmk;

    .line 1821
    .line 1822
    .line 1823
    move-result-object v6

    .line 1824
    const v7, 0x7f0800a9

    .line 1825
    .line 1826
    .line 1827
    const-string v12, "\u70b9\u8d5e\u56fe\u6807"

    .line 1828
    .line 1829
    invoke-virtual {v14, v12, v7}, Lb8;->κ(Ljava/lang/String;I)Landroid/widget/ImageView;

    .line 1830
    .line 1831
    .line 1832
    move-result-object v7

    .line 1833
    invoke-static/range {v20 .. v20}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1834
    .line 1835
    .line 1836
    move-result v12

    .line 1837
    move-object/from16 v19, v8

    .line 1838
    .line 1839
    const/16 v8, 0x38

    .line 1840
    .line 1841
    invoke-static {v14, v6, v7, v12, v8}, Lb8;->ν(Lb8;Lmk;Landroid/view/View;II)Landroid/widget/FrameLayout;

    .line 1842
    .line 1843
    .line 1844
    move-result-object v6

    .line 1845
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 1846
    .line 1847
    const/16 v8, 0x16

    .line 1848
    .line 1849
    invoke-static {v9, v8}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1850
    .line 1851
    .line 1852
    move-result v12

    .line 1853
    move-object/from16 v21, v13

    .line 1854
    .line 1855
    invoke-static {v9, v8}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1856
    .line 1857
    .line 1858
    move-result v13

    .line 1859
    invoke-direct {v7, v12, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1860
    .line 1861
    .line 1862
    const/4 v12, 0x3

    .line 1863
    invoke-static {v9, v12}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1864
    .line 1865
    .line 1866
    move-result v12

    .line 1867
    invoke-virtual {v7, v12}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 1868
    .line 1869
    .line 1870
    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1871
    .line 1872
    .line 1873
    invoke-virtual {v10, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1874
    .line 1875
    .line 1876
    const-string v6, "like_count"

    .line 1877
    .line 1878
    invoke-static {v6}, Lb8;->ε(Ljava/lang/String;)Lmk;

    .line 1879
    .line 1880
    .line 1881
    move-result-object v6

    .line 1882
    const-string v7, "772"

    .line 1883
    .line 1884
    invoke-static/range {v24 .. v24}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1885
    .line 1886
    .line 1887
    move-result v12

    .line 1888
    const/high16 v13, 0x41500000    # 13.0f

    .line 1889
    .line 1890
    invoke-static {v14, v7, v13, v12}, Lb8;->ο(Lb8;Ljava/lang/String;FI)Landroid/widget/TextView;

    .line 1891
    .line 1892
    .line 1893
    move-result-object v7

    .line 1894
    invoke-static/range {v24 .. v24}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1895
    .line 1896
    .line 1897
    move-result v12

    .line 1898
    const/16 v13, 0x78

    .line 1899
    .line 1900
    invoke-static {v14, v6, v7, v12, v13}, Lb8;->ν(Lb8;Lmk;Landroid/view/View;II)Landroid/widget/FrameLayout;

    .line 1901
    .line 1902
    .line 1903
    move-result-object v6

    .line 1904
    invoke-virtual {v10, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1905
    .line 1906
    .line 1907
    const-string v6, "like_area"

    .line 1908
    .line 1909
    invoke-static {v6}, Lb8;->ε(Ljava/lang/String;)Lmk;

    .line 1910
    .line 1911
    .line 1912
    move-result-object v6

    .line 1913
    const/16 v7, 0x70

    .line 1914
    .line 1915
    const/4 v12, 0x0

    .line 1916
    invoke-static {v14, v6, v10, v12, v7}, Lb8;->ν(Lb8;Lmk;Landroid/view/View;II)Landroid/widget/FrameLayout;

    .line 1917
    .line 1918
    .line 1919
    move-result-object v6

    .line 1920
    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1921
    .line 1922
    .line 1923
    const-string v6, "bury"

    .line 1924
    .line 1925
    invoke-static {v6}, Lb8;->ε(Ljava/lang/String;)Lmk;

    .line 1926
    .line 1927
    .line 1928
    move-result-object v6

    .line 1929
    const v7, 0x7f0800a8

    .line 1930
    .line 1931
    .line 1932
    const-string v10, "\u8e29\u56fe\u6807"

    .line 1933
    .line 1934
    invoke-virtual {v14, v10, v7}, Lb8;->κ(Ljava/lang/String;I)Landroid/widget/ImageView;

    .line 1935
    .line 1936
    .line 1937
    move-result-object v7

    .line 1938
    invoke-static/range {v20 .. v20}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1939
    .line 1940
    .line 1941
    move-result v10

    .line 1942
    const/16 v12, 0x38

    .line 1943
    .line 1944
    invoke-static {v14, v6, v7, v10, v12}, Lb8;->ν(Lb8;Lmk;Landroid/view/View;II)Landroid/widget/FrameLayout;

    .line 1945
    .line 1946
    .line 1947
    move-result-object v6

    .line 1948
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 1949
    .line 1950
    invoke-static {v9, v8}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1951
    .line 1952
    .line 1953
    move-result v10

    .line 1954
    invoke-static {v9, v8}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1955
    .line 1956
    .line 1957
    move-result v8

    .line 1958
    invoke-direct {v7, v10, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1959
    .line 1960
    .line 1961
    const/16 v10, 0xa

    .line 1962
    .line 1963
    invoke-static {v9, v10}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1964
    .line 1965
    .line 1966
    move-result v8

    .line 1967
    invoke-virtual {v7, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 1968
    .line 1969
    .line 1970
    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1971
    .line 1972
    .line 1973
    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1974
    .line 1975
    .line 1976
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1977
    .line 1978
    .line 1979
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1980
    .line 1981
    .line 1982
    const-string v4, "expand_comments"

    .line 1983
    .line 1984
    invoke-static {v4}, Lb8;->ε(Ljava/lang/String;)Lmk;

    .line 1985
    .line 1986
    .line 1987
    move-result-object v4

    .line 1988
    iget-object v5, v15, Lxx;->ρ:Ljava/lang/String;

    .line 1989
    .line 1990
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1991
    .line 1992
    .line 1993
    move-result v6

    .line 1994
    const-string v7, "\u2500\u2500  \u5c55\u5f00 4 \u6761\u56de\u590d \u2304"

    .line 1995
    .line 1996
    const/high16 v10, 0x41500000    # 13.0f

    .line 1997
    .line 1998
    invoke-static {v14, v7, v10, v6}, Lb8;->ο(Lb8;Ljava/lang/String;FI)Landroid/widget/TextView;

    .line 1999
    .line 2000
    .line 2001
    move-result-object v6

    .line 2002
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 2003
    .line 2004
    .line 2005
    move-result v5

    .line 2006
    const/16 v12, 0x78

    .line 2007
    .line 2008
    invoke-static {v14, v4, v6, v5, v12}, Lb8;->ν(Lb8;Lmk;Landroid/view/View;II)Landroid/widget/FrameLayout;

    .line 2009
    .line 2010
    .line 2011
    move-result-object v4

    .line 2012
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 2013
    .line 2014
    const/4 v10, -0x1

    .line 2015
    const/4 v12, -0x2

    .line 2016
    invoke-direct {v5, v10, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 2017
    .line 2018
    .line 2019
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2020
    .line 2021
    .line 2022
    const/16 v5, 0x9

    .line 2023
    .line 2024
    invoke-static {v9, v5}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 2025
    .line 2026
    .line 2027
    move-result v5

    .line 2028
    const/4 v6, 0x0

    .line 2029
    invoke-virtual {v4, v6, v5, v6, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 2030
    .line 2031
    .line 2032
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2033
    .line 2034
    .line 2035
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2036
    .line 2037
    .line 2038
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2039
    .line 2040
    .line 2041
    iput-object v0, v14, Lb8;->ε:Ljava/lang/Object;

    .line 2042
    .line 2043
    iput-object v14, v2, Luk;->Α:Lb8;

    .line 2044
    .line 2045
    const/4 v7, 0x1

    .line 2046
    invoke-static {v9, v7}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    .line 2047
    .line 2048
    .line 2049
    move-result-object v0

    .line 2050
    new-instance v1, Landroid/widget/TextView;

    .line 2051
    .line 2052
    invoke-direct {v1, v9}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 2053
    .line 2054
    .line 2055
    const-string v3, "\u70b9\u51fb\u4e0b\u65b9\u9884\u89c8\u4e2d\u7684\u63a7\u4ef6\u8fdb\u884c\u4fee\u6539"

    .line 2056
    .line 2057
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2058
    .line 2059
    .line 2060
    const/high16 v6, 0x41400000    # 12.0f

    .line 2061
    .line 2062
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setTextSize(F)V

    .line 2063
    .line 2064
    .line 2065
    const/16 v4, 0x11

    .line 2066
    .line 2067
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 2068
    .line 2069
    .line 2070
    iget-object v3, v15, Lxx;->θ:Ljava/lang/String;

    .line 2071
    .line 2072
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 2073
    .line 2074
    .line 2075
    move-result v3

    .line 2076
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2077
    .line 2078
    .line 2079
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 2080
    .line 2081
    const/4 v10, -0x1

    .line 2082
    const/4 v12, -0x2

    .line 2083
    invoke-direct {v3, v10, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 2084
    .line 2085
    .line 2086
    const/16 v5, 0x8

    .line 2087
    .line 2088
    invoke-static {v9, v5}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 2089
    .line 2090
    .line 2091
    move-result v4

    .line 2092
    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 2093
    .line 2094
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2095
    .line 2096
    .line 2097
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2098
    .line 2099
    .line 2100
    iget-object v1, v2, Luk;->Α:Lb8;

    .line 2101
    .line 2102
    if-eqz v1, :cond_4

    .line 2103
    .line 2104
    iget-object v1, v1, Lb8;->ε:Ljava/lang/Object;

    .line 2105
    .line 2106
    check-cast v1, Landroid/widget/LinearLayout;

    .line 2107
    .line 2108
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2109
    .line 2110
    .line 2111
    iput-object v0, v2, Luk;->λ:Landroid/widget/LinearLayout;

    .line 2112
    .line 2113
    new-instance v0, Landroid/widget/LinearLayout;

    .line 2114
    .line 2115
    invoke-direct {v0, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 2116
    .line 2117
    .line 2118
    const/4 v7, 0x1

    .line 2119
    invoke-virtual {v0, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 2120
    .line 2121
    .line 2122
    const/16 v5, 0x8

    .line 2123
    .line 2124
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 2125
    .line 2126
    .line 2127
    iput-object v0, v2, Luk;->μ:Landroid/widget/LinearLayout;

    .line 2128
    .line 2129
    invoke-static {v9, v7}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    .line 2130
    .line 2131
    .line 2132
    move-result-object v1

    .line 2133
    iput-object v1, v2, Luk;->ν:Landroid/widget/LinearLayout;

    .line 2134
    .line 2135
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2136
    .line 2137
    .line 2138
    iput-object v0, v2, Luk;->μ:Landroid/widget/LinearLayout;

    .line 2139
    .line 2140
    iget-object v0, v2, Luk;->λ:Landroid/widget/LinearLayout;

    .line 2141
    .line 2142
    if-eqz v0, :cond_3

    .line 2143
    .line 2144
    invoke-virtual {v11, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2145
    .line 2146
    .line 2147
    iget-object v0, v2, Luk;->μ:Landroid/widget/LinearLayout;

    .line 2148
    .line 2149
    if-eqz v0, :cond_2

    .line 2150
    .line 2151
    invoke-virtual {v11, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2152
    .line 2153
    .line 2154
    move-object/from16 v0, v21

    .line 2155
    .line 2156
    invoke-virtual {v0, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2157
    .line 2158
    .line 2159
    move-object/from16 v1, v19

    .line 2160
    .line 2161
    invoke-virtual {v1, v0}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 2162
    .line 2163
    .line 2164
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2165
    .line 2166
    .line 2167
    move-result-object v0

    .line 2168
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 2169
    .line 2170
    .line 2171
    move-result-object v0

    .line 2172
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 2173
    .line 2174
    int-to-float v0, v0

    .line 2175
    const v3, 0x3f51eb85    # 0.82f

    .line 2176
    .line 2177
    .line 2178
    mul-float/2addr v0, v3

    .line 2179
    invoke-static {v0}, Ljx0;->в(F)I

    .line 2180
    .line 2181
    .line 2182
    move-result v0

    .line 2183
    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    .line 2184
    .line 2185
    const/4 v10, -0x1

    .line 2186
    invoke-direct {v3, v10, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 2187
    .line 2188
    .line 2189
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2190
    .line 2191
    .line 2192
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 2193
    .line 2194
    invoke-direct {v0, v9}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 2195
    .line 2196
    .line 2197
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 2198
    .line 2199
    .line 2200
    move-result-object v0

    .line 2201
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 2202
    .line 2203
    .line 2204
    move-result-object v0

    .line 2205
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2206
    .line 2207
    .line 2208
    iput-object v0, v2, Luk;->η:Landroid/app/AlertDialog;

    .line 2209
    .line 2210
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 2211
    .line 2212
    .line 2213
    iget-object v0, v2, Luk;->η:Landroid/app/AlertDialog;

    .line 2214
    .line 2215
    if-eqz v0, :cond_1

    .line 2216
    .line 2217
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 2218
    .line 2219
    .line 2220
    move-result-object v0

    .line 2221
    if-eqz v0, :cond_0

    .line 2222
    .line 2223
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 2224
    .line 2225
    const/4 v6, 0x0

    .line 2226
    invoke-direct {v1, v6}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 2227
    .line 2228
    .line 2229
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2230
    .line 2231
    .line 2232
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2233
    .line 2234
    .line 2235
    move-result-object v1

    .line 2236
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 2237
    .line 2238
    .line 2239
    move-result-object v1

    .line 2240
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 2241
    .line 2242
    int-to-float v1, v1

    .line 2243
    const v3, 0x3f70a3d7    # 0.94f

    .line 2244
    .line 2245
    .line 2246
    mul-float/2addr v1, v3

    .line 2247
    invoke-static {v1}, Ljx0;->в(F)I

    .line 2248
    .line 2249
    .line 2250
    move-result v1

    .line 2251
    const/4 v12, -0x2

    .line 2252
    invoke-virtual {v0, v1, v12}, Landroid/view/Window;->setLayout(II)V

    .line 2253
    .line 2254
    .line 2255
    :cond_0
    invoke-virtual {v2}, Luk;->θ()V

    .line 2256
    .line 2257
    .line 2258
    return-void

    .line 2259
    :cond_1
    const-string v0, "dialog"

    .line 2260
    .line 2261
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 2262
    .line 2263
    .line 2264
    throw v23

    .line 2265
    :cond_2
    const-string v0, "hiddenPage"

    .line 2266
    .line 2267
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 2268
    .line 2269
    .line 2270
    throw v23

    .line 2271
    :cond_3
    const-string v0, "previewPage"

    .line 2272
    .line 2273
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 2274
    .line 2275
    .line 2276
    throw v23

    .line 2277
    :cond_4
    const-string v0, "preview"

    .line 2278
    .line 2279
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 2280
    .line 2281
    .line 2282
    throw v23

    .line 2283
    :cond_5
    const-string v0, "visibilityButton"

    .line 2284
    .line 2285
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 2286
    .line 2287
    .line 2288
    throw v23

    .line 2289
    :cond_6
    const-string v0, "mentionSection"

    .line 2290
    .line 2291
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 2292
    .line 2293
    .line 2294
    throw v23

    .line 2295
    :cond_7
    const-string v0, "colorSection"

    .line 2296
    .line 2297
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 2298
    .line 2299
    .line 2300
    throw v23

    .line 2301
    :cond_8
    const-string v0, "alphaSection"

    .line 2302
    .line 2303
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 2304
    .line 2305
    .line 2306
    throw v23

    .line 2307
    :cond_9
    const/16 v23, 0x0

    .line 2308
    .line 2309
    const-string v0, "hiddenTab"

    .line 2310
    .line 2311
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 2312
    .line 2313
    .line 2314
    throw v23

    .line 2315
    :cond_a
    const/16 v23, 0x0

    .line 2316
    .line 2317
    const-string v0, "previewTab"

    .line 2318
    .line 2319
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 2320
    .line 2321
    .line 2322
    throw v23
.end method

.method public final ν(Lnk;)V
    .locals 7

    .line 1
    iput-object p1, p0, Luk;->γ:Lnk;

    .line 2
    .line 3
    iget-object v0, p0, Luk;->λ:Landroid/widget/LinearLayout;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_6

    .line 7
    .line 8
    const/16 v2, 0x8

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    sget-object v4, Lnk;->ε:Lnk;

    .line 12
    .line 13
    if-ne p1, v4, :cond_0

    .line 14
    .line 15
    move v5, v3

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v5, v2

    .line 18
    :goto_0
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Luk;->μ:Landroid/widget/LinearLayout;

    .line 22
    .line 23
    if-eqz v0, :cond_5

    .line 24
    .line 25
    sget-object v5, Lnk;->ζ:Lnk;

    .line 26
    .line 27
    if-ne p1, v5, :cond_1

    .line 28
    .line 29
    move v6, v3

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v6, v2

    .line 32
    :goto_1
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Luk;->ξ:Landroid/widget/LinearLayout;

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    if-ne p1, v4, :cond_2

    .line 40
    .line 41
    move v2, v3

    .line 42
    :cond_2
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Luk;->κ()V

    .line 46
    .line 47
    .line 48
    if-ne p1, v5, :cond_3

    .line 49
    .line 50
    invoke-virtual {p0}, Luk;->η()V

    .line 51
    .line 52
    .line 53
    :cond_3
    return-void

    .line 54
    :cond_4
    const-string p0, "editor"

    .line 55
    .line 56
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v1

    .line 60
    :cond_5
    const-string p0, "hiddenPage"

    .line 61
    .line 62
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v1

    .line 66
    :cond_6
    const-string p0, "previewPage"

    .line 67
    .line 68
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v1
.end method

.method public final ξ()Landroid/widget/Switch;
    .locals 7

    .line 1
    new-instance v0, Landroid/widget/Switch;

    .line 2
    .line 3
    iget-object v1, p0, Luk;->α:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/widget/Switch;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Landroid/content/res/ColorStateList;

    .line 9
    .line 10
    const v2, 0x10100a0

    .line 11
    .line 12
    .line 13
    filled-new-array {v2}, [I

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const/4 v4, 0x0

    .line 18
    new-array v5, v4, [I

    .line 19
    .line 20
    filled-new-array {v3, v5}, [[I

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iget-object p0, p0, Luk;->β:Lxx;

    .line 25
    .line 26
    iget-object v5, p0, Lxx;->ι:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    iget-object v6, p0, Lxx;->φ:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    filled-new-array {v5, v6}, [I

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-direct {v1, v3, v5}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setThumbTintList(Landroid/content/res/ColorStateList;)V

    .line 46
    .line 47
    .line 48
    new-instance v1, Landroid/content/res/ColorStateList;

    .line 49
    .line 50
    filled-new-array {v2}, [I

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    new-array v3, v4, [I

    .line 55
    .line 56
    filled-new-array {v2, v3}, [[I

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    iget-object v3, p0, Lxx;->κ:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    iget-object p0, p0, Lxx;->χ:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    filled-new-array {v3, p0}, [I

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-direct {v1, v2, p0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setTrackTintList(Landroid/content/res/ColorStateList;)V

    .line 80
    .line 81
    .line 82
    return-object v0
.end method
