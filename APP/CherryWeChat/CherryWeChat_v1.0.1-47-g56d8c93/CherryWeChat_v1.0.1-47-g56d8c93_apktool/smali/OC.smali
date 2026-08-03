.class public final LOC;
.super LOz;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic e:I

.field public f:LQC;

.field public g:I

.field public final synthetic h:LQC;


# direct methods
.method public synthetic constructor <init>(LQC;LEb;I)V
    .locals 0

    iput p3, p0, LOC;->e:I

    iput-object p1, p0, LOC;->h:LQC;

    invoke-direct {p0, p2}, LOz;-><init>(LEb;)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, LOC;->e:I

    check-cast p1, Lfc;

    check-cast p2, LEb;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p2, p1}, LOC;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LOC;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LOC;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p2, p1}, LOC;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LOC;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LOC;->i(Ljava/lang/Object;)Ljava/lang/Object;

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

    iget p2, p0, LOC;->e:I

    packed-switch p2, :pswitch_data_0

    new-instance p2, LOC;

    iget-object v0, p0, LOC;->h:LQC;

    const/4 v1, 0x1

    invoke-direct {p2, v0, p1, v1}, LOC;-><init>(LQC;LEb;I)V

    return-object p2

    :pswitch_0
    new-instance p2, LOC;

    iget-object v0, p0, LOC;->h:LQC;

    const/4 v1, 0x0

    invoke-direct {p2, v0, p1, v1}, LOC;-><init>(LQC;LEb;I)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, LOC;->e:I

    sget-object v1, LTC;->a:LTC;

    sget-object v2, Lgc;->a:Lgc;

    iget-object v3, p0, LOC;->h:LQC;

    const/4 v4, 0x0

    const/4 v5, 0x1

    packed-switch v0, :pswitch_data_0

    iget v0, p0, LOC;->g:I

    if-eqz v0, :cond_1

    if-ne v0, v5, :cond_0

    iget-object v0, p0, LOC;->f:LQC;

    :try_start_0
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-wide v0, -0x1b92cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    :try_start_1
    sget-object p1, LIC;->a:LIC;

    iput-object v3, p0, LOC;->f:LQC;

    iput v5, p0, LOC;->g:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lhe;->a:Lhd;

    sget-object p1, LVc;->b:LVc;

    new-instance v0, LFC;

    const/4 v6, 0x0

    invoke-direct {v0, v5, v6}, LFC;-><init>(ILEb;)V

    invoke-static {p1, v0, p0}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_2

    move-object v1, v2

    goto :goto_2

    :cond_2
    move-object v0, v3

    :goto_0
    check-cast p1, Ljava/util/List;

    iput-object p1, v0, LQC;->m:Ljava/util/List;

    iget-object p1, v3, LQC;->e:Landroid/widget/EditText;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    :cond_3
    const-wide v5, -0x1b920fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    :cond_4
    invoke-virtual {v3, p1}, LQC;->e(Ljava/lang/String;)V

    invoke-static {v3}, LQC;->a(LQC;)V

    iget-object p1, v3, LQC;->b:LWz;

    if-eqz p1, :cond_5

    invoke-virtual {p1, v4}, LWz;->setRefreshing(Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :goto_1
    invoke-virtual {v3}, LQC;->f()Landroid/app/Activity;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v5, -0x1b921fffff835L

    invoke-static {v5, v6, v2, p1}, LEy;->c(JLjava/lang/StringBuilder;Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    iget-object p1, v3, LQC;->b:LWz;

    if-eqz p1, :cond_5

    invoke-virtual {p1, v4}, LWz;->setRefreshing(Z)V

    :cond_5
    :goto_2
    return-object v1

    :pswitch_0
    iget v0, p0, LOC;->g:I

    if-eqz v0, :cond_7

    if-ne v0, v5, :cond_6

    iget-object v0, p0, LOC;->f:LQC;

    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    goto :goto_3

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-wide v0, -0x1bafbfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    sget-object p1, LIC;->a:LIC;

    iput-object v3, p0, LOC;->f:LQC;

    iput v5, p0, LOC;->g:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, p0}, LIC;->d(ZLOz;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_8

    move-object v1, v2

    goto :goto_4

    :cond_8
    move-object v0, v3

    :goto_3
    check-cast p1, Ljava/util/List;

    iput-object p1, v0, LQC;->m:Ljava/util/List;

    iget-object p1, v3, LQC;->e:Landroid/widget/EditText;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_a

    :cond_9
    const-wide v5, -0x1bafafffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    :cond_a
    invoke-virtual {v3, p1}, LQC;->e(Ljava/lang/String;)V

    invoke-static {v3}, LQC;->a(LQC;)V

    iget-object p1, v3, LQC;->b:LWz;

    if-eqz p1, :cond_b

    invoke-virtual {p1, v4}, LWz;->setRefreshing(Z)V

    :cond_b
    :goto_4
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
