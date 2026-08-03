.class public final synthetic Ld0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP0/a;


# instance fields
.field public final synthetic a:Landroid/app/Activity;

.field public final synthetic b:Z

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;ZIIIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/l;->a:Landroid/app/Activity;

    iput-boolean p2, p0, Ld0/l;->b:Z

    iput p3, p0, Ld0/l;->c:I

    iput p4, p0, Ld0/l;->d:I

    iput p5, p0, Ld0/l;->e:I

    iput p6, p0, Ld0/l;->f:I

    iput p7, p0, Ld0/l;->g:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 34

    move-object/from16 v0, p0

    iget-object v12, v0, Ld0/l;->a:Landroid/app/Activity;

    const-string v1, "$activity"

    invoke-static {v12, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v13, Ld0/c;

    const/4 v1, 0x6

    invoke-direct {v13, v12, v1}, Ld0/c;-><init>(Landroid/app/Activity;I)V

    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v14, v1, Landroid/util/DisplayMetrics;->density:F

    sget-object v1, Lc0/E0;->h:LK0/a;

    invoke-static {}, LU/S;->M()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, LE0/l;->A0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v15

    new-instance v11, Landroid/app/Dialog;

    invoke-direct {v11, v12}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    const/4 v10, 0x1

    invoke-virtual {v11, v10}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    invoke-virtual {v11, v10}, Landroid/app/Dialog;->setCancelable(Z)V

    invoke-virtual {v11, v10}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    new-instance v9, Landroid/widget/LinearLayout;

    invoke-direct {v9, v12}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v9, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v8, 0x0

    invoke-virtual {v2, v8}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    const/16 v3, 0x14

    invoke-static {v3, v14}, LU/S;->p0(IF)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    iget v3, v0, Ld0/l;->g:I

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v9, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/16 v2, 0x12

    invoke-static {v2, v14}, LU/S;->p0(IF)I

    move-result v3

    invoke-static {v2, v14}, LU/S;->p0(IF)I

    move-result v4

    invoke-static {v2, v14}, LU/S;->p0(IF)I

    move-result v2

    const/16 v7, 0x10

    invoke-static {v7, v14}, LU/S;->p0(IF)I

    move-result v5

    invoke-virtual {v9, v3, v4, v2, v5}, Landroid/view/View;->setPadding(IIII)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v12}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {v2, v7}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, v12}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v4, Landroid/widget/TextView;

    invoke-direct {v4, v12}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v5, "\u7f16\u8f91\u5feb\u6377"

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget v6, v0, Ld0/l;->c:I

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v5, 0x41900000    # 18.0f

    const/4 v7, 0x2

    invoke-virtual {v4, v7, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    sget-object v5, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-static {v5, v10}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, v12}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v4

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v8, "\u5df2\u9009 "

    invoke-direct {v10, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "/3 \u00b7 \u70b9\u9009\u5207\u6362"

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget v10, v0, Ld0/l;->d:I

    invoke-virtual {v5, v10}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v4, 0x41400000    # 12.0f

    invoke-virtual {v5, v7, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    const/4 v4, 0x4

    invoke-static {v4, v14}, LU/S;->p0(IF)I

    move-result v4

    const/4 v8, 0x0

    invoke-virtual {v5, v8, v4, v8, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v7, -0x2

    move-object/from16 v20, v13

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-direct {v4, v8, v7, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v2, v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v9, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/view/View;

    invoke-direct {v2, v12}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v8, 0xe

    invoke-static {v8, v14}, LU/S;->p0(IF)I

    move-result v4

    const/4 v7, -0x1

    invoke-direct {v3, v7, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v9, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v4, Landroid/widget/LinearLayout;

    invoke-direct {v4, v12}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x1

    invoke-virtual {v4, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {v1}, LE0/f;->iterator()Ljava/util/Iterator;

    move-result-object v22

    :goto_0
    move-object/from16 v1, v22

    check-cast v1, LE0/c;

    invoke-virtual {v1}, LE0/c;->hasNext()Z

    move-result v2

    iget-boolean v3, v0, Ld0/l;->b:Z

    iget v13, v0, Ld0/l;->f:I

    if-eqz v2, :cond_3

    invoke-virtual {v1}, LE0/c;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc0/E0;

    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    const/16 v25, 0x0

    goto :goto_2

    :cond_1
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v25

    if-eqz v25, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v25

    move-object/from16 v7, v25

    check-cast v7, Lc0/E0;

    if-ne v7, v1, :cond_2

    const/16 v25, 0x1

    goto :goto_2

    :cond_2
    const/4 v7, -0x1

    goto :goto_1

    :goto_2
    new-instance v7, Landroid/widget/LinearLayout;

    invoke-direct {v7, v12}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x0

    invoke-virtual {v7, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v2, 0x10

    invoke-virtual {v7, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/16 v8, 0xe

    invoke-static {v8, v14}, LU/S;->p0(IF)I

    move-result v2

    const/16 v8, 0xc

    move/from16 v27, v3

    invoke-static {v8, v14}, LU/S;->p0(IF)I

    move-result v3

    move-object/from16 v28, v4

    invoke-static {v8, v14}, LU/S;->p0(IF)I

    move-result v4

    move-object/from16 v29, v5

    invoke-static {v8, v14}, LU/S;->p0(IF)I

    move-result v5

    invoke-virtual {v7, v2, v3, v4, v5}, Landroid/view/View;->setPadding(IIII)V

    const/4 v2, 0x1

    invoke-virtual {v7, v2}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v7, v2}, Landroid/view/View;->setFocusable(Z)V

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, v12}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget-object v3, v1, Lc0/E0;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v3, 0x41a00000    # 20.0f

    const/4 v4, 0x2

    invoke-virtual {v2, v4, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    const/16 v3, 0x11

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setGravity(I)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v5, 0x20

    invoke-static {v5, v14}, LU/S;->p0(IF)I

    move-result v3

    invoke-static {v5, v14}, LU/S;->p0(IF)I

    move-result v5

    invoke-direct {v4, v3, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v7, v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v12}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x1

    invoke-virtual {v2, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-static {v8, v14}, LU/S;->p0(IF)I

    move-result v3

    const/16 v8, 0x8

    invoke-static {v8, v14}, LU/S;->p0(IF)I

    move-result v4

    const/4 v5, 0x0

    invoke-virtual {v2, v3, v5, v4, v5}, Landroid/view/View;->setPadding(IIII)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, v12}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget-object v4, v1, Lc0/E0;->b:Ljava/lang/String;

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v4, 0x41700000    # 15.0f

    const/4 v5, 0x2

    invoke-virtual {v3, v5, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    sget-object v4, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, v12}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget-object v8, v1, Lc0/E0;->c:Ljava/lang/String;

    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v8, 0x41300000    # 11.0f

    invoke-virtual {v3, v5, v8}, Landroid/widget/TextView;->setTextSize(IF)V

    invoke-static {v5, v14}, LU/S;->p0(IF)I

    move-result v8

    const/4 v5, 0x0

    invoke-virtual {v3, v5, v8, v5, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    move-object/from16 v18, v11

    const/4 v8, -0x2

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-direct {v3, v5, v8, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v7, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, v12}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v3, "check"

    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/16 v3, 0x11

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setGravity(I)V

    const/high16 v3, 0x41600000    # 14.0f

    const/4 v8, 0x2

    invoke-virtual {v2, v8, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v4, 0x1c

    invoke-static {v4, v14}, LU/S;->p0(IF)I

    move-result v5

    invoke-static {v4, v14}, LU/S;->p0(IF)I

    move-result v4

    invoke-direct {v3, v5, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v7, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget v5, v0, Ld0/l;->e:I

    const/16 v23, 0x10

    move v2, v13

    move/from16 v24, v27

    move v3, v10

    move-object/from16 v0, v28

    move v4, v5

    move/from16 v28, v5

    move-object/from16 v27, v29

    const/16 v17, 0x1

    const/16 v19, 0x0

    move/from16 v5, v24

    move/from16 v29, v6

    move v6, v14

    move-object/from16 v26, v0

    move-object/from16 v30, v7

    move/from16 v21, v23

    const/4 v0, -0x1

    move/from16 v23, v8

    const/4 v8, -0x2

    const/16 v16, 0xe

    move/from16 v8, v25

    invoke-static/range {v2 .. v8}, LU/S;->q0(IIIZFLandroid/widget/LinearLayout;Z)V

    new-instance v8, Ld0/i;

    move-object v5, v1

    move-object v1, v8

    move-object v2, v15

    move-object v3, v12

    move-object/from16 v4, v30

    move v6, v13

    move v7, v10

    move-object v13, v8

    move/from16 v8, v28

    move-object/from16 v31, v9

    move/from16 v9, v24

    move/from16 v19, v10

    move v10, v14

    move-object/from16 v32, v18

    move/from16 v18, v11

    move-object/from16 v11, v27

    invoke-direct/range {v1 .. v11}, Ld0/i;-><init>(Ljava/util/ArrayList;Landroid/app/Activity;Landroid/widget/LinearLayout;Lc0/E0;IIIZFLandroid/widget/TextView;)V

    move-object/from16 v1, v30

    invoke-virtual {v1, v13}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v9, -0x2

    invoke-direct {v2, v0, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v10, 0x8

    invoke-static {v10, v14}, LU/S;->p0(IF)I

    move-result v3

    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    move-object/from16 v3, v26

    invoke-virtual {v3, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    move v7, v0

    move-object v4, v3

    move/from16 v8, v16

    move/from16 v13, v18

    move/from16 v10, v19

    move-object/from16 v5, v27

    move/from16 v6, v29

    move-object/from16 v9, v31

    move-object/from16 v11, v32

    move-object/from16 v0, p0

    goto/16 :goto_0

    :cond_3
    move/from16 v24, v3

    move-object v3, v4

    move/from16 v29, v6

    move-object/from16 v32, v11

    const/16 v10, 0x8

    move-object v11, v9

    const/4 v9, -0x2

    invoke-virtual {v11, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, v12}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const v2, 0x800005

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    invoke-static {v10, v14}, LU/S;->p0(IF)I

    move-result v2

    invoke-virtual {v0, v1, v2, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    new-instance v8, Ld0/d;

    const/4 v1, 0x1

    move-object/from16 v7, v32

    invoke-direct {v8, v7, v1}, Ld0/d;-><init>(Landroid/app/Dialog;I)V

    const-string v6, "\u53d6\u6d88"

    const/16 v16, 0x0

    move-object v1, v12

    move/from16 v2, v29

    move v3, v14

    move v4, v13

    move/from16 v5, v24

    move-object/from16 v33, v7

    move/from16 v7, v16

    invoke-static/range {v1 .. v8}, LU/S;->o0(Landroid/app/Activity;IFIZLjava/lang/String;ZLP0/a;)Landroid/widget/TextView;

    move-result-object v1

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v2, v9, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v10, v14}, LU/S;->p0(IF)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v8, Ld0/e;

    move-object/from16 v1, v20

    move-object/from16 v10, v33

    invoke-direct {v8, v15, v12, v10, v1}, Ld0/e;-><init>(Ljava/util/ArrayList;Landroid/app/Activity;Landroid/app/Dialog;Ld0/c;)V

    const-string v6, "\u4fdd\u5b58"

    const/4 v7, 0x1

    move-object v1, v12

    move/from16 v2, v29

    move v3, v14

    invoke-static/range {v1 .. v8}, LU/S;->o0(Landroid/app/Activity;IFIZLjava/lang/String;ZLP0/a;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v11, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v10, v11}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    invoke-virtual {v10}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_4

    const v1, 0x106000d

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v1, v1

    const v2, 0x3f5c28f6    # 0.86f

    mul-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual {v0, v1, v9}, Landroid/view/Window;->setLayout(II)V

    const v1, 0x3ee66666    # 0.45f

    invoke-virtual {v0, v1}, Landroid/view/Window;->setDimAmount(F)V

    :cond_4
    invoke-virtual {v10}, Landroid/app/Dialog;->show()V

    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0
.end method
