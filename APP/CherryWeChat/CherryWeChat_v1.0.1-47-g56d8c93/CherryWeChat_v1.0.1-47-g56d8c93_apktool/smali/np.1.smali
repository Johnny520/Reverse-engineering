.class public final Lnp;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LWk;


# instance fields
.field public a:Landroid/widget/LinearLayout;

.field public b:Landroid/app/Activity;

.field public c:Landroid/widget/EditText;

.field public d:Landroid/widget/EditText;

.field public e:Landroid/widget/TextView;

.field public f:Landroid/widget/TextView;


# direct methods
.method public static final a(Lnp;Ljava/lang/String;LFb;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Lmp;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lmp;

    iget v1, v0, Lmp;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lmp;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lmp;

    invoke-direct {v0, p0, p2}, Lmp;-><init>(Lnp;LFb;)V

    :goto_0
    iget-object p2, v0, Lmp;->d:Ljava/lang/Object;

    iget v1, v0, Lmp;->f:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    sget-object v6, Lgc;->a:Lgc;

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-ne v1, v2, :cond_1

    :try_start_0
    invoke-static {p2}, LOj;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_5

    :catch_0
    move-exception p1

    goto/16 :goto_7

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-wide p1, -0x77cefffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    :try_start_1
    invoke-static {p2}, LOj;->T(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :cond_3
    invoke-static {p2}, LOj;->T(Ljava/lang/Object;)V

    :try_start_2
    sget-object p2, Lhe;->a:Lhd;

    sget-object p2, LVc;->b:LVc;

    new-instance v1, LX2;

    invoke-direct {v1, p1, v5}, LX2;-><init>(Ljava/lang/String;LEb;)V

    iput v4, v0, Lmp;->f:I

    invoke-static {p2, v1, v0}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v6, :cond_4

    goto/16 :goto_9

    :cond_4
    :goto_1
    check-cast p2, Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    sget-object p1, Lzm;->a:LAm;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lio/github/cherrywechat/network/model/ApiResponse;->Companion:Lio/github/cherrywechat/network/model/ApiResponse$Companion;

    sget-object v7, LVC;->b:LVC;

    invoke-virtual {v1, v7}, Lio/github/cherrywechat/network/model/ApiResponse$Companion;->serializer(LQm;)LQm;

    move-result-object v1

    check-cast v1, LQm;

    invoke-virtual {p1, v1, p2}, Lmm;->a(LQm;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_2

    :catch_1
    move-exception p1

    const-wide v7, -0x770efffff835L

    :try_start_4
    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    const-class v1, Lio/github/cherrywechat/network/model/ApiResponse;

    invoke-static {v1}, LJv;->a(Ljava/lang/Class;)LF9;

    move-result-object v1

    invoke-virtual {v1}, LF9;->b()Ljava/lang/String;

    const-wide v7, -0x7729fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-object p1, v5

    :goto_2
    check-cast p1, Lio/github/cherrywechat/network/model/ApiResponse;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lio/github/cherrywechat/network/model/ApiResponse;->getCode()I

    move-result v1

    goto :goto_3

    :cond_5
    const/4 v1, -0x1

    :goto_3
    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lio/github/cherrywechat/network/model/ApiResponse;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_6

    goto :goto_4

    :cond_6
    move-object p1, v5

    :goto_4
    if-nez p1, :cond_8

    :cond_7
    const-wide v7, -0x772dfffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    :cond_8
    if-nez v1, :cond_d

    const-wide v7, -0x7732fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v3}, Lnp;->g(Ljava/lang/String;Z)V

    iget-object p1, p0, Lnp;->f:Landroid/widget/TextView;

    if-nez p1, :cond_9

    const-wide v7, -0x77b7fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-object p1, v5

    :cond_9
    iget-object v1, p0, Lnp;->b:Landroid/app/Activity;

    if-nez v1, :cond_a

    const-wide v7, -0x7646fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-object v1, v5

    :cond_a
    const v7, 0x5506004b

    invoke-virtual {v1, v7}, Landroid/content/Context;->getColor(I)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    sget-object p1, LEA;->a:LEA;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, LEA;->j(Ljava/lang/String;)V

    iput v2, v0, Lmp;->f:I

    const-wide/16 p1, 0x5dc

    invoke-static {p1, p2, v0}, Lcr;->v(JLFb;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v6, :cond_b

    goto :goto_9

    :cond_b
    :goto_5
    iget-object p1, p0, Lnp;->b:Landroid/app/Activity;

    if-nez p1, :cond_c

    const-wide p1, -0x7737fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    goto :goto_6

    :cond_c
    move-object v5, p1

    :goto_6
    invoke-virtual {v5}, Landroid/app/Activity;->finish()V

    goto :goto_8

    :cond_d
    const-wide v0, -0x77c0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v4}, Lnp;->g(Ljava/lang/String;Z)V

    invoke-virtual {p0, v3}, Lnp;->f(Z)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_8

    :goto_7
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v0, -0x77c6fffff835L

    invoke-static {v0, v1, p2, p1}, LEy;->c(JLjava/lang/StringBuilder;Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v4}, Lnp;->g(Ljava/lang/String;Z)V

    invoke-virtual {p0, v3}, Lnp;->f(Z)V

    :goto_8
    sget-object v6, LTC;->a:LTC;

    :goto_9
    return-object v6
.end method

.method public static final e(Lnp;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    :try_start_0
    invoke-static {}, Lgf;->I()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ll0;

    invoke-direct {v1, v0, p1, p2}, Ll0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lm0;->a:Lm0;

    iget-object p0, p0, Lnp;->b:Landroid/app/Activity;

    if-nez p0, :cond_0

    const-wide v2, -0x7705fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const/4 p0, 0x0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, v1}, Lm0;->d(Landroid/app/Activity;Ll0;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    const-wide v0, -0x764ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method public final c(Landroid/app/Activity;IILandroid/content/Intent;)V
    .locals 0

    const-wide p1, -0x7658fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method public final d(Landroid/app/Activity;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-wide v2, -0x49a2fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iput-object v1, v0, Lnp;->b:Landroid/app/Activity;

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const v5, 0x55060040

    invoke-virtual {v4, v5}, Landroid/content/Context;->getColor(I)I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v5, -0x1

    invoke-direct {v4, v5, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v4, 0xc

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    const/4 v8, 0x0

    invoke-virtual {v2, v8, v6, v8, v7}, Landroid/view/View;->setPadding(IIII)V

    iput-object v2, v0, Lnp;->a:Landroid/widget/LinearLayout;

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v9, -0x2

    invoke-direct {v7, v5, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v10, 0x10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v11}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    const/16 v13, 0x8

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-static {v11}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-virtual {v7, v12, v14, v15, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v2, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v7, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v7}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v12, 0x55060035

    invoke-virtual {v1, v12}, Landroid/content/Context;->getColor(I)I

    move-result v14

    invoke-virtual {v7, v14}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v11}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    int-to-float v14, v14

    invoke-virtual {v7, v14}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    const v15, 0x55060039

    invoke-virtual {v1, v15}, Landroid/content/Context;->getColor(I)I

    move-result v12

    invoke-virtual {v7, v14, v12}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    invoke-virtual {v2, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/16 v7, 0x14

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    const/16 v14, 0x18

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    invoke-virtual {v2, v12, v15, v7, v3}, Landroid/view/View;->setPadding(IIII)V

    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v7, v5, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    iput v12, v7, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v3, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v3, v10}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v7, Landroid/widget/ImageView;

    invoke-direct {v7, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    const v12, 0x1080042

    invoke-virtual {v7, v12}, Landroid/widget/ImageView;->setImageResource(I)V

    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v15, 0x20

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-direct {v12, v8, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-virtual {v12, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    iput v10, v12, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    invoke-virtual {v7, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v8, 0x550603f9

    invoke-virtual {v1, v8}, Landroid/content/Context;->getColor(I)I

    move-result v12

    invoke-virtual {v7, v12}, Landroid/widget/ImageView;->setColorFilter(I)V

    invoke-virtual {v3, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v7, Landroid/widget/TextView;

    invoke-direct {v7, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object v15, v11

    const-wide v10, -0x49abfffff835L

    const/high16 v12, 0x41a00000    # 20.0f

    invoke-static {v10, v11, v7, v12}, LEy;->l(JLandroid/widget/TextView;F)V

    invoke-virtual {v1, v8}, Landroid/content/Context;->getColor(I)I

    move-result v10

    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setTextColor(I)V

    sget-object v10, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    invoke-virtual {v3, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v7, 0x1

    invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v7, v5, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v11

    iput v11, v7, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v3, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v7, Landroid/widget/TextView;

    invoke-direct {v7, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v11, -0x49b0fffff835L

    const/high16 v5, 0x41600000    # 14.0f

    invoke-static {v11, v12, v7, v5}, LEy;->l(JLandroid/widget/TextView;F)V

    invoke-virtual {v1, v8}, Landroid/content/Context;->getColor(I)I

    move-result v11

    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v12, -0x1

    invoke-direct {v11, v12, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    iput v12, v11, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v7, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v3, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v7, Landroid/widget/EditText;

    invoke-direct {v7, v1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    invoke-static {}, Landroid/text/Editable$Factory;->getInstance()Landroid/text/Editable$Factory;

    move-result-object v11

    invoke-static {}, Lgf;->I()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Landroid/text/Editable$Factory;->newEditable(Ljava/lang/CharSequence;)Landroid/text/Editable;

    move-result-object v11

    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v11, 0x0

    invoke-virtual {v7, v11}, Landroid/view/View;->setEnabled(Z)V

    const/high16 v11, 0x41800000    # 16.0f

    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setTextSize(F)V

    const v12, 0x550603f7

    invoke-virtual {v1, v12}, Landroid/content/Context;->getColor(I)I

    move-result v11

    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setTextColor(I)V

    const v11, 0x550603f5

    invoke-virtual {v1, v11}, Landroid/content/Context;->getColor(I)I

    move-result v12

    invoke-virtual {v7, v12}, Landroid/widget/TextView;->setHintTextColor(I)V

    new-instance v12, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v12}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v8, 0x5506008c

    invoke-virtual {v1, v8}, Landroid/content/Context;->getColor(I)I

    move-result v5

    invoke-virtual {v12, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v12, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    const v8, 0x55060039

    invoke-virtual {v1, v8}, Landroid/content/Context;->getColor(I)I

    move-result v11

    invoke-virtual {v12, v5, v11}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    invoke-virtual {v7, v12}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v11

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-virtual {v7, v5, v8, v11, v12}, Landroid/view/View;->setPadding(IIII)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v12, -0x1

    invoke-direct {v5, v12, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v7, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v3, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v7, -0x4845fffff835L

    const/high16 v11, 0x41400000    # 12.0f

    invoke-static {v7, v8, v5, v11}, LEy;->l(JLandroid/widget/TextView;F)V

    const v7, 0x550603f5

    invoke-virtual {v1, v7}, Landroid/content/Context;->getColor(I)I

    move-result v8

    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v7, v12, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v8, 0x4

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    iput v12, v7, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    invoke-virtual {v5, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v7, 0x1

    invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v12, -0x1

    invoke-direct {v5, v12, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    iput v7, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v3, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v11, -0x4852fffff835L

    const/high16 v7, 0x41600000    # 14.0f

    invoke-static {v11, v12, v5, v7}, LEy;->l(JLandroid/widget/TextView;F)V

    const v7, 0x550603f9

    invoke-virtual {v1, v7}, Landroid/content/Context;->getColor(I)I

    move-result v11

    invoke-virtual {v5, v11}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v5, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v12, -0x1

    invoke-direct {v7, v12, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v11

    iput v11, v7, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v5, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v5, Landroid/widget/EditText;

    invoke-direct {v5, v1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    const-wide v11, -0x4857fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    const/high16 v7, 0x41800000    # 16.0f

    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setTextSize(F)V

    const v7, 0x550603f9

    invoke-virtual {v1, v7}, Landroid/content/Context;->getColor(I)I

    move-result v11

    invoke-virtual {v5, v11}, Landroid/widget/TextView;->setTextColor(I)V

    const v7, 0x550603f5

    invoke-virtual {v1, v7}, Landroid/content/Context;->getColor(I)I

    move-result v11

    invoke-virtual {v5, v11}, Landroid/widget/TextView;->setHintTextColor(I)V

    const/16 v7, 0x21

    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setInputType(I)V

    new-instance v7, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v7}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v11, 0x5506008c

    invoke-virtual {v1, v11}, Landroid/content/Context;->getColor(I)I

    move-result v11

    invoke-virtual {v7, v11}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v11

    int-to-float v11, v11

    invoke-virtual {v7, v11}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v11

    const v12, 0x55060039

    invoke-virtual {v1, v12}, Landroid/content/Context;->getColor(I)I

    move-result v9

    invoke-virtual {v7, v11, v9}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    invoke-virtual {v5, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v11

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-virtual {v5, v7, v9, v11, v12}, Landroid/view/View;->setPadding(IIII)V

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v9, -0x2

    const/4 v12, -0x1

    invoke-direct {v7, v12, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v5, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iput-object v5, v0, Lnp;->c:Landroid/widget/EditText;

    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v11, 0x0

    invoke-virtual {v5, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v7, v12, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    iput v9, v7, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    invoke-virtual {v5, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v12, 0x10

    invoke-virtual {v5, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v7, Landroid/widget/TextView;

    invoke-direct {v7, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v11, -0x486dfffff835L

    const/high16 v9, 0x41400000    # 12.0f

    invoke-static {v11, v12, v7, v9}, LEy;->l(JLandroid/widget/TextView;F)V

    const v9, 0x550603f5

    invoke-virtual {v1, v9}, Landroid/content/Context;->getColor(I)I

    move-result v11

    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v11, 0x3f800000    # 1.0f

    move-object/from16 v16, v4

    const/4 v4, -0x2

    const/4 v12, 0x0

    invoke-direct {v9, v12, v4, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v7, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object v4, Lm0;->a:Lm0;

    invoke-static {}, Lgf;->I()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v7}, Lm0;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    new-instance v4, Landroid/widget/TextView;

    invoke-direct {v4, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v11, -0x487ffffff835L

    const/high16 v9, 0x41300000    # 11.0f

    invoke-static {v11, v12, v4, v9}, LEy;->l(JLandroid/widget/TextView;F)V

    const v9, 0x55060042

    invoke-virtual {v1, v9}, Landroid/content/Context;->getColor(I)I

    move-result v9

    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v11

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    const/4 v7, 0x0

    invoke-virtual {v4, v9, v11, v7, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    const/4 v7, 0x1

    invoke-virtual {v4, v7}, Landroid/view/View;->setClickable(Z)V

    new-instance v7, Lkp;

    const/4 v9, 0x0

    invoke-direct {v7, v0, v9}, Lkp;-><init>(Lnp;I)V

    invoke-virtual {v4, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v5, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v7, 0x1

    invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v9, -0x2

    const/4 v12, -0x1

    invoke-direct {v4, v12, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    iput v5, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v4, Landroid/widget/TextView;

    invoke-direct {v4, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v11, -0x4807fffff835L

    const/high16 v7, 0x41600000    # 14.0f

    invoke-static {v11, v12, v4, v7}, LEy;->l(JLandroid/widget/TextView;F)V

    const v7, 0x550603f9

    invoke-virtual {v1, v7}, Landroid/content/Context;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v9, -0x2

    const/4 v12, -0x1

    invoke-direct {v5, v12, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    iput v7, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/EditText;

    invoke-direct {v4, v1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    const-wide v11, -0x480cfffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    const/high16 v7, 0x41800000    # 16.0f

    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTextSize(F)V

    const v7, 0x550603f9

    invoke-virtual {v1, v7}, Landroid/content/Context;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    const v7, 0x550603f5

    invoke-virtual {v1, v7}, Landroid/content/Context;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setHintTextColor(I)V

    const/16 v5, 0x81

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setInputType(I)V

    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v7, 0x55060035

    invoke-virtual {v1, v7}, Landroid/content/Context;->getColor(I)I

    move-result v7

    invoke-virtual {v5, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    int-to-float v7, v7

    invoke-virtual {v5, v7}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    const v12, 0x55060039

    invoke-virtual {v1, v12}, Landroid/content/Context;->getColor(I)I

    move-result v9

    invoke-virtual {v5, v7, v9}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    invoke-static/range {v16 .. v16}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-static/range {v16 .. v16}, LGu;->i(Ljava/lang/Number;)I

    move-result v11

    invoke-virtual {v4, v5, v7, v9, v11}, Landroid/view/View;->setPadding(IIII)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v9, -0x2

    const/4 v12, -0x1

    invoke-direct {v5, v12, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iput-object v4, v0, Lnp;->d:Landroid/widget/EditText;

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v4, -0x482bfffff835L

    const/high16 v7, 0x41800000    # 16.0f

    invoke-static {v4, v5, v3, v7}, LEy;->l(JLandroid/widget/TextView;F)V

    const v4, 0x5506002e

    invoke-virtual {v1, v4}, Landroid/content/Context;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const/16 v4, 0x11

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setGravity(I)V

    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v7, 0x55060029

    invoke-virtual {v1, v7}, Landroid/content/Context;->getColor(I)I

    move-result v7

    invoke-virtual {v5, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    int-to-float v7, v7

    invoke-virtual {v5, v7}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v3, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v11

    invoke-virtual {v3, v5, v7, v9, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v9, -0x2

    const/4 v12, -0x1

    invoke-direct {v5, v12, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    iput v7, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v3, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v7, 0x1

    invoke-virtual {v3, v7}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v3, v7}, Landroid/view/View;->setFocusable(Z)V

    new-instance v5, Lkp;

    const/4 v7, 0x1

    invoke-direct {v5, v0, v7}, Lkp;-><init>(Lnp;I)V

    invoke-virtual {v3, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iput-object v3, v0, Lnp;->e:Landroid/widget/TextView;

    new-instance v5, Lue;

    const/4 v7, 0x2

    invoke-direct {v5, v7, v3}, Lue;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v3, v5}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object v3, v0, Lnp;->e:Landroid/widget/TextView;

    if-nez v3, :cond_1

    const-wide v11, -0x483dfffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    const/4 v3, 0x0

    :cond_1
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v11, -0x48c9fffff835L

    const/high16 v7, 0x41600000    # 14.0f

    invoke-static {v11, v12, v3, v7}, LEy;->l(JLandroid/widget/TextView;F)V

    const v5, 0x550603f7

    invoke-virtual {v1, v5}, Landroid/content/Context;->getColor(I)I

    move-result v7

    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setGravity(I)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v9, -0x2

    const/4 v12, -0x1

    invoke-direct {v4, v12, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iput-object v3, v0, Lnp;->f:Landroid/widget/TextView;

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v3, v0, Lnp;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v7, 0x1

    invoke-virtual {v2, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v3, v12, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    const/4 v11, 0x0

    invoke-virtual {v3, v4, v5, v7, v11}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v4, 0x5506008e

    invoke-virtual {v1, v4}, Landroid/content/Context;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static/range {v16 .. v16}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    const v5, 0x55060092

    invoke-virtual {v1, v5}, Landroid/content/Context;->getColor(I)I

    move-result v5

    invoke-virtual {v3, v4, v5}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/view/View;->setPadding(IIII)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v4, -0x48e4fffff835L

    const/high16 v7, 0x41800000    # 16.0f

    invoke-static {v4, v5, v3, v7}, LEy;->l(JLandroid/widget/TextView;F)V

    const v7, 0x550603f9

    invoke-virtual {v1, v7}, Landroid/content/Context;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v9, -0x2

    const/4 v12, -0x1

    invoke-direct {v4, v12, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static/range {v16 .. v16}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    iput v5, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-wide v3, -0x48ecfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v7, 0x41600000    # 14.0f

    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setTextSize(F)V

    const v4, 0x550603f7

    invoke-virtual {v1, v4}, Landroid/content/Context;->getColor(I)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v9, -0x2

    const/4 v12, -0x1

    invoke-direct {v6, v12, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    iput v10, v6, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    int-to-float v6, v6

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-virtual {v5, v6, v10}, Landroid/widget/TextView;->setLineSpacing(FF)V

    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_0

    :cond_2
    iget-object v1, v0, Lnp;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public final f(Z)V
    .locals 5

    iget-object v0, p0, Lnp;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-wide v2, -0x77fefffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-object v0, v1

    :cond_0
    if-eqz p1, :cond_1

    const-wide v2, -0x778afffff835L

    :goto_0
    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    const-wide v2, -0x7791fffff835L

    goto :goto_0

    :goto_1
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    xor-int/lit8 v2, p1, 0x1

    invoke-virtual {v0, v2}, Landroid/view/View;->setClickable(Z)V

    if-eqz p1, :cond_2

    const p1, 0x3f19999a    # 0.6f

    goto :goto_2

    :cond_2
    const/high16 p1, 0x3f800000    # 1.0f

    :goto_2
    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, Lnp;->d:Landroid/widget/EditText;

    if-nez p1, :cond_3

    const-wide v3, -0x7797fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object v1, p1

    :goto_3
    invoke-virtual {v1, v2}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method public final g(Ljava/lang/String;Z)V
    .locals 2

    iget-object v0, p0, Lnp;->f:Landroid/widget/TextView;

    if-nez v0, :cond_0

    const-wide v0, -0x77a8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p2, :cond_1

    const p2, 0x55060042

    goto :goto_0

    :cond_1
    const p2, 0x550603f7

    :goto_0
    invoke-virtual {p1, p2}, Landroid/content/Context;->getColor(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public final getContentView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lnp;->a:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 2

    const-wide v0, -0x7661fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
