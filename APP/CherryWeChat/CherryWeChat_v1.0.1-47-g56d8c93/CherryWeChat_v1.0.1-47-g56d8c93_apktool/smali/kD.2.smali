.class public final LkD;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LWk;


# instance fields
.field public a:Landroid/widget/LinearLayout;

.field public b:Landroid/widget/ScrollView;

.field public c:Landroid/app/Activity;


# direct methods
.method public static final a(LkD;Ljava/util/List;)V
    .locals 21

    move-object/from16 v0, p0

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x10

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget-object v5, v0, LkD;->a:Landroid/widget/LinearLayout;

    if-nez v5, :cond_0

    const-wide v7, -0x2eaf5fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    const/4 v5, 0x0

    :cond_0
    invoke-virtual {v5}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1

    const-wide v1, -0x2eafdfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LkD;->e(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_13

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/github/cherrywechat/network/model/UpdateItem;

    new-instance v8, Landroid/widget/LinearLayout;

    iget-object v9, v0, LkD;->c:Landroid/app/Activity;

    if-nez v9, :cond_2

    const-wide v9, -0x2ea84fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    const/4 v9, 0x0

    :cond_2
    invoke-direct {v8, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v9, 0x1

    invoke-virtual {v8, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v9, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v9}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget-object v10, v0, LkD;->c:Landroid/app/Activity;

    if-nez v10, :cond_3

    const-wide v10, -0x2ea8dfffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    const/4 v10, 0x0

    :cond_3
    const v11, 0x55060043

    invoke-virtual {v10, v11}, Landroid/content/Context;->getColor(I)I

    move-result v10

    invoke-virtual {v9, v10}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/16 v10, 0xc

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v10}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    int-to-float v10, v10

    invoke-virtual {v9, v10}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v8, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v10, -0x1

    const/4 v11, -0x2

    invoke-direct {v9, v10, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    const/4 v13, 0x0

    invoke-virtual {v9, v13, v13, v13, v12}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v8, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-virtual {v8, v9, v12, v14, v15}, Landroid/view/View;->setPadding(IIII)V

    new-instance v9, Landroid/widget/LinearLayout;

    iget-object v12, v0, LkD;->c:Landroid/app/Activity;

    if-nez v12, :cond_4

    const-wide v14, -0x2ea96fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    const/4 v12, 0x0

    :cond_4
    invoke-direct {v9, v12}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v9, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v12, v10, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v9, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v12, Landroid/widget/TextView;

    iget-object v14, v0, LkD;->c:Landroid/app/Activity;

    if-nez v14, :cond_5

    const-wide v14, -0x2ea9ffffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    const/4 v14, 0x0

    :cond_5
    invoke-direct {v12, v14}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "v"

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Lio/github/cherrywechat/network/model/UpdateItem;->getVersion()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v14, 0x41900000    # 18.0f

    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setTextSize(F)V

    iget-object v14, v0, LkD;->c:Landroid/app/Activity;

    if-nez v14, :cond_6

    const-wide v14, -0x2eaa8fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    const/4 v14, 0x0

    :cond_6
    const v15, 0x550603f9

    invoke-virtual {v14, v15}, Landroid/content/Context;->getColor(I)I

    move-result v14

    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v14, v11, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v12, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v9, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v12, Landroid/widget/TextView;

    iget-object v14, v0, LkD;->c:Landroid/app/Activity;

    if-nez v14, :cond_7

    const-wide v16, -0x2eab1fffff835L

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    const/4 v14, 0x0

    :cond_7
    invoke-direct {v12, v14}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v7}, Lio/github/cherrywechat/network/model/UpdateItem;->getType()Lio/github/cherrywechat/network/model/UpdateType;

    move-result-object v14

    invoke-virtual {v14}, Lio/github/cherrywechat/network/model/UpdateType;->getLabel()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v14, 0x41400000    # 12.0f

    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setTextSize(F)V

    iget-object v6, v0, LkD;->c:Landroid/app/Activity;

    if-nez v6, :cond_8

    const-wide v17, -0x2eabafffff835L

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    const/4 v6, 0x0

    :cond_8
    const v15, 0x550603fd

    invoke-virtual {v6, v15}, Landroid/content/Context;->getColor(I)I

    move-result v6

    invoke-virtual {v12, v6}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-virtual {v12, v6, v15, v10, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v7}, Lio/github/cherrywechat/network/model/UpdateItem;->getType()Lio/github/cherrywechat/network/model/UpdateType;

    move-result-object v10

    invoke-virtual {v10}, Lio/github/cherrywechat/network/model/UpdateType;->getColor()Ljava/lang/String;

    move-result-object v10

    const-wide v14, -0x2e943fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v14

    const-wide v19, -0x2e946fffff835L

    invoke-static/range {v19 .. v20}, LGu;->r(J)Ljava/lang/String;

    move-result-object v15

    invoke-static {v10, v14, v15}, LBz;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    invoke-virtual {v6, v10}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    int-to-float v10, v10

    invoke-virtual {v6, v10}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v12, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v6, v11, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    invoke-virtual {v6, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    iput v3, v6, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    invoke-virtual {v12, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v9, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v6, Landroid/view/View;

    iget-object v10, v0, LkD;->c:Landroid/app/Activity;

    if-nez v10, :cond_9

    const-wide v14, -0x2e948fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    const/4 v10, 0x0

    :cond_9
    invoke-direct {v6, v10}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-direct {v10, v13, v11, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v6, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v9, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v6, Landroid/widget/TextView;

    iget-object v10, v0, LkD;->c:Landroid/app/Activity;

    if-nez v10, :cond_a

    const-wide v14, -0x2e951fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    const/4 v10, 0x0

    :cond_a
    invoke-direct {v6, v10}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v7}, Lio/github/cherrywechat/network/model/UpdateItem;->getDate()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v10, 0x41400000    # 12.0f

    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setTextSize(F)V

    iget-object v10, v0, LkD;->c:Landroid/app/Activity;

    if-nez v10, :cond_b

    const-wide v14, -0x2e95afffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    const/4 v10, 0x0

    :cond_b
    const v12, 0x550603f5

    invoke-virtual {v10, v12}, Landroid/content/Context;->getColor(I)I

    move-result v10

    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v10, v11, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput v3, v10, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    invoke-virtual {v6, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v9, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v7}, Lio/github/cherrywechat/network/model/UpdateItem;->getChanges()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_11

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/github/cherrywechat/network/model/Change;

    new-instance v9, Landroid/widget/LinearLayout;

    iget-object v10, v0, LkD;->c:Landroid/app/Activity;

    if-nez v10, :cond_c

    const-wide v14, -0x2e963fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    const/4 v10, 0x0

    :cond_c
    invoke-direct {v9, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v9, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v12, -0x1

    invoke-direct {v10, v12, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-virtual {v10, v13, v14, v13, v13}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v9, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v10, Landroid/widget/TextView;

    iget-object v14, v0, LkD;->c:Landroid/app/Activity;

    if-nez v14, :cond_d

    const-wide v14, -0x2e96cfffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    const/4 v14, 0x0

    :cond_d
    invoke-direct {v10, v14}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v7}, Lio/github/cherrywechat/network/model/Change;->getType()Lio/github/cherrywechat/network/model/ChangeType;

    move-result-object v14

    invoke-virtual {v14}, Lio/github/cherrywechat/network/model/ChangeType;->getIcon()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v10, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v14, 0x41800000    # 16.0f

    invoke-virtual {v10, v14}, Landroid/widget/TextView;->setTextSize(F)V

    iget-object v14, v0, LkD;->c:Landroid/app/Activity;

    if-nez v14, :cond_e

    const-wide v14, -0x2e975fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    const/4 v14, 0x0

    :cond_e
    const v15, 0x550603f9

    invoke-virtual {v14, v15}, Landroid/content/Context;->getColor(I)I

    move-result v14

    invoke-virtual {v10, v14}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v14, v11, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v10, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v10, Landroid/widget/TextView;

    iget-object v14, v0, LkD;->c:Landroid/app/Activity;

    if-nez v14, :cond_f

    const-wide v14, -0x2e97efffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    const/4 v14, 0x0

    :cond_f
    invoke-direct {v10, v14}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v7}, Lio/github/cherrywechat/network/model/Change;->getDescription()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v10, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v7, 0x41600000    # 14.0f

    invoke-virtual {v10, v7}, Landroid/widget/TextView;->setTextSize(F)V

    iget-object v7, v0, LkD;->c:Landroid/app/Activity;

    if-nez v7, :cond_10

    const-wide v14, -0x2e907fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    const/4 v7, 0x0

    :cond_10
    const v15, 0x550603f9

    invoke-virtual {v7, v15}, Landroid/content/Context;->getColor(I)I

    move-result v7

    invoke-virtual {v10, v7}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v7, v11, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-virtual {v7, v14}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v10, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto/16 :goto_1

    :cond_11
    iget-object v6, v0, LkD;->a:Landroid/widget/LinearLayout;

    if-nez v6, :cond_12

    const-wide v6, -0x2e910fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    const/4 v6, 0x0

    :cond_12
    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto/16 :goto_0

    :cond_13
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    const-wide v0, -0x2e93afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method public final c(Landroid/app/Activity;IILandroid/content/Intent;)V
    .locals 0

    const-wide p1, -0x2e9c3fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method public final d(Landroid/app/Activity;)V
    .locals 5

    const-wide v0, -0x2ead9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iput-object p1, p0, LkD;->c:Landroid/app/Activity;

    new-instance v0, Landroid/widget/ScrollView;

    invoke-direct {v0, p1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v1, 0x55060040

    invoke-virtual {p1, v1}, Landroid/content/Context;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    iput-object v0, p0, LkD;->b:Landroid/widget/ScrollView;

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {p1, v2, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0x10

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v1

    invoke-virtual {v0, v2, v3, v4, v1}, Landroid/view/View;->setPadding(IIII)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iput-object v0, p0, LkD;->a:Landroid/widget/LinearLayout;

    iget-object p1, p0, LkD;->b:Landroid/widget/ScrollView;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-wide v1, -0x2eae2fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-object p1, v0

    :cond_0
    iget-object v1, p0, LkD;->a:Landroid/widget/LinearLayout;

    if-nez v1, :cond_1

    const-wide v1, -0x2eaedfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-object v1, v0

    :cond_1
    invoke-virtual {p1, v1}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    sget-object p1, Lhe;->a:Lhd;

    sget-object p1, LZp;->a:Lnk;

    invoke-static {p1}, LPj;->a(Lac;)LCb;

    move-result-object p1

    new-instance v1, Ll;

    const/4 v2, 0x7

    invoke-direct {v1, p0, v0, v2}, Ll;-><init>(LWk;LEb;I)V

    const/4 v0, 0x3

    invoke-static {p1, v1, v0}, LNj;->G(Lfc;Lkotlin/jvm/functions/Function2;I)V

    return-void
.end method

.method public final e(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, LkD;->a:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-wide v2, -0x2e918fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    new-instance v0, Landroid/widget/TextView;

    iget-object v2, p0, LkD;->c:Landroid/app/Activity;

    if-nez v2, :cond_1

    const-wide v2, -0x2e920fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-object v2, v1

    :cond_1
    invoke-direct {v0, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 p1, 0x41600000    # 14.0f

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    iget-object p1, p0, LkD;->c:Landroid/app/Activity;

    if-nez p1, :cond_2

    const-wide v2, -0x2e929fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-object p1, v1

    :cond_2
    const v2, 0x550603f5

    invoke-virtual {p1, v2}, Landroid/content/Context;->getColor(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 p1, 0x11

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {p1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v2, 0x20

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {p1, v3, v2, v3, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, LkD;->a:Landroid/widget/LinearLayout;

    if-nez p1, :cond_3

    const-wide v2, -0x2e932fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    goto :goto_0

    :cond_3
    move-object v1, p1

    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public final getContentView()Landroid/view/View;
    .locals 2

    iget-object v0, p0, LkD;->b:Landroid/widget/ScrollView;

    if-nez v0, :cond_0

    const-wide v0, -0x2e9ccfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 2

    const-wide v0, -0x2e9d7fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
