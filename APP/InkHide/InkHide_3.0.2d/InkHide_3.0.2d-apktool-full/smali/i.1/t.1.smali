.class public final Li/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7f08004b

    const v1, 0x7f080001

    const v2, 0x7f08004d

    .line 110
    filled-new-array {v2, v0, v1}, [I

    move-result-object v0

    iput-object v0, p0, Li/t;->a:Ljava/lang/Object;

    const/4 v0, 0x7

    .line 111
    new-array v1, v0, [I

    fill-array-data v1, :array_0

    iput-object v1, p0, Li/t;->b:Ljava/lang/Object;

    .line 112
    new-array v0, v0, [I

    fill-array-data v0, :array_1

    iput-object v0, p0, Li/t;->c:Ljava/lang/Object;

    const v0, 0x7f080010

    const v1, 0x7f080031

    const v2, 0x7f080032

    .line 113
    filled-new-array {v2, v0, v1}, [I

    move-result-object v0

    iput-object v0, p0, Li/t;->d:Ljava/lang/Object;

    const v0, 0x7f080044

    const v1, 0x7f08004e

    .line 114
    filled-new-array {v0, v1}, [I

    move-result-object v0

    iput-object v0, p0, Li/t;->e:Ljava/lang/Object;

    const v0, 0x7f080005

    const v1, 0x7f08000b

    const v2, 0x7f080004

    const v3, 0x7f08000a

    .line 115
    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    iput-object v0, p0, Li/t;->f:Ljava/lang/Object;

    return-void

    nop

    :array_0
    .array-data 4
        0x7f080019
        0x7f08003c
        0x7f080020
        0x7f08001b
        0x7f08001c
        0x7f08001f
        0x7f08001e
    .end array-data

    :array_1
    .array-data 4
        0x7f08004a
        0x7f08004c
        0x7f080012
        0x7f080046
        0x7f080047
        0x7f080048
        0x7f080049
    .end array-data
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x4

    const/4 v3, 0x2

    const/16 v4, 0x8

    const/4 v5, 0x0

    const/4 v6, 0x1

    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Li/t;->a:Ljava/lang/Object;

    .line 9
    new-instance v8, Lt0/e;

    .line 10
    new-instance v9, Landroid/widget/LinearLayout;

    invoke-direct {v9, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 11
    new-instance v10, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v11, -0x1

    invoke-direct {v10, v11, v11}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    invoke-virtual {v9, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 12
    invoke-virtual {v9, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 13
    invoke-static {v1}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    move-result-object v10

    const/16 v12, 0x16

    .line 14
    invoke-static {v12}, LB0/a;->b(I)I

    move-result v12

    iget v10, v10, Ls0/K;->d:I

    const/4 v13, 0x0

    const/16 v14, 0xc

    invoke-static {v0, v10, v12, v13, v14}, Li/t;->o(Li/t;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v10

    invoke-virtual {v9, v10}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 15
    invoke-virtual {v9, v6}, Landroid/view/View;->setClipToOutline(Z)V

    .line 16
    new-instance v10, Landroid/widget/FrameLayout;

    invoke-direct {v10, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 17
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v15, 0x48

    const/16 v16, 0x0

    invoke-static {v15}, LB0/a;->b(I)I

    move-result v7

    invoke-direct {v12, v11, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v7, 0x10

    .line 18
    iput v7, v12, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 19
    invoke-virtual {v10, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v7, 0x18

    .line 20
    invoke-static {v7}, LB0/a;->b(I)I

    move-result v12

    invoke-static {v7}, LB0/a;->b(I)I

    move-result v7

    invoke-virtual {v10, v12, v5, v7, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 21
    new-instance v7, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v7}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 22
    invoke-virtual {v7, v5}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 23
    invoke-static {v1}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    move-result-object v12

    .line 24
    iget v12, v12, Ls0/K;->b:I

    invoke-virtual {v7, v12}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v12, 0x41b00000    # 22.0f

    .line 25
    invoke-static {v12}, LB0/a;->a(F)F

    move-result v17

    invoke-static {v12}, LB0/a;->a(F)F

    move-result v18

    invoke-static {v12}, LB0/a;->a(F)F

    move-result v19

    invoke-static {v12}, LB0/a;->a(F)F

    move-result v12

    move/from16 v20, v14

    new-array v14, v4, [F

    aput v17, v14, v5

    aput v18, v14, v6

    aput v19, v14, v3

    const/16 v17, 0x3

    aput v12, v14, v17

    aput v16, v14, v2

    const/4 v12, 0x5

    aput v16, v14, v12

    const/4 v12, 0x6

    aput v16, v14, v12

    const/4 v12, 0x7

    aput v16, v14, v12

    invoke-virtual {v7, v14}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    .line 26
    invoke-virtual {v10, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 27
    new-instance v7, Landroid/widget/TextView;

    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v12

    invoke-direct {v7, v12}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 28
    new-instance v12, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v14, 0x30

    invoke-static {v14}, LB0/a;->b(I)I

    move-result v14

    invoke-direct {v12, v14, v11}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const v14, 0x800003

    .line 29
    iput v14, v12, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 30
    invoke-virtual {v7, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v12, 0x11

    .line 31
    invoke-virtual {v7, v12}, Landroid/widget/TextView;->setGravity(I)V

    .line 32
    const-string v14, "\u2039"

    invoke-virtual {v7, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    invoke-static {v1}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    move-result-object v14

    .line 34
    iget v14, v14, Ls0/K;->f:I

    invoke-virtual {v7, v14}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v14, 0x42000000    # 32.0f

    .line 35
    invoke-virtual {v7, v3, v14}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 36
    new-instance v14, Ls0/m;

    invoke-direct {v14, v0, v5}, Ls0/m;-><init>(Li/t;I)V

    invoke-virtual {v7, v14}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 37
    invoke-virtual {v10, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 38
    new-instance v7, Landroid/widget/TextView;

    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v14

    invoke-direct {v7, v14}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 39
    new-instance v14, Landroid/widget/FrameLayout$LayoutParams;

    move/from16 v16, v15

    const/4 v15, -0x2

    invoke-direct {v14, v15, v15}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 40
    iput v12, v14, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 41
    invoke-virtual {v7, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 42
    const-string v14, "\u9690\u85cf\u5185\u5bb9\u7ba1\u7406"

    invoke-virtual {v7, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 43
    invoke-static {v1}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    move-result-object v14

    .line 44
    iget v14, v14, Ls0/K;->f:I

    invoke-virtual {v7, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 45
    sget-object v14, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v7, v14}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const/high16 v15, 0x41a00000    # 20.0f

    .line 46
    invoke-virtual {v7, v3, v15}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 47
    invoke-virtual {v10, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 48
    new-instance v7, Landroid/widget/TextView;

    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v15

    invoke-direct {v7, v15}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 49
    iput-object v7, v0, Li/t;->e:Ljava/lang/Object;

    .line 50
    new-instance v15, Landroid/widget/FrameLayout$LayoutParams;

    move/from16 v17, v11

    invoke-static/range {v16 .. v16}, LB0/a;->b(I)I

    move-result v11

    const/16 v16, 0x28

    invoke-static/range {v16 .. v16}, LB0/a;->b(I)I

    move-result v5

    invoke-direct {v15, v11, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const v5, 0x800015

    .line 51
    iput v5, v15, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 52
    invoke-virtual {v7, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 53
    invoke-virtual {v7, v12}, Landroid/widget/TextView;->setGravity(I)V

    .line 54
    const-string v5, "\u6e05\u7a7a"

    invoke-virtual {v7, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 55
    invoke-static {v1}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    const v5, -0x25a28b

    .line 56
    invoke-virtual {v7, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 57
    invoke-virtual {v7, v14}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const/high16 v11, 0x41800000    # 16.0f

    .line 58
    invoke-virtual {v7, v3, v11}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 59
    invoke-static {v1}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 60
    invoke-static {v5}, Landroid/graphics/Color;->red(I)I

    move-result v14

    invoke-static {v5}, Landroid/graphics/Color;->green(I)I

    move-result v15

    invoke-static {v5}, Landroid/graphics/Color;->blue(I)I

    move-result v5

    const/16 v3, 0x1e

    invoke-static {v3, v14, v15, v5}, Landroid/graphics/Color;->argb(IIII)I

    move-result v3

    const/16 v5, 0x12

    .line 61
    invoke-static {v5}, LB0/a;->b(I)I

    move-result v5

    invoke-static {v0, v3, v5, v13, v4}, Li/t;->o(Li/t;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v3

    invoke-virtual {v7, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 62
    new-instance v3, Ls0/m;

    invoke-direct {v3, v0, v6}, Ls0/m;-><init>(Li/t;I)V

    invoke-virtual {v7, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    int-to-float v2, v2

    .line 64
    invoke-virtual {v3, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    const/4 v5, 0x0

    .line 65
    invoke-virtual {v3, v5}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 66
    invoke-virtual {v3, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 67
    new-instance v14, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v14}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 68
    invoke-static/range {v17 .. v17}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v15

    invoke-virtual {v14, v15}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 69
    invoke-virtual {v14, v5}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 70
    invoke-virtual {v14, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 71
    new-instance v2, Landroid/graphics/drawable/RippleDrawable;

    const v5, 0x33aaaaaa

    invoke-static {v5}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v5

    invoke-direct {v2, v5, v3, v14}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 72
    invoke-virtual {v7, v6}, Landroid/view/View;->setClickable(Z)V

    .line 73
    invoke-virtual {v7, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 74
    invoke-virtual {v10, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 75
    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 76
    new-instance v2, Landroid/widget/FrameLayout;

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 77
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    move/from16 v5, v17

    const/4 v7, 0x0

    invoke-direct {v3, v5, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v5, 0x3f800000    # 1.0f

    .line 78
    iput v5, v3, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 79
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 80
    new-instance v3, Ls0/g;

    invoke-direct {v3, v0}, Ls0/g;-><init>(Li/t;)V

    iput-object v3, v0, Li/t;->b:Ljava/lang/Object;

    .line 81
    new-instance v3, Landroid/widget/ListView;

    invoke-direct {v3, v1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 82
    iput-object v3, v0, Li/t;->c:Ljava/lang/Object;

    const/4 v5, 0x0

    .line 83
    invoke-virtual {v3, v5}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 84
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v10, -0x1

    invoke-direct {v7, v10, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 85
    invoke-static {v4}, LB0/a;->b(I)I

    move-result v4

    invoke-static/range {v20 .. v20}, LB0/a;->b(I)I

    move-result v7

    invoke-virtual {v3, v5, v4, v5, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 86
    invoke-static {v1}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    move-result-object v4

    .line 87
    iget v4, v4, Ls0/K;->d:I

    invoke-virtual {v3, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 88
    new-instance v4, Landroid/graphics/drawable/ColorDrawable;

    .line 89
    invoke-static {v1}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    move-result-object v5

    .line 90
    iget v5, v5, Ls0/K;->i:I

    invoke-direct {v4, v5}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v3, v4}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 91
    invoke-static {v6}, LB0/a;->b(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 92
    new-instance v4, Landroid/graphics/drawable/ColorDrawable;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v3, v4}, Landroid/widget/AbsListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    .line 93
    iget-object v4, v0, Li/t;->b:Ljava/lang/Object;

    check-cast v4, Ls0/g;

    if-eqz v4, :cond_1

    invoke-virtual {v3, v4}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 94
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 95
    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 96
    iput-object v3, v0, Li/t;->d:Ljava/lang/Object;

    .line 97
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v5, -0x1

    invoke-direct {v4, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 98
    invoke-virtual {v3, v12}, Landroid/widget/TextView;->setGravity(I)V

    .line 99
    const-string v4, "\u6682\u65e0\u9690\u85cf\u7684\u81ea\u5df1\u670b\u53cb\u5708\u5185\u5bb9"

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 100
    invoke-static {v1}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    move-result-object v1

    .line 101
    iget v1, v1, Ls0/K;->g:I

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v1, 0x2

    .line 102
    invoke-virtual {v3, v1, v11}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 103
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 104
    invoke-virtual {v9, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 105
    invoke-virtual {v0}, Li/t;->n()V

    .line 106
    invoke-direct {v8, v9}, Lt0/e;-><init>(Landroid/widget/LinearLayout;)V

    iput-object v8, v0, Li/t;->f:Ljava/lang/Object;

    .line 107
    iget-object v1, v0, Li/t;->c:Ljava/lang/Object;

    check-cast v1, Landroid/widget/ListView;

    if-eqz v1, :cond_0

    invoke-virtual {v8, v1}, Lt0/e;->setNeedScrollChild(Landroid/view/View;)V

    return-void

    :cond_0
    const-string v1, "listView"

    invoke-static {v1}, LN0/g;->g(Ljava/lang/String;)V

    throw v13

    .line 108
    :cond_1
    const-string v1, "listAdapter"

    invoke-static {v1}, LN0/g;->g(Ljava/lang/String;)V

    throw v13
.end method

.method public constructor <init>(Lr0/k0;Lr0/k0;Lr0/k0;Lr0/k0;Lr0/k0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Li/t;->a:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Li/t;->b:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, Li/t;->c:Ljava/lang/Object;

    .line 5
    iput-object p4, p0, Li/t;->d:Ljava/lang/Object;

    .line 6
    iput-object p5, p0, Li/t;->e:Ljava/lang/Object;

    .line 7
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Li/t;->f:Ljava/lang/Object;

    return-void
.end method

.method public static final a(Li/t;Ljava/lang/String;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string p0, "sns:"

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-static {p1, v0, p0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    return v0

    .line 14
    :cond_0
    const-string p0, "local:"

    .line 15
    .line 16
    invoke-static {p1, v0, p0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    :cond_1
    const-string p0, "localStr:"

    .line 25
    .line 26
    invoke-static {p1, v0, p0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_2

    .line 31
    .line 32
    const/4 p0, 0x2

    .line 33
    return p0

    .line 34
    :cond_2
    const/4 p0, 0x3

    .line 35
    return p0
.end method

.method public static final b(Li/t;I)V
    .locals 4

    .line 1
    if-ltz p1, :cond_4

    .line 2
    .line 3
    iget-object v0, p0, Li/t;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ls0/g;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, "listAdapter"

    .line 9
    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    iget-object v0, v0, Ln0/b;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-lt p1, v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v0, p0, Li/t;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Ls0/g;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget-object v0, v0, Ln0/b;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ls0/o;

    .line 34
    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    :goto_0
    return-void

    .line 38
    :cond_1
    new-instance v2, Landroid/app/AlertDialog$Builder;

    .line 39
    .line 40
    iget-object v3, p0, Li/t;->a:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, Landroid/app/Activity;

    .line 43
    .line 44
    invoke-direct {v2, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 45
    .line 46
    .line 47
    const-string v3, "\u6062\u590d\u6b64\u6761\u5185\u5bb9\uff1f"

    .line 48
    .line 49
    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    const-string v3, "\u6062\u590d\u540e\uff0c\u8fd9\u6761\u5185\u5bb9\u5bf9\u5e94\u7684\u9690\u85cf\u6807\u8bc6\u5c06\u4e0d\u518d\u751f\u6548\u3002"

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    new-instance v3, Ls0/n;

    .line 60
    .line 61
    invoke-direct {v3, v0, p0, p1}, Ls0/n;-><init>(Ls0/o;Li/t;I)V

    .line 62
    .line 63
    .line 64
    const-string p0, "\u786e\u5b9a"

    .line 65
    .line 66
    invoke-virtual {v2, p0, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    const-string p1, "\u53d6\u6d88"

    .line 71
    .line 72
    invoke-virtual {p0, p1, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_2
    invoke-static {v2}, LN0/g;->g(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v1

    .line 84
    :cond_3
    invoke-static {v2}, LN0/g;->g(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v1

    .line 88
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public static c([II)Z
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_1

    .line 5
    .line 6
    aget v3, p0, v2

    .line 7
    .line 8
    if-ne v3, p1, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    return v1
.end method

.method public static final f(ILjava/util/LinkedHashSet;II)V
    .locals 1

    .line 1
    :goto_0
    if-ge p2, p3, :cond_1

    .line 2
    .line 3
    if-ltz p2, :cond_0

    .line 4
    .line 5
    if-ge p2, p0, :cond_0

    .line 6
    .line 7
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    :cond_0
    add-int/lit8 p2, p2, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    return-void
.end method

.method public static g(ILandroid/view/View;Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    const/4 v0, 0x3

    .line 5
    if-le p0, v0, :cond_1

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    :cond_2
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 18
    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    check-cast p1, Landroid/view/ViewGroup;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_3
    const/4 p1, 0x0

    .line 25
    :goto_0
    if-nez p1, :cond_4

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_4
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x0

    .line 33
    :goto_1
    if-ge v1, v0, :cond_5

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    add-int/lit8 v3, p0, 0x1

    .line 40
    .line 41
    invoke-static {v3, v2, p2}, Li/t;->g(ILandroid/view/View;Ljava/util/ArrayList;)V

    .line 42
    .line 43
    .line 44
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_5
    :goto_2
    return-void
.end method

.method public static h(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 6

    .line 1
    const v0, 0x7f040055

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Li/d1;->c(Landroid/content/Context;I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const v1, 0x7f040053

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v1}, Li/d1;->b(Landroid/content/Context;I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    sget-object v1, Li/d1;->b:[I

    .line 16
    .line 17
    sget-object v2, Li/d1;->d:[I

    .line 18
    .line 19
    invoke-static {v0, p1}, Lr/a;->b(II)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    sget-object v4, Li/d1;->c:[I

    .line 24
    .line 25
    invoke-static {v0, p1}, Lr/a;->b(II)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    sget-object v5, Li/d1;->f:[I

    .line 30
    .line 31
    filled-new-array {v1, v2, v4, v5}, [[I

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    filled-new-array {p0, v3, v0, p1}, [I

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    new-instance p1, Landroid/content/res/ColorStateList;

    .line 40
    .line 41
    invoke-direct {p1, v1, p0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 42
    .line 43
    .line 44
    return-object p1
.end method

.method public static i(Landroid/view/View;)Landroid/view/View;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Landroid/view/View;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Landroid/view/View;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p0, v1

    .line 14
    :goto_0
    if-eqz p0, :cond_4

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_1
    if-eqz v0, :cond_3

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-string v3, "androidx.recyclerview.widget.RecyclerView"

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_2

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const-string v3, "android.support.v7.widget.RecyclerView"

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-nez v2, :cond_2

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    const-string v3, ".RecyclerView"

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-nez v2, :cond_2

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    const-string v3, ".WxRecyclerView"

    .line 63
    .line 64
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_1

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    goto :goto_1

    .line 76
    :cond_2
    :goto_2
    return-object p0

    .line 77
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    instance-of v0, p0, Landroid/view/View;

    .line 82
    .line 83
    if-eqz v0, :cond_0

    .line 84
    .line 85
    check-cast p0, Landroid/view/View;

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_4
    return-object v1
.end method

.method public static j(Li/N0;Landroid/content/Context;I)Landroid/graphics/drawable/LayerDrawable;
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-virtual {v2, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    const v2, 0x7f080040

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1, v2}, Li/N0;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const v3, 0x7f080041

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1, v3}, Li/N0;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    instance-of p1, v2, Landroid/graphics/drawable/BitmapDrawable;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-ne p1, p2, :cond_0

    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-ne p1, p2, :cond_0

    .line 41
    .line 42
    check-cast v2, Landroid/graphics/drawable/BitmapDrawable;

    .line 43
    .line 44
    new-instance p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 45
    .line 46
    invoke-virtual {v2}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-direct {p1, v4}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    sget-object p1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 55
    .line 56
    invoke-static {p2, p2, p1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance v4, Landroid/graphics/Canvas;

    .line 61
    .line 62
    invoke-direct {v4, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v3, v3, p2, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v4}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 69
    .line 70
    .line 71
    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    .line 72
    .line 73
    invoke-direct {v2, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    .line 74
    .line 75
    .line 76
    new-instance v4, Landroid/graphics/drawable/BitmapDrawable;

    .line 77
    .line 78
    invoke-direct {v4, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    .line 79
    .line 80
    .line 81
    move-object p1, v4

    .line 82
    :goto_0
    sget-object v4, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    .line 83
    .line 84
    invoke-virtual {p1, v4}, Landroid/graphics/drawable/BitmapDrawable;->setTileModeX(Landroid/graphics/Shader$TileMode;)V

    .line 85
    .line 86
    .line 87
    instance-of v4, p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 88
    .line 89
    if-eqz v4, :cond_1

    .line 90
    .line 91
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-ne v4, p2, :cond_1

    .line 96
    .line 97
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-ne v4, p2, :cond_1

    .line 102
    .line 103
    check-cast p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_1
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 107
    .line 108
    invoke-static {p2, p2, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    new-instance v5, Landroid/graphics/Canvas;

    .line 113
    .line 114
    invoke-direct {v5, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, v3, v3, p2, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, v5}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 121
    .line 122
    .line 123
    new-instance p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 124
    .line 125
    invoke-direct {p0, v4}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    .line 126
    .line 127
    .line 128
    :goto_1
    new-instance p2, Landroid/graphics/drawable/LayerDrawable;

    .line 129
    .line 130
    const/4 v4, 0x3

    .line 131
    new-array v4, v4, [Landroid/graphics/drawable/Drawable;

    .line 132
    .line 133
    aput-object v2, v4, v3

    .line 134
    .line 135
    aput-object p0, v4, v1

    .line 136
    .line 137
    aput-object p1, v4, v0

    .line 138
    .line 139
    invoke-direct {p2, v4}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 140
    .line 141
    .line 142
    const/high16 p0, 0x1020000

    .line 143
    .line 144
    invoke-virtual {p2, v3, p0}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    .line 145
    .line 146
    .line 147
    const p0, 0x102000f

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2, v1, p0}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    .line 151
    .line 152
    .line 153
    const p0, 0x102000d

    .line 154
    .line 155
    .line 156
    invoke-virtual {p2, v0, p0}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    .line 157
    .line 158
    .line 159
    return-object p2
.end method

.method public static m(Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-static {p0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "\\d+"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "compile(...)"

    .line 16
    .line 17
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v2, "input"

    .line 21
    .line 22
    invoke-static {p0, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    const-string v0, "[0-9a-fA-F]{8,}"

    .line 36
    .line 37
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    const-string v0, "sns:"

    .line 55
    .line 56
    const/4 v1, 0x0

    .line 57
    invoke-static {p0, v1, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_1

    .line 62
    .line 63
    const-string v0, "local:"

    .line 64
    .line 65
    invoke-static {p0, v1, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_1

    .line 70
    .line 71
    const-string v0, "localStr:"

    .line 72
    .line 73
    invoke-static {p0, v1, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-eqz p0, :cond_0

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_0
    return v1

    .line 81
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 82
    return p0
.end method

.method public static o(Li/t;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;
    .locals 1

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p3, p0, Li/t;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p3, Landroid/app/Activity;

    .line 8
    .line 9
    invoke-static {p3}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    iget p3, p3, Ls0/K;->i:I

    .line 14
    .line 15
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    :cond_0
    const/4 p4, 0x1

    .line 20
    invoke-static {p4}, LB0/a;->b(I)I

    .line 21
    .line 22
    .line 23
    move-result p4

    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance p0, Landroid/graphics/drawable/GradientDrawable;

    .line 28
    .line 29
    invoke-direct {p0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 37
    .line 38
    .line 39
    int-to-float p1, p2

    .line 40
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 41
    .line 42
    .line 43
    if-eqz p3, :cond_1

    .line 44
    .line 45
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-virtual {p0, p4, p1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 50
    .line 51
    .line 52
    :cond_1
    return-object p0
.end method

.method public static p(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    sget-object v0, Li/p0;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    sget-object p2, Li/u;->b:Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    :cond_0
    sget-object v0, Li/u;->b:Landroid/graphics/PorterDuff$Mode;

    .line 12
    .line 13
    const-class v0, Li/u;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    invoke-static {p1, p2}, Li/N0;->e(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    .line 17
    .line 18
    .line 19
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    monitor-exit v0

    .line 21
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    throw p0
.end method


# virtual methods
.method public d(Landroid/widget/ListView;Ljava/lang/Object;)Lr0/l;
    .locals 13

    .line 1
    const-string v0, "listView"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "adapter"

    .line 7
    .line 8
    invoke-static {p2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    instance-of v0, p2, Landroid/widget/ListAdapter;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    move-object v0, p2

    .line 17
    check-cast v0, Landroid/widget/ListAdapter;

    .line 18
    .line 19
    move-object v2, v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v2, v1

    .line 22
    :goto_0
    if-nez v2, :cond_1

    .line 23
    .line 24
    new-instance v0, Lr0/m;

    .line 25
    .line 26
    invoke-direct {v0}, Lr0/m;-><init>()V

    .line 27
    .line 28
    .line 29
    goto/16 :goto_7

    .line 30
    .line 31
    :cond_1
    :try_start_0
    invoke-interface {v2}, Landroid/widget/Adapter;->getCount()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    new-instance v3, LE0/d;

    .line 42
    .line 43
    invoke-direct {v3, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    move-object v0, v3

    .line 47
    :goto_1
    const/4 v3, 0x0

    .line 48
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    instance-of v5, v0, LE0/d;

    .line 53
    .line 54
    if-eqz v5, :cond_2

    .line 55
    .line 56
    move-object v0, v4

    .line 57
    :cond_2
    check-cast v0, Ljava/lang/Number;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-gtz v4, :cond_3

    .line 64
    .line 65
    new-instance v0, Lr0/m;

    .line 66
    .line 67
    invoke-direct {v0}, Lr0/m;-><init>()V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_7

    .line 71
    .line 72
    :cond_3
    new-instance v5, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 78
    .line 79
    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 80
    .line 81
    .line 82
    new-instance v7, Ljava/util/LinkedHashSet;

    .line 83
    .line 84
    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    .line 85
    .line 86
    .line 87
    const/16 v0, 0x8

    .line 88
    .line 89
    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    invoke-static {v4, v7, v3, v0}, Li/t;->f(ILjava/util/LinkedHashSet;II)V

    .line 94
    .line 95
    .line 96
    :try_start_1
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 104
    goto :goto_2

    .line 105
    :catchall_1
    move-exception v0

    .line 106
    new-instance v8, LE0/d;

    .line 107
    .line 108
    invoke-direct {v8, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    move-object v0, v8

    .line 112
    :goto_2
    const/4 v8, -0x1

    .line 113
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    instance-of v10, v0, LE0/d;

    .line 118
    .line 119
    if-eqz v10, :cond_4

    .line 120
    .line 121
    move-object v0, v9

    .line 122
    :cond_4
    check-cast v0, Ljava/lang/Number;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    :try_start_2
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getLastVisiblePosition()I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 136
    goto :goto_3

    .line 137
    :catchall_2
    move-exception v0

    .line 138
    new-instance v10, LE0/d;

    .line 139
    .line 140
    invoke-direct {v10, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    move-object v0, v10

    .line 144
    :goto_3
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v8

    .line 148
    instance-of v10, v0, LE0/d;

    .line 149
    .line 150
    if-eqz v10, :cond_5

    .line 151
    .line 152
    move-object v0, v8

    .line 153
    :cond_5
    check-cast v0, Ljava/lang/Number;

    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-ltz v9, :cond_6

    .line 160
    .line 161
    if-lt v0, v9, :cond_6

    .line 162
    .line 163
    add-int/lit8 v0, v0, 0x1

    .line 164
    .line 165
    invoke-static {v4, v7, v9, v0}, Li/t;->f(ILjava/util/LinkedHashSet;II)V

    .line 166
    .line 167
    .line 168
    :cond_6
    const/16 v0, 0xc

    .line 169
    .line 170
    if-le v4, v0, :cond_7

    .line 171
    .line 172
    div-int/lit8 v0, v4, 0x2

    .line 173
    .line 174
    add-int/lit8 v8, v0, -0x2

    .line 175
    .line 176
    add-int/lit8 v0, v0, 0x2

    .line 177
    .line 178
    invoke-static {v4, v7, v8, v0}, Li/t;->f(ILjava/util/LinkedHashSet;II)V

    .line 179
    .line 180
    .line 181
    :cond_7
    const/16 v0, 0x18

    .line 182
    .line 183
    invoke-static {v7, v0}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    :cond_8
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-eqz v0, :cond_d

    .line 196
    .line 197
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    check-cast v0, Ljava/lang/Number;

    .line 202
    .line 203
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    :try_start_3
    invoke-interface {v2, v0}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 211
    goto :goto_5

    .line 212
    :catchall_3
    move-exception v0

    .line 213
    new-instance v7, LE0/d;

    .line 214
    .line 215
    invoke-direct {v7, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 216
    .line 217
    .line 218
    move-object v0, v7

    .line 219
    :goto_5
    nop

    .line 220
    instance-of v7, v0, LE0/d;

    .line 221
    .line 222
    if-eqz v7, :cond_9

    .line 223
    .line 224
    move-object v0, v1

    .line 225
    :cond_9
    if-nez v0, :cond_a

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_a
    add-int/lit8 v3, v3, 0x1

    .line 229
    .line 230
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    move-result-object v7

    .line 234
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v7

    .line 238
    invoke-virtual {v6, v7}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    move-result-object v8

    .line 249
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v8

    .line 253
    iget-object v9, p0, Li/t;->e:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v9, Lr0/k0;

    .line 256
    .line 257
    invoke-virtual {v9, v7, v8, v0}, Lr0/k0;->b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Boolean;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 262
    .line 263
    .line 264
    move-result v7

    .line 265
    if-eqz v7, :cond_8

    .line 266
    .line 267
    iget-object v7, p0, Li/t;->d:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v7, Lr0/k0;

    .line 270
    .line 271
    invoke-virtual {v7, v0}, Lr0/k0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    check-cast v0, Ljava/lang/String;

    .line 276
    .line 277
    if-eqz v0, :cond_8

    .line 278
    .line 279
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 280
    .line 281
    .line 282
    move-result v7

    .line 283
    if-nez v7, :cond_b

    .line 284
    .line 285
    goto :goto_6

    .line 286
    :cond_b
    move-object v0, v1

    .line 287
    :goto_6
    if-nez v0, :cond_c

    .line 288
    .line 289
    goto :goto_4

    .line 290
    :cond_c
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v7

    .line 294
    if-nez v7, :cond_8

    .line 295
    .line 296
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    goto :goto_4

    .line 300
    :cond_d
    new-instance v0, Lr0/m;

    .line 301
    .line 302
    invoke-static {v6}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    invoke-direct {v0, v5, v2, v3}, Lr0/m;-><init>(Ljava/util/List;Ljava/util/List;I)V

    .line 307
    .line 308
    .line 309
    :goto_7
    iget-object v2, v0, Lr0/m;->a:Ljava/util/List;

    .line 310
    .line 311
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    if-nez v3, :cond_e

    .line 316
    .line 317
    sget-object v3, Lr0/n;->e:Lr0/n;

    .line 318
    .line 319
    :goto_8
    move-object v12, v3

    .line 320
    goto :goto_9

    .line 321
    :cond_e
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    iget-object v4, p0, Li/t;->a:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v4, Lr0/k0;

    .line 328
    .line 329
    invoke-virtual {v4, v3}, Lr0/k0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    check-cast v3, Ljava/lang/Boolean;

    .line 334
    .line 335
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 336
    .line 337
    .line 338
    move-result v3

    .line 339
    if-eqz v3, :cond_f

    .line 340
    .line 341
    sget-object v3, Lr0/n;->a:Lr0/n;

    .line 342
    .line 343
    goto :goto_8

    .line 344
    :cond_f
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    iget-object v4, p0, Li/t;->b:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast v4, Lr0/k0;

    .line 351
    .line 352
    invoke-virtual {v4, v3}, Lr0/k0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v3

    .line 356
    check-cast v3, Ljava/lang/Boolean;

    .line 357
    .line 358
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 359
    .line 360
    .line 361
    move-result v3

    .line 362
    if-eqz v3, :cond_10

    .line 363
    .line 364
    sget-object v3, Lr0/n;->c:Lr0/n;

    .line 365
    .line 366
    goto :goto_8

    .line 367
    :cond_10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    move-result-object v3

    .line 371
    iget-object v4, p0, Li/t;->c:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v4, Lr0/k0;

    .line 374
    .line 375
    invoke-virtual {v4, v3}, Lr0/k0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    check-cast v3, Ljava/lang/Boolean;

    .line 380
    .line 381
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 382
    .line 383
    .line 384
    move-result v3

    .line 385
    if-eqz v3, :cond_11

    .line 386
    .line 387
    sget-object v3, Lr0/n;->b:Lr0/n;

    .line 388
    .line 389
    goto :goto_8

    .line 390
    :cond_11
    move-object v12, v1

    .line 391
    :goto_9
    if-nez v12, :cond_12

    .line 392
    .line 393
    return-object v1

    .line 394
    :cond_12
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    move-result-object v3

    .line 406
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v3

    .line 410
    new-instance v4, Ljava/lang/StringBuilder;

    .line 411
    .line 412
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    const-string v1, "@"

    .line 419
    .line 420
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 431
    .line 432
    .line 433
    move-result v3

    .line 434
    if-nez v3, :cond_13

    .line 435
    .line 436
    iget-object v3, p0, Li/t;->f:Ljava/lang/Object;

    .line 437
    .line 438
    check-cast v3, Ljava/util/HashSet;

    .line 439
    .line 440
    invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v1

    .line 444
    if-eqz v1, :cond_13

    .line 445
    .line 446
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v4

    .line 454
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 455
    .line 456
    .line 457
    move-result-object v1

    .line 458
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v5

    .line 462
    invoke-virtual {v0}, Lr0/m;->a()I

    .line 463
    .line 464
    .line 465
    move-result v1

    .line 466
    const-string v3, "confidence="

    .line 467
    .line 468
    invoke-static {v1, v3}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v6

    .line 472
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 473
    .line 474
    .line 475
    move-result v1

    .line 476
    const-string v3, "users="

    .line 477
    .line 478
    invoke-static {v1, v3}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v7

    .line 482
    invoke-static {v2}, LF0/k;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v8

    .line 486
    const-string v3, "runtime conversation surface accepted"

    .line 487
    .line 488
    filled-new-array/range {v3 .. v8}, [Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v1

    .line 492
    invoke-static {v1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 493
    .line 494
    .line 495
    :cond_13
    new-instance v4, Lr0/l;

    .line 496
    .line 497
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 498
    .line 499
    .line 500
    move-result-object v8

    .line 501
    invoke-virtual {v0}, Lr0/m;->a()I

    .line 502
    .line 503
    .line 504
    move-result v11

    .line 505
    iget-object v9, v0, Lr0/m;->a:Ljava/util/List;

    .line 506
    .line 507
    iget-object v10, v0, Lr0/m;->b:Ljava/util/List;

    .line 508
    .line 509
    const/4 v6, 0x0

    .line 510
    move-object v5, p1

    .line 511
    move-object v7, p2

    .line 512
    invoke-direct/range {v4 .. v12}, Lr0/l;-><init>(Landroid/widget/ListView;Landroid/view/View;Ljava/lang/Object;Ljava/lang/Class;Ljava/util/List;Ljava/util/List;ILr0/n;)V

    .line 513
    .line 514
    .line 515
    return-object v4
.end method

.method public e(Landroid/view/View;Ljava/lang/Object;Lr0/m;)Lr0/l;
    .locals 12

    .line 1
    iget-object v0, p3, Lr0/m;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    sget-object v1, Lr0/n;->e:Lr0/n;

    .line 11
    .line 12
    :goto_0
    move-object v11, v1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v3, p0, Li/t;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, Lr0/k0;

    .line 21
    .line 22
    invoke-virtual {v3, v1}, Lr0/k0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    sget-object v1, Lr0/n;->a:Lr0/n;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v3, p0, Li/t;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v3, Lr0/k0;

    .line 44
    .line 45
    invoke-virtual {v3, v1}, Lr0/k0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    sget-object v1, Lr0/n;->c:Lr0/n;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget-object v3, p0, Li/t;->c:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v3, Lr0/k0;

    .line 67
    .line 68
    invoke-virtual {v3, v1}, Lr0/k0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_3

    .line 79
    .line 80
    sget-object v1, Lr0/n;->b:Lr0/n;

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    move-object v11, v2

    .line 84
    :goto_1
    if-nez v11, :cond_4

    .line 85
    .line 86
    return-object v2

    .line 87
    :cond_4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    new-instance v3, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string v1, "@"

    .line 112
    .line 113
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-nez v2, :cond_5

    .line 128
    .line 129
    iget-object v2, p0, Li/t;->f:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v2, Ljava/util/HashSet;

    .line 132
    .line 133
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-eqz v1, :cond_5

    .line 138
    .line 139
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    invoke-virtual {p3}, Lr0/m;->a()I

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    const-string v2, "confidence="

    .line 160
    .line 161
    invoke-static {v1, v2}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    const-string v2, "users="

    .line 170
    .line 171
    invoke-static {v1, v2}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    invoke-static {v0}, LF0/k;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    const-string v2, "runtime recycler conversation surface accepted"

    .line 180
    .line 181
    filled-new-array/range {v2 .. v7}, [Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    :cond_5
    new-instance v3, Lr0/l;

    .line 189
    .line 190
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    invoke-virtual {p3}, Lr0/m;->a()I

    .line 195
    .line 196
    .line 197
    move-result v10

    .line 198
    iget-object v8, p3, Lr0/m;->a:Ljava/util/List;

    .line 199
    .line 200
    iget-object v9, p3, Lr0/m;->b:Ljava/util/List;

    .line 201
    .line 202
    const/4 v4, 0x0

    .line 203
    move-object v5, p1

    .line 204
    move-object v6, p2

    .line 205
    invoke-direct/range {v3 .. v11}, Lr0/l;-><init>(Landroid/widget/ListView;Landroid/view/View;Ljava/lang/Object;Ljava/lang/Class;Ljava/util/List;Ljava/util/List;ILr0/n;)V

    .line 206
    .line 207
    .line 208
    return-object v3
.end method

.method public k(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 8

    .line 1
    const v0, 0x7f080015

    .line 2
    .line 3
    .line 4
    if-ne p2, v0, :cond_0

    .line 5
    .line 6
    const p2, 0x7f060015

    .line 7
    .line 8
    .line 9
    invoke-static {p1, p2}, Lb1/h;->w(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    const v0, 0x7f080043

    .line 15
    .line 16
    .line 17
    if-ne p2, v0, :cond_1

    .line 18
    .line 19
    const p2, 0x7f060018

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p2}, Lb1/h;->w(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_1
    const v0, 0x7f080042

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    if-ne p2, v0, :cond_3

    .line 32
    .line 33
    const/4 p2, 0x3

    .line 34
    new-array v0, p2, [[I

    .line 35
    .line 36
    new-array p2, p2, [I

    .line 37
    .line 38
    const v2, 0x7f04005a

    .line 39
    .line 40
    .line 41
    invoke-static {p1, v2}, Li/d1;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const/4 v4, 0x2

    .line 46
    const v5, 0x7f040054

    .line 47
    .line 48
    .line 49
    const/4 v6, 0x1

    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    invoke-virtual {v3}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-eqz v7, :cond_2

    .line 57
    .line 58
    sget-object v2, Li/d1;->b:[I

    .line 59
    .line 60
    aput-object v2, v0, v1

    .line 61
    .line 62
    invoke-virtual {v3, v2, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    aput v2, p2, v1

    .line 67
    .line 68
    sget-object v1, Li/d1;->e:[I

    .line 69
    .line 70
    aput-object v1, v0, v6

    .line 71
    .line 72
    invoke-static {p1, v5}, Li/d1;->c(Landroid/content/Context;I)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    aput p1, p2, v6

    .line 77
    .line 78
    sget-object p1, Li/d1;->f:[I

    .line 79
    .line 80
    aput-object p1, v0, v4

    .line 81
    .line 82
    invoke-virtual {v3}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    aput p1, p2, v4

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    sget-object v3, Li/d1;->b:[I

    .line 90
    .line 91
    aput-object v3, v0, v1

    .line 92
    .line 93
    invoke-static {p1, v2}, Li/d1;->b(Landroid/content/Context;I)I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    aput v3, p2, v1

    .line 98
    .line 99
    sget-object v1, Li/d1;->e:[I

    .line 100
    .line 101
    aput-object v1, v0, v6

    .line 102
    .line 103
    invoke-static {p1, v5}, Li/d1;->c(Landroid/content/Context;I)I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    aput v1, p2, v6

    .line 108
    .line 109
    sget-object v1, Li/d1;->f:[I

    .line 110
    .line 111
    aput-object v1, v0, v4

    .line 112
    .line 113
    invoke-static {p1, v2}, Li/d1;->c(Landroid/content/Context;I)I

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    aput p1, p2, v4

    .line 118
    .line 119
    :goto_0
    new-instance p1, Landroid/content/res/ColorStateList;

    .line 120
    .line 121
    invoke-direct {p1, v0, p2}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 122
    .line 123
    .line 124
    return-object p1

    .line 125
    :cond_3
    const v0, 0x7f080009

    .line 126
    .line 127
    .line 128
    if-ne p2, v0, :cond_4

    .line 129
    .line 130
    const p2, 0x7f040053

    .line 131
    .line 132
    .line 133
    invoke-static {p1, p2}, Li/d1;->c(Landroid/content/Context;I)I

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    invoke-static {p1, p2}, Li/t;->h(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    return-object p1

    .line 142
    :cond_4
    const v0, 0x7f080003

    .line 143
    .line 144
    .line 145
    if-ne p2, v0, :cond_5

    .line 146
    .line 147
    invoke-static {p1, v1}, Li/t;->h(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    return-object p1

    .line 152
    :cond_5
    const v0, 0x7f080008

    .line 153
    .line 154
    .line 155
    if-ne p2, v0, :cond_6

    .line 156
    .line 157
    const p2, 0x7f040051

    .line 158
    .line 159
    .line 160
    invoke-static {p1, p2}, Li/d1;->c(Landroid/content/Context;I)I

    .line 161
    .line 162
    .line 163
    move-result p2

    .line 164
    invoke-static {p1, p2}, Li/t;->h(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    return-object p1

    .line 169
    :cond_6
    const v0, 0x7f08003e

    .line 170
    .line 171
    .line 172
    if-eq p2, v0, :cond_c

    .line 173
    .line 174
    const v0, 0x7f08003f

    .line 175
    .line 176
    .line 177
    if-ne p2, v0, :cond_7

    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_7
    iget-object v0, p0, Li/t;->b:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v0, [I

    .line 183
    .line 184
    invoke-static {v0, p2}, Li/t;->c([II)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-eqz v0, :cond_8

    .line 189
    .line 190
    const p2, 0x7f040056

    .line 191
    .line 192
    .line 193
    invoke-static {p1, p2}, Li/d1;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    return-object p1

    .line 198
    :cond_8
    iget-object v0, p0, Li/t;->e:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v0, [I

    .line 201
    .line 202
    invoke-static {v0, p2}, Li/t;->c([II)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_9

    .line 207
    .line 208
    const p2, 0x7f060014

    .line 209
    .line 210
    .line 211
    invoke-static {p1, p2}, Lb1/h;->w(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    return-object p1

    .line 216
    :cond_9
    iget-object v0, p0, Li/t;->f:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v0, [I

    .line 219
    .line 220
    invoke-static {v0, p2}, Li/t;->c([II)Z

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-eqz v0, :cond_a

    .line 225
    .line 226
    const p2, 0x7f060013

    .line 227
    .line 228
    .line 229
    invoke-static {p1, p2}, Lb1/h;->w(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    return-object p1

    .line 234
    :cond_a
    const v0, 0x7f08003b

    .line 235
    .line 236
    .line 237
    if-ne p2, v0, :cond_b

    .line 238
    .line 239
    const p2, 0x7f060016

    .line 240
    .line 241
    .line 242
    invoke-static {p1, p2}, Lb1/h;->w(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    return-object p1

    .line 247
    :cond_b
    const/4 p1, 0x0

    .line 248
    return-object p1

    .line 249
    :cond_c
    :goto_1
    const p2, 0x7f060017

    .line 250
    .line 251
    .line 252
    invoke-static {p1, p2}, Lb1/h;->w(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    return-object p1
.end method

.method public l(Landroid/view/View;Ljava/lang/Object;)Lr0/m;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {v1, p1, v0}, Li/t;->g(ILandroid/view/View;Ljava/util/ArrayList;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    new-instance p1, Lr0/m;

    .line 17
    .line 18
    invoke-direct {p1}, Lr0/m;-><init>()V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 28
    .line 29
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 30
    .line 31
    .line 32
    const/16 v3, 0x18

    .line 33
    .line 34
    invoke-static {v0, v3}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_5

    .line 47
    .line 48
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Landroid/view/View;

    .line 53
    .line 54
    invoke-virtual {v3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    if-nez v3, :cond_2

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {v2, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    iget-object v6, p0, Li/t;->e:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v6, Lr0/k0;

    .line 89
    .line 90
    invoke-virtual {v6, v4, v5, v3}, Lr0/k0;->b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Boolean;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-eqz v4, :cond_1

    .line 99
    .line 100
    iget-object v4, p0, Li/t;->d:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v4, Lr0/k0;

    .line 103
    .line 104
    invoke-virtual {v4, v3}, Lr0/k0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    check-cast v3, Ljava/lang/String;

    .line 109
    .line 110
    if-eqz v3, :cond_1

    .line 111
    .line 112
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-nez v4, :cond_3

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_3
    const/4 v3, 0x0

    .line 120
    :goto_1
    if-nez v3, :cond_4

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_4
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-nez v4, :cond_1

    .line 128
    .line 129
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_5
    new-instance p2, Lr0/m;

    .line 134
    .line 135
    invoke-static {v2}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-direct {p2, p1, v0, v1}, Lr0/m;-><init>(Ljava/util/List;Ljava/util/List;I)V

    .line 140
    .line 141
    .line 142
    return-object p2
.end method

.method public n()V
    .locals 4

    .line 1
    iget-object v0, p0, Li/t;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/widget/TextView;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const-string v2, "listAdapter"

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    iget-object v3, p0, Li/t;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v3, Ls0/g;

    .line 13
    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    iget-object v3, v3, Ln0/b;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_0

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/16 v3, 0x8

    .line 27
    .line 28
    :goto_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-static {v2}, LN0/g;->g(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v1

    .line 36
    :cond_2
    :goto_1
    iget-object v0, p0, Li/t;->e:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Landroid/widget/TextView;

    .line 39
    .line 40
    if-eqz v0, :cond_5

    .line 41
    .line 42
    iget-object v3, p0, Li/t;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, Ls0/g;

    .line 45
    .line 46
    if-eqz v3, :cond_4

    .line 47
    .line 48
    iget-object v1, v3, Ln0/b;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_3

    .line 55
    .line 56
    const v1, 0x3ee66666    # 0.45f

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 61
    .line 62
    :goto_2
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_4
    invoke-static {v2}, LN0/g;->g(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v1

    .line 70
    :cond_5
    return-void
.end method
