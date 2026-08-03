.class public final LW4;
.super LOz;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic e:I

.field public f:I

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILfj;Ljava/lang/String;Ljava/lang/String;Lfj;LEb;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LW4;->e:I

    .line 1
    iput p1, p0, LW4;->f:I

    iput-object p2, p0, LW4;->h:Ljava/lang/Object;

    iput-object p3, p0, LW4;->g:Ljava/lang/Object;

    iput-object p4, p0, LW4;->j:Ljava/lang/Object;

    iput-object p5, p0, LW4;->i:Ljava/lang/Object;

    invoke-direct {p0, p6}, LOz;-><init>(LEb;)V

    return-void
.end method

.method public constructor <init>(LEb;Lqe;LOg;LDA;LEC;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LW4;->e:I

    .line 2
    iput-object p3, p0, LW4;->h:Ljava/lang/Object;

    iput-object p4, p0, LW4;->i:Ljava/lang/Object;

    iput-object p2, p0, LW4;->g:Ljava/lang/Object;

    iput-object p5, p0, LW4;->j:Ljava/lang/Object;

    invoke-direct {p0, p1}, LOz;-><init>(LEb;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LEb;I)V
    .locals 0

    .line 3
    iput p6, p0, LW4;->e:I

    iput-object p1, p0, LW4;->g:Ljava/lang/Object;

    iput-object p2, p0, LW4;->j:Ljava/lang/Object;

    iput-object p3, p0, LW4;->h:Ljava/lang/Object;

    iput-object p4, p0, LW4;->i:Ljava/lang/Object;

    invoke-direct {p0, p5}, LOz;-><init>(LEb;)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, LW4;->e:I

    check-cast p1, Lfc;

    check-cast p2, LEb;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p2, p1}, LW4;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LW4;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LW4;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p2, p1}, LW4;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LW4;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LW4;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p2, p1}, LW4;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LW4;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LW4;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p2, p1}, LW4;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LW4;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LW4;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h(LEb;Ljava/lang/Object;)LEb;
    .locals 8

    iget p2, p0, LW4;->e:I

    packed-switch p2, :pswitch_data_0

    new-instance v0, LW4;

    iget-object p2, p0, LW4;->g:Ljava/lang/Object;

    move-object v1, p2

    check-cast v1, Ljava/lang/String;

    iget-object p2, p0, LW4;->j:Ljava/lang/Object;

    move-object v2, p2

    check-cast v2, Ljava/lang/String;

    iget-object p2, p0, LW4;->h:Ljava/lang/Object;

    move-object v3, p2

    check-cast v3, Landroid/app/Activity;

    iget-object p2, p0, LW4;->i:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, LSA;

    const/4 v6, 0x3

    move-object v5, p1

    invoke-direct/range {v0 .. v6}, LW4;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LEb;I)V

    return-object v0

    :pswitch_0
    move-object v2, p1

    new-instance v1, LW4;

    iget-object p1, p0, LW4;->h:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, LOg;

    iget-object p1, p0, LW4;->i:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, LDA;

    iget-object p1, p0, LW4;->g:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lqe;

    iget-object p1, p0, LW4;->j:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, LEC;

    invoke-direct/range {v1 .. v6}, LW4;-><init>(LEb;Lqe;LOg;LDA;LEC;)V

    return-object v1

    :pswitch_1
    move-object v2, p1

    new-instance v1, LW4;

    iget-object p1, p0, LW4;->g:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p2, p0, LW4;->j:Ljava/lang/Object;

    move-object v3, p2

    check-cast v3, Ll0;

    iget-object p2, p0, LW4;->h:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, Lfj;

    iget-object p2, p0, LW4;->i:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, Lfj;

    const/4 v7, 0x1

    move-object v6, v2

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, LW4;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LEb;I)V

    return-object v1

    :pswitch_2
    move-object v2, p1

    new-instance v1, LW4;

    move-object v5, v2

    iget v2, p0, LW4;->f:I

    iget-object p1, p0, LW4;->h:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lfj;

    iget-object p1, p0, LW4;->g:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ljava/lang/String;

    iget-object p1, p0, LW4;->j:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p2, p0, LW4;->i:Ljava/lang/Object;

    move-object v6, p2

    check-cast v6, Lfj;

    move-object v7, v5

    move-object v5, p1

    invoke-direct/range {v1 .. v7}, LW4;-><init>(ILfj;Ljava/lang/String;Ljava/lang/String;Lfj;LEb;)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v6, p0

    iget v0, v6, LW4;->e:I

    const/4 v1, 0x3

    const/4 v2, 0x2

    iget-object v3, v6, LW4;->i:Ljava/lang/Object;

    const-class v4, Lio/github/cherrywechat/network/model/ApiResponse;

    sget-object v7, Lgc;->a:Lgc;

    const/4 v5, 0x0

    const/4 v8, 0x0

    sget-object v9, LTC;->a:LTC;

    iget-object v10, v6, LW4;->j:Ljava/lang/Object;

    iget-object v11, v6, LW4;->g:Ljava/lang/Object;

    iget-object v12, v6, LW4;->h:Ljava/lang/Object;

    const/4 v13, 0x1

    packed-switch v0, :pswitch_data_0

    check-cast v12, Landroid/app/Activity;

    iget v0, v6, LW4;->f:I

    if-eqz v0, :cond_1

    if-ne v0, v13, :cond_0

    :try_start_0
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v0, p1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :catch_0
    move-exception v0

    goto/16 :goto_6

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-wide v1, -0x1b0adfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    :try_start_1
    invoke-static {}, Lgf;->I()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_2

    invoke-static {}, Lgf;->L()Ljava/lang/String;

    move-result-object v0

    :cond_2
    sget-object v1, LNs;->a:LNs;

    check-cast v11, Ljava/lang/String;

    check-cast v10, Ljava/lang/String;

    iput v13, v6, LW4;->f:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v11, v10, v0, v6}, LNs;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LW4;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_3

    goto/16 :goto_8

    :cond_3
    :goto_0
    check-cast v0, Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    sget-object v1, Lzm;->a:LAm;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lio/github/cherrywechat/network/model/ApiResponse;->Companion:Lio/github/cherrywechat/network/model/ApiResponse$Companion;

    sget-object v3, Lio/github/cherrywechat/network/model/ThemePurchaseData;->Companion:Lio/github/cherrywechat/network/model/ThemePurchaseData$Companion;

    invoke-virtual {v3}, Lio/github/cherrywechat/network/model/ThemePurchaseData$Companion;->serializer()LQm;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/github/cherrywechat/network/model/ApiResponse$Companion;->serializer(LQm;)LQm;

    move-result-object v2

    check-cast v2, LQm;

    invoke-virtual {v1, v2, v0}, Lmm;->a(LQm;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catch_1
    move-exception v0

    const-wide v1, -0x1b1f4fffff835L

    :try_start_3
    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v4}, LJv;->a(Ljava/lang/Class;)LF9;

    move-result-object v1

    invoke-virtual {v1}, LF9;->b()Ljava/lang/String;

    const-wide v1, -0x1b18ffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-object v0, v5

    :goto_1
    check-cast v0, Lio/github/cherrywechat/network/model/ApiResponse;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getCode()I

    move-result v1

    if-nez v1, :cond_9

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/github/cherrywechat/network/model/ThemePurchaseData;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lio/github/cherrywechat/network/model/ThemePurchaseData;->getQrCode()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_4
    move-object v1, v5

    :goto_2
    const-wide v2, -0x1b193fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v2, :cond_5

    goto/16 :goto_3

    :cond_5
    const-wide v2, -0x1b1a7fffff835L

    :try_start_4
    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-wide v2, -0x1b1b1fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v2, -0x20df5fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    sget v3, LgG;->a:I

    invoke-static {v0}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-direct {v2, v0}, LiG;-><init>(Ljava/lang/Object;)V

    new-instance v0, LMx;

    const/16 v3, 0xb

    invoke-direct {v0, v3}, LMx;-><init>(I)V

    const-wide v10, -0x20c69fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    iput-object v0, v2, LiG;->g:Lfj;

    invoke-virtual {v2}, LiG;->e()Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v2

    aget-object v2, v2, v13

    const-wide v10, -0x1b06ffffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    const-wide v10, -0x20f7efffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    new-instance v4, Lqs;

    invoke-direct {v4, v3, v2}, Lqs;-><init>(ILjava/lang/Class;)V

    const-class v2, Ljava/lang/String;

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v10, Ljava/lang/Object;

    filled-new-array {v2, v7, v10}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v4, v2}, Lqs;->x([Ljava/lang/Object;)V

    new-instance v2, Ljava/lang/Integer;

    const/16 v7, 0x1c

    invoke-direct {v2, v7}, Ljava/lang/Integer;-><init>(I)V

    filled-new-array {v1, v2, v5}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v4, v1}, Lqs;->w([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-wide v10, -0x1b078fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v10, -0x20f04fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    new-instance v4, Lqs;

    invoke-static {v2}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v4, v3, v2}, Lqs;-><init>(ILjava/lang/Class;)V

    const-class v2, Landroid/content/Context;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v4, v2}, Lqs;->x([Ljava/lang/Object;)V

    filled-new-array {v12}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v4, v2}, Lqs;->w([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-wide v13, -0x1b024fffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    new-instance v7, Lqs;

    invoke-static {v4}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    invoke-direct {v7, v3, v4}, Lqs;-><init>(ILjava/lang/Class;)V

    const-wide v3, -0x1b0e2fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v7, v3}, Lqs;->x([Ljava/lang/Object;)V

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v7, v2}, Lqs;->w([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    filled-new-array {v5, v1, v5}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_7

    :cond_6
    invoke-static {v12, v1}, Lgf;->U(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_7

    :catch_2
    const-wide v0, -0x1b08efffff835L

    :try_start_5
    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v12, v0, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_7

    :cond_7
    :goto_3
    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_8

    const-wide v0, -0x1b097fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :cond_8
    invoke-static {v12, v0, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_7

    :cond_9
    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_b

    const-wide v0, -0x1b09cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_a
    const-wide v0, -0x1b0a1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :cond_b
    :goto_4
    invoke-static {v12, v0, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_7

    :goto_5
    throw v0

    :goto_6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x1b0a6fffff835L

    invoke-static {v2, v3, v1, v0}, LEy;->c(JLjava/lang/StringBuilder;Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v12, v0, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_7
    move-object v7, v9

    :goto_8
    return-object v7

    :pswitch_0
    check-cast v11, Lqe;

    move-object v8, v3

    check-cast v8, LDA;

    iget-object v14, v8, LDA;->a:Ljava/lang/String;

    check-cast v12, LOg;

    iget v0, v6, LW4;->f:I

    packed-switch v0, :pswitch_data_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-wide v1, -0x5afbfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    goto :goto_a

    :pswitch_2
    :try_start_6
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    goto :goto_a

    :catch_3
    move-exception v0

    :goto_9
    move-object v3, v0

    const/4 v14, 0x0

    goto/16 :goto_19

    :pswitch_3
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    move-object/from16 v0, p1

    goto/16 :goto_10

    :cond_c
    :goto_a
    move-object v7, v9

    goto/16 :goto_1a

    :pswitch_4
    :try_start_7
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    goto :goto_a

    :catch_4
    move-exception v0

    move-object v13, v0

    const/4 v14, 0x0

    goto/16 :goto_17

    :pswitch_5
    :try_start_8
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3

    move-object/from16 v0, p1

    goto :goto_b

    :pswitch_6
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    :try_start_9
    sget-object v0, Lm0;->a:Lm0;

    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-wide v16, -0x5a28fffff835L

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    sget-object v5, LEA;->a:LEA;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, LEA;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v5}, Lm0;->c(Landroid/content/Context;Ljava/lang/String;)Ll0;

    move-result-object v0

    sget-object v3, LNs;->a:LNs;

    iget-object v5, v0, Ll0;->a:Ljava/lang/String;

    iget-object v0, v0, Ll0;->c:Ljava/lang/String;

    iput v13, v6, LW4;->f:I

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v14, v5, v0, v6}, LNs;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LOz;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_d

    goto/16 :goto_1a

    :cond_d
    :goto_b
    check-cast v0, Ljava/lang/String;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_a

    :try_start_a
    sget-object v3, Lzm;->a:LAm;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lio/github/cherrywechat/network/model/ApiResponse;->Companion:Lio/github/cherrywechat/network/model/ApiResponse$Companion;

    sget-object v16, Lio/github/cherrywechat/network/model/DownloadTokenData;->Companion:Lio/github/cherrywechat/network/model/DownloadTokenData$Companion;

    invoke-virtual/range {v16 .. v16}, Lio/github/cherrywechat/network/model/DownloadTokenData$Companion;->serializer()LQm;

    move-result-object v15

    invoke-virtual {v5, v15}, Lio/github/cherrywechat/network/model/ApiResponse$Companion;->serializer(LQm;)LQm;

    move-result-object v5

    check-cast v5, LQm;

    invoke-virtual {v3, v5, v0}, Lmm;->a(LQm;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_5

    goto :goto_c

    :catch_5
    move-exception v0

    const-wide v15, -0x5a38fffff835L

    :try_start_b
    invoke-static/range {v15 .. v16}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v4}, LJv;->a(Ljava/lang/Class;)LF9;

    move-result-object v3

    invoke-virtual {v3}, LF9;->b()Ljava/lang/String;

    const-wide v3, -0x5ad3fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    const/4 v0, 0x0

    :goto_c
    check-cast v0, Lio/github/cherrywechat/network/model/ApiResponse;
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_8

    if-eqz v0, :cond_14

    :try_start_c
    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getCode()I

    move-result v3

    if-eqz v3, :cond_e

    goto/16 :goto_12

    :cond_e
    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/github/cherrywechat/network/model/DownloadTokenData;

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/DownloadTokenData;->getToken()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_f

    goto :goto_e

    :cond_f
    :goto_d
    move-object v2, v0

    goto :goto_f

    :cond_10
    :goto_e
    const-wide v2, -0x5adcfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_4

    goto :goto_d

    :goto_f
    :try_start_d
    sget-object v0, LNs;->a:LNs;

    sget-object v1, LEA;->a:LEA;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, LEA;->c:Ljava/lang/String;

    iget-wide v3, v8, LDA;->e:J

    new-instance v5, LV9;

    invoke-direct {v5, v11, v13}, LV9;-><init>(Lqe;I)V

    const/4 v13, 0x4

    iput v13, v6, LW4;->f:I

    invoke-virtual/range {v0 .. v6}, LNs;->b(Ljava/lang/String;Ljava/lang/String;JLfj;LFb;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_11

    goto/16 :goto_1a

    :cond_11
    :goto_10
    check-cast v0, [B

    new-instance v1, Ljava/io/File;

    sget-object v2, LEA;->a:LEA;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v14}, LEA;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_13

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_11

    :cond_12
    new-instance v0, Ljava/lang/Exception;

    const-wide v1, -0x5addfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_13
    :goto_11
    new-instance v1, Ljava/io/File;

    invoke-static {v14}, LEA;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_3

    :try_start_e
    invoke-virtual {v2, v0}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    :try_start_f
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x5ae6fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v0}, Lio/github/cherrywechat/theme/ThemeProvider;->extractThemeFiles(Ljava/lang/String;)Z

    sget-object v0, Lhe;->a:Lhd;

    sget-object v13, LZp;->a:Lnk;

    new-instance v0, LMg;

    move-object v5, v10

    check-cast v5, LEC;
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_3

    const/4 v1, 0x0

    move-object v4, v8

    move-object v2, v11

    move-object v3, v12

    :try_start_10
    invoke-direct/range {v0 .. v5}, LMg;-><init>(LEb;Lqe;LOg;LDA;LEC;)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_6

    const/4 v1, 0x5

    :try_start_11
    iput v1, v6, LW4;->f:I

    invoke-static {v13, v0, v6}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v0
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_3

    if-ne v0, v7, :cond_c

    goto/16 :goto_1a

    :catch_6
    move-exception v0

    move-object v11, v2

    move-object v12, v3

    goto/16 :goto_9

    :catchall_1
    move-exception v0

    move-object v1, v0

    :try_start_12
    throw v1
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    :catchall_2
    move-exception v0

    :try_start_13
    invoke-static {v2, v1}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_3

    :cond_14
    :goto_12
    if-eqz v0, :cond_17

    :try_start_14
    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getMessage()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_17

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_15

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getMsg()Ljava/lang/String;

    move-result-object v3
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_4

    :cond_15
    if-nez v3, :cond_16

    goto :goto_14

    :cond_16
    :goto_13
    move-object v13, v3

    goto :goto_15

    :cond_17
    :goto_14
    const-wide v3, -0x5ad7fffff835L

    :try_start_15
    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    goto :goto_13

    :goto_15
    sget-object v0, Lhe;->a:Lhd;

    sget-object v0, LZp;->a:Lnk;

    new-instance v10, LZ9;
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_8

    const/4 v15, 0x1

    const/4 v14, 0x0

    :try_start_16
    invoke-direct/range {v10 .. v15}, LZ9;-><init>(Lqe;Landroid/view/View;Ljava/lang/String;LEb;I)V

    iput v2, v6, LW4;->f:I

    invoke-static {v0, v10, v6}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v0
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_7

    if-ne v0, v7, :cond_c

    goto :goto_1a

    :catch_7
    move-exception v0

    :goto_16
    move-object v13, v0

    goto :goto_17

    :catch_8
    move-exception v0

    const/4 v14, 0x0

    goto :goto_16

    :goto_17
    :try_start_17
    sget-object v0, Lhe;->a:Lhd;

    sget-object v0, LZp;->a:Lnk;

    new-instance v10, LNg;

    const/4 v15, 0x1

    invoke-direct/range {v10 .. v15}, LNg;-><init>(Lqe;LOg;Ljava/lang/Exception;LEb;I)V

    iput v1, v6, LW4;->f:I

    invoke-static {v0, v10, v6}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v0
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_9

    if-ne v0, v7, :cond_c

    goto :goto_1a

    :catch_9
    move-exception v0

    :goto_18
    move-object v3, v0

    goto :goto_19

    :catch_a
    move-exception v0

    const/4 v14, 0x0

    goto :goto_18

    :goto_19
    sget-object v0, Lhe;->a:Lhd;

    sget-object v8, LZp;->a:Lnk;

    new-instance v0, LNg;

    const/4 v5, 0x0

    move-object v1, v11

    move-object v2, v12

    move-object v4, v14

    invoke-direct/range {v0 .. v5}, LNg;-><init>(Lqe;LOg;Ljava/lang/Exception;LEb;I)V

    const/4 v1, 0x6

    iput v1, v6, LW4;->f:I

    invoke-static {v8, v0, v6}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_c

    :goto_1a
    return-object v7

    :pswitch_7
    move-object v15, v3

    check-cast v15, Lfj;

    iget v0, v6, LW4;->f:I

    if-eqz v0, :cond_1b

    if-eq v0, v13, :cond_1a

    if-eq v0, v2, :cond_19

    if-ne v0, v1, :cond_18

    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_25

    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    const-wide v1, -0x163bafffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    :try_start_18
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_23

    :catch_b
    move-exception v0

    goto/16 :goto_24

    :cond_1a
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_b

    move-object/from16 v0, p1

    goto :goto_1b

    :cond_1b
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    :try_start_19
    sget-object v0, LNs;->a:LNs;

    check-cast v11, Ljava/lang/String;

    check-cast v10, Ll0;

    iget-object v3, v10, Ll0;->c:Ljava/lang/String;

    iput v13, v6, LW4;->f:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v11, v3, v6}, LNs;->a(Ljava/lang/String;Ljava/lang/String;LOz;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_1c

    goto/16 :goto_27

    :cond_1c
    :goto_1b
    move-object v13, v0

    check-cast v13, Ljava/lang/String;
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_b

    :try_start_1a
    sget-object v0, Lzm;->a:LAm;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lio/github/cherrywechat/network/model/ApiResponse;->Companion:Lio/github/cherrywechat/network/model/ApiResponse$Companion;

    sget-object v10, LVC;->b:LVC;

    invoke-virtual {v3, v10}, Lio/github/cherrywechat/network/model/ApiResponse$Companion;->serializer(LQm;)LQm;

    move-result-object v3

    check-cast v3, LQm;

    invoke-virtual {v0, v3, v13}, Lmm;->a(LQm;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_c

    goto :goto_1c

    :catch_c
    move-exception v0

    const-wide v10, -0x163fcfffff835L

    :try_start_1b
    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v4}, LJv;->a(Ljava/lang/Class;)LF9;

    move-result-object v3

    invoke-virtual {v3}, LF9;->b()Ljava/lang/String;

    const-wide v3, -0x16397fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-object v0, v5

    :goto_1c
    check-cast v0, Lio/github/cherrywechat/network/model/ApiResponse;

    if-eqz v0, :cond_1d

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getCode()I

    move-result v3

    :goto_1d
    move v11, v3

    goto :goto_1e

    :cond_1d
    const/4 v3, -0x1

    goto :goto_1d

    :goto_1e
    if-eqz v0, :cond_20

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_20

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_1e

    goto :goto_1f

    :cond_1e
    move-object v0, v5

    :goto_1f
    if-nez v0, :cond_1f

    goto :goto_21

    :cond_1f
    :goto_20
    move-object v14, v0

    goto :goto_22

    :cond_20
    :goto_21
    const-wide v3, -0x1639bfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_20

    :goto_22
    sget-object v0, Lhe;->a:Lhd;

    sget-object v0, LZp;->a:Lnk;

    new-instance v10, LW4;

    check-cast v12, Lfj;

    const/16 v16, 0x0

    invoke-direct/range {v10 .. v16}, LW4;-><init>(ILfj;Ljava/lang/String;Ljava/lang/String;Lfj;LEb;)V

    iput v2, v6, LW4;->f:I

    invoke-static {v0, v10, v6}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_21

    goto :goto_27

    :cond_21
    :goto_23
    check-cast v0, LTC;
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_b

    goto :goto_26

    :goto_24
    const-wide v2, -0x163a0fffff835L

    const-wide v10, -0x163b1fffff835L

    invoke-static {v2, v3, v10, v11, v0}, LEy;->i(JJLjava/lang/Exception;)V

    sget-object v2, Lhe;->a:Lhd;

    sget-object v2, LZp;->a:Lnk;

    new-instance v3, LX4;

    invoke-direct {v3, v15, v0, v5, v8}, LX4;-><init>(Ljava/lang/Object;Ljava/lang/Object;LEb;I)V

    iput v1, v6, LW4;->f:I

    invoke-static {v2, v3, v6}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_22

    goto :goto_27

    :cond_22
    :goto_25
    check-cast v0, LTC;

    :goto_26
    move-object v7, v9

    :goto_27
    return-object v7

    :pswitch_8
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    iget v0, v6, LW4;->f:I

    if-nez v0, :cond_23

    const-wide v0, -0x16361fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x16372fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sput-boolean v8, LY4;->b:Z

    check-cast v12, Lfj;

    if-eqz v12, :cond_24

    check-cast v11, Ljava/lang/String;

    invoke-interface {v12, v11}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_28
    move-object v5, v9

    goto :goto_29

    :cond_23
    const-wide v0, -0x16379fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1630afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    check-cast v10, Ljava/lang/String;

    sput-boolean v8, LY4;->b:Z

    check-cast v3, Lfj;

    if-eqz v3, :cond_24

    invoke-interface {v3, v10}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_28

    :cond_24
    :goto_29
    return-object v5

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
