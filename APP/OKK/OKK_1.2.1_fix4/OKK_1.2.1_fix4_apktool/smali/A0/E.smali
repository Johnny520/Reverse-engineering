.class public final LA0/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, LA0/E;->a:I

    iput-object p2, p0, LA0/E;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 19

    move-object/from16 v0, p0

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    iget-object v7, v0, LA0/E;->b:Ljava/lang/Object;

    iget v8, v0, LA0/E;->a:I

    packed-switch v8, :pswitch_data_0

    check-cast v7, Landroidx/fragment/app/a;

    iput-boolean v6, v7, Landroidx/fragment/app/a;->c:Z

    iget-object v1, v7, Landroidx/fragment/app/a;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-object v2, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M:LL/e;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, LL/e;->f()Z

    move-result v2

    if-eqz v2, :cond_0

    iget v1, v7, Landroidx/fragment/app/a;->b:I

    invoke-virtual {v7, v1}, Landroidx/fragment/app/a;->c(I)V

    goto :goto_0

    :cond_0
    iget v2, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:I

    if-ne v2, v4, :cond_1

    iget v2, v7, Landroidx/fragment/app/a;->b:I

    invoke-virtual {v1, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->C(I)V

    :cond_1
    :goto_0
    return-void

    :pswitch_0
    check-cast v7, Landroidx/appcompat/widget/Toolbar;

    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v1, :cond_2

    iget-object v1, v1, Landroidx/appcompat/widget/ActionMenuView;->s:Lg/i;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lg/i;->f()Z

    :cond_2
    return-void

    :pswitch_1
    check-cast v7, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget-boolean v1, v7, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->f:Z

    if-eqz v1, :cond_3

    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "input_method"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v1, v7, v6}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    iput-boolean v6, v7, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->f:Z

    :cond_3
    return-void

    :pswitch_2
    check-cast v7, Lg/c0;

    iput-object v5, v7, Lg/c0;->l:LA0/E;

    invoke-virtual {v7}, Lg/c0;->drawableStateChanged()V

    return-void

    :pswitch_3
    check-cast v7, Landroidx/fragment/app/i;

    invoke-virtual {v7}, Landroidx/fragment/app/i;->f()V

    throw v5

    :pswitch_4
    check-cast v7, Landroidx/fragment/app/d;

    iget-object v1, v7, Landroidx/fragment/app/d;->k:Landroidx/fragment/app/c;

    invoke-virtual {v1, v5}, Landroidx/fragment/app/c;->onDismiss(Landroid/content/DialogInterface;)V

    return-void

    :pswitch_5
    check-cast v7, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    invoke-virtual {v7}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c0()Z

    return-void

    :pswitch_6
    check-cast v7, Landroidx/recyclerview/widget/RecyclerView;

    iget-object v8, v7, Landroidx/recyclerview/widget/RecyclerView;->F:LU/z;

    if-eqz v8, :cond_e

    check-cast v8, LU/g;

    iget-object v9, v8, LU/g;->h:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v10

    xor-int/2addr v10, v3

    iget-object v11, v8, LU/g;->j:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v12

    xor-int/2addr v12, v3

    iget-object v13, v8, LU/g;->k:Ljava/util/ArrayList;

    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v14

    xor-int/2addr v14, v3

    iget-object v15, v8, LU/g;->i:Ljava/util/ArrayList;

    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v16

    xor-int/lit8 v16, v16, 0x1

    if-nez v10, :cond_4

    if-nez v12, :cond_4

    if-nez v16, :cond_4

    if-nez v14, :cond_4

    goto/16 :goto_6

    :cond_4
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v17

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    iget-wide v1, v8, LU/z;->d:J

    if-nez v18, :cond_d

    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    if-eqz v12, :cond_6

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v2, v8, LU/g;->m:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    new-instance v2, LU/c;

    invoke-direct {v2, v8, v1, v6}, LU/c;-><init>(LU/g;Ljava/util/ArrayList;I)V

    if-nez v10, :cond_5

    invoke-virtual {v2}, LU/c;->run()V

    goto :goto_1

    :cond_5
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LU/f;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v5

    :cond_6
    :goto_1
    if-eqz v14, :cond_8

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v2, v8, LU/g;->n:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v13}, Ljava/util/ArrayList;->clear()V

    new-instance v2, LU/c;

    invoke-direct {v2, v8, v1, v3}, LU/c;-><init>(LU/g;Ljava/util/ArrayList;I)V

    if-nez v10, :cond_7

    invoke-virtual {v2}, LU/c;->run()V

    goto :goto_2

    :cond_7
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LU/e;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v5

    :cond_8
    :goto_2
    if-eqz v16, :cond_e

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1, v15}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v2, v8, LU/g;->l:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v15}, Ljava/util/ArrayList;->clear()V

    new-instance v2, LU/c;

    invoke-direct {v2, v8, v1, v4}, LU/c;-><init>(LU/g;Ljava/util/ArrayList;I)V

    if-nez v10, :cond_a

    if-nez v12, :cond_a

    if-eqz v14, :cond_9

    goto :goto_3

    :cond_9
    invoke-virtual {v2}, LU/c;->run()V

    goto :goto_6

    :cond_a
    :goto_3
    if-eqz v12, :cond_b

    iget-wide v2, v8, LU/z;->e:J

    goto :goto_4

    :cond_b
    const-wide/16 v2, 0x0

    :goto_4
    if-eqz v14, :cond_c

    iget-wide v7, v8, LU/z;->f:J

    goto :goto_5

    :cond_c
    const-wide/16 v7, 0x0

    :goto_5
    invoke-static {v2, v3, v7, v8}, Ljava/lang/Math;->max(JJ)J

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LU/O;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, LD/Q;->a:Ljava/lang/reflect/Field;

    throw v5

    :cond_d
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LU/O;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v5

    :cond_e
    :goto_6
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :pswitch_7
    check-cast v7, LU/j;

    iget v1, v7, LU/j;->v:I

    iget-object v2, v7, LU/j;->u:Landroid/animation/ValueAnimator;

    if-eq v1, v3, :cond_f

    if-eq v1, v4, :cond_10

    goto :goto_7

    :cond_f
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_10
    const/4 v1, 0x3

    iput v1, v7, LU/j;->v:I

    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    new-array v4, v4, [F

    aput v1, v4, v6

    const/4 v1, 0x0

    aput v1, v4, v3

    invoke-virtual {v2, v4}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    const/16 v1, 0x1f4

    int-to-long v3, v1

    invoke-virtual {v2, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->start()V

    :goto_7
    return-void

    :pswitch_8
    check-cast v7, LL/e;

    invoke-virtual {v7, v6}, LL/e;->m(I)V

    return-void

    :pswitch_9
    check-cast v7, LJ/g;

    iget-boolean v1, v7, LJ/g;->o:Z

    if-nez v1, :cond_11

    goto/16 :goto_9

    :cond_11
    iget-boolean v1, v7, LJ/g;->m:Z

    iget-object v2, v7, LJ/g;->a:LJ/a;

    if-eqz v1, :cond_12

    iput-boolean v6, v7, LJ/g;->m:Z

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v3

    iput-wide v3, v2, LJ/a;->e:J

    const-wide/16 v8, -0x1

    iput-wide v8, v2, LJ/a;->g:J

    iput-wide v3, v2, LJ/a;->f:J

    const/high16 v1, 0x3f000000    # 0.5f

    iput v1, v2, LJ/a;->h:F

    :cond_12
    iget-wide v3, v2, LJ/a;->g:J

    const-wide/16 v8, 0x0

    cmp-long v1, v3, v8

    if-lez v1, :cond_13

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v3

    iget-wide v8, v2, LJ/a;->g:J

    iget v1, v2, LJ/a;->i:I

    int-to-long v10, v1

    add-long/2addr v8, v10

    cmp-long v1, v3, v8

    if-lez v1, :cond_13

    goto :goto_8

    :cond_13
    invoke-virtual {v7}, LJ/g;->e()Z

    move-result v1

    if-nez v1, :cond_14

    :goto_8
    iput-boolean v6, v7, LJ/g;->o:Z

    goto :goto_9

    :cond_14
    iget-boolean v1, v7, LJ/g;->n:Z

    iget-object v3, v7, LJ/g;->c:Landroid/view/View;

    if-eqz v1, :cond_15

    iput-boolean v6, v7, LJ/g;->n:Z

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v10

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/4 v12, 0x3

    const/4 v13, 0x0

    move-wide v8, v10

    invoke-static/range {v8 .. v15}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    :cond_15
    iget-wide v4, v2, LJ/a;->f:J

    const-wide/16 v8, 0x0

    cmp-long v1, v4, v8

    if-eqz v1, :cond_16

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, LJ/a;->a(J)F

    move-result v1

    const/high16 v6, -0x3f800000    # -4.0f

    mul-float/2addr v6, v1

    mul-float/2addr v6, v1

    const/high16 v8, 0x40800000    # 4.0f

    mul-float/2addr v1, v8

    add-float/2addr v1, v6

    iget-wide v8, v2, LJ/a;->f:J

    sub-long v8, v4, v8

    iput-wide v4, v2, LJ/a;->f:J

    long-to-float v4, v8

    mul-float/2addr v4, v1

    iget v1, v2, LJ/a;->d:F

    mul-float/2addr v4, v1

    float-to-int v1, v4

    iget-object v2, v7, LJ/g;->q:Landroid/widget/ListView;

    invoke-virtual {v2, v1}, Landroid/widget/AbsListView;->scrollListBy(I)V

    sget-object v1, LD/Q;->a:Ljava/lang/reflect/Field;

    invoke-virtual {v3, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    :goto_9
    return-void

    :cond_16
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Cannot compute scroll delta before calling start()"

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_a
    check-cast v7, Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, v7, Lcom/google/android/material/textfield/TextInputLayout;->c:LA0/u;

    iget-object v1, v1, LA0/u;->g:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v1}, Landroid/view/View;->performClick()Z

    invoke-virtual {v1}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
