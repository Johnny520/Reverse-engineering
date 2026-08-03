.class public final LPi;
.super Landroid/widget/LinearLayout;
.source ""

# interfaces
.implements LWk;


# instance fields
.field public a:Landroid/widget/LinearLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, -0x4680fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method public static final a(LPi;Ljava/lang/String;)Ljava/util/List;
    .locals 3

    sget-object p0, LKf;->a:LKf;

    :try_start_0
    sget-object v0, Lzm;->a:LAm;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lio/github/cherrywechat/network/model/ApiResponse;->Companion:Lio/github/cherrywechat/network/model/ApiResponse$Companion;

    sget-object v2, Lio/github/cherrywechat/network/model/FriendLinkData;->Companion:Lio/github/cherrywechat/network/model/FriendLinkData$Companion;

    invoke-virtual {v2}, Lio/github/cherrywechat/network/model/FriendLinkData$Companion;->serializer()LQm;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/github/cherrywechat/network/model/ApiResponse$Companion;->serializer(LQm;)LQm;

    move-result-object v1

    check-cast v1, LQm;

    invoke-virtual {v0, v1, p1}, Lmm;->a(LQm;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-wide v0, -0x479efffff835L

    :try_start_1
    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-class v0, Lio/github/cherrywechat/network/model/ApiResponse;

    invoke-static {v0}, LJv;->a(Ljava/lang/Class;)LF9;

    move-result-object v0

    invoke-virtual {v0}, LF9;->b()Ljava/lang/String;

    const-wide v0, -0x47b9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lio/github/cherrywechat/network/model/ApiResponse;

    if-nez p1, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p1}, Lio/github/cherrywechat/network/model/ApiResponse;->getCode()I

    move-result v0

    if-eqz v0, :cond_1

    const-wide v0, -0x47bdfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x4644fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1}, Lio/github/cherrywechat/network/model/ApiResponse;->getMessage()Ljava/lang/String;

    goto :goto_2

    :cond_1
    invoke-virtual {p1}, Lio/github/cherrywechat/network/model/ApiResponse;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/github/cherrywechat/network/model/FriendLinkData;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lio/github/cherrywechat/network/model/FriendLinkData;->getItems()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/github/cherrywechat/network/model/FriendLinkItem;

    invoke-virtual {v2}, Lio/github/cherrywechat/network/model/FriendLinkItem;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ltz;->T(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :cond_3
    move-object p0, v0

    goto :goto_2

    :catch_1
    const-wide v0, -0x464efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x4655fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    :cond_4
    :goto_2
    return-object p0
.end method

.method public static final e(LPi;Ljava/util/List;)V
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, LPi;->a:Landroid/widget/LinearLayout;

    if-nez v1, :cond_0

    const-wide v3, -0x465efffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const/4 v1, 0x0

    :cond_0
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v3, 0x2

    if-le v1, v3, :cond_2

    iget-object v4, v0, LPi;->a:Landroid/widget/LinearLayout;

    if-nez v4, :cond_1

    const-wide v4, -0x466cfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const/4 v4, 0x0

    :cond_1
    sub-int/2addr v1, v3

    invoke-virtual {v4, v3, v1}, Landroid/view/ViewGroup;->removeViews(II)V

    :cond_2
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/github/cherrywechat/network/model/FriendLinkItem;

    iget-object v4, v0, LPi;->a:Landroid/widget/LinearLayout;

    if-nez v4, :cond_3

    const-wide v4, -0x467afffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const/4 v4, 0x0

    :cond_3
    const/16 v5, 0x8

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    new-instance v6, Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-direct {v6, v7}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v9

    const v10, 0x55060043

    invoke-virtual {v9, v10}, Landroid/content/Context;->getColor(I)I

    move-result v9

    invoke-virtual {v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/16 v9, 0x10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v10}, LGu;->i(Ljava/lang/Number;)I

    move-result v11

    int-to-float v11, v11

    invoke-virtual {v8, v11}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v6, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/16 v8, 0x14

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v11

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-virtual {v6, v11, v12, v13, v8}, Landroid/view/View;->setPadding(IIII)V

    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v11, -0x1

    const/4 v12, -0x2

    invoke-direct {v8, v11, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v10}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    iput v13, v8, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v6, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v8, Landroid/widget/LinearLayout;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v13

    invoke-direct {v8, v13}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/16 v13, 0x11

    invoke-virtual {v8, v13}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v15, 0x30

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v11

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-direct {v14, v11, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v8, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v3}, Lio/github/cherrywechat/network/model/FriendLinkItem;->getColor()I

    move-result v11

    invoke-static {v11}, Landroid/graphics/Color;->alpha(I)I

    move-result v14

    const/16 v15, 0xff

    if-nez v14, :cond_4

    move v14, v15

    goto :goto_1

    :cond_4
    invoke-static {v11}, Landroid/graphics/Color;->alpha(I)I

    move-result v14

    :goto_1
    int-to-float v14, v14

    const v16, 0x3e19999a    # 0.15f

    mul-float v14, v14, v16

    float-to-int v14, v14

    invoke-static {v14, v15}, LTB;->f(II)I

    move-result v14

    const v16, 0xffffff

    and-int v11, v11, v16

    shl-int/lit8 v14, v14, 0x18

    or-int/2addr v11, v14

    new-instance v14, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v14}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v14, v11}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/16 v11, 0xc

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v11}, LGu;->i(Ljava/lang/Number;)I

    move-result v11

    int-to-float v11, v11

    invoke-virtual {v14, v11}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v8, v14}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v11, Landroid/widget/TextView;

    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v14

    invoke-direct {v11, v14}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3}, Lio/github/cherrywechat/network/model/FriendLinkItem;->getIcon()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v11, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v14, 0x41c00000    # 24.0f

    invoke-virtual {v11, v14}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v11, v13}, Landroid/widget/TextView;->setGravity(I)V

    invoke-virtual {v8, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v8, Landroid/widget/LinearLayout;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v11

    invoke-direct {v8, v11}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v11, 0x1

    invoke-virtual {v8, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-direct {v14, v7, v12, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-static {v10}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-virtual {v14, v9}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v8, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v9, Landroid/widget/TextView;

    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v14

    invoke-direct {v9, v14}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3}, Lio/github/cherrywechat/network/model/FriendLinkItem;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v9, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v14, 0x41800000    # 16.0f

    invoke-virtual {v9, v14}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v14

    const v12, 0x550603f9

    invoke-virtual {v14, v12}, Landroid/content/Context;->getColor(I)I

    move-result v12

    invoke-virtual {v9, v12}, Landroid/widget/TextView;->setTextColor(I)V

    sget-object v12, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v9, v12}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v9, Landroid/widget/TextView;

    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v12

    invoke-direct {v9, v12}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3}, Lio/github/cherrywechat/network/model/FriendLinkItem;->getDescription()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v12, 0x41600000    # 14.0f

    invoke-virtual {v9, v12}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v14

    const v2, 0x550603f7

    invoke-virtual {v14, v2}, Landroid/content/Context;->getColor(I)I

    move-result v2

    invoke-virtual {v9, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    invoke-virtual {v9, v7, v2, v7, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/TextView;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-direct {v2, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v7, -0x463dfffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v2, v12}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v3}, Lio/github/cherrywechat/network/model/FriendLinkItem;->getColor()I

    move-result v7

    invoke-static {v7}, Landroid/graphics/Color;->alpha(I)I

    move-result v7

    const/high16 v8, -0x1000000

    if-nez v7, :cond_5

    invoke-virtual {v3}, Lio/github/cherrywechat/network/model/FriendLinkItem;->getColor()I

    move-result v7

    or-int/2addr v7, v8

    goto :goto_2

    :cond_5
    invoke-virtual {v3}, Lio/github/cherrywechat/network/model/FriendLinkItem;->getColor()I

    move-result v7

    :goto_2
    int-to-double v8, v11

    invoke-static {v7}, Landroid/graphics/Color;->red(I)I

    move-result v14

    int-to-double v11, v14

    const-wide v17, 0x3fd322d0e5604189L    # 0.299

    mul-double v11, v11, v17

    invoke-static {v7}, Landroid/graphics/Color;->green(I)I

    move-result v14

    int-to-double v13, v14

    const-wide v18, 0x3fe2c8b439581062L    # 0.587

    mul-double v13, v13, v18

    add-double/2addr v13, v11

    invoke-static {v7}, Landroid/graphics/Color;->blue(I)I

    move-result v11

    int-to-double v11, v11

    const-wide v18, 0x3fbd2f1a9fbe76c9L    # 0.114

    mul-double v11, v11, v18

    add-double/2addr v11, v13

    int-to-double v13, v15

    div-double/2addr v11, v13

    sub-double/2addr v8, v11

    const-wide/high16 v11, 0x3fe0000000000000L    # 0.5

    cmpl-double v8, v8, v11

    if-ltz v8, :cond_6

    const/4 v11, -0x1

    goto :goto_3

    :cond_6
    const/high16 v11, -0x1000000

    :goto_3
    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v8, 0x11

    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setGravity(I)V

    const/high16 v8, 0x1f000000

    invoke-static {v8}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v9

    new-instance v11, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v11}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v11, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v10}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    int-to-float v7, v7

    invoke-virtual {v11, v7}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    new-instance v7, Landroid/graphics/drawable/RippleDrawable;

    const/4 v12, 0x0

    invoke-direct {v7, v9, v11, v12}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v2, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v9, -0x2

    invoke-direct {v7, v9, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v9, 0x10

    iput v9, v7, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    invoke-static {v10}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-virtual {v7, v9}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v2, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static {v10}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-static {v5}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-static {v10}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    invoke-static {v5}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    invoke-virtual {v2, v7, v9, v10, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    const/4 v5, 0x1

    invoke-virtual {v2, v5}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v2, v5}, Landroid/view/View;->setFocusable(Z)V

    new-instance v7, Ll5;

    const/16 v9, 0x9

    invoke-direct {v7, v9, v2, v3}, Ll5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v6, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/graphics/drawable/RippleDrawable;

    invoke-static {v8}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v7

    invoke-virtual {v6}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v8

    const/4 v12, 0x0

    invoke-direct {v2, v7, v8, v12}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v6, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v6, v5}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v6, v5}, Landroid/view/View;->setFocusable(Z)V

    new-instance v2, Ll5;

    const/16 v5, 0xa

    invoke-direct {v2, v5, v6, v3}, Ll5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v6, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v4, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto/16 :goto_0

    :cond_7
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    const-wide v0, -0x46c9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method public final c(Landroid/app/Activity;IILandroid/content/Intent;)V
    .locals 0

    const-wide p1, -0x46d2fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method public final d(Landroid/app/Activity;)V
    .locals 2

    const-wide v0, -0x46c0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method public getContentView()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 2

    const-wide v0, -0x46dbfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getViewId()I
    .locals 1

    const/4 v0, 0x7

    return v0
.end method
