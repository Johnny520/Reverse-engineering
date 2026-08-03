.class public final Lfq;
.super LOz;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic e:I

.field public f:I

.field public final synthetic g:Ljq;


# direct methods
.method public synthetic constructor <init>(Ljq;LEb;I)V
    .locals 0

    iput p3, p0, Lfq;->e:I

    iput-object p1, p0, Lfq;->g:Ljq;

    invoke-direct {p0, p2}, LOz;-><init>(LEb;)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lfq;->e:I

    check-cast p1, Lfc;

    check-cast p2, LEb;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p2, p1}, Lfq;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, Lfq;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, Lfq;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lfq;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, Lfq;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, Lfq;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(LEb;Ljava/lang/Object;)LEb;
    .locals 2

    iget p2, p0, Lfq;->e:I

    packed-switch p2, :pswitch_data_0

    new-instance p2, Lfq;

    iget-object v0, p0, Lfq;->g:Ljq;

    const/4 v1, 0x1

    invoke-direct {p2, v0, p1, v1}, Lfq;-><init>(Ljq;LEb;I)V

    return-object p2

    :pswitch_0
    new-instance p2, Lfq;

    iget-object v0, p0, Lfq;->g:Ljq;

    const/4 v1, 0x0

    invoke-direct {p2, v0, p1, v1}, Lfq;-><init>(Ljq;LEb;I)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lfq;->e:I

    sget-object v1, LTC;->a:LTC;

    const/4 v2, 0x0

    sget-object v3, Lgc;->a:Lgc;

    iget-object v4, p0, Lfq;->g:Ljq;

    const/4 v5, 0x1

    const/4 v6, 0x0

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lfq;->f:I

    const/16 v7, 0x8

    if-eqz v0, :cond_1

    if-ne v0, v5, :cond_0

    :try_start_0
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-wide v0, -0x2e063fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    :try_start_1
    sget-object p1, LNs;->a:LNs;

    iput v5, p0, Lfq;->f:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v8, -0x16c67fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, LNs;->e(Ljava/lang/String;LEb;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_2

    move-object v1, v3

    goto :goto_3

    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/String;

    invoke-static {v4, p1}, Ljq;->a(Ljq;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    iput-object p1, v4, Ljq;->a:Ljava/util/List;

    iget-object p1, v4, Ljq;->b:Lcom/youth/banner/Banner;

    if-nez p1, :cond_3

    const-wide v8, -0x2ef86fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-object p1, v6

    :cond_3
    iget-object v0, v4, Ljq;->a:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/youth/banner/Banner;->setDatas(Ljava/util/List;)Lcom/youth/banner/Banner;

    iget-object p1, v4, Ljq;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, v4, Ljq;->c:Landroid/widget/LinearLayout;

    if-nez p1, :cond_4

    const-wide v8, -0x2ef8dfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-object p1, v6

    :cond_4
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    :cond_5
    iget-object p1, v4, Ljq;->c:Landroid/widget/LinearLayout;

    if-nez p1, :cond_6

    const-wide v2, -0x2ef98fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-object p1, v6

    :cond_6
    invoke-virtual {p1, v7}, Landroid/view/View;->setVisibility(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    iget-object p1, v4, Ljq;->c:Landroid/widget/LinearLayout;

    if-nez p1, :cond_7

    const-wide v2, -0x2e058fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    goto :goto_2

    :cond_7
    move-object v6, p1

    :goto_2
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    :goto_3
    return-object v1

    :pswitch_0
    iget v0, p0, Lfq;->f:I

    if-eqz v0, :cond_9

    if-ne v0, v5, :cond_8

    :try_start_2
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_4

    :catch_1
    move-exception p1

    goto/16 :goto_b

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-wide v0, -0x2e1a8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    :try_start_3
    sget-object p1, LNs;->a:LNs;

    iput v5, p0, Lfq;->f:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v7, -0x16c05fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, LNs;->e(Ljava/lang/String;LEb;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_a

    move-object v1, v3

    goto/16 :goto_c

    :cond_a
    :goto_4
    check-cast p1, Ljava/lang/String;

    invoke-static {v4, p1}, Ljq;->e(Ljq;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Ldq;

    iget-object v7, v7, Ldq;->a:Ljava/lang/String;

    const-wide v8, -0x2e1cbfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_b

    move-object v6, v3

    :cond_c
    check-cast v6, Ldq;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_d
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Ldq;

    iget-object v7, v7, Ldq;->a:Ljava/lang/String;

    const-wide v8, -0x2e1e0fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_d

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_e
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_f
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Ldq;

    iget-object v8, v7, Ldq;->g:Ljava/lang/String;

    const-wide v9, -0x2e1f5fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_10

    move v7, v5

    goto :goto_7

    :cond_10
    const-wide v9, -0x2e1f9fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_11

    iget-object v7, v7, Ldq;->h:Ljava/util/List;

    invoke-static {}, Lgf;->I()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_7

    :cond_11
    move v7, v2

    :goto_7
    if-eqz v7, :cond_f

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_13
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Ldq;

    iget-boolean v8, v7, Ldq;->f:Z

    if-eqz v8, :cond_15

    sget-object v8, LNx;->a:Landroid/content/SharedPreferences;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v9, -0x2e1fefffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, v7, Ldq;->a:Ljava/lang/String;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v9, -0x2e18cfffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v2}, LNx;->a(Ljava/lang/String;Z)Z

    move-result v7

    if-nez v7, :cond_14

    goto :goto_9

    :cond_14
    move v7, v2

    goto :goto_a

    :cond_15
    :goto_9
    move v7, v5

    :goto_a
    if-eqz v7, :cond_13

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_16
    if-eqz v6, :cond_17

    sget-object p1, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v7, -0x2e193fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, LNx;->a(Ljava/lang/String;Z)Z

    move-result p1

    if-nez p1, :cond_17

    new-instance p1, Lf;

    const/4 v2, 0x7

    invoke-direct {p1, v2, v0, v4}, Lf;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4, v6, p1}, Ljq;->f(Ljq;Ldq;Lf;)V

    goto :goto_c

    :cond_17
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_19

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_18

    goto :goto_c

    :cond_18
    invoke-virtual {v4, v0, v2}, Ljq;->l(Ljava/util/ArrayList;I)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_c

    :goto_b
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_19
    :goto_c
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
