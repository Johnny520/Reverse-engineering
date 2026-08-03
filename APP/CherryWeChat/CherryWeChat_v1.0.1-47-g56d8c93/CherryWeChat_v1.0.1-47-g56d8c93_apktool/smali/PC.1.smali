.class public final LPC;
.super LOz;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic e:I

.field public f:I

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:LQC;


# direct methods
.method public constructor <init>(ILQC;Ljava/lang/String;LEb;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LPC;->e:I

    .line 1
    iput p1, p0, LPC;->f:I

    iput-object p2, p0, LPC;->h:LQC;

    iput-object p3, p0, LPC;->g:Ljava/lang/String;

    invoke-direct {p0, p4}, LOz;-><init>(LEb;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LQC;LEb;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LPC;->e:I

    .line 2
    iput-object p1, p0, LPC;->g:Ljava/lang/String;

    iput-object p2, p0, LPC;->h:LQC;

    invoke-direct {p0, p3}, LOz;-><init>(LEb;)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, LPC;->e:I

    check-cast p1, Lfc;

    check-cast p2, LEb;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p2, p1}, LPC;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LPC;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LPC;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p2, p1}, LPC;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LPC;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LPC;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(LEb;Ljava/lang/Object;)LEb;
    .locals 3

    iget p2, p0, LPC;->e:I

    packed-switch p2, :pswitch_data_0

    new-instance p2, LPC;

    iget-object v0, p0, LPC;->g:Ljava/lang/String;

    iget-object v1, p0, LPC;->h:LQC;

    invoke-direct {p2, v0, v1, p1}, LPC;-><init>(Ljava/lang/String;LQC;LEb;)V

    return-object p2

    :pswitch_0
    new-instance p2, LPC;

    iget v0, p0, LPC;->f:I

    iget-object v1, p0, LPC;->h:LQC;

    iget-object v2, p0, LPC;->g:Ljava/lang/String;

    invoke-direct {p2, v0, v1, v2, p1}, LPC;-><init>(ILQC;Ljava/lang/String;LEb;)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, LPC;->e:I

    sget-object v1, LTC;->a:LTC;

    iget-object v2, p0, LPC;->g:Ljava/lang/String;

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x3

    iget-object v6, p0, LPC;->h:LQC;

    packed-switch v0, :pswitch_data_0

    iget v0, p0, LPC;->f:I

    const/4 v7, 0x0

    sget-object v8, Lgc;->a:Lgc;

    if-eqz v0, :cond_3

    if-eq v0, v3, :cond_2

    if-eq v0, v4, :cond_1

    if-ne v0, v5, :cond_0

    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-wide v0, -0x1b823fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :try_start_0
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    goto/16 :goto_5

    :catch_0
    move-exception p1

    goto/16 :goto_3

    :cond_2
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_3
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    :try_start_1
    sget-object p1, LNs;->a:LNs;

    invoke-static {}, Lgf;->I()Ljava/lang/String;

    move-result-object v0

    iput v3, p0, LPC;->f:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v0}, LNs;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-ne p1, v8, :cond_4

    goto/16 :goto_4

    :cond_4
    :goto_0
    check-cast p1, Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    sget-object v0, Lzm;->a:LAm;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lio/github/cherrywechat/network/model/ApiResponse;->Companion:Lio/github/cherrywechat/network/model/ApiResponse$Companion;

    sget-object v3, LVC;->b:LVC;

    invoke-virtual {v2, v3}, Lio/github/cherrywechat/network/model/ApiResponse$Companion;->serializer(LQm;)LQm;

    move-result-object v2

    check-cast v2, LQm;

    invoke-virtual {v0, v2, p1}, Lmm;->a(LQm;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    const-wide v2, -0x1b87ffffff835L

    :try_start_3
    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-class v0, Lio/github/cherrywechat/network/model/ApiResponse;

    invoke-static {v0}, LJv;->a(Ljava/lang/Class;)LF9;

    move-result-object v0

    invoke-virtual {v0}, LF9;->b()Ljava/lang/String;

    const-wide v2, -0x1b81afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-object p1, v7

    :goto_1
    check-cast p1, Lio/github/cherrywechat/network/model/ApiResponse;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lio/github/cherrywechat/network/model/ApiResponse;->getCode()I

    move-result v0

    goto :goto_2

    :cond_5
    const/4 v0, -0x1

    :goto_2
    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lio/github/cherrywechat/network/model/ApiResponse;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_6

    invoke-virtual {p1}, Lio/github/cherrywechat/network/model/ApiResponse;->getMsg()Ljava/lang/String;

    move-result-object v2

    :cond_6
    if-nez v2, :cond_8

    :cond_7
    const-wide v2, -0x1b81efffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    :cond_8
    sget-object p1, Lhe;->a:Lhd;

    sget-object p1, LZp;->a:Lnk;

    new-instance v3, LPC;

    invoke-direct {v3, v0, v6, v2, v7}, LPC;-><init>(ILQC;Ljava/lang/String;LEb;)V

    iput v4, p0, LPC;->f:I

    invoke-static {p1, v3, p0}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    if-ne p1, v8, :cond_9

    goto :goto_4

    :goto_3
    sget-object v0, Lhe;->a:Lhd;

    sget-object v0, LZp;->a:Lnk;

    new-instance v2, LX4;

    const/4 v3, 0x6

    invoke-direct {v2, v6, p1, v7, v3}, LX4;-><init>(Ljava/lang/Object;Ljava/lang/Object;LEb;I)V

    iput v5, p0, LPC;->f:I

    invoke-static {v0, v2, p0}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v8, :cond_9

    :goto_4
    move-object v1, v8

    :cond_9
    :goto_5
    return-object v1

    :pswitch_0
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    iget p1, p0, LPC;->f:I

    if-nez p1, :cond_a

    invoke-virtual {v6}, LQC;->f()Landroid/app/Activity;

    move-result-object p1

    const-wide v7, -0x1b9f7fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    sget-object p1, LY4;->a:LY4;

    invoke-virtual {v6}, LQC;->f()Landroid/app/Activity;

    move-result-object v0

    new-instance v2, LNC;

    invoke-direct {v2, v6, v4}, LNC;-><init>(LQC;I)V

    new-instance v4, LNC;

    invoke-direct {v4, v6, v5}, LNC;-><init>(LQC;I)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v2, v4, v3}, LY4;->a(Landroid/content/Context;Lfj;Lfj;Z)V

    goto :goto_6

    :cond_a
    invoke-virtual {v6}, LQC;->f()Landroid/app/Activity;

    move-result-object p1

    const-wide v4, -0x1b9fffffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :goto_6
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
