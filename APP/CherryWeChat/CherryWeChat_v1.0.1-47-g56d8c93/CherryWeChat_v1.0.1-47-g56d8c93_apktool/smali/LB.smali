.class public final LLB;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public a:LIB;

.field public b:Landroid/view/ViewGroup;


# virtual methods
.method public final onPreDraw()Z
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, LLB;->a:LIB;

    iget-object v2, v0, LLB;->b:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    sget-object v3, LMB;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v3

    const/4 v7, 0x1

    if-nez v3, :cond_0

    return v7

    :cond_0
    invoke-static {}, LMB;->b()LM4;

    move-result-object v3

    invoke-virtual {v3, v2}, Lsy;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    if-nez v4, :cond_2

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3, v2, v4}, Lsy;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const/4 v6, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-lez v6, :cond_1

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :goto_0
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, LKB;

    invoke-direct {v4, v0, v3}, LKB;-><init>(LLB;LM4;)V

    invoke-virtual {v1, v4}, LIB;->a(LHB;)V

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, LIB;->h(Landroid/view/ViewGroup;Z)V

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LIB;

    invoke-virtual {v6, v2}, LIB;->y(Landroid/view/View;)V

    goto :goto_1

    :cond_3
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, LIB;->k:Ljava/util/ArrayList;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, LIB;->l:Ljava/util/ArrayList;

    iget-object v4, v1, LIB;->g:Lqs;

    iget-object v6, v1, LIB;->h:Lqs;

    new-instance v8, LM4;

    iget-object v9, v4, Lqs;->a:Ljava/lang/Object;

    check-cast v9, LM4;

    invoke-direct {v8, v9}, LM4;-><init>(LM4;)V

    new-instance v9, LM4;

    iget-object v10, v6, Lqs;->a:Ljava/lang/Object;

    check-cast v10, LM4;

    invoke-direct {v9, v10}, LM4;-><init>(LM4;)V

    move v10, v3

    :goto_2
    iget-object v11, v1, LIB;->j:[I

    array-length v12, v11

    if-ge v10, v12, :cond_f

    aget v11, v11, v10

    if-eq v11, v7, :cond_c

    const/4 v12, 0x2

    if-eq v11, v12, :cond_a

    const/4 v12, 0x3

    if-eq v11, v12, :cond_8

    const/4 v12, 0x4

    if-eq v11, v12, :cond_4

    move-object v5, v6

    move/from16 v18, v7

    goto/16 :goto_9

    :cond_4
    iget-object v11, v4, Lqs;->c:Ljava/lang/Object;

    check-cast v11, Lvp;

    iget-object v12, v6, Lqs;->c:Ljava/lang/Object;

    check-cast v12, Lvp;

    invoke-virtual {v11}, Lvp;->g()I

    move-result v13

    move v14, v3

    :goto_3
    if-ge v14, v13, :cond_7

    invoke-virtual {v11, v14}, Lvp;->h(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroid/view/View;

    if-eqz v15, :cond_6

    invoke-virtual {v1, v15}, LIB;->t(Landroid/view/View;)Z

    move-result v16

    if-eqz v16, :cond_6

    move-object/from16 v17, v6

    invoke-virtual {v11, v14}, Lvp;->d(I)J

    move-result-wide v5

    invoke-virtual {v12, v5, v6}, Lvp;->b(J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View;

    if-eqz v5, :cond_5

    invoke-virtual {v1, v5}, LIB;->t(Landroid/view/View;)Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v8, v15}, Lsy;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LPB;

    invoke-virtual {v9, v5}, Lsy;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v3, v18

    check-cast v3, LPB;

    if-eqz v6, :cond_5

    if-eqz v3, :cond_5

    move/from16 v18, v7

    iget-object v7, v1, LIB;->k:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v6, v1, LIB;->l:Ljava/util/ArrayList;

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v8, v15}, Lsy;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v9, v5}, Lsy;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_5
    :goto_4
    move/from16 v18, v7

    goto :goto_5

    :cond_6
    move-object/from16 v17, v6

    goto :goto_4

    :goto_5
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v6, v17

    move/from16 v7, v18

    const/4 v3, 0x0

    goto :goto_3

    :cond_7
    move/from16 v18, v7

    move-object v5, v6

    goto/16 :goto_9

    :cond_8
    move-object/from16 v17, v6

    move/from16 v18, v7

    iget-object v3, v4, Lqs;->b:Ljava/lang/Object;

    check-cast v3, Landroid/util/SparseArray;

    move-object/from16 v5, v17

    iget-object v6, v5, Lqs;->b:Ljava/lang/Object;

    check-cast v6, Landroid/util/SparseArray;

    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v7

    const/4 v11, 0x0

    :goto_6
    if-ge v11, v7, :cond_e

    invoke-virtual {v3, v11}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/view/View;

    if-eqz v12, :cond_9

    invoke-virtual {v1, v12}, LIB;->t(Landroid/view/View;)Z

    move-result v13

    if-eqz v13, :cond_9

    invoke-virtual {v3, v11}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v13

    invoke-virtual {v6, v13}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/view/View;

    if-eqz v13, :cond_9

    invoke-virtual {v1, v13}, LIB;->t(Landroid/view/View;)Z

    move-result v14

    if-eqz v14, :cond_9

    invoke-virtual {v8, v12}, Lsy;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LPB;

    invoke-virtual {v9, v13}, Lsy;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, LPB;

    if-eqz v14, :cond_9

    if-eqz v15, :cond_9

    iget-object v0, v1, LIB;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v1, LIB;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v8, v12}, Lsy;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v9, v13}, Lsy;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v0, p0

    goto :goto_6

    :cond_a
    move-object v5, v6

    move/from16 v18, v7

    iget-object v0, v4, Lqs;->d:Ljava/lang/Object;

    check-cast v0, LM4;

    iget-object v3, v5, Lqs;->d:Ljava/lang/Object;

    check-cast v3, LM4;

    iget v6, v0, Lsy;->c:I

    const/4 v7, 0x0

    :goto_7
    if-ge v7, v6, :cond_e

    invoke-virtual {v0, v7}, Lsy;->j(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/view/View;

    if-eqz v11, :cond_b

    invoke-virtual {v1, v11}, LIB;->t(Landroid/view/View;)Z

    move-result v12

    if-eqz v12, :cond_b

    invoke-virtual {v0, v7}, Lsy;->f(I)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v3, v12}, Lsy;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/view/View;

    if-eqz v12, :cond_b

    invoke-virtual {v1, v12}, LIB;->t(Landroid/view/View;)Z

    move-result v13

    if-eqz v13, :cond_b

    invoke-virtual {v8, v11}, Lsy;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LPB;

    invoke-virtual {v9, v12}, Lsy;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LPB;

    if-eqz v13, :cond_b

    if-eqz v14, :cond_b

    iget-object v15, v1, LIB;->k:Ljava/util/ArrayList;

    invoke-virtual {v15, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v13, v1, LIB;->l:Ljava/util/ArrayList;

    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v8, v11}, Lsy;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v9, v12}, Lsy;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    add-int/lit8 v7, v7, 0x1

    goto :goto_7

    :cond_c
    move-object v5, v6

    move/from16 v18, v7

    iget v0, v8, Lsy;->c:I

    add-int/lit8 v0, v0, -0x1

    :goto_8
    if-ltz v0, :cond_e

    invoke-virtual {v8, v0}, Lsy;->f(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_d

    invoke-virtual {v1, v3}, LIB;->t(Landroid/view/View;)Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-virtual {v9, v3}, Lsy;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LPB;

    if-eqz v3, :cond_d

    iget-object v6, v3, LPB;->b:Landroid/view/View;

    invoke-virtual {v1, v6}, LIB;->t(Landroid/view/View;)Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-virtual {v8, v0}, Lsy;->h(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LPB;

    iget-object v7, v1, LIB;->k:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v6, v1, LIB;->l:Ljava/util/ArrayList;

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_d
    add-int/lit8 v0, v0, -0x1

    goto :goto_8

    :cond_e
    :goto_9
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v0, p0

    move-object v6, v5

    move/from16 v7, v18

    const/4 v3, 0x0

    goto/16 :goto_2

    :cond_f
    move/from16 v18, v7

    const/4 v0, 0x0

    :goto_a
    iget v3, v8, Lsy;->c:I

    if-ge v0, v3, :cond_11

    invoke-virtual {v8, v0}, Lsy;->j(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LPB;

    iget-object v4, v3, LPB;->b:Landroid/view/View;

    invoke-virtual {v1, v4}, LIB;->t(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_10

    iget-object v4, v1, LIB;->k:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, v1, LIB;->l:Ljava/util/ArrayList;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_10
    add-int/lit8 v0, v0, 0x1

    goto :goto_a

    :cond_11
    const/4 v3, 0x0

    :goto_b
    iget v0, v9, Lsy;->c:I

    if-ge v3, v0, :cond_13

    invoke-virtual {v9, v3}, Lsy;->j(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LPB;

    iget-object v4, v0, LPB;->b:Landroid/view/View;

    invoke-virtual {v1, v4}, LIB;->t(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_12

    iget-object v4, v1, LIB;->l:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v1, LIB;->k:Ljava/util/ArrayList;

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_12
    const/4 v4, 0x0

    :goto_c
    add-int/lit8 v3, v3, 0x1

    goto :goto_b

    :cond_13
    invoke-static {}, LIB;->p()LM4;

    move-result-object v0

    iget v3, v0, Lsy;->c:I

    invoke-virtual {v2}, Landroid/view/View;->getWindowId()Landroid/view/WindowId;

    move-result-object v4

    add-int/lit8 v3, v3, -0x1

    :goto_d
    if-ltz v3, :cond_19

    invoke-virtual {v0, v3}, Lsy;->f(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/animation/Animator;

    if-eqz v5, :cond_18

    invoke-virtual {v0, v5}, Lsy;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LGB;

    if-eqz v6, :cond_18

    iget-object v7, v6, LGB;->e:LIB;

    iget-object v8, v6, LGB;->a:Landroid/view/View;

    if-eqz v8, :cond_18

    iget-object v9, v6, LGB;->d:Landroid/view/WindowId;

    invoke-virtual {v4, v9}, Landroid/view/WindowId;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_18

    iget-object v6, v6, LGB;->c:LPB;

    move/from16 v9, v18

    invoke-virtual {v1, v8, v9}, LIB;->r(Landroid/view/View;Z)LPB;

    move-result-object v10

    invoke-virtual {v1, v8, v9}, LIB;->n(Landroid/view/View;Z)LPB;

    move-result-object v11

    if-nez v10, :cond_14

    if-nez v11, :cond_14

    iget-object v9, v1, LIB;->h:Lqs;

    iget-object v9, v9, Lqs;->a:Ljava/lang/Object;

    check-cast v9, LM4;

    invoke-virtual {v9, v8}, Lsy;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v11, v8

    check-cast v11, LPB;

    :cond_14
    if-nez v10, :cond_15

    if-eqz v11, :cond_18

    :cond_15
    invoke-virtual {v7, v6, v11}, LIB;->s(LPB;LPB;)Z

    move-result v6

    if-eqz v6, :cond_18

    invoke-virtual {v7}, LIB;->o()LIB;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Landroid/animation/Animator;->isRunning()Z

    move-result v6

    if-nez v6, :cond_17

    invoke-virtual {v5}, Landroid/animation/Animator;->isStarted()Z

    move-result v6

    if-eqz v6, :cond_16

    goto :goto_e

    :cond_16
    invoke-virtual {v0, v5}, Lsy;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_f

    :cond_17
    :goto_e
    invoke-virtual {v5}, Landroid/animation/Animator;->cancel()V

    :cond_18
    :goto_f
    add-int/lit8 v3, v3, -0x1

    const/16 v18, 0x1

    goto :goto_d

    :cond_19
    iget-object v3, v1, LIB;->g:Lqs;

    iget-object v4, v1, LIB;->h:Lqs;

    iget-object v5, v1, LIB;->k:Ljava/util/ArrayList;

    iget-object v6, v1, LIB;->l:Ljava/util/ArrayList;

    invoke-virtual/range {v1 .. v6}, LIB;->l(Landroid/view/ViewGroup;Lqs;Lqs;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-virtual {v1}, LIB;->z()V

    const/16 v18, 0x1

    return v18
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, LLB;->b:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    sget-object v0, LMB;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-static {}, LMB;->b()LM4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lsy;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LIB;

    invoke-virtual {v1, p1}, LIB;->y(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LLB;->a:LIB;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LIB;->i(Z)V

    return-void
.end method
