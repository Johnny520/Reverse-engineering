.class public final Lcom/example/dyhelper/ui/μ;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/example/dyhelper/ui/μ;->α:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        -0x10000
        -0xbb00
        -0x7400
        -0x2900
        -0x830400
        -0xff37af
        -0xff432c
        -0xde690d
        -0xc0ae4b
        -0x63d850
        -0x16e19d
        -0x1d3ab
        -0x1
        -0x333334
        -0x777778
        -0x1000000
    .end array-data
.end method

.method public static final α(Landroid/graphics/Canvas;FFLandroid/graphics/Paint;II)V
    .locals 8

    .line 1
    invoke-virtual {p3, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    move-object v0, p0

    .line 7
    move v3, p1

    .line 8
    move v4, p2

    .line 9
    move-object v5, p3

    .line 10
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v5, p5}, Landroid/graphics/Paint;->setColor(I)V

    .line 14
    .line 15
    .line 16
    const/high16 p1, 0x40000000    # 2.0f

    .line 17
    .line 18
    div-float p2, v4, p1

    .line 19
    .line 20
    const/high16 v0, 0x3f800000    # 1.0f

    .line 21
    .line 22
    cmpg-float p1, p2, v0

    .line 23
    .line 24
    if-gez p1, :cond_0

    .line 25
    .line 26
    move v1, v0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v1, p2

    .line 29
    :goto_0
    div-float p1, v3, v1

    .line 30
    .line 31
    float-to-double p1, p1

    .line 32
    invoke-static {p1, p2}, Ljava/lang/Math;->ceil(D)D

    .line 33
    .line 34
    .line 35
    move-result-wide p1

    .line 36
    double-to-int v2, p1

    .line 37
    const/4 v3, 0x0

    .line 38
    move v4, v3

    .line 39
    :goto_1
    const/4 v6, 0x2

    .line 40
    if-ge v4, v6, :cond_3

    .line 41
    .line 42
    move v7, v3

    .line 43
    :goto_2
    if-ge v7, v2, :cond_2

    .line 44
    .line 45
    add-int p1, v4, v7

    .line 46
    .line 47
    rem-int/2addr p1, v6

    .line 48
    if-nez p1, :cond_1

    .line 49
    .line 50
    int-to-float p1, v7

    .line 51
    move p2, p1

    .line 52
    mul-float p1, p2, v1

    .line 53
    .line 54
    int-to-float p3, v4

    .line 55
    move p4, p2

    .line 56
    mul-float p2, p3, v1

    .line 57
    .line 58
    add-float/2addr p4, v0

    .line 59
    mul-float/2addr p4, v1

    .line 60
    add-float/2addr p3, v0

    .line 61
    mul-float/2addr p3, v1

    .line 62
    move p5, p4

    .line 63
    move p4, p3

    .line 64
    move p3, p5

    .line 65
    move-object p5, v5

    .line 66
    invoke-virtual/range {p0 .. p5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    add-int/lit8 v7, v7, 0x1

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    return-void
.end method

.method public static final β(Landroid/view/View;Landroid/view/MotionEvent;La80;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_6

    .line 8
    .line 9
    if-eq v0, v2, :cond_4

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    if-eq v0, v3, :cond_2

    .line 13
    .line 14
    const/4 p1, 0x3

    .line 15
    if-eq v0, p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-interface {p1, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 25
    .line 26
    .line 27
    :cond_1
    check-cast p0, Lii;

    .line 28
    .line 29
    invoke-interface {p0, v1}, Lii;->α(Z)V

    .line 30
    .line 31
    .line 32
    return v2

    .line 33
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    if-eqz p0, :cond_3

    .line 38
    .line 39
    invoke-interface {p0, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 40
    .line 41
    .line 42
    :cond_3
    invoke-interface {p2, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    invoke-interface {p2, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-eqz p1, :cond_5

    .line 54
    .line 55
    invoke-interface {p1, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 56
    .line 57
    .line 58
    :cond_5
    check-cast p0, Lii;

    .line 59
    .line 60
    invoke-interface {p0, v1}, Lii;->α(Z)V

    .line 61
    .line 62
    .line 63
    return v2

    .line 64
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-lez v0, :cond_9

    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-gtz v0, :cond_7

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_7
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-eqz v0, :cond_8

    .line 82
    .line 83
    invoke-interface {v0, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 84
    .line 85
    .line 86
    :cond_8
    check-cast p0, Lii;

    .line 87
    .line 88
    invoke-interface {p0, v2}, Lii;->α(Z)V

    .line 89
    .line 90
    .line 91
    invoke-interface {p2, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    return v2

    .line 95
    :cond_9
    :goto_0
    return v1
.end method

.method public static γ(Landroid/content/Context;Ljava/lang/String;Lxx;ZLp70;)Landroid/widget/TextView;
    .locals 1

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
    const/high16 p1, 0x41500000    # 13.0f

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 12
    .line 13
    .line 14
    const/16 p1, 0x11

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    invoke-virtual {v0, p1}, Landroid/view/View;->setClickable(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Landroid/view/View;->setFocusable(Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {v0, p1, p3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 35
    .line 36
    .line 37
    if-eqz p3, :cond_0

    .line 38
    .line 39
    const-string p1, "#FFFFFF"

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iget-object p1, p2, Lxx;->ζ:Ljava/lang/String;

    .line 43
    .line 44
    :goto_0
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p2, Lxx;->Α:Ljava/lang/String;

    .line 52
    .line 53
    if-eqz p3, :cond_1

    .line 54
    .line 55
    iget-object p2, p2, Lxx;->ι:Ljava/lang/String;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    iget-object p2, p2, Lxx;->χ:Ljava/lang/String;

    .line 59
    .line 60
    :goto_1
    const/16 p3, 0xa

    .line 61
    .line 62
    invoke-static {p3, p0, p1, p2}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 67
    .line 68
    .line 69
    new-instance p0, Lb9;

    .line 70
    .line 71
    const/4 p1, 0x3

    .line 72
    invoke-direct {p0, p1, p4}, Lb9;-><init>(ILp70;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 76
    .line 77
    .line 78
    return-object v0
.end method

.method public static δ(Landroid/content/Context;Ljava/lang/String;IZLa80;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    move/from16 v3, p2

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/high16 v3, -0x1000000

    .line 18
    .line 19
    or-int v3, p2, v3

    .line 20
    .line 21
    :goto_0
    new-instance v4, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;

    .line 22
    .line 23
    invoke-direct {v4, v0, v3, v1, v2}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;-><init>(Landroid/content/Context;IZLxx;)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Landroid/widget/LinearLayout;

    .line 27
    .line 28
    invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 29
    .line 30
    .line 31
    const/4 v5, 0x1

    .line 32
    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 33
    .line 34
    .line 35
    iget-object v6, v2, Lxx;->β:Ljava/lang/String;

    .line 36
    .line 37
    const/16 v7, 0xe

    .line 38
    .line 39
    invoke-static {v7, v0, v6}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-virtual {v1, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 44
    .line 45
    .line 46
    new-instance v6, Lum1;

    .line 47
    .line 48
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    new-instance v8, Lei;

    .line 52
    .line 53
    const/4 v9, 0x0

    .line 54
    invoke-direct {v8, v6, v9}, Lei;-><init>(Lum1;I)V

    .line 55
    .line 56
    .line 57
    new-instance v9, Landroid/widget/FrameLayout;

    .line 58
    .line 59
    invoke-direct {v9, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 60
    .line 61
    .line 62
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 63
    .line 64
    const/16 v11, 0x34

    .line 65
    .line 66
    invoke-static {v0, v11}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 67
    .line 68
    .line 69
    move-result v12

    .line 70
    const/4 v13, -0x1

    .line 71
    invoke-direct {v10, v13, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v9, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 75
    .line 76
    .line 77
    new-instance v10, Landroid/widget/TextView;

    .line 78
    .line 79
    invoke-direct {v10, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 80
    .line 81
    .line 82
    move-object/from16 v12, p1

    .line 83
    .line 84
    invoke-virtual {v10, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    .line 86
    .line 87
    const/high16 v12, 0x41800000    # 16.0f

    .line 88
    .line 89
    invoke-virtual {v10, v12}, Landroid/widget/TextView;->setTextSize(F)V

    .line 90
    .line 91
    .line 92
    const/16 v12, 0x11

    .line 93
    .line 94
    invoke-virtual {v10, v12}, Landroid/widget/TextView;->setGravity(I)V

    .line 95
    .line 96
    .line 97
    const/4 v14, 0x0

    .line 98
    invoke-virtual {v10, v14}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v10, v5}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 102
    .line 103
    .line 104
    sget-object v15, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 105
    .line 106
    invoke-virtual {v10, v15}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 107
    .line 108
    .line 109
    iget-object v15, v2, Lxx;->ζ:Ljava/lang/String;

    .line 110
    .line 111
    invoke-static {v15}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    move-result v15

    .line 115
    invoke-virtual {v10, v15}, Landroid/widget/TextView;->setTextColor(I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v10}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    .line 119
    .line 120
    .line 121
    move-result-object v15

    .line 122
    invoke-virtual {v10, v15, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 123
    .line 124
    .line 125
    new-instance v15, Landroid/widget/FrameLayout$LayoutParams;

    .line 126
    .line 127
    invoke-direct {v15, v13, v13}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 128
    .line 129
    .line 130
    invoke-static {v0, v11}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    iput v7, v15, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 135
    .line 136
    invoke-static {v0, v11}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 137
    .line 138
    .line 139
    move-result v7

    .line 140
    iput v7, v15, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 141
    .line 142
    iput v12, v15, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 143
    .line 144
    invoke-virtual {v9, v10, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 145
    .line 146
    .line 147
    new-instance v7, Landroid/widget/TextView;

    .line 148
    .line 149
    invoke-direct {v7, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 150
    .line 151
    .line 152
    const-string v10, "\u00d7"

    .line 153
    .line 154
    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 155
    .line 156
    .line 157
    const/high16 v10, 0x41c80000    # 25.0f

    .line 158
    .line 159
    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v7, v12}, Landroid/widget/TextView;->setGravity(I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v7, v14}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 166
    .line 167
    .line 168
    const-string v10, "\u5173\u95ed\u989c\u8272\u9009\u62e9\u5668"

    .line 169
    .line 170
    invoke-virtual {v7, v10}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 171
    .line 172
    .line 173
    const-string v10, "\u5173\u95ed"

    .line 174
    .line 175
    invoke-virtual {v7, v10}, Landroid/view/View;->setTooltipText(Ljava/lang/CharSequence;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v7, v5}, Landroid/view/View;->setClickable(Z)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v7, v5}, Landroid/view/View;->setFocusable(Z)V

    .line 182
    .line 183
    .line 184
    iget-object v10, v2, Lxx;->η:Ljava/lang/String;

    .line 185
    .line 186
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 187
    .line 188
    .line 189
    move-result v10

    .line 190
    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 191
    .line 192
    .line 193
    iget-object v10, v2, Lxx;->Α:Ljava/lang/String;

    .line 194
    .line 195
    const-string v11, "#00000000"

    .line 196
    .line 197
    const/16 v12, 0x16

    .line 198
    .line 199
    invoke-static {v12, v0, v10, v11}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 200
    .line 201
    .line 202
    move-result-object v10

    .line 203
    invoke-virtual {v7, v10}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 204
    .line 205
    .line 206
    new-instance v10, Lhi;

    .line 207
    .line 208
    const/4 v11, 0x0

    .line 209
    invoke-direct {v10, v11, v8}, Lhi;-><init>(ILjava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v7, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 213
    .line 214
    .line 215
    new-instance v8, Landroid/widget/FrameLayout$LayoutParams;

    .line 216
    .line 217
    const/16 v10, 0x2c

    .line 218
    .line 219
    invoke-static {v0, v10}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 220
    .line 221
    .line 222
    move-result v11

    .line 223
    invoke-static {v0, v10}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 224
    .line 225
    .line 226
    move-result v10

    .line 227
    invoke-direct {v8, v11, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 228
    .line 229
    .line 230
    const v10, 0x800013

    .line 231
    .line 232
    .line 233
    iput v10, v8, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 234
    .line 235
    const/4 v10, 0x6

    .line 236
    invoke-static {v0, v10}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 237
    .line 238
    .line 239
    move-result v10

    .line 240
    iput v10, v8, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 241
    .line 242
    invoke-virtual {v9, v7, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v1, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 246
    .line 247
    .line 248
    new-instance v7, Landroid/view/View;

    .line 249
    .line 250
    invoke-direct {v7, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 251
    .line 252
    .line 253
    iget-object v8, v2, Lxx;->δ:Ljava/lang/String;

    .line 254
    .line 255
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 256
    .line 257
    .line 258
    move-result v8

    .line 259
    invoke-virtual {v7, v8}, Landroid/view/View;->setBackgroundColor(I)V

    .line 260
    .line 261
    .line 262
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 263
    .line 264
    invoke-static {v0, v5}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 265
    .line 266
    .line 267
    move-result v9

    .line 268
    invoke-direct {v8, v13, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v7, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v1, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 278
    .line 279
    .line 280
    move-result-object v7

    .line 281
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 282
    .line 283
    .line 284
    move-result-object v7

    .line 285
    iget v7, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 286
    .line 287
    int-to-float v7, v7

    .line 288
    const v8, 0x3f333333    # 0.7f

    .line 289
    .line 290
    .line 291
    mul-float/2addr v7, v8

    .line 292
    invoke-static {v7}, Ljx0;->в(F)I

    .line 293
    .line 294
    .line 295
    move-result v7

    .line 296
    new-instance v8, Lcom/example/dyhelper/ui/ColorPickerDialog$MaxHeightScrollView;

    .line 297
    .line 298
    invoke-direct {v8, v0, v7}, Lcom/example/dyhelper/ui/ColorPickerDialog$MaxHeightScrollView;-><init>(Landroid/content/Context;I)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v8, v14}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v8, v5}, Landroid/view/View;->setOverScrollMode(I)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v8, v14}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 308
    .line 309
    .line 310
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    .line 311
    .line 312
    const/4 v9, -0x2

    .line 313
    invoke-direct {v7, v13, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v8, v4, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 317
    .line 318
    .line 319
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 320
    .line 321
    invoke-direct {v7, v13, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v1, v8, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 325
    .line 326
    .line 327
    new-instance v7, Lcom/example/dyhelper/ui/α;

    .line 328
    .line 329
    invoke-direct {v7, v4, v3}, Lcom/example/dyhelper/ui/α;-><init>(Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;I)V

    .line 330
    .line 331
    .line 332
    const-string v3, "\u91cd\u7f6e"

    .line 333
    .line 334
    invoke-static {v0, v3, v2, v14, v7}, Lcom/example/dyhelper/ui/μ;->γ(Landroid/content/Context;Ljava/lang/String;Lxx;ZLp70;)Landroid/widget/TextView;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    new-instance v7, Lcom/example/dyhelper/ui/β;

    .line 339
    .line 340
    const/4 v8, 0x0

    .line 341
    move-object/from16 v9, p4

    .line 342
    .line 343
    invoke-direct {v7, v4, v9, v6, v8}, Lcom/example/dyhelper/ui/β;-><init>(Landroid/view/ViewGroup;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 344
    .line 345
    .line 346
    const-string v8, "\u786e\u5b9a"

    .line 347
    .line 348
    invoke-static {v0, v8, v2, v5, v7}, Lcom/example/dyhelper/ui/μ;->γ(Landroid/content/Context;Ljava/lang/String;Lxx;ZLp70;)Landroid/widget/TextView;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    new-instance v7, Landroid/widget/LinearLayout;

    .line 353
    .line 354
    invoke-direct {v7, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v7, v14}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 358
    .line 359
    .line 360
    const/16 v8, 0xe

    .line 361
    .line 362
    invoke-static {v0, v8}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 363
    .line 364
    .line 365
    move-result v9

    .line 366
    const/16 v10, 0xa

    .line 367
    .line 368
    invoke-static {v0, v10}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 369
    .line 370
    .line 371
    move-result v10

    .line 372
    invoke-static {v0, v8}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 373
    .line 374
    .line 375
    move-result v11

    .line 376
    invoke-static {v0, v8}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 377
    .line 378
    .line 379
    move-result v8

    .line 380
    invoke-virtual {v7, v9, v10, v11, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 381
    .line 382
    .line 383
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 384
    .line 385
    const/16 v9, 0x2a

    .line 386
    .line 387
    invoke-static {v0, v9}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 388
    .line 389
    .line 390
    move-result v10

    .line 391
    const/high16 v11, 0x3f800000    # 1.0f

    .line 392
    .line 393
    invoke-direct {v8, v14, v10, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 394
    .line 395
    .line 396
    const/4 v10, 0x5

    .line 397
    invoke-static {v0, v10}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 398
    .line 399
    .line 400
    move-result v12

    .line 401
    iput v12, v8, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 402
    .line 403
    invoke-virtual {v7, v3, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 404
    .line 405
    .line 406
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 407
    .line 408
    invoke-static {v0, v9}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 409
    .line 410
    .line 411
    move-result v8

    .line 412
    invoke-direct {v3, v14, v8, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 413
    .line 414
    .line 415
    invoke-static {v0, v10}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 416
    .line 417
    .line 418
    move-result v8

    .line 419
    iput v8, v3, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 420
    .line 421
    invoke-virtual {v7, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v1, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 425
    .line 426
    .line 427
    new-instance v3, Landroid/app/AlertDialog$Builder;

    .line 428
    .line 429
    invoke-direct {v3, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v3, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    iput-object v1, v6, Lum1;->ε:Ljava/lang/Object;

    .line 444
    .line 445
    invoke-virtual {v1, v5}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 446
    .line 447
    .line 448
    new-instance v1, Lfi;

    .line 449
    .line 450
    const/4 v3, 0x0

    .line 451
    invoke-direct {v1, v2, v3}, Lfi;-><init>(Landroid/widget/TextView;I)V

    .line 452
    .line 453
    .line 454
    iput-object v1, v4, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->λ:Lfi;

    .line 455
    .line 456
    iget-boolean v2, v4, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->κ:Z

    .line 457
    .line 458
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    invoke-virtual {v1, v2}, Lfi;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    iget-object v1, v6, Lum1;->ε:Ljava/lang/Object;

    .line 466
    .line 467
    const/4 v2, 0x0

    .line 468
    const-string v3, "dialog"

    .line 469
    .line 470
    if-eqz v1, :cond_2

    .line 471
    .line 472
    check-cast v1, Landroid/app/AlertDialog;

    .line 473
    .line 474
    new-instance v4, Lgi;

    .line 475
    .line 476
    const/4 v5, 0x0

    .line 477
    invoke-direct {v4, v6, v0, v5}, Lgi;-><init>(Ljava/lang/Object;Landroid/content/Context;I)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v1, v4}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 481
    .line 482
    .line 483
    iget-object v0, v6, Lum1;->ε:Ljava/lang/Object;

    .line 484
    .line 485
    if-eqz v0, :cond_1

    .line 486
    .line 487
    check-cast v0, Landroid/app/AlertDialog;

    .line 488
    .line 489
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 490
    .line 491
    .line 492
    return-void

    .line 493
    :cond_1
    invoke-static {v3}, Lln0;->и(Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    throw v2

    .line 497
    :cond_2
    invoke-static {v3}, Lln0;->и(Ljava/lang/String;)V

    .line 498
    .line 499
    .line 500
    throw v2
.end method
