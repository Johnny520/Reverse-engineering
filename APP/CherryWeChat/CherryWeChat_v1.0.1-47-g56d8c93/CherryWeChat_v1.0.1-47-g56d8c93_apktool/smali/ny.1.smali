.class public final Lny;
.super LOz;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic e:I

.field public f:Ljava/lang/Object;

.field public g:I

.field public final synthetic h:LWk;


# direct methods
.method public constructor <init>(Ljava/lang/String;LRp;LEb;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lny;->e:I

    .line 2
    iput-object p1, p0, Lny;->f:Ljava/lang/Object;

    iput-object p2, p0, Lny;->h:LWk;

    invoke-direct {p0, p3}, LOz;-><init>(LEb;)V

    return-void
.end method

.method public synthetic constructor <init>(Loy;LEb;I)V
    .locals 0

    .line 1
    iput p3, p0, Lny;->e:I

    iput-object p1, p0, Lny;->h:LWk;

    invoke-direct {p0, p2}, LOz;-><init>(LEb;)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lny;->e:I

    check-cast p1, Lfc;

    check-cast p2, LEb;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p2, p1}, Lny;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, Lny;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, Lny;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lny;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, Lny;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, Lny;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p2, p1}, Lny;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, Lny;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, Lny;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h(LEb;Ljava/lang/Object;)LEb;
    .locals 2

    iget p2, p0, Lny;->e:I

    packed-switch p2, :pswitch_data_0

    new-instance p2, Lny;

    iget-object v0, p0, Lny;->f:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lny;->h:LWk;

    check-cast v1, LRp;

    invoke-direct {p2, v0, v1, p1}, Lny;-><init>(Ljava/lang/String;LRp;LEb;)V

    return-object p2

    :pswitch_0
    new-instance p2, Lny;

    iget-object v0, p0, Lny;->h:LWk;

    check-cast v0, Loy;

    const/4 v1, 0x1

    invoke-direct {p2, v0, p1, v1}, Lny;-><init>(Loy;LEb;I)V

    return-object p2

    :pswitch_1
    new-instance p2, Lny;

    iget-object v0, p0, Lny;->h:LWk;

    check-cast v0, Loy;

    const/4 v1, 0x0

    invoke-direct {p2, v0, p1, v1}, Lny;-><init>(Loy;LEb;I)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v1, p0

    iget v0, v1, Lny;->e:I

    const/4 v2, 0x4

    sget-object v3, LTC;->a:LTC;

    sget-object v4, Lgc;->a:Lgc;

    const/4 v5, 0x0

    const/4 v6, 0x1

    iget-object v7, v1, Lny;->h:LWk;

    const/4 v8, 0x0

    const/4 v9, 0x2

    packed-switch v0, :pswitch_data_0

    move-object v12, v7

    check-cast v12, LRp;

    iget v0, v1, Lny;->g:I

    if-eqz v0, :cond_2

    if-eq v0, v6, :cond_1

    if-ne v0, v9, :cond_0

    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-wide v2, -0x76b1fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :try_start_0
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sget-object v0, Lio/github/cherrywechat/lua/LuaEngine;->INSTANCE:Lio/github/cherrywechat/lua/LuaEngine;

    iget-object v10, v1, Lny;->f:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v0, v10}, Lio/github/cherrywechat/lua/LuaEngine;->execute-IoAF18A(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    sub-long/2addr v13, v7

    sget-object v0, Lhe;->a:Lhd;

    sget-object v0, LZp;->a:Lnk;

    new-instance v10, LQp;

    const/4 v15, 0x0

    invoke-direct/range {v10 .. v15}, LQp;-><init>(Ljava/lang/Object;LRp;JLEb;)V

    iput v6, v1, Lny;->g:I

    invoke-static {v0, v10, v1}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne v0, v4, :cond_3

    goto :goto_1

    :goto_0
    sget-object v6, Lhe;->a:Lhd;

    sget-object v6, LZp;->a:Lnk;

    new-instance v7, LX4;

    invoke-direct {v7, v12, v0, v5, v2}, LX4;-><init>(Ljava/lang/Object;Ljava/lang/Object;LEb;I)V

    iput v9, v1, Lny;->g:I

    invoke-static {v6, v7, v1}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_3

    :goto_1
    move-object v3, v4

    :cond_3
    :goto_2
    return-object v3

    :pswitch_0
    check-cast v7, Loy;

    iget v0, v1, Lny;->g:I

    packed-switch v0, :pswitch_data_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-wide v2, -0x1b249fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    :try_start_2
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    move-object/from16 v0, p1

    goto/16 :goto_b

    :catch_1
    move-exception v0

    goto/16 :goto_d

    :pswitch_2
    iget-object v0, v1, Lny;->f:Ljava/lang/Object;

    check-cast v0, LU2;

    :try_start_3
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto/16 :goto_9

    :pswitch_3
    iget-object v0, v1, Lny;->f:Ljava/lang/Object;

    check-cast v0, LU2;

    :try_start_4
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    move-object/from16 v2, p1

    goto/16 :goto_8

    :pswitch_4
    iget-object v0, v1, Lny;->f:Ljava/lang/Object;

    check-cast v0, LU2;

    :try_start_5
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    goto/16 :goto_7

    :pswitch_5
    iget-object v0, v1, Lny;->f:Ljava/lang/Object;

    check-cast v0, LU2;

    :try_start_6
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    move-object/from16 v9, p1

    goto :goto_4

    :pswitch_6
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    move-object/from16 v0, p1

    goto :goto_3

    :pswitch_7
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    :try_start_7
    sget-object v0, LZ2;->a:Lgf;

    iput v6, v1, Lny;->g:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lhe;->a:Lhd;

    sget-object v0, LVc;->b:LVc;

    new-instance v10, LY2;

    invoke-direct {v10, v9, v5}, LY2;-><init>(ILEb;)V

    invoke-static {v0, v10, v1}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_4

    goto/16 :goto_a

    :cond_4
    :goto_3
    check-cast v0, LU2;

    iget-boolean v10, v0, LU2;->a:Z

    if-eqz v10, :cond_12

    iget-object v10, v0, LU2;->e:LT2;

    if-nez v10, :cond_5

    goto/16 :goto_c

    :cond_5
    sget-object v11, LZ2;->a:Lgf;

    iget-object v10, v10, LT2;->a:Ljava/lang/String;

    iput-object v0, v1, Lny;->f:Ljava/lang/Object;

    iput v9, v1, Lny;->g:I

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, Lhe;->a:Lhd;

    sget-object v9, LVc;->b:LVc;

    new-instance v11, LW2;

    invoke-direct {v11, v8, v5, v10}, LW2;-><init>(ILEb;Ljava/lang/String;)V

    invoke-static {v9, v11, v1}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v4, :cond_6

    goto/16 :goto_a

    :cond_6
    :goto_4
    check-cast v9, LV2;

    iget v10, v9, LV2;->d:I

    iget-object v11, v0, LU2;->e:LT2;

    iget v11, v11, LT2;->c:I

    if-lt v10, v11, :cond_8

    iget-boolean v9, v9, LV2;->a:Z

    if-nez v9, :cond_7

    goto :goto_5

    :cond_7
    sput-boolean v8, Loy;->e:Z

    invoke-static {v7}, Loy;->f(Loy;)V

    invoke-static {v7, v6}, Loy;->g(Loy;Z)V

    goto/16 :goto_10

    :cond_8
    :goto_5
    new-instance v9, Landroid/content/Intent;

    invoke-direct {v9}, Landroid/content/Intent;-><init>()V

    sget-object v10, Lio/github/cherrywechat/application/MainApplication;->a:Lio/github/cherrywechat/application/MainApplication;

    if-eqz v10, :cond_9

    goto :goto_6

    :cond_9
    sget-object v10, Lgf;->p:Landroid/app/Application;

    if-eqz v10, :cond_a

    goto :goto_6

    :cond_a
    invoke-static {}, Landroid/app/AndroidAppHelper;->currentApplication()Landroid/app/Application;

    move-result-object v10

    const-wide v11, -0x2f91cfffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    :goto_6
    invoke-virtual {v10}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v10

    iget-object v10, v10, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const-wide v11, -0x2f9d7fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    const-wide v11, -0x1b330fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v10, v11}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-wide v10, -0x1b3e1fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    iget-object v11, v0, LU2;->e:LT2;

    iget-object v11, v11, LT2;->b:Ljava/lang/String;

    invoke-virtual {v9, v10, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v10, 0x10000000

    invoke-virtual {v9, v10}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-virtual {v10, v9}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    iput-object v0, v1, Lny;->f:Ljava/lang/Object;

    const/4 v9, 0x3

    iput v9, v1, Lny;->g:I

    const-wide/16 v9, 0xbb8

    invoke-static {v9, v10, v1}, Lcr;->v(JLFb;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v4, :cond_b

    goto :goto_a

    :cond_b
    :goto_7
    sget-object v9, LZ2;->a:Lgf;

    iget-object v10, v0, LU2;->e:LT2;

    iget-object v11, v10, LT2;->a:Ljava/lang/String;

    iget v10, v10, LT2;->c:I

    iput-object v0, v1, Lny;->f:Ljava/lang/Object;

    iput v2, v1, Lny;->g:I

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lhe;->a:Lhd;

    sget-object v2, LVc;->b:LVc;

    new-instance v9, LX2;

    invoke-direct {v9, v10, v5, v11}, LX2;-><init>(ILEb;Ljava/lang/String;)V

    invoke-static {v2, v9, v1}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_c

    goto :goto_a

    :cond_c
    :goto_8
    check-cast v2, LU2;

    sput-boolean v8, Loy;->e:Z

    iget-boolean v9, v2, LU2;->a:Z

    if-eqz v9, :cond_11

    invoke-static {v7}, Loy;->f(Loy;)V

    invoke-static {v7, v6}, Loy;->g(Loy;Z)V

    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-wide v9, -0x1b3e8fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    invoke-static {v2, v9, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    iput-object v0, v1, Lny;->f:Ljava/lang/Object;

    const/4 v2, 0x5

    iput v2, v1, Lny;->g:I

    const-wide/16 v9, 0x3e8

    invoke-static {v9, v10, v1}, Lcr;->v(JLFb;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_d

    goto :goto_a

    :cond_d
    :goto_9
    sget-object v2, LZ2;->a:Lgf;

    iget-object v0, v0, LU2;->e:LT2;

    iget-object v0, v0, LT2;->a:Ljava/lang/String;

    iput-object v5, v1, Lny;->f:Ljava/lang/Object;

    const/4 v9, 0x6

    iput v9, v1, Lny;->g:I

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lhe;->a:Lhd;

    sget-object v2, LVc;->b:LVc;

    new-instance v9, LW2;

    invoke-direct {v9, v8, v5, v0}, LW2;-><init>(ILEb;Ljava/lang/String;)V

    invoke-static {v2, v9, v1}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_e

    :goto_a
    move-object v3, v4

    goto/16 :goto_10

    :cond_e
    :goto_b
    check-cast v0, LV2;

    iget-object v2, v7, Loy;->b:Landroid/widget/TextView;

    if-nez v2, :cond_f

    const-wide v9, -0x1b3edfffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-object v2, v5

    :cond_f
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v10, -0x1b3fefffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v10, v0, LV2;->e:I

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-wide v10, -0x1b385fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, v0, LV2;->e:I

    const/4 v9, 0x7

    if-lt v0, v9, :cond_10

    const-wide v9, -0x1b388fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_10
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v7, v6}, Loy;->g(Loy;Z)V

    goto/16 :goto_10

    :cond_11
    invoke-static {v7}, Loy;->e(Loy;)V

    invoke-static {v7, v8}, Loy;->g(Loy;Z)V

    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v2, v2, LU2;->b:Ljava/lang/String;

    invoke-static {v0, v2, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto/16 :goto_10

    :cond_12
    :goto_c
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v0, v0, LU2;->b:Ljava/lang/String;

    invoke-static {v2, v0, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    invoke-static {v7}, Loy;->e(Loy;)V

    invoke-static {v7, v8}, Loy;->g(Loy;Z)V

    sput-boolean v8, Loy;->e:Z
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    goto :goto_10

    :goto_d
    const-wide v9, -0x1b395fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    const-wide v9, -0x1b39afffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    sput-boolean v8, Loy;->e:Z

    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-wide v9, -0x1b3a3fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_14

    const-wide v9, -0x1b3aefffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v8}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-ne v0, v6, :cond_14

    iget-object v0, v7, Loy;->b:Landroid/widget/TextView;

    if-nez v0, :cond_13

    const-wide v9, -0x1b3b1fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    goto :goto_e

    :cond_13
    move-object v5, v0

    :goto_e
    const-wide v9, -0x1b242fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v7}, Loy;->a(Loy;)V

    goto :goto_f

    :cond_14
    invoke-static {v7}, Loy;->e(Loy;)V

    :goto_f
    invoke-static {v7, v8}, Loy;->g(Loy;Z)V

    :goto_10
    return-object v3

    :pswitch_8
    check-cast v7, Loy;

    iget v0, v1, Lny;->g:I

    if-eqz v0, :cond_17

    if-eq v0, v6, :cond_16

    if-ne v0, v9, :cond_15

    iget-object v0, v1, Lny;->f:Ljava/lang/Object;

    check-cast v0, LU2;

    :try_start_8
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2

    move-object/from16 v2, p1

    goto :goto_13

    :catch_2
    move-exception v0

    goto/16 :goto_17

    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    const-wide v2, -0x1b300fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    :try_start_9
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_2

    move-object/from16 v0, p1

    goto :goto_11

    :cond_17
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    :try_start_a
    sget-object v0, LZ2;->a:Lgf;

    iput v6, v1, Lny;->g:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lhe;->a:Lhd;

    sget-object v0, LVc;->b:LVc;

    new-instance v2, LY2;

    invoke-direct {v2, v9, v5}, LY2;-><init>(ILEb;)V

    invoke-static {v0, v2, v1}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_18

    goto :goto_12

    :cond_18
    :goto_11
    check-cast v0, LU2;

    iget-boolean v2, v0, LU2;->a:Z

    if-eqz v2, :cond_23

    iget-object v2, v0, LU2;->e:LT2;

    if-nez v2, :cond_19

    goto/16 :goto_16

    :cond_19
    sget-object v10, LZ2;->a:Lgf;

    iget-object v2, v2, LT2;->a:Ljava/lang/String;

    iput-object v0, v1, Lny;->f:Ljava/lang/Object;

    iput v9, v1, Lny;->g:I

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, Lhe;->a:Lhd;

    sget-object v9, LVc;->b:LVc;

    new-instance v10, LW2;

    invoke-direct {v10, v8, v5, v2}, LW2;-><init>(ILEb;Ljava/lang/String;)V

    invoke-static {v9, v10, v1}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_1a

    :goto_12
    move-object v3, v4

    goto/16 :goto_1a

    :cond_1a
    :goto_13
    check-cast v2, LV2;

    iget-object v4, v2, LV2;->f:Ljava/lang/String;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2

    iget v9, v2, LV2;->e:I

    iget-boolean v10, v2, LV2;->a:Z

    if-eqz v4, :cond_1c

    const-wide v11, -0x1b4edfffff835L

    :try_start_b
    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    invoke-static {v4, v11, v8}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-ne v4, v6, :cond_1c

    invoke-static {v7}, Loy;->a(Loy;)V

    iget-object v0, v7, Loy;->b:Landroid/widget/TextView;

    if-nez v0, :cond_1b

    const-wide v9, -0x1b4f0fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-object v0, v5

    :cond_1b
    const-wide v9, -0x1b481fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v7, v8}, Loy;->g(Loy;Z)V

    goto/16 :goto_1a

    :cond_1c
    iget-object v4, v7, Loy;->b:Landroid/widget/TextView;

    if-nez v4, :cond_1d

    const-wide v11, -0x1b488fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-object v4, v5

    :cond_1d
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz v10, :cond_1e

    const-wide v12, -0x1b499fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-lez v9, :cond_1f

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v13, -0x1b4a3fffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-wide v13, -0x1b4aafffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_14

    :cond_1e
    const-wide v12, -0x1b4adfffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1f
    :goto_14
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget v2, v2, LV2;->d:I

    iget-object v0, v0, LU2;->e:LT2;

    iget v0, v0, LT2;->c:I

    if-lt v2, v0, :cond_21

    if-nez v10, :cond_20

    goto :goto_15

    :cond_20
    invoke-static {v7}, Loy;->f(Loy;)V

    invoke-static {v7, v6}, Loy;->g(Loy;Z)V

    goto/16 :goto_1a

    :cond_21
    :goto_15
    iget-object v0, v7, Loy;->a:Landroid/widget/TextView;

    if-nez v0, :cond_22

    const-wide v9, -0x1b4b8fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-object v0, v5

    :cond_22
    const-wide v9, -0x1b345fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v7}, Loy;->e(Loy;)V

    invoke-static {v7, v8}, Loy;->g(Loy;Z)V

    goto/16 :goto_1a

    :cond_23
    :goto_16
    iget-object v0, v0, LU2;->b:Ljava/lang/String;

    if-eqz v0, :cond_25

    const-wide v9, -0x1b4d2fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v8}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-ne v0, v6, :cond_25

    invoke-static {v7}, Loy;->a(Loy;)V

    iget-object v0, v7, Loy;->b:Landroid/widget/TextView;

    if-nez v0, :cond_24

    const-wide v9, -0x1b4d5fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-object v0, v5

    :cond_24
    const-wide v9, -0x1b4e6fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1a

    :cond_25
    invoke-static {v7}, Loy;->e(Loy;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_2

    goto :goto_1a

    :goto_17
    const-wide v9, -0x1b34cfffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    const-wide v9, -0x1b351fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v9, -0x1b35afffff835L

    invoke-static {v9, v10, v4, v0}, LEy;->c(JLjava/lang/StringBuilder;Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_27

    const-wide v9, -0x1b365fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v8}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-ne v0, v6, :cond_27

    invoke-static {v7}, Loy;->a(Loy;)V

    iget-object v0, v7, Loy;->b:Landroid/widget/TextView;

    if-nez v0, :cond_26

    const-wide v9, -0x1b368fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    goto :goto_18

    :cond_26
    move-object v5, v0

    :goto_18
    const-wide v9, -0x1b379fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_19

    :cond_27
    invoke-static {v7}, Loy;->e(Loy;)V

    :goto_19
    invoke-static {v7, v8}, Loy;->g(Loy;Z)V

    :goto_1a
    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
