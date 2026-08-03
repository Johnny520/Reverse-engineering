.class public final synthetic Ly7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/view/ViewGroup;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;I)V
    .locals 0

    iput p2, p0, Ly7;->a:I

    iput-object p1, p0, Ly7;->b:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 23

    move-object/from16 v0, p0

    iget v1, v0, Ly7;->a:I

    const-class v2, Ljava/lang/Object;

    const/4 v3, 0x0

    const v4, 0x550a022b

    const/4 v5, -0x1

    const/4 v6, 0x0

    iget-object v7, v0, Ly7;->b:Landroid/view/ViewGroup;

    packed-switch v1, :pswitch_data_0

    sget v1, LTB;->i:I

    invoke-virtual {v7, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    const-wide v2, -0x1da7ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/ViewGroup;

    invoke-static {v7}, Lgf;->q(Landroid/view/ViewGroup;)V

    const-wide v2, -0x1dde7fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    sget-object v3, LXA;->a:Ljava/util/HashMap;

    const-wide v3, -0x1ddeffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const-string v7, "status_bar_height"

    invoke-static {v4, v7}, Ln5;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    sget v7, Lgf;->o:I

    add-int/2addr v4, v7

    invoke-direct {v3, v5, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v2, v6, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    invoke-static {v1}, Lgf;->u(Landroid/view/ViewGroup;)V

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-wide v3, -0x1da3bfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    sget-object v3, LXA;->a:Ljava/util/HashMap;

    const-wide v3, -0x1dacbfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-static {v2, v3}, Lgf;->t(Landroid/content/Context;Landroid/graphics/drawable/Drawable;)Landroid/widget/ImageView;

    move-result-object v2

    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v3, v5, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v2, v6, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void

    :pswitch_0
    sget-object v1, Lch;->b:Lch;

    invoke-virtual {v1, v7}, Lch;->f(Landroid/view/ViewGroup;)V

    return-void

    :pswitch_1
    invoke-static {v7}, Lcr;->D(Landroid/view/ViewGroup;)V

    sget-object v1, LXA;->a:Ljava/util/HashMap;

    const-wide v5, -0xadb1fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v7, v4, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {v7, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v7, v4, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void

    :pswitch_2
    const/high16 v1, 0x42000000    # 32.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {v7}, Lgf;->o(Landroid/view/ViewGroup;)V

    sget v8, LgG;->a:I

    const-wide v8, -0xa74bfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v8

    const-wide v9, -0xa777fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    array-length v9, v8

    move v10, v6

    :goto_0
    if-ge v10, v9, :cond_b

    aget-object v11, v8, v10

    const/4 v12, 0x1

    invoke-virtual {v11, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v11, v7}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    instance-of v13, v11, Landroid/view/View;

    if-eqz v13, :cond_a

    check-cast v11, Landroid/view/View;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v13

    const-wide v14, -0xbef2fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    const/4 v15, 0x0

    if-eqz v13, :cond_0

    invoke-virtual {v11}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v13

    instance-of v13, v13, Landroid/widget/LinearLayout;

    if-eqz v13, :cond_0

    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v13

    sget-object v16, LXA;->a:Ljava/util/HashMap;

    const-wide v16, -0xbea3fffff835L

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v11}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v16

    const-wide v18, -0xbd54fffff835L

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;

    move-object/from16 v3, v16

    check-cast v3, Landroid/view/ViewGroup;

    filled-new-array {v6}, [I

    move-result-object v4

    invoke-static {v3, v4}, Lgf;->F(Landroid/view/ViewGroup;[I)Landroid/view/View;

    move-result-object v3

    const-wide v19, -0xbd10fffff835L

    invoke-static/range {v19 .. v20}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v3, v15}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    const-wide v19, -0xbdc7fffff835L

    invoke-static/range {v19 .. v20}, LGu;->r(J)Ljava/lang/String;

    check-cast v4, Landroid/widget/LinearLayout;

    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v12

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v20

    const-wide v21, -0xbd88fffff835L

    invoke-static/range {v21 .. v22}, LGu;->r(J)Ljava/lang/String;

    move-object/from16 v15, v20

    check-cast v15, Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    new-instance v6, Landroid/widget/FrameLayout;

    invoke-direct {v6, v13}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v6, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-static {v13, v5}, Lgf;->t(Landroid/content/Context;Landroid/graphics/drawable/Drawable;)Landroid/widget/ImageView;

    move-result-object v5

    new-instance v13, Landroid/widget/FrameLayout$LayoutParams;

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v0

    invoke-direct {v13, v14, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v0, 0x11

    iput v0, v13, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-virtual {v6, v5, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v4, v6, v12, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v0

    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v3}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v4, LG7;

    const/4 v5, 0x0

    invoke-direct {v4, v3, v6, v5}, LG7;-><init>(Landroid/view/View;Landroid/view/View;I)V

    invoke-virtual {v0, v4}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_0
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-wide v3, -0xbf90fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v11}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v3, LXA;->a:Ljava/util/HashMap;

    const-wide v3, -0xbe41fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_1

    const/4 v4, 0x0

    invoke-virtual {v11, v4}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {v11}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    const-wide v5, -0xbe63fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    check-cast v4, Landroid/widget/LinearLayout;

    invoke-virtual {v4, v11}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v5

    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    const-wide v12, -0xbe24fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    check-cast v6, Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v4, v11}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    new-instance v12, Landroid/widget/FrameLayout;

    invoke-direct {v12, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v12, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-static {v0, v3}, Lgf;->t(Landroid/content/Context;Landroid/graphics/drawable/Drawable;)Landroid/widget/ImageView;

    move-result-object v0

    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-direct {v3, v13, v14}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v13, 0x11

    iput v13, v3, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-virtual {v12, v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v4, v12, v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    :cond_1
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-wide v3, -0xbc56fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/16 v3, 0xd

    const/4 v4, 0x2

    const v5, 0x550a022c

    if-eqz v0, :cond_2

    invoke-virtual {v11, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    const-wide v12, -0xbc07fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, LXA;->a:Ljava/util/HashMap;

    const-wide v12, -0xbc1cfffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v6, 0x0

    invoke-virtual {v11, v6}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    const-wide v12, -0xbc3efffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v6, v0}, Lgf;->t(Landroid/content/Context;Landroid/graphics/drawable/Drawable;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v11}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    const-wide v12, -0xbccefffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    check-cast v6, Landroid/widget/RelativeLayout;

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v12

    const-wide v13, -0xbc91fffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    check-cast v12, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    iput v13, v12, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    new-instance v12, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-direct {v12, v13, v14}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v12, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    invoke-virtual {v6, v0, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-wide v12, -0xbb5ffffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {v11, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    const-wide v5, -0xbb10fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    const-wide v5, -0xbb25fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    const-wide v5, -0xbb3afffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto/16 :goto_1

    :cond_3
    invoke-virtual {v11}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroid/widget/RelativeLayout;

    if-nez v0, :cond_4

    goto/16 :goto_1

    :cond_4
    invoke-virtual {v11}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const-wide v5, -0xbbd3fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    const-wide v5, -0xbb96fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    check-cast v4, Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    const-wide v12, -0xba53fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    check-cast v5, Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    const/16 v6, 0x32

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    iput v6, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    sget-object v5, LXA;->a:Ljava/util/HashMap;

    const-wide v5, -0xba0afffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-eqz v5, :cond_5

    const/4 v6, 0x0

    invoke-virtual {v11, v6}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    const-wide v12, -0xba2bfffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v6, v5}, Lgf;->t(Landroid/content/Context;Landroid/graphics/drawable/Drawable;)Landroid/widget/ImageView;

    move-result-object v5

    new-instance v6, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-direct {v6, v12, v13}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v6, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    invoke-virtual {v0, v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v3, LG7;

    const/4 v6, 0x1

    invoke-direct {v3, v4, v5, v6}, LG7;-><init>(Landroid/view/View;Landroid/view/View;I)V

    invoke-virtual {v0, v3}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_5
    const-wide v5, -0xba3bfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_6

    const/4 v3, 0x0

    const v5, 0x550a022b

    invoke-virtual {v4, v5, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {v4, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v4, v5, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    const-wide v5, -0xbadcfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/high16 v5, -0x1000000

    invoke-static {v5, v0}, Lhw;->a(ILjava/lang/String;)I

    move-result v0

    const v5, 0x550a0227

    invoke-virtual {v4, v5, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setTextColor(I)V

    const-class v0, Landroid/widget/TextView;

    invoke-virtual {v4, v5, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_6
    :goto_1
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-wide v3, -0xbaf8fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object v0, LXA;->a:Ljava/util/HashMap;

    const-wide v3, -0xbaaafffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-wide v4, -0xb944fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v3, v0}, Lgf;->t(Landroid/content/Context;Landroid/graphics/drawable/Drawable;)Landroid/widget/ImageView;

    move-result-object v0

    const-wide v3, -0xb954fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-object v3, v11

    check-cast v3, Landroid/view/ViewGroup;

    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    const/4 v5, -0x1

    invoke-direct {v4, v5, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    const/4 v6, 0x0

    invoke-virtual {v3, v0, v6, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto :goto_2

    :cond_7
    const/4 v5, -0x1

    :goto_2
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-wide v3, -0xb910fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object v0, LXA;->a:Ljava/util/HashMap;

    const-wide v3, -0xb938fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_8

    const/4 v3, 0x0

    const v4, 0x550a022b

    invoke-virtual {v11, v4, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {v11, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v11, v4, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    goto :goto_3

    :cond_8
    const/4 v3, 0x0

    const v4, 0x550a022b

    :goto_3
    :try_start_0
    sget-object v0, LXA;->a:Ljava/util/HashMap;

    const-wide v12, -0xb9d2fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v6, 0x0

    invoke-static {v6, v0}, Lhw;->a(ILjava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_9

    instance-of v6, v11, Landroid/widget/LinearLayout;

    if-eqz v6, :cond_9

    move-object v6, v11

    check-cast v6, Landroid/widget/LinearLayout;

    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    instance-of v6, v6, Landroid/widget/LinearLayout;

    if-eqz v6, :cond_9

    move-object v6, v11

    check-cast v6, Landroid/widget/LinearLayout;

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    const-wide v12, -0xb9e9fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    check-cast v6, Landroid/widget/LinearLayout$LayoutParams;

    iget v6, v6, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    const/high16 v12, 0x3f800000    # 1.0f

    cmpg-float v6, v6, v12

    if-nez v6, :cond_9

    move-object v6, v11

    check-cast v6, Landroid/view/ViewGroup;

    const/4 v12, 0x0

    invoke-static {v6, v12}, LGu;->k(Landroid/view/ViewGroup;I)Landroid/view/View;

    move-result-object v6

    instance-of v6, v6, Landroid/widget/TextView;

    if-eqz v6, :cond_9

    move-object v6, v11

    check-cast v6, Landroid/view/ViewGroup;

    invoke-static {v6, v12}, LGu;->k(Landroid/view/ViewGroup;I)Landroid/view/View;

    move-result-object v6

    const-wide v12, -0xb9b7fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    check-cast v6, Landroid/widget/TextView;

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setTextColor(I)V

    move-object v6, v11

    check-cast v6, Landroid/widget/LinearLayout;

    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    const-wide v12, -0xb874fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    check-cast v6, Landroid/view/ViewGroup;

    const/4 v12, 0x1

    invoke-static {v6, v12}, LGu;->k(Landroid/view/ViewGroup;I)Landroid/view/View;

    move-result-object v6

    const-wide v12, -0xb830fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    check-cast v6, Landroid/view/ViewGroup;

    const/4 v12, 0x0

    invoke-static {v6, v12}, LGu;->k(Landroid/view/ViewGroup;I)Landroid/view/View;

    move-result-object v6

    const-wide v12, -0xb8ecfffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-wide v13, -0x20dfbfffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    const/4 v13, 0x1

    invoke-static {v0, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6, v12, v0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_9
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-class v6, Landroid/widget/Button;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {v11}, Landroid/view/View;->isSoundEffectsEnabled()Z

    move-result v0

    if-eqz v0, :cond_a

    sget-object v0, LXA;->a:Ljava/util/HashMap;

    const-wide v12, -0xb8f9fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v6, 0x0

    invoke-static {v6, v0}, Lhw;->a(ILjava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_a

    const-wide v12, -0xb890fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    check-cast v11, Landroid/widget/Button;

    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_a
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v0, p0

    const/4 v6, 0x0

    goto/16 :goto_0

    :cond_b
    move/from16 v20, v6

    filled-new-array/range {v20 .. v20}, [I

    move-result-object v0

    invoke-static {v7, v0}, Lgf;->F(Landroid/view/ViewGroup;[I)Landroid/view/View;

    move-result-object v0

    const-wide v1, -0xa70efffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    sget-object v1, LXA;->a:Ljava/util/HashMap;

    const-wide v1, -0xa7c5fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v0, v1}, Lgf;->N(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    return-void

    :pswitch_3
    invoke-static {v7}, LNj;->j(Landroid/view/ViewGroup;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
