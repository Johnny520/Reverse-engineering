.class public final LTi;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LWk;


# instance fields
.field public a:Landroid/widget/LinearLayout;

.field public b:Landroid/widget/LinearLayout;

.field public c:Landroid/app/Activity;

.field public final d:Ljava/util/List;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public final i:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LRi;

    const-wide v1, -0x452ffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x4532fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const v3, 0x55060049

    invoke-direct {v0, v3, v1, v2}, LRi;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    new-instance v1, LRi;

    const-wide v4, -0x4533fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v4, -0x4536fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v2, v4}, LRi;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    new-instance v2, LRi;

    const-wide v3, -0x453bfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0x453efffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const v5, 0x5506004b

    invoke-direct {v2, v5, v3, v4}, LRi;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    new-instance v3, LRi;

    const-wide v4, -0x45c3fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v5, -0x45c6fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const v6, 0x55060047

    invoke-direct {v3, v6, v4, v5}, LRi;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    new-instance v4, LRi;

    const-wide v5, -0x45cbfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v6, -0x45cefffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    const v7, 0x55060050

    invoke-direct {v4, v7, v5, v6}, LRi;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    new-instance v5, LRi;

    const-wide v6, -0x45d3fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    const-wide v7, -0x45d6fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    const v8, 0x55060042

    invoke-direct {v5, v8, v6, v7}, LRi;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    filled-new-array/range {v0 .. v5}, [LRi;

    move-result-object v0

    invoke-static {v0}, Lsa;->b0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LTi;->d:Ljava/util/List;

    sget-object v0, LKf;->a:LKf;

    iput-object v0, p0, LTi;->e:Ljava/lang/Object;

    iput-object v0, p0, LTi;->f:Ljava/lang/Object;

    const-wide v0, -0x45dcfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LTi;->g:Ljava/lang/String;

    const-wide v0, -0x45ddfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LTi;->h:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LTi;->i:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    iget-object v0, p0, LTi;->e:Ljava/lang/Object;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LSi;

    iget-object v4, p0, LTi;->g:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    iget-object v4, v3, LSi;->b:Ljava/lang/String;

    iget-object v7, p0, LTi;->g:Ljava/lang/String;

    invoke-static {v4, v7}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_1
    move v4, v6

    goto :goto_2

    :cond_2
    move v4, v5

    :goto_2
    iget-object v7, p0, LTi;->h:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_3

    goto :goto_3

    :cond_3
    iget-object v3, v3, LSi;->a:LZk;

    iget-object v3, v3, LZk;->a:LZz;

    iget-object v3, v3, LZz;->d:Ljava/lang/String;

    iget-object v7, p0, LTi;->h:Ljava/lang/String;

    invoke-static {v3, v7, v6}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-eqz v3, :cond_4

    :goto_3
    move v5, v6

    :cond_4
    if-eqz v4, :cond_0

    if-eqz v5, :cond_0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    iput-object v1, p0, LTi;->f:Ljava/lang/Object;

    invoke-virtual {p0}, LTi;->e()V

    return-void
.end method

.method public final b()V
    .locals 2

    const-wide v0, -0x44bdfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method public final c(Landroid/app/Activity;IILandroid/content/Intent;)V
    .locals 0

    const-wide p1, -0x4346fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method public final d(Landroid/app/Activity;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/16 v2, 0x8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xe

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v5, 0x10

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-wide v7, -0x45defffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    iput-object v1, v0, LTi;->c:Landroid/app/Activity;

    invoke-static {}, LQj;->u()Ljava/util/ArrayList;

    move-result-object v7

    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v7, v9}, Lta;->d0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    iget-object v11, v0, LTi;->d:Ljava/util/List;

    if-eqz v10, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LZk;

    iget-object v13, v10, LZk;->a:LZz;

    iget-object v13, v13, LZz;->a:Ljava/lang/String;

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_1

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    move-object v15, v14

    check-cast v15, LRi;

    iget-object v15, v15, LRi;->b:Ljava/lang/String;

    invoke-static {v15, v13}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_0

    move-object v12, v14

    goto :goto_1

    :cond_1
    const/4 v12, 0x0

    :goto_1
    check-cast v12, LRi;

    if-eqz v12, :cond_2

    iget-object v11, v12, LRi;->a:Ljava/lang/String;

    if-nez v11, :cond_3

    :cond_2
    const-wide v11, -0x45e7fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    :cond_3
    new-instance v12, LSi;

    invoke-direct {v12, v10, v13, v11}, LSi;-><init>(LZk;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    iput-object v8, v0, LTi;->e:Ljava/lang/Object;

    iput-object v8, v0, LTi;->f:Ljava/lang/Object;

    new-instance v7, Landroid/widget/LinearLayout;

    invoke-direct {v7, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v8, 0x1

    invoke-virtual {v7, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const v10, 0x55060040

    invoke-virtual {v1, v10}, Landroid/content/Context;->getColor(I)I

    move-result v10

    invoke-virtual {v7, v10}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v13, -0x1

    invoke-direct {v10, v13, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v7, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iput-object v7, v0, LTi;->a:Landroid/widget/LinearLayout;

    new-instance v10, Landroid/widget/LinearLayout;

    invoke-direct {v10, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v14, 0x0

    invoke-virtual {v10, v14}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {v10, v5}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v15, Landroid/widget/LinearLayout$LayoutParams;

    move/from16 v16, v9

    const/4 v9, -0x2

    invoke-direct {v15, v13, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v10, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    move/from16 v17, v8

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-virtual {v10, v15, v8, v12, v9}, Landroid/view/View;->setPadding(IIII)V

    new-instance v8, Landroid/widget/LinearLayout;

    invoke-direct {v8, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v8, v14}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {v8, v5}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v12, -0x2

    invoke-direct {v9, v13, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v8, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v9, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v9}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v12, 0x55060035

    invoke-virtual {v1, v12}, Landroid/content/Context;->getColor(I)I

    move-result v12

    invoke-virtual {v9, v12}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/16 v12, 0xc

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v12}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    int-to-float v12, v12

    invoke-virtual {v9, v12}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v12}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    const v15, 0x55060039

    invoke-virtual {v1, v15}, Landroid/content/Context;->getColor(I)I

    move-result v15

    invoke-virtual {v9, v12, v15}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    invoke-virtual {v8, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v12}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    invoke-static {v12}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-virtual {v8, v9, v15, v5, v13}, Landroid/view/View;->setPadding(IIII)V

    new-instance v5, Landroid/widget/ImageView;

    invoke-direct {v5, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v13, 0x14

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-direct {v9, v15, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v12}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-virtual {v9, v12}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v5, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v9, 0x55080109

    invoke-virtual {v5, v9}, Landroid/widget/ImageView;->setImageResource(I)V

    const v9, 0x550603f7

    invoke-virtual {v1, v9}, Landroid/content/Context;->getColor(I)I

    move-result v12

    invoke-virtual {v5, v12}, Landroid/widget/ImageView;->setColorFilter(I)V

    sget-object v12, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v5, v12}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    invoke-virtual {v8, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v5, Landroid/widget/EditText;

    invoke-direct {v5, v1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    const-wide v12, -0x4590fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5, v12}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    const/high16 v12, 0x41700000    # 15.0f

    invoke-virtual {v5, v12}, Landroid/widget/TextView;->setTextSize(F)V

    const v12, 0x550603f9

    invoke-virtual {v1, v12}, Landroid/content/Context;->getColor(I)I

    move-result v12

    invoke-virtual {v5, v12}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v1, v9}, Landroid/content/Context;->getColor(I)I

    move-result v9

    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setHintTextColor(I)V

    const/4 v9, 0x0

    invoke-virtual {v5, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    move/from16 v12, v17

    invoke-virtual {v5, v12}, Landroid/widget/TextView;->setSingleLine(Z)V

    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v13, -0x2

    invoke-direct {v12, v14, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v13, 0x3f800000    # 1.0f

    iput v13, v12, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    invoke-virtual {v5, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v12, Le5;

    const/4 v15, 0x2

    invoke-direct {v12, v15, v0}, Le5;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v5, v12}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-virtual {v8, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v10, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v7, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v5, v0, LTi;->a:Landroid/widget/LinearLayout;

    if-nez v5, :cond_5

    const-wide v7, -0x45f2fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-object v5, v9

    :cond_5
    new-instance v7, Landroid/widget/HorizontalScrollView;

    invoke-direct {v7, v1}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;)V

    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v10, -0x1

    const/4 v12, -0x2

    invoke-direct {v8, v10, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v7, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v7, v14}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    const/4 v8, 0x2

    invoke-virtual {v7, v8}, Landroid/view/View;->setOverScrollMode(I)V

    new-instance v10, Landroid/widget/LinearLayout;

    invoke-direct {v10, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v10, v14}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v12, 0x10

    invoke-virtual {v10, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-virtual {v10, v12, v15, v9, v8}, Landroid/view/View;->setPadding(IIII)V

    iget-object v8, v0, LTi;->i:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LRi;

    new-instance v12, Landroid/widget/TextView;

    invoke-direct {v12, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget-object v15, v11, LRi;->a:Ljava/lang/String;

    invoke-virtual {v12, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v15, 0x41500000    # 13.0f

    invoke-virtual {v12, v15}, Landroid/widget/TextView;->setTextSize(F)V

    const/16 v15, 0x11

    invoke-virtual {v12, v15}, Landroid/widget/TextView;->setGravity(I)V

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    move-object/from16 v18, v2

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    invoke-virtual {v12, v15, v13, v14, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v13, -0x2

    invoke-direct {v2, v13, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static/range {v18 .. v18}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-virtual {v2, v13}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v12, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v2, 0x1

    invoke-virtual {v12, v2}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v12, v2}, Landroid/view/View;->setFocusable(Z)V

    iget-object v2, v11, LRi;->b:Ljava/lang/String;

    invoke-virtual {v12, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    new-instance v2, Ll5;

    const/16 v13, 0xb

    invoke-direct {v2, v13, v0, v11}, Ll5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v12, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v10, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v2, v18

    const/high16 v13, 0x3f800000    # 1.0f

    const/4 v14, 0x0

    goto :goto_2

    :cond_6
    move-object/from16 v18, v2

    invoke-virtual {v7, v10}, Landroid/widget/HorizontalScrollView;->addView(Landroid/view/View;)V

    invoke-virtual {v0}, LTi;->f()V

    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/ScrollView;

    invoke-direct {v2, v1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, 0x0

    const/4 v10, -0x1

    invoke-direct {v3, v10, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v5, 0x3f800000    # 1.0f

    iput v5, v3, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v2, v4}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Landroid/view/View;->setOverScrollMode(I)V

    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v12, 0x1

    invoke-virtual {v3, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v12, -0x2

    invoke-direct {v1, v10, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v1

    invoke-static/range {v18 .. v18}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-virtual {v3, v1, v4, v5, v6}, Landroid/view/View;->setPadding(IIII)V

    iput-object v3, v0, LTi;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v3}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    iget-object v1, v0, LTi;->a:Landroid/widget/LinearLayout;

    if-nez v1, :cond_7

    const-wide v3, -0x4588fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const/4 v12, 0x0

    goto :goto_3

    :cond_7
    move-object v12, v1

    :goto_3
    invoke-virtual {v12, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v0}, LTi;->e()V

    return-void
.end method

.method public final e()V
    .locals 21

    move-object/from16 v0, p0

    const/16 v1, 0x28

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x8

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v4, 0x10

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iget-object v8, v0, LTi;->b:Landroid/widget/LinearLayout;

    if-nez v8, :cond_0

    const-wide v10, -0x446ffffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    const/4 v8, 0x0

    :cond_0
    invoke-virtual {v8}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v8, v0, LTi;->f:Ljava/lang/Object;

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v8

    const v10, 0x550603f7

    const/4 v11, 0x0

    if-eqz v8, :cond_5

    iget-object v2, v0, LTi;->b:Landroid/widget/LinearLayout;

    if-nez v2, :cond_1

    const-wide v2, -0x447dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const/4 v2, 0x0

    :cond_1
    new-instance v3, Landroid/widget/TextView;

    iget-object v4, v0, LTi;->c:Landroid/app/Activity;

    if-nez v4, :cond_2

    const-wide v4, -0x440bfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const/4 v4, 0x0

    :cond_2
    invoke-direct {v3, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget-object v4, v0, LTi;->h:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_3

    const-wide v4, -0x4414fffff835L

    :goto_0
    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_3
    const-wide v4, -0x441dfffff835L

    goto :goto_0

    :goto_1
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v4, 0x41700000    # 15.0f

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextSize(F)V

    iget-object v4, v0, LTi;->c:Landroid/app/Activity;

    if-nez v4, :cond_4

    const-wide v4, -0x4424fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const/4 v9, 0x0

    goto :goto_2

    :cond_4
    move-object v9, v4

    :goto_2
    invoke-virtual {v9, v10}, Landroid/content/Context;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v4, 0x11

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setGravity(I)V

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v1

    invoke-virtual {v3, v11, v4, v11, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void

    :cond_5
    iget-object v1, v0, LTi;->b:Landroid/widget/LinearLayout;

    if-nez v1, :cond_6

    const-wide v12, -0x442dfffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    const/4 v1, 0x0

    :cond_6
    new-instance v8, Landroid/widget/TextView;

    iget-object v12, v0, LTi;->c:Landroid/app/Activity;

    if-nez v12, :cond_7

    const-wide v12, -0x443bfffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    const/4 v12, 0x0

    :cond_7
    invoke-direct {v8, v12}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v13, -0x44c4fffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v13, v0, LTi;->f:Ljava/lang/Object;

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-wide v13, -0x44c7fffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v12, 0x41500000    # 13.0f

    invoke-virtual {v8, v12}, Landroid/widget/TextView;->setTextSize(F)V

    iget-object v13, v0, LTi;->c:Landroid/app/Activity;

    if-nez v13, :cond_8

    const-wide v13, -0x44ccfffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    const/4 v13, 0x0

    :cond_8
    invoke-virtual {v13, v10}, Landroid/content/Context;->getColor(I)I

    move-result v13

    invoke-virtual {v8, v13}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v14, -0x1

    const/4 v15, -0x2

    invoke-direct {v13, v14, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    iput v9, v13, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v8, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v1, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v1, v0, LTi;->f:Ljava/lang/Object;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_16

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LSi;

    iget-object v9, v8, LSi;->a:LZk;

    iget-object v13, v0, LTi;->c:Landroid/app/Activity;

    if-nez v13, :cond_9

    const-wide v16, -0x44d5fffff835L

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    const/4 v13, 0x0

    :cond_9
    invoke-virtual {v9, v13}, LZk;->d(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_15

    new-instance v13, Landroid/widget/LinearLayout;

    iget-object v10, v0, LTi;->c:Landroid/app/Activity;

    if-nez v10, :cond_a

    const-wide v17, -0x44defffff835L

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    const/4 v10, 0x0

    :cond_a
    invoke-direct {v13, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v13, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v10, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v10}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget-object v12, v0, LTi;->c:Landroid/app/Activity;

    if-nez v12, :cond_b

    const-wide v18, -0x44abfffff835L

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;

    const/4 v12, 0x0

    :cond_b
    const v4, 0x55060035

    invoke-virtual {v12, v4}, Landroid/content/Context;->getColor(I)I

    move-result v4

    invoke-virtual {v10, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/16 v4, 0xc

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v10, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    iget-object v12, v0, LTi;->c:Landroid/app/Activity;

    if-nez v12, :cond_c

    const-wide v19, -0x44b4fffff835L

    invoke-static/range {v19 .. v20}, LGu;->r(J)Ljava/lang/String;

    const/4 v12, 0x0

    :cond_c
    const v11, 0x55060039

    invoke-virtual {v12, v11}, Landroid/content/Context;->getColor(I)I

    move-result v11

    invoke-virtual {v10, v4, v11}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    invoke-virtual {v13, v10}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v14, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    iput v10, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v13, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v13, v6}, Landroid/view/View;->setClipToOutline(Z)V

    new-instance v4, Landroid/widget/LinearLayout;

    iget-object v10, v0, LTi;->c:Landroid/app/Activity;

    if-nez v10, :cond_d

    const-wide v10, -0x44e7fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    const/4 v10, 0x0

    :cond_d
    invoke-direct {v4, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v10, 0x0

    invoke-virtual {v4, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v10, 0x10

    invoke-virtual {v4, v10}, Landroid/widget/LinearLayout;->setGravity(I)V

    invoke-static {v5}, LGu;->i(Ljava/lang/Number;)I

    move-result v11

    const/16 v12, 0xa

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v12}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-static {v5}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    const/16 v20, 0x4

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v20

    invoke-static/range {v20 .. v20}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    invoke-virtual {v4, v11, v12, v6, v10}, Landroid/view/View;->setPadding(IIII)V

    new-instance v6, Landroid/widget/TextView;

    iget-object v10, v0, LTi;->c:Landroid/app/Activity;

    if-nez v10, :cond_e

    const-wide v10, -0x44f0fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    const/4 v10, 0x0

    :cond_e
    invoke-direct {v6, v10}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget-object v10, v8, LSi;->a:LZk;

    iget-object v10, v10, LZk;->a:LZz;

    iget-object v10, v10, LZz;->d:Ljava/lang/String;

    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v10, 0x41500000    # 13.0f

    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setTextSize(F)V

    iget-object v11, v0, LTi;->c:Landroid/app/Activity;

    if-nez v11, :cond_f

    const-wide v11, -0x44f9fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    const/4 v11, 0x0

    :cond_f
    const v12, 0x55060049

    invoke-virtual {v11, v12}, Landroid/content/Context;->getColor(I)I

    move-result v11

    invoke-virtual {v6, v11}, Landroid/widget/TextView;->setTextColor(I)V

    sget-object v11, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v6, v11}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v10, 0x0

    invoke-direct {v11, v10, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v10, 0x3f800000    # 1.0f

    iput v10, v11, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    invoke-virtual {v6, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v4, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v6, Landroid/widget/TextView;

    iget-object v10, v0, LTi;->c:Landroid/app/Activity;

    if-nez v10, :cond_10

    const-wide v10, -0x4482fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    const/4 v10, 0x0

    :cond_10
    invoke-direct {v6, v10}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget-object v8, v8, LSi;->c:Ljava/lang/String;

    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v8, 0x41200000    # 10.0f

    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setTextSize(F)V

    iget-object v8, v0, LTi;->c:Landroid/app/Activity;

    if-nez v8, :cond_11

    const-wide v10, -0x448bfffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    const/4 v8, 0x0

    :cond_11
    const v10, 0x550603f7

    invoke-virtual {v8, v10}, Landroid/content/Context;->getColor(I)I

    move-result v8

    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v11

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-virtual {v6, v8, v11, v10, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget-object v10, v0, LTi;->c:Landroid/app/Activity;

    if-nez v10, :cond_12

    const-wide v10, -0x4494fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    const/4 v10, 0x0

    :cond_12
    invoke-virtual {v10, v12}, Landroid/content/Context;->getColor(I)I

    move-result v10

    const/16 v11, 0xff

    int-to-float v11, v11

    const v12, 0x3da3d70a    # 0.08f

    mul-float/2addr v11, v12

    float-to-int v11, v11

    invoke-static {v10}, Landroid/graphics/Color;->red(I)I

    move-result v12

    invoke-static {v10}, Landroid/graphics/Color;->green(I)I

    move-result v14

    invoke-static {v10}, Landroid/graphics/Color;->blue(I)I

    move-result v10

    invoke-static {v11, v12, v14, v10}, Landroid/graphics/Color;->argb(IIII)I

    move-result v10

    invoke-virtual {v8, v10}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    int-to-float v10, v10

    invoke-virtual {v8, v10}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v6, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v4, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v13, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_13

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    invoke-static {v5}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-static {v5}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v11

    invoke-virtual {v6, v8, v9, v10, v11}, Landroid/view/View;->setPadding(IIII)V

    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v9, -0x1

    invoke-direct {v8, v9, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v6, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v13, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_4

    :cond_13
    const/4 v9, -0x1

    iget-object v4, v0, LTi;->b:Landroid/widget/LinearLayout;

    if-nez v4, :cond_14

    const-wide v10, -0x449dfffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    const/4 v4, 0x0

    :cond_14
    invoke-virtual {v4, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_5

    :cond_15
    move v9, v14

    :goto_5
    move v14, v9

    const/16 v4, 0x10

    const/4 v6, 0x1

    const v10, 0x550603f7

    const/4 v11, 0x0

    const/high16 v12, 0x41500000    # 13.0f

    goto/16 :goto_3

    :cond_16
    return-void
.end method

.method public final f()V
    .locals 8

    const/16 v0, 0x14

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, LTi;->i:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    const-wide v4, -0x4598fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    check-cast v3, Ljava/lang/String;

    iget-object v4, p0, LTi;->g:Ljava/lang/String;

    invoke-static {v3, v4}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    const/4 v3, -0x1

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    sget-object v3, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget-object v5, p0, LTi;->c:Landroid/app/Activity;

    if-nez v5, :cond_0

    const-wide v5, -0x444bfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    goto :goto_1

    :cond_0
    move-object v4, v5

    :goto_1
    const v5, 0x55060049

    invoke-virtual {v4, v5}, Landroid/content/Context;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_1
    iget-object v3, p0, LTi;->c:Landroid/app/Activity;

    if-nez v3, :cond_2

    const-wide v5, -0x4454fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-object v3, v4

    :cond_2
    const v5, 0x550603f7

    invoke-virtual {v3, v5}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    sget-object v3, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget-object v5, p0, LTi;->c:Landroid/app/Activity;

    if-nez v5, :cond_3

    const-wide v5, -0x445dfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-object v5, v4

    :cond_3
    const v6, 0x55060035

    invoke-virtual {v5, v6}, Landroid/content/Context;->getColor(I)I

    move-result v5

    invoke-virtual {v3, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v3, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    const/4 v5, 0x1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v5}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    iget-object v6, p0, LTi;->c:Landroid/app/Activity;

    if-nez v6, :cond_4

    const-wide v6, -0x4466fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    goto :goto_2

    :cond_4
    move-object v4, v6

    :goto_2
    const v6, 0x5506007c

    invoke-virtual {v4, v6}, Landroid/content/Context;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v5, v4}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_0

    :cond_5
    return-void
.end method

.method public final getContentView()Landroid/view/View;
    .locals 2

    iget-object v0, p0, LTi;->a:Landroid/widget/LinearLayout;

    if-nez v0, :cond_0

    const-wide v0, -0x434ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 2

    const-wide v0, -0x4357fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
