.class public final synthetic Ld0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Landroid/app/Activity;

.field public final synthetic b:Landroid/widget/TextView;

.field public final synthetic c:Z

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Landroid/widget/TextView;ZIIIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/j;->a:Landroid/app/Activity;

    iput-object p2, p0, Ld0/j;->b:Landroid/widget/TextView;

    iput-boolean p3, p0, Ld0/j;->c:Z

    iput p4, p0, Ld0/j;->d:I

    iput p5, p0, Ld0/j;->e:I

    iput p6, p0, Ld0/j;->f:I

    iput p7, p0, Ld0/j;->g:I

    iput p8, p0, Ld0/j;->h:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 20

    move-object/from16 v1, p0

    const/4 v2, 0x0

    iget-object v11, v1, Ld0/j;->a:Landroid/app/Activity;

    const-string v0, "$activity"

    invoke-static {v11, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v12, v1, Ld0/j;->b:Landroid/widget/TextView;

    const-string v0, "$this_apply"

    invoke-static {v12, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v11}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v13, v0, Landroid/util/DisplayMetrics;->density:F

    new-instance v14, Landroid/widget/EditText;

    invoke-direct {v14, v11}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    const-string v3, "OKK \u5feb\u6377\u9762\u677f"

    :try_start_0
    sget-object v0, Lc0/h1;->a:Lc0/h1;

    const-string v0, "home_drawer_signature"

    invoke-static {v0, v3}, Lc0/h1;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_0
    instance-of v4, v0, LD0/f;

    if-eqz v4, :cond_0

    move-object v0, v3

    :cond_0
    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    move-object v3, v0

    :goto_1
    check-cast v3, Ljava/lang/String;

    invoke-virtual {v14, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v14, v2}, Landroid/widget/TextView;->setSelectAllOnFocus(Z)V

    const/4 v0, 0x1

    invoke-virtual {v14, v0}, Landroid/widget/TextView;->setSingleLine(Z)V

    invoke-virtual {v14, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    iget v15, v1, Ld0/j;->d:I

    invoke-virtual {v14, v15}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v3, 0x41700000    # 15.0f

    const/4 v4, 0x2

    invoke-virtual {v14, v4, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v3, v2}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    const/16 v5, 0xa

    invoke-static {v5, v13}, LU/S;->s0(IF)I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v3, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    iget v5, v1, Ld0/j;->f:I

    invoke-virtual {v3, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v0, v13}, LU/S;->s0(IF)I

    move-result v5

    iget-boolean v10, v1, Ld0/j;->c:Z

    if-eqz v10, :cond_2

    const-string v6, "#22FFFFFF"

    :goto_2
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    goto :goto_3

    :cond_2
    const-string v6, "#18000000"

    goto :goto_2

    :goto_3
    invoke-virtual {v3, v5, v6}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    invoke-virtual {v14, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/16 v3, 0xc

    invoke-static {v3, v13}, LU/S;->s0(IF)I

    move-result v5

    invoke-static {v3, v13}, LU/S;->s0(IF)I

    move-result v3

    invoke-virtual {v14, v5, v2, v3, v2}, Landroid/view/View;->setPadding(IIII)V

    new-instance v9, Landroid/widget/LinearLayout;

    invoke-direct {v9, v11}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v9, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v3, 0x14

    invoke-static {v3, v13}, LU/S;->s0(IF)I

    move-result v5

    const/16 v6, 0x12

    invoke-static {v6, v13}, LU/S;->s0(IF)I

    move-result v7

    invoke-static {v3, v13}, LU/S;->s0(IF)I

    move-result v3

    const/16 v8, 0x10

    invoke-static {v8, v13}, LU/S;->s0(IF)I

    move-result v8

    invoke-virtual {v9, v5, v7, v3, v8}, Landroid/view/View;->setPadding(IIII)V

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v3, v2}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    invoke-static {v6, v13}, LU/S;->s0(IF)I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v3, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    iget v5, v1, Ld0/j;->h:I

    invoke-virtual {v3, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v9, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, v11}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v5, "\u4fa7\u680f\u7b7e\u540d"

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v3, v15}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v5, 0x41900000    # 18.0f

    invoke-virtual {v3, v4, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    sget-object v5, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    invoke-virtual {v9, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, v11}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v5, "\u663e\u793a\u5728\u6635\u79f0\u4e0b\u65b9\uff0c\u70b9\u51fb\u4fa7\u8fb9\u680f\u7b7e\u540d\u53ef\u968f\u65f6\u4fee\u6539"

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget v5, v1, Ld0/j;->e:I

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v5, 0x41400000    # 12.0f

    invoke-virtual {v3, v4, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    const/4 v4, 0x5

    invoke-static {v4, v13}, LU/S;->s0(IF)I

    move-result v4

    const/16 v5, 0xe

    invoke-static {v5, v13}, LU/S;->s0(IF)I

    move-result v6

    invoke-virtual {v3, v2, v4, v2, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v9, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v4, 0x30

    invoke-static {v4, v13}, LU/S;->s0(IF)I

    move-result v4

    const/4 v6, -0x1

    invoke-direct {v3, v6, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v9, v14, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v8, Landroid/app/Dialog;

    invoke-direct {v8, v11}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    invoke-virtual {v8, v0}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    invoke-virtual {v8, v9}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    invoke-virtual {v8, v0}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, v11}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const v3, 0x800005

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    invoke-static {v5, v13}, LU/S;->s0(IF)I

    move-result v3

    invoke-virtual {v0, v2, v3, v2, v2}, Landroid/view/View;->setPadding(IIII)V

    new-instance v7, Ld0/d;

    invoke-direct {v7, v8, v2}, Ld0/d;-><init>(Landroid/app/Dialog;I)V

    iget v2, v1, Ld0/j;->g:I

    const-string v16, "\u53d6\u6d88"

    const/16 v17, 0x0

    move-object v3, v11

    move v4, v15

    move v5, v13

    move v6, v2

    move-object/from16 v18, v7

    move v7, v10

    move-object v1, v8

    move-object/from16 v8, v16

    move-object/from16 v19, v9

    move/from16 v9, v17

    move/from16 v16, v10

    move-object/from16 v10, v18

    invoke-static/range {v3 .. v10}, LU/S;->r0(Landroid/app/Activity;IFIZLjava/lang/String;ZLP0/a;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v10, Ld0/e;

    invoke-direct {v10, v14, v12, v11, v1}, Ld0/e;-><init>(Landroid/widget/EditText;Landroid/widget/TextView;Landroid/app/Activity;Landroid/app/Dialog;)V

    const-string v8, "\u4fdd\u5b58"

    const/4 v9, 0x1

    move-object v3, v11

    move/from16 v7, v16

    invoke-static/range {v3 .. v10}, LU/S;->r0(Landroid/app/Activity;IFIZLjava/lang/String;ZLP0/a;)Landroid/widget/TextView;

    move-result-object v2

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x2

    invoke-direct {v3, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v5, 0x8

    invoke-static {v5, v13}, LU/S;->s0(IF)I

    move-result v5

    invoke-virtual {v3, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v0, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    move-object/from16 v2, v19

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_3

    const v1, 0x106000d

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    invoke-virtual {v11}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v1, v1

    const v2, 0x3f51eb85    # 0.82f

    mul-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual {v0, v1, v4}, Landroid/view/Window;->setLayout(II)V

    const v1, 0x3ee66666    # 0.45f

    invoke-virtual {v0, v1}, Landroid/view/Window;->setDimAmount(F)V

    :cond_3
    return-void
.end method
