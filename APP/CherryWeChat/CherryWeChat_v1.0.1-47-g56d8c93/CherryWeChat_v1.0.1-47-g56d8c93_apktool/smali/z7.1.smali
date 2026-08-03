.class public final synthetic Lz7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/view/ViewGroup;

.field public final synthetic c:Landroid/app/Activity;

.field public final synthetic d:Landroid/view/ViewGroup;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Landroid/view/ViewGroup;Landroid/view/ViewGroup;I)V
    .locals 0

    .line 1
    iput p4, p0, Lz7;->a:I

    iput-object p1, p0, Lz7;->c:Landroid/app/Activity;

    iput-object p2, p0, Lz7;->b:Landroid/view/ViewGroup;

    iput-object p3, p0, Lz7;->d:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/ViewGroup;Landroid/app/Activity;Landroid/view/ViewGroup;I)V
    .locals 0

    .line 2
    iput p4, p0, Lz7;->a:I

    iput-object p1, p0, Lz7;->b:Landroid/view/ViewGroup;

    iput-object p2, p0, Lz7;->c:Landroid/app/Activity;

    iput-object p3, p0, Lz7;->d:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    iget v0, p0, Lz7;->a:I

    const/4 v1, -0x1

    const-string v2, "status_bar_height"

    const/4 v3, 0x1

    const/4 v4, 0x0

    iget-object v5, p0, Lz7;->d:Landroid/view/ViewGroup;

    iget-object v6, p0, Lz7;->b:Landroid/view/ViewGroup;

    iget-object v7, p0, Lz7;->c:Landroid/app/Activity;

    packed-switch v0, :pswitch_data_0

    const-wide v0, -0x1d965fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-wide v8, -0x20dfbfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v7, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    const-wide v0, -0x1d977fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sget-object v1, LXA;->a:Ljava/util/HashMap;

    invoke-static {}, Lhw;->h()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v7, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v6, v4, v4, v4, v4}, Landroid/view/View;->setPadding(IIII)V

    const-wide v0, -0x2fab3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v7, v2}, Ln5;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v4, v0, v4, v4}, Landroid/view/View;->setPadding(IIII)V

    return-void

    :pswitch_0
    const v0, 0x1020002

    invoke-virtual {v7, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const-wide v8, -0x1d093fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    const-wide v8, -0x1df4ffffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v7}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v8

    invoke-virtual {v8, v4}, Landroid/view/Window;->setStatusBarColor(I)V

    invoke-static {v0}, Lgf;->q(Landroid/view/ViewGroup;)V

    invoke-static {v6}, Lgf;->q(Landroid/view/ViewGroup;)V

    const-wide v8, -0x1d1a2fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    const-wide v8, -0x1d064fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    const-wide v9, -0x1d022fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    const-wide v10, -0x1d0e4fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    filled-new-array {v6, v8, v9, v10}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lsa;->b0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v6, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    const-wide v8, -0x1dde7fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    new-instance v6, Landroid/widget/ImageView;

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-direct {v6, v8}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    sget-object v8, LXA;->a:Ljava/util/HashMap;

    const-wide v8, -0x1ddeffffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    invoke-virtual {v6, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v8, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v9

    invoke-static {v9, v2}, Ln5;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    sget v9, Lgf;->o:I

    add-int/2addr v2, v9

    invoke-direct {v8, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v5, v6, v4, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, LMk;

    invoke-direct {v2, v0, v5, v6, v3}, LMk;-><init>(Landroid/view/ViewGroup;Landroid/view/ViewGroup;Landroid/widget/ImageView;I)V

    invoke-virtual {v0, v2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :cond_0
    invoke-static {v0}, Lgf;->u(Landroid/view/ViewGroup;)V

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-wide v2, -0x1df0bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x1df18fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v4}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v5}, Lk5;->c(Landroid/view/ViewGroup;)V

    :cond_1
    sget-object v0, LXA;->a:Ljava/util/HashMap;

    const-wide v2, -0x1df2dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v7, v0}, Lgf;->t(Landroid/content/Context;Landroid/graphics/drawable/Drawable;)Landroid/widget/ImageView;

    move-result-object v0

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v2, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v5, v0, v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void

    :pswitch_1
    const/16 v0, 0x28

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :try_start_0
    filled-new-array {v4, v3, v4}, [I

    move-result-object v2

    invoke-static {v6, v2}, Lgf;->F(Landroid/view/ViewGroup;[I)Landroid/view/View;

    move-result-object v2

    instance-of v8, v2, Landroid/view/ViewGroup;

    const/4 v9, 0x0

    if-eqz v8, :cond_2

    check-cast v2, Landroid/view/ViewGroup;

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_2

    :cond_2
    move-object v2, v9

    :goto_0
    if-nez v2, :cond_3

    goto/16 :goto_3

    :cond_3
    instance-of v8, v2, Landroid/widget/LinearLayout;

    if-eqz v8, :cond_4

    check-cast v2, Landroid/widget/LinearLayout;

    new-instance v3, LX7;

    invoke-direct {v3, v7, v6}, LX7;-><init>(Landroid/content/Context;Landroid/view/View;)V

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-direct {v6, v1, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v3, v4, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1

    :cond_4
    filled-new-array {v4, v3, v3}, [I

    move-result-object v3

    invoke-static {v6, v3}, Lgf;->F(Landroid/view/ViewGroup;[I)Landroid/view/View;

    move-result-object v3

    instance-of v8, v3, Landroid/view/ViewGroup;

    if-eqz v8, :cond_5

    move-object v9, v3

    check-cast v9, Landroid/view/ViewGroup;

    :cond_5
    instance-of v3, v9, Landroid/widget/LinearLayout;

    if-eqz v3, :cond_6

    check-cast v9, Landroid/widget/LinearLayout;

    new-instance v2, LX7;

    invoke-direct {v2, v7, v6}, LX7;-><init>(Landroid/content/Context;Landroid/view/View;)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-direct {v3, v1, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v9, v2, v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1

    :cond_6
    new-instance v3, LX7;

    invoke-direct {v3, v7, v6}, LX7;-><init>(Landroid/content/Context;Landroid/view/View;)V

    new-instance v6, Landroid/view/ViewGroup$LayoutParams;

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-direct {v6, v1, v7}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v3, v4, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    :goto_1
    const-wide v1, -0xe3abfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Lgf;->v(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    move-result-object v1

    const-wide v2, -0xe25efffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/ViewGroup;

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v0

    invoke-virtual {v1, v4, v0}, Landroid/view/View;->scrollTo(II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :goto_2
    const-wide v1, -0xe21afffff835L

    const-wide v3, -0xe227fffff835L

    invoke-static {v1, v2, v3, v4, v0}, LEy;->i(JJLjava/lang/Exception;)V

    :goto_3
    return-void

    :pswitch_2
    invoke-static {v6}, LNj;->j(Landroid/view/ViewGroup;)V

    invoke-static {v7}, LOj;->p(Landroid/app/Activity;)V

    invoke-virtual {v5, v4}, Landroid/view/View;->setFitsSystemWindows(Z)V

    invoke-virtual {v5, v4, v4, v4, v4}, Landroid/view/View;->setPadding(IIII)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
