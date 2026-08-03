.class public final Landroidx/transition/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Landroidx/transition/e;

.field public b:Landroid/widget/FrameLayout;


# virtual methods
.method public final onPreDraw()Z
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/transition/g$a;->b:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    sget-object v1, Landroidx/transition/g;->c:Ljava/util/ArrayList;

    iget-object v3, v0, Landroidx/transition/g$a;->b:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v1

    const/4 v8, 0x1

    if-nez v1, :cond_0

    return v8

    :cond_0
    invoke-static {}, Landroidx/transition/g;->b()La/J1;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v3, v2}, La/ge;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    if-nez v4, :cond_2

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1, v3, v4}, La/ge;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    move-object v5, v2

    goto :goto_0

    :cond_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-lez v5, :cond_1

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :goto_0
    iget-object v6, v0, Landroidx/transition/g$a;->a:Landroidx/transition/e;

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, Landroidx/transition/g$a$a;

    invoke-direct {v4, v0, v1}, Landroidx/transition/g$a$a;-><init>(Landroidx/transition/g$a;La/J1;)V

    invoke-virtual {v6, v4}, Landroidx/transition/e;->a(Landroidx/transition/e$f;)V

    const/4 v1, 0x0

    invoke-virtual {v6, v3, v1}, Landroidx/transition/e;->h(Landroid/widget/FrameLayout;Z)V

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/transition/e;

    invoke-virtual {v5, v3}, Landroidx/transition/e;->z(Landroid/widget/FrameLayout;)V

    goto :goto_1

    :cond_3
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v6, Landroidx/transition/e;->k:Ljava/util/ArrayList;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v6, Landroidx/transition/e;->l:Ljava/util/ArrayList;

    iget-object v4, v6, Landroidx/transition/e;->g:La/A2;

    iget-object v5, v6, Landroidx/transition/e;->h:La/A2;

    new-instance v7, La/J1;

    iget-object v9, v4, La/A2;->a:Ljava/lang/Object;

    check-cast v9, La/J1;

    invoke-direct {v7, v9}, La/J1;-><init>(La/ge;)V

    new-instance v9, La/J1;

    iget-object v10, v5, La/A2;->a:Ljava/lang/Object;

    check-cast v10, La/J1;

    invoke-direct {v9, v10}, La/J1;-><init>(La/ge;)V

    move v10, v1

    :goto_2
    iget-object v11, v6, Landroidx/transition/e;->j:[I

    array-length v12, v11

    if-ge v10, v12, :cond_11

    aget v11, v11, v10

    if-eq v11, v8, :cond_e

    const/4 v12, 0x2

    if-eq v11, v12, :cond_c

    const/4 v12, 0x3

    if-eq v11, v12, :cond_a

    const/4 v12, 0x4

    if-eq v11, v12, :cond_5

    :cond_4
    move/from16 v16, v8

    move-object v15, v9

    goto/16 :goto_8

    :cond_5
    iget-object v11, v4, La/A2;->c:Ljava/lang/Object;

    check-cast v11, La/U9;

    invoke-virtual {v11}, La/U9;->e()I

    move-result v12

    move v13, v1

    :goto_3
    if-ge v13, v12, :cond_4

    invoke-virtual {v11, v13}, La/U9;->f(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/view/View;

    if-eqz v14, :cond_8

    invoke-virtual {v6, v14}, Landroidx/transition/e;->u(Landroid/view/View;)Z

    move-result v15

    if-eqz v15, :cond_8

    iget-boolean v15, v11, La/U9;->a:Z

    if-eqz v15, :cond_6

    invoke-virtual {v11}, La/U9;->b()V

    :cond_6
    iget-object v15, v11, La/U9;->b:[J

    move/from16 v16, v8

    move-object/from16 v17, v9

    aget-wide v8, v15, v13

    iget-object v15, v5, La/A2;->c:Ljava/lang/Object;

    check-cast v15, La/U9;

    invoke-virtual {v15, v8, v9, v2}, La/U9;->c(JLjava/lang/Long;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/view/View;

    if-eqz v8, :cond_7

    invoke-virtual {v6, v8}, Landroidx/transition/e;->u(Landroid/view/View;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-virtual {v7, v14, v2}, La/ge;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, La/Ff;

    move-object/from16 v15, v17

    invoke-virtual {v15, v8, v2}, La/ge;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v1, v17

    check-cast v1, La/Ff;

    if-eqz v9, :cond_9

    if-eqz v1, :cond_9

    iget-object v2, v6, Landroidx/transition/e;->k:Ljava/util/ArrayList;

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, v6, Landroidx/transition/e;->l:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7, v14}, La/ge;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v15, v8}, La/ge;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_7
    move-object/from16 v15, v17

    goto :goto_4

    :cond_8
    move/from16 v16, v8

    move-object v15, v9

    :cond_9
    :goto_4
    add-int/lit8 v13, v13, 0x1

    move-object v9, v15

    move/from16 v8, v16

    const/4 v1, 0x0

    const/4 v2, 0x0

    goto :goto_3

    :cond_a
    move/from16 v16, v8

    move-object v15, v9

    iget-object v1, v4, La/A2;->b:Ljava/lang/Object;

    check-cast v1, Landroid/util/SparseArray;

    iget-object v2, v5, La/A2;->b:Ljava/lang/Object;

    check-cast v2, Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v8

    const/4 v9, 0x0

    :goto_5
    if-ge v9, v8, :cond_10

    invoke-virtual {v1, v9}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/view/View;

    if-eqz v11, :cond_b

    invoke-virtual {v6, v11}, Landroidx/transition/e;->u(Landroid/view/View;)Z

    move-result v12

    if-eqz v12, :cond_b

    invoke-virtual {v1, v9}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v12

    invoke-virtual {v2, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/view/View;

    if-eqz v12, :cond_b

    invoke-virtual {v6, v12}, Landroidx/transition/e;->u(Landroid/view/View;)Z

    move-result v13

    if-eqz v13, :cond_b

    const/4 v13, 0x0

    invoke-virtual {v7, v11, v13}, La/ge;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, La/Ff;

    invoke-virtual {v15, v12, v13}, La/ge;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v13, v18

    check-cast v13, La/Ff;

    if-eqz v14, :cond_b

    if-eqz v13, :cond_b

    iget-object v0, v6, Landroidx/transition/e;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v6, Landroidx/transition/e;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7, v11}, La/ge;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v15, v12}, La/ge;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v0, p0

    goto :goto_5

    :cond_c
    move/from16 v16, v8

    move-object v15, v9

    iget-object v0, v4, La/A2;->d:Ljava/lang/Object;

    check-cast v0, La/J1;

    iget v1, v0, La/ge;->c:I

    const/4 v2, 0x0

    :goto_6
    if-ge v2, v1, :cond_10

    invoke-virtual {v0, v2}, La/ge;->j(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/view/View;

    if-eqz v8, :cond_d

    invoke-virtual {v6, v8}, Landroidx/transition/e;->u(Landroid/view/View;)Z

    move-result v9

    if-eqz v9, :cond_d

    invoke-virtual {v0, v2}, La/ge;->h(I)Ljava/lang/Object;

    move-result-object v9

    iget-object v11, v5, La/A2;->d:Ljava/lang/Object;

    check-cast v11, La/J1;

    const/4 v13, 0x0

    invoke-virtual {v11, v9, v13}, La/ge;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/view/View;

    if-eqz v9, :cond_d

    invoke-virtual {v6, v9}, Landroidx/transition/e;->u(Landroid/view/View;)Z

    move-result v11

    if-eqz v11, :cond_d

    invoke-virtual {v7, v8, v13}, La/ge;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, La/Ff;

    invoke-virtual {v15, v9, v13}, La/ge;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, La/Ff;

    if-eqz v11, :cond_d

    if-eqz v12, :cond_d

    iget-object v13, v6, Landroidx/transition/e;->k:Ljava/util/ArrayList;

    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v11, v6, Landroidx/transition/e;->l:Ljava/util/ArrayList;

    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7, v8}, La/ge;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v15, v9}, La/ge;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_e
    move/from16 v16, v8

    move-object v15, v9

    iget v0, v7, La/ge;->c:I

    add-int/lit8 v0, v0, -0x1

    :goto_7
    if-ltz v0, :cond_10

    invoke-virtual {v7, v0}, La/ge;->h(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_f

    invoke-virtual {v6, v1}, Landroidx/transition/e;->u(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-virtual {v15, v1}, La/ge;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/Ff;

    if-eqz v1, :cond_f

    iget-object v2, v1, La/Ff;->b:Landroid/view/View;

    invoke-virtual {v6, v2}, Landroidx/transition/e;->u(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-virtual {v7, v0}, La/ge;->i(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/Ff;

    iget-object v8, v6, Landroidx/transition/e;->k:Ljava/util/ArrayList;

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, v6, Landroidx/transition/e;->l:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_f
    add-int/lit8 v0, v0, -0x1

    goto :goto_7

    :cond_10
    :goto_8
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v0, p0

    move-object v9, v15

    move/from16 v8, v16

    const/4 v1, 0x0

    const/4 v2, 0x0

    goto/16 :goto_2

    :cond_11
    move/from16 v16, v8

    move-object v15, v9

    const/4 v0, 0x0

    :goto_9
    iget v1, v7, La/ge;->c:I

    if-ge v0, v1, :cond_13

    invoke-virtual {v7, v0}, La/ge;->j(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/Ff;

    iget-object v2, v1, La/Ff;->b:Landroid/view/View;

    invoke-virtual {v6, v2}, Landroidx/transition/e;->u(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_12

    iget-object v2, v6, Landroidx/transition/e;->k:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v6, Landroidx/transition/e;->l:Ljava/util/ArrayList;

    const/4 v13, 0x0

    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_12
    add-int/lit8 v0, v0, 0x1

    goto :goto_9

    :cond_13
    const/4 v1, 0x0

    :goto_a
    iget v0, v15, La/ge;->c:I

    if-ge v1, v0, :cond_15

    invoke-virtual {v15, v1}, La/ge;->j(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/Ff;

    iget-object v2, v0, La/Ff;->b:Landroid/view/View;

    invoke-virtual {v6, v2}, Landroidx/transition/e;->u(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_14

    iget-object v2, v6, Landroidx/transition/e;->l:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v6, Landroidx/transition/e;->k:Ljava/util/ArrayList;

    const/4 v13, 0x0

    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_14
    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_15
    invoke-static {}, Landroidx/transition/e;->p()La/J1;

    move-result-object v0

    iget v1, v0, La/ge;->c:I

    invoke-virtual {v3}, Landroid/view/View;->getWindowId()Landroid/view/WindowId;

    move-result-object v2

    add-int/lit8 v1, v1, -0x1

    :goto_b
    if-ltz v1, :cond_1c

    invoke-virtual {v0, v1}, La/ge;->h(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/animation/Animator;

    if-eqz v4, :cond_1a

    const/4 v13, 0x0

    invoke-virtual {v0, v4, v13}, La/ge;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/transition/e$b;

    if-eqz v5, :cond_1a

    iget-object v7, v5, Landroidx/transition/e$b;->a:Landroid/view/View;

    if-eqz v7, :cond_1a

    iget-object v8, v5, Landroidx/transition/e$b;->d:Landroid/view/WindowId;

    invoke-virtual {v2, v8}, Landroid/view/WindowId;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1a

    move/from16 v8, v16

    invoke-virtual {v6, v7, v8}, Landroidx/transition/e;->r(Landroid/view/View;Z)La/Ff;

    move-result-object v9

    invoke-virtual {v6, v7, v8}, Landroidx/transition/e;->n(Landroid/view/View;Z)La/Ff;

    move-result-object v10

    if-nez v9, :cond_16

    if-nez v10, :cond_16

    iget-object v8, v6, Landroidx/transition/e;->h:La/A2;

    iget-object v8, v8, La/A2;->a:Ljava/lang/Object;

    check-cast v8, La/J1;

    const/4 v13, 0x0

    invoke-virtual {v8, v7, v13}, La/ge;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v10, v7

    check-cast v10, La/Ff;

    goto :goto_c

    :cond_16
    const/4 v13, 0x0

    :goto_c
    if-nez v9, :cond_17

    if-eqz v10, :cond_1b

    :cond_17
    iget-object v7, v5, Landroidx/transition/e$b;->c:La/Ff;

    iget-object v5, v5, Landroidx/transition/e$b;->e:Landroidx/transition/e;

    invoke-virtual {v5, v7, v10}, Landroidx/transition/e;->t(La/Ff;La/Ff;)Z

    move-result v7

    if-eqz v7, :cond_1b

    invoke-virtual {v5}, Landroidx/transition/e;->o()Landroidx/transition/e;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Landroid/animation/Animator;->isRunning()Z

    move-result v5

    if-nez v5, :cond_19

    invoke-virtual {v4}, Landroid/animation/Animator;->isStarted()Z

    move-result v5

    if-eqz v5, :cond_18

    goto :goto_d

    :cond_18
    invoke-virtual {v0, v4}, La/ge;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_e

    :cond_19
    :goto_d
    invoke-virtual {v4}, Landroid/animation/Animator;->cancel()V

    goto :goto_e

    :cond_1a
    const/4 v13, 0x0

    :cond_1b
    :goto_e
    add-int/lit8 v1, v1, -0x1

    const/16 v16, 0x1

    goto :goto_b

    :cond_1c
    iget-object v4, v6, Landroidx/transition/e;->g:La/A2;

    iget-object v5, v6, Landroidx/transition/e;->h:La/A2;

    iget-object v0, v6, Landroidx/transition/e;->k:Ljava/util/ArrayList;

    iget-object v7, v6, Landroidx/transition/e;->l:Ljava/util/ArrayList;

    move-object v2, v6

    move-object v6, v0

    invoke-virtual/range {v2 .. v7}, Landroidx/transition/e;->l(Landroid/widget/FrameLayout;La/A2;La/A2;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-virtual {v2}, Landroidx/transition/e;->A()V

    const/16 v16, 0x1

    return v16
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Landroidx/transition/g$a;->b:Landroid/widget/FrameLayout;

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    sget-object p1, Landroidx/transition/g;->c:Ljava/util/ArrayList;

    iget-object v0, p0, Landroidx/transition/g$a;->b:Landroid/widget/FrameLayout;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-static {}, Landroidx/transition/g;->b()La/J1;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, La/ge;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/transition/e;

    invoke-virtual {v1, v0}, Landroidx/transition/e;->z(Landroid/widget/FrameLayout;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/transition/g$a;->a:Landroidx/transition/e;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/transition/e;->i(Z)V

    return-void
.end method
