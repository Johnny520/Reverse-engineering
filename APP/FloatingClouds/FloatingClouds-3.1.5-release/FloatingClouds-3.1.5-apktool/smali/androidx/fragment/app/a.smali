.class public final Landroidx/fragment/app/a;
.super Landroidx/fragment/app/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/a$a;,
        Landroidx/fragment/app/a$b;,
        Landroidx/fragment/app/a$c;,
        Landroidx/fragment/app/a$d;,
        Landroidx/fragment/app/a$e;,
        Landroidx/fragment/app/a$f;,
        Landroidx/fragment/app/a$g;
    }
.end annotation


# virtual methods
.method public final b(Ljava/util/ArrayList;Z)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    sget-object v5, Landroidx/fragment/app/f$c$b;->c:Landroidx/fragment/app/f$c$b;

    sget-object v6, Landroidx/fragment/app/f$c$b;->b:Landroidx/fragment/app/f$c$b;

    sget-object v7, Landroidx/fragment/app/f$c$b;->d:Landroidx/fragment/app/f$c$b;

    const-string v9, "Unknown visibility "

    const/16 v10, 0x8

    const/4 v11, 0x4

    const/4 v12, 0x0

    const-string v13, "operation.fragment.mView"

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v14, v4

    check-cast v14, Landroidx/fragment/app/f$c;

    iget-object v15, v14, Landroidx/fragment/app/f$c;->c:Landroidx/fragment/app/b;

    iget-object v15, v15, Landroidx/fragment/app/b;->G:Landroid/view/View;

    invoke-static {v15, v13}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v15}, Landroid/view/View;->getAlpha()F

    move-result v16

    cmpg-float v16, v16, v12

    if-nez v16, :cond_2

    invoke-virtual {v15}, Landroid/view/View;->getVisibility()I

    move-result v16

    if-nez v16, :cond_2

    :cond_1
    move-object v15, v7

    goto :goto_0

    :cond_2
    invoke-virtual {v15}, Landroid/view/View;->getVisibility()I

    move-result v15

    if-eqz v15, :cond_4

    if-eq v15, v11, :cond_1

    if-ne v15, v10, :cond_3

    move-object v15, v5

    goto :goto_0

    :cond_3
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-static {v9, v15}, La/z;->e(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    move-object v15, v6

    :goto_0
    if-ne v15, v6, :cond_0

    iget-object v14, v14, Landroidx/fragment/app/f$c;->a:Landroidx/fragment/app/f$c$b;

    if-eq v14, v6, :cond_0

    goto :goto_1

    :cond_5
    const/4 v4, 0x0

    :goto_1
    check-cast v4, Landroidx/fragment/app/f$c;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v3

    :cond_6
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v14

    if-eqz v14, :cond_b

    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v14

    move-object v15, v14

    check-cast v15, Landroidx/fragment/app/f$c;

    iget-object v8, v15, Landroidx/fragment/app/f$c;->c:Landroidx/fragment/app/b;

    iget-object v8, v8, Landroidx/fragment/app/b;->G:Landroid/view/View;

    invoke-static {v8, v13}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8}, Landroid/view/View;->getAlpha()F

    move-result v17

    cmpg-float v17, v17, v12

    if-nez v17, :cond_8

    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v17

    if-nez v17, :cond_8

    :cond_7
    move-object v8, v7

    goto :goto_2

    :cond_8
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v8

    if-eqz v8, :cond_a

    if-eq v8, v11, :cond_7

    if-ne v8, v10, :cond_9

    move-object v8, v5

    goto :goto_2

    :cond_9
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-static {v9, v8}, La/z;->e(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    move-object v8, v6

    :goto_2
    if-eq v8, v6, :cond_6

    iget-object v8, v15, Landroidx/fragment/app/f$c;->a:Landroidx/fragment/app/f$c$b;

    if-ne v8, v6, :cond_6

    move-object v8, v14

    goto :goto_3

    :cond_b
    const/4 v8, 0x0

    :goto_3
    check-cast v8, Landroidx/fragment/app/f$c;

    const/4 v3, 0x2

    invoke-static {v3}, La/e7;->J(I)Z

    move-result v7

    const-string v9, "FragmentManager"

    if-eqz v7, :cond_c

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v10, "Executing operations from "

    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v10, " to "

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v9, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_c
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_27

    invoke-static {v1}, La/o3;->c0(Ljava/util/List;)I

    move-result v11

    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/fragment/app/f$c;

    iget-object v11, v11, Landroidx/fragment/app/f$c;->c:Landroidx/fragment/app/b;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_d

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroidx/fragment/app/f$c;

    iget-object v13, v13, Landroidx/fragment/app/f$c;->c:Landroidx/fragment/app/b;

    iget-object v13, v13, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    iget-object v14, v11, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    iget v15, v14, Landroidx/fragment/app/b$d;->b:I

    iput v15, v13, Landroidx/fragment/app/b$d;->b:I

    iget v15, v14, Landroidx/fragment/app/b$d;->c:I

    iput v15, v13, Landroidx/fragment/app/b$d;->c:I

    iget v15, v14, Landroidx/fragment/app/b$d;->d:I

    iput v15, v13, Landroidx/fragment/app/b$d;->d:I

    iget v14, v14, Landroidx/fragment/app/b$d;->e:I

    iput v14, v13, Landroidx/fragment/app/b$d;->e:I

    goto :goto_4

    :cond_d
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eqz v11, :cond_17

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/fragment/app/f$c;

    new-instance v14, Landroidx/fragment/app/a$b;

    invoke-direct {v14, v11, v2}, Landroidx/fragment/app/a$b;-><init>(Landroidx/fragment/app/f$c;Z)V

    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v14, Landroidx/fragment/app/a$g;

    if-eqz v2, :cond_e

    if-ne v11, v4, :cond_f

    :goto_6
    move v12, v13

    goto :goto_7

    :cond_e
    if-ne v11, v8, :cond_f

    goto :goto_6

    :cond_f
    :goto_7
    invoke-direct {v14, v11}, Landroidx/fragment/app/a$f;-><init>(Landroidx/fragment/app/f$c;)V

    iget-object v13, v11, Landroidx/fragment/app/f$c;->a:Landroidx/fragment/app/f$c$b;

    iget-object v15, v11, Landroidx/fragment/app/f$c;->c:Landroidx/fragment/app/b;

    if-ne v13, v6, :cond_11

    if-eqz v2, :cond_10

    iget-object v13, v15, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    goto :goto_8

    :cond_10
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_8

    :cond_11
    if-eqz v2, :cond_12

    iget-object v13, v15, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    goto :goto_8

    :cond_12
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_8
    iget-object v13, v11, Landroidx/fragment/app/f$c;->a:Landroidx/fragment/app/f$c$b;

    if-ne v13, v6, :cond_14

    if-eqz v2, :cond_13

    iget-object v13, v15, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    goto :goto_9

    :cond_13
    iget-object v13, v15, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    :cond_14
    :goto_9
    if-eqz v12, :cond_16

    if-eqz v2, :cond_15

    iget-object v12, v15, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    goto :goto_a

    :cond_15
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_16
    :goto_a
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v12, La/P0;

    const/4 v13, 0x4

    invoke-direct {v12, v0, v13, v11}, La/P0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    iget-object v11, v11, Landroidx/fragment/app/f$c;->d:Ljava/util/ArrayList;

    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_17
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_18
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_19

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Landroidx/fragment/app/a$g;

    invoke-virtual {v6}, Landroidx/fragment/app/a$f;->a()Z

    move-result v6

    if-nez v6, :cond_18

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_19
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/a$g;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_c

    :cond_1a
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/a$g;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_d

    :cond_1b
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/fragment/app/a$b;

    iget-object v6, v6, Landroidx/fragment/app/a$f;->a:Landroidx/fragment/app/f$c;

    iget-object v6, v6, Landroidx/fragment/app/f$c;->k:Ljava/util/ArrayList;

    invoke-static {v2, v6}, La/s3;->h0(Ljava/util/AbstractCollection;Ljava/util/Collection;)V

    goto :goto_e

    :cond_1c
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v6, v12

    :cond_1d
    :goto_f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_22

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/fragment/app/a$b;

    iget-object v8, v0, Landroidx/fragment/app/f;->a:Landroid/view/ViewGroup;

    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    iget-object v10, v7, Landroidx/fragment/app/a$f;->a:Landroidx/fragment/app/f$c;

    const-string v11, "context"

    invoke-static {v8, v11}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v8}, Landroidx/fragment/app/a$b;->b(Landroid/content/Context;)Landroidx/fragment/app/c$a;

    move-result-object v8

    if-nez v8, :cond_1e

    goto :goto_f

    :cond_1e
    iget-object v8, v8, Landroidx/fragment/app/c$a;->b:Landroid/animation/AnimatorSet;

    if-nez v8, :cond_1f

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_1f
    iget-object v8, v10, Landroidx/fragment/app/f$c;->c:Landroidx/fragment/app/b;

    iget-object v11, v10, Landroidx/fragment/app/f$c;->k:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_20

    invoke-static {v3}, La/e7;->J(I)Z

    move-result v7

    if-eqz v7, :cond_1d

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v10, "Ignoring Animator set on "

    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, " as this Fragment was involved in a Transition."

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v9, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_f

    :cond_20
    iget-object v6, v10, Landroidx/fragment/app/f$c;->a:Landroidx/fragment/app/f$c$b;

    if-ne v6, v5, :cond_21

    iput-boolean v12, v10, Landroidx/fragment/app/f$c;->i:Z

    :cond_21
    new-instance v6, Landroidx/fragment/app/a$c;

    invoke-direct {v6, v7}, Landroidx/fragment/app/a$c;-><init>(Landroidx/fragment/app/a$b;)V

    iget-object v7, v10, Landroidx/fragment/app/f$c;->j:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v6, v13

    goto :goto_f

    :cond_22
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_23
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_26

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/a$b;

    iget-object v5, v4, Landroidx/fragment/app/a$f;->a:Landroidx/fragment/app/f$c;

    iget-object v7, v5, Landroidx/fragment/app/f$c;->c:Landroidx/fragment/app/b;

    const-string v8, "Ignoring Animation set on "

    if-nez v2, :cond_24

    invoke-static {v3}, La/e7;->J(I)Z

    move-result v4

    if-eqz v4, :cond_23

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " as Animations cannot run alongside Transitions."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v9, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_10

    :cond_24
    if-eqz v6, :cond_25

    invoke-static {v3}, La/e7;->J(I)Z

    move-result v4

    if-eqz v4, :cond_23

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " as Animations cannot run alongside Animators."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v9, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_10

    :cond_25
    new-instance v7, Landroidx/fragment/app/a$a;

    invoke-direct {v7, v4}, Landroidx/fragment/app/a$a;-><init>(Landroidx/fragment/app/a$b;)V

    iget-object v4, v5, Landroidx/fragment/app/f$c;->j:Ljava/util/ArrayList;

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_10

    :cond_26
    return-void

    :cond_27
    new-instance v1, Ljava/util/NoSuchElementException;

    const-string v2, "List is empty."

    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
