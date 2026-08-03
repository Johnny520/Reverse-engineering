.class public final Lga;
.super LOz;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic e:I

.field public f:I

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Landroid/app/Activity;

.field public final synthetic i:Lha;


# direct methods
.method public constructor <init>(ILandroid/app/Activity;Ljava/lang/String;Lha;LEb;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lga;->e:I

    .line 1
    iput p1, p0, Lga;->f:I

    iput-object p2, p0, Lga;->h:Landroid/app/Activity;

    iput-object p3, p0, Lga;->g:Ljava/lang/String;

    iput-object p4, p0, Lga;->i:Lha;

    invoke-direct {p0, p5}, LOz;-><init>(LEb;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/app/Activity;Lha;LEb;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lga;->e:I

    .line 2
    iput-object p1, p0, Lga;->g:Ljava/lang/String;

    iput-object p2, p0, Lga;->h:Landroid/app/Activity;

    iput-object p3, p0, Lga;->i:Lha;

    invoke-direct {p0, p4}, LOz;-><init>(LEb;)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lga;->e:I

    check-cast p1, Lfc;

    check-cast p2, LEb;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p2, p1}, Lga;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, Lga;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, Lga;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lga;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, Lga;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, Lga;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(LEb;Ljava/lang/Object;)LEb;
    .locals 9

    iget p2, p0, Lga;->e:I

    packed-switch p2, :pswitch_data_0

    new-instance p2, Lga;

    iget-object v0, p0, Lga;->h:Landroid/app/Activity;

    iget-object v1, p0, Lga;->i:Lha;

    iget-object v2, p0, Lga;->g:Ljava/lang/String;

    invoke-direct {p2, v2, v0, v1, p1}, Lga;-><init>(Ljava/lang/String;Landroid/app/Activity;Lha;LEb;)V

    return-object p2

    :pswitch_0
    new-instance v3, Lga;

    iget v4, p0, Lga;->f:I

    iget-object v6, p0, Lga;->g:Ljava/lang/String;

    iget-object v7, p0, Lga;->i:Lha;

    iget-object v5, p0, Lga;->h:Landroid/app/Activity;

    move-object v8, p1

    invoke-direct/range {v3 .. v8}, Lga;-><init>(ILandroid/app/Activity;Ljava/lang/String;Lha;LEb;)V

    return-object v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v1, p0

    iget v0, v1, Lga;->e:I

    sget-object v2, LTC;->a:LTC;

    iget-object v3, v1, Lga;->h:Landroid/app/Activity;

    iget-object v4, v1, Lga;->g:Ljava/lang/String;

    const/4 v5, 0x1

    packed-switch v0, :pswitch_data_0

    iget v0, v1, Lga;->f:I

    const/4 v6, 0x2

    const/4 v7, 0x3

    const/4 v8, 0x0

    sget-object v9, Lgc;->a:Lgc;

    if-eqz v0, :cond_3

    if-eq v0, v5, :cond_2

    if-eq v0, v6, :cond_1

    if-ne v0, v7, :cond_0

    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-wide v2, -0x508efffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :try_start_0
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    goto/16 :goto_9

    :catch_0
    move-exception v0

    goto/16 :goto_7

    :cond_2
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v0, p1

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    :try_start_1
    sget-object v0, LNs;->a:LNs;

    invoke-static {}, Lgf;->I()Ljava/lang/String;

    move-result-object v10

    iput v5, v1, Lga;->f:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v10}, LNs;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-ne v0, v9, :cond_4

    goto/16 :goto_8

    :cond_4
    :goto_0
    check-cast v0, Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    sget-object v4, Lzm;->a:LAm;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lio/github/cherrywechat/network/model/ApiResponse;->Companion:Lio/github/cherrywechat/network/model/ApiResponse$Companion;

    sget-object v10, LVC;->b:LVC;

    invoke-virtual {v5, v10}, Lio/github/cherrywechat/network/model/ApiResponse$Companion;->serializer(LQm;)LQm;

    move-result-object v5

    check-cast v5, LQm;

    invoke-virtual {v4, v5, v0}, Lmm;->a(LQm;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    const-wide v4, -0x50eafffff835L

    :try_start_3
    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const-class v4, Lio/github/cherrywechat/network/model/ApiResponse;

    invoke-static {v4}, LJv;->a(Ljava/lang/Class;)LF9;

    move-result-object v4

    invoke-virtual {v4}, LF9;->b()Ljava/lang/String;

    const-wide v4, -0x5085fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-object v0, v8

    :goto_1
    check-cast v0, Lio/github/cherrywechat/network/model/ApiResponse;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getCode()I

    move-result v4

    :goto_2
    move v11, v4

    goto :goto_3

    :cond_5
    const/4 v4, -0x1

    goto :goto_2

    :goto_3
    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getMessage()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_8

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_6

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getMsg()Ljava/lang/String;

    move-result-object v4

    :cond_6
    if-nez v4, :cond_7

    goto :goto_5

    :cond_7
    :goto_4
    move-object v13, v4

    goto :goto_6

    :cond_8
    :goto_5
    const-wide v4, -0x5089fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    goto :goto_4

    :goto_6
    sget-object v0, Lhe;->a:Lhd;

    sget-object v0, LZp;->a:Lnk;

    new-instance v10, Lga;

    iget-object v12, v1, Lga;->h:Landroid/app/Activity;

    iget-object v14, v1, Lga;->i:Lha;

    const/4 v15, 0x0

    invoke-direct/range {v10 .. v15}, Lga;-><init>(ILandroid/app/Activity;Ljava/lang/String;Lha;LEb;)V

    iput v6, v1, Lga;->f:I

    invoke-static {v0, v10, v1}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    if-ne v0, v9, :cond_9

    goto :goto_8

    :goto_7
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v4, Lhe;->a:Lhd;

    sget-object v4, LZp;->a:Lnk;

    new-instance v5, LX4;

    invoke-direct {v5, v3, v0, v8, v6}, LX4;-><init>(Ljava/lang/Object;Ljava/lang/Object;LEb;I)V

    iput v7, v1, Lga;->f:I

    invoke-static {v4, v5, v1}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_9

    :goto_8
    move-object v2, v9

    :cond_9
    :goto_9
    return-object v2

    :pswitch_0
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    iget v0, v1, Lga;->f:I

    if-nez v0, :cond_a

    const-wide v6, -0x5062fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    sget-object v0, LY4;->a:LY4;

    new-instance v4, Ls;

    iget-object v6, v1, Lga;->i:Lha;

    invoke-direct {v4, v5, v6}, Ls;-><init>(ILjava/lang/Object;)V

    new-instance v6, Lfa;

    const/4 v7, 0x0

    invoke-direct {v6, v3, v7}, Lfa;-><init>(Landroid/app/Activity;I)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v4, v6, v5}, LY4;->a(Landroid/content/Context;Lfj;Lfj;Z)V

    goto :goto_a

    :cond_a
    const-wide v6, -0x506afffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_a
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
