.class public final LQC;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LWk;


# instance fields
.field public a:Landroid/widget/LinearLayout;

.field public b:LWz;

.field public c:Landroid/widget/FrameLayout;

.field public d:Landroid/widget/LinearLayout;

.field public e:Landroid/widget/EditText;

.field public f:Landroidx/recyclerview/widget/RecyclerView;

.field public g:Lca;

.field public h:Landroid/widget/LinearLayout;

.field public i:J

.field public j:Z

.field public k:LDC;

.field public final l:Ljava/util/LinkedHashMap;

.field public m:Ljava/util/List;

.field public n:Ljava/util/List;

.field public o:LLC;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LDC;->b:LDC;

    iput-object v0, p0, LQC;->k:LDC;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LQC;->l:Ljava/util/LinkedHashMap;

    sget-object v0, LKf;->a:LKf;

    iput-object v0, p0, LQC;->m:Ljava/util/List;

    iput-object v0, p0, LQC;->n:Ljava/util/List;

    sget-object v0, LLC;->c:LLC;

    iput-object v0, p0, LQC;->o:LLC;

    return-void
.end method

.method public static final a(LQC;)V
    .locals 6

    iget-object v0, p0, LQC;->m:Ljava/util/List;

    const-string v1, "Count overflow has happened."

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v3, v2

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LEC;

    iget-object v4, v4, LEC;->s:LCC;

    sget-object v5, LCC;->b:LCC;

    if-eq v4, v5, :cond_2

    sget-object v5, LCC;->d:LCC;

    if-eq v4, v5, :cond_2

    sget-object v5, LCC;->e:LCC;

    if-ne v4, v5, :cond_1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    if-ltz v3, :cond_3

    goto :goto_0

    :cond_3
    new-instance p0, Ljava/lang/ArithmeticException;

    invoke-direct {p0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    :goto_1
    iget-object p0, p0, LQC;->m:Ljava/util/List;

    if-eqz p0, :cond_5

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_6
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEC;

    iget-object v0, v0, LEC;->s:LCC;

    sget-object v3, LCC;->e:LCC;

    if-ne v0, v3, :cond_6

    add-int/lit8 v2, v2, 0x1

    if-ltz v2, :cond_7

    goto :goto_2

    :cond_7
    new-instance p0, Ljava/lang/ArithmeticException;

    invoke-direct {p0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    :goto_3
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    const-wide v0, -0x1a662fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, LIC;->a:LIC;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v0, -0x2d9fdfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, LIC;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final c(Landroid/app/Activity;IILandroid/content/Intent;)V
    .locals 0

    const-wide p1, -0x1a66bfffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method public final d(Landroid/app/Activity;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-wide v2, -0x1b8fbfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    sget-object v2, LIC;->a:LIC;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v2, -0x2d9f4fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    sget-object v2, LIC;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    new-instance v2, Landroid/widget/FrameLayout;

    invoke-direct {v2, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x1

    invoke-direct {v3, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v3, 0x55060040

    invoke-virtual {v1, v3}, Landroid/content/Context;->getColor(I)I

    move-result v5

    invoke-virtual {v2, v5}, Landroid/view/View;->setBackgroundColor(I)V

    iput-object v2, v0, LQC;->c:Landroid/widget/FrameLayout;

    new-instance v2, LWz;

    invoke-direct {v2, v1}, LWz;-><init>(Landroid/app/Activity;)V

    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v5, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v6, 0x50

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    iput v8, v5, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v2, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v5, 0x55060049

    invoke-virtual {v1, v5}, Landroid/content/Context;->getColor(I)I

    move-result v5

    const v8, 0x5506004b

    invoke-virtual {v1, v8}, Landroid/content/Context;->getColor(I)I

    move-result v8

    const v9, 0x55060047

    invoke-virtual {v1, v9}, Landroid/content/Context;->getColor(I)I

    move-result v9

    filled-new-array {v5, v8, v9}, [I

    move-result-object v5

    invoke-virtual {v2, v5}, LWz;->setColorSchemeColors([I)V

    new-instance v5, Lrl;

    invoke-direct {v5, v0, v1}, Lrl;-><init>(LQC;Landroid/app/Activity;)V

    invoke-virtual {v2, v5}, LWz;->setOnRefreshListener(LUz;)V

    iput-object v2, v0, LQC;->b:LWz;

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v2, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {v1, v3}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v3, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v3, 0xc

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    const/4 v11, 0x0

    invoke-virtual {v2, v11, v9, v11, v10}, Landroid/view/View;->setPadding(IIII)V

    iput-object v2, v0, LQC;->a:Landroid/widget/LinearLayout;

    iget-object v9, v0, LQC;->b:LWz;

    invoke-virtual {v9, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v2, v0, LQC;->c:Landroid/widget/FrameLayout;

    iget-object v9, v0, LQC;->b:LWz;

    invoke-virtual {v2, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/16 v2, 0x1e

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v9, Landroid/widget/LinearLayout;

    invoke-direct {v9, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v9, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v12, -0x2

    invoke-direct {v10, v4, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v13, 0x10

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    const/16 v4, 0x8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    invoke-static/range {v16 .. v16}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-virtual {v10, v15, v11, v6, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v9, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v6, 0x55060035

    invoke-virtual {v1, v6}, Landroid/content/Context;->getColor(I)I

    move-result v10

    invoke-virtual {v4, v10}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/16 v10, 0x18

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v10}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    int-to-float v15, v15

    invoke-virtual {v4, v15}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    const v6, 0x55060039

    invoke-virtual {v1, v6}, Landroid/content/Context;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v15, v5}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    invoke-virtual {v9, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-virtual {v9, v4, v5, v15, v6}, Landroid/view/View;->setPadding(IIII)V

    invoke-virtual {v9, v13}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v4, Landroid/widget/ImageView;

    invoke-direct {v4, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v6, 0x14

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-direct {v5, v15, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-virtual {v5, v13}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v5, 0x55080109

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    const v13, 0x550603f5

    invoke-virtual {v1, v13}, Landroid/content/Context;->getColor(I)I

    move-result v15

    invoke-virtual {v4, v15}, Landroid/widget/ImageView;->setColorFilter(I)V

    invoke-virtual {v9, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/EditText;

    invoke-direct {v4, v1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    new-instance v15, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-direct {v15, v11, v12, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v4, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const-wide v19, -0x1b884fffff835L

    invoke-static/range {v19 .. v20}, LGu;->r(J)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v4, v15}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    invoke-virtual {v1, v13}, Landroid/content/Context;->getColor(I)I

    move-result v15

    invoke-virtual {v4, v15}, Landroid/widget/TextView;->setHintTextColor(I)V

    const v15, 0x550603f9

    invoke-virtual {v1, v15}, Landroid/content/Context;->getColor(I)I

    move-result v15

    invoke-virtual {v4, v15}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v15, 0x41800000    # 16.0f

    invoke-virtual {v4, v15}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 v15, 0x0

    invoke-virtual {v4, v15}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 v15, 0x1

    invoke-virtual {v4, v15}, Landroid/widget/TextView;->setSingleLine(Z)V

    const/4 v15, 0x3

    invoke-virtual {v4, v15}, Landroid/widget/TextView;->setImeOptions(I)V

    new-instance v15, Le5;

    const/4 v5, 0x5

    invoke-direct {v15, v5, v0}, Le5;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v4, v15}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iput-object v4, v0, LQC;->e:Landroid/widget/EditText;

    invoke-virtual {v9, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/ImageView;

    invoke-direct {v4, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-direct {v5, v15, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v5, 0x550800e6    # 9.34609E12f

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v1, v13}, Landroid/content/Context;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setColorFilter(I)V

    const/16 v5, 0x8

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    new-instance v5, Ll5;

    const/16 v6, 0x15

    invoke-direct {v5, v6, v0, v4}, Ll5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v9, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v5, v0, LQC;->e:Landroid/widget/EditText;

    if-eqz v5, :cond_1

    new-instance v6, Lea;

    const/4 v15, 0x2

    invoke-direct {v6, v4, v15}, Lea;-><init>(Landroid/widget/ImageView;I)V

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    :cond_1
    new-instance v4, Landroid/widget/LinearLayout;

    invoke-direct {v4, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v4, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v5, v11, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v6, 0x3f800000    # 1.0f

    iput v6, v5, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v4, v9, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v5, Landroid/widget/ImageView;

    invoke-direct {v5, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    invoke-direct {v6, v9, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    invoke-virtual {v6, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    invoke-virtual {v6, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    const/16 v2, 0x10

    iput v2, v6, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v2, 0x550800eb

    invoke-virtual {v5, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v1, v13}, Landroid/content/Context;->getColor(I)I

    move-result v2

    invoke-virtual {v5, v2}, Landroid/widget/ImageView;->setColorFilter(I)V

    new-instance v2, Ll5;

    const/16 v3, 0x16

    invoke-direct {v2, v3, v0, v1}, Ll5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v2, v0, LQC;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x1

    invoke-direct {v3, v4, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    invoke-static/range {v16 .. v16}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-virtual {v3, v4, v11, v5, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/high16 v3, 0x41400000    # 12.0f

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v1, v13}, Landroid/content/Context;->getColor(I)I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v4, 0x11

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setGravity(I)V

    const/16 v5, 0x8

    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    iget-object v5, v0, LQC;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v5, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v15, 0x1

    invoke-virtual {v2, v15}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, -0x1

    invoke-direct {v5, v6, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/16 v5, 0x20

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v5}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-static {v5}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    invoke-virtual {v2, v6, v11, v5, v11}, Landroid/view/View;->setPadding(IIII)V

    const/16 v5, 0x8

    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    new-instance v5, Landroid/widget/ImageView;

    invoke-direct {v5, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-direct {v6, v9, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    iput v7, v6, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v6, 0x55080109

    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v1, v13}, Landroid/content/Context;->getColor(I)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setColorFilter(I)V

    const/high16 v6, 0x3f000000    # 0.5f

    invoke-virtual {v5, v6}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v6, -0x1a779fffff835L

    const/high16 v9, 0x41800000    # 16.0f

    invoke-static {v6, v7, v5, v9}, LEy;->l(JLandroid/widget/TextView;F)V

    invoke-virtual {v1, v13}, Landroid/content/Context;->getColor(I)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setGravity(I)V

    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput-object v2, v0, LQC;->h:Landroid/widget/LinearLayout;

    iget-object v5, v0, LQC;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v5, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, -0x1

    invoke-direct {v5, v6, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v5, 0x2

    invoke-virtual {v2, v5}, Landroid/view/View;->setOverScrollMode(I)V

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-virtual {v2, v5, v11, v6, v11}, Landroid/view/View;->setPadding(IIII)V

    new-instance v5, Lda;

    const/4 v6, 0x3

    invoke-direct {v5, v6}, Lda;-><init>(I)V

    invoke-virtual {v2, v5}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Lmv;)V

    iput-object v2, v0, LQC;->f:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, Lca;

    invoke-direct {v2, v0}, Lca;-><init>(LQC;)V

    iput-object v2, v0, LQC;->g:Lca;

    iget-object v5, v0, LQC;->f:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v5, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/g;)V

    iget-object v2, v0, LQC;->a:Landroid/widget/LinearLayout;

    iget-object v5, v0, LQC;->f:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v0}, LQC;->i()V

    iget-object v2, v0, LQC;->c:Landroid/widget/FrameLayout;

    const/4 v5, 0x6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    new-instance v6, Landroid/widget/LinearLayout;

    invoke-direct {v6, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v6, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v9, 0x48

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    const/4 v14, -0x1

    invoke-direct {v7, v14, v13}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v13, 0x50

    iput v13, v7, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v7, 0x55060035

    invoke-virtual {v1, v7}, Landroid/content/Context;->getColor(I)I

    move-result v7

    invoke-virtual {v6, v7}, Landroid/view/View;->setBackgroundColor(I)V

    const/16 v7, 0x10

    invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setGravity(I)V

    invoke-static/range {v16 .. v16}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-static/range {v16 .. v16}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-static/range {v16 .. v16}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-static/range {v16 .. v16}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-virtual {v6, v7, v13, v14, v15}, Landroid/view/View;->setPadding(IIII)V

    invoke-static/range {v16 .. v16}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    int-to-float v7, v7

    invoke-virtual {v6, v7}, Landroid/view/View;->setElevation(F)V

    iput-object v6, v0, LQC;->d:Landroid/widget/LinearLayout;

    new-instance v6, Landroid/view/View;

    invoke-direct {v6, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    const/4 v14, -0x1

    invoke-direct {v7, v14, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v13, 0x50

    iput v13, v7, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    iput v8, v7, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v7, 0x55060039

    invoke-virtual {v1, v7}, Landroid/content/Context;->getColor(I)I

    move-result v7

    invoke-virtual {v6, v7}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-static {}, LDC;->values()[LDC;

    move-result-object v6

    array-length v7, v6

    move v8, v11

    :goto_0
    if-ge v8, v7, :cond_4

    aget-object v9, v6, v8

    new-instance v13, Landroid/widget/LinearLayout;

    invoke-direct {v13, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v15, 0x1

    invoke-virtual {v13, v15}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {v13, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v12, 0x3f800000    # 1.0f

    const/4 v15, -0x1

    invoke-direct {v14, v11, v15, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v13, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static/range {v16 .. v16}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-static {v5}, LGu;->i(Ljava/lang/Number;)I

    move-result v11

    invoke-static/range {v16 .. v16}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-static {v5}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-virtual {v13, v14, v11, v12, v15}, Landroid/view/View;->setPadding(IIII)V

    new-instance v11, Landroid/widget/ImageView;

    invoke-direct {v11, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {v10}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-static {v10}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-direct {v12, v14, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v15, 0x1

    iput v15, v12, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    invoke-virtual {v11, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    if-eqz v12, :cond_3

    if-ne v12, v15, :cond_2

    const v12, 0x5508010d

    goto :goto_1

    :cond_2
    new-instance v1, LFa;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    :cond_3
    const v12, 0x550800fd

    :goto_1
    invoke-virtual {v11, v12}, Landroid/widget/ImageView;->setImageResource(I)V

    sget-object v12, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v11, v12}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    invoke-virtual {v13, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v11, Landroid/widget/TextView;

    invoke-direct {v11, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget-object v12, v9, LDC;->a:Ljava/lang/String;

    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v11, v3}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v11, v4}, Landroid/widget/TextView;->setGravity(I)V

    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v14, -0x2

    invoke-direct {v12, v14, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v15, 0x4

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    iput v15, v12, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    invoke-virtual {v11, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v15, 0x1

    invoke-virtual {v11, v15}, Landroid/widget/TextView;->setMaxLines(I)V

    invoke-virtual {v13, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v11, Ll5;

    const/16 v12, 0x17

    invoke-direct {v11, v12, v0, v9}, Ll5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v13, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v13, v15}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    const-wide v17, -0x1b8bcfffff835L

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    check-cast v11, Landroid/widget/TextView;

    iget-object v12, v0, LQC;->l:Ljava/util/LinkedHashMap;

    invoke-interface {v12, v9, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v9, v0, LQC;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v9, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    add-int/lit8 v8, v8, 0x1

    move v12, v14

    const/4 v11, 0x0

    goto/16 :goto_0

    :cond_4
    iget-object v3, v0, LQC;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v0}, LQC;->j()V

    invoke-virtual/range {p0 .. p1}, LQC;->g(Landroid/app/Activity;)V

    return-void
.end method

.method public final e(Ljava/lang/String;)V
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v2, LIC;->a:LIC;

    iget-object v3, v0, LQC;->k:LDC;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v4, -0x2dac2fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const/16 v3, 0x8

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-ne v2, v5, :cond_2

    sget-object v2, LIC;->b:Ljava/util/List;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, LEC;

    iget-object v8, v8, LEC;->s:LCC;

    sget-object v9, LCC;->a:LCC;

    if-ne v8, v9, :cond_0

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v2, LWb;

    invoke-direct {v2, v3}, LWb;-><init>(I)V

    invoke-static {v6, v2}, Lra;->n0(Ljava/util/List;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v2

    goto/16 :goto_7

    :cond_2
    new-instance v1, LFa;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    :cond_3
    sget-object v2, LIC;->b:Ljava/util/List;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, LEC;

    iget-object v9, v8, LEC;->b:Ljava/lang/String;

    iget-object v10, v8, LEC;->s:LCC;

    const-wide v11, -0x2dac6fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    invoke-static {v9, v11}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_6

    iget-object v8, v8, LEC;->a:Ljava/lang/String;

    const-wide v11, -0x2dac8fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    invoke-static {v8, v11}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    goto :goto_2

    :cond_5
    move v8, v4

    goto :goto_3

    :cond_6
    :goto_2
    move v8, v5

    :goto_3
    sget-object v11, LCC;->b:LCC;

    if-eq v10, v11, :cond_7

    sget-object v11, LCC;->c:LCC;

    if-eq v10, v11, :cond_7

    sget-object v11, LCC;->d:LCC;

    if-eq v10, v11, :cond_7

    sget-object v11, LCC;->e:LCC;

    if-ne v10, v11, :cond_8

    :cond_7
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v11

    if-lez v11, :cond_8

    const-wide v11, -0x2dacafffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_8

    move v9, v5

    goto :goto_4

    :cond_8
    move v9, v4

    :goto_4
    if-nez v8, :cond_a

    if-eqz v9, :cond_9

    goto :goto_5

    :cond_9
    move v8, v4

    goto :goto_6

    :cond_a
    :goto_5
    move v8, v5

    :goto_6
    const-wide v11, -0x2daccfffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    const-wide v11, -0x2dae0fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    const-wide v11, -0x2dae9fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    const-wide v11, -0x2daeffffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    const-wide v11, -0x2dafafffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v10}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    const-wide v9, -0x2da84fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    const-wide v9, -0x2da94fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    const-wide v9, -0x2daa3fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    if-eqz v8, :cond_4

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_b
    new-instance v2, LWb;

    const/16 v7, 0x9

    invoke-direct {v2, v7}, LWb;-><init>(I)V

    invoke-static {v6, v2}, Lra;->n0(Ljava/util/List;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v2

    new-instance v6, LEC;

    const-wide v7, -0x2d965fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    const-wide v8, -0x2d973fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    const-wide v9, -0x2d901fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    const-wide v10, -0x2d906fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    const-wide v11, -0x2d912fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    const-wide v12, -0x2d923fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    const-wide v13, -0x2d924fffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v13

    const-wide v14, -0x2d925fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v15

    const-wide v16, -0x2d929fffff835L

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    move-result-object v21

    const-wide v16, -0x2d92afffff835L

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    move-result-object v22

    const-wide v16, -0x2d92bfffff835L

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    move-result-object v23

    const-wide v16, -0x2d92cfffff835L

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    move-result-object v24

    const-wide v16, -0x2d92dfffff835L

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    move-result-object v25

    sget-object v26, LCC;->a:LCC;

    const v29, 0x201000

    const/16 v30, 0x0

    sget-object v14, LKf;->a:LKf;

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v16, v14

    invoke-direct/range {v6 .. v30}, LEC;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;DZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LCC;ZIII)V

    invoke-static {v6}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    new-instance v7, Ljava/util/ArrayList;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v8

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v9

    add-int/2addr v9, v8

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move-object v2, v7

    :goto_7
    const-wide v6, -0x2dab4fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    const-wide v6, -0x2d948fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    const-wide v6, -0x2d958fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/List;->size()I

    const-wide v6, -0x2d960fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    sget-object v6, LIC;->a:LIC;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v6, -0x2d92efffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    const-wide v6, -0x2d934fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v1}, Ltz;->T(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_c

    move-object v6, v2

    goto/16 :goto_a

    :cond_c
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_d
    :goto_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_10

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, LEC;

    iget-object v10, v9, LEC;->a:Ljava/lang/String;

    const-wide v11, -0x2d93bfffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_e

    const-wide v9, -0x2d9c9fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    invoke-static {v1, v9, v5}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_f

    const-wide v9, -0x2d9ccfffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    invoke-static {v1, v9, v5}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_f

    const-wide v9, -0x2d9cffffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    invoke-static {v1, v9, v5}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_f

    const-wide v9, -0x2d9d1fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    invoke-static {v1, v9, v5}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-eqz v9, :cond_d

    goto :goto_9

    :cond_e
    iget-object v10, v9, LEC;->c:Ljava/lang/String;

    invoke-static {v10, v1, v5}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-nez v10, :cond_f

    iget-object v10, v9, LEC;->d:Ljava/lang/String;

    invoke-static {v10, v1, v5}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-nez v10, :cond_f

    iget-object v9, v9, LEC;->e:Ljava/lang/String;

    invoke-static {v9, v1, v5}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-eqz v9, :cond_d

    :cond_f
    :goto_9
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_10
    :goto_a
    iget-object v1, v0, LQC;->o:LLC;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_14

    const/16 v7, 0xc

    if-eq v1, v5, :cond_13

    const/4 v8, 0x3

    const/16 v9, 0xd

    if-eq v1, v8, :cond_12

    const/4 v7, 0x4

    if-eq v1, v7, :cond_11

    goto :goto_b

    :cond_11
    new-instance v1, LWb;

    invoke-direct {v1, v9}, LWb;-><init>(I)V

    invoke-static {v6, v1}, Lra;->n0(Ljava/util/List;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v6

    goto :goto_b

    :cond_12
    new-instance v1, LMx;

    invoke-direct {v1, v7}, LMx;-><init>(I)V

    new-instance v7, LMx;

    invoke-direct {v7, v9}, LMx;-><init>(I)V

    const/4 v8, 0x2

    new-array v8, v8, [Lfj;

    aput-object v1, v8, v4

    aput-object v7, v8, v5

    new-instance v1, LBa;

    invoke-direct {v1, v4, v8}, LBa;-><init>(ILjava/lang/Object;)V

    invoke-static {v6, v1}, Lra;->n0(Ljava/util/List;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v6

    goto :goto_b

    :cond_13
    new-instance v1, LWb;

    invoke-direct {v1, v7}, LWb;-><init>(I)V

    invoke-static {v6, v1}, Lra;->n0(Ljava/util/List;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v6

    goto :goto_b

    :cond_14
    new-instance v1, LWb;

    const/16 v7, 0xb

    invoke-direct {v1, v7}, LWb;-><init>(I)V

    invoke-static {v6, v1}, Lra;->n0(Ljava/util/List;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v6

    :goto_b
    iget-object v1, v0, LQC;->k:LDC;

    sget-object v7, LDC;->b:LDC;

    if-ne v1, v7, :cond_1b

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v6, LMx;

    const/16 v7, 0xe

    invoke-direct {v6, v7}, LMx;-><init>(I)V

    invoke-static {v1, v6}, Lxa;->e0(Ljava/util/ArrayList;Lfj;)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_15
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v8, 0x0

    if-eqz v7, :cond_16

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v9, v7

    check-cast v9, LEC;

    iget-object v9, v9, LEC;->a:Ljava/lang/String;

    const-wide v10, -0x1a640fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_15

    goto :goto_c

    :cond_16
    move-object v7, v8

    :goto_c
    check-cast v7, LEC;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_17
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_18

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, LEC;

    iget-object v9, v9, LEC;->a:Ljava/lang/String;

    const-wide v10, -0x1a64efffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_17

    move-object v8, v6

    :cond_18
    check-cast v8, LEC;

    if-eqz v7, :cond_19

    invoke-virtual {v1, v4, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    if-eqz v8, :cond_1a

    iget-object v2, v8, LEC;->a:Ljava/lang/String;

    iget-object v6, v7, LEC;->a:Ljava/lang/String;

    invoke-static {v2, v6}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1a

    invoke-virtual {v1, v5, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_d

    :cond_19
    if-eqz v8, :cond_1a

    invoke-virtual {v1, v4, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :cond_1a
    :goto_d
    move-object v6, v1

    :cond_1b
    iput-object v6, v0, LQC;->n:Ljava/util/List;

    iget-object v1, v0, LQC;->g:Lca;

    if-eqz v1, :cond_1e

    const-wide v7, -0x1bb25fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    iget-object v2, v1, Lca;->d:Ljava/util/List;

    iput-object v6, v1, Lca;->d:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1d

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1d

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v5

    sub-int/2addr v2, v5

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    const/16 v5, 0xa

    if-le v2, v5, :cond_1c

    goto :goto_e

    :cond_1c
    invoke-virtual {v1}, Landroidx/recyclerview/widget/g;->notifyDataSetChanged()V

    goto :goto_f

    :cond_1d
    :goto_e
    invoke-virtual {v1}, Landroidx/recyclerview/widget/g;->notifyDataSetChanged()V

    :cond_1e
    :goto_f
    iget-object v1, v0, LQC;->n:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    iget-object v2, v0, LQC;->h:Landroid/widget/LinearLayout;

    if-eqz v2, :cond_20

    if-eqz v1, :cond_1f

    move v5, v4

    goto :goto_10

    :cond_1f
    move v5, v3

    :goto_10
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_20
    iget-object v2, v0, LQC;->f:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v2, :cond_22

    if-eqz v1, :cond_21

    goto :goto_11

    :cond_21
    move v3, v4

    :goto_11
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_22
    return-void
.end method

.method public final f()Landroid/app/Activity;
    .locals 3

    iget-object v0, p0, LQC;->a:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-wide v1, -0x1a786fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/app/Activity;

    return-object v0
.end method

.method public final g(Landroid/app/Activity;)V
    .locals 4

    const-wide v0, -0x1a7fdfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lhe;->a:Lhd;

    sget-object v0, LZp;->a:Lnk;

    invoke-static {v0}, LPj;->a(Lac;)LCb;

    move-result-object v0

    new-instance v1, Lfk;

    const/4 v2, 0x0

    const/4 v3, 0x4

    invoke-direct {v1, p0, p1, v2, v3}, Lfk;-><init>(LQC;Ljava/lang/Object;LEb;I)V

    const/4 p1, 0x3

    invoke-static {v0, v1, p1}, LNj;->G(Lfc;Lkotlin/jvm/functions/Function2;I)V

    return-void
.end method

.method public final getContentView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, LQC;->c:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 2

    const-wide v0, -0x1a674fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final h()V
    .locals 6

    invoke-virtual {p0}, LQC;->f()Landroid/app/Activity;

    move-result-object v0

    const-wide v1, -0x1a615fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x1a61afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x1a6e7fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, LXm;

    const/16 v5, 0x12

    invoke-direct {v4, v5, p0}, LXm;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, v1, v2, v3, v4}, Lgf;->P(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LNd;)V

    return-void
.end method

.method public final i()V
    .locals 3

    iget-object v0, p0, LQC;->k:LDC;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager;

    iget-object v1, p0, LQC;->f:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    invoke-direct {v0}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v0, LFa;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v2, p0, LQC;->f:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    :goto_0
    iget-object v1, p0, LQC;->f:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/i;)V

    return-void
.end method

.method public final j()V
    .locals 9

    iget-object v0, p0, LQC;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LDC;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iget-object v3, p0, LQC;->k:LDC;

    const/4 v4, 0x0

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    move v2, v4

    :goto_1
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    const-wide v5, -0x1a77efffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    check-cast v3, Landroid/widget/LinearLayout;

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    const-wide v5, -0x1a73ffffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    check-cast v4, Landroid/widget/ImageView;

    invoke-virtual {v3}, Landroid/view/View;->clearAnimation()V

    invoke-virtual {v3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/ViewPropertyAnimator;->cancel()V

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const v6, 0x550603f5

    const v7, 0x55060049

    if-eqz v2, :cond_1

    move v8, v7

    goto :goto_2

    :cond_1
    move v8, v6

    :goto_2
    invoke-virtual {v5, v8}, Landroid/content/Context;->getColor(I)I

    move-result v5

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v2, :cond_2

    move v6, v7

    :cond_2
    invoke-virtual {v1, v6}, Landroid/content/Context;->getColor(I)I

    move-result v1

    invoke-virtual {v4, v1}, Landroid/widget/ImageView;->setColorFilter(I)V

    const/4 v1, 0x0

    invoke-virtual {v3, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    if-eqz v2, :cond_3

    const v1, 0x3f866666    # 1.05f

    goto :goto_3

    :cond_3
    const/high16 v1, 0x3f800000    # 1.0f

    :goto_3
    invoke-virtual {v3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const-wide/16 v4, 0x96

    invoke-virtual {v2, v4, v5}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    new-instance v4, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v4}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v2, v4}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    new-instance v4, LJC;

    invoke-direct {v4, v3, v1}, LJC;-><init>(Landroid/widget/LinearLayout;F)V

    invoke-virtual {v2, v4}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->start()V

    goto/16 :goto_0

    :cond_4
    return-void
.end method
