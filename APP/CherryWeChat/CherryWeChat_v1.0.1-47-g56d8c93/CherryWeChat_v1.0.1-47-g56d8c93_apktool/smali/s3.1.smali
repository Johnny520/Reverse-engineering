.class public final Ls3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lgt;
.implements Lvb;
.implements LCr;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LE3;


# direct methods
.method public synthetic constructor <init>(LE3;I)V
    .locals 0

    iput p2, p0, Ls3;->a:I

    iput-object p1, p0, Ls3;->b:LE3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Llr;Z)V
    .locals 9

    iget v0, p0, Ls3;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Llr;->k()Llr;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, p1, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    if-eqz v3, :cond_1

    move-object p1, v0

    :cond_1
    iget-object v4, p0, Ls3;->b:LE3;

    iget-object v5, v4, LE3;->L:[LD3;

    if-eqz v5, :cond_2

    array-length v6, v5

    goto :goto_1

    :cond_2
    move v6, v1

    :goto_1
    if-ge v1, v6, :cond_4

    aget-object v7, v5, v1

    if-eqz v7, :cond_3

    iget-object v8, v7, LD3;->h:Llr;

    if-ne v8, p1, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    const/4 v7, 0x0

    :goto_2
    if-eqz v7, :cond_6

    if-eqz v3, :cond_5

    iget p1, v7, LD3;->a:I

    invoke-virtual {v4, p1, v7, v0}, LE3;->q(ILD3;Llr;)V

    invoke-virtual {v4, v7, v2}, LE3;->s(LD3;Z)V

    goto :goto_3

    :cond_5
    invoke-virtual {v4, v7, p2}, LE3;->s(LD3;Z)V

    :cond_6
    :goto_3
    return-void

    :pswitch_0
    iget-object p2, p0, Ls3;->b:LE3;

    invoke-virtual {p2, p1}, LE3;->r(Llr;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public onApplyWindowInsets(Landroid/view/View;LLF;)LLF;
    .locals 16

    invoke-virtual/range {p2 .. p2}, LLF;->d()I

    move-result v0

    move-object/from16 v1, p0

    iget-object v2, v1, Ls3;->b:LE3;

    iget-object v3, v2, LE3;->k:Landroid/content/Context;

    invoke-virtual/range {p2 .. p2}, LLF;->d()I

    move-result v4

    iget-object v5, v2, LE3;->v:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v6, 0x8

    const/4 v7, 0x0

    if-eqz v5, :cond_11

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    instance-of v5, v5, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v5, :cond_11

    iget-object v5, v2, LE3;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v8, v2, LE3;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v8}, Landroid/view/View;->isShown()Z

    move-result v8

    const/4 v9, 0x1

    if-eqz v8, :cond_f

    iget-object v8, v2, LE3;->c0:Landroid/graphics/Rect;

    if-nez v8, :cond_0

    new-instance v8, Landroid/graphics/Rect;

    invoke-direct {v8}, Landroid/graphics/Rect;-><init>()V

    iput-object v8, v2, LE3;->c0:Landroid/graphics/Rect;

    new-instance v8, Landroid/graphics/Rect;

    invoke-direct {v8}, Landroid/graphics/Rect;-><init>()V

    iput-object v8, v2, LE3;->d0:Landroid/graphics/Rect;

    :cond_0
    iget-object v8, v2, LE3;->c0:Landroid/graphics/Rect;

    iget-object v10, v2, LE3;->d0:Landroid/graphics/Rect;

    invoke-virtual/range {p2 .. p2}, LLF;->b()I

    move-result v11

    invoke-virtual/range {p2 .. p2}, LLF;->d()I

    move-result v12

    invoke-virtual/range {p2 .. p2}, LLF;->c()I

    move-result v13

    invoke-virtual/range {p2 .. p2}, LLF;->a()I

    move-result v14

    invoke-virtual {v8, v11, v12, v13, v14}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v11, v2, LE3;->A:Landroid/view/ViewGroup;

    const-class v12, Landroid/graphics/Rect;

    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v14, 0x1d

    if-lt v13, v14, :cond_1

    invoke-static {v11, v8, v10}, LME;->a(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    goto :goto_0

    :cond_1
    sget-boolean v13, LNj;->h:Z

    if-nez v13, :cond_2

    sput-boolean v9, LNj;->h:Z

    :try_start_0
    const-class v13, Landroid/view/View;

    const-string v14, "computeFitSystemWindows"

    filled-new-array {v12, v12}, [Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v13, v14, v12}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v12

    sput-object v12, LNj;->i:Ljava/lang/reflect/Method;

    invoke-virtual {v12}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    move-result v12

    if-nez v12, :cond_2

    sget-object v12, LNj;->i:Ljava/lang/reflect/Method;

    invoke-virtual {v12, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    sget-object v12, LNj;->i:Ljava/lang/reflect/Method;

    if-eqz v12, :cond_3

    :try_start_1
    filled-new-array {v8, v10}, [Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v12, v11, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_3
    :goto_0
    iget v10, v8, Landroid/graphics/Rect;->top:I

    iget v11, v8, Landroid/graphics/Rect;->left:I

    iget v8, v8, Landroid/graphics/Rect;->right:I

    iget-object v12, v2, LE3;->A:Landroid/view/ViewGroup;

    sget-object v13, LlE;->a:Ljava/util/WeakHashMap;

    invoke-static {v12}, LfE;->a(Landroid/view/View;)LLF;

    move-result-object v12

    if-nez v12, :cond_4

    move v13, v7

    goto :goto_1

    :cond_4
    invoke-virtual {v12}, LLF;->b()I

    move-result v13

    :goto_1
    if-nez v12, :cond_5

    move v12, v7

    goto :goto_2

    :cond_5
    invoke-virtual {v12}, LLF;->c()I

    move-result v12

    :goto_2
    iget v14, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-ne v14, v10, :cond_7

    iget v14, v5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-ne v14, v11, :cond_7

    iget v14, v5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-eq v14, v8, :cond_6

    goto :goto_3

    :cond_6
    move v8, v7

    goto :goto_4

    :cond_7
    :goto_3
    iput v10, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v11, v5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v8, v5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move v8, v9

    :goto_4
    if-lez v10, :cond_8

    iget-object v10, v2, LE3;->C:Landroid/view/View;

    if-nez v10, :cond_8

    new-instance v10, Landroid/view/View;

    invoke-direct {v10, v3}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v10, v2, LE3;->C:Landroid/view/View;

    invoke-virtual {v10, v6}, Landroid/view/View;->setVisibility(I)V

    new-instance v10, Landroid/widget/FrameLayout$LayoutParams;

    iget v11, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    const/16 v14, 0x33

    const/4 v15, -0x1

    invoke-direct {v10, v15, v11, v14}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    iput v13, v10, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    iput v12, v10, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    iget-object v11, v2, LE3;->A:Landroid/view/ViewGroup;

    iget-object v12, v2, LE3;->C:Landroid/view/View;

    invoke-virtual {v11, v12, v15, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto :goto_5

    :cond_8
    iget-object v10, v2, LE3;->C:Landroid/view/View;

    if-eqz v10, :cond_a

    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    check-cast v10, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v11, v10, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iget v14, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-ne v11, v14, :cond_9

    iget v11, v10, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-ne v11, v13, :cond_9

    iget v11, v10, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-eq v11, v12, :cond_a

    :cond_9
    iput v14, v10, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iput v13, v10, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v12, v10, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget-object v11, v2, LE3;->C:Landroid/view/View;

    invoke-virtual {v11, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_a
    :goto_5
    iget-object v10, v2, LE3;->C:Landroid/view/View;

    if-eqz v10, :cond_b

    goto :goto_6

    :cond_b
    move v9, v7

    :goto_6
    if-eqz v9, :cond_d

    invoke-virtual {v10}, Landroid/view/View;->getVisibility()I

    move-result v10

    if-eqz v10, :cond_d

    iget-object v10, v2, LE3;->C:Landroid/view/View;

    invoke-virtual {v10}, Landroid/view/View;->getWindowSystemUiVisibility()I

    move-result v11

    and-int/lit16 v11, v11, 0x2000

    if-eqz v11, :cond_c

    const v11, 0x55060006

    invoke-virtual {v3, v11}, Landroid/content/Context;->getColor(I)I

    move-result v3

    goto :goto_7

    :cond_c
    const v11, 0x55060005

    invoke-virtual {v3, v11}, Landroid/content/Context;->getColor(I)I

    move-result v3

    :goto_7
    invoke-virtual {v10, v3}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_d
    iget-boolean v3, v2, LE3;->H:Z

    if-nez v3, :cond_e

    if-eqz v9, :cond_e

    move v4, v7

    :cond_e
    move v3, v9

    move v9, v8

    goto :goto_8

    :cond_f
    iget v3, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-eqz v3, :cond_10

    iput v7, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    move v3, v7

    goto :goto_8

    :cond_10
    move v3, v7

    move v9, v3

    :goto_8
    if-eqz v9, :cond_12

    iget-object v8, v2, LE3;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v8, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_9

    :cond_11
    move v3, v7

    :cond_12
    :goto_9
    iget-object v2, v2, LE3;->C:Landroid/view/View;

    if-eqz v2, :cond_14

    if-eqz v3, :cond_13

    move v6, v7

    :cond_13
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    :cond_14
    if-eq v0, v4, :cond_15

    invoke-virtual/range {p2 .. p2}, LLF;->b()I

    move-result v0

    invoke-virtual/range {p2 .. p2}, LLF;->c()I

    move-result v2

    invoke-virtual/range {p2 .. p2}, LLF;->a()I

    move-result v3

    move-object/from16 v5, p2

    invoke-virtual {v5, v0, v4, v2, v3}, LLF;->f(IIII)LLF;

    move-result-object v0

    :goto_a
    move-object/from16 v2, p1

    goto :goto_b

    :cond_15
    move-object/from16 v5, p2

    move-object v0, v5

    goto :goto_a

    :goto_b
    invoke-static {v2, v0}, LlE;->g(Landroid/view/View;LLF;)LLF;

    move-result-object v0

    return-object v0
.end method

.method public s(Llr;)Z
    .locals 2

    iget v0, p0, Ls3;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Llr;->k()Llr;

    move-result-object v0

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Ls3;->b:LE3;

    iget-boolean v1, v0, LE3;->F:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, LE3;->l:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-boolean v0, v0, LE3;->Q:Z

    if-nez v0, :cond_0

    const/16 v0, 0x6c

    invoke-interface {v1, v0, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_0
    const/4 p1, 0x1

    return p1

    :pswitch_0
    iget-object v0, p0, Ls3;->b:LE3;

    iget-object v0, v0, LE3;->l:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_1

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_1
    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
