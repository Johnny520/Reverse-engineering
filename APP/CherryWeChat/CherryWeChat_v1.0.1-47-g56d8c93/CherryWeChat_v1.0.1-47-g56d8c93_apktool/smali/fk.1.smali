.class public final Lfk;
.super LOz;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic e:I

.field public f:I

.field public g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LQC;Ljava/lang/Object;LEb;I)V
    .locals 0

    .line 1
    iput p4, p0, Lfk;->e:I

    iput-object p1, p0, Lfk;->h:Ljava/lang/Object;

    iput-object p2, p0, Lfk;->i:Ljava/lang/Object;

    invoke-direct {p0, p3}, LOz;-><init>(LEb;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LEb;I)V
    .locals 0

    .line 2
    iput p5, p0, Lfk;->e:I

    iput-object p1, p0, Lfk;->g:Ljava/lang/Object;

    iput-object p2, p0, Lfk;->h:Ljava/lang/Object;

    iput-object p3, p0, Lfk;->i:Ljava/lang/Object;

    invoke-direct {p0, p4}, LOz;-><init>(LEb;)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lfk;->e:I

    check-cast p1, Lfc;

    check-cast p2, LEb;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p2, p1}, Lfk;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, Lfk;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, Lfk;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lfk;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, Lfk;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, Lfk;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p2, p1}, Lfk;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, Lfk;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, Lfk;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p2, p1}, Lfk;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, Lfk;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, Lfk;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p0, p2, p1}, Lfk;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, Lfk;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, Lfk;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p0, p2, p1}, Lfk;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, Lfk;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, Lfk;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h(LEb;Ljava/lang/Object;)LEb;
    .locals 10

    iget p2, p0, Lfk;->e:I

    packed-switch p2, :pswitch_data_0

    new-instance p2, Lfk;

    iget-object v0, p0, Lfk;->h:Ljava/lang/Object;

    check-cast v0, LQC;

    iget-object v1, p0, Lfk;->i:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x5

    invoke-direct {p2, v0, v1, p1, v2}, Lfk;-><init>(LQC;Ljava/lang/Object;LEb;I)V

    return-object p2

    :pswitch_0
    new-instance p2, Lfk;

    iget-object v0, p0, Lfk;->h:Ljava/lang/Object;

    check-cast v0, LQC;

    iget-object v1, p0, Lfk;->i:Ljava/lang/Object;

    check-cast v1, Landroid/app/Activity;

    const/4 v2, 0x4

    invoke-direct {p2, v0, v1, p1, v2}, Lfk;-><init>(LQC;Ljava/lang/Object;LEb;I)V

    return-object p2

    :pswitch_1
    new-instance v3, Lfk;

    iget-object p2, p0, Lfk;->g:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, Ljava/lang/String;

    iget-object p2, p0, Lfk;->h:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, LSA;

    iget-object p2, p0, Lfk;->i:Ljava/lang/Object;

    move-object v6, p2

    check-cast v6, Landroid/app/Activity;

    const/4 v8, 0x3

    move-object v7, p1

    invoke-direct/range {v3 .. v8}, Lfk;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LEb;I)V

    return-object v3

    :pswitch_2
    move-object v8, p1

    new-instance v4, Lfk;

    iget-object p1, p0, Lfk;->g:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ljava/lang/String;

    iget-object p1, p0, Lfk;->h:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Landroid/os/Bundle;

    iget-object p1, p0, Lfk;->i:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Ljava/lang/String;

    const/4 v9, 0x2

    invoke-direct/range {v4 .. v9}, Lfk;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LEb;I)V

    return-object v4

    :pswitch_3
    move-object v8, p1

    new-instance v4, Lfk;

    iget-object p1, p0, Lfk;->g:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lnp;

    iget-object p1, p0, Lfk;->h:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Ljava/lang/String;

    iget-object p1, p0, Lfk;->i:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Ljava/lang/String;

    const/4 v9, 0x1

    invoke-direct/range {v4 .. v9}, Lfk;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LEb;I)V

    return-object v4

    :pswitch_4
    move-object v8, p1

    new-instance v4, Lfk;

    iget-object p1, p0, Lfk;->g:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lhk;

    iget-object p1, p0, Lfk;->h:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, LDA;

    iget-object p1, p0, Lfk;->i:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, LEC;

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v9}, Lfk;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LEb;I)V

    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v6, p0

    iget v0, v6, Lfk;->e:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    const-class v3, Lio/github/cherrywechat/network/model/ApiResponse;

    const/4 v7, 0x3

    const/4 v4, 0x0

    sget-object v8, LTC;->a:LTC;

    iget-object v5, v6, Lfk;->i:Ljava/lang/Object;

    sget-object v9, Lgc;->a:Lgc;

    iget-object v10, v6, Lfk;->h:Ljava/lang/Object;

    const/4 v11, 0x1

    packed-switch v0, :pswitch_data_0

    check-cast v10, LQC;

    iget v0, v6, Lfk;->f:I

    if-eqz v0, :cond_1

    if-ne v0, v11, :cond_0

    iget-object v0, v6, Lfk;->g:Ljava/lang/Object;

    check-cast v0, LQC;

    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    move-object v1, v0

    move-object/from16 v0, p1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-wide v1, -0x1bab5fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    sget-object v0, LIC;->a:LIC;

    iput-object v10, v6, Lfk;->g:Ljava/lang/Object;

    iput v11, v6, Lfk;->f:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v11, v6}, LIC;->d(ZLOz;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_2

    move-object v8, v9

    goto :goto_1

    :cond_2
    move-object v1, v10

    :goto_0
    check-cast v0, Ljava/util/List;

    iput-object v0, v1, LQC;->m:Ljava/util/List;

    iget-object v0, v10, LQC;->e:Landroid/widget/EditText;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    :cond_3
    const-wide v0, -0x1baabfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :cond_4
    invoke-virtual {v10, v0}, LQC;->e(Ljava/lang/String;)V

    invoke-static {v10}, LQC;->a(LQC;)V

    iget-object v0, v10, LQC;->b:LWz;

    if-eqz v0, :cond_5

    invoke-virtual {v0, v4}, LWz;->setRefreshing(Z)V

    :cond_5
    invoke-virtual {v10}, LQC;->f()Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x1baacfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_1
    return-object v8

    :pswitch_0
    check-cast v10, LQC;

    iget v0, v6, Lfk;->f:I

    if-eqz v0, :cond_7

    if-ne v0, v11, :cond_6

    iget-object v0, v6, Lfk;->g:Ljava/lang/Object;

    check-cast v0, LQC;

    :try_start_0
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, v0

    move-object/from16 v0, p1

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_3

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-wide v1, -0x1ba69fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    :try_start_1
    sget-object v0, LIC;->a:LIC;

    iput-object v10, v6, Lfk;->g:Ljava/lang/Object;

    iput v11, v6, Lfk;->f:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v6}, LIC;->d(ZLOz;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_8

    move-object v8, v9

    goto :goto_4

    :cond_8
    move-object v1, v10

    :goto_2
    check-cast v0, Ljava/util/List;

    iput-object v0, v1, LQC;->m:Ljava/util/List;

    iget-object v0, v10, LQC;->e:Landroid/widget/EditText;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_a

    :cond_9
    const-wide v0, -0x1ba5ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :cond_a
    invoke-virtual {v10, v0}, LQC;->e(Ljava/lang/String;)V

    invoke-static {v10}, LQC;->a(LQC;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_4

    :goto_3
    check-cast v5, Landroid/app/Activity;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x1ba60fffff835L

    invoke-static {v2, v3, v1, v0}, LEy;->c(JLjava/lang/StringBuilder;Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_4
    return-object v8

    :pswitch_1
    check-cast v10, LSA;

    iget v0, v6, Lfk;->f:I

    if-eqz v0, :cond_c

    if-ne v0, v11, :cond_b

    :try_start_2
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-object/from16 v0, p1

    goto :goto_5

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-wide v1, -0x1bfc3fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    :try_start_3
    sget-object v0, LNs;->a:LNs;

    iget-object v1, v6, Lfk;->g:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iput v11, v6, Lfk;->f:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v11, -0x16b91fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, LNs;->e(Ljava/lang/String;LEb;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_d

    move-object v8, v9

    goto/16 :goto_9

    :cond_d
    :goto_5
    check-cast v0, Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    :try_start_4
    sget-object v1, Lzm;->a:LAm;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lio/github/cherrywechat/network/model/ApiResponse;->Companion:Lio/github/cherrywechat/network/model/ApiResponse$Companion;

    sget-object v7, Lio/github/cherrywechat/network/model/ThemeDetailData;->Companion:Lio/github/cherrywechat/network/model/ThemeDetailData$Companion;

    invoke-virtual {v7}, Lio/github/cherrywechat/network/model/ThemeDetailData$Companion;->serializer()LQm;

    move-result-object v7

    invoke-virtual {v4, v7}, Lio/github/cherrywechat/network/model/ApiResponse$Companion;->serializer(LQm;)LQm;

    move-result-object v4

    check-cast v4, LQm;

    invoke-virtual {v1, v4, v0}, Lmm;->a(LQm;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_6

    :catch_1
    move-exception v0

    const-wide v11, -0x1bf12fffff835L

    :try_start_5
    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v3}, LJv;->a(Ljava/lang/Class;)LF9;

    move-result-object v1

    invoke-virtual {v1}, LF9;->b()Ljava/lang/String;

    const-wide v3, -0x1bf2dfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    :goto_6
    check-cast v2, Lio/github/cherrywechat/network/model/ApiResponse;

    if-eqz v2, :cond_15

    invoke-virtual {v2}, Lio/github/cherrywechat/network/model/ApiResponse;->getCode()I

    move-result v0

    if-eqz v0, :cond_e

    goto/16 :goto_8

    :cond_e
    invoke-virtual {v2}, Lio/github/cherrywechat/network/model/ApiResponse;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/github/cherrywechat/network/model/ThemeDetailData;

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ThemeDetailData;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ThemeDetailData;->getAuthor()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ThemeDetailData;->getPrice()D

    move-result-wide v3

    iget-object v7, v10, LSA;->e:Landroid/widget/TextView;

    if-eqz v7, :cond_f

    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_f
    iget-object v1, v10, LSA;->f:Landroid/widget/TextView;

    if-eqz v1, :cond_10

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v11, -0x1bf31fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_10
    const-wide/16 v1, 0x0

    cmpl-double v1, v3, v1

    if-lez v1, :cond_11

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v11, -0x1bf35fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_7

    :cond_11
    const-wide v1, -0x1bf3efffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    :goto_7
    iget-object v2, v10, LSA;->g:Landroid/widget/TextView;

    if-eqz v2, :cond_12

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_12
    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ThemeDetailData;->getScreenshots()Ljava/util/List;

    move-result-object v0

    iget-object v1, v10, LSA;->c:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v1, :cond_13

    new-instance v2, LJA;

    invoke-direct {v2, v10, v0}, LJA;-><init>(LSA;Ljava/util/List;)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/g;)V

    :cond_13
    iget-object v0, v10, LSA;->g:Landroid/widget/TextView;

    if-eqz v0, :cond_14

    check-cast v5, Landroid/app/Activity;

    new-instance v1, LPA;

    invoke-direct {v1, v10, v5, v3, v4}, LPA;-><init>(LSA;Landroid/app/Activity;D)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_14
    invoke-static {v10}, LSA;->a(LSA;)V

    goto :goto_9

    :cond_15
    :goto_8
    invoke-static {v10}, LSA;->e(LSA;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_9

    :catch_2
    invoke-static {v10}, LSA;->e(LSA;)V

    :goto_9
    return-object v8

    :pswitch_2
    check-cast v10, Landroid/os/Bundle;

    iget v0, v6, Lfk;->f:I

    if-eqz v0, :cond_17

    if-ne v0, v11, :cond_16

    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_a

    :cond_16
    new-instance v0, Ljava/lang/IllegalStateException;

    const-wide v1, -0x9ea2fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    sget-object v0, Lms;->a:LPg;

    iget-object v1, v6, Lfk;->g:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iput v11, v6, Lfk;->f:I

    invoke-static {v0, v1, v6}, LPg;->d(LPg;Ljava/lang/String;LOz;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_18

    move-object v8, v9

    goto :goto_b

    :cond_18
    :goto_a
    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_19

    goto :goto_b

    :cond_19
    const-wide v1, -0x9e8efffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Lwh;->e0(Ljava/io/File;)[B

    move-result-object v0

    invoke-virtual {v10, v1, v0}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    sget-object v0, Lms;->a:LPg;

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v10, v5}, LPg;->m(Landroid/os/Bundle;Ljava/lang/String;)V

    :goto_b
    return-object v8

    :pswitch_3
    check-cast v5, Ljava/lang/String;

    check-cast v10, Ljava/lang/String;

    iget-object v0, v6, Lfk;->g:Ljava/lang/Object;

    move-object v12, v0

    check-cast v12, Lnp;

    iget v0, v6, Lfk;->f:I

    if-eqz v0, :cond_1d

    if-eq v0, v11, :cond_1c

    if-eq v0, v1, :cond_1a

    if-ne v0, v7, :cond_1b

    :cond_1a
    :try_start_6
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    goto/16 :goto_11

    :catch_3
    move-exception v0

    goto/16 :goto_10

    :cond_1b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-wide v1, -0x49c2fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1c
    :try_start_7
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    move-object/from16 v0, p1

    goto :goto_c

    :cond_1d
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    const-wide v13, -0x496bfffff835L

    :try_start_8
    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0, v4}, Lnp;->g(Ljava/lang/String;Z)V

    sget-object v0, Lhe;->a:Lhd;

    sget-object v0, LVc;->b:LVc;

    new-instance v13, Llp;

    invoke-direct {v13, v10, v5, v2, v4}, Llp;-><init>(Ljava/lang/String;Ljava/lang/String;LEb;I)V

    iput v11, v6, Lfk;->f:I

    invoke-static {v0, v13, v6}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_1e

    goto/16 :goto_f

    :cond_1e
    :goto_c
    check-cast v0, Ljava/lang/String;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3

    :try_start_9
    sget-object v13, Lzm;->a:LAm;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, Lio/github/cherrywechat/network/model/ApiResponse;->Companion:Lio/github/cherrywechat/network/model/ApiResponse$Companion;

    sget-object v15, LVC;->b:LVC;

    invoke-virtual {v14, v15}, Lio/github/cherrywechat/network/model/ApiResponse$Companion;->serializer(LQm;)LQm;

    move-result-object v14

    check-cast v14, LQm;

    invoke-virtual {v13, v14, v0}, Lmm;->a(LQm;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_4

    goto :goto_d

    :catch_4
    move-exception v0

    const-wide v13, -0x4975fffff835L

    :try_start_a
    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v3}, LJv;->a(Ljava/lang/Class;)LF9;

    move-result-object v3

    invoke-virtual {v3}, LF9;->b()Ljava/lang/String;

    const-wide v13, -0x4910fffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-object v0, v2

    :goto_d
    check-cast v0, Lio/github/cherrywechat/network/model/ApiResponse;

    if-eqz v0, :cond_1f

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getCode()I

    move-result v3

    goto :goto_e

    :cond_1f
    const/4 v3, -0x1

    :goto_e
    if-eqz v0, :cond_21

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_21

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v13

    if-lez v13, :cond_20

    move-object v2, v0

    :cond_20
    if-nez v2, :cond_22

    :cond_21
    const-wide v13, -0x4914fffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    :cond_22
    if-eqz v3, :cond_24

    const/16 v0, 0x190

    if-eq v3, v0, :cond_23

    const-wide v0, -0x4934fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0, v11}, Lnp;->g(Ljava/lang/String;Z)V

    invoke-virtual {v12, v4}, Lnp;->f(Z)V

    goto :goto_11

    :cond_23
    const-wide v0, -0x4926fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0, v4}, Lnp;->g(Ljava/lang/String;Z)V

    invoke-static {v12, v10, v5}, Lnp;->e(Lnp;Ljava/lang/String;Ljava/lang/String;)V

    iput v7, v6, Lfk;->f:I

    invoke-static {v12, v5, v6}, Lnp;->a(Lnp;Ljava/lang/String;LFb;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_25

    goto :goto_f

    :cond_24
    const-wide v2, -0x4919fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0, v4}, Lnp;->g(Ljava/lang/String;Z)V

    invoke-static {v12, v10, v5}, Lnp;->e(Lnp;Ljava/lang/String;Ljava/lang/String;)V

    iput v1, v6, Lfk;->f:I

    invoke-static {v12, v5, v6}, Lnp;->a(Lnp;Ljava/lang/String;LFb;)Ljava/lang/Object;

    move-result-object v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_3

    if-ne v0, v9, :cond_25

    :goto_f
    move-object v8, v9

    goto :goto_11

    :goto_10
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x493afffff835L

    invoke-static {v2, v3, v1, v0}, LEy;->c(JLjava/lang/StringBuilder;Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0, v11}, Lnp;->g(Ljava/lang/String;Z)V

    invoke-virtual {v12, v4}, Lnp;->f(Z)V

    :cond_25
    :goto_11
    return-object v8

    :pswitch_4
    move-object v12, v5

    check-cast v12, LEC;

    check-cast v10, LDA;

    iget-object v0, v6, Lfk;->g:Ljava/lang/Object;

    move-object v13, v0

    check-cast v13, Lhk;

    iget v0, v6, Lfk;->f:I

    const/4 v14, 0x0

    packed-switch v0, :pswitch_data_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-wide v1, -0x42e9fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_5
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    goto/16 :goto_1e

    :pswitch_6
    :try_start_b
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    goto/16 :goto_1e

    :catch_5
    move-exception v0

    move-object v2, v0

    move-object v3, v12

    move-object v1, v13

    move-object v4, v14

    goto/16 :goto_1c

    :pswitch_7
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_5

    move-object/from16 v0, p1

    goto/16 :goto_17

    :pswitch_8
    :try_start_c
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_6

    goto/16 :goto_1e

    :catch_6
    move-exception v0

    move-object v2, v0

    goto/16 :goto_1a

    :pswitch_9
    :try_start_d
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_5

    move-object/from16 v0, p1

    goto :goto_12

    :pswitch_a
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    :try_start_e
    sget-object v0, Lm0;->a:Lm0;

    invoke-virtual {v13}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-wide v4, -0x4216fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    sget-object v4, LEA;->a:LEA;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, LEA;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v4}, Lm0;->c(Landroid/content/Context;Ljava/lang/String;)Ll0;

    move-result-object v0

    sget-object v2, LNs;->a:LNs;

    iget-object v4, v10, LDA;->a:Ljava/lang/String;

    iget-object v5, v0, Ll0;->a:Ljava/lang/String;

    iget-object v0, v0, Ll0;->c:Ljava/lang/String;

    iput v11, v6, Lfk;->f:I

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v5, v0, v6}, LNs;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LOz;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_26

    goto/16 :goto_1d

    :cond_26
    :goto_12
    check-cast v0, Ljava/lang/String;
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_9

    :try_start_f
    sget-object v2, Lzm;->a:LAm;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lio/github/cherrywechat/network/model/ApiResponse;->Companion:Lio/github/cherrywechat/network/model/ApiResponse$Companion;

    sget-object v5, Lio/github/cherrywechat/network/model/DownloadTokenData;->Companion:Lio/github/cherrywechat/network/model/DownloadTokenData$Companion;

    invoke-virtual {v5}, Lio/github/cherrywechat/network/model/DownloadTokenData$Companion;->serializer()LQm;

    move-result-object v5

    invoke-virtual {v4, v5}, Lio/github/cherrywechat/network/model/ApiResponse$Companion;->serializer(LQm;)LQm;

    move-result-object v4

    check-cast v4, LQm;

    invoke-virtual {v2, v4, v0}, Lmm;->a(LQm;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_7

    goto :goto_13

    :catch_7
    move-exception v0

    const-wide v4, -0x4226fffff835L

    :try_start_10
    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v3}, LJv;->a(Ljava/lang/Class;)LF9;

    move-result-object v2

    invoke-virtual {v2}, LF9;->b()Ljava/lang/String;

    const-wide v2, -0x42c1fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-object v0, v14

    :goto_13
    check-cast v0, Lio/github/cherrywechat/network/model/ApiResponse;

    if-eqz v0, :cond_2d

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getCode()I

    move-result v2

    if-eqz v2, :cond_27

    goto/16 :goto_19

    :cond_27
    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/github/cherrywechat/network/model/DownloadTokenData;

    if-eqz v0, :cond_29

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/DownloadTokenData;->getToken()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_28

    goto :goto_15

    :cond_28
    :goto_14
    move-object v2, v0

    goto :goto_16

    :cond_29
    :goto_15
    const-wide v0, -0x42cafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_6

    goto :goto_14

    :goto_16
    :try_start_11
    sget-object v0, LNs;->a:LNs;

    sget-object v1, LEA;->a:LEA;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, LEA;->c:Ljava/lang/String;

    iget-wide v3, v10, LDA;->e:J

    new-instance v5, Ls;

    invoke-direct {v5, v7, v13}, Ls;-><init>(ILjava/lang/Object;)V

    const/4 v11, 0x4

    iput v11, v6, Lfk;->f:I

    invoke-virtual/range {v0 .. v6}, LNs;->b(Ljava/lang/String;Ljava/lang/String;JLfj;LFb;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_2a

    goto/16 :goto_1d

    :cond_2a
    :goto_17
    check-cast v0, [B

    new-instance v1, Ljava/io/File;

    sget-object v2, LEA;->a:LEA;

    iget-object v3, v10, LDA;->a:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, LEA;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_2c

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    move-result v1

    if-eqz v1, :cond_2b

    goto :goto_18

    :cond_2b
    new-instance v0, Ljava/lang/Exception;

    const-wide v1, -0x42cbfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2c
    :goto_18
    new-instance v1, Ljava/io/File;

    iget-object v2, v10, LDA;->a:Ljava/lang/String;

    invoke-static {v2}, LEA;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_5

    :try_start_12
    invoke-virtual {v2, v0}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    :try_start_13
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x42d4fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v0}, Lio/github/cherrywechat/theme/ThemeProvider;->extractThemeFiles(Ljava/lang/String;)Z

    sget-object v0, Lhe;->a:Lhd;

    sget-object v0, LZp;->a:Lnk;

    new-instance v1, LX4;

    invoke-direct {v1, v13, v12, v14, v7}, LX4;-><init>(Ljava/lang/Object;Ljava/lang/Object;LEb;I)V

    const/4 v2, 0x5

    iput v2, v6, Lfk;->f:I

    invoke-static {v0, v1, v6}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v0
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_5

    if-ne v0, v9, :cond_31

    goto/16 :goto_1d

    :catchall_0
    move-exception v0

    move-object v1, v0

    :try_start_14
    throw v1
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_1

    :catchall_1
    move-exception v0

    :try_start_15
    invoke-static {v2, v1}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_5

    :cond_2d
    :goto_19
    if-eqz v0, :cond_2f

    :try_start_16
    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2f

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_2e

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getMsg()Ljava/lang/String;

    move-result-object v2

    :cond_2e
    if-nez v2, :cond_30

    :cond_2f
    const-wide v2, -0x42c5fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    :cond_30
    sget-object v0, Lhe;->a:Lhd;

    sget-object v0, LZp;->a:Lnk;

    new-instance v3, LZ9;

    invoke-direct {v3, v13, v2, v12, v14}, LZ9;-><init>(Lhk;Ljava/lang/String;LEC;LEb;)V

    iput v1, v6, Lfk;->f:I

    invoke-static {v0, v3, v6}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v0
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_6

    if-ne v0, v9, :cond_31

    goto :goto_1d

    :goto_1a
    :try_start_17
    sget-object v0, Lhe;->a:Lhd;

    sget-object v10, LZp;->a:Lnk;

    new-instance v0, Lek;
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_9

    const/4 v5, 0x1

    move-object v3, v12

    move-object v1, v13

    move-object v4, v14

    :try_start_18
    invoke-direct/range {v0 .. v5}, Lek;-><init>(Lhk;Ljava/lang/Exception;LEC;LEb;I)V

    iput v7, v6, Lfk;->f:I

    invoke-static {v10, v0, v6}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v0
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_8

    if-ne v0, v9, :cond_31

    goto :goto_1d

    :catch_8
    move-exception v0

    :goto_1b
    move-object v2, v0

    goto :goto_1c

    :catch_9
    move-exception v0

    move-object v3, v12

    move-object v1, v13

    move-object v4, v14

    goto :goto_1b

    :goto_1c
    sget-object v0, Lhe;->a:Lhd;

    sget-object v7, LZp;->a:Lnk;

    new-instance v0, Lek;

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lek;-><init>(Lhk;Ljava/lang/Exception;LEC;LEb;I)V

    const/4 v1, 0x6

    iput v1, v6, Lfk;->f:I

    invoke-static {v7, v0, v6}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_31

    :goto_1d
    move-object v8, v9

    :cond_31
    :goto_1e
    return-object v8

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_6
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method
