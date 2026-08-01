.class public final Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final colors:Lxx;

.field private final context:Landroid/content/Context;

.field private final dialog:Landroid/app/Dialog;

.field private final onConfirm:La80;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La80;"
        }
    .end annotation
.end field

.field private final record:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

.field private selectedCategory:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;La80;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;",
            "La80;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->context:Landroid/content/Context;

    .line 14
    .line 15
    iput-object p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->record:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 16
    .line 17
    iput-object p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->onConfirm:La80;

    .line 18
    .line 19
    new-instance p2, Landroid/app/Dialog;

    .line 20
    .line 21
    invoke-direct {p2, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->dialog:Landroid/app/Dialog;

    .line 25
    .line 26
    invoke-static {p1}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    iput-object p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->colors:Lxx;

    .line 31
    .line 32
    const-string p3, "\u9ed8\u8ba4"

    .line 33
    .line 34
    iput-object p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->selectedCategory:Ljava/lang/String;

    .line 35
    .line 36
    const/4 p3, 0x1

    .line 37
    invoke-virtual {p2, p3}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 38
    .line 39
    .line 40
    sget-object v0, Lx01;->α:Lx01;

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const/4 v0, 0x0

    .line 47
    const/4 v1, 0x0

    .line 48
    const v2, 0x7f0c0037

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p2, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2, p3}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->setupView(Landroid/view/View;)V

    .line 65
    .line 66
    .line 67
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->applyWindowStyle()V

    .line 68
    .line 69
    .line 70
    new-instance p1, Li9;

    .line 71
    .line 72
    const/4 p3, 0x3

    .line 73
    invoke-direct {p1, p3, p0}, Li9;-><init>(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2, p1}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method private static final _init_$lambda$0(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->applyWindowStyle()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$dp(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;I)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->dp(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$getColors$p(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;)Lxx;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->colors:Lxx;

    .line 2
    .line 3
    return-object p0
.end method

.method private final applyThemeToStaticViews(Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->colors:Lxx;

    .line 2
    .line 3
    iget-object v0, v0, Lxx;->β:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->context:Landroid/content/Context;

    .line 13
    .line 14
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->colors:Lxx;

    .line 15
    .line 16
    iget-object v0, v0, Lxx;->γ:Ljava/lang/String;

    .line 17
    .line 18
    const/16 v1, 0xa

    .line 19
    .line 20
    invoke-static {v1, p1, v0}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p2, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->context:Landroid/content/Context;

    .line 28
    .line 29
    iget-object p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->colors:Lxx;

    .line 30
    .line 31
    iget-object p2, p2, Lxx;->γ:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v1, p1, p2}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p3, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->context:Landroid/content/Context;

    .line 41
    .line 42
    iget-object p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->colors:Lxx;

    .line 43
    .line 44
    iget-object p2, p2, Lxx;->γ:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v1, p1, p2}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p4, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->context:Landroid/content/Context;

    .line 54
    .line 55
    iget-object p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->colors:Lxx;

    .line 56
    .line 57
    iget-object p2, p2, Lxx;->χ:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v1, p1, p2}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p5, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->colors:Lxx;

    .line 67
    .line 68
    iget-object p1, p1, Lxx;->ζ:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    invoke-virtual {p6, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->colors:Lxx;

    .line 78
    .line 79
    iget-object p1, p1, Lxx;->η:Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    invoke-virtual {p7, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->colors:Lxx;

    .line 89
    .line 90
    iget-object p1, p1, Lxx;->ζ:Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    invoke-virtual {p8, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->colors:Lxx;

    .line 100
    .line 101
    iget-object p1, p1, Lxx;->η:Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    invoke-virtual {p9, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 108
    .line 109
    .line 110
    iget-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->colors:Lxx;

    .line 111
    .line 112
    iget-object p1, p1, Lxx;->θ:Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    invoke-virtual {p10, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 119
    .line 120
    .line 121
    iget-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->colors:Lxx;

    .line 122
    .line 123
    iget-object p1, p1, Lxx;->θ:Ljava/lang/String;

    .line 124
    .line 125
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    invoke-virtual {p11, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 130
    .line 131
    .line 132
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->colors:Lxx;

    .line 133
    .line 134
    iget-object p0, p0, Lxx;->Β:Ljava/lang/String;

    .line 135
    .line 136
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    invoke-virtual {p12, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 141
    .line 142
    .line 143
    return-void
.end method

.method private final applyWindowStyle()V
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->dialog:Landroid/app/Dialog;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/Window;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 31
    .line 32
    int-to-float v0, v0

    .line 33
    const v1, 0x3f6b851f    # 0.92f

    .line 34
    .line 35
    .line 36
    mul-float/2addr v0, v1

    .line 37
    float-to-int v0, v0

    .line 38
    const/4 v1, -0x2

    .line 39
    invoke-virtual {p0, v0, v1}, Landroid/view/Window;->setLayout(II)V

    .line 40
    .line 41
    .line 42
    const v0, 0x3eb33333    # 0.35f

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0}, Landroid/view/Window;->setDimAmount(F)V

    .line 46
    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    invoke-virtual {p0, v0}, Landroid/view/Window;->addFlags(I)V

    .line 50
    .line 51
    .line 52
    const/16 v0, 0x10

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 55
    .line 56
    .line 57
    :cond_0
    return-void
.end method

.method private final bindCategorySelector(Landroid/widget/Spinner;Landroid/widget/TextView;Landroid/view/View;Ljava/util/List;Ljava/lang/String;La80;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/Spinner;",
            "Landroid/widget/TextView;",
            "Landroid/view/View;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "La80;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->context:Landroid/content/Context;

    .line 2
    .line 3
    new-instance v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog$bindCategorySelector$adapter$1;

    .line 4
    .line 5
    invoke-direct {v1, p4, p0, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog$bindCategorySelector$adapter$1;-><init>(Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->colors:Lxx;

    .line 14
    .line 15
    iget-object v1, v1, Lxx;->γ:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/widget/Spinner;->setPopupBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x4

    .line 28
    invoke-direct {p0, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->dp(I)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p1, v0}, Landroid/widget/Spinner;->setDropDownVerticalOffset(I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p4, p5}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 36
    .line 37
    .line 38
    move-result p5

    .line 39
    const/4 v0, 0x0

    .line 40
    if-gez p5, :cond_0

    .line 41
    .line 42
    move p5, v0

    .line 43
    :cond_0
    invoke-virtual {p1, p5, v0}, Landroid/widget/AbsSpinner;->setSelection(IZ)V

    .line 44
    .line 45
    .line 46
    invoke-static {p5, p4}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p5

    .line 50
    check-cast p5, Ljava/lang/String;

    .line 51
    .line 52
    const-string v0, "\u9ed8\u8ba4"

    .line 53
    .line 54
    if-eqz p5, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    move-object p5, v0

    .line 58
    :goto_0
    invoke-virtual {p2, p5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    .line 60
    .line 61
    iget-object p5, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->colors:Lxx;

    .line 62
    .line 63
    iget-object p5, p5, Lxx;->ζ:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {p5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result p5

    .line 69
    invoke-virtual {p2, p5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 70
    .line 71
    .line 72
    iget-object p5, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->colors:Lxx;

    .line 73
    .line 74
    iget-object p5, p5, Lxx;->Α:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {p5}, Ljx0;->Ω(Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 77
    .line 78
    .line 79
    move-result-object p5

    .line 80
    invoke-virtual {p2, p5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 81
    .line 82
    .line 83
    const/16 p5, 0x10

    .line 84
    .line 85
    invoke-virtual {p2, p5}, Landroid/widget/TextView;->setGravity(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 89
    .line 90
    .line 91
    move-result-object p5

    .line 92
    if-eqz p5, :cond_2

    .line 93
    .line 94
    invoke-virtual {p5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p5

    .line 98
    goto :goto_1

    .line 99
    :cond_2
    const/4 p5, 0x0

    .line 100
    :goto_1
    if-nez p5, :cond_3

    .line 101
    .line 102
    const-string p5, ""

    .line 103
    .line 104
    :cond_3
    invoke-static {p5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_4

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_4
    move-object v0, p5

    .line 112
    :goto_2
    invoke-interface {p6, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    new-instance p5, Lpj;

    .line 116
    .line 117
    const/4 v0, 0x1

    .line 118
    invoke-direct {p5, p1, v0}, Lpj;-><init>(Landroid/widget/Spinner;I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p2, p5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p3, p5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 125
    .line 126
    .line 127
    new-instance p3, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog$bindCategorySelector$2;

    .line 128
    .line 129
    invoke-direct {p3, p4, p2, p6, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog$bindCategorySelector$2;-><init>(Ljava/util/List;Landroid/widget/TextView;La80;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, p3}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method private static final bindCategorySelector$lambda$11(Landroid/widget/Spinner;Landroid/view/View;)V
    .locals 1

    .line 1
    new-instance p1, Lqj;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p1, p0, v0}, Lqj;-><init>(Landroid/widget/Spinner;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static final bindCategorySelector$lambda$11$lambda$10(Landroid/widget/Spinner;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/widget/Spinner;->performClick()Z

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final buildCategoryList(Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const-string p0, "\u9ed8\u8ba4"

    .line 2
    .line 3
    filled-new-array {p0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lg81;->ν([Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->getCategories()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_0

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_2
    invoke-static {p0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method

.method private final dp(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->context:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {p0, p1}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method private final setupView(Landroid/view/View;)V
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const v1, 0x7f0900ff

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const v2, 0x7f0902f1

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const v3, 0x7f0901fa

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    const v4, 0x7f09014a

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    const v5, 0x7f0900df

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    check-cast v5, Landroid/widget/FrameLayout;

    .line 39
    .line 40
    const v6, 0x7f090376

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    check-cast v6, Landroid/widget/TextView;

    .line 48
    .line 49
    const v7, 0x7f090323

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    check-cast v7, Landroid/widget/TextView;

    .line 57
    .line 58
    const v8, 0x7f090350

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    check-cast v8, Landroid/widget/TextView;

    .line 66
    .line 67
    const v9, 0x7f090358

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    check-cast v9, Landroid/widget/TextView;

    .line 75
    .line 76
    const v10, 0x7f090320

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    check-cast v10, Landroid/widget/TextView;

    .line 84
    .line 85
    const v11, 0x7f090321

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    move-object v13, v11

    .line 93
    check-cast v13, Landroid/widget/TextView;

    .line 94
    .line 95
    const v11, 0x7f090356

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object v11

    .line 102
    check-cast v11, Landroid/widget/TextView;

    .line 103
    .line 104
    const v12, 0x7f090338

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object v12

    .line 111
    check-cast v12, Landroid/widget/TextView;

    .line 112
    .line 113
    const v14, 0x7f0902c4

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 117
    .line 118
    .line 119
    move-result-object v14

    .line 120
    check-cast v14, Landroid/widget/Spinner;

    .line 121
    .line 122
    const v15, 0x7f090142

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 126
    .line 127
    .line 128
    move-result-object v15

    .line 129
    check-cast v15, Landroid/widget/EditText;

    .line 130
    .line 131
    move-object/from16 v16, v1

    .line 132
    .line 133
    const v1, 0x7f090068

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    check-cast v0, Landroid/widget/Button;

    .line 141
    .line 142
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    move-object/from16 p1, v0

    .line 179
    .line 180
    move-object/from16 v1, v16

    .line 181
    .line 182
    move-object/from16 v0, p0

    .line 183
    .line 184
    invoke-direct/range {v0 .. v12}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->applyThemeToStaticViews(Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 185
    .line 186
    .line 187
    move-object v3, v5

    .line 188
    iget-object v1, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->record:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 189
    .line 190
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->displayName()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-eqz v2, :cond_0

    .line 199
    .line 200
    const-string v1, "\u672a\u77e5\u4e3b\u9875"

    .line 201
    .line 202
    :cond_0
    invoke-virtual {v8, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 203
    .line 204
    .line 205
    iget-object v1, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->record:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 206
    .line 207
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSignature()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    if-eqz v2, :cond_1

    .line 216
    .line 217
    const-string v1, "\u6682\u65e0\u7b7e\u540d"

    .line 218
    .line 219
    :cond_1
    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 220
    .line 221
    .line 222
    iget-object v1, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->record:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 223
    .line 224
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getRemark()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    if-nez v1, :cond_2

    .line 229
    .line 230
    const-string v1, ""

    .line 231
    .line 232
    :cond_2
    invoke-virtual {v15, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v15}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    if-eqz v1, :cond_3

    .line 240
    .line 241
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    goto :goto_0

    .line 246
    :cond_3
    const/4 v1, 0x0

    .line 247
    :goto_0
    invoke-virtual {v15, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 248
    .line 249
    .line 250
    iget-object v1, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->record:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 251
    .line 252
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getGroup()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    if-nez v2, :cond_4

    .line 261
    .line 262
    goto :goto_1

    .line 263
    :cond_4
    const/4 v1, 0x0

    .line 264
    :goto_1
    if-nez v1, :cond_5

    .line 265
    .line 266
    const-string v1, "\u9ed8\u8ba4"

    .line 267
    .line 268
    :cond_5
    move-object v5, v1

    .line 269
    iput-object v5, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->selectedCategory:Ljava/lang/String;

    .line 270
    .line 271
    invoke-direct {v0, v5}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->buildCategoryList(Ljava/lang/String;)Ljava/util/List;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    new-instance v6, Lθ;

    .line 282
    .line 283
    const/16 v1, 0x1d

    .line 284
    .line 285
    invoke-direct {v6, v1, v0}, Lθ;-><init>(ILjava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    move-object v2, v13

    .line 289
    move-object v1, v14

    .line 290
    invoke-direct/range {v0 .. v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->bindCategorySelector(Landroid/widget/Spinner;Landroid/widget/TextView;Landroid/view/View;Ljava/util/List;Ljava/lang/String;La80;)V

    .line 291
    .line 292
    .line 293
    invoke-direct {v0, v15}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->styleEditText(Landroid/widget/EditText;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    move-object/from16 v1, p1

    .line 300
    .line 301
    invoke-direct {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->stylePrimaryButton(Landroid/widget/Button;)V

    .line 302
    .line 303
    .line 304
    invoke-direct {v0, v7}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->styleClickableTextView(Landroid/widget/TextView;)V

    .line 305
    .line 306
    .line 307
    new-instance v2, Lhi;

    .line 308
    .line 309
    const/4 v3, 0x6

    .line 310
    invoke-direct {v2, v3, v0}, Lhi;-><init>(ILjava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v7, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 314
    .line 315
    .line 316
    new-instance v2, Ldj1;

    .line 317
    .line 318
    invoke-direct {v2, v15, v0}, Ldj1;-><init>(Landroid/widget/EditText;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 322
    .line 323
    .line 324
    return-void
.end method

.method private static final setupView$lambda$5(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;Ljava/lang/String;)Ls62;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->selectedCategory:Ljava/lang/String;

    .line 5
    .line 6
    sget-object p0, Ls62;->α:Ls62;

    .line 7
    .line 8
    return-object p0
.end method

.method private static final setupView$lambda$6(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->dialog:Landroid/app/Dialog;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static final setupView$lambda$8(Landroid/widget/EditText;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;Landroid/view/View;)V
    .locals 23

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    :goto_0
    if-nez v1, :cond_1

    .line 16
    .line 17
    const-string v1, ""

    .line 18
    .line 19
    :cond_1
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v9

    .line 27
    iget-object v2, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->record:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 28
    .line 29
    iget-object v1, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->selectedCategory:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    const-string v1, "\u9ed8\u8ba4"

    .line 38
    .line 39
    :cond_2
    move-object v8, v1

    .line 40
    const v21, 0xff9f

    .line 41
    .line 42
    .line 43
    const/16 v22, 0x0

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    const/4 v4, 0x0

    .line 47
    const/4 v5, 0x0

    .line 48
    const/4 v6, 0x0

    .line 49
    const/4 v7, 0x0

    .line 50
    const-wide/16 v10, 0x0

    .line 51
    .line 52
    const-wide/16 v12, 0x0

    .line 53
    .line 54
    const/4 v14, 0x0

    .line 55
    const/4 v15, 0x0

    .line 56
    const/16 v16, 0x0

    .line 57
    .line 58
    const/16 v17, 0x0

    .line 59
    .line 60
    const/16 v18, 0x0

    .line 61
    .line 62
    const/16 v19, 0x0

    .line 63
    .line 64
    const/16 v20, 0x0

    .line 65
    .line 66
    invoke-static/range {v2 .. v22}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->copy$default(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;ZILjava/util/Set;Ljava/util/List;ZILjava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-object v2, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->onConfirm:La80;

    .line 71
    .line 72
    invoke-interface {v2, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    iget-object v0, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->dialog:Landroid/app/Dialog;

    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method private final showKeyboard(Landroid/view/View;)V
    .locals 3

    .line 1
    new-instance v0, Lii0;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, p1, v1, p0}, Lii0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const-wide/16 v1, 0x50

    .line 9
    .line 10
    invoke-virtual {p1, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private static final showKeyboard$lambda$16(Landroid/view/View;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->dialog:Landroid/app/Dialog;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const/16 v0, 0x15

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "input_method"

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    instance-of v0, p1, Landroid/view/inputmethod/InputMethodManager;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 p1, 0x0

    .line 35
    :goto_0
    if-eqz p1, :cond_2

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    invoke-virtual {p1, p0, v0}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 39
    .line 40
    .line 41
    :cond_2
    return-void
.end method

.method private final styleClickableTextView(Landroid/widget/TextView;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->colors:Lxx;

    .line 2
    .line 3
    iget-object v0, v0, Lxx;->η:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-virtual {p1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->colors:Lxx;

    .line 20
    .line 21
    iget-object p0, p0, Lxx;->Α:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {p0}, Ljx0;->Ω(Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private final styleEditText(Landroid/widget/EditText;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->colors:Lxx;

    .line 2
    .line 3
    iget-object v0, v0, Lxx;->ζ:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->colors:Lxx;

    .line 13
    .line 14
    iget-object v0, v0, Lxx;->θ:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->context:Landroid/content/Context;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->colors:Lxx;

    .line 26
    .line 27
    iget-object v1, v1, Lxx;->χ:Ljava/lang/String;

    .line 28
    .line 29
    const/16 v2, 0xa

    .line 30
    .line 31
    invoke-static {v2, v0, v1}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 40
    .line 41
    .line 42
    const v0, 0x800033

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 46
    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setCursorVisible(Z)V

    .line 56
    .line 57
    .line 58
    new-instance v0, Ldj1;

    .line 59
    .line 60
    invoke-direct {v0, p0, p1}, Ldj1;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;Landroid/widget/EditText;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 64
    .line 65
    .line 66
    new-instance v0, Lsj;

    .line 67
    .line 68
    const/4 v1, 0x1

    .line 69
    invoke-direct {v0, p0, p1, v1}, Lsj;-><init>(Ljava/lang/Object;Landroid/widget/EditText;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 73
    .line 74
    .line 75
    new-instance v0, Ltj;

    .line 76
    .line 77
    const/4 v1, 0x2

    .line 78
    invoke-direct {v0, v1, p0}, Ltj;-><init>(ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method private static final styleEditText$lambda$13(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;Landroid/widget/EditText;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->showKeyboard(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final styleEditText$lambda$14(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;Landroid/widget/EditText;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 p3, 0x1

    .line 6
    if-ne p2, p3, :cond_0

    .line 7
    .line 8
    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->showKeyboard(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method private static final styleEditText$lambda$15(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;Landroid/view/View;Z)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->showKeyboard(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method private final stylePrimaryButton(Landroid/widget/Button;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 6
    .line 7
    .line 8
    const/16 v1, 0x11

    .line 9
    .line 10
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMinWidth(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/view/View;->setMinimumWidth(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/view/View;->setMinimumHeight(I)V

    .line 23
    .line 24
    .line 25
    const/4 v0, -0x1

    .line 26
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->colors:Lxx;

    .line 37
    .line 38
    iget-object v1, p0, Lxx;->Α:Ljava/lang/String;

    .line 39
    .line 40
    iget-object p0, p0, Lxx;->ι:Ljava/lang/String;

    .line 41
    .line 42
    const/16 v2, 0xa

    .line 43
    .line 44
    invoke-static {v2, v0, v1, p0}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public static synthetic α(Landroid/widget/EditText;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->setupView$lambda$8(Landroid/widget/EditText;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic β(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;Landroid/widget/EditText;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->styleEditText$lambda$14(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;Landroid/widget/EditText;Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic γ(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;Landroid/view/View;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->styleEditText$lambda$15(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;Landroid/view/View;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic δ(Landroid/widget/Spinner;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->bindCategorySelector$lambda$11(Landroid/widget/Spinner;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic ε(Landroid/view/View;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->showKeyboard$lambda$16(Landroid/view/View;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic ζ(Landroid/view/View;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;)V
    .locals 0

    .line 1
    invoke-static {p1, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->setupView$lambda$6(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic η(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->_init_$lambda$0(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;Landroid/content/DialogInterface;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic θ(Landroid/widget/Spinner;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->bindCategorySelector$lambda$11$lambda$10(Landroid/widget/Spinner;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic ι(Landroid/widget/EditText;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p1, p0, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->styleEditText$lambda$13(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;Landroid/widget/EditText;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic κ(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;Ljava/lang/String;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->setupView$lambda$5(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;Ljava/lang/String;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final getDialog()Landroid/app/Dialog;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->dialog:Landroid/app/Dialog;

    .line 2
    .line 3
    return-object p0
.end method

.method public final show()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->dialog:Landroid/app/Dialog;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->applyWindowStyle()V

    .line 7
    .line 8
    .line 9
    return-void
.end method
