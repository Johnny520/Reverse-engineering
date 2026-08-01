.class public final Li/q1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x4

    const/4 v3, 0x2

    const/16 v4, 0x8

    const/4 v5, 0x1

    const/4 v7, 0x0

    const-string v8, "context"

    invoke-static {v1, v8}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Li/q1;->b:Ljava/lang/Object;

    const/4 v8, 0x3

    .line 2
    invoke-static {v8}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v9

    iput-object v9, v0, Li/q1;->e:Ljava/lang/Object;

    .line 3
    new-instance v9, Ls0/f;

    const/high16 v10, 0x600000

    .line 4
    invoke-direct {v9, v10, v7}, Ls0/f;-><init>(II)V

    .line 5
    iput-object v9, v0, Li/q1;->f:Ljava/lang/Object;

    .line 6
    new-instance v9, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v9, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v9, v0, Li/q1;->g:Ljava/lang/Object;

    .line 7
    new-instance v9, Lt0/e;

    .line 8
    new-instance v10, Landroid/widget/LinearLayout;

    invoke-direct {v10, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 9
    new-instance v11, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v12, -0x1

    invoke-direct {v11, v12, v12}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    invoke-virtual {v10, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    invoke-virtual {v10, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 11
    new-instance v11, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v11}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 12
    invoke-virtual {v11, v7}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 13
    invoke-static {v1}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    move-result-object v13

    .line 14
    iget v13, v13, Ls0/K;->d:I

    invoke-virtual {v11, v13}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v13, 0x41b00000    # 22.0f

    .line 15
    invoke-static {v13}, LB0/a;->a(F)F

    move-result v14

    invoke-virtual {v11, v14}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 16
    invoke-virtual {v10, v11}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 17
    invoke-virtual {v10, v5}, Landroid/view/View;->setClipToOutline(Z)V

    .line 18
    new-instance v11, Landroid/widget/FrameLayout;

    invoke-direct {v11, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 19
    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v15, 0x48

    const/16 v16, 0x0

    invoke-static {v15}, LB0/a;->b(I)I

    move-result v6

    invoke-direct {v14, v12, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v6, 0x10

    .line 20
    iput v6, v14, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 21
    invoke-virtual {v11, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v6, 0x18

    .line 22
    invoke-static {v6}, LB0/a;->b(I)I

    move-result v14

    invoke-static {v6}, LB0/a;->b(I)I

    move-result v6

    invoke-virtual {v11, v14, v7, v6, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 23
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 24
    invoke-virtual {v6, v7}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 25
    invoke-static {v1}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    move-result-object v14

    .line 26
    iget v14, v14, Ls0/K;->b:I

    invoke-virtual {v6, v14}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 27
    invoke-static {v13}, LB0/a;->a(F)F

    move-result v14

    invoke-static {v13}, LB0/a;->a(F)F

    move-result v17

    invoke-static {v13}, LB0/a;->a(F)F

    move-result v18

    invoke-static {v13}, LB0/a;->a(F)F

    move-result v13

    move/from16 v19, v8

    new-array v8, v4, [F

    aput v14, v8, v7

    aput v17, v8, v5

    aput v18, v8, v3

    aput v13, v8, v19

    aput v16, v8, v2

    const/4 v13, 0x5

    aput v16, v8, v13

    const/4 v13, 0x6

    aput v16, v8, v13

    const/4 v13, 0x7

    aput v16, v8, v13

    invoke-virtual {v6, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    .line 28
    invoke-virtual {v11, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 29
    new-instance v6, Landroid/widget/TextView;

    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-direct {v6, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 30
    new-instance v8, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v13, 0x30

    invoke-static {v13}, LB0/a;->b(I)I

    move-result v13

    invoke-direct {v8, v13, v12}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const v13, 0x800003

    .line 31
    iput v13, v8, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 32
    invoke-virtual {v6, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v8, 0x11

    .line 33
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 34
    const-string v13, "\u2039"

    invoke-virtual {v6, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    invoke-static {v1}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    move-result-object v13

    .line 36
    iget v13, v13, Ls0/K;->f:I

    invoke-virtual {v6, v13}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v13, 0x42000000    # 32.0f

    .line 37
    invoke-virtual {v6, v3, v13}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 38
    new-instance v13, Ls0/c;

    invoke-direct {v13, v0, v7}, Ls0/c;-><init>(Li/q1;I)V

    invoke-virtual {v6, v13}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    invoke-virtual {v11, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 40
    new-instance v6, Landroid/widget/TextView;

    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v13

    invoke-direct {v6, v13}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 41
    new-instance v13, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v14, -0x2

    invoke-direct {v13, v14, v14}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 42
    iput v8, v13, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 43
    invoke-virtual {v6, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 44
    const-string v13, "\u540d\u5355\u7ba1\u7406"

    invoke-virtual {v6, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    invoke-static {v1}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    move-result-object v13

    .line 46
    iget v13, v13, Ls0/K;->f:I

    invoke-virtual {v6, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 47
    sget-object v13, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v6, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const/high16 v14, 0x41a00000    # 20.0f

    .line 48
    invoke-virtual {v6, v3, v14}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 49
    invoke-virtual {v11, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 50
    new-instance v6, Landroid/widget/TextView;

    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v14

    invoke-direct {v6, v14}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 51
    new-instance v14, Landroid/widget/FrameLayout$LayoutParams;

    invoke-static {v15}, LB0/a;->b(I)I

    move-result v15

    const/16 v16, 0x28

    move/from16 v17, v4

    invoke-static/range {v16 .. v16}, LB0/a;->b(I)I

    move-result v4

    invoke-direct {v14, v15, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const v4, 0x800015

    .line 52
    iput v4, v14, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 53
    invoke-virtual {v6, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 54
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 55
    const-string v4, "\u6dfb\u52a0"

    invoke-virtual {v6, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    invoke-static {v1}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    const v4, -0xe95665

    .line 57
    invoke-virtual {v6, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 58
    invoke-virtual {v6, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const/high16 v8, 0x41800000    # 16.0f

    .line 59
    invoke-virtual {v6, v3, v8}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 60
    invoke-static {v1}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 61
    invoke-static {v4}, Landroid/graphics/Color;->red(I)I

    move-result v3

    invoke-static {v4}, Landroid/graphics/Color;->green(I)I

    move-result v8

    invoke-static {v4}, Landroid/graphics/Color;->blue(I)I

    move-result v4

    const/16 v13, 0x1e

    invoke-static {v13, v3, v8, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v3

    const/16 v4, 0x12

    .line 62
    invoke-static {v4}, LB0/a;->b(I)I

    move-result v4

    invoke-static {v0, v3, v4}, Li/q1;->b(Li/q1;II)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v3

    invoke-virtual {v6, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 63
    new-instance v3, Ls0/c;

    invoke-direct {v3, v0, v5}, Ls0/c;-><init>(Li/q1;I)V

    invoke-virtual {v6, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 64
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    int-to-float v2, v2

    .line 65
    invoke-virtual {v3, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 66
    invoke-virtual {v3, v7}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 67
    invoke-virtual {v3, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 68
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 69
    invoke-static {v12}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v8

    invoke-virtual {v4, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 70
    invoke-virtual {v4, v7}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 71
    invoke-virtual {v4, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 72
    new-instance v2, Landroid/graphics/drawable/RippleDrawable;

    const v8, 0x33aaaaaa

    invoke-static {v8}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v8

    invoke-direct {v2, v8, v3, v4}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 73
    invoke-virtual {v6, v5}, Landroid/view/View;->setClickable(Z)V

    .line 74
    invoke-virtual {v6, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 75
    invoke-virtual {v11, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 76
    invoke-virtual {v10, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 77
    new-instance v2, Ls0/g;

    invoke-direct {v2, v0}, Ls0/g;-><init>(Li/q1;)V

    iput-object v2, v0, Li/q1;->c:Ljava/lang/Object;

    .line 78
    new-instance v2, Landroid/widget/ListView;

    invoke-direct {v2, v1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 79
    iput-object v2, v0, Li/q1;->d:Ljava/lang/Object;

    .line 80
    invoke-virtual {v2, v7}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 81
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v3, v12, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v4, 0x3f800000    # 1.0f

    .line 82
    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 83
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 84
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    move-result v3

    const/16 v4, 0xc

    invoke-static {v4}, LB0/a;->b(I)I

    move-result v4

    invoke-virtual {v2, v7, v3, v7, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 85
    invoke-static {v1}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    move-result-object v3

    .line 86
    iget v3, v3, Ls0/K;->d:I

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 87
    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    .line 88
    invoke-static {v1}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    move-result-object v1

    .line 89
    iget v1, v1, Ls0/K;->i:I

    invoke-direct {v3, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v2, v3}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 90
    invoke-static {v5}, LB0/a;->b(I)I

    move-result v1

    invoke-virtual {v2, v1}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 91
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v1, v7}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v2, v1}, Landroid/widget/AbsListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    .line 92
    iget-object v1, v0, Li/q1;->c:Ljava/lang/Object;

    check-cast v1, Ls0/g;

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v2, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 93
    invoke-virtual {v10, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 94
    invoke-direct {v9, v10}, Lt0/e;-><init>(Landroid/widget/LinearLayout;)V

    iput-object v9, v0, Li/q1;->a:Landroid/view/View;

    .line 95
    iget-object v1, v0, Li/q1;->d:Ljava/lang/Object;

    check-cast v1, Landroid/widget/ListView;

    if-eqz v1, :cond_0

    invoke-virtual {v9, v1}, Lt0/e;->setNeedScrollChild(Landroid/view/View;)V

    .line 96
    new-instance v1, Ls0/b;

    invoke-direct {v1, v0, v7}, Ls0/b;-><init>(Li/q1;I)V

    invoke-virtual {v9, v1}, Lt0/c;->setOnDismissListener(LM0/l;)V

    return-void

    .line 97
    :cond_0
    const-string v1, "listView"

    invoke-static {v1}, LN0/g;->g(Ljava/lang/String;)V

    throw v3

    .line 98
    :cond_1
    const-string v1, "listAdapter"

    invoke-static {v1}, LN0/g;->g(Ljava/lang/String;)V

    throw v3
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    iput-object v0, p0, Li/q1;->d:Ljava/lang/Object;

    .line 109
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Li/q1;->e:Ljava/lang/Object;

    const/4 v1, 0x2

    .line 110
    new-array v2, v1, [I

    iput-object v2, p0, Li/q1;->f:Ljava/lang/Object;

    .line 111
    new-array v1, v1, [I

    iput-object v1, p0, Li/q1;->g:Ljava/lang/Object;

    .line 112
    iput-object p1, p0, Li/q1;->b:Ljava/lang/Object;

    .line 113
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c001b

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Li/q1;->c:Ljava/lang/Object;

    const v2, 0x7f09006a

    .line 114
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Li/q1;->a:Landroid/view/View;

    .line 115
    const-class v1, Li/q1;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/WindowManager$LayoutParams;->setTitle(Ljava/lang/CharSequence;)V

    .line 116
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Landroid/view/WindowManager$LayoutParams;->packageName:Ljava/lang/String;

    const/16 p1, 0x3ea

    .line 117
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    const/4 p1, -0x2

    .line 118
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 119
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    const/4 p1, -0x3

    .line 120
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    const p1, 0x7f100004

    .line 121
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    const/16 p1, 0x18

    .line 122
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    return-void
.end method

.method public constructor <init>(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    iput-object p2, p0, Li/q1;->b:Ljava/lang/Object;

    .line 101
    iput-object p3, p0, Li/q1;->a:Landroid/view/View;

    .line 102
    iput-object p4, p0, Li/q1;->c:Ljava/lang/Object;

    .line 103
    iput-object p5, p0, Li/q1;->d:Ljava/lang/Object;

    .line 104
    iput-object p6, p0, Li/q1;->e:Ljava/lang/Object;

    .line 105
    iput-object p7, p0, Li/q1;->f:Ljava/lang/Object;

    .line 106
    iput-object p8, p0, Li/q1;->g:Ljava/lang/Object;

    return-void
.end method

.method public static final a(Li/q1;I)V
    .locals 2

    .line 1
    if-ltz p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, Li/q1;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ls0/g;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, v0, Ln0/b;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-lt p1, v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 19
    .line 20
    iget-object v1, p0, Li/q1;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Landroid/app/Activity;

    .line 23
    .line 24
    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 25
    .line 26
    .line 27
    const-string v1, "\u662f\u5426\u5220\u9664\uff1f"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v1, "\u5220\u9664\u540e\u8be5\u597d\u53cb\u4f1a\u4ece\u9690\u85cf\u540d\u5355\u4e2d\u79fb\u9664\u3002"

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v1, Ls0/d;

    .line 40
    .line 41
    invoke-direct {v1, p0, p1}, Ls0/d;-><init>(Li/q1;I)V

    .line 42
    .line 43
    .line 44
    const-string p0, "\u786e\u5b9a"

    .line 45
    .line 46
    invoke-virtual {v0, p0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    new-instance p1, LA0/s;

    .line 51
    .line 52
    const/4 v0, 0x2

    .line 53
    invoke-direct {p1, v0}, LA0/s;-><init>(I)V

    .line 54
    .line 55
    .line 56
    const-string v0, "\u53d6\u6d88"

    .line 57
    .line 58
    invoke-virtual {p0, v0, p1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_1
    const-string p0, "listAdapter"

    .line 67
    .line 68
    invoke-static {p0}, LN0/g;->g(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x0

    .line 72
    throw p0

    .line 73
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public static b(Li/q1;II)Landroid/graphics/drawable/GradientDrawable;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, LB0/a;->b(I)I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance p0, Landroid/graphics/drawable/GradientDrawable;

    .line 9
    .line 10
    invoke-direct {p0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 18
    .line 19
    .line 20
    int-to-float p1, p2

    .line 21
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 22
    .line 23
    .line 24
    return-object p0
.end method
