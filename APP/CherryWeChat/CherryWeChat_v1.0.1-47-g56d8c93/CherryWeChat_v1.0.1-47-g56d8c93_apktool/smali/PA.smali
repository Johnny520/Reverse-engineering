.class public final synthetic LPA;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:LSA;

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:D


# direct methods
.method public synthetic constructor <init>(LSA;Landroid/app/Activity;D)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPA;->a:LSA;

    iput-object p2, p0, LPA;->b:Landroid/app/Activity;

    iput-wide p3, p0, LPA;->c:D

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 17

    move-object/from16 v0, p0

    iget-object v3, v0, LPA;->a:LSA;

    iget-object v5, v3, LSA;->b:Ljava/lang/String;

    const/16 v1, 0x32

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xc

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v4, 0x1c

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v6, 0x18

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    move-object v7, v2

    new-instance v2, Landroid/app/Dialog;

    move-object v8, v4

    iget-object v4, v0, LPA;->b:Landroid/app/Activity;

    invoke-direct {v2, v4}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    const/4 v9, 0x1

    invoke-virtual {v2, v9}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    const/4 v10, 0x0

    invoke-virtual {v2, v10}, Landroid/app/Dialog;->setCancelable(Z)V

    invoke-virtual {v2, v10}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    invoke-virtual {v2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v11

    if-eqz v11, :cond_0

    new-instance v12, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v12, v10}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v11, v12}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    new-instance v11, Landroid/widget/LinearLayout;

    invoke-direct {v11, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v11, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v13, 0x12c

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    const/4 v14, -0x2

    invoke-direct {v12, v13, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v11, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v11, v10, v10, v10, v10}, Landroid/view/View;->setPadding(IIII)V

    new-instance v12, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v12}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v13, 0x55060035

    invoke-virtual {v4, v13}, Landroid/content/Context;->getColor(I)I

    move-result v13

    invoke-virtual {v12, v13}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/16 v13, 0x14

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    int-to-float v13, v13

    invoke-virtual {v12, v13}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v11, v12}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v12, Landroid/widget/LinearLayout;

    invoke-direct {v12, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v12, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v9, 0x11

    invoke-virtual {v12, v9}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v15, -0x1

    invoke-direct {v13, v15, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v12, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-virtual {v12, v10, v13, v10, v10}, Landroid/view/View;->setPadding(IIII)V

    new-instance v13, Landroid/widget/TextView;

    invoke-direct {v13, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object/from16 v16, v11

    const-wide v10, -0x1beebfffff835L

    const/high16 v15, 0x41a00000    # 20.0f

    invoke-static {v10, v11, v13, v15}, LEy;->l(JLandroid/widget/TextView;F)V

    sget-object v10, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v13, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    invoke-virtual {v13, v9}, Landroid/widget/TextView;->setGravity(I)V

    const v11, 0x55060029

    invoke-virtual {v4, v11}, Landroid/content/Context;->getColor(I)I

    move-result v11

    invoke-virtual {v13, v11}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v11, v14, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v15, 0x8

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    iput v15, v11, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    invoke-virtual {v13, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v12, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v11, v16

    invoke-virtual {v11, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v12, Landroid/widget/TextView;

    invoke-direct {v12, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object v15, v10

    const-wide v9, -0x1bef0fffff835L

    const/high16 v13, 0x41600000    # 14.0f

    invoke-static {v9, v10, v12, v13}, LEy;->l(JLandroid/widget/TextView;F)V

    const v9, 0x550603f7

    invoke-virtual {v4, v9}, Landroid/content/Context;->getColor(I)I

    move-result v10

    invoke-virtual {v12, v10}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v10, 0x3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v10}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    int-to-float v10, v10

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-virtual {v12, v10, v13}, Landroid/widget/TextView;->setLineSpacing(FF)V

    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v13, -0x1

    invoke-direct {v10, v13, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    const/4 v14, 0x0

    invoke-virtual {v10, v13, v9, v8, v14}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v12, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v11, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v8, Landroid/widget/LinearLayout;

    invoke-direct {v8, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v8, v14}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v13, 0x11

    invoke-virtual {v8, v13}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/high16 v9, 0x3f800000    # 1.0f

    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v12, -0x1

    const/4 v14, -0x2

    invoke-direct {v10, v12, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-virtual {v10, v12, v14, v13, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v8, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v6, Landroid/widget/TextView;

    invoke-direct {v6, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v12, -0x1beaafffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v10, 0x41700000    # 15.0f

    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setTextSize(F)V

    const/16 v13, 0x11

    invoke-virtual {v6, v13}, Landroid/widget/TextView;->setGravity(I)V

    const v12, 0x550603f7

    invoke-virtual {v4, v12}, Landroid/content/Context;->getColor(I)I

    move-result v14

    invoke-virtual {v6, v14}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v12, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v12}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v14, 0x55060040

    invoke-virtual {v4, v14}, Landroid/content/Context;->getColor(I)I

    move-result v13

    invoke-virtual {v12, v13}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    int-to-float v13, v13

    invoke-virtual {v12, v13}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v6, v12}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    const/4 v14, 0x0

    invoke-direct {v12, v14, v13, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    iput v13, v12, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    invoke-virtual {v6, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v12, LFA;

    const/4 v13, 0x0

    invoke-direct {v12, v2, v13}, LFA;-><init>(Landroid/app/Dialog;I)V

    invoke-virtual {v6, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v8, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v12, Landroid/widget/TextView;

    invoke-direct {v12, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v13, -0x1beadfffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide/16 v13, 0x5

    invoke-virtual {v6, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-wide v13, -0x1beb4fffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v12, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v12, v10}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v12, v15}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const/16 v13, 0x11

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setGravity(I)V

    const v6, 0x550603f7

    invoke-virtual {v4, v6}, Landroid/content/Context;->getColor(I)I

    move-result v6

    invoke-virtual {v12, v6}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v14, 0x0

    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setEnabled(Z)V

    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v10, 0x55060040

    invoke-virtual {v4, v10}, Landroid/content/Context;->getColor(I)I

    move-result v10

    invoke-virtual {v6, v10}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    int-to-float v7, v7

    invoke-virtual {v6, v7}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v12, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v1

    invoke-direct {v6, v14, v1, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v12, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v12, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    new-instance v1, LGA;

    iget-wide v6, v0, LPA;->c:D

    invoke-direct/range {v1 .. v7}, LGA;-><init>(Landroid/app/Dialog;LSA;Landroid/app/Activity;Ljava/lang/String;D)V

    invoke-virtual {v12, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v1, LRA;

    invoke-direct {v1, v12, v4}, LRA;-><init>(Landroid/widget/TextView;Landroid/app/Activity;)V

    invoke-virtual {v1}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    invoke-virtual {v8, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v11, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v2, v11}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    invoke-virtual {v2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-eqz v1, :cond_1

    const/16 v3, 0x154

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    const/4 v14, -0x2

    invoke-virtual {v1, v3, v14}, Landroid/view/Window;->setLayout(II)V

    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    const/4 v14, 0x0

    invoke-direct {v3, v14}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v3

    const/16 v13, 0x11

    iput v13, v3, Landroid/view/WindowManager$LayoutParams;->gravity:I

    invoke-virtual {v1, v3}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    :cond_1
    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    const/4 v1, 0x0

    invoke-virtual {v11, v1}, Landroid/view/View;->setAlpha(F)V

    const v1, 0x3f666666    # 0.9f

    invoke-virtual {v11, v1}, Landroid/view/View;->setScaleY(F)V

    invoke-virtual {v11}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1, v9}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1, v9}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const-wide/16 v2, 0xfa

    invoke-virtual {v1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void
.end method
