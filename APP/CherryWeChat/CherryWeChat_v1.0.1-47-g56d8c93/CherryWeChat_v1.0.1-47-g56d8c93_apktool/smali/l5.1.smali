.class public final synthetic Ll5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ll5;->a:I

    iput-object p2, p0, Ll5;->b:Ljava/lang/Object;

    iput-object p3, p0, Ll5;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LOg;LDA;LEC;)V
    .locals 0

    .line 2
    const/4 p3, 0x7

    iput p3, p0, Ll5;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll5;->b:Ljava/lang/Object;

    iput-object p2, p0, Ll5;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 20

    move-object/from16 v0, p0

    iget v1, v0, Ll5;->a:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v8, 0x1

    iget-object v9, v0, Ll5;->c:Ljava/lang/Object;

    iget-object v10, v0, Ll5;->b:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast v10, Landroid/app/AlertDialog;

    check-cast v9, Landroid/content/Context;

    invoke-virtual {v10}, Landroid/app/Dialog;->dismiss()V

    new-instance v1, Lk3;

    invoke-direct {v1, v9, v5}, Lk3;-><init>(Landroid/content/Context;I)V

    const-wide/16 v2, 0x64

    invoke-static {v1, v2, v3}, LbA;->b(Ljava/lang/Runnable;J)V

    return-void

    :pswitch_0
    check-cast v10, LQC;

    check-cast v9, LDC;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, v10, LQC;->i:J

    sub-long v3, v1, v3

    const-wide/16 v5, 0x12c

    cmp-long v3, v3, v5

    if-ltz v3, :cond_2

    iget-boolean v3, v10, LQC;->j:Z

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, v10, LQC;->k:LDC;

    if-eq v3, v9, :cond_2

    iput-wide v1, v10, LQC;->i:J

    iput-boolean v8, v10, LQC;->j:Z

    iput-object v9, v10, LQC;->k:LDC;

    invoke-virtual {v10}, LQC;->j()V

    iget-object v1, v10, LQC;->f:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v1, :cond_1

    const v2, 0x3f333333    # 0.7f

    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    :cond_1
    iget-object v1, v10, LQC;->f:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    if-eqz v1, :cond_2

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    if-eqz v1, :cond_2

    const-wide/16 v2, 0xc8

    invoke-virtual {v1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, LKC;

    invoke-direct {v2, v10, v7}, LKC;-><init>(LQC;I)V

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->withStartAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, LKC;

    invoke-direct {v2, v10, v8}, LKC;-><init>(LQC;I)V

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->start()V

    :cond_2
    :goto_0
    return-void

    :pswitch_1
    check-cast v10, LQC;

    check-cast v9, Landroid/app/Activity;

    iget-object v1, v10, LQC;->k:LDC;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_4

    if-ne v1, v8, :cond_3

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/String;

    const-wide v11, -0x1b8a0fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v7

    const-wide v11, -0x1b8a3fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v8

    const-wide v11, -0x1b8a7fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v3

    const-wide v11, -0x1b8aafffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v5

    const-wide v11, -0x1b8b0fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v4

    goto :goto_1

    :cond_3
    new-instance v1, LFa;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    :cond_4
    new-array v1, v5, [Ljava/lang/String;

    const-wide v11, -0x1b891fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v7

    const-wide v11, -0x1b894fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v8

    const-wide v11, -0x1b89afffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v3

    :goto_1
    iget-object v2, v10, LQC;->k:LDC;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eqz v2, :cond_a

    if-ne v2, v8, :cond_9

    iget-object v2, v10, LQC;->o:LLC;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eqz v2, :cond_8

    if-eq v2, v8, :cond_7

    if-eq v2, v3, :cond_5

    if-eq v2, v5, :cond_b

    if-eq v2, v4, :cond_6

    :cond_5
    :goto_2
    move v3, v7

    goto :goto_3

    :cond_6
    move v3, v8

    goto :goto_3

    :cond_7
    move v3, v4

    goto :goto_3

    :cond_8
    move v3, v5

    goto :goto_3

    :cond_9
    new-instance v1, LFa;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    :cond_a
    iget-object v2, v10, LQC;->o:LLC;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eqz v2, :cond_6

    if-eq v2, v8, :cond_b

    goto :goto_2

    :cond_b
    :goto_3
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, v9}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-wide v8, -0x1b8b6fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    check-cast v1, [Ljava/lang/CharSequence;

    new-instance v4, LMd;

    invoke-direct {v4, v5, v10}, LMd;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, v1, v3, v4}, Landroid/app/AlertDialog$Builder;->setSingleChoiceItems([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    invoke-static {v1, v7}, Lgf;->T(Landroid/app/AlertDialog;Z)V

    return-void

    :pswitch_2
    check-cast v10, LQC;

    check-cast v9, Landroid/widget/ImageView;

    iget-object v1, v10, LQC;->e:Landroid/widget/EditText;

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-interface {v1}, Landroid/text/Editable;->clear()V

    :cond_c
    invoke-virtual {v9, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void

    :pswitch_3
    check-cast v10, LTA;

    check-cast v9, Lio/github/cherrywechat/network/model/ThemeStoreItem;

    sget-object v1, Lds;->a:Lds;

    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-wide v3, -0x1bc09fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v9}, Lio/github/cherrywechat/network/model/ThemeStoreItem;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v1, 0x3ee

    invoke-static {v2, v1, v3}, Lds;->c(Landroid/content/Context;ILjava/lang/String;)V

    return-void

    :pswitch_4
    check-cast v10, LSA;

    check-cast v9, Landroid/app/Activity;

    invoke-virtual {v10, v9}, LSA;->g(Landroid/app/Activity;)V

    return-void

    :pswitch_5
    check-cast v10, Landroid/app/AlertDialog;

    check-cast v9, Lf;

    sget-object v1, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v1, -0x2ef5efffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v8}, LNx;->c(Ljava/lang/String;Z)V

    invoke-virtual {v10}, Landroid/app/Dialog;->dismiss()V

    invoke-virtual {v9}, Lf;->a()Ljava/lang/Object;

    return-void

    :pswitch_6
    check-cast v10, Landroid/widget/LinearLayout;

    check-cast v9, Ljq;

    const-wide v1, -0x2c77ffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    new-instance v11, Landroid/view/animation/ScaleAnimation;

    const/16 v18, 0x1

    const/high16 v19, 0x3f000000    # 0.5f

    const/high16 v12, 0x3f800000    # 1.0f

    const v13, 0x3f733333    # 0.95f

    const/16 v16, 0x1

    const/high16 v17, 0x3f000000    # 0.5f

    move v14, v12

    move v15, v13

    invoke-direct/range {v11 .. v19}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    const-wide/16 v1, 0x96

    invoke-virtual {v11, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    new-instance v1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {v11, v1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    new-instance v1, Lhq;

    invoke-direct {v1, v10, v9}, Lhq;-><init>(Landroid/widget/LinearLayout;Ljq;)V

    invoke-virtual {v11, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    invoke-virtual {v10, v11}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void

    :pswitch_7
    check-cast v10, Leq;

    check-cast v9, Ljq;

    iget v1, v10, Leq;->a:I

    if-eq v1, v3, :cond_11

    if-eq v1, v4, :cond_10

    const/4 v2, 0x6

    if-eq v1, v2, :cond_f

    if-eq v1, v6, :cond_e

    const/16 v2, 0xa

    if-eq v1, v2, :cond_d

    goto :goto_4

    :cond_d
    sget-object v1, Lds;->a:Lds;

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-wide v3, -0x2eea1fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const/16 v3, 0x3f0

    invoke-static {v1, v2, v3}, Lds;->d(Lds;Landroid/content/Context;I)V

    goto :goto_4

    :cond_e
    sget-object v1, Lds;->a:Lds;

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-wide v3, -0x2ee91fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const/16 v3, 0x3ed

    invoke-static {v1, v2, v3}, Lds;->d(Lds;Landroid/content/Context;I)V

    goto :goto_4

    :cond_f
    sget-object v1, Lds;->a:Lds;

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-wide v3, -0x2ee81fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v9}, Ljq;->getViewId()I

    move-result v3

    invoke-static {v1, v2, v3}, Lds;->d(Lds;Landroid/content/Context;I)V

    goto :goto_4

    :cond_10
    sget-object v1, Lds;->a:Lds;

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-wide v3, -0x2eef1fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const/4 v3, 0x7

    invoke-static {v1, v2, v3}, Lds;->d(Lds;Landroid/content/Context;I)V

    goto :goto_4

    :cond_11
    sget-object v1, Lds;->a:Lds;

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-wide v3, -0x2ed71fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const/16 v3, 0x3eb

    invoke-static {v1, v2, v3}, Lds;->d(Lds;Landroid/content/Context;I)V

    :goto_4
    return-void

    :pswitch_8
    check-cast v10, LRp;

    check-cast v9, Landroid/widget/TextView;

    iget-boolean v1, v10, LRp;->o:Z

    xor-int/lit8 v3, v1, 0x1

    iput-boolean v3, v10, LRp;->o:Z

    if-nez v1, :cond_12

    const-wide v3, -0x1b777fffff835L

    :goto_5
    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    goto :goto_6

    :cond_12
    const-wide v3, -0x1b779fffff835L

    goto :goto_5

    :goto_6
    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v10, LRp;->m:Landroid/widget/LinearLayout;

    if-nez v1, :cond_13

    const-wide v3, -0x1b77bfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    goto :goto_7

    :cond_13
    move-object v2, v1

    :goto_7
    iget-boolean v1, v10, LRp;->o:Z

    if-eqz v1, :cond_14

    move v6, v7

    :cond_14
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    return-void

    :pswitch_9
    check-cast v10, Landroid/app/Activity;

    check-cast v9, LRp;

    sget-object v1, Lio/github/cherrywechat/lua/loader/ScriptManager;->INSTANCE:Lio/github/cherrywechat/lua/loader/ScriptManager;

    invoke-virtual {v1}, Lio/github/cherrywechat/lua/loader/ScriptManager;->getLoadedScripts()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_15

    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, v10}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-wide v3, -0x1b723fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const-wide v3, -0x1b728fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const-wide v3, -0x1b734fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, LLp;

    invoke-direct {v4, v9, v8}, LLp;-><init>(LRp;I)V

    invoke-virtual {v1, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const-wide v3, -0x1b737fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    :cond_15
    return-void

    :pswitch_a
    check-cast v10, LWo;

    check-cast v9, LCA;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, LEA;->a:LEA;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v9, LCA;->a:Ljava/lang/String;

    invoke-static {v2, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-wide v2, -0x4b7dfffff835L

    :goto_8
    invoke-static {v2, v3, v1, v7}, LEy;->k(JLandroid/content/Context;I)V

    goto :goto_9

    :cond_16
    invoke-static {v2}, LEA;->g(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_17

    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-wide v2, -0x4b05fffff835L

    goto :goto_8

    :cond_17
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-wide v2, -0x4b1dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x4b2dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, -0x4b30fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v9, LCA;->b:Ljava/lang/String;

    const v5, 0xff1f

    invoke-static {v3, v4, v5}, Lph;->l(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v3

    new-instance v4, LVo;

    invoke-direct {v4, v8, v10, v9}, LVo;-><init>(ILWo;LCA;)V

    invoke-static {v1, v2, v3, v4, v7}, Lgf;->S(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Z)V

    :goto_9
    return-void

    :pswitch_b
    check-cast v10, Lha;

    check-cast v9, Landroid/widget/ImageView;

    iget-object v1, v10, Lha;->d:Landroid/widget/EditText;

    if-eqz v1, :cond_18

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    if-eqz v1, :cond_18

    invoke-interface {v1}, Landroid/text/Editable;->clear()V

    :cond_18
    invoke-virtual {v9, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void

    :pswitch_c
    check-cast v10, LTi;

    check-cast v9, LRi;

    iget-object v1, v9, LRi;->b:Ljava/lang/String;

    iput-object v1, v10, LTi;->g:Ljava/lang/String;

    invoke-virtual {v10}, LTi;->f()V

    invoke-virtual {v10}, LTi;->a()V

    return-void

    :pswitch_d
    check-cast v10, Landroid/widget/LinearLayout;

    check-cast v9, Lio/github/cherrywechat/network/model/FriendLinkItem;

    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-wide v2, -0x46f0fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v9}, Lio/github/cherrywechat/network/model/FriendLinkItem;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lgf;->U(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :pswitch_e
    check-cast v10, Landroid/widget/TextView;

    check-cast v9, Lio/github/cherrywechat/network/model/FriendLinkItem;

    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-wide v2, -0x46e0fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v9}, Lio/github/cherrywechat/network/model/FriendLinkItem;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lgf;->U(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :pswitch_f
    check-cast v10, Landroid/widget/TextView;

    check-cast v9, LEC;

    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-wide v2, -0x589bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-wide v2, -0x58a5fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/content/ClipboardManager;

    const-wide v2, -0x476bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    iget-object v3, v9, LEC;->p:Ljava/lang/String;

    invoke-static {v2, v3}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-wide v2, -0x4777fffff835L

    invoke-static {v2, v3, v1, v7}, LEy;->k(JLandroid/content/Context;I)V

    return-void

    :pswitch_10
    check-cast v10, LOg;

    check-cast v9, LDA;

    iget-object v1, v9, LDA;->a:Ljava/lang/String;

    invoke-virtual {v10, v1}, LOg;->a(Ljava/lang/String;)V

    return-void

    :pswitch_11
    check-cast v10, Landroid/widget/ScrollView;

    check-cast v9, Landroid/widget/TextView;

    invoke-virtual {v10}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-eqz v1, :cond_19

    goto :goto_a

    :cond_19
    move v8, v7

    :goto_a
    if-eqz v8, :cond_1a

    move v6, v7

    :cond_1a
    invoke-virtual {v10, v6}, Landroid/view/View;->setVisibility(I)V

    if-eqz v8, :cond_1b

    const-wide v1, -0x2fff1fffff835L

    :goto_b
    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    goto :goto_c

    :cond_1b
    const-wide v1, -0x2fffcfffff835L

    goto :goto_b

    :goto_c
    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :pswitch_12
    check-cast v10, LHb;

    check-cast v9, LGb;

    iget-object v1, v9, LGb;->d:LHb;

    if-eq v10, v1, :cond_1d

    iget-object v1, v9, LGb;->b:Lfj;

    if-eqz v1, :cond_1c

    invoke-interface {v1, v10}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1c
    invoke-virtual {v9, v10}, LGb;->a(LHb;)V

    sget-object v1, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v1, -0x1c2cdfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, LNx;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1d
    return-void

    :pswitch_13
    check-cast v10, Landroid/widget/TextView;

    check-cast v9, LBA;

    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-wide v2, -0x5d0bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-wide v2, -0x5d15fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/content/ClipboardManager;

    const-wide v2, -0x5ddbfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    iget-object v3, v9, LBA;->d:Ljava/lang/String;

    invoke-static {v2, v3}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-wide v2, -0x5de7fffff835L

    invoke-static {v2, v3, v1, v7}, LEy;->k(JLandroid/content/Context;I)V

    return-void

    :pswitch_14
    check-cast v10, Lca;

    check-cast v9, Lba;

    iget-object v1, v10, Lca;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v9}, Landroidx/recyclerview/widget/o;->getAdapterPosition()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, v10, Lca;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v9}, Landroidx/recyclerview/widget/o;->getAdapterPosition()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    if-eqz v3, :cond_1e

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    :cond_1e
    xor-int/lit8 v3, v7, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v9}, Landroidx/recyclerview/widget/o;->getAdapterPosition()I

    move-result v1

    invoke-virtual {v10, v1}, Landroidx/recyclerview/widget/g;->notifyItemChanged(I)V

    return-void

    :pswitch_15
    check-cast v10, Lha;

    check-cast v9, Landroid/widget/ImageView;

    iget-object v1, v10, Lha;->d:Landroid/widget/EditText;

    if-eqz v1, :cond_1f

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    if-eqz v1, :cond_1f

    invoke-interface {v1}, Landroid/text/Editable;->clear()V

    :cond_1f
    invoke-virtual {v9, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void

    :pswitch_16
    check-cast v10, Lb8;

    check-cast v9, Landroid/app/Activity;

    invoke-static {}, Lb8;->a()Ljava/util/List;

    move-result-object v1

    sget-object v2, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v2, -0x51fafffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    const/16 v6, 0x3e

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lra;->k0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfj;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LNx;->d(Ljava/lang/String;)V

    invoke-virtual {v10, v9}, Lb8;->e(Landroid/app/Activity;)V

    sget-object v1, LTB;->e:LX7;

    if-eqz v1, :cond_20

    invoke-virtual {v1}, LX7;->c()V

    :cond_20
    return-void

    :pswitch_17
    check-cast v10, Lcom/youth/banner/adapter/BannerAdapter;

    check-cast v9, Landroidx/recyclerview/widget/o;

    move-object/from16 v1, p1

    invoke-static {v10, v9, v1}, Lcom/youth/banner/adapter/BannerAdapter;->b(Lcom/youth/banner/adapter/BannerAdapter;Landroidx/recyclerview/widget/o;Landroid/view/View;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
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
