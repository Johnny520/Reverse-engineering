.class public final synthetic LMx;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lfj;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, LMx;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v1, p0

    iget v0, v1, LMx;->a:I

    const v2, 0x550a0227

    const-class v3, Landroid/widget/TextView;

    const-class v4, Landroid/view/View;

    const/4 v5, 0x3

    const/4 v7, 0x2

    const/4 v8, -0x1

    const v9, 0x550a022c

    const-wide v10, -0x2f934fffff835L

    const-wide v12, -0x2f91cfffff835L

    const/4 v14, 0x0

    const/4 v15, 0x1

    const v16, 0x1010119

    const/4 v6, 0x0

    sget-object v17, LTC;->a:LTC;

    packed-switch v0, :pswitch_data_0

    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v2, -0x20cb6fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LhG;->a:Lqs;

    invoke-virtual {v0, v14}, Lqs;->C(Ljava/lang/Object;)V

    return-object v17

    :pswitch_0
    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v2, -0x1d781fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LhG;->a:Lqs;

    iget-object v0, v0, Lqs;->b:Ljava/lang/Object;

    const-wide v2, -0x1d78dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/app/Activity;

    sget v2, LcG;->b:I

    const/16 v3, 0x73

    if-eq v2, v3, :cond_0

    const-wide v2, -0x21e94fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    :try_start_0
    new-instance v20, LHv;

    invoke-direct/range {v20 .. v20}, Ljava/lang/Object;-><init>()V

    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-wide v3, -0x21e9cfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    const-wide v3, -0x21ea7fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    invoke-virtual {v2, v6}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    const-wide v3, -0x21ea8fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v14}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    invoke-static {v2, v6}, Lgf;->T(Landroid/app/AlertDialog;Z)V

    const v3, 0x102000b

    invoke-virtual {v2, v3}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object/from16 v19, v3

    check-cast v19, Landroid/widget/TextView;

    invoke-virtual {v2, v8}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v3

    new-instance v18, Lg;

    const/16 v23, 0x4

    move-object/from16 v22, v0

    move-object/from16 v21, v2

    invoke-direct/range {v18 .. v23}, Lg;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v0, v18

    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    sget-object v2, LcG;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LbG;

    iget-object v3, v3, LbG;->a:Ljava/lang/Object;

    if-nez v3, :cond_1

    invoke-static {}, LcG;->d()Landroid/content/SharedPreferences;

    move-result-object v2

    const-wide v3, -0x21ef8fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v15}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Landroid/app/AlertDialog$Builder;

    const v3, 0x103023a

    invoke-direct {v2, v0, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    const-wide v3, -0x1d647fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-wide v2, -0x1d64afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-wide v2, -0x1d662fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v3, LSo;

    invoke-direct {v3, v7}, LSo;-><init>(I)V

    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    invoke-static {v0, v6}, Lgf;->T(Landroid/app/AlertDialog;Z)V

    :catch_0
    :cond_2
    :goto_0
    return-object v17

    :pswitch_1
    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v2, -0x1a8befffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LhG;->a:Lqs;

    iget-object v2, v0, Lqs;->b:Ljava/lang/Object;

    const-wide v3, -0x1d74afffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Landroid/widget/ImageView;

    iget-object v0, v0, Lqs;->c:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    aget-object v0, v0, v6

    const-wide v3, -0x1d708fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    sget-object v3, Lio/github/cherrywechat/application/MainApplication;->a:Lio/github/cherrywechat/application/MainApplication;

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_4
    sget-object v3, Lgf;->p:Landroid/app/Application;

    if-eqz v3, :cond_5

    goto :goto_1

    :cond_5
    invoke-static {}, Landroid/app/AndroidAppHelper;->currentApplication()Landroid/app/Application;

    move-result-object v3

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    :goto_1
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v3, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    const-wide v3, -0x1d738fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x1d7cdfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Ltz;->d0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v9, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    sget-object v3, LbF;->b:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlin/jvm/functions/Function2;

    invoke-interface {v4, v2, v0}, Lkotlin/jvm/functions/Function2;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_6
    :goto_3
    return-object v17

    :pswitch_2
    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v2, -0x1a8cdfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LhG;->a:Lqs;

    iget-object v2, v0, Lqs;->b:Ljava/lang/Object;

    const-wide v3, -0x1a8d9fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Landroid/widget/ImageView;

    iget-object v0, v0, Lqs;->c:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    aget-object v0, v0, v15

    check-cast v0, Landroid/util/AttributeSet;

    if-eqz v0, :cond_a

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-wide v4, -0x1a897fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    filled-new-array/range {v16 .. v16}, [I

    move-result-object v4

    invoke-virtual {v3, v0, v4, v6, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    invoke-virtual {v0, v6, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    if-eqz v3, :cond_9

    sget-object v4, Lio/github/cherrywechat/application/MainApplication;->a:Lio/github/cherrywechat/application/MainApplication;

    if-eqz v4, :cond_7

    goto :goto_4

    :cond_7
    sget-object v4, Lgf;->p:Landroid/app/Application;

    if-eqz v4, :cond_8

    goto :goto_4

    :cond_8
    invoke-static {}, Landroid/app/AndroidAppHelper;->currentApplication()Landroid/app/Application;

    move-result-object v4

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    :goto_4
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v4, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0x1a8a7fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const-wide v4, -0x1a8bcfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Ltz;->d0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v9, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    sget-object v4, LbF;->b:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lkotlin/jvm/functions/Function2;

    invoke-interface {v5, v2, v3}, Lkotlin/jvm/functions/Function2;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_9
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    :cond_a
    return-object v17

    :pswitch_3
    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v2, -0x1a9bcfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LhG;->a:Lqs;

    iget-object v2, v0, Lqs;->b:Ljava/lang/Object;

    const-wide v3, -0x1a848fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Landroid/widget/ImageView;

    iget-object v0, v0, Lqs;->c:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    aget-object v0, v0, v6

    const-wide v3, -0x1a806fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_b

    goto :goto_8

    :cond_b
    sget-object v3, Lio/github/cherrywechat/application/MainApplication;->a:Lio/github/cherrywechat/application/MainApplication;

    if-eqz v3, :cond_c

    goto :goto_6

    :cond_c
    sget-object v3, Lgf;->p:Landroid/app/Application;

    if-eqz v3, :cond_d

    goto :goto_6

    :cond_d
    invoke-static {}, Landroid/app/AndroidAppHelper;->currentApplication()Landroid/app/Application;

    move-result-object v3

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    :goto_6
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v3, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    const-wide v3, -0x1a836fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x1a8cbfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Ltz;->d0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v9, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    sget-object v3, LbF;->b:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlin/jvm/functions/Function2;

    invoke-interface {v4, v2, v0}, Lkotlin/jvm/functions/Function2;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :cond_e
    :goto_8
    return-object v17

    :pswitch_4
    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v2, -0x1a9cbfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LhG;->a:Lqs;

    iget-object v2, v0, Lqs;->b:Ljava/lang/Object;

    const-wide v3, -0x1a9d7fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Landroid/widget/ImageView;

    iget-object v0, v0, Lqs;->c:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    aget-object v0, v0, v15

    check-cast v0, Landroid/util/AttributeSet;

    if-eqz v0, :cond_12

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-wide v4, -0x1a995fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    filled-new-array/range {v16 .. v16}, [I

    move-result-object v4

    invoke-virtual {v3, v0, v4, v6, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    invoke-virtual {v0, v6, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    if-eqz v3, :cond_11

    sget-object v4, Lio/github/cherrywechat/application/MainApplication;->a:Lio/github/cherrywechat/application/MainApplication;

    if-eqz v4, :cond_f

    goto :goto_9

    :cond_f
    sget-object v4, Lgf;->p:Landroid/app/Application;

    if-eqz v4, :cond_10

    goto :goto_9

    :cond_10
    invoke-static {}, Landroid/app/AndroidAppHelper;->currentApplication()Landroid/app/Application;

    move-result-object v4

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    :goto_9
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v4, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0x1a9a5fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const-wide v4, -0x1a9bafffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Ltz;->d0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v9, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    sget-object v4, LbF;->b:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lkotlin/jvm/functions/Function2;

    invoke-interface {v5, v2, v3}, Lkotlin/jvm/functions/Function2;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    :cond_11
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    :cond_12
    return-object v17

    :pswitch_5
    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v2, -0xd97fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    sget-object v2, LaF;->b:LaF;

    invoke-virtual {v2}, LZk;->e()Z

    move-result v2

    if-eqz v2, :cond_19

    :try_start_1
    sget-object v2, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v2, -0xda4fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0xdb9fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, LNx;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    if-lez v2, :cond_19

    const/16 v3, 0x3c

    if-gt v2, v3, :cond_19

    iget-object v0, v0, LhG;->a:Lqs;

    iget-object v0, v0, Lqs;->c:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    array-length v3, v0

    if-ne v3, v15, :cond_14

    :cond_13
    move v15, v6

    goto :goto_b

    :cond_14
    array-length v3, v0

    if-ne v3, v7, :cond_13

    aget-object v3, v0, v6

    instance-of v3, v3, Ljava/lang/String;

    if-eqz v3, :cond_13

    goto :goto_b

    :catch_1
    move-exception v0

    goto :goto_f

    :goto_b
    aget-object v0, v0, v15

    new-instance v3, Lvx;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    instance-of v4, v0, Ljava/lang/Class;

    if-eqz v4, :cond_15

    check-cast v0, Ljava/lang/Class;

    iput-object v0, v3, Lvx;->b:Ljava/io/Serializable;

    goto :goto_d

    :cond_15
    iput-object v0, v3, Lvx;->c:Ljava/lang/Object;

    if-eqz v0, :cond_16

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_c

    :cond_16
    move-object v0, v14

    :goto_c
    iput-object v0, v3, Lvx;->b:Ljava/io/Serializable;

    :goto_d
    sget-object v0, LcG;->a:Ljava/util/LinkedHashMap;

    const-wide v4, -0x21360fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LbG;

    if-eqz v0, :cond_17

    iget-object v0, v0, LbG;->a:Ljava/lang/Object;

    goto :goto_e

    :cond_17
    move-object v0, v14

    :goto_e
    instance-of v4, v0, Ljava/lang/String;

    if-eqz v4, :cond_18

    move-object v14, v0

    check-cast v14, Ljava/lang/String;

    :cond_18
    invoke-virtual {v3, v14}, Lvx;->c(Ljava/lang/String;)V

    mul-int/lit16 v2, v2, 0x3e8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Lvx;->d(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_10

    :goto_f
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_19
    :goto_10
    return-object v17

    :pswitch_6
    move-object/from16 v0, p1

    check-cast v0, LEC;

    const-wide v2, -0x1a680fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LEC;->a:Ljava/lang/String;

    const-wide v2, -0x1a683fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    const-wide v2, -0x1a691fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    goto :goto_11

    :cond_1a
    move v15, v6

    :cond_1b
    :goto_11
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_7
    move-object/from16 v0, p1

    check-cast v0, LEC;

    const-wide v2, -0x1a6ecfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LEC;->c:Ljava/lang/String;

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-wide v2, -0x1a6effffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    return-object v0

    :pswitch_8
    move-object/from16 v0, p1

    check-cast v0, LEC;

    const-wide v2, -0x1a6e9fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-wide v2, v0, LEC;->k:D

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    return-object v0

    :pswitch_9
    move-object/from16 v0, p1

    check-cast v0, [Ljava/lang/Class;

    array-length v2, v0

    if-ne v2, v5, :cond_1c

    aget-object v0, v0, v6

    invoke-static {v0, v4}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1c

    goto :goto_12

    :cond_1c
    move v15, v6

    :goto_12
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_a
    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v4, -0x9985fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LhG;->a:Lqs;

    iget-object v4, v0, Lqs;->b:Ljava/lang/Object;

    const-wide v7, -0x9992fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    check-cast v4, Landroid/widget/TextView;

    if-nez v4, :cond_1d

    goto :goto_13

    :cond_1d
    invoke-virtual {v4, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    :goto_13
    if-eqz v6, :cond_1e

    invoke-virtual {v0, v14}, Lqs;->C(Ljava/lang/Object;)V

    :cond_1e
    return-object v17

    :pswitch_b
    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v4, -0x993bfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LhG;->a:Lqs;

    iget-object v4, v0, Lqs;->b:Ljava/lang/Object;

    const-wide v7, -0x99c8fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    check-cast v4, Landroid/widget/TextView;

    if-nez v4, :cond_1f

    goto :goto_14

    :cond_1f
    invoke-virtual {v4, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    :goto_14
    if-eqz v6, :cond_20

    invoke-virtual {v0, v14}, Lqs;->C(Ljava/lang/Object;)V

    :cond_20
    return-object v17

    :pswitch_c
    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v2, -0x1aac3fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v2, v0, LhG;->a:Lqs;

    invoke-virtual {v2, v14}, Lqs;->C(Ljava/lang/Object;)V

    new-instance v2, LN2;

    const/16 v3, 0x19

    invoke-direct {v2, v3, v0}, LN2;-><init>(ILjava/lang/Object;)V

    const-wide/16 v3, 0x3e8

    invoke-static {v2, v3, v4}, LbA;->b(Ljava/lang/Runnable;J)V

    return-object v17

    :pswitch_d
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v2

    if-eqz v2, :cond_21

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    move-result v0

    if-nez v0, :cond_21

    goto :goto_15

    :cond_21
    move v15, v6

    :goto_15
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_e
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/String;

    const-wide v2, -0x1aa3dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x1aac0fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    xor-int/2addr v0, v15

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_f
    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v2, -0x1aa5ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LhG;->a:Lqs;

    iget-object v0, v0, Lqs;->b:Ljava/lang/Object;

    const-wide v2, -0x1aa6cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/app/Activity;

    const v2, 0x1020002

    invoke-virtual {v0, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/FrameLayout;

    sget-object v3, LXA;->a:Ljava/util/HashMap;

    const-wide v3, -0x1aa26fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_23

    new-instance v4, Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    sget-object v5, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    invoke-virtual {v4, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v4, v3}, Landroid/view/View;->setElevation(F)V

    invoke-virtual {v2, v4, v8, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    invoke-static {v0}, Lcom/gyf/immersionbar/a;->i(Landroid/app/Activity;)Lcom/gyf/immersionbar/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/gyf/immersionbar/a;->d()V

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1e

    if-lt v2, v3, :cond_22

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, LIF;->b(Landroid/view/Window;)Landroid/view/WindowInsetsController;

    move-result-object v0

    if-eqz v0, :cond_23

    invoke-static {}, LS;->u()I

    move-result v2

    invoke-static {v0, v2}, LS;->x(Landroid/view/WindowInsetsController;I)V

    invoke-static {}, LS;->y()I

    move-result v2

    invoke-static {v0, v2}, LS;->x(Landroid/view/WindowInsetsController;I)V

    goto :goto_16

    :cond_22
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    const/high16 v3, 0x4000000

    invoke-virtual {v2, v3, v3}, Landroid/view/Window;->setFlags(II)V

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v2, 0x8000000

    invoke-virtual {v0, v2, v2}, Landroid/view/Window;->setFlags(II)V

    :cond_23
    :goto_16
    return-object v17

    :pswitch_10
    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v2, -0xfa1fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    sget-object v2, Ldy;->b:Ldy;

    invoke-virtual {v2}, LZk;->e()Z

    move-result v2

    if-eqz v2, :cond_24

    iget-object v0, v0, LhG;->a:Lqs;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2}, Lqs;->C(Ljava/lang/Object;)V

    :cond_24
    return-object v17

    :pswitch_11
    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v2, -0x52a3fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LhG;->a:Lqs;

    iget-object v0, v0, Lqs;->c:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    aget-object v2, v0, v6

    aget-object v0, v0, v15

    const-wide v9, -0x52affffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, LiG;

    invoke-direct {v3, v2}, LiG;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v3, v4}, LiG;->i(Ljava/lang/Class;)V

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, LiG;->g([Ljava/lang/Object;)V

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v2, v0}, LiG;->c(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    sget-object v2, LEA;->a:LEA;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->a()Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x515ffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_25

    invoke-static {v0}, Lgf;->o(Landroid/view/ViewGroup;)V

    :cond_25
    const v2, 0x1020016

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-nez v2, :cond_26

    invoke-static {v0, v6}, LGu;->k(Landroid/view/ViewGroup;I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-wide v6, -0x5161fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v3}, LNj;->i(Landroid/content/Context;)Landroid/widget/LinearLayout;

    move-result-object v3

    new-instance v4, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v6, -0x2

    invoke-direct {v4, v8, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v2

    invoke-virtual {v4, v5, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    invoke-virtual {v0, v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_26
    return-object v17

    :pswitch_12
    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v2, -0x52cdfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LhG;->a:Lqs;

    iget-object v0, v0, Lqs;->b:Ljava/lang/Object;

    const-wide v2, -0x52d9fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/app/Activity;

    const v2, 0x102000a

    invoke-virtual {v0, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-wide v3, -0x5293fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v2}, LNj;->i(Landroid/content/Context;)Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    return-object v17

    :pswitch_13
    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v2, -0x1d8b6fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LhG;->a:Lqs;

    iget-object v0, v0, Lqs;->c:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    aget-object v0, v0, v6

    new-instance v2, Lvx;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    instance-of v3, v0, Ljava/lang/Class;

    if-eqz v3, :cond_27

    check-cast v0, Ljava/lang/Class;

    iput-object v0, v2, Lvx;->b:Ljava/io/Serializable;

    goto :goto_17

    :cond_27
    iput-object v0, v2, Lvx;->c:Ljava/lang/Object;

    if-eqz v0, :cond_28

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v14

    :cond_28
    iput-object v14, v2, Lvx;->b:Ljava/io/Serializable;

    :goto_17
    const-wide v3, -0x1c742fffff835L

    invoke-static {v3, v4, v2}, LEy;->b(JLvx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-static {v0}, Lgf;->q(Landroid/view/ViewGroup;)V

    return-object v17

    :pswitch_14
    move-object/from16 v0, p1

    check-cast v0, [Ljava/lang/Class;

    const-wide v2, -0x1d8b0fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    array-length v2, v0

    const/4 v3, 0x6

    if-ne v2, v3, :cond_29

    const/4 v2, 0x5

    aget-object v0, v0, v2

    const-class v2, Ljava/util/List;

    invoke-static {v0, v2}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_29

    goto :goto_18

    :cond_29
    move v15, v6

    :goto_18
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
