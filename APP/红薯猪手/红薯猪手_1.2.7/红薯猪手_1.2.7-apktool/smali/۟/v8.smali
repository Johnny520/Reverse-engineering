.class public final L۟/v8;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation


# static fields
.field public static final synthetic ۥ۟ۦ:I


# instance fields
.field public final ۥ:L۟/f3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u06df/f3<",
            "L\u06df/vb;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟:Z

.field public final ۥ۟۟:Z

.field public final ۥ۟۠:Z

.field public ۥ۟ۡ:F

.field public ۥ۟ۢ:F

.field public ۥۣ۟:I

.field public ۥ۟ۤ:I

.field public ۥ۟ۥ:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;L۟/f3;)V
    .locals 5

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x6

    .line 9
    new-array v2, v1, [B

    .line 10
    .line 11
    fill-array-data v2, :array_1

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    iput-object p2, p0, L۟/v8;->ۥ:L۟/f3;

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    const/high16 p2, 0x42200000    # 40.0f

    .line 24
    .line 25
    invoke-static {p1, p2}, L۟/c4;->ۥۣ۟(IF)F

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    float-to-int p2, p2

    .line 30
    div-int/lit8 v0, p2, 0x2

    .line 31
    .line 32
    sget v2, L۟/ya;->ۥ۠۟:I

    .line 33
    .line 34
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 35
    .line 36
    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 37
    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    .line 44
    .line 45
    .line 46
    int-to-float v0, v0

    .line 47
    invoke-virtual {v3, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 54
    .line 55
    .line 56
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 57
    .line 58
    invoke-direct {v0, p2, p2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 62
    .line 63
    .line 64
    new-instance v0, Landroid/widget/TextView;

    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-direct {v0, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 71
    .line 72
    .line 73
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 74
    .line 75
    const/4 v3, -0x2

    .line 76
    invoke-direct {v2, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 77
    .line 78
    .line 79
    const/16 v3, 0x11

    .line 80
    .line 81
    iput v3, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 82
    .line 83
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 84
    .line 85
    .line 86
    const/high16 v2, 0x41900000    # 18.0f

    .line 87
    .line 88
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 89
    .line 90
    .line 91
    const/4 v2, 0x3

    .line 92
    new-array v2, v2, [B

    .line 93
    .line 94
    fill-array-data v2, :array_2

    .line 95
    .line 96
    .line 97
    new-array v1, v1, [B

    .line 98
    .line 99
    fill-array-data v1, :array_3

    .line 100
    .line 101
    .line 102
    invoke-static {v2, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 107
    .line 108
    .line 109
    sget-object v1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 112
    .line 113
    .line 114
    const/high16 v1, -0x1000000

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 120
    .line 121
    .line 122
    new-instance v0, L۟/q1;

    .line 123
    .line 124
    const/4 v1, 0x7

    .line 125
    invoke-direct {v0, v1, p0}, L۟/q1;-><init>(ILjava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 144
    .line 145
    sub-int/2addr v0, p2

    .line 146
    int-to-float p2, v0

    .line 147
    invoke-virtual {p0, p2}, Landroid/view/View;->setX(F)V

    .line 148
    .line 149
    .line 150
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    const/high16 v0, 0x43480000    # 200.0f

    .line 159
    .line 160
    invoke-static {p1, v0, p2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 161
    .line 162
    .line 163
    move-result p2

    .line 164
    float-to-int p2, p2

    .line 165
    int-to-float p2, p2

    .line 166
    invoke-virtual {p0, p2}, Landroid/view/View;->setY(F)V

    .line 167
    .line 168
    .line 169
    const/16 p2, 0x1234

    .line 170
    .line 171
    invoke-virtual {p0, p2}, Landroid/view/View;->setId(I)V

    .line 172
    .line 173
    .line 174
    iput-boolean p1, p0, L۟/v8;->ۥ۟:Z

    .line 175
    .line 176
    iput-boolean p1, p0, L۟/v8;->ۥ۟۟:Z

    .line 177
    .line 178
    iput-boolean p1, p0, L۟/v8;->ۥ۟۠:Z

    .line 179
    .line 180
    return-void

    .line 181
    :array_0
    .array-data 1
        -0x35t
        -0x50t
        0x12t
        -0x78t
        -0x71t
        -0x5ft
        -0x22t
        -0x79t
    .end array-data

    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    :array_1
    .array-data 1
        -0x5at
        -0xdt
        0x7dt
        -0x1at
        -0x5t
        -0x3ct
    .end array-data

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    nop

    .line 197
    :array_2
    .array-data 1
        0x5t
        0x7et
        0x77t
    .end array-data

    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    :array_3
    .array-data 1
        -0x1et
        -0xet
        -0x23t
        0x3et
        -0x20t
        -0x29t
    .end array-data
.end method


# virtual methods
.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    const/4 v0, 0x5

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    const/4 p1, 0x1

    return p1

    :array_0
    .array-data 1
        -0x60t
        -0x15t
        0x4bt
        0x4ft
        -0x53t
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x3bt
        -0x63t
        0x2et
        0x21t
        -0x27t
        0x0t
    .end array-data
.end method

.method public final getClickCallback()L۟/f3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "L\u06df/f3<",
            "L\u06df/vb;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, L۟/v8;->ۥ:L۟/f3;

    return-object v0
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 11
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    const/4 v2, 0x6

    new-array v2, v2, [B

    fill-array-data v2, :array_1

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    iget-boolean v1, p0, L۟/v8;->ۥ۟۠:Z

    if-eqz v1, :cond_9

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_7

    const/4 v6, 0x0

    if-eq v3, v5, :cond_5

    if-eq v3, v0, :cond_0

    goto/16 :goto_4

    :cond_0
    cmpl-float v0, v1, v6

    if-ltz v0, :cond_9

    iget v0, p0, L۟/v8;->ۥۣ۟:I

    int-to-float v0, v0

    cmpg-float v0, v1, v0

    if-gtz v0, :cond_9

    iget v0, p0, L۟/v8;->ۥ۟ۥ:I

    int-to-float v3, v0

    cmpl-float v3, v2, v3

    if-ltz v3, :cond_9

    iget v3, p0, L۟/v8;->ۥ۟ۤ:I

    add-int/2addr v3, v0

    int-to-float v0, v3

    cmpg-float v0, v2, v0

    if-gtz v0, :cond_9

    iget v0, p0, L۟/v8;->ۥ۟ۡ:F

    sub-float v0, v1, v0

    iget v3, p0, L۟/v8;->ۥ۟ۢ:F

    sub-float v3, v2, v3

    iget-boolean v7, p0, L۟/v8;->ۥ۟:Z

    if-nez v7, :cond_2

    mul-float v7, v0, v0

    mul-float v8, v3, v3

    add-float/2addr v8, v7

    float-to-double v7, v8

    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v7

    const-wide/high16 v9, 0x4000000000000000L    # 2.0

    cmpl-double v7, v7, v9

    if-ltz v7, :cond_1

    move v4, v5

    :cond_1
    iput-boolean v4, p0, L۟/v8;->ۥ۟:Z

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getX()F

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getY()F

    move-result v5

    add-float/2addr v4, v0

    add-float/2addr v5, v3

    iget v0, p0, L۟/v8;->ۥۣ۟:I

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    sub-int/2addr v0, v3

    int-to-float v0, v0

    iget v3, p0, L۟/v8;->ۥ۟ۤ:I

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v7

    sub-int/2addr v3, v7

    int-to-float v3, v3

    cmpg-float v7, v4, v6

    if-gez v7, :cond_3

    move v0, v6

    goto :goto_0

    :cond_3
    invoke-static {v4, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    :goto_0
    cmpg-float v4, v5, v6

    if-gez v4, :cond_4

    goto :goto_1

    :cond_4
    invoke-static {v5, v3}, Ljava/lang/Math;->min(FF)F

    move-result v6

    :goto_1
    invoke-virtual {p0, v0}, Landroid/view/View;->setX(F)V

    invoke-virtual {p0, v6}, Landroid/view/View;->setY(F)V

    iput v1, p0, L۟/v8;->ۥ۟ۡ:F

    iput v2, p0, L۟/v8;->ۥ۟ۢ:F

    goto :goto_4

    :cond_5
    iget-boolean v0, p0, L۟/v8;->ۥ۟۟:Z

    if-eqz v0, :cond_9

    iget-boolean v0, p0, L۟/v8;->ۥ۟:Z

    if-eqz v0, :cond_9

    iget v0, p0, L۟/v8;->ۥۣ۟:I

    shr-int/lit8 v1, v0, 0x1

    int-to-float v1, v1

    iget v2, p0, L۟/v8;->ۥ۟ۡ:F

    cmpg-float v1, v2, v1

    const-wide/16 v2, 0x1f4

    if-gtz v1, :cond_6

    iput v6, p0, L۟/v8;->ۥ۟ۡ:F

    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Landroid/view/animation/BounceInterpolator;

    invoke-direct {v1}, Landroid/view/animation/BounceInterpolator;-><init>()V

    goto :goto_2

    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iput v0, p0, L۟/v8;->ۥ۟ۡ:F

    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Landroid/view/animation/BounceInterpolator;

    invoke-direct {v1}, Landroid/view/animation/BounceInterpolator;-><init>()V

    :goto_2
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    iget v1, p0, L۟/v8;->ۥ۟ۡ:F

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->x(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    goto :goto_4

    :cond_7
    iput-boolean v4, p0, L۟/v8;->ۥ۟:Z

    iput v1, p0, L۟/v8;->ۥ۟ۡ:F

    iput v2, p0, L۟/v8;->ۥ۟ۢ:F

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v2, v1, Landroid/view/ViewGroup;

    if-eqz v2, :cond_8

    check-cast v1, Landroid/view/ViewGroup;

    goto :goto_3

    :cond_8
    const/4 v1, 0x0

    :goto_3
    if-eqz v1, :cond_9

    new-array v0, v0, [I

    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    iput v2, p0, L۟/v8;->ۥ۟ۤ:I

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    iput v1, p0, L۟/v8;->ۥۣ۟:I

    aget v0, v0, v5

    iput v0, p0, L۟/v8;->ۥ۟ۥ:I

    :cond_9
    :goto_4
    iget-boolean v0, p0, L۟/v8;->ۥ۟:Z

    if-eqz v0, :cond_a

    goto :goto_5

    :cond_a
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    :goto_5
    return v0

    :array_0
    .array-data 1
        -0x13t
        -0x1et
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x78t
        -0x6ct
        -0x7t
        0x32t
        0x9t
        0x60t
    .end array-data
.end method
