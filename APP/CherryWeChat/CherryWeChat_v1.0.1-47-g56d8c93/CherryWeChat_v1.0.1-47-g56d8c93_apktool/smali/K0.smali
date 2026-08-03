.class public final LK0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LK0;->a:I

    iput-object p2, p0, LK0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, LK0;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 3
    iget-object v0, p0, LK0;->b:Ljava/lang/Object;

    check-cast v0, Lcom/gyf/immersionbar/a;

    if-nez v0, :cond_0

    .line 4
    new-instance v0, Lcom/gyf/immersionbar/a;

    invoke-direct {v0, p1}, Lcom/gyf/immersionbar/a;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, LK0;->b:Ljava/lang/Object;

    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, LK0;->b:Ljava/lang/Object;

    check-cast v0, Lcom/gyf/immersionbar/a;

    if-eqz v0, :cond_0

    iget-boolean v1, v0, Lcom/gyf/immersionbar/a;->l:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, LK0;->b:Ljava/lang/Object;

    check-cast v0, Lcom/gyf/immersionbar/a;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/gyf/immersionbar/a;->h()V

    invoke-static {}, Lcom/gyf/immersionbar/OSUtils;->isEMUI3_x()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/gyf/immersionbar/a;->c()V

    goto :goto_0

    :cond_0
    iget-boolean v1, v0, Lcom/gyf/immersionbar/a;->l:Z

    if-eqz v1, :cond_1

    iget-boolean v1, v0, Lcom/gyf/immersionbar/a;->f:Z

    if-nez v1, :cond_1

    iget-object v1, v0, Lcom/gyf/immersionbar/a;->h:Lo5;

    iget-boolean v1, v1, Lo5;->e:Z

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/gyf/immersionbar/a;->d()V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/gyf/immersionbar/a;->c()V

    :goto_0
    invoke-virtual {p0}, LK0;->a()V

    :cond_2
    return-void
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, LK0;->b:Ljava/lang/Object;

    check-cast v0, Lcom/gyf/immersionbar/a;

    if-eqz v0, :cond_3

    iget-object v1, v0, Lcom/gyf/immersionbar/a;->a:Landroid/app/Activity;

    if-eqz v1, :cond_1

    sget v1, LYe;->d:I

    sget-object v1, LXe;->a:LYe;

    iget-object v1, v1, LYe;->a:Ljava/util/ArrayList;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :goto_0
    sget v1, LCs;->a:I

    sget-object v1, LBs;->a:LCs;

    iget-object v2, v0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1
    iget-boolean v1, v0, Lcom/gyf/immersionbar/a;->g:Z

    if-eqz v1, :cond_2

    iget-object v1, v0, Lcom/gyf/immersionbar/a;->e:Lcom/gyf/immersionbar/a;

    if-eqz v1, :cond_2

    iget-object v1, v1, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_2
    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/gyf/immersionbar/a;->l:Z

    const/4 v0, 0x0

    iput-object v0, p0, LK0;->b:Ljava/lang/Object;

    :cond_3
    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, LK0;->b:Ljava/lang/Object;

    check-cast v0, Lcom/gyf/immersionbar/a;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/gyf/immersionbar/a;->h()V

    iget-boolean v1, v0, Lcom/gyf/immersionbar/a;->f:Z

    if-nez v1, :cond_1

    iget-boolean v1, v0, Lcom/gyf/immersionbar/a;->l:Z

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/gyf/immersionbar/a;->h:Lo5;

    if-eqz v1, :cond_1

    invoke-static {}, Lcom/gyf/immersionbar/OSUtils;->isEMUI3_x()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lcom/gyf/immersionbar/a;->h:Lo5;

    iget-boolean v1, v1, Lo5;->f:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/gyf/immersionbar/a;->d()V

    return-void

    :cond_0
    iget-object v0, v0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1
    return-void
.end method

.method public final run()V
    .locals 19

    move-object/from16 v1, p0

    iget v0, v1, LK0;->a:I

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, LK0;->b:Ljava/lang/Object;

    check-cast v0, LFE;

    invoke-virtual {v0, v8}, LFE;->setScrollState(I)V

    invoke-virtual {v0}, LFE;->p()V

    return-void

    :pswitch_0
    iget-object v0, v1, LK0;->b:Ljava/lang/Object;

    check-cast v0, LmE;

    invoke-virtual {v0, v8}, LmE;->m(I)V

    return-void

    :pswitch_1
    iget-object v0, v1, LK0;->b:Ljava/lang/Object;

    check-cast v0, LuB;

    iget-object v2, v0, LuB;->b:Landroid/view/Window$Callback;

    invoke-virtual {v0}, LuB;->q()Landroid/view/Menu;

    move-result-object v0

    instance-of v3, v0, Llr;

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Llr;

    goto :goto_0

    :cond_0
    move-object v3, v7

    :goto_0
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Llr;->w()V

    :cond_1
    :try_start_0
    invoke-interface {v0}, Landroid/view/Menu;->clear()V

    invoke-interface {v2, v8, v0}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2, v8, v7, v0}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_2
    :goto_1
    invoke-interface {v0}, Landroid/view/Menu;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    if-eqz v3, :cond_4

    invoke-virtual {v3}, Llr;->v()V

    :cond_4
    return-void

    :goto_2
    if-eqz v3, :cond_5

    invoke-virtual {v3}, Llr;->v()V

    :cond_5
    throw v0

    :pswitch_2
    iget-object v0, v1, LK0;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->u()Z

    return-void

    :pswitch_3
    iget-object v0, v1, LK0;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lag;

    iget-object v0, v0, Lag;->g:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    invoke-virtual {v0}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    return-void

    :pswitch_4
    iget-object v0, v1, LK0;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->d()Z

    return-void

    :pswitch_5
    iget-object v0, v1, LK0;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget-boolean v2, v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->f:Z

    if-eqz v2, :cond_6

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "input_method"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v2, v0, v8}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    iput-boolean v8, v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->f:Z

    :cond_6
    return-void

    :pswitch_6
    iget-object v0, v1, LK0;->b:Ljava/lang/Object;

    check-cast v0, Lgw;

    iget-object v2, v0, Lgw;->c:LQn;

    invoke-interface {v2, v0}, LQn;->l(LWn;)V

    return-void

    :pswitch_7
    iget-object v0, v1, LK0;->b:Ljava/lang/Object;

    check-cast v0, LRp;

    sget-object v2, Lio/github/cherrywechat/lua/dev/CherryDevServer;->INSTANCE:Lio/github/cherrywechat/lua/dev/CherryDevServer;

    invoke-virtual {v2}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->isRunning()Z

    move-result v3

    if-eqz v3, :cond_8

    iget-object v3, v0, LRp;->k:Landroid/widget/TextView;

    if-nez v3, :cond_7

    const-wide v3, -0x7561fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    goto :goto_3

    :cond_7
    move-object v7, v3

    :goto_3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->getConnectionCount()I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-wide v4, -0x7573fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, v0, LRp;->n:Landroid/os/Handler;

    if-eqz v0, :cond_8

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_8
    return-void

    :pswitch_8
    iget-object v0, v1, LK0;->b:Ljava/lang/Object;

    check-cast v0, LWl;

    iget-object v5, v0, LWl;->c:Landroidx/recyclerview/widget/o;

    if-eqz v5, :cond_15

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-wide v9, v0, LWl;->A:J

    const-wide/high16 v11, -0x8000000000000000L

    cmp-long v7, v9, v11

    if-nez v7, :cond_9

    :goto_4
    move-wide/from16 v17, v2

    goto :goto_5

    :cond_9
    sub-long v2, v5, v9

    goto :goto_4

    :goto_5
    iget-object v2, v0, LWl;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/i;

    move-result-object v2

    iget-object v3, v0, LWl;->z:Landroid/graphics/Rect;

    if-nez v3, :cond_a

    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    iput-object v3, v0, LWl;->z:Landroid/graphics/Rect;

    :cond_a
    iget-object v3, v0, LWl;->c:Landroidx/recyclerview/widget/o;

    iget-object v3, v3, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    iget-object v7, v0, LWl;->z:Landroid/graphics/Rect;

    invoke-virtual {v2, v3, v7}, Landroidx/recyclerview/widget/i;->calculateItemDecorationsForChild(Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-virtual {v2}, Landroidx/recyclerview/widget/i;->canScrollHorizontally()Z

    move-result v3

    if-eqz v3, :cond_c

    iget v3, v0, LWl;->j:F

    iget v7, v0, LWl;->h:F

    add-float/2addr v3, v7

    float-to-int v3, v3

    iget-object v7, v0, LWl;->z:Landroid/graphics/Rect;

    iget v7, v7, Landroid/graphics/Rect;->left:I

    sub-int v7, v3, v7

    iget-object v9, v0, LWl;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v9}, Landroid/view/View;->getPaddingLeft()I

    move-result v9

    sub-int/2addr v7, v9

    iget v9, v0, LWl;->h:F

    cmpg-float v10, v9, v4

    if-gez v10, :cond_b

    if-gez v7, :cond_b

    :goto_6
    move/from16 v16, v7

    goto :goto_7

    :cond_b
    cmpl-float v7, v9, v4

    if-lez v7, :cond_c

    iget-object v7, v0, LWl;->c:Landroidx/recyclerview/widget/o;

    iget-object v7, v7, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    move-result v7

    add-int/2addr v7, v3

    iget-object v3, v0, LWl;->z:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    add-int/2addr v7, v3

    iget-object v3, v0, LWl;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3

    iget-object v9, v0, LWl;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v9}, Landroid/view/View;->getPaddingRight()I

    move-result v9

    sub-int/2addr v3, v9

    sub-int/2addr v7, v3

    if-lez v7, :cond_c

    goto :goto_6

    :cond_c
    move/from16 v16, v8

    :goto_7
    invoke-virtual {v2}, Landroidx/recyclerview/widget/i;->canScrollVertically()Z

    move-result v2

    if-eqz v2, :cond_e

    iget v2, v0, LWl;->k:F

    iget v3, v0, LWl;->i:F

    add-float/2addr v2, v3

    float-to-int v2, v2

    iget-object v3, v0, LWl;->z:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->top:I

    sub-int v3, v2, v3

    iget-object v7, v0, LWl;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v7}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    sub-int/2addr v3, v7

    iget v7, v0, LWl;->i:F

    cmpg-float v9, v7, v4

    if-gez v9, :cond_d

    if-gez v3, :cond_d

    :goto_8
    move v8, v3

    goto :goto_9

    :cond_d
    cmpl-float v3, v7, v4

    if-lez v3, :cond_e

    iget-object v3, v0, LWl;->c:Landroidx/recyclerview/widget/o;

    iget-object v3, v3, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    add-int/2addr v3, v2

    iget-object v2, v0, LWl;->z:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v3, v2

    iget-object v2, v0, LWl;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    iget-object v4, v0, LWl;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v2, v4

    sub-int/2addr v3, v2

    if-lez v3, :cond_e

    goto :goto_8

    :cond_e
    :goto_9
    if-eqz v16, :cond_f

    iget-object v13, v0, LWl;->m:LUl;

    iget-object v14, v0, LWl;->q:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, v0, LWl;->c:Landroidx/recyclerview/widget/o;

    iget-object v2, v2, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v15

    iget-object v2, v0, LWl;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    invoke-virtual/range {v13 .. v18}, LUl;->j(Landroidx/recyclerview/widget/RecyclerView;IIJ)I

    move-result v16

    :cond_f
    move/from16 v2, v16

    if-eqz v8, :cond_10

    iget-object v13, v0, LWl;->m:LUl;

    iget-object v14, v0, LWl;->q:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, v0, LWl;->c:Landroidx/recyclerview/widget/o;

    iget-object v3, v3, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v15

    iget-object v3, v0, LWl;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move/from16 v16, v8

    invoke-virtual/range {v13 .. v18}, LUl;->j(Landroidx/recyclerview/widget/RecyclerView;IIJ)I

    move-result v8

    goto :goto_a

    :cond_10
    move/from16 v16, v8

    :goto_a
    if-nez v2, :cond_12

    if-eqz v8, :cond_11

    goto :goto_b

    :cond_11
    iput-wide v11, v0, LWl;->A:J

    goto :goto_c

    :cond_12
    :goto_b
    iget-wide v3, v0, LWl;->A:J

    cmp-long v3, v3, v11

    if-nez v3, :cond_13

    iput-wide v5, v0, LWl;->A:J

    :cond_13
    iget-object v3, v0, LWl;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3, v2, v8}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    iget-object v2, v0, LWl;->c:Landroidx/recyclerview/widget/o;

    if-eqz v2, :cond_14

    invoke-virtual {v0, v2}, LWl;->l(Landroidx/recyclerview/widget/o;)V

    :cond_14
    iget-object v2, v0, LWl;->q:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, v0, LWl;->r:LK0;

    invoke-virtual {v2, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, v0, LWl;->q:Landroidx/recyclerview/widget/RecyclerView;

    sget-object v2, LlE;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v0, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    :cond_15
    :goto_c
    return-void

    :pswitch_9
    iget-object v0, v1, LK0;->b:Ljava/lang/Object;

    check-cast v0, Lcom/gyf/immersionbar/a;

    if-eqz v0, :cond_17

    iget-object v0, v0, Lcom/gyf/immersionbar/a;->a:Landroid/app/Activity;

    if-nez v0, :cond_16

    goto :goto_d

    :cond_16
    new-instance v2, Ln5;

    invoke-direct {v2, v0}, Ln5;-><init>(Landroid/app/Activity;)V

    throw v7

    :cond_17
    :goto_d
    return-void

    :pswitch_a
    iget-object v0, v1, LK0;->b:Ljava/lang/Object;

    check-cast v0, Lzi;

    invoke-virtual {v0, v6}, Lzi;->y(Z)Z

    return-void

    :pswitch_b
    iget-object v0, v1, LK0;->b:Ljava/lang/Object;

    check-cast v0, Lhi;

    iget-object v2, v0, Lhi;->H:Lfi;

    if-eqz v2, :cond_18

    invoke-virtual {v0}, Lhi;->b()Lfi;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_18
    return-void

    :pswitch_c
    iget-object v0, v1, LK0;->b:Ljava/lang/Object;

    check-cast v0, Lih;

    iget-object v2, v0, Lih;->z:Landroid/animation/ValueAnimator;

    iget v3, v0, Lih;->A:I

    if-eq v3, v6, :cond_19

    if-eq v3, v5, :cond_1a

    goto :goto_e

    :cond_19
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_1a
    const/4 v3, 0x3

    iput v3, v0, Lih;->A:I

    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    new-array v3, v5, [F

    aput v0, v3, v8

    aput v4, v3, v6

    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    const/16 v0, 0x1f4

    int-to-long v3, v0

    invoke-virtual {v2, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->start()V

    :goto_e
    return-void

    :pswitch_d
    iget-object v0, v1, LK0;->b:Ljava/lang/Object;

    check-cast v0, LIe;

    iput-object v7, v0, LIe;->l:LK0;

    invoke-virtual {v0}, LIe;->drawableStateChanged()V

    return-void

    :pswitch_e
    iget-object v0, v1, LK0;->b:Ljava/lang/Object;

    check-cast v0, LKd;

    iget-object v2, v0, LKd;->U:LId;

    iget-object v0, v0, LKd;->c0:Landroid/app/Dialog;

    invoke-virtual {v2, v0}, LId;->onDismiss(Landroid/content/DialogInterface;)V

    return-void

    :pswitch_f
    iget-object v0, v1, LK0;->b:Ljava/lang/Object;

    check-cast v0, Lb6;

    iput-boolean v8, v0, Lb6;->c:Z

    iget-object v2, v0, Lb6;->e:LQb;

    check-cast v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-object v3, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->O:LmE;

    if-eqz v3, :cond_1b

    invoke-virtual {v3}, LmE;->f()Z

    move-result v3

    if-eqz v3, :cond_1b

    iget v2, v0, Lb6;->b:I

    invoke-virtual {v0, v2}, Lb6;->a(I)V

    goto :goto_f

    :cond_1b
    iget v3, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N:I

    if-ne v3, v5, :cond_1c

    iget v0, v0, Lb6;->b:I

    invoke-virtual {v2, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->C(I)V

    :cond_1c
    :goto_f
    return-void

    :pswitch_10
    iget-object v0, v1, LK0;->b:Ljava/lang/Object;

    check-cast v0, LLo;

    iget-object v4, v0, LLo;->c:LIe;

    iget-object v5, v0, LLo;->a:Lb5;

    iget-boolean v6, v0, LLo;->o:Z

    if-nez v6, :cond_1d

    goto/16 :goto_11

    :cond_1d
    iget-boolean v6, v0, LLo;->m:Z

    if-eqz v6, :cond_1e

    iput-boolean v8, v0, LLo;->m:Z

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v6

    iput-wide v6, v5, Lb5;->e:J

    const-wide/16 v9, -0x1

    iput-wide v9, v5, Lb5;->g:J

    iput-wide v6, v5, Lb5;->f:J

    const/high16 v6, 0x3f000000    # 0.5f

    iput v6, v5, Lb5;->h:F

    :cond_1e
    iget-wide v6, v5, Lb5;->g:J

    cmp-long v6, v6, v2

    if-lez v6, :cond_1f

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v6

    iget-wide v9, v5, Lb5;->g:J

    iget v11, v5, Lb5;->i:I

    int-to-long v11, v11

    add-long/2addr v9, v11

    cmp-long v6, v6, v9

    if-lez v6, :cond_1f

    goto :goto_10

    :cond_1f
    invoke-virtual {v0}, LLo;->e()Z

    move-result v6

    if-nez v6, :cond_20

    :goto_10
    iput-boolean v8, v0, LLo;->o:Z

    goto :goto_11

    :cond_20
    iget-boolean v6, v0, LLo;->n:Z

    if-eqz v6, :cond_21

    iput-boolean v8, v0, LLo;->n:Z

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v9

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/4 v13, 0x3

    const/4 v14, 0x0

    move-wide v11, v9

    invoke-static/range {v9 .. v16}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v6

    invoke-virtual {v4, v6}, LIe;->onTouchEvent(Landroid/view/MotionEvent;)Z

    invoke-virtual {v6}, Landroid/view/MotionEvent;->recycle()V

    :cond_21
    iget-wide v6, v5, Lb5;->f:J

    cmp-long v2, v6, v2

    if-eqz v2, :cond_22

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v2

    invoke-virtual {v5, v2, v3}, Lb5;->a(J)F

    move-result v6

    const/high16 v7, -0x3f800000    # -4.0f

    mul-float/2addr v7, v6

    mul-float/2addr v7, v6

    const/high16 v8, 0x40800000    # 4.0f

    mul-float/2addr v6, v8

    add-float/2addr v6, v7

    iget-wide v7, v5, Lb5;->f:J

    sub-long v7, v2, v7

    iput-wide v2, v5, Lb5;->f:J

    long-to-float v2, v7

    mul-float/2addr v2, v6

    iget v3, v5, Lb5;->d:F

    mul-float/2addr v2, v3

    float-to-int v2, v2

    iget-object v0, v0, LLo;->q:LIe;

    invoke-virtual {v0, v2}, Landroid/widget/AbsListView;->scrollListBy(I)V

    sget-object v0, LlE;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v4, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    :goto_11
    return-void

    :cond_22
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v2, "Cannot compute scroll delta before calling start()"

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_11
    iget-object v0, v1, LK0;->b:Ljava/lang/Object;

    check-cast v0, Lqs;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_12
    :try_start_1
    iget-object v2, v0, Lqs;->c:Ljava/lang/Object;

    check-cast v2, Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {v2}, Ljava/lang/ref/ReferenceQueue;->remove()Ljava/lang/ref/Reference;

    move-result-object v2

    check-cast v2, LM0;

    invoke-virtual {v0, v2}, Lqs;->l(LM0;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_12

    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    goto :goto_12

    :pswitch_12
    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    iget-object v0, v1, LK0;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
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
