.class public final Lk9/r;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lk9/r;

.field public static final b:Landroid/os/Handler;

.field public static c:Landroid/content/SharedPreferences;

.field public static volatile d:Z

.field public static volatile e:Z

.field public static volatile f:Z

.field public static g:Ljava/lang/ref/WeakReference;

.field public static h:Ljava/lang/ref/WeakReference;

.field public static i:Ljava/lang/ref/WeakReference;

.field public static j:Ljava/lang/ref/WeakReference;

.field public static final k:Lk9/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lk9/r;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lk9/r;->a:Lk9/r;

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
    sput-object v0, Lk9/r;->b:Landroid/os/Handler;

    .line 18
    .line 19
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lk9/r;->g:Ljava/lang/ref/WeakReference;

    .line 26
    .line 27
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lk9/r;->h:Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lk9/r;->i:Ljava/lang/ref/WeakReference;

    .line 40
    .line 41
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 42
    .line 43
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    sput-object v0, Lk9/r;->j:Ljava/lang/ref/WeakReference;

    .line 47
    .line 48
    new-instance v0, Lk9/k;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lk9/r;->k:Lk9/k;

    .line 54
    .line 55
    return-void
.end method

.method public static a(Landroid/content/Context;Z[I)Landroid/graphics/drawable/RippleDrawable;
    .locals 7

    .line 1
    const v0, -0xa000001

    .line 2
    .line 3
    .line 4
    const v1, -0xdc7c4c0

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz p1, :cond_3

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-static {p0}, Lk9/r;->g(Landroid/content/Context;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    move v0, v1

    .line 22
    :cond_1
    sget-object p2, Lk9/r;->c:Landroid/content/SharedPreferences;

    .line 23
    .line 24
    if-eqz p2, :cond_2

    .line 25
    .line 26
    const-string v1, "action_color"

    .line 27
    .line 28
    const-string v5, ""

    .line 29
    .line 30
    invoke-interface {p2, v1, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    goto :goto_0

    .line 35
    :cond_2
    move-object p2, v2

    .line 36
    :goto_0
    invoke-static {v0, p2}, Lk9/r;->k(ILjava/lang/String;)[I

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    goto :goto_1

    .line 41
    :cond_3
    invoke-static {p0}, Lk9/r;->g(Landroid/content/Context;)Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-eqz p2, :cond_4

    .line 46
    .line 47
    new-array p2, v4, [I

    .line 48
    .line 49
    aput v1, p2, v3

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_4
    new-array p2, v4, [I

    .line 53
    .line 54
    aput v0, p2, v3

    .line 55
    .line 56
    :goto_1
    invoke-static {p2}, Lk9/r;->o([I)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    sget-object v1, Landroid/graphics/drawable/GradientDrawable$Orientation;->LEFT_RIGHT:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 61
    .line 62
    array-length v5, p2

    .line 63
    if-le v5, v4, :cond_5

    .line 64
    .line 65
    move v5, v4

    .line 66
    goto :goto_2

    .line 67
    :cond_5
    move v5, v3

    .line 68
    :goto_2
    if-eqz v5, :cond_6

    .line 69
    .line 70
    move-object v5, p2

    .line 71
    goto :goto_3

    .line 72
    :cond_6
    move-object v5, v2

    .line 73
    :goto_3
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    .line 74
    .line 75
    invoke-direct {v6, v1, v5}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 76
    .line 77
    .line 78
    if-eqz p1, :cond_7

    .line 79
    .line 80
    invoke-virtual {v6, v4}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 81
    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_7
    const/16 v1, 0xe

    .line 85
    .line 86
    invoke-static {p0, v1}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    int-to-float v1, v1

    .line 91
    invoke-virtual {v6, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 92
    .line 93
    .line 94
    :goto_4
    array-length v1, p2

    .line 95
    if-ne v1, v4, :cond_8

    .line 96
    .line 97
    aget p2, p2, v3

    .line 98
    .line 99
    invoke-virtual {v6, p2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 100
    .line 101
    .line 102
    :cond_8
    invoke-static {p0, v4}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    invoke-static {v0}, Lk9/r;->h(I)Z

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    if-eqz p2, :cond_9

    .line 111
    .line 112
    const/high16 p2, 0x16000000

    .line 113
    .line 114
    goto :goto_5

    .line 115
    :cond_9
    const p2, 0x24ffffff

    .line 116
    .line 117
    .line 118
    :goto_5
    invoke-virtual {v6, p0, p2}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 119
    .line 120
    .line 121
    if-eqz p1, :cond_a

    .line 122
    .line 123
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    .line 124
    .line 125
    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v4}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 129
    .line 130
    .line 131
    const/4 p0, -0x1

    .line 132
    invoke-virtual {v2, p0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 133
    .line 134
    .line 135
    :cond_a
    new-instance p0, Landroid/graphics/drawable/RippleDrawable;

    .line 136
    .line 137
    invoke-static {v0}, Lk9/r;->h(I)Z

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-eqz p1, :cond_b

    .line 142
    .line 143
    const/high16 p1, 0x18000000

    .line 144
    .line 145
    goto :goto_6

    .line 146
    :cond_b
    const p1, 0x28ffffff

    .line 147
    .line 148
    .line 149
    :goto_6
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-direct {p0, p1, v6, v2}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 154
    .line 155
    .line 156
    return-object p0
.end method

.method public static b(Landroid/content/Context;Landroid/widget/FrameLayout$LayoutParams;IIII)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-lez p2, :cond_5

    .line 3
    .line 4
    if-lez p3, :cond_5

    .line 5
    .line 6
    if-lez p4, :cond_5

    .line 7
    .line 8
    if-gtz p5, :cond_0

    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_0
    const/16 v1, 0x8

    .line 12
    .line 13
    invoke-static {p0, v1}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    sub-int/2addr p2, p4

    .line 18
    mul-int/lit8 p4, p0, 0x2

    .line 19
    .line 20
    sub-int/2addr p2, p4

    .line 21
    if-gez p2, :cond_1

    .line 22
    .line 23
    move p2, v0

    .line 24
    :cond_1
    sub-int/2addr p3, p5

    .line 25
    sub-int/2addr p3, p4

    .line 26
    if-gez p3, :cond_2

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    move v0, p3

    .line 30
    :goto_0
    sget-object p3, Lk9/r;->c:Landroid/content/SharedPreferences;

    .line 31
    .line 32
    const/4 p4, 0x0

    .line 33
    const/high16 p5, 0x3f800000    # 1.0f

    .line 34
    .line 35
    if-eqz p3, :cond_3

    .line 36
    .line 37
    const-string v1, "position_x"

    .line 38
    .line 39
    invoke-interface {p3, v1, p5}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 40
    .line 41
    .line 42
    move-result p3

    .line 43
    invoke-static {p3, p4, p5}, Lr9/e0;->q(FFF)F

    .line 44
    .line 45
    .line 46
    move-result p3

    .line 47
    goto :goto_1

    .line 48
    :cond_3
    move p3, p5

    .line 49
    :goto_1
    sget-object v1, Lk9/r;->c:Landroid/content/SharedPreferences;

    .line 50
    .line 51
    const v2, 0x3eeb851f    # 0.46f

    .line 52
    .line 53
    .line 54
    if-eqz v1, :cond_4

    .line 55
    .line 56
    const-string v3, "position_y"

    .line 57
    .line 58
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-static {v1, p4, p5}, Lr9/e0;->q(FFF)F

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    :cond_4
    int-to-float p2, p2

    .line 67
    mul-float/2addr p2, p3

    .line 68
    float-to-int p2, p2

    .line 69
    add-int/2addr p2, p0

    .line 70
    iput p2, p1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 71
    .line 72
    int-to-float p2, v0

    .line 73
    mul-float/2addr p2, v2

    .line 74
    float-to-int p2, p2

    .line 75
    add-int/2addr p0, p2

    .line 76
    iput p0, p1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 77
    .line 78
    const/4 p0, 0x1

    .line 79
    return p0

    .line 80
    :cond_5
    :goto_2
    return v0
.end method

.method public static c(Landroid/app/Activity;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-boolean v1, Lk9/r;->d:Z

    .line 4
    .line 5
    if-eqz v1, :cond_15

    .line 6
    .line 7
    invoke-static {v0}, Lk9/r;->q(Landroid/app/Activity;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_c

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-object v1, v2

    .line 28
    :goto_0
    instance-of v3, v1, Landroid/view/ViewGroup;

    .line 29
    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    check-cast v1, Landroid/view/ViewGroup;

    .line 33
    .line 34
    move-object v12, v1

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    move-object v12, v2

    .line 37
    :goto_1
    if-eqz v12, :cond_15

    .line 38
    .line 39
    sget-object v1, Lk9/r;->h:Ljava/lang/ref/WeakReference;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Landroid/view/View;

    .line 46
    .line 47
    sget-object v3, Lk9/r;->g:Ljava/lang/ref/WeakReference;

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    if-ne v3, v0, :cond_4

    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    goto :goto_2

    .line 62
    :cond_3
    move-object v3, v2

    .line 63
    :goto_2
    if-ne v3, v12, :cond_4

    .line 64
    .line 65
    invoke-virtual {v1}, Landroid/view/View;->bringToFront()V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_4
    invoke-static {v2}, Lk9/r;->e(Landroid/app/Activity;)V

    .line 70
    .line 71
    .line 72
    sget-object v1, Lk9/r;->c:Landroid/content/SharedPreferences;

    .line 73
    .line 74
    const/16 v13, 0x40

    .line 75
    .line 76
    const/16 v14, 0x24

    .line 77
    .line 78
    const-string v15, "bubble_size"

    .line 79
    .line 80
    const/16 v3, 0x2c

    .line 81
    .line 82
    if-eqz v1, :cond_5

    .line 83
    .line 84
    invoke-interface {v1, v15, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    invoke-static {v1, v14, v13}, Lr9/e0;->r(III)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    goto :goto_3

    .line 93
    :cond_5
    move v1, v3

    .line 94
    :goto_3
    sget-object v4, Lk9/r;->c:Landroid/content/SharedPreferences;

    .line 95
    .line 96
    if-eqz v4, :cond_6

    .line 97
    .line 98
    const-string v5, "bubble_color"

    .line 99
    .line 100
    const-string v6, "#FFFFFF"

    .line 101
    .line 102
    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    goto :goto_4

    .line 107
    :cond_6
    move-object v4, v2

    .line 108
    :goto_4
    const/4 v5, -0x1

    .line 109
    invoke-static {v5, v4}, Lk9/r;->k(ILjava/lang/String;)[I

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-static {v4}, Lk9/r;->o([I)I

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    new-instance v7, Landroid/widget/FrameLayout;

    .line 118
    .line 119
    invoke-direct {v7, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 120
    .line 121
    .line 122
    const-string v8, "Hchat:FloatingShortcut:Bubble"

    .line 123
    .line 124
    invoke-virtual {v7, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    const-string v8, "\u5c55\u5f00\u6216\u6536\u8d77\u60ac\u6d6e\u5feb\u6377\u83dc\u5355"

    .line 128
    .line 129
    invoke-virtual {v7, v8}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 130
    .line 131
    .line 132
    const/4 v8, 0x1

    .line 133
    invoke-virtual {v7, v8}, Landroid/view/View;->setClickable(Z)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v7, v8}, Landroid/view/View;->setFocusable(Z)V

    .line 137
    .line 138
    .line 139
    const/16 v9, 0x8

    .line 140
    .line 141
    invoke-static {v0, v9}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 142
    .line 143
    .line 144
    move-result v9

    .line 145
    int-to-float v9, v9

    .line 146
    invoke-virtual {v7, v9}, Landroid/view/View;->setElevation(F)V

    .line 147
    .line 148
    .line 149
    invoke-static {v4}, Lk9/r;->o([I)I

    .line 150
    .line 151
    .line 152
    move-result v9

    .line 153
    sget-object v10, Landroid/graphics/drawable/GradientDrawable$Orientation;->LEFT_RIGHT:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 154
    .line 155
    array-length v11, v4

    .line 156
    if-le v11, v8, :cond_7

    .line 157
    .line 158
    move-object v11, v4

    .line 159
    goto :goto_5

    .line 160
    :cond_7
    move-object v11, v2

    .line 161
    :goto_5
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 162
    .line 163
    invoke-direct {v3, v10, v11}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3, v8}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 167
    .line 168
    .line 169
    array-length v10, v4

    .line 170
    if-ne v10, v8, :cond_8

    .line 171
    .line 172
    const/4 v10, 0x0

    .line 173
    aget v4, v4, v10

    .line 174
    .line 175
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 176
    .line 177
    .line 178
    :cond_8
    invoke-static {v0, v8}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    invoke-static {v9}, Lk9/r;->h(I)Z

    .line 183
    .line 184
    .line 185
    move-result v9

    .line 186
    const v10, 0x28ffffff

    .line 187
    .line 188
    .line 189
    const/high16 v11, 0x18000000

    .line 190
    .line 191
    if-eqz v9, :cond_9

    .line 192
    .line 193
    move v9, v11

    .line 194
    goto :goto_6

    .line 195
    :cond_9
    move v9, v10

    .line 196
    :goto_6
    invoke-virtual {v3, v4, v9}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v7, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 200
    .line 201
    .line 202
    invoke-static {v6}, Lk9/r;->h(I)Z

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    if-eqz v3, :cond_a

    .line 207
    .line 208
    move v10, v11

    .line 209
    :cond_a
    invoke-static {v10}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    .line 214
    .line 215
    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v4, v8}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v4, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 222
    .line 223
    .line 224
    new-instance v9, Landroid/graphics/drawable/RippleDrawable;

    .line 225
    .line 226
    invoke-direct {v9, v3, v2, v4}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v7, v9}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v7, v8}, Landroid/view/View;->setClipToOutline(Z)V

    .line 233
    .line 234
    .line 235
    new-instance v3, Landroid/widget/ImageView;

    .line 236
    .line 237
    invoke-direct {v3, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 238
    .line 239
    .line 240
    sget-object v4, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    .line 241
    .line 242
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v3, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v3}, Landroid/widget/ImageView;->clearColorFilter()V

    .line 252
    .line 253
    .line 254
    int-to-float v1, v1

    .line 255
    const v4, 0x3e23d70a    # 0.16f

    .line 256
    .line 257
    .line 258
    mul-float/2addr v1, v4

    .line 259
    float-to-int v1, v1

    .line 260
    const/4 v4, 0x5

    .line 261
    if-ge v1, v4, :cond_b

    .line 262
    .line 263
    move v1, v4

    .line 264
    :cond_b
    invoke-static {v0, v1}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    invoke-virtual {v3, v1, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 269
    .line 270
    .line 271
    invoke-static {v6}, Lk9/r;->h(I)Z

    .line 272
    .line 273
    .line 274
    move-result v1

    .line 275
    if-eqz v1, :cond_c

    .line 276
    .line 277
    const v1, -0xdfdedc

    .line 278
    .line 279
    .line 280
    goto :goto_7

    .line 281
    :cond_c
    move v1, v5

    .line 282
    :goto_7
    sget-object v4, Lk9/r;->c:Landroid/content/SharedPreferences;

    .line 283
    .line 284
    const-string v6, ""

    .line 285
    .line 286
    if-eqz v4, :cond_d

    .line 287
    .line 288
    const-string v8, "bubble_icon"

    .line 289
    .line 290
    invoke-interface {v4, v8, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    goto :goto_8

    .line 295
    :cond_d
    move-object v4, v2

    .line 296
    :goto_8
    if-nez v4, :cond_e

    .line 297
    .line 298
    move-object v4, v6

    .line 299
    :cond_e
    sget-object v8, Lk9/r;->c:Landroid/content/SharedPreferences;

    .line 300
    .line 301
    if-eqz v8, :cond_f

    .line 302
    .line 303
    const-string v2, "bubble_dark_icon"

    .line 304
    .line 305
    invoke-interface {v8, v2, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    :cond_f
    if-nez v2, :cond_10

    .line 310
    .line 311
    goto :goto_9

    .line 312
    :cond_10
    move-object v6, v2

    .line 313
    :goto_9
    invoke-static {v0}, Lk9/r;->g(Landroid/content/Context;)Z

    .line 314
    .line 315
    .line 316
    move-result v2

    .line 317
    if-eqz v2, :cond_11

    .line 318
    .line 319
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    if-nez v2, :cond_11

    .line 324
    .line 325
    move-object v4, v6

    .line 326
    :cond_11
    invoke-static {v0, v4}, Lk9/r;->i(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/BitmapDrawable;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    if-eqz v2, :cond_12

    .line 331
    .line 332
    goto :goto_a

    .line 333
    :cond_12
    new-instance v2, Lk9/d;

    .line 334
    .line 335
    sget-object v4, Lk9/c;->g:Lk9/c;

    .line 336
    .line 337
    invoke-direct {v2, v4, v1}, Lk9/d;-><init>(Lk9/c;I)V

    .line 338
    .line 339
    .line 340
    :goto_a
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 341
    .line 342
    .line 343
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 344
    .line 345
    const/16 v2, 0x11

    .line 346
    .line 347
    invoke-direct {v1, v5, v5, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v7, v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 351
    .line 352
    .line 353
    new-instance v1, Lk9/l;

    .line 354
    .line 355
    const/4 v2, 0x0

    .line 356
    invoke-direct {v1, v0, v12, v7, v2}, Lk9/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v7, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    invoke-static {v1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 371
    .line 372
    .line 373
    move-result v11

    .line 374
    new-instance v4, Lgg/r;

    .line 375
    .line 376
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 377
    .line 378
    .line 379
    new-instance v5, Lgg/r;

    .line 380
    .line 381
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 382
    .line 383
    .line 384
    new-instance v6, Lgg/s;

    .line 385
    .line 386
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 387
    .line 388
    .line 389
    move-object v1, v7

    .line 390
    new-instance v7, Lgg/s;

    .line 391
    .line 392
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 393
    .line 394
    .line 395
    new-instance v8, Lgg/s;

    .line 396
    .line 397
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 398
    .line 399
    .line 400
    new-instance v9, Lgg/s;

    .line 401
    .line 402
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 403
    .line 404
    .line 405
    new-instance v10, Lgg/q;

    .line 406
    .line 407
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 408
    .line 409
    .line 410
    new-instance v3, Lk9/m;

    .line 411
    .line 412
    move-object v2, v1

    .line 413
    const/16 v1, 0x2c

    .line 414
    .line 415
    invoke-direct/range {v3 .. v12}, Lk9/m;-><init>(Lgg/r;Lgg/r;Lgg/s;Lgg/s;Lgg/s;Lgg/s;Lgg/q;ILandroid/view/ViewGroup;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 419
    .line 420
    .line 421
    sget-object v3, Lk9/r;->c:Landroid/content/SharedPreferences;

    .line 422
    .line 423
    if-eqz v3, :cond_13

    .line 424
    .line 425
    invoke-interface {v3, v15, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 426
    .line 427
    .line 428
    move-result v1

    .line 429
    invoke-static {v1, v14, v13}, Lr9/e0;->r(III)I

    .line 430
    .line 431
    .line 432
    move-result v3

    .line 433
    goto :goto_b

    .line 434
    :cond_13
    move v3, v1

    .line 435
    :goto_b
    invoke-static {v0, v3}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 436
    .line 437
    .line 438
    move-result v4

    .line 439
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 440
    .line 441
    const v3, 0x800033

    .line 442
    .line 443
    .line 444
    invoke-direct {v1, v4, v4, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 445
    .line 446
    .line 447
    move-object v3, v2

    .line 448
    invoke-virtual {v12}, Landroid/view/View;->getWidth()I

    .line 449
    .line 450
    .line 451
    move-result v2

    .line 452
    move-object v5, v3

    .line 453
    invoke-virtual {v12}, Landroid/view/View;->getHeight()I

    .line 454
    .line 455
    .line 456
    move-result v3

    .line 457
    move-object v6, v5

    .line 458
    move v5, v4

    .line 459
    invoke-static/range {v0 .. v5}, Lk9/r;->b(Landroid/content/Context;Landroid/widget/FrameLayout$LayoutParams;IIII)Z

    .line 460
    .line 461
    .line 462
    move-result v2

    .line 463
    if-nez v2, :cond_14

    .line 464
    .line 465
    const/4 v2, 0x4

    .line 466
    invoke-virtual {v6, v2}, Landroid/view/View;->setVisibility(I)V

    .line 467
    .line 468
    .line 469
    :cond_14
    invoke-virtual {v12, v6, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 470
    .line 471
    .line 472
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 473
    .line 474
    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    sput-object v1, Lk9/r;->g:Ljava/lang/ref/WeakReference;

    .line 478
    .line 479
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 480
    .line 481
    invoke-direct {v0, v6}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    sput-object v0, Lk9/r;->h:Ljava/lang/ref/WeakReference;

    .line 485
    .line 486
    new-instance v0, La1/d;

    .line 487
    .line 488
    const/16 v1, 0x17

    .line 489
    .line 490
    invoke-direct {v0, v6, v1, v12}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v6, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 494
    .line 495
    .line 496
    :cond_15
    :goto_c
    return-void
.end method

.method public static d(Z)V
    .locals 4

    .line 1
    sget-object v0, Lk9/r;->j:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/view/View;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v2, v1

    .line 18
    :goto_0
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 19
    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    check-cast v2, Landroid/view/ViewGroup;

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move-object v2, v1

    .line 26
    :goto_1
    if-eqz v2, :cond_2

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 29
    .line 30
    .line 31
    :cond_2
    sget-object v0, Lk9/r;->j:Ljava/lang/ref/WeakReference;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->clear()V

    .line 34
    .line 35
    .line 36
    sget-object v0, Lk9/r;->i:Ljava/lang/ref/WeakReference;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Landroid/view/View;

    .line 43
    .line 44
    if-eqz v0, :cond_7

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 51
    .line 52
    if-eqz v3, :cond_3

    .line 53
    .line 54
    move-object v1, v2

    .line 55
    check-cast v1, Landroid/view/ViewGroup;

    .line 56
    .line 57
    :cond_3
    if-eqz p0, :cond_5

    .line 58
    .line 59
    if-eqz v1, :cond_5

    .line 60
    .line 61
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_4

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_4
    const/4 p0, 0x0

    .line 69
    invoke-virtual {v0, p0}, Landroid/view/View;->setClickable(Z)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    const/4 v1, 0x0

    .line 84
    invoke-virtual {p0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    const v1, 0x3f6147ae    # 0.88f

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, v1}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {p0, v1}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    const/16 v2, 0x8

    .line 107
    .line 108
    invoke-static {v1, v2}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    int-to-float v1, v1

    .line 113
    invoke-virtual {p0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    const-wide/16 v1, 0x8c

    .line 118
    .line 119
    invoke-virtual {p0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    new-instance v1, Lg3/g;

    .line 124
    .line 125
    const/4 v2, 0x1

    .line 126
    invoke-direct {v1, v0, v2}, Lg3/g;-><init>(Landroid/view/View;I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_5
    :goto_2
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 142
    .line 143
    .line 144
    if-eqz v1, :cond_6

    .line 145
    .line 146
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 147
    .line 148
    .line 149
    :cond_6
    sget-object p0, Lk9/r;->i:Ljava/lang/ref/WeakReference;

    .line 150
    .line 151
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    if-ne p0, v0, :cond_7

    .line 156
    .line 157
    sget-object p0, Lk9/r;->i:Ljava/lang/ref/WeakReference;

    .line 158
    .line 159
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->clear()V

    .line 160
    .line 161
    .line 162
    :cond_7
    return-void
.end method

.method public static e(Landroid/app/Activity;)V
    .locals 3

    .line 1
    sget-object v0, Lk9/r;->g:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/app/Activity;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    if-eq v0, p0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    invoke-static {p0}, Lk9/r;->d(Z)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lk9/r;->h:Ljava/lang/ref/WeakReference;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Landroid/view/View;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object v1, v0

    .line 35
    :goto_0
    instance-of v2, v1, Landroid/view/ViewGroup;

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    move-object v0, v1

    .line 40
    check-cast v0, Landroid/view/ViewGroup;

    .line 41
    .line 42
    :cond_2
    if-eqz v0, :cond_3

    .line 43
    .line 44
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 45
    .line 46
    .line 47
    :cond_3
    sget-object p0, Lk9/r;->h:Ljava/lang/ref/WeakReference;

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->clear()V

    .line 50
    .line 51
    .line 52
    sget-object p0, Lk9/r;->g:Ljava/lang/ref/WeakReference;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->clear()V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public static f(Landroid/content/Context;I)I
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

.method public static g(Landroid/content/Context;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 10
    .line 11
    and-int/lit8 p0, p0, 0x30

    .line 12
    .line 13
    const/16 v0, 0x20

    .line 14
    .line 15
    if-ne p0, v0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public static h(I)Z
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit16 v0, v0, 0x12b

    .line 6
    .line 7
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    mul-int/lit16 v1, v1, 0x24b

    .line 12
    .line 13
    add-int/2addr v1, v0

    .line 14
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    mul-int/lit8 p0, p0, 0x72

    .line 19
    .line 20
    add-int/2addr p0, v1

    .line 21
    div-int/lit16 p0, p0, 0x3e8

    .line 22
    .line 23
    const/16 v0, 0xa0

    .line 24
    .line 25
    if-lt p0, v0, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return p0
.end method

.method public static i(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/BitmapDrawable;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p1, v0

    .line 12
    :goto_0
    if-eqz p1, :cond_3

    .line 13
    .line 14
    new-instance v1, Ljava/io/File;

    .line 15
    .line 16
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_1
    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 31
    .line 32
    .line 33
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    goto :goto_1

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    new-instance v1, Lsf/f;

    .line 37
    .line 38
    invoke-direct {v1, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    move-object p1, v1

    .line 42
    :goto_1
    nop

    .line 43
    instance-of v1, p1, Lsf/f;

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    move-object p1, v0

    .line 48
    :cond_2
    check-cast p1, Landroid/graphics/Bitmap;

    .line 49
    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 53
    .line 54
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-direct {v0, p0, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    :goto_2
    return-object v0
.end method

.method public static j(ILjava/lang/String;)I
    .locals 2

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_3

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-lez v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    const/4 v1, 0x0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move-object p1, v1

    .line 27
    :goto_1
    if-eqz p1, :cond_3

    .line 28
    .line 29
    :try_start_0
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    goto :goto_2

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    new-instance v0, Lsf/f;

    .line 40
    .line 41
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    move-object p1, v0

    .line 45
    :goto_2
    nop

    .line 46
    instance-of v0, p1, Lsf/f;

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_2
    move-object v1, p1

    .line 52
    :goto_3
    check-cast v1, Ljava/lang/Integer;

    .line 53
    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    :cond_3
    return p0
.end method

.method public static k(ILjava/lang/String;)[I
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string p1, ""

    .line 4
    .line 5
    :cond_0
    const/4 v0, 0x1

    .line 6
    new-array v1, v0, [C

    .line 7
    .line 8
    const/16 v2, 0x2c

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    aput-char v2, v1, v3

    .line 12
    .line 13
    const/4 v2, 0x6

    .line 14
    invoke-static {p1, v1, v2}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const/4 v1, 0x2

    .line 19
    invoke-static {v1, p1}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {v3, p1}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {p0, v1}, Lk9/r;->j(ILjava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    invoke-static {v0, p1}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Ljava/lang/String;

    .line 38
    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    invoke-static {p0, p1}, Lk9/r;->j(ILjava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const/4 p1, 0x0

    .line 51
    :goto_0
    if-eqz p1, :cond_2

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eq v0, p0, :cond_2

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    filled-new-array {p0, p1}, [I

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    :cond_2
    filled-new-array {p0}, [I

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
.end method

.method public static l(Landroid/view/View;Landroid/view/ViewGroup;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-eqz v0, :cond_5

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const/16 v2, 0x8

    .line 23
    .line 24
    invoke-static {v1, v2}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    sub-int/2addr v2, v3

    .line 37
    mul-int/lit8 v3, v1, 0x2

    .line 38
    .line 39
    sub-int/2addr v2, v3

    .line 40
    const/4 v4, 0x0

    .line 41
    if-gez v2, :cond_1

    .line 42
    .line 43
    move v2, v4

    .line 44
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    sub-int/2addr p1, v5

    .line 53
    sub-int/2addr p1, v3

    .line 54
    if-gez p1, :cond_2

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    move v4, p1

    .line 58
    :goto_1
    iget p1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 59
    .line 60
    add-int v3, v1, v2

    .line 61
    .line 62
    invoke-static {p1, v1, v3}, Lr9/e0;->r(III)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 67
    .line 68
    iget p1, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 69
    .line 70
    add-int v3, v1, v4

    .line 71
    .line 72
    invoke-static {p1, v1, v3}, Lr9/e0;->r(III)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 77
    .line 78
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 79
    .line 80
    .line 81
    sget-object p0, Lk9/r;->c:Landroid/content/SharedPreferences;

    .line 82
    .line 83
    if-eqz p0, :cond_5

    .line 84
    .line 85
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    if-eqz p0, :cond_5

    .line 90
    .line 91
    const/4 p1, 0x0

    .line 92
    if-nez v2, :cond_3

    .line 93
    .line 94
    move v3, p1

    .line 95
    goto :goto_2

    .line 96
    :cond_3
    iget v3, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 97
    .line 98
    sub-int/2addr v3, v1

    .line 99
    int-to-float v3, v3

    .line 100
    int-to-float v2, v2

    .line 101
    div-float/2addr v3, v2

    .line 102
    :goto_2
    const-string v2, "position_x"

    .line 103
    .line 104
    invoke-interface {p0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    if-eqz p0, :cond_5

    .line 109
    .line 110
    if-nez v4, :cond_4

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_4
    iget p1, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 114
    .line 115
    sub-int/2addr p1, v1

    .line 116
    int-to-float p1, p1

    .line 117
    int-to-float v0, v4

    .line 118
    div-float/2addr p1, v0

    .line 119
    :goto_3
    const-string v0, "position_y"

    .line 120
    .line 121
    invoke-interface {p0, v0, p1}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    if-eqz p0, :cond_5

    .line 126
    .line 127
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 128
    .line 129
    .line 130
    :cond_5
    return-void
.end method

.method public static m(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    const/16 v3, 0xc

    .line 8
    .line 9
    invoke-static {v0, v3}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/16 v4, 0xa

    .line 14
    .line 15
    invoke-static {v0, v4}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    instance-of v6, v5, Landroid/widget/FrameLayout$LayoutParams;

    .line 24
    .line 25
    if-eqz v6, :cond_0

    .line 26
    .line 27
    check-cast v5, Landroid/widget/FrameLayout$LayoutParams;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v5, 0x0

    .line 31
    :goto_0
    if-eqz v5, :cond_23

    .line 32
    .line 33
    iget v6, v5, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 34
    .line 35
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getWidth()I

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    div-int/lit8 v8, v8, 0x2

    .line 40
    .line 41
    add-int/2addr v8, v6

    .line 42
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getWidth()I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    div-int/lit8 v6, v6, 0x2

    .line 47
    .line 48
    const/4 v9, 0x0

    .line 49
    if-lt v8, v6, :cond_1

    .line 50
    .line 51
    const/4 v6, 0x1

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move v6, v9

    .line 54
    :goto_1
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 55
    .line 56
    .line 57
    move-result v11

    .line 58
    move v12, v9

    .line 59
    :goto_2
    if-lt v12, v11, :cond_14

    .line 60
    .line 61
    sget-object v11, Lk9/r;->c:Landroid/content/SharedPreferences;

    .line 62
    .line 63
    const/16 v12, 0x2c

    .line 64
    .line 65
    if-eqz v11, :cond_2

    .line 66
    .line 67
    const-string v13, "action_size"

    .line 68
    .line 69
    invoke-interface {v11, v13, v12}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 70
    .line 71
    .line 72
    move-result v11

    .line 73
    const/16 v12, 0x24

    .line 74
    .line 75
    const/16 v13, 0x40

    .line 76
    .line 77
    invoke-static {v11, v12, v13}, Lr9/e0;->r(III)I

    .line 78
    .line 79
    .line 80
    move-result v12

    .line 81
    :cond_2
    iget v11, v5, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 82
    .line 83
    sub-int/2addr v11, v4

    .line 84
    sub-int/2addr v11, v3

    .line 85
    invoke-static {v0, v12}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 86
    .line 87
    .line 88
    move-result v13

    .line 89
    if-ge v11, v13, :cond_3

    .line 90
    .line 91
    move v11, v13

    .line 92
    :cond_3
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getHeight()I

    .line 93
    .line 94
    .line 95
    move-result v13

    .line 96
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getHeight()I

    .line 97
    .line 98
    .line 99
    move-result v14

    .line 100
    sub-int/2addr v13, v14

    .line 101
    sub-int/2addr v13, v4

    .line 102
    mul-int/lit8 v14, v3, 0x2

    .line 103
    .line 104
    sub-int/2addr v13, v14

    .line 105
    invoke-static {v0, v12}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 106
    .line 107
    .line 108
    move-result v15

    .line 109
    if-ge v13, v15, :cond_4

    .line 110
    .line 111
    move v13, v15

    .line 112
    :cond_4
    if-le v11, v13, :cond_5

    .line 113
    .line 114
    move v11, v13

    .line 115
    :cond_5
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getWidth()I

    .line 116
    .line 117
    .line 118
    move-result v13

    .line 119
    sub-int/2addr v13, v14

    .line 120
    const/16 v14, 0x50

    .line 121
    .line 122
    invoke-static {v0, v14}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 123
    .line 124
    .line 125
    move-result v14

    .line 126
    if-ge v13, v14, :cond_6

    .line 127
    .line 128
    move v13, v14

    .line 129
    :cond_6
    const/high16 v14, -0x80000000

    .line 130
    .line 131
    invoke-static {v13, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 132
    .line 133
    .line 134
    move-result v15

    .line 135
    invoke-static {v11, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 136
    .line 137
    .line 138
    move-result v14

    .line 139
    invoke-virtual {v1, v15, v14}, Landroid/view/View;->measure(II)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 143
    .line 144
    .line 145
    move-result-object v14

    .line 146
    instance-of v15, v14, Landroid/widget/FrameLayout$LayoutParams;

    .line 147
    .line 148
    if-eqz v15, :cond_7

    .line 149
    .line 150
    check-cast v14, Landroid/widget/FrameLayout$LayoutParams;

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_7
    const/4 v14, 0x0

    .line 154
    :goto_3
    if-eqz v14, :cond_23

    .line 155
    .line 156
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 157
    .line 158
    .line 159
    move-result v15

    .line 160
    if-le v15, v13, :cond_8

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_8
    move v13, v15

    .line 164
    :goto_4
    iput v13, v14, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 165
    .line 166
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 167
    .line 168
    .line 169
    move-result v13

    .line 170
    if-le v13, v11, :cond_9

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_9
    move v11, v13

    .line 174
    :goto_5
    iput v11, v14, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 175
    .line 176
    sget-object v11, Lk9/r;->c:Landroid/content/SharedPreferences;

    .line 177
    .line 178
    if-eqz v11, :cond_a

    .line 179
    .line 180
    const-string v13, "display_mode"

    .line 181
    .line 182
    const-string v15, "icon"

    .line 183
    .line 184
    invoke-interface {v11, v13, v15}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v11

    .line 188
    goto :goto_6

    .line 189
    :cond_a
    const/4 v11, 0x0

    .line 190
    :goto_6
    const-string v13, "text"

    .line 191
    .line 192
    invoke-static {v11, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v11

    .line 196
    if-eqz v11, :cond_b

    .line 197
    .line 198
    const/4 v10, 0x1

    .line 199
    goto :goto_7

    .line 200
    :cond_b
    if-eqz v6, :cond_c

    .line 201
    .line 202
    const v10, 0x800005

    .line 203
    .line 204
    .line 205
    goto :goto_7

    .line 206
    :cond_c
    const v10, 0x800003

    .line 207
    .line 208
    .line 209
    :goto_7
    invoke-virtual {v2, v10}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 213
    .line 214
    .line 215
    move-result v13

    .line 216
    move v15, v9

    .line 217
    :goto_8
    if-lt v15, v13, :cond_11

    .line 218
    .line 219
    if-eqz v11, :cond_d

    .line 220
    .line 221
    iget v0, v14, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 222
    .line 223
    div-int/lit8 v0, v0, 0x2

    .line 224
    .line 225
    :goto_9
    sub-int v0, v8, v0

    .line 226
    .line 227
    goto :goto_a

    .line 228
    :cond_d
    if-eqz v6, :cond_e

    .line 229
    .line 230
    div-int/lit8 v12, v12, 0x2

    .line 231
    .line 232
    invoke-static {v0, v12}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    add-int/2addr v0, v8

    .line 237
    iget v2, v14, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 238
    .line 239
    sub-int/2addr v0, v2

    .line 240
    goto :goto_a

    .line 241
    :cond_e
    div-int/lit8 v12, v12, 0x2

    .line 242
    .line 243
    invoke-static {v0, v12}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    goto :goto_9

    .line 248
    :goto_a
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getWidth()I

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    iget v6, v14, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 253
    .line 254
    sub-int/2addr v2, v6

    .line 255
    sub-int/2addr v2, v3

    .line 256
    if-ge v2, v3, :cond_f

    .line 257
    .line 258
    move v2, v3

    .line 259
    :cond_f
    invoke-static {v0, v3, v2}, Lr9/e0;->r(III)I

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    iput v0, v14, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 264
    .line 265
    iget v0, v5, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 266
    .line 267
    iget v2, v14, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 268
    .line 269
    sub-int/2addr v0, v2

    .line 270
    sub-int/2addr v0, v4

    .line 271
    if-ge v0, v3, :cond_10

    .line 272
    .line 273
    goto :goto_b

    .line 274
    :cond_10
    move v3, v0

    .line 275
    :goto_b
    iput v3, v14, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 276
    .line 277
    invoke-virtual {v1, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 278
    .line 279
    .line 280
    iget v0, v14, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 281
    .line 282
    sub-int/2addr v8, v0

    .line 283
    iget v0, v14, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 284
    .line 285
    invoke-static {v8, v9, v0}, Lr9/e0;->r(III)I

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    int-to-float v0, v0

    .line 290
    invoke-virtual {v1, v0}, Landroid/view/View;->setPivotX(F)V

    .line 291
    .line 292
    .line 293
    iget v0, v14, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 294
    .line 295
    int-to-float v0, v0

    .line 296
    invoke-virtual {v1, v0}, Landroid/view/View;->setPivotY(F)V

    .line 297
    .line 298
    .line 299
    return-void

    .line 300
    :cond_11
    invoke-virtual {v2, v15}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 301
    .line 302
    .line 303
    move-result-object v7

    .line 304
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 305
    .line 306
    .line 307
    move-result-object v9

    .line 308
    instance-of v1, v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 309
    .line 310
    if-eqz v1, :cond_12

    .line 311
    .line 312
    check-cast v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 313
    .line 314
    goto :goto_c

    .line 315
    :cond_12
    const/4 v9, 0x0

    .line 316
    :goto_c
    if-eqz v9, :cond_13

    .line 317
    .line 318
    iput v10, v9, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 319
    .line 320
    invoke-virtual {v7, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 321
    .line 322
    .line 323
    :cond_13
    add-int/lit8 v15, v15, 0x1

    .line 324
    .line 325
    move-object/from16 v1, p3

    .line 326
    .line 327
    const/4 v9, 0x0

    .line 328
    goto :goto_8

    .line 329
    :cond_14
    invoke-virtual {v2, v12}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    instance-of v7, v1, Landroid/widget/LinearLayout;

    .line 334
    .line 335
    if-eqz v7, :cond_15

    .line 336
    .line 337
    check-cast v1, Landroid/widget/LinearLayout;

    .line 338
    .line 339
    goto :goto_d

    .line 340
    :cond_15
    const/4 v1, 0x0

    .line 341
    :goto_d
    if-eqz v1, :cond_22

    .line 342
    .line 343
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 344
    .line 345
    .line 346
    move-result v7

    .line 347
    const/4 v9, 0x0

    .line 348
    invoke-static {v9, v7}, Lr9/e0;->r0(II)Llg/d;

    .line 349
    .line 350
    .line 351
    move-result-object v7

    .line 352
    new-instance v9, Ljava/util/ArrayList;

    .line 353
    .line 354
    invoke-static {v7}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 355
    .line 356
    .line 357
    move-result v13

    .line 358
    invoke-direct {v9, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v7}, Llg/b;->iterator()Ljava/util/Iterator;

    .line 362
    .line 363
    .line 364
    move-result-object v7

    .line 365
    :goto_e
    move-object v13, v7

    .line 366
    check-cast v13, Llg/c;

    .line 367
    .line 368
    iget-boolean v14, v13, Llg/c;->i:Z

    .line 369
    .line 370
    if-eqz v14, :cond_16

    .line 371
    .line 372
    invoke-virtual {v13}, Llg/c;->next()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v13

    .line 376
    check-cast v13, Ljava/lang/Number;

    .line 377
    .line 378
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 379
    .line 380
    .line 381
    move-result v13

    .line 382
    invoke-virtual {v1, v13}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 383
    .line 384
    .line 385
    move-result-object v13

    .line 386
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    goto :goto_e

    .line 390
    :cond_16
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 391
    .line 392
    .line 393
    move-result-object v7

    .line 394
    :cond_17
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 395
    .line 396
    .line 397
    move-result v9

    .line 398
    if-eqz v9, :cond_18

    .line 399
    .line 400
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v9

    .line 404
    move-object v13, v9

    .line 405
    check-cast v13, Landroid/view/View;

    .line 406
    .line 407
    invoke-virtual {v13}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v13

    .line 411
    const-string v14, "Hchat:FloatingShortcut:Label"

    .line 412
    .line 413
    invoke-static {v13, v14}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v13

    .line 417
    if-eqz v13, :cond_17

    .line 418
    .line 419
    goto :goto_f

    .line 420
    :cond_18
    const/4 v9, 0x0

    .line 421
    :goto_f
    check-cast v9, Landroid/view/View;

    .line 422
    .line 423
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 424
    .line 425
    .line 426
    move-result v7

    .line 427
    const/4 v13, 0x0

    .line 428
    invoke-static {v13, v7}, Lr9/e0;->r0(II)Llg/d;

    .line 429
    .line 430
    .line 431
    move-result-object v7

    .line 432
    new-instance v13, Ljava/util/ArrayList;

    .line 433
    .line 434
    invoke-static {v7}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 435
    .line 436
    .line 437
    move-result v14

    .line 438
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v7}, Llg/b;->iterator()Ljava/util/Iterator;

    .line 442
    .line 443
    .line 444
    move-result-object v7

    .line 445
    :goto_10
    move-object v14, v7

    .line 446
    check-cast v14, Llg/c;

    .line 447
    .line 448
    iget-boolean v15, v14, Llg/c;->i:Z

    .line 449
    .line 450
    if-eqz v15, :cond_19

    .line 451
    .line 452
    invoke-virtual {v14}, Llg/c;->next()Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v14

    .line 456
    check-cast v14, Ljava/lang/Number;

    .line 457
    .line 458
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 459
    .line 460
    .line 461
    move-result v14

    .line 462
    invoke-virtual {v1, v14}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 463
    .line 464
    .line 465
    move-result-object v14

    .line 466
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 467
    .line 468
    .line 469
    goto :goto_10

    .line 470
    :cond_19
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 471
    .line 472
    .line 473
    move-result-object v7

    .line 474
    :cond_1a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 475
    .line 476
    .line 477
    move-result v13

    .line 478
    if-eqz v13, :cond_1b

    .line 479
    .line 480
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v13

    .line 484
    move-object v14, v13

    .line 485
    check-cast v14, Landroid/view/View;

    .line 486
    .line 487
    invoke-virtual {v14}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v14

    .line 491
    const-string v15, "Hchat:FloatingShortcut:Icon"

    .line 492
    .line 493
    invoke-static {v14, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result v14

    .line 497
    if-eqz v14, :cond_1a

    .line 498
    .line 499
    goto :goto_11

    .line 500
    :cond_1b
    const/4 v13, 0x0

    .line 501
    :goto_11
    check-cast v13, Landroid/view/View;

    .line 502
    .line 503
    if-eqz v9, :cond_22

    .line 504
    .line 505
    if-nez v13, :cond_1c

    .line 506
    .line 507
    goto :goto_16

    .line 508
    :cond_1c
    if-eqz v6, :cond_1d

    .line 509
    .line 510
    move-object v14, v9

    .line 511
    :goto_12
    const/4 v7, 0x0

    .line 512
    goto :goto_13

    .line 513
    :cond_1d
    move-object v14, v13

    .line 514
    goto :goto_12

    .line 515
    :goto_13
    invoke-virtual {v1, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 516
    .line 517
    .line 518
    move-result-object v15

    .line 519
    if-ne v15, v14, :cond_1e

    .line 520
    .line 521
    goto :goto_16

    .line 522
    :cond_1e
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 523
    .line 524
    .line 525
    move-result-object v14

    .line 526
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 527
    .line 528
    .line 529
    check-cast v14, Landroid/widget/LinearLayout$LayoutParams;

    .line 530
    .line 531
    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 532
    .line 533
    .line 534
    move-result-object v15

    .line 535
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 536
    .line 537
    .line 538
    check-cast v15, Landroid/widget/LinearLayout$LayoutParams;

    .line 539
    .line 540
    const/16 v7, 0x8

    .line 541
    .line 542
    if-eqz v6, :cond_1f

    .line 543
    .line 544
    const/4 v10, 0x0

    .line 545
    goto :goto_14

    .line 546
    :cond_1f
    invoke-static {v0, v7}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 547
    .line 548
    .line 549
    move-result v16

    .line 550
    move/from16 v10, v16

    .line 551
    .line 552
    :goto_14
    invoke-virtual {v14, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 553
    .line 554
    .line 555
    if-eqz v6, :cond_20

    .line 556
    .line 557
    invoke-static {v0, v7}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 558
    .line 559
    .line 560
    move-result v7

    .line 561
    goto :goto_15

    .line 562
    :cond_20
    const/4 v7, 0x0

    .line 563
    :goto_15
    invoke-virtual {v15, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 567
    .line 568
    .line 569
    if-eqz v6, :cond_21

    .line 570
    .line 571
    invoke-virtual {v1, v9, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v1, v13, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 575
    .line 576
    .line 577
    goto :goto_16

    .line 578
    :cond_21
    invoke-virtual {v1, v13, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v1, v9, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 582
    .line 583
    .line 584
    :cond_22
    :goto_16
    add-int/lit8 v12, v12, 0x1

    .line 585
    .line 586
    move-object/from16 v1, p3

    .line 587
    .line 588
    const/4 v9, 0x0

    .line 589
    goto/16 :goto_2

    .line 590
    .line 591
    :cond_23
    return-void
.end method

.method public static n(Landroid/view/View;Landroid/view/ViewGroup;)V
    .locals 4

    .line 1
    sget-object v0, Lk9/r;->i:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Landroid/widget/ScrollView;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast v0, Landroid/widget/ScrollView;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v2

    .line 16
    :goto_0
    if-eqz v0, :cond_2

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    instance-of v3, v1, Landroid/widget/LinearLayout;

    .line 24
    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    move-object v2, v1

    .line 28
    check-cast v2, Landroid/widget/LinearLayout;

    .line 29
    .line 30
    :cond_1
    if-eqz v2, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {v1, p1, p0, v0, v2}, Lk9/r;->m(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->bringToFront()V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-void
.end method

.method public static o([I)I
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    const-string v1, "Array is empty."

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aget v0, p0, v0

    .line 8
    .line 9
    array-length v2, p0

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    array-length v1, p0

    .line 13
    add-int/lit8 v1, v1, -0x1

    .line 14
    .line 15
    aget p0, p0, v1

    .line 16
    .line 17
    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    add-int/2addr v2, v1

    .line 26
    div-int/lit8 v2, v2, 0x2

    .line 27
    .line 28
    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    add-int/2addr v3, v1

    .line 37
    div-int/lit8 v3, v3, 0x2

    .line 38
    .line 39
    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    add-int/2addr v4, v1

    .line 48
    div-int/lit8 v4, v4, 0x2

    .line 49
    .line 50
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    add-int/2addr p0, v0

    .line 59
    div-int/lit8 p0, p0, 0x2

    .line 60
    .line 61
    invoke-static {v2, v3, v4, p0}, Landroid/graphics/Color;->argb(IIII)I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    return p0

    .line 66
    :cond_0
    invoke-static {v1}, Lj8/o;->l(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x0

    .line 70
    return p0

    .line 71
    :cond_1
    invoke-static {v1}, Lj8/o;->l(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const/4 p0, 0x0

    .line 75
    return p0
.end method

.method public static p(Lfg/a;)V
    .locals 2

    .line 1
    new-instance v0, Lb0/c;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, p0, v1}, Lb0/c;-><init>(Lfg/a;I)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Lb0/c;->run()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    sget-object p0, Lk9/r;->b:Landroid/os/Handler;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static q(Landroid/app/Activity;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_7

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_7

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v2, "com.tencent.mm"

    .line 19
    .line 20
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_7

    .line 25
    .line 26
    sget-object v0, Lk9/r;->c:Landroid/content/SharedPreferences;

    .line 27
    .line 28
    const-string v2, "home"

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    const-string v3, "scope"

    .line 33
    .line 34
    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    move-object v2, v0

    .line 41
    :cond_0
    const-string v0, "all"

    .line 42
    .line 43
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const/4 v2, 0x1

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    goto :goto_4

    .line 51
    :cond_1
    sget-boolean v0, Lk9/r;->f:Z

    .line 52
    .line 53
    if-nez v0, :cond_6

    .line 54
    .line 55
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->chatPage()Lq8/m;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    if-eqz v0, :cond_5

    .line 60
    .line 61
    iget-object v3, v0, Lq8/m;->b:Lq8/o;

    .line 62
    .line 63
    if-eqz v3, :cond_2

    .line 64
    .line 65
    invoke-virtual {v3}, Lq8/o;->a()Landroid/app/Activity;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    goto :goto_0

    .line 70
    :cond_2
    const/4 v3, 0x0

    .line 71
    :goto_0
    if-nez v3, :cond_3

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    const-string v4, "com.tencent.mm.ui.chatting.ChattingUI"

    .line 83
    .line 84
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-nez v4, :cond_6

    .line 89
    .line 90
    const-string v4, ".ui.chatting."

    .line 91
    .line 92
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_4

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_4
    :goto_1
    iget-object v0, v0, Lq8/m;->j:Ljava/lang/String;

    .line 100
    .line 101
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_5

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_5
    move v0, v1

    .line 109
    goto :goto_3

    .line 110
    :cond_6
    :goto_2
    move v0, v2

    .line 111
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    const-string v3, "com.tencent.mm.ui.LauncherUI"

    .line 120
    .line 121
    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    if-eqz p0, :cond_7

    .line 126
    .line 127
    if-nez v0, :cond_7

    .line 128
    .line 129
    :goto_4
    return v2

    .line 130
    :cond_7
    return v1
.end method
