.class public final Lnd;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/view/ViewGroup;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public d:Z

.field public e:Z


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnd;->a:Landroid/view/ViewGroup;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lnd;->b:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lnd;->c:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a(IILHi;)V
    .locals 3

    iget-object v0, p0, Lnd;->b:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    new-instance v1, LO6;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object v2, p3, LHi;->c:Lhi;

    invoke-virtual {p0, v2}, Lnd;->d(Lhi;)LMy;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2, p1, p2}, LMy;->c(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance v2, LMy;

    invoke-direct {v2, p1, p2, p3, v1}, LMy;-><init>(IILHi;LO6;)V

    iget-object p1, p0, Lnd;->b:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, LLy;

    const/4 p2, 0x0

    invoke-direct {p1, p0, v2, p2}, LLy;-><init>(Lnd;LMy;I)V

    iget-object p2, v2, LMy;->d:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, LLy;

    const/4 p2, 0x1

    invoke-direct {p1, p0, v2, p2}, LLy;-><init>(Lnd;LMy;I)V

    iget-object p2, v2, LMy;->d:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0

    throw p1
.end method

.method public final b(Ljava/util/ArrayList;Z)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v2, p2

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    const-string v6, "Unknown visibility "

    const/16 v7, 0x8

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v10, 0x2

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v11, v4

    check-cast v11, LMy;

    iget-object v12, v11, LMy;->c:Lhi;

    iget-object v12, v12, Lhi;->E:Landroid/view/View;

    invoke-virtual {v12}, Landroid/view/View;->getAlpha()F

    move-result v13

    cmpg-float v13, v13, v9

    if-nez v13, :cond_1

    invoke-virtual {v12}, Landroid/view/View;->getVisibility()I

    move-result v13

    if-nez v13, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v12}, Landroid/view/View;->getVisibility()I

    move-result v12

    if-eqz v12, :cond_3

    if-eq v12, v8, :cond_0

    if-ne v12, v7, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {v12, v6}, Lph;->i(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget v11, v11, LMy;->a:I

    if-eq v11, v10, :cond_0

    goto :goto_1

    :cond_4
    move-object v4, v5

    :goto_1
    move-object v11, v4

    check-cast v11, LMy;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v3

    :cond_5
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v4

    move-object v12, v4

    check-cast v12, LMy;

    iget-object v13, v12, LMy;->c:Lhi;

    iget-object v13, v13, Lhi;->E:Landroid/view/View;

    invoke-virtual {v13}, Landroid/view/View;->getAlpha()F

    move-result v14

    cmpg-float v14, v14, v9

    if-nez v14, :cond_6

    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    move-result v14

    if-nez v14, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    move-result v13

    if-eqz v13, :cond_5

    if-eq v13, v8, :cond_8

    if-ne v13, v7, :cond_7

    goto :goto_2

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {v13, v6}, Lph;->i(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    :goto_2
    iget v12, v12, LMy;->a:I

    if-ne v12, v10, :cond_5

    move-object v5, v4

    :cond_9
    move-object v6, v5

    check-cast v6, LMy;

    invoke-static {v10}, Lzi;->G(I)Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-static {v11}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v6}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_a
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Lra;->l0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LMy;

    iget-object v5, v5, LMy;->c:Lhi;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_b

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LMy;

    iget-object v9, v9, LMy;->c:Lhi;

    iget-object v9, v9, Lhi;->H:Lfi;

    iget-object v12, v5, Lhi;->H:Lfi;

    iget v13, v12, Lfi;->b:I

    iput v13, v9, Lfi;->b:I

    iget v13, v12, Lfi;->c:I

    iput v13, v9, Lfi;->c:I

    iget v13, v12, Lfi;->d:I

    iput v13, v9, Lfi;->d:I

    iget v12, v12, Lfi;->e:I

    iput v12, v9, Lfi;->e:I

    goto :goto_3

    :cond_b
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_15

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LMy;

    new-instance v12, LO6;

    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v5}, LMy;->d()V

    iget-object v13, v5, LMy;->e:Ljava/util/LinkedHashSet;

    invoke-interface {v13, v12}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v14, Ljd;

    invoke-direct {v14, v5, v12, v2}, Ljd;-><init>(LMy;LO6;Z)V

    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v12, LO6;

    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v5}, LMy;->d()V

    invoke-interface {v13, v12}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v13, Lkd;

    if-eqz v2, :cond_d

    if-ne v5, v11, :cond_c

    :goto_5
    const/4 v8, 0x1

    goto :goto_6

    :cond_c
    const/4 v8, 0x0

    goto :goto_6

    :cond_d
    if-ne v5, v6, :cond_c

    goto :goto_5

    :goto_6
    iget-object v9, v5, LMy;->c:Lhi;

    invoke-direct {v13, v5, v12}, LB3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget v12, v5, LMy;->a:I

    if-ne v12, v10, :cond_f

    if-eqz v2, :cond_e

    iget-object v12, v9, Lhi;->H:Lfi;

    goto :goto_7

    :cond_e
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_7

    :cond_f
    if-eqz v2, :cond_10

    iget-object v12, v9, Lhi;->H:Lfi;

    goto :goto_7

    :cond_10
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_7
    iget v12, v5, LMy;->a:I

    if-ne v12, v10, :cond_12

    if-eqz v2, :cond_11

    iget-object v12, v9, Lhi;->H:Lfi;

    goto :goto_8

    :cond_11
    iget-object v12, v9, Lhi;->H:Lfi;

    :cond_12
    :goto_8
    if-eqz v8, :cond_14

    if-eqz v2, :cond_13

    iget-object v8, v9, Lhi;->H:Lfi;

    goto :goto_9

    :cond_13
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_14
    :goto_9
    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v8, Ln3;

    const/4 v9, 0x7

    invoke-direct {v8, v7, v5, v1, v9}, Ln3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iget-object v5, v5, LMy;->d:Ljava/util/ArrayList;

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_15
    new-instance v12, Ljava/util/LinkedHashMap;

    invoke-direct {v12}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_16
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_17

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v13, v5

    check-cast v13, Lkd;

    invoke-virtual {v13}, LB3;->j()Z

    move-result v13

    if-nez v13, :cond_16

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_17
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_18

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lkd;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_b

    :cond_18
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_19

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkd;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_c

    :cond_19
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkd;

    iget-object v4, v2, LB3;->a:Ljava/lang/Object;

    check-cast v4, LMy;

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v12, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, LB3;->d()V

    goto :goto_d

    :cond_1a
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v12, v0}, Ljava/util/LinkedHashMap;->containsValue(Ljava/lang/Object;)Z

    move-result v13

    iget-object v14, v1, Lnd;->a:Landroid/view/ViewGroup;

    invoke-virtual {v14}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v15

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v16

    const/4 v2, 0x0

    :goto_e
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_23

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljd;

    invoke-virtual {v5}, LB3;->j()Z

    move-result v3

    if-eqz v3, :cond_1b

    invoke-virtual {v5}, LB3;->d()V

    :goto_f
    move/from16 v17, v10

    goto :goto_10

    :cond_1b
    invoke-virtual {v5, v15}, Ljd;->o(Landroid/content/Context;)LP3;

    move-result-object v3

    if-nez v3, :cond_1c

    invoke-virtual {v5}, LB3;->d()V

    goto :goto_f

    :cond_1c
    iget-object v3, v3, LP3;->c:Ljava/lang/Object;

    check-cast v3, Landroid/animation/Animator;

    if-nez v3, :cond_1d

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_1d
    iget-object v4, v5, LB3;->a:Ljava/lang/Object;

    check-cast v4, LMy;

    iget-object v8, v4, LMy;->c:Lhi;

    move/from16 v17, v10

    invoke-virtual {v12, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v10, v9}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1f

    invoke-static/range {v17 .. v17}, Lzi;->G(I)Z

    move-result v3

    if-eqz v3, :cond_1e

    invoke-static {v8}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_1e
    invoke-virtual {v5}, LB3;->d()V

    :goto_10
    move/from16 v10, v17

    goto :goto_e

    :cond_1f
    iget v2, v4, LMy;->a:I

    const/4 v9, 0x3

    if-ne v2, v9, :cond_20

    move-object v2, v3

    const/4 v3, 0x1

    goto :goto_11

    :cond_20
    move-object v2, v3

    const/4 v3, 0x0

    :goto_11
    if-eqz v3, :cond_21

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_21
    iget-object v8, v8, Lhi;->E:Landroid/view/View;

    invoke-virtual {v14, v8}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    move-object v9, v0

    new-instance v0, Lld;

    move-object/from16 v18, v8

    move-object v8, v2

    move-object/from16 v2, v18

    invoke-direct/range {v0 .. v5}, Lld;-><init>(Lnd;Landroid/view/View;ZLMy;Ljd;)V

    invoke-virtual {v8, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v8, v2}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    invoke-virtual {v8}, Landroid/animation/Animator;->start()V

    invoke-static/range {v17 .. v17}, Lzi;->G(I)Z

    move-result v0

    if-eqz v0, :cond_22

    invoke-virtual {v4}, LMy;->toString()Ljava/lang/String;

    :cond_22
    iget-object v0, v5, LB3;->b:Ljava/lang/Object;

    check-cast v0, LO6;

    new-instance v2, LQ9;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v8, v4}, LQ9;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, LO6;->a(LN6;)V

    move-object v0, v9

    move/from16 v10, v17

    const/4 v2, 0x1

    goto/16 :goto_e

    :cond_23
    move-object v9, v0

    move/from16 v17, v10

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljd;

    iget-object v4, v3, LB3;->a:Ljava/lang/Object;

    check-cast v4, LMy;

    iget-object v5, v4, LMy;->c:Lhi;

    if-eqz v13, :cond_25

    invoke-static/range {v17 .. v17}, Lzi;->G(I)Z

    move-result v4

    if-eqz v4, :cond_24

    invoke-static {v5}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_24
    invoke-virtual {v3}, LB3;->d()V

    goto :goto_12

    :cond_25
    if-eqz v2, :cond_27

    invoke-static/range {v17 .. v17}, Lzi;->G(I)Z

    move-result v4

    if-eqz v4, :cond_26

    invoke-static {v5}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_26
    invoke-virtual {v3}, LB3;->d()V

    goto :goto_12

    :cond_27
    iget-object v5, v5, Lhi;->E:Landroid/view/View;

    invoke-virtual {v3, v15}, Ljd;->o(Landroid/content/Context;)LP3;

    move-result-object v8

    const-string v9, "Required value was null."

    if-eqz v8, :cond_2b

    iget-object v8, v8, LP3;->b:Ljava/lang/Object;

    check-cast v8, Landroid/view/animation/Animation;

    if-eqz v8, :cond_2a

    iget v9, v4, LMy;->a:I

    const/4 v10, 0x1

    if-eq v9, v10, :cond_28

    invoke-virtual {v5, v8}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    invoke-virtual {v3}, LB3;->d()V

    goto :goto_13

    :cond_28
    invoke-virtual {v14, v5}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    new-instance v9, Lli;

    invoke-direct {v9, v8, v14, v5}, Lli;-><init>(Landroid/view/animation/Animation;Landroid/view/ViewGroup;Landroid/view/View;)V

    new-instance v8, Lmd;

    invoke-direct {v8, v4, v1, v5, v3}, Lmd;-><init>(LMy;Lnd;Landroid/view/View;Ljd;)V

    invoke-virtual {v9, v8}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    invoke-virtual {v5, v9}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    invoke-static/range {v17 .. v17}, Lzi;->G(I)Z

    move-result v8

    if-eqz v8, :cond_29

    invoke-virtual {v4}, LMy;->toString()Ljava/lang/String;

    :cond_29
    :goto_13
    iget-object v8, v3, LB3;->b:Ljava/lang/Object;

    check-cast v8, LO6;

    new-instance v9, Lid;

    invoke-direct {v9, v5, v1, v3, v4}, Lid;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v9}, LO6;->a(LN6;)V

    goto :goto_12

    :cond_2a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2c
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LMy;

    iget-object v3, v2, LMy;->c:Lhi;

    iget-object v3, v3, Lhi;->E:Landroid/view/View;

    iget v2, v2, LMy;->a:I

    invoke-static {v3, v2}, Lph;->a(Landroid/view/View;I)V

    goto :goto_14

    :cond_2d
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    invoke-static/range {v17 .. v17}, Lzi;->G(I)Z

    move-result v0

    if-eqz v0, :cond_2e

    invoke-static {v11}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v6}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_2e
    return-void
.end method

.method public final c()V
    .locals 5

    iget-boolean v0, p0, Lnd;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lnd;->a:Landroid/view/ViewGroup;

    sget-object v1, LlE;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lnd;->e()V

    iput-boolean v1, p0, Lnd;->d:Z

    return-void

    :cond_1
    iget-object v0, p0, Lnd;->b:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v2, p0, Lnd;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    iget-object v2, p0, Lnd;->c:Ljava/util/ArrayList;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v2, p0, Lnd;->c:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LMy;

    const/4 v4, 0x2

    invoke-static {v4}, Lzi;->G(I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_3
    :goto_1
    invoke-virtual {v3}, LMy;->a()V

    iget-boolean v4, v3, LMy;->g:Z

    if-nez v4, :cond_2

    iget-object v4, p0, Lnd;->c:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Lnd;->f()V

    iget-object v2, p0, Lnd;->b:Ljava/util/ArrayList;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v2, p0, Lnd;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    iget-object v2, p0, Lnd;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LMy;

    invoke-virtual {v4}, LMy;->d()V

    goto :goto_2

    :cond_5
    iget-boolean v2, p0, Lnd;->d:Z

    invoke-virtual {p0, v3, v2}, Lnd;->b(Ljava/util/ArrayList;Z)V

    iput-boolean v1, p0, Lnd;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_6
    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0

    throw v1
.end method

.method public final d(Lhi;)LMy;
    .locals 4

    iget-object v0, p0, Lnd;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LMy;

    iget-object v3, v2, LMy;->c:Lhi;

    invoke-static {v3, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-boolean v2, v2, LMy;->f:Z

    if-nez v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, LMy;

    return-object v1
.end method

.method public final e()V
    .locals 6

    iget-object v0, p0, Lnd;->a:Landroid/view/ViewGroup;

    sget-object v1, LlE;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    iget-object v1, p0, Lnd;->b:Ljava/util/ArrayList;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, Lnd;->f()V

    iget-object v2, p0, Lnd;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LMy;

    invoke-virtual {v3}, LMy;->d()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_5

    :cond_0
    iget-object v2, p0, Lnd;->c:Ljava/util/ArrayList;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x2

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LMy;

    invoke-static {v4}, Lzi;->G(I)Z

    move-result v4

    if-eqz v4, :cond_2

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    iget-object v4, p0, Lnd;->a:Landroid/view/ViewGroup;

    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :goto_2
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_2
    invoke-virtual {v3}, LMy;->a()V

    goto :goto_1

    :cond_3
    iget-object v2, p0, Lnd;->b:Ljava/util/ArrayList;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LMy;

    invoke-static {v4}, Lzi;->G(I)Z

    move-result v5

    if-eqz v5, :cond_5

    if-eqz v0, :cond_4

    goto :goto_4

    :cond_4
    iget-object v5, p0, Lnd;->a:Landroid/view/ViewGroup;

    invoke-static {v5}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :goto_4
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_5
    invoke-virtual {v3}, LMy;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :cond_6
    monitor-exit v1

    return-void

    :goto_5
    monitor-exit v1

    throw v0
.end method

.method public final f()V
    .locals 4

    iget-object v0, p0, Lnd;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LMy;

    iget v2, v1, LMy;->b:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    iget-object v2, v1, LMy;->c:Lhi;

    invoke-virtual {v2}, Lhi;->z()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-eqz v2, :cond_2

    const/4 v3, 0x4

    if-eq v2, v3, :cond_2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_1

    const/4 v3, 0x3

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown visibility "

    invoke-static {v2, v1}, Lph;->i(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    const/4 v2, 0x1

    invoke-virtual {v1, v3, v2}, LMy;->c(II)V

    goto :goto_0

    :cond_3
    return-void
.end method
