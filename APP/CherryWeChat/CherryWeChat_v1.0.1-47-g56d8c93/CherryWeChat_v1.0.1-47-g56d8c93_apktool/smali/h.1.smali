.class public final synthetic Lh;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Lh;->a:I

    iput-object p2, p0, Lh;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 20

    move-object/from16 v0, p0

    iget v1, v0, Lh;->a:I

    const/4 v2, -0x1

    const/4 v3, 0x3

    const/16 v4, 0x8

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    iget-object v8, v0, Lh;->b:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast v8, Landroid/app/AlertDialog;

    invoke-virtual {v8}, Landroid/app/Dialog;->dismiss()V

    return-void

    :pswitch_0
    check-cast v8, Landroid/widget/LinearLayout;

    sget-object v1, Lds;->a:Lds;

    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-wide v3, -0x1b1dffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const/16 v3, 0x3eb

    invoke-static {v1, v2, v3}, Lds;->d(Lds;Landroid/content/Context;I)V

    return-void

    :pswitch_1
    check-cast v8, Loy;

    sget-boolean v1, Loy;->e:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v8, Loy;->a:Landroid/widget/TextView;

    if-nez v1, :cond_1

    const-wide v1, -0x1b175fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-object v1, v6

    :cond_1
    const-wide v9, -0x1b102fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v1, v5}, Landroid/view/View;->setClickable(Z)V

    const v2, 0x3f19999a    # 0.6f

    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v5, -0x616162

    invoke-virtual {v2, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v2, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sput-boolean v7, Loy;->e:Z

    sget-object v1, Lhe;->a:Lhd;

    sget-object v1, LZp;->a:Lnk;

    invoke-static {v1}, LPj;->a(Lac;)LCb;

    move-result-object v1

    new-instance v2, Lny;

    invoke-direct {v2, v8, v6, v7}, Lny;-><init>(Loy;LEb;I)V

    invoke-static {v1, v2, v3}, LNj;->G(Lfc;Lkotlin/jvm/functions/Function2;I)V

    :goto_0
    return-void

    :pswitch_2
    check-cast v8, Landroid/widget/FrameLayout;

    sget-object v1, Lds;->a:Lds;

    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-wide v3, -0x538efffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-wide v4, -0x539efffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const-wide v4, -0x28d1fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    sget-object v4, LY4;->a:LY4;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, LY4;->b(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v7, 0x3ef

    :cond_2
    invoke-static {v1, v2, v7}, Lds;->d(Lds;Landroid/content/Context;I)V

    return-void

    :pswitch_3
    check-cast v8, LLt;

    iget-object v1, v8, LLt;->f:Landroid/widget/EditText;

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Landroid/widget/TextView;->getSelectionEnd()I

    move-result v1

    iget-object v2, v8, LLt;->f:Landroid/widget/EditText;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v2

    instance-of v2, v2, Landroid/text/method/PasswordTransformationMethod;

    if-eqz v2, :cond_4

    iget-object v2, v8, LLt;->f:Landroid/widget/EditText;

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    goto :goto_1

    :cond_4
    iget-object v2, v8, LLt;->f:Landroid/widget/EditText;

    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    :goto_1
    if-ltz v1, :cond_5

    iget-object v2, v8, LLt;->f:Landroid/widget/EditText;

    invoke-virtual {v2, v1}, Landroid/widget/EditText;->setSelection(I)V

    :cond_5
    invoke-virtual {v8}, Lbg;->p()V

    :goto_2
    return-void

    :pswitch_4
    check-cast v8, LSq;

    invoke-virtual {v8}, LSq;->D()V

    throw v6

    :pswitch_5
    move-object v9, v8

    check-cast v9, Ljq;

    new-instance v1, Landroid/widget/ScrollView;

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-direct {v1, v8}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    const/16 v8, 0x18

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    const/16 v11, 0x10

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    invoke-static/range {v16 .. v16}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-static/range {v16 .. v16}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-virtual {v1, v10, v12, v13, v14}, Landroid/view/View;->setPadding(IIII)V

    new-instance v10, Landroid/widget/LinearLayout;

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v12

    invoke-direct {v10, v12}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v10, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v12, Landroid/widget/LinearLayout;

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v13

    invoke-direct {v12, v13}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v12, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v13

    const v14, 0x55060050

    invoke-virtual {v13, v14}, Landroid/content/Context;->getColor(I)I

    move-result v13

    const v15, 0x3da3d70a    # 0.08f

    invoke-static {v13, v15}, Ljq;->g(IF)I

    move-result v13

    new-instance v15, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v15}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v15, v13}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static/range {v16 .. v16}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    int-to-float v13, v13

    invoke-virtual {v15, v13}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v13

    invoke-virtual {v13, v14}, Landroid/content/Context;->getColor(I)I

    move-result v13

    move/from16 v17, v4

    const v4, 0x3ecccccd    # 0.4f

    invoke-static {v13, v4}, Ljq;->g(IF)I

    move-result v4

    invoke-virtual {v15, v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    invoke-virtual {v12, v15}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/16 v3, 0x14

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    const/16 v13, 0x12

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-virtual {v12, v4, v15, v6, v13}, Landroid/view/View;->setPadding(IIII)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, -0x2

    invoke-direct {v4, v2, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    iput v3, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v12, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v3, Landroid/widget/LinearLayout;

    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {v3, v11}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v4, Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v11

    invoke-direct {v4, v11}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v18, -0x2ec51fffff835L

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v4, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v11, 0x41900000    # 18.0f

    invoke-virtual {v4, v11}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-virtual {v4, v5, v5, v13, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v13

    invoke-direct {v4, v13}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v18, -0x2ec54fffff835L

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v4, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v13, 0x41800000    # 16.0f

    invoke-virtual {v4, v13}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v15

    invoke-virtual {v15, v14}, Landroid/content/Context;->getColor(I)I

    move-result v14

    invoke-virtual {v4, v14}, Landroid/widget/TextView;->setTextColor(I)V

    sget-object v14, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v4, v14}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v12, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, Landroid/widget/TextView;

    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v18, -0x2ec59fffff835L

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v4, 0x41500000    # 13.0f

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const v15, 0x550603f7

    invoke-virtual {v4, v15}, Landroid/content/Context;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v4, 0x41000000    # 8.0f

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-virtual {v3, v4, v15}, Landroid/widget/TextView;->setLineSpacing(FF)V

    const/16 v4, 0xa

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-virtual {v3, v5, v4, v5, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v12, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v10, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-wide v3, -0x2ed83fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v18, -0x2ed86fffff835L

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v18, -0x2ed8bfffff835L

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v15

    const v6, 0x55060049

    invoke-virtual {v15, v6}, Landroid/content/Context;->getColor(I)I

    move-result v15

    const-wide v18, -0x2ed96fffff835L

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;

    move-result-object v17

    move/from16 v18, v13

    move v13, v15

    new-instance v15, Lcq;

    invoke-direct {v15, v9, v5}, Lcq;-><init>(Ljq;I)V

    move-object v5, v10

    move-object v10, v3

    move-object v3, v5

    move v5, v11

    move-object v11, v4

    move-object v4, v14

    move-object/from16 v14, v17

    invoke-virtual/range {v9 .. v15}, Ljq;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;LUi;)Landroid/widget/LinearLayout;

    move-result-object v10

    invoke-virtual {v3, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-wide v10, -0x2ed99fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    const-wide v11, -0x2ed9cfffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    const-wide v12, -0x2eda1fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v13

    const v14, 0x5506004b

    invoke-virtual {v13, v14}, Landroid/content/Context;->getColor(I)I

    move-result v13

    const-wide v14, -0x2edaafffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v14

    new-instance v15, Lcq;

    invoke-direct {v15, v9, v7}, Lcq;-><init>(Ljq;I)V

    invoke-virtual/range {v9 .. v15}, Ljq;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;LUi;)Landroid/widget/LinearLayout;

    move-result-object v7

    invoke-virtual {v3, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-wide v10, -0x2edadfffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    const-wide v11, -0x2edb0fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    const-wide v12, -0x2edb6fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    const v13, 0x55060047

    invoke-virtual {v7, v13}, Landroid/content/Context;->getColor(I)I

    move-result v13

    const-wide v14, -0x2ec40fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v14

    new-instance v15, Lcq;

    const/4 v7, 0x2

    invoke-direct {v15, v9, v7}, Lcq;-><init>(Ljq;I)V

    invoke-virtual/range {v9 .. v15}, Ljq;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;LUi;)Landroid/widget/LinearLayout;

    move-result-object v7

    invoke-virtual {v3, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v1, v3}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    new-instance v3, Landroid/app/AlertDialog$Builder;

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    const v9, 0x103023a

    invoke-direct {v3, v7, v9}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    const-wide v9, -0x2ec43fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const-wide v9, -0x2ec4efffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const/4 v7, 0x0

    invoke-virtual {v1, v3, v7}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    const v3, 0x1020016

    invoke-virtual {v1, v3}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    if-eqz v3, :cond_6

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const v7, 0x550603f9

    invoke-virtual {v5, v7}, Landroid/content/Context;->getColor(I)I

    move-result v5

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-static/range {v16 .. v16}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-virtual {v3, v4, v5, v7, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    :cond_6
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3, v6}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v3, 0x41800000    # 16.0f

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setAllCaps(Z)V

    :cond_7
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-eqz v1, :cond_8

    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v1}, Landroid/view/Window;->getContext()Landroid/content/Context;

    move-result-object v3

    const v4, 0x55060043

    invoke-virtual {v3, v4}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static/range {v16 .. v16}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v1, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v1}, Landroid/view/Window;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-double v2, v2

    const-wide v4, 0x3feccccccccccccdL    # 0.9

    mul-double/2addr v2, v4

    double-to-int v2, v2

    const/4 v3, -0x2

    invoke-virtual {v1, v2, v3}, Landroid/view/Window;->setLayout(II)V

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-virtual {v1, v2}, Landroid/view/Window;->setDimAmount(F)V

    :cond_8
    return-void

    :pswitch_6
    move v3, v5

    check-cast v8, LOg;

    iget-object v1, v8, LOg;->j:LEC;

    if-eqz v1, :cond_c

    iget-object v4, v8, LOg;->a:Lca;

    iget-object v1, v1, LEC;->a:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v5, -0x1bb93fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    iget-object v5, v4, Lca;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v5, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    if-eqz v6, :cond_9

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto :goto_3

    :cond_9
    move v6, v3

    :goto_3
    xor-int/2addr v6, v7

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-interface {v5, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, v4, Lca;->d:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LEC;

    iget-object v6, v6, LEC;->a:Ljava/lang/String;

    invoke-static {v6, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    goto :goto_5

    :cond_a
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_b
    move v3, v2

    :goto_5
    if-eq v3, v2, :cond_c

    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/g;->notifyItemChanged(I)V

    :cond_c
    return-void

    :pswitch_7
    check-cast v8, LLe;

    invoke-virtual {v8}, LLe;->t()V

    return-void

    :pswitch_8
    check-cast v8, LN9;

    iget-object v1, v8, LN9;->i:Landroid/widget/EditText;

    if-nez v1, :cond_d

    goto :goto_6

    :cond_d
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    if-eqz v1, :cond_e

    invoke-interface {v1}, Landroid/text/Editable;->clear()V

    :cond_e
    invoke-virtual {v8}, Lbg;->p()V

    :goto_6
    return-void

    :pswitch_9
    move/from16 v17, v4

    check-cast v8, LX7;

    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-wide v2, -0x1c46efffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x1c47efffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x1c405fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, LD2;

    move/from16 v5, v17

    invoke-direct {v4, v5, v8}, LD2;-><init>(ILjava/lang/Object;)V

    const/4 v7, 0x0

    invoke-static {v1, v2, v7, v3, v4}, Lgf;->P(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LNd;)V

    return-void

    :pswitch_a
    check-cast v8, Landroid/widget/ImageView;

    invoke-virtual {v8}, Landroid/view/View;->performClick()Z

    return-void

    :pswitch_b
    check-cast v8, Lj;

    iget-object v1, v8, Lj;->c:LUi;

    invoke-interface {v1}, LUi;->a()Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
