.class public final L۟/z4;
.super L۟/ya;
.source "SourceFile"


# instance fields
.field public final ۥ۠ۤ:L۟/kb;

.field public final ۥ۠ۥ:L۟/kb;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 5

    .line 1
    const/16 v0, 0xf

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
    move-result-object v0

    .line 18
    const/4 v2, 0x7

    .line 19
    new-array v3, v2, [B

    .line 20
    .line 21
    fill-array-data v3, :array_2

    .line 22
    .line 23
    .line 24
    new-array v4, v1, [B

    .line 25
    .line 26
    fill-array-data v4, :array_3

    .line 27
    .line 28
    .line 29
    invoke-static {v3, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    new-array v2, v2, [B

    .line 33
    .line 34
    fill-array-data v2, :array_4

    .line 35
    .line 36
    .line 37
    new-array v1, v1, [B

    .line 38
    .line 39
    fill-array-data v1, :array_5

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-direct {p0, p1, v1}, L۟/ya;-><init>(Landroid/content/Context;I)V

    .line 47
    .line 48
    .line 49
    new-instance v1, L۟/y4;

    .line 50
    .line 51
    invoke-direct {v1, p1, v0}, L۟/y4;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    new-instance v0, L۟/kb;

    .line 55
    .line 56
    invoke-direct {v0, v1}, L۟/kb;-><init>(L۟/f3;)V

    .line 57
    .line 58
    .line 59
    iput-object v0, p0, L۟/z4;->ۥ۠ۤ:L۟/kb;

    .line 60
    .line 61
    new-instance v0, L۟/x4;

    .line 62
    .line 63
    invoke-direct {v0, p1}, L۟/x4;-><init>(Landroid/app/Activity;)V

    .line 64
    .line 65
    .line 66
    new-instance p1, L۟/kb;

    .line 67
    .line 68
    invoke-direct {p1, v0}, L۟/kb;-><init>(L۟/f3;)V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, L۟/z4;->ۥ۠ۥ:L۟/kb;

    .line 72
    .line 73
    return-void

    .line 74
    nop

    .line 75
    :array_0
    .array-data 1
        0x28t
        -0x5dt
        -0x5ft
        0x55t
        -0x8t
        -0x77t
        0x2at
        -0x4at
        -0x77t
        0x58t
        -0x27t
        -0x64t
        -0x20t
        0x20t
        0x2ct
    .end array-data

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    :array_1
    .array-data 1
        -0x32t
        0xet
        0x2t
        -0x50t
        0x64t
        0x21t
    .end array-data

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    nop

    .line 95
    :array_2
    .array-data 1
        0x44t
        -0x74t
        0x34t
        -0x4at
        -0x4at
        0x5bt
        0x53t
    .end array-data

    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    :array_3
    .array-data 1
        0x27t
        -0x1dt
        0x5at
        -0x3et
        -0x2dt
        0x23t
    .end array-data

    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    nop

    .line 111
    :array_4
    .array-data 1
        -0x5ct
        -0x6ct
        0x2bt
        -0xft
        -0x3et
        -0x44t
        -0x4ct
    .end array-data

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    :array_5
    .array-data 1
        -0x40t
        -0xft
        0x4dt
        -0x5bt
        -0x59t
        -0x3ct
    .end array-data
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, L۟/ya;->onCreate(Landroid/os/Bundle;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    return-void
.end method

.method public final show()V
    .locals 0

    invoke-super {p0}, L۟/ya;->show()V

    return-void
.end method

.method public final ۥۣ۟()Landroid/view/View;
    .locals 6

    .line 1
    new-instance v0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    .line 11
    .line 12
    const/4 v2, -0x2

    .line 13
    invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 17
    .line 18
    .line 19
    const/16 v1, 0x11

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const/high16 v3, 0x41200000    # 10.0f

    .line 37
    .line 38
    invoke-static {v1, v3, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    float-to-int v2, v2

    .line 43
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    .line 44
    .line 45
    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 46
    .line 47
    .line 48
    const/4 v5, 0x0

    .line 49
    invoke-virtual {v4, v5}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, v5}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    .line 53
    .line 54
    .line 55
    int-to-float v2, v2

    .line 56
    invoke-virtual {v4, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 57
    .line 58
    .line 59
    const/4 v2, -0x1

    .line 60
    invoke-virtual {v4, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 64
    .line 65
    .line 66
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-static {v1, v3, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    float-to-int v1, v1

    .line 79
    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 80
    .line 81
    .line 82
    iget-object v1, p0, L۟/z4;->ۥ۠ۥ:L۟/kb;

    .line 83
    .line 84
    invoke-virtual {v1}, L۟/kb;->ۥ()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Landroid/widget/ProgressBar;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 91
    .line 92
    .line 93
    iget-object v1, p0, L۟/z4;->ۥ۠ۤ:L۟/kb;

    .line 94
    .line 95
    invoke-virtual {v1}, L۟/kb;->ۥ()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, Landroid/widget/TextView;

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 102
    .line 103
    .line 104
    return-object v0
.end method
